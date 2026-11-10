package me.octo.client.utils.network.proxy;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Proxy {
   @NotNull
   private final String name;
   @NotNull
   private final ProxyType type;
   @NotNull
   private final String ip;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final String username;
   @NotNull
   private final String password;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 64589348646521L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   public Proxy(
      @NotNull String nameArg, @NotNull ProxyType typeArg, @NotNull String ipArg, int argument4Arg, @NotNull String usernameArg, @NotNull String passwordArg
   ) {
      long var7 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 107321404359651L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(typeArg, "type");
      Intrinsics.checkNotNullParameter(ipArg, "ip");
      Intrinsics.checkNotNullParameter(usernameArg, "username");
      Intrinsics.checkNotNullParameter(passwordArg, "password");
      super();
      this.name = nameArg;
      this.type = typeArg;
      this.ip = ipArg;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
      this.username = usernameArg;
      this.password = passwordArg;
   }

   @NotNull
   public final String getName() {
      return this.name;
   }

   @NotNull
   public final ProxyType getType() {
      return this.type;
   }

   @NotNull
   public final String getIp() {
      return this.ip;
   }

   public final int getPort() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final String getUsername() {
      return this.username;
   }

   @NotNull
   public final String getPassword() {
      return this.password;
   }

   public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final Proxy IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @NotNull ProxyType var2, @NotNull String var3, int var4, long var5, @NotNull String var7, short var8, @NotNull String var9
   ) {
      long var10 = (var5 << 16 | (long)var8 << 48 >>> 48) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(1545, 3649046512276083749L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(7431, 6795542785523257124L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(23743, 15630000299626142L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(30681, 4034587663895717360L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(17575, 1098125454039930504L ^ var10)
      );
      return new Proxy(var1, var2, var3, var4, var7, var9);
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 14418639272966L;
      String var3 = this.password;
      String var4 = this.username;
      int var5 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var6 = this.ip;
      ProxyType var7 = this.type;
      String var8 = this.name;
      return "Proxy(name=" + var8 + ", type=" + var7 + ", ip=" + var6 + ", port=" + var5 + ", username=" + var4 + ", password=" + var3 + ")";
   }

   @Override
   public int hashCode() {
      long var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 67242315549994L;
      boolean var10000 = ProxyType.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
      int var4 = this.name.hashCode();
      var4 = var4 * 31 + this.type.hashCode();
      boolean var3 = var10000;
      var4 = var4 * 31 + this.ip.hashCode();
      var4 = var4 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      var4 = var4 * 31 + this.username.hashCode();
      var4 = var4 * 31 + this.password.hashCode();

      try {
         if (!var3) {
            int[] var5 = new int[3];
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }

         return var4;
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 70841900009771L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = "k\u0015þÈØêÊ\u0017*6§( ªkä\u0010\u0089\u007f\u0089#\u0014z\u009e¢É1vïí=Hk e©x:¥>hóûÒÀlM\u0010S½´9áäz©.ø\u0089õ\u009aÛ9ý\u009fV\u0010Û~ÀMø\u00136ùÜ\u0006*°\u0097\u0017¨'\u0018ÚX\u0086\u0012¢§ÿ¢éãò¼o9ÿk-O\u008e×{¯û\u0091\u0010\bÒ\u009ap/ÎÖ\u008dßãuj\u0015[x\u001a ¸¨-SôÉ\u0018+'(*\nç\u0007c¢¯µË\u0010+ÉDàN2\u0013ÖmAÂ<\u0010û\u001f\u0090T4O¡\u0083\rÅ\u0084øÙ\u0011\u000eÏ\u0010\u0089\u008a3ñ÷øþz\u0019Ð3i\u009a\u0013@= eÑ\u0016ìò\u0013*5\u001a0ð0g\u000e^å«\tÑåÓv\u0097\u008fd\u0015 \u001cVC±t\u0010Sµ§±3\u0088úMæ}Sâ\u0081º®\u0081\u0010Å\u001c\u0083\u0002\u001d\u0094Á´DK}\\\u0098\u0091Ý;\u0010q¤\u009f\u0018\"\u009f&4Ý·\u009ad\u0083#È\u0088 aû\\Zeò\u0095}QÏÒïwfaP[ßö\u0013¸\u0085às\u0087ÙN\u009bÜÿ \u001c";
      int var8 = "k\u0015þÈØêÊ\u0017*6§( ªkä\u0010\u0089\u007f\u0089#\u0014z\u009e¢É1vïí=Hk e©x:¥>hóûÒÀlM\u0010S½´9áäz©.ø\u0089õ\u009aÛ9ý\u009fV\u0010Û~ÀMø\u00136ùÜ\u0006*°\u0097\u0017¨'\u0018ÚX\u0086\u0012¢§ÿ¢éãò¼o9ÿk-O\u008e×{¯û\u0091\u0010\bÒ\u009ap/ÎÖ\u008dßãuj\u0015[x\u001a ¸¨-SôÉ\u0018+'(*\nç\u0007c¢¯µË\u0010+ÉDàN2\u0013ÖmAÂ<\u0010û\u001f\u0090T4O¡\u0083\rÅ\u0084øÙ\u0011\u000eÏ\u0010\u0089\u008a3ñ÷øþz\u0019Ð3i\u009a\u0013@= eÑ\u0016ìò\u0013*5\u001a0ð0g\u000e^å«\tÑåÓv\u0097\u008fd\u0015 \u001cVC±t\u0010Sµ§±3\u0088úMæ}Sâ\u0081º®\u0081\u0010Å\u001c\u0083\u0002\u001d\u0094Á´DK}\\\u0098\u0091Ý;\u0010q¤\u009f\u0018\"\u009f&4Ý·\u009ad\u0083#È\u0088 aû\\Zeò\u0095}QÏÒïwfaP[ßö\u0013¸\u0085às\u0087ÙN\u009bÜÿ \u001c"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[16];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "t7KÙµµ6¦/ZÆ\u0085\u008a{¦Ï;Èã\u0080\u008byòïj\u0007\u009c·¼4^¤\u00183M\u0093\u001dÌ\\0Ü±ÄÝN\u0094z\u009a-ý*}®à\u008a/Ä";
                  var8 = "t7KÙµµ6¦/ZÆ\u0085\u008a{¦Ï;Èã\u0080\u008byòïj\u0007\u009c·¼4^¤\u00183M\u0093\u001dÌ\\0Ü±ÄÝN\u0094z\u009a-ý*}®à\u008a/Ä".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5690;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/utils/network/proxy/Proxy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
   }

   private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
                  0,
                  var0,
                  var3,
                  var1
               ),
               var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("me/octo/client/utils/network/proxy/Proxy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
