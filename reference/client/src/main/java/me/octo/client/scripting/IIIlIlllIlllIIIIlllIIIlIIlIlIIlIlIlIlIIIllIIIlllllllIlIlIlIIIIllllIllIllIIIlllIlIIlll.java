package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends BooleanModule
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl,
   IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll {
   @NotNull
   private final String scriptName;
   @NotNull
   private final ModuleCategory chosenCategory;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   @NotNull
   private final BooleanSetting showInGui;
   @NotNull
   private final Map<String, Setting> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 42599685309133L;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);

   public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory chosenCategoryArg,
      @NotNull String subcategoryArg,
      @NotNull Setting[] settingsArg,
      @NotNull Map<String, ? extends Setting> settingIdsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg,
      @NotNull BooleanSetting showInGuiArg
   ) {
      long var10 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 10010050744573L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(chosenCategoryArg, "chosenCategory");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      Intrinsics.checkNotNullParameter(settingIdsArg, "settingIds");
      Intrinsics.checkNotNullParameter(callbacksArg, "callbacks");
      Intrinsics.checkNotNullParameter(showInGuiArg, "showInGui");
      super(nameArg, descriptionArg, ModuleCategory.SCRIPTS, subcategoryArg, false, Arrays.copyOf(settingsArg, settingsArg.length));
      this.scriptName = scriptNameArg;
      this.chosenCategory = chosenCategoryArg;
      this.callbacks = callbacksArg;
      this.showInGui = showInGuiArg;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new LinkedHashMap<>(settingIdsArg);
   }

   @NotNull
   @Override
   public String getScriptName() {
      return this.scriptName;
   }

   @NotNull
   @Override
   public lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII getCallbacks() {
      return this.callbacks;
   }

   @NotNull
   public BooleanModule IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI() {
      return this;
   }

   @NotNull
   @Override
   public String getOwnerScriptName() {
      return this.getScriptName();
   }

   @Nullable
   public final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull String var1, long var2) {
      var2 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var2;
      long var4 = var2 ^ 92929668309108L;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(9412, 1376203213880199621L ^ var2)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var1), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @Nullable Object var2, long var3
   ) {
      var3 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var3;
      long var5 = var3 ^ 106652516376940L;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(26325, 7130976965747263757L ^ var3)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var5, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var1), var2
         );
   }

   @NotNull
   public final List<String> lIlIllIIIllllllIlIIlllIllIlIlllIlIlIlIllIIllllIIIlIIllIlllIlIlIIlIlllllIlIllIIlIIllIl() {
      return CollectionsKt.toList(this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.keySet());
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull ModuleCategory param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 5455095143580L;
      long var10001 = var1 ^ 76567738551169L;
      int var5 = (int)((var1 ^ 76567738551169L) >>> 32);
      int var6 = (int)((var1 ^ 76567738551169L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var8);

      try {
         this.getCallbacks()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.getCallbacks().IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(), var5, (char)var6, (short)var7
            );
      } catch (Exception var11) {
         PolinexLogger.error(
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(2242, 6522751383808811046L ^ var1)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(32346, 3099623187572643501L ^ var1)
               + var11.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var3,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(13777, 3763231663192218942L ^ var1) + var11.getMessage()
         );
      }
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = var4 ^ 12373975328259L;
      long var10001 = var4 ^ 81450963497246L;
      int var8 = (int)((var4 ^ 81450963497246L) >>> 32);
      int var9 = (int)((var4 ^ 81450963497246L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = (var4 ^ 0L) >>> 8;
      int var13 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var11, (byte)var13);

      try {
         this.getCallbacks()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.getCallbacks().llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(), var8, (char)var9, (short)var10
            );
      } catch (Exception var15) {
         PolinexLogger.error(
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(2853, 1881004992982899028L ^ var4)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(19888, 1648220771059277790L ^ var4)
               + var15.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var6,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(26494, 2140210280667034883L ^ var4) + var15.getMessage()
         );
      }
   }

   static {
      long var0 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 123736697565446L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = "F)¾j÷¼\u00ad-wÓ#ø§\u0011ìl^¸s\u0007ß\u000e}3Qa|\u0084ZïÉ\u0013-\u00adEe¢K\u009bÂ XRô\u0012û¡FîOÒtA\u0014ãÐÊ¯\u0012\u008e^ Ó£¹\u007fÒwFbàðd\u0010è+®\u009c,½\u0085ðÏeäm×9\u008d\u009b\u0010çs§\u0082ç\t\u0095\u001fªÈ\u0082Ýr·S@\u0010±Jï<Æ«\u0089<%·)®\u0000&\u000f¶ \u0088[xmT\u0018ë<[õNâz35\u0004`I\u008c·b^¼¹FË\u008b-\u0089YkÆ ÓÍ'\u0088À2R\u0090PJ¬\u0006Þ¨R-í§?b\u009a\u0095äýù)Â\u001eÒ^=á0\u0017]\u0010«£¨\u0014÷\u001eØg¤*vÅ*o\u008e¡â>ËÂ!:¹@F\u0082)\u001c\u0007\u0007\u0007s\u0093P©¿@Ñ\u0003c©æ=\u009eí\u0018 ªFç\u0010\u000e]\u0011=k\u0087\u008c\u009c\u007f\u001f\u00ad¹\\åü\u0010\u0081¡ä\u0018 BþQd\u0088ì\u0004\u0015¦$+ÈýØßvàØ'\u0099\u000eÁ\r0Iÿ\u009bxÇ_Û!\u0000æ\u0015wg*\u0082\u0005\u009bT$æäÄÛ\u0085\u0019Ö\u000b\u0092È\u0012±mò\u0083\u0015rPè\u001eaJ°×¼\u0013ÕHÕ\u0018G¬!\u00ad2ÞZ¾$\u008f\u0015Û\u000f*ö\u0090\u000ezG\u0002¹\u0010R{\u0018à\f0£õÊ²Påù\u008e8Ç\u008bS\u0012e~CãND\u0004\"(_Ác\u008aóû4\u001eÏ\u008dj¢\u001c\u0095©0PÆ`Ö)êW®üÆ\u0088\n°\u0083s\u0001é\u0091\u0080w\u0017°Â\u00ad\u0018w\u0010\u0095KQ\t\u008b\u008d¤\u0002_\u0013¹\u0082ÿ\u0089cå \u0004é\u0017þ \u0018Ü|Ùz\u0016qÇÑªr+>\u0012d\u0086g¦\u0096fBã\u001amÙ\u00101àlæ\u0018\u009c\t$ê\"\u0016a®\u009bíG 8+\u0088.æ\n÷\u008cw\u001bQ\b\n¸\u000b\u000f%\u0086?,'\u0095\u0010øÇ\u0007\u0006jzà\u001c\u0000\u0018\u001195\u0015ÅÅ\u001ck\u008a¤Ô°\u0098á\u0004\u001dÏ\u0011\u000b/û´\\ø(~\u00973v\u0086\u0099*xåiÍ \u000bM³U{ÂLÎ52ÏÍ\u0016\u0012t«êßy\u0016\u008dÓ')óê\u0005Þ";
      int var8 = "F)¾j÷¼\u00ad-wÓ#ø§\u0011ìl^¸s\u0007ß\u000e}3Qa|\u0084ZïÉ\u0013-\u00adEe¢K\u009bÂ XRô\u0012û¡FîOÒtA\u0014ãÐÊ¯\u0012\u008e^ Ó£¹\u007fÒwFbàðd\u0010è+®\u009c,½\u0085ðÏeäm×9\u008d\u009b\u0010çs§\u0082ç\t\u0095\u001fªÈ\u0082Ýr·S@\u0010±Jï<Æ«\u0089<%·)®\u0000&\u000f¶ \u0088[xmT\u0018ë<[õNâz35\u0004`I\u008c·b^¼¹FË\u008b-\u0089YkÆ ÓÍ'\u0088À2R\u0090PJ¬\u0006Þ¨R-í§?b\u009a\u0095äýù)Â\u001eÒ^=á0\u0017]\u0010«£¨\u0014÷\u001eØg¤*vÅ*o\u008e¡â>ËÂ!:¹@F\u0082)\u001c\u0007\u0007\u0007s\u0093P©¿@Ñ\u0003c©æ=\u009eí\u0018 ªFç\u0010\u000e]\u0011=k\u0087\u008c\u009c\u007f\u001f\u00ad¹\\åü\u0010\u0081¡ä\u0018 BþQd\u0088ì\u0004\u0015¦$+ÈýØßvàØ'\u0099\u000eÁ\r0Iÿ\u009bxÇ_Û!\u0000æ\u0015wg*\u0082\u0005\u009bT$æäÄÛ\u0085\u0019Ö\u000b\u0092È\u0012±mò\u0083\u0015rPè\u001eaJ°×¼\u0013ÕHÕ\u0018G¬!\u00ad2ÞZ¾$\u008f\u0015Û\u000f*ö\u0090\u000ezG\u0002¹\u0010R{\u0018à\f0£õÊ²Påù\u008e8Ç\u008bS\u0012e~CãND\u0004\"(_Ác\u008aóû4\u001eÏ\u008dj¢\u001c\u0095©0PÆ`Ö)êW®üÆ\u0088\n°\u0083s\u0001é\u0091\u0080w\u0017°Â\u00ad\u0018w\u0010\u0095KQ\t\u008b\u008d¤\u0002_\u0013¹\u0082ÿ\u0089cå \u0004é\u0017þ \u0018Ü|Ùz\u0016qÇÑªr+>\u0012d\u0086g¦\u0096fBã\u001amÙ\u00101àlæ\u0018\u009c\t$ê\"\u0016a®\u009bíG 8+\u0088.æ\n÷\u008cw\u001bQ\b\n¸\u000b\u000f%\u0086?,'\u0095\u0010øÇ\u0007\u0006jzà\u001c\u0000\u0018\u001195\u0015ÅÅ\u001ck\u008a¤Ô°\u0098á\u0004\u001dÏ\u0011\u000b/û´\\ø(~\u00973v\u0086\u0099*xåiÍ \u000bM³U{ÂLÎ52ÏÍ\u0016\u0012t«êßy\u0016\u008dÓ')óê\u0005Þ"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "§=,\u0092¢\u0093ÊE\u0099\u001f\u0089\u0084¦7^CF`´\u0012\"\u001bµ0\u007fÀ\u0007\u008dP¡}\u009f(<\u0007HðªZÛÑGOº\u001eófõcl²¯\u000beÂI°eF7\u0091!Ô¾\u0019\u001b)PÌèß6V";
            var8 = "§=,\u0092¢\u0093ÊE\u0099\u001f\u0089\u0084¦7^CF`´\u0012\"\u001bµ0\u007fÀ\u0007\u008dP¡}\u009f(<\u0007HðªZÛÑGOº\u001eófõcl²¯\u000beÂI°eF7\u0091!Ô¾\u0019\u001b)PÌèß6V"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var9;
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new String[22];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10819;
      if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5].getBytes("ISO-8859-1");
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5];
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
            "me/octo/client/scripting/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @Nullable
   public final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$f487fe718ae05ede(
      @NotNull String idArg, long argument2Arg
   ) {
      argument2Arg = 114537606956429L;
      argument2Arg = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ argument2Arg;
      long var4 = argument2Arg ^ 92929668309108L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$29d650cf92429236(
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(idArg), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4d853564e2a99c99(
      @NotNull String idArg, @Nullable Object argument2Arg, long argument3Arg
   ) {
      argument3Arg = 99067839465301L;
      argument3Arg = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ argument3Arg;
      long var5 = argument3Arg ^ 106652516376940L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$145dfa6bc12b1dfb(
            var5, this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(idArg), argument2Arg
         );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$adba832fb7e7aa5e(
      @NotNull List handlesArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
