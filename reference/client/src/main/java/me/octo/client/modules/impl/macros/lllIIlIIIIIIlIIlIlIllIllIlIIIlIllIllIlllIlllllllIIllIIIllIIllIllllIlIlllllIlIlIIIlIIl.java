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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import me.octo.client.modules.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl {
   @NotNull
   private BlockPos startPos;
   @NotNull
   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII directionData;
   private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final Minecraft IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private final HashSet<BlockPos> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private BlockPos IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private BlockPos llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @Nullable
   private lllIIIlIllIIlIIlllIIIlIllIIIIlIllIlllllIIlIIlIllIIllIlIIlIlIlIlIlIlIlllIIIllIIIIIllll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private ArrayList<AABB> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final HashSet<BlockPos> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private Vec3 IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private final double llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static long IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 19345700290029L;
   private static String[] IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static String[] IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static Map llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new HashMap(13);
   private static long[] lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static Integer[] IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static Map IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static long[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static Long[] lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static Map IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;

   public lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl(
      @NotNull BlockPos startPosArg, @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII directionDataArg
   ) {
      long var3 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ 50558162405850L;
      Intrinsics.checkNotNullParameter(startPosArg, "startPos");
      Intrinsics.checkNotNullParameter(directionDataArg, "directionData");
      super();
      this.startPos = startPosArg;
      this.directionData = directionDataArg;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"u">(
         18913, 8249677805720401051L ^ var3
      );
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"u">(
         817, 1443378667302043210L ^ var3
      );
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var10001;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new llIIIlIIllIIllIlIIIIIlIlIlIIIllIlllIllIlllIllIllIlIIIIIIIlllIIIIIlllIllIIllIlllIllIIl();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = this.startPos.getY();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashSet<>();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.startPos;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         0.0F
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new ArrayList<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashSet<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new Vec3(0.0, 0.0, 0.0);
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.25;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   @NotNull
   public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII getDirectionData() {
      return this.directionData;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1, long var2
   ) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21182, 6208480806701832862L ^ var2)
      );
      this.directionData = var1;
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BlockPos IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1, @NotNull BlockPos var2, long var3) {
      long var5 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18626, 8949002885611226414L ^ var5)
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var2;
   }

   @Nullable
   public final lllIIIlIllIIlIIlllIIIlIllIIIIlIllIlllllIIlIIlIllIIllIlIIlIlIlIlIlIlIlllIIIllIIIIIllll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable lllIIIlIllIIlIIlllIIIlIllIIIIlIllIlllllIIlIIlIllIIllIlIIlIlIlIlIlIlIlllIIIllIIIIIllll var1
   ) {
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   @Nullable
   public final IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI var1
   ) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @NotNull
   public final ArrayList<AABB> IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ArrayList var1, long var2) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21182, 6208392406553444250L ^ var2)
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @NotNull
   public final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1,
      @NotNull Vec3 param3,
      @NotNull Vec3 param4,
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII param5,
      boolean param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final IlIllIlIIllllllIIIIlIIlIIIIIIlllllIIIlIIllIIlllIlIlIIIlIIIlIlIIIIIlIllIlIIlIllIIIIllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, long param2, Vec3 param4, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 var1, long var2, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var4, int var5
   ) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      Vec3[] var8 = new Vec3[3];
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7818206912839492532L, var2
      );
      var8[0] = var1;
      Vec3 var10003 = var1.add(var4.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII().scale(0.2));
      Intrinsics.checkNotNullExpressionValue(
         var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011228284959181786L ^ var2)
      );
      var8[1] = var10003;
      var10003 = var1.add(var4.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl().scale(0.2));
      Intrinsics.checkNotNullExpressionValue(
         var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011228284959181786L ^ var2)
      );
      var8[2] = var10003;
      String var6 = var10000;
      Iterator var7 = CollectionsKt.listOf(var8).iterator();

      label35:
      while (true) {
         Iterator var15 = var7;

         while (var15.hasNext()) {
            var15 = var7;
            if (var6 == null) {
               Vec3 var14 = (Vec3)var7.next();
               Vec3 var9 = var14;
               int var10 = 0;
               if (var10 <= var5) {
                  while (true) {
                     ClientLevel var16 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
                     Intrinsics.checkNotNull(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level);
                     Block var17 = var16.getBlockState(BlockPos.containing((Position)var9)).getBlock();
                     Intrinsics.checkNotNullExpressionValue(
                        var17, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8963, 8507823392043323002L ^ var2)
                     );
                     Block var11 = var17;
                     if (lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .contains(var11)) {
                        try {
                           return true;
                        } catch (NoWhenBranchMatchedException var12) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var12, 7801309741705160660L, var2
                           );
                        }
                     }

                     Vec3 var18 = var9.add(var4.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI());
                     Intrinsics.checkNotNullExpressionValue(
                        var18, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011228284959181786L ^ var2)
                     );
                     var9 = var18;
                     if (var10 == var5) {
                        continue label35;
                     }

                     var10++;
                  }
               }
               continue label35;
            }
         }

         return false;
      }
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 var1, long var2, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var4
   ) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      ClientLevel var10000 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level;
      Intrinsics.checkNotNull(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.level);
      Block var7 = var10000.getBlockState(
            BlockPos.containing((Position)var1.add(var4.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()))
         )
         .getBlock();
      Intrinsics.checkNotNullExpressionValue(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8963, 8507742850357790961L ^ var2)
      );
      Block var5 = var7;
      return lIIlIllIIlIllIllIlIlllIlIlllllIIllllIIlIlIllIllIllIIIIIlllIIlIIlIllllIIIIllIIlIIlIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .contains(var5);
   }

   private final Pair IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll param1, @Nullable BlockPos param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, @NotNull BlockPos param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Vec3 param1, long param2, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, @NotNull Vec3 param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, Vec3 var3, Vec3 var4, int var5) {
      var1 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var1;
      long var6 = var1 ^ 30807416223442L;
      long var8 = var1 ^ 79182459918L;
      Iterable var12 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3,
            me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var6, var5),
            var8
         );
      boolean var13 = false;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -463342885359143334L, var1
      );
      var var15 = new ArrayList();
      String var10 = var10000;
      if (var10 != null) {
         boolean var36 = false;
         boolean var39 = false;
         Iterator var42 = var12.iterator();
         if (var42.hasNext()) {
            Object var45 = var42.next();
            if (var10 == null) {
               boolean var48 = false;
               Pair var51 = (Pair)var45;
               boolean var54 = false;
               Block var66 = (Block)var51.getSecond();
               if (var66 != null) {
                  Block var57 = var66;
                  boolean var60 = false;
                  var15.add(var57);
               }
            }
         }

         var var67 = var15;
         me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var69 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var70 = var3.add(0.0, 1.0, 0.0);
         Intrinsics.checkNotNullExpressionValue(
            var70, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011235734171573812L ^ var1)
         );
         me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var71 = me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var72 = var3.add(0.0, 1.0, 0.0);
         Intrinsics.checkNotNullExpressionValue(
            var72, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011235734171573812L ^ var1)
         );
         var12 = var69.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var70, var71.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var72, var4, var6, var5), var8
         );
         Collection var62 = var67;
         var13 = false;
         var15 = new ArrayList();
         var36 = false;
         var39 = false;
         var42 = var12.iterator();
         if (var42.hasNext()) {
            Object var46 = var42.next();
            if (var10 == null) {
               boolean var49 = false;
               Pair var52 = (Pair)var46;
               boolean var55 = false;
               Block var68 = (Block)var52.getSecond();
               if (var68 != null) {
                  Block var58 = var68;
                  boolean var61 = false;
                  var15.add(var58);
               }
            }
         }

         return CollectionsKt.plus(var62, var15);
      } else {
         boolean var16 = false;
         boolean var18 = false;

         for (Object var20 : var12) {
            if (var10 == null) {
               boolean var47 = false;
               Pair var50 = (Pair)var20;
               boolean var53 = false;
               Block var65 = (Block)var50.getSecond();
               if (var65 != null) {
                  Block var56 = var65;
                  boolean var59 = false;
                  var15.add(var56);
               }
               continue;
            }
            break;
         }

         var var63 = var15;
         me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var10002 = var3.add(0.0, 1.0, 0.0);
         Intrinsics.checkNotNullExpressionValue(
            var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011235734171573812L ^ var1)
         );
         me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10003 = me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         Vec3 var10004 = var3.add(0.0, 1.0, 0.0);
         Intrinsics.checkNotNullExpressionValue(
            var10004, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011235734171573812L ^ var1)
         );
         var12 = var10001.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var10002, var10003.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10004, var4, var6, var5), var8
         );
         Collection var27 = var63;
         var13 = false;
         var15 = new ArrayList();
         var16 = false;
         var18 = false;

         for (Object var44 : var12) {
            if (var10 == null) {
               boolean var22 = false;
               Pair var23 = (Pair)var44;
               boolean var24 = false;
               Block var64 = (Block)var23.getSecond();
               if (var64 != null) {
                  Block var25 = var64;
                  boolean var26 = false;
                  var15.add(var25);
               }
               continue;
            }
            break;
         }

         return CollectionsKt.plus(var27, var15);
      }
   }

   private final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Vec3 var1, long var2, Vec3 var4, int var5) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      long var6 = var2 ^ 91027449880014L;
      long var8 = var2 ^ 86721772216082L;
      me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10000 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10001 = var1.subtract(0.0, 1.0, 0.0);
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21745, 2484399344983705464L ^ var2)
      );
      me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10002 = me.octo.client.utils.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10003 = var1.subtract(0.0, 1.0, 0.0);
      Intrinsics.checkNotNullExpressionValue(
         var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20560, 6789469810704647119L ^ var2)
      );
      Iterable var11 = var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var10001, var10002.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10003, var4, var6, var5), var8
      );
      boolean var12 = false;
      String var27 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3274769124860912314L, var2
      );
      var var14 = new ArrayList();
      String var10 = var27;
      boolean var15 = false;
      boolean var17 = false;

      for (Object var19 : var11) {
         if (var10 == null) {
            boolean var21 = false;
            Pair var22 = (Pair)var19;
            boolean var23 = false;
            Block var28 = (Block)var22.getSecond();
            if (var28 != null) {
               Block var24 = var28;
               boolean var25 = false;
               var14.add(var24);
            }

            if (var10 == null) {
               continue;
            }
         }
         break;
      }

      return var14;
   }

   private final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
      Vec3 var2 = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
            this.directionData.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() + var1
         )
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      return new BlockPos((int)Math.rint(var2.x), 0, (int)Math.rint(var2.z));
   }

   @Nullable
   public final BlockPos IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      short param1, char param2, int param3, @NotNull BlockPos param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return true;
   }

   public final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      this.directionData = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
         this.directionData.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() + 180.0F
      );
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         0.0F
      );
      this.startPos = me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll();
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = this.startPos;
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var1, char var2, short var3, BlockPos var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1579787528985467431L, var5
      );
      int var8 = -3;
      String var7 = var10000;

      while (true) {
         byte var12;
         if (var8 < 4) {
            var12 = -3;
            if (var7 == null) {
               for (int var9 = -3; var9 < 4; var9++) {
                  try {
                     try {
                        var13 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.contains(var4.offset(var8, 0, var9));
                     } catch (NoWhenBranchMatchedException var10) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var10, 1571897282463866439L, var5
                        );
                     }

                     if (var13) {
                        return true;
                     }
                  } catch (NoWhenBranchMatchedException var11) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var11, 1571897282463866439L, var5
                     );
                  }
               }

               var8++;
               continue;
            }
         } else {
            var12 = 0;
         }

         return (boolean)var12;
      }
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull BlockPos var1, long var2) {
      var2 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var2;
      long var4 = var2 ^ 27660661185895L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7903220783683871334L, var2
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20087, 2875243551017706180L ^ var2)
      );
      String var6 = var10000;
      int var7 = -1;

      while (true) {
         if (var7 >= 2) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
               var4,
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8822, 1197741550649102038L ^ var2)
                  + var1.getX()
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9164, 8817213220785213307L ^ var2)
                  + var1.getZ()
            );
            break;
         }

         if (var6 != null) {
            break;
         }

         int var8 = -1;

         while (var8 < 2) {
            try {
               this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.add(var1.offset(var7, 0, var8));
               var8++;
            } catch (NoWhenBranchMatchedException var9) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var9, 7895348139712472582L, var2
               );
            }
         }

         var7++;
      }
   }

   public final void IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.clear();
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl param0,
      ObjectRef param1,
      BooleanRef param2,
      BlockPos param3,
      long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Vec3 IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(BlockPos var0, long var1) {
      var1 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ var1;
      long var3 = var1 ^ 24307076963341L;
      Vec3 var10000 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var3, var0)
         .add(0.0, 0.01, 0.0);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9888, 8011309484859769369L ^ var1)
      );
      return var10000;
   }

   static {
      long var22 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll ^ 49800086607864L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[48];
      int var29 = 0;
      String var28 = "\u000bÊâø\\åjÏª_>\u0015l7{Ò\rø\u0013Í9^rè\u0098L\u0015Ã&x[\u001f@ïgX{MO\u0019R\u008a\b«,\u009f#,Tø\u0017ø9J8äè½§#k![\u007f/¾º¨vçÚ i\u0010KõæÛÓÉ#y\u0006\u0004Q`\f÷\u0010ªÑ/½\u009bp\u0084ç í\u008dB3\u001c\u009ddh\u0001\u0095tæE\u009bÍ\u0007Bh·\u008eâI\n±\u0088\u0005aßÓßaÎ\u0010å.\u0085 jöñpÑS¢«Â:\tl 6¦h/¬|íÁ.h6P\u0011\u0003\u009eO\u0086ÓÁ¨\u0098ûè´\u008fÿ\u009eÄÚZrv {\u0018QÇ\u0091|5\u001b\u0096Á\u0096F\b\u008c±d\u000e\u001ez\u001f³\u008fk)íæõdD\u009c¬Û8\u0088jÒI\u0000\\wk5sQm\u0018,w4õ\u0013\u00802L\u0014\u0004\u0089\u0088¢±ÎG\u0002µ')\"õ¢£5\u0086\u0095\u0002½t.ÜuÈX\u0083\u00adqÄÆí2\u0002\u0010Ø\u0018_ÿ\u0093Û@\u000e¤>\u001c\bYs¸\u000b\u0010\u0084/d¾ÿ\u0093\u0093\r\u0014ãöC©&^»\u0018B\b\u0014÷òë<Z¤®£&ð\u0090y`ÀógQ¤bù±\u0010eÉ\u001e\\ÔÚùå¬\u009b*FÐ\u0083\u000bñ8æ\u0084S\u007fã\u0003oPHÙër«\u0012\b\u008d\u009asïº³ós\u009e-(¸ \u008a¨&Þá^K3zÄµÔ*4x\u001are¨\u001c6C\u001e/#ÅÏü ðQ\u0089á\u0005µ\u000b÷\u007fàùfxOí\u001b·±P\u0003÷W\u001fÓªÌ)Ô\t\u0082Û\u0012\u0018Ïøo\u009eT½\u0081\u0092OaJíL¤\u001e\u0090\u001a*d\u0096¿.\u008f£ \u008e\u009407\u00175,ñ»Èg²\u0010ÉÜ\u0080\u0016µÆîíby\u009d\u00077ÏP\u0099¯\u008e¶\u0018\u008d\u0001\u0099)¢Ñä@Àv\u009eoåÞÏ¸ëì\u0003û/Ïh\u000e@c\u0002\në½\u00ad\u0005ÓËK¿2\u009f5â\u009d·Ý&Ð¦tz\u008c\u0094\u009b\u0095ùÊ\f¬Ôö\u0095\u009aT¹\u009aÿgwâ¿&d!NÇºñq7Õ¹\u0085ª7¥ë\u0095*ï\u0005B E\u0006ª\u0004¼\u009bT\u0002\u0082\u0097'Ã0\u007f\u000f\u008aPP9-AV³²ä\u0018\u008fC\u0007â\u0099X0Lií#\u0082È38¦Îç¤ò\u009fDX\u0016ül«êéäK7ê\\\\m\u008c\u0091:¾±È\u0094ë\u000f¦=´nzB×û¢-8©%4=\u000e \rt\u000f\u0086pi×xÈ£ÙIÁl:\u0081Y1\u001e\u000f¹\u001cÅõ\b\u00181Ê\u009f%ý\u0085 \u0016_&\u009a\u000bú\rbB<À¡ªjþô\u009a Ú0\u009f\u009cëâ\u007fø3ùþ§rE!\u0086\u0087k\u0093V¶I\u0095<\u009e¸6wM\u0004Ýû`\b\u0086Ñ¡\u0091\u0099\u001f¬Uot\u001d£ÈÈ¬Ð'ÎÆ@4y\u0098Ã\u007f¯¹×Vÿ\u0002}\u0016ò\u0081\u000fé\u001a¶È\u0093V¦4ÐÀ\u0005§\u0085ÈÎ-Ð£\u009bê!]r\u000f\u001b~XÚé\t\u0091\u0081\u0019¨\u008cÓ9°Âñ\u0016\u001aÆÿ¾_?\u0090\u009c\u0018_çé\u0000GD*\u0010Ó(ÇbÅ¦\u001dý)\u0086@\u008abÏÁUN·ÞÊöZ=\u0092Åìv¢F\u0000\u001eñ¦©«Ý\u0088í\u0092Íè\u007f(@ø +Áßß¡êæ\u001eá¨ª4óá»\u0095\n±q/\u008d]mËÐ\u009a\u009d\u008dRö\u0017)8\u0098r½\u001c \u0006&Â)¥tçÛ9Ä\u001cK\u009bê1Q+\u0013\u0003ZIT\u0084n9M¤\b*<\u0002\u008a\u0018Ç\u008eNb\u00109\u0098Ëo\b\u0082Þ\u0081»4Â)æ\u0095ÔJväè ¾\u009cö[P\u0007\u0092,!\u0015u¥B*é\u0081_\b´)\u0010\u0094f¤±\u0093¼¸\u001a\u0014\u0013É $¡ïu\u0012Î\u0090ÄGN²5l{¢¶e\u0001ÜP\u0003þ,\u009cjýÚ\u008c\u001f\u008cD\u008d\u0018WËH\u009dp^#¦Äõ½(¿\u0007ê®(!G¡\b*\u008e]\u0018'}_\u008aÓÐ\u0002\f\u0092nJæ\u008d\u0095ês\u0099\u009b\b¾2cë5 ¸\u0006\u0000\u009a\u0093\u0000¢Ü)\u001a_ô¹,³\u001fýÞW¶\u0088Äo\u00adðâ\u0093\u0090!è\u008c®\u0018ë¡ß\u0018\u0092éMVòOñC\u0006\u0091\u007f'\u009ay½¿¦_r}(îÃ£Ë1\u009cæõ\u0003 óÍ¥Z³\u009fÇ¬\u0019HÝ¡\u0092©ï\u0084 ÝÒ I\u0082[Þë\u009dVfï\"@\u001etáëCßï\u0007HÃ\n\u0002k\u0092\\\u009aÐFWîzîM\u009b}Þ\b\u009e¸I@v½\u0080*V\u0001>}ê\u0013\rQn¸êúÁ\u008e\u0017Z£\u0088\u0081\u0082FZUêÐªsÌ\u008c +Ä£M\nêLÝgb³¬kÁG\\=':\u0084ÍoèaFk=-wN-\u001c8HâÖ!rN)\u0092\fÓ\u0085\u0094^pÏpb±\u0011\u0088è±\u0013ó\u0002H\u0016O\u0084\u009e\u009a)\u0006'Ø\u0085\u009ey(yÙ\u0010¾£A:K\u009a\u0083\u009d3\u0006¹\u0091\u0019\u000f ý¾@\f¤É²]½í\u0099\u0096q\u0019+\u008dõ·õ1@p\u000bê\u001eM7-Z\u000e\u0083\u000e\u0010\u00125<`£\u000eJèòÏ£ù,Á.Ç\u0010\u00813²ér+ôÊ\n\u0098Ù,\u0080;qi8\u001e«Â{ç\u008bn\tOÒ¢ ïN\u001cûÅ©n\u009fØg´\u008a×Õf¿Ü\\\u0096×\u008d\\?\"\u0087Á(³XK\u00867Ø\u0093ý2?\u0001\u000b\fÈ¾¸T W\u0081\u001a\fþ·Ë§\u009a\\á\u0006AÕ\u008ewÜÜ\u0014¸èØE½À;\u0014¾ß\u0012b\u0095 i\u0091SH\u0000lù)Ï\u001b<8\u0012(Ñk4¹|êÊg\u0081\u001aþ×â\u007f2W?¯(1\u009dCfÜl\u009dø\nâø\u0098\u007fCN5)Pà\u0094\u0010×\u009dø^RÞ\u0089(â\u00ad}i©\u00078\u008aÿ\rO(ð °þ\u0096ë\rÓÄ\u0095õ\rë\u0001\t\u0099hôYãE\\\u001f|\u0080\u0084ÙÆÇÇø\u0018ÂvN,Æ\u008d¶\u0007\u0010ÕL\u0019\nO-L¦\u001fnÌñ/-P\u001b\u0010èÍ^ã_:&\"ëàÆ`hÛ\u0098\u009a";
      int var30 = "\u000bÊâø\\åjÏª_>\u0015l7{Ò\rø\u0013Í9^rè\u0098L\u0015Ã&x[\u001f@ïgX{MO\u0019R\u008a\b«,\u009f#,Tø\u0017ø9J8äè½§#k![\u007f/¾º¨vçÚ i\u0010KõæÛÓÉ#y\u0006\u0004Q`\f÷\u0010ªÑ/½\u009bp\u0084ç í\u008dB3\u001c\u009ddh\u0001\u0095tæE\u009bÍ\u0007Bh·\u008eâI\n±\u0088\u0005aßÓßaÎ\u0010å.\u0085 jöñpÑS¢«Â:\tl 6¦h/¬|íÁ.h6P\u0011\u0003\u009eO\u0086ÓÁ¨\u0098ûè´\u008fÿ\u009eÄÚZrv {\u0018QÇ\u0091|5\u001b\u0096Á\u0096F\b\u008c±d\u000e\u001ez\u001f³\u008fk)íæõdD\u009c¬Û8\u0088jÒI\u0000\\wk5sQm\u0018,w4õ\u0013\u00802L\u0014\u0004\u0089\u0088¢±ÎG\u0002µ')\"õ¢£5\u0086\u0095\u0002½t.ÜuÈX\u0083\u00adqÄÆí2\u0002\u0010Ø\u0018_ÿ\u0093Û@\u000e¤>\u001c\bYs¸\u000b\u0010\u0084/d¾ÿ\u0093\u0093\r\u0014ãöC©&^»\u0018B\b\u0014÷òë<Z¤®£&ð\u0090y`ÀógQ¤bù±\u0010eÉ\u001e\\ÔÚùå¬\u009b*FÐ\u0083\u000bñ8æ\u0084S\u007fã\u0003oPHÙër«\u0012\b\u008d\u009asïº³ós\u009e-(¸ \u008a¨&Þá^K3zÄµÔ*4x\u001are¨\u001c6C\u001e/#ÅÏü ðQ\u0089á\u0005µ\u000b÷\u007fàùfxOí\u001b·±P\u0003÷W\u001fÓªÌ)Ô\t\u0082Û\u0012\u0018Ïøo\u009eT½\u0081\u0092OaJíL¤\u001e\u0090\u001a*d\u0096¿.\u008f£ \u008e\u009407\u00175,ñ»Èg²\u0010ÉÜ\u0080\u0016µÆîíby\u009d\u00077ÏP\u0099¯\u008e¶\u0018\u008d\u0001\u0099)¢Ñä@Àv\u009eoåÞÏ¸ëì\u0003û/Ïh\u000e@c\u0002\në½\u00ad\u0005ÓËK¿2\u009f5â\u009d·Ý&Ð¦tz\u008c\u0094\u009b\u0095ùÊ\f¬Ôö\u0095\u009aT¹\u009aÿgwâ¿&d!NÇºñq7Õ¹\u0085ª7¥ë\u0095*ï\u0005B E\u0006ª\u0004¼\u009bT\u0002\u0082\u0097'Ã0\u007f\u000f\u008aPP9-AV³²ä\u0018\u008fC\u0007â\u0099X0Lií#\u0082È38¦Îç¤ò\u009fDX\u0016ül«êéäK7ê\\\\m\u008c\u0091:¾±È\u0094ë\u000f¦=´nzB×û¢-8©%4=\u000e \rt\u000f\u0086pi×xÈ£ÙIÁl:\u0081Y1\u001e\u000f¹\u001cÅõ\b\u00181Ê\u009f%ý\u0085 \u0016_&\u009a\u000bú\rbB<À¡ªjþô\u009a Ú0\u009f\u009cëâ\u007fø3ùþ§rE!\u0086\u0087k\u0093V¶I\u0095<\u009e¸6wM\u0004Ýû`\b\u0086Ñ¡\u0091\u0099\u001f¬Uot\u001d£ÈÈ¬Ð'ÎÆ@4y\u0098Ã\u007f¯¹×Vÿ\u0002}\u0016ò\u0081\u000fé\u001a¶È\u0093V¦4ÐÀ\u0005§\u0085ÈÎ-Ð£\u009bê!]r\u000f\u001b~XÚé\t\u0091\u0081\u0019¨\u008cÓ9°Âñ\u0016\u001aÆÿ¾_?\u0090\u009c\u0018_çé\u0000GD*\u0010Ó(ÇbÅ¦\u001dý)\u0086@\u008abÏÁUN·ÞÊöZ=\u0092Åìv¢F\u0000\u001eñ¦©«Ý\u0088í\u0092Íè\u007f(@ø +Áßß¡êæ\u001eá¨ª4óá»\u0095\n±q/\u008d]mËÐ\u009a\u009d\u008dRö\u0017)8\u0098r½\u001c \u0006&Â)¥tçÛ9Ä\u001cK\u009bê1Q+\u0013\u0003ZIT\u0084n9M¤\b*<\u0002\u008a\u0018Ç\u008eNb\u00109\u0098Ëo\b\u0082Þ\u0081»4Â)æ\u0095ÔJväè ¾\u009cö[P\u0007\u0092,!\u0015u¥B*é\u0081_\b´)\u0010\u0094f¤±\u0093¼¸\u001a\u0014\u0013É $¡ïu\u0012Î\u0090ÄGN²5l{¢¶e\u0001ÜP\u0003þ,\u009cjýÚ\u008c\u001f\u008cD\u008d\u0018WËH\u009dp^#¦Äõ½(¿\u0007ê®(!G¡\b*\u008e]\u0018'}_\u008aÓÐ\u0002\f\u0092nJæ\u008d\u0095ês\u0099\u009b\b¾2cë5 ¸\u0006\u0000\u009a\u0093\u0000¢Ü)\u001a_ô¹,³\u001fýÞW¶\u0088Äo\u00adðâ\u0093\u0090!è\u008c®\u0018ë¡ß\u0018\u0092éMVòOñC\u0006\u0091\u007f'\u009ay½¿¦_r}(îÃ£Ë1\u009cæõ\u0003 óÍ¥Z³\u009fÇ¬\u0019HÝ¡\u0092©ï\u0084 ÝÒ I\u0082[Þë\u009dVfï\"@\u001etáëCßï\u0007HÃ\n\u0002k\u0092\\\u009aÐFWîzîM\u009b}Þ\b\u009e¸I@v½\u0080*V\u0001>}ê\u0013\rQn¸êúÁ\u008e\u0017Z£\u0088\u0081\u0082FZUêÐªsÌ\u008c +Ä£M\nêLÝgb³¬kÁG\\=':\u0084ÍoèaFk=-wN-\u001c8HâÖ!rN)\u0092\fÓ\u0085\u0094^pÏpb±\u0011\u0088è±\u0013ó\u0002H\u0016O\u0084\u009e\u009a)\u0006'Ø\u0085\u009ey(yÙ\u0010¾£A:K\u009a\u0083\u009d3\u0006¹\u0091\u0019\u000f ý¾@\f¤É²]½í\u0099\u0096q\u0019+\u008dõ·õ1@p\u000bê\u001eM7-Z\u000e\u0083\u000e\u0010\u00125<`£\u000eJèòÏ£ù,Á.Ç\u0010\u00813²ér+ôÊ\n\u0098Ù,\u0080;qi8\u001e«Â{ç\u008bn\tOÒ¢ ïN\u001cûÅ©n\u009fØg´\u008a×Õf¿Ü\\\u0096×\u008d\\?\"\u0087Á(³XK\u00867Ø\u0093ý2?\u0001\u000b\fÈ¾¸T W\u0081\u001a\fþ·Ë§\u009a\\á\u0006AÕ\u008ewÜÜ\u0014¸èØE½À;\u0014¾ß\u0012b\u0095 i\u0091SH\u0000lù)Ï\u001b<8\u0012(Ñk4¹|êÊg\u0081\u001aþ×â\u007f2W?¯(1\u009dCfÜl\u009dø\nâø\u0098\u007fCN5)Pà\u0094\u0010×\u009dø^RÞ\u0089(â\u00ad}i©\u00078\u008aÿ\rO(ð °þ\u0096ë\rÓÄ\u0095õ\rë\u0001\t\u0099hôYãE\\\u001f|\u0080\u0084ÙÆÇÇø\u0018ÂvN,Æ\u008d¶\u0007\u0010ÕL\u0019\nO-L¦\u001fnÌñ/-P\u001b\u0010èÍ^ã_:&\"ëàÆ`hÛ\u0098\u009a"
         .length();
      char var27 = ' ';
      int var26 = -1;

      while (true) {
         byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
         String var57 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32).intern();
         byte var10001 = -1;
         var31[var29++] = var57;
         if ((var26 += var27) >= var30) {
            var28 = "w\u0014è\u000bñ×_Ò'¿Lõd\u0014\u0017V\u009fÊ)\u001eP\u008fÒ\u008f\u0010ÓI\u000e%\u0087¯à¸\u009e{:\u0004EV\u0088\u009b";
            var30 = "w\u0014è\u000bñ×_Ò'¿Lõd\u0014\u0017V\u009fÊ)\u001eP\u008fÒ\u008f\u0010ÓI\u000e%\u0087¯à¸\u009e{:\u0004EV\u0088\u009b".length();
            var27 = '\u0018';
            var26 = -1;

            while (true) {
               var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
               String var59 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32).intern();
               int var49 = 0;
               var31[var29++] = var59;
               if ((var26 += var27) >= var30) {
                  IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var31;
                  IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new String[48];
                  IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var12 = 1; var12 < 8; var12++) {
                     var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[2];
                  int var14 = 0;
                  String var15 = ":\u000bö©^Ó\u0095\u0017®Ì»-«ûºp";
                  int var16 = ":\u000bö©^Ó\u0095\u0017®Ì»-«ûºp".length();
                  byte var13 = 0;

                  do {
                     var49 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var49, var13).getBytes("ISO-8859-1");
                     var49 = var14++;
                     long var19 = (var18[0] & 255L) << 56
                        | (var18[1] & 255L) << 48
                        | (var18[2] & 255L) << 40
                        | (var18[3] & 255L) << 32
                        | (var18[4] & 255L) << 24
                        | (var18[5] & 255L) << 16
                        | (var18[6] & 255L) << 8
                        | var18[7] & 255L;
                     byte[] var21 = var11.doFinal(
                        new byte[]{
                           (byte)(var19 >>> 56),
                           (byte)(var19 >>> 48),
                           (byte)(var19 >>> 40),
                           (byte)(var19 >>> 32),
                           (byte)(var19 >>> 24),
                           (byte)(var19 >>> 16),
                           (byte)(var19 >>> 8),
                           (byte)var19
                        }
                     );
                     long var10004 = (var21[0] & 255L) << 56
                        | (var21[1] & 255L) << 48
                        | (var21[2] & 255L) << 40
                        | (var21[3] & 255L) << 32
                        | (var21[4] & 255L) << 24
                        | (var21[5] & 255L) << 16
                        | (var21[6] & 255L) << 8
                        | var21[7] & 255L;
                     byte var64 = -1;
                     var17[var49] = var10004;
                  } while (var13 < var16);

                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var17;
                  IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new Integer[2];
                  IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = ";aîÍ\u0085¾R\\ýå×IÑ&\u0096Ö";
                  int var5 = ";aîÍ\u0085¾R\\ýå×IÑ&\u0096Ö".length();
                  byte var2 = 0;

                  do {
                     int var53 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                     var53 = var3++;
                     long var8 = (var7[0] & 255L) << 56
                        | (var7[1] & 255L) << 48
                        | (var7[2] & 255L) << 40
                        | (var7[3] & 255L) << 32
                        | (var7[4] & 255L) << 24
                        | (var7[5] & 255L) << 16
                        | (var7[6] & 255L) << 8
                        | var7[7] & 255L;
                     byte[] var10 = var0.doFinal(
                        new byte[]{
                           (byte)(var8 >>> 56),
                           (byte)(var8 >>> 48),
                           (byte)(var8 >>> 40),
                           (byte)(var8 >>> 32),
                           (byte)(var8 >>> 24),
                           (byte)(var8 >>> 16),
                           (byte)(var8 >>> 8),
                           (byte)var8
                        }
                     );
                     long var68 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var66 = -1;
                     var6[var53] = var68;
                  } while (var2 < var5);

                  var4 = "\u001cÊb\u0015¤yùÈ^\u0013zVP1\u001eU";
                  var5 = "\u001cÊb\u0015¤yùÈ^\u0013zVP1\u001eU".length();
                  var2 = 0;

                  do {
                     int var55 = var2;
                     var2 += 8;
                     byte[] var36 = var4.substring(var55, var2).getBytes("ISO-8859-1");
                     var55 = var3++;
                     long var37 = (var36[0] & 255L) << 56
                        | (var36[1] & 255L) << 48
                        | (var36[2] & 255L) << 40
                        | (var36[3] & 255L) << 32
                        | (var36[4] & 255L) << 24
                        | (var36[5] & 255L) << 16
                        | (var36[6] & 255L) << 8
                        | var36[7] & 255L;
                     byte[] var38 = var0.doFinal(
                        new byte[]{
                           (byte)(var37 >>> 56),
                           (byte)(var37 >>> 48),
                           (byte)(var37 >>> 40),
                           (byte)(var37 >>> 32),
                           (byte)(var37 >>> 24),
                           (byte)(var37 >>> 16),
                           (byte)(var37 >>> 8),
                           (byte)var37
                        }
                     );
                     long var69 = (var38[0] & 255L) << 56
                        | (var38[1] & 255L) << 48
                        | (var38[2] & 255L) << 40
                        | (var38[3] & 255L) << 32
                        | (var38[4] & 255L) << 24
                        | (var38[5] & 255L) << 16
                        | (var38[6] & 255L) << 8
                        | var38[7] & 255L;
                     boolean var67 = false;
                     var6[var55] = var69;
                  } while (var2 < var5);

                  lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var6;
                  lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new Long[4];
                  return;
               }

               var27 = var28.charAt(var26);
            }
         }

         var27 = var28.charAt(var26);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 757;
      if (IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl", var10
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
         byte[] var9 = IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5].getBytes("ISO-8859-1");
         IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll[var5];
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
            "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18764;
      if (IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll[var3] = var15;
      }

      return IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll[var3];
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
            "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30843;
      if (lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI[var3] = var15;
      }

      return lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI[var3];
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lllIIlIIIIIIlIIlIlIllIllIlIIIlIllIllIlllIlllllllIIllIIIllIIllIllllIlIlllllIlIlIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
