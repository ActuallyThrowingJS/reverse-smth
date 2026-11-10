package me.octo.client.utils.render;

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
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 83544617519141L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, @NotNull Color var1, float var2, boolean var3, float var4, long var5
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var7 = var5 ^ 83803716653577L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751548100409630562L ^ var5)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7567242323624379915L, var5
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222709516982117529L ^ var5)
      );
      Vec3 var10001 = var0.getPosition(var4);
      Intrinsics.checkNotNullExpressionValue(
         var10001, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5015, 3895070183066755937L ^ var5)
      );
      Vec3 var13 = var10001;
      AABB var18 = var0.getBoundingBox().move(var13.x - var0.getX(), var13.y - var0.getY(), var13.z - var0.getZ());
      Intrinsics.checkNotNullExpressionValue(
         var18, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(12658, 8907092988347826565L ^ var5)
      );
      AABB var14 = var18;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var12 = var10000;

      float var10002;
      boolean var10003;
      label22: {
         label21: {
            try {
               var17 = var14;
               var19 = var1;
               var10002 = var2;
               var10003 = var3;
               if (var12 == null) {
                  break label22;
               }

               if (!var3) {
                  break label21;
               }
            } catch (MatchException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, 7602637409572608489L, var5
               );
            }

            var10003 = false;
            break label22;
         }

         var10003 = true;
      }

      boolean var9 = var10003;
      float var10 = var10002;
      Color var11 = var19;
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var17, var7, var11, var10, var9
      );
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, long var1, int var3, float var4
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var5 = var1 ^ 51971511361980L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751658590123432550L ^ var1)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var0, new Color(var3), var4, true, 0.0F, 16, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, @NotNull Color var1, boolean var2, long var3
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var5 = var3 ^ 68137335809955L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6558916252533191691L, var3
      );
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751597976326427292L ^ var3)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var7 = var10000;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222694560365455719L ^ var3)
      );
      AABB var11 = var0.getBoundingBox();
      Intrinsics.checkNotNullExpressionValue(
         var11, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(9604, 4215663465970768008L ^ var3)
      );
      AABB var8 = var11;

      Color var10001;
      boolean var10002;
      label22: {
         label21: {
            try {
               var12 = var8;
               var10001 = var1;
               var10002 = var2;
               if (var7 == null) {
                  break label22;
               }

               if (!var2) {
                  break label21;
               }
            } catch (MatchException var9) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var9, -6593326109188942825L, var3
               );
            }

            var10002 = false;
            break label22;
         }

         var10002 = true;
      }

      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var12, var5, var10001, var10002
      );
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, int var1, short var2, int var3, char var4
   ) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 6786501297355L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751672001641389682L ^ var5)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, new Color(var1), true, var7);
   }

   @JvmStatic
   @JvmOverloads
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Entity var0, long var1, @NotNull Color var3, boolean var4
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var5 = var1 ^ 2253223824664L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751551198145787943L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222712477478536156L ^ var1)
      );
      AABB var10000 = var0.getBoundingBox();
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(9604, 4215708325447135795L ^ var1)
      );
      AABB var7 = var10000;
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var7, var5, var3, false
      );
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull Entity var0, long var1, int var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 109378724243869L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751577040850688415L ^ var1)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var0, var4, new Color(var3), true);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, char var1, @NotNull Color var2, float var3, int var4, short var5, float var6
   ) {
      long var7 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var9 = var7 ^ 107558094513561L;
      long var11 = var7 ^ 38161080294861L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751585594404382962L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222677814758757129L ^ var7)
      );
      Vec3 var10000 = var0.getPosition(var6);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(21032, 7761820719274595655L ^ var7)
      );
      Vec3 var13 = var10000;
      AABB var15 = var0.getBoundingBox().move(var13.x - var0.getX(), var13.y - var0.getY(), var13.z - var0.getZ());
      Intrinsics.checkNotNullExpressionValue(
         var15, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(27876, 7043364788625320836L ^ var7)
      );
      AABB var14 = var15;
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var14, var11, var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F), false
      );
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var14, var9, var2, var3, false
      );
   }

   @JvmStatic
   @JvmOverloads
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Entity var0, int var1, float var2, long var3
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var5 = var3 ^ 119008437165547L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751542005033016401L ^ var3)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var0, new Color(var1), var2, 0.0F, 8, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, @NotNull Color var1, @NotNull Color var2, float var3, boolean var4, long var5
   ) {
      var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var5;
      long var7 = var5 ^ 52331331455123L;
      long var9 = var5 ^ 119844985548999L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751649668947903992L ^ var5)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         8331199081808518289L, var5
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(3903, 5329974803002189148L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(11148, 292149670886916587L ^ var5)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var14 = var10000;
      AABB var19 = var0.getBoundingBox();
      Intrinsics.checkNotNullExpressionValue(
         var19, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(11566, 6857022981998397248L ^ var5)
      );
      AABB var15 = var19;

      Color var10001;
      boolean var10002;
      label39: {
         label38: {
            try {
               var20 = var15;
               var10001 = var2;
               var10002 = var4;
               if (var14 == null) {
                  break label39;
               }

               if (!var4) {
                  break label38;
               }
            } catch (MatchException var17) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var17, 8294396663146267507L, var5
               );
            }

            var10002 = false;
            break label39;
         }

         var10002 = true;
      }

      boolean var10003;
      label30: {
         label29: {
            try {
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  var20, var9, var10001, var10002
               );
               var21 = var15;
               var10001 = var1;
               var23 = var3;
               var10003 = var4;
               if (var14 == null) {
                  break label30;
               }

               if (!var4) {
                  break label29;
               }
            } catch (MatchException var16) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var16, 8294396663146267507L, var5
               );
            }

            var10003 = false;
            break label30;
         }

         var10003 = true;
      }

      boolean var11 = var10003;
      float var12 = var23;
      Color var13 = var10001;
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var21, var7, var13, var12, var11
      );
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity param0, @NotNull Color param1, long param2, int param4, int param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, int var1, long var2, int var4, int var5, int var6
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var7 = var2 ^ 61150143957127L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751642560670768107L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, new Color(var1), var7, var4, var5, var6);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, @NotNull Color var1, float var2, long var3
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var5 = var3 ^ 61798538619206L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751565234579121307L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222726754497159008L ^ var3)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F), var2, true, var5
      );
   }

   @JvmStatic
   @JvmOverloads
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Entity param0, int param1, @NotNull Color param2, float param3, byte param4, int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, long var1, @NotNull Color var3, float var4, boolean var5
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var6 = var1 ^ 5148150218591L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751618002050253957L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222779521901199230L ^ var1)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, var0, var3, var4, var5, 0.0F, 16, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull Entity var0, @NotNull Color var1, long var2, float var4
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var5 = var2 ^ 105424794470867L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751571048222192137L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222736866597145074L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var0, var1, var4, false, 0.0F, 24, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull Entity var2, @NotNull Color var3
   ) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      long var4 = var0 ^ 68437832416920L;
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751676891569849666L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222773406824431289L ^ var0)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var2, var3, 0.0F, false, 0.0F, 28, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      int var0, int var1, byte var2, @NotNull Entity var3, int var4
   ) {
      long var5 = ((long)var0 << 32 | (long)var1 << 40 >>> 32 | (long)var2 << 56 >>> 56)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 47190523379947L;
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751596459351986157L ^ var5)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var7, var4, 0.0F, 4, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Entity var0, short var1, int var2, char var3, @NotNull Color var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var10001 = var5 ^ 12515924679291L;
      int var7 = (int)((var5 ^ 12515924679291L) >>> 48);
      int var8 = (int)((var5 ^ 12515924679291L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751628999523760788L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222794921179251055L ^ var5)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var4, (char)var7, false, 4, null, (short)var8, var9);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull Entity var0, int var1, int var2, char var3, @NotNull Color var4
   ) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 103463232001101L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751584421174292878L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222679802020612725L ^ var5)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var0, var4, false, 4, var7, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @NotNull Entity var0, @NotNull Color var1, float var2, long var3
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var5 = var3 ^ 140013977619328L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751558114313898554L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222725066761597377L ^ var3)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var0, var1, var2, 0.0F, 8, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @NotNull Entity var0, @NotNull Color var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 47076979716481L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751614762168578107L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222780581013294016L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var0, var1, 0.0F, 0.0F, 12, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull Entity var0, long var1, int var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 71063737186578L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751539480512331192L ^ var1)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var0, var4, var3, 0.0F, 4, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, long var1, @NotNull Color var3, @NotNull Color var4, float var5
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var6 = var1 ^ 42151427989035L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751540413279206921L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(25408, 4942980655771382481L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(30627, 957077803347371558L ^ var1)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var3, var4, var5, false, 16, var6, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, long var1, @NotNull Color var3, @NotNull Color var4
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var5 = var1 ^ 2100350249480L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751582610766318122L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(25408, 4942939221647443698L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(30627, 957048523980493317L ^ var1)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var3, var4, 0.0F, false, 24, var5, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, @NotNull Color var1, int var2, short var3, int var4, int var5, short var6
   ) {
      long var7 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var6 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var9 = var7 ^ 40766337041475L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751603639378943795L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222695752090707144L ^ var7)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var4, var5, var9, 0, 16, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull Entity var2, @NotNull Color var3, int var4
   ) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      long var5 = var0 ^ 124946971952975L;
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751661156294876223L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222752311497336772L ^ var0)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var3, var4, 0, var5, 0, 24, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      @NotNull Entity var0, @NotNull Color var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 118876626943228L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(26621, 3929893901392850923L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(13683, 8858510186823122284L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, 0, 0, var4, 0, 28, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, int var1, long var2, int var4, int var5
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var6 = var2 ^ 60685267995163L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751630709422966200L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var4, var5, 0, 16, null, var6);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, int var1, int var2, long var3
   ) {
      var3 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var3;
      long var5 = var3 ^ 61766710065365L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751640621318813558L ^ var3)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var2, 0, 0, 24, null, var5);
   }

   @JvmStatic
   @JvmOverloads
   public static final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      @NotNull Entity var0, int var1, int var2, int var3, char var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 86318409373277L;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751586385623849470L ^ var5)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, 0, 0, 0, 28, null, var7);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      @NotNull Entity var0, @NotNull Color var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var10001 = var2 ^ 37545878433714L;
      int var4 = (int)((var2 ^ 37545878433714L) >>> 32);
      int var5 = (int)((var2 ^ 37545878433714L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751669348698308348L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222761461139522823L ^ var2)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var1, var4, (short)var5, 0.0F, 4, (char)var6, null);
   }

   @JvmStatic
   @JvmOverloads
   public static final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      long var0, @NotNull Entity var2, @NotNull Color var3
   ) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      long var4 = var0 ^ 108550610778960L;
      Intrinsics.checkNotNullParameter(
         var2, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28567, 7751580050821310168L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(5221, 9222675358986607907L ^ var0)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2, var3, 0.0F, 4, null, var4);
   }

   static {
      long var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 123331427535992L;
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
      String var6 = "%¶%x¶w\u0097i°\u0015\u009cA¸MoMüF\u0000VÊ¨&î(Â\u0003±V\tT\"\u0088±|\u0093E\u0085\u009ewÙ^:ð\u0089\u009f\u0011%À/9ñÞCO+\u009fyú©\u009bÖ×\t°\u0010\u0005iié±3=P\u0083\u0086z\u0081½\n\u0088\u0082 ÏP\u0005àôËÚ\u0013\u0004Õ\u009cd~{µ\u0091©«}\u009f&² Û\u0000¡>JH^>- Ç\u009d*\u00ad\u0013/Hz\u0002íSã\u001f¿\u001c\u0086N'!ÇtgYÝ\u001f¸\u008f^\"8Y³ §\u0002p=\u0000Ø\bOåá:Ùuð1Æ¦\u0004b\u001dIyÿ£¬¾iKýå¬µ\u0010$S½ú)\u0004í9T\u0085TBJq´\u008b\u0018S\u0084Ê\u0005)\u008e\u0010JqíN¯Ì¢HR\u00064\u001a\u001e¾\u0092N\u0084(òÁ\u0084\u0089éúIà¡Ü:å`\u0092%úì\u0083©'\u0093\u001c|!)¨\u008b\u009a\r\u0011-ì\u0094¬z¥\u0084\u0018Z\u008d\u0018öÖ+ãÃ«ç'\u0096\u0099\u0015e\nöÜ¬³t?|y\u009e\u0081÷(meÆ\u0019»¼ÖÂÃ¸iÒÏ¬k\u0006Ëî ´/\u001c»²UO¤¥ªï?äÂ\u0084\u0004;\u0000áY\u0018\u0010\u0083vê\u0005\u001e6-Ø\u0019¢VDVé{¼(Ç\u0082\u008eq¢sàH\u0092´\u0005:hé.±\u001f m\rÃ@[´;M¾xÂ6uEæÝ\u0086\u00189kæ\u000e\u0018õÁ\u009e\u001bå\u0003\u0098õ³Æ\u0092FsåÍÿ<:\u0017'm\u000b\nk\u0018\u00065Æ\u008a\u008a¦)ÛÑÓQ\u008f_düì\\Ã#vwò\u008e[";
      int var8 = "%¶%x¶w\u0097i°\u0015\u009cA¸MoMüF\u0000VÊ¨&î(Â\u0003±V\tT\"\u0088±|\u0093E\u0085\u009ewÙ^:ð\u0089\u009f\u0011%À/9ñÞCO+\u009fyú©\u009bÖ×\t°\u0010\u0005iié±3=P\u0083\u0086z\u0081½\n\u0088\u0082 ÏP\u0005àôËÚ\u0013\u0004Õ\u009cd~{µ\u0091©«}\u009f&² Û\u0000¡>JH^>- Ç\u009d*\u00ad\u0013/Hz\u0002íSã\u001f¿\u001c\u0086N'!ÇtgYÝ\u001f¸\u008f^\"8Y³ §\u0002p=\u0000Ø\bOåá:Ùuð1Æ¦\u0004b\u001dIyÿ£¬¾iKýå¬µ\u0010$S½ú)\u0004í9T\u0085TBJq´\u008b\u0018S\u0084Ê\u0005)\u008e\u0010JqíN¯Ì¢HR\u00064\u001a\u001e¾\u0092N\u0084(òÁ\u0084\u0089éúIà¡Ü:å`\u0092%úì\u0083©'\u0093\u001c|!)¨\u008b\u009a\r\u0011-ì\u0094¬z¥\u0084\u0018Z\u008d\u0018öÖ+ãÃ«ç'\u0096\u0099\u0015e\nöÜ¬³t?|y\u009e\u0081÷(meÆ\u0019»¼ÖÂÃ¸iÒÏ¬k\u0006Ëî ´/\u001c»²UO¤¥ªï?äÂ\u0084\u0004;\u0000áY\u0018\u0010\u0083vê\u0005\u001e6-Ø\u0019¢VDVé{¼(Ç\u0082\u008eq¢sàH\u0092´\u0005:hé.±\u001f m\rÃ@[´;M¾xÂ6uEæÝ\u0086\u00189kæ\u000e\u0018õÁ\u009e\u001bå\u0003\u0098õ³Æ\u0092FsåÍÿ<:\u0017'm\u000b\nk\u0018\u00065Æ\u008a\u008a¦)ÛÑÓQ\u008f_düì\\Ã#vwò\u008e["
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[17];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "÷\u0001QKN\u0019Á¹w¼¿t+¸´8 \f\u0097ì4ó£\u001eòd\u009b\u009fÒÈ©ÿ\u009a¡ãA!\u000eµª¡\u001b\u000eofCÃ\u001f&";
                  var8 = "÷\u0001QKN\u0019Á¹w¼¿t+¸´8 \f\u0097ì4ó£\u001eòd\u009b\u009fÒÈ©ÿ\u009a¡ãA!\u000eµª¡\u001b\u000eofCÃ\u001f&".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6783;
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
               "me/octo/client/utils/render/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
            "me/octo/client/utils/render/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
