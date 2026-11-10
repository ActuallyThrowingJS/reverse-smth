// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import com.mojang.text2speech.Narrator;
import dev.jnic.kFRRwo.JNICLoader;

public class Obf00091 {
   private static String Obf00487;
   public static boolean Obf00120;
   private static String[] Obf00013;
   private static String[] Obf00025;
   private static long Obf00112;
   private static long[] Obf00123;
   private static Long[] Obf00233;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;

   public native void Obf00099(long var1);

   public static native void Obf00116(long var0);

   public static void Obf00552(long var0) {
      Narrator.LOGGER
         .info(Obf00099(-1870631040 - -30755, 1870631040 - 9425, (int)var0));
   }

   public static native boolean Obf00383(long var0);

   public static native void Obf00558(long var0);

   public static native void Obf00099(String var0, int var1, int var2, char var3);

   public static Obf00091$Obf00107 Obf00099(
      int var0, String var1, short var2, Throwable var3, int var4
   ) {
      long var5 = (long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 35364110886447L;
      int var7 = (int)((var5 ^ 35364110886447L) >>> 48);
      int var8 = (int)((var5 ^ 35364110886447L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      return new Obf00091$Obf00107(
         (char)var7, var8, var1, var3, (short)var9
      );
   }

   public static Obf00091$Obf00107 Obf00116(
      char var0, short var1, int var2, String var3
   ) {
      long var4 = (long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32;
      long var10001 = var4 ^ 103461369564369L;
      int var6 = (int)((var4 ^ 103461369564369L) >>> 48);
      int var7 = (int)((var4 ^ 103461369564369L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return new Obf00091$Obf00107(
         (char)var6, var7, var3, null, (short)var8
      );
   }

   private static void Obf00224(long var0) {
      try {
         Thread.sleep(Obf00099(19734, 7855475965540852118L ^ var0));
      } catch (InterruptedException var3) {
      }

      while (true) {
         Runtime.getRuntime().halt(-1);
      }
   }

   private static void Obf00236(long var0) {
      long var2 = var0 ^ 136299491604845L;
      Obf00453.Obf00099<"D">(
         var2, -4810519800239416995L, var0
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void $jnicClinit() {
      long var13 = 62273239640092L;
      int var10000 = 8108;
      String[] var11 = new String[24];
      short var10001 = -15449;
      int var9 = 0;
      String var8 = ";\u000býb;b\u008a\nÏô<\u0080}\u0088¾;¹\u001e)W9\u001c¯É\u000b\u0083ÙÈó\u008dÔÿÌÛ\t±ü°¡äg8Û*¦ç^ÊUòúÍ{µy\u001d\u0083q\u000bÏ\u000eà\"êÌ\u0017\u007fY\u0000óN\u008eVv\u0013\u0014\u0012\u008e´YÜÕ!WÅÚ\u0011FÁ\u00873LA¾á\f\u0005\u0087Ç¸R\u0011Ɩ⣟⣴⡈⢺⠗⣄⣈⢁⠝⠇⠃⡺⡷⠡⣳⢘⢽⢯⢵⡺⣀⡊⡨⡆⢱⣊·⠯⠱⢨⡿⣈⢗⣩⡛⡦⡤⢝⡊⡪⡝⣁⢸⠖⡧⠁⢘⣙⠻⡒⣿⢝⢏⢱p⡀⣄⡜⡬⡤⣰⡵⠗⣔⣭⣪⡾⠠⠿⠍⢝⢾⣃⠆⠅⠰⢩⡼⠃⠄⡆\u008c⡇⠨⣱⡪⢱⠒⣗⠾⡋⣟⢾⢂⢔⠭⢲⡌⢄⢚⣘⢨⠺⢹⡎⡍⡹⠢Q⡆⣮⢾⣌⢧⢖⡈⣐⢆⡬⡊⠆⣯⣸⢂⢆⠠⠁⢲⣫⠞⣘⣝⠒⣁⣲½⠮⡷⡕⠊⣡⠻⢥⡑⢊⡂⠋⢶⡃⠞⡐⢔⡿⢯⢵⣛⣧⢸⢁⣥⠹⢄Ý⠛⣈⡡⢖⡚⣈⠾⣪⣞⡟⣐⡦⣰⣛⣑⡘⣉⡿⠮⢕⣊⣂⠚⠥⠧⢭ï⡁⠽⢔⢥⠝⣂⢦⠨⣛⢹⡹⢵⡆⠄⡇⡳⢃⢃⠦⡹⢎⣖⣗⠳⢏⡤E⢫⠗⡺⡞⡍⡄⣟⢍⢋⢾⣍⣱⠖⠈⠓⡷⡸⠌⡳⡱⡆⡍⠼⢥⡀⢼\u009d⣡⡹⡌⠠⠵⠆⠩⢶⠶⡑⣯⡿⢳⡜⠸⢒⡧⣅⠐⡣⠽⣣⡗⣍⠺⠃¬⣯⠬⣸⣵⠐⠂⠀⣏⡶⠈⡅⢻⡯⠪⢙⣜⡉⢔⡙⡑⡖⣚⣃⢱⢌⠿#⣥⠤⣊⢁⠩⠿⢙⣥⢼⠢⡫⠺⡛⢄⢒⡠⡛⡶⡤⢾⡏⢪⠙⢢⢢⢁U⢌⡧⠞⢚⣆⠣⣗⣘⣸⠈⢒⣰⡙⡊⡬⠔⡝⠟⣵⡨⣎⣎⠄⣒⣆⡟¦⣤⢧⢞⡻⢥⡪⣄⡂⠤⡊⠋⠠⣻⠳⣧⣭⢁⡍⠹⣓⠠⢊⠰⡇⠬⢞\u008e⢣⠑⣈⠠⢖⡲⣗⠾⣵⡻⢼⣠⣡⠙⡌⠡⠸⢇⠩⠦⢌⠹⢞⢛⣑⣼B\u0007-p8Ù\n\u0015l\u0003\u0085.È\u000bè\u0014¡ì\u0086b¨\u0082z\u0082×\u0014L\u001b\u007fë¥\u0083\u000e\u009d \u0083\u00admVâÁà\u001f+*¾\u000e!ÆÒP\u0010ì¹rï\u0000\r\u009f\u0006*\u001c\u008cPD\u008awìP% \u000b}7\u0084\u00950Þ\u00adr\u001dã\u0090¼!99 Û:\u000eÝ|P×²´\"úÞ®ZRßó\u0013$Ã\u0019¯.Ûè\u001añ-h\u000fÎ\u0082¼(\u0018d,\u0007½\u0096\u0094\u009d\u009ar\u008d\u0003´éÂ\u0003º÷\u0003\u0003Ô\t  ¢d\u008a\u009cD¿Ñ¥,\u0089\u0007\u0086e\u0089\u0005rtØIø\u0019Zn¢dü/©ç«áw\u0003>pë#¦\u001e\"K\u000e\u0080g\u000f\u00871ä\u008bwÔÃÞ½O±\u0080FØ\u009cu´Ûì\u009d<\u0083dj\u00183\u008e";
      int var10 = ";\u000býb;b\u008a\nÏô<\u0080}\u0088¾;¹\u001e)W9\u001c¯É\u000b\u0083ÙÈó\u008dÔÿÌÛ\t±ü°¡äg8Û*¦ç^ÊUòúÍ{µy\u001d\u0083q\u000bÏ\u000eà\"êÌ\u0017\u007fY\u0000óN\u008eVv\u0013\u0014\u0012\u008e´YÜÕ!WÅÚ\u0011FÁ\u00873LA¾á\f\u0005\u0087Ç¸R\u0011Ɩ⣟⣴⡈⢺⠗⣄⣈⢁⠝⠇⠃⡺⡷⠡⣳⢘⢽⢯⢵⡺⣀⡊⡨⡆⢱⣊·⠯⠱⢨⡿⣈⢗⣩⡛⡦⡤⢝⡊⡪⡝⣁⢸⠖⡧⠁⢘⣙⠻⡒⣿⢝⢏⢱p⡀⣄⡜⡬⡤⣰⡵⠗⣔⣭⣪⡾⠠⠿⠍⢝⢾⣃⠆⠅⠰⢩⡼⠃⠄⡆\u008c⡇⠨⣱⡪⢱⠒⣗⠾⡋⣟⢾⢂⢔⠭⢲⡌⢄⢚⣘⢨⠺⢹⡎⡍⡹⠢Q⡆⣮⢾⣌⢧⢖⡈⣐⢆⡬⡊⠆⣯⣸⢂⢆⠠⠁⢲⣫⠞⣘⣝⠒⣁⣲½⠮⡷⡕⠊⣡⠻⢥⡑⢊⡂⠋⢶⡃⠞⡐⢔⡿⢯⢵⣛⣧⢸⢁⣥⠹⢄Ý⠛⣈⡡⢖⡚⣈⠾⣪⣞⡟⣐⡦⣰⣛⣑⡘⣉⡿⠮⢕⣊⣂⠚⠥⠧⢭ï⡁⠽⢔⢥⠝⣂⢦⠨⣛⢹⡹⢵⡆⠄⡇⡳⢃⢃⠦⡹⢎⣖⣗⠳⢏⡤E⢫⠗⡺⡞⡍⡄⣟⢍⢋⢾⣍⣱⠖⠈⠓⡷⡸⠌⡳⡱⡆⡍⠼⢥⡀⢼\u009d⣡⡹⡌⠠⠵⠆⠩⢶⠶⡑⣯⡿⢳⡜⠸⢒⡧⣅⠐⡣⠽⣣⡗⣍⠺⠃¬⣯⠬⣸⣵⠐⠂⠀⣏⡶⠈⡅⢻⡯⠪⢙⣜⡉⢔⡙⡑⡖⣚⣃⢱⢌⠿#⣥⠤⣊⢁⠩⠿⢙⣥⢼⠢⡫⠺⡛⢄⢒⡠⡛⡶⡤⢾⡏⢪⠙⢢⢢⢁U⢌⡧⠞⢚⣆⠣⣗⣘⣸⠈⢒⣰⡙⡊⡬⠔⡝⠟⣵⡨⣎⣎⠄⣒⣆⡟¦⣤⢧⢞⡻⢥⡪⣄⡂⠤⡊⠋⠠⣻⠳⣧⣭⢁⡍⠹⣓⠠⢊⠰⡇⠬⢞\u008e⢣⠑⣈⠠⢖⡲⣗⠾⣵⡻⢼⣠⣡⠙⡌⠡⠸⢇⠩⠦⢌⠹⢞⢛⣑⣼B\u0007-p8Ù\n\u0015l\u0003\u0085.È\u000bè\u0014¡ì\u0086b¨\u0082z\u0082×\u0014L\u001b\u007fë¥\u0083\u000e\u009d \u0083\u00admVâÁà\u001f+*¾\u000e!ÆÒP\u0010ì¹rï\u0000\r\u009f\u0006*\u001c\u008cPD\u008awìP% \u000b}7\u0084\u00950Þ\u00adr\u001dã\u0090¼!99 Û:\u000eÝ|P×²´\"úÞ®ZRßó\u0013$Ã\u0019¯.Ûè\u001añ-h\u000fÎ\u0082¼(\u0018d,\u0007½\u0096\u0094\u009d\u009ar\u008d\u0003´éÂ\u0003º÷\u0003\u0003Ô\t  ¢d\u008a\u009cD¿Ñ¥,\u0089\u0007\u0086e\u0089\u0005rtØIø\u0019Zn¢dü/©ç«áw\u0003>pë#¦\u001e\"K\u000e\u0080g\u000f\u00871ä\u008bwÔÃÞ½O±\u0080FØ\u009cu´Ûì\u009d<\u0083dj\u00183\u008e"
         .length();
      char var7 = 7;
      int var17 = -1;

      label64:
      while (true) {
         String var18 = var8.substring(++var17, var17 + var7);
         int var22 = -1;

         while (true) {
            char[] var38;
            label59: {
               char[] var24 = var18.toCharArray();
               int var10003 = var24.length;
               int var12 = 0;
               var38 = var24;
               var22 = var10003;
               char[] var48;
               int var10004;
               if (var10003 <= 1) {
                  var48 = var24;
                  var10004 = var12;
               } else {
                  var38 = var24;
                  var22 = var10003;
                  if (var10003 <= var12) {
                     break label59;
                  }

                  var48 = var24;
                  var10004 = var12;
               }

               while (true) {
                  var48[var10004] = (char)(var48[var10004] ^ switch (var12 % 7) {
                     case 0 -> 13;
                     case 1 -> 51;
                     case 2 -> 46;
                     case 3 -> 90;
                     case 4 -> 71;
                     case 5 -> 68;
                     default -> 30;
                  });
                  var12++;
                  if (var22 == 0) {
                     var10004 = var22;
                     var48 = var38;
                  } else {
                     if (var22 <= var12) {
                        break;
                     }

                     var48 = var38;
                     var10004 = var12;
                  }
               }
            }

            String var55 = new String(var38).intern();
            switch (var22) {
               case 0:
                  var11[var9++] = var55;
                  if ((var17 += var7) >= var10) {
                     Obf00013 = var11;
                     Obf00025 = new String[24];
                     long var44 = 8608659557431785137L ^ var13;
                     int var31 = -1;
                     Obf00112 = var44;
                     long[] var4 = new long[2];
                     var10000 = (short)8109;
                     int var1 = 0;
                     var31 = (short)8526;
                     String var2 = "k\u009c\u0086Fãñ\u0006\u009am\u0004\u0015\u009asê\u001eµ";
                     int var3 = "k\u009c\u0086Fãñ\u0006\u009am\u0004\u0015\u009asê\u001eµ".length();
                     byte var0 = 0;

                     do {
                        int var33 = var0;
                        var0 += 8;
                        byte[] var5 = var2.substring(var33, var0).getBytes("ISO-8859-1");
                        var33 = var1++;
                        long var57 = (
                              (var5[0] & 255L) << 56
                                 | (var5[1] & 255L) << 48
                                 | (var5[2] & 255L) << 40
                                 | (var5[3] & 255L) << 32
                                 | (var5[4] & 255L) << 24
                                 | (var5[5] & 255L) << 16
                                 | (var5[6] & 255L) << 8
                                 | var5[7] & 255L
                           )
                           ^ var13;
                        byte var56 = -1;
                        var4[var33] = var57;
                     } while (var0 < var3);

                     Obf00123 = var4;
                     Obf00233 = new Long[2];
                     var10000 = -508813740 - -21444;
                     var31 = -508813740 - -24623;
                     int var45 = (int)var13;
                     String var15 = System.getProperty("os.name").toLowerCase();
                     Obf00487 = var15;
                     return;
                  }

                  var7 = var8.charAt(var17);
                  break;
               default:
                  var11[var9++] = var55;
                  if ((var17 += var7) < var10) {
                     var7 = var8.charAt(var17);
                     continue label64;
                  }

                  var8 = "mØ\u0090k\u0082h\"\u0002\bp©\u0090\u0083\u0019;ç°";
                  var10 = "mØ\u0090k\u0082h\"\u0002\bp©\u0090\u0083\u0019;ç°".length();
                  var7 = '\b';
                  var17 = -1;
            }

            var18 = var8.substring(++var17, var17 + var7);
            var22 = 0;
         }
      }
   }

   private static String Obf00099(int var0, int var1, int var2) {
      int var3 = (var0 ^ var2 ^ -26101) & 65535;
      if (Obf00025[var3] == null) {
         char[] var4 = Obf00013[var3].toCharArray();

         short var5 = switch (var4[0] & 0xFF) {
            case 0 -> 1;
            case 1 -> 108;
            case 2 -> 179;
            case 3 -> 208;
            case 4 -> 196;
            case 5 -> 88;
            case 6 -> 175;
            case 7 -> 141;
            case 8 -> 105;
            case 9 -> 190;
            case 10 -> 187;
            case 11 -> 118;
            case 12 -> 15;
            case 13 -> 95;
            case 14 -> 104;
            case 15 -> 243;
            case 16 -> 164;
            case 17 -> 209;
            case 18 -> 32;
            case 19 -> 47;
            case 20 -> 154;
            case 21 -> 101;
            case 22 -> 96;
            case 23 -> 89;
            case 24 -> 215;
            case 25 -> 65;
            case 26 -> 22;
            case 27 -> 195;
            case 28 -> 76;
            case 29 -> 77;
            case 30 -> 94;
            case 31 -> 78;
            case 32 -> 156;
            case 33 -> 131;
            case 34 -> 148;
            case 35 -> 102;
            case 36 -> 85;
            case 37 -> 61;
            case 38 -> 97;
            case 39 -> 36;
            case 40 -> 183;
            case 41 -> 218;
            case 42 -> 44;
            case 43 -> 14;
            case 44 -> 143;
            case 45 -> 165;
            case 46 -> 27;
            case 47 -> 168;
            case 48 -> 224;
            case 49 -> 234;
            case 50 -> 197;
            case 51 -> 213;
            case 52 -> 114;
            case 53 -> 5;
            case 54 -> 231;
            case 55 -> 120;
            case 56 -> 124;
            case 57 -> 28;
            case 58 -> 63;
            case 59 -> 207;
            case 60 -> 38;
            case 61 -> 159;
            case 62 -> 240;
            case 63 -> 210;
            case 64 -> 249;
            case 65 -> 248;
            case 66 -> 34;
            case 67 -> 25;
            case 68 -> 133;
            case 69 -> 129;
            case 70 -> 204;
            case 71 -> 150;
            case 72 -> 29;
            case 73 -> 128;
            case 74 -> 12;
            case 75 -> 18;
            case 76 -> 137;
            case 77 -> 144;
            case 78 -> 135;
            case 79 -> 221;
            case 80 -> 237;
            case 81 -> 52;
            case 82 -> 198;
            case 83 -> 112;
            case 84 -> 107;
            case 85 -> 119;
            case 86 -> 160;
            case 87 -> 54;
            case 88 -> 169;
            case 89 -> 122;
            case 90 -> 167;
            case 91 -> 162;
            case 92 -> 21;
            case 93 -> 103;
            case 94 -> 3;
            case 95 -> 62;
            case 96 -> 189;
            case 97 -> 153;
            case 98 -> 186;
            case 99 -> 203;
            case 100 -> 199;
            case 101 -> 58;
            case 102 -> 33;
            case 103 -> 200;
            case 104 -> 194;
            case 105 -> 51;
            case 106 -> 64;
            case 107 -> 71;
            case 108 -> 72;
            case 109 -> 79;
            case 110 -> 46;
            case 111 -> 115;
            case 112 -> 84;
            case 113 -> 87;
            case 114 -> 238;
            case 115 -> 9;
            case 116 -> 55;
            case 117 -> 134;
            case 118 -> 202;
            case 119 -> 92;
            case 120 -> 81;
            case 121 -> 100;
            case 122 -> 222;
            case 123 -> 19;
            case 124 -> 201;
            case 125 -> 11;
            case 126 -> 216;
            case 127 -> 212;
            case 128 -> 117;
            case 129 -> 252;
            case 130 -> 98;
            case 131 -> 93;
            case 132 -> 69;
            case 133 -> 155;
            case 134 -> 10;
            case 135 -> 116;
            case 136 -> 176;
            case 137 -> 191;
            case 138 -> 149;
            case 139 -> 227;
            case 140 -> 59;
            case 141 -> 255;
            case 142 -> 123;
            case 143 -> 225;
            case 144 -> 39;
            case 145 -> 86;
            case 146 -> 178;
            case 147 -> 49;
            case 148 -> 23;
            case 149 -> 136;
            case 150 -> 75;
            case 151 -> 90;
            case 152 -> 147;
            case 153 -> 161;
            case 154 -> 125;
            case 155 -> 185;
            case 156 -> 171;
            case 157 -> 251;
            case 158 -> 2;
            case 159 -> 67;
            case 160 -> 247;
            case 161 -> 253;
            case 162 -> 130;
            case 163 -> 26;
            case 164 -> 80;
            case 165 -> 188;
            case 166 -> 232;
            case 167 -> 139;
            case 168 -> 182;
            case 169 -> 31;
            case 170 -> 30;
            case 171 -> 132;
            case 172 -> 74;
            case 173 -> 17;
            case 174 -> 53;
            case 175 -> 145;
            case 176 -> 192;
            case 177 -> 57;
            case 178 -> 211;
            case 179 -> 13;
            case 180 -> 172;
            case 181 -> 6;
            case 182 -> 41;
            case 183 -> 126;
            case 184 -> 242;
            case 185 -> 241;
            case 186 -> 16;
            case 187 -> 70;
            case 188 -> 35;
            case 189 -> 4;
            case 190 -> 180;
            case 191 -> 111;
            case 192 -> 140;
            case 193 -> 157;
            case 194 -> 8;
            case 195 -> 220;
            case 196 -> 37;
            case 197 -> 56;
            case 198 -> 127;
            case 199 -> 223;
            case 200 -> 170;
            case 201 -> 226;
            case 202 -> 138;
            case 203 -> 230;
            case 204 -> 193;
            case 205 -> 45;
            case 206 -> 152;
            case 207 -> 233;
            case 208 -> 60;
            case 209 -> 0;
            case 210 -> 239;
            case 211 -> 244;
            case 212 -> 20;
            case 213 -> 217;
            case 214 -> 184;
            case 215 -> 166;
            case 216 -> 82;
            case 217 -> 205;
            case 218 -> 245;
            case 219 -> 236;
            case 220 -> 142;
            case 221 -> 163;
            case 222 -> 66;
            case 223 -> 177;
            case 224 -> 173;
            case 225 -> 228;
            case 226 -> 24;
            case 227 -> 48;
            case 228 -> 146;
            case 229 -> 174;
            case 230 -> 235;
            case 231 -> 68;
            case 232 -> 229;
            case 233 -> 42;
            case 234 -> 110;
            case 235 -> 151;
            case 236 -> 254;
            case 237 -> 106;
            case 238 -> 219;
            case 239 -> 83;
            case 240 -> 206;
            case 241 -> 73;
            case 242 -> 250;
            case 243 -> 181;
            case 244 -> 50;
            case 245 -> 113;
            case 246 -> 99;
            case 247 -> 109;
            case 248 -> 91;
            case 249 -> 121;
            case 250 -> 40;
            case 251 -> 246;
            case 252 -> 7;
            case 253 -> 158;
            case 254 -> 43;
            default -> 214;
         };
         int var10;
         int var6 = ((var10 = var1 ^ var2) & 0xFF) - var5;
         if (var6 < 0) {
            var6 += 256;
         }

         int var7 = ((var10 & 65535) >>> 8) - var5;
         if (var7 < 0) {
            var7 += 256;
         }

         for (int var8 = 0; var8 < var4.length; var8++) {
            int var9 = var8 % 2;
            char var10002 = var4[var8];
            if (var9 == 0) {
               var4[var8] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var4[var8]) & 0xFF;
            } else {
               var4[var8] = (char)(var10002 ^ var7);
               var7 = ((var7 >>> 3 | var7 << 5) ^ var4[var8]) & 0xFF;
            }
         }

         Obf00025[var3] = new String(var4).intern();
      }

      return Obf00025[var3];
   }

   private static long Obf00099(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 15322) & 32767;
      if (Obf00233[var3] == null) {
         Obf00233[var3] = Obf00123[var3]
            ^ var1;
      }

      return Obf00233[var3];
   }

   public static native void $jnicLoader();

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[4];
      int var19 = 0;
      String var18 = "Wy\u0001t¨\u0091\u0095\u007fð\u001aGX}Eª\\Ï\u009a¯\u008a\u0096\u00995/¤gt\u0081ö:Í×ÊrS6è»\u008cÄ0\u008e?\u0092«\u0089¨³\u0083~#äé¬\u0003ÝÜ\")\u0087°u\u00adÑIÐPGÉ?\u001e²X,uz\u009b>Á\u008b\u0095'\u0087\u008aY`\r\u0098¢IÈ{[^°_\u009d·¸o0\u0000Ź⢿⣉⣲⢿⡂⢍⢄⠿⠊⠸⢪⣐⠒⣿⡻⠴⠶⣴⠳⣭⡔⢑⡬⠞⠏⣍\u0082⣴⡳⢪⡯⡶⢠⢥⣛⡕⡹⣴⣛⢐⡶⠅⣓⠙⣛⢠⠢⢿⠅⠔⡕⡮⡳⠘3⠵⢏⣤⢨⡹⡎⣡⣁⡠⡶⣁⢶⣥⠋⡤⡷⣈⡪⠠⢹⢡⣊⠭⢐⠻⡡%⢶⡠⣛⠝⡬⣀⢗⠥⡥⣑⡦⣵⡧⠋⠋⡔⡒⢃⣯⡇⡎⢿⠋⡧⣉⡃h⠂⣋⢁⣕⢨⠐⡘⣜⢟⣌⢼⠨⠒⡭⢘⢟⠐⣷⣂⡝⣴⢯⣍⣕⡍⡎\u0084⠝⢧⡎⢖⢄⣴⢁⣅⣡⣒⠝⢵⣜⢡⢶⠷⢠⢾⡢⠀⣁⡎⣨⣐⡤⢔\u0019⣴⣛⣍⡯⡟⠲⢒⠔⠣⠠⣢⠧⠵⣃⣰⣖⡶⢥⣡⣢⡋⣐⢶⣯⣻⠠\u0000⠋⡆⣊⢽⠑⢕⡩⡖⣭⠈⠮⡩⠤⡹⠛⢱⠙⣢⢥⠧⢋⠲⢐⠯⣺⢇\u0095⣠⠞⣑⠾⠈⡅⣋⢺⢀⢼⡱⡅⠟⢞⡷⣻⢎⢼⢟⠸⡙⡆⣏⣠⡔⣻\f⡄⢅⡏⢯⡏⢝⠀⠲⡩⠡⡛⡶⢀⡑⠜⠼⢍⣫⡼⠩⣳⠸⣠⠃⣲⡁Å⣷⡜⡇⢁⡶⠯⢖⠻⡕⠊⠁⢚⣴⣿⣖⢽⡪⠲⠝⡇⣍⠚⠗⠠⢃⣕\u0018⣍⠳⣛⠔⢗⡥⠱⣛⡣⣱⡿⠴⣛⠩⢓⠂⠘⠉⠁⡎⣑⡀⣖⢤⠑⢵è⣝⣏⣫⠙⠵⢟⠆⠺⡟⣟⡯⡑⠢⣧⠌⢡⡮⡌⢝⡋⡟⢔⢲⠄⣥⠄R⢹⣉⢛⡂⡪⡥⣎⢠⣷⠞⠆⠑⠂⡣⡊⢂⢙⠞⡊⢧⠡⢾⡦⠁⢅⣠Ä⢤⢿⣝⢮⢯⡲⠵⠚⠗⢗⡟⡕⣐⠜⣝⣱⠐⣶⡇⡾⠻⡂⢍⢛⡧⠴´±çÈ\u001aô%\u0098Ðñ\u0017%U\u0017bÏNê\u008c\u0004<Ý\u0013½é'\u0016:\u0089\u0087R\u008c\u0003µÜêA\u0095\u000fÆöÕÉ>¹^\u0000ÉZ\u001fV-\u0015Xë9°kß®ëEÍ\u0096³T¤ë\u0017zi\u0096\"æDÒÿR7k\u008aä5ìôÜôÌ\rÍ\\èk} \u0011×·Ó\u001d'\u0095\u009b6Ë\u0000\u0083ä ÞJ\t»È%\u0004UMR4²*\fZü÷zÜ\u0087+:sP ÑÈ³\u0098\u001cÔ\u009cÃr{v-\u001b\u0014L \u007fò¸à!×Ü\u00adO v?LUSÇY\u0016\u008e\"@'\u0099dMJ\u0000¶·'¯¥Y×$ÃDZy\u0012ã\u0018ÊÆ\u008f\u0084.\u0099\u0003\\|zú\u007fD«W\u0098 \u008eØÏàOÓS=\u000e\u0010á\u007föõ\u009a\u0092\u009cnnJK¦þ¡µ`";
      int var20 = "Wy\u0001t¨\u0091\u0095\u007fð\u001aGX}Eª\\Ï\u009a¯\u008a\u0096\u00995/¤gt\u0081ö:Í×ÊrS6è»\u008cÄ0\u008e?\u0092«\u0089¨³\u0083~#äé¬\u0003ÝÜ\")\u0087°u\u00adÑIÐPGÉ?\u001e²X,uz\u009b>Á\u008b\u0095'\u0087\u008aY`\r\u0098¢IÈ{[^°_\u009d·¸o0\u0000Ź⢿⣉⣲⢿⡂⢍⢄⠿⠊⠸⢪⣐⠒⣿⡻⠴⠶⣴⠳⣭⡔⢑⡬⠞⠏⣍\u0082⣴⡳⢪⡯⡶⢠⢥⣛⡕⡹⣴⣛⢐⡶⠅⣓⠙⣛⢠⠢⢿⠅⠔⡕⡮⡳⠘3⠵⢏⣤⢨⡹⡎⣡⣁⡠⡶⣁⢶⣥⠋⡤⡷⣈⡪⠠⢹⢡⣊⠭⢐⠻⡡%⢶⡠⣛⠝⡬⣀⢗⠥⡥⣑⡦⣵⡧⠋⠋⡔⡒⢃⣯⡇⡎⢿⠋⡧⣉⡃h⠂⣋⢁⣕⢨⠐⡘⣜⢟⣌⢼⠨⠒⡭⢘⢟⠐⣷⣂⡝⣴⢯⣍⣕⡍⡎\u0084⠝⢧⡎⢖⢄⣴⢁⣅⣡⣒⠝⢵⣜⢡⢶⠷⢠⢾⡢⠀⣁⡎⣨⣐⡤⢔\u0019⣴⣛⣍⡯⡟⠲⢒⠔⠣⠠⣢⠧⠵⣃⣰⣖⡶⢥⣡⣢⡋⣐⢶⣯⣻⠠\u0000⠋⡆⣊⢽⠑⢕⡩⡖⣭⠈⠮⡩⠤⡹⠛⢱⠙⣢⢥⠧⢋⠲⢐⠯⣺⢇\u0095⣠⠞⣑⠾⠈⡅⣋⢺⢀⢼⡱⡅⠟⢞⡷⣻⢎⢼⢟⠸⡙⡆⣏⣠⡔⣻\f⡄⢅⡏⢯⡏⢝⠀⠲⡩⠡⡛⡶⢀⡑⠜⠼⢍⣫⡼⠩⣳⠸⣠⠃⣲⡁Å⣷⡜⡇⢁⡶⠯⢖⠻⡕⠊⠁⢚⣴⣿⣖⢽⡪⠲⠝⡇⣍⠚⠗⠠⢃⣕\u0018⣍⠳⣛⠔⢗⡥⠱⣛⡣⣱⡿⠴⣛⠩⢓⠂⠘⠉⠁⡎⣑⡀⣖⢤⠑⢵è⣝⣏⣫⠙⠵⢟⠆⠺⡟⣟⡯⡑⠢⣧⠌⢡⡮⡌⢝⡋⡟⢔⢲⠄⣥⠄R⢹⣉⢛⡂⡪⡥⣎⢠⣷⠞⠆⠑⠂⡣⡊⢂⢙⠞⡊⢧⠡⢾⡦⠁⢅⣠Ä⢤⢿⣝⢮⢯⡲⠵⠚⠗⢗⡟⡕⣐⠜⣝⣱⠐⣶⡇⡾⠻⡂⢍⢛⡧⠴´±çÈ\u001aô%\u0098Ðñ\u0017%U\u0017bÏNê\u008c\u0004<Ý\u0013½é'\u0016:\u0089\u0087R\u008c\u0003µÜêA\u0095\u000fÆöÕÉ>¹^\u0000ÉZ\u001fV-\u0015Xë9°kß®ëEÍ\u0096³T¤ë\u0017zi\u0096\"æDÒÿR7k\u008aä5ìôÜôÌ\rÍ\\èk} \u0011×·Ó\u001d'\u0095\u009b6Ë\u0000\u0083ä ÞJ\t»È%\u0004UMR4²*\fZü÷zÜ\u0087+:sP ÑÈ³\u0098\u001cÔ\u009cÃr{v-\u001b\u0014L \u007fò¸à!×Ü\u00adO v?LUSÇY\u0016\u008e\"@'\u0099dMJ\u0000¶·'¯¥Y×$ÃDZy\u0012ã\u0018ÊÆ\u008f\u0084.\u0099\u0003\\|zú\u007fD«W\u0098 \u008eØÏàOÓS=\u000e\u0010á\u007föõ\u009a\u0092\u009cnnJK¦þ¡µ`"
         .length();
      char var17 = 726;
      int var32 = -1;

      label81:
      while (true) {
         String var10000 = var18.substring(++var32, var32 + var17);
         int var10001 = -1;

         while (true) {
            char[] var52;
            label76: {
               char[] var35 = var10000.toCharArray();
               int var10003 = var35.length;
               int var22 = 0;
               var52 = var35;
               var10001 = var10003;
               char[] var60;
               int var10004;
               if (var10003 <= 1) {
                  var60 = var35;
                  var10004 = var22;
               } else {
                  var52 = var35;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label76;
                  }

                  var60 = var35;
                  var10004 = var22;
               }

               while (true) {
                  var60[var10004] = (char)(var60[var10004] ^ switch (var22 % 7) {
                     case 0 -> 98;
                     case 1 -> 88;
                     case 2 -> 6;
                     case 3 -> 88;
                     case 4 -> 49;
                     case 5 -> 88;
                     default -> 112;
                  });
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var60 = var52;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var60 = var52;
                     var10004 = var22;
                  }
               }
            }

            String var67 = new String(var52).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var67;
                  if ((var32 += var17) >= var20) {
                     a = var21;
                     b = new String[4];
                     long var8 = 4947955107750957645L;
                     long[] var14 = new long[6];
                     int var11 = 0;
                     String var12 = "}!\u00ad3P\u0082¢[)û\u001a\u0001]X4\u0013V\u0087¿ÉdPÞj\u0098héÁ?¡¿-";
                     int var13 = "}!\u00ad3P\u0082¢[)û\u001a\u0001]X4\u0013V\u0087¿ÉdPÞj\u0098héÁ?¡¿-".length();
                     byte var10 = 0;

                     do {
                        int var42 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var42, var10).getBytes("ISO-8859-1");
                        var42 = var11++;
                        long var72 = (
                              (var15[0] & 255L) << 56
                                 | (var15[1] & 255L) << 48
                                 | (var15[2] & 255L) << 40
                                 | (var15[3] & 255L) << 32
                                 | (var15[4] & 255L) << 24
                                 | (var15[5] & 255L) << 16
                                 | (var15[6] & 255L) << 8
                                 | var15[7] & 255L
                           )
                           ^ var8;
                        byte var68 = -1;
                        var14[var42] = var72;
                     } while (var10 < var13);

                     var12 = "\u0017\u0003î¶\u0089\u008e\u008a*EbC&ïæ9\f";
                     var13 = "\u0017\u0003î¶\u0089\u008e\u008a*EbC&ïæ9\f".length();
                     var10 = 0;

                     do {
                        int var44 = var10;
                        var10 += 8;
                        byte[] var30 = var12.substring(var44, var10).getBytes("ISO-8859-1");
                        var44 = var11++;
                        long var73 = (
                              (var30[0] & 255L) << 56
                                 | (var30[1] & 255L) << 48
                                 | (var30[2] & 255L) << 40
                                 | (var30[3] & 255L) << 32
                                 | (var30[4] & 255L) << 24
                                 | (var30[5] & 255L) << 16
                                 | (var30[6] & 255L) << 8
                                 | var30[7] & 255L
                           )
                           ^ var8;
                        boolean var69 = false;
                        var14[var44] = var73;
                     } while (var10 < var13);

                     c = var14;
                     d = new Integer[6];
                     long var0 = 5001830100707615006L;
                     long[] var6 = new long[10];
                     int var3 = 0;
                     String var4 = "åu\u0090xÍ\u0094¢\u0095\r=\u009cæ\u0016³åCx<rn¶<6«{\u0015áñøy¯\u001dC9Ôt\u001b\u008fÄ\u0096WÄ²*8\u0081\u0017Y%'\u0084H\u0080P\u0083\u000eWþðPAqrð";
                     int var5 = "åu\u0090xÍ\u0094¢\u0095\r=\u009cæ\u0016³åCx<rn¶<6«{\u0015áñøy¯\u001dC9Ôt\u001b\u008fÄ\u0096WÄ²*8\u0081\u0017Y%'\u0084H\u0080P\u0083\u000eWþðPAqrð"
                        .length();
                     byte var2 = 0;

                     do {
                        int var46 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
                        var46 = var3++;
                        long var74 = (
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
                        byte var70 = -1;
                        var6[var46] = var74;
                     } while (var2 < var5);

                     var4 = "\u0019+3jO¡\u008f\u0098ð\u008b<»\u0082+ \u0013";
                     var5 = "\u0019+3jO¡\u008f\u0098ð\u008b<»\u0082+ \u0013".length();
                     var2 = 0;

                     do {
                        int var48 = var2;
                        var2 += 8;
                        byte[] var26 = var4.substring(var48, var2).getBytes("ISO-8859-1");
                        var48 = var3++;
                        long var75 = (
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
                        boolean var71 = false;
                        var6[var48] = var75;
                     } while (var2 < var5);

                     e = var6;
                     f = new Long[10];
                     JNICLoader.init();
                     $jnicLoader();
                     $jnicClinit();
                     return;
                  }

                  var17 = var18.charAt(var32);
                  break;
               default:
                  var21[var19++] = var67;
                  if ((var32 += var17) < var20) {
                     var17 = var18.charAt(var32);
                     continue label81;
                  }

                  var18 = "×ïà\u0006íý\u001b±[N\u0098Ö_\u0017Jiï\n½#Ò#5\u0087ú\u009f·\u0096";
                  var20 = "×ïà\u0006íý\u001b±[N\u0098Ö_\u0017Jiï\n½#Ò#5\u0087ú\u009f·\u0096".length();
                  var17 = 17;
                  var32 = -1;
            }

            var10000 = var18.substring(++var32, var32 + var17);
            var10001 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 8108) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 141;
            case 1 -> 65;
            case 2 -> 106;
            case 3 -> 226;
            case 4 -> 219;
            case 5 -> 225;
            case 6 -> 190;
            case 7 -> 152;
            case 8 -> 123;
            case 9 -> 162;
            case 10 -> 154;
            case 11 -> 61;
            case 12 -> 234;
            case 13 -> 208;
            case 14 -> 20;
            case 15 -> 14;
            case 16 -> 214;
            case 17 -> 122;
            case 18 -> 227;
            case 19 -> 147;
            case 20 -> 71;
            case 21 -> 177;
            case 22 -> 131;
            case 23 -> 217;
            case 24 -> 98;
            case 25 -> 42;
            case 26 -> 145;
            case 27 -> 9;
            case 28 -> 67;
            case 29 -> 160;
            case 30 -> 181;
            case 31 -> 128;
            case 32 -> 58;
            case 33 -> 176;
            case 34 -> 187;
            case 35 -> 56;
            case 36 -> 62;
            case 37 -> 142;
            case 38 -> 5;
            case 39 -> 75;
            case 40 -> 235;
            case 41 -> 21;
            case 42 -> 7;
            case 43 -> 107;
            case 44 -> 43;
            case 45 -> 37;
            case 46 -> 77;
            case 47 -> 112;
            case 48 -> 233;
            case 49 -> 207;
            case 50 -> 10;
            case 51 -> 15;
            case 52 -> 86;
            case 53 -> 153;
            case 54 -> 224;
            case 55 -> 126;
            case 56 -> 155;
            case 57 -> 237;
            case 58 -> 91;
            case 59 -> 3;
            case 60 -> 35;
            case 61 -> 48;
            case 62 -> 229;
            case 63 -> 109;
            case 64 -> 204;
            case 65 -> 148;
            case 66 -> 238;
            case 67 -> 251;
            case 68 -> 239;
            case 69 -> 68;
            case 70 -> 199;
            case 71 -> 1;
            case 72 -> 243;
            case 73 -> 108;
            case 74 -> 165;
            case 75 -> 255;
            case 76 -> 127;
            case 77 -> 130;
            case 78 -> 192;
            case 79 -> 228;
            case 80 -> 200;
            case 81 -> 184;
            case 82 -> 139;
            case 83 -> 222;
            case 84 -> 69;
            case 85 -> 195;
            case 86 -> 138;
            case 87 -> 90;
            case 88 -> 73;
            case 89 -> 12;
            case 90 -> 173;
            case 91 -> 205;
            case 92 -> 103;
            case 93 -> 169;
            case 94 -> 2;
            case 95 -> 32;
            case 96 -> 174;
            case 97 -> 44;
            case 98 -> 115;
            case 99 -> 4;
            case 100 -> 132;
            case 101 -> 119;
            case 102 -> 105;
            case 103 -> 24;
            case 104 -> 40;
            case 105 -> 134;
            case 106 -> 242;
            case 107 -> 85;
            case 108 -> 170;
            case 109 -> 53;
            case 110 -> 114;
            case 111 -> 66;
            case 112 -> 223;
            case 113 -> 194;
            case 114 -> 244;
            case 115 -> 38;
            case 116 -> 120;
            case 117 -> 167;
            case 118 -> 202;
            case 119 -> 250;
            case 120 -> 218;
            case 121 -> 193;
            case 122 -> 6;
            case 123 -> 150;
            case 124 -> 46;
            case 125 -> 209;
            case 126 -> 47;
            case 127 -> 113;
            case 128 -> 60;
            case 129 -> 179;
            case 130 -> 137;
            case 131 -> 102;
            case 132 -> 220;
            case 133 -> 198;
            case 134 -> 178;
            case 135 -> 55;
            case 136 -> 36;
            case 137 -> 76;
            case 138 -> 70;
            case 139 -> 57;
            case 140 -> 33;
            case 141 -> 171;
            case 142 -> 87;
            case 143 -> 249;
            case 144 -> 236;
            case 145 -> 136;
            case 146 -> 172;
            case 147 -> 28;
            case 148 -> 16;
            case 149 -> 78;
            case 150 -> 26;
            case 151 -> 230;
            case 152 -> 175;
            case 153 -> 232;
            case 154 -> 100;
            case 155 -> 101;
            case 156 -> 82;
            case 157 -> 117;
            case 158 -> 206;
            case 159 -> 158;
            case 160 -> 240;
            case 161 -> 81;
            case 162 -> 72;
            case 163 -> 92;
            case 164 -> 188;
            case 165 -> 104;
            case 166 -> 213;
            case 167 -> 94;
            case 168 -> 246;
            case 169 -> 93;
            case 170 -> 97;
            case 171 -> 149;
            case 172 -> 143;
            case 173 -> 156;
            case 174 -> 49;
            case 175 -> 63;
            case 176 -> 252;
            case 177 -> 189;
            case 178 -> 110;
            case 179 -> 241;
            case 180 -> 186;
            case 181 -> 22;
            case 182 -> 166;
            case 183 -> 197;
            case 184 -> 144;
            case 185 -> 182;
            case 186 -> 111;
            case 187 -> 253;
            case 188 -> 84;
            case 189 -> 146;
            case 190 -> 211;
            case 191 -> 231;
            case 192 -> 39;
            case 193 -> 191;
            case 194 -> 51;
            case 195 -> 121;
            case 196 -> 52;
            case 197 -> 212;
            case 198 -> 215;
            case 199 -> 210;
            case 200 -> 183;
            case 201 -> 8;
            case 202 -> 64;
            case 203 -> 88;
            case 204 -> 31;
            case 205 -> 83;
            case 206 -> 96;
            case 207 -> 17;
            case 208 -> 254;
            case 209 -> 216;
            case 210 -> 95;
            case 211 -> 159;
            case 212 -> 50;
            case 213 -> 135;
            case 214 -> 25;
            case 215 -> 0;
            case 216 -> 245;
            case 217 -> 74;
            case 218 -> 41;
            case 219 -> 54;
            case 220 -> 247;
            case 221 -> 168;
            case 222 -> 129;
            case 223 -> 180;
            case 224 -> 185;
            case 225 -> 80;
            case 226 -> 18;
            case 227 -> 151;
            case 228 -> 59;
            case 229 -> 13;
            case 230 -> 23;
            case 231 -> 221;
            case 232 -> 29;
            case 233 -> 27;
            case 234 -> 19;
            case 235 -> 124;
            case 236 -> 163;
            case 237 -> 133;
            case 238 -> 203;
            case 239 -> 99;
            case 240 -> 79;
            case 241 -> 45;
            case 242 -> 34;
            case 243 -> 118;
            case 244 -> 116;
            case 245 -> 161;
            case 246 -> 140;
            case 247 -> 157;
            case 248 -> 89;
            case 249 -> 248;
            case 250 -> 201;
            case 251 -> 164;
            case 252 -> 11;
            case 253 -> 30;
            case 254 -> 196;
            default -> 125;
         };
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29755;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 18637) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }
}
