package me.octo.client.mixin.accessors;

import net.minecraft.network.protocol.game.ServerboundMovePlayerPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ServerboundMovePlayerPacket.class)
public interface ServerboundMovePlayerPacketAccessor {
   @Accessor("xRot")
   float getRawPitch();

   @Accessor("yRot")
   float getRawYaw();

   @Accessor("x")
   double getX();

   @Accessor("y")
   double getY();

   @Accessor("z")
   double getZ();
}
