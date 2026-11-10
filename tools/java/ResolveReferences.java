import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;
import com.zkmdeobf.MiniInterpreter;

/** Decodes ZKM member records without loading application classes. */
public class ResolveReferences {
 static final Map<String,String> PRIMITIVES=Map.of("boolean","Z","byte","B","char","C","short","S","int","I","long","J","float","F","double","D","void","V");
 static class Target {String owner,name,descriptor;boolean field,isStatic,isInterface;int access,classAccess;}
 static Map<String,Object> snapshotValues(ClassNode c,JsonObject state){
  Map<String,Object> statics=new HashMap<>();for(FieldNode f:c.fields)if(state.has(f.name)){
    JsonElement e=state.get(f.name);Object value=null;
    if(e.isJsonArray()){
     if(f.desc.equals("[J")){long[] values=new long[e.getAsJsonArray().size()];for(int i=0;i<values.length;i++)values[i]=e.getAsJsonArray().get(i).getAsLong();value=new MiniInterpreter.Arr(values);}
     else {Object[] values=new Object[e.getAsJsonArray().size()];for(int i=0;i<values.length;i++){JsonElement x=e.getAsJsonArray().get(i);if(x.isJsonNull())values[i]=null;else if(x.isJsonObject()&&x.getAsJsonObject().has("class")){String name=x.getAsJsonObject().get("class").getAsString();values[i]=switch(name){case "boolean"->boolean.class;case "byte"->byte.class;case "char"->char.class;case "short"->short.class;case "int"->int.class;case "long"->long.class;case "float"->float.class;case "double"->double.class;case "void"->void.class;default->null;};}else if(x.isJsonPrimitive()){if(f.desc.equals("[Ljava/lang/Long;"))values[i]=Long.valueOf(x.getAsLong());else if(f.desc.equals("[Ljava/lang/Integer;"))values[i]=Integer.valueOf(x.getAsInt());else values[i]=x.getAsString();}}value=new MiniInterpreter.Arr(values);}
    }else if(e.isJsonPrimitive()){if(f.desc.equals("J"))value=e.getAsLong();else if(f.desc.equals("I"))value=e.getAsInt();else if(f.desc.equals("Ljava/lang/String;"))value=e.getAsString();}
    if(value!=null)statics.put(c.name+'.'+f.name,value);
   }
  return statics;
 }
 static class Decoder {
  ClassNode owner;MethodNode index;Map<String,Object> statics;MiniInterpreter.Ctx context;String objectField,stringField;Map<String,String> classCache=new HashMap<>();
  Decoder(ClassNode c,JsonObject state,Map<String,ClassNode> classes){owner=c;
   for(MethodNode m:c.methods)if(m.desc.equals("(JJ)I")&&(m.access&Opcodes.ACC_STATIC)!=0){if(index!=null)throw new IllegalStateException("Ambiguous index decoder");index=m;}
   statics=snapshotValues(c,state);for(FieldNode f:c.fields)if(state.has(f.name)&&f.desc.equals("[Ljava/lang/Object;"))objectField=f.name;
   // The index decoder writes the decrypted member record to one String[] cache.
   for(AbstractInsnNode n:index.instructions)if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;if(f.getOpcode()==Opcodes.GETSTATIC&&f.owner.equals(c.name)&&f.desc.equals("[Ljava/lang/String;")){stringField=f.name;break;}}
   context=new MiniInterpreter.Ctx(classes,ClassLoader.getPlatformClassLoader(),0,new HashSet<>(),statics);
  }
  int index(long a,long b){return (Integer)MiniInterpreter.run(context,owner,index,new Object[]{a,b});}
  Object entry(int slot){return ((Object[])((MiniInterpreter.Arr)statics.get(owner.name+'.'+objectField)).data)[slot];}
  String record(long a,long b){int at=index(a,b);Object value=((Object[])((MiniInterpreter.Arr)statics.get(owner.name+'.'+stringField)).data)[at];if(!(value instanceof String))throw new IllegalArgumentException("No decoded record");return (String)value;}
  String classDescriptor(String encoded){if(classCache.containsKey(encoded))return classCache.get(encoded);long id=Long.parseLong(encoded,36);int slot=index(id,0);Object value=entry(slot);String descriptor;
   if(value instanceof Class)descriptor=Type.getDescriptor((Class<?>)value);
   else{Object name=((Object[])((MiniInterpreter.Arr)statics.get(owner.name+'.'+stringField)).data)[slot];if(!(name instanceof String))throw new IllegalArgumentException("Class name unavailable");String type=(String)name;descriptor=PRIMITIVES.getOrDefault(type,type.startsWith("[")?type.replace('.','/'):"L"+type.replace('.','/')+";");}
   Type.getType(descriptor);classCache.put(encoded,descriptor);return descriptor;
  }
  Target target(long a,long b,boolean field,Map<String,ClassNode> classes){String text=record(a,b);String[] tokens=text.split("\b",-1);List<String> parts=new ArrayList<>(Arrays.asList(tokens));while(!parts.isEmpty()&&parts.get(parts.size()-1).isEmpty())parts.remove(parts.size()-1);if(parts.size()<3)throw new IllegalArgumentException("Malformed member record");
   String type=classDescriptor(parts.get(0));if(!type.startsWith("L"))throw new IllegalArgumentException("Non-object owner");Target t=new Target();t.owner=type.substring(1,type.length()-1);t.name=parts.get(1);t.field=field;
   if(field){if(parts.size()!=3)throw new IllegalArgumentException("Field record shape");t.descriptor=classDescriptor(parts.get(2));}
   else{StringBuilder desc=new StringBuilder("(");for(int i=2;i<parts.size()-1;i++)desc.append(classDescriptor(parts.get(i)));desc.append(')').append(classDescriptor(parts.get(parts.size()-1)));t.descriptor=desc.toString();}
   // Verify against real declarations supplied by the input, including ancestors.
   Target proven=find(t.owner,t.name,t.descriptor,field,classes,new HashSet<>());if(proven==null)throw new IllegalArgumentException("Target declaration not supplied");return proven;
  }
 }
 static Target find(String owner,String name,String desc,boolean field,Map<String,ClassNode> classes,Set<String> seen){if(!seen.add(owner))return null;ClassNode c=classes.get(owner);if(c==null)return null;
  if(field)for(FieldNode f:c.fields)if(f.name.equals(name)&&f.desc.equals(desc)){Target t=new Target();t.owner=owner;t.name=name;t.descriptor=desc;t.field=true;t.access=f.access;t.classAccess=c.access;t.isStatic=(f.access&Opcodes.ACC_STATIC)!=0;t.isInterface=(c.access&Opcodes.ACC_INTERFACE)!=0;return t;}
  if(!field)for(MethodNode m:c.methods)if(m.name.equals(name)&&m.desc.equals(desc)){Target t=new Target();t.owner=owner;t.name=name;t.descriptor=desc;t.access=m.access;t.classAccess=c.access;t.isStatic=(m.access&Opcodes.ACC_STATIC)!=0;t.isInterface=(c.access&Opcodes.ACC_INTERFACE)!=0;return t;}
  if(c.superName!=null){Target t=find(c.superName,name,desc,field,classes,seen);if(t!=null)return t;}for(String i:c.interfaces){Target t=find(i,name,desc,field,classes,seen);if(t!=null)return t;}return null;
 }
 static String pkg(String name){int at=name.lastIndexOf('/');return at<0?"":name.substring(0,at);}
 static boolean accessible(Target target,String caller){boolean same=caller.equals(target.owner),samePackage=pkg(caller).equals(pkg(target.owner));if((target.classAccess&Opcodes.ACC_PUBLIC)==0&&!samePackage)return false;if((target.access&Opcodes.ACC_PUBLIC)!=0)return true;if((target.access&Opcodes.ACC_PRIVATE)!=0)return same;return samePackage;}
 static boolean reference(Type type){return type.getSort()==Type.OBJECT||type.getSort()==Type.ARRAY;}
 static boolean compatible(Type from,Type to){return from.equals(to)||reference(from)&&reference(to);}
 static void cast(InsnList code,Type from,Type to){if(!from.equals(to)&&reference(to)&&!to.equals(Type.getType(Object.class)))code.add(new TypeInsnNode(Opcodes.CHECKCAST,to.getInternalName()));}
 public static void main(String[] args)throws Exception{
  Map<String,byte[]> entries=new LinkedHashMap<>();Map<String,ClassNode> classes=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}}}
  JsonObject states=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject(),allStates=JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonObject();Map<String,Decoder> decoders=new HashMap<>();
  for(Map.Entry<String,JsonElement> e:states.entrySet()){ClassNode c=classes.get(e.getKey());if(c!=null)decoders.put(c.name,new Decoder(c,e.getValue().getAsJsonObject(),classes));}
  Map<String,Integer> writes=new HashMap<>();Set<String> mutable=new HashSet<>();for(ClassNode c:classes.values())for(MethodNode method:c.methods)for(AbstractInsnNode instruction:method.instructions)if(instruction instanceof FieldInsnNode&&instruction.getOpcode()==Opcodes.PUTSTATIC){FieldInsnNode f=(FieldInsnNode)instruction;String key=f.owner+'.'+f.name;writes.merge(key,1,Integer::sum);if(!method.name.equals("<clinit>")&&!method.name.equals("$jnicClinit"))mutable.add(key);}
  Map<String,Object> constants=new HashMap<>();for(ClassNode c:classes.values())if(allStates.has(c.name)){JsonObject state=allStates.getAsJsonObject(c.name);for(FieldNode f:c.fields)if(f.desc.equals("J")&&(f.access&Opcodes.ACC_VOLATILE)==0&&writes.getOrDefault(c.name+'.'+f.name,0)==1&&!mutable.contains(c.name+'.'+f.name)&&state.has(f.name)&&state.get(f.name).isJsonPrimitive())constants.put(c.name+'.'+f.name,state.get(f.name).getAsLong());}
  int resolved=0,unknown=0,rejected=0;List<Map<String,Object>> evidence=new ArrayList<>();Map<String,Integer> reasons=new TreeMap<>();
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(m.instructions.size()>0){Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<RestoreStrings.V>(new RestoreStrings.Constants(constants)).analyze(c.name,m);}catch(Exception e){continue;}AbstractInsnNode[] ns=m.instructions.toArray();
   for(int at=0;at<ns.length;at++)if(ns[at] instanceof InvokeDynamicInsnNode){InvokeDynamicInsnNode indy=(InvokeDynamicInsnNode)ns[at];Decoder decoder=decoders.get(indy.bsm.getOwner());if(decoder==null)continue;Type[] inputs=Type.getArgumentTypes(indy.desc);if(inputs.length<2||!inputs[inputs.length-2].equals(Type.LONG_TYPE)||!inputs[inputs.length-1].equals(Type.LONG_TYPE))continue;
    Frame<RestoreStrings.V> frame=frames[at];if(frame==null||frame.getStackSize()<2){unknown++;continue;}Object a=frame.getStack(frame.getStackSize()-2).value,b=frame.getStack(frame.getStackSize()-1).value;if(!(a instanceof Long)||!(b instanceof Long)){unknown++;continue;}
    try{
     char operation=indy.name.charAt(0);boolean loader=Boolean.getBoolean("recovery.loaderDispatcher");boolean field=loader?(operation==220||operation==236||operation==192||operation=='m'):(operation=='e'||operation==214||operation=='R'||operation=='Z');Target target=decoder.target((Long)a,(Long)b,field,classes);
     if(!accessible(target,c.name))throw new IllegalArgumentException("Access requires further proof");
     List<Type> wanted=new ArrayList<>();Type returned;int opcode;
     if(field){boolean setter=loader?(operation==236||operation=='m'):(operation==214||operation=='Z'),statik=loader?(operation==192||operation=='m'):(operation=='R'||operation=='Z');if(statik!=target.isStatic)throw new IllegalArgumentException("Static field mismatch");if(setter&&(target.access&Opcodes.ACC_FINAL)!=0&&(!c.name.equals(target.owner)||!m.name.equals(statik?"<clinit>":"<init>")))throw new IllegalArgumentException("Final field write requires initializer");if(!statik)wanted.add(Type.getObjectType(target.owner));if(setter)wanted.add(Type.getType(target.descriptor));returned=setter?Type.VOID_TYPE:Type.getType(target.descriptor);opcode=statik?(setter?Opcodes.PUTSTATIC:Opcodes.GETSTATIC):(setter?Opcodes.PUTFIELD:Opcodes.GETFIELD);}
     else{boolean statik=operation==(loader?'D':206);if(statik!=target.isStatic)throw new IllegalArgumentException("Static method mismatch");if(!statik)wanted.add(Type.getObjectType(target.owner));wanted.addAll(Arrays.asList(Type.getArgumentTypes(target.descriptor)));returned=Type.getReturnType(target.descriptor);opcode=statik?Opcodes.INVOKESTATIC:operation==(loader?224:'P')?(target.isInterface?Opcodes.INVOKEINTERFACE:Opcodes.INVOKEVIRTUAL):Opcodes.INVOKESPECIAL;if(opcode==Opcodes.INVOKESPECIAL&&!c.name.equals(target.owner))throw new IllegalArgumentException("Special dispatch requires further access proof");}
     if(wanted.size()!=inputs.length-2||!compatible(returned,Type.getReturnType(indy.desc)))throw new IllegalArgumentException("Descriptor adaptation unsupported");
     int slots=0;for(int i=0;i<wanted.size();i++){if(!compatible(inputs[i],wanted.get(i)))throw new IllegalArgumentException("Primitive adaptation unsupported");slots+=inputs[i].getSize();}if(m.maxLocals+slots>60000)throw new IllegalArgumentException("Local limit");
     boolean removed=RestoreStrings.removePureArguments(m,ns,frames,at,c.name,constants);InsnList replacement=new InsnList();if(!removed){replacement.add(new InsnNode(Opcodes.POP2));replacement.add(new InsnNode(Opcodes.POP2));}int[] locals=new int[wanted.size()];for(int i=0;i<locals.length;i++){locals[i]=m.maxLocals;m.maxLocals+=inputs[i].getSize();}for(int i=locals.length-1;i>=0;i--)replacement.add(new VarInsnNode(inputs[i].getOpcode(Opcodes.ISTORE),locals[i]));for(int i=0;i<locals.length;i++){replacement.add(new VarInsnNode(inputs[i].getOpcode(Opcodes.ILOAD),locals[i]));cast(replacement,inputs[i],wanted.get(i));}
     if(field)replacement.add(new FieldInsnNode(opcode,target.owner,target.name,target.descriptor));else replacement.add(new MethodInsnNode(opcode,target.owner,target.name,target.descriptor,target.isInterface));cast(replacement,returned,Type.getReturnType(indy.desc));m.instructions.insertBefore(indy,replacement);m.instructions.remove(indy);resolved++;
     Map<String,Object> row=new LinkedHashMap<>();row.put("caller",c.name);row.put("method",m.name);row.put("methodDescriptor",m.desc);row.put("instruction",at);row.put("owner",target.owner);row.put("name",target.name);row.put("descriptor",target.descriptor);row.put("opcode",opcode);row.put("pureKeyExpressionsRemoved",removed);row.put("evidence","Decoded dispatcher record; supplied declaration and access verified; explicit argument and return adaptation");evidence.add(row);
    }catch(Exception e){rejected++;String reason=e.getMessage();if(reason==null)reason=e.getClass().getSimpleName();if(reason.length()>140)reason=reason.substring(reason.length()-140);reasons.merge(reason,1,Integer::sum);}
   }
  }
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(Path.of(args[3])))){for(Map.Entry<String,byte[]> e:entries.entrySet()){byte[] b=e.getValue();if(e.getKey().endsWith(".class")){ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);classes.get(e.getKey().substring(0,e.getKey().length()-6)).accept(w);b=w.toByteArray();}jar.putNextEntry(new JarEntry(e.getKey()));jar.write(b);jar.closeEntry();}}
  Gson gson=new GsonBuilder().setPrettyPrinting().create();Files.writeString(Path.of(args[4]),gson.toJson(evidence));System.out.println("Resolved "+resolved+" unknown keys "+unknown+" rejected "+rejected);System.out.println(gson.toJson(reasons));
 }
}
