import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import java.security.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;

/** Analysis clones for proven constant primitive key arguments; generic methods remain intact. */
public class SpecializeKeys {
 static String key(String o,String n,String d){return o+'\t'+n+'\t'+d;}
 static MethodNode copy(MethodNode m){MethodNode result=new MethodNode(m.access,m.name,m.desc,m.signature,m.exceptions.toArray(String[]::new));m.accept(result);return result;}
 static String hash(String text)throws Exception{return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(text.getBytes(java.nio.charset.StandardCharsets.UTF_8))).substring(0,16);}
 static boolean seeded(MethodNode method,SortedMap<Integer,Number> bindings){AbstractInsnNode n=method.instructions.getFirst();for(var b:bindings.entrySet()){while(n!=null&&n.getOpcode()<0)n=n.getNext();if(!(n instanceof LdcInsnNode)||!((LdcInsnNode)n).cst.equals(b.getValue()))return false;n=n.getNext();while(n!=null&&n.getOpcode()<0)n=n.getNext();if(!(n instanceof VarInsnNode)||((VarInsnNode)n).var!=b.getKey()||n.getOpcode()!=(b.getValue() instanceof Long?Opcodes.LSTORE:Opcodes.ISTORE))return false;n=n.getNext();}return true;}
 static Map<String,Object> constants(Map<String,ClassNode> classes)throws Exception{
  Map<String,Integer> writes=new HashMap<>();Set<String> mutable=new HashSet<>();Map<String,Object> values=new HashMap<>();
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof FieldInsnNode&&n.getOpcode()==Opcodes.PUTSTATIC){FieldInsnNode f=(FieldInsnNode)n;String k=f.owner+'.'+f.name;writes.merge(k,1,Integer::sum);if(!m.name.equals("<clinit>"))mutable.add(k);}
  for(ClassNode c:classes.values())for(FieldNode f:c.fields)if(f.desc.equals("J")&&f.value instanceof Long&&(f.access&Opcodes.ACC_VOLATILE)==0&&!mutable.contains(c.name+'.'+f.name)&&writes.getOrDefault(c.name+'.'+f.name,0)==0)values.put(c.name+'.'+f.name,f.value);
  for(int round=0;round<4;round++)for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(m.name.equals("<clinit>")){
   Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new RestoreStrings.Constants(values)).analyze(c.name,m);}catch(AnalyzerException e){continue;}
   AbstractInsnNode[] code=m.instructions.toArray();for(int i=0;i<code.length;i++)if(code[i] instanceof FieldInsnNode&&code[i].getOpcode()==Opcodes.PUTSTATIC&&frames[i]!=null){FieldInsnNode f=(FieldInsnNode)code[i];String k=f.owner+'.'+f.name;ClassNode owner=classes.get(f.owner);if(owner==null)continue;FieldNode declaration=owner.fields.stream().filter(x->x.name.equals(f.name)&&x.desc.equals(f.desc)).findFirst().orElse(null);if(declaration==null||(declaration.access&Opcodes.ACC_VOLATILE)!=0||!f.desc.equals("J")||writes.getOrDefault(k,0)!=1||mutable.contains(k))continue;Object value=frames[i].getStack(frames[i].getStackSize()-1).value;if(value instanceof Long)values.put(k,value);}
  }return values;
 }
 public static void main(String[] args)throws Exception{
  Map<String,byte[]> entries=new LinkedHashMap<>();Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,MethodNode> methods=new HashMap<>();
  try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);for(MethodNode m:c.methods)methods.put(key(c.name,m.name,m.desc),m);}}}
  Map<String,Object> values=constants(classes);Map<String,String> clones=new LinkedHashMap<>();Set<String> generated=new HashSet<>();List<Map<String,Object>> evidence=new ArrayList<>();Map<String,Integer> counts=new HashMap<>();int rewritten=0,rounds=0;int limit=args.length>3?Integer.parseInt(args[3]):3000;
  for(int round=0;round<12;round++){int changes=0;rounds++;
   for(ClassNode c:classes.values())if(c.name.startsWith("me/octo/client/")||c.name.startsWith("fixture/"))for(MethodNode m:new ArrayList<>(c.methods))if(m.instructions.size()>0){
    Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new RestoreStrings.Constants(values)).analyze(c.name,m);}catch(AnalyzerException e){continue;}AbstractInsnNode[] code=m.instructions.toArray();
    for(int i=0;i<code.length;i++)if(code[i] instanceof MethodInsnNode&&frames[i]!=null){MethodInsnNode call=(MethodInsnNode)code[i];String targetKey=key(call.owner,call.name,call.desc);MethodNode target=methods.get(targetKey);ClassNode owner=classes.get(call.owner);ClassNode invocationOwner=owner;
     if(target==null&&owner!=null&&Boolean.getBoolean("recovery.inheritedMethods")){ResolveReferences.Target inherited=ResolveReferences.find(call.owner,call.name,call.desc,false,classes,new HashSet<>());if(inherited!=null){targetKey=key(inherited.owner,inherited.name,inherited.descriptor);target=methods.get(targetKey);owner=classes.get(inherited.owner);}}
     if(target==null||owner==null||(generated.contains(targetKey)||call.name.contains("$recovered$"))||!(owner.name.startsWith("me/octo/client/")||owner.name.startsWith("fixture/"))||(owner.access&Opcodes.ACC_INTERFACE)!=0||target.name.startsWith("<")||(target.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))!=0||target.instructions.size()>10000)continue;
     if(call.getOpcode()!=Opcodes.INVOKESTATIC&&(target.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_FINAL))==0&&(owner.access&Opcodes.ACC_FINAL)==0&&(invocationOwner.access&Opcodes.ACC_FINAL)==0)continue;
     if(call.getOpcode()==Opcodes.INVOKESPECIAL&&((target.access&Opcodes.ACC_PRIVATE)==0||!c.name.equals(owner.name)))continue;
     boolean keyMath=false;for(AbstractInsnNode n:target.instructions)if(n.getOpcode()==Opcodes.LXOR){keyMath=true;break;}if(!keyMath)continue;
     Type[] types=Type.getArgumentTypes(call.desc);int base=frames[i].getStackSize()-types.length;SortedMap<Integer,Number> bindings=new TreeMap<>();boolean hasLong=Arrays.stream(types).anyMatch(t->t.equals(Type.LONG_TYPE));int slot=(target.access&Opcodes.ACC_STATIC)!=0?0:1;
     for(int a=0;a<types.length;a++){Object value=frames[i].getStack(base+a).value;if(types[a].equals(Type.LONG_TYPE)&&value instanceof Long)bindings.put(slot,(Long)value);else if(Boolean.getBoolean("recovery.splitIntegerKeys")&&!hasLong&&types[a].getSort()>=Type.BOOLEAN&&types[a].getSort()<=Type.INT&&value instanceof Integer)bindings.put(slot,(Integer)value);slot+=types[a].getSize();}
     if(bindings.isEmpty())continue;String bindingKey=targetKey+'\t'+bindings;String name=clones.get(bindingKey);
     if(name==null){if(clones.size()>=limit||counts.getOrDefault(targetKey,0)>=8)continue;name=target.name+"$recovered$"+hash(bindingKey);if(methods.containsKey(key(owner.name,name,target.desc))){MethodNode existing=methods.get(key(owner.name,name,target.desc));if(!seeded(existing,bindings))throw new IllegalStateException("Clone name collision");clones.put(bindingKey,name);call.name=name;rewritten++;changes++;continue;}MethodNode clone=copy(target);clone.name=name;clone.access&=~Opcodes.ACC_SYNTHETIC;InsnList prelude=new InsnList();for(var binding:bindings.entrySet()){prelude.add(new LdcInsnNode(binding.getValue()));prelude.add(new VarInsnNode(binding.getValue() instanceof Long?Opcodes.LSTORE:Opcodes.ISTORE,binding.getKey()));}clone.instructions.insert(prelude);clone.maxStack=Math.max(clone.maxStack,2);owner.methods.add(clone);String newKey=key(owner.name,name,clone.desc);methods.put(newKey,clone);generated.add(newKey);clones.put(bindingKey,name);counts.merge(targetKey,1,Integer::sum);
      Map<String,Object> row=new LinkedHashMap<>();row.put("owner",owner.name);row.put("originalName",target.name);row.put("descriptor",target.desc);row.put("cloneName",name);row.put("constantPrimitiveLocalSlots",bindings);row.put("evidence","Constant argument dataflow (including split integer keys); static/private/final dispatch; argument evaluation retained; generic method preserved");evidence.add(row);
     }
     call.name=name;rewritten++;changes++;
    }
   }if(changes==0)break;
  }
  // Stack verification is required before emitting any output.
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(m.instructions.size()>0)new Analyzer<>(new BasicVerifier()).analyze(c.name,m);
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(Path.of(args[1])))){for(var e:entries.entrySet()){byte[] b=e.getValue();if(e.getKey().endsWith(".class")){ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_MAXS);classes.get(e.getKey().substring(0,e.getKey().length()-6)).accept(writer);b=writer.toByteArray();}jar.putNextEntry(new JarEntry(e.getKey()));jar.write(b);jar.closeEntry();}}
  Files.writeString(Path.of(args[2]),new GsonBuilder().setPrettyPrinting().create().toJson(evidence));System.out.println("constantFields="+values.size()+" bindingContexts="+clones.size()+" newClones="+evidence.size()+" reusedContexts="+(clones.size()-evidence.size())+" rewrittenCalls="+rewritten+" rounds="+rounds+" genericMethodsPreserved=true");
 }
}
