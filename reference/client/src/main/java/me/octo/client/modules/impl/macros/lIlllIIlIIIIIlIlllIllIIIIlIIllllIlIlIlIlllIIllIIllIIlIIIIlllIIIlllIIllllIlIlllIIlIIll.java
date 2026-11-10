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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll {
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
   private final List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> route;
   @NotNull
   private final List<Function1<Entity, Boolean>> targetPriority;
   @NotNull
   private final List<AABB> idleBoxes;
   @NotNull
   private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll bounds;
   private static String lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 3311004491069L;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static Map llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new HashMap(13);

   public lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll(
      @NotNull List<? extends Class<? extends Entity>> targetClassesArg,
      @NotNull List<String> targetNamesArg,
      @NotNull List<? extends AABB> targetBoxesArg,
      @NotNull List<? extends AABB> ignoreBoxesArg,
      @NotNull Vec3 hotZoneArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll warpLocationArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll locationArg,
      @NotNull List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> routeArg,
      @NotNull List<? extends Function1<? super Entity, Boolean>> targetPriorityArg,
      @NotNull List<? extends AABB> idleBoxesArg,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll boundsArg
   ) {
      long var12 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 62455788851515L;
      Intrinsics.checkNotNullParameter(targetClassesArg, "targetClasses");
      Intrinsics.checkNotNullParameter(targetNamesArg, "targetNames");
      Intrinsics.checkNotNullParameter(targetBoxesArg, "targetBoxes");
      Intrinsics.checkNotNullParameter(ignoreBoxesArg, "ignoreBoxes");
      Intrinsics.checkNotNullParameter(hotZoneArg, "hotZone");
      Intrinsics.checkNotNullParameter(warpLocationArg, "warpLocation");
      Intrinsics.checkNotNullParameter(locationArg, "location");
      Intrinsics.checkNotNullParameter(routeArg, "route");
      Intrinsics.checkNotNullParameter(targetPriorityArg, "targetPriority");
      Intrinsics.checkNotNullParameter(idleBoxesArg, "idleBoxes");
      Intrinsics.checkNotNullParameter(boundsArg, "bounds");
      super();
      this.targetClasses = targetClassesArg;
      this.targetNames = targetNamesArg;
      this.targetBoxes = targetBoxesArg;
      this.ignoreBoxes = ignoreBoxesArg;
      this.hotZone = hotZoneArg;
      this.warpLocation = warpLocationArg;
      this.location = locationArg;
      this.route = routeArg;
      this.targetPriority = targetPriorityArg;
      this.idleBoxes = idleBoxesArg;
      this.bounds = boundsArg;
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
   public final List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> getRoute() {
      return this.route;
   }

   @NotNull
   public final List<Function1<Entity, Boolean>> getTargetPriority() {
      return this.targetPriority;
   }

   @NotNull
   public final List<AABB> getIdleBoxes() {
      return this.idleBoxes;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getBounds() {
      return this.bounds;
   }

   @NotNull
   public final lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1,
      @NotNull List var2,
      @NotNull List var3,
      @NotNull List var4,
      @NotNull List var5,
      @NotNull Vec3 var6,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8,
      char var9,
      @NotNull List var10,
      @NotNull List var11,
      @NotNull List var12,
      int var13,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14
   ) {
      long var15 = ((long)var1 << 32 | (long)var9 << 48 >>> 32 | (long)var13 << 48 >>> 48)
         ^ lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(5237, 8225522905199342633L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(24632, 4571827032538022013L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(27233, 1946165733660396083L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(6048, 6314026878117246955L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(29282, 8053317888580096568L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(30651, 8618302935304280034L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(2967, 1383688420130941915L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(30342, 3316809680096630469L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var11, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(23306, 8415186624368556871L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var12, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(5817, 2723679076187666163L ^ var15)
      );
      Intrinsics.checkNotNullParameter(
         var14, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(27980, 5914087127503965445L ^ var15)
      );
      return new lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll(
         var2, var3, var4, var5, var6, var7, var8, var10, var11, var12, var14
      );
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 99019633988349L;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = this.bounds;
      List var4 = this.idleBoxes;
      List var5 = this.targetPriority;
      List var6 = this.route;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.location;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = this.warpLocation;
      Vec3 var9 = this.hotZone;
      List var10 = this.ignoreBoxes;
      List var11 = this.targetBoxes;
      List var12 = this.targetNames;
      List var13 = this.targetClasses;
      return "CombatArea(targetClasses="
         + var13
         + ", targetNames="
         + var12
         + ", targetBoxes="
         + var11
         + ", ignoreBoxes="
         + var10
         + ", hotZone="
         + var9
         + ", warpLocation="
         + var8
         + ", location="
         + var7
         + ", route="
         + var6
         + ", targetPriority="
         + var5
         + ", idleBoxes="
         + var4
         + ", bounds="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.targetClasses.hashCode();
      var1 = var1 * 31 + this.targetNames.hashCode();
      var1 = var1 * 31 + this.targetBoxes.hashCode();
      var1 = var1 * 31 + this.ignoreBoxes.hashCode();
      var1 = var1 * 31 + this.hotZone.hashCode();
      var1 = var1 * 31 + this.warpLocation.hashCode();
      var1 = var1 * 31 + this.location.hashCode();
      var1 = var1 * 31 + this.route.hashCode();
      var1 = var1 * 31 + this.targetPriority.hashCode();
      var1 = var1 * 31 + this.idleBoxes.hashCode();
      return var1 * 31 + this.bounds.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
   }

   public static String IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   static {
      long var9 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 22701207379025L;
      String var11 = "VUz4Lc";
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[33];
      int var5 = 0;
      String var4 = "ñT .\u00128uSk\u008b\u0098Ìö áR\u0010{.\u008cÜn\u0017B\u0000â\u008b\u0005½øèd\u009d íbº\u001f\u0095ØÜú\u0094*Ã&Bh*\u001f[Úñ¬)Ô\"Æ\u0089\u0081hôÌ\u008ajo\u0018uãk;©@\u009cå\u001aÌn)»ÍGöA\u0015®\b\b¾õª\u0018´\u0082ìì9\u0010\u008eÛ¯zZ\u0005®\u0083ÿiÄ\u0093Q±\u0093\"?g\u0010Ve7ÕÄ\u001c\u0090Ï1,*\u0001ç\u0000r9\u0018\u0089\f\u009f\u0094Á\u0099pf\u0092\u0011ò\u0087\u008aÿ4\u0010:Ä£Ên\u009b\u0086*\u0018³ÝçÍZÒ\u001dMô¦-\u0000?\b\u009e5Ïñ\u009e\u0019\u0098\u008b¨á\u0018O\u0004\u001e\u0086ùá\u0080Îb°Ùî¼çS²¸¿V·z\u0006òf [Fl\u0001\b\u0086\u0083]ðøÍá\u0016W)jÜuA\u0003¤Ð\u009d\n\u008e\u0006\u001a]ê£k\u008e\u0010Ï¥Ö\u001aQ² \u0092¦\u0081Ë\u008e\u0000\rók\u0018ó»\u0006h8QjQØOåÛe¸\u009e°\u0088ÇâÙ¼%éO\u0010ÍÐªÝ#\\\u009eêwZï\u0011ÒÙ\u009e`\u0018\u0012jÁ\u000b²ÊîñûB¤ÏÍo\u008d¼Ê¤^%~A¨y ÌWÆ\u0013ü'\u0096* \u0007Ú´\u001fµ\u000f\u0005\u0006\u0082`{$¶í\u000f\u0099Ä\u0000\u009fDÁ(Ã î¡-ò?\u0093Ì\u0004Ó\u0097\u008fÄÙ\u000b?ËM\u0012÷\u0018ù£S=§í\r\u001bÒ\u0010¹ß \u0091\u000eÞ\u001fkdýõÑöî{\n\u0093]àûá®ª²§\u0007Ö´.é\u0011¿Wï\u0002 Q\u001bô?åzÌÍTÙ§R¥98©ü.£v@uk\u009b\u0092V´\u0000\u0003\u008d[\n\u0018ÄEnæ\u0005C¶{\u00821\u0010óã¦+)\u001e\u0082Ñ\u0097g\u0083Ö*\u0018\t¨:bÄÍP|-\u0015h\u0087ü<\u0099\u001b\u0098²Ý¸¯O'\u001e Â_ÙÁ¿ºã\u000b\f\u0010/\u0093;!|èa·\u000b¬Ä\u009cåÿV\u0005§pæ\u0081\n\b s#\u009e'y\u00939h|\u0080Ô'à\u0016ô\u0000's\u008aå\u001f\u0019jk\u008aE'\u008fÄ±óu()XPÛ\u009bÇÈ\u00ad\u0095\u0012À\u0081t\u008d½sS\u009cd\u001dQÍ\t(\u0019ú\tÕ\u0087\rs'ec\u0085îèÖõ~\u0018ÕHØ\u0018\u0005+XÕXj¼å/Þq Ç{ëµòv\u0003n \u0006¤ º>6\u001cÇ\u008cr\u0097\u0093\u000fLMêýÜ3ú°å\u0088°Ä\u0018\u0006£LáDÀ\u0010%\u008cäfâHoR\u0097DÄ\u00810\u009fH\u001f\u0018°Ëú÷|£ÖµËÇ4t\u0092\u0007¾¡gø ?Ö>\u0082b8úU\u0001î\u001ek¬_\u001a\u001fo$P\u0011Ô\u0004S÷«§j¥\u001a³\u008f\u001flÓ[a¸¹\u0010Okå·ß6Xë¼\u0085,'\u000eÔYpH\u0010æCÚªx \u0019.L¡Õi0\u0082c»êÛ\u008dÛ\u0012î\u0012âR5U<FGB\u009cñùÿvI\u0002\u0018P ËhªpC\u0005¦«×\u0088A\u0096I#ÒG%¿ÓfV\b\u0018C\u00059OP-jBd %\u0084\u0099#]\u0095Â\u0018-Æ®¥áD";
      int var6 = "ñT .\u00128uSk\u008b\u0098Ìö áR\u0010{.\u008cÜn\u0017B\u0000â\u008b\u0005½øèd\u009d íbº\u001f\u0095ØÜú\u0094*Ã&Bh*\u001f[Úñ¬)Ô\"Æ\u0089\u0081hôÌ\u008ajo\u0018uãk;©@\u009cå\u001aÌn)»ÍGöA\u0015®\b\b¾õª\u0018´\u0082ìì9\u0010\u008eÛ¯zZ\u0005®\u0083ÿiÄ\u0093Q±\u0093\"?g\u0010Ve7ÕÄ\u001c\u0090Ï1,*\u0001ç\u0000r9\u0018\u0089\f\u009f\u0094Á\u0099pf\u0092\u0011ò\u0087\u008aÿ4\u0010:Ä£Ên\u009b\u0086*\u0018³ÝçÍZÒ\u001dMô¦-\u0000?\b\u009e5Ïñ\u009e\u0019\u0098\u008b¨á\u0018O\u0004\u001e\u0086ùá\u0080Îb°Ùî¼çS²¸¿V·z\u0006òf [Fl\u0001\b\u0086\u0083]ðøÍá\u0016W)jÜuA\u0003¤Ð\u009d\n\u008e\u0006\u001a]ê£k\u008e\u0010Ï¥Ö\u001aQ² \u0092¦\u0081Ë\u008e\u0000\rók\u0018ó»\u0006h8QjQØOåÛe¸\u009e°\u0088ÇâÙ¼%éO\u0010ÍÐªÝ#\\\u009eêwZï\u0011ÒÙ\u009e`\u0018\u0012jÁ\u000b²ÊîñûB¤ÏÍo\u008d¼Ê¤^%~A¨y ÌWÆ\u0013ü'\u0096* \u0007Ú´\u001fµ\u000f\u0005\u0006\u0082`{$¶í\u000f\u0099Ä\u0000\u009fDÁ(Ã î¡-ò?\u0093Ì\u0004Ó\u0097\u008fÄÙ\u000b?ËM\u0012÷\u0018ù£S=§í\r\u001bÒ\u0010¹ß \u0091\u000eÞ\u001fkdýõÑöî{\n\u0093]àûá®ª²§\u0007Ö´.é\u0011¿Wï\u0002 Q\u001bô?åzÌÍTÙ§R¥98©ü.£v@uk\u009b\u0092V´\u0000\u0003\u008d[\n\u0018ÄEnæ\u0005C¶{\u00821\u0010óã¦+)\u001e\u0082Ñ\u0097g\u0083Ö*\u0018\t¨:bÄÍP|-\u0015h\u0087ü<\u0099\u001b\u0098²Ý¸¯O'\u001e Â_ÙÁ¿ºã\u000b\f\u0010/\u0093;!|èa·\u000b¬Ä\u009cåÿV\u0005§pæ\u0081\n\b s#\u009e'y\u00939h|\u0080Ô'à\u0016ô\u0000's\u008aå\u001f\u0019jk\u008aE'\u008fÄ±óu()XPÛ\u009bÇÈ\u00ad\u0095\u0012À\u0081t\u008d½sS\u009cd\u001dQÍ\t(\u0019ú\tÕ\u0087\rs'ec\u0085îèÖõ~\u0018ÕHØ\u0018\u0005+XÕXj¼å/Þq Ç{ëµòv\u0003n \u0006¤ º>6\u001cÇ\u008cr\u0097\u0093\u000fLMêýÜ3ú°å\u0088°Ä\u0018\u0006£LáDÀ\u0010%\u008cäfâHoR\u0097DÄ\u00810\u009fH\u001f\u0018°Ëú÷|£ÖµËÇ4t\u0092\u0007¾¡gø ?Ö>\u0082b8úU\u0001î\u001ek¬_\u001a\u001fo$P\u0011Ô\u0004S÷«§j¥\u001a³\u008f\u001flÓ[a¸¹\u0010Okå·ß6Xë¼\u0085,'\u000eÔYpH\u0010æCÚªx \u0019.L¡Õi0\u0082c»êÛ\u008dÛ\u0012î\u0012âR5U<FGB\u009cñùÿvI\u0002\u0018P ËhªpC\u0005¦«×\u0088A\u0096I#ÒG%¿ÓfV\b\u0018C\u00059OP-jBd %\u0084\u0099#]\u0095Â\u0018-Æ®¥áD"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "QT,\u0004\u00ad÷ Ôe©æ\u0096°\u0080\u0086½Âe}üFã~òFx\u001bYuÜ\u00900 \f(að\u0081\u001aoí/¡\u0010\u001f;@BÃ\u001brët\u0097¡ã\u0011\n»ã4\f\u0088«ç";
            var6 = "QT,\u0004\u00ad÷ Ôe©æ\u0096°\u0080\u0086½Âe}üFã~òFx\u001bYuÜ\u00900 \f(að\u0081\u001aoí/¡\u0010\u001f;@BÃ\u001brët\u0097¡ã\u0011\n»ã4\f\u0088«ç"
               .length();
            var3 = ' ';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var7;
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new String[33];
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11714;
      if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll", var10
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
         byte[] var9 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5].getBytes("ISO-8859-1");
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5];
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
            "me/octo/client/modules/impl/macros/lIlllIIlIIIIIlIlllIllIIIIlIIllllIlIlIlIlllIIllIIllIIlIIIIlllIIIlllIIllllIlIlllIIlIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
