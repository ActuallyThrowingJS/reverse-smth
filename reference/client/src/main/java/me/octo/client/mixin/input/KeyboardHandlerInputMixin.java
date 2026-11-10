package me.octo.client.mixin.input;

import me.octo.client.modules.helpers.parser.ItemParser;
import me.octo.client.modules.impl.features.misc.Freecam;
import me.octo.client.modules.manager.MacroPauseManager;
import me.octo.client.modules.manager.ModuleManager;
import me.octo.client.utils.ModUtils;
import me.octo.client.utils.client.GlobalInputManager;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardHandler.class)
public class KeyboardHandlerInputMixin {
   @Inject(method = "keyPress", at = @At("HEAD"), cancellable = true)
   private void onKeyInput(long var1, int var3, KeyEvent var4, CallbackInfo var5) {
      int var6 = var4.key();
      int var7 = var4.modifiers();
      GlobalInputManager.INSTANCE.onKeyPressed(var6, var3, var7);
      if (Freecam.INSTANCE.shouldBlockMovementKey(var4)) {
         Freecam.INSTANCE.clearMovementInput();
         var5.cancel();
      } else {
         if (ModuleManager.macroModuleActive && !MacroPauseManager.INSTANCE.isPaused() && this.shouldBlockKey(var4) || ItemParser.INSTANCE.isFetching()) {
            var5.cancel();
         }
      }
   }

   @Unique
   private boolean shouldBlockKey(KeyEvent var1) {
      return ModUtils.mc.options != null && ModUtils.mc.screen == null
         ? ModUtils.mc.options.keyUp.matches(var1)
            || ModUtils.mc.options.keyDown.matches(var1)
            || ModUtils.mc.options.keyLeft.matches(var1)
            || ModUtils.mc.options.keyRight.matches(var1)
            || ModUtils.mc.options.keyJump.matches(var1)
            || ModUtils.mc.options.keyShift.matches(var1)
            || ModUtils.mc.options.keySprint.matches(var1)
         : false;
   }
}
