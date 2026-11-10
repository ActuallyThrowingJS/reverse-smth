package me.octo.client.modules.impl.macros;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll {
   @NotNull
   public static IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll() {
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
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
      long var9 = 50709309493981L ^ 66939786200055L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[9];
      int var6 = 0;
      String var5 = "\u008b\u0098\u00adØe%£È¬»^KÃ\u009aÚ\u0001ù|Ã7W\u001cÿIÔGN©2¦\"Ùy{>0Ï\u0010øm?\u0006·\u001e'GÀ\bî>\t-z\u0084ü/\b(¯¶/WÞ\u0090|\u0010\u0098L\u001c|0\u001c\u0092.\u0006»w\u0082wÊ;\u0016\u0010o±\u008fJð8\u00174©o\f±\u00adD\u0087\u000e\u0010F\u0005\u0007¸#5¦\u00865¼\u000f('x\u001f\u0001\b\u0081&.å&ù\u008f\u0089\u0010Y2Jìñnÿ\t\b\u001b\u0015\u0083E7ä\u001e";
      int var7 = "\u008b\u0098\u00adØe%£È¬»^KÃ\u009aÚ\u0001ù|Ã7W\u001cÿIÔGN©2¦\"Ùy{>0Ï\u0010øm?\u0006·\u001e'GÀ\bî>\t-z\u0084ü/\b(¯¶/WÞ\u0090|\u0010\u0098L\u001c|0\u001c\u0092.\u0006»w\u0082wÊ;\u0016\u0010o±\u008fJð8\u00174©o\f±\u00adD\u0087\u000e\u0010F\u0005\u0007¸#5¦\u00865¼\u000f('x\u001f\u0001\b\u0081&.å&ù\u008f\u0089\u0010Y2Jìñnÿ\t\b\u001b\u0015\u0083E7ä\u001e"
         .length();
      char var4 = '8';
      int var13 = -1;

      label28:
      while (true) {
         String var14 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var20;
                  if ((var13 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlllllIIllIlIIIlIlIIIIllIIlllIIIlIllIlIIIlIIIlIIIIlllIlllIlIlIllIIlIIlIlIIIlIIIllIlll();
                     String var23 = var0[3];
                     String var24 = var0[8];
                     String[] var11 = new String[]{var0[1], var0[5], var0[2]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[6], var0[0], true);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[4], var0[7], 1, 5, 1, 1
                     );
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var20;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label28;
                  }

                  var5 = "2+ÄåkÏ\r\u0099\u0001©n_j&ç>*Ð>ëûYq \u0086\u000e\u009e\u0094\u009a¹¶¢À\u0089\u0097*\u009dñÉU(di¨`b\u0016}¸Ë\u001e_\u0092?)H\"¥47©\u0085yíÖ\u009c\u0087Wº \u0001Q9\u0014\u0004n$\u00ad?P?";
                  var7 = "2+ÄåkÏ\r\u0099\u0001©n_j&ç>*Ð>ëûYq \u0086\u000e\u009e\u0094\u009a¹¶¢À\u0089\u0097*\u009dñÉU(di¨`b\u0016}¸Ë\u001e_\u0092?)H\"¥47©\u0085yíÖ\u009c\u0087Wº \u0001Q9\u0014\u0004n$\u00ad?P?"
                     .length();
                  var4 = '(';
                  var13 = -1;
            }

            var14 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
