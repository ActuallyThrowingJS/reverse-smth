import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;

/** Proposes module aliases by tracing the display-name argument through constructor chains. */
public class InferModuleNames {
 record Argument(int slot){}
 enum Receiver { THIS }
 static class Names extends RestoreStrings.Constants {
  Names(){super(Map.of());}
  public RestoreStrings.V newParameterValue(boolean instance,int local,Type type){RestoreStrings.V v=super.newParameterValue(instance,local,type);if(instance&&local==0)return new RestoreStrings.V(v.type,Receiver.THIS);return type.equals(Type.getType(String.class))?new RestoreStrings.V(v.type,new Argument(local)):v;}
  public RestoreStrings.V unaryOperation(AbstractInsnNode n,RestoreStrings.V value)throws AnalyzerException {RestoreStrings.V result=super.unaryOperation(n,value);if(n.getOpcode()==Opcodes.CHECKCAST&&(value.value instanceof Argument||value.value instanceof String))return new RestoreStrings.V(result.type,value.value);return result;}
 }
 static String key(String o,String d){return o+'\t'+d;}
 static String alias(String owner,String display){if(display.length()>=80)return null;StringBuilder simple=new StringBuilder();for(String word:display.replaceAll("§.","").split("[^A-Za-z0-9]+"))if(!word.isEmpty())simple.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));return simple.isEmpty()||!Character.isJavaIdentifierStart(simple.charAt(0))?null:owner.substring(0,owner.lastIndexOf('/')+1)+simple;}
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> classes=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(e).readAllBytes()).accept(c,0);classes.put(c.name,c);}}
  JsonObject plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject(),aliases=plan.getAsJsonObject("classes");Map<String,Integer> roles=new LinkedHashMap<>();
  for(ClassNode c:classes.values())if(c.name.startsWith("me/octo/client/gui/clickgui/modules/"))for(MethodNode m:c.methods)if(m.name.equals("<init>")){Type[] p=Type.getArgumentTypes(m.desc);for(int i=0;i<p.length;i++)if(p[i].equals(Type.getType(String.class))){roles.put(key(c.name,m.desc),i);break;}}
  Map<String,Set<String>> displays=new LinkedHashMap<>();Map<String,List<Map<String,Object>>> evidence=new LinkedHashMap<>();Set<String> conflictingRoles=new HashSet<>();int rounds=0,failures=0;
  for(int round=0;round<32;round++){boolean changed=false;rounds++;
   for(ClassNode c:classes.values())if(c.name.startsWith("me/octo/client/"))for(MethodNode m:c.methods)if(m.name.equals("<init>")&&m.instructions.size()>0){Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new Names()).analyze(c.name,m);}catch(AnalyzerException ex){if(round==0)failures++;continue;}Type[] own=Type.getArgumentTypes(m.desc);Map<Integer,Integer> parameters=new HashMap<>();int slot=1;for(int i=0;i<own.length;i++){parameters.put(slot,i);slot+=own[i].getSize();}AbstractInsnNode[] code=m.instructions.toArray();
    for(int at=0;at<code.length;at++)if(code[at] instanceof MethodInsnNode call&&call.getOpcode()==Opcodes.INVOKESPECIAL&&call.name.equals("<init>")&&(call.owner.equals(c.name)||call.owner.equals(c.superName))&&frames[at]!=null){Integer role=roles.get(key(call.owner,call.desc));if(role==null)continue;Type[] p=Type.getArgumentTypes(call.desc);Frame<RestoreStrings.V> frame=frames[at];int receiver=frame.getStackSize()-p.length-1;if(receiver<0||frame.getStack(receiver).value!=Receiver.THIS)continue;int stack=frame.getStackSize()-p.length+role;if(stack<0)continue;Object value=frame.getStack(stack).value;
     if(value instanceof Argument a&&parameters.containsKey(a.slot)){String k=key(c.name,m.desc);int parameter=parameters.get(a.slot);Integer prior=roles.putIfAbsent(k,parameter);if(prior==null)changed=true;else if(prior!=parameter)conflictingRoles.add(k);}
     if(value instanceof String display&&c.name.startsWith("me/octo/client/modules/impl/")&&c.name.indexOf('$')<0&&c.name.substring(c.name.lastIndexOf('/')+1).matches("[Il]{12,}")){if(displays.computeIfAbsent(c.name,k->new LinkedHashSet<>()).add(display))evidence.computeIfAbsent(c.name,k->new ArrayList<>()).add(Map.of("constructorDescriptor",m.desc,"calledOwner",call.owner,"calledConstructorDescriptor",call.desc,"displayArgumentIndex",role,"display",display));}
    }
   }if(!changed)break;
  }
  if(!conflictingRoles.isEmpty())throw new IllegalStateException("Conflicting constructor argument roles: "+conflictingRoles);
  Map<String,String> candidates=new LinkedHashMap<>();for(var e:displays.entrySet())if(e.getValue().size()==1){String name=alias(e.getKey(),e.getValue().iterator().next());if(name!=null)candidates.put(e.getKey(),name);}Map<String,Integer> frequency=new HashMap<>();for(String name:candidates.values())frequency.merge(name,1,Integer::sum);Set<String> existing=new HashSet<>();for(var e:aliases.entrySet())existing.add(e.getValue().getAsString());JsonArray proposals=new JsonArray();int added=0;
  for(var e:candidates.entrySet()){if(aliases.has(e.getKey()))continue;String proposed=e.getValue();if(frequency.get(proposed)!=1||classes.containsKey(proposed)||existing.contains(proposed))continue;aliases.addProperty(e.getKey(),proposed);existing.add(proposed);JsonObject row=new JsonObject();row.addProperty("owner",e.getKey());row.addProperty("proposedAlias",proposed);row.addProperty("originalIdentifierRecovered",false);row.addProperty("evidence","Display-name argument traced through constructors to the GUI module-base naming convention; proposal, not original source identifier");row.add("constructorEvidence",new Gson().toJsonTree(evidence.get(e.getKey())));proposals.add(row);added++;}
  Gson gson=new GsonBuilder().setPrettyPrinting().create();Files.writeString(Path.of(args[2]),gson.toJson(plan));Files.writeString(Path.of(args[3]),gson.toJson(proposals));System.out.println("New display-name aliases="+added+" constructorRoles="+roles.size()+" rounds="+rounds+" unanalyzedConstructors="+failures+"; inferred aliases, not original identifiers");
 }
}
