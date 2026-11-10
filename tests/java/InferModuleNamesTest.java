import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;

/** Tests constructor-role propagation instead of guessing the first String argument. */
public class InferModuleNamesTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("module-names-test-");Map<String,String> sources=new LinkedHashMap<>();
  sources.put("me/octo/client/gui/clickgui/modules/ModuleBase","package me.octo.client.gui.clickgui.modules; public class ModuleBase {public ModuleBase(String name,String description){}}");
  sources.put("me/octo/client/modules/Middle","package me.octo.client.modules; public class Middle extends me.octo.client.gui.clickgui.modules.ModuleBase {public Middle(String description,String display){super(display,description);}}");
  sources.put("me/octo/client/modules/Other","package me.octo.client.modules; public class Other {public Other(String description,String ignored){}}");
  String impl="me/octo/client/modules/impl/";
  sources.put(impl+"IIIIIIIIIIII","package me.octo.client.modules.impl; public class IIIIIIIIIIII extends me.octo.client.modules.Middle {public IIIIIIIIIIII(){super(\"Decoy Description\",\"Actual Name\");new me.octo.client.modules.Middle(\"Other description\",\"Unrelated Instance\");}}");
  sources.put(impl+"llllllllllll","package me.octo.client.modules.impl; public class llllllllllll extends me.octo.client.modules.Middle {public llllllllllll(){super(\"Description\",\"One Name\");}public llllllllllll(int ignored){super(\"Description\",\"Different Name\");}}");
  sources.put(impl+"IlIlIlIlIlIl","package me.octo.client.modules.impl; public class IlIlIlIlIlIl extends me.octo.client.modules.Other {public IlIlIlIlIlIl(){super(\"Wrong Name\",\"Ignored\");}}");
  for(String name:List.of("IIIIIIIIIIIIII","llllllllllllll"))sources.put(impl+name,"package me.octo.client.modules.impl; public class "+name+" extends me.octo.client.modules.Middle {public "+name+"(){super(\"Description\",\"Duplicate Name\");}}");
  List<String> compiler=new ArrayList<>(List.of("--release","21","-d",root.toString()));for(var e:sources.entrySet()){Path p=root.resolve(e.getKey()+".java");Files.createDirectories(p.getParent());Files.writeString(p,e.getValue());compiler.add(p.toString());}
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,compiler.toArray(String[]::new))!=0)throw new AssertionError("Fixture compile");
  Path input=root.resolve("input.jar"),plan=root.resolve("plan.json"),output=root.resolve("result.json"),evidence=root.resolve("evidence.json");try(JarOutputStream z=new JarOutputStream(Files.newOutputStream(input))){for(String owner:sources.keySet()){z.putNextEntry(new JarEntry(owner+".class"));z.write(Files.readAllBytes(root.resolve(owner+".class")));z.closeEntry();}}
  Files.writeString(plan,"{\"classes\":{},\"fields\":[],\"methods\":[]}");InferModuleNames.main(new String[]{input.toString(),plan.toString(),output.toString(),evidence.toString()});JsonObject aliases=JsonParser.parseString(Files.readString(output)).getAsJsonObject().getAsJsonObject("classes");
  if(aliases.size()!=1||!aliases.get(impl+"IIIIIIIIIIII").getAsString().equals(impl+"ActualName"))throw new AssertionError(aliases);
  JsonArray rows=JsonParser.parseString(Files.readString(evidence)).getAsJsonArray();if(rows.size()!=1||rows.get(0).getAsJsonObject().get("originalIdentifierRecovered").getAsBoolean()||rows.get(0).getAsJsonObject().getAsJsonArray("constructorEvidence").get(0).getAsJsonObject().get("displayArgumentIndex").getAsInt()!=1)throw new AssertionError("Missing reordered argument provenance");
  System.out.println("PASS transitive/reordered name arguments, ambiguous constructors, unrelated bases, duplicate aliases and explicit inference provenance");
 }
}
