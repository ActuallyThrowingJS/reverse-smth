package me.octo.client.failsafes;

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
import kotlin.collections.CollectionsKt;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII {
   @NotNull
   public static llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static List<String> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static List<String> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 39670557221190L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

   private llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII() {
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      long var6 = (var4 ^ 184401007672L) >>> 16;
      int var8 = (int)((var4 ^ 184401007672L) << 48 >>> 48);
      String var9 = (String)CollectionsKt.random(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII, (Random)Random.Default);

      try {
         if (this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, (char)var8, 0.7)) {
            return StringsKt.replace$default(var9, "'", "", false, 4, null);
         }
      } catch (MatchException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -3426326022943593638L, var4
         );
      }

      return var9;
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, char var3, double var4) {
      long var6 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      int var8 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7254241199728063061L, var6
      );

      try {
         double var10;
         int var10000 = (var10 = Math.random() - var4) == 0.0 ? 0 : (var10 < 0.0 ? -1 : 1);
         if (var8 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, 7281505433596304932L, var6
         );
      }

      return (boolean)0;
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, List param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final List IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final CharSequence llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param0, String param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 25973235737649L;
      byte var12 = 15;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((int)var12);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[52];
      int var5 = 0;
      String var4 = "¤o¿hì\u0083TÓ\nÇ\u0093\u0004õ¶½Q\u009fzâÿÈXI\u0012Ô¯\u009fÉÄ\u0015\u001dÜ ¶ýS\u008d y´jfÒ$ü\\Ýª\u0002â\u0016îl\u0006\u0005\u001b\u001a\u009ecj{¡ÜHf\u0010\u0007\u0005Ül\u0096\u008fÿé\n\u0095\u0000´è¤âÏ\u0010R\u0092wB\u0089Ó=\u0097o\u0000üç3¢]¦\u0010¼ýá5g¥®ÞäSõÂ/.n¿ Ð\u0016\u0088\u0002h\u0005\u0004¶|Á\u0097ï.ËEâå\u0014kAãN+ÚoäË\u0084\u008a\u001cè<\u0010\u001c4\u0083\u0001\u0015JrhPÝÓYï\u0096/í a\u0082ù3µË>\u0093>\u000eCÞ\u0018,\u007foþ\u0002e\"\fÜ¶ª\u000bq¤\u008eÇÍ¿}\u0018\u00ad\u0092O{ÖæÆµd\u001e\u008dr\u0016*ZGÏÁNOl4Ó5\u0010áE\u008d¸ê\u001d:±ÑÑ\u0083\rSñúÛ\u0010¾ã\u008bF(÷\u007fØ#~¶\u0097\u001d\u001b\u009d\u0001\u0018×¾ú\u0003xäÍ«ê°$\u0007#7\u0018îx\u009ap÷\u009e Ìä\u0018Û*î\u0017Ì\u009aP\u0090°\u0082\u008fõ\\¹J3M\tÕÊÑ]¶Õ\u0010\u001fxU3àßLÄñ\u009dKªm]Zç\u0010\u000eAa£66R¿5>È\u0013ÿÍPl\u0010\u0086l\u001f\u0017CÞî_Ë\u009e:µù3C\u0004\u0018Ô\u0010ÊóU\u0011í2§Õ\u001bÓEQË\u009c\u008b_\u008fS\u009a\u0005\u0010ì\u0010\u009bT\u0094?Ä\t\u0006ÐÅ\u0014pþ\u001e]7\u0098(@ìW\u008c¾\u0085ñ1y=Ñª½\u0010\u009fÔ\n\u009e\bZÊ:üÿ/£0\u008fª(ªèàØ\u0014gmÕ\u000fi\u0010ÿúdõpöè,E§}ô\u001aéÕ (¢¼\u000fYV\u00112u\u0092ù\u001f\u0093\u0002u:¾ª-D¿)\u0002ÒPÐ ª\u0015\u000f\u008dD1í\u0001\u0091\u0085Öö½q \u0084qª(8\u008aMQð¥0¹\u0006b\u0093ä[69ú¿ cQ\u008d\r\u00862»ñB\u0006\u0010+\u0099É«óH÷\u001d\t°\u009f\u009f\u0081\u0088D\u0085(G{÷ÌÀ\tTÛ.|0Ì\\\u009bFÝ½GçS\u009bä±;\u0084D2|õ\u0090®©Ï-»h\u0019\u0088\u0000\u0001 \u008b÷ªåWÆ\u0019Ê\u008f\u009aiÒ+)k0p¡{\u001cÅkôÕöWÐôQ\u0005õø\u0010Ç\u0098ãîé\u0083´\u0090\u0083]ä9^©$ø\u0010G;R×ÏfÄIRQZÌ´ôß+\u0010¦çço¤²u\u0011«\b1\u0006Ó{Î\u0014\u0018ø«\u0090ÑAúü®Å\\@Ä¢yñ*®¤ò©\u0084êÀ°\u0010Æ\u0011¾Ïî\u0012æ®ÐhaU\u0093õÉ\u0083(Ç{w=\u0089¨d\u0016a?\u0006ÙcZ\u0098Ù\u0001nËbö\u001dÙ»\u008b\u0000¦¢º4\u000bïß\u0086ù\u0095«H`»\u0010Õ\u0097\u001d\u008e;ì\u000e6Ï\u0010í\u0089&\u0095Î%\u0010~©\u008b\u0010GTë\u008f°Ì@\u0005Y\u0084ßÎ\u0010YCÎryÌ¸\u0000;_Ã7D\u0094\u0004Z\u00101!\u009a [ßªb\u0001ì\u0000µx)Óz\u0010Ã\u0096Ë\u0005§Þq\"\u001d·\u009c\u000e\t| R \u0085\u0082ñeÀ\u0086Ãºñ\u001eÓÿ¬\u0096(\u009f\u009bÏ¦3¥÷µo\u0018+q¥\u0015y+\u009d\u0010ïòpþ\u0016¼\u0013Ûu£Ô\u0007àè3\u009b\u0010%¤ô3aºF\u009f5%åý¼\u0015z\u009c0ùèTÃ\u0005W)K\u0018Ý¶\u008ee?@jräöÏã\u000eF4hT\r\u008a\u0010\u0015½\u0000ûö\u0097ÅVÄ4V@Í/ØÃÐõÿ\u0018\u000fÕ6«Ü\u008c~(\rplO\u0087Z~\r\u0083ï6¤ñ\u008dKÂ\u0010B\u0006×d\u0089@iîdnú½h®Ûº\u0010¬;¬\u0083ö6}\u001fÖ\u0005ÚLåNN\u00880\u0013\u0092 ÷mã\u0098k\u0096÷òë\u001e\u009d\u008fïÍ\\*\u008cÌò¾õ\u007fñûÁü¥Åº4¿5\u0014ô#*MõA2\u0005SpÈö\u0010%O\u0098z\u0017\u008b=\" \u00848(cà\u008aO\u00105\u0088Ë\u0095h\u008b@\u0092\\\u0097\u008e%\u0007\u0090\u0002\u0098\u0010úRø$\br\u009a¢ªY\u0089ÍlKYå\u0010*:O.(e\u001eÁ]ÿÒ`¤Ê6á\u0010\u0084¨O=\"±\u000e\u008füaÂ\u001aùC:<\u0010W¦'0àj\u0083U@ï´\u0099\u0088FÄ\u0019";
      int var6 = "¤o¿hì\u0083TÓ\nÇ\u0093\u0004õ¶½Q\u009fzâÿÈXI\u0012Ô¯\u009fÉÄ\u0015\u001dÜ ¶ýS\u008d y´jfÒ$ü\\Ýª\u0002â\u0016îl\u0006\u0005\u001b\u001a\u009ecj{¡ÜHf\u0010\u0007\u0005Ül\u0096\u008fÿé\n\u0095\u0000´è¤âÏ\u0010R\u0092wB\u0089Ó=\u0097o\u0000üç3¢]¦\u0010¼ýá5g¥®ÞäSõÂ/.n¿ Ð\u0016\u0088\u0002h\u0005\u0004¶|Á\u0097ï.ËEâå\u0014kAãN+ÚoäË\u0084\u008a\u001cè<\u0010\u001c4\u0083\u0001\u0015JrhPÝÓYï\u0096/í a\u0082ù3µË>\u0093>\u000eCÞ\u0018,\u007foþ\u0002e\"\fÜ¶ª\u000bq¤\u008eÇÍ¿}\u0018\u00ad\u0092O{ÖæÆµd\u001e\u008dr\u0016*ZGÏÁNOl4Ó5\u0010áE\u008d¸ê\u001d:±ÑÑ\u0083\rSñúÛ\u0010¾ã\u008bF(÷\u007fØ#~¶\u0097\u001d\u001b\u009d\u0001\u0018×¾ú\u0003xäÍ«ê°$\u0007#7\u0018îx\u009ap÷\u009e Ìä\u0018Û*î\u0017Ì\u009aP\u0090°\u0082\u008fõ\\¹J3M\tÕÊÑ]¶Õ\u0010\u001fxU3àßLÄñ\u009dKªm]Zç\u0010\u000eAa£66R¿5>È\u0013ÿÍPl\u0010\u0086l\u001f\u0017CÞî_Ë\u009e:µù3C\u0004\u0018Ô\u0010ÊóU\u0011í2§Õ\u001bÓEQË\u009c\u008b_\u008fS\u009a\u0005\u0010ì\u0010\u009bT\u0094?Ä\t\u0006ÐÅ\u0014pþ\u001e]7\u0098(@ìW\u008c¾\u0085ñ1y=Ñª½\u0010\u009fÔ\n\u009e\bZÊ:üÿ/£0\u008fª(ªèàØ\u0014gmÕ\u000fi\u0010ÿúdõpöè,E§}ô\u001aéÕ (¢¼\u000fYV\u00112u\u0092ù\u001f\u0093\u0002u:¾ª-D¿)\u0002ÒPÐ ª\u0015\u000f\u008dD1í\u0001\u0091\u0085Öö½q \u0084qª(8\u008aMQð¥0¹\u0006b\u0093ä[69ú¿ cQ\u008d\r\u00862»ñB\u0006\u0010+\u0099É«óH÷\u001d\t°\u009f\u009f\u0081\u0088D\u0085(G{÷ÌÀ\tTÛ.|0Ì\\\u009bFÝ½GçS\u009bä±;\u0084D2|õ\u0090®©Ï-»h\u0019\u0088\u0000\u0001 \u008b÷ªåWÆ\u0019Ê\u008f\u009aiÒ+)k0p¡{\u001cÅkôÕöWÐôQ\u0005õø\u0010Ç\u0098ãîé\u0083´\u0090\u0083]ä9^©$ø\u0010G;R×ÏfÄIRQZÌ´ôß+\u0010¦çço¤²u\u0011«\b1\u0006Ó{Î\u0014\u0018ø«\u0090ÑAúü®Å\\@Ä¢yñ*®¤ò©\u0084êÀ°\u0010Æ\u0011¾Ïî\u0012æ®ÐhaU\u0093õÉ\u0083(Ç{w=\u0089¨d\u0016a?\u0006ÙcZ\u0098Ù\u0001nËbö\u001dÙ»\u008b\u0000¦¢º4\u000bïß\u0086ù\u0095«H`»\u0010Õ\u0097\u001d\u008e;ì\u000e6Ï\u0010í\u0089&\u0095Î%\u0010~©\u008b\u0010GTë\u008f°Ì@\u0005Y\u0084ßÎ\u0010YCÎryÌ¸\u0000;_Ã7D\u0094\u0004Z\u00101!\u009a [ßªb\u0001ì\u0000µx)Óz\u0010Ã\u0096Ë\u0005§Þq\"\u001d·\u009c\u000e\t| R \u0085\u0082ñeÀ\u0086Ãºñ\u001eÓÿ¬\u0096(\u009f\u009bÏ¦3¥÷µo\u0018+q¥\u0015y+\u009d\u0010ïòpþ\u0016¼\u0013Ûu£Ô\u0007àè3\u009b\u0010%¤ô3aºF\u009f5%åý¼\u0015z\u009c0ùèTÃ\u0005W)K\u0018Ý¶\u008ee?@jräöÏã\u000eF4hT\r\u008a\u0010\u0015½\u0000ûö\u0097ÅVÄ4V@Í/ØÃÐõÿ\u0018\u000fÕ6«Ü\u008c~(\rplO\u0087Z~\r\u0083ï6¤ñ\u008dKÂ\u0010B\u0006×d\u0089@iîdnú½h®Ûº\u0010¬;¬\u0083ö6}\u001fÖ\u0005ÚLåNN\u00880\u0013\u0092 ÷mã\u0098k\u0096÷òë\u001e\u009d\u008fïÍ\\*\u008cÌò¾õ\u007fñûÁü¥Åº4¿5\u0014ô#*MõA2\u0005SpÈö\u0010%O\u0098z\u0017\u008b=\" \u00848(cà\u008aO\u00105\u0088Ë\u0095h\u008b@\u0092\\\u0097\u008e%\u0007\u0090\u0002\u0098\u0010úRø$\br\u009a¢ªY\u0089ÍlKYå\u0010*:O.(e\u001eÁ]ÿÒ`¤Ê6á\u0010\u0084¨O=\"±\u000e\u008füaÂ\u001aùC:<\u0010W¦'0àj\u0083U@ï´\u0099\u0088FÄ\u0019"
         .length();
      char var3 = ' ';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var27 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var27;
         if ((var2 += var3) >= var6) {
            var4 = "]\u0006æ§Î(n\u0000Á\u000eì\u0012\u008aÊÇ9\u0010\u001e\u008bð\u0081&7\u0095#^ÁO\u0088 \u009a÷\u0086";
            var6 = "]\u0006æ§Î(n\u0000Á\u000eì\u0012\u008aÊÇ9\u0010\u001e\u008bð\u0081&7\u0095#^ÁO\u0088 \u009a÷\u0086".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var29 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var25 = false;
               var7[var5++] = var29;
               if ((var2 += var3) >= var6) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[52];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII();
                  String[] var11 = new String[]{"hi", "hey", "hello", "yo", "oh hi", "oh hey", "hii", "heyy", "oh"};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf(var11);
                  var11 = new String[]{"wtf", "wth", "what", "bruh", "wait", "huh", "woah", "oh god", "?", "?", "bro what", "holy"};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var11);
                  var11 = new String[]{
                     "please don't",
                     "was on netflix",
                     "was watching youtube",
                     "was watching yt",
                     "sorry was distracted",
                     "wasn't looking",
                     "was on my phone sry",
                     "sorry i'm spacing out"
                  };
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var11);
                  var11 = new String[]{"i'm not macroing", "i'm legit", "i don't macro", "not cheating", "i'm human", "i swear i'm legit", "i don't cheat"};
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = CollectionsKt.listOf(var11);
                  var11 = new String[]{"lol", "lmao", "sob", "bro", "dude", "haha"};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = CollectionsKt.listOf(var11);
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public static int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      int var0 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
      return var0 == 0 ? 110 : 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15583;
      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII", var10);
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
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
            "me/octo/client/failsafes/llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
