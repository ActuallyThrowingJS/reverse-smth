package me.octo.client.modules.impl.macros.farming;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import lombok.Generated;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   WHEAT,
   CARROT,
   POTATO,
   SUGAR_CANE,
   NETHER_WART;

   public final String bestHoes;
   public final Block crop;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   @Generated
   private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var3, Block var4) {
      this.bestHoes = var3;
      this.crop = var4;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = 80661460087623L ^ 137690291949926L;
      if (IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()) {
         boolean var11 = true;
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[10];
      int var6 = 0;
      String var5 = "\\®u-z\u0003!\u0097ØÌ\u0096\u001cõUE´\u0016hv8\u0004e\u0096ñ\b\u0001\u0003°É'j}\u001d\u00102Ù¥\u0085\u0090\u0097\u0099ë\u009f\u0014Ô\u0080\u001aÔ{v\b\u0083øÇ\u0094ãþÐu\u0018ªýâOò\u009b\u0018K\u0016\u008e5\u0006CÒï\u00074$»<²\u0090\u0016@\u0018\u000f¦ìk\u008f\u0092&ý\u0086\u0088ùÔG\fÜ$\u008fz\u0095\u0087ú`\u0084¿\baª<~\u0016z\u0011\u0094\u0010géRð\u008d~bGT\u000b%/kî)+";
      int var7 = "\\®u-z\u0003!\u0097ØÌ\u0096\u001cõUE´\u0016hv8\u0004e\u0096ñ\b\u0001\u0003°É'j}\u001d\u00102Ù¥\u0085\u0090\u0097\u0099ë\u009f\u0014Ô\u0080\u001aÔ{v\b\u0083øÇ\u0094ãþÐu\u0018ªýâOò\u009b\u0018K\u0016\u008e5\u0006CÒï\u00074$»<²\u0090\u0016@\u0018\u000f¦ìk\u008f\u0092&ý\u0086\u0088ùÔG\fÜ$\u008fz\u0095\u0087ú`\u0084¿\baª<~\u0016z\u0011\u0094\u0010géRð\u008d~bGT\u000b%/kî)+"
         .length();
      char var4 = 24;
      int var13 = -1;

      label32:
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
                     WHEAT = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var0[5], Blocks.WHEAT);
                     CARROT = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var0[8], Blocks.CARROTS);
                     POTATO = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var0[0], Blocks.POTATOES);
                     SUGAR_CANE = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var0[4], Blocks.SUGAR_CANE);
                     NETHER_WART = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var0[9], Blocks.NETHER_WART);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var20;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label32;
                  }

                  var5 = "p\u0095©\u0004\u0094\u0014A\u0002\\\u0001úô\u00169\u0083{\u0082á\u008a\u0081\u009aÌ\u008bL\u0018p\t\u008e\u0098\u0090Ä\u0090$w\u001a\u007fÝ\\\u0099\u0094ê\u0081ûèá\u0089Q²3";
                  var7 = "p\u0095©\u0004\u0094\u0014A\u0002\\\u0001úô\u00169\u0083{\u0082á\u008a\u0081\u009aÌ\u008bL\u0018p\t\u008e\u0098\u0090Ä\u0090$w\u001a\u007fÝ\\\u0099\u0094ê\u0081ûèá\u0089Q²3"
                     .length();
                  var4 = 24;
                  var13 = -1;
            }

            var14 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var0) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
   }

   public static boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      boolean var0 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      return !var0;
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
