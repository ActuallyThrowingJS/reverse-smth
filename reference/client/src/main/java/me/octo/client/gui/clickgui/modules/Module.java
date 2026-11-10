package me.octo.client.gui.clickgui.modules;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import me.octo.client.PolinexAccessor;
import me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.gui.clickgui.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.modules.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Module
   implements llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI,
   lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   @NotNull
   private final String name;
   @NotNull
   private String description;
   @NotNull
   private final ModuleCategory category;
   @NotNull
   private final String subcategory;
   @NotNull
   private Setting[] settings;
   private final int IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private Minecraft IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll = 124888257652498L;
   private static String[] IllIllllIIlIlllIllllIlIIIIIIllIIIllIIlIlIIIIIlllIlIIIlIIIIllIlIIlIIIlIllIIlIIllIlIIlI;
   private static String[] llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll;
   private static Map lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII = new HashMap(13);

   public Module(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      @NotNull Setting[] settingsArg,
      int argument6Arg
   ) {
      long var7 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ 39005228593459L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super();
      this.name = nameArg;
      this.description = descriptionArg;
      this.category = categoryArg;
      this.subcategory = subcategoryArg;
      this.settings = settingsArg;
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument6Arg;
      Minecraft var10001 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var10001, "getInstance(...)");
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var10001;
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(this.settings);
      if (!(this instanceof llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII)) {
         this.category.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      }
   }

   @NotNull
   public final String getNameProperty() {
      return this.name;
   }

   @NotNull
   protected final String getDescriptionProperty() {
      return this.description;
   }

   protected final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, @NotNull String var3) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(23241, 8431192920069783584L ^ var1)
      );
      this.description = var3;
   }

   @NotNull
   public final ModuleCategory getCategory() {
      return this.category;
   }

   @NotNull
   public final String getSubcategory() {
      return this.subcategory;
   }

   @NotNull
   public final Setting[] getSettings() {
      return this.settings;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, @NotNull Setting[] var2, int var3, char var4
   ) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(6977, 4949060505705023637L ^ var5)
      );
      this.settings = var2;
   }

   public final int IIlIIIIllllIlIlIllllIIIIIIIlllIIlIIIllllIlIlIIlIIIIlIlIlIlIllIIIIIIlIIIlIllIIlIIIlllI() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final Minecraft lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Minecraft var3) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(23241, 8431195662814178937L ^ var1)
      );
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var3;
   }

   public Module(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      int argument5Arg,
      @NotNull Setting... settingsArg
   ) {
      long var7 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ 108653179103991L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      this(nameArg, descriptionArg, categoryArg, subcategoryArg, settingsArg, argument5Arg);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Setting[] var1) {
      boolean var10000;
      label39: {
         try {
            this.settings = var1;
            if (var1.length == 0) {
               var10000 = true;
               break label39;
            }
         } catch (MatchException var6) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
         }

         var10000 = false;
      }

      label32: {
         try {
            if (!var10000) {
               var10000 = true;
               break label32;
            }
         } catch (MatchException var5) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5);
         }

         var10000 = false;
      }

      if (var10000) {
         int var2 = 0;

         for (int var3 = var1.length; var2 < var3; var2++) {
            Setting var4 = var1[var2];
            var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this);
         }
      }
   }

   @Nullable
   public final Setting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public boolean llIIIllIllIIIllllllIlIlIlIIIIIIIlllIIIIlIIlIIIIIIIllllIlllIIllIllIIIIIIIIlIIIlIIIlIII(long var1) {
      String[] var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         735693125639382386L, var1
      );

      int var10000;
      label34: {
         label33: {
            try {
               var10000 = this.settings.length;
               if (var3 == null) {
                  break label34;
               }

               if (var10000 == 0) {
                  break label33;
               }
            } catch (MatchException var5) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var5, 781684384079105417L, var1
               );
            }

            var10000 = 0;
            break label34;
         }

         var10000 = 1;
      }

      try {
         if (var10000 == 0) {
            return true;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, 781684384079105417L, var1
         );
      }

      return false;
   }

   public int IlIIIllIlIlIlllIIlIIlIllllllIIIlllIllllIllllllIllIlllIllIIlIllllIlIIIIllIIIIIIIlllIll(int var1, int var2, short var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 124777421797031L;
      int var6 = (int)((var4 ^ 124777421797031L) >>> 48);
      int var7 = (int)((var4 ^ 124777421797031L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return this.llIIIIIlIIllIllIIIlllIllIlllIIlllIIlllIlIIIIlIlIlllIIIIlIIlIllIIIIIllIllIIIlIIlIlllll((short)var6, var7, var8).length;
   }

   public int IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor param1, long param2, int param4, int param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public String getName() {
      return this.name;
   }

   @NotNull
   @Override
   public String getDescription() {
      return this.description;
   }

   @NotNull
   @Override
   public String lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(long var1) {
      String var3 = this.name;
      Locale var10000 = Locale.getDefault();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(23584, 8017156148584814701L ^ var1)
      );
      String var4 = var3.toLowerCase(var10000);
      Intrinsics.checkNotNullExpressionValue(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(21729, 2141851008515772579L ^ var1)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(30898, 1662706211277618427L ^ var1) + var4;
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int argument1Arg, int argument2Arg, byte argument3Arg, @NotNull String sArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1, @NotNull String var3) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      long var4 = var1 ^ 75367660679011L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(16654, 2677475661721030500L ^ var1)
      );
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         this.name + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(21531, 316305630368488051L ^ var1) + var3, var4
      );
   }

   public final void IllllIIIIIIIlIlIllIIIlIIIIIIlIIIlIIllllIIIlIIIlIllllIIIlIllIllIlIIlllIlllIlIIIlIIlIII(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
      long var6 = var4 ^ 19197158446922L;
      PolinexAccessor.INSTANCE.eventBus.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this, var6);
   }

   public final void lIlIIIlIllIlllllIIIllllllIllIIlIIlllIlIIlIIlllIlllIlIlIIlIIlllIlllIlllllIIlllIIIIIIll(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56)
         ^ IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
      long var10001 = var4 ^ 87150648666995L;
      int var6 = (int)((var4 ^ 87150648666995L) >>> 48);
      int var7 = (int)((var4 ^ 87150648666995L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      PolinexAccessor.INSTANCE
         .eventBus
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(this, (short)var6, (short)var7, var8);
   }

   @NotNull
   public IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll lIllIllIIIlIlIlIlllIllIIlIllllIIlIlllIlIIIlIllIIlIlIIIIIlIIlllIIIIlIIIIllIlllIlIIlIlI() {
      return new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(this);
   }

   public void IIIIIlIIlIllIIlllIIIIlIIllllllllIIIllIllIIIlllIllIIIIIlIIlIIIllllllIlllllIIllIllIllII(long var1) {
   }

   public void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1, @NotNull Setting... var3) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(7461, 5085981425012031750L ^ var1)
      );
      int var4 = 0;

      for (int var5 = var3.length; var4 < var5; var4++) {
         Setting var6 = var3[var4];
         var6.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this);
      }

      me.octo.client.utils.client.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var10 = me.octo.client.utils.client.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Setting[] var11 = this.settings;
      boolean var7 = false;
      SpreadBuilder var8 = new SpreadBuilder(2);
      var8.addSpread(var11);
      var8.addSpread(var3);
      this.settings = (Setting[])var8.toArray(new Setting[var8.size()]);
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1, @NotNull Setting... var3) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5374272111510283731L, var1
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(16972, 5525415981837124162L ^ var1)
      );
      String[] var4 = var10000;
      int var5 = 0;
      int var6 = var3.length;

      while (var5 < var6) {
         Setting var7 = var3[var5];
         var7.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(null);
         var5++;
         if (var4 == null) {
            break;
         }
      }

      me.octo.client.utils.client.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var23 = me.octo.client.utils.client.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Setting[] var24 = this.settings;
      Object[] var25 = Arrays.copyOf(var3, var3.length);
      boolean var8 = false;
      boolean var10 = false;
      Setting[] var11 = var24;
      var var12 = new ArrayList();
      boolean var13 = false;
      int var14 = 0;
      int var15 = var24.length;

      while (var14 < var15) {
         Setting var16 = var11[var14];
         Setting var17 = var16;
         boolean var18 = false;

         label40: {
            label39: {
               try {
                  var27 = ArraysKt.contains(var25, var17);
                  if (var4 == null) {
                     break label40;
                  }

                  if (!var27) {
                     break label39;
                  }
               } catch (MatchException var21) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var21, -5366581235801132330L, var1
                  );
               }

               var27 = false;
               break label40;
            }

            var27 = true;
         }

         try {
            if (var27) {
               var12.add(var16);
            }
         } catch (MatchException var20) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var20, -5366581235801132330L, var1
            );
         }

         var14++;
         if (var4 == null) {
            break;
         }
      }

      var var9 = var12;
      var10 = false;
      this.settings = var9.toArray(new Setting[0]);
   }

   public boolean IIIlIlIIllllIIlIllllIlIlIlllllllllIlIlllIIlIIlIlIlIIllIIIIllIllllIIlllIIIlIIIIllllIlI() {
      return true;
   }

   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull ModuleCategory var3) {
      try {
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(21195, 4315741250691416796L ^ var1)
         );
         if (this.category == var3) {
            return true;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, 7320426818577965767L, var1
         );
      }

      return false;
   }

   @NotNull
   public final Setting[] llIIIIIlIIllIllIIIlllIllIlllIIlllIIlllIlIIIIlIlIlllIIIIlIIlIllIIIIIllIllIIIlIIlIlllll(short param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   protected final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      long var1, @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var3
   ) {
      var1 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ var1;
      long var4 = (var1 ^ 76891103545459L) >>> 8;
      int var6 = (int)((var1 ^ 76891103545459L) << 56 >>> 56);
      long var10001 = var1 ^ 20837709160324L;
      int var7 = (int)((var1 ^ 20837709160324L) >>> 32);
      int var8 = (int)((var1 ^ 20837709160324L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(1614, 2482825198687116972L ^ var1)
      );
      Setting[] var12 = this.settings;
      boolean var13 = false;
      Setting[] var14 = var12;
      Collection var15 = new ArrayList(var12.length);
      boolean var16 = false;
      int var17 = 0;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5943756900267785532L, var1
      );
      int var18 = var12.length;
      String[] var10 = var10000;

      while (true) {
         if (var17 < var18) {
            Setting var19 = var14[var17];
            var25 = var15;
            if (var10 == null) {
               break;
            }

            boolean var21 = false;
            me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var22 = new me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
            var22.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(2362, 3135956700927971798L ^ var1),
               var4,
               (byte)var6,
               var19.getName()
            );
            var19.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var8, (short)var9, var22);
            var15.add(var22);
            var17++;
            if (var10 != null) {
               continue;
            }
         }

         var25 = var15;
         break;
      }

      List var11 = (List)var25;
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(5732, 1415272757965901453L ^ var1), var4, (byte)var6, var11
      );
   }

   protected final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long param1, @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String[] var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public static String[] lllIIIllllllIllllllllIlIlIIIIIIIllIIIlIIIlIllIIIlIIlIllIIIIIIIlIIllIIIIIlIllIIlIllllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   static {
      long var9 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll ^ 103042384218023L;
      String[] var10000 = new String[3];
      String[] var11 = var10000;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var19 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var19.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[32];
      int var5 = 0;
      String var4 = "»²\u00ad¦\u0089®dQ7¹\u0081\u0085éYt\u0091\u0010\u0002µaæ\u0098\u00ad\u0083ØåzE\u009a¼=\u0002U\u0018Û\u000e\u0081²\u0098Y/Ö¼\u0007Ç¿ô[>¡\u008e¯\u009e\u0087¹ÎÂ\u008e\u0010}ß\u0098+á@ªÉñ²\u0097ÄhÎu\u001d \u009bA}Ú`\u0013D\u0096/\u009cFÂãm]ougeÙ\u007f§²p\\²ÚZe¢§H 8þpÛ\n\u009f\rJb1\u000f¶ú\r\u0084\u0014°û\u001a\u0001\u001eK?2é\u0015Z\u0086\n\u009a\u0088\u000f\u0018å0#cNÐDÚ(Þ9\u0006Ö ´¶o*\u0011DJ±\u001en(á+'_%s<\u0081KI\u008b+Ú]Ë8\u0084Ú\u0001hÁÆ½\u001bd7£¹(\u001d\u0000\"ãÜ¼ºj\u0002T\u008e {h7\u0095\u0084oÌ\u009d\u0011ªª?;F`n»ºn94Á\u0097£¬\u0013ÿf´Ê\u008c°Ĉ\u001c\u0018Ññ\u0007Õ¨\u0091EÖ\u0010ç\u0010æ?£ìí\u00836\u0017\u001dV\"!\u001bºlû\u009a\u0085òP\u0004µb È\u0093o\u009bÞ»Æõéó³Ò\u009e5ùØ\u0015R5ÌäO\u0099\u009b°B\u0081:À«\u0093ðá\u007f\u0016iP\u0089ëå¦\u0097\u0002\u009dIaO*ç\t¦1\u000e\u0092D¹\u0011r\u0092ZLäÛê\n?®×ë\u0089\u0080h\u0097\u0087ÂJcz0\u008d´_r7ÃÀ3r\u001e\u0005\u009b=^i\u008eË\u00157]t«éz¨\u000e;\u0095¿ê\u000eå¶[\u0014\u008dg\u000bÀà<¨§Ô\u0097î§¤Í\u008f\u0082Âµf³\u009c\bL\u0016\u009e\u0084ÕyÚUùá(\u0091lß\u0005«\fê±ØK\u0099\u001d|ñþK\t\u0093¼g=o`eî¼\u001dÓ\u0004J3^\u009e³ õ* IÜf¾\u0013I\u009d\u0093dA/\u009b|\u009b\u0091*v\r\u001eOØ:ç§\u008f§±W~ÿ¢\u009bp¦×Ó=\u001b\bÁÒã\u0010±\u0015IÊ·¥O%Ô\u0007V_\u008a3__\u0018&.\rtVsj5\u0015BÃ\u0002\u009e¡ïCA&o²J°&|\u0010ÜxËªÎÈ\u0006\u0085\u0089B\\\u0095Ø\u008dË\u0012\u0010P\u0012XêjàÌ}Å6\u008a\u001eiá¨k\u0010¢¨uæ\\\u001c=mö\u0087ÞWyGja\u0010ÿã©÷z\u009f?\u00962'\u0081£\u008eH\u009d¢(xsSùïHÐ\u008d[Áfø\u0098\u0000½$Þ\u0005\u001eÈ+ëZ\u0014×\u001bÖ[gíýâE§åágKþÔ \u001cñ\u0005\u0084\u0094^\u007f¼áXMÃË¶¼¤ÝBLM\u0019ð\u0000\u001dà\u0083OÄ=/Vî\u0010|ÁpAù\u001c²TiuëÃ«Ã¬³ ýnK=ÌÝâ\u0013\t\u001fxæÊ©²6Ï¹Ã<wÂ¤f´¿Æ\nO\u0081\u0018Û\u0010Û\u009c\u008cr1)åm\u008dR¹F\u001d7©ô\u0010H¹d\u008cù||É\u0090\u0015u\u008fn\u0014|z ñ[Jò\u001d\u001f|-µMêg¼yñ4` ¹^\u0098Pt\u001eJÜ\r;¾Äù\r(â«\u001aIF\u008fï\u0090ò\u0013Ù\u0002¬·Ìc°'\u0098\u0096V5FD|A\u0010(£>\u008b~@\u008b\u008c\u0097Ï\u008c\u0011 \u0010\u009e\u0099·\u0093éÑ@ñ\u0090\fw\u0086\u008dé/\u0001 ÝXiÚ]Æ\u009a°Ù°o²Ü\u0087\u0089æ\u0094\u009a¥}\r iÚ\u0091é:ó©\"Rà\u0010³Bóë\u0011®QIñäp«<ÔX\u0007P~D)<\u001b\u0087AION5[;ã<~Ât\u0086TZ<õÖ*\u0094\u0094Oã\u0080 K©V\u001c\u0084ÒzÝ§\u0012\f¯§I\u0006\u0003©É_¡or\u0005\u0095ÞË\"â.§¸[òåõ\u0012&ý\u008b\u0092þ\u0004\u0012³ÿ\u0091\u000el3 ñÀ$mFªF\u0012t\tÖ1ì\u009bÿÑc^\u0002ÞË\u008a`¶²n\t\u0011\u0092ðÔ«\u0010=÷Í\u0086\u008cb×¿p¯¸\u008f\u009c\u0017m_";
      int var6 = "»²\u00ad¦\u0089®dQ7¹\u0081\u0085éYt\u0091\u0010\u0002µaæ\u0098\u00ad\u0083ØåzE\u009a¼=\u0002U\u0018Û\u000e\u0081²\u0098Y/Ö¼\u0007Ç¿ô[>¡\u008e¯\u009e\u0087¹ÎÂ\u008e\u0010}ß\u0098+á@ªÉñ²\u0097ÄhÎu\u001d \u009bA}Ú`\u0013D\u0096/\u009cFÂãm]ougeÙ\u007f§²p\\²ÚZe¢§H 8þpÛ\n\u009f\rJb1\u000f¶ú\r\u0084\u0014°û\u001a\u0001\u001eK?2é\u0015Z\u0086\n\u009a\u0088\u000f\u0018å0#cNÐDÚ(Þ9\u0006Ö ´¶o*\u0011DJ±\u001en(á+'_%s<\u0081KI\u008b+Ú]Ë8\u0084Ú\u0001hÁÆ½\u001bd7£¹(\u001d\u0000\"ãÜ¼ºj\u0002T\u008e {h7\u0095\u0084oÌ\u009d\u0011ªª?;F`n»ºn94Á\u0097£¬\u0013ÿf´Ê\u008c°Ĉ\u001c\u0018Ññ\u0007Õ¨\u0091EÖ\u0010ç\u0010æ?£ìí\u00836\u0017\u001dV\"!\u001bºlû\u009a\u0085òP\u0004µb È\u0093o\u009bÞ»Æõéó³Ò\u009e5ùØ\u0015R5ÌäO\u0099\u009b°B\u0081:À«\u0093ðá\u007f\u0016iP\u0089ëå¦\u0097\u0002\u009dIaO*ç\t¦1\u000e\u0092D¹\u0011r\u0092ZLäÛê\n?®×ë\u0089\u0080h\u0097\u0087ÂJcz0\u008d´_r7ÃÀ3r\u001e\u0005\u009b=^i\u008eË\u00157]t«éz¨\u000e;\u0095¿ê\u000eå¶[\u0014\u008dg\u000bÀà<¨§Ô\u0097î§¤Í\u008f\u0082Âµf³\u009c\bL\u0016\u009e\u0084ÕyÚUùá(\u0091lß\u0005«\fê±ØK\u0099\u001d|ñþK\t\u0093¼g=o`eî¼\u001dÓ\u0004J3^\u009e³ õ* IÜf¾\u0013I\u009d\u0093dA/\u009b|\u009b\u0091*v\r\u001eOØ:ç§\u008f§±W~ÿ¢\u009bp¦×Ó=\u001b\bÁÒã\u0010±\u0015IÊ·¥O%Ô\u0007V_\u008a3__\u0018&.\rtVsj5\u0015BÃ\u0002\u009e¡ïCA&o²J°&|\u0010ÜxËªÎÈ\u0006\u0085\u0089B\\\u0095Ø\u008dË\u0012\u0010P\u0012XêjàÌ}Å6\u008a\u001eiá¨k\u0010¢¨uæ\\\u001c=mö\u0087ÞWyGja\u0010ÿã©÷z\u009f?\u00962'\u0081£\u008eH\u009d¢(xsSùïHÐ\u008d[Áfø\u0098\u0000½$Þ\u0005\u001eÈ+ëZ\u0014×\u001bÖ[gíýâE§åágKþÔ \u001cñ\u0005\u0084\u0094^\u007f¼áXMÃË¶¼¤ÝBLM\u0019ð\u0000\u001dà\u0083OÄ=/Vî\u0010|ÁpAù\u001c²TiuëÃ«Ã¬³ ýnK=ÌÝâ\u0013\t\u001fxæÊ©²6Ï¹Ã<wÂ¤f´¿Æ\nO\u0081\u0018Û\u0010Û\u009c\u008cr1)åm\u008dR¹F\u001d7©ô\u0010H¹d\u008cù||É\u0090\u0015u\u008fn\u0014|z ñ[Jò\u001d\u001f|-µMêg¼yñ4` ¹^\u0098Pt\u001eJÜ\r;¾Äù\r(â«\u001aIF\u008fï\u0090ò\u0013Ù\u0002¬·Ìc°'\u0098\u0096V5FD|A\u0010(£>\u008b~@\u008b\u008c\u0097Ï\u008c\u0011 \u0010\u009e\u0099·\u0093éÑ@ñ\u0090\fw\u0086\u008dé/\u0001 ÝXiÚ]Æ\u009a°Ù°o²Ü\u0087\u0089æ\u0094\u009a¥}\r iÚ\u0091é:ó©\"Rà\u0010³Bóë\u0011®QIñäp«<ÔX\u0007P~D)<\u001b\u0087AION5[;ã<~Ât\u0086TZ<õÖ*\u0094\u0094Oã\u0080 K©V\u001c\u0084ÒzÝ§\u0012\f¯§I\u0006\u0003©É_¡or\u0005\u0095ÞË\"â.§¸[òåõ\u0012&ý\u008b\u0092þ\u0004\u0012³ÿ\u0091\u000el3 ñÀ$mFªF\u0012t\tÖ1ì\u009bÿÑc^\u0002ÞË\u008a`¶²n\t\u0011\u0092ðÔ«\u0010=÷Í\u0086\u008cb×¿p¯¸\u008f\u009c\u0017m_"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var23 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var23;
         if ((var2 += var3) >= var6) {
            var4 = "à\u0000Ì\u0002lVÈ¹oz\u0016t\u008c\u001bÔm\u0093-÷\u0012_:\u009c®\u009c\u008fH¼5R;¤\u0018°¼(\u001f2©>9`Sº>_FF\u0003>kJC`\u0095Å\u0098";
            var6 = "à\u0000Ì\u0002lVÈ¹oz\u0016t\u008c\u001bÔm\u0093-÷\u0012_:\u009c®\u009c\u008fH¼5R;¤\u0018°¼(\u001f2©>9`Sº>_FF\u0003>kJC`\u0095Å\u0098"
               .length();
            var3 = ' ';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var25 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
               boolean var21 = false;
               var7[var5++] = var25;
               if ((var2 += var3) >= var6) {
                  IllIllllIIlIlllIllllIlIIIIIIllIIIllIIlIlIIIIIlllIlIIIlIIIIllIlIIlIIIlIllIIlIIllIlIIlI = var7;
                  llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll = new String[32];
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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

   private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30559;
      if (llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
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
         byte[] var9 = IllIllllIIlIlllIllllIlIIIIIIllIIIllIIlIlIIIIIlllIlIIIlIIIIllIlIIlIIIlIllIIlIIllIlIIlI[var5].getBytes("ISO-8859-1");
         llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll[var5];
   }

   private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var4, var5);
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
            "me/octo/client/gui/clickgui/modules/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
