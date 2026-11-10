package me.octo.client.failsafes;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   public static lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII() {
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
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   static {
      long var9 = 21887712666851L ^ 40568222335169L;
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
      String var5 = "\u0094µ\u009cT\u008a\u0013ak\u0010þR§°\u0087þ \u0007A\u009a\u009fËïùò{\u0010Ü/\u000et\u0001\u009b¸\r\fºI\u0080\\x\u0019ÎHæ#Õ\u0088E§l\u0090*lg\u00144&ô\u0000Ï\"OÐÛ\u0099\u0095C\bê`é¤\u0005ß]\u000fc¹ÎÓ\u00adVD³\u0097I\u0019\u0013YBÅ\u009a\u0083%üÀ\u0098oB$;4Ô¹\u0005u¹íZÆ\u001c\rj\u0014¡H¼\u0012\u0080ªõ!3ï\u000bó\u000e\n&Ø\u000f(>xÑ8¥âu°¾\u000fÅðãýÐMå¢Ú4'æ\u0011>RÔ\u0082uìz¿æ\u008a£\u0000u\u001f«Õ\u0098qDv\u0083\u008e·Rk_ã\u0007Ö¡éÎ*\u0010ç U:pºËn\"\u009c=zp8d 8T\u001aÕ\u007f\u0094$[\u0093¾hÌÃJ\u0007=ùJ¥lßP\u0017Bó÷ÖmÉ\fc^± \u0016·¿¤\u0015Ú6mÚ\u0013k¦Ë\u001e®£ó\u001c\u0080`ck*\u0010\u0087 \u0018\u0093zF¨\u0088·\u009dfb\u0093Uy_";
      int var7 = "\u0094µ\u009cT\u008a\u0013ak\u0010þR§°\u0087þ \u0007A\u009a\u009fËïùò{\u0010Ü/\u000et\u0001\u009b¸\r\fºI\u0080\\x\u0019ÎHæ#Õ\u0088E§l\u0090*lg\u00144&ô\u0000Ï\"OÐÛ\u0099\u0095C\bê`é¤\u0005ß]\u000fc¹ÎÓ\u00adVD³\u0097I\u0019\u0013YBÅ\u009a\u0083%üÀ\u0098oB$;4Ô¹\u0005u¹íZÆ\u001c\rj\u0014¡H¼\u0012\u0080ªõ!3ï\u000bó\u000e\n&Ø\u000f(>xÑ8¥âu°¾\u000fÅðãýÐMå¢Ú4'æ\u0011>RÔ\u0082uìz¿æ\u008a£\u0000u\u001f«Õ\u0098qDv\u0083\u008e·Rk_ã\u0007Ö¡éÎ*\u0010ç U:pºËn\"\u009c=zp8d 8T\u001aÕ\u007f\u0094$[\u0093¾hÌÃJ\u0007=ùJ¥lßP\u0017Bó÷ÖmÉ\fc^± \u0016·¿¤\u0015Ú6mÚ\u0013k¦Ë\u001e®£ó\u001c\u0080`ck*\u0010\u0087 \u0018\u0093zF¨\u0088·\u009dfb\u0093Uy_"
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
                     String var23 = var0[5];
                     String var24 = var0[9];
                     String[] var11 = new String[]{var0[0], var0[1]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, 0, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[7], var0[6], true);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[2], var0[3], false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[8], var0[4], false);
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

                  var5 = "¼\u0012\u0080ªõ!3ïËû(¹uê\u009a{0¶=»\u000f½Ý-jg\u0006ç»\u0015q\u009b¯½öW´¸º\u001cÍ¦Ã;q\u0012ó\u0087Âá.q\u008d\u0002\u0001«¡¦¬\u001aØyxò\n";
                  var7 = "¼\u0012\u0080ªõ!3ïËû(¹uê\u009a{0¶=»\u000f½Ý-jg\u0006ç»\u0015q\u009b¯½öW´¸º\u001cÍ¦Ã;q\u0012ó\u0087Âá.q\u008d\u0002\u0001«¡¦¬\u001aØyxò\n"
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
