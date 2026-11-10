package me.octo.client.mixin.render;

import me.octo.client.modules.impl.features.visuals.Camera;
import me.octo.client.modules.impl.features.visuals.NoFireAnimations;
import net.minecraft.client.renderer.ScreenEffectRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ScreenEffectRenderer.class)
public class ScreenEffectRendererMixin {
   @Inject(method = "renderFire", at = @At("HEAD"), cancellable = true, require = 0)
   private static void cancelFireOverlay(CallbackInfo var0) {
      if (NoFireAnimations.INSTANCE.isToggled()) {
         var0.cancel();
      }
   }

   @ModifyArgs(
      method = "renderFire",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/VertexConsumer;addVertex(Lorg/joml/Matrix4fc;FFF)Lcom/mojang/blaze3d/vertex/VertexConsumer;"
      )
   )
   private static void modifyFireOverlayPosition(Args var0) {
      if (Camera.INSTANCE.isToggled() && Camera.getLowFire().isToggled()) {
         float var1 = (Float)var0.get(2);
         var0.set(2, var1 - 0.3F);
      }
   }

   @ModifyArgs(
      method = "renderFire",
      require = 0,
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/VertexConsumer;setColor(I)Lcom/mojang/blaze3d/vertex/VertexConsumer;")
   )
   private static void modifyFireOverlayAlpha(Args var0) {
      if (Camera.INSTANCE.isToggled() && Camera.getLowFire().isToggled()) {
         int var1 = (Integer)var0.get(0);
         int var2 = var1 >> 24 & 0xFF;
         var2 = (int)(var2 * 0.5F);
         var0.set(0, var1 & 16777215 | var2 << 24);
      }
   }
}
