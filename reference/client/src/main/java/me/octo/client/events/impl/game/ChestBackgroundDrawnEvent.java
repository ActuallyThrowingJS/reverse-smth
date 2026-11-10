package me.octo.client.events.impl.game;

import java.util.List;
import me.octo.client.events.Event;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.Nullable;

public final class ChestBackgroundDrawnEvent extends Event {
   @Nullable
   private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private final Integer IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private final List<Slot> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

   public ChestBackgroundDrawnEvent(@Nullable String var1, @Nullable Integer var2, @Nullable List<? extends Slot> var3) {
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var2;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var3;
   }

   @Nullable
   public final String lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @Nullable
   public final Integer IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @Nullable
   public final List<Slot> IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public ChestBackgroundDrawnEvent() {
      this(null, null, null, 7, null);
   }
}
