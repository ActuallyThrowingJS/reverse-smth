package me.octo.client.utils.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.utils.ModUtils;

public class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Map<String, String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   public static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 94347401737823L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public static boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return ModUtils.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   static {
      long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 88560718253111L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[30];
      int var7 = 0;
      String var6 = "c\u0011ªzÿç3o\u001bì\u0003WE³(\u0095`1\u0081iü²\u0096.G\"dé\u0007/\u0086\u0099\u0017U¥ï\u0080¦x\u001d~-Þ.\u007fE!\\ýÖ#¬¦\u001ffïzR\nbÚØ¦Ô\t$³=ß'\f·úNzce]QÑ\u0018þ\u0084q\u008a\u0015®¡4àYhß\u009em\u0015(iûzïmª7ñ\u0007u/7}Ri\u0094\u00199\u0005%À\u0089\u0090W7\n=\u0011\u0004°\u0086ñ°hjº\u0015\u0013\u007f°(y;¯¨(±ªÝU¾ÀÌvlfjÁa9<\u0086îh®\\´\u0015K³\u0000ù\u008bÝ\u0003Nõ)B&\u00108ÿ\u0019ÑÍ;\u009cV'\u008c»ÿ.\u000e\u009eå$\u009b\u0092\u0094\u009f¸jKð\u008dMN\u0093)\u008eã\u008cËÃ¢ü#&+i\u00ad\rM\u0084ÎÓÒ§\u000fà\u0085~\u0096\u008b\u0002\u001a\u0010*T[©Ö\u008bÃíI\u0087¹-\u000e\n\u0003U( ó\u001d¢`4\u0017=y\u009b|°Æ±\u0094nã®1\u001b\u00ad\u0001çÉîrI/<\u0015\u009dß¸\u0086D\u0006ÁÍG@\u0010,,os\u0080³ñÍ²-¹\u0084y>AS8Ö\u0007 ãí\u0095Ò\u0012Ù¢Wê-(Ð\u0088÷W¨µ\u0086Û@~Gü\f£º{Î¢ñ¿\u0003Øq\u009eÈ³Áf\u009d\u0090\u0086íPñX\u0015Yºihc\n\u0010B¼è8\u0003W\u0096ßk©\u009cÉ\u001bØÃÍ(îëIuf&ôª=\u000bÌM\f\u0097[i!Þa\u0001¦\u000fÑw\u009f\u0099.\u0088\u0092H\u001c\u0003Ò\u0001(}?\u0010\u0098Õ\u0018G?fË\"BÊÊ\u009cøÉ#\u0099dÃ8n;Û\u00885ö\u0096E\u0010\r¦\u0097yù´v\u0088Ü\u000f?èq+©û\u0010}ó\\K\u0084¢\u009e\u0006\"15,\u0083T\u0004s\u0010\u008bgC¸ø¹Ã÷\u009cw\u008fø¯·M|\u0010¿AÈ¤\u0095\"j\u0081=ÃvB\u0084À\u0007B@Éò¶/\u0012ÝFBÖC\u0011F»·À\u009büG½«<ì\u001cÞ<Ë\u0094\u001d£pð\u0004ô\u0089\u0007\u0004Ñ|Ö¼ìZìÍH\u0011\u0003eFD\"Í\u008fýwÁ\u008f\b56SÉxw\u00106Úàç¯°\u009eAÔVuúíÞl\u009e\u0010èÛ(K\u0093ÚSz®\u000bØ*ð3>¬\u0010;o\u00adÉÍ\u0096MâÃ5hÏ\u0016o\u008d{(\u001a~#%½O³[3\u0007Z ûniÊ£ßøì\u0098%(\u0087ja«\u008f\u0017ù\u008fÇ\u0011\u0097\u0019ûÐt\u008c\u000f\u0010Í£¢¢?\u009bã`úÊ\u0090\u0003K©Ì1\u0010Oôø-\u0083Tôá\u001bøc´\u00189\u0014\u0090 j\u0089\u0093_\u008eÀâ·ÁËS'\u0014ª÷\u001fD1\tMÛëësµÜ}ÅyÅwm\u0010ç\u0002\u0082È\u001feÃ\u009aK\u008b×vüWK9X\u001f½\u00923*<\tõ¹ÙFþ\u0018Ç\u008f\u0086\u008b\u001cÖöáÓ4DÅ\u0005h¨h\u0015Eª\u009d\u007f\u000b.v\u0013\u001el\u0085&¡¯ÀIP4Ó\u000føØº\u00ad4Ûá`³p½\u000b²\u008e\u0004g\u009d\u0097¾4\u0006\u0001\u000f´E¿á\u008a\u0015\u0088ÏÀ\u0083ã!\u000eÊ2\u00101-ÞíÐáÊ\u0018§[*Í\u0092¨\u0084X\u0010\u009b|ÿ \\M¿C%H^Ùï\u007fëp Ã³\u0099I\u0006\"{fÞ@\u0096°-\u007fÑOÜ\u0099i$Eþk\u0093á\u0081Mì\u0093½Ç½";
      int var8 = "c\u0011ªzÿç3o\u001bì\u0003WE³(\u0095`1\u0081iü²\u0096.G\"dé\u0007/\u0086\u0099\u0017U¥ï\u0080¦x\u001d~-Þ.\u007fE!\\ýÖ#¬¦\u001ffïzR\nbÚØ¦Ô\t$³=ß'\f·úNzce]QÑ\u0018þ\u0084q\u008a\u0015®¡4àYhß\u009em\u0015(iûzïmª7ñ\u0007u/7}Ri\u0094\u00199\u0005%À\u0089\u0090W7\n=\u0011\u0004°\u0086ñ°hjº\u0015\u0013\u007f°(y;¯¨(±ªÝU¾ÀÌvlfjÁa9<\u0086îh®\\´\u0015K³\u0000ù\u008bÝ\u0003Nõ)B&\u00108ÿ\u0019ÑÍ;\u009cV'\u008c»ÿ.\u000e\u009eå$\u009b\u0092\u0094\u009f¸jKð\u008dMN\u0093)\u008eã\u008cËÃ¢ü#&+i\u00ad\rM\u0084ÎÓÒ§\u000fà\u0085~\u0096\u008b\u0002\u001a\u0010*T[©Ö\u008bÃíI\u0087¹-\u000e\n\u0003U( ó\u001d¢`4\u0017=y\u009b|°Æ±\u0094nã®1\u001b\u00ad\u0001çÉîrI/<\u0015\u009dß¸\u0086D\u0006ÁÍG@\u0010,,os\u0080³ñÍ²-¹\u0084y>AS8Ö\u0007 ãí\u0095Ò\u0012Ù¢Wê-(Ð\u0088÷W¨µ\u0086Û@~Gü\f£º{Î¢ñ¿\u0003Øq\u009eÈ³Áf\u009d\u0090\u0086íPñX\u0015Yºihc\n\u0010B¼è8\u0003W\u0096ßk©\u009cÉ\u001bØÃÍ(îëIuf&ôª=\u000bÌM\f\u0097[i!Þa\u0001¦\u000fÑw\u009f\u0099.\u0088\u0092H\u001c\u0003Ò\u0001(}?\u0010\u0098Õ\u0018G?fË\"BÊÊ\u009cøÉ#\u0099dÃ8n;Û\u00885ö\u0096E\u0010\r¦\u0097yù´v\u0088Ü\u000f?èq+©û\u0010}ó\\K\u0084¢\u009e\u0006\"15,\u0083T\u0004s\u0010\u008bgC¸ø¹Ã÷\u009cw\u008fø¯·M|\u0010¿AÈ¤\u0095\"j\u0081=ÃvB\u0084À\u0007B@Éò¶/\u0012ÝFBÖC\u0011F»·À\u009büG½«<ì\u001cÞ<Ë\u0094\u001d£pð\u0004ô\u0089\u0007\u0004Ñ|Ö¼ìZìÍH\u0011\u0003eFD\"Í\u008fýwÁ\u008f\b56SÉxw\u00106Úàç¯°\u009eAÔVuúíÞl\u009e\u0010èÛ(K\u0093ÚSz®\u000bØ*ð3>¬\u0010;o\u00adÉÍ\u0096MâÃ5hÏ\u0016o\u008d{(\u001a~#%½O³[3\u0007Z ûniÊ£ßøì\u0098%(\u0087ja«\u008f\u0017ù\u008fÇ\u0011\u0097\u0019ûÐt\u008c\u000f\u0010Í£¢¢?\u009bã`úÊ\u0090\u0003K©Ì1\u0010Oôø-\u0083Tôá\u001bøc´\u00189\u0014\u0090 j\u0089\u0093_\u008eÀâ·ÁËS'\u0014ª÷\u001fD1\tMÛëësµÜ}ÅyÅwm\u0010ç\u0002\u0082È\u001feÃ\u009aK\u008b×vüWK9X\u001f½\u00923*<\tõ¹ÙFþ\u0018Ç\u008f\u0086\u008b\u001cÖöáÓ4DÅ\u0005h¨h\u0015Eª\u009d\u007f\u000b.v\u0013\u001el\u0085&¡¯ÀIP4Ó\u000føØº\u00ad4Ûá`³p½\u000b²\u008e\u0004g\u009d\u0097¾4\u0006\u0001\u000f´E¿á\u008a\u0015\u0088ÏÀ\u0083ã!\u000eÊ2\u00101-ÞíÐáÊ\u0018§[*Í\u0092¨\u0084X\u0010\u009b|ÿ \\M¿C%H^Ùï\u007fëp Ã³\u0099I\u0006\"{fÞ@\u0096°-\u007fÑOÜ\u0099i$Eþk\u0093á\u0081Mì\u0093½Ç½"
         .length();
      char var5 = '`';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u008f\u001dÕ\u0096\u0086ì!]Q±øô\u0080@ y¹ËÌçmÔL5O 5mÐv½É?\u000eúÅÕB\u0005³\u0010P\u001fíV\u0012¿}Àö\u0016\r\u0006I-óØ";
            var8 = "\u008f\u001dÕ\u0096\u0086ì!]Q±øô\u0080@ y¹ËÌçmÔL5O 5mÐv½É?\u000eúÅÕB\u0005³\u0010P\u001fíV\u0012¿}Àö\u0016\r\u0006I-óØ".length();
            var5 = '(';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[30];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = "https://api.polinexclient.net/polinex/mod/fabric/auth/init";
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new HashMap<>();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = null;
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>();
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
      return var0;
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8130;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
            );
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
   }

   private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
                  0,
                  var0,
                  var3,
                  var1
               ),
               var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException(
            "me/octo/client/utils/client/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
