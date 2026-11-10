package me.octo.client.events.impl.packet;

import me.octo.client.events.Event;
import me.octo.client.events.impl.base.annotations.Cancelable;
import net.minecraft.network.protocol.Packet;

@Cancelable
public class PacketSendEvent extends Event {
   public final Packet<?> packet;

   public PacketSendEvent(Packet<?> packetArg) {
      this.packet = packetArg;
   }
}
