package me.octo.client.events.impl.entity;

import me.octo.client.events.Event;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public final class LivingDeathEvent extends Event {
   @Nullable
   private final LivingEntity entity;
   @Nullable
   private final DamageSource damageSource;

   public LivingDeathEvent(@Nullable LivingEntity entityArg, @Nullable DamageSource damageSourceArg) {
      this.entity = entityArg;
      this.damageSource = damageSourceArg;
   }

   @Nullable
   public final LivingEntity getEntity() {
      return this.entity;
   }

   @Nullable
   public final DamageSource getDamageSource() {
      return this.damageSource;
   }

   public LivingDeathEvent() {
      this(null, null, 3, null);
   }
}
