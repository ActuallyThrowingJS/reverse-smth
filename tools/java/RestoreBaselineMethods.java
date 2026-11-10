import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;
/** Preserves previously verified methods when a new transform hurts decompilation. */
public class RestoreBaselineMethods {
 static Map<String,ClassNode> classes(String file)throws Exception{Map<String,ClassNode> result=new HashMap<>();try(JarFile z=new JarFile(file)){for(JarEntry e:Collections.list(z.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(z.getInputStream(e).readAllBytes()).accept(c,0);result.put(c.name,c);}}return result;}
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> old=classes(args[1]),current=classes(args[0]);Set<String> changed=new HashSet<>();int count=0;
  for(JsonElement e:JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonArray()){JsonObject r=e.getAsJsonObject();String owner=r.get("owner").getAsString(),name=r.get("name").getAsString(),desc=r.get("descriptor").getAsString();ClassNode a=old.get(owner),b=current.get(owner);if(a==null||b==null||!Objects.equals(a.superName,b.superName)||!a.interfaces.equals(b.interfaces))throw new IllegalArgumentException("Class hierarchy changed");MethodNode before=a.methods.stream().filter(m->m.name.equals(name)&&m.desc.equals(desc)).findFirst().orElseThrow(),after=b.methods.stream().filter(m->m.name.equals(name)&&m.desc.equals(desc)).findFirst().orElseThrow();if(before.access!=after.access)throw new IllegalArgumentException("Method access changed");new Analyzer<>(new BasicVerifier()).analyze(owner,before);b.methods.set(b.methods.indexOf(after),before);changed.add(owner);count++;}
  try(JarFile source=new JarFile(args[0]);JarOutputStream output=new JarOutputStream(Files.newOutputStream(Path.of(args[3])))){for(JarEntry e:Collections.list(source.entries()))if(!e.isDirectory()){byte[] bytes=source.getInputStream(e).readAllBytes();if(e.getName().endsWith(".class")&&changed.contains(e.getName().substring(0,e.getName().length()-6))){ClassWriter w=new ClassWriter(0);current.get(e.getName().substring(0,e.getName().length()-6)).accept(w);bytes=w.toByteArray();}output.putNextEntry(new JarEntry(e.getName()));output.write(bytes);output.closeEntry();}}
  System.out.println("Preserved baseline methods="+count);
 }
}
