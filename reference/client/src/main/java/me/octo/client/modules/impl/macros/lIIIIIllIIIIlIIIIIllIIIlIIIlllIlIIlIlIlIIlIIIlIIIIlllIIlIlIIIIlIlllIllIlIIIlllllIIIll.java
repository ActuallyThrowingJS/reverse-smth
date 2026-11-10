package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll {
   @NotNull
   private final List<Class<? extends Entity>> targetClasses;
   @NotNull
   private final List<String> targetNames;
   @NotNull
   private final List<AABB> targetBoxes;
   @NotNull
   private final List<AABB> ignoreBoxes;
   @NotNull
   private final Vec3 hotZone;
   @NotNull
   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll warpLocation;
   @NotNull
   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll location;
   @NotNull
   private final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll slayer;
   @NotNull
   private final List<me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> route;
   @NotNull
   private final List<AABB> idleBoxes;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 64147650695193L;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

   public lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
      @NotNull List<? extends Class<? extends Entity>> targetClassesArg,
      @NotNull List<String> targetNamesArg,
      @NotNull List<? extends AABB> targetBoxesArg,
      @NotNull List<? extends AABB> ignoreBoxesArg,
      @NotNull Vec3 hotZoneArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll warpLocationArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll locationArg,
      @NotNull IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll slayerArg,
      @NotNull List<me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> routeArg,
      @NotNull List<? extends AABB> idleBoxesArg
   ) {
      long var11 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 93380222494960L;
      Intrinsics.checkNotNullParameter(targetClassesArg, "targetClasses");
      Intrinsics.checkNotNullParameter(targetNamesArg, "targetNames");
      Intrinsics.checkNotNullParameter(targetBoxesArg, "targetBoxes");
      Intrinsics.checkNotNullParameter(ignoreBoxesArg, "ignoreBoxes");
      Intrinsics.checkNotNullParameter(hotZoneArg, "hotZone");
      Intrinsics.checkNotNullParameter(warpLocationArg, "warpLocation");
      Intrinsics.checkNotNullParameter(locationArg, "location");
      Intrinsics.checkNotNullParameter(slayerArg, "slayer");
      Intrinsics.checkNotNullParameter(routeArg, "route");
      Intrinsics.checkNotNullParameter(idleBoxesArg, "idleBoxes");
      super();
      this.targetClasses = targetClassesArg;
      this.targetNames = targetNamesArg;
      this.targetBoxes = targetBoxesArg;
      this.ignoreBoxes = ignoreBoxesArg;
      this.hotZone = hotZoneArg;
      this.warpLocation = warpLocationArg;
      this.location = locationArg;
      this.slayer = slayerArg;
      this.route = routeArg;
      this.idleBoxes = idleBoxesArg;
   }

   @NotNull
   public final List<Class<? extends Entity>> getTargetClasses() {
      return this.targetClasses;
   }

   @NotNull
   public final List<String> getTargetNames() {
      return this.targetNames;
   }

   @NotNull
   public final List<AABB> getTargetBoxes() {
      return this.targetBoxes;
   }

   @NotNull
   public final List<AABB> getIgnoreBoxes() {
      return this.ignoreBoxes;
   }

   @NotNull
   public final Vec3 getHotZone() {
      return this.hotZone;
   }

   @NotNull
   public final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getWarpLocation() {
      return this.warpLocation;
   }

   @NotNull
   public final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getLocation() {
      return this.location;
   }

   @NotNull
   public final IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll getSlayer() {
      return this.slayer;
   }

   @NotNull
   public final List<me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> getRoute() {
      return this.route;
   }

   @NotNull
   public final List<AABB> getIdleBoxes() {
      return this.idleBoxes;
   }

   @NotNull
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull List var1,
      @NotNull List var2,
      @NotNull List var3,
      @NotNull List var4,
      @NotNull Vec3 var5,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7,
      @NotNull IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var8,
      @NotNull List var9,
      @NotNull List var10,
      long var11
   ) {
      var11 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var11;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(25578, 4164254649970402127L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(15700, 4927944422471794173L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(28667, 1451306215109439299L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(9585, 4368771090873902540L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(3715, 2057224194149600804L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(29872, 3666035605500867589L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(13900, 7708558894576432891L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(13810, 8043553527853086040L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(31497, 5153042888793013179L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(1850, 4396107044671735702L ^ var11)
      );
      return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var10
      );
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 16807205907178L;
      List var3 = this.idleBoxes;
      List var4 = this.route;
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll var5 = this.slayer;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this.location;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.warpLocation;
      Vec3 var8 = this.hotZone;
      List var9 = this.ignoreBoxes;
      List var10 = this.targetBoxes;
      List var11 = this.targetNames;
      List var12 = this.targetClasses;
      return "SlayerArea(targetClasses="
         + var12
         + ", targetNames="
         + var11
         + ", targetBoxes="
         + var10
         + ", ignoreBoxes="
         + var9
         + ", hotZone="
         + var8
         + ", warpLocation="
         + var7
         + ", location="
         + var6
         + ", slayer="
         + var5
         + ", route="
         + var4
         + ", idleBoxes="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 36467488680573L;
      int var4 = this.targetClasses.hashCode();
      IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      var4 = var4 * 31 + this.targetNames.hashCode();
      var4 = var4 * 31 + this.targetBoxes.hashCode();
      var4 = var4 * 31 + this.ignoreBoxes.hashCode();
      var4 = var4 * 31 + this.hotZone.hashCode();
      var4 = var4 * 31 + this.warpLocation.hashCode();
      var4 = var4 * 31 + this.location.hashCode();
      var4 = var4 * 31 + this.slayer.hashCode();
      var4 = var4 * 31 + this.route.hashCode();
      var4 = var4 * 31 + this.idleBoxes.hashCode();

      try {
         if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            String var5 = "vpl1g";
            IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }

         return var4;
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 3389070316239L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[30];
      int var7 = 0;
      String var6 = "ÂÀ\u008c}\u000f Å!A\u001f.ßä½¸A+?\u008c\"R}·\u00adYäf\u008f\u007fÞäa O\u001dy\u008dóÕM«\"¡\u0017\u0012ä\u008fC¼3\u009cx\u0003\r4±ÙOÛ`y\u0012Ó\u0087h\u0018¸à¡\u009c*8\"\u009cñCú+~áB¶Ê9lûüE× \u0010;Ï!LD4\"\u0007\"[äÉÀÊ'Í \u009f#\u0093HÉïR\u0000sµpê¬Q\u009a¶Î\u0081\u0093\u008ew§zb\u0084ûA°\u0000\u008ad¿ \u0099Nr©1]Ê0IØ°Ký1\u008cå\u0018rì\u0006\u0006ÆL\u0099\u009bùR\u009b² \u0003Ä\u0010¨bù5ªt`cÁG¼\u008a¦\u0015fË0\rÿ\u0013:ù5ª¿¤üÃ¥\u0093z[É/C:z³UZ;z\r\u009d¿[\u0002mÃ\u0083pMt\u0081ë>]\u0004C-\u0087uö\u001c(\u0018\b6r\u0098aN£U_>xÜ\u001bm\u0083·\u0086È\u0093Ý·\u008a\u0002ú\u0010kù\u0006\u008a§GB_\u0095Z-\fFQóß ñOx\u0006\u0014@MàÃ_\u0096T\u0005\u0085Y.æ³\u000bNYï61×Å{\u001d\u0092\u00ad\u001bÕ \u00986r¯4Ø:ï#\u009c\u0097Y\u009a\b/¦9mÄ\u0097üyáwÄjG\u009e\u0080T\u001am\u0018\u008dØÙ,]ü\u0016\u007f/H0y5\u0092sÂ8ÌÀÛqæ\u0006Ì °fo¿\u008e\"\\¸°»\u009f/~\"Ñ\u009cD3Á}\u0019gÈJ\u009c\u0005ÔçÉ\u0001°\u008a\u0010²¥\u0091\u0092;\u001f\u0091\u008a9î\u0000c!<\u0086Ç\u00185·\u0000åv~¹ùï0ìMíPâ\nÐ\u00057\u0006¡×\u009fØ \u0096Ö;D\u001b\u001c`%\t¹ëjé\u0016Ó\u009bf ¬\u0094\n/\u0002ªÁw\u0095ÍÛ>+Æ o\u0000ôá¶O^h\u009d\u008a\u009apûÜ¨MïÈÀ\u0002ú\u000eÐÎé\u001d½2\u001ciß+\u0018s4G^\u0089 \f½Ðåù@\u0080\"HòQ\"o\u0098wxTÖ\u0018\u007f`A·\u009aá\u0094úÏ'\u009ad\u000bÓÈè;F\r\u009d¿Øä¢ $\u0015.\u0086K+ÖD\u008fÐ\u001dý\u001dË{\u009f\u0086{\u0018«\bCùÛ\t\u009f\u0098:\u0096RÐ÷ V\u000bâ z/'Fâm«Òg~\u001a@\u001dý\u009b¡äì\u0012\u0014Î°\u007f\bûÐ7[\u0010õ\\×\u0011a$øóL)}\u008d)GYM\u00101ÿ\"q\u009b\u007fª \u0082T\u008bM\u0089Ç\u009d\u0092 \u0007¸9\u0014\u0000Pæ9\u0018Û\u0010#\u001eWð\u001c\u009fwó>õ\\9\\¨É'¹Ä\u001d}y\u0018î\u000e3'\u000bÖ\u0002\n\u008b´¤\\Ø~9Ñ6\u0013-®73±Ý t\u0083Äª÷jêVÖÅd\u009a¹\u0090³ü²\u000f\u0082Àv\u0098¡\\ô»\u0086\u0007\u0002\u009e\"\u0018 \u0004@\u009d¥_®H\u0016¦ RÁÌ{f\u0000í\u009bÉ\u0012Y\u0090Lõ j'$p\r\u0083É";
      int var8 = "ÂÀ\u008c}\u000f Å!A\u001f.ßä½¸A+?\u008c\"R}·\u00adYäf\u008f\u007fÞäa O\u001dy\u008dóÕM«\"¡\u0017\u0012ä\u008fC¼3\u009cx\u0003\r4±ÙOÛ`y\u0012Ó\u0087h\u0018¸à¡\u009c*8\"\u009cñCú+~áB¶Ê9lûüE× \u0010;Ï!LD4\"\u0007\"[äÉÀÊ'Í \u009f#\u0093HÉïR\u0000sµpê¬Q\u009a¶Î\u0081\u0093\u008ew§zb\u0084ûA°\u0000\u008ad¿ \u0099Nr©1]Ê0IØ°Ký1\u008cå\u0018rì\u0006\u0006ÆL\u0099\u009bùR\u009b² \u0003Ä\u0010¨bù5ªt`cÁG¼\u008a¦\u0015fË0\rÿ\u0013:ù5ª¿¤üÃ¥\u0093z[É/C:z³UZ;z\r\u009d¿[\u0002mÃ\u0083pMt\u0081ë>]\u0004C-\u0087uö\u001c(\u0018\b6r\u0098aN£U_>xÜ\u001bm\u0083·\u0086È\u0093Ý·\u008a\u0002ú\u0010kù\u0006\u008a§GB_\u0095Z-\fFQóß ñOx\u0006\u0014@MàÃ_\u0096T\u0005\u0085Y.æ³\u000bNYï61×Å{\u001d\u0092\u00ad\u001bÕ \u00986r¯4Ø:ï#\u009c\u0097Y\u009a\b/¦9mÄ\u0097üyáwÄjG\u009e\u0080T\u001am\u0018\u008dØÙ,]ü\u0016\u007f/H0y5\u0092sÂ8ÌÀÛqæ\u0006Ì °fo¿\u008e\"\\¸°»\u009f/~\"Ñ\u009cD3Á}\u0019gÈJ\u009c\u0005ÔçÉ\u0001°\u008a\u0010²¥\u0091\u0092;\u001f\u0091\u008a9î\u0000c!<\u0086Ç\u00185·\u0000åv~¹ùï0ìMíPâ\nÐ\u00057\u0006¡×\u009fØ \u0096Ö;D\u001b\u001c`%\t¹ëjé\u0016Ó\u009bf ¬\u0094\n/\u0002ªÁw\u0095ÍÛ>+Æ o\u0000ôá¶O^h\u009d\u008a\u009apûÜ¨MïÈÀ\u0002ú\u000eÐÎé\u001d½2\u001ciß+\u0018s4G^\u0089 \f½Ðåù@\u0080\"HòQ\"o\u0098wxTÖ\u0018\u007f`A·\u009aá\u0094úÏ'\u009ad\u000bÓÈè;F\r\u009d¿Øä¢ $\u0015.\u0086K+ÖD\u008fÐ\u001dý\u001dË{\u009f\u0086{\u0018«\bCùÛ\t\u009f\u0098:\u0096RÐ÷ V\u000bâ z/'Fâm«Òg~\u001a@\u001dý\u009b¡äì\u0012\u0014Î°\u007f\bûÐ7[\u0010õ\\×\u0011a$øóL)}\u008d)GYM\u00101ÿ\"q\u009b\u007fª \u0082T\u008bM\u0089Ç\u009d\u0092 \u0007¸9\u0014\u0000Pæ9\u0018Û\u0010#\u001eWð\u001c\u009fwó>õ\\9\\¨É'¹Ä\u001d}y\u0018î\u000e3'\u000bÖ\u0002\n\u008b´¤\\Ø~9Ñ6\u0013-®73±Ý t\u0083Äª÷jêVÖÅd\u009a¹\u0090³ü²\u000f\u0082Àv\u0098¡\\ô»\u0086\u0007\u0002\u009e\"\u0018 \u0004@\u009d¥_®H\u0016¦ RÁÌ{f\u0000í\u009bÉ\u0012Y\u0090Lõ j'$p\r\u0083É"
         .length();
      char var5 = ' ';
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
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[30];
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

                  var6 = "¢x\u0007\\( \u0089\b\u0011\tÔ\u008aqÄWx}an _+äØL9\u0010)ó-\u0092y !\u008fv>+²¢´À\u0004\u007fÊ\u0002\u001bÍ\u0087Gw\u0096\u0088Pº\"¶\u0099ó\u001d\u009c\u0013\nB ";
                  var8 = "¢x\u0007\\( \u0089\b\u0011\tÔ\u008aqÄWx}an _+äØL9\u0010)ó-\u0092y !\u008fv>+²¢´À\u0004\u007fÊ\u0002\u001bÍ\u0087Gw\u0096\u0088Pº\"¶\u0099ó\u001d\u009c\u0013\nB "
                     .length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23420;
      if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll", var10
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
         byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
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
            "me/octo/client/modules/impl/macros/lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
