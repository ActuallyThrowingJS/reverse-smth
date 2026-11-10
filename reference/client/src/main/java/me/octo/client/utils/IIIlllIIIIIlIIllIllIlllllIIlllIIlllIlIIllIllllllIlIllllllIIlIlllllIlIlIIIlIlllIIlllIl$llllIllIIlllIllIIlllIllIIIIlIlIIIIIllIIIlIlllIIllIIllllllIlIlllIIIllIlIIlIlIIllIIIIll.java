package me.octo.client.utils;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

public final class IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      Pair var3 = (Pair)var2;
      boolean var4 = false;
      var var10000 = (Double & Comparable)var3.getSecond();
      var3 = (Pair)var1;
      Double var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Double & Comparable)var3.getSecond());
   }
}
