package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
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
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BooleanSetting llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static BooleanSetting lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static BooleanSetting lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static BooleanSetting lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;

   @NotNull
   public static final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
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

   @NotNull
   public static final BooleanSetting IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public static final BooleanSetting IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public static final BooleanSetting lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public static final BooleanSetting IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   public static final BooleanSetting IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   static {
      long var9 = 89315582519087L ^ 81392115848705L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[26];
      int var6 = 0;
      String var5 = "j\u0085©Å[\u0007ç>\b&wâ\u0089.)b5\u0010)ðêæ rö\u0090ú!-þQÌO>\b\u0019\u008a&\u0005\u009ei\\Û\u0010ªn®Ê·\u0080÷ü\u008e\"_\u001el\u008d\u0088p )ðêæ rö\u0090¨\u0098\u0018#qîÇ\u0093½\u0005½pûÞsñÄK\u000bßj\u0083OF\u0018)ðêæ rö\u0090\u0082§¢Æ\u0011\u0011\u007fN^§\";,Éù\u0094\u0010)ðêæ rö\u0090\u001dp¡\u0007{H?\u0084\u0010)ðêæ rö\u0090ý\u0083w`\u00adÕHÆ\u0010±´ÇÕ+ñÑ*\u0090¾H¨\u009ek\u00adg\u0010mð§ón\u0015ó`JôÏSÑZ\"Û\b®Ü® \u0013\"r\u0088\u0018)ðêæ rö\u0090Z=\u008e©\u001eE\u0011¹°q\u0010\u0019\u0081'5Ö\u0010U\u0001ÆìÉ\u0003¬\u0014|ç-Þ\u0099[rè()ðêæ rö\u0090\u009aåF\u001e\u000e]\u0007\u0091\u009dgÎÐ s¶'Ú³Ïx\"ÿE,<XÅâÃü¨Æ\u0010Ø\u0088Ô(~è¥ÛW\u009eP\u001aï\u0010ú\u0000\u0010\u0000ö\u008a»*\u008cë\u0011¨\u009e±\u0010\u0091<\u009aÎ\u0018)ðêæ rö\u0090ÌÅùOí}[>ô\u0085êd\frµô\u0010t\u0016Í7\u0017\u0006¤\u009b^0l`\u0018 »¼\u0010!?\n\u0080¹#~µñå¬Ì¤°è\u0011()ðêæ rö\u00901Tõå2\u0083£Ç\u0018Ø\u0000.àñýÇ±gÝdú\u0014h`\f\fLç\u001fò»Þ )ðêæ rö\u0090\u008d?z;\u008dÀçí]\u0094ºÙ,\tôÏþß\u009cÒYªô\u0099\u0018)ðêæ rö\u0090Z=\u008e©\u001eE\u0011¹#\u0016¢\u0089\u008e*¥2\bt¬\rDð\u0005èj";
      int var7 = "j\u0085©Å[\u0007ç>\b&wâ\u0089.)b5\u0010)ðêæ rö\u0090ú!-þQÌO>\b\u0019\u008a&\u0005\u009ei\\Û\u0010ªn®Ê·\u0080÷ü\u008e\"_\u001el\u008d\u0088p )ðêæ rö\u0090¨\u0098\u0018#qîÇ\u0093½\u0005½pûÞsñÄK\u000bßj\u0083OF\u0018)ðêæ rö\u0090\u0082§¢Æ\u0011\u0011\u007fN^§\";,Éù\u0094\u0010)ðêæ rö\u0090\u001dp¡\u0007{H?\u0084\u0010)ðêæ rö\u0090ý\u0083w`\u00adÕHÆ\u0010±´ÇÕ+ñÑ*\u0090¾H¨\u009ek\u00adg\u0010mð§ón\u0015ó`JôÏSÑZ\"Û\b®Ü® \u0013\"r\u0088\u0018)ðêæ rö\u0090Z=\u008e©\u001eE\u0011¹°q\u0010\u0019\u0081'5Ö\u0010U\u0001ÆìÉ\u0003¬\u0014|ç-Þ\u0099[rè()ðêæ rö\u0090\u009aåF\u001e\u000e]\u0007\u0091\u009dgÎÐ s¶'Ú³Ïx\"ÿE,<XÅâÃü¨Æ\u0010Ø\u0088Ô(~è¥ÛW\u009eP\u001aï\u0010ú\u0000\u0010\u0000ö\u008a»*\u008cë\u0011¨\u009e±\u0010\u0091<\u009aÎ\u0018)ðêæ rö\u0090ÌÅùOí}[>ô\u0085êd\frµô\u0010t\u0016Í7\u0017\u0006¤\u009b^0l`\u0018 »¼\u0010!?\n\u0080¹#~µñå¬Ì¤°è\u0011()ðêæ rö\u00901Tõå2\u0083£Ç\u0018Ø\u0000.àñýÇ±gÝdú\u0014h`\f\fLç\u001fò»Þ )ðêæ rö\u0090\u008d?z;\u008dÀçí]\u0094ºÙ,\tôÏþß\u009cÒYªô\u0099\u0018)ðêæ rö\u0090Z=\u008e©\u001eE\u0011¹#\u0016¢\u0089\u008e*¥2\bt¬\rDð\u0005èj"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var21;
         if ((var3 += var4) >= var7) {
            var5 = ")ðêæ rö\u0090É~û.\u001a\f\u001f\u008c\u0096\u0018Ô7ôíàæ\u0010)ðêæ rö\u0090p;\u0090¸\u0093x\u001fx";
            var7 = ")ðêæ rö\u0090É~û.\u001a\f\u001f\u008c\u0096\u0018Ô7ôíàæ\u0010)ðêæ rö\u0090p;\u0090¸\u0093x\u001fx".length();
            var4 = '\u0018';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var0[var6++] = var23;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[10], var0[24], true);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[11], var0[20], true);
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[19], var0[5], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[4], var0[21], true);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[13], var0[17], true);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var0[9], var0[22], true);
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var0[18], var0[14], true);
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[23], var0[2], true);
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting(var0[16], var0[12], true);
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BooleanSetting(var0[0], var0[25], true);
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new BooleanSetting(var0[3], var0[7], true);
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new BooleanSetting(var0[1], var0[8], true);
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new BooleanSetting(var0[15], var0[6], true);
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
