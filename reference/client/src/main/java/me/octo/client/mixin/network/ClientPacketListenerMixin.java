package me.octo.client.mixin.network;

import java.util.Arrays;
import me.octo.client.PolinexAccessor;
import me.octo.client.commands.CommandManager;
import me.octo.client.events.impl.client.ClientJoinServerEvent;
import me.octo.client.events.impl.entity.EntityDataUpdateEvent;
import me.octo.client.events.impl.game.BlockBreakingProgressEvent;
import me.octo.client.events.impl.other.PacketTeamsEvent;
import me.octo.client.events.impl.other.ParticleEvent;
import me.octo.client.events.impl.packet.ChatCommandSendEvent;
import me.octo.client.events.impl.packet.ServerRotationEvent;
import me.octo.client.modules.impl.features.visuals.TimeChanger;
import me.octo.client.utils.ModUtils;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import net.minecraft.network.protocol.game.ClientboundLevelParticlesPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerRotationPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket;
import net.minecraft.network.protocol.game.ClientboundSetPlayerTeamPacket;
import net.minecraft.network.protocol.game.ClientboundSetTimePacket;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
   @Unique
   private static int TPS_HISTORY_SIZE;
   @Unique
   private long lastTime = -1L;
   @Unique
   private long lastServerTime = -1L;
   @Unique
   private boolean polinex$rotationCaptured;
   @Unique
   private float polinex$yawBefore;
   @Unique
   private float polinex$pitchBefore;
   @Unique
   private double[] tpsHistory;
   @Unique
   private int idx = 0;

   @Unique
   private void ensureTpsHistory() {
      if (this.tpsHistory == null) {
         this.tpsHistory = new double[3];
         Arrays.fill(this.tpsHistory, 20.0);
      }
   }

   @Inject(method = "handleLogin", at = @At("RETURN"))
   private void onJoinServer(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(new ClientJoinServerEvent());
   }

   @Inject(method = "handleMovePlayer", at = @At("HEAD"))
   private void polinex$beforePlayerTeleport(ClientboundPlayerPositionPacket var1, CallbackInfo var2) {
      this.polinex$captureRotation();
   }

   @Inject(method = "handleMovePlayer", at = @At("TAIL"))
   private void polinex$afterPlayerTeleport(ClientboundPlayerPositionPacket var1, CallbackInfo var2) {
      this.polinex$postServerRotation(var1);
   }

   @Inject(method = "handleRotatePlayer", at = @At("HEAD"))
   private void polinex$beforeServerRotation(ClientboundPlayerRotationPacket var1, CallbackInfo var2) {
      this.polinex$captureRotation();
   }

   @Inject(method = "handleRotatePlayer", at = @At("TAIL"))
   private void polinex$afterServerRotation(ClientboundPlayerRotationPacket var1, CallbackInfo var2) {
      this.polinex$postServerRotation(var1);
   }

   @Unique
   private void polinex$captureRotation() {
      this.polinex$rotationCaptured = ModUtils.mc.isSameThread() && ModUtils.mc.player != null;
      if (this.polinex$rotationCaptured) {
         this.polinex$yawBefore = ModUtils.mc.player.getYRot();
         this.polinex$pitchBefore = ModUtils.mc.player.getXRot();
      }
   }

   @Unique
   private void polinex$postServerRotation(Packet<?> var1) {
      if (this.polinex$rotationCaptured && ModUtils.mc.player != null) {
         this.polinex$rotationCaptured = false;
         float var2 = ModUtils.mc.player.getYRot();
         float var3 = ModUtils.mc.player.getXRot();
         if (var2 != this.polinex$yawBefore || var3 != this.polinex$pitchBefore) {
            PolinexAccessor.INSTANCE.eventBus.post(new ServerRotationEvent(var1, this.polinex$yawBefore, this.polinex$pitchBefore, var2, var3));
         }
      }
   }

   @Inject(method = "handleSetEntityData", at = @At("TAIL"))
   private void onEntityTrackerUpdate(ClientboundSetEntityDataPacket var1, CallbackInfo var2) {
      if (ModUtils.mc.level != null) {
         Entity var3 = ModUtils.mc.level.getEntity(var1.id());
         if (var3 != null) {
            PolinexAccessor.INSTANCE.eventBus.post(new EntityDataUpdateEvent(var3, var1.id()));
         }
      }
   }

   @Inject(method = "sendCommand", at = @At("HEAD"), cancellable = true)
   private void onSendChatCommand(String var1, CallbackInfo var2) {
      if (PolinexAccessor.INSTANCE.eventBus.post(new ChatCommandSendEvent(var1))) {
         var2.cancel();
      }
   }

   @Inject(method = "verifyCommand", at = @At("RETURN"), cancellable = true, require = 0)
   private void onVerifyCommand(String var1, CallbackInfoReturnable<Enum<?>> var2) {
      Enum var3 = (Enum)var2.getReturnValue();
      if (var3 != null && !"SIGNATURE_REQUIRED".equals(var3.name()) && !"NO_ISSUES".equals(var3.name())) {
         if (CommandManager.isCustomCommand("/" + var1)) {
            var2.setReturnValue(Enum.valueOf(var3.getDeclaringClass(), "NO_ISSUES"));
         }
      }
   }

   @Inject(method = "handleSetTime", at = @At("HEAD"), cancellable = true)
   private void onTimeUpdate(ClientboundSetTimePacket var1, CallbackInfo var2) {
      this.ensureTpsHistory();
      long var3 = System.currentTimeMillis();
      long var5 = var1.gameTime();
      if (this.lastTime != -1L && this.lastServerTime != -1L) {
         long var7 = var3 - this.lastTime;
         long var9 = Math.abs(var5 - this.lastServerTime);
         if (var9 > 0L) {
            double var11 = (double)var9 / var7 * 1000.0;
            double var13 = Math.min(20.0, Math.max(0.0, var11));
            this.tpsHistory[this.idx] = var13;
            this.idx = (this.idx + 1) % this.tpsHistory.length;
            double var15 = 0.0;

            for (double var20 : this.tpsHistory) {
               var15 += var20;
            }

            var15 /= this.tpsHistory.length;
            ModUtils.smoothedTPS = var15;
            ModUtils.currentTPS = var13;
         }
      }

      this.lastTime = var3;
      this.lastServerTime = var5;
      if (TimeChanger.INSTANCE.isToggled()) {
         var2.cancel();
      }
   }

   @Inject(method = "clearLevel", at = @At("HEAD"))
   private void onWorldClear(CallbackInfo var1) {
      this.ensureTpsHistory();
      this.lastTime = -1L;
      this.lastServerTime = -1L;
      this.idx = 0;
      Arrays.fill(this.tpsHistory, 20.0);
   }

   @Inject(
      method = "handleParticleEvent",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/protocol/game/ClientboundLevelParticlesPacket;getCount()I"),
      cancellable = true
   )
   public void onParticle(ClientboundLevelParticlesPacket var1, CallbackInfo var2) {
      if (PolinexAccessor.INSTANCE.eventBus.post(new ParticleEvent(var1))) {
         var2.cancel();
      }
   }

   @Inject(
      method = "handleSetPlayerTeamPacket",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket;getTeamAction()Lnet/minecraft/network/protocol/game/ClientboundSetPlayerTeamPacket$Action;"
      )
   )
   public void onTeam(ClientboundSetPlayerTeamPacket var1, CallbackInfo var2) {
      PolinexAccessor.INSTANCE.eventBus.post(new PacketTeamsEvent(var1));
   }

   @Inject(method = "handleBlockDestruction", at = @At("TAIL"))
   private void onBlockBreakingProgress(ClientboundBlockDestructionPacket var1, CallbackInfo var2) {
      PolinexAccessor.INSTANCE.eventBus.post(new BlockBreakingProgressEvent(var1));
   }
}
