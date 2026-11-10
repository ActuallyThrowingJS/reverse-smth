package me.octo.client.events.impl.game;

import me.octo.client.events.Event;
import org.jetbrains.annotations.NotNull;

public final class GameLoopEvent extends Event {
   @NotNull
   public static GameLoopEvent INSTANCE = new GameLoopEvent();

   private GameLoopEvent() {
   }
}
