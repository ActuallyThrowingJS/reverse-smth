package me.octo.client.mixin.screen;

import me.octo.client.modules.impl.features.qol.ExploitPreventerModule;
import me.octo.client.utils.security.ExploitPreventerSupport;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.inventory.AnvilScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AnvilScreen.class)
public abstract class AnvilScreenMixin {
   @Shadow
   private EditBox name;

   @Inject(method = "slotChanged", at = @At("TAIL"))
   private void polinex$sanitizeSlotName(AbstractContainerMenu var1, int var2, ItemStack var3, CallbackInfo var4) {
      if (ExploitPreventerModule.shouldSanitizeTranslatedUi() && var2 == 0 && !var3.isEmpty() && this.name != null) {
         this.name.setValue(ExploitPreventerSupport.sanitizeForServerEcho(var3.getHoverName()));
      }
   }

   @Redirect(method = "onNameChanged", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/chat/Component;getString()Ljava/lang/String;"))
   private String polinex$sanitizeComparedName(Component var1) {
      return !ExploitPreventerModule.shouldSanitizeTranslatedUi() ? var1.getString() : ExploitPreventerSupport.sanitizeForServerEcho(var1);
   }
}
