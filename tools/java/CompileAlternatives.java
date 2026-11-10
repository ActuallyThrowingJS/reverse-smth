import java.nio.file.*;
import java.io.File;
import java.util.*;
import javax.tools.*;
import com.google.gson.*;

/** Type-checks alternative full classes, with final isolated batch compilation. */
public class CompileAlternatives {
 public static void main(String[] args)throws Exception{
  Path root=Path.of(args[0]).toAbsolutePath(),out=Path.of(args[4]);Files.createDirectories(out);List<String> names=new ArrayList<>();for(JsonElement e:JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray())names.add(e.getAsString());Map<String,List<Map<String,Object>>> rejected=new TreeMap<>();List<Map<String,Object>> rounds=new ArrayList<>();boolean successful=false;
  String cp=Path.of(args[3]).toAbsolutePath()+File.pathSeparator+Files.readString(Path.of(args[2])).trim();
  JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
  for(int round=0;round<8&&!names.isEmpty();round++){
   DiagnosticCollector<JavaFileObject> diagnostics=new DiagnosticCollector<>();boolean result;
   try(StandardJavaFileManager manager=compiler.getStandardFileManager(diagnostics,Locale.ROOT,null)){
    var files=manager.getJavaFileObjectsFromPaths(names.stream().map(root::resolve).toList());result=compiler.getTask(null,manager,diagnostics,List.of("--release","25","-proc:none","-Xmaxerrs","100000","-classpath",cp,"-d",out.toString()),null,files).call();
   }
   Set<String> failed=new TreeSet<>();List<String> global=new ArrayList<>();for(var d:diagnostics.getDiagnostics())if(d.getKind()==Diagnostic.Kind.ERROR){if(d.getSource()==null){global.add(d.getMessage(Locale.ROOT));continue;}String name=root.relativize(Path.of(d.getSource().toUri())).toString();failed.add(name);rejected.computeIfAbsent(name,k->new ArrayList<>()).add(Map.of("line",d.getLineNumber(),"code",d.getCode(),"message",d.getMessage(Locale.ROOT)));}
   rounds.add(Map.of("candidates",names.size(),"rejectedFiles",failed.size(),"globalErrors",global,"successful",result));System.out.println("Round="+(round+1)+" candidates="+names.size()+" failedFiles="+failed.size()+" compileSuccessful="+result);
   if(result){successful=true;break;}if(failed.isEmpty()||!global.isEmpty())break;names.removeAll(failed);
  }
  if(!successful)names.clear();Map<String,Object> report=new LinkedHashMap<>();report.put("check","Complete alternative classes compile against the recovered binary plus Java 25 / Minecraft 26.1.2 / Fabric dependencies; application behavior not verified");report.put("approved",names);report.put("rounds",rounds);report.put("rejected",rejected);Files.writeString(Path.of(args[5]),new GsonBuilder().setPrettyPrinting().create().toJson(report));System.out.println("Approved complete-class source alternatives="+names.size());
 }
}
