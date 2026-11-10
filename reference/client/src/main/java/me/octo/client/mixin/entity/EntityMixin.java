package me.octo.client.mixin.entity;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.PlayerChangeLookDirectionEvent;
import me.octo.client.modules.impl.features.visuals.NoRender;
import me.octo.client.render.ForceRender;
import me.octo.client.render.PolinexGlow;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
   @Shadow
   public float xRotO;
   @Shadow
   public float yRotO;
   @Shadow
   private Vec3 position;
   @Shadow
   private float yRot;
   @Shadow
   private float xRot;
   @Shadow
   private boolean onGround;
   @Shadow
   public boolean noPhysics;
   @Shadow
   private Entity vehicle;

   @Shadow
   public abstract void setOnGround(boolean var1);

   @Shadow
   protected abstract void setRot(float var1, float var2);

   @Shadow
   public abstract void setPosRaw(double var1, double var3, double var5);

   @Shadow
   public abstract boolean onGround();

   @Shadow
   public abstract void setXRot(float var1);

   @Shadow
   public abstract void setYRot(float var1);

   @Shadow
   public abstract float getXRot();

   @Shadow
   public abstract float getYRot();

   @Shadow
   public abstract double getZ();

   @Shadow
   public abstract double getY();

   @Shadow
   public abstract double getX();

   @Inject(method = "shouldRenderAtSqrDistance", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$forceRenderDistance(double var1, CallbackInfoReturnable<Boolean> var3) {
      Entity var4 = (Entity)this;
      if (NoRender.INSTANCE.shouldHideEntityModels()) {
         var3.setReturnValue(false);
      } else {
         if (ForceRender.shouldRender(var4) || PolinexGlow.shouldRender(var4)) {
            var3.setReturnValue(true);
         }
      }
   }

   @Inject(method = "shouldRender(DDD)Z", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$forceRender(double var1, double var3, double var5, CallbackInfoReturnable<Boolean> var7) {
      Entity var8 = (Entity)this;
      if (NoRender.INSTANCE.shouldHideEntityModels()) {
         var7.setReturnValue(false);
      } else {
         if (ForceRender.shouldRender(var8) || PolinexGlow.shouldRender(var8)) {
            var7.setReturnValue(true);
         }
      }
   }

   @Inject(method = "turn", at = @At("HEAD"), cancellable = true)
   public void changeLookDirection(double var1, double var3, CallbackInfo var5) {
      if (this instanceof LocalPlayer) {
         PlayerChangeLookDirectionEvent var6 = new PlayerChangeLookDirectionEvent(var1, var3);
         PolinexAccessor.INSTANCE.eventBus.post(var6);
         if (var6.isModified()) {
            this.changeLookDirectionNoEvent(var6.deltaMouseX, var6.deltaMouseY);
            var5.cancel();
         }

         if (var6.isCanceled()) {
            var5.cancel();
         }
      }
   }

   @Unique
   private void changeLookDirectionNoEvent(double var1, double var3) {
      float var5 = (float)var3;
      float var6 = (float)var1;
      this.setXRot(this.getXRot() + var5);
      this.setYRot(this.getYRot() + var6);
      this.setXRot(Mth.clamp(this.getXRot(), -90.0F, 90.0F));
      this.xRotO += var5;
      this.yRotO += var6;
      this.xRotO = Mth.clamp(this.xRotO, -90.0F, 90.0F);
      if (this.vehicle != null) {
         this.vehicle.onPassengerTurned((Entity)this);
      }
   }
}
