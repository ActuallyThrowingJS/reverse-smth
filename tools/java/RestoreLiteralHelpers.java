import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;
import com.zkmdeobf.MiniInterpreter;

/** Interprets narrowly allowed same-class literal helpers; never loads application classes. */
public class RestoreLiteralHelpers {
 static boolean helper(ClassNode owner,MethodNode method){
  if((method.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_NATIVE))!=(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC)||!Set.of("(IJ)I","(IJ)J","(II)Ljava/lang/String;","(III)Ljava/lang/String;").contains(method.desc))return false;
  boolean table=false;
  for(AbstractInsnNode n:method.instructions){
   if(n instanceof InvokeDynamicInsnNode)return false;
   if(n instanceof FieldInsnNode f){if(f.getOpcode()!=Opcodes.GETSTATIC||!f.owner.equals(owner.name)||!Set.of("[J","[Ljava/lang/Long;","[Ljava/lang/Integer;","[Ljava/lang/String;").contains(f.desc))return false;FieldNode field=owner.fields.stream().filter(x->x.name.equals(f.name)&&x.desc.equals(f.desc)).findFirst().orElseThrow();if((field.access&Opcodes.ACC_VOLATILE)!=0)return false;table=true;}
   if(n instanceof MethodInsnNode call){String k=call.owner+'.'+call.name+call.desc;if(!Set.of("java/lang/String.toCharArray()[C","java/lang/String.length()I","java/lang/String.charAt(I)C","java/lang/String.intern()Ljava/lang/String;","java/lang/String.<init>([C)V","java/lang/Long.valueOf(J)Ljava/lang/Long;","java/lang/Long.longValue()J","java/lang/Integer.valueOf(I)Ljava/lang/Integer;","java/lang/Integer.intValue()I").contains(k))return false;}
   if(n.getOpcode()==Opcodes.LASTORE||n.getOpcode()==Opcodes.PUTSTATIC||n.getOpcode()==Opcodes.PUTFIELD||n.getOpcode()==Opcodes.MONITORENTER||n.getOpcode()==Opcodes.MONITOREXIT)return false;
   if(n.getOpcode()==Opcodes.NEW&&!((TypeInsnNode)n).desc.equals("java/lang/String"))return false;
  }
  return table;
 }
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,byte[]> entries=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}}}
  JsonObject states=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();Map<String,Object> constants=SpecializeKeys.constants(classes);List<Map<String,Object>> records=new ArrayList<>();int rejected=0;
  for(ClassNode c:classes.values())if(c.name.startsWith(System.getProperty("recovery.literalPrefix","lol/polinexclient/loader/"))&&states.has(c.name)){
   Map<String,MethodNode> helpers=new HashMap<>();for(MethodNode m:c.methods)if(helper(c,m))helpers.put(m.name+m.desc,m);if(helpers.isEmpty())continue;
   MiniInterpreter.Ctx context=new MiniInterpreter.Ctx(classes,ClassLoader.getPlatformClassLoader(),0,new HashSet<>(),ResolveReferences.snapshotValues(c,states.getAsJsonObject(c.name)));
   for(int round=0;round<6;round++){int changed=0;for(MethodNode method:c.methods)if(!method.name.equals("<clinit>")&&!helpers.containsKey(method.name+method.desc)&&method.instructions.size()>0){Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new RestoreStrings.Constants(constants)).analyze(c.name,method);}catch(AnalyzerException ex){continue;}AbstractInsnNode[] code=method.instructions.toArray();
    for(int at=0;at<code.length;at++)if(code[at] instanceof MethodInsnNode call&&call.getOpcode()==Opcodes.INVOKESTATIC&&call.owner.equals(c.name)&&frames[at]!=null){MethodNode target=helpers.get(call.name+call.desc);if(target==null)continue;Type[] types=Type.getArgumentTypes(call.desc);Frame<RestoreStrings.V> frame=frames[at];Object[] values=new Object[types.length];boolean known=true;for(int i=0;i<types.length;i++){Object v=frame.getStack(frame.getStackSize()-types.length+i).value;known&=types[i].equals(Type.LONG_TYPE)?v instanceof Long:v instanceof Integer;values[i]=v;}if(!known)continue;
     Object value;try{value=MiniInterpreter.run(context,c,target,values);Type returned=Type.getReturnType(call.desc);if(returned.equals(Type.LONG_TYPE)?!(value instanceof Long):returned.equals(Type.INT_TYPE)?!(value instanceof Integer):!(value instanceof String))continue;}catch(Throwable ex){rejected++;continue;}
     boolean removed=types.length==2&&RestoreStrings.removePureArguments(method,code,frames,at,c.name,constants);InsnList replacement=new InsnList();if(!removed)for(int i=types.length-1;i>=0;i--)replacement.add(new InsnNode(types[i].getSize()==2?Opcodes.POP2:Opcodes.POP));replacement.add(new LdcInsnNode(value));method.instructions.insertBefore(call,replacement);method.instructions.remove(call);changed++;records.add(Map.of("owner",c.name,"method",method.name,"descriptor",method.desc,"helper",target.name+target.desc,"arguments",Arrays.asList(values),"literal",value,"evidence","Constant call arguments; allowlisted same-class private table helper interpreted from bytecode; captured state; helper/cache infrastructure retained"));
    }
   }if(changed==0)break;}
  }
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(m.instructions.size()>0)new Analyzer<>(new BasicVerifier()).analyze(c.name,m);
  try(JarOutputStream out=new JarOutputStream(Files.newOutputStream(Path.of(args[2])))){for(var e:entries.entrySet()){byte[] b=e.getValue();if(e.getKey().endsWith(".class")){ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);classes.get(e.getKey().substring(0,e.getKey().length()-6)).accept(w);b=w.toByteArray();}out.putNextEntry(new JarEntry(e.getKey()));out.write(b);out.closeEntry();}}
  Files.writeString(Path.of(args[3]),new GsonBuilder().setPrettyPrinting().create().toJson(records));System.out.println("Restored interpreted literal sites="+records.size()+" rejected evaluations="+rejected+"; decoding evidence, not full application initialization");
 }
}
