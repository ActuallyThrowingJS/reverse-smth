// Recovery view; aliases are not original names. Not verified to compile.
package dev.jnic.kFRRwo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

public class JNICLoader extends InputStream {
   public static ByteBuffer z;
   private String V;
   private DataInputStream b;
   private Z c;
   private r d;
   private q e;
   private int f = 0;
   private boolean g = false;
   private boolean h = true;
   private boolean i = true;
   private boolean j = false;
   private IOException k = null;
   private final byte[] l = new byte[1];
   private static final String[] a;
   private static final String[] m;
   private static final long[] n;
   private static final Integer[] o;

   public JNICLoader(InputStream var1) {
      this(var1, 16777216, null);
   }

   public JNICLoader(InputStream var1, int var2, byte[] var3) {
      this(var1, var2, var3, (byte)0);
   }

   private JNICLoader(InputStream var1, int var2, byte[] var3, byte var4) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.b = new DataInputStream(var1);
         this.d = new r();
         Z var10001 = new Z;
         if (var2 >= 4096 && var2 <= 2147483632) {
            var10001./* $VF: Unable to resugar constructor */<init>(var2 + 15 & -16, var3);
            this.c = var10001;
            if (var3 != null && var3.length > 0) {
               this.h = false;
            }
         } else {
            throw new IllegalArgumentException();
         }
      }
   }

   @Override
   public int read() {
      return this.read(this.l, 0, 1) == -1 ? -1 : this.l[0] & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (var2 < 0 || var3 < 0 || var2 + var3 < 0 || var2 + var3 > var1.length) {
         throw new IndexOutOfBoundsException();
      } else if (var3 == 0) {
         return 0;
      } else if (this.b == null) {
         throw new IOException();
      } else if (this.k != null) {
         throw this.k;
      } else if (this.j) {
         return -1;
      } else {
         try {
            int var4 = 0;

            while (var3 > 0) {
               if (this.f == 0) {
                  int var6;
                  if ((var6 = this.b.readUnsignedByte()) == 0) {
                     this.j = true;
                     this.b();
                  } else {
                     if (var6 < 224 && var6 != 1) {
                        if (this.h) {
                           throw new IOException();
                        }
                     } else {
                        this.i = true;
                        this.h = false;
                        Z var8 = this.c;
                        this.c.o = 0;
                        var8.p = 0;
                        var8.q = 0;
                        var8.r = 0;
                        var8.m[var8.n - 1] = 0;
                     }

                     if (var6 >= 128) {
                        this.g = true;
                        this.f = (var6 & 31) << 16;
                        this.f = this.f + this.b.readUnsignedShort() + 1;
                        int var7 = this.b.readUnsignedShort() + 1;
                        if (var6 >= 192) {
                           this.i = false;
                           if ((var6 = this.b.readUnsignedByte()) > 224) {
                              throw new IOException();
                           }

                           int var9 = var6 / 45;
                           int var17;
                           int var10 = (var17 = var6 - var9 * 9 * 5) / 9;
                           if ((var6 = var17 - var10 * 9) + var10 > 4) {
                              throw new IOException();
                           }

                           this.e = new q(this.c, this.d, var6, var10, var9);
                        } else {
                           if (this.i) {
                              throw new IOException();
                           }

                           if (var6 >= 160) {
                              this.e.c();
                           }
                        }

                        DataInputStream var19 = this.b;
                        r var23 = this.d;
                        if (var7 < 5) {
                           throw new IOException();
                        }

                        if (var19.readUnsignedByte() != 0) {
                           throw new IOException();
                        }

                        var23.X = var19.readInt();
                        var23.W = -1;
                        int var26 = var7 - 5;
                        var23.p = var23.m.length - var26;
                        var19.readFully(var23.m, var23.p, var26);
                     } else {
                        if (var6 > 2) {
                           throw new IOException();
                        }

                        this.g = false;
                        this.f = this.b.readUnsignedShort() + 1;
                     }
                  }

                  if (this.j) {
                     if (var4 == 0) {
                        return -1;
                     }

                     return var4;
                  }
               }

               int var5 = Math.min(this.f, var3);
               if (!this.g) {
                  DataInputStream var20 = this.b;
                  Z var12 = this.c;
                  int var24 = Math.min(this.c.n - var12.p, var5);
                  var20.readFully(var12.m, var12.p, var24);
                  var12.p += var24;
                  if (var12.q < var12.p) {
                     var12.q = var12.p;
                  }
               } else {
                  Z var13 = this.c;
                  if (this.c.n - var13.p <= var5) {
                     var13.r = var13.n;
                  } else {
                     var13.r = var13.p + var5;
                  }

                  this.e.d();
               }

               Z var14 = this.c;
               int var25 = this.c.p - var14.o;
               if (var14.p == var14.n) {
                  var14.p = 0;
               }

               System.arraycopy(var14.m, var14.o, var1, var2, var25);
               var14.o = var14.p;
               var2 += var25;
               var3 -= var25;
               var4 += var25;
               this.f -= var25;
               if (this.f == 0) {
                  r var15 = this.d;
                  if (this.d.p != var15.m.length || var15.X != 0 || this.c.s > 0) {
                     throw new IOException();
                  }
               }
            }

            return var4;
         } catch (IOException var11) {
            this.k = var11;
            throw var11;
         }
      }
   }

   @Override
   public int available() {
      if (this.b == null) {
         throw new IOException(a(24236, 6356));
      } else if (this.k != null) {
         throw this.k;
      } else {
         return this.g ? this.f : Math.min(this.f, this.b.available());
      }
   }

   private void b() {
      if (this.c != null) {
         this.c = null;
         this.d = null;
      }
   }

   @Override
   public void close() {
      if (this.b != null) {
         this.b();

         try {
            this.b.close();
         } finally {
            this.b = null;
         }
      }
   }

   public static void init() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var21 = new String[21];
      int var19 = 0;
      String var18 = "\u00864ìÇ¡¦±\u0003\u0003ÖS\u0003qsI\u001aÁÙO'm\u0011\u0095\r°ëÊ\u008eC]fÊ\u0086Ù4ÜîÈ\u008cÄj\u001c\u0007©{\u009a|¢ÆÔ6n©ò\u0096\u001dpÖóS\u00854¶ulW6 §öº;\u0091N¹\u001d3«îa$9µ~ò¦ÂÍËO0å]~ùÁ¦K\u00141\u001e\f\u00196\u001a\u0003\u0018G\u001c\u0003[{x\u0005|:6\u008c¿\u0010pÓ]f/9Ý\b¹Kû\u0083{×¢í\u0007Ù¶\u0094Åcñì\u0003~ÇÐ\u0005\u00855\tmX\u0003\u0005pÇ\u0003\u0018Þ0\u0006]ÌzÄ,h\u0006ø-ï\n¿H\u0007·(ÊKv×7\u0006F\u0005\u0019ý@O";
      int var20 = "\u00864ìÇ¡¦±\u0003\u0003ÖS\u0003qsI\u001aÁÙO'm\u0011\u0095\r°ëÊ\u008eC]fÊ\u0086Ù4ÜîÈ\u008cÄj\u001c\u0007©{\u009a|¢ÆÔ6n©ò\u0096\u001dpÖóS\u00854¶ulW6 §öº;\u0091N¹\u001d3«îa$9µ~ò¦ÂÍËO0å]~ùÁ¦K\u00141\u001e\f\u00196\u001a\u0003\u0018G\u001c\u0003[{x\u0005|:6\u008c¿\u0010pÓ]f/9Ý\b¹Kû\u0083{×¢í\u0007Ù¶\u0094Åcñì\u0003~ÇÐ\u0005\u00855\tmX\u0003\u0005pÇ\u0003\u0018Þ0\u0006]ÌzÄ,h\u0006ø-ï\n¿H\u0007·(ÊKv×7\u0006F\u0005\u0019ý@O"
         .length();
      char var17 = 7;
      int var46 = -1;

      label216:
      while (true) {
         String var10000 = var18.substring(++var46, var46 + var17);
         int var10001 = -1;

         while (true) {
            char[] var67;
            label211: {
               char[] var52 = var10000.toCharArray();
               int var10003 = var52.length;
               int var22 = 0;
               var67 = var52;
               var10001 = var10003;
               char[] var79;
               int var10004;
               if (var10003 <= 1) {
                  var79 = var52;
                  var10004 = var22;
               } else {
                  var67 = var52;
                  var10001 = var10003;
                  if (var10003 <= var22) {
                     break label211;
                  }

                  var79 = var52;
                  var10004 = var22;
               }

               while (true) {
                  char var10005 = var79[var10004];
                  byte var10006;
                  switch (var22 % 7) {
                     case 0:
                        var10006 = 124;
                        break;
                     case 1:
                        var10006 = 106;
                        break;
                     case 2:
                        var10006 = 31;
                        break;
                     case 3:
                        var10006 = 112;
                        break;
                     case 4:
                        var10006 = 70;
                        break;
                     case 5:
                        var10006 = 126;
                        break;
                     default:
                        var10006 = 25;
                  }

                  var79[var10004] = (char)(var10005 ^ var10006);
                  var22++;
                  if (var10001 == 0) {
                     var10004 = var10001;
                     var79 = var67;
                  } else {
                     if (var10001 <= var22) {
                        break;
                     }

                     var79 = var67;
                     var10004 = var22;
                  }
               }
            }

            String var86 = new String(var67).intern();
            switch (var10001) {
               case 0:
                  var21[var19++] = var86;
                  if ((var46 += var17) >= var20) {
                     a = var21;
                     m = new String[21];
                     long var8 = 4314957415865810808L;
                     long[] var14 = new long[53];
                     int var11 = 0;
                     String var12 = "·\u009fXÚ|z:ï3Ï9øöxã:&´à%~Áf$GO]¶íØh`ux\u0011\u009eE\u009a¥# \u007f\u008a{¸ôÙh~ÐM\u0092\\j\u000f×¤HBï1ü}\u000fëj°Ý2\u0015m¾Ú+\u0003\u0018_L9Ó¹òØGj~G\u008a*µ\bö\u001e\u0007Àf\u008d\u009ffzÉ\u0094du¤L½ò}v\b}êþö§Ì'ë:fá\u0005w\u008f5ø.âç7»ÅO÷\u009e\u0087+Îíb®R\u009f\u0080¼dÖù;qH²\u000b^\u001b\u0095&èÑ\u0014\u0017Ö\u0011f2\u0091çblõ¤íÍtÿN î\u0097\u0015Zþ\u008c\u001eÞ\u001a\u001c\"sd\tïc\u0004Hld©QÑÞ\u0097þÀÓªm\u0011\u007f\u0005ËT6z´ÍìFF×\u009b\u0004!M\u0015âÎë],M\u0081Ê\u00adÕ\u008foÓ{ã³\u009f©¢AA->BØ\u0004°\u0001Üý\u0090¾AåÛsî\u0093\u0082¡g$\u0004\u0004\u0082\u009b¥;KMÙ±\u0090Ë3ð\u008cBWéñÆ¢UÜ¯¤ÂµHCî~¨\u0085b*\u0098rbÿÞþým\u008eê î\rk@Äµ1¬ä \u0080JTÁÊ\u0089\u0084I¨Ô)Eï\u001d¶CdÒû¾Õú\u0012\u007f\u008a\u0007§)\u0001ª\"\u0088ªGFfØFFEÃ9×ipn¾ßËÓGÎý·«pç\u0092Z\u0090Ã¬ë¾Û1Î\u001f?õ\u009a\u009aªÂ\u007fñ)îòî1F\u008fÖ";
                     int var13 = "·\u009fXÚ|z:ï3Ï9øöxã:&´à%~Áf$GO]¶íØh`ux\u0011\u009eE\u009a¥# \u007f\u008a{¸ôÙh~ÐM\u0092\\j\u000f×¤HBï1ü}\u000fëj°Ý2\u0015m¾Ú+\u0003\u0018_L9Ó¹òØGj~G\u008a*µ\bö\u001e\u0007Àf\u008d\u009ffzÉ\u0094du¤L½ò}v\b}êþö§Ì'ë:fá\u0005w\u008f5ø.âç7»ÅO÷\u009e\u0087+Îíb®R\u009f\u0080¼dÖù;qH²\u000b^\u001b\u0095&èÑ\u0014\u0017Ö\u0011f2\u0091çblõ¤íÍtÿN î\u0097\u0015Zþ\u008c\u001eÞ\u001a\u001c\"sd\tïc\u0004Hld©QÑÞ\u0097þÀÓªm\u0011\u007f\u0005ËT6z´ÍìFF×\u009b\u0004!M\u0015âÎë],M\u0081Ê\u00adÕ\u008foÓ{ã³\u009f©¢AA->BØ\u0004°\u0001Üý\u0090¾AåÛsî\u0093\u0082¡g$\u0004\u0004\u0082\u009b¥;KMÙ±\u0090Ë3ð\u008cBWéñÆ¢UÜ¯¤ÂµHCî~¨\u0085b*\u0098rbÿÞþým\u008eê î\rk@Äµ1¬ä \u0080JTÁÊ\u0089\u0084I¨Ô)Eï\u001d¶CdÒû¾Õú\u0012\u007f\u008a\u0007§)\u0001ª\"\u0088ªGFfØFFEÃ9×ipn¾ßËÓGÎý·«pç\u0092Z\u0090Ã¬ë¾Û1Î\u001f?õ\u009a\u009aªÂ\u007fñ)îòî1F\u008fÖ"
                        .length();
                     byte var10 = 0;

                     label190:
                     while (true) {
                        int var59 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var59, var10).getBytes("ISO-8859-1");
                        long[] var49 = var14;
                        var59 = var11++;
                        long var73 = (var15[0] & 255L) << 56
                           | (var15[1] & 255L) << 48
                           | (var15[2] & 255L) << 40
                           | (var15[3] & 255L) << 32
                           | (var15[4] & 255L) << 24
                           | (var15[5] & 255L) << 16
                           | (var15[6] & 255L) << 8
                           | var15[7] & 255L;
                        byte var87 = -1;

                        while (true) {
                           long var92 = var73 ^ var8;
                           switch (var87) {
                              case 0:
                                 var49[var59] = var92;
                                 if (var10 >= var13) {
                                    n = var14;
                                    o = new Integer[53];
                                    long var1 = 2874609525771970889L;
                                    long[] var0 = new long[12];
                                    int var4 = 0;
                                    String var5 = "'äª\"\"\u009dmA'äª\"#\u0097©I'äª\"#¬iI'äª\"#YÞÙ'äª\"#YÞÙ'äª\"#5PÑ'äª\"#¬iI'äª\"\"\u009dmA'äª\"#ô\u0019I'äª\"#ô\u0019I";
                                    int var6 = "'äª\"\"\u009dmA'äª\"#\u0097©I'äª\"#¬iI'äª\"#YÞÙ'äª\"#YÞÙ'äª\"#5PÑ'äª\"#¬iI'äª\"\"\u009dmA'äª\"#ô\u0019I'äª\"#ô\u0019I"
                                       .length();
                                    byte var3 = 0;

                                    label180:
                                    while (true) {
                                       int var62 = var3;
                                       var3 += 8;
                                       byte[] var7 = var5.substring(var62, var3).getBytes("ISO-8859-1");
                                       long[] var50 = var0;
                                       var62 = var4++;
                                       long var75 = (var7[0] & 255L) << 56
                                          | (var7[1] & 255L) << 48
                                          | (var7[2] & 255L) << 40
                                          | (var7[3] & 255L) << 32
                                          | (var7[4] & 255L) << 24
                                          | (var7[5] & 255L) << 16
                                          | (var7[6] & 255L) << 8
                                          | var7[7] & 255L;
                                       byte var89 = -1;

                                       while (true) {
                                          var92 = var75 ^ var1;
                                          switch (var89) {
                                             case 0:
                                                var50[var62] = var92;
                                                if (var3 >= var6) {
                                                   z = ByteBuffer.allocateDirect(64).order(ByteOrder.LITTLE_ENDIAN);
                                                   String var23 = System.getProperty(a(24237, 5769)).toLowerCase();
                                                   String var24 = System.getProperty("os.arc").toLowerCase();
                                                   long var25 = 0L;
                                                   long var27 = 0L;
                                                   if (var23.contains("1") && (var24.equals(a(24238, 28763)) || var24.equals(a(24244, 17255)))) {
                                                      var25 = var0[3];
                                                      var27 = var0[0];
                                                      z.putInt(773318827);
                                                      z.putInt(914232415);
                                                      z.putInt(-495732338);
                                                      z.putInt(-1854577014);
                                                      z.putInt(804923141);
                                                      z.putInt(1592752662);
                                                      z.putInt(-1089762367);
                                                      z.putInt(417555181);
                                                   }

                                                   if (var23.contains(a(24242, -21280)) && var24.equals(a(24248, -8413))) {
                                                      var25 = var0[5];
                                                      var27 = var0[4];
                                                      z.putInt(1848732011);
                                                      z.putInt(1292972114);
                                                      z.putInt(557799021);
                                                      z.putInt(-271529301);
                                                      z.putInt(654696467);
                                                      z.putInt(1956724573);
                                                      z.putInt(2107892422);
                                                      z.putInt(-534029403);
                                                   }

                                                   if (var23.contains(a(24241, 8636)) && var24.equals(a(24246, 19282))) {
                                                      var25 = var0[2];
                                                      var27 = var0[9];
                                                      z.putInt(1626149252);
                                                      z.putInt(1277657610);
                                                      z.putInt(1344715455);
                                                      z.putInt(-723396833);
                                                      z.putInt(1824417302);
                                                      z.putInt(2131133300);
                                                      z.putInt(-781640298);
                                                      z.putInt(-1950888380);
                                                   }

                                                   if (var23.contains(a(24253, 6221)) && (var24.equals(a(24243, 18435)) || var24.equals(a(24240, 29914)))) {
                                                      var25 = var0[8];
                                                      var27 = var0[10];
                                                      z.putInt(-818784361);
                                                      z.putInt(-1027632132);
                                                      z.putInt(1597946068);
                                                      z.putInt(-688461775);
                                                      z.putInt(317225671);
                                                      z.putInt(1400583860);
                                                      z.putInt(227402953);
                                                      z.putInt(-937578242);
                                                   }

                                                   if (var23.contains(a(24254, -11556)) && (var24.equals(a(24243, 18435)) || var24.equals(a(24240, 29914)))) {
                                                      var25 = var0[1];
                                                      var27 = var0[6];
                                                      z.putInt(785866772);
                                                      z.putInt(-1187830539);
                                                      z.putInt(-1296278442);
                                                      z.putInt(211647580);
                                                      z.putInt(-1819337066);
                                                      z.putInt(-1161429453);
                                                      z.putInt(-490751450);
                                                      z.putInt(-1979467139);
                                                   }

                                                   if (var23.contains(a(24247, 27670)) && var24.equals(a(24246, 19282))) {
                                                      var25 = var0[7];
                                                      var27 = var0[11];
                                                      z.putInt(-637061059);
                                                      z.putInt(2034288372);
                                                      z.putInt(-1732319366);
                                                      z.putInt(-985791157);
                                                      z.putInt(954697370);
                                                      z.putInt(772750991);
                                                      z.putInt(-741708288);
                                                      z.putInt(-672656529);
                                                   }

                                                   if (var25 == var27) {
                                                      throw new UnsatisfiedLinkError(a(24239, -7496) + var23 + "/" + var24);
                                                   }

                                                   File var29;
                                                   try {
                                                      var29 = File.createTempFile(a(24251, -17522), null);
                                                      var29.deleteOnExit();
                                                      if (!var29.exists()) {
                                                         throw new IOException();
                                                      }
                                                   } catch (IOException var42) {
                                                      throw new UnsatisfiedLinkError(a(24255, -26431));
                                                   }

                                                   byte[] var30 = new byte[2048];

                                                   try {
                                                      JNICLoader var31 = new JNICLoader(
                                                         Objects.requireNonNull(JNICLoader.class.getResourceAsStream(a(24249, 28935)))
                                                      );

                                                      try {
                                                         FileOutputStream var32 = new FileOutputStream(var29);

                                                         try {
                                                            long var33 = 0L;

                                                            while (var33 < var25) {
                                                               long var35 = var31.skip(var25 - var33);
                                                               if (var35 <= 0L) {
                                                                  throw new IOException(a(24245, 17879) + var33);
                                                               }

                                                               var33 += var35;
                                                            }

                                                            while (var33 < var27) {
                                                               int var47 = var31.read(var30, 0, (int)Math.min((long)var30.length, var27 - var33));
                                                               var32.write(var30, 0, var47);
                                                               var33 += var47;
                                                            }
                                                         } catch (Throwable var39) {
                                                            try {
                                                               var32.close();
                                                            } catch (Throwable var38) {
                                                               var39.addSuppressed(var38);
                                                            }

                                                            throw var39;
                                                         }

                                                         var32.close();
                                                      } catch (Throwable var40) {
                                                         try {
                                                            var31.close();
                                                         } catch (Throwable var37) {
                                                            var40.addSuppressed(var37);
                                                         }

                                                         throw var40;
                                                      }

                                                      var31.close();
                                                   } catch (IOException var41) {
                                                      throw new UnsatisfiedLinkError(a(24232, 27523) + var41.getMessage());
                                                   }

                                                   z.putInt(834763354);
                                                   z.putInt(-1986202400);
                                                   z.putInt(-129382024);
                                                   System.load(var29.getAbsolutePath());
                                                   return;
                                                }
                                                break;
                                             default:
                                                var50[var62] = var92;
                                                if (var3 < var6) {
                                                   continue label180;
                                                }

                                                var5 = "'äª\"#5PÑ'äª\"\"¥\u0002¡";
                                                var6 = "'äª\"#5PÑ'äª\"\"¥\u0002¡".length();
                                                var3 = 0;
                                          }

                                          byte var64 = var3;
                                          var3 += 8;
                                          var7 = var5.substring(var64, var3).getBytes("ISO-8859-1");
                                          var50 = var0;
                                          var62 = var4++;
                                          var75 = (var7[0] & 255L) << 56
                                             | (var7[1] & 255L) << 48
                                             | (var7[2] & 255L) << 40
                                             | (var7[3] & 255L) << 32
                                             | (var7[4] & 255L) << 24
                                             | (var7[5] & 255L) << 16
                                             | (var7[6] & 255L) << 8
                                             | var7[7] & 255L;
                                          var89 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var59] = var92;
                                 if (var10 < var13) {
                                    continue label190;
                                 }

                                 var12 = "?[ïaåuXb\u008cÄ`èÆcÿØ";
                                 var13 = "?[ïaåuXb\u008cÄ`èÆcÿØ".length();
                                 var10 = 0;
                           }

                           byte var61 = var10;
                           var10 += 8;
                           var15 = var12.substring(var61, var10).getBytes("ISO-8859-1");
                           var49 = var14;
                           var59 = var11++;
                           var73 = (var15[0] & 255L) << 56
                              | (var15[1] & 255L) << 48
                              | (var15[2] & 255L) << 40
                              | (var15[3] & 255L) << 32
                              | (var15[4] & 255L) << 24
                              | (var15[5] & 255L) << 16
                              | (var15[6] & 255L) << 8
                              | var15[7] & 255L;
                           var87 = 0;
                        }
                     }
                  }

                  var17 = var18.charAt(var46);
                  break;
               default:
                  var21[var19++] = var86;
                  if ((var46 += var17) < var20) {
                     var17 = var18.charAt(var46);
                     continue label216;
                  }

                  var18 = "Î\nréÀØ\u0011GwÖ\u0098¨ÁMÚ\u008d`\u009d¥5<\u008b=)\u0018ÜÅì¤\u0019a\u001b\u0003a*ö¼\u0013CJ~àÝ%\u0086³Bä1";
                  var20 = "Î\nréÀØ\u0011GwÖ\u0098¨ÁMÚ\u008d`\u009d¥5<\u008b=)\u0018ÜÅì¤\u0019a\u001b\u0003a*ö¼\u0013CJ~àÝ%\u0086³Bä1".length();
                  var17 = 24;
                  var46 = -1;
            }

            var10000 = var18.substring(++var46, var46 + var17);
            var10001 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 24252) & 65535;
      if (m[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 6;
               break;
            case 1:
               var10000 = 193;
               break;
            case 2:
               var10000 = 168;
               break;
            case 3:
               var10000 = 131;
               break;
            case 4:
               var10000 = 8;
               break;
            case 5:
               var10000 = 247;
               break;
            case 6:
               var10000 = 244;
               break;
            case 7:
               var10000 = 5;
               break;
            case 8:
               var10000 = 154;
               break;
            case 9:
               var10000 = 20;
               break;
            case 10:
               var10000 = 120;
               break;
            case 11:
               var10000 = 149;
               break;
            case 12:
               var10000 = 109;
               break;
            case 13:
               var10000 = 98;
               break;
            case 14:
               var10000 = 60;
               break;
            case 15:
               var10000 = 115;
               break;
            case 16:
               var10000 = 216;
               break;
            case 17:
               var10000 = 134;
               break;
            case 18:
               var10000 = 202;
               break;
            case 19:
               var10000 = 239;
               break;
            case 20:
               var10000 = 7;
               break;
            case 21:
               var10000 = 46;
               break;
            case 22:
               var10000 = 29;
               break;
            case 23:
               var10000 = 42;
               break;
            case 24:
               var10000 = 89;
               break;
            case 25:
               var10000 = 54;
               break;
            case 26:
               var10000 = 141;
               break;
            case 27:
               var10000 = 166;
               break;
            case 28:
               var10000 = 245;
               break;
            case 29:
               var10000 = 80;
               break;
            case 30:
               var10000 = 185;
               break;
            case 31:
               var10000 = 69;
               break;
            case 32:
               var10000 = 162;
               break;
            case 33:
               var10000 = 170;
               break;
            case 34:
               var10000 = 156;
               break;
            case 35:
               var10000 = 133;
               break;
            case 36:
               var10000 = 150;
               break;
            case 37:
               var10000 = 106;
               break;
            case 38:
               var10000 = 104;
               break;
            case 39:
               var10000 = 67;
               break;
            case 40:
               var10000 = 223;
               break;
            case 41:
               var10000 = 4;
               break;
            case 42:
               var10000 = 236;
               break;
            case 43:
               var10000 = 16;
               break;
            case 44:
               var10000 = 27;
               break;
            case 45:
               var10000 = 199;
               break;
            case 46:
               var10000 = 57;
               break;
            case 47:
               var10000 = 176;
               break;
            case 48:
               var10000 = 35;
               break;
            case 49:
               var10000 = 124;
               break;
            case 50:
               var10000 = 40;
               break;
            case 51:
               var10000 = 153;
               break;
            case 52:
               var10000 = 158;
               break;
            case 53:
               var10000 = 232;
               break;
            case 54:
               var10000 = 144;
               break;
            case 55:
               var10000 = 152;
               break;
            case 56:
               var10000 = 58;
               break;
            case 57:
               var10000 = 173;
               break;
            case 58:
               var10000 = 25;
               break;
            case 59:
               var10000 = 72;
               break;
            case 60:
               var10000 = 148;
               break;
            case 61:
               var10000 = 188;
               break;
            case 62:
               var10000 = 95;
               break;
            case 63:
               var10000 = 10;
               break;
            case 64:
               var10000 = 28;
               break;
            case 65:
               var10000 = 161;
               break;
            case 66:
               var10000 = 249;
               break;
            case 67:
               var10000 = 213;
               break;
            case 68:
               var10000 = 218;
               break;
            case 69:
               var10000 = 105;
               break;
            case 70:
               var10000 = 234;
               break;
            case 71:
               var10000 = 99;
               break;
            case 72:
               var10000 = 252;
               break;
            case 73:
               var10000 = 119;
               break;
            case 74:
               var10000 = 88;
               break;
            case 75:
               var10000 = 143;
               break;
            case 76:
               var10000 = 178;
               break;
            case 77:
               var10000 = 94;
               break;
            case 78:
               var10000 = 221;
               break;
            case 79:
               var10000 = 51;
               break;
            case 80:
               var10000 = 61;
               break;
            case 81:
               var10000 = 209;
               break;
            case 82:
               var10000 = 231;
               break;
            case 83:
               var10000 = 235;
               break;
            case 84:
               var10000 = 53;
               break;
            case 85:
               var10000 = 172;
               break;
            case 86:
               var10000 = 183;
               break;
            case 87:
               var10000 = 128;
               break;
            case 88:
               var10000 = 91;
               break;
            case 89:
               var10000 = 253;
               break;
            case 90:
               var10000 = 125;
               break;
            case 91:
               var10000 = 75;
               break;
            case 92:
               var10000 = 207;
               break;
            case 93:
               var10000 = 147;
               break;
            case 94:
               var10000 = 250;
               break;
            case 95:
               var10000 = 113;
               break;
            case 96:
               var10000 = 110;
               break;
            case 97:
               var10000 = 226;
               break;
            case 98:
               var10000 = 233;
               break;
            case 99:
               var10000 = 138;
               break;
            case 100:
               var10000 = 215;
               break;
            case 101:
               var10000 = 194;
               break;
            case 102:
               var10000 = 97;
               break;
            case 103:
               var10000 = 90;
               break;
            case 104:
               var10000 = 112;
               break;
            case 105:
               var10000 = 155;
               break;
            case 106:
               var10000 = 205;
               break;
            case 107:
               var10000 = 243;
               break;
            case 108:
               var10000 = 169;
               break;
            case 109:
               var10000 = 132;
               break;
            case 110:
               var10000 = 63;
               break;
            case 111:
               var10000 = 240;
               break;
            case 112:
               var10000 = 70;
               break;
            case 113:
               var10000 = 30;
               break;
            case 114:
               var10000 = 137;
               break;
            case 115:
               var10000 = 181;
               break;
            case 116:
               var10000 = 217;
               break;
            case 117:
               var10000 = 225;
               break;
            case 118:
               var10000 = 206;
               break;
            case 119:
               var10000 = 122;
               break;
            case 120:
               var10000 = 31;
               break;
            case 121:
               var10000 = 174;
               break;
            case 122:
               var10000 = 73;
               break;
            case 123:
               var10000 = 151;
               break;
            case 124:
               var10000 = 160;
               break;
            case 125:
               var10000 = 71;
               break;
            case 126:
               var10000 = 254;
               break;
            case 127:
               var10000 = 59;
               break;
            case 128:
               var10000 = 33;
               break;
            case 129:
               var10000 = 227;
               break;
            case 130:
               var10000 = 140;
               break;
            case 131:
               var10000 = 159;
               break;
            case 132:
               var10000 = 237;
               break;
            case 133:
               var10000 = 9;
               break;
            case 134:
               var10000 = 21;
               break;
            case 135:
               var10000 = 177;
               break;
            case 136:
               var10000 = 19;
               break;
            case 137:
               var10000 = 219;
               break;
            case 138:
               var10000 = 182;
               break;
            case 139:
               var10000 = 118;
               break;
            case 140:
               var10000 = 248;
               break;
            case 141:
               var10000 = 201;
               break;
            case 142:
               var10000 = 55;
               break;
            case 143:
               var10000 = 222;
               break;
            case 144:
               var10000 = 212;
               break;
            case 145:
               var10000 = 242;
               break;
            case 146:
               var10000 = 251;
               break;
            case 147:
               var10000 = 228;
               break;
            case 148:
               var10000 = 1;
               break;
            case 149:
               var10000 = 79;
               break;
            case 150:
               var10000 = 18;
               break;
            case 151:
               var10000 = 100;
               break;
            case 152:
               var10000 = 11;
               break;
            case 153:
               var10000 = 87;
               break;
            case 154:
               var10000 = 164;
               break;
            case 155:
               var10000 = 121;
               break;
            case 156:
               var10000 = 129;
               break;
            case 157:
               var10000 = 165;
               break;
            case 158:
               var10000 = 224;
               break;
            case 159:
               var10000 = 43;
               break;
            case 160:
               var10000 = 157;
               break;
            case 161:
               var10000 = 116;
               break;
            case 162:
               var10000 = 39;
               break;
            case 163:
               var10000 = 192;
               break;
            case 164:
               var10000 = 163;
               break;
            case 165:
               var10000 = 142;
               break;
            case 166:
               var10000 = 135;
               break;
            case 167:
               var10000 = 13;
               break;
            case 168:
               var10000 = 22;
               break;
            case 169:
               var10000 = 14;
               break;
            case 170:
               var10000 = 3;
               break;
            case 171:
               var10000 = 2;
               break;
            case 172:
               var10000 = 204;
               break;
            case 173:
               var10000 = 96;
               break;
            case 174:
               var10000 = 191;
               break;
            case 175:
               var10000 = 86;
               break;
            case 176:
               var10000 = 180;
               break;
            case 177:
               var10000 = 146;
               break;
            case 178:
               var10000 = 214;
               break;
            case 179:
               var10000 = 47;
               break;
            case 180:
               var10000 = 49;
               break;
            case 181:
               var10000 = 117;
               break;
            case 182:
               var10000 = 195;
               break;
            case 183:
               var10000 = 175;
               break;
            case 184:
               var10000 = 241;
               break;
            case 185:
               var10000 = 68;
               break;
            case 186:
               var10000 = 44;
               break;
            case 187:
               var10000 = 114;
               break;
            case 188:
               var10000 = 74;
               break;
            case 189:
               var10000 = 198;
               break;
            case 190:
               var10000 = 62;
               break;
            case 191:
               var10000 = 36;
               break;
            case 192:
               var10000 = 184;
               break;
            case 193:
               var10000 = 208;
               break;
            case 194:
               var10000 = 101;
               break;
            case 195:
               var10000 = 136;
               break;
            case 196:
               var10000 = 130;
               break;
            case 197:
               var10000 = 230;
               break;
            case 198:
               var10000 = 50;
               break;
            case 199:
               var10000 = 12;
               break;
            case 200:
               var10000 = 24;
               break;
            case 201:
               var10000 = 127;
               break;
            case 202:
               var10000 = 167;
               break;
            case 203:
               var10000 = 229;
               break;
            case 204:
               var10000 = 171;
               break;
            case 205:
               var10000 = 37;
               break;
            case 206:
               var10000 = 34;
               break;
            case 207:
               var10000 = 77;
               break;
            case 208:
               var10000 = 108;
               break;
            case 209:
               var10000 = 139;
               break;
            case 210:
               var10000 = 200;
               break;
            case 211:
               var10000 = 126;
               break;
            case 212:
               var10000 = 56;
               break;
            case 213:
               var10000 = 111;
               break;
            case 214:
               var10000 = 26;
               break;
            case 215:
               var10000 = 145;
               break;
            case 216:
               var10000 = 179;
               break;
            case 217:
               var10000 = 83;
               break;
            case 218:
               var10000 = 92;
               break;
            case 219:
               var10000 = 246;
               break;
            case 220:
               var10000 = 64;
               break;
            case 221:
               var10000 = 81;
               break;
            case 222:
               var10000 = 85;
               break;
            case 223:
               var10000 = 45;
               break;
            case 224:
               var10000 = 0;
               break;
            case 225:
               var10000 = 48;
               break;
            case 226:
               var10000 = 78;
               break;
            case 227:
               var10000 = 187;
               break;
            case 228:
               var10000 = 196;
               break;
            case 229:
               var10000 = 65;
               break;
            case 230:
               var10000 = 220;
               break;
            case 231:
               var10000 = 123;
               break;
            case 232:
               var10000 = 189;
               break;
            case 233:
               var10000 = 84;
               break;
            case 234:
               var10000 = 203;
               break;
            case 235:
               var10000 = 238;
               break;
            case 236:
               var10000 = 93;
               break;
            case 237:
               var10000 = 211;
               break;
            case 238:
               var10000 = 107;
               break;
            case 239:
               var10000 = 103;
               break;
            case 240:
               var10000 = 255;
               break;
            case 241:
               var10000 = 190;
               break;
            case 242:
               var10000 = 186;
               break;
            case 243:
               var10000 = 15;
               break;
            case 244:
               var10000 = 76;
               break;
            case 245:
               var10000 = 52;
               break;
            case 246:
               var10000 = 23;
               break;
            case 247:
               var10000 = 32;
               break;
            case 248:
               var10000 = 17;
               break;
            case 249:
               var10000 = 66;
               break;
            case 250:
               var10000 = 41;
               break;
            case 251:
               var10000 = 210;
               break;
            case 252:
               var10000 = 197;
               break;
            case 253:
               var10000 = 82;
               break;
            case 254:
               var10000 = 102;
               break;
            default:
               var10000 = 38;
         }

         short var4 = var10000;
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

         m[var2] = new String(var3).intern();
      }

      return m[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20694;
      if (o[var3] == null) {
         o[var3] = (int)(n[var3] ^ var1);
      }

      return o[var3];
   }
}
