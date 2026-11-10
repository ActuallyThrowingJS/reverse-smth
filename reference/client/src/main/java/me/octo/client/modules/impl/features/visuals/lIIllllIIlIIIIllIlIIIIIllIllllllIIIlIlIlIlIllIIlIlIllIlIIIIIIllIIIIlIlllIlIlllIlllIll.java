package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import org.jetbrains.annotations.NotNull;

public final class lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll {
   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   static {
      long var16 = 104118165215140L ^ 128799648372418L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)(var16 << var9 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[2];
      int var13 = 0;
      String var12 = "ÀÒ\u008fÃ*b9ö\u0018½á³\u009dð*\r\u001dgÕ×Î¯yw\u001eÅ:OÃ\u008eêEO";
      int var14 = "ÀÒ\u008fÃ*b9ö\u0018½á³\u009dð*\r\u001dgÕ×Î¯yw\u001eÅ:OÃ\u008eêEO".length();
      char var11 = '\b';
      int var10 = -1;

      while (true) {
         byte[] var15 = var8.doFinal(var12.substring(++var10, var10 + var11).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var7[var13++] = var22;
         if ((var10 += var11) >= var14) {
            Cipher var2;
            var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var3 = 1; var3 < 8; var3++) {
               var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var4 = -6458699667164053487L;
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
            long var25 = (var6[0] & 255L) << 56
               | (var6[1] & 255L) << 48
               | (var6[2] & 255L) << 40
               | (var6[3] & 255L) << 32
               | (var6[4] & 255L) << 24
               | (var6[5] & 255L) << 16
               | (var6[6] & 255L) << 8
               | var6[7] & 255L;
            var10001 = -1;
            long var0 = var25;
            IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var7[0], var7[1], (int)var0
            );
            return;
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
