package me.octo.client.mixin.entity;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.LivingDeathEvent;
import me.octo.client.modules.impl.features.visuals.ViewModel;
import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
   @Shadow
   public boolean swinging;
   @Shadow
   public int swingTime;

   @Inject(method = "die", at = @At("HEAD"))
   private void onDeath(DamageSource var1, CallbackInfo var2) {
      PolinexAccessor.INSTANCE.eventBus.post(new LivingDeathEvent((LivingEntity)this, var1));
   }

   @Inject(method = "getCurrentSwingDuration", require = 0, at = @At("HEAD"), cancellable = true)
   private void polinex$overrideSwingDuration(CallbackInfoReturnable<Integer> var1) {
      LivingEntity var2 = (LivingEntity)this;
      if (var2 == Minecraft.getInstance().player) {
         Integer var3 = ViewModel.overrideSwingDuration();
         if (var3 != null) {
            var1.setReturnValue(var3);
         }
      }
   }

   @ModifyVariable(method = "swing(Lnet/minecraft/world/InteractionHand;Z)V", require = 0, at = @At("HEAD"), argsOnly = true, index = 1)
   private InteractionHand polinex$redirectSwingHand(InteractionHand var1) {
      return (LivingEntity)this != Minecraft.getInstance().player ? var1 : ViewModel.redirectSwingHand(var1);
   }

   @Inject(method = "swing(Lnet/minecraft/world/InteractionHand;Z)V", require = 0, at = @At("HEAD"), cancellable = true)
   private void polinex$handleSwingOverrides(InteractionHand var1, boolean var2, CallbackInfo var3) {
      if ((LivingEntity)this == Minecraft.getInstance().player) {
         if (ViewModel.isSwingCancelled()) {
            var3.cancel();
         } else {
            if (ViewModel.shouldBypassSwingGuard()) {
               this.swinging = false;
               this.swingTime = -1;
            }
         }
      }
   }
}
