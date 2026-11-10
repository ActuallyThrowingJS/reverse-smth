package me.octo.client.modules;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.modules.impl.features.qol.Etherwarp;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.player.MovementUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII
   extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   private static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private final int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private final double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private final double IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private final double IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private final double IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private final double IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private final double llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private final int IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final double[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private final double llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private final int lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private final double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private final int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private final int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private final int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private final int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private final long IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private final double IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private final int lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private final int lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private final int IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private final int IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private final long IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   @Nullable
   private Vec3 IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private boolean IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @Nullable
   private Vec3 lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   @Nullable
   private Vec3 lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @Nullable
   private Vec3 lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private List<? extends Vec3> IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private int llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private int llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private int IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private double llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private boolean IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @Nullable
   private Vec3 lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private Vec3 llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final ArrayList<Vec3> lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private boolean IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private int lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @NotNull
   private volatile IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @Nullable
   private volatile IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private volatile int lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   @NotNull
   private String IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   @Deprecated
   public static double llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   @Deprecated
   public static double IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private static long IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = 77398446996515L;
   private static String[] IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   private static String[] lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   private static Map lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = new HashMap(13);
   private static long[] llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   private static Integer[] IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   private static Map IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private static long[] IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private static Long[] IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private static Map llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;

   public IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII() {
      long var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ 39127287278682L;
      super();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 2.0;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 0.25;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 0.5;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         11920, 5271217848108699190L ^ var1
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         10485, 2973865663172757588L ^ var1
      );
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         3108, 3558966794132515974L ^ var1
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         22400, 8546575308857816873L ^ var1
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         28748, 6092844874453225698L ^ var1
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         4395, 6133944744287531395L ^ var1
      );
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 2.0;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.18;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 0.12;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 0.4;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 2.5;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.0025;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         17883, 5570224751021368692L ^ var1
      );
      double[] var3 = new double[]{0.05, 0.3, 0.5, 0.7, 0.95};
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var3;
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 40.0;
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         4311, 8624864889521041522L ^ var1
      );
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = 2.0;
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         25983, 2161111354613138911L ^ var1
      );
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         15154, 6809535078278290328L ^ var1
      );
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         5874, 7546258548109866591L ^ var1
      );
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         9557, 6572033753649726961L ^ var1
      );
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"s">(
         18746, 1688822206676064145L ^ var1
      );
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 0.16;
      this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         14323, 1120005256645859160L ^ var1
      );
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         25179, 8448855444167033592L ^ var1
      );
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         18449, 23884120948156598L ^ var1
      );
      this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(
         7355, 1077885225259006999L ^ var1
      );
      this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"s">(
         11916, 5681231566580789285L ^ var1
      );
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = CollectionsKt.emptyList();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = Double.MAX_VALUE;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new ArrayList<>();
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IDLE;
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = "";
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   private final int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
   }

   private final int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
   }

   private final int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII();
   }

   public final boolean IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3, String param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, long var2) {
      var2 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var2;
      long var4 = var2 ^ 23096767355446L;

      try {
         if (!Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()) {
            return;
         }
      } catch (NoSuchElementException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -8160247848753373934L, var2
         );
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(9289, 4370735505099269458L ^ var2)
            + var1
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(12679, 960666067507851497L ^ var2),
         var4
      );
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, Vec3 var3) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      String var4 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(23673, 4153815578305027988L ^ var1);
      Object[] var5 = new Object[]{var3.x, var3.y, var3.z};
      String var10000 = String.format(var4, Arrays.copyOf(var5, var5.length));
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(30712, 3149774839238784087L ^ var1)
      );
      return var10000;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull BlockPos param1, @Nullable Integer param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, BlockPos param3, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(BlockPos param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1,
      BlockPos var2,
      char var3,
      Vec3 var4,
      char var5,
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6
   ) {
      long var7 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var5 << 48 >>> 48)
         ^ IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      long var10001 = var7 ^ 100687630267465L;
      int var9 = (int)((var7 ^ 100687630267465L) >>> 48);
      int var10 = (int)((var7 ^ 100687630267465L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var7 ^ 132291341881189L;
      String var14 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7656138300602592880L, var7
      );

      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000;
      Vec3 var10002;
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10003;
      try {
         var10000 = me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         var16 = var2;
         var10002 = var4;
         var10003 = var6;
         boolean var10004 = Intrinsics.areEqual(
            Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var12),
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(22466, 4800183883539532884L ^ var7)
         );
         if (var14 != null) {
            return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var2, var4, var6, var10004, (short)var9, var10, (char)var11
            );
         }

         if (!var10004) {
            return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var2, var4, var6, true, (short)var9, var10, (char)var11
            );
         }
      } catch (NoSuchElementException var15) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var15, -7755887620555552881L, var7
         );
      }

      return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var16, var10002, var10003, false, (short)var9, var10, (char)var11
      );
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(BlockPos param1, Vec3 param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(BlockPos param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(BlockPos param1, Vec3 param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 107431239327461L;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = CollectionsKt.emptyList();
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = true;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(10898, 8894158910163195280L ^ var1),
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(18552, 5465108695296964372L ^ var1)
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(BlockPos var1, long var2, Vec3 var4, List var5) {
      var2 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var2;
      long var6 = var2 ^ 85354300019603L;
      long var8 = var2 ^ 24602939248110L;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var4;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var5;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = 0;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = Double.MAX_VALUE;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var6,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(10898, 8894128174037145830L ^ var2),
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(19050, 3493733833241524321L ^ var2)
            + this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var4)
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(27793, 6573492427594227335L ^ var2)
            + var5.size()
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(25447, 1085852049757032801L ^ var2)
      );
   }

   private final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      BlockPos var1,
      me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2,
      Vec3 var3,
      long var4
   ) {
      var4 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var4;
      long var6 = var4 ^ 44171995632568L;
      long var8 = var4 ^ 78142444267239L;
      long var10 = var4 ^ 103403140056671L;
      long var12 = var4 ^ 125130337475963L;
      long var14 = var4 ^ 27574031109098L;
      String var16 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3958495686275527361L, var4
      );

      List var10000;
      try {
         var10000 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, var2, var3);
         if (var10000 == null) {
            return null;
         }
      } catch (NoSuchElementException var29) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var29, -3966832688658146528L, var4
         );
      }

      for (me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var19 : var10000) {
         Vec3 var20 = var19.getStand();

         label75: {
            label74: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var22;
               try {
                  var22 = this;
                  if (var16 == null) {
                     if (this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var8, var20)) {
                        continue;
                     }
                     break label74;
                  }
               } catch (NoSuchElementException var28) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var28, -3966832688658146528L, var4
                  );
               }

               var31 = var22;
               break label75;
            }

            var31 = this;
         }

         label66: {
            label65: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var23;
               try {
                  var23 = var31;
                  if (var16 == null) {
                     if (var23.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var12, var20)) {
                        continue;
                     }
                     break label65;
                  }
               } catch (NoSuchElementException var27) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var27, -3966832688658146528L, var4
                  );
               }

               var32 = var23;
               break label66;
            }

            var32 = this;
         }

         label57: {
            label56: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var24;
               try {
                  var24 = var32;
                  if (var16 == null) {
                     if (!var24.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var1, var20, var14)) {
                        continue;
                     }
                     break label56;
                  }
               } catch (NoSuchElementException var26) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var26, -3966832688658146528L, var4
                  );
               }

               var33 = var24;
               break label57;
            }

            var33 = this;
         }

         try {
            var10000 = var33.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var20, var10);
            if (var10000 == null) {
               continue;
            }
         } catch (NoSuchElementException var25) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var25, -3966832688658146528L, var4
            );
         }

         List var21 = var10000;
         return TuplesKt.to(var20, var21);
      }

      return null;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, long var2, long var4, short var6, long var7, char var9
   ) {
      long var10 = ((long)var1 << 32 | (long)var6 << 48 >>> 32 | (long)var9 << 48 >>> 48)
         ^ IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      long var12 = var10 ^ 98206920515314L;

      try {
         if (!Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()) {
            return;
         }
      } catch (NoSuchElementException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, 721901405034076630L, var10
         );
      }

      double var14 = (var4 - var2) / 1000000.0;
      double var16 = (var7 - var4) / 1000000.0;
      String var18 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(11160, 7637670955892256346L ^ var10);
      Object[] var19 = new Object[]{var14};
      String var10000 = String.format(var18, Arrays.copyOf(var19, var19.length));
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(30712, 3149769895876817444L ^ var10)
      );
      var18 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(11160, 7637670955892256346L ^ var10);
      var19 = new Object[]{var16};
      String var10001 = String.format(var18, Arrays.copyOf(var19, var19.length));
      Intrinsics.checkNotNullExpressionValue(
         var10001, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(30712, 3149769895876817444L ^ var10)
      );
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(14088, 2047288478799508156L ^ var10)
            + var10000
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(13283, 768503394551248420L ^ var10)
            + var10001
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(8716, 3949824945803306891L ^ var10),
         var12
      );
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, long var3) {
      var3 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var3;
      long var5 = var3 ^ 123548785488680L;

      try {
         if (!Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()) {
            return;
         }
      } catch (NoSuchElementException var12) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var12, 2872905740304872460L, var3
         );
      }

      double var7 = var1 / 1000000.0;

      try {
         if (var7 < 1.0) {
            return;
         }
      } catch (NoSuchElementException var11) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var11, 2872905740304872460L, var3
         );
      }

      String var9 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(11160, 7637643485740434304L ^ var3);
      Object[] var10 = new Object[]{var7};
      String var10000 = String.format(var9, Arrays.copyOf(var10, var10.length));
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(30712, 3149724799158247422L ^ var3)
      );
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(1819, 2569037382565867366L ^ var3)
            + var10000
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(1707, 1393051404706524915L ^ var3),
         var5
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, char var2, int var3, int var4, int var5, short var6, int var7, boolean var8
   ) {
      long var9 = ((long)var2 << 48 | (long)var6 << 48 >>> 16 | (long)var7 << 32 >>> 32)
         ^ IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      long var11 = var9 ^ 58469892561892L;
      String var13 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8146806708134032673L, var9
      );

      int var10000;
      label22: {
         try {
            var10000 = Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
               .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
            if (var13 != null) {
               break label22;
            }

            if (var10000 == 0) {
               return;
            }
         } catch (NoSuchElementException var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, -8137201896988812096L, var9
            );
         }

         var10000 = var1;
      }

      int var18 = var10000;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(2850, 9200219742760340453L ^ var9)
            + var18
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(18814, 6366029871345551857L ^ var9)
            + var3
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(11427, 5048639561605524603L ^ var9)
            + var4
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(4213, 2344225095134744808L ^ var9)
            + var5
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(3392, 8863537223457181145L ^ var9)
            + var8
            + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(30709, 4852877435284191024L ^ var9),
         var11
      );
   }

   private final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, BlockPos param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, Vec3 var3, BlockPos var4
   ) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var5 = var1 ^ 134702672431802L;
      int var7 = (int)Math.floor(var3.x);
      int var8 = (int)Math.floor(var3.y);
      int var9 = (int)Math.floor(var3.z);
      int var10 = 6 + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      int var11 = RangesKt.coerceIn(
         var4.getX(),
         var7 - this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
         var7 + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
      );
      int var12 = RangesKt.coerceIn(
         var4.getY(),
         var8 - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         var8 + this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      int var13 = RangesKt.coerceIn(
         var4.getZ(),
         var9 - this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
         var9 + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
      );
      return me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            Math.min(var7 - var10, var11 - 2),
            Math.max(var7 + var10, var11 + 2),
            Math.min(var8 - 4, var12 - 2),
            Math.max(var8 + 4, var12 + 2),
            var5,
            Math.min(var9 - var10, var13 - 2),
            Math.max(var9 + var10, var13 + 2)
         );
   }

   private final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1,
      BlockPos param3,
      Vec3 param4,
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param5,
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param1,
      long param2,
      Vec3 param4,
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param1,
      long param2,
      int param4,
      int param5,
      int param6,
      double param7,
      double param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, Vec3 param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, Vec3 param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, Vec3 param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1,
      Vec3 param3,
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int param1, int param2, char param3, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      BlockPos param1, int param2, int param3, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(BlockPos param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(BlockPos param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      BlockPos param1, long param2, char param4, Vec3 param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(BlockPos param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, BlockPos param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(long var1) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 27596675312929L;
      long var5 = var1 ^ 19683808054364L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var5);
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 0;
   }

   private final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long var1) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 29662314836739L;
      long var5 = var1 ^ 112499157636772L;
      long var7 = var1 ^ 39166967270931L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var7);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(31949, 2164693054589514938L ^ var1), var5, false
         );
   }

   private final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      long var6 = var4 ^ 136578281081406L;
      long var8 = var4 ^ 672431124377L;
      long var10 = var4 ^ 122606754756232L;
      long var12 = var4 ^ 76220997531438L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var6);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var12);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(31949, 2164804327263210887L ^ var4), var8, false
         );
      this.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var10);
   }

   private final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(long var1) {
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 25988378324834L;
      int var5 = this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll++;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IDLE;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = null;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = CollectionsKt.emptyList();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = 0;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = Double.MAX_VALUE;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = null;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = null;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = null;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.clear();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0,
      me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param2,
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII param3,
      BlockPos param4,
      Vec3 param5,
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param6,
      int param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param0, int param1, boolean param2, int param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var22 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ 70242564023063L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[97];
      int var29 = 0;
      String var28 = "õ0è'é\u0018\u001b\u001aRo\rK\u009dkað\u0010vÝ\u008a\u0087 {\u000e]~\u0007â+¤\u0098å.(Ë\u000f\u008dÉü\u0000P\u000bÈÎPìD/:Â8Ú\u001aÂ\u0093¥\u008d1y3ô\u0090\u001ceÄÕ\u008eý¥[¢_ì:\u0010\u0010\r\u00911õ0Þê*\u0006\u0014´y\u0086\u0001t 7\u0086äµªñi·|\u0084ì·:µ.WÐëìo©h¶vÊBù\u008f®¬\u0007\u0088\u0010¦|¿ËèèU\fÐ\u0082\u001d\u00947>\u0085r@9°MH\u0019\u0003ôíÁU/\u001f\u009c&ï(\u0080±PUÈu2(·¤\nw;<à\u0080À9\u0002Ô,/ÒÁëÍó\u0004ô\u0000Ë?å°\u008d¼Ü*[_ÂÂ\u001cÃ@\u0001ú¢ \u0095(¢Ü/q\u00853\u0015\u0014E7æ¤\u00903ø\bþ¬\u001c\u0089{\u008aër\u0087+³³Ë\u009b(hC»\u0095.Õ\u0081\u009afÔ`Ùæb\u0000-éj¬<¿â\u0006µ*Lò\u008e\u0094µ\u0007edîæ\u0013ÌN¥\u008a\u0010\n¾ÿò\u001c\u0006\u0094ä%a»x8\u009c\u0097\u0004 \bIÒ®\u0097ïØlÂ¸+gYý¥ÂS\u008d«Mf>ïM\fuo\u001dýÑe\\ \u0081zV\r\u0099öÉ\u00107°HöîcÖ\u001dõh¢\u0002k\u009f¬Yv\u0081¡o\u00069:§\u0010Dç8î\u0086ñ\u0005ã,\u0088qq_\u009d\u001b>8f(¨«vo:+õF\u001c\u0013Ìé±^\u000e\u0092ár\u00921\u0013\u0004Ñ¤¨ÿ¦¦¡U\u001d»\u0011vG\u001bÔ\u001d¶Ë\u000f\u009cÙ\u0099\u0086a«Ú/¦\u001céèÊ\u0018\u0018£\u0090j%'UþÌCí\u0084mPy÷Ý®S\u0094Ýì\u0012M\u0010ù\u0092h½M¶¸\u009cöÄ\u008bõªêbc\u0010\naùöÔ.I\u0010£Ï$\u0096Ûn¾ô\u0010\u00927ß  æy\u0083\u008d']\u0012PjÝm\u0018ç\u00ad+\bkÉÝ\u008b(\u009dõ2ò\u008f\u00150Ê'÷Úv¹xÖ\u0010\u0083öÅ\u008dhhd²Ã\u0099è;\u0013\u0018-Ü(m H\u0012Èßú9ß Wö\u001dï\u009bÆ\u0092\u00861j£N\u0005Ìï\fÎS\u00adäUeK)rãòÌ\u0010[\u0010óOö\u0086ÁPÛWw\u0006´\u001bÚ\u0099¡ \u0010;f$óY\u008c\u008cr×\u0083\u0092ëÄ\r\tÃ\u0010¨â£É\u008e\u0002÷Mü5-Pºì¿\u0088\u0018ÑÉV\u009b\u0007 ¾\bú®Îß\u0005ÔÊ7Â4\u0090{\u0014z\u001eÒ \tôB@\u0010*\u009e-Õh'\u0017c\u0085\rª\u001d®\\\u0089\u000fªË¯Jn\u009e\u00950\u0088_\u001f@@c\u0001\u0090ßã\u0080lt¼¡YôCN0;\u0089\u0006æÁP&±Y9X-³\f«*|£\n\u001aø\u000böd\u008b\u0096D\u0086S\nM÷wÞ\u0090Fùì\u0095\u0082W»¦5¸'4À\u0018Ëþ5o\u008e}Æ\u0081+ó¤U¯9\u009aÄ,\u0084\u001fÕjÕ´Ó\u0010Pìf³ôÊb÷\u0082!*\u001d\u009dî´°\u0010 Á\u0006;\u0016\u0014l7â\u0086\u009b\u0092ÍCz\u009a(\u00067\bJ\tW\\\u009eõÑþ\u009c+\u009bþÿõW\u00055\u0006\u00adTdìR¢\u009f§ô<\u0017\u0099\u008b²Áì£Ùt(\u0018N¥\u0094æÑ\u001b#Fì\u009eA\u0098)G}CâT½¶{480|\u0080c?û¢ñt\u0007S\"ï÷ëV <¦fG\u008aõ\u001dâ¥\u000fòG ûÓó\u0083$Ù¯fBßÚ\u000b¡a\u001c©G\u008d \u0010\u009cT\u0087\u008cR*©»#[\u0015uw£6i\u0010ÆqxZÒà\u001c\u0094yºX\b½i¢v\u0010\u0012Dkà'\u0095:¥£9ïÙ#\u0085qÌ@Z>¸Ôúí¶x¸)©¾!mDfö¥Éé\u0019¹\u0006Æd\u009biý( j¼×S#Ìð\rH¡Í2g#¬°ÙBfñ«Za\u001dIÎà1\u0081\u0017[d.6\u0010¤±BXe\rg\u001eÍ$\u000e\u001f$Ã+â\u0010¾\u009a\u0085\u008duí²õëÇ±\u0083\u0081¯4f ¢\u009e\u0091Ss©:Ñ®T K¿cË\u001bÉÃHF;ô\u00929×\u0084=\u0016\u0007l\u008dô\u0010í`»®\nØpUDezKwñT\u009d êCÔ¯!ê·\u009bú`réç+à\u0084 Æ?åõH\u0094ST\u008aæ\u0089ïíj£\u0010pÔ²7À\u009e\u0094HÃé¦\u0002?\f\u008b`\u0018\u008cÒ\u0000\u0011`F\"&aH^HàRçÊá\u000f\u0015ïÝxz.\u0018\u0019ü)¯Áò\u0086Ã°\u0010MOËêñúrA \u0012/Gäp\u0010À\u0010Ðj\u007fÌ\u0088'¶']\u001b1¡ô\u0017\u0018è\u0005`¬\u001fÿáÄÚ(`\u001c\u0086\u0081ÁQ'O\u001bT\u008c?\u0097í\u0010Ã\u001f\u001d\u009b\u0083¦U\u009eis\u001c<Ý¸Ø1 r{g£}\u001aÌvEq.d¼¡W]'hk-\u009d\u0003.5ÜÝÙw\u0015U¾\u0004\u0010\u0012¶\bô\u0005~ÓPrkÌ~\u001elÀS(\u0092\u0013d\u009d\"«\u0000Äm\u0091 \u008eJ÷\u008dÈÀì%Q÷\u009bR±C¯ÓÝô\u001e»·«\t\u009e¿¿!\u008bÀ\u0010\u000e\u0089\u0087\u008fîî\u009d\u001a\bâ¹W¯sp<\u0018!¼\fÞ\u0016\u0099R\u0085æ²èÄ³÷\u0095OV÷HîØ\u0093æ¾\u0018Z\u0001Jí¡y`\fmý|üamòÕL®n\u0013z>ÅF\u0010$|Ñ\u0003\u009eí\u0018\u0089Y\u001fÓ4]~@;@ôu\u001fFèXªÂp\u000f\u0016\u0097~Õ\u0081´úAþaå~\u009b\u001bø\u008eîr°\"/Ú®\r\u009a\u001dÚL\bhñbÏ-¼-U¢\u009eÿEÛ!÷Ñ%$\u0096,\u009eå\u0085_ \u0010\u001cd~ýiD6\u0019ÉòÃf\u0083)+º\u0010V¦Iæ\u008fÇM¡Ál9Ï\u0001þw5HV®¿;%Ë\u0085\u0014\u001fßwúy0\u009d¸Ñ\u001b¼\u000bn'p\u0084§\u0005¢aàQ½\u0089\u000e[äPRk¹sîÄACÿF5 @'u S\u009aÕ?AL\u008bòÒÞdÌev\u0083q\u001dÝÒ¨ Ý÷úÁ1\u000eÿ¸´<%Ãv\u009d££¨Ì\"\u008e\u0097,ón!u\u0097Â\u0011\u001e±\u0011((\u000b\böÙZ~\u0003\n\u0096\u0093OO¥B×\u0099ó\u0005æc'©Ç=\u001eF\u0087\u0098°¹s\u0087\u0085u\u0004êx«\u001b\u0010\u0082\u0007äLa ¹\u009b]\u008chÄ\u0098×WC SÃê\u001f\u0082\u001b\u008fÅy>w¦9\u000bp\u0096\u001dèüî#7Ãõ\u009a\r4\u008c.êr\u008c\u0018.,HH[F\u00815²\u008d\u0012/\u0002í£¶8Ò¿\u001c\u0084\u0084[w\u0010:^\u0099>9¿sd\u008cÍªHVÂ`\u0017\u0010R\u0017\u0007\u009fÌk¶è=6lç¹\u0013Ïp\u0010Vn\u0092êäêÇ²ç\u0097´¹\u0095Òìð\u0010\u0083Ç\u0080 2mÑâ\u007fÒ í´$#\u0088 \u0095E\u001a$I6Ü\u0006øZ§\nDñS¢Ê·Uws¨\u000fÚ\u0081iÌÕL\u0016B\u0099\u0010\u0018i\u000b\u001f \u001cmÉ\u0012Ï\u0093\u001e>§6Û\u0018\u008cL\u009d\u0098~®{T¶\u0019@\u0003I#ü{\u00006zr\u0083¦fÊ ¡<#¦\u0013ÖêÄ×%2a\f*\u001aèWCmÜ\b$\u0004\u000bóð)Åït\u001c¥\u0010\u0012®t\u001e+$6E~ù\u00955©ZpÐ\u0010\u00101Ãçiæ\u0010òò åª\u00adÃÉØ\u0010\u001bpl\u009d¼ã\\Q\u0094Ôq Ð:U\u0080 äÞVÝ\u0086bñ\u0095XSCö¨VÜu\u009aî\"=m\u009e\u001e©\u000b/$85\u0018¼Ñ\u0018Û.\u0082\u0099Õ\u0094.\u0013Õó\u0000\u0012\nB\u0091O\u0089\u0088ða>\u009e¥W\u0010)\u008d\u008fü\u009a÷\u0089\u009bêMÂwg\u000e\u0082V\u0018ûù}\u008d\u009b&4\u00059ÃS\u0092¿\u0095v\n>1¨ \"\u0086;#\u00106 oí\u009cËï/\u0091ñ\u0087\u009d\u009dÍå\u0085([¡\u0093\u0082Ùñº;µi6kýµ(l\u008eµCí\u008dÂ÷ õkdZzÿô\u009cMðI[f\u0088é8\u0018\u009e\u001fÉÇº\u0098\u001d8 \u0011\u009fÀÀ®ù* ª\f\u0087¢Á=ú\u0018+GGt¥ZßÎ\u001c\u0081Ç§ü)@ânV\u0005\u001b\\%Tw\u0010!\u0001l\u008c.{Ìÿ#Ú\u008cF.Þ\b\u007f\u0010IÈ\u000bWe%\u0001\u0089\u001fÃ`Û£!s\u0012\u0018\f\u0094\u0005\u0089(?Ôé{ç@ª.ô`Ü\u0086Oà\u001b´\u001d\u0087®\u0010´\t\u0099cÒ¿Ba£ð¸\u0014\u009dc\u000fb\u0010^\u0092\u0016MèP7±\u0012±\u0083\u0091.ö\bq\u0010;\u0010æÎ\u001d\u0017ú\u0015\u001b°\u009am:-`ß0DØ;¬wîsØm#Oº\u0087ÊºUµ\u0084\u009e#¼C¯Ë~³Y¶|mp\u009a²í\u0091ðF\u0002\u0094´$\u009fÓ>~¥¸®\u0010¯\u0096¬\u001d\u0011´\u0096\u0091ãìKqVâÞð\u0010?²(üîoå<¹\u001b!áÎ\t9\u0017 G>ÂVëñ\u0017\u0010\u001fO(Mx\u0089!MY\u008d¹0]\u001cVË\u0012æüÀ¶tök\u0010\u0019C`µ\u001e:èBBýTÞ\b×cZ8)CA©ã\u0099i\u0016+B{a¶ã¢Î×ÜO\u007f\u0088ò¶\u0013\u0095Õ\u0094z\u0099Ìhã®Ô@ô\bx\u001c\u0090DÂ%5\u0007\u0014\u009d\u00155ÔÅJÔg\u0081\u0014";
      int var30 = "õ0è'é\u0018\u001b\u001aRo\rK\u009dkað\u0010vÝ\u008a\u0087 {\u000e]~\u0007â+¤\u0098å.(Ë\u000f\u008dÉü\u0000P\u000bÈÎPìD/:Â8Ú\u001aÂ\u0093¥\u008d1y3ô\u0090\u001ceÄÕ\u008eý¥[¢_ì:\u0010\u0010\r\u00911õ0Þê*\u0006\u0014´y\u0086\u0001t 7\u0086äµªñi·|\u0084ì·:µ.WÐëìo©h¶vÊBù\u008f®¬\u0007\u0088\u0010¦|¿ËèèU\fÐ\u0082\u001d\u00947>\u0085r@9°MH\u0019\u0003ôíÁU/\u001f\u009c&ï(\u0080±PUÈu2(·¤\nw;<à\u0080À9\u0002Ô,/ÒÁëÍó\u0004ô\u0000Ë?å°\u008d¼Ü*[_ÂÂ\u001cÃ@\u0001ú¢ \u0095(¢Ü/q\u00853\u0015\u0014E7æ¤\u00903ø\bþ¬\u001c\u0089{\u008aër\u0087+³³Ë\u009b(hC»\u0095.Õ\u0081\u009afÔ`Ùæb\u0000-éj¬<¿â\u0006µ*Lò\u008e\u0094µ\u0007edîæ\u0013ÌN¥\u008a\u0010\n¾ÿò\u001c\u0006\u0094ä%a»x8\u009c\u0097\u0004 \bIÒ®\u0097ïØlÂ¸+gYý¥ÂS\u008d«Mf>ïM\fuo\u001dýÑe\\ \u0081zV\r\u0099öÉ\u00107°HöîcÖ\u001dõh¢\u0002k\u009f¬Yv\u0081¡o\u00069:§\u0010Dç8î\u0086ñ\u0005ã,\u0088qq_\u009d\u001b>8f(¨«vo:+õF\u001c\u0013Ìé±^\u000e\u0092ár\u00921\u0013\u0004Ñ¤¨ÿ¦¦¡U\u001d»\u0011vG\u001bÔ\u001d¶Ë\u000f\u009cÙ\u0099\u0086a«Ú/¦\u001céèÊ\u0018\u0018£\u0090j%'UþÌCí\u0084mPy÷Ý®S\u0094Ýì\u0012M\u0010ù\u0092h½M¶¸\u009cöÄ\u008bõªêbc\u0010\naùöÔ.I\u0010£Ï$\u0096Ûn¾ô\u0010\u00927ß  æy\u0083\u008d']\u0012PjÝm\u0018ç\u00ad+\bkÉÝ\u008b(\u009dõ2ò\u008f\u00150Ê'÷Úv¹xÖ\u0010\u0083öÅ\u008dhhd²Ã\u0099è;\u0013\u0018-Ü(m H\u0012Èßú9ß Wö\u001dï\u009bÆ\u0092\u00861j£N\u0005Ìï\fÎS\u00adäUeK)rãòÌ\u0010[\u0010óOö\u0086ÁPÛWw\u0006´\u001bÚ\u0099¡ \u0010;f$óY\u008c\u008cr×\u0083\u0092ëÄ\r\tÃ\u0010¨â£É\u008e\u0002÷Mü5-Pºì¿\u0088\u0018ÑÉV\u009b\u0007 ¾\bú®Îß\u0005ÔÊ7Â4\u0090{\u0014z\u001eÒ \tôB@\u0010*\u009e-Õh'\u0017c\u0085\rª\u001d®\\\u0089\u000fªË¯Jn\u009e\u00950\u0088_\u001f@@c\u0001\u0090ßã\u0080lt¼¡YôCN0;\u0089\u0006æÁP&±Y9X-³\f«*|£\n\u001aø\u000böd\u008b\u0096D\u0086S\nM÷wÞ\u0090Fùì\u0095\u0082W»¦5¸'4À\u0018Ëþ5o\u008e}Æ\u0081+ó¤U¯9\u009aÄ,\u0084\u001fÕjÕ´Ó\u0010Pìf³ôÊb÷\u0082!*\u001d\u009dî´°\u0010 Á\u0006;\u0016\u0014l7â\u0086\u009b\u0092ÍCz\u009a(\u00067\bJ\tW\\\u009eõÑþ\u009c+\u009bþÿõW\u00055\u0006\u00adTdìR¢\u009f§ô<\u0017\u0099\u008b²Áì£Ùt(\u0018N¥\u0094æÑ\u001b#Fì\u009eA\u0098)G}CâT½¶{480|\u0080c?û¢ñt\u0007S\"ï÷ëV <¦fG\u008aõ\u001dâ¥\u000fòG ûÓó\u0083$Ù¯fBßÚ\u000b¡a\u001c©G\u008d \u0010\u009cT\u0087\u008cR*©»#[\u0015uw£6i\u0010ÆqxZÒà\u001c\u0094yºX\b½i¢v\u0010\u0012Dkà'\u0095:¥£9ïÙ#\u0085qÌ@Z>¸Ôúí¶x¸)©¾!mDfö¥Éé\u0019¹\u0006Æd\u009biý( j¼×S#Ìð\rH¡Í2g#¬°ÙBfñ«Za\u001dIÎà1\u0081\u0017[d.6\u0010¤±BXe\rg\u001eÍ$\u000e\u001f$Ã+â\u0010¾\u009a\u0085\u008duí²õëÇ±\u0083\u0081¯4f ¢\u009e\u0091Ss©:Ñ®T K¿cË\u001bÉÃHF;ô\u00929×\u0084=\u0016\u0007l\u008dô\u0010í`»®\nØpUDezKwñT\u009d êCÔ¯!ê·\u009bú`réç+à\u0084 Æ?åõH\u0094ST\u008aæ\u0089ïíj£\u0010pÔ²7À\u009e\u0094HÃé¦\u0002?\f\u008b`\u0018\u008cÒ\u0000\u0011`F\"&aH^HàRçÊá\u000f\u0015ïÝxz.\u0018\u0019ü)¯Áò\u0086Ã°\u0010MOËêñúrA \u0012/Gäp\u0010À\u0010Ðj\u007fÌ\u0088'¶']\u001b1¡ô\u0017\u0018è\u0005`¬\u001fÿáÄÚ(`\u001c\u0086\u0081ÁQ'O\u001bT\u008c?\u0097í\u0010Ã\u001f\u001d\u009b\u0083¦U\u009eis\u001c<Ý¸Ø1 r{g£}\u001aÌvEq.d¼¡W]'hk-\u009d\u0003.5ÜÝÙw\u0015U¾\u0004\u0010\u0012¶\bô\u0005~ÓPrkÌ~\u001elÀS(\u0092\u0013d\u009d\"«\u0000Äm\u0091 \u008eJ÷\u008dÈÀì%Q÷\u009bR±C¯ÓÝô\u001e»·«\t\u009e¿¿!\u008bÀ\u0010\u000e\u0089\u0087\u008fîî\u009d\u001a\bâ¹W¯sp<\u0018!¼\fÞ\u0016\u0099R\u0085æ²èÄ³÷\u0095OV÷HîØ\u0093æ¾\u0018Z\u0001Jí¡y`\fmý|üamòÕL®n\u0013z>ÅF\u0010$|Ñ\u0003\u009eí\u0018\u0089Y\u001fÓ4]~@;@ôu\u001fFèXªÂp\u000f\u0016\u0097~Õ\u0081´úAþaå~\u009b\u001bø\u008eîr°\"/Ú®\r\u009a\u001dÚL\bhñbÏ-¼-U¢\u009eÿEÛ!÷Ñ%$\u0096,\u009eå\u0085_ \u0010\u001cd~ýiD6\u0019ÉòÃf\u0083)+º\u0010V¦Iæ\u008fÇM¡Ál9Ï\u0001þw5HV®¿;%Ë\u0085\u0014\u001fßwúy0\u009d¸Ñ\u001b¼\u000bn'p\u0084§\u0005¢aàQ½\u0089\u000e[äPRk¹sîÄACÿF5 @'u S\u009aÕ?AL\u008bòÒÞdÌev\u0083q\u001dÝÒ¨ Ý÷úÁ1\u000eÿ¸´<%Ãv\u009d££¨Ì\"\u008e\u0097,ón!u\u0097Â\u0011\u001e±\u0011((\u000b\böÙZ~\u0003\n\u0096\u0093OO¥B×\u0099ó\u0005æc'©Ç=\u001eF\u0087\u0098°¹s\u0087\u0085u\u0004êx«\u001b\u0010\u0082\u0007äLa ¹\u009b]\u008chÄ\u0098×WC SÃê\u001f\u0082\u001b\u008fÅy>w¦9\u000bp\u0096\u001dèüî#7Ãõ\u009a\r4\u008c.êr\u008c\u0018.,HH[F\u00815²\u008d\u0012/\u0002í£¶8Ò¿\u001c\u0084\u0084[w\u0010:^\u0099>9¿sd\u008cÍªHVÂ`\u0017\u0010R\u0017\u0007\u009fÌk¶è=6lç¹\u0013Ïp\u0010Vn\u0092êäêÇ²ç\u0097´¹\u0095Òìð\u0010\u0083Ç\u0080 2mÑâ\u007fÒ í´$#\u0088 \u0095E\u001a$I6Ü\u0006øZ§\nDñS¢Ê·Uws¨\u000fÚ\u0081iÌÕL\u0016B\u0099\u0010\u0018i\u000b\u001f \u001cmÉ\u0012Ï\u0093\u001e>§6Û\u0018\u008cL\u009d\u0098~®{T¶\u0019@\u0003I#ü{\u00006zr\u0083¦fÊ ¡<#¦\u0013ÖêÄ×%2a\f*\u001aèWCmÜ\b$\u0004\u000bóð)Åït\u001c¥\u0010\u0012®t\u001e+$6E~ù\u00955©ZpÐ\u0010\u00101Ãçiæ\u0010òò åª\u00adÃÉØ\u0010\u001bpl\u009d¼ã\\Q\u0094Ôq Ð:U\u0080 äÞVÝ\u0086bñ\u0095XSCö¨VÜu\u009aî\"=m\u009e\u001e©\u000b/$85\u0018¼Ñ\u0018Û.\u0082\u0099Õ\u0094.\u0013Õó\u0000\u0012\nB\u0091O\u0089\u0088ða>\u009e¥W\u0010)\u008d\u008fü\u009a÷\u0089\u009bêMÂwg\u000e\u0082V\u0018ûù}\u008d\u009b&4\u00059ÃS\u0092¿\u0095v\n>1¨ \"\u0086;#\u00106 oí\u009cËï/\u0091ñ\u0087\u009d\u009dÍå\u0085([¡\u0093\u0082Ùñº;µi6kýµ(l\u008eµCí\u008dÂ÷ õkdZzÿô\u009cMðI[f\u0088é8\u0018\u009e\u001fÉÇº\u0098\u001d8 \u0011\u009fÀÀ®ù* ª\f\u0087¢Á=ú\u0018+GGt¥ZßÎ\u001c\u0081Ç§ü)@ânV\u0005\u001b\\%Tw\u0010!\u0001l\u008c.{Ìÿ#Ú\u008cF.Þ\b\u007f\u0010IÈ\u000bWe%\u0001\u0089\u001fÃ`Û£!s\u0012\u0018\f\u0094\u0005\u0089(?Ôé{ç@ª.ô`Ü\u0086Oà\u001b´\u001d\u0087®\u0010´\t\u0099cÒ¿Ba£ð¸\u0014\u009dc\u000fb\u0010^\u0092\u0016MèP7±\u0012±\u0083\u0091.ö\bq\u0010;\u0010æÎ\u001d\u0017ú\u0015\u001b°\u009am:-`ß0DØ;¬wîsØm#Oº\u0087ÊºUµ\u0084\u009e#¼C¯Ë~³Y¶|mp\u009a²í\u0091ðF\u0002\u0094´$\u009fÓ>~¥¸®\u0010¯\u0096¬\u001d\u0011´\u0096\u0091ãìKqVâÞð\u0010?²(üîoå<¹\u001b!áÎ\t9\u0017 G>ÂVëñ\u0017\u0010\u001fO(Mx\u0089!MY\u008d¹0]\u001cVË\u0012æüÀ¶tök\u0010\u0019C`µ\u001e:èBBýTÞ\b×cZ8)CA©ã\u0099i\u0016+B{a¶ã¢Î×ÜO\u007f\u0088ò¶\u0013\u0095Õ\u0094z\u0099Ìhã®Ô@ô\bx\u001c\u0090DÂ%5\u0007\u0014\u009d\u00155ÔÅJÔg\u0081\u0014"
         .length();
      char var27 = '\u0010';
      int var26 = -1;

      while (true) {
         byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
         String var57 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var32).intern();
         byte var10001 = -1;
         var31[var29++] = var57;
         if ((var26 += var27) >= var30) {
            var28 = "\u000fiT\u008fo\u0080©´'}+2ÐRµ7\u0010»\u0098\u0089z/)¹ \u0097&\u008cô6u~\u009f";
            var30 = "\u000fiT\u008fo\u0080©´'}+2ÐRµ7\u0010»\u0098\u0089z/)¹ \u0097&\u008cô6u~\u009f".length();
            var27 = '\u0010';
            var26 = -1;

            while (true) {
               var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
               String var59 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var32).intern();
               int var49 = 0;
               var31[var29++] = var59;
               if ((var26 += var27) >= var30) {
                  IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = var31;
                  lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = new String[97];
                  IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var12 = 1; var12 < 8; var12++) {
                     var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[16];
                  int var14 = 0;
                  String var15 = "-î\u008b[.KWÿ\u0092\u0098ÿPÔ8±÷\u009a§}\u0091ëqï\u008b\u0094\u0001\u0085«Ê§g\u0094$R\u0011]\u000e{ðÂ<ÆÁüº\u0015\u0084Ï\u0090R«\u001b\u0001\u0007W8\u001cedp&?\u0017G\u009d#;÷Ðì\u0090Æ$P\u001càC\u001e`iç\u009f\u0017Hí\u0018¹l ¡ë£k\u0087\u0082¼\tÏo\u0013\u0097ÏQ+ýØ¬n\u0099\u0083MÄ";
                  int var16 = "-î\u008b[.KWÿ\u0092\u0098ÿPÔ8±÷\u009a§}\u0091ëqï\u008b\u0094\u0001\u0085«Ê§g\u0094$R\u0011]\u000e{ðÂ<ÆÁüº\u0015\u0084Ï\u0090R«\u001b\u0001\u0007W8\u001cedp&?\u0017G\u009d#;÷Ðì\u0090Æ$P\u001càC\u001e`iç\u009f\u0017Hí\u0018¹l ¡ë£k\u0087\u0082¼\tÏo\u0013\u0097ÏQ+ýØ¬n\u0099\u0083MÄ"
                     .length();
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

                  var15 = "M\u0082$6»¹TW;Û6CpÕ\bÇ";
                  var16 = "M\u0082$6»¹TW;Û6CpÕ\bÇ".length();
                  var13 = 0;

                  do {
                     int var53 = var13;
                     var13 += 8;
                     byte[] var36 = var15.substring(var53, var13).getBytes("ISO-8859-1");
                     var53 = var14++;
                     long var37 = (var36[0] & 255L) << 56
                        | (var36[1] & 255L) << 48
                        | (var36[2] & 255L) << 40
                        | (var36[3] & 255L) << 32
                        | (var36[4] & 255L) << 24
                        | (var36[5] & 255L) << 16
                        | (var36[6] & 255L) << 8
                        | var36[7] & 255L;
                     byte[] var38 = var11.doFinal(
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
                     long var68 = (var38[0] & 255L) << 56
                        | (var38[1] & 255L) << 48
                        | (var38[2] & 255L) << 40
                        | (var38[3] & 255L) << 32
                        | (var38[4] & 255L) << 24
                        | (var38[5] & 255L) << 16
                        | (var38[6] & 255L) << 8
                        | var38[7] & 255L;
                     boolean var65 = false;
                     var17[var53] = var68;
                  } while (var13 < var16);

                  llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = var17;
                  IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = new Integer[16];
                  llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "Ö²Sµ|ó µ\u008fA\u0000î\f¡\"\u0011\\üÄ¦QSþæ";
                  int var5 = "Ö²Sµ|ó µ\u008fA\u0000î\f¡\"\u0011\\üÄ¦QSþæ".length();
                  byte var2 = 0;

                  do {
                     int var55 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var55, var2).getBytes("ISO-8859-1");
                     var55 = var3++;
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
                     long var69 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var67 = -1;
                     var6[var55] = var69;
                  } while (var2 < var5);

                  IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var6;
                  IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = new Long[3];
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  return;
               }

               var27 = var28.charAt(var26);
            }
         }

         var27 = var28.charAt(var26);
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3390;
      if (lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI[var5].getBytes("ISO-8859-1");
         lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl[var5];
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
            "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12499;
      if (IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl[var3] == null) {
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
         long var5 = llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII[var3];
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
         Object[] var9 = (Object[])IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl[var3] = var15;
      }

      return IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl[var3];
   }

   private static int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
            "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20176;
      if (IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI[var3] == null) {
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
         long var5 = IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI[var3];
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
         Object[] var9 = (Object[])llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI[var3] = var15;
      }

      return IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI[var3];
   }

   private static long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl$recovered$a50e3c6a56e28db5(char var1, long var2) {
      var2 = 7454324129892L;
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
      long var6 = var4 ^ 136578281081406L;
      long var8 = var4 ^ 672431124377L;
      long var10 = var4 ^ 122606754756232L;
      long var12 = var4 ^ 76220997531438L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var6);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(var12);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"w">(31949, 2164804327263210887L ^ var4), var8, false
         );
      this.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var10);
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ab2115be4f9e6c43(
      @NotNull BlockPos posArg, @Nullable Integer argument2Arg, long argument3Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI$recovered$bfb7158aeca08568(long var1) {
      var1 = 51821980125903L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 25988378324834L;
      int var5 = this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll++;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IDLE;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = null;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = CollectionsKt.emptyList();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = 0;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = Double.MAX_VALUE;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = null;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = null;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = null;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII.clear();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var3);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$13b462bb00439a71(
      long param1, String param3, String param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII$recovered$0c46afba55ac4c9c(long var1) {
      var1 = 109853884114811L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 27596675312929L;
      long var5 = var1 ^ 19683808054364L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$cb2dfd28df56eb63(var3);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII$recovered$b36a18c65ce831a5(var5);
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 0;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5e44456ad21c6009(String var1, long var2) {
      var2 = 86393337737305L;
      var2 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var2;
      long var4 = var2 ^ 23096767355446L;

      try {
         if (!Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()) {
            return;
         }
      } catch (NoSuchElementException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }

      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$8f5466ae1bb10fab(
         "<gray> " + var1 + "</gray>", var4
      );
   }

   private final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII$recovered$f5be44c0f86ddc0d(long var1) {
      var1 = 105597274372441L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 29662314836739L;
      long var5 = var1 ^ 112499157636772L;
      long var7 = var1 ^ 39166967270931L;
      me.octo.client.utils.player.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$cb2dfd28df56eb63(var3);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$da06866590b69619(var7);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$342cb48b9693181a("sneak", var5, false);
   }

   private final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$1372b299d1346af9(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6c6019002fe9c9b3(
      long param1, BlockPos param3, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$32770a5aba15555a(
      BlockPos param1, long param2, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$4ccac633fb63b176(
      BlockPos param1, long param2, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$fd0c9a84a2bf8827(
      BlockPos param1, long param2, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$59a2d2bf7d3fbc9e(
      BlockPos param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$69acb311d6d44de0(
      long param1, BlockPos param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl$recovered$a51c1687718a9212(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI$recovered$bbc03c3572f23076(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl$recovered$b33eed5d1be6c6b4(
      BlockPos param1, long param2, char param4, Vec3 param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$a9419599e9e93d7d(
      BlockPos param1, Vec3 param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$874b9e37856c5fca(
      BlockPos var1,
      me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2,
      Vec3 var3,
      long var4
   ) {
      var4 = 85676792198763L;
      var4 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var4;
      long var6 = var4 ^ 44171995632568L;
      long var8 = var4 ^ 78142444267239L;
      long var10 = var4 ^ 103403140056671L;
      long var12 = var4 ^ 125130337475963L;
      long var14 = var4 ^ 27574031109098L;
      String var16 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl();

      List var10000;
      try {
         var10000 = me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1f87909395c18e29(var6, var2, var3);
         if (var10000 == null) {
            return null;
         }
      } catch (NoSuchElementException var34) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var34);
      }

      for (me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var19 : var10000) {
         Vec3 var20 = var19.getStand();

         label75: {
            label74: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var27;
               try {
                  var27 = this;
                  if (var16 == null) {
                     if (this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$5d00f41c399f4d75(var8, var20)) {
                        continue;
                     }
                     break label74;
                  }
               } catch (NoSuchElementException var33) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var33);
               }

               var37 = var27;
               break label75;
            }

            var37 = this;
         }

         label66: {
            label65: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var28;
               try {
                  var28 = var37;
                  if (var16 == null) {
                     if (var28.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$49ec26fd6fb1316d(var12, var20)) {
                        continue;
                     }
                     break label65;
                  }
               } catch (NoSuchElementException var32) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32);
               }

               var38 = var28;
               break label66;
            }

            var38 = this;
         }

         label57: {
            label56: {
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var29;
               try {
                  var29 = var38;
                  if (var16 == null) {
                     if (!var29.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$25411889753362fd(
                        var1, var20, var14
                     )) {
                        continue;
                     }
                     break label56;
                  }
               } catch (NoSuchElementException var31) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var31);
               }

               var39 = var29;
               break label57;
            }

            var39 = this;
         }

         try {
            var10000 = var39.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6df66b8434dd8f43(
               var3, var20, var10
            );
            if (var10000 == null) {
               continue;
            }
         } catch (NoSuchElementException var30) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var30);
         }

         List var21 = var10000;
         return TuplesKt.to(var20, var21);
      }

      return null;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a1cd4861616544c0(
      BlockPos var1, long var2, Vec3 var4, List var5
   ) {
      var2 = 94870476669731L;
      var2 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var2;
      long var6 = var2 ^ 85354300019603L;
      long var8 = var2 ^ 24602939248110L;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var4;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = var5;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = 0;
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = 0;
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = 0;
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = Double.MAX_VALUE;
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 0;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = null;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = false;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$13b462bb00439a71(
         var6,
         "path",
         "point at "
            + this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$afcabf5038a59394(var8, var4)
            + " ("
            + var5.size()
            + " nodes)"
      );
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$fcb73c3ce1dbf45e(
      BlockPos param1, long param2, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl$recovered$92851d79e77aeb97(long var1) {
      var1 = 134537995603541L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var3 = var1 ^ 107431239327461L;
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = null;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = CollectionsKt.emptyList();
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = true;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$13b462bb00439a71(
         var3, "path", "no visible point within r=6 approaching"
      );
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$afcabf5038a59394(long var1, Vec3 var3) {
      var1 = 6924201095918L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      String var4 = "%.2f, %.2f, %.2f";
      Object[] var5 = new Object[]{var3.x, var3.y, var3.z};
      String var10000 = String.format(var4, Arrays.copyOf(var5, var5.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      return var10000;
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$49ec26fd6fb1316d(
      long param1, Vec3 param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$25411889753362fd(
      BlockPos param1, Vec3 param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6df66b8434dd8f43(
      Vec3 param1, Vec3 param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$5d00f41c399f4d75(
      long param1, Vec3 param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c36b272d9639d650(
      int param1, BlockPos param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$8fa234a245ae9036(
      long var1, Vec3 var3, BlockPos var4
   ) {
      var1 = 78937662209293L;
      var1 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var1;
      long var5 = var1 ^ 134702672431802L;
      int var7 = (int)Math.floor(var3.x);
      int var8 = (int)Math.floor(var3.y);
      int var9 = (int)Math.floor(var3.z);
      int var10 = 6 + this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      int var11 = RangesKt.coerceIn(
         var4.getX(),
         var7 - this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
         var7 + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
      );
      int var12 = RangesKt.coerceIn(
         var4.getY(),
         var8 - this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI,
         var8 + this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
      );
      int var13 = RangesKt.coerceIn(
         var4.getZ(),
         var9 - this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll,
         var9 + this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
      );
      return me.octo.client.utils.player.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ef40c1d42ad2a1be(
            Math.min(var7 - var10, var11 - 2),
            Math.max(var7 + var10, var11 + 2),
            Math.min(var8 - 4, var12 - 2),
            Math.max(var8 + 4, var12 + 2),
            var5,
            Math.min(var9 - var10, var13 - 2),
            Math.max(var9 + var10, var13 + 2)
         );
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$11754def37c3c49b(long var1, long var3) {
      var3 = 48169531562311L;
      var3 = IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll ^ var3;
      long var5 = var3 ^ 123548785488680L;

      try {
         if (!Etherwarp.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()) {
            return;
         }
      } catch (NoSuchElementException var14) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var14);
      }

      double var7 = var1 / 1000000.0;

      try {
         if (var7 < 1.0) {
            return;
         }
      } catch (NoSuchElementException var13) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13);
      }

      String var9 = "%.2f";
      Object[] var10 = new Object[]{var7};
      String var10000 = String.format(var9, Arrays.copyOf(var10, var10.length));
      Intrinsics.checkNotNullExpressionValue(var10000, "format(...)");
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$8f5466ae1bb10fab(
         "<gray> grab " + var10000 + " ms (main)<</gray>", var5
      );
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$66fe455a21e06ddf(
      BlockPos param1, int param2, int param3, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$f73b438159326dfe(
      int param1, int param2, char param3, Vec3 param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      @NotNull
      private final BlockPos target;
      @NotNull
      private final Vec3 playerPos;
      @NotNull
      private final List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> vantages;
      @Nullable
      private final Vec3 lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 20849934249359L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         @NotNull BlockPos targetArg,
         @NotNull Vec3 playerPosArg,
         @NotNull List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> vantagesArg,
         @Nullable Vec3 argument4Arg
      ) {
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 3044297948281L;
         Intrinsics.checkNotNullParameter(targetArg, "target");
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         Intrinsics.checkNotNullParameter(vantagesArg, "vantages");
         super();
         this.target = targetArg;
         this.playerPos = playerPosArg;
         this.vantages = vantagesArg;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
      }

      @NotNull
      public final BlockPos getTarget() {
         return this.target;
      }

      @NotNull
      public final Vec3 getPlayerPos() {
         return this.playerPos;
      }

      @NotNull
      public final List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> getVantages() {
         return this.vantages;
      }

      @Nullable
      public final Vec3 IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @Nullable
      public final Vec3 IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         short var1, int var2, @NotNull BlockPos var3, short var4, @NotNull Vec3 var5, @NotNull List var6, @Nullable Vec3 var7
      ) {
         long var8 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48)
            ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(521, 1284040385421708763L ^ var8)
         );
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(29060, 5829559097922256467L ^ var8)
         );
         Intrinsics.checkNotNullParameter(
            var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(4204, 5511474770097938360L ^ var8)
         );
         return new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
            var3, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 79887405762589L;
         Vec3 var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         List var4 = this.vantages;
         Vec3 var5 = this.playerPos;
         BlockPos var6 = this.target;
         return "ScanResult(target=" + var6 + ", playerPos=" + var5 + ", vantages=" + var4 + ", preVantage=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 39315047483590L;
         String var10000 = lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl();
         int var4 = this.target.hashCode();
         var4 = var4 * 31 + this.playerPos.hashCode();
         String var3 = var10000;
         int var9 = var4 * 31;
         IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = this;
         if (var3 == null) {
            var4 = var9 + this.vantages.hashCode();

            try {
               var9 = var4 * 31;
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  return var9 + 0;
               }
            } catch (MatchException var6) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
            }

            var10001 = this;
         }

         return var9 + var10001.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 17642489413083L;
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
         String var6 = "\u00adqò\u001eeb¯Ôæs¢\u0010ù\u0013»ô®æ¢ºì½äÂ a\rÜsä¤V\u0095¥h\u0089×\u0094\u0082.RÌ8\u0086Ë²ÞQþ7¸áE\u001fÇ\u001by oÄcî¸e\u008fôK){|uô\u007fñ¨Ü @ø´@\u00adKÒñ\u0010¨g\u008cß \u007f>o\u001d\u001aÀ®=mtOÞ\u0005YC\u0086ÎìÏ²èLÌ\u00975\u009aR;D\u0001Ò\r \u0084³\u0007f÷\u009apøÿÝ¥ç\u0003Ç\u0003\u0097Ò\"¤É´½\u0007\u008c\u0014\u0082*q8^?ê\u0018ñ\u001bg\u0098@à\u0080¾¼\u008f¦ÃÝ<\u0006êòú¹Ïp\u00adq\u009d(WWÖó\u001ekýa\u009a·ÕÈªñ\u0004Ü\u0087½\"&\u0015Âcj\u0093ôºäD%1t\"Ò\u0089Y\b9`¦\u0010ÀT\u0092¨\u0011òOû;TÅ\u0000K\u0090j¨";
         int var8 = "\u00adqò\u001eeb¯Ôæs¢\u0010ù\u0013»ô®æ¢ºì½äÂ a\rÜsä¤V\u0095¥h\u0089×\u0094\u0082.RÌ8\u0086Ë²ÞQþ7¸áE\u001fÇ\u001by oÄcî¸e\u008fôK){|uô\u007fñ¨Ü @ø´@\u00adKÒñ\u0010¨g\u008cß \u007f>o\u001d\u001aÀ®=mtOÞ\u0005YC\u0086ÎìÏ²èLÌ\u00975\u009aR;D\u0001Ò\r \u0084³\u0007f÷\u009apøÿÝ¥ç\u0003Ç\u0003\u0097Ò\"¤É´½\u0007\u008c\u0014\u0082*q8^?ê\u0018ñ\u001bg\u0098@à\u0080¾¼\u008f¦ÃÝ<\u0006êòú¹Ïp\u00adq\u009d(WWÖó\u001ekýa\u009a·ÕÈªñ\u0004Ü\u0087½\"&\u0015Âcj\u0093ôºäD%1t\"Ò\u0089Y\b9`¦\u0010ÀT\u0092¨\u0011òOû;TÅ\u0000K\u0090j¨"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u009açß\u0098¸\u0081N\u007fÀ\u009b\u0016û,ýº#ëà\u000b\u0096-\u0084ã!\u0010\u00ad& 4À\u0098qÜí\u008c\u00adHÙ\u0089Xã";
               var8 = "\u009açß\u0098¸\u0081N\u007fÀ\u009b\u0016û,ýº#ëà\u000b\u0096-\u0084ã!\u0010\u00ad& 4À\u0098qÜí\u008c\u00adHÙ\u0089Xã".length();
               var5 = '\u0018';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[10];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 22015;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
            byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
               "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      IDLE,
      SCANNING,
      RESULT_READY;

      @NotNull
      public static EnumEntries<IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 71952295982033L ^ 91252009618924L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[3];
         int var6 = 0;
         String var5 = "¥¡G¸e¡\u001aTâx%%cx\u000e\u0010\byñû\u0019uì!§\u0010àã)e\u0096\u0092õ`4\u001d|\rëa\nµ";
         int var7 = "¥¡G¸e¡\u001aTâx%%cx\u000e\u0010\byñû\u0019uì!§\u0010àã)e\u0096\u0092õ`4\u001d|\rëa\nµ".length();
         char var4 = 16;
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var13;
            if ((var3 += var4) >= var7) {
               IDLE = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

               );
               SCANNING = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

               );
               RESULT_READY = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

               );
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               );
               return;
            }

            var4 = var5.charAt(var3);
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

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Vec3 targetCenter;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private final List<Vec3> blacklist;
      private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 87469935840936L;
      private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         double argument1Arg,
         double argument2Arg,
         @NotNull Vec3 targetCenterArg,
         double argument4Arg,
         double argument5Arg,
         double argument6Arg,
         @NotNull List<? extends Vec3> blacklistArg
      ) {
         long var13 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 119703819885598L;
         Intrinsics.checkNotNullParameter(targetCenterArg, "targetCenter");
         Intrinsics.checkNotNullParameter(blacklistArg, "blacklist");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.targetCenter = targetCenterArg;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument5Arg;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument6Arg;
         this.blacklist = blacklistArg;
      }

      public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Vec3 getTargetCenter() {
         return this.targetCenter;
      }

      public final double IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final List<Vec3> getBlacklist() {
         return this.blacklist;
      }

      public final double IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final double IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         double var1, double var3, @NotNull Vec3 var5, long var6, double var8, double var10, double var12, @NotNull List var14, char var15
      ) {
         long var16 = (var6 << 16 | (long)var15 << 48 >>> 48) ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(23603, 6278065537874891197L ^ var16)
         );
         Intrinsics.checkNotNullParameter(
            var14, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(27665, 65247664647381396L ^ var16)
         );
         return new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var3, var5, var8, var10, var12, var14
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 66038333963179L;
         List var3 = this.blacklist;
         double var4 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         double var6 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         double var8 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Vec3 var10 = this.targetCenter;
         double var11 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         double var13 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "ScanContext(shiftHeight="
            + var13
            + ", rangeSq="
            + var11
            + ", targetCenter="
            + var10
            + ", maxStandYDelta="
            + var8
            + ", playerHalfWidth="
            + var6
            + ", playerHeight="
            + var4
            + ", blacklist="
            + var3
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Double.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Double.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + this.targetCenter.hashCode();
         var1 = var1 * 31 + Double.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         var1 = var1 * 31 + Double.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         var1 = var1 * 31 + Double.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
         return var1 * 31 + this.blacklist.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 97780382961222L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[11];
         int var7 = 0;
         String var6 = "\u009b\u009b\u0080\u000f\fÙ2½÷ò¡É}\u001fØ÷¥®\u008bT\u0011'\u008a\u008c $}\u0015\u0092¦\n\u000e\u001cd3à\u0080\u0084-ä.\u0099uFde³ÖñYÙ\u001e\u001eFë\u0001º G¡¿{/8úl¸ñ\u0088¡Þ\u001cO{QºñZ°\u009b\u0018óÇ@|\u001aº\u008e\b\u0006 g*#·@\u0096£à\u0015%\u0001\u0010@\u0098\u0092%þ\u001fÀ\"eÔhÂ\u0091g\u0097\u009c\u001dÿï\u0088(\u008eó'\u0085yóñ\u0093é\u0011\u0007H¿Ý'f\u00042\u0002ß\u0003,\u009f½;µ÷\u0014Yõ¨V»\u009et¸C\u001b\u0012\u0084 \u0085_\nì$l\u00079ÈëðËë\u0003v[m\u0082\u0003 Ö¸\u0096\u008dæß¸ç¼\u0005}|\u0018ú\u0016\u0013_®A£\u008aN\u0007ÁësÃ\u001c\u000b N/zSnHg pl\u008bå´\u0086\u0006cfvÕ\u0002oï¬«P\u0013S/\u0096³Hj+ç5sÈÒ,>0\u0080'ÊR\u001aÄ.Ä\u0081:3£â\u0094æ\u001bÅ\u008d:²>þC\u009fÊÈE½®_\nÔ-Èl}Î°|dÕJ\u000e\u0000gØ%\u008d";
         int var8 = "\u009b\u009b\u0080\u000f\fÙ2½÷ò¡É}\u001fØ÷¥®\u008bT\u0011'\u008a\u008c $}\u0015\u0092¦\n\u000e\u001cd3à\u0080\u0084-ä.\u0099uFde³ÖñYÙ\u001e\u001eFë\u0001º G¡¿{/8úl¸ñ\u0088¡Þ\u001cO{QºñZ°\u009b\u0018óÇ@|\u001aº\u008e\b\u0006 g*#·@\u0096£à\u0015%\u0001\u0010@\u0098\u0092%þ\u001fÀ\"eÔhÂ\u0091g\u0097\u009c\u001dÿï\u0088(\u008eó'\u0085yóñ\u0093é\u0011\u0007H¿Ý'f\u00042\u0002ß\u0003,\u009f½;µ÷\u0014Yõ¨V»\u009et¸C\u001b\u0012\u0084 \u0085_\nì$l\u00079ÈëðËë\u0003v[m\u0082\u0003 Ö¸\u0096\u008dæß¸ç¼\u0005}|\u0018ú\u0016\u0013_®A£\u008aN\u0007ÁësÃ\u001c\u000b N/zSnHg pl\u008bå´\u0086\u0006cfvÕ\u0002oï¬«P\u0013S/\u0096³Hj+ç5sÈÒ,>0\u0080'ÊR\u001aÄ.Ä\u0081:3£â\u0094æ\u001bÅ\u008d:²>þC\u009fÊÈE½®_\nÔ-Èl}Î°|dÕJ\u000e\u0000gØ%\u008d"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "È©\u0002ö\u008e\u0019C@EûGÎè©[§\u0085A\u008b\u0013s%\u0091i\u0018ÅK\u0003\u001fÛìÛ²f£+Øõ¦2\u001b\u00839#\u0094®SXG";
               var8 = "È©\u0002ö\u008e\u0019C@EûGÎè©[§\u0085A\u008b\u0013s%\u0091i\u0018ÅK\u0003\u001fÛìÛ²f£+Øõ¦2\u001b\u00839#\u0094®SXG".length();
               var5 = '\u0018';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[11];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 6111;
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
            byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
               "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      @NotNull
      private final List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> vantages;
      @Nullable
      private final Vec3 lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 77433942121323L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         @NotNull List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> vantagesArg,
         @Nullable Vec3 argument2Arg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 65087270860197L;
         Intrinsics.checkNotNullParameter(vantagesArg, "vantages");
         super();
         this.vantages = vantagesArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
      }

      @NotNull
      public final List<me.octo.client.utils.player.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> getVantages() {
         return this.vantages;
      }

      @Nullable
      public final Vec3 llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @Nullable
      public final Vec3 IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull List var1, long var2, @Nullable Vec3 var4
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"m">(805, 1585140844677204512L ^ var2)
         );
         return new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
            var1, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 110602592662946L;
         return "ScanFindings(vantages="
            + this.vantages
            + ", preVantage="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 38743747090725L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = "Fe\u0091\u009b\b\u0089Af>äÕ|ì¤\u0019[\u0007$U%]É\u0086rÊoZq¶Ù\u00984 wÑÛ\u0082ÀÄ¼}Ñþàì]{\u009b\u008aÂ\u0018\u001dÐºâ5\fs¾\u0099\u001c\u001cëÈS";
         int var8 = "Fe\u0091\u009b\b\u0089Af>äÕ|ì¤\u0019[\u0007$U%]É\u0086rÊoZq¶Ù\u00984 wÑÛ\u0082ÀÄ¼}Ñþàì]{\u009b\u008aÂ\u0018\u001dÐºâ5\fs¾\u0099\u001c\u001cëÈS"
            .length();
         char var5 = ' ';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u000eì\u009f`²¸XAí\u001b®ñ\u0095\u0000\u0082-}:\u001eXlÒ.Ò[SÛ§\u001d\u0092!\u0010'b5O¢\u0097û\u008c \bÇ\u0085M\u0098@ò=IØwj´äOºF\u0081ÕÐ²$\u0094z3\u0093Ùz9n\u0005\u0092";
               var8 = "\u000eì\u009f`²¸XAí\u001b®ñ\u0095\u0000\u0082-}:\u001eXlÒ.Ò[SÛ§\u001d\u0092!\u0010'b5O¢\u0097û\u008c \bÇ\u0085M\u0098@ò=IØwj´äOºF\u0081ÕÐ²$\u0094z3\u0093Ùz9n\u0005\u0092"
                  .length();
               var5 = '(';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 12805;
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
                  "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
               "me/octo/client/modules/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
