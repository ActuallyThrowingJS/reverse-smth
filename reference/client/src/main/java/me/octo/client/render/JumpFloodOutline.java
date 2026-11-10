package me.octo.client.render;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuSampler;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.PoseStack;
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
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.utils.PolinexLogger;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class JumpFloodOutline {
   @NotNull
   public static JumpFloodOutline IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static volatile float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static volatile float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static volatile boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private static Lazy IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private static Lazy llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private static Lazy IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static Lazy lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static Lazy llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 108806728433789L;
   private static String[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static String[] IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static Map IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new HashMap(13);

   private JumpFloodOutline() {
   }

   private final GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      Lazy var1 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      Lazy var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      Lazy var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuBufferSlice IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      Lazy var1 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      return (GpuBufferSlice)var1.getValue();
   }

   private final GpuSampler lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var1;
      Lazy var3 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      Object var10000 = var3.getValue();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(20544, 2064808846187419989L ^ var1)
      );
      return (GpuSampler)var10000;
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = Math.max(
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(float var0) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Math.max(
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(float var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Math.max(0.1F, var0);
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var0) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var0;
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   @JvmStatic
   public static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(float var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = Math.max(
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl, Math.max(0.0F, var0)
      );
   }

   @JvmStatic
   public static final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(float var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = true;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = Math.max(
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl, Math.max(0.0F, var0)
      );
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @JvmStatic
   public static final boolean shouldHijackVanillaOutline() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   @JvmStatic
   public static final boolean consumeHijackedFrame() {
      boolean var0 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      return var0;
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull WorldRenderEnvironment var0,
      @NotNull AABB var1,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var2,
      long var3
   ) {
      var3 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var3;
      long var5 = var3 ^ 34176496389041L;
      long var7 = var3 ^ 52579476230030L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(23120, 1602189593725197571L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(1612, 8564163632497393923L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(11823, 6944568214932662625L ^ var3)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var5, var0.getPoseStack(), JumpFloodOutline::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0,
      @NotNull WorldRenderEnvironment var2,
      @NotNull AABB var3,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var4
   ) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      long var5 = var0 ^ 71161667219469L;
      long var7 = var0 ^ 1913073752367L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(9225, 2676934405491087323L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16146, 8816099146565111032L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(21140, 2536551832840053111L ^ var0)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var5, var2.getPoseStack(), JumpFloodOutline::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
      );
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, @NotNull PoseStack param2, @NotNull Function1 param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param0, @NotNull PoseStack param2, @NotNull Function1 param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final RenderTarget IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final RenderTarget IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(char param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent(priority = EventPriority.LOWEST)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void consumeVanillaSilhouette(@NotNull RenderTarget entityOutlineTargetArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eventArg
   ) {
      long var2 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 38180307116778L;
      long var4 = (var2 ^ 37313679478788L) >>> 16;
      int var6 = (int)((var2 ^ 37313679478788L) << 48 >>> 48);
      Intrinsics.checkNotNullParameter(eventArg, "event");
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = false;
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0F;
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
      IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.0F;
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;

      try {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.close();
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.close();
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.close();
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.close();
      } catch (Throwable var8) {
         PolinexLogger.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$d74cc7cedfb6a782(
            var4, "[Outline] FBO close on world change failed: " + var8.getMessage(), (char)var6
         );
      }
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short param1, GpuTextureView param2, RenderTarget param3, short param4, float param5, GpuBufferSlice param6, int param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      GpuTextureView param1, RenderTarget param2, float param3, float param4, boolean param5, GpuBufferSlice param6, long param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final String IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(7748, 392585088856915394L ^ var0);
   }

   private static final GpuBufferSlice IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      long var2 = var0 ^ 53082211101973L;
      long var4 = var0 ^ 17129242533278L;
      return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, JumpFloodOutline::IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI
         );
   }

   private static final String IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(4361, 1851171626329235875L ^ var0);
   }

   private static final GpuBufferSlice lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      long var2 = var0 ^ 76650504461768L;
      long var4 = var0 ^ 64657570348625L;
      return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, JumpFloodOutline::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll
         );
   }

   private static final String IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(int var0, short var1, char var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(309, 1777910876269563668L ^ var3);
   }

   private static final GpuBufferSlice IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      long var2 = var0 ^ 24956296152443L;
      long var10001 = var0 ^ 115987902290017L;
      int var4 = (int)((var0 ^ 115987902290017L) >>> 32);
      int var5 = (int)((var0 ^ 115987902290017L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, JumpFloodOutline::IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl
         );
   }

   private static final String IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(short var0, short var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(31122, 3082478441793818L ^ var3);
   }

   private static final GpuBufferSlice IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      long var2 = var0 ^ 28897893735210L;
      long var10001 = var0 ^ 47219657603230L;
      int var4 = (int)((var0 ^ 47219657603230L) >>> 48);
      int var5 = (int)((var0 ^ 47219657603230L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, JumpFloodOutline::IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII
         );
   }

   private static final GpuSampler IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
      return RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      AABB var0,
      me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
      long var2,
      WorldRenderEnvironment var4
   ) {
      var2 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var2;
      int var5 = (int)((var2 ^ 13578988539029L) >>> 48);
      long var6 = (var2 ^ 13578988539029L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(14601, 4894493199602790841L ^ var2)
      );
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (short)var5, var4, var0, var1, null, 0, 0, var6, 0.0F, 56, null
      );
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0,
      AABB var2,
      me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3,
      WorldRenderEnvironment var4
   ) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      int var5 = (int)((var0 ^ 54712314277526L) >>> 48);
      long var6 = (var0 ^ 54712314277526L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(2933, 2853628290437472719L ^ var0)
      );
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (short)var5, var4, var2, var3, null, 0, 0, var6, 0.0F, 56, null
      );
      return Unit.INSTANCE;
   }

   private static final String llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(5670, 2424600830030908470L ^ var0);
   }

   private static final String lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(2623, 1151024680382059209L ^ var0);
   }

   private static final String IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(1917, 8989462225547760791L ^ var0);
   }

   private static final String IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(long var0) {
      var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(31716, 4279698779254532730L ^ var0);
   }

   static {
      long var9 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 40352421313754L;
      long var11 = var9 ^ 60207868941463L;
      long var13 = var9 ^ 115710613508725L;
      long var15 = var9 ^ 111902111419428L;
      long var17 = var9 ^ 3039873805663L;
      long var19 = var9 ^ 73888484893770L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[47];
      int var5 = 0;
      String var4 = ")næÜ\t\u0017wu\u0090DÇ\\§\u0090\u0089Y\u0012}\u0087uÂi(Ç\u0010´gG 1©\u0094\u00001Ê\u008eçÐnf8(áì@\u0090ªÏ\u0087×§\u000bt\u0016\u0002Ð\u0018\u001e\u00858\u009bW5e+\u001fLÈ\"Ñ\u009bl¡\u0085Z§øe7¢Í?@ÓÒcmTùäÇa\u0082\u008bmÓÆ\u000b\u00886\u009c¤\u001c\u009c\u0090ä²Ã}^ýu\n\u0007zD`\u008cJW\u001a,\u0090°X$»\u0003È,D\u0017õGÒüu\u001cÐÈ\u0011×u \u0011\u008c¦ ô8Z?ìÌaÐ-Ør²\u0096Q¨Æ\u0093SPöá\u0091\bÒà@ÐË-/\u001cÖ\u0010r1=Æ·8Nmë4CµQÜòì 0«)ÁË\u0086\u0092,à\u0086M¡\u008bÄ;Ù¬ª\u0015$\u0088\u0000ÃÊ×«ýý\u001e¬ÚÌ(÷Ö_Òã\fí\u008cQÓ5ÅC®RÍÖ}uõ\u0099Þu¶\u001e]\nF´ \u007f\u0096â:á\"\u001d\u0089£9\u0010Ê\u008e\u00ad\u00ad*´\u0003.¿\u0099æ%\u009bêQJ ÖÂ¼§ô\u0090\u0015¦Êc\bçñJ1\nk\u001eÂs\u0087\u0083'\u0092½Soh×\u009b£D\u0018ÍìßBx5ÈKGGýJE=-$·¼JTì¢\ft(!B\tôW\u0014¡8É*\u0090yEï\u0099{p³à\u0097\u009dÊ¹7éæÚ\u008a²£û·\u0013\u000e\u0092³\u0098'Æ³\u0010\u0084Ò:rçFn¬Ãà{Z·z_Û %¨öj«ë\rçt\u00863Ã¶\u0085$Ï\u0007êóÊ\u0091¤@¿¹«V\u0081\u0016úÝË0\u0092d\u008cÈtá'¢³V¨\u008ft#\u0003§q\u000f\u0092Üt\u00adT\u0088\u000e<\b\u0091Þô¡ñ\u0082Äi¿Jú¤\u0017+ØQ§\u0097ñ\u0015A \u0087êo~¹ãuA\u0096¶Ïò\u0091.6WÜö\u0086\u0018\u009c^í\u0015ÖêEmDãç\u008b8÷Loß¬Ã\u0004Ëg\u009cþ\u008bÈ\u0000¦\u0010~l6(K\u000b\u00183?q\tÐ\u0015\u0019\u00ad\n3Ï#\u0080í¬\r\u0085¹\u0098R1²/½Þ²U(\u0090¨§\u0094å(\u0093}\u0012-Vû\u0091Rý.)ÚN\u0084é0?þªZ\u0085:jûý£q¯D\u0096\u0013í\u008aY\båKüðIH%2'\u0015`\u0082¹\u0083\u009e\u0010U\u000ez5ü\u000f\u008a¹µ\u0086\u0094È´\u0013\u0006\u0088ü;äq\nH}¾j\u008eµ0\u0005)© ç\u0096ñ_\u009cA\u0099$î¼DmX\u0016\u008f`s\u008d²ßW\u001a}E¡\u0082àû¥<\u0010\u0089w\u0095÷h\u007f\u001b\u0080pz5\u001c\u009c\u00834B\u0010\u0095¥0\u009e.Ã\u009dû½\u001c\u0093:;¯\bU\u0010(½M\u0001[n+Ý\u0012ÏFå±µ\u0004Û ^j#d\u009b×«\u00920\u001crYj\tTð\u0082\u009d\b¿b£\u0080\u009c6UÂU\u001f\u0096\u008c\u009fH{Z\n ºª\u0097\u0088\u009eÁ\u0000Õ\u0096¢`EG`Ï\u008fÕ!\u0013I10\u001cv\u0013Ë_+I\u001a\u0084¬a\u00ad,¾e\u0081Õ;N.»\u001fÿ\u000b\u0007(´÷µøúwvK\u0096'û7~D\u0097\r¸\u0002\u0000ð(\u0001<W\u0001öÊ\u001dè%j`*TVvo\u0098ksö8\u0085;1¹6ÃÅóWØ\nÕ}ÒC·\u000b\u0083U(\u000fG¸«rÆÆ\u0092ÁÊ3Ýg¹jem\tÄmÔ'Ï^æ½W³\u000f9fVºjÝ*ÝP\u0005S\u0010{bÁ\fq¿\u0003;_TÏ\u0096=-9Y(Òÿ£yÑ.5\u0017z¹\u0013A\\\u0080¬m\t\u001eDl\u0015»¾\u00196Õ \u0084±\u0000>À\u008cVj`Ñ105(ù|Ú\u0088P¹ô\u0012\nB\u009dw\u0018\u008b5\u008c6Ô<Î{¨¹\u001e¬åÉnÞ¦Û¯{]ÌÃ #q\u0013(\u0083Ò.\b®¼/c©\u0083\u0091\u0089,\u0084QÆ\u009dá¶ü`\u008b\u0012\fØk\rp\u001b=µH;¸Ó.÷è\u001fM Cyô±\u0010¤,ãÉ\u008c»=\u009bê1Ì\u0017y{7©Z\u0099\u001e\u0006I\u0085Íd\u000e¿A0WUtð>~RA¤\u00050È\u0086lDbÍü\fý\u0092Jm¤\n\u000fù\u00948P\u0090\\\u0000g\u0097>ÝAà-Í¬\u0087äQÈ\u0090? \u00984#jÂª\u0084¿xÁ\n.\u0084,ß \u009cZ§ãj=»\u0003C\u0086ü\u008d5#êD0\u009d\u0015}Ð-\u0003R\u009cæ\u0086ÛRXN\u001eì~ËThnõ\u009d\u0019îï\u0095ÄÜ\u0099XÚ\u000b-Vöÿ²üÀ³\u00944Bú\u008fø\n\u0018~v¨J\u0081!q J¤\u0019£J\u0019¯¢\u0015\u00ad9\u0089µè\u0003t\u0010ìûT5!\u0018\u0098op\u00144Ä}\\\u0083KPT\u009706¸ùld\u0093\u0001`\u0085§Üô\u0007\u0098æy\u0084V\u0007o«õyéÎìè>\u0013&>t!Óù\u0016¯¥?\u0092¹\fem7ñ\u008bÑ\u0088¸?\u0093\u0003c'³,®(ËìÇOí§Ê¤Ä3Ææ¬\\#\u0014ä\"(%Ùº\u000b$\u008eZ\u008b\u009d\u0017Q\u0080\n\\·Ò}\u008b¼\u0007\u0005IÀ\bw¾\u00ad>\u008bKÖÜ\u008dß\u0085\u0010¤a\u001e<0#«h\u001c\u009b\\b²\u009c£GE1Öí\u0089zv$BlÞM\u0013[\\\u001b\u000bØ¶\u0003\u0004\u009dÕù`\u001b\u0006\u009bð»\u0085ª\u0090òÖ]\u001a@\u0098Ó\u0086õ\u008ctÜ¬P2\t\u0080ºüð\n4äª4\u007f/*¨Èéa\u0013NÞH|\u009b¶?â\u0088ú8ÝÂ®\u0017Hª¡\u009ck[:¬E\u0006\"öMs\u000eÊ0\u001bº\u009b÷\u0018J\u00940´Oãòà\u0092o\u0001\u0015\bÞ/]+ð(o« 5,\u0018F_}m,û\u0098\u0011\u000fdÊ\u0093N\u0013,¨%|JSÀ\u0017\u008få(z\u0003s¸AäO¿ís\u0019.é\u008fâÆ£{(V\u001cI,\u0004§#\u0013K\u008cP\u0090\\pÏAç&7,Ã\u0010Út>\u000e$ø\u000f\u008eS\\û¸®ö{«@¨¦\u009bÉ\u001bK;\bb^R\u008f\u008e)yôs$|UF\u008aãíÎ£\u0081_Æ\fä\u0006h\u0088ä·¹,-\u0002ü\u00874\u0083iY{Þ:ñóH\u0004ý\u0003ê&$Ó\u0081\u0001!H\u008e";
      int var6 = ")næÜ\t\u0017wu\u0090DÇ\\§\u0090\u0089Y\u0012}\u0087uÂi(Ç\u0010´gG 1©\u0094\u00001Ê\u008eçÐnf8(áì@\u0090ªÏ\u0087×§\u000bt\u0016\u0002Ð\u0018\u001e\u00858\u009bW5e+\u001fLÈ\"Ñ\u009bl¡\u0085Z§øe7¢Í?@ÓÒcmTùäÇa\u0082\u008bmÓÆ\u000b\u00886\u009c¤\u001c\u009c\u0090ä²Ã}^ýu\n\u0007zD`\u008cJW\u001a,\u0090°X$»\u0003È,D\u0017õGÒüu\u001cÐÈ\u0011×u \u0011\u008c¦ ô8Z?ìÌaÐ-Ør²\u0096Q¨Æ\u0093SPöá\u0091\bÒà@ÐË-/\u001cÖ\u0010r1=Æ·8Nmë4CµQÜòì 0«)ÁË\u0086\u0092,à\u0086M¡\u008bÄ;Ù¬ª\u0015$\u0088\u0000ÃÊ×«ýý\u001e¬ÚÌ(÷Ö_Òã\fí\u008cQÓ5ÅC®RÍÖ}uõ\u0099Þu¶\u001e]\nF´ \u007f\u0096â:á\"\u001d\u0089£9\u0010Ê\u008e\u00ad\u00ad*´\u0003.¿\u0099æ%\u009bêQJ ÖÂ¼§ô\u0090\u0015¦Êc\bçñJ1\nk\u001eÂs\u0087\u0083'\u0092½Soh×\u009b£D\u0018ÍìßBx5ÈKGGýJE=-$·¼JTì¢\ft(!B\tôW\u0014¡8É*\u0090yEï\u0099{p³à\u0097\u009dÊ¹7éæÚ\u008a²£û·\u0013\u000e\u0092³\u0098'Æ³\u0010\u0084Ò:rçFn¬Ãà{Z·z_Û %¨öj«ë\rçt\u00863Ã¶\u0085$Ï\u0007êóÊ\u0091¤@¿¹«V\u0081\u0016úÝË0\u0092d\u008cÈtá'¢³V¨\u008ft#\u0003§q\u000f\u0092Üt\u00adT\u0088\u000e<\b\u0091Þô¡ñ\u0082Äi¿Jú¤\u0017+ØQ§\u0097ñ\u0015A \u0087êo~¹ãuA\u0096¶Ïò\u0091.6WÜö\u0086\u0018\u009c^í\u0015ÖêEmDãç\u008b8÷Loß¬Ã\u0004Ëg\u009cþ\u008bÈ\u0000¦\u0010~l6(K\u000b\u00183?q\tÐ\u0015\u0019\u00ad\n3Ï#\u0080í¬\r\u0085¹\u0098R1²/½Þ²U(\u0090¨§\u0094å(\u0093}\u0012-Vû\u0091Rý.)ÚN\u0084é0?þªZ\u0085:jûý£q¯D\u0096\u0013í\u008aY\båKüðIH%2'\u0015`\u0082¹\u0083\u009e\u0010U\u000ez5ü\u000f\u008a¹µ\u0086\u0094È´\u0013\u0006\u0088ü;äq\nH}¾j\u008eµ0\u0005)© ç\u0096ñ_\u009cA\u0099$î¼DmX\u0016\u008f`s\u008d²ßW\u001a}E¡\u0082àû¥<\u0010\u0089w\u0095÷h\u007f\u001b\u0080pz5\u001c\u009c\u00834B\u0010\u0095¥0\u009e.Ã\u009dû½\u001c\u0093:;¯\bU\u0010(½M\u0001[n+Ý\u0012ÏFå±µ\u0004Û ^j#d\u009b×«\u00920\u001crYj\tTð\u0082\u009d\b¿b£\u0080\u009c6UÂU\u001f\u0096\u008c\u009fH{Z\n ºª\u0097\u0088\u009eÁ\u0000Õ\u0096¢`EG`Ï\u008fÕ!\u0013I10\u001cv\u0013Ë_+I\u001a\u0084¬a\u00ad,¾e\u0081Õ;N.»\u001fÿ\u000b\u0007(´÷µøúwvK\u0096'û7~D\u0097\r¸\u0002\u0000ð(\u0001<W\u0001öÊ\u001dè%j`*TVvo\u0098ksö8\u0085;1¹6ÃÅóWØ\nÕ}ÒC·\u000b\u0083U(\u000fG¸«rÆÆ\u0092ÁÊ3Ýg¹jem\tÄmÔ'Ï^æ½W³\u000f9fVºjÝ*ÝP\u0005S\u0010{bÁ\fq¿\u0003;_TÏ\u0096=-9Y(Òÿ£yÑ.5\u0017z¹\u0013A\\\u0080¬m\t\u001eDl\u0015»¾\u00196Õ \u0084±\u0000>À\u008cVj`Ñ105(ù|Ú\u0088P¹ô\u0012\nB\u009dw\u0018\u008b5\u008c6Ô<Î{¨¹\u001e¬åÉnÞ¦Û¯{]ÌÃ #q\u0013(\u0083Ò.\b®¼/c©\u0083\u0091\u0089,\u0084QÆ\u009dá¶ü`\u008b\u0012\fØk\rp\u001b=µH;¸Ó.÷è\u001fM Cyô±\u0010¤,ãÉ\u008c»=\u009bê1Ì\u0017y{7©Z\u0099\u001e\u0006I\u0085Íd\u000e¿A0WUtð>~RA¤\u00050È\u0086lDbÍü\fý\u0092Jm¤\n\u000fù\u00948P\u0090\\\u0000g\u0097>ÝAà-Í¬\u0087äQÈ\u0090? \u00984#jÂª\u0084¿xÁ\n.\u0084,ß \u009cZ§ãj=»\u0003C\u0086ü\u008d5#êD0\u009d\u0015}Ð-\u0003R\u009cæ\u0086ÛRXN\u001eì~ËThnõ\u009d\u0019îï\u0095ÄÜ\u0099XÚ\u000b-Vöÿ²üÀ³\u00944Bú\u008fø\n\u0018~v¨J\u0081!q J¤\u0019£J\u0019¯¢\u0015\u00ad9\u0089µè\u0003t\u0010ìûT5!\u0018\u0098op\u00144Ä}\\\u0083KPT\u009706¸ùld\u0093\u0001`\u0085§Üô\u0007\u0098æy\u0084V\u0007o«õyéÎìè>\u0013&>t!Óù\u0016¯¥?\u0092¹\fem7ñ\u008bÑ\u0088¸?\u0093\u0003c'³,®(ËìÇOí§Ê¤Ä3Ææ¬\\#\u0014ä\"(%Ùº\u000b$\u008eZ\u008b\u009d\u0017Q\u0080\n\\·Ò}\u008b¼\u0007\u0005IÀ\bw¾\u00ad>\u008bKÖÜ\u008dß\u0085\u0010¤a\u001e<0#«h\u001c\u009b\\b²\u009c£GE1Öí\u0089zv$BlÞM\u0013[\\\u001b\u000bØ¶\u0003\u0004\u009dÕù`\u001b\u0006\u009bð»\u0085ª\u0090òÖ]\u001a@\u0098Ó\u0086õ\u008ctÜ¬P2\t\u0080ºüð\n4äª4\u007f/*¨Èéa\u0013NÞH|\u009b¶?â\u0088ú8ÝÂ®\u0017Hª¡\u009ck[:¬E\u0006\"öMs\u000eÊ0\u001bº\u009b÷\u0018J\u00940´Oãòà\u0092o\u0001\u0015\bÞ/]+ð(o« 5,\u0018F_}m,û\u0098\u0011\u000fdÊ\u0093N\u0013,¨%|JSÀ\u0017\u008få(z\u0003s¸AäO¿ís\u0019.é\u008fâÆ£{(V\u001cI,\u0004§#\u0013K\u008cP\u0090\\pÏAç&7,Ã\u0010Út>\u000e$ø\u000f\u008eS\\û¸®ö{«@¨¦\u009bÉ\u001bK;\bb^R\u008f\u008e)yôs$|UF\u008aãíÎ£\u0081_Æ\fä\u0006h\u0088ä·¹,-\u0002ü\u00874\u0083iY{Þ:ñóH\u0004ý\u0003ê&$Ó\u0081\u0001!H\u008e"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var31 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var31;
         if ((var2 += var3) >= var6) {
            var4 = "\u0095æ¾t~\u0000G)Û\u0004qWg2\u0012¸ú\u0081\u0011[AZRÈ\u0006®/: Ì¯3àÊ¤C\u009aD_Y84_\u009bÍþýn`\u0016zñgg\u0012\u008c¦`=§¯ñ\u008f|L\u0086lÜj¾Ô:î#L;\fÓôÉ\u009b:¢6ê\u008f¢\u0003X'äËñ\u0019zõ%";
            var6 = "\u0095æ¾t~\u0000G)Û\u0004qWg2\u0012¸ú\u0081\u0011[AZRÈ\u0006®/: Ì¯3àÊ¤C\u009aD_Y84_\u009bÍþýn`\u0016zñgg\u0012\u008c¦`=§¯ñ\u008f|L\u0086lÜj¾Ô:î#L;\fÓôÉ\u009b:¢6ê\u008f¢\u0003X'äËñ\u0019zõ%"
               .length();
            var3 = '(';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var29 = false;
               var7[var5++] = var33;
               if ((var2 += var3) >= var6) {
                  IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var7;
                  IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new String[47];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new JumpFloodOutline();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     "Polinex Outline Mask FBO", false, 0, 4, null
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     "Polinex Glow Mask FBO", false, 0, 4, null
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     "Polinex Glow Ping", false, 0, 4, null
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.render.engine.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     "Polinex Outline Ping", false, 0, 4, null
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = true;
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 1.5F;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = true;
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 1.5F;
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = true;
                  IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = LazyKt.lazy(
                     JumpFloodOutline::IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl
                  );
                  llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = LazyKt.lazy(
                     JumpFloodOutline::lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl
                  );
                  IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = LazyKt.lazy(
                     JumpFloodOutline::IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI
                  );
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = LazyKt.lazy(
                     JumpFloodOutline::IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII
                  );
                  llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = LazyKt.lazy(
                     JumpFloodOutline::IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI
                  );
                  PolinexAccessor.INSTANCE
                     .eventBus
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$864ed80a9d741ba9(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var17
                     );
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26341;
      if (IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/JumpFloodOutline", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5].getBytes("ISO-8859-1");
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5];
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
         throw new RuntimeException("me/octo/client/render/JumpFloodOutline" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5c435075b3256fb4(
      long argument1Arg, @NotNull PoseStack matricesArg, @NotNull Function1 actionArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b97bc5b51a4b61b2(
      long argument1Arg, @NotNull PoseStack matricesArg, @NotNull Function1 actionArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0e5648cface84f2f(
      GpuTextureView param1, RenderTarget param2, float param3, float param4, boolean param5, GpuBufferSlice param6, long param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final RenderTarget IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$5cb874fdf22bce16(
      int param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final RenderTarget IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$b9cc227a5234e11d(
      char param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$f3242a90c8804615(
      long argument1Arg,
      @NotNull WorldRenderEnvironment envArg,
      @NotNull AABB boxArg,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll colorArg
   ) {
      argument1Arg = 101478393075041L;
      argument1Arg = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ argument1Arg;
      long var5 = argument1Arg ^ 71161667219469L;
      long var7 = argument1Arg ^ 1913073752367L;
      Intrinsics.checkNotNullParameter(envArg, "env");
      Intrinsics.checkNotNullParameter(boxArg, "box");
      Intrinsics.checkNotNullParameter(colorArg, "color");
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b97bc5b51a4b61b2(
         var5, envArg.getPoseStack(), JumpFloodOutline::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
      );
   }

   private final GpuSampler lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$dd5bbe6d80f66843(long var1) {
      var1 = 133678688710555L;
      var1 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var1;
      Lazy var3 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      Object var10000 = var3.getValue();
      Intrinsics.checkNotNullExpressionValue(var10000, "getValue(...)");
      return (GpuSampler)var10000;
   }
}
