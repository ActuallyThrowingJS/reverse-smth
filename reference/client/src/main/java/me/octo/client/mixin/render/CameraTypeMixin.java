package me.octo.client.mixin.render;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.CameraTypeChangeEvent;
import net.minecraft.client.CameraType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CameraType.class)
public class CameraTypeMixin {
   @Inject(method = "cycle", at = @At("HEAD"), cancellable = true)
   public void cycleCameraType(CallbackInfoReturnable<CameraType> var1) {
      CameraType var2 = (CameraType)this;
      CameraTypeChangeEvent var3 = new CameraTypeChangeEvent(CameraType.values()[(var2.ordinal() + 1) % CameraType.values().length]);
      if (PolinexAccessor.INSTANCE.eventBus.post(var3)) {
         var1.setReturnValue(var3.cameraType);
      }
   }
}
