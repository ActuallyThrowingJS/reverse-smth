package me.octo.client.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.platform.Window;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.client.ClientFrameEvent;
import me.octo.client.events.impl.game.CrosshairTargetEvent;
import me.octo.client.events.impl.game.GameLoopEvent;
import me.octo.client.events.impl.game.GuiOpenPreEvent;
import me.octo.client.events.impl.game.LegitInputEvent;
import me.octo.client.events.impl.game.MenuRender2DEvent;
import me.octo.client.events.impl.game.RenderTickEvent;
import me.octo.client.events.impl.game.ScreenCloseEvent;
import me.octo.client.events.impl.game.ScreenOpenEvent;
import me.octo.client.events.impl.game.WindowResizeEvent;
import me.octo.client.events.impl.other.ClientInitializeEvent;
import me.octo.client.events.impl.other.ClientShutdownEvent;
import me.octo.client.events.impl.other.PowderCheckEvent;
import me.octo.client.failsafes.prerecorded.Replayer;
import me.octo.client.failsafes.reactions_v2.ReactionSystemV2;
import me.octo.client.gui.breakscreen.SchedulerBreakScreen;
import me.octo.client.gui.mainmenu.CustomMainMenu;
import me.octo.client.modules.helpers.general.Scheduler;
import me.octo.client.modules.impl.features.GeneralModules;
import me.octo.client.modules.impl.features.misc.AutoClicker;
import me.octo.client.modules.impl.features.misc.BackgroundFocus;
import me.octo.client.modules.impl.features.visuals.Camera;
import me.octo.client.modules.manager.ModuleManager;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import net.minecraft.client.gui.screens.PauseScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.inventory.CraftingScreen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {
   @Shadow
   public MultiPlayerGameMode gameMode;
   @Shadow
   public LocalPlayer player;
   @Shadow
   public HitResult hitResult;
   @Shadow
   public ClientLevel level;
   @Shadow
   public int missTime;
   @Shadow
   @Final
   private Window window;
   @Shadow
   public Screen screen;

   @Inject(method = "buildInitialScreens(Lnet/minecraft/client/Minecraft$GameLoadCookie;)Ljava/lang/Runnable;", at = @At("RETURN"))
   private void polinex$onInitFinished(@Coerce Object var1, CallbackInfoReturnable<Runnable> var2) {
      PolinexAccessor.INSTANCE.eventBus.post(ClientInitializeEvent.INSTANCE);
   }

   @Inject(method = "close", at = @At("HEAD"))
   private void onClose(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(ClientShutdownEvent.INSTANCE);
   }

   @Inject(method = "runTick", at = @At("HEAD"))
   public void onRender(boolean var1, CallbackInfo var2) {
      PolinexAccessor.INSTANCE.eventBus.post(new RenderTickEvent());
   }

   @Inject(method = "runTick", at = @At("TAIL"))
   public void onRenderTail(boolean var1, CallbackInfo var2) {
      Minecraft var3 = (Minecraft)this;
      if (var3.player == null) {
         PolinexAccessor.INSTANCE.eventBus.post(new MenuRender2DEvent(null, 0, 0, 0.0F));
      }
   }

   @Inject(method = "runTick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/MouseHandler;handleAccumulatedMovement()V"))
   private void onMouseTick(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(ClientFrameEvent.INSTANCE);
   }

   @Inject(method = "runTick", at = @At("HEAD"))
   private void onBeginFrame(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(GameLoopEvent.INSTANCE);
   }

   @Inject(method = "resizeGui", at = @At("TAIL"))
   private void onResize(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(new WindowResizeEvent(this.window.getWidth(), this.window.getHeight()));
   }

   @Inject(method = "handleKeybinds", at = @At(value = "TAIL", shift = Shift.BEFORE))
   private void onHandleInputEvents(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(new LegitInputEvent());
   }

   @ModifyExpressionValue(
      method = "handleKeybinds",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;screen:Lnet/minecraft/client/gui/screens/Screen;")
   )
   private Screen polinex$ignoreChatScreenForMacroClicks(Screen var1) {
      return var1 instanceof ChatScreen && ModuleManager.macroModuleActive ? null : var1;
   }

   @Inject(method = "createTitle", at = @At("HEAD"), cancellable = true)
   public void modifyWindowTitle(CallbackInfoReturnable<String> var1) {
      var1.setReturnValue("Polinex Fabric");
   }

   @Inject(method = "startAttack", at = @At("HEAD"), cancellable = true)
   private void leftClickMouse(CallbackInfoReturnable<Boolean> var1) {
      if (this.missTime <= 0 || AutoClicker.INSTANCE.isToggled()) {
         if (this.hitResult == null) {
            if (!this.gameMode.isDestroying() && !AutoClicker.holdingMouse) {
               this.missTime = 10;
            }
         } else {
            switch (<unrepresentable>.$SwitchMap$net$minecraft$world$phys$HitResult$Type[this.hitResult.getType().ordinal()]) {
               case 1:
                  this.gameMode.attack(this.player, ((EntityHitResult)this.hitResult).getEntity());
                  break;
               case 2:
                  BlockPos var2 = ((BlockHitResult)this.hitResult).getBlockPos();
                  if (!this.level.getBlockState(var2).isAir()) {
                     this.gameMode.startDestroyBlock(var2, ((BlockHitResult)this.hitResult).getDirection());
                     break;
                  }
               case 3:
               default:
                  if (!this.gameMode.isDestroying() && !AutoClicker.holdingMouse) {
                     this.missTime = 10;
                  }
            }

            this.player.swing(InteractionHand.MAIN_HAND);
         }
      }

      var1.setReturnValue(false);
   }

   @Inject(method = "pick(F)V", at = @At("HEAD"), cancellable = true)
   private void polinex$onPick(float var1, CallbackInfo var2) {
      CrosshairTargetEvent var3 = new CrosshairTargetEvent();
      PolinexAccessor.INSTANCE.eventBus.post(var3);
      if (var3.isCanceled()) {
         var2.cancel();
      }
   }

   @Inject(method = "isPaused", at = @At("HEAD"), cancellable = true)
   private void isPaused(CallbackInfoReturnable<Boolean> var1) {
      if (ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing || BackgroundFocus.INSTANCE.isToggled()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(method = "isWindowActive", at = @At("HEAD"), cancellable = true)
   private void isWindowFocused(CallbackInfoReturnable<Boolean> var1) {
      if (ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing || BackgroundFocus.INSTANCE.isToggled()) {
         var1.setReturnValue(true);
      }
   }

   @Inject(method = "setScreen", at = @At("HEAD"), cancellable = true)
   private void polinex$blockPauseDuringMacro(Screen var1, CallbackInfo var2) {
      if ((ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing) && var1 instanceof PauseScreen) {
         var2.cancel();
      }
   }

   @ModifyVariable(method = "setScreen", at = @At("HEAD"), argsOnly = true)
   private Screen replaceMainMenu(Screen var1) {
      if (var1 instanceof TitleScreen && GeneralModules.Companion.getCustomMainMenu().isToggled()) {
         return new CustomMainMenu();
      } else {
         return (Screen)(var1 instanceof DisconnectedScreen && Scheduler.isOnBreak() && GeneralModules.Companion.getCustomBreakScreen().isToggled()
            ? new SchedulerBreakScreen(false)
            : var1);
      }
   }

   @Inject(method = "setScreen", at = @At("HEAD"))
   private void onSetScreen(Screen var1, CallbackInfo var2) {
      Minecraft var3 = (Minecraft)this;
      Screen var4 = var3.screen;
      if (var4 != null && var1 != var4) {
         PolinexAccessor.INSTANCE.eventBus.post(new ScreenCloseEvent());
      }

      if (var1 instanceof CraftingScreen && ModuleManager.macroModuleActive) {
         PolinexAccessor.INSTANCE.eventBus.post(new PowderCheckEvent());
      }

      if (var1 != null && PolinexAccessor.INSTANCE.eventBus.post(new GuiOpenPreEvent())) {
         var2.cancel();
      }

      String var5 = var1 != null ? var1.getClass().getSimpleName() : "null";
      PolinexAccessor.INSTANCE.eventBus.post(new ScreenOpenEvent(var1, var5));
   }

   @Inject(
      method = "handleKeybinds",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Options;setCameraType(Lnet/minecraft/client/CameraType;)V", shift = Shift.BEFORE)
   )
   private void onPerspectiveChange(CallbackInfo var1) {
      Minecraft var2 = (Minecraft)this;
      if (Camera.INSTANCE.isToggled() && Camera.getSmoothF5().isToggled()) {
         CameraType var3 = var2.options.getCameraType();
         if (var3.isFirstPerson()) {
            Camera.INSTANCE.setupSmoothCamera();
         }
      }
   }
}
