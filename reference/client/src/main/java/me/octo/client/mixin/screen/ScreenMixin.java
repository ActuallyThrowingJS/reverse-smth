package me.octo.client.mixin.screen;

import me.octo.client.gui.mainmenu.CustomMainMenu;
import me.octo.client.modules.impl.features.qol.MouseUngrab;
import me.octo.client.modules.manager.MacroPauseManager;
import me.octo.client.modules.manager.ModuleManager;
import me.octo.client.utils.ModUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public abstract class ScreenMixin {
   @Shadow
   @Final
   protected Component title;

   @Inject(method = "extractPanorama", at = @At("HEAD"), cancellable = true)
   private void skipPanorama(GuiGraphicsExtractor var1, float var2, CallbackInfo var3) {
      if (this instanceof TitleScreen || this instanceof CustomMainMenu) {
         var3.cancel();
      }
   }

   @Inject(method = "extractMenuBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIII)V", at = @At("HEAD"), cancellable = true)
   private void skipDarkeningTexture(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      if (this instanceof TitleScreen || this instanceof CustomMainMenu) {
         var6.cancel();
      }
   }

   @Inject(method = "onClose", at = @At("HEAD"))
   public void onClose(CallbackInfo var1) {
      if (ModuleManager.macroModuleActive && !MacroPauseManager.INSTANCE.isPaused() && MouseUngrab.INSTANCE.isToggled()) {
         ModUtils.mc.execute(MouseUngrab::ungrabMouse);
      }
   }

   @Inject(method = "extractRenderStateWithTooltipAndSubtitles", at = @At("TAIL"))
   private void polinex$credit(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this instanceof TitleScreen || this instanceof CustomMainMenu) {
         int var10004 = ((Screen)this).height - ((this instanceof CustomMainMenu) * 40 + 24);
         var1.text(Minecraft.getInstance().font, "Discord: @bfcs.2", 8, var10004, -7232312, true);
      }
   }
}
