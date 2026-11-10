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
     public static long knownSplit(){return split(123,(short)7,'x');}
     public static long split(int a,short b,char c){long key=((long)a<<32)^((long)b<<16)^c;return chain(key);}
     public static long unknown(long n){return chain(n);}
     public static class Base {public long work(long n){return n^7L;}public static long inheritedStatic(long n){return n^13L;}public final long inheritedFinal(long n){return n^17L;}}
     public static class Child extends Base {public long work(long n){return n^19L;}}
     public static final class Closed extends Base {}
     public static long inherited(){return Child.inheritedStatic(123L)^new Child().inheritedFinal(123L);}
     public static long closed(){return new Closed().work(123L);}
     public static long dispatch(){Base b=new Child();return b.work(123L);}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",dir.toString(),source.toString())!=0)throw new AssertionError("Fixture compilation failed");
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input));var files=Files.walk(dir.resolve("fixture"))){for(Path f:files.filter(p->p.toString().endsWith(".class")).toList()){jar.putNextEntry(new JarEntry(dir.relativize(f).toString()));jar.write(Files.readAllBytes(f));jar.closeEntry();}}
  System.setProperty("recovery.inheritedMethods","false");System.setProperty("recovery.splitIntegerKeys","false");
  Path legacy=dir.resolve("legacy.jar"),legacyReport=dir.resolve("legacy.json");SpecializeKeys.main(new String[]{input.toString(),legacy.toString(),legacyReport.toString()});
  for(JsonElement e:JsonParser.parseString(Files.readString(legacyReport)).getAsJsonArray())if(Set.of("inheritedStatic","inheritedFinal","work","split").contains(e.getAsJsonObject().get("originalName").getAsString()))throw new AssertionError("Opt-in specialization leaked into baseline mode");
  System.setProperty("recovery.inheritedMethods","true");System.setProperty("recovery.splitIntegerKeys","true");
  SpecializeKeys.main(new String[]{input.toString(),output.toString(),report.toString()});
  JsonArray evidence=JsonParser.parseString(Files.readString(report)).getAsJsonArray();if(evidence.size()<2)throw new AssertionError("Key propagation was not exercised");
  Set<String> specializedNames=new HashSet<>();for(JsonElement e:evidence)specializedNames.add(e.getAsJsonObject().get("originalName").getAsString());
  if(!specializedNames.containsAll(Set.of("inheritedStatic","inheritedFinal","work")))throw new AssertionError("Inherited/final receiver resolution was not exercised");
  try(JarFile result=new JarFile(output.toFile())){org.objectweb.asm.tree.ClassNode c=new org.objectweb.asm.tree.ClassNode();new org.objectweb.asm.ClassReader(result.getInputStream(result.getJarEntry("fixture/KeyFixture.class")).readAllBytes()).accept(c,0);for(org.objectweb.asm.tree.MethodNode m:c.methods)if(m.name.equals("dispatch")){boolean originalCall=false;for(org.objectweb.asm.tree.AbstractInsnNode n:m.instructions)if(n instanceof org.objectweb.asm.tree.MethodInsnNode call&&call.name.equals("work"))originalCall=true;if(!originalCall)throw new AssertionError("Overridable invocation redirected");}}
  int checked=0;
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){
   Class<?> a=before.loadClass("fixture.KeyFixture"),b=after.loadClass("fixture.KeyFixture");
   for(String name:List.of("known","dispatch","knownSplit","inherited","closed")){if(!a.getMethod(name).invoke(null).equals(b.getMethod(name).invoke(null)))throw new AssertionError(name);checked++;}
   for(String name:List.of("unknown","chain"))for(long n:new long[]{Long.MIN_VALUE,-99,-1,0,1,123,Long.MAX_VALUE}){if(!a.getMethod(name,long.class).invoke(null,n).equals(b.getMethod(name,long.class).invoke(null,n)))throw new AssertionError(name+"("+n+")");checked++;}
   for(int n:new int[]{Integer.MIN_VALUE,-99,-1,0,1,123,Integer.MAX_VALUE}){Object[] parameters={n,(short)n,(char)n};if(!a.getMethod("split",int.class,short.class,char.class).invoke(null,parameters).equals(b.getMethod("split",int.class,short.class,char.class).invoke(null,parameters)))throw new AssertionError("split key");checked++;}
  }
  System.out.println("PASS "+checked+" JVM cases; constant-key propagation, generic methods and overridden dispatch preserved");
 }
}
