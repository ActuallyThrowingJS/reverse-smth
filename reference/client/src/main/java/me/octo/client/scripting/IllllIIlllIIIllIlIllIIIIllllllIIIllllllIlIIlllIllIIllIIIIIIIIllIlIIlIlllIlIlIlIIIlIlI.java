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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   extends BooleanModule
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl,
   IlIIIlIlIIlIlllIlIIlIIllIllIlllllIIIlIllllIlIIIlIlIlllllIIIIIllIlllIlIlllllIlllIlIIll {
   @NotNull
   private final String scriptName;
   @NotNull
   private final ModuleCategory chosenCategory;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll script;
   @NotNull
   private final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII scriptHelper;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   @NotNull
   private final BooleanSetting showInGui;
   @NotNull
   private final Map<String, Setting> IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @Nullable
   private me.octo.client.modules.helpers.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   @NotNull
   private final IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 45039683261733L;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static Map llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new HashMap(13);

   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory chosenCategoryArg,
      @NotNull String subcategoryArg,
      @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll scriptArg,
      @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII scriptHelperArg,
      @NotNull Setting[] settingsArg,
      @NotNull Map<String, ? extends Setting> settingIdsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg,
      @NotNull BooleanSetting showInGuiArg
   ) {
      long var12 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 133055050425948L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(chosenCategoryArg, "chosenCategory");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(scriptArg, "script");
      Intrinsics.checkNotNullParameter(scriptHelperArg, "scriptHelper");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      Intrinsics.checkNotNullParameter(settingIdsArg, "settingIds");
      Intrinsics.checkNotNullParameter(callbacksArg, "callbacks");
      Intrinsics.checkNotNullParameter(showInGuiArg, "showInGui");
      super(nameArg, descriptionArg, ModuleCategory.SCRIPTS, subcategoryArg, false, Arrays.copyOf(settingsArg, settingsArg.length));
      this.scriptName = scriptNameArg;
      this.chosenCategory = chosenCategoryArg;
      this.script = scriptArg;
      this.scriptHelper = scriptHelperArg;
      this.callbacks = callbacksArg;
      this.showInGui = showInGuiArg;
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new LinkedHashMap<>(settingIdsArg);
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll(
         this
      );
   }

   @NotNull
   @Override
   public String getScriptName() {
      return this.scriptName;
   }

   @NotNull
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII getScriptHelper() {
      return this.scriptHelper;
   }

   @NotNull
   @Override
   public lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII getCallbacks() {
      return this.callbacks;
   }

   @NotNull
   public final IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll() {
      return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   @NotNull
   public BooleanModule lllIllIIllIIIllllllIIIlIIlIlIlIIlllllIllllIIIllIllllllllIIlIIlIlIlIIIIIIlIIIlllllllIl() {
      return this;
   }

   @NotNull
   @Override
   public String getOwnerScriptName() {
      return this.getScriptName();
   }

   @Nullable
   public final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1, @NotNull String var3) {
      var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var1;
      long var4 = var1 ^ 26027238283389L;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"n">(6442, 3306481868574381703L ^ var1)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @Nullable Object var2, long var3
   ) {
      var3 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var3;
      long var5 = var3 ^ 88116564336569L;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"n">(1233, 4214472540748287871L ^ var3)
      );
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var5, this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var1), var2
         );
   }

   @NotNull
   public final List<String> llIlIlIIIlIIllIlllIIIllIlllllllIlIlIIllIlllllIIIllIIIIIIIIllIIIlIllIlllIIlIIlIIIllllI() {
      return CollectionsKt.toList(this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.keySet());
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull List param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull ModuleCategory param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 13108322305670L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[28];
      int var7 = 0;
      String var6 = "^\u000eé\u0015Q&ø\u0088\u0098\rgqA¸#Ä$zKl\u008c¸µ$\u0014µLB<\u0090èS \u0005\u008bCiºï\u0002¸ÚV\u000brô#cxØ¦yÿP\u0080g\u001e\u001aÊ3ª{,Ï\u00910èRá6RÈªÔàCL¹èn°6\u0084ÆS8h\u0000\u0099>üz\u009aÿ<´]ÿ\u009dý'H\u0086\u0088}nÀ:d\u00ad\u0006Uª\u0000\u0010v/Ë\u0090\u0013a1YòR$±+(Ù³\u0010&£$8=\u0011\"4\u0081\u008aZ0ú\u000f+¦ oÞÆó%Ñ\u0014\u0093Ñù\u001eª>3;#/Y\u001b\u0086\u0090¾©ÕÎ«ÎQ\u0081¸c¯ rh\u000fà\b\u0019yÆçú?;:ÉÆe\u008eh\u0088£Ø\rÍd\u0097f\u0084\u0000+fLæ £\u0099Ù¨5q\u001a1ìT7\u0017\u009cÏ/l¤\u008f\u0010:}ë¨5\u0005x&\u001bn©X\u001b\u0018×=nh\u0019W\u0019_ú\u0097ÃÐ@ãD\u0087á\u0001Cw[è´9\u0018\fr\u0095\u0088AÚ \nûoÓ×uëWgõ*\u009b£úzÆ¦ \u0095çµÅ·-«\u0087|UË%\u007f3F\u001cÞS\u0013\u009bõ\u0019¤®B«Dw\f(ÒÀ\u0010\u009el\u008a\u009d\u008b\u0007¦$±\u0012Qä~Þ¼\u001b\u0018\u009f\u0012I²\u0005\u008f®v\u0092ÖB;þ\u008cÂÔúa \u0093o\u0011&\u008d\u0010[#\u000f\u000fÂ\u0003ØÌ©Ë \u0016ß3ê\u0002P+\n¨r\u0006\u0000\u009b\u001c¬\u0015ZæXíÝAPê2ñ³$ô%W\bL¼ñ\u0094vmë\u008a£\u0012O;;\u008dÝ\u0089õ\u0086\u009d.±\u0004ÔÝ\u009a\u0093à\u0089YB[PË\u0012Â\u001d*{D\u0081\u0097@\u0082À\u007f\u00ad¯«G\u0015\u009fÁfD \u009ffbGüà[\u0014\u0098?\u0093i\u008bNÒ\u0019\u00ad\u0091ñ¹\"\u008f@ü\u008féiÌÀ\u0011Ë\u008c(l\u0003\u0012Åë>\u008eñ+aÐ\u0098uLÔSU¢9°Ë\u009bY÷!Ë\u008cÜ\u0084\u007fq6g\\ðäìý\u0086\u008e\u0010}ÅÇ:¹\u0010bðÏ\u009a'Ó=U l\u0018Þf\u0090X2y¿A,ñ\u0087ZSÎ\u009d\rc\u0007|\u0001\u00997¿»(ï\u0014ÚoÛãBFÃ =\u0000É\"½Æ3±þq\u0090k\u008e¥\u00116\u009ffm/±ä¯à´ro4Ø\u0086 \u009c¥ñ\u001f5Çõ\u0092Ãû¯\u0090\u0086\u0002\u0011X%ô\u000b\u001fÎSáî³ç3Á¼×ÔÓ(õg<\u009fwºzêP8vbT°£\u0092\u0084p\u000bù\u0018\u0089m\u008d*\u0010µÑ5Ú\">tÌÆ¤n\u0015\u0004Û\u0018Á\u0082åDX\tB^¥MÉUê=0n Næµe\u009c\u0016}\u0018\u0090\u0013\u008fÄLw\u0085-4Y´×\u0084øAÆsÊ\u008c\u0091\u009f'¹s\u0010ñ¸~\u0011â\u00adJ\\\u001f\u000e\u0086ÀÍßÒü0À\u008a)\u001e1ü\u0093Ò!1må\u0017^õ\u0098îhZÙ4ù'ëÀ\u0083s¿\u0085Q\u0092\u009b(x\u007f\u0018\u0012=Þ_P\u009eu.ò9\u0007,";
      int var8 = "^\u000eé\u0015Q&ø\u0088\u0098\rgqA¸#Ä$zKl\u008c¸µ$\u0014µLB<\u0090èS \u0005\u008bCiºï\u0002¸ÚV\u000brô#cxØ¦yÿP\u0080g\u001e\u001aÊ3ª{,Ï\u00910èRá6RÈªÔàCL¹èn°6\u0084ÆS8h\u0000\u0099>üz\u009aÿ<´]ÿ\u009dý'H\u0086\u0088}nÀ:d\u00ad\u0006Uª\u0000\u0010v/Ë\u0090\u0013a1YòR$±+(Ù³\u0010&£$8=\u0011\"4\u0081\u008aZ0ú\u000f+¦ oÞÆó%Ñ\u0014\u0093Ñù\u001eª>3;#/Y\u001b\u0086\u0090¾©ÕÎ«ÎQ\u0081¸c¯ rh\u000fà\b\u0019yÆçú?;:ÉÆe\u008eh\u0088£Ø\rÍd\u0097f\u0084\u0000+fLæ £\u0099Ù¨5q\u001a1ìT7\u0017\u009cÏ/l¤\u008f\u0010:}ë¨5\u0005x&\u001bn©X\u001b\u0018×=nh\u0019W\u0019_ú\u0097ÃÐ@ãD\u0087á\u0001Cw[è´9\u0018\fr\u0095\u0088AÚ \nûoÓ×uëWgõ*\u009b£úzÆ¦ \u0095çµÅ·-«\u0087|UË%\u007f3F\u001cÞS\u0013\u009bõ\u0019¤®B«Dw\f(ÒÀ\u0010\u009el\u008a\u009d\u008b\u0007¦$±\u0012Qä~Þ¼\u001b\u0018\u009f\u0012I²\u0005\u008f®v\u0092ÖB;þ\u008cÂÔúa \u0093o\u0011&\u008d\u0010[#\u000f\u000fÂ\u0003ØÌ©Ë \u0016ß3ê\u0002P+\n¨r\u0006\u0000\u009b\u001c¬\u0015ZæXíÝAPê2ñ³$ô%W\bL¼ñ\u0094vmë\u008a£\u0012O;;\u008dÝ\u0089õ\u0086\u009d.±\u0004ÔÝ\u009a\u0093à\u0089YB[PË\u0012Â\u001d*{D\u0081\u0097@\u0082À\u007f\u00ad¯«G\u0015\u009fÁfD \u009ffbGüà[\u0014\u0098?\u0093i\u008bNÒ\u0019\u00ad\u0091ñ¹\"\u008f@ü\u008féiÌÀ\u0011Ë\u008c(l\u0003\u0012Åë>\u008eñ+aÐ\u0098uLÔSU¢9°Ë\u009bY÷!Ë\u008cÜ\u0084\u007fq6g\\ðäìý\u0086\u008e\u0010}ÅÇ:¹\u0010bðÏ\u009a'Ó=U l\u0018Þf\u0090X2y¿A,ñ\u0087ZSÎ\u009d\rc\u0007|\u0001\u00997¿»(ï\u0014ÚoÛãBFÃ =\u0000É\"½Æ3±þq\u0090k\u008e¥\u00116\u009ffm/±ä¯à´ro4Ø\u0086 \u009c¥ñ\u001f5Çõ\u0092Ãû¯\u0090\u0086\u0002\u0011X%ô\u000b\u001fÎSáî³ç3Á¼×ÔÓ(õg<\u009fwºzêP8vbT°£\u0092\u0084p\u000bù\u0018\u0089m\u008d*\u0010µÑ5Ú\">tÌÆ¤n\u0015\u0004Û\u0018Á\u0082åDX\tB^¥MÉUê=0n Næµe\u009c\u0016}\u0018\u0090\u0013\u008fÄLw\u0085-4Y´×\u0084øAÆsÊ\u008c\u0091\u009f'¹s\u0010ñ¸~\u0011â\u00adJ\\\u001f\u000e\u0086ÀÍßÒü0À\u008a)\u001e1ü\u0093Ò!1må\u0017^õ\u0098îhZÙ4ù'ëÀ\u0083s¿\u0085Q\u0092\u009b(x\u007f\u0018\u0012=Þ_P\u009eu.ò9\u0007,"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "²ÀOì\t\u0002¶\u00891\u0017£ÿ+¾\u009fú0@ø\u001a#g¾®\u001dúcGs\u0016Æ\u00050\r\t\u0090¸ë©\u009f\u0095\u0005á÷5§\u008b\u0015E\f\u0001õMa\rw\u0091\u008bw¢G£Ûè\u009eËaÏú¶04Oö:\u0085íª§²e";
            var8 = "²ÀOì\t\u0002¶\u00891\u0017£ÿ+¾\u009fú0@ø\u001a#g¾®\u001dúcGs\u0016Æ\u00050\r\t\u0090¸ë©\u009f\u0095\u0005á÷5§\u008b\u0015E\f\u0001õMa\rw\u0091\u008bw¢G£Ûè\u009eËaÏú¶04Oö:\u0085íª§²e"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var9;
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new String[28];
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Exception llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28903;
      if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5].getBytes("ISO-8859-1");
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5];
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
            "me/octo/client/scripting/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @Nullable
   public final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll$recovered$0384151ff3048736(
      long argument1Arg, @NotNull String idArg
   ) {
      argument1Arg = 41012369746540L;
      argument1Arg = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ argument1Arg;
      long var4 = argument1Arg ^ 26027238283389L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$29d650cf92429236(
            this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(idArg), var4
         );
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$76411416fd52d7b4(
      @NotNull String idArg, @Nullable Object argument2Arg, long argument3Arg
   ) {
      argument3Arg = 110543330422376L;
      argument3Arg = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ argument3Arg;
      long var5 = argument3Arg ^ 88116564336569L;
      Intrinsics.checkNotNullParameter(idArg, "id");
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$145dfa6bc12b1dfb(
            var5, this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(idArg), argument2Arg
         );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2060e382c99b14fe(
      long argument1Arg, @NotNull List handlesArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
