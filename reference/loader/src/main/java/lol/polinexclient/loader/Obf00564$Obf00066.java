// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

class Obf00564$Obf00066 {
   boolean Obf00487;
   boolean Obf00120;
   private static final long[] a;
   private static final Long[] b;

   Obf00564$Obf00066(
      boolean var1, int var2, boolean var3, int var4, int var5
   ) {
      long var6 = (long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48;
      super();
      int var10000 = Obf00453.Obf00099<"À">(
         a(4770, 2845342641668311439L), var6
      );
      Obf00453.Obf00099<"ì">(
         this, var1, 1419657298043032761L, var6
      );
      int var8 = var10000;
      Obf00453.Obf00099<"ì">(
         this, var3, 1406620715976841395L, var6
      );
      if (var8 != 0) {
         Obf00453.Obf00099<"m">(
            !Obf00453.Obf00099<"À">(
               1421493531920214695L, var6
            ),
            1421493531920214695L,
            var6
         );
      }
   }

   static {
      long var0 = 4694757026642437038L;
      long[] var6 = new long[5];
      int var3 = 0;
      String var4 = "HëË\u008a\u0014[\u0005¼\r\u008aùÛ3\u0080R²vëå\u0087¡Äµ\u0086";
      int var5 = "HëË\u008a\u0014[\u0005¼\r\u008aùÛ3\u0080R²vëå\u0087¡Äµ\u0086".length();
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

      var4 = "uÔ9?\u0011/\u0016û,Hºî1\u008eÇ\u0007";
      var5 = "uÔ9?\u0011/\u0016û,Hºî1\u008eÇ\u0007".length();
      var2 = 0;

      do {
         int var13 = var2;
         var2 += 8;
         byte[] var11 = var4.substring(var13, var2).getBytes("ISO-8859-1");
         var13 = var3++;
         long var16 = (
               (var11[0] & 255L) << 56
                  | (var11[1] & 255L) << 48
                  | (var11[2] & 255L) << 40
                  | (var11[3] & 255L) << 32
                  | (var11[4] & 255L) << 24
                  | (var11[5] & 255L) << 16
                  | (var11[6] & 255L) << 8
                  | var11[7] & 255L
            )
            ^ var0;
         boolean var15 = false;
         var6[var13] = var16;
      } while (var2 < var5);

      a = var6;
      b = new Long[5];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 23342) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
