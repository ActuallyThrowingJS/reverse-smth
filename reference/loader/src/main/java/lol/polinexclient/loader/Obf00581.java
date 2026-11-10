// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

@Obf00037
public class Obf00581 {
   private static final long[] a;
   private static final Long[] b;

   @Obf00037
   public void Obf00196() {
      Class<Obf00160$Obf00564> var10000 = Obf00160$Obf00564.class;
      long var1 = 128396821800434L;
      long var3 = var1 ^ 22124284493776L;
      Obf00453.Obf00099<"D">(
         var3, 2728264677661433781L, var1
      );
   }

   @Obf00037
   public void Obf00467() {
      long var1 = 87247207987664L;
      long var3 = var1 ^ 101731120846161L;
      Obf00453.Obf00099<"D">(
         var3, -433239800030131808L, var1
      );
   }

   static {
      long var0 = 2223064212905963236L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "\u001aÇêã\u008b¦£³Õ>\u007fVß¿\rÎJ\u008avÝ7½\u008exEXl-´¸\u0011õ";
      int var5 = "\u001aÇêã\u008b¦£³Õ>\u007fVß¿\rÎJ\u008avÝ7½\u008exEXl-´¸\u0011õ".length();
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

      var4 = "9ùv\u0099\u0017û\u0092ÎE\"öÑÆñd\u008d";
      var5 = "9ùv\u0099\u0017û\u0092ÎE\"öÑÆñd\u008d".length();
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
      int var3 = (var0 ^ (int)var1 ^ 18786) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
