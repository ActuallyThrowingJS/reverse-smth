package me.octo.client.mixin.client;

import net.minecraft.SharedConstants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SharedConstants.class)
public class SharedConstantsMixin {
   @Inject(method = "getCurrentVersion", at = @At("HEAD"))
   private static void ensureGameVersionExists(CallbackInfoReturnable<?> var0) {
      SharedConstants.tryDetectVersion();
   }
}
