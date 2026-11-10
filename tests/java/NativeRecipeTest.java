import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;
import org.objectweb.asm.*;
import com.google.gson.*;

/** Runs reviewed native reconstructions in isolated fixture classes, never the mod. */
public class NativeRecipeTest {
 static Object proxy(Class<?> type,java.lang.reflect.InvocationHandler handler){return Proxy.newProxyInstance(type.getClassLoader(),new Class<?>[]{type},handler);}
 public static String fixtureDecrypt(int index,long key){return index+":"+key;}
 static void init(ClassWriter writer){MethodVisitor m=writer.visitMethod(Opcodes.ACC_PUBLIC,"<init>","()V",null,null);m.visitCode();m.visitVarInsn(Opcodes.ALOAD,0);m.visitMethodInsn(Opcodes.INVOKESPECIAL,"java/lang/Object","<init>","()V",false);m.visitInsn(Opcodes.RETURN);m.visitMaxs(0,0);m.visitEnd();}
 public static void main(String[] args)throws Throwable{
  if(args[0].equals("--child")){try(URLClassLoader loader=new URLClassLoader(new URL[]{Path.of(args[1]).toUri().toURL()},NativeRecipeTest.class.getClassLoader())){Class<?> type=loader.loadClass(args[2].replace('/','.'));Method m=type.getDeclaredMethod(args[3],Thread.class,Throwable.class);m.invoke(Modifier.isStatic(m.getModifiers())?null:type.getConstructor().newInstance(),Thread.currentThread(),new RuntimeException("fixture"));}throw new AssertionError("halt returned");}
  JsonArray all=JsonParser.parseString(Files.readString(Path.of(args[0]))).getAsJsonArray();Path dir=Files.createTempDirectory("native-recipes-test-");int checked=0;
  for(String label:List.of("client","loader")){
   List<JsonObject> rows=new ArrayList<>();for(JsonElement e:all)if(e.getAsJsonObject().get("label").getAsString().equals(label))rows.add(e.getAsJsonObject());Map<String,ClassWriter> classes=new LinkedHashMap<>();Map<String,Set<String>> fields=new HashMap<>();
   for(JsonObject row:rows){String owner=row.get("owner").getAsString();classes.computeIfAbsent(owner,k->{ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);w.visit(65,Opcodes.ACC_PUBLIC,k,null,"java/lang/Object",null);init(w);return w;});if(row.has("fieldOwner")){String fo=row.get("fieldOwner").getAsString();classes.computeIfAbsent(fo,k->{ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);w.visit(65,Opcodes.ACC_PUBLIC,k,null,"java/lang/Object",null);init(w);return w;});String fn=row.get("fieldName").getAsString(),fd=row.get("fieldDescriptor").getAsString();if(fields.computeIfAbsent(fo,k->new HashSet<>()).add(fn+fd))classes.get(fo).visitField(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC,fn,fd,null,null).visitEnd();}}
   Set<String> helpers=new HashSet<>();for(JsonObject row:rows)if(row.get("recipe").getAsString().equals("stringCallSite")){String o=row.get("decryptOwner").getAsString(),n=row.get("decryptName").getAsString();if(helpers.add(o+n)){MethodVisitor h=classes.get(o).visitMethod(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC,n,"(IJ)Ljava/lang/String;",null,null);h.visitCode();h.visitVarInsn(Opcodes.ILOAD,0);h.visitVarInsn(Opcodes.LLOAD,1);h.visitMethodInsn(Opcodes.INVOKESTATIC,"NativeRecipeTest","fixtureDecrypt","(IJ)Ljava/lang/String;",false);h.visitInsn(Opcodes.ARETURN);h.visitMaxs(0,0);h.visitEnd();}}
   int ordinal=0;for(JsonObject row:rows)classes.get(row.get("owner").getAsString()).visitMethod(Opcodes.ACC_PUBLIC|Opcodes.ACC_NATIVE|((ordinal++%2)==0?Opcodes.ACC_STATIC:0),row.get("name").getAsString(),row.get("descriptor").getAsString(),null,null).visitEnd();
   Path input=dir.resolve(label+"-input.jar"),output=dir.resolve(label+"-output.jar");try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){for(var e:classes.entrySet()){e.getValue().visitEnd();jar.putNextEntry(new JarEntry(e.getKey()+".class"));jar.write(e.getValue().toByteArray());jar.closeEntry();}}
   RestoreNativeRecipes.main(new String[]{input.toString(),label,args[label.equals("client")?1:2],args[0],output.toString()});
   try(URLClassLoader loader=new URLClassLoader(new URL[]{output.toUri().toURL()},NativeRecipeTest.class.getClassLoader())){
    for(JsonObject row:rows){Class<?> c=loader.loadClass(row.get("owner").getAsString().replace('/','.'));String desc=row.get("descriptor").getAsString();Type[] types=Type.getArgumentTypes(desc);Class<?>[] parameters=new Class<?>[types.length];for(int i=0;i<types.length;i++)parameters[i]=Class.forName(types[i].getSort()==Type.ARRAY?types[i].getDescriptor().replace('/','.'):types[i].getClassName());Method m=c.getDeclaredMethod(row.get("name").getAsString(),parameters);Object receiver=Modifier.isStatic(m.getModifiers())?null:c.getConstructor().newInstance();String kind=row.get("recipe").getAsString();java.lang.reflect.Field field=row.has("fieldOwner")?loader.loadClass(row.get("fieldOwner").getAsString().replace('/','.')).getField(row.get("fieldName").getAsString()):null;
     switch(kind){
      case "intConstant","doubleConstant","boxedInteger"->{Object value=m.invoke(receiver);double expected=row.get("value").getAsDouble();if(((Number)value).doubleValue()!=expected)throw new AssertionError(kind);checked++;}
      case "staticGet"->{for(Object value:new Object[]{null,field.getType().equals(String.class)?"probe":new ArrayList<>()}){field.set(null,value);if(m.invoke(receiver)!=value)throw new AssertionError(kind);checked++;}}
      case "staticSet"->{for(Object value:new Object[]{null,"probe"}){m.invoke(receiver,value);if(field.get(null)!=value)throw new AssertionError(kind);checked++;}}
      case "staticClear"->{for(Object value:new Object[]{null,"probe"}){field.set(null,value);m.invoke(receiver);if(field.get(null)!=null)throw new AssertionError(kind);checked++;}}
      case "setContains"->{field.set(null,new HashSet<>(List.of("allowed")));for(Object value:new Object[]{"allowed","denied",null}){if(!m.invoke(receiver,value).equals("allowed".equals(value)))throw new AssertionError(kind);checked++;}}
      case "lazyCast"->{Object nullable=proxy(parameters[0],(o,method,a)->null);if(m.invoke(receiver,nullable)!=null)throw new AssertionError(kind);checked++;Object wrong=proxy(parameters[0],(o,method,a)->"wrong-type");try{m.invoke(receiver,wrong);throw new AssertionError("Missing ClassCastException");}catch(InvocationTargetException e){if(!(e.getCause() instanceof ClassCastException))throw e;}checked++;Object failure=proxy(parameters[0],(o,method,a)->{throw new IllegalStateException("fixture");});try{m.invoke(receiver,failure);throw new AssertionError("Missing propagated exception");}catch(InvocationTargetException e){if(!(e.getCause() instanceof IllegalStateException))throw e;}checked++;}
      case "contextClassLoader"->{Thread thread=Thread.currentThread();ClassLoader previous=thread.getContextClassLoader();try{for(ClassLoader value:new ClassLoader[]{previous,null}){thread.setContextClassLoader(value);if(m.invoke(receiver)!=value)throw new AssertionError(kind);checked++;}}finally{thread.setContextClassLoader(previous);}}
      case "modVersion"->{Class<?> version=Class.forName("net.fabricmc.loader.api.Version"),metadata=Class.forName("net.fabricmc.loader.api.metadata.ModMetadata");Object v=proxy(version,(o,method,a)->"fixture-version"),md=proxy(metadata,(o,method,a)->v),container=proxy(parameters[0],(o,method,a)->md);if(!m.invoke(receiver,container).equals("fixture-version"))throw new AssertionError(kind);checked++;try{m.invoke(receiver,new Object[]{null});throw new AssertionError("Missing NullPointerException");}catch(InvocationTargetException e){if(!(e.getCause() instanceof NullPointerException))throw e;}checked++;}
      case "stringCallSite"->{java.lang.invoke.MethodType signature=java.lang.invoke.MethodType.methodType(String.class,int.class,long.class);for(int index:new int[]{0,1,-7}){java.lang.invoke.MutableCallSite site=new java.lang.invoke.MutableCallSite(signature);String expected=fixtureDecrypt(index,123456789L);Object value=m.invoke(receiver,java.lang.invoke.MethodHandles.lookup(),site,"fixture",new Object[]{index,123456789L});if(!expected.equals(value)||!expected.equals(site.getTarget().invokeWithArguments(999,55L)))throw new AssertionError("Call-site target mismatch");checked++;}try{m.invoke(receiver,java.lang.invoke.MethodHandles.lookup(),new java.lang.invoke.MutableCallSite(signature),"fixture",new Object[]{1});throw new AssertionError("Missing bounds exception");}catch(InvocationTargetException e){if(!(e.getCause() instanceof ArrayIndexOutOfBoundsException))throw e;}checked++;}
      case "halt"->{Process process=new ProcessBuilder(Path.of(System.getProperty("java.home"),"bin/java").toString(),"-cp",System.getProperty("java.class.path"),NativeRecipeTest.class.getName(),"--child",output.toString(),row.get("owner").getAsString(),row.get("name").getAsString()).redirectErrorStream(true).start();if(!process.waitFor(15,TimeUnit.SECONDS)){process.destroyForcibly();throw new AssertionError("Child halt timed out");}String text=new String(process.getInputStream().readAllBytes());if(process.exitValue()!=1||!text.isEmpty())throw new AssertionError("Unexpected child outcome: "+process.exitValue()+" "+text);checked++;}
      default->throw new AssertionError(kind);
     }
    }
   }
  }
  System.out.println("PASS "+checked+" fixture cases across all "+all.size()+" reviewed native bodies; halts confined to child JVMs");
 }
}
