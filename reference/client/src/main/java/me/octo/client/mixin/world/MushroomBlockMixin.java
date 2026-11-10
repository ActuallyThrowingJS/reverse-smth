package me.octo.client.mixin.world;

import me.octo.client.modules.impl.macros.foraging.GlowingMushroomMacroConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockStateBase.class)
public abstract class MushroomBlockMixin {
   @Shadow
   protected abstract BlockState asState();

   @Inject(
      method = "getShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void getOutlineShape(BlockGetter var1, BlockPos var2, CollisionContext var3, CallbackInfoReturnable<VoxelShape> var4) {
      if (GlowingMushroomMacroConfig.INSTANCE.getUse1x1Hitbox().isToggled()) {
         BlockState var5 = this.asState();
         if (var5.is(Blocks.RED_MUSHROOM) || var5.is(Blocks.BROWN_MUSHROOM)) {
            var4.setReturnValue(Shapes.block());
         }
      }
   }

   @Inject(method = "getInteractionShape", at = @At("HEAD"), cancellable = true)
   private void getRaycastShape(BlockGetter var1, BlockPos var2, CallbackInfoReturnable<VoxelShape> var3) {
      if (GlowingMushroomMacroConfig.INSTANCE.getUse1x1Hitbox().isToggled()) {
         BlockState var4 = this.asState();
         if (var4.is(Blocks.RED_MUSHROOM) || var4.is(Blocks.BROWN_MUSHROOM)) {
            var3.setReturnValue(Shapes.block());
         }
      }
   }
}
