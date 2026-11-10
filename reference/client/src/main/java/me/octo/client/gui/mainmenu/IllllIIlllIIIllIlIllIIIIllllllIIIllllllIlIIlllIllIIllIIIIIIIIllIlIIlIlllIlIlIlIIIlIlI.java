package me.octo.client.gui.mainmenu;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.components.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
import me.octo.client.utils.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.utils.render.colors.Color;
import me.octo.client.utils.render.shapes.NVGRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   extends llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   @NotNull
   private final Function0<Unit> onDone;
   @NotNull
   private volatile IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @Nullable
   private volatile String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private volatile String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private volatile boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private me.octo.client.gui.components.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @Nullable
   private me.octo.client.gui.components.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 57407993805640L;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static Map IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap(13);
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;

   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull Function0<Unit> onDoneArg) {
      long var2 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 30673901112882L;
      long var4 = var2 ^ 134408512986995L;
      long var6 = var2 ^ 53636821242671L;
      long var8 = var2 ^ 135677669923672L;
      long var10 = var2 ^ 73104824077434L;
      Intrinsics.checkNotNullParameter(onDoneArg, "onDone");
      super();
      this.onDone = onDoneArg;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.REQUESTING;
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7a00395233c3d710(
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            var6,
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
         );
   }

   @Nullable
   @Override
   public Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, float param3, float param4, float param5, short param6, float param7, float param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String var1, float var2, float var3, float var4, Color var5
   ) {
      float var6 = NVGRenderer.textWidth(var1, var4, NVGRenderer.defaultFont);
      NVGRenderer.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2 - var6 / 2, var3, var4, var5, null, 32, null);
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, short param3, char param4, float param5, float param6, int param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, int param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1, long var2
   ) {
      long var4 = ((long)var0 << 48 | var2 << 16 >>> 16) ^ lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      long var6 = var4 ^ 76260370361299L;
      var1.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var6);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2, String var3
   ) {
      var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var0;
      long var4 = var0 ^ 29802666060930L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(4844, 2092610750911260224L ^ var0)
      );
      var2.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
      var2.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.WAITING;
      me.octo.client.utils.client.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      long var1,
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3
   ) {
      var1 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var1;
      int var4 = (int)((var1 ^ 1753873805776L) >>> 48);
      long var5 = (var1 ^ 1753873805776L) << 16 >>> 16;
      long var7 = var1 ^ 86261163572090L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(3198, 4951178333107088330L ^ var1)
      );
      var0.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.SUCCESS;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI,
            IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            var7
         );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long argument1Arg, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI argument2Arg, Throwable eArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0
   ) {
      return var0.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0, long var1
   ) {
      var1 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var1;
      long var3 = var1 ^ 111931259304223L;
      if (var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
         String var5 = var0.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var6 = false;
         me.octo.client.utils.client.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var3);
      }

      return Unit.INSTANCE;
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long var0, IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var2
   ) {
      var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var0;
      long var3 = var0 ^ 23920544927379L;
      var2.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = true;
      var2.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.CANCELLED;
      var2.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3);
      return Unit.INSTANCE;
   }

   static {
      long var5 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 94836325736194L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[18];
      int var12 = 0;
      String var11 = "/3\u0087¬é\u0089hït«Í\u0010½ ½ß\u00108Ã\u0007D1Ø\u0099\u0012T\u0014å7\t\u0012¥\u0091(¸{4\u0087Ãá\u0094¤C\u001c©ÓÝ\u0087|yzn.J\u0011\u008fWw¬è\u009aþW´B\u008dHó\u001d=\u008e\u0014ÂTH\u0080\u0012ÈTÙ\u0014E\u0081\u0090þ\u0090û\u0099 ^a*ëõ8\u0091&£\u0018²^1ij2Ä\u0082pº\u0013Fó\u0018Z\u0017ÝµH\"Ù£D\u0087U\u008dÉ\fxÓH\u007f80hg\u009a2wkm+\u0012~a_1G\u0018\u0015ç\u0002\u0014X\u0017(ò\u0017(¼çø¡ÐÔÖ§u\u0000,>·óPZR>UÑÔÙQ\nÖ§¦\u0091\u009dÜ7ûb×$.R&\u0098\u00ad^à¶´RÝ.Ôè+~â\u009b3ÅrðE¥\u0095\u0099ê·^v\u008f\u009aàÝQ.8\u008d^\f\u008f\u000e\u0000±!\u0091¿)]é°¤¹\u0085Õ^\u0091Gñ\u0018 °\b2¹\u0000\u001a6aúU\u0093\u0090]®u\u0084§\u001c+@ÔÉª+ÛFý¥ú\u001aÇ°\u0010éãvÝþñ\u0012møÖ²Mi24\u008c\u0018\u008cÙ\u008f5Q¿\u0090í9\u000fb\u00106\u009a\u000f\u009a\u0098\u0096L\u0000Ý\u008fÇî8\u0089\u001b\u00825A,³\fu\u009e1\u0095Ë«\r'úZð¬&È\u0083\u009bÍ~8\u0017ÿÚ±¸\u0089UûýF\u0095^Ó\u008eçk\u000699\u0088\u0099¤\u0014¶)=éÛ=(*\u0091¥²ù¶\u0014ó\u0007yîÆ<Â¯``\u0015Å³/\u00ad\u0002\u0004Öá§\u0094£\u0084Tk\u0018&\u00155ù\u001b½\u0099Ġ\u009f7¿\u0083\u009b\u000b[\u0099\u0000Q5Ùúl5\u009f\u0099\u0017\u008d8ÏDÆ}¿óæÕi-\u009eús©µW0º½\u00004HàuÊ\u000e\u0018\u001e°ã\u0091\u0005\u009d¥\u0095\u009d©ù\u0014º\u009avñÅ\u0019\u0090Ë»{´+\u0080:î\n\u008e\n]äfRVÒ\u00980\u008fÂ«åÛÍ¾¨õî)«S7m=\u0083Æ?>÷Ê`ï²Æ\u0092IJæ\u0000Ü\u0098|{â\u001bÉ\u0010òxË'½H\u009a&\b\f\u0013-l\u0090\u0007ç»®§\u0019{\u009f,Mí\u0000¸\u0083é\u0097÷\u000b\u0013\\M@¿\u0013ð\u0095)·¢Î º-éµ4= º\u008aù cÌÉ!æÙ4Ý\u0018\r+îóÞW;\tá\u0088¸u\u008d<ØG©Ç)\u0002^u´wÈ§ºõZ¾\u0010Ä\u0096L\u001f¹7\u007f\u0085ö¿\bc>G<gýFüÑèÿ©ßB)t\u000evKni\u008b\u008ac6\u0089O\u001b\u0007\u0083\u0080ñý\b9O;ißE£\u0089Ú¯[\u0017ëÆ\u0090£À|\u0091zF«õ8@çT\u0002Ð\u001a\u0099S\u0092²và\u0019wô\u008a³3f>Ì#mNpËº§u×\nQ\u0086\u008a¹³q\fÖ>4\u00869\u0098ÃgsÛ]o1`ê¤\nôX\u001brÖ\u0084ß\u008cJÒ\u0007Ã\\\u0005v\u009dã\"³#1\u0097\u0003\u0014Ô^á~\u0016\u0095S¬ú\u0097\u0018ã@\u00124VHdf*Kíïò´\u0092`\u0004Ö,7m¸\u0011î\u008dGK%\u0094|iÏ;¥!+îCB¡p\u0016L©û1Ç|\u001c«\u0016\u0094²è\u001c0d\u0096#åëkQÇ\u0090¾:|ÞJx×t¤éK\u001euEê=ÕvÙ_Ò\u00894®4t²\u0085\u0010\u0087·s+¦öáSW* ®ÊÌc\b©¡B¦ÿpA\u0015;±4ÈÂ^\t½Æ\u00893´~qy\r¨&o";
      int var13 = "/3\u0087¬é\u0089hït«Í\u0010½ ½ß\u00108Ã\u0007D1Ø\u0099\u0012T\u0014å7\t\u0012¥\u0091(¸{4\u0087Ãá\u0094¤C\u001c©ÓÝ\u0087|yzn.J\u0011\u008fWw¬è\u009aþW´B\u008dHó\u001d=\u008e\u0014ÂTH\u0080\u0012ÈTÙ\u0014E\u0081\u0090þ\u0090û\u0099 ^a*ëõ8\u0091&£\u0018²^1ij2Ä\u0082pº\u0013Fó\u0018Z\u0017ÝµH\"Ù£D\u0087U\u008dÉ\fxÓH\u007f80hg\u009a2wkm+\u0012~a_1G\u0018\u0015ç\u0002\u0014X\u0017(ò\u0017(¼çø¡ÐÔÖ§u\u0000,>·óPZR>UÑÔÙQ\nÖ§¦\u0091\u009dÜ7ûb×$.R&\u0098\u00ad^à¶´RÝ.Ôè+~â\u009b3ÅrðE¥\u0095\u0099ê·^v\u008f\u009aàÝQ.8\u008d^\f\u008f\u000e\u0000±!\u0091¿)]é°¤¹\u0085Õ^\u0091Gñ\u0018 °\b2¹\u0000\u001a6aúU\u0093\u0090]®u\u0084§\u001c+@ÔÉª+ÛFý¥ú\u001aÇ°\u0010éãvÝþñ\u0012møÖ²Mi24\u008c\u0018\u008cÙ\u008f5Q¿\u0090í9\u000fb\u00106\u009a\u000f\u009a\u0098\u0096L\u0000Ý\u008fÇî8\u0089\u001b\u00825A,³\fu\u009e1\u0095Ë«\r'úZð¬&È\u0083\u009bÍ~8\u0017ÿÚ±¸\u0089UûýF\u0095^Ó\u008eçk\u000699\u0088\u0099¤\u0014¶)=éÛ=(*\u0091¥²ù¶\u0014ó\u0007yîÆ<Â¯``\u0015Å³/\u00ad\u0002\u0004Öá§\u0094£\u0084Tk\u0018&\u00155ù\u001b½\u0099Ġ\u009f7¿\u0083\u009b\u000b[\u0099\u0000Q5Ùúl5\u009f\u0099\u0017\u008d8ÏDÆ}¿óæÕi-\u009eús©µW0º½\u00004HàuÊ\u000e\u0018\u001e°ã\u0091\u0005\u009d¥\u0095\u009d©ù\u0014º\u009avñÅ\u0019\u0090Ë»{´+\u0080:î\n\u008e\n]äfRVÒ\u00980\u008fÂ«åÛÍ¾¨õî)«S7m=\u0083Æ?>÷Ê`ï²Æ\u0092IJæ\u0000Ü\u0098|{â\u001bÉ\u0010òxË'½H\u009a&\b\f\u0013-l\u0090\u0007ç»®§\u0019{\u009f,Mí\u0000¸\u0083é\u0097÷\u000b\u0013\\M@¿\u0013ð\u0095)·¢Î º-éµ4= º\u008aù cÌÉ!æÙ4Ý\u0018\r+îóÞW;\tá\u0088¸u\u008d<ØG©Ç)\u0002^u´wÈ§ºõZ¾\u0010Ä\u0096L\u001f¹7\u007f\u0085ö¿\bc>G<gýFüÑèÿ©ßB)t\u000evKni\u008b\u008ac6\u0089O\u001b\u0007\u0083\u0080ñý\b9O;ißE£\u0089Ú¯[\u0017ëÆ\u0090£À|\u0091zF«õ8@çT\u0002Ð\u001a\u0099S\u0092²và\u0019wô\u008a³3f>Ì#mNpËº§u×\nQ\u0086\u008a¹³q\fÖ>4\u00869\u0098ÃgsÛ]o1`ê¤\nôX\u001brÖ\u0084ß\u008cJÒ\u0007Ã\\\u0005v\u009dã\"³#1\u0097\u0003\u0014Ô^á~\u0016\u0095S¬ú\u0097\u0018ã@\u00124VHdf*Kíïò´\u0092`\u0004Ö,7m¸\u0011î\u008dGK%\u0094|iÏ;¥!+îCB¡p\u0016L©û1Ç|\u001c«\u0016\u0094²è\u001c0d\u0096#åëkQÇ\u0090¾:|ÞJx×t¤éK\u001euEê=ÕvÙ_Ò\u00894®4t²\u0085\u0010\u0087·s+¦öáSW* ®ÊÌc\b©¡B¦ÿpA\u0015;±4ÈÂ^\t½Æ\u00893´~qy\r¨&o"
         .length();
      char var10 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var28 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var28;
         if ((var9 += var10) >= var13) {
            var11 = "\\\u009e\u009foK+Zz\u001cÄê \u001c\u0000haŐEs<©æ\u008eªsWd$¾hKË\u0082\\Ï\u0081ÅÊ_\u0086\nØÓS¥\u009e\u0091Ü©õ\u0087Èw´ÂU}æý{iÐ\u008d\u0004ÎË3ü©`wÒzzøvD;\r¦f¾Ü\u0019\u0098\u000bA`\u0088ù\u0090\u001aJ`ËÝ6\u008f\u0089¹\u0088rß|*\u0085A÷\u0006\n\u009f¸\\\\!\"h\u009cä°×uØ\u009d\u009b\u008f\u0083\u0005\u008b~·A£@K±\u001bí\u000e\u0098\u0013\u009f\u0002U\u008c9\u0086\u009aéÛw\u009fÑÏösíÔyä\u000f¿\u0086\u008d\u008b-þ2h\bÜÎ\u0005C±¯\"\u0081\u0007\u0086n\u0004à7×=\u0018/\u0019\u0012¾cÚg\u0099Ù¬`\u0093\u0001í³`K©ycmwÌH§È°®\u00804lç©æûôarïì\bô\u0089íQ¿ÊÉ\u0019A;\u0094°_\u0084\u0002¡Ê;\u009f{\u0081A\u0001rÝç:B.S²\u0080£Asï± %Ã\u0095\u000e7\u0014¤\u009b\td\u009a\u0095«G½\u00840\u0083\téR¹\\\u000e\u0084)Ù\u0096CÁ¬}Ý\u0096\u009ajñ:·LóJBb£\u0007\f\u0003<\u00829H\u0098\u007fú(Db\u0018àõMc\u000f¡\tá\t\u000buuâN¢Cã\u001f×L\"ÖT{j2Ç®";
            var13 = "\\\u009e\u009foK+Zz\u001cÄê \u001c\u0000haŐEs<©æ\u008eªsWd$¾hKË\u0082\\Ï\u0081ÅÊ_\u0086\nØÓS¥\u009e\u0091Ü©õ\u0087Èw´ÂU}æý{iÐ\u008d\u0004ÎË3ü©`wÒzzøvD;\r¦f¾Ü\u0019\u0098\u000bA`\u0088ù\u0090\u001aJ`ËÝ6\u008f\u0089¹\u0088rß|*\u0085A÷\u0006\n\u009f¸\\\\!\"h\u009cä°×uØ\u009d\u009b\u008f\u0083\u0005\u008b~·A£@K±\u001bí\u000e\u0098\u0013\u009f\u0002U\u008c9\u0086\u009aéÛw\u009fÑÏösíÔyä\u000f¿\u0086\u008d\u008b-þ2h\bÜÎ\u0005C±¯\"\u0081\u0007\u0086n\u0004à7×=\u0018/\u0019\u0012¾cÚg\u0099Ù¬`\u0093\u0001í³`K©ycmwÌH§È°®\u00804lç©æûôarïì\bô\u0089íQ¿ÊÉ\u0019A;\u0094°_\u0084\u0002¡Ê;\u009f{\u0081A\u0001rÝç:B.S²\u0080£Asï± %Ã\u0095\u000e7\u0014¤\u009b\td\u009a\u0095«G½\u00840\u0083\téR¹\\\u000e\u0084)Ù\u0096CÁ¬}Ý\u0096\u009ajñ:·LóJBb£\u0007\f\u0003<\u00829H\u0098\u007fú(Db\u0018àõMc\u000f¡\tá\t\u000buuâN¢Cã\u001f×L\"ÖT{j2Ç®"
               .length();
            var10 = '\u0010';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var30 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var25 = 0;
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var14;
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new String[18];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8052691978522684698L;
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
                  long var33 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  var25 = -1;
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var33;
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9708;
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/mainmenu/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10
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
         byte[] var9 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5].getBytes("ISO-8859-1");
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5];
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
            "me/octo/client/gui/mainmenu/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      REQUESTING,
      WAITING,
      SUCCESS,
      ERROR,
      CANCELLED;

      @NotNull
      public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 59284279986972L ^ 53825199234445L;
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
         String var5 = "å°@Ê\u0099\t+e\u0010\u0005Öª5\u0081è# #\t\u0002\u000bÖð[\u0085\b\u0085`¨¡\u0016\u009bpÊ";
         int var7 = "å°@Ê\u0099\t+e\u0010\u0005Öª5\u0081è# #\t\u0002\u000bÖð[\u0085\b\u0085`¨¡\u0016\u009bpÊ".length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var21;
            if ((var3 += var4) >= var7) {
               var5 = "Å\b§Á½\u0001GX\u0010¸NR7Ùn\u008b\u0006\u0082\u007fæ¤óæCê";
               var7 = "Å\b§Á½\u0001GX\u0010¸NR7Ùn\u008b\u0006\u0082\u007fæ¤óæCê".length();
               var4 = '\b';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var19 = false;
                  var0[var6++] = var23;
                  if ((var3 += var4) >= var7) {
                     REQUESTING = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     WAITING = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     SUCCESS = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     ERROR = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     CANCELLED = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     );
                     return;
                  }

                  var4 = var5.charAt(var3);
               }
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
}
