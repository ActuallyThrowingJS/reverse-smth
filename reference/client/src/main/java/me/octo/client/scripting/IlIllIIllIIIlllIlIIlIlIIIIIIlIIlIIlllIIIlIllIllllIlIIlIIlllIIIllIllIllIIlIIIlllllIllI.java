package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import org.graalvm.polyglot.Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI
   extends me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   implements IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll {
   @NotNull
   private final String ownerScriptName;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll script;
   @NotNull
   private final BooleanSetting showInGui;
   @NotNull
   private final Map<String, Setting> llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   @NotNull
   private final HashMap<String, Value> llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   @NotNull
   private final List<Value> IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   @NotNull
   private final List<Value> llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   @NotNull
   private final List<me.octo.client.modules.helpers.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @Nullable
   private Value IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @Nullable
   private Value lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @Nullable
   private Value llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @Nullable
   private Value lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @Nullable
   private Value lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @Nullable
   private Value IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @Nullable
   private String lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private String IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @Nullable
   private String IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final HashSet<Value> lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private static long llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = 40632425994211L;
   private static String[] lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static String[] IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private static Map lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new HashMap(13);
   private static long IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static long[] lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private static Long[] lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private static Map IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;

   public IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
      @NotNull String ownerScriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull String subcategoryArg,
      @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll scriptArg,
      @NotNull Setting[] settingsArg,
      @NotNull Map<String, ? extends Setting> settingIdsArg,
      @NotNull BooleanSetting showInGuiArg
   ) {
      long var9 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ 29651013490693L;
      Intrinsics.checkNotNullParameter(ownerScriptNameArg, "ownerScriptName");
      lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(scriptArg, "script");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      Intrinsics.checkNotNullParameter(settingIdsArg, "settingIds");
      Intrinsics.checkNotNullParameter(showInGuiArg, "showInGui");
      super(
         nameArg,
         descriptionArg,
         ModuleCategory.MACROS,
         subcategoryArg,
         CollectionsKt.emptyList(),
         CollectionsKt.emptyList(),
         false,
         Arrays.copyOf(settingsArg, settingsArg.length)
      );
      this.ownerScriptName = ownerScriptNameArg;
      this.script = scriptArg;
      this.showInGui = showInGuiArg;
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = new LinkedHashMap<>(settingIdsArg);
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = new HashMap<>();
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = new ArrayList<>();
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = new ArrayList<>();
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new ArrayList<>();

      try {
         this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new HashSet<>();
         if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            String var12 = "ZwjER";
            lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               var12
            );
         }
      } catch (IllegalArgumentException var14) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var14);
      }
   }

   @NotNull
   @Override
   public String getOwnerScriptName() {
      return this.ownerScriptName;
   }

   @NotNull
   @Override
   public String IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final String llllIlllIIIlIllIlIIIIIIlllIlIlIIIIIIIlllIlllIIllIlIIlIIlIIlIIllllIIllIIIlIlIlIlllllIl(int param1, int param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull ModuleCategory param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String var1, long var2, @NotNull Value var4) {
      var2 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(24949, 1682298407810294338L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217718696065669960L ^ var2)
      );
      Map var10000 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
      String var10001 = var1.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(
         var10001, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(3111, 3584217774978502518L ^ var2)
      );
      var10000.put(var10001, var4);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1, char var2, @NotNull Value var3, int var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 114608917238645L;
      int var7 = (int)((var5 ^ 114608917238645L) >>> 48);
      int var8 = (int)((var5 ^ 114608917238645L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217661225429769775L ^ var5)
      );
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(24728, 3470520286939080397L ^ var5),
         (char)var7,
         var8,
         var9,
         var3
      );
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, @NotNull Value var3) {
      var1 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var1;
      long var10001 = var1 ^ 125362045452569L;
      int var4 = (int)((var1 ^ 125362045452569L) >>> 48);
      int var5 = (int)((var1 ^ 125362045452569L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(19698, 5539485878642972915L ^ var1)
      );
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(25426, 8912806384442587003L ^ var1),
         (char)var4,
         var5,
         var6,
         var3
      );
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull Value var1, long var2) {
      var2 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var2;
      long var10001 = var2 ^ 18262973330405L;
      int var4 = (int)((var2 ^ 18262973330405L) >>> 48);
      int var5 = (int)((var2 ^ 18262973330405L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217688301554073279L ^ var2)
      );
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(7120, 648316542382898529L ^ var2),
         (char)var4,
         var5,
         var6,
         var1
      );
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull Value var1, short var2, int var3, int var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 36865593673331L;
      int var7 = (int)((var5 ^ 36865593673331L) >>> 48);
      int var8 = (int)((var5 ^ 36865593673331L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var1, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217742224307211049L ^ var5)
      );
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(19299, 7583549886212479066L ^ var5),
         (char)var7,
         var8,
         var9,
         var1
      );
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(char var1, long var2, @NotNull Value var4) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 10758460799761L;
      int var7 = (int)((var5 ^ 10758460799761L) >>> 48);
      int var8 = (int)((var5 ^ 10758460799761L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var4, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217698524782999115L ^ var5)
      );
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(10137, 8666482060122589636L ^ var5),
         (char)var7,
         var8,
         var9,
         var4
      );
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var1, @NotNull Value var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var3 << 32 >>> 32) ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var4 ^ 14886133411873L;
      int var6 = (int)((var4 ^ 14886133411873L) >>> 48);
      int var7 = (int)((var4 ^ 14886133411873L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var2, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217693856498154875L ^ var4)
      );
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(17805, 8209246438726770856L ^ var4),
         (char)var6,
         var7,
         var8,
         var2
      );
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(char var1, int var2, char var3, @NotNull Value var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      Intrinsics.checkNotNullParameter(
         var4, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217651741035925718L ^ var5)
      );
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.add(var4);
   }

   public final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(@NotNull Value var1, long var2) {
      var2 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(7580, 8056235180630550470L ^ var2)
      );
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.add(var1);
   }

   private final Value llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      String var1, char var2, int var3, int var4, Value var5
   ) {
      long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var8 = var6 ^ 103975499663357L;
      String var10 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8393626975940816402L, var6
      );

      label27: {
         try {
            if (var10 != null) {
               return var5;
            }

            if (!var5.canExecute()) {
               break label27;
            }
         } catch (IllegalArgumentException var12) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var12, -8600930911594220848L, var6
            );
         }

         return var5;
      }

      String var11 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(16065, 86280279839947780L ^ var6)
         + var1
         + IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(8136, 3060461561073868060L ^ var6);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.getOwnerScriptName(),
            var8,
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
            var11
         );
      throw new IllegalArgumentException(var11);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Value param1, long param2, @NotNull Value param4, boolean param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      long param1, Value param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(
      long param1, Value param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final Object IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var1, @NotNull String var3) {
      var1 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var1;
      long var4 = var1 ^ 21013599853958L;
      Intrinsics.checkNotNullParameter(
         var3, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(3380, 855601047138139211L ^ var1)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(var3), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, long var2, @Nullable Object var4
   ) {
      var2 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var2;
      long var5 = var2 ^ 15270175211899L;
      Intrinsics.checkNotNullParameter(
         var1, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(26956, 3274098841104615175L ^ var2)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var5, this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(var1), var4
         );
   }

   @NotNull
   public final List<String> IIIIIlIlIlIlllIIlIIllIlIIlIIlIlllIllllIllIIlIIIlIIllIllllIlllIllIIIlIlllIIIIllIIIIlII() {
      return CollectionsKt.toList(this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.keySet());
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final String IIIllIllllIllIlllIIlIIIIIllIIIIIllIIllIlIlllllllllllIlIlIlIIlIIIIIIlIlIIIlllIIlIIIlIl() {
      return this.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll().getLocation().id;
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(long var1) {
      var1 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var1;
      long var3 = var1 ^ 68463790017092L;
      return this.lllIllIIllIIIllllllIIIlIIlIlIlIIlllllIllllIIIllIllllllllIIlIIlIlIlIIIIIIlIIIlllllllIl(var3);
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @NotNull String param1, long param2, @Nullable Value param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llllIlIlIlIlIllIlIlIIIlIlIIIllllIllIIIIIllllIIlIlIIlIlIIIllIIIIlIIIIIlIIlIllIIllIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(int var1, char var2, int var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 106599368378984L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII,
         var6,
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(24063, 5077802680465655656L ^ var4)
      );
   }

   @Override
   public void IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(int var1, short var2, short var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 35446192901969L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII,
         var6,
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(29144, 6056180321513664099L ^ var4)
      );
   }

   @Override
   public void llIlIIIIIllIIlIllIIlIIIIIIIIIlIlIlIllIlllllIlIllIIIIIllllllIIIllIIlIlIIlIIIlllllIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Value param1, long param2, String param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   protected void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 72683546076340L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5410061381195370874L, var1
      );
      Iterator var6 = this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.iterator();
      String var5 = var10000;

      while (var6.hasNext()) {
         Value var7 = (Value)var6.next();

         try {
            this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var3, var7);
         } catch (Exception var9) {
            PolinexLogger.error(
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(31027, 2128379706992051376L ^ var1)
                  + this.getOwnerScriptName()
                  + IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(24492, 6965518031971967604L ^ var1)
                  + var9.getMessage()
            );
            if (var5 != null) {
               break;
            }
         }
      }
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1, Value var3) {
      var1 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var1;
      long var10001 = var1 ^ 137147845163796L;
      int var4 = (int)((var1 ^ 137147845163796L) >>> 48);
      int var5 = (int)((var1 ^ 137147845163796L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 3657933400725L;
      var10001 = var1 ^ 26806406704230L;
      int var9 = (int)((var1 ^ 26806406704230L) >>> 32);
      int var10 = (int)((var1 ^ 26806406704230L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 5749852056272L;
      int var12 = (int)((var1 ^ 5749852056272L) >>> 32);
      int var13 = (int)((var1 ^ 5749852056272L) << 32 >>> 56);
      int var14 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 12949943844163L;
      int var15 = (int)((var1 ^ 12949943844163L) >>> 32);
      int var16 = (int)((var1 ^ 12949943844163L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      int var18 = (int)((var1 ^ 46054458686961L) >>> 32);
      long var19 = (var1 ^ 46054458686961L) << 32 >>> 32;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var22 = (IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)this.script
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            var9,
            var10,
            IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI,
            (char)var11
         );
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         557601073719336401L, var1
      );
      Function0 var23 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI;
      String var21 = var10000;
      Function1 var24 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI;

      label33: {
         label32: {
            label37: {
               try {
                  if (var21 != null) {
                     break label32;
                  }

                  var32 = var22.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
                  if (var32 == null) {
                     break label37;
                  }
               } catch (IllegalArgumentException var30) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var30, 332278339496345327L, var1
                  );
               }

               Value var26 = var32;
               boolean var27 = false;

               try {
                  var33 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII;
                  if (var33 != null) {
                     break label33;
                  }
               } catch (IllegalArgumentException var29) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var29, 332278339496345327L, var1
                  );
               }
            }

            try {
               ;
            } catch (IllegalArgumentException var28) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var28, 332278339496345327L, var1
               );
            }
         }

         var33 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IIIlIlIlIllIIIllIllIIlllIIIlIlllIlllIIIIIlllIIllIllIllIIIllIIIlIlIIIllIIlIllIlllIIIll;
      }

      Function0 var25 = var33;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var34 = this;
      String var38 = var22.getName();
      String var10002 = var22.getRawState().toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(
         var10002, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(3111, 3584166026456629944L ^ var1)
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var34,
         var38,
         SetsKt.setOf(var10002),
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         var22.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         var25,
         false,
         false,
         var23,
         var15,
         (short)var16,
         var24,
         96,
         (char)var17,
         null
      );
   }

   @Override
   public void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(char param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(Value param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 89138809147695L;
      long var7 = var1 ^ 95415350351522L;
      long var9 = var1 ^ 138633984235878L;
      long var11 = var1 ^ 8535903918367L;
      long var13 = var1 ^ 80955906475749L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3071030605835333876L, var1
      );
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
      String var15 = var10000;

      label40: {
         label39: {
            try {
               this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
               this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = null;
               this.IIlIIIllIllllIIlIIlIIIIIIllIIllIIIIlIIllIlIllllIlIIIllIIIlllllllllIlIIIlIlIllIlIIlIlI(var13);
               var20 = this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl.isEmpty();
               if (var15 != null) {
                  break label40;
               }

               if (!var20) {
                  break label39;
               }
            } catch (Exception var19) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var19, -3008119004183942094L, var1
               );
            }

            var20 = false;
            break label40;
         }

         var20 = true;
      }

      try {
         if (var20) {
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var5, CollectionsKt.toList(this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl)
            );
         }
      } catch (Exception var18) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var18, -3008119004183942094L, var1
         );
      }

      super.IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(var3);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.NONE,
         var7
      );

      try {
         this.script
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI, var9
            );
      } catch (Exception var17) {
         PolinexLogger.error(
            IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(31027, 2128406194257536314L ^ var1)
               + this.getOwnerScriptName()
               + IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(5100, 6419311495582371818L ^ var1)
               + var17.getMessage()
         );
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.getOwnerScriptName(),
               var11,
               IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(16941, 15291461414264379L ^ var1)
                  + var17.getMessage()
            );
      }
   }

   @Override
   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 131073166248926L;
      long var7 = var1 ^ 105434919830554L;
      long var9 = var1 ^ 17623842614854L;

      try {
         this.script
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII, var7
            );
      } catch (Exception var12) {
         PolinexLogger.error(
            IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(31027, 2128443243776833606L ^ var1)
               + this.getOwnerScriptName()
               + IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(13023, 6456430513243665323L ^ var1)
               + var12.getMessage()
         );
      }

      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.NONE,
         var5
      );
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = null;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = null;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = null;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var9, this, false, 1, null
      );
      super.IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(var3);
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2, Value var3
   ) {
      var0 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var0;
      long var4 = var0 ^ 110421409747334L;

      try {
         Boolean var10000 = var2.script.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
         if (var10000 != null) {
            return var10000;
         }
      } catch (IllegalArgumentException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -7200851528534923678L, var0
         );
      }

      return false;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var0, short var1, int var2, char var3, Value var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var7 = var5 ^ 60490727812172L;
      var0.script.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var7);
      return Unit.INSTANCE;
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, short var1, IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2, int var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var6 = var4 ^ 138409805253610L;
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var2.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll,
         var6,
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(30004, 4232811531199770160L ^ var4)
      );
   }

   private static final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      long var0, IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2, Value var3
   ) {
      var0 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var0;
      long var4 = var0 ^ 89089449702525L;

      try {
         Boolean var10000 = var2.script.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
         if (var10000 != null) {
            return var10000;
         }
      } catch (IllegalArgumentException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, 8784933823092556697L, var0
         );
      }

      return true;
   }

   private static final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
      int var0, Value var1, long var2
   ) {
      long var4 = ((long)var0 << 32 | var2 << 32 >>> 32) ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;

      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      String var10002;
      String var10003;
      long var10004;
      label27: {
         try {
            var10000 = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
            var10001 = var10000;
            var10002 = var1.getMember(
                  IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6254, 7497977267340983535L ^ var4)
               )
               .asString();
            Intrinsics.checkNotNullExpressionValue(
               var10002, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6423, 8573067805941153237L ^ var4)
            );
            var10003 = var1.getMember(
                  IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(13262, 8962595862538884865L ^ var4)
               )
               .asString();
            Intrinsics.checkNotNullExpressionValue(
               var10003, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6423, 8573067805941153237L ^ var4)
            );
            if (var1.hasMember(IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(12837, 886725166965266166L ^ var4))) {
               var10004 = var1.getMember(
                     IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(24418, 674048883258948604L ^ var4)
                  )
                  .asLong();
               break label27;
            }
         } catch (IllegalArgumentException var6) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var6, 3354742421103269117L, var4
            );
         }

         var10004 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"w">(11968, 852978098711835853L ^ var4);
      }

      long var10005 = var1.hasMember(
            IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(17303, 3526121087652521759L ^ var4)
         )
         ? var1.getMember(IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(30970, 7510819792301284352L ^ var4))
            .asLong()
         : lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"w">(27044, 8574967520861385640L ^ var4);
      Value var10006 = var1.getMember(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(29629, 2672437105716385641L ^ var4)
      );
      Intrinsics.checkNotNullExpressionValue(
         var10006, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(723, 5725510066212283994L ^ var4)
      );
      Value var10007 = var1.getMember(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(21018, 6899848741533087471L ^ var4)
      );
      Intrinsics.checkNotNullExpressionValue(
         var10007, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(17871, 4310461513814171965L ^ var4)
      );
      var10001./* $VF: Unable to resugar constructor */<init>(
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         var10007,
         var1.hasMember(IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(2107, 7649650051668749517L ^ var4))
            ? var1.getMember(IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(14223, 7674201809819865875L ^ var4))
            : null
      );
      return var10000;
   }

   private static final Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var0,
      int var1,
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2,
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
      int var4
   ) {
      long var5 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var7 = var5 ^ 121894265701447L;

      try {
         String var10000 = var2.script.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3.getProgressFn(), var7);
         if (var10000 == null) {
            var10000 = "";
         }

         return var10000;
      } catch (IllegalArgumentException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -1699223563862896104L, var5
         );
      }
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0,
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var1,
      byte var2,
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
      int var4,
      me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var5
   ) {
      long var6 = ((long)var0 << 32 | (long)var2 << 56 >>> 32 | (long)var4 << 40 >>> 40)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var8 = var6 ^ 36349389272712L;
      long var10 = var6 ^ 97693704156913L;
      Intrinsics.checkNotNullParameter(
         var5, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(30382, 7648185017186452845L ^ var6)
      );

      try {
         var1.script.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3.getOnStuckFn(), var8);
      } catch (Throwable var13) {
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1.getOwnerScriptName(),
               var10,
               IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(5361, 8490382864964970293L ^ var6)
                  + var3.getName()
                  + IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(16252, 4410113714526538902L ^ var6)
                  + var13.getMessage()
            );
      }

      return Unit.INSTANCE;
   }

   private static final boolean IIIlIlIlIllIIIllIllIIlllIIIlIlllIlllIIIIIlllIIllIllIllIIIllIIIlIlIIIllIIlIllIlllIIIll() {
      return true;
   }

   private static final long IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0
   ) {
      return var0.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
   }

   private static final String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long var0, IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var2, Value var3
   ) {
      var0 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var0;
      long var4 = var0 ^ 24486328523075L;
      return var2.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3, var4);
   }

   static {
      long var16 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ 30605824698401L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[91];
      int var23 = 0;
      String var22 = "G=!2S\u0087$=,¡\u000fag&vê\u0082R|iA©\u009c\u0011§%&\u001e:\u009fpòCß\u0018\u00998ï\u001d\u0080³\bÑ\u0080\u0000Ä;[(L\u0013ïð aêQr\u0010Ir\\\u009c\u000e\u0014]\u009b\u008fêJ\u00941D4\u0017\u008f\u0081fh_;ËGV§ßwñ@\u0018\u0011 qâÝð©ÃÝ!#OI*Ð\u0084DqQ:\f¥3\u0018\u0010bÄ\u0007Þ¯5ø\u0081F ËH¼ö'm\u0018\u0084¡EHU\u0014\u008aØøwÀÙ \u008dY\u00ad\u001cTx5â\u0080àV(\u0091S\u001c(\u0085õJ\u0003c\u00adn\u0099\u0005f\u0096Ø¶Ú\u0092\u001c¬./m sìÙ\u001b[úTCýö\u000ftY\u0093÷\u0010a_iý,\u001b÷\u009cÅ¹\u0000Ö2ª!Ó\u0010Ð\f7\n\u009fÅáu \u0089\u0013\u0016÷\u008ch\u0003\u0010Ímòµ§»\bAè{ã\u007fìí\u009by(tÛj¢\u0082ÄI÷öw\u0002\u0084[=\u0092ã\u008eËKîE\u009aÎh\u0007Ce³P\u009a\u0096À\u0091á\u000by\u0000\u0093\r³ ìMO³Öâ`5¹\u0001jù\u0094j¸ßP\u0099`|Õ6\u0080|Òô>L\u008b\u008dY®(?Ø\u0014Íþ\u0096Ý\u0097g\u0095\u0089%)Zï\u0096mÔO\u008câ\u0094\u0089Ê_¨Tá\u008fnÌP¾aSÜä\u001c}º \u0012'®\u00105\u007fØ\u009d¶3ÍÂ×¶\u001cÞ\u000e\u000b;\u0086\u0097º¦\u0019yØÇ\u009eO9\u0004\u0010 \u00919ù¾\u0017\u009f í\fA:¢\u0019]\u0012K¿\u0004\u0006\u009c\u0083@Â\bO\u0012¾¯F¢\u0006\u000e æ`J\u0086ö>\fÙ%2\u0080õìÚ¬ÅrÍ\u001aà¤ô5\u0002/Â\u0011ó@½Àª\u0010\u0011\u009b½½¸z\u0081eyI~Ö\r:\u008b, \u00ad0!õ¹rDUú\u0099Â\\\u0016\u009bÁß\u0094D#±¾@\u007f\u0095äI^\u0001¿÷hQ\u0018!\u0094\b\u0004\u000bÛt\u001bsëu}L<F3s\r\b<¯Èµ5\u0010\u009bÏç\u009fì¡\u0000'\u001fj\u0098bÌ§\u007f\u000f Í..»²FBoýkE¡+×öAi\u0012Mî\u0004Ó\u00184\u0094\u0018è¢Ùþ\u0002ù\u0010\u0081·Ï\u008fKª¡Ð\u009cÕ\u009bBÊ\u001e%  ä\u0005\u000fM$ÇÁ£\u008akå4\u0081üö\\.\u0086¼\rnî:§ð\u0096£5qÍ\u0089f\u0018z\u0014ái\u0090\u007f\nËF±\u0015ÎÖ\u0092\u0081O\u0091ã\u009fß6øp\r\u0010H\u009dc¶ B¦ÂÞÉ5×\u001e¯'d \u0088ð¾\u0001µN#\u0093Â=\u000b¢%\u008e\u0006\u0001²dç\u008au\u007f\u0007Bî¯¹d\u0004Zâ!\u0018¢\u0007f\u0017È`Þå\u0090;\u0089\u009e\u001b`cdÿÖ£ OµB\n\u0010aò\t\u0004Pm\u0010#\u0014\u0086\u0000ü¼ñ\b<\u0018n¯ñû?\u0007&\u0089Ó&\\\u0084\u0087d\u0097C3Ó\\nÄzá¿\u0018\u0085Ý\u0092Xb#\u000fêÈ\u0012\u0006Á|5EÖïTr=éI¨w §Y¢ÑßfsB©?C\u001bã3\u008f®Yuõ]üã\"7\u009cØ\u008b\u0084)O$\u00170AYë\u0011áÁ\u000e\u0093E»1\u0016\u0019\u0014\u0004\bÿ$uÖ\u0088Ø\u0092<ñÜì¼êýD§EMð\u0095y~\u008cúúÁtüÙ\u008f$V ¥=~,dÐLÒ»ð\u0017\u0082Ø\u0016ÙB\u000bÌÕ&\u0096×||<\u001fYö\u008aß;ö0\\\u0015ß\u008d\u001a\u0093\u001aÚì¼©Ê!uU'év§\tÖ¶2qÝ!\u009b\u0083\u0096¬Ò+íÈúØJNµå3¤>;\u000eêï¶(\u0014fê1áè\u001f|\u0082ø\u008d\u0001\u0007ÊÑÇÈ×z>\u0089;\u0000ëGÁ]MI×\u008f\u0017z;\n|8ÁC«\u0018$\u008a&Ê\u0091ÚT\u0095\u0012ªa:\u008eJ^Çá®óÆ\u0090/ú\u008f\u0010\u008dpm\u00020å}Þ\u0087u\u0089F\f¥ó\\\u0010P²Q(é\u00933Ë¶1>(5n·í(.o^.\u001b\u0093D\u001eOt¦\u0085J3ý\u001dS2Ø\u0006~÷\u009cb©\u009aÚO\u001a\u009d×Aò»:êË&\u0090\u0017 \u0004Oþ\u0096Ý·B\u0098á\u00062\u009e$7s2Lá\u0084$\u0010+Ýàäz\u001foÄuõá\u0018=¯\u0011Ûó\n®\u0005ÔD)|è»ý\u008dn«p(_CG4\u0010\u00115ôô\u0016ÃbÄÿ\u0004\u009fï{á\u000b`\u0018ÒñN aá\u009cÝ¹ \u0015é¹Ì\u008f5Ñ´éÖrcß\n80ÝPí\u000b\u001e5\u0090\u0096\u0012\u00801k\u0000\u0095\b°ÁÆ·\u001eÈÅ*³ýÚFeÑ4glmîZ\u000f\u0088;È+ò>.Dðüf1\u0003%\f\u00145IÃ \u001aB\u0096óü\u001eUz;\u0000\u0000\u0002N/¹\u0081½K\u0084\tÔqå}#ì±\u0001ò8¦Þ\u0010Þ\t\u0006\\¯8Î\u0084}\u0094}8\n¶e0 É¢lGq6ú\\mÚ\u008d\u001c\u0012W\u0093kJ\u0090\u001fì±§y\u0014y6Cë±C\u0094ë\u0010¡DÅûÚSªI:{û<j\u000b²î\u0018N=\u0001g\u0099ôu\u007fßÇP\u009aØ:XÜ\u0006\u001a°\u008bá\u0096ó×\u0010V?u\u0002¬5\u0084Hs\\$\u0006û\u0017ïõpâ\r\u0019Ð\u0094\u001c%Æ\u009f¢b\u008f`$\u0099dô\u0004Þ|\u0097\u000bEX%\u0087\u001d\u0099qÌ¡\u001cXcxL\u0012·AÇwvXQ\bÆ\u0096\u0085\u001d¸¶\u000f¬=¿<~\u0016\u008a\u0094n\u0099\u0092t|Ýl\u008a7Ùs&}\u0004æ©K÷\u0090\u0084Í\u0006<ú½s8{©ð~fÙ§M¼Qå@Y\fF\u0015\u008eä×z~Ú·Ûô\u0018ûa\u009cf½öKÐÖØL\u000e~*\u0012»Ñ{Rïx\r\b° \u0018õ6ê\u0083¯ÎçÄÆö7§½ê\u009cp\u008a½µL\u000b\u009at]0\r\u000fP«æö §Ó`äbõ\u001fB\u001aÒ#]Ú\u009e=ËL[³¡\u001f\u009e\u0004\u000f\u0007BRýÜô\u0012\u00ad8?µ*D9\b\u0010\u0090p¨Öu\u00ad \b±\u0091Ø\u0098wGÎ\u0094\u0010¹:4æljp\u0080F¾©¾ûLwé ½jÆ5\u0097²¥\u0083×Õ®\u0011\u008e\u0084\u0007 \u000eæ\"BÓ9Â\u0084À\u000f|ÒeFqï>Q\u0086ì\u0012\u0090'9xIôkÎ®ø¥\u0010\u009e\u000b\u008f#B4ÌLÐÇê·èC±? Þ!\u0007ïkÜ \fP(\u0097\u0018\u0090ÜÆË\u0099ÚXvµ¸µÜ\u007feß¢/ \u009e\r\u0010ÆKhË±c å4:\u0088\u0002È\u0001Kq\u0010L?òV\u0017½ÚÑ\u0088~ b:U·¦\u0018æb`\u0092\u008fMM\u001b\"jê\u0017ÈfP\u0001´hBwç!\u0080¼\u0018áQÓe8®p}]²Þ=\fn,g]ÉV_ñkÞY\u0010öä\u0096ß~¿6.aù\u0091<Îz¤* ð(\u0006\u0084úK÷\u001f\u00181\u0007:ßÝ\ró\u008eA\u008bf96+`ÎVN\u008aXdÌX ³\u0083\u0007YH¢Ü]\u0088\u0081t4C]©IçóaD%j#{1\u0092©Ø+\u0002¬A º\n+\u000f\u0081ï\u0003K5§p§7PóÊ¶\u008cârøÅ½Ú\u0090\n§ã\u008e_ã\u0002($§ïMO@Ú%ÏÃ\u0018¡g;8m©6v\u0019\u0012þ¢©¢\u0088\u0091ÞgP É]4F%WÀß{\u0018\u0099/qQ÷Û\u0019i\u00195bßüy[\u0081\u007f6¢y\u000f@pU\u0010\u000f\u0013\u0007\u009f;2&\u0082\u001b;x¡S<\u0081ä o}½¸\u001f(æe\bõþ1\u0010bXc<1\"`°\u008eøÃ\u009fÙ|\u008euÒ\u0086\u009b\u0018\u0081Tr&\u009a¥·à|\u0012)ci \u009b@ò\u008ad\u0095Áíy§\u0010ï&\u009aËa\u009d»R\u007f¥¡ü\u0017½\u0095Î ÅrX\u0013%7n~\rq\u008b\u0084Oô\u008bÁ, Ù8äzJ{\u0099wzÿÛ\u001f³Ê ¨µèífÀ}%<¢\u0004âE\u0097f¯ã\u001e£¯ó\u00adìKÒÙÝçDÞJI\u0010$£d'°h¨%ÎÎ\u0088V§\u0084ÂZ\u0010Ö5Ù\u000f¯l\u0013{Í_K\u008e\u0002\u001bäÞ\u0010®\u0012\u0095Ê~üU\u008b\u001b}0g\\¡Õà\u0018Àæået/T\bÈºqªÔ\u0095\tT¬\u0080\u001e\u000e±u±¬\u0010\u0092\u0086\u0086pqTI\u0010oV\u0016¢3$M@ \u0014_\u0005ë\u009b{×\u0017ç%r\u0085Û²xTî÷iHÖ§³µÎój\u008d'\u0084µK\u00182{OU\u0091\u000f\u0085cT´¬\u0000«¨TÔÃ\u0082Ø»H^tm\u0010´\u0094|B_\u008dv-rMì>\u000bh\u0018`(\u001b¨|ì\u008e\u0003¨c´?÷þ±ÐÕøµ\u0089úV\u0087Ø¨\u0091<K\u009a#\u0097Ic\u008dã\u0096\u0086\u0015\u008fëØ\u009d \u009eà\"¡]?t{hº\u001aE\u0015Üò6\u0083\u0085ùAäÂ*e¯!\u0085ÇÀö\u00808\u0010Ã4qd\u0080o>\f]\u00063¼\u0006x\u0005Â\u0018\fêè\u0010\u001eÏ-Vú\u0006?t5\u000fNñ©w!W·F:Î\u0010\u008d×xWU=¯¨l ¸¸¹Z?h \u0084[üÆdwjåÞîÜ\u007fAÓ\u0092\u0094s{#°\u0010\u001c¦\u0003\u0093.\u001c\u0097LTT»\u0018ç?Ó\u00191hÄ\u0086ø\u0080ü¥Ðn5±ë¿\u0013°b¶\u0093\"\u0010@\u0093¾\u009e^\u0011\t%çû\u009fCV£7È";
      int var24 = "G=!2S\u0087$=,¡\u000fag&vê\u0082R|iA©\u009c\u0011§%&\u001e:\u009fpòCß\u0018\u00998ï\u001d\u0080³\bÑ\u0080\u0000Ä;[(L\u0013ïð aêQr\u0010Ir\\\u009c\u000e\u0014]\u009b\u008fêJ\u00941D4\u0017\u008f\u0081fh_;ËGV§ßwñ@\u0018\u0011 qâÝð©ÃÝ!#OI*Ð\u0084DqQ:\f¥3\u0018\u0010bÄ\u0007Þ¯5ø\u0081F ËH¼ö'm\u0018\u0084¡EHU\u0014\u008aØøwÀÙ \u008dY\u00ad\u001cTx5â\u0080àV(\u0091S\u001c(\u0085õJ\u0003c\u00adn\u0099\u0005f\u0096Ø¶Ú\u0092\u001c¬./m sìÙ\u001b[úTCýö\u000ftY\u0093÷\u0010a_iý,\u001b÷\u009cÅ¹\u0000Ö2ª!Ó\u0010Ð\f7\n\u009fÅáu \u0089\u0013\u0016÷\u008ch\u0003\u0010Ímòµ§»\bAè{ã\u007fìí\u009by(tÛj¢\u0082ÄI÷öw\u0002\u0084[=\u0092ã\u008eËKîE\u009aÎh\u0007Ce³P\u009a\u0096À\u0091á\u000by\u0000\u0093\r³ ìMO³Öâ`5¹\u0001jù\u0094j¸ßP\u0099`|Õ6\u0080|Òô>L\u008b\u008dY®(?Ø\u0014Íþ\u0096Ý\u0097g\u0095\u0089%)Zï\u0096mÔO\u008câ\u0094\u0089Ê_¨Tá\u008fnÌP¾aSÜä\u001c}º \u0012'®\u00105\u007fØ\u009d¶3ÍÂ×¶\u001cÞ\u000e\u000b;\u0086\u0097º¦\u0019yØÇ\u009eO9\u0004\u0010 \u00919ù¾\u0017\u009f í\fA:¢\u0019]\u0012K¿\u0004\u0006\u009c\u0083@Â\bO\u0012¾¯F¢\u0006\u000e æ`J\u0086ö>\fÙ%2\u0080õìÚ¬ÅrÍ\u001aà¤ô5\u0002/Â\u0011ó@½Àª\u0010\u0011\u009b½½¸z\u0081eyI~Ö\r:\u008b, \u00ad0!õ¹rDUú\u0099Â\\\u0016\u009bÁß\u0094D#±¾@\u007f\u0095äI^\u0001¿÷hQ\u0018!\u0094\b\u0004\u000bÛt\u001bsëu}L<F3s\r\b<¯Èµ5\u0010\u009bÏç\u009fì¡\u0000'\u001fj\u0098bÌ§\u007f\u000f Í..»²FBoýkE¡+×öAi\u0012Mî\u0004Ó\u00184\u0094\u0018è¢Ùþ\u0002ù\u0010\u0081·Ï\u008fKª¡Ð\u009cÕ\u009bBÊ\u001e%  ä\u0005\u000fM$ÇÁ£\u008akå4\u0081üö\\.\u0086¼\rnî:§ð\u0096£5qÍ\u0089f\u0018z\u0014ái\u0090\u007f\nËF±\u0015ÎÖ\u0092\u0081O\u0091ã\u009fß6øp\r\u0010H\u009dc¶ B¦ÂÞÉ5×\u001e¯'d \u0088ð¾\u0001µN#\u0093Â=\u000b¢%\u008e\u0006\u0001²dç\u008au\u007f\u0007Bî¯¹d\u0004Zâ!\u0018¢\u0007f\u0017È`Þå\u0090;\u0089\u009e\u001b`cdÿÖ£ OµB\n\u0010aò\t\u0004Pm\u0010#\u0014\u0086\u0000ü¼ñ\b<\u0018n¯ñû?\u0007&\u0089Ó&\\\u0084\u0087d\u0097C3Ó\\nÄzá¿\u0018\u0085Ý\u0092Xb#\u000fêÈ\u0012\u0006Á|5EÖïTr=éI¨w §Y¢ÑßfsB©?C\u001bã3\u008f®Yuõ]üã\"7\u009cØ\u008b\u0084)O$\u00170AYë\u0011áÁ\u000e\u0093E»1\u0016\u0019\u0014\u0004\bÿ$uÖ\u0088Ø\u0092<ñÜì¼êýD§EMð\u0095y~\u008cúúÁtüÙ\u008f$V ¥=~,dÐLÒ»ð\u0017\u0082Ø\u0016ÙB\u000bÌÕ&\u0096×||<\u001fYö\u008aß;ö0\\\u0015ß\u008d\u001a\u0093\u001aÚì¼©Ê!uU'év§\tÖ¶2qÝ!\u009b\u0083\u0096¬Ò+íÈúØJNµå3¤>;\u000eêï¶(\u0014fê1áè\u001f|\u0082ø\u008d\u0001\u0007ÊÑÇÈ×z>\u0089;\u0000ëGÁ]MI×\u008f\u0017z;\n|8ÁC«\u0018$\u008a&Ê\u0091ÚT\u0095\u0012ªa:\u008eJ^Çá®óÆ\u0090/ú\u008f\u0010\u008dpm\u00020å}Þ\u0087u\u0089F\f¥ó\\\u0010P²Q(é\u00933Ë¶1>(5n·í(.o^.\u001b\u0093D\u001eOt¦\u0085J3ý\u001dS2Ø\u0006~÷\u009cb©\u009aÚO\u001a\u009d×Aò»:êË&\u0090\u0017 \u0004Oþ\u0096Ý·B\u0098á\u00062\u009e$7s2Lá\u0084$\u0010+Ýàäz\u001foÄuõá\u0018=¯\u0011Ûó\n®\u0005ÔD)|è»ý\u008dn«p(_CG4\u0010\u00115ôô\u0016ÃbÄÿ\u0004\u009fï{á\u000b`\u0018ÒñN aá\u009cÝ¹ \u0015é¹Ì\u008f5Ñ´éÖrcß\n80ÝPí\u000b\u001e5\u0090\u0096\u0012\u00801k\u0000\u0095\b°ÁÆ·\u001eÈÅ*³ýÚFeÑ4glmîZ\u000f\u0088;È+ò>.Dðüf1\u0003%\f\u00145IÃ \u001aB\u0096óü\u001eUz;\u0000\u0000\u0002N/¹\u0081½K\u0084\tÔqå}#ì±\u0001ò8¦Þ\u0010Þ\t\u0006\\¯8Î\u0084}\u0094}8\n¶e0 É¢lGq6ú\\mÚ\u008d\u001c\u0012W\u0093kJ\u0090\u001fì±§y\u0014y6Cë±C\u0094ë\u0010¡DÅûÚSªI:{û<j\u000b²î\u0018N=\u0001g\u0099ôu\u007fßÇP\u009aØ:XÜ\u0006\u001a°\u008bá\u0096ó×\u0010V?u\u0002¬5\u0084Hs\\$\u0006û\u0017ïõpâ\r\u0019Ð\u0094\u001c%Æ\u009f¢b\u008f`$\u0099dô\u0004Þ|\u0097\u000bEX%\u0087\u001d\u0099qÌ¡\u001cXcxL\u0012·AÇwvXQ\bÆ\u0096\u0085\u001d¸¶\u000f¬=¿<~\u0016\u008a\u0094n\u0099\u0092t|Ýl\u008a7Ùs&}\u0004æ©K÷\u0090\u0084Í\u0006<ú½s8{©ð~fÙ§M¼Qå@Y\fF\u0015\u008eä×z~Ú·Ûô\u0018ûa\u009cf½öKÐÖØL\u000e~*\u0012»Ñ{Rïx\r\b° \u0018õ6ê\u0083¯ÎçÄÆö7§½ê\u009cp\u008a½µL\u000b\u009at]0\r\u000fP«æö §Ó`äbõ\u001fB\u001aÒ#]Ú\u009e=ËL[³¡\u001f\u009e\u0004\u000f\u0007BRýÜô\u0012\u00ad8?µ*D9\b\u0010\u0090p¨Öu\u00ad \b±\u0091Ø\u0098wGÎ\u0094\u0010¹:4æljp\u0080F¾©¾ûLwé ½jÆ5\u0097²¥\u0083×Õ®\u0011\u008e\u0084\u0007 \u000eæ\"BÓ9Â\u0084À\u000f|ÒeFqï>Q\u0086ì\u0012\u0090'9xIôkÎ®ø¥\u0010\u009e\u000b\u008f#B4ÌLÐÇê·èC±? Þ!\u0007ïkÜ \fP(\u0097\u0018\u0090ÜÆË\u0099ÚXvµ¸µÜ\u007feß¢/ \u009e\r\u0010ÆKhË±c å4:\u0088\u0002È\u0001Kq\u0010L?òV\u0017½ÚÑ\u0088~ b:U·¦\u0018æb`\u0092\u008fMM\u001b\"jê\u0017ÈfP\u0001´hBwç!\u0080¼\u0018áQÓe8®p}]²Þ=\fn,g]ÉV_ñkÞY\u0010öä\u0096ß~¿6.aù\u0091<Îz¤* ð(\u0006\u0084úK÷\u001f\u00181\u0007:ßÝ\ró\u008eA\u008bf96+`ÎVN\u008aXdÌX ³\u0083\u0007YH¢Ü]\u0088\u0081t4C]©IçóaD%j#{1\u0092©Ø+\u0002¬A º\n+\u000f\u0081ï\u0003K5§p§7PóÊ¶\u008cârøÅ½Ú\u0090\n§ã\u008e_ã\u0002($§ïMO@Ú%ÏÃ\u0018¡g;8m©6v\u0019\u0012þ¢©¢\u0088\u0091ÞgP É]4F%WÀß{\u0018\u0099/qQ÷Û\u0019i\u00195bßüy[\u0081\u007f6¢y\u000f@pU\u0010\u000f\u0013\u0007\u009f;2&\u0082\u001b;x¡S<\u0081ä o}½¸\u001f(æe\bõþ1\u0010bXc<1\"`°\u008eøÃ\u009fÙ|\u008euÒ\u0086\u009b\u0018\u0081Tr&\u009a¥·à|\u0012)ci \u009b@ò\u008ad\u0095Áíy§\u0010ï&\u009aËa\u009d»R\u007f¥¡ü\u0017½\u0095Î ÅrX\u0013%7n~\rq\u008b\u0084Oô\u008bÁ, Ù8äzJ{\u0099wzÿÛ\u001f³Ê ¨µèífÀ}%<¢\u0004âE\u0097f¯ã\u001e£¯ó\u00adìKÒÙÝçDÞJI\u0010$£d'°h¨%ÎÎ\u0088V§\u0084ÂZ\u0010Ö5Ù\u000f¯l\u0013{Í_K\u008e\u0002\u001bäÞ\u0010®\u0012\u0095Ê~üU\u008b\u001b}0g\\¡Õà\u0018Àæået/T\bÈºqªÔ\u0095\tT¬\u0080\u001e\u000e±u±¬\u0010\u0092\u0086\u0086pqTI\u0010oV\u0016¢3$M@ \u0014_\u0005ë\u009b{×\u0017ç%r\u0085Û²xTî÷iHÖ§³µÎój\u008d'\u0084µK\u00182{OU\u0091\u000f\u0085cT´¬\u0000«¨TÔÃ\u0082Ø»H^tm\u0010´\u0094|B_\u008dv-rMì>\u000bh\u0018`(\u001b¨|ì\u008e\u0003¨c´?÷þ±ÐÕøµ\u0089úV\u0087Ø¨\u0091<K\u009a#\u0097Ic\u008dã\u0096\u0086\u0015\u008fëØ\u009d \u009eà\"¡]?t{hº\u001aE\u0015Üò6\u0083\u0085ùAäÂ*e¯!\u0085ÇÀö\u00808\u0010Ã4qd\u0080o>\f]\u00063¼\u0006x\u0005Â\u0018\fêè\u0010\u001eÏ-Vú\u0006?t5\u000fNñ©w!W·F:Î\u0010\u008d×xWU=¯¨l ¸¸¹Z?h \u0084[üÆdwjåÞîÜ\u007fAÓ\u0092\u0094s{#°\u0010\u001c¦\u0003\u0093.\u001c\u0097LTT»\u0018ç?Ó\u00191hÄ\u0086ø\u0080ü¥Ðn5±ë¿\u0013°b¶\u0093\"\u0010@\u0093¾\u009e^\u0011\t%çû\u009fCV£7È"
         .length();
      char var21 = '0';
      int var20 = -1;

      while (true) {
         byte[] var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
         String var42 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var26).intern();
         byte var10001 = -1;
         var25[var23++] = var42;
         if ((var20 += var21) >= var24) {
            var22 = "\u000f%\u007fAù6añ)\u007f-x`¾\u0001¸()£#t²\u0002ã\nï|ÎËôjÎÚ}´\u008cÊ²I\u009d\u009dh\u009f\"\u009d6\u007f×\u009a\u0004jIà\u0094]Ùþ";
            var24 = "\u000f%\u007fAù6añ)\u007f-x`¾\u0001¸()£#t²\u0002ã\nï|ÎËôjÎÚ}´\u008cÊ²I\u009d\u009dh\u009f\"\u009d6\u007f×\u009a\u0004jIà\u0094]Ùþ"
               .length();
            var21 = '\u0010';
            var20 = -1;

            while (true) {
               var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
               String var44 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var26).intern();
               int var37 = 0;
               var25[var23++] = var44;
               if ((var20 += var21) >= var24) {
                  lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var25;
                  IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new String[91];
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var12 = 1; var12 < 8; var12++) {
                     var10003[var12] = (byte)(var16 << var12 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var13 = 3119142886021026878L;
                  byte[] var15 = var11.doFinal(
                     new byte[]{
                        (byte)(var13 >>> 56),
                        (byte)(var13 >>> 48),
                        (byte)(var13 >>> 40),
                        (byte)(var13 >>> 32),
                        (byte)(var13 >>> 24),
                        (byte)(var13 >>> 16),
                        (byte)(var13 >>> 8),
                        (byte)var13
                     }
                  );
                  long var47 = (var15[0] & 255L) << 56
                     | (var15[1] & 255L) << 48
                     | (var15[2] & 255L) << 40
                     | (var15[3] & 255L) << 32
                     | (var15[4] & 255L) << 24
                     | (var15[5] & 255L) << 16
                     | (var15[6] & 255L) << 8
                     | var15[7] & 255L;
                  var37 = (byte)-1;
                  IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = var47;
                  IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "«?\u0097\u0018\u0080Là\u0000ý4B}\u0089}ùý";
                  int var5 = "«?\u0097\u0018\u0080Là\u0000ý4B}\u0089}ùý".length();
                  byte var2 = 0;

                  do {
                     var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     var37 = var3++;
                     long var8 = (var7[0] & 255L) << 56
                        | (var7[1] & 255L) << 48
                        | (var7[2] & 255L) << 40
                        | (var7[3] & 255L) << 32
                        | (var7[4] & 255L) << 24
                        | (var7[5] & 255L) << 16
                        | (var7[6] & 255L) << 8
                        | var7[7] & 255L;
                     byte[] var10 = var0.doFinal(
                        new byte[]{
                           (byte)(var8 >>> 56),
                           (byte)(var8 >>> 48),
                           (byte)(var8 >>> 40),
                           (byte)(var8 >>> 32),
                           (byte)(var8 >>> 24),
                           (byte)(var8 >>> 16),
                           (byte)(var8 >>> 8),
                           (byte)var8
                        }
                     );
                     long var10004 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var51 = -1;
                     var6[var37] = var10004;
                  } while (var2 < var5);

                  lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = var6;
                  lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = new Long[2];
                  return;
               }

               var21 = var22.charAt(var20);
            }
         }

         var21 = var22.charAt(var20);
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
      return var0;
   }

   private static String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2958;
      if (IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII[var5].getBytes("ISO-8859-1");
         IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var5] = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var5];
   }

   private static Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13647;
      if (lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI", var14);
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI[var3] = var15;
      }

      return lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI[var3];
   }

   private static long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$e52aab0977793f31(
      @NotNull String stateNameArg, long argument2Arg, @NotNull Value fnArg
   ) {
      argument2Arg = 123427132268413L;
      argument2Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument2Arg;
      Intrinsics.checkNotNullParameter(stateNameArg, "stateName");
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      Map var10000 = this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
      String var10001 = stateNameArg.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10001, "toUpperCase(...)");
      var10000.put(var10001, fnArg);
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$9c75ea196c9c42ab(
      long argument1Arg, @NotNull Value fnArg
   ) {
      argument1Arg = 59531845011574L;
      argument1Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument1Arg;
      long var10001 = argument1Arg ^ 125362045452569L;
      int var4 = (int)((argument1Arg ^ 125362045452569L) >>> 48);
      int var5 = (int)((argument1Arg ^ 125362045452569L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
         "onDisable", (char)var4, var5, var6, fnArg
      );
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$6878ce715648e45e(
      @NotNull Value fnArg, long argument2Arg
   ) {
      argument2Arg = 93170058672778L;
      argument2Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument2Arg;
      long var10001 = argument2Arg ^ 18262973330405L;
      int var4 = (int)((argument2Arg ^ 18262973330405L) >>> 48);
      int var5 = (int)((argument2Arg ^ 18262973330405L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
         "onResume", (char)var4, var5, var6, fnArg
      );
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$b58ead32d10c4a80(
      char var1, long var2, @NotNull Value var4
   ) {
      var2 = 85659103687294L;
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 10758460799761L;
      int var7 = (int)((var5 ^ 10758460799761L) >>> 48);
      int var8 = (int)((var5 ^ 10758460799761L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var4, IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(6145, 9217698524782999115L ^ var5)
      );
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"e">(10137, 8666482060122589636L ^ var5),
         (char)var7,
         var8,
         var9,
         var4
      );
   }

   public final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$f1566102a980f942(
      @NotNull Value cfgArg, long argument2Arg
   ) {
      argument2Arg = 98902670566968L;
      argument2Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument2Arg;
      Intrinsics.checkNotNullParameter(cfgArg, "cfg");
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl.add(cfgArg);
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl$recovered$b807b185cd1f352d(
      long argument1Arg, @NotNull String stateNameArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$afbecb44de70eb68(
      @NotNull String locationArg, long argument2Arg, int argument3Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl$recovered$a5fd2d5de63c2b62(long var1) {
      var1 = 37058452115585L;
      var1 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ var1;
      long var3 = var1 ^ 68463790017092L;
      return this.lllIllIIllIIIllllllIIIlIIlIlIlIIlllllIllllIIIllIllllllllIIlIIlIlIlIIIIIIlIIIlllllllIl(var3);
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$0cc5d3d3bc701cc7(
      @NotNull String locationArg, long argument2Arg, @Nullable Value argument3Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final Object IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1521e7719057a000(
      long argument1Arg, @NotNull String idArg
   ) {
      argument1Arg = 50549161766225L;
      argument1Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument1Arg;
      long var4 = argument1Arg ^ 21013599853958L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$29d650cf92429236(
            this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(idArg), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7660c576df7c768e(
      @NotNull String idArg, long argument2Arg, @Nullable Object argument3Arg
   ) {
      argument2Arg = 58602029625964L;
      argument2Arg = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl ^ argument2Arg;
      long var5 = argument2Arg ^ 15270175211899L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$145dfa6bc12b1dfb(
            var5, this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll.get(idArg), argument3Arg
         );
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$e7c9e250cf3aeb32(
      @NotNull List handlesArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll$recovered$891dc9a13b3941fb(
      long argument1Arg, @NotNull String reasonArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f08d63e6980693c2(
      @NotNull Value helperValArg, long argument2Arg, @NotNull Value conditionArg, boolean argument4Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI$recovered$76bf7bd9e65edada(
      String param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl$recovered$e7c2d1c65fc98314(
      long param1, Value param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll$recovered$b604c9ae9ce4e19d(
      long param1, Value param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$69f3ce6b6bf33456(
      long param1, String param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$66ea787267273a56(
      int argument1Arg, char argument2Arg, @NotNull Value fnArg, int argument4Arg
   ) {
      short var10 = 11292;
      argument2Arg = '膅';
      short var12 = 23066;
      long var5 = ((long)var10 << 32 | (long)argument2Arg << 48 >>> 32 | (long)var12 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 114608917238645L;
      int var7 = (int)((var5 ^ 114608917238645L) >>> 48);
      int var8 = (int)((var5 ^ 114608917238645L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
         "onEnable", (char)var7, var8, var9, fnArg
      );
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$ba9b7b40be2c6935(
      @NotNull Value fnArg, short argument2Arg, int argument3Arg, int argument4Arg
   ) {
      byte var10 = 0;
      argument3Arg = 1705477844;
      short var12 = 3868;
      long var5 = ((long)var10 << 48 | (long)argument3Arg << 32 >>> 16 | (long)var12 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var5 ^ 36865593673331L;
      int var7 = (int)((var5 ^ 36865593673331L) >>> 48);
      int var8 = (int)((var5 ^ 36865593673331L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
         "onHelperEnd", (char)var7, var8, var9, fnArg
      );
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$86642676b5758ff6(
      int argument1Arg, @NotNull Value fnArg, int argument3Arg
   ) {
      short var9 = 18857;
      argument3Arg = 83376462;
      long var4 = ((long)var9 << 32 | (long)argument3Arg << 32 >>> 32) ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var10001 = var4 ^ 14886133411873L;
      int var6 = (int)((var4 ^ 14886133411873L) >>> 48);
      int var7 = (int)((var4 ^ 14886133411873L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
         "onDeath", (char)var6, var7, var8, fnArg
      );
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$84fc5840154eb145(
      char argument1Arg, int argument2Arg, char argument3Arg, @NotNull Value fnArg
   ) {
      byte var7 = 0;
      argument2Arg = 930828178;
      short var9 = 21731;
      long var5 = ((long)var7 << 48 | (long)argument2Arg << 32 >>> 16 | (long)var9 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII.add(fnArg);
   }

   @NotNull
   public final String llllIlllIIIlIllIlIIIIIIlllIlIlIIIIIIIlllIlllIIllIlIIlIIlIIlIIllllIIllIIIlIlIlIlllllIl$recovered$a5169dca601cf078(
      int param1, int param2, short param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Value llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$89906c35c5ac314e(
      String var1, char var2, int var3, int var4, Value var5
   ) {
      byte var14 = 0;
      var3 = 1624543000;
      char var16 = '\ude8c';
      long var6 = ((long)var14 << 48 | (long)var3 << 32 >>> 16 | (long)var16 << 48 >>> 48)
         ^ llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
      long var8 = var6 ^ 103975499663357L;
      String var10 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      label27: {
         try {
            if (var10 != null) {
               return var5;
            }

            if (!var5.canExecute()) {
               break label27;
            }
         } catch (IllegalArgumentException var13) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13);
         }

         return var5;
      }

      String var11 = "macro '" + var1 + "' callback must be a function";
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0ccb27bfc4952b7e(
            this.getOwnerScriptName(),
            var8,
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
            var11
         );
      throw new IllegalArgumentException(var11);
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final String name;
      @NotNull
      private final String rawState;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final Value progressFn;
      @NotNull
      private final Value onStuckFn;
      @Nullable
      private final Value IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 2018162721938L;
      private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String nameArg,
         @NotNull String rawStateArg,
         long argument3Arg,
         long argument4Arg,
         @NotNull Value progressFnArg,
         @NotNull Value onStuckFnArg,
         @Nullable Value argument7Arg
      ) {
         long var10 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 8867815128019L;
         Intrinsics.checkNotNullParameter(nameArg, "name");
         Intrinsics.checkNotNullParameter(rawStateArg, "rawState");
         Intrinsics.checkNotNullParameter(progressFnArg, "progressFn");
         Intrinsics.checkNotNullParameter(onStuckFnArg, "onStuckFn");
         super();
         this.name = nameArg;
         this.rawState = rawStateArg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
         this.progressFn = progressFnArg;
         this.onStuckFn = onStuckFnArg;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = argument7Arg;
      }

      @NotNull
      public final String getName() {
         return this.name;
      }

      @NotNull
      public final String getRawState() {
         return this.rawState;
      }

      public final long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final Value getProgressFn() {
         return this.progressFn;
      }

      @NotNull
      public final Value getOnStuckFn() {
         return this.onStuckFn;
      }

      @Nullable
      public final Value IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      static {
         long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 12855622635549L;
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
         String var6 = "Å^ã¢Î²\u008c\u0097²\u000e\u001c\u0086\u001b\u008b-¾Ûv1\b\u000e\u0007Ò\u0016\u0010µ»}ö)\u0096\têC\f6t\u0007£Av";
         int var8 = "Å^ã¢Î²\u008c\u0097²\u000e\u001c\u0086\u001b\u008b-¾Ûv1\b\u000e\u0007Ò\u0016\u0010µ»}ö)\u0096\têC\f6t\u0007£Av".length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u001eéx]\u008dÔ|÷ÎïT\u008c¸'ø\u0002\u0013¼O(/]ôZ\bÔ_,¼Å\u008e\u000e\u0018\u0002·:û\u0014\u008b\u0098qÔAÝ\u0010Õ\u0094\u008cd,æo\u001c\u001b\u0088\u0010\u0081";
               var8 = "\u001eéx]\u008dÔ|÷ÎïT\u008c¸'ø\u0002\u0013¼O(/]ôZ\bÔ_,¼Å\u008e\u000e\u0018\u0002·:û\u0014\u008b\u0098qÔAÝ\u0010Õ\u0094\u008cd,æo\u001c\u001b\u0088\u0010\u0081"
                  .length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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

      private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 3744;
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
               throw new RuntimeException(
                  "me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/scripting/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
