package me.octo.client.mixin.world;

import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.other.BlockChangeEvent;
import me.octo.client.modules.manager.ModuleManager;
import me.octo.client.utils.skyblock.mining.BlockUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LevelChunk.class)
public abstract class LevelChunkMixin {
   @Unique
   private boolean replacing = false;

   @Shadow
   public abstract BlockState getBlockState(BlockPos var1);

   @Inject(method = "setBlockState", at = @At("HEAD"), cancellable = true)
   private void onBlockChange(BlockPos var1, BlockState var2, int var3, CallbackInfoReturnable<BlockState> var4) {
      BlockState var5 = this.getBlockState(var1);
      if (var5 != var2) {
         PolinexAccessor.INSTANCE.eventBus.post(new BlockChangeEvent(var1, var5, var2));
      }

      if (ModuleManager.macroModuleActive && !this.replacing) {
         Block var6 = BlockUtils.getBlockReplacements().get(var5.getBlock());
         if (var6 != null) {
            this.replacing = true;
            BlockState var7 = ((LevelChunk)this).setBlockState(var1, var6.defaultBlockState(), var3);
            this.replacing = false;
            var4.setReturnValue(var7);
         }
      }
   }
}
