package me.octo.client.modules.impl.macros;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI {
   @NotNull
   public static IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   private IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI() {
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   static {
      long var9 = 108100331691051L ^ 68857176267722L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[9];
      int var6 = 0;
      String var5 = "8ðV\u0003Dýk\u009b\u0017\u001f\u00026ÿc\u0003F\u001d#Å\u0086}Y¡=¥\u0016\u009eô\rü\u001aÒ\u0018\u0099\u001f)<!\u009fu\u00ad¯<m¸ÀK\u0080ª3 ~M¬®[\u0016\u0010saÏGy7\u009c\u0086ü\u0088ô|Z6\u0084þ0°®\u0000\u0010\u0013Q'g:\u0082\u0015ì\u001c\u008ev\u0086\u0016KÂi\u0013&+(S\u0080[\u0086Oû¡åL\u000b\u008då\u0085$\u001a\u001c\u009f\u008e\\Z\b×Ð\u0011\u0018;'\u0089¹û\u0089\u00ad½ÐO\u0012Ï\u0088ðIiñ-Wª?LR>H;×«¼ä\u001c\rî3óÐ<\u0094N\u0014ÌÔÅ\u000eZØ\r}Sé«åW\u001a¼`*7Ù\u0086\u0000uOXý'¨\u0084Õ½ù½\u009bØ\u0087\u000f\u008dsé\u009dMb3ùvIh\u008f?ç\u0015\u008e\u00139;C3\u0010Z9ý\u001aX¥@¬¨Ïb\u0091oêf¶";
      int var7 = "8ðV\u0003Dýk\u009b\u0017\u001f\u00026ÿc\u0003F\u001d#Å\u0086}Y¡=¥\u0016\u009eô\rü\u001aÒ\u0018\u0099\u001f)<!\u009fu\u00ad¯<m¸ÀK\u0080ª3 ~M¬®[\u0016\u0010saÏGy7\u009c\u0086ü\u0088ô|Z6\u0084þ0°®\u0000\u0010\u0013Q'g:\u0082\u0015ì\u001c\u008ev\u0086\u0016KÂi\u0013&+(S\u0080[\u0086Oû¡åL\u000b\u008då\u0085$\u001a\u001c\u009f\u008e\\Z\b×Ð\u0011\u0018;'\u0089¹û\u0089\u00ad½ÐO\u0012Ï\u0088ðIiñ-Wª?LR>H;×«¼ä\u001c\rî3óÐ<\u0094N\u0014ÌÔÅ\u000eZØ\r}Sé«åW\u001a¼`*7Ù\u0086\u0000uOXý'¨\u0084Õ½ù½\u009bØ\u0087\u000f\u008dsé\u009dMb3ùvIh\u008f?ç\u0015\u008e\u00139;C3\u0010Z9ý\u001aX¥@¬¨Ïb\u0091oêf¶"
         .length();
      char var4 = ' ';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "\u0093i\u0019ÉO!Ëì@ýdXÊÙ\u0084,\u0017âå\u0088·Ýq\u0015i¶\u0099DV\u008b\u0016Ú®áßU¦\u0004g\u0013ò\u009eoÕ\u0086\u0005ü¤\u0010[þZ]\u0011=A\u0001\u001b\u009cFÐ\u008a-Ý`9\u00884\u0086\u0013\u0002!æ";
            var7 = "\u0093i\u0019ÉO!Ëì@ýdXÊÙ\u0084,\u0017âå\u0088·Ýq\u0015i¶\u0099DV\u008b\u0016Ú®áßU¦\u0004g\u0013ò\u009eoÕ\u0086\u0005ü¤\u0010[þZ]\u0011=A\u0001\u001b\u009cFÐ\u008a-Ý`9\u00884\u0086\u0013\u0002!æ"
               .length();
            var4 = '\b';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlllIIllllllIIIIIlIIllllIlIlIIllllIIIIlIlIIlIIIIlIIIlllIlIIIllIlIlIIllllIllllIlIllI();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[2], var0[8], 5, 99, 40, 0, 32, null
                  );
                  String var26 = var0[1];
                  String var27 = var0[3];
                  String[] var11 = new String[]{var0[7], var0[4], var0[6]};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, 2, var11
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[0], var0[5], true);
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
