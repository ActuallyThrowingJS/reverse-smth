// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

@JNIC
public class Obf00030 {
   private static Unsafe Obf00487;
   private static Method Obf00120;
   private static String[] Obf00013;
   private static String[] Obf00025;
   private static String[] Obf00112;
   private static String[] Obf00123;

   private static native String Obf00099(
      String var0, String var1, long var2, String var4
   );

   private static native Unsafe Obf00099(long var0);

   private static native Method Obf00116(long var0);

   public static native void Obf00552(long var0);

   private static native void Obf00383(long var0, char var2);

   private static native void Obf00558(long var0);

   private static native void Obf00099(long var0, String var2);

   public static native void Obf00099(byte[] var0, String var1, long var2);

   private static native byte[] Obf00116(
      String var0, short var1, int var2, short var3
   );

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
