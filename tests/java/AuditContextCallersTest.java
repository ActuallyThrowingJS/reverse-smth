import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;

/** Checks inheritance, exact/virtual dispatch, and conservative constant argument proofs. */
public class AuditContextCallersTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("context-caller-test-"),source=root.resolve("Caller.java"),input=root.resolve("input.jar"),profiles=root.resolve("profiles.json"),output=root.resolve("audit.json");
  Files.writeString(source,"""
   package fixture;
   class Parent {
    static void exactStatic(long key) {}
    final void exactFinal(long key) {}
    void virtual(long key) {}
   }
   public class Caller extends Parent {
    static final long CONSTANT=7L;
    static volatile long changing=7L;
    static long mutable=7L;
    static void mutate(){mutable=8L;}
    static void unknown(long key){Parent.exactStatic(key);}
    public static void entry(boolean branch){
     Caller.exactStatic(CONSTANT);
     new Caller().exactFinal(7L);
     new Caller().virtual(7L);
     Parent.exactStatic(8L);
     Parent.exactStatic(changing);
     Parent.exactStatic(mutable);
     long merged;if(branch)merged=7L;else merged=7L;Parent.exactStatic(merged);
    }
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compile");
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){for(String name:List.of("Parent","Caller")){jar.putNextEntry(new JarEntry("fixture/"+name+".class"));jar.write(Files.readAllBytes(root.resolve("fixture/"+name+".class")));jar.closeEntry();}}
  List<Map<String,Object>> rows=new ArrayList<>();for(String name:List.of("exactStatic","exactFinal","virtual"))rows.add(Map.of("owner","fixture/Parent","name",name,"descriptor","(J)V","bindings",Map.of(name.equals("exactStatic")?"arg:0":"arg:1",7L)));
  Files.writeString(profiles,new Gson().toJson(rows));AuditContextCallers.main(new String[]{input.toString(),profiles.toString(),output.toString()});JsonObject audit=JsonParser.parseString(Files.readString(output)).getAsJsonObject();
  if(audit.get("profilesWithExactDispatchConstantArgumentCallers").getAsInt()!=2||audit.get("matchingCallSites").getAsInt()!=4||audit.get("unknownArgumentCallSites").getAsInt()!=3||audit.get("differentConstantArgumentCallSites").getAsInt()!=1||audit.get("unanalyzedMethods").getAsInt()!=0||audit.get("applicationEntryReachabilityEstablished").getAsBoolean())throw new AssertionError(audit);
  int virtual=0;for(JsonElement e:audit.getAsJsonArray("calls")){JsonObject c=e.getAsJsonObject();if(!c.get("targetOwner").getAsString().equals("fixture/Parent"))throw new AssertionError("Inherited declaration not resolved");if(c.get("targetName").getAsString().equals("virtual")){virtual++;if(c.get("exactDispatch").getAsBoolean())throw new AssertionError("Virtual target falsely proved");}}
  if(virtual!=1)throw new AssertionError("Missing virtual call");System.out.println("PASS inherited callers, exact/final dispatch, ambiguous virtual dispatch, differing/unknown arguments, volatile/mutable fields and control-flow merge");
 }
}
