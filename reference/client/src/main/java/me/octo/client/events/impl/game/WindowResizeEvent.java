package me.octo.client.events.impl.game;

import me.octo.client.events.Event;

public final class WindowResizeEvent extends Event {
   private final int width;
   private final int height;

   public WindowResizeEvent(int widthArg, int heightArg) {
      this.width = widthArg;
      this.height = heightArg;
   }

   public final int getWidth() {
      return this.width;
   }

   public final int getHeight() {
      return this.height;
   }
}
