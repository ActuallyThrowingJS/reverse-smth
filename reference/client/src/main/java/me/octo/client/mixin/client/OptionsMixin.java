package me.octo.client.mixin.client;

import me.octo.client.modules.impl.features.visuals.NoRender;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Options.class)
public class OptionsMixin {
   @Inject(method = "getEffectiveRenderDistance", at = @At("HEAD"), cancellable = true)
   private void getEffectiveRenderDistance(CallbackInfoReturnable<Integer> var1) {
      if (NoRender.INSTANCE.shouldForceRenderDistance()) {
         var1.setReturnValue(NoRender.INSTANCE.getForcedRenderDistanceChunks());
      }
   }
}
