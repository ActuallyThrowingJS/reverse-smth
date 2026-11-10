// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

final class Obf00160$Obf00564
   extends URLConnection {
   private byte[] Obf00487;
   private static long[] Obf00120;
   private static Long[] Obf00013;
   private static final long[] a;
   private static final Long[] b;

   Obf00160$Obf00564(
      URL var1
   ) {
      super(var1);
   }

   @Override
   public void connect() throws IOException {
      long var1 = 127023695873377L;
      long var10001 = var1 ^ 74875602917809L;
      int var3 = (int)((var1 ^ 74875602917809L) >>> 32);
      int var4 = (int)((var1 ^ 74875602917809L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      if (Obf00453.Obf00099<"À">(
            4992481283781423924L, var1
         )
         != 0) {
         String var14 = this.getURL().getPath();
         Map var15 = Obf00453.Obf00099<"D">(
            var3, var4, (char)var5, 5003704640991290533L, var1
         );
         byte[] var16 = (byte[])var15;
      } else if (Obf00453.Obf00099<"Ü">(
            this, 4992644145227987555L, var1
         )
         == null) {
         String var7 = this.getURL().getPath();
         if (var7.startsWith("/")) {
            var7 = var7.substring(1);
         }

         var7 = URLDecoder.decode(var7, StandardCharsets.UTF_8.name());
         Map var8 = Obf00453.Obf00099<"D">(
            var3, var4, (char)var5, 5003704640991290533L, var1
         );
         byte[] var9 = var8 != null ? (byte[])var8.get(var7) : null;
         if (var9 == null) {
            throw new FileNotFoundException(var7);
         } else {
            Obf00453.Obf00099<"ì">(
               this, var9, 4992644145227987555L, var1
            );
         }
      }
   }

   @Override
   public InputStream getInputStream() throws IOException {
      long var1 = 78770358427215L;
      Obf00453.Obf00099<"à">(
         this, -7034227106934726314L, var1
      );
      return new ByteArrayInputStream(
         Obf00453.Obf00099<"Ü">(
            this, -7032551932694519475L, var1
         )
      );
   }

   @Override
   public int getContentLength() {
      long var1 = 51989511574934L;
      int var10000 = Obf00453.Obf00099<"À">(
         -7656251816987319357L, var1
      );
      long var4 = Obf00453.Obf00099<"à">(
         this, -7663054282960686887L, var1
      );
      if (var10000 != 0) {
         int var8 = (int)var4;
         Obf00453.Obf00099<"m">(
            !Obf00453.Obf00099<"À">(
               -7672878692305916775L, var1
            ),
            -7672878692305916775L,
            var1
         );
         return var8;
      } else {
         return var4 > Obf00099(12162, 4053482635906197550L ^ var1)
            ? -1
            : (int)var4;
      }
   }

   @Override
   public long getContentLengthLong() {
      long var1 = 22549169434903L;

      try {
         Obf00453.Obf00099<"à">(
            this, -1064762039224037874L, var1
         );
      } catch (IOException var4) {
         return Obf00099(3467, 6964278848080604839L ^ var1);
      }

      return Obf00453.Obf00099<"Ü">(
         this, -1063121774343762411L, var1
      ).length;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var8 = new String[2];
      int var12 = 0;
      String var11 = "5\u001b\u0093ýÄ\u0094\u0005fÄO¥ÁV {8\nD\bY\u0003RCd4v'";
      int var13 = "5\u001b\u0093ýÄ\u0094\u0005fÄO¥ÁV {8\nD\bY\u0003RCd4v'".length();
      char var10 = 16;
      int var9 = -1;

      while (true) {
         char[] var42;
         label61: {
            char[] var10001 = var11.substring(++var9, var9 + var10).toCharArray();
            int var10003 = var10001.length;
            int var14 = 0;
            var42 = var10001;
            int var30 = var10003;
            char[] var49;
            int var10004;
            if (var10003 <= 1) {
               var49 = var10001;
               var10004 = var14;
            } else {
               var42 = var10001;
               var30 = var10003;
               if (var10003 <= var14) {
                  break label61;
               }

               var49 = var10001;
               var10004 = var14;
            }

            while (true) {
               var49[var10004] = (char)(var49[var10004] ^ switch (var14 % 7) {
                  case 0 -> 13;
                  case 1 -> 91;
                  case 2 -> 22;
                  case 3 -> 46;
                  case 4 -> 106;
                  case 5 -> 123;
                  default -> 81;
               });
               var14++;
               if (var30 == 0) {
                  var10004 = var30;
                  var49 = var42;
               } else {
                  if (var30 <= var14) {
                     break;
                  }

                  var49 = var42;
                  var10004 = var14;
               }
            }
         }

         String var56 = new String(var42).intern();
         int var34 = -1;
         var8[var12++] = var56;
         if ((var9 += var10) >= var13) {
            long var0 = 2825157770100943084L;
            long[] var6 = new long[22];
            int var3 = 0;
            String var4 = "\"\u0097/\u009fà 5ÊË>Ã6$AÔQú¸OðÐ2;@\u0080æ`.qÄ\t¶&\u001e2\u009b\f#\b¢eÀ='\u0085ÖèÏ%Ù\bº\b\u001a°G\n\u001e3\u0080Ð}\u0098í\u0005Ì#¢Î©PvÀAVN^¨rµä\u000båü¬°\u0087Iÿç]'l¬\r-`3e\u0087ügJÿv^VÈ %ZÖz\u009a®æWûÜ\u0086K\u0007\u0017þ\u0005>¬\u0080Ø@DøºqRkRô¾Ï\u0003_¯øb\u0099?·§>&VÏ0N&\u0082\u001fÈ\u0004";
            int var5 = "\"\u0097/\u009fà 5ÊË>Ã6$AÔQú¸OðÐ2;@\u0080æ`.qÄ\t¶&\u001e2\u009b\f#\b¢eÀ='\u0085ÖèÏ%Ù\bº\b\u001a°G\n\u001e3\u0080Ð}\u0098í\u0005Ì#¢Î©PvÀAVN^¨rµä\u000båü¬°\u0087Iÿç]'l¬\r-`3e\u0087ügJÿv^VÈ %ZÖz\u009a®æWûÜ\u0086K\u0007\u0017þ\u0005>¬\u0080Ø@DøºqRkRô¾Ï\u0003_¯øb\u0099?·§>&VÏ0N&\u0082\u001fÈ\u0004"
               .length();
            byte var2 = 0;

            do {
               var34 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
               var34 = var3++;
               long var60 = (
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
               byte var57 = -1;
               var6[var34] = var60;
            } while (var2 < var5);

            var4 = "\u0012L?Ür¨!Ã\n\u001e\u00107\u0012\u0082P²";
            var5 = "\u0012L?Ür¨!Ã\n\u001e\u00107\u0012\u0082P²".length();
            var2 = 0;

            do {
               int var37 = var2;
               var2 += 8;
               byte[] var26 = var4.substring(var37, var2).getBytes("ISO-8859-1");
               var37 = var3++;
               long var61 = (
                     (var26[0] & 255L) << 56
                        | (var26[1] & 255L) << 48
                        | (var26[2] & 255L) << 40
                        | (var26[3] & 255L) << 32
                        | (var26[4] & 255L) << 24
                        | (var26[5] & 255L) << 16
                        | (var26[6] & 255L) << 8
                        | var26[7] & 255L
                  )
                  ^ var0;
               boolean var58 = false;
               var6[var37] = var61;
            } while (var2 < var5);

            a = var6;
            b = new Long[22];
            long var15 = 130155647931948L;
            long[] var21 = new long[2];
            int var18 = 0;
            String var19;
            int var20 = (var19 = var8[0]).length();
            byte var17 = 0;

            do {
               int var39 = var17;
               var17 += 8;
               byte[] var22 = var19.substring(var39, var17).getBytes(var8[1]);
               var39 = var18++;
               long var62 = (
                     (var22[0] & 255L) << 56
                        | (var22[1] & 255L) << 48
                        | (var22[2] & 255L) << 40
                        | (var22[3] & 255L) << 32
                        | (var22[4] & 255L) << 24
                        | (var22[5] & 255L) << 16
                        | (var22[6] & 255L) << 8
                        | var22[7] & 255L
                  )
                  ^ var15;
               byte var59 = -1;
               var21[var39] = var62;
            } while (var17 < var20);

            Obf00120 = var21;
            Obf00013 = new Long[2];
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static long Obf00099(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 4666) & 32767;
      if (Obf00013[var3] == null) {
         Obf00013[var3] = Obf00120[var3]
            ^ var1;
      }

      return Obf00013[var3];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18229) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
