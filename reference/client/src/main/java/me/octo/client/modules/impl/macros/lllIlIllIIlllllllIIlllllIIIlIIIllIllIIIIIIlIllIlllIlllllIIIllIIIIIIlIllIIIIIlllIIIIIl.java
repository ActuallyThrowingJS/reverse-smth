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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.skyblock.mining.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl
   extends me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII {
   @NotNull
   public static lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<String, lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static long IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 126146810017909L;
   private static String[] IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static Map IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new HashMap(13);

   private lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl() {
      long var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 128788660196261L;
      me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var3 = new me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{
         me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.MINE
      };
      List var10005 = CollectionsKt.arrayListOf(var3);
      me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.FOLDER;
      String[] var4 = new String[]{
         "Lava Springs", "Upper Mines", "Royal Mines", "Cliffside Veins", "Rampart's Quarry", "Goblin Slayer", "Glacite Walker Slayer"
      };
      super(
         "Dwarven Commission Editor",
         "DwarvenCommissionMacro-Routes",
         "DwarvenCommissionMacroV2",
         "dwarven_commission",
         var10005,
         "dwarven",
         var10007,
         null,
         CollectionsKt.listOf(var4),
         false,
         false,
         false,
         false,
         7808,
         null
      );
   }

   @Override
   public boolean IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(long var1) {
      return false;
   }

   @Override
   public boolean IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(long var1) {
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         == me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_MINES;
   }

   @Nullable
   @Override
   public String lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   @Override
   public String lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(long var1) {
      long var3 = var1 ^ 104542227572120L;
      String var5 = IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll()
         .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(var3);

      try {
         if (this.getTargetNames().contains(var5)) {
            return var5;
         }
      } catch (NoSuchElementException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -2523739693050715109L, var1
         );
      }

      return null;
   }

   @NotNull
   @Override
   public ArrayList IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(int param1, short param2, char param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   @Override
   public ArrayList llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(short param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII() {
      return IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
   }

   @Nullable
   public final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
      @NotNull String var1, long var2
   ) {
      var2 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var2;
      long var10001 = var2 ^ 18975383804544L;
      int var4 = (int)((var2 ^ 18975383804544L) >>> 48);
      int var5 = (int)((var2 ^ 18975383804544L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      var10001 = var2 ^ 131745837799449L;
      int var7 = (int)((var2 ^ 131745837799449L) >>> 32);
      int var8 = (int)((var2 ^ 131745837799449L) << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -702934028379666090L, var2
      );
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"y">(9992, 5550506335763621150L ^ var2)
      );
      int[] var10 = var10000;
      Iterable var14 = CollectionsKt.withIndex(this.getTargetNames());
      Iterator var15 = var14.iterator();

      label175:
      while (true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            var10000 = (int[])var16;

            while (true) {
               IndexedValue var17 = (IndexedValue)var10000;
               boolean var18 = false;
               if (!StringsKt.contains$default(var1, (CharSequence)var17.getValue(), false, 2, null)) {
                  continue label175;
               }

               if (var10 != null) {
                  var10000 = (int[])var16;
                  break label175;
               }

               var10000 = (int[])var16;
            }
         }

         var10000 = null;
         break;
      }

      label164: {
         try {
            IndexedValue var68 = (IndexedValue)var10000;
            if ((IndexedValue)var10000 != null) {
               var69 = var68.getIndex();
               break label164;
            }
         } catch (NoSuchElementException var36) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var36, -607427421281939597L, var2
            );
         }

         var69 = null;
      }

      Integer var11 = var69;

      try {
         if (var11 == null) {
            return null;
         }
      } catch (NoSuchElementException var35) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var35, -607427421281939597L, var2
         );
      }

      String var12 = IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll((char)var4, (short)var5, var6);
      var10000 = (int[])lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(this.getTargetNames().get(var11));
      Intrinsics.checkNotNull(var10000);
      lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var13 = (lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII)var10000;

      try {
         if (Intrinsics.areEqual(
            var12, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"y">(7993, 3651538444841639208L ^ var2)
         )) {
            return var13;
         }
      } catch (NoSuchElementException var34) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var34, -607427421281939597L, var2
         );
      }

      Iterable var39 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var7, var8, (byte)var9);
      boolean var41 = false;
      Iterable var43 = var39;
      Collection var46 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var39, 10));
      boolean var19 = false;

      label141: {
         for (Object var21 : var39) {
            if (var10 == null) {
               var71 = var46;
               break label141;
            }

            me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var22 = (me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl)var21;
            boolean var23 = false;
            var46.add(var22.getPos());
            if (var10 == null) {
               break;
            }
         }

         var71 = var46;
      }

      List var38 = (List)var71;
      var10000 = var10;
      boolean var40 = var38.isEmpty();

      label182: {
         label183: {
            label128: {
               try {
                  if (var10000 == null) {
                     break label128;
                  }

                  if (var40) {
                     break label183;
                  }
               } catch (NoSuchElementException var33) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var33, -607427421281939597L, var2
                  );
               }

               var43 = var38;
            }

            boolean var48 = false;
            Collection var52 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var43, 10));
            boolean var54 = false;
            Iterator var57 = var43.iterator();

            while (true) {
               if (var57.hasNext()) {
                  Object var60 = var57.next();
                  if (var10 == null) {
                     var75 = var52;
                     break;
                  }

                  BlockPos var62 = (BlockPos)var60;
                  boolean var64 = false;
                  var52.add(
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        var62,
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        var13.getName()
                     )
                  );
                  if (var10 != null) {
                     continue;
                  }
               }

               var75 = var52;
               break;
            }

            var74 = (List)var75;
            break label182;
         }

         var43 = var13.getVeins();
         boolean var47 = false;
         var var51 = new ArrayList();
         boolean var53 = false;

         for (Object var59 : var43) {
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll var24 = (IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll)var59;
            boolean var25 = false;

            label107: {
               try {
                  if (var24.getReach()
                     == me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK) {
                     var73 = true;
                     break label107;
                  }
               } catch (NoSuchElementException var32) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var32, -607427421281939597L, var2
                  );
               }

               var73 = false;
            }

            if (var73) {
               var51.add(var59);
               if (var10 == null) {
                  break;
               }
            }
         }

         var74 = var51;
      }

      List var42 = var74;
      List var77;
      if (!var40) {
         var77 = CollectionsKt.emptyList();
      } else {
         Iterable var49 = var13.getVeins();
         var19 = false;
         var var55 = new ArrayList();
         boolean var58 = false;

         for (Object var63 : var49) {
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll var65 = (IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll)var63;
            boolean var26 = false;

            label88: {
               try {
                  if (var65.getReach()
                     == me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP) {
                     var76 = true;
                     break label88;
                  }
               } catch (NoSuchElementException var31) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var31, -607427421281939597L, var2
                  );
               }

               var76 = false;
            }

            if (var76) {
               var55.add(var63);
               if (var10 == null) {
                  break;
               }
            }
         }

         var77 = var55;
      }

      List var45 = var77;
      return new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
         var13.getName(),
         var13.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         CollectionsKt.plus(var42, var45),
         var13.getInArea()
      );
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(
      long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var10001 = var0 ^ 122334421233770L;
      int var2 = (int)((var0 ^ 122334421233770L) >>> 32);
      int var3 = (int)((var0 ^ 122334421233770L) << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var2, (short)var3, var4);
   }

   private static final boolean IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var10001 = var0 ^ 95472798138275L;
      int var2 = (int)((var0 ^ 95472798138275L) >>> 32);
      int var3 = (int)((var0 ^ 95472798138275L) << 32 >>> 48);
      int var4 = (int)(var10001 << 48 >>> 48);
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var2, (char)var3, (short)var4);
   }

   private static final boolean IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var2 = var0 ^ 44142429648160L;
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var2);
   }

   private static final boolean IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var2 = var0 ^ 94887150672379L;
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(var2);
   }

   private static final boolean IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var2 = var0 ^ 35298302669270L;
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(var2);
   }

   private static final boolean IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var2 = var0 ^ 126244570362404L;
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var2);
   }

   private static final boolean lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(long var0) {
      var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var0;
      long var2 = var0 ^ 1173612850816L;
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var2);
   }

   static {
      long var9 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 8925656786737L;
      long var11 = var9 ^ 86053483110402L;
      long var13 = var9 ^ 59000683116019L;
      long var15 = var9 ^ 87343213928380L;
      long var17 = var9 ^ 34595271992411L;
      long var19 = var9 ^ 116779384811293L;
      long var21 = var9 ^ 53549575471567L;
      long var23 = var9 ^ 65749254247733L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "\u0000Á¯97\u0015U~_éy\u0099(\u0084\u0016Ø\u00957E|\u0010É·õ¸Ò\u009fsáÚÿ\u0084¦Wa 8P¸Â\u0080*Û\u009c\u0080Ý(ÅÈÏN¤\u0089\u0010?\u0084\u0018½Ñja¢\u0003ypÕ\u0011»\u008c\u001cçÏ{\u0099\fîæ\u0012øy'8p^\u0086ÇSëÞ\u008f³±¶ÛÈ\u001c\u008d\u009cÝÏ¸\u008f7/\r\u000f#çåt½Üaö\u0084jtJ-\u009d\tD\u008e\u0084f\u0096n\"¬P«\u000e1µ¦vðU(³v\u00061Î\r\u0081ÆÌ\u0006¦\u0083ë\u0017è`Ú1\u008a\u0081\u009f\u0016\u001cÊHÕu\u0013è\u008cä\u0011ÊVó¿þqE\u0086(;¿\u001a\u001b\u0018\u008fõ«±£ÌºÎïX\u0091¶á\u00adÿ\u000eÿþ\u0017Às\u009e\u0092Ük9c\u0019\u0006ñXD<÷n\u0018<\u0091Òoà)J`M\u00ad_ÎkI\u008a\u008c\u0087Á7\u001b\u0014\u0092ÿì\u0018.)\\¾ \u0019l%¢\u0012&Yõ]%¬;.ÙÖâRÑ\u009b0½¥Á£3Þ\brpD¡`K.ß\u0007ë\u0096³êÞ\\]pÛ_ÈOÇ\u009c\u009dÔ5à,C\rw\u001cé\u0082ü°gFPr] ØtO5KFµ\u0099PS§Îü7ÐOz]â`ËÊn6\u008bs0\u001d¶_\u009f0 @ä-úÐLÝib~V\u009bþ\u0001\u009bu¦µ³Ó´ûl\u001cL\u0000ò]°\u001a×¤ \u007f\u0005dY£\"ÓÁ^ú¼5Ú\u0003Wº\u0010\u009c\u008f\u0086øÛt»X8H86«ÙÊ8.xê_\u0089\tÜ\u00055ê\u009e\u0016\u007f\túå_ %0ûò\u0094\u009cÿç÷/Z\u0095j\u001d\t\u0000\u0000÷YÜ8\u001fë\u0000:16Ø\fVº\u0087\u0015z #\u001cE\u0010\u0092!jÎýz\u001bl\r\"æD£\t\u0091÷(\u0092Õ]\u001d¿r#E\u0097\u00115Î\u0007\u0018\u0084y\u007f§Â5ÿ\u008a#\u0003\u0090.ì®û¤Ì\u0001Ê\u0015ã§\u0097Ë¹P";
      int var6 = "\u0000Á¯97\u0015U~_éy\u0099(\u0084\u0016Ø\u00957E|\u0010É·õ¸Ò\u009fsáÚÿ\u0084¦Wa 8P¸Â\u0080*Û\u009c\u0080Ý(ÅÈÏN¤\u0089\u0010?\u0084\u0018½Ñja¢\u0003ypÕ\u0011»\u008c\u001cçÏ{\u0099\fîæ\u0012øy'8p^\u0086ÇSëÞ\u008f³±¶ÛÈ\u001c\u008d\u009cÝÏ¸\u008f7/\r\u000f#çåt½Üaö\u0084jtJ-\u009d\tD\u008e\u0084f\u0096n\"¬P«\u000e1µ¦vðU(³v\u00061Î\r\u0081ÆÌ\u0006¦\u0083ë\u0017è`Ú1\u008a\u0081\u009f\u0016\u001cÊHÕu\u0013è\u008cä\u0011ÊVó¿þqE\u0086(;¿\u001a\u001b\u0018\u008fõ«±£ÌºÎïX\u0091¶á\u00adÿ\u000eÿþ\u0017Às\u009e\u0092Ük9c\u0019\u0006ñXD<÷n\u0018<\u0091Òoà)J`M\u00ad_ÎkI\u008a\u008c\u0087Á7\u001b\u0014\u0092ÿì\u0018.)\\¾ \u0019l%¢\u0012&Yõ]%¬;.ÙÖâRÑ\u009b0½¥Á£3Þ\brpD¡`K.ß\u0007ë\u0096³êÞ\\]pÛ_ÈOÇ\u009c\u009dÔ5à,C\rw\u001cé\u0082ü°gFPr] ØtO5KFµ\u0099PS§Îü7ÐOz]â`ËÊn6\u008bs0\u001d¶_\u009f0 @ä-úÐLÝib~V\u009bþ\u0001\u009bu¦µ³Ó´ûl\u001cL\u0000ò]°\u001a×¤ \u007f\u0005dY£\"ÓÁ^ú¼5Ú\u0003Wº\u0010\u009c\u008f\u0086øÛt»X8H86«ÙÊ8.xê_\u0089\tÜ\u00055ê\u009e\u0016\u007f\túå_ %0ûò\u0094\u009cÿç÷/Z\u0095j\u001d\t\u0000\u0000÷YÜ8\u001fë\u0000:16Ø\fVº\u0087\u0015z #\u001cE\u0010\u0092!jÎýz\u001bl\r\"æD£\t\u0091÷(\u0092Õ]\u001d¿r#E\u0097\u00115Î\u0007\u0018\u0084y\u007f§Â5ÿ\u008a#\u0003\u0090.ì®û¤Ì\u0001Ê\u0015ã§\u0097Ë¹P"
         .length();
      char var3 = '8';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var55 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var55;
         if ((var2 += var3) >= var6) {
            var4 = "Þ\u0084\u0001mÛ\u0089\u009eÇq\u008cÿ\u0095*\u000bj*4Ö\u000fÑ\u0084EåJ ?æ;e¢øL:\u0098ÔU¡2*¬ã\b´\u0081\u0093×gÏ:ÂØIÍª©·\u009a";
            var6 = "Þ\u0084\u0001mÛ\u0089\u009eÇq\u008cÿ\u0095*\u000bj*4Ö\u000fÑ\u0084EåJ ?æ;e¢øL:\u0098ÔU¡2*¬ã\b´\u0081\u0093×gÏ:ÂØIÍª©·\u009a".length();
            var3 = '\u0018';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var57 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
               boolean var53 = false;
               var7[var5++] = var57;
               if ((var2 += var3) >= var6) {
                  IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var7;
                  lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = new String[16];
                  llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl();
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new HashMap<>();
                  Map var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  Object var26 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0);
                  String var59 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var63 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(58, 197, -10), new Vec3(58.5, 199.52, -8.5)
                  );
                  IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[] var27 = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[]{
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(53, 197, -24),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(43, 197, -19),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(41, 197, -12),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(51, 215, -30),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(53, 205, 16),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(43, 201, -24),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(69, 217, 8),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0)
                     )
                  };
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var43 = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                     var59,
                     var63,
                     CollectionsKt.listOf(var27),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl
                  );
                  var25.put(var26, var43);
                  var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var26 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1);
                  String var60 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var64 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(-132, 173, -52), new Vec3(-132.5, 175.52, -50.5)
                  );
                  var27 = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[]{
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-111, 166, -75),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-124, 170, -74),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-143, 167, -30),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-131, 167, -25),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-78, 187, -71),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-97, 194, -75),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-91, 201, -77),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1)
                     )
                  };
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var45 = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                     var60,
                     var64,
                     CollectionsKt.listOf(var27),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll
                  );
                  var25.put(var26, var45);
                  var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var26 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2);
                  String var61 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var65 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(170, 149, 32), new Vec3(171.5, 151.52, 31.5)
                  );
                  var27 = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[]{
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(114, 153, 43),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(140, 152, 26),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(146, 151, 30),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(176, 151, 23),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(171, 149, 82),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(106, 163, 31),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(110, 159, 24),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(166, 160, 19),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2)
                     )
                  };
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var47 = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                     var61,
                     var65,
                     CollectionsKt.listOf(var27),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll
                  );
                  var25.put(var26, var47);
                  var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var26 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3);
                  String var62 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var66 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(43, 134, 21), new Vec3(42.5, 136.02, 22.5)
                  );
                  var27 = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[]{
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(24, 127, 33),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(14, 127, 37),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(7, 128, 39),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(67, 140, 21),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(51, 142, 6),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-8, 135, 35),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(27, 138, 22),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(16, 167, 34),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3)
                     )
                  };
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var49 = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                     var62,
                     var66,
                     CollectionsKt.listOf(var27),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl
                  );
                  var25.put(var26, var49);
                  var25 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var26 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4);
                  var27 = new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll[]{
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-91, 146, -6),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-88, 146, -13),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-85, 153, -17),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-114, 151, -32),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-91, 159, -60),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-105, 148, 14),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-115, 150, -24),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-74, 169, -59),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     ),
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        new BlockPos(-69, 178, -60),
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP,
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4)
                     )
                  };
                  lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var51 = new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4),
                     null,
                     CollectionsKt.listOf(var27),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll
                  );
                  var25.put(var26, var51);
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(5),
                     new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(5),
                        null,
                        CollectionsKt.listOf(
                           new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                              new BlockPos(-104, 144, 139),
                              me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                              llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(5)
                           )
                        ),
                        lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll
                     )
                  );
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(6),
                     new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(6),
                        null,
                        CollectionsKt.listOf(
                           new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                              new BlockPos(5, 127, 151),
                              me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                              llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(6)
                           )
                        ),
                        lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII
                     )
                  );
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static NoSuchElementException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(NoSuchElementException var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14246;
      if (lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl", var10
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
         byte[] var9 = IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI[var5].getBytes("ISO-8859-1");
         lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @Nullable
   public final lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$3861d6348cb40112(
      @NotNull String commissionNameArg, long argument2Arg
   ) {
      argument2Arg = 29934783565261L;
      argument2Arg = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ argument2Arg;
      long var10001 = argument2Arg ^ 18975383804544L;
      int var4 = (int)((argument2Arg ^ 18975383804544L) >>> 48);
      int var5 = (int)((argument2Arg ^ 18975383804544L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      var10001 = argument2Arg ^ 131745837799449L;
      int var7 = (int)((argument2Arg ^ 131745837799449L) >>> 32);
      int var8 = (int)((argument2Arg ^ 131745837799449L) << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      int[] var10000 = <unrepresentable>.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      Intrinsics.checkNotNullParameter(commissionNameArg, "commissionName");
      int[] var10 = var10000;
      Iterable var14 = CollectionsKt.withIndex(this.getTargetNames());
      Iterator var15 = var14.iterator();

      label175:
      while (true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            var10000 = (int[])var16;

            while (true) {
               IndexedValue var17 = (IndexedValue)var10000;
               boolean var18 = false;
               if (!StringsKt.contains$default(commissionNameArg, (CharSequence)var17.getValue(), false, 2, null)) {
                  continue label175;
               }

               if (var10 != null) {
                  var10000 = (int[])var16;
                  break label175;
               }

               var10000 = (int[])var16;
            }
         }

         var10000 = null;
         break;
      }

      label164: {
         try {
            IndexedValue var75 = (IndexedValue)var10000;
            if ((IndexedValue)var10000 != null) {
               var76 = var75.getIndex();
               break label164;
            }
         } catch (NoSuchElementException var42) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var42);
         }

         var76 = null;
      }

      Integer var11 = var76;

      try {
         if (var11 == null) {
            return null;
         }
      } catch (NoSuchElementException var41) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var41);
      }

      String var12 = IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll$recovered$3090fe6fc4754881((char)var4, (short)var5, var6);
      var10000 = (int[])lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.get(this.getTargetNames().get(var11));
      Intrinsics.checkNotNull(var10000);
      lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII var13 = (lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII)var10000;

      try {
         if (Intrinsics.areEqual(var12, "Polinex-Routes")) {
            return var13;
         }
      } catch (NoSuchElementException var40) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var40);
      }

      Iterable var46 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var7, var8, (byte)var9);
      boolean var48 = false;
      Iterable var50 = var46;
      Collection var53 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var46, 10));
      boolean var19 = false;

      label141: {
         for (Object var21 : var46) {
            if (var10 == null) {
               var78 = var53;
               break label141;
            }

            me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl var22 = (me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl)var21;
            boolean var23 = false;
            var53.add(var22.getPos());
            if (var10 == null) {
               break;
            }
         }

         var78 = var53;
      }

      List var45 = (List)var78;
      var10000 = var10;
      boolean var47 = var45.isEmpty();

      label182: {
         label183: {
            label128: {
               try {
                  if (var10000 == null) {
                     break label128;
                  }

                  if (var47) {
                     break label183;
                  }
               } catch (NoSuchElementException var39) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var39);
               }

               var50 = var45;
            }

            boolean var55 = false;
            Collection var59 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var50, 10));
            boolean var61 = false;
            Iterator var64 = var50.iterator();

            while (true) {
               if (var64.hasNext()) {
                  Object var67 = var64.next();
                  if (var10 == null) {
                     var82 = var59;
                     break;
                  }

                  BlockPos var69 = (BlockPos)var67;
                  boolean var71 = false;
                  var59.add(
                     new IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll(
                        var69,
                        me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK,
                        var13.getName()
                     )
                  );
                  if (var10 != null) {
                     continue;
                  }
               }

               var82 = var59;
               break;
            }

            var81 = (List)var82;
            break label182;
         }

         var50 = var13.getVeins();
         boolean var54 = false;
         var var58 = new ArrayList();
         boolean var60 = false;

         for (Object var66 : var50) {
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll var24 = (IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll)var66;
            boolean var25 = false;

            label107: {
               try {
                  if (var24.getReach()
                     == me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.WALK) {
                     var80 = true;
                     break label107;
                  }
               } catch (NoSuchElementException var38) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var38);
               }

               var80 = false;
            }

            if (var80) {
               var58.add(var66);
               if (var10 == null) {
                  break;
               }
            }
         }

         var81 = var58;
      }

      List var49 = var81;
      List var84;
      if (!var47) {
         var84 = CollectionsKt.emptyList();
      } else {
         Iterable var56 = var13.getVeins();
         var19 = false;
         var var62 = new ArrayList();
         boolean var65 = false;

         for (Object var70 : var56) {
            IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll var72 = (IllIlIIllllllIIllllIIllIIIlIIllIlllllIIlllIlIlllIIlIIIllIlIIlllllIIIllIIlIIIllllIllll)var70;
            boolean var26 = false;

            label88: {
               try {
                  if (var72.getReach()
                     == me.octo.client.modules.impl.macros.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.ETHERWARP) {
                     var83 = true;
                     break label88;
                  }
               } catch (NoSuchElementException var37) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var37);
               }

               var83 = false;
            }

            if (var83) {
               var62.add(var70);
               if (var10 == null) {
                  break;
               }
            }
         }

         var84 = var62;
      }

      List var52 = var84;
      return new lIIIIlllIllIlIlIlllIlllIlIlllIlIIlIlIIllIlllIllllIIllllIIIlIIlIllllIIIlIIIlIlIlIlIlII(
         var13.getName(),
         var13.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         CollectionsKt.plus(var49, var52),
         var13.getInArea()
      );
   }
}
