package me.octo.client.gui;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

public final class lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      Pair var3 = (Pair)var2;
      boolean var4 = false;
      Comparable var10000 = (Comparable)var3.getSecond();
      var3 = (Pair)var1;
      Comparable var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Comparable)var3.getSecond());
   }
}
