package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl {
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   static {
      long var9 = 86840007923181L ^ 140470247802073L;
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
      String var5 = "\u0015\u0016Àà¼\u0010¸w Ðâ\u001d\u0091\u0001yù\u009fd\u0099\u001eÓÅ:.1¥ã?K\u001bY¦·ÙZú¦\u0014ÐP\u00978\u0014º\n¨%\u0018ãË\u0083\u0084\u0011û\u009e±\u0097~×1Ø%K\u008bûF\tíï\u0014\u008d÷\u0001\"S%è}\u0085÷ú\u0081A¿G\u0099äv=\u008cT\u001a\u0017_®\u009d½d\b5¢~\u00142:x\u0091\b\u0015\u0016Àà¼\u0010¸w\u0010K®\u009f\u0013ÍÙe.ÙLïOPú\u0017O\bxå|\u009eÿeH(";
      int var7 = "\u0015\u0016Àà¼\u0010¸w Ðâ\u001d\u0091\u0001yù\u009fd\u0099\u001eÓÅ:.1¥ã?K\u001bY¦·ÙZú¦\u0014ÐP\u00978\u0014º\n¨%\u0018ãË\u0083\u0084\u0011û\u009e±\u0097~×1Ø%K\u008bûF\tíï\u0014\u008d÷\u0001\"S%è}\u0085÷ú\u0081A¿G\u0099äv=\u008cT\u001a\u0017_®\u009d½d\b5¢~\u00142:x\u0091\b\u0015\u0016Àà¼\u0010¸w\u0010K®\u009f\u0013ÍÙe.ÙLïOPú\u0017O\bxå|\u009eÿeH("
         .length();
      char var4 = '\b';
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
                     String var23 = var0[4];
                     String var24 = var0[8];
                     String[] var11 = new String[]{var0[6], var0[7], var0[0]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, 1, var11
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[5], var0[1], 0.0F, 1.0F, 1.0F, 0.05F, 0, 64, null
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[3], var0[2], 1, 8, 1, 0, 32, null
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

                  var5 = "¢X\u0083òp<\u00ad\u00ad\u0000S¡\u0001É\"^\u00878N±=\u0006ÛîÐ¿µ«\u00057(V\u0091\u0088Ð\u0081ñ\u0005Ñê¸\u0089cRT\u0010m\u009e\u0006\u0099[ùV\u0096¤\u0001\u0091*¼]\u000eg¿>§çK$ÛîAe.D";
                  var7 = "¢X\u0083òp<\u00ad\u00ad\u0000S¡\u0001É\"^\u00878N±=\u0006ÛîÐ¿µ«\u00057(V\u0091\u0088Ð\u0081ñ\u0005Ñê¸\u0089cRT\u0010m\u009e\u0006\u0099[ùV\u0096¤\u0001\u0091*¼]\u000eg¿>§çK$ÛîAe.D"
                     .length();
                  var4 = 16;
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
