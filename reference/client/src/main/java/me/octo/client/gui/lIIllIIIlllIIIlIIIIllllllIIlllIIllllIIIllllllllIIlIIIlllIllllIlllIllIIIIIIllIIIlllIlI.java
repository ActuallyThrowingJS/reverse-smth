package me.octo.client.gui;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.gui.clickgui.endgameGUI.ThemeColors;
import me.octo.client.modules.impl.features.GeneralModules;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.shapes.NVGRenderer;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI
   extends me.octo.client.gui.clickgui.endgameGUI.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   private final BlockPos targetPos;
   @NotNull
   private final me.octo.client.gui.clickgui.endgameGUI.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final List<me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 56942514022647L;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);

   public lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI(@NotNull BlockPos targetPosArg) {
      long var2 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 84386578358995L;
      Intrinsics.checkNotNullParameter(targetPosArg, "targetPos");
      super();
      this.targetPos = targetPosArg;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
      int var10000 = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 16.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 54.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 32.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 6.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 40.0F;
      int var4 = var10000;
      float var5 = 360.0F;
      float var6 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
         + 10.0F
         + this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
         + this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         + this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

      try {
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.endgameGUI.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl(
            var5, var6
         );
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = -1;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
         if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               ++var4
            );
         }
      } catch (MatchException var9) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9);
      }
   }

   private final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return (this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.size() + 1) / 2;
   }

   private final float IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            * this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         + RangesKt.coerceAtLeast(this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() - 1, 0)
            * this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor contextArg, int argument2Arg, int argument3Arg, float argument4Arg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, int var3, int var4) {
      long var5 = var1 ^ 85461006386515L;
      long var7 = var1 ^ 55590726208788L;
      long var9 = var1 ^ 37722628444L;
      NVGRenderer.rect(
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(),
         ThemeColors.INSTANCE
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.98F),
         14.0F
      );
      NVGRenderer.hollowRect(
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(),
         1.0F,
         ThemeColors.INSTANCE
            .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.6F),
         14.0F
      );
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var7, var3, var4);
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var3, var4, var5);
      this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3, var9, var4);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, int param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int param1, int param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, float var3, float var4, boolean var5, long var6, Function0 var8
   ) {
      label22: {
         var6 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var6;
         long var10001 = var6 ^ 78052508099675L;
         int var9 = (int)((var6 ^ 78052508099675L) >>> 32);
         int var10 = (int)((var6 ^ 78052508099675L) << 32 >>> 48);
         int var11 = (int)(var10001 << 48 >>> 48);
         long var12 = var6 ^ 13127259815718L;
         long var14 = var6 ^ 116522432251227L;
         long var16 = var6 ^ 66330089590892L;
         int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            6318743792815650942L, var6
         );
         boolean var19 = false;
         int var18 = var10000;
         if (var5) {
            float var20 = var1 + var3 / 2.0F;
            var10000 = var18;
            float var21 = var2 + var4 / 2.0F;

            try {
               NVGRenderer.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var12);
               NVGRenderer.INSTANCE
                  .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var9, var10, (short)var11, var20, var21);
               NVGRenderer.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(1.012F, var14, 1.012F);
               NVGRenderer.INSTANCE
                  .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var9, var10, (short)var11, -var20, -var21);
               var8.invoke();
               NVGRenderer.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var16);
               if (var10000 == 0) {
                  break label22;
               }
            } catch (MatchException var24) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var24, 6296281634346641894L, var6
               );
            }
         }

         try {
            var8.invoke();
         } catch (MatchException var23) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var23, 6296281634346641894L, var6
            );
         }
      }

      try {
         ;
      } catch (MatchException var22) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var22, 6296281634346641894L, var6
         );
      }
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      byte param1, double param2, int param4, double param5, int param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      int var9 = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = RangesKt.coerceIn(
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI - (int)var7, 0, var9
      );
      return true;
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, int param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0,
      short var1,
      int var2,
      lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI var3,
      boolean var4,
      int var5,
      long var6,
      GuiGraphicsExtractor var8,
      int var9
   ) {
      long var10 = ((long)var1 << 48 | var6 << 16 >>> 16) ^ IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      long var12 = var10 ^ 73862213281672L;
      long var10001 = var10 ^ 17291161597089L;
      int var14 = (int)((var10 ^ 17291161597089L) >>> 32);
      int var15 = (int)((var10 ^ 17291161597089L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var10 ^ 73343011647452L;
      long var19 = var10 ^ 35996450248097L;
      long var21 = var10 ^ 128742733250710L;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4086179638463387516L, var10
      );
      NVGRenderer.rect(
         0.0F,
         0.0F,
         var0,
         var2,
         ThemeColors.INSTANCE
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.5F),
         0.0F
      );
      NVGRenderer.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var17);
      float var24 = var0 / 2.0F;
      float var25 = var2 / 2.0F;
      int var23 = var10000;
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var14, var15, (short)var16, var24, var25);
      float var26 = GeneralModules.Companion
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            .IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl()
         * var3.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      NVGRenderer.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26, var19, var26);
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var14, var15, (short)var16, -var24, -var25);
      int var27 = 0;
      int var28 = 0;

      label33: {
         label32: {
            label37: {
               try {
                  var10000 = var4;
                  if (var23 != 0) {
                     break label32;
                  }

                  if (var4 == 0) {
                     break label37;
                  }
               } catch (MatchException var33) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var33, -4063747090050467556L, var10
                  );
               }

               var27 = (int)((float)var5 * var0 / var8.guiWidth());
               var10000 = var23;
               var28 = (int)((float)var9 * var2 / var8.guiHeight());

               try {
                  if (var10000 == 0) {
                     break label33;
                  }
               } catch (MatchException var32) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var32, -4063747090050467556L, var10
                  );
               }
            }

            try {
               var10000 = var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().getWindow().getGuiScale();
            } catch (MatchException var31) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var31, -4063747090050467556L, var10
               );
            }
         }

         int var29 = var10000;
         var27 = var5 * var29;
         var28 = var9 * var29;
      }

      int var36 = (int)(var24 + (var27 - var24) / var26);
      int var30 = (int)(var25 + (var28 - var25) / var26);
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var12, var36, var30);
      NVGRenderer.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var21);
      return Unit.INSTANCE;
   }

   static {
      long var0 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 4136087770917L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "\u0011×4|Zn¡\u0011`Ód\bI\u001c\t\u009c\u008fY?å<ÞþO}\u0095¥nü\u0091\u0095Õ (E\";Kúví\u0017\u001cv9eð2T%HôýñY½TÀÐ\u0003u`\u0006C¾ ¥u¶\u0091ýµ\u008e\u001fë\u0012ùÙ];z=éïÌéá¬>Ñ\u0091á\u0081:?ò|#@ÝÕ\n\u009cý)<Ñ\t,¼F8¢j0ÂÖ`¿Å\u0092Ãæ\u0011µè£r' `T;' ÄQ\u0003lDÉþª\u0011\r¦Ô\tÊÞ1øW\u0089Béff$Ò¾W\u0087à\u0096,tÄ\u0096?6\u0005XÛÄGavå\u0081d°º}~¬÷äÜ\u009a?\u0083â³k\u0005Þ\u001eÖ\u0005©\u00adMZlÂS¦}2.æÖ>oÐuDþ)=³¾3V\u0018¢wî2G\u001bø\u0017Ì'S{¬Db18V\u0013çÍ{\u0086\bf|}ô\u0002\u001a\u0001\u0081\rÌ\u0094à\u0085wxn\u001fR\u0014Á\f\u0007×\u001a$&~\u0091÷\u009ba4Í?ÙúT\u0000 °\u008a,L\u0005\u008f\bá\u008dUq\u009c\u001e\"E6¡ø¾xú+\u009b \u0016\u0016XÙËé\u0083\u0000\u0088\u001dÌ¼\\ßÌfÉ\u0081\u0016ÔÎâÌr¾¶äý~\u007f\u0088Ìû¬í,k\u000fö\"\u008e\\?x\u001d¾\u0099\u0014Ë?J¦\u0080\u0004lC:\u001d0¼X>\u0000S=*5¾ë=\u001d«\u0014\u001fH\u0010\u007f\u0097Ö¼{ÌÛ\u0080\u0017)Ö_éå\u000fè\u0010ï|e¤\u0004h¤!JRm}\u0098]ñÖ\u0010T¸+\u0086»\u0082¸\u0093Ú\u0011\u00808\u0018Q7\u009aĸw\\\u00ad\u0012½oP©\u009b \u009a#ý«è÷¿§ \u001eÕÁ\u0095\u0013\u001e§JÅÿ\u008a}·«²ýßs\u008c2t\u0019c>LU\u0089Çÿ¦Û\u0090\u009a\u009b\u001a\u008fø\u008b\u0096\u000e5p\u0099Y²Ë\u0081`Ò¸.ç+s\u008e\u001b\u0090\u0085õ&\u000f\u0087¨:\u0081.y¬ý\u009f¤ $!\u0085¢Ë]GR¢\u0098°\u0012'\u009b\u0016¦³:Õ³wï¤ð©©uÀ\u0010neP\u001e\tCÞ0Ú\u0019ºôØLlª×\u0001Z¹G¬2qss\u009b\u0094ÍùunY\u0001=ê\u0090ÕE#n¥¬\u000bGÐ\u0012jNo(86\u0088JOC>Ñæ!]C\u009b¦\u009b>\u0007\u0093ãË´êÐÕûÃ\u0011\brØ¸¾\u00ad>\u0012$C\u00844ÿæ\u0014¿K\u0097àèúvx¦\u0000jÌæn\u0003tÉ¶\u0095a|\u0083Ö¦\u008bÊÍ\u0089s\u0011\u008cv\u0080å\u0017¥ÕÊUF1i-Q\u0097¹'ý#1.>¿VÖ\f\u0092£}\u0093Âl \"ZÏº\u000b¡àÙ\u008c\u00063³\u0086Hh70\u00ad\u009dó\u008büâ²º\u001cÌqó\u001a¡\u0018%¤èÚ\u00104<\u0015Ì\u001c\u008b6ËØÝ9\u00adXç3+à\u0082d\u0086óV`\u008c\u0000Ôj9?ÌÆSö}xòN0C'Å\u0018dþh&¸&\rÎ\u001d\u0006\u0019rÕ\u001cÉ\u0014Ïÿ~Ú\u0081ì²äk°ú¨\u0085j°èÒ3>ð»\u0001Ó¿\u0018ÌÕ\u0084\u0005¸Ô\u008eáG\u00973ö\u008c²(öt\u009a\u0000Ýð:\u008dÑ\u001f¸j¾4\u009bÖEu(\u0015\u0005\u007fÓ\u0018\u0018ÃÚ\u008cÃäjûp\u0090àdVÑß\u007fi\u0000X½&µA®ûHJ|¬?\u0016\u0017ÃÂ\u0004é\u0081#Ì\u009d¤Ö½|È\t\u008d\u009f\u008d\u008e\u001bg\u0001¹\u008c\u001c\u008b_?X#GÆéÎ=\u0084ã\u0095@ÃùGøU¶á\u009b\u0095¦\u009c8Y©\u008c®4´\b. ò\u0000¾f\u00adNÍXÄM¦º\u0017Õð\u0096Ð\u0002\u0088l×hÓ:\rýàø\u0010¶ê1\u0018}\u0012Êö%»\u0082\u009f\u0092\u009c\u000eB Uurc³j2v\t\u0092`L÷#+6üD§ë\u0084\u0001ä¤Í>\u0000ÅÀ\u0013º\u0086";
      int var8 = "\u0011×4|Zn¡\u0011`Ód\bI\u001c\t\u009c\u008fY?å<ÞþO}\u0095¥nü\u0091\u0095Õ (E\";Kúví\u0017\u001cv9eð2T%HôýñY½TÀÐ\u0003u`\u0006C¾ ¥u¶\u0091ýµ\u008e\u001fë\u0012ùÙ];z=éïÌéá¬>Ñ\u0091á\u0081:?ò|#@ÝÕ\n\u009cý)<Ñ\t,¼F8¢j0ÂÖ`¿Å\u0092Ãæ\u0011µè£r' `T;' ÄQ\u0003lDÉþª\u0011\r¦Ô\tÊÞ1øW\u0089Béff$Ò¾W\u0087à\u0096,tÄ\u0096?6\u0005XÛÄGavå\u0081d°º}~¬÷äÜ\u009a?\u0083â³k\u0005Þ\u001eÖ\u0005©\u00adMZlÂS¦}2.æÖ>oÐuDþ)=³¾3V\u0018¢wî2G\u001bø\u0017Ì'S{¬Db18V\u0013çÍ{\u0086\bf|}ô\u0002\u001a\u0001\u0081\rÌ\u0094à\u0085wxn\u001fR\u0014Á\f\u0007×\u001a$&~\u0091÷\u009ba4Í?ÙúT\u0000 °\u008a,L\u0005\u008f\bá\u008dUq\u009c\u001e\"E6¡ø¾xú+\u009b \u0016\u0016XÙËé\u0083\u0000\u0088\u001dÌ¼\\ßÌfÉ\u0081\u0016ÔÎâÌr¾¶äý~\u007f\u0088Ìû¬í,k\u000fö\"\u008e\\?x\u001d¾\u0099\u0014Ë?J¦\u0080\u0004lC:\u001d0¼X>\u0000S=*5¾ë=\u001d«\u0014\u001fH\u0010\u007f\u0097Ö¼{ÌÛ\u0080\u0017)Ö_éå\u000fè\u0010ï|e¤\u0004h¤!JRm}\u0098]ñÖ\u0010T¸+\u0086»\u0082¸\u0093Ú\u0011\u00808\u0018Q7\u009aĸw\\\u00ad\u0012½oP©\u009b \u009a#ý«è÷¿§ \u001eÕÁ\u0095\u0013\u001e§JÅÿ\u008a}·«²ýßs\u008c2t\u0019c>LU\u0089Çÿ¦Û\u0090\u009a\u009b\u001a\u008fø\u008b\u0096\u000e5p\u0099Y²Ë\u0081`Ò¸.ç+s\u008e\u001b\u0090\u0085õ&\u000f\u0087¨:\u0081.y¬ý\u009f¤ $!\u0085¢Ë]GR¢\u0098°\u0012'\u009b\u0016¦³:Õ³wï¤ð©©uÀ\u0010neP\u001e\tCÞ0Ú\u0019ºôØLlª×\u0001Z¹G¬2qss\u009b\u0094ÍùunY\u0001=ê\u0090ÕE#n¥¬\u000bGÐ\u0012jNo(86\u0088JOC>Ñæ!]C\u009b¦\u009b>\u0007\u0093ãË´êÐÕûÃ\u0011\brØ¸¾\u00ad>\u0012$C\u00844ÿæ\u0014¿K\u0097àèúvx¦\u0000jÌæn\u0003tÉ¶\u0095a|\u0083Ö¦\u008bÊÍ\u0089s\u0011\u008cv\u0080å\u0017¥ÕÊUF1i-Q\u0097¹'ý#1.>¿VÖ\f\u0092£}\u0093Âl \"ZÏº\u000b¡àÙ\u008c\u00063³\u0086Hh70\u00ad\u009dó\u008büâ²º\u001cÌqó\u001a¡\u0018%¤èÚ\u00104<\u0015Ì\u001c\u008b6ËØÝ9\u00adXç3+à\u0082d\u0086óV`\u008c\u0000Ôj9?ÌÆSö}xòN0C'Å\u0018dþh&¸&\rÎ\u001d\u0006\u0019rÕ\u001cÉ\u0014Ïÿ~Ú\u0081ì²äk°ú¨\u0085j°èÒ3>ð»\u0001Ó¿\u0018ÌÕ\u0084\u0005¸Ô\u008eáG\u00973ö\u008c²(öt\u009a\u0000Ýð:\u008dÑ\u001f¸j¾4\u009bÖEu(\u0015\u0005\u007fÓ\u0018\u0018ÃÚ\u008cÃäjûp\u0090àdVÑß\u007fi\u0000X½&µA®ûHJ|¬?\u0016\u0017ÃÂ\u0004é\u0081#Ì\u009d¤Ö½|È\t\u008d\u009f\u008d\u008e\u001bg\u0001¹\u008c\u001c\u008b_?X#GÆéÎ=\u0084ã\u0095@ÃùGøU¶á\u009b\u0095¦\u009c8Y©\u008c®4´\b. ò\u0000¾f\u00adNÍXÄM¦º\u0017Õð\u0096Ð\u0002\u0088l×hÓ:\rýàø\u0010¶ê1\u0018}\u0012Êö%»\u0082\u009f\u0092\u009c\u000eB Uurc³j2v\t\u0092`L÷#+6üD§ë\u0084\u0001ä¤Í>\u0000ÅÀ\u0013º\u0086"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "EU¾\u0015Ì\u009eÆlk/$ÃA\u0086,¤(kËE\u0004ïíÅ¸:ª\u00158G{#ÀL\u008eáõ\u0081$÷g¢Û\u001eS\u008fkç &Á\u008bì®¹Øî";
            var8 = "EU¾\u0015Ì\u009eÆlk/$ÃA\u0086,¤(kËE\u0004ïíÅ¸:ª\u00158G{#ÀL\u008eáõ\u0081$÷g¢Û\u001eS\u008fkç &Á\u008bì®¹Øî".length();
            var5 = '\u0010';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var9;
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new String[15];
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

   private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27145;
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
            throw new RuntimeException("me/octo/client/gui/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI", var10);
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
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
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
      String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
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
            "me/octo/client/gui/lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }
}
