// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Obf00066 {
   private static Set<String> Obf00487;
   private static Map<String, byte[]> Obf00120;
   private static byte[] Obf00013;
   private static Map<String, byte[]> Obf00025;
   private static ClassLoader Obf00112;
   public static int Obf00123;
   private static String[] Obf00233;
   private static String[] Obf00229;
   private static final long[] a;
   private static final Integer[] b;
   private static final long[] c;
   private static final Long[] d;

   private Obf00066() {
   }

   public static Set Obf00099(int var0, int var1, short var2) {
      long var3 = (long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48;
      return Obf00453.Obf00099<"À">(
         -2189516693804451423L, var3
      );
   }

   public static Map Obf00116(int var0, int var1, char var2) {
      long var3 = (long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48;
      return Obf00453.Obf00099<"À">(
         341583635015902956L, var3
      );
   }

   public static void Obf00099(int var0, short var1, char var2, Map var3) {
      long var4 = (long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48;
      Obf00453.Obf00099<"m">(
         var3, 553652365359883775L, var4
      );
   }

   public static byte[] Obf00552(byte var0, long var1) {
      long var3 = (long)var0 << 56 | var1 << 8 >>> 8;
      return Obf00453.Obf00099<"À">(
         -6554551624522706970L, var3
      );
   }

   public static void Obf00099(byte[] var0, long var1) {
      Obf00453.Obf00099<"m">(
         var0, 6444840091859792799L, var1
      );
   }

   public static Map Obf00383(int var0, int var1, char var2) {
      long var3 = (long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48;
      return Obf00453.Obf00099<"À">(
         -7141523709288923604L, var3
      );
   }

   public static void Obf00116(Map var0, long var1) {
      Obf00453.Obf00099<"m">(
         var0, 4277417875906107796L, var1
      );
   }

   public static ClassLoader Obf00558(long var0) {
      return Obf00453.Obf00099<"À">(
         -5283125162515556450L, var0
      );
   }

   public static void Obf00099(long var0, ClassLoader var2) {
      Obf00453.Obf00099<"m">(
         var2, -7083074249130165117L, var0
      );
   }

   public static void Obf00224(long var0) {
      long var2 = var0 ^ 2762057455125L;
      Obf00453.Obf00099<"D">(
         var2, -1389532326934793538L, var0
      );
   }

   private static void Obf00236(long var0) {
      long var2 = var0 ^ 16463249103134L;
      boolean var4 = Obf00453.Obf00099<"À">(
         -395947665183900096L, var0
      );
      byte[] var5 = Obf00453.Obf00099<"À">(
         -378931040333131694L, var0
      );
      if (!var4) {
         if (var5 != null
            && Obf00453.Obf00099<"À">(
                  -381172496171705467L, var0
               )
               != null) {
            try {
               Obf00453.Obf00099<"D">(
                  var5, var2, -378800269856054374L, var0
               );
            } finally {
               Arrays.fill(var5, (byte)0);
               Obf00453.Obf00099<"m">(
                  null, -378931040333131694L, var0
               );
            }

            return;
         }

         System.out
            .println(
               Obf00099(
                  -621796080 - -((char)-24942), -621796080 - -((char)-13315), (int)var0
               )
            );
         if (var4) {
            return;
         }
      }

      label48: {
         byte[] var10000 = var5;
         if (var0 > 0L) {
            if (var5 == null) {
               break label48;
            }

            var10000 = var5;
         }

         Arrays.fill(var10000, (byte)0);
      }

      Obf00453.Obf00099<"m">(
         null, -378931040333131694L, var0
      );
   }

   private static void Obf00116(byte[] param0, long param1) {
      // UNRECOVERED: ZKM control flow; see reports/loader-decompiler-failures.json.
   }

   private static void Obf00099(byte[] param0, long param1, Map param3) {
      // UNRECOVERED: ZKM control flow; see reports/loader-decompiler-failures.json.
   }

   private static List Obf00552(byte[] param0, short param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/loader-decompiler-failures.json.
   }

   public static void Obf00099(String var0, long var1) {
      long var10001 = var1 ^ 38402314541451L;
      int var3 = (int)((var1 ^ 38402314541451L) >>> 32);
      int var4 = (int)((var1 ^ 38402314541451L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 109598747335760L;
      System.out
         .println(
            Obf00099(772919790 - (char)-16118, 772919790 - (char)-16013, (int)var1)
         );
      System.out
         .println(
            Obf00099(772919790 - (char)-16114, -772919790 - -26239, (int)var1)
               + var0
         );
      Obf00453.Obf00099<"D">(
         var6, 3023952730043244885L, var1
      );
      Runtime.getRuntime().halt(-1);
      System.exit(-1);
      Obf00453.Obf00099<"D">(
         Obf00099(772919790 - (char)-16115, -772919790 - -30165, (int)var1) + var0,
         var3,
         var4,
         (char)var5,
         3011879760229275467L,
         var1
      );
      System.exit(-1);
      Obf00453.Obf00099<"D">(
         var6, 3023952730043244885L, var1
      );
      throw new SecurityException(
         Obf00099(772919790 - (char)-16116, 772919790 - 28043, (int)var1) + var0
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var16 = new String[2];
      int var20 = 0;
      String var19 = "\u000e\u0094E\u009f<$jº\u0019è\u009bï\u0086åk o\u008f\u0081.\u0002æùE\u001f¬ô:\u0002\u0086XW#õ·íÜÚu1_\u0000\u0083\u009fq?±4îØ\u0015wD¾\u0080ç\"]èA\u0091ý[ÆÉ$¼\u00adÞ\u008aiÃ@þ_\u001aô\u001a\u008dC\u0014·ýMñFlVçÓeÁ\u0013pØ à9\u001bæ\u0003¡\u0013\u000e\u00850\u009dQü½ÔKk|uªÖZ]sÑ\u009f÷JOLÈ<\u009edº¿í\u001a\u0002ÄÝís\u0097 ¤Kô¦\u000blÿ4rÖ\u001a&so\u000eõMÊ\u0013T\u001f\u0000¬\"\\èúñO\u0098\nhrï¾\\»òµ³Ç¥ø\u0098ß»íZ \u0088~ \u0098\u0087\u0001¶\"v\rô§M\u0011!TÞzqGÌ¯x8åQôÅ\u0090°¡O±'4\u0087\u0085×Û\u0015ì¯²\u0002\u0090gwÌ2º\u0002Bõ\u007f¡°ã\u0084áùÄÐÆ`{ð\ná{F+µð]8\u001e\u009dêowé\u009e <Wßh×KÆèe\u00981\u008a\u0006Uø\u0005L`gäiw2vrï¯zFXL";
      int var21 = "\u000e\u0094E\u009f<$jº\u0019è\u009bï\u0086åk o\u008f\u0081.\u0002æùE\u001f¬ô:\u0002\u0086XW#õ·íÜÚu1_\u0000\u0083\u009fq?±4îØ\u0015wD¾\u0080ç\"]èA\u0091ý[ÆÉ$¼\u00adÞ\u008aiÃ@þ_\u001aô\u001a\u008dC\u0014·ýMñFlVçÓeÁ\u0013pØ à9\u001bæ\u0003¡\u0013\u000e\u00850\u009dQü½ÔKk|uªÖZ]sÑ\u009f÷JOLÈ<\u009edº¿í\u001a\u0002ÄÝís\u0097 ¤Kô¦\u000blÿ4rÖ\u001a&so\u000eõMÊ\u0013T\u001f\u0000¬\"\\èúñO\u0098\nhrï¾\\»òµ³Ç¥ø\u0098ß»íZ \u0088~ \u0098\u0087\u0001¶\"v\rô§M\u0011!TÞzqGÌ¯x8åQôÅ\u0090°¡O±'4\u0087\u0085×Û\u0015ì¯²\u0002\u0090gwÌ2º\u0002Bõ\u007f¡°ã\u0084áùÄÐÆ`{ð\ná{F+µð]8\u001e\u009dêowé\u009e <Wßh×KÆèe\u00981\u008a\u0006Uø\u0005L`gäiw2vrï¯zFXL"
         .length();
      char var18 = 260;
      int var17 = -1;

      while (true) {
         char[] var69;
         label116: {
            char[] var10001 = var19.substring(++var17, var17 + var18).toCharArray();
            int var10003 = var10001.length;
            int var22 = 0;
            var69 = var10001;
            int var46 = var10003;
            char[] var85;
            int var10004;
            if (var10003 <= 1) {
               var85 = var10001;
               var10004 = var22;
            } else {
               var69 = var10001;
               var46 = var10003;
               if (var10003 <= var22) {
                  break label116;
               }

               var85 = var10001;
               var10004 = var22;
            }

            while (true) {
               var85[var10004] = (char)(var85[var10004] ^ switch (var22 % 7) {
                  case 0 -> 111;
                  case 1 -> 95;
                  case 2 -> 17;
                  case 3 -> 54;
                  case 4 -> 45;
                  case 5 -> 34;
                  default -> 45;
               });
               var22++;
               if (var46 == 0) {
                  var10004 = var46;
                  var85 = var69;
               } else {
                  if (var46 <= var22) {
                     break;
                  }

                  var85 = var69;
                  var10004 = var22;
               }
            }
         }

         String var92 = new String(var69).intern();
         int var50 = -1;
         var16[var20++] = var92;
         if ((var17 += var18) >= var21) {
            long var8 = 594179216831273202L;
            long[] var14 = new long[16];
            int var11 = 0;
            String var12 = "¹\u0081~q\u000bt~\u0017\u0004ðwè<qbÓ8Hy\u001bqÌã\u008d\u008b'¸zI»ßÿO\u0000üÎgÁwð¡Ø\u0018_Â¼i¦RdìVÔîÓÂÑZ\u000bZ©d'Ý\u008cf\u0004B\u0091¢@;ºAòù¿î¨E\u0081\u008bÆÄ\u0091¤\u00ad\u0010YUþóX(x»\u000b\u00019ô!ùÎð#'UØvÄtª";
            int var13 = "¹\u0081~q\u000bt~\u0017\u0004ðwè<qbÓ8Hy\u001bqÌã\u008d\u008b'¸zI»ßÿO\u0000üÎgÁwð¡Ø\u0018_Â¼i¦RdìVÔîÓÂÑZ\u000bZ©d'Ý\u008cf\u0004B\u0091¢@;ºAòù¿î¨E\u0081\u008bÆÄ\u0091¤\u00ad\u0010YUþóX(x»\u000b\u00019ô!ùÎð#'UØvÄtª"
               .length();
            byte var10 = 0;

            do {
               var50 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var50, var10).getBytes("ISO-8859-1");
               var50 = var11++;
               long var108 = (
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
               byte var93 = -1;
               var14[var50] = var108;
            } while (var10 < var13);

            var12 = "@?ÇiésÝþ¿EyÄÂ\"\u009b\u001d";
            var13 = "@?ÇiésÝþ¿EyÄÂ\"\u009b\u001d".length();
            var10 = 0;

            do {
               int var53 = var10;
               var10 += 8;
               byte[] var39 = var12.substring(var53, var10).getBytes("ISO-8859-1");
               var53 = var11++;
               long var109 = (
                     (var39[0] & 255L) << 56
                        | (var39[1] & 255L) << 48
                        | (var39[2] & 255L) << 40
                        | (var39[3] & 255L) << 32
                        | (var39[4] & 255L) << 24
                        | (var39[5] & 255L) << 16
                        | (var39[6] & 255L) << 8
                        | var39[7] & 255L
                  )
                  ^ var8;
               boolean var94 = false;
               var14[var53] = var109;
            } while (var10 < var13);

            a = var14;
            b = new Integer[16];
            long var0 = 3372250368798371728L;
            long[] var6 = new long[40];
            int var3 = 0;
            String var4 = "\u001ahk\u0093«§\u008b¤ª\u0016\u0080Ä\u0080µoÈÎ\b\u0094?\u00adé~ÃUºú¦\u0005A¶ßùüOÛu\u0085\u009bÀ\u0001¸\u0092#\u0081§0Å\fZÕ\u009e\t¸\u0087\u0085Ð.Þ«(\t\u0087óí°&ðXøÏ\u0091\u0090\u0081kZ9\u0006ÆÜbß\u0081+\fÌ\\\\æ\u008b1HF\u0004\u008c\u001fo[\u008e\u0006\u0007¾\u001fe`È\u000ed\u0000÷É\u008cqä\u001c÷0É'¸ cËÊ\" k\u0094<+\u000e`ÃÏ\u00910ú~B\u000fÖÓ\u0085á\u0012ºâaõD\u008cõCt±\u0082äO\u001a9\u0010&\u009cÏ\u0088»å\"µò·(w\u000eö\u009cc\tUÅ&7\u0001æµ\u00ad.¥\u0010ß\u001a\u0012\u001dGK\u0016\u0099³ \u0086Þ\u0013\bæ\u0001Á\u009aÆ+Ð÷,\nw}\u001d\u001d\u0097\u001fMm\u009f¶¢©>\u0002Ç\u00adÑuÜ\u0016£ILJe*ï\u00977,dàm\u0096×ýoó\u0003gö,\u00ad>0e¦â\u0003h»îr¼o=O\u0081\ré\u0000}ë\u008ex\u000b\u008f±\u000f\u0010xút\u008b\u0001X3\u0007\u0085«¦´\\üÄÅ¶öB|\u0082";
            int var5 = "\u001ahk\u0093«§\u008b¤ª\u0016\u0080Ä\u0080µoÈÎ\b\u0094?\u00adé~ÃUºú¦\u0005A¶ßùüOÛu\u0085\u009bÀ\u0001¸\u0092#\u0081§0Å\fZÕ\u009e\t¸\u0087\u0085Ð.Þ«(\t\u0087óí°&ðXøÏ\u0091\u0090\u0081kZ9\u0006ÆÜbß\u0081+\fÌ\\\\æ\u008b1HF\u0004\u008c\u001fo[\u008e\u0006\u0007¾\u001fe`È\u000ed\u0000÷É\u008cqä\u001c÷0É'¸ cËÊ\" k\u0094<+\u000e`ÃÏ\u00910ú~B\u000fÖÓ\u0085á\u0012ºâaõD\u008cõCt±\u0082äO\u001a9\u0010&\u009cÏ\u0088»å\"µò·(w\u000eö\u009cc\tUÅ&7\u0001æµ\u00ad.¥\u0010ß\u001a\u0012\u001dGK\u0016\u0099³ \u0086Þ\u0013\bæ\u0001Á\u009aÆ+Ð÷,\nw}\u001d\u001d\u0097\u001fMm\u009f¶¢©>\u0002Ç\u00adÑuÜ\u0016£ILJe*ï\u00977,dàm\u0096×ýoó\u0003gö,\u00ad>0e¦â\u0003h»îr¼o=O\u0081\ré\u0000}ë\u008ex\u000b\u008f±\u000f\u0010xút\u008b\u0001X3\u0007\u0085«¦´\\üÄÅ¶öB|\u0082"
               .length();
            byte var2 = 0;

            do {
               int var55 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var55, var2).getBytes("ISO-8859-1");
               var55 = var3++;
               long var110 = (
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
               byte var95 = -1;
               var6[var55] = var110;
            } while (var2 < var5);

            var4 = "ÏJ à&\u008deYS\u009bOJ\u008b*;Í";
            var5 = "ÏJ à&\u008deYS\u009bOJ\u008b*;Í".length();
            var2 = 0;

            do {
               int var57 = var2;
               var2 += 8;
               byte[] var35 = var4.substring(var57, var2).getBytes("ISO-8859-1");
               var57 = var3++;
               long var111 = (
                     (var35[0] & 255L) << 56
                        | (var35[1] & 255L) << 48
                        | (var35[2] & 255L) << 40
                        | (var35[3] & 255L) << 32
                        | (var35[4] & 255L) << 24
                        | (var35[5] & 255L) << 16
                        | (var35[6] & 255L) << 8
                        | var35[7] & 255L
                  )
                  ^ var0;
               boolean var96 = false;
               var6[var57] = var111;
            } while (var2 < var5);

            c = var6;
            d = new Long[40];
            long var30 = b$recovered$54c83bf8bf11ae56(28424, 5621855732952709108L);
            String[] var28 = new String[11];
            int var26 = 0;
            String var25;
            int var27 = (var25 = var16[0]).length();
            char var24 = 14;
            int var42 = -1;

            label80:
            while (true) {
               String var10000 = var25.substring(++var42, var42 + var24);
               int var59 = -1;

               while (true) {
                  label75: {
                     char[] var61 = var10000.toCharArray();
                     int var97 = var61.length;
                     int var29 = 0;
                     var69 = var61;
                     var59 = var97;
                     char[] var100;
                     int var112;
                     if (var97 <= 1) {
                        var100 = var61;
                        var112 = var29;
                     } else {
                        var69 = var61;
                        var59 = var97;
                        if (var97 <= var29) {
                           break label75;
                        }

                        var100 = var61;
                        var112 = var29;
                     }

                     while (true) {
                        var100[var112] = (char)(var100[var112] ^ switch (var29 % 7) {
                           case 0 -> 13;
                           case 1 -> 25;
                           case 2 -> 125;
                           case 3 -> 21;
                           case 4 -> 28;
                           case 5 -> 11;
                           default -> 15;
                        });
                        var29++;
                        if (var59 == 0) {
                           var112 = var59;
                           var100 = var69;
                        } else {
                           if (var59 <= var29) {
                              break;
                           }

                           var100 = var69;
                           var112 = var29;
                        }
                     }
                  }

                  var92 = new String(var69).intern();
                  switch (var59) {
                     case 0:
                        var28[var26++] = var92;
                        if ((var42 += var24) >= var27) {
                           Obf00233 = var28;
                           Obf00229 = new String[11];
                           Obf00487 = new LinkedHashSet<>();
                           Obf00453.Obf00099<"m">(
                              new LinkedHashMap(), b$recovered$4ec88d842c49e34a(12416, 2825750514197489749L), var30
                           );
                           Obf00453.Obf00099<"m">(
                              null, b$recovered$498106d49590f2ca(31887, 9130363396725711995L), var30
                           );
                           Obf00453.Obf00099<"m">(
                              new LinkedHashMap(), b$recovered$944b6c10069506ad(13004, 7099864004259342886L), var30
                           );
                           Obf00453.Obf00099<"m">(
                              null, b$recovered$690398c8204f7909(9990, 7080293637105287151L), var30
                           );
                           return;
                        }

                        var24 = var25.charAt(var42);
                        break;
                     default:
                        var28[var26++] = var92;
                        if ((var42 += var24) < var27) {
                           var24 = var25.charAt(var42);
                           continue label80;
                        }

                        var27 = (var25 = var16[1]).length();
                        var24 = '\f';
                        var42 = -1;
                  }

                  var10000 = var25.substring(++var42, var42 + var24);
                  var59 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static String Obf00099(int var0, int var1, int var2) {
      int var3 = (var0 ^ var2 ^ 14641) & 65535;
      if (Obf00229[var3] == null) {
         char[] var4 = Obf00233[var3].toCharArray();

         short var5 = switch (var4[0] & 0xFF) {
            case 0 -> 227;
            case 1 -> 16;
            case 2 -> 24;
            case 3 -> 195;
            case 4 -> 120;
            case 5 -> 176;
            case 6 -> 108;
            case 7 -> 10;
            case 8 -> 63;
            case 9 -> 185;
            case 10 -> 165;
            case 11 -> 58;
            case 12 -> 169;
            case 13 -> 255;
            case 14 -> 60;
            case 15 -> 238;
            case 16 -> 17;
            case 17 -> 156;
            case 18 -> 183;
            case 19 -> 228;
            case 20 -> 250;
            case 21 -> 110;
            case 22 -> 147;
            case 23 -> 168;
            case 24 -> 149;
            case 25 -> 97;
            case 26 -> 20;
            case 27 -> 247;
            case 28 -> 28;
            case 29 -> 12;
            case 30 -> 198;
            case 31 -> 30;
            case 32 -> 135;
            case 33 -> 189;
            case 34 -> 219;
            case 35 -> 236;
            case 36 -> 131;
            case 37 -> 253;
            case 38 -> 98;
            case 39 -> 82;
            case 40 -> 164;
            case 41 -> 39;
            case 42 -> 173;
            case 43 -> 221;
            case 44 -> 65;
            case 45 -> 193;
            case 46 -> 93;
            case 47 -> 245;
            case 48 -> 89;
            case 49 -> 188;
            case 50 -> 124;
            case 51 -> 162;
            case 52 -> 229;
            case 53 -> 18;
            case 54 -> 196;
            case 55 -> 85;
            case 56 -> 249;
            case 57 -> 44;
            case 58 -> 35;
            case 59 -> 41;
            case 60 -> 127;
            case 61 -> 222;
            case 62 -> 8;
            case 63 -> 199;
            case 64 -> 13;
            case 65 -> 239;
            case 66 -> 6;
            case 67 -> 231;
            case 68 -> 81;
            case 69 -> 15;
            case 70 -> 225;
            case 71 -> 47;
            case 72 -> 143;
            case 73 -> 103;
            case 74 -> 49;
            case 75 -> 235;
            case 76 -> 116;
            case 77 -> 251;
            case 78 -> 254;
            case 79 -> 205;
            case 80 -> 7;
            case 81 -> 130;
            case 82 -> 51;
            case 83 -> 88;
            case 84 -> 132;
            case 85 -> 184;
            case 86 -> 48;
            case 87 -> 206;
            case 88 -> 40;
            case 89 -> 117;
            case 90 -> 1;
            case 91 -> 53;
            case 92 -> 104;
            case 93 -> 218;
            case 94 -> 121;
            case 95 -> 25;
            case 96 -> 111;
            case 97 -> 212;
            case 98 -> 74;
            case 99 -> 14;
            case 100 -> 181;
            case 101 -> 129;
            case 102 -> 211;
            case 103 -> 101;
            case 104 -> 5;
            case 105 -> 79;
            case 106 -> 96;
            case 107 -> 203;
            case 108 -> 144;
            case 109 -> 146;
            case 110 -> 138;
            case 111 -> 208;
            case 112 -> 213;
            case 113 -> 174;
            case 114 -> 83;
            case 115 -> 22;
            case 116 -> 109;
            case 117 -> 133;
            case 118 -> 91;
            case 119 -> 32;
            case 120 -> 232;
            case 121 -> 64;
            case 122 -> 61;
            case 123 -> 190;
            case 124 -> 9;
            case 125 -> 3;
            case 126 -> 136;
            case 127 -> 37;
            case 128 -> 214;
            case 129 -> 102;
            case 130 -> 23;
            case 131 -> 175;
            case 132 -> 38;
            case 133 -> 163;
            case 134 -> 31;
            case 135 -> 230;
            case 136 -> 233;
            case 137 -> 216;
            case 138 -> 45;
            case 139 -> 125;
            case 140 -> 86;
            case 141 -> 191;
            case 142 -> 2;
            case 143 -> 59;
            case 144 -> 71;
            case 145 -> 36;
            case 146 -> 11;
            case 147 -> 197;
            case 148 -> 242;
            case 149 -> 56;
            case 150 -> 128;
            case 151 -> 160;
            case 152 -> 145;
            case 153 -> 62;
            case 154 -> 204;
            case 155 -> 107;
            case 156 -> 139;
            case 157 -> 34;
            case 158 -> 70;
            case 159 -> 244;
            case 160 -> 226;
            case 161 -> 105;
            case 162 -> 201;
            case 163 -> 186;
            case 164 -> 72;
            case 165 -> 161;
            case 166 -> 237;
            case 167 -> 4;
            case 168 -> 234;
            case 169 -> 126;
            case 170 -> 142;
            case 171 -> 246;
            case 172 -> 106;
            case 173 -> 123;
            case 174 -> 224;
            case 175 -> 100;
            case 176 -> 66;
            case 177 -> 180;
            case 178 -> 157;
            case 179 -> 220;
            case 180 -> 50;
            case 181 -> 67;
            case 182 -> 112;
            case 183 -> 68;
            case 184 -> 215;
            case 185 -> 243;
            case 186 -> 75;
            case 187 -> 99;
            case 188 -> 210;
            case 189 -> 177;
            case 190 -> 77;
            case 191 -> 170;
            case 192 -> 29;
            case 193 -> 154;
            case 194 -> 192;
            case 195 -> 118;
            case 196 -> 46;
            case 197 -> 148;
            case 198 -> 166;
            case 199 -> 122;
            case 200 -> 76;
            case 201 -> 202;
            case 202 -> 209;
            case 203 -> 248;
            case 204 -> 26;
            case 205 -> 113;
            case 206 -> 241;
            case 207 -> 179;
            case 208 -> 42;
            case 209 -> 43;
            case 210 -> 94;
            case 211 -> 187;
            case 212 -> 0;
            case 213 -> 141;
            case 214 -> 140;
            case 215 -> 152;
            case 216 -> 155;
            case 217 -> 57;
            case 218 -> 158;
            case 219 -> 252;
            case 220 -> 87;
            case 221 -> 114;
            case 222 -> 240;
            case 223 -> 21;
            case 224 -> 178;
            case 225 -> 73;
            case 226 -> 119;
            case 227 -> 159;
            case 228 -> 153;
            case 229 -> 194;
            case 230 -> 115;
            case 231 -> 200;
            case 232 -> 78;
            case 233 -> 33;
            case 234 -> 167;
            case 235 -> 69;
            case 236 -> 52;
            case 237 -> 134;
            case 238 -> 27;
            case 239 -> 84;
            case 240 -> 55;
            case 241 -> 172;
            case 242 -> 150;
            case 243 -> 171;
            case 244 -> 217;
            case 245 -> 95;
            case 246 -> 54;
            case 247 -> 137;
            case 248 -> 223;
            case 249 -> 151;
            case 250 -> 80;
            case 251 -> 92;
            case 252 -> 182;
            case 253 -> 90;
            case 254 -> 207;
            default -> 19;
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

         Obf00229[var3] = new String(var4).intern();
      }

      return Obf00229[var3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3836;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   private static long b$recovered$54c83bf8bf11ae56(int var0, long var1) {
      var1 = 5621855732952709108L;
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   private static long b$recovered$4ec88d842c49e34a(int var0, long var1) {
      var1 = 2825750514197489749L;
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   private static long b$recovered$498106d49590f2ca(int var0, long var1) {
      var1 = 9130363396725711995L;
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   private static long b$recovered$944b6c10069506ad(int var0, long var1) {
      var1 = 7099864004259342886L;
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   private static long b$recovered$690398c8204f7909(int var0, long var1) {
      var1 = 7080293637105287151L;
      int var3 = (var0 ^ (int)var1 ^ 22769) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }

   public static void Obf00224$recovered$05513473cae59a3a(long var0) {
      var0 = 21851946675329L;
      long var2 = var0 ^ 2762057455125L;
      Obf00236$recovered$a35241ef3c05d2d9(var2);
   }

   // Caller-proven context: incoming key is 19090507889300L.
   // CFR recovery, normalized and compared against bytecode in isolated JVM fixtures.
   private static void Obf00236$recovered$a35241ef3c05d2d9(long ignoredIncomingKey) {
       long loadKey = 19090507889300L ^ 16463249103134L;
       boolean skip = lol.polinexclient.loader.Obf00091.Obf00120;
       byte[] prepared = Obf00013;
       if (!skip && prepared != null && Obf00112 != null) {
           try {
               Obf00116$recovered$8eae88b1c14cdf6b(prepared, loadKey);
           } finally {
               java.util.Arrays.fill(prepared, (byte) 0);
               Obf00013 = null;
           }
           return;
       }
       if (!skip) {
           System.out.println("Mod not properly prepared, cannot initialize");
       }
       if (prepared != null) {
           java.util.Arrays.fill(prepared, (byte) 0);
       }
       Obf00013 = null;
   }

   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void Obf00116$recovered$8eae88b1c14cdf6b(byte[] var0, long var1) {
      var1 = 34797773497226L;
      long var3 = var1 ^ 135032200923953L;
      int var5 = (int)((var1 ^ 130058706107545L) >>> 48);
      long var6 = (var1 ^ 130058706107545L) << 16 >>> 16;
      long var8 = var1 ^ 115332001598041L;
      boolean var10 = Obf00091.Obf00120;

      try {
         int var51 = -51510510 + -26707;
         int var58 = 51510510 + 8752;
         int var60 = (int)var1;
         Class var11 = Obf00112.loadClass("me.octo.client.Polinex");
         Object var12 = var11.getDeclaredConstructor().newInstance();
         var51 = -51510510 + -26720;
         var58 = -51510510 + -12088;
         var60 = (int)var1;
         Method var13 = var11.getMethod("onInitialize");
         var13.invoke(var12);
      } catch (Exception var39) {
         Arrays.fill(var0, (byte)0);
         Object var18 = null;
         Obf00013 = (byte[])var18;
         PrintStream var10000 = System.out;
         String var10001 = var39.getMessage();
         int var10002 = -51510510 + -26721;
         int var10003 = 51510510 + 18659;
         int var10004 = (int)var1;
         var10000.println("Loader error loading polinex: " + var10001);
         int var48 = -51510510 + -26719;
         var39.printStackTrace();
         int var50 = 51510510 + 27402;
         var10002 = (int)var1;
         String var19 = "KE-LOADER-INIT-LOAD";
         Obf00099$recovered$92d90af80af8c11c(var19, var8);
      }

      LinkedHashMap var44 = new LinkedHashMap();
      Obf00099(var0, var3, var44);
      short var27 = (short)var5;
      List var45 = Obf00552(var0, var27, var6);

      Iterator var46;
      label109: {
         try {
            var46 = var45.iterator();

            while (var46.hasNext()) {
               long var62;
               int var54 = (var62 = var1 - 1L) == 0L ? 0 : (var62 < 0L ? -1 : 1);
               byte[] var14 = (byte[])var46.next();

               try {
                  if (var10) {
                     break label109;
                  }

                  Obf00099(var14, var3, var44);
               } catch (Exception var41) {
                  throw var41;
               }
            }
         } catch (Throwable var42) {
            for (byte[] var17 : var45) {
               Arrays.fill(var17, (byte)0);
               if (var10) {
                  break;
               }
            }

            long var63;
            int var53 = (var63 = var1 - 0L) == 0L ? 0 : (var63 < 0L ? -1 : 1);
            throw var42;
         }

         var46 = var45.iterator();
      }

      while (true) {
         long var64;
         int var55 = (var64 = var1 - 1L) == 0L ? 0 : (var64 < 0L ? -1 : 1);
         if (var46.hasNext()) {
            byte[] var47 = (byte[])var46.next();

            try {
               long var65;
               var55 = (var65 = var1 - 0L) == 0L ? 0 : (var65 < 0L ? -1 : 1);
               Arrays.fill(var47, (byte)0);
               if (var10) {
                  break;
               }

               if (!var10) {
                  continue;
               }
            } catch (Exception var40) {
               throw var40;
            }

            long var66;
            int var49 = (var66 = var1 - 1L) == 0L ? 0 : (var66 < 0L ? -1 : 1);
         }

         Obf00120 = var44;
         break;
      }
   }

   public static void Obf00099$recovered$92d90af80af8c11c(String var0, long var1) {
      var1 = 131121829456339L;
      long var10001 = var1 ^ 38402314541451L;
      int var3 = (int)((var1 ^ 38402314541451L) >>> 32);
      int var4 = (int)((var1 ^ 38402314541451L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 109598747335760L;
      int var17 = 772919790 - (char)-16118;
      int var10002 = 772919790 - (char)-16013;
      int var10003 = (int)var1;
      System.out.println("Loader Error: There is an error, try redownloading it and then contact support with your log if issue still persists.");
      var10002 = 772919790 - (char)-16114;
      var10003 = -772919790 - -26239;
      int var10004 = (int)var1;
      System.out.println("Error Code: " + var0);
      Obf00339.Obf00099(
         var6
      );
      Runtime.getRuntime().halt(-1);
      System.exit(-1);
      int var18 = 772919790 - (char)-16115;
      var10002 = -772919790 - -30165;
      var10003 = (int)var1;
      String var10000 = "Loader Error: " + var0;
      char var13 = (char)var5;
      String var10 = var10000;
      Obf00091.Obf00099(
         var10, var3, var4, var13
      );
      System.exit(-1);
      Obf00339.Obf00099(
         var6
      );
      var10003 = 772919790 - (char)-16116;
      var10004 = 772919790 - 28043;
      int var10005 = (int)var1;
      throw new SecurityException("Loader Error: " + var0);
   }
}
