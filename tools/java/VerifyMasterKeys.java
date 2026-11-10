import java.nio.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import com.google.gson.*;
public class VerifyMasterKeys {
 public static void main(String[] args)throws Exception {
  JsonArray keys=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();
  int passed=0;Set<String> owners=new HashSet<>();
  try(JarFile jar=new JarFile(args[0])) {
   for(JsonElement element:keys) {
    JsonObject site=element.getAsJsonObject();String owner=site.get("owner").getAsString();
    if(!site.get("solved").getAsBoolean() || !site.get("method").getAsString().equals("<clinit>"))continue;
    ClassNode c=new ClassNode();new ClassReader(jar.getInputStream(jar.getJarEntry(owner+".class"))).accept(c,0);
    if((c.access&Opcodes.ACC_ENUM)==0)continue;
    List<String> names=new ArrayList<>();for(FieldNode f:c.fields)if((f.access&Opcodes.ACC_ENUM)!=0)names.add(f.name);
    if(names.isEmpty())continue;
    long key=site.get("rawKey").getAsLong()^site.get("xorAfter").getAsLong();
    Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");cipher.init(Cipher.DECRYPT_MODE,SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(ByteBuffer.allocate(8).putLong(key).array())),new IvParameterSpec(new byte[8]));
    for(MethodNode m:c.methods)if(m.name.equals("<clinit>"))for(AbstractInsnNode n:m.instructions)if(n instanceof LdcInsnNode && ((LdcInsnNode)n).cst instanceof String) {
     String blob=(String)((LdcInsnNode)n).cst;
     if(blob.chars().noneMatch(v->v>127))continue;
     for(int start=0;start<blob.length();start++)for(int length=8;length<=Math.min(128,blob.length()-start);length+=8) {
      try {cipher.init(Cipher.DECRYPT_MODE,SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(ByteBuffer.allocate(8).putLong(key).array())),new IvParameterSpec(new byte[8]));String plain=new String(cipher.doFinal(blob.substring(start,start+length).getBytes("ISO-8859-1")),"UTF-8");
       if(names.contains(plain)&&owners.add(owner)){passed++;System.out.println("Verified enum literal: "+owner+" -> "+plain);}
      }catch(javax.crypto.BadPaddingException|javax.crypto.IllegalBlockSizeException ignored){}
     }
    }
   }
  }
  if(!owners.contains("me/octo/client/PolinexAccessor"))throw new IllegalStateException("Known INSTANCE enum verification failed");
  System.out.println("Independent known enum literals verified: "+passed);
 }
}
