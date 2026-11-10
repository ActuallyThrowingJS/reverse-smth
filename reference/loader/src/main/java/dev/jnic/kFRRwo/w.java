// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

import java.util.Arrays;

abstract class w {
   final short[] H = new short[2];
   final short[][] I = new short[16][8];
   final short[][] J = new short[16][8];
   final short[] K = new short[256];

   final void c() {
      Arrays.fill(this.H, (short)1024);

      for (int var1 = 0; var1 < this.I.length; var1++) {
         Arrays.fill(this.I[var1], (short)1024);
      }

      for (int var2 = 0; var2 < this.I.length; var2++) {
         Arrays.fill(this.J[var2], (short)1024);
      }

      Arrays.fill(this.K, (short)1024);
   }
}
