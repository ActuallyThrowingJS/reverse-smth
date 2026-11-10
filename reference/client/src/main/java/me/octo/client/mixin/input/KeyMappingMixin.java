package me.octo.client.mixin.input;

import com.mojang.blaze3d.platform.InputConstants.Key;
import com.mojang.blaze3d.platform.InputConstants.Type;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.input.ClickEvent;
import net.minecraft.client.KeyMapping;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyMapping.class)
public class KeyMappingMixin {
   @Inject(method = "click", at = @At("HEAD"))
   private static void onKeyPressed(Key var0, CallbackInfo var1) {
      if (var0.getType() == Type.MOUSE) {
         int var2 = var0.getValue();
         if (var2 == 0) {
            PolinexAccessor.INSTANCE.eventBus.post(new ClickEvent(true));
         } else if (var2 == 1) {
            PolinexAccessor.INSTANCE.eventBus.post(new ClickEvent(false));
         }
      }
   }
}
