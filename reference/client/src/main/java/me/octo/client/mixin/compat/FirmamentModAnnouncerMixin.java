package me.octo.client.mixin.compat;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(targets = "moe.nea.firmament.features.misc.ModAnnouncer", remap = false)
public class FirmamentModAnnouncerMixin {
   @Inject(method = "onServerJoin", at = @At("HEAD"), cancellable = true, remap = false, require = 0)
   private void polinex$cancelFirmamentModAnnounce(CallbackInfo var1) {
      var1.cancel();
   }
}
