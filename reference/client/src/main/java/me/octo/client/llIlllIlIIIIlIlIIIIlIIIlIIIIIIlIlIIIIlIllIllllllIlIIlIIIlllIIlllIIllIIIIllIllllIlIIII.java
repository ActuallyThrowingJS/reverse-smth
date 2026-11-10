package me.octo.client;

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
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import org.jetbrains.annotations.NotNull;

public final class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII {
   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Regex lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 69509525181985L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII() {
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 53207883533891L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[24];
      int var5 = 0;
      String var4 = "3\u001ae\u00adq\u009f>ÁÐBT\u0018\t$\u0096, ¾÷\u0086\bÉ\u009f\u0004\t\u0016)÷\u009eø \u001d\u0097øÓP19\u0007\u0006\u009cÀ\u001b\u0011ÆÜÄ:\u0094\u0010\u0016'\u008e~Ý®U\u009a,\u0098ù\"\u0011\u001c3*\u0010è¢þÅ\u008dnÐ\u0087\u0095ÌÇÄ ßúF\u00104<Ð\u0092\u001b·\u008d-´\u0005\u0015\u001b\u0086²X\u0019\u0010\u0089$\u0088mB!g8§\u009e¾\u0013\u000bè\u001f)\u0010ØÕ¾\u009cÍb$t\u0090\n\u0085ÏQÍN·ŀC:¬\u0001Ò\u0080\u009eû5úè\u0087Ç»Ö6&ÛàæN\u0096\u001fw\u0016o¿=ñb¯m©\u0018³¶\u0014\u000f\u0090ë¹®\u000e÷eSt!¬G6yôô\u0003¶¸(uÛklË'Ê8QäðT\u0000öï°Â°:ù\u0088\u0092Ô\u0001ð)Ð²î\t\u00949;á¤(\u009aëà\u008a\u0000¸\u0087²#Ò\u0019ÞèT\u00926ÛA\u0013\u0094ê¯;H\u008eEÂz4Ä\u009a|ÆVã¿-D|¨+]T\u008c1¼QgÍ\t6î\u0010{\u0080\u008bsùhÓè\u001dÑåäµ\u0088W(\u0007£Zò\u001b\u008be\u0002\u007f$d\u0007§\u0094º\u0098J7U,»[ä\u000bÖ^\u00880³:ìE\u000eÒr\u0096\u007fËÒþ¢¨¹¶\u001b\u0086\u0013>×\n²ä\u0085oAÛÐÊUÅsfå|â¦ÇíM³8»¬;\u001e¡-\n\u0002<Ó¹ì<=e¡]gL\u0013\u0089Éy(Á»\u0084º:\u0085\b£EÆ¿wÑ2ñ\u0087\u008bI\u008e^\u0090\u001eP`(\u009dkÃ\u0086a\r¨~µ\u007f\u0080d\bö\u0014ß\u0002Ö\u0082¨\u00adt?P÷;\u0015Ò\u0012cVÃv\u0015;#%\u0010\u0084ã12\u0007OÆÙÝ¯iÍF\u00ad>\u0003 6Uk\u0097ÉÝ<\u0098\u009fû;\n\u001apÜc\u008dj0ë\u0085hÇ]\u0007µ\n\u008b\"Nk (\u0007%Ã\tÓÐñÉê6ì`ó)>ÿ\u008aO\u0003NÄÈ\nd\\¡!\u008c«aÇ©,}èF_.Z\u00120bög·«9°\u0012P\u0015\u0010\u00847|L\u0011\u0001×\u001c!\u000eð\u009föPF%\u001f¸ù©Rå@\u0004\u0085¬ë\u000eÇÕµ¹\u0015\u0018æ¨  üõ\u0081íü²\u0081 ×»»ßÈ\u0083KÑ ÓÂ\u001flzaï¹\u0096\"®-º\u009c#\u0010Y\u0084_4\u0014ÐøÏd\"BÝi\u0013\u0084¦\u0010E\u0003d\u009eBs}£\u0014\u0092\u0017Y\u008b8é\u0012\u0010É=óæVCX\u0007yTíIÐÇ\\3\u0018SàF;ã+Ø½\u008cMW\u0099Kf7\u00ad\u00944R\u0095&ª{Í(ÔgNâl\u0084óTóLÇOLV.¥hÇ\u0010\u001bM\u0097ßÐê/\u008aðîb\u0003a \u001aôeú¦!O\u0010+\u008då\u0010d\u0082C]m\u0083\u0011ü\u00970{& jà\u0003yê\u0083\u0081\u001b©<$\u0018àk\u000bL<\u0019t2\u0005>\u001eL\u0088Zæ±\u001d\u0016\u008dÆ\u0010\u0006øgðD%U\u0099ÙF*<\u0002®v¨0\u0090\rs¸¥.\u0087\u0019\u0099b\f~,£\u0084EÑL\bÿ$\u008a¦\u0085ûCá\u009e¾£\u0097\u00admø4¡e>ÊÄË \u0003º\u0007W@\u0004";
      int var6 = "3\u001ae\u00adq\u009f>ÁÐBT\u0018\t$\u0096, ¾÷\u0086\bÉ\u009f\u0004\t\u0016)÷\u009eø \u001d\u0097øÓP19\u0007\u0006\u009cÀ\u001b\u0011ÆÜÄ:\u0094\u0010\u0016'\u008e~Ý®U\u009a,\u0098ù\"\u0011\u001c3*\u0010è¢þÅ\u008dnÐ\u0087\u0095ÌÇÄ ßúF\u00104<Ð\u0092\u001b·\u008d-´\u0005\u0015\u001b\u0086²X\u0019\u0010\u0089$\u0088mB!g8§\u009e¾\u0013\u000bè\u001f)\u0010ØÕ¾\u009cÍb$t\u0090\n\u0085ÏQÍN·ŀC:¬\u0001Ò\u0080\u009eû5úè\u0087Ç»Ö6&ÛàæN\u0096\u001fw\u0016o¿=ñb¯m©\u0018³¶\u0014\u000f\u0090ë¹®\u000e÷eSt!¬G6yôô\u0003¶¸(uÛklË'Ê8QäðT\u0000öï°Â°:ù\u0088\u0092Ô\u0001ð)Ð²î\t\u00949;á¤(\u009aëà\u008a\u0000¸\u0087²#Ò\u0019ÞèT\u00926ÛA\u0013\u0094ê¯;H\u008eEÂz4Ä\u009a|ÆVã¿-D|¨+]T\u008c1¼QgÍ\t6î\u0010{\u0080\u008bsùhÓè\u001dÑåäµ\u0088W(\u0007£Zò\u001b\u008be\u0002\u007f$d\u0007§\u0094º\u0098J7U,»[ä\u000bÖ^\u00880³:ìE\u000eÒr\u0096\u007fËÒþ¢¨¹¶\u001b\u0086\u0013>×\n²ä\u0085oAÛÐÊUÅsfå|â¦ÇíM³8»¬;\u001e¡-\n\u0002<Ó¹ì<=e¡]gL\u0013\u0089Éy(Á»\u0084º:\u0085\b£EÆ¿wÑ2ñ\u0087\u008bI\u008e^\u0090\u001eP`(\u009dkÃ\u0086a\r¨~µ\u007f\u0080d\bö\u0014ß\u0002Ö\u0082¨\u00adt?P÷;\u0015Ò\u0012cVÃv\u0015;#%\u0010\u0084ã12\u0007OÆÙÝ¯iÍF\u00ad>\u0003 6Uk\u0097ÉÝ<\u0098\u009fû;\n\u001apÜc\u008dj0ë\u0085hÇ]\u0007µ\n\u008b\"Nk (\u0007%Ã\tÓÐñÉê6ì`ó)>ÿ\u008aO\u0003NÄÈ\nd\\¡!\u008c«aÇ©,}èF_.Z\u00120bög·«9°\u0012P\u0015\u0010\u00847|L\u0011\u0001×\u001c!\u000eð\u009föPF%\u001f¸ù©Rå@\u0004\u0085¬ë\u000eÇÕµ¹\u0015\u0018æ¨  üõ\u0081íü²\u0081 ×»»ßÈ\u0083KÑ ÓÂ\u001flzaï¹\u0096\"®-º\u009c#\u0010Y\u0084_4\u0014ÐøÏd\"BÝi\u0013\u0084¦\u0010E\u0003d\u009eBs}£\u0014\u0092\u0017Y\u008b8é\u0012\u0010É=óæVCX\u0007yTíIÐÇ\\3\u0018SàF;ã+Ø½\u008cMW\u0099Kf7\u00ad\u00944R\u0095&ª{Í(ÔgNâl\u0084óTóLÇOLV.¥hÇ\u0010\u001bM\u0097ßÐê/\u008aðîb\u0003a \u001aôeú¦!O\u0010+\u008då\u0010d\u0082C]m\u0083\u0011ü\u00970{& jà\u0003yê\u0083\u0081\u001b©<$\u0018àk\u000bL<\u0019t2\u0005>\u001eL\u0088Zæ±\u001d\u0016\u008dÆ\u0010\u0006øgðD%U\u0099ÙF*<\u0002®v¨0\u0090\rs¸¥.\u0087\u0019\u0099b\f~,£\u0084EÑL\bÿ$\u008a¦\u0085ûCá\u009e¾£\u0097\u00admø4¡e>ÊÄË \u0003º\u0007W@\u0004"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[24];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Regex(
                        "You are temporarily banned for ([\\dhdms\\s]+) from this server!\\s+Reason: (.+?)\\.\\s+Find out more: https://www\\.hypixel\\.net/appeal\\s+Ban ID: #(\\w+)\\s+Sharing your Ban ID may affect the processing of your appeal!",
                        RegexOption.DOT_MATCHES_ALL
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "É¢X\u0086ìPð\u00ad ¶\u009f\b\u008eó¢\u009dKì\u009d>H-Ãú\u0018\u001e\\]ÌÅôºs\u0097\b\u0019\u0088Ñ©\u001c\u0094@à¸ -ÿ\tU";
                  var6 = "É¢X\u0086ìPð\u00ad ¶\u009f\b\u008eó¢\u009dKì\u009d>H-Ãú\u0018\u001e\\]ÌÅôºs\u0097\b\u0019\u0088Ñ©\u001c\u0094@à¸ -ÿ\tU".length();
                  var3 = 24;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5758;
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
            throw new RuntimeException("me/octo/client/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII", var10);
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
            "me/octo/client/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }
}
