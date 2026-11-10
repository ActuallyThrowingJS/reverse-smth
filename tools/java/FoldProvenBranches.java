import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import com.google.gson.*;

/** Prunes only numerically proven edges. Output is an intermediate requiring control-flow/frame normalization. */
public class FoldProvenBranches {
 static Boolean condition(int opcode,int left,int right){return switch(opcode){case Opcodes.IFEQ,Opcodes.IF_ICMPEQ->left==right;case Opcodes.IFNE,Opcodes.IF_ICMPNE->left!=right;case Opcodes.IFLT,Opcodes.IF_ICMPLT->left<right;case Opcodes.IFGE,Opcodes.IF_ICMPGE->left>=right;case Opcodes.IFGT,Opcodes.IF_ICMPGT->left>right;case Opcodes.IFLE,Opcodes.IF_ICMPLE->left<=right;default->null;};}
 public static void main(String[] args)throws Exception{
  Map<String,ClassNode> classes=new LinkedHashMap<>();Map<String,byte[]> entries=new LinkedHashMap<>();try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){byte[] b=jar.getInputStream(e).readAllBytes();entries.put(e.getName(),b);if(e.getName().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);classes.put(c.name,c);}}}
  Map<String,Object> constants=SpecializeKeys.constants(classes);List<Map<String,Object>> records=new ArrayList<>();Set<String> changed=new HashSet<>();String prefix=System.getProperty("recovery.ownerPrefix","");int skipped=0;
  for(ClassNode c:classes.values())if(c.name.startsWith(prefix))for(MethodNode m:c.methods)if(m.instructions.size()>0){for(int round=0;round<12;round++){
   Frame<RestoreStrings.V>[] frames;try{frames=new Analyzer<>(new RestoreStrings.Constants(constants)).analyze(c.name,m);}catch(AnalyzerException ex){skipped++;break;}int changes=0;AbstractInsnNode[] code=m.instructions.toArray();
   for(int at=0;at<code.length;at++)if(code[at] instanceof JumpInsnNode branch&&frames[at]!=null){int opcode=branch.getOpcode();boolean pair=opcode>=Opcodes.IF_ICMPEQ&&opcode<=Opcodes.IF_ICMPLE;boolean unary=opcode>=Opcodes.IFEQ&&opcode<=Opcodes.IFLE;if(!pair&&!unary)continue;Frame<RestoreStrings.V> frame=frames[at];if(frame.getStackSize()<(pair?2:1))continue;Object a=frame.getStack(frame.getStackSize()-(pair?2:1)).value,b=pair?frame.getStack(frame.getStackSize()-1).value:Integer.valueOf(0);if(!(a instanceof Integer left)||!(b instanceof Integer right))continue;Boolean taken=condition(opcode,left,right);if(taken==null)continue;
    InsnList replacement=new InsnList();replacement.add(new InsnNode(pair?Opcodes.POP2:Opcodes.POP));if(taken)replacement.add(new JumpInsnNode(Opcodes.GOTO,branch.label));m.instructions.insertBefore(branch,replacement);m.instructions.remove(branch);changes++;changed.add(c.name);records.add(Map.of("owner",c.name,"method",m.name,"descriptor",m.desc,"instruction",at,"opcode",opcode,"left",left,"right",right,"taken",taken,"evidence","Constant primitive dataflow; all operand evaluation retained; unknown branches unchanged"));
   }if(changes==0)break;
  }}
  for(ClassNode c:classes.values())for(MethodNode m:c.methods)if(m.instructions.size()>0)new Analyzer<>(new BasicVerifier()).analyze(c.name,m);
  try(JarOutputStream out=new JarOutputStream(Files.newOutputStream(Path.of(args[1])))){for(var e:entries.entrySet()){byte[] b=e.getValue();if(e.getKey().endsWith(".class")&&changed.contains(e.getKey().substring(0,e.getKey().length()-6))){ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);classes.get(e.getKey().substring(0,e.getKey().length()-6)).accept(w);b=w.toByteArray();}out.putNextEntry(new JarEntry(e.getKey()));out.write(b);out.closeEntry();}}
  Files.writeString(Path.of(args[2]),new GsonBuilder().setPrettyPrinting().create().toJson(records));System.out.println("Proven numeric branches="+records.size()+" changed classes="+changed.size()+" skipped analyses="+skipped+"; INTERMEDIATE: run control-flow/frame normalization before JVM loading");
 }
}
