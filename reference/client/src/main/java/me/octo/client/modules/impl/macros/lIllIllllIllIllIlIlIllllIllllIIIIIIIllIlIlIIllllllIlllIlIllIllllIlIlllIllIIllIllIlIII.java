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
import org.jetbrains.annotations.NotNull;

public final class lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII {
   @NotNull
   public static lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   public static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   public static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   public static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanSetting lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static BooleanSetting lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static BooleanSetting lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static BooleanSetting IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private static BooleanSetting IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private static BooleanSetting IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;

   private lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final BooleanSetting lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final BooleanSetting IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   @NotNull
   public final BooleanSetting lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   @NotNull
   public final BooleanSetting IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   @NotNull
   public final BooleanSetting IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   static {
      long var9 = 53475894917964L ^ 63871177059319L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[28];
      int var6 = 0;
      String var5 = ";í»Ú6\u009b]\u009aãh*U ë\u0011$\u0010.Üª0(\fÞ\u0006í¯\r\u0005\u007f \u0089þ\u0010$W±ñ\u009apÈ\u0001\u001a\u001fKìlÿÕ6\u0018</9\u0086{xn¯F~¢\u008eñÁ%\u0089}\u0010ÿ\u0015ºE\u001eã\u00101Õ\u001e÷[\u000e\u0085².\u0014\u0010¼¨ê'*\u0018ÈÏÔÁµ\u0085<Q¼²QR±²o4é\u001c\u00056A½?¨\bø+\u0081VÙ|á6\u0010$W±ñ\u009apÈ\u0001)F\u009dªØVÏ!8öDÝ\u008dÒ¥Ê´\u001dåÃ¹ÄfOdl\u008c5¯ìR)\u001eé¥èÀM\u008f'rZÍni~ù#ÿcí}\":L\u0004\u0081v#{Î\f¶¥\u008e\bø+\u0081VÙ|á68[sÀ\u0015M\u0014Â\rO\u0096ð8P\u0085éQ¿ËaW¥\u00ady\u0087\u009f(Õ\n\u0092JdÝL³ \nVo~(içw½ÀE¤\u0081ô ISoÚ£p0^\u0086+Aß\u0097ªÅB\u0012¢ä3\u0018ýÅãkM!X\u0004½ö¹\u007f\u000f\u008a ·4¾\u000e\u000e\u0083Éa¦M\u0006Å§ÜW0üùc0C¢ä\u0004³¢\u009e\u001egr¸Ø\u007f\u0096åd8_#.îð\u008aàÁáÞ>f¸ç8\u0003Á¶il-M°F\u0001\u0095ñ\u00942\u0086\u00810\u000blÔ\u0094\u0089aP6PøÇ\u001d·Gá¥æÙ.\u0019¨«ÏXTIqÚ\u0086-®\u008fY=ÂjÿöÝDì¤³HÅpºµ\u0010þä!JncvISY\u0012\fÑýd×\u0010\u008b;ÑÑpãí;¼9Æ\u0001¹\u0014àd\u0018þä!JncvISîw´>ä.\u0089f\u0012[[Pp§\u0084\u0010®§\u009a:\u009e#\tÙÒ\u001f\u008f¡~8õ\u00018¶Ø÷k¾AsÀÏ[Í0Fwí¶\u0088\n\"¡ºH\u0096tò4ÙVtQfW\u0091û\u0086\u0088\u0005\u0012Z¹\u009bo!\u0098!\u009cßÞw¾âj\u0003¸]\u0096\b\u001a\u009e#\u001eKÜEéHâÜ!¢Üpò½¤èº87Q\n?í½\u0004ÉQq\u0081¡ûÔ¶8\\\u0082\u0099´ÿ7\u0095à\u008exCÍJ-<\u0080\tõ½îã\u008fµB:EN¢Ö\u0013·$\u009aZ\u0090\u0007¦¸\u009b\u0094\u009aUâé\u0010$W±ñ\u009apÈ\u0001)F\u009dªØVÏ!\u0018þä!JncvI3çèQÝ\u0090õ\u0014ú{Z\u001a¤/F{\u0010$W±ñ\u009apÈ\u0001\u008ap~Kê\n¹^\u0010þä!JncvISY\u0012\fÑýd×\u00188(¼edZ¿¬\u0089\u008bCá}\f\u0003)\u0013è\u0002ØÈ%¯8";
      int var7 = ";í»Ú6\u009b]\u009aãh*U ë\u0011$\u0010.Üª0(\fÞ\u0006í¯\r\u0005\u007f \u0089þ\u0010$W±ñ\u009apÈ\u0001\u001a\u001fKìlÿÕ6\u0018</9\u0086{xn¯F~¢\u008eñÁ%\u0089}\u0010ÿ\u0015ºE\u001eã\u00101Õ\u001e÷[\u000e\u0085².\u0014\u0010¼¨ê'*\u0018ÈÏÔÁµ\u0085<Q¼²QR±²o4é\u001c\u00056A½?¨\bø+\u0081VÙ|á6\u0010$W±ñ\u009apÈ\u0001)F\u009dªØVÏ!8öDÝ\u008dÒ¥Ê´\u001dåÃ¹ÄfOdl\u008c5¯ìR)\u001eé¥èÀM\u008f'rZÍni~ù#ÿcí}\":L\u0004\u0081v#{Î\f¶¥\u008e\bø+\u0081VÙ|á68[sÀ\u0015M\u0014Â\rO\u0096ð8P\u0085éQ¿ËaW¥\u00ady\u0087\u009f(Õ\n\u0092JdÝL³ \nVo~(içw½ÀE¤\u0081ô ISoÚ£p0^\u0086+Aß\u0097ªÅB\u0012¢ä3\u0018ýÅãkM!X\u0004½ö¹\u007f\u000f\u008a ·4¾\u000e\u000e\u0083Éa¦M\u0006Å§ÜW0üùc0C¢ä\u0004³¢\u009e\u001egr¸Ø\u007f\u0096åd8_#.îð\u008aàÁáÞ>f¸ç8\u0003Á¶il-M°F\u0001\u0095ñ\u00942\u0086\u00810\u000blÔ\u0094\u0089aP6PøÇ\u001d·Gá¥æÙ.\u0019¨«ÏXTIqÚ\u0086-®\u008fY=ÂjÿöÝDì¤³HÅpºµ\u0010þä!JncvISY\u0012\fÑýd×\u0010\u008b;ÑÑpãí;¼9Æ\u0001¹\u0014àd\u0018þä!JncvISîw´>ä.\u0089f\u0012[[Pp§\u0084\u0010®§\u009a:\u009e#\tÙÒ\u001f\u008f¡~8õ\u00018¶Ø÷k¾AsÀÏ[Í0Fwí¶\u0088\n\"¡ºH\u0096tò4ÙVtQfW\u0091û\u0086\u0088\u0005\u0012Z¹\u009bo!\u0098!\u009cßÞw¾âj\u0003¸]\u0096\b\u001a\u009e#\u001eKÜEéHâÜ!¢Üpò½¤èº87Q\n?í½\u0004ÉQq\u0081¡ûÔ¶8\\\u0082\u0099´ÿ7\u0095à\u008exCÍJ-<\u0080\tõ½îã\u008fµB:EN¢Ö\u0013·$\u009aZ\u0090\u0007¦¸\u009b\u0094\u009aUâé\u0010$W±ñ\u009apÈ\u0001)F\u009dªØVÏ!\u0018þä!JncvI3çèQÝ\u0090õ\u0014ú{Z\u001a¤/F{\u0010$W±ñ\u009apÈ\u0001\u008ap~Kê\n¹^\u0010þä!JncvISY\u0012\fÑýd×\u00188(¼edZ¿¬\u0089\u008bCá}\f\u0003)\u0013è\u0002ØÈ%¯8"
         .length();
      char var4 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var16 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var16.getBytes("ISO-8859-1"));
            String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var22;
                  if ((var13 += var4) >= var7) {
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0[7];
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0[6];
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0[14];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII();
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var0[1], var0[18], true);
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 52903450414689L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1x = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 13465164050270L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 105549701433177L;
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
                           String var6 = "å\u000fÎ9°\u001c¶ïl8»N\u009fC¦èE¥qGØ;LÚ»k½\u001fÊ6z| <\u0006\u0094\u001fò×ÂÝú\u0001\u0018K\u0012b¬¢Ì7Z4Zõáº\u001aõ\u0017ã\u0016Ù\u0080õó+'°\u0096\r\u0019=Ý|iÏÐr\u0095ði\u0087W\u001d³Èm5ÝÍuDh² ò\u009fb]Ê3W5UE,>\u0007«¦\u0082ñª\u0002RÁ&_\u0090ÐçÇ$\u008d\u001bY]ÜÒ×ÖF!\nìj\u0004\u00954ûÔ\u0096\u000ftî«jÙµá\u0093^Éø¬Ä1IÚ´`\u0090Óa\u0017\b(AÝV|Ö,\u0004ÖK\u0007\u001c 'm³\u0012þ>jpYÔÃ\u008c §\u001d×Ô©P\u0086Ýåö\nKK\u0094(r\u001f\u0087;~\n¤\u0012ÝWÝüæª\u0016Âý";
                           int var8 = "å\u000fÎ9°\u001c¶ïl8»N\u009fC¦èE¥qGØ;LÚ»k½\u001fÊ6z| <\u0006\u0094\u001fò×ÂÝú\u0001\u0018K\u0012b¬¢Ì7Z4Zõáº\u001aõ\u0017ã\u0016Ù\u0080õó+'°\u0096\r\u0019=Ý|iÏÐr\u0095ði\u0087W\u001d³Èm5ÝÍuDh² ò\u009fb]Ê3W5UE,>\u0007«¦\u0082ñª\u0002RÁ&_\u0090ÐçÇ$\u008d\u001bY]ÜÒ×ÖF!\nìj\u0004\u00954ûÔ\u0096\u000ftî«jÙµá\u0093^Éø¬Ä1IÚ´`\u0090Óa\u0017\b(AÝV|Ö,\u0004ÖK\u0007\u001c 'm³\u0012þ>jpYÔÃ\u008c §\u001d×Ô©P\u0086Ýåö\nKK\u0094(r\u001f\u0087;~\n¤\u0012ÝWÝüæª\u0016Âý"
                              .length();
                           char var5 = 192;
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

