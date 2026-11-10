package me.octo.client.events.impl.entity;

import me.octo.client.events.Event;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public final class RenderEntityEvent extends Event {
   @Nullable
   private final LivingEntity entity;

   public RenderEntityEvent(@Nullable LivingEntity entityArg) {
      this.entity = entityArg;
   }

   @Nullable
   public final LivingEntity getEntity() {
      return this.entity;
   }

   public RenderEntityEvent() {
      this(null, 1, null);
   }
}
