import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;
import com.zkmdeobf.IntRecovery;

/** Restores only same-class constant sites whose DES padding and UTF-8 validate. */
public class RestoreStrings {
 static final Object UNKNOWN=new Object();
 static class V implements Value {BasicValue type;Object value;V(BasicValue t,Object v){type=t;value=v;}public int getSize(){return type.getSize();}public boolean equals(Object o){return o instanceof V&&type.equals(((V)o).type)&&Objects.equals(value,((V)o).value);}public int hashCode(){return Objects.hash(type,value);}}
 static class Constants extends Interpreter<V> {
  BasicInterpreter base=new BasicInterpreter();Map<String,Object> statics;
  Constants(Map<String,Object> s){super(Opcodes.ASM9);statics=s;}
  V wrap(BasicValue type,Object value){return type==null?null:new V(type,value);}
  public V newValue(Type t){return wrap(base.newValue(t),UNKNOWN);}
  public V newOperation(AbstractInsnNode n)throws AnalyzerException{
   Object value=UNKNOWN;int op=n.getOpcode();
   if(n instanceof LdcInsnNode){Object c=((LdcInsnNode)n).cst;if(c instanceof Number||c instanceof String)value=c;}
   else if(n instanceof IntInsnNode&&op!=Opcodes.NEWARRAY)value=((IntInsnNode)n).operand;
   else if(op>=Opcodes.ICONST_M1&&op<=Opcodes.ICONST_5)value=op-Opcodes.ICONST_0;
   else if(op==Opcodes.LCONST_0||op==Opcodes.LCONST_1)value=(long)(op-Opcodes.LCONST_0);
   else if(op==Opcodes.GETSTATIC){FieldInsnNode f=(FieldInsnNode)n;value=statics.getOrDefault(f.owner+'.'+f.name,UNKNOWN);}
   return wrap(base.newOperation(n),value);
  }
  public V copyOperation(AbstractInsnNode n,V v){return v;}
  public V unaryOperation(AbstractInsnNode n,V v)throws AnalyzerException{
   Object x=UNKNOWN;if(v.value instanceof Number){Number a=(Number)v.value;switch(n.getOpcode()){
    case Opcodes.L2I:x=a.intValue();break;case Opcodes.I2L:x=a.longValue();break;case Opcodes.I2B:x=(int)a.byteValue();break;case Opcodes.I2C:x=(int)(char)a.intValue();break;case Opcodes.I2S:x=(int)a.shortValue();break;case Opcodes.INEG:x=-a.intValue();break;case Opcodes.LNEG:x=-a.longValue();break;case Opcodes.IINC:x=a.intValue()+((IincInsnNode)n).incr;break;
   }}return wrap(base.unaryOperation(n,v.type),x);
  }
  public V binaryOperation(AbstractInsnNode n,V a,V b)throws AnalyzerException{
   Object x=UNKNOWN;if(a.value instanceof Number&&b.value instanceof Number){Number p=(Number)a.value,q=(Number)b.value;int i=p.intValue(),j=q.intValue();long l=p.longValue(),r=q.longValue();switch(n.getOpcode()){
    case Opcodes.IADD:x=i+j;break;case Opcodes.ISUB:x=i-j;break;case Opcodes.IMUL:x=i*j;break;case Opcodes.IXOR:x=i^j;break;case Opcodes.IAND:x=i&j;break;case Opcodes.IOR:x=i|j;break;case Opcodes.ISHL:x=i<<j;break;case Opcodes.ISHR:x=i>>j;break;case Opcodes.IUSHR:x=i>>>j;break;
    case Opcodes.LADD:x=l+r;break;case Opcodes.LSUB:x=l-r;break;case Opcodes.LMUL:x=l*r;break;case Opcodes.LXOR:x=l^r;break;case Opcodes.LAND:x=l&r;break;case Opcodes.LOR:x=l|r;break;case Opcodes.LSHL:x=l<<j;break;case Opcodes.LSHR:x=l>>j;break;case Opcodes.LUSHR:x=l>>>j;break;case Opcodes.LCMP:x=Long.compare(l,r);break;
   }}return wrap(base.binaryOperation(n,a.type,b.type),x);
  }
  public V ternaryOperation(AbstractInsnNode n,V a,V b,V c)throws AnalyzerException{return wrap(base.ternaryOperation(n,a.type,b.type,c.type),UNKNOWN);}
  public V naryOperation(AbstractInsnNode n,List<? extends V> vs)throws AnalyzerException{List<BasicValue> args=new ArrayList<>();for(V v:vs)args.add(v.type);return wrap(base.naryOperation(n,args),UNKNOWN);}
  public void returnOperation(AbstractInsnNode n,V a,V b)throws AnalyzerException{base.returnOperation(n,a.type,b.type);}
  public V merge(V a,V b){return a.equals(b)?a:wrap(base.merge(a.type,b.type),UNKNOWN);}
 }
 static String decrypt(String ciphertext,long key)throws Exception{
  Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");cipher.init(Cipher.DECRYPT_MODE,SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(ByteBuffer.allocate(8).putLong(key).array())),new IvParameterSpec(new byte[8]));
  return StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(cipher.doFinal(ciphertext.getBytes(StandardCharsets.ISO_8859_1)))).toString();
 }
 static boolean pure(AbstractInsnNode n,String owner,Map<String,Object> constants){int op=n.getOpcode();if(n instanceof LdcInsnNode)return ((LdcInsnNode)n).cst instanceof Number;if(n instanceof VarInsnNode)return op==Opcodes.ILOAD||op==Opcodes.LLOAD;if(n instanceof IntInsnNode)return op==Opcodes.BIPUSH||op==Opcodes.SIPUSH;if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;return op==Opcodes.GETSTATIC&&f.owner.equals(owner)&&f.desc.equals("J")&&constants.containsKey(f.owner+'.'+f.name);}return op==Opcodes.NOP||(op>=Opcodes.ICONST_M1&&op<=Opcodes.LCONST_1)||Set.of(Opcodes.IXOR,Opcodes.IAND,Opcodes.IOR,Opcodes.IADD,Opcodes.ISUB,Opcodes.IMUL,Opcodes.ISHL,Opcodes.ISHR,Opcodes.IUSHR,Opcodes.LXOR,Opcodes.LAND,Opcodes.LOR,Opcodes.LADD,Opcodes.LSUB,Opcodes.LMUL,Opcodes.LSHL,Opcodes.LSHR,Opcodes.LUSHR,Opcodes.I2L,Opcodes.L2I,Opcodes.I2B,Opcodes.I2C,Opcodes.I2S,Opcodes.INEG,Opcodes.LNEG).contains(op);}
 static boolean removePureArguments(MethodNode method,AbstractInsnNode[] ns,Frame<V>[] frames,int call,String owner,Map<String,Object> constants){
  int base=frames[call].getStackSize()-2,start=-1;Set<LabelNode> targets=new HashSet<>();for(AbstractInsnNode n:ns){if(n instanceof JumpInsnNode)targets.add(((JumpInsnNode)n).label);if(n instanceof TableSwitchInsnNode){targets.add(((TableSwitchInsnNode)n).dflt);targets.addAll(((TableSwitchInsnNode)n).labels);}if(n instanceof LookupSwitchInsnNode){targets.add(((LookupSwitchInsnNode)n).dflt);targets.addAll(((LookupSwitchInsnNode)n).labels);}}for(TryCatchBlockNode t:method.tryCatchBlocks){targets.add(t.start);targets.add(t.end);targets.add(t.handler);}
  for(int j=call-1;j>=0&&call-j<80;j--){AbstractInsnNode n=ns[j];if(n.getOpcode()<0){if(n instanceof LabelNode&&targets.contains(n))break;continue;}if(!pure(n,owner,constants)||frames[j]==null)break;int op=n.getOpcode();int consumed=(op>=Opcodes.IADD&&op<=Opcodes.LXOR)?2:(Set.of(Opcodes.I2L,Opcodes.L2I,Opcodes.I2B,Opcodes.I2C,Opcodes.I2S,Opcodes.INEG,Opcodes.LNEG).contains(op)?1:0);if(frames[j].getStackSize()-consumed<base)break;if(frames[j].getStackSize()==base){start=j;break;}}
  if(start<0)return false;AbstractInsnNode current=ns[start];boolean reaches=false;for(int count=0;current!=null&&count<100;count++,current=current.getNext())if(current==ns[call]){reaches=true;break;}if(!reaches)return false;
  current=ns[start];while(current!=ns[call]){AbstractInsnNode next=current.getNext();if(current.getOpcode()>=0)method.instructions.remove(current);current=next;}return true;
 }
 public static void main(String[] args)throws Exception{
  Gson gson=new GsonBuilder().setPrettyPrinting().create();JsonObject states=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();
  Map<String,byte[]> entries=new LinkedHashMap<>();Map<String,ClassNode> classes=new LinkedHashMap<>();
  try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}}}
  Map<String,Integer> writes=new HashMap<>();Set<String> mutable=new HashSet<>();for(ClassNode c:classes.values())for(MethodNode method:c.methods)for(AbstractInsnNode instruction:method.instructions)if(instruction instanceof FieldInsnNode&&instruction.getOpcode()==Opcodes.PUTSTATIC){FieldInsnNode field=(FieldInsnNode)instruction;String name=field.owner+'.'+field.name;writes.merge(name,1,Integer::sum);if(!method.name.equals("<clinit>")&&!method.name.equals("$jnicClinit"))mutable.add(name);}
  Map<String,Object> constants=new HashMap<>();
  for(ClassNode c:classes.values())if(states.has(c.name)){
   JsonObject state=states.getAsJsonObject(c.name);
   for(FieldNode f:c.fields)if((f.access&Opcodes.ACC_VOLATILE)==0&&writes.getOrDefault(c.name+'.'+f.name,0)==1&&!mutable.contains(c.name+'.'+f.name)&&state.has(f.name)&&state.get(f.name).isJsonPrimitive()){
    if(f.desc.equals("J"))constants.put(c.name+'.'+f.name,state.get(f.name).getAsLong());
    else if(f.desc.equals("Ljava/lang/String;"))constants.put(c.name+'.'+f.name,state.get(f.name).getAsString());
   }
  }
  int restored=0,inlinedFields=0,analysisFailures=0;List<Map<String,Object>> evidence=new ArrayList<>();
  for(ClassNode c:classes.values()){
   JsonObject state=states.has(c.name)?states.getAsJsonObject(c.name):null;
   if(state==null)continue;
   Map<String,MethodNode> helpers=new HashMap<>();for(MethodNode m:c.methods)if(m.desc.equals("(IJ)Ljava/lang/String;")&&IntRecovery.params(c,m)!=null)helpers.put(m.name+m.desc,m);
   Map<String,List<String>> tables=new HashMap<>();
   for(MethodNode lookup:helpers.values())for(AbstractInsnNode n:lookup.instructions)if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;if(f.owner.equals(c.name)&&f.desc.equals("[Ljava/lang/String;")&&state.has(f.name)&&state.get(f.name).isJsonArray()){
    List<String> table=new ArrayList<>();boolean candidate=false;
    for(JsonElement e:state.getAsJsonArray(f.name)){if(e.isJsonNull())table.add(null);else{String v=e.getAsString();table.add(v);if(v.length()>0&&v.length()%8==0)candidate=true;}}
    if(candidate)tables.put(f.name,table);
   }}
   for(MethodNode m:c.methods)if(m.instructions.size()>0){
    Frame<V>[] frames;try{frames=new Analyzer<V>(new Constants(constants)).analyze(c.name,m);}catch(Exception e){analysisFailures++;continue;}
    AbstractInsnNode[] instructions=m.instructions.toArray();
    for(int at=0;at<instructions.length;at++){
     AbstractInsnNode n=instructions[at];Frame<V> frame=frames[at];if(frame==null)continue;
     if(n instanceof FieldInsnNode&&!m.name.equals("<clinit>")&&!m.name.equals("$jnicClinit")){
      FieldInsnNode f=(FieldInsnNode)n;Object value=constants.get(f.owner+'.'+f.name);
      if(f.getOpcode()==Opcodes.GETSTATIC&&f.owner.equals(c.name)&&f.desc.equals("Ljava/lang/String;")&&value instanceof String){m.instructions.set(n,new LdcInsnNode(value));inlinedFields++;}
     }
     String helperName=null,descriptor=null;
     if(n instanceof InvokeDynamicInsnNode){InvokeDynamicInsnNode indy=(InvokeDynamicInsnNode)n;if(indy.bsm.getOwner().equals(c.name)&&indy.desc.equals("(IJ)Ljava/lang/String;")&&helpers.size()==1){helperName=helpers.values().iterator().next().name;descriptor=indy.desc;}}
     else if(n instanceof MethodInsnNode){MethodInsnNode call=(MethodInsnNode)n;if(call.owner.equals(c.name)&&helpers.containsKey(call.name+call.desc)){helperName=call.name;descriptor=call.desc;}}
     if(helperName==null||frame.getStackSize()<2)continue;
     Object index=frame.getStack(frame.getStackSize()-2).value,key=frame.getStack(frame.getStackSize()-1).value;
     if(!(index instanceof Integer)||!(key instanceof Long))continue;
     MethodNode helper=helpers.get(helperName+descriptor);IntRecovery.LookupParams params=IntRecovery.params(c,helper);int slot=(Integer)index^(int)((Long)key&params.mask())^params.indexXor();
     Set<String> answers=new LinkedHashSet<>();
     for(List<String> table:tables.values())if(slot>=0&&slot<table.size()&&table.get(slot)!=null){try{answers.add(decrypt(table.get(slot),(Long)key));}catch(Exception ignored){}}
     if(answers.size()!=1)continue;String plaintext=answers.iterator().next();
     boolean removed=removePureArguments(m,instructions,frames,at,c.name,constants);InsnList replacement=new InsnList();if(!removed){replacement.add(new InsnNode(Opcodes.POP2));replacement.add(new InsnNode(Opcodes.POP));}replacement.add(new LdcInsnNode(plaintext));m.instructions.insertBefore(n,replacement);m.instructions.remove(n);restored++;
     Map<String,Object> record=new LinkedHashMap<>();record.put("owner",c.name);record.put("method",m.name);record.put("descriptor",m.desc);record.put("instruction",at);record.put("plaintext",plaintext);record.put("pureArgumentExpressionsRemoved",removed);record.put("evidence","constant arguments; recognized index formula; DES padding and strict UTF-8; unique plaintext");evidence.add(record);
    }
   }
  }
  try(JarOutputStream out=new JarOutputStream(Files.newOutputStream(Path.of(args[2])))){for(Map.Entry<String,byte[]> entry:entries.entrySet()){byte[] b=entry.getValue();if(entry.getKey().endsWith(".class")){ClassNode c=classes.get(entry.getKey().substring(0,entry.getKey().length()-6));ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.accept(writer);b=writer.toByteArray();}out.putNextEntry(new JarEntry(entry.getKey()));out.write(b);out.closeEntry();}}
  Files.writeString(Path.of(args[3]),gson.toJson(evidence));System.out.println("Restored string call sites="+restored+" static string references="+inlinedFields+" unanalysed methods="+analysisFailures);
 }
}
