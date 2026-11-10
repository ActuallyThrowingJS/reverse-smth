import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;
import com.zkmdeobf.MiniInterpreter;
/** Checks cryptanalytically recovered records against the original decoder. */
public class ValidateMemberCatalog {
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> classes=new HashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(e).readAllBytes()).accept(c,0);classes.put(c.name,c);}}
  JsonObject state=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();String owner=state.keySet().iterator().next();ResolveReferences.Decoder decoder=new ResolveReferences.Decoder(classes.get(owner),state.getAsJsonObject(owner),classes);JsonArray rows=JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonArray();Set<Integer> selectors=new HashSet<>();int records=0,checks=0;
  for(JsonElement element:rows){JsonObject row=element.getAsJsonObject();int slot=row.get("slot").getAsInt();String expected=row.get("plaintext").getAsString();boolean first=true;
   for(JsonElement encoded:row.getAsJsonArray("encodedKeys")){long value=encoded.getAsLong();int selector=(int)((value>>>42)&63);if(!first&&selectors.contains(selector))continue;first=false;((Object[])((MiniInterpreter.Arr)decoder.statics.get(owner+'.'+decoder.stringField)).data)[slot]=null;String actual=decoder.record(value,0);if(!expected.equals(actual))throw new AssertionError("Decoder mismatch at "+slot);selectors.add(selector);checks++;}
   for(JsonElement target:row.getAsJsonArray("targets")){JsonObject t=target.getAsJsonObject();ResolveReferences.Target actual=decoder.target(row.getAsJsonArray("encodedKeys").get(0).getAsLong(),0,t.get("kind").getAsString().equals("field"),classes);if(!actual.name.equals(t.get("name").getAsString())||!actual.descriptor.equals(t.get("descriptor").getAsString()))throw new AssertionError("Declaration mismatch");}
   records++;
  }
  Files.writeString(Path.of(args[3]),new GsonBuilder().setPrettyPrinting().create().toJson(Map.of("recordsVerified",records,"originalDecoderComparisons",checks,"selectorsCovered",selectors.size(),"inputClassesLoaded",false,"note","Every record verified against the original index decoder and supplied declarations")));System.out.println("PASS records="+records+" original decoder checks="+checks+" selectors="+selectors.size());
 }
}
