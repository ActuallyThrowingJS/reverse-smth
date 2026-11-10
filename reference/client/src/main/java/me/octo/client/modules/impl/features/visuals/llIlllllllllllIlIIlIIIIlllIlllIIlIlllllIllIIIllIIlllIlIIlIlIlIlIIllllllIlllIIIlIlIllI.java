package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import org.jetbrains.annotations.NotNull;

public final class llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI {
   @NotNull
   private static BooleanSetting IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   static {
      long var9 = 108808518200239L ^ 133165728044940L;
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
      String var5 = "YU¯ÖbGwõOë±ëÞ\u008bHÞ/¦Hj\u008e\u0089±Ä\u0018ö\u007f\u008d\u0087£»ý\u0006<.*\u0084%?\u009eÇ5\u0012Æ\u0095³J\u0094f";
      int var7 = "YU¯ÖbGwõOë±ëÞ\u008bHÞ/¦Hj\u008e\u0089±Ä\u0018ö\u007f\u008d\u0087£»ý\u0006<.*\u0084%?\u009eÇ5\u0012Æ\u0095³J\u0094f".length();
      char var4 = 24;
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
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new BooleanSetting(var0[1], var0[3], false);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[0], var0[2], false);
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

                  var5 = "d\u0084{\u0088\u000e\n\u0095\u009eØ=\u0082LÂ±#_¼\u001fs\u0080ã®Rè\u0018]¾Vç\u0098x²µ\u0080¤X#Ðë<,\u0095ó4ËÅ¦?Ó\u0084\u008aß¦ÔQø\u0081t\u0002À\u0013ÀE\u00ad\u0092\u0082\u0080öa\u008dÌq\u0000Øf¹\u0091W»â\u009c2\u0085\u0011ý\u009c\u0099:ñÊ\u0087Î ù\u0083Ì\u009f\u0085\u0080ã\u008d\u0015n°ÐIÛ\u0085\u0014\u0097äÀ\u0097zÇ\u0086$\u0007^h<ëÅ\u000f\u009dcXÛU õ$Á\u009e´kü+£\u0081ô\u0087·\t8\u00ad;\u008b¬4Ì\u0085\u0082Éáë\u009d.bÓà7TzÈ\u0011¤|Ø|¹B\u0081\\jÕ±´\u0081Àiä\u008eZ\u0097øÝ_\u0088éX²\r\u0094M¹C>\u0089¨èÅã\u009dþ\u009e?\u0091ÙÍ¿B\u0083¬×@õTQ¿@î\u000f§ï\u000bEÐÍÔ\u0013\u0083\tÜtW4\u000bWG@µQr5{\u008b=K\u0018N\u0097\u0096¯é\u0013[}¼\u0019\u0003F\u008eg\u009cï\u0092må\u0006S\u0004| 7ÄBÓE3©)µ\u007fÀ¨>Aùtàiu*¾\r\\²j®\u009a\u0081óíB\u0089ý¥× \n\u0091(";
                  var7 = "d\u0084{\u0088\u000e\n\u0095\u009eØ=\u0082LÂ±#_¼\u001fs\u0080ã®Rè\u0018]¾Vç\u0098x²µ\u0080¤X#Ðë<,\u0095ó4ËÅ¦?Ó\u0084\u008aß¦ÔQø\u0081t\u0002À\u0013ÀE\u00ad\u0092\u0082\u0080öa\u008dÌq\u0000Øf¹\u0091W»â\u009c2\u0085\u0011ý\u009c\u0099:ñÊ\u0087Î ù\u0083Ì\u009f\u0085\u0080ã\u008d\u0015n°ÐIÛ\u0085\u0014\u0097äÀ\u0097zÇ\u0086$\u0007^h<ëÅ\u000f\u009dcXÛU õ$Á\u009e´kü+£\u0081ô\u0087·\t8\u00ad;\u008b¬4Ì\u0085\u0082Éáë\u009d.bÓà7TzÈ\u0011¤|Ø|¹B\u0081\\jÕ±´\u0081Àiä\u008eZ\u0097øÝ_\u0088éX²\r\u0094M¹C>\u0089¨èÅã\u009dþ\u009e?\u0091ÙÍ¿B\u0083¬×@õTQ¿@î\u000f§ï\u000bEÐÍÔ\u0013\u0083\tÜtW4\u000bWG@µQr5{\u008b=K\u0018N\u0097\u0096¯é\u0013[}¼\u0019\u0003F\u008eg\u009cï\u0092må\u0006S\u0004| 7ÄBÓE3©)µ\u007fÀ¨>Aùtàiu*¾\r\\²j®\u009a\u0081óíB\u0089ý¥× \n\u0091("
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
