package me.octo.client.utils.render;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.endgameGUI.ThemeColors;
import me.octo.client.utils.render.colors.Color;
import me.octo.client.utils.render.shapes.NVGRenderer;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII
   extends lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll {
   private static long lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = 15614658857795L;
   private static String[] IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static String[] IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private static Map llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new HashMap(13);
   private static long[] llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private static Long[] IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private static Map lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;

   public IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII(
      long argument1Arg,
      @NotNull String titleArg,
      @NotNull String bodyArg,
      @NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll styleArg
   ) {
      long var6 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI ^ 21264319379813L;
      Intrinsics.checkNotNullParameter(titleArg, "title");
      Intrinsics.checkNotNullParameter(bodyArg, "body");
      Intrinsics.checkNotNullParameter(styleArg, "style");
      super(
         argument1Arg,
         titleArg,
         bodyArg,
         styleArg,
         (Function1)(
            new Function1<Float, Float>(
               me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            ) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 92128894556633L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 20217271588370L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 33695976051079L;
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
                  String var6 = "~\u0093eÉ\u0098ÓìIøøn\u0091a\u0086k<¯\u001dìry\u0085\u00057ÿk ½«oÿÉ\u0007H°Ý\u0004¤`\u0095\u0018¹a¹)\u0007#%â\f\u001bÔf&6,s\u0085\"{\u009a\u008e\fÜÎ";
                  int var8 = "~\u0093eÉ\u0098ÓìIøøn\u0091a\u0086k<¯\u001dìry\u0085\u00057ÿk ½«oÿÉ\u0007H°Ý\u0004¤`\u0095\u0018¹a¹)\u0007#%â\f\u001bÔf&6,s\u0085\"{\u009a\u008e\fÜÎ"
                     .length();
                  char var5 = '(';
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[2];
                        return;
                     }

                     var5 = var6.charAt(var4);
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

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 19064;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                           var10
                        );
                     }

                     byte[] var6 = new byte[8];
                     var6[0] = (byte)(var1 >>> 56);

                     for (int var7 = 1; var7 < 8; var7++) {
                        var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
                     }

                     DESKeySpec var11 = new DESKeySpec(var6);
                     SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
                     ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                     throw new RuntimeException(
                        "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }
            }
         ),
         (Function1)(
            new Function1<Float, Float>(
               me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            ) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 46100760727004L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 118632937213223L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
                     var1
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 24386624157908L;
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
                  String var6 = "UÉ\u0011¸\u0093ËS>¸W\u0094ÿ5Oµ£ÎØ\u000e¶©\u009f\u0018ÉÔ\fãâ<á\u0005\u00ad(?÷ö\u0088\u008bÝ\u0081ºp\tÍY\u0098-@;êÌ\u0089ÐÐÿ\u0089¼Ì\u0099?ýðÎ\t|N·\u0015;=\u0019Q\u001d";
                  int var8 = "UÉ\u0011¸\u0093ËS>¸W\u0094ÿ5Oµ£ÎØ\u000e¶©\u009f\u0018ÉÔ\fãâ<á\u0005\u00ad(?÷ö\u0088\u008bÝ\u0081ºp\tÍY\u0098-@;êÌ\u0089ÐÐÿ\u0089¼Ì\u0099?ýðÎ\t|N·\u0015;=\u0019Q\u001d"
                     .length();
                  char var5 = ' ';
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[2];
                        return;
                     }

                     var5 = var6.charAt(var4);
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

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 2833;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                           var10
                        );
                     }

                     byte[] var6 = new byte[8];
                     var6[0] = (byte)(var1 >>> 56);

                     for (int var7 = 1; var7 < 8; var7++) {
                        var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
                     }

                     DESKeySpec var11 = new DESKeySpec(var6);
                     SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
                     ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                     throw new RuntimeException(
                        "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }
            }
         ),
         (Function1)(
            new Function1<Float, Float>(
               me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            ) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 25015256441376L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 126676464292255L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 130137300728699L;
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
                  String var6x = "\u0087\u0018¼´çB\u0080\u001bÐq$\u007fqþ{Èì\u000eË\u0093o\u0018\u001a\u0012ökH\u0081gÊ¼å±?\u0091QÑÏ%\u009e u1\u008b\u0090f\u009aGa\u0017\u0090#Wip\u0019|ÕäÝÁNgVß»rc\u008fç3¨¶";
                  int var8 = "\u0087\u0018¼´çB\u0080\u001bÐq$\u007fqþ{Èì\u000eË\u0093o\u0018\u001a\u0012ökH\u0081gÊ¼å±?\u0091QÑÏ%\u009e u1\u008b\u0090f\u009aGa\u0017\u0090#Wip\u0019|ÕäÝÁNgVß»rc\u008fç3¨¶"
                     .length();
                  char var5 = '(';
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6x.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[2];
                        return;
                     }

                     var5 = var6x.charAt(var4);
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
                        char var6x = (char)((char)(var5 & 31) << 6);
                        byte var8 = var0[++var4];
                        var6x = (char)(var6x | (char)(var8 & 63));
                        var3[var1++] = var6x;
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 2061;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
                           var10
                        );
                     }

                     byte[] var6x = new byte[8];
                     var6x[0] = (byte)(var1 >>> 56);

                     for (int var7 = 1; var7 < 8; var7++) {
                        var6x[var7] = (byte)(var1 << var7 * 8 >>> 56);
                     }

                     DESKeySpec var11 = new DESKeySpec(var6x);
                     SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
                     ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                     throw new RuntimeException(
                        "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }
            }
         ),
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(28233, 7740091755297275317L ^ var6),
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(24934, 1854924403025343128L ^ var6),
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(28962, 2421984000275145439L ^ var6),
         false,
         1024,
         null
      );
   }

   @Override
   public void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long var1) {
      long var3 = var1 ^ 113663609032850L;
      int var5 = (int)((var1 ^ 64374516719841L) >>> 48);
      long var6 = (var1 ^ 64374516719841L) << 16 >>> 16;
      long var10001 = var1 ^ 60383288104342L;
      int var8 = (int)((var1 ^ 60383288104342L) >>> 32);
      int var9 = (int)((var1 ^ 60383288104342L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 136229884301035L;
      long var13 = var1 ^ 28518286767254L;
      long var15 = var1 ^ 83862409011617L;
      var10001 = var1 ^ 33687979632343L;
      int var17 = (int)((var1 ^ 33687979632343L) >>> 32);
      int var18 = (int)((var1 ^ 33687979632343L) << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      NVGRenderer.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var11);
      float var20 = this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll()
         + this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() / 2.0F;
      float var21 = this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         + this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() / 2.0F;
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8, var9, (short)var10, var20, var21);
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(),
            var13,
            this.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl()
         );
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8, var9, (short)var10, -var20, -var21);
      float var22 = ThemeColors.INSTANCE.lIIIIllllIIlIlIIIlllIIIIlIlllIIIIlIllIIllIlIlIIIIIlIllIllllIIIlIllIIIIllIIIIIlllIlIII();
      Color var23 = new Color(this.getStyle().IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI());
      float var24 = 1.0F - this.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI();
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            (char)var5,
            this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(),
            this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(),
            this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
            12.0F,
            1.0F,
            var6,
            var22
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var17,
            this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(),
            this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(),
            this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
            (char)var18,
            ThemeColors.INSTANCE
               .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            (short)var19,
            ThemeColors.INSTANCE
               .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F),
            me.octo.client.utils.render.shapes.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
            var22
         );
      NVGRenderer.hollowRect(
         this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
         this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(),
         this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(),
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         1.0F,
         ThemeColors.INSTANCE
            .IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F + 0.15F * var24),
         var22
      );
      NVGRenderer.rect(
         this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
         this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(),
         this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(),
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         var23.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.04F * var24),
         var22
      );
      float var25 = this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() + 14.0F;
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
         this.getTitle(),
         var25,
         var3,
         this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() + 14.0F,
         ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         false,
         16,
         null
      );
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
         this.getBody(),
         var25,
         var3,
         this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() + 36.0F,
         ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         false,
         16,
         null
      );
      float var26 = this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         + this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
         - 10.0F;
      float var27 = this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() + 14.0F;
      float var28 = this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll()
         + this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl()
         - 14.0F;
      float var29 = var28 - var27;
      float var30 = var29 * var24;
      NVGRenderer.rect(
         var27,
         var26,
         var29,
         1.5F,
         ThemeColors.INSTANCE
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.35F),
         1.0F
      );
      NVGRenderer.rect(
         var27, var26, var30, 1.5F, var23.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F + 0.25F * var24), 1.0F
      );
      NVGRenderer.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var15);
   }

   static {
      long var11 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI ^ 134463108392035L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[3];
      int var18 = 0;
      String var17 = "{|£\u0085\u0086´ý\u0099Ä\u0093O\u009f\u0096:¾C\u0010k7pe$F_,\u0092Ü\u00887\u0083ÿÿl\u0010\u0012ë\u0015·\u000e(Ñ\u0012¾y\u0088sw°÷\f";
      int var19 = "{|£\u0085\u0086´ý\u0099Ä\u0093O\u009f\u0096:¾C\u0010k7pe$F_,\u0092Ü\u00887\u0083ÿÿl\u0010\u0012ë\u0015·\u000e(Ñ\u0012¾y\u0088sw°÷\f"
         .length();
      char var16 = 16;
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var27 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var21).intern();
         int var10001 = -1;
         var20[var18++] = var27;
         if ((var15 += var16) >= var19) {
            IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var20;
            IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new String[3];
            lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = new HashMap(13);
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var1 = 1; var1 < 8; var1++) {
               var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long[] var6 = new long[3];
            int var3 = 0;
            String var4 = "k\u0014\u0005\u0084î:]ä<}J\u0092\u00ad\u0019w\u0088y1¡\u0001 \u00053¸";
            int var5 = "k\u0014\u0005\u0084î:]ä<}J\u0092\u00ad\u0019w\u0088y1¡\u0001 \u00053¸".length();
            byte var2 = 0;

            do {
               var10001 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
               var10001 = var3++;
               long var8 = (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L;
               byte[] var10 = var0.doFinal(
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
               byte var31 = -1;
               var6[var10001] = var10004;
            } while (var2 < var5);

            llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var6;
            IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new Long[3];
            return;
         }

         var16 = var17.charAt(var15);
      }
   }

   private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(byte[] var0) {
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

   private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25665;
      if (IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII", var10
            );
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var5].getBytes("ISO-8859-1");
         IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
         throw new RuntimeException(
            "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8666;
      if (IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI[var3] = var15;
      }

      return IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI[var3];
   }

   private static long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll".asCollector(Object[].class, var2.parameterCount()),
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
         throw new RuntimeException(
            "me/octo/client/utils/render/IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
