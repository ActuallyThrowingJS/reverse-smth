package me.octo.client.mixin.entity;

import me.octo.client.modules.impl.features.misc.LegacySneak;
import me.octo.client.utils.player.PlayerPosesUtils;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Avatar.class)
public abstract class AvatarMixin {
   @Inject(method = "getDefaultDimensions", at = @At("HEAD"), cancellable = true)
   private void getDefaultPositions(Pose var1, CallbackInfoReturnable<EntityDimensions> var2) {
      if (LegacySneak.INSTANCE.isToggled()) {
         var2.setReturnValue(PlayerPosesUtils.POSES.getOrDefault(var1, PlayerPosesUtils.STANDING_DIMENSIONS));
      }
   }
}
