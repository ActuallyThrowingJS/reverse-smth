package me.octo.client.interfaces;

import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.Nullable;

public interface EntityRenderStateAddition {
   @Nullable
   Entity polinex_getEntity();

   void polinex_setEntity(@Nullable Entity var1);
}
