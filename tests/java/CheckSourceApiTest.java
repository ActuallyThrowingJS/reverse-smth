import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import com.google.gson.*;
/** Rejects empty or weaker source replacements, including Java 25 class files. */
public class CheckSourceApiTest {
 static byte[] fixture(String name,boolean omit,boolean nativeBody,boolean volatileField){ClassWriter c=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.visit(Opcodes.V25,Opcodes.ACC_PUBLIC,name,null,"java/lang/Object",null);c.visitField(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|(volatileField?Opcodes.ACC_VOLATILE:0),"value","I",null,null).visitEnd();if(!omit){MethodVisitor m=c.visitMethod(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC|(nativeBody?Opcodes.ACC_NATIVE:0),"work","()I",null,null);if(!nativeBody){m.visitCode();m.visitInsn(Opcodes.ICONST_1);m.visitInsn(Opcodes.IRETURN);m.visitMaxs(0,0);}m.visitEnd();}c.visitEnd();return c.toByteArray();}
 public static void main(String[] args)throws Exception{Path dir=Files.createTempDirectory("source-api-test-"),compiled=dir.resolve("classes"),input=dir.resolve("baseline.jar"),report=dir.resolve("compiler.json"),result=dir.resolve("checked.json");Files.createDirectories(compiled.resolve("fixture"));List<String> names=List.of("Good","MissingMethod","NativeRegression","VolatileRegression");try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(input))){for(String n:names){jar.putNextEntry(new JarEntry("fixture/"+n+".class"));jar.write(fixture("fixture/"+n,false,false,true));jar.closeEntry();Files.write(compiled.resolve("fixture/"+n+".class"),fixture("fixture/"+n,n.equals("MissingMethod"),n.equals("NativeRegression"),!n.equals("VolatileRegression")));}}
  Files.writeString(report,new Gson().toJson(Map.of("approved",names.stream().map(n->"fixture/"+n+".java").toList())));CheckSourceApi.main(new String[]{report.toString(),compiled.toString(),input.toString(),result.toString()});JsonObject checked=JsonParser.parseString(Files.readString(result)).getAsJsonObject();if(checked.getAsJsonArray("approved").size()!=1||!checked.getAsJsonArray("approved").get(0).getAsString().equals("fixture/Good.java")||checked.getAsJsonObject("rejected").size()!=3)throw new AssertionError("Source API gate admitted a regression");System.out.println("PASS Java 25 class reading; missing-member, native-body and volatile-field regressions rejected");
 }
}
