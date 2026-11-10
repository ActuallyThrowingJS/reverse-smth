import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;

/** Replays only the three identified ZKM key-runtime classes, never mod classes. */
public class RecoverMasterKeys {
  static class Site {
    String owner, method, descriptor; int index;
    long masterSeed, fallbackSeed, decryptSeed, rawKey, xorAfter;
    boolean solved; transient MethodNode body; transient AbstractInsnNode first,last;
  }
  static List<AbstractInsnNode> code(MethodNode m) {
    List<AbstractInsnNode> out=new ArrayList<>();
    for(AbstractInsnNode n:m.instructions) if(n.getOpcode()>=0) out.add(n);
    return out;
  }
  static Long constant(AbstractInsnNode n) {return n instanceof LdcInsnNode && ((LdcInsnNode)n).cst instanceof Long ? (Long)((LdcInsnNode)n).cst : null;}
  public static void main(String[] args) throws Exception {
    Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,byte[]> entries=new LinkedHashMap<>();
    try(JarFile jar=new JarFile(args[0])) {
      for(JarEntry e:Collections.list(jar.entries())) if(!e.isDirectory()) {
        byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);
        if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}
      }
    }
    ClassNode master=null;
    for(ClassNode c:classes.values()) for(MethodNode m:c.methods) if((m.access&Opcodes.ACC_STATIC)!=0 && m.desc.startsWith("(JJLjava/lang/Object;)L")) {if(master!=null && master!=c)throw new IllegalStateException("Ambiguous key runtime");master=c;}
    if(master==null)throw new IllegalStateException("No master factory");
    String iface=master.interfaces.get(0);ClassNode fallback=null;
    for(ClassNode c:classes.values())if(c!=master && c.interfaces.contains(iface)) {if(fallback!=null)throw new IllegalStateException("Ambiguous fallback");fallback=c;}
    if(fallback==null)throw new IllegalStateException("No fallback");
    Set<String> allow=Set.of(master.name,fallback.name,iface);
    for(String name:allow)for(MethodNode m:classes.get(name).methods)if((m.access&Opcodes.ACC_NATIVE)!=0)throw new IllegalStateException("Native key runtime unsupported");
    final Set<String> runtime=allow;
    try(URLClassLoader loader=new URLClassLoader(new URL[]{Path.of(args[0]).toUri().toURL()},ClassLoader.getPlatformClassLoader()) {
      protected Class<?> findClass(String name)throws ClassNotFoundException {if(!runtime.contains(name.replace('.','/')))throw new ClassNotFoundException("Out of key runtime scope: "+name);return super.findClass(name);}
    }) {
      Class<?> fallbackType=Class.forName(fallback.name.replace('/','.'),true,loader);
      Class<?> masterType=Class.forName(master.name.replace('/','.'),true,loader);
      Class<?> ifaceType=Class.forName(iface.replace('/','.'),false,loader);
      Field singletonField=fallbackType.getDeclaredField("a");singletonField.setAccessible(true);Object singleton=singletonField.get(null);
      Field registryField=fallbackType.getDeclaredField("b");registryField.setAccessible(true);Map<?,?> registry=(Map<?,?>)registryField.get(singleton);
      Method make=masterType.getDeclaredMethod("d",long.class);make.setAccessible(true);
      Method derive=masterType.getDeclaredMethod("a",long.class,long.class,Object.class);derive.setAccessible(true);
      Method decrypt=ifaceType.getDeclaredMethod("a",long.class);decrypt.setAccessible(true);
      Field child=masterType.getDeclaredField("c");child.setAccessible(true);
      Field fallbackChild=fallbackType.getDeclaredField("c");fallbackChild.setAccessible(true);
      List<Site> sites=new ArrayList<>();
      for(ClassNode c:classes.values())if(!allow.contains(c.name))for(MethodNode m:c.methods) {
        List<AbstractInsnNode> ns=code(m);
        for(int i=4;i+2<ns.size();i++)if(ns.get(i) instanceof MethodInsnNode) {
          MethodInsnNode call=(MethodInsnNode)ns.get(i);
          if(!call.owner.equals(master.name)||!call.name.equals("a")||!call.desc.startsWith("(JJLjava/lang/Object;)"))continue;
          Long a=constant(ns.get(i-4)),b=constant(ns.get(i-3)),key=constant(ns.get(i+1));
          if(a==null||b==null||key==null||!(ns.get(i-2)instanceof MethodInsnNode)||!(ns.get(i-1)instanceof MethodInsnNode)||!(ns.get(i+2)instanceof MethodInsnNode))continue;
          MethodInsnNode lookup=(MethodInsnNode)ns.get(i-2),lookupClass=(MethodInsnNode)ns.get(i-1),dec=(MethodInsnNode)ns.get(i+2);
          if(!lookup.owner.equals("java/lang/invoke/MethodHandles")||!lookup.name.equals("lookup")||!lookupClass.name.equals("lookupClass")||!dec.owner.equals(iface)||!dec.desc.equals("(J)J"))continue;
          Site s=new Site();s.owner=c.name;s.method=m.name;s.descriptor=m.desc;s.index=i;s.masterSeed=a;s.fallbackSeed=b;s.decryptSeed=key;s.body=m;s.first=ns.get(i-4);s.last=ns.get(i+2);
          if(i+4<ns.size() && constant(ns.get(i+3))!=null && ns.get(i+4).getOpcode()==Opcodes.LXOR)s.xorAfter=constant(ns.get(i+3));
          sites.add(s);
        }
      }
      if(args.length>3) {
        Site[] nativeSites=new Gson().fromJson(Files.readString(Path.of(args[3])),Site[].class);
        for(Site s:nativeSites){s.method="$jnicClinit";s.descriptor="()V";sites.add(s);}
      }
      int solved=0;
      while(true) {
        Map<Site,Object> ready=new LinkedHashMap<>();
        for(Site s:sites)if(!s.solved){Object target=registry.get(make.invoke(null,s.masterSeed));if(target!=null&&target!=singleton)ready.put(s,target);}
        if(ready.isEmpty())break;
        IdentityHashMap<Object,Set<Object>> descendants=new IdentityHashMap<>();
        for(Object target:ready.values())if(!descendants.containsKey(target)){
          Set<Object> chain=Collections.newSetFromMap(new IdentityHashMap<>());Object next=child.get(target);
          while(next!=null){if(!chain.add(next)||chain.size()>20000)throw new IllegalStateException("Cyclic child chain");next=next==singleton?fallbackChild.get(next):child.get(next);}descendants.put(target,chain);
        }
        List<Site> ordered=new ArrayList<>(ready.keySet());
        ordered.sort(Comparator.comparingInt(s->{int count=0;for(Object parent:ready.values())if(parent!=ready.get(s)&&descendants.get(parent).contains(ready.get(s)))count++;return count;}));
        int minimum=0;
        for(Site s:ordered) {
          int parents=0;for(Object parent:ready.values())if(parent!=ready.get(s)&&descendants.get(parent).contains(ready.get(s)))parents++;
          if(parents>minimum)continue;
          Object target=derive.invoke(null,s.masterSeed,s.fallbackSeed,Object.class);
          if(target!=ready.get(s))throw new IllegalStateException("Registry changed unexpectedly for "+s.owner);
          s.rawKey=(Long)decrypt.invoke(target,s.decryptSeed);s.solved=true;solved++;
        }
        System.out.println("Solved "+solved+" / "+sites.size());
      }
      Gson gson=new GsonBuilder().setPrettyPrinting().create();
      Files.writeString(Path.of(args[1]),gson.toJson(sites));
      int patched=0;
      for(Site s:sites)if(s.solved && s.body!=null) {
        s.body.instructions.insertBefore(s.first,new LdcInsnNode(s.rawKey));
        AbstractInsnNode n=s.first;
        while(true){AbstractInsnNode next=n.getNext();if(n.getOpcode()>=0)s.body.instructions.remove(n);if(n==s.last)break;n=next;}
        patched++;
      }
      try(JarOutputStream out=new JarOutputStream(Files.newOutputStream(Path.of(args[2])))) {
        for(Map.Entry<String,byte[]> e:entries.entrySet()) {
          byte[] b=e.getValue();ClassNode c=e.getKey().endsWith(".class")?classes.get(e.getKey().substring(0,e.getKey().length()-6)):null;
          if(c!=null){ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.accept(w);b=w.toByteArray();}
          out.putNextEntry(new JarEntry(e.getKey()));out.write(b);out.closeEntry();
        }
      }
      System.out.println("runtime="+allow+" sites="+sites.size()+" solved="+solved+" patched="+patched);
      System.out.println("Output is an analysis artifact; runtime behavior is not validated.");
    }
  }
}
