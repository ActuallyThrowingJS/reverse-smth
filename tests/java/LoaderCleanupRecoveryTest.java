import java.nio.file.*;
import java.net.*;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.jar.*;
import javax.tools.ToolProvider;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.commons.*;

/** No application clinit or native execution. Compares one caller-proven body with Java recovery. */
public class LoaderCleanupRecoveryTest {
 static final String FIXTURE="fixture/LoaderCleanupFixture";
 static final String OWNER="lol/polinexclient/loader/IIIlIlllllIllIIIlIIIlIIIlIlIIIlIIlIlIlllIlIIlIlIlllIIllllIlIlIIlIIlIlIlIllIlIIllIlIlI";
 static final String GUARD="lol/polinexclient/loader/IIlIIIllllIlllllllllIIllIllllIlIIIIllIlIlllllIIIllIllIIllIlIlllllllllllllIIIIlIllIllI";
 static final String METHOD="IllIIllllIllllIllIlIIlIlIIlIlllllIlIIlIIIIIIIIIIIllllIIIIllIlIIlIIIlIlIIIlllllllIlIlI$recovered$a35241ef3c05d2d9";
 static final Map<String,String> MEMBERS=Map.of(METHOD,"finishInitialization",
 "IIIIIIlIllIllIlIlIllllllIlIIIIIlIIIlIlIlIlllIIlllIIIIIIllIlllllIIlIIlIllIIIllllllIIII","preparedPayload",
 "IIllIIIIIIIllIlIlIIIllllllIlIllIllIllIlIlIllIIlIIIllIlIIIlllIIlIIIlIIlllIlIIIllIIIIIl","payloadClassLoader",
 "IIllIIlIIlIIIllllIllllIlIIIIlIIIIIIIlIIIllIIlllllIlIlIllIIlllllIIIIIIIIlIlIlIlIlIIIll","skipInitialization",
 "IIllIIIIllIIllIIllIIIIIIIllIlllllIlIIlIIllIlIIllIlllIIIlIIlIIIIlIIllIIIlIIlIlIlIllIII$recovered$8eae88b1c14cdf6b","definePayload");
 static Path compile(Path root)throws Exception{
  Files.createDirectories(root);Path source=root.resolve("LoaderCleanupFixture.java");
  Files.writeString(source,"package fixture; public class LoaderCleanupFixture {\n"+
   "public static byte[] preparedPayload, observed; public static ClassLoader payloadClassLoader; public static boolean skipInitialization, fail; public static int calls; public static long observedKey;\n"+
   "public static void definePayload(byte[] payload,long key){calls++;observed=payload.clone();observedKey=key;if(fail)throw new IllegalStateException(\"fixture failure\");}\n"+
   Files.readString(Path.of("reconstruction/loader-java/finish-initialization.java.fragment"))+"\n}\n");
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",root.toString(),source.toString())!=0)throw new AssertionError("Compile recovered Java");return root.resolve(FIXTURE+".class");
 }
 static void extract(Path input,Path output)throws Exception{
  Path root=Files.createTempDirectory("loader-cleanup-extract-");ClassNode fixture=new ClassNode();new ClassReader(Files.readAllBytes(compile(root))).accept(fixture,0);
  ClassNode original=new ClassNode();try(JarFile jar=new JarFile(input.toFile())){new ClassReader(jar.getInputStream(jar.getJarEntry(OWNER+".class")).readAllBytes()).accept(original,0);}
  MethodNode source=original.methods.stream().filter(m->m.name.equals(METHOD)&&m.desc.equals("(J)V")).findFirst().orElseThrow();
  MethodNode remapped=new MethodNode(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC,"finishInitialization","(J)V",null,null);
  Remapper names=new Remapper(){public String map(String name){return name.equals(OWNER)||name.equals(GUARD)?FIXTURE:name;}public String mapFieldName(String o,String n,String d){return MEMBERS.getOrDefault(n,n);}public String mapMethodName(String o,String n,String d){return MEMBERS.getOrDefault(n,n);}};
  source.accept(new MethodRemapper(remapped,names));fixture.methods.removeIf(m->m.name.equals("finishInitialization"));fixture.methods.add(remapped);
  // Reject unexpected application dependencies rather than silently modeling them.
  for(AbstractInsnNode n:remapped.instructions){String owner=n instanceof FieldInsnNode f?f.owner:n instanceof MethodInsnNode m?m.owner:null;if(owner!=null&&!owner.equals(FIXTURE)&&!owner.startsWith("java/"))throw new AssertionError("Unmodeled owner "+owner);}
  ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);fixture.accept(writer);Files.createDirectories(output.getParent());Files.write(output,writer.toByteArray());
 }
 static String run(Class<?> c,boolean guard,byte[] payload,boolean loader,boolean fail,long key)throws Exception{
  byte[] bytes=payload==null?null:payload.clone();c.getField("preparedPayload").set(null,bytes);c.getField("payloadClassLoader").set(null,loader?ClassLoader.getPlatformClassLoader():null);c.getField("skipInitialization").setBoolean(null,guard);c.getField("fail").setBoolean(null,fail);c.getField("calls").setInt(null,0);c.getField("observed").set(null,null);c.getField("observedKey").setLong(null,0);
  PrintStream previous=System.out;ByteArrayOutputStream captured=new ByteArrayOutputStream();String exception="none";try(PrintStream out=new PrintStream(captured)){System.setOut(out);try{c.getMethod("finishInitialization",long.class).invoke(null,key);}catch(InvocationTargetException e){exception=e.getCause().getClass().getName()+":"+e.getCause().getMessage();}}finally{System.setOut(previous);}
  return Arrays.asList(exception,captured.toString(),Arrays.toString(bytes),c.getField("preparedPayload").get(null)==null,c.getField("calls").getInt(null),c.getField("observedKey").getLong(null),Arrays.toString((byte[])c.getField("observed").get(null))).toString();
 }
 public static void main(String[] args)throws Exception{
  if(args.length==3&&args[0].equals("--extract")){extract(Path.of(args[1]),Path.of(args[2]));return;}
  Path root=Files.createTempDirectory("loader-cleanup-check-"),before=root.resolve("before"),after=root.resolve("after");Path compiled=compile(after);Path original=before.resolve(FIXTURE+".class");Files.createDirectories(original.getParent());Files.copy(Path.of("tests/data/loader-cleanup-original.class"),original);
  int cases=0;try(URLClassLoader a=new URLClassLoader(new URL[]{before.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader b=new URLClassLoader(new URL[]{after.toUri().toURL()},ClassLoader.getPlatformClassLoader())){Class<?> old=a.loadClass(FIXTURE.replace('/','.')),recovered=b.loadClass(FIXTURE.replace('/','.'));for(boolean guard:new boolean[]{false,true})for(byte[] payload:new byte[][]{null,new byte[0],new byte[]{1,-1,42}})for(boolean loader:new boolean[]{false,true})for(boolean fail:new boolean[]{false,true})for(long key:new long[]{0,-1,Long.MAX_VALUE}){String left=run(old,guard,payload,loader,fail,key),right=run(recovered,guard,payload,loader,fail,key);if(!left.equals(right))throw new AssertionError("Behavior differs: "+left+" / "+right);cases++;}}
  System.out.println("PASS "+cases+" isolated JVM cases: guard, payload, loader, callback exceptions, output, key, byte zeroization and field clearing; no application initialization/native execution");
 }
}
