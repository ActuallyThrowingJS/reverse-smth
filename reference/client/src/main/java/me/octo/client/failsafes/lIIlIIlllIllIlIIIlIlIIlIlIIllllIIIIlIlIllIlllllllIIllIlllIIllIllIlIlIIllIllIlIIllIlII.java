package me.octo.client.failsafes;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
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
      long var9 = 131027911552270L ^ 65723375068025L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[8];
      int var6 = 0;
      String var5 = "$üED\u008f$Æ\u0088ç\"ã\u000fÎ©°pÇ'w%\u008c\u000f\u001e¢W\u0095gp[\u0080H\u0013½Ò\u0018:ag¾ á¾ØÇ?õÉO(\u0019Öî\u0099mÆb8qi\u0019ÁôIè]^\u0014\u009f\u0000\u0012w\u008fBñõÇeá&}ª\u0000\u0097\u008f÷·Q²Ï¼jbúÅÍ\u008fç~ÿµâ\tü\u0091Jò\u0082²\u0091ßÊTL\u0018è*Á\u009e¯Hc\u0002Ö§8:\u0080E[\u0093î.FZ\u008c3«z`?\u001d\u0080\u0086\u0098¿Î_\u0010\u0085/©$:\u0082\u008eÿ´÷þ\u0084$`j\u0089vå\u0010·w\u009f5U\"bIG¥\u0093¼ú÷\tÆÐù\u0098æ+Ç\u0099'¨LÒm¢4b´Ï0&@{kI\\\bïÊ\u00945*\u001d=¾*4N¸Å&BÊç}{·\u001e=\bþ\t\ttHH\u00866ç¥{Ñ\u001b\u008b\u008d±\u0000RUÊ´\u009cBµrç]yöM;7¼ô|/òz\u0090jeðÁ ¾Eí^ª\u001f1\u0082\u008d\u008a\u0095ùäê3l\u0002ÀZ7\u000e\u000fÊ\u0002³Án¢/}Y}\u0097\u0010H\u00866ç¥{Ñ\u001b\u008cs\u001dÛñÕ>\u0096";
      int var7 = "$üED\u008f$Æ\u0088ç\"ã\u000fÎ©°pÇ'w%\u008c\u000f\u001e¢W\u0095gp[\u0080H\u0013½Ò\u0018:ag¾ á¾ØÇ?õÉO(\u0019Öî\u0099mÆb8qi\u0019ÁôIè]^\u0014\u009f\u0000\u0012w\u008fBñõÇeá&}ª\u0000\u0097\u008f÷·Q²Ï¼jbúÅÍ\u008fç~ÿµâ\tü\u0091Jò\u0082²\u0091ßÊTL\u0018è*Á\u009e¯Hc\u0002Ö§8:\u0080E[\u0093î.FZ\u008c3«z`?\u001d\u0080\u0086\u0098¿Î_\u0010\u0085/©$:\u0082\u008eÿ´÷þ\u0084$`j\u0089vå\u0010·w\u009f5U\"bIG¥\u0093¼ú÷\tÆÐù\u0098æ+Ç\u0099'¨LÒm¢4b´Ï0&@{kI\\\bïÊ\u00945*\u001d=¾*4N¸Å&BÊç}{·\u001e=\bþ\t\ttHH\u00866ç¥{Ñ\u001b\u008b\u008d±\u0000RUÊ´\u009cBµrç]yöM;7¼ô|/òz\u0090jeðÁ ¾Eí^ª\u001f1\u0082\u008d\u008a\u0095ùäê3l\u0002ÀZ7\u000e\u000fÊ\u0002³Án¢/}Y}\u0097\u0010H\u00866ç¥{Ñ\u001b\u008cs\u001dÛñÕ>\u0096"
         .length();
      char var4 = '8';
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[7], var0[0], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[6], var0[1], false);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[5], var0[4], false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[2], var0[3], false);
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

                  var5 = "ñM=¾¿·\u0019yße\u009b\u001c©lïg\u0010tB£ûHØ>«\u009cS´y(_¶ü";
                  var7 = "ñM=¾¿·\u0019yße\u009b\u001c©lïg\u0010tB£ûHØ>«\u009cS´y(_¶ü".length();
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
