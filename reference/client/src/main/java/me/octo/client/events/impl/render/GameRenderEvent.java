package me.octo.client.events.impl.render;

import me.octo.client.events.Event;
import org.jetbrains.annotations.NotNull;

public final class GameRenderEvent extends Event {
   @NotNull
   public static GameRenderEvent INSTANCE = new GameRenderEvent();

   private GameRenderEvent() {
   }
}
