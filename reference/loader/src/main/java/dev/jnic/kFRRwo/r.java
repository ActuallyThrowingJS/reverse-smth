// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

import java.io.IOException;

public final class r extends o {
   public final byte[] m = new byte[65531];
   public int p = this.m.length;
   private static final long[] c;
   private static final Integer[] d;

   @Override
   public final void e() {
      if ((this.W & 0xFF000000) == 0) {
         try {
            this.X = this.X << 8 | this.m[this.p++] & 255;
            this.W <<= 8;
         } catch (ArrayIndexOutOfBoundsException var1) {
            throw new IOException();
         }
      }
   }

   static {
      long var0 = 1978271653127860798L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ñ)\u0007e¦\u0013o\u008a\u0080Î\u0014\u00131PB7";
      int var5 = "ñ)\u0007e¦\u0013o\u008a\u0080Î\u0014\u00131PB7".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      c = var6;
      d = new Integer[2];
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26807;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}
