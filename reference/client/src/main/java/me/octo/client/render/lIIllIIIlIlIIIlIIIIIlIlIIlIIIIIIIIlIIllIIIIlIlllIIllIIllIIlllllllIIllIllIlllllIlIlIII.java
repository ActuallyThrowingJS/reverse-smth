package me.octo.client.render;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.ScissorState;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.renderer.texture.AbstractTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   private static Vector4f IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Vector3f lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Matrix4f IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Supplier<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 1868449030659L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderPass param0, long param1, @NotNull Map param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderPass param0, @NotNull String param1, @Nullable AbstractTexture param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull RenderPass var2, @NotNull String var3
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(28848, 4920913485724049172L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(25339, 6168954657841302874L ^ var0)
      );
      boolean var4 = false;
      var2.bindTexture(var3, null, null);
   }

   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull RenderPass var0, long var1, @NotNull Map var3
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2735118408736887404L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842354861475006664L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(246, 1217222540371618026L ^ var1)
      );
      boolean var5 = false;
      String var4 = var10000;
      boolean var7 = false;

      for (Entry var9 : var3.entrySet()) {
         if (var4 == null) {
            boolean var11 = false;
            var0.setUniform((String)var9.getKey(), (GpuBufferSlice)var9.getValue());
            if (var4 == null) {
               continue;
            }
         }
         break;
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderPass var0, int var1, int var2, char var3
   ) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842368632746724140L ^ var4)
      );
      boolean var6 = false;
      RenderSystem.bindDefaultUniforms(var0);
   }

   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull RenderPass var0, long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         9097132262337710497L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842399202248174845L ^ var1)
      );
      String var3 = var10000;
      boolean var4 = false;

      try {
         label31: {
            if (var3 == null) {
               var9 = RenderSystem.getProjectionMatrixBuffer();
               if (var9 != null) {
                  break label31;
               }
            }

            return;
         }
      } catch (MatchException var7) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var7, 9027366246332833572L, var1
         );
      }

      GpuBufferSlice var5 = var9;
      boolean var6 = false;
      var0.setUniform(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18483, 7757499510571992094L ^ var1), var5);
   }

   public static final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0, @NotNull RenderPass var2) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         839593140500167736L, var0
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842306736907114852L ^ var0)
      );
      String var3 = var10000;
      boolean var4 = false;

      try {
         label31: {
            if (var3 == null) {
               var9 = RenderSystem.getShaderFog();
               if (var9 != null) {
                  break label31;
               }
            }

            return;
         }
      } catch (MatchException var7) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var7, 639214136780810941L, var0
         );
      }

      GpuBufferSlice var5 = var9;
      boolean var6 = false;
      var2.setUniform(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(11914, 1333797672531695400L ^ var0), var5);
   }

   public static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, @NotNull RenderPass var2) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5451647795807632439L, var0
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842300870334473877L ^ var0)
      );
      String var3 = var10000;
      boolean var4 = false;

      try {
         label31: {
            if (var3 == null) {
               var9 = RenderSystem.getGlobalSettingsUniform();
               if (var9 != null) {
                  break label31;
               }
            }

            return;
         }
      } catch (MatchException var7) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var7, -5246694205513804468L, var0
         );
      }

      GpuBuffer var5 = var9;
      boolean var6 = false;
      var2.setUniform(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(25745, 8536774543033000667L ^ var0), var5);
   }

   public static final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      char var0, char var1, @NotNull RenderPass var2, int var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -9072009736401029753L, var4
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842402039703523547L ^ var4)
      );
      String var6 = var10000;
      boolean var7 = false;

      try {
         label31: {
            if (var6 == null) {
               var11 = RenderSystem.getShaderLights();
               if (var11 != null) {
                  break label31;
               }
            }

            return;
         }
      } catch (MatchException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -9123840496957267198L, var4
         );
      }

      GpuBufferSlice var8 = var11;
      boolean var9 = false;
      var2.setUniform(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(16861, 4562082503254274515L ^ var4), var8);
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0, @NotNull RenderPass var1, @NotNull GpuBufferSlice var2, int var3, char var4
   ) {
      long var5 = ((long)var0 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842400204602230548L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(9499, 1924406660060021447L ^ var5)
      );
      boolean var7 = false;
      var1.setUniform(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(13881, 4760515201929777636L ^ var5), var2);
   }

   public static final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var0, @NotNull RenderPass var2) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842381209168686280L ^ var0)
      );
      boolean var3 = false;
      ScissorState var10000 = RenderSystem.getScissorStateForRenderTypeDraws();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(20786, 4976538765883809080L ^ var0)
      );
      ScissorState var4 = var10000;

      try {
         if (var4.enabled()) {
            var2.enableScissor(var4.x(), var4.y(), var4.width(), var4.height());
         }
      } catch (MatchException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, -183886608944554223L, var0
         );
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderPass var0,
      long var1,
      @NotNull GpuBufferSlice var3,
      @NotNull GpuBufferSlice var4,
      @NotNull VertexFormat var5,
      @NotNull IndexType var6,
      int var7
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842311767461214814L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(1970, 2595561191095229757L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(5318, 6909373478330879570L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(1593, 2401650316246310057L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(30184, 81111864752385903L ^ var1)
      );
      var0.setVertexBuffer(0, var3.buffer());
      var0.setIndexBuffer(var4.buffer(), var6);
      var0.drawIndexed((int)(var3.offset() / var5.getVertexSize()), (int)(var4.offset() / var6.bytes), var7, 1);
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param0,
      int param1,
      @Nullable Matrix4fc param2,
      short param3,
      @NotNull me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderTarget param0,
      @NotNull Supplier param1,
      @NotNull OptionalInt param2,
      @NotNull OptionalDouble param3,
      long param4,
      boolean param6,
      boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull GpuTextureView var2, @NotNull Supplier var3, @NotNull OptionalInt var4, boolean var5
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var6 = var0 ^ 68849911062935L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8511014795372495236L, var0
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842316219199249184L ^ var0)
      );
      String var8 = var10000;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987314378921505505L ^ var0)
      );
      var10000 = var8;
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(7316, 2927708344874051436L ^ var0)
      );

      label45: {
         label44: {
            label49: {
               try {
                  if (var10000 != null) {
                     break label44;
                  }

                  var23 = RenderSystem.outputColorTextureOverride;
                  if (RenderSystem.outputColorTextureOverride == null) {
                     break label49;
                  }
               } catch (MatchException var18) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var18, -8459192219954452231L, var0
                  );
               }

               GpuTextureView var12 = var23;
               boolean var14 = false;

               label36: {
                  try {
                     if (var5) {
                        var24 = var12;
                        break label36;
                     }
                  } catch (MatchException var17) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var17, -8459192219954452231L, var0
                     );
                  }

                  var24 = null;
               }

               try {
                  if (var24 != null) {
                     break label45;
                  }
               } catch (MatchException var16) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var16, -8459192219954452231L, var0
                  );
               }
            }

            try {
               ;
            } catch (MatchException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, -8459192219954452231L, var0
               );
            }
         }

         var24 = var2;
      }

      GpuTextureView var10 = var24;
      Object var20 = null;
      OptionalDouble var25 = OptionalDouble.empty();
      Intrinsics.checkNotNullExpressionValue(
         var25, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(17994, 3869754522978975164L ^ var0)
      );
      OptionalDouble var13 = var25;
      boolean var21 = false;
      RenderPass var26 = me.octo.client.render.util.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6
         )
         .createCommandEncoder()
         .createRenderPass(var3, var10, var4, (GpuTextureView)var20, var13);
      Intrinsics.checkNotNullExpressionValue(
         var26, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(17820, 7417361157374115441L ^ var0)
      );
      return var26;
   }

   private static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Supplier var0, int var1, int var2, char var3, GpuTextureView var4, OptionalInt var5, GpuTextureView var6, OptionalDouble var7
   ) {
      long var8 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var10 = var8 ^ 85379531144126L;
      boolean var12 = false;
      RenderPass var10000 = me.octo.client.render.util.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var10
         )
         .createCommandEncoder()
         .createRenderPass(var0, var4, var5, var6, var7);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18296, 5662665650458322594L ^ var8)
      );
      return var10000;
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable Matrix4fc var0, long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var10001 = var1 ^ 135923741854757L;
      int var3 = (int)((var1 ^ 135923741854757L) >>> 32);
      int var4 = (int)((var1 ^ 135923741854757L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, (char)var4, var0, null, 2, var5, null);
   }

   @JvmOverloads
   @NotNull
   public static final GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var10001 = var0 ^ 51219607531821L;
      int var2 = (int)((var0 ^ 51219607531821L) >>> 32);
      int var3 = (int)((var0 ^ 51219607531821L) << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, (char)var3, null, null, 3, var4, null);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderTarget var0, @NotNull Supplier var1, char var2, @NotNull OptionalInt var3, long var4, @NotNull OptionalDouble var6, boolean var7
   ) {
      long var8 = ((long)var2 << 48 | var4 << 16 >>> 16) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var10 = (int)((var8 ^ 2301797912044L) >>> 48);
      long var11 = (var8 ^ 2301797912044L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842429555511445894L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987429946605396039L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(7316, 2927663177576822218L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24869, 6989359983482554488L ^ var8)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, var3, var6, (char)var10, var11, var7, false, 16, null
      );
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderTarget var0, @NotNull Supplier var1, long var2, char var4, @NotNull OptionalInt var5, @NotNull OptionalDouble var6
   ) {
      long var7 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      int var9 = (int)((var7 ^ 91763374601895L) >>> 48);
      long var10 = (var7 ^ 91763374601895L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842342837663871693L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987376489118767884L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(7316, 2927752369795321473L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24869, 6989411511840977715L ^ var7)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, var5, var6, (char)var9, var10, false, false, 24, null
      );
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderTarget var0, @NotNull Supplier var1, @NotNull OptionalInt var2, long var3
   ) {
      var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var3;
      int var5 = (int)((var3 ^ 56281940503196L) >>> 48);
      long var6 = (var3 ^ 56281940503196L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842377759343128310L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987411386906019639L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(7316, 2927646529281839802L ^ var3)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, var2, null, (char)var5, var6, false, false, 28, null
      );
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull RenderTarget var0, @NotNull Supplier var1, long var2
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      int var4 = (int)((var2 ^ 58046942610950L) >>> 48);
      long var5 = (var2 ^ 58046942610950L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842378613805875820L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(26063, 397297454474889060L ^ var2)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, null, null, (char)var4, var5, false, false, 30, null
      );
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull RenderTarget var0, long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      int var3 = (int)((var1 ^ 110699575087933L) >>> 48);
      long var4 = (var1 ^ 110699575087933L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842325404081297239L ^ var1)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, null, null, null, (char)var3, var4, false, false, 31, null
      );
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull GpuTextureView var2, @NotNull Supplier var3, @NotNull OptionalInt var4
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var5 = var0 ^ 98609534320931L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842323120605662030L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987325687100547727L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(5117, 3557496188104177779L ^ var0)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var3, var4, false, 4, var5, null);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GpuTextureView var0, char var1, char var2, @NotNull Supplier var3, int var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var7 = var5 ^ 75678960530910L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842299666029117363L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(18698, 4987339882205795954L ^ var5)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var3, null, false, 6, var7, null);
   }

   @JvmOverloads
   @NotNull
   public static final RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull GpuTextureView var0, long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var3 = var1 ^ 73297003832591L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24783, 5842297820675256162L ^ var1)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, null, null, false, 7, var3, null);
   }

   private static final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(2189, 6380347373325572576L ^ var0);
   }

   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 37800322472079L;
      long var11 = var9 ^ 49962020207166L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[31];
      int var5 = 0;
      String var4 = "\u007fÔ\u0019\u001aúS!rê\u009c\u009f£vY\u00ad\u0091Ùì$1\u0093\u000eÚ\u0090tx·8\u001a%ækÄ\u001d\u0082\u0013\u0017QzB\u001dÏ\u0087ÐN\u0006`uZø¦ñõ6A\u0098¾A#\u0080D·£°\u0018ó\u0002\u0090el\u00ad_ÚÁ\u0007b÷Õ(9\u0011ÞÈ\u001e\u0004\u001cÁN»\u0018\r gá\u0088äÊÆ`\bÄ\u0007Üã\u009f\u0087\u0081Ý÷V\u0081\u0006\u0003\u0083\u0010|\u0013Pë\u000f\u008cÇÉÎ\u0085FQ(JRN\u0010/Ç¦pû÷\u0089YØ_0iî¸Õ© »0jBgé{Ü\u008aUu\u0018\u0085\u001f\u001dú<\u0013)\u009d@V\u001cÉ\u0003ö\u0010\u008cÖ\"\u0083_\u0010í\u0012*ä\u0011§z }¿whâH4µ(«8\t \u009c\u0002R\u009dêµò 5ærBXÅõö\u0012ä÷:+6\\ýpêµDo@À&\u008e\u0099\u0011\u0007 ë/ û<%Á\u0083;Ô\u00adµv\u0018VMünyí \u008c\u0013\u0083v\u009cfò\u000b^~\u0000 Éo¢Ø\u001c\u0014\u0083$MsïÉ§þ+\u007f\u0087óB\u0000¤\u0001³Ìzb$à½G1\u001a \u0005\u008bÌG\u0002Ýþ\"ìBz5fgK4íÕ\u0011_§\u0098¬Z\u009eÖbnÏ!Ím(}Þ:@\u009c\u0092\u0001)\u0095p\u0093ÿ\u0014E=ß\u0002ä®Ë7\u0081\"\u0098yó\u0083[ÐM!]\u0003MÐ\u0095\u0096ò¹² \u0099ò|îø!%)&ËMÿ^Á\u0004M\f0%ò8\u0082\u0001&£\"Àºvë{f\u0010zë\u009dì¤8\u0016¥Ûü\u009d++[rp ÐÆÉ\u001a\u001b\t5y\u009f\u001b\u0082òåé»\u0011 \u0083S¾×ý$´7«*8\t\u001bÞR(XÝÝB\u0012\u008f\u001côÃ1\fý\u0090¡É\u0090\u008f¿AFó)*\\\u0081\u008dcPh1BGo\u0002\u0092Ö\u0085BQÌ(\u0013\u0092C\u0000}`³'â¢ÿF½JUE\u000eì-õ¾÷SNgM\u009fÚ\u0018\u0000È<1föÉD\u0016>t(A\tpF\u009aðè¯[?\u009d\u009fz\u0017ë©\u000e\u009bu@\u0000öB ¡dpzp;¯:ó¶\u0006wã Rí j¦`àKW\u001dï\u0089Q°é\u0082²ë\u0097zp\u008aÀ¬H¬\u0092\u0018Q\u0087$xK®ì ²Çn\u0019\u0012òrçÔðå²{O.ÂPP')å[R\u00154ðêª\u007f\u0089«/ -\u0083år£ïKGo\u0088í#\u0003RçUÖ©\u0016,\u0084\u0004\u0002ï\u0092ý\u001b\u00adÅå6J 4ë\u001fþ\u0018\u0084\u001dV\u0016Õt\u0001Á¬WìOå\u009aË¢t\bº\u0010\u0011\u009a\u0001£\u00ad\"\u0003 óv\u0092H\u0083n\u0093\u000e£ì\u0003\u009d÷\u0094Ã\n\u0090Åê}Ä\u0082½Dªú\u00ad½\u009e0¥ \u0018ûÞ\u001f\u0092qªø*zùâ\u008c3Þ$\bfcÿâ\u000b\u0081ãB\u0018¿ê;i\u000fçæ&`V þX\u0019\u009dA¥<\u0087¾\u009cIµö\u0018£(Õð¼c\u009f\u0002·¯+\"\u0086Ð7\u000b£uJ\u0099\u009c\u009eIs M\u0000\u0083\u0005\u008cÓ\u00938\u008f\u0085Á1Ybõ!8 k&7¾þ\u009c=ù\u009eUb1ïE ©u{??\u0098ÔQb|\u0096¾\\\nìâû©hU\"9Â¾Dq\u0082si.Ö6(\\\u0004ô\u008b\u0010BK#,n\u009a\t\u001d\u009e²I¿\u000e¯8,dw{\u0086µu{®\r\u0004tUÞZ]\u0093É¬\u0013";
      int var6 = "\u007fÔ\u0019\u001aúS!rê\u009c\u009f£vY\u00ad\u0091Ùì$1\u0093\u000eÚ\u0090tx·8\u001a%ækÄ\u001d\u0082\u0013\u0017QzB\u001dÏ\u0087ÐN\u0006`uZø¦ñõ6A\u0098¾A#\u0080D·£°\u0018ó\u0002\u0090el\u00ad_ÚÁ\u0007b÷Õ(9\u0011ÞÈ\u001e\u0004\u001cÁN»\u0018\r gá\u0088äÊÆ`\bÄ\u0007Üã\u009f\u0087\u0081Ý÷V\u0081\u0006\u0003\u0083\u0010|\u0013Pë\u000f\u008cÇÉÎ\u0085FQ(JRN\u0010/Ç¦pû÷\u0089YØ_0iî¸Õ© »0jBgé{Ü\u008aUu\u0018\u0085\u001f\u001dú<\u0013)\u009d@V\u001cÉ\u0003ö\u0010\u008cÖ\"\u0083_\u0010í\u0012*ä\u0011§z }¿whâH4µ(«8\t \u009c\u0002R\u009dêµò 5ærBXÅõö\u0012ä÷:+6\\ýpêµDo@À&\u008e\u0099\u0011\u0007 ë/ û<%Á\u0083;Ô\u00adµv\u0018VMünyí \u008c\u0013\u0083v\u009cfò\u000b^~\u0000 Éo¢Ø\u001c\u0014\u0083$MsïÉ§þ+\u007f\u0087óB\u0000¤\u0001³Ìzb$à½G1\u001a \u0005\u008bÌG\u0002Ýþ\"ìBz5fgK4íÕ\u0011_§\u0098¬Z\u009eÖbnÏ!Ím(}Þ:@\u009c\u0092\u0001)\u0095p\u0093ÿ\u0014E=ß\u0002ä®Ë7\u0081\"\u0098yó\u0083[ÐM!]\u0003MÐ\u0095\u0096ò¹² \u0099ò|îø!%)&ËMÿ^Á\u0004M\f0%ò8\u0082\u0001&£\"Àºvë{f\u0010zë\u009dì¤8\u0016¥Ûü\u009d++[rp ÐÆÉ\u001a\u001b\t5y\u009f\u001b\u0082òåé»\u0011 \u0083S¾×ý$´7«*8\t\u001bÞR(XÝÝB\u0012\u008f\u001côÃ1\fý\u0090¡É\u0090\u008f¿AFó)*\\\u0081\u008dcPh1BGo\u0002\u0092Ö\u0085BQÌ(\u0013\u0092C\u0000}`³'â¢ÿF½JUE\u000eì-õ¾÷SNgM\u009fÚ\u0018\u0000È<1föÉD\u0016>t(A\tpF\u009aðè¯[?\u009d\u009fz\u0017ë©\u000e\u009bu@\u0000öB ¡dpzp;¯:ó¶\u0006wã Rí j¦`àKW\u001dï\u0089Q°é\u0082²ë\u0097zp\u008aÀ¬H¬\u0092\u0018Q\u0087$xK®ì ²Çn\u0019\u0012òrçÔðå²{O.ÂPP')å[R\u00154ðêª\u007f\u0089«/ -\u0083år£ïKGo\u0088í#\u0003RçUÖ©\u0016,\u0084\u0004\u0002ï\u0092ý\u001b\u00adÅå6J 4ë\u001fþ\u0018\u0084\u001dV\u0016Õt\u0001Á¬WìOå\u009aË¢t\bº\u0010\u0011\u009a\u0001£\u00ad\"\u0003 óv\u0092H\u0083n\u0093\u000e£ì\u0003\u009d÷\u0094Ã\n\u0090Åê}Ä\u0082½Dªú\u00ad½\u009e0¥ \u0018ûÞ\u001f\u0092qªø*zùâ\u008c3Þ$\bfcÿâ\u000b\u0081ãB\u0018¿ê;i\u000fçæ&`V þX\u0019\u009dA¥<\u0087¾\u009cIµö\u0018£(Õð¼c\u009f\u0002·¯+\"\u0086Ð7\u000b£uJ\u0099\u009c\u009eIs M\u0000\u0083\u0005\u008cÓ\u00938\u008f\u0085Á1Ybõ!8 k&7¾þ\u009c=ù\u009eUb1ïE ©u{??\u0098ÔQb|\u0096¾\\\nìâû©hU\"9Â¾Dq\u0082si.Ö6(\\\u0004ô\u008b\u0010BK#,n\u009a\t\u001d\u009e²I¿\u000e¯8,dw{\u0086µu{®\r\u0004tUÞZ]\u0093É¬\u0013"
         .length();
      char var3 = '@';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var23;
         if ((var2 += var3) >= var6) {
            var4 = "¡\u0001\u001c·\u0004¹\u008e«ûº\u000b\u0098nQ\u0089\u0015\u0010º8ùý\u0004\u009cv\u009f\u0094\f\u001bfªN¸!";
            var6 = "¡\u0001\u001c·\u0004¹\u008e«ûº\u000b\u0098nQ\u0089\u0015\u0010º8ùý\u0004\u009cv\u009f\u0094\f\u001bfªN¸!".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var7[var5++] = var25;
               if ((var2 += var3) >= var6) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[31];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new Vector4f(1.0F);
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Vector3f();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Matrix4f();
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI;
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13260;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/render/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static RenderPass IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$de55ce072a4c1e34(
      RenderTarget var0, Supplier var1, OptionalInt var2, OptionalDouble var3, char var4, long var5, boolean var7, boolean var8, int var9, Object var10
   ) {
      var5 = 136677971416932L;
      long var11 = ((long)var4 << 48 | var5 << 16 >>> 16) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var13 = var11 ^ 32852939920239L;
      String var15 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -816374620172057803L, var11
      );

      int var10000;
      label80: {
         int var16;
         label79: {
            label78: {
               try {
                  var16 = var9;
                  if (var15 != null) {
                     break label79;
                  }

                  if ((var9 & 1) == 0) {
                     break label78;
                  }
               } catch (MatchException var23) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var23, -588982239553415760L, var11
                  );
               }

               var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            }

            try {
               var10000 = var9 & 2;
               break label80;
            } catch (MatchException var20) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var20, -588982239553415760L, var11
               );
            }
         }

         var10000 = var16;
      }

      if (var10000 != 0) {
         OptionalInt var25 = OptionalInt.empty();
         Intrinsics.checkNotNullExpressionValue(
            var25, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(4002, 3141271929020958984L ^ var11)
         );
         var2 = var25;
      }

      label68: {
         int var17;
         label84: {
            byte var10001;
            try {
               var17 = var9;
               if (var15 != null) {
                  break label84;
               }

               var10000 = var9;
               var10001 = 4;
            } catch (MatchException var22) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var22, -588982239553415760L, var11
               );
            }

            if ((var10000 & var10001) != 0) {
               OptionalDouble var27 = OptionalDouble.empty();
               Intrinsics.checkNotNullExpressionValue(
                  var27, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(4002, 3141271929020958984L ^ var11)
               );
               var3 = var27;
            }

            try {
               var10000 = var9 & 8;
               break label68;
            } catch (MatchException var19) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var19, -588982239553415760L, var11
               );
            }
         }

         var10000 = var17;
      }

      if (var10000 != 0) {
         var7 = true;
      }

      label58: {
         int var18;
         label85: {
            try {
               var18 = var9;
               if (var15 != null) {
                  break label85;
               }

               var10000 = var9 & 16;
            } catch (MatchException var21) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var21, -588982239553415760L, var11
               );
            }

            if (var10000 == 0) {
               return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var2, var3, var13, var7, (boolean)var8);
            }

            var10000 = 0;
            break label58;
         }

         var10000 = var18;
      }

      var8 = var10000;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var2, var3, var13, var7, (boolean)var8);
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$610375de479a2e21(
      @NotNull RenderPass argument1Arg,
      long argument2Arg,
      @NotNull GpuBufferSlice vertexSliceArg,
      @NotNull GpuBufferSlice indexSliceArg,
      @NotNull VertexFormat vertexFormatArg,
      @NotNull IndexType indexTypeArg,
      int argument7Arg
   ) {
      argument2Arg = 11866509593427L;
      argument2Arg = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ argument2Arg;
      Intrinsics.checkNotNullParameter(argument1Arg, "<this>");
      Intrinsics.checkNotNullParameter(vertexSliceArg, "vertexSlice");
      Intrinsics.checkNotNullParameter(indexSliceArg, "indexSlice");
      Intrinsics.checkNotNullParameter(vertexFormatArg, "vertexFormat");
      Intrinsics.checkNotNullParameter(indexTypeArg, "indexType");
      argument1Arg.setVertexBuffer(0, vertexSliceArg.buffer());
      argument1Arg.setIndexBuffer(indexSliceArg.buffer(), indexTypeArg);
      argument1Arg.drawIndexed(
         (int)(vertexSliceArg.offset() / vertexFormatArg.getVertexSize()), (int)(indexSliceArg.offset() / indexTypeArg.bytes), argument7Arg, 1
      );
   }
}
