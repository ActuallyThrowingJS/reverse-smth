// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

public class Obf00091$Obf00107
   extends RuntimeException {
   private static final long[] a;
   private static final Long[] b;

   public Obf00091$Obf00107(
      char var1, int var2, String var3, Throwable var4, short var5
   ) {
      long var6 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var5 << 48 >>> 48;
      long var10001 = var6 ^ 340454802740L;
      int var8 = (int)((var6 ^ 340454802740L) >>> 32);
      int var9 = (int)((var6 ^ 340454802740L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      super(var3, var4);
      Obf00453.Obf00099<"D">(
         var3, var8, var9, (char)var10, 3851556304032533492L, var6
      );
   }

   public Obf00091$Obf00107(
      long var1, String var3
   ) {
      long var10001 = var1 ^ 96961450341455L;
      int var4 = (int)((var1 ^ 96961450341455L) >>> 48);
      int var5 = (int)((var1 ^ 96961450341455L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      this((char)var4, var5, var3, null, (short)var6);
   }

   static {
      long var0 = 3103507981931633236L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "|\u001a\u0007»¶\f\t!Q\u0097+o²èÐØ\u001d\u000fÈMK\u0097ÄÎ";
      int var5 = "|\u001a\u0007»¶\f\t!Q\u0097+o²èÐØ\u001d\u000fÈMK\u0097ÄÎ".length();
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
      b = new Long[3];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6595) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
