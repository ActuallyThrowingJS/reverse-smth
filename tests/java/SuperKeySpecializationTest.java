import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

/** Checks fixed superclass dispatch independently of virtual receiver overrides. */
public class SuperKeySpecializationTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("super-key-test-"),source=root.resolve("SuperFixture.java"),input=root.resolve("input.jar"),output=root.resolve("output.jar"),report=root.resolve("report.json");
  Files.writeString(source,"""
   package fixture;
   public class SuperFixture {
    public static class Base {public long work(long key){return key^7L;}}
    public static class Middle extends Base {public long work(long key){return key^19L;}public long inherited(long key){return key^23L;}}
    public static class Child extends Middle {
     public long work(long key){return key^31L;}
     public long inherited(long key){return key^37L;}
     public long known(){return super.work(123L);}
     public long unknown(long key){return super.work(key);}
    }
    public static class Leaf extends Child {public long work(long key){return key^43L;}}
    public static class Parent extends Middle {}
    public static class Inherited extends Parent {public long known(){return super.inherited(123L);}}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compilation");
  try(JarOutputStream z=new JarOutputStream(Files.newOutputStream(input));var files=Files.walk(root.resolve("fixture"))){for(Path p:files.filter(p->p.toString().endsWith(".class")).toList()){z.putNextEntry(new JarEntry(root.relativize(p).toString()));z.write(Files.readAllBytes(p));z.closeEntry();}}
  System.setProperty("recovery.inheritedMethods","true");System.setProperty("recovery.superCalls","false");SpecializeKeys.main(new String[]{input.toString(),root.resolve("baseline.jar").toString(),root.resolve("baseline.json").toString()});if(!JsonParser.parseString(Files.readString(root.resolve("baseline.json"))).getAsJsonArray().isEmpty())throw new AssertionError("Baseline superclass behavior changed");
  System.setProperty("recovery.superCalls","true");SpecializeKeys.main(new String[]{input.toString(),output.toString(),report.toString()});JsonArray rows=JsonParser.parseString(Files.readString(report)).getAsJsonArray();if(rows.size()!=2)throw new AssertionError(rows);for(JsonElement e:rows)if(!e.getAsJsonObject().get("superclassDispatch").getAsBoolean())throw new AssertionError("Missing superclass proof");
  int checks=0;try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){
   for(String name:List.of("Child","Leaf","Inherited")){Class<?> a=before.loadClass("fixture.SuperFixture$"+name),b=after.loadClass("fixture.SuperFixture$"+name);Object x=a.getConstructor().newInstance(),y=b.getConstructor().newInstance();if(!a.getMethod("known").invoke(x).equals(b.getMethod("known").invoke(y)))throw new AssertionError(name);checks++;if(!name.equals("Inherited"))for(long key:new long[]{Long.MIN_VALUE,-1,0,1,123,Long.MAX_VALUE})for(String method:List.of("work","unknown")){if(!a.getMethod(method,long.class).invoke(x,key).equals(b.getMethod(method,long.class).invoke(y,key)))throw new AssertionError(name+method);checks++;}}
  }
  System.out.println("PASS "+checks+" JVM cases; direct/inherited superclass targets, receiver overrides and unknown keys preserved");
 }
}
