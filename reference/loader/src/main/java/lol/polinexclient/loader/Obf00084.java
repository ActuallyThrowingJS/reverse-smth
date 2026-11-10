// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import dev.jnic.kFRRwo.JNICLoader;
import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
import javax.swing.JOptionPane;

public class Obf00084 {
   private static String[] Obf00487;
   private static int Obf00120;
   private static int Obf00013;
   private static long Obf00025;
   private static int Obf00112;
   private static String[] Obf00123;
   private static String[] Obf00233;
   private static long[] Obf00229;
   private static Long[] Obf00576;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final long[] e;
   private static final Long[] f;

   public static native void Obf00099(long var0);

   private static void Obf00099(boolean var0, int var1, int var2, byte var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
      long var6 = var4 ^ 138444875337048L;
      Obf00453.Obf00099<"D">(
         var6, 4029314285481157898L, var4
      );
      StringBuilder var8 = new StringBuilder();
      if (var0) {
         var8.append(Obf00099(687593220 - 639, 687593220 - 8921, (int)var4));
         var8.append(Obf00099(687593220 - 637, 687593220 - 19808, (int)var4));
      } else {
         var8.append(Obf00099(687593220 - 640, -687593220 - -16729, (int)var4));
      }

      var8.append(Obf00099(687593220 - 614, 687593220 - 20358, (int)var4));
      var8.append(Obf00099(687593220 - 629, 687593220 + 7161, (int)var4));
      var8.append(Obf00099(687593220 - 623, -687593220 + -9332, (int)var4));
      var8.append(Obf00099(687593220 - 624, 687593220 - 2077, (int)var4));
      var8.append(Obf00099(687593220 - 643, 687593220 + 5039, (int)var4));
      var8.append(Obf00099(687593220 - 638, 687593220 - 16574, (int)var4));
      var8.append(Obf00099(687593220 - 642, -687593220 + -9636, (int)var4));
      var8.append(Obf00099(687593220 - 630, 687593220 - 22126, (int)var4));
      var8.append(Obf00099(687593220 - 628, 687593220 - 4023, (int)var4));
      var8.append(Obf00099(687593220 - 632, -687593220 - -17218, (int)var4));
      var8.append(Obf00099(687593220 - 634, 687593220 - 6316, (int)var4));
      var8.append(Obf00099(687593220 - 621, 687593220 - 7411, (int)var4));
      var8.append(Obf00099(687593220 - 613, 687593220 - 21434, (int)var4));
      JOptionPane.showMessageDialog(
         null,
         var8.toString(),
         Obf00099(687593220 - 620, 687593220 + 4026, (int)var4),
         0
      );
      System.exit(-1);
   }

   private static void Obf00116(long var0) {
      try {
         String var2 = System.getProperty(
               Obf00099(493216410 + 30512, 493216410 + (char)-32617, (int)var0),
               ""
            )
            .toLowerCase();
         String var3;
         if (var2.contains(
            Obf00099(493216410 + 30523, -493216410 + -23302, (int)var0)
         )) {
            var3 = Obf00099(493216410 + 30511, 493216410 + 23370, (int)var0);
         } else if (var2.contains(
            Obf00099(493216410 + 30505, -493216410 + -24139, (int)var0)
         )) {
            var3 = Obf00099(493216410 + 30504, 493216410 + 9850, (int)var0);
         } else if (var2.contains(
            Obf00099(493216410 + 30507, 493216410 + 11676, (int)var0)
         )) {
            var3 = Obf00099(
               493216410 + 30506, -493216410 + -((char)-32643), (int)var0
            );
         } else {
            var3 = Obf00099(493216410 + 30518, 493216410 + 16631, (int)var0);
         }

         String var4 = Obf00099(
               493216410 + 30503, -493216410 + -((char)-28164), (int)var0
            )
            + URLEncoder.encode(
               var3, Obf00099(493216410 + 30513, -493216410 + -12914, (int)var0)
            );
         Desktop.getDesktop().browse(new URI(var4));
      } catch (Exception var5) {
      }
   }

   private static long Obf00099(String var0, long var1) throws Exception {
      return 0L;
   }

   private static long Obf00099(byte[] var0, int var1) {
      long var2 = 0L;

      for (int var4 = var1; var4 < var1 + 4; var4++) {
         var2 = var2 << 8 | var0[var4] & 255;
      }

      return var2;
   }

