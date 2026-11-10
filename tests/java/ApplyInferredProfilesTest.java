import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;
/** Exercises final-field contexts and constructor stack-map/local-slot preservation. */
public class ApplyInferredProfilesTest {
 public static void main(String[] args)throws Exception{
  Path dir=Files.createTempDirectory("inferred-context-test-"),source=dir.resolve("ContextFixture.java"),input=dir.resolve("input.jar"),output=dir.resolve("output.jar"),profiles=dir.resolve("profiles.json"),report=dir.resolve("variants.json");
  Files.writeString(source,"""
   package fixture;
   public class ContextFixture {
    private final long key; private final long value;
    public ContextFixture(long key,String label){this.key=key;long temporary=key^9L;if(label!=null)temporary+=label.length();this.value=temporary;}
    public long value(){return value;}
    public long callback(int number){long temporary=this.key;if(number<0)temporary+=3L;return temporary^number;}
    @Deprecated public static long calculation(long key,int number){return key^number;}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-g","-d",dir.toString(),source.toString())!=0)throw new AssertionError("Fixture compile failed");try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){jar.putNextEntry(new JarEntry("fixture/ContextFixture.class"));jar.write(Files.readAllBytes(dir.resolve("fixture/ContextFixture.class")));jar.closeEntry();}
  List<Map<String,Object>> rows=List.of(Map.of("owner","fixture/ContextFixture","name","<init>","descriptor","(JLjava/lang/String;)V","bindings",Map.of("arg:1",7L)),Map.of("owner","fixture/ContextFixture","name","callback","descriptor","(I)J","bindings",Map.of("field:fixture/ContextFixture.key",7L)),Map.of("owner","fixture/ContextFixture","name","calculation","descriptor","(JI)J","bindings",Map.of("arg:0",7L)));Files.writeString(profiles,new Gson().toJson(rows));ApplyInferredProfiles.main(new String[]{input.toString(),profiles.toString(),output.toString(),report.toString()});JsonArray variants=JsonParser.parseString(Files.readString(report)).getAsJsonArray();String callback=variants.get(1).getAsJsonObject().get("variantName").getAsString(),calculation=variants.get(2).getAsJsonObject().get("variantName").getAsString();int checks=0;
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> a=before.loadClass("fixture.ContextFixture"),b=after.loadClass("fixture.ContextFixture");for(String label:new String[]{null,"example"}){Object original=a.getConstructor(long.class,String.class).newInstance(7L,label),clone=b.getConstructor(long.class,String.class,boolean.class).newInstance(7L,label,true);if(!a.getMethod("value").invoke(original).equals(b.getMethod("value").invoke(clone)))throw new AssertionError("Constructor context differs");checks++;for(int n:new int[]{Integer.MIN_VALUE,-1,0,1,Integer.MAX_VALUE}){if(!a.getMethod("callback",int.class).invoke(original,n).equals(b.getMethod(callback,int.class).invoke(clone,n)))throw new AssertionError("Field context differs");if(!a.getMethod("calculation",long.class,int.class).invoke(null,7L,n).equals(b.getMethod(calculation,long.class,int.class).invoke(null,7L,n)))throw new AssertionError("Argument context differs");checks+=2;}}Object unrelated=b.getConstructor(long.class,String.class).newInstance(99L,"other");Object old=a.getConstructor(long.class,String.class).newInstance(99L,"other");if(!a.getMethod("callback",int.class).invoke(old,5).equals(b.getMethod("callback",int.class).invoke(unrelated,5)))throw new AssertionError("Original method changed");checks++;if(b.getMethod(calculation,long.class,int.class).getAnnotation(Deprecated.class)!=null||b.getMethod("calculation",long.class,int.class).getAnnotation(Deprecated.class)==null)throw new AssertionError("Analysis annotation isolation failed");checks++;}
  System.out.println("PASS "+checks+" context cases; constructor frames, final-field snapshots, parameter bindings and original methods preserved");
 }
}
