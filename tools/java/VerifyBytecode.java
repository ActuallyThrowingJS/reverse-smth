import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;
/** Compares BasicVerifier results without loading any application class. */
public class VerifyBytecode {
 static Map<String,String> failures(String file)throws Exception{
  Map<String,String> failed=new TreeMap<>();int checked=0;
  try(JarFile jar=new JarFile(file)){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class")){
   ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(e).readAllBytes()).accept(c,ClassReader.SKIP_DEBUG);
   for(MethodNode m:c.methods)if(m.instructions.size()>0){checked++;try{new Analyzer<>(new BasicVerifier()).analyze(c.name,m);}catch(AnalyzerException ex){failed.put(c.name+'\t'+m.name+'\t'+m.desc,ex.getMessage());}}
  }}System.out.println(file+": methods checked="+checked+", failures="+failed.size());return failed;
 }
 public static void main(String[] args)throws Exception{
  Map<String,String> before=failures(args[0]),after=failures(args[1]);Map<String,String> added=new TreeMap<>(after);before.keySet().forEach(added::remove);
  Map<String,Object> report=new LinkedHashMap<>();report.put("check","ASM BasicVerifier differential; excludes runtime linkage and native behavior");report.put("beforeFailures",before);report.put("afterFailures",after);report.put("newFailures",added);
  Files.writeString(Path.of(args[2]),new GsonBuilder().setPrettyPrinting().create().toJson(report));if(!added.isEmpty())throw new AssertionError("New verifier failures: "+added.size());System.out.println("PASS no new BasicVerifier failures");
 }
}
