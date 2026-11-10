package me.octo.client.gui;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll {
   @NotNull
   public static llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl ed;
   @NotNull
   private static Regex IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Regex lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Regex IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Regex IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 133359615515999L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

   public llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll(
      @NotNull lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl edArg
   ) {
      long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 134423246343822L;
      Intrinsics.checkNotNullParameter(edArg, "ed");
      super();
      this.ed = edArg;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, float param3, long param4, float param6, float param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, long param3, float param5, float param6, float param7, int param8, int param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, @NotNull String param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Color IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int param1, byte param2, boolean param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, String var3) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var4 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7870559140373457903L, var1
      );

      MatchResult var15;
      label34: {
         Object var10001;
         label29: {
            try {
               var10000 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
               var10001 = var3;
               if (var4 != null) {
                  break label29;
               }

               var15 = Regex.find$default(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, var3, 0, 2, null);
               if (var15 != null) {
                  break label34;
               }
            } catch (MatchException var11) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var11, 7889414206924591730L, var1
               );
            }

            try {
               var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
               var10001 = var3;
            } catch (MatchException var10) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var10, 7889414206924591730L, var1
               );
            }
         }

         var15 = Regex.find$default(var10000, (CharSequence)var10001, 0, 2, null);
         if (var15 != null) {
            MatchResult var13 = var15;
            boolean var14 = false;
            return StringsKt.trim((String & CharSequence)var13.getGroupValues().get(1)).toString();
         }

         return null;
      }

      MatchResult var5 = var15;
      boolean var6 = false;
      CharSequence var7 = (CharSequence)var5.getGroupValues().get(1);
      Regex var8 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      String var9 = " ";
      return StringsKt.trim(var8.replace(var7, var9)).toString();
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull String var1, long var2) {
      var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var2;
      long var4 = var2 ^ 12300541471626L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1704604455708561777L, var2
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(16491, 379174029642299553L ^ var2)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var6 = var10000;
      Iterator var15 = this.ed.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl().iterator();
      Intrinsics.checkNotNullExpressionValue(
         var15, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(23589, 5076434134183339249L ^ var2)
      );
      Iterator var7 = var15;

      label28:
      while (var7.hasNext()) {
         var10000 = (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])var7.next();
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(3428, 5512055544804390324L ^ var2)
         );
         StringBuilder var8 = (StringBuilder)var10000;
         Regex var17 = lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
         String var10001 = var8.toString();
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(11223, 1057491066806833935L ^ var2)
         );
         Iterator var9 = Regex.findAll$default(var17, var10001, 0, 2, null).iterator();

         while (true) {
            Iterator var18 = var9;

            do {
               if (!var18.hasNext()) {
                  continue label28;
               }

               var18 = var9;
            } while (var6 != null);

            MatchResult var10 = (MatchResult)var9.next();
            if (Intrinsics.areEqual(var10.getGroupValues().get(1), var1)) {
               String var11 = lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl((String)var10.getGroupValues().get(2), var4);
               if (var11 != null) {
                  boolean var13 = false;
                  return var11;
               }
            }
         }
      }

      return null;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Pair llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, byte param2, int param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(ArrayDeque param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final Integer llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull String param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      String param1, char param2, int param3, int param4, short param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      @NotNull String var1, short var2, int var3, char var4
   ) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      long var10001 = var5 ^ 7198343886211L;
      int var7 = (int)((var5 ^ 7198343886211L) >>> 48);
      int var8 = (int)((var5 ^ 7198343886211L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(18519, 9142408675118458039L ^ var5)
      );
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4350049993117383305L, var5
      );
      Iterator var43 = this.ed.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl().iterator();
      Intrinsics.checkNotNullExpressionValue(
         var43, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(15947, 9099529682505257644L ^ var5)
      );
      Iterator var11 = var43;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10 = var10000;

      label93:
      while (var11.hasNext()) {
         var10000 = (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])var11.next();
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(25472, 7296509928105611080L ^ var5)
         );

         while (true) {
            StringBuilder var12 = (StringBuilder)var10000;
            Regex var36 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            String var44 = var12.toString();
            Intrinsics.checkNotNullExpressionValue(
               var44, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(28257, 7563904404241875586L ^ var5)
            );
            Iterator var13 = Regex.findAll$default(var36, var44, 0, 2, null).iterator();

            while (true) {
               if (!var13.hasNext()) {
                  continue label93;
               }

               MatchResult var14 = (MatchResult)var13.next();
               var10000 = (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[])var14.getGroupValues()
                  .get(2);
               if (var10 != null) {
                  break;
               }

               CharSequence var16 = (CharSequence)var10000;

               label68: {
                  label97: {
                     try {
                        if (!StringsKt.isBlank(var16)) {
                           break label97;
                        }
                     } catch (MatchException var25) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var25, -4331188329764832022L, var5
                        );
                     }

                     boolean var17 = false;
                     CharSequence var18 = (CharSequence)var14.getGroupValues().get(3);

                     label60: {
                        label59: {
                           try {
                              if (StringsKt.isBlank(var18)) {
                                 break label59;
                              }
                           } catch (MatchException var24) {
                              throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                 var24, -4331188329764832022L, var5
                              );
                           }

                           var10000 = var18;
                           break label60;
                        }

                        boolean var19 = false;
                        var10000 = (String)var14.getGroupValues().get(4);
                     }

                     var10000 = (String)var10000;
                     break label68;
                  }

                  var10000 = var16;
               }

               String var15 = (String)var10000;
               CharSequence var39 = var15;
               char[] var29 = new char[]{','};
               List var30 = StringsKt.split$default(var39, var29, false, 0, 6, null);
               boolean var32 = false;
               int var33 = 0;
               Iterator var20 = var30.iterator();

               while (true) {
                  if (!var20.hasNext()) {
                     var42 = -1;
                     break;
                  }

                  Object var21 = var20.next();
                  var10000 = var10;
                  String var22 = (String)var21;
                  boolean var23 = false;

                  try {
                     if (var10000 != null) {
                        continue;
                     }

                     var41 = StringsKt.trim(var22).toString();
                  } catch (MatchException var26) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var26, -4331188329764832022L, var5
                     );
                  }

                  try {
                     if (Intrinsics.areEqual(var41, var1)) {
                        var42 = var33;
                        break;
                     }
                  } catch (MatchException var27) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var27, -4331188329764832022L, var5
                     );
                  }

                  var33++;
               }

               int var28 = var42;
               if (var28 >= 0) {
                  String var31 = lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (String)var14.getGroupValues().get(1), (short)var7, var28, var8, (char)var9
                     );
                  if (var31 != null) {
                     boolean var34 = false;
                     return var31;
                  }
               }
            }
         }
      }

      return null;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull List var3) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var4 = var1 ^ 18941739145150L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(19082, 782395246408670755L ^ var1)
      );
      this.ed.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3, var4);
      this.ed.IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(true);
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      this.ed.lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(false);
   }

   @Nullable
   public final Triple IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 37735494397223L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[41];
      int var5 = 0;
      String var4 = "Ä\u0013\u0015ú@Í\u0095|o\u0005?b\u009bå\u0018\u000f0\u009c=\u0003f\\y\u0083Ûÿe4ËØ\fV(Pb`¹*o÷®£ËJXüU\u001eq*«¦\u001bôE\u001d×\u0094\u0002J«÷:9*s\u0096\r\u008e\u0016ÿ¶)\u0010¼\u009a§Õ\u0081²\bÞH\u009fkàN\u001c\u0003\u0011 o»¹\u008f ¨¬ï\u001c\u0098ÒBl¨x\u009fu=þ`\"B\u008e\u0014ZTð,©$ôe\u0018Ù£9À\u001aÜ4\u0091nÂ?¤\u0013 ö\u0092éÌó\r¹Ï^±\u0010úÌ]» ¤`\u0090+Â|ú¨\u0007wðH\u0013æÓG\u009cEÜ\u0094\u0087^-\b{#\u0015Åâ!\u008d2QønÛnë¹%;12$\u0016\u0096\u008a¹0Ï6<êþ\u0000¼1\u0097\u0083Dòý<\u0083)ø\u009aÕ0Jý,ÚôÕ\u0001\u001cûÌâ\u008cÕq#\u0010¢ü^f¸>MÙ¢ígèÑ\u008bç\u000f zcÒe\u008e»°:Ç\u00065óEa\u0083\u0089µ@zç\u0083êÜ\u0080\"A¢î\u001eñ¶) k'Û\u001aò\u009f\u0007q\u008cZ£o\u0014\u008b\u0090ß÷0õÍâ´8êvH\u0000æÛy:}\u0010f\u000f\u0093ß%éó\u001a\u0092Í:t\n\u0017\u001c\r\u0010ï2¬Ú\u0011#Gøâð\u0087\u008b\u001c\u0002Tå\u0010©\u00970§`/3³\rû\u0091\u00879÷\u0080ù\u0010+  Èx\u009b\u0019\u0096.})ÖúÇD\b\u0010jÔ¤\u0091É\u0096y\u009dÔil\u0093¬ì£Å\u0010°øÙk\fmVË\u001b\u009d\u0010\u009a+¦¶X\u0010dìýÇ¸\"\u0097¢U¦ÅG«Ò0\u0003\u0018wz_÷\u008a\u0015ôÈ/\u0000\u009f³§\u0082.s«³¢.\u0089\u0094'Ø ¨§ÝiÁ !\u0096e\u0019Ë\u0084·¬:°/¸\u001c\u0094É\u0015:1\u0004N\u0094»\u0019\u0015i>\u0010v\u0086·@&JÚ\u008b\u0093¯o\u009d\u0006\u000fxF\u0010y\u0091uGIlW\u009f>ªp5e\u0089ø-\u0018;\u00adä\u0013?\u0013½ËM\u001d,/\u0002÷P\u001d+¹ë\u001fârO\u009f\u0018g\u0089äbë\u009axüEu<\u0010W{ñâÈø<~yé:é\u0010o\u0001 éµscãÈÝj\u009e\u0086Nä§\u0010\u0018S¨\u001fD¥æáO\u008f\u0005¿:\u00admò\u0018ó¤nÖ«M'\u0089\u0013\rÀá¿$Mùé M¶È¸(H û\u008b\u001eÆSÞ\u008aw\u0088°ý\rT\u008f\u0087X+>\u000eÿ~\u0018ôÌkÒ*\rõº\u0090\u0010\u0010»\u0082\u0096óß\u0007Põüú\u0005\u008a¶M\u0006Í\u00103\u0017\u0092`°-\u0017âA@\u0012À\báB\u0080 ©úF\u0091\u007f²zÎ¹bô\u008eÒN\u0001ÆÉUu\u008b-f\u0094\u0007\u001e\u0014Ê\r:\u0086\u0001£ Åb\u0080fI.:\u001c¥7.\u008fCþ¸\u0000\u009eäÜl\u000b\u0094Øÿ\u0016HCÚU3BÉ\u0010ª\n³2U\u00064\u007f~êÊ¨\u00178ä\\\u0010\u0088R\u0014\u0011\u0016âÃ\u000fÛé\u0089»{\u001cAéH\u0011^io»ïIrqWg6<zý*¢\nW\\&W4Í\u0004º\u0016q¶P*â#\u000f\u0093F\tÒóãâ)t\u0010°¤\f§-¦\u0089Wº\u0088F\u0089Ë£ñ2qÐaX#b/åZ{t«\u0010\rSïæ%Ú\u0085p \u0013{ÞRÅ)\u0095\u0018\u000f\u000f*°t7\u0097ÜÿËµi\u0005\u0087Ga<R\u0096>\f\u0097ë\" \\ëÒSÂÁ\u009e\u001bWpmB\u009e\u0095S\nG\u0014r\u0017\u00ad\u0098w{XQf¨SPs\u0080\u0090$»«L0»6Ç|gÞ»è\u0093\u0087@A\u008a+´\u009d&\u0086[ès¡/\u0085ËO\u0007+\u007fä\u0099þ\u000f\u0015û|\u0015_/æ.ý>mIí«É*\u0097L\u00adÇ\u0091äIB\u000fb¡=\u0011T\"Pïò=À\u0088ô9L2 =\u000f´±\u0007Ä£{Ý+\u0091\u0089\u0090¥\u001cgº\u009fú(3ªáß\u000eÊ¯Ä\u0085i¾Ø\u00adÊÏÍsÕ\u0089éöVÐ®Ìé\u0017ù£©îo\u009d¥\u0018\u00adÓÏ\u007f9*\u0092¥à8\u001ahSÖ½ÞÚÁ'²¨`î¯\u0004¦Ý\bß\u00983Ñ\u009c¯¯\u0080\u0005|6l\u0086¿Ä~£1\r\n\u0087ÿYö×8<ª+ÈD/Û>÷\u0086¤¼";
      int var6 = "Ä\u0013\u0015ú@Í\u0095|o\u0005?b\u009bå\u0018\u000f0\u009c=\u0003f\\y\u0083Ûÿe4ËØ\fV(Pb`¹*o÷®£ËJXüU\u001eq*«¦\u001bôE\u001d×\u0094\u0002J«÷:9*s\u0096\r\u008e\u0016ÿ¶)\u0010¼\u009a§Õ\u0081²\bÞH\u009fkàN\u001c\u0003\u0011 o»¹\u008f ¨¬ï\u001c\u0098ÒBl¨x\u009fu=þ`\"B\u008e\u0014ZTð,©$ôe\u0018Ù£9À\u001aÜ4\u0091nÂ?¤\u0013 ö\u0092éÌó\r¹Ï^±\u0010úÌ]» ¤`\u0090+Â|ú¨\u0007wðH\u0013æÓG\u009cEÜ\u0094\u0087^-\b{#\u0015Åâ!\u008d2QønÛnë¹%;12$\u0016\u0096\u008a¹0Ï6<êþ\u0000¼1\u0097\u0083Dòý<\u0083)ø\u009aÕ0Jý,ÚôÕ\u0001\u001cûÌâ\u008cÕq#\u0010¢ü^f¸>MÙ¢ígèÑ\u008bç\u000f zcÒe\u008e»°:Ç\u00065óEa\u0083\u0089µ@zç\u0083êÜ\u0080\"A¢î\u001eñ¶) k'Û\u001aò\u009f\u0007q\u008cZ£o\u0014\u008b\u0090ß÷0õÍâ´8êvH\u0000æÛy:}\u0010f\u000f\u0093ß%éó\u001a\u0092Í:t\n\u0017\u001c\r\u0010ï2¬Ú\u0011#Gøâð\u0087\u008b\u001c\u0002Tå\u0010©\u00970§`/3³\rû\u0091\u00879÷\u0080ù\u0010+  Èx\u009b\u0019\u0096.})ÖúÇD\b\u0010jÔ¤\u0091É\u0096y\u009dÔil\u0093¬ì£Å\u0010°øÙk\fmVË\u001b\u009d\u0010\u009a+¦¶X\u0010dìýÇ¸\"\u0097¢U¦ÅG«Ò0\u0003\u0018wz_÷\u008a\u0015ôÈ/\u0000\u009f³§\u0082.s«³¢.\u0089\u0094'Ø ¨§ÝiÁ !\u0096e\u0019Ë\u0084·¬:°/¸\u001c\u0094É\u0015:1\u0004N\u0094»\u0019\u0015i>\u0010v\u0086·@&JÚ\u008b\u0093¯o\u009d\u0006\u000fxF\u0010y\u0091uGIlW\u009f>ªp5e\u0089ø-\u0018;\u00adä\u0013?\u0013½ËM\u001d,/\u0002÷P\u001d+¹ë\u001fârO\u009f\u0018g\u0089äbë\u009axüEu<\u0010W{ñâÈø<~yé:é\u0010o\u0001 éµscãÈÝj\u009e\u0086Nä§\u0010\u0018S¨\u001fD¥æáO\u008f\u0005¿:\u00admò\u0018ó¤nÖ«M'\u0089\u0013\rÀá¿$Mùé M¶È¸(H û\u008b\u001eÆSÞ\u008aw\u0088°ý\rT\u008f\u0087X+>\u000eÿ~\u0018ôÌkÒ*\rõº\u0090\u0010\u0010»\u0082\u0096óß\u0007Põüú\u0005\u008a¶M\u0006Í\u00103\u0017\u0092`°-\u0017âA@\u0012À\báB\u0080 ©úF\u0091\u007f²zÎ¹bô\u008eÒN\u0001ÆÉUu\u008b-f\u0094\u0007\u001e\u0014Ê\r:\u0086\u0001£ Åb\u0080fI.:\u001c¥7.\u008fCþ¸\u0000\u009eäÜl\u000b\u0094Øÿ\u0016HCÚU3BÉ\u0010ª\n³2U\u00064\u007f~êÊ¨\u00178ä\\\u0010\u0088R\u0014\u0011\u0016âÃ\u000fÛé\u0089»{\u001cAéH\u0011^io»ïIrqWg6<zý*¢\nW\\&W4Í\u0004º\u0016q¶P*â#\u000f\u0093F\tÒóãâ)t\u0010°¤\f§-¦\u0089Wº\u0088F\u0089Ë£ñ2qÐaX#b/åZ{t«\u0010\rSïæ%Ú\u0085p \u0013{ÞRÅ)\u0095\u0018\u000f\u000f*°t7\u0097ÜÿËµi\u0005\u0087Ga<R\u0096>\f\u0097ë\" \\ëÒSÂÁ\u009e\u001bWpmB\u009e\u0095S\nG\u0014r\u0017\u00ad\u0098w{XQf¨SPs\u0080\u0090$»«L0»6Ç|gÞ»è\u0093\u0087@A\u008a+´\u009d&\u0086[ès¡/\u0085ËO\u0007+\u007fä\u0099þ\u000f\u0015û|\u0015_/æ.ý>mIí«É*\u0097L\u00adÇ\u0091äIB\u000fb¡=\u0011T\"Pïò=À\u0088ô9L2 =\u000f´±\u0007Ä£{Ý+\u0091\u0089\u0090¥\u001cgº\u009fú(3ªáß\u000eÊ¯Ä\u0085i¾Ø\u00adÊÏÍsÕ\u0089éöVÐ®Ìé\u0017ù£©îo\u009d¥\u0018\u00adÓÏ\u007f9*\u0092¥à8\u001ahSÖ½ÞÚÁ'²¨`î¯\u0004¦Ý\bß\u00983Ñ\u009c¯¯\u0080\u0005|6l\u0086¿Ä~£1\r\n\u0087ÿYö×8<ª+ÈD/Û>÷\u0086¤¼"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var21;
         if ((var2 += var3) >= var6) {
            var4 = "üØu\u0098mTþ\u0086\u001c\u0085/yÂ\u0013&G\u0015w\u0086¬Ï@ªV\u0010\u0001\bè\u009f\u001b«k$£\u0080.¢\u0080@Ã«";
            var6 = "üØu\u0098mTþ\u0086\u001c\u0085/yÂ\u0013&G\u0015w\u0086¬Ï@ªV\u0010\u0001\bè\u009f\u001b«k$£\u0080.¢\u0080@Ã«".length();
            var3 = '\u0018';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var7[var5++] = var23;
               if ((var2 += var3) >= var6) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[41];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Regex(
                     "(?<![\\w.])on\\s*\\(\\s*[\"'`](\\w+)[\"'`]\\s*,\\s*(?:function\\b[^(]*\\(([^)]*)\\)|\\(([^)]*)\\)|(\\w+)\\s*=>)"
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Regex(
                     "\\bfunction\\s+([A-Za-z_$][\\w$]*)\\s*\\(([^)]*)\\)"
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Regex("^(?:async\\s+)?\\(([^)]*)\\)\\s*=>");
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Regex("^(?:async\\s+)?([A-Za-z_$][\\w$]*)\\s*=>");
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex("\\s+");
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11403;
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
            throw new RuntimeException("me/octo/client/gui/llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll", var10);
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
            "me/octo/client/gui/llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final String method;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 1885721613763L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(@NotNull String methodArg, int argument2Arg) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 94573797273111L;
         Intrinsics.checkNotNullParameter(methodArg, "method");
         super();
         this.method = methodArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
      }

      @NotNull
      public final String getMethod() {
         return this.method;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, long var2, int var4
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(27096, 4829433539261946324L ^ var2)
         );
         return new llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 5086348841154L;
         return "StringArg(method="
            + this.method
            + ", valueStart="
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.method.hashCode();
         return var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 23376248391802L;
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
         String var6 = "~Â¤P·\u0001&¹¨dª.k¤©<(\u0093¢\u008a×åÐ,ç \u0010hvzþ¹\u008dXñ\u0006°\u0016\u0085O\u0094_ßj\u0019_SË'3[K<\u0012'\u0094Á";
         int var8 = "~Â¤P·\u0001&¹¨dª.k¤©<(\u0093¢\u008a×åÐ,ç \u0010hvzþ¹\u008dXñ\u0006°\u0016\u0085O\u0094_ßj\u0019_SË'3[K<\u0012'\u0094Á".length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "ØÄ\u000eë`\bièù¿\u0016Æýéï\u009c \u008cT)\u001fs+t\u0000LÛJä½Ág\u0011\u0091¦ßÖ\u0088Ii\u0012±e\u0018£{d\n¡";
               var8 = "ØÄ\u000eë`\bièù¿\u0016Æýéï\u009c \u008cT)\u001fs+t\u0000LÛJä½Ág\u0011\u0091¦ßÖ\u0088Ii\u0012±e\u0018£{d\n¡".length();
               var5 = '\u0010';
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 23285;
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
                  "me/octo/client/gui/llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
               "me/octo/client/gui/llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
