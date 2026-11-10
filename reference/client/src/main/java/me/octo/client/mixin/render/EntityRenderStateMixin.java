package me.octo.client.mixin.render;

import me.octo.client.interfaces.EntityRenderStateAddition;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityRenderState.class)
public class EntityRenderStateMixin implements EntityRenderStateAddition {
   @Unique
   @Nullable
   private Entity polinex$entity;

   @Nullable
   @Override
   public Entity polinex_getEntity() {
      return this.polinex$entity;
   }

   @Override
   public void polinex_setEntity(@Nullable Entity var1) {
      this.polinex$entity = var1;
   }
}
