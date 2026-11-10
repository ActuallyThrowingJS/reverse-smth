package me.octo.client.modules.impl.features.hud;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII {
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   static {
      long var9 = 45343513649552L ^ 20703893657047L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var6 = 0;
      String var5 = "ª\u008dK\u0098S¸ó÷\u00987Îôw§7\u0093ô\u0015\u0095\u001a·A®k\u0087^¼VTb$\u0004ø¿ÇùèºÓD\u0010\u008a¬6BVÙ\u0091Ïï\u008e\u0000H\u0005Ïõ\u0096\u009e\u00880Í»ÑÖ\u008e\u000fç\u0015Q:\u001c³\u007f¦û¹t\u0014:¾\u0014õ}Ê¡§v\\á¶\u000eôÈ\u00adÊæ\u0083\u009bòÏiFº\u008e\u009eI\\AjSº\u001e\u00955\u000b\u0002k|¨\u0091\u0094.\u0099\u001b\u00ad/1Å\bAÖÇ#â\u0094\u0003K\bH¹@ÑäU¼õX\u0099B,g\u0007\u0080\u0098#\u001f]·iÐÐàÚEÈ\u0012;\u0087\u0092·c\u0001\u008f±\\öÚ\u009dÖëMÉiÝIã\u008dÉmA9&Né»\u00ad0G\u008fÕS¸YlýV\u008a\u0013X\u0095Í\u000b`µ\u0092<1E\u0080\u0089d\rZÝÀá5©S|\u0097hÃXG\bØg©\u0092\u0017L3Î\u0010H\u0014\u00ad\u0091ÅÚ[ø\u000fûüÖ-L\t1`jÛÌ¾=nBaþ¿°62êØx\u0084ã9í\u0019µ\u000fÑ4Tm\u000fªôúû«\u008a\bwgub%¯\u0087xî\u0092¼F\u0083Z\u001a:Ò\u009fÃ¤x\u0086gÖ8?k \u001bî²Ó\u0081\u0094ab¶=²Ðµ\u0085Z³ÑÎxWÁ\u0092n×m÷\u000eM5\u008d\u0012Ù®\b¯\u008a\u0095\u0007·îÁÞ\u0010zÑÂucd]¿\u0097\u001c\"Æ§\u0014\u0010t";
      int var7 = "ª\u008dK\u0098S¸ó÷\u00987Îôw§7\u0093ô\u0015\u0095\u001a·A®k\u0087^¼VTb$\u0004ø¿ÇùèºÓD\u0010\u008a¬6BVÙ\u0091Ïï\u008e\u0000H\u0005Ïõ\u0096\u009e\u00880Í»ÑÖ\u008e\u000fç\u0015Q:\u001c³\u007f¦û¹t\u0014:¾\u0014õ}Ê¡§v\\á¶\u000eôÈ\u00adÊæ\u0083\u009bòÏiFº\u008e\u009eI\\AjSº\u001e\u00955\u000b\u0002k|¨\u0091\u0094.\u0099\u001b\u00ad/1Å\bAÖÇ#â\u0094\u0003K\bH¹@ÑäU¼õX\u0099B,g\u0007\u0080\u0098#\u001f]·iÐÐàÚEÈ\u0012;\u0087\u0092·c\u0001\u008f±\\öÚ\u009dÖëMÉiÝIã\u008dÉmA9&Né»\u00ad0G\u008fÕS¸YlýV\u008a\u0013X\u0095Í\u000b`µ\u0092<1E\u0080\u0089d\rZÝÀá5©S|\u0097hÃXG\bØg©\u0092\u0017L3Î\u0010H\u0014\u00ad\u0091ÅÚ[ø\u000fûüÖ-L\t1`jÛÌ¾=nBaþ¿°62êØx\u0084ã9í\u0019µ\u000fÑ4Tm\u000fªôúû«\u008a\bwgub%¯\u0087xî\u0092¼F\u0083Z\u001a:Ò\u009fÃ¤x\u0086gÖ8?k \u001bî²Ó\u0081\u0094ab¶=²Ðµ\u0085Z³ÑÎxWÁ\u0092n×m÷\u000eM5\u008d\u0012Ù®\b¯\u008a\u0095\u0007·îÁÞ\u0010zÑÂucd]¿\u0097\u001c\"Æ§\u0014\u0010t"
         .length();
      char var4 = 128;
      int var13 = -1;

      label28:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     String var24 = var0[5];
                     String var26 = var0[0];
                     String[] var11 = new String[]{var0[4], var0[1], var0[7]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var24, var26, var11
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[8], var0[3], true);
                     String var25 = var0[2];
                     String var27 = var0[6];
                     var11 = new String[]{var0[10], var0[9]};
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var25, var27, var11
                     );
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label28;
                  }

                  var5 = "ÅJ4\u008c,Ñ=¯\b\u0011\u00ad[3\u0092ËX7";
                  var7 = "ÅJ4\u008c,Ñ=¯\b\u0011\u00ad[3\u0092ËX7".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
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
