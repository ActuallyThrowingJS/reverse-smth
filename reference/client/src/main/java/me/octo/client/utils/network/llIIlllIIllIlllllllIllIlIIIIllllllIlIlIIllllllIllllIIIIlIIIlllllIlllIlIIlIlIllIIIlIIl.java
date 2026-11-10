package me.octo.client.utils.network;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
import org.jetbrains.annotations.NotNull;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static volatile long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 107557792176659L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);
   private static long[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Long[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Map lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var0, @NotNull String var1, long var2
   ) {
      var2 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var2;
      long var10001 = var2 ^ 35395119987952L;
      int var4 = (int)((var2 ^ 35395119987952L) >>> 48);
      int var5 = (int)((var2 ^ 35395119987952L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 88016354311326L;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(3202, 3393090799631669029L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(10496, 1738402623421821615L ^ var2)
      );
      String var9 = StringsKt.trim(var0).toString();
      String var10000 = UUID.randomUUID().toString();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(31089, 9082793160611455711L ^ var2)
      );
      String var10 = var10000;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
            (short)var4,
            var5,
            (char)var6
         );
   }

   @JvmStatic
   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String param0, String param1, String param2, long param3, short param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      String param1, String param2, String param3, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, int param2, short param3, String param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      String var0, long var1, String var3, String var4
   ) {
      return Unit.INSTANCE;
   }

   static {
      long var18 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 40392975695742L;
      Cipher var20;
      Cipher var10000 = var20 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var21 = 1; var21 < 8; var21++) {
         var10003[var21] = (byte)(var18 << var21 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var27 = new String[47];
      int var25 = 0;
      String var24 = "\u008e\u0080$EôÎ;m\u009ed¶âÇ\t\u000fX\u0018në¹.Èì]0bð\u0004À7\u001ce\u0081ëx¤îrÏ\"åp\u0082dÛ\"¨\u0016Ï\u0005Þ¿=A\f\u0016<Æ\u0081¡ñqìZÛ5nQäîâ3¸\u0092ÇýÅ\u0002]\t@&iå\u001e§ñÒÓD\u0000±®·\u0011N#\nÿ\u0016Øîj`EÆÅyt^\u009dÎ(C\u009c\fý½\n&²IÆu[O±\u0088í3Î,4X\u0001å\u0086Þ\u009b{°\u000bcp\u0087á\u00904%ô¶0«fP\u0081UlxÏ\u008dÓw\u0097ªbqkþ¥\u0002\u0002á¶ãýP\u0015?ªi;µ\u001e`í \f5-3ïmi\u0084\u0002Xú3']å@çX¼r¾Ds\u00144}\f0Äå\u0081³\u009c°©Ý\u008dõ\u0081\u0018v\u009fùë\"Ò\u0086A\u0010;/1sd^\u0000ý\u0092\u00911\u0017&N\u0096\u0090Xfõ$\u0006;Âg\r½lB\u0005²m»Ê¨tÑî\u0014C\u008bÎ\u0017o=ÿVûÔ\u001c\u0019¢NÄULn(=\u00ad+-\u009c£ØÀ·ÒfÜP\u0003¨\u0017O:ô?\u0011Ù¦ôN\u0087\u000füNÈD\u0090÷BÉo44R¤\u0085U6f½\u0011\u0096F\u0010\u0006Þ-\u0004Vø\u0096ÊgRùþjG\"\u0080\u0010\u008d\"úªT!äd¼«\u0002ÀJ|ò\u0085 p\u009e:éþìP\u0086\u0001|ên\u0007Åßo\u0007\u0080ä¾Ù{¨1d\u0007p\u001eKme\u009a\u0010\u0003*g!ªm§¾v\u0098A\u0015)\u0095üªPb§Ó=l\u001b\u0013\u0088®í\u009fxéâ\u0093ðÒó²ëºq\u0013ôµe*~\u0018Z8'\u0087®\u0001ÐI2\u0085\u0013n<²\u0013\u0084¶©í9\u0012Õ\u0080§Ë\u0004--?\u009a\u0084W\ngÀ÷!&0é\u0016¦ï\rº#òén\u001fKPa¥]\u0086oBb\u0083\u000f\u001dª\bñ_¾%\u008dDè\u0084\u00172`¿f\u0092\réA?Ø\u008aÑ¤7Åú\u008fÍä-5\u008c\u0010ù¤3«á|sí>%\u009f\u0017QÁA7÷Ü2n>ï\u0003Â¦\u008f;\u0004>`Í\u009eúôÓE\u0010D6&\u001ab\bMXÂìDIù@\u0006í ë\r\u0004C\u0015VFôÚ)\u0010:~ÛFü«üD`¸BU\u0004\u0012Uä\u0088\u0011\u0002¾2\u0018\u0012íyÒ#èäoº\u00836ã\u0004\u0081ê¸kR®¼¯r]õ è\u001a¹0\u0005·*W\u000e4*\u0010Òë\u0094\u0090r\u0018\u0092\u000b\u007f_åcCØ×wiX\u0088;\u0018\u0014®×º\u000e´õk£×¨ï\u0098íï{ÉU\u0099Gy6dÊ\u0010`*âÆ\r\u00913ñ\u00ad¸\u000fWx(sü\u0010\u000bÂQI|ö/ù¬%\u008fã!Dú¢X\u009eÝj,T\u001c$Ù¤p]»Ãæ§cø\u0019óû\u0001 kÏ$Ï\u0015Dc\byÂ8ÊèCÐ\u0090¶_5\u001fum\u0000\u008aIÇ½\u001e\u0010Å¹½Úf9Ëî\u0018è\u001cX8Ý\u001e\r3\u0090«Ëôô\u0083\u009bÕXyÞC8Xf3ì\u001eC5\u0010^\u008f'÷ÉþÆ\bçR\u000fmo\u0019³ë PÇPoQÃ+¦½\u0080+¨÷\u0098\u0003oÉs\u0098ì¾'QõDüD¡9ò\u0005THm/HÚ\u0005\u008a\u0086ºýÊÚ\u0086X\u001fCk\u0084i{ê\u001bf2Ï\u007fÈÂ\u0082#\u001f_ÛlRÇwØºÝÝÀé\u0000E½\u0004ÄÉÁ\u0013pù\u001a.\u0087\u009e\u000bitÄõ \t¹\u0014on\u0095,FÍÌh\\\u0098É\u0087|\u0018jKÏÿu§G/¤xRÎ\u009e½\u001fä\rbN¬3>\u0090ª}Yþ\u001c\b\u001e\u008e\u0098\u0003À\u0005Ö\u0005R³÷NkLó%J\u00862z7$¸ëø{È\u00919Äýy:\u0080ýÎ!ÿT\u0001\u001bá¨\u008eò\u0015¯\u001cj1\u008c5e\u001f\u0093\u0010_à&7«ð<RÃ\u00ad\u008b£S(\u009fÀÏ^\bg4\u001cÿ¯X%\u0080è¹|`e\u00848Nèà%OÄÆ¨³ùÕ¿\u001e\u0007o=A\u008f9Q\u0010§\u0084£¨\u008cõìOq.\u001dfýg\u0084Ë\u0010T\u0011t§\u008dÉ~´\u008b\u0080®®;>J6 \u0087\u000eí´ê:_p¢Î>§Â©|ç<¯\u0002¡\u0086~±\rüÂsªSäËÂ\u0018\b÷¡¨\fv\u0096õU \u0012ûk\u000bs6J`F4ÈÓ\u0012æ\u0010«TTá\u0014~\u0097\u001ckÎ=\u0080ÿ\u0083£y z\\²õ:þäu~¿è\u0011yBåã.>s+¶ªÄn{[hÇ\u00069¤¯ G\u0082*uüY6ñ4\u008aú\tLÌfa%IcÇ\u0018`M\u0080¬?QK\nöE÷ Ä\u00845Þg\u008dS<s\u0012};@lÌâê¶5\u0007ê\u0089\u0087é=ØêXßý86 0Æª\u008e+\u0081\u0085=«\u00193÷\u0098È\t+\u0093\u0003hÜ\u00008ê\u0081¶v*wQ¿±K\u0010\u0006Ë\u0094C(\u0014¤³É\u0019UqÄÖ´¨ ¤Êj&F\u0087Úò<¶\u000e²P}\u008dZÿO_ï]\u0096\u0018²ñ¸_Ú\u0099a\u008f\u0018\u0010OÕje<\u001bÊ\u0087ê [A\u0006Ä\nÅ\u0010Ãúæñ\u008cX\u001d\u0012ïñc¶ @\u0001<`Ú6súòÁaJ_L\u0001\u008e\u008e\u0081¦YZSkPÞ¦Xl\u008fçN\u0002\u009dûì\u0011Æì\u0012«ûB:Û«èÏ¸\u0002{·\u001eA\u001a~H5\u009aV\u001b\u0010#ÁoÇ\u00039 \u0098\u007fØ\u0085-\u00ad\u0084³«\u001f\u0006×NV9z\u009fÅ\u0088F\u009fªo4ø\u0087UãI\u0007wk\u0010ÛP\u0095\u0086UOI_CÝz*Ä°gÌ\u0010DæÄ.ÝY=ù(ùí\u001eÿ.\u0016\u0088\u0010{%øÃÉTF92®Ô^ N \u000e wFêA\u0099Yæ\u0095¹Ûvø`döï\u001f2;\u008f¸óê\u0012îòh\u007fÊ\u0014\u0002)\u0018º0\u0088~¢§\u008e\u0003~\u009aÖV\u0094\u0088\u0080d\u0084GÇ\u0097G)?\b\u0018+\u0099â Ïé\u009e\u009eöÁ²Åi £\bLgÌâü\u008ef\t";
      int var26 = "\u008e\u0080$EôÎ;m\u009ed¶âÇ\t\u000fX\u0018në¹.Èì]0bð\u0004À7\u001ce\u0081ëx¤îrÏ\"åp\u0082dÛ\"¨\u0016Ï\u0005Þ¿=A\f\u0016<Æ\u0081¡ñqìZÛ5nQäîâ3¸\u0092ÇýÅ\u0002]\t@&iå\u001e§ñÒÓD\u0000±®·\u0011N#\nÿ\u0016Øîj`EÆÅyt^\u009dÎ(C\u009c\fý½\n&²IÆu[O±\u0088í3Î,4X\u0001å\u0086Þ\u009b{°\u000bcp\u0087á\u00904%ô¶0«fP\u0081UlxÏ\u008dÓw\u0097ªbqkþ¥\u0002\u0002á¶ãýP\u0015?ªi;µ\u001e`í \f5-3ïmi\u0084\u0002Xú3']å@çX¼r¾Ds\u00144}\f0Äå\u0081³\u009c°©Ý\u008dõ\u0081\u0018v\u009fùë\"Ò\u0086A\u0010;/1sd^\u0000ý\u0092\u00911\u0017&N\u0096\u0090Xfõ$\u0006;Âg\r½lB\u0005²m»Ê¨tÑî\u0014C\u008bÎ\u0017o=ÿVûÔ\u001c\u0019¢NÄULn(=\u00ad+-\u009c£ØÀ·ÒfÜP\u0003¨\u0017O:ô?\u0011Ù¦ôN\u0087\u000füNÈD\u0090÷BÉo44R¤\u0085U6f½\u0011\u0096F\u0010\u0006Þ-\u0004Vø\u0096ÊgRùþjG\"\u0080\u0010\u008d\"úªT!äd¼«\u0002ÀJ|ò\u0085 p\u009e:éþìP\u0086\u0001|ên\u0007Åßo\u0007\u0080ä¾Ù{¨1d\u0007p\u001eKme\u009a\u0010\u0003*g!ªm§¾v\u0098A\u0015)\u0095üªPb§Ó=l\u001b\u0013\u0088®í\u009fxéâ\u0093ðÒó²ëºq\u0013ôµe*~\u0018Z8'\u0087®\u0001ÐI2\u0085\u0013n<²\u0013\u0084¶©í9\u0012Õ\u0080§Ë\u0004--?\u009a\u0084W\ngÀ÷!&0é\u0016¦ï\rº#òén\u001fKPa¥]\u0086oBb\u0083\u000f\u001dª\bñ_¾%\u008dDè\u0084\u00172`¿f\u0092\réA?Ø\u008aÑ¤7Åú\u008fÍä-5\u008c\u0010ù¤3«á|sí>%\u009f\u0017QÁA7÷Ü2n>ï\u0003Â¦\u008f;\u0004>`Í\u009eúôÓE\u0010D6&\u001ab\bMXÂìDIù@\u0006í ë\r\u0004C\u0015VFôÚ)\u0010:~ÛFü«üD`¸BU\u0004\u0012Uä\u0088\u0011\u0002¾2\u0018\u0012íyÒ#èäoº\u00836ã\u0004\u0081ê¸kR®¼¯r]õ è\u001a¹0\u0005·*W\u000e4*\u0010Òë\u0094\u0090r\u0018\u0092\u000b\u007f_åcCØ×wiX\u0088;\u0018\u0014®×º\u000e´õk£×¨ï\u0098íï{ÉU\u0099Gy6dÊ\u0010`*âÆ\r\u00913ñ\u00ad¸\u000fWx(sü\u0010\u000bÂQI|ö/ù¬%\u008fã!Dú¢X\u009eÝj,T\u001c$Ù¤p]»Ãæ§cø\u0019óû\u0001 kÏ$Ï\u0015Dc\byÂ8ÊèCÐ\u0090¶_5\u001fum\u0000\u008aIÇ½\u001e\u0010Å¹½Úf9Ëî\u0018è\u001cX8Ý\u001e\r3\u0090«Ëôô\u0083\u009bÕXyÞC8Xf3ì\u001eC5\u0010^\u008f'÷ÉþÆ\bçR\u000fmo\u0019³ë PÇPoQÃ+¦½\u0080+¨÷\u0098\u0003oÉs\u0098ì¾'QõDüD¡9ò\u0005THm/HÚ\u0005\u008a\u0086ºýÊÚ\u0086X\u001fCk\u0084i{ê\u001bf2Ï\u007fÈÂ\u0082#\u001f_ÛlRÇwØºÝÝÀé\u0000E½\u0004ÄÉÁ\u0013pù\u001a.\u0087\u009e\u000bitÄõ \t¹\u0014on\u0095,FÍÌh\\\u0098É\u0087|\u0018jKÏÿu§G/¤xRÎ\u009e½\u001fä\rbN¬3>\u0090ª}Yþ\u001c\b\u001e\u008e\u0098\u0003À\u0005Ö\u0005R³÷NkLó%J\u00862z7$¸ëø{È\u00919Äýy:\u0080ýÎ!ÿT\u0001\u001bá¨\u008eò\u0015¯\u001cj1\u008c5e\u001f\u0093\u0010_à&7«ð<RÃ\u00ad\u008b£S(\u009fÀÏ^\bg4\u001cÿ¯X%\u0080è¹|`e\u00848Nèà%OÄÆ¨³ùÕ¿\u001e\u0007o=A\u008f9Q\u0010§\u0084£¨\u008cõìOq.\u001dfýg\u0084Ë\u0010T\u0011t§\u008dÉ~´\u008b\u0080®®;>J6 \u0087\u000eí´ê:_p¢Î>§Â©|ç<¯\u0002¡\u0086~±\rüÂsªSäËÂ\u0018\b÷¡¨\fv\u0096õU \u0012ûk\u000bs6J`F4ÈÓ\u0012æ\u0010«TTá\u0014~\u0097\u001ckÎ=\u0080ÿ\u0083£y z\\²õ:þäu~¿è\u0011yBåã.>s+¶ªÄn{[hÇ\u00069¤¯ G\u0082*uüY6ñ4\u008aú\tLÌfa%IcÇ\u0018`M\u0080¬?QK\nöE÷ Ä\u00845Þg\u008dS<s\u0012};@lÌâê¶5\u0007ê\u0089\u0087é=ØêXßý86 0Æª\u008e+\u0081\u0085=«\u00193÷\u0098È\t+\u0093\u0003hÜ\u00008ê\u0081¶v*wQ¿±K\u0010\u0006Ë\u0094C(\u0014¤³É\u0019UqÄÖ´¨ ¤Êj&F\u0087Úò<¶\u000e²P}\u008dZÿO_ï]\u0096\u0018²ñ¸_Ú\u0099a\u008f\u0018\u0010OÕje<\u001bÊ\u0087ê [A\u0006Ä\nÅ\u0010Ãúæñ\u008cX\u001d\u0012ïñc¶ @\u0001<`Ú6súòÁaJ_L\u0001\u008e\u008e\u0081¦YZSkPÞ¦Xl\u008fçN\u0002\u009dûì\u0011Æì\u0012«ûB:Û«èÏ¸\u0002{·\u001eA\u001a~H5\u009aV\u001b\u0010#ÁoÇ\u00039 \u0098\u007fØ\u0085-\u00ad\u0084³«\u001f\u0006×NV9z\u009fÅ\u0088F\u009fªo4ø\u0087UãI\u0007wk\u0010ÛP\u0095\u0086UOI_CÝz*Ä°gÌ\u0010DæÄ.ÝY=ù(ùí\u001eÿ.\u0016\u0088\u0010{%øÃÉTF92®Ô^ N \u000e wFêA\u0099Yæ\u0095¹Ûvø`döï\u001f2;\u008f¸óê\u0012îòh\u007fÊ\u0014\u0002)\u0018º0\u0088~¢§\u008e\u0003~\u009aÖV\u0094\u0088\u0080d\u0084GÇ\u0097G)?\b\u0018+\u0099â Ïé\u009e\u009eöÁ²Åi £\bLgÌâü\u008ef\t"
         .length();
      char var23 = '\u0010';
      int var22 = -1;

      while (true) {
         byte[] var28 = var20.doFinal(var24.substring(++var22, var22 + var23).getBytes("ISO-8859-1"));
         String var44 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var28).intern();
         byte var10001 = -1;
         var27[var25++] = var44;
         if ((var22 += var23) >= var26) {
            var24 = "\u000b¶g|\u0007(\u0016,î]ÿaëcu§»\u0010cA\u0082Ì\u0017\u0096\u0085HJ¡Y>Ó7Xþ\u0018K\u0012ý\u0080\u0095{Ô\u0091\u009eTÜ{ç\b\u008fýD2õÖvrDÝ\u008eéã&à_~z\u0086zL\u0014Ý±Ùû\u000e]gªMÕRm\bZ\u0007M\u001a-¾ä\u0015Yu{\u0003;6\u001eo8ÚÛ\u0015\u009d=\u0092\u0018\u0096r\u009cH1L´\u0003bcø\u009fT";
            var26 = "\u000b¶g|\u0007(\u0016,î]ÿaëcu§»\u0010cA\u0082Ì\u0017\u0096\u0085HJ¡Y>Ó7Xþ\u0018K\u0012ý\u0080\u0095{Ô\u0091\u009eTÜ{ç\b\u008fýD2õÖvrDÝ\u008eéã&à_~z\u0086zL\u0014Ý±Ùû\u000e]gªMÕRm\bZ\u0007M\u001a-¾ä\u0015Yu{\u0003;6\u001eo8ÚÛ\u0015\u009d=\u0092\u0018\u0096r\u009cH1L´\u0003bcø\u009fT"
               .length();
            var23 = ' ';
            var22 = -1;

            while (true) {
               var28 = var20.doFinal(var24.substring(++var22, var22 + var23).getBytes("ISO-8859-1"));
               String var46 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var28).intern();
               int var39 = 0;
               var27[var25++] = var46;
               if ((var22 += var23) >= var26) {
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var27;
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[47];
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "https://api.polinexclient.net/polinex/mod/macro";
                  Cipher var13;
                  var10000 = var13 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var14 = 1; var14 < 8; var14++) {
                     var10003[var14] = (byte)(var18 << var14 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var15 = -5947177673794293880L;
                  byte[] var17 = var13.doFinal(
                     new byte[]{
                        (byte)(var15 >>> 56),
                        (byte)(var15 >>> 48),
                        (byte)(var15 >>> 40),
                        (byte)(var15 >>> 32),
                        (byte)(var15 >>> 24),
                        (byte)(var15 >>> 16),
                        (byte)(var15 >>> 8),
                        (byte)var15
                     }
                  );
                  long var49 = (var17[0] & 255L) << 56
                     | (var17[1] & 255L) << 48
                     | (var17[2] & 255L) << 40
                     | (var17[3] & 255L) << 32
                     | (var17[4] & 255L) << 24
                     | (var17[5] & 255L) << 16
                     | (var17[6] & 255L) << 8
                     | var17[7] & 255L;
                  var39 = (byte)-1;
                  long var11 = var49;
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)var11;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var18 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var18 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "*\u0011+´a\u001c©\u009f[687S\u000b\u0086MJ`²/W\u0007Xu";
                  int var5 = "*\u0011+´a\u001c©\u009f[687S\u000b\u0086MJ`²/W\u0007Xu".length();
                  byte var2 = 0;

                  do {
                     var39 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                     var39 = var3++;
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
                     byte var53 = -1;
                     var6[var39] = var10004;
                  } while (var2 < var5);

                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var6;
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Long[3];
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"z">(
                     25560, var18 ^ 7117298766247592460L
                  );
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                  return;
               }

               var23 = var24.charAt(var22);
            }
         }

         var23 = var24.charAt(var22);
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7945;
      if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/network/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10
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
         byte[] var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5];
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
            "me/octo/client/utils/network/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1211;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3] == null) {
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
         long var5 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var3];
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
         Object[] var9 = (Object[])lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/network/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var14
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
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3] = var15;
      }

      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3];
   }

   private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
            "me/octo/client/utils/network/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
