import java.nio.file.*;
import java.util.*;
import javax.tools.*;
import com.sun.source.util.JavacTask;
import com.google.gson.*;
/** Java 25 syntax check only; does not claim type checking or behavior validation. */
public class ParseSources {
 public static void main(String[] args)throws Exception{
  Path root=Path.of(args[0]).toAbsolutePath();List<Path> files;try(var paths=Files.walk(root)){files=paths.filter(p->p.toString().endsWith(".java")).sorted().toList();}
  DiagnosticCollector<JavaFileObject> diagnostics=new DiagnosticCollector<>();Map<String,Map<String,Object>> report=new TreeMap<>();
  for(Path p:files){Map<String,Object> row=new LinkedHashMap<>();String s=Files.readString(p);row.put("errors",new ArrayList<Map<String,Object>>());row.put("unrecoveredMarkers",s.split("UNRECOVERED|Couldn't be decompiled|could not be decompiled|An error occurred while decompiling|Decompilation failed|Unable to fully structure code|\\*\\* GOTO",-1).length-1);report.put(root.relativize(p).toString(),row);}
  JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();try(StandardJavaFileManager fm=compiler.getStandardFileManager(diagnostics,Locale.ROOT,null)){
   JavacTask task=(JavacTask)compiler.getTask(null,fm,diagnostics,List.of("--release","25","-proc:none","-Xmaxerrs","1000000"),null,fm.getJavaFileObjectsFromPaths(files));for(var unit:task.parse()){}
  }
  for(Diagnostic<? extends JavaFileObject> d:diagnostics.getDiagnostics())if(d.getKind()==Diagnostic.Kind.ERROR&&d.getSource()!=null){Path p=Path.of(d.getSource().toUri());var row=report.get(root.relativize(p).toString());@SuppressWarnings("unchecked") List<Map<String,Object>> errors=(List<Map<String,Object>>)row.get("errors");errors.add(Map.of("line",d.getLineNumber(),"code",d.getCode(),"message",d.getMessage(Locale.ROOT)));}
  long valid=report.values().stream().filter(r->((List<?>)r.get("errors")).isEmpty()).count();long clean=report.values().stream().filter(r->((List<?>)r.get("errors")).isEmpty()&&((Integer)r.get("unrecoveredMarkers"))==0).count();
  Files.writeString(Path.of(args[1]),new GsonBuilder().setPrettyPrinting().create().toJson(report));System.out.println("Files="+files.size()+" syntacticallyValid="+valid+" syntaxValidWithoutFailureMarkers="+clean+"; parsing only, no type checking");
 }
}
