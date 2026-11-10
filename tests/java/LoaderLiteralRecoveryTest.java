import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.util.concurrent.TimeUnit;
import javax.tools.ToolProvider;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;

/** Tests bounded extraction, boxed-cache types and literal recovery against real fixture behavior. */
public class LoaderLiteralRecoveryTest {
 static void extract(Path input,Path output,int cap)throws Exception{
  Process process=new ProcessBuilder(Path.of(System.getProperty("java.home"),"bin/java").toString(),"-Drecovery.ownerPrefix=lol/polinexclient/loader/","-Drecovery.interpreterTripCap="+cap,"-cp",System.getProperty("java.class.path"),"ExtractCrypto",input.toString(),output.toString()).redirectErrorStream(true).redirectOutput(output.resolveSibling(output.getFileName()+".log").toFile()).start();if(!process.waitFor(30,TimeUnit.SECONDS)){process.destroyForcibly();throw new AssertionError("Extraction exceeded bound");}if(process.exitValue()!=0)throw new AssertionError("Extraction process failed");
 }
 public static void main(String[] args)throws Exception{
  Path root=Files.createTempDirectory("loader-literal-test-"),source=root.resolve("SnapshotFixture.java"),input=root.resolve("input.jar"),output=root.resolve("output.jar");String owner="lol/polinexclient/loader/SnapshotFixture";
  Files.writeString(source,"""
   package lol.polinexclient.loader;
   public class SnapshotFixture {
    private static final long[] numbers={101L^23L,203L^23L};
    private static final Long[] cache=new Long[2];
    private static final Long[] boxed={7L,null};
    private static final Integer[] integers={5,null};
    private static final String[] encrypted={"j"};
    private static final String[] plain=new String[1];
    public static int effects; public static String marker;
    static {int sum=0;for(int i=0;i<30000;i++)sum+=i;marker="complete";}
    private static long number(int index,long key){int at=index^((int)key&1);if(cache[at]==null)cache[at]=numbers[at]^key;return cache[at];}
    private static String text(int index,int key){if(plain[index]==null){char[] data=encrypted[index].toCharArray();for(int i=0;i<data.length;i++)data[i]=(char)(data[i]^key);plain[index]=new String(data).intern();}return plain[index];}
    private static long impure(int index,long key){effects++;return numbers[index]^key;}
    public static long numeric(){return number(0,23L);}
    public static String greeting(){return text(0,3);}
    public static long withEffect(){return impure(0,23L);}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Fixture compile");try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){jar.putNextEntry(new JarEntry(owner+".class"));jar.write(Files.readAllBytes(root.resolve(owner+".class")));jar.closeEntry();}
  extract(input,root.resolve("low"),100);extract(input,root.resolve("high"),200000);JsonObject low=JsonParser.parseString(Files.readString(root.resolve("low/outcomes.json"))).getAsJsonObject(),high=JsonParser.parseString(Files.readString(root.resolve("high/outcomes.json"))).getAsJsonObject();if(!low.get(owner).getAsString().contains("dongu")||!high.get(owner).getAsString().equals("completed"))throw new AssertionError("Loop bounds were not respected");
  JsonObject state=JsonParser.parseString(Files.readString(root.resolve("high/crypto-state.json"))).getAsJsonObject().getAsJsonObject(owner);ClassNode c=new ClassNode();new ClassReader(Files.readAllBytes(root.resolve(owner+".class"))).accept(c,0);Map<String,Object> values=ResolveReferences.snapshotValues(c,state);Object[] boxed=(Object[])((com.zkmdeobf.MiniInterpreter.Arr)values.get(owner+".boxed")).data,integers=(Object[])((com.zkmdeobf.MiniInterpreter.Arr)values.get(owner+".integers")).data;if(!(boxed[0] instanceof Long)||!(integers[0] instanceof Integer)||boxed[1]!=null||integers[1]!=null||!state.get("marker").getAsString().equals("complete"))throw new AssertionError("Snapshot cache types lost");
  RestoreLiteralHelpers.main(new String[]{input.toString(),root.resolve("high/crypto-state.json").toString(),output.toString(),root.resolve("restored.json").toString()});JsonArray restored=JsonParser.parseString(Files.readString(root.resolve("restored.json"))).getAsJsonArray();if(restored.size()!=2)throw new AssertionError(restored);
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> a=before.loadClass(owner.replace('/','.')),b=after.loadClass(owner.replace('/','.'));for(String method:List.of("numeric","greeting","withEffect"))if(!a.getMethod(method).invoke(null).equals(b.getMethod(method).invoke(null)))throw new AssertionError(method);if(a.getField("effects").getInt(null)!=1||b.getField("effects").getInt(null)!=1)throw new AssertionError("Side effect removed");}
  System.out.println("PASS bounded extraction, larger finite loops, typed boxed caches, numeric/string JVM equivalence and side-effect rejection");
 }
}