   private static boolean Obf00099(int var0, short var1, short var2, Long var3) {
      long var4 = (long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48;
      return var3
         > Obf00453.Obf00099<"À">(
            5199523029695387168L, var4
         );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static void $jnicClinit() {
      long var19 = 109981690169313L;
      String[] var17 = new String[31];
      int var15 = 0;
      String var14;
      int var16 = (var14 = a(-10189, 15206)).length();
      char var13 = '\r';
      int var26 = -1;

      label77:
      while (true) {
         String var10000 = var14.substring(++var26, var26 + var13);
         int var10001 = -1;

         while (true) {
            char[] var45;
            label72: {
               char[] var29 = var10000.toCharArray();
               int var10003 = var29.length;
               int var18 = 0;
               var45 = var29;
               var10001 = var10003;
               char[] var53;
               int var10004;
               if (var10003 <= 1) {
                  var53 = var29;
                  var10004 = var18;
               } else {
                  var45 = var29;
                  var10001 = var10003;
                  if (var10003 <= var18) {
                     break label72;
                  }

                  var53 = var29;
                  var10004 = var18;
               }

               while (true) {
                  var53[var10004] = (char)(var53[var10004] ^ switch (var18 % 7) {
                     case 0 -> 79;
                     case 1 -> 8;
                     case 2 -> 7;
                     case 3 -> 23;
                     case 4 -> 16;
                     case 5 -> 82;
                     default -> 52;
                  });
                  var18++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var53 = var45;
                  } else {
                     if (var10001 <= var18) {
                        break;
                     }

                     var53 = var45;
                     var10004 = var18;
                  }
               }
            }

            String var60 = new String(var45).intern();
            switch (var10001) {
               case 0:
                  var17[var15++] = var60;
                  if ((var26 += var13) >= var16) {
                     Obf00123 = var17;
                     Obf00233 = new String[31];
                     long[] var6 = new long[3];
                     int var8 = 0;
                     String var9;
                     int var10 = (var9 = a(-10188, 11568)).length();
                     byte var7 = 0;

                     do {
                        int var36 = var7;
                        var7 += 8;
                        byte[] var11 = var9.substring(var36, var7).getBytes(a(-10191, 3475));
                        var36 = var8++;
                        long var64 = (
                              (var11[0] & 255L) << 56
                                 | (var11[1] & 255L) << 48
                                 | (var11[2] & 255L) << 40
                                 | (var11[3] & 255L) << 32
                                 | (var11[4] & 255L) << 24
                                 | (var11[5] & 255L) << 16
                                 | (var11[6] & 255L) << 8
                                 | var11[7] & 255L
                           )
                           ^ var19;
                        byte var61 = -1;
                        var6[var36] = var64;
                     } while (var7 < var10);

                     long[] var4 = new long[7];
                     int var1 = 0;
                     String var2;
                     int var3 = (var2 = a(-10192, -24235)).length();
                     byte var0 = 0;

                     do {
                        int var38 = var0;
                        var0 += 8;
                        byte[] var5 = var2.substring(var38, var0).getBytes(a(-10185, 6609));
                        var38 = var1++;
                        long var65 = (
                              (var5[0] & 255L) << 56
                                 | (var5[1] & 255L) << 48
                                 | (var5[2] & 255L) << 40
                                 | (var5[3] & 255L) << 32
                                 | (var5[4] & 255L) << 24
                                 | (var5[5] & 255L) << 16
                                 | (var5[6] & 255L) << 8
                                 | var5[7] & 255L
                           )
                           ^ var19;
                        byte var62 = -1;
                        var4[var38] = var65;
                     } while (var0 < var3);

                     var3 = (var2 = a(-10187, -19869)).length();
                     var0 = 0;

                     do {
                        int var40 = var0;
                        var0 += 8;
                        byte[] var24 = var2.substring(var40, var0).getBytes(a(-10185, 6609));
                        var40 = var1++;
                        long var66 = (
                              (var24[0] & 255L) << 56
                                 | (var24[1] & 255L) << 48
                                 | (var24[2] & 255L) << 40
                                 | (var24[3] & 255L) << 32
                                 | (var24[4] & 255L) << 24
                                 | (var24[5] & 255L) << 16
                                 | (var24[6] & 255L) << 8
                                 | var24[7] & 255L
                           )
                           ^ var19;
                        boolean var63 = false;
                        var4[var40] = var66;
                     } while (var0 < var3);

                     Obf00229 = var4;
                     Obf00576 = new Long[7];
                     Obf00453.Obf00099<"m">(
                        new String[]{
                           Obf00099(
                              -462677100 - -((char)-14070), 462677100 - (char)-17713, (int)var19
                           ),
                           Obf00099(
                              -462677100 - -((char)-14071), 462677100 - 26845, (int)var19
                           ),
                           Obf00099(
                              -462677100 - -((char)-14078), 462677100 - (char)-17751, (int)var19
                           ),
                           Obf00099(
                              -462677100 - -((char)-14089), -462677100 - -((char)-28073), (int)var19
                           )
                        },
                        560098719824897216L,
                        var19
                     );
                     Obf00453.Obf00099<"m">(
                        (int)var6[2], 574457485100619363L, var19
                     );
                     long var42 = 3628935600605721059L ^ var19;
                     Obf00453.Obf00099<"m">(
                        (int)var6[1], 575697968940811929L, var19
                     );
                     Obf00453.Obf00099<"m">(
                        Obf00099(16947, var42), 560743611785209005L, var19
                     );
                     Obf00453.Obf00099<"m">(
                        (int)var6[0], 575386985832094196L, var19
                     );
                     return;
                  }

                  var13 = var14.charAt(var26);
                  break;
               default:
                  var17[var15++] = var60;
                  if ((var26 += var13) < var16) {
                     var13 = var14.charAt(var26);
                     continue label77;
                  }

                  var16 = (var14 = a(-10186, 26742)).length();
                  var13 = '\f';
                  var26 = -1;
            }

            var10000 = var14.substring(++var26, var26 + var13);
            var10001 = 0;
         }
      }
   }

   private static String Obf00099(int var0, int var1, int var2) {
      int var3 = (var0 ^ var2 ^ -7318) & 65535;
      if (Obf00233[var3] == null) {
         char[] var4 = Obf00123[var3].toCharArray();

         short var5 = switch (var4[0] & 0xFF) {
            case 0 -> 118;
            case 1 -> 136;
            case 2 -> 242;
            case 3 -> 101;
            case 4 -> 42;
            case 5 -> 211;
            case 6 -> 202;
            case 7 -> 221;
            case 8 -> 109;
            case 9 -> 217;
            case 10 -> 106;
            case 11 -> 56;
            case 12 -> 128;
            case 13 -> 24;
            case 14 -> 135;
            case 15 -> 233;
            case 16 -> 73;
            case 17 -> 33;
            case 18 -> 167;
            case 19 -> 74;
            case 20 -> 210;
            case 21 -> 254;
            case 22 -> 91;
            case 23 -> 178;
            case 24 -> 93;
            case 25 -> 117;
            case 26 -> 196;
            case 27 -> 13;
            case 28 -> 19;
            case 29 -> 239;
            case 30 -> 63;
            case 31 -> 138;
            case 32 -> 14;
            case 33 -> 29;
            case 34 -> 68;
            case 35 -> 76;
            case 36 -> 160;
            case 37 -> 189;
            case 38 -> 230;
            case 39 -> 87;
            case 40 -> 187;
            case 41 -> 85;
            case 42 -> 171;
            case 43 -> 32;
            case 44 -> 7;
            case 45 -> 49;
            case 46 -> 20;
            case 47 -> 59;
            case 48 -> 111;
            case 49 -> 65;
            case 50 -> 105;
            case 51 -> 218;
            case 52 -> 44;
            case 53 -> 168;
            case 54 -> 4;
            case 55 -> 158;
            case 56 -> 46;
            case 57 -> 226;
            case 58 -> 200;
            case 59 -> 64;
            case 60 -> 172;
            case 61 -> 82;
            case 62 -> 146;
            case 63 -> 164;
            case 64 -> 15;
            case 65 -> 23;
            case 66 -> 51;
            case 67 -> 216;
            case 68 -> 191;
            case 69 -> 80;
            case 70 -> 62;
            case 71 -> 57;
            case 72 -> 223;
            case 73 -> 133;
            case 74 -> 120;
            case 75 -> 77;
            case 76 -> 100;
            case 77 -> 72;
            case 78 -> 36;
            case 79 -> 180;
            case 80 -> 250;
            case 81 -> 244;
            case 82 -> 143;
            case 83 -> 52;
            case 84 -> 27;
            case 85 -> 94;
            case 86 -> 176;
            case 87 -> 8;
            case 88 -> 50;
            case 89 -> 102;
            case 90 -> 206;
            case 91 -> 152;
            case 92 -> 240;
            case 93 -> 235;
            case 94 -> 157;
            case 95 -> 151;
            case 96 -> 22;
            case 97 -> 119;
            case 98 -> 205;
            case 99 -> 60;
            case 100 -> 190;
            case 101 -> 39;
            case 102 -> 162;
            case 103 -> 243;
            case 104 -> 110;
            case 105 -> 219;
            case 106 -> 54;
            case 107 -> 9;
            case 108 -> 154;
            case 109 -> 5;
            case 110 -> 38;
            case 111 -> 115;
            case 112 -> 237;
            case 113 -> 107;
            case 114 -> 96;
            case 115 -> 197;
            case 116 -> 26;
            case 117 -> 165;
            case 118 -> 53;
            case 119 -> 199;
            case 120 -> 155;
            case 121 -> 188;
            case 122 -> 236;
            case 123 -> 34;
            case 124 -> 150;
            case 125 -> 137;
            case 126 -> 220;
            case 127 -> 255;
            case 128 -> 113;
            case 129 -> 112;
            case 130 -> 12;
            case 131 -> 227;
            case 132 -> 92;
            case 133 -> 108;
            case 134 -> 149;
            case 135 -> 241;
            case 136 -> 18;
            case 137 -> 215;
            case 138 -> 83;
            case 139 -> 10;
            case 140 -> 16;
            case 141 -> 21;
            case 142 -> 238;
            case 143 -> 67;
            case 144 -> 132;
            case 145 -> 25;
            case 146 -> 156;
            case 147 -> 2;
            case 148 -> 225;
            case 149 -> 166;
            case 150 -> 6;
            case 151 -> 99;
            case 152 -> 182;
            case 153 -> 174;
            case 154 -> 30;
            case 155 -> 90;
            case 156 -> 198;
            case 157 -> 125;
            case 158 -> 47;
            case 159 -> 69;
            case 160 -> 209;
            case 161 -> 98;
            case 162 -> 131;
            case 163 -> 134;
            case 164 -> 11;
            case 165 -> 104;
            case 166 -> 195;
            case 167 -> 81;
            case 168 -> 173;
            case 169 -> 48;
            case 170 -> 1;
            case 171 -> 86;
            case 172 -> 61;
            case 173 -> 55;
            case 174 -> 232;
            case 175 -> 246;
            case 176 -> 193;
            case 177 -> 161;
            case 178 -> 31;
            case 179 -> 66;
            case 180 -> 103;
            case 181 -> 122;
            case 182 -> 186;
            case 183 -> 141;
            case 184 -> 184;
            case 185 -> 84;
            case 186 -> 201;
            case 187 -> 169;
            case 188 -> 253;
            case 189 -> 249;
            case 190 -> 192;
            case 191 -> 181;
            case 192 -> 70;
            case 193 -> 95;
            case 194 -> 194;
            case 195 -> 97;
            case 196 -> 214;
            case 197 -> 231;
            case 198 -> 204;
            case 199 -> 126;
            case 200 -> 251;
            case 201 -> 139;
            case 202 -> 252;
            case 203 -> 145;
            case 204 -> 3;
            case 205 -> 40;
            case 206 -> 185;
            case 207 -> 234;
            case 208 -> 41;
            case 209 -> 159;
            case 210 -> 28;
            case 211 -> 127;
            case 212 -> 147;
            case 213 -> 228;
            case 214 -> 123;
            case 215 -> 208;
            case 216 -> 0;
            case 217 -> 247;
            case 218 -> 142;
            case 219 -> 170;
            case 220 -> 37;
            case 221 -> 88;
            case 222 -> 78;
            case 223 -> 207;
            case 224 -> 121;
            case 225 -> 183;
            case 226 -> 224;
            case 227 -> 229;
            case 228 -> 17;
            case 229 -> 203;
            case 230 -> 75;
            case 231 -> 129;
            case 232 -> 140;
            case 233 -> 130;
            case 234 -> 248;
            case 235 -> 79;
            case 236 -> 163;
            case 237 -> 144;
            case 238 -> 153;
            case 239 -> 124;
            case 240 -> 245;
            case 241 -> 179;
            case 242 -> 71;
            case 243 -> 222;
            case 244 -> 175;
            case 245 -> 177;
            case 246 -> 148;
            case 247 -> 45;
            case 248 -> 35;
            case 249 -> 43;
            case 250 -> 116;
            case 251 -> 212;
            case 252 -> 58;
            case 253 -> 213;
            case 254 -> 114;
            default -> 89;
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

         Obf00233[var3] = new String(var4).intern();
      }

      return Obf00233[var3];
   }

   private static long Obf00099(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 13365) & 32767;
      if (Obf00576[var3] == null) {
         Obf00576[var3] = Obf00229[var3]
            ^ var1;
      }

      return Obf00576[var3];
   }

   public static native void $jnicLoader();

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[7];
      int var19 = 0;
      String var18 = "]nr¢ý©R=\\Ê9z\u0083c\u0007}\u0018uxj!\u0014\u00adiî\u0000\u0010óa;V\u007fB¤§&öÆ\u0019\u001f\u0084\n8ÚôøÀ\u0086\u0086±ÖÅ'¥\u000bµ`\u0091+$Íªo®yï]\u001b\u0093Ó«îÃ³Nfµ3÷07#\u001fVkh\u008aè@Yæ\u0005\n?\u008f\u0014RÜÓ\u0005\u001b¦\u0090";
      int var20 = "]nr¢ý©R=\\Ê9z\u0083c\u0007}\u0018uxj!\u0014\u00adiî\u0000\u0010óa;V\u007fB¤§&öÆ\u0019\u001f\u0084\n8ÚôøÀ\u0086\u0086±ÖÅ'¥\u000bµ`\u0091+$Íªo®yï]\u001b\u0093Ó«îÃ³Nfµ3÷07#\u001fVkh\u008aè@Yæ\u0005\n?\u008f\u0014RÜÓ\u0005\u001b¦\u0090"
         .length();
      char var17 = 16;
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
                     case 0 -> 7;
                     case 1 -> 55;
                     case 2 -> 60;
                     case 3 -> 81;
                     case 4 -> 71;
                     case 5 -> 3;
                     default -> 124;
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
                     b = new String[7];
                     long var8 = 8218949438427155616L;
                     long[] var14 = new long[14];
                     int var11 = 0;
                     String var12 = "«\u0083ºï\u0080Õ_Åm\u0011Í\u00032¾\u0015¡$\u00adp´\u009a©²7hl\u0012iN\u0083yFqF/o>ó\u0011»V/M»[¬æ¤)G\u001dAÒ îs\u0000\u0017Fù´mãÞt`Mb\u0096°Y¿P¤ç½îQò$#\u001d\u008dÒ\u0005\u007fÚ\u0018Ó\u008f\u0005Ù á\u009dy";
                     int var13 = "«\u0083ºï\u0080Õ_Åm\u0011Í\u00032¾\u0015¡$\u00adp´\u009a©²7hl\u0012iN\u0083yFqF/o>ó\u0011»V/M»[¬æ¤)G\u001dAÒ îs\u0000\u0017Fù´mãÞt`Mb\u0096°Y¿P¤ç½îQò$#\u001d\u008dÒ\u0005\u007fÚ\u0018Ó\u008f\u0005Ù á\u009dy"
                        .length();
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

                     var12 = "1ø^G{7Î\u0018È\u0099ßù\u0015\u008f<\u0011";
                     var13 = "1ø^G{7Î\u0018È\u0099ßù\u0015\u008f<\u0011".length();
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
                     d = new Integer[14];
                     long var0 = 7168394283480156441L;
                     long[] var6 = new long[23];
                     int var3 = 0;
                     String var4 = "?ð\u0080Kú\u0010\u00953~ä[1²5¯\u00ad;\u0015ßhê¤*Õf\u0007Ì&Ò\u000f.u>tfV\u0003\u001f-ZF¹Ðu\u0012Âj@u2¢QÍB\u00882\u0012ùK\u0000qY¦$TnSj.Nt\u001a_t\u0097íhû\u0007[F³ôÖ\fÙ®0HÌQóÕ\u0081\u0093pÎ§é>\u001ew¶¥ô\rM*\u001b\u0090\u0010\u0013(Ëô\u008ap\u008dwõX\u008aÛ@\u0000piHÜ¼SP\u0098ÛË\u0096\u0001â\u000b\r\u0085\u009cúöÇ\u0006¦´ûh\u001c\\\u009aw³\u0002mâµ\u0083\u000bá\u000bEe\u001bS\u008f";
                     int var5 = "?ð\u0080Kú\u0010\u00953~ä[1²5¯\u00ad;\u0015ßhê¤*Õf\u0007Ì&Ò\u000f.u>tfV\u0003\u001f-ZF¹Ðu\u0012Âj@u2¢QÍB\u00882\u0012ùK\u0000qY¦$TnSj.Nt\u001a_t\u0097íhû\u0007[F³ôÖ\fÙ®0HÌQóÕ\u0081\u0093pÎ§é>\u001ew¶¥ô\rM*\u001b\u0090\u0010\u0013(Ëô\u008ap\u008dwõX\u008aÛ@\u0000piHÜ¼SP\u0098ÛË\u0096\u0001â\u000b\r\u0085\u009cúöÇ\u0006¦´ûh\u001c\\\u009aw³\u0002mâµ\u0083\u000bá\u000bEe\u001bS\u008f"
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

                     var4 = "9\u0000>þÕ¹ò\u0089Ál8ÔÆøú\u000e";
                     var5 = "9\u0000>þÕ¹ò\u0089Ál8ÔÆøú\u000e".length();
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
                     f = new Long[23];
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

                  var18 = "ð~A1\u001d§º\u008cÔÄË+ã¹¾\u001cMjNp¿\u0088=\n\u0081¨ªokí\rà\u001e\f²\u0082d<8ÿ̨fÛY1\u008av\u0080¦\u009c[@Ó\u001a\u008f\u0006P5Ð\u0000\b\u000fAÎ`U9'\u0011{.31ÊÆY\u0088Óõ\u001a*=S\u0014<&)\u0018Ï\u0019ü\u0097\u0093I®J«\u008f\bØ_´¼ns·~nm\u0006Ø\u00ad©\u0082\u0002Î#*W7oîË\u000fÜàwÉ#\u0014\bo\u0081\u001f¹Ì°\u0014XÛ«ë\u009c\u007fÁ:\u009b\u0081ðDá9ÆÌ\u0082⇵¹!b¥(H7\u0016äAË\u0094rÔç5Âüù\u0014ê\u0084Ì8\fÔO\u0091=e\u0019Ã\u000b{ùù4³'êF\u0089Ç÷(ÚzDRC \u0011¦(\u0017\u0092éý2\u009b\u008d73\u0017\u0010ÿ]\u0012Ò\u000bà¯\u0083\u0006¿MlÈ\u0007\u001d·<£2\u0013\u0001«ü\bÏåFÕ\\é!Ýü\u001f\u0005W©\u0092a,§ÍR\u000eoÃ°\u008fT\u009dm×\u0098\u0098\u0013ñîÇåhu©x\u0018dOYºPÐÞu¯öÕ._|òU\u009e\u0013n×ª¯\u0015\u009b.tÑ¦D-Ï`¸\u001eècAãaÆ ßI\u0015\u0011©\u0097)xµ\u0085\u009f\t\u001b/\t&½ÐÎdËt#Y_F=\fwgJa\u00067m\u0082\u0016\u0001\u0099Õý\b¢½,tc\u0004\u009b¬öØ\u0019\u0017\rU\u0011*Îy\u0095su\u0094}}\u0085Ó\u0088®\\o|ù'\bkc\u0092kùd¸\u0086\u009aê*mÏ}\u009eÀI\u000fVÒþr(AC\u0094\u001bö\u0093·6jª·Á\\5êÐ\u001d¶ìæ'°\u001aÙ\u009aß]\u007fl\u009e\u0006¡hÚ\u00957T¯Ë\u0002£|ÅÅy?\u0088±PN§:\u008fã@2\u0089hªb=ÏËT¢V\u009e£\u008c-\u009f7E9Ò¡f\u009fæ¦\u001bÃ¼\u0098\u001d\u0091¨\u008d¨nÀRe\u0082Ü\u0080¢\u001aNZB©\u0018\u009e0äW#\u000eôÎg\u0013Ã7\u0000,\u009d@4£*\u0081µtcVÎ\u0096I\u000fà \u000b\u001dÃ\tOËÄP-+ó\u0004s\u0019ê\u001aîÐP%o ¨aH!\u0092ð=~=F\u0015´\u0090[ò\u0093\u0096Ð¶,_\u0098£0\u009bXïõª\u0016o/ï?ÿdý9DùÀþ3:ª\u0012q\u0091Ç\u001eÆú:Ø\u0086\u0083Ó]\u0083,\u0094à}\u009fK$ÌÐ\u0090¡a\u001e×\u009c\tµ.]h\u001dêÌ$Rö$}\u001b_E¡D\tãÓ\u009eýâjN;¶`§ÌÁòT\u0005õGf\u001eG\u0011f^Kry\u001bÒ\u0006\u0082<\u001a¤\u001f=¢÷\u0013¡}\u0094Mneá\u0085f~EËgy à{H|4\u0014\u007fpõ#ÉÏC\u00adLÇ,\u009fu\u00ad\u008bIDýs$°è\u0083DH±\u0016EðÏÂ<È.\u0014p¹\u001dµÞëcVíe4fÃⅫ^\u0081\u009e`U¶Pnd↧þÉÈ\u0089j³µØä\u009f¾ò}@½\u009aúAÜ÷½YuRk\\'q[CÂf6IsQ¼²È6ókN3$k,\u009d}\u0080%\u009e\u00adYÏ\u0080\u0098";
                  var20 = "ð~A1\u001d§º\u008cÔÄË+ã¹¾\u001cMjNp¿\u0088=\n\u0081¨ªokí\rà\u001e\f²\u0082d<8ÿ̨fÛY1\u008av\u0080¦\u009c[@Ó\u001a\u008f\u0006P5Ð\u0000\b\u000fAÎ`U9'\u0011{.31ÊÆY\u0088Óõ\u001a*=S\u0014<&)\u0018Ï\u0019ü\u0097\u0093I®J«\u008f\bØ_´¼ns·~nm\u0006Ø\u00ad©\u0082\u0002Î#*W7oîË\u000fÜàwÉ#\u0014\bo\u0081\u001f¹Ì°\u0014XÛ«ë\u009c\u007fÁ:\u009b\u0081ðDá9ÆÌ\u0082⇵¹!b¥(H7\u0016äAË\u0094rÔç5Âüù\u0014ê\u0084Ì8\fÔO\u0091=e\u0019Ã\u000b{ùù4³'êF\u0089Ç÷(ÚzDRC \u0011¦(\u0017\u0092éý2\u009b\u008d73\u0017\u0010ÿ]\u0012Ò\u000bà¯\u0083\u0006¿MlÈ\u0007\u001d·<£2\u0013\u0001«ü\bÏåFÕ\\é!Ýü\u001f\u0005W©\u0092a,§ÍR\u000eoÃ°\u008fT\u009dm×\u0098\u0098\u0013ñîÇåhu©x\u0018dOYºPÐÞu¯öÕ._|òU\u009e\u0013n×ª¯\u0015\u009b.tÑ¦D-Ï`¸\u001eècAãaÆ ßI\u0015\u0011©\u0097)xµ\u0085\u009f\t\u001b/\t&½ÐÎdËt#Y_F=\fwgJa\u00067m\u0082\u0016\u0001\u0099Õý\b¢½,tc\u0004\u009b¬öØ\u0019\u0017\rU\u0011*Îy\u0095su\u0094}}\u0085Ó\u0088®\\o|ù'\bkc\u0092kùd¸\u0086\u009aê*mÏ}\u009eÀI\u000fVÒþr(AC\u0094\u001bö\u0093·6jª·Á\\5êÐ\u001d¶ìæ'°\u001aÙ\u009aß]\u007fl\u009e\u0006¡hÚ\u00957T¯Ë\u0002£|ÅÅy?\u0088±PN§:\u008fã@2\u0089hªb=ÏËT¢V\u009e£\u008c-\u009f7E9Ò¡f\u009fæ¦\u001bÃ¼\u0098\u001d\u0091¨\u008d¨nÀRe\u0082Ü\u0080¢\u001aNZB©\u0018\u009e0äW#\u000eôÎg\u0013Ã7\u0000,\u009d@4£*\u0081µtcVÎ\u0096I\u000fà \u000b\u001dÃ\tOËÄP-+ó\u0004s\u0019ê\u001aîÐP%o ¨aH!\u0092ð=~=F\u0015´\u0090[ò\u0093\u0096Ð¶,_\u0098£0\u009bXïõª\u0016o/ï?ÿdý9DùÀþ3:ª\u0012q\u0091Ç\u001eÆú:Ø\u0086\u0083Ó]\u0083,\u0094à}\u009fK$ÌÐ\u0090¡a\u001e×\u009c\tµ.]h\u001dêÌ$Rö$}\u001b_E¡D\tãÓ\u009eýâjN;¶`§ÌÁòT\u0005õGf\u001eG\u0011f^Kry\u001bÒ\u0006\u0082<\u001a¤\u001f=¢÷\u0013¡}\u0094Mneá\u0085f~EËgy à{H|4\u0014\u007fpõ#ÉÏC\u00adLÇ,\u009fu\u00ad\u008bIDýs$°è\u0083DH±\u0016EðÏÂ<È.\u0014p¹\u001dµÞëcVíe4fÃⅫ^\u0081\u009e`U¶Pnd↧þÉÈ\u0089j³µØä\u009f¾ò}@½\u009aúAÜ÷½YuRk\\'q[CÂf6IsQ¼²È6ókN3$k,\u009d}\u0080%\u009e\u00adYÏ\u0080\u0098"
                     .length();
                  var17 = '(';
                  var32 = -1;
            }

