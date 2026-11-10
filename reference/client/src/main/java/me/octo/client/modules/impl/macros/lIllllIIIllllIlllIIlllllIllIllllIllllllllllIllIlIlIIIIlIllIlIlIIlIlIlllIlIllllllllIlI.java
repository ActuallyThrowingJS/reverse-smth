package me.octo.client.modules.impl.macros;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI {
   @NotNull
   public static lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

   private lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI() {
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
   public final me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BooleanSetting IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   static {
      long var9 = 116962345721317L ^ 79014519047661L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[21];
      int var6 = 0;
      String var5 = "\u0085\u007f ÓåÒµ÷0\u00056uX;T\u009aP\u0000\u00ad@+\u0012=ð\u009eºØ©rÓ\u008dïîq\u0001+!ÄÓu\u001f\n~ØiÈÝèp\\\u0090o¿\u0013r\u0081d\u0010÷|\u000f\u0082ë\u0099L³ q\tÐ`/~ï\u0018>k<EJdô<\u000bé$ó\u0093¶e%\u0096¨\u001d\rFa,\u0080\u0010(\u0091pÎßù]À$\\ÜÖ&,m;\u0010Í\u000bÒ\u008bHoi÷+Û$\u001f-É\\°\u0018\u0011y\u008bn\u009a9«\u009c£Ý\u009b5Ùé´\u0093oe¾Åm¨S\u0089\u0010\t&AB\u009c\u0099¶¢þ=\\×\u0085½)÷@(â4\u009a?aó\u0014\u001dNS\u008b\"\u0004ã\u007f\u009dÒÆÏ#0T·÷]ý\u0088W\u001cÍ\u0084Sgáná\u0085z#_¹Ë¤ãG\u009bÞhUcQ\u0001üÅ2PAùSØÉ©)Pën\u001a´A\u0091÷¼Ó.>Ä\u0003AÛþòno\u0088\u0010\u00813¹Ð\u0017Ý\u009eyîpsÀeQ\u0092\u001f>ê?}:h\u0084A^\u0016Ö\u0083ë\u0006;Ê*\u0091À¬oïÙ¨¿\u009cfÖPÅåm¼òÐ²Ø\u001d\r&k\u000eD\u0010\u008dÁ.\u009bæ\u0089\u0099ñ£[ø\u009df\u009dR\u009c BÚÇÏ^¯\u001c\u008dÁÖ\u008a¿û§Ä\u0096DxË0\u0010Ë3Þ)\u0082sÞê\u008d»Õ(«¬öº8¹÷q°¯\\),5\u008e}=çnàXw®¾_\u00adÊ^3\u008aNµb~S\"ÝQÜ#@³\u00adq\"Bån¸PÊÊRHxa\u0086à¼Û\u000bF\u0017rNò\u0002Þx\u001b3r\u0099]Ú\u0016.&z\u00ad9«ãÎs¶tø{!\u0091Z\u001c\u008cÇ\u0017Y\u008cøØpÖ\u008e\u00ad \b\u0093¹/\u0002ÔÙax\båï\u0015J\u0094c¯´h³uj>\u0005\u000bKìw\u0095e\u0097ue\u0010®\u0097ç+ýN£pCyÖÛ\u0095t\n\u00178&l\u0082\u0080Oþ\u009b\nC+\u001fxsm·¹Ñj\u0088¹U`>}WU\u0001õYD\u0016æ\n'°\u0093Î\u009eÌ'8\u0099 @ÛÆ«¤ú\u008b\u0004\u0095OMo`å\\\u008e-i?ðz\u0002ü3QË\u0084\\ö\u0010ªJÍ±Ùç\u009cYîÖÔ\u0080C\nh÷(\u0098\u001d\u0087\u00867ðFÇ\u0086\u0014ï`\u0083»\u0086dQ[/üò¬_J÷ÂÇ\u0000Z\u0016O\u0083èân)ÉW×*";
      int var7 = "\u0085\u007f ÓåÒµ÷0\u00056uX;T\u009aP\u0000\u00ad@+\u0012=ð\u009eºØ©rÓ\u008dïîq\u0001+!ÄÓu\u001f\n~ØiÈÝèp\\\u0090o¿\u0013r\u0081d\u0010÷|\u000f\u0082ë\u0099L³ q\tÐ`/~ï\u0018>k<EJdô<\u000bé$ó\u0093¶e%\u0096¨\u001d\rFa,\u0080\u0010(\u0091pÎßù]À$\\ÜÖ&,m;\u0010Í\u000bÒ\u008bHoi÷+Û$\u001f-É\\°\u0018\u0011y\u008bn\u009a9«\u009c£Ý\u009b5Ùé´\u0093oe¾Åm¨S\u0089\u0010\t&AB\u009c\u0099¶¢þ=\\×\u0085½)÷@(â4\u009a?aó\u0014\u001dNS\u008b\"\u0004ã\u007f\u009dÒÆÏ#0T·÷]ý\u0088W\u001cÍ\u0084Sgáná\u0085z#_¹Ë¤ãG\u009bÞhUcQ\u0001üÅ2PAùSØÉ©)Pën\u001a´A\u0091÷¼Ó.>Ä\u0003AÛþòno\u0088\u0010\u00813¹Ð\u0017Ý\u009eyîpsÀeQ\u0092\u001f>ê?}:h\u0084A^\u0016Ö\u0083ë\u0006;Ê*\u0091À¬oïÙ¨¿\u009cfÖPÅåm¼òÐ²Ø\u001d\r&k\u000eD\u0010\u008dÁ.\u009bæ\u0089\u0099ñ£[ø\u009df\u009dR\u009c BÚÇÏ^¯\u001c\u008dÁÖ\u008a¿û§Ä\u0096DxË0\u0010Ë3Þ)\u0082sÞê\u008d»Õ(«¬öº8¹÷q°¯\\),5\u008e}=çnàXw®¾_\u00adÊ^3\u008aNµb~S\"ÝQÜ#@³\u00adq\"Bån¸PÊÊRHxa\u0086à¼Û\u000bF\u0017rNò\u0002Þx\u001b3r\u0099]Ú\u0016.&z\u00ad9«ãÎs¶tø{!\u0091Z\u001c\u008cÇ\u0017Y\u008cøØpÖ\u008e\u00ad \b\u0093¹/\u0002ÔÙax\båï\u0015J\u0094c¯´h³uj>\u0005\u000bKìw\u0095e\u0097ue\u0010®\u0097ç+ýN£pCyÖÛ\u0095t\n\u00178&l\u0082\u0080Oþ\u009b\nC+\u001fxsm·¹Ñj\u0088¹U`>}WU\u0001õYD\u0016æ\n'°\u0093Î\u009eÌ'8\u0099 @ÛÆ«¤ú\u008b\u0004\u0095OMo`å\\\u008e-i?ðz\u0002ü3QË\u0084\\ö\u0010ªJÍ±Ùç\u009cYîÖÔ\u0080C\nh÷(\u0098\u001d\u0087\u00867ðFÇ\u0086\u0014ï`\u0083»\u0086dQ[/üò¬_J÷ÂÇ\u0000Z\u0016O\u0083èân)ÉW×*"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var23;
         if ((var3 += var4) >= var7) {
            var5 = "=®~nÚ´C\u0095J\u0016Ã/Áp7\u00038«¬öº8¹÷qpWýq@öî\u0006Lvf£GO²u}H\u0016Ý\u0080Oòb½ê\u0087sH»ÎÌP<é`j/$¸!\u008b\u0002d\u0094â\u009c\u0016";
            var7 = "=®~nÚ´C\u0095J\u0016Ã/Áp7\u00038«¬öº8¹÷qpWýq@öî\u0006Lvf£GO²u}H\u0016Ý\u0080Oòb½ê\u0087sH»ÎÌP<é`j/$¸!\u008b\u0002d\u0094â\u009c\u0016"
               .length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var0[var6++] = var25;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllllIIIllllIlllIIlllllIllIllllIllllllllllIllIlIlIIIIlIllIlIlIIlIlIlllIlIllllllllIlI();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[3], var0[13], true);
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[2], var0[16], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[19], var0[1], true);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
                     var0[6],
                     var0[12],
                     lIIIlllIIlIlIllllIllIIIllIIlIllIlllIIllllIIlIlIIIIIIlllllllIlIlllllIlIIlIIlIIIIlIIlII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getParentFolderName(),
                     new String[0],
                     0,
                     null,
                     48,
                     null
                  );
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[10], var0[8], 5, 99, 40, 0, 32, null
                  );
                  String var27 = var0[17];
                  String var28 = var0[20];
                  boolean[] var11 = new boolean[]{true, true, true, true, true};
                  String[] var19 = new String[]{var0[14], var0[5], var0[4], var0[15], var0[0]};
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
                     var27, var28, var11, var19
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[7], var0[18], true);
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting(var0[11], var0[9], true);
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
