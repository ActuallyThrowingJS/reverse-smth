package me.octo.client.commands;

import java.io.File;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.features.misc.Replay;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

@llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
public final class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl
   implements IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 45707636610705L;
   private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

   @NotNull
   @Override
   public lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1
   ) {
      long var3 = var1 ^ 135834678789324L;
      long var5 = var1 ^ 14866956877945L;
      return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(9636, 1230997453139931693L ^ var1),
         var5,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(18694, 4311133289364201130L ^ var1),
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String[] param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0, String param2, File param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, String var2) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      long var3 = var0 ^ 92504768056162L;
      long var5 = var0 ^ 124968187244517L;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3369333995646643633L, var0
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(4423, 8279116752668275284L ^ var0)
      );
      int[] var7 = var10000;
      File[] var8 = Replay.INSTANCE
         .lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(var5)
         .listFiles(
            IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
         );

      label38: {
         try {
            var22 = var8;
            if (var7 != null) {
               break label38;
            }

            if (var8 == null) {
               return CollectionsKt.emptyList();
            }
         } catch (NoWhenBranchMatchedException var20) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var20, -3366892170423115130L, var0
            );
         }

         var22 = var8;
      }

      File[] var9 = var22;
      boolean var10 = false;
      File[] var11 = var9;
      var var12 = new ArrayList(var9.length);
      boolean var13 = false;
      int var14 = 0;
      int var15 = var9.length;

      while (var14 < var15) {
         File var16 = var11[var14];
         if (var7 != null) {
            return var12;
         }

         boolean var18 = false;
         var12.add(var16.getName());
         var14++;
         if (var7 != null) {
            break;
         }
      }

      return var12;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param0,
      int param1,
      int param2,
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, int var1, String var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 32 >>> 32) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(20347, 513042266616819027L ^ var3)
      );
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3454347923336490115L, var3
      );
      String[] var6 = new String[5];
      int[] var5 = var10000;
      var6[0] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(7619, 333196253864181733L ^ var3);
      var6[1] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(13271, 5992021062312628728L ^ var3);
      var6[2] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(9089, 6243762579977470364L ^ var3);
      var6[3] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(2791, 2791065772245461196L ^ var3);
      var6[4] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(15219, 187858518995441984L ^ var3);
      Iterable var16 = CollectionsKt.listOf(var6);
      boolean var7 = false;
      var var9 = new ArrayList();
      boolean var10 = false;

      for (Object var12 : var16) {
         var10000 = var5;
         String var13 = (String)var12;
         boolean var14 = false;

         label25: {
            try {
               if (var10000 != null) {
                  break label25;
               }

               if (!StringsKt.startsWith(var13, var2, true)) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, -3425993430808075340L, var3
               );
            }

            var9.add(var12);
         }

         if (var5 != null) {
            break;
         }
      }

      return var9;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param0,
      long param1,
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var0,
      char var1,
      int var2,
      int var3,
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      long var7 = var5 ^ 14797292249125L;
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(250, 2970033525934815165L ^ var5)
      );
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4.getOriginalArguments(), var7);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var2
   ) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      long var10001 = var0 ^ 113157312119249L;
      int var3 = (int)((var0 ^ 113157312119249L) >>> 56);
      int var4 = (int)((var0 ^ 113157312119249L) << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      long var6 = var0 ^ 52865919963004L;
      int var8 = (int)((var0 ^ 18081328468153L) >>> 32);
      int var9 = (int)((var0 ^ 18081328468153L) << 32 >>> 32);
      long var10 = var0 ^ 26714972558496L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(10855, 2839603824822833306L ^ var0)
      );
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var12 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2,
         var10,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(24783, 1422352807445010956L ^ var0),
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         null,
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         4,
         null
      );
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         (byte)var3,
         var4,
         var5
      );
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var2
   ) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      int var3 = (int)((var0 ^ 117560668393894L) >>> 32);
      int var4 = (int)((var0 ^ 117560668393894L) << 32 >>> 32);
      long var10001 = var0 ^ 57576382979641L;
      int var5 = (int)((var0 ^ 57576382979641L) >>> 56);
      int var6 = (int)((var0 ^ 57576382979641L) << 8 >>> 32);
      int var7 = (int)(var10001 << 40 >>> 40);
      long var8 = var0 ^ 16394093956725L;
      long var10 = var0 ^ 82445769460552L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(12201, 9096508018891131557L ^ var0)
      );
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var12 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2,
         var10,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(13629, 4181273263991656500L ^ var0),
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         null,
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         4,
         null
      );
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (byte)var5,
         var6,
         var7
      );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var0,
      long var1,
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var3
   ) {
      var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
      long var10001 = var1 ^ 30997388836576L;
      int var4 = (int)((var1 ^ 30997388836576L) >>> 56);
      int var5 = (int)((var1 ^ 30997388836576L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      long var7 = var1 ^ 91575049562528L;
      long var9 = var1 ^ 2192798053960L;
      var10001 = var1 ^ 52481432495142L;
      int var11 = (int)((var1 ^ 52481432495142L) >>> 48);
      int var12 = (int)((var1 ^ 52481432495142L) << 16 >>> 32);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var1 ^ 49668251792144L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(30563, 1934536182865867441L ^ var1)
      );
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         (byte)var4,
         var5,
         var6
      );
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(26370, 3310743163194286799L ^ var1),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(11599, 2554496248387659917L ^ var1),
         var14,
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(31383, 583796435009453918L ^ var1),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(29592, 8346456871635367503L ^ var1),
         var14,
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
      );
      return Unit.INSTANCE;
   }

   static {
      long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 67559848419143L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[37];
      int var7 = 0;
      String var6 = "òÌê\"K\u0013$¶NZEQ¡\u009bK½\u0010\u0087dsáx\u0000¬¿j\u009dN~nu\u0093Ý(õ\u008cg´\u0081¡Ó¬\u0083\u0014\u009doa÷ëG\u0011Ð\u001dt6\u0081]\u001aK«³±&ååânÎ>øÁeÜ¿ £åv\u000f:K2?c\u00ad@9~±oPB\u009b\u0011?v\n\u0096H·\u0011!_\b·âÌ «\u0018SvYÿey}èq0Àáµ>¥¯Fôb»\u0004cd çp:åÝ«\u0010l¥\u0002¤Ê¢äÕNÑÁ}\u0013RzÑhüR\u0081e-\u0087Ê\u0012EN¼_\u001461f¾½\bå·.%\u0001\u00adð/k@\u0098<Ì«\u009e'§â\u001dË\b\u0096Ò\n_\u007f8zórÕA3\u0005\u0001\u008c`\u0012\"h9)¶ôt\u0004*Ãÿä£\f=\u009eWn\u0006Ê \u001en\u0095Ã³fZ·¡: V¼TªÜ`Æh>¬`ý^«ü\u0010\u0080*±F\u0085WBä\u0082\u00818\\¶B>\u0010\u0010ù±9ÔÅß\u001eÓ\u0000qîã3\u001a$ö >\u008d\b\u0006UV\u0087ùðe\u00ad×ée\u0091l\u001c@\u00ad6\t\u0099\r¨Sÿ\u0016\tck£ü\u0010\u0095\u0096@ÆÙdÿI\u008eHqô\u0019üÜB\u0010Z.AÊ²XÈ\u0096'\u009dJ\u0016ÔôGg\u0010ø1\u008eRÉ<#6ÅÂ\u0090~\u001b?\u001aè@Bóê;\u0006ì±C\u0001Ôé\u0016Øéu \nsM\u000b\u0082\u0084\u000e³@®u\u001a^VA0\u009f¬{ö\u009fM\u0098¥êJ\u009dm`ò@½ö¦I1Pþq»M\u0002á\u008eÖsõ8\u0010Eóï\u00079_\u009a(Éqÿ¢\nÀ1ú\u0010ÐØ\b\u009f\u008a£§N>ïFß\u008dÿA¯\u0018ÓV¸\bTÿ\u00ad-\u0007\u001e\u0001jAÖ\u0010Ù¢o§}\u0001\u0003\u009b« zùÿbJ©7É>-jñ\u0018LÇ\u0019\u000b²n\u009dT\u0006o¨»×õ\u001dDÅEå +$Ci\u0002EZ¦^kS\u001e|\u009cêEH-\u009f¸=Ó8\u000e\u0000£>+!\u0010Ì10½JbÌ\u009aÉ·uæ,£®\r\u0098x;ß@!1\u0089\u009f\u001e\u0086\u001a\u0019¤qÍê\u0096$¡(\u0080þEªÓ©y{\f4\u0002>\u008d\u0093\u0010\u001cq\u000efEÊ,\u009f/tP³ä¬\u001f1\u0010Ábwåû°\u008c·)§úÍ>ÐÆ\\X0\u001d2{\u0095Á\u0010\u001fG\u0090^ngë#ÒNun¨\u00ad\u0004´\u0080Oæ\u0096\u0095ÏViµAC\u001ax\u0086¯¿\u0003ÌðºÑ*)Ë¿\u001c\u0092â\u008a\u0097*\u0002dG®X-¨\u000f©í\u008f¥Ü6pØÂ2®óûÃ#?\u0016OªÃóâ\u001b§UK\u0010ÄòDü²Q¼Ù{\u0015ëE\u0002\u0005\u001d6\u0010>ª\u008e\u000eÑ\u001f\u000b\u0095\"#\"ÃÄ¥´®\u0010\u0081\u0088»úQ²oX\u000b0¤&Þ\u009d\u008c9\u0010ÇMuW\u0097Sw¨\u0001t\u0005_æk\u0000\u0086h\u008a_ü\u0094\u008fìx=\u009f)\u008fÉ\u0087Ì\u0097\u0089Ý(\u000ee\u0082d×\u001bTxö\u0089óE,¸\u0087Q\u009aÙ\u00ad®ÁÏ!=\u0013Oµö»¼z\u0007Ó>Ö\u0086ÿ\u0015ºßÍ\u0098Ââ\u0090Ê6\rv}Ä³\u009d\u008fYkª½Ð\u001c|_\t\u0010#½QÄ\u0003a\u0099\u001a\u007fZ\u008b\n½\u000fgÌ3\u0001\u00adéËB\u0010&o´_.ìFØR!ñðv\u007fí\u009a \u00997\u007frÛ4bÛÏÙ³\u008bq}\u0080p\"\u008fª>Y©C\u009e\u0015T|¶Ot\u009a<\u0010\u008d=qj·Æ\u008fzvÄçh4%\u001e\u0098X\u00115\u001a7Ï¸YR)6p$ ¤AUDõn\u001eOË\u008f×I»ª\u00959È\u0001õD7ÌÆì\fðìá¸\u00149äÍ½\u0091*`Ò¨ö=\u0089è\u0013R¿0\u008b\u0097\u0003¥6áçÚxxÉjo\u000eë^èÛïm¦!?I\u0005ýñþXºô\u001d ,;\u0083\tÍ±ý@\b\u0085`\u009c]ë\u000e\n\u0081kÀL\fI\u00913×\bÐ^Löù\u0096{Ë¤>\u0090}V\u0096ô\u000f;\u009d+M\u0000Ô/ó&ä¸\u0006\u0086\u008b¨´\u0004ùn\u008bSA]¸Y\f \u0090\u0095º\u009eY\u008fO\u0000Ûá½¦²\u000b\u001c \u008cÊô;ÿýÛ\u0012\u0089¥\u0014ÌI\u0014H\u0097R)×i\u0011T\u0016Æz\u0018¸\u0014±}\u008b\u0086\u0010e÷\u0016ó!wÑ\u0089·ÜîÓ²U\t\u0011";
      int var8 = "òÌê\"K\u0013$¶NZEQ¡\u009bK½\u0010\u0087dsáx\u0000¬¿j\u009dN~nu\u0093Ý(õ\u008cg´\u0081¡Ó¬\u0083\u0014\u009doa÷ëG\u0011Ð\u001dt6\u0081]\u001aK«³±&ååânÎ>øÁeÜ¿ £åv\u000f:K2?c\u00ad@9~±oPB\u009b\u0011?v\n\u0096H·\u0011!_\b·âÌ «\u0018SvYÿey}èq0Àáµ>¥¯Fôb»\u0004cd çp:åÝ«\u0010l¥\u0002¤Ê¢äÕNÑÁ}\u0013RzÑhüR\u0081e-\u0087Ê\u0012EN¼_\u001461f¾½\bå·.%\u0001\u00adð/k@\u0098<Ì«\u009e'§â\u001dË\b\u0096Ò\n_\u007f8zórÕA3\u0005\u0001\u008c`\u0012\"h9)¶ôt\u0004*Ãÿä£\f=\u009eWn\u0006Ê \u001en\u0095Ã³fZ·¡: V¼TªÜ`Æh>¬`ý^«ü\u0010\u0080*±F\u0085WBä\u0082\u00818\\¶B>\u0010\u0010ù±9ÔÅß\u001eÓ\u0000qîã3\u001a$ö >\u008d\b\u0006UV\u0087ùðe\u00ad×ée\u0091l\u001c@\u00ad6\t\u0099\r¨Sÿ\u0016\tck£ü\u0010\u0095\u0096@ÆÙdÿI\u008eHqô\u0019üÜB\u0010Z.AÊ²XÈ\u0096'\u009dJ\u0016ÔôGg\u0010ø1\u008eRÉ<#6ÅÂ\u0090~\u001b?\u001aè@Bóê;\u0006ì±C\u0001Ôé\u0016Øéu \nsM\u000b\u0082\u0084\u000e³@®u\u001a^VA0\u009f¬{ö\u009fM\u0098¥êJ\u009dm`ò@½ö¦I1Pþq»M\u0002á\u008eÖsõ8\u0010Eóï\u00079_\u009a(Éqÿ¢\nÀ1ú\u0010ÐØ\b\u009f\u008a£§N>ïFß\u008dÿA¯\u0018ÓV¸\bTÿ\u00ad-\u0007\u001e\u0001jAÖ\u0010Ù¢o§}\u0001\u0003\u009b« zùÿbJ©7É>-jñ\u0018LÇ\u0019\u000b²n\u009dT\u0006o¨»×õ\u001dDÅEå +$Ci\u0002EZ¦^kS\u001e|\u009cêEH-\u009f¸=Ó8\u000e\u0000£>+!\u0010Ì10½JbÌ\u009aÉ·uæ,£®\r\u0098x;ß@!1\u0089\u009f\u001e\u0086\u001a\u0019¤qÍê\u0096$¡(\u0080þEªÓ©y{\f4\u0002>\u008d\u0093\u0010\u001cq\u000efEÊ,\u009f/tP³ä¬\u001f1\u0010Ábwåû°\u008c·)§úÍ>ÐÆ\\X0\u001d2{\u0095Á\u0010\u001fG\u0090^ngë#ÒNun¨\u00ad\u0004´\u0080Oæ\u0096\u0095ÏViµAC\u001ax\u0086¯¿\u0003ÌðºÑ*)Ë¿\u001c\u0092â\u008a\u0097*\u0002dG®X-¨\u000f©í\u008f¥Ü6pØÂ2®óûÃ#?\u0016OªÃóâ\u001b§UK\u0010ÄòDü²Q¼Ù{\u0015ëE\u0002\u0005\u001d6\u0010>ª\u008e\u000eÑ\u001f\u000b\u0095\"#\"ÃÄ¥´®\u0010\u0081\u0088»úQ²oX\u000b0¤&Þ\u009d\u008c9\u0010ÇMuW\u0097Sw¨\u0001t\u0005_æk\u0000\u0086h\u008a_ü\u0094\u008fìx=\u009f)\u008fÉ\u0087Ì\u0097\u0089Ý(\u000ee\u0082d×\u001bTxö\u0089óE,¸\u0087Q\u009aÙ\u00ad®ÁÏ!=\u0013Oµö»¼z\u0007Ó>Ö\u0086ÿ\u0015ºßÍ\u0098Ââ\u0090Ê6\rv}Ä³\u009d\u008fYkª½Ð\u001c|_\t\u0010#½QÄ\u0003a\u0099\u001a\u007fZ\u008b\n½\u000fgÌ3\u0001\u00adéËB\u0010&o´_.ìFØR!ñðv\u007fí\u009a \u00997\u007frÛ4bÛÏÙ³\u008bq}\u0080p\"\u008fª>Y©C\u009e\u0015T|¶Ot\u009a<\u0010\u008d=qj·Æ\u008fzvÄçh4%\u001e\u0098X\u00115\u001a7Ï¸YR)6p$ ¤AUDõn\u001eOË\u008f×I»ª\u00959È\u0001õD7ÌÆì\fðìá¸\u00149äÍ½\u0091*`Ò¨ö=\u0089è\u0013R¿0\u008b\u0097\u0003¥6áçÚxxÉjo\u000eë^èÛïm¦!?I\u0005ýñþXºô\u001d ,;\u0083\tÍ±ý@\b\u0085`\u009c]ë\u000e\n\u0081kÀL\fI\u00913×\bÐ^Löù\u0096{Ë¤>\u0090}V\u0096ô\u000f;\u009d+M\u0000Ô/ó&ä¸\u0006\u0086\u008b¨´\u0004ùn\u008bSA]¸Y\f \u0090\u0095º\u009eY\u008fO\u0000Ûá½¦²\u000b\u001c \u008cÊô;ÿýÛ\u0012\u0089¥\u0014ÌI\u0014H\u0097R)×i\u0011T\u0016Æz\u0018¸\u0014±}\u008b\u0086\u0010e÷\u0016ó!wÑ\u0089·ÜîÓ²U\t\u0011"
         .length();
      char var5 = 16;
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
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[37];
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

                  var6 = "÷¥tÏ0½D\f\u009f¯Óä%ÒO\u0084ô0>T`\u000fû²SÅýXb\u001brº äñË Æ\u008a1Øxá\u0081ÚÕñ+<ê;§ì\u0016Ó,â\u0010t\u0094\u0085ccàÎ";
                  var8 = "÷¥tÏ0½D\f\u009f¯Óä%ÒO\u0084ô0>T`\u000fû²SÅýXb\u001brº äñË Æ\u008a1Øxá\u0081ÚÕñ+<ê;§ì\u0016Ó,â\u0010t\u0094\u0085ccàÎ".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29165;
      if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/commands/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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
            "me/octo/client/commands/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
