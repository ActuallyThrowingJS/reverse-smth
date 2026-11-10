package me.octo.client.modules.impl.features.qol;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import org.jetbrains.annotations.NotNull;

public final class ReactionRecorder extends BooleanModule {
   @NotNull
   public static IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private final List<IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static ReactionRecorder IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 140496807589597L;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static Map IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new HashMap(13);

   private ReactionRecorder() {
      long var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 49726375859460L;
      super("Reaction Recorder", "Records full reaction patterns (rotations + movement) for analysis", ModuleCategory.QOL, "Dev Modules");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ArrayList<>();
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 54873233921261L;
      long var5 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var5);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.clear();
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = System.nanoTime();
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"q">(5728, 4109825144282234477L ^ var1), var3
      );
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"q">(10078, 3761884123772817238L ^ var1), var3
      );
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 28218323986076L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[30];
      int var7 = 0;
      String var6 = "äÊ\u001fìg\u009b\u0091]L+mhª\nãA¼õ«#ugü\u0088\u0013\u0093\u0085\u0011î©A¡1ì\u00957\r[Ò%2´giæ¯¢ÛÇuÎLæ\u0083®l y\u0082\u0005±ÈÜs\u008bÈ\u0012Òö\u0087U\u001dùFâvd\u001f»¨\u000f\u001e\u008e\u007fî\u0017Å\u009eã\u0010¾Bö\u0091c\u008fF\u0016\u001ao1\u0019D\u0019XÀ0ÿ\"÷\u0015\u0002i«èYføA§+±ÑrÄ\u0004Ð³üAàJÈ\býîÕÆë/½3$a0\u0094 ÀË#\u0098rG»\u0097\u0018LË³\u0096l©=d\f!+\u001e\u0013-È1\u0002\u0002[Ï;Úë\u008c@0WÌ¸¯³ ñP\u001bÖ³\u001fÕ¾.fXÆb\u007f9YòA\u0096rÆßG\u008a}Bäõ\u008c\u0001g\t¦\u0090\u0090GJ>%©\u0016\u009eo\u0081\u0000¸\u0018\u008b-\\\u001bx\u0018a(Hó\u0010]I£¼çºmÞ²Ø°,Ã\u001f¡µ\u0010\u008eÂGæZ\fmÀÏ\u0095åIzG\u0087&\u0010\u00aduÃ\u0016«\u0087\u0004\u0010Ê(\u0096'Ïú\u009cç(êÓ4&³\u0082çÝ\u0016\u009f\u0097¦æ\u007fþê\u0084\u009açPtóç·4W\u009bP\u0004è%¿\u0099Ê}Kº\u0090¶l\u0018)þ0cè;\u0099uE1Óç\u000fS\\á{¨\u0093\u0093½ÄÓì\u0010FñJç|>\u0089m\u0085\u000f\u0001\u009dT\u009e\u0090A\u0010q;¸<°\u009c\"#ñ íJ\\Ç¿\u0019 \u0013ñgØÀu)[8>\u009e\u0003*\u0005Þ?¹½ï\u0012jØ2®\u0003\u0093ËkkÌ9\u0092\u0010-êw*\u009bâõ.ª'^ÁÊHà\u007f\u00109áÞ²è\u0016\u0019qïë\u001a\tgB!S\u00109í7U@¤'TZ\u0096í\u0007\u0014ó©d\u0010\u0082·¬J\u009cm´Ëæ¿$9\u009bÆ\u0085\u0015(ÙD\u0005=\tU¢¸²\u0091ìõ§ªÎ\u000b\u009eA\t\u00ad¬\u008f\u00803\u0082rÏ\u001a\u00ad\u0096þÁ7Çlê\bbêÍ\u0018\u0091îÈz,wt\u0093\u0099Jþ\u0005\u001cJ#\t\u0085å$×Ø\nHQ g<\u0096í`¼&Õþ}þ~C \u0088®2x\u0080m\u008eáµ\\O_^¡\u0005`0Þ D\u001dHýÀãÌ\u009c(n\u0082\u0095eÊ5ÄT¢R°5DÊAv\u001d+\u0081fma\u0003\u0010\u0001\u009bÅ\u000bÍm\u008b× Å\u0014 f\u00922\u009b(gÝà76\u009f\u0016\u009c\u00061Æ_X\u0087\u0080tÕ\n¹Ç²²y\u0086oÝÆ{\tEùW\u0089x6\u001a\u0005ZùPp£Ap\u00ad\u001f\u0012\u0005\u0019vï¤\u001bkt\u0000\u0098r\u00adýáÎ\u009fáZ@?Ü\u00972õã»\u008a{Ë\u0088î\u0082{\u0013\u0080âL²\u000eÌß£\u0010|Q\u0015ðÆÄÞðFø\u009d\r®K1\u009c1\u0006\u009f9©yÖ¿\u0090\u0096rÁ|Ài:}\u0015ÿ\u000eEÞÉF ÷9áûÛæ-\u0094Àõ¹\u0092D\u0095´Å ²+\u0013¿\u00ad\u0018Yo\u0091&AW\u0098`t¡Æ²TZ\u0094\u0088¥ìa«ÁKð\u0082 fÜ\u008dåï;Ý\u0097\u0013\u0089ç\u0005¿b\u0010,WqyNfb&\u0091\t\u0089\u009f%a¬ú\u008e <kwH>Ó'Ì_KBÆùE \u0004Ø±\u00936°x\u000e&²²³fN[y/";
      int var8 = "äÊ\u001fìg\u009b\u0091]L+mhª\nãA¼õ«#ugü\u0088\u0013\u0093\u0085\u0011î©A¡1ì\u00957\r[Ò%2´giæ¯¢ÛÇuÎLæ\u0083®l y\u0082\u0005±ÈÜs\u008bÈ\u0012Òö\u0087U\u001dùFâvd\u001f»¨\u000f\u001e\u008e\u007fî\u0017Å\u009eã\u0010¾Bö\u0091c\u008fF\u0016\u001ao1\u0019D\u0019XÀ0ÿ\"÷\u0015\u0002i«èYføA§+±ÑrÄ\u0004Ð³üAàJÈ\býîÕÆë/½3$a0\u0094 ÀË#\u0098rG»\u0097\u0018LË³\u0096l©=d\f!+\u001e\u0013-È1\u0002\u0002[Ï;Úë\u008c@0WÌ¸¯³ ñP\u001bÖ³\u001fÕ¾.fXÆb\u007f9YòA\u0096rÆßG\u008a}Bäõ\u008c\u0001g\t¦\u0090\u0090GJ>%©\u0016\u009eo\u0081\u0000¸\u0018\u008b-\\\u001bx\u0018a(Hó\u0010]I£¼çºmÞ²Ø°,Ã\u001f¡µ\u0010\u008eÂGæZ\fmÀÏ\u0095åIzG\u0087&\u0010\u00aduÃ\u0016«\u0087\u0004\u0010Ê(\u0096'Ïú\u009cç(êÓ4&³\u0082çÝ\u0016\u009f\u0097¦æ\u007fþê\u0084\u009açPtóç·4W\u009bP\u0004è%¿\u0099Ê}Kº\u0090¶l\u0018)þ0cè;\u0099uE1Óç\u000fS\\á{¨\u0093\u0093½ÄÓì\u0010FñJç|>\u0089m\u0085\u000f\u0001\u009dT\u009e\u0090A\u0010q;¸<°\u009c\"#ñ íJ\\Ç¿\u0019 \u0013ñgØÀu)[8>\u009e\u0003*\u0005Þ?¹½ï\u0012jØ2®\u0003\u0093ËkkÌ9\u0092\u0010-êw*\u009bâõ.ª'^ÁÊHà\u007f\u00109áÞ²è\u0016\u0019qïë\u001a\tgB!S\u00109í7U@¤'TZ\u0096í\u0007\u0014ó©d\u0010\u0082·¬J\u009cm´Ëæ¿$9\u009bÆ\u0085\u0015(ÙD\u0005=\tU¢¸²\u0091ìõ§ªÎ\u000b\u009eA\t\u00ad¬\u008f\u00803\u0082rÏ\u001a\u00ad\u0096þÁ7Çlê\bbêÍ\u0018\u0091îÈz,wt\u0093\u0099Jþ\u0005\u001cJ#\t\u0085å$×Ø\nHQ g<\u0096í`¼&Õþ}þ~C \u0088®2x\u0080m\u008eáµ\\O_^¡\u0005`0Þ D\u001dHýÀãÌ\u009c(n\u0082\u0095eÊ5ÄT¢R°5DÊAv\u001d+\u0081fma\u0003\u0010\u0001\u009bÅ\u000bÍm\u008b× Å\u0014 f\u00922\u009b(gÝà76\u009f\u0016\u009c\u00061Æ_X\u0087\u0080tÕ\n¹Ç²²y\u0086oÝÆ{\tEùW\u0089x6\u001a\u0005ZùPp£Ap\u00ad\u001f\u0012\u0005\u0019vï¤\u001bkt\u0000\u0098r\u00adýáÎ\u009fáZ@?Ü\u00972õã»\u008a{Ë\u0088î\u0082{\u0013\u0080âL²\u000eÌß£\u0010|Q\u0015ðÆÄÞðFø\u009d\r®K1\u009c1\u0006\u009f9©yÖ¿\u0090\u0096rÁ|Ài:}\u0015ÿ\u000eEÞÉF ÷9áûÛæ-\u0094Àõ¹\u0092D\u0095´Å ²+\u0013¿\u00ad\u0018Yo\u0091&AW\u0098`t¡Æ²TZ\u0094\u0088¥ìa«ÁKð\u0082 fÜ\u008dåï;Ý\u0097\u0013\u0089ç\u0005¿b\u0010,WqyNfb&\u0091\t\u0089\u009f%a¬ú\u008e <kwH>Ó'Ì_KBÆùE \u0004Ø±\u00936°x\u000e&²²³fN[y/"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var9;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new String[30];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ReactionRecorder();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "ýö%Æ\"UeÃ;(\u008c\u0097\u009bUè§Ø\u009dYO1`b¶ß/¬\u0013MªÎ¨\u0010èçúQ\u0003Æ\u0000¢\u0003Õ<Ë\u0015B\u0010\u0017";
                  var8 = "ýö%Æ\"UeÃ;(\u008c\u0097\u009bUè§Ø\u009dYO1`b¶ß/¬\u0013MªÎ¨\u0010èçúQ\u0003Æ\u0000¢\u0003Õ<Ë\u0015B\u0010\u0017".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10924;
      if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/qol/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI", var10
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
         byte[] var9 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5].getBytes("ISO-8859-1");
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5];
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
            "me/octo/client/modules/impl/features/qol/IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
