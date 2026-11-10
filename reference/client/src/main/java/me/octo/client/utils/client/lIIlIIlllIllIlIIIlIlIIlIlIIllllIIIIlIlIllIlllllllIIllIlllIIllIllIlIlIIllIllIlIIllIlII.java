package me.octo.client.utils.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Pattern lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Pattern IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Map<String, Integer> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 114298631639885L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
   }

   public final long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   private final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte var1, int var2, String var3, int var4) {
      long var5 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var4 << 40 >>> 40)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 46799850621417L;

      try {
         if (!me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
            var7
         )) {
            return null;
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -2001324974960843017L, var5
         );
      }

      Map var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10001 = var3.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(12332, 3012607620699013751L ^ var5)
      );
      return (Integer)var10000.get(var10001);
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var16 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 37702654788226L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[39];
      int var12 = 0;
      String var11 = "%\u008füäùááØ\u0002~èUê8aÇ\u0096Mï¨yT\u000fV\u0010Iu\u0081JV\u0001[¨+áTø \u0003:ð s¸\u009d&FúÒ²,\u009c+ø@Ì|á¦Ç]\u0083Ñ\u008a\u0017þË?ÑëÆ\u001eýG(AuÜðw9ü\u008a[\u000e\u0099â\u0081¢!\u001a\u009aò\u0007\u0013 \u00823°\u001c°¾@\u008bö<âM+s\u0016\u0090Äc\u000e ¿ú\u0011Ç\u0010t|ä\u0018Çú4Hÿ\u0006þ\u0094\u0097¤VÂ\u0096®ô¦\u0002ùx\u009e%\u00ad§(\u0019fÿ¬\u0018u\u0081fÉËÂUÝ\u008fÛ{;g\u0004=º\u0010àT'hInù%²Ð²D>j&;ª0 @ÐÁÔù~Ljz)5É\u001a\u001aàkûøÒº\u0080\u009e\u008e\u008crvyRÒ:ò+(\u0010E/Úä¶Õ\u0090øi¹L\u008c¤´C½\u0085å#§Ìð\u0087\fR\u0086»r2\u0003\u0085Û\u0086÷oï0×Q\u0018»à1\u009d\u009f1\u0001\u0080]3ýk\u0082ßé4\u0019¨òå\u0083`>Ú(×·ÀîõMý\u0091\u0010âÄ!\bx\rc2ñÑï\u00991Â4é\u009eÍi\u000b\u0017¡@Èåö9¯D\u0084·H\u000f½\u0003À\u0089\t»¸s¬±*Ìâ\u0097¾»$AáU\u0002ÿ¯\u009c©Ìëí;\u0094Ô\u000e'ÐÀÑì8\fâ¹¶;¦Pü\u001a\u008e 8iâ¡Ðñ\u009cÌw4£o\u0001¿£¿=\u000f²\u0001ÝE\u0018´){\u0011\u008bõXÙ¿¹Â°|\u009ak\u0010\rb;ù\u0014\u0081ª»(7ÒDö.vÛÅ\u0089\u0003\u008c-\u0093\u0005O~\u001e\u0090¯ÀÀ\u0001@ØQØ\u007f\r«\u001b \u0093&ÜÍjyQÍØ(³ð\u0088Õº:\u0095/71Û\\ëd\\\u001bÑU\u0081ºpo\u0088ù\u001b-\u0006`0ôâ£7\u0080¡À\u0085\u0002áP \u000b4;\u001f\u0014\u0007¡8B®¾µìü\u0087\u001aÁ²\u001cí\nÑ\u001aÎõn¯|7öÞ\u0002\u0010\u0088èòQk\u007f*\u009bd\t8ÔVW*\u008a\u0010\u0081ÅRxG'U^\rº.h\u007fAÓ*(\u0019`\u0016\u008eÂæÊôãç3Ë\u0093dÓ*8z±¸\u0004\u0004È6²¹Ûºß ò!ó2\u0015ù=h¬»\u0018Hu)¼g2£O\bv\u009fCyÌ`Föf^©UkØ.(ÍC\u0095Ì^\rÓnëcY\u009a:\u0086_ûê\u001cï\u0099\t¡L\u0090\u0087ÜÈ\u0087\u009f\u0015\u008d\u0019oA\u008cÁ¸\u009e*\u0010(\u008fóÕ\u0088A\u0017 Í[»\näÎ¦º8»º\u008dK°\u001c./\u001c\u008eì\u001d\u008d±·JUL'iý\u008b\u001a\u0080\u0010[§\u001cêHeIÞ«×ççù\u00142\u009c(¬ª\u0085Öîóì\u0018\u0004\u008fÀ@\u001fú\u0089{Wk¹Y¹KZ!sË\u008cö¸Ê[µûìÁ(Rü\u0089ô\u0018¸¿6ø$\u000b\u007fÎMþ\u0094\u0012Óo\u0018Ë^\u008dEWË§hF\u0018\u00842RÖ:2S°Dç\\\u0081¼\u0016QLè\u0015W\u008e!<¶\u0085\u0018mw\u0019m\u0083jò°\u0019ð\u0015MG;å\u0097ì*\u0088\u0081~\u0099\u009cv(\u001e\u0088e¡du=ªéFÀØâr»××ÙF©æ#°[h\u008dE°{æ\u0011\"\u0088\u0007×:¥Âèú(3\u0081OÚå\u001aocÃDþ4@ß\u000b±¾ö^òçâ¾\u0092k¥Í Wþ`lØôf»v¯\u0089\u009d \u008c\u00ad³z]©Ñ\u0085\u008aB\u007f\u0016ð\u0094y/\u008c\u0097Þ»,3<\u0087QO\u0091j7|}ß\u0018\u008bÑ\u0000yÞ¤ç}<Û\"{´©eÒ\u0099:vZ\u008cöP\u001e\u0018ÊZ\u001eZ±¾Õ\u001bN\u0081Hx\u009cmyÌ0´kó\u00adT\u0007!\u0018ÅáYýë¬Û\u008a¡DHy³+\u009831\u009e.\u008c\u0012ø\u008aa\u0010\u001eÑ¢âÕÉbç]]Ò·RÃÇ\u0004\u0018¬ddi\u0094ÑQ\fÒk@UÇ\u009e\nÍ3h¬SG\u0006\u0002((¼P\u0011\u009a\u001a}@\ra\u0004\u0094\u0098\u0085¦4v1\u0093ìG\u0000ËÎÛñÖBÙOÌO\u0099(\u001e`Ål§ú+\u0018jW\u0017\u0096É\tZ\"c\u0005]Þ,÷ùjP]\u009c.¹\u0094;\u0007(;ðQ»L\u0004\u0089{p#\u008fãÈÓ'¾¦êäÓ\\õsz+¾$\u009f\u0003¯+\u0095¾¥ÆO\u001cW®T";
      int var13 = "%\u008füäùááØ\u0002~èUê8aÇ\u0096Mï¨yT\u000fV\u0010Iu\u0081JV\u0001[¨+áTø \u0003:ð s¸\u009d&FúÒ²,\u009c+ø@Ì|á¦Ç]\u0083Ñ\u008a\u0017þË?ÑëÆ\u001eýG(AuÜðw9ü\u008a[\u000e\u0099â\u0081¢!\u001a\u009aò\u0007\u0013 \u00823°\u001c°¾@\u008bö<âM+s\u0016\u0090Äc\u000e ¿ú\u0011Ç\u0010t|ä\u0018Çú4Hÿ\u0006þ\u0094\u0097¤VÂ\u0096®ô¦\u0002ùx\u009e%\u00ad§(\u0019fÿ¬\u0018u\u0081fÉËÂUÝ\u008fÛ{;g\u0004=º\u0010àT'hInù%²Ð²D>j&;ª0 @ÐÁÔù~Ljz)5É\u001a\u001aàkûøÒº\u0080\u009e\u008e\u008crvyRÒ:ò+(\u0010E/Úä¶Õ\u0090øi¹L\u008c¤´C½\u0085å#§Ìð\u0087\fR\u0086»r2\u0003\u0085Û\u0086÷oï0×Q\u0018»à1\u009d\u009f1\u0001\u0080]3ýk\u0082ßé4\u0019¨òå\u0083`>Ú(×·ÀîõMý\u0091\u0010âÄ!\bx\rc2ñÑï\u00991Â4é\u009eÍi\u000b\u0017¡@Èåö9¯D\u0084·H\u000f½\u0003À\u0089\t»¸s¬±*Ìâ\u0097¾»$AáU\u0002ÿ¯\u009c©Ìëí;\u0094Ô\u000e'ÐÀÑì8\fâ¹¶;¦Pü\u001a\u008e 8iâ¡Ðñ\u009cÌw4£o\u0001¿£¿=\u000f²\u0001ÝE\u0018´){\u0011\u008bõXÙ¿¹Â°|\u009ak\u0010\rb;ù\u0014\u0081ª»(7ÒDö.vÛÅ\u0089\u0003\u008c-\u0093\u0005O~\u001e\u0090¯ÀÀ\u0001@ØQØ\u007f\r«\u001b \u0093&ÜÍjyQÍØ(³ð\u0088Õº:\u0095/71Û\\ëd\\\u001bÑU\u0081ºpo\u0088ù\u001b-\u0006`0ôâ£7\u0080¡À\u0085\u0002áP \u000b4;\u001f\u0014\u0007¡8B®¾µìü\u0087\u001aÁ²\u001cí\nÑ\u001aÎõn¯|7öÞ\u0002\u0010\u0088èòQk\u007f*\u009bd\t8ÔVW*\u008a\u0010\u0081ÅRxG'U^\rº.h\u007fAÓ*(\u0019`\u0016\u008eÂæÊôãç3Ë\u0093dÓ*8z±¸\u0004\u0004È6²¹Ûºß ò!ó2\u0015ù=h¬»\u0018Hu)¼g2£O\bv\u009fCyÌ`Föf^©UkØ.(ÍC\u0095Ì^\rÓnëcY\u009a:\u0086_ûê\u001cï\u0099\t¡L\u0090\u0087ÜÈ\u0087\u009f\u0015\u008d\u0019oA\u008cÁ¸\u009e*\u0010(\u008fóÕ\u0088A\u0017 Í[»\näÎ¦º8»º\u008dK°\u001c./\u001c\u008eì\u001d\u008d±·JUL'iý\u008b\u001a\u0080\u0010[§\u001cêHeIÞ«×ççù\u00142\u009c(¬ª\u0085Öîóì\u0018\u0004\u008fÀ@\u001fú\u0089{Wk¹Y¹KZ!sË\u008cö¸Ê[µûìÁ(Rü\u0089ô\u0018¸¿6ø$\u000b\u007fÎMþ\u0094\u0012Óo\u0018Ë^\u008dEWË§hF\u0018\u00842RÖ:2S°Dç\\\u0081¼\u0016QLè\u0015W\u008e!<¶\u0085\u0018mw\u0019m\u0083jò°\u0019ð\u0015MG;å\u0097ì*\u0088\u0081~\u0099\u009cv(\u001e\u0088e¡du=ªéFÀØâr»××ÙF©æ#°[h\u008dE°{æ\u0011\"\u0088\u0007×:¥Âèú(3\u0081OÚå\u001aocÃDþ4@ß\u000b±¾ö^òçâ¾\u0092k¥Í Wþ`lØôf»v¯\u0089\u009d \u008c\u00ad³z]©Ñ\u0085\u008aB\u007f\u0016ð\u0094y/\u008c\u0097Þ»,3<\u0087QO\u0091j7|}ß\u0018\u008bÑ\u0000yÞ¤ç}<Û\"{´©eÒ\u0099:vZ\u008cöP\u001e\u0018ÊZ\u001eZ±¾Õ\u001bN\u0081Hx\u009cmyÌ0´kó\u00adT\u0007!\u0018ÅáYýë¬Û\u008a¡DHy³+\u009831\u009e.\u008c\u0012ø\u008aa\u0010\u001eÑ¢âÕÉbç]]Ò·RÃÇ\u0004\u0018¬ddi\u0094ÑQ\fÒk@UÇ\u009e\nÍ3h¬SG\u0006\u0002((¼P\u0011\u009a\u001a}@\ra\u0004\u0094\u0098\u0085¦4v1\u0093ìG\u0000ËÎÛñÖBÙOÌO\u0099(\u001e`Ål§ú+\u0018jW\u0017\u0096É\tZ\"c\u0005]Þ,÷ùjP]\u009c.¹\u0094;\u0007(;ðQ»L\u0004\u0089{p#\u008fãÈÓ'¾¦êäÓ\\õsz+¾$\u009f\u0003¯+\u0095¾¥ÆO\u001cW®T"
         .length();
      char var10 = '\u0018';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var31 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var31;
         if ((var9 += var10) >= var13) {
            var11 = "Dí±\u008b#\b,3I_+k\u0016{OÌY\u0007\u0018JïÄ\u0001¦+\u000b\u000eµ\u0086\"\u0019Ñ ³x9O\u0011Í$®\u0000¶í¨(U(:½n\u0093¡Ñ\\1´r\u0086ä´Ù.l¨";
            var13 = "Dí±\u008b#\b,3I_+k\u0016{OÌY\u0007\u0018JïÄ\u0001¦+\u000b\u000eµ\u0086\"\u0019Ñ ³x9O\u0011Í$®\u0000¶í¨(U(:½n\u0093¡Ñ\\1´r\u0086ä´Ù.l¨"
               .length();
            var10 = ' ';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var28 = 0;
               var14[var12++] = var33;
               if ((var9 += var10) >= var13) {
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var14;
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[39];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 3060592607583388606L;
                  byte[] var6 = var2.doFinal(
                     new byte[]{
                        (byte)(var4 >>> 56),
                        (byte)(var4 >>> 48),
                        (byte)(var4 >>> 40),
                        (byte)(var4 >>> 32),
                        (byte)(var4 >>> 24),
                        (byte)(var4 >>> 16),
                        (byte)(var4 >>> 8),
                        (byte)var4
                     }
                  );
                  long var36 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var28 = -1;
                  long var0 = var36;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var0;
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = Pattern.compile(
                     "You found .* Flawed (.+) Gemstone x(\\d+)!"
                  );
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Pattern.compile("You found an (.+)!");
                  Pair[] var18 = new Pair[]{
                     TuplesKt.to("mithril", 8),
                     TuplesKt.to("enchanted mithril", 1280),
                     TuplesKt.to("titanium", 20),
                     TuplesKt.to("enchanted titanium", 3200),
                     TuplesKt.to("cobblestone", 1),
                     TuplesKt.to("enchanted cobblestone", 160),
                     TuplesKt.to("tungsten", 60),
                     TuplesKt.to("enchanted tungsten", 9600),
                     TuplesKt.to("umber", 60),
                     TuplesKt.to("enchanted umber", 9600),
                     TuplesKt.to("gold ingot", 3),
                     TuplesKt.to("enchanted gold", 480),
                     TuplesKt.to("iron ingot", 3),
                     TuplesKt.to("enchanted iron", 480),
                     TuplesKt.to("coal", 7),
                     TuplesKt.to("enchanted coal", 1250),
                     TuplesKt.to("diamond", 9),
                     TuplesKt.to("enchanted diamond", 1340),
                     TuplesKt.to("lapis lazuli", 4),
                     TuplesKt.to("enchanted lapis lazuli", 700),
                     TuplesKt.to("emerald", 10),
                     TuplesKt.to("enchanted emerald", 1050),
                     TuplesKt.to("redstone", 5),
                     TuplesKt.to("enchanted redstone", 834),
                     TuplesKt.to("obsidian", 14),
                     TuplesKt.to("enchanted obsidian", 2300),
                     TuplesKt.to("end stone", 2),
                     TuplesKt.to("enchanted end stone", 320),
                     TuplesKt.to("nether quartz", 7),
                     TuplesKt.to("enchanted nether quartz", 1032)
                  };
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = MapsKt.mapOf(var18);
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5439;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/client/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII", var10
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
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
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
            "me/octo/client/utils/client/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0e8b673e3fe8e286(
      byte var1, int var2, String var3, int var4
   ) {
      var1 = 0;
      var2 = 4131365;
      var4 = 12039181;
      long var5 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var4 << 40 >>> 40)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      long var7 = var5 ^ 46799850621417L;

      try {
         if (!me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI$recovered$cb45cbd332286064(
            var7
         )) {
            return null;
         }
      } catch (MatchException var10) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10);
      }

      Map var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10001 = var3.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10001, "toLowerCase(...)");
      return (Integer)var10000.get(var10001);
   }
}
