import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;
import com.zkmdeobf.IntRecovery;

/** Platform-only crypto decoding RPC; never loads application classes. */
public class CryptoSnapshotService {
 public static void main(String[] args)throws Exception{
  JsonObject states=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();Map<String,ClassNode> classes=new HashMap<>();try(JarFile z=new JarFile(args[0])){for(JarEntry e:Collections.list(z.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(z.getInputStream(e).readAllBytes()).accept(c,0);classes.put(c.name,c);}}
  JsonObject dispatcherStates=args.length>2?JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonObject():new JsonObject();Map<String,ResolveReferences.Decoder> decoders=new HashMap<>();
  Gson gson=new Gson();try(BufferedReader input=new BufferedReader(new InputStreamReader(System.in));PrintWriter output=new PrintWriter(System.out,true)){String line;while((line=input.readLine())!=null){JsonObject response=new JsonObject();try{
   JsonObject q=JsonParser.parseString(line).getAsJsonObject();String owner=q.get("owner").getAsString();if(q.has("operation")&&q.get("operation").getAsString().equals("member")){
    ResolveReferences.Decoder decoder=decoders.get(owner);if(decoder==null){JsonObject captured=dispatcherStates.getAsJsonObject(owner);if(captured==null)throw new IllegalArgumentException("No dispatcher snapshot");decoder=new ResolveReferences.Decoder(classes.get(owner),captured,classes);decoders.put(owner,decoder);}
    ResolveReferences.Target target=decoder.target(q.get("first").getAsLong(),q.get("key").getAsLong(),q.get("isField").getAsBoolean(),classes);response.addProperty("owner",target.owner);response.addProperty("name",target.name);response.addProperty("descriptor",target.descriptor);response.addProperty("field",target.field);response.addProperty("static",target.isStatic);output.println(gson.toJson(response));continue;
   }JsonObject state=states.getAsJsonObject(owner);if(state==null)throw new IllegalArgumentException("No captured class state: "+owner);
   if(q.has("field")){JsonElement value=state.get(q.get("field").getAsString());if(value==null)throw new IllegalArgumentException("No captured field");response.add("value",value);}
   else {ClassNode c=classes.get(owner);String name=q.get("name").getAsString();MethodNode helper=c.methods.stream().filter(m->m.name.equals(name)&&m.desc.equals("(IJ)Ljava/lang/String;")).findFirst().orElseThrow();IntRecovery.LookupParams params=IntRecovery.params(c,helper);if(params==null)throw new IllegalArgumentException("Native or unrecognized string helper");long key=q.get("key").getAsLong();int slot=q.get("index").getAsInt()^(int)(key&params.mask())^params.indexXor();Set<String> answers=new HashSet<>();for(AbstractInsnNode n:helper.instructions)if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;if(f.owner.equals(owner)&&f.desc.equals("[Ljava/lang/String;")&&state.has(f.name)&&state.get(f.name).isJsonArray()){JsonArray table=state.getAsJsonArray(f.name);if(slot>=0&&slot<table.size()&&!table.get(slot).isJsonNull())try{answers.add(RestoreStrings.decrypt(table.get(slot).getAsString(),key));}catch(Exception ignored){}}}if(answers.size()!=1)throw new IllegalArgumentException("No unique padded UTF-8 plaintext");response.addProperty("plaintext",answers.iterator().next());}
  }catch(Exception e){response.addProperty("error",e.toString());}output.println(gson.toJson(response));}}
 }
}
