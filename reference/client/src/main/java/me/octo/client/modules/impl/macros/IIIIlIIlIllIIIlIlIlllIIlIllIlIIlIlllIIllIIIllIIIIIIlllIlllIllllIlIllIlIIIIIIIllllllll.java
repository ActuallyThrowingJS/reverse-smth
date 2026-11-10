package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll {
   @NotNull
   private final List<IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @Nullable
   private String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 61771722890227L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   public IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll() {
      long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 84344845932473L;
      super();
      IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl[] var3 = new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl[]{
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Combat", 20, 0, 0, null, null, null, Items.STONE_SWORD, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Farming", 21, 0, 0, null, null, null, Items.GOLDEN_HOE, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Mining", 22, 0, 0, null, null, null, Items.STONE_PICKAXE, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Fishing", 23, 0, 0, null, null, null, Items.FISHING_ROD, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Foraging", 24, 0, 0, null, null, null, Items.JUNGLE_SAPLING, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl(
            "Dungeoneering", 30, 0, 0, null, null, null, Items.PLAYER_HEAD, 124, null
         ),
         new IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl("Hunting", 31, 0, 0, null, null, null, Items.LEAD, 124, null)
      };
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = CollectionsKt.listOf(var3);
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = -1;
   }

   @NotNull
   public final List<IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @Nullable
   public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable String var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      long var1
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 35306847765103L;
      IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var10000;
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         String var5 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var6 = false;
         var10000 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5, var3);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull String var1, long var2
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         2143953865455834694L, var2
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"p">(30603, 2224917838619875528L ^ var2)
      );
      Iterable var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      int var4 = var10000;

      label20:
      for (Object var7 : var5) {
         Object var11 = var7;

         do {
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var8 = (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var11;
            boolean var9 = false;
            if (!Intrinsics.areEqual(var8.getName(), var1)) {
               continue label20;
            }

            var11 = var7;
         } while (var4 == 0);

         return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var7;
      }

      return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)null;
   }

   @Nullable
   public final IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Item var1, int var2, int var3, char var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7485716870840020068L, var5
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"p">(32468, 3995434184096050099L ^ var5)
      );
      int var7 = var10000;

      label20:
      for (Object var10 : this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl) {
         Object var13 = var10;

         do {
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var11 = (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var13;
            boolean var12 = false;
            if (!Intrinsics.areEqual(var11.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(), var1)) {
               continue label20;
            }

            var13 = var10;
         } while (var7 == 0);

         return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var10;
      }

      return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)null;
   }

   @Nullable
   public final IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1, int var3
   ) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3915410208505478609L, var1
      );
      Iterable var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Iterator var6 = var5.iterator();
      int var4 = var10000;

      label39:
      while (var6.hasNext()) {
         Object var7 = var6.next();
         Object var12 = var7;

         do {
            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var8 = (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var12;
            boolean var9 = false;
            var10000 = var8.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
            label28:
            if (var4 != 0) {
               try {
                  if (var10000 == var3) {
                     var10000 = 1;
                     break label28;
                  }
               } catch (MatchException var10) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var10, -3896917700507728204L, var1
                  );
               }

               var10000 = 0;
            }

            if (var10000 == 0) {
               continue label39;
            }

            var12 = var7;
         } while (var4 == 0);

         return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var7;
      }

      return (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)null;
   }

   @Nullable
   public final Item IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final Integer IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final List IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      Iterable var4 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      boolean var5 = false;
      Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var4, 10));
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4345609794240198600L, var1
      );
      boolean var8 = false;
      Iterator var9 = var4.iterator();
      int var3 = var10000;

      while (true) {
         if (var9.hasNext()) {
            Object var10 = var9.next();
            var15 = var7;
            if (var3 == 0) {
               break;
            }

            IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var11 = (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var10;
            boolean var12 = false;
            var7.add(var11.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI());
            if (var3 != 0) {
               continue;
            }
         }

         var15 = var7;
         break;
      }

      return (List)var15;
   }

   static {
      long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 63485797157114L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "òöß¦'\u0093¾à''\u001c\u000b·ç\u000e´ Æ2|õ\u0003KÜ9_\u0080&\u0004Ù¤Ëêè\u0092\u00adoÐÓ\r\u0096\"L\u007fgí³aj\u0010ÛÂ\u001a^.a\u0095\u0002d\u0012\u000f\u000f\nooa\u0010ìÍÂ\u009fû²\u0012¶¿ý1¥\u008fö£\u009e\u0018õ\u0019ø_\u009a\u0083\u0000\u0080:¥\u009dÕäÈ3ìõú$Þº¬ç-\u00109\u0016ëô®§\u0011a¯=#ZÀU-À\u0010íôsË¹\u001dQ8û \\§Ü\u009c\u0080\u0006\u0010\u00970\u000e\u001f\u0098¾B<Q¸ìò¦Ü«V";
      int var8 = "òöß¦'\u0093¾à''\u001c\u000b·ç\u000e´ Æ2|õ\u0003KÜ9_\u0080&\u0004Ù¤Ëêè\u0092\u00adoÐÓ\r\u0096\"L\u007fgí³aj\u0010ÛÂ\u001a^.a\u0095\u0002d\u0012\u000f\u000f\nooa\u0010ìÍÂ\u009fû²\u0012¶¿ý1¥\u008fö£\u009e\u0018õ\u0019ø_\u009a\u0083\u0000\u0080:¥\u009dÕäÈ3ìõú$Þº¬ç-\u00109\u0016ëô®§\u0011a¯=#ZÀU-À\u0010íôsË¹\u001dQ8û \\§Ü\u009c\u0080\u0006\u0010\u00970\u000e\u001f\u0098¾B<Q¸ìò¦Ü«V"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[10];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0092a\u0093ÈÉ\u0001\r+Å\u008fÔrªùé\u001d\u0010a-  Û0`O bô¸\u00075\u001bõ";
                  var8 = "\u0092a\u0093ÈÉ\u0001\r+Å\u008fÔrªùé\u001d\u0010a-  Û0`O bô¸\u00075\u001bõ".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28908;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll", var10
            );
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
   }

   private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
                  0,
                  var0,
                  var3,
                  var1
               ),
               var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException(
            "me/octo/client/modules/impl/macros/IIIIlIIlIllIIIlIlIlllIIlIllIlIIlIlllIIllIIIllIIIIIIlllIlllIllllIlIllIlIIIIIIIllllllll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
