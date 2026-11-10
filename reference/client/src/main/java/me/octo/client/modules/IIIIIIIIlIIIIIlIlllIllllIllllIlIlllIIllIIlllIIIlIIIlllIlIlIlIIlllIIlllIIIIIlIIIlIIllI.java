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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.modules.helpers.general.Scheduler;
import me.octo.client.modules.impl.macros.IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl;
import me.octo.client.modules.impl.macros.IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.projectile.FishingHook;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   extends me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private int lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private float IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private float lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private BlockPos lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private BlockPos lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private int IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private boolean lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private boolean IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private Set<Integer> IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @Nullable
   private FishingHook lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   @NotNull
   private final IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @Nullable
   private IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   @NotNull
   private List<Integer> IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private static BooleanSetting IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @NotNull
   private static BooleanSetting lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private static long llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII = 21742868182528L;
   private static String[] IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll;
   private static String[] llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll;
   private static Map lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll = new HashMap(13);
   private static long[] lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
   private static Long[] IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
   private static Map IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;

   public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      @NotNull Setting... settingsArg
   ) {
      long var8 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ 17164956745144L;
      long var10 = var8 ^ 74493502277253L;
      long var12 = var8 ^ 88218304433434L;
      long var14 = var8 ^ 105138666242754L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, instructionsArg, tipsArg, true, Arrays.copyOf(settingsArg, settingsArg.length));
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = Random.Default.nextInt(5000, 15000);
      BlockPos var10001 = BlockPos.ZERO;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var10001;
      var10001 = BlockPos.ZERO;
      Intrinsics.checkNotNullExpressionValue(BlockPos.ZERO, "ZERO");
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var10001;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new LinkedHashSet<>();
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll();
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new ArrayList<>();
      me.octo.client.modules.helpers.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[] var16 = new me.octo.client.modules.helpers.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI[]{
         new me.octo.client.modules.helpers.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
            me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.AUTO_SELL,
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            true,
            null,
            8,
            null
         ),
         new me.octo.client.modules.helpers.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
            me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.SCHEDULER,
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI::IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll,
            false,
            null,
            8,
            null
         )
      };
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$fb732f7727dca272(var12, CollectionsKt.listOf(var16));
   }

   @NotNull
   @Override
   protected lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl llIlIlIIIlIIllIlllIIIllIlllllllIlIlIIllIlllllIIIllIIIIIIIIllIIIlIllIlllIIlIIlIIIllllI(
      long var1
   ) {
      return new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(true, true, true, false, true, null, 40, null);
   }

   @NotNull
   protected final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IllIlllllllllIlllIIllIIlIllIllllIlIIlIIllllIIllIlIIIlIlIlIlIlIllIIlIlIIlIIllIlIIIlIIl() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   @NotNull
   protected final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llllIlllIIIlIllIlIIIIIIlllIlIlIIIIIIIlllIlllIIllIlIIlIIlIIlIIllllIIllIIIlIlIlIlllllIl() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   @NotNull
   protected final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIIIlIlIlIlllIIlIIllIlIIlIIlIlllIllllIllIIlIIIlIIllIllllIlllIllIIIlIlllIIIIllIIIIlII() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   @Nullable
   public final me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIllllIllIlllIIlIIIIIllIIIIIllIIllIlIlllllllllllIlIlIlIIlIIIIIIlIlIIIlllIIlIIIlIl() {
      return this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @Nullable me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1
   ) {
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var1;
   }

   @NotNull
   protected final BlockPos IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl() {
      return this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }

   protected final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull BlockPos var3) {
      var1 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(4468, 2174323212749867382L ^ var1)
      );
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var3;
   }

   protected final boolean llllIlIlIlIlIllIlIlIIIlIlIIIllllIllIIIIIllllIIlIlIIlIlIIIllIIIIlIIIIIlIIlIllIIllIIIII() {
      return this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   protected final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(boolean var1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
   }

   protected final boolean lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI() {
      return this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   }

   protected final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(boolean var1) {
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var1;
   }

   @NotNull
   public final IIlllllllIlIlllIIIIllIllIlIIIIIlllIlIIlllllllllIIllIIIlIIlllIIIlIlIllIllllIIIIIllIlll IIIlIlIlIllIIIllIllIIlllIIIlIlllIlllIIIIIlllIIllIllIllIIIllIIIlIlIIIllIIlIllIlllIIIll() {
      return this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   }

   @Nullable
   public final IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl IllIIIIllIIlIllIIIIIlIllIIllIIIlIllIIlIlIIIIlIllIlIIlIIllIIlIIIllIlIIlIIlllllIIIIllII() {
      return this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IIIllIIlllIlIlllllllIlIllIIIlIllllIIIllllllIlllllIIlIlIIllIlIIIIlllIIllllIlllIlIIlIIl var1
   ) {
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var1;
   }

   @NotNull
   public final List<Integer> lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll() {
      return this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var1, char var2, @NotNull List var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(7747, 473475928762081699L ^ var5)
      );
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var3;
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 80955906475749L;
      long var10001 = var1 ^ 55039252612591L;
      int var7 = (int)((var1 ^ 55039252612591L) >>> 32);
      int var8 = (int)((var1 ^ 55039252612591L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var7, (char)var8, (char)var9);
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.clear();
      this.IIlIIIllIllllIIlIIlIIIIIIllIIllIIIIlIIllIlIllllIlIIIllIIIlllllllllIlIIIlIlIllIlIIlIlI(var5);
      super.IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(var3);
   }

   @Override
   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 105852393519731L;
      long var7 = var1 ^ 17623842614854L;
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var5);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var7, this, false, 1, null
      );
      BlockPos var10001 = BlockPos.ZERO;
      Intrinsics.checkNotNullExpressionValue(
         BlockPos.ZERO, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(29918, 7006725616454868588L ^ var1)
      );
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var10001;
      super.IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(var3);
   }

   @Override
   public void IIlIIIllIllllIIlIIlIIIIIIllIIllIIIIlIIllIlIllllIlIIIllIIIlllllllllIlIIIlIlIllIlIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1, boolean var3) {
      long var4 = var1 ^ 55028216010221L;
      long var6 = var1 ^ 0L;
      super.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var6, var3);
      this.lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(var4);
   }

   @Override
   public void IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(long var1) {
      int var3 = (int)((var1 ^ 120207500365948L) >>> 48);
      long var4 = (var1 ^ 120207500365948L) << 16 >>> 16;
      long var6 = var1 ^ 0L;

      try {
         super.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(var6);
         if (this.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll()
            == me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.FISH
            )
          {
            me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var3, var4);
         }
      } catch (UnsupportedOperationException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, -5552050936059127168L, var1
         );
      }
   }

   @Override
   public void IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(int var1, char var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 96625966926037L;
      long var8 = var4 ^ 108517470228596L;
      long var10001 = var4 ^ 0L;
      int var10 = (int)((var4 ^ 0L) >>> 32);
      int var11 = (int)((var4 ^ 0L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      super.IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(var10, (char)var11, var12);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.CAST,
         var8
      );
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var6);
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var6);
   }

   protected final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1, float var2) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var2;
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIlIIlllIIIIllIlIlIIllllIIlllIIllIllIlIlIlIllIlIIlIIllllIIlIlIllIllllllIlllIIIIlllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected void llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected void IIIlIIIllIllIIIlIlllIIlIIlIIIllllIlIlIIIIIIIllllllIIlIllIIlIIIlIIIIlllIIIlIlIIIllIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlllIllllIIIlllllIIIIIlIlIIIIlIlIllIlIllIIllIIllIIlIlIlIIlIIllIIllIIIlIIllllIIIlIlllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected final void lIllIllIlIlIIIllIllIIIIIIIIlIlIllIIllllllIlIlllIlIllIIllIIllllIIIIIIlIlIlIllIlIllllII(long var1) {
      var1 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var1;
      long var10001 = var1 ^ 63683581145316L;
      int var3 = (int)((var1 ^ 63683581145316L) >>> 32);
      int var4 = (int)((var1 ^ 63683581145316L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      float var6 = this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII + (float)Random.Default.nextDouble(-1.0, 1.0);
      me.octo.client.utils.player.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3,
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI + (float)Random.Default.nextDouble(-1.0, 1.0),
         var6,
         (short)var4,
         (short)var5
      );
   }

   private final List lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI(long var1) {
      var1 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var1;
      long var3 = (var1 ^ 76713274585126L) >>> 16;
      int var5 = (int)((var1 ^ 76713274585126L) << 48 >>> 48);
      boolean var6 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         903224022479081960L, var1
      );

      LocalPlayer var10000;
      try {
         var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().player;
         if (var10000 == null) {
            return CollectionsKt.emptyList();
         }
      } catch (UnsupportedOperationException var16) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var16, 972232204521874701L, var1
         );
      }

      LocalPlayer var7 = var10000;
      ClientLevel var19 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
      Intrinsics.checkNotNull(var19);
      List var8 = var19.getEntities(
         (Entity)var7,
         var7.getBoundingBox().inflate(30.0, 15.0, 30.0),
         IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      Intrinsics.checkNotNullExpressionValue(
         var8, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(10766, 1865891995827881294L ^ var1)
      );
      Iterable var18 = var8;
      boolean var9 = false;
      var var11 = new ArrayList();
      boolean var12 = false;

      for (Object var14 : var18) {
         label30: {
            try {
               if (var6) {
                  break label30;
               }

               if (!(var14 instanceof FishingHook)) {
                  continue;
               }
            } catch (UnsupportedOperationException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, 972232204521874701L, var1
               );
            }

            var11.add(var14);
         }

         if (var6) {
            break;
         }
      }

      return var11;
   }

   @Nullable
   protected final FishingHook lIIlIlIIllIlIIIIllIllIIllIIIIIIllllIIllIIIlIlIllIlIIIlIIlIlIIIlIllIIllllllllIIlIlllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity param1, int param2, char param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected final boolean lIIIIlIIIIIlIlIIIllIIIIlIllllIlIllIIlIIllIlIIllllIIIlIlllIIIIIIllIllllIlIlIIlIllllIIl(long var1) {
      var1 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var1;
      long var10001 = var1 ^ 2461588796669L;
      int var3 = (int)((var1 ^ 2461588796669L) >>> 32);
      int var4 = (int)((var1 ^ 2461588796669L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$00d73afb26a4f5d7(
         this, var3, var4, "?", null, 2, null, (char)var5
      );
   }

   protected final boolean IlIIllIllIIIlIIIllIIllllIllIIlIIIIlllIlllIlIlIIlllllIlllIIllIIIIlllIlIlIIIllIllIIlIlI(long var1) {
      var1 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var1;
      long var3 = var1 ^ 132631525506699L;
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, "!", IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(17716, 5807345067458073725L ^ var1)
      );
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3, String param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected void lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(long var1) {
      long var3 = var1 ^ 45743406621812L;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = 0.0F;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 0.0F;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = false;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = false;
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 0;
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = null;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.clear();
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
   }

   @Override
   public void IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(int param1, short param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param0, long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(long var0) {
      var0 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var0;
      long var2 = var0 ^ 2152466736528L;
      return Scheduler.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var2);
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param0, IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0, char var2, Entity var3) {
      long var4 = (var0 << 16 | (long)var2 << 48 >>> 48) ^ llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(7868, 5790479271322286036L ^ var4)
      );
      return var3 instanceof FishingHook;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, ArmorStand var2) {
      var0 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(19105, 8240870035811805844L ^ var0)
      );
      return true;
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII ^ 64305351104978L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[28];
      int var16 = 0;
      String var15 = "»ª\u0001`õù\u0091--©i\u0083/¡c\u0006\u0080\u009c\u0095Ón0P\u001eº\u0018¦ã\u0084N×´8^F×Ø\u0004ì¼8\u0092ÈêÄ\u0088\u000e$\nss²1\u008a\u00adª³:,xvèøà}\u008d\u0005Ä[\u0091P÷0òeÛ,ÇNÊWK)\u000eÒEí_«\u008cÚÎQk®ÈÖ¼M\u007f»\u0097e¡Ér\u0083EÚ\u009eh\b}\u0098kIë»4\u0016{[Ï\u001a\u009aG24^UÀð!³bôyî\u0090\u0011R\b×º\u008c\u0010¡¯N\u009d\u001c¶´úHúnì\u0004DÙ¼\u0010Fºi\u0081ÖJÞ\u0013¾9\u00828ùï\u0004\n(\u008b9²XÉ[õß%æ\fw¨¬\u0091Ktà°\u0091}\u000b\u0015Í¦à\u0083eíHì\u0097\u0081¾Ú§D\u008ci« eÝMcbêüc\u0013\u008câ\u0012q0\u00058\u00ad\u008cÌá\u0018\u0093\u008f¹¸\u009cY\u008eÀjÜ\u009f\u0010rÞfv¥åÕÜ,\u0084W`ñ¥¡-\u0010'oCã£ü±¢\u001b¥<îªut$\u0010\u0000\u009cf¸ù¨UÉ×Æç¬Ó\u0000æ\u001a8-¢\u0018\u0090ëk\u008a¯hÆñ\u001a\u008btÂ\u0093;ç|yµ\u0084\u0085\u008bCs K\u0000\u0080K\\\u009dE\u0085¥\réõâ\u001dø\u001f-âöR\u0090\"Á2ÆX(þ\u0098\u0010ÌÛ\u008fM\u009d Ó\u001bÏo4ò(\u008bJ;0{0\u008cï¤\u009fH\u008acòR\u009d4Þ3\u001e7k\u0015Pðm7\u0096sÜ<²ìÀ\u000fý@¶²h¡<òÉm-[ºQ¾Ã·\u0010J4+õ\u009fè\f??5\u0098éô£¦º\u0018 ý>M¸(2Ó\u0016\u009e'q\u0018£ûAý áo}5=\u0002\u0018\u000eæF÷3C7a\u0015ås_´¨súùÙÀ½?¼\u00150 \u0000tÊ\u0088sÿ^ÆhI+\u0089Á\u000eþ²è\u0091NPÆÅjðs7vði&äý\u0010\u0000ÆQüÆâ\u001b|\u009aqÜ>ñ(-¡ zÜ^\u0000 ×\u0011®\u001aÌ\u0086\u007f%\fxí?úA\u0093I\u001c¬u\fp·³{¼\u0086\u001c \u00ad\u001a\"¹\u0001»ð\u0093ç¨¼ÐL8\u0089îïàE:n\u0093x·¨fÀ\u0001\u00adÄ¹W Ê\u0081 \u009et\\ÕOÏ6\u007fz¡\u0006$\u0007-\r\u001fþ$p«áÓ\u007f.ëá¨\u0017Î\u0010¸ÎÁl\u0014ë|XF\u000fM\u0012à\u000e,\u0006\u0018n\u0093' úkEëCª\u009f\u0086\u000bõ\u009f'Hrí\u0005\u001c«\u0093ðhZho\u001f\u0085¸U\u0003ÿÿû\u0019Ì\u0012´9«óÃHóç¸§zêDÔ1<;o'Ä ¿Fz1ºÇ\u0014Ûh\u0007Ç7\u0097\u0091ãL\u0000\b n\u0081F~\u0096ý\u0018DCé\u0013]°tO©\u009d-\u0013?Ø£åÇ\u000b\u009fJûù9\u0097(}\u008f\u0019BsaüÑ\u0011¤øs\u0001SòaY\u00ad(ú\u0003QÉ\u001eKý\u0092ü\u008c«B,9ÿÐÏ¥øe\u001ai\"Ìá\u0095´\u001b\u0094+\u0095°K«Ð²û\u0096òê ·Þá!}÷_\u008aê'\u0016\\R`©Sèóæ¬\u0087þ:¬«Ì3\rHç*\u009c\u0010÷èSs\u0097w\u009e\u008a¨ø\f²I¦ªE";
      int var17 = "»ª\u0001`õù\u0091--©i\u0083/¡c\u0006\u0080\u009c\u0095Ón0P\u001eº\u0018¦ã\u0084N×´8^F×Ø\u0004ì¼8\u0092ÈêÄ\u0088\u000e$\nss²1\u008a\u00adª³:,xvèøà}\u008d\u0005Ä[\u0091P÷0òeÛ,ÇNÊWK)\u000eÒEí_«\u008cÚÎQk®ÈÖ¼M\u007f»\u0097e¡Ér\u0083EÚ\u009eh\b}\u0098kIë»4\u0016{[Ï\u001a\u009aG24^UÀð!³bôyî\u0090\u0011R\b×º\u008c\u0010¡¯N\u009d\u001c¶´úHúnì\u0004DÙ¼\u0010Fºi\u0081ÖJÞ\u0013¾9\u00828ùï\u0004\n(\u008b9²XÉ[õß%æ\fw¨¬\u0091Ktà°\u0091}\u000b\u0015Í¦à\u0083eíHì\u0097\u0081¾Ú§D\u008ci« eÝMcbêüc\u0013\u008câ\u0012q0\u00058\u00ad\u008cÌá\u0018\u0093\u008f¹¸\u009cY\u008eÀjÜ\u009f\u0010rÞfv¥åÕÜ,\u0084W`ñ¥¡-\u0010'oCã£ü±¢\u001b¥<îªut$\u0010\u0000\u009cf¸ù¨UÉ×Æç¬Ó\u0000æ\u001a8-¢\u0018\u0090ëk\u008a¯hÆñ\u001a\u008btÂ\u0093;ç|yµ\u0084\u0085\u008bCs K\u0000\u0080K\\\u009dE\u0085¥\réõâ\u001dø\u001f-âöR\u0090\"Á2ÆX(þ\u0098\u0010ÌÛ\u008fM\u009d Ó\u001bÏo4ò(\u008bJ;0{0\u008cï¤\u009fH\u008acòR\u009d4Þ3\u001e7k\u0015Pðm7\u0096sÜ<²ìÀ\u000fý@¶²h¡<òÉm-[ºQ¾Ã·\u0010J4+õ\u009fè\f??5\u0098éô£¦º\u0018 ý>M¸(2Ó\u0016\u009e'q\u0018£ûAý áo}5=\u0002\u0018\u000eæF÷3C7a\u0015ås_´¨súùÙÀ½?¼\u00150 \u0000tÊ\u0088sÿ^ÆhI+\u0089Á\u000eþ²è\u0091NPÆÅjðs7vði&äý\u0010\u0000ÆQüÆâ\u001b|\u009aqÜ>ñ(-¡ zÜ^\u0000 ×\u0011®\u001aÌ\u0086\u007f%\fxí?úA\u0093I\u001c¬u\fp·³{¼\u0086\u001c \u00ad\u001a\"¹\u0001»ð\u0093ç¨¼ÐL8\u0089îïàE:n\u0093x·¨fÀ\u0001\u00adÄ¹W Ê\u0081 \u009et\\ÕOÏ6\u007fz¡\u0006$\u0007-\r\u001fþ$p«áÓ\u007f.ëá¨\u0017Î\u0010¸ÎÁl\u0014ë|XF\u000fM\u0012à\u000e,\u0006\u0018n\u0093' úkEëCª\u009f\u0086\u000bõ\u009f'Hrí\u0005\u001c«\u0093ðhZho\u001f\u0085¸U\u0003ÿÿû\u0019Ì\u0012´9«óÃHóç¸§zêDÔ1<;o'Ä ¿Fz1ºÇ\u0014Ûh\u0007Ç7\u0097\u0091ãL\u0000\b n\u0081F~\u0096ý\u0018DCé\u0013]°tO©\u009d-\u0013?Ø£åÇ\u000b\u009fJûù9\u0097(}\u008f\u0019BsaüÑ\u0011¤øs\u0001SòaY\u00ad(ú\u0003QÉ\u001eKý\u0092ü\u008c«B,9ÿÐÏ¥øe\u001ai\"Ìá\u0095´\u001b\u0094+\u0095°K«Ð²û\u0096òê ·Þá!}÷_\u008aê'\u0016\\R`©Sèóæ¬\u0087þ:¬«Ì3\rHç*\u009c\u0010÷èSs\u0097w\u009e\u008a¨ø\f²I¦ªE"
         .length();
      char var14 = '\u0010';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var35 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var19).intern();
         byte var10001 = -1;
         var18[var16++] = var35;
         if ((var13 += var14) >= var17) {
            var15 = "ti¤G0Û\u0089ÎP±5B7¾ÀÑ¨_7\u009e5Fk\u0082\u0011Oü|°ÁMY0¦² nß;5á'×»!l÷\u0086vÙ²Ø5\u007f\u0002PX&\u0089.ïÊj\u0091¼~çT\u000bÔ\u0016dkn7Áò\u009d¤ÀÁ\u009a&\u001elU\u0085DT\u00054\u0006E\u0001\u0093\u0084ìD£+\u0091S\u0093oä\u0001Ô|\u0007(A\f\u0095×\u000f±¾¶\u0084Àóe´q^\u0000Ä\\¾¦w\u0098Wµ2\u008aIxä¡8½Å§\u008c´Bò!@zþ\rhÆ\u00963tª\u008f \u008b@\u0003u\u0083!=\u0097úm\u0012\u009d\u0019x|\u008ftÎ§Å£]\u00adt·24B¶5,5";
            var17 = "ti¤G0Û\u0089ÎP±5B7¾ÀÑ¨_7\u009e5Fk\u0082\u0011Oü|°ÁMY0¦² nß;5á'×»!l÷\u0086vÙ²Ø5\u007f\u0002PX&\u0089.ïÊj\u0091¼~çT\u000bÔ\u0016dkn7Áò\u009d¤ÀÁ\u009a&\u001elU\u0085DT\u00054\u0006E\u0001\u0093\u0084ìD£+\u0091S\u0093oä\u0001Ô|\u0007(A\f\u0095×\u000f±¾¶\u0084Àóe´q^\u0000Ä\\¾¦w\u0098Wµ2\u008aIxä¡8½Å§\u008c´Bò!@zþ\rhÆ\u00963tª\u008f \u008b@\u0003u\u0083!=\u0097úm\u0012\u009d\u0019x|\u008ftÎ§Å£]\u00adt·24B¶5,5"
               .length();
            var14 = ' ';
            var13 = -1;

            while (true) {
               var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
               String var37 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var19).intern();
               int var31 = 0;
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = var18;
                  llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll = new String[28];
                  IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "aÞ\u0085HS\u0086Ò³\u008a£Ô^ã\u007fòs2øÁ\u0015\u000e\u000bQ>";
                  int var5 = "aÞ\u0085HS\u0086Ò³\u008a£Ô^ã\u007fòs2øÁ\u0015\u000e\u000bQ>".length();
                  byte var2 = 0;

                  do {
                     var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     var31 = var3++;
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
                     long var10004 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var41 = -1;
                     var6[var31] = var10004;
                  } while (var2 < var5);

                  lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl = var6;
                  IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI = new Long[3];
                  lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     null
                  );
                  lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     "Desync Time", "How much time to wait before recasting if nothing is caught.", 10, 30, 20, 1
                  );
                  IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new BooleanSetting(
                     "Anti-AFK", "Perform Anti-AFK actions, by default enables rotations to avoid skill XP loss et al.", true
                  );
                  lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                     private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 69305696256813L;
                     private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                     {
                        long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 108802040747605L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2x) {
                        return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
                           .isToggled();
                     }

                     static {
                        long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 112294890420362L;
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
                        String var6 = "ñ´\u0084îÏØÒú÷\u009e\u00ad±\u009c\fÚ´·Uk\rÎÉ\u0006\u0086 ï¬æ\u0080&ä\u00878³\u0016 \u0082½\u0006×\u000bÝ2í\u009eø\u0085hÜn ?¶\u009eD=Þá.þÃ§ú\u0093Wnv/NDéç\u001cÐ$\u0004¿\u0080eÀ+Ú5³\u0000&²\u007fq";
                        int var8 = "ñ´\u0084îÏØÒú÷\u009e\u00ad±\u009c\fÚ´·Uk\rÎÉ\u0006\u0086 ï¬æ\u0080&ä\u00878³\u0016 \u0082½\u0006×\u000bÝ2í\u009eø\u0085hÜn ?¶\u009eD=Þá.þÃ§ú\u0093Wnv/NDéç\u001cÐ$\u0004¿\u0080eÀ+Ú5³\u0000&²\u007fq"
                           .length();
                        char var5 = ' ';
                        int var4 = -1;

                        while (true) {
                           byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                           String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                           byte var10001 = -1;
                           var9[var7++] = var13;
                           if ((var4 += var5) >= var8) {
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                              return;
                           }

                           var5 = var6.charAt(var4);
                        }
                     }

                     private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                        int var1 = 0;
                        int var2x;
                        char[] var3x = new char[var2x = var0x.length];

                        for (int var4x = 0; var4x < var2x; var4x++) {
                           int var5x;
                           if ((var5x = 255 & var0x[var4x]) < 192) {
                              var3x[var1++] = (char)var5x;
                           } else if (var5x < 224) {
                              char var6x = (char)((char)(var5x & 31) << 6);
                              byte var8 = var0x[++var4x];
                              var6x = (char)(var6x | (char)(var8 & 63));
                              var3x[var1++] = var6x;
                           } else if (var4x < var2x - 2) {
                              char var12 = (char)((char)(var5x & 15) << '\f');
                              byte var9 = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9 & 63) << 6);
                              var9 = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9 & 63));
                              var3x[var1++] = var12;
                           }
                        }

                        return new String(var3x, 0, var1);
                     }

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1) {
                        int var5x = var0x ^ (int)(var1 & 32767L) ^ 24710;
                        if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                           Object[] var4x;
                           try {
                              Long var3x = Thread.currentThread().threadId();
                              var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3x);
                              if (var4x == null) {
                                 var4x = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3x, var4x);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                 var10
                              );
                           }

                           byte[] var6x = new byte[8];
                           var6x[0] = (byte)(var1 >>> 56);

                           for (int var7 = 1; var7 < 8; var7++) {
                              var6x[var7] = (byte)(var1 << var7 * 8 >>> 56);
                           }

                           DESKeySpec var11x = new DESKeySpec(var6x);
                           SecretKey var8 = ((SecretKeyFactory)var4x[1]).generateSecret(var11x);
                           ((Cipher)var4x[0]).init(2, var8, (IvParameterSpec)var4x[2]);
                           byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9)
                           );
                        }

                        return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, MutableCallSite var1, String var2x, Object[] var3x
                     ) {
                        int var4x = (Integer)var3x[0];
                        long var5x = (Long)var3x[1];
                        String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                        MethodHandle var8 = MethodHandles.constant(String.class, var7);
                        var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                        return var7;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, String var1, MethodType var2x
                     ) {
                        MutableCallSite var3x = new MutableCallSite(var2x);

                        try {
                           var3x.setTarget(
                              MethodHandles.explicitCastArguments(
                                 MethodHandles.insertArguments(
                                    "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                       .asCollector(Object[].class, var2x.parameterCount()),
                                    0,
                                    var0x,
                                    var3x,
                                    var1
                                 ),
                                 var2x
                              )
                           );
                           return var3x;
                        } catch (Exception var5x) {
                           throw new RuntimeException(
                              "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                 + " : "
                                 + var1
                                 + " : "
                                 + var2x.toString(),
                              var5x
                           );
                        }
                     }
                  };
                  lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = new BooleanSetting() {
                     private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 74693016022892L;
                     private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                     private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                     {
                        long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 72081241975349L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                        return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
                           .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
                           .isToggled();
                     }

                     static {
                        long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 122622383848389L;
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
                        String var6 = "\u0095A|À\nàF³£\u0091\u0085\u008a\u0082Ybê\u001bíPa\u0019¢\u001a\u0095|7xãZIè\u0089¤Ø\u000fÌÆy1\u0086@eÏºmp,\u001fÒ)Àó\u001céñ\u0013sÛÃæw9ô\t\u0013²øP¶e\u0010u3Ã\f¥\u001aE\u0086\u0013m·\u0005$þ\u001f\u009b\n%M\"Ø\u000es]Èë\u0097\rÏØ\n\u000b\u0006k";
                        int var8 = "\u0095A|À\nàF³£\u0091\u0085\u008a\u0082Ybê\u001bíPa\u0019¢\u001a\u0095|7xãZIè\u0089¤Ø\u000fÌÆy1\u0086@eÏºmp,\u001fÒ)Àó\u001céñ\u0013sÛÃæw9ô\t\u0013²øP¶e\u0010u3Ã\f¥\u001aE\u0086\u0013m·\u0005$þ\u001f\u009b\n%M\"Ø\u000es]Èë\u0097\rÏØ\n\u000b\u0006k"
                           .length();
                        char var5 = '(';
                        int var4 = -1;

                        while (true) {
                           byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                           String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                           byte var10001 = -1;
                           var9[var7++] = var13;
                           if ((var4 += var5) >= var8) {
                              IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[2];
                              return;
                           }

                           var5 = var6.charAt(var4);
                        }
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

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                        int var5 = var0 ^ (int)(var1 & 32767L) ^ 27351;
                        if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                           Object[] var4;
                           try {
                              Long var3 = Thread.currentThread().threadId();
                              var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                              if (var4 == null) {
                                 var4 = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                           llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4[0]).doFinal(var9)
                           );
                        }

                        return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0, MutableCallSite var1, String var2, Object[] var3
                     ) {
                        int var4 = (Integer)var3[0];
                        long var5 = (Long)var3[1];
                        String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                        MethodHandle var8 = MethodHandles.constant(String.class, var7);
                        var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                        return var7;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0, String var1, MethodType var2
                     ) {
                        MutableCallSite var3 = new MutableCallSite(var2);

                        try {
                           var3.setTarget(
                              MethodHandles.explicitCastArguments(
                                 MethodHandles.insertArguments(
                                    "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                       .asCollector(Object[].class, var2.parameterCount()),
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
                              "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                 + " : "
                                 + var1
                                 + " : "
                                 + var2.toString(),
                              var5
                           );
                        }
                     }
                  };
                  return;
               }

               var14 = var15.charAt(var13);
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   private static UnsupportedOperationException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      UnsupportedOperationException var0
   ) {
      return var0;
   }

   private static String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24649;
      if (llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll[var5].getBytes("ISO-8859-1");
         llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll[var5] = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll[var5];
   }

   private static Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
            "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7067;
      if (IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI[var3] == null) {
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
         long var5 = lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl[var3];
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
         Object[] var9 = (Object[])IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI[var3] = var15;
      }

      return IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI[var3];
   }

   private static long IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   static boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$00d73afb26a4f5d7(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0,
      int var1,
      int var2,
      String var3,
      String var4,
      int var5,
      Object var6,
      char var7
   ) {
      byte var15 = 2;
      long var8 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var7 << 48 >>> 48)
         ^ llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
      long var10 = var8 ^ 113921023337862L;
      boolean var12 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7501507850413491524L, var8
      );

      try {
         if (var6 != null) {
            throw new UnsupportedOperationException(
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"f">(15694, 5742062930458457885L ^ var8)
            );
         }
      } catch (UnsupportedOperationException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, 7521099670270558227L, var8
         );
      }

      try {
         if (!var12) {
            return (boolean)var15;
         }

         if ((var15 & 2) == 0) {
            return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var3, var4);
         }
      } catch (UnsupportedOperationException var14) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var14, 7521099670270558227L, var8
         );
      }

      var4 = "";
      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var3, var4);
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
      }

      @NotNull
      public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
      }

      @NotNull
      public final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
      }
   }
}
