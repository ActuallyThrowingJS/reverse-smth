package me.octo.client.modules;

import java.util.Comparator;
import kotlin.Triple;
import kotlin.comparisons.ComparisonsKt;

public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI<T>
   implements Comparator {
   @Override
   public final int compare(T var1, T var2) {
      Triple var3 = (Triple)var1;
      boolean var4 = false;
      var var10000 = (Double & Comparable)var3.getThird();
      var3 = (Triple)var2;
      Double var5 = var10000;
      var4 = false;
      return ComparisonsKt.compareValues(var5, (Double & Comparable)var3.getThird());
   }
}
