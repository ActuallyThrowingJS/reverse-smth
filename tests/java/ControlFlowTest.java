import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.lang.reflect.*;
import javax.tools.ToolProvider;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import unlegit.zkm.ControlFlowDeobfuscator;

/** JVM differential checks for exception ordering, unknown guards and wide stacks. */
public class ControlFlowTest {
 static String outcome(Class<?> type,String method,int n)throws Exception{
  try{return "return:"+type.getMethod(method,int.class).invoke(null,n);}
  catch(InvocationTargetException e){Throwable t=e.getCause();return "throw:"+t.getClass().getName()+":"+t.getMessage();}
 }
 static long calls(Path jar,String name)throws Exception{
  try(JarFile z=new JarFile(jar.toFile())){ClassNode c=new ClassNode();new ClassReader(z.getInputStream(z.getJarEntry("FlowFixture.class"))).accept(c,0);long count=0;for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode&&((MethodInsnNode)n).name.equals(name))count++;return count;}
 }
 public static void main(String[] args)throws Exception{
  Path dir=Files.createTempDirectory("flow-test-");Path source=dir.resolve("FlowFixture.java"),input=dir.resolve("in.jar"),output=dir.resolve("out.jar"),report=dir.resolve("flow.tsv");
  Files.writeString(source,"""
   public class FlowFixture {
     private static int count;
     private static RuntimeException identity(RuntimeException e){return e;}
     private static synchronized RuntimeException locked(RuntimeException e){return e;}
     private static RuntimeException noisy(RuntimeException e){count++;return e;}
     public static int nested(int n){try{try{if(n<0)throw new IllegalArgumentException("negative");return n+2;}catch(RuntimeException e){throw identity(e);}}catch(IllegalArgumentException e){return -7;}}
     public static int synchronization(int n){try{try{if(n<0)throw new IllegalArgumentException();return n;}catch(RuntimeException e){throw locked(e);}}catch(IllegalArgumentException e){return 13;}}
     public static int sideEffects(int n){count=0;try{try{if(n<0)throw new IllegalArgumentException();return n;}catch(RuntimeException e){throw noisy(e);}}catch(IllegalArgumentException e){return 20+count;}}
     public static long wideStack(int n){int s=Integer.signum(n);return 123456789012L+(s==0?4L:5L)+(s!=0?9L:10L);}
     public static int unknownGuard(int n){int s=Integer.signum(n);int a=s==0?7:9;int b=s==0?13:17;return (a+b)*n;}
     public static int nullGuard(int n){Object s=n>0?new Object():null;return 17+(s==null?2:3)+(s!=null?5:7);}
     public static int monitor(int n){synchronized(FlowFixture.class){if(n<0)throw new IllegalStateException("negative");return n+5;}}
     public static int orderedCatch(int n){try{try{if(n==0)throw new IllegalArgumentException();if(n<0)throw new NullPointerException();return n;}catch(IllegalArgumentException e){throw e;}}catch(NullPointerException e){return 31;}catch(RuntimeException e){return 37;}}
     public static int switching(int n){switch(n){case -1:return 23;case 0:return 29;case 1:return 31;default:return 41;}}
   }
   """);
  if(ToolProvider.getSystemJavaCompiler().run(null,null,null,"--release","21","-d",dir.toString(),source.toString())!=0)throw new AssertionError("Fixture compilation failed");
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){jar.putNextEntry(new JarEntry("FlowFixture.class"));jar.write(Files.readAllBytes(dir.resolve("FlowFixture.class")));jar.closeEntry();}
  // Tests require the ordinary fail-closed upstream mode.
  System.clearProperty("recovery.allowVerifiedRollbacks");System.clearProperty("recovery.ownerPrefix");
  ControlFlowDeobfuscator.main(new String[]{input.toString(),output.toString(),report.toString(),"--remove-identity-rethrows","--normalize-exception-ranges","--normalize-zkm-shared-tails","--materialize-residual-stacks","--specialize-binary-sentinel-tails"});
  int checked=0;
  try(URLClassLoader before=new URLClassLoader(new URL[]{input.toUri().toURL()},ClassLoader.getPlatformClassLoader());URLClassLoader after=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){
   Class<?> a=before.loadClass("FlowFixture"),b=after.loadClass("FlowFixture");
   for(String method:List.of("nested","synchronization","sideEffects","wideStack","unknownGuard","nullGuard","monitor","orderedCatch","switching"))for(int n:new int[]{Integer.MIN_VALUE,-7,-2,-1,0,1,2,7,Integer.MAX_VALUE}){String x=outcome(a,method,n),y=outcome(b,method,n);if(!x.equals(y))throw new AssertionError(method+"("+n+"): "+x+" != "+y);checked++;}
  }
  for(String helper:List.of("locked","noisy"))if(calls(input,helper)!=calls(output,helper))throw new AssertionError("Effectful helper call removed: "+helper);
  String audit=Files.readString(report);if(!audit.contains("remove-identity-rethrow-handlers"))throw new AssertionError("Exception reduction was not exercised");
  System.out.println("PASS "+checked+" JVM differential cases; ordered catches, synchronized/effectful helpers, unknown/null guards and wide stacks");
 }
}
