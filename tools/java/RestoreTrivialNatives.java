import java.nio.*;
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.jar.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;

/** Exact reconstruction of verified x86-64 RET and MOV RAX,RDX;RET implementations. */
public class RestoreTrivialNatives {
 static String key(String o,String n,String d){return o+'\t'+n+'\t'+d;}
 public static void main(String[] args)throws Exception{
  byte[] image=Files.readAllBytes(Path.of(args[1]));ByteBuffer elf=ByteBuffer.wrap(image).order(ByteOrder.LITTLE_ENDIAN);
  if(elf.getInt(0)!=0x464c457f||image[4]!=2||image[5]!=1||elf.getShort(18)!=62)throw new IllegalArgumentException("Expected little-endian ELF64 x86-64");
  String sha=HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(image));Map<String,JsonObject> proof=new LinkedHashMap<>();
  for(JsonElement element:JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonArray()){
   JsonObject row=element.getAsJsonObject();if(!sha.equals(row.get("elfSha256").getAsString()))throw new IllegalArgumentException("Native image SHA-256 mismatch");
   int offset=row.get("fileOffset").getAsInt();byte[] code=HexFormat.of().parseHex(row.get("machineBytes").getAsString());long rva=Long.decode(row.get("elfRva").getAsString());boolean mapped=false;
   long phoff=elf.getLong(32);int size=Short.toUnsignedInt(elf.getShort(54)),count=Short.toUnsignedInt(elf.getShort(56));
   for(int i=0;i<count;i++){int pos=Math.toIntExact(phoff+(long)i*size);if(elf.getInt(pos)!=1||(elf.getInt(pos+4)&1)==0)continue;long off=elf.getLong(pos+8),va=elf.getLong(pos+16),length=elf.getLong(pos+32);if(rva>=va&&rva+code.length<=va+length&&off+rva-va==offset)mapped=true;}
   if(!mapped||!Arrays.equals(code,Arrays.copyOfRange(image,offset,offset+code.length)))throw new IllegalArgumentException("Native bytes or executable mapping mismatch");
   String desc=row.get("descriptor").getAsString(),kind=row.get("reconstruction").getAsString();Type[] parameters=Type.getArgumentTypes(desc);Type returned=Type.getReturnType(desc);
   if(kind.equals("void")){if(!Arrays.equals(code,new byte[]{(byte)0xc3})||!returned.equals(Type.VOID_TYPE))throw new IllegalArgumentException("Invalid void proof");}
   else if(kind.equals("identity-first-argument")){if(!Arrays.equals(code,HexFormat.of().parseHex("4889d0c3"))||parameters.length!=1||!parameters[0].equals(returned)||returned.getSort()!=Type.OBJECT)throw new IllegalArgumentException("Invalid identity proof");}
   else throw new IllegalArgumentException("Unknown native pattern");
   String k=key(row.get("owner").getAsString(),row.get("name").getAsString(),desc);if(proof.put(k,row)!=null)throw new IllegalArgumentException("Duplicate native proof");
  }
  Set<String> restored=new HashSet<>();Map<String,byte[]> entries=new LinkedHashMap<>();
  try(JarFile jar=new JarFile(args[0])){for(JarEntry e:Collections.list(jar.entries()))if(!e.isDirectory()){
   byte[] b=jar.getInputStream(e).readAllBytes();if(e.getName().endsWith(".class")){
    ClassNode c=new ClassNode();new ClassReader(b).accept(c,0);boolean changed=false;
    for(MethodNode m:c.methods){String k=key(c.name,m.name,m.desc);JsonObject row=proof.get(k);if(row==null)continue;if((m.access&Opcodes.ACC_NATIVE)==0)throw new IllegalArgumentException("Proof target is not native: "+k);
     m.access&=~Opcodes.ACC_NATIVE;m.instructions.clear();m.tryCatchBlocks.clear();if(m.localVariables!=null)m.localVariables.clear();
     if(row.get("reconstruction").getAsString().equals("void"))m.instructions.add(new InsnNode(Opcodes.RETURN));
     else {m.instructions.add(new VarInsnNode(Opcodes.ALOAD,(m.access&Opcodes.ACC_STATIC)!=0?0:1));m.instructions.add(new InsnNode(Opcodes.ARETURN));}
     restored.add(k);changed=true;
    }if(changed){ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.accept(writer);b=writer.toByteArray();}
   }entries.put(e.getName(),b);
  }}
  if(!restored.equals(proof.keySet()))throw new IllegalArgumentException("Not all native declarations found");
  try(JarOutputStream jar=new JarOutputStream(Files.newOutputStream(Path.of(args[3])))){for(var e:entries.entrySet()){jar.putNextEntry(new JarEntry(e.getKey()));jar.write(e.getValue());jar.closeEntry();}}
  System.out.println("Restored native Java bodies="+restored.size()+"; exact ELF bytes verified; analysis artifact; original native registration must not run");
 }
}
