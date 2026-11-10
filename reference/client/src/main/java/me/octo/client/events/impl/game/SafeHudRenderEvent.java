package me.octo.client.events.impl.game;

import me.octo.client.events.Event;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.Nullable;

public final class SafeHudRenderEvent extends Event {
   @Nullable
   private final GuiGraphicsExtractor graphics;
   private final float tickDelta;

   public SafeHudRenderEvent(@Nullable GuiGraphicsExtractor graphicsArg, float tickDeltaArg) {
      this.graphics = graphicsArg;
      this.tickDelta = tickDeltaArg;
   }

   @Nullable
   public final GuiGraphicsExtractor getGraphics() {
      return this.graphics;
   }

   public final float getTickDelta() {
      return this.tickDelta;
   }

   public SafeHudRenderEvent() {
      this(null, 0.0F, 3, null);
   }
}
