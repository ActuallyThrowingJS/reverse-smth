package me.octo.client.modules.impl.features.hud;

import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl {
   @NotNull
   private static List<Pair<String, Double>> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

   static {
      long var9 = 28317617190702L ^ 77519571071944L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[5];
      int var6 = 0;
      String var5 = "TzÄ×ßkoQd\u00017\u0095Ñ\u0000\u0003\u0017\u0010ß\u001d\u008d\u0013û\u008cE [\u008a\f\u0014`ç\u0091ä\u0010\u009cµ@`°z\u008af|kæ÷¢\u0086®\u0097";
      int var7 = "TzÄ×ßkoQd\u00017\u0095Ñ\u0000\u0003\u0017\u0010ß\u001d\u008d\u0013û\u008cE [\u008a\f\u0014`ç\u0091ä\u0010\u009cµ@`°z\u008af|kæ÷¢\u0086®\u0097"
         .length();
      char var4 = 16;
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
                     Pair[] var11 = new Pair[]{
                        TuplesKt.to(var0[1], 312510.0),
                        TuplesKt.to(var0[0], 268000.0),
                        TuplesKt.to(var0[3], 144000.0),
                        TuplesKt.to(var0[4], 92000.0),
                        TuplesKt.to(var0[2], 81200.0)
                     };
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = CollectionsKt.listOf(var11);
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

                  var5 = "ÏáÉ>\u0003«X\u001fê¢\u009c~\u009a¦\u008eæ\u0010\u0083ð9Æ×à\u001f\u0096¢3xüG9Dã";
                  var7 = "ÏáÉ>\u0003«X\u001fê¢\u009c~\u009a¦\u008eæ\u0010\u0083ð9Æ×à\u001f\u0096¢3xüG9Dã".length();
                  var4 = 16;
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
