package me.octo.client.mixin.screen;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.game.MenuHudRenderEvent;
import me.octo.client.events.impl.game.PIPRenderEvent;
import me.octo.client.events.impl.game.Render2DEvent;
import me.octo.client.events.impl.game.SafeHudRenderEvent;
import me.octo.client.events.impl.render.HudElementDrawnEvent;
import me.octo.client.events.impl.render.OverlayMessageEvent;
import me.octo.client.events.impl.render.ScoreboardEvent;
import me.octo.client.modules.impl.features.hud.RecordTikTokMode;
import me.octo.client.modules.impl.features.visuals.CustomHotbar;
import me.octo.client.modules.impl.features.visuals.EffectsDisplayRemover;
import me.octo.client.modules.impl.features.visuals.NoRender;
import me.octo.client.utils.ModUtils;
import me.octo.client.utils.render.RenderUtils;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.util.profiling.Profiler;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.Objective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {
   @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelHudForNoRender(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (NoRender.INSTANCE.shouldHideHud()) {
         var3.cancel();
      }
   }

   @Inject(method = "extractRenderState", at = @At("TAIL"), require = 0)
   private void onRender(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         ModUtils.mc.renderBuffers().bufferSource().endBatch();
         Profiler.get().push("polinex_render_2d");
         RenderUtils.unscaledProjection();
         PolinexAccessor.INSTANCE.eventBus.post(new Render2DEvent(var1, var1.guiWidth(), var1.guiHeight(), var2.getGameTimeDeltaPartialTick(true)));
         ModUtils.mc.renderBuffers().bufferSource().endBatch();
         RenderUtils.scaledProjection();
         Profiler.get().pop();
      }
   }

   @Inject(method = "extractEffects", require = 0, at = @At("HEAD"), cancellable = true)
   private void onRenderStatusEffects(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      ModUtils.mc.renderBuffers().bufferSource().endBatch();
      RenderUtils.unscaledProjection();
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         PolinexAccessor.INSTANCE.eventBus.post(new PIPRenderEvent(var1, var2.getGameTimeDeltaPartialTick(true)));
         if (ModUtils.mc.player != null && ModUtils.mc.level != null) {
            PolinexAccessor.INSTANCE.eventBus.post(new SafeHudRenderEvent(var1, var2.getGameTimeDeltaPartialTick(true)));
         } else {
            PolinexAccessor.INSTANCE.eventBus.post(new MenuHudRenderEvent(var1, var2.getGameTimeDeltaPartialTick(true)));
         }
      }

      RenderUtils.scaledProjection();
      if (EffectsDisplayRemover.INSTANCE.isToggled()) {
         var3.cancel();
      }
   }

   @Inject(method = "displayScoreboardSidebar", at = @At("HEAD"), cancellable = true, require = 0)
   public void renderScoreboard(GuiGraphicsExtractor var1, Objective var2, CallbackInfo var3) {
      PolinexAccessor.INSTANCE.eventBus.post(new HudElementDrawnEvent(var1));
      if (PolinexAccessor.INSTANCE.eventBus.post(new ScoreboardEvent(var1, var2))) {
         var3.cancel();
      }
   }

   @Inject(method = "setOverlayMessage", at = @At("HEAD"), require = 0)
   public void setOverlayMessage(Component var1, boolean var2, CallbackInfo var3) {
      PolinexAccessor.INSTANCE.eventBus.post(new OverlayMessageEvent(var1.getString(), var1));
   }

   @Inject(method = "extractItemHotbar", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelVanillaHotbar(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (CustomHotbar.INSTANCE.isToggled()) {
         var3.cancel();
      }
   }

   @Inject(method = "extractSelectedItemName", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelVanillaItemName(GuiGraphicsExtractor var1, CallbackInfo var2) {
      if (CustomHotbar.INSTANCE.isToggled() && CustomHotbar.INSTANCE.shouldSuppressVanillaTooltip()) {
         var2.cancel();
      }
   }

   @Inject(method = "extractHotbarAndDecorations", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelVanillaDecorations(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (CustomHotbar.INSTANCE.isToggled() && CustomHotbar.INSTANCE.shouldHideStatusBars()) {
         var3.cancel();
      }
   }

   @Inject(method = "extractPlayerHealth", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelHealthBar(GuiGraphicsExtractor var1, CallbackInfo var2) {
      if (RecordTikTokMode.hideStatusBars()) {
         var2.cancel();
      }
   }

   @Inject(method = "extractArmor", at = @At("HEAD"), cancellable = true, require = 0)
   private static void polinex$cancelArmorBar(GuiGraphicsExtractor var0, Player var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      if (RecordTikTokMode.hideStatusBars()) {
         var6.cancel();
      }
   }

   @Inject(method = "extractFood", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelHungerBar(GuiGraphicsExtractor var1, Player var2, int var3, int var4, CallbackInfo var5) {
      if (RecordTikTokMode.hideStatusBars()) {
         var5.cancel();
      }
   }
}
