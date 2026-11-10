package me.octo.client.modules.impl.features.mining;

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
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   static {
      long var9 = 2201466205130L ^ 106807189020839L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[10];
      int var6 = 0;
      String var5 = "¼Äs'jøM5\u0003IªFÁ\u0097¦â@\u009bÆÀ©\u001atì\fþèåÆ\u0012\u0091\u0018)^\u000e,\u0085Y\u0006\u008aU\u0016eÕïµ\u0013\u00ad¦èfÞE\u0088?yP£\u0012à6Vì¢Ç\u009d{ÿP-vxML\u0011ê\"\u008f£=¾(Ì\u00ad´p\u0000e»¡¹j,¶«Å\u0097ux?\u007f\u009d<¨06Ð\u0094Ö\u000e\u0010¼\u0010î¤oÃ\u0080\u0096UË;0H\u000eÄÜØÛì[¼úú\u0004cÔ\u00817CÖñ\t_ \u007f¸\u000eË©Ê\u000b£k¿=¸V\u0090q|ßn\u000557Ô.{â\u0006 \u0092_\u001drl^!\u001c«êj;è\u0082\nµVy«Sð1¾s\u001aò8rC[;\u0003\u0018JrÂ7\u008c\u0012iëhï°\u0090EôEi\u0000/\u0087$PM¯\u008bH\u0016\bB\u008eC\u0091DLf\u009d\u0094zt^\u001fë.\u0084µØ&aAmCÕ\u001c\u001c7ø}ë\u0098d·e:§\u0088\u0092ÞïI#Húf\u008cñ\u0006¢\u0005ä¦â\u0082>¬6à¦)e\u00839>;X\u0089j\f\u0011 |rá\u0097\\\u0012\u0014\u0004\u009b\u009d©\u0004\u009dkZGÄ\u001a|\u009dV\u0087¢\u001a4\u0010,¼\u008e\u0097µË";
      int var7 = "¼Äs'jøM5\u0003IªFÁ\u0097¦â@\u009bÆÀ©\u001atì\fþèåÆ\u0012\u0091\u0018)^\u000e,\u0085Y\u0006\u008aU\u0016eÕïµ\u0013\u00ad¦èfÞE\u0088?yP£\u0012à6Vì¢Ç\u009d{ÿP-vxML\u0011ê\"\u008f£=¾(Ì\u00ad´p\u0000e»¡¹j,¶«Å\u0097ux?\u007f\u009d<¨06Ð\u0094Ö\u000e\u0010¼\u0010î¤oÃ\u0080\u0096UË;0H\u000eÄÜØÛì[¼úú\u0004cÔ\u00817CÖñ\t_ \u007f¸\u000eË©Ê\u000b£k¿=¸V\u0090q|ßn\u000557Ô.{â\u0006 \u0092_\u001drl^!\u001c«êj;è\u0082\nµVy«Sð1¾s\u001aò8rC[;\u0003\u0018JrÂ7\u008c\u0012iëhï°\u0090EôEi\u0000/\u0087$PM¯\u008bH\u0016\bB\u008eC\u0091DLf\u009d\u0094zt^\u001fë.\u0084µØ&aAmCÕ\u001c\u001c7ø}ë\u0098d·e:§\u0088\u0092ÞïI#Húf\u008cñ\u0006¢\u0005ä¦â\u0082>¬6à¦)e\u00839>;X\u0089j\f\u0011 |rá\u0097\\\u0012\u0014\u0004\u009b\u009d©\u0004\u009dkZGÄ\u001a|\u009dV\u0087¢\u001a4\u0010,¼\u008e\u0097µË"
         .length();
      char var4 = 16;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[0], var0[7], false);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[9], var0[3], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[4], var0[1], false);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[8], var0[2], false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[5], var0[6], 50, 500, 200, 10
                     );
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

                  var5 = "JG\u009b|\u0099a\u0015=Ô¼\u009b>\u0019êá\u0087\u0018×íZ¢4\u0088îDýf®7Ý¾Ü\u001eÁÌJ?\u00adÞä·";
                  var7 = "JG\u009b|\u0099a\u0015=Ô¼\u009b>\u0019êá\u0087\u0018×íZ¢4\u0088îDýf®7Ý¾Ü\u001eÁÌJ?\u00adÞä·".length();
                  var4 = 16;
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
