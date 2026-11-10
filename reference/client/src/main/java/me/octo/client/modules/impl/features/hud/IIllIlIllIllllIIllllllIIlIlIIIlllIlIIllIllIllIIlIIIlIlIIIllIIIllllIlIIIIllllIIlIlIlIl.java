package me.octo.client.modules.impl.features.hud;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   static {
      long var9 = 3663875526594L ^ 124210771702827L;
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
      String var5 = "Õe\u009e\u0007¹\u001e]\u009d(µ\u0082(\u009aØ\u0001²×&´\u008b\u0098¦×\u0001hÓ¾V\u00192^\u0095\u009dwÖ\f\u0012ØÉx?lÈ¿ý\u0096\u008e×\u008fLr\u0004÷»Ú¤\u0005Cxþ\u0015A[\u008dG\u0093üÅ\u0092diÓH\u0090¬ö\u0090ÀûÉÝ{^Ff\u0091\u009d\u0095DUªÝÕ\u0085º=íàð\u0004bx4+)¬\u001bêæ\u0014\u001eà Ëáoº3`ÓkÝ´É\"Û*\u001eä8µAwÔJÀq \u008fÔ¨2Q(VüoÔ oÑû2T\u0011\"\u0092Ü@?ÿ\"\u008fÙ,¹ýÝ!éÌ\u0003(dÅïØÙWWUÊ\"KäxpÓ¾V\u00192^\u0095\u009d5\u000bÜÓ=\u001a\u0097\u0001Û\n\u0081îvE\"$ör9bWÉªÝ\u0015/\u00ad¹\u009eÙÒ\u0019/¤ÁÊ\u0014F\u007f\u001e\u001aUy«\u0090Ï@ù<[ñ\u001a ä_`÷\u0097 ÀÃhÍö\u001d\u0015 â½ù\u008a²\u0081\u0096y\u0015ÿ¤¹FyDF\u0085|Õ\u0082\u00adÆâ\u00931N=×_T\u0011\u0083\u0082\u009b¾G]";
      int var7 = "Õe\u009e\u0007¹\u001e]\u009d(µ\u0082(\u009aØ\u0001²×&´\u008b\u0098¦×\u0001hÓ¾V\u00192^\u0095\u009dwÖ\f\u0012ØÉx?lÈ¿ý\u0096\u008e×\u008fLr\u0004÷»Ú¤\u0005Cxþ\u0015A[\u008dG\u0093üÅ\u0092diÓH\u0090¬ö\u0090ÀûÉÝ{^Ff\u0091\u009d\u0095DUªÝÕ\u0085º=íàð\u0004bx4+)¬\u001bêæ\u0014\u001eà Ëáoº3`ÓkÝ´É\"Û*\u001eä8µAwÔJÀq \u008fÔ¨2Q(VüoÔ oÑû2T\u0011\"\u0092Ü@?ÿ\"\u008fÙ,¹ýÝ!éÌ\u0003(dÅïØÙWWUÊ\"KäxpÓ¾V\u00192^\u0095\u009d5\u000bÜÓ=\u001a\u0097\u0001Û\n\u0081îvE\"$ör9bWÉªÝ\u0015/\u00ad¹\u009eÙÒ\u0019/¤ÁÊ\u0014F\u007f\u001e\u001aUy«\u0090Ï@ù<[ñ\u001a ä_`÷\u0097 ÀÃhÍö\u001d\u0015 â½ù\u008a²\u0081\u0096y\u0015ÿ¤¹FyDF\u0085|Õ\u0082\u00adÆâ\u00931N=×_T\u0011\u0083\u0082\u009b¾G]"
         .length();
      char var4 = 24;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[0], var0[1], true);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[4], var0[3], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[5], var0[2], true);
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

                  var5 = "\\¡[\u0082aÓ\u0004ýaù_¼ö×k¦\u0018à\u0095=?³è\rî*|\u001a\u0003µD«\u0015Ó?\u0019=Ë4N)";
                  var7 = "\\¡[\u0082aÓ\u0004ýaù_¼ö×k¦\u0018à\u0095=?³è\rî*|\u001a\u0003µD«\u0015Ó?\u0019=Ë4N)".length();
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
