import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;
import com.zkmdeobf.MiniInterpreter;

/** Bounded crypto extraction model, not a replacement application initializer. */
public class ExtractCrypto {
 static boolean app(String name){return name.startsWith("me/octo/")||name.startsWith("lol/polinex")||name.startsWith("dev/jnic/");}
 static void defaultValue(InsnList ins,Type type){switch(type.getSort()){case Type.VOID:break;case Type.LONG:ins.add(new InsnNode(Opcodes.LCONST_0));break;case Type.FLOAT:ins.add(new InsnNode(Opcodes.FCONST_0));break;case Type.DOUBLE:ins.add(new InsnNode(Opcodes.DCONST_0));break;case Type.OBJECT:case Type.ARRAY:ins.add(new InsnNode(Opcodes.ACONST_NULL));break;default:ins.add(new InsnNode(Opcodes.ICONST_0));}}
 static void replaceCall(MethodNode m,AbstractInsnNode n,String descriptor,boolean receiver){InsnList ins=new InsnList();Type[] args=Type.getArgumentTypes(descriptor);for(int i=args.length-1;i>=0;i--)ins.add(new InsnNode(args[i].getSize()==2?Opcodes.POP2:Opcodes.POP));if(receiver)ins.add(new InsnNode(Opcodes.POP));defaultValue(ins,Type.getReturnType(descriptor));m.instructions.insertBefore(n,ins);m.instructions.remove(n);}
 static boolean helper(MethodNode m){return (m.access&Opcodes.ACC_STATIC)!=0 && (m.access&Opcodes.ACC_NATIVE)==0;}
 public static void main(String[] args)throws Exception {
  Map<String,ClassNode> classes=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(e)).accept(c,0);classes.put(c.name,c);}}
  Map<String,ClassNode> model=new LinkedHashMap<>();
  for(ClassNode original:classes.values()){
   ClassNode c=new ClassNode();original.accept(c);model.put(c.name,c);
   Set<String> helpers=new HashSet<>();for(MethodNode m:c.methods)if(helper(m))helpers.add(m.name+m.desc);
   for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions.toArray()){
    if(n instanceof InvokeDynamicInsnNode){InvokeDynamicInsnNode indy=(InvokeDynamicInsnNode)n;
     List<MethodNode> matches=new ArrayList<>();if(indy.bsm.getOwner().equals(c.name))for(MethodNode candidate:c.methods)if(helper(candidate)&&candidate.desc.equals(indy.desc))matches.add(candidate);
     if(matches.size()==1)m.instructions.set(n,new MethodInsnNode(Opcodes.INVOKESTATIC,c.name,matches.get(0).name,indy.desc,false));
     else replaceCall(m,n,indy.desc,false);
    }else if(n instanceof MethodInsnNode){MethodInsnNode call=(MethodInsnNode)n;
     if(app(call.owner)&&!(call.owner.equals(c.name)&&helpers.contains(call.name+call.desc)))replaceCall(m,n,call.desc,call.getOpcode()!=Opcodes.INVOKESTATIC);
    }else if(n instanceof FieldInsnNode){FieldInsnNode f=(FieldInsnNode)n;
     if(app(f.owner)&&!f.owner.equals(c.name)){
      InsnList replacement=new InsnList();
      if(f.getOpcode()==Opcodes.GETSTATIC){defaultValue(replacement,Type.getType(f.desc));m.instructions.insertBefore(f,replacement);m.instructions.remove(f);}
      else if(f.getOpcode()==Opcodes.PUTSTATIC){m.instructions.set(f,new InsnNode(Type.getType(f.desc).getSize()==2?Opcodes.POP2:Opcodes.POP));}
     }
    }
   }
  }
  Map<String,Object> result=new LinkedHashMap<>();Map<String,String> outcomes=new LinkedHashMap<>();int completed=0,partial=0;
  Path output=Path.of(args[1]);Files.createDirectories(output);
  for(ClassNode c:model.values())if(c.name.startsWith(System.getProperty("recovery.ownerPrefix","me/octo/client/"))&&(args.length<3||c.name.matches(args[2]))) {
   MethodNode cl=null;for(MethodNode m:c.methods)if(m.name.equals("<clinit>"))cl=m;if(cl==null)continue;
   MiniInterpreter.Ctx context=new MiniInterpreter.Ctx(model,ClassLoader.getPlatformClassLoader(),0);String outcome="completed";
   try{MiniInterpreter.run(context,c,cl,new Object[0]);completed++;}catch(Throwable e){outcome=e.getClass().getSimpleName()+": "+e.getMessage();partial++;}
   Map<String,Object> values=new LinkedHashMap<>();
   for(FieldNode field:c.fields){Object value=context.statics.get(c.name+'.'+field.name);
    if(value instanceof MiniInterpreter.Arr){Object data=((MiniInterpreter.Arr)value).data;
     if(Set.of("[Ljava/lang/String;","[Ljava/lang/Object;","[Ljava/lang/Long;","[Ljava/lang/Integer;").contains(field.desc)&&data instanceof Object[]){List<Object> strings=new ArrayList<>();boolean valid=true;for(Object s:(Object[])data){if(s==null||s==MiniInterpreter.NULL)strings.add(null);else if(s instanceof String||s instanceof Long||s instanceof Integer)strings.add(s);else if(s instanceof Class)strings.add(Map.of("class",((Class<?>)s).getName()));else if(s instanceof Type)strings.add(Map.of("descriptor",((Type)s).getDescriptor()));else{valid=false;break;}}if(valid)values.put(field.name,strings);}
     else if(field.desc.equals("[J")&&data instanceof long[])values.put(field.name,data);
    }else if(value instanceof Long||value instanceof Integer||value instanceof String)values.put(field.name,value);
   }
   if(!values.isEmpty())result.put(c.name,values);outcomes.put(c.name,outcome);
   System.out.println(c.name+" -> "+outcome+" fields="+values.size());System.out.flush();
   if(outcomes.size()%25==0){Files.writeString(output.resolve("crypto-state.json"),new Gson().toJson(result));Files.writeString(output.resolve("outcomes.json"),new Gson().toJson(outcomes));}
  }
  Files.writeString(output.resolve("crypto-state.json"),new Gson().toJson(result));Files.writeString(output.resolve("outcomes.json"),new GsonBuilder().setPrettyPrinting().create().toJson(outcomes));
  System.out.println("Completed "+completed+" partial "+partial+" state classes "+result.size());
 }
}
