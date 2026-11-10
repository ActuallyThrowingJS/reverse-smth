package me.octo.client.gui.mainmenu;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.gui.components.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.utils.render.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll
   extends llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
   @NotNull
   private final CustomMainMenu mainMenu;
   @NotNull
   private final Minecraft IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private List<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @Nullable
   private UUID lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @Nullable
   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private me.octo.client.gui.components.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private me.octo.client.gui.components.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @Nullable
   private String IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @Nullable
   private String IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final Function0<Unit> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 77170304098925L;
   private static String[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static Map lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new HashMap(13);
   private static long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;

   public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(@NotNull CustomMainMenu mainMenuArg) {
      long var2 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ 105424111919416L;
      long var4 = var2 ^ 129666022325966L;
      long var6 = var2 ^ 86915013065312L;
      long var8 = var2 ^ 81736857333662L;
      long var10001 = var2 ^ 40758245138891L;
      int var10 = (int)((var2 ^ 40758245138891L) >>> 48);
      int var11 = (int)((var2 ^ 40758245138891L) << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(mainMenuArg, "mainMenu");
      super();
      this.mainMenu = mainMenuArg;
      Minecraft var13 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var13, "getInstance(...)");
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var13;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = CollectionsKt.emptyList();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(
         200
      );
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI;
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll, var8
         );
      this.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((short)var10, var11, (char)var12);
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      long var6 = var4 ^ 100105284683147L;
      List var8 = CollectionsKt.toMutableList(
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var6)
      );
      UUID var9 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9;
      Comparator var10 = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         var9
      );
      CollectionsKt.sortWith(
         var8,
         new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var10
         )
      );
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var8;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(UUID var1, long var2) {
      var2 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ var2;
      long var4 = var2 ^ 55106055830664L;
      long var6 = var2 ^ 92670442465198L;
      long var8 = var2 ^ 8906148746639L;
      boolean var10 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2014851946849412922L, var2
      );

      try {
         if (Intrinsics.areEqual(var1, this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll)) {
            return;
         }
      } catch (MatchException var18) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var18, -1906114117991289417L, var2
         );
      }

      Iterable var12 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Iterator var13 = var12.iterator();

      Object var10000;
      label36:
      while (true) {
         if (var13.hasNext()) {
            Object var14 = var13.next();
            var10000 = var14;

            while (true) {
               llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var15 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
               boolean var16 = false;
               if (!Intrinsics.areEqual(var15.getUuid(), var1)) {
                  continue label36;
               }

               var10000 = var14;
               if (var10) {
                  break label36;
               }
            }
         }

         var10000 = null;
         break;
      }

      try {
         var10000 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
         if ((llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000
            == null) {
            return;
         }
      } catch (MatchException var17) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var17, -1906114117991289417L, var2
         );
      }

      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var10000;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = true;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var11.getName();
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
            var4,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
         );
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(UUID var1, int var2, short var3, char var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      long var10001 = var5 ^ 43242545796648L;
      int var7 = (int)((var5 ^ 43242545796648L) >>> 48);
      int var8 = (int)((var5 ^ 43242545796648L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var5 ^ 55189323226051L;
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var10);
      this.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((short)var7, var8, (char)var9);
   }

   @Nullable
   @Override
   public Float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, float param3, float param4, float param5, short param6, float param7, float param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, short param3, char param4, float param5, float param6, int param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, float var3, float var4, double var5, double var7
   ) {
      float var9 = RangesKt.coerceIn(
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            - (float)var7 * 100.0F,
         0.0F,
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
      );
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9);
      return true;
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, int param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, long var1
   ) {
      var1 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ var1;
      long var10001 = var1 ^ 25084238118248L;
      int var3 = (int)((var1 ^ 25084238118248L) >>> 48);
      int var4 = (int)((var1 ^ 25084238118248L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      var0.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((short)var3, var4, (char)var5);
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2
   ) {
      var0 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ var0;
      long var3 = var0 ^ 131365656805844L;
      var2.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll argument1Arg, long argument2Arg, Throwable eArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      short var0, short var1, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2, int var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      long var6 = var4 ^ 126741185176822L;
      var2.mainMenu.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var6);
      return Unit.INSTANCE;
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0, long var1
   ) {
      var1 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ var1;
      long var3 = var1 ^ 103664104354583L;
      var0.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3);
      return Unit.INSTANCE;
   }

   static {
      long var5 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ 133501694706383L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[13];
      int var12 = 0;
      String var11 = "ÅçÆÐjð\u008e\u008a%À\u0001\u0083º\u0010\u0091\f(³\u0010ìZbûj¼³\u0082ª(ÕÏxy\u0007\u0098x\u0082n\u001aÞ[YG\u001bæO^Þ\u0084_\t\u0001¯í5Åu8E\u00910WÝã°Ú8\u009a|:¢!Mê\u000f£\u008aÖ\u0004HÎ¢ô\u0019M°¿\u008b äßé\tÏ\u0001'ÝrïýÃAl\u009cÿÀ¸®!½éhú\u0019Ȁßô\u00ad9\nåì\u00958ä×þn\u0089u\u0090\u008bü¹°\u008b\u009e\u001bÀEµC½@\u0081»ð³.#\u0092Ïð\u009bCôOñ¹ìx´.~\u008a\u0096õ²aa\u0099ÆgÇ¤¦Æ\u0003\u001bÐ7=\u008e\u0002UY¶ò÷*ÓôÊ\u000fvãæT\u0014Eí\u0013N\u0000vFùÅ\u0002R\u0015Ô2ÐÙÛaª\u00983\tÙÅ#R\u0000o\u0085\u008a²CIÍtx\u0090\u0012¾.Æ\u001a%À\u001f¶-ît[h\u0005E\u009f×òìim.\u0013U\u0006\u008d]ä\u0005B~\u0006ñ\u000bú8\t+@:ðu5\u0001_£\u0006\u0081\u0083üïãé;D²Ñ×pD¢9w\u0093\u0010ÆJ\u008fï\u0094î¯\u0087ô'\u001c\u009eÊ)B\u0011\u00909ñ§B\u008cä\u001aÈ!f\u0083L\t\u000bX\u008eÚ\u000e[\u007fæd±K\u0081fbJ%\u0094¡9è\u0083?7¼'\\¤ M\u0082\u0088\u0091\u0081ùJ;¡þN³\"¡\u000eú\u0089\u0000¢\rjG\u0017\u001bì¢\nó¢âoúñ\u001fÎ\u0084\u008dóx\u000fØab©\u009a»\u0083\u009eÇ\u008dg´^õûý4K\b\u000e\u009eÉ\u0081×µe9Ç¨eÝVÐ Q\u0002¡×)ô\u0096¿¬ãL¥ô\u0095¦%\u0013\u008c¡õ\u0093\u0080ù6\u0094a×î\bÀ#ý(\u0007ê\u0096\u009dÌ\u0003\u001b=ôÕ\u000b+j,Cg4Fè\f3\u009bÎ\u008f\\ä7·*§,\u008a\nm»J\u0010\u0017·Ó\u0012ÆF\u0010\u0088\u0003i\u0019és¯ %\u0090öK¼yÍa\u0000$\b\u00adihWG\u0002\u0093Rç:ü\u0003¦î\u0089q2\u00859;[Ã¾\u0098¼(\u0099Fñ²È\u001dTWH½\u009e¸Åd\u0015¹zÇI\u009e\u0012Ïf«8o¢ó*w1[!É\u0016Éy¨\u0092R4\u00010L2}Èýñ\u0095YßË\bSHßæ¯Õ\u0093XÈ\n'º\f\u0091}\u008d; ¸eb\ryÛ³\u007f8ùK\u0085L±1×ö\u0018'úòÈ\u0005é#y½^\u008e{C{ŐW¦ä8éSÐS\rÙ\u0096R©Ë ?\u0010.é«HAà¡\u001d[yZ\u0006ÿÖÏ\u0014LÞ§a2\u0001$q\u0083¡\u0083wÍ3f^óe\u001fù\u00adÁY\u001e  \u009d\u0017\u0091\u0003O\u0018mS\u009eá\u001a*\u001dy\u000fÔÊ|ÜVÃ\u0007ôÓ\u009ev\u0095\u00138¢Mò°|Û\bo\u0094ØOöý¥Å\u000b¦\u0003ö\u001dVÄ&=Í\u0007qW½¦çÇ£\u001cIä\u0013%\u008e3ÚïÁi±¦\u009f*\u001faæ·v,îs\u0094vËºÂÁgF\u009c8ô\u000bËù¿jýx<ä;h\u0090lÅ¢\u008bV\u001eK³¦A>\"\u00ad\u0015ÅDÝ\u009b,(\\eò1|À\u0090Äëª:d=\"\rßw\u000eÂ[N4\u0018#àp\u0087r.P\u0010è\u001f\"\u009eÜG\rsèyù\u0091õFqd0î\u0014xä\u0098Aâ\u0012\u0096~Ç:¨û·\u001aZg1ØpÜ\u001f\u0091Û\u0006WxÃx\u001cF\u00ad\u0096\u009c\u009aÐBáÊ\u0000QðÌ®¬\u0094ì\u001fËe;N¨lH\\½ó¼0¼ïJ\f\n`b\u0080\u008e\u0007oñ¾R¡¤ÿ¼È\u0014÷½Î¤JÝì¦\u0014\\\u00ad.ñ\u0082P\u0095g\u0013È\u0091 µÙ¢Õ¯ó\u0082._2¸y\u0088Ê¿bêÿ¾\u009c\"+?gË\u0010Bàß5kµ\u0018Æe\u0098<º¨\u00ad\u0084®\u0083´ð\u001bw0÷w6\u008cÎÒ\u0015ñ{ \\é\u0088J\tx\u009c¡Uh/Zm\u0013WscKÒÅ\u0002%PTãS-\u009e'\u0007Ì\u008b ¦\u008fGxZsÿ\u0097Y\u0004¥[¦ñËxÍ°\u0011Â)\u0007£Ù\u0097!\rHâÎf_ĘÎ\fH/[\u0014\u001e6¬`ÀG Ñn¨\u0091VÜæðÚa[\"ç¦=ØòAüO15\u008biÙóÔ»+\u0092N\rG|Ä\u0010,Ì\tÎÃD\u0086Ü×G¹hûä³\u008få\u0019ä\u00ad\u008c°\u001f\u008bÒ\u0010®\u008dhP*c\u0001\u0095(@ÑÑ&e!_\u008d\\w\u009fDQ°-gôóX\u0083ßG\u009bøZív3½j\rO\u0001\u009d:ÚÞ´v»ö?Ý¥ætí\u0012\u0098÷rGn§5z:\u009fðv¾f\u0095Æª\u001a¢ÞñëçãÐ\"\u0099\"@¿Ö(ª\u0013Êÿ¾¢\u009b£\u000fãÖÐ?\u001aÁîáL¹s5fO\u0088R.½µ\u0000\u00943\u000fIûpÊ¸\u0006=ã\u007f\b\bCùÛ²\u0017Y\u001d_d=ÜE·m}1H\u008e\u0095~möìãZ\u0085ÇË!Ì-ýãºÏDo½ë¸ï,Ã:\u0093\"«J\u000b'äÈp£¬TùSÁ>ä´A=Ùè\u0016\u0012Ö\u0014\u000b=\b";
      int var13 = "ÅçÆÐjð\u008e\u008a%À\u0001\u0083º\u0010\u0091\f(³\u0010ìZbûj¼³\u0082ª(ÕÏxy\u0007\u0098x\u0082n\u001aÞ[YG\u001bæO^Þ\u0084_\t\u0001¯í5Åu8E\u00910WÝã°Ú8\u009a|:¢!Mê\u000f£\u008aÖ\u0004HÎ¢ô\u0019M°¿\u008b äßé\tÏ\u0001'ÝrïýÃAl\u009cÿÀ¸®!½éhú\u0019Ȁßô\u00ad9\nåì\u00958ä×þn\u0089u\u0090\u008bü¹°\u008b\u009e\u001bÀEµC½@\u0081»ð³.#\u0092Ïð\u009bCôOñ¹ìx´.~\u008a\u0096õ²aa\u0099ÆgÇ¤¦Æ\u0003\u001bÐ7=\u008e\u0002UY¶ò÷*ÓôÊ\u000fvãæT\u0014Eí\u0013N\u0000vFùÅ\u0002R\u0015Ô2ÐÙÛaª\u00983\tÙÅ#R\u0000o\u0085\u008a²CIÍtx\u0090\u0012¾.Æ\u001a%À\u001f¶-ît[h\u0005E\u009f×òìim.\u0013U\u0006\u008d]ä\u0005B~\u0006ñ\u000bú8\t+@:ðu5\u0001_£\u0006\u0081\u0083üïãé;D²Ñ×pD¢9w\u0093\u0010ÆJ\u008fï\u0094î¯\u0087ô'\u001c\u009eÊ)B\u0011\u00909ñ§B\u008cä\u001aÈ!f\u0083L\t\u000bX\u008eÚ\u000e[\u007fæd±K\u0081fbJ%\u0094¡9è\u0083?7¼'\\¤ M\u0082\u0088\u0091\u0081ùJ;¡þN³\"¡\u000eú\u0089\u0000¢\rjG\u0017\u001bì¢\nó¢âoúñ\u001fÎ\u0084\u008dóx\u000fØab©\u009a»\u0083\u009eÇ\u008dg´^õûý4K\b\u000e\u009eÉ\u0081×µe9Ç¨eÝVÐ Q\u0002¡×)ô\u0096¿¬ãL¥ô\u0095¦%\u0013\u008c¡õ\u0093\u0080ù6\u0094a×î\bÀ#ý(\u0007ê\u0096\u009dÌ\u0003\u001b=ôÕ\u000b+j,Cg4Fè\f3\u009bÎ\u008f\\ä7·*§,\u008a\nm»J\u0010\u0017·Ó\u0012ÆF\u0010\u0088\u0003i\u0019és¯ %\u0090öK¼yÍa\u0000$\b\u00adihWG\u0002\u0093Rç:ü\u0003¦î\u0089q2\u00859;[Ã¾\u0098¼(\u0099Fñ²È\u001dTWH½\u009e¸Åd\u0015¹zÇI\u009e\u0012Ïf«8o¢ó*w1[!É\u0016Éy¨\u0092R4\u00010L2}Èýñ\u0095YßË\bSHßæ¯Õ\u0093XÈ\n'º\f\u0091}\u008d; ¸eb\ryÛ³\u007f8ùK\u0085L±1×ö\u0018'úòÈ\u0005é#y½^\u008e{C{ŐW¦ä8éSÐS\rÙ\u0096R©Ë ?\u0010.é«HAà¡\u001d[yZ\u0006ÿÖÏ\u0014LÞ§a2\u0001$q\u0083¡\u0083wÍ3f^óe\u001fù\u00adÁY\u001e  \u009d\u0017\u0091\u0003O\u0018mS\u009eá\u001a*\u001dy\u000fÔÊ|ÜVÃ\u0007ôÓ\u009ev\u0095\u00138¢Mò°|Û\bo\u0094ØOöý¥Å\u000b¦\u0003ö\u001dVÄ&=Í\u0007qW½¦çÇ£\u001cIä\u0013%\u008e3ÚïÁi±¦\u009f*\u001faæ·v,îs\u0094vËºÂÁgF\u009c8ô\u000bËù¿jýx<ä;h\u0090lÅ¢\u008bV\u001eK³¦A>\"\u00ad\u0015ÅDÝ\u009b,(\\eò1|À\u0090Äëª:d=\"\rßw\u000eÂ[N4\u0018#àp\u0087r.P\u0010è\u001f\"\u009eÜG\rsèyù\u0091õFqd0î\u0014xä\u0098Aâ\u0012\u0096~Ç:¨û·\u001aZg1ØpÜ\u001f\u0091Û\u0006WxÃx\u001cF\u00ad\u0096\u009c\u009aÐBáÊ\u0000QðÌ®¬\u0094ì\u001fËe;N¨lH\\½ó¼0¼ïJ\f\n`b\u0080\u008e\u0007oñ¾R¡¤ÿ¼È\u0014÷½Î¤JÝì¦\u0014\\\u00ad.ñ\u0082P\u0095g\u0013È\u0091 µÙ¢Õ¯ó\u0082._2¸y\u0088Ê¿bêÿ¾\u009c\"+?gË\u0010Bàß5kµ\u0018Æe\u0098<º¨\u00ad\u0084®\u0083´ð\u001bw0÷w6\u008cÎÒ\u0015ñ{ \\é\u0088J\tx\u009c¡Uh/Zm\u0013WscKÒÅ\u0002%PTãS-\u009e'\u0007Ì\u008b ¦\u008fGxZsÿ\u0097Y\u0004¥[¦ñËxÍ°\u0011Â)\u0007£Ù\u0097!\rHâÎf_ĘÎ\fH/[\u0014\u001e6¬`ÀG Ñn¨\u0091VÜæðÚa[\"ç¦=ØòAüO15\u008biÙóÔ»+\u0092N\rG|Ä\u0010,Ì\tÎÃD\u0086Ü×G¹hûä³\u008få\u0019ä\u00ad\u008c°\u001f\u008bÒ\u0010®\u008dhP*c\u0001\u0095(@ÑÑ&e!_\u008d\\w\u009fDQ°-gôóX\u0083ßG\u009bøZív3½j\rO\u0001\u009d:ÚÞ´v»ö?Ý¥ætí\u0012\u0098÷rGn§5z:\u009fðv¾f\u0095Æª\u001a¢ÞñëçãÐ\"\u0099\"@¿Ö(ª\u0013Êÿ¾¢\u009b£\u000fãÖÐ?\u001aÁîáL¹s5fO\u0088R.½µ\u0000\u00943\u000fIûpÊ¸\u0006=ã\u007f\b\bCùÛ²\u0017Y\u001d_d=ÜE·m}1H\u008e\u0095~möìãZ\u0085ÇË!Ì-ýãºÏDo½ë¸ï,Ã:\u0093\"«J\u000b'äÈp£¬TùSÁ>ä´A=Ùè\u0016\u0012Ö\u0014\u000b=\b"
         .length();
      char var10 = 16;
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var14;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new String[13];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8296454603568483916L;
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
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var30;
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

                  var11 = "©4Ó¹×6Í\u0098\u0085\u000fò¢ZUv\u0099\r\u00963\u0093ø\u008eu³ê\u0089düP\u0090Ú®\u0010~Ø;hQ ¾7}ók\u0004è¹m^";
                  var13 = "©4Ó¹×6Í\u0098\u0085\u000fò¢ZUv\u0099\r\u00963\u0093ø\u008eu³ê\u0089düP\u0090Ú®\u0010~Ø;hQ ¾7}ók\u0004è¹m^".length();
                  var10 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11513;
      if (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/mainmenu/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll", var10
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
         byte[] var9 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5].getBytes("ISO-8859-1");
         IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5];
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
            "me/octo/client/gui/mainmenu/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
