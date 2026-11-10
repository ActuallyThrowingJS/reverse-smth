package me.octo.client.scripting;

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
import kotlin.jvm.internal.Intrinsics;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll {
   @NotNull
   private final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI module;
   @NotNull
   private final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI binding;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 16817551403192L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   public IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
      @NotNull IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI moduleArg,
      @NotNull lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI bindingArg
   ) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 128494746749998L;
      Intrinsics.checkNotNullParameter(moduleArg, "module");
      Intrinsics.checkNotNullParameter(bindingArg, "binding");
      super();
      this.module = moduleArg;
      this.binding = bindingArg;
   }

   @NotNull
   public final IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI getModule() {
      return this.module;
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onState(@NotNull String nameArg, @NotNull Value fnArg) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 77724485770247L;
      long var5 = var3 ^ 63473680640962L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(nameArg, var5, fnArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onEnable(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 124648029228989L;
      long var10001 = var2 ^ 90206194187551L;
      int var4 = (int)((var2 ^ 90206194187551L) >>> 32);
      int var5 = (int)((var2 ^ 90206194187551L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, (char)var5, fnArg, var6);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onDisable(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 1327463120817L;
      long var4 = var2 ^ 61960819531647L;
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, fnArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onResume(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 28608324203606L;
      long var4 = var2 ^ 72514506925668L;
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(fnArg, var4);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onHelperEnd(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 40149470438509L;
      long var10001 = var2 ^ 86209188922313L;
      int var4 = (int)((var2 ^ 86209188922313L) >>> 48);
      int var5 = (int)((var2 ^ 86209188922313L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(fnArg, (short)var4, var5, var6);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onReturn(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 44674074953899L;
      int var4 = (int)((var2 ^ 116560211563117L) >>> 48);
      long var5 = (var2 ^ 116560211563117L) << 16 >>> 16;
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll((char)var4, var5, fnArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void onDeath(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 132699571898759L;
      int var4 = (int)((var2 ^ 68522546632817L) >>> 32);
      int var5 = (int)((var2 ^ 68522546632817L) << 32 >>> 32);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, fnArg, var5);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void hud(@NotNull Value fnArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 89318861067951L;
      long var10001 = var2 ^ 115503502945012L;
      int var4 = (int)((var2 ^ 115503502945012L) >>> 48);
      int var5 = (int)((var2 ^ 115503502945012L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(fnArg, "fn");
      this.module.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((char)var4, var5, (char)var6, fnArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void addStuckCheck(@NotNull Value cfgArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 73446362815870L;
      long var4 = var2 ^ 22491250234366L;
      Intrinsics.checkNotNullParameter(cfgArg, "cfg");
      this.module.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(cfgArg, var4);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void setState(@NotNull String nameArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 108534312739867L;
      long var4 = var2 ^ 51451723206520L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      this.module.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(var4, nameArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final String currentState() {
      long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 98491580241617L;
      long var10001 = var1 ^ 123828793819627L;
      int var3 = (int)((var1 ^ 123828793819627L) >>> 32);
      int var4 = (int)((var1 ^ 123828793819627L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return this.module.llllIlllIIIlIllIlIIIIIIlllIlIlIIIIIIIlllIlllIIllIlIIlIIlIIlIIllllIIllIIIlIlIlIlllllIl(var3, var4, (short)var5);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void travelTo(@NotNull String locationArg, int argument2Arg) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 77174376328387L;
      long var5 = var3 ^ 134082260378817L;
      Intrinsics.checkNotNullParameter(locationArg, "location");
      this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(locationArg, var5, argument2Arg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final boolean reachedDestination() {
      long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 98810983549693L;
      long var3 = var1 ^ 130987013026500L;
      return this.module.IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(var3);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final String travelTarget() {
      return this.module.IIIllIllllIllIlllIIlIIIIIllIIIIIllIIllIlIlllllllllllIlIlIlIIlIIIIIIlIlIIIlllIIlIIIlIl();
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void reset(@NotNull String locationArg, @Nullable Value argument2Arg) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 121138897038713L;
      long var5 = var3 ^ 38609913948116L;
      Intrinsics.checkNotNullParameter(locationArg, "location");
      this.module.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(locationArg, var5, argument2Arg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @Nullable
   public final Object setting(@NotNull String idArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 120165667805939L;
      long var4 = var2 ^ 87930849222426L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return this.module.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, idArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final boolean setSetting(@NotNull String idArg, @Nullable Object argument2Arg) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 27487999701716L;
      long var5 = var3 ^ 38517022451712L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(idArg, var5, argument2Arg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final List<String> settings() {
      return this.module.IIIIIlIlIlIlllIIlIIllIlIIlIIlIlllIllllIllIIlIIIlIIllIllllIlllIllIIIlIlllIIIIllIIIIlII();
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void addSettings(@NotNull Value... settingsArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 64142590471638L;
      long var4 = var2 ^ 41283746616627L;
      long var6 = var2 ^ 58362404883529L;
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll var10 = lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var26 = this.module;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
      boolean var11 = false;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var8 = var10000;
      var var13 = new ArrayList();
      boolean var14 = false;
      Value[] var15 = settingsArg;
      boolean var16 = false;
      int var17 = 0;
      int var18 = settingsArg.length;

      while (true) {
         if (var17 < var18) {
            Value var19 = var15[var17];
            if (var8 != null) {
               break;
            }

            boolean var21 = false;
            boolean var23 = false;
            IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var27 = var10.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var19, var4
            );
            if (var27 != null) {
               IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var24 = var27;
               boolean var25 = false;
               var13.add(var24);
            }

            var17++;
            if (var8 == null) {
               continue;
            }
         }

         var26.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var13, var6);
         break;
      }
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void fail(@NotNull String reasonArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 33722050964039L;
      long var4 = var2 ^ 2637269282633L;
      Intrinsics.checkNotNullParameter(reasonArg, "reason");
      this.module.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var4, reasonArg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void addHelper(@NotNull Value helperArg, @NotNull Value conditionArg) {
      long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 19920395156762L;
      long var5 = var3 ^ 126996379381310L;
      Intrinsics.checkNotNullParameter(helperArg, "helper");
      Intrinsics.checkNotNullParameter(conditionArg, "condition");
      this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(helperArg, var5, conditionArg, false);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void addHelper(@NotNull Value helperArg, @NotNull Value conditionArg, boolean argument3Arg) {
      long var4 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 65024430590648L;
      long var6 = var4 ^ 99768266217884L;
      Intrinsics.checkNotNullParameter(helperArg, "helper");
      Intrinsics.checkNotNullParameter(conditionArg, "condition");
      this.module.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(helperArg, var6, conditionArg, argument3Arg);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII createCombatBot(@NotNull Value cfgArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 59953655353259L;
      long var4 = var2 ^ 64857484251073L;
      long var6 = var2 ^ 95515881553972L;
      Intrinsics.checkNotNullParameter(cfgArg, "cfg");
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var8 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(cfgArg, var6);
      this.binding.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var4);
      return new lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII(var8);
   }

   static {
      long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 136972524446649L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "ÿÌóî\u0096¢³ãô\u0080 \u0090Î\u009fq¤\u0010)Ë4\u009bNpBapÁ\u0091ÉÒ\u008fÖ&\u0010%yëN\u0095C©\u000fä\u0006¦_\u0014T`T\u0010D¸·I\u0090Ê·¥Ë-Q\u008bÀ\u00adQ\u007f\u0018|\u0001\u008aD<ÏA\u0014É÷`¦0ÅOt,2]\u0098\f~\u009cU\u0010¹\u0001À\u000f§1\u0089Üáù2`Ò\u001bN\u0016\u0010kò^A8\u008a²\u0004\u0098\"Vú\u0003ÄïÜ\u0010m$\u001c\u009f-kíÿ_\u008f*f¾vK²\u0010>\u009bFté\fVæ\u008f\u009fû\u0088\u000f\u000e)²\u0010þ\u009aJ+¡¥\u0096\u008aG.¾÷9¦&µ\u0010zïÙ\u0090\u001c\u008a\u000e|#\u0016m(Ù¨\u008d_\u0010\u0088@ y²·ðHÎ\u0013\u0002\u0094*\u0001j\u0086\u00181úêW\u0081\u0002\u0085\u008aY4Ï±Ð\u009e<Q©Ýù\u0006õt\u000e\t ª\b\u0003×TjZ\u009f6\u009bã·\u009aTC\u0085/*\u0007T\u001e#eÎìñª\u0006\u008eb3\u0007\u0010=O\u0085\nU\u0013\u0096\u0011\u009a\u0089=Û0\u0090\t\u0006\u0010\u0097§9\u0016ØZ¥ô\u0089\u0091k¾¶oSÙ";
      int var8 = "ÿÌóî\u0096¢³ãô\u0080 \u0090Î\u009fq¤\u0010)Ë4\u009bNpBapÁ\u0091ÉÒ\u008fÖ&\u0010%yëN\u0095C©\u000fä\u0006¦_\u0014T`T\u0010D¸·I\u0090Ê·¥Ë-Q\u008bÀ\u00adQ\u007f\u0018|\u0001\u008aD<ÏA\u0014É÷`¦0ÅOt,2]\u0098\f~\u009cU\u0010¹\u0001À\u000f§1\u0089Üáù2`Ò\u001bN\u0016\u0010kò^A8\u008a²\u0004\u0098\"Vú\u0003ÄïÜ\u0010m$\u001c\u009f-kíÿ_\u008f*f¾vK²\u0010>\u009bFté\fVæ\u008f\u009fû\u0088\u000f\u000e)²\u0010þ\u009aJ+¡¥\u0096\u008aG.¾÷9¦&µ\u0010zïÙ\u0090\u001c\u008a\u000e|#\u0016m(Ù¨\u008d_\u0010\u0088@ y²·ðHÎ\u0013\u0002\u0094*\u0001j\u0086\u00181úêW\u0081\u0002\u0085\u008aY4Ï±Ð\u009e<Q©Ýù\u0006õt\u000e\t ª\b\u0003×TjZ\u009f6\u009bã·\u009aTC\u0085/*\u0007T\u001e#eÎìñª\u0006\u008eb3\u0007\u0010=O\u0085\nU\u0013\u0096\u0011\u009a\u0089=Û0\u0090\t\u0006\u0010\u0097§9\u0016ØZ¥ô\u0089\u0091k¾¶oSÙ"
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
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[18];
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

                  var6 = "á\u0012\u0094e\u009b\ré\u001c¨±&7\u0087\u00137þU®+\u008dÚ\u0018ÊÇ ´\u009añY,]Y\u0092È¿µcÄ\u001b~gh1çW?w¾s\u001fæQ \u0098\u0015ï´";
                  var8 = "á\u0012\u0094e\u009b\ré\u001c¨±&7\u0087\u00137þU®+\u008dÚ\u0018ÊÇ ´\u009añY,]Y\u0092È¿µcÄ\u001b~gh1çW?w¾s\u001fæQ \u0098\u0015ï´"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23808;
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
            throw new RuntimeException("me/octo/client/scripting/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll", var10);
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
            "me/octo/client/scripting/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
