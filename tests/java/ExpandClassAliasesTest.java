import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;

/** Checks nested names, existing partial renames, references, reflection metadata and collisions. */
public class ExpandClassAliasesTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("nested-alias-test-"),source=root.resolve("Root.java");Files.writeString(source,"""
   package fixture;
   public class Root {
    public static class Child {public static class Grandchild {public String name(){return "kept";}}}
    public static Child.Grandchild make(){return new Child.Grandchild();}
   }
   class Other {}
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compile");Path original=root.resolve("original.jar"),partial=root.resolve("partial.jar"),result=root.resolve("result.jar"),plan=root.resolve("plan.json"),delta=root.resolve("delta.json"),expanded=root.resolve("expanded.json");
  try(JarOutputStream z=new JarOutputStream(Files.newOutputStream(original));var files=Files.walk(root.resolve("fixture"))){for(Path p:files.filter(p->p.toString().endsWith(".class")).toList()){z.putNextEntry(new JarEntry(root.relativize(p).toString()));z.write(Files.readAllBytes(p));z.closeEntry();}}
  Files.writeString(plan,"{\"classes\":{\"fixture/Root\":\"fixture/Renamed\",\"fixture/Root$Child\":\"fixture/Renamed$NamedChild\"},\"fields\":[],\"methods\":[]}");
  SemanticRemap.main(new String[]{original.toString(),plan.toString(),partial.toString(),root.resolve("partial-map.json").toString(),root.resolve("partial-report.json").toString()});ExpandClassAliases.main(new String[]{original.toString(),plan.toString(),partial.toString(),delta.toString(),expanded.toString()});JsonObject changes=JsonParser.parseString(Files.readString(delta)).getAsJsonObject().getAsJsonObject("classes");
  if(changes.size()!=1||!changes.get("fixture/Root$Child$Grandchild").getAsString().equals("fixture/Renamed$NamedChild$Grandchild"))throw new AssertionError(changes);
  SemanticRemap.main(new String[]{partial.toString(),delta.toString(),result.toString(),root.resolve("result-map.json").toString(),root.resolve("result-report.json").toString()});
  try(URLClassLoader loader=new URLClassLoader(new URL[]{result.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> owner=loader.loadClass("fixture.Renamed"),child=owner.getDeclaredClasses()[0],grandchild=child.getDeclaredClasses()[0];if(!child.getName().equals("fixture.Renamed$NamedChild")||!grandchild.getName().equals("fixture.Renamed$NamedChild$Grandchild"))throw new AssertionError("Nested metadata inconsistent");Object value=owner.getMethod("make").invoke(null);if(value.getClass()!=grandchild||!grandchild.getMethod("name").invoke(value).equals("kept"))throw new AssertionError("Reference/descriptor remap changed behavior");}
  Files.writeString(plan,"{\"classes\":{\"fixture/Root\":\"fixture/Other\"},\"fields\":[],\"methods\":[]}");try{ExpandClassAliases.main(new String[]{original.toString(),plan.toString(),original.toString(),root.resolve("bad-delta.json").toString(),root.resolve("bad-map.json").toString()});throw new AssertionError("Collision accepted");}catch(IllegalStateException expected){if(!expected.getMessage().contains("collision"))throw expected;}
  System.out.println("PASS nested alias expansion, longest-owner match, partial archive renames, JVM references/reflection and collision rejection");
 }
}
