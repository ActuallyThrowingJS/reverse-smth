package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Set<Block> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final Set<Block> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Set<Block> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private List<? extends AABB> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final HashMap<BlockPos, llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private final HashMap<BlockPos, Double> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final HashMap<BlockPos, Double> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private BlockPos lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 30482661568528L;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static Map IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap(13);

   public llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl() {
      long var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 95637708387491L;
      super();
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var10001;
      Block[] var4 = new Block[]{
         Blocks.INFESTED_STONE,
         Blocks.GOLD_ORE,
         Blocks.IRON_ORE,
         Blocks.COAL_ORE,
         Blocks.LAPIS_ORE,
         Blocks.DIAMOND_ORE,
         Blocks.REDSTONE_ORE,
         Blocks.EMERALD_ORE,
         Blocks.STONE,
         Blocks.WHITE_TERRACOTTA,
         Blocks.ORANGE_TERRACOTTA,
         Blocks.MAGENTA_TERRACOTTA,
         Blocks.LIGHT_BLUE_TERRACOTTA,
         Blocks.YELLOW_TERRACOTTA,
         Blocks.LIME_TERRACOTTA,
         Blocks.PINK_TERRACOTTA,
         Blocks.GRAY_TERRACOTTA,
         Blocks.LIGHT_GRAY_TERRACOTTA,
         Blocks.CYAN_TERRACOTTA,
         Blocks.PURPLE_TERRACOTTA,
         Blocks.BLUE_TERRACOTTA,
         Blocks.BROWN_TERRACOTTA,
         Blocks.GREEN_TERRACOTTA,
         Blocks.RED_TERRACOTTA,
         Blocks.BLACK_TERRACOTTA,
         Blocks.WHITE_WOOL,
         Blocks.ORANGE_WOOL,
         Blocks.MAGENTA_WOOL,
         Blocks.LIGHT_BLUE_WOOL,
         Blocks.YELLOW_WOOL,
         Blocks.LIME_WOOL,
         Blocks.PINK_WOOL,
         Blocks.GRAY_WOOL,
         Blocks.LIGHT_GRAY_WOOL,
         Blocks.CYAN_WOOL,
         Blocks.PURPLE_WOOL,
         Blocks.BLUE_WOOL,
         Blocks.BROWN_WOOL,
         Blocks.GREEN_WOOL,
         Blocks.RED_WOOL,
         Blocks.BLACK_WOOL
      };
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = SetsKt.setOf(var4);
      var4 = new Block[]{
         Blocks.WHITE_STAINED_GLASS,
         Blocks.ORANGE_STAINED_GLASS,
         Blocks.MAGENTA_STAINED_GLASS,
         Blocks.LIGHT_BLUE_STAINED_GLASS,
         Blocks.YELLOW_STAINED_GLASS,
         Blocks.LIME_STAINED_GLASS,
         Blocks.PINK_STAINED_GLASS,
         Blocks.GRAY_STAINED_GLASS,
         Blocks.LIGHT_GRAY_STAINED_GLASS,
         Blocks.CYAN_STAINED_GLASS,
         Blocks.PURPLE_STAINED_GLASS,
         Blocks.BLUE_STAINED_GLASS,
         Blocks.BROWN_STAINED_GLASS,
         Blocks.GREEN_STAINED_GLASS,
         Blocks.RED_STAINED_GLASS,
         Blocks.BLACK_STAINED_GLASS,
         Blocks.WHITE_STAINED_GLASS_PANE,
         Blocks.ORANGE_STAINED_GLASS_PANE,
         Blocks.MAGENTA_STAINED_GLASS_PANE,
         Blocks.LIGHT_BLUE_STAINED_GLASS_PANE,
         Blocks.YELLOW_STAINED_GLASS_PANE,
         Blocks.LIME_STAINED_GLASS_PANE,
         Blocks.PINK_STAINED_GLASS_PANE,
         Blocks.GRAY_STAINED_GLASS_PANE,
         Blocks.LIGHT_GRAY_STAINED_GLASS_PANE,
         Blocks.CYAN_STAINED_GLASS_PANE,
         Blocks.PURPLE_STAINED_GLASS_PANE,
         Blocks.BLUE_STAINED_GLASS_PANE,
         Blocks.BROWN_STAINED_GLASS_PANE,
         Blocks.GREEN_STAINED_GLASS_PANE,
         Blocks.RED_STAINED_GLASS_PANE,
         Blocks.BLACK_STAINED_GLASS_PANE,
         Blocks.PRISMARINE
      };
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = SetsKt.setOf(var4);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = SetsKt.plus(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
      );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.Any;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.emptyList();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap<>();
      String var10000 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap<>();
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap<>();
      BlockPos var10002 = BlockPos.ZERO;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var10002;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      String var3 = var10000;
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl var10 = this;
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var9 = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[4];

      try {
         var9[0] = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            1, 0
         );
         var9[1] = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            -1, 0
         );
         var9[2] = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, 1
         );
         var9[3] = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            0, -1
         );
         var10.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var9);
         if (var3 != null) {
            int[] var5 = new int[5];
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }
      } catch (NoWhenBranchMatchedException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   @NotNull
   public final Set<Block> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final Set<Block> llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Nullable
   public final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull BlockPos param1, long param2, @NotNull ArrayList param4, boolean param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
      long var2
   ) {
      var2 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ var2;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5060835563572955632L, var2
      );
      ArrayList var5 = new ArrayList();
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = var1;
      String var4 = var10000;

      while (true) {
         if (var6 != null) {
            var8 = var5;
            if (var4 != null) {
               break;
            }

            var5.add(var6);
            var6 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               .get(var6.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII());
            if (var4 == null) {
               continue;
            }
         }

         var8 = var5;
         break;
      }

      return var8;
   }

   private final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, List param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1,
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2,
      long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param1, long param2, @NotNull Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, ArrayList param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(BlockPos param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      int param1, int param2, BlockPos param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, BlockPos param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ var1;
      long var10001 = var1 ^ 19770611539532L;
      int var3 = (int)((var1 ^ 19770611539532L) >>> 48);
      int var4 = (int)((var1 ^ 19770611539532L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);

      label49: {
         label50: {
            label51: {
               try {
                  switch (llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                     .ordinal()]) {
                     case 1:
                        return new ArrayList();
                     case 2:
                        break label49;
                     case 3:
                        break label50;
                     case 4:
                        break label51;
                     case 5:
                        break;
                     default:
                        throw new NoWhenBranchMatchedException();
                  }
               } catch (NoWhenBranchMatchedException var9) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var9, -3688483708550696774L, var1
                  );
               }

               AABB[] var8 = new AABB[1];
               me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10002 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               BlockPos var10003 = new BlockPos(514, 0, 0);
               BlockPos var6 = new BlockPos(1000, 256, 513);
               BlockPos var7 = var10003;
               var8[0] = var10002.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  (char)var3, var7, (char)var4, var5, var6
               );
               return CollectionsKt.arrayListOf(var8);
            }

            AABB[] var17 = new AABB[1];
            me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var20 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            BlockPos var23 = new BlockPos(0, 0, 0);
            BlockPos var11 = new BlockPos(513, 256, 513);
            BlockPos var14 = var23;
            var17[0] = var20.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var3, var14, (char)var4, var5, var11);
            return CollectionsKt.arrayListOf(var17);
         }

         AABB[] var18 = new AABB[1];
         me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var21 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         BlockPos var24 = new BlockPos(514, 0, 514);
         BlockPos var12 = new BlockPos(1000, 256, 1000);
         BlockPos var15 = var24;
         var18[0] = var21.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var3, var15, (char)var4, var5, var12);
         return CollectionsKt.arrayListOf(var18);
      }

      AABB[] var19 = new AABB[1];
      me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var22 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var25 = new BlockPos(0, 0, 514);
      BlockPos var13 = new BlockPos(513, 256, 1000);
      BlockPos var16 = var25;
      var19[0] = var22.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var3, var16, (char)var4, var5, var13);
      return CollectionsKt.arrayListOf(var19);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean param1, int param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      BlockPos param0,
      llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl param1,
      ArrayList param2,
      int param3,
      long param4,
      int param6,
      double param7,
      int param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var0;
   }

   public static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   static {
      long var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 12561526719929L;
      Object var11 = null;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((String)var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[26];
      int var5 = 0;
      String var4 = "à\u0088Ï»I\u00054Ì¯\u0011Ë\u000e\u0011äþ#ú\u0012·»ÿ_ÌL !@\u001cÒîÊ²\u0016Ôº\u008e#4K{ò\u0003¥úJ\u008dÁõ\u0088×\u0083^Ð\u0092Ç\u0004§ T\u008c=\u001ea\u0081\u0015\u0019\t¶è®jr\u001c|\u001dwÏpïççp&Õ>\u008f|\\z8\u0010\bÇ.[6\u0096Ó¦\u001b\u0018\u009b·;ª¬\u000e \u001a\b{-J]ç\u0001Ã\u0097H/\u0096¬È*ÏÉ¨\u008a¶\u000b%\u001a>ìç\u008blÀtV\u0010Ç&M\u0087\u0095\u0001\u0093Kî«Dù\u009dú«b(/¢Øí\u0096\u001c\u0087\u000eq\u000b\u0012hÉÚU{< }DÂÀ£5íÀ÷:RA9\tQY\u008bu`6¬Y +ò%Õ£½\u0086y{\u0094j&s0\u0082_L\u0018oß¬ÝñmSyOø\t.¬F \fz\u0002Ai\u0013z-\u0014¶\u007f \u008e\u0004\u0086v¶\u0006$ÇñÆõèh'\u0019\t_¤î\u0093\u0010bH_`®cÓ%ï½¦\u0012 \u0000\u0084\u001d i\u0096tÃ*\u001c#F\r\u0091xÃÈ\u0098$\\©\\µ\u001a8ó´L¨\\\u00ad$\u0080Ê_|\u0010?³4\u0005åÕï½k\u0096ÜJ\u0082×2[\u0018\ryµ!\u001d¶MäÉä\u009eÉDì´ÃRF\u0085ØS/)/ g\u001b\u008f\u00adK`\u0014Or\u009b9@RYi\u0082îú\u000b\u009b \u0006Q\u0003à?ªÆ#5cª *\u0015P\f¹\u009d\u0005»2ÔÕ\u0014(M\u0085S\u008eø\u009eWÈ\tàÂ\u000bk\u0099ç$HH'\u0018\u0098ú'\u008c>V#{\u0091BçV\u009cÌ\u00ad¿\u0017×í-ç\u000b|\u0014 Û\u0018\u0084ÕrXT³lÎ\u008eè:\u0097î\u000b]|åªBoïªì\tGðÝô>é ß\u000b\u008dï³éµ<õÔ\u0097\u0015\u008er$¹ë¯\"`ÇÄ<'Ì\u0086?H\u008b@,\u0017(ñ%@7\u009f¿\u0001\u0092ó´\u0001C\u001f¶¢\"z\u0085Ô\u009d\u0090nz\f\u0089ëW]2oecÌ¨\u009f\u001e=<N\u0081(w^[øT\u0099\u0080q<¶#ObU3þìï\u008ekÅíÒU#\u0096¤LÉ\u0012±.Õ}\u008dk¸ÔÒÔ\u0010{ºN.\u009fw\u0080¯j÷Éu»|\u001a\u009f0\u009d\u000f£åñ6±HqçpÓyØ\u0015\u0017÷â-Ñ`Äé\u0007$»æÖ`$qü¢ð(ª÷×1¡Ñ\u0006þ;¶\fN\u007f \u00956,Ôµ?4\u0091X\u0010xJ÷«Djw\u0087Cø%\u0099);·\u009d\u009fe>{\u0014æ Ó4ý\u0003ü\u009bÌS!ç\"Cz\u0090Oíy9\u0012-²Âf\u0092\n_³ÍÅ?\u001b\u0081";
      int var6 = "à\u0088Ï»I\u00054Ì¯\u0011Ë\u000e\u0011äþ#ú\u0012·»ÿ_ÌL !@\u001cÒîÊ²\u0016Ôº\u008e#4K{ò\u0003¥úJ\u008dÁõ\u0088×\u0083^Ð\u0092Ç\u0004§ T\u008c=\u001ea\u0081\u0015\u0019\t¶è®jr\u001c|\u001dwÏpïççp&Õ>\u008f|\\z8\u0010\bÇ.[6\u0096Ó¦\u001b\u0018\u009b·;ª¬\u000e \u001a\b{-J]ç\u0001Ã\u0097H/\u0096¬È*ÏÉ¨\u008a¶\u000b%\u001a>ìç\u008blÀtV\u0010Ç&M\u0087\u0095\u0001\u0093Kî«Dù\u009dú«b(/¢Øí\u0096\u001c\u0087\u000eq\u000b\u0012hÉÚU{< }DÂÀ£5íÀ÷:RA9\tQY\u008bu`6¬Y +ò%Õ£½\u0086y{\u0094j&s0\u0082_L\u0018oß¬ÝñmSyOø\t.¬F \fz\u0002Ai\u0013z-\u0014¶\u007f \u008e\u0004\u0086v¶\u0006$ÇñÆõèh'\u0019\t_¤î\u0093\u0010bH_`®cÓ%ï½¦\u0012 \u0000\u0084\u001d i\u0096tÃ*\u001c#F\r\u0091xÃÈ\u0098$\\©\\µ\u001a8ó´L¨\\\u00ad$\u0080Ê_|\u0010?³4\u0005åÕï½k\u0096ÜJ\u0082×2[\u0018\ryµ!\u001d¶MäÉä\u009eÉDì´ÃRF\u0085ØS/)/ g\u001b\u008f\u00adK`\u0014Or\u009b9@RYi\u0082îú\u000b\u009b \u0006Q\u0003à?ªÆ#5cª *\u0015P\f¹\u009d\u0005»2ÔÕ\u0014(M\u0085S\u008eø\u009eWÈ\tàÂ\u000bk\u0099ç$HH'\u0018\u0098ú'\u008c>V#{\u0091BçV\u009cÌ\u00ad¿\u0017×í-ç\u000b|\u0014 Û\u0018\u0084ÕrXT³lÎ\u008eè:\u0097î\u000b]|åªBoïªì\tGðÝô>é ß\u000b\u008dï³éµ<õÔ\u0097\u0015\u008er$¹ë¯\"`ÇÄ<'Ì\u0086?H\u008b@,\u0017(ñ%@7\u009f¿\u0001\u0092ó´\u0001C\u001f¶¢\"z\u0085Ô\u009d\u0090nz\f\u0089ëW]2oecÌ¨\u009f\u001e=<N\u0081(w^[øT\u0099\u0080q<¶#ObU3þìï\u008ekÅíÒU#\u0096¤LÉ\u0012±.Õ}\u008dk¸ÔÒÔ\u0010{ºN.\u009fw\u0080¯j÷Éu»|\u001a\u009f0\u009d\u000f£åñ6±HqçpÓyØ\u0015\u0017÷â-Ñ`Äé\u0007$»æÖ`$qü¢ð(ª÷×1¡Ñ\u0006þ;¶\fN\u007f \u00956,Ôµ?4\u0091X\u0010xJ÷«Djw\u0087Cø%\u0099);·\u009d\u009fe>{\u0014æ Ó4ý\u0003ü\u009bÌS!ç\"Cz\u0090Oíy9\u0012-²Âf\u0092\n_³ÍÅ?\u001b\u0081"
         .length();
      char var3 = 24;
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var13 += var3) >= var6) {
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var7;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new String[26];
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "¹q\u001a)ï\u009f\u0090w\u001fZ!Ñ¢\u0088¿+\u0018\b\u007fµuü\u008f½Õ Ã[õa»©T\u008eË\u008c,¬6\u00000";
                  var6 = "¹q\u001a)ï\u009f\u0090w\u001fZ!Ñ¢\u0088¿+\u0018\b\u007fµuü\u008f½Õ Ã[õa»©T\u008eË\u008c,¬6\u00000".length();
                  var3 = 16;
                  var13 = -1;
            }

            var14 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9222;
      if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl", var10
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
         byte[] var9 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5].getBytes("ISO-8859-1");
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5];
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
            "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 37751258091695L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(int var1, int var2) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, int var2
      ) {
         return new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 139085286144560L;
         return "Offset(x="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", z="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 25096444574795L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[2];
         int var7 = 0;
         String var6 = "åNýV8Î\u001bùEy$&ëTI¥ \u0000\u0085p+ø£M\u009bÌ¹\u009d\u009a5ø»\u0087\\®Ò·3t\t\u008eg~*@Æ\u008fVY";
         int var8 = "åNýV8Î\u001bùEy$&ëTI¥ \u0000\u0085p+ø£M\u009bÌ¹\u009d\u009a5ø»\u0087\\®Ò·3t\t\u008eg~*@Æ\u008fVY".length();
         char var5 = 16;
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var13;
            if ((var4 += var5) >= var8) {
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[2];
               return;
            }

            var5 = var6.charAt(var4);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 16555;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
                  var10
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
               "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final BlockPos pos;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private BlockPos IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 62244581171620L;
      private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull BlockPos posArg, double argument2Arg) {
         long var4 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 60331877631678L;
         Intrinsics.checkNotNullParameter(posArg, "pos");
         super();
         this.pos = posArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
      }

      @NotNull
      public final BlockPos getPos() {
         return this.pos;
      }

      public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(double var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final double IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(double var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final double lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(double var1) {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var1;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
            + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final BlockPos IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable BlockPos var1) {
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var1;
      }

      static {
         long var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 19280702892403L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         byte[] var4 = var2.doFinal("54ÑÊX\u00068¡".getBytes("ISO-8859-1"));
         String var5 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4).intern();
         byte var10001 = -1;
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var5;
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
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final ArrayList<llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
      @NotNull
      private final HashMap<BlockPos, Integer> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new HashMap<>();
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 92151853738681L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      @Nullable
      public final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull BlockPos param1, char param2, short param3, int param4
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         long var2
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         long var4 = var2 ^ 106230136776443L;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(2706, 6640213678000624288L ^ var2)
         );
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var1);
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size() - 1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.put(var1.getPos(), var6);
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var6);
      }

      @Nullable
      public final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long param1, byte param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.clear();
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull BlockPos var1, long var2) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(17853, 2827239241631397822L ^ var2)
         );
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.containsKey(var1);
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         char param1,
         @NotNull llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2,
         long param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.size();
      }

      public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
         var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
         String var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            8718902222076458804L, var1
         );

         try {
            boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
            if (var3 != null) {
               return var10000;
            }

            if (!var10000) {
               return true;
            }
         } catch (MatchException var4) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var4, 8703264717460959383L, var1
            );
         }

         return false;
      }

      private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, int param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, int param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 136093721086577L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[7];
         int var7 = 0;
         String var6 = "cÖQxéc\u0011y\u0091FGg>K\u0086\"\u0010\u009c\u0087\tHù\tË?Òõ\u0093\u001c(ÿ³\u0019\u0010bpút2\u0005uM5¢¥0¦)i\u0011 oÙ[Ü\t½ð\u0011rXTØ´Ñcu\u001az\u0005%hÀ:<}Ö\u009dÈØ\u0015\u008a\u0012\u0010\u001d«xj\u0092Ò\u0001P&°Ú\u009d\u008bUH\u0092";
         int var8 = "cÖQxéc\u0011y\u0091FGg>K\u0086\"\u0010\u009c\u0087\tHù\tË?Òõ\u0093\u001c(ÿ³\u0019\u0010bpút2\u0005uM5¢¥0¦)i\u0011 oÙ[Ü\t½ð\u0011rXTØ´Ñcu\u001az\u0005%hÀ:<}Ö\u009dÈØ\u0015\u008a\u0012\u0010\u001d«xj\u0092Ò\u0001P&°Ú\u009d\u008bUH\u0092"
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
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[7];
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

                     var6 = "7ór\u0088\u0097L{\u001b\u0006Hà^-±ËS\u0002wFS\bbÄ\u0006îk×DX\u009fI\u008d\u0018ß\u008cß\u0093¹CgfO,ÿ{m a@\u008d_¯àeO¡\u0095";
                     var8 = "7ór\u0088\u0097L{\u001b\u0006Hà^-±ËS\u0002wFS\bbÄ\u0006îk×DX\u009fI\u008d\u0018ß\u008cß\u0093¹CgfO,ÿ{m a@\u008d_¯àeO¡\u0095"
                        .length();
                     var5 = ' ';
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 3296;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                  var10
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
               "me/octo/client/modules/impl/macros/llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static enum llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      Any,
      Goblin,
      Precursor,
      Jungle,
      Deposits;

      @NotNull
      public static EnumEntries<llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 50781187873734L ^ 58172173545866L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[5];
         int var6 = 0;
         String var5 = "©\u001cñg}>K\rRÝ\u0094\nòÙÊ}\b]\u0086çH¸\u0080¶\u009b\blWÜ>\u008aé\u0098B";
         int var7 = "©\u001cñg}>K\rRÝ\u0094\nòÙÊ}\b]\u0086çH¸\u0080¶\u009b\blWÜ>\u008aé\u0098B".length();
         char var4 = 16;
         int var12 = -1;

         label28:
         while (true) {
            String var13 = var5.substring(++var12, var12 + var4);
            byte var10001 = -1;

            while (true) {
               byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
               String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               switch (var10001) {
                  case 0:
                     var0[var6++] = var19;
                     if ((var12 += var4) >= var7) {
                        Any = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(

                        );
                        Goblin = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(

                        );
                        Precursor = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(

                        );
                        Jungle = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(

                        );
                        Deposits = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(

                        );
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                           IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        );
                        return;
                     }

                     var4 = var5.charAt(var12);
                     break;
                  default:
                     var0[var6++] = var19;
                     if ((var12 += var4) < var7) {
                        var4 = var5.charAt(var12);
                        continue label28;
                     }

                     var5 = "Êy\u0015*\u0012\u0085OÃ\u0010\u008aTª\u009f#Z56\u008e³jl8SXä";
                     var7 = "Êy\u0015*\u0012\u0085OÃ\u0010\u008aTª\u009f#Z56\u008e³jl8SXä".length();
                     var4 = '\b';
                     var12 = -1;
               }

               var13 = var5.substring(++var12, var12 + var4);
               var10001 = 0;
            }
         }
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
   }
}
