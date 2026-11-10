package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl {
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
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static BooleanSetting IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

   static {
      long var9 = 104500739699330L ^ 131082154390974L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[20];
      int var6 = 0;
      String var5 = "ßÒõ¼>Á»å\u00030\u000bb®[X\u008au,,¶,\u0097Á#=\u0002\\^÷õ#uþt5\u009b;¬}&o\u008b\u0017Å»é\u0003}À]å\\\u001b_\u001f\u000e*i:s\rD\u0003ÂªîN5o\n,Ê\u0010Cö2p\u0081Ó)*\u001a¾¸±·±4X\u001a\u0086\\wxx\u0084ý\u008a^êðÐ\u001aÀ©\u000e\u0080QK\u001a\u0001å¦ÂÃ²Ôï\u008d¥aMèFpÉÆ\u009eÂ\u0094@räQ\u0089|VÈ}\u0010Ú>áþók¾ÎÄV\u0099\u0006\u0014«Hè\"À\u008a\u0004À1æ\\ý~ú\u0005´1\u0011U2\b-\u00909\u0018®\u001c\u0003µý\u0098\u0092m³×à» BZ~\u0002ÁlÆª\u0085\u0091\u0006@ßÿuï[\u00ad4\u0087|\u0019\u009fyî£\u0000R~r}£\u0013K\th\u0014G\u001bi\u0007ºû>ÏÊufÅ\u0002×æ\u0090Swû\rõæîBkr¥ÖÐñÏÚ\u00964§>Þ°\u000e\u00186´\u0092ÇSfÿÙ\u00adv@\u0086ôöüÇì§3RÒ\u0003³d\u0018Û\u0092¼¾QÐ&ó¶²½ª¸\u0085ªô±\u008bõå{&±ïÀ_\u008d§%2Ål<âV\u008a\u0010\u00ad\u0084\u0004Ð\u0083Y#Ý\u0091ÀýÉ_é\u009es;pø÷\u001f-ú\u0010øuUöm.§/\u009cY»\u0097³Ï\tä\u0093\u007f¥f>aÉk\f_ï¢ýÆ-q\u0094ð\nµ¯\u001bÓÁ\u009a\b\u008dûçU¶DÌx\u0091¾©Fú\u009e\u0084«cÍ\u0016\u008d\u0092\u0014\u0082C?1\u0000pÕ´\f¹\u0001t\u001eÖj×\bÂ>\u008dY\u0014ïõGVä\u0017N\u0000,Û\u0090lÌË\u0099\u0085?úÞ\u000bxïªµWÒ¼\u008cÆï\u0005ÈD\u00879\u0080L\u009ese'~öM¤¤\u0083³îr\u001aü¡xa\t\u0018¨\u000f÷³h*\u009b:\u0018\u0083yD[`l?ôN\u001d¶\u0081\u001f.Ø\u001f7\u0098P\u0017{@Öä\u009c<7z\u0002Æ\u000e\u0012õÔ÷8\u001ftÄ4v\u0090\u009dØdØ3À\u007f}ÐôÿÂij\u0098\bAZ\u0019(?^sû\u0017J\u000f¹\u0084¾\u000eZîá`A\n\u001e \u0001¥¼½Ñ©îþ\u00816\u009fcÚ\u009eÂ\"&È¬þ\u0018½!Ïæ´DñîÔ\u0095\u0012\u0091\u001b@Z\u001d>\u009f0k\nà×Ø\b\u0097cÛò\u0087EÌç\bîØÏOy\u0010Ð\\\u0018¤\u0012d,\u0017Q\u0088\u0003©lH5l¼\u0001\u000e\u000fÁ£\u0087t\u0005¿®Pà¾¤ô`Z\"¬\u001aõR/jÎÍ`ÝïY¶®[§\u0014\u009fq\u0093i\u0013Ø6.\u0092\u0089\u0019}9´a\u000b\u008d\u009f§\u000bZb ÛÛ}£\u0010y7&Ø}½QçX\u0007VÉu£áH!\u0091ë=m\u0080\u001aC\u001b°Nc\u0010\u0014äGÂðÿâ\u009bFÀ¤Îv^Dì\u0010Ã¥Tø\u0013Ü[\u009f\nBSD\u0080Í0L\b!\u008a\u008e\u0016(]÷\u0012\b\u0013\u00ad\"5\u009f8f[X\u001a\u0086\\wxx\u0084ý;©ê Ác=àö\u0005,Ù,»KµÍ\u0013þ\u0083\u0080\u0096ãú\u0000û6oqÛ,Ä«Kî\u009b\u007f¢\u0006M~á\u0083U2Ð\u0094\u009f´\u008fßÑ\u008b2Ê\u0000\u008by5\u001dsbsÂótrªIv\u000e>Au°@P³\u0082R";
      int var7 = "ßÒõ¼>Á»å\u00030\u000bb®[X\u008au,,¶,\u0097Á#=\u0002\\^÷õ#uþt5\u009b;¬}&o\u008b\u0017Å»é\u0003}À]å\\\u001b_\u001f\u000e*i:s\rD\u0003ÂªîN5o\n,Ê\u0010Cö2p\u0081Ó)*\u001a¾¸±·±4X\u001a\u0086\\wxx\u0084ý\u008a^êðÐ\u001aÀ©\u000e\u0080QK\u001a\u0001å¦ÂÃ²Ôï\u008d¥aMèFpÉÆ\u009eÂ\u0094@räQ\u0089|VÈ}\u0010Ú>áþók¾ÎÄV\u0099\u0006\u0014«Hè\"À\u008a\u0004À1æ\\ý~ú\u0005´1\u0011U2\b-\u00909\u0018®\u001c\u0003µý\u0098\u0092m³×à» BZ~\u0002ÁlÆª\u0085\u0091\u0006@ßÿuï[\u00ad4\u0087|\u0019\u009fyî£\u0000R~r}£\u0013K\th\u0014G\u001bi\u0007ºû>ÏÊufÅ\u0002×æ\u0090Swû\rõæîBkr¥ÖÐñÏÚ\u00964§>Þ°\u000e\u00186´\u0092ÇSfÿÙ\u00adv@\u0086ôöüÇì§3RÒ\u0003³d\u0018Û\u0092¼¾QÐ&ó¶²½ª¸\u0085ªô±\u008bõå{&±ïÀ_\u008d§%2Ål<âV\u008a\u0010\u00ad\u0084\u0004Ð\u0083Y#Ý\u0091ÀýÉ_é\u009es;pø÷\u001f-ú\u0010øuUöm.§/\u009cY»\u0097³Ï\tä\u0093\u007f¥f>aÉk\f_ï¢ýÆ-q\u0094ð\nµ¯\u001bÓÁ\u009a\b\u008dûçU¶DÌx\u0091¾©Fú\u009e\u0084«cÍ\u0016\u008d\u0092\u0014\u0082C?1\u0000pÕ´\f¹\u0001t\u001eÖj×\bÂ>\u008dY\u0014ïõGVä\u0017N\u0000,Û\u0090lÌË\u0099\u0085?úÞ\u000bxïªµWÒ¼\u008cÆï\u0005ÈD\u00879\u0080L\u009ese'~öM¤¤\u0083³îr\u001aü¡xa\t\u0018¨\u000f÷³h*\u009b:\u0018\u0083yD[`l?ôN\u001d¶\u0081\u001f.Ø\u001f7\u0098P\u0017{@Öä\u009c<7z\u0002Æ\u000e\u0012õÔ÷8\u001ftÄ4v\u0090\u009dØdØ3À\u007f}ÐôÿÂij\u0098\bAZ\u0019(?^sû\u0017J\u000f¹\u0084¾\u000eZîá`A\n\u001e \u0001¥¼½Ñ©îþ\u00816\u009fcÚ\u009eÂ\"&È¬þ\u0018½!Ïæ´DñîÔ\u0095\u0012\u0091\u001b@Z\u001d>\u009f0k\nà×Ø\b\u0097cÛò\u0087EÌç\bîØÏOy\u0010Ð\\\u0018¤\u0012d,\u0017Q\u0088\u0003©lH5l¼\u0001\u000e\u000fÁ£\u0087t\u0005¿®Pà¾¤ô`Z\"¬\u001aõR/jÎÍ`ÝïY¶®[§\u0014\u009fq\u0093i\u0013Ø6.\u0092\u0089\u0019}9´a\u000b\u008d\u009f§\u000bZb ÛÛ}£\u0010y7&Ø}½QçX\u0007VÉu£áH!\u0091ë=m\u0080\u001aC\u001b°Nc\u0010\u0014äGÂðÿâ\u009bFÀ¤Îv^Dì\u0010Ã¥Tø\u0013Ü[\u009f\nBSD\u0080Í0L\b!\u008a\u008e\u0016(]÷\u0012\b\u0013\u00ad\"5\u009f8f[X\u001a\u0086\\wxx\u0084ý;©ê Ác=àö\u0005,Ù,»KµÍ\u0013þ\u0083\u0080\u0096ãú\u0000û6oqÛ,Ä«Kî\u009b\u007f¢\u0006M~á\u0083U2Ð\u0094\u009f´\u008fßÑ\u008b2Ê\u0000\u008by5\u001dsbsÂótrªIv\u000e>Au°@P³\u0082R"
         .length();
      char var4 = 'X';
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
                     String var23 = var0[15];
                     String var24 = var0[7];
                     String[] var11 = new String[]{var0[10], var0[9]};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, 1, var11
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[14], var0[18], 4, 8, 6, 1
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[13], var0[12], 1, 8, 4, 1
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[5], var0[0], 100, 1000, 250, 50
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[4], var0[17], 250, 2500, 650, 50
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[2], var0[1], 2500, 15000, 8500, 250
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var0[16], var0[3], false);
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[8], var0[6], true);
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[11], var0[19], 0, 6, 4, 1
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

                  var5 = "äYRöT6ÅyeË\u0098±6ms¯\u000egIS¦\u0085Ë\u0094Ã\bú2«æ\u008bHÌ\u00ad¨Ì\t*\u0091(\fúýR4)^Éá¶æ»\u008fÃðq\u008c\u0081PR\u008dSâZ\u0002ßñÑªÂ|ñp# '0-$\u0085Ä¿\u0012\u001b~\u008b£µH\u0096µ{.q\u0081u\u0088à¾¤ô`Z\"¬Öe^U\u0002=vyÃIV|\u0093U]¨\u0015è\u0012-þ¤o%,fW~\u0081\tÊµ\u0081µÌÎ\u0013v9Óí¶\u0005\u00ad(*Ò7}m¥y(xOõ\u0098å:\u00ad\u0094þj\u0004ÉÄ\u001d¶\u008cFÑw\t\u001bcænQ\"{\u0006n\u009bD2·øM\u0090ëvoä?$y\u00885\u0086Èuw\u0005\u0007ïûa\u009e¨Âe1\u008fa\u0090Læ.¬\r% \u007fÎ\u0095\u0089·â";
                  var7 = "äYRöT6ÅyeË\u0098±6ms¯\u000egIS¦\u0085Ë\u0094Ã\bú2«æ\u008bHÌ\u00ad¨Ì\t*\u0091(\fúýR4)^Éá¶æ»\u008fÃðq\u008c\u0081PR\u008dSâZ\u0002ßñÑªÂ|ñp# '0-$\u0085Ä¿\u0012\u001b~\u008b£µH\u0096µ{.q\u0081u\u0088à¾¤ô`Z\"¬Öe^U\u0002=vyÃIV|\u0093U]¨\u0015è\u0012-þ¤o%,fW~\u0081\tÊµ\u0081µÌÎ\u0013v9Óí¶\u0005\u00ad(*Ò7}m¥y(xOõ\u0098å:\u00ad\u0094þj\u0004ÉÄ\u001d¶\u008cFÑw\t\u001bcænQ\"{\u0006n\u009bD2·øM\u0090ëvoä?$y\u00885\u0086Èuw\u0005\u0007ïûa\u009e¨Âe1\u008fa\u0090Læ.¬\r% \u007fÎ\u0095\u0089·â"
                     .length();
                  var4 = '`';
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
