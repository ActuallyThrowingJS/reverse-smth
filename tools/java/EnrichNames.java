import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;

/** Recovers Kotlin parameter names and proposes names from proven assignments. */
public class EnrichNames {
 static boolean readable(String n){return n!=null&&n.matches("[A-Za-z_$][A-Za-z0-9_$]*")&&!n.matches("[Il]{12,}")&&!Set.of("this","class","default","return","null","true","false").contains(n);}
 static AbstractInsnNode only(SourceValue v){return v!=null&&v.insns.size()==1?v.insns.iterator().next():null;}
 static String literal(SourceValue value){AbstractInsnNode n=only(value);return n instanceof LdcInsnNode&&((LdcInsnNode)n).cst instanceof String?(String)((LdcInsnNode)n).cst:null;}
 static String key(String owner,String name,String desc){return owner+'\t'+name+'\t'+desc;}
 public static void main(String[] args)throws Exception{
  Gson gson=new GsonBuilder().setPrettyPrinting().create();JsonObject plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();JsonObject classNames=plan.getAsJsonObject("classes");JsonArray fields=plan.getAsJsonArray("fields");
  Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,byte[]> entries=new LinkedHashMap<>();
  try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}}}
  Map<String,Set<String>> fieldCandidates=new LinkedHashMap<>();Map<String,String> moduleCandidates=new LinkedHashMap<>();Map<String,List<String>> parameterReport=new LinkedHashMap<>();
  Map<String,String> curatedFields=new HashMap<>();for(JsonElement element:fields){JsonObject f=element.getAsJsonObject();curatedFields.put(key(f.get("owner").getAsString(),f.get("name").getAsString(),f.get("descriptor").getAsString()),f.get("newName").getAsString());}
  int namedParameters=0,failures=0,inferredParameters=0;
  for(ClassNode c:classes.values())if(c.name.startsWith("me/octo/client/"))for(MethodNode m:c.methods)if(m.instructions.size()>0){
   Frame<SourceValue>[] frames;try{frames=new Analyzer<>(new SourceInterpreter()).analyze(c.name,m);}catch(Exception e){failures++;continue;}
   Type[] types=Type.getArgumentTypes(m.desc);Map<Integer,Integer> argumentSlots=new HashMap<>();int local=(m.access&Opcodes.ACC_STATIC)!=0?0:1;for(int i=0;i<types.length;i++){argumentSlots.put(local,i);local+=types[i].getSize();}
   Map<Integer,String> names=new LinkedHashMap<>();AbstractInsnNode[] instructions=m.instructions.toArray();
   for(int i=0;i<instructions.length;i++)if(instructions[i] instanceof MethodInsnNode && frames[i]!=null){
    MethodInsnNode call=(MethodInsnNode)instructions[i];Frame<SourceValue> frame=frames[i];
    if(call.owner.equals("kotlin/jvm/internal/Intrinsics")&&call.name.equals("checkNotNullParameter")&&frame.getStackSize()>=2){
     String name=literal(frame.getStack(frame.getStackSize()-1));AbstractInsnNode source=only(frame.getStack(frame.getStackSize()-2));
     if(readable(name)&&source instanceof VarInsnNode&&argumentSlots.containsKey(((VarInsnNode)source).var))names.put(((VarInsnNode)source).var,name);
    }
    if(m.name.equals("<init>")&&call.name.equals("<init>")&&call.owner.equals(c.superName)&&c.name.startsWith("me/octo/client/modules/impl/")&&c.name.indexOf('$')<0&&c.name.substring(c.name.lastIndexOf('/')+1).matches("[Il]{12,}")&&call.owner.startsWith("me/octo/client/gui/clickgui/modules/")){
     Type[] params=Type.getArgumentTypes(call.desc);
     for(int a=0;a<params.length;a++)if(params[a].getDescriptor().equals("Ljava/lang/String;")){
      int at=frame.getStackSize()-params.length+a;
      if(at>=0){String display=literal(frame.getStack(at));if(display!=null&&display.length()<80){StringBuilder simple=new StringBuilder();for(String part:display.replaceAll("§.","").split("[^A-Za-z0-9]+"))if(!part.isEmpty())simple.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));String name=simple.toString();if(!name.isEmpty()&&Character.isJavaIdentifierStart(name.charAt(0))){String proposed=c.name.substring(0,c.name.lastIndexOf('/')+1)+name;if(!classes.containsKey(proposed))moduleCandidates.put(c.name,proposed);}}}
      break;
     }
    }
   }
   if(!names.isEmpty()){
    List<String> list=new ArrayList<>(Collections.nCopies(types.length,null));for(Map.Entry<Integer,String> e:names.entrySet()){list.set(argumentSlots.get(e.getKey()),e.getValue());namedParameters++;}
    parameterReport.put(key(c.name,m.name,m.desc),list);
    m.parameters=new ArrayList<>();for(String name:list)m.parameters.add(new ParameterNode(name,0));
    if(m.localVariables!=null)for(LocalVariableNode v:m.localVariables)if(names.containsKey(v.index))v.name=names.get(v.index);
   }
   boolean inferred=false;
   if(m.name.equals("<init>"))for(int at=0;at<instructions.length;at++)if(instructions[at]instanceof FieldInsnNode&&frames[at]!=null){FieldInsnNode f=(FieldInsnNode)instructions[at];String property=curatedFields.get(key(f.owner,f.name,f.desc));Frame<SourceValue> frame=frames[at];if(f.getOpcode()==Opcodes.PUTFIELD&&property!=null&&frame.getStackSize()>=2){AbstractInsnNode source=only(frame.getStack(frame.getStackSize()-1));if(source instanceof VarInsnNode){int slot=((VarInsnNode)source).var;if(argumentSlots.containsKey(slot)&&!names.containsKey(slot)){names.put(slot,property);inferredParameters++;inferred=true;}}}}
   if(inferred){m.parameters=new ArrayList<>();List<String> list=new ArrayList<>(Collections.nCopies(types.length,null));for(Map.Entry<Integer,String> e:names.entrySet())list.set(argumentSlots.get(e.getKey()),e.getValue());for(String name:list)m.parameters.add(new ParameterNode(name,0));if(m.localVariables!=null)for(LocalVariableNode v:m.localVariables)if(names.containsKey(v.index))v.name=names.get(v.index);}
   if(m.name.equals("<init>"))for(int i=0;i<instructions.length;i++)if(instructions[i] instanceof FieldInsnNode&&frames[i]!=null){FieldInsnNode field=(FieldInsnNode)instructions[i];
    if(field.getOpcode()!=Opcodes.PUTFIELD||!field.owner.equals(c.name)||!field.name.matches("[Il]{12,}"))continue;
    Frame<SourceValue> frame=frames[i];if(frame.getStackSize()<2)continue;AbstractInsnNode source=only(frame.getStack(frame.getStackSize()-1));
    if(source instanceof VarInsnNode&&names.containsKey(((VarInsnNode)source).var))fieldCandidates.computeIfAbsent(key(c.name,field.name,field.desc),x->new LinkedHashSet<>()).add(names.get(((VarInsnNode)source).var));
   }
  }
  Set<String> existingFields=new HashSet<>(),newFields=new HashSet<>();for(JsonElement e:fields){JsonObject f=e.getAsJsonObject();existingFields.add(key(f.get("owner").getAsString(),f.get("name").getAsString(),f.get("descriptor").getAsString()));newFields.add(key(f.get("owner").getAsString(),f.get("newName").getAsString(),f.get("descriptor").getAsString()));}
  int recoveredFields=0;
  for(Map.Entry<String,Set<String>> candidate:fieldCandidates.entrySet())if(candidate.getValue().size()==1&&!existingFields.contains(candidate.getKey())){
   String[] parts=candidate.getKey().split("\t",-1);String name=candidate.getValue().iterator().next();
   if(newFields.contains(key(parts[0],name,parts[2]))||classes.get(parts[0]).fields.stream().anyMatch(f->f.name.equals(name)&&f.desc.equals(parts[2])))continue;
   JsonObject f=new JsonObject();f.addProperty("owner",parts[0]);f.addProperty("name",parts[1]);f.addProperty("descriptor",parts[2]);f.addProperty("newName",name);f.addProperty("evidence","Decrypted Kotlin parameter name and direct constructor-parameter field assignment");fields.add(f);newFields.add(key(parts[0],name,parts[2]));recoveredFields++;
  }
  Set<String> duplicateNames=new HashSet<>();Map<String,Long> frequency=new HashMap<>();for(String name:moduleCandidates.values())frequency.merge(name,1L,Long::sum);for(String name:frequency.keySet())if(frequency.get(name)>1)duplicateNames.add(name);
  int moduleNames=0;for(Map.Entry<String,String> e:moduleCandidates.entrySet())if(!duplicateNames.contains(e.getValue())&&!classNames.has(e.getKey())){classNames.addProperty(e.getKey(),e.getValue());moduleNames++;}
  Files.writeString(Path.of(args[3]),gson.toJson(plan));Files.writeString(Path.of(args[4]),gson.toJson(parameterReport));
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(Path.of(args[2])))){for(Map.Entry<String,byte[]> e:entries.entrySet()){byte[] bytes=e.getValue();if(e.getKey().endsWith(".class")){ClassWriter w=new ClassWriter(0);classes.get(e.getKey().substring(0,e.getKey().length()-6)).accept(w);bytes=w.toByteArray();}jar.putNextEntry(new JarEntry(e.getKey()));jar.write(bytes);jar.closeEntry();}}
  System.out.println("Recovered original parameter names="+namedParameters+" inferred field names="+recoveredFields+" module display-name class aliases="+moduleNames+" inferred constructor parameters="+inferredParameters+" methods skipped="+failures);
 }
}
