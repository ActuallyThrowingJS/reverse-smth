package me.octo.client.gui.clickgui.endgameGUI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII;
import me.octo.client.modules.IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII;
import me.octo.client.modules.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl;
import me.octo.client.modules.llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import me.octo.client.utils.render.colors.Color;
import me.octo.client.utils.render.shapes.NVGRenderer;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   public static lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Map<String, ? extends List<lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static float lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static int llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static volatile boolean lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static volatile boolean IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @NotNull
   private static volatile String IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static boolean IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private static int llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private static int lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static float IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static float lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static float lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private static float IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static float IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static float IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private static float IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private static float IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private static long lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = 38661174193052L;
   private static String[] lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private static String[] lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private static Map IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = new HashMap(13);

   private lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII() {
   }

   private final List<lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      try {
         List var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
         if (var10000 == null) {
            var10000 = CollectionsKt.emptyList();
         }

         return var10000;
      } catch (NoSuchElementException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Map IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, long var2) {
      var2 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var2;
      int[] var4 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5767442933704224610L, var2
      );

      List var6;
      try {
         me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var25 = me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var8 = false;
         var6 = ((IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII)me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .fromJson(var1, IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.class))
            .getWaypoints();
      } catch (Exception var18) {
         var6 = null;
      }

      List var5;
      boolean var34;
      label108: {
         label112: {
            var5 = var6;
            Collection var10000 = var6;
            if (var4 != null) {
               Collection var26 = var10000;

               try {
                  if (var26 == null) {
                     break label112;
                  }

                  var10000 = var26;
               } catch (Exception var23) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var23, 5872051336666484507L, var2
                  );
               }
            }

            try {
               var34 = var10000.isEmpty();
               if (var4 == null) {
                  break label108;
               }

               if (var34) {
                  break label112;
               }
            } catch (Exception var22) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var22, 5872051336666484507L, var2
               );
            }

            var34 = false;
            break label108;
         }

         var34 = true;
      }

      try {
         if (!var34) {
            return MapsKt.mapOf(TuplesKt.to("", var5));
         }
      } catch (Exception var21) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var21, 5872051336666484507L, var2
         );
      }

      JsonObject var28;
      try {
         me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var7 = me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         boolean var9 = false;
         var28 = (JsonObject)me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .fromJson(var1, JsonObject.class);
      } catch (Exception var17) {
         return MapsKt.emptyMap();
      }

      LinkedHashMap var29 = new LinkedHashMap();

      for (Entry var31 : var28.entrySet()) {
         Intrinsics.checkNotNull(var31);
         String var10 = (String)var31.getKey();
         JsonElement var11 = (JsonElement)var31.getValue();

         List var13;
         try {
            me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var32 = me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            String var35 = var11.toString();
            Intrinsics.checkNotNullExpressionValue(
               var35, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(3196, 3300143150995679249L ^ var2)
            );
            String var14 = var35;
            boolean var15 = false;
            var13 = ((IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII)me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
                  .fromJson(var14, IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.class))
               .getWaypoints();
         } catch (Exception var16) {
            var13 = null;
         }

         label83: {
            label114: {
               Object var36 = var13;
               if (var4 != null) {
                  Collection var33 = var13;

                  try {
                     if (var33 == null) {
                        break label114;
                     }

                     var36 = var33;
                  } catch (Exception var20) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var20, 5872051336666484507L, var2
                     );
                  }
               }

               try {
                  var34 = var36.isEmpty();
                  if (var4 == null) {
                     break label83;
                  }

                  if (var34) {
                     break label114;
                  }
               } catch (Exception var19) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var19, 5872051336666484507L, var2
                  );
               }

               var34 = false;
               break label83;
            }

            var34 = true;
         }

         if (!var34) {
            var29.put(var10, var13);
            if (var4 == null) {
               break;
            }
         }
      }

      return var29;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, Map param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1, lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var3
   ) {
      var1 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var1;
      long var4 = var1 ^ 140043862458112L;
      long var6 = var1 ^ 88912840212341L;
      long var8 = var1 ^ 51714038589250L;
      long var10 = var1 ^ 17366114033834L;
      long var12 = var1 ^ 39055438740128L;
      int[] var14 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         6574197900279407700L, var1
      );

      String var16;
      try {
         var16 = llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, var3.getId());
      } catch (Exception var25) {
         var16 = null;
      }

      String var15 = var16;

      label68: {
         try {
            if (var14 == null) {
               return;
            }

            if (var15 == null) {
               break label68;
            }
         } catch (Exception var27) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var27, 6506465020264449069L, var1
            );
         }

         Map var29 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16, var10);

         boolean var10000;
         label56: {
            label55: {
               try {
                  var10000 = var29.isEmpty();
                  if (var14 == null) {
                     break label56;
                  }

                  if (!var10000) {
                     break label55;
                  }
               } catch (Exception var26) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var26, 6506465020264449069L, var1
                  );
               }

               var10000 = 0;
               break label56;
            }

            var10000 = 1;
         }

         if (var10000) {
            Iterable var17 = var29.values();
            int var18 = 0;
            Iterator var19 = var17.iterator();

            while (true) {
               if (var19.hasNext()) {
                  Object var20 = var19.next();
                  var10000 = var18;
                  if (var14 == null) {
                     break;
                  }

                  List var21 = (List)var20;
                  boolean var22 = false;
                  int var24 = var21.size();
                  var18 += var24;
                  if (var14 != null) {
                     continue;
                  }
               }

               var10000 = var18;
               break;
            }

            PolinexLogger.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(1789, 201449033003837882L ^ var1)
                  + var10000
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(18033, 3977055996204673306L ^ var1)
                  + var3.getId(),
               var6
            );
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var29);
            return;
         }
      }

      PolinexLogger.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(17012, 915079555021696285L ^ var1) + var3.getId(), var6
      );
      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = true;
      IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var3.getId();
      var16 = var3.getId();
      new Thread(
            lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl
         )
         .start();
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      try {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
            return;
         }
      } catch (NoSuchElementException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = System.currentTimeMillis();
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      try {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
            return true;
         }
      } catch (NoSuchElementException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return false;
   }

   public final float lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
      long var6 = var4 ^ 139387969100650L;

      try {
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
            return 0.0F;
         }
      } catch (NoSuchElementException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -1160539784565313150L, var4
         );
      }

      float var10000;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
         float var8 = (float)(System.currentTimeMillis() - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
         float var9 = RangesKt.coerceIn(var8 / 380.0F, 0.0F, 1.0F);
         var10000 = 1.0F - this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, var9);
      } else {
         float var11 = (float)(System.currentTimeMillis() - IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
         float var12 = RangesKt.coerceIn(var11 / 380.0F, 0.0F, 1.0F);
         var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, var12);
      }

      return var10000;
   }

   private final float IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var1) {
      var1 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var1;
      int var3 = (int)((var1 ^ 98121797054906L) >>> 48);
      long var4 = (var1 ^ 98121797054906L) << 16 >>> 16;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5425376864563950627L, var1
      );
      float var7 = this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll((char)var3, var4);
      int[] var6 = var10000;

      try {
         if (!IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
            return var7;
         }

         var12 = RangesKt.coerceIn(
            (float)(System.currentTimeMillis() - IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll) / 380.0F, 0.0F, 1.0F
         );
         if (var6 == null) {
            return var12;
         }
      } catch (NoSuchElementException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -5349549430979630172L, var1
         );
      }

      float var8 = var12;

      try {
         if (var8 >= 1.0F) {
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = null;
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "";
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = false;
            IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
         }
      } catch (NoSuchElementException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -5349549430979630172L, var1
         );
      }

      return var7;
   }

   private final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, float param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor param1, float param2, float param3, float param4, float param5, int param6, long param7, int param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Couldn't set local class definition as local class statement was null
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, long param2, float param4, float param5, float param6, Color param7, float param8, float param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, float var3, float var4, float var5, float var6, Color var7, float var8, float var9, float var10
   ) {
      var1 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var1;
      long var11 = var1 ^ 113736728579256L;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         208318708368063884L, var1
      );
      byte var14 = 8;
      float var15 = var3;
      float var16 = var4;
      int[] var13 = var10000;
      int var17 = 1;

      do {
         float var18 = (float)var17 / var14;
         float var19 = var3 + (var5 - var3) * var18;
         float var20 = var4 + (var6 - var4) * var18;
         float var21 = (var17 - 0.5F) / var14;
         float var22 = var8 + (var9 - var8) * var21;
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var15,
               var16,
               var19,
               var11,
               var20,
               var10,
               var7.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(RangesKt.coerceIn(var22, 0.0F, 1.0F))
            );
         var15 = var19;
         var16 = var20;
         if (var17 == var14) {
            break;
         }

         var17++;
      } while (var13 != null);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, float param3, float param4, float param5, float param6, float param7, Color param8, float param9, float param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      float var1, long var2, float var4, float var5, float var6, Color var7, float var8, float var9
   ) {
      var2 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var2;
      long var10 = var2 ^ 69266796803199L;
      float var12 = 0.866F;
      float var13 = 0.5F;
      float var14 = -var5 * var12 + var6 * var13;
      float var15 = -var5 * var13 - var6 * var12;
      float var16 = -var5 * var12 - var6 * var13;
      float var17 = var5 * var13 - var6 * var12;
      float var18 = var1 + var14 * var9;
      float var19 = var4 + var15 * var9;
      float var20 = var1 + var16 * var9;
      float var21 = var4 + var17 * var9;
      NVGRenderer.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var4, var18, var10, var19, var8, var7);
      NVGRenderer.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var4, var20, var10, var21, var8, var7);
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(int param1, short param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, String var3) {
      var1 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var1;
      long var4 = var1 ^ 38837350202993L;
      CharSequence var10000 = StringsKt.replace$default(var3, '_', ' ', false, 4, null);
      char[] var6 = new char[]{' '};
      return CollectionsKt.joinToString$default(
         StringsKt.split$default(var10000, var6, false, 0, 6, null),
         " ",
         null,
         null,
         0,
         null,
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
         30,
         null
      );
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var1) {
      var1 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ var1;
      int[] var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         9086146834578325872L, var1
      );

      try {
         if (this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().isEmpty()) {
            IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = 0.0F;
            IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = 0.0F;
            IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = 0.0F;
            IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 1.0F;
            IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = 0.0F;
            return;
         }
      } catch (NoSuchElementException var21) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var21, 9182803604913725705L, var1
         );
      }

      float var4 = Float.POSITIVE_INFINITY;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = Float.POSITIVE_INFINITY;
      float var7 = Float.NEGATIVE_INFINITY;
      float var8 = Float.POSITIVE_INFINITY;
      float var9 = Float.NEGATIVE_INFINITY;
      Iterator var10 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().iterator();

      while (true) {
         if (var10.hasNext()) {
            lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl var11 = (lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl)var10.next();
            if (var3 == null) {
               break;
            }

            float var12 = var11.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
            float var13 = var11.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
            float var14 = var11.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();

            float var10000;
            label110: {
               label109: {
                  try {
                     var10000 = var12;
                     if (var3 == null) {
                        break label110;
                     }

                     if (!(var12 < var4)) {
                        break label109;
                     }
                  } catch (NoSuchElementException var20) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var20, 9182803604913725705L, var1
                     );
                  }

                  var4 = var12;
               }

               var10000 = var12;
            }

            label101: {
               label100: {
                  try {
                     if (var3 == null) {
                        break label101;
                     }

                     if (!(var10000 > var5)) {
                        break label100;
                     }
                  } catch (NoSuchElementException var19) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var19, 9182803604913725705L, var1
                     );
                  }

                  var5 = var12;
               }

               var10000 = var13;
            }

            label127: {
               float var10001;
               label91: {
                  label90: {
                     try {
                        var10001 = var6;
                        if (var3 == null) {
                           break label91;
                        }

                        if (!(var10000 < var6)) {
                           break label90;
                        }
                     } catch (NoSuchElementException var18) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var18, 9182803604913725705L, var1
                        );
                     }

                     var6 = var13;
                  }

                  try {
                     var10000 = var13;
                     if (var3 == null) {
                        break label127;
                     }

                     var10001 = var7;
                  } catch (NoSuchElementException var17) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var17, 9182803604913725705L, var1
                     );
                  }
               }

               if (var10000 > var10001) {
                  var7 = var13;
               }

               var10000 = var14;
            }

            label78: {
               label77: {
                  try {
                     if (var3 == null) {
                        break label78;
                     }

                     if (!(var10000 < var8)) {
                        break label77;
                     }
                  } catch (NoSuchElementException var16) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var16, 9182803604913725705L, var1
                     );
                  }

                  var8 = var14;
               }

               var10000 = var14;
            }

            label69: {
               try {
                  if (var3 == null) {
                     break label69;
                  }

                  if (!(var10000 > var9)) {
                     continue;
                  }
               } catch (NoSuchElementException var15) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var15, 9182803604913725705L, var1
                  );
               }

               var10000 = var14;
            }

            var9 = var10000;
            if (var3 != null) {
               continue;
            }
         }

         IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = (var4 + var5) * 0.5F;
         IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = (var6 + var7) * 0.5F;
         IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = (var8 + var9) * 0.5F;
         break;
      }

      float var23 = (var5 - var4) * 0.5F;
      float var24 = (var7 - var6) * 0.5F;
      float var25 = (var9 - var8) * 0.5F;
      IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = RangesKt.coerceAtLeast(
         Math.max(Math.max(var23, var24), var25), 1.0F
      );
      IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var6
         - IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = false;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var1, char var2, int var3, short var4, int var5) {
      long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
      int[] var8 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2100062147113755213L, var6
      );

      int var10000;
      label22: {
         try {
            var10000 = IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
            if (var8 == null) {
               break label22;
            }

            if (!IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll) {
               return;
            }
         } catch (NoSuchElementException var12) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var12, -2041061072947790390L, var6
            );
         }

         var10000 = var1 - llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
      }

      int var9 = var10000;
      int var10 = var5 - lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var1;
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var5;
      float var11 = 0.011F;
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll += var9 * var11;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl += var10 * var11;
      IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = RangesKt.coerceIn(
         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl, -1.5F, 1.5F
      );
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var9 * var11 * 0.5F;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var10 * var11 * 0.5F;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
      float var10000;
      label16: {
         try {
            if (var1 > 0) {
               var10000 = 1.12F;
               break label16;
            }
         } catch (NoSuchElementException var3) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3);
         }

         var10000 = 0.89285713F;
      }

      float var2 = var10000;
      llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = RangesKt.coerceIn(
         llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI * var2, 0.25F, 5.0F
      );
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var1, int var2) {
      IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = true;
      llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var1;
      lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var2;
      IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0F;
      lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = 0.0F;
   }

   private final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String var0, int var1, short var2, Map var3, short var4
   ) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
      long var7 = (var5 ^ 54059482658463L) >>> 16;
      int var9 = (int)((var5 ^ 54059482658463L) << 48 >>> 48);
      long var10 = var5 ^ 112660836082327L;
      long var12 = var5 ^ 28191556811424L;
      int[] var14 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8728529665203291722L, var5
      );

      String var10000;
      label81: {
         try {
            if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
               var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.getId();
               break label81;
            }
         } catch (NoSuchElementException var27) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var27, -8671208439285622321L, var5
            );
         }

         var10000 = null;
      }

      label74: {
         try {
            var28 = Intrinsics.areEqual(var10000, var0);
            if (var14 == null) {
               break label74;
            }

            if (!var28) {
               return;
            }
         } catch (NoSuchElementException var26) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var26, -8671208439285622321L, var5
            );
         }

         var28 = var3.isEmpty();
      }

      label64: {
         label63: {
            try {
               if (var14 == null) {
                  break label64;
               }

               if (!var28) {
                  break label63;
               }
            } catch (NoSuchElementException var25) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var25, -8671208439285622321L, var5
               );
            }

            var28 = false;
            break label64;
         }

         var28 = true;
      }

      label55: {
         if (var28) {
            Iterable var15 = var3.values();
            int var16 = 0;

            label51: {
               for (Object var18 : var15) {
                  List var19 = (List)var18;
                  boolean var20 = false;
                  var29 = var19.size();
                  if (var14 == null) {
                     break label51;
                  }

                  int var22 = var29;
                  var16 += var22;
                  if (var14 == null) {
                     break;
                  }
               }

               PolinexLogger.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(9713, 3454705324920526662L ^ var5)
                     + var16
                     + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(27137, 4830328481714378939L ^ var5)
                     + var0,
                  var10
               );
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  var12, var3
               );
               var29 = 0;
            }

            try {
               IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = (boolean)var29;
               if (var14 != null) {
                  break label55;
               }
            } catch (NoSuchElementException var24) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var24, -8671208439285622321L, var5
               );
            }
         }

         try {
            PolinexLogger.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var7,
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(25217, 2551536526464126987L ^ var5)
                  + var0
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(11435, 7313288085589220889L ^ var5),
               (char)var9
            );
            IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = true;
         } catch (NoSuchElementException var23) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var23, -8671208439285622321L, var5
            );
         }
      }

      lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = false;
   }

   private static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param0, String param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Triple<Float, Float, Float> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7
   ) {
      float var8 = var5 * var0 - var7 * var1;
      float var9 = var5 * var1 + var7 * var0;
      float var10 = var6 * var2 - var9 * var3;
      float var11 = var6 * var3 + var9 * var2;
      return new Triple(var8 * var4, -var10 * var4, var11);
   }

   private static final Triple<Float, Float, Float> llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7
   ) {
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5 - IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl,
         var6 - IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI,
         var7 - IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI
      );
   }

   private static final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var0, float var1, float var2, float var3, float var4
   ) {
      float var5 = (float)Math.sqrt((var3 - var0) * (var3 - var0) + (var4 - var1) * (var4 - var1));
      return RangesKt.coerceAtLeast(1.0F - var5 / var2 * 0.75F, 0.0F);
   }

   private static final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var0, float var1, float var2, float var3
   ) {
      float var4 = (var2 - var0) / var1;
      return var3 * (0.55F + 0.45F * var4);
   }

   private static final CharSequence lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param0, String param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII ^ 56944063132203L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[36];
      int var7 = 0;
      String var6 = "°Õ¼\b\u0093Ó3\fì^jY³wl°\u001dÐút\\B¯I\u0094qØ7\u0082\u009d(ìLæë\u0019\u0086\u000eZ\u0005\u0010\u001cü\u001cõé7æ¯»à $Å}o¤Ő[ò¼\b\u0014_\u0094éç\r\u0083»\u0015<Â¼\u0000u+\u0097\u0018{a\u0013h]\u000b7½±c\u001e¹\u0006\u0082¶K¥M£ÆðD\u0013¡Ðy\u008aÉüð¼\u001f|Íö©rl@]m`\u0017!hÎ[Ó©\"\b¡§\u0085yçh\u000e¥Z\u0019Ï)\u0093-Öæ7w\u0093Á§¤I\u0099b\u0019Ï\u000e\u0080\u0004Ö1zbÖÙ\u001cJ\u001fï½<^Ê8ôü\u001b\u0010&\u00888\u001a\u0012ï\u0091d¢ÇÛàå<°ú {ín]ßYHo¢hK\u00ad\u0084Lú\u0006¾v2¼¶\\\u009934·N;\u0097\u000b\u008e¸¬Ò\u0010û±£Jt\u007f\u0086¢m#&ØÁ \u0084\u000bÍLÖ\u008c±1\u001fßbTz\t\u009f\u0011¿\u008b>á\u001c$^ÙM\\:\fwò¢yPüÜÇ\u00181sg@\\U\u001f(\u0006ÆVàx¶z{\u008eDP\"¸[ \u009b\u008d(®\u001b*1T8k÷\u009eýÝEÆÖ\u0093ÇY£\u0091I&)(8\u0007Â('WßÁó;á\u0018\u00896 \u009f+ô\u0094\u0002µß¤\u008eOPõö\u001dç§q6\u008aÒJÛ\u0002êó°\u001c¨ì\u000b\u0092\u0095\u0004ÈÜ÷cR\u0085.\u009a\u008b/)M\u0006\u000bµ(¤\u0006{jl\u0096³à~ÒùmÅ$\\ÖÊj^\u00050\u008cª\u0088å\u001dxÎéöF\nÖBÑ´Z\rZ*\u0010\u008dÀk\u0086Õ\u0000?@±\u0080MJÚìP³\u0018§\u009afIPxÃzÈ\fç:¶Â}Ù×\u008b-;$lÿª\u0010r\nµu\u009c×\u0011æ\u000eÞìÜD|i~\u0010\r\u0016t2f¸ Ü \u0015í¾TI<R\u0018æ\u0019\u0091)\u0015\f\u0010ö5Û\u0007´\u0098Õ\u009fÆ.\u0092\t\u0090\u001eU»QXÉ`ÿ\u001bTU\u0005\u0016¼¤\"éæ\u0094û\u00932©\u0095\u001e\u0094õÝ\rðõÎ¼4)\tÉÎ\u0002áÖ¿ñ\u0010¸I³73ï·\u001c\u0019²öW{ØpsZmÊc\u0019#\u0011\u0016ÃôÒa\u008b!\u0083²\u0092oJ8D!½\u0085Ò\u0007·×¿\u0005¤+ÕP\"\u0000-\u0080\u0086\u001f\u001a\u008fØsq/\u0010k\u0098\u001e\u0010ôÍØ¨üÊ:ÁÁVÒL\u009aÛ3$?¢}\r\u000eJc\u0006\u009a!\u001b«²õJè\u008cùp\u007fPó\u0098Rîñ\u000bKpi\u0002Ê±\u0099\"ãÓ\u0015K\u008eË\u0092Wµvi\u009c  \u00159ð\u0007tö\u000e#\u0013m3g¨?\nËz3¤\u0091\u0087\u0015l¬ùZN½zªù\u0010ÖM\u0097\"zã¥Ç¹ÙÂßpö¦â\u0010m}JèÕmì£dõ^9XTÂð0Ä\u0096\u0016÷\u0014\u0086yCåÜ¿©{\u0098¦\u008f\b¸±wÝ¸\u0014\u0089í\u009b°¾¿DPó§¡-ý0\u001b;n\";ì\u0098\u008a/t?(fîà-bÇZ\u0097\u0096\u008a±v\u008aî\u009f\rU4ß!|\u00adLÑä\u0000\u0093ÌVv~yï\u0084!\u0003Ò½åß\u0010a\u0001VG\u001fµ\u009bWPýöÕþØV\u001c 5ÁGÒ?óÅù\t\u008d}Âú=]÷±]\f\u007fHÊñÄ\bÜ¡x\u0013\u0082ßi \u0080¥ÎF/W(\u0084±,â\u0095Hr\u009a%ýt\u00103\u0002 ±OX\u009ab\u001cÀ³]\u0002\u0010_\u0002\u001eÉ\u008fÉ\u0000á$È\u008aG6\u0016rÄ(\u001d\u0018/=\u0094~Á0§HÛr\u0091\u0099Wz^/<ïýëÙ6GìñYá6\u0019£\f\u0080Ô6z\u0012êm\u0010YK#\u0081ö\u001b\u0096\u009f.zô8Ã\u0090¥°\u0010qÖ\u001c,\rT0f\féÇ\u0011Ldwæ0JÑ\tV-~Å1ÔvALðê=ö\r\u008du÷»Ó\u008cý\u0016-é?ÿ©\u0010{\u0007PS\u001c\u0005óv!Ã[Îø4s'\u0003\u0010*1¬zÄý\u0092dS X\u000bNG\u0084|8\u0096\u000bX_a\u009b\u008fE\u0000+Áýìëªgy\u0092c+\u0086ç&T\u001ft\u008e\\\u008a´\u0003U«å\u009c\u0081\u009e\u0093©%¶\u008cé\u0082Ðb<¶\u0092\u0010hñ3ò\"\fØOW\u001a©X>Î?(\u0088õ\nCË\u008aj·cÙàz\u009c¤q\u0019\u001a\u0088?\u0088ag\u001eqHpÍ\u0010þ\u0011NÒòY\u0010¶&\u000ezÙb\u0099ÞHÞ,$\u0089\u0088Éð\u0094hÁähÉúéRþf\u009fâðñ\t\u0095oR\u0003ä\u00010y¢d1\u0015Z@\u0006\u008fº\u0082°ú\u0089\u0092-Ð\u001d¬-i\u0006\f\u0095Ù³kf$\u001aZ¥,Ð\u009dÐHõ\t\u0019ãõe\n7+\u008eÕ\u0097W\u001e\u0004\u0004Ê=ÇôX£_º\u0002<æ@\u001eùÂ_SÜA\u0011\u001e¤\u0088Ìq!7üÜM\u0083²P2\u0083M+ÈX¢sç¾K!É\u008fÜøE{6\u0089\u0019õbtà>ðÖË:ÓL\u0005ãÒy\u0099eC\u0007\u009e7Â>ÚKå \u0081/\"7õqÇ¤öM½}×Ü\u0087+ ð\u0098t¹FðÈ+ª@Ù\rî:,8fC!Ð\u000b°\u001ex\u0080\u009dÀ\u0093OI°Ën\u0082_\u0001äé\u0002%\u009fäº\u0095\u0081'¤\u0081\u0087aÓ\bÖ(Óåðª\u008ft9üT\u0088\u0015ëØO`þså\u0010rs\u0083!\u0011u&{\u0082\u0089ß\u000e2\u009d×l\u0010\u0094×Oµ \\º÷E\u0080W¦ñ\r5¡ 9ßE\u009a'ó\u0005\u0010ÿ\u009f]%\u001a\u007fZGµ3ùZ\u0089ÿÔ\u008b\u001b\u0019'ñôä½nPT\u008f\u0085\u0013\u009f@â^(&>Ö£\u0000_@ñ\u001b%KÂüè§>\u008arav^+A\u001d5È+ÝwM\n:<úªÑ\u009fH´\u0007H&(\u001bÇþØI\u0097\u009b«£\u0014±\u001f\"Ñ\u0083Úè\u0017\u0013ÿe\bæ\u009fþ\u0090ÒÚ@¸\u009f\u001f9h\u0095Ä\u0086'Lx®]\u0097ÂT\u0007lr\u008c;ÊLÃiº¢.qZÁû]\u007fT¬ÖÔñÓ\u0001ÇP|óàÌ\u009f£\u008eÏ\u0094«\u0095ö×\u0005öÚñtcßæ";
      int var8 = "°Õ¼\b\u0093Ó3\fì^jY³wl°\u001dÐút\\B¯I\u0094qØ7\u0082\u009d(ìLæë\u0019\u0086\u000eZ\u0005\u0010\u001cü\u001cõé7æ¯»à $Å}o¤Ő[ò¼\b\u0014_\u0094éç\r\u0083»\u0015<Â¼\u0000u+\u0097\u0018{a\u0013h]\u000b7½±c\u001e¹\u0006\u0082¶K¥M£ÆðD\u0013¡Ðy\u008aÉüð¼\u001f|Íö©rl@]m`\u0017!hÎ[Ó©\"\b¡§\u0085yçh\u000e¥Z\u0019Ï)\u0093-Öæ7w\u0093Á§¤I\u0099b\u0019Ï\u000e\u0080\u0004Ö1zbÖÙ\u001cJ\u001fï½<^Ê8ôü\u001b\u0010&\u00888\u001a\u0012ï\u0091d¢ÇÛàå<°ú {ín]ßYHo¢hK\u00ad\u0084Lú\u0006¾v2¼¶\\\u009934·N;\u0097\u000b\u008e¸¬Ò\u0010û±£Jt\u007f\u0086¢m#&ØÁ \u0084\u000bÍLÖ\u008c±1\u001fßbTz\t\u009f\u0011¿\u008b>á\u001c$^ÙM\\:\fwò¢yPüÜÇ\u00181sg@\\U\u001f(\u0006ÆVàx¶z{\u008eDP\"¸[ \u009b\u008d(®\u001b*1T8k÷\u009eýÝEÆÖ\u0093ÇY£\u0091I&)(8\u0007Â('WßÁó;á\u0018\u00896 \u009f+ô\u0094\u0002µß¤\u008eOPõö\u001dç§q6\u008aÒJÛ\u0002êó°\u001c¨ì\u000b\u0092\u0095\u0004ÈÜ÷cR\u0085.\u009a\u008b/)M\u0006\u000bµ(¤\u0006{jl\u0096³à~ÒùmÅ$\\ÖÊj^\u00050\u008cª\u0088å\u001dxÎéöF\nÖBÑ´Z\rZ*\u0010\u008dÀk\u0086Õ\u0000?@±\u0080MJÚìP³\u0018§\u009afIPxÃzÈ\fç:¶Â}Ù×\u008b-;$lÿª\u0010r\nµu\u009c×\u0011æ\u000eÞìÜD|i~\u0010\r\u0016t2f¸ Ü \u0015í¾TI<R\u0018æ\u0019\u0091)\u0015\f\u0010ö5Û\u0007´\u0098Õ\u009fÆ.\u0092\t\u0090\u001eU»QXÉ`ÿ\u001bTU\u0005\u0016¼¤\"éæ\u0094û\u00932©\u0095\u001e\u0094õÝ\rðõÎ¼4)\tÉÎ\u0002áÖ¿ñ\u0010¸I³73ï·\u001c\u0019²öW{ØpsZmÊc\u0019#\u0011\u0016ÃôÒa\u008b!\u0083²\u0092oJ8D!½\u0085Ò\u0007·×¿\u0005¤+ÕP\"\u0000-\u0080\u0086\u001f\u001a\u008fØsq/\u0010k\u0098\u001e\u0010ôÍØ¨üÊ:ÁÁVÒL\u009aÛ3$?¢}\r\u000eJc\u0006\u009a!\u001b«²õJè\u008cùp\u007fPó\u0098Rîñ\u000bKpi\u0002Ê±\u0099\"ãÓ\u0015K\u008eË\u0092Wµvi\u009c  \u00159ð\u0007tö\u000e#\u0013m3g¨?\nËz3¤\u0091\u0087\u0015l¬ùZN½zªù\u0010ÖM\u0097\"zã¥Ç¹ÙÂßpö¦â\u0010m}JèÕmì£dõ^9XTÂð0Ä\u0096\u0016÷\u0014\u0086yCåÜ¿©{\u0098¦\u008f\b¸±wÝ¸\u0014\u0089í\u009b°¾¿DPó§¡-ý0\u001b;n\";ì\u0098\u008a/t?(fîà-bÇZ\u0097\u0096\u008a±v\u008aî\u009f\rU4ß!|\u00adLÑä\u0000\u0093ÌVv~yï\u0084!\u0003Ò½åß\u0010a\u0001VG\u001fµ\u009bWPýöÕþØV\u001c 5ÁGÒ?óÅù\t\u008d}Âú=]÷±]\f\u007fHÊñÄ\bÜ¡x\u0013\u0082ßi \u0080¥ÎF/W(\u0084±,â\u0095Hr\u009a%ýt\u00103\u0002 ±OX\u009ab\u001cÀ³]\u0002\u0010_\u0002\u001eÉ\u008fÉ\u0000á$È\u008aG6\u0016rÄ(\u001d\u0018/=\u0094~Á0§HÛr\u0091\u0099Wz^/<ïýëÙ6GìñYá6\u0019£\f\u0080Ô6z\u0012êm\u0010YK#\u0081ö\u001b\u0096\u009f.zô8Ã\u0090¥°\u0010qÖ\u001c,\rT0f\féÇ\u0011Ldwæ0JÑ\tV-~Å1ÔvALðê=ö\r\u008du÷»Ó\u008cý\u0016-é?ÿ©\u0010{\u0007PS\u001c\u0005óv!Ã[Îø4s'\u0003\u0010*1¬zÄý\u0092dS X\u000bNG\u0084|8\u0096\u000bX_a\u009b\u008fE\u0000+Áýìëªgy\u0092c+\u0086ç&T\u001ft\u008e\\\u008a´\u0003U«å\u009c\u0081\u009e\u0093©%¶\u008cé\u0082Ðb<¶\u0092\u0010hñ3ò\"\fØOW\u001a©X>Î?(\u0088õ\nCË\u008aj·cÙàz\u009c¤q\u0019\u001a\u0088?\u0088ag\u001eqHpÍ\u0010þ\u0011NÒòY\u0010¶&\u000ezÙb\u0099ÞHÞ,$\u0089\u0088Éð\u0094hÁähÉúéRþf\u009fâðñ\t\u0095oR\u0003ä\u00010y¢d1\u0015Z@\u0006\u008fº\u0082°ú\u0089\u0092-Ð\u001d¬-i\u0006\f\u0095Ù³kf$\u001aZ¥,Ð\u009dÐHõ\t\u0019ãõe\n7+\u008eÕ\u0097W\u001e\u0004\u0004Ê=ÇôX£_º\u0002<æ@\u001eùÂ_SÜA\u0011\u001e¤\u0088Ìq!7üÜM\u0083²P2\u0083M+ÈX¢sç¾K!É\u008fÜøE{6\u0089\u0019õbtà>ðÖË:ÓL\u0005ãÒy\u0099eC\u0007\u009e7Â>ÚKå \u0081/\"7õqÇ¤öM½}×Ü\u0087+ ð\u0098t¹FðÈ+ª@Ù\rî:,8fC!Ð\u000b°\u001ex\u0080\u009dÀ\u0093OI°Ën\u0082_\u0001äé\u0002%\u009fäº\u0095\u0081'¤\u0081\u0087aÓ\bÖ(Óåðª\u008ft9üT\u0088\u0015ëØO`þså\u0010rs\u0083!\u0011u&{\u0082\u0089ß\u000e2\u009d×l\u0010\u0094×Oµ \\º÷E\u0080W¦ñ\r5¡ 9ßE\u009a'ó\u0005\u0010ÿ\u009f]%\u001a\u007fZGµ3ùZ\u0089ÿÔ\u008b\u001b\u0019'ñôä½nPT\u008f\u0085\u0013\u009f@â^(&>Ö£\u0000_@ñ\u001b%KÂüè§>\u008arav^+A\u001d5È+ÝwM\n:<úªÑ\u009fH´\u0007H&(\u001bÇþØI\u0097\u009b«£\u0014±\u001f\"Ñ\u0083Úè\u0017\u0013ÿe\bæ\u009fþ\u0090ÒÚ@¸\u009f\u001f9h\u0095Ä\u0086'Lx®]\u0097ÂT\u0007lr\u008c;ÊLÃiº¢.qZÁû]\u007fT¬ÖÔñÓ\u0001ÇP|óàÌ\u009f£\u008eÏ\u0094«\u0095ö×\u0005öÚñtcßæ"
         .length();
      char var5 = '(';
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
                     lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = var9;
                     lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = new String[36];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = MapsKt.emptyMap();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "";
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 2.62F;
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.49F;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 1.55F;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 2.62F;
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.49F;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 1.55F;
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = -1;
                     IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = "";
                     IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = 1.0F;
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

                  var6 = "\u008fW1²ü£\u008aòp\u008aG`Ó\u0001±lß[®Å|\u0014ÔÙæù\u001azìÒã6ÅCX\\\"L$Éé©BÜZ<ç\u001aÔH¹¹öÖ\u001dJ\u0010\u0089àp±5\u0014cá!\u0096Ý\u008cvÅ]6";
                  var8 = "\u008fW1²ü£\u008aòp\u008aG`Ó\u0001±lß[®Å|\u0014ÔÙæù\u001azìÒã6ÅCX\\\"L$Éé©BÜZ<ç\u001aÔH¹¹öÖ\u001dJ\u0010\u0089àp±5\u0014cá!\u0096Ý\u008cvÅ]6"
                     .length();
                  var5 = '8';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30375;
      if (lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10
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
         byte[] var9 = lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI[var5].getBytes("ISO-8859-1");
         lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI[var5];
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
            "me/octo/client/gui/clickgui/endgameGUI/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
