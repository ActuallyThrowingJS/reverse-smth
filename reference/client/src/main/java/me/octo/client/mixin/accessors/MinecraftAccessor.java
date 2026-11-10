package me.octo.client.mixin.accessors;

import com.mojang.authlib.minecraft.UserApiService;
import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraft.client.DeltaTracker.Timer;
import net.minecraft.client.multiplayer.ProfileKeyPairManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Minecraft.class)
public interface MinecraftAccessor {
   @Accessor("deltaTracker")
   Timer getDeltaTracker();

   @Invoker("startAttack")
   boolean invokeStartAttack();

   @Invoker("startUseItem")
   void invokeStartUseItem();

   @Accessor
   ProfileKeyPairManager getProfileKeyPairManager();

   @Mutable
   @Accessor("user")
   void setUser(User var1);

   @Mutable
   @Accessor("userApiService")
   void setUserApiService(UserApiService var1);

   @Mutable
   @Accessor("profileKeyPairManager")
   void setProfileKeyPairManager(ProfileKeyPairManager var1);
}
