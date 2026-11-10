// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dev.jnic.kFRRwo.JNICLoader;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.fabricmc.loader.api.ModContainer;

@JNIC
public final class Obf00564 {
   private static Gson Obf00487;
   public static String Obf00120;
   public static String Obf00013;
   private static SecureRandom Obf00025;
   private static int Obf00112;
   private static int Obf00123;
   private static String Obf00233;
   private static int Obf00229;
   private static int Obf00576;
   private static Set<String> Obf00027;
   private static String Obf00208;
   private static Long Obf00135;
   private static String Obf00319;
   private static String Obf00492;
   private static Object Obf00022;
   public static int Obf00270;
   private static String[] Obf00174;
   private static String[] Obf00064;
   private static long[] Obf00008;
   private static Integer[] Obf00108;
   private static long Obf00240;

   private Obf00564() {
   }

   private static native String Obf00099(long var0);

   private static native File Obf00116(long var0);

   private static native JsonObject Obf00099(long var0, File var2);

   private static native void Obf00099(
      short var0, char var1, int var2, JsonObject var3
   ) throws Exception;

   private static native JsonObject Obf00552(long var0);

   private static native String Obf00383(long var0);

   private static native String Obf00558(long var0);

   private static native String Obf00099(long var0, String var2);

   private static native void Obf00224(byte var0, long var1);

   private static native void Obf00236(long var0);

   private static native ImageIcon Obf00389(long var0);

   private static native void Obf00099(
      String var0, long var1, String var3, boolean var4
   );

   private static native Obf00564$Obf00066 Obf00099(
      long var0, String var2, String var3
   );

   private static native void Obf00116(long var0, String var2, String var3);

   public static native void Obf00369(long var0);

   private static native void Obf00381(long var0);

   private static ClassLoader Obf00575() {
      return Thread.currentThread().getContextClassLoader();
   }

   private static native Map Obf00099(byte[] var0, long var1) throws IOException;

   private static native byte[] Obf00099(InputStream var0, long var1) throws IOException;

   private static native String Obf00215(long var0);

   private static native PublicKey Obf00540(int var0, short var1, int var2) throws Exception;

   private static native byte[] Obf00116(long var0, String var2) throws Exception;

   private static native byte[] Obf00099(short var0, int var1, char var2, URL var3);

   private static native String Obf00099(
      HttpsURLConnection var0, URL var1, Obf00599 var2, long var3
   ) throws Exception;

   private static native Obf00564$Obf00091 Obf00099(
      int var0,
      String var1,
      int var2,
      byte var3,
      Obf00564$Obf00107 var4,
      int var5
   );

   private static native boolean Obf00099(
      int var0,
      long var1,
      HttpsURLConnection var3,
      Obf00564$Obf00107 var4
   );

   private static native byte[] Obf00099(
      HttpsURLConnection var0,
      URL var1,
      long var2,
      Obf00599 var4,
      String var5,
      short var6
   ) throws Exception;

   private static native void Obf00099(long var0, int var2);

   private static native String Obf00116(long var0, InputStream var2);

   private static native boolean Obf00099(
      int var0, HttpsURLConnection var1, long var2, String var4
   );

   private static native String Obf00552(long var0, String var2);

   private static native JsonObject Obf00116(
      File var0, byte var1, int var2, int var3
   ) throws Exception;

   private static native void Obf00099(long var0, File var2, JsonObject var3) throws Exception;

   private static native JsonObject Obf00099(
      long var0, JsonObject var2, String var3
   );

   private static native JsonArray Obf00116(
      long var0, JsonObject var2, String var3
   );

   private static native String Obf00552(JsonObject var0, long var1, String var3);

   private static native String Obf00099(
      JsonObject var0, String var1, long var2, String var4
   );

   private static native Long Obf00383(JsonObject var0, String var1, long var2);

   private static native void Obf00552(String var0, long var1, String var3);

   private static native String Obf00256(char var0, int var1, short var2);

   private static native String Obf00383(
      int var0, int var1, byte var2, String var3
   );

   private static native HttpsURLConnection Obf00116(URL var0, long var1);

   private static native boolean Obf00099(
      HttpsURLConnection var0, int var1, char var2, short var3, String var4
   );

   private static native String Obf00558(long var0, String var2);

   private static native String Obf00099(X509Certificate var0, long var1);

   public static native String Obf00539(short var0, int var1, char var2);

   private static native void Obf00383(long var0, String var2, String var3);

   private static native void Obf00099(
      String var0,
      String var1,
      Obf00564$Obf00066[] var2,
      long var3,
      Object var5
   );

   private static native void Obf00099(
      boolean[] var0, JOptionPane var1, String[] var2, JDialog var3, ActionEvent var4
   );

   private static native void Obf00099(
      boolean var0, String var1, long var2, String var4
   );

   private static native boolean Obf00224(long var0, String var2);

   private static String Obf00099(ModContainer var0) {
      return var0.getMetadata().getVersion().getFriendlyString();
   }

   static native void $jnicClinit();

   private static native String Obf00099(int var0, int var1, int var2);

   private static native int Obf00099(int var0, long var1);

   public static native void $jnicLoader();

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }
}
