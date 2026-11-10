package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.utils.client.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import net.minecraft.client.KeyMapping;
import org.jetbrains.annotations.NotNull;

public final class IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI {
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static KeyMapping IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   @NotNull
   public static final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public static final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
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

   static {
      long var9 = 119431218737570L ^ 29751897870240L;
      long var11 = var9 ^ 101598807738918L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[12];
      int var6 = 0;
      String var5 = "d§|\\\u0011Ìs³hF\u008féU\u008eÒß?Ë8â¹²\u007fi5\u001f_\u0084P\u0098Ñ\u0096 ¨³¾\u0012Ó¹?\u0010\u001afªUÁî\u000bïÒæâ3%éÛI\u0018\\\u0019E\u000fõ)B\u0001t}ºñêÜ\u0090ýÕyz\u0091¾mðv\u0018\u009eýûî4\u0000G\u0080\u001bù\u0086ýÓ\u009d\u0086Â\u008f\u001c\u009d?Aó\u0086»\u0010+I.>q\u0007\u009dÕÕ\u0007«:á£Dù\u0018Qä\u0005ÄUÎ\u009fà=\u009e\u009e]¼ P>]\u0095¥,{úb\u0097\u0010\u001c\u0090Ë\u0089$\u0095{\u0094\u0099Ùô\u008822_¥(!µgª¼:äíÃ\u0006Ö®å°5\u0014Ü\u0084¦e\u008aku ©À\"a\u0085éS3ßiÑÝ\u0003B\u0097s0ñª\u0019ª¥}\u00adÇâ®\u009a\u009d\u001f|h\u009f\u00056\t\u009e%RZ0èùRp\u0081\u009e\u001dÒ{{ëÃ<>\u009e\"~ù3\u0081\u001fá9U\u0018\u001c\u0090Ë\u0089$\u0095{\u0094}\u001eèËÊÜú\u0097i\u0011\u008cDd\\Ô¸";
      int var7 = "d§|\\\u0011Ìs³hF\u008féU\u008eÒß?Ë8â¹²\u007fi5\u001f_\u0084P\u0098Ñ\u0096 ¨³¾\u0012Ó¹?\u0010\u001afªUÁî\u000bïÒæâ3%éÛI\u0018\\\u0019E\u000fõ)B\u0001t}ºñêÜ\u0090ýÕyz\u0091¾mðv\u0018\u009eýûî4\u0000G\u0080\u001bù\u0086ýÓ\u009d\u0086Â\u008f\u001c\u009d?Aó\u0086»\u0010+I.>q\u0007\u009dÕÕ\u0007«:á£Dù\u0018Qä\u0005ÄUÎ\u009fà=\u009e\u009e]¼ P>]\u0095¥,{úb\u0097\u0010\u001c\u0090Ë\u0089$\u0095{\u0094\u0099Ùô\u008822_¥(!µgª¼:äíÃ\u0006Ö®å°5\u0014Ü\u0084¦e\u008aku ©À\"a\u0085éS3ßiÑÝ\u0003B\u0097s0ñª\u0019ª¥}\u00adÇâ®\u009a\u009d\u001f|h\u009f\u00056\t\u009e%RZ0èùRp\u0081\u009e\u001dÒ{{ëÃ<>\u009e\"~ù3\u0081\u001fá9U\u0018\u001c\u0090Ë\u0089$\u0095{\u0094}\u001eèËÊÜú\u0097i\u0011\u008cDd\\Ô¸"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var23;
         if ((var3 += var4) >= var7) {
            var5 = "rKXº×\u0014ÑHñÓÙ\u0083ö\u009eOK+Ln\u0086ÍéÎÛ\u0018]â\u0085\u0014Ño1ÇcX6\"ðÀÕ\u0090¥4ÓÔØp\u00ad&";
            var7 = "rKXº×\u0014ÑHñÓÙ\u0083ö\u009eOK+Ln\u0086ÍéÎÛ\u0018]â\u0085\u0014Ño1ÇcX6\"ðÀÕ\u0090¥4ÓÔØp\u00ad&".length();
            var4 = '\u0018';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var0[var6++] = var25;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[4], var0[5], 1, 20, 6, 0, 32, null
                  );
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[11], var0[8], 0, 3, 1, 0, 32, null
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[10], var0[2], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[3], var0[0], false);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[1], var0[7], false);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c5fc0357d32a5cdb(
                        var0[6], 67, var0[9], true, var11
                     );
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
