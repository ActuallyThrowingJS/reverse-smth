package me.octo.client.gui.clickgui.modules.impl;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.Module;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.features.qol.MouseUngrab;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.ModUtils;
import org.jetbrains.annotations.NotNull;

public class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII
   extends Module
   implements me.octo.client.gui.clickgui.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI {
   @NotNull
   private final me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final List<String> instructions;
   @NotNull
   private final List<String> tips;
   private final boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI = 5900524372357L;
   private static String[] llIIllIlIIlIIIlIIlIlIlIllIIllllIIIIIIlIllIlllIIIlllIIIIlIllIlllIIIllllIIlIllIIlllIllI;
   private static String[] IllIllIIIIIIIlIIlIlIIIIIIllllIIllllIllIllllIllIllIIIIllIllIllIlllllIlIlIIIIllIIIlIlll;
   private static Map IIIIIIlIIlllllllllIllllIIlIIIIlIllIIIlIlIllIIIllllIlIIlIIlIIllllllllIlIlllIlIlIllIIll = new HashMap(13);

   public final boolean IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   public final boolean lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @NotNull
   public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var1,
      long var2
   ) {
      var2 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(483, 7906148414270592344L ^ var2)
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      boolean argument7Arg,
      boolean argument8Arg,
      boolean argument9Arg,
      int argument10Arg,
      @NotNull Setting... settingsArg
   ) {
      long var12 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 86042079216334L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, argument10Arg, Arrays.copyOf(settingsArg, settingsArg.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      this.instructions = instructionsArg;
      this.tips = tipsArg;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument7Arg;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = argument8Arg;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = argument9Arg;
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      boolean argument7Arg,
      @NotNull Setting... settingsArg
   ) {
      long var9 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 95542728671711L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, 0, Arrays.copyOf(settingsArg, settingsArg.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      this.instructions = instructionsArg;
      this.tips = tipsArg;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument7Arg;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      boolean argument5Arg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      boolean argument8Arg,
      @NotNull Setting... settingsArg
   ) {
      long var10 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 8989941188767L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, 0, Arrays.copyOf(settingsArg, settingsArg.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      this.instructions = instructionsArg;
      this.tips = tipsArg;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument8Arg;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = argument5Arg;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = true;
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      boolean argument5Arg,
      boolean argument6Arg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      boolean argument9Arg,
      @NotNull Setting... settingsArg
   ) {
      long var11 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 74709677293458L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, 0, Arrays.copyOf(settingsArg, settingsArg.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      this.instructions = instructionsArg;
      this.tips = tipsArg;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument9Arg;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = argument5Arg;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = argument6Arg;
   }

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      boolean argument4Arg,
      @NotNull String subcategoryArg,
      @NotNull List<String> instructionsArg,
      @NotNull List<String> tipsArg,
      boolean argument8Arg,
      @NotNull Setting... settingsArg
   ) {
      long var10 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 132136393599451L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(instructionsArg, "instructions");
      Intrinsics.checkNotNullParameter(tipsArg, "tips");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, 0, Arrays.copyOf(settingsArg, settingsArg.length));
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         this
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      this.instructions = instructionsArg;
      this.tips = tipsArg;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument8Arg;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = argument4Arg;
   }

   @NotNull
   public final List<String> getInstructions() {
      return this.instructions;
   }

   @NotNull
   public final List<String> getTips() {
      return this.tips;
   }

   public final boolean IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   @Override
   public me.octo.client.gui.clickgui.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   @Override
   public String[] IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI() {
      return new String[]{this.getNameProperty(), this.getDescriptionProperty(), this.getCategory().name(), this.getSubcategory()};
   }

   @Override
   public void lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(char var1, int var2, int var3) {
   }

   public void IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl() {
   }

   public void lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(long var1) {
   }

   @NotNull
   @Override
   public me.octo.client.gui.clickgui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return new llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII(this);
   }

   @NotNull
   @Override
   public me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll lIllIllIIIlIlIlIlllIllIIlIllllIIlIlllIlIIIlIllIIlIlIIIIIlIIlllIIIIlIIIIllIlllIlIIlIlI() {
      return new lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII(this);
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1,
      int var2,
      short var3,
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4
   ) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var7 = (var5 ^ 95782915626999L) >>> 8;
      int var9 = (int)((var5 ^ 95782915626999L) << 56 >>> 56);
      long var10 = var5 ^ 109291759171734L;
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(7946, 5393537869668368023L ^ var5)
      );
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(18549, 1960055350470699512L ^ var5),
         var7,
         (byte)var9,
         this.getNameProperty()
      );
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(23109, 267413179073887199L ^ var5),
         var7,
         (byte)var9,
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
      );
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(21303, 394588116900508303L ^ var5),
         var7,
         (byte)var9,
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
      );
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(17837, 3306431015357441062L ^ var5),
         var7,
         (byte)var9,
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.name()
      );
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var10, var4);
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1, long var2
   ) {
      long var10001 = var2 ^ 42686401400679L;
      int var4 = (int)((var2 ^ 42686401400679L) >>> 48);
      int var5 = (int)((var2 ^ 42686401400679L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = (var2 ^ 125639473549244L) >>> 16;
      int var9 = (int)((var2 ^ 125639473549244L) << 48 >>> 48);
      long var10 = var2 ^ 66148166057199L;
      Intrinsics.checkNotNullParameter(
         var1, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(16527, 7054362092976948752L ^ var2)
      );
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var7,
               (short)var9,
               llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(23082, 5659428610220776588L ^ var2),
               0
            )
         );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var14 = this;

      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var12;
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var10000;
      try {
         var10000 = var14;
         var12 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.valueOf(
            var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(10599, 7627686723100749786L ^ var2),
               llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(23323, 6317751169508072855L ^ var2),
               (char)var4,
               var5,
               (char)var6
            )
         );
      } catch (Exception var15) {
         var10000 = this;
         var12 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.UNSET;
      }

      var10000.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var12;
      this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10, var1);
   }

   @Override
   public void IIIIIlIIlIllIIlllIIIIlIIllllllllIIIllIllIIIlllIllIIIIIlIIlIIIllllllIlllllIIllIllIllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(char var0, int var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48)
         ^ lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI;
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5451139045656123729L, var3
      );
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      return Unit.INSTANCE;
   }

   private static final void lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(long var0) {
      var0 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ var0;
      long var2 = var0 ^ 24303771073528L;
      MouseUngrab.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short param0, short param1, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII param2, int param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final void lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(char var0, int var1, char var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48)
         ^ lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI;
      long var5 = var3 ^ 72506775191268L;
      MouseUngrab.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5);
   }

   private static final Unit IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(char var0, char var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI;
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         6002853686653764025L, var3
      );
      me.octo.client.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var2
   ) {
      var0 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ var0;
      long var3 = var0 ^ 30546665038367L;
      long var5 = var0 ^ 91111392507530L;
      boolean var8 = false;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         9090711556218551810L, var0
      );
      boolean var9 = false;
      String var7 = var10000;

      label54: {
         label53: {
            boolean var13;
            try {
               Class var10 = Class.forName(
                  llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(17373, 1001709053414092358L ^ var0)
                     + lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        new Random(
                           lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var5,
                              ModUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                                 + ":"
                                 + ModUtils.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                                 + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(4434, 2026907519177948377L ^ var0),
                              9124564432662881702L,
                              var0
                           )
                        ),
                        9107975042896616006L,
                        var0
                     ),
                  false,
                  ModUtils.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               );
               Field var11 = var10.getDeclaredField(
                  lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     new Random(
                        lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var5,
                           ModUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                              + ":"
                              + ModUtils.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                              + llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(1857, 1210611862862162649L ^ var0),
                           9124564432662881702L,
                           var0
                        )
                     ),
                     9107975042896616006L,
                     var0
                  )
               );
               var11.setAccessible(true);
               var10000 = (String)var11.get(null);
               Intrinsics.checkNotNull(
                  var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(22807, 4316144850672465028L ^ var0)
               );
               int var12 = (Integer)var10000;
               var13 = true;
               if (var7 != null) {
                  var9 = var13;
                  if (var12
                     == lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        9203717321788101561L, var0
                     )) {
                     var8 = true;
                  }
                  break label53;
               }
            } catch (Exception var17) {
               break label53;
            }

            var22 = var13;
            break label54;
         }

         var22 = var9;
      }

      label58: {
         label44: {
            label43: {
               boolean var14;
               try {
                  var14 = var22;
                  if (var7 != null) {
                     if (!var14) {
                        break label58;
                     }
                     break label43;
                  }
               } catch (Exception var16) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var16, 9200682035934372749L, var0
                  );
               }

               var23 = var14;
               break label44;
            }

            var23 = var8;
         }

         try {
            if (!var23) {
               var2.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                  var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(8534, 3567584882614291678L ^ var0)
               );
            }
         } catch (Exception var15) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var15, 9200682035934372749L, var0
            );
         }

         return Unit.INSTANCE;
      }

      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"P">(
         me.octo.client.utils.security.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(27497, 3400228408392615652L ^ var0),
         9084147643273141795L,
         var0
      );
      System.exit(0);
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"P">(
         me.octo.client.utils.security.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(28428, 6352851668063421110L ^ var0),
         9084147643273141795L,
         var0
      );
      Class var24 = Class.forName(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(20759, 9180675411375570068L ^ var0)
      );
      String var10001 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(4034, 2775295370702611031L ^ var0);
      Class[] var19 = new Class[]{int.class};
      Method var25 = var24.getMethod(var10001, var19);
      Object[] var20 = new Object[]{1};
      var25.invoke(null, var20);
      throw new Exception(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"o">(20300, 3547460725678449392L ^ var0));
   }

   public static void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(String var0) {
      llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var0;
   }

   public static String IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   static {
      long var9 = lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI ^ 87823290246396L;
      String var11 = "gWZSCc";
      lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[57];
      int var5 = 0;
      String var4 = "P\u0091i£¯/-\u000bZ¼÷\u0000_W;\u0003Ì\\\u009a\u009eäy÷Ê{Í1>É\u001cÛ\u0016\u0010\u000b\u008bñF\u0098ò\u0095vW\u009e¡\u009d\u0001y@à(å\u0094ÁÑ8\u000e\b\u0010äMÔÈÀ\u001a_(/\u0091q2±®Ærè\u0088þå*ÔËk\u0095\u0014¤Hfu\u008d»\u0010$\u0004³\rg^ö\u0092\u0016J\u0002e!üÏg\u0010\t{ò(×(_±FS%Zý½)\n\u0010y\u0098Ë\u0081\u0099\b\b\u009e\u0082\f\u0092d±\u0010îó û§zÆá\u0006ÿ(g\u0094ê\u0081ú\u0095îÿÛYA`?\r9f\u0095À¨ó\u0014LaÐHÂp\u00003\u000bc\u0091K¸±m+ê\u0006i\u001e\u0003ý-ý\u0099\t\u0091Ê\u0086\u0005Ë\u008aVWø*ëÈT§\u0099\u0001À$µHç>U©¸¥¡Çì$\u0015D»\u0014µ¨IWË,\u0018\u0004ð\u001fÐ»\u0014ai#\u0018thfG}¼½\f^N\u001c\u0015°p¶k<\bz§\u0004Öû\u008c U/V-\u008e\u0012\u001eoÐ\b\u001fnë\u0004øâJ\u0087òF\u0087\fñ9¾<¡¡I_ '\u0010~Ë¯\u0081\u0004¤\u001cÛo\u0019®\u0014ýU\u0006® \u00009¤ÊÏ\u0082#U¾ ÚÔ\u009dÞ¶ü[\u0089\u000f\u0098Ú\"zeÄJx\u00ad\u008c£\u0003@(¹[\u00810\"ÁBô\u0084Á~¿°ê}\u0014¯U\u008aî8°~Å$[2©*\u0000\\Û\u0081ÆÞPúëH\u0091\u00101³ÕµóÖ\u001d\faròØB½E\u008fH²´7}}\u0091\u0000\u0016ÕBw3ûÁ½a@Y9§I'U1£z\u009a\u001b´Æ]\u001d\u0090!\r\u0019g\bo\u0088\u0088\u0004\b;\u008büRØU\u0003otçaHå\u008d]å+\u007f~Ü dqÔ\u0096CH£û \u0099Ø!\u0083\u0007\u0002\u0003\u0087ê¤\u0086ýÆ´5;.ôMÇúkët\u0094Ç\u008f!\u001aýÙ\u0000 \u00808ÊVÐ_ ? åÅ\u0099_µä:\u0083e\u009a\u0085~\u001dKÝè\u009cDj(³Ç \u0018ã\u008dS}\u0015èÆ%1\u000b\u0082Þöû\u0088\u000f¯õà\u001a8/ûÉ\u0010=\råÐ£\"ÉÉ\u001ep#\b`gV{PÖ7\u001e\u009dÊÎ$Tí\u0013iÜ\u0012*,';V÷I\u009dFk\u0097\u0010\u0088_ÊÛoºòÄZ \u0081\u0018\u009e\u0088fä\u0014ßXmæ\u0006è\u0094+¬\u0092\u0090\"\u000e\u0084\u009cgq(\u009c\u0012$©wGËdc`=O\röEFÃ\u001aÝ48\u0086O¡\u0001\u009fë¶>&²Â5Z&0\u009b=\u0090g½Î #`k¡õy¤ºáX\u008b§\u0081çiÍÞëyÎ\u001fó\u0095\u0017Lí\u0097ínOºé{æ \tIËÉHêCZ5¥Ü£ì^Æ\u0010¼8\u0089W\u0095Þ\u008f¤\u0003í\u0002\u0011\b¾\u0089» ê3¨P¤m8áV¤3c-ç uö;(Bq\u001eÉÖ\\Lâòz¢\u0099I(J\u0086øëýtÍºl0(ÛS\u0082\u0082\u0082µe+Q«5m\u0081\u0016hU.\u009ddåTÀ\u0093õA\n¹\u0002} \u000eÕHôß\u009fUpä\u009d\u009cVZ¼¥/\u0088Þhì«Üh\u0099\u0087^1^\u001e\u0082Élh¿qL\u0089Ð\u009cK\u0016yV\u0095 ×¨\u009f:bÂx2Ë\u009b\u0007á=±ÈÎ<p\rî÷Ë¶t\u000fy\u0006ë¯\u009d\u0012Èñ\n%§J¹â6ÑX^i®S£G\u0095\t(´<½\u000e\u0095\u0096§8\u0096/\u008brXi+$X>Ädîëñ<Ò~â¥a\u008aÄà¾p\u001eOÿP\u0082CÛ\u0010Ú!\u0004Ù§OùÈ'\u0015lqÐ[\u00adk ãàVÂk\u009c¦³´¶\u007f\u0018úÕa¢}T[O%üÐÅnÎ\u008bjê´ÛÚ0ÿ\u0001(\u0089e\u001d\u0080Ôªr«µkÃxönßo\u0000\u0083\u0089~Ôvî¥ipÛô¥íyÉ¤ú6DX\u0014íÂðÕ6+a\u0010=¨nsÿÂî\u0098Á%í\u0015C\u0089Ü¼\u0018Ý\u0093Ö=\u0088bãÞÑÂe\u0094ÍÜÕE\u0012\u0098L¯·Rß\u008d\u0018\u001c9=a\u0005Ï\u0006\u00933p¼{sG'©¬\u0004\u008e\u000e\u009d¹Ó\u009d\u0010\u0080¯.\u0014\u0007@\u0002\u0084ø\bßsËÓ`M  «©jl\u0085Ó\u0094ÝÄçQÌ;Ã\u0090\u0095O2p\u008f³\u008fÚ\u009e²t\u0000q\u009c%ß\u0018iÏÝ\u0013RIðÀûPVâBP«Ý\fòtç\u0098c¯\u008a(åO°á\u0089W\u001f\u009d\u000fas¯_¤Y-!\u001fèU\u0090\r\u0005¼økR¥\u0016\u009f\u009dPfÄL7\u0094-¼{ \u008a} Ê\u0091ý|@J\u0005\u00adMº~aüß³Hzò.YWëCá¨\u008e½§²\u0018\u009fïó@Ûe\u0018\u0083Þø!\u008em\u008d\u008e ¼\u0082ì\u001fA× h ý+\u0019Í»ñ)\u0081)H¿\u0082×\u0080K\t%AlkÕÐ5a\u00045p}â|BÈ\u0018\u007fðH\u0015nGv$\u0081Eò\u0082jØÒé\u0016%\u0084ÿ(K_}@z\u0012åÇÀ\u009dR3\u0089M¯\u001aÏ¥Ò~z\u0098jÑ¯Bòã§/&ñ\u0083\u000f=ä©³&\n\u0097ÿÈ\u0094Ë©\u0017\u0087g\u0098\u007f5.\u0083\"\u001cÄ\u0093\u008c\u0097Ù\u008f%\u00946ELû \u008b\fÕ¨\u000fl -I\u0087 õ!\r¡ªàÝ®oGGí\u008f\t*±f\u0093V\u000f\u0017\u00109ÓÛS\u0096\u009c\u0082dø'Zý½Ê\u001fÜ \u0018o\u00930Æ¤Î\u0083Øe,Âj:ô\"ETÅÄ\u0004\u0016³xÌfm\u0093â@tvh\u001bWw\u0011;\"\u008fgÈÍ¦ÇÄYÿo¯(ÄÆÒ\u001få\u009f[\u008bq#µ;&ØCôÖèÕ-\u009f\u008d\u0001³\u0000ÈP¾ï¢°ûÉ\f\u0082º\u0085\u0011E023óSè\r\u0007Ào'\u0082Å\u00109åa¶¥\u0011T\u00816\u001aX\u001eI\u00ad_))\u0088ÍuÐéVí\u007fó²Ï½J,õç\u00104ð<¡Wä \u000b\u0011Â±Tëi¸V8BÚµ\u00ad#BxE*q¶\u0010¸>LWqÚ$ÓP°¦¢\u0095Ù¯\u001b·h2¶Ä\u0001Á[\u009cWK\u0088´\u0005:Þ¡wR\u0084;DfÝ÷\".\u008a\u0010iíî\u0097Ó\u0098UGTQrØít\u008fÍ ¯\u00878åêà_ÄÇÉ\u0019\u0099\"=fi&\\×(1\u001d£§R¹}ãdÀD$\u0098a°\u008e%Ûº58Ñ×:ñ(y)ÂõTÞp\u0081Ãúé§n6®°¯\u0011M\u001d\u0002\u0013ï|\n¿¨ýÎ\u0090Råý>ÿ¸û\u0005)\u0096I5µbJ½ÌñZÌE^1¶t¿L\u0089\u008a\u0081\u001dõ¸\u0088c\u0003\u0089\u00130²\f\u0093#T\u00836®\u0081Úö3\u008d\u009dzwÀ¿Ú:Ç\u0098ÖÝ\f'\u0099jÎ¶Á`Î«\u0080\f\u008dÿ/£\u0019¥d\u000f\u008c<cjØ±ü\"[Ã\u009fP\u001bà\u008eè\u0091\u0001FÇ\nÎ¢ªfp {\u0098äk{+ñ|ë}ÑT\u0011ï$x\u0088\u0086W\u0002\u0086\u009d\u001e#ÆÙ7QÜù|\u0010\u0010êz\u0081\u0015ªÈtó+Ê\u000eu½&JÌ@(È\u0017\b;Øtb\u0001\u000e\u0097 \u0087\u008aä'lµä:l\u007fÐ>öRw\u0094¬\b]K\u0088m´Ì\u0091\u008b»{±ØH¸ Q\u0005\u001dÎOì·\u0088\u008f\u0086jï\u009fü«?bÕÔ`Å.Åj\u0006ø\u0011#\u0013q}º\u008bª(l¯#òÅ/ñ\u001c\u000f'\u0086°\u0096Í,8\u0093`BÍ¦\u00186{`Ø·\u0013\b¡QMb\u0085ú½ã\u008e>»\f!\u0094\u001b\u0083\u0098<m!J\u0091Rk\u0005l\u0017TPÓ0Z\u0083\u000eZ\u001e{¥N\u0005;j\u0084>ÝBM\u008b\u0016mæ\u008b\u0010Èn¥Ë\u009f\u0083§gÄ\u001d P£¾×\u001c";
      int var6 = "P\u0091i£¯/-\u000bZ¼÷\u0000_W;\u0003Ì\\\u009a\u009eäy÷Ê{Í1>É\u001cÛ\u0016\u0010\u000b\u008bñF\u0098ò\u0095vW\u009e¡\u009d\u0001y@à(å\u0094ÁÑ8\u000e\b\u0010äMÔÈÀ\u001a_(/\u0091q2±®Ærè\u0088þå*ÔËk\u0095\u0014¤Hfu\u008d»\u0010$\u0004³\rg^ö\u0092\u0016J\u0002e!üÏg\u0010\t{ò(×(_±FS%Zý½)\n\u0010y\u0098Ë\u0081\u0099\b\b\u009e\u0082\f\u0092d±\u0010îó û§zÆá\u0006ÿ(g\u0094ê\u0081ú\u0095îÿÛYA`?\r9f\u0095À¨ó\u0014LaÐHÂp\u00003\u000bc\u0091K¸±m+ê\u0006i\u001e\u0003ý-ý\u0099\t\u0091Ê\u0086\u0005Ë\u008aVWø*ëÈT§\u0099\u0001À$µHç>U©¸¥¡Çì$\u0015D»\u0014µ¨IWË,\u0018\u0004ð\u001fÐ»\u0014ai#\u0018thfG}¼½\f^N\u001c\u0015°p¶k<\bz§\u0004Öû\u008c U/V-\u008e\u0012\u001eoÐ\b\u001fnë\u0004øâJ\u0087òF\u0087\fñ9¾<¡¡I_ '\u0010~Ë¯\u0081\u0004¤\u001cÛo\u0019®\u0014ýU\u0006® \u00009¤ÊÏ\u0082#U¾ ÚÔ\u009dÞ¶ü[\u0089\u000f\u0098Ú\"zeÄJx\u00ad\u008c£\u0003@(¹[\u00810\"ÁBô\u0084Á~¿°ê}\u0014¯U\u008aî8°~Å$[2©*\u0000\\Û\u0081ÆÞPúëH\u0091\u00101³ÕµóÖ\u001d\faròØB½E\u008fH²´7}}\u0091\u0000\u0016ÕBw3ûÁ½a@Y9§I'U1£z\u009a\u001b´Æ]\u001d\u0090!\r\u0019g\bo\u0088\u0088\u0004\b;\u008büRØU\u0003otçaHå\u008d]å+\u007f~Ü dqÔ\u0096CH£û \u0099Ø!\u0083\u0007\u0002\u0003\u0087ê¤\u0086ýÆ´5;.ôMÇúkët\u0094Ç\u008f!\u001aýÙ\u0000 \u00808ÊVÐ_ ? åÅ\u0099_µä:\u0083e\u009a\u0085~\u001dKÝè\u009cDj(³Ç \u0018ã\u008dS}\u0015èÆ%1\u000b\u0082Þöû\u0088\u000f¯õà\u001a8/ûÉ\u0010=\råÐ£\"ÉÉ\u001ep#\b`gV{PÖ7\u001e\u009dÊÎ$Tí\u0013iÜ\u0012*,';V÷I\u009dFk\u0097\u0010\u0088_ÊÛoºòÄZ \u0081\u0018\u009e\u0088fä\u0014ßXmæ\u0006è\u0094+¬\u0092\u0090\"\u000e\u0084\u009cgq(\u009c\u0012$©wGËdc`=O\röEFÃ\u001aÝ48\u0086O¡\u0001\u009fë¶>&²Â5Z&0\u009b=\u0090g½Î #`k¡õy¤ºáX\u008b§\u0081çiÍÞëyÎ\u001fó\u0095\u0017Lí\u0097ínOºé{æ \tIËÉHêCZ5¥Ü£ì^Æ\u0010¼8\u0089W\u0095Þ\u008f¤\u0003í\u0002\u0011\b¾\u0089» ê3¨P¤m8áV¤3c-ç uö;(Bq\u001eÉÖ\\Lâòz¢\u0099I(J\u0086øëýtÍºl0(ÛS\u0082\u0082\u0082µe+Q«5m\u0081\u0016hU.\u009ddåTÀ\u0093õA\n¹\u0002} \u000eÕHôß\u009fUpä\u009d\u009cVZ¼¥/\u0088Þhì«Üh\u0099\u0087^1^\u001e\u0082Élh¿qL\u0089Ð\u009cK\u0016yV\u0095 ×¨\u009f:bÂx2Ë\u009b\u0007á=±ÈÎ<p\rî÷Ë¶t\u000fy\u0006ë¯\u009d\u0012Èñ\n%§J¹â6ÑX^i®S£G\u0095\t(´<½\u000e\u0095\u0096§8\u0096/\u008brXi+$X>Ädîëñ<Ò~â¥a\u008aÄà¾p\u001eOÿP\u0082CÛ\u0010Ú!\u0004Ù§OùÈ'\u0015lqÐ[\u00adk ãàVÂk\u009c¦³´¶\u007f\u0018úÕa¢}T[O%üÐÅnÎ\u008bjê´ÛÚ0ÿ\u0001(\u0089e\u001d\u0080Ôªr«µkÃxönßo\u0000\u0083\u0089~Ôvî¥ipÛô¥íyÉ¤ú6DX\u0014íÂðÕ6+a\u0010=¨nsÿÂî\u0098Á%í\u0015C\u0089Ü¼\u0018Ý\u0093Ö=\u0088bãÞÑÂe\u0094ÍÜÕE\u0012\u0098L¯·Rß\u008d\u0018\u001c9=a\u0005Ï\u0006\u00933p¼{sG'©¬\u0004\u008e\u000e\u009d¹Ó\u009d\u0010\u0080¯.\u0014\u0007@\u0002\u0084ø\bßsËÓ`M  «©jl\u0085Ó\u0094ÝÄçQÌ;Ã\u0090\u0095O2p\u008f³\u008fÚ\u009e²t\u0000q\u009c%ß\u0018iÏÝ\u0013RIðÀûPVâBP«Ý\fòtç\u0098c¯\u008a(åO°á\u0089W\u001f\u009d\u000fas¯_¤Y-!\u001fèU\u0090\r\u0005¼økR¥\u0016\u009f\u009dPfÄL7\u0094-¼{ \u008a} Ê\u0091ý|@J\u0005\u00adMº~aüß³Hzò.YWëCá¨\u008e½§²\u0018\u009fïó@Ûe\u0018\u0083Þø!\u008em\u008d\u008e ¼\u0082ì\u001fA× h ý+\u0019Í»ñ)\u0081)H¿\u0082×\u0080K\t%AlkÕÐ5a\u00045p}â|BÈ\u0018\u007fðH\u0015nGv$\u0081Eò\u0082jØÒé\u0016%\u0084ÿ(K_}@z\u0012åÇÀ\u009dR3\u0089M¯\u001aÏ¥Ò~z\u0098jÑ¯Bòã§/&ñ\u0083\u000f=ä©³&\n\u0097ÿÈ\u0094Ë©\u0017\u0087g\u0098\u007f5.\u0083\"\u001cÄ\u0093\u008c\u0097Ù\u008f%\u00946ELû \u008b\fÕ¨\u000fl -I\u0087 õ!\r¡ªàÝ®oGGí\u008f\t*±f\u0093V\u000f\u0017\u00109ÓÛS\u0096\u009c\u0082dø'Zý½Ê\u001fÜ \u0018o\u00930Æ¤Î\u0083Øe,Âj:ô\"ETÅÄ\u0004\u0016³xÌfm\u0093â@tvh\u001bWw\u0011;\"\u008fgÈÍ¦ÇÄYÿo¯(ÄÆÒ\u001få\u009f[\u008bq#µ;&ØCôÖèÕ-\u009f\u008d\u0001³\u0000ÈP¾ï¢°ûÉ\f\u0082º\u0085\u0011E023óSè\r\u0007Ào'\u0082Å\u00109åa¶¥\u0011T\u00816\u001aX\u001eI\u00ad_))\u0088ÍuÐéVí\u007fó²Ï½J,õç\u00104ð<¡Wä \u000b\u0011Â±Tëi¸V8BÚµ\u00ad#BxE*q¶\u0010¸>LWqÚ$ÓP°¦¢\u0095Ù¯\u001b·h2¶Ä\u0001Á[\u009cWK\u0088´\u0005:Þ¡wR\u0084;DfÝ÷\".\u008a\u0010iíî\u0097Ó\u0098UGTQrØít\u008fÍ ¯\u00878åêà_ÄÇÉ\u0019\u0099\"=fi&\\×(1\u001d£§R¹}ãdÀD$\u0098a°\u008e%Ûº58Ñ×:ñ(y)ÂõTÞp\u0081Ãúé§n6®°¯\u0011M\u001d\u0002\u0013ï|\n¿¨ýÎ\u0090Råý>ÿ¸û\u0005)\u0096I5µbJ½ÌñZÌE^1¶t¿L\u0089\u008a\u0081\u001dõ¸\u0088c\u0003\u0089\u00130²\f\u0093#T\u00836®\u0081Úö3\u008d\u009dzwÀ¿Ú:Ç\u0098ÖÝ\f'\u0099jÎ¶Á`Î«\u0080\f\u008dÿ/£\u0019¥d\u000f\u008c<cjØ±ü\"[Ã\u009fP\u001bà\u008eè\u0091\u0001FÇ\nÎ¢ªfp {\u0098äk{+ñ|ë}ÑT\u0011ï$x\u0088\u0086W\u0002\u0086\u009d\u001e#ÆÙ7QÜù|\u0010\u0010êz\u0081\u0015ªÈtó+Ê\u000eu½&JÌ@(È\u0017\b;Øtb\u0001\u000e\u0097 \u0087\u008aä'lµä:l\u007fÐ>öRw\u0094¬\b]K\u0088m´Ì\u0091\u008b»{±ØH¸ Q\u0005\u001dÎOì·\u0088\u008f\u0086jï\u009fü«?bÕÔ`Å.Åj\u0006ø\u0011#\u0013q}º\u008bª(l¯#òÅ/ñ\u001c\u000f'\u0086°\u0096Í,8\u0093`BÍ¦\u00186{`Ø·\u0013\b¡QMb\u0085ú½ã\u008e>»\f!\u0094\u001b\u0083\u0098<m!J\u0091Rk\u0005l\u0017TPÓ0Z\u0083\u000eZ\u001e{¥N\u0005;j\u0084>ÝBM\u008b\u0016mæ\u008b\u0010Èn¥Ë\u009f\u0083§gÄ\u001d P£¾×\u001c"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "D\u000bÅrP\u0086\u0087æ_¦K¶\u0019»Q\u0096\u000b2#x£aÐsA\u009eñ\u008b£\u009fx_¬\u009f6&R\u0000á\u0007\u0010C\u0083!\u0011c¨Ö\u0089{K\u001dÛÚ¾\u0094;";
            var6 = "D\u000bÅrP\u0086\u0087æ_¦K¶\u0019»Q\u0096\u000b2#x£aÐsA\u009eñ\u008b£\u009fx_¬\u009f6&R\u0000á\u0007\u0010C\u0083!\u0011c¨Ö\u0089{K\u001dÛÚ¾\u0094;"
               .length();
            var3 = '(';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  llIIllIlIIlIIIlIIlIlIlIllIIllllIIIIIIlIllIlllIIIlllIIIIlIllIlllIIIllllIIlIllIIlllIllI = var7;
                  IllIllIIIIIIIlIIlIlIIIIIIllllIIllllIllIllllIllIllIIIIllIllIllIlllllIlIlIIIIllIIIlIlll = new String[57];
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static Exception llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Exception var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4534;
      if (IllIllIIIIIIIlIIlIlIIIIIIllllIIllllIllIllllIllIllIIIIllIllIllIlllllIlIlIIIIllIIIlIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIIIlIIlllllllllIllllIIlIIIIlIllIIIlIlIllIIIllllIlIIlIIlIIllllllllIlIlllIlIlIllIIll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIIIlIIlllllllllIllllIIlIIIIlIllIIIlIlIllIIIllllIlIIlIIlIIllllllllIlIlllIlIlIllIIll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/modules/impl/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII", var10
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
         byte[] var9 = llIIllIlIIlIIIlIIlIlIlIllIIllllIIIIIIlIllIlllIIIlllIIIIlIllIlllIIIllllIIlIllIIlllIllI[var5].getBytes("ISO-8859-1");
         IllIllIIIIIIIlIIlIlIIIIIIllllIIllllIllIllllIllIllIIIIllIllIllIlllllIlIlIIIIllIIIlIlll[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIllIIIIIIIlIIlIlIIIIIIllllIIllllIllIllllIllIllIIIIllIllIllIlllllIlIlIIIIllIIIlIlll[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/gui/clickgui/modules/impl/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public void lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll$recovered$a5f21b8d31116df9(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl$recovered$af1c44ec58f269a0(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      SAFE,
      CAUTION,
      UNSAFE,
      UNSET;
      @NotNull
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var3, String var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
      }

      @NotNull
      public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public static EnumEntries<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 59451991326346L ^ 38169710340295L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[12];
         int var6 = 0;
         String var5 = "Ã\u0004\u0015\u009b\t¹Yi\bÙ³¦ï\u008d;`H\b\u0000Ró}½\u000fa'\b\u0088ÝÝc³é6Ò ¡\u0004NY\u008a£cðÌ~Mh\u0096þQ¾\u0014ràÿT¡\u009d?\u001a\u0003\u0019ÐL\u009b¶b\bIfë}\u009b³\u009cñ0\u0006Å\u009cQû\u008b:ä\rrÛ[TJ\u008a\u008f\fW+5,ªy3ò>Sc\b4\u0090Zþ=ç/\u0002|E§\u0000\u0089\u0000Á~bñö\bä(p \u001c98È\b}u£OÝ«´Ð \u0006Å\u009cQû\u008b:äFo±\u001cÃ k®,ß\u009dAÒ\u0001\\\u0087D\u0098{\u009c\u0093Ä\u009cc";
         int var7 = "Ã\u0004\u0015\u009b\t¹Yi\bÙ³¦ï\u008d;`H\b\u0000Ró}½\u000fa'\b\u0088ÝÝc³é6Ò ¡\u0004NY\u008a£cðÌ~Mh\u0096þQ¾\u0014ràÿT¡\u009d?\u001a\u0003\u0019ÐL\u009b¶b\bIfë}\u009b³\u009cñ0\u0006Å\u009cQû\u008b:ä\rrÛ[TJ\u008a\u008f\fW+5,ªy3ò>Sc\b4\u0090Zþ=ç/\u0002|E§\u0000\u0089\u0000Á~bñö\bä(p \u001c98È\b}u£OÝ«´Ð \u0006Å\u009cQû\u008b:äFo±\u001cÃ k®,ß\u009dAÒ\u0001\\\u0087D\u0098{\u009c\u0093Ä\u009cc"
            .length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var21;
            if ((var3 += var4) >= var7) {
               var5 = "î/x\u0080§ Öó§\u0017H¢ê\u009bòm¼:Ûé\u0000\u0011\u001fö-bA´ÔqC\u0010\ba\u009b\"]\u000bÁ\u0094ó";
               var7 = "î/x\u0080§ Öó§\u0017H¢ê\u009bòm¼:Ûé\u0000\u0011\u001fö-bA´ÔqC\u0010\ba\u009b\"]\u000bÁ\u0094ó".length();
               var4 = ' ';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var19 = false;
                  var0[var6++] = var23;
                  if ((var3 += var4) >= var7) {
                     SAFE = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var0[5], var0[6]
                     );
                     CAUTION = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var0[11], var0[10]
                     );
                     UNSAFE = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var0[8], var0[9]
                     );
                     UNSET = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var0[7], var0[4]
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = EnumEntriesKt.enumEntries(
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
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
