package me.octo.client.gui;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   private final String title;
   @NotNull
   private final String message;
   @NotNull
   private final String confirmLabel;
   @NotNull
   private final String cancelLabel;
   private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private final Function0<Unit> onConfirm;
   @NotNull
   private final Function0<Unit> onClose;
   private boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final <unrepresentable> lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 105385598639678L;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static Map llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new HashMap(13);

   public lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII(
      @NotNull String titleArg,
      @NotNull String messageArg,
      @NotNull String confirmLabelArg,
      @NotNull String cancelLabelArg,
      boolean argument5Arg,
      @NotNull Function0<Unit> onConfirmArg,
      @NotNull Function0<Unit> onCloseArg
   ) {
      long var8 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 6065607297366L;
      Intrinsics.checkNotNullParameter(titleArg, "title");
      Intrinsics.checkNotNullParameter(messageArg, "message");
      Intrinsics.checkNotNullParameter(confirmLabelArg, "confirmLabel");
      Intrinsics.checkNotNullParameter(cancelLabelArg, "cancelLabel");
      Intrinsics.checkNotNullParameter(onConfirmArg, "onConfirm");
      Intrinsics.checkNotNullParameter(onCloseArg, "onClose");
      super();
      this.title = titleArg;
      this.message = messageArg;
      this.confirmLabel = confirmLabelArg;
      this.cancelLabel = cancelLabelArg;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument5Arg;
      this.onConfirm = onConfirmArg;
      this.onClose = onCloseArg;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
         @Override
         public void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
         }

         @Override
         public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1, int var2, long var3) {
         }
      };
   }

   @NotNull
   public final String getTitle() {
      return this.title;
   }

   @NotNull
   public final String getMessage() {
      return this.message;
   }

   @NotNull
   public final String getConfirmLabel() {
      return this.confirmLabel;
   }

   @NotNull
   public final String getCancelLabel() {
      return this.cancelLabel;
   }

   public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final Function0<Unit> getOnConfirm() {
      return this.onConfirm;
   }

   @NotNull
   public final Function0<Unit> getOnClose() {
      return this.onClose;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, short param2, int param3, float param4, float param5, float param6, int param7, int param8, char param9, float param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, String param2, float param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, long param2, float param4, float param5, float param6, String param7, boolean param8, boolean param9, boolean param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char param1, int param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      final Function0<Unit> var1
   ) {
      return new me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
         @Override
         public void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1x) {
            var1.invoke();
         }

         @Override
         public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1x, int var2, long var3) {
         }
      };
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var0
   ) {
      var0.onClose.invoke();
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var0
   ) {
      var0.onConfirm.invoke();
      var0.onClose.invoke();
      return Unit.INSTANCE;
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0) {
      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var0;
   }

   public static int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   public static int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      int var0 = IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
      return var0 == 0 ? 101 : 0;
   }

   static {
      long var9 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 133128941264701L;
      byte var11 = 18;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[11];
      int var5 = 0;
      String var4 = "»ÄWWPpS:$ø\u001bé,yßJ\u008d._\u008a\u0006\u0081\u0080\u0098[\u00ad\u009c¬\u0082^óHðôÑN{C íÌûØ'D95ãc°5\u008fºh\u0014\rÈ,§·ù[Ü¦\u008aåË¶\u0010»\u008b\u0017¿Ñ\u008d\b4}u5¤²ü\u000b+,\u00adÃ¿\u001b\u0005\u0089ê2ÝäN>B2\u000f\u0002\rÈ¨V rÐòàfûu\u001a ¼\u009c\u0084\u0010ÓçëBåÐÝ;\u0015\"Ê\u001bþçPÛèbIK\u001aÞ\u001dì\"¨>\\:6\u000eèù\u0010#\u008d1æH\u009e\u0090{\u0004L÷+°ºô{\b{\u0097â\u001dÊÖ\u001d®ûÅ\u0002G\u0013öl\u0096\"eê\u0091\r\n_n\u009c\u0095\u0090\u0089ÌÃ\u0098ö/\u0003C5°Ca\n.Qs¸¡>Rñ}MÄxÀR®¹g\u0010;\u001e÷çÕE\u0085\u0016\u0014\u0089\u0086\u0098\u008d¿ìz\u00812²Ï'ª\u008e\u0090\u0087g;¦ 0Rzé\u001e³\u0019³Q\u0096@\u001eÉëì3,þñ\u0082ác¤ÐÐÌ5¬J<Eu\u00ad\u0015äÛþÍ\u0099ØKÔg=\u0091®·\u008fãÑY\t¤\u0099\u0010l\"ºÁ!\u0085´,û\u0005ß,\\\u0098,p 6^ Â±KQU\u0090°»êuk\u0084¦÷ÈV\u0092\u008b\u0089\u0003í7h=ö\u0013>R'\u0010Ú 4FwÖ¹\u0084\u001c\u008c\u001c{»+|Y\u0010\u0092ÛwDÊ3\u0099±B\u0095H·\u001a@bã\u0010ëÂñ+p\t%÷\bÐ\u0005Â|.\u001cê ê\u0002\u0004cèÂ©\u00806$ÝV§$)þËàMÓ¤Óÿ{\u0092À È;üÛ\u00ad \u0090Á#Q4\u0086¥°]@\u001cé\u00927Õ\u001f´Ñ9ò]¿8o\u0019 \u0082ÈûÖ¾½\u0018É\u008cþ!\u0081_\u0086\u0016\u008c&f\u0011\u0017¨·ýÄb\u0011\rôÌÖ\u009c";
      int var6 = "»ÄWWPpS:$ø\u001bé,yßJ\u008d._\u008a\u0006\u0081\u0080\u0098[\u00ad\u009c¬\u0082^óHðôÑN{C íÌûØ'D95ãc°5\u008fºh\u0014\rÈ,§·ù[Ü¦\u008aåË¶\u0010»\u008b\u0017¿Ñ\u008d\b4}u5¤²ü\u000b+,\u00adÃ¿\u001b\u0005\u0089ê2ÝäN>B2\u000f\u0002\rÈ¨V rÐòàfûu\u001a ¼\u009c\u0084\u0010ÓçëBåÐÝ;\u0015\"Ê\u001bþçPÛèbIK\u001aÞ\u001dì\"¨>\\:6\u000eèù\u0010#\u008d1æH\u009e\u0090{\u0004L÷+°ºô{\b{\u0097â\u001dÊÖ\u001d®ûÅ\u0002G\u0013öl\u0096\"eê\u0091\r\n_n\u009c\u0095\u0090\u0089ÌÃ\u0098ö/\u0003C5°Ca\n.Qs¸¡>Rñ}MÄxÀR®¹g\u0010;\u001e÷çÕE\u0085\u0016\u0014\u0089\u0086\u0098\u008d¿ìz\u00812²Ï'ª\u008e\u0090\u0087g;¦ 0Rzé\u001e³\u0019³Q\u0096@\u001eÉëì3,þñ\u0082ác¤ÐÐÌ5¬J<Eu\u00ad\u0015äÛþÍ\u0099ØKÔg=\u0091®·\u008fãÑY\t¤\u0099\u0010l\"ºÁ!\u0085´,û\u0005ß,\\\u0098,p 6^ Â±KQU\u0090°»êuk\u0084¦÷ÈV\u0092\u008b\u0089\u0003í7h=ö\u0013>R'\u0010Ú 4FwÖ¹\u0084\u001c\u008c\u001c{»+|Y\u0010\u0092ÛwDÊ3\u0099±B\u0095H·\u001a@bã\u0010ëÂñ+p\t%÷\bÐ\u0005Â|.\u001cê ê\u0002\u0004cèÂ©\u00806$ÝV§$)þËàMÓ¤Óÿ{\u0092À È;üÛ\u00ad \u0090Á#Q4\u0086¥°]@\u001cé\u00927Õ\u001f´Ñ9ò]¿8o\u0019 \u0082ÈûÖ¾½\u0018É\u008cþ!\u0081_\u0086\u0016\u008c&f\u0011\u0017¨·ýÄb\u0011\rôÌÖ\u009c"
         .length();
      char var3 = 'ĸ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "á\u00804Ïm**\u0092.+\u0093±/\u0091\u0017\u0013 Öm\u0087¡]üCÀÈ\u000f_H,ñÏÖÚ°Ìò\u0016\u0081»¨Ác\u0014d^Üe,";
            var6 = "á\u00804Ïm**\u0092.+\u0093±/\u0091\u0017\u0013 Öm\u0087¡]üCÀÈ\u000f_H,ñÏÖÚ°Ìò\u0016\u0081»¨Ác\u0014d^Üe,".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var7;
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new String[11];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22415;
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
            throw new RuntimeException("me/octo/client/gui/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10);
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
            "me/octo/client/gui/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }
}
