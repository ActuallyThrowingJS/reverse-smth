package me.octo.client.events.impl.other;

import me.octo.client.events.Event;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public final class BlockChangeEvent extends Event {
   @Nullable
   private final BlockPos position;
   @Nullable
   private final BlockState previousState;
   @Nullable
   private final BlockState state;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 52135486255686L;

   public BlockChangeEvent(@Nullable BlockPos positionArg, @Nullable BlockState previousStateArg, @Nullable BlockState stateArg) {
      this.position = positionArg;
      this.previousState = previousStateArg;
      this.state = stateArg;
   }

   @Nullable
   public final BlockPos getPosition() {
      return this.position;
   }

   @Nullable
   public final BlockState getPreviousState() {
      return this.previousState;
   }

   @Nullable
   public final BlockState getState() {
      return this.state;
   }

   public BlockChangeEvent() {
      this(null, null, null, 7, null);
   }
}
