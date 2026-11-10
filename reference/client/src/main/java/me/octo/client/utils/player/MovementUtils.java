package me.octo.client.utils.player;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.modules.impl.macros.GhostMacro;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Options;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MovementUtils extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static MovementUtils IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static List<boolean[]> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static int lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Vec3 llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 8981775713424L;
   private static String[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static String[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static Map IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;

   private MovementUtils() {
   }

   public static final boolean getSafeWalk() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   @NotNull
   public final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var1) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   public final boolean IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
      lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   public final boolean lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(boolean var1) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var1;
   }

   public final int IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1) {
      lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(boolean var1) {
      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final double IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(long var1) {
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      int var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7548458569080003114L, var1
      );

      MobEffectInstance var16;
      label45: {
         try {
            LocalPlayer var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().player;
            if (var10000 != null) {
               var16 = var10000.getEffect(MobEffects.JUMP_BOOST);
               break label45;
            }
         } catch (MatchException var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, 7527398112488081187L, var1
            );
         }

         var16 = null;
      }

      MobEffectInstance var4 = var16;

      label37: {
         try {
            if (var4 != null) {
               var17 = 0.42 + (var4.getAmplifier() + 1) * 0.1;
               break label37;
            }
         } catch (MatchException var13) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var13, 7527398112488081187L, var1
            );
         }

         var17 = 0.42;
      }

      double var5 = var17;
      double var7 = 0.0784;
      double var9 = 0.0;
      double var11 = var5;

      while (true) {
         if (var11 > var7) {
            var18 = var9 + var11;
            if (var3 == 0) {
               break;
            }

            var9 = var18;
            var11 = var11 * 0.98 - 0.08;
            if (var3 != 0) {
               continue;
            }
         }

         var18 = var9;
         break;
      }

      return var18;
   }

   @Nullable
   public final Vec3 IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(short param1, long param2, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long var1) {
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;

      try {
         if (me.octo.client.modules.manager.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()) {
            return;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, 1181316173710573361L, var1
         );
      }

      Options var10000;
      try {
         var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().options;
         if (var10000 == null) {
            return;
         }
      } catch (MatchException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, 1181316173710573361L, var1
         );
      }

      Options var3 = var10000;
      KeyMapping var10001 = var3.keyUp;
      Intrinsics.checkNotNullExpressionValue(
         var3.keyUp, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(13835, 7061782180077872143L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyDown;
      Intrinsics.checkNotNullExpressionValue(
         var3.keyDown, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(31605, 7834878431092992321L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyRight;
      Intrinsics.checkNotNullExpressionValue(
         var3.keyRight, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(32514, 3875597858940087580L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyLeft;
      Intrinsics.checkNotNullExpressionValue(
         var3.keyLeft, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(1423, 7693893864305694614L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
   }

   public final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(long var1) {
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 85646998952999L;
      long var5 = var1 ^ 63434813053181L;
      this.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var5);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(28233, 319261575706304547L ^ var1), var3, false
      );
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String param1, long param2, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, @NotNull Vec3 param2, byte param3, boolean param4, int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(boolean var1) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param1, @NotNull Vec3 param2, long param3, boolean param5, double param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Vec3 param1, float param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(KeyMapping var1, boolean var2) {
      var1.setDown(var2);
   }

   public final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(long var1) {
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 123020302513634L;
      long var5 = var1 ^ 13319391066554L;
      long var7 = var1 ^ 29557443110493L;
      long var9 = var1 ^ 125955329392450L;
      long var11 = var1 ^ 115962496646391L;
      long var13 = var1 ^ 67491709550661L;
      long var15 = var1 ^ 73599859624942L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var11);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var11);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var5, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var9, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var13, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(false, var3);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var15);
      GhostMacro.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(var7);
   }

   public final void lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(long var1) {
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 31918889442240L;
      long var5 = var1 ^ 62261925846662L;
      long var7 = var1 ^ 86632183477039L;
      long var9 = var1 ^ 44393368254754L;
      long var11 = (var1 ^ 3551597408059L) >>> 32;
      int var13 = (int)((var1 ^ 3551597408059L) << 32 >>> 32);
      long var10001 = var1 ^ 24392642325639L;
      int var14 = (int)((var1 ^ 24392642325639L) >>> 48);
      int var15 = (int)((var1 ^ 24392642325639L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 16938929239119L;
      long var19 = var1 ^ 78505293521061L;
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var5);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var9);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var19);
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var11, var13);
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((short)var14, var15, (short)var16);
      llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
      lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var7);
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var17);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      boolean var1, boolean var2, int var3, boolean var4, boolean var5, char var6, char var7
   ) {
      long var8 = ((long)var3 << 32 | (long)var6 << 48 >>> 32 | (long)var7 << 48 >>> 48)
         ^ IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;

      Options var10000;
      try {
         var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().options;
         if (var10000 == null) {
            return;
         }
      } catch (MatchException var11) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var11, 4030374364925728955L, var8
         );
      }

      Options var10 = var10000;
      KeyMapping var10001 = var10.keyUp;
      Intrinsics.checkNotNullExpressionValue(
         var10.keyUp, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(3486, 6545407942897580054L ^ var8)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var1);
      var10001 = var10.keyDown;
      Intrinsics.checkNotNullExpressionValue(
         var10.keyDown, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(30677, 4106604463033139807L ^ var8)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var2);
      var10001 = var10.keyLeft;
      Intrinsics.checkNotNullExpressionValue(
         var10.keyLeft, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(13875, 7782913516256625592L ^ var8)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var4);
      var10001 = var10.keyRight;
      Intrinsics.checkNotNullExpressionValue(
         var10.keyRight, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"h">(9520, 2219827948309745834L ^ var8)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var5);
   }

   public final boolean lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(byte param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull BlockPos param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Vec3 param1, @NotNull Vec3 param2, long param3, boolean param5, double param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ 107709450782713L;
      if (IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl() != null) {
         me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var13 = new me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[2];
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var13);
      }

      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[60];
      int var5 = 0;
      String var4 = "³\nÕ¼î¥\u0094¦\u008aR\u001f\u009f\u001a\u0012\u0087\u0015 Øq\u0095,Û!\u0019\u0087E\u008frµ\u001d\u0014\u0005\u0005lÑüm\u007f\u001baÛE\u0019\u008b^s\u0099³\u0011 QÄÑ\u0087(1\u0001AKÄ\\ÜÍ{\u0005ª@7\\y¶%\u001d[Éß\u0002ôöÔ\u0093ê\u0010r«\u000fk\u0084ÿ+rfÿ=!°½\u0000\u0081(\u008d\u001c+ÕÌMZ@s6ë÷ö\u000bÌKP$\r\u0014Ø?\t\u0011\u0086Ë2«yQò:r\u008e\u0086#\u0089\u0001\u000bû\u0010÷«k5Od!oUýÂôÏÇ\u0016M\u0010\u0085ÐÒ\u0080Â·¢\u0019\u0090êLð\\}\u0083\u001d W\u0095\u0082£\u0012ø\u001cCi°/\u0092î+,\u009fF+¼ñ¨ 6RÝ²0{§¶¥£\u0010ïi.3îñ|&¾ÊC.\u001dõ¨À\u0010f\u001bÙe\u0099v÷oÜ ]A\u008c5´P\u0010ú°êÏN\u0091´\u0098\u001b`ÆÓó5¶h(«\u008d#ÐÀ@û\u0017£\u008a\u0014N\n_Í\u0014\u000e¸Å\u000fG\u008aÒ\u0087¨;ý\u000f\f4\u0014úÍIB\u009c4\u000f\u0000Ü\u0010]\u0092\n+\u009fÐ¿2ÿ¢]K\u0090áÐ> 1sðsíè\u0017º\u007fW·äZ]¢Ïj!\u0000\u008d¶\u0010\u001d\u0011\u0089ª~Æ_Î\u001cÊ\u0010\u009fQ\u0005aàY¿O2æ¿fÐ\\Ð¶ ß·Ï\u0011\">.Ô\bY\u008bñ¦\u000e\u0002\u0004«àë\u008a¡\f\u0094CT´±Áó@s\u0088\u0010Åw\u0010\u009bI\u0096ºÅ×\u008c\u000f\u0017\u001bz\u0080{\u0010{÷\u001e\u0017Ë])jVøÊ<Ãô\n\r\u0010\u0015\u0011#Ë¡$°\u0093¤ïý\u0004\u0011\u0014ªD\u0010$&Ç\u0094´ì\u009d\u0092')zB®\"iÔ ÂÞÏó\u0005g\u00101\u0000c\"²\u0003\t\u0093$ëå\u0016/¨x\u000f¹Þ\u0015D|\u0011® À\u00188ÉC}ºÌÚ\u0002E¬\u008a\u008c¬úÁ¯¶#\t;ªÌ=O MB\u0093ö°Rh\u0080ó\u009d}\u001d\u0001\u0091WBò§\u0018+t!\u0018ª\u008d½t\u0087K\u00043× \u0019ZÀ/éþù\u009fUZ\u001d\u001dG:F·d.ª\u0096\u0095°@\u0080]^õw`t÷¥\u0010CÚÜ\u008d:\u001cö&\u0012\u0094N|Jñ\u009a»\u0010Q\u0097Ò¥\u009a 1+hÄ2\u00998\u0083Ñw@Å¡\u001di3Áá:g \u009f±0\u0005\u0018\u0001Ó÷Õþ\u0086Þ\u001e´A\u0085\u0083Q«Á,\u0093ª¥1®<âÜ;34\u0087LÝåøêÕ\u0013·È|ûÔ\u0087ÔÛÖ\u000f`\u0099Ïñ\u0010±R^\u009cbq\u009d\u0088³\nýö\u0090\u00ad°\t\u0010\u0098^ûæ?J@V\u007f.H}a\u008c\"7\u0010èÌ÷?-ô}á\u009cÖ\r~ßÊ\u009c9\u0010á\u008aQ\u001fm³ \u001b$¥\u0096\u001c\u001eÈfú\u0010+ä`Ï\u008b¼C\u009cÆw TÿX._ \u0090ïÈYp\u000e±\u0015ãô/×\u0094,ëþÍ\u0004·ºª¥K\u009bO\\XtA¸\u0002ø \u0012,#{Ðß\u009føY\u001bZö£P-*µ%$O~Õ®#\rè\u009f\u0015\u001a\u0099t\u0000\u0010ç¶Èy\u007f\u0084ÞmRÉ\"\u0099ÔÇ9\u0002 ÜG\u0017:zÏ\u0087=f¥3×\u008a@:zÌ)á7\u0004Î\u0000õð\u001f¼\r\u009bÝ+¦\u0010\tÖë\u00adÔ\u0012\f\u008bp§\u0001\u0088(ÁZp(uxðY\u001e8\u0018\u001e\u0080\u001fzE¥óë\u0091N\u0098Åôd:P\u000e7XSº½&\u000b¾èØ£\n*K\u009bç\u0010\u000bsÈ7\"\b2¾\u0000duÈcÕ½¶\u0010\u001bç\u008fßiXÈeYã\u008c\u0011ßÖÁF\u0010\u0015@{ìíð<\u00818]÷µ¨\u008a¿,\u0010.\u009bÐa*Î'40+Gh¾\u0017\u0013t ië\u008eoé¥h:h&bòd\u0016Ý0\u0011üù·\u0010q\u0088M\u007fÓbÔÌ8ÖË\u0010Å`\u0090ê¼øÌG:m|Ô°\u008b¦\u0093\u0010\u0099L^á\u0098\u000emÔB¡êçÕÁ\u0098µ\u0010ÁóMG-\u0018\u008eÿkr=[\u00961\u0004í\u0010\u0091G°²¡ÄûF\u0089+[N)YÞY\u0010ñ\u0091º\u008b6\u000bo®rî?;O\u008eK\u0099\u0010ëO¶Úp\u0007\u001b$ÞQ\u0006\u00901;ÛÖ °Ìõm\u0090\u0000[\"ß¸\u0003ÒÂE\u0003ß£î\u0001\u0001Ù\u0003À&KRÎ\nB}M,\u0010\br¯Ì\u0000W\"$H3\f¨\bü9\u0007\u0018ãÊ\n\u0017¹\u009fé\u00adgúI\u0005±EÅßÙRÎ\u008cfP·$\u0018)¸ùÇ\u0085\u001eÙ\u0001z³\u0086ö\u008b\u008c\u001avÀ³c!ä\u0018°µ \u0097öo\u000foÁ\u008c@\r\u001cÎ[A\u000bø½ìb¨\u0091»\u0092:\u001cõ\u0007>Fq \u009b\r\u0018\tàt\u0013`\fÂÏ#\u001d\u0000j\u00135ë7t\tÍIÅ\u0019-\u000b\u0010©î\rÀ¡\u009eª6{ÊÏ\u001e\u0095Ï¦\u0003\u0018g\u0014ý?¬³\u0092\u0090Ë;¢ç=\u009fç\u001aºT§i\u00ad_\u008du\u0010ßÈG:ù^ì'¨[[Ax\u008dâ\u0007";
      int var6 = "³\nÕ¼î¥\u0094¦\u008aR\u001f\u009f\u001a\u0012\u0087\u0015 Øq\u0095,Û!\u0019\u0087E\u008frµ\u001d\u0014\u0005\u0005lÑüm\u007f\u001baÛE\u0019\u008b^s\u0099³\u0011 QÄÑ\u0087(1\u0001AKÄ\\ÜÍ{\u0005ª@7\\y¶%\u001d[Éß\u0002ôöÔ\u0093ê\u0010r«\u000fk\u0084ÿ+rfÿ=!°½\u0000\u0081(\u008d\u001c+ÕÌMZ@s6ë÷ö\u000bÌKP$\r\u0014Ø?\t\u0011\u0086Ë2«yQò:r\u008e\u0086#\u0089\u0001\u000bû\u0010÷«k5Od!oUýÂôÏÇ\u0016M\u0010\u0085ÐÒ\u0080Â·¢\u0019\u0090êLð\\}\u0083\u001d W\u0095\u0082£\u0012ø\u001cCi°/\u0092î+,\u009fF+¼ñ¨ 6RÝ²0{§¶¥£\u0010ïi.3îñ|&¾ÊC.\u001dõ¨À\u0010f\u001bÙe\u0099v÷oÜ ]A\u008c5´P\u0010ú°êÏN\u0091´\u0098\u001b`ÆÓó5¶h(«\u008d#ÐÀ@û\u0017£\u008a\u0014N\n_Í\u0014\u000e¸Å\u000fG\u008aÒ\u0087¨;ý\u000f\f4\u0014úÍIB\u009c4\u000f\u0000Ü\u0010]\u0092\n+\u009fÐ¿2ÿ¢]K\u0090áÐ> 1sðsíè\u0017º\u007fW·äZ]¢Ïj!\u0000\u008d¶\u0010\u001d\u0011\u0089ª~Æ_Î\u001cÊ\u0010\u009fQ\u0005aàY¿O2æ¿fÐ\\Ð¶ ß·Ï\u0011\">.Ô\bY\u008bñ¦\u000e\u0002\u0004«àë\u008a¡\f\u0094CT´±Áó@s\u0088\u0010Åw\u0010\u009bI\u0096ºÅ×\u008c\u000f\u0017\u001bz\u0080{\u0010{÷\u001e\u0017Ë])jVøÊ<Ãô\n\r\u0010\u0015\u0011#Ë¡$°\u0093¤ïý\u0004\u0011\u0014ªD\u0010$&Ç\u0094´ì\u009d\u0092')zB®\"iÔ ÂÞÏó\u0005g\u00101\u0000c\"²\u0003\t\u0093$ëå\u0016/¨x\u000f¹Þ\u0015D|\u0011® À\u00188ÉC}ºÌÚ\u0002E¬\u008a\u008c¬úÁ¯¶#\t;ªÌ=O MB\u0093ö°Rh\u0080ó\u009d}\u001d\u0001\u0091WBò§\u0018+t!\u0018ª\u008d½t\u0087K\u00043× \u0019ZÀ/éþù\u009fUZ\u001d\u001dG:F·d.ª\u0096\u0095°@\u0080]^õw`t÷¥\u0010CÚÜ\u008d:\u001cö&\u0012\u0094N|Jñ\u009a»\u0010Q\u0097Ò¥\u009a 1+hÄ2\u00998\u0083Ñw@Å¡\u001di3Áá:g \u009f±0\u0005\u0018\u0001Ó÷Õþ\u0086Þ\u001e´A\u0085\u0083Q«Á,\u0093ª¥1®<âÜ;34\u0087LÝåøêÕ\u0013·È|ûÔ\u0087ÔÛÖ\u000f`\u0099Ïñ\u0010±R^\u009cbq\u009d\u0088³\nýö\u0090\u00ad°\t\u0010\u0098^ûæ?J@V\u007f.H}a\u008c\"7\u0010èÌ÷?-ô}á\u009cÖ\r~ßÊ\u009c9\u0010á\u008aQ\u001fm³ \u001b$¥\u0096\u001c\u001eÈfú\u0010+ä`Ï\u008b¼C\u009cÆw TÿX._ \u0090ïÈYp\u000e±\u0015ãô/×\u0094,ëþÍ\u0004·ºª¥K\u009bO\\XtA¸\u0002ø \u0012,#{Ðß\u009føY\u001bZö£P-*µ%$O~Õ®#\rè\u009f\u0015\u001a\u0099t\u0000\u0010ç¶Èy\u007f\u0084ÞmRÉ\"\u0099ÔÇ9\u0002 ÜG\u0017:zÏ\u0087=f¥3×\u008a@:zÌ)á7\u0004Î\u0000õð\u001f¼\r\u009bÝ+¦\u0010\tÖë\u00adÔ\u0012\f\u008bp§\u0001\u0088(ÁZp(uxðY\u001e8\u0018\u001e\u0080\u001fzE¥óë\u0091N\u0098Åôd:P\u000e7XSº½&\u000b¾èØ£\n*K\u009bç\u0010\u000bsÈ7\"\b2¾\u0000duÈcÕ½¶\u0010\u001bç\u008fßiXÈeYã\u008c\u0011ßÖÁF\u0010\u0015@{ìíð<\u00818]÷µ¨\u008a¿,\u0010.\u009bÐa*Î'40+Gh¾\u0017\u0013t ië\u008eoé¥h:h&bòd\u0016Ý0\u0011üù·\u0010q\u0088M\u007fÓbÔÌ8ÖË\u0010Å`\u0090ê¼øÌG:m|Ô°\u008b¦\u0093\u0010\u0099L^á\u0098\u000emÔB¡êçÕÁ\u0098µ\u0010ÁóMG-\u0018\u008eÿkr=[\u00961\u0004í\u0010\u0091G°²¡ÄûF\u0089+[N)YÞY\u0010ñ\u0091º\u008b6\u000bo®rî?;O\u008eK\u0099\u0010ëO¶Úp\u0007\u001b$ÞQ\u0006\u00901;ÛÖ °Ìõm\u0090\u0000[\"ß¸\u0003ÒÂE\u0003ß£î\u0001\u0001Ù\u0003À&KRÎ\nB}M,\u0010\br¯Ì\u0000W\"$H3\f¨\bü9\u0007\u0018ãÊ\n\u0017¹\u009fé\u00adgúI\u0005±EÅßÙRÎ\u008cfP·$\u0018)¸ùÇ\u0085\u001eÙ\u0001z³\u0086ö\u008b\u008c\u001avÀ³c!ä\u0018°µ \u0097öo\u000foÁ\u008c@\r\u001cÎ[A\u000bø½ìb¨\u0091»\u0092:\u001cõ\u0007>Fq \u009b\r\u0018\tàt\u0013`\fÂÏ#\u001d\u0000j\u00135ë7t\tÍIÅ\u0019-\u000b\u0010©î\rÀ¡\u009eª6{ÊÏ\u001e\u0095Ï¦\u0003\u0018g\u0014ý?¬³\u0092\u0090Ë;¢ç=\u009fç\u001aºT§i\u00ad_\u008du\u0010ßÈG:ù^ì'¨[[Ax\u008dâ\u0007"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var32 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var32;
         if ((var2 += var3) >= var6) {
            var4 = "ôé\u000eæóé³Wö9Å\n\u0015¦ \u0083(\u008cku\u0099J\u0007>¿¡\tü²\u0005\u008e\u009dMh\u0018\u009c°\u0095g\u0010Â\u0085\bÅ£'\u0005ÒÓo]\u0088aÊ´ª«";
            var6 = "ôé\u000eæóé³Wö9Å\n\u0015¦ \u0083(\u008cku\u0099J\u0007>¿¡\tü²\u0005\u008e\u009dMh\u0018\u009c°\u0095g\u0010Â\u0085\bÅ£'\u0005ÒÓo]\u0088aÊ´ª«"
               .length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var34 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
               boolean var30 = false;
               var7[var5++] = var34;
               if ((var2 += var3) >= var6) {
                  IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var7;
                  llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new String[60];
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new MovementUtils();
                  boolean[][] var11 = new boolean[8][];
                  boolean[] var12 = new boolean[]{true, false, false, false};
                  var11[0] = var12;
                  var12 = new boolean[]{false, true, false, false};
                  var11[1] = var12;
                  var12 = new boolean[]{false, false, true, false};
                  var11[2] = var12;
                  var12 = new boolean[]{false, false, false, true};
                  var11[3] = var12;
                  var12 = new boolean[]{true, false, true, false};
                  var11[4] = var12;
                  var12 = new boolean[]{true, false, false, true};
                  var11[5] = var12;
                  var12 = new boolean[]{false, true, true, false};
                  var11[6] = var12;
                  var12 = new boolean[]{false, true, false, true};
                  var11[7] = var12;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.listOf((Object[])var11);
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = -1;
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
                  Vec3 var28 = Vec3.ZERO;
                  Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var28;
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var0
   ) {
      IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var0;
   }

   public static me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 395;
      if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/utils/player/MovementUtils", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5].getBytes("ISO-8859-1");
         llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5];
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
         throw new RuntimeException("me/octo/client/utils/player/MovementUtils" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll$recovered$6f3f573860f99461(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$342cb48b9693181a(
      @NotNull String nameArg, long argument2Arg, boolean argument3Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1a440d4c183b8d9d(
      @NotNull String nameArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final double IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII$recovered$8aa5f193c43966c9(long var1) {
      var1 = 110043933667094L;
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      int var3 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();

      MobEffectInstance var19;
      label45: {
         try {
            LocalPlayer var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().player;
            if (var10000 != null) {
               var19 = var10000.getEffect(MobEffects.JUMP_BOOST);
               break label45;
            }
         } catch (MatchException var16) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16);
         }

         var19 = null;
      }

      MobEffectInstance var4 = var19;

      label37: {
         try {
            if (var4 != null) {
               var20 = 0.42 + (var4.getAmplifier() + 1) * 0.1;
               break label37;
            }
         } catch (MatchException var15) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15);
         }

         var20 = 0.42;
      }

      double var5 = var20;
      double var7 = 0.0784;
      double var9 = 0.0;
      double var11 = var5;

      while (true) {
         if (var11 > var7) {
            var21 = var9 + var11;
            if (var3 == 0) {
               break;
            }

            var9 = var21;
            var11 = var11 * 0.98 - 0.08;
            if (var3 != 0) {
               continue;
            }
         }

         var21 = var9;
         break;
      }

      return var21;
   }

   public final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII$recovered$b36a18c65ce831a5(long var1) {
      var1 = 57634655704836L;
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;

      try {
         if (me.octo.client.modules.manager.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()) {
            return;
         }
      } catch (MatchException var6) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
      }

      Options var10000;
      try {
         var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().options;
         if (var10000 == null) {
            return;
         }
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }

      Options var3 = var10000;
      KeyMapping var10001 = var3.keyUp;
      Intrinsics.checkNotNullExpressionValue(var3.keyUp, "keyUp");
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyDown;
      Intrinsics.checkNotNullExpressionValue(var3.keyDown, "keyDown");
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyRight;
      Intrinsics.checkNotNullExpressionValue(var3.keyRight, "keyRight");
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
      var10001 = var3.keyLeft;
      Intrinsics.checkNotNullExpressionValue(var3.keyLeft, "keyLeft");
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, false);
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$614562790dd5d2b2(
      MovementUtils var0, Vec3 var1, Vec3 var2, long var3, boolean var5, double var6, int var8, Object var9
   ) {
      var3 = 74180372812095L;
      var3 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var3;
      long var10 = var3 ^ 123232710418429L;
      int var12 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();

      int var10000;
      byte var10001;
      label25: {
         label24: {
            try {
               var10000 = var8;
               var10001 = 4;
               if (var12 == 0) {
                  break label25;
               }

               if ((var8 & 4) == 0) {
                  break label24;
               }
            } catch (MatchException var14) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var14);
            }

            var5 = false;
         }

         var10000 = var8;
         var10001 = 8;
      }

      if ((var10000 & var10001) != 0) {
         var6 = 0.0;
      }

      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$eaa07d6410daac9a(var1, var2, var10, var5, var6);
   }

   public final boolean llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII$recovered$6261860e767e5812(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl$recovered$506cb6ca6f44865e(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl$recovered$74dc033d9b1384ab(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl$recovered$418c3fab5a0d7e53(long var1) {
      var1 = 45871070079273L;
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 31918889442240L;
      long var5 = var1 ^ 62261925846662L;
      long var7 = var1 ^ 86632183477039L;
      long var9 = var1 ^ 44393368254754L;
      long var11 = (var1 ^ 3551597408059L) >>> 32;
      int var13 = (int)((var1 ^ 3551597408059L) << 32 >>> 32);
      long var10001 = var1 ^ 24392642325639L;
      int var14 = (int)((var1 ^ 24392642325639L) >>> 48);
      int var15 = (int)((var1 ^ 24392642325639L) << 16 >>> 32);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 16938929239119L;
      long var19 = var1 ^ 78505293521061L;
      IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$e02afe47f8c7c868(var5);
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$23b7a4862040234a(var9);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$1f477fcb7bb1ab20(var19);
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$7b48a25a20f0e078(var11, var13);
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$2c8ccd763a7b4e63((short)var14, var15, (short)var16);
      llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$cb2dfd28df56eb63(var3);
      lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$01c604c8f198160e(var7);
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl$recovered$fee565c40175ac7c(var17);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$eaa07d6410daac9a(
      @NotNull Vec3 fromArg, @NotNull Vec3 toArg, long argument3Arg, boolean argument4Arg, double argument5Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$da06866590b69619(long var1) {
      var1 = 6535729941353L;
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 85646998952999L;
      long var5 = var1 ^ 63434813053181L;
      this.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII$recovered$b36a18c65ce831a5(var5);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$342cb48b9693181a("jump", var3, false);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c34e732c7db4ef85(
      int param1, @NotNull Vec3 param2, byte param3, boolean param4, int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d9a4b530856de591(
      int argument1Arg, @NotNull Vec3 toArg, byte argument3Arg, boolean argument4Arg, int argument5Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$83f616c0079ff6ed(
      MovementUtils param0, boolean param1, short param2, char param3, int param4, Object param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7f64255e04e127f9(
      int param1, @NotNull Vec3 param2, byte param3, boolean param4, int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$e3c52a1d16a612b9(
      MovementUtils var0, Vec3 var1, Vec3 var2, boolean var3, double var4, short var6, int var7, Object var8, short var9, int var10
   ) {
      var3 = 1;
      byte var18 = 8;
      long var11 = ((long)var6 << 48 | (long)var9 << 48 >>> 16 | (long)var10 << 32 >>> 32)
         ^ IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      long var13 = var11 ^ 2398009600432L;
      int var15 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7313808190715549588L, var11
      );

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var18;
               if (var15 == 0) {
                  break label25;
               }

               if ((var18 & 4) == 0) {
                  break label24;
               }
            } catch (MatchException var16) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var16, 7334374141618375325L, var11
               );
            }

            var3 = 1;
         }

         var10000 = var18 & 8;
      }

      if (var10000 != 0) {
         var4 = 0.3;
      }

      var0.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var2, var13, (boolean)var3, var4);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$460fce1ffc45df03(
      int argument1Arg, @NotNull Vec3 toArg, byte argument3Arg, boolean argument4Arg, int argument5Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final Vec3 IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$0f7001897efeecd2(
      short param1, long param2, boolean param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7e61357f0718ba81(
      long param0, MovementUtils param2, Vec3 param3, boolean param4, short param5, int param6, Object param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI$recovered$c6b70b1b08a218cd(long var1) {
      var1 = 55435854551977L;
      var1 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ var1;
      long var3 = var1 ^ 123020302513634L;
      long var5 = var1 ^ 13319391066554L;
      long var7 = var1 ^ 29557443110493L;
      long var9 = var1 ^ 125955329392450L;
      long var11 = var1 ^ 115962496646391L;
      long var13 = var1 ^ 67491709550661L;
      long var15 = var1 ^ 73599859624942L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI$recovered$a3633deeb771d454(var11);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI$recovered$a3633deeb771d454(var11);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$217b9bd69c30e6cc(var5, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$442a287f106db578(var9, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll$recovered$449ccef39c64bc36(var13, false);
      me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$12685fa43b93fb59(false, var3);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl$recovered$965bb352d7d8653b(var15);
      GhostMacro.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl$recovered$c8607e0a24bfc0e0(var7);
   }
}
