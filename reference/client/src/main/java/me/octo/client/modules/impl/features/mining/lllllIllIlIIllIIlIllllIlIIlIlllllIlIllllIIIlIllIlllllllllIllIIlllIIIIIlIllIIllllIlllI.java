package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI {
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
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

   static {
      long var9 = 91882255470192L ^ 69677709375775L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[18];
      int var6 = 0;
      String var5 = "\u0017+\u0082@½\u00ad\u0091*!\u001a\u0017+\u0019æ\u001b\u008a\bÏ°$üD<\u000b(\u0018\u0015G\u0091\u0086)a\u0091 £ÕdlN]\u009cPZ\u0081q¿2#Rè°\u000f\u0006\u009cDY\u0088þÝ\u0014\u0092²ÔI\u0080A\u000eT\u009aÓØRù\u0093IR\u009c½òû&¾\u000e§|U~hÄJl\u0097\u009b\r¸ûQw\u001b<\u008b\u000542\u0012±*\u009aO\u001d\u0098ø\u0011`ìÈ\u001f\u0091\u000b/±Ý\u008alÏ}Zg\u001a&DRüõÄ¾\u0016ïÍ\u0080ÇÑ\f(\u000fÛd\u001c\u00943\u0082ß Ái\u00adÑ\u0004\u0083Ì4\fugõõ\u0091UH\u0083\u0004\b«\u009f\u009a\u008e2\u008dÞRÄ\u0003Ep\u0003\t\rDÃ%\u0018\u0015q\u008bGâ\u0015øãx\u0010ho\u0087_\u0099¿\f\u00ad2hY\u0017Qir\u0015¶È\u009fÅª\u007fòÉ¿\u0003XåÈ\u0001i\b_\u001e^{\u0086\u000f½7(&@YÅÚsYN\u001dy\u0007\u00040vì\u0088\u008dØ\u0083\u0010\u007f\u008c:\u001fi½@m\u0019\n\u0011z\u00adx.;ì¼K\"\r½Ã?ö*ÐQ#Q\u00815tnÏvÓ\u000fÜ\u0089@¶\u009e4É¬'ì°\f;·â\u0080\bdÈUü\u0007×\u008cÃPå\u0007I¶`T(þ£/´§\tû$ÿf¢Å\nä<ìp\u001b»J± Mäùúï`7/Ð^\bF¿ß\u0080;\u0010nd\u000b\u0005HAÅâ°\u0004Æ\u001a¥\u0080|,YÛW\u0015à\u001a*\u00903ÈÙ\u000fÿF\u0099Be\u0084\u0018Ý÷:ð\u0088=\u0098\u0015zÏ\u0017\u0002<ów{Ça¸\u0000\u001e'ù\u0019Xøs\u009e\u0095vºniý0è´\u000e\u0089;wÃF\u0001G:\u0099j8\u0012¹Ã\u0010RÂ7°7>çå¦\u0099\u00adç}1\u000es\u009a¬Ib\u0084sI\u0085»¡¡d\u0081l×:Lk\u0010Þð¬Àõ_}²j\u0018Å\f?\rÓ{\u0015Û}öÇ\u0013ý\rI\u0010¨0ßV\u000bz\u000b\u0003\u0002µ¨[¨Í¥%\b\f)\"\u000b\r\u000f\u0097\u0083Xøs\u009e\u0095vºnií\u0086|\u0092Å@\u0003^\u0081É/\u0004ã}©y0I\u0090Mg\u0083Yõ9¤¯«¹myO÷Óå\u0083\u0080ª\u000bnÿ\rm\u0018£\u0094\rg>\u008a¡\u008fèÖ®\u0089\u0004\u008c¨G»Vùçâ\u0003\u001aÕG\u001cq\u0081ýÛ6Êm\u0086ÔVhâû\\O\u0083r\u0015\u008d\u0001\u0013a<W'«ó¥Iã\u0084\u0000\u0013\u008c\u0013.Ê<áQjBÙæeYÀ\u001c7Æ\u001f'RM!wE|\u0092G\u007fYª>îdÇ\u008du®Us\u0018e°¢\u0097m\u0000^ãq3Y\u000eÃ\u00911r4»©í«w\u0002\u001e\u0099ï\u0011ê\u0001î\u009b%\u0096ÀÝ\u0090R¶ó\u007f´û\u0018\u0017\tDû>ôúIÜ'ÎBZ\u0092ÝÿDgË\u008a\u0002\b\u0099\u0015\bô¼ØÁd\u0083'àhúÄ±bã\u0096)\u001dÔA\u0091\u0097\u0098\r®fJ\u0013\u0098ô<0\u0015Y\u0097ì¿\u0014ª\u0011³\u0094Ll\u0011«d\u0007i\u008b\u009cªP/ql\u0083üÜEN§ÐA\u000f°µó3X.ñG\fä®\u0081a\u0003o\u009d\u0014¼\u0097ýP!+\u00819ÎO\u008e(²\u00ad\u001e4`\u0080\tß©.ª¬ìZÖïÉ®F\u00ad";
      int var7 = "\u0017+\u0082@½\u00ad\u0091*!\u001a\u0017+\u0019æ\u001b\u008a\bÏ°$üD<\u000b(\u0018\u0015G\u0091\u0086)a\u0091 £ÕdlN]\u009cPZ\u0081q¿2#Rè°\u000f\u0006\u009cDY\u0088þÝ\u0014\u0092²ÔI\u0080A\u000eT\u009aÓØRù\u0093IR\u009c½òû&¾\u000e§|U~hÄJl\u0097\u009b\r¸ûQw\u001b<\u008b\u000542\u0012±*\u009aO\u001d\u0098ø\u0011`ìÈ\u001f\u0091\u000b/±Ý\u008alÏ}Zg\u001a&DRüõÄ¾\u0016ïÍ\u0080ÇÑ\f(\u000fÛd\u001c\u00943\u0082ß Ái\u00adÑ\u0004\u0083Ì4\fugõõ\u0091UH\u0083\u0004\b«\u009f\u009a\u008e2\u008dÞRÄ\u0003Ep\u0003\t\rDÃ%\u0018\u0015q\u008bGâ\u0015øãx\u0010ho\u0087_\u0099¿\f\u00ad2hY\u0017Qir\u0015¶È\u009fÅª\u007fòÉ¿\u0003XåÈ\u0001i\b_\u001e^{\u0086\u000f½7(&@YÅÚsYN\u001dy\u0007\u00040vì\u0088\u008dØ\u0083\u0010\u007f\u008c:\u001fi½@m\u0019\n\u0011z\u00adx.;ì¼K\"\r½Ã?ö*ÐQ#Q\u00815tnÏvÓ\u000fÜ\u0089@¶\u009e4É¬'ì°\f;·â\u0080\bdÈUü\u0007×\u008cÃPå\u0007I¶`T(þ£/´§\tû$ÿf¢Å\nä<ìp\u001b»J± Mäùúï`7/Ð^\bF¿ß\u0080;\u0010nd\u000b\u0005HAÅâ°\u0004Æ\u001a¥\u0080|,YÛW\u0015à\u001a*\u00903ÈÙ\u000fÿF\u0099Be\u0084\u0018Ý÷:ð\u0088=\u0098\u0015zÏ\u0017\u0002<ów{Ça¸\u0000\u001e'ù\u0019Xøs\u009e\u0095vºniý0è´\u000e\u0089;wÃF\u0001G:\u0099j8\u0012¹Ã\u0010RÂ7°7>çå¦\u0099\u00adç}1\u000es\u009a¬Ib\u0084sI\u0085»¡¡d\u0081l×:Lk\u0010Þð¬Àõ_}²j\u0018Å\f?\rÓ{\u0015Û}öÇ\u0013ý\rI\u0010¨0ßV\u000bz\u000b\u0003\u0002µ¨[¨Í¥%\b\f)\"\u000b\r\u000f\u0097\u0083Xøs\u009e\u0095vºnií\u0086|\u0092Å@\u0003^\u0081É/\u0004ã}©y0I\u0090Mg\u0083Yõ9¤¯«¹myO÷Óå\u0083\u0080ª\u000bnÿ\rm\u0018£\u0094\rg>\u008a¡\u008fèÖ®\u0089\u0004\u008c¨G»Vùçâ\u0003\u001aÕG\u001cq\u0081ýÛ6Êm\u0086ÔVhâû\\O\u0083r\u0015\u008d\u0001\u0013a<W'«ó¥Iã\u0084\u0000\u0013\u008c\u0013.Ê<áQjBÙæeYÀ\u001c7Æ\u001f'RM!wE|\u0092G\u007fYª>îdÇ\u008du®Us\u0018e°¢\u0097m\u0000^ãq3Y\u000eÃ\u00911r4»©í«w\u0002\u001e\u0099ï\u0011ê\u0001î\u009b%\u0096ÀÝ\u0090R¶ó\u007f´û\u0018\u0017\tDû>ôúIÜ'ÎBZ\u0092ÝÿDgË\u008a\u0002\b\u0099\u0015\bô¼ØÁd\u0083'àhúÄ±bã\u0096)\u001dÔA\u0091\u0097\u0098\r®fJ\u0013\u0098ô<0\u0015Y\u0097ì¿\u0014ª\u0011³\u0094Ll\u0011«d\u0007i\u008b\u009cªP/ql\u0083üÜEN§ÐA\u000f°µó3X.ñG\fä®\u0081a\u0003o\u009d\u0014¼\u0097ýP!+\u00819ÎO\u008e(²\u00ad\u001e4`\u0080\tß©.ª¬ìZÖïÉ®F\u00ad"
         .length();
      char var4 = '\u0010';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "qÇZ\u001aÿÙüªÉC\u0016×èl¼\u000fF\u0095¬\u0094©´+\u0095kZÄb^\u009bPJ\f²3½J\u0002·\u008b\u0086òD\u008d}\u008a¿\u0090°|\u0002árr_'·IR\u0007\u008e×\u0098s`¬\u0005ßUÁ\u0096n\u0018¨Î\u00adué±\u0015¡å\u0007\u009f\u008e&ßÂQ\u0007\\à\u0006#£Ù\u0011";
            var7 = "qÇZ\u001aÿÙüªÉC\u0016×èl¼\u000fF\u0095¬\u0094©´+\u0095kZÄb^\u009bPJ\f²3½J\u0002·\u008b\u0086òD\u008d}\u008a¿\u0090°|\u0002árr_'·IR\u0007\u008e×\u0098s`¬\u0005ßUÁ\u0096n\u0018¨Î\u00adué±\u0015¡å\u0007\u009f\u008e&ßÂQ\u0007\\à\u0006#£Ù\u0011"
               .length();
            var4 = 'H';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  String var26 = var0[1];
                  String var27 = var0[3];
                  String[] var11 = new String[]{var0[14], var0[5]};
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, 1, var11
                  );
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[9], var0[12], 2, 8, 4, 1
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[0], var0[6], 1, 8, 4, 1
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[17], var0[4], 100, 1000, 250, 50
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[13], var0[11], 250, 2500, 700, 50
                  );
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[7], var0[8], 2500, 15000, 8000, 250
                  );
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[2], var0[15], 0, 10, 5, 1
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[10], var0[16], false);
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
