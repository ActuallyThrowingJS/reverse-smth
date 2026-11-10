package me.octo.client.mixin.entity;

import me.octo.client.MiscOnTick;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.base.EventState;
import me.octo.client.events.impl.game.MotionUpdateEvent;
import me.octo.client.modules.impl.features.visuals.Freelook;
import net.minecraft.client.player.LocalPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public abstract class LocalPlayerMixin extends EntityMixin {
   private double oldX;
   private double oldY;
   private double oldZ;
   private float oldRotationPitch;
   private float oldRotationYaw;
   private boolean oldGround;

   @Inject(method = "sendPosition", at = @At("HEAD"))
   public void onPre(CallbackInfo var1) {
      this.oldX = this.getX();
      this.oldY = this.getY();
      this.oldZ = this.getZ();
      this.oldRotationYaw = this.getYRot();
      this.oldRotationPitch = this.getXRot();
      this.oldGround = this.onGround();
      MotionUpdateEvent var2 = new MotionUpdateEvent(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot(), this.onGround());
      PolinexAccessor.INSTANCE.eventBus.post(var2);
      this.setPosRaw(var2.x, var2.y, var2.z);
      this.setRot(var2.yaw, var2.pitch);
      this.setOnGround(var2.onGround);
   }

   @Inject(method = "sendPosition", at = @At("RETURN"))
   public void onPost(CallbackInfo var1) {
      this.setPosRaw(this.oldX, this.oldY, this.oldZ);
      this.setRot(this.oldRotationYaw, this.oldRotationPitch);
      this.setOnGround(this.oldGround);
      PolinexAccessor.INSTANCE
         .eventBus
         .post(new MotionUpdateEvent(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot(), this.onGround()).setState(EventState.POST));
   }

   @Inject(method = "tick", at = @At("TAIL"))
   private void onTick(CallbackInfo var1) {
      MiscOnTick.onTick();
      Freelook.INSTANCE.onTick();
   }
}
