package me.octo.client.modules.impl.macros;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class lllIIllIllIIllIlIIIllllIllllIlIIllIlIllllIIlIlIlIlllIIlIlIlIIllIIlIIlllIIIIlIlllIIlIl {
   @NotNull
   public static lllIIllIllIIllIlIIIllllIllllIlIIllIlIllllIIlIlIlIlllIIlIlIlIIllIIlIIlllIIIIlIlllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private lllIIllIllIIllIlIIIllllIllllIlIIllIlIllllIIlIlIlIlllIIlIlIlIIllIIlIIlllIIIIlIlllIIlIl() {
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
      long var9 = 45529463174978L ^ 13024069585505L;
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
      String var5 = "g\u000e\u008cËë¿Ñ\u008c\u009fDF¼\t\u0010T7\u0010+}\u0010\u001bÁí\u008b¢çñº÷`Î\u0080ùH½ÅU\u0017ä½p'9}\u008e[ì)U\u0002\u0097\u0091d\u007f¼³lWì\tÙ\u0081#¹\u0094\u0016AÔS\u0092\u008a\b´\fÒ\u0096\u0011\u0019~\u0017\u0080éÜÌ¡\u001a\u0014\u0088\n\u0085½É!5\u001d\u0094 _?½Ù\u001c\u0096\u001f\u0086Ê\u0010Ñ©)ªÝÕ\u0097\u0081wºH\u008c2ëÚÍ@vº\u001eA\u000f¿yÂ\u0083Õ\u001få\u0015\u0011¶.\u009aë\u0082ú6Ú*(ÖèòW*é\u0005\u000e¿Þ\u0002*\u0089i°8ª\u0087.r^Á>þ\u0080~\u0004hËíÅ¢\u0005rÆª ÏÎ$0òJÇd£]\u0084N*\u001f*\u0098\u00022L¼+<J\u0088\u001bö\u0004(3\u0090JÁôÊÕGÌ\u0080*¿þ?YÅû×5U×:ÖÙ\u0010ë\u0081<¸ç@\u009dÜOí¦w\u001f(ô\u001a\u0018fº@\u001b±O\fmøÒ\u0000¯\u001d«\u009f^ãøß\u00048\u00adÉ ";
      int var7 = "g\u000e\u008cËë¿Ñ\u008c\u009fDF¼\t\u0010T7\u0010+}\u0010\u001bÁí\u008b¢çñº÷`Î\u0080ùH½ÅU\u0017ä½p'9}\u008e[ì)U\u0002\u0097\u0091d\u007f¼³lWì\tÙ\u0081#¹\u0094\u0016AÔS\u0092\u008a\b´\fÒ\u0096\u0011\u0019~\u0017\u0080éÜÌ¡\u001a\u0014\u0088\n\u0085½É!5\u001d\u0094 _?½Ù\u001c\u0096\u001f\u0086Ê\u0010Ñ©)ªÝÕ\u0097\u0081wºH\u008c2ëÚÍ@vº\u001eA\u000f¿yÂ\u0083Õ\u001få\u0015\u0011¶.\u009aë\u0082ú6Ú*(ÖèòW*é\u0005\u000e¿Þ\u0002*\u0089i°8ª\u0087.r^Á>þ\u0080~\u0004hËíÅ¢\u0005rÆª ÏÎ$0òJÇd£]\u0084N*\u001f*\u0098\u00022L¼+<J\u0088\u001bö\u0004(3\u0090JÁôÊÕGÌ\u0080*¿þ?YÅû×5U×:ÖÙ\u0010ë\u0081<¸ç@\u009dÜOí¦w\u001f(ô\u001a\u0018fº@\u001b±O\fmøÒ\u0000¯\u001d«\u009f^ãøß\u00048\u00adÉ "
         .length();
      char var4 = '\u0010';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "QÛ¡\u009f{\u0003Â¾m\u0086ò\u008b\u0080\u0019b\u001ar9nÉão±°ç[©\u008epuô\u009e#â¢¥fïnâñú\u00991t¨\u001f¢\bfV¬\"\u0090½÷Ò";
            var7 = "QÛ¡\u009f{\u0003Â¾m\u0086ò\u008b\u0080\u0019b\u001ar9nÉão±°ç[©\u008epuô\u009e#â¢¥fïnâñú\u00991t¨\u001f¢\bfV¬\"\u0090½÷Ò".length();
            var4 = '0';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIIllIllIIllIlIIIllllIllllIlIIllIlIllllIIlIlIlIlllIIlIlIlIIllIIlIIlllIIIIlIlllIIlIl();
                  String var26 = var0[0];
                  String var27 = var0[8];
                  String[] var11 = new String[]{var0[3], var0[9]};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, var11
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[1], var0[5], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[6], var0[4], false);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[7], var0[2], true);
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
