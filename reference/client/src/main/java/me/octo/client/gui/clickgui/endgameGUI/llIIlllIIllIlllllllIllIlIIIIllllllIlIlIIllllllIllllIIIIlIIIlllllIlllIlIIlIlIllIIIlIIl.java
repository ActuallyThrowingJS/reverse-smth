package me.octo.client.gui.clickgui.endgameGUI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Map<String, llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 43906150749027L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   private final File IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      File var3 = new File(
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(4366, 1569851665358992312L ^ var1)
      );
      File var4 = var3;
      boolean var5 = false;

      try {
         if (!var4.exists()) {
            var4.mkdirs();
         }

         return var3;
      } catch (MatchException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, 8900946168017582781L, var1
         );
      }
   }

   @NotNull
   public final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var6 = var4 ^ 24433969406129L;
      long var8 = var4 ^ 46263185021205L;

      File[] var10000;
      try {
         var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8)
            .listFiles(
               llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
            );
         if (var10000 == null) {
            var10000 = new File[0];
         }
      } catch (MatchException var24) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var24, 3598532905682251979L, var4
         );
      }

      File[] var10 = var10000;
      boolean var13 = false;
      File[] var14 = var10;
      var var15 = new ArrayList(var10.length);
      boolean var16 = false;
      int var17 = 0;

      for (int var18 = var10.length; var17 < var18; var17++) {
         File var19 = var14[var17];
         boolean var21 = false;
         Intrinsics.checkNotNull(var19);
         var15.add(FilesKt.getNameWithoutExtension(var19));
      }

      var var12 = var15;
      var13 = false;
      List var11 = CollectionsKt.sortedWith(
         var12,
         new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI()
      );

      try {
         if (!Intrinsics.areEqual(var11, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI)) {
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11;
         }

         return var11;
      } catch (MatchException var23) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var23, 3598532905682251979L, var4
         );
      }
   }

   @Nullable
   public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, long var2
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var10001 = var2 ^ 14416347250299L;
      int var4 = (int)((var2 ^ 14416347250299L) >>> 48);
      int var5 = (int)((var2 ^ 14416347250299L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 113085469040795L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18080, 616527067458148335L ^ var2)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(
         var1
      );
      if (var9 != null) {
         boolean var12 = false;
         return var9;
      } else {
         File var16 = new File(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7),
            var1 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9185, 2003002254478996114L ^ var2)
         );

         try {
            if (!var16.exists()) {
               return null;
            }
         } catch (Exception var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, -8611231762389071547L, var2
            );
         }

         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10;
         try {
            Charset var18 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(
               StandardCharsets.UTF_8,
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(27891, 719874218061479349L ^ var2)
            );
            JsonObject var17 = JsonParser.parseString(FilesKt.readText(var16, var18)).getAsJsonObject();
            Intrinsics.checkNotNull(var17);
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               (char)var4, var5, var17, (short)var6, var1
            );
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var1, var11);
            var10 = var11;
         } catch (Exception var13) {
            PolinexLogger.error(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(30607, 895965806439409358L ^ var2)
                  + var1
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(13465, 337667832893400557L ^ var2)
                  + var13.getMessage()
            );
            var10 = null;
         }

         return var10;
      }
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      long var2,
      byte var4
   ) {
      long var5 = (var2 << 8 | (long)var4 << 56 >>> 56) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var7 = var5 ^ 61861575259856L;
      long var9 = var5 ^ 49159615659987L;
      long var11 = var5 ^ 124868256130654L;
      long var13 = var5 ^ 15655729427210L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(21577, 606116655442679453L ^ var5)
      );

      boolean var15;
      try {
         String var18 = this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var11, var1.getName());
         var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var18, var7);
         File var16 = new File(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13),
            var18 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9185, 2003115661496164611L ^ var5)
         );
         String var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson(
            (JsonElement)this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var9, var1)
         );
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(23044, 5222193745632155865L ^ var5)
         );
         Charset var10002 = StandardCharsets.UTF_8;
         Intrinsics.checkNotNullExpressionValue(
            StandardCharsets.UTF_8,
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(27891, 719987896735690276L ^ var5)
         );
         FilesKt.writeText(var16, var10001, var10002);
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var18, var1);
         var15 = true;
      } catch (Exception var17) {
         PolinexLogger.error(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(19357, 1609380514273708358L ^ var5)
               + var1.getName()
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(22263, 5649632699806569523L ^ var5)
               + var17.getMessage()
         );
         var15 = false;
      }

      return var15;
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, @NotNull String var3) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var4 = var1 ^ 46028573242978L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18080, 616455612011004182L ^ var1)
      );
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.remove(var3);
      return new File(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4),
            var3 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9185, 2003073744526976107L ^ var1)
         )
         .delete();
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1, @NotNull String param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull String var1, long var2, int var4) {
      long var5 = (var2 << 32 | (long)var4 << 32 >>> 32) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var7 = var5 ^ 118177209790072L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18080, 616524462655510796L ^ var5)
      );
      return new File(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7),
            var1 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9185, 2003004876500302961L ^ var5)
         )
         .exists();
   }

   @NotNull
   public final File IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var3 = var1 ^ 136213095368952L;
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3);
   }

   @NotNull
   public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @NotNull String var1, int var2, short var3, char var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18080, 616439970616814708L ^ var5)
      );
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var1, null, null, null, 14, null
      );
      Map var8 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      boolean var9 = false;

      for (Entry var11 : var8.entrySet()) {
         boolean var13 = false;
         String var14 = (String)var11.getKey();
         Function0 var15 = (Function0)var11.getValue();
         Color var16 = (Color)var15.invoke();
         var7.getColors().put(var14, var16.getColorAsInt());
      }

      var8 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      var9 = false;

      for (Entry var23 : var8.entrySet()) {
         boolean var25 = false;
         String var27 = (String)var23.getKey();
         Function0 var29 = (Function0)var23.getValue();
         Map var10000 = var7.getShaders();
         float[] var10002 = (float[])var29.invoke();
         var10002 = Arrays.copyOf(var10002, var10002.length);
         Intrinsics.checkNotNullExpressionValue(
            var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(24463, 3005499170705323347L ^ var5)
         );
         var10000.put(var27, var10002);
      }

      var8 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      var9 = false;

      for (Entry var24 : var8.entrySet()) {
         boolean var26 = false;
         String var28 = (String)var24.getKey();
         Function0 var30 = (Function0)var24.getValue();
         var7.getNumbers().put(var28, (Float)var30.invoke());
      }

      return var7;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      long var2
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var4 = var2 ^ 61696150709590L;
      long var6 = (var2 ^ 120252141329742L) >>> 16;
      int var8 = (int)((var2 ^ 120252141329742L) << 48 >>> 48);
      long var10001 = var2 ^ 583157245723L;
      int var9 = (int)((var2 ^ 583157245723L) >>> 32);
      int var10 = (int)((var2 ^ 583157245723L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(10494, 5522931299066071263L ^ var2)
      );
      Map var13 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      boolean var14 = false;

      for (Entry var16 : var13.entrySet()) {
         boolean var18 = false;
         String var19 = (String)var16.getKey();

         int var39;
         try {
            Integer var10000 = var1.getColors().get(var19);
            if (var10000 == null) {
               continue;
            }

            var39 = var10000;
         } catch (MatchException var23) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var23, 4117661574838335519L, var2
            );
         }

         int var20 = var39;
         lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var19, new Color(var20, true));
      }

      var13 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      var14 = false;

      for (Entry var31 : var13.entrySet()) {
         boolean var33 = false;
         String var35 = (String)var31.getKey();

         float[] var40;
         try {
            var40 = var1.getShaders().get(var35);
            if (var40 == null) {
               continue;
            }
         } catch (MatchException var22) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var22, 4117661574838335519L, var2
            );
         }

         float[] var37 = var40;
         lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var41 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         float[] var10002 = Arrays.copyOf(var37, var37.length);
         Intrinsics.checkNotNullExpressionValue(
            var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(28292, 2414082745211129486L ^ var2)
         );
         float[] var12 = var10002;
         var41.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var35, var6, var12, (short)var8);
      }

      var13 = lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      var14 = false;

      for (Entry var32 : var13.entrySet()) {
         boolean var34 = false;
         String var36 = (String)var32.getKey();

         float var43;
         try {
            Float var42 = var1.getNumbers().get(var36);
            if (var42 == null) {
               continue;
            }

            var43 = var42;
         } catch (MatchException var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, 4117661574838335519L, var2
            );
         }

         float var38 = var43;
         lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, (short)var10, var36, var38, (char)var11);
      }
   }

   @NotNull
   public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      long var2
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var4 = var2 ^ 13291878295058L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(10494, 5522875158743921621L ^ var2)
      );
      String var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson(
         (JsonElement)this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var4, var1)
      );
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(20534, 4973716634058083117L ^ var2)
      );
      return var10000;
   }

   @Nullable
   public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      long param1, @NotNull String param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(@NotNull String var1, long var2) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(28117, 8068310026178883659L ^ var2)
      );

      try {
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(var1), null);
      } catch (Exception var5) {
         PolinexLogger.error(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(8232, 3262841504780270978L ^ var2) + var5.getMessage()
         );
      }
   }

   @Nullable
   public final String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, @NotNull File param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final JsonObject IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long var1,
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      JsonObject var5 = new JsonObject();
      var5.addProperty(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(29805, 7802620290075793935L ^ var1), var3.getName()
      );
      var5.addProperty(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(21016, 5998620883446152291L ^ var1), 1);
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3902128150527052111L, var1
      );
      JsonObject var6 = new JsonObject();
      int[] var4 = var10000;
      Map var7 = var3.getColors();
      boolean var8 = false;
      Iterator var9 = var7.entrySet().iterator();

      while (true) {
         if (var9.hasNext()) {
            Entry var10 = (Entry)var9.next();
            boolean var12 = false;
            String var13 = (String)var10.getKey();
            int var14 = ((Number)var10.getValue()).intValue();
            var43 = var6;
            if (var4 == null) {
               break;
            }

            String var15 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(11324, 5250300148450673220L ^ var1);
            Object[] var16 = new Object[]{var14};
            String var10002 = String.format(var15, Arrays.copyOf(var16, var16.length));
            Intrinsics.checkNotNullExpressionValue(
               var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1308, 7168143970801511264L ^ var1)
            );
            var6.addProperty(var13, "#" + var10002);
            if (var4 != null) {
               continue;
            }
         }

         var5.add(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1141, 5552534883022629398L ^ var1), (JsonElement)var6
         );
         var43 = new JsonObject();
         break;
      }

      JsonObject var27 = var43;
      Map var28 = var3.getShaders();
      boolean var30 = false;
      Iterator var32 = var28.entrySet().iterator();

      while (true) {
         if (var32.hasNext()) {
            Entry var11 = (Entry)var32.next();
            if (var4 == null) {
               break;
            }

            boolean var36 = false;
            String var37 = (String)var11.getKey();
            float[] var39 = (float[])var11.getValue();
            JsonArray var41 = new JsonArray();
            float[] var17 = var39;
            boolean var18 = false;
            int var19 = 0;
            int var20 = var39.length;

            label59: {
               while (var19 < var20) {
                  float var21 = var17[var19];
                  var10000 = var4;
                  float var22 = var21;
                  boolean var23 = false;

                  try {
                     var41.add(var22);
                     if (var10000 == null) {
                        break label59;
                     }

                     var19++;
                     if (var4 == null) {
                        break;
                     }
                  } catch (MatchException var25) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var25, 3990085819436283492L, var1
                     );
                  }
               }

               var27.add(var37, (JsonElement)var41);
            }

            if (var4 != null) {
               continue;
            }
         }

         var5.add(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(13857, 7629237144300214353L ^ var1), (JsonElement)var27
         );
         break;
      }

      JsonObject var29 = new JsonObject();
      Map var31 = var3.getNumbers();
      boolean var33 = false;
      Iterator var34 = var31.entrySet().iterator();

      String var10001;
      while (true) {
         if (var34.hasNext()) {
            Entry var35 = (Entry)var34.next();
            boolean var38 = false;
            String var40 = (String)var35.getKey();
            float var42 = ((Number)var35.getValue()).floatValue();

            try {
               var45 = var29;
               var10001 = var40;
               if (var4 == null) {
                  break;
               }

               var29.addProperty(var40, var42);
               if (var4 != null) {
                  continue;
               }
            } catch (MatchException var24) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var24, 3990085819436283492L, var1
               );
            }
         }

         var45 = var5;
         var10001 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(4175, 5949243820746669624L ^ var1);
         break;
      }

      var45.add(var10001, (JsonElement)var29);
      return var5;
   }

   private final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, int param2, JsonObject param3, short param4, String param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(String var1, long var2) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      String var4 = StringsKt.removePrefix(
         StringsKt.removePrefix(var1, "#"),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1180, 2550006333704608255L ^ var2)
      );

      try {
         switch (var4.length()) {
            case 6:
               return (int)IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                  | (int)Long.parseLong(var4, CharsKt.checkRadix(16));
            case 7:
            default:
               return -1;
            case 8:
               return (int)Long.parseLong(var4, CharsKt.checkRadix(16));
         }
      } catch (MatchException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, -4301235951631973003L, var2
         );
      }
   }

   @NotNull
   public final String IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param0, File param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 132384827590540L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[43];
      int var12 = 0;
      String var11 = "\u0084Yÿ\u0091\u0097b\u0089/\u0007B\u0081\u0088s¯\u0092[\u0018\u008d§NÝð\u009dV+WÅ/ÜCÛ©:\u009aVÏ\u0002\u000eÐ\u0081P\u0010¬\\Ò rbà\u001f,s}\u0085\u0014é]\u0083\u0010\u009b·¹\u001bí¨\u0014\u0017\u008fié\b)Ú¶\u0094\u0010¿c1³\u000482\u0019\b¶\n\u008c3ü\u0017!0\u0086\u000b0§hã<¬ß\u009e`i\"Òµ«\u0012óõx¼SÛ\u008bæ.òã\u00ad\u008bD¾>¯Z\u0083ºyãçL\u009e¦[ÒB\u0080Â\u0010\u001dëp>Vmïþ£s\n³ µÐ\u009f\u0010.ÑQ¾ô\u0099,Uì\u0096Û¿^2\u0088 \u0010õä\u0096¸®p!\u0098»\"¨àË\u000b\u0007ú\u0010º\u00926(ûø\bþ§Þ\u0086ã\u001bâº×0µ\u0095\"pAnnZ:E¯üiIb\b\u0002\u0019XNÍ½4ÍÀÍ\u0004\u0092\u0090\u0014À\u008b\u0088;\u0015\u0000Ïp\u009f_\u007f2»504\u0004Ô\u0010V\u0018\u0083aµÁ\u0085éûIßáùi\u0004\\ \u0002R\u0013£Ámà}\u009dª¦³«c\t¦pÍ`\nóJ²\u007fæqÔåj#0~ (MJªÑ\u0011\u0081à\u0098JÕ×Ö\u000f\u0080\\1sÖí¢\u008c\u0019jñ\u001e\u000e\u008bz\u001c\u0089A 'Ë;\u0016,öÕà\u007fVÕC\u0088Ò,\u0016§\u0018Ò\u0011âR;¶¬·\u0087Àµ\u009fÿ\u0019 avÃpq(\u007f÷àa\\æðºS\u0083O¯Â\u007fwE\u008axÅ¢«P·wQú(\u0015\u0000þlßþÎÈµ0Îy\u009cm.¡<\f²OÈ[>\rF\u0085\u001c\u009do6¼\u0005¤éìæ\u0019Ñ»\u001e\u0010\u0016Î*D¤\u0016\u009e\u008cA\u001a\u0014òð¼EË\u0010Ù_J\bZ\\§Ù$\u001f°\u0003þ×r\u0083\u0010ÈÝûd¢\u0091×t#ûÏFôñ\u0016r\u0010\u0097îãtÙjGµ\u0099tßô\u00061Z¥0²\u0088R\u0017õ#*ï´êIQ\u0019wÛ5\n\b^º]ûå~kþÚ\u0018üªÐÝ¥ð\u0087Ö\u0085ºAõÔMÊLÛ\u009bø>  dÃ¨\u0091T·)]íß_\u0001ÏI¦\"#¯l\u009b_\u008f\u008f\u0094;ùÄý\u000eG¥\u0010â¾cÅS-ì\u001d*\u0087*\u0018\"ÜI\f\u0010\u0003y\u0092\\\u0012`êÜ{ÓÝ\u0085Í\u0014§¾ `_\u009dþ\u0006\u0096?'\r\u0087ëªW]µf\u0092ÛÞë>©ÿº\u00ad©öu\u0017\u0087\u0086Â údjO\rÏ\u0085\u0010>\u000et\u0005\u000f?g\u0091\u0006\u0018û!\u009eL\u001an½I\u008aê\u001d\u009a\u0083¼(Ðq1ÁÄ ¥\u0018\u0010ñ\u0004=DÖÏ,âÅñ«;\u0094t9\u0017Ö\u008fE\t¾\u009f:\u001b\u0093º:Ñ\u0088:'\u0010\u009f,R\n½\u0085\u0080¹\u001fQ\u0088\u0080\u008fÕ\u0088Ø s\u0082rT¡=Ü¿ëÂ6\u009c\u0005\bØ\n\u0014HòÛ5~hþ\t\u0006ß3ãï\u008e\u009a\u0010\u0018Ó2\u001eÈ\u008d;\n\u0017±\"\u0000¯Ñ ê\u0010( nØ\u001aÝo\u0082¿6¹'B©\u0015\u00928¦¡\f¾Y3ÿ\u0007CI%\u009eé\u0084\u009b\\F_N:S²ê-\u0011\nN_u_þ4ÿæ\u008eèÐýÙ\u0002\u001bÀÏ\u009eäQô]Sx°»Ëi ´\u0010KY[h\u009c@P\u008a\u008aªûZ\u0085*\u0099f\u0010).ò<ëý\u0007ÆE\u0096eÚÉ\u0001Ð\u0086(îh\u008aÒAy÷õ\u0097\u0083y«|\u000b\u001aýiMPõd\u0085õ*\\ð4Ü;Zv\nA,ç°¶\u009cf\u009a\u0010¸Ø<Õ\u009d\u0003Iä\u0007°wG9\u008a÷Ä\u0010Ïæ\u0004\u008eã\u009d¡\u0000\u008cÅBÑÂ\u0017D\u0088\u0018hÜ\u0002\u0098;\u0090»z\u0007¥~©Íôâ¦*M8ß0\u0017¬\u0005\u0010\u0011\u00adLóv»\u0005E\u0087È¦ÉÃö±,\u0010áªª\u001f\u008d²#$ãL\u0002b´dÓ\u001f";
      int var13 = "\u0084Yÿ\u0091\u0097b\u0089/\u0007B\u0081\u0088s¯\u0092[\u0018\u008d§NÝð\u009dV+WÅ/ÜCÛ©:\u009aVÏ\u0002\u000eÐ\u0081P\u0010¬\\Ò rbà\u001f,s}\u0085\u0014é]\u0083\u0010\u009b·¹\u001bí¨\u0014\u0017\u008fié\b)Ú¶\u0094\u0010¿c1³\u000482\u0019\b¶\n\u008c3ü\u0017!0\u0086\u000b0§hã<¬ß\u009e`i\"Òµ«\u0012óõx¼SÛ\u008bæ.òã\u00ad\u008bD¾>¯Z\u0083ºyãçL\u009e¦[ÒB\u0080Â\u0010\u001dëp>Vmïþ£s\n³ µÐ\u009f\u0010.ÑQ¾ô\u0099,Uì\u0096Û¿^2\u0088 \u0010õä\u0096¸®p!\u0098»\"¨àË\u000b\u0007ú\u0010º\u00926(ûø\bþ§Þ\u0086ã\u001bâº×0µ\u0095\"pAnnZ:E¯üiIb\b\u0002\u0019XNÍ½4ÍÀÍ\u0004\u0092\u0090\u0014À\u008b\u0088;\u0015\u0000Ïp\u009f_\u007f2»504\u0004Ô\u0010V\u0018\u0083aµÁ\u0085éûIßáùi\u0004\\ \u0002R\u0013£Ámà}\u009dª¦³«c\t¦pÍ`\nóJ²\u007fæqÔåj#0~ (MJªÑ\u0011\u0081à\u0098JÕ×Ö\u000f\u0080\\1sÖí¢\u008c\u0019jñ\u001e\u000e\u008bz\u001c\u0089A 'Ë;\u0016,öÕà\u007fVÕC\u0088Ò,\u0016§\u0018Ò\u0011âR;¶¬·\u0087Àµ\u009fÿ\u0019 avÃpq(\u007f÷àa\\æðºS\u0083O¯Â\u007fwE\u008axÅ¢«P·wQú(\u0015\u0000þlßþÎÈµ0Îy\u009cm.¡<\f²OÈ[>\rF\u0085\u001c\u009do6¼\u0005¤éìæ\u0019Ñ»\u001e\u0010\u0016Î*D¤\u0016\u009e\u008cA\u001a\u0014òð¼EË\u0010Ù_J\bZ\\§Ù$\u001f°\u0003þ×r\u0083\u0010ÈÝûd¢\u0091×t#ûÏFôñ\u0016r\u0010\u0097îãtÙjGµ\u0099tßô\u00061Z¥0²\u0088R\u0017õ#*ï´êIQ\u0019wÛ5\n\b^º]ûå~kþÚ\u0018üªÐÝ¥ð\u0087Ö\u0085ºAõÔMÊLÛ\u009bø>  dÃ¨\u0091T·)]íß_\u0001ÏI¦\"#¯l\u009b_\u008f\u008f\u0094;ùÄý\u000eG¥\u0010â¾cÅS-ì\u001d*\u0087*\u0018\"ÜI\f\u0010\u0003y\u0092\\\u0012`êÜ{ÓÝ\u0085Í\u0014§¾ `_\u009dþ\u0006\u0096?'\r\u0087ëªW]µf\u0092ÛÞë>©ÿº\u00ad©öu\u0017\u0087\u0086Â údjO\rÏ\u0085\u0010>\u000et\u0005\u000f?g\u0091\u0006\u0018û!\u009eL\u001an½I\u008aê\u001d\u009a\u0083¼(Ðq1ÁÄ ¥\u0018\u0010ñ\u0004=DÖÏ,âÅñ«;\u0094t9\u0017Ö\u008fE\t¾\u009f:\u001b\u0093º:Ñ\u0088:'\u0010\u009f,R\n½\u0085\u0080¹\u001fQ\u0088\u0080\u008fÕ\u0088Ø s\u0082rT¡=Ü¿ëÂ6\u009c\u0005\bØ\n\u0014HòÛ5~hþ\t\u0006ß3ãï\u008e\u009a\u0010\u0018Ó2\u001eÈ\u008d;\n\u0017±\"\u0000¯Ñ ê\u0010( nØ\u001aÝo\u0082¿6¹'B©\u0015\u00928¦¡\f¾Y3ÿ\u0007CI%\u009eé\u0084\u009b\\F_N:S²ê-\u0011\nN_u_þ4ÿæ\u008eèÐýÙ\u0002\u001bÀÏ\u009eäQô]Sx°»Ëi ´\u0010KY[h\u009c@P\u008a\u008aªûZ\u0085*\u0099f\u0010).ò<ëý\u0007ÆE\u0096eÚÉ\u0001Ð\u0086(îh\u008aÒAy÷õ\u0097\u0083y«|\u000b\u001aýiMPõd\u0085õ*\\ð4Ü;Zv\nA,ç°¶\u009cf\u009a\u0010¸Ø<Õ\u009d\u0003Iä\u0007°wG9\u008a÷Ä\u0010Ïæ\u0004\u008eã\u009d¡\u0000\u008cÅBÑÂ\u0017D\u0088\u0018hÜ\u0002\u0098;\u0090»z\u0007¥~©Íôâ¦*M8ß0\u0017¬\u0005\u0010\u0011\u00adLóv»\u0005E\u0087È¦ÉÃö±,\u0010áªª\u001f\u008d²#$ãL\u0002b´dÓ\u001f"
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
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var14;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[43];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 6343310540927178696L;
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
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var30;
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().setPrettyPrinting().create();
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new LinkedHashMap<>();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.emptyList();
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

                  var11 = "\u009aIm'b\u0093\u0004&ÈÙ§\u00ad\u0081ÒKj\u0010Cu·3æÛîÁeº|\u0095\u009f´lI";
                  var13 = "\u009aIm'b\u0093\u0004&ÈÙ§\u00ad\u0081ÒKj\u0010Cu·3æÛîÁeº|\u0095\u009f´lI".length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23173;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10
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
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/gui/clickgui/endgameGUI/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private String name;
      @NotNull
      private final LinkedHashMap<String, Integer> colors;
      @NotNull
      private final LinkedHashMap<String, float[]> shaders;
      @NotNull
      private final LinkedHashMap<String, Float> numbers;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 62653776469790L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String nameArg,
         @NotNull LinkedHashMap<String, Integer> colorsArg,
         @NotNull LinkedHashMap<String, float[]> shadersArg,
         @NotNull LinkedHashMap<String, Float> numbersArg
      ) {
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 79625494844842L;
         Intrinsics.checkNotNullParameter(nameArg, "name");
         Intrinsics.checkNotNullParameter(colorsArg, "colors");
         Intrinsics.checkNotNullParameter(shadersArg, "shaders");
         Intrinsics.checkNotNullParameter(numbersArg, "numbers");
         super();
         this.name = nameArg;
         this.colors = colorsArg;
         this.shaders = shadersArg;
         this.numbers = numbersArg;
      }

      @NotNull
      public final String getName() {
         return this.name;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String var1, long var2) {
         var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19951, 2701560246881877884L ^ var2)
         );
         this.name = var1;
      }

      @NotNull
      public final LinkedHashMap<String, Integer> getColors() {
         return this.colors;
      }

      @NotNull
      public final LinkedHashMap<String, float[]> getShaders() {
         return this.shaders;
      }

      @NotNull
      public final LinkedHashMap<String, Float> getNumbers() {
         return this.numbers;
      }

      @NotNull
      public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         @NotNull String var1, long var2
      ) {
         var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(687, 5873190915824269028L ^ var2)
         );
         llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var5 = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, null, null, null, 14, null
         );
         int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            -5367422275341710613L, var2
         );
         var5.colors.putAll(this.colors);
         Map var6 = this.shaders;
         boolean var7 = false;
         int[] var4 = var10000;
         Iterator var8 = var6.entrySet().iterator();

         while (true) {
            if (var8.hasNext()) {
               Entry var9 = (Entry)var8.next();
               var10000 = var4;
               boolean var11 = false;
               String var12 = (String)var9.getKey();
               float[] var13 = (float[])var9.getValue();

               try {
                  Map var10001 = var5.shaders;
                  float[] var10003 = Arrays.copyOf(var13, var13.length);
                  Intrinsics.checkNotNullExpressionValue(
                     var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20053, 4874210513062820376L ^ var2)
                  );
                  var10001.put(var12, var10003);
                  if (var10000 == null) {
                     break;
                  }

                  if (var4 != null) {
                     continue;
                  }
               } catch (MatchException var14) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var14, -5342141802522379125L, var2
                  );
               }
            }

            var5.numbers.putAll(this.numbers);
            break;
         }

         return var5;
      }

      @NotNull
      public final llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, long var2, @NotNull LinkedHashMap var4, @NotNull LinkedHashMap var5, @NotNull LinkedHashMap var6
      ) {
         var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(468, 9212806542727313549L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24764, 2120485220917385710L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21290, 7114153364771154554L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9357, 7021852847916899801L ^ var2)
         );
         return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var4, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 140456021359631L;
         LinkedHashMap var3 = this.numbers;
         LinkedHashMap var4 = this.shaders;
         LinkedHashMap var5 = this.colors;
         String var6 = this.name;
         return "ThemeData(name=" + var6 + ", colors=" + var5 + ", shaders=" + var4 + ", numbers=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.name.hashCode();
         var1 = var1 * 31 + this.colors.hashCode();
         var1 = var1 * 31 + this.shaders.hashCode();
         return var1 * 31 + this.numbers.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         this(null, null, null, null, 15, null);
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 126200067706290L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[16];
         int var7 = 0;
         String var6 = "\u0000¸\u0011`!+tmË\u0013yPÚÒ\u0098\u0018\u0018Op¾\u0089\u008c^hÔ\rKÚ\\\u008cfRµ#çqs6Q\u00ad\u0018\u00189\u0006\u001añÝ¢Mb³4/R\få%ª¤á]%\b\u0092/z\u0010\u009e£Ø«\"h«Cû\u00817vUm³\u0001\u0018A\u009dÑ8\u001bY\u0090÷i|2/vÙóÿä¯l\u0092^ïUú\u0010V6¥ÎwÛ\u0088KÕT Æï\u0095í\u009e\u0018°\u0011\u000fI$\u0001Ø2%ødý¢5Cr\u0088\t\u0097y¿?,¶\u0010\u0086w¾ç\u0016;;\n»£Á\u0092VYK¶\u0010÷Ä.Ø\u009cDìË= ¶t\u0015ÑÝ\u0092\u0018¹É!Î¹6ãÅ£2Q<\u009c×»tf´VØuw\u001dµ\u0010¾%æN¸¤À\f6èÕ\u0011\u00924ã_ ¬}\u0090þ8Õ¬¬\u0002Õ\u008a/&`óZ\\l}\u007f»Z>f1\u001e®¿s\u008bïý\u0010\u00adE\u0004¢þ¼ì\u0096°wè\u001f²cbË\u0010uwÃ±\rÂÅ|\u008dÈhU\u0018J\u0007×";
         int var8 = "\u0000¸\u0011`!+tmË\u0013yPÚÒ\u0098\u0018\u0018Op¾\u0089\u008c^hÔ\rKÚ\\\u008cfRµ#çqs6Q\u00ad\u0018\u00189\u0006\u001añÝ¢Mb³4/R\få%ª¤á]%\b\u0092/z\u0010\u009e£Ø«\"h«Cû\u00817vUm³\u0001\u0018A\u009dÑ8\u001bY\u0090÷i|2/vÙóÿä¯l\u0092^ïUú\u0010V6¥ÎwÛ\u0088KÕT Æï\u0095í\u009e\u0018°\u0011\u000fI$\u0001Ø2%ødý¢5Cr\u0088\t\u0097y¿?,¶\u0010\u0086w¾ç\u0016;;\n»£Á\u0092VYK¶\u0010÷Ä.Ø\u009cDìË= ¶t\u0015ÑÝ\u0092\u0018¹É!Î¹6ãÅ£2Q<\u009c×»tf´VØuw\u001dµ\u0010¾%æN¸¤À\f6èÕ\u0011\u00924ã_ ¬}\u0090þ8Õ¬¬\u0002Õ\u008a/&`óZ\\l}\u007f»Z>f1\u001e®¿s\u008bïý\u0010\u00adE\u0004¢þ¼ì\u0096°wè\u001f²cbË\u0010uwÃ±\rÂÅ|\u008dÈhU\u0018J\u0007×"
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
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[16];
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

                     var6 = "\u0005N²q÷\u009c\t\u0084\u00adÓøw\u0083Ó\u0016Å\u0010M9Õ6!\u0011J\u0095\u0083ÒvYñP^\u0001";
                     var8 = "\u0005N²q÷\u009c\t\u0084\u00adÓøw\u0083Ó\u0016Å\u0010M9Õ6!\u0011J\u0095\u0083ÒvYñP^\u0001".length();
                     var5 = 16;
                     var12 = -1;
               }

               var13 = var6.substring(++var12, var12 + var5);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 789;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/gui/clickgui/endgameGUI/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
               "me/octo/client/gui/clickgui/endgameGUI/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
