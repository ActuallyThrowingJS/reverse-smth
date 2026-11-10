package me.octo.client.render.chams;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.CompareOp;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.render.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.render.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import net.minecraft.client.renderer.rendertype.RenderSetup.RenderSetupBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;
import org.jetbrains.annotations.NotNull;

public final class PolinexChams {
   @NotNull
   public static PolinexChams IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static DepthStencilState lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static RenderPipeline IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static RenderPipeline lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static RenderPipeline IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static BiFunction<Identifier, Boolean, RenderType> ENTITY_TRANSLUCENT;
   @JvmField
   @NotNull
   public static Function<Identifier, RenderType> ENTITY_CUTOUT;
   @JvmField
   @NotNull
   public static BiFunction<Identifier, Boolean, RenderType> ENTITY_CUTOUT_NO_CULL;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 36775827416298L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);

   private PolinexChams() {
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Builder var1) {
      boolean var2 = false;
      var1.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short var0, char var1, int var2, Builder var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      long var10001 = var4 ^ 16335203772473L;
      int var6 = (int)((var4 ^ 16335203772473L) >>> 32);
      int var7 = (int)((var4 ^ 16335203772473L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(1971, 3945907929126109097L ^ var4)
      );
      Snippet var13 = RenderPipelines.ENTITY_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.ENTITY_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(8963, 2503866196167056150L ^ var4)
      );
      Snippet var9 = var13;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, var6, var9, (char)var7, (short)var8
      );
      var3.withShaderDefine(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(10800, 8361905199542915647L ^ var4), 0.1F
      );
      var3.withShaderDefine(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(30712, 5868901950974693361L ^ var4));
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(24341, 530198474285983492L ^ var4));
      var3.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var3.withCull(false);
      PolinexChams var10 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var12 = false;
      var3.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0, Builder var2) {
      var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var0;
      long var10001 = var0 ^ 139653461393927L;
      int var3 = (int)((var0 ^ 139653461393927L) >>> 32);
      int var4 = (int)((var0 ^ 139653461393927L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(17824, 8239447699690608525L ^ var0)
      );
      Snippet var11 = RenderPipelines.ENTITY_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.ENTITY_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(4712, 8987036747328913481L ^ var0)
      );
      Snippet var6 = var11;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      var2.withShaderDefine(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(32345, 683848950319410282L ^ var0), 0.1F);
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(183, 3772548376072852101L ^ var0));
      PolinexChams var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var9 = false;
      var2.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, Builder var2) {
      var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var0;
      long var10001 = var0 ^ 130752253104327L;
      int var3 = (int)((var0 ^ 130752253104327L) >>> 32);
      int var4 = (int)((var0 ^ 130752253104327L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(1971, 3945951976841824087L ^ var0)
      );
      Snippet var11 = RenderPipelines.ENTITY_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.ENTITY_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(8963, 2503998345072632808L ^ var0)
      );
      Snippet var6 = var11;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      var2.withShaderDefine(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(10800, 8361790644030696129L ^ var0), 0.1F
      );
      var2.withShaderDefine(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(25218, 3637387503077106286L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(24341, 530259842784829434L ^ var0));
      var2.withCull(false);
      PolinexChams var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var9 = false;
      var2.withDepthStencilState(lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      return Unit.INSTANCE;
   }

   private static final RenderType IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, long var1, Identifier var3, Boolean var4
   ) {
      long var5 = ((long)var0 << 48 | var1 << 16 >>> 16) ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

      RenderSetupBuilder var10000;
      OutlineProperty var10001;
      label17: {
         try {
            Intrinsics.checkNotNullParameter(
               var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(8507, 8852737523172831995L ^ var5)
            );
            Intrinsics.checkNotNullParameter(
               var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(27126, 2125921045422848551L ^ var5)
            );
            var10000 = RenderSetup.builder(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl)
               .withTexture(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(16404, 1547379834202264528L ^ var5), var3
               )
               .useLightmap()
               .useOverlay()
               .affectsCrumbling()
               .sortOnUpload();
            if (var4) {
               var10001 = OutlineProperty.AFFECTS_OUTLINE;
               break label17;
            }
         } catch (MatchException var8) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var8, 4629758870571669478L, var5
            );
         }

         var10001 = OutlineProperty.NONE;
      }

      RenderSetup var9 = var10000.setOutline(var10001).createRenderSetup();
      Intrinsics.checkNotNullExpressionValue(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(31822, 5011021436069392284L ^ var5)
      );
      RenderSetup var7 = var9;
      return RenderType.create(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(14486, 8875208794472737626L ^ var5), var7
      );
   }

   private static final RenderType IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var0, long var1, Identifier var3) {
      long var4 = ((long)var0 << 48 | var1 << 16 >>> 16) ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(4000, 1308027775031817580L ^ var4)
      );
      RenderSetup var10000 = RenderSetup.builder(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)
         .withTexture(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(11049, 6831415489550389753L ^ var4), var3)
         .useLightmap()
         .useOverlay()
         .affectsCrumbling()
         .setOutline(OutlineProperty.AFFECTS_OUTLINE)
         .createRenderSetup();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(6779, 6604307559364993191L ^ var4)
      );
      RenderSetup var6 = var10000;
      return RenderType.create(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(3609, 8215817876977071316L ^ var4), var6
      );
   }

   private static final RenderType llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, Identifier var2, Boolean var3
   ) {
      var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var0;

      RenderSetupBuilder var10000;
      OutlineProperty var10001;
      label17: {
         try {
            Intrinsics.checkNotNullParameter(
               var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(4000, 1308129864862615491L ^ var0)
            );
            Intrinsics.checkNotNullParameter(
               var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(17113, 4217573269081033395L ^ var0)
            );
            var10000 = RenderSetup.builder(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII)
               .withTexture(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(11049, 6831526653305971542L ^ var0), var2
               )
               .useLightmap()
               .useOverlay()
               .affectsCrumbling();
            if (var3) {
               var10001 = OutlineProperty.AFFECTS_OUTLINE;
               break label17;
            }
         } catch (MatchException var5) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var5, -2594535973535560616L, var0
            );
         }

         var10001 = OutlineProperty.NONE;
      }

      RenderSetup var7 = var10000.setOutline(var10001).createRenderSetup();
      Intrinsics.checkNotNullExpressionValue(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(6779, 6604339468084859400L ^ var0)
      );
      RenderSetup var4 = var7;
      return RenderType.create(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(9286, 1073179044729646123L ^ var0), var4
      );
   }

   static {
      long var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 110289603595329L;
      long var11 = var9 ^ 26924260875364L;
      long var13 = var9 ^ 19329239060132L;
      long var10001 = var9 ^ 105882698146970L;
      int var15 = (int)((var9 ^ 105882698146970L) >>> 48);
      int var16 = (int)((var9 ^ 105882698146970L) << 16 >>> 48);
      int var17 = (int)(var10001 << 32 >>> 32);
      int var18 = (int)((var9 ^ 88611882411585L) >>> 48);
      long var19 = (var9 ^ 88611882411585L) << 16 >>> 16;
      long var21 = var9 ^ 78050282093263L;
      long var23 = var9 ^ 59292626244846L;
      int var25 = (int)((var9 ^ 100620946067280L) >>> 48);
      long var26 = (var9 ^ 100620946067280L) << 16 >>> 16;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[26];
      int var5 = 0;
      String var4 = "\\ZBP®j\nWE\u009aÀýçàø&?\u0086¥\u008f\u0089\u0016ð\u0081}\u0085Ä\u0001+\u0013\u0090% '\u0092i\u0084Ù\u0094;?ÛßY¨\u001b\u000eb\u0094´ÍþÌR\u0095ñLv3+Ä^1\u001dÀ0îq4 \u0099ì=\u0092è*ãÓÕµGq6¥t6A»¾I%\u0084\u0097\u009b[¸ê´\u008aìõC;ÛÆk2ë\u0018\u0000FÏ\u0005æ8U¢PÎCèä:ª)tS\rE{Î\u0010Öè\u001e^.b§²A%\u0002Úi°EI^\u009cö\u0091§\fmtbÌ¥ÍqßiXÜõ·é~n_ \u000fÀ\u009f\u001b³\b½-ÓíÀ\u0001i¥c,\u0085þ,»ï\u0087ý,¥\u0007 Qkl.Ø(vð+Øi½\u008a-\u0015pVÚjhºÓB\u0002súÂè÷\u009dxÚ¼ÉéêgèúÌ\u009d\u0014Uáb\u001b8®»ñ½\u0093\r?#\u0097À*¼¤éÔ3Þ\u000f]\u0015\u0001\u008dIË\u00ad\u0095\u0011Ì\u0092:=]¯Hq.}\u0091ÞË\u0017\u000b\u0001d\u008e´\u0096$\u0017\u009cø\u0018\u0089¡°J(j#à\u0086Ü¾ä\u0093\b®\u0084SAÕpyZ\u0083¯Õ\u000f\u0013iñï`Y\u00912uöIªx\t·/~\u000f\u0017\u0018§æ!\n\u009f\u0095ó\u0094ò¬2fq¿þ*ìæ\u009a\u0099=Þ·\u000b(dßXlVG'Ö\u0080êTË\u0012Ç\u008fÐìí.y:\u0085äÍ\u0090ùHdûóQÄ\"\u008bÇb\u0082Ç\u0014¿ \u0085¯\\\u001cÒºHd\u0002î) ¿b?»*5\u007fI\u009eñU=|·\u00ad\u0007&\t<É\u0018\u0010¢\u0099§]R·\u0090\u0010Ap\u0003'\u0010Ò[xêEL:RF²(\u0003G\u0010Ä³\u001dÛÝ^\u0083\u008fÍ\u0099\u0081bâE\u0001Øþ\\ï,!=°±¹[_½T é>\u0013[\u000fÄè(«\u0083Íº²Ã\u0002*j¼\u0001\u008dUÜþç7\u0091ÙvILó\u0088E\u00927à-º$ø \u0005¯±@+%W\u0018C{O,y\u001c5@Æ,\u0087èQs_4\u001f\u0099sÜÚn¬!(Û@ô\u0082Ñ,ÉÖÎ#¿í§b\u0089\u0006\u0005±÷Ò\u0096V65\ncÀ%¡µ\u0099FC¬\u0000¤Æ(\u009eB #\u0095iÿ\u0007ÎûrîÚT\u0014.ì[Cü|~ÍD¤ùð\nò]WåÐP` ó\u0095\"\u0016ä\u00134\u0007\u0013?ý´&´¶ÿ\u0005Ý\u0015\u0086j¬Qi¾KKØâ®÷6 ©¶öiPª¾©©\u0086;ýæÉg\u000er´?\u0002Rÿ\u0096?¶(QÕ\u009f£4w )\u0012Ã %\"\u0088Æ\u0094³ù\u0004a\"Ô\u0081üE¹Òå]ÞD\u0005²§¬\fx2! $\u0019\u0012N?~¶\u0014n<\u0088Ü9\u0081>Ö\u0097Æ8HÔh\r\u00877\u0082 \u0091cf\u009fz ï\u001e\u008bA\u001c\bîòNc¾\u001eÎ`Ò|ôÄa\t\u0018~ÛÃ¥¡M\u0007½\u008e<\u0086(¦û~\u001a\u008b¼Ii\u0092¼Þ\u0003\u0084FÉÆ\u0010\u0084©f^f¯\u008e\u0010L\u008bt\u0016¶d?\t\u0002P¡#Wµ\u0095 \u0089ü2_\u009e\u0004ØÑ\u008eZÉ=È/\u0016ê{öÿ\u009bZ½\u0000ø78]/\u008e\\ÐÉ";
      int var6 = "\\ZBP®j\nWE\u009aÀýçàø&?\u0086¥\u008f\u0089\u0016ð\u0081}\u0085Ä\u0001+\u0013\u0090% '\u0092i\u0084Ù\u0094;?ÛßY¨\u001b\u000eb\u0094´ÍþÌR\u0095ñLv3+Ä^1\u001dÀ0îq4 \u0099ì=\u0092è*ãÓÕµGq6¥t6A»¾I%\u0084\u0097\u009b[¸ê´\u008aìõC;ÛÆk2ë\u0018\u0000FÏ\u0005æ8U¢PÎCèä:ª)tS\rE{Î\u0010Öè\u001e^.b§²A%\u0002Úi°EI^\u009cö\u0091§\fmtbÌ¥ÍqßiXÜõ·é~n_ \u000fÀ\u009f\u001b³\b½-ÓíÀ\u0001i¥c,\u0085þ,»ï\u0087ý,¥\u0007 Qkl.Ø(vð+Øi½\u008a-\u0015pVÚjhºÓB\u0002súÂè÷\u009dxÚ¼ÉéêgèúÌ\u009d\u0014Uáb\u001b8®»ñ½\u0093\r?#\u0097À*¼¤éÔ3Þ\u000f]\u0015\u0001\u008dIË\u00ad\u0095\u0011Ì\u0092:=]¯Hq.}\u0091ÞË\u0017\u000b\u0001d\u008e´\u0096$\u0017\u009cø\u0018\u0089¡°J(j#à\u0086Ü¾ä\u0093\b®\u0084SAÕpyZ\u0083¯Õ\u000f\u0013iñï`Y\u00912uöIªx\t·/~\u000f\u0017\u0018§æ!\n\u009f\u0095ó\u0094ò¬2fq¿þ*ìæ\u009a\u0099=Þ·\u000b(dßXlVG'Ö\u0080êTË\u0012Ç\u008fÐìí.y:\u0085äÍ\u0090ùHdûóQÄ\"\u008bÇb\u0082Ç\u0014¿ \u0085¯\\\u001cÒºHd\u0002î) ¿b?»*5\u007fI\u009eñU=|·\u00ad\u0007&\t<É\u0018\u0010¢\u0099§]R·\u0090\u0010Ap\u0003'\u0010Ò[xêEL:RF²(\u0003G\u0010Ä³\u001dÛÝ^\u0083\u008fÍ\u0099\u0081bâE\u0001Øþ\\ï,!=°±¹[_½T é>\u0013[\u000fÄè(«\u0083Íº²Ã\u0002*j¼\u0001\u008dUÜþç7\u0091ÙvILó\u0088E\u00927à-º$ø \u0005¯±@+%W\u0018C{O,y\u001c5@Æ,\u0087èQs_4\u001f\u0099sÜÚn¬!(Û@ô\u0082Ñ,ÉÖÎ#¿í§b\u0089\u0006\u0005±÷Ò\u0096V65\ncÀ%¡µ\u0099FC¬\u0000¤Æ(\u009eB #\u0095iÿ\u0007ÎûrîÚT\u0014.ì[Cü|~ÍD¤ùð\nò]WåÐP` ó\u0095\"\u0016ä\u00134\u0007\u0013?ý´&´¶ÿ\u0005Ý\u0015\u0086j¬Qi¾KKØâ®÷6 ©¶öiPª¾©©\u0086;ýæÉg\u000er´?\u0002Rÿ\u0096?¶(QÕ\u009f£4w )\u0012Ã %\"\u0088Æ\u0094³ù\u0004a\"Ô\u0081üE¹Òå]ÞD\u0005²§¬\fx2! $\u0019\u0012N?~¶\u0014n<\u0088Ü9\u0081>Ö\u0097Æ8HÔh\r\u00877\u0082 \u0091cf\u009fz ï\u001e\u008bA\u001c\bîòNc¾\u001eÎ`Ò|ôÄa\t\u0018~ÛÃ¥¡M\u0007½\u008e<\u0086(¦û~\u001a\u008b¼Ii\u0092¼Þ\u0003\u0084FÉÆ\u0010\u0084©f^f¯\u008e\u0010L\u008bt\u0016¶d?\t\u0002P¡#Wµ\u0095 \u0089ü2_\u009e\u0004ØÑ\u008eZÉ=È/\u0016ê{öÿ\u009bZ½\u0000ø78]/\u008e\\ÐÉ"
         .length();
      char var3 = ' ';
      int var29 = -1;

      label27:
      while (true) {
         String var30 = var4.substring(++var29, var29 + var3);
         byte var35 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var30.getBytes("ISO-8859-1"));
            String var40 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var35) {
               case 0:
                  var7[var5++] = var40;
                  if ((var29 += var3) >= var6) {
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[26];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new PolinexChams();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new DepthStencilState(
                        CompareOp.LESS_THAN_OR_EQUAL, true, 1.0F, -1.0E7F
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           "chams/entity_translucent",
                           var21,
                           PolinexChams::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
                        );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           "chams/entity_cutout", var21, PolinexChams::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII
                        );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           "chams/entity_cutout_no_cull",
                           var21,
                           PolinexChams::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl
                        );
                     BiFunction var32 = Util.memoize(PolinexChams::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
                     Intrinsics.checkNotNullExpressionValue(var32, "memoize(...)");
                     ENTITY_TRANSLUCENT = var32;
                     Function var33 = Util.memoize(PolinexChams::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
                     Intrinsics.checkNotNullExpressionValue(var33, "memoize(...)");
                     ENTITY_CUTOUT = var33;
                     BiFunction var34 = Util.memoize(PolinexChams::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI);
                     Intrinsics.checkNotNullExpressionValue(var34, "memoize(...)");
                     ENTITY_CUTOUT_NO_CULL = var34;
                     return;
                  }

                  var3 = var4.charAt(var29);
                  break;
               default:
                  var7[var5++] = var40;
                  if ((var29 += var3) < var6) {
                     var3 = var4.charAt(var29);
                     continue label27;
                  }

                  var4 = "\u00adÉ\u0084Ã\u0012ûb\u0018Ã¥s\u0092\u0001u \bõ¦\u0016+T\u0013\u0004T\u001c\u0086À\n\u00042jL0\u0090ÌBûèhj0\u0089o^\u0003}\u0085-\u0004é\u0093/`\u0012\u007fr=×\u009fYÿ\u007f\u0095Ç\u0082\u000f\u0094iW±ØÏÜî»jºaÄÕ±ë³âJ¨Á\u0093ÿ";
                  var6 = "\u00adÉ\u0084Ã\u0012ûb\u0018Ã¥s\u0092\u0001u \bõ¦\u0016+T\u0013\u0004T\u001c\u0086À\n\u00042jL0\u0090ÌBûèhj0\u0089o^\u0003}\u0085-\u0004é\u0093/`\u0012\u007fr=×\u009fYÿ\u007f\u0095Ç\u0082\u000f\u0094iW±ØÏÜî»jºaÄÕ±ë³âJ¨Á\u0093ÿ"
                     .length();
                  var3 = '(';
                  var29 = -1;
            }

            var30 = var4.substring(++var29, var29 + var3);
            var35 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4292;
      if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/chams/PolinexChams", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5];
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
         throw new RuntimeException("me/octo/client/render/chams/PolinexChams" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
