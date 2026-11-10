package me.octo.client.mixin.input;

import com.mojang.blaze3d.Blaze3D;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.input.MouseButtonEvent;
import me.octo.client.events.impl.input.MouseScrollEvent;
import me.octo.client.modules.helpers.parser.ItemParser;
import me.octo.client.modules.impl.features.misc.Freecam;
import me.octo.client.modules.impl.features.misc.NoCursorReset;
import me.octo.client.modules.impl.features.visuals.Freelook;
import me.octo.client.modules.manager.MacroPauseManager;
import me.octo.client.modules.manager.ModuleManager;
import me.octo.client.utils.ModUtils;
import me.octo.client.utils.client.GlobalInputManager;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.client.input.MouseButtonInfo;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public abstract class MouseHandlerMixin {
   @Shadow
   private double accumulatedDX;
   @Shadow
   private double accumulatedDY;
   @Shadow
   private double xpos;
   @Shadow
   private double ypos;
   @Shadow
   private double lastHandleMovementTime;
   @Unique
   private double beforeX;
   @Unique
   private double beforeY;

   @Inject(method = "handleAccumulatedMovement", at = @At("HEAD"), cancellable = true)
   private void polinex$freecamMouseLook(CallbackInfo var1) {
      if (Freecam.INSTANCE.isSimulationActive() && ModUtils.mc.screen == null) {
         this.lastHandleMovementTime = Blaze3D.getTime();
         Freecam.INSTANCE.turnCameraFromMouse(this.accumulatedDX, this.accumulatedDY);
         this.accumulatedDX = 0.0;
         this.accumulatedDY = 0.0;
         var1.cancel();
      }
   }

   @Inject(method = "onButton", at = @At("HEAD"), cancellable = true)
   private void onMouseButton(long var1, MouseButtonInfo var3, int var4, CallbackInfo var5) {
      MouseButtonEvent var6 = new MouseButtonEvent(var3.button(), var4, var3.modifiers());
      PolinexAccessor.INSTANCE.eventBus.post(var6);
      GlobalInputManager.INSTANCE.onMouseButton(var3.button(), var4, var3.modifiers());
      if (Freecam.INSTANCE.shouldBlockMovementMouse(var3.button())) {
         Freecam.INSTANCE.clearMovementInput();
         var5.cancel();
      } else if ((!ModuleManager.macroModuleActive || MacroPauseManager.INSTANCE.isPaused() || ModUtils.mc.screen != null) && !ItemParser.INSTANCE.isFetching()
         )
       {
         if (var6.isCanceled()) {
            var5.cancel();
         }
      } else {
         var5.cancel();
      }
   }

   @Inject(method = "onScroll", at = @At("HEAD"), cancellable = true)
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      MouseScrollEvent var8 = new MouseScrollEvent(var5, var3);
      PolinexAccessor.INSTANCE.eventBus.post(var8);
      Freelook var9 = Freelook.INSTANCE;
      if (var9.isPlayerMode() && var5 != 0.0 && ModUtils.mc.screen == null) {
         var9.adjustDistance(var5);
         var7.cancel();
      } else if ((!ModuleManager.macroModuleActive || MacroPauseManager.INSTANCE.isPaused() || ModUtils.mc.screen != null) && !ItemParser.INSTANCE.isFetching()
         )
       {
         if (var8.isCanceled()) {
            var7.cancel();
         }
      } else {
         var7.cancel();
      }
   }

   @Inject(method = "turnPlayer", at = @At("HEAD"), cancellable = true)
   private void onUpdateMouse(double var1, CallbackInfo var3) {
      Freecam var4 = Freecam.INSTANCE;
      if (var4.isSimulationActive()) {
         var4.turnCameraFromMouse(this.accumulatedDX, this.accumulatedDY);
         var3.cancel();
      } else {
         Freelook var5 = Freelook.INSTANCE;
         if (!var5.isPlayerMode() || ModUtils.mc.player == null || this.accumulatedDX == 0.0 && this.accumulatedDY == 0.0) {
            if (ModuleManager.macroModuleActive && !MacroPauseManager.INSTANCE.isPaused()) {
               var3.cancel();
            }
         } else {
            var5.setCameraYaw(var5.getCameraYaw() + (float)(this.accumulatedDX * 0.15));
            var5.setCameraPitch(var5.getCameraPitch() + (float)(this.accumulatedDY * 0.15));
            var5.setCameraPitch(Math.max(-90.0F, Math.min(90.0F, var5.getCameraPitch())));
            var3.cancel();
         }
      }
   }

   @Inject(method = "grabMouse", at = @At(value = "FIELD", target = "Lnet/minecraft/client/MouseHandler;mouseGrabbed:Z", ordinal = 1))
   private void polinex$lockXPos(CallbackInfo var1) {
      this.beforeX = this.xpos;
      this.beforeY = this.ypos;
   }

   @Inject(method = "releaseMouse", at = @At("TAIL"))
   private void polinex$correctCursorPosition(CallbackInfo var1) {
      if (ModUtils.mc.screen instanceof ContainerScreen && NoCursorReset.shouldHookMouse()) {
         GLFW.glfwSetCursorPos(ModUtils.mc.getWindow().handle(), this.beforeX, this.beforeY);
      }
   }
}