                        private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                           int var1x = 0;
                           int var2;
                           char[] var3 = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3[var1x++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8x = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8x & 63));
                                 var3[var1x++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12 = (char)((char)(var5x & 15) << '\f');
                                 byte var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63) << 6);
                                 var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63));
                                 var3[var1x++] = var12;
                              }
                           }

                           return new String(var3, 0, var1x);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                           int var5x = var0x ^ (int)(var1x & 32767L) ^ 13561;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4x = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1x >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                              }

                              DESKeySpec var11 = new DESKeySpec(var6x);
                              SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                              ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                              byte[] var9x = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5x]
                                 .getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9x)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, MutableCallSite var1x, String var2, Object[] var3
                        ) {
                           int var4x = (Integer)var3[0];
                           long var5x = (Long)var3[1];
                           String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                           var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                           return var7x;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1x, MethodType var2
                        ) {
                           MutableCallSite var3 = new MutableCallSite(var2);

                           try {
                              var3.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
                                       0,
                                       var0x,
                                       var3,
                                       var1x
                                    ),
                                    var2
                                 )
                              );
                              return var3;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                    + " : "
                                    + var1x
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 128493653696438L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 8898924134024L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
                           // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 62644779424305L;
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
                           String var6 = "È\u008dd\"\u0089\f\u009e»ZÈDÎ¡\t>+0\u009a_^?ãè\u009fP\u001e@\u0018!g¹Jì=,<õ\u0007f\u009b\u0001\u000f :lûCeç\u008c?tö\u0007µÈ\u00159Þ\u0006\u000e\u007f#\u008c\u000b\u0002$Â\u001e\n9\u001aàu\u001fU\u008b\u0004`wýA\u009e4ey\u009eõ]ë\u0007\u001f\u009cìÄ\u0081DPÝ5'ëö\u001fº";
                           int var8 = "È\u008dd\"\u0089\f\u009e»ZÈDÎ¡\t>+0\u009a_^?ãè\u009fP\u001e@\u0018!g¹Jì=,<õ\u0007f\u009b\u0001\u000f :lûCeç\u008c?tö\u0007µÈ\u00159Þ\u0006\u000e\u007f#\u008c\u000b\u0002$Â\u001e\n9\u001aàu\u001fU\u008b\u0004`wýA\u009e4ey\u009eõ]ë\u0007\u001f\u009cìÄ\u0081DPÝ5'ëö\u001fº"
                              .length();
                           char var5 = 24;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
                        }

                        private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           MatchException var0x
                        ) {
                           return var0x;
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 11702;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                              byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanSetting(var0[25], var0[20], false);
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 68201468400951L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 136762283685474L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 118488947981369L;
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
                           String var6 = "|(\u0016zÙ\u0011äãzLòKÀDÕ\u00168x~¥kñbÉ\u0007õ°\u001er®§½Pû\u0017&\u0003Ðu@\u0093\u008b²b\u0083vj\u009f\u0011Ï;x,_F\u009dË+©:»b\u0014¦Äü\u0093E\u008c\u0016D\u001cQ*\u008d¥\u0002×M\u0014+éq\fZ[\u007f\u008f1C¹çN»ë¸\u00ad½\u009aÁ¾ë2\u0092¨\u0085\u0015Î\u0092+¼JÃ";
                           int var8 = "|(\u0016zÙ\u0011äãzLòKÀDÕ\u00168x~¥kñbÉ\u0007õ°\u001er®§½Pû\u0017&\u0003Ðu@\u0093\u008b²b\u0083vj\u009f\u0011Ï;x,_F\u009dË+©:»b\u0014¦Äü\u0093E\u008c\u0016D\u001cQ*\u008d¥\u0002×M\u0014+éq\fZ[\u007f\u008f1C¹çN»ë¸\u00ad½\u009aÁ¾ë2\u0092¨\u0085\u0015Î\u0092+¼JÃ"
                              .length();
                           char var5 = ' ';
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 18390;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     String var25 = var0[26];
                     String var28 = var0[12];
                     String[] var11 = new String[]{var0[21], var0[24], var0[9]};
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var25, var28, var11
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 105825512222881L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 121531508235755L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(25638, 6429266209716006753L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 110351227707313L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "\u0015}Ãv\u008e/ÉÎ\u0098=#n\u0005Ã\u0095Æ'´¹\u008bÃE2muÍææVÁ²\\Xiú¢\u0093\u0091|ÈbÓ> ÝON%eKíÑÕãÅ \u0089}X}>!z4\u009e²wÖµô\u00855wè¥ë:T|¨¿\u000e\u009b0Gà\f!V\u0093½\u0018\u0006ß×ëÏ?]Q¬j;\u000b}_=§S\u008büìÓÆTå\u0087Ø\u0099[ß\u0018sÉ\u0016µê\\ÿS\u00935¾\u009cB¦<Ô?p\u0019\u0095ÊÍÑÁ";
                           int var8 = "\u0015}Ãv\u008e/ÉÎ\u0098=#n\u0005Ã\u0095Æ'´¹\u008bÃE2muÍææVÁ²\\Xiú¢\u0093\u0091|ÈbÓ> ÝON%eKíÑÕãÅ \u0089}X}>!z4\u009e²wÖµô\u00855wè¥ë:T|¨¿\u000e\u009b0Gà\f!V\u0093½\u0018\u0006ß×ëÏ?]Q¬j;\u000b}_=§S\u008büìÓÆTå\u0087Ø\u0099[ß\u0018sÉ\u0016µê\\ÿS\u00935¾\u009cB¦<Ô?p\u0019\u0095ÊÍÑÁ"
                              .length();
                           char var5 = ' ';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 24886;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 12610687658331L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 114296206609043L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"q">(21171, 2681130814287671260L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 49990263884333L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "¼\u0096îòw\u0081\u0099\u0095çR\u008aÛÂCwC)ÌW\u0013&]\u0013¢\u0089hÁïÇqö\u001c@É]r\nùZ\u0019Xç\n¥^\u001di¬z×\u0097\u000f\u000b-\u0085\u008bI#ëòÌøÁ¦\u00ad.¿w\r§SÀÏ¶N\r§n\u0087Õ×ñ£\t\u009e:Ç\u009c\u0001\u0093CBüþ\u008bYã\u0095|4ÍàÃ¥X\u00948\u0017Q[ÿ\u008eu6À`\u0002\u008c\u009fl;7\u0005\u00901Å\u0011î\u001f\u0018ê[Ãæv_\u0087¸^\u001a£´Y\u0086\u0086<Ä7:µ\u008b\u0099\u0089ï";
                           int var8 = "¼\u0096îòw\u0081\u0099\u0095çR\u008aÛÂCwC)ÌW\u0013&]\u0013¢\u0089hÁïÇqö\u001c@É]r\nùZ\u0019Xç\n¥^\u001di¬z×\u0097\u000f\u000b-\u0085\u008bI#ëòÌøÁ¦\u00ad.¿w\r§SÀÏ¶N\r§n\u0087Õ×ñ£\t\u009e:Ç\u009c\u0001\u0093CBüþ\u008bYã\u0095|4ÍàÃ¥X\u00948\u0017Q[ÿ\u008eu6À`\u0002\u008c\u009fl;7\u0005\u00901Å\u0011î\u001f\u0018ê[Ãæv_\u0087¸^\u001a£´Y\u0086\u0086<Ä7:µ\u008b\u0099\u0089ï"
                              .length();
                           char var5 = '(';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 22300;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     String var26 = var0[3];
                     String var29 = var0[10];
                     var11 = new String[]{var0[19], var0[15]};
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var26, var29, var11
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[27], var0[11], 4, 20, 8, 1
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 99003947741493L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 69243028005050L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"n">(24402, 8378751095235230127L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 75298669970333L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "\u001dóÚÁÿ¯\u0088\u009frî\u008e£|Pl³v\u001a6ºH4\u0015G}àÿ\u0098×?\b¦\u0003±\u0082æ|}\u001dõXê\u0099\u0001©-\u0007ÀÖ¦\rS§À\"À3\f6áÂê\"Â¡ÑâÕlÚ\u0013Ã\u009fÜ¢ï\u0087\u008dubæ\u0095¨\u009aÔXañ\b\u001bÙ\u0015X\u0085 \u001av\u0082T\u0081â\u0080äà>?\u0082\u0092 \u0089y\u0013\u0097L3(áS\u0096é\u000b\u000f°®y\u00050î1\u0018nCùâ\u0090Å÷\u0090yÄ\u008aÖdM \u0084)Õïo½©ýø";
                           int var8 = "\u001dóÚÁÿ¯\u0088\u009frî\u008e£|Pl³v\u001a6ºH4\u0015G}àÿ\u0098×?\b¦\u0003±\u0082æ|}\u001dõXê\u0099\u0001©-\u0007ÀÖ¦\rS§À\"À3\f6áÂê\"Â¡ÑâÕlÚ\u0013Ã\u009fÜ¢ï\u0087\u008dubæ\u0095¨\u009aÔXañ\b\u001bÙ\u0015X\u0085 \u001av\u0082T\u0081â\u0080äà>?\u0082\u0092 \u0089y\u0013\u0097L3(áS\u0096é\u000b\u000f°®y\u00050î1\u0018nCùâ\u0090Å÷\u0090yÄ\u008aÖdM \u0084)Õïo½©ýø"
                              .length();
                           char var5 = '(';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 3214;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 78763803144871L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 103652741143424L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
                           // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 136752357085253L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "NÍõ0÷9jm\u00ad\u001f×\u000f¿\u009fqÆöè\u0011õÊÊ\t\u0091%ëôqC\u0084¦q«Xß·4å¤ü\u0085®Ë\u001aÚþ:ÑlhÁ²ø¨\u0093üIyÃ\u0003\\>\u000f¦NÜ\u000b\u0085\u009f1¨5c\u001f0G\u0089¡¶0\u0005aÌS°p(Õé \u0084ø\u0096äÒÞ[×÷È\u001eÌ\u0080? '\u0017Û,C\u0005#\u0006BëXx[È\u0080Ù^¥Sÿ,ÄÁ£Zã¦\u0002\u0092\u0084\u0011F(\u0003!£Aß¹ëjÌ±¢G!FSN¡Ûóõ$áø Ùàø\n\u001c\u0099\u008d ®ü\u009e\u0090\u009e¹ \t";
                           int var8 = "NÍõ0÷9jm\u00ad\u001f×\u000f¿\u009fqÆöè\u0011õÊÊ\t\u0091%ëôqC\u0084¦q«Xß·4å¤ü\u0085®Ë\u001aÚþ:ÑlhÁ²ø¨\u0093üIyÃ\u0003\\>\u000f¦NÜ\u000b\u0085\u009f1¨5c\u001f0G\u0089¡¶0\u0005aÌS°p(Õé \u0084ø\u0096äÒÞ[×÷È\u001eÌ\u0080? '\u0017Û,C\u0005#\u0006BëXx[È\u0080Ù^¥Sÿ,ÄÁ£Zã¦\u0002\u0092\u0084\u0011F(\u0003!£Aß¹ëjÌ±¢G!FSN¡Ûóõ$áø Ùàø\n\u001c\u0099\u008d ®ü\u009e\u0090\u009e¹ \t"
                              .length();
                           char var5 = 'h';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[3];
                                 return;
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

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 7027;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                              byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
                                 "me/octo/client/modules/impl/macros/lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new BooleanSetting(var0[0], var0[5], false);
                     String var27 = var0[17];
                     String var30 = var0[8];
                     String var10004 = IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getParentFolderName();
                     var11 = new String[]{var0[2], var0[23], var0[22], var0[16]};
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
                        var27, var30, var10004, var11, 0, null, 48, null
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new BooleanSetting(var0[4], var0[13], true);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var22;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "\u0090\u0016\u0085Um\u0080^\u0002û\u0087ó\u0091º\u008eÐ\u009f\u0018IÒl|T°N\u001e,\u0007dá\u009e7®©´wÉ÷\u0094Ð\u0005°";
                  var7 = "\u0090\u0016\u0085Um\u0080^\u0002û\u0087ó\u0091º\u008eÐ\u009f\u0018IÒl|T°N\u001e,\u0007dá\u009e7®©´wÉ÷\u0094Ð\u0005°".length();
                  var4 = 16;
                  var13 = -1;
            }

            var16 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
