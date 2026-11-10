// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import sun.misc.Unsafe;

@JNIC
public final class Obf00339 {
   public static boolean Obf00120;
   private static String[] Obf00487;
   private static String[] Obf00013;
   private static long[] Obf00025;
   private static Long[] Obf00112;

   public static native void Obf00099(long var0);

   public static native void Obf00099(long var0, String var2);

   private static native Unsafe Obf00116(short var0, int var1, char var2);

   private static native void Obf00099(
      Obf00339$Obf00564 var0,
      long var1
   );

   private static native void Obf00116(long var0, String var2);

   private static native void Obf00099(
      int var0,
      Obf00339$Obf00564 var1,
      Obf00339$Obf00564 var2,
      String[] var3,
      int var4,
      char var5
   );

   private static native void Obf00099(
      int var0,
      int var1,
      Obf00339$Obf00564 var2,
      Obf00339$Obf00564 var3,
      byte var4
   );

   private static native void Obf00099(Thread var0, Throwable var1);

   private static native RuntimeException Obf00552(long var0);

   private static native void Obf00116(
      Obf00339$Obf00564 var0,
      long var1
   );

   private static native void Obf00116(
      Obf00339$Obf00564 var0,
      Obf00339$Obf00564 var1,
      String[] var2,
      long var3
   );

   private static native void Obf00116(
      long var0,
      Obf00339$Obf00564 var2,
      Obf00339$Obf00564 var3
   );

   private static native void Obf00116(Thread var0, Throwable var1);

   private static native RuntimeException Obf00383(long var0);

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   private static native long Obf00099(int var0, long var1);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
