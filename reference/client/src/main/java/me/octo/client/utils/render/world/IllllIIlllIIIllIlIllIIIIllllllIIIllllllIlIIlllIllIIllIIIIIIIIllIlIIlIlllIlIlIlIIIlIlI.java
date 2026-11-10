package me.octo.client.utils.render.world;

import com.mojang.blaze3d.vertex.ByteBufferBuilder;
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
import me.octo.client.utils.PolinexLogger;
import me.octo.client.utils.render.colors.Color;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderContext;
import net.fabricmc.fabric.api.client.rendering.v1.level.LevelRenderEvents;
import net.fabricmc.fabric.api.event.Event;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.Font.DisplayMode;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.MultiBufferSource.BufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Identifier lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static ByteBufferBuilder IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static float[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 6468582982481L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);
   private static long[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Integer[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var3 = var1 ^ 18737244533072L;
      long var5 = var1 ^ 110369981317031L;
      LevelRenderEvents.END_MAIN.addPhaseOrdering(Event.DEFAULT_PHASE, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      LevelRenderEvents.END_MAIN
         .register(
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
         );
      PolinexLogger.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29819, 7381032362546323480L ^ var1), var3
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, float var4, boolean var5, long var6
   ) {
      var6 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var6;
      long var10001 = var6 ^ 92568253089717L;
      int var8 = (int)((var6 ^ 92568253089717L) >>> 48);
      int var9 = (int)((var6 ^ 92568253089717L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      var10001 = var6 ^ 13058974201660L;
      int var11 = (int)((var6 ^ 13058974201660L) >>> 48);
      int var12 = (int)((var6 ^ 13058974201660L) << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411320922644390268L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180709538314396323L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622817088667760841L ^ var6)
      );
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((char)var8, var1, (char)var9, var2, var10, var3, var4, var5);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var11, var1, (short)var12, var2, var13, var3);
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      char var1, @NotNull LevelRenderContext var2, char var3, @NotNull BlockPos var4, int var5, @NotNull float[] var6, float var7, boolean var8
   ) {
      long var9 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var5 << 32 >>> 32)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var11 = var9 ^ 98244401762823L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411406900981605784L ^ var9)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180621376925836871L ^ var9)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622729323624086573L ^ var9)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var4.getX(), var4.getY(), var4.getZ(), var4.getX() + 1.0, var4.getY() + 1.0, var11, var4.getZ() + 1.0, var6, var7, var8
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Vec3 var2, @NotNull Vec3 var3, @NotNull float[] var4, long var5, float var7, boolean var8
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var9 = var5 ^ 103292028339627L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411412013032698420L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180616256284717547L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32201, 5779616830859206585L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622725388393933697L ^ var5)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var2.x, var2.y, var2.z, var2.x + var3.x, var2.y + var3.y, var9, var2.z + var3.z, var4, var7, var8
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull AABB var2, @NotNull float[] var3, long var4, float var6, boolean var7
   ) {
      var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var4;
      long var8 = var4 ^ 50675956897111L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411357747836412616L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1708, 5513282103650333735L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622849498365229949L ^ var4)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var2.minX, var2.minY, var2.minZ, var2.maxX, var2.maxY, var8, var2.maxZ, var3, var6, var7
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1,
      double param2,
      double param4,
      double param6,
      double param8,
      double param10,
      long param12,
      double param14,
      @NotNull float[] param16,
      float param17,
      boolean param18
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      LevelRenderContext param1,
      double param2,
      long param4,
      double param6,
      double param8,
      double param10,
      double param12,
      double param14,
      float[] param16,
      float param17,
      boolean param18
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, @NotNull LevelRenderContext param2, short param3, @NotNull BlockPos param4, int param5, @NotNull float[] param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, double var4, boolean var6, long var7, byte var9
   ) {
      long var10 = (var7 << 8 | (long)var9 << 56 >>> 56) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var12 = var10 ^ 19701107215221L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411404279665333246L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180626181347971105L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622750636692539979L ^ var10)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var12, var1, var2.getX(), var2.getY(), var2.getZ(), var2.getX() + 1.0, var2.getY() + 1.0, var2.getZ() + 1.0, var3, 1.0F, var4, var6
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull LevelRenderContext var3, @NotNull Vec3 var4, @NotNull Vec3 var5, @NotNull float[] var6, double var7, boolean var9
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var10 = var1 ^ 80112737674180L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411341570088713039L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180686716460054672L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32201, 5779546432983930562L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622795934470710010L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var10, var3, var4.x, var4.y, var4.z, var4.x + var5.x, var4.y + var5.y, var4.z + var5.z, var6, 1.0F, var7, var9
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull AABB var2, char var3, @NotNull float[] var4, double var5, char var7, boolean var8, int var9
   ) {
      long var10 = ((long)var3 << 48 | (long)var7 << 48 >>> 16 | (long)var9 << 32 >>> 32)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var12 = var10 ^ 104510933199552L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411396308415136532L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1708, 5513375654034380283L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622758058135640737L ^ var10)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var12, var2, var4, 1.0F, var5, var8);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, long var2, @NotNull AABB var4, @NotNull float[] var5, float var6, double var7, boolean var9
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var10 = var2 ^ 84407824069134L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411337137798441605L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1708, 5513297774274853994L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622800298004771632L ^ var2)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var10, var1, var4.minX, var4.minY, var4.minZ, var4.maxX, var4.maxY, var4.maxZ, var5, var6, var7, var9
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1,
      @NotNull LevelRenderContext param3,
      double param4,
      double param6,
      double param8,
      double param10,
      double param12,
      double param14,
      @NotNull float[] param16,
      float param17,
      double param18,
      boolean param20
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1,
      @NotNull Vec3[] param2,
      @NotNull float[] param3,
      float param4,
      long param5,
      double param7,
      boolean param9,
      short param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1, @NotNull Vec3 param2, int param3, short param4, @NotNull float[] param5, float param6, double param7, int param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1, short param2, @NotNull Vec3[] param3, @NotNull float[] param4, float param5, short param6, boolean param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1,
      @NotNull Vec3 param2,
      float param3,
      float param4,
      float param5,
      float param6,
      long param7,
      @NotNull Vec3 param9,
      @NotNull Identifier param10,
      @NotNull float[] param11,
      float param12,
      boolean param13
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, boolean var4, long var5
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var7 = var5 ^ 47520992667840L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411401419704684624L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14699, 1250884019350616404L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180629057381094287L ^ var5)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var3, 1.0F, var7, var4);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, float var4, long var5, boolean var7
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var8 = (var5 ^ 54419317389915L) >>> 8;
      int var10 = (int)((var5 ^ 54419317389915L) << 56 >>> 56);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411426529191574465L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14699, 1250917373031961285L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180674299454306334L ^ var5)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var3, var8, (byte)var10, var4, 0.0F, var7);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Component var2, @NotNull Vec3 var3, long var4, byte var6, float var7, float var8, boolean var9
   ) {
      long var10 = (var4 << 8 | (long)var6 << 56 >>> 56) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      int var12 = (int)((var10 ^ 75168304749418L) >>> 48);
      long var13 = (var10 ^ 75168304749418L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411412664642765515L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14699, 1250894748628872143L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180617796349559060L ^ var10)
      );
      FormattedCharSequence var10002 = var2.getVisualOrderText();
      Intrinsics.checkNotNullExpressionValue(
         var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30276, 7198489756068127951L ^ var10)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var10002, var3, var7, (short)var12, var8, var13, var9);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull FormattedCharSequence var2, @NotNull Vec3 var3, float var4, short var5, float var6, long var7, boolean var9
   ) {
      long var10 = ((long)var5 << 48 | var7 << 16 >>> 16) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411342017120705264L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11370, 3708672185847768828L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180686269528578351L ^ var10)
      );
      Matrix4f var12 = new Matrix4f();
      Camera var10000 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.gameRenderer.getMainCamera();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23156, 1922459271817728233L ^ var10)
      );
      Camera var13 = var10000;
      Vec3 var20 = var13.position();
      Intrinsics.checkNotNullExpressionValue(
         var20, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3621, 7786079306359653540L ^ var10)
      );
      Vec3 var14 = var20;
      Font var21 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.font;
      Intrinsics.checkNotNullExpressionValue(
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.font,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(28083, 7804260191726675752L ^ var10)
      );
      Font var15 = var21;
      float var16 = var4 * 0.025F;
      var12.translate((float)(var3.x - var14.x), (float)(var3.y - var14.y), (float)(var3.z - var14.z))
         .rotate((Quaternionfc)var13.rotation())
         .scale(var16, -var16, var16);
      float var17 = -var15.width(var2) / 2.0F;
      BufferSource var22 = MultiBufferSource.immediate(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      Intrinsics.checkNotNullExpressionValue(
         var22, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17290, 8727982465149536512L ^ var10)
      );
      BufferSource var18 = var22;

      FormattedCharSequence var10001;
      float var10002;
      float var10003;
      byte var10004;
      boolean var10005;
      Matrix4fc var10006;
      MultiBufferSource var10007;
      DisplayMode var10008;
      label17: {
         try {
            var23 = var15;
            var10001 = var2;
            var10002 = var17;
            var10003 = var6;
            var10004 = -1;
            var10005 = false;
            var10006 = (Matrix4fc)var12;
            var10007 = (MultiBufferSource)var18;
            if (var9) {
               var10008 = DisplayMode.SEE_THROUGH;
               break label17;
            }
         } catch (UnsupportedOperationException var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, 5395772575361488727L, var10
            );
         }

         var10008 = DisplayMode.NORMAL;
      }

      var23.drawInBatch(
         var10001,
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         var10007,
         var10008,
         0,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(9839, 835915062103381783L ^ var10)
      );
      var18.endBatch();
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext param1, @NotNull Vec3 param2, float param3, float param4, long param5, int param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, LevelRenderContext param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull Runnable param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final AABB IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull ClientLevel var1, long var2, @NotNull BlockPos var4
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var5 = var2 ^ 128813717137340L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16725, 7678917491648110440L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180641279546002823L ^ var2)
      );
      BlockState var10002 = var1.getBlockState(var4);
      Intrinsics.checkNotNullExpressionValue(
         var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29029, 3785235186946223985L ^ var2)
      );
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var10002, var5, var4);
   }

   @NotNull
   public final AABB IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull ClientLevel var1, @NotNull BlockState var2, long var3, @NotNull BlockPos var5
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15762, 2032185627182827360L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17449, 6718174727938735838L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180730090111494506L ^ var3)
      );

      AABB var6;
      try {
         var6 = var2.getShape((BlockGetter)var1, var5).singleEncompassing().bounds().move(var5);
         Intrinsics.checkNotNull(var6);
         var6 = var6;
      } catch (UnsupportedOperationException var8) {
         var6 = new AABB(var5);
      }

      return var6;
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player != null) {
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player
            .playSound(SoundEvents.EXPERIENCE_ORB_PICKUP, 100.0F, 0.1F);
      }
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double param1, long param3, double param5, double param7, double param9, double param11, double param13
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var1, @NotNull LevelRenderContext var2, int var3, @NotNull BlockPos var4, @NotNull Color var5, int var6, boolean var7
   ) {
      long var8 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var6 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var10001 = var8 ^ 87302896728596L;
      int var10 = (int)((var8 ^ 87302896728596L) >>> 48);
      int var11 = (int)((var8 ^ 87302896728596L) << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411343693217651933L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180684584878563074L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745937436143238452L ^ var8)
      );
      char var14 = (char)var10;
      char var10003 = (char)var11;
      float[] var13 = new float[]{
         var5.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var5.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var5.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var14, var2, var10003, var4, var12, var13, var5.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var7
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Vec3 var2, @NotNull Vec3 var3, @NotNull Color var4, long var5, boolean var7
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var8 = var5 ^ 124140627133269L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411355953372901936L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180744876200964591L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10938, 2898760300899879159L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745874946882720729L ^ var5)
      );
      float[] var10 = new float[]{
         var4.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var4.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var4.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var2, var3, var10, var8, var4.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var7
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, long var2, @NotNull AABB var4, @NotNull Color var5, boolean var6
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var7 = var2 ^ 55358713172611L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411337573854393114L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(13608, 7746051022712526452L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30603, 1152750632262898939L ^ var2)
      );
      float[] var9 = new float[]{
         var5.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var5.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var5.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var4, var9, var7, var5.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var6
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1,
      @NotNull LevelRenderContext var2,
      int var3,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      @NotNull Color var16,
      boolean var17,
      short var18
   ) {
      long var19 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var18 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var21 = var19 ^ 48599239089595L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411360073326914084L ^ var19)
      );
      Intrinsics.checkNotNullParameter(
         var16, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745870835515100109L ^ var19)
      );
      float[] var23 = new float[]{
         var16.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var16.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var16.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var21,
         var14,
         var23,
         var16.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
         var17
      );
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull LevelRenderContext var1, long var2, @NotNull BlockPos var4, @NotNull Color var5, boolean var6
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var7 = var2 ^ 38332958987441L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411357339671049884L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180741316832998723L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745871365855893365L ^ var2)
      );
      float[] var9 = new float[]{
         var5.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var5.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var5.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var4, var9, var5.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var6, var7
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull Color var3, long var4
   ) {
      var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var4;
      long var10001 = var4 ^ 84347595841519L;
      int var6 = (int)((var4 ^ 84347595841519L) >>> 48);
      int var7 = (int)((var4 ^ 84347595841519L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411392072803666351L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180636205293587056L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745977017488484422L ^ var4)
      );
      char var11 = (char)var6;
      short var10003 = (short)var7;
      float[] var9 = new float[]{
         var3.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var3.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var3.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var1, var10003, var2, var8, var9);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull Color var3, double var4, boolean var6, long var7
   ) {
      var7 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var7;
      long var9 = (var7 ^ 106572805488442L) >>> 8;
      int var11 = (int)((var7 ^ 106572805488442L) << 56 >>> 56);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411363660286848917L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180734994954611786L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745882636348067452L ^ var7)
      );
      float[] var12 = new float[]{
         var3.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var3.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var3.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var12, var4, var6, var9, (byte)var11);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Vec3 var2, @NotNull Vec3 var3, long var4, @NotNull Color var6, double var7, boolean var9
   ) {
      var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var4;
      long var10 = var4 ^ 87755044359797L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411418596075730539L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180609673380230580L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32201, 5779623476047010790L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3746003557999384450L ^ var4)
      );
      float[] var12 = new float[]{
         var6.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var6.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var6.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var1, var2, var3, var12, var7, var9);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull AABB var2, char var3, @NotNull Color var4, int var5, double var6, boolean var8, char var9
   ) {
      long var10 = ((long)var3 << 48 | (long)var5 << 32 >>> 16 | (long)var9 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var12 = var10 ^ 93170879484327L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411391293237590131L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1708, 5513384794532163228L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745980137811679642L ^ var10)
      );
      float[] var14 = new float[]{
         var4.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var4.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var4.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var12, var2, var14, var4.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var6, var8
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      @NotNull Color var14,
      double var15,
      boolean var17,
      long var18
   ) {
      var18 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var18;
      long var20 = var18 ^ 66610392746221L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411425441144115302L ^ var18)
      );
      Intrinsics.checkNotNullParameter(
         var14, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745943867716170127L ^ var18)
      );
      float[] var22 = new float[]{
         var14.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var14.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var14.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var20,
         var1,
         var2,
         var4,
         var6,
         var8,
         var10,
         var12,
         var22,
         var14.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
         var15,
         var17
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Vec3[] var2, long var3, @NotNull Color var5, double var6, boolean var8
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var9 = (var3 ^ 109131847931663L) >>> 16;
      int var11 = (int)((var3 ^ 109131847931663L) << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411345240695899204L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32477, 8805406692289784569L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745938431885731245L ^ var3)
      );
      float[] var12 = new float[]{
         var5.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var5.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var5.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var2, var12, var5.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var9, var6, var8, (short)var11
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var1, @NotNull LevelRenderContext var2, @NotNull Vec3 var3, @NotNull Color var4, short var5, int var6, double var7
   ) {
      long var9 = ((long)var1 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var10001 = var9 ^ 24976458085886L;
      int var11 = (int)((var9 ^ 24976458085886L) >>> 32);
      int var12 = (int)((var9 ^ 24976458085886L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411321587700183075L ^ var9)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1325, 5453181294238492025L ^ var9)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745907118430212554L ^ var9)
      );
      float[] var14 = new float[]{
         var4.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var4.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var4.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var11, (short)var12, var14, var4.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(), var7, var13
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1, @NotNull Vec3[] var2, @NotNull Color var3, boolean var4, long var5
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var10001 = var5 ^ 108915068866381L;
      int var7 = (int)((var5 ^ 108915068866381L) >>> 48);
      int var8 = (int)((var5 ^ 108915068866381L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411347379458824727L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15994, 1853700046331098116L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3745936223866993662L ^ var5)
      );
      short var10002 = (short)var7;
      float[] var10 = new float[]{
         var3.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var3.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var3.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var10002, var2, var10, var3.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(), (short)var8, var4, var9
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull LevelRenderContext var1,
      @NotNull Vec3 var2,
      float var3,
      float var4,
      float var5,
      long var6,
      float var8,
      @NotNull Vec3 var9,
      @NotNull Identifier var10,
      @NotNull Color var11,
      boolean var12
   ) {
      var6 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var6;
      long var13 = var6 ^ 138308023137746L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411421820217473117L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16199, 6405076638871705446L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20803, 3825301384356837750L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22020, 5708629640873131558L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var11, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12712, 3746002384230963636L ^ var6)
      );
      float[] var15 = new float[]{
         var11.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var11.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var11.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1,
         var2,
         var3,
         var4,
         var5,
         var8,
         var13,
         var9,
         var10,
         var15,
         var11.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
         var12
      );
   }

   private static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0, LevelRenderContext var2) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      long var3 = var0 ^ 2768667498496L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411394253797112033L ^ var0)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, var2
      );
   }

   static {
      long var20 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 18527605229828L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[49];
      int var16 = 0;
      String var15 = "\u0082\\ù¢\u0098næì{\u0080Ä)ÏÀ\u0005Ä\u0018PJ\u0001S£\u0089\u0082+\u0001@\u0005Ç\u000bó>¶®í\u0015\u009f)¾JÉ\u0010\u000fÁ&\u0010Ð\u0084\u00ad^N\"qÌò~¦w\u0010¢þ@i \u0088\u0019$:)Ç¡ýòn\u0083 \u008fÝHbû>Þ\u0082+À\u0089\u0086òy·\u001e}¹!\"ÜM÷Êu¹W\u0003»\u0088ª1\u0010E®\u000få\u0000\u0091wã\u0005Øj.(µç$\u0010ºv|\u0019pQF\u0080À°\u001f\u0098øjAH rlî`XGRRÍ-/<\u0091¯ÍUKþ\u001bËïú7#z4Vcµ\u0014\u0018Ì\u0018äÆ\u0099AÍ\u0093»ïÑy\u000fd\u0096(\u0006vôDz\u000b\u0095þ\u0004«\u0010\u001cºAËà\u00919°{Í\nMÇB¡Ð\u0010.Qk\u0013 \"~ì$\u0096\u0087.@/\u0001[\u0010\u009ccõ\u0012¡¿û\u008b.Á\n\u0091üÉMÌ\u0010bLÂü\u001bn\u008b\u008bNçG:`%Ì\u00010Ín\u00893þ\u0004\u0003¸ÊÇ\u0081%;åþ·\u0088\u0016$\u0002ËÿIç\u008c´?`\u00982\u009d\u008d\u0011\u009eð\u0086ª\u0080-\n@\u001a4i¸\u0091¹ù\u0010{·gr©Òþ!zï²\u0019\u00adfÏO\u0010#ó¢í\u0093\u00ad\u008e]À\u00804\u0083)Y\u008cX(`\u0086\u0011ËÌº\u000f\u0001\u001cmÛj\u009d=¥ý\u008a\u001a¸ Íg²\u0090)wõåg9BÀx\u001d§'mål\"\u0018rZ;\u0092§Ò;MÜ¾\u0013v-æêÊo\u008aÿ\u0017«°lÒ\u0010å\u0018`#ÐøÐxkãXÚ\u0085}XS ñ³\u001ff®\u0005:Ù¬u\u001a\u0091\f[; ¡EI.¹'ð\u0003×øt\u0084ß¼Êú@\u0099\u008a\b¹@¦Ð\u0006\u009d\u0085>ô^\u0000¡`Õ\u009aì\u0096\u0002[\u0087\u008dº6\u0011¥ã¥\u001dji@ÊñËk:\u0093W\u0093\u000fsÈ~¾°\u0003v\u0001\n\u009bïÙØOÓâyÄæ\u000b\u0015 kb¸Ä\u00054ë|;@þ±©}ê\u00adàÖÿY 7¶d\u001f¢~o.ôã\u0093\u0010ñç)Ð],HâÔj\u0096¼¬\u0091ÐÓ\u0010\u008b\u008b¥\u0082<Ð\u009bH.eE\u008a\n\tÆÜ\u0018m\u0001,Ivóp77á\u0080:u\u0012\u0011Õt8WU\u0011Ê¡\u000204B´ËBT\u008bÛl\u009a\u0006\u001cª«\u001d+¢=IS#\u0093qq×e,è0u\u0089´7\u001a\u000f·ï\u0082ÙJL=\u008a$z\f-¬\u0018¬Ãz\u0005\u0017\u0096\u0013\u0019\u001dm£\r\u0003o®_{#\u0002\u008cADw\u00990J7.\u0002\u0014\u0091É\u0095ä}ýãcÕ¤H\u0015µ,ªõ\u0017@ª\u0004ðÌd7[\u0019=\u0005\u008dTâgí'tZµÆú½8é \u0010A¿ä\u001e5ã-ÞM·\u0091Öþû]1\u0018Aÿ¶)\u0013}Å]Ï\u007fç\u0002múÍ£¶:Túµ©\u0085¯ \bÓÊÏ\u008fÕ\u0083iá7kdï\u0086\u008a~t%x¹í±lÿAT\u008fè¨\u0087\u00973\u0010\u008f4-\u0095\u0099\u009b\u00906\u001cýôL\u008d\u001edÇ(îéÕ3\u0012æ×Ò;\u0096\u009c4©©ª*]pë+Ã¿\u0086ÛÿÎbp\f#Úb¹Üj*\u008f)\u001eæ\u0010¿ÑìÖ\u00ad(\u008b\u000eßÕ\u0082Z4\u008cØ&\u0010\u0003âÄlníØ´aÐ>¹'\u001f×í\u0010E·ù>ç\u009c\u0097Çú¾j\u001735úS ¥¡ÛÍ´Ï<¥AÎ\u0080÷QÅ\u00929u«a\u0094½¶Ç[\u001cW!\u0094Ë\u0083Ùý\u0010%\u0017-\u0014ò\u0099\u000eö\u0099u³\u008e©·\\\u001d\u0010__\u0003Ò%'wþéÓºv\u007f}\u0095*\u0010¨E|ê)3kçH,\u0011\u0088\u0086?Õ\f\u0018ç\u0096cI3S\u0006Ç\u008c!*\u0096<\u0089¶Êf\"x0ßrR\u000e Ð\u001d¨îNF%»¾GmÙEZ.\u001c\u0004\u009d)oË÷9\u001có\u0019t:RÐ\u0080\u0090 \u0011a[þ\u0096¿hß×ËÞÌ\u00148*i2\u009fÙEa\u0089\u0087\u000f\u0004¯2p\u0086º¤\u008a(òH½Âx¦Ë\u0098~\fK\u0003Ñ\ror&fÉ¨s*iÊ`nø2|ë>\u0082~Å§í\u008d\u009d\u0093#(l\u0099º\u00869=æë§ÙS±\u001c\u0095\u0005\u008eûòÖ\u001b®'dëzºþ\u0080-ÇX`·\u000f¤ÿ-\u0094{t ;g±Tf\u0084\u0013\u00105ÿ\u0093+\u008c»®GÌ\u0085 \u0003ø÷=89\u0086d\u0005Øô\u0016\u0093 )Û$È·%\u0012þ\u008b¼^\\¢\u009d\u0095·:\u0011\f|\u000er GW\u0004²\u009eS¥2:";
      int var17 = "\u0082\\ù¢\u0098næì{\u0080Ä)ÏÀ\u0005Ä\u0018PJ\u0001S£\u0089\u0082+\u0001@\u0005Ç\u000bó>¶®í\u0015\u009f)¾JÉ\u0010\u000fÁ&\u0010Ð\u0084\u00ad^N\"qÌò~¦w\u0010¢þ@i \u0088\u0019$:)Ç¡ýòn\u0083 \u008fÝHbû>Þ\u0082+À\u0089\u0086òy·\u001e}¹!\"ÜM÷Êu¹W\u0003»\u0088ª1\u0010E®\u000få\u0000\u0091wã\u0005Øj.(µç$\u0010ºv|\u0019pQF\u0080À°\u001f\u0098øjAH rlî`XGRRÍ-/<\u0091¯ÍUKþ\u001bËïú7#z4Vcµ\u0014\u0018Ì\u0018äÆ\u0099AÍ\u0093»ïÑy\u000fd\u0096(\u0006vôDz\u000b\u0095þ\u0004«\u0010\u001cºAËà\u00919°{Í\nMÇB¡Ð\u0010.Qk\u0013 \"~ì$\u0096\u0087.@/\u0001[\u0010\u009ccõ\u0012¡¿û\u008b.Á\n\u0091üÉMÌ\u0010bLÂü\u001bn\u008b\u008bNçG:`%Ì\u00010Ín\u00893þ\u0004\u0003¸ÊÇ\u0081%;åþ·\u0088\u0016$\u0002ËÿIç\u008c´?`\u00982\u009d\u008d\u0011\u009eð\u0086ª\u0080-\n@\u001a4i¸\u0091¹ù\u0010{·gr©Òþ!zï²\u0019\u00adfÏO\u0010#ó¢í\u0093\u00ad\u008e]À\u00804\u0083)Y\u008cX(`\u0086\u0011ËÌº\u000f\u0001\u001cmÛj\u009d=¥ý\u008a\u001a¸ Íg²\u0090)wõåg9BÀx\u001d§'mål\"\u0018rZ;\u0092§Ò;MÜ¾\u0013v-æêÊo\u008aÿ\u0017«°lÒ\u0010å\u0018`#ÐøÐxkãXÚ\u0085}XS ñ³\u001ff®\u0005:Ù¬u\u001a\u0091\f[; ¡EI.¹'ð\u0003×øt\u0084ß¼Êú@\u0099\u008a\b¹@¦Ð\u0006\u009d\u0085>ô^\u0000¡`Õ\u009aì\u0096\u0002[\u0087\u008dº6\u0011¥ã¥\u001dji@ÊñËk:\u0093W\u0093\u000fsÈ~¾°\u0003v\u0001\n\u009bïÙØOÓâyÄæ\u000b\u0015 kb¸Ä\u00054ë|;@þ±©}ê\u00adàÖÿY 7¶d\u001f¢~o.ôã\u0093\u0010ñç)Ð],HâÔj\u0096¼¬\u0091ÐÓ\u0010\u008b\u008b¥\u0082<Ð\u009bH.eE\u008a\n\tÆÜ\u0018m\u0001,Ivóp77á\u0080:u\u0012\u0011Õt8WU\u0011Ê¡\u000204B´ËBT\u008bÛl\u009a\u0006\u001cª«\u001d+¢=IS#\u0093qq×e,è0u\u0089´7\u001a\u000f·ï\u0082ÙJL=\u008a$z\f-¬\u0018¬Ãz\u0005\u0017\u0096\u0013\u0019\u001dm£\r\u0003o®_{#\u0002\u008cADw\u00990J7.\u0002\u0014\u0091É\u0095ä}ýãcÕ¤H\u0015µ,ªõ\u0017@ª\u0004ðÌd7[\u0019=\u0005\u008dTâgí'tZµÆú½8é \u0010A¿ä\u001e5ã-ÞM·\u0091Öþû]1\u0018Aÿ¶)\u0013}Å]Ï\u007fç\u0002múÍ£¶:Túµ©\u0085¯ \bÓÊÏ\u008fÕ\u0083iá7kdï\u0086\u008a~t%x¹í±lÿAT\u008fè¨\u0087\u00973\u0010\u008f4-\u0095\u0099\u009b\u00906\u001cýôL\u008d\u001edÇ(îéÕ3\u0012æ×Ò;\u0096\u009c4©©ª*]pë+Ã¿\u0086ÛÿÎbp\f#Úb¹Üj*\u008f)\u001eæ\u0010¿ÑìÖ\u00ad(\u008b\u000eßÕ\u0082Z4\u008cØ&\u0010\u0003âÄlníØ´aÐ>¹'\u001f×í\u0010E·ù>ç\u009c\u0097Çú¾j\u001735úS ¥¡ÛÍ´Ï<¥AÎ\u0080÷QÅ\u00929u«a\u0094½¶Ç[\u001cW!\u0094Ë\u0083Ùý\u0010%\u0017-\u0014ò\u0099\u000eö\u0099u³\u008e©·\\\u001d\u0010__\u0003Ò%'wþéÓºv\u007f}\u0095*\u0010¨E|ê)3kçH,\u0011\u0088\u0086?Õ\f\u0018ç\u0096cI3S\u0006Ç\u008c!*\u0096<\u0089¶Êf\"x0ßrR\u000e Ð\u001d¨îNF%»¾GmÙEZ.\u001c\u0004\u009d)oË÷9\u001có\u0019t:RÐ\u0080\u0090 \u0011a[þ\u0096¿hß×ËÞÌ\u00148*i2\u009fÙEa\u0089\u0087\u000f\u0004¯2p\u0086º¤\u008a(òH½Âx¦Ë\u0098~\fK\u0003Ñ\ror&fÉ¨s*iÊ`nø2|ë>\u0082~Å§í\u008d\u009d\u0093#(l\u0099º\u00869=æë§ÙS±\u001c\u0095\u0005\u008eûòÖ\u001b®'dëzºþ\u0080-ÇX`·\u000f¤ÿ-\u0094{t ;g±Tf\u0084\u0013\u00105ÿ\u0093+\u008c»®GÌ\u0085 \u0003ø÷=89\u0086d\u0005Øô\u0016\u0093 )Û$È·%\u0012þ\u008b¼^\\¢\u009d\u0095·:\u0011\f|\u000er GW\u0004²\u009eS¥2:"
         .length();
      char var14 = '\u0010';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var37 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
         byte var10001 = -1;
         var18[var16++] = var37;
         if ((var13 += var14) >= var17) {
            var15 = "ì\u008cÖY©å\u007f¿VNM_\u0001?(\u0094Ï¸Ó×1\u001e\u0085¼\u0015\u001cÆ&é£:\u008d(Ï=^¨=éÏtÞ\u001eG\u0087Q÷\u0099l\u009a:Í¡¶v\u00027\u0084íá\u008c¨:´[¶ï\u0000\u0002\u001d\u000bxý";
            var17 = "ì\u008cÖY©å\u007f¿VNM_\u0001?(\u0094Ï¸Ó×1\u001e\u0085¼\u0015\u001cÆ&é£:\u008d(Ï=^¨=éÏtÞ\u001eG\u0087Q÷\u0099l\u009a:Í¡¶v\u00027\u0084íá\u008c¨:´[¶ï\u0000\u0002\u001d\u000bxý"
               .length();
            var14 = ' ';
            var13 = -1;

            while (true) {
               var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
               String var39 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
               int var33 = 0;
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var18;
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[49];
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\u008bÈ]ÉnjÛð\u009cg<|÷½\u009cÙ";
                  int var5 = "\u008bÈ]ÉnjÛð\u009cg<|÷½\u009cÙ".length();
                  byte var2 = 0;

                  do {
                     var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     var33 = var3++;
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
                     byte var43 = -1;
                     var6[var33] = var10004;
                  } while (var2 < var5);

                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var6;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Integer[2];
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(
                     27262, var20 ^ 6061604562117548158L
                  );
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                  Identifier var30 = Identifier.fromNamespaceAndPath("polinex", "translucent_draw");
                  Intrinsics.checkNotNullExpressionValue(var30, "fromNamespaceAndPath(...)");
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var30;
                  Minecraft var31 = Minecraft.getInstance();
                  Intrinsics.checkNotNullExpressionValue(var31, "getInstance(...)");
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var31;
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ByteBufferBuilder(1536);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new float[3];
                  return;
               }

               var14 = var15.charAt(var13);
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   private static UnsupportedOperationException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      UnsupportedOperationException var0
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 956;
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
            throw new RuntimeException(
               "me/octo/client/utils/render/world/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10
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
            "me/octo/client/utils/render/world/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30805;
      if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var3] == null) {
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
         long var5 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3];
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
         Object[] var9 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/render/world/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var3] = var15;
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var3];
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
            "me/octo/client/utils/render/world/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$da782d2c000b5efa(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      LevelRenderContext var1,
      BlockPos var2,
      Color var3,
      double var4,
      boolean var6,
      int var7,
      long var8,
      Object var10
   ) {
      var8 = 138026676544231L;
      var8 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var8;
      long var11 = var8 ^ 96565436473006L;
      int[] var13 = FrustumUtils.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();

      int var10000;
      byte var10001;
      label37: {
         label36: {
            try {
               var10000 = var7;
               var10001 = 8;
               if (var13 == null) {
                  break label37;
               }

               if ((var7 & 8) == 0) {
                  break label36;
               }
            } catch (UnsupportedOperationException var19) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19);
            }

            var4 = 1.0;
         }

         try {
            var10000 = var7;
            var10001 = 16;
         } catch (UnsupportedOperationException var17) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var17);
         }
      }

      label28: {
         try {
            if ((var10000 & var10001) == 0) {
               break label28;
            }

            var22 = false;
         } catch (UnsupportedOperationException var18) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var18);
         }

         var6 = var22;
      }

      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$bb8d3351c3bac92a(var1, var2, var3, var4, var6, var11);
   }

   @NotNull
   public final AABB IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$851d859ba608babb(
      @NotNull ClientLevel worldArg, long argument2Arg, @NotNull BlockPos posArg
   ) {
      argument2Arg = 75808133881557L;
      argument2Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument2Arg;
      long var5 = argument2Arg ^ 128813717137340L;
      Intrinsics.checkNotNullParameter(worldArg, "world");
      Intrinsics.checkNotNullParameter(posArg, "pos");
      BlockState var10002 = worldArg.getBlockState(posArg);
      Intrinsics.checkNotNullExpressionValue(var10002, "getBlockState(...)");
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$8cf179720a3be11f(
         worldArg, var10002, var5, posArg
      );
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$263ac37ef1dd6fa1(
      short var0,
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      LevelRenderContext var2,
      AABB var3,
      Color var4,
      double var5,
      boolean var7,
      int var8,
      long var9,
      Object var11
   ) {
      var9 = 96356471690904L;
      long var12 = ((long)var0 << 48 | var9 << 16 >>> 16) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var10001 = var12 ^ 22569297149239L;
      int var14 = (int)((var12 ^ 22569297149239L) >>> 48);
      int var15 = (int)((var12 ^ 22569297149239L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      int[] var17 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1716133205270293764L, var12
      );

      int var10000;
      label29: {
         label28: {
            try {
               var10000 = var8;
               if (var17 == null) {
                  break label29;
               }

               if ((var8 & 8) == 0) {
                  break label28;
               }
            } catch (UnsupportedOperationException var19) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var19, 1586646794842999730L, var12
               );
            }

            var5 = 1.0;
         }

         try {
            var10000 = var8 & 16;
         } catch (UnsupportedOperationException var18) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var18, 1586646794842999730L, var12
            );
         }
      }

      if (var10000 != 0) {
         var7 = false;
      }

      var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var3, (char)var14, var4, var15, var5, var7, (char)var16);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$bb8d3351c3bac92a(
      @NotNull LevelRenderContext contextArg, @NotNull BlockPos posArg, @NotNull Color colorArg, double argument4Arg, boolean argument5Arg, long argument6Arg
   ) {
      argument6Arg = 52474402111256L;
      argument6Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument6Arg;
      long var9 = (argument6Arg ^ 106572805488442L) >>> 8;
      int var11 = (int)((argument6Arg ^ 106572805488442L) << 56 >>> 56);
      Intrinsics.checkNotNullParameter(contextArg, "context");
      Intrinsics.checkNotNullParameter(posArg, "pos");
      Intrinsics.checkNotNullParameter(colorArg, "color");
      float[] var12 = new float[]{
         colorArg.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         colorArg.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         colorArg.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI()
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3b193e9a21aa3fc(
         contextArg, posArg, var12, argument4Arg, argument5Arg, var9, (byte)var11
      );
   }

   @NotNull
   public final AABB IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$8cf179720a3be11f(
      @NotNull ClientLevel worldArg, @NotNull BlockState stateArg, long argument3Arg, @NotNull BlockPos posArg
   ) {
      argument3Arg = 57413623970360L;
      argument3Arg = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ argument3Arg;
      Intrinsics.checkNotNullParameter(worldArg, "world");
      Intrinsics.checkNotNullParameter(stateArg, "state");
      Intrinsics.checkNotNullParameter(posArg, "pos");

      AABB var6;
      try {
         var6 = stateArg.getShape((BlockGetter)worldArg, posArg).singleEncompassing().bounds().move(posArg);
         Intrinsics.checkNotNull(var6);
         var6 = var6;
      } catch (UnsupportedOperationException var8) {
         var6 = new AABB(posArg);
      }

      return var6;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3b193e9a21aa3fc(
      @NotNull LevelRenderContext var1, @NotNull BlockPos var2, @NotNull float[] var3, double var4, boolean var6, long var7, byte var9
   ) {
      var7 = 320895301891L;
      long var10 = (var7 << 8 | (long)var9 << 56 >>> 56) ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var12 = var10 ^ 19701107215221L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20579, 8411404279665333246L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21402, 4180626181347971105L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18941, 3622750636692539979L ^ var10)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var12, var1, var2.getX(), var2.getY(), var2.getZ(), var2.getX() + 1.0, var2.getY() + 1.0, var2.getZ() + 1.0, var3, 1.0F, var4, var6
      );
   }
}
