package me.octo.client.modules.impl.features.visuals;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.render.WorldRenderEnvironment;
import me.octo.client.render.lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII;
import me.octo.client.render.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.render.engine.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;

public final class GemstoneESP extends BooleanModule {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final me.octo.client.utils.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI<Integer> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private volatile boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private volatile boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final AtomicLong IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @NotNull
   private volatile llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private final long IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private AABB[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private int[] llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private int[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @JvmField
   @NotNull
   public static GemstoneESP IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static int[] IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static long IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = 31935174985181L;
   private static String[] llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static String[] lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static Map IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = new HashMap(13);
   private static long[] IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static Integer[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static Map lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static long[] IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static Long[] IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static Map IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;

   private GemstoneESP() {
      long var1 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ 12817185487661L;
      long var3 = var1 ^ 18139500935834L;
      long var10001 = var1 ^ 67203203712934L;
      int var5 = (int)((var1 ^ 67203203712934L) >>> 32);
      int var6 = (int)((var1 ^ 67203203712934L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      ModuleCategory var10003 = ModuleCategory.SKILLS;
      Setting[] var8 = new Setting[]{
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
      };
      super("Gemstone ESP", "Scans and highlights gemstone blocks", var10003, "Visuals", var8);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.utils.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI<>(
         "GemstoneESP",
         GemstoneESP::lIlIllIIIllllllIlIIlllIllIlIlllIlIlIlIllIIllllIIIlIIllIlllIlIlIIlIlllllIlIllIIlIIllIl,
         GemstoneESP::lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll,
         GemstoneESP::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         GemstoneESP::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         null,
         32,
         null
      );
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new AtomicLong(0L);
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
         24213, 7729006184943574675L ^ var1
      );
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII<"e">(
         20387, 4831420704028765010L ^ var1
      );
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         new AABB[0], new int[0], new int[0], 0L
      );
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII<"e">(
         15723, 6554308109590223259L ^ var1
      );
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new AABB[256];
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new int[256];
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new int[256];
   }

   public final int IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
   }

   public final int lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
   }

   public final int IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
   }

