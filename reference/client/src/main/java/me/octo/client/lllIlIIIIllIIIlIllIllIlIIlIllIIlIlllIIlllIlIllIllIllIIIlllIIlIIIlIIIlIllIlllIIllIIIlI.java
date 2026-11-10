package me.octo.client;

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
import kotlin.text.Regex;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI {
   @NotNull
   public static lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static List<String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Regex IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static boolean llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 33754106878238L;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

   private lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI() {
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var16 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 19365428954955L;
      boolean var19 = true;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var19);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[21];
      int var12 = 0;
      String var11 = "Êx\"3áa\u001dÆA×\u0080ð@Ä\u0094P(¢Ê<}p\u0006#u¾²\u0006|´\u0003ÂAIRéB«#\u001d±ÇÄ=\u0087DñÜÏìo\u009b\n\u0092p\u001c£\u0010ÀA\u009bEÁ¦\u009bµB\u0096tÌ(i\u0095\u0084\u0018ºÜ\u0006Im\u009dqçêã©\nìnN6Öäu&Ã\f´O\u0018þ\u0002)Õ¸\neS\u007f3\u0094\b®\u0085ôèF\u0010ª\u0083ì\bf88üÏI\u0095ávTPSW\u0086Ä_\u008e\u0087ó±\u008bô&ýÈb+\u0011h\u0093GºkºÙ7zÜ\u0088\t±\u0004\u0091ñ0!µ\u001f,Þ\u0002q¤êëê¼SZ8\u0099\u0082Î\u0012ò\"\u0013ÂùÎ\u0084Ê\n4gäÜ\u0083Ûc\u009c\u0000uì\u0082®L\u0081\"\u0091»\u008bm¨\u0085$\u0013\u001a\u00ad\u0088HÅÍ5¦\f+Í\u00995;\u0002\t\u0081]\b8\n\u008fM\u0081?%NnlO\u0092\u0097\u001aÍ\u008aìç\u008e}Ô¥\u009b8¨ <PGFã9\u0002å´½1U\u000bP\u0002B®\u009c\"¼5¦¾\u0004¸ÝÎF\fç6\u0018kVì\u0082\u0082Ù4×ò\u00104óbó.L±\u001f%s²ÖUN \u009e\u0013$çÁúAg\u0013\u0014êÀÐ\rl°rùÅkði\u00adìÝ=\t{\u0091\u0098¶õ(´êà\u0002ç\f-²f.Àdþ×)oÉf6ôµï9\u001b\u0017\u009c\u001d¢ph\"²ÚLÉþ?MÁl Ìå\tÔ\u00101Ã5¡\u00ade$ã\u0018\u001e\u008eÆM\u0014é¬AÏ©)\u0083\u0000§àîb\u0086 èþØù\u0006G\u0016C\u0005\u0015?\u001e_\u0014ÖDí(®¡ å¦sÙ-5ó\u0080¬\u001aÓ °M¿s?Ïò[\u001b¨[¢\u00057{Ñ!È\u008dKÿ%T÷\u0014<\rÌÕ{vù 9¥\u0091\u0083a*Aj£\u0017\u0087\u0018¾ã\u0084²-85\u0080äDg\u001d\u0004`\t:l7B\u0089 ËYTÊ\u001fJä\u009bu]ÅÁ\u008a ä\u0095öé\u0014íó\u0097áte\u008f\u0098LSÔ\u001d\u0017HöÔ©\u0092ø\u000eå}\n\u0017\u001cîÆ-¿¤¡y\u000bE6I>,«õª³b/Ôèð;u\u0092«6IqÔ\u0019Ò\u0014úcÙE9\u0015\u0080`\u0016E\u0019\u0087ë\u0098[\u008fÝµ\u0084×Ö\u0014¢\u0010û¿ñP0\r\u0014xX\u001dC\feOùÉ\u0011k\u00867%Ü3\u0081í3\u0004\u009b\u009e-<Î|}\u00957Á¤-ô<àÜú¥Êä\n&N°Ó\u00960<å¼åUm9nÚ\u001cÛ+ý\u0084\u0083ðµ\u0096÷\u008fLGÎÅöò\u0080\u008cýè;åê#²;Q2UTh\u009d\u008fMÎ\u008cðÍ";
      int var13 = "Êx\"3áa\u001dÆA×\u0080ð@Ä\u0094P(¢Ê<}p\u0006#u¾²\u0006|´\u0003ÂAIRéB«#\u001d±ÇÄ=\u0087DñÜÏìo\u009b\n\u0092p\u001c£\u0010ÀA\u009bEÁ¦\u009bµB\u0096tÌ(i\u0095\u0084\u0018ºÜ\u0006Im\u009dqçêã©\nìnN6Öäu&Ã\f´O\u0018þ\u0002)Õ¸\neS\u007f3\u0094\b®\u0085ôèF\u0010ª\u0083ì\bf88üÏI\u0095ávTPSW\u0086Ä_\u008e\u0087ó±\u008bô&ýÈb+\u0011h\u0093GºkºÙ7zÜ\u0088\t±\u0004\u0091ñ0!µ\u001f,Þ\u0002q¤êëê¼SZ8\u0099\u0082Î\u0012ò\"\u0013ÂùÎ\u0084Ê\n4gäÜ\u0083Ûc\u009c\u0000uì\u0082®L\u0081\"\u0091»\u008bm¨\u0085$\u0013\u001a\u00ad\u0088HÅÍ5¦\f+Í\u00995;\u0002\t\u0081]\b8\n\u008fM\u0081?%NnlO\u0092\u0097\u001aÍ\u008aìç\u008e}Ô¥\u009b8¨ <PGFã9\u0002å´½1U\u000bP\u0002B®\u009c\"¼5¦¾\u0004¸ÝÎF\fç6\u0018kVì\u0082\u0082Ù4×ò\u00104óbó.L±\u001f%s²ÖUN \u009e\u0013$çÁúAg\u0013\u0014êÀÐ\rl°rùÅkði\u00adìÝ=\t{\u0091\u0098¶õ(´êà\u0002ç\f-²f.Àdþ×)oÉf6ôµï9\u001b\u0017\u009c\u001d¢ph\"²ÚLÉþ?MÁl Ìå\tÔ\u00101Ã5¡\u00ade$ã\u0018\u001e\u008eÆM\u0014é¬AÏ©)\u0083\u0000§àîb\u0086 èþØù\u0006G\u0016C\u0005\u0015?\u001e_\u0014ÖDí(®¡ å¦sÙ-5ó\u0080¬\u001aÓ °M¿s?Ïò[\u001b¨[¢\u00057{Ñ!È\u008dKÿ%T÷\u0014<\rÌÕ{vù 9¥\u0091\u0083a*Aj£\u0017\u0087\u0018¾ã\u0084²-85\u0080äDg\u001d\u0004`\t:l7B\u0089 ËYTÊ\u001fJä\u009bu]ÅÁ\u008a ä\u0095öé\u0014íó\u0097áte\u008f\u0098LSÔ\u001d\u0017HöÔ©\u0092ø\u000eå}\n\u0017\u001cîÆ-¿¤¡y\u000bE6I>,«õª³b/Ôèð;u\u0092«6IqÔ\u0019Ò\u0014úcÙE9\u0015\u0080`\u0016E\u0019\u0087ë\u0098[\u008fÝµ\u0084×Ö\u0014¢\u0010û¿ñP0\r\u0014xX\u001dC\feOùÉ\u0011k\u00867%Ü3\u0081í3\u0004\u009b\u009e-<Î|}\u00957Á¤-ô<àÜú¥Êä\n&N°Ó\u00960<å¼åUm9nÚ\u001cÛ+ý\u0084\u0083ðµ\u0096÷\u008fLGÎÅöò\u0080\u008cýè;åê#²;Q2UTh\u009d\u008fMÎ\u008cðÍ"
         .length();
      char var10 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var33;
         if ((var9 += var10) >= var13) {
            var11 = "¸Ì\u0017¶Zá.ì9\u0099\u0086\u000f@\u008f\u0086-(~ô\u000fm&¥ïCÈ~r®\u0081´÷\\¹òÜ£\u0011¢\u00adS\u0096:\u0084\u009fÍs\u008d°\u0085 ê//\u009fë ";
            var13 = "¸Ì\u0017¶Zá.ì9\u0099\u0086\u000f@\u008f\u0086-(~ô\u000fm&¥ïCÈ~r®\u0081´÷\\¹òÜ£\u0011¢\u00adS\u0096:\u0084\u009fÍs\u008d°\u0085 ê//\u009fë "
               .length();
            var10 = '\u0010';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var35 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var30 = 0;
               var14[var12++] = var35;
               if ((var9 += var10) >= var13) {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var14;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[21];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 5368592857410877740L;
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
                  long var38 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var30 = -1;
                  long var0 = var38;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI();
                  String[] var18 = new String[]{"This server will restart soon", "Server restarting in", "The server is restarting", "Server is restarting"};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = CollectionsKt.listOf(var18);
                  var18 = new String[]{"EVACUATE", "evacuating to"};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var18);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var0;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex("^(?:Guild|Party|Co-op|Officer) >");
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex("^(?:From|To) ");
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new Regex("(?:^|] )[A-Za-z0-9_]{1,16}: ");
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
   }

   public static boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public static boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      boolean var0 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      return !var0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 813;
      if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI", var10);
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
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
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
            "me/octo/client/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$878fffc79b6ca53e(
      long param1, String param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
