package me.octo.client.mixin.world;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.scores.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Scoreboard.class)
public abstract class ScoreboardMixin {
   @Shadow
   public abstract PlayerTeam getPlayerTeam(String var1);

   @Inject(method = "addPlayerTeam", at = @At("HEAD"), cancellable = true)
   private void polinex$suppressDuplicateTeamWarning(String var1, CallbackInfoReturnable<PlayerTeam> var2) {
      PlayerTeam var3 = this.getPlayerTeam(var1);
      if (var3 != null) {
         var2.setReturnValue(var3);
      }
   }
}
