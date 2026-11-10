package me.octo.client.render;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.core.Vec3i;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   private static Lazy IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static AABB lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static AABB IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 1425408284260L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   public static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      Lazy var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      return (Boolean)var0.getValue();
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull PoseStack param0,
      @NotNull RenderTarget param1,
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2,
      @NotNull Camera param3,
      @NotNull Function1 param4,
      long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0, @NotNull Function1 var1, long var2
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415914317225265453L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(17503, 8747497240711259515L ^ var2)
      );
      boolean var4 = false;
      PoseStack var5 = var0.getPoseStack();
      boolean var6 = false;
      var5.pushPose();

      try {
         boolean var8 = false;
         Vec3 var10000 = var0.getCamera().position();
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(21700, 6363833895717041621L ^ var2)
         );
         Vec3 var9 = var10000;
         var5.translate(-var9.x, -var9.y, -var9.z);
         var1.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var5.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0, char var1, short var2, int var3, @NotNull Vec3 var4, @NotNull Function1 var5
   ) {
      long var6 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var8 = var6 ^ 42045868876289L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415877992297023258L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(9780, 25205474481883436L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24009, 4881727250996835036L ^ var6)
      );
      boolean var10 = false;
      PoseStack var11 = var0.getPoseStack();
      boolean var12 = false;
      var11.pushPose();

      try {
         boolean var14 = false;
         var11.translate(var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((Position)var4, var8));
         var5.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var11.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0, @NotNull Vec3i var1, long var2, @NotNull Function1 var4
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var5 = var2 ^ 48685320729640L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415866268333426320L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(30582, 4498940006349642183L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24009, 4881750586861695830L ^ var2)
      );
      boolean var7 = false;
      PoseStack var8 = var0.getPoseStack();
      boolean var9 = false;
      var8.pushPose();

      try {
         boolean var11 = false;
         var8.translate(var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var5));
         var4.invoke(var0);
      } finally {
         InlineMarker.finallyStart(1);
         var8.popPose();
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short param0, long param1, @NotNull WorldRenderEnvironment param3, @NotNull Function1 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull WorldRenderEnvironment var2, @NotNull AbstractTexture var3, @NotNull RenderPipeline var4, @NotNull Map var5, @NotNull Function2 var6
   ) {
      var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var0;
      long var7 = var0 ^ 42078566247481L;
      long var9 = (var0 ^ 67436736876234L) >>> 32;
      int var11 = (int)((var0 ^ 67436736876234L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415825423373821554L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(4801, 2482881847917993100L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(28737, 2166430770137742909L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(14164, 4799413899187222823L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(6151, 5250293592589325909L ^ var0)
      );
      boolean var12 = false;
      WorldRenderEnvironment var13 = var2;
      String var15 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(23066, 4943789741575148621L ^ var0);
      boolean var17 = false;
      Map var23 = MapsKt.mapOf(TuplesKt.to(var15, var3));
      var17 = false;
      VertexConsumer var18 = var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var11, var4, var23, var5);

      try {
         Pose var10002 = var13.getPoseStack().last();
         Intrinsics.checkNotNullExpressionValue(
            var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317730572995267703L ^ var0)
         );
         var6.invoke(var18, var10002);
      } finally {
         InlineMarker.finallyStart(1);
         WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var18, false, 2, null, var7);
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0, @NotNull RenderPipeline var1, @NotNull Map var2, @NotNull Map var3, long var4, @NotNull Function2 var6
   ) {
      var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var4;
      long var7 = var4 ^ 117059583203837L;
      long var9 = (var4 ^ 124689168907022L) >>> 32;
      int var11 = (int)((var4 ^ 124689168907022L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415891454723118006L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(28737, 2166505734012439545L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(717, 4722905590439410028L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(14164, 4799356922635603171L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(6151, 5250218628819346321L ^ var4)
      );
      boolean var12 = false;
      VertexConsumer var13 = var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var11, var1, var2, var3);

      try {
         Pose var10002 = var0.getPoseStack().last();
         Intrinsics.checkNotNullExpressionValue(
            var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317647225411582387L ^ var4)
         );
         var6.invoke(var13, var10002);
      } finally {
         InlineMarker.finallyStart(1);
         WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var13, false, 2, null, var7);
         InlineMarker.finallyEnd(1);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0,
      long var1,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3,
      byte var4,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var5,
      int var6
   ) {
      long var7 = (var1 << 8 | (long)var4 << 56 >>> 56) ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var9 = var7 ^ 85552592644019L;
      long var11 = (var7 ^ 95516728067392L) >>> 32;
      int var13 = (int)((var7 ^ 95516728067392L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415852388822248952L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(20268, 95420178339072713L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(13204, 7727153283164698216L ^ var7)
      );
      WorldRenderEnvironment var14 = var0;
      RenderPipeline var15 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Map var16 = MapsKt.emptyMap();
      Map var17 = MapsKt.emptyMap();
      boolean var18 = false;
      VertexConsumer var19 = var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var13, var15, var16, var17);

      try {
         Pose var10001 = var14.getPoseStack().last();
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317686085422450685L ^ var7)
         );
         Pose var20 = var10001;
         boolean var22 = false;
         boolean var26 = false;
         VertexConsumer var10000 = var19.addVertex(
            var20,
            var3.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
            var3.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var3.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767798145651415599L ^ var7)
         );
         var10000.setColor(var6);
         var26 = false;
         var10000 = var19.addVertex(
            var20,
            var5.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
            var5.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var5.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767798145651415599L ^ var7)
         );
         var10000.setColor(var6);
      } finally {
         WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var19, false, 2, null, var9);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0, @NotNull Vec3 param1, @NotNull Vec3 param2, long param3, int param5, float param6, boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull WorldRenderEnvironment param0, @NotNull Vec3 param1, @NotNull Vec3 param2, int param3, float param4, long param5, boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0, float param1, float param2, long param3, float param5, @NotNull Vec3 param6, int param7, float param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0, @NotNull Vec3 param1, @NotNull Vec3 param2, int param3, float param4, long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0,
      int param1,
      long param2,
      short param4,
      float param5,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll... param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0,
      int param1,
      long param2,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll... param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull WorldRenderEnvironment var0,
      char var1,
      int var2,
      int var3,
      char var4,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll... var5
   ) {
      long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var8 = var6 ^ 27799327651826L;
      long var10 = (var6 ^ 2581045564673L) >>> 32;
      int var12 = (int)((var6 ^ 2581045564673L) << 32 >>> 32);
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1867453043755314804L, var6
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415804578225143225L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10877, 1065659904954580988L ^ var6)
      );
      String var13 = var10000;

      label91: {
         label90: {
            try {
               var41 = var5.length;
               if (var13 != null) {
                  break label91;
               }

               if (var41 == 0) {
                  break label90;
               }
            } catch (NoWhenBranchMatchedException var37) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var37, 1892355497661318699L, var6
               );
            }

            var41 = 0;
            break label91;
         }

         var41 = 1;
      }

      if (var41 == 0) {
         WorldRenderEnvironment var14 = var0;
         RenderPipeline var15 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Map var16 = MapsKt.emptyMap();
         Map var17 = MapsKt.emptyMap();
         boolean var18 = false;
         VertexConsumer var19 = var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var12, var15, var16, var17);
         boolean var34 = false /* VF: Semaphore variable */;

         try {
            var34 = true;
            Pose var10001 = var14.getPoseStack().last();
            Intrinsics.checkNotNullExpressionValue(
               var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317769067238315964L ^ var6)
            );
            Pose var20 = var10001;
            VertexConsumer var21 = var19;
            boolean var22 = false;
            int var23 = 0;
            int var24 = var5.length;

            while (var23 < var24) {
               me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var25 = var5[var23];
               var10000 = var13;
               VertexConsumer var26 = var21;
               Pose var27 = var20;
               me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var28 = var25;
               boolean var29 = false;

               try {
                  if (var10000 != null) {
                     var34 = false;
                     return;
                  }

                  VertexConsumer var43 = var26.addVertex(
                     var27,
                     var28.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
                     var28.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
                     var28.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
                  );
                  Intrinsics.checkNotNullExpressionValue(
                     var43, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767750322148461166L ^ var6)
                  );
                  var43.setColor(var2);
                  var23++;
                  if (var13 != null) {
                     break;
                  }
               } catch (NoWhenBranchMatchedException var35) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var35, 1892355497661318699L, var6
                  );
               }
            }

            var34 = false;
         } finally {
            if (var34) {
               WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var19, false, 2, null, var8);
            }
         }

         WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var19, false, 2, null, var8);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0,
      @NotNull WorldRenderEnvironment var2,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var4,
      @NotNull me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var5,
      int var6
   ) {
      var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var0;
      long var7 = var0 ^ 58321717614426L;
      long var9 = (var0 ^ 50695344731561L) >>> 32;
      int var11 = (int)((var0 ^ 50695344731561L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415843883555577105L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(2533, 7639693298005998844L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(12153, 8014181286360963665L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(29688, 5336769168723183345L ^ var0)
      );
      WorldRenderEnvironment var12 = var2;
      RenderPipeline var13 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Map var14 = MapsKt.emptyMap();
      Map var15 = MapsKt.emptyMap();
      boolean var16 = false;
      VertexConsumer var17 = var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var11, var13, var14, var15);

      try {
         Pose var10001 = var12.getPoseStack().last();
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317746816954578708L ^ var0)
         );
         Pose var18 = var10001;
         boolean var20 = false;
         boolean var24 = false;
         VertexConsumer var10000 = var17.addVertex(
            var18,
            var3.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
            var3.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var3.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767701679970691782L ^ var0)
         );
         var10000.setColor(var6);
         var24 = false;
         var10000 = var17.addVertex(
            var18,
            var4.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
            var4.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var4.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767701679970691782L ^ var0)
         );
         var10000.setColor(var6);
         var24 = false;
         var10000 = var17.addVertex(
            var18,
            var5.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
            var5.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
            var5.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767701679970691782L ^ var0)
         );
         var10000.setColor(var6);
      } finally {
         WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var17, false, 2, null, var7);
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0,
      @NotNull WorldRenderEnvironment param2,
      @NotNull AABB param3,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param4,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param5,
      short param6,
      int param7,
      int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment param0,
      @NotNull AABB param1,
      char param2,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param3,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param4,
      int param5,
      int param6,
      int param7,
      int param8,
      float param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0,
      @NotNull WorldRenderEnvironment var2,
      @NotNull AABB var3,
      @NotNull Direction var4,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var5,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var6
   ) {
      var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var0;
      long var7 = var0 ^ 119169889255071L;
      int var9 = (int)((var0 ^ 100345109478103L) >>> 48);
      long var10 = (var0 ^ 100345109478103L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415917326921563536L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26228, 6410401376099087319L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(22013, 2227440244499284060L ^ var0)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (short)var9,
         var2,
         var3,
         var5,
         var6,
         me.octo.client.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.FACE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var4),
         me.octo.client.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.OUTLINE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var4),
         var10,
         0.0F,
         32,
         null
      );
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0,
      @NotNull WorldRenderEnvironment var2,
      @NotNull AABB var3,
      @NotNull Iterable var4,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var5,
      @Nullable me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var6
   ) {
      var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var0;
      long var7 = var0 ^ 101647140141267L;
      int var9 = (int)((var0 ^ 103984464071337L) >>> 48);
      long var10 = (var0 ^ 103984464071337L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415912166896897518L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26228, 6410407635402507177L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(17192, 2295526794827196130L ^ var0)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (short)var9,
         var2,
         var3,
         var5,
         var6,
         me.octo.client.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.FACE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var7),
         me.octo.client.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.OUTLINE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var7),
         var10,
         0.0F,
         32,
         null
      );
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0,
      double var1,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4,
      long var5,
      @NotNull AABB var7
   ) {
      var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var5;
      long var8 = var5 ^ 24745468458522L;
      long var10 = (var5 ^ 14920642598121L) >>> 32;
      int var12 = (int)((var5 ^ 14920642598121L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10259, 4415807022208973905L ^ var5)
      );
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2881589701157441636L, var5
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(18157, 8861977106622812831L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26845, 2226349893426363545L ^ var5)
      );
      String var13 = var10000;

      label54: {
         label53: {
            try {
               Intrinsics.checkNotNullParameter(
                  var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(14040, 3387536893971915414L ^ var5)
               );
               double var193;
               var160 = (var193 = var1 - 0.0) == 0.0 ? 0 : (var193 < 0.0 ? -1 : 1);
               if (var13 != null) {
                  break label54;
               }

               if (!var160) {
                  break label53;
               }
            } catch (NoWhenBranchMatchedException var46) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var46, -2618015777142634557L, var5
               );
            }

            var160 = 0;
            break label54;
         }

         var160 = 1;
      }

      if (!var160) {
         WorldRenderEnvironment var14 = var0;
         RenderPipeline var15 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         Map var16 = MapsKt.emptyMap();
         Map var17 = MapsKt.emptyMap();
         boolean var18 = false;
         VertexConsumer var19 = var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var12, var15, var16, var17);

         try {
            Pose var10001 = var14.getPoseStack().last();
            Intrinsics.checkNotNullExpressionValue(
               var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(16951, 317783605823608404L ^ var5)
            );
            Pose var20 = var10001;
            boolean var22 = false;
            double var25 = var7.minX;
            double var27 = 0.0;
            double var29 = var7.minZ;
            boolean var31 = false;
            Matrix4f var161 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var161, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(32544, 8322818431914453847L ^ var5)
            );
            Matrix4fc var33 = (Matrix4fc)var161;
            boolean var40 = false;
            VertexConsumer var162 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var162, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            VertexConsumer var23 = var162;
            boolean var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(18717, 6098641854039465316L ^ var5)
            );
            var25 = var7.minX;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var163 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var163, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var163;
            var40 = false;
            VertexConsumer var164 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var164, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var164;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var165 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var165, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var165;
            var40 = false;
            VertexConsumer var166 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var166, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var166;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var27 = 0.0;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var167 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var167, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var167;
            var40 = false;
            VertexConsumer var168 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var168, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var168;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var27 = 0.0;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var169 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var169, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var169;
            var40 = false;
            VertexConsumer var170 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var170, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var170;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var171 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var171, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var171;
            var40 = false;
            VertexConsumer var172 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var172, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var172;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var173 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var173, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var173;
            var40 = false;
            VertexConsumer var174 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var174, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var174;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var27 = 0.0;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var175 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var175, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var175;
            var40 = false;
            VertexConsumer var176 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var176, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var176;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var27 = 0.0;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var177 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var177, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var177;
            var40 = false;
            VertexConsumer var178 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var178, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var178;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.maxX;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var179 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var179, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var179;
            var40 = false;
            VertexConsumer var180 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var180, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var180;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var181 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var181, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var181;
            var40 = false;
            VertexConsumer var182 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var182, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var182;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var27 = 0.0;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var183 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var183, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var183;
            var40 = false;
            VertexConsumer var184 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var184, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var184;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var27 = 0.0;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var185 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var185, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var185;
            var40 = false;
            VertexConsumer var186 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var186, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var186;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var29 = var7.maxZ;
            var31 = false;
            Matrix4f var187 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var187, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var187;
            var40 = false;
            VertexConsumer var188 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var188, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var188;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var189 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var189, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var189;
            var40 = false;
            VertexConsumer var190 = var19.addVertex(var33, (float)var25, (float)var1, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var190, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var190;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var4.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
            var25 = var7.minX;
            var27 = 0.0;
            var29 = var7.minZ;
            var31 = false;
            Matrix4f var191 = var20.pose();
            Intrinsics.checkNotNullExpressionValue(
               var191, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(10845, 6375679080856845848L ^ var5)
            );
            var33 = (Matrix4fc)var191;
            var40 = false;
            VertexConsumer var192 = var19.addVertex(var33, (float)var25, (float)var27, (float)var29);
            Intrinsics.checkNotNullExpressionValue(
               var192, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(24569, 3767739640729176966L ^ var5)
            );
            var23 = var192;
            var41 = false;
            Intrinsics.checkNotNullExpressionValue(
               var23.setColor(var3.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(26481, 8466296086777705245L ^ var5)
            );
         } finally {
            WorldRenderEnvironment.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var19, false, 2, null, var8);
         }
      }
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 4473564225756L;
      long var11 = var9 ^ 53928945554055L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[63];
      int var5 = 0;
      String var4 = "6à\u0000ixgÄ\u0095+\\\u000fBl\u0002\u008d0fÐ\u0017M}çúh\u0010cY\u0013\u0005\u008b%ã§jq\u0003\u0089¯á´3 ¼\u0089\b\u009a¥k\u0080\u0010\u0096àú{\u0093\u008b[±rªÆ\u001dI\u0015g¿0È\\\u0014¦è°\u0097\u0018¢\u00ad\u0098v\u0006\r±\u008d\u009b\u0003ÃÆ\u0000NÉ\u0011³}PÙ\u0088\u0094t? F\u0084W\u0094Î!ò\u0082\u0083wvÞIï9Hè-Û_\u001aVÀ\u0017µ'\u0093ýIG)r\u0018i°¬OÍ¿;²E\u0099Ü\u0087Úc7\n\u0005±~xý>\u000e\u001f\u0010×mktO>ï\u009f°[\u0090Î¾âÚI ¦\u0014ß¢Îç\u0093\u0010@è×\u009f\u0003\u0084.\u0099®¾\u009d\u0092q\u0018\u008bz\"o§úzÏD\u0013\u0010&\u000f©2\b\u0085ÄlÕ3¦6\u0095\u007fC\u0085  éóy¯HÂ\u0099(Hyß/ïÙÁÉI\u0083kD²3*\u0099ù¬\u009aõTL\u0089 \u0003>G\u000e\u000e,ñ[²o¯D{$e\u0017´ÍÁoF¬\u008f\u0093 ¯'6ÊÇ{{(ÔnÄ·+£{\u0004{1\u009f ex\u000e8,\u0003á°+\u008cÕ%>\u000f\"\u0096ÌíÙ£c¶X\u000123¢\u009a\u0010ï3à ø\u0085t\u0088*\u008dÍ¯$Î«; ¨ö¬Þèq\u0007Bvp\u0014¯¯Õ\u0013 \u0083{\\Q\u0099Ö&\u0004n\u0087Z d\u0083ùY\u0010\u000e\u0089z^uõT¯¹Vd\u0004CÍê¼(0\u0011Â\u0015A:\u0014Ùñ\u0085Ê2\fCc\u0013é³\u00adl-è\u001c\u001ec|Ëtó ì©\u0004\r\u009bÃ®~Ô' ºqþ+Ô7ÙU\u0089Ý¸j´k6\u001cÜfE\u0099H:ú\u009c\u008b|³²Ç¢\u007f6 ë\u009fôïû»y\u0017\u0014\u0096\u0091íW¦\u0006ÛcéC\u0019Ö¾kVÿ©ðÎ\"¸¿å\u0010?7\u0093Â\u0085\u0018ÒµÏÜ1}WO\b%0Í+,D\u0006\u00010j-Vî¹ô/§I0\u008b\u0018\u0089L\u008cyý\u008cê\u0003¯¨2\u008fËêa\u000fÄx\u00859hoÞ\u0096LexÀÁ\u0010ÃKÊÛH[]\u008d8\u0090KK\u0017/IË\u0010yÒ\u009d\u0089ÌZaÈG\u0080gÖ\u00937½¼\u00101óxzýÁn\u0095\\Zð\u009b%µñ°\u0018)ºÄ»\u0001¿t\u0091\u001c§\u001f¥Vê¾\u0096ø}±\u0092 \u0092iÆ\u0018rD¸üxÓó ×çý4j\u0084\u0081\u0006o\u008dá\u001b\u009a\u00043n õ´û©âç]D\u009dÀ&-;óò%ñ\f\u0090º\"_±«\u0096#e\u001eL÷5Ã\u0018\u008cì\u000fK\u0082ß2\u009f\u0085üñÖÏ\u001cG¶D{U«\u0011w7g\u0010óç&>R+Y6Î-UçSêÅ\u0093\u0018\u0081G\"}\u001a°\u0016o\u0083U\u0096¶\u000e\u0097\u0019Ï H\u0094ö\u008dGiÖ(¯;ØÂ+AÈ|Ûý@MrEÕ \f¿A\u009aà\u008aa\u0093Úy;ZÒ*\u0095Æ\u0080¾òÏÓ\u0005²°\u0010É\u0099\u00adÌ¢\u0002¾ Uj~S4Áì¬\u0010\u009czÜÅ¬)þ$\u0001ÀÒâ\u0006]<\u0090\u0010Q\u008cHw\u008e>¹¯U\u0005\u00810|ã$P8I4!w=\u0084\u001bÕÜ\u009d`\u0002\u0018k\u0087ýe\u008f\u0010.Âºf¤°\u00adVáË\u0011{«Ç\u0084¡·r\u0093El\u0007Æ'H\u0018ýT¡f÷\u0018Ûàz¿\u0080\u0018L;J\u009b½åÊÛÌk\u008e²\u009aÕtúU\u0006D\u009bx¢j2 Gf\u007fÜ9\u001bê¢@Ç\u0010mo:\u000fräÞ).íò\u001beet*Õö\u008f\bø @ÔìGcã¦Ê\r\u0087@\u008fMW\u0089R\u001eÝ×Â8H´Eâ{ 5\u0000\u0081>§ GÑë\u0080é¾×¥\u0082ÚEì\u0081bÌéE¸=\u0014\u00924}F§Ò\u001cU\u0016¤è» '´Æ\u0092\u008e\u0096;Ä\u00adï\u0001mß|¢àóÃ\u0099Uõ\u0002\u009dõ\u0086\u00816Ðã MÕ\u0010|\u0012\u001b\u00072=\n.À\u0004a-ÕGÇ÷ \u0090Z\në\u000f\u0095&\u008a\u0012\u0014Ö\u008eä7`«\u0098Øýuíí\fP\u0011Þ¸ä0\u0013¨V \tg\u00043\u0086u¨¯\raÖbþûHÓ7\u0085Î2\u009bÄâV\u0019ãì\u009aSß\u0006> \u008d1\u0012C\\íë3h\u001c`ã|) òô+ÓÇ\"a»\u0081Opðþ*1J\u0089\u0018× Mh\u0005a?\u00adõ@\u008fÒ¾$\u008f?>-wþX\u008b\u009f=\u0010\u009b'«ß(\u001a\u0085üy/\u008cÍ6\u0081ÉW\u0010é\u001bµÃÙ\u0090<îc\"¹]\u0018Dá\u0013 ÊÑ_z\u0012¨ù\u0014DÒÏ\u001a\u0091¦ºJªJ4\u0093j\u009bõ\u001d0\u0012½¸\u0018\u009aSg\u0010´ÂÉÈ\u0092\u0082 \u0004F\tº\u000e\u008d.\rï\u0010ÖÄÓÄ{\u009fbÍ{ú1\u0091\u001dÆ~G\u0018\u0000\u0092\u0018X³ÍÏj¶`&C.ç7\u0084Û$Ï\u0094<+$ß\u0010G\r\u001e\b/¼ûx,Ì£\u0089ö\u0087At\u0018ô\"ÄB}«\u00967\u0006\u009eUW\u00927>@\u0086\u001fÆÌ\u0086®_J \u0092\tI5\u0012èê¬;\u009bÂe\u0093\u009eK·ä\u0084¹:\u0086\nÊ5\u008eö\u0092\u008e/aÍ® n?´>T%±,\u0011\u0080õ\u0099\"Ùjûrí\u0002\u009eÙAò\u007f¥\u000f\u001byh \u0096È\u0010e¯\u0003v\u009dÍ\u007fê\b]¸\u00ad\u008dI}Ì\u0010\u008a\u0084)\u0005ý\u009d,\u0099Òy\u0086ø\u001dzC}\u0010m@\u0017¨z¹\u0014\u009d\u001em÷¶¸l\u008d[ ³9fT3Ä\u007fsp£æµ¨Nü³Ãq\nWÙåÛ\tÚ\u0014øéîò\u0097g(Ð)\u0084lkN\u0010¢=½ËE@ý¬ùn\u0012F\u0007¡[Ï\u001a ¸àC\u0017B\u008d|\u0006\b½,.Ù^,\u0010\u0084´?\u0099*)úìï5½\u0013C û±\u0018ë´±»,§Ë\u0082,çúhZ\u0093\u0094g\u0003Ù\u000f-61ÁÒ";
      int var6 = "6à\u0000ixgÄ\u0095+\\\u000fBl\u0002\u008d0fÐ\u0017M}çúh\u0010cY\u0013\u0005\u008b%ã§jq\u0003\u0089¯á´3 ¼\u0089\b\u009a¥k\u0080\u0010\u0096àú{\u0093\u008b[±rªÆ\u001dI\u0015g¿0È\\\u0014¦è°\u0097\u0018¢\u00ad\u0098v\u0006\r±\u008d\u009b\u0003ÃÆ\u0000NÉ\u0011³}PÙ\u0088\u0094t? F\u0084W\u0094Î!ò\u0082\u0083wvÞIï9Hè-Û_\u001aVÀ\u0017µ'\u0093ýIG)r\u0018i°¬OÍ¿;²E\u0099Ü\u0087Úc7\n\u0005±~xý>\u000e\u001f\u0010×mktO>ï\u009f°[\u0090Î¾âÚI ¦\u0014ß¢Îç\u0093\u0010@è×\u009f\u0003\u0084.\u0099®¾\u009d\u0092q\u0018\u008bz\"o§úzÏD\u0013\u0010&\u000f©2\b\u0085ÄlÕ3¦6\u0095\u007fC\u0085  éóy¯HÂ\u0099(Hyß/ïÙÁÉI\u0083kD²3*\u0099ù¬\u009aõTL\u0089 \u0003>G\u000e\u000e,ñ[²o¯D{$e\u0017´ÍÁoF¬\u008f\u0093 ¯'6ÊÇ{{(ÔnÄ·+£{\u0004{1\u009f ex\u000e8,\u0003á°+\u008cÕ%>\u000f\"\u0096ÌíÙ£c¶X\u000123¢\u009a\u0010ï3à ø\u0085t\u0088*\u008dÍ¯$Î«; ¨ö¬Þèq\u0007Bvp\u0014¯¯Õ\u0013 \u0083{\\Q\u0099Ö&\u0004n\u0087Z d\u0083ùY\u0010\u000e\u0089z^uõT¯¹Vd\u0004CÍê¼(0\u0011Â\u0015A:\u0014Ùñ\u0085Ê2\fCc\u0013é³\u00adl-è\u001c\u001ec|Ëtó ì©\u0004\r\u009bÃ®~Ô' ºqþ+Ô7ÙU\u0089Ý¸j´k6\u001cÜfE\u0099H:ú\u009c\u008b|³²Ç¢\u007f6 ë\u009fôïû»y\u0017\u0014\u0096\u0091íW¦\u0006ÛcéC\u0019Ö¾kVÿ©ðÎ\"¸¿å\u0010?7\u0093Â\u0085\u0018ÒµÏÜ1}WO\b%0Í+,D\u0006\u00010j-Vî¹ô/§I0\u008b\u0018\u0089L\u008cyý\u008cê\u0003¯¨2\u008fËêa\u000fÄx\u00859hoÞ\u0096LexÀÁ\u0010ÃKÊÛH[]\u008d8\u0090KK\u0017/IË\u0010yÒ\u009d\u0089ÌZaÈG\u0080gÖ\u00937½¼\u00101óxzýÁn\u0095\\Zð\u009b%µñ°\u0018)ºÄ»\u0001¿t\u0091\u001c§\u001f¥Vê¾\u0096ø}±\u0092 \u0092iÆ\u0018rD¸üxÓó ×çý4j\u0084\u0081\u0006o\u008dá\u001b\u009a\u00043n õ´û©âç]D\u009dÀ&-;óò%ñ\f\u0090º\"_±«\u0096#e\u001eL÷5Ã\u0018\u008cì\u000fK\u0082ß2\u009f\u0085üñÖÏ\u001cG¶D{U«\u0011w7g\u0010óç&>R+Y6Î-UçSêÅ\u0093\u0018\u0081G\"}\u001a°\u0016o\u0083U\u0096¶\u000e\u0097\u0019Ï H\u0094ö\u008dGiÖ(¯;ØÂ+AÈ|Ûý@MrEÕ \f¿A\u009aà\u008aa\u0093Úy;ZÒ*\u0095Æ\u0080¾òÏÓ\u0005²°\u0010É\u0099\u00adÌ¢\u0002¾ Uj~S4Áì¬\u0010\u009czÜÅ¬)þ$\u0001ÀÒâ\u0006]<\u0090\u0010Q\u008cHw\u008e>¹¯U\u0005\u00810|ã$P8I4!w=\u0084\u001bÕÜ\u009d`\u0002\u0018k\u0087ýe\u008f\u0010.Âºf¤°\u00adVáË\u0011{«Ç\u0084¡·r\u0093El\u0007Æ'H\u0018ýT¡f÷\u0018Ûàz¿\u0080\u0018L;J\u009b½åÊÛÌk\u008e²\u009aÕtúU\u0006D\u009bx¢j2 Gf\u007fÜ9\u001bê¢@Ç\u0010mo:\u000fräÞ).íò\u001beet*Õö\u008f\bø @ÔìGcã¦Ê\r\u0087@\u008fMW\u0089R\u001eÝ×Â8H´Eâ{ 5\u0000\u0081>§ GÑë\u0080é¾×¥\u0082ÚEì\u0081bÌéE¸=\u0014\u00924}F§Ò\u001cU\u0016¤è» '´Æ\u0092\u008e\u0096;Ä\u00adï\u0001mß|¢àóÃ\u0099Uõ\u0002\u009dõ\u0086\u00816Ðã MÕ\u0010|\u0012\u001b\u00072=\n.À\u0004a-ÕGÇ÷ \u0090Z\në\u000f\u0095&\u008a\u0012\u0014Ö\u008eä7`«\u0098Øýuíí\fP\u0011Þ¸ä0\u0013¨V \tg\u00043\u0086u¨¯\raÖbþûHÓ7\u0085Î2\u009bÄâV\u0019ãì\u009aSß\u0006> \u008d1\u0012C\\íë3h\u001c`ã|) òô+ÓÇ\"a»\u0081Opðþ*1J\u0089\u0018× Mh\u0005a?\u00adõ@\u008fÒ¾$\u008f?>-wþX\u008b\u009f=\u0010\u009b'«ß(\u001a\u0085üy/\u008cÍ6\u0081ÉW\u0010é\u001bµÃÙ\u0090<îc\"¹]\u0018Dá\u0013 ÊÑ_z\u0012¨ù\u0014DÒÏ\u001a\u0091¦ºJªJ4\u0093j\u009bõ\u001d0\u0012½¸\u0018\u009aSg\u0010´ÂÉÈ\u0092\u0082 \u0004F\tº\u000e\u008d.\rï\u0010ÖÄÓÄ{\u009fbÍ{ú1\u0091\u001dÆ~G\u0018\u0000\u0092\u0018X³ÍÏj¶`&C.ç7\u0084Û$Ï\u0094<+$ß\u0010G\r\u001e\b/¼ûx,Ì£\u0089ö\u0087At\u0018ô\"ÄB}«\u00967\u0006\u009eUW\u00927>@\u0086\u001fÆÌ\u0086®_J \u0092\tI5\u0012èê¬;\u009bÂe\u0093\u009eK·ä\u0084¹:\u0086\nÊ5\u008eö\u0092\u008e/aÍ® n?´>T%±,\u0011\u0080õ\u0099\"Ùjûrí\u0002\u009eÙAò\u007f¥\u000f\u001byh \u0096È\u0010e¯\u0003v\u009dÍ\u007fê\b]¸\u00ad\u008dI}Ì\u0010\u008a\u0084)\u0005ý\u009d,\u0099Òy\u0086ø\u001dzC}\u0010m@\u0017¨z¹\u0014\u009d\u001em÷¶¸l\u008d[ ³9fT3Ä\u007fsp£æµ¨Nü³Ãq\nWÙåÛ\tÚ\u0014øéîò\u0097g(Ð)\u0084lkN\u0010¢=½ËE@ý¬ùn\u0012F\u0007¡[Ï\u001a ¸àC\u0017B\u008d|\u0006\b½,.Ù^,\u0010\u0084´?\u0099*)úìï5½\u0013C û±\u0018ë´±»,§Ë\u0082,çúhZ\u0093\u0094g\u0003Ù\u000f-61ÁÒ"
         .length();
      char var3 = 24;
      int var14 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var14, var14 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var14 += var3) >= var6) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[63];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = LazyKt.lazy(
                        lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new AABB(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new AABB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
                     return;
                  }

                  var3 = var4.charAt(var14);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var14 += var3) < var6) {
                     var3 = var4.charAt(var14);
                     continue label27;
                  }

                  var4 = "$G\u0004¢\u001d]|u\u00ad\u0019\u0083\u0087\u001e«¶2 [êÈþíö9\u0018~\u001aÜ\u0080\u0017\u0014RÇeÝ¡½úé¼v?j\u0000¨\u0000\u008bªÜ";
                  var6 = "$G\u0004¢\u001d]|u\u00ad\u0019\u0083\u0087\u001e«¶2 [êÈþíö9\u0018~\u001aÜ\u0080\u0017\u0014RÇeÝ¡½úé¼v?j\u0000¨\u0000\u008bªÜ"
                     .length();
                  var3 = 16;
                  var14 = -1;
            }

            var15 = var4.substring(++var14, var14 + var3);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3488;
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
            throw new RuntimeException("me/octo/client/render/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII", var10);
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
            "me/octo/client/render/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
