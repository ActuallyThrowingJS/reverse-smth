// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

import java.util.Arrays;

abstract class h {
   final int v;
   final int[] w = new int[4];
   final P x = new P();
   final short[][] y = new short[12][16];
   final short[] z = new short[12];
   final short[] A = new short[12];
   final short[] B = new short[12];
   final short[] C = new short[12];
   final short[][] D = new short[12][16];
   final short[][] E = new short[4][64];
   final short[][] F = new short[][]{
      new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]
   };
   final short[] G = new short[16];

   h(int var1) {
      this.v = (1 << var1) - 1;
   }

   void c() {
      this.w[0] = 0;
      this.w[1] = 0;
      this.w[2] = 0;
      this.w[3] = 0;
      this.x.S = 0;

      for (int var1 = 0; var1 < this.y.length; var1++) {
         Arrays.fill(this.y[var1], (short)1024);
      }

      Arrays.fill(this.z, (short)1024);
      Arrays.fill(this.A, (short)1024);
      Arrays.fill(this.B, (short)1024);
      Arrays.fill(this.C, (short)1024);

      for (int var2 = 0; var2 < this.D.length; var2++) {
         Arrays.fill(this.D[var2], (short)1024);
      }

      for (int var3 = 0; var3 < this.E.length; var3++) {
         Arrays.fill(this.E[var3], (short)1024);
      }

      for (int var4 = 0; var4 < this.F.length; var4++) {
         Arrays.fill(this.F[var4], (short)1024);
      }

      Arrays.fill(this.G, (short)1024);
   }
}
