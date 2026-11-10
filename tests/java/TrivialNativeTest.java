import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.lang.reflect.Method;
import org.objectweb.asm.*;
import com.google.gson.*;

/** Checks generated Java bodies in a JVM and rejects a modified native input. */
public class TrivialNativeTest {
 public static void main(String[] args)throws Exception{
  Path dir=Files.createTempDirectory("native-java-test-"),input=dir.resolve("in.jar"),output=dir.resolve("out.jar");
  JsonArray rows=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();Map<String,ClassWriter> classes=new LinkedHashMap<>();Map<String,Boolean> statics=new HashMap<>();int index=0;
  for(JsonElement e:rows){JsonObject row=e.getAsJsonObject();String owner=row.get("owner").getAsString();ClassWriter writer=classes.get(owner);if(writer==null){writer=new ClassWriter(ClassWriter.COMPUTE_MAXS);writer.visit(65,Opcodes.ACC_PUBLIC,owner,null,"java/lang/Object",null);MethodVisitor init=writer.visitMethod(Opcodes.ACC_PUBLIC,"<init>","()V",null,null);init.visitCode();init.visitVarInsn(Opcodes.ALOAD,0);init.visitMethodInsn(Opcodes.INVOKESPECIAL,"java/lang/Object","<init>","()V",false);init.visitInsn(Opcodes.RETURN);init.visitMaxs(0,0);init.visitEnd();classes.put(owner,writer);}
   String name=row.get("name").getAsString(),desc=row.get("descriptor").getAsString();boolean statik=(index++%2)==0;statics.put(owner+'\t'+name+'\t'+desc,statik);writer.visitMethod(Opcodes.ACC_PUBLIC|Opcodes.ACC_NATIVE|(statik?Opcodes.ACC_STATIC:0),name,desc,null,null).visitEnd();
  }
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){for(var entry:classes.entrySet()){entry.getValue().visitEnd();jar.putNextEntry(new JarEntry(entry.getKey()+".class"));jar.write(entry.getValue().toByteArray());jar.closeEntry();}}
  RestoreTrivialNatives.main(new String[]{input.toString(),args[0],args[1],output.toString()});int checked=0;
  try(URLClassLoader loader=new URLClassLoader(new URL[]{output.toUri().toURL()},TrivialNativeTest.class.getClassLoader())){
   for(JsonElement e:rows){JsonObject row=e.getAsJsonObject();Class<?> type=loader.loadClass(row.get("owner").getAsString().replace('/','.'));String name=row.get("name").getAsString(),desc=row.get("descriptor").getAsString();Type[] arguments=Type.getArgumentTypes(desc);Class<?>[] parameters=new Class<?>[arguments.length];for(int i=0;i<arguments.length;i++)parameters[i]=Class.forName(arguments[i].getClassName());Method m=type.getDeclaredMethod(name,parameters);Object receiver=statics.get(row.get("owner").getAsString()+'\t'+name+'\t'+desc)?null:type.getConstructor().newInstance();
    for(int trial=0;trial<2;trial++){Object[] values=new Object[parameters.length];if(trial==1)for(int i=0;i<values.length;i++){Class<?> p=parameters[i];values[i]=p.equals(String.class)?"probe":p.equals(MatchException.class)?new MatchException("probe",null):p.equals(Exception.class)?new Exception("probe"):p.equals(Throwable.class)?new Throwable("probe"):p.getConstructor().newInstance();}
     Object result=m.invoke(receiver,values);if(row.get("reconstruction").getAsString().equals("identity-first-argument")&&result!=values[0])throw new AssertionError("Object identity changed");if(row.get("reconstruction").getAsString().equals("void")&&result!=null)throw new AssertionError("Void result changed");checked++;
    }
   }
  }
  byte[] changed=Files.readAllBytes(Path.of(args[0]));changed[rows.get(0).getAsJsonObject().get("fileOffset").getAsInt()]^=1;Path bad=dir.resolve("modified.so"),rejected=dir.resolve("rejected.jar");Files.write(bad,changed);
  try{RestoreTrivialNatives.main(new String[]{input.toString(),bad.toString(),args[1],rejected.toString()});throw new AssertionError("Modified image accepted");}catch(IllegalArgumentException expected){}
  if(Files.exists(rejected))throw new AssertionError("Rejected image emitted output");
  System.out.println("PASS "+checked+" JVM cases across nine native bodies; static/instance locals, null/object identity, empty void and changed-image rejection");
 }
}
