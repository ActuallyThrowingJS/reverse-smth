package me.octo.client.modules.impl.features.misc;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   static {
      long var9 = 128675389219160L ^ 41799883140835L;
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
      String var5 = "ò&|á\u000e+³5ºeF\u00824=\u0015 ?Ðù\u009b=ÎÄ\u009cÎ\u0093\u009a\u0016\u0086jA×\u007f\u008a*¢¬Ý´å\u0089\u001cÁSLH\u0006\u0013@ì) [obXí%â (%\u0090híR: ³3\u008a\u001b\bW#´@U\u000e§Ó\u0010 $¹I\u0013ù¯öV\u0091<Q¹ÄØÕ8[\"Àqs³\"ÈÒÚ\u0097F\u0013Å=f»U#t\u001di¼´\u008f]¸½~ðH\u000ezñ\u00ad4æà\u0087o¥\u0085\u008a\u009fhßÏM\rü¨Ý¡\u008eûË \u0081\u0092}ymrªÑ¦A»jî Ø}¬\u001cûl\u0092\u0080G\u001aëf\u0084\u0082,SR\u0006\b\u000b\u0099â¯AÄyÉ";
      int var7 = "ò&|á\u000e+³5ºeF\u00824=\u0015 ?Ðù\u009b=ÎÄ\u009cÎ\u0093\u009a\u0016\u0086jA×\u007f\u008a*¢¬Ý´å\u0089\u001cÁSLH\u0006\u0013@ì) [obXí%â (%\u0090híR: ³3\u008a\u001b\bW#´@U\u000e§Ó\u0010 $¹I\u0013ù¯öV\u0091<Q¹ÄØÕ8[\"Àqs³\"ÈÒÚ\u0097F\u0013Å=f»U#t\u001di¼´\u008f]¸½~ðH\u000ezñ\u00ad4æà\u0087o¥\u0085\u008a\u009fhßÏM\rü¨Ý¡\u008eûË \u0081\u0092}ymrªÑ¦A»jî Ø}¬\u001cûl\u0092\u0080G\u001aëf\u0084\u0082,SR\u0006\b\u000b\u0099â¯AÄyÉ"
         .length();
      char var4 = 'H';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "BoGÈ¦\u0081\u0003RÙ¢ò}ö¬ä&\u0010O\u0081\u000eS\u0013\u0092´\u001a\u0000v\u008a$)1!@";
            var7 = "BoGÈ¦\u0081\u0003RÙ¢ò}ö¬ä&\u0010O\u0081\u000eS\u0013\u0092´\u001a\u0000v\u008a$)1!@".length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[2], var0[4], true);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[6], var0[3], true);
                  String var26 = var0[7];
                  String var27 = var0[0];
                  String[] var11 = new String[]{var0[1], var0[5]};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, var11
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
