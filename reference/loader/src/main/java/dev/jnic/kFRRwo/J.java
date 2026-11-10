// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

final class J extends b {
   final p[] U;

   J(q var1, int var2, int var3) {
      super(var2, var3);
      this.T = var1;
      this.U = new p[1 << var2 + var3];

      for (int var4 = 0; var4 < this.U.length; var4++) {
         this.U[var4] = new p(this, (byte)0);
      }
   }

   final void c() {
      for (int var1 = 0; var1 < this.U.length; var1++) {
         this.U[var1].c();
      }
   }
}
