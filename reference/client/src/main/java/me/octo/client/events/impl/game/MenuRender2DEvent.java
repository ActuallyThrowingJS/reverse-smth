package me.octo.client.events.impl.game;

import me.octo.client.events.Event;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.Nullable;

public final class MenuRender2DEvent extends Event {
   @Nullable
   private final GuiGraphicsExtractor graphics;
   @Nullable
   private final Integer mouseX;
   @Nullable
   private final Integer mouseY;
   @Nullable
   private final Float tickDelta;

   public MenuRender2DEvent(@Nullable GuiGraphicsExtractor graphicsArg, @Nullable Integer mouseXArg, @Nullable Integer mouseYArg, @Nullable Float tickDeltaArg) {
      this.graphics = graphicsArg;
      this.mouseX = mouseXArg;
      this.mouseY = mouseYArg;
      this.tickDelta = tickDeltaArg;
   }

   @Nullable
   public final GuiGraphicsExtractor getGraphics() {
      return this.graphics;
   }

   @Nullable
   public final Integer getMouseX() {
      return this.mouseX;
   }

   @Nullable
   public final Integer getMouseY() {
      return this.mouseY;
   }

   @Nullable
   public final Float getTickDelta() {
      return this.tickDelta;
   }

   public MenuRender2DEvent() {
      this(null, null, null, null, 15, null);
   }
}
