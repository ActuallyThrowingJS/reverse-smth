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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   @NotNull
   public static IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Set<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Set<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Set<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 40880993475846L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   private IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI() {
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(List param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull String param3, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 43507240434483L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[65];
      int var5 = 0;
      String var4 = "jîc§R\u0097J¾ªjoGÑDu\r\u0010|ú$\u0083\u009e~ç\u0010ê\u008f:ù\u000eä°4\u0018°òFL\u008b~Ëä(\u009d¨KH\u0002|\u0085h\u008a\u0014¡6\u001d»\u008d pm\u008bÆ¨!ç{62RÔ2<\u007fÔú!\u009c±ñÛÓ\u00adÂ\u009d=1\f\u00adÂÄ\u0010\u008aÍÃ\u0010¤NÛy\u0016\u0010¡\u0089Å\u009c\u000el\u0010\u0001\f\u0090HÈ×[Íwe/\u009fÒfG*\u0010¸GÓqî\u0085ê\u008aä.vç\u0014É?\u009a mw\u001fçõ44\"?xË\u009d\u009d¢\té%J\u0010¯'ûº\u0092\u0081a\u0004K!Ù\u001ar\u0010m®\u0014*Ý\u008aÚË\u0004<§úÐ\u0018²3\u0010àZV*Pº²C§_¬\u0094ÃùúÎ \u008b¹Ã¡\u001b\u000e\u0084ðËE\u0013C\u00836È=l®¸ÈoP\":_ât\u0091\u008c«\t\u008e\u0018\u0010SjXoà\u0082\u001aéÊOgð\n\u000e^Ç2Ùw¹9{\u0014\u0010«\u0005ü½,h2[Ý<[\u008bñ!fd\u0010\u0005Hó²³~;\u0017\u001d}õ\u0080\u007f\u0085\t7\u0010B½\u0003\u001f}C\u00963#xàz\u001b]Dù\u0010÷\u0098ñ\u008e\u0019\u008a k\n8hO\u0095\u0089\u008bM\u0010\u0085ÅS>ÄR¼³Kw\u001f)\u0090â¤<\u0010G+·¬mP}ÕÜjú£\u0082\u0096iÖ\u0010ÌÒÂÀ\u009f\u00ad\u0090\u00ad-Ç7Ào\u008daÔ\u0010Z\tN\u000eh\u0090\u0017QÞüZÞ\u0015àÏ9\u0010\u0081)\u0091\u001a\u009c\u0013i\u0092Å=\r\u008d\u0081~·¹\u0010ÁCi\\à%\u0014\"\u0014y\nØ\u000ePWé\u0010{\u00030\u0012øow-PêÜH\r¼O·\u0010¬Ð\u0012¯£â;\u0081\u0088È\u000b ¬2Å\"\u0010´p\u001c\u001cQNdT¼J\u0000\u0090¼\u0003\u008d\u0091 ¶\u000fËU\u009f?·\u0085\u0082\u0007ý\u000b\u0016\u0019¸\u0013\u007f\u000bINM\u009cdB\u0014z\r^§~ªù\u0010ø\u009eÍ\u009b·ßN\u000eÌ\u0083IàVÀc\u0085\u0010!>±_C½éé½Ü\u0019ÄÆ\u009drH\u0010ÊÛl©§¸9T\u0081b$¹ïRO\u0092\u0010K\nièX\u0092é\u0092Õ¹Þ\u0095ZÐLo\u0010±¶h\u0098zï^¶iu©Ñ¼\bÇ¾\u0018ø\u0089]!\u0006v\u007f\u0089n(%\u009cÝ\u009c\u001e\u001ba\u0087{nô\u008d \u0093\u0010Ï\u0007\u0091ïV\u0004\u001a§\u0083\u009fü\u008cO8M \u00106·¢ÂÃ¶ÿ\u0005¿;\u008eö±ù\u009bæ\u0010V\u0081¿\u009c\u009eË\u0086ê\u000eÍ=\u0004\u0085&rÔ nÑø\u0000=\u009c^]Pc,\u0096Êù\u001còIË+ß[a\u0001ÿ¯èò<`i(\u0001\u0010\u0085mÚµ]HCÛhö\u009fa©}b¡\u00107¥\u009bÉõuØÀ}\u0093:ê\u0091¿\u0093â\u0010\u0005\u0015¾u|\u0083åZ\u009aºÙ7nVõö ý\u0085Ù\u007f\u000fñÊñM\u0086\u0010Ö\u0010\u009d¨÷§À<\u0095\u0084º¥Ù?ìæ?\u008cìv\u0093\u0010\u0080Ë\u008e\u0099\u0096Ç~äÄètN@_\u000e\u0091\u0010\u0093Iö\u009flÒè^\u0086XÎo(-ob\u0010ãN\u001báô\u008f\u0004^V1úï\u0087\u0007d÷\u0010°\u0018\u0016üx¾\u008eïbu¿s3Dõt\u0010.%tÅßÅ\u008d×9óFÈE÷\u0099ù\u0010ª{\u0002ùáqõã¢\u0003²Îx\u0098_Ã\u0010J½\u0080\\{Òå¿\u0097\u009e5ÛÍz¸ó\u0010\u0012_ /\u001d\u0087:\t3\u0098\u0013;¶\u001d\u0098\u0083\u0010sàH\u0097× ïSFÊp#\u0011Û\u000f]\u0010\u0097H\u0084<;oCõBOC¦M\u009fÎp\u0010ðùúÚ\u007fä\r-\u0001}\u0097p\u0004×¶2\u0010çùb]{TqiN»ð;\u0082\u008c4À\u0010£qÍdlÁÒPÎÝh\u0014ø\u008d\r¨\u0018\u0084¸Ñ*\u0018Î\u0092\u0017x\u008cÞ¯ÿì¡à°wÆô\u00978l\u001a\u0010ÖQ\u0013å.tÄçã¡o]8G{z\u0018Ô\t¤\u000b\fI©Cýa=G\u0098§Kö}íæu\u0019j\u0093;\u0010×W\\\u001ahþ£¤ÓÃå\u0090kÛx\u0001\u0010\u009d»«.ÇÛX\u0092!ÀÖJ\u0016ó-\u009e\u0010ßÉ¿ïâ%+\n&¿ò\u001e\u000e¤×\u001d\u0010'´\u0082BÛû°H\u0001öÅpñ\u000fqU\u0010Ý\u009c(\fø\u000fÁK¤æ\u0015Ã\r\u009e\b\u008f\u0010M-ì\t(IÙ,\u0090«ß\u009c4f\u00ad\u0089\u0010\\Ø\u001aº)4h»\u0094\"\u0089\u009a\u0002u\u00adñ";
      int var6 = "jîc§R\u0097J¾ªjoGÑDu\r\u0010|ú$\u0083\u009e~ç\u0010ê\u008f:ù\u000eä°4\u0018°òFL\u008b~Ëä(\u009d¨KH\u0002|\u0085h\u008a\u0014¡6\u001d»\u008d pm\u008bÆ¨!ç{62RÔ2<\u007fÔú!\u009c±ñÛÓ\u00adÂ\u009d=1\f\u00adÂÄ\u0010\u008aÍÃ\u0010¤NÛy\u0016\u0010¡\u0089Å\u009c\u000el\u0010\u0001\f\u0090HÈ×[Íwe/\u009fÒfG*\u0010¸GÓqî\u0085ê\u008aä.vç\u0014É?\u009a mw\u001fçõ44\"?xË\u009d\u009d¢\té%J\u0010¯'ûº\u0092\u0081a\u0004K!Ù\u001ar\u0010m®\u0014*Ý\u008aÚË\u0004<§úÐ\u0018²3\u0010àZV*Pº²C§_¬\u0094ÃùúÎ \u008b¹Ã¡\u001b\u000e\u0084ðËE\u0013C\u00836È=l®¸ÈoP\":_ât\u0091\u008c«\t\u008e\u0018\u0010SjXoà\u0082\u001aéÊOgð\n\u000e^Ç2Ùw¹9{\u0014\u0010«\u0005ü½,h2[Ý<[\u008bñ!fd\u0010\u0005Hó²³~;\u0017\u001d}õ\u0080\u007f\u0085\t7\u0010B½\u0003\u001f}C\u00963#xàz\u001b]Dù\u0010÷\u0098ñ\u008e\u0019\u008a k\n8hO\u0095\u0089\u008bM\u0010\u0085ÅS>ÄR¼³Kw\u001f)\u0090â¤<\u0010G+·¬mP}ÕÜjú£\u0082\u0096iÖ\u0010ÌÒÂÀ\u009f\u00ad\u0090\u00ad-Ç7Ào\u008daÔ\u0010Z\tN\u000eh\u0090\u0017QÞüZÞ\u0015àÏ9\u0010\u0081)\u0091\u001a\u009c\u0013i\u0092Å=\r\u008d\u0081~·¹\u0010ÁCi\\à%\u0014\"\u0014y\nØ\u000ePWé\u0010{\u00030\u0012øow-PêÜH\r¼O·\u0010¬Ð\u0012¯£â;\u0081\u0088È\u000b ¬2Å\"\u0010´p\u001c\u001cQNdT¼J\u0000\u0090¼\u0003\u008d\u0091 ¶\u000fËU\u009f?·\u0085\u0082\u0007ý\u000b\u0016\u0019¸\u0013\u007f\u000bINM\u009cdB\u0014z\r^§~ªù\u0010ø\u009eÍ\u009b·ßN\u000eÌ\u0083IàVÀc\u0085\u0010!>±_C½éé½Ü\u0019ÄÆ\u009drH\u0010ÊÛl©§¸9T\u0081b$¹ïRO\u0092\u0010K\nièX\u0092é\u0092Õ¹Þ\u0095ZÐLo\u0010±¶h\u0098zï^¶iu©Ñ¼\bÇ¾\u0018ø\u0089]!\u0006v\u007f\u0089n(%\u009cÝ\u009c\u001e\u001ba\u0087{nô\u008d \u0093\u0010Ï\u0007\u0091ïV\u0004\u001a§\u0083\u009fü\u008cO8M \u00106·¢ÂÃ¶ÿ\u0005¿;\u008eö±ù\u009bæ\u0010V\u0081¿\u009c\u009eË\u0086ê\u000eÍ=\u0004\u0085&rÔ nÑø\u0000=\u009c^]Pc,\u0096Êù\u001còIË+ß[a\u0001ÿ¯èò<`i(\u0001\u0010\u0085mÚµ]HCÛhö\u009fa©}b¡\u00107¥\u009bÉõuØÀ}\u0093:ê\u0091¿\u0093â\u0010\u0005\u0015¾u|\u0083åZ\u009aºÙ7nVõö ý\u0085Ù\u007f\u000fñÊñM\u0086\u0010Ö\u0010\u009d¨÷§À<\u0095\u0084º¥Ù?ìæ?\u008cìv\u0093\u0010\u0080Ë\u008e\u0099\u0096Ç~äÄètN@_\u000e\u0091\u0010\u0093Iö\u009flÒè^\u0086XÎo(-ob\u0010ãN\u001báô\u008f\u0004^V1úï\u0087\u0007d÷\u0010°\u0018\u0016üx¾\u008eïbu¿s3Dõt\u0010.%tÅßÅ\u008d×9óFÈE÷\u0099ù\u0010ª{\u0002ùáqõã¢\u0003²Îx\u0098_Ã\u0010J½\u0080\\{Òå¿\u0097\u009e5ÛÍz¸ó\u0010\u0012_ /\u001d\u0087:\t3\u0098\u0013;¶\u001d\u0098\u0083\u0010sàH\u0097× ïSFÊp#\u0011Û\u000f]\u0010\u0097H\u0084<;oCõBOC¦M\u009fÎp\u0010ðùúÚ\u007fä\r-\u0001}\u0097p\u0004×¶2\u0010çùb]{TqiN»ð;\u0082\u008c4À\u0010£qÍdlÁÒPÎÝh\u0014ø\u008d\r¨\u0018\u0084¸Ñ*\u0018Î\u0092\u0017x\u008cÞ¯ÿì¡à°wÆô\u00978l\u001a\u0010ÖQ\u0013å.tÄçã¡o]8G{z\u0018Ô\t¤\u000b\fI©Cýa=G\u0098§Kö}íæu\u0019j\u0093;\u0010×W\\\u001ahþ£¤ÓÃå\u0090kÛx\u0001\u0010\u009d»«.ÇÛX\u0092!ÀÖJ\u0016ó-\u009e\u0010ßÉ¿ïâ%+\n&¿ò\u001e\u000e¤×\u001d\u0010'´\u0082BÛû°H\u0001öÅpñ\u000fqU\u0010Ý\u009c(\fø\u000fÁK¤æ\u0015Ã\r\u009e\b\u008f\u0010M-ì\t(IÙ,\u0090«ß\u009c4f\u00ad\u0089\u0010\\Ø\u001aº)4h»\u0094\"\u0089\u009a\u0002u\u00adñ"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var24;
         if ((var2 += var3) >= var6) {
            var4 = "£}çð\u009eî\u008a\u0006?Y«j½v¸& lO.±WÚ\u0016£ìEó\u00adß_l\u001cë\u0092\fÕ\fq£µÇÄ°2ÛÏmÙ";
            var6 = "£}çð\u009eî\u008a\u0006?Y«j½v¸& lO.±WÚ\u0016£ìEó\u00adß_l\u001cë\u0092\fÕ\fq£µÇÄ°2ÛÏmÙ".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var26 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var22 = false;
               var7[var5++] = var26;
               if ((var2 += var3) >= var6) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[65];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI();
                  String[] var11 = new String[]{
                     "var",
                     "let",
                     "const",
                     "function",
                     "return",
                     "if",
                     "else",
                     "for",
                     "while",
                     "do",
                     "break",
                     "continue",
                     "new",
                     "this",
                     "typeof",
                     "instanceof",
                     "in",
                     "of",
                     "switch",
                     "case",
                     "default",
                     "try",
                     "catch",
                     "finally",
                     "throw",
                     "class",
                     "extends",
                     "super",
                     "null",
                     "true",
                     "false",
                     "undefined",
                     "void",
                     "delete",
                     "yield",
                     "async",
                     "await"
                  };
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = SetsKt.setOf(var11);
                  var11 = new String[]{
                     "macro",
                     "module",
                     "player",
                     "nav",
                     "skyblock",
                     "rotation",
                     "render",
                     "esp",
                     "notification",
                     "client",
                     "etherwarp",
                     "script",
                     "on",
                     "console",
                     "action",
                     "packet"
                  };
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = SetsKt.setOf(var11);
                  var11 = new String[]{"this", "true", "false", "null", "undefined", "super"};
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = SetsKt.setOf(var11);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26266;
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
            throw new RuntimeException("me/octo/client/gui/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI", var10);
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
            "me/octo/client/gui/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   public static enum IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      DEFAULT,
      KEYWORD,
      STRING,
      COMMENT,
      NUMBER,
      API,
      PUNCT;

      @NotNull
      public static EnumEntries<IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 85898250703445L ^ 95038167613500L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[7];
         int var6 = 0;
         String var5 = ")Øcjá\u009cZV\b\u000buF Dk*\u008e\b\u0003\rB\u0002û\u009dÔ8\b¸îÒ\\l\u0013Ê\r\bÄõn\u008d\u0015!\u0003S";
         int var7 = ")Øcjá\u009cZV\b\u000buF Dk*\u008e\b\u0003\rB\u0002û\u009dÔ8\b¸îÒ\\l\u0013Ê\r\bÄõn\u008d\u0015!\u0003S".length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var21;
            if ((var3 += var4) >= var7) {
               var5 = ">r,\u0086\u0094\u0012\u001f\u001c\bks¬\u008bãÏ©`";
               var7 = ">r,\u0086\u0094\u0012\u001f\u001c\bks¬\u008bãÏ©`".length();
               var4 = '\b';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var19 = false;
                  var0[var6++] = var23;
                  if ((var3 += var4) >= var7) {
                     DEFAULT = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     KEYWORD = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     STRING = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     COMMENT = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     NUMBER = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     API = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     PUNCT = new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(

                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final String text;
      @NotNull
      private final IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll kind;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 5460122868671L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String textArg,
         @NotNull IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll kindArg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 81215274707864L;
         Intrinsics.checkNotNullParameter(textArg, "text");
         Intrinsics.checkNotNullParameter(kindArg, "kind");
         super();
         this.text = textArg;
         this.kind = kindArg;
      }

      @NotNull
      public final String getText() {
         return this.text;
      }

      @NotNull
      public final IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll getKind() {
         return this.kind;
      }

      @NotNull
      public final IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1,
         long var2,
         @NotNull IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(21767, 3905671620200339093L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(19804, 335150141952855755L ^ var2)
         );
         return new IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 8083936107750L;
         return "Tok(text=" + this.text + ", kind=" + this.kind + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.text.hashCode();
         return var1 * 31 + this.kind.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 85892001112615L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[6];
         int var7 = 0;
         String var6 = "\u00843j¯t:Åd°\u001a#æ¦§\u008c\u008c\u0010o\fÐM½Ð\u0015;,\u009dÂ\u000e\u001f \u009e=\u0010\u008bt¡B\b\u001b\u0005«<ìÖ\u0087Ë\u0095\u0013ä \u0095õÝ/SºOf¤ª\u009d\u0080\t\u009fsó)\u009e¯P!\u000b¼ºPt\u00071ø7\u0017\u0004";
         int var8 = "\u00843j¯t:Åd°\u001a#æ¦§\u008c\u008c\u0010o\fÐM½Ð\u0015;,\u009dÂ\u000e\u001f \u009e=\u0010\u008bt¡B\b\u001b\u0005«<ìÖ\u0087Ë\u0095\u0013ä \u0095õÝ/SºOf¤ª\u009d\u0080\t\u009fsó)\u009e¯P!\u000b¼ºPt\u00071ø7\u0017\u0004"
            .length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "º3Ho\u0018[\u009d\u0014\u000f×\u009dn1Úõ\u0018\u0010Ó O¿ðg\u008cBE!^P\u009e)7i";
               var8 = "º3Ho\u0018[\u009d\u0014\u000f×\u009dn1Úõ\u0018\u0010Ó O¿ðg\u008cBE!^P\u009e)7i".length();
               var5 = '\u0010';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[6];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 28391;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/gui/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
               "me/octo/client/gui/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
