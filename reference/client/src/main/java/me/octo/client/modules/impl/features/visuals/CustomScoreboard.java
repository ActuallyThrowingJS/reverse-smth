package me.octo.client.modules.impl.features.visuals;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.render.ScoreboardEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.network.chat.numbers.NumberFormat;
import net.minecraft.world.scores.PlayerScoreEntry;
import net.minecraft.world.scores.Scoreboard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CustomScoreboard extends BooleanModule {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Regex llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static CustomScoreboard IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static Regex IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static Set<Character> IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static long IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 29191244404127L;
   private static String[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static Map lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new HashMap(13);

   private CustomScoreboard() {
      long var1 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ 75980959055632L;
      ModuleCategory var10003 = ModuleCategory.VISUALS;
      Setting[] var3 = new Setting[]{
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Custom Scoreboard", "Makes the Scoreboard prettier.", var10003, "Misc", true, var3);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Regex("\\d{2}/\\d{2}/\\d{2}");
   }

   @Nullable
   public final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var1
   ) {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Nullable
   public final String lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@Nullable String var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final float IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   private final void IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = null;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var3);
      this.IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII();
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = (var4 ^ 0L) >>> 8;
      int var8 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var6, (byte)var8);
      this.IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII();
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ScoreboardEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, PlayerScoreEntry var2) {
      var0 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ var0;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1624568164576420280L, var0
      );
      Intrinsics.checkNotNullParameter(
         var2, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(12531, 5529827465052548814L ^ var0)
      );
      String[] var3 = var10000;

      try {
         boolean var6 = var2.isHidden();
         if (var3 != null) {
            return var6;
         }

         if (!var6) {
            return true;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, 1632605847329351883L, var0
         );
      }

      return false;
   }

   private static final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, Scoreboard param2, NumberFormat param3, CustomScoreboard param4, PlayerScoreEntry param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl ^ 70953300911334L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "Ó'\u0086ÄÒ\u001e»\u0087íþ\u0081D\u0007\u007fóàbiùøÇ\u009aÞ\u0088îô<¬ìCA\u0082¨-o%o\u001c`\u0004·\u0090\u0087\u0080¿\u0093\u001a\u0099Òò\u007fò`\u001dõ\u0001]à\u0002#è¤\u009f\u009c9Å#\u001fùûÇ×\u0082CJº0ÝÅ&\u0086±ZxheÂ\u0014\u0017\u000f\u001cÀJ\u009cõo!¸óS\u009c¥\u001f&\u001fl!Ï¯v\u000eº\u0094F³\b¡ùãÅ×\u0099%W|\u0099Æ£¡,â\u009awäÍUPüO¸\"H»u7nåx\u0095¯°Ã\u0096\u008fWY)í©ß\u0001]\u009bô!Ä&\u000f9àLé\u0006°\u0091zù7Évì\u0001ö\u008dxàÓ\u0083RHgõÜ\u0007`\u000f¨\u007fî»ñ é\u0007r\u0003\u0012\u0019Â0þ±[ùQÉ$`Ñ\u0093Y&\u0000µåï~Î*r\u0014g\u000bø(²z6\u0012\u0011¢(Oi\u009b5\u0013:k\u000eÑR=\u0083@¶ÄL\u009dO|de2\u00811Ù\u0087vO\u001b\u0096\u001a3k\u00101?»³\u008d\u008fËäÛR\u0088Ãñ \u0002¡\u0018\u0096Ö#¹\u007fF\u0002\u0086®qÌwÉ\u001f;Í¶ö\u001b|¶-\u008aÁ\u0010m@©\u000e¥=Þ\u0092*æð\u0097Å\rÈ\u0081(2.±´!|~AÓõ\u0080\u0092_â\u008aÙ¯N\u0005ÃyÚ?VvÚ\u009eëìÞõ\u001aÚ='ê\u0015HÄâ\u0010\bG3á\u0081¼B¢\u0086\u001a\u00950;\u000b¤K(¢A\u009fEEc\u0095#]\u0092eúqJ÷\u0015yîÙ\u007ffY3;Ý\u0018\u000eëï¢\u001eV.Ù(àg¾`¾8àÇ\u009aåt\u0094\u0018QÔ\u0081JÙ(\u009ebøý_/W\u0088³\u0004\u0015°I¢\u0011\u0006é{ó·¼jÉXÁÉ¡Ü^\u0087EÓØBkÊ¶x'y\u0093Î\u007f Ò«\u0098¦RM;@Í«!è2Çx\u001ep¡ì\fÁ¶ðí®Z¼û1\u009c\u0017\u0016\u0018£ï\u000fâ»Ñb´ÿT\u0018~ÐU´æºÜ,KqÓþµ(ó\u0012ÿ®\u00ad\u009fGàðÚ\u008eìÖ2á0Þ2ó\u009coj\nMå!bÒ\u0093\u000e\u0084\u0092Ì³Dy\u009e\u001eÌû";
      int var6 = "Ó'\u0086ÄÒ\u001e»\u0087íþ\u0081D\u0007\u007fóàbiùøÇ\u009aÞ\u0088îô<¬ìCA\u0082¨-o%o\u001c`\u0004·\u0090\u0087\u0080¿\u0093\u001a\u0099Òò\u007fò`\u001dõ\u0001]à\u0002#è¤\u009f\u009c9Å#\u001fùûÇ×\u0082CJº0ÝÅ&\u0086±ZxheÂ\u0014\u0017\u000f\u001cÀJ\u009cõo!¸óS\u009c¥\u001f&\u001fl!Ï¯v\u000eº\u0094F³\b¡ùãÅ×\u0099%W|\u0099Æ£¡,â\u009awäÍUPüO¸\"H»u7nåx\u0095¯°Ã\u0096\u008fWY)í©ß\u0001]\u009bô!Ä&\u000f9àLé\u0006°\u0091zù7Évì\u0001ö\u008dxàÓ\u0083RHgõÜ\u0007`\u000f¨\u007fî»ñ é\u0007r\u0003\u0012\u0019Â0þ±[ùQÉ$`Ñ\u0093Y&\u0000µåï~Î*r\u0014g\u000bø(²z6\u0012\u0011¢(Oi\u009b5\u0013:k\u000eÑR=\u0083@¶ÄL\u009dO|de2\u00811Ù\u0087vO\u001b\u0096\u001a3k\u00101?»³\u008d\u008fËäÛR\u0088Ãñ \u0002¡\u0018\u0096Ö#¹\u007fF\u0002\u0086®qÌwÉ\u001f;Í¶ö\u001b|¶-\u008aÁ\u0010m@©\u000e¥=Þ\u0092*æð\u0097Å\rÈ\u0081(2.±´!|~AÓõ\u0080\u0092_â\u008aÙ¯N\u0005ÃyÚ?VvÚ\u009eëìÞõ\u001aÚ='ê\u0015HÄâ\u0010\bG3á\u0081¼B¢\u0086\u001a\u00950;\u000b¤K(¢A\u009fEEc\u0095#]\u0092eúqJ÷\u0015yîÙ\u007ffY3;Ý\u0018\u000eëï¢\u001eV.Ù(àg¾`¾8àÇ\u009aåt\u0094\u0018QÔ\u0081JÙ(\u009ebøý_/W\u0088³\u0004\u0015°I¢\u0011\u0006é{ó·¼jÉXÁÉ¡Ü^\u0087EÓØBkÊ¶x'y\u0093Î\u007f Ò«\u0098¦RM;@Í«!è2Çx\u001ep¡ì\fÁ¶ðí®Z¼û1\u009c\u0017\u0016\u0018£ï\u000fâ»Ñb´ÿT\u0018~ÐU´æºÜ,KqÓþµ(ó\u0012ÿ®\u00ad\u009fGàðÚ\u008eìÖ2á0Þ2ó\u009coj\nMå!bÒ\u0093\u000e\u0084\u0092Ì³Dy\u009e\u001eÌû"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var7;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new String[16];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new CustomScoreboard();
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new Regex("§[0-9a-fk-or]");
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = StringsKt.toSet(
                        "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()-_=+[]{};:'\",.<>?/|\\`~ §\n\r"
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0095P&Íî\u000f\n$í`¢\u001d\u001a*æ¨ê\rî4ãwt·J\u009aÔ°\u0095\u0018\u0013¹(\ríl\u0018Ý\u001f¢M¡£ìàØe°öV\u0001ÜN\fLm\u0091æÓ\u0080Z&dÔXÌÞÔGL*w¦";
                  var6 = "\u0095P&Íî\u000f\n$í`¢\u001d\u001a*æ¨ê\rî4ãwt·J\u009aÔ°\u0095\u0018\u0013¹(\ríl\u0018Ý\u001f¢M¡£ìàØe°öV\u0001ÜN\fLm\u0091æÓ\u0080Z&dÔXÌÞÔGL*w¦"
                     .length();
                  var3 = ' ';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19388;
      if (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/visuals/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10
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
         byte[] var9 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5].getBytes("ISO-8859-1");
         IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5];
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
            "me/octo/client/modules/impl/features/visuals/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
