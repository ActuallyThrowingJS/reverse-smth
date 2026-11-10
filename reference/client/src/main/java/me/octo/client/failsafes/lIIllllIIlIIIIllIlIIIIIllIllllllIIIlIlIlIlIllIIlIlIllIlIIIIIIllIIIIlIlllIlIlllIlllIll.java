package me.octo.client.failsafes;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.features.misc.Replay;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll extends BooleanModule {
   @NotNull
   public static lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final ArrayList<IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 56649400659567L;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;

   private lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll() {
      long var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 35357034515151L;
      ModuleCategory var10003 = ModuleCategory.FAILSAFES;
      Setting[] var3 = new Setting[]{
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
      };
      super("Failsafes", "Enables a bunch of failsafes.", var10003, "Failsafes", true, var3);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 79373492781706L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var3);
      this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(var5);
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = var4 ^ 122121982887817L;
      long var8 = (var4 ^ 0L) >>> 8;
      int var10 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var8, (byte)var10);
      this.lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(var6);
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.game.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(long var1) {
      var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var1;
      long var3 = var1 ^ 21088812974012L;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var7 = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[11];
      var7[0] = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(3872, 2026097005523401232L ^ var1)
      );
      var7[1] = new llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(27009, 1437247640255798411L ^ var1)
      );
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5926527281612890108L, var1
      );
      var7[2] = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(25940, 9188404082738794584L ^ var1)
      );
      var7[3] = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(20782, 9162838403802407963L ^ var1)
      );
      var7[4] = new IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(12903, 2422896888227972928L ^ var1)
      );
      var7[5] = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(6080, 5331658520832139974L ^ var1)
      );
      var7[6] = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(11133, 4527260101857631813L ^ var1)
      );
      var7[7] = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(26745, 7333595234618121596L ^ var1)
      );
      var7[8] = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(24767, 6677072075835643277L ^ var1)
      );
      var7[9] = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(22674, 8756001429442014618L ^ var1)
      );
      var7[10] = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(29652, 8748007366714525411L ^ var1)
      );
      List var6 = CollectionsKt.listOf(var7);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      String[] var5 = var10000;
      Iterator var11 = var6.iterator();

      while (true) {
         if (var11.hasNext()) {
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var8 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var11.next();

            try {
               PolinexAccessor.INSTANCE.eventBus.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var3);
               this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.add(var8);
               if (var5 == null) {
                  break;
               }

               var8.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(false);
               if (var5 != null) {
                  continue;
               }
            } catch (MatchException var9) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var9, -5938624094673121030L, var1
               );
            }
         }

         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
         break;
      }
   }

   private final void lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(long var1) {
      var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var1;
      long var10001 = var1 ^ 97563869519646L;
      int var3 = (int)((var1 ^ 97563869519646L) >>> 48);
      int var4 = (int)((var1 ^ 97563869519646L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7900274443130806376L, var1
      );
      Iterator var12 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.iterator();
      Intrinsics.checkNotNullExpressionValue(
         var12, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(23056, 4224671868037501110L ^ var1)
      );
      Iterator var7 = var12;
      String[] var6 = var10000;

      while (true) {
         if (var7.hasNext()) {
            var10000 = (String[])var7.next();
            Intrinsics.checkNotNullExpressionValue(
               var10000, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(8758, 3049929268434200708L ^ var1)
            );
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var8 = (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll)var10000;

            try {
               PolinexAccessor.INSTANCE
                  .eventBus
                  .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8, (short)var3, (short)var4, var5);
               if (var6 == null) {
                  break;
               }

               if (var6 != null) {
                  continue;
               }
            } catch (MatchException var9) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var9, -7923542242638893210L, var1
               );
            }
         }

         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
         break;
      }
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      @NotNull String param1, byte param2, int param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      long var6 = var4 ^ 83087046939433L;
      long var8 = var4 ^ 87122250600268L;
      me.octo.client.gui.clickgui.modules.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var10 = me.octo.client.modules.manager.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var8,
            me.octo.client.modules.manager.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.FAILSAFE
         );

      try {
         if (var10 != null) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(17400, 1218950879304687099L ^ var4), var6
            );
         }
      } catch (MatchException var11) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var11, -8740144280088544293L, var4
         );
      }
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, String var1, long var2) {
      var2 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var2;
      long var4 = var2 ^ 112856940653307L;
      Replay.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var0,
            true,
            var4,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(21968, 7328989735426896571L ^ var2) + var1
         );
      return Unit.INSTANCE;
   }

   static {
      long var5 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 69857697939323L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[46];
      int var12 = 0;
      String var11 = "»fïà&g\f\u0002L\u0098,\u0080s×¯´¹\u0007DÿH¨>ç¥0\u0099 \u008cQP5z¨\u009bE5Ý\u0003÷\u0093;÷¤¼vqºó\u0002ïR\u0011o\u0088\u00998®\u000fÉ\u0000ëpF#¤ü\u0091RG\u00adjâA^à\u0081:ÄX\u0003\u009f\u0087a®d\u0085¾ÄW)ÂA;Pày^Îêõy) ÝN\u00829j\u0006oÆ¨ ¾Ö}g\u0012\u0018\u0085¯ºÜ7ÃA!,\u0088-¿ð\u0085Ï\u0006\u001e\u001eÞQ;c<H\u0095ê\u0018±ô(¥ê×\u0099\u0099sGÔ\u0093Ö¼y\u0092ÚwM«ïÏ8\u00198b?\u0015ûÆyd>\u000eHÐ¡!\u009e[Z¹\u0013È{S\u0083\u0097\t/\u008eê{µf3\u000bv2\u000bwUë\u001cÞävjrä4\u0016\u0006x\rH\u001a\u000fQ\u009bý(½.æ\u001f\u001f\u0012²\u0004W\u000f\u0017<\u000b¬×ùF_\u0003`¿¼\u009f¢gÁw¯\u0085\u001e¿i\u0016\u00834kÖõG0\u0018\u0018¼ÐFë\u0005{IådÄóû\u0005\u0097\u008f©\n×\u001by!ÈÝ \u00adI\u001d\u001a\u0093EÅ²ßt\u000e³ë\u0085Nâjq\t\u0010l¼Æò\\C7Ôµÿ$Ì G\u0014kº®÷ÒV\tó¯,\"æ\u0011pv#>8\u0006Ý\u0091\u0080¼6H*©¿\u0085\u0095\u0010ª\u0083\u009e\u0094w\u009a2O4¯û\u0012\n 'ß(ë\u0012Ü{eÞu«\u009be¢@ñ»ü8¥Ö\u008c`Pg\u0080äô?w_\u00adpÿ_\u0010?å!\u008c%\u0085\tH\u0010\u0018½i\u0088\u0000Ú\u008d8òð8sº¡qáK\u0097u'\u0019k<\u008af\u0097\u0001!au&ÃÚ\u00068ÆM\u009aÐÁ¿ákæ´ìVzX©ûê\u001bÙ=\u0003\u0092\u0002\u0007Ë\u009dÿJÕ\u009cIF*\u000e\u0095Ï(òùùVPø\u0083nÛY¯\u0091\tÄ\u008eµc\u0019)\u0005ê\u0013ãµï=¾{\u0099ÂR /_UÞÌmÊn\u0018Ôm:¸{ïò\u0001\u008aÅá\u001fûÀ\u008b+:eÑ§\u0090©§\u0014\u0010\rïF&½zë>N4¶È\u0097YñÌ(vt§ú|¶OV-Æ.¿S\u00ado\u0089ä\tC\u009dwI°$¿×ò\u0013l\u0083\u008c¤âtÓÓî¯\u00835\u0010\u001b\u0013¥ÂÁé\u0098è&ª\u0084¤\u0013\u0089\u009eÉ ãTöH²e\u008b\u009dË7Ã¼ÛýCQà®\f\u0013*\\^ï²øÝ\u0002#l\u008a%PueÏÛË\b\u00004ùíEêu\u0085ÅB6ý\u0080öùö\u001b\u008c#ep|\tÇÒ\u000bÿôR\u0081\u0095w\u001dÁÍÙ\u0011¦\u0091}\u0019L\u0083~\u001d«Fz\u0099Î_@õ¡ÆG\u008a\u0017GqùÐ¦ë¼\u0080x\u008f@NIÈó¥HsØÿ~\u0000üÙ\u0097S!`º/'\u008fÜÓ\u008bf#`TÓy\u009fÁ\u009d\u0082mÁü\\?>í\u008e\u0091ö\t)\u009a,+@VÔÐ£õ\u0007*_\u008c\u008et;ÿñ\u0094\u0088Æp\u008bÏ=¶0¦É>\u0092Æ ºÎe\r\u0018\u0002®\u000b\u008f=ìJ+Å´@ÄDÆ\u0011LØ\u0012,zf\u008b¢èôØ\u0089(IGLüñ\u001e)ñ\nnO}®Õ\u00923\u0000î÷\u00ad\u0083\u0096O\u009f^kåï¸\u0010¥r#ú\nGÛ'a\u00ad\u0018Ìò·¥\u0089\u000b1\u0080òiT\u008ahæüX`Õ_H¶\u00167d Ç\u008a¸ý=\fÂ4\u008cÑ:eH*\u008d\u000fmôÛ5ÛA\u0084¡\\nv«ø©æÝ(4\u0014.\u0016\u0012\u009e\u0083=\u0095\u0085ì\u0013\u0082fª9<n\u00826 `ý\u0017+PR\u0084VÇª}V\f\u0084\no»\u0004\n(F×Æ¸\u0003ÈÆ\u0000úÍ\u0006\u0010_Ë`Äq-Ð\u0089A4ÞÓ5\u0092©ñW¢¦\u0015²\u00119_\u008a¼\u0084\u001a ´jýJåÆ\u009b\u0099üD\u0018:¦\u008fçQ\u0081{x\u0017¡ô\u000b+ÓI\u001fC\u0012¸BÏ(\nxÃ/¾þ\u0084\f\\í§:O\u0090 B\u0082\u009eT\u0091Ô}r\u0098?í\u008a\u000f\u0092fÝNWéò\u001bÓeS\u0013(<f \u009d¦Ò\u0080ç\u0014ýªH@x%þ\"\u0005\rw\u007f(UZ\u0019¨Æè\u0086-a\u0019ï<´\u008d\u007f÷\u0012\u00970}\u0010.Ë\u00963½«\u00866÷ork]vM°$Vù¹X¢§o«Ip¸#DYCò[\u0098ûºÊpGH\u0097\u0093O×\u00018S¸=Â\u009dúé&»Ð²=`¾\u0015\u009d>\u0086w\u0003Û=Ê\u0003±®kÜ\bJÕ_X\u0090\u0004øÛôç<UÖìh¿xK\u0002Vå2ÚÒcv¾(Ñýl\u0084\u008cao0àk\"0\u00ad(¢k8ëjh8hË4-bõn´:Qi\u0084úf4KÖ\u0082ù0#Î\u0091Ê\u0017ÿ\u0091ÁÜõ\u0011\u0088\u008dàâ;jÑé\u0016Ý´m\u0088\u0089\u0091æúÇ®\u0011Ë\u0081oÚÀÈ eÃ\u0005ÙÙ\u009e'\u0093ú\u001c(Ä{_\u0090êÈ\\8\u008a\u00165P$YaÄ\u0096\u0004\u001d,\\c@oêû\n[\u0011¹×Ð5\u009cs\u0018'r±c8S\u008fè´e?\u0016ØA»òfKh\u008c#ÊÁ)?\f\u0001ø 1¾me¿|q\u009a8\u0012&Æð\u009c¢\n'\u00ad®àZL'gC:ñ}ë²£æ0\u00adg4µ\b\u0019}¼\u009b5âC\u008e,\u0091$Ø6ÖÛ´ã\u0006\u008cËBë\u0016;\u001bý \u0090ÓñWµ®ã\u008em\u0094\u0080ê§\u009b·ë\u0018\u0090Ú\"\u00164EÚYH°ØK-\u0013DTùÒDõÞÂ+à(G\u0017\u001eÅ\u008eË\u0092\u0018¾D\u008c³o\u0095ª\u0086\u0086lò·\u0000Qu\u001aMÇk\t\u0000¥!ÕWè$ûV\u0004!\u009a\u00104í¶D5ªUá'=-HèÌÖt(ÿ\u000b\u0080}\u0016\u0092°ý\u008d\nI\u0005\u0007È\u0010ñ \u0016HÏüÕ\u008d\u00077a/ä½2I\u0005çí^6+\u0018ñP(ºöï)N¾F\u000e\u001d¸î\u0001êJ\u0015ûAæ\\bá\u008aïï\u0085`Ì\u000e\u0001E`®\u0002>\u008b\u00961û\u0096\u0094(\u0086\u0099Eü\u0087;\u0016Ä¬»o96\u0098ÝªlÒúóýn²\u0017å\u0097#Ê¨</xm\u0017Ô\u009e5YFÉ@zÔN\u0082àçL ØmU®\\ñ7®Çö\u0000¼¡\u0088 )p õ\u0001Õ§\u007fñjVU7\u0004@\u0099Á\u009a$\u0006T0\u00adÄ\u001f¾²ðpcR>\u0088B\u007fß\u0006eä»×(Z\u00ad¼\u0098ko\u008f,~\u0095½¢rÄÍ\u00071}ê\u0095\u009cÂ\n\u000b\u0092s\r¹\u009fÁl/\u0097«üù`\ftå";
      int var13 = "»fïà&g\f\u0002L\u0098,\u0080s×¯´¹\u0007DÿH¨>ç¥0\u0099 \u008cQP5z¨\u009bE5Ý\u0003÷\u0093;÷¤¼vqºó\u0002ïR\u0011o\u0088\u00998®\u000fÉ\u0000ëpF#¤ü\u0091RG\u00adjâA^à\u0081:ÄX\u0003\u009f\u0087a®d\u0085¾ÄW)ÂA;Pày^Îêõy) ÝN\u00829j\u0006oÆ¨ ¾Ö}g\u0012\u0018\u0085¯ºÜ7ÃA!,\u0088-¿ð\u0085Ï\u0006\u001e\u001eÞQ;c<H\u0095ê\u0018±ô(¥ê×\u0099\u0099sGÔ\u0093Ö¼y\u0092ÚwM«ïÏ8\u00198b?\u0015ûÆyd>\u000eHÐ¡!\u009e[Z¹\u0013È{S\u0083\u0097\t/\u008eê{µf3\u000bv2\u000bwUë\u001cÞävjrä4\u0016\u0006x\rH\u001a\u000fQ\u009bý(½.æ\u001f\u001f\u0012²\u0004W\u000f\u0017<\u000b¬×ùF_\u0003`¿¼\u009f¢gÁw¯\u0085\u001e¿i\u0016\u00834kÖõG0\u0018\u0018¼ÐFë\u0005{IådÄóû\u0005\u0097\u008f©\n×\u001by!ÈÝ \u00adI\u001d\u001a\u0093EÅ²ßt\u000e³ë\u0085Nâjq\t\u0010l¼Æò\\C7Ôµÿ$Ì G\u0014kº®÷ÒV\tó¯,\"æ\u0011pv#>8\u0006Ý\u0091\u0080¼6H*©¿\u0085\u0095\u0010ª\u0083\u009e\u0094w\u009a2O4¯û\u0012\n 'ß(ë\u0012Ü{eÞu«\u009be¢@ñ»ü8¥Ö\u008c`Pg\u0080äô?w_\u00adpÿ_\u0010?å!\u008c%\u0085\tH\u0010\u0018½i\u0088\u0000Ú\u008d8òð8sº¡qáK\u0097u'\u0019k<\u008af\u0097\u0001!au&ÃÚ\u00068ÆM\u009aÐÁ¿ákæ´ìVzX©ûê\u001bÙ=\u0003\u0092\u0002\u0007Ë\u009dÿJÕ\u009cIF*\u000e\u0095Ï(òùùVPø\u0083nÛY¯\u0091\tÄ\u008eµc\u0019)\u0005ê\u0013ãµï=¾{\u0099ÂR /_UÞÌmÊn\u0018Ôm:¸{ïò\u0001\u008aÅá\u001fûÀ\u008b+:eÑ§\u0090©§\u0014\u0010\rïF&½zë>N4¶È\u0097YñÌ(vt§ú|¶OV-Æ.¿S\u00ado\u0089ä\tC\u009dwI°$¿×ò\u0013l\u0083\u008c¤âtÓÓî¯\u00835\u0010\u001b\u0013¥ÂÁé\u0098è&ª\u0084¤\u0013\u0089\u009eÉ ãTöH²e\u008b\u009dË7Ã¼ÛýCQà®\f\u0013*\\^ï²øÝ\u0002#l\u008a%PueÏÛË\b\u00004ùíEêu\u0085ÅB6ý\u0080öùö\u001b\u008c#ep|\tÇÒ\u000bÿôR\u0081\u0095w\u001dÁÍÙ\u0011¦\u0091}\u0019L\u0083~\u001d«Fz\u0099Î_@õ¡ÆG\u008a\u0017GqùÐ¦ë¼\u0080x\u008f@NIÈó¥HsØÿ~\u0000üÙ\u0097S!`º/'\u008fÜÓ\u008bf#`TÓy\u009fÁ\u009d\u0082mÁü\\?>í\u008e\u0091ö\t)\u009a,+@VÔÐ£õ\u0007*_\u008c\u008et;ÿñ\u0094\u0088Æp\u008bÏ=¶0¦É>\u0092Æ ºÎe\r\u0018\u0002®\u000b\u008f=ìJ+Å´@ÄDÆ\u0011LØ\u0012,zf\u008b¢èôØ\u0089(IGLüñ\u001e)ñ\nnO}®Õ\u00923\u0000î÷\u00ad\u0083\u0096O\u009f^kåï¸\u0010¥r#ú\nGÛ'a\u00ad\u0018Ìò·¥\u0089\u000b1\u0080òiT\u008ahæüX`Õ_H¶\u00167d Ç\u008a¸ý=\fÂ4\u008cÑ:eH*\u008d\u000fmôÛ5ÛA\u0084¡\\nv«ø©æÝ(4\u0014.\u0016\u0012\u009e\u0083=\u0095\u0085ì\u0013\u0082fª9<n\u00826 `ý\u0017+PR\u0084VÇª}V\f\u0084\no»\u0004\n(F×Æ¸\u0003ÈÆ\u0000úÍ\u0006\u0010_Ë`Äq-Ð\u0089A4ÞÓ5\u0092©ñW¢¦\u0015²\u00119_\u008a¼\u0084\u001a ´jýJåÆ\u009b\u0099üD\u0018:¦\u008fçQ\u0081{x\u0017¡ô\u000b+ÓI\u001fC\u0012¸BÏ(\nxÃ/¾þ\u0084\f\\í§:O\u0090 B\u0082\u009eT\u0091Ô}r\u0098?í\u008a\u000f\u0092fÝNWéò\u001bÓeS\u0013(<f \u009d¦Ò\u0080ç\u0014ýªH@x%þ\"\u0005\rw\u007f(UZ\u0019¨Æè\u0086-a\u0019ï<´\u008d\u007f÷\u0012\u00970}\u0010.Ë\u00963½«\u00866÷ork]vM°$Vù¹X¢§o«Ip¸#DYCò[\u0098ûºÊpGH\u0097\u0093O×\u00018S¸=Â\u009dúé&»Ð²=`¾\u0015\u009d>\u0086w\u0003Û=Ê\u0003±®kÜ\bJÕ_X\u0090\u0004øÛôç<UÖìh¿xK\u0002Vå2ÚÒcv¾(Ñýl\u0084\u008cao0àk\"0\u00ad(¢k8ëjh8hË4-bõn´:Qi\u0084úf4KÖ\u0082ù0#Î\u0091Ê\u0017ÿ\u0091ÁÜõ\u0011\u0088\u008dàâ;jÑé\u0016Ý´m\u0088\u0089\u0091æúÇ®\u0011Ë\u0081oÚÀÈ eÃ\u0005ÙÙ\u009e'\u0093ú\u001c(Ä{_\u0090êÈ\\8\u008a\u00165P$YaÄ\u0096\u0004\u001d,\\c@oêû\n[\u0011¹×Ð5\u009cs\u0018'r±c8S\u008fè´e?\u0016ØA»òfKh\u008c#ÊÁ)?\f\u0001ø 1¾me¿|q\u009a8\u0012&Æð\u009c¢\n'\u00ad®àZL'gC:ñ}ë²£æ0\u00adg4µ\b\u0019}¼\u009b5âC\u008e,\u0091$Ø6ÖÛ´ã\u0006\u008cËBë\u0016;\u001bý \u0090ÓñWµ®ã\u008em\u0094\u0080ê§\u009b·ë\u0018\u0090Ú\"\u00164EÚYH°ØK-\u0013DTùÒDõÞÂ+à(G\u0017\u001eÅ\u008eË\u0092\u0018¾D\u008c³o\u0095ª\u0086\u0086lò·\u0000Qu\u001aMÇk\t\u0000¥!ÕWè$ûV\u0004!\u009a\u00104í¶D5ªUá'=-HèÌÖt(ÿ\u000b\u0080}\u0016\u0092°ý\u008d\nI\u0005\u0007È\u0010ñ \u0016HÏüÕ\u008d\u00077a/ä½2I\u0005çí^6+\u0018ñP(ºöï)N¾F\u000e\u001d¸î\u0001êJ\u0015ûAæ\\bá\u008aïï\u0085`Ì\u000e\u0001E`®\u0002>\u008b\u00961û\u0096\u0094(\u0086\u0099Eü\u0087;\u0016Ä¬»o96\u0098ÝªlÒúóýn²\u0017å\u0097#Ê¨</xm\u0017Ô\u009e5YFÉ@zÔN\u0082àçL ØmU®\\ñ7®Çö\u0000¼¡\u0088 )p õ\u0001Õ§\u007fñjVU7\u0004@\u0099Á\u009a$\u0006T0\u00adÄ\u001f¾²ðpcR>\u0088B\u007fß\u0006eä»×(Z\u00ad¼\u0098ko\u008f,~\u0095½¢rÄÍ\u00071}ê\u0095\u009cÂ\n\u000b\u0092s\r¹\u009fÁl/\u0097«üù`\ftå"
         .length();
      char var10 = '8';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var14;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new String[46];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 2531825203194288584L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var30;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll();
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "\u000eù\u0099\u0092°óGIº£ÝïZé#¾\u0010\u0083Ä\u000bÂZ\u008eg\u000bñ¢Ù¯å\u0006íM";
                  var13 = "\u000eù\u0099\u0092°óGIº£ÝïZé#¾\u0010\u0083Ä\u000bÂZ\u008eg\u000bñ¢Ù¯å\u0006íM".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23401;
      if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5].getBytes("ISO-8859-1");
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5];
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
            "me/octo/client/failsafes/lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }
   }
}