            var10000 = var18.substring(++var32, var32 + var17);
            var10001 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -10187) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();

         short var4 = switch (var3[0] & 0xFF) {
            case 0 -> 58;
            case 1 -> 102;
            case 2 -> 239;
            case 3 -> 78;
            case 4 -> 110;
            case 5 -> 170;
            case 6 -> 117;
            case 7 -> 178;
            case 8 -> 163;
            case 9 -> 79;
            case 10 -> 69;
            case 11 -> 115;
            case 12 -> 172;
            case 13 -> 9;
            case 14 -> 213;
            case 15 -> 39;
            case 16 -> 193;
            case 17 -> 131;
            case 18 -> 159;
            case 19 -> 22;
            case 20 -> 197;
            case 21 -> 196;
            case 22 -> 26;
            case 23 -> 10;
            case 24 -> 198;
            case 25 -> 55;
            case 26 -> 97;
            case 27 -> 66;
            case 28 -> 247;
            case 29 -> 25;
            case 30 -> 99;
            case 31 -> 189;
            case 32 -> 50;
            case 33 -> 71;
            case 34 -> 223;
            case 35 -> 219;
            case 36 -> 188;
            case 37 -> 2;
            case 38 -> 90;
            case 39 -> 32;
            case 40 -> 174;
            case 41 -> 86;
            case 42 -> 37;
            case 43 -> 201;
            case 44 -> 61;
            case 45 -> 31;
            case 46 -> 88;
            case 47 -> 154;
            case 48 -> 176;
            case 49 -> 82;
            case 50 -> 216;
            case 51 -> 59;
            case 52 -> 185;
            case 53 -> 128;
            case 54 -> 67;
            case 55 -> 118;
            case 56 -> 34;
            case 57 -> 94;
            case 58 -> 107;
            case 59 -> 87;
            case 60 -> 74;
            case 61 -> 122;
            case 62 -> 104;
            case 63 -> 91;
            case 64 -> 182;
            case 65 -> 254;
            case 66 -> 140;
            case 67 -> 231;
            case 68 -> 160;
            case 69 -> 23;
            case 70 -> 204;
            case 71 -> 116;
            case 72 -> 121;
            case 73 -> 151;
            case 74 -> 153;
            case 75 -> 54;
            case 76 -> 81;
            case 77 -> 149;
            case 78 -> 157;
            case 79 -> 57;
            case 80 -> 33;
            case 81 -> 130;
            case 82 -> 5;
            case 83 -> 12;
            case 84 -> 72;
            case 85 -> 127;
            case 86 -> 11;
            case 87 -> 237;
            case 88 -> 186;
            case 89 -> 218;
            case 90 -> 43;
            case 91 -> 1;
            case 92 -> 80;
            case 93 -> 252;
            case 94 -> 221;
            case 95 -> 214;
            case 96 -> 228;
            case 97 -> 21;
            case 98 -> 63;
            case 99 -> 194;
            case 100 -> 244;
            case 101 -> 85;
            case 102 -> 240;
            case 103 -> 108;
            case 104 -> 243;
            case 105 -> 3;
            case 106 -> 101;
            case 107 -> 123;
            case 108 -> 14;
            case 109 -> 250;
            case 110 -> 208;
            case 111 -> 210;
            case 112 -> 150;
            case 113 -> 6;
            case 114 -> 144;
            case 115 -> 95;
            case 116 -> 191;
            case 117 -> 27;
            case 118 -> 236;
            case 119 -> 40;
            case 120 -> 15;
            case 121 -> 162;
            case 122 -> 68;
            case 123 -> 206;
            case 124 -> 105;
            case 125 -> 44;
            case 126 -> 211;
            case 127 -> 242;
            case 128 -> 235;
            case 129 -> 4;
            case 130 -> 129;
            case 131 -> 205;
            case 132 -> 48;
            case 133 -> 164;
            case 134 -> 93;
            case 135 -> 64;
            case 136 -> 13;
            case 137 -> 229;
            case 138 -> 248;
            case 139 -> 200;
            case 140 -> 75;
            case 141 -> 217;
            case 142 -> 113;
            case 143 -> 155;
            case 144 -> 253;
            case 145 -> 195;
            case 146 -> 192;
            case 147 -> 222;
            case 148 -> 175;
            case 149 -> 70;
            case 150 -> 125;
            case 151 -> 30;
            case 152 -> 209;
            case 153 -> 8;
            case 154 -> 18;
            case 155 -> 245;
            case 156 -> 60;
            case 157 -> 143;
            case 158 -> 138;
            case 159 -> 251;
            case 160 -> 184;
            case 161 -> 49;
            case 162 -> 246;
            case 163 -> 53;
            case 164 -> 92;
            case 165 -> 42;
            case 166 -> 171;
            case 167 -> 220;
            case 168 -> 230;
            case 169 -> 139;
            case 170 -> 152;
            case 171 -> 83;
            case 172 -> 38;
            case 173 -> 255;
            case 174 -> 17;
            case 175 -> 142;
            case 176 -> 136;
            case 177 -> 51;
            case 178 -> 232;
            case 179 -> 161;
            case 180 -> 41;
            case 181 -> 148;
            case 182 -> 111;
            case 183 -> 126;
            case 184 -> 106;
            case 185 -> 167;
            case 186 -> 156;
            case 187 -> 35;
            case 188 -> 29;
            case 189 -> 233;
            case 190 -> 146;
            case 191 -> 234;
            case 192 -> 181;
            case 193 -> 203;
            case 194 -> 73;
            case 195 -> 227;
            case 196 -> 109;
            case 197 -> 100;
            case 198 -> 114;
            case 199 -> 173;
            case 200 -> 135;
            case 201 -> 238;
            case 202 -> 20;
            case 203 -> 76;
            case 204 -> 120;
            case 205 -> 141;
            case 206 -> 187;
            case 207 -> 112;
            case 208 -> 24;
            case 209 -> 207;
            case 210 -> 28;
            case 211 -> 132;
            case 212 -> 134;
            case 213 -> 19;
            case 214 -> 56;
            case 215 -> 65;
            case 216 -> 46;
            case 217 -> 47;
            case 218 -> 145;
            case 219 -> 224;
            case 220 -> 124;
            case 221 -> 241;
            case 222 -> 0;
            case 223 -> 147;
            case 224 -> 16;
            case 225 -> 96;
            case 226 -> 199;
            case 227 -> 52;
            case 228 -> 62;
            case 229 -> 45;
            case 230 -> 225;
            case 231 -> 215;
            case 232 -> 183;
            case 233 -> 249;
            case 234 -> 177;
            case 235 -> 165;
            case 236 -> 180;
            case 237 -> 190;
            case 238 -> 98;
            case 239 -> 89;
            case 240 -> 212;
            case 241 -> 169;
            case 242 -> 119;
            case 243 -> 7;
            case 244 -> 166;
            case 245 -> 133;
            case 246 -> 179;
            case 247 -> 158;
            case 248 -> 103;
            case 249 -> 137;
            case 250 -> 36;
            case 251 -> 202;
            case 252 -> 226;
            case 253 -> 77;
            case 254 -> 84;
            default -> 168;
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 590;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 29885) & 32767;
      if (f[var3] == null) {
         f[var3] = e[var3] ^ var1;
      }

      return f[var3];
   }
}
