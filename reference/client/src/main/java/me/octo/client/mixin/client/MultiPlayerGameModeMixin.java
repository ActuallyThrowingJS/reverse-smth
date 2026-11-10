package me.octo.client.mixin.client;

import me.octo.client.modules.impl.features.mining.NoDrillReset;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MultiPlayerGameMode.class)
public class MultiPlayerGameModeMixin {
   @Shadow
   private ItemStack destroyingItem;
   @Shadow
   private BlockPos destroyBlockPos;

   @Inject(method = "sameDestroyTarget", at = @At("HEAD"), cancellable = true)
   private void onIsCurrentlyBreaking(BlockPos var1, CallbackInfoReturnable<Boolean> var2) {
      if (NoDrillReset.INSTANCE.isToggled()) {
         var2.setReturnValue(NoDrillReset.shouldContinueBreaking(var1, this.destroyingItem, this.destroyBlockPos));
      }
   }
}
