package me.octo.client.mixin.screen;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.game.SignEditDrawnEvent;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class SignEditMixin {
   @Inject(method = "extractRenderState", at = @At("TAIL"))
   public void onRender(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this instanceof AbstractSignEditScreen) {
         PolinexAccessor.INSTANCE.eventBus.post(new SignEditDrawnEvent());
      }
   }
}
