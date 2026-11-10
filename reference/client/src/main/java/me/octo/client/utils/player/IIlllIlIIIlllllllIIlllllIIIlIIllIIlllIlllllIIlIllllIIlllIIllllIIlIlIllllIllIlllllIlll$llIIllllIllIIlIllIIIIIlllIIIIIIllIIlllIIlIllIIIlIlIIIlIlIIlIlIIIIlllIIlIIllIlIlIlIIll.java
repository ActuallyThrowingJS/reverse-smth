package me.octo.client.utils.player;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      Entity var3 = (Entity)var1;
      boolean var4 = false;
      LocalPlayer var10000 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .player;
      Intrinsics.checkNotNull(var10000);
      Comparable var8 = (double)var10000.distanceTo(var3);
      var3 = (Entity)var2;
      Comparable var5 = var8;
      var4 = false;
      var10000 = IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .player;
      Intrinsics.checkNotNull(var10000);
      return ComparisonsKt.compareValues(var5, (double)var10000.distanceTo(var3));
   }
}
