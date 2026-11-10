package me.octo.client.scripting;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;

public final class lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI<T>
   implements Comparator {
   public lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
      LocalPlayer var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @Override
   public final int compare(T var1, T var2) {
      Entity var3 = (Entity)var1;
      boolean var4 = false;
      Comparable var10000 = var3.distanceToSqr((Entity)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
      var3 = (Entity)var2;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(
         var5, var3.distanceToSqr((Entity)this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
      );
   }
}
