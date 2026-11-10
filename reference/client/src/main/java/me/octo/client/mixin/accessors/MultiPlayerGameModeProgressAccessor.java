package me.octo.client.mixin.accessors;

import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MultiPlayerGameMode.class)
public interface MultiPlayerGameModeProgressAccessor {
   @Accessor("destroyProgress")
   float getDestroyProgress();
}
