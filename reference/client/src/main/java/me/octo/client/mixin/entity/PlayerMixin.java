package me.octo.client.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.octo.client.modules.impl.features.misc.Freecam;
import me.octo.client.utils.player.MovementUtils;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public class PlayerMixin {
   @ModifyReturnValue(method = "isStayingOnGroundSurface", at = @At("RETURN"))
   private boolean onClipAtLedge(boolean var1) {
      return var1 || MovementUtils.getSafeWalk();
   }

   @Inject(method = "tick", at = @At("HEAD"))
   private void forceNoClip(CallbackInfo var1) {
      if (Freecam.INSTANCE.isToggled()) {
         Player var2 = (Player)this;
         var2.noPhysics = true;
      }
   }
}
