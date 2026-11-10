package me.octo.client.gui.clickgui.endgameGUI;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll
   extends IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   private final float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private final float IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private int lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static long lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = 42654887211126L;
   private static String[] IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private static String[] IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private static Map IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = new HashMap(13);
   private static long[] IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private static Long[] IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private static Map lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;

   public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
      @NotNull IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl resolutionArg,
      @NotNull ModuleCategory categoryArg,
      boolean argument3Arg
   ) {
      long var4 = lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI ^ 12347410997772L;
      Intrinsics.checkNotNullParameter(resolutionArg, "resolution");
      Intrinsics.checkNotNullParameter(categoryArg, "category");
      super(resolutionArg, categoryArg, argument3Arg);
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 10.0F;
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = 8.0F;
   }

   @Override
   protected float lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
      return this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull List var3) {
      long var4 = var1 ^ 7297462353833L;
      long var10001 = var1 ^ 14159241658265L;
      int var6 = (int)((var1 ^ 14159241658265L) >>> 32);
      int var7 = (int)((var1 ^ 14159241658265L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var1 ^ 87099012759575L;
      Intrinsics.checkNotNullParameter(
         var3, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"p">(18577, 2782593782118721878L ^ var1)
      );
      Collection var11 = var3;
      boolean var12 = false;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var6, var7, var8, var11.toArray(new me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[0])
      );
      Arrays.sort(
         this.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(),
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      this.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var9);
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(false);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, byte var3, @NotNull List var4, @NotNull Comparator var5
   ) {
      long var6 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
      long var10001 = var6 ^ 78646009396984L;
      int var8 = (int)((var6 ^ 78646009396984L) >>> 32);
      int var9 = (int)((var6 ^ 78646009396984L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var4, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"p">(8580, 5256323676313125158L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var5, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"p">(8063, 298417687602806742L ^ var6)
      );
      Collection var11 = var4;
      boolean var12 = false;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var8, var9, var10, var11.toArray(new me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll[0])
      );
      Arrays.sort(this.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(), var5);
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(false);
   }

   private final void llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII(char param1, short param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      List param1, HashMap param2, HashMap param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      boolean param1, long param2, float param4, float param5, HashMap param6, HashMap param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor param1, int param2, int param3, float param4, long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param0,
      long param1,
      me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll param3,
      me.octo.client.gui.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Function2 var0, Object var1, Object var2) {
      return ((Number)var0.invoke(var1, var2)).intValue();
   }

   static {
      long var11 = lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI ^ 85182411022029L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[22];
      int var18 = 0;
      String var17 = "Ó\u0097\u008674\u008e&äðç\u0082\u0094±7\u009fZPL$0¹18²¦úmO\u0014\u008f\u0010\u0080(ß«õ\u007fN´\u009e[fô+3äªÜ\u0015RÅI\u001c\u009a\u008c\u0081\u0092A\u008b\u0085\u001c]\u0095\u0094¢\u008fI\u001c\u008d\u008e.\u00ad# ö&ÂI\u0099eÃ\u009bÃ4&\u0012à\u0006à±ið\u0011\u0098ÀÜ|¨çVì»-\u0010Ð\u0006\u0018è\t¶h\u0014\u0011&Kä\u000fZ$±~\u008eÀ+ÿðR·ÛÚ\u008a(Ø¿@ûsoË%Ó§\u0094;dSoé\u000fK\u0097óá¿OçV´D\u0003\u0088:Orüitè\u001e\n\u0003ä\u0018´õâ*¥`¥Ø\u0098çÎ &\u0088\u0002\u0005\u000b°`!ð°)\u0089\u0018&NXsá\u008a\u000e;l\"\u008e¢\u0095÷â)°\u0099+ÿY^®H\u0018oCÿ\t¹K¤à¡\nï\b\u009aàg3\u009c\u0086Ê¦V\u0001ï7(ÉÌåd\u008bs\u008aKÀ0·!Û\u008dªÔ\u0012Kf\u000e\u0003u?A\u001d\u0005\u000e\u008b/\u000bÏçd(¶}-:\u0083P\u0010\u000fy\u0096t\u0097Þ\u0088\u001a\u0001£+ÁjÌ/* æì\u0092û'ÓÝ%'ìþå\u009b\\z=\u007fÎâc/\u0082\"\u008bÍ\u0012\u009d\u0095\u001d?\u0094ï\u0018à5ã1.ò\u0092\u0088»¬3\u0082ZK\u0016\fqµ\u0095×\u0093YØx\u0010?Fk\u000eüx\u008bX\u009c¤|Ù,C:6\u0098\u0082\u008f\u0089\u0010c\nèH<¿ô¥tú\u000b\u0001q\u0000}*)\u0090ÚÍØX%²\u0081f\"k¡âãG¨\u0090xEà2(vEEÆ$ý\u0089\u0084A=\u0000´l\u0014Ë&ÕÞ¾\u0088Û·\u009c¸~\u0018ÈO\u0085(\u001a°=»PË\u00adì¼|\t\u0094\u0019\u0012Q8wÏ°ÒÎ\u001a£i\r\u007f\u000bÅú\u0004ì]m2\u001f½\u009a\u0003jà]óí¢À\u0016$¥TÓ*\u00127¸'Ò\u0014(å¸Õµ<\u0086pL8xÏEm\u0088c\u008a·a\u0085\u0007ê Ë\u0098È\u0082«§\u0001\u001a¯\u0087`òÑ£äîE\u0083+\u0017\u0098ÂøªáÖ¼Í\u009e\u0004\u0085°\u0018·\u009aí\u0085ªX!\u0090f'_«E\u0091\u0093ï@¯íaT!{QP\u008fÄ\u0090S\u001bTê\u0014<ÍLÿÉk$í24S:\u008alQò\u000f\u0090¸vbuS\u001cü\u0016I\u0082§\u000er\r\u008a<\u0014h\u0010\u008fÐ[Ý¶#\u000f\u008fºX\u00ad&Ä>øò5`\u001d\\\u000eðSdÈ´ER«\\ËJ\u0007C¬\u0018¿sØ¸Ã_i»@\u0006ªcÈ¦\u0015]<ÇÎ\u0016\u0083R¤·(&ý\u0089I{\u007f\u0010Ç\u0084\u0094o\u0097¿_\u000b\u0096Í©ÓãMÌi1p\u0092¼d8\u008d\u0089V\u0010á\tµwºñÚ(ZÈu\u001f\u0006Ñä¶\u0006s\u0003`KñIå\u001a\u009fU\u0011ª%)T)\u008d¾AÒÐ¦GÝ(\u008eE6\u009c\u0004\u007f";
      int var19 = "Ó\u0097\u008674\u008e&äðç\u0082\u0094±7\u009fZPL$0¹18²¦úmO\u0014\u008f\u0010\u0080(ß«õ\u007fN´\u009e[fô+3äªÜ\u0015RÅI\u001c\u009a\u008c\u0081\u0092A\u008b\u0085\u001c]\u0095\u0094¢\u008fI\u001c\u008d\u008e.\u00ad# ö&ÂI\u0099eÃ\u009bÃ4&\u0012à\u0006à±ið\u0011\u0098ÀÜ|¨çVì»-\u0010Ð\u0006\u0018è\t¶h\u0014\u0011&Kä\u000fZ$±~\u008eÀ+ÿðR·ÛÚ\u008a(Ø¿@ûsoË%Ó§\u0094;dSoé\u000fK\u0097óá¿OçV´D\u0003\u0088:Orüitè\u001e\n\u0003ä\u0018´õâ*¥`¥Ø\u0098çÎ &\u0088\u0002\u0005\u000b°`!ð°)\u0089\u0018&NXsá\u008a\u000e;l\"\u008e¢\u0095÷â)°\u0099+ÿY^®H\u0018oCÿ\t¹K¤à¡\nï\b\u009aàg3\u009c\u0086Ê¦V\u0001ï7(ÉÌåd\u008bs\u008aKÀ0·!Û\u008dªÔ\u0012Kf\u000e\u0003u?A\u001d\u0005\u000e\u008b/\u000bÏçd(¶}-:\u0083P\u0010\u000fy\u0096t\u0097Þ\u0088\u001a\u0001£+ÁjÌ/* æì\u0092û'ÓÝ%'ìþå\u009b\\z=\u007fÎâc/\u0082\"\u008bÍ\u0012\u009d\u0095\u001d?\u0094ï\u0018à5ã1.ò\u0092\u0088»¬3\u0082ZK\u0016\fqµ\u0095×\u0093YØx\u0010?Fk\u000eüx\u008bX\u009c¤|Ù,C:6\u0098\u0082\u008f\u0089\u0010c\nèH<¿ô¥tú\u000b\u0001q\u0000}*)\u0090ÚÍØX%²\u0081f\"k¡âãG¨\u0090xEà2(vEEÆ$ý\u0089\u0084A=\u0000´l\u0014Ë&ÕÞ¾\u0088Û·\u009c¸~\u0018ÈO\u0085(\u001a°=»PË\u00adì¼|\t\u0094\u0019\u0012Q8wÏ°ÒÎ\u001a£i\r\u007f\u000bÅú\u0004ì]m2\u001f½\u009a\u0003jà]óí¢À\u0016$¥TÓ*\u00127¸'Ò\u0014(å¸Õµ<\u0086pL8xÏEm\u0088c\u008a·a\u0085\u0007ê Ë\u0098È\u0082«§\u0001\u001a¯\u0087`òÑ£äîE\u0083+\u0017\u0098ÂøªáÖ¼Í\u009e\u0004\u0085°\u0018·\u009aí\u0085ªX!\u0090f'_«E\u0091\u0093ï@¯íaT!{QP\u008fÄ\u0090S\u001bTê\u0014<ÍLÿÉk$í24S:\u008alQò\u000f\u0090¸vbuS\u001cü\u0016I\u0082§\u000er\r\u008a<\u0014h\u0010\u008fÐ[Ý¶#\u000f\u008fºX\u00ad&Ä>øò5`\u001d\\\u000eðSdÈ´ER«\\ËJ\u0007C¬\u0018¿sØ¸Ã_i»@\u0006ªcÈ¦\u0015]<ÇÎ\u0016\u0083R¤·(&ý\u0089I{\u007f\u0010Ç\u0084\u0094o\u0097¿_\u000b\u0096Í©ÓãMÌi1p\u0092¼d8\u008d\u0089V\u0010á\tµwºñÚ(ZÈu\u001f\u0006Ñä¶\u0006s\u0003`KñIå\u001a\u009fU\u0011ª%)T)\u008d¾AÒÐ¦GÝ(\u008eE6\u009c\u0004\u007f"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var35 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var35;
         if ((var15 += var16) >= var19) {
            var17 = "Þ¿ZEÛ¡ôÌ\u0006µ`-Ò\b¨\u009eQÅ¡v¡3¬\u0080Îª÷O\u00ad£ûý\u007f\u0093Ú®~ìz\t\nxÏc\u0096ij\u0013®ÌwE¯$È*|\fì\u0080\u009fº!ÒÙf©'\u0082Y\\\u0083{bÑ ·î\u000e\u0081\u0010g\u0004Í¿\\\u008dÞÚ\u0091K\u0013~«R\u0010\\";
            var19 = "Þ¿ZEÛ¡ôÌ\u0006µ`-Ò\b¨\u009eQÅ¡v¡3¬\u0080Îª÷O\u00ad£ûý\u007f\u0093Ú®~ìz\t\nxÏc\u0096ij\u0013®ÌwE¯$È*|\fì\u0080\u009fº!ÒÙf©'\u0082Y\\\u0083{bÑ ·î\u000e\u0081\u0010g\u0004Í¿\\\u008dÞÚ\u0091K\u0013~«R\u0010\\"
               .length();
            var16 = 'P';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var37 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var21).intern();
               int var31 = 0;
               var20[var18++] = var37;
               if ((var15 += var16) >= var19) {
                  IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var20;
                  IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = new String[22];
                  lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "Dæ\u0089\u009fð¡\u0081\u0086\u008aßòÓ\u008f«\u0003¡zb\u000b/Æ¥¢G";
                  int var5 = "Dæ\u0089\u009fð¡\u0081\u0086\u008aßòÓ\u008f«\u0003¡zb\u000b/Æ¥¢G".length();
                  byte var2 = 0;

                  do {
                     var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     var31 = var3++;
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
                     byte var41 = -1;
                     var6[var31] = var10004;
                  } while (var2 < var5);

                  IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = var6;
                  IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = new Long[3];
                  return;
               }

               var16 = var17.charAt(var15);
            }
         }

         var16 = var17.charAt(var15);
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12987;
      if (IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
         byte[] var9 = IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl[var5].getBytes("ISO-8859-1");
         IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
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
            "me/octo/client/gui/clickgui/endgameGUI/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2391;
      if (IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII[var3] == null) {
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
         long var5 = IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII[var3];
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
         Object[] var9 = (Object[])lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var14
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
         IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII[var3] = var15;
      }

      return IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII[var3];
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
            "me/octo/client/gui/clickgui/endgameGUI/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
