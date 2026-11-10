import java.nio.file.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import com.google.gson.*;

/** Tests dispatch, same-name isolation, class renaming and metadata. */
public class SemanticRemapTest {
 static final String NAME="IIIIllllIIIIllll";
 static byte[] fixture(String name,String parent,int value)throws Exception{
  ClassWriter c=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.visit(65,Opcodes.ACC_PUBLIC,name,null,parent,null);
  MethodVisitor init=c.visitMethod(Opcodes.ACC_PUBLIC,"<init>","()V",null,null);init.visitCode();init.visitVarInsn(Opcodes.ALOAD,0);init.visitMethodInsn(Opcodes.INVOKESPECIAL,parent,"<init>","()V",false);init.visitInsn(Opcodes.RETURN);init.visitMaxs(0,0);init.visitEnd();
  MethodVisitor method=c.visitMethod(Opcodes.ACC_PUBLIC,NAME,"()I",null,null);method.visitCode();method.visitIntInsn(Opcodes.BIPUSH,value);method.visitInsn(Opcodes.IRETURN);method.visitMaxs(0,0);method.visitEnd();c.visitEnd();return c.toByteArray();
 }
 public static void main(String[] args)throws Exception{
  Path dir=Files.createTempDirectory("semantic-remap-test-");Path input=dir.resolve("input.jar"),output=dir.resolve("output.jar"),plan=dir.resolve("plan.json");
  try(JarOutputStream z=new JarOutputStream(Files.newOutputStream(input))){
   for(String n:List.of("fixture/Base","fixture/Child","fixture/Other")){z.putNextEntry(new JarEntry(n+".class"));z.write(fixture(n,n.endsWith("Child")?"fixture/Base":"java/lang/Object",n.endsWith("Base")?7:n.endsWith("Child")?11:19));z.closeEntry();}
   z.putNextEntry(new JarEntry("fabric.mod.json"));z.write("{\"entrypoints\":{\"main\":[\"fixture.Other\"]}}".getBytes(java.nio.charset.StandardCharsets.UTF_8));z.closeEntry();
  }
  Files.writeString(plan,"{\"classes\":{\"fixture/Other\":\"fixture/Independent\"},\"fields\":[],\"methods\":[{\"owner\":\"fixture/Base\",\"name\":\""+NAME+"\",\"descriptor\":\"()I\",\"newName\":\"readCount\",\"evidence\":\"test\"}]}");
  SemanticRemap.main(new String[]{input.toString(),plan.toString(),output.toString(),dir.resolve("expanded.json").toString(),dir.resolve("report.json").toString()});
  try(URLClassLoader loader=new URLClassLoader(new URL[]{output.toUri().toURL()},ClassLoader.getPlatformClassLoader())){
   Class<?> base=loader.loadClass("fixture.Base"),child=loader.loadClass("fixture.Child"),other=loader.loadClass("fixture.Independent");Object instance=child.getConstructor().newInstance();
   if(!base.getMethod("readCount").invoke(instance).equals(11))throw new AssertionError("Override dispatch broken");
   if(!other.getMethod(NAME).invoke(other.getConstructor().newInstance()).equals(19))throw new AssertionError("Unrelated method changed");
   try{other.getMethod("readCount");throw new AssertionError("Global name replacement escaped owner scope");}catch(NoSuchMethodException expected){}
   try{child.getMethod(NAME);throw new AssertionError("Stale override method survived");}catch(NoSuchMethodException expected){}
  }
  try(JarFile jar=new JarFile(output.toFile())){String metadata=new String(jar.getInputStream(jar.getJarEntry("fabric.mod.json")).readAllBytes(),java.nio.charset.StandardCharsets.UTF_8);if(!metadata.contains("fixture.Independent")||metadata.contains("fixture.Other"))throw new AssertionError("Entrypoint metadata not remapped");}
  System.out.println("PASS owner isolation, override dispatch, class rename and Fabric entrypoint metadata");
 }
}
