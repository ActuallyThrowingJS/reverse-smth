import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;

/** Executes a real invokedynamic key consumer without XOR, preserving unknown callers. */
public class DirectKeyConsumerTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("direct-key-test-"),source=root.resolve("DirectKeyFixture.java"),input=root.resolve("input.jar"),output=root.resolve("output.jar"),report=root.resolve("report.json");
  Files.writeString(source,"""
   package fixture;
   public class DirectKeyFixture {
    public static long passthrough(long first,long second){return second;}
    public static long target(long key){return passthrough(123L,key);}
    public static long nonKey(long business){return passthrough(business,77L);}
    public static long known(){return target(77L);}
    public static long knownNonKey(){return nonKey(99L);}
    public static long unknown(long key){return target(key);}
    public static java.lang.invoke.CallSite bootstrap(java.lang.invoke.MethodHandles.Lookup lookup,String name,java.lang.invoke.MethodType type) throws ReflectiveOperationException {
     return new java.lang.invoke.ConstantCallSite(lookup.findStatic(DirectKeyFixture.class,"passthrough",type));
    }
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compilation");
  ClassNode c=new ClassNode();new ClassReader(Files.readAllBytes(root.resolve("fixture/DirectKeyFixture.class"))).accept(c,0);Handle bootstrap=new Handle(Opcodes.H_INVOKESTATIC,c.name,"bootstrap","(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",false);
  for(MethodNode m:c.methods)if(Set.of("target","nonKey").contains(m.name))for(AbstractInsnNode n:m.instructions.toArray())if(n instanceof MethodInsnNode call&&call.name.equals("passthrough"))m.instructions.set(n,new InvokeDynamicInsnNode("dispatch",call.desc,bootstrap));
  ClassWriter writer=new ClassWriter(0);c.accept(writer);try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){jar.putNextEntry(new JarEntry(c.name+".class"));jar.write(writer.toByteArray());jar.closeEntry();}
  System.setProperty("recovery.directKeyConsumers","false");SpecializeKeys.main(new String[]{input.toString(),root.resolve("baseline.jar").toString(),root.resolve("baseline.json").toString()});if(!JsonParser.parseString(Files.readString(root.resolve("baseline.json"))).getAsJsonArray().isEmpty())throw new AssertionError("Baseline behavior changed");
  System.setProperty("recovery.directKeyConsumers","true");SpecializeKeys.main(new String[]{input.toString(),output.toString(),report.toString()});JsonArray evidence=JsonParser.parseString(Files.readString(report)).getAsJsonArray();if(evidence.size()!=1||!evidence.get(0).getAsJsonObject().get("originalName").getAsString().equals("target")||!evidence.get(0).getAsJsonObject().get("keyConsumerKind").getAsString().equals("Direct protector key argument"))throw new AssertionError(evidence);
  int checks=0;try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> a=before.loadClass("fixture.DirectKeyFixture"),b=after.loadClass("fixture.DirectKeyFixture");for(String name:List.of("known","knownNonKey")){if(!a.getMethod(name).invoke(null).equals(b.getMethod(name).invoke(null)))throw new AssertionError(name);checks++;}for(String name:List.of("target","unknown"))for(long key:new long[]{Long.MIN_VALUE,-1,0,1,77,123,Long.MAX_VALUE}){if(!a.getMethod(name,long.class).invoke(null,key).equals(b.getMethod(name,long.class).invoke(null,key)))throw new AssertionError(name);checks++;}}
  System.out.println("PASS "+checks+" JVM cases for direct invokedynamic keys; generic/unknown inputs and unrelated business arguments preserved");
 }
}
