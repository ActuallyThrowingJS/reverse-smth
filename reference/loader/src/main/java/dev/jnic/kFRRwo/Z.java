// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

import java.io.IOException;

public final class Z {
   public final byte[] m;
   public final int n;
   public int o = 0;
   public int p = 0;
   public int q = 0;
   public int r = 0;
   public int s = 0;
   public int t = 0;

   public Z(int var1, byte[] var2) {
      this.n = var1;
      this.m = new byte[this.n];
      if (var2 != null) {
         this.p = Math.min(var2.length, var1);
         this.q = this.p;
         this.o = this.p;
         System.arraycopy(var2, var2.length - this.p, this.m, 0, this.p);
      }
   }

   public final int b(int var1) {
      int var2 = this.p - var1 - 1;
      if (var1 >= this.p) {
         var2 += this.n;
      }

      return this.m[var2] & 0xFF;
   }

   public final void a(int var1, int var2) {
      if (var1 >= 0 && var1 < this.q) {
         int var3 = Math.min(this.r - this.p, var2);
         this.s = var2 - var3;
         this.t = var1;
         if ((var2 = this.p - var1 - 1) < 0) {
            if (this.q != this.n) {
               throw new AssertionError();
            }

            var2 += this.n;
            int var4 = Math.min(this.n - var2, var3);
            if (!u && var4 > var1 + 1) {
               throw new AssertionError();
            }

            System.arraycopy(this.m, var2, this.m, this.p, var4);
            this.p += var4;
            var2 = 0;
            if ((var3 -= var4) == 0) {
               return;
            }
         }

         if (!u && var2 >= this.p) {
            throw new AssertionError();
         } else if (!u && var3 <= 0) {
            throw new AssertionError();
         } else {
            int var7;
            do {
               var7 = Math.min(var3, this.p - var2);
               System.arraycopy(this.m, var2, this.m, this.p, var7);
               this.p += var7;
            } while ((var3 -= var7) > 0);

            if (this.q < this.p) {
               this.q = this.p;
            }
         }
      } else {
         throw new IOException();
      }
   }
}
