// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;

@JNIC
public final class Obf00599 implements AutoCloseable {
   public static String Obf00487;
   private KeyPair Obf00120;
   private static String[] Obf00013;
   private static String[] Obf00025;
   private static final long[] a;
   private static final Integer[] b;
   private static final long c;

   public Obf00599(long var1) throws GeneralSecurityException {
      int var10000 = 541188030 - (char)-8460;
      super();
      KeyPairGenerator var3 = KeyPairGenerator.getInstance(
         Obf00099(var10000, 541188030 - (char)-22816, (int)var1)
      );
      var3.initialize(2048);
      Obf00453.Obf00099<"ì">(
         this, var3.generateKeyPair(), c, var1
      );
   }

   public native String Obf00099(long var1);

   public native String Obf00099(
      String var1, String var2, long var3, String var5, String var6, String var7, String var8
   );

   public native byte[] Obf00099(
      byte[] var1, String var2, String var3, String var4, long var5, String var7, String var8, String var9, PublicKey var10
   ) throws GeneralSecurityException;

   @Override
   public native void close();

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   public static native void $jnicLoader();

   static {
      long var2 = 2797724734601170310L;
      long[] var8 = new long[2];
      int var5 = 0;
      String var6 = "P¤u\u0097LK5\u0001Ì\u009c\u0098qúÖ\u0006g";
      int var7 = "P¤u\u0097LK5\u0001Ì\u009c\u0098qúÖ\u0006g".length();
      byte var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10004 = (
               (var9[0] & 255L) << 56
                  | (var9[1] & 255L) << 48
                  | (var9[2] & 255L) << 40
                  | (var9[3] & 255L) << 32
                  | (var9[4] & 255L) << 24
                  | (var9[5] & 255L) << 16
                  | (var9[6] & 255L) << 8
                  | var9[7] & 255L
            )
            ^ var2;
         byte var10003 = -1;
         var8[var10001] = var10004;
      } while (var4 < var7);

      a = var8;
      b = new Integer[2];
      long var0 = 6479565954261091172L;
      long var10002 = 6021002356847689647L ^ var0;
      byte var11 = -1;
      c = var10002;
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21257;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}
