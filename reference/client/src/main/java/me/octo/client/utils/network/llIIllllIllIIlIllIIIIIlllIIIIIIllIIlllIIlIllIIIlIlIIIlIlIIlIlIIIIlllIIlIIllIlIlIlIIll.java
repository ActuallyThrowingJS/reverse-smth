package me.octo.client.utils.network;

import com.google.gson.JsonObject;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   public static llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ConcurrentHashMap<String, llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static HttpClient lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 35619955498397L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);
   private static long[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Long[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;

   private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull File param0, @NotNull String param1, long param2, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull JsonObject param0, long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String param1, char param2, int param3, char param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2,
      long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param1,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param3,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param1,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param2,
      long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param0,
      char param1,
      int param2,
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param3,
      int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var20 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 35680890515840L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[39];
      int var16 = 0;
      String var15 = "\u0013Óê¯ÿÝË¨Úý·ElQ\u0016Vu\u0016ÒnY6ÂkÆàúË\u0092Gg~\u0010å\u001c±ª\u0010Z)\u001daÕdf#\u001bÔk\u00189\u0015®\u0001\u0013\u008bóOñáì1ö;\u001b_M\u00adNÀ\u0096«Óä\u0010\u0091êI5È¶é\u0094IüW\u0095Lbª\u0080\u0010[\u0002\u0017-{\u0097ùÀI¤\u008eß\u0000s,\u0018 l*C9b\u0081äf\t\f\u0093°ÛìY=~èíd^\u0097\u0093Ì\"lÙÎO\u0019¾ï\u0018s¯½»\u009bjO\u0001ÒFé\u0095U¿ßbêð\u0016¹' ùd@\u0087\n7ùYùsnËåT\u0014·MËÜkö\u000b}^\\kÎ\u00807\u0082Í\u0096Â\u0091\u000f\u001cô\u008a6¡\u0088Z·à{&\u008a\u0006^6çØC\u0017º#¸ä\u0080\u0004\u008bïFc\u0005Ø¥`\u008dùsTã}o\u0084¦Üö\u000e¥väp\u0087Ê\u0090\u000eºIt\u00908\u0091Á\u0002Å¶\u0085¯Ó¥\u001a`N\u0001ËÆ\u001d\u0083Hü\u0091\u0095\u001dD~d yý\u001b%¾Üÿ¤Æv)ÈÉì@¶è\u0006¯Ã\u0091\u008a8\u0019\u0001Fûæ\u0090´¤(\u000bzbF¡$6\u0015\u0002\u0002\u0082v\u0089\u0010\u0098á\u0091«næ\u0095nMmù\u0080\u001dp\u008eX\u0010Kû_\u0000\u0087û'ù\u001c\u007f¸!:h\u0084\u0089p{o^S\u0088^ý6öAçôîÿòXM\u009f8ò)é\u0087MäÉ¨Þôè\u0089Ææ\u008d\u009dc\u0011ºv@=sÓæÀµ±\u008c;_JÇF\u0012\u000b¡>\u0093\u008aÆ;\u0012\u0019*zÔCÔS\u001c¨Ô³îÈëÜþ\u0013Z*n°'4=-p¢È°½\u0001«yç§ª,5þÃ\u001cc\u00946à\u008d³çQc\u0010pï\u0003\u0015ë\u0004)úÿ\\ÄêwÚùLX¯ä¡(,\u0087*§BÆÓ¹\u0084g,^{ô\u0012Jø1¤¡ö¦#%\u001c\u0094I{wLÁdÿ\b$\u001f«\u0010æ\u001fâ9\u0090\u0018ñÂ\nFÄj5t\u008bkÝ7-G}\u007fÍÇ KÀwóeª\u0087@2d½òÞcÊ9øÒì\u0092\u0012\u0018=â$Ä¼ä2öo\u0092ÉQøë¡ªõ@\u0080\u0084Ðh\u008dw\u0010\f\u001e\u0098\u007f\u0088\u009eìr{ÙÑÉg°\r\u001a0@\u0090\u0003cèï\u001c¡;l\u009b\u0084\u009c»¤,1×9²f\u001côc\u0085\u0097é\f[\u000fxP!_\"5p(Àþ¨\u001aG\u008beJu\u009aX0F\u008e-\u0084è¼¦Á±DØûXT>î\u0005ROº\u001c£?ë§Ö\u0006\u001c\u0095»æ ÔÄ'\u001fÈú<\u008d\u001f\u000f\u0085º¾\u0013ÕQS\rs\u0004Àä'öÅw\u000b\u001dJ\u0098ûêºÞ¥QÚHý\u0007\u008cÛ\u0003Õ\u0087` \u0081×\t)%ÃèÜ(0°¸ÂöLb\u008c[\u009e\u001f¾HC´B<uj/%p±=\u001epËô[ü4)\u0012omÓ\u0085v·f`×ÊäQ\u0092ÍÊ\u0018Z\u0017[ÿ\u0089\u0011õ>\n\u0001gCZ\u008c#W6ôîî'j\u0093\u009eøÜïôæW3\u0001ÆËU¥zv\tMåwP\u0003É\fè¾\u001e+N}úÜ\u0007m=\u008f®\u008a\u00172\u008fKÞûÍ¡\u008eºY\u007fÞÁ\u0094ãô\u0004»\u000e÷B¾c\u0006ºaû8²\u0084y°·(ÑL¼\u000e\u009f\u0086\u0090\u009fÌÍ\u001c_&\u0095îI¯Ð¨=åü\u0086\u0011C9\u009e\u0003ÂDÞ×'g\u001e\u001fvÁÑK>\u0092O\t\u007fU²òSÓPleÑÑ×\u00995\u0001/7¨æ\nÉèýÔòµÁ#JÎÁ\u009d°\u0014\u00ad\u009eUÝ2#ÿæûØlë\u0003\u0017i\u008d\u000eSg(Ó#È@Ä:Z©ÃÑ¥4ÌWùRþÌ\u0004C\u009bëÙ0s\u0096\u0010·»¾÷\u001f¶ $y\f:è´O8¼\u0010\u0013ÇnH°Gåü©\u008c\u009dù%½z\u009f\u001c\u001c\u009c¯\u0005V\u0010a(1»·g\u001e©ÖågÔ\u0006WçohRZ)7+Q}\u0007S\u0088²¶V^\u001d¸\\Î¸(¢\u0000Ó¦é»Í\u0098e\u0092Ö½\u0000ñ4ò)[ÿ¶úÜ¦\u0080\u001fÉT\u0000\n k.Ó«>\tú\bI\u0088LÜò\rVË\u0089]\u009cg\u0091\u0003\u0096U^\u00adÖÂ\u0095\u008b\u0010&\u0004\u008c\nt\u0084\u0000É\u0080.´\u009b\u0012\u0013Hjh\u0011\u001b\u008d³\u00adæ(Â\u000f\u0014\u0003´ÍÂ\u0013m¤æâ \u001c\u009e«21%BËûQ^\u0097È\u0019¼Ó\nÁ|\u008b¯£\u0001AX\u007fÑ Å\u0001@ÆOíà´\u0096ð\u0089[\u0092\u001e\u001a\u009e¯\u000bû\u0007Ï®WW}¦\u0002ß;\u0085Ïo\u0018V¢\u0091S0$,Ípd ý^À8ëèü\u0011\u0003\u001f\u001a÷\u0017 0£4\u0002ý\u00930á\u0007Ü3Õ\u0011Ë\u000eu×3v\blPvQ\u0089·ã\u0084Ú\u0018|-@d\u0082\r'úÂ\u008e\u0013\u0014euJ\u0089\u00197ÊDÁVÓì¾\u0095Ðò°ÙM!\u0085ú\u0087\u0089LÊ\u001d´Z\u0019Õ'¼,HT.µkKe8\u009d©7Ú\u007fE¶92¥Uô\u0002\u0010 \u0095\u0094&Ú¡@\u0090\u0014\u0080±~v\u0018si8\u0005ÿü\u0088Æ?¿}\u0093æ5VÉjö¬µ\u009d\u0082É¦²ß§8IHëÎ\u00ad\u001aí\u0012¤7\u000emðýÚdH\u0002 2`ß`{#Ôb\u0094ÑU\u0096`\u001bÁ9\u0088hÜQ¯\u001eJÀ\u008cUQx°©úï©ÐÈ\b¨\u0098}KKR´\u0018xÞi]\u0006¾O'ý\u008ddf¦\u000b1p\u009a~\u001cF¾ë\u0085\u009c;\u0099@pen\"=®\u008e\u0000\u0081\u0016\u008f\u0095\n¾Ïa\u0094á2ï\u009dh:,I\u0097¤5oÈTÉ¨ú\u0019ù@Ã@Ã=\u0018\b=yÓ\n\u0083-w\u0099×¢¯\u001aÐ\u001d\u008beêîe.\u0086N_\u000b\u0002=Mk\u009cSº\u0087\u0095÷ÒozºÐ\tn¾PÙ?ÜÌZ7Lnß &LsäÄs\u0016 Ì\u0007%ÇÊ£\u0086\u0017\u0088\bÜ?*{Ê@\u0001]7UH\u0007\u0088ê\tñL««¦,Ñ@\u008cà\u0014\u008eâp\u008b3ÿ\u008a_>Ù\u009e®Ê\u0018\u0015\u0094X-Ã¿ûâ2Fr\u008fêð\u0003öëo«Æga2\u0085\u0013Q\u0091W-Zà%èu\\óØÎ¸Ee\b\u00848ÅG_\u0010p+ÄC\u0007Æ%V´_}\u008b»ø±T";
      int var17 = "\u0013Óê¯ÿÝË¨Úý·ElQ\u0016Vu\u0016ÒnY6ÂkÆàúË\u0092Gg~\u0010å\u001c±ª\u0010Z)\u001daÕdf#\u001bÔk\u00189\u0015®\u0001\u0013\u008bóOñáì1ö;\u001b_M\u00adNÀ\u0096«Óä\u0010\u0091êI5È¶é\u0094IüW\u0095Lbª\u0080\u0010[\u0002\u0017-{\u0097ùÀI¤\u008eß\u0000s,\u0018 l*C9b\u0081äf\t\f\u0093°ÛìY=~èíd^\u0097\u0093Ì\"lÙÎO\u0019¾ï\u0018s¯½»\u009bjO\u0001ÒFé\u0095U¿ßbêð\u0016¹' ùd@\u0087\n7ùYùsnËåT\u0014·MËÜkö\u000b}^\\kÎ\u00807\u0082Í\u0096Â\u0091\u000f\u001cô\u008a6¡\u0088Z·à{&\u008a\u0006^6çØC\u0017º#¸ä\u0080\u0004\u008bïFc\u0005Ø¥`\u008dùsTã}o\u0084¦Üö\u000e¥väp\u0087Ê\u0090\u000eºIt\u00908\u0091Á\u0002Å¶\u0085¯Ó¥\u001a`N\u0001ËÆ\u001d\u0083Hü\u0091\u0095\u001dD~d yý\u001b%¾Üÿ¤Æv)ÈÉì@¶è\u0006¯Ã\u0091\u008a8\u0019\u0001Fûæ\u0090´¤(\u000bzbF¡$6\u0015\u0002\u0002\u0082v\u0089\u0010\u0098á\u0091«næ\u0095nMmù\u0080\u001dp\u008eX\u0010Kû_\u0000\u0087û'ù\u001c\u007f¸!:h\u0084\u0089p{o^S\u0088^ý6öAçôîÿòXM\u009f8ò)é\u0087MäÉ¨Þôè\u0089Ææ\u008d\u009dc\u0011ºv@=sÓæÀµ±\u008c;_JÇF\u0012\u000b¡>\u0093\u008aÆ;\u0012\u0019*zÔCÔS\u001c¨Ô³îÈëÜþ\u0013Z*n°'4=-p¢È°½\u0001«yç§ª,5þÃ\u001cc\u00946à\u008d³çQc\u0010pï\u0003\u0015ë\u0004)úÿ\\ÄêwÚùLX¯ä¡(,\u0087*§BÆÓ¹\u0084g,^{ô\u0012Jø1¤¡ö¦#%\u001c\u0094I{wLÁdÿ\b$\u001f«\u0010æ\u001fâ9\u0090\u0018ñÂ\nFÄj5t\u008bkÝ7-G}\u007fÍÇ KÀwóeª\u0087@2d½òÞcÊ9øÒì\u0092\u0012\u0018=â$Ä¼ä2öo\u0092ÉQøë¡ªõ@\u0080\u0084Ðh\u008dw\u0010\f\u001e\u0098\u007f\u0088\u009eìr{ÙÑÉg°\r\u001a0@\u0090\u0003cèï\u001c¡;l\u009b\u0084\u009c»¤,1×9²f\u001côc\u0085\u0097é\f[\u000fxP!_\"5p(Àþ¨\u001aG\u008beJu\u009aX0F\u008e-\u0084è¼¦Á±DØûXT>î\u0005ROº\u001c£?ë§Ö\u0006\u001c\u0095»æ ÔÄ'\u001fÈú<\u008d\u001f\u000f\u0085º¾\u0013ÕQS\rs\u0004Àä'öÅw\u000b\u001dJ\u0098ûêºÞ¥QÚHý\u0007\u008cÛ\u0003Õ\u0087` \u0081×\t)%ÃèÜ(0°¸ÂöLb\u008c[\u009e\u001f¾HC´B<uj/%p±=\u001epËô[ü4)\u0012omÓ\u0085v·f`×ÊäQ\u0092ÍÊ\u0018Z\u0017[ÿ\u0089\u0011õ>\n\u0001gCZ\u008c#W6ôîî'j\u0093\u009eøÜïôæW3\u0001ÆËU¥zv\tMåwP\u0003É\fè¾\u001e+N}úÜ\u0007m=\u008f®\u008a\u00172\u008fKÞûÍ¡\u008eºY\u007fÞÁ\u0094ãô\u0004»\u000e÷B¾c\u0006ºaû8²\u0084y°·(ÑL¼\u000e\u009f\u0086\u0090\u009fÌÍ\u001c_&\u0095îI¯Ð¨=åü\u0086\u0011C9\u009e\u0003ÂDÞ×'g\u001e\u001fvÁÑK>\u0092O\t\u007fU²òSÓPleÑÑ×\u00995\u0001/7¨æ\nÉèýÔòµÁ#JÎÁ\u009d°\u0014\u00ad\u009eUÝ2#ÿæûØlë\u0003\u0017i\u008d\u000eSg(Ó#È@Ä:Z©ÃÑ¥4ÌWùRþÌ\u0004C\u009bëÙ0s\u0096\u0010·»¾÷\u001f¶ $y\f:è´O8¼\u0010\u0013ÇnH°Gåü©\u008c\u009dù%½z\u009f\u001c\u001c\u009c¯\u0005V\u0010a(1»·g\u001e©ÖågÔ\u0006WçohRZ)7+Q}\u0007S\u0088²¶V^\u001d¸\\Î¸(¢\u0000Ó¦é»Í\u0098e\u0092Ö½\u0000ñ4ò)[ÿ¶úÜ¦\u0080\u001fÉT\u0000\n k.Ó«>\tú\bI\u0088LÜò\rVË\u0089]\u009cg\u0091\u0003\u0096U^\u00adÖÂ\u0095\u008b\u0010&\u0004\u008c\nt\u0084\u0000É\u0080.´\u009b\u0012\u0013Hjh\u0011\u001b\u008d³\u00adæ(Â\u000f\u0014\u0003´ÍÂ\u0013m¤æâ \u001c\u009e«21%BËûQ^\u0097È\u0019¼Ó\nÁ|\u008b¯£\u0001AX\u007fÑ Å\u0001@ÆOíà´\u0096ð\u0089[\u0092\u001e\u001a\u009e¯\u000bû\u0007Ï®WW}¦\u0002ß;\u0085Ïo\u0018V¢\u0091S0$,Ípd ý^À8ëèü\u0011\u0003\u001f\u001a÷\u0017 0£4\u0002ý\u00930á\u0007Ü3Õ\u0011Ë\u000eu×3v\blPvQ\u0089·ã\u0084Ú\u0018|-@d\u0082\r'úÂ\u008e\u0013\u0014euJ\u0089\u00197ÊDÁVÓì¾\u0095Ðò°ÙM!\u0085ú\u0087\u0089LÊ\u001d´Z\u0019Õ'¼,HT.µkKe8\u009d©7Ú\u007fE¶92¥Uô\u0002\u0010 \u0095\u0094&Ú¡@\u0090\u0014\u0080±~v\u0018si8\u0005ÿü\u0088Æ?¿}\u0093æ5VÉjö¬µ\u009d\u0082É¦²ß§8IHëÎ\u00ad\u001aí\u0012¤7\u000emðýÚdH\u0002 2`ß`{#Ôb\u0094ÑU\u0096`\u001bÁ9\u0088hÜQ¯\u001eJÀ\u008cUQx°©úï©ÐÈ\b¨\u0098}KKR´\u0018xÞi]\u0006¾O'ý\u008ddf¦\u000b1p\u009a~\u001cF¾ë\u0085\u009c;\u0099@pen\"=®\u008e\u0000\u0081\u0016\u008f\u0095\n¾Ïa\u0094á2ï\u009dh:,I\u0097¤5oÈTÉ¨ú\u0019ù@Ã@Ã=\u0018\b=yÓ\n\u0083-w\u0099×¢¯\u001aÐ\u001d\u008beêîe.\u0086N_\u000b\u0002=Mk\u009cSº\u0087\u0095÷ÒozºÐ\tn¾PÙ?ÜÌZ7Lnß &LsäÄs\u0016 Ì\u0007%ÇÊ£\u0086\u0017\u0088\bÜ?*{Ê@\u0001]7UH\u0007\u0088ê\tñL««¦,Ñ@\u008cà\u0014\u008eâp\u008b3ÿ\u008a_>Ù\u009e®Ê\u0018\u0015\u0094X-Ã¿ûâ2Fr\u008fêð\u0003öëo«Æga2\u0085\u0013Q\u0091W-Zà%èu\\óØÎ¸Ee\b\u00848ÅG_\u0010p+ÄC\u0007Æ%V´_}\u008b»ø±T"
         .length();
      char var14 = ' ';
      int var13 = -1;

      while (true) {
         byte[] var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
         String var36 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
         byte var10001 = -1;
         var18[var16++] = var36;
         if ((var13 += var14) >= var17) {
            var15 = "\u009b\u0081lËüÜ\u0096\u0014H\u008c,o\u009bïdG ¬\\½Uÿ¯\u008c©²;\u0089N\u001c\u0088®eyèN¤\u0098p_\u009dÊê#\u0014HIê\u001c";
            var17 = "\u009b\u0081lËüÜ\u0096\u0014H\u008c,o\u009bïdG ¬\\½Uÿ¯\u008c©²;\u0089N\u001c\u0088®eyèN¤\u0098p_\u009dÊê#\u0014HIê\u001c".length();
            var14 = '\u0010';
            var13 = -1;

            while (true) {
               var19 = var11.doFinal(var15.substring(++var13, var13 + var14).getBytes("ISO-8859-1"));
               String var38 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
               int var32 = 0;
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var18;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[39];
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "in3\u0013ã\u009eÈ\u0095¶ô\u000e¯HdÖ\u0086";
                  int var5 = "in3\u0013ã\u009eÈ\u0095¶ô\u000e¯HdÖ\u0086".length();
                  byte var2 = 0;

                  do {
                     var32 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                     var32 = var3++;
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
                     byte var42 = -1;
                     var6[var32] = var10004;
                  } while (var2 < var5);

                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var6;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new Long[2];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
                  HttpClient var30 = HttpClient.newBuilder()
                     .connectTimeout(
                        Duration.ofSeconds(
                           llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"u">(28823, 207110089764001715L ^ var20)
                        )
                     )
                     .version(Version.HTTP_1_1)
                     .build();
                  Intrinsics.checkNotNullExpressionValue(var30, "build(...)");
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var30;
                  return;
               }

               var14 = var15.charAt(var13);
            }
         }

         var14 = var15.charAt(var13);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22358;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll", var10
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
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2873;
      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var3] == null) {
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
         long var5 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var3];
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
         Object[] var9 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll", var14
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
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var3] = var15;
      }

      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var3];
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
            "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$84b60ec19948e37d(
      @NotNull File clipFileArg, @NotNull String banIdArg, long argument3Arg, long argument4Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$b5dfe9a9753bf38c(
      String param1, char param2, int param3, char param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final String uploadId;
      @NotNull
      private final String banId;
      @Nullable
      private final String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 118910534219693L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull String uploadIdArg, @NotNull String banIdArg, @Nullable String argument3Arg
      ) {
         long var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 112983478977642L;
         Intrinsics.checkNotNullParameter(uploadIdArg, "uploadId");
         Intrinsics.checkNotNullParameter(banIdArg, "banId");
         super();
         this.uploadId = uploadIdArg;
         this.banId = banIdArg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
      }

      @NotNull
      public final String getUploadId() {
         return this.uploadId;
      }

      @NotNull
      public final String getBanId() {
         return this.banId;
      }

      @Nullable
      public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, @NotNull String var2, @Nullable String var3, long var4
      ) {
         var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var4;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(4026, 87130564830913569L ^ var4)
         );
         Intrinsics.checkNotNullParameter(
            var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(7001, 2973595497268932804L ^ var4)
         );
         return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 8230019535237L;
         String var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var4 = this.banId;
         String var5 = this.uploadId;
         return "UploadInit(uploadId=" + var5 + ", banId=" + var4 + ", presignedUrl=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 36449113990492L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[7];
         int var7 = 0;
         String var6 = "\u0099é)Kº\u008bð+¬°c.¨\u0010:\u0014\u0018º\t\u001e\u0007T\u008dæÛå\u0096\u0099\u0080ùÚù;sFç\u000bCDÞq(f\u0094\u0086ûO1\u001d«\u0014¤PC\u000e\u0007^8JÂR³\u0093ædk\u009eÅb\u001fî\u00951\"Tù\u001fë\u0012³\u008cY Gµ\u0096XZ\u0001Y¹r(\n×\u009d¢Ô;\u000fl©(¨NÑt½\u0082\u0085í\u009bíiÍ\u0018¨\u0017\u0010\u008f\u00ad¾\u0097¶#HÇ½tM\u001eO;·íj\u0003¢\u001f\u000e";
         int var8 = "\u0099é)Kº\u008bð+¬°c.¨\u0010:\u0014\u0018º\t\u001e\u0007T\u008dæÛå\u0096\u0099\u0080ùÚù;sFç\u000bCDÞq(f\u0094\u0086ûO1\u001d«\u0014¤PC\u000e\u0007^8JÂR³\u0093ædk\u009eÅb\u001fî\u00951\"Tù\u001fë\u0012³\u008cY Gµ\u0096XZ\u0001Y¹r(\n×\u009d¢Ô;\u000fl©(¨NÑt½\u0082\u0085í\u009bíiÍ\u0018¨\u0017\u0010\u008f\u00ad¾\u0097¶#HÇ½tM\u001eO;·íj\u0003¢\u001f\u000e"
            .length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "=G\u0087\u001d©\u0005\u001eÑÒ\u0019Ù\u0099 ý\r¿ ïz¹ÄØ4É%¸\u0007\u0015\u0003æ\u0081,\t!Ú\u009d\u000e«\u0086\u0092\f\u0088ß\u0092g/\u0085çK";
               var8 = "=G\u0087\u001d©\u0005\u001eÑÒ\u0019Ù\u0099 ý\r¿ ïz¹ÄØ4É%¸\u0007\u0015\u0003æ\u0081,\t!Ú\u009d\u000e«\u0086\u0092\f\u0088ß\u0092g/\u0085çK"
                  .length();
               var5 = '\u0010';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 23573;
         if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
            byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
               "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final File file;
      @NotNull
      private final String banId;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 26041987813311L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull File fileArg, @NotNull String banIdArg, long argument3Arg
      ) {
         long var5 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 8411413414140L;
         Intrinsics.checkNotNullParameter(fileArg, "file");
         Intrinsics.checkNotNullParameter(banIdArg, "banId");
         super();
         this.file = fileArg;
         this.banId = banIdArg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
      }

      @NotNull
      public final File getFile() {
         return this.file;
      }

      @NotNull
      public final String getBanId() {
         return this.banId;
      }

      public final long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final long IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull File var1, long var2, @NotNull String var4, long var5
      ) {
         var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(8598, 453712754804377027L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(873, 2852827338366052153L ^ var2)
         );
         return new llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var1, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 102023712411885L;
         long var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var5 = this.banId;
         File var6 = this.file;
         return "PendingClip(file=" + var6 + ", banId=" + var5 + ", banTimestamp=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.file.hashCode();
         var1 = var1 * 31 + this.banId.hashCode();
         return var1 * 31 + Long.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 12505987498148L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[7];
         int var7 = 0;
         String var6 = "öðNN_×,ÉýrþÏsÑ\u001fÏ\u0010ß\rõp\u0012\u0001\\¢°\u00947;CuæÖ\u0010\u009b¹\u009e\u0003\u0082º\u001c NÎ\u000b\u0016ã$\u009d* =b»!¿Úä q\u009aÙÑ3òcYÌZKÐÊ÷$\b÷Àßj\u0012µÜX\u0010v\u000f\u008e\u009d\u009f[ßä®óF\u001e\u008f\u008fíÕ";
         int var8 = "öðNN_×,ÉýrþÏsÑ\u001fÏ\u0010ß\rõp\u0012\u0001\\¢°\u00947;CuæÖ\u0010\u009b¹\u009e\u0003\u0082º\u001c NÎ\u000b\u0016ã$\u009d* =b»!¿Úä q\u009aÙÑ3òcYÌZKÐÊ÷$\b÷Àßj\u0012µÜX\u0010v\u000f\u008e\u009d\u009f[ßä®óF\u001e\u008f\u008fíÕ"
            .length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "yû9ª\"0ïòçL'¦üÞ<\u0005^¥ö`\u0084\u001f\u000bïI¦\u0018d\u001fp\u0080>\u0086ßvc\u0007ùø< íAR¡\u0014É\u0082 W®Ö[R¹å:Ã\u0002¡\u0014\u0005±ûHdì¶ÔJòkÏ";
               var8 = "yû9ª\"0ïòçL'¦üÞ<\u0005^¥ö`\u0084\u001f\u000bïI¦\u0018d\u001fp\u0080>\u0086ßvc\u0007ùø< íAR¡\u0014É\u0082 W®Ö[R¹å:Ã\u0002¡\u0014\u0005±ûHdì¶ÔJòkÏ"
                  .length();
               var5 = '(';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[7];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 11731;
         if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
            byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
               "me/octo/client/utils/network/llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
