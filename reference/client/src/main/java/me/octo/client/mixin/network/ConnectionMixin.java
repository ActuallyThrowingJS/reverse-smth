package me.octo.client.mixin.network;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.ServerDisconnectEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.events.impl.packet.PacketSendEvent;
import me.octo.client.scripting.ScriptPacketInterest;
import me.octo.client.utils.ModUtils;
import me.octo.client.utils.network.proxy.Proxy;
import me.octo.client.utils.network.proxy.ProxyUtils;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ClientboundCustomPayloadPacket;
import net.minecraft.network.protocol.game.ClientboundAnimatePacket;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.network.protocol.game.ClientboundRotateHeadPacket;
import net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket;
import net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Connection.class)
public class ConnectionMixin {
   @Inject(method = "send(Lnet/minecraft/network/protocol/Packet;)V", at = @At("HEAD"), cancellable = true)
   private void onSend(Packet<?> var1, CallbackInfo var2) {
      if (PolinexAccessor.INSTANCE.eventBus.post(new PacketSendEvent(var1))) {
         var2.cancel();
      }
   }

   @Inject(method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V", at = @At("HEAD"), cancellable = true)
   private void onReceive(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      if (!(var2 instanceof ClientboundLevelParticlesPacket)
         && !(var2 instanceof ClientboundSectionBlocksUpdatePacket)
         && !(var2 instanceof ClientboundSetEntityDataPacket)) {
         if (!(var2 instanceof ClientboundMoveEntityPacket)
               && !(var2 instanceof ClientboundRotateHeadPacket)
               && !(var2 instanceof ClientboundEntityPositionSyncPacket)
               && !(var2 instanceof ClientboundEntityEventPacket)
               && !(var2 instanceof ClientboundAnimatePacket)
               && !(var2 instanceof ClientboundSetPlayerTeamPacket)
               && !(var2 instanceof ClientboundCustomPayloadPacket)
            || ScriptPacketInterest.INSTANCE.wants(var2.getClass())) {
            if (!(
               var2 instanceof ClientboundSetEntityMotionPacket var4
                  && ModUtils.mc.player != null
                  && var4.id() != ModUtils.mc.player.getId()
                  && !ScriptPacketInterest.INSTANCE.wants(var2.getClass())
            )) {
               if (PolinexAccessor.INSTANCE.eventBus.post(new PacketReceivedEvent(var2))) {
                  var3.cancel();
               }
            }
         }
      }
   }

   @ModifyArg(
      method = "connect",
      at = @At(
         value = "INVOKE",
         target = "Lio/netty/bootstrap/Bootstrap;handler(Lio/netty/channel/ChannelHandler;)Lio/netty/bootstrap/AbstractBootstrap;",
         remap = false
      ),
      index = 0,
      require = 0
   )
   private static ChannelHandler addSocks5ProxyHandler(final ChannelHandler var0) {
      return new ChannelInitializer<Channel>() {
         protected void initChannel(Channel var1) throws Exception {
            Proxy var2 = ProxyUtils.INSTANCE.getCurrentProxy();
            if (var2 != null && ProxyUtils.INSTANCE.getConnected()) {
               InetSocketAddress var3 = new InetSocketAddress(var2.getIp(), var2.getPort());
               switch (<unrepresentable>.$SwitchMap$me$octo$client$utils$network$proxy$ProxyType[var2.getType().ordinal()]) {
                  case 1:
                     Socks5ProxyHandler var4;
                     if (!var2.getUsername().isEmpty()) {
                        var4 = new Socks5ProxyHandler(var3, var2.getUsername(), var2.getPassword());
                     } else {
                        var4 = new Socks5ProxyHandler(var3);
                     }

                     var1.pipeline().addFirst("socks5-proxy", var4);
                     break;
                  case 2:
                     var1.pipeline().addFirst("socks4-proxy", new Socks4ProxyHandler(var3));
               }
            }

            var1.pipeline().addLast("original-initializer", var0);
         }
      };
   }

   @Inject(method = "handleDisconnection", at = @At("TAIL"))
   public void onDisconnect(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(new ServerDisconnectEvent());
   }
}
