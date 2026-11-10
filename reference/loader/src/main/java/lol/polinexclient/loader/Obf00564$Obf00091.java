// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

enum Obf00564$Obf00091 {
   UNHANDLED,
   RETRY,
   STOP;

   private static Obf00564$Obf00091[] Obf00487;
   private static final long[] a;
   private static final Long[] b;

   public static Obf00564$Obf00091[] values(
      long var0
   ) {
      return (Obf00564$Obf00091[])Obf00453.Obf00099<"À">(
            6845928603494353757L, var0
         )
         .clone();
   }

   private static Obf00564$Obf00091[] Obf00099(
      char var0, char var1, int var2
   ) {
      long var3 = (long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32;
      return new Obf00564$Obf00091[]{
         Obf00453.Obf00099<"À">(
            6845330536209772634L, var3
         ),
         Obf00453.Obf00099<"À">(
            6840834803245493103L, var3
         ),
         Obf00453.Obf00099<"À">(
            6844889617440523227L, var3
         )
      };
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      char[] var10001 = "L>ksNNbZsfOo^h\u001ez.`\u000bC".toCharArray();
      int var10003 = var10001.length;
      int var9 = 0;
      char[] var86 = var10001;
      int var53 = var10003;
      char[] var106;
      int var10004;
      char var10005;
      byte var10006;
      if (var10003 <= 1) {
         var106 = var10001;
         var10004 = var9;
         var10005 = var10001[var9];
         switch (var9 % 7) {
            case 0:
               var10006 = 27;
               break;
            case 1:
               var10006 = 44;
               break;
            case 2:
               var10006 = 45;
               break;
            case 3:
               var10006 = 61;
               break;
            case 4:
               var10006 = 71;
               break;
            case 5:
               var10006 = 31;
               break;
            default:
               var10006 = 106;
         }
      } else {
         var86 = var10001;
         var53 = var10003;
         if (var10003 <= var9) {
            String var127 = new String(var10001).intern();
            byte var71 = -1;
            String var37 = var127;
            long var22 = 7980204504774900389L;
            long[] var33 = new long[7];
            int var26 = 0;
            String var28 = "'wÐç¨\u0085-ÅA\u001e\u0086Î¡ð\u001fé8j\u0004^rh@@\u001eéð5°\b\u00146T\u008fÚæ\u0011wÜ\u0097";
            int var31 = "'wÐç¨\u0085-ÅA\u001e\u0086Î¡ð\u001fé8j\u0004^rh@@\u001eéð5°\b\u00146T\u008fÚæ\u0011wÜ\u0097".length();
            byte var24 = 0;

            do {
               byte var72 = var24;
               var24 += 8;
               byte[] var35 = var28.substring(var72, var24).getBytes("ISO-8859-1");
               int var73 = var26++;
               long var144 = (
                     (var35[0] & 255L) << 56
                        | (var35[1] & 255L) << 48
                        | (var35[2] & 255L) << 40
                        | (var35[3] & 255L) << 32
                        | (var35[4] & 255L) << 24
                        | (var35[5] & 255L) << 16
                        | (var35[6] & 255L) << 8
                        | var35[7] & 255L
                  )
                  ^ var22;
               byte var128 = -1;
               var33[var73] = var144;
            } while (var24 < var31);

            var28 = "d±ÿE\u00adp\u000eÏÜÛwó\u009f2I×";
            var31 = "d±ÿE\u00adp\u000eÏÜÛwó\u009f2I×".length();
            var24 = 0;

            do {
               byte var74 = var24;
               var24 += 8;
               byte[] var36 = var28.substring(var74, var24).getBytes("ISO-8859-1");
               int var75 = var26++;
               long var145 = (
                     (var36[0] & 255L) << 56
                        | (var36[1] & 255L) << 48
                        | (var36[2] & 255L) << 40
                        | (var36[3] & 255L) << 32
                        | (var36[4] & 255L) << 24
                        | (var36[5] & 255L) << 16
                        | (var36[6] & 255L) << 8
                        | var36[7] & 255L
                  )
                  ^ var22;
               boolean var129 = false;
               var33[var75] = var145;
            } while (var24 < var31);

            a = var33;
            b = new Long[7];
            long var47 = 52814124258985L;
            long var76 = var47 ^ 88861973792886L;
            int var48 = (int)((var47 ^ 88861973792886L) >>> 48);
            int var49 = (int)((var47 ^ 88861973792886L) << 16 >>> 48);
            int var50 = (int)(var76 << 32 >>> 32);
            String[] var38 = new String[3];
            int var44 = 0;
            String var43 = var37;
            int var45 = var37.length();
            char var42 = 4;
            int var40 = -1;

            while (true) {
               label120: {
                  var10001 = var43.substring(++var40, var40 + var42).toCharArray();
                  var10003 = var10001.length;
                  int var46 = 0;
                  var86 = var10001;
                  int var80 = var10003;
                  char[] var133;
                  if (var10003 <= 1) {
                     var133 = var10001;
                     var10004 = var46;
                  } else {
                     var86 = var10001;
                     var80 = var10003;
                     if (var10003 <= var46) {
                        break label120;
                     }

                     var133 = var10001;
                     var10004 = var46;
                  }

                  while (true) {
                     var133[var10004] = (char)(var133[var10004] ^ switch (var46 % 7) {
                        case 0 -> 4;
                        case 1 -> 70;
                        case 2 -> 9;
                        case 3 -> 30;
                        case 4 -> 5;
                        case 5 -> 54;
                        default -> 100;
                     });
                     var46++;
                     if (var80 == 0) {
                        var10004 = var80;
                        var133 = var86;
                     } else {
                        if (var80 <= var46) {
                           break;
                        }

                        var133 = var86;
                        var10004 = var46;
                     }
                  }
               }

               String var140 = new String(var86).intern();
               byte var84 = -1;
               var38[var44++] = var140;
               if ((var40 += var42) >= var45) {
                  UNHANDLED = new Obf00564$Obf00091(

                  );
                  RETRY = new Obf00564$Obf00091(

                  );
                  STOP = new Obf00564$Obf00091(

                  );
                  Obf00487 = Obf00453.Obf00099<"D">(
                     (char)var48, (char)var49, var50, -7587261846292812056L, var47
                  );
                  return;
               }

               var42 = var43.charAt(var40);
            }
         }

         var106 = var10001;
         var10004 = var9;
         var10005 = var10001[var9];
         switch (var9 % 7) {
            case 0:
               var10006 = 27;
               break;
            case 1:
               var10006 = 44;
               break;
            case 2:
               var10006 = 45;
               break;
            case 3:
               var10006 = 61;
               break;
            case 4:
               var10006 = 71;
               break;
            case 5:
               var10006 = 31;
               break;
            default:
               var10006 = 106;
         }
      }

      while (true) {
         var106[var10004] = (char)(var10005 ^ var10006);
         var9++;
         if (var53 == 0) {
            var10004 = var53;
            var106 = var86;
            var10005 = var86[var53];
            switch (var9 % 7) {
               case 0:
                  var10006 = 27;
                  break;
               case 1:
                  var10006 = 44;
                  break;
               case 2:
                  var10006 = 45;
                  break;
               case 3:
                  var10006 = 61;
                  break;
               case 4:
                  var10006 = 71;
                  break;
               case 5:
                  var10006 = 31;
                  break;
               default:
                  var10006 = 106;
            }
         } else {
            if (var53 <= var9) {
               String var113 = new String(var86).intern();
               byte var57 = -1;
               String var8 = var113;
               long var0 = 7980204504774900389L;
               long[] var6 = new long[7];
               int var3 = 0;
               String var4 = "'wÐç¨\u0085-ÅA\u001e\u0086Î¡ð\u001fé8j\u0004^rh@@\u001eéð5°\b\u00146T\u008fÚæ\u0011wÜ\u0097";
               int var5 = "'wÐç¨\u0085-ÅA\u001e\u0086Î¡ð\u001fé8j\u0004^rh@@\u001eéð5°\b\u00146T\u008fÚæ\u0011wÜ\u0097".length();
               byte var2 = 0;

               do {
                  byte var58 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var58, var2).getBytes("ISO-8859-1");
                  int var59 = var3++;
                  long var141 = (
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
                  byte var114 = -1;
                  var6[var59] = var141;
               } while (var2 < var5);

               var4 = "d±ÿE\u00adp\u000eÏÜÛwó\u009f2I×";
               var5 = "d±ÿE\u00adp\u000eÏÜÛwó\u009f2I×".length();
               var2 = 0;

               do {
                  byte var60 = var2;
                  var2 += 8;
                  byte[] var34 = var4.substring(var60, var2).getBytes("ISO-8859-1");
                  int var61 = var3++;
                  long var142 = (
                        (var34[0] & 255L) << 56
                           | (var34[1] & 255L) << 48
                           | (var34[2] & 255L) << 40
                           | (var34[3] & 255L) << 32
                           | (var34[4] & 255L) << 24
                           | (var34[5] & 255L) << 16
                           | (var34[6] & 255L) << 8
                           | var34[7] & 255L
                     )
                     ^ var0;
                  boolean var115 = false;
                  var6[var61] = var142;
               } while (var2 < var5);

               a = var6;
               b = new Long[7];
               long var17 = 52814124258985L;
               long var62 = var17 ^ 88861973792886L;
               int var19 = (int)((var17 ^ 88861973792886L) >>> 48);
               int var20 = (int)((var17 ^ 88861973792886L) << 16 >>> 48);
               int var21 = (int)(var62 << 32 >>> 32);
               String[] var10 = new String[3];
               int var14 = 0;
               String var13 = var8;
               int var15 = var8.length();
               char var12 = 4;
               int var11 = -1;

               while (true) {
                  label60: {
                     var10001 = var13.substring(++var11, var11 + var12).toCharArray();
                     var10003 = var10001.length;
                     int var16 = 0;
                     var86 = var10001;
                     int var66 = var10003;
                     char[] var119;
                     if (var10003 <= 1) {
                        var119 = var10001;
                        var10004 = var16;
                     } else {
                        var86 = var10001;
                        var66 = var10003;
                        if (var10003 <= var16) {
                           break label60;
                        }

                        var119 = var10001;
                        var10004 = var16;
                     }

                     while (true) {
                        var119[var10004] = (char)(var119[var10004] ^ switch (var16 % 7) {
                           case 0 -> 4;
                           case 1 -> 70;
                           case 2 -> 9;
                           case 3 -> 30;
                           case 4 -> 5;
                           case 5 -> 54;
                           default -> 100;
                        });
                        var16++;
                        if (var66 == 0) {
                           var10004 = var66;
                           var119 = var86;
                        } else {
                           if (var66 <= var16) {
                              break;
                           }

                           var119 = var86;
                           var10004 = var16;
                        }
                     }
                  }

                  String var126 = new String(var86).intern();
                  byte var70 = -1;
                  var10[var14++] = var126;
                  if ((var11 += var12) >= var15) {
                     UNHANDLED = new Obf00564$Obf00091(

                     );
                     RETRY = new Obf00564$Obf00091(

                     );
                     STOP = new Obf00564$Obf00091(

                     );
                     Obf00487 = Obf00453.Obf00099<"D">(
                        (char)var19, (char)var20, var21, -7587261846292812056L, var17
                     );
                     return;
                  }

                  var12 = var13.charAt(var11);
               }
            }

            var106 = var86;
            var10004 = var9;
            var10005 = var86[var9];
            switch (var9 % 7) {
               case 0:
                  var10006 = 27;
                  break;
               case 1:
                  var10006 = 44;
                  break;
               case 2:
                  var10006 = 45;
                  break;
               case 3:
                  var10006 = 61;
                  break;
               case 4:
                  var10006 = 71;
                  break;
               case 5:
                  var10006 = 31;
                  break;
               default:
                  var10006 = 106;
            }
         }
      }
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 1342) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
