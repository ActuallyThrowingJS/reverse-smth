package me.octo.client.modules.impl.features.misc;

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class ChumBucketFiller extends BooleanModule {
   @NotNull
   public static ChumBucketFiller.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private boolean IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private boolean IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   @JvmField
   @NotNull
   public static ChumBucketFiller llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static long IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 29847025189684L;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static Map lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new HashMap(13);
   private static long[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static Long[] IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static Map IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;

   private ChumBucketFiller() {
      long var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ 30447924672567L;
      ModuleCategory var10003 = ModuleCategory.MISC;
      Setting[] var3 = new Setting[]{
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Chum Bucket Filler", "Automatically fills chum buckets by placing, filling, and picking up.", var10003, "Fishing", var3);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.CHECK_CHUM;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 91233016683311L;
      long var5 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var5);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.CHECK_CHUM;
      this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = (var4 ^ 0L) >>> 8;
      int var8 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var6, (byte)var8);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.CHECK_CHUM;
      this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
   }

   private final void IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = false;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = false;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = false;
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = false;
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = false;
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(long var1) {
      var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var1;
      long var3 = var1 ^ 102184334444387L;

      long var10000;
      label17: {
         try {
            if (lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
               .isToggled()) {
               var10000 = Random.Default
                  .nextLong(
                     IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(14724, 8548489762470430597L ^ var1),
                     IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(1452, 2523842679649942446L ^ var1)
                  );
               break label17;
            }
         } catch (NoWhenBranchMatchedException var7) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var7, 5190224962641032982L, var1
            );
         }

         var10000 = Random.Default
            .nextLong(
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(7422, 9047515093037130494L ^ var1),
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(16115, 5714219788689506544L ^ var1)
            );
      }

      long var5 = var10000;
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var3);
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eventArg
   ) {
      long var2 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ 105785104522426L;
      long var4 = (var2 ^ 34189742100926L) >>> 16;
      int var6 = (int)((var2 ^ 34189742100926L) << 48 >>> 48);
      Intrinsics.checkNotNullParameter(eventArg, "event");
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$2f1e861e49208737(var4, (char)var6, false);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3
   ) {
      var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var1;
      long var4 = var1 ^ 80987559409047L;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4);
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(String var1, long var2) {
      var2 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var2;
      long var4 = var2 ^ 11525219089740L;
      long var6 = var2 ^ 56730719672635L;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
         var4, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"c">(9701, 1069889708859831579L ^ var2) + var1
      );
      this.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var6);
   }

   static {
      long var11 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ 5823064681246L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[31];
      int var18 = 0;
      String var17 = "®Ñ÷N<ýO\u009a\u0094zxð\u008aÝ\u0086C\u0017htÞÁ+\u0083»Ùl4Æl\u0000í´\u0010÷l\u001f\u0098Æ¢¤ì±\u0090?rC1\"Ípèõ\u00825u\u0010\u0001¦|ZG]í\u0085´}c\u0085\u008de\u0006\u0005\u0003\u008f\u0083\u0091z\n(AÛX¬\u009acÓM1\n\u001ee\u0099ÌHé\u0002vZ\u0000ôó/¤\n\u001f¶1ßrÊ.¡Ni´X\u0081é\u0006õù\u001a5¾É[YBêÊÞÕ+\u0014\u0095EfÈKk\u001cY\u009ab@\u0010Í\r\u0093s&óº$ÕÅ\u001baÇ\u009c/aPC)Ñvö`o(\u0099\u000fã»¶E\u0081\u0096]Nû·þa¨T\u0095\u0084X\u008e\u0003+\u0096$\u008dPý=\u007f\"]H¯8\u0013\u0004\u008f\\ì1¯\u001b\u0013\u008f4cA\n»Þ\"r\u0011ú\u009byX6¾ï£\u0099\u008cÞ\u001f\u00882\u0098ù±)\u0013P{\u0085ï\u009e\u009apFuµgô)¾bnâ\u0089L&\u0010¹m\u0015\u009c\u0080}\u0088ÜYOD\"õÝÖ\u0091\u009fGu,´R£\u001fô\ny¡Gº\u008fSvYI&µô\u0090\u0007»º2®Á\u0007Ëhm¢g`E°³\u0098rÂ\\ð(ö3>\tH\u0019\u008e±{Ì1ZÍ½\u008aç\u000b$`\u001bùM\u0098Â*¸a6\u0014xÛ\u001e4Wvã\u0092r\u0088^\u0010è\u0093?c\u0089pgôÎ\u000bä\u001aç\u008aB*@RÚ+\u008fuþúò\u0094ÝÄ\u008d\u0097±Z}\u0097[}\b)\u001a5ø=\r\u0007úÍ\u0002¨\u000f\u0094ö\u0089?^\u0004ÅWÙQ¡®îdç¥9Ö\u0003\u0084\u001e<\u0081ù\u009es\u0018ë&\u0007¾{@\u008eîOÓpú*\u009e7öc;áó\n«§\u0082Î\u008fårØ)\u001bìá\u008a\u0019O\\\u001d\u0097¥Öµ\u0081s*\u0003èÝ'é¼¤)\u0085×\t\u0093PðÈ\fUÆÌÕ³Ô\u0000\u0083-\u0010\u009c±í\u0015\u008fá\u0090\u008eö\u0083$ -(\u0018\u0016\u0010\u0014ÒY\u0088îNía<Rò\u0015F+d\u00930Hµ8z\u009a\u0019/ÄVDz\u009dö}\u0094lÀ¡ßPJú`\u0005£*\u0091óÁæg¸Cgµ\u0019ã´Ó¥Ä{ºe=SÍÕ0\u0085\u0089Ä@²oiªÈñZî(\u0083æÛùÃ\u0083ËX\u0012òª\u0099á9\u0012#\u008f¡èùþª\u008bd\u0011¸\u009a)mAxgK|\u009a ð=\u009e¯\u008b\u001e\u008e3tATR@È\u009a¶\u000fÑP\u0087*Åì\u0002z\u009b§Ï\u009d\u0099Ó²0ÇÁ\u009f&Ú~\nj\u0084\u0098¸n\u009b·\u0014\u008bóJì\u009b\fÓ\n\u0016ãs\u0088ì\u0003´\u0081Î¿ãÅê'\u0015\u0000Â8îA\u0006\u0086g=7\u0010Z¸HH\u009a\u0000¼q\u0002\u009aÓ5\u0086â÷+HQ\u00842iX/)kñ@uqSW\u0012ò5\u000f¸*Ëé\u0005\u008c1ß\"mqKr\u001bß\u009f\u008dYJ#\u009d\u007få¬ögÌV\u00ad°\u0088d;]Ïh~Ø\\ÁôÔîÒ¦9@uí;û-ß\u008f@I9\r\u0083\u0093'ÃsùHÿ'\u0000\u00886û\u008aLqqÉ\u0099J a~Cú«[_±WE\u0081¤ö\u0017\u008e²\u0012ü\u0085*Ø\tW\u0092\u00ad,Üu-äØ\u0011Û\u0016¦Õ\u0098\\§\u008b\u0010\u0080\u0016ik\u00adI\u009a\u0012h\u0092Ài\u0082\u001e[n\u0018$ûâ:\u001a\u000e;®\u0010V\u00ad³Å\u0087¼\u0016ªÿ´Ú²UTåX\u0016Y/ä_g#Z\u008eK9\u000ed\r\u009a\u0005çØ\u0085½\u009a^¯)\u0015çIøÕy\t¿\u008cè)S<\\MÁÔ³\u0093\u0083¢]*Ã,\u0084\u0091Ú\u001aå¶k\u009cÀx1HO\tiø\u008fu-ï\u0002º\u0089h4\u00893ÒÝ\u0007\u0099a\u0012¯\u00807\u001e\u008c8 <\u0094òå\u00ad\u0019.ê\u008cÎñ@©\u001c\u001f½\u0088Zý\u008b²\u0091 Ù\u0018ÕÄ®\u0084\u0098\u0084\u00868\u001e>ó¶AX;+r\u00116\u0000-èÓ£\u00924\u0083ÁäJ\u000f\u009c¤ÁòÆãòI\u0015L¢\u009bn\"º'\u0010Ôàe1i¬\u0013NoA]Ù,ÑØ$(cPzìS\u001a\u0086\u0096\f\u0095xw\u0090\u008bá¤Ù²\u000b* ~%«!Úÿø\u0002?\u00064æ´ð¥þaEÎ\u0018\u0015ÍÁÀ\u0092±&DB\t%\u0085£6Ú\u008dòæJ\u001eë{±\u0018(lA\u0096\u009bãxé³Áû)ql¤ÀQ`#Ü)\u0097\u001eYh\u0091I\u007f[\u00037Ú´¥Ò\u0003\u001dåUÓ\u0089\u0010Oþkÿ$JF \u0080)°Fü{Ñ0\u0018Þô\u000b?ª<'ü¿\u008cü¯N?E:2P³£\"£QôH\u0081\u009då0j#\u0093Þ»éôÕY\u0088Ûåzô\u0016ú\u008a0 R\u0099>ô¨Õg5;dÆ\u0095\u00002\u0000\u0007ìy\u009cÊ)\u000f1\u0090\u0099\u0097Y¼îÀÕ¸¢Ì\u008d¯HSÀð\u0080¢¤Y&D¤\u009fw";
      int var19 = "®Ñ÷N<ýO\u009a\u0094zxð\u008aÝ\u0086C\u0017htÞÁ+\u0083»Ùl4Æl\u0000í´\u0010÷l\u001f\u0098Æ¢¤ì±\u0090?rC1\"Ípèõ\u00825u\u0010\u0001¦|ZG]í\u0085´}c\u0085\u008de\u0006\u0005\u0003\u008f\u0083\u0091z\n(AÛX¬\u009acÓM1\n\u001ee\u0099ÌHé\u0002vZ\u0000ôó/¤\n\u001f¶1ßrÊ.¡Ni´X\u0081é\u0006õù\u001a5¾É[YBêÊÞÕ+\u0014\u0095EfÈKk\u001cY\u009ab@\u0010Í\r\u0093s&óº$ÕÅ\u001baÇ\u009c/aPC)Ñvö`o(\u0099\u000fã»¶E\u0081\u0096]Nû·þa¨T\u0095\u0084X\u008e\u0003+\u0096$\u008dPý=\u007f\"]H¯8\u0013\u0004\u008f\\ì1¯\u001b\u0013\u008f4cA\n»Þ\"r\u0011ú\u009byX6¾ï£\u0099\u008cÞ\u001f\u00882\u0098ù±)\u0013P{\u0085ï\u009e\u009apFuµgô)¾bnâ\u0089L&\u0010¹m\u0015\u009c\u0080}\u0088ÜYOD\"õÝÖ\u0091\u009fGu,´R£\u001fô\ny¡Gº\u008fSvYI&µô\u0090\u0007»º2®Á\u0007Ëhm¢g`E°³\u0098rÂ\\ð(ö3>\tH\u0019\u008e±{Ì1ZÍ½\u008aç\u000b$`\u001bùM\u0098Â*¸a6\u0014xÛ\u001e4Wvã\u0092r\u0088^\u0010è\u0093?c\u0089pgôÎ\u000bä\u001aç\u008aB*@RÚ+\u008fuþúò\u0094ÝÄ\u008d\u0097±Z}\u0097[}\b)\u001a5ø=\r\u0007úÍ\u0002¨\u000f\u0094ö\u0089?^\u0004ÅWÙQ¡®îdç¥9Ö\u0003\u0084\u001e<\u0081ù\u009es\u0018ë&\u0007¾{@\u008eîOÓpú*\u009e7öc;áó\n«§\u0082Î\u008fårØ)\u001bìá\u008a\u0019O\\\u001d\u0097¥Öµ\u0081s*\u0003èÝ'é¼¤)\u0085×\t\u0093PðÈ\fUÆÌÕ³Ô\u0000\u0083-\u0010\u009c±í\u0015\u008fá\u0090\u008eö\u0083$ -(\u0018\u0016\u0010\u0014ÒY\u0088îNía<Rò\u0015F+d\u00930Hµ8z\u009a\u0019/ÄVDz\u009dö}\u0094lÀ¡ßPJú`\u0005£*\u0091óÁæg¸Cgµ\u0019ã´Ó¥Ä{ºe=SÍÕ0\u0085\u0089Ä@²oiªÈñZî(\u0083æÛùÃ\u0083ËX\u0012òª\u0099á9\u0012#\u008f¡èùþª\u008bd\u0011¸\u009a)mAxgK|\u009a ð=\u009e¯\u008b\u001e\u008e3tATR@È\u009a¶\u000fÑP\u0087*Åì\u0002z\u009b§Ï\u009d\u0099Ó²0ÇÁ\u009f&Ú~\nj\u0084\u0098¸n\u009b·\u0014\u008bóJì\u009b\fÓ\n\u0016ãs\u0088ì\u0003´\u0081Î¿ãÅê'\u0015\u0000Â8îA\u0006\u0086g=7\u0010Z¸HH\u009a\u0000¼q\u0002\u009aÓ5\u0086â÷+HQ\u00842iX/)kñ@uqSW\u0012ò5\u000f¸*Ëé\u0005\u008c1ß\"mqKr\u001bß\u009f\u008dYJ#\u009d\u007få¬ögÌV\u00ad°\u0088d;]Ïh~Ø\\ÁôÔîÒ¦9@uí;û-ß\u008f@I9\r\u0083\u0093'ÃsùHÿ'\u0000\u00886û\u008aLqqÉ\u0099J a~Cú«[_±WE\u0081¤ö\u0017\u008e²\u0012ü\u0085*Ø\tW\u0092\u00ad,Üu-äØ\u0011Û\u0016¦Õ\u0098\\§\u008b\u0010\u0080\u0016ik\u00adI\u009a\u0012h\u0092Ài\u0082\u001e[n\u0018$ûâ:\u001a\u000e;®\u0010V\u00ad³Å\u0087¼\u0016ªÿ´Ú²UTåX\u0016Y/ä_g#Z\u008eK9\u000ed\r\u009a\u0005çØ\u0085½\u009a^¯)\u0015çIøÕy\t¿\u008cè)S<\\MÁÔ³\u0093\u0083¢]*Ã,\u0084\u0091Ú\u001aå¶k\u009cÀx1HO\tiø\u008fu-ï\u0002º\u0089h4\u00893ÒÝ\u0007\u0099a\u0012¯\u00807\u001e\u008c8 <\u0094òå\u00ad\u0019.ê\u008cÎñ@©\u001c\u001f½\u0088Zý\u008b²\u0091 Ù\u0018ÕÄ®\u0084\u0098\u0084\u00868\u001e>ó¶AX;+r\u00116\u0000-èÓ£\u00924\u0083ÁäJ\u000f\u009c¤ÁòÆãòI\u0015L¢\u009bn\"º'\u0010Ôàe1i¬\u0013NoA]Ù,ÑØ$(cPzìS\u001a\u0086\u0096\f\u0095xw\u0090\u008bá¤Ù²\u000b* ~%«!Úÿø\u0002?\u00064æ´ð¥þaEÎ\u0018\u0015ÍÁÀ\u0092±&DB\t%\u0085£6Ú\u008dòæJ\u001eë{±\u0018(lA\u0096\u009bãxé³Áû)ql¤ÀQ`#Ü)\u0097\u001eYh\u0091I\u007f[\u00037Ú´¥Ò\u0003\u001dåUÓ\u0089\u0010Oþkÿ$JF \u0080)°Fü{Ñ0\u0018Þô\u000b?ª<'ü¿\u008cü¯N?E:2P³£\"£QôH\u0081\u009då0j#\u0093Þ»éôÕY\u0088Ûåzô\u0016ú\u008a0 R\u0099>ô¨Õg5;dÆ\u0095\u00002\u0000\u0007ìy\u009cÊ)\u000f1\u0090\u0099\u0097Y¼îÀÕ¸¢Ì\u008d¯HSÀð\u0080¢¤Y&D¤\u009fw"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var43 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var43;
         if ((var15 += var16) >= var19) {
            var17 = "\u0016ßg¨Ø\u001bPMmñ\u0098ã\u0084ðÉÁ\rò\u0016\u0087ÿ\u0002q\u0004ÈS\u009a×·ÿ2o\u008bS-Í\u0007\rÒ\u0099/~\u0006\u008b\u0081'·+P\u0099\u0013\u0096\"ã\u0003\u009bq(]F\u001dqðÀ@WmäÈ4c¸£èOqHÔt-êJ´\u0010m®\u000b\u008b\u0001úß9Ë\u001cfÜ;\u008e\u0014\u008f\n´\r0VðÌÕÖ\u009f´\u00005·\u0019¡´¸ú\u0088\u0014lsJ]\u0098Z\u0012±";
            var19 = "\u0016ßg¨Ø\u001bPMmñ\u0098ã\u0084ðÉÁ\rò\u0016\u0087ÿ\u0002q\u0004ÈS\u009a×·ÿ2o\u008bS-Í\u0007\rÒ\u0099/~\u0006\u008b\u0081'·+P\u0099\u0013\u0096\"ã\u0003\u009bq(]F\u001dqðÀ@WmäÈ4c¸£èOqHÔt-êJ´\u0010m®\u000b\u008b\u0001úß9Ë\u001cfÜ;\u008e\u0014\u008f\n´\r0VðÌÕÖ\u009f´\u00005·\u0019¡´¸ú\u0088\u0014lsJ]\u0098Z\u0012±"
               .length();
            var16 = '@';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var45 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var21).intern();
               int var37 = 0;
               var20[var18++] = var45;
               if ((var15 += var16) >= var19) {
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var20;
                  llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new String[31];
                  IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ýúö9ÜÍ8T\u000eÐ\u0019ä\u0089¼ð`";
                  int var5 = "ýúö9ÜÍ8T\u000eÐ\u0019ä\u0089¼ð`".length();
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
                     byte var49 = -1;
                     var6[var37] = var10004;
                  } while (var2 < var5);

                  var4 = "ÅÊÎÜ_Ø(_¢/ÿÜ\u00ad(y\u0004";
                  var5 = "ÅÊÎÜ_Ø(_¢/ÿÜ\u00ad(y\u0004".length();
                  var2 = 0;

                  do {
                     int var41 = var2;
                     var2 += 8;
                     byte[] var25 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                     var41 = var3++;
                     long var26 = (var25[0] & 255L) << 56
                        | (var25[1] & 255L) << 48
                        | (var25[2] & 255L) << 40
                        | (var25[3] & 255L) << 32
                        | (var25[4] & 255L) << 24
                        | (var25[5] & 255L) << 16
                        | (var25[6] & 255L) << 8
                        | var25[7] & 255L;
                     byte[] var27 = var0.doFinal(
                        new byte[]{
                           (byte)(var26 >>> 56),
                           (byte)(var26 >>> 48),
                           (byte)(var26 >>> 40),
                           (byte)(var26 >>> 32),
                           (byte)(var26 >>> 24),
                           (byte)(var26 >>> 16),
                           (byte)(var26 >>> 8),
                           (byte)var26
                        }
                     );
                     long var51 = (var27[0] & 255L) << 56
                        | (var27[1] & 255L) << 48
                        | (var27[2] & 255L) << 40
                        | (var27[3] & 255L) << 32
                        | (var27[4] & 255L) << 24
                        | (var27[5] & 255L) << 16
                        | (var27[6] & 255L) << 8
                        | var27[7] & 255L;
                     boolean var50 = false;
                     var6[var41] = var51;
                  } while (var2 < var5);

                  IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var6;
                  IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new Long[4];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new ChumBucketFiller.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new ChumBucketFiller();
                  return;
               }

               var16 = var17.charAt(var15);
            }
         }

         var16 = var17.charAt(var15);
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
      return var0;
   }

   private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24197;
      if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/misc/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
         byte[] var9 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5].getBytes("ISO-8859-1");
         llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/features/misc/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30144;
      if (IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var3] == null) {
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
         long var5 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var3];
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
         Object[] var9 = (Object[])IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/misc/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var3] = var15;
      }

      return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var3];
   }

   private static long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
            "me/octo/client/modules/impl/features/misc/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$8943e154317528cb(String var1, long var2) {
      var2 = 74653188836698L;
      var2 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var2;
      long var4 = var2 ^ 11525219089740L;
      long var6 = var2 ^ 56730719672635L;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$cf2438d7b5c3e92e(
         var4, "§c[ChumBucketFiller] " + var1
      );
      this.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII$recovered$edf9a9b69c3b8018(var6);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4ae224c727133486(
      long var1, ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var3
   ) {
      var1 = 48837262126893L;
      var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var1;
      long var4 = var1 ^ 80987559409047L;
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var3;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var4);
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$9024003689f58c73(
      String param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI$recovered$5881b806e17951f9(long var1) {
      var1 = 92325574789364L;
      var1 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll ^ var1;
      long var3 = var1 ^ 102184334444387L;

      long var10000;
      label17: {
         try {
            if (lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
               .isToggled()) {
               var10000 = Random.Default
                  .nextLong(
                     IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(14724, 8548489762470430597L ^ var1),
                     IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(1452, 2523842679649942446L ^ var1)
                  );
               break label17;
            }
         } catch (NoWhenBranchMatchedException var8) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8);
         }

         var10000 = Random.Default
            .nextLong(
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(7422, 9047515093037130494L ^ var1),
               IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"d">(16115, 5714219788689506544L ^ var1)
            );
      }

      long var5 = var10000;
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$62620d82106d9f7d(var5, var3);
   }

   private static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      CHECK_CHUM,
      WAIT_FOR_CHUM,
      SWAP_TO_BUCKET,
      PLACE_BUCKET,
      SWAP_TO_CHUM,
      FILL_BUCKET,
      PICKUP_BUCKET,
      WAIT_FOR_PICKUP;

      @NotNull
      public static EnumEntries<ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 40814997318785L ^ 140736518330755L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[8];
         int var6 = 0;
         String var5 = "5\u0000à\u0003¢m7mx¶/ù\u008d\u0095%D\u00103C\u0092Jÿ\u008d;\u0006¸R ð\u0097\u000e\u009b/\u0010ÂÐ×cåõ\u0085y\u0097ÁÏ#\ffÐS\u0010¡\u0089\u0086ñ \u008c[ä\u0085¶T\u0093\u008cÂ5\u0080\u00102sÙÙûÅ&\u0088îW\u008e\u0013\u001d|\u008d\u0082\u0010\u008dtß§ÙÝOYë\u009f\u0092:ÙfÍ\u001c";
         int var7 = "5\u0000à\u0003¢m7mx¶/ù\u008d\u0095%D\u00103C\u0092Jÿ\u008d;\u0006¸R ð\u0097\u000e\u009b/\u0010ÂÐ×cåõ\u0085y\u0097ÁÏ#\ffÐS\u0010¡\u0089\u0086ñ \u008c[ä\u0085¶T\u0093\u008cÂ5\u0080\u00102sÙÙûÅ&\u0088îW\u008e\u0013\u001d|\u008d\u0082\u0010\u008dtß§ÙÝOYë\u009f\u0092:ÙfÍ\u001c"
            .length();
         char var4 = '\u0010';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var21;
            if ((var3 += var4) >= var7) {
               var5 = "2sÙÙûÅ&\u0088á\u0082>ÑtÍ\u0094g\u0010\u008dtß§ÙÝOYw\u0011;¨\u00165E\r";
               var7 = "2sÙÙûÅ&\u0088á\u0082>ÑtÍ\u0094g\u0010\u008dtß§ÙÝOYw\u0011;¨\u00165E\r".length();
               var4 = '\u0010';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var19 = false;
                  var0[var6++] = var23;
                  if ((var3 += var4) >= var7) {
                     CHECK_CHUM = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     WAIT_FOR_CHUM = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     SWAP_TO_BUCKET = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     PLACE_BUCKET = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     SWAP_TO_CHUM = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     FILL_BUCKET = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     PICKUP_BUCKET = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     WAIT_FOR_PICKUP = new ChumBucketFiller.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
