package me.octo.client.gui.clickgui.modules.impl;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.Module;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;

public class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl
   extends Module
   implements me.octo.client.gui.clickgui.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI {
   @NotNull
   public static IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static Color[][] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 50961964078623L;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static Map IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashMap(13);
   private static long[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static Integer[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;

   private final List IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(long var1) {
      var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ var1;
      long var10001 = var1 ^ 23773590146180L;
      int var3 = (int)((var1 ^ 23773590146180L) >>> 32);
      int var4 = (int)((var1 ^ 23773590146180L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return me.octo.client.gui.clickgui.endgameGUI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3, (char)var4, (short)var5);
   }

   private final String[] llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(long var1) {
      var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ var1;
      long var3 = var1 ^ 121712228464418L;
      String[] var10000 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      Collection var5 = this.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(var3);
      boolean var6 = false;
      return (String[])ArraysKt.plus(var10000, var5.toArray(new String[0]));
   }

   public IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl(
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull ModuleCategory categoryArg,
      @NotNull String subcategoryArg,
      int argument5Arg,
      int argument6Arg,
      @NotNull Setting... settingsArg
   ) {
      long var8 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 106286713808297L;
      long var10 = var8 ^ 19809056390289L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      super(nameArg, descriptionArg, categoryArg, subcategoryArg, argument6Arg, Arrays.copyOf(settingsArg, settingsArg.length));
      String[] var12 = new String[]{
         "Dark",
         "Midnight Blue",
         "Clear",
         "Cotton Candy",
         "Forest Green",
         "Deep Space",
         "Ocean Blue",
         "Pastel Lavander",
         "Volcano Red",
         "Catppuccin Frappé",
         "Mint Breeze",
         "Catppuccin Mocha"
      };
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var12;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = argument5Arg;
      me.octo.client.gui.clickgui.endgameGUI.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c82c1cfaf414053b(argument5Arg, var10);
   }

   @NotNull
   @Override
   public String[] IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(int var1, char var2, char var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 14446890348162L;
      return this.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var6);
   }

   @Override
   public int IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(long var1) {
      long var3 = var1 ^ 123000043312356L;
      return this.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var3).length;
   }

   @Override
   public int IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @Override
   public void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public float[][] lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int argument1Arg, int argument2Arg, byte argument3Arg, @NotNull String sArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII() {
   }

   @NotNull
   @Override
   public me.octo.client.gui.clickgui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return new me.octo.client.gui.clickgui.settings.impl.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(this);
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1,
      int param2,
      short param3,
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Color IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.gui.clickgui.endgameGUI.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      String var1,
      Color var2
   ) {
      Integer var10000 = var0.getColors().get(var1);
      if (var10000 != null) {
         int var3 = var10000;
         return new Color(var3, true);
      } else {
         return var2;
      }
   }

   static {
      long var20 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 106844578557059L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[36];
      int var16 = 0;
      String var15 = "5j/Lh°[®s\u0015{@ÒÍXM ·c{¦Xæ¢L~þ\u009a\u009b\u001e¿\u000bu\u008cYC¼S\u0012\u0017õæ<Îcþ3Ùª\u0010McäMZÙ\bË{CÄÖQë²c\u00185\u008aâ==x;Cö\u0018k·\u0099ZjYi\u009c5eö£e,\u0010\u0096)b!åÞ\u008f3{8·\u0013ùÇ,\u001a\u0018d¨¬JR+}PÇìÄM[\u0003uX¦\u0085G¤\bfÒ7\u0010âÊÈ»ó:´iÀ¿\u0090AÃî\u00936\u0018ôT\u000f\u0092²ÒG\bèt`ZPiö\u0010öÝê´Úá´Ò \u008c4¢]\u0089¡\u001dz\u001b\u0007\u0080:\u009eXNK«\u009f\u0085Cô\u000bK³0´DRíe\u0082ÿ ÆN\u008cà+\u0096\u0090Ë^Y§TÞ\u009e\u008b*Ð\u000f \u0097r&aDb³\u0090¬7\u000e\u0084ó\u0010ü¯½P#å\u009aü]ìÈ~\u001dÍQÛ(T\u0080\u001a¯\u008f\u0092\u0017-E\u0083Tù3\u0012Z\u0096½`bÄÆx|ip\rè-\u0087³ÿÓ\u000eÄçpa®ÖÙ nið\u00851\u009cý\u0010ç\u0012\u0093è#\u008dz\u009b4\u0007h\u008d\u00943ã_O8c\u0013\u001a~X±\u0018\u0096\u0089zl_ª\u0018\u009dÌrþ¸~¢\u0000Cí4¡BjNYð\u0018Ó ¬8WS\fK\u009e\u007fí:Z\u008f\u0001òÀ0^\u008c[²ª\u001a \u001f¡~×\u009d\r|5\u000f6rÄ\u001f¨²\u009f)£©ý!@\u0092\u0011¹[\u0088Jõ\u0007\u0086µ \u009c\u008dNýBðð<U×`O0°Ó\u0086'× áï\u0000ò;\u0012\u001fP}ÓÜ\u0085\u0016\u0010ûø\n±\u008bN\u009a\u008f$Ï\u000fYX(I4\u0018Bv/ \u0083´Ë\u0095ofc´\u001a\u001e\u0099\u0085ÕyÈ2weW- T²\u0018üp\")ÕöÄ\u0016\u009cãK\u001eâ±\r/o\u0014\u009aÐ\u0090\u0097\u008d\f`©\u0081Åè\u0010f¿ÑÆÙ$ùC\u001f\u0002Dê\u0082ÛDú\u0018J\u008c½\u0091xÉìR¥n_o\u009c¤pä%¾2²ãïN\u001e Và5ò\u0002ì}?\u000eßoLÔ²yN\u008cD?ðó-6×ín¡NDz\u008f\u008e ×\u008aw\njm.\u0092\u000eEª*\u0085ASMÄÎ\u0002L\u0019©~Âc0G¸&\u0096k\u0093 ËFB\f<«¤}ØôªX¸Ãh}3¤Á$ÖÖ¬½WòâêG4;\u008b ¬4â&ÉNwßê[A\u0094îÃMü?6@ð\u007fË\bóëu(ª\u000e\u009b\u001c\u0006(VÒÔ\u009eÇ¨ÖL³\u0094\u0091é<ç\u008eÕìàÈ\u001c_eýDÉd\u0000·\u0004æáÎØG3í\u009fW@¶\u0010\u0085G¡\u0019îÛ\u0092ç9\u008b\u0086\u0083E)g±\u0010H\u0084þo\u0099\u0001½\u008d\u0091Ô®^ûGfh \u007fèh\u0097\u0017Ùô¡,AH¼Þ\u0083J_hbàO4pè2ª\u0081\\\u0092&§Iu Sá\u0010\u000e¥?D ø\u001c\u0089ØW:\u008e\u007fÒ<\u008e\u0086Î\u0094{X/\u0091C\r\u0098[âå(\u009fÎe\u009d\u0002DVÄ\u0015§ê\u0098v2Ìm5\u0094Id>\u0090¼0\rÐ\u0012G7\u0082\\NvÝ\u0082W±\u0003R\u008d ;Ët\u000b]UÐÁ²ñS\u0080y\u0015?àé\u0087?µï\u008dXÖ\u008dß_`\u0017Õdj(\u0084+çÜ©\r\nOí0\u0081=Ë²\u0097Zd¹°\u0013\u001b\u0019\u0000þr¤\\\u00054aHâ\u00ad4îe\u0084G×C";
      int var17 = "5j/Lh°[®s\u0015{@ÒÍXM ·c{¦Xæ¢L~þ\u009a\u009b\u001e¿\u000bu\u008cYC¼S\u0012\u0017õæ<Îcþ3Ùª\u0010McäMZÙ\bË{CÄÖQë²c\u00185\u008aâ==x;Cö\u0018k·\u0099ZjYi\u009c5eö£e,\u0010\u0096)b!åÞ\u008f3{8·\u0013ùÇ,\u001a\u0018d¨¬JR+}PÇìÄM[\u0003uX¦\u0085G¤\bfÒ7\u0010âÊÈ»ó:´iÀ¿\u0090AÃî\u00936\u0018ôT\u000f\u0092²ÒG\bèt`ZPiö\u0010öÝê´Úá´Ò \u008c4¢]\u0089¡\u001dz\u001b\u0007\u0080:\u009eXNK«\u009f\u0085Cô\u000bK³0´DRíe\u0082ÿ ÆN\u008cà+\u0096\u0090Ë^Y§TÞ\u009e\u008b*Ð\u000f \u0097r&aDb³\u0090¬7\u000e\u0084ó\u0010ü¯½P#å\u009aü]ìÈ~\u001dÍQÛ(T\u0080\u001a¯\u008f\u0092\u0017-E\u0083Tù3\u0012Z\u0096½`bÄÆx|ip\rè-\u0087³ÿÓ\u000eÄçpa®ÖÙ nið\u00851\u009cý\u0010ç\u0012\u0093è#\u008dz\u009b4\u0007h\u008d\u00943ã_O8c\u0013\u001a~X±\u0018\u0096\u0089zl_ª\u0018\u009dÌrþ¸~¢\u0000Cí4¡BjNYð\u0018Ó ¬8WS\fK\u009e\u007fí:Z\u008f\u0001òÀ0^\u008c[²ª\u001a \u001f¡~×\u009d\r|5\u000f6rÄ\u001f¨²\u009f)£©ý!@\u0092\u0011¹[\u0088Jõ\u0007\u0086µ \u009c\u008dNýBðð<U×`O0°Ó\u0086'× áï\u0000ò;\u0012\u001fP}ÓÜ\u0085\u0016\u0010ûø\n±\u008bN\u009a\u008f$Ï\u000fYX(I4\u0018Bv/ \u0083´Ë\u0095ofc´\u001a\u001e\u0099\u0085ÕyÈ2weW- T²\u0018üp\")ÕöÄ\u0016\u009cãK\u001eâ±\r/o\u0014\u009aÐ\u0090\u0097\u008d\f`©\u0081Åè\u0010f¿ÑÆÙ$ùC\u001f\u0002Dê\u0082ÛDú\u0018J\u008c½\u0091xÉìR¥n_o\u009c¤pä%¾2²ãïN\u001e Và5ò\u0002ì}?\u000eßoLÔ²yN\u008cD?ðó-6×ín¡NDz\u008f\u008e ×\u008aw\njm.\u0092\u000eEª*\u0085ASMÄÎ\u0002L\u0019©~Âc0G¸&\u0096k\u0093 ËFB\f<«¤}ØôªX¸Ãh}3¤Á$ÖÖ¬½WòâêG4;\u008b ¬4â&ÉNwßê[A\u0094îÃMü?6@ð\u007fË\bóëu(ª\u000e\u009b\u001c\u0006(VÒÔ\u009eÇ¨ÖL³\u0094\u0091é<ç\u008eÕìàÈ\u001c_eýDÉd\u0000·\u0004æáÎØG3í\u009fW@¶\u0010\u0085G¡\u0019îÛ\u0092ç9\u008b\u0086\u0083E)g±\u0010H\u0084þo\u0099\u0001½\u008d\u0091Ô®^ûGfh \u007fèh\u0097\u0017Ùô¡,AH¼Þ\u0083J_hbàO4pè2ª\u0081\\\u0092&§Iu Sá\u0010\u000e¥?D ø\u001c\u0089ØW:\u008e\u007fÒ<\u008e\u0086Î\u0094{X/\u0091C\r\u0098[âå(\u009fÎe\u009d\u0002DVÄ\u0015§ê\u0098v2Ìm5\u0094Id>\u0090¼0\rÐ\u0012G7\u0082\\NvÝ\u0082W±\u0003R\u008d ;Ët\u000b]UÐÁ²ñS\u0080y\u0015?àé\u0087?µï\u008dXÖ\u008dß_`\u0017Õdj(\u0084+çÜ©\r\nOí0\u0081=Ë²\u0097Zd¹°\u0013\u001b\u0019\u0000þr¤\\\u00054aHâ\u00ad4îe\u0084G×C"
         .length();
      char var14 = '\u0010';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var56 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var19).intern();
         byte var10001 = -1;
         var18[var16++] = var56;
         if ((var13 += var14) >= var17) {
            var15 = "¾\u0013g7üp¿º\u0083åÊy$æ8©\u0018\u00adõS¿\u009cÚ\u0004\u0088Y§\u0085Ïut¼ûuÂ*\u0090J\u0088tu";
            var17 = "¾\u0013g7üp¿º\u0083åÊy$æ8©\u0018\u00adõS¿\u009cÚ\u0004\u0088Y§\u0085Ïut¼ûuÂ*\u0090J\u0088tu".length();
            var14 = '\u0010';
            var13 = -1;

            while (true) {
               var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
               String var58 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var19).intern();
               int var50 = 0;
               var18[var16++] = var58;
               if ((var13 += var14) >= var17) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var18;
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new String[36];
                  IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[30];
                  int var3 = 0;
                  String var4 = "¬j\u0084|Ê\u0004¹\u0093\u009b\u0080F\u009b4)³á*Ð\u0081\bcð\u001bU½÷ç\u0012 5G\u0016\u0085ÿËª±\u007f\u0095\u000bìÕ\u0013Íõ\u0011/9ðpñ\u001b|\u0014~ÌYöý´\u0095ìÚ §0\u0089º9¡\\\u0097\u00adr¡N\u0082×UìêY<\u000e\u0013<\u0096ùê`?\u000fï«ÕQì\u0019\u0004h1öÞ$Ö\u001bÌ\u0094\u0001!Ìl4ÔS\u000bäâ?EX\u0015\u0007\u0088ixì\u0005uYî\u0084+\u008aÏä¿\\ý ÿ\u008fVC§\u0090¡ñ#mäÓ¦+¯\b\u009f\u009b[a\b\u0089\u0095\bUÛÙ/\u0091\u009fu\n\u0083,g<üÆæüµo¾\u0011;3Y\u0019ôôH\u009e\u0013\bõé\u0014Î+|ëè_mvÆ¬È\u0091K?\u0086òî\u009d\u007fH0\u0013ÄÁ\u00008B";
                  int var5 = "¬j\u0084|Ê\u0004¹\u0093\u009b\u0080F\u009b4)³á*Ð\u0081\bcð\u001bU½÷ç\u0012 5G\u0016\u0085ÿËª±\u007f\u0095\u000bìÕ\u0013Íõ\u0011/9ðpñ\u001b|\u0014~ÌYöý´\u0095ìÚ §0\u0089º9¡\\\u0097\u00adr¡N\u0082×UìêY<\u000e\u0013<\u0096ùê`?\u000fï«ÕQì\u0019\u0004h1öÞ$Ö\u001bÌ\u0094\u0001!Ìl4ÔS\u000bäâ?EX\u0015\u0007\u0088ixì\u0005uYî\u0084+\u008aÏä¿\\ý ÿ\u008fVC§\u0090¡ñ#mäÓ¦+¯\b\u009f\u009b[a\b\u0089\u0095\bUÛÙ/\u0091\u009fu\n\u0083,g<üÆæüµo¾\u0011;3Y\u0019ôôH\u009e\u0013\bõé\u0014Î+|ëè_mvÆ¬È\u0091K?\u0086òî\u009d\u007fH0\u0013ÄÁ\u00008B"
                     .length();
                  byte var2 = 0;

                  do {
                     var50 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var50, var2).getBytes("ISO-8859-1");
                     var50 = var3++;
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
                     byte var62 = -1;
                     var6[var50] = var10004;
                  } while (var2 < var5);

                  var4 = "\nÓôC$?K·»Nô-\u00adj!\u0096";
                  var5 = "\nÓôC$?K·»Nô-\u00adj!\u0096".length();
                  var2 = 0;

                  do {
                     int var54 = var2;
                     var2 += 8;
                     byte[] var27 = var4.substring(var54, var2).getBytes("ISO-8859-1");
                     var54 = var3++;
                     long var28 = (var27[0] & 255L) << 56
                        | (var27[1] & 255L) << 48
                        | (var27[2] & 255L) << 40
                        | (var27[3] & 255L) << 32
                        | (var27[4] & 255L) << 24
                        | (var27[5] & 255L) << 16
                        | (var27[6] & 255L) << 8
                        | var27[7] & 255L;
                     byte[] var29 = var0.doFinal(
                        new byte[]{
                           (byte)(var28 >>> 56),
                           (byte)(var28 >>> 48),
                           (byte)(var28 >>> 40),
                           (byte)(var28 >>> 32),
                           (byte)(var28 >>> 24),
                           (byte)(var28 >>> 16),
                           (byte)(var28 >>> 8),
                           (byte)var28
                        }
                     );
                     long var64 = (var29[0] & 255L) << 56
                        | (var29[1] & 255L) << 48
                        | (var29[2] & 255L) << 40
                        | (var29[3] & 255L) << 32
                        | (var29[4] & 255L) << 24
                        | (var29[5] & 255L) << 16
                        | (var29[6] & 255L) << 8
                        | var29[7] & 255L;
                     boolean var63 = false;
                     var6[var54] = var64;
                  } while (var2 < var5);

                  IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var6;
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new Integer[30];
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  Color[][] var22 = new Color[12][];
                  Color[] var23 = new Color[]{
                     new Color(220, 220, 220),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(14845, 4134194230276116574L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(30346, 1159216800552197921L ^ var20)),
                     new Color(50, 50, 50, 255)
                  };
                  var22[0] = var23;
                  var23 = new Color[]{
                     new Color(100, 130, 210),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(2736, 2933670119238460161L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(21856, 9213360694119873752L ^ var20)),
                     new Color(20, 25, 40, 255)
                  };
                  var22[1] = var23;
                  var23 = new Color[]{
                     new Color(138, 171, 219),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(25286, 6851118146171472736L ^ var20)),
                     new Color(45, 45, 45, 255),
                     new Color(50, 50, 50, 255)
                  };
                  var22[2] = var23;
                  var23 = new Color[]{
                     new Color(255, 160, 210),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(7927, 3290059918346286920L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(22924, 5874932547148591167L ^ var20)),
                     new Color(68, 40, 58, 255)
                  };
                  var22[3] = var23;
                  var23 = new Color[]{
                     new Color(100, 200, 125),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(5060, 1740799216938973796L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(10524, 6763486287488401578L ^ var20)),
                     new Color(25, 45, 32, 255)
                  };
                  var22[4] = var23;
                  var23 = new Color[]{
                     new Color(160, 120, 230),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(15487, 7346852999640536513L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(25661, 7693824012781030791L ^ var20)),
                     new Color(25, 20, 40, 255)
                  };
                  var22[5] = var23;
                  var23 = new Color[]{
                     new Color(150, 215, 255),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(22599, 5713359571567555059L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(9176, 4498943690363816552L ^ var20)),
                     new Color(40, 65, 85, 255)
                  };
                  var22[6] = var23;
                  var23 = new Color[]{
                     new Color(200, 165, 250),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(17977, 3547403884074741649L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(18281, 8378238066648755910L ^ var20)),
                     new Color(60, 48, 75, 255)
                  };
                  var22[7] = var23;
                  var23 = new Color[]{
                     new Color(255, 110, 85),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(26785, 9197222576228434205L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(19496, 5242804943093802378L ^ var20)),
                     new Color(45, 20, 18, 255)
                  };
                  var22[8] = var23;
                  var23 = new Color[]{
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(7235, 6392407178032543217L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(14892, 808478451852694427L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(27549, 5768142748452422204L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(28994, 3151659701604522235L ^ var20))
                  };
                  var22[9] = var23;
                  var23 = new Color[]{
                     new Color(150, 240, 225),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(31349, 613166113914262464L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(3512, 4923795667306898454L ^ var20)),
                     new Color(40, 68, 65, 255)
                  };
                  var22[10] = var23;
                  var23 = new Color[]{
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(16366, 2217039967700309578L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(30914, 5145717368104030567L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(3548, 5578161797718041717L ^ var20)),
                     new Color(IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"a">(7949, 4354932488457778864L ^ var20))
                  };
                  var22[11] = var23;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var22;
                  return;
               }

               var14 = var15.charAt(var13);
            }
         }

         var14 = var15.charAt(var13);
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5400;
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
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/modules/impl/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var10
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
         byte[] var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5].getBytes("ISO-8859-1");
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/gui/clickgui/modules/impl/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21294;
      if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var3] == null) {
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
         long var5 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var3];
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
         Object[] var9 = (Object[])IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/modules/impl/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var3] = var15;
      }

      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var3];
   }

   private static int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
            "me/octo/client/gui/clickgui/modules/impl/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
