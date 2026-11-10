import java.nio.file.*;
import java.util.*;
import javax.tools.*;
import com.sun.source.tree.*;
import com.sun.source.util.*;
import com.google.gson.*;

/** Exports exact method text only from syntax-valid source units. Fragments are not standalone classes. */
public class ExportContextFragments {
 public static void main(String[] args)throws Exception {
  JsonObject inventory=JsonParser.parseString(Files.readString(Path.of(args[0]))).getAsJsonObject();
  JsonObject syntax=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();
  Path sources=Path.of(args[2]),output=Path.of(args[3]);Files.createDirectories(output);
  Map<Path,Map<String,JsonObject>> selected=new LinkedHashMap<>();
  for(JsonElement e:inventory.getAsJsonArray("declarations")){
   JsonObject row=e.getAsJsonObject();String file=row.get("source").getAsString();
   if(syntax.getAsJsonObject(file).getAsJsonArray("errors").size()==0)
    selected.computeIfAbsent(sources.resolve(file).toAbsolutePath(),k->new LinkedHashMap<>()).put(row.get("variantName").getAsString(),row);
  }
  JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();JsonArray exported=new JsonArray();
  try(StandardJavaFileManager fm=compiler.getStandardFileManager(null,Locale.ROOT,null)){
   JavacTask task=(JavacTask)compiler.getTask(null,fm,null,List.of("--release","25","-proc:none"),null,fm.getJavaFileObjectsFromPaths(selected.keySet()));
   Trees trees=Trees.instance(task);
   for(CompilationUnitTree unit:task.parse()){
    Path file=Path.of(unit.getSourceFile().toUri());String text=Files.readString(file);
    new TreeScanner<Void,Void>(){
     public Void visitMethod(MethodTree method,Void unused){
      JsonObject row=selected.get(file).get(method.getName().toString());
      if(row!=null&&method.getBody()!=null){
       long start=trees.getSourcePositions().getStartPosition(unit,method),end=trees.getSourcePositions().getEndPosition(unit,method);
       if(start<0||end<start)throw new IllegalStateException("Missing source position");
       String body=text.substring((int)start,(int)end);
       if(body.contains("Couldn't be decompiled")||body.contains("UNRECOVERED"))throw new IllegalStateException("Unrecovered fragment");
       try{
        String name=SpecializeKeys.hash(row.get("owner").getAsString()+row.get("variantName").getAsString())+".java.txt";
        Path target=output.resolve(name);if(Files.exists(target))throw new IllegalStateException("Refusing to replace fragment: "+name);
        Files.writeString(target,"// CONDITIONAL ANALYSIS FRAGMENT; not a standalone compilation unit.\n// Original owner: "+row.get("owner").getAsString()+"\n// Original descriptor: "+row.get("originalDescriptor").getAsString()+"\n// Required local-slot bindings: "+row.get("requiredBindings")+"\n// Caller reachability, type checking and behavior remain unverified.\n"+body+"\n");
        JsonObject copy=row.deepCopy();copy.addProperty("fragment",name);exported.add(copy);
       }catch(Exception ex){throw new RuntimeException(ex);}
      }
      return super.visitMethod(method,unused);
     }
    }.scan(unit,null);
   }
  }
  Files.writeString(output.resolve("index.json"),new GsonBuilder().setPrettyPrinting().create().toJson(exported));
  System.out.println("Exported syntax-gated conditional method fragments="+exported.size()+"; no type checking or behavior claim");
 }
}
