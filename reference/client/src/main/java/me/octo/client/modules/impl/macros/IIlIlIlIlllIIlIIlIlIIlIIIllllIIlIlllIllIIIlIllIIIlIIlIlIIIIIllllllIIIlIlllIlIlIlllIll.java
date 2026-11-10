package me.octo.client.modules.impl.macros;

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
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.modules.impl.features.mining.MithrilEngine;
import org.jetbrains.annotations.NotNull;

public final class IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll {
   @NotNull
   public static IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static BooleanSetting IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BooleanSetting llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

   private IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll() {
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final BooleanSetting IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BooleanSetting IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final BooleanSetting IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   static {
      long var9 = 40798329637066L ^ 112623204922679L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[23];
      int var6 = 0;
      String var5 = "Y³\u0086&\u0086³\u0012\u0000Z´Þs?\u00adgÎ\u0018Ì¤ø\u0017_O\u001a\u008c\u0087õ¦\u008e\u0010í¡²¤Î\u0088y\u0002\u0017\u0087î\u0010àD¨n:¥\u001e\u0002ÇÝ÷M éÉP0u+\u0083Ã\u0085 +ÐT\u00adÎ*Íà\u0013\u007f\u0000FC \u0015ÛNô\u0004Í\u0083sÓP¡c×ýñ$\u009c³Ì\u0007\u001cUs- ¬Ð7 s´ÎÅVnµV\u0080ºrJ,+_$KÚ]ªæøöPøÌiZÉ\u001c!Ý\u0010±-X\u0094;\u0092?\u008f/C·K5¾\u0004A 5]\u0001ê²Vø7DW\u008dÓG\u001bu\u009f\tS\u0011=O0\u0011éûs®=û\u009e\u0080\u0090\u0010ÜÍ\u0096¦ÌH/k®©ù \u0085WCM@!ÈÖæ}\u001e(¼\u0097\u0002\u0016-\u000e\u009d\u0011[Ù5\nþP\u0091ißíå\u008f0MÜá¢\u0082þ ý\u0092Ìë\u0081Éµ79²J\u0010ZÆ\u0012WbÔ\u009bD¡Ù\n©%ó\u0092\u008c,(eë.\u009eõ7æÿï\u0082s\u0018#y>\u0004+\fhÔ`½?¿ë¦´\u009fg\u0093á\u001cdK\u001fë\u0086\u0005µ/@r½/\u0015\u008e¿øwrºs(.Pß\u001bÅ\u007fÁ$!`\u0006¶Ã\nG-s´\u0091\u0095À|ã\u007fEï\u0005·\u0002\u009cD\u0085Á\u0015NÉsO¯íO\u00807¾-×:#`WDù(eë.\u009eõ7æÿ\u009c\u009e]'8\u0080ùk§&\u0088¥,)F\u007ft[ò<\u009aDw?;c¼ä©%p\u0019\b\u008aQ\u0081Ì\u0086zä\u0092\u0010n\"\u0086\u0012\u0090\u007f\u00845\u008f\u009b\u0093\u0000\u0088\u0012\u008a  \u001cG¬\u0006õ\u009dÐ\fpù»¡#¡\u0091¸\u0000È*l¥,\u008b×<ÅÑfmÃ\u000e@H6\u0099ü\fÔ|éÖÞæä^ö|HÇû9å\u008e\u0010¾ýh\u0099).µîÚ³\u008a7±\u0090g~<úMnN\u00167)¾¢ï\u0091\u001bÊx\u0094\u001d¬¼¨Tà9\u0093ýòßL!ofºä\u008d»HÌÃ\\=ß\u00125\u00adø\u0092¿üÄT\u0011T\u000eø)úü3ã\u0087Û\u00928tØ\u0088[KîæNOD7\u0002ø\u0011\u0018qx\u000b\u009b\\\u008ahfT[\u0095Oà#ÆéxP\u0016ø\u009cñÛ\u0080b¡îÈq\u0086\u0018;bÙ2v@Ùß²¡\n\u009bºVÂc\u0015¥/\u00ad\u008cÒ÷P\u0010\u0014çDwù\u0084\u0082Uó\u0091bð.äYw\b\u008aQ\u0081Ì\u0086zä\u00928ÔÍd=Þ]´Ï\u001e\nÜÏ¾\u0093i5«{á\u0006ÎmW¹\u009a[ýê\"\u0019E~óÀ«\u0010·\u0096p\u0000ÊÄ\u0001çTÈo\u0097÷~ëëÓÑÇð";
      int var7 = "Y³\u0086&\u0086³\u0012\u0000Z´Þs?\u00adgÎ\u0018Ì¤ø\u0017_O\u001a\u008c\u0087õ¦\u008e\u0010í¡²¤Î\u0088y\u0002\u0017\u0087î\u0010àD¨n:¥\u001e\u0002ÇÝ÷M éÉP0u+\u0083Ã\u0085 +ÐT\u00adÎ*Íà\u0013\u007f\u0000FC \u0015ÛNô\u0004Í\u0083sÓP¡c×ýñ$\u009c³Ì\u0007\u001cUs- ¬Ð7 s´ÎÅVnµV\u0080ºrJ,+_$KÚ]ªæøöPøÌiZÉ\u001c!Ý\u0010±-X\u0094;\u0092?\u008f/C·K5¾\u0004A 5]\u0001ê²Vø7DW\u008dÓG\u001bu\u009f\tS\u0011=O0\u0011éûs®=û\u009e\u0080\u0090\u0010ÜÍ\u0096¦ÌH/k®©ù \u0085WCM@!ÈÖæ}\u001e(¼\u0097\u0002\u0016-\u000e\u009d\u0011[Ù5\nþP\u0091ißíå\u008f0MÜá¢\u0082þ ý\u0092Ìë\u0081Éµ79²J\u0010ZÆ\u0012WbÔ\u009bD¡Ù\n©%ó\u0092\u008c,(eë.\u009eõ7æÿï\u0082s\u0018#y>\u0004+\fhÔ`½?¿ë¦´\u009fg\u0093á\u001cdK\u001fë\u0086\u0005µ/@r½/\u0015\u008e¿øwrºs(.Pß\u001bÅ\u007fÁ$!`\u0006¶Ã\nG-s´\u0091\u0095À|ã\u007fEï\u0005·\u0002\u009cD\u0085Á\u0015NÉsO¯íO\u00807¾-×:#`WDù(eë.\u009eõ7æÿ\u009c\u009e]'8\u0080ùk§&\u0088¥,)F\u007ft[ò<\u009aDw?;c¼ä©%p\u0019\b\u008aQ\u0081Ì\u0086zä\u0092\u0010n\"\u0086\u0012\u0090\u007f\u00845\u008f\u009b\u0093\u0000\u0088\u0012\u008a  \u001cG¬\u0006õ\u009dÐ\fpù»¡#¡\u0091¸\u0000È*l¥,\u008b×<ÅÑfmÃ\u000e@H6\u0099ü\fÔ|éÖÞæä^ö|HÇû9å\u008e\u0010¾ýh\u0099).µîÚ³\u008a7±\u0090g~<úMnN\u00167)¾¢ï\u0091\u001bÊx\u0094\u001d¬¼¨Tà9\u0093ýòßL!ofºä\u008d»HÌÃ\\=ß\u00125\u00adø\u0092¿üÄT\u0011T\u000eø)úü3ã\u0087Û\u00928tØ\u0088[KîæNOD7\u0002ø\u0011\u0018qx\u000b\u009b\\\u008ahfT[\u0095Oà#ÆéxP\u0016ø\u009cñÛ\u0080b¡îÈq\u0086\u0018;bÙ2v@Ùß²¡\n\u009bºVÂc\u0015¥/\u00ad\u008cÒ÷P\u0010\u0014çDwù\u0084\u0082Uó\u0091bð.äYw\b\u008aQ\u0081Ì\u0086zä\u00928ÔÍd=Þ]´Ï\u001e\nÜÏ¾\u0093i5«{á\u0006ÎmW¹\u009a[ýê\"\u0019E~óÀ«\u0010·\u0096p\u0000ÊÄ\u0001çTÈo\u0097÷~ëëÓÑÇð"
         .length();
      char var4 = '\u0010';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var24;
         if ((var3 += var4) >= var7) {
            var5 = "Ís\u0015\u0090\u0094#D\u0099SL>Â\u0003\u0007bz]Ù71Á¼òõ\u0015}ë²\u0086Xê2\u0001\u0098é³5£ÜHö_vÂû\u009d¯g\u0088 ®ùÓ\u000e4´9ÖûÂò\u001fß¢»\u0000\u0090©u\u007fÎ\u0014\u0019\u008cëÍ\u008cÈ<ü½b§[H\u008b¾\u0095¶5ûCãâ9ieQ\u000eâÙòj¶\u000b\u0099\u0006 À´\t¯\u0089r°\u0087e[LpkÈ\n¿Ù\u0000\u0090\u0000ë\u0081ÖQ\u0083Ï±3\u001e MìÉ¿ùñ\u0018\u0011^ÔÑíÂdåºy\u0018ÞÃs4Ö¸\u008dîQfãâ°";
            var7 = "Ís\u0015\u0090\u0094#D\u0099SL>Â\u0003\u0007bz]Ù71Á¼òõ\u0015}ë²\u0086Xê2\u0001\u0098é³5£ÜHö_vÂû\u009d¯g\u0088 ®ùÓ\u000e4´9ÖûÂò\u001fß¢»\u0000\u0090©u\u007fÎ\u0014\u0019\u008cëÍ\u008cÈ<ü½b§[H\u008b¾\u0095¶5ûCãâ9ieQ\u000eâÙòj¶\u000b\u0099\u0006 À´\t¯\u0089r°\u0087e[LpkÈ\n¿Ù\u0000\u0090\u0000ë\u0081ÖQ\u0083Ï±3\u001e MìÉ¿ùñ\u0018\u0011^ÔÑíÂdåºy\u0018ÞÃs4Ö¸\u008dîQfãâ°"
               .length();
            var4 = '\u0090';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var26 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var22 = false;
               var0[var6++] = var26;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll();
                  String var28 = var0[17];
                  String var31 = var0[3];
                  String[] var11 = new String[]{var0[19], var0[22], var0[7]};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var28, var31, 2, var11
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[0], var0[8], false);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[14], var0[16], true);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[4], var0[21], true);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[2], var0[20], 6, 9, 8, 0, 32, null
                  );
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var0[6], var0[15], true);
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting() {
                     private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 46436000927958L;
                     private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                     private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                     {
                        long var1x = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 81008738118470L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                        long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                        long var5x = var3x ^ 2242220246537L;
                        int[] var7x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           -1587650722062379361L, var3x
                        );

                        try {
                           boolean var10000x = MithrilEngine.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                              .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5x);
                           if (var7x == null) {
                              return var10000x;
                           }

                           if (!var10000x) {
                              return true;
                           }
                        } catch (MatchException var8x) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var8x, -1699271180775154075L, var3x
                           );
                        }

                        return false;
                     }

                     static {
                        long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 126522305979742L;
                        Cipher var2;
                        Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                        byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                        for (int var3 = 1; var3 < 8; var3++) {
                           var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                        }

                        var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                        String[] var9 = new String[2];
                        int var7 = 0;
                        String var6 = "æ¢Ïl\\\u0018·A\u007fpWa³\u0084²këSª\u0002p  \u0080xXýä\u001b\u008bv\u001c%\u0085`\u000f\u0090ÅDu]d\u0092dÂ½¯á\u008e1Uö\u0002¼ÑçsØ\u0080I\u0098æ\u0003¿\u0019bÔ\u0010mi\u008e\u0013Fà\u0092\u00924\u0082\u001c\u0019Ãu\u00190\n\u009b;è_\nQ-\u0000eN\u001dDa¡P1³²÷ùÒà\u00adÂËp$\u007f'\u008d±\u0097\u0096N¬\u009d\u0002#Roxt\u008eókú\u000b1Z!\u0083V\u0016rGÈv\u0091jc";
                        int var8 = "æ¢Ïl\\\u0018·A\u007fpWa³\u0084²këSª\u0002p  \u0080xXýä\u001b\u008bv\u001c%\u0085`\u000f\u0090ÅDu]d\u0092dÂ½¯á\u008e1Uö\u0002¼ÑçsØ\u0080I\u0098æ\u0003¿\u0019bÔ\u0010mi\u008e\u0013Fà\u0092\u00924\u0082\u001c\u0019Ãu\u00190\n\u009b;è_\nQ-\u0000eN\u001dDa¡P1³²÷ùÒà\u00adÂËp$\u007f'\u008d±\u0097\u0096N¬\u009d\u0002#Roxt\u008eókú\u000b1Z!\u0083V\u0016rGÈv\u0091jc"
                           .length();
                        char var5 = 24;
                        int var4 = -1;

                        while (true) {
                           byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                           String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                           byte var10001 = -1;
                           var9[var7++] = var13;
                           if ((var4 += var5) >= var8) {
                              IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[2];
                              return;
                           }

                           var5 = var6.charAt(var4);
                        }
                     }

                     private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                        return var0x;
                     }

                     private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                        int var1x = 0;
                        int var2;
                        char[] var3x = new char[var2 = var0x.length];

                        for (int var4x = 0; var4x < var2; var4x++) {
                           int var5x;
                           if ((var5x = 255 & var0x[var4x]) < 192) {
                              var3x[var1x++] = (char)var5x;
                           } else if (var5x < 224) {
                              char var6x = (char)((char)(var5x & 31) << 6);
                              byte var8x = var0x[++var4x];
                              var6x = (char)(var6x | (char)(var8x & 63));
                              var3x[var1x++] = var6x;
                           } else if (var4x < var2 - 2) {
                              char var12 = (char)((char)(var5x & 15) << '\f');
                              byte var9x = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9x & 63) << 6);
                              var9x = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9x & 63));
                              var3x[var1x++] = var12;
                           }
                        }

                        return new String(var3x, 0, var1x);
                     }

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                        int var5x = var0x ^ (int)(var1x & 32767L) ^ 21536;
                        if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] == null) {
                           Object[] var4x;
                           try {
                              Long var3x = Thread.currentThread().threadId();
                              var4x = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3x);
                              if (var4x == null) {
                                 var4x = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3x, var4x);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                 var10
                              );
                           }

                           byte[] var6x = new byte[8];
                           var6x[0] = (byte)(var1x >>> 56);

                           for (int var7x = 1; var7x < 8; var7x++) {
                              var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                           }

                           DESKeySpec var11x = new DESKeySpec(var6x);
                           SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11x);
                           ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                           byte[] var9x = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5x].getBytes("ISO-8859-1");
                           llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9x)
                           );
                        }

                        return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                     ) {
                        int var4x = (Integer)var3x[0];
                        long var5x = (Long)var3x[1];
                        String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                        MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                        var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                        return var7x;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, String var1x, MethodType var2
                     ) {
                        MutableCallSite var3x = new MutableCallSite(var2);

                        try {
                           var3x.setTarget(
                              MethodHandles.explicitCastArguments(
                                 MethodHandles.insertArguments(
                                    "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                       .asCollector(Object[].class, var2.parameterCount()),
                                    0,
                                    var0x,
                                    var3x,
                                    var1x
                                 ),
                                 var2
                              )
                           );
                           return var3x;
                        } catch (Exception var5x) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/macros/IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                 + " : "
                                 + var1x
                                 + " : "
                                 + var2.toString(),
                              var5x
                           );
                        }
                     }
                  };
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting() {
                     private static int[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 57537763042407L;
                     private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     private static Map lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap(13);

                     {
                        long var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 72772271178869L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
                        // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
                     }

                     public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int[] var0x) {
                        lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0x;
                     }

                     public static int[] IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
                        return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     }

                     static {
                        long var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 73999871573993L;
                        int[] var10000 = new int[3];
                        int[] var11 = var10000;
                        llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
                        Cipher var0;
                        Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                        byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                        for (int var1 = 1; var1 < 8; var1++) {
                           var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
                        }

                        var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                        String[] var7 = new String[2];
                        int var5 = 0;
                        String var4 = "Ù+à½\r5\u0095zMh\u0085%V\u008bëI)±êk&·\u008fè²îðFõ&D$\u0011ôù§ÅLqÒ\u0019\u0013\u0095\u0094¨:\u008f¢\u0014n!\u007fÂò\u008eÔQ/ V\u0081²rÃ\u009cÑ\u0096iýûDâl\u0000æ\u008f\u001bõãMK\u000b¥\u000e+õ\f\u0015Ãc\u0094A\u0003\u001bq'ð(ßT\u00ad\u0088²¨Ö=\u0097g\u001e¦\u0010}·ï#¨½ÕÛâÅû\u0083Éß?\u0087|[\u0001²\u0099Ð\u009aûal8\u0087\u0011 ro+s¶GazÌ©1(³\u007f\u0016ö\u0015\u0012¶\u0004D\u001a\u009b+¡¸¤{~W0\u009f\u008aR1\u0081Ä*Ê<ùÈÚeýºh%\tr¬S";
                        int var6 = "Ù+à½\r5\u0095zMh\u0085%V\u008bëI)±êk&·\u008fè²îðFõ&D$\u0011ôù§ÅLqÒ\u0019\u0013\u0095\u0094¨:\u008f¢\u0014n!\u007fÂò\u008eÔQ/ V\u0081²rÃ\u009cÑ\u0096iýûDâl\u0000æ\u008f\u001bõãMK\u000b¥\u000e+õ\f\u0015Ãc\u0094A\u0003\u001bq'ð(ßT\u00ad\u0088²¨Ö=\u0097g\u001e¦\u0010}·ï#¨½ÕÛâÅû\u0083Éß?\u0087|[\u0001²\u0099Ð\u009aûal8\u0087\u0011 ro+s¶GazÌ©1(³\u007f\u0016ö\u0015\u0012¶\u0004D\u001a\u009b+¡¸¤{~W0\u009f\u008aR1\u0081Ä*Ê<ùÈÚeýºh%\tr¬S"
                           .length();
                        char var3 = 152;
                        int var2 = -1;

                        while (true) {
                           byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
                           String var15 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var8).intern();
                           byte var10001 = -1;
                           var7[var5++] = var15;
                           if ((var2 += var3) >= var6) {
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var7;
                              lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new String[2];
                              return;
                           }

                           var3 = var4.charAt(var2);
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

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                        int var5 = var0 ^ (int)(var1 & 32767L) ^ 8641;
                        if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] == null) {
                           Object[] var4;
                           try {
                              Long var3 = Thread.currentThread().threadId();
                              var4 = (Object[])lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var3);
                              if (var4 == null) {
                                 var4 = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var3, var4);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                 var10
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
                           byte[] var9 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5].getBytes("ISO-8859-1");
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4[0]).doFinal(var9)
                           );
                        }

                        return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0, MutableCallSite var1, String var2, Object[] var3
                     ) {
                        int var4 = (Integer)var3[0];
                        long var5 = (Long)var3[1];
                        String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                        MethodHandle var8 = MethodHandles.constant(String.class, var7);
                        var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                        return var7;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0, String var1, MethodType var2
                     ) {
                        MutableCallSite var3 = new MutableCallSite(var2);

                        try {
                           var3.setTarget(
                              MethodHandles.explicitCastArguments(
                                 MethodHandles.insertArguments(
                                    "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                       .asCollector(Object[].class, var2.parameterCount()),
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
                              "me/octo/client/modules/impl/macros/IIlIlIlIlllIIlIIlIlIIlIIIllllIIlIlllIllIIIlIllIIIlIIlIlIIIIIllllllIIIlIlllIlIlIlllIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                 + " : "
                                 + var1
                                 + " : "
                                 + var2.toString(),
                              var5
                           );
                        }
                     }
                  };
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BooleanSetting(var0[18], var0[10], true);
                  String var29 = var0[1];
                  String var32 = var0[11];
                  var11 = new String[]{
                     var0[12],
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(0),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(1),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(2),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(3),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(4),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(5),
                     lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getTargetNames()
                        .get(6)
                  };
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var29, var32, var11
                  );
                  String var30 = var0[5];
                  String var33 = var0[9];
                  String var10004 = lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                     .getParentFolderName();
                  var11 = new String[]{var0[13]};
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var30, var33, var10004, var11, 0, null, 48, null
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
