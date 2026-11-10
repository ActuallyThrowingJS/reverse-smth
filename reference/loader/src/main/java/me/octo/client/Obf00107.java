// Recovery view; aliases are not original names. Not verified to compile.
package me.octo.client;

import dev.jnic.kFRRwo.JNICLoader;
import lol.polinexclient.loader.JNIC;
import org.objectweb.asm.ClassWriter;

@JNIC
public class Obf00107 {
   public static int Obf00120;
   private static String[] Obf00487;
   private static String[] Obf00013;

   public static native void Obf00099(long var0) throws Exception;

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   private static native void $restoreCommVisit(ClassWriter var0, int var1, int var2, String var3, String var4, String var5, String[] var6);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
