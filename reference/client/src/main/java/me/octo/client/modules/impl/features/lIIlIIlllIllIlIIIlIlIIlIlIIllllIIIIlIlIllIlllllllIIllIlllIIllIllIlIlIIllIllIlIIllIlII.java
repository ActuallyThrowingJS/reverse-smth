package me.octo.client.modules.impl.features;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   static {
      long var9 = 14125469747710L ^ 130679305327303L;
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
      String var5 = "GW\u0096\u0097Ðô»z¥Yx82\u008c>\u009e_Ì\u0017\\\u0093½+1\f®\u0018ÌÔ0fü\u000b]\u000e©\u001f&½¿\b\u007fo\u0002°9À¢\u009a\u0018²S%î{.Ì\u0083®È\u0019} ÛÁS\u0011MCî\u00ad8vy\u0010Sm\u008c\u001b\"uÝÍ\u0089_Ù½Ð\u0019.ê\u0018þí\u0014L\u0086\u007f\u001cy\u009a}·pùE[èb&rÀg©¢í\u0018\u0091Ð\u0097\u001f²µU·Â9\n&\u00864®c\u0091gh\u009da&â\u0082\bÓ_\\kÚ·\u007fh\u0080¼9\u0002@©g\u0010z\u0082´Ö\b\u001f\u0085Þékn[\u0085Ì\u0083s¸©Üï»v2îsVÌfà£|/\u007fä\u0018[«w(\u001bßêZéKì \u0017\u001dN]Ï|mµ0\u0086I.Ê!L£9\u00943\u0098ÐA2c<ãI$\u0085fc\u0090µ\u001f\u001f\u007fÉ¾$ÙÊÇ·% Ù\u0087\u0010\u009eÆ\u008cXT\u0018r\u0098D\u009fAþjå\u0006±\u0003Éº\u0095!\u009d\u0002`\u009d§P\u0081ßZg9ýÍå\u008c\u008fc>ÌX@$\få\f\u0010ÌKóëhD\u00882¡ ìbùV|ÀÙçØ Ó^¥\u0083|æÜ\u0016zÉ\u007f\u0092Ï\"\u009c\u0089ÿÌ\u001cß\u000fÄ\u008bê®\u0080-ªÙé³q\u008a\u0015»æ+£Á\u0093";
      int var7 = "GW\u0096\u0097Ðô»z¥Yx82\u008c>\u009e_Ì\u0017\\\u0093½+1\f®\u0018ÌÔ0fü\u000b]\u000e©\u001f&½¿\b\u007fo\u0002°9À¢\u009a\u0018²S%î{.Ì\u0083®È\u0019} ÛÁS\u0011MCî\u00ad8vy\u0010Sm\u008c\u001b\"uÝÍ\u0089_Ù½Ð\u0019.ê\u0018þí\u0014L\u0086\u007f\u001cy\u009a}·pùE[èb&rÀg©¢í\u0018\u0091Ð\u0097\u001f²µU·Â9\n&\u00864®c\u0091gh\u009da&â\u0082\bÓ_\\kÚ·\u007fh\u0080¼9\u0002@©g\u0010z\u0082´Ö\b\u001f\u0085Þékn[\u0085Ì\u0083s¸©Üï»v2îsVÌfà£|/\u007fä\u0018[«w(\u001bßêZéKì \u0017\u001dN]Ï|mµ0\u0086I.Ê!L£9\u00943\u0098ÐA2c<ãI$\u0085fc\u0090µ\u001f\u001f\u007fÉ¾$ÙÊÇ·% Ù\u0087\u0010\u009eÆ\u008cXT\u0018r\u0098D\u009fAþjå\u0006±\u0003Éº\u0095!\u009d\u0002`\u009d§P\u0081ßZg9ýÍå\u008c\u008fc>ÌX@$\få\f\u0010ÌKóëhD\u00882¡ ìbùV|ÀÙçØ Ó^¥\u0083|æÜ\u0016zÉ\u007f\u0092Ï\"\u009c\u0089ÿÌ\u001cß\u000fÄ\u008bê®\u0080-ªÙé³q\u008a\u0015»æ+£Á\u0093"
         .length();
      char var4 = '(';
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[2], var0[8], true);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[5], var0[9], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[4], var0[0], true);
                     String var23 = var0[3];
                     String var24 = var0[7];
                     String[] var11 = new String[]{var0[10], var0[6], var0[1]};
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, var11
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

                  var5 = "àå\u0090\u001f)C¿\u0005Ø6ö=^û1\\\u000f4ðeÛEs\r{%@ÌËk\u0019ÙÑ\u000b=\u0096R\u009dæ3\u0098\u0085[âU¨ø1\b4r)Ù\u0007\u008e¬Ù";
                  var7 = "àå\u0090\u001f)C¿\u0005Ø6ö=^û1\\\u000f4ðeÛEs\r{%@ÌËk\u0019ÙÑ\u000b=\u0096R\u009dæ3\u0098\u0085[âU¨ø1\b4r)Ù\u0007\u008e¬Ù".length();
                  var4 = '0';
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
