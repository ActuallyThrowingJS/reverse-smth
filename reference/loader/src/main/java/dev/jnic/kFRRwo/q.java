// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

public final class q extends h {
   private Z c;
   final o O;
   private final J P;
   private final N Q = new N(this, (byte)0);
   private final N R = new N(this, (byte)0);

   public q(Z var1, o var2, int var3, int var4, int var5) {
      super(var5);
      this.c = var1;
      this.O = var2;
      this.P = new J(this, var3, var4);
      this.c();
   }

   @Override
   public final void c() {
      super.c();
      this.P.c();
      this.Q.c();
      this.R.c();
   }

   public final void d() {
      Z var1 = this.c;
      if (this.c.s > 0) {
         var1.a(var1.t, var1.s);
      }

      while (true) {
         var1 = this.c;
         if (this.c.p >= var1.r) {
            this.O.e();
            return;
         }

         int var9 = this.c.p & this.v;
         if (this.O.a(this.y[this.x.S], var9) == 0) {
            J var11;
            J var30 = var11 = this.P;
            int var10001 = this.P.T.c.b(0);
            int var21 = var11.T.c.p;
            int var14 = var10001;
            J var19 = var30;
            int var24 = var14 >> 8 - var19.L;
            int var26 = (var21 & var19.M) << var19.L;
            var14 = var24 + var26;
            p var20 = var11.U[var14];
            var14 = 1;
            if (var20.V.T.x.S < 7) {
               while ((var14 = var14 << 1 | var20.V.T.O.a(var20.N, var14)) < 256) {
               }
            } else {
               var21 = var20.V.T.c.b(var20.V.T.w[0]);
               var24 = 256;

               do {
                  var26 = (var21 <<= 1) & var24;
                  int var28 = var20.V.T.O.a(var20.N, var24 + var26 + var14);
                  var14 = var14 << 1 | var28;
                  var24 &= 0 - var28 ^ ~var26;
               } while (var14 < 256);
            }

            byte var12 = (byte)var14;
            Z var17 = var20.V.T.c;
            var20.V.T.c.m[var17.p++] = var12;
            if (var17.q < var17.p) {
               var17.q = var17.p;
            }

            P var23 = var20.V.T.x;
            if (var20.V.T.x.S <= 3) {
               var23.S = 0;
            } else if (var23.S <= 9) {
               var23.S -= 3;
            } else {
               var23.S -= 6;
            }
         } else {
            int var29;
            if (this.O.a(this.z, this.x.S) == 0) {
               this.x.S = this.x.S < 7 ? 7 : 10;
               this.w[3] = this.w[2];
               this.w[2] = this.w[1];
               this.w[1] = this.w[0];
               int var3 = this.Q.c(var9);
               int var2;
               if ((var2 = this.O.a(this.E[var3 < 6 ? var3 - 2 : 3])) < 4) {
                  this.w[0] = var2;
               } else {
                  int var4 = (var2 >> 1) - 1;
                  this.w[0] = (2 | var2 & 1) << var4;
                  if (var2 < 14) {
                     this.w[0] = this.w[0] | this.O.b(this.F[var2 - 4]);
                  } else {
                     int[] var10000 = this.w;
                     int var10002 = this.w[0];
                     int var6 = var4 - 4;
                     o var5 = this.O;
                     int var7 = 0;

                     do {
                        var5.e();
                        var5.W >>>= 1;
                        var2 = var5.X - var5.W >>> 31;
                        var5.X = var5.X - (var5.W & var2 - 1);
                        var7 = var7 << 1 | 1 - var2;
                     } while (--var6 != 0);

                     var10000[0] = var10002 | var7 << 4;
                     this.w[0] = this.w[0] | this.O.b(this.G);
                  }
               }

               var29 = var3;
            } else {
               label120: {
                  if (this.O.a(this.A, this.x.S) == 0) {
                     if (this.O.a(this.D[this.x.S], var9) == 0) {
                        this.x.S = this.x.S < 7 ? 9 : 11;
                        var29 = 1;
                        break label120;
                     }
                  } else {
                     int var18;
                     if (this.O.a(this.B, this.x.S) == 0) {
                        var18 = this.w[1];
                     } else {
                        if (this.O.a(this.C, this.x.S) == 0) {
                           var18 = this.w[2];
                        } else {
                           var18 = this.w[3];
                           this.w[3] = this.w[2];
                        }

                        this.w[2] = this.w[1];
                     }

                     this.w[1] = this.w[0];
                     this.w[0] = var18;
                  }

                  this.x.S = this.x.S < 7 ? 8 : 11;
                  var29 = this.R.c(var9);
               }
            }

            int var10 = var29;
            this.c.a(this.w[0], var10);
         }
      }
   }
}
