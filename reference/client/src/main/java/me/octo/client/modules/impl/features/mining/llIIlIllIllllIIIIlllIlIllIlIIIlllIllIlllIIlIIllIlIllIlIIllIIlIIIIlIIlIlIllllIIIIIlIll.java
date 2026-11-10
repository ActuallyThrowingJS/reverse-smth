package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll {
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   static {
      long var9 = 64414689775337L ^ 101615423755514L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[14];
      int var6 = 0;
      String var5 = "ç·?DÕ^æH\u0003¾\u0019\"\u0003÷å¬\u0010õ²\u008fÉ^ÜäË\u0080\u0085U\b\r60\u0013\b~V5ê\u008fÉ\u0085$\bÁ#\u009aÌ\r\u000fË\u0094\u0018\u0016\u0004õ³V0áÅ\u0084¦È3Æ±\u001aÕ\u0000N´óâ×ÌBX;\u0097¶\u009e)Õ¶ûõ(:øÞ\u0016Î\u0002íNÉ?È´øºß³r´j¹:üê\u0081\u009e\u0092ñ\u009b\u007f\u000e¢\r½¥\u0012\u009fÆ`ö¹\u00adáOõ~ÁÁè-ñh²Q\u000f»9_Gø»-O\u009f\u009fòë©Ägù£³`ä\u009f#KåX\u00038PÊñÞx»\u0088\u009e\u000b\u0014<\"GUÛnÛ[d\u001f\u0098_\u000f«\u00ad¤÷?õn·RIt_¾uÁv\u007f\u0096r\u001c\u0004ò\rFX«oO%³1\u0082\r\u0006§wl\u0012W\u0091NÛÃ\u0086\"Éð®i7´_\u0099ì`ÈdÍ1SåÈ\rP¿¡G\u000b½ô\u0088\t\u0096\u0004²BVÛ²Uãß\u0091Õ\u001e\u0019ã¡ïe)ÏýÚ3}[\u0088Ô¬Y\u00adæç×\u0097\u0002¶a\u0080c<\u0080'ï\u0019\u001b¬ÚvÖý¹Å\u0016¼û³\u0097E0mx*r\u0017t[¥B¨\u009fÃI\bdÍW\u009dfD\u0093d`VDt¦Ì\u000bG¶§RÎ§ê\u0082sÍ\u0018'.7Ð\u0003½çAr\nÙ<0\u009buB|E®\u0097?bDþí\u0083M&%\u000bPf¡Ð×\\ü\u000f\u0092ùmØ\u0018\u0095±k¨\u0092\u0081ìm¶h&Óñ\u0001ëÀFÄ\u0007¶\u008fÝs\u007f\u0013sQ='Øâã\u0013\u001a\u001f^\b\u0098,¤\u0013e\u00880\rH;\u0097¶\u009e)Õ¶ûM\u009d °!\bJ\u001ft\u008f^Mc>\u00127Ã·%.åÐ²a÷HÌ\u009d[\u0086\u001a¥FuRy\tv\u001aJ·\u0092g\u009dÌØ§,\u00881pÖ}Çs\u0086\u009bGIõH\u0004?§";
      int var7 = "ç·?DÕ^æH\u0003¾\u0019\"\u0003÷å¬\u0010õ²\u008fÉ^ÜäË\u0080\u0085U\b\r60\u0013\b~V5ê\u008fÉ\u0085$\bÁ#\u009aÌ\r\u000fË\u0094\u0018\u0016\u0004õ³V0áÅ\u0084¦È3Æ±\u001aÕ\u0000N´óâ×ÌBX;\u0097¶\u009e)Õ¶ûõ(:øÞ\u0016Î\u0002íNÉ?È´øºß³r´j¹:üê\u0081\u009e\u0092ñ\u009b\u007f\u000e¢\r½¥\u0012\u009fÆ`ö¹\u00adáOõ~ÁÁè-ñh²Q\u000f»9_Gø»-O\u009f\u009fòë©Ägù£³`ä\u009f#KåX\u00038PÊñÞx»\u0088\u009e\u000b\u0014<\"GUÛnÛ[d\u001f\u0098_\u000f«\u00ad¤÷?õn·RIt_¾uÁv\u007f\u0096r\u001c\u0004ò\rFX«oO%³1\u0082\r\u0006§wl\u0012W\u0091NÛÃ\u0086\"Éð®i7´_\u0099ì`ÈdÍ1SåÈ\rP¿¡G\u000b½ô\u0088\t\u0096\u0004²BVÛ²Uãß\u0091Õ\u001e\u0019ã¡ïe)ÏýÚ3}[\u0088Ô¬Y\u00adæç×\u0097\u0002¶a\u0080c<\u0080'ï\u0019\u001b¬ÚvÖý¹Å\u0016¼û³\u0097E0mx*r\u0017t[¥B¨\u009fÃI\bdÍW\u009dfD\u0093d`VDt¦Ì\u000bG¶§RÎ§ê\u0082sÍ\u0018'.7Ð\u0003½çAr\nÙ<0\u009buB|E®\u0097?bDþí\u0083M&%\u000bPf¡Ð×\\ü\u000f\u0092ùmØ\u0018\u0095±k¨\u0092\u0081ìm¶h&Óñ\u0001ëÀFÄ\u0007¶\u008fÝs\u007f\u0013sQ='Øâã\u0013\u001a\u001f^\b\u0098,¤\u0013e\u00880\rH;\u0097¶\u009e)Õ¶ûM\u009d °!\bJ\u001ft\u008f^Mc>\u00127Ã·%.åÐ²a÷HÌ\u009d[\u0086\u001a¥FuRy\tv\u001aJ·\u0092g\u009dÌØ§,\u00881pÖ}Çs\u0086\u009bGIõH\u0004?§"
         .length();
      char var4 = '\u0010';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "\rs·äÆDMv<Çð&à¥ø9Ë\u009aúÃý8$ßH©è'G\u008e>\u00ad\\j-Q¹\u009fåÂ-µ¨^\u0087>Ý÷\u0088Pþ\u0018®U6Ú×Ü\u0004#¦8^\u0006üv[% ¼\u0012÷F\u0013è\\Ñâ\nNÄ\u0088¢\u0098£p#\u00ad\\}\u009d§y\u0086)\u0094y";
            var7 = "\rs·äÆDMv<Çð&à¥ø9Ë\u009aúÃý8$ßH©è'G\u008e>\u00ad\\j-Q¹\u009fåÂ-µ¨^\u0087>Ý÷\u0088Pþ\u0018®U6Ú×Ü\u0004#¦8^\u0006üv[% ¼\u0012÷F\u0013è\\Ñâ\nNÄ\u0088¢\u0098£p#\u00ad\\}\u009d§y\u0086)\u0094y"
               .length();
            var4 = '\u0018';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  String var26 = var0[3];
                  String var27 = var0[9];
                  String[] var11 = new String[]{var0[2], var0[10]};
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, 1, var11
                  );
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[1], var0[7], 2, 8, 6, 1
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[4], var0[5], 250, 2500, 700, 50
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[12], var0[11], 2500, 15000, 8000, 250
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[0], var0[6], 0, 10, 5, 1
                  );
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var0[8], var0[13], false);
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
