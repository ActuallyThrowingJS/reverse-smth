package me.octo.client.modules.impl.macros.foraging;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
   @NotNull
   public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI() {
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
   public final me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   static {
      long var9 = 140210268493418L ^ 129328559354466L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[8];
      int var6 = 0;
      String var5 = "\u009f.åÒ¶à¼XQZ½\u0016â[§ð\u0010\u0088ºè\u0093ÿY\u0083\u0099\u0001\u000b\tow\u009fÃq Ï>ÄåLeÓ¬Çõ\u0093\u000e¤\u009bü\u0011\u00ad\u0081)gñ\u0089cÞ\fZ\u001fôj²\u0091ëHlq3Ù\u0081s6ÛÛYÊ#z«æàUOsïÿÿmiúÕ\u00adFÜ\r\u0087\u0010¸\u0082äü \u00adú\u000e\u0017L\u0018ö)ëã]¨æó\u00969Êê\u0004Ô¾M?ìÞ\u001e·©\\=â ²\u0006\u0095 õ\u0003ö5ÞW\u0012áóiÝßÑß8\u008dNÄ\u0010]±Ó'Ä\u0016'¼J/«\u0094F\b\u008d+\u0018\n\u0001¶.ø";
      int var7 = "\u009f.åÒ¶à¼XQZ½\u0016â[§ð\u0010\u0088ºè\u0093ÿY\u0083\u0099\u0001\u000b\tow\u009fÃq Ï>ÄåLeÓ¬Çõ\u0093\u000e¤\u009bü\u0011\u00ad\u0081)gñ\u0089cÞ\fZ\u001fôj²\u0091ëHlq3Ù\u0081s6ÛÛYÊ#z«æàUOsïÿÿmiúÕ\u00adFÜ\r\u0087\u0010¸\u0082äü \u00adú\u000e\u0017L\u0018ö)ëã]¨æó\u00969Êê\u0004Ô¾M?ìÞ\u001e·©\\=â ²\u0006\u0095 õ\u0003ö5ÞW\u0012áóiÝßÑß8\u008dNÄ\u0010]±Ó'Ä\u0016'¼J/«\u0094F\b\u008d+\u0018\n\u0001¶.ø"
         .length();
      char var4 = 16;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI();
                     String var23 = var0[6];
                     String var24 = var0[3];
                     String[] var11 = new String[]{var0[5], var0[1]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[0], var0[2], true);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
                        var0[7],
                        var0[4],
                        IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                           .getParentFolderName(),
                        new String[0],
                        0,
                        null,
                        48,
                        null
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

                  var5 = "iý\u0091çÀmÜç#\u0089éàlp1µÖ~z>l\u0092\u0007\u0018\u0010³':\u0088\u0005\u0004\f\u0091\u001a|i\u000f\u001c\u0003Åç";
                  var7 = "iý\u0091çÀmÜç#\u0089éàlp1µÖ~z>l\u0092\u0007\u0018\u0010³':\u0088\u0005\u0004\f\u0091\u001a|i\u000f\u001c\u0003Åç".length();
                  var4 = 24;
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
