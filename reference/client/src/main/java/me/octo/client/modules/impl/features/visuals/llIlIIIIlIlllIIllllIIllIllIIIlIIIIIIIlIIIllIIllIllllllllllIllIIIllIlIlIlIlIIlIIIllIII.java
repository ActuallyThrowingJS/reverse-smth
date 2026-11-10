package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII {
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;

   static {
      long var16 = 78930592670139L ^ 25480167714324L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)(var16 << var9 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[10];
      int var13 = 0;
      String var12 = "ß\u0091\u0082½\u008b\u0082\u008d¨l.ãë\u0099ïìÏ\u0007V\n\u0086\u0084\b\u009aP\u0011@ßþrýþbÅhº\u008a\u001e\u0091\u0007\bP\u00048kWê\u0017O9î·ÝÈ\u0088ÀØ\u008bQ`\"¿½ª(\n \u0005¤\u009a\u0096v¦,âc»|ñ\u001a1QÞÛ¾\u0097D\u007fØ;ÂMÝ\u0007ëÙÈÍÀ{'\u008b\f\u0090qmxkUÌñNMjÇ#]Gî(ö\u0088\bãÄ5ÓÆËz\u0085\bã`\rö\u0094~Ñn8\u008e_\u009aRÙñéáX\u008bÞ\u008cJy\u009cD«qUÔ$õ»ü`íët\u0011\u001eEP\u00162Yq\u0081\tÈ\u0087\u0012\u001f®,³x\u000bO\u0093LèD2}¶à\bî\u0085ø~\u0013OY\u0015\u0018ä5+Å\u001d©Fá÷\u009a}O\u0013ØVÝçÝ2Tú*~^\u0010\u0019\u009aÁÚ\u0090\u001c¡ÆL|ÖS\u009e²\u0098\u001b";
      int var14 = "ß\u0091\u0082½\u008b\u0082\u008d¨l.ãë\u0099ïìÏ\u0007V\n\u0086\u0084\b\u009aP\u0011@ßþrýþbÅhº\u008a\u001e\u0091\u0007\bP\u00048kWê\u0017O9î·ÝÈ\u0088ÀØ\u008bQ`\"¿½ª(\n \u0005¤\u009a\u0096v¦,âc»|ñ\u001a1QÞÛ¾\u0097D\u007fØ;ÂMÝ\u0007ëÙÈÍÀ{'\u008b\f\u0090qmxkUÌñNMjÇ#]Gî(ö\u0088\bãÄ5ÓÆËz\u0085\bã`\rö\u0094~Ñn8\u008e_\u009aRÙñéáX\u008bÞ\u008cJy\u009cD«qUÔ$õ»ü`íët\u0011\u001eEP\u00162Yq\u0081\tÈ\u0087\u0012\u001f®,³x\u000bO\u0093LèD2}¶à\bî\u0085ø~\u0013OY\u0015\u0018ä5+Å\u001d©Fá÷\u009a}O\u0013ØVÝçÝ2Tú*~^\u0010\u0019\u009aÁÚ\u0090\u001c¡ÆL|ÖS\u009e²\u0098\u001b"
         .length();
      char var11 = '(';
      int var10 = -1;

      while (true) {
         byte[] var15 = var8.doFinal(var12.substring(++var10, var10 + var11).getBytes("ISO-8859-1"));
         String var30 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var7[var13++] = var30;
         if ((var10 += var11) >= var14) {
            var12 = "\u0083ú8\u0084¨\u0015!¸Âè(øÝøõÀ±Ø¤Ý\f8\u009dF\u0018ZôMP°\u0007ïáÁ\u007f©ª\u0002Øë\u0014\\×4G\r$\u0006e";
            var14 = "\u0083ú8\u0084¨\u0015!¸Âè(øÝøõÀ±Ø¤Ý\f8\u009dF\u0018ZôMP°\u0007ïáÁ\u007f©ª\u0002Øë\u0014\\×4G\r$\u0006e".length();
            var11 = '\u0018';
            var10 = -1;

            while (true) {
               var15 = var8.doFinal(var12.substring(++var10, var10 + var11).getBytes("ISO-8859-1"));
               String var32 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var27 = 0;
               var7[var13++] = var32;
               if ((var10 += var11) >= var14) {
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -2189158819315294397L;
                  byte[] var6 = var2.doFinal(
                     new byte[]{
                        (byte)(var4 >>> 56),
                        (byte)(var4 >>> 48),
                        (byte)(var4 >>> 40),
                        (byte)(var4 >>> 32),
                        (byte)(var4 >>> 24),
                        (byte)(var4 >>> 16),
                        (byte)(var4 >>> 8),
                        (byte)var4
                     }
                  );
                  long var35 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var27 = -1;
                  long var0 = var35;
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var7[3], var7[9], 0.8F, 2.0F, 1.0F, 0.05F, 0, 64, null
                  );
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var7[5], var7[8], 0.2F, 1.0F, 0.85F, 0.05F, 0, 64, null
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var7[7], var7[4], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var7[2], var7[0], true);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var7[6], var7[1], false);
                  return;
               }

               var11 = var12.charAt(var10);
            }
         }

         var11 = var12.charAt(var10);
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
