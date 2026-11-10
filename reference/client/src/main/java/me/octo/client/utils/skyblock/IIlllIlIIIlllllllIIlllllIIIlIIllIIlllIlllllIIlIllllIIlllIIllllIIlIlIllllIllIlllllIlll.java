package me.octo.client.utils.skyblock;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.client.TabListUtils;
import org.jetbrains.annotations.NotNull;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 78708660846511L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   @NotNull
   public final BigDecimal IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var3 = var1 ^ 573121325323L;
      long var5 = var1 ^ 109823679226461L;
      int var7 = (int)((var1 ^ 124349774772499L) >>> 48);
      long var8 = (var1 ^ 124349774772499L) << 16 >>> 16;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5915002962789965179L, var1
      );
      Iterable var11 = CollectionsKt.asReversed(
         TabListUtils.INSTANCE.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((char)var7, var8)
      );
      String var10 = var10000;
      boolean var12 = false;
      Iterator var13 = var11.iterator();

      String var15;
      label44: {
         while (true) {
            if (var13.hasNext()) {
               Object var14 = var13.next();
               var15 = (String)var14;
               if (var10 != null) {
                  break;
               }

               boolean var16 = false;

               try {
                  if (var10 == null
                     && StringsKt.contains$default(
                        var15,
                        llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(15784, 8376195139032708870L ^ var1),
                        false,
                        2,
                        null
                     )) {
                     break label44;
                  }
               } catch (NumberFormatException var22) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var22, 5804258142169889502L, var1
                  );
               }

               if (var10 == null) {
                  continue;
               }
            }

            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
               var5, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(21478, 5988442227369679193L ^ var1)
            );
            break;
         }

         try {
            BigDecimal var28 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(
               BigDecimal.ZERO, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(10424, 367745580182888990L ^ var1)
            );
            if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  5800804398181609439L, var1
               )
               == null) {
               lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  "sRCW3b", 6039874955102639998L, var1
               );
            }

            return var28;
         } catch (NumberFormatException var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, 5804258142169889502L, var1
            );
         }
      }

      CharSequence var17 = StringsKt.replace$default(
         var15,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(29356, 7423118523326904334L ^ var1),
         "",
         false,
         4,
         null
      );
      Regex var18 = new Regex(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(21061, 1371100443230574843L ^ var1));
      String var19 = "";
      String var20 = var18.replace(var17, var19);
      IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var27 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      var17 = StringsKt.replace$default(
         var15,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(29356, 7423118523326904334L ^ var1),
         "",
         false,
         4,
         null
      );
      var18 = new Regex(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"q">(16108, 2224175835635315791L ^ var1));
      var19 = "";
      return var27.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var18.replace(var17, var19));
   }

   @NotNull
   public final BigDecimal IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final BigDecimal IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 4078078055507L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "bÒâ¢¸\u0088rº¯Ñ#¤Oþ\u0098ûJL\u0098\u008a\u008fÎå*\u0010aÂr\u008fÍºÁ=§\u0000d±½jiI\u0010HXuçI³6\u0014µ8%=ã<Å(\u0010Ó±ÿ\u001bèx\\í¹\u0090aHb8!\u0003\u00109\u0093[±\u0015ó;ì_\u008bÞ\u0010ZS á\u0010oÙ4\u0082\u009f[~]ñG9QÚó\\q z\u0005\rcÉB\u001d×× F\u0002{Q4àC¼\u009dÍeFf(¨Ç\u009e-Ðo\u009a\u0084\u0010%°,Túêàã\u009cÎ\u0081\u0080uNtU\u0010\u009f\u001b4rà\u0087\u0015ý²4\u008e\u0014³Î\u008dØ\u0010\u009f\u0017\u0081\u0084XKÆa~ÀËeu'º±\u00101ÄeºFå\u0089và×>©é¶Kâ0aúi\u0096¬\u0098Ø÷h\u008d/\rèf\u0096òåÜk×E\ró\u0005¶Ó\u0099\u0093È¦5M\n*/G\u0090éR-\bùTì\nÏ\fá\u0010É^]8\u0099\u008ac\u0083{KR\u0015\u008d\u001fîy\u0010\u0082ÿcÙ@aR\u0086Ø>ùzl[\u009fõP/\u0085ã|ÁýPI\u008d[ÿÃæ\u000e¶ÖIlÖê\u008a\u000fÄ;³\tîÇùÑ\u008b$G^\u008d®o'\u0086~\u0083§ó©ï~W~8Ñ\u0004k¤õðü±GÚW¸\u000f¦¥îâ\u0088ÏfÔ¥\u0097\u0018ä\u0081´û\u0015õ×P\u0018ìÕ\u008a$d\u00899×Ý\u0019û\u0087\u0017Á³\u001bÆ^C\u0094k\u008dÚ°ØßZú©>9¹Ü\u0018ñæÃ2Jÿä«Ô-ý*SÒ?)Ù\u0095À¬ð=,è¡Q\böÈÄ\u009e§'dêD\u0003\u008eáy\u0014cÞoÈ@Xe÷\u0089é÷¼Á\u0003w37w -\u0011n¾G¢´\u0010gqx¢þïÞP$¼GÌü\f\u009fR2\u008aVÍ\\\u0099Ö «\u0014I\u008c2\u0095yEtÊL\u0099\u0086$\u0016Dß\u0018";
      int var8 = "bÒâ¢¸\u0088rº¯Ñ#¤Oþ\u0098ûJL\u0098\u008a\u008fÎå*\u0010aÂr\u008fÍºÁ=§\u0000d±½jiI\u0010HXuçI³6\u0014µ8%=ã<Å(\u0010Ó±ÿ\u001bèx\\í¹\u0090aHb8!\u0003\u00109\u0093[±\u0015ó;ì_\u008bÞ\u0010ZS á\u0010oÙ4\u0082\u009f[~]ñG9QÚó\\q z\u0005\rcÉB\u001d×× F\u0002{Q4àC¼\u009dÍeFf(¨Ç\u009e-Ðo\u009a\u0084\u0010%°,Túêàã\u009cÎ\u0081\u0080uNtU\u0010\u009f\u001b4rà\u0087\u0015ý²4\u008e\u0014³Î\u008dØ\u0010\u009f\u0017\u0081\u0084XKÆa~ÀËeu'º±\u00101ÄeºFå\u0089và×>©é¶Kâ0aúi\u0096¬\u0098Ø÷h\u008d/\rèf\u0096òåÜk×E\ró\u0005¶Ó\u0099\u0093È¦5M\n*/G\u0090éR-\bùTì\nÏ\fá\u0010É^]8\u0099\u008ac\u0083{KR\u0015\u008d\u001fîy\u0010\u0082ÿcÙ@aR\u0086Ø>ùzl[\u009fõP/\u0085ã|ÁýPI\u008d[ÿÃæ\u000e¶ÖIlÖê\u008a\u000fÄ;³\tîÇùÑ\u008b$G^\u008d®o'\u0086~\u0083§ó©ï~W~8Ñ\u0004k¤õðü±GÚW¸\u000f¦¥îâ\u0088ÏfÔ¥\u0097\u0018ä\u0081´û\u0015õ×P\u0018ìÕ\u008a$d\u00899×Ý\u0019û\u0087\u0017Á³\u001bÆ^C\u0094k\u008dÚ°ØßZú©>9¹Ü\u0018ñæÃ2Jÿä«Ô-ý*SÒ?)Ù\u0095À¬ð=,è¡Q\böÈÄ\u009e§'dêD\u0003\u008eáy\u0014cÞoÈ@Xe÷\u0089é÷¼Á\u0003w37w -\u0011n¾G¢´\u0010gqx¢þïÞP$¼GÌü\f\u009fR2\u008aVÍ\\\u0099Ö «\u0014I\u008c2\u0095yEtÊL\u0099\u0086$\u0016Dß\u0018"
         .length();
      char var5 = 24;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var9;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[19];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
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

                  var6 = "4a4Í8¯¹ùpLÉë\u001c\u008eDï\u0018/\u00ad¬9o\u0090È5jÑ\u008fkù\"¸\u0080¬\u009c±Î\u0085)è\u001e";
                  var8 = "4a4Í8¯¹ùpLÉë\u001c\u008eDï\u0018/\u00ad¬9o\u0090È5jÑ\u008fkù\"¸\u0080¬\u009c±Î\u0085)è\u001e".length();
                  var5 = 16;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(NumberFormatException var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7120;
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
               "me/octo/client/utils/skyblock/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10
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
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
            "me/octo/client/utils/skyblock/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
