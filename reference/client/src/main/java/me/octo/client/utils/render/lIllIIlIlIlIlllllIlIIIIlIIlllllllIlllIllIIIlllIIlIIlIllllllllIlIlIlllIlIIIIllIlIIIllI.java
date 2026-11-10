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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI
   extends lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll {
   private static long lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = 120750567999459L;
   private static String[] IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static String[] IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private static Map llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new HashMap(13);

   public lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI(
      long argument1Arg,
      @NotNull String titleArg,
      @NotNull String bodyArg,
      @NotNull me.octo.client.utils.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll styleArg
   ) {
      long var6 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI ^ 115819545317947L;
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
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 30155319186342L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 60701327364670L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 32714545072152L;
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
                  String var6 = "BfÜE¥ú·\u0006³DcIßÐxxe\u0086;°qvÝFq/3À?\u001eÔ\u008f(¾=]Í}ã\u001fÒÛMP\u0099\u000e\u0081¡\u0096¯\u008e´ ÚÚr\u0097ðÄÃZº?ôPð?§µplM\u0006";
                  int var8 = "BfÜE¥ú·\u0006³DcIßÐxxe\u0086;°qvÝFq/3À?\u001eÔ\u008f(¾=]Í}ã\u001fÒÛMP\u0099\u000e\u0081¡\u0096¯\u008e´ ÚÚr\u0097ðÄÃZº?ôPð?§µplM\u0006"
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 15672;
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
                           "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
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
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 75836719114009L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 39333094095490L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
                     var1
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 42998945708604L;
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
                  String var6 = "s\u0086Ûí¿\u007f\u0002î\u0092\u0089\u0010iÚó\u0002\u008eY6ÀØD\u0015Ñ±má¾Ò°\u0014\u00adÃH-,fu\nì\u009b û=ü\u0002ìç9àÐÁ<¾°\u009f\u0081JFàÿ~°WQ¤Bþ\u0099\u0086pD±s";
                  int var8 = "s\u0086Ûí¿\u007f\u0002î\u0092\u0089\u0010iÚó\u0002\u008eY6ÀØD\u0015Ñ±má¾Ò°\u0014\u00adÃH-,fu\nì\u009b û=ü\u0002ìç9àÐÁ<¾°\u009f\u0081JFàÿ~°WQ¤Bþ\u0099\u0086pD±s"
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 24768;
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
                           "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                        "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
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
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 5494318215623L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 42848982900924L;
               }

               public final Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
                  return ((me.octo.client.utils.player.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl)this.receiver)
                     .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 25065271237901L;
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
                  String var6x = "|\u0011m\u00adÞá\u0010ïçÓ\u0085ÙSøZè4GÀÝ\u0091í£v\u00ad¾\u008d@å\u001c»8ß\u0088\u009d\u008b\u0088\\#Û 7\u00adm6\u000eXõ·ÁÿU\r3f\u001a\u001cMÿÚg\u008bÿh7×FLÝÛSäá";
                  int var8 = "|\u0011m\u00adÞá\u0010ïçÓ\u0085ÙSøZè4GÀÝ\u0091í£v\u00ad¾\u008d@å\u001c»8ß\u0088\u009d\u008b\u0088\\#Û 7\u00adm6\u000eXõ·ÁÿU\r3f\u001a\u001cMÿÚg\u008bÿh7×FLÝÛSäá"
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 23341;
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
                           "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                        "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
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
         0L,
         0L,
         0L,
         false,
         1920,
         null
      );
   }

   @Override
   public void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI ^ 110364531152140L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "6\u00ad\u0082xÛT3zoÎÉå9.\u001a\u0004\u0010\u008aÿÊc\u0002\u0085\\\u000bÜwçPbûwÄ\u0010¹¥,*\u001b¤þÈ|ö\u0091ÊC{Ô\"";
      int var8 = "6\u00ad\u0082xÛT3zoÎÉå9.\u001a\u0004\u0010\u008aÿÊc\u0002\u0085\\\u000bÜwçPbûwÄ\u0010¹¥,*\u001b¤þÈ|ö\u0091ÊC{Ô\"".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var9;
            IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new String[3];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22581;
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
               "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI", var10
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
            "me/octo/client/utils/render/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