   public final double IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
   }

   public final long llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      int var3 = (int)((var1 ^ 115456350921475L) >>> 32);
      int var4 = (int)((var1 ^ 115456350921475L) << 32 >>> 32);
      long var5 = var1 ^ 127531986608997L;
      long var7 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var7);
      this.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var5);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4);
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      int var6 = (int)((var4 ^ 104622255975530L) >>> 32);
      int var7 = (int)((var4 ^ 104622255975530L) << 32 >>> 32);
      long var8 = var4 ^ 136658572220922L;
      long var10 = (var4 ^ 0L) >>> 8;
      int var12 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var10, (byte)var12);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var6, var7);
      this.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var8);
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eventArg
   ) {
      long var2 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ 99125247059420L;
      long var4 = var2 ^ 27279298593221L;
      Intrinsics.checkNotNullParameter(eventArg, "event");
      this.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var4);
   }

   private final void IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(long var1) {
      var1 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ var1;
      long var3 = var1 ^ 24340659608701L;
      long var5 = var1 ^ 24582774301070L;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         new AABB[0], new int[0], new int[0], this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.incrementAndGet()
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = this.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(
         var3
      );
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var5, this
      );
   }

   private final int IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IllIlllllllllIlllIIllIIlIllIllllIlIIlIIllllIIllIlIIIlIlIlIlIlIllIIlIlIIlIIllIlIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      BlockState param1, boolean param2, int param3, int param4, char param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, BlockState param3, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final int lIlIllIIIllllllIlIIlllIllIlIlllIlIlIlIllIIllllIIIlIIllIlllIlIlIIlIlllllIlIllIIlIIllIl() {
      return lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI();
   }

   private static final boolean lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll() {
      return true;
   }

   private static final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      GemstoneESP var0, int var1, char var2, char var3, BlockState var4, BlockPos var5
   ) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
      long var8 = var6 ^ 44497564523830L;
      Intrinsics.checkNotNullParameter(
         var4, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(15972, 5425961150684704167L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var5, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(25915, 2313288242548504313L ^ var6)
      );
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         9188964924945664182L, var6
      );
      Integer var11 = var0.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var8,
         var4,
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
            .isToggled()
      );
      int var12 = var11.intValue();
      boolean var13 = false;
      String[] var10 = var10000;

      label34: {
         label33: {
            try {
               var16 = var12;
               if (var10 != null) {
                  break label34;
               }

               if (var12 >= 0) {
                  break label33;
               }
            } catch (NoWhenBranchMatchedException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, 9148232598647656536L, var6
               );
            }

            var16 = 0;
            break label34;
         }

         var16 = 1;
      }

      try {
         if (var16 != 0) {
            return var11;
         }
      } catch (NoWhenBranchMatchedException var14) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var14, 9148232598647656536L, var6
         );
      }

      return null;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      GemstoneESP var0, long var1, BlockState var3
   ) {
      var1 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ var1;
      long var10001 = var1 ^ 49008796858036L;
      int var4 = (int)((var1 ^ 49008796858036L) >>> 32);
      int var5 = (int)((var1 ^ 49008796858036L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(14780, 8449251531552298816L ^ var1)
      );
      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3,
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
            .isToggled(),
         var4,
         var5,
         (char)var6
      );
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, GemstoneESP var2) {
      var0 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ var0;
      long var3 = var0 ^ 37354091037561L;

      try {
         var2.IllIlllllllllIlllIIllIIlIllIllllIlIIlIIllllIIllIlIIIlIlIlIlIlIllIIlIlIIlIIllIlIIIlIIl(var3);
      } finally {
         var2.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;
      }
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IntRef var0, long var1, int[] var3, AABB[] var4, int var5, int[] var6, WorldRenderEnvironment var7
   ) {
      var1 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ var1;
      int var8 = (int)((var1 ^ 107586036707159L) >>> 48);
      long var9 = (var1 ^ 107586036707159L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(
         var7, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(22364, 3024723730935952777L ^ var1)
      );
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1045391135658047922L, var1
      );
      int var12 = 0;
      int var13 = var0.element;
      String[] var11 = var10000;

      while (var12 < var13) {
         try {
            if (var3[var12] != 0) {
               short var16 = (short)var8;
               AABB var10002 = var4[var12];
               Intrinsics.checkNotNull(var4[var12]);
               lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  var16,
                  var7,
                  var10002,
                  new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(var5 << 24 | var6[var12]),
                  null,
                  var3[var12],
                  0,
                  var9,
                  0.0F,
                  48,
                  null
               );
            }
         } catch (NoWhenBranchMatchedException var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, 1148759093924503900L, var1
            );
         }

         var12++;
         if (var11 != null) {
            break;
         }
      }

      return Unit.INSTANCE;
   }

   private static final void lllIllIIllIIIllllllIIIlIIlIlIlIIlllllIllllIIIllIllllllllIIlIIlIlIlIIIIIIlIIIlllllllIl(long var0) {
      var0 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ var0;
      long var2 = var0 ^ 23874379948939L;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(25414, 1500537735729101261L ^ var0), var2
      );
   }

   static {
      long var31 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll ^ 25352053318L;
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var23 = 1; var23 < 8; var23++) {
         var10003[var23] = (byte)(var31 << var23 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[38];
      int var27 = 0;
      String var26 = "t¨¨²¨}LÊ,ò\u009bñXZ+8l¯¤W»íßÞùwÄWyV\u0013ú\u001003#r4g¹ \rý\u008bnsÀè;Æ\u0012v$Û$\u0084>\u008f\u0007'¯\u0000\u0001l+pE½þ9\u0089â4\u0010yé\u007f¢ bëP)Êø\u0017GZª¤\u0018#¡ÊÕ\u0010\b\u0088\u0015\u009f\u008bØËÝÄ\u0018Jp\u001aË\ný8\u001aj\u0010j´æ\u00140\u0083y8Å\u0095ÞÈ\u0097[\tn(OðÁÏ\u0016ØæËÀ¡¤SÐô\u008bÖ2\u0080Z¬¿\n\u0099\u0092-'\u0086Æ?N`I¦Æ\u008cK\u0001«Ü³ ß\u0013<\tÅ\u009e:xt\u0096³*`\u0090\föøS½cÊ,Ö}`üä3g;¯Ù Ë%Â¼\u001eÆ¹7ãôræéVùB,\u0017\u0097Á©\u000e$\u0001~\u0089C\u0082Z\u0095?Ç(¶û:A\u0013;hÁ\u001aj\u0013\u0019æ×5~\u0004\u0002\u000fo!Ò\u008c\u0003¼÷ÙÐþëõÛî.âcs\u0087\u008a½HìÁ\u0004ÞX¸\u0012\u001cï§jÓðq\\HÊ'AÖ\u0004Üñ\u0099ÔÛ\u008dRiY\\rXs$»\u001a8 É·|}AE\u0086,u\u001aÇ\u0015Ï§\u00981~a4\u0012RÛª¥\u000b\u0095e\u0096\u0086b2y¶\u0018Gq\u0081Ø\u0002\u0002]Ðî\r\u009f±?ú5óK;2ý<ÔH¾\u0010ÿ\u0083\u00ad\u0083ÆDâ\u001eX}1BçH\u009aV\u0010\u007f¬b#\u0096\fäHeP\u0083~ÿ\u009c}K\u0010Ò²O\u0007\u009e@\t& ½Ã±Ç|ýã\u0018Ýz\u008bÊOJ\u0099Z_\u00820J\u008f\u008e\u001f\tp½\u0016[\u0013Ö¯ý\u0010t¿|Ô<ç\u0081\u0084\u0004\u00ad\u000fÍ\u0092\u000fÐ\u00078ÃÑòÎ&\u0005=½Ù\rµª\u008câ\u0095;Æ(ó8\u00111r\u0084ö\u0002.\u0089¨\\\u000f\u0086\u0010´ûç<\u001d'}\u000b\u008dÕÿ\u007fç®r\u0000!T«²A8À\u0010vå¿\u0014Uv¬+³©Zo^¥Èþ\u0018öm¯-«\u001d\u009a\u00ad\u001d6¬:TïN\u0087áU!·O'¥ö\u0010vh\u008bÁJ\bp>}2ëø\u001eÔ£\u0097\u0010\u0018Þáy\u0091½\"\u0086\u008a\u0017MØ2\u0004ù_\u0010²v\u001aPÄô\u000eÃÂ\u0015K.\u0083|»æ\u0018\u000eî\u0010ù\u0082ÁÔó¤ÊvGä²aÊ6È\u008eð\n{à\u0088\u0018\u008d=û¨\u007f©¯\u008câX¸z&o°=m\u0083ìZ÷\u009a\u0019x\u0018¡\u0012s U\f\u0094ý\u0014ð\u009dD:÷Ú©±±Ã\u0096åJhm\u0010AúþO5¹¼\u00812\u0012ç.ÁÊ»J\u0010&D\u0000?\u0081ÉÔò]«\u0006ó¿7øG \u0019Ò¬Ù ®s/ÿ\u0007K¾F°ÿªA7¡Sîaâ[\u000fËïÛ4e.\u0017\u0010\u0012â?\u009a©\u001d¦ÝT\u00ad\u008dn\u008bÂ¼Ü \u008eÃ\u0082U1þ¹å\u0086ÅP\u009dl.\nø7;\u0090ñÈÎ\u0012öÁ\u001dÉw£Ý%W8a\u0012\u009cG> /âÍrù\u000eb~\u0012ß:m×ÈJ9p¿4³°OÚbY\u009diVÜ\u008bi\u009cºtF\u008côõ\u007fÔ\u008e_\u0019Tkw\u0082`=\u0013\u00107Hx\u008c\u0089\u0000ï¬õ\u0014\u008eU{ÇE\u0014 \u0018pW×\u0094rà4.<\u0013Q+ûõ_?¥&ãK#>áIóËâ\u001a¼Ô:\u0010!GÙ4¤Ø=QÌ\u0010)û7`7\f \u008c\u008a÷äÃÀ\u0090ò\u001a\u0007ê\u0003ÙIõ\u0086\\$\bµ\u0092\u000f\riBO²\u0098ÄÑZ\u001e\u0010\u0089TäÑc\u008cE\u0099Öõê\u0006Ô-\u000f\u009f";
      int var28 = "t¨¨²¨}LÊ,ò\u009bñXZ+8l¯¤W»íßÞùwÄWyV\u0013ú\u001003#r4g¹ \rý\u008bnsÀè;Æ\u0012v$Û$\u0084>\u008f\u0007'¯\u0000\u0001l+pE½þ9\u0089â4\u0010yé\u007f¢ bëP)Êø\u0017GZª¤\u0018#¡ÊÕ\u0010\b\u0088\u0015\u009f\u008bØËÝÄ\u0018Jp\u001aË\ný8\u001aj\u0010j´æ\u00140\u0083y8Å\u0095ÞÈ\u0097[\tn(OðÁÏ\u0016ØæËÀ¡¤SÐô\u008bÖ2\u0080Z¬¿\n\u0099\u0092-'\u0086Æ?N`I¦Æ\u008cK\u0001«Ü³ ß\u0013<\tÅ\u009e:xt\u0096³*`\u0090\föøS½cÊ,Ö}`üä3g;¯Ù Ë%Â¼\u001eÆ¹7ãôræéVùB,\u0017\u0097Á©\u000e$\u0001~\u0089C\u0082Z\u0095?Ç(¶û:A\u0013;hÁ\u001aj\u0013\u0019æ×5~\u0004\u0002\u000fo!Ò\u008c\u0003¼÷ÙÐþëõÛî.âcs\u0087\u008a½HìÁ\u0004ÞX¸\u0012\u001cï§jÓðq\\HÊ'AÖ\u0004Üñ\u0099ÔÛ\u008dRiY\\rXs$»\u001a8 É·|}AE\u0086,u\u001aÇ\u0015Ï§\u00981~a4\u0012RÛª¥\u000b\u0095e\u0096\u0086b2y¶\u0018Gq\u0081Ø\u0002\u0002]Ðî\r\u009f±?ú5óK;2ý<ÔH¾\u0010ÿ\u0083\u00ad\u0083ÆDâ\u001eX}1BçH\u009aV\u0010\u007f¬b#\u0096\fäHeP\u0083~ÿ\u009c}K\u0010Ò²O\u0007\u009e@\t& ½Ã±Ç|ýã\u0018Ýz\u008bÊOJ\u0099Z_\u00820J\u008f\u008e\u001f\tp½\u0016[\u0013Ö¯ý\u0010t¿|Ô<ç\u0081\u0084\u0004\u00ad\u000fÍ\u0092\u000fÐ\u00078ÃÑòÎ&\u0005=½Ù\rµª\u008câ\u0095;Æ(ó8\u00111r\u0084ö\u0002.\u0089¨\\\u000f\u0086\u0010´ûç<\u001d'}\u000b\u008dÕÿ\u007fç®r\u0000!T«²A8À\u0010vå¿\u0014Uv¬+³©Zo^¥Èþ\u0018öm¯-«\u001d\u009a\u00ad\u001d6¬:TïN\u0087áU!·O'¥ö\u0010vh\u008bÁJ\bp>}2ëø\u001eÔ£\u0097\u0010\u0018Þáy\u0091½\"\u0086\u008a\u0017MØ2\u0004ù_\u0010²v\u001aPÄô\u000eÃÂ\u0015K.\u0083|»æ\u0018\u000eî\u0010ù\u0082ÁÔó¤ÊvGä²aÊ6È\u008eð\n{à\u0088\u0018\u008d=û¨\u007f©¯\u008câX¸z&o°=m\u0083ìZ÷\u009a\u0019x\u0018¡\u0012s U\f\u0094ý\u0014ð\u009dD:÷Ú©±±Ã\u0096åJhm\u0010AúþO5¹¼\u00812\u0012ç.ÁÊ»J\u0010&D\u0000?\u0081ÉÔò]«\u0006ó¿7øG \u0019Ò¬Ù ®s/ÿ\u0007K¾F°ÿªA7¡Sîaâ[\u000fËïÛ4e.\u0017\u0010\u0012â?\u009a©\u001d¦ÝT\u00ad\u008dn\u008bÂ¼Ü \u008eÃ\u0082U1þ¹å\u0086ÅP\u009dl.\nø7;\u0090ñÈÎ\u0012öÁ\u001dÉw£Ý%W8a\u0012\u009cG> /âÍrù\u000eb~\u0012ß:m×ÈJ9p¿4³°OÚbY\u009diVÜ\u008bi\u009cºtF\u008côõ\u007fÔ\u008e_\u0019Tkw\u0082`=\u0013\u00107Hx\u008c\u0089\u0000ï¬õ\u0014\u008eU{ÇE\u0014 \u0018pW×\u0094rà4.<\u0013Q+ûõ_?¥&ãK#>áIóËâ\u001a¼Ô:\u0010!GÙ4¤Ø=QÌ\u0010)û7`7\f \u008c\u008a÷äÃÀ\u0090ò\u001a\u0007ê\u0003ÙIõ\u0086\\$\bµ\u0092\u000f\riBO²\u0098ÄÑZ\u001e\u0010\u0089TäÑc\u008cE\u0099Öõê\u0006Ô-\u000f\u009f"
         .length();
      char var25 = '(';
      int var36 = -1;

      label72:
      while (true) {
         String var37 = var26.substring(++var36, var36 + var25);
         int var10001 = -1;

         while (true) {
            byte[] var30 = var22.doFinal(var37.getBytes("ISO-8859-1"));
            String var51 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var30).intern();
            switch (var10001) {
               case 0:
                  var29[var27++] = var51;
                  if ((var36 += var25) >= var28) {
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var29;
                     lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new String[38];
                     lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new HashMap(13);
                     Cipher var11;
                     var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var12 = 1; var12 < 8; var12++) {
                        var10003[var12] = (byte)(var31 << var12 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var17 = new long[18];
                     int var14 = 0;
                     String var15 = "²G]¿\u0099,\u0098ÏÖ÷i\u0092»1\\Z\u009fÉóÂÁíöç¥®\u0013h\u00adJ%\u0015ßÑì}éÚ7\u0089¿\u0091í\u001d\u0098w\u0093¢Èù\u0017\u008eûl`.èÚLÀã\u0019®ÅªïÞhIP×óÀ)Z%\tlL>¼ÿØ¢\fÊ7\u001d×Ù\u001e±yCåÛ\u001bu6\u009cã/ª\u0019Õ,j\u0012\u009bÊÀMô\u0014¸\u0011~\u0090Ï\u001feÎ\u0010ª\u009a²\u0092î";
                     int var16 = "²G]¿\u0099,\u0098ÏÖ÷i\u0092»1\\Z\u009fÉóÂÁíöç¥®\u0013h\u00adJ%\u0015ßÑì}éÚ7\u0089¿\u0091í\u001d\u0098w\u0093¢Èù\u0017\u008eûl`.èÚLÀã\u0019®ÅªïÞhIP×óÀ)Z%\tlL>¼ÿØ¢\fÊ7\u001d×Ù\u001e±yCåÛ\u001bu6\u009cã/ª\u0019Õ,j\u0012\u009bÊÀMô\u0014¸\u0011~\u0090Ï\u001feÎ\u0010ª\u009a²\u0092î"
                        .length();
                     byte var13 = 0;

                     label54:
                     while (true) {
                        var10001 = var13;
                        var13 += 8;
                        byte[] var18 = var15.substring(var10001, var13).getBytes("ISO-8859-1");
                        long[] var40 = var17;
                        var10001 = var14++;
                        long var55 = (var18[0] & 255L) << 56
                           | (var18[1] & 255L) << 48
                           | (var18[2] & 255L) << 40
                           | (var18[3] & 255L) << 32
                           | (var18[4] & 255L) << 24
                           | (var18[5] & 255L) << 16
                           | (var18[6] & 255L) << 8
                           | var18[7] & 255L;
                        byte var59 = -1;

                        while (true) {
                           long var19 = var55;
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
                           long var63 = (var21[0] & 255L) << 56
                              | (var21[1] & 255L) << 48
                              | (var21[2] & 255L) << 40
                              | (var21[3] & 255L) << 32
                              | (var21[4] & 255L) << 24
                              | (var21[5] & 255L) << 16
                              | (var21[6] & 255L) << 8
                              | var21[7] & 255L;
                           switch (var59) {
                              case 0:
                                 var40[var10001] = var63;
                                 if (var13 >= var16) {
                                    IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var17;
                                    lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = new Integer[18];
                                    IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new HashMap(13);
                                    Cipher var0;
                                    var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                                    var10002 = SecretKeyFactory.getInstance("DES");
                                    var10003 = new byte[]{(byte)(var31 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                                    for (int var1 = 1; var1 < 8; var1++) {
                                       var10003[var1] = (byte)(var31 << var1 * 8 >>> 56);
                                    }

                                    var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                                    long[] var6 = new long[3];
                                    int var3 = 0;
                                    String var4 = "ãÖ\u007f\txÄ\u0005ùòEFáÓE\u0086cì¡!à\u0093v}e";
                                    int var5 = "ãÖ\u007f\txÄ\u0005ùòEFáÓE\u0086cì¡!à\u0093v}e".length();
                                    byte var2 = 0;

                                    do {
                                       int var48 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var48, var2).getBytes("ISO-8859-1");
                                       var48 = var3++;
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
                                       var63 = (var10[0] & 255L) << 56
                                          | (var10[1] & 255L) << 48
                                          | (var10[2] & 255L) << 40
                                          | (var10[3] & 255L) << 32
                                          | (var10[4] & 255L) << 24
                                          | (var10[5] & 255L) << 16
                                          | (var10[6] & 255L) << 8
                                          | var10[7] & 255L;
                                       byte var62 = -1;
                                       var6[var48] = var63;
                                    } while (var2 < var5);

                                    IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var6;
                                    IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new Long[3];
                                    lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                       null
                                    );
                                    IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new GemstoneESP();
                                    int[] var33 = new int[]{
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          14309, 4727330837377298079L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          17290, 2941147258225351418L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          26800, 2598947675876749763L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          32000, 1246471465072518270L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          25949, 2492817230840527914L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          26643, 3024246137794523500L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          25544, 7187420670835260068L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          13084, 5858507483582868065L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          17461, 994602846580628807L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          16736, 7056700595250026518L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          30906, 1050608440307605963L ^ var31
                                       ),
                                       IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"w">(
                                          23189, 3646381800659436526L ^ var31
                                       )
                                    };
                                    IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var33;
                                    return;
                                 }
                                 break;
                              default:
                                 var40[var10001] = var63;
                                 if (var13 < var16) {
                                    continue label54;
                                 }

                                 var15 = "\u0013ÀMQ>²\u0091\u00061\u0089\u001e\u00ad-(Ñz";
                                 var16 = "\u0013ÀMQ>²\u0091\u00061\u0089\u001e\u00ad-(Ñz".length();
                                 var13 = 0;
                           }

                           byte var47 = var13;
                           var13 += 8;
                           var18 = var15.substring(var47, var13).getBytes("ISO-8859-1");
                           var40 = var17;
                           var10001 = var14++;
                           var55 = (var18[0] & 255L) << 56
                              | (var18[1] & 255L) << 48
                              | (var18[2] & 255L) << 40
                              | (var18[3] & 255L) << 32
                              | (var18[4] & 255L) << 24
                              | (var18[5] & 255L) << 16
                              | (var18[6] & 255L) << 8
                              | var18[7] & 255L;
                           var59 = 0;
                        }
                     }
                  }

                  var25 = var26.charAt(var36);
                  break;
               default:
                  var29[var27++] = var51;
                  if ((var36 += var25) < var28) {
                     var25 = var26.charAt(var36);
                     continue label72;
                  }

                  var26 = "t\u008bÈ\u0090\u0013.\u001bÍ\u0017]6{\u009eYªìH7#iû\u0010Tvý_ý®3ÜÕ¶\u0010\u008d³^Ñ¢ÑÓL¸2ýV\u0002\u0084Ãã";
                  var28 = "t\u008bÈ\u0090\u0013.\u001bÍ\u0017]6{\u009eYªìH7#iû\u0010Tvý_ý®3ÜÕ¶\u0010\u008d³^Ñ¢ÑÓL¸2ýV\u0002\u0084Ãã".length();
                  var25 = ' ';
                  var36 = -1;
            }

            var37 = var26.substring(++var36, var36 + var25);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
      return var0;
   }

   private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28498;
      if (lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10
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
         byte[] var9 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI[var5].getBytes("ISO-8859-1");
         lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
            "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32487;
      if (lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var3] == null) {
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
         long var5 = IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI[var3];
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
         Object[] var9 = (Object[])lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var3] = var15;
      }

      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var3];
   }

   private static int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
            "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6657;
      if (IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var3] == null) {
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
         long var5 = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl[var3];
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
         Object[] var9 = (Object[])IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var14
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
         IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var3] = var15;
      }

      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var3];
   }

   private static long IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/features/visuals/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
