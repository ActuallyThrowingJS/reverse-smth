package me.octo.client.mixin.render;

import me.octo.client.modules.impl.features.visuals.StretchedRes;
import net.minecraft.client.renderer.GameRenderer;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(GameRenderer.class)
public abstract class GameRendererStretchMixin {
   @ModifyArg(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ProjectionMatrixBuffer;getBuffer(Lorg/joml/Matrix4f;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"
      )
   )
   private Matrix4f polinex$stretchProjection(Matrix4f var1) {
      if (!StretchedRes.shouldApply()) {
         return var1;
      } else {
         float var2 = StretchedRes.INSTANCE.calculateHorizontalScale();
         return new Matrix4f(var1).scale(var2, 1.0F, 1.0F);
      }
   }
}
