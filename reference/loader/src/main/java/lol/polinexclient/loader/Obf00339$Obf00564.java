// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import java.util.function.Supplier;

final class Obf00339$Obf00564<T> {
   private final Supplier<T> Obf00487;
   private volatile boolean Obf00120;
   private T Obf00013;
   private static final long[] a;
   private static final Long[] b;

   Obf00339$Obf00564(
      Supplier<T> var1
   ) {
      this.Obf00487 = var1;
   }

   Object Obf00099(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/loader-decompiler-failures.json.
   }

   static {
      long var0 = 6657109393900258425L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "?{ÍÄ\\{½¯xÍk®\u000b5=Ë\u000b\u00859Y\u008e%«þ\u0005\u0097²\u00adËÆEÆ";
      int var5 = "?{ÍÄ\\{½¯xÍk®\u000b5=Ë\u000b\u00859Y\u008e%«þ\u0005\u0097²\u00adËÆEÆ".length();
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

      var4 = "[+P\u009a\u0086ðs|\\>\u001fæ§.qñ";
      var5 = "[+P\u009a\u0086ðs|\\>\u001fæ§.qñ".length();
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
      b = new Long[6];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 27873) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
