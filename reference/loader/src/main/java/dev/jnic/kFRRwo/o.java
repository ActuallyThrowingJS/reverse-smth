// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

public abstract class o {
   public int W = 0;
   public int X = 0;
   private static final long[] a;
   private static final Integer[] b;

   public abstract void e();

   public final int a(short[] var1, int var2) {
      this.e();
      short var3 = var1[var2];
      int var4 = (this.W >>> 11) * var3;
      byte var5;
      if ((this.X ^ Integer.MIN_VALUE) < (var4 ^ Integer.MIN_VALUE)) {
         this.W = var4;
         var1[var2] = (short)(var3 + (2048 - var3 >>> 5));
         var5 = 0;
      } else {
         this.W -= var4;
         this.X -= var4;
         var1[var2] = (short)(var3 - (var3 >>> 5));
         var5 = 1;
      }

      return var5;
   }

   public final int a(short[] var1) {
      int var2 = 1;

      while ((var2 = var2 << 1 | this.a(var1, var2)) < var1.length) {
      }

      return var2 - var1.length;
   }

   public final int b(short[] var1) {
      int var2 = 1;
      int var3 = 0;
      int var4 = 0;

      do {
         int var5 = this.a(var1, var2);
         var2 = var2 << 1 | var5;
         var4 |= var5 << var3++;
      } while (var2 < var1.length);

      return var4;
   }

   static {
      long var0 = 3504064496989529893L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u009eY§Ý\u008aø30âk?m\\ï\u0000\u0013";
      int var5 = "\u009eY§Ý\u008aø30âk?m\\ï\u0000\u0013".length();
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

      a = var6;
      b = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14824;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}
