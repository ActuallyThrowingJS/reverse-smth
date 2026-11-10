package me.octo.client.mixin.network;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerData.ServerPackStatus;
import net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientCommonPacketListenerImpl.class)
public class ClientCommonPacketListenerImplMixin {
   @Shadow
   @Final
   private Minecraft minecraft;
   @Shadow
   protected ServerData serverData;

   @Inject(
      method = "handleResourcePackPush",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/common/ClientboundResourcePackPushPacket;id()Ljava/util/UUID;",
         shift = Shift.BEFORE
      )
   )
   private void polinex$autoAcceptHypixelPack(ClientboundResourcePackPushPacket var1, CallbackInfo var2) {
      if (this.serverData != null) {
         if (this.serverData.getResourcePackStatus() == ServerPackStatus.PROMPT) {
            String var3 = this.serverData.ip == null ? "" : this.serverData.ip.toLowerCase();
            if (var3.contains("hypixel.net") || var1.url().contains("hypixel.net")) {
               this.serverData.setResourcePackStatus(ServerPackStatus.ENABLED);
               this.minecraft.getDownloadedPackSource().allowServerPacks();
            }
         }
      }
   }
}
