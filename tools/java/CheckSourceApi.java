import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;
/** Rejects source alternatives that lose non-synthetic fields or method signatures. */
public class CheckSourceApi {
 static Set<String> api(byte[] bytes){ClassNode c=new ClassNode();new ClassReader(bytes).accept(c,ClassReader.SKIP_CODE|ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);Set<String> result=new TreeSet<>();for(FieldNode f:c.fields)if((f.access&Opcodes.ACC_SYNTHETIC)==0)result.add("field "+f.name+" "+f.desc+" "+(f.access&(Opcodes.ACC_STATIC|Opcodes.ACC_PUBLIC|Opcodes.ACC_PROTECTED|Opcodes.ACC_PRIVATE|Opcodes.ACC_FINAL|Opcodes.ACC_VOLATILE)));for(MethodNode m:c.methods)if((m.access&(Opcodes.ACC_SYNTHETIC|Opcodes.ACC_BRIDGE))==0&&!m.name.equals("<clinit>"))result.add("method "+m.name+" "+m.desc+" "+(m.access&(Opcodes.ACC_STATIC|Opcodes.ACC_PUBLIC|Opcodes.ACC_PROTECTED|Opcodes.ACC_PRIVATE|Opcodes.ACC_NATIVE|Opcodes.ACC_SYNCHRONIZED|Opcodes.ACC_ABSTRACT)));return result;}
 public static void main(String[] args)throws Exception{
  JsonObject compiler=JsonParser.parseString(Files.readString(Path.of(args[0]))).getAsJsonObject();List<String> accepted=new ArrayList<>();Map<String,Object> rejected=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[2])){for(JsonElement e:compiler.getAsJsonArray("approved")){String source=e.getAsString(),name=source.substring(0,source.length()-5)+".class";Path compiled=Path.of(args[1]).resolve(name);if(!Files.isRegularFile(compiled)||jar.getJarEntry(name)==null){rejected.put(source,"Class output missing");continue;}Set<String> expected=api(jar.getInputStream(jar.getJarEntry(name)).readAllBytes()),actual=api(Files.readAllBytes(compiled)),missing=new TreeSet<>(expected);missing.removeAll(actual);if(missing.isEmpty())accepted.add(source);else rejected.put(source,missing);}}
  Files.writeString(Path.of(args[3]),new GsonBuilder().setPrettyPrinting().create().toJson(Map.of("approved",accepted,"rejected",rejected,"check","Type compilation plus preservation of declared non-synthetic API; behavior not validated")));System.out.println("Source alternatives preserving declared API="+accepted.size()+" rejected="+rejected.size());
 }
}
