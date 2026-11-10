package me.octo.client.events.impl.packet;

import me.octo.client.events.Event;
import me.octo.client.events.impl.base.annotations.Cancelable;

@Cancelable
public class ChatCommandSendEvent extends Event {
   public final String command;

   public ChatCommandSendEvent(String commandArg) {
      this.command = commandArg;
   }
}
