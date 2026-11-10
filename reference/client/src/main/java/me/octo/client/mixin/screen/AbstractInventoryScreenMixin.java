package me.octo.client.mixin.screen;

import me.octo.client.modules.impl.features.visuals.EffectsDisplayRemover;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.EffectsInInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EffectsInInventory.class)
public class AbstractInventoryScreenMixin {
   @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true)
   private void onDrawStatusEffects(GuiGraphicsExtractor var1, int var2, int var3, CallbackInfo var4) {
      if (EffectsDisplayRemover.INSTANCE.isToggled()) {
         var4.cancel();
      }
   }
}
