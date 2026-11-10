package me.octo.client.modules.impl.features.mining;

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
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   private static double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static <unrepresentable> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static BooleanSetting IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   static {
      long var20 = 30677564486647L ^ 81684815099821L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[6];
      int var17 = 0;
      String var16 = "®0\u0003Z½\u009d¿÷.\u009c¥k\u0095n\f\u0013|\u0003\f{\u0015êv[\bFÃGN\rðÍÿ\u0010×È¥\u0015\u0018\u0088þ\u0081\u0081t{¥Hº'ÉXô®·Ö{¥#8-¿´\u009f\u00807Õ\u0089YÚx\u0089E%õZ\u0014á\u009a\u008b\u009c¢ÁãUÜ×*3³½.´ä`\u001b\u001dù\u00ad\u0000Ð(¶©Ó\u0093zRRiQÕ=ó\u0082zkÎ\u0004Ö&\u000f?hYú\u0015*£Ú(ûõ½¯\u0018ú\u0092s\u009c";
      int var18 = "®0\u0003Z½\u009d¿÷.\u009c¥k\u0095n\f\u0013|\u0003\f{\u0015êv[\bFÃGN\rðÍÿ\u0010×È¥\u0015\u0018\u0088þ\u0081\u0081t{¥Hº'ÉXô®·Ö{¥#8-¿´\u009f\u00807Õ\u0089YÚx\u0089E%õZ\u0014á\u009a\u008b\u009c¢ÁãUÜ×*3³½.´ä`\u001b\u001dù\u00ad\u0000Ð(¶©Ó\u0093zRRiQÕ=ó\u0082zkÎ\u0004Ö&\u000f?hYú\u0015*£Ú(ûõ½¯\u0018ú\u0092s\u009c"
         .length();
      char var15 = 24;
      int var23 = -1;

      label45:
      while (true) {
         String var24 = var16.substring(++var23, var23 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var33;
                  if ((var23 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[2];
                     int var4 = 0;
                     String var5 = "îÊ\u00ad,a\u008c ®\u0095¦n©zñÍ5";
                     int var6 = "îÊ\u00ad,a\u008c ®\u0095¦n©zñÍ5".length();
                     byte var3 = 0;

                     do {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        var10001 = var4++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var1.doFinal(
                           new byte[]{
                              (byte)(var8 >>> 56),
                              (byte)(var8 >>> 48),
                              (byte)(var8 >>> 40),
                              (byte)(var8 >>> 32),
                              (byte)(var8 >>> 24),
                              (byte)(var8 >>> 16),
                              (byte)(var8 >>> 8),
                              (byte)var8
                           }
                        );
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var38 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0[0];
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0[1];
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var11[1], var11[3], false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var11[0], var11[4], true);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 93622133333784L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 373037615607L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 7730103864594L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[2];
                           int var7 = 0;
                           String var6 = "\u008aîe¦Îbî;Ø o\n(%w0ë\u0011\u009b\u0097ãï\u000e\u000eH\u0010]¬\u008bTDjòÉ¥«o\u009bÓ\u001d\u009aÌ\n³| Â\u001d\u0014*$¼Ì\u008f9\u008eâ¿©n\u00ad¥-Ð\u008aÙn\u008dÝM\u0012Hh^\u007f´\u0088\u0086\u0099B\u008a\u0080À\\\u0004zK\u0090Ø²\u009fÛý-\u0014Ã@";
                           int var8 = "\u008aîe¦Îbî;Ø o\n(%w0ë\u0011\u009b\u0097ãï\u000e\u000eH\u0010]¬\u008bTDjòÉ¥«o\u009bÓ\u001d\u009aÌ\n³| Â\u001d\u0014*$¼Ì\u008f9\u008eâ¿©n\u00ad¥-Ð\u008aÙn\u008dÝM\u0012Hh^\u007f´\u0088\u0086\u0099B\u008a\u0080À\\\u0004zK\u0090Ø²\u009fÛý-\u0014Ã@"
                              .length();
                           char var5 = 24;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
                        }

                        private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                           int var1x = 0;
                           int var2;
                           char[] var3x = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3x[var1x++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8 = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8 & 63));
                                 var3x[var1x++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12x = (char)((char)(var5x & 15) << '\f');
                                 byte var9 = var0x[++var4x];
                                 var12x = (char)(var12x | (char)(var9 & 63) << 6);
                                 var9 = var0x[++var4x];
                                 var12x = (char)(var12x | (char)(var9 & 63));
                                 var3x[var1x++] = var12x;
                              }
                           }

                           return new String(var3x, 0, var1x);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                           int var5x = var0x ^ (int)(var1x & 32767L) ^ 28744;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3x = Thread.currentThread().threadId();
                                 var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3x);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3x, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/features/mining/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1x >>> 56);

                              for (int var7 = 1; var7 < 8; var7++) {
                                 var6x[var7] = (byte)(var1x << var7 * 8 >>> 56);
                              }

                              DESKeySpec var11x = new DESKeySpec(var6x);
                              SecretKey var8 = ((SecretKeyFactory)var4x[1]).generateSecret(var11x);
                              ((Cipher)var4x[0]).init(2, var8, (IvParameterSpec)var4x[2]);
                              byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                        ) {
                           int var4x = (Integer)var3x[0];
                           long var5x = (Long)var3x[1];
                           String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8 = MethodHandles.constant(String.class, var7);
                           var1x.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                           return var7;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1x, MethodType var2
                        ) {
                           MutableCallSite var3x = new MutableCallSite(var2);

                           try {
                              var3x.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
                                       0,
                                       var0x,
                                       var3x,
                                       var1x
                                    ),
                                    var2
                                 )
                              );
                              return var3x;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/mining/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1x
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var11[2], var11[5], false);
                     return;
                  }

                  var15 = var16.charAt(var23);
                  break;
               default:
                  var11[var17++] = var33;
                  if ((var23 += var15) < var18) {
                     var15 = var16.charAt(var23);
                     continue label45;
                  }

                  var16 = "\\V ÷©Fñ¹\u008a\u0004J\u009f\u0014}²¿\u009bôÒy\u00adòc[F]°ÖÇ¥ÚÖ%\u008b8ÏÈ¡\u008d·0¹©n\u0081(\u0004pwË_ÛP\u0014ì\u009c\"\u008c\\\u001b\u0010æ\u0096?\u0091¥×ÉY?¬-ü5\u0083½ ôk\u0086æË\u009fr&h9\u001cÏ";
                  var18 = "\\V ÷©Fñ¹\u008a\u0004J\u009f\u0014}²¿\u009bôÒy\u00adòc[F]°ÖÇ¥ÚÖ%\u008b8ÏÈ¡\u008d·0¹©n\u0081(\u0004pwË_ÛP\u0014ì\u009c\"\u008c\\\u001b\u0010æ\u0096?\u0091¥×ÉY?¬-ü5\u0083½ ôk\u0086æË\u009fr&h9\u001cÏ"
                     .length();
                  var15 = '(';
                  var23 = -1;
            }

            var24 = var16.substring(++var23, var23 + var15);
            var10001 = 0;
         }
      }
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
}
