package me.octo.client.modules.impl.features.qol;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   static {
      long var9 = 76263231578762L ^ 139678237214556L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[17];
      int var6 = 0;
      String var5 = "ú\u001bÓ=]½\u001d,\u0018ÙL\u009f:TRgÑ\b«¼Cín½CfSA\u008dg4ÕÄ\u0010{dB\u008dn-È\u0082þM\u008cÞâ\u0085T~@ Ù\r\u008f\u0010òCü\u0093¸º¤]-õéÿWrXZÔ\u0015Ä.\u0010¥ëN5³æ\u00adÇÌÃ\u0006«µCâ\u0083\u009bÿ\badsF«sÑ=Î\u0012`\u00929ó¿\u00839ÏD`\u0092÷\u000flïg*¨T|},©Ô\u008cëÂÝ~\u001fó'\tÇ¶´\u0099\u009cN\u0010Ó\u009d4¾£5I\u001e\u008bÏ\u0085\u00999Ã±\r\u009f\u0007\u0012ØÐ\u0080à\nâ®Y~\u0088,:\u008d\u0012A°\u0098i\fì\u000b¾DøkhÇ\u000fmM\n\r`WÁ\u0085yW«Jt®)\u0081¹G\u007f\u0010¶\u0010¤\u0007Y\u0082Ø6\u0010\u0017¶ó¾\u000e\u009aS\u0018k¶\u0095,H\nÃª\u0001ªÚ?6À©\u009dp³yàH\u0086½\u001c\b\u0004\u0090\u0004¸V¥\u0004n\b\u0018«\u009bþ\u0011Ñx\u0080\b»CÐ8Ä0e\u00818zäð\u000e·:¹¬\u0081l½û´º&Î_\u000bÎÎJ½ùq\u001aç\u0005CÏ\u0093í¼Õw¢\u0001ÞÉ^jë\u0012ç\u0088Þ]·¶\u008c\u001dÿ\u008e\u0085\u0010\u007f:ÀÜÈ\u0083\u001aK*mÔM\u0017&×ÒÏ_?öim!¾$É÷¹6Tß¥~\u008b\rk\u0082\u0084í¸X+Úã¥1ö&\u0094Ê\u0005¹§|\t½½Ð\u007f×¿:~×\u0016¢\u0010fiì=Åb%\u000bE8\u0017é,b9\r\u0000\u0012SUcÔaî\u0095Lå\u007f?\u0003©¾X6-º$^\u00898¬8R¤éÏnú\u0090É;S\u0016òZÅÐá\\\u0010ÐÝ@(l\u000eÐ\u008e?ÖaÏ¦\u008d>mq\u0004Î,T~t\u0098\u0016\u0005\u0013Ú®:qx¨\u0003\u0004°ÒD\u0006Iã\bê\u000f*IÄ=IjÑä\u0099ûÐM×ó\u001d\u001dôãípõÄ%ù\b\u0093\u0091áv+9à5\u00107Áv\u001fÊ\u0086\u000bq¤ëÔ\u000e\u009cé\u0018¨P Ù\r\u008f\u0010òCüWiæ8é¶¯)Io©\u0098ä\u0003ãúo\u0086é\u0091=µO¶§^[!*ÿ'\u009dØcÖ×}k;yE8ÿ\u000eÜï\u008a\u0012Ní\u009e\u00125ñd¡D\u0091À]1E·\u007fH\u0014\u0014\"þÒG\u0017";
      int var7 = "ú\u001bÓ=]½\u001d,\u0018ÙL\u009f:TRgÑ\b«¼Cín½CfSA\u008dg4ÕÄ\u0010{dB\u008dn-È\u0082þM\u008cÞâ\u0085T~@ Ù\r\u008f\u0010òCü\u0093¸º¤]-õéÿWrXZÔ\u0015Ä.\u0010¥ëN5³æ\u00adÇÌÃ\u0006«µCâ\u0083\u009bÿ\badsF«sÑ=Î\u0012`\u00929ó¿\u00839ÏD`\u0092÷\u000flïg*¨T|},©Ô\u008cëÂÝ~\u001fó'\tÇ¶´\u0099\u009cN\u0010Ó\u009d4¾£5I\u001e\u008bÏ\u0085\u00999Ã±\r\u009f\u0007\u0012ØÐ\u0080à\nâ®Y~\u0088,:\u008d\u0012A°\u0098i\fì\u000b¾DøkhÇ\u000fmM\n\r`WÁ\u0085yW«Jt®)\u0081¹G\u007f\u0010¶\u0010¤\u0007Y\u0082Ø6\u0010\u0017¶ó¾\u000e\u009aS\u0018k¶\u0095,H\nÃª\u0001ªÚ?6À©\u009dp³yàH\u0086½\u001c\b\u0004\u0090\u0004¸V¥\u0004n\b\u0018«\u009bþ\u0011Ñx\u0080\b»CÐ8Ä0e\u00818zäð\u000e·:¹¬\u0081l½û´º&Î_\u000bÎÎJ½ùq\u001aç\u0005CÏ\u0093í¼Õw¢\u0001ÞÉ^jë\u0012ç\u0088Þ]·¶\u008c\u001dÿ\u008e\u0085\u0010\u007f:ÀÜÈ\u0083\u001aK*mÔM\u0017&×ÒÏ_?öim!¾$É÷¹6Tß¥~\u008b\rk\u0082\u0084í¸X+Úã¥1ö&\u0094Ê\u0005¹§|\t½½Ð\u007f×¿:~×\u0016¢\u0010fiì=Åb%\u000bE8\u0017é,b9\r\u0000\u0012SUcÔaî\u0095Lå\u007f?\u0003©¾X6-º$^\u00898¬8R¤éÏnú\u0090É;S\u0016òZÅÐá\\\u0010ÐÝ@(l\u000eÐ\u008e?ÖaÏ¦\u008d>mq\u0004Î,T~t\u0098\u0016\u0005\u0013Ú®:qx¨\u0003\u0004°ÒD\u0006Iã\bê\u000f*IÄ=IjÑä\u0099ûÐM×ó\u001d\u001dôãípõÄ%ù\b\u0093\u0091áv+9à5\u00107Áv\u001fÊ\u0086\u000bq¤ëÔ\u000e\u009cé\u0018¨P Ù\r\u008f\u0010òCüWiæ8é¶¯)Io©\u0098ä\u0003ãúo\u0086é\u0091=µO¶§^[!*ÿ'\u009dØcÖ×}k;yE8ÿ\u000eÜï\u008a\u0012Ní\u009e\u00125ñd¡D\u0091À]1E·\u007fH\u0014\u0014\"þÒG\u0017"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var23;
         if ((var3 += var4) >= var7) {
            var5 = "o\u0007CKïùY\u00108]0u(\u0088-1EP½§\u00122[\u0005\u008d\u0018\u0006\u0090¼/¦2kSi\u00ad\u008e\u0091Iß£\u000b¶uÐ\u0011\u0087Î\u0005x/£)p¯\u0080\u000b\u0002\u0091]Ç¹\u008fjÙ";
            var7 = "o\u0007CKïùY\u00108]0u(\u0088-1EP½§\u00122[\u0005\u008d\u0018\u0006\u0090¼/¦2kSi\u00ad\u008e\u0091Iß£\u000b¶uÐ\u0011\u0087Î\u0005x/£)p¯\u0080\u000b\u0002\u0091]Ç¹\u008fjÙ"
               .length();
            var4 = '\b';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var0[var6++] = var25;
               if ((var3 += var4) >= var7) {
                  String var27 = var0[9];
                  String var29 = var0[4];
                  String[] var11 = new String[]{var0[0], var0[7]};
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var27, var29, 1, var11
                  );
                  String var28 = var0[13];
                  String var30 = var0[11];
                  var11 = new String[]{var0[15], var0[2], var0[8]};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var28, var30, 1, var11
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[5], var0[3], 2000, 10000, 4500, 250
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[6], var0[10], 100, 1000, 250, 50
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[1], var0[14], 250, 4000, 1500, 250
                  );
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var0[12], var0[16], true);
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
