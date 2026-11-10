import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;

/** Checks actual invocation argument dataflow against conditional key profiles. */
public class AuditContextCallers {
 static String key(String owner,String name,String descriptor){return owner+'\t'+name+'\t'+descriptor;}
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> classes=new LinkedHashMap<>();
  try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(e).readAllBytes()).accept(c,0);classes.put(c.name,c);}}
  Map<String,JsonObject> profiles=new HashMap<>();
  for(JsonElement e:JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray()){JsonObject p=e.getAsJsonObject();profiles.put(key(p.get("owner").getAsString(),p.get("name").getAsString(),p.get("descriptor").getAsString()),p);}
  Map<String,Object> constants=SpecializeKeys.constants(classes);JsonArray calls=new JsonArray();Set<String> matched=new HashSet<>();int unknown=0,conflicting=0,analyzerFailures=0;
  for(ClassNode c:classes.values())if(c.name.startsWith("me/octo/client/")||c.name.startsWith("fixture/"))for(MethodNode m:c.methods)if(m.instructions.size()>0&&!m.name.contains("$inferred$")){
   Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new RestoreStrings.Constants(constants)).analyze(c.name,m);}catch(AnalyzerException e){analyzerFailures++;continue;}
   AbstractInsnNode[] code=m.instructions.toArray();
   for(int at=0;at<code.length;at++)if(code[at] instanceof MethodInsnNode call&&frames[at]!=null){
    ResolveReferences.Target target=ResolveReferences.find(call.owner,call.name,call.desc,false,classes,new HashSet<>());if(target==null)continue;
    String targetKey=key(target.owner,target.name,target.descriptor);JsonObject p=profiles.get(targetKey);if(p==null)continue;
    Type[] types=Type.getArgumentTypes(call.desc);Map<Integer,Object> values=new LinkedHashMap<>();int slot=call.getOpcode()==Opcodes.INVOKESTATIC?0:1,base=frames[at].getStackSize()-types.length;
    for(int i=0;i<types.length;i++){values.put(slot,frames[at].getStack(base+i).value);slot+=types[i].getSize();}
    boolean known=true,agree=true;JsonObject observed=new JsonObject();
    for(var e:p.getAsJsonObject("bindings").entrySet()){
     if(!e.getKey().startsWith("arg:")){known=false;continue;}Object value=values.get(Integer.parseInt(e.getKey().substring(4)));
     if(!(value instanceof Long)){known=false;continue;}long v=(Long)value;observed.addProperty(e.getKey(),v);if(v!=e.getValue().getAsLong())agree=false;
    }
    if(!known){unknown++;continue;}if(!agree){conflicting++;continue;}
    // A matching symbolic reference alone does not establish a virtual target.
    boolean exact=call.getOpcode()==Opcodes.INVOKESTATIC||(target.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_FINAL))!=0||(classes.get(call.owner).access&Opcodes.ACC_FINAL)!=0;
    if(call.getOpcode()==Opcodes.INVOKESPECIAL)exact=((target.access&Opcodes.ACC_PRIVATE)!=0&&c.name.equals(target.owner))||(call.owner.equals(c.superName)&&(classes.get(call.owner).access&Opcodes.ACC_INTERFACE)==0);
    JsonObject row=new JsonObject();row.addProperty("callerOwner",c.name);row.addProperty("callerName",m.name);row.addProperty("callerDescriptor",m.desc);row.addProperty("instruction",at);row.addProperty("targetOwner",target.owner);row.addProperty("targetName",target.name);row.addProperty("targetDescriptor",target.descriptor);row.add("observedBindings",observed);row.addProperty("invocationOwner",call.owner);row.addProperty("invocationOpcode",call.getOpcode());ClassNode declaration=classes.get(target.owner);MethodNode body=declaration.methods.stream().filter(x->x.name.equals(target.name)&&x.desc.equals(target.descriptor)).findFirst().orElseThrow();row.addProperty("targetInstructions",body.instructions.size());row.addProperty("targetHasLongXor",Arrays.stream(body.instructions.toArray()).anyMatch(x->x.getOpcode()==Opcodes.LXOR));row.addProperty("exactDispatch",exact);row.addProperty("runtimeEntryReachabilityEstablished",false);calls.add(row);if(exact)matched.add(targetKey);
   }
  }
  JsonObject report=new JsonObject();report.addProperty("profileCount",profiles.size());report.addProperty("profilesWithExactDispatchConstantArgumentCallers",matched.size());report.addProperty("matchingCallSites",calls.size());report.addProperty("unknownArgumentCallSites",unknown);report.addProperty("differentConstantArgumentCallSites",conflicting);report.addProperty("unanalyzedMethods",analyzerFailures);report.addProperty("applicationEntryReachabilityEstablished",false);report.add("calls",calls);
  Files.writeString(Path.of(args[2]),new GsonBuilder().setPrettyPrinting().create().toJson(report));report.remove("calls");System.out.println(report);
 }
}
