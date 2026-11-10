package me.octo.client.utils.render.world;

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
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;

public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 108494141801986L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull PoseStack var3, @NotNull VertexConsumer var4, @NotNull AABB var5, float var6, float var7, float var8, float var9
   ) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      long var10 = var1 ^ 70701294566655L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32463, 2555169994428760786L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10104, 5063611887144901485L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6297, 6544093513019040898L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, var4, var5.minX, var5.minY, var5.minZ, var5.maxX, var5.maxY, var10, var5.maxZ, var6, var7, var8, var9
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull PoseStack param1,
      @NotNull VertexConsumer param2,
      double param3,
      double param5,
      double param7,
      double param9,
      double param11,
      long param13,
      double param15,
      float param17,
      float param18,
      float param19,
      float param20
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull PoseStack var1, @NotNull VertexConsumer var2, @NotNull AABB var3, float var4, long var5, float var7, float var8, float var9
   ) {
      var5 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var5;
      long var10 = var5 ^ 35485283938873L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32463, 2555205948356295303L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10104, 5063651238221161272L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6297, 6544127968940399831L ^ var5)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var2, (float)var3.minX, (float)var3.minY, (float)var3.minZ, (float)var3.maxX, var10, (float)var3.maxY, (float)var3.maxZ, var4, var7, var8, var9
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull PoseStack var1,
      @NotNull VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      float var6,
      long var7,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      var7 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var7;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32463, 2555133834564456124L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10104, 5063718423273772803L ^ var7)
      );
      Matrix4f var10000 = var1.last().pose();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(13074, 6537916248112825186L ^ var7)
      );
      Matrix4f var15 = var10000;
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var4, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var3, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var5);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var10);
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var15, var11, var12, var13, var14, var6, var9, var10);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Pose param1, @NotNull VertexConsumer param2, @NotNull Vector3f param3, char param4, @NotNull Vec3 param5, long param6, int param8, int param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull PoseStack var1,
      @NotNull BufferSource var2,
      char var3,
      @NotNull RenderType var4,
      @NotNull RenderType var5,
      @NotNull AABB var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      long var13 = ((long)var3 << 48 | (long)var7 << 32 >>> 16 | (long)var8 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32463, 2555228262744702832L ^ var13)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16517, 3475360530154127671L ^ var13)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23303, 5622414123713141433L ^ var13)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19033, 4732119767029058530L ^ var13)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6417, 5011787056681965746L ^ var13)
      );
      Pose var10000 = var1.last();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3131, 8805444918817017224L ^ var13)
      );
      Pose var16 = var10000;
      float var17 = (float)var6.minX;
      float var18 = (float)var6.minY;
      float var19 = (float)var6.minZ;
      float var20 = (float)var6.maxX;
      float var21 = (float)var6.maxY;
      float var22 = (float)var6.maxZ;
      VertexConsumer var25 = var2.getBuffer(var4);
      Intrinsics.checkNotNullExpressionValue(
         var25, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30466, 6026238203718907578L ^ var13)
      );
      VertexConsumer var23 = var25;
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3810017836023107083L, var13
      );
      var23.addVertex((Matrix4fc)var16.pose(), var17, var18, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var18, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var18, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var18, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var18, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var21, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var21, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var21, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var21, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var21, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var21, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var17, var18, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var18, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var21, var22).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var21, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var23.addVertex((Matrix4fc)var16.pose(), var20, var18, var19).setColor(var9, var10, var11, var12).setNormal(var16, 0.0F, 0.0F, 0.0F).setLineWidth(1.0F);
      var2.endBatch(var4);

      try {
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               3979478666012854374L, var13
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[1], 3868557610941496173L, var13
            );
         }
      } catch (MatchException var24) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var24, 3829067288041235593L, var13
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull PoseStack var1,
      @NotNull VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      long var6,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      var6 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var6;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         2929258183586108018L, var6
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23786, 8493224331609866534L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16503, 503034411492023732L ^ var6)
      );
      Matrix4f var10001 = var1.last().pose();
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25858, 6928254330419722443L ^ var6)
      );
      Matrix4f var20 = var10001;
      var2.addVertex((Matrix4fc)var20, var3, var4, var5).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var3, var4, var5).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var3, var4, var5).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var3, var4, var10).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var3, var9, var5).setColor(var11, var12, var13, var14);
      var2.addVertex((Matrix4fc)var20, var3, var9, var10).setColor(var11, var12, var13, var14);
      var2.addVertex((Matrix4fc)var20, var3, var9, var10).setColor(var11, var12, var13, var14);
      var2.addVertex((Matrix4fc)var20, var3, var4, var10).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var8, var9, var10).setColor(var11, var12, var13, var14);
      var2.addVertex((Matrix4fc)var20, var8, var4, var10).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var8, var4, var10).setColor(var15, var16, var17, var18);
      var2.addVertex((Matrix4fc)var20, var8, var4, var5).setColor(var15, var16, var17, var18);
      int[] var19 = var10000;

      try {
         var2.addVertex((Matrix4fc)var20, var8, var9, var10).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var4, var5).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var3, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var3, var4, var5).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var3, var4, var5).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var8, var4, var5).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var3, var4, var10).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var8, var4, var10).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var8, var4, var10).setColor(var15, var16, var17, var18);
         var2.addVertex((Matrix4fc)var20, var3, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var3, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var3, var9, var10).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var5).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var10).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var10).setColor(var11, var12, var13, var14);
         var2.addVertex((Matrix4fc)var20, var8, var9, var10).setColor(var11, var12, var13, var14);
         if (var19 == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[2], 2913103818277612589L, var6
            );
         }
      } catch (MatchException var21) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var21, 2979874062802958576L, var6
         );
      }
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      VertexConsumer var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8
   ) {
      var0.addVertex((Matrix4fc)var1, var6, var7, var8).setColor(var2, var3, var4, var5);
   }

   static {
      long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 127814415441176L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[17];
      int var7 = 0;
      String var6 = "µLÿuÈã\b\u0014÷\u0001Cu\u000eEÖ«\u0001\u007fÁ\u001fûX£{ë\u009a\u000f\u009az´£Ï\u0018Y\u000eK\u009d\r\u0090\u001a\u0014¨M¨\u001ff|§Z_Ì\u0003v³8ß\u001f\u0010\ft¶«\u0090Wò©\u0014¾}ÝV¦sø \u000f!*Æ\u009fùlå¥\"\u0092\u0099,ÀÅ7Î\u008eß2}<(¥Ù\u001cû\u0088]Ôúp\u0010½@\"e#3\u0088\u009bÐT\u0000\u0013`oGK\u0010\u009f¦Ø\u007fêOX\u0087ªÔ`Ñ\u009ctx\u0012\u0018qßA@ÙY\u008dá[DËO \u001bË\u009fn\u009eëmÆÝ¦¹ \u008d_ ï\u0094\u000b7\u0007ØA°Ê\u000f6¾\u0084\u001eõw{\u008d-ÄÏA(,\u0082\\Èw×\u0018ç6¬þ9Û+øeÈê\u008cW\u0090 \u0080\u0007:&\u0019¼\u0092Qy\u0010\u008dÞ\u0002Äêð¤\u009f±\u0000\u0093â·¡{{\u0010\u0014C§r·(®\u0018©¹\u0007÷\u001a\"e9\u0018;R\u008dä\tÌ%¨÷\u001c&¹Ø0i¾\u0007õ\r%\u0096\u00ad8l Oä,°\u0019\u001aù3\u0006×J\u0018Ë\u0003\u0014\u0011+\u0015ß\u0096®ö\u0098¬1ófQe>B% \u008c0Õ=VZÆóhJ×°E\r\u0004\u0000\u00125{»a¯]ÄtqÜWÃ+\u000bÌ K\u0099Ì\u0010ß¨\u008eCxk\u009aØH\u0016P\u0097\u0099\u0086\u0003\u0089È\u0012\u0097\u0003ôö[à:\u001e\u0001k";
      int var8 = "µLÿuÈã\b\u0014÷\u0001Cu\u000eEÖ«\u0001\u007fÁ\u001fûX£{ë\u009a\u000f\u009az´£Ï\u0018Y\u000eK\u009d\r\u0090\u001a\u0014¨M¨\u001ff|§Z_Ì\u0003v³8ß\u001f\u0010\ft¶«\u0090Wò©\u0014¾}ÝV¦sø \u000f!*Æ\u009fùlå¥\"\u0092\u0099,ÀÅ7Î\u008eß2}<(¥Ù\u001cû\u0088]Ôúp\u0010½@\"e#3\u0088\u009bÐT\u0000\u0013`oGK\u0010\u009f¦Ø\u007fêOX\u0087ªÔ`Ñ\u009ctx\u0012\u0018qßA@ÙY\u008dá[DËO \u001bË\u009fn\u009eëmÆÝ¦¹ \u008d_ ï\u0094\u000b7\u0007ØA°Ê\u000f6¾\u0084\u001eõw{\u008d-ÄÏA(,\u0082\\Èw×\u0018ç6¬þ9Û+øeÈê\u008cW\u0090 \u0080\u0007:&\u0019¼\u0092Qy\u0010\u008dÞ\u0002Äêð¤\u009f±\u0000\u0093â·¡{{\u0010\u0014C§r·(®\u0018©¹\u0007÷\u001a\"e9\u0018;R\u008dä\tÌ%¨÷\u001c&¹Ø0i¾\u0007õ\r%\u0096\u00ad8l Oä,°\u0019\u001aù3\u0006×J\u0018Ë\u0003\u0014\u0011+\u0015ß\u0096®ö\u0098¬1ófQe>B% \u008c0Õ=VZÆóhJ×°E\r\u0004\u0000\u00125{»a¯]ÄtqÜWÃ+\u000bÌ K\u0099Ì\u0010ß¨\u008eCxk\u009aØH\u0016P\u0097\u0099\u0086\u0003\u0089È\u0012\u0097\u0003ôö[à:\u001e\u0001k"
         .length();
      char var5 = ' ';
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var13, var13 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var13 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[17];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     int[] var11 = new int[]{0, 1, 1, 5, 5, 4, 4, 0, 3, 2, 2, 6, 6, 7, 7, 3, 0, 3, 1, 2, 5, 6, 4, 7};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var11;
                     return;
                  }

                  var5 = var6.charAt(var13);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var13 += var5) < var8) {
                     var5 = var6.charAt(var13);
                     continue label27;
                  }

                  var6 = "\u001a\u0095¾(ïª\u0000C±£\u0091gÈ\u0013z\u000bõBù:e§SX\u001f\u001b\u0003¥r\u00ad©Ê\u0010ÞèÂÃ¾.\u0010îI\"c\u001bË8u\u009c";
                  var8 = "\u001a\u0095¾(ïª\u0000C±£\u0091gÈ\u0013z\u000bõBù:e§SX\u001f\u001b\u0003¥r\u00ad©Ê\u0010ÞèÂÃ¾.\u0010îI\"c\u001bË8u\u009c".length();
                  var5 = ' ';
                  var13 = -1;
            }

            var14 = var6.substring(++var13, var13 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30581;
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
               "me/octo/client/utils/render/world/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll", var10
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
            "me/octo/client/utils/render/world/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
