package me.octo.client.utils;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 66421267802419L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Vec3 var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423252938848104833L ^ var1)
      );
      return var3.x;
   }

   public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull Vec3 var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423162578014326185L ^ var2)
      );
      return var1.y;
   }

   public final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1, @NotNull Vec3 var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423179424272680706L ^ var1)
      );
      return var3.z;
   }

   @NotNull
   public final Vec3 IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull Vec3 var1, long var2, int var4) {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423205371073499941L ^ var5)
      );
      return new Vec3(-var1.x, -var1.y, -var1.z);
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Vec3 var3, @NotNull Vec3 var4) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423202564390282008L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(28968, 8940694312380595770L ^ var1)
      );
      Vec3 var10000 = var3.subtract(var4);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(12890, 1732828822956359005L ^ var1)
      );
      return var10000;
   }

   @NotNull
   public final Vec3 lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull Vec3 var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423162365625101772L ^ var2)
      );
      return new Vec3(Math.floor(var1.x), Math.floor(var1.y), Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var1, @NotNull Vec3 var2, int var3, double var4, char var6
   ) {
      long var7 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var6 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423247101057441497L ^ var7)
      );
      return new Vec3(var2.x, var4, var2.z);
   }

   public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull Vec3 var1, long var2, @NotNull Vec3 var4) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(23151, 3675097492503624641L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(29687, 8699450009208672862L ^ var2)
      );
      double var5 = var1.x - var4.x;
      double var7 = var1.z - var4.z;
      return Math.sqrt(var5 * var5 + var7 * var7);
   }

   public final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull Vec3 var1, @NotNull Vec3 var2, long var3) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423223284930943447L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(28968, 8940717434851755253L ^ var3)
      );
      double var5 = var1.x - var2.x;
      double var7 = var1.z - var2.z;
      return var5 * var5 + var7 * var7;
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 var1, @NotNull Vec3 var2, int var3, int var4, double var5
   ) {
      long var7 = ((long)var3 << 32 | (long)var4 << 32 >>> 32) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423162966014544660L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(28595, 1089491460894574777L ^ var7)
      );
      return new Vec3(var1.x + (var2.x - var1.x) * var5, var2.y, var1.z + (var2.z - var1.z) * var5);
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param1, @NotNull Vec3 param2, int param3, @NotNull Vec3 param4, byte param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1, float var2) {
      double var3 = -((float)Math.cos(-var2 * (float) (Math.PI / 180.0)));
      return new Vec3(
         (float)Math.sin(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI) * var3,
         (float)Math.sin(-var2 * (float) (Math.PI / 180.0)),
         (float)Math.cos(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI) * var3
      );
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, @NotNull Vec3 param2, @NotNull Vec3 param3, int param4, @NotNull Vec3 param5, boolean param6, char param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param1, long param2, @NotNull Vec3 param4, @NotNull Vec3 param5, boolean param6, boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Vec3 param1, long param2, @NotNull Vec3 param4, @NotNull Vec3 param5, boolean param6, boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param1, @NotNull Vec3 param2, double param3, double param5, long param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final BlockPos IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      @NotNull Vec3 var1, int var2, short var3, short var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423231450765335426L ^ var5)
      );
      return new BlockPos((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Vec3 var1, @NotNull Vec3 var2, int var3, short var4, int var5, double var6
   ) {
      long var8 = ((long)var3 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(11799, 1416945486454030288L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(21470, 64869541597610527L ^ var8)
      );
      Vec3 var10000 = var1.add(var2.x * var6, var2.y * var6, var2.z * var6);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(8802, 3066114112200569766L ^ var8)
      );
      return var10000;
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 var1, @NotNull Vec3 var2, long var3, int var5
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(22015, 2920645975196149455L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(11952, 3660153603423395218L ^ var3)
      );
      Vec3 var10000 = var1.add(var2.x * var5, var2.y * var5, var2.z * var5);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(8802, 3066130228413288775L ^ var3)
      );
      return var10000;
   }

   @NotNull
   public final Matrix4f IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Matrix4f var1, long var2, @NotNull Vec3 var4
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(27676, 1423244322570048360L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(22015, 2920714300828068500L ^ var2)
      );
      Matrix4f var10000 = var1.translate((float)var4.x, (float)var4.y, (float)var4.z);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(2323, 2742151143416166003L ^ var2)
      );
      return var10000;
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 107256219065308L;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(13197, 572328418988386477L ^ var2)
      );
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3589103097202753603L, var2
      );
      CharSequence var10001 = var1;
      String[] var8 = new String[]{","};
      Iterable var21 = StringsKt.split$default(var10001, var8, false, 0, 6, null);
      boolean var9 = false;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var6 = var10000;
      Collection var11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var21, 10));
      boolean var12 = false;
      Iterator var13 = var21.iterator();

      while (true) {
         if (var13.hasNext()) {
            Object var14 = var13.next();
            var24 = var11;
            if (var6 != null) {
               break;
            }

            String var15 = (String)var14;
            boolean var16 = false;
            var11.add(StringsKt.trim(var15).toString());
            if (var6 == null) {
               continue;
            }
         }

         var24 = var11;
         break;
      }

      List var7 = (List)var24;

      label47: {
         try {
            if (var6 != null) {
               return new Vec3(0.0, 0.0, 0.0);
            }

            if (var7.size() >= 3) {
               break label47;
            }
         } catch (NumberFormatException var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, -3496209967866975016L, var2
            );
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(7721, 3105324094558127371L ^ var2), var4
         );
         return new Vec3(0.0, 0.0, 0.0);
      }

      try {
         double var22 = Double.parseDouble((String)var7.get(0));
         double var10 = Double.parseDouble((String)var7.get(1));
         double var23 = Double.parseDouble((String)var7.get(2));
         return new Vec3(var22, var10, var23);
      } catch (NumberFormatException var18) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(5157, 3440542169530584849L ^ var2), var4
         );
         return new Vec3(0.0, 0.0, 0.0);
      }
   }

   static {
      long var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 92481463555064L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[27];
      int var7 = 0;
      String var6 = "µ¾h'øqU\bé\u0011@\u0089ëU\u0099k\u0010î-lMàÈÿëDp¸~~H¾t@1\u0080\u0013D\u0093vµ\u0002ÆËQRô£¹\u00834mûO»û\u0098\u0093Kª\u0085jÑÎ\u009c@°P×\u001b¬\rT\u009f\u000eEyªr\fÖÖºêpv\u008f\u001c\u001cqÀî \u009b¤?\u008f\u0005\u0010´Ñ,òÏ\r1r¸ T»ë¸}\u0095 ®Ç¡:\u0093è\u0004`\u0010°¯M\u0086~öà*\u000f{(\u0013ä¡A\u0084\n\u0007\u0005©4§\u007f\u0010-}Ö,ÆX\u009dæ\u0017Ð\u0007\u0002\r\u000fÒ\u0014\u0010¿\u00147ª\u001eö?Ç\u0003Ñ\f\u008dF\u0084\u0019'\u0010FÁ¿I\u0016\u001f'S\u0018\u008dòö8\u009bAn\u0018\u0084è\u0015\u009cJñ0ù\u009bßZ\"ýVV¢ùÛßÔúZÃ8\u0010)¥\u0082´\u0085SÝ(ý\u0089!üJMÄ·\u0018óo\u001dó\u0099kp\u0018Ã\u0085Ö\u009c\u001a\u0099\u001b#É&\u0012s±tË¥ XË³n¹NbÒÜEÐþáOÿÓ\u000fé\u0096\n\u0004\u0006Ø\u0095>ê\u0017¯õnÑ\u0005\u0010\u0099\u00870ü\u008fË;Ì\u001fÔ6&hÈ5Ê\u0018©\u009aáÐª\u0005?o6X¡Ð\bÔãúà;¼\u0011ªóú\u001d\u0010Xc\b|ýO\u0011ÞK\u0091þ§KQ\u0013- )tL\u0082NÑ\u0088¤y¶9åÕ&lê:E\u0012/=\u0015ä\f  \u0012\u000b\u00150\u0018>\u0010&Ô\u0080\u0013¦\u008dÍ\u00adLíÉ¥êO¹$\u0010Cºß\u001c\u0001\u0005Í+t,!\u0086ó\u0004O\u001e\u0010\u0088M\u001fê\u001b\u00149\u008c\u001bm@RN)\u007fY\u0018ÿ@tFÙ² \u0003\ff¤\u0093mým# \u0093f¬\u0098%-Á@P1\u0014¦\u001f\u008e\u0082J\u0007Þµ/©P\u0091\u0082\fþ\\ï3{\u0005§\"q`c\u0016\u009d\u0016Ý\u0001\u0016s:\u0017²T¢rW\u00975rýÒ:\u001e\tªº\u0002Ùbh\u0084Ác\u0016§m\u0095Ó\u0010ÝÝòÃ³â\u0092TðÞ\u0019¡\u000f\u0088³û\u0010\u0088\u000f\u009f+21©Ï¶§ç/bò^S\u0018°\u001eth\u0095\u008fi\u009arÃ/\u008d\u0000áÀ5>\u001b\u0089#\u008f´+é\u0010Îå\u009fß£®Õ?îææÀvç\u0095¥";
      int var8 = "µ¾h'øqU\bé\u0011@\u0089ëU\u0099k\u0010î-lMàÈÿëDp¸~~H¾t@1\u0080\u0013D\u0093vµ\u0002ÆËQRô£¹\u00834mûO»û\u0098\u0093Kª\u0085jÑÎ\u009c@°P×\u001b¬\rT\u009f\u000eEyªr\fÖÖºêpv\u008f\u001c\u001cqÀî \u009b¤?\u008f\u0005\u0010´Ñ,òÏ\r1r¸ T»ë¸}\u0095 ®Ç¡:\u0093è\u0004`\u0010°¯M\u0086~öà*\u000f{(\u0013ä¡A\u0084\n\u0007\u0005©4§\u007f\u0010-}Ö,ÆX\u009dæ\u0017Ð\u0007\u0002\r\u000fÒ\u0014\u0010¿\u00147ª\u001eö?Ç\u0003Ñ\f\u008dF\u0084\u0019'\u0010FÁ¿I\u0016\u001f'S\u0018\u008dòö8\u009bAn\u0018\u0084è\u0015\u009cJñ0ù\u009bßZ\"ýVV¢ùÛßÔúZÃ8\u0010)¥\u0082´\u0085SÝ(ý\u0089!üJMÄ·\u0018óo\u001dó\u0099kp\u0018Ã\u0085Ö\u009c\u001a\u0099\u001b#É&\u0012s±tË¥ XË³n¹NbÒÜEÐþáOÿÓ\u000fé\u0096\n\u0004\u0006Ø\u0095>ê\u0017¯õnÑ\u0005\u0010\u0099\u00870ü\u008fË;Ì\u001fÔ6&hÈ5Ê\u0018©\u009aáÐª\u0005?o6X¡Ð\bÔãúà;¼\u0011ªóú\u001d\u0010Xc\b|ýO\u0011ÞK\u0091þ§KQ\u0013- )tL\u0082NÑ\u0088¤y¶9åÕ&lê:E\u0012/=\u0015ä\f  \u0012\u000b\u00150\u0018>\u0010&Ô\u0080\u0013¦\u008dÍ\u00adLíÉ¥êO¹$\u0010Cºß\u001c\u0001\u0005Í+t,!\u0086ó\u0004O\u001e\u0010\u0088M\u001fê\u001b\u00149\u008c\u001bm@RN)\u007fY\u0018ÿ@tFÙ² \u0003\ff¤\u0093mým# \u0093f¬\u0098%-Á@P1\u0014¦\u001f\u008e\u0082J\u0007Þµ/©P\u0091\u0082\fþ\\ï3{\u0005§\"q`c\u0016\u009d\u0016Ý\u0001\u0016s:\u0017²T¢rW\u00975rýÒ:\u001e\tªº\u0002Ùbh\u0084Ác\u0016§m\u0095Ó\u0010ÝÝòÃ³â\u0092TðÞ\u0019¡\u000f\u0088³û\u0010\u0088\u000f\u009f+21©Ï¶§ç/bò^S\u0018°\u001eth\u0095\u008fi\u009arÃ/\u008d\u0000áÀ5>\u001b\u0089#\u008f´+é\u0010Îå\u009fß£®Õ?îææÀvç\u0095¥"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "î\b\b>ð¨:k\u0005\u00ad1¯Ñ\u0013üÊ\u001c,\u000e®ÇÌ\u001fÞ\"N\u0095¯\u0000ºR\u000e\u0010W\u0001\té\u001cx\u009e\u001f\u008a\u0080\u0015CÂÚôM";
            var8 = "î\b\b>ð¨:k\u0005\u00ad1¯Ñ\u0013üÊ\u001c,\u000e®ÇÌ\u001fÞ\"N\u0095¯\u0000ºR\u000e\u0010W\u0001\té\u001cx\u009e\u001f\u008a\u0080\u0015CÂÚôM"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9;
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[27];
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NumberFormatException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(NumberFormatException var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5808;
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
            throw new RuntimeException("me/octo/client/utils/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10);
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
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/utils/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$463f7fc24e7b0e7c(
      @NotNull Vec3 argument1Arg, long argument2Arg, @NotNull Vec3 otherArg
   ) {
      argument2Arg = 39964747865663L;
      argument2Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument2Arg;
      Intrinsics.checkNotNullParameter(argument1Arg, "<this>");
      Intrinsics.checkNotNullParameter(otherArg, "other");
      double var5 = argument1Arg.x - otherArg.x;
      double var7 = argument1Arg.z - otherArg.z;
      return Math.sqrt(var5 * var5 + var7 * var7);
   }

   public static ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0f38cb7797374b54(
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var0,
      Vec3 var1,
      Vec3 var2,
      double var3,
      long var5,
      double var7,
      int var9,
      Object var10
   ) {
      var5 = 64519173705858L;
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var11 = var5 ^ 75630838832343L;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var13 = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      int var10000;
      byte var10001;
      label25: {
         label24: {
            try {
               var10000 = var9;
               var10001 = 4;
               if (var13 != null) {
                  break label25;
               }

               if ((var9 & 4) == 0) {
                  break label24;
               }
            } catch (NumberFormatException var15) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15);
            }

            var3 = 0.1;
         }

         var10000 = var9;
         var10001 = 8;
      }

      if ((var10000 & var10001) != 0) {
         var7 = 0.0;
      }

      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5e573d54f93f6798(
         var1, var2, var3, var7, var11
      );
   }

   public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1b7777f92ce04f0c(
      @NotNull Vec3 argument1Arg, long argument2Arg, @NotNull Vec3 vec2Arg, @NotNull Vec3 fromArg, boolean argument5Arg, boolean argument6Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6af7b8841764bbc1(
      long var1, @NotNull Vec3 var3
   ) {
      var1 = 18614463308313L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(var3, "<this>");
      return var3.x;
   }

   public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$0d0d12988cd96fb4(
      @NotNull Vec3 var1, long var2
   ) {
      var2 = 122306739772977L;
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return var1.y;
   }

   public final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$9a54b0fb57df8f81(
      long var1, @NotNull Vec3 var3
   ) {
      var1 = 105324182787226L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(var3, "<this>");
      return var3.z;
   }

   @NotNull
   public final Vec3 lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$6220e9a478bc1dcd(
      @NotNull Vec3 var1, long var2
   ) {
      var2 = 122382092254804L;
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return new Vec3(Math.floor(var1.x), Math.floor(var1.y), Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$958d1848d91c3d5d(
      long argument1Arg, @NotNull Vec3 argument2Arg, @NotNull Vec3 otherArg
   ) {
      argument1Arg = 73524672934016L;
      argument1Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument1Arg;
      Intrinsics.checkNotNullParameter(argument2Arg, "<this>");
      Intrinsics.checkNotNullParameter(otherArg, "other");
      Vec3 var10000 = argument2Arg.subtract(otherArg);
      Intrinsics.checkNotNullExpressionValue(var10000, "subtract(...)");
      return var10000;
   }

   @NotNull
   public final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5e573d54f93f6798(
      @NotNull Vec3 fromArg, @NotNull Vec3 toArg, double argument3Arg, double argument4Arg, long argument5Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final BlockPos IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$02816dd0d3f34d50(
      @NotNull Vec3 var1, int var2, short var3, short var4
   ) {
      short var7 = 11417;
      var3 = 4579;
      var4 = 18458;
      long var5 = ((long)var7 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(var1, "<this>");
      return new BlockPos((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1c8b6b07452c086b(
      char var1, @NotNull Vec3 var2, int var3, double var4, char var6
   ) {
      byte var9 = 0;
      var3 = 442322889;
      short var11 = 19777;
      long var7 = ((long)var9 << 48 | (long)var3 << 32 >>> 16 | (long)var11 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(var2, "<this>");
      return new Vec3(var2.x, var4, var2.z);
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0c05bc4b41b0ac3c(
      char param1, @NotNull Vec3 param2, @NotNull Vec3 param3, int param4, @NotNull Vec3 param5, boolean param6, char param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$267a62db84cc1781(
      char argument1Arg, @NotNull Vec3 vec1Arg, @NotNull Vec3 vec2Arg, int argument4Arg, @NotNull Vec3 fromArg, boolean argument6Arg, char argument7Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
