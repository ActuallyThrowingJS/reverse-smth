package me.octo.client.modules.impl.macros;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import me.octo.client.utils.PolinexLogger;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll {
   @NotNull
   private final Json IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private volatile Map<String, ? extends llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private volatile List<? extends llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 36242295419761L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   public IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll() {
      long var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 12227008125908L;
      long var3 = var1 ^ 35575403949045L;
      super();
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = JsonKt.Json$default(
         null,
         IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         1,
         null
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.emptyList();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = -1;
   }

   @NotNull
   public final Json IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @Nullable
   public final IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl var1
   ) {
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   @NotNull
   public final Map<String, llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI> IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Map var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(13584, 1040224101701029445L ^ var1)
      );
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var3 = var1 ^ 91382663827372L;
      long var5 = var1 ^ 74371956085378L;
      long var7 = var1 ^ 44275468190366L;
      long var9 = var1 ^ 77502706940584L;
      int var11 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -903889840230628218L, var1
      );

      try {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(5211, 6076654992337205772L ^ var1)
         );
         String var12 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27075, 2980553671089358739L ^ var1),
            -951789068474259908L,
            var1
         );
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(15097, 2024174908373587114L ^ var1)
         );
         Json var14 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNull(var12);
         boolean var16 = false;
         var14.getSerializersModule();
         IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl var13 = (IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl)var14.decodeFromString(
            (DeserializationStrategy)IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
            var12
         );
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var13;
         IllllIIlIIIIllIIIlIIIlIllllIllllIIlIlIIlIlIIIIIIIlllIlIlIllllllIIlIIIIIIlIllllIIIIIIl var10000 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         Intrinsics.checkNotNull(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl var31 = var10000.getData().getCategories();
         List var15 = CollectionsKt.plus(
            CollectionsKt.plus(
               CollectionsKt.plus(
                  CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.plus(var31.getCombat(), var31.getFarming()), var31.getMining()), var31.getFishing()),
                  var31.getForaging()
               ),
               var31.getDungeoneering()
            ),
            var31.getHunting()
         );
         Iterable var32 = var15;
         boolean var17 = false;
         int var18 = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var32, 10)), 16);
         Map var20 = new LinkedHashMap(var18);
         boolean var21 = false;

         label30: {
            for (Object var23 : var32) {
               int var34 = var11;
               llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI var24 = (llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI)var23;
               Map var27 = var20;
               boolean var25 = false;

               try {
                  if (var34 != 0) {
                     break label30;
                  }

                  var27.put(var24.getIdProperty(), var23);
                  if (var11 != 0) {
                     break;
                  }
               } catch (Exception var28) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var28, -896107801784818915L, var1
                  );
               }
            }

            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var20;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = -1;
         }

         Iterable var10001 = var15;
         Comparator var33 = new IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.sortedWith(
            var10001,
            new IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               var33
            )
         );
         this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
         this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var9);
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(24930, 8852525841491758903L ^ var1)
         );
      } catch (Exception var29) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(6712, 4270904032028161150L ^ var1), var5
         );
         PolinexLogger.error(ExceptionsKt.stackTraceToString(var29));
      }
   }

   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI param1, int param2, int param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var3 = var1 ^ 15551493504294L;
      int var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3716070045568546837L, var1
      );

      try {
         Iterable var7 = IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
            .getCategories()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
         long var20 = 0L;
         boolean var8 = false;
         int var9 = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(var7, 10)), 16);
         Map var11 = new LinkedHashMap(var9);
         boolean var12 = false;

         Map var10000;
         label54: {
            for (Object var14 : var7) {
               var10000 = var11;
               if (var5 == 0) {
                  break label54;
               }

               IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl var16 = (IllIIIlIIIIllIIlIlIIIlllIIllllIllllllIlIlIlIIlllIlIlIllllIIlIlIIlIIIlIIIIlIIlIIIIlIIl)var14;
               boolean var17 = false;
               Pair var41 = TuplesKt.to(
                  var16.getName(),
                  new IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII(
                     var16.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
                     var16.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
                     CollectionsKt.toList(var16.getDonatedItems()),
                     CollectionsKt.toList(var16.getMissingItems())
                  )
               );
               var11.put(var41.getFirst(), var41.getSecond());
               if (var5 == 0) {
                  break;
               }
            }

            var10000 = var11;
         }

         Map var22 = var10000;
         Object var23 = null;
         byte var24 = 1;
         IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl var6 = new IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl(
            var20, var22, var24, (DefaultConstructorMarker)var23
         );
         File var30 = new File(
            Minecraft.getInstance().gameDirectory,
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(8545, 4829800352589312133L ^ var1)
         );
         var30.getParentFile().mkdirs();
         FilesKt.writeText$default(
            var30,
            this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .encodeToString(
                  (SerializationStrategy)IlIIIIIlIIlIIIIlIlIIllIlllIlllIllIlIlIllllIIllIIIIllIllIlIlIIIIIIIIIlIlIIlIlIlIlIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
                  var6
               ),
            null,
            2,
            null
         );
         Iterable var31 = var6.getCategories().values();
         var9 = 0;

         label43: {
            for (Object var35 : var31) {
               var43 = var9;
               if (var5 == 0) {
                  break label43;
               }

               IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var37 = (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var35;
               boolean var39 = false;
               int var19 = var37.getDonated().size();
               var9 += var19;
               if (var5 == 0) {
                  break;
               }
            }

            var43 = var9;
            var31 = var6.getCategories().values();
         }

         int var18 = var43;
         var9 = 0;

         for (Object var36 : var31) {
            if (var5 == 0) {
               return;
            }

            IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII var38 = (IlIIlIIIlIIlIlIIlllIlllIIIlIlIllIllIIIlIlIllIIlIIIlIIllIlllIIllIIIIlIlIlllIllllllIIII)var36;
            boolean var40 = false;
            int var42 = var38.getMissing().size();
            var9 += var42;
            if (var5 == 0) {
               break;
            }
         }

         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            var3,
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(27947, 5333723431623900362L ^ var1)
               + var18
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(22235, 6517250354646845222L ^ var1)
               + var9
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(7979, 3470527501307924168L ^ var1)
         );
      } catch (Exception var28) {
         PolinexLogger.error(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(1145, 7047318109222425989L ^ var1)
               + ExceptionsKt.stackTraceToString(var28)
         );
      }
   }

   private final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param1, @NotNull llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull llIIlIlllIlllIlIlIlIlllllIlIlIIlllIIllIIllllllIlIlIIIlIllIllIlllIIIlIIIllllllllIIIIlI param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, JsonBuilder var2) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(6021, 1209018613168961600L ^ var0)
      );
      var2.setIgnoreUnknownKeys(true);
      var2.setCoerceInputValues(true);
      return Unit.INSTANCE;
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0) {
      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
   }

   public static int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public static int IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      int var0 = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
      return var0 == 0 ? 85 : 0;
   }

   static {
      long var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 54607207663970L;
      byte var11 = 0;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[28];
      int var5 = 0;
      String var4 = "5[&¹\u0000knö\u0089\u00833¤|Mñ\u001eE\u0013i\u0005A<\u009féÕ®\tov¥\u0085%[Sl@7\u001aðï\u0010ëÌÆ\u0097=\u0007xª®)ï\u008aè!d) \u0080;à\nÝtö\u0097ÈÍ`\u0018Í¬'D=\u0096DR\u009bæ(\u0015°þä*Ó!a\u0092(!Êj;V¹a¾îË.L\u001a\u001e=¯f:\u008c\u009a\u00ad8YÑ\u0014\f\u00ad¢Zð\u0000â1u9s«ÜÇ0 \u001cqÙ¹¤~Q\u0007Zå\n\u001dZ\f\u0096\u009cÿï@°ò¨+U\u0007Bß6\u0003^¨í\u0010)ÃÙSj\u009bTS¿@NA\u0019Õ\u007fÖ\u0010uÄîúÍ^g)x¯x:r{i´xØ¹\u0098É\n þP¾ºe\u0086w\u0004d\u009d?\u0098Þ\f#\u0082?\u0096ÏÇCYà\u009a¡*¤çptkúo\u001e`¿àÏ`Cê dG)tT#\u0091\u0081è\u009eümT\u0011\u0004¼Év¹ô\u0098ã\u0098\u0085P¢\u0006<Å\u0010²é\u0015<\u0014,åM\u009dy\u001b\u009f\u009eÝ}ÿ¸Ì7\u00108s\u0000ãU©:tÙ\u008e\u00880(?v¾Àú²\u0014\u0001\u0093\u0010\u009a\u0012\u0011\u0004ôí~¹/§\t÷Xð²®\u0010\u000e \u0019\u00adh#\u0003NÄø\u0091F\u0082ðj]\u0010\u00ad8Ï\u009apÑ¬Vûã\u0096\u0083C\u0003À;8Aç\u0093C9\u009fÕEÇ\u0014àÔð\u0011\u0005'?R]ïçµ¥\u0012*à\u0007§P$aÌ:(*\u001b\u0082W\u008a@ºï·T ºG|6\u0092_\u0086¾\"+\u0019 #-\u009eÁän¯\u0080>Ùù·\u008f²3C´ÐzjÓµ\r0ú¶\u0003Ä\u0091üàO\u0010°]×ÿ²ù\u009fóó\u00ad\"÷\n(×\u0005(â\u0083÷\u008bÈ\u000f\u009aI\u000bÄ\u000eLi\u0084\u001fßÂx\u0002ê±\u008eÙªs3úêÖ¾\u0017Áä\u0088Ã}uA\u0093\u0099 @µ\rM\u0010\"7)ë«ÒÛ(®ú¸öúrE\u009bÁÅ\u0004ENGà\u0010åX\u0086\u0010øx+ÜÁ\u008c>£\r\u009b\u0084:ª60þX\u0086Ý¦¿ª\u007fÁ\u0019ú¯È\u0084÷\u0017Ê\u0001>#\"\u0017£¾e;8hÅ¼\u0019\u0001»üêVK§ïâh¥ÕýuüòÏà\u0017\u001ebD\u0080\u00ad\u009aW\u0015¸2:\u00018°¥Õ\u0006Q6\u0086þ6(£\u0017BÔcE5I^ÖÙk\u0003¼oÅ\u0086 WÞÔÚu2.ÄòõÇîÅÆÕÖ*¯öÜ:;\u0080´ê\u001e>©X\u001b*n8ðQ\u0012KtÌ/È;p\rÍP²\u0010\u0088tcÒ\u0003 \u0012\u0013¨5abC\u001cºÝ\b\u0093¹\u0089;/gôº]\u0014gÊáå§ÞÉ\u009epÄ«\u0016Ár\u0018Cîõl§Üâ\u0010ÖÓ\u001b£\u008e<³z O\u0090R\u000bÊ\u0005\u0010\u0010\u0095\u000f\u0096\f½³\u0087Od6gÁaí\u0082Â ðân¥F\t\t[\u008e\u0097\u00076h\u000bê\u0095ÜîOj.íWzÐ\u0096dy\r\u00948m\u0010~EIJ7\u0086hZe}\u0096!lÑ©O\u0010ÿâ»@lÁC\u009f\u0081m³hÆ2f88rf`úÿCâ/ao\u0010]\u0015Ç×ó:_\u001a \u0015\u0001NX\u001d\n2C\u0083¬é§/fº\u0010\u001c$VÇí\u008c¾\u008c»ûù\u0019üI\u0086V<ï\u0095\u000e";
      int var6 = "5[&¹\u0000knö\u0089\u00833¤|Mñ\u001eE\u0013i\u0005A<\u009féÕ®\tov¥\u0085%[Sl@7\u001aðï\u0010ëÌÆ\u0097=\u0007xª®)ï\u008aè!d) \u0080;à\nÝtö\u0097ÈÍ`\u0018Í¬'D=\u0096DR\u009bæ(\u0015°þä*Ó!a\u0092(!Êj;V¹a¾îË.L\u001a\u001e=¯f:\u008c\u009a\u00ad8YÑ\u0014\f\u00ad¢Zð\u0000â1u9s«ÜÇ0 \u001cqÙ¹¤~Q\u0007Zå\n\u001dZ\f\u0096\u009cÿï@°ò¨+U\u0007Bß6\u0003^¨í\u0010)ÃÙSj\u009bTS¿@NA\u0019Õ\u007fÖ\u0010uÄîúÍ^g)x¯x:r{i´xØ¹\u0098É\n þP¾ºe\u0086w\u0004d\u009d?\u0098Þ\f#\u0082?\u0096ÏÇCYà\u009a¡*¤çptkúo\u001e`¿àÏ`Cê dG)tT#\u0091\u0081è\u009eümT\u0011\u0004¼Év¹ô\u0098ã\u0098\u0085P¢\u0006<Å\u0010²é\u0015<\u0014,åM\u009dy\u001b\u009f\u009eÝ}ÿ¸Ì7\u00108s\u0000ãU©:tÙ\u008e\u00880(?v¾Àú²\u0014\u0001\u0093\u0010\u009a\u0012\u0011\u0004ôí~¹/§\t÷Xð²®\u0010\u000e \u0019\u00adh#\u0003NÄø\u0091F\u0082ðj]\u0010\u00ad8Ï\u009apÑ¬Vûã\u0096\u0083C\u0003À;8Aç\u0093C9\u009fÕEÇ\u0014àÔð\u0011\u0005'?R]ïçµ¥\u0012*à\u0007§P$aÌ:(*\u001b\u0082W\u008a@ºï·T ºG|6\u0092_\u0086¾\"+\u0019 #-\u009eÁän¯\u0080>Ùù·\u008f²3C´ÐzjÓµ\r0ú¶\u0003Ä\u0091üàO\u0010°]×ÿ²ù\u009fóó\u00ad\"÷\n(×\u0005(â\u0083÷\u008bÈ\u000f\u009aI\u000bÄ\u000eLi\u0084\u001fßÂx\u0002ê±\u008eÙªs3úêÖ¾\u0017Áä\u0088Ã}uA\u0093\u0099 @µ\rM\u0010\"7)ë«ÒÛ(®ú¸öúrE\u009bÁÅ\u0004ENGà\u0010åX\u0086\u0010øx+ÜÁ\u008c>£\r\u009b\u0084:ª60þX\u0086Ý¦¿ª\u007fÁ\u0019ú¯È\u0084÷\u0017Ê\u0001>#\"\u0017£¾e;8hÅ¼\u0019\u0001»üêVK§ïâh¥ÕýuüòÏà\u0017\u001ebD\u0080\u00ad\u009aW\u0015¸2:\u00018°¥Õ\u0006Q6\u0086þ6(£\u0017BÔcE5I^ÖÙk\u0003¼oÅ\u0086 WÞÔÚu2.ÄòõÇîÅÆÕÖ*¯öÜ:;\u0080´ê\u001e>©X\u001b*n8ðQ\u0012KtÌ/È;p\rÍP²\u0010\u0088tcÒ\u0003 \u0012\u0013¨5abC\u001cºÝ\b\u0093¹\u0089;/gôº]\u0014gÊáå§ÞÉ\u009epÄ«\u0016Ár\u0018Cîõl§Üâ\u0010ÖÓ\u001b£\u008e<³z O\u0090R\u000bÊ\u0005\u0010\u0010\u0095\u000f\u0096\f½³\u0087Od6gÁaí\u0082Â ðân¥F\t\t[\u008e\u0097\u00076h\u000bê\u0095ÜîOj.íWzÐ\u0096dy\r\u00948m\u0010~EIJ7\u0086hZe}\u0096!lÑ©O\u0010ÿâ»@lÁC\u009f\u0081m³hÆ2f88rf`úÿCâ/ao\u0010]\u0015Ç×ó:_\u001a \u0015\u0001NX\u001d\n2C\u0083¬é§/fº\u0010\u001c$VÇí\u008c¾\u008c»ûù\u0019üI\u0086V<ï\u0095\u000e"
         .length();
      char var3 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var13 += var3) >= var6) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[28];
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "HY\u0090\u009f\u009aÈN\u0091Ò\u0096\u0090QûÞëÕ Ý_Æ±\u0002Ý\u0097ÁÏ\u0015²\u001c\rÿ\u0090\u0092Ü|ûR\u0086UÄÿ\bÉàÚi\u008fLÛ";
                  var6 = "HY\u0090\u009f\u009aÈN\u0091Ò\u0096\u0090QûÞëÕ Ý_Æ±\u0002Ý\u0097ÁÏ\u0015²\u001c\rÿ\u0090\u0092Ü|ûR\u0086UÄÿ\bÉàÚi\u008fLÛ".length();
                  var3 = 16;
                  var13 = -1;
            }

            var14 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8171;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll", var10
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
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
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
            "me/octo/client/modules/impl/macros/IllllIIllIlIlIllllIlIIlIIlllIllllIlIIllIIlllllIlllllIIlllIIIIllIlIIlIllllllIlllIllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
