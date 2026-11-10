import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import com.google.gson.*;

/** Expands owner aliases to nested classes and derives a collision-checked delta for an analysis archive. */
public class ExpandClassAliases {
 static Set<String> classes(String file)throws Exception{Set<String> names=new LinkedHashSet<>();try(JarFile jar=new JarFile(file)){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class"))names.add(e.getName().substring(0,e.getName().length()-6));}return names;}
 public static void main(String[] args)throws Exception{
  JsonObject full=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject(),aliases=full.getAsJsonObject("classes");Set<String> original=classes(args[0]),current=classes(args[2]);List<String> roots=new ArrayList<>(aliases.keySet());roots.sort(Comparator.comparingInt(String::length).reversed());int nested=0;
  for(String name:original)if(!aliases.has(name))for(String owner:roots)if(name.startsWith(owner+'$')){aliases.addProperty(name,aliases.get(owner).getAsString()+name.substring(owner.length()));nested++;break;}
  Set<String> expected=new HashSet<>();for(String name:original)if(!expected.add(aliases.has(name)?aliases.get(name).getAsString():name))throw new IllegalStateException("Alias collision at "+name);
  JsonObject delta=new JsonObject(),changes=new JsonObject();Set<String> actual=new HashSet<>();for(String name:current){String target=aliases.has(name)?aliases.get(name).getAsString():name;if(!actual.add(target))throw new IllegalStateException("Current archive collision at "+name);if(!target.equals(name))changes.addProperty(name,target);}
  if(!actual.equals(expected)){Set<String> missing=new HashSet<>(expected);missing.removeAll(actual);throw new IllegalStateException("Class inventory differs after remapping: "+missing);}
  delta.add("classes",changes);delta.add("fields",new JsonArray());delta.add("methods",new JsonArray());Gson gson=new GsonBuilder().setPrettyPrinting().create();Files.writeString(Path.of(args[3]),gson.toJson(delta));Files.writeString(Path.of(args[4]),gson.toJson(full));System.out.println("Nested aliases expanded="+nested+" delta class names="+changes.size()+" full aliases="+aliases.size()+"; class inventory and collisions checked");
 }
}
