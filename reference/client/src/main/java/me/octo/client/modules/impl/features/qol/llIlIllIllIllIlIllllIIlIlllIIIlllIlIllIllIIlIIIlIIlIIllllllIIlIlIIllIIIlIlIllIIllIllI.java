package me.octo.client.modules.impl.features.qol;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   static {
      long var9 = 75087086458095L ^ 81454113184699L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "ö\u0090·\u008bHb\u0013\bF\u008a<ÇPÚäCþèrÕ5(\u0098òõl\u0003^~íÍ\t è f¿âÒ\u001feä©áÐ|\f»\u007f®/=çV®}z3\u0000áÒ?æÓ\u0011";
      int var7 = "ö\u0090·\u008bHb\u0013\bF\u008a<ÇPÚäCþèrÕ5(\u0098òõl\u0003^~íÍ\t è f¿âÒ\u001feä©áÐ|\f»\u007f®/=çV®}z3\u0000áÒ?æÓ\u0011".length();
      char var4 = ' ';
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[1], var0[2], true);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[0], var0[3], true);
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

                  var5 = ":Øt#\u0086E³Dj÷\u0011\u008cå*2s\u008f\u0091yÇ¹h\u008a2\u0089\u009b\u0004\u0082ÃÂú\u001c¡gèh çIþ\u0088\u0005Wìõ¤JeðYþÞoqkM\u0011»\u001ai\u0011\u000fZ¿kêEZ\u0004ÅÐÑ\u009ej®ÇE+\u001c}·\u0011Á \\l\u001f@MKÞ,mé=¯ ËÃ³\u0094ÁÏ#\u0080\u00970«\u0084¨]9F ¦Pf¡óF\u0005fWá\u009fLÓ(ós?OúÕú\u0011\u0096\\ËS\u00996Ïã\u0012åäâ©¡*[/ÂÜ\u0000ßp\u0080Telæ´\u008f¬ZÌÌ/\u0096\u0099¢ÈÅC\u0092/aåX¹+\u009bQ!\u0011°\u009ego¢=_¶Øß\u0002ô\u001cêI\u0017W\b\u001fû\u0018\u000eâ!B\u0015\u0087¹ J÷)Óü\u009ex\u0083\u0007\u0095\u0003»_)\u0005\u0004\\";
                  var7 = ":Øt#\u0086E³Dj÷\u0011\u008cå*2s\u008f\u0091yÇ¹h\u008a2\u0089\u009b\u0004\u0082ÃÂú\u001c¡gèh çIþ\u0088\u0005Wìõ¤JeðYþÞoqkM\u0011»\u001ai\u0011\u000fZ¿kêEZ\u0004ÅÐÑ\u009ej®ÇE+\u001c}·\u0011Á \\l\u001f@MKÞ,mé=¯ ËÃ³\u0094ÁÏ#\u0080\u00970«\u0084¨]9F ¦Pf¡óF\u0005fWá\u009fLÓ(ós?OúÕú\u0011\u0096\\ËS\u00996Ïã\u0012åäâ©¡*[/ÂÜ\u0000ßp\u0080Telæ´\u008f¬ZÌÌ/\u0096\u0099¢ÈÅC\u0092/aåX¹+\u009bQ!\u0011°\u009ego¢=_¶Øß\u0002ô\u001cêI\u0017W\b\u001fû\u0018\u000eâ!B\u0015\u0087¹ J÷)Óü\u009ex\u0083\u0007\u0095\u0003»_)\u0005\u0004\\"
                     .length();
                  var4 = 'h';
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
