package me.octo.client.utils.render;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import me.octo.client.utils.render.shapes.Font;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   private static int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Identifier IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 26297281916585L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, @NotNull Collection var1, char var2, @NotNull Color var3, boolean var4, int var5, float var6
   ) {
      long var7 = ((long)var0 << 48 | (long)var2 << 48 >>> 16 | (long)var5 << 32 >>> 32)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var9 = var7 ^ 24584803192989L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(25262, 4118059737233345607L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16868, 4626591812124765956L ^ var7)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var1, var3, var3, var4, var6);
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, @NotNull Collection param2, @NotNull Color param3, @NotNull Color param4, boolean param5, float param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param0, @NotNull Vec3 param1, @NotNull Color param2, boolean param3, float param4, double param5, long param7, double param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull AABB var0, long var1, @NotNull Color var3, float var4, boolean var5
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3052203467288839509L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(20103, 6871220306013734524L ^ var1)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var6 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               Intrinsics.checkNotNullParameter(
                  var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16868, 4626471251198134549L ^ var1)
               );
               var9 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
                  .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
               var10001 = var5;
               if (var6 == null) {
                  break label22;
               }

               if (var5 != 0) {
                  break label21;
               }
            } catch (MatchException var7) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var7, -3134448948827640610L, var1
               );
            }

            var10001 = 1;
            break label22;
         }

         var10001 = 0;
      }

      ((List)var9.get(var10001))
         .add(
            new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
               var0,
               var3.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
               var3.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
               var3.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(),
               var3.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
               var4
            )
         );
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull AABB var0, long var1, @NotNull Color var3, boolean var4
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7921874049531036415L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(29538, 7783478686247601089L ^ var1)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var5 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               Intrinsics.checkNotNullParameter(
                  var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16868, 4626538704689590593L ^ var1)
               );
               var8 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
                  .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
               var10001 = var4;
               if (var5 == null) {
                  break label22;
               }

               if (var4 != 0) {
                  break label21;
               }
            } catch (MatchException var6) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var6, 7842016196129887370L, var1
               );
            }

            var10001 = 1;
            break label22;
         }

         var10001 = 0;
      }

      ((List)var8.get(var10001))
         .add(
            new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
               var0,
               var3.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
               var3.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
               var3.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(),
               var3.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
               3.0F
            )
         );
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull AABB param0, @NotNull Color param1, long param2, int param4, boolean param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, @NotNull BlockPos param2, @NotNull Color param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param0,
      @NotNull Vec3 param1,
      float param2,
      boolean param3,
      @NotNull Color param4,
      @NotNull Font param5,
      int param6,
      float param7,
      short param8,
      @Nullable Float param9,
      char param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param0, @NotNull BlockPos param1, @NotNull Color param2, boolean param3, long param4, boolean param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 var0, long var1, float var3, float var4, @NotNull Color var5, int var6, float var7, boolean var8
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3650859078700408229L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(25791, 3056847873871874883L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16868, 4626488693203545627L ^ var1)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var9 = var10000;

      byte var10001;
      label32: {
         label31: {
            try {
               var29 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
               var10001 = var8;
               if (var9 == null) {
                  break label32;
               }

               if (var8 != 0) {
                  break label31;
               }
            } catch (MatchException var27) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var27, 3714944859227999184L, var1
               );
            }

            var10001 = 1;
            break label32;
         }

         var10001 = 0;
      }

      List var10 = (List)var29.get(var10001);
      double var11 = (Math.PI * 2) / var6;
      int var13 = var5.getColorAsInt();
      int var14 = 0;

      while (var14 < var6) {
         double var15 = var14 * var11;
         double var17 = (var14 + 1) * var11;
         float var19 = (float)(var3 * Math.cos(var15));
         float var20 = (float)(var3 * Math.sin(var15));
         float var21 = (float)(var3 * Math.cos(var17));
         float var22 = (float)(var3 * Math.sin(var17));
         Vec3 var30 = var0.add(var19, var4, var20);
         Intrinsics.checkNotNullExpressionValue(
            var30, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5747, 356925716552644992L ^ var1)
         );
         Vec3 var23 = var30;
         Vec3 var31 = var0.add(var21, var4, var22);
         Intrinsics.checkNotNullExpressionValue(
            var31, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5747, 356925716552644992L ^ var1)
         );
         Vec3 var24 = var31;
         Vec3 var32 = var0.add(var19, 0.0, var20);
         Intrinsics.checkNotNullExpressionValue(
            var32, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5747, 356925716552644992L ^ var1)
         );
         Vec3 var25 = var32;
         Vec3 var33 = var0.add(var21, 0.0, var22);
         Intrinsics.checkNotNullExpressionValue(
            var33, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5747, 356925716552644992L ^ var1)
         );
         Vec3 var26 = var33;
         var10.add(new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(var23, var24, var13, var13, var7));
         var10.add(new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(var25, var26, var13, var13, var7));
         var10.add(new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(var25, var23, var13, var13, var7));
         var14++;
         if (var9 == null) {
            break;
         }
      }
   }

   static {
      long var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 56696684982328L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[25];
      int var5 = 0;
      String var4 = "^½ÜB\u0093\u0085Å\u001cd\u001e±þ±õÔ\u0013©Â\u0096èîÈ\u009f\u0004y}fÀâl\u0098\u007fBgÆÑwOø¿3Ã\u009fÿùÎ\u008e\u0080\u008aÌü\u008cÐjÕà\u00100¶\u008b·\u0097Æ\u00ad´Õñ,\u0091\u000fõÁH\u0018¢#\u0015\u00844R¶±\u0012\u0000\u0019\u001d.0]\u0006Þã\u008c¼Fýpë(ÒR§1û\u000e\u0000åv\u001fllW\u001c¡8\fD\u0083\u0085:âª\u0098V}]oÔ \u008c¼\u0099Rî ñÌ:'\u0010ÅL(v\u0000\u000eâ®\u0095ù>â\u008dY\u001ar0óo\u0092\u001dþ@Gr|wÞÆ\u009d¥&ËêÓ\u0003ikÓhc[WëHrãt±eûùô\u0005Ësäu¢¤ÈA\u0096Q¿\u0010Îs\u001cý²N/,äñ)¨§\u0011\u0001o\u0010b\u0082\u0081\u0081:/K\u0084zfÎbÞ\"\u000bX\u0010\u0088\u000eúºÝ¼<Øq6M,¡\u001d\u0087Â Lq]\"\u0082Gÿ\u0092\u0095\u0094Ôã\u0083\u0015F\u0093\u008eÏ\u0082\f}\u0001kbH4\u0010Ù\u0001êbþ\u0010ªç\u0010qÀø¢\u0082oëÆE\u001eZä¿\u0018\u001d¢ÿ\u0092\u0089\u001a9÷9\fÀ+\u0014\u0093a¬Ûq\u008eT\u001cÕ:6\u0010|+øã¼+îû\u0099y¥\u0088#&Åþ\u00103(¯\u0084Ó\u009a\u001bÜ¢@\u0011H½\n!\u0099\u0010\u0087\u0086\f\u0003GÜ·qÒpE\rs ÀE\u0018<ý¸D|5\u0087\u0018|Á¦ó\u0081rÔ\u0010*\u008a{\u0010ëuÚ\u00ad\u0010\u0016Îm±\u000b\u0006¾Tß;Þmh\u0015\u008fC\u0010ñ\b\u001d´,^ÑÉI5\u009e¬\u0015\u0097\u001a?\u0010\u0012\u0001Þ\u009a\u0013ã\u0094ÿfû²\u0002Ô\u0094p¯(\u009dP§ØáB×,Jæ\u001a!ä\u0089îT\u000fÍ\u008e#Ò·\\\u009fÇ¶9ñ\u0085o\u0018#¶ðíû\u0011\u00ad¦F\u0010\u0002\u001b¯/÷?Òe\"[ÚPÖÓwP T\u0086*sQ=ª\u0080¤R¦¥Ys-üÓI;âN4@×²\u001bj_oaqÁ\u0010cÙH'_\u0014\u009ea©¢n\u009elÀ?Ê";
      int var6 = "^½ÜB\u0093\u0085Å\u001cd\u001e±þ±õÔ\u0013©Â\u0096èîÈ\u009f\u0004y}fÀâl\u0098\u007fBgÆÑwOø¿3Ã\u009fÿùÎ\u008e\u0080\u008aÌü\u008cÐjÕà\u00100¶\u008b·\u0097Æ\u00ad´Õñ,\u0091\u000fõÁH\u0018¢#\u0015\u00844R¶±\u0012\u0000\u0019\u001d.0]\u0006Þã\u008c¼Fýpë(ÒR§1û\u000e\u0000åv\u001fllW\u001c¡8\fD\u0083\u0085:âª\u0098V}]oÔ \u008c¼\u0099Rî ñÌ:'\u0010ÅL(v\u0000\u000eâ®\u0095ù>â\u008dY\u001ar0óo\u0092\u001dþ@Gr|wÞÆ\u009d¥&ËêÓ\u0003ikÓhc[WëHrãt±eûùô\u0005Ësäu¢¤ÈA\u0096Q¿\u0010Îs\u001cý²N/,äñ)¨§\u0011\u0001o\u0010b\u0082\u0081\u0081:/K\u0084zfÎbÞ\"\u000bX\u0010\u0088\u000eúºÝ¼<Øq6M,¡\u001d\u0087Â Lq]\"\u0082Gÿ\u0092\u0095\u0094Ôã\u0083\u0015F\u0093\u008eÏ\u0082\f}\u0001kbH4\u0010Ù\u0001êbþ\u0010ªç\u0010qÀø¢\u0082oëÆE\u001eZä¿\u0018\u001d¢ÿ\u0092\u0089\u001a9÷9\fÀ+\u0014\u0093a¬Ûq\u008eT\u001cÕ:6\u0010|+øã¼+îû\u0099y¥\u0088#&Åþ\u00103(¯\u0084Ó\u009a\u001bÜ¢@\u0011H½\n!\u0099\u0010\u0087\u0086\f\u0003GÜ·qÒpE\rs ÀE\u0018<ý¸D|5\u0087\u0018|Á¦ó\u0081rÔ\u0010*\u008a{\u0010ëuÚ\u00ad\u0010\u0016Îm±\u000b\u0006¾Tß;Þmh\u0015\u008fC\u0010ñ\b\u001d´,^ÑÉI5\u009e¬\u0015\u0097\u001a?\u0010\u0012\u0001Þ\u009a\u0013ã\u0094ÿfû²\u0002Ô\u0094p¯(\u009dP§ØáB×,Jæ\u001a!ä\u0089îT\u000fÍ\u008e#Ò·\\\u009fÇ¶9ñ\u0085o\u0018#¶ðíû\u0011\u00ad¦F\u0010\u0002\u001b¯/÷?Òe\"[ÚPÖÓwP T\u0086*sQ=ª\u0080¤R¦¥Ys-üÓI;âN4@×²\u001bj_oaqÁ\u0010cÙH'_\u0014\u009ea©¢n\u009elÀ?Ê"
         .length();
      char var3 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[25];
                     Identifier var15 = Identifier.withDefaultNamespace("textures/entity/beacon_beam.png");
                     Intrinsics.checkNotNullExpressionValue(var15, "withDefaultNamespace(...)");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var15;
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "1´\u0014¹î¶»³\u0000\u001aòñÃ\u00adhK\u0010 w\u0086ÃÇ\u0015ëU\u001eÕcN¸\u001aa\u000f";
                  var6 = "1´\u0014¹î¶»³\u0000\u001aòñÃ\u00adhK\u0010 w\u0086ÃÇ\u0015ëU\u001eÕcN¸\u001aa\u000f".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24286;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/render/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll", var10
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
         byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
            "me/octo/client/utils/render/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
