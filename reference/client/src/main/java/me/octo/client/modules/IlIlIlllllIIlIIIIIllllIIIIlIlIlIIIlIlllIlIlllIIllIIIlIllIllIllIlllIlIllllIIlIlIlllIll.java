package me.octo.client.modules;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll {
   @NotNull
   public static IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<AABB> combatAreas;
   @NotNull
   private final List<AABB> ignoreAreas;
   @NotNull
   private final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll bounds;
   @NotNull
   private final List<Class<? extends Entity>> classes;
   @NotNull
   private final List<String> names;
   @NotNull
   private final List<String> ignoreOneTap;
   @NotNull
   private final List<String> ignoreCompletely;
   @NotNull
   private final List<String> prioritySwords;
   private final boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final List<String> tagNames;
   @NotNull
   private static IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 113318564777511L;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static Map IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashMap(13);

   public IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
      @NotNull List<? extends AABB> combatAreasArg,
      @NotNull List<? extends AABB> ignoreAreasArg,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll boundsArg,
      @NotNull List<? extends Class<? extends Entity>> classesArg,
      @NotNull List<String> namesArg,
      @NotNull List<String> ignoreOneTapArg,
      @NotNull List<String> ignoreCompletelyArg,
      @NotNull List<String> prioritySwordsArg,
      boolean argument9Arg,
      boolean argument10Arg,
      @NotNull List<String> tagNamesArg
   ) {
      long var12 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 5872133060093L;
      Intrinsics.checkNotNullParameter(combatAreasArg, "combatAreas");
      Intrinsics.checkNotNullParameter(ignoreAreasArg, "ignoreAreas");
      Intrinsics.checkNotNullParameter(boundsArg, "bounds");
      Intrinsics.checkNotNullParameter(classesArg, "classes");
      Intrinsics.checkNotNullParameter(namesArg, "names");
      Intrinsics.checkNotNullParameter(ignoreOneTapArg, "ignoreOneTap");
      Intrinsics.checkNotNullParameter(ignoreCompletelyArg, "ignoreCompletely");
      Intrinsics.checkNotNullParameter(prioritySwordsArg, "prioritySwords");
      Intrinsics.checkNotNullParameter(tagNamesArg, "tagNames");
      super();
      this.combatAreas = combatAreasArg;
      this.ignoreAreas = ignoreAreasArg;
      this.bounds = boundsArg;
      this.classes = classesArg;
      this.names = namesArg;
      this.ignoreOneTap = ignoreOneTapArg;
      this.ignoreCompletely = ignoreCompletelyArg;
      this.prioritySwords = prioritySwordsArg;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = argument9Arg;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = argument10Arg;
      this.tagNames = tagNamesArg;
   }

   @NotNull
   public final List<AABB> getCombatAreas() {
      return this.combatAreas;
   }

   @NotNull
   public final List<AABB> getIgnoreAreas() {
      return this.ignoreAreas;
   }

   @NotNull
   public final me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getBounds() {
      return this.bounds;
   }

   @NotNull
   public final List<Class<? extends Entity>> getClasses() {
      return this.classes;
   }

   @NotNull
   public final List<String> getNames() {
      return this.names;
   }

   @NotNull
   public final List<String> getIgnoreOneTap() {
      return this.ignoreOneTap;
   }

   @NotNull
   public final List<String> getIgnoreCompletely() {
      return this.ignoreCompletely;
   }

   @NotNull
   public final List<String> getPrioritySwords() {
      return this.prioritySwords;
   }

   public final boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final List<String> getTagNames() {
      return this.tagNames;
   }

   public final boolean IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull List var1,
      @NotNull List var2,
      @NotNull me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
      @NotNull List var4,
      @NotNull List var5,
      @NotNull List var6,
      @NotNull List var7,
      @NotNull List var8,
      boolean var9,
      long var10,
      boolean var12,
      @NotNull List var13
   ) {
      var10 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ var10;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(11113, 2798053466649103756L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(6693, 5730744654937308367L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(29871, 9194356952170713667L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(25092, 8657145415090226406L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(19035, 8043642193871629487L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(9052, 8992858368054986153L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(30783, 5666324452189626056L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(31785, 2010261438890007248L ^ var10)
      );
      Intrinsics.checkNotNullParameter(
         var13, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(457, 6146254089202378543L ^ var10)
      );
      return new IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
         var1, var2, var3, var4, var5, var6, var7, var8, var9, var12, var13
      );
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 111179626339370L;
      List var3 = this.tagNames;
      boolean var4 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      boolean var5 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      List var6 = this.prioritySwords;
      List var7 = this.ignoreCompletely;
      List var8 = this.ignoreOneTap;
      List var9 = this.names;
      List var10 = this.classes;
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = this.bounds;
      List var12 = this.ignoreAreas;
      List var13 = this.combatAreas;
      return "CombatConfig(combatAreas="
         + var13
         + ", ignoreAreas="
         + var12
         + ", bounds="
         + var11
         + ", classes="
         + var10
         + ", names="
         + var9
         + ", ignoreOneTap="
         + var8
         + ", ignoreCompletely="
         + var7
         + ", prioritySwords="
         + var6
         + ", allowSneaking="
         + var5
         + ", skipReachability="
         + var4
         + ", tagNames="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      long var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 23898323129549L;
      int var4 = this.combatAreas.hashCode();
      var4 = var4 * 31 + this.ignoreAreas.hashCode();
      var4 = var4 * 31 + this.bounds.hashCode();
      var4 = var4 * 31 + this.classes.hashCode();
      IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      var4 = var4 * 31 + this.names.hashCode();
      var4 = var4 * 31 + this.ignoreOneTap.hashCode();
      var4 = var4 * 31 + this.ignoreCompletely.hashCode();
      var4 = var4 * 31 + this.prioritySwords.hashCode();
      var4 = var4 * 31 + Boolean.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
      var4 = var4 * 31 + Boolean.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
      var4 = var4 * 31 + this.tagNames.hashCode();

      try {
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
      long var0 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 1923002386058L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[29];
      int var7 = 0;
      String var6 = "uµ\u0081$Á\u00136{Á´\u0095Ã$ ù\u008e\u0018\u0010?°öãÀþ\u009e\u0089d\u001c\u008e¡â\u009d¨Å\u001dãóúX\u00ad\t\u0018\u0010N\u008f\u0082z\u009fø\tPäFÈ\u0089å2ÃµG\u0014\u000f\u008a+wK(\u0094ÖFø\u00980#¹\u0004H\u0006\u008dº·ßw\u0088á¸\u0097V\u0098Í\u0011\u0019\u0017'gèx)DL\u001cm\u0016Çq r0KÏJ-\u008bqMá%¬\u0001E\u0001\u0018¨O\u001fÊ#}ä\rD%a9\\àÎTZÔ«õdÂÔQñb\u009c\u0096É\u0010\u008aÎ\u009bû \u001f~ðº}\u0089[}\u0098æ\u0012³ä\rgÙ[}Jó°å3çÐ\u008eÏ\u0000Å\u0014tl Â\u0085\u0005HÏ\fè\u0080IôNù\u0096S©yþ_ó\u0005\u0083&¼\u008bÍFCC:\u009e'2\u0018ïv\tØÎuØ9§Ó\u009b´\u001dê¢\u0017½\u0089ì\u0093\u0012y6² Ø-\u0095\u00adDñ£Ü\r<Ü|Ä$iB\u001fÅÄF\u009eÝjÜý\u001då¹Édø\u0084 \tË\u0015)\u0015¥U,¤D\u0018Ò´¸7`ó&¿É<U¶\u009ciÅÙª'\u001bÑi ìjâ¬~\u0082A\u0088\u0001ß\u0003ûy×\u0018Z\u0098Ä°\u0005o¤\u00adoæuyi\u0013Í/\u0089 £ÕN]þö\u0090VEs&Ï\tÁÏT¹³5\u0082\u001b)[|bê3ÊÝ\u001d`\u0086\u0010¡Óìe¡\u00adþv\u008d\u0085Íº\u001d¼4³(\u0082\\\u0013Í¼\u008eäû\u0085n\u0011\u0004^D\u0006ïþ\u00870÷o¢ý0\u007fæ\u0097\rÐL\u00019\u0096õ\u0000Þ\u0001RÁ8\u0010¥ü\u000f·\u0091&ÄLº\u0087fé\u007fL)6\u0010\u0004ä\u001bßn·ÆN^\u0096·\u0082\u0093[Z\u009d Ç\u008e\u008c\u008e\u0014.$HÑúÞÐëZó\u0007Ép\u009f¸¶~\u007f\u001eé\u0080a\u00848Nd`\u0018áqP\u0083\u0000Üd\u0092½x\u0001ÔàF:\u0098\u0001ínü:\u00058\u007f\u0018ù2q\u007f=ZòR\u001dc,åL)\u008fäx%3)\u0018R\\Þ(\u009ft®Vð\fú/\f@«\u009dÔsÑs{¹KÊe@¤¡4íÇó\u0002I2Q\n9\u001f\u0007.½ÔY\u0010û\u001bpd(ìK\\OuMi=PÑÚ\u0018©\u0099&F\u0012\u0002¶Ô9°Ý¦8\u0090Z :º~\u0096>\u009eª×(UÂ¥Ê\u0097-\u001f\u0080\u0000-ÑP(Í\u008bò\u000f³(|)\u0092(0Ä¯~\u0096ØT³\u009d³\u0098Fåàe\u000eí(\f{Ê\u009bhbç8~\u0091\u009d\u0019¾\u0018;p6{`\u0088\u008f]\t§Ë\u0016\u009eD7<\u0086LÇæ;òë\u000e¾D\u0010\u0016\u0084hiD!û-\u0000K´\"bôµ¶\u0018\t~÷\\«\u0087%\u009b\u0003@hF`t\u001bÑtïh\u001e;\u001dÑi \u0019$\u0097+\u00115Aäõ(ó1W±Ëõ\u0084\u009c\u007fÅÂhÆä\u0006}¼\u001a\u009c¸.\u000f";
      int var8 = "uµ\u0081$Á\u00136{Á´\u0095Ã$ ù\u008e\u0018\u0010?°öãÀþ\u009e\u0089d\u001c\u008e¡â\u009d¨Å\u001dãóúX\u00ad\t\u0018\u0010N\u008f\u0082z\u009fø\tPäFÈ\u0089å2ÃµG\u0014\u000f\u008a+wK(\u0094ÖFø\u00980#¹\u0004H\u0006\u008dº·ßw\u0088á¸\u0097V\u0098Í\u0011\u0019\u0017'gèx)DL\u001cm\u0016Çq r0KÏJ-\u008bqMá%¬\u0001E\u0001\u0018¨O\u001fÊ#}ä\rD%a9\\àÎTZÔ«õdÂÔQñb\u009c\u0096É\u0010\u008aÎ\u009bû \u001f~ðº}\u0089[}\u0098æ\u0012³ä\rgÙ[}Jó°å3çÐ\u008eÏ\u0000Å\u0014tl Â\u0085\u0005HÏ\fè\u0080IôNù\u0096S©yþ_ó\u0005\u0083&¼\u008bÍFCC:\u009e'2\u0018ïv\tØÎuØ9§Ó\u009b´\u001dê¢\u0017½\u0089ì\u0093\u0012y6² Ø-\u0095\u00adDñ£Ü\r<Ü|Ä$iB\u001fÅÄF\u009eÝjÜý\u001då¹Édø\u0084 \tË\u0015)\u0015¥U,¤D\u0018Ò´¸7`ó&¿É<U¶\u009ciÅÙª'\u001bÑi ìjâ¬~\u0082A\u0088\u0001ß\u0003ûy×\u0018Z\u0098Ä°\u0005o¤\u00adoæuyi\u0013Í/\u0089 £ÕN]þö\u0090VEs&Ï\tÁÏT¹³5\u0082\u001b)[|bê3ÊÝ\u001d`\u0086\u0010¡Óìe¡\u00adþv\u008d\u0085Íº\u001d¼4³(\u0082\\\u0013Í¼\u008eäû\u0085n\u0011\u0004^D\u0006ïþ\u00870÷o¢ý0\u007fæ\u0097\rÐL\u00019\u0096õ\u0000Þ\u0001RÁ8\u0010¥ü\u000f·\u0091&ÄLº\u0087fé\u007fL)6\u0010\u0004ä\u001bßn·ÆN^\u0096·\u0082\u0093[Z\u009d Ç\u008e\u008c\u008e\u0014.$HÑúÞÐëZó\u0007Ép\u009f¸¶~\u007f\u001eé\u0080a\u00848Nd`\u0018áqP\u0083\u0000Üd\u0092½x\u0001ÔàF:\u0098\u0001ínü:\u00058\u007f\u0018ù2q\u007f=ZòR\u001dc,åL)\u008fäx%3)\u0018R\\Þ(\u009ft®Vð\fú/\f@«\u009dÔsÑs{¹KÊe@¤¡4íÇó\u0002I2Q\n9\u001f\u0007.½ÔY\u0010û\u001bpd(ìK\\OuMi=PÑÚ\u0018©\u0099&F\u0012\u0002¶Ô9°Ý¦8\u0090Z :º~\u0096>\u009eª×(UÂ¥Ê\u0097-\u001f\u0080\u0000-ÑP(Í\u008bò\u000f³(|)\u0092(0Ä¯~\u0096ØT³\u009d³\u0098Fåàe\u000eí(\f{Ê\u009bhbç8~\u0091\u009d\u0019¾\u0018;p6{`\u0088\u008f]\t§Ë\u0016\u009eD7<\u0086LÇæ;òë\u000e¾D\u0010\u0016\u0084hiD!û-\u0000K´\"bôµ¶\u0018\t~÷\\«\u0087%\u009b\u0003@hF`t\u001bÑtïh\u001e;\u001dÑi \u0019$\u0097+\u00115Aäõ(ó1W±Ëõ\u0084\u009c\u007fÅÂhÆä\u0006}¼\u001a\u009c¸.\u000f"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "Í\"¥±\"5{¿F¼\u008a\u0011ò9u°\u0019Þ\u009c\u0096õ\u000eÜÂö }G}Ã'\u009eDàFÛçO[&\u0018qWùð\u009f)7ürø3¯¼²L=K\u0011S{²\rx`";
            var8 = "Í\"¥±\"5{¿F¼\u008a\u0011ò9u°\u0019Þ\u009c\u0096õ\u000eÜÂö }G}Ã'\u009eDàFÛçO[&\u0018qWùð\u009f)7ürø3¯¼²L=K\u0011S{²\rx`".length();
            var5 = '(';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9;
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new String[29];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
                     CollectionsKt.emptyList(),
                     CollectionsKt.emptyList(),
                     me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
                     CollectionsKt.emptyList(),
                     CollectionsKt.emptyList(),
                     CollectionsKt.emptyList(),
                     CollectionsKt.emptyList(),
                     CollectionsKt.emptyList(),
                     false,
                     false,
                     null,
                     1792,
                     null
                  );
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10262;
      if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5].getBytes("ISO-8859-1");
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5];
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
            "me/octo/client/modules/IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String[] var0) {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
      }

      public static String[] llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      static {
         long var0 = 44507609325210L ^ 35448630517922L;
         if (llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() != null) {
            String[] var2 = new String[5];
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2);
         }
      }
   }
}
