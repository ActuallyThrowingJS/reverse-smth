package me.octo.client.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
   @NotNull
   public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static File IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private static volatile List<lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 89106778988664L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI() {
   }

   @NotNull
   public final synchronized List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final synchronized void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull List var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 62930810331046L;
      long var6 = var1 ^ 1067569943078L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(29708, 4058113337478860739L ^ var1)
      );
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.toMutableList(var3);

      try {
         String var8 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3, var6);
         String var9 = this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var8);
         File var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Charset var10002 = StandardCharsets.UTF_8;
         Intrinsics.checkNotNullExpressionValue(
            StandardCharsets.UTF_8,
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194295731565559756L ^ var1)
         );
         FilesKt.writeText(var10000, var9, var10002);
      } catch (Exception var10) {
         PolinexLogger.error(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(8422, 5890893296123321135L ^ var1) + var10.getMessage()
         );
      }
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(List var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      JsonArray var5 = new JsonArray();
      Iterable var6 = var1;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         2242670200326220530L, var2
      );
      boolean var7 = false;
      int[] var4 = var10000;

      for (Object var9 : var6) {
         var10000 = var4;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var10 = (lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI)var9;
         boolean var11 = false;
         JsonObject var12 = new JsonObject();
         JsonObject var13 = var12;
         JsonArray var14 = var5;
         boolean var15 = false;

         try {
            if (var10000 == null) {
               var13.addProperty(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(10279, 5873478107572281765L ^ var2),
                  var10.getUuid()
               );
               var13.addProperty(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(8439, 6495684072088545660L ^ var2),
                  var10.getName()
               );
               var13.addProperty(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(21964, 8342153449710935127L ^ var2),
                  var10.getMsaRefreshToken()
               );
               var13.addProperty(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(16224, 3370206541603124973L ^ var2),
                  var10.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
               );
               var14.add((JsonElement)var12);
               if (var4 == null) {
                  continue;
               }
            }
            break;
         } catch (MatchException var16) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var16, 2260491366903308614L, var2
            );
         }
      }

      JsonObject var18 = new JsonObject();
      boolean var19 = false;
      var18.add(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(24809, 6669487677903759732L ^ var2), (JsonElement)var5
      );
      String var21 = var18.toString();
      Intrinsics.checkNotNullExpressionValue(
         var21, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(29650, 6242419814975961691L ^ var2)
      );
      return var21;
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int param1, int param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final byte[] llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, String var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      String var4 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(2791, 4595813864815593180L ^ var1);
      MessageDigest var5 = MessageDigest.getInstance(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(8277, 5681294228719021153L ^ var1)
      );
      Charset var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(
         StandardCharsets.UTF_8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194257130299115553L ^ var1)
      );
      byte[] var8 = var4.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(13375, 2689810834832799752L ^ var1)
      );
      var5.update(var8);
      var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(
         StandardCharsets.UTF_8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194257130299115553L ^ var1)
      );
      byte[] var10 = var3.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(13375, 2689810834832799752L ^ var1)
      );
      var5.update(var10);
      String var11 = System.getProperty(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(25967, 3650748691967207784L ^ var1), ""
      );
      Intrinsics.checkNotNullExpressionValue(
         var11, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(4461, 3356841460205296966L ^ var1)
      );
      String var6 = var11;
      var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(
         StandardCharsets.UTF_8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194257130299115553L ^ var1)
      );
      byte[] var13 = var6.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(
         var13, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(13375, 2689810834832799752L ^ var1)
      );
      var5.update(var13);
      byte[] var10000 = var5.digest();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(825, 1907088098180304656L ^ var1)
      );
      return var10000;
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1, String var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 26853239106703L;
      long var6 = var1 ^ 31131162273867L;
      byte[] var9 = new byte[12];
      boolean var11 = false;
      new SecureRandom().nextBytes(var9);
      Cipher var13 = Cipher.getInstance(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(16631, 2393479759121548519L ^ var1)
      );
      var13.init(
         1,
         new SecretKeySpec(
            this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var6, this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4)
            ),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(20393, 3351674091121773475L ^ var1)
         ),
         new GCMParameterSpec(128, var9)
      );
      Charset var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(
         StandardCharsets.UTF_8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194339754733862930L ^ var1)
      );
      byte[] var15 = var3.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(
         var15, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(6825, 9222556839752720041L ^ var1)
      );
      byte[] var10 = var13.doFinal(var15);
      byte[] var14 = new byte[var9.length + var10.length];
      System.arraycopy(var9, 0, var14, 0, var9.length);
      System.arraycopy(var10, 0, var14, var9.length, var10.length);
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(24829, 1163205227918501099L ^ var1)
         + Base64.getEncoder().encodeToString(var14);
   }

   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      String var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 20630365395699L;
      int var6 = (int)((var2 ^ 57859463906235L) >>> 32);
      int var7 = (int)((var2 ^ 57859463906235L) << 32 >>> 32);
      long var8 = var2 ^ 25286242508343L;
      long var10 = var2 ^ 99359995187367L;
      String var12 = StringsKt.removePrefix(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(24717, 6570444418211042045L ^ var2)
      );
      byte[] var13 = Base64.getDecoder().decode(var12);
      Intrinsics.checkNotNull(var13);
      byte[] var14 = ArraysKt.copyOfRange(var13, 0, 12);
      byte[] var15 = ArraysKt.copyOfRange(var13, 12, var13.length);

      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16;
      try {
         var16 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var10,
               this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
                  var8, this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4)
               ),
               var14,
               var15
            ),
            false
         );
      } catch (Exception var18) {
         var16 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var10,
               this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
                  var8, this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var6, var7)
               ),
               var14,
               var15
            ),
            true
         );
      }

      return var16;
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, byte[] var3, byte[] var4, byte[] var5) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Cipher var6 = Cipher.getInstance(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(18429, 7432458707194447199L ^ var1)
      );
      var6.init(
         2,
         new SecretKeySpec(var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(29462, 3878516815614521771L ^ var1)),
         new GCMParameterSpec(128, var4)
      );
      byte[] var10000 = var6.doFinal(var5);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(444, 1554281657082463001L ^ var1)
      );
      byte[] var7 = var10000;
      Charset var10 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(
         StandardCharsets.UTF_8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(17425, 2194341099536877233L ^ var1)
      );
      Charset var8 = var10;
      return new String(var7, var8);
   }

   static {
      long var20 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 68698382374331L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[33];
      int var16 = 0;
      String var15 = "`\fÒ_hVÌ|\u0015Å$îÁÌ\u00adSë\u001e\u001bÕ\u0087u4ãÒ\u009f<+Q\u009d\u0011ï½¦\u0098ÕM½|¨\u0093 \u0004)Ûíä¯¾£\u0082o\u0087\u000eU\u0091\u0010¸ jú¥\u008d\u0007\u0089@¥ÊÞædA\u0018\u0010ÎÓÊÖ\u0019ë(à^GM\u0087ª\u000b\u0098\u00058º\u007f°j}\u0011:ô0z$Y¾\u0007E\u009b³\n\u0088®\u0094æ÷Í¦a/sãÆ\u009eÜc\u0005\b?\u000ew¥ôïô*õÝ\fo\u001aI¢¼õ\u0085t0R(÷ÝïäWm\u0090ò\u00808³oHo+Oq7b\u009eeÇ6\u0083\u0096Gò©\u0099G\u0082ß\\ÿ\fOßaÉH ZÉ\u0090F\u0093&i®#3\u0085Ï°]bãc¾7¦\u001cºV¡\u0019^þ8~DG\u0005\u0010\u0097\u008d\u0011\u008a¤t\u001a©\u0080GT×ør³J y6Ý.)iR\u0017\bÃ\u0012\u0013\u001e\u008c1gê²8á\u0011\u000e*\u0088°®\u00adqb÷¡Í §DNõ!\\-Y$xÞ\u0092\u0089Ü±q*Ô¾ç\u0086\u008cx>§Ïò\u0010úMB~ ®iÉ\u0092\u0082¨ð\u0082\u001c|æC\u0089Zgû\u0094«Äêô¨wh±\u0000± GÕB\u0017\u0010\u0005¯1cóÜ@^]ºÂµª©T\u001b oÁH\u0012`\u0098ñø\u0007î8a:¡\u000311\u001aÃðT[açÓo\u0001r:ÛHã /wk,Èÿ\u0086ß\u0094ß(\u0014ì5à\r!\u0019öS\u008e\u008e\u0019T_ßn\bºè\u0003;\u0010K\u008d\u00adÿç\u000e¥\u0096·ÄÍùÙ¶µ¡\u0018I#\u0017\u0015Ó\u0096^ÍÞ\u001cÖ\u001bÒ\u009dw¡\u008c8õôª]$8 |\u0006t3ð%\u0004\u0006ÚMÚ#+ë5¢Ëx·¼~C\nìAØÃ\u009cLñ¦Ñ\u0018é×#\u0082\u0002Æà;Ï1RmÙ\u000fçË\u0094ùâØVªÈ-(\u0086gå$ñ9ù\u0081tf£ê\u0084\u0080-GW>q ÙBê$\u001c·;\nÝ\\Aà\u0019õÃqº¢»\u000f\u0018Þ\u008d\u0084\u0093\u0016?æ\u0090è¬8ZÊ\u0004\u008c$}±\bBçàTx\u00109+#\u0092.\u00815}\u0011%ßû¾'õá\u0018nsÌ¤\u0005»í\u0085\u0095¡Áj![\u009a¼ß\u0001lGPè\u0003\u000f0JÅûgj\u000e<ªXrñe\r\u001cOù[p\u0017\u009d\u000f´¥JÁ³\u000f\u0084\u001bm\u001e\u008ejl¹·\u0084\u0017s\u008a\u0092Ý\u0006û,Ð\u0084F\u0010\u0013\u008a*\u0012uWä\u009a<+R·\u0087ÿ\u0013\u0007\u0010³\u0001¤Z,\u008b% ¦û\u0003\b\u0084ÄÈº\u0010î\u0080\u0004]\u0013ÄìE\u0080\u0098éÇär\u008d5\u0018\u0088z\u0083À¢/\u001eý\u0000p\u0011ôU\u001d.\u0098[z\u008f\u0093|!ô®\u0010èRÁ\r\u0099)\u001c~U\t\u0087¢\u0098ùG\u009c(\u0082[g\u001c¾\u009e\u001f4VÞ\u000f\u0099\u0003ñ«Z\u0093QÖ4{F\u0089\u0002l\u0004XP¹¥Z¬#\u000b\u0015SÓSÌ$püÕÑ&æ5\u0095]tKCÌSDÓS\u0097\u0004ÉDë\u008cópçëì{I$ý\u0000¾¦ìÅu\u0011ªî7'ñ\u009fÂ±Øä'Nû\"v\u0007\u0007\u009eÞ\u000fö\u008b\u009fV?kæ?í\u0088\u0012ëÉ\u0096*×\u0091N\u0096«{y»O\u0089\u0084Û-e'¹\u001f\u0005¯AïÆ>\r\u001d3\u0099k%\u007fýg\f\u0091ó7\u0097@Ü \u0091òÝe^fE÷wÙ=ð|uøüäX®Ç*9Õ¦{[.ø\u0090Ìg.\u0010ºñ\u009d\u009f¼O\u008c¿âÅA Öî\u0018å";
      int var17 = "`\fÒ_hVÌ|\u0015Å$îÁÌ\u00adSë\u001e\u001bÕ\u0087u4ãÒ\u009f<+Q\u009d\u0011ï½¦\u0098ÕM½|¨\u0093 \u0004)Ûíä¯¾£\u0082o\u0087\u000eU\u0091\u0010¸ jú¥\u008d\u0007\u0089@¥ÊÞædA\u0018\u0010ÎÓÊÖ\u0019ë(à^GM\u0087ª\u000b\u0098\u00058º\u007f°j}\u0011:ô0z$Y¾\u0007E\u009b³\n\u0088®\u0094æ÷Í¦a/sãÆ\u009eÜc\u0005\b?\u000ew¥ôïô*õÝ\fo\u001aI¢¼õ\u0085t0R(÷ÝïäWm\u0090ò\u00808³oHo+Oq7b\u009eeÇ6\u0083\u0096Gò©\u0099G\u0082ß\\ÿ\fOßaÉH ZÉ\u0090F\u0093&i®#3\u0085Ï°]bãc¾7¦\u001cºV¡\u0019^þ8~DG\u0005\u0010\u0097\u008d\u0011\u008a¤t\u001a©\u0080GT×ør³J y6Ý.)iR\u0017\bÃ\u0012\u0013\u001e\u008c1gê²8á\u0011\u000e*\u0088°®\u00adqb÷¡Í §DNõ!\\-Y$xÞ\u0092\u0089Ü±q*Ô¾ç\u0086\u008cx>§Ïò\u0010úMB~ ®iÉ\u0092\u0082¨ð\u0082\u001c|æC\u0089Zgû\u0094«Äêô¨wh±\u0000± GÕB\u0017\u0010\u0005¯1cóÜ@^]ºÂµª©T\u001b oÁH\u0012`\u0098ñø\u0007î8a:¡\u000311\u001aÃðT[açÓo\u0001r:ÛHã /wk,Èÿ\u0086ß\u0094ß(\u0014ì5à\r!\u0019öS\u008e\u008e\u0019T_ßn\bºè\u0003;\u0010K\u008d\u00adÿç\u000e¥\u0096·ÄÍùÙ¶µ¡\u0018I#\u0017\u0015Ó\u0096^ÍÞ\u001cÖ\u001bÒ\u009dw¡\u008c8õôª]$8 |\u0006t3ð%\u0004\u0006ÚMÚ#+ë5¢Ëx·¼~C\nìAØÃ\u009cLñ¦Ñ\u0018é×#\u0082\u0002Æà;Ï1RmÙ\u000fçË\u0094ùâØVªÈ-(\u0086gå$ñ9ù\u0081tf£ê\u0084\u0080-GW>q ÙBê$\u001c·;\nÝ\\Aà\u0019õÃqº¢»\u000f\u0018Þ\u008d\u0084\u0093\u0016?æ\u0090è¬8ZÊ\u0004\u008c$}±\bBçàTx\u00109+#\u0092.\u00815}\u0011%ßû¾'õá\u0018nsÌ¤\u0005»í\u0085\u0095¡Áj![\u009a¼ß\u0001lGPè\u0003\u000f0JÅûgj\u000e<ªXrñe\r\u001cOù[p\u0017\u009d\u000f´¥JÁ³\u000f\u0084\u001bm\u001e\u008ejl¹·\u0084\u0017s\u008a\u0092Ý\u0006û,Ð\u0084F\u0010\u0013\u008a*\u0012uWä\u009a<+R·\u0087ÿ\u0013\u0007\u0010³\u0001¤Z,\u008b% ¦û\u0003\b\u0084ÄÈº\u0010î\u0080\u0004]\u0013ÄìE\u0080\u0098éÇär\u008d5\u0018\u0088z\u0083À¢/\u001eý\u0000p\u0011ôU\u001d.\u0098[z\u008f\u0093|!ô®\u0010èRÁ\r\u0099)\u001c~U\t\u0087¢\u0098ùG\u009c(\u0082[g\u001c¾\u009e\u001f4VÞ\u000f\u0099\u0003ñ«Z\u0093QÖ4{F\u0089\u0002l\u0004XP¹¥Z¬#\u000b\u0015SÓSÌ$püÕÑ&æ5\u0095]tKCÌSDÓS\u0097\u0004ÉDë\u008cópçëì{I$ý\u0000¾¦ìÅu\u0011ªî7'ñ\u009fÂ±Øä'Nû\"v\u0007\u0007\u009eÞ\u000fö\u008b\u009fV?kæ?í\u0088\u0012ëÉ\u0096*×\u0091N\u0096«{y»O\u0089\u0084Û-e'¹\u001f\u0005¯AïÆ>\r\u001d3\u0099k%\u007fýg\f\u0091ó7\u0097@Ü \u0091òÝe^fE÷wÙ=ð|uøüäX®Ç*9Õ¦{[.ø\u0090Ìg.\u0010ºñ\u009d\u009f¼O\u008c¿âÅA Öî\u0018å"
         .length();
      char var14 = '8';
      int var28 = -1;

      label62:
      while (true) {
         String var29 = var15.substring(++var28, var28 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var39 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var39;
                  if ((var28 += var14) >= var17) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var18;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[33];
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "PNXA1";
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
                     String var5 = "+ª\u0089\u008a\u0083\u008e¤îÍº\u0098æK*!Õ";
                     int var6 = "+ª\u0089\u008a\u0083\u008e¤îÍº\u0098æK*!Õ".length();
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
                        byte var44 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)var0[0];
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)var0[1];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI();
                     File var22 = new File(ModUtils.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, "accounts.json");
                     File var23 = var22;
                     boolean var24 = false;

                     try {
                        File var32 = var23.getParentFile();
                        if (var32 != null) {
                           var32.mkdirs();
                        }
                     } catch (MatchException var26) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26);
                     }

                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var22;
                     return;
                  }

                  var14 = var15.charAt(var28);
                  break;
               default:
                  var18[var16++] = var39;
                  if ((var28 += var14) < var17) {
                     var14 = var15.charAt(var28);
                     continue label62;
                  }

                  var15 = "Yy&±\u0085h\u0090ô\u001c¢ùM¡t\u0010D$\u0086Jó©X¾V \u0092\u001cñ\u0082þÄg°s¦·\u0007Ô´Í¤ºõ'\u007f¹0@©z\\57B\u000e¾z";
                  var17 = "Yy&±\u0085h\u0090ô\u001c¢ùM¡t\u0010D$\u0086Jó©X¾V \u0092\u001cñ\u0082þÄg°s¦·\u0007Ô´Í¤ºõ'\u007f¹0@©z\\57B\u000e¾z".length();
                  var14 = 24;
                  var28 = -1;
            }

            var29 = var15.substring(++var28, var28 + var14);
            var10001 = 0;
         }
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
      return var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5355;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/utils/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
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

   private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/utils/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @NotNull
   public final synchronized List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2438e9dbfc6dbedf(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$bb60550d036552e3(
      String var1, long var2
   ) {
      var2 = 106514424170235L;
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 20630365395699L;
      int var6 = (int)((var2 ^ 57859463906235L) >>> 32);
      int var7 = (int)((var2 ^ 57859463906235L) << 32 >>> 32);
      long var8 = var2 ^ 25286242508343L;
      long var10 = var2 ^ 99359995187367L;
      String var12 = StringsKt.removePrefix(var1, "PNXA1:");
      byte[] var13 = Base64.getDecoder().decode(var12);
      Intrinsics.checkNotNull(var13);
      byte[] var14 = ArraysKt.copyOfRange(var13, 0, 12);
      byte[] var15 = ArraysKt.copyOfRange(var13, 12, var13.length);

      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16;
      try {
         var16 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4fe8228dc18198bd(
               var10,
               this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$8c36ba2576524782(
                  var8, this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b26355380d3bc7c8(var4)
               ),
               var14,
               var15
            ),
            false
         );
      } catch (Exception var18) {
         var16 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4fe8228dc18198bd(
               var10,
               this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$8c36ba2576524782(
                  var8, this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var6, var7)
               ),
               var14,
               var15
            ),
            true
         );
      }

      return var16;
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2eb9cc5bea5b1d07(
      long param1, String param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final synchronized void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$8d0625e82b76ca4c(
      long argument1Arg, @NotNull List accountsArg
   ) {
      argument1Arg = 2499725791065L;
      argument1Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument1Arg;
      long var4 = argument1Arg ^ 62930810331046L;
      long var6 = argument1Arg ^ 1067569943078L;
      Intrinsics.checkNotNullParameter(accountsArg, "accounts");
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.toMutableList(accountsArg);

      try {
         String var8 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$23553125425dab1b(accountsArg, var6);
         String var9 = this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$d298f019a6fda836(var4, var8);
         File var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Charset var10002 = StandardCharsets.UTF_8;
         Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
         FilesKt.writeText(var10000, var9, var10002);
      } catch (Exception var10) {
         PolinexLogger.error("Failed to save accounts.json: " + var10.getMessage());
      }
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b26355380d3bc7c8(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final byte[] llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$8c36ba2576524782(long var1, String var3) {
      var1 = 43063254890676L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      String var4 = "ed3c9307d187586b60fea3617c0ddb3f65d21baa9c9df2d67071420b3ac99d41";
      MessageDigest var5 = MessageDigest.getInstance("SHA-256");
      Charset var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
      byte[] var9 = var4.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(var9, "getBytes(...)");
      var5.update(var9);
      var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
      byte[] var11 = var3.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(var11, "getBytes(...)");
      var5.update(var11);
      String var12 = System.getProperty("user.name", "");
      Intrinsics.checkNotNullExpressionValue(var12, "getProperty(...)");
      String var6 = var12;
      var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
      byte[] var14 = var6.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(var14, "getBytes(...)");
      var5.update(var14);
      byte[] var10000 = var5.digest();
      Intrinsics.checkNotNullExpressionValue(var10000, "digest(...)");
      return var10000;
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4fe8228dc18198bd(
      long var1, byte[] var3, byte[] var4, byte[] var5
   ) {
      var1 = 118245125649956L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Cipher var6 = Cipher.getInstance("AES/GCM/NoPadding");
      var6.init(2, new SecretKeySpec(var3, "AES"), new GCMParameterSpec(128, var4));
      byte[] var10000 = var6.doFinal(var5);
      Intrinsics.checkNotNullExpressionValue(var10000, "doFinal(...)");
      byte[] var7 = var10000;
      Charset var11 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
      Charset var8 = var11;
      return new String(var7, var8);
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$23553125425dab1b(List var1, long var2) {
      var2 = 92034078391559L;
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      JsonArray var5 = new JsonArray();
      Iterable var6 = var1;
      int[] var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
      boolean var7 = false;
      int[] var4 = var10000;

      for (Object var9 : var6) {
         var10000 = var4;
         lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var10 = (lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI)var9;
         boolean var11 = false;
         JsonObject var12 = new JsonObject();
         JsonObject var13 = var12;
         JsonArray var14 = var5;
         boolean var15 = false;

         try {
            if (var10000 == null) {
               var13.addProperty("uuid", var10.getUuid());
               var13.addProperty("name", var10.getName());
               var13.addProperty("msaRefreshToken", var10.getMsaRefreshToken());
               var13.addProperty("isOriginal", var10.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl());
               var14.add((JsonElement)var12);
               if (var4 == null) {
                  continue;
               }
            }
            break;
         } catch (MatchException var17) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var17);
         }
      }

      JsonObject var20 = new JsonObject();
      boolean var21 = false;
      var20.add("accounts", (JsonElement)var5);
      String var23 = var20.toString();
      Intrinsics.checkNotNullExpressionValue(var23, "toString(...)");
      return var23;
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$d298f019a6fda836(long var1, String var3) {
      var1 = 117033332404359L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 26853239106703L;
      long var6 = var1 ^ 31131162273867L;
      byte[] var9 = new byte[12];
      boolean var11 = false;
      new SecureRandom().nextBytes(var9);
      Cipher var14 = Cipher.getInstance("AES/GCM/NoPadding");
      var14.init(
         1,
         new SecretKeySpec(
            this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$8c36ba2576524782(
               var6, this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b26355380d3bc7c8(var4)
            ),
            "AES"
         ),
         new GCMParameterSpec(128, var9)
      );
      Charset var10001 = StandardCharsets.UTF_8;
      Intrinsics.checkNotNullExpressionValue(StandardCharsets.UTF_8, "UTF_8");
      byte[] var16 = var3.getBytes(var10001);
      Intrinsics.checkNotNullExpressionValue(var16, "getBytes(...)");
      byte[] var10 = var14.doFinal(var16);
      byte[] var15 = new byte[var9.length + var10.length];
      System.arraycopy(var9, 0, var15, 0, var9.length);
      System.arraycopy(var10, 0, var15, var9.length, var10.length);
      return "PNXA1:" + Base64.getEncoder().encodeToString(var15);
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final String json;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 39567805383716L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull String jsonArg, boolean argument2Arg) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 133019603452169L;
         Intrinsics.checkNotNullParameter(jsonArg, "json");
         super();
         this.json = jsonArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
      }

      @NotNull
      public final String getJson() {
         return this.json;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, boolean var2, long var3
      ) {
         var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var3;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(15433, 7704008440025985824L ^ var3)
         );
         return new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 130046255385315L;
         return "DecryptResult(json="
            + this.json
            + ", legacy="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.json.hashCode();
         return var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 111991085877893L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = "\u0083\u0083\u0099±\u0018\u008fp\u0098+#\u0019e\u0090¯\u0013\u0086\u000f1¼ûTþTM\u0010íEÞæ½ì£5¯h\u0013¯Bzn\u0015";
         int var8 = "\u0083\u0083\u0099±\u0018\u008fp\u0098+#\u0019e\u0090¯\u0013\u0086\u000f1¼ûTþTM\u0010íEÞæ½ì£5¯h\u0013¯Bzn\u0015".length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "Ê\u0018aÎ¨»Òã¹:{#\u0098\u009fÌ\u009e}\u0011$óoÂåZÿ»\u0014ª?U\u0091ìKèSÍnL½9\u0010\u001bä\u0013ÒK\u009cKNá®´¼n\"\u0014Á";
               var8 = "Ê\u0018aÎ¨»Òã¹:{#\u0098\u009fÌ\u009e}\u0011$óoÂåZÿ»\u0014ª?U\u0091ìKèSÍnL½9\u0010\u001bä\u0013ÒK\u009cKNá®´¼n\"\u0014Á".length();
               var5 = '(';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 23745;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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

      private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
         MutableCallSite var3 = new MutableCallSite(var2);

         try {
            var3.setTarget(
               MethodHandles.explicitCastArguments(
                  MethodHandles.insertArguments(
                     "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
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
               "me/octo/client/utils/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
