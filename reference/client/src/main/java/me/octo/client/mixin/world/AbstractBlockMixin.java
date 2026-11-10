package me.octo.client.mixin.world;

import me.octo.client.modules.impl.macros.farming.FarmingSettings;
import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockStateBase.class)
public class AbstractBlockMixin {
   @Inject(method = "shouldSpawnTerrainParticles", at = @At("HEAD"), cancellable = true)
   private void hasBlockBreakParticles(CallbackInfoReturnable<Boolean> var1) {
      if (FarmingSettings.INSTANCE.getParticleRemover().isToggled()) {
         var1.setReturnValue(false);
      }
   }
}
