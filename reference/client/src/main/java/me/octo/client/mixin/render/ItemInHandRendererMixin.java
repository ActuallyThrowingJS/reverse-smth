package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.modules.impl.features.visuals.ViewModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemInHandRenderer.class)
public class ItemInHandRendererMixin {
   @Inject(
      method = "renderArmWithItem",
      require = 0,
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/vertex/PoseStack;pushPose()V", shift = Shift.AFTER, ordinal = 0)
   )
   private void polinex$applyViewmodelTransforms(
      AbstractClientPlayer var1,
      float var2,
      float var3,
      InteractionHand var4,
      float var5,
      ItemStack var6,
      float var7,
      PoseStack var8,
      SubmitNodeCollector var9,
      int var10,
      CallbackInfo var11
   ) {
      HumanoidArm var12 = var4 == InteractionHand.MAIN_HAND ? var1.getMainArm() : var1.getMainArm().getOpposite();
      ViewModel.applyTransforms(var8, var12, var6.isEmpty());
   }

   @ModifyVariable(method = "renderArmWithItem", require = 0, at = @At("HEAD"), argsOnly = true, index = 5)
   private float polinex$overrideSwingProgress(float var1, @Local(argsOnly = true) InteractionHand var2) {
      return ViewModel.overrideSwingProgress(var2, var1);
   }

   @ModifyVariable(method = "renderArmWithItem", require = 0, at = @At("HEAD"), argsOnly = true, index = 7)
   private float polinex$suppressSwapAnimation(float var1) {
      return ViewModel.suppressSwapAnimation() ? 0.0F : var1;
   }
}
