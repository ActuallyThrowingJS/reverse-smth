package me.octo.client.events.impl.other;

import me.octo.client.events.Event;
import org.jetbrains.annotations.NotNull;

public final class ClientInitializeEvent extends Event {
   @NotNull
   public static ClientInitializeEvent INSTANCE = new ClientInitializeEvent();

   private ClientInitializeEvent() {
   }
}
