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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl {
   @NotNull
   public static IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> combat;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> farming;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> mining;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> fishing;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> foraging;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> dungeoneering;
   @NotNull
   private final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> hunting;
   @JvmField
   @NotNull
   private static Lazy<KSerializer<Object>>[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 5382769813499L;
   private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

   public IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl(
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> combatArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> farmingArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> miningArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> fishingArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> foragingArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> dungeoneeringArg,
      @NotNull List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> huntingArg
   ) {
      long var8 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 132210782937067L;
      Intrinsics.checkNotNullParameter(combatArg, "combat");
      Intrinsics.checkNotNullParameter(farmingArg, "farming");
      Intrinsics.checkNotNullParameter(miningArg, "mining");
      Intrinsics.checkNotNullParameter(fishingArg, "fishing");
      Intrinsics.checkNotNullParameter(foragingArg, "foraging");
      Intrinsics.checkNotNullParameter(dungeoneeringArg, "dungeoneering");
      Intrinsics.checkNotNullParameter(huntingArg, "hunting");
      super();
      this.combat = combatArg;
      this.farming = farmingArg;
      this.mining = miningArg;
      this.fishing = fishingArg;
      this.foraging = foragingArg;
      this.dungeoneering = dungeoneeringArg;
      this.hunting = huntingArg;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getCombat() {
      return this.combat;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getFarming() {
      return this.farming;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getMining() {
      return this.mining;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getFishing() {
      return this.fishing;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getForaging() {
      return this.foraging;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getDungeoneering() {
      return this.dungeoneering;
   }

   @NotNull
   public final List<llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI> getHunting() {
      return this.hunting;
   }

   @NotNull
   public final IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull List var3, @NotNull List var4, @NotNull List var5, @NotNull List var6, @NotNull List var7, @NotNull List var8, @NotNull List var9
   ) {
      var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(10566, 664836794557774822L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(3784, 8901275762735029344L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(13281, 3052892378117415246L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(90, 6304100131907736311L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(18198, 496083046679991730L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(12544, 786983311013880748L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(3709, 127970378887666900L ^ var1)
      );
      return new IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl(var3, var4, var5, var6, var7, var8, var9);
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 100411842282206L;
      List var3 = this.hunting;
      List var4 = this.dungeoneering;
      List var5 = this.foraging;
      List var6 = this.fishing;
      List var7 = this.mining;
      List var8 = this.farming;
      List var9 = this.combat;
      return "JsonCategories(combat="
         + var9
         + ", farming="
         + var8
         + ", mining="
         + var7
         + ", fishing="
         + var6
         + ", foraging="
         + var5
         + ", dungeoneering="
         + var4
         + ", hunting="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.combat.hashCode();
      var1 = var1 * 31 + this.farming.hashCode();
      var1 = var1 * 31 + this.mining.hashCode();
      var1 = var1 * 31 + this.fishing.hashCode();
      var1 = var1 * 31 + this.foraging.hashCode();
      var1 = var1 * 31 + this.dungeoneering.hashCode();
      return var1 * 31 + this.hunting.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl() {
      this(null, null, null, null, null, null, null, 127, null);
   }

   static {
      long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 90116899677549L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[21];
      int var7 = 0;
      String var6 = "OÛ\u00813\u001a\u00924c8\u0007$MnÙÊ¿\u008e\u008a\u00adF@·\u0098\u001e\u00101ô\u0091G´¼\u0082/\u0005(çú\u00848\u008c\u0087 y\"Î\u0093Ë³%ëmn\u009c\u009bxib\u008dT\u0015¶9G>kßU3\u008cÇxt°õ\u0010û\u001f1F\u0003\u0002ô¦8\u0080\u008e\u000b\u0087\n¸û\u0010\u0011\u001dÕ.½\u001dº\u0000²\u0017ÏØý\u0006÷\u0082\u0010IÒt\u0016ä*\u008cToÄ2i¡°HÁ(\u0011Ûº`p A\néMº\u0013ò¾\u0019S«\u0010ÈM\u0001Ü¿R\u0085\bÙ¨·íý\u0092Ù7>ä\u001bÂY»(Üñ ÛÁì\u0005d\u0017³\u0000g>\u0016\u008cfô!\u0095Ã>E·\u008e°\u0090#\bd,ád\u007fO\u008eP¼ °m Þ\u008a\u0084Æ/\u0092tÉ·\u009cA\fæåÃ\u0001O±ý§í\u0014#\u0096_\u0088Öa&ó\u007f\u0003\u0010ù,£\u009c+ÙA\u0006\u0088\u0013\u0082î\u0085\u0095»< \u00127õ³\u0089!ëõ\u0013t|bE&yìÿ\nc\u0003´rp\u000b\u0010\u0082Ìm\u008b8\u001d\u0094\u0010æ,§©ëùXa\u007f³Ì\u001a]\\ÝÃ\u0010Ô\u0016´³ÿ!û\u008b\u0011\u0083T\u007f\u0094\tåt 4\u0010Jz\u00ad\bÊ°_\u0094¸\u008a»YnÜõËº\u00844\u001bð\u009cÂ´9Z¤¼¢»\u0018i³\u0006(ì\u0002 @æÐ\bªlC\u0083Ù\u0018È!<\u001e½a\u0087 ÓR\u0016%/ìÌÐî£Ñ}Mî\u0018²øëñåü&;\u0084*¨\u0005S\nü\u0016\u0080\u00103\u0086¨=\u0004\u0004\u009f\\\u0016>\u001dI\u000fZ_\u000f\u0010Õ±V\u0081Vx}ä\u0007)\u0092u×\u0083èõ\u0010èd\u00ad\u008e\u0087Êkf\u009aÝ=\u0081ª¶Ú¼";
      int var8 = "OÛ\u00813\u001a\u00924c8\u0007$MnÙÊ¿\u008e\u008a\u00adF@·\u0098\u001e\u00101ô\u0091G´¼\u0082/\u0005(çú\u00848\u008c\u0087 y\"Î\u0093Ë³%ëmn\u009c\u009bxib\u008dT\u0015¶9G>kßU3\u008cÇxt°õ\u0010û\u001f1F\u0003\u0002ô¦8\u0080\u008e\u000b\u0087\n¸û\u0010\u0011\u001dÕ.½\u001dº\u0000²\u0017ÏØý\u0006÷\u0082\u0010IÒt\u0016ä*\u008cToÄ2i¡°HÁ(\u0011Ûº`p A\néMº\u0013ò¾\u0019S«\u0010ÈM\u0001Ü¿R\u0085\bÙ¨·íý\u0092Ù7>ä\u001bÂY»(Üñ ÛÁì\u0005d\u0017³\u0000g>\u0016\u008cfô!\u0095Ã>E·\u008e°\u0090#\bd,ád\u007fO\u008eP¼ °m Þ\u008a\u0084Æ/\u0092tÉ·\u009cA\fæåÃ\u0001O±ý§í\u0014#\u0096_\u0088Öa&ó\u007f\u0003\u0010ù,£\u009c+ÙA\u0006\u0088\u0013\u0082î\u0085\u0095»< \u00127õ³\u0089!ëõ\u0013t|bE&yìÿ\nc\u0003´rp\u000b\u0010\u0082Ìm\u008b8\u001d\u0094\u0010æ,§©ëùXa\u007f³Ì\u001a]\\ÝÃ\u0010Ô\u0016´³ÿ!û\u008b\u0011\u0083T\u007f\u0094\tåt 4\u0010Jz\u00ad\bÊ°_\u0094¸\u008a»YnÜõËº\u00844\u001bð\u009cÂ´9Z¤¼¢»\u0018i³\u0006(ì\u0002 @æÐ\bªlC\u0083Ù\u0018È!<\u001e½a\u0087 ÓR\u0016%/ìÌÐî£Ñ}Mî\u0018²øëñåü&;\u0084*¨\u0005S\nü\u0016\u0080\u00103\u0086¨=\u0004\u0004\u009f\\\u0016>\u001dI\u000fZ_\u000f\u0010Õ±V\u0081Vx}ä\u0007)\u0092u×\u0083èõ\u0010èd\u00ad\u008e\u0087Êkf\u009aÝ=\u0081ª¶Ú¼"
         .length();
      char var5 = 24;
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var13, var13 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var13 += var5) >= var8) {
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[21];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        null
                     );
                     Lazy[] var11 = new Lazy[]{
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        ),
                        LazyKt.lazy(
                           LazyThreadSafetyMode.PUBLICATION,
                           () -> (KSerializer)(
                              new ArrayListSerializer(
                                 (KSerializer)llIlIlIIIllIIIIIIlIIIllllIlllIIIlIlIlIlIlIlIIlIlllIIIIIlllllllIIIIIllIllllIllIIlllllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              )
                           )
                        )
                     };
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var11;
                     return;
                  }

                  var5 = var6.charAt(var13);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var13 += var5) < var8) {
                     var5 = var6.charAt(var13);
                     continue label27;
                  }

                  var6 = "\u0092\u0099I{\u008c_\u0093N±\u0090\u008a.úø\u0080ç\u001c\u0088\rÝä\u001f\u009a\u00adw\u009em\u001fÞèD2\u0018Üen\u001c\u0007y\u0089û\nðãDÂ\u008e\u0094Ø \u001d¥ÍÜ\u0014\u009a ";
                  var8 = "\u0092\u0099I{\u008c_\u0093N±\u0090\u008a.úø\u0080ç\u001c\u0088\rÝä\u001f\u009a\u00adw\u009em\u001fÞèD2\u0018Üen\u001c\u0007y\u0089û\nðãDÂ\u008e\u0094Ø \u001d¥ÍÜ\u0014\u009a "
                     .length();
                  var5 = ' ';
                  var13 = -1;
            }

            var14 = var6.substring(++var13, var13 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19561;
      if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl", var10
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
         byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
            "me/octo/client/modules/impl/macros/IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final KSerializer<IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return (KSerializer<IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl>)IIIlIIIIIlIIlIIIIlllIlIlllIllllIlIIlIlIIlIlllIIlIIlIllIIIllIllIIlIIIIIIllIIIlllIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }
   }
}
