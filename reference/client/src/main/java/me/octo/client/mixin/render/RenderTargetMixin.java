package me.octo.client.mixin.render;

import com.mojang.blaze3d.pipeline.RenderTarget;
import me.octo.client.utils.ModUtils;
import me.octo.client.utils.render.PictureInPictureManager;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderTarget.class)
public class RenderTargetMixin {
   @Inject(method = "blitToScreen", at = @At("HEAD"), cancellable = true)
   private void onBlitToScreen(CallbackInfo var1) {
      if (PictureInPictureManager.INSTANCE.shouldBlackOutMain()) {
         RenderTarget var2 = (RenderTarget)this;
         if (var2 == ModUtils.mc.getMainRenderTarget()) {
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glClear(16640);
            var1.cancel();
         }
      }
   }
}
