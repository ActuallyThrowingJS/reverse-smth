/*
 * Decompiled with CFR 0.152.
 */
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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Minecraft.class})
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

    @Inject(method={"buildInitialScreens(Lnet/minecraft/client/Minecraft$GameLoadCookie;)Ljava/lang/Runnable;"}, at={@At(value="RETURN")})
    private void polinex$onInitFinished(@Coerce Object object, CallbackInfoReturnable<Runnable> callbackInfoReturnable) {
        PolinexAccessor.INSTANCE.eventBus.post(ClientInitializeEvent.INSTANCE);
    }

    @Inject(method={"close"}, at={@At(value="HEAD")})
    private void onClose(CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(ClientShutdownEvent.INSTANCE);
    }

    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    public void onRender(boolean bl, CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(new RenderTickEvent());
    }

    @Inject(method={"runTick"}, at={@At(value="TAIL")})
    public void onRenderTail(boolean bl, CallbackInfo callbackInfo) {
        Minecraft minecraft = (Minecraft)((Object)this);
        if (minecraft.player == null) {
            PolinexAccessor.INSTANCE.eventBus.post(new MenuRender2DEvent(null, 0, 0, Float.valueOf(0.0f)));
        }
    }

    @Inject(method={"runTick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MouseHandler;handleAccumulatedMovement()V")})
    private void onMouseTick(CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(ClientFrameEvent.INSTANCE);
    }

    @Inject(method={"runTick"}, at={@At(value="HEAD")})
    private void onBeginFrame(CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(GameLoopEvent.INSTANCE);
    }

    @Inject(method={"resizeGui"}, at={@At(value="TAIL")})
    private void onResize(CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(new WindowResizeEvent(this.window.getWidth(), this.window.getHeight()));
    }

    @Inject(method={"handleKeybinds"}, at={@At(value="TAIL", shift=At.Shift.BEFORE)})
    private void onHandleInputEvents(CallbackInfo callbackInfo) {
        PolinexAccessor.INSTANCE.eventBus.post(new LegitInputEvent());
    }

    @ModifyExpressionValue(method={"handleKeybinds"}, at={@At(value="FIELD", target="Lnet/minecraft/client/Minecraft;screen:Lnet/minecraft/client/gui/screens/Screen;")})
    private Screen polinex$ignoreChatScreenForMacroClicks(Screen screen) {
        if (screen instanceof ChatScreen && ModuleManager.macroModuleActive) {
            return null;
        }
        return screen;
    }

    @Inject(method={"createTitle"}, at={@At(value="HEAD")}, cancellable=true)
    public void modifyWindowTitle(CallbackInfoReturnable<String> callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue("Polinex Fabric");
    }

    @Inject(method={"startAttack"}, at={@At(value="HEAD")}, cancellable=true)
    private void leftClickMouse(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (this.missTime <= 0 || AutoClicker.INSTANCE.isToggled()) {
            if (this.hitResult == null) {
                if (!this.gameMode.isDestroying() && !AutoClicker.holdingMouse) {
                    this.missTime = 10;
                }
            } else {
                switch (this.hitResult.getType()) {
                    case ENTITY: {
                        this.gameMode.attack(this.player, ((EntityHitResult)this.hitResult).getEntity());
                        break;
                    }
                    case BLOCK: {
                        BlockPos blockPos = ((BlockHitResult)this.hitResult).getBlockPos();
                        if (!this.level.getBlockState(blockPos).isAir()) {
                            this.gameMode.startDestroyBlock(blockPos, ((BlockHitResult)this.hitResult).getDirection());
                            break;
                        }
                    }
                    default: {
                        if (this.gameMode.isDestroying() || AutoClicker.holdingMouse) break;
                        this.missTime = 10;
                    }
                }
                this.player.swing(InteractionHand.MAIN_HAND);
            }
        }
        callbackInfoReturnable.setReturnValue(false);
    }

    @Inject(method={"pick(F)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void polinex$onPick(float f, CallbackInfo callbackInfo) {
        CrosshairTargetEvent crosshairTargetEvent = new CrosshairTargetEvent();
        PolinexAccessor.INSTANCE.eventBus.post(crosshairTargetEvent);
        if (crosshairTargetEvent.isCanceled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"isPaused"}, at={@At(value="HEAD")}, cancellable=true)
    private void isPaused(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing || BackgroundFocus.INSTANCE.isToggled()) {
            callbackInfoReturnable.setReturnValue(false);
        }
    }

    @Inject(method={"isWindowActive"}, at={@At(value="HEAD")}, cancellable=true)
    private void isWindowFocused(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing || BackgroundFocus.INSTANCE.isToggled()) {
            callbackInfoReturnable.setReturnValue(true);
        }
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")}, cancellable=true)
    private void polinex$blockPauseDuringMacro(Screen screen, CallbackInfo callbackInfo) {
        if ((ModuleManager.macroModuleActive || ReactionSystemV2.INSTANCE.isActive() || Replayer.playing) && screen instanceof PauseScreen) {
            callbackInfo.cancel();
        }
    }

    @ModifyVariable(method={"setScreen"}, at=@At(value="HEAD"), argsOnly=true)
    private Screen replaceMainMenu(Screen screen) {
        if (screen instanceof TitleScreen && GeneralModules.Companion.getCustomMainMenu().isToggled()) {
            return new CustomMainMenu();
        }
        if (screen instanceof DisconnectedScreen && Scheduler.isOnBreak() && GeneralModules.Companion.getCustomBreakScreen().isToggled()) {
            return new SchedulerBreakScreen(false);
        }
        return screen;
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")})
    private void onSetScreen(Screen screen, CallbackInfo callbackInfo) {
        Minecraft minecraft = (Minecraft)((Object)this);
        Screen screen2 = minecraft.screen;
        if (screen2 != null && screen != screen2) {
            PolinexAccessor.INSTANCE.eventBus.post(new ScreenCloseEvent());
        }
        if (screen instanceof CraftingScreen && ModuleManager.macroModuleActive) {
            PolinexAccessor.INSTANCE.eventBus.post(new PowderCheckEvent());
        }
        if (screen != null && PolinexAccessor.INSTANCE.eventBus.post(new GuiOpenPreEvent())) {
            callbackInfo.cancel();
        }
        String string = screen != null ? screen.getClass().getSimpleName() : "null";
        PolinexAccessor.INSTANCE.eventBus.post(new ScreenOpenEvent(screen, string));
    }

    @Inject(method={"handleKeybinds"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/Options;setCameraType(Lnet/minecraft/client/CameraType;)V", shift=At.Shift.BEFORE)})
    private void onPerspectiveChange(CallbackInfo callbackInfo) {
        CameraType cameraType;
        Minecraft minecraft = (Minecraft)((Object)this);
        if (Camera.INSTANCE.isToggled() && Camera.getSmoothF5().isToggled() && (cameraType = minecraft.options.getCameraType()).isFirstPerson()) {
            Camera.INSTANCE.setupSmoothCamera();
        }
    }
}
