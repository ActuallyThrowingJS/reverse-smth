package me.octo.client.mixin.network;

import javax.annotation.Nullable;
import net.minecraft.network.PacketBundlePacker;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.BundlerInfo.Bundler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PacketBundlePacker.class)
public class PacketBundlePackerMixin {
   @Shadow
   @Nullable
   private Bundler currentBundler;

   @Redirect(
      method = "decode(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;Ljava/util/List;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/BundlerInfo$Bundler;addPacket(Lnet/minecraft/network/protocol/Packet;)Lnet/minecraft/network/protocol/Packet;"
      )
   )
   private Packet<?> safeAddPacket(Bundler var1, Packet<?> var2) {
      try {
         return var1.addPacket(var2);
      } catch (IllegalStateException var4) {
         if (var4.getMessage() != null && var4.getMessage().contains("Too many packets in a bundle")) {
            this.currentBundler = null;
            return null;
         } else {
            throw var4;
         }
      }
   }
}
