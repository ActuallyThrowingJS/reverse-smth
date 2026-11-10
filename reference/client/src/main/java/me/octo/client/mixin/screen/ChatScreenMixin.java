package me.octo.client.mixin.screen;

import me.octo.client.gui.clickgui.endgameGUI.ThemeColors;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatScreen.class)
public abstract class ChatScreenMixin extends Screen {
   @Shadow
   protected EditBox input;

   protected ChatScreenMixin(Component var1) {
      super(var1);
   }

   @Inject(method = "extractRenderState", at = @At("TAIL"))
   private void renderDotCommandBorder(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      String var6 = this.input.getValue();
      if (var6.startsWith(".")) {
         byte var7 = 2;
         int var8 = this.height - 14;
         int var9 = this.width - 2;
         int var10 = this.height - 2;
         int var11 = ThemeColors.INSTANCE.getAccentCyan().getColorAsInt();
         var1.fill(var7, var8, var9, var8 + 1, var11);
         var1.fill(var7, var10 - 1, var9, var10, var11);
         var1.fill(var7, var8, var7 + 1, var10, var11);
         var1.fill(var9 - 1, var8, var9, var10, var11);
      }
   }
}
