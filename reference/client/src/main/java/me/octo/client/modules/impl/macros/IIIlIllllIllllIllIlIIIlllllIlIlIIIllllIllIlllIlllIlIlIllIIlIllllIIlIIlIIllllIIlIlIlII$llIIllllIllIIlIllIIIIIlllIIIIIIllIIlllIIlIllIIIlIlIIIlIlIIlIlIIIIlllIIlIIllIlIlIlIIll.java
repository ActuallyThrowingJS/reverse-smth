package me.octo.client.modules.impl.macros;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;

public final class IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll<T>
   implements Comparator {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 91686629125439L;

   @Override
   public final int compare(T var1, T var2) {
      long var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 79842635043587L;
      int var10000 = IIIlIllllIllllIllIlIIIlllllIlIlIIIllllIllIlllIlllIlIlIllIIlIllllIIlIIlIIllllIIlIlIlII.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      Pair var6 = (Pair)var1;
      boolean var5 = (boolean)var10000;
      boolean var7 = false;
      var var14 = (Integer & Comparable)var6.getSecond();
      var6 = (Pair)var2;
      Integer var8 = var14;
      var7 = false;

      try {
         var10000 = ComparisonsKt.compareValues(var8, (Integer & Comparable)var6.getSecond());
         if (!var5) {
            int[] var9 = new int[5];
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var9
            );
         }

         return var10000;
      } catch (MatchException var11) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }
}
