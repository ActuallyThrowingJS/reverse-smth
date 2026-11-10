package me.octo.client.modules.impl.features.hud;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll {
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static BooleanSetting IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

   @NotNull
   public static final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public static final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public static final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public static final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public static final BooleanSetting lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public static final BooleanSetting IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public static final BooleanSetting IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public static final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   static {
      long var9 = 103928399016097L ^ 129102890651173L;
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
      String var5 = "¿±d\u0001\u0089¾\u009e$üý\u0095EÆ\u001a\"\u0088xÀ\u0011É0RÈÜl¡ó\u009fÕøí\u0092jÍ\nñYUüØN×\u0016^\u001d\u009a\\\u0007ò\u0090\u0089\u0093Æo\u000e)\u0019íY§Ô-¶\u009eT\u0007ö ¯@ó¯J\u008eÛ©ÛðæØ÷Äj&\u0005#\u000e]¯£\u0098\u001dyþ'ÔP\u008bÅÅ`Q:¨4Y_þvV¤ó\u000b\u0010PY¼î9 ]HºÛ\u00adq\u001c\t\u0018ú@Ýò÷ø\u009fÞ\u0018\u001cW\u008c.î\u008aÍ\u0098û#\by\u0082\"\\±Ê\u0083\u0015gaK\u0096ÿ\bÏ>\u009d\u0011\u001aM%Ê\u0010q\u000b\u0088i-îj¤8\u009eM{\u0006K[\u0085\bAþ\u0093§\u008b\td\u0005\u0010\u001c\u000fÐºÑXøî°0\u009fl=KÁÚ\u0010þD¨ë\u009b\n\u008dt\u001eMß\u009aÓs)Þ\u0010ÄÙ\u009dç³\u0001½\u008dÃ\u0018àà¯\u0013q\u0083\u0018ØÙ¤-Uü©Ð2Ñ\u0084(h½Jz£\u0013Ä¯c±dO\b\u0017Ò åôuÊ¬ uè¤+PO\u009aDä6â\u0007-³ùà}ò<NõgýCEW\u000eæâ\u0083/ç\u0018Ø$]\u0016ÜæÂÙö\u0007ýÀ!\u001c\u001c-\u000fä\u001b\u0096Ç²kô(ýjpY0¼{¦ºU[o¡òcW>NBèÙ\u0093¡å£\u0083Ð´\u0005_\f\u000bÒ]Ç\u008f?!È2\u0010\u0087®÷\u008e¾0sô\u008f?½\bËøª}(ç[\u0095b4Ï_\u0096\u0081\u001b\u008b\u0094ZúPkÙüzð\r²ê\n\u009f\u0082f\u008c3?d&ÚÍ\u0011ñÜ\u008c8)";
      int var7 = "¿±d\u0001\u0089¾\u009e$üý\u0095EÆ\u001a\"\u0088xÀ\u0011É0RÈÜl¡ó\u009fÕøí\u0092jÍ\nñYUüØN×\u0016^\u001d\u009a\\\u0007ò\u0090\u0089\u0093Æo\u000e)\u0019íY§Ô-¶\u009eT\u0007ö ¯@ó¯J\u008eÛ©ÛðæØ÷Äj&\u0005#\u000e]¯£\u0098\u001dyþ'ÔP\u008bÅÅ`Q:¨4Y_þvV¤ó\u000b\u0010PY¼î9 ]HºÛ\u00adq\u001c\t\u0018ú@Ýò÷ø\u009fÞ\u0018\u001cW\u008c.î\u008aÍ\u0098û#\by\u0082\"\\±Ê\u0083\u0015gaK\u0096ÿ\bÏ>\u009d\u0011\u001aM%Ê\u0010q\u000b\u0088i-îj¤8\u009eM{\u0006K[\u0085\bAþ\u0093§\u008b\td\u0005\u0010\u001c\u000fÐºÑXøî°0\u009fl=KÁÚ\u0010þD¨ë\u009b\n\u008dt\u001eMß\u009aÓs)Þ\u0010ÄÙ\u009dç³\u0001½\u008dÃ\u0018àà¯\u0013q\u0083\u0018ØÙ¤-Uü©Ð2Ñ\u0084(h½Jz£\u0013Ä¯c±dO\b\u0017Ò åôuÊ¬ uè¤+PO\u009aDä6â\u0007-³ùà}ò<NõgýCEW\u000eæâ\u0083/ç\u0018Ø$]\u0016ÜæÂÙö\u0007ýÀ!\u001c\u001c-\u000fä\u001b\u0096Ç²kô(ýjpY0¼{¦ºU[o¡òcW>NBèÙ\u0093¡å£\u0083Ð´\u0005_\f\u000bÒ]Ç\u008f?!È2\u0010\u0087®÷\u008e¾0sô\u008f?½\bËøª}(ç[\u0095b4Ï_\u0096\u0081\u001b\u008b\u0094ZúPkÙüzð\r²ê\n\u009f\u0082f\u008c3?d&ÚÍ\u0011ñÜ\u008c8)"
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
                     String var23 = var0[3];
                     String var24 = var0[1];
                     String[] var11 = new String[]{var0[5], var0[10]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, var11
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[8], var0[15], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[7], var0[9], true);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[0], var0[12], true);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[6], var0[16], true);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var0[4], var0[13], true);
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var0[2], var0[11], true);
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[14], var0[17], false);
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

                  var5 = "\u000eÌ\u0003\u009f66õ&\u0085\bOn\u0013)\b°\u001dÙ_¢92Àl( ú¦Úi\f\u0096TÐ\u001e2\u008eç¯ón\u0001\t-ªc\r>\u008a¶´\tH{¬lÇ¯\u0098û\u0087D\u0010ø¡";
                  var7 = "\u000eÌ\u0003\u009f66õ&\u0085\bOn\u0013)\b°\u001dÙ_¢92Àl( ú¦Úi\f\u0096TÐ\u001e2\u008eç¯ón\u0001\t-ªc\r>\u008a¶´\tH{¬lÇ¯\u0098û\u0087D\u0010ø¡"
                     .length();
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
