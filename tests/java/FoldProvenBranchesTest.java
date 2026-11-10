import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import com.google.gson.*;

/** JVM checks for proven primitive branches, unknown inputs, side effects and exception ranges. */
public class FoldProvenBranchesTest {
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("proven-branch-test-"),source=root.resolve("BranchFixture.java"),input=root.resolve("input.jar"),intermediate=root.resolve("intermediate.jar"),output=root.resolve("output.jar"),report=root.resolve("branches.json");
  Files.writeString(source,"""
   package fixture;
   public class BranchFixture {
    public static int effects;
    private static int effect(int value){effects++;return value;}
    public static long exact(long divisor,boolean flag){long seed=123456789L;long mixed=seed^31L;int result;
     if(mixed>0)result=1;else result=effect(100);
     if(flag)result+=effect(2);else result+=effect(3);
     try{if((seed^31L)<0)throw new IllegalArgumentException("unreachable");return result+100L/divisor;}catch(ArithmeticException exception){return effect(99);}}
    public static int overflow(){int a=Integer.MAX_VALUE,b=1;int x=4,y=4;if(a+b<0){if(x==y)return effect(7);return effect(8);}return effect(9);}
    public static int unknown(long key){if((key^5L)<0)return effect(1);return effect(2);}
    public static int effectful(){if(effect(7)>0)return 11;return 13;}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compile");try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){jar.putNextEntry(new JarEntry("fixture/BranchFixture.class"));jar.write(Files.readAllBytes(root.resolve("fixture/BranchFixture.class")));jar.closeEntry();}
  System.setProperty("recovery.ownerPrefix","fixture/");System.setProperty("recovery.allowVerifiedRollbacks","true");FoldProvenBranches.main(new String[]{input.toString(),intermediate.toString(),report.toString()});JsonArray proofs=JsonParser.parseString(Files.readString(report)).getAsJsonArray();if(proofs.size()<4)throw new AssertionError("Insufficient branch coverage");for(JsonElement e:proofs)if(Set.of("unknown","effectful").contains(e.getAsJsonObject().get("method").getAsString()))throw new AssertionError("Unknown/effectful branch assumed");
  unlegit.zkm.ControlFlowDeobfuscator.main(new String[]{intermediate.toString(),output.toString(),root.resolve("flow.tsv").toString(),"--remove-identity-rethrows","--normalize-exception-ranges","--normalize-zkm-shared-tails","--materialize-residual-stacks","--specialize-binary-sentinel-tails"});int cases=0;
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> a=before.loadClass("fixture.BranchFixture"),b=after.loadClass("fixture.BranchFixture");for(long key:new long[]{Long.MIN_VALUE,-99,-1,0,1,5,123,Long.MAX_VALUE}){for(boolean flag:new boolean[]{false,true}){a.getField("effects").setInt(null,0);b.getField("effects").setInt(null,0);if(!a.getMethod("exact",long.class,boolean.class).invoke(null,key,flag).equals(b.getMethod("exact",long.class,boolean.class).invoke(null,key,flag))||a.getField("effects").getInt(null)!=b.getField("effects").getInt(null))throw new AssertionError("Exception/side-effect behavior differs");cases++;}if(!a.getMethod("unknown",long.class).invoke(null,key).equals(b.getMethod("unknown",long.class).invoke(null,key)))throw new AssertionError("Unknown key branch differs");cases++;}for(String method:List.of("overflow","effectful")){a.getField("effects").setInt(null,0);b.getField("effects").setInt(null,0);if(!a.getMethod(method).invoke(null).equals(b.getMethod(method).invoke(null))||a.getField("effects").getInt(null)!=b.getField("effects").getInt(null))throw new AssertionError(method);cases++;}}
  System.out.println("PASS "+cases+" JVM cases; long comparisons, integer overflow, two-int branches, unknown/effectful conditions, exceptions and frame normalization");
 }
}
