package me.octo.client.modules.helpers.general;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmField;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static BooleanModule IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   static {
      long var9 = 20990272261165L ^ 84348009303942L;
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
      String var5 = "2Ë\u0000\u008f&\u001f\u009c\t\u0010\t1\u0081fk÷n\u001edÚ\u009b\u00ad\u00870wÌz\u001b]r2&\u0083D\u0090¡:§kµMmxäO\u0081aêì\u0018¾Ú¹íÑí\u0093ñ\u0098\u0080¤¨Æ®ì¸!òC\u008cÑVòä\u0010ùÌ\u009c\nMåB\u0087¯$kQ\u0090(M\u0090@<\u000e È\u0090ÄRw\u008edL\u0087-þ'öG'|Ý\u001e=\u009bºç\u0004\u0091ï¢|Ëÿ9\u0098Ò×l&õÎ´K\u0090\u0093¡P\tC5zH8í\"\u00020Fð[Pr1\u009d482Ë\u0000\u008f&\u001f\u009c\t²\u00863\u0093} D:94^rÖi\u0099O.Ê\u0098:\u001dtóm\u0010!\r9î»\u0019mÀZøÓ+ó\u0085à¯¶\u000fN\u0018ü\u0099R ¾Ú¹íÑí\u0093ñD\u001cø£æØ>V\u008cï»ñ½·«°cèî~X\u0087Wz\b\u008d\u0082¨®æ Î\u0017";
      int var7 = "2Ë\u0000\u008f&\u001f\u009c\t\u0010\t1\u0081fk÷n\u001edÚ\u009b\u00ad\u00870wÌz\u001b]r2&\u0083D\u0090¡:§kµMmxäO\u0081aêì\u0018¾Ú¹íÑí\u0093ñ\u0098\u0080¤¨Æ®ì¸!òC\u008cÑVòä\u0010ùÌ\u009c\nMåB\u0087¯$kQ\u0090(M\u0090@<\u000e È\u0090ÄRw\u008edL\u0087-þ'öG'|Ý\u001e=\u009bºç\u0004\u0091ï¢|Ëÿ9\u0098Ò×l&õÎ´K\u0090\u0093¡P\tC5zH8í\"\u00020Fð[Pr1\u009d482Ë\u0000\u008f&\u001f\u009c\t²\u00863\u0093} D:94^rÖi\u0099O.Ê\u0098:\u001dtóm\u0010!\r9î»\u0019mÀZøÓ+ó\u0085à¯¶\u000fN\u0018ü\u0099R ¾Ú¹íÑí\u0093ñD\u001cø£æØ>V\u008cï»ñ½·«°cèî~X\u0087Wz\b\u008d\u0082¨®æ Î\u0017"
         .length();
      char var4 = '0';
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[1], var0[5], 1, 20, 5, 0, 32, null
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[2], var0[4], 1, 60, 5, 0, 32, null
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[7], var0[0], 1, 120, 60, 0, 32, null
                     );
                     String var23 = var0[8];
                     String var24 = var0[3];
                     ModuleCategory var10004 = ModuleCategory.ADDONS;
                     String var10005 = var0[6];
                     Setting[] var11 = new Setting[]{
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
                     };
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanModule(
                        var23, var24, var10004, var10005, true, var11
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

                  var5 = "9ê{\u000ei\u0011\u009fVù<\u0000´6\u00adK»\u0017g5Á\u0012qJà\u0010XyØ!f4\u001aÇ¡\u0001É\u001d\u0004ê£þ";
                  var7 = "9ê{\u000ei\u0011\u009fVù<\u0000´6\u00adK»\u0017g5Á\u0012qJà\u0010XyØ!f4\u001aÇ¡\u0001É\u001d\u0004ê£þ".length();
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
