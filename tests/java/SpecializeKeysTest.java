import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;

/** Exercises known keys, unknown keys, propagation and overridden dispatch in a JVM. */
public class SpecializeKeysTest {
 public static void main(String[] args)throws Exception{
  Path dir=Files.createTempDirectory("specialize-test-");Path source=dir.resolve("KeyFixture.java"),input=dir.resolve("in.jar"),output=dir.resolve("out.jar"),report=dir.resolve("keys.json");
  Files.writeString(source,"""
   package fixture;
   public class KeyFixture {
     private static long helper(long n){return n^12L;}
     public static long chain(long n){return helper(n^4L);}
     public static long known(){return chain(123L);}
     public static long unknown(long n){return chain(n);}
     public static class Base {public long work(long n){return n^7L;}}
     public static class Child extends Base {public long work(long n){return n^19L;}}
     public static long dispatch(){Base b=new Child();return b.work(123L);}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",dir.toString(),source.toString())!=0)throw new AssertionError("Fixture compilation failed");
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input));var files=Files.walk(dir.resolve("fixture"))){for(Path f:files.filter(p->p.toString().endsWith(".class")).toList()){jar.putNextEntry(new JarEntry(dir.relativize(f).toString()));jar.write(Files.readAllBytes(f));jar.closeEntry();}}
  SpecializeKeys.main(new String[]{input.toString(),output.toString(),report.toString()});
  JsonArray evidence=JsonParser.parseString(Files.readString(report)).getAsJsonArray();if(evidence.size()<2)throw new AssertionError("Key propagation was not exercised");
  for(JsonElement e:evidence)if(e.getAsJsonObject().get("originalName").getAsString().equals("work"))throw new AssertionError("Overridable method specialized");
  int checked=0;
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){
   Class<?> a=before.loadClass("fixture.KeyFixture"),b=after.loadClass("fixture.KeyFixture");
   for(String name:List.of("known","dispatch")){if(!a.getMethod(name).invoke(null).equals(b.getMethod(name).invoke(null)))throw new AssertionError(name);checked++;}
   for(String name:List.of("unknown","chain"))for(long n:new long[]{Long.MIN_VALUE,-99,-1,0,1,123,Long.MAX_VALUE}){if(!a.getMethod(name,long.class).invoke(null,n).equals(b.getMethod(name,long.class).invoke(null,n)))throw new AssertionError(name+"("+n+")");checked++;}
  }
  System.out.println("PASS "+checked+" JVM cases; constant-key propagation, generic methods and overridden dispatch preserved");
 }
}
