// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

@JNIC
public class Obf00160 extends URLStreamHandler {
   public static String Obf00487;
   public static int Obf00120;
   private static String[] Obf00013;
   private static String[] Obf00025;

   public static native URL Obf00099(long var0) throws IOException;

   @Override
   protected URLConnection openConnection(URL var1) {
      return new lol.polinexclient.loader.Obf00160$Obf00564(var1);
   }

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
