package me.octo.client.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.RenderEntityEvent;
import me.octo.client.interfaces.EntityRenderStateAddition;
import me.octo.client.mixin.accessors.RenderSetupAccessor;
import me.octo.client.mixin.accessors.RenderTypeAccessor;
import me.octo.client.render.chams.PolinexChams;
import me.octo.client.render.chams.PolinexChamsRegistry;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState> {
   @Inject(
      method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V",
      at = @At("HEAD")
   )
   private void onUpdateRenderState(LivingEntity var1, LivingEntityRenderState var2, float var3, CallbackInfo var4) {
      RenderEntityEvent var5 = new RenderEntityEvent(var1);
      PolinexAccessor.INSTANCE.eventBus.post(var5);
   }

   @ModifyExpressionValue(
      method = "getRenderType",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/EntityModel;renderType(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderType;"
      )
   )
   @Nullable
   private RenderType polinex$chamsRenderType(@Nullable RenderType var1, @Local(argsOnly = true) S var2, @Local Identifier var3) {
      if (var1 == null) {
         return null;
      } else {
         Entity var4 = ((EntityRenderStateAddition)var2).polinex_getEntity();
         if (var4 != null && PolinexChamsRegistry.shouldRender(var4)) {
            RenderSetup var5 = ((RenderTypeAccessor)var1).getState();
            boolean var6 = ((RenderSetupAccessor)var5).getOutlineProperty() == OutlineProperty.AFFECTS_OUTLINE;
            String var7 = ((RenderTypeAccessor)var1).getName();

            return switch (var7) {
               case "entity_translucent" -> (RenderType)PolinexChams.ENTITY_TRANSLUCENT.apply(var3, var6);
               case "entity_cutout" -> (RenderType)PolinexChams.ENTITY_CUTOUT.apply(var3);
               case "entity_cutout_no_cull" -> (RenderType)PolinexChams.ENTITY_CUTOUT_NO_CULL.apply(var3, var6);
               default -> var1;
            };
         } else {
            return var1;
         }
      }
   }
}
