package me.octo.client.events.impl.other;

import me.octo.client.events.Event;
import org.jetbrains.annotations.NotNull;

public final class ClientShutdownEvent extends Event {
   @NotNull
   public static ClientShutdownEvent INSTANCE = new ClientShutdownEvent();

   private ClientShutdownEvent() {
   }
}
