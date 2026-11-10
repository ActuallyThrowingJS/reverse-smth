package me.octo.client.modules;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.world.phys.Vec3;

public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll<T>
   implements Comparator {
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 62199019769998L;

   public lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
      Vec3 var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @Override
   public final int compare(T var1, T var2) {
      long var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 54576382081124L;
      long var10001 = var3 ^ 9129182354568L;
      int var5 = (int)((var3 ^ 9129182354568L) >>> 48);
      int var6 = (int)((var3 ^ 9129182354568L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Vec3 var8 = (Vec3)var1;
      boolean var9 = false;
      Comparable var10000 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            (char)var5, (short)var6, var8, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var7
         );
      var8 = (Vec3)var2;
      Comparable var10 = var10000;
      var9 = false;
      return ComparisonsKt.compareValues(
         var10,
         me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               (char)var5, (short)var6, var8, this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl, var7
            )
      );
   }
}
