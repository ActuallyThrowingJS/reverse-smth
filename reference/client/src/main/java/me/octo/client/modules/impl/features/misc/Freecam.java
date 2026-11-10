package me.octo.client.modules.impl.features.misc;

import com.mojang.blaze3d.platform.InputConstants.Key;
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
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.client.ClientFrameEvent;
import me.octo.client.events.impl.entity.CameraTypeChangeEvent;
import me.octo.client.events.impl.entity.PlayerChangeLookDirectionEvent;
import me.octo.client.events.impl.entity.UpdateCameraEvent;
import me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.events.impl.game.MotionUpdateEvent;
import me.octo.client.events.impl.other.ClientShutdownEvent;
import me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.events.impl.packet.PacketSendEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.mixin.accessors.KeyMappingAccessor;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.CameraType;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Options;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Freecam extends BooleanModule {
   @NotNull
   public static Freecam.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private RemotePlayer lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private double lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private double IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private double llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private boolean llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private double llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private double lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private double IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private float IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private float IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   @Nullable
   private CameraType llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private long lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @JvmField
   @NotNull
   public static Freecam INSTANCE;
   private static long IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 8940803992887L;
   private static String[] IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static Map lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = new HashMap(13);

   private Freecam() {
      long var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 43722382167476L;
      ModuleCategory var10003 = ModuleCategory.MISC;
      Setting[] var3 = new Setting[]{
         lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Freecam", "Detaches your camera from your player.", var10003, "Player", var3);
   }

   @Nullable
   public final RemotePlayer IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable RemotePlayer var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final float getYaw() {
      return this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1;
   }

   public final float getPitch() {
      return this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(float var1) {
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var1;
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean isSimulationActive() {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void clearMovementInput() {
      long var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 109714054282130L;
      boolean var3 = Replay.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      LocalPlayer var10000;
      try {
         label31: {
            this.lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI();
            if (var3) {
               var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().player;
               if (var10000 != null) {
                  break label31;
               }
            }

            return;
         }
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }

      LocalPlayer var4 = var10000;
      boolean var5 = false;
      var4.input.tick();
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(double var1, double var3) {
      if (this.isSimulationActive()) {
         float var5 = (float)var3 * 0.15F;
         float var6 = (float)var1 * 0.15F;
         this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII += var6;
         this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = Mth.clamp(
            this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll + var5, -90.0F, 90.0F
         );
      }
   }

   public final void turnCameraFromMouse(double param1, double param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI() {
      Options var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().options;
      if (var10000 != null) {
         Options var1 = var10000;
         var1.keyUp.setDown(false);
         var1.keyDown.setDown(false);
         var1.keyLeft.setDown(false);
         var1.keyRight.setDown(false);
         var1.keyJump.setDown(false);
         var1.keyShift.setDown(false);
         var1.keySprint.setDown(false);
      }
   }

   public final boolean shouldBlockMovementKey(@NotNull KeyEvent keyInputArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean shouldBlockMovementMouse(int param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(long var1) {
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      Options var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().options;
      Intrinsics.checkNotNullExpressionValue(
         var10000, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(31056, 2240384334743060067L ^ var1)
      );
      Options var3 = var10000;
      KeyMapping[] var4 = new KeyMapping[]{var3.keyUp, var3.keyDown, var3.keyLeft, var3.keyRight, var3.keyJump, var3.keyShift, var3.keySprint};
      return CollectionsKt.listOf(var4);
   }

   private final Collection IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(long var1) {
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      long var3 = var1 ^ 103095213335048L;
      Iterable var6 = this.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(var3);
      boolean var7 = false;
      boolean var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         2555159839284431249L, var1
      );
      var var9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
      boolean var10 = false;
      Iterator var11 = var6.iterator();
      boolean var5 = var10000;

      while (true) {
         if (var11.hasNext()) {
            Object var12 = var11.next();
            var17 = var9;
            if (!var5) {
               break;
            }

            KeyMapping var13 = (KeyMapping)var12;
            boolean var14 = false;
            Intrinsics.checkNotNull(
               var13, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(19953, 1323612485820286454L ^ var1)
            );
            var9.add(((KeyMappingAccessor)var13).getKey());
            if (var5) {
               continue;
            }
         }

         var17 = var9;
         break;
      }

      return (Collection)var17;
   }

   public final void llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull UpdateCameraEvent.Rotation eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull UpdateCameraEvent.Position eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull CameraTypeChangeEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PlayerChangeLookDirectionEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull MotionUpdateEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ClientFrameEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, double param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, boolean param3, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, KeyMapping var3) {
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      long var4 = var1 ^ 32351879314635L;
      Intrinsics.checkNotNull(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(19953, 1323555081682436535L ^ var1)
      );
      Key var6 = ((KeyMappingAccessor)var3).getKey();
      Intrinsics.checkNotNull(var6);
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, var4);
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Key param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketSendEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eArg
   ) {
      long var2 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 93168444018279L;
      long var4 = (var2 ^ 139865237871470L) >>> 8;
      int var6 = (int)((var2 ^ 139865237871470L) << 56 >>> 56);
      Intrinsics.checkNotNullParameter(eArg, "e");
      this.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII$recovered$135a96a934c0aff7(var4, (byte)var6);
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ClientShutdownEvent eArg) {
      Intrinsics.checkNotNullParameter(eArg, "e");
      this.clearMovementInput();
   }

   static {
      long var0 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 24050017092131L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[21];
      int var7 = 0;
      String var6 = "û\"e/Ö`(cúÀèÿSÄ4½ów wª8áaô\u0014gu`\u008cgÝ\u0010\u0084ó\u0094®h×@³¢\u008b\u0098ùï`m\u0094\u0010Qì\u0014¯ì\u0091Èa2Ð\u0095]x²\u0018\u0096 0J¶\u00ad\u0003Dn\u0003Ä\u0087\u0096æk\u0097\u0098û)èÜ\u009bõ\bvØz\u0015\u000b\u0095\u0090Bõä\u0010P2éÓá×®ß7ÔX¸\u008a=Ód\u0010î\u008d\u009a9rïµ\u0086\u0091\u0095 \u009c{ß \u008e\u0010}ó¿¸nÍÝûY'A&Zç4$\u0010r\u0006\n\u008a%NKtÌÍeçxu\u0010Å\u0010T±hÅF\u0007 ,ðOÏü\u001fÓ£\u0019\u0010¼§«c]Î\u009cEÀyi \u009eX:\u0005Hm-£Ï-cjâ!fýÒ+\u000fw&Ö@Ei\u0014'\u0002\u0089ÜYpéúB\u0089CÑlêb¹eEÒn¹\u009f¿±°>[vz\u000f`s^ÑÆsmCc¬#ò1<9ð($\u008b\u0002@HþØ î\u001b\u001e×SÁ\u001c\u001aQJf8b±\u0014X\u0012Q\u009a\u0004ÿ¹\u0011\u000f\u0010t4CkhÙÓg\u001d\u008c´vó\"§\u0015Ñ¦\bþ´pð.\u0011b\u009a}ù.\u0016ä\u008a):ÃÄ|~\u009b¦ívl\u00100×5\u007fRý»\u008a;K\u0098]wv£` £·êd\u00907\u0003N\u009c÷·\u008bZ`Í\u009c\u001fª¶\u009e\u001db@ªc\u009b\u0086ªÛyyà8k\u0098»\u0001\u0001`-ª\u009e\u00048¬Zfñì\u0015>VÁî¦\u0015öõ¡4 J/ip0êPÎt\u0083\rònL¿¶\u0003ÈþNøÍ')\ff®w\u00882¼ýv`!i«w\tg?ÊSY\u0006\u0097µ«\u009d\u0084×)ºÄðÒäB1g\u009d\u0007EçS]\"ryr\u0007Ý\u0016Ðóõ×\u0083úË0gk\u0087\u009c \u008f\u0015m±~:Y\u0092ÈRB|bæ\u0085õ\u0014qr\u007f\"î\u0093\u008cgU\b~\u0098\u0010j\u001bPLÁq³[ÂÃ^ý\u008cÊ1Á\u009f°\u009e\u008cgsJ\u0012\u000e¦ó¼\b\tÝ³Èß£ ;ñY¬³±lT3<!é\f \u00ad\u0081C[rm÷ðbÉò \u0002Ì\u001aá5è)Ë\bXÅ[dËNä\u009e¶·j\u0088\u0090.Mô}HKÈÎË\f&a¹wVªNFMÎ\u0080\u0089àTj0\u0011lj`kI\u001e\u00920\u0083©úwGDÓ\u0085>ýOÀ\u000e«Ã\f\u0091\u0006Y7ôe,Ç¶uJµ\u0018\u001cÐatÇ!\u0086\u009bã^Boý\u007f«BHÏùi+\u0007ë¬¼×Á\u0094k\u009càÚ¯n`@5\u000f´í?f»îK¤*O ¼ yß\u0083`ÜY\u000f\u0086 ëº\"IW¼\u001f¹ß\u0089\u0001 \u009e\u0005\u001f»HäuÔ\u0001m\u0090(÷Ä\\\u0090p\u0083ëAêHÊÙj\u000bO\u000eßÜ\u0080í";
      int var8 = "û\"e/Ö`(cúÀèÿSÄ4½ów wª8áaô\u0014gu`\u008cgÝ\u0010\u0084ó\u0094®h×@³¢\u008b\u0098ùï`m\u0094\u0010Qì\u0014¯ì\u0091Èa2Ð\u0095]x²\u0018\u0096 0J¶\u00ad\u0003Dn\u0003Ä\u0087\u0096æk\u0097\u0098û)èÜ\u009bõ\bvØz\u0015\u000b\u0095\u0090Bõä\u0010P2éÓá×®ß7ÔX¸\u008a=Ód\u0010î\u008d\u009a9rïµ\u0086\u0091\u0095 \u009c{ß \u008e\u0010}ó¿¸nÍÝûY'A&Zç4$\u0010r\u0006\n\u008a%NKtÌÍeçxu\u0010Å\u0010T±hÅF\u0007 ,ðOÏü\u001fÓ£\u0019\u0010¼§«c]Î\u009cEÀyi \u009eX:\u0005Hm-£Ï-cjâ!fýÒ+\u000fw&Ö@Ei\u0014'\u0002\u0089ÜYpéúB\u0089CÑlêb¹eEÒn¹\u009f¿±°>[vz\u000f`s^ÑÆsmCc¬#ò1<9ð($\u008b\u0002@HþØ î\u001b\u001e×SÁ\u001c\u001aQJf8b±\u0014X\u0012Q\u009a\u0004ÿ¹\u0011\u000f\u0010t4CkhÙÓg\u001d\u008c´vó\"§\u0015Ñ¦\bþ´pð.\u0011b\u009a}ù.\u0016ä\u008a):ÃÄ|~\u009b¦ívl\u00100×5\u007fRý»\u008a;K\u0098]wv£` £·êd\u00907\u0003N\u009c÷·\u008bZ`Í\u009c\u001fª¶\u009e\u001db@ªc\u009b\u0086ªÛyyà8k\u0098»\u0001\u0001`-ª\u009e\u00048¬Zfñì\u0015>VÁî¦\u0015öõ¡4 J/ip0êPÎt\u0083\rònL¿¶\u0003ÈþNøÍ')\ff®w\u00882¼ýv`!i«w\tg?ÊSY\u0006\u0097µ«\u009d\u0084×)ºÄðÒäB1g\u009d\u0007EçS]\"ryr\u0007Ý\u0016Ðóõ×\u0083úË0gk\u0087\u009c \u008f\u0015m±~:Y\u0092ÈRB|bæ\u0085õ\u0014qr\u007f\"î\u0093\u008cgU\b~\u0098\u0010j\u001bPLÁq³[ÂÃ^ý\u008cÊ1Á\u009f°\u009e\u008cgsJ\u0012\u000e¦ó¼\b\tÝ³Èß£ ;ñY¬³±lT3<!é\f \u00ad\u0081C[rm÷ðbÉò \u0002Ì\u001aá5è)Ë\bXÅ[dËNä\u009e¶·j\u0088\u0090.Mô}HKÈÎË\f&a¹wVªNFMÎ\u0080\u0089àTj0\u0011lj`kI\u001e\u00920\u0083©úwGDÓ\u0085>ýOÀ\u000e«Ã\f\u0091\u0006Y7ôe,Ç¶uJµ\u0018\u001cÐatÇ!\u0086\u009bã^Boý\u007f«BHÏùi+\u0007ë¬¼×Á\u0094k\u009càÚ¯n`@5\u000f´í?f»îK¤*O ¼ yß\u0083`ÜY\u000f\u0086 ëº\"IW¼\u001f¹ß\u0089\u0001 \u009e\u0005\u001f»HäuÔ\u0001m\u0090(÷Ä\\\u0090p\u0083ëAêHÊÙj\u000bO\u000eßÜ\u0080í"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "6\u009aECÎ\u0081I¦\u0087ï¢¡0¾áÌn\u0017\u001d=\u0096.\u0006C3èe\u001dÙ\u0083\u008f\u000eX1ö¶ZUzI×\u001cr\u0087\u0091\u0090é¾ü\n\u009b\u001a¨/Ö9e·ü(Ü2\u001a¤æÓ\u0015QLuÖÀècR.J9\\«×(A:bCö÷+çsbì=_¸%ßï¥\u008azv\u0087>\u0011*õX\u009a\u0015Ù¦\u0004¯m!\u008aä\u0098\u0010";
            var8 = "6\u009aECÎ\u0081I¦\u0087ï¢¡0¾áÌn\u0017\u001d=\u0096.\u0006C3èe\u001dÙ\u0083\u008f\u000eX1ö¶ZUzI×\u001cr\u0087\u0091\u0090é¾ü\n\u009b\u001a¨/Ö9e·ü(Ü2\u001a¤æÓ\u0015QLuÖÀècR.J9\\«×(A:bCö÷+çsbì=_¸%ßï¥\u008azv\u0087>\u0011*õX\u009a\u0015Ù¦\u0004¯m!\u008aä\u0098\u0010"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var9;
                  lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = new String[21];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new Freecam.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  INSTANCE = new Freecam();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26774;
      if (lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/impl/features/misc/Freecam", var10);
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
         lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5];
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
         throw new RuntimeException("me/octo/client/modules/impl/features/misc/Freecam" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private final Collection IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII$recovered$c3cb92b89105e382(long var1) {
      var1 = 90247167741353L;
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      long var3 = var1 ^ 103095213335048L;
      Iterable var6 = this.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII$recovered$a1e12f3e9af5042b(var3);
      boolean var7 = false;
      boolean var10000 = Replay.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      var var9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
      boolean var10 = false;
      Iterator var11 = var6.iterator();
      boolean var5 = var10000;

      while (true) {
         if (var11.hasNext()) {
            Object var12 = var11.next();
            var18 = var9;
            if (!var5) {
               break;
            }

            KeyMapping var13 = (KeyMapping)var12;
            boolean var14 = false;
            Intrinsics.checkNotNull(var13, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
            var9.add(((KeyMappingAccessor)var13).getKey());
            if (var5) {
               continue;
            }
         }

         var18 = var9;
         break;
      }

      return (Collection)var18;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$cafde4e33ded09b5(
      long param1, double param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII$recovered$135a96a934c0aff7(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII$recovered$a1e12f3e9af5042b(long var1) {
      var1 = 8754326373014L;
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      Options var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().options;
      Intrinsics.checkNotNullExpressionValue(var10000, "options");
      Options var3 = var10000;
      KeyMapping[] var4 = new KeyMapping[]{var3.keyUp, var3.keyDown, var3.keyLeft, var3.keyRight, var3.keyJump, var3.keyShift, var3.keySprint};
      return CollectionsKt.listOf(var4);
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d6c8214a198c6fa3(
      long var1, KeyMapping var3
   ) {
      var1 = 16264498989544L;
      var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ var1;
      long var4 = var1 ^ 32351879314635L;
      Intrinsics.checkNotNull(var3, "null cannot be cast to non-null type me.octo.client.mixin.accessors.KeyMappingAccessor");
      Key var6 = ((KeyMappingAccessor)var3).getKey();
      Intrinsics.checkNotNull(var6);
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$fdbab52750bb8ec6(var6, var4);
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7fd4ad8b311e4876(
      long param1, boolean param3, boolean param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$fdbab52750bb8ec6(
      Key param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
