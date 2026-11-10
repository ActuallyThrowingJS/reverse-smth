package me.octo.client.modules.impl.features.hud;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   static {
      long var9 = 44893122062325L ^ 137948447695700L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "\u0088R\u0089áªÿ\u000fÙ\u0090rÙ\u008b×j\b\u001eÕ\u0018fdh¼Ün\"Ïæ^Á@\u0002üï\u0093CÞà¶ÅY.F\u000f\u0089§?Ú\u009b³\u0012N¨\u0094O\u0010\u0007nÑ\u008b:A\u009cÅä8\u0088R\u0089áªÿ\u000fÙ\u0090rÙ\u008b×j\b\u001eÕ\u0018fdh¼Ün\"Ïæ^Á@\u0002ü0µ)\u0001Q\u0093>T\u0001ºð\u0013ó?4h¨Â\u0012-\u0014pB\u0003";
      int var7 = "\u0088R\u0089áªÿ\u000fÙ\u0090rÙ\u008b×j\b\u001eÕ\u0018fdh¼Ün\"Ïæ^Á@\u0002üï\u0093CÞà¶ÅY.F\u000f\u0089§?Ú\u009b³\u0012N¨\u0094O\u0010\u0007nÑ\u008b:A\u009cÅä8\u0088R\u0089áªÿ\u000fÙ\u0090rÙ\u008b×j\b\u001eÕ\u0018fdh¼Ün\"Ïæ^Á@\u0002ü0µ)\u0001Q\u0093>T\u0001ºð\u0013ó?4h¨Â\u0012-\u0014pB\u0003"
         .length();
      char var4 = '@';
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[3], var0[1], false);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[2], var0[0], false);
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "_Ï\u000eSu\u0085¡Äô¦´\u0006\u001d\u009c4\u000f\u0084U¼\u00928\u0081IH\u0018_Ï\u000eSu\u0085¡Ä\u0086w\u0090\u00adÚ2&:ª\u0088Ë\u009a\u0094\u0015nw";
                  var7 = "_Ï\u000eSu\u0085¡Äô¦´\u0006\u001d\u009c4\u000f\u0084U¼\u00928\u0081IH\u0018_Ï\u000eSu\u0085¡Ä\u0086w\u0090\u00adÚ2&:ª\u0088Ë\u009a\u0094\u0015nw"
                     .length();
                  var4 = 24;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
