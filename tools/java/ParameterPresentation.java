import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
/** Presentation-only parameter suffix to avoid a Vineflower field-shadowing bug. */
public class ParameterPresentation {
 public static void main(String[] args)throws Exception{
  try(JarFile in=new JarFile(args[0]);JarOutputStream out=new JarOutputStream(Files.newOutputStream(Path.of(args[1])))){
   for(JarEntry e:Collections.list(in.entries()))if(!e.isDirectory()){
    byte[] bytes=in.getInputStream(e).readAllBytes();if(e.getName().endsWith(".class")){
     ClassNode c=new ClassNode();new ClassReader(bytes).accept(c,0);
     for(MethodNode m:c.methods)if(m.parameters!=null){Type[] types=Type.getArgumentTypes(m.desc);int slot=(m.access&Opcodes.ACC_STATIC)!=0?0:1;for(int i=0;i<Math.min(types.length,m.parameters.size());i++){
      ParameterNode p=m.parameters.get(i);String previous=p.name;p.name=(previous==null?"argument"+(i+1):previous)+"Arg";if(m.localVariables!=null)for(LocalVariableNode v:m.localVariables)if(v.index==slot)v.name=p.name;slot+=types[i].getSize();
     }}
     ClassWriter w=new ClassWriter(0);c.accept(w);bytes=w.toByteArray();
    }out.putNextEntry(new JarEntry(e.getName()));out.write(bytes);out.closeEntry();
   }
  }
 }
}
