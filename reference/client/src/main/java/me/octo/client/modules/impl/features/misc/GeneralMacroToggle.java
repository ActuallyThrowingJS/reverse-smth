package me.octo.client.modules.impl.features.misc;

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
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.endgameGUI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI;
import me.octo.client.gui.clickgui.modules.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll;
import me.octo.client.gui.clickgui.modules.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;

public class GeneralMacroToggle extends IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {
   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 79384359003706L;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static Map IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap(13);

   public GeneralMacroToggle() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 60640012667504L;
      super("General Macro Toggle", "Toggles the last used macro.", ModuleCategory.GENERAL, "General");
   }

   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
      long param0
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var0, long var1
   ) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var10001 = var1 ^ 139276550770875L;
      int var3 = (int)((var1 ^ 139276550770875L) >>> 56);
      int var4 = (int)((var1 ^ 139276550770875L) << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      boolean var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3228680148802635306L, var1
      );
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
      boolean var6 = var10000;

      label24: {
         label23: {
            label22: {
               try {
                  var9 = IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  var10 = var0;
                  if (!var6) {
                     break label23;
                  }

                  if (var0 == null) {
                     break label22;
                  }
               } catch (MatchException var7) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var7, 3264572169419895075L, var1
                  );
               }

               var10 = var0;
               break label23;
            }

            var11 = null;
            break label24;
         }

         var11 = var10.getNameProperty();
      }

      var9.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11, (byte)var3, var4, var5);
   }

   public static llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, boolean param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param0, boolean param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var1) {
   }

   @Override
   public void IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl() {
   }

   @Override
   public void IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(long var1) {
      long var3 = var1 ^ 136404640792295L;
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, true);
   }

   static {
      long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 103681154769890L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "kr\u0088})QPºñ÷\u0081xóáOè OÏÎâ)Â\u0019\u0016X`6\u0098£\u0012T¦\u0002ÚÀVô,s\u0016Jµ\u0001»Mú\u00ad½@ÎÈx\\F\u0014\u00104»[\u0087\u008a\u0083dÞ\\*Ä\u009bFÃ2¿Ù×wQ¹\u0097\u0094ó\u0089\u0088½U\u0012H:ú5\u000b\u001d\bZ:\u0097Z¬Æ¢\u0085.F¾÷L\u0019G½\u008fû\u0092\t% \u0089¾êü\u001b\u0091O\u008b\u0087\u00adµx\u001cÔ\u001cè\u008c}ô\u008e\u001fySÖ]oº¾(\u0012¤\u00ad \u0017\u0083ÔõG×î\f\u001b\"\u009ft\u0010Î\u0001|Ð\u001eÇ$ZíÈÅI4Rþïïÿ\u009c\u0010\u0085\u0011\u009bD´ªGAÅ\u0088.aúm\u008b\u008b(&÷JUë00æÑyWQ%j13Áþùó \u0095¹T\u000bqmæF\u0002í»NÿWØ\u0084\u0017ód@MõÁ995\u0012sEwÞ\u00adPÓ`¥Oê\\\u009b\u001dþAWüÜU/¹ø\u0092\u00adöÐ~\u008bç\u0090\n\"\u0004\u0081¤âß©û>5³<ÂvV+?ñ\u0083\u001b\t½\u0095£d89jÉ6\u0018|E{>ö\u001fU#\u0004±¡¯\u0016øx\u0092ú3GüHÍ\u009a\u0015\u008b«\u0088êjñÈÂ&3×Íàýö~ÜdZFÏ\u0000\u0087@\u0015´n8\u0084WÇ9·NÜç /Wµ=_VÈ\u0091\u001aCÊ\u0014a\u000fûºÊ }í¤T\u0099n\rüý-Z\\\u0011\u001eÕá±î\u0001Ä\u0011\u0016¡d\u001e\u0004S\u0012\u001a\u0018Æ\u0081Ñ±þ\u0099\u0000SIdKA\u0001\u00130?zz\u0095ëj0\u000f\u0097\u0018\u0000¿qLÏx\u0085\u001e\u0015Ç¢ìßß\u0086åË¡c\u0005$teu\u0018ÛÚ°D\u000e\u0087\u008c\u0014QZv\u0085\u0017ËçöØÚ}A½\u0013\u001e\u001d\u0010s\u0098ë\u0004\u00951\u0081\u0096^~\u0096vÜ\u009e\u0081Î\u0010êÏúe&ý\r\u0007Àü'¨Ég\u0018X \u0086ìt\u00999°\u0006CÚ\f9qw\u001f¼^o\u008dè\u000058É-4Å¬(\u0014ºMÒ";
      int var8 = "kr\u0088})QPºñ÷\u0081xóáOè OÏÎâ)Â\u0019\u0016X`6\u0098£\u0012T¦\u0002ÚÀVô,s\u0016Jµ\u0001»Mú\u00ad½@ÎÈx\\F\u0014\u00104»[\u0087\u008a\u0083dÞ\\*Ä\u009bFÃ2¿Ù×wQ¹\u0097\u0094ó\u0089\u0088½U\u0012H:ú5\u000b\u001d\bZ:\u0097Z¬Æ¢\u0085.F¾÷L\u0019G½\u008fû\u0092\t% \u0089¾êü\u001b\u0091O\u008b\u0087\u00adµx\u001cÔ\u001cè\u008c}ô\u008e\u001fySÖ]oº¾(\u0012¤\u00ad \u0017\u0083ÔõG×î\f\u001b\"\u009ft\u0010Î\u0001|Ð\u001eÇ$ZíÈÅI4Rþïïÿ\u009c\u0010\u0085\u0011\u009bD´ªGAÅ\u0088.aúm\u008b\u008b(&÷JUë00æÑyWQ%j13Áþùó \u0095¹T\u000bqmæF\u0002í»NÿWØ\u0084\u0017ód@MõÁ995\u0012sEwÞ\u00adPÓ`¥Oê\\\u009b\u001dþAWüÜU/¹ø\u0092\u00adöÐ~\u008bç\u0090\n\"\u0004\u0081¤âß©û>5³<ÂvV+?ñ\u0083\u001b\t½\u0095£d89jÉ6\u0018|E{>ö\u001fU#\u0004±¡¯\u0016øx\u0092ú3GüHÍ\u009a\u0015\u008b«\u0088êjñÈÂ&3×Íàýö~ÜdZFÏ\u0000\u0087@\u0015´n8\u0084WÇ9·NÜç /Wµ=_VÈ\u0091\u001aCÊ\u0014a\u000fûºÊ }í¤T\u0099n\rüý-Z\\\u0011\u001eÕá±î\u0001Ä\u0011\u0016¡d\u001e\u0004S\u0012\u001a\u0018Æ\u0081Ñ±þ\u0099\u0000SIdKA\u0001\u00130?zz\u0095ëj0\u000f\u0097\u0018\u0000¿qLÏx\u0085\u001e\u0015Ç¢ìßß\u0086åË¡c\u0005$teu\u0018ÛÚ°D\u000e\u0087\u008c\u0014QZv\u0085\u0017ËçöØÚ}A½\u0013\u001e\u001d\u0010s\u0098ë\u0004\u00951\u0081\u0096^~\u0096vÜ\u009e\u0081Î\u0010êÏúe&ý\r\u0007Àü'¨Ég\u0018X \u0086ìt\u00999°\u0006CÚ\f9qw\u001f¼^o\u008dè\u000058É-4Å¬(\u0014ºMÒ"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "ÚÊgI\u0096áÜZ¾\u008c\"Ä\u009el}tB-\u0085Lê\u0016¼¯\u0019\u008eÖ\u0083X¢e\u0092\u0010(t\u00835\u0086]\nz£\u0010jÌëÑ\u0090g";
            var8 = "ÚÊgI\u0096áÜZ¾\u008c\"Ä\u009el}tB-\u0085Lê\u0016¼¯\u0019\u008eÖ\u0083X¢e\u0092\u0010(t\u00835\u0086]\nz£\u0010jÌëÑ\u0090g".length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new String[18];
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static MatchException llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27354;
      if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/misc/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI", var10
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
         byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5];
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
            "me/octo/client/modules/impl/features/misc/llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
