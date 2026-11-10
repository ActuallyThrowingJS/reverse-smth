package me.octo.client.modules.impl.features.misc;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   static {
      long var9 = 113928072942281L ^ 27429200923612L;
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
      String var5 = "?\u009a3;¾¬JNK\u0083r\u009co¶ÊR\u009bJÄÍ0\u001bpÏóu½\u0004nd\u0004¼\ff\u00813X\rÔ\u001e\u0082Ø \u0099±\\¿q#»\u0085ÚC{¢\u0087\u0010Ê.8urê\u0007±tôÁÀS\u0096\u0090>(Ç\u0014xË\u009d\u009ah3\tÓaíær¯¾\u0097=õ\u0094\u009c\u009b±ÊÑrt\u0002\u009b¬\u009bª^\u0014ZK\u0019\u0096Ù¿\u0010A\u001a\u008cº\u0093ê¸fB\u009b:\u0015çt\u001ab";
      int var7 = "?\u009a3;¾¬JNK\u0083r\u009co¶ÊR\u009bJÄÍ0\u001bpÏóu½\u0004nd\u0004¼\ff\u00813X\rÔ\u001e\u0082Ø \u0099±\\¿q#»\u0085ÚC{¢\u0087\u0010Ê.8urê\u0007±tôÁÀS\u0096\u0090>(Ç\u0014xË\u009d\u009ah3\tÓaíær¯¾\u0097=õ\u0094\u009c\u009b±ÊÑrt\u0002\u009b¬\u009bª^\u0014ZK\u0019\u0096Ù¿\u0010A\u001a\u008cº\u0093ê¸fB\u009b:\u0015çt\u001ab"
         .length();
      char var4 = '8';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var21;
         if ((var3 += var4) >= var7) {
            var5 = "<Ä}MÅ&,ÄþAih\u0098X£\u008eÁ\n´Ö\u000e \u0013me\u0081Ëô\u009a¹\u0007\u001e+ú\u009a°Øt\u009ckEådþf!<û'iL¤3wU\u0099Ë.÷w¶«ü\nwÅ\u0086S\u0098ÛÕ\u0082\u0018\u0014\u0091vJló\u0001¨¥ø§k\u0003o¦áZ\u009dH\u0005\u0002\u001dyj";
            var7 = "<Ä}MÅ&,ÄþAih\u0098X£\u008eÁ\n´Ö\u000e \u0013me\u0081Ëô\u009a¹\u0007\u001e+ú\u009a°Øt\u009ckEådþf!<û'iL¤3wU\u0099Ë.÷w¶«ü\nwÅ\u0086S\u0098ÛÕ\u0082\u0018\u0014\u0091vJló\u0001¨¥ø§k\u0003o¦áZ\u009dH\u0005\u0002\u001dyj"
               .length();
            var4 = 'H';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var0[var6++] = var23;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[5], var0[4], true);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[3], var0[2], 110, 400, 250, 10
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[1], var0[0], 0, 3, 0, 1
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
