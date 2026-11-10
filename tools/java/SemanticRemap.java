import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.commons.*;
import com.google.gson.*;

/** Owner/descriptor-aware remapping for analysis. Native binaries stay untouched. */
public class SemanticRemap {
 static class Entry {String owner,name,descriptor,newName,evidence;}
 static class Plan {Map<String,String> classes=new LinkedHashMap<>();List<Entry> fields=new ArrayList<>(),methods=new ArrayList<>();}
 static String key(String owner,String name,String desc){return owner+'\t'+name+'\t'+desc;}
 static class Families {
  Map<String,String> parent=new LinkedHashMap<>();
  String root(String key){parent.putIfAbsent(key,key);String p=parent.get(key);if(!p.equals(key)){p=root(p);parent.put(key,p);}return p;}
  void join(String a,String b){String x=root(a),y=root(b);if(!x.equals(y))parent.put(x,y);}
 }
 static boolean virtual(MethodNode m){return !m.name.startsWith("<")&&(m.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))==0;}
 static void ancestors(String owner,Map<String,ClassNode> classes,Set<String> out){ClassNode c=classes.get(owner);if(c==null)return;List<String> ps=new ArrayList<>(c.interfaces);if(c.superName!=null)ps.add(c.superName);for(String p:ps)if(out.add(p))ancestors(p,classes,out);}
 static boolean obfuscated(String name){return name.matches("[Il]{12,}");}
 public static void main(String[] args)throws Exception {
  Gson gson=new GsonBuilder().setPrettyPrinting().create();Plan plan=gson.fromJson(Files.readString(Path.of(args[1])),Plan.class);
  Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,byte[]> entries=new LinkedHashMap<>();
  try(JarFile jar=new JarFile(args[0])) {for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){
   byte[] bytes=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),bytes);
   if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(bytes).accept(c,0);classes.put(c.name,c);}
  }
  }
  Map<String,String> fields=new HashMap<>(),methods=new HashMap<>();
  for(Entry e:plan.fields)fields.put(key(e.owner,e.name,e.descriptor),e.newName);
  for(Entry e:plan.methods)methods.put(key(e.owner,e.name,e.descriptor),e.newName);
  // Derive getter/setter names only when bytecode proves the backing field.
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(obfuscated(m.name)) {
   List<AbstractInsnNode> code=new ArrayList<>();for(AbstractInsnNode n:m.instructions)if(n.getOpcode()>=0)code.add(n);
   if(code.size()==3&&code.get(0).getOpcode()==Opcodes.ALOAD&&code.get(1)instanceof FieldInsnNode) {
    FieldInsnNode f=(FieldInsnNode)code.get(1);String property=fields.get(key(f.owner,f.name,f.desc));
    if(property!=null&&f.getOpcode()==Opcodes.GETFIELD&&m.desc.equals("()"+f.desc)){
     Entry e=new Entry();e.owner=c.name;e.name=m.name;e.descriptor=m.desc;e.newName=(f.desc.equals("Z")?"is":"get")+Character.toUpperCase(property.charAt(0))+property.substring(1);e.evidence="Exact ALOAD 0 / GETFIELD / typed RETURN getter";
     String k=key(c.name,m.name,m.desc);if(!methods.containsKey(k)){methods.put(k,e.newName);plan.methods.add(e);}
    }
   }
  }
  Families families=new Families();Map<String,MethodNode> declared=new LinkedHashMap<>();Map<String,String> owners=new HashMap<>();
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(virtual(m)){String k=key(c.name,m.name,m.desc);families.root(k);declared.put(k,m);owners.put(k,c.name);}
  for(ClassNode c:classes.values()){
   Set<String> supers=new LinkedHashSet<>();ancestors(c.name,classes,supers);
   for(MethodNode m:c.methods)if(virtual(m))for(String p:supers){String other=key(p,m.name,m.desc);if(declared.containsKey(other))families.join(key(c.name,m.name,m.desc),other);}
   // An inherited superclass implementation can satisfy an interface without
   // declaring a fresh method in this class.
   for(String p:supers){ClassNode iface=classes.get(p);if(iface==null||(iface.access&Opcodes.ACC_INTERFACE)==0)continue;for(MethodNode im:iface.methods)if(virtual(im)){
    String current=c.name;while(current!=null){String implementation=key(current,im.name,im.desc);if(declared.containsKey(implementation)){families.join(implementation,key(p,im.name,im.desc));break;}ClassNode parentType=classes.get(current);current=parentType==null?null:parentType.superName;}
   }}
  }
  Map<String,List<String>> familyMembers=new LinkedHashMap<>();for(String k:declared.keySet())familyMembers.computeIfAbsent(families.root(k),x->new ArrayList<>()).add(k);
  Map<String,Entry> planned=new LinkedHashMap<>();for(Entry e:plan.methods)planned.put(key(e.owner,e.name,e.descriptor),e);
  int overrideNamesUnified=0;
  for(List<String> group:familyMembers.values()){
   List<Entry> candidates=new ArrayList<>();for(String k:group)if(planned.containsKey(k))candidates.add(planned.get(k));if(candidates.isEmpty())continue;
   candidates.sort(Comparator.comparingInt((Entry e)->e.evidence.startsWith("Exact ALOAD")?1:0).thenComparingInt(e->{Set<String> a=new HashSet<>();ancestors(e.owner,classes,a);return a.size();}).thenComparing(e->e.owner));
   String canonical=candidates.get(0).newName;
   for(String k:group){Entry e=planned.get(k);if(e==null){String[] parts=k.split("\t",-1);e=new Entry();e.owner=parts[0];e.name=parts[1];e.descriptor=parts[2];e.evidence="Override family linked by original owner, name and descriptor";planned.put(k,e);plan.methods.add(e);}else if(!e.newName.equals(canonical))overrideNamesUnified++;
    e.newName=canonical;methods.put(k,canonical);
   }
  }
  class Names extends Remapper {
   public String map(String name){return plan.classes.getOrDefault(name,name);}
   String resolve(String owner,String name,String descriptor,boolean method,Set<String> seen){
    if(!seen.add(owner))return name;String exact=(method?methods:fields).get(key(owner,name,descriptor));if(exact!=null)return exact;
    ClassNode c=classes.get(owner);if(c==null)return name;
    if(!method){for(FieldNode f:c.fields)if(f.name.equals(name)&&f.desc.equals(descriptor))return name;}
    else for(MethodNode m:c.methods)if(m.name.equals(name)&&m.desc.equals(descriptor)&&(m.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))!=0)return name;
    List<String> parents=new ArrayList<>(c.interfaces);if(c.superName!=null)parents.add(c.superName);
    for(String p:parents){String inherited=resolve(p,name,descriptor,method,seen);if(!inherited.equals(name))return inherited;}
    return name;
   }
   public String mapFieldName(String owner,String name,String descriptor){return resolve(owner,name,descriptor,false,new HashSet<>());}
   public String mapMethodName(String owner,String name,String descriptor){if(name.startsWith("<"))return name;return resolve(owner,name,descriptor,true,new HashSet<>());}
  }
  Names names=new Names();
  for(int round=0;round<4;round++)for(ClassNode c:classes.values()){
   Map<String,List<MethodNode>> groups=new LinkedHashMap<>();for(MethodNode m:c.methods)groups.computeIfAbsent(names.mapMethodName(c.name,m.name,m.desc)+'\t'+names.mapMethodDesc(m.desc),x->new ArrayList<>()).add(m);
   for(List<MethodNode> group:groups.values())if(group.size()>1){
    boolean equivalent=true;String field=getterField(group.get(0));for(MethodNode m:group)if(field==null||!field.equals(getterField(m))||m.access!=group.get(0).access)equivalent=false;
    if(equivalent&&((c.access&Opcodes.ACC_FINAL)!=0||(group.get(0).access&Opcodes.ACC_FINAL)!=0))continue;
    for(MethodNode m:group)if(getterField(m)!=null){String k=key(c.name,m.name,m.desc);Entry match=null;for(Entry e:plan.methods)if(key(e.owner,e.name,e.descriptor).equals(k)){match=e;break;}
     if(match!=null&&match.evidence.startsWith("Exact ALOAD")){match.newName=names.mapMethodName(c.name,m.name,m.desc)+"Property";match.evidence+="; kept distinct from virtual/interface accessor to preserve dispatch";methods.put(k,match.newName);if(families.parent.containsKey(k)){for(String member:familyMembers.get(families.root(k))){methods.put(member,match.newName);Entry linked=planned.get(member);if(linked!=null)linked.newName=match.newName;}}break;}
    }
   }
  }
  Map<String,byte[]> output=new LinkedHashMap<>();int fieldDeclarations=0,methodDeclarations=0,fieldReferences=0,methodReferences=0,coalescedGetters=0;
  for(ClassNode original:classes.values()){
   for(FieldNode f:original.fields)if(!names.mapFieldName(original.name,f.name,f.desc).equals(f.name))fieldDeclarations++;
   for(MethodNode m:original.methods){
    if(!names.mapMethodName(original.name,m.name,m.desc).equals(m.name))methodDeclarations++;
    for(AbstractInsnNode n:m.instructions){if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;if(!names.mapFieldName(f.owner,f.name,f.desc).equals(f.name))fieldReferences++;}if(n instanceof MethodInsnNode){MethodInsnNode call=(MethodInsnNode)n;if(!names.mapMethodName(call.owner,call.name,call.desc).equals(call.name))methodReferences++;}}
   }
   ClassNode c=new ClassNode();original.accept(new ClassRemapper(c,names));
   Set<String> fieldSignatures=new HashSet<>(),methodSignatures=new HashSet<>();
   for(FieldNode f:c.fields)if(!fieldSignatures.add(f.name+'\t'+f.desc))throw new IllegalStateException("Field collision: "+c.name+'.'+f.name);
   Map<String,MethodNode> uniqueMethods=new LinkedHashMap<>();
   for(Iterator<MethodNode> iterator=c.methods.iterator();iterator.hasNext();){MethodNode m=iterator.next();String signature=m.name+'\t'+m.desc;MethodNode previous=uniqueMethods.putIfAbsent(signature,m);
    if(previous!=null){String a=getterField(previous),b=getterField(m);if(a!=null&&a.equals(b)&&previous.access==m.access&&((c.access&Opcodes.ACC_FINAL)!=0||(m.access&Opcodes.ACC_FINAL)!=0)){iterator.remove();coalescedGetters++;}else throw new IllegalStateException("Method collision: "+c.name+'.'+m.name+m.desc);}
   }
   ClassWriter writer=new ClassWriter(0);c.accept(writer);if(output.put(c.name+".class",writer.toByteArray())!=null)throw new IllegalStateException("Class collision: "+c.name);
  }
  int resourceRewrites=0;
  for(Map.Entry<String,byte[]> entry:entries.entrySet())if(!entry.getKey().endsWith(".class")){
   byte[] bytes=entry.getValue();
   if(entry.getKey().endsWith(".json")){
    JsonElement json=JsonParser.parseString(new String(bytes,java.nio.charset.StandardCharsets.UTF_8));String before=json.toString();rewriteJson(json,plan.classes);
    if(!json.toString().equals(before)){bytes=gson.toJson(json).getBytes(java.nio.charset.StandardCharsets.UTF_8);resourceRewrites++;}
   }
   output.put(entry.getKey(),bytes);
  }
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(Path.of(args[2])))) {for(Map.Entry<String,byte[]> entry:output.entrySet()){jar.putNextEntry(new JarEntry(entry.getKey()));jar.write(entry.getValue());jar.closeEntry();}
  }
  Files.writeString(Path.of(args[3]),gson.toJson(plan));
  Map<String,Object> report=new LinkedHashMap<>();report.put("classes",classes.size());report.put("classMappings",plan.classes.size());report.put("fieldDeclarationsRenamed",fieldDeclarations);report.put("methodDeclarationsRenamed",methodDeclarations);report.put("fieldReferencesRewritten",fieldReferences);report.put("methodReferencesRewritten",methodReferences);report.put("resourceFilesRewritten",resourceRewrites);report.put("identicalGettersCoalesced",coalescedGetters);report.put("overrideNamesUnified",overrideNamesUnified);report.put("nativeBindingsRewritten",false);report.put("artifactPurpose","source recovery analysis; not verified runnable");
  Files.writeString(Path.of(args[4]),gson.toJson(report));System.out.println(gson.toJson(report));
 }
 static String getterField(MethodNode method){List<AbstractInsnNode> ns=new ArrayList<>();for(AbstractInsnNode n:method.instructions)if(n.getOpcode()>=0)ns.add(n);if(ns.size()!=3||ns.get(0).getOpcode()!=Opcodes.ALOAD||!(ns.get(1)instanceof FieldInsnNode))return null;FieldInsnNode f=(FieldInsnNode)ns.get(1);return f.getOpcode()==Opcodes.GETFIELD?key(f.owner,f.name,f.desc):null;}
 static JsonElement string(String value,Map<String,String> classes){for(Map.Entry<String,String> e:classes.entrySet()){if(value.equals(e.getKey()))return new JsonPrimitive(e.getValue());if(value.equals(e.getKey().replace('/','.')))return new JsonPrimitive(e.getValue().replace('/','.'));}return new JsonPrimitive(value);}
 static void rewriteJson(JsonElement element,Map<String,String> classes){
  if(element.isJsonObject())for(Map.Entry<String,JsonElement> e:new ArrayList<>(element.getAsJsonObject().entrySet())){if(e.getValue().isJsonPrimitive()&&e.getValue().getAsJsonPrimitive().isString())element.getAsJsonObject().add(e.getKey(),string(e.getValue().getAsString(),classes));else rewriteJson(e.getValue(),classes);}
  else if(element.isJsonArray())for(int i=0;i<element.getAsJsonArray().size();i++){JsonElement e=element.getAsJsonArray().get(i);if(e.isJsonPrimitive()&&e.getAsJsonPrimitive().isString())element.getAsJsonArray().set(i,string(e.getAsString(),classes));else rewriteJson(e,classes);}
 }
}
