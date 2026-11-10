package me.octo.client.modules;

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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.player.MovementUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI {
   private volatile boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final Minecraft lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private BlockPos IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @Nullable
   private volatile List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private volatile int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private Vec3 lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private Integer IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private volatile boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private volatile int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private volatile boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private volatile boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private volatile boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @Nullable
   private volatile List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private volatile BlockPos IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private volatile int lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @Nullable
   private Vec3 llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @Nullable
   private Vec3 lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private int IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @Nullable
   private Vec3 lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   @NotNull
   private Vec3 lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   @NotNull
   private Vec3 lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private int IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   @NotNull
   private final ArrayList<lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   @Nullable
   private boolean[] IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private int IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private final long IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private final long llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private final long llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private final long IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private final long llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private final double lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private final double IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private final double lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private final double llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private final double lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private final int lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private final double IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private final double lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private final double IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private final long IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private final int lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private final int llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private final double lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private final double IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private final double lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private final float IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private final double lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private final double lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @NotNull
   private final List<boolean[]> IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private static long lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 138981856317232L;
   private static String[] IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private static String[] lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private static Map llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = new HashMap(13);
   private static long[] IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private static Integer[] IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   private static Map IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private static long[] IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private static Long[] llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private static Map IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;

   public lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI() {
      long var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ 81241615946850L;
      long var3 = var1 ^ 126451332795050L;
      super();
      PolinexAccessor.INSTANCE.eventBus.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this, var3);
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = true;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = true;
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var10001;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = -1;
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      Vec3 var14 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var14;
      Vec3 var15 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = var15;
      this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new ArrayList<>();
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         22421, 4205395520474818062L ^ var1
      );
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         19097, 8226595126948215553L ^ var1
      );
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         457, 3181616559496294485L ^ var1
      );
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         3449, 7276201885048110308L ^ var1
      );
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         9840, 1769483848454690794L ^ var1
      );
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = 1.5;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 1.25;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0.75;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 3.0;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = 0.18;
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"g">(
         22202, 7227719992780348335L ^ var1
      );
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 0.48;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 0.85;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = 0.34;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(
         32607, 5617883203240562374L ^ var1
      );
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"g">(
         26571, 3346774716086020828L ^ var1
      );
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"g">(
         27149, 4266829871030462235L ^ var1
      );
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 5.0;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = 0.12;
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = 2.5;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = 0.61F;
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 1.2;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = 0.03;
      boolean[][] var5 = new boolean[8][];
      boolean[] var6 = new boolean[]{true, false, false, false};
      var5[0] = var6;
      var6 = new boolean[]{false, true, false, false};
      var5[1] = var6;
      var6 = new boolean[]{false, false, true, false};
      var5[2] = var6;
      var6 = new boolean[]{false, false, false, true};
      var5[3] = var6;
      var6 = new boolean[]{true, false, true, false};
      var5[4] = var6;
      var6 = new boolean[]{true, false, false, true};
      var5[5] = var6;
      var6 = new boolean[]{false, true, true, false};
      var5[6] = var6;
      var6 = new boolean[]{false, true, false, true};
      var5[7] = var6;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = CollectionsKt.listOf((Object[])var5);
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var1) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @SubscribeEvent(priority = EventPriority.HIGH)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 var1, Vec3 var2, Vec3 var3, Vec3 var4, double var5
   ) {
      double var7 = var5 * var5;
      double var9 = var7 * var5;
      return new Vec3(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var7, var9, var1.x, var2.x, var3.x, var4.x),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var7, var9, var1.y, var2.y, var3.y, var4.y),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var7, var9, var1.z, var2.z, var3.z, var4.z)
      );
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return 1.65;
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, long param2, Vec3 param4, Vec3 param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, Vec3 var3, Vec3 var4, Vec3 var5) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var6 = var1 ^ 50945852923442L;
      double var8 = RangesKt.coerceIn(
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var6, var4, var5), 0.0, 1.0
      );
      double var10 = var3.x + (var4.x - var3.x) * var8;
      double var12 = var3.z + (var4.z - var3.z) * var8;
      double var14 = var5.x - var10;
      double var16 = var5.z - var12;
      return Math.sqrt(var14 * var14 + var16 * var16);
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, Vec3 param2, long param3, LocalPlayer param5, Vec3 param6, double param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1,
      long param2,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 var1,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var2,
      Vec3 var3,
      long var4
   ) {
      long var8;
      int var10;
      long var11;
      String var25;
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10000;
      Vec3 var10001;
      label49: {
         var4 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var4;
         long var6 = var4 ^ 34115183556163L;
         var8 = var4 ^ 112426027097263L;
         var10 = (int)((var4 ^ 114946115190260L) >>> 48);
         var11 = (var4 ^ 114946115190260L) << 16 >>> 16;
         var25 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            -5948506512179992227L, var4
         );
         var10000 = this;
         var10001 = var1;
         Vec3 var10002 = var2.getPoint();
         Vec3 var10003 = var3;
         if (var25 == null) {
            boolean var10007 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var10, var11, var2);
            Object var13 = null;
            byte var14 = 56;
            double var15 = this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
            boolean var17 = var10007;
            double var18 = 0.0;
            double var20 = 0.0;
            byte var22 = 0;
            Vec3 var23 = var3;
            Vec3 var24 = var10002;

            try {
               if (IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  var10000, var10001, var8, var24, var23, var22, var20, var18, var17, var15, var14, var13
               )) {
                  return true;
               }
            } catch (NoWhenBranchMatchedException var26) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var26, -5997664096988362465L, var4
               );
            }

            try {
               var10000 = this;
               var10001 = var1;
               if (var25 != null) {
                  break label49;
               }

               var10002 = var2.getPoint();
               var10003 = var1;
            } catch (NoWhenBranchMatchedException var29) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var29, -5997664096988362465L, var4
               );
            }
         }

         try {
            if (!var10000.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var10001, var10002, var10003, var6)) {
               return false;
            }

            var10000 = this;
            var10001 = var1;
         } catch (NoWhenBranchMatchedException var28) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var28, -5997664096988362465L, var4
            );
         }
      }

      try {
         boolean var31 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var10000,
            var10001,
            var8,
            var2.getPoint(),
            var3,
            0,
            0.0,
            0.0,
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var10, var11, var2),
            0.0,
            184,
            null
         );
         if (var25 != null) {
            return var31;
         }

         if (var31) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var27) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var27, -5997664096988362465L, var4
         );
      }

      return false;
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3,
      Vec3 var4
   ) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var5 = var1 ^ 97013943083581L;
      int var7 = (int)((var1 ^ 95593400107878L) >>> 48);
      long var8 = (var1 ^ 95593400107878L) << 16 >>> 16;
      Vec3 var10001 = var3.getPoint();
      Vec3 var10004 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(
         Vec3.ZERO, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(11117, 2493756295026016236L ^ var1)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         var10001,
         var5,
         var4,
         var10004,
         0,
         0.0,
         0.0,
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var7, var8, var3),
         0.0,
         184,
         null
      );
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(List param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      List param1, int param2, Vec3 param3, short param4, short param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Entity param1, List param2, Vec3 param3, int param4, int param5, boolean param6, int param7, boolean param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      List param1, int param2, List param3, int param4, long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(short param1, int param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, List param3, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      byte param1, Entity param2, List param3, long param4, Vec3 param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Vec3 param1, long param2, Vec3 param4, Vec3 param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1, Vec3 var3, Vec3 var4, Vec3 var5) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var6 = var1 ^ 95448452485435L;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         var3,
         var6,
         var4,
         var5,
         0,
         0.85,
         2.0,
         false,
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII,
         72,
         null
      );
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, long param2, Vec3 param4, Vec3 param5, int param6, double param7, double param9, boolean param11, double param12
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 var1, Vec3 var2) {
      return (float)Math.toDegrees(Math.atan2(-(var2.x - var1.x), var2.z - var1.z));
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean[] param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean[] param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(char param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, short param3, double param4, short param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double param1, double param3, long param5, int param7, double param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double param1, double param3, long param5, boolean param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      BlockPos var1, BlockPos var2, long var3, double var5
   ) {
      var3 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var3;
      long var7 = var3 ^ 120362805039133L;
      long var9 = var3 ^ 101139775828543L;
      String var11 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7574175897302674739L, var3
      );

      try {
         if (var1 == null) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var12) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var12, 7541924403685215601L, var3
         );
      }

      try {
         double var15;
         int var10000 = (
                  var15 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           var9,
                           me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var7, var1),
                           me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var7, var2)
                        )
                     - var5
               )
               == 0.0
            ? 0
            : (var15 < 0.0 ? -1 : 1);
         if (var11 != null) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (NoWhenBranchMatchedException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, 7541924403685215601L, var3
         );
      }

      return (boolean)0;
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, List param2, int param3, char param4, int param5, Vec3 param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(boolean param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(List var1, boolean var2, long var3) {
      var3 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var3;
      long var5 = var3 ^ 72917271684199L;
      long var7 = var3 ^ 59398586032317L;
      long var9 = var3 ^ 39466423578071L;
      long var11 = var3 ^ 127573315390054L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -801200090694635314L, var3
      );
      ArrayList var14 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var11);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var7);
      String var13 = var10000;
      Iterable var15 = var14;
      boolean var16 = false;

      for (Object var18 : var15) {
         if (var13 == null) {
            String var19 = (String)var18;
            boolean var20 = false;
            MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19, var5, true);
            if (var13 == null) {
               continue;
            }
         }
         break;
      }

      try {
         if (var2) {
            this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var1, var9);
         }
      } catch (NoWhenBranchMatchedException var21) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var21, -768078883497029492L, var3
         );
      }
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, byte param2, boolean param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2,
      long param3,
      List param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 58698053216089L;
      long var10001 = var1 ^ 112275502319736L;
      int var5 = (int)((var1 ^ 112275502319736L) >>> 32);
      int var6 = (int)((var1 ^ 112275502319736L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);

      try {
         if (this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            3, var5, (short)var6, this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII, (short)var7
         )) {
            MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(25037, 4378904554123497816L ^ var1), var3, false
               );
         }
      } catch (NoWhenBranchMatchedException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, 3920747830471398322L, var1
         );
      }
   }

   private final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 118710709913525L;

      try {
         if (!this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl) {
            return;
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, 6234413401981842270L, var1
         );
      }

      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10155, 2115067871157696481L ^ var1), var3, false
         );
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(25037, 4378801656489406900L ^ var1), var3, false
         );
   }

   private final ArrayList llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, Vec3 param2, long param3, List param5, Vec3 param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Vec3 param1, Vec3 param2, Vec3 param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      ArrayList param1, Vec3 param2, Vec3 param3, long param4, boolean param6, double param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1,
      long param2,
      Vec3 param4,
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      Vec3 param1, Vec3 param2, Vec3 param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, double param2, long param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArrayList IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      ArrayList param1, Vec3 param2, Vec3 param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Vec3 IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1, Vec3 param3, Vec3 param4, Vec3 param5) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Vec3 param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(List var1, long var2) {
      var2 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var2;
      long var4 = var2 ^ 79285383177832L;

      try {
         if (this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, true, var4) != null) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, 2982054500506307769L, var2
         );
      }

      return false;
   }

   private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      List param1, boolean param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(short param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 31244786426531L;
      String var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2742781245799555648L, var1
      );

      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var10000;
      while (true) {
         if (this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.size() >= 40) {
            try {
               var10000 = this;
               if (var5 != null) {
                  break;
               }

               this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI.remove(0);
               if (var5 == null) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var6) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var6, -2857249820373975678L, var1
               );
            }
         }

         var10000 = this;
         break;
      }

      var10000.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI
         .add(
            new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
               MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(21062, 33071634092379345L ^ var1), var3
                  ),
               MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(26106, 6130903185090411349L ^ var1), var3
                  ),
               MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(17751, 5127643126960970745L ^ var1), var3
                  ),
               MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(10155, 2115052031553222973L ^ var1), var3
                  )
            )
         );
   }

   private final Vec3 IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Vec3 param1, long param2, Vec3 param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1, List param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 72057481219930L;
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var3);
   }

   private final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI() {
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = null;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = null;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1;
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = -1;
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = null;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable Object param1, @Nullable Vec3 param2, long param3, boolean param5, boolean param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable Object param1, @NotNull List param2, @Nullable Vec3 param3, boolean param4, boolean param5, long param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(BlockPos param1, boolean param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Vec3 param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, int param3, double param4, double param6, boolean param8, double param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(
      short var1, int var2, int var3
   ) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
      long var6 = var4 ^ 42322133900070L;

      LocalPlayer var10000;
      try {
         var10000 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player;
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.player == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -4890283039107835399L, var4
         );
      }

      LocalPlayer var8 = var10000;
      Vec3 var10002 = me.octo.client.utils.player.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (Entity)var8, var6
      );
      Vec3 var10003 = var8.getDeltaMovement();
      Intrinsics.checkNotNullExpressionValue(
         var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(17775, 8398840597163163533L ^ var4)
      );
      return new me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var10002, var10003, var8.getYRot(), var8.getXRot(), var8.onGround()
      );
   }

   public final void lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 88545354386803L;
      long var5 = var1 ^ 2649622747350L;
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = true;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      int var7 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl++;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
      this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(false, var5);
      this.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI();
      this.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var3);
   }

   private final void IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(long var1) {
      var1 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ var1;
      long var3 = var1 ^ 37768624856488L;
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = true;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      int var5 = this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl++;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
      this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(false, var3);
      this.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
   }

   private static final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double var0, double var2, double var4, double var6, double var8, double var10, double var12
   ) {
      return 0.5 * (2 * var8 + (-var6 + var10) * var0 + (2 * var6 - 5 * var8 + 4 * var10 - var12) * var2 + (-var6 + 3 * var8 - 3 * var10 + var12) * var4);
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, List param2, char param3, lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param0,
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI param1,
      BlockPos param2,
      BlockPos param3,
      double param4,
      boolean param6,
      long param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param0,
      long param1,
      lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI param3,
      boolean param4,
      Vec3 param5,
      BlockPos param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var22 = lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll ^ 78756468968117L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[49];
      int var29 = 0;
      String var28 = "ö[Õ?Ë\u0098íÛá§\u0006µÊ<ª\u0088M:\u00ad1(ÿXu\u0018\u0092,ZÔ\u0007\u0082 »JO\u008b\u0086\t´\u000fèªªý\u0086ßÃ:¾\u0010ÕËk1\u0001Ò\u0010¶Ç\u0005ÍàË\u009eÎI\u0010Ü\u008c` \u0092\u0083ª[ÝÑô\u0085¦Ã$\u0098\u0010\u0083&òy\u001dF\u00ad°\u0081\u000fzHl &1\u0010\u0091ë{\u0099\u008f½×÷A\u0013Aâ=^.4\u0010\u0002ß\u0015Þ6¢Ñ\u0018RZ4³äê\u0090â(\u0085¹TñQ¯#@ù:Õ¥û÷\u0011¶\u000e'.\u0010I\n?\u001eq\u001bØè_Sw\u0083XéDÄìÂâm(\u0018É¯Ü\u00891:\u000e\u0089Ð·8oM\u0086qXs\u0095\u008c¡U\u009a¿Mrâ!û¤\u0010\u0095BAp²wM\u0089c\u0010ý\nWò¶µ¦\u001d\u009fÚ»3¿8\u0018\u009a\u0010-0\u001f*Ú\u0000%í\u001a¿ÎMM5×F\u0010Yß\u0091\u000eÍ\u007fU \u009eöµ\u0081jÊ\u0080M\u0018öLøË8^\u0096\u0017¨\u008d#\u0091ÌW\u0004\u008chgóv\\£Âu\u0018Þ@óíñìÇ6)\u001c,\u0013\u001ed\u0095\u008aò\r6gÑeáb8x-\u0089§+÷\b\u007f9\u0000ÉQ\u0086\t\u008a£\u00839{®ÿ´`Ðçô«¨\u0002a¢¶úÙ'©\r*Tüh¸¬\u0019ú9\u000fAjìðûß\u00192§P¼+\u0010\u001bUW4\u0003\u008d\u0001&N\u0094\u001el\u008fZRÁ84%¥ò\u009diÀYðçÀo\u007fPØ¿»ðÿÄF%3eÂ\u001e\u008f\u0019X²Ã\u008dFÞêÆÅa9\u008bp\nsÍuãÎt£\u0013µaU¡®,\r/rT =*D\u0082\u0013#»_ôÍB\u00137G\u001dIòèïbW\u007f\u0002|ØÒ,{Î\u0086d»(\u0080LÝ_q?YáT\u0003À2\u0094\u0018Y\u0092gô¸cB®Ã\u0000OH\u0098\u0089X\u009bQ{\u0003\u00144eeÆÐN\u0018%ÙûlØëÎ\"ETÂÇÌ/\u008f¶ÉOà¦VøKé\u0010oËLÅØ^æ\u008dèôþN\u001co\nÑ rÐt\u0004\u0005å~ =¦\u0010\u000fpõ\u0001&\u0094\u000bk?6MrÒ®\u0083Õ\u0085z\u001aÛH\u0010Ìëõ\u0090Á$ü\u001cÕ¥@\u001dÛ\u008a\u0082>0C\b\u0016Í\u008d1+1¹wcëyH?¨ù|C¡Hî°\u000f.Àµ\u008fdÚ\u0012\u0014É\u009eñ,jN\tW\u009an5Ü\u0086-§$(\u0019h+ÐqRZGÕ\u009fïÉ¼í\u0085\u0080\u0080_\u008fÂ%gÐ÷ïOdá\u0095\u0092\u0013`,Õ¼\u0016Ê\\\u0095º@mý|_¤-º\u000b\u0080bÐËR\u0015\u008cÖÿ þ¬tiL:Ù@v\u007fâÎeWv¶Y\"]»(ñÃü\u0019\u0011iéø\u008cÁ>\u0096\u0002WÅÖ\u0018ï%\u008b\u008b\u0086hø:\u0018\u0092\u009eAlNXZX°pf\u0007É²l$xü\u0081;é~ôÝ\u0010_¡\u0080p\u0093îâxÎîJà\u0091óSê(Ö*\u0016oúV0²þï\u008bx¤\u008b\u0004ÉÃêupîáäEÎ\u0081°<\u0006\u00113ôÍwÈ¥\u0085\u001cÇ! gäH¥\u0000üm\u0000\u0017zÝ¼Óùè²Ûd£ìº\u0094o~ñy<Ôæé\u0088\u009c(\u009fÕö}£éö,j\u001cÑ'\u0013ö'ö\u008a\u0004Ð#^õ:½çèÏ±zXo\u001dã}ö\u001b\u0096,æ&\u0010L\u008f©\\Önñ\u0085\u001d&\u0083\u007f\u008f\u009eó\u0099(ì\u001cv\u008fvè^Pm®¿\u0099§ÂL\u009d\u0092\u000e+w%â\u0096\u0089®\u009f\u00855\u009d\\°Ü4¼àÖQr2å\u0010\u0095Tz¨\u0013ðõ:Ã\u0089½H\u0083sT_\u0010\u0082\u0012\\ó,\u0086×þÌ{\u0087¡y\u0014·\u001a Ó\u009c+\u0010nXaÂ¡\u0089X\u0014V~\u0000#_n\u0088bd\u0000yHàH?*í\u0017ÿ¾\u0018Ô\u009cHç\u009f\u0018qþ[\u0007\u0096ê^oÏÆ\u009b~ZÃÕýW6 Ý^\u001fÆÁÂ4\u0002hë\u0090|ºÝ\u0093¯ÚJï£`Ñ*ô\u0098òoÌÔg\u0091Ð :£Äè\u0097\u0010YhQÞb\u0015\u0016ÇÌ\u0083\nÍq\u001dËQ\u0014\u001dË\u0098\u001fêz:áß(fF©kÕf[\u0001½¯²ñtñ\u0012\u0094%\u001b¸®ª\\{\u009b k\u009aH/ó-äÂ\u001f\u0082\u000eç»b¦\u0018ÀòÒRo\u009bÞ£\u0014\u0097:ò\u0086Í\u00adÍ\u007fÙ¡²\u001c¨H_(Î\r9\u0010ÑCãqR\u0014íá/mÑÌ½·Ô==Kxä&pá\u001c©µ\u0097ñÈ\u009dzúè\t\u0081µ \u0086|¹Æ\u008aï\u008e\u000b\u008bZ=¨Ï.\u0010X¢»\u0093ÜÎé\nùç9c\u0085]%\u0086K\u0010÷1\u008e\u0096?'®\u0081qR\u008eüío\rC\u0010Ç\u0004UY~ã¾tÆØ\u0015unj>õP&\u0094¾ë\u001fM\u0019fª\u0094`÷S\u0016\u0099TêÝÛ<9¬*$\u0012aKÑKË¤\u0093\u0095\u0086\u0088P2G\u001aÜÎ?g¡\u009aû]lP\u0001ý²Ö=(ª\u0006\u0013\u009f@otû\u0001Ä\u0091\u0084¬H\b\u00889>\u001e\u0005\u0004\u0012ü/\u001c \u0085g\u009aze³,_ÿ\u0016Þ¡G'\u009cú\u009fæù1\u0018AÇp{\u0085Z\u008dûð\u0088l8_\u0004\u0003\u0093\u0084à&YàûM§óù\u0014-\u0010\t0\u0089g\u0002Üw=\r\t>¨XÜ\u009b\u0093,]óJÊ;K\u0005\b;&L8\u008e\u0093x]ëy\u000eQP\f";
      int var30 = "ö[Õ?Ë\u0098íÛá§\u0006µÊ<ª\u0088M:\u00ad1(ÿXu\u0018\u0092,ZÔ\u0007\u0082 »JO\u008b\u0086\t´\u000fèªªý\u0086ßÃ:¾\u0010ÕËk1\u0001Ò\u0010¶Ç\u0005ÍàË\u009eÎI\u0010Ü\u008c` \u0092\u0083ª[ÝÑô\u0085¦Ã$\u0098\u0010\u0083&òy\u001dF\u00ad°\u0081\u000fzHl &1\u0010\u0091ë{\u0099\u008f½×÷A\u0013Aâ=^.4\u0010\u0002ß\u0015Þ6¢Ñ\u0018RZ4³äê\u0090â(\u0085¹TñQ¯#@ù:Õ¥û÷\u0011¶\u000e'.\u0010I\n?\u001eq\u001bØè_Sw\u0083XéDÄìÂâm(\u0018É¯Ü\u00891:\u000e\u0089Ð·8oM\u0086qXs\u0095\u008c¡U\u009a¿Mrâ!û¤\u0010\u0095BAp²wM\u0089c\u0010ý\nWò¶µ¦\u001d\u009fÚ»3¿8\u0018\u009a\u0010-0\u001f*Ú\u0000%í\u001a¿ÎMM5×F\u0010Yß\u0091\u000eÍ\u007fU \u009eöµ\u0081jÊ\u0080M\u0018öLøË8^\u0096\u0017¨\u008d#\u0091ÌW\u0004\u008chgóv\\£Âu\u0018Þ@óíñìÇ6)\u001c,\u0013\u001ed\u0095\u008aò\r6gÑeáb8x-\u0089§+÷\b\u007f9\u0000ÉQ\u0086\t\u008a£\u00839{®ÿ´`Ðçô«¨\u0002a¢¶úÙ'©\r*Tüh¸¬\u0019ú9\u000fAjìðûß\u00192§P¼+\u0010\u001bUW4\u0003\u008d\u0001&N\u0094\u001el\u008fZRÁ84%¥ò\u009diÀYðçÀo\u007fPØ¿»ðÿÄF%3eÂ\u001e\u008f\u0019X²Ã\u008dFÞêÆÅa9\u008bp\nsÍuãÎt£\u0013µaU¡®,\r/rT =*D\u0082\u0013#»_ôÍB\u00137G\u001dIòèïbW\u007f\u0002|ØÒ,{Î\u0086d»(\u0080LÝ_q?YáT\u0003À2\u0094\u0018Y\u0092gô¸cB®Ã\u0000OH\u0098\u0089X\u009bQ{\u0003\u00144eeÆÐN\u0018%ÙûlØëÎ\"ETÂÇÌ/\u008f¶ÉOà¦VøKé\u0010oËLÅØ^æ\u008dèôþN\u001co\nÑ rÐt\u0004\u0005å~ =¦\u0010\u000fpõ\u0001&\u0094\u000bk?6MrÒ®\u0083Õ\u0085z\u001aÛH\u0010Ìëõ\u0090Á$ü\u001cÕ¥@\u001dÛ\u008a\u0082>0C\b\u0016Í\u008d1+1¹wcëyH?¨ù|C¡Hî°\u000f.Àµ\u008fdÚ\u0012\u0014É\u009eñ,jN\tW\u009an5Ü\u0086-§$(\u0019h+ÐqRZGÕ\u009fïÉ¼í\u0085\u0080\u0080_\u008fÂ%gÐ÷ïOdá\u0095\u0092\u0013`,Õ¼\u0016Ê\\\u0095º@mý|_¤-º\u000b\u0080bÐËR\u0015\u008cÖÿ þ¬tiL:Ù@v\u007fâÎeWv¶Y\"]»(ñÃü\u0019\u0011iéø\u008cÁ>\u0096\u0002WÅÖ\u0018ï%\u008b\u008b\u0086hø:\u0018\u0092\u009eAlNXZX°pf\u0007É²l$xü\u0081;é~ôÝ\u0010_¡\u0080p\u0093îâxÎîJà\u0091óSê(Ö*\u0016oúV0²þï\u008bx¤\u008b\u0004ÉÃêupîáäEÎ\u0081°<\u0006\u00113ôÍwÈ¥\u0085\u001cÇ! gäH¥\u0000üm\u0000\u0017zÝ¼Óùè²Ûd£ìº\u0094o~ñy<Ôæé\u0088\u009c(\u009fÕö}£éö,j\u001cÑ'\u0013ö'ö\u008a\u0004Ð#^õ:½çèÏ±zXo\u001dã}ö\u001b\u0096,æ&\u0010L\u008f©\\Önñ\u0085\u001d&\u0083\u007f\u008f\u009eó\u0099(ì\u001cv\u008fvè^Pm®¿\u0099§ÂL\u009d\u0092\u000e+w%â\u0096\u0089®\u009f\u00855\u009d\\°Ü4¼àÖQr2å\u0010\u0095Tz¨\u0013ðõ:Ã\u0089½H\u0083sT_\u0010\u0082\u0012\\ó,\u0086×þÌ{\u0087¡y\u0014·\u001a Ó\u009c+\u0010nXaÂ¡\u0089X\u0014V~\u0000#_n\u0088bd\u0000yHàH?*í\u0017ÿ¾\u0018Ô\u009cHç\u009f\u0018qþ[\u0007\u0096ê^oÏÆ\u009b~ZÃÕýW6 Ý^\u001fÆÁÂ4\u0002hë\u0090|ºÝ\u0093¯ÚJï£`Ñ*ô\u0098òoÌÔg\u0091Ð :£Äè\u0097\u0010YhQÞb\u0015\u0016ÇÌ\u0083\nÍq\u001dËQ\u0014\u001dË\u0098\u001fêz:áß(fF©kÕf[\u0001½¯²ñtñ\u0012\u0094%\u001b¸®ª\\{\u009b k\u009aH/ó-äÂ\u001f\u0082\u000eç»b¦\u0018ÀòÒRo\u009bÞ£\u0014\u0097:ò\u0086Í\u00adÍ\u007fÙ¡²\u001c¨H_(Î\r9\u0010ÑCãqR\u0014íá/mÑÌ½·Ô==Kxä&pá\u001c©µ\u0097ñÈ\u009dzúè\t\u0081µ \u0086|¹Æ\u008aï\u008e\u000b\u008bZ=¨Ï.\u0010X¢»\u0093ÜÎé\nùç9c\u0085]%\u0086K\u0010÷1\u008e\u0096?'®\u0081qR\u008eüío\rC\u0010Ç\u0004UY~ã¾tÆØ\u0015unj>õP&\u0094¾ë\u001fM\u0019fª\u0094`÷S\u0016\u0099TêÝÛ<9¬*$\u0012aKÑKË¤\u0093\u0095\u0086\u0088P2G\u001aÜÎ?g¡\u009aû]lP\u0001ý²Ö=(ª\u0006\u0013\u009f@otû\u0001Ä\u0091\u0084¬H\b\u00889>\u001e\u0005\u0004\u0012ü/\u001c \u0085g\u009aze³,_ÿ\u0016Þ¡G'\u009cú\u009fæù1\u0018AÇp{\u0085Z\u008dûð\u0088l8_\u0004\u0003\u0093\u0084à&YàûM§óù\u0014-\u0010\t0\u0089g\u0002Üw=\r\t>¨XÜ\u009b\u0093,]óJÊ;K\u0005\b;&L8\u008e\u0093x]ëy\u000eQP\f"
         .length();
      char var27 = 24;
      int var35 = -1;

      label73:
      while (true) {
         String var36 = var28.substring(++var35, var35 + var27);
         int var10001 = -1;

         while (true) {
            byte[] var32 = var24.doFinal(var36.getBytes("ISO-8859-1"));
            String var50 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32).intern();
            switch (var10001) {
               case 0:
                  var31[var29++] = var50;
                  if ((var35 += var27) >= var30) {
                     IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = var31;
                     lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = new String[49];
                     IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[3];
                     int var14 = 0;
                     String var15 = "uwÄ\u0017·HÜC+u ôÑ\nf\u009b¤)4Ø\u009dLÕ\u0099";
                     int var16 = "uwÄ\u0017·HÜC+u ôÑ\nf\u009b¤)4Ø\u009dLÕ\u0099".length();
                     byte var13 = 0;

                     do {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        var10001 = var14++;
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
                        byte var58 = -1;
                        var17[var10001] = var10004;
                     } while (var13 < var16);

                     IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = var17;
                     IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = new Integer[3];
                     IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u0084à¹ty\u0089b6SK2µq-M\u009f\u009f'\u007f]j É BÚÒ\u0091\\\u0019\u008b£";
                     int var5 = "\u0084à¹ty\u0089b6SK2µq-M\u009f\u009f'\u007f]j É BÚÒ\u0091\\\u0019\u008b£".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        int var46 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var46, var2).getBytes("ISO-8859-1");
                        long[] var40 = var6;
                        var46 = var3++;
                        long var55 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var60 = -1;

                        while (true) {
                           long var8 = var55;
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
                           long var63 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var60) {
                              case 0:
                                 var40[var46] = var63;
                                 if (var2 >= var5) {
                                    IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var6;
                                    llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = new Long[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var46] = var63;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ë)á»B!\u0002;Pþ\u0001º|\u0006±»";
                                 var5 = "ë)á»B!\u0002;Pþ\u0001º|\u0006±»".length();
                                 var2 = 0;
                           }

                           byte var48 = var2;
                           var2 += 8;
                           var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
                           var40 = var6;
                           var46 = var3++;
                           var55 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var60 = 0;
                        }
                     }
                  }

                  var27 = var28.charAt(var35);
                  break;
               default:
                  var31[var29++] = var50;
                  if ((var35 += var27) < var30) {
                     var27 = var28.charAt(var35);
                     continue label73;
                  }

                  var28 = "¹)å\u0086®¸a£\u0091cÿbÿ8×r¡ÿôCã\u0013\u0014-\u008a&ê¢=W®ÐÞâ?r9j?\u0097R SÌÇ\u0090\n¬\u0016ùÔ;í\u00069\u008a;\u0000ám;)Æå\u0018E\r\u008cAj Åiá*ÜT\u0012\u0002!IRIò\u0016è\u0090cÎ";
                  var30 = "¹)å\u0086®¸a£\u0091cÿbÿ8×r¡ÿôCã\u0013\u0014-\u008a&ê¢=W®ÐÞâ?r9j?\u0097R SÌÇ\u0090\n¬\u0016ùÔ;í\u00069\u008a;\u0000ám;)Æå\u0018E\r\u008cAj Åiá*ÜT\u0012\u0002!IRIò\u0016è\u0090cÎ"
                     .length();
                  var27 = '@';
                  var35 = -1;
            }

            var36 = var28.substring(++var35, var35 + var27);
            var10001 = 0;
         }
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17459;
      if (lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl[var5].getBytes("ISO-8859-1");
         lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl[var5];
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
            "me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22085;
      if (IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll[var3] == null) {
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
         long var5 = IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII[var3];
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
         Object[] var9 = (Object[])IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll[var3] = var15;
      }

      return IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll[var3];
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
            "me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10955;
      if (llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll[var3] == null) {
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
         long var5 = IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll[var3];
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
         Object[] var9 = (Object[])IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll[var3] = var15;
      }

      return llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll[var3];
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
            "me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 96418607255647L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean var1, boolean var2, boolean var3, boolean var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
      }

      public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(boolean var1) {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var1;
      }

      public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         boolean var1, boolean var2, boolean var3, boolean var4
      ) {
         return new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 21746656480881L;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         boolean var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "KeyPress(forward=" + var6 + ", left=" + var5 + ", right=" + var4 + ", backward=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Boolean.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         this(false, false, false, false, 15, null);
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 2125150069078L;
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
         String var6 = "ÿï\u009e4,.¤\u0097ícË\u0016bYIôAÒ#â1wÉ\u0013\u0018Uc\bú\">\u0098÷U¢g)RÄË\u008edáza\nËJä";
         int var8 = "ÿï\u009e4,.¤\u0097ícË\u0016bYIôAÒ#â1wÉ\u0013\u0018Uc\bú\">\u0098÷U¢g)RÄË\u008edáza\nËJä".length();
         char var5 = 24;
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
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[4];
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

                     var6 = "Ò}0x\u0089»\u000eÔ;\u009ezj±\"}\u0001\u0000¹´\u0006Yì\tc»í\u0084þSLµUTül\u0010\u009a5á@\u0010Åpëo7¯iíA)p\u008d¯[2Ñ";
                     var8 = "Ò}0x\u0089»\u000eÔ;\u009ezj±\"}\u0001\u0000¹´\u0006Yì\tc»í\u0084þSLµUTül\u0010\u009a5á@\u0010Åpëo7¯iíA)p\u008d¯[2Ñ".length();
                     var5 = '(';
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 6176;
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
                  "me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/modules/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
