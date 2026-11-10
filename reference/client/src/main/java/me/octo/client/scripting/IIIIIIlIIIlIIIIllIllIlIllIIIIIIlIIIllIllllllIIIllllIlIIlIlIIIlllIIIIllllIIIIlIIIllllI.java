package me.octo.client.scripting;

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
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.graalvm.polyglot.proxy.ProxyObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI implements ProxyObject {
   @NotNull
   private static IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public final Setting setting;
   @JvmField
   @NotNull
   public String id;
   @NotNull
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 63660423421690L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI(@NotNull Setting settingArg, @NotNull String idArg) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 111036793201216L;
      Intrinsics.checkNotNullParameter(settingArg, "setting");
      Intrinsics.checkNotNullParameter(idArg, "id");
      super();
      this.setting = settingArg;
      this.id = idArg;
   }

   @Export
   @Nullable
   public final Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var6 = var4 ^ 89352977414410L;
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this.setting, var6);
   }

   @Export
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable Object var1, long var2) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var10001 = var2 ^ 102056930523051L;
      int var4 = (int)((var2 ^ 102056930523051L) >>> 48);
      int var5 = (int)((var2 ^ 102056930523051L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((short)var4, var1, var5, var6);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(short param1, Object param2, int param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, Object param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @Nullable
   public final Object get() {
      long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 53042028084301L;
      long var3 = var1 ^ 21759754700163L;
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$29d650cf92429236(this.setting, var3);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final boolean set(@Nullable Object var1) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 51382031690433L;
      long var4 = var2 ^ 12121110008015L;
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$145dfa6bc12b1dfb(var4, this.setting, var1);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final String name() {
      return this.setting.getNameProperty();
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI onChange(@NotNull Value fnArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI visibleWhen(@NotNull Value fnArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @JvmOverloads
   @NotNull
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI dependsOn(
      @NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI otherArg, @Nullable Value argument2Arg
   ) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 121608150510782L;
      int var5 = (int)((var3 ^ 8772946550251L) >>> 32);
      long var6 = (var3 ^ 8772946550251L) << 32 >>> 32;
      Intrinsics.checkNotNullParameter(otherArg, "other");
      lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ec65854d2bfe144d(
            this.setting, otherArg.setting, var5, var6, argument2Arg
         );
      return this;
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI if(@NotNull Value conditionArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final boolean isEnabled() {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   @Override
   public Object getMember(@NotNull String keyArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public Object getMemberKeys() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @Override
   public boolean hasMember(@NotNull String keyArg) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 5410717913209L;
      Intrinsics.checkNotNullParameter(keyArg, "key");
      return ArraysKt.contains(lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI, keyArg);
   }

   @Override
   public void putMember(@NotNull String keyArg, @NotNull Value valueArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Value IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, long var2, Value[] var4) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;

      try {
         Value var10000 = (Value)ArraysKt.firstOrNull(var4);
         if (var10000 == null) {
            throw new IllegalArgumentException(
               var1 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(8002, 4648030575005575329L ^ var2)
            );
         } else {
            return var10000;
         }
      } catch (UnsupportedOperationException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, -4648235602010517459L, var2
         );
      }
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @JvmOverloads
   @NotNull
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI dependsOn(
      @NotNull IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI otherArg
   ) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 3584321115958L;
      Intrinsics.checkNotNullParameter(otherArg, "other");
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this, otherArg, null, 2, null);
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var0) {
      return var0;
   }

   private static final Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, Value[] var1
   ) {
      return var0.get();
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, Value[] var1
   ) {
      Intrinsics.checkNotNull(var1);
      return var0.set(ArraysKt.firstOrNull(var1));
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, Value[] var1
   ) {
      return var0.name();
   }

   private static final Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, long var1, String var3, Value[] var4
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var5 = var1 ^ 125351717399778L;
      Intrinsics.checkNotNull(var4);
      return var0.onChange(var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5, var4));
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var2, String var3, Value[] var4
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var5 = var0 ^ 95637301255590L;
      Intrinsics.checkNotNull(var4);
      return var2.visibleWhen(var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5, var4));
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, String var1, long var2, Value[] var4
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var5 = var2 ^ 42258486563163L;
      long var7 = var2 ^ 59232864002901L;
      String var9 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4893911285571623303L, var2
      );

      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var21;
      try {
         lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll var10000 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNull(var4);
         var21 = var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var7, var4), var5
         );
         if (var21 == null) {
            throw new IllegalArgumentException(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(19762, 728471561905014637L ^ var2)
            );
         }
      } catch (UnsupportedOperationException var19) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var19, 4814676076173929858L, var2
         );
      }

      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var10 = var21;

      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var10001;
      Value var10002;
      try {
         label61: {
            var21 = var0;
            var10001 = var10;
            if (var9 == null) {
               var10002 = (Value)ArraysKt.getOrNull(var4, 1);
               if (var10002 != null) {
                  break label61;
               }
            }

            return var0.dependsOn(var10, null);
         }
      } catch (UnsupportedOperationException var18) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var18, 4814676076173929858L, var2
         );
      }

      Value var11 = var10002;
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var15 = var10001;
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var14 = var21;
      boolean var13 = false;
      boolean var16 = var11.isNull();

      try {
         var21 = var14;
         var10001 = var15;
         if (!var16) {
            return var14.dependsOn(var15, var11);
         }
      } catch (UnsupportedOperationException var17) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var17, 4814676076173929858L, var2
         );
      }

      return var21.dependsOn(var10001, null);
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, long var1, String var3, Value[] var4
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var5 = var1 ^ 85316392428727L;
      Intrinsics.checkNotNull(var4);
      return var0.if(var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5, var4));
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var0, Value[] var1
   ) {
      return var0.isEnabled();
   }

   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 127275766752986L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[38];
      int var5 = 0;
      String var4 = "Fó\u008fg\u0087(ßO×¨\u0011\u0019\u001b8\u000eK\u0010\u008dE7Zd Ú\u0011ýÖíUæÝ\bî\u0010OØ\u000ehöD½ËÕS¥òÉ¯\u00038\u0010²f¥q\u008dÿ0ýräÙ\u0091h\u007fG×\u0018\f¥+A\u0002\u0097\u0081\"Z\u001f8ãm,ÆÆ9u~\u0016\u0007LJÅ\u00187\u0087~Ó \u000e¥Â\rÃJ\u0080OVu\u0086¾ÍqCîeyE\u0010ä\u001eaþ\u001aGù\"ÅNñjØ\r\u0081Q\u0018Z\u001a\u00933sê¯ù#!v\u0095ÿh\u0084\u0083l\u0096BÅ÷J\u000eÎ ª\u0090JnþU|\u0018\n=\u009c7³ÒÏ Íoßæþ =ÃÊ:\u0083¯\u00175,\u0019\u0010ímDÀ²áò¦Nózª»Æ2#@LXâS~[å\u008bey½àæ)x\u0005\u0089¬Ù`X#kh¤^\u0096\u009aù(ð££ÊW´\u001e\u0092Õ°\u0081u+\u0095øÕb\u000f)\u0015Ñí\u0013\u00190¿æ5\u0082ïÚ»Ò\u009f(v\u0017WÏ\u008c{;È«\u000fU»Ä°z\u000bo(\u0090\u0010¸/Å>£cA\u0019Y´u>\u0016È¢\u0013s½<{\u0018ô\u0014\u000f÷âhÑµkß\u008b\u0019tmuý®`C\u0005â\u000f÷\u0001\u0010ÏS\u008cÀs:ÿ\u0004\u0014ã½!Øãy>\u0018k¨{\u00076Ïûßå¶ZÀ-#-¤Ó\nL\u009cAÎ\u0013\u008b V3J\u0005\u0094SÜ¿C¦¥d\u001b¯ª\t>9-\u000fÈN±õen}\u000b¤fåW\u0018°@µ,8Ýí\u0010°k\u0015É\u0000\u0001d¨YÝ\u0017¢ò,\"i\u0010\u0019C\fè.ÖC^t\u0019(á\u001cÜu\u0000 ¾Z\u0007Ã\u0084®M\u0086\u000fzÕ÷}À¬¢ù\u001f®f\u0005Öê,v@×\u001frè6\u0006\u0010\u001dÖ',àô¨èÃ\"t+Ò\u00ad,X\u00189µ¨\u0016\u0017?cì½*\u0002g\b?ÃÖÜª%\")dÁT\u0010¢)cr\u00ad4o\u0001®\u0089²ðwü\u0088_\u0010¬ÿÐ?\u0011ä\u001cùÒk û¯?+\u0084\u0018\u0085Ý\u001eöÜÎWr-à-X\u0000ÏHÎ°\u0000\u0019o\u0003M²¬\u0010\u0080=ÅIìW%`bÑ\u009a\u0016\u0084'\u0089\u000e(³\b\u009fH^Ù%ë¾{\u0011ãÅ#\f\u008eê\u0006ç\u0002\u001bØíÞAä\u0006\u0089\u0016¯\u0010\u001aü¢\u0094\u009c\u0098÷Ü\u0014 ÈE²%¿{ukf×9}\u0000LQl_E7È<×`\u0005Õ|añ\u0088\u0084\\í\u0010\u000fNêè\u0012³\u0004\u0099\u0095\u008ai\u0013H¬\u0085Î\u0010Ý\u0089\u0013\u0086\u001a\u0084Eøó\u0096\u009eâÚUUt\u0010Ï\u0017\u009f\u008b\u001aU\u00923ê(°úãkð¬\u00108Àâjü}$²}¿j\f\táÿ\u009c\u0018¡\u009f\u00150`Òò\u008cî´0ýßX-êZ\b\u0083ÚSp²©\u0010¼g3àÑºga4Ï¤ªPH!}\u0010\u001d`.ØôW\u0092s\u0085U9á\"r\u0006Æ\u0010IÆX\u0012\u0012^5å8\u0004ïC(¯\u008b0\u0018ÎJM)çB\u0086}ôtÖô^\u0081\"Ê\u0097Wä\u0084\u001b÷\u000bµ";
      int var6 = "Fó\u008fg\u0087(ßO×¨\u0011\u0019\u001b8\u000eK\u0010\u008dE7Zd Ú\u0011ýÖíUæÝ\bî\u0010OØ\u000ehöD½ËÕS¥òÉ¯\u00038\u0010²f¥q\u008dÿ0ýräÙ\u0091h\u007fG×\u0018\f¥+A\u0002\u0097\u0081\"Z\u001f8ãm,ÆÆ9u~\u0016\u0007LJÅ\u00187\u0087~Ó \u000e¥Â\rÃJ\u0080OVu\u0086¾ÍqCîeyE\u0010ä\u001eaþ\u001aGù\"ÅNñjØ\r\u0081Q\u0018Z\u001a\u00933sê¯ù#!v\u0095ÿh\u0084\u0083l\u0096BÅ÷J\u000eÎ ª\u0090JnþU|\u0018\n=\u009c7³ÒÏ Íoßæþ =ÃÊ:\u0083¯\u00175,\u0019\u0010ímDÀ²áò¦Nózª»Æ2#@LXâS~[å\u008bey½àæ)x\u0005\u0089¬Ù`X#kh¤^\u0096\u009aù(ð££ÊW´\u001e\u0092Õ°\u0081u+\u0095øÕb\u000f)\u0015Ñí\u0013\u00190¿æ5\u0082ïÚ»Ò\u009f(v\u0017WÏ\u008c{;È«\u000fU»Ä°z\u000bo(\u0090\u0010¸/Å>£cA\u0019Y´u>\u0016È¢\u0013s½<{\u0018ô\u0014\u000f÷âhÑµkß\u008b\u0019tmuý®`C\u0005â\u000f÷\u0001\u0010ÏS\u008cÀs:ÿ\u0004\u0014ã½!Øãy>\u0018k¨{\u00076Ïûßå¶ZÀ-#-¤Ó\nL\u009cAÎ\u0013\u008b V3J\u0005\u0094SÜ¿C¦¥d\u001b¯ª\t>9-\u000fÈN±õen}\u000b¤fåW\u0018°@µ,8Ýí\u0010°k\u0015É\u0000\u0001d¨YÝ\u0017¢ò,\"i\u0010\u0019C\fè.ÖC^t\u0019(á\u001cÜu\u0000 ¾Z\u0007Ã\u0084®M\u0086\u000fzÕ÷}À¬¢ù\u001f®f\u0005Öê,v@×\u001frè6\u0006\u0010\u001dÖ',àô¨èÃ\"t+Ò\u00ad,X\u00189µ¨\u0016\u0017?cì½*\u0002g\b?ÃÖÜª%\")dÁT\u0010¢)cr\u00ad4o\u0001®\u0089²ðwü\u0088_\u0010¬ÿÐ?\u0011ä\u001cùÒk û¯?+\u0084\u0018\u0085Ý\u001eöÜÎWr-à-X\u0000ÏHÎ°\u0000\u0019o\u0003M²¬\u0010\u0080=ÅIìW%`bÑ\u009a\u0016\u0084'\u0089\u000e(³\b\u009fH^Ù%ë¾{\u0011ãÅ#\f\u008eê\u0006ç\u0002\u001bØíÞAä\u0006\u0089\u0016¯\u0010\u001aü¢\u0094\u009c\u0098÷Ü\u0014 ÈE²%¿{ukf×9}\u0000LQl_E7È<×`\u0005Õ|añ\u0088\u0084\\í\u0010\u000fNêè\u0012³\u0004\u0099\u0095\u008ai\u0013H¬\u0085Î\u0010Ý\u0089\u0013\u0086\u001a\u0084Eøó\u0096\u009eâÚUUt\u0010Ï\u0017\u009f\u008b\u001aU\u00923ê(°úãkð¬\u00108Àâjü}$²}¿j\f\táÿ\u009c\u0018¡\u009f\u00150`Òò\u008cî´0ýßX-êZ\b\u0083ÚSp²©\u0010¼g3àÑºga4Ï¤ªPH!}\u0010\u001d`.ØôW\u0092s\u0085U9á\"r\u0006Æ\u0010IÆX\u0012\u0012^5å8\u0004ïC(¯\u008b0\u0018ÎJM)çB\u0086}ôtÖô^\u0081\"Ê\u0097Wä\u0084\u001b÷\u000bµ"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "#q²\u008d\u001b\u0015rÜ\"\u0019W²ë\u009f]s8½\u009a\u008c(bÈ´O\u000f±\u001b¼\u0084Æ\u009b?«\u001e\u008c\u0096\u0083Ô*\u0000¨\u0011o¶?rÝ1ø\u009ae\u001aH\u000f\f<ûÎ\u0083f~sk2'\u0090´w\u000e|ÏM";
            var6 = "#q²\u008d\u001b\u0015rÜ\"\u0019W²ë\u009f]s8½\u009a\u008c(bÈ´O\u000f±\u001b¼\u0084Æ\u009b?«\u001e\u008c\u0096\u0083Ô*\u0000¨\u0011o¶?rÝ1ø\u009ae\u001aH\u000f\f<ûÎ\u0083f~sk2'\u0090´w\u000e|ÏM"
               .length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[38];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  String[] var11 = new String[]{"value", "get", "set", "name", "onChange", "visibleWhen", "dependsOn", "if", "isEnabled"};
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var11;
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static UnsupportedOperationException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      UnsupportedOperationException var0
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2899;
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
            throw new RuntimeException("me/octo/client/scripting/IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI", var10);
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
            "me/octo/client/scripting/IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final String[] IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }
   }
}
