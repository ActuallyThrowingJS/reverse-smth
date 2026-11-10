package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.render.DrawNameTagEvent;
import me.octo.client.interfaces.EntityRenderStateAddition;
import me.octo.client.render.PolinexGlow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin<T extends Entity, S extends EntityRenderState> {
   @Unique
   private Entity currentDrawingEntity;
   @Unique
   private S currentRenderState;

   @Inject(
      method = "submitNameDisplay(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At("HEAD"),
      cancellable = true,
      require = 0
   )
   private void emitNameTagsEvent4(S var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, CallbackInfo var5) {
      this.fireNameTagEvent((S)var1, var5);
   }

   @Inject(
      method = "submitNameDisplay(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;I)V",
      at = @At("HEAD"),
      cancellable = true,
      require = 0
   )
   private void emitNameTagsEvent5(S var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, int var5, CallbackInfo var6) {
      this.fireNameTagEvent((S)var1, var6);
   }

   @Unique
   private void fireNameTagEvent(S var1, CallbackInfo var2) {
      Entity var3 = ((EntityRenderStateAddition)var1).polinex_getEntity();
      if (var3 != null) {
         DrawNameTagEvent var4 = new DrawNameTagEvent(var3);
         PolinexAccessor.INSTANCE.eventBus.post(var4);
         if (var4.isCanceled()) {
            var2.cancel();
         }
      }
   }

   @Inject(
      method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V",
      at = @At("HEAD")
   )
   private void storeEntityStates(T var1, S var2, float var3, CallbackInfo var4) {
      this.currentDrawingEntity = var1;
      this.currentRenderState = (S)var2;
      ((EntityRenderStateAddition)var2).polinex_setEntity(var1);
   }

   @WrapOperation(
      method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V",
      require = 0,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;shouldEntityAppearGlowing(Lnet/minecraft/world/entity/Entity;)Z")
   )
   private boolean polinex$forceGlow(Minecraft var1, Entity var2, Operation<Boolean> var3) {
      return (Boolean)var3.call(new Object[]{var1, var2}) || PolinexGlow.shouldRender(var2);
   }

   @WrapOperation(
      method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V",
      require = 0,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;getTeamColor()I")
   )
   private int polinex$injectTeamColor(Entity var1, Operation<Integer> var2) {
      if (PolinexGlow.shouldRender(var1)) {
         int var3 = PolinexGlow.colorFor(var1);
         if (var3 != 0) {
            return var3;
         }
      }

      return (Integer)var2.call(new Object[]{var1});
   }
}
