package me.octo.client.modules.impl.macros;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII {
   @NotNull
   public static IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   static {
      long var9 = 80254880971250L ^ 108676247905428L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[6];
      int var6 = 0;
      String var5 = "ì6ÃZ%\\H0m\u0096¦¼\f\u0014Bÿ&ëª\u0018\u009d\u001d ¿\u0010\u0091Üó\u007f¤\u00835xÃ\u009d\u0016jû&Z# u<âÌÛi\\\u0086\u008c¸LÛ~\u0094ºÈI¶9¯O5\u009aiÉ½\u0006¶rMf¾@)T(y£§T\u008aÞ9êÛ,é\nÞ\u0002\u0012^ß÷ú\u009dÝ\u009d¸Q ¢É¹\u000eþNÖò\u0093WÏó< \u0080kf¹ß|\u009eÓóyÎ\u0099S¾IÚHD1\u008e·¡";
      int var7 = "ì6ÃZ%\\H0m\u0096¦¼\f\u0014Bÿ&ëª\u0018\u009d\u001d ¿\u0010\u0091Üó\u007f¤\u00835xÃ\u009d\u0016jû&Z# u<âÌÛi\\\u0086\u008c¸LÛ~\u0094ºÈI¶9¯O5\u009aiÉ½\u0006¶rMf¾@)T(y£§T\u008aÞ9êÛ,é\nÞ\u0002\u0012^ß÷ú\u009dÝ\u009d¸Q ¢É¹\u000eþNÖò\u0093WÏó< \u0080kf¹ß|\u009eÓóyÎ\u0099S¾IÚHD1\u008e·¡"
         .length();
      char var4 = '\u0018';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var21;
         if ((var3 += var4) >= var7) {
            var5 = "µ ¨V\u001f\u000fj¶ÙþÄoê/\u009e(H[É÷¦\r\u0086\u001bpý?§«ó¼\u0089$\u0083\t6\r\u000f=\u0002:¸Ç¢kÊj\u001cx\n\rÜe\u0093nÇ¸Ï÷®},û\u0003O\u0097\u0013k\u0017Aís\u0005¬\u0088Í\u0018÷âCw¯!Ä4+ôÌ\u0005";
            var7 = "µ ¨V\u001f\u000fj¶ÙþÄoê/\u009e(H[É÷¦\r\u0086\u001bpý?§«ó¼\u0089$\u0083\t6\r\u000f=\u0002:¸Ç¢kÊj\u001cx\n\rÜe\u0093nÇ¸Ï÷®},û\u0003O\u0097\u0013k\u0017Aís\u0005¬\u0088Í\u0018÷âCw¯!Ä4+ôÌ\u0005"
               .length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var0[var6++] = var23;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIIIIllIlIIlIIlllIIlIlIIIlllllIIIlIlIIllllllIlIIIIIIIIIIIlIIIIllIllllIIIlIlIIIII();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[0], var0[3], false);
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[4], var0[5], false);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[1], var0[2], 150, 500, 200, 0, 32, null
                  );
                  return;
               }

               var4 = var5.charAt(var3);
            }
         }

         var4 = var5.charAt(var3);
      }
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
}
