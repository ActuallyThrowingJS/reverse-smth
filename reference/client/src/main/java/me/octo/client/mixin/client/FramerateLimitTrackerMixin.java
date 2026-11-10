package me.octo.client.mixin.client;

import com.mojang.blaze3d.platform.FramerateLimitTracker;
import com.mojang.blaze3d.platform.FramerateLimitTracker.FramerateThrottleReason;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FramerateLimitTracker.class)
public class FramerateLimitTrackerMixin {
   @Inject(method = "getThrottleReason", at = @At("HEAD"), cancellable = true)
   private void getLimitReason(CallbackInfoReturnable<FramerateThrottleReason> var1) {
      var1.setReturnValue(FramerateThrottleReason.NONE);
   }
}
