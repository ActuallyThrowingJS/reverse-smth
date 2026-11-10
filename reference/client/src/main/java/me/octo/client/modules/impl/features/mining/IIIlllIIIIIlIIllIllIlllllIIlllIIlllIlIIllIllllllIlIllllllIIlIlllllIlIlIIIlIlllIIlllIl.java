package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;

public final class IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl {
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   static {
      long var9 = 121474987077120L ^ 104774495515414L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[18];
      int var6 = 0;
      String var5 = "êªÍSc©\u008cz\b\u000f\u000fýó\u0088²\u000f\b\u0010¨ê²u¨ i!:RA\u008bK\u0099DÃ\u0018¨ê²u¨ i!\u0005Í\u0095m¹G`\u0002\u000f\u0096ÃZÄBù)\bæ\u0010\u0082«¼\u0081\u0088\u0095\u0018¨ê²u¨ i!\u0000\u0092}\u0092¼Uì\u0081\u008e\t\u0006ôç.x\u0017\u0010\u0016¨\u00160\u0097òê\u0081O©\u0015\u0081&UðB\u0010Åz³ßÙ±xÒ\u0012\"U\u0087\u0018\u008a·N\u0010àm,¤Î?Ù\u0002SLP³B#ú\u0091 A|\u009e\u0092)òBk)1Ø!ÊCÇ\"V»Q£{Ìæ©ÇkFÿOÏÕg\b\u0091D\u0014ÿÊÓ\u008cÓ Br\u0006>AµÎÙ)>\u0095Mù\fCÁ´\u0011lz<\u008fé1³F(äEZg\u0004\u0010.f\u001d²V÷\u009aÆN· x-(&\u0083\u0010¨ê²u¨ i!Z\u0080\r¨JT\u001e(\b\u0086VoQ\u008eá²@\u0018ä²¥O\u0015Â\u008cÇ\u0018R]\u0088§öÜ\u001d«LP<4¶\u0007Ì";
      int var7 = "êªÍSc©\u008cz\b\u000f\u000fýó\u0088²\u000f\b\u0010¨ê²u¨ i!:RA\u008bK\u0099DÃ\u0018¨ê²u¨ i!\u0005Í\u0095m¹G`\u0002\u000f\u0096ÃZÄBù)\bæ\u0010\u0082«¼\u0081\u0088\u0095\u0018¨ê²u¨ i!\u0000\u0092}\u0092¼Uì\u0081\u008e\t\u0006ôç.x\u0017\u0010\u0016¨\u00160\u0097òê\u0081O©\u0015\u0081&UðB\u0010Åz³ßÙ±xÒ\u0012\"U\u0087\u0018\u008a·N\u0010àm,¤Î?Ù\u0002SLP³B#ú\u0091 A|\u009e\u0092)òBk)1Ø!ÊCÇ\"V»Q£{Ìæ©ÇkFÿOÏÕg\b\u0091D\u0014ÿÊÓ\u008cÓ Br\u0006>AµÎÙ)>\u0095Mù\fCÁ´\u0011lz<\u008fé1³F(äEZg\u0004\u0010.f\u001d²V÷\u009aÆN· x-(&\u0083\u0010¨ê²u¨ i!Z\u0080\r¨JT\u001e(\b\u0086VoQ\u008eá²@\u0018ä²¥O\u0015Â\u008cÇ\u0018R]\u0088§öÜ\u001d«LP<4¶\u0007Ì"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "\u00adoL²@¢¶\u0002Åx£K\u0093ÛøÒ´Æ¾Ö\u0011Ñ\u0091¯\u0018À3£ÞMJáBÏøÕ15?×Y³\u0005}\u0091pA2%";
            var7 = "\u00adoL²@¢¶\u0002Åx£K\u0093ÛøÒ´Æ¾Ö\u0011Ñ\u0091¯\u0018À3£ÞMJáBÏøÕ15?×Y³\u0005}\u0091pA2%".length();
            var4 = '\u0018';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[8], var0[17], 1, 8, 3, 0, 32, null
                  );
                  String var26 = var0[0];
                  String var27 = var0[11];
                  String[] var11 = new String[]{var0[6], var0[14], var0[1], var0[4]};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, 0, var11
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     var0[10], var0[9], new Color(0, 255, 255).getColorAsInt()
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var0[12], var0[16], 0.0F, 1.0F, 0.35F, 0.05F, 0, 64, null
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var0[13], var0[5], 1.0F, 24.0F, 2.0F, 0.5F, 0, 64, null
                  );
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var0[2], var0[3], 0.0F, 1.0F, 1.0F, 0.05F, 0, 64, null
                  );
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var0[7], var0[15], 0.0F, 1.0F, 0.5F, 0.05F, 0, 64, null
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
