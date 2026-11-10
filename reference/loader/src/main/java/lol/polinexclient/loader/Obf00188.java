// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import sun.misc.Unsafe;

@JNIC
public class Obf00188 {
   private static Unsafe Obf00487;
   private static Method Obf00120;
   private static String[] Obf00013;
   private static Pattern[] Obf00025;
   private static String[] Obf00112;
   private static String[] Obf00123;
   private static String[] Obf00233;
   private static String[] Obf00229;

   private static native String Obf00099(
      int var0, String var1, String var2, int var3, String var4, byte var5
   );

   private static native Unsafe Obf00099(long var0);

   private static native Method Obf00116(char var0, short var1, int var2);

   public static native void Obf00552(short var0, short var1, int var2);

   private static native void Obf00383(long var0);

   private static native void Obf00558(long var0);

   private static native void Obf00224(long var0);

   private static native void Obf00236(long var0);

   private static native void Obf00389(long var0);

   private static native void Obf00369(long var0);

   private static native void Obf00381(long var0);

   private static native void Obf00575(long var0);

   private static native void Obf00215(long var0);

   public static native void Obf00099(long var0, String var2);

   public static native void Obf00540(long var0);

   private static native void Obf00099(byte[] var0, long var1, String var3);

   private static native byte[] Obf00116(long var0, String var2);

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
