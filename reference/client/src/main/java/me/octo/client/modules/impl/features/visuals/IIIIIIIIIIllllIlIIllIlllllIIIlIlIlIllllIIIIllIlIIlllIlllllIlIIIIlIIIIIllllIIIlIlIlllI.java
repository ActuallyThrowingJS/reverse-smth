package me.octo.client.modules.impl.features.visuals;

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

public final class IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   @NotNull
   private static <unrepresentable> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   static {
      long var9 = 47911883923629L ^ 131803551502600L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[6];
      int var6 = 0;
      String var5 = "\u0019\u001ah§\u009f\u0094¿Èºï×ª.¸éâ\u0000>vÒ\n\u009b\u0090`\u0010S¤\u0096ð&Âc\u0019gã\u008dë\u000b¹4kHJå\u00adXéahÍßô\u0080\u000e\u0006ÚÀ¹ú\u008c¡$Äû\u0091y\u008eÔõ0-Ì\u0081æÅ\u0006÷\u0099B{\u001e>óK\u00adJ»õ\u0085÷ñÚÉ\u008e~Í0cz\u0006¹\u0085\u0082óÓ\u008d¬\u0013ÓÈ|\u0007\u0087\u0016`På×Wýp2\u0091!|«¤½CH\t£_Í\u008cN ÅYÃ\"\u001d\u001fÊ¯ëç±»øõÄUÅWÕL;\u0097/Äð}S\u0018t£&A\u0080hw\u0098þo\u008f²2X\u008bTâü!%å\u0010\u000b¤ÂªçqNé\u009aÎ°r0ªeL\u00196ât!\u0005Å\u008d";
      int var7 = "\u0019\u001ah§\u009f\u0094¿Èºï×ª.¸éâ\u0000>vÒ\n\u009b\u0090`\u0010S¤\u0096ð&Âc\u0019gã\u008dë\u000b¹4kHJå\u00adXéahÍßô\u0080\u000e\u0006ÚÀ¹ú\u008c¡$Äû\u0091y\u008eÔõ0-Ì\u0081æÅ\u0006÷\u0099B{\u001e>óK\u00adJ»õ\u0085÷ñÚÉ\u008e~Í0cz\u0006¹\u0085\u0082óÓ\u008d¬\u0013ÓÈ|\u0007\u0087\u0016`På×Wýp2\u0091!|«¤½CH\t£_Í\u008cN ÅYÃ\"\u001d\u001fÊ¯ëç±»øõÄUÅWÕL;\u0097/Äð}S\u0018t£&A\u0080hw\u0098þo\u008f²2X\u008bTâü!%å\u0010\u000b¤ÂªçqNé\u009aÎ°r0ªeL\u00196ât!\u0005Å\u008d"
         .length();
      char var4 = 24;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 94996783804137L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 69908522819314L;
                        }

                        @Override
                        public void IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl(long var1) {
                           long var3 = var1 ^ 139828326808974L;
                           NoRender.INSTANCE.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(var3);
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 98562982537378L;
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
                           String var6 = "ÂÏU\u0081\u0013Èç\u001eT;ÔÜÜ@mFDAãÉ~\u001f\u009aÒ®ò§¬5y\núÔ\u009c¤ÞwHKI¢\u0013._\u0088(]e^O;\u0014Ê+-ª\u000e@ÇOûðKRÂZ¬\u000fg\u0011\u0081ë5r\u009f\u0011f\u008dÅ¶W<×?ü\u001aA½ÀÏFú/Î\bá\u00145yøÝ\u0017¥\u0011Iç¡+þA¾ðþ¸_w¯;íÃ\u0095ê\u0089'¶]8\u001a\u0019H,Ñ\u0010M\u0002)A\u009f§zzhz\u0099qÆ3)ü&Ét Ï\u008f\u000eë\u0019è¨lª]\u0091ëüU\bâæ\u0010\u009e\f\u0099Ðî=½-ûp{\u0006\u0000\u009a";
                           int var8 = "ÂÏU\u0081\u0013Èç\u001eT;ÔÜÜ@mFDAãÉ~\u001f\u009aÒ®ò§¬5y\núÔ\u009c¤ÞwHKI¢\u0013._\u0088(]e^O;\u0014Ê+-ª\u000e@ÇOûðKRÂZ¬\u000fg\u0011\u0081ë5r\u009f\u0011f\u008dÅ¶W<×?ü\u001aA½ÀÏFú/Î\bá\u00145yøÝ\u0017¥\u0011Iç¡+þA¾ðþ¸_w¯;íÃ\u0095ê\u0089'¶]8\u001a\u0019H,Ñ\u0010M\u0002)A\u009f§zzhz\u0099qÆ3)ü&Ét Ï\u008f\u000eë\u0019è¨lª]\u0091ëüU\bâæ\u0010\u009e\f\u0099Ðî=½-ûp{\u0006\u0000\u009a"
                              .length();
                           char var5 = 152;
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
                           char[] var3 = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3[var1x++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8x = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8x & 63));
                                 var3[var1x++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12x = (char)((char)(var5x & 15) << '\f');
                                 byte var9x = var0x[++var4x];
                                 var12x = (char)(var12x | (char)(var9x & 63) << 6);
                                 var9x = var0x[++var4x];
                                 var12x = (char)(var12x | (char)(var9x & 63));
                                 var3[var1x++] = var12x;
                              }
                           }

                           return new String(var3, 0, var1x);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                           int var5x = var0x ^ (int)(var1x & 32767L) ^ 11249;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/features/visuals/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1x >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                              }

                              DESKeySpec var11 = new DESKeySpec(var6x);
                              SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                              ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                              byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x]
                                 .getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9x)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, MutableCallSite var1x, String var2, Object[] var3
                        ) {
                           int var4x = (Integer)var3[0];
                           long var5x = (Long)var3[1];
                           String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                           var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                           return var7x;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1x, MethodType var2
                        ) {
                           MutableCallSite var3 = new MutableCallSite(var2);

                           try {
                              var3.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
                                       0,
                                       var0x,
                                       var3,
                                       var1x
                                    ),
                                    var2
                                 )
                              );
                              return var3;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/visuals/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1x
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[1], var0[2], false);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[0], var0[4], false);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[5], var0[3], false);
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "8ðÔØ´Ú6vËùÑæ\u001c¶A\u009e\u0092H»³\n\u008bò\naÍ\u0015|o\u0005j#Y7XàóÎ¥#òO÷zf\n3©Zû*Q\u001c\u000eivé×\u000bÑhQà\u0004Þì8\u009d\u001b]c\u000f\u0018^\u0086q)Ãûë\u0006c³¹Sb/Ø $\u001cÄ²'UNþ";
                  var7 = "8ðÔØ´Ú6vËùÑæ\u001c¶A\u009e\u0092H»³\n\u008bò\naÍ\u0015|o\u0005j#Y7XàóÎ¥#òO÷zf\n3©Zû*Q\u001c\u000eivé×\u000bÑhQà\u0004Þì8\u009d\u001b]c\u000f\u0018^\u0086q)Ãûë\u0006c³¹Sb/Ø $\u001cÄ²'UNþ"
                     .length();
                  var4 = 'H';
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
