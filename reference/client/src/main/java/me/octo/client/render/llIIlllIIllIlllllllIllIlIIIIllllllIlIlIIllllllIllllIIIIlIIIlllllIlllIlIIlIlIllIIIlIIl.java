package me.octo.client.render;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.ColorTargetState;
import com.mojang.blaze3d.pipeline.DepthStencilState;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.Mode;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.Polinex;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Object2ObjectOpenHashMap<Identifier, RenderPipeline> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static RenderPipeline IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @JvmField
   @NotNull
   public static RenderPipeline lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @JvmField
   @NotNull
   public static RenderPipeline IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @JvmField
   @NotNull
   public static RenderPipeline IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @JvmField
   @NotNull
   public static RenderPipeline lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @JvmField
   @NotNull
   public static RenderPipeline IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @JvmField
   @NotNull
   public static RenderPipeline llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static RenderPipeline lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static RenderPipeline lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static RenderPipeline lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static RenderPipeline lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static RenderPipeline IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static RenderPipeline llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static RenderPipeline IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @JvmField
   @NotNull
   public static RenderPipeline IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @JvmField
   @NotNull
   public static RenderPipeline IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @JvmField
   @NotNull
   public static RenderPipeline IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @JvmField
   @NotNull
   public static RenderPipeline llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @JvmField
   @NotNull
   public static RenderPipeline lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @JvmField
   @NotNull
   public static RenderPipeline llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @JvmField
   @NotNull
   public static RenderPipeline lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @JvmField
   @NotNull
   public static RenderPipeline IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @JvmField
   @NotNull
   public static RenderPipeline IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   @JvmField
   @NotNull
   public static RenderPipeline IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @JvmField
   @NotNull
   public static RenderPipeline llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @JvmField
   @NotNull
   public static RenderPipeline lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @JvmField
   @NotNull
   public static RenderPipeline IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @JvmField
   @NotNull
   public static RenderPipeline lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @JvmField
   @NotNull
   public static RenderPipeline lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   @JvmField
   @NotNull
   public static RenderPipeline IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static long IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = 27416056782796L;
   private static String[] IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static String[] IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private static Map IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new HashMap(13);

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   @NotNull
   public final RenderPipeline IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, long var2, @NotNull Function1 var4
   ) {
      var2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var2;
      long var5 = var2 ^ 129630955210595L;
      long var7 = var2 ^ 122539888006454L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17011, 7987257117286943822L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(7835, 2127085909209419960L ^ var2)
      );
      Identifier var9 = Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(18281, 490476085552761185L ^ var2) + var1, var5
         );
      Builder var10 = IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var7
         )
         .withLocation(var9);
      var4.invoke(var10);
      RenderPipeline var16 = var10.build();
      boolean var12 = false;
      if ((RenderPipeline)lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var9, var16) != null) {
         boolean var14 = false;
         throw new IllegalStateException(
            (IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(15634, 4007249211072361260L ^ var2) + var9).toString()
         );
      } else {
         Intrinsics.checkNotNullExpressionValue(
            var16, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(2236, 9206326988848170672L ^ var2)
         );
         return var16;
      }
   }

   @NotNull
   public final Builder IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Builder var1, long var2, @NotNull IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4
   ) {
      var2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(446, 5524543125007743907L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(18966, 5840381766783496196L ^ var2)
      );
      boolean var5 = false;
      Builder var10000 = var1.withUniform(
         var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER
      );
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974892875718908432L ^ var2)
      );
      return var10000;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, Builder param2, int param3, int param4, boolean param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Builder IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Builder var1, long var2) {
      var2 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(14338, 5703918673699770362L ^ var2)
      );
      boolean var4 = false;
      boolean var7 = false;
      var1.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166299609286503353L ^ var2));
      var1.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      return var1;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Builder var1, Mode var2, long var3) {
      var3 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var3;
      long var10001 = var3 ^ 28486950013558L;
      int var5 = (int)((var3 ^ 28486950013558L) >>> 32);
      int var6 = (int)((var3 ^ 28486950013558L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Snippet var10 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455172963891500718L ^ var3)
      );
      Snippet var8 = var10;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var1, var5, var8, (char)var6, (short)var7
      );
      var1.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var2);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Builder var1, Mode var2) {
      boolean var3 = false;
      var1.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var1.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var1.withVertexFormat(DefaultVertexFormat.POSITION, var2);
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Builder var1, Mode var2, long var3) {
      var3 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var3;
      boolean var5 = false;
      var1.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var1.withFragmentShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21634, 8990239752686012243L ^ var3));
      var1.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var2);
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var0) {
      try {
         if (var0) {
            return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         }
      } catch (IllegalStateException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var0) {
      try {
         if (var0) {
            return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         }
      } catch (IllegalStateException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @JvmStatic
   @NotNull
   public static final RenderPipeline IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var0) {
      try {
         if (var0) {
            return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
         }
      } catch (IllegalStateException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var1;
      long var3 = var1 ^ 101257960892304L;
      Object2ObjectOpenHashMap var6 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var7 = false;
      ObjectIterator var10000 = var6.object2ObjectEntrySet().fastIterator();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8304, 1003896297574510062L ^ var1)
      );
      Iterator var15 = (Iterator)var10000;
      String var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5757200846044379259L, var1
      );
      var7 = false;
      Iterator var8 = var15;

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            String var17 = var5;
            Entry var10 = (Entry)var9;
            boolean var11 = false;
            RenderPipeline var12 = (RenderPipeline)var10.getValue();

            try {
               me.octo.client.render.util.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     var3
                  )
                  .precompilePipeline(var12, ClientShaders.Companion);
               if (var17 != null) {
                  break;
               }

               if (var5 == null) {
                  continue;
               }
            } catch (IllegalStateException var13) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var13, 5591553894839885450L, var1
               );
            }
         }

         PolinexLogger.info(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24929, 5359237391701568708L ^ var1)
               + lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size()
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24233, 2297554530572849925L ^ var1)
         );
         break;
      }
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 76096625007446L;
      int var3 = (int)((var0 ^ 76096625007446L) >>> 32);
      int var4 = (int)((var0 ^ 76096625007446L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 135227132020848L) >>> 32);
      int var7 = (int)((var0 ^ 135227132020848L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954799817255717889L ^ var0)
      );
      Snippet var14 = RenderPipelines.LINES_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.LINES_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(6758, 7053456700037317222L ^ var0)
      );
      Snippet var8 = var14;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      var2.withDepthStencilState(new DepthStencilState(CompareOp.LESS_THAN_OR_EQUAL, false));
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var11 = true;
      boolean var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 80418752769193L) >>> 32);
      int var4 = (int)((var0 ^ 80418752769193L) << 32 >>> 32);
      long var5 = var0 ^ 131858592262709L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954783003161700568L ^ var0)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, Mode.DEBUG_LINES, var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var9 = true;
      boolean var10 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 118431348416835L) >>> 32);
      int var4 = (int)((var0 ^ 118431348416835L) << 32 >>> 32);
      long var5 = var0 ^ 93979149314015L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954816621997352242L ^ var0)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, Mode.DEBUG_LINE_STRIP, var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var9 = true;
      boolean var10 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, char var1, char var2, Builder var3) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 64346597803186L) >>> 32);
      int var7 = (int)((var4 ^ 64346597803186L) << 32 >>> 32);
      long var8 = var4 ^ 4718418362926L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954729823361777859L ^ var4)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, Mode.TRIANGLES, var8
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var12 = true;
      boolean var13 = false;
      var3.withCull(false);
      var3.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, int var1, short var2, Builder var3) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 94331647376858L) >>> 32);
      int var7 = (int)((var4 ^ 94331647376858L) << 32 >>> 32);
      long var8 = var4 ^ 117665056783174L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954761393245829547L ^ var4)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, Mode.QUADS, var8
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var10 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var12 = true;
      boolean var13 = false;
      var3.withCull(false);
      var3.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var0, char var2, Builder var3) {
      long var4 = (var0 << 16 | (long)var2 << 48 >>> 48) ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 76274515461603L) >>> 32);
      int var7 = (int)((var4 ^ 76274515461603L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954778522568606098L ^ var4)
      );
      var3.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll
      );
      var3.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      var3.withCull(false);
      var3.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 116535732544088L) >>> 32);
      int var4 = (int)((var0 ^ 116535732544088L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954818509173990953L ^ var0)
      );
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION_TEX_COLOR, Mode.QUADS);
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var3 = var0 ^ 138025250901705L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954771887962524708L ^ var0)
      );
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, Mode.QUADS, var3
      );
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(new DepthStencilState(CompareOp.LESS_THAN_OR_EQUAL, true, 1.0F, -1.0E7F));
      return Unit.INSTANCE;
   }

   private static final Unit IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 31562724956252L;
      int var3 = (int)((var0 ^ 31562724956252L) >>> 32);
      int var4 = (int)((var0 ^ 31562724956252L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 39017100086138L) >>> 32);
      int var7 = (int)((var0 ^ 39017100086138L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(31201, 7309895841444012764L ^ var0)
      );
      Snippet var20 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19034, 457158511186481474L ^ var0)
      );
      Snippet var8 = var20;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var11 = Mode.DEBUG_LINES;
      boolean var12 = false;
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var2.withFragmentShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(14954, 4390518798862311747L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var11);
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      var12 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var16.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19104, 6046345951665230208L ^ var0)
      );
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var17 = true;
      var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 79960710011400L;
      int var3 = (int)((var0 ^ 79960710011400L) >>> 32);
      int var4 = (int)((var0 ^ 79960710011400L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 131331121023278L) >>> 32);
      int var7 = (int)((var0 ^ 131331121023278L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954793783145827679L ^ var0)
      );
      Snippet var20 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455226627780724432L ^ var0)
      );
      Snippet var8 = var20;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var11 = Mode.DEBUG_LINES;
      boolean var12 = false;
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var2.withFragmentShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21634, 8990216662797618646L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var11);
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      var12 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var16.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974887861861857652L ^ var0)
      );
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var17 = true;
      var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 4890663108455L;
      int var3 = (int)((var0 ^ 4890663108455L) >>> 32);
      int var4 = (int)((var0 ^ 4890663108455L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 65670441790529L) >>> 32);
      int var7 = (int)((var0 ^ 65670441790529L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954728611220514864L ^ var0)
      );
      Snippet var20 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455152648420631487L ^ var0)
      );
      Snippet var8 = var20;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var11 = Mode.QUADS;
      boolean var12 = false;
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var2.withFragmentShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21634, 8990282889590630585L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, var11);
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      var12 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var16.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974813945616817179L ^ var0)
      );
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var17 = true;
      var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 119237111861949L;
      int var3 = (int)((var0 ^ 119237111861949L) >>> 32);
      int var4 = (int)((var0 ^ 119237111861949L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 92061161488795L) >>> 32);
      int var7 = (int)((var0 ^ 92061161488795L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954754996370245098L ^ var0)
      );
      Snippet var20 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455266995104271973L ^ var0)
      );
      Snippet var8 = var20;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Mode var11 = Mode.QUADS;
      boolean var12 = false;
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION, var11);
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var16 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      var12 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var16.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974928297904878017L ^ var0)
      );
      var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var17 = true;
      var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 137408115962716L;
      int var3 = (int)((var0 ^ 137408115962716L) >>> 32);
      int var4 = (int)((var0 ^ 137408115962716L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954772066118083595L ^ var0)
      );
      Snippet var13 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455284083499790212L ^ var0)
      );
      Snippet var6 = var13;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      Snippet var14 = RenderPipelines.GLOBALS_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.GLOBALS_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24317, 4537845618301513436L ^ var0)
      );
      var6 = var14;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      boolean var10 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var9.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974910128788213792L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      return Unit.INSTANCE;
   }

   private static final Unit IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 59657534103651L;
      int var3 = (int)((var0 ^ 59657534103651L) >>> 32);
      int var4 = (int)((var0 ^ 59657534103651L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954713283959404340L ^ var0)
      );
      Snippet var13 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455207689903209659L ^ var0)
      );
      Snippet var6 = var13;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      Snippet var14 = RenderPipelines.GLOBALS_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.GLOBALS_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(25973, 1148533262372996718L ^ var0)
      );
      var6 = var14;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var6, (char)var4, (short)var5
      );
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION, Mode.QUADS);
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var9 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.DISTANCE_FADE;
      boolean var10 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var9.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974829272879989535L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      return Unit.INSTANCE;
   }

   private static final Unit IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 99080521456514L;
      int var3 = (int)((var0 ^ 99080521456514L) >>> 32);
      int var4 = (int)((var0 ^ 99080521456514L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 111962787629220L) >>> 32);
      int var7 = (int)((var0 ^ 111962787629220L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954814277421026517L ^ var0)
      );
      Snippet var14 = RenderPipelines.GUI_TEXTURED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.GUI_TEXTURED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(10199, 7480134178111438612L ^ var0)
      );
      Snippet var8 = var14;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION_TEX_COLOR, Mode.QUADS);
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var11 = true;
      boolean var12 = false;
      var2.withCull(false);
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 130917455262368L) >>> 32);
      int var4 = (int)((var0 ^ 130917455262368L) << 32 >>> 32);
      long var5 = var0 ^ 97519625434521L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954794197337241297L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var9 = false;
      boolean var12 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166331946922671766L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(13338, 2883662800082015939L ^ var0));
      var2.withColorTargetState(
         new ColorTargetState(
            me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var5, BlendFunction.ENTITY_OUTLINE_BLIT
            ),
            7
         )
      );
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 52348240095475L) >>> 32);
      int var4 = (int)((var0 ^ 52348240095475L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954750746123365506L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166269843269805253L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(13314, 8333207857662430352L ^ var0));
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 140002269706089L) >>> 32);
      int var4 = (int)((var0 ^ 140002269706089L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954802730525012760L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166322862137293663L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(13314, 8333296129730564874L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974878914493089587L ^ var0)
      );
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 72462341907249L) >>> 32);
      int var4 = (int)((var0 ^ 72462341907249L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954774501359331136L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166390552493010695L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251564195458439050L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(16293, 8253430410074868970L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974908243288167275L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(
      short var0, short var1, int var2, Builder var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 37783909236788L) >>> 32);
      int var7 = (int)((var4 ^ 37783909236788L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954737831124960325L ^ var4)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var10 = false;
      boolean var13 = false;
      var3.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166284407406627842L ^ var4));
      var3.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251667042547725455L ^ var4));
      var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var11 = false;
      Intrinsics.checkNotNullExpressionValue(
         var3.withUniform(var15.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974805275400843374L ^ var4)
      );
      var3.withColorTargetState(ColorTargetState.DEFAULT);
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(int var0, long var1, Builder var3) {
      long var4 = ((long)var0 << 32 | var1 << 32 >>> 32) ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 111661579765800L) >>> 32);
      int var7 = (int)((var4 ^ 111661579765800L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954814458382093401L ^ var4)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var10 = false;
      boolean var13 = false;
      var3.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166351147093296158L ^ var4));
      var3.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251595364990975123L ^ var4));
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(32439, 4527957416049387195L ^ var4));
      var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var11 = false;
      Intrinsics.checkNotNullExpressionValue(
         var3.withUniform(var15.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974868836029347954L ^ var4)
      );
      var3.withColorTargetState(ColorTargetState.DEFAULT);
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 42517796147729L) >>> 32);
      int var4 = (int)((var0 ^ 42517796147729L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954742838759478880L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166279828202806823L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251662275365381802L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(32439, 4528029001168911490L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974801916977373771L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(int var0, int var1, int var2, Builder var3) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 139510386865594L) >>> 32);
      int var7 = (int)((var4 ^ 139510386865594L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954804166747009483L ^ var4)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var10 = false;
      boolean var13 = false;
      var3.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166323504411097484L ^ var4));
      var3.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
      );
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251582873921569025L ^ var4));
      var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var11 = false;
      Intrinsics.checkNotNullExpressionValue(
         var3.withUniform(var15.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974880776722154976L ^ var4)
      );
      var3.withColorTargetState(ColorTargetState.DEFAULT);
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 75821205005740L) >>> 32);
      int var4 = (int)((var0 ^ 75821205005740L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954780058899456477L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166387313992542618L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251558637631852823L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(32439, 4527991454752672575L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974904884710151670L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 59970403666317L) >>> 32);
      int var4 = (int)((var0 ^ 59970403666317L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954725377575620092L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166262105011258811L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251644827070659894L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974819378175883735L ^ var0)
      );
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 106121514624505L) >>> 32);
      int var4 = (int)((var0 ^ 106121514624505L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954811185195590024L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(29489, 8926318114523711118L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(27762, 211152550513744342L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9797, 7078383237557965783L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974874308163802531L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(char var0, int var1, char var2, Builder var3) {
      long var4 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      long var10001 = var4 ^ 92198956728883L;
      int var6 = (int)((var4 ^ 92198956728883L) >>> 32);
      int var7 = (int)((var4 ^ 92198956728883L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      int var9 = (int)((var4 ^ 118825025982741L) >>> 32);
      int var10 = (int)((var4 ^ 118825025982741L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954823890575512932L ^ var4)
      );
      Snippet var12 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455236932788854507L ^ var4)
      );
      Snippet var11 = var12;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, var6, var11, (char)var7, (short)var8
      );
      var3.withVertexFormat(DefaultVertexFormat.POSITION_COLOR, Mode.QUADS);
      var3.withCull(false);
      var3.withColorTargetState(ColorTargetState.DEFAULT);
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var9, var10
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      long var10001 = var0 ^ 94789184303157L;
      int var3 = (int)((var0 ^ 94789184303157L) >>> 32);
      int var4 = (int)((var0 ^ 94789184303157L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      int var6 = (int)((var0 ^ 116537340912403L) >>> 32);
      int var7 = (int)((var0 ^ 116537340912403L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954818507563296610L ^ var0)
      );
      Snippet var10 = RenderPipelines.DEBUG_FILLED_SNIPPET;
      Intrinsics.checkNotNullExpressionValue(
         RenderPipelines.DEBUG_FILLED_SNIPPET,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8104, 7455242521140571373L ^ var0)
      );
      Snippet var8 = var10;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var8, (char)var4, (short)var5
      );
      var2.withVertexShader(
         ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
      );
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll
      );
      var2.withVertexFormat(DefaultVertexFormat.POSITION, Mode.QUADS);
      var2.withCull(false);
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 78052986474835L) >>> 32);
      int var4 = (int)((var0 ^ 78052986474835L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954777826408650018L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166385150689402213L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(13314, 8333322890346738992L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974907117144432905L ^ var0)
      );
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 39964391458049L) >>> 32);
      int var4 = (int)((var0 ^ 39964391458049L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954744403949437296L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166282231450356023L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(13314, 8333220211715776866L ^ var0));
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(15034, 3766434093698953209L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.MOTION_BLUR_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974798702643770715L ^ var0)
      );
      var2.withColorTargetState(ColorTargetState.DEFAULT);
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(char var0, char var1, int var2, Builder var3) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 112308620173980L) >>> 32);
      int var7 = (int)((var4 ^ 112308620173980L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954812693999560429L ^ var4)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var10 = false;
      boolean var13 = false;
      var3.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166350693297073834L ^ var4));
      var3.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl
      );
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251592523239052839L ^ var4));
      var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var11 = false;
      Intrinsics.checkNotNullExpressionValue(
         var3.withUniform(var15.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974871699705402054L ^ var4)
      );
      var3.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(long var0, Builder var2) {
      var0 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ var0;
      int var3 = (int)((var0 ^ 46761882688112L) >>> 32);
      int var4 = (int)((var0 ^ 46761882688112L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954747425160011265L ^ var0)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var7 = false;
      boolean var10 = false;
      var2.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166275244781049414L ^ var0));
      var2.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var2.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
      );
      var2.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(9470, 4251675661088845515L ^ var0));
      var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var13 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.JFA_PARAMS;
      boolean var8 = false;
      Intrinsics.checkNotNullExpressionValue(
         var2.withUniform(var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974797330635336234L ^ var0)
      );
      var2.withColorTargetState(new ColorTargetState(BlendFunction.TRANSLUCENT));
      var2.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, var4
         )
      );
      return Unit.INSTANCE;
   }

   private static final Unit lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(
      short var0, char var1, int var2, Builder var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
      int var6 = (int)((var4 ^ 115903881883513L) >>> 32);
      int var7 = (int)((var4 ^ 115903881883513L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(21560, 6954817869614197512L ^ var4)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var10 = false;
      boolean var13 = false;
      var3.withVertexShader(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(23674, 4166347166688781135L ^ var4));
      var3.withVertexFormat(DefaultVertexFormat.EMPTY, Mode.TRIANGLES);
      var3.withFragmentShader(
         ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
      );
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(1267, 5095474962453789681L ^ var4));
      var3.withSampler(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(22733, 7781755182601349083L ^ var4));
      var8 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var15 = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.HAND_ITEM_LIGHTMAP;
      boolean var11 = false;
      Intrinsics.checkNotNullExpressionValue(
         var3.withUniform(var15.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), UniformType.UNIFORM_BUFFER),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(24626, 4974863775401877283L ^ var4)
      );
      var3.withColorTargetState(ColorTargetState.DEFAULT);
      var3.withDepthStencilState(
         me.octo.client.utils.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var6, var7
         )
      );
      return Unit.INSTANCE;
   }

   static {
      long var9 = IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI ^ 124831315397625L;
      long var11 = var9 ^ 139788740424828L;
      int var13 = (int)((var9 ^ 36383500636181L) >>> 32);
      long var14 = (var9 ^ 36383500636181L) << 32 >>> 32;
      long var16 = var9 ^ 117269715207761L;
      long var18 = var9 ^ 114235074515783L;
      long var20 = var9 ^ 39708487007684L;
      long var10001 = var9 ^ 50512923244356L;
      int var22 = (int)((var9 ^ 50512923244356L) >>> 48);
      int var23 = (int)((var9 ^ 50512923244356L) << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      long var25 = var9 ^ 25441871698342L;
      var10001 = var9 ^ 38199137450657L;
      int var27 = (int)((var9 ^ 38199137450657L) >>> 48);
      int var28 = (int)((var9 ^ 38199137450657L) << 16 >>> 48);
      int var29 = (int)(var10001 << 32 >>> 32);
      long var30 = var9 ^ 57075379769619L;
      var10001 = var9 ^ 138662238444687L;
      int var32 = (int)((var9 ^ 138662238444687L) >>> 32);
      int var33 = (int)((var9 ^ 138662238444687L) << 32 >>> 48);
      int var34 = (int)(var10001 << 48 >>> 48);
      long var35 = var9 ^ 84746988891000L;
      long var37 = var9 ^ 8424477374535L;
      long var39 = var9 ^ 49907983235685L;
      long var41 = var9 ^ 6040759024396L;
      long var43 = var9 ^ 117670480244942L;
      long var45 = var9 ^ 49909594290990L;
      long var47 = var9 ^ 2629290019182L;
      long var49 = var9 ^ 56661708892829L;
      var10001 = var9 ^ 64301136129415L;
      int var51 = (int)((var9 ^ 64301136129415L) >>> 32);
      int var52 = (int)((var9 ^ 64301136129415L) << 32 >>> 48);
      int var53 = (int)(var10001 << 48 >>> 48);
      var10001 = var9 ^ 44577836452136L;
      int var54 = (int)((var9 ^ 44577836452136L) >>> 48);
      int var55 = (int)((var9 ^ 44577836452136L) << 16 >>> 32);
      int var56 = (int)(var10001 << 48 >>> 48);
      var10001 = var9 ^ 19044979221991L;
      int var57 = (int)((var9 ^ 19044979221991L) >>> 32);
      int var58 = (int)((var9 ^ 19044979221991L) << 32 >>> 48);
      int var59 = (int)(var10001 << 48 >>> 48);
      long var60 = var9 ^ 125430224261552L;
      var10001 = var9 ^ 112993292556297L;
      int var62 = (int)((var9 ^ 112993292556297L) >>> 48);
      int var63 = (int)((var9 ^ 112993292556297L) << 16 >>> 48);
      int var64 = (int)(var10001 << 32 >>> 32);
      long var65 = var9 ^ 121077611463245L;
      long var67 = var9 ^ 8653366956136L;
      long var69 = var9 ^ 36615993086105L;
      long var71 = var9 ^ 107969023789612L;
      long var73 = var9 ^ 68599356493901L;
      long var75 = var9 ^ 465778523537L;
      long var77 = var9 ^ 65755360014164L;
      long var79 = (var9 ^ 1950016593374L) >>> 16;
      int var81 = (int)((var9 ^ 1950016593374L) << 48 >>> 48);
      long var82 = var9 ^ 106385840201020L;
      long var84 = var9 ^ 15096782566548L;
      long var86 = var9 ^ 51881042671998L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[68];
      int var5 = 0;
      String var4 = "ñ\u000f¶3î\u008cH\u009fÅ\u008cÚ\u000bØ\u0081L<²Ô;\u0091è'\b\u0082s¯\u00ad`ç6/\u0084(\u0091YÁ\u0084ä®loµõæ\u001bªò\u000f¶\u0096rª*ç\u0018Ìt\u008c(\u000b Â&Ñ;+r\u0013²j-\u009e#\u0010\u009brþ\u0005vF\u0092\u0001\u0094\u0005V\u001e\u0093+½\u0002(\u0002ÊMÊða\u00853\u001c\u001en\u009b\u008ckc¡¦±\u0084¥\u0017¾\u000b\u009f*\u008a¦SSoË1|6¤{§DW3 è¾÷\u0092\u0015-0o_üAºàï.`´ª\u0084®Õ_\u0084 ´¾'\u0015§¥\u008a§ J\u0019M\u0014©\u0001¢±*Ñ7\u0012U\u001b¶3.N¥\u001bu\rUx®Þ~D\\k¥Ü(.½\u0004ÜÐ\u0086\u0082´;@Ü\u001e\u0013\u0083-\u008b|\u0007ÓûÂ\u009eýu¦P¢3\u008e&ïöwgÇ¥«h¢\u0016\u00187\u0084Ua\u0094Bh\u009eûÖºê0äîÖ[Xo4\u00ad4§1 \u0015${Rº§MVw5ù\u0093±Ï©\u0083úìJ:4\u009d¥ë\t\u0007&Ì\u00963+ü@$µ\u0016ËÁÉ:Â\u009dß(\u0006#\u001bþH\u0098eûò\u0013Q\u0007\u0094\u0094´4_½n\u001b{µ¹õ\b¿\u000bÐÎÂ\u009c7z>kzî\u0083BS\u001e|j¾\u001aZ{ ÛW²Æ  yÞA\u000f©<\u009bs¶ß\bdÞ\u001câé)\u0097\u0005¶\u0083)\u000fêNÞñÞ\u0012ôU\u0004\u0010¢\t\u008db!\u000fÊ\u001c?@*¡\u001f.¸ð(i¸\u0093\u0016f-\u0082Dáû4²sÎ\u0084Ú\u0087æ\u001a\u000eô'«\u0000¬\u0019´ÕM\u0000jj,Úç\u0006>Ø\u0006\u009b\u0010Öè=? úÚç[»¼\u001d\u008d\u0097Õ% ì#Í\u0080öÉ(dYd¼5D\u00197ê\u009aÆ\u0013Od~ªÄ#\u0081Û¿\u0090);((ÅvÏ»¢ÓüBô?£àE];,MÏÓz\u008fÕ\u00ad\fË\u0094Óe\u0004&û@\fo!\u0089À>åÏ\u0010\u0007É\u0097Û\u001a§¥\u001dÐ]ñ«Æ?\u008aH j¾§\u0096\u0091Ì¼¢\"ãÔ©\u001b,ü%6ÛB§ª\u0095v\u0091,FOTµÄN/ É\r¬Yz,[q\u001c\u0010ç\u000b\th\u0016ö\u0014êV½\u0081G¢Y+\u009fO\u0089¶´\u0082O\u0010\u0017¹ÔàÃ©Þõí# G\u0001Þ§i\u0018\u0094h\u0006\u0081Å\u0086n*Ôø\u009a\u0081É\u0093¸\u009a¦¤yl&\u008f}Ì\u0018¥Îô\u0092\u0099É\u008d\u008c<æ»\u0003Ì=\u001dO.F6\u008cÉö\u0000ö \u0099¢D\u0004-m±Ú\u0006n\u0089\u0014\u009d\u008el.\u0085\u009d\u009c\u008dÚö\u0014kW½\u0014\u001fi+\u0098G(ÁM\u0094¸\u001eF[T38ó¢ú\u0086vég\u0084ÇÙà\u0090Ü\u001c\u0006\u0003ÄoÚ)j\bÙ¥\u0084®×CFß 1ãìaÐw\u009b\u000f¼M\u0098*|&4:L\t\u0080pê\u0097!\u0090QÃ\\¬ÆåíN\u0010\u0006w\u0086^\u000f®²înÊ\u008c\u0001LRÆÓ\u0018-]\u001c¸²»ñ\u00ad\u00057\u000eÌWX\u008ci\u0016ÜQ\u007fn _ö@3ê´¾;\u0085ñ\u009c[Kam§÷/1\u0002ù\u00ad\u009d\nÙ78Íj´xïúr'\u001f\u001a\n@\u0015h\u0098\u00815Ã\u0014Tg$Ò!ÒÅ^\u008c\u009eºÅçmØ\u0098õt]gó\u0010\u0004\u0003\u0088\u001fÅlÛú\u001aÿ\u009ei¼\"äÈ\u0018P\u0092\u008eËÖè\u001e50\u0099¯#\u0016¼\u000f1Ø\u0094\u0090o×\u007f\u00822(E\u0091V\u0012Yö~\u000eñ±=ºÿ\u0096×¼qëéé{KÛ\r\u0012IEë\u0081î\u0013aýM\u0095ya8÷¯ üwucNkÄ\u0085¸D\u0017ÙwZà\u0010\u008d>ã\u007fèi`\u0016¹Xø\u009d\u0085TÎG8`\u0091ä\u0019\u008b-`±\u008d·íhêÍÜ\u008fëO!D5\u0080Bª\u0089\u0086¨ð\u009a\u008e\u0087\u0081¸Âúî«IÄ\u0086m\u001eâ\u009e¦u¼}¥D\u0081\u0084püÿé\u0018$3\u009dzl¡Ùä\u0000#Åäêf,Kçz\u0083qñÄ¦# ~Ll\u0089àSû\u0013\u0003ò63è\u001f®>í¤¬\u00937\u0014\u001f÷\n±Q÷û\u0094§r(\u009b®\u0084ö³\u0083@\u001dßfÛ3\u0003:i\n{êûÝÏèÝ\u008d6È\u008f\u0011\u0091¤X\u0095í±\u001eFåYjt(\u0096\u0083k\u0002\u008f\u0003\u001c^\u0004Ó>\\\u0088¥\u000eKô÷\u0001\u009c1Í|O k §\u0090õpÓh\u0095;\u0012\u001fíüå(\u0085óÚÊ\u0084 ²Ô\u0097aïIÚN;çYf\u0088\u0087\u001f\u0087Á\u0085\u009a\u0019\u008fÎÖHÑ=·ùÐ¦\u0001ÿ|ë ÚZ\u0082´¹q&U`%3BS·«©°\u0093§.r5ðû\u007f\rNnø²\u0019\u0099 »\u0016®EDé¦È\u0088o=\u0000\u0005¥Ñð¬WlM\u008eÊ7cv\u0002'\u001a\u009dþ´ä gß\u008d\u009eþWæ?\u0006_p\u001aØb\u0093Õ$,\ró¾Ð\u001efLD¨æ®\u0019\u0003¢\u0010ÆøI).³à§\u0007]@ÐàXÛ\u0095\u0018\u0012¾Â&\u008f¥<ß\u000b@²V¡\u0095E\u008d+þk=\u009d¾0ÿ\u0018\u0083\u0012 ®r½ØÈ\u001aBÅï\u0097\u0081í_#9à/¡E\u0086ô\u0010ß â-7¤ºý¾j\u000f<â\\£«(\u0093\u0007\u0007\u0010?ËDsXôfö ½!\u0015ñ\u009fê\u009ak¹\u0001\u0093Ó«kãçI%m\u0092¨o¾\u008b\u008e`5 \u0097ùò\u0091B6Nõ\u0083³\u008dm\u0089gÃår*\u0011\u008e;\u0093\u008d\"w¯ì\u001d5\u0007ÏÄ\u0018D\u008aåAê¿_NpMÏ\u0011ý\u0018æ\u0081*\u0096\u0019\u001aºE-{\u0018\u0017TÄ¢\u001a\u008a\u0005À¤kÜ\u0015RñÚ\u009f\u0016Ä?:\"B¿Û \tÚþ\u0096\n\u0090\u009f}á\u001b\u009d\u0014¸\u001eÏ¢\u001d»xc²¨Á\u00ad³JìÉºdD×(ó/\u0090ªÿ\u009d(\u0097üdE=\u0004\u0084gBÚ[ñ\u000fRý]ÔÆ\u0091(ÓýäEG³oK\u001b\nzlz\u0010\u0092\u001a\u0087L\u0016ÖÒ~§\u007f\u0090º5É\u0012¤\u0018S¤OzæíX\u0086\u009eÙ¬¥E¬µ/ïÎ\u0017ô¯åè¯\u0010E\u009d7\u0083\u009c\u0003\u001eä\u0091ùªPP\u0086\u0089\u00970\u009dö\u000bý)\u0018²þ£\u0000êð ×Í3\u001eR}-û\u000b)\u0092`ä\u0095aC\u008aú\u008c\u0096\u009a»!w\u0003\u0015z\u008f\u009d\u0082FWH\u0095m(\u0010Ä<F´e\u0088\u0089È\u0001§¬kY#0\u001a\u0088\u00912vW ÀÐ\n\u0086¶W6* L\u0093 \u009eR\n\u008cå\u0018\u008aã\u009f\u008e¼G==Ru~\u0095P8z\u009a³¼\u0087\u000bÛ£»f \u0092â\u008a®·Öü´yP{¤áìÔ\u0011\u0011\u0016(/\u0018$Ü\u0085Ó,ËÙ½\u001a^°\u0018Å\u0005àCæ~²\u0003î\u0084³2\u009aKÇ¥V\u001c<!n\u0081$A(aþ\u0094 \u0081B&hè ¿\u009fàPÉ»9¹\u0080¥Ï\u0010Å¼&¹ðÆw\u001b\u009b]Ñ'7 \u008f\u001aIä\u0010\u0003\u000f\u0002q|\u008b\u0015»Æêy\u0085uI.\u008f(\u0087ÝÝ\u0006ÞAQ%iu#¦R¶\u0099\u0098\u0096D\u009a^\u0094\u001bñ\u0080\u000e£ßÍw\u0006\u0082X'\u000e\u0096îèH\tÃ o\u009b\u0000>\u008aH\u001e¼ªNãSç¶»£#ôR³ë\u009d`\u008a\u009c¶Î>2c/¾ FN@ö\u001eýv´Å\bQ\u001btÃ§I[Û\u0005&F\u0007\u0014ë²Å\u0019¡ptd*(\u0093ù\u0010\u0091\u000b\u001b\u0093£ç`Bí,v\u0004z\u0004\u0087È\u0002äø\u000e\u001f§\u009c\u0085\u0007÷M¾\u009et&¦¬\u0096'KH0+ý²\t¤\u0095ê¨a¥\u00973\u0017\u008aØåÓ\u000f\u007fË-î«H?\u001eî\u0011\u001dõ\u0017¦\u0090z®Ñ<ñ¼s«L°¿W\u0093yi";
      int var6 = "ñ\u000f¶3î\u008cH\u009fÅ\u008cÚ\u000bØ\u0081L<²Ô;\u0091è'\b\u0082s¯\u00ad`ç6/\u0084(\u0091YÁ\u0084ä®loµõæ\u001bªò\u000f¶\u0096rª*ç\u0018Ìt\u008c(\u000b Â&Ñ;+r\u0013²j-\u009e#\u0010\u009brþ\u0005vF\u0092\u0001\u0094\u0005V\u001e\u0093+½\u0002(\u0002ÊMÊða\u00853\u001c\u001en\u009b\u008ckc¡¦±\u0084¥\u0017¾\u000b\u009f*\u008a¦SSoË1|6¤{§DW3 è¾÷\u0092\u0015-0o_üAºàï.`´ª\u0084®Õ_\u0084 ´¾'\u0015§¥\u008a§ J\u0019M\u0014©\u0001¢±*Ñ7\u0012U\u001b¶3.N¥\u001bu\rUx®Þ~D\\k¥Ü(.½\u0004ÜÐ\u0086\u0082´;@Ü\u001e\u0013\u0083-\u008b|\u0007ÓûÂ\u009eýu¦P¢3\u008e&ïöwgÇ¥«h¢\u0016\u00187\u0084Ua\u0094Bh\u009eûÖºê0äîÖ[Xo4\u00ad4§1 \u0015${Rº§MVw5ù\u0093±Ï©\u0083úìJ:4\u009d¥ë\t\u0007&Ì\u00963+ü@$µ\u0016ËÁÉ:Â\u009dß(\u0006#\u001bþH\u0098eûò\u0013Q\u0007\u0094\u0094´4_½n\u001b{µ¹õ\b¿\u000bÐÎÂ\u009c7z>kzî\u0083BS\u001e|j¾\u001aZ{ ÛW²Æ  yÞA\u000f©<\u009bs¶ß\bdÞ\u001câé)\u0097\u0005¶\u0083)\u000fêNÞñÞ\u0012ôU\u0004\u0010¢\t\u008db!\u000fÊ\u001c?@*¡\u001f.¸ð(i¸\u0093\u0016f-\u0082Dáû4²sÎ\u0084Ú\u0087æ\u001a\u000eô'«\u0000¬\u0019´ÕM\u0000jj,Úç\u0006>Ø\u0006\u009b\u0010Öè=? úÚç[»¼\u001d\u008d\u0097Õ% ì#Í\u0080öÉ(dYd¼5D\u00197ê\u009aÆ\u0013Od~ªÄ#\u0081Û¿\u0090);((ÅvÏ»¢ÓüBô?£àE];,MÏÓz\u008fÕ\u00ad\fË\u0094Óe\u0004&û@\fo!\u0089À>åÏ\u0010\u0007É\u0097Û\u001a§¥\u001dÐ]ñ«Æ?\u008aH j¾§\u0096\u0091Ì¼¢\"ãÔ©\u001b,ü%6ÛB§ª\u0095v\u0091,FOTµÄN/ É\r¬Yz,[q\u001c\u0010ç\u000b\th\u0016ö\u0014êV½\u0081G¢Y+\u009fO\u0089¶´\u0082O\u0010\u0017¹ÔàÃ©Þõí# G\u0001Þ§i\u0018\u0094h\u0006\u0081Å\u0086n*Ôø\u009a\u0081É\u0093¸\u009a¦¤yl&\u008f}Ì\u0018¥Îô\u0092\u0099É\u008d\u008c<æ»\u0003Ì=\u001dO.F6\u008cÉö\u0000ö \u0099¢D\u0004-m±Ú\u0006n\u0089\u0014\u009d\u008el.\u0085\u009d\u009c\u008dÚö\u0014kW½\u0014\u001fi+\u0098G(ÁM\u0094¸\u001eF[T38ó¢ú\u0086vég\u0084ÇÙà\u0090Ü\u001c\u0006\u0003ÄoÚ)j\bÙ¥\u0084®×CFß 1ãìaÐw\u009b\u000f¼M\u0098*|&4:L\t\u0080pê\u0097!\u0090QÃ\\¬ÆåíN\u0010\u0006w\u0086^\u000f®²înÊ\u008c\u0001LRÆÓ\u0018-]\u001c¸²»ñ\u00ad\u00057\u000eÌWX\u008ci\u0016ÜQ\u007fn _ö@3ê´¾;\u0085ñ\u009c[Kam§÷/1\u0002ù\u00ad\u009d\nÙ78Íj´xïúr'\u001f\u001a\n@\u0015h\u0098\u00815Ã\u0014Tg$Ò!ÒÅ^\u008c\u009eºÅçmØ\u0098õt]gó\u0010\u0004\u0003\u0088\u001fÅlÛú\u001aÿ\u009ei¼\"äÈ\u0018P\u0092\u008eËÖè\u001e50\u0099¯#\u0016¼\u000f1Ø\u0094\u0090o×\u007f\u00822(E\u0091V\u0012Yö~\u000eñ±=ºÿ\u0096×¼qëéé{KÛ\r\u0012IEë\u0081î\u0013aýM\u0095ya8÷¯ üwucNkÄ\u0085¸D\u0017ÙwZà\u0010\u008d>ã\u007fèi`\u0016¹Xø\u009d\u0085TÎG8`\u0091ä\u0019\u008b-`±\u008d·íhêÍÜ\u008fëO!D5\u0080Bª\u0089\u0086¨ð\u009a\u008e\u0087\u0081¸Âúî«IÄ\u0086m\u001eâ\u009e¦u¼}¥D\u0081\u0084püÿé\u0018$3\u009dzl¡Ùä\u0000#Åäêf,Kçz\u0083qñÄ¦# ~Ll\u0089àSû\u0013\u0003ò63è\u001f®>í¤¬\u00937\u0014\u001f÷\n±Q÷û\u0094§r(\u009b®\u0084ö³\u0083@\u001dßfÛ3\u0003:i\n{êûÝÏèÝ\u008d6È\u008f\u0011\u0091¤X\u0095í±\u001eFåYjt(\u0096\u0083k\u0002\u008f\u0003\u001c^\u0004Ó>\\\u0088¥\u000eKô÷\u0001\u009c1Í|O k §\u0090õpÓh\u0095;\u0012\u001fíüå(\u0085óÚÊ\u0084 ²Ô\u0097aïIÚN;çYf\u0088\u0087\u001f\u0087Á\u0085\u009a\u0019\u008fÎÖHÑ=·ùÐ¦\u0001ÿ|ë ÚZ\u0082´¹q&U`%3BS·«©°\u0093§.r5ðû\u007f\rNnø²\u0019\u0099 »\u0016®EDé¦È\u0088o=\u0000\u0005¥Ñð¬WlM\u008eÊ7cv\u0002'\u001a\u009dþ´ä gß\u008d\u009eþWæ?\u0006_p\u001aØb\u0093Õ$,\ró¾Ð\u001efLD¨æ®\u0019\u0003¢\u0010ÆøI).³à§\u0007]@ÐàXÛ\u0095\u0018\u0012¾Â&\u008f¥<ß\u000b@²V¡\u0095E\u008d+þk=\u009d¾0ÿ\u0018\u0083\u0012 ®r½ØÈ\u001aBÅï\u0097\u0081í_#9à/¡E\u0086ô\u0010ß â-7¤ºý¾j\u000f<â\\£«(\u0093\u0007\u0007\u0010?ËDsXôfö ½!\u0015ñ\u009fê\u009ak¹\u0001\u0093Ó«kãçI%m\u0092¨o¾\u008b\u008e`5 \u0097ùò\u0091B6Nõ\u0083³\u008dm\u0089gÃår*\u0011\u008e;\u0093\u008d\"w¯ì\u001d5\u0007ÏÄ\u0018D\u008aåAê¿_NpMÏ\u0011ý\u0018æ\u0081*\u0096\u0019\u001aºE-{\u0018\u0017TÄ¢\u001a\u008a\u0005À¤kÜ\u0015RñÚ\u009f\u0016Ä?:\"B¿Û \tÚþ\u0096\n\u0090\u009f}á\u001b\u009d\u0014¸\u001eÏ¢\u001d»xc²¨Á\u00ad³JìÉºdD×(ó/\u0090ªÿ\u009d(\u0097üdE=\u0004\u0084gBÚ[ñ\u000fRý]ÔÆ\u0091(ÓýäEG³oK\u001b\nzlz\u0010\u0092\u001a\u0087L\u0016ÖÒ~§\u007f\u0090º5É\u0012¤\u0018S¤OzæíX\u0086\u009eÙ¬¥E¬µ/ïÎ\u0017ô¯åè¯\u0010E\u009d7\u0083\u009c\u0003\u001eä\u0091ùªPP\u0086\u0089\u00970\u009dö\u000bý)\u0018²þ£\u0000êð ×Í3\u001eR}-û\u000b)\u0092`ä\u0095aC\u008aú\u008c\u0096\u009a»!w\u0003\u0015z\u008f\u009d\u0082FWH\u0095m(\u0010Ä<F´e\u0088\u0089È\u0001§¬kY#0\u001a\u0088\u00912vW ÀÐ\n\u0086¶W6* L\u0093 \u009eR\n\u008cå\u0018\u008aã\u009f\u008e¼G==Ru~\u0095P8z\u009a³¼\u0087\u000bÛ£»f \u0092â\u008a®·Öü´yP{¤áìÔ\u0011\u0011\u0016(/\u0018$Ü\u0085Ó,ËÙ½\u001a^°\u0018Å\u0005àCæ~²\u0003î\u0084³2\u009aKÇ¥V\u001c<!n\u0081$A(aþ\u0094 \u0081B&hè ¿\u009fàPÉ»9¹\u0080¥Ï\u0010Å¼&¹ðÆw\u001b\u009b]Ñ'7 \u008f\u001aIä\u0010\u0003\u000f\u0002q|\u008b\u0015»Æêy\u0085uI.\u008f(\u0087ÝÝ\u0006ÞAQ%iu#¦R¶\u0099\u0098\u0096D\u009a^\u0094\u001bñ\u0080\u000e£ßÍw\u0006\u0082X'\u000e\u0096îèH\tÃ o\u009b\u0000>\u008aH\u001e¼ªNãSç¶»£#ôR³ë\u009d`\u008a\u009c¶Î>2c/¾ FN@ö\u001eýv´Å\bQ\u001btÃ§I[Û\u0005&F\u0007\u0014ë²Å\u0019¡ptd*(\u0093ù\u0010\u0091\u000b\u001b\u0093£ç`Bí,v\u0004z\u0004\u0087È\u0002äø\u000e\u001f§\u009c\u0085\u0007÷M¾\u009et&¦¬\u0096'KH0+ý²\t¤\u0095ê¨a¥\u00973\u0017\u008aØåÓ\u000f\u007fË-î«H?\u001eî\u0011\u001dõ\u0017¦\u0090z®Ñ<ñ¼s«L°¿W\u0093yi"
         .length();
      char var3 = ' ';
      int var89 = -1;

      label27:
      while (true) {
         String var90 = var4.substring(++var89, var89 + var3);
         byte var98 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var90.getBytes("ISO-8859-1"));
            String var103 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var98) {
               case 0:
                  var7[var5++] = var103;
                  if ((var89 += var3) >= var6) {
                     IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = var7;
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = new String[68];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Object2ObjectOpenHashMap();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "lines_with_width",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "lines",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "line_strip",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "triangles",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "quads",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "screen_lines",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_lines",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "chams_blocks",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "lines_relative_to_camera",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll
                     );
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "lines_relative_to_camera_no_color",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "quads_relative_to_camera",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "quads_relative_to_camera_no_color",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "outline_quads",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "outline_quads_no_color",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "tex_quads",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "outline",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "jfa_mask",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI
                     );
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "jfa_flood",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll
                     );
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "jfa_composite",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI
                     );
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_down",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl
                     );
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_up",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl
                     );
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_up_composite",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll
                     );
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_h",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII
                     );
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "glow_v",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl
                     );
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "outline_h",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII
                     );
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "outline_v",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll
                     );
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "fill_mask",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl
                     );
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "fill_mask_uniform",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll
                     );
                     IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "fxaa",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII
                     );
                     IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "motion_blur",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll
                     );
                     lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "fill_blit",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI
                     );
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "jfa_glow",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll
                     );
                     IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        "item_chams",
                        var16,
                        llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI
                     );
                     return;
                  }

                  var3 = var4.charAt(var89);
                  break;
               default:
                  var7[var5++] = var103;
                  if ((var89 += var3) < var6) {
                     var3 = var4.charAt(var89);
                     continue label27;
                  }

                  var4 = "M1\u001c0?bD\u0080Y\u0001v{´\u0093Tô\u00816Ï\u0082±<sµ\u0010tÉ3\u0092ø?\u001f\u001cCzI[/Ûf÷";
                  var6 = "M1\u001c0?bD\u0080Y\u0001v{´\u0093Tô\u00816Ï\u0082±<sµ\u0010tÉ3\u0092ø?\u001f\u001cCzI[/Ûf÷".length();
                  var3 = 24;
                  var89 = -1;
            }

            var90 = var4.substring(++var89, var89 + var3);
            var98 = 0;
         }
      }
   }

   private static IllegalStateException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(IllegalStateException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17312;
      if (IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI[var5].getBytes("ISO-8859-1");
         IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII[var5];
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
            "me/octo/client/render/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
