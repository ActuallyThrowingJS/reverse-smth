package me.octo.client.utils.render.shapes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
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
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   @NotNull
   public static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Minecraft IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 77814716575442L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
   }

   @Nullable
   public final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable Vec3 var1) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Minecraft llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      int[] var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7060225756712924043L, var1
      );
      int[] var10000 = var3;
      Vector3f var4 = new Vector3f(0.0F, 0.0F, 1.0F);

      label20: {
         try {
            if (var10000 == null) {
               return;
            }

            if (!(Boolean)IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.options.bobView().get()) {
               break label20;
            }
         } catch (MatchException var6) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var6, -7150099014859345519L, var1
            );
         }

         PoseStack var5 = new PoseStack();
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5);
         var4.mulPosition((Matrix4fc)var5.last().pose().invert());
      }

      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Vec3(var4.x, -var4.y, var4.z)
         .xRot(
            -((float)Math.toRadians(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().xRot()))
         )
         .yRot(
            -((float)Math.toRadians(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().yRot()))
         )
         .add(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.gameRenderer.getMainCamera().position());
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(PoseStack var1) {
      Entity var2 = Minecraft.getInstance().getCameraEntity();
      if (var2 instanceof AbstractClientPlayer) {
         float var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.getDeltaTracker().getGameTimeDeltaPartialTick(true);
         double var4 = (((AbstractClientPlayer)var2).tickCount + var3) * 0.5;
         double var6 = 0.0;
         var1.translate(Math.sin(var4 * Math.PI) * var6 * 0.5, -Math.abs(Math.cos(var4 * Math.PI) * var6), 0.0);
         var1.mulPose((Quaternionfc)Axis.ZP.rotationDegrees((float)(Math.sin(var4 * Math.PI) * var6 * 3.0)));
         var1.mulPose((Quaternionfc)Axis.XP.rotationDegrees((float)(Math.abs(Math.cos(var4 * Math.PI - 0.2) * var6) * 5.0)));
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, long var7, @NotNull Color var9
   ) {
      var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var7;
      long var10 = var7 ^ 14243223377715L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(14128, 4427513099885192366L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(23527, 1472475371326490748L ^ var7)
      );
      NVGRenderer.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2, var3, var4, var5, var9.getColorAsInt(), var10, var6
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, float var3, float var4, float var5, float var6, float var7, @NotNull Color var8
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var9 = var1 ^ 76034652812139L;
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257031103742500150L ^ var1)
      );
      NVGRenderer.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, var4, var5, var6, var8.getColorAsInt(), var9, var7
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, VertexConsumer var3, Matrix4f var4, float var5, float var6, float var7, float var8, float var9, Color var10
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1807243184927509349L, var1
      );
      int var12 = Math.max(16, (int)(var7 * 1.5F));
      int[] var11 = var10000;
      float var13 = var9 / var12;
      int var14 = var10.getColorAsInt();
      int var15 = 0;

      while (var15 < var12) {
         double var16 = Math.toRadians(var8 + var15 * var13);
         double var18 = Math.toRadians(var8 + (var15 + 1) * var13);
         float var20 = (float)(Math.cos(var16) * var7);
         float var21 = (float)(Math.sin(var16) * var7);
         float var22 = (float)(Math.cos(var18) * var7);
         float var23 = (float)(Math.sin(var18) * var7);
         var3.addVertex((Matrix4fc)var4, var5, var6, 0.0F).setColor(var14);
         var3.addVertex((Matrix4fc)var4, var5 + var20, var6 + var21, 0.0F).setColor(var14);
         var3.addVertex((Matrix4fc)var4, var5 + var22, var6 + var23, 0.0F).setColor(var14);
         var15++;
         if (var11 == null) {
            break;
         }
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, long var2, float var4, float var5, float var6, @NotNull Color var7
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var8 = (var2 ^ 125560523592568L) >>> 8;
      int var10 = (int)((var2 ^ 125560523592568L) << 56 >>> 56);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328320274038158286L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256999645454119905L ^ var2)
      );
      NVGRenderer.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var8, var4, var5, var6, (byte)var10, var7.getColorAsInt()
      );
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, long var3, float var5, float var6, float var7, float var8, @NotNull Color var9
   ) {
      var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var3;
      long var10 = var3 ^ 41382092683657L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328340955477782042L ^ var3)
      );
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1173550554712212025L, var3
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257056069612006965L ^ var3)
      );
      int[] var12 = var10000;
      int var13 = 0;

      GuiGraphicsExtractor var10001;
      float var10002;
      float var10003;
      float var10004;
      float var10005;
      while (true) {
         if (var13 < 5) {
            float var14 = var9.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI();
            float var15 = var9.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl();
            float var16 = var9.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
            float var17 = var9.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() * (1.0F / (var13 + 1));
            Color var18 = new Color(var14, var15, var16, var17);

            try {
               var21 = this;
               var10001 = var1;
               var10002 = var2 - var13;
               var10003 = var5 - var13;
               var10004 = var6 + 2 * var13;
               var10005 = var7;
               if (var12 == null) {
                  break;
               }

               this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  var1, var10002, var10003, var10004, var7 + 2 * var13, var8 + var13, var10, var18
               );
               var13++;
               if (var12 != null) {
                  continue;
               }
            } catch (MatchException var19) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var19, 1335878880463273949L, var3
               );
            }
         }

         var21 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var5;
         var10004 = var6;
         var10005 = var7;
         break;
      }

      var21.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var10001, var10002, var10003, var10004, var10005, var8, var10, var9
      );
   }

   @JvmOverloads
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull GuiGraphicsExtractor var3, float var4, float var5, float var6, float var7, float var8, @NotNull Color var9, float var10
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var10001 = var1 ^ 82952910749356L;
      int var11 = (int)((var1 ^ 82952910749356L) >>> 48);
      int var12 = (int)((var1 ^ 82952910749356L) << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328356978345633761L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257037381592164302L ^ var1)
      );
      NVGRenderer.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         (char)var11, var4, var5, var12, var6, var13, var7, var10, var9.getColorAsInt(), var8
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, long var2, @NotNull ItemStack var4, short var5, float var6, float var7
   ) {
      long var8 = (var2 << 16 | (long)var5 << 48 >>> 48) ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328398431813333741L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(16795, 5541410489358031272L ^ var8)
      );
      var1.item(var4, (int)var6, (int)var7);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      VertexConsumer var1, Matrix4f var2, float var3, float var4, long var5, float var7, float var8, float var9, Color var10
   ) {
      var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var5;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1983850761619933688L, var5
      );
      int var12 = Math.max(16, (int)(var7 * 1.5F));
      float var13 = var9 / var12;
      int var14 = var10.getColorAsInt();
      int var15 = 0;
      int[] var11 = var10000;

      while (var15 < var12) {
         double var16 = Math.toRadians(var8 + var15 * var13);
         double var18 = Math.toRadians(var8 + (var15 + 1) * var13);
         float var20 = (float)(Math.cos(var16) * var7);
         float var21 = (float)(Math.sin(var16) * var7);
         float var22 = (float)(Math.cos(var18) * var7);
         float var23 = (float)(Math.sin(var18) * var7);
         var1.addVertex((Matrix4fc)var2, var3, var4, 0.0F).setColor(var14);
         var1.addVertex((Matrix4fc)var2, var3 + var20, var4 + var21, 0.0F).setColor(var14);
         var1.addVertex((Matrix4fc)var2, var3 + var22, var4 + var23, 0.0F).setColor(var14);
         var15++;
         if (var11 == null) {
            break;
         }
      }

      Color var32 = new Color(
         var10.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var10.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var10.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(),
         0.0F
      );
      int var33 = var32.getColorAsInt();
      float var17 = 1.5F;
      int var34 = 0;

      while (var34 < var12) {
         double var19 = Math.toRadians(var8 + var34 * var13);
         double var35 = Math.toRadians(var8 + (var34 + 1) * var13);
         float var36 = var3 + (float)(Math.cos(var19) * var7);
         float var24 = var4 + (float)(Math.sin(var19) * var7);
         float var25 = var3 + (float)(Math.cos(var35) * var7);
         float var26 = var4 + (float)(Math.sin(var35) * var7);
         float var27 = var3 + (float)(Math.cos(var19) * (var7 + var17));
         float var28 = var4 + (float)(Math.sin(var19) * (var7 + var17));
         float var29 = var3 + (float)(Math.cos(var35) * (var7 + var17));
         float var30 = var4 + (float)(Math.sin(var35) * (var7 + var17));
         var1.addVertex((Matrix4fc)var2, var36, var24, 0.0F).setColor(var14);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var33);
         var1.addVertex((Matrix4fc)var2, var25, var26, 0.0F).setColor(var14);
         var1.addVertex((Matrix4fc)var2, var25, var26, 0.0F).setColor(var14);
         var1.addVertex((Matrix4fc)var2, var27, var28, 0.0F).setColor(var33);
         var1.addVertex((Matrix4fc)var2, var29, var30, 0.0F).setColor(var33);
         var34++;
         if (var11 == null) {
            break;
         }
      }
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, VertexConsumer var2, Matrix4f var3, float var4, float var5, float var6, float var7, float var8, Color var9, float var10, long var11
   ) {
      long var13 = ((long)var1 << 32 | var11 << 32 >>> 32) ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      int var16 = Math.max(16, (int)(var6 * 1.5F));
      float var17 = var8 / var16;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4148120287046446049L, var13
      );
      int var18 = var9.getColorAsInt();
      Color var19 = new Color(
         var9.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(),
         var9.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(),
         var9.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(),
         0.0F
      );
      int var20 = var19.getColorAsInt();
      float var21 = var10 / 2;
      float var22 = 1.5F;
      int[] var15 = var10000;
      int var23 = 0;

      while (var23 < var16) {
         double var24 = Math.toRadians(var7 + var23 * var17);
         double var26 = Math.toRadians(var7 + (var23 + 1) * var17);
         float var28 = (float)Math.cos(var24);
         float var29 = (float)Math.sin(var24);
         float var30 = (float)Math.cos(var26);
         float var31 = (float)Math.sin(var26);
         float var32 = var4 + var28 * (var6 - var21);
         float var33 = var5 + var29 * (var6 - var21);
         float var34 = var4 + var30 * (var6 - var21);
         float var35 = var5 + var31 * (var6 - var21);
         float var36 = var4 + var28 * (var6 + var21);
         float var37 = var5 + var29 * (var6 + var21);
         float var38 = var4 + var30 * (var6 + var21);
         float var39 = var5 + var31 * (var6 + var21);
         var2.addVertex((Matrix4fc)var3, var32, var33, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var36, var37, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var34, var35, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var34, var35, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var36, var37, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var38, var39, 0.0F).setColor(var18);
         float var40 = var4 + var28 * (var6 - var21 - var22);
         float var41 = var5 + var29 * (var6 - var21 - var22);
         float var42 = var4 + var30 * (var6 - var21 - var22);
         float var43 = var5 + var31 * (var6 - var21 - var22);
         float var44 = var4 + var28 * (var6 + var21 + var22);
         float var45 = var5 + var29 * (var6 + var21 + var22);
         float var46 = var4 + var30 * (var6 + var21 + var22);
         float var47 = var5 + var31 * (var6 + var21 + var22);
         var2.addVertex((Matrix4fc)var3, var40, var41, 0.0F).setColor(var20);
         var2.addVertex((Matrix4fc)var3, var32, var33, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var42, var43, 0.0F).setColor(var20);
         var2.addVertex((Matrix4fc)var3, var42, var43, 0.0F).setColor(var20);
         var2.addVertex((Matrix4fc)var3, var32, var33, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var34, var35, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var36, var37, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var44, var45, 0.0F).setColor(var20);
         var2.addVertex((Matrix4fc)var3, var38, var39, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var38, var39, 0.0F).setColor(var18);
         var2.addVertex((Matrix4fc)var3, var44, var45, 0.0F).setColor(var20);
         var2.addVertex((Matrix4fc)var3, var46, var47, 0.0F).setColor(var20);
         var23++;
         if (var15 == null) {
            break;
         }
      }
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      VertexConsumer param1,
      Matrix4f param2,
      float param3,
      int param4,
      float param5,
      float param6,
      short param7,
      float param8,
      Color param9,
      float param10,
      short param11,
      boolean param12
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      char var1, VertexConsumer var2, Matrix4f var3, float var4, float var5, int var6, float var7, float var8, char var9, float var10, Color var11
   ) {
      long var12 = ((long)var1 << 48 | (long)var6 << 32 >>> 16 | (long)var9 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      float var15 = var10 / var7;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1329497503874514947L, var12
      );
      int var16 = var11.getColorAsInt();
      int var17 = 0;
      int var18 = (int)var7;
      int[] var14 = var10000;

      while (var17 < var18) {
         double var19 = Math.toRadians(var8 + var17 * var15);
         double var21 = Math.toRadians(var8 + (var17 + 1) * var15);
         float var23 = (float)(Math.cos(var19) * var7);
         float var24 = (float)(Math.sin(var19) * var7);
         float var25 = (float)(Math.cos(var21) * var7);
         float var26 = (float)(Math.sin(var21) * var7);
         var2.addVertex((Matrix4fc)var3, var4, var5, 0.0F).setColor(var16);
         var2.addVertex((Matrix4fc)var3, var4 + var23, var5 + var24, 0.0F).setColor(var16);
         var2.addVertex((Matrix4fc)var3, var4 + var25, var5 + var26, 0.0F).setColor(var16);
         var17++;
         if (var14 == null) {
            break;
         }
      }
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      int var1, VertexConsumer var2, Matrix4f var3, short var4, float var5, float var6, float var7, float var8, short var9, float var10, Color var11
   ) {
      long var12 = ((long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var9 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      float var15 = var10 / var7;
      int var16 = var11.getColorAsInt();
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -9007670198509367154L, var12
      );
      int var17 = 0;
      int var18 = (int)var7;
      int[] var14 = var10000;

      while (var17 < var18) {
         double var19 = Math.toRadians(var8 + var17 * var15);
         float var21 = (float)(Math.cos(var19) * var7);
         float var22 = (float)(Math.sin(var19) * var7);
         var2.addVertex((Matrix4fc)var3, var5 + var21, var6 + var22, 0.0F).setColor(var16);
         var17++;
         if (var14 == null) {
            break;
         }
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, long var3, float var5, float var6, float var7, float var8, float var9, @NotNull Color var10
   ) {
      var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var3;
      long var11 = var3 ^ 12389417299579L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328439987239708488L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(8274, 2161238624424553926L ^ var3)
      );
      float var13 = var6 - var2;
      float var14 = var7 - var5;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var1, var2, var5, var13, var14, var8, var10, var9);
   }

   @JvmOverloads
   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, long var6, float var8, @NotNull Color var9, float var10
   ) {
      var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var6;
      long var11 = var6 ^ 62901068117644L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328363399953129759L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257042229899157808L ^ var6)
      );
      Color var13 = var9.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var3, var4, var5, var8, var11, var13);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, float var3, float var4, long var5, float var7, @NotNull Color var8, float var9
   ) {
      var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var5;
      long var10 = var5 ^ 40104641635355L;
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256994459880609791L ^ var5)
      );
      Color var12 = var8.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var1, var2, var3, var4, var7, var12);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, long var8, float var10
   ) {
      var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var8;
      long var11 = var8 ^ 17801527692576L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328421901317440237L ^ var8)
      );
      Color var13 = new Color(var7);
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var2, var3, var4, var5, var11, var6, var13, var10);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, float var3, float var4, float var5, float var6, float var7, int var8, float var9
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var10 = var1 ^ 46189253383021L;
      Color var12 = new Color(var8);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var5, var6, var10, var7, var12, var9);
   }

   @JvmOverloads
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, int var2, int var3, long var4, int var6, int var7, float var8, @NotNull Color var9, float var10
   ) {
      var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var4;
      long var11 = var4 ^ 70622153915614L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328369161212637971L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257049577075929916L ^ var4)
      );
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var1, (float)var2, (float)var3, (float)var6, (float)var7, var11, var8, var9, var10
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, long var2, float var4, float var5, float var6, float var7, float var8, int var9
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var10 = var2 ^ 101994519026954L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328339235165393607L ^ var2)
      );
      Color var12 = new Color(var9);
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var4, var5, var6, var7, var10, var8, var12, 1.0F);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, long var8, int var10, int var11, int var12
   ) {
      var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var8;
      long var13 = var8 ^ 109946889733166L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328333684764478435L ^ var8)
      );
      Color var15 = new Color(var7, var10, var11, var12);
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var2, var3, var4, var5, var13, var6, var15, 1.0F);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, int var7, long var8, int var10, int var11, float var12
   ) {
      var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var8;
      long var13 = var8 ^ 123651353630662L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328316602299340811L ^ var8)
      );
      Color var15 = new Color(var7, var10, var11, (int)(255 * var12));
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var2, var3, var4, var5, var13, var6, var15, 1.0F);
   }

   @JvmOverloads
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, long var7, @NotNull Color var9, float var10
   ) {
      var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var7;
      long var11 = var7 ^ 12559421087045L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328440087819375734L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256978735705822297L ^ var7)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var1, var2, var3, var4, var5, var6, var9, var10);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, long var6, @NotNull Color var8
   ) {
      var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var6;
      long var9 = var6 ^ 38201819779725L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328397012349754302L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256936204352871313L ^ var6)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var1, var2, var3, var4, var5, 4.0F, var8, 1.0F);
   }

   @JvmOverloads
   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, long var5, int var7, float var8, @NotNull Color var9, float var10
   ) {
      var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var5;
      long var11 = var5 ^ 48143921096746L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328404239094472985L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256943977903071542L ^ var5)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var1, var2, var3, var4, var7, var8, var9, var10);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, long var3, float var5, float var6, float var7, float var8, float var9, int var10
   ) {
      var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var3;
      long var11 = var3 ^ 77259242464840L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328357523014168443L ^ var3)
      );
      Color var13 = new Color(var10);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var1, var2, var5, var6, var7, var8, var13, var9);
   }

   @JvmOverloads
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, char var2, @NotNull GuiGraphicsExtractor var3, float var4, short var5, float var6, float var7, float var8, @NotNull Color var9, float var10
   ) {
      long var11 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var5 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var13 = var11 ^ 125438451641953L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328312075543237834L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257027740506658021L ^ var11)
      );
      NVGRenderer.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         var4, var6, var7, var7, var13, var8, var9.getColorAsInt(), var10
      );
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @Nullable GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, long var7, @NotNull Color var9, float var10
   ) {
      var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var7;
      long var11 = var7 ^ 86364256125588L;
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257040278261938192L ^ var7)
      );
      NVGRenderer.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         var2, var3, var4, var5, var11, var6, var9.getColorAsInt(), var10
      );
   }

   @JvmOverloads
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, long var7, @NotNull Color var9
   ) {
      var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var7;
      long var10 = var7 ^ 40587337327808L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328311593808109701L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257025608159649962L ^ var7)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this, var1, var2, var3, var4, var5, var6, var9, 0.0F, 128, var10, null
      );
   }

   @JvmOverloads
   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6, @NotNull Color var7, long var8
   ) {
      var8 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var8;
      long var10 = var8 ^ 35452327786446L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328302390368237226L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257017496984139397L ^ var8)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         this, var1, var2, var3, var4, var5, var6, var7, 0.0F, 128, var10, null
      );
   }

   @JvmOverloads
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, float var6, long var7, @NotNull Color var9, char var10
   ) {
      long var11 = (var7 << 16 | (long)var10 << 48 >>> 48) ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var13 = var11 ^ 53906271345638L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328358127403066861L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257038603397572034L ^ var11)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this, var1, var2, var3, var13, var4, var5, var6, var9, 0.0F, 128, null
      );
   }

   @JvmOverloads
   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, long var4, float var6, float var7, float var8, @NotNull Color var9
   ) {
      var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var4;
      long var10001 = var4 ^ 82634633317716L;
      int var10 = (int)((var4 ^ 82634633317716L) >>> 32);
      int var11 = (int)((var4 ^ 82634633317716L) << 32 >>> 56);
      int var12 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328313534238478339L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257028102878597164L ^ var4)
      );
      IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         this, var1, var2, var3, var6, var7, var10, var8, var9, (byte)var11, var12, 0.0F, 128, null
      );
   }

   @JvmOverloads
   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull GuiGraphicsExtractor var1, long var2, int var4, int var5, int var6, int var7, float var8, @NotNull Color var9
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var10001 = var2 ^ 137074205152794L;
      int var10 = (int)((var2 ^ 137074205152794L) >>> 48);
      int var11 = (int)((var2 ^ 137074205152794L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328437038968841013L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8256975067304059674L ^ var2)
      );
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         this, var1, var4, var5, var6, (short)var10, var7, var8, var11, var9, (char)var12, 0.0F, 128, null
      );
   }

   @JvmOverloads
   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, @NotNull Color var6, long var7
   ) {
      var7 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var7;
      long var9 = var7 ^ 91105898035209L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10973, 3328346983698162215L ^ var7)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27382, 8257060999392502280L ^ var7)
      );
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this, var1, var2, var3, var4, var5, var9, var6, 0.0F, 64, null);
   }

   static {
      long var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 104473179530271L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\u0014\u0088\"=/:gQÐ\u0080}Ûd\u0087ÐJ\u0086Ô}'Ò½ÿ( ®?6¹Îü/ysKÎÛ¯k,\u0010Mz¯\u0081§uÀ\u0015Óhe\u0001àÐy³\u0010Ø¨\u0089hDñ,0\u0083h\u001fÅo%5Å\u0018¥\u0019\u0084WÈ9øÎk^Ùä¦\u0091çe\u009bÈ¬xÔ\u000b6\u000e0û¦W~0l\u000eY±\u0081úÓô\u0000\u001cYÙÿ4kQ1\u0002ºöbÅ?Yg\u0080\\_\u000bÚe*»&![d\u008f\u0097<ÈÆð";
      int var6 = "\u0014\u0088\"=/:gQÐ\u0080}Ûd\u0087ÐJ\u0086Ô}'Ò½ÿ( ®?6¹Îü/ysKÎÛ¯k,\u0010Mz¯\u0081§uÀ\u0015Óhe\u0001àÐy³\u0010Ø¨\u0089hDñ,0\u0083h\u001fÅo%5Å\u0018¥\u0019\u0084WÈ9øÎk^Ùä¦\u0091çe\u009bÈ¬xÔ\u000b6\u000e0û¦W~0l\u000eY±\u0081úÓô\u0000\u001cYÙÿ4kQ1\u0002ºöbÅ?Yg\u0080\\_\u000bÚe*»&![d\u008f\u0097<ÈÆð"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "\u008e\u0084\u0087î Q\"\u0005\u0016Bqö\u001b\u0011\u0007s\u0010u\u008bQD©\u00163Û\u0086½:\u0004V\u000bT\u008c";
            var6 = "\u008e\u0084\u0087î Q\"\u0005\u0016Bqö\u001b\u0011\u0007s\u0010u\u008bQD©\u00163Û\u0086½:\u0004V\u000bT\u008c".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var7;
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[7];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll();
                  Minecraft var18 = Minecraft.getInstance();
                  Intrinsics.checkNotNullExpressionValue(var18, "getInstance(...)");
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var18;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5446;
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
               "me/octo/client/utils/render/shapes/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll", var10
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
            "me/octo/client/utils/render/shapes/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
