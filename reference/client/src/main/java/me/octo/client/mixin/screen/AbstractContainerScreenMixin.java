package me.octo.client.mixin.screen;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.utils.render.SlotHighlightUtils;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public class AbstractContainerScreenMixin<T extends AbstractContainerMenu> extends ScreenMixin {
   @Shadow
   @Final
   protected T menu;

   @Inject(method = "extractRenderState", at = @At("TAIL"))
   public void onRender(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this instanceof ContainerScreen var6) {
         NonNullList var7 = ((ChestMenu)var6.getMenu()).slots;
         Component var8 = var6.getTitle();
         PolinexAccessor.INSTANCE.eventBus.post(new ChestBackgroundDrawnEvent(var8.getString(), var7.size(), var7));
         SlotHighlightUtils.INSTANCE.drawHighlights(var1, (AbstractContainerScreen<?>)this);
      }
   }
}
