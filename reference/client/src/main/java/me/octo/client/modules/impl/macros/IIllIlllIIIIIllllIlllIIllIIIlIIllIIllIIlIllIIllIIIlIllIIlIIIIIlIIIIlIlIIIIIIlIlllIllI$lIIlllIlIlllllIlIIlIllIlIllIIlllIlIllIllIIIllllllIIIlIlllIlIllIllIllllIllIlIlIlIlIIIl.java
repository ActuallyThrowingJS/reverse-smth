package me.octo.client.modules.impl.macros;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

public final class IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI$lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      Pair var3 = (Pair)var1;
      boolean var4 = false;
      double var5 = ((Number)var3.component2()).doubleValue();
      Comparable var10000 = var5;
      var3 = (Pair)var2;
      Comparable var7 = var10000;
      var4 = false;
      var5 = ((Number)var3.component2()).doubleValue();
      return ComparisonsKt.compareValues(var7, var5);
   }
}
