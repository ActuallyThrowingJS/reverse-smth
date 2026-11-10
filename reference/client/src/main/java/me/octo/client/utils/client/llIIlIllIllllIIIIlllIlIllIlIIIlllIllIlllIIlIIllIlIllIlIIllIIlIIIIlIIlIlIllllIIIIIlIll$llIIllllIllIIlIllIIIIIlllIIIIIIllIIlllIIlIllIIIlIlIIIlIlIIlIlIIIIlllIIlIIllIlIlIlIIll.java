package me.octo.client.utils.client;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.world.scores.PlayerScoreEntry;

public final class llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      PlayerScoreEntry var3 = (PlayerScoreEntry)var2;
      boolean var4 = false;
      Comparable var10000 = var3.value();
      var3 = (PlayerScoreEntry)var1;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, var3.value());
   }
}
