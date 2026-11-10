package me.octo.client.gui.clickgui.endgameGUI;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Map<String, lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Map<String, lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 73651027530546L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   private final me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, String var3
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      return new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(517, 231614897953174182L ^ var1)
            + var3
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(15149, 4703259089374563226L ^ var1),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17758, 6782178523440625049L ^ var1)
            + var3
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603876237151386625L ^ var1),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17758, 6782178523440625049L ^ var1)
            + var3
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603876237151386625L ^ var1)
      );
   }

   private final me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, String var2, short var3, int var4, String var5
   ) {
      long var6 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      return new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17758, 6782273721608733629L ^ var6)
            + var2
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603831320031234597L ^ var6),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17758, 6782273721608733629L ^ var6)
            + var5
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603831320031234597L ^ var6),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(17758, 6782273721608733629L ^ var6)
            + var5
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603831320031234597L ^ var6)
      );
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19135, 6184728197616181988L ^ var2)
         + var1
         + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(19636, 7603851401650939010L ^ var2);
   }

   @NotNull
   public final lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @Nullable String var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         427698247633844871L, var2
      );
      CharSequence var5 = var1;
      int[] var4 = var10000;

      label61: {
         label65: {
            label59: {
               label58: {
                  CharSequence var6;
                  try {
                     var6 = var5;
                     if (var4 != null) {
                        if (var5 == null) {
                           break label65;
                        }
                        break label58;
                     }
                  } catch (MatchException var11) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var11, 365751131746419217L, var2
                     );
                  }

                  var13 = var6;
                  break label59;
               }

               var13 = var5;
            }

            int var7;
            label50: {
               try {
                  var7 = var13.length();
                  if (var4 == null) {
                     break label50;
                  }

                  if (var7 == 0) {
                     break label65;
                  }
               } catch (MatchException var10) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var10, 365751131746419217L, var2
                  );
               }

               var14 = 0;
               break label61;
            }

            var14 = var7;
            break label61;
         }

         var14 = 1;
      }

      try {
         if (var14 != 0) {
            return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, 365751131746419217L, var2
         );
      }

      try {
         Map var15 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String var10001 = var1.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(8073, 4763724966076726260L ^ var2)
         );
         var16 = (lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var15.get(
            var10001
         );
         if (var16 == null) {
            var16 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         }
      } catch (MatchException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, 365751131746419217L, var2
         );
      }

      return var16;
   }

   static {
      long var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 112393208776810L;
      long var10001 = var9 ^ 57735755083243L;
      int var11 = (int)((var9 ^ 57735755083243L) >>> 32);
      int var12 = (int)((var9 ^ 57735755083243L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var9 ^ 77372847883084L;
      long var16 = var9 ^ 120844578626511L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[82];
      int var5 = 0;
      String var4 = "Üç1S\f4\u0086÷8²¤ÀÈVd»ÊfÂA¾\u0090ÁìÉ\u0098$\u0084a\u0092\u0007cÂëTÂ-à¬d\u0010\u009f\u001aT·/ÒÊcöZÙ\u0091ö\u001a¥_\u0018JlL\u0085\u0014Ú©ÚÍÜ\u0081_®¸â`ÌÅ\u0015t°\u0000Jì(ø\u009cÂ©DGÚTXi$¼P«íô\u009f<S\u009cU\tâ_ÉJãÒñ´·ê\u008eäèôÀJ\u0092\u009e @\u0010f\u0081ö(¹Sh9à\u0016;NÛ}Þái\u0006¬O´\u0016 \u0013þsÊ>|\u000b(l¥\u0011ß\u0095Ä\u001c \b\u0011b:H»rÚl~B¹-1\u001diwÜ¬ÕF\u0086©\r\u001b;!Ò\u000f\u0098Ü· õÑNÔ\u000b:¶~¢XÆ\u0083\u0082úÇ\u009dRøVg=Ì\u0085*ö¹C0\u0084ÉùU Ê¶\u0098zN°²¤($Îü}2^Á]¨0\u0015¶Xóf¥§\u009b$k\u000e¶Ó î«\u008b¬¡\u0016c»\u0088\u0017&ë\u009a±ï¢Ç\u009b\u0081Âé\fùUN©Ó÷\u0099oàL\u0018¨YúºXC«\fa\u0089\u0088;ø-V\u0087K\u0086J½`4\u001f\\(\u009b«é\r\u0010Â±N§$\u0088MÉ*exÍ'Ù\u0010)x\u001e,i\u0093Ñ\u0011\u0018¹\u0095ü¬\u0088dA\u0000\u001f±.\u0018Iä\u000b\u0012\u0012Ø¼\u0012ã\u007f#\u001c\u0001\u0019\u0089Ë\u0019\u000fB\u000f\u0088\u0084{÷(ïúpü|\u0097¾D¹ÿ¯\u0019¼õ\u008b\u001c\u001aë1Ûq6\u008d°Z¾\u0091í8Üì³ùÁO\u0094£\u0085\u0081\u0013\u0010\u0016ÙXÏ°\u0013·¼ë©+-Ó\u0013é&(\u0089t«M;\u0005\u001eÉ\u0091¶üw~ídMÖ¨å§C\u0001¾\u0095Ç\u0089\u008dÂ\u0094\u008cN\u0093:òk[Ç4±\u0089\u0018\r\u0094ÙZJ±HD1ïÇïÿ\u0099t\u0004ë\u0091\u008f\u0016úñ\u0092\u001d\u0010¢W\u0091\u0004÷ð\u008ecº#Gð?ºõ£ Áïw\u0016¤\tÌ{4\u001dÀ\u0011*ìµ\\ReløýXòpÏC©Ý®ù7h Ò6äÝ\u009b?R5\u0099ÎVåÄ\u007f\"©|b6TgE0Y\u0013\u0094Û\u009b°.\u0096ê\u0010@\u0096Ï\u00814\u000b[Ëç2ï£Ü¶¾^(zg»/éØK\u0007i\u0004ú_ó\u007f:\u008d\u008f\u0091\u009c\u0098´\u00879úÍi§-Ü:Ar\u008cdË6\u0086zþÑ\u0010\u00900\u0083)Ñâs¸\u0013µ²\u0099éûç0(\u0095Ê\u008b©\u009aÝ\u008eË)J¥\u0002\u0092%\u001cÇ|\u0019M¶}\u0098\u0014Zõ±\u0004\u0016\u008d\u000e³ì\u0018é?Ö\u0081\u0016Ç|(¨^À\u001d ½\"\tÊc¿2í=ñ¶H÷(sA-j\bt\u00848Ùþ\u009b\u0015è\u0095I°êqzH(\u0010s\u008d[\u0090u\u001d\u001e\u0014åUA°\u0015})y\u0010\u001eÜÂÎ'üËÙ\u0094Ý\u0086Nj8ès Å\u0096KB:Û\u0090a\u008d\u0091×/\u0004y]ñ5eÙÞÞ\u007fýoÇ2\u0018ñ¶I¢^\u0018S9p«5ý\u007f»¬è,\u009f\u0012\u001ft÷\u008a.¯{\u001cYÙ\u000f\u0010æwÂIS÷\u0011jË\u001a\u001eý7\u009a<¥(á\u0097^è\u0006»bÌ¼ÿ;\"\rP/Cc\u001dè²\u008f\u0006:3>6'+\u0006\u0003Éô$Ù¨djÿf¤\u0010\rùJèÑÆØÿ9\u008b³ß§yÃ\u008a\u0018SÙ;÷Bó\u0092\u0093äx&WÒ\u009dX.\u0093úg9!\u0017\u0082#\u0010Ú%\u0086y0Go\u0001ÿ\u0094\u0088QpÏúv\u0010ã<\u001dÿÝº\nÒª\u00976m(\u00949È\u00186Ë\u0099øâõcSÞås\n\u001fíÐ\u009f(ks?]\u001b¤É\u0010óÎ\u0096\u0015/Å\u008aSbã\u0089Õ´%ÛO8º\u0099Ò0\u0015\u0001 \u0005´Äðr+h\u008de\u008d'\u008d\u001aaÕ\u001eFp³7\u0005F\u001e\u008b\u0097Ý²Ö³î\u0090Èú\u00ad\u0006ï\u0011wÎ\u009dC¶\u0018°vV¶WÓ\u0018\u000fs\u0005\\cnÆ ¨³þ9ÚôD\n\u0003Ô\u0097;\u00891ö\u0013 Ë\u0093_ÁË\u0082K\u0096U\u0096¶£k\u008c\u007fIÈtÆéÈHo].ér\u0088¹ö\u001b\u0016 õ±¡mZ95Cª÷Tª.þ§v\u000b:×\u0094!Bí\u0004\u0095°/<\u0098xÝE (s\u0097A\u001b(acr\u008f^)\u001c°é\u0092\u0018Éëâç-\u000eu\u0001Âóþÿw\u000eÃ T\b¦¥½\u0082\u0086¿Ç ,§á6>Ö\u0089ÁDk\u0001Ë/_ôsØH\u0099\u0012\u0006\u0095@\u000f¬eýkëÙÑjÙs£1\u0005³¨Á\u001cQ\u009ch\u008f}\u001bÉ\u0018o¤¨ÌD\u0004<Þ÷]1\u0080ø3ÓÜ\u001d\u00ado?éy\u0001\u0097È=\u008daL\u008c08¯é\u0013åû\r\u0018¹ ¢t\u0006\u008fFJ&\u008c1^~b\u0083.P\u001d\u0083\u0089ÐÛ\u0000i(Ø$&3Ð%Ká!\u00829\u00adúcç?^\u0007àÍ\u0086\u0019!\u00902\b\t-\u0093z\u0094\u009e&ÂI\b\u0014$À¹(\u0006Äª\u0014yPHÒby5\u001c¬ö\u0011§Cäç¢H*á*°\u0087Yv\u0090l¸\n\u0085¢\ryò\u0012Æm(æ!àDyðkê\u0013\u0083Õ5tôsrLNñ{\u008d¨\u0081Ï×\u009b®Þ\u0017¼b\u009a¥\u008d\nÀáÙ7  ÍÚ F\u001a$+N¾KG\u0002ïTÎM\u0097ð\u00adWi¹\b×þ\t@\u0013Cät.\u0018Ý%£~\u007fâF;ÙVë7ÓfñÀ¥9²Û}Lë. \u0087Ö) ðté\fcB¾\u008a1@\u0099\t±ù·hK\u0096.OÎÀÍvä\u0096Ù1 ¿'\u001a²Õ\u0016e²ÄêM0¬)ixSýÑD\fÖ'ý^%Ã;Ð\u0000<< <VùÕ\u0010\u009d÷¹d\u008eÑ¸}à\u0003Kû\bç:[\u0097ÍM#þ\u0004¾\u0096ÏÏ\u0019(]ø\u009b=\u001fÒâ\u009bç\u0098º®7~\u0013E\u0093ÀØæÃ¯\u009fu§\u0016¸[ë+¬vÓaÌghO\u0088\u001e@6ÏrÏÆI.\u0090§\u008eÊ^\u000fª P¯\u008b\u008b\u0091Ñ\u0018 O×\u0019c\u0007ªO2,\u009a\u0016=Ö\u0014ó\u0082Í\u0097+\u0017\u0094¸\u0005\u000bª\u0096Ë²zäµ³K\u000b\u00ad\\!ñ/·D\u0018A\u0086¡@\u0002'Ôa\u0093\"Û\tZ\u0084í÷¥Ò9èË\u0019L\u008f('VÔN£ðªV\u0084¿¨k\u0004>=³\u0016ñ@Â\u007fF\u008cìþ´¢Û\u001cæ\u0095^\u008däZr\u0094D\u009aµ å\u000fÍ\u0014\u0015¥\u001co«\u009d}Â\u0000û¤ñeÜºæÆ\u0098\u0093Â²öÎ9\u009eA\u0001½ \\>XNáaâÕXm)´N\u0083ÔÓ@8d&µ\u0090\u009b`yê\u0092\u0005·zX\t@\u001e$£\u0082\u007fÒD>%-\u00016#\u007f¿/\u0010ó\"hÁ\u0000\u0007åÚ£\u0092,ýÐªø\u0003\u000e\u0016L®(m\u008e\u0014ã«\u0093+\u001b\nÕ½÷»\u0095_+\u0013·Ð·úª'N[0\u0018¨KaÆc\u0088\u0016ýÝÿêP<O½O\r\u0016\u0011äªX\u0003P N¡}Ñ\u009b,7\u0002b\u0098(CZõ\"ÕAI¸\u0096\u008f \u0095pL^Ò¾¾n¶^ ^sÄ\u00003»È\u001bKÇ¯Æs};Ý\u0016T§s_Æ#\u0006\u000fê\u0082\tëM\u0007\u009d ùíj\u0017á\u0088\u00adñ\u00058\bö\u0097O\t@¦Ë\u001cá8\u0002¿ù\u0018h\u0097#¢:æ»(4ÙD\u0091b\u009fr\u0010P\u001a\u0084Rd0>\u0010Gh¸k]3\u0004s9Âj/«®§r\u0089\u009aÜÉªºr$\u0010\u0085¡3a\u009brNR>Ä*ì~t\u008a](æ¡\u0006\u0093³ïþÎi= \u001eP0;-ÄHS#K¿\u0006\u0011\u0080\u0000¼ÕIá\u008cXÏ\u0095¸ïEþM¾(\u000br\u001eY\u0000Y#hú\u0007ÉDHWD>ä(ü\u0095{Pp<@ß \u001dÍ&\u0016kTN\u0011Ù\u0090ËGÐ(ê\u0092,\u0088lÒ\u0085M\u0095Ä\n\u0003³]4W|CÈçoj\u0093\u0007\rUÓ\u001e;UH\u001a./n\u0000Æ\u0014\u008cÕ {\u008d\u009f,\u0019¢x8µ\u0088\u0096Å\tp|<\u0098ã·\u000fì5Ö\u001f\u0087}Ïü\u0096u-\u0093\u0010\u0018½?\u0094»DÏ·¾\fF\u008fZM\u0002ì eì\u001fËØr%ãù\u0016pI fÈ´'Ï\u000f«\u0081ô¥uõ\u0010N\u0017\u0096\u0097º\u001e\u0010\u00ad\u0086ÑòA\u0007ÒoX®\u0084\b\u0087c¡¨\u0010|òaG\u0083V$\u009bÂ\u0007\u000bÖA3¸¶(µ¨\u008c\"!4\u0095\u008b\u0002¡ý·\f¬\u0014:\u001c\"ü\u0002\u009clÉ<ü\u0081\fy\r\u001fA\u001eîÐÀÙ´\u001e(â e~¨Ï\u0083\fÄ\u0091ã\u0092T\u0087¥Ë7ìé¹÷\u0087Ì*\u00adóÝ\u0002Õ½Å(è\u0011 ~\ns×(Ã\u0096HÊýd\u0004²\rüeI\u0082Å*\u0094K![yýr×e\u00adI\u000f\u0018\u001d\u0017Øª\u0010¹$^\u008e\u0013x\u0002ÈöLì\u007fç\u008fê:\u000b\u0016!\u0018\u0087¤ÞLRz\u0016_^{L§Q´)'ê²Ðó*ì*í(\u0085Mð\\\u0087ÏõöT/ÍfI_\u009a¸\n\u0098{\u0082\t\u0002ú\u0087÷&â\u0091\u00ad\u0087ê¬\u008b¯Dj\u008e³\u007f£(ü\u0083k(\u001d\u009c¿N¥¤h\u0084²î\u0013\u0017À \u008bàå\u0019/*¡!Ù-Ý¯µ\u0092Ö5\u000foÄW\u009d\u0006";
      int var6 = "Üç1S\f4\u0086÷8²¤ÀÈVd»ÊfÂA¾\u0090ÁìÉ\u0098$\u0084a\u0092\u0007cÂëTÂ-à¬d\u0010\u009f\u001aT·/ÒÊcöZÙ\u0091ö\u001a¥_\u0018JlL\u0085\u0014Ú©ÚÍÜ\u0081_®¸â`ÌÅ\u0015t°\u0000Jì(ø\u009cÂ©DGÚTXi$¼P«íô\u009f<S\u009cU\tâ_ÉJãÒñ´·ê\u008eäèôÀJ\u0092\u009e @\u0010f\u0081ö(¹Sh9à\u0016;NÛ}Þái\u0006¬O´\u0016 \u0013þsÊ>|\u000b(l¥\u0011ß\u0095Ä\u001c \b\u0011b:H»rÚl~B¹-1\u001diwÜ¬ÕF\u0086©\r\u001b;!Ò\u000f\u0098Ü· õÑNÔ\u000b:¶~¢XÆ\u0083\u0082úÇ\u009dRøVg=Ì\u0085*ö¹C0\u0084ÉùU Ê¶\u0098zN°²¤($Îü}2^Á]¨0\u0015¶Xóf¥§\u009b$k\u000e¶Ó î«\u008b¬¡\u0016c»\u0088\u0017&ë\u009a±ï¢Ç\u009b\u0081Âé\fùUN©Ó÷\u0099oàL\u0018¨YúºXC«\fa\u0089\u0088;ø-V\u0087K\u0086J½`4\u001f\\(\u009b«é\r\u0010Â±N§$\u0088MÉ*exÍ'Ù\u0010)x\u001e,i\u0093Ñ\u0011\u0018¹\u0095ü¬\u0088dA\u0000\u001f±.\u0018Iä\u000b\u0012\u0012Ø¼\u0012ã\u007f#\u001c\u0001\u0019\u0089Ë\u0019\u000fB\u000f\u0088\u0084{÷(ïúpü|\u0097¾D¹ÿ¯\u0019¼õ\u008b\u001c\u001aë1Ûq6\u008d°Z¾\u0091í8Üì³ùÁO\u0094£\u0085\u0081\u0013\u0010\u0016ÙXÏ°\u0013·¼ë©+-Ó\u0013é&(\u0089t«M;\u0005\u001eÉ\u0091¶üw~ídMÖ¨å§C\u0001¾\u0095Ç\u0089\u008dÂ\u0094\u008cN\u0093:òk[Ç4±\u0089\u0018\r\u0094ÙZJ±HD1ïÇïÿ\u0099t\u0004ë\u0091\u008f\u0016úñ\u0092\u001d\u0010¢W\u0091\u0004÷ð\u008ecº#Gð?ºõ£ Áïw\u0016¤\tÌ{4\u001dÀ\u0011*ìµ\\ReløýXòpÏC©Ý®ù7h Ò6äÝ\u009b?R5\u0099ÎVåÄ\u007f\"©|b6TgE0Y\u0013\u0094Û\u009b°.\u0096ê\u0010@\u0096Ï\u00814\u000b[Ëç2ï£Ü¶¾^(zg»/éØK\u0007i\u0004ú_ó\u007f:\u008d\u008f\u0091\u009c\u0098´\u00879úÍi§-Ü:Ar\u008cdË6\u0086zþÑ\u0010\u00900\u0083)Ñâs¸\u0013µ²\u0099éûç0(\u0095Ê\u008b©\u009aÝ\u008eË)J¥\u0002\u0092%\u001cÇ|\u0019M¶}\u0098\u0014Zõ±\u0004\u0016\u008d\u000e³ì\u0018é?Ö\u0081\u0016Ç|(¨^À\u001d ½\"\tÊc¿2í=ñ¶H÷(sA-j\bt\u00848Ùþ\u009b\u0015è\u0095I°êqzH(\u0010s\u008d[\u0090u\u001d\u001e\u0014åUA°\u0015})y\u0010\u001eÜÂÎ'üËÙ\u0094Ý\u0086Nj8ès Å\u0096KB:Û\u0090a\u008d\u0091×/\u0004y]ñ5eÙÞÞ\u007fýoÇ2\u0018ñ¶I¢^\u0018S9p«5ý\u007f»¬è,\u009f\u0012\u001ft÷\u008a.¯{\u001cYÙ\u000f\u0010æwÂIS÷\u0011jË\u001a\u001eý7\u009a<¥(á\u0097^è\u0006»bÌ¼ÿ;\"\rP/Cc\u001dè²\u008f\u0006:3>6'+\u0006\u0003Éô$Ù¨djÿf¤\u0010\rùJèÑÆØÿ9\u008b³ß§yÃ\u008a\u0018SÙ;÷Bó\u0092\u0093äx&WÒ\u009dX.\u0093úg9!\u0017\u0082#\u0010Ú%\u0086y0Go\u0001ÿ\u0094\u0088QpÏúv\u0010ã<\u001dÿÝº\nÒª\u00976m(\u00949È\u00186Ë\u0099øâõcSÞås\n\u001fíÐ\u009f(ks?]\u001b¤É\u0010óÎ\u0096\u0015/Å\u008aSbã\u0089Õ´%ÛO8º\u0099Ò0\u0015\u0001 \u0005´Äðr+h\u008de\u008d'\u008d\u001aaÕ\u001eFp³7\u0005F\u001e\u008b\u0097Ý²Ö³î\u0090Èú\u00ad\u0006ï\u0011wÎ\u009dC¶\u0018°vV¶WÓ\u0018\u000fs\u0005\\cnÆ ¨³þ9ÚôD\n\u0003Ô\u0097;\u00891ö\u0013 Ë\u0093_ÁË\u0082K\u0096U\u0096¶£k\u008c\u007fIÈtÆéÈHo].ér\u0088¹ö\u001b\u0016 õ±¡mZ95Cª÷Tª.þ§v\u000b:×\u0094!Bí\u0004\u0095°/<\u0098xÝE (s\u0097A\u001b(acr\u008f^)\u001c°é\u0092\u0018Éëâç-\u000eu\u0001Âóþÿw\u000eÃ T\b¦¥½\u0082\u0086¿Ç ,§á6>Ö\u0089ÁDk\u0001Ë/_ôsØH\u0099\u0012\u0006\u0095@\u000f¬eýkëÙÑjÙs£1\u0005³¨Á\u001cQ\u009ch\u008f}\u001bÉ\u0018o¤¨ÌD\u0004<Þ÷]1\u0080ø3ÓÜ\u001d\u00ado?éy\u0001\u0097È=\u008daL\u008c08¯é\u0013åû\r\u0018¹ ¢t\u0006\u008fFJ&\u008c1^~b\u0083.P\u001d\u0083\u0089ÐÛ\u0000i(Ø$&3Ð%Ká!\u00829\u00adúcç?^\u0007àÍ\u0086\u0019!\u00902\b\t-\u0093z\u0094\u009e&ÂI\b\u0014$À¹(\u0006Äª\u0014yPHÒby5\u001c¬ö\u0011§Cäç¢H*á*°\u0087Yv\u0090l¸\n\u0085¢\ryò\u0012Æm(æ!àDyðkê\u0013\u0083Õ5tôsrLNñ{\u008d¨\u0081Ï×\u009b®Þ\u0017¼b\u009a¥\u008d\nÀáÙ7  ÍÚ F\u001a$+N¾KG\u0002ïTÎM\u0097ð\u00adWi¹\b×þ\t@\u0013Cät.\u0018Ý%£~\u007fâF;ÙVë7ÓfñÀ¥9²Û}Lë. \u0087Ö) ðté\fcB¾\u008a1@\u0099\t±ù·hK\u0096.OÎÀÍvä\u0096Ù1 ¿'\u001a²Õ\u0016e²ÄêM0¬)ixSýÑD\fÖ'ý^%Ã;Ð\u0000<< <VùÕ\u0010\u009d÷¹d\u008eÑ¸}à\u0003Kû\bç:[\u0097ÍM#þ\u0004¾\u0096ÏÏ\u0019(]ø\u009b=\u001fÒâ\u009bç\u0098º®7~\u0013E\u0093ÀØæÃ¯\u009fu§\u0016¸[ë+¬vÓaÌghO\u0088\u001e@6ÏrÏÆI.\u0090§\u008eÊ^\u000fª P¯\u008b\u008b\u0091Ñ\u0018 O×\u0019c\u0007ªO2,\u009a\u0016=Ö\u0014ó\u0082Í\u0097+\u0017\u0094¸\u0005\u000bª\u0096Ë²zäµ³K\u000b\u00ad\\!ñ/·D\u0018A\u0086¡@\u0002'Ôa\u0093\"Û\tZ\u0084í÷¥Ò9èË\u0019L\u008f('VÔN£ðªV\u0084¿¨k\u0004>=³\u0016ñ@Â\u007fF\u008cìþ´¢Û\u001cæ\u0095^\u008däZr\u0094D\u009aµ å\u000fÍ\u0014\u0015¥\u001co«\u009d}Â\u0000û¤ñeÜºæÆ\u0098\u0093Â²öÎ9\u009eA\u0001½ \\>XNáaâÕXm)´N\u0083ÔÓ@8d&µ\u0090\u009b`yê\u0092\u0005·zX\t@\u001e$£\u0082\u007fÒD>%-\u00016#\u007f¿/\u0010ó\"hÁ\u0000\u0007åÚ£\u0092,ýÐªø\u0003\u000e\u0016L®(m\u008e\u0014ã«\u0093+\u001b\nÕ½÷»\u0095_+\u0013·Ð·úª'N[0\u0018¨KaÆc\u0088\u0016ýÝÿêP<O½O\r\u0016\u0011äªX\u0003P N¡}Ñ\u009b,7\u0002b\u0098(CZõ\"ÕAI¸\u0096\u008f \u0095pL^Ò¾¾n¶^ ^sÄ\u00003»È\u001bKÇ¯Æs};Ý\u0016T§s_Æ#\u0006\u000fê\u0082\tëM\u0007\u009d ùíj\u0017á\u0088\u00adñ\u00058\bö\u0097O\t@¦Ë\u001cá8\u0002¿ù\u0018h\u0097#¢:æ»(4ÙD\u0091b\u009fr\u0010P\u001a\u0084Rd0>\u0010Gh¸k]3\u0004s9Âj/«®§r\u0089\u009aÜÉªºr$\u0010\u0085¡3a\u009brNR>Ä*ì~t\u008a](æ¡\u0006\u0093³ïþÎi= \u001eP0;-ÄHS#K¿\u0006\u0011\u0080\u0000¼ÕIá\u008cXÏ\u0095¸ïEþM¾(\u000br\u001eY\u0000Y#hú\u0007ÉDHWD>ä(ü\u0095{Pp<@ß \u001dÍ&\u0016kTN\u0011Ù\u0090ËGÐ(ê\u0092,\u0088lÒ\u0085M\u0095Ä\n\u0003³]4W|CÈçoj\u0093\u0007\rUÓ\u001e;UH\u001a./n\u0000Æ\u0014\u008cÕ {\u008d\u009f,\u0019¢x8µ\u0088\u0096Å\tp|<\u0098ã·\u000fì5Ö\u001f\u0087}Ïü\u0096u-\u0093\u0010\u0018½?\u0094»DÏ·¾\fF\u008fZM\u0002ì eì\u001fËØr%ãù\u0016pI fÈ´'Ï\u000f«\u0081ô¥uõ\u0010N\u0017\u0096\u0097º\u001e\u0010\u00ad\u0086ÑòA\u0007ÒoX®\u0084\b\u0087c¡¨\u0010|òaG\u0083V$\u009bÂ\u0007\u000bÖA3¸¶(µ¨\u008c\"!4\u0095\u008b\u0002¡ý·\f¬\u0014:\u001c\"ü\u0002\u009clÉ<ü\u0081\fy\r\u001fA\u001eîÐÀÙ´\u001e(â e~¨Ï\u0083\fÄ\u0091ã\u0092T\u0087¥Ë7ìé¹÷\u0087Ì*\u00adóÝ\u0002Õ½Å(è\u0011 ~\ns×(Ã\u0096HÊýd\u0004²\rüeI\u0082Å*\u0094K![yýr×e\u00adI\u000f\u0018\u001d\u0017Øª\u0010¹$^\u008e\u0013x\u0002ÈöLì\u007fç\u008fê:\u000b\u0016!\u0018\u0087¤ÞLRz\u0016_^{L§Q´)'ê²Ðó*ì*í(\u0085Mð\\\u0087ÏõöT/ÍfI_\u009a¸\n\u0098{\u0082\t\u0002ú\u0087÷&â\u0091\u00ad\u0087ê¬\u008b¯Dj\u008e³\u007f£(ü\u0083k(\u001d\u009c¿N¥¤h\u0084²î\u0013\u0017À \u008bàå\u0019/*¡!Ù-Ý¯µ\u0092Ö5\u000foÄW\u009d\u0006"
         .length();
      char var3 = '(';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var56 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var51 = -1;
         var7[var5++] = var56;
         if ((var2 += var3) >= var6) {
            var4 = "ò\u0098\u001e\nÆGEÃij_\u008aK\u00146\u001ax\u0010<\u008eò/XÐ«\"«\u0092©\u00945íí\u0090\u0095\u0083Ó=¿ý@/sÆ`*òzMª\u008cüZ\u0016\u008e\u0002×\b±#GZëö LõdÀûý\u0085¨¨\u0014mU÷\u0082r\u0091çj¦ð\u001c0\\\nR~Mä%Æô\u0082:Ò\fÍ\u008cQ<è";
            var6 = "ò\u0098\u001e\nÆGEÃij_\u008aK\u00146\u001ax\u0010<\u008eò/XÐ«\"«\u0092©\u00945íí\u0090\u0095\u0083Ó=¿ý@/sÆ`*òzMª\u008cüZ\u0016\u008e\u0002×\b±#GZëö LõdÀûý\u0085¨¨\u0014mU÷\u0082r\u0091çj¦ð\u001c0\\\nR~Mä%Æô\u0082:Ò\fÍ\u008cQ<è"
               .length();
            var3 = '(';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var58 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var53 = false;
               var7[var5++] = var58;
               if ((var2 += var3) >= var6) {
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[82];
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "/assets/minecraft/textures/block";
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "/assets/minecraft/textures/item";
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
                  Pair[] var18 = new Pair[13];
                  String var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "coal_block"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "quartz_block_top", (short)var12, var13, "quartz_block_side"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "diamond_block"
                     )
                  };
                  var18[0] = TuplesKt.to(
                     "ores|ore",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "prismarine"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "light_blue_terracotta"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "light_blue_wool"
                     )
                  };
                  var18[1] = TuplesKt.to(
                     "mithril",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "red_stained_glass"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "lime_stained_glass"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "pink_stained_glass"
                     )
                  };
                  var18[2] = TuplesKt.to(
                     "gemstones|gemstone",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "red_sandstone_top", (short)var12, var13, "red_sandstone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "clay"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "green_stained_glass"
                     )
                  };
                  var18[3] = TuplesKt.to(
                     "tunnel",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "golden_shovel", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "brown_terracotta"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "mycelium_top", (short)var12, var13, "mycelium_side"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "red_sand"
                     )
                  };
                  var18[4] = TuplesKt.to(
                     "crimson_mining|crimson",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "golden_shovel", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "birch_planks"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "sandstone_top", (short)var12, var13, "sandstone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "sand"
                     )
                  };
                  var18[5] = TuplesKt.to(
                     "sand",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "golden_pickaxe", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "bedrock"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "sandstone_top", (short)var12, var13, "sandstone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "end_stone"
                     )
                  };
                  var18[6] = TuplesKt.to(
                     "endstone|end_stone|end",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "cobblestone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "stone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "gravel"
                     )
                  };
                  var18[7] = TuplesKt.to(
                     "cobblestone|cobble",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "prismarine_shard", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "crying_obsidian"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "bedrock"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "obsidian"
                     )
                  };
                  var18[8] = TuplesKt.to(
                     "obsidian",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "golden_sword", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "white_stained_glass"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "ice"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "snow"
                     )
                  };
                  var18[9] = TuplesKt.to(
                     "ghost",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "stone_axe", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "azalea_leaves"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "mangrove_log_top", (short)var12, var13, "mangrove_log"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "stripped_spruce_log_top", (short)var12, var13, "stripped_spruce_log"
                     )
                  };
                  var18[10] = TuplesKt.to(
                     "foraging|tree",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "fishing_rod", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "water_still"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11, "oak_log_top", (short)var12, var13, "oak_log"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "netherrack"
                     )
                  };
                  var18[11] = TuplesKt.to(
                     "fishing|fishing_route",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  var10005 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "slime_ball", var14
                  );
                  var19 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "white_wool"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "light_blue_wool"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "red_wool"
                     )
                  };
                  var18[12] = TuplesKt.to(
                     "beach_ball|beachball",
                     new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        var10005, CollectionsKt.listOf(var19)
                     )
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = MapsKt.linkedMapOf(var18);
                  Map var34 = MapsKt.createMapBuilder();
                  Map var48 = var34;
                  boolean var20 = false;

                  for (Entry var22 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.entrySet()) {
                     String var23 = (String)var22.getKey();
                     lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var24 = (lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var22.getValue();
                     CharSequence var50 = var23;
                     char[] var25 = new char[]{'|'};

                     for (String var49 : StringsKt.split$default(var50, var25, false, 0, 6, null)) {
                        String var55 = StringsKt.trim(var49).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(var55, "toLowerCase(...)");
                        var48.put(var55, var24);
                     }
                  }

                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = MapsKt.build(var34);
                  String var60 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(
                     "iron_pickaxe", var14
                  );
                  me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var35 = new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[]{
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "stone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "cobblestone"
                     ),
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
                        var16, "andesite"
                     )
                  };
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var60, CollectionsKt.listOf(var35)
                  );
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9047;
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
               "me/octo/client/gui/clickgui/endgameGUI/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII", var10
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
            "me/octo/client/gui/clickgui/endgameGUI/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$390b2709f64e30f0(String var1, long var2) {
      var2 = 108415292577812L;
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      return "/assets/minecraft/textures/item/" + var1 + ".png";
   }

   private final me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$3ddc972d92b17d1a(
      long var1, String var3
   ) {
      var1 = 80457357262999L;
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      return new me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         "/assets/minecraft/textures/block/" + var3 + ".png",
         "/assets/minecraft/textures/block/" + var3 + ".png",
         "/assets/minecraft/textures/block/" + var3 + ".png"
      );
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @Nullable
      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final List<me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> blocks;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 84677941155962L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @Nullable String argument1Arg,
         @NotNull List<me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> blocksArg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 120618398350062L;
         Intrinsics.checkNotNullParameter(blocksArg, "blocks");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.blocks = blocksArg;
      }

      @Nullable
      public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final List<me.octo.client.utils.render.shapes.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> getBlocks() {
         return this.blocks;
      }

      @Nullable
      public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, long var2, @Nullable String var4, @NotNull List var5
      ) {
         long var6 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(20491, 7961230856988941173L ^ var6)
         );
         return new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 7831903240996L;
         return "Visual(tool=" + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl + ", blocks=" + this.blocks + ")";
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
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 33588750771492L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = "âÙDøÂNQ\n\u0080®`·&è\u0088â n\u009fP8n\u00ad+b¡Ù\u0015¾Ë%#í\u009f\u0081¸Ó¦0\u0080]m\u0080©dÁAÒÚ";
         int var8 = "âÙDøÂNQ\n\u0080®`·&è\u0088â n\u009fP8n\u00ad+b¡Ù\u0015¾Ë%#í\u009f\u0081¸Ó¦0\u0080]m\u0080©dÁAÒÚ".length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "õK\u0005\u000eò\u008eS\u009fG\u0092öu¶Ð8L»O§:Õ4Hñ*~e1[S\u0006f\u0010¢\u0094#kÑ\u0012\\×Þhõ\u0092\u0012u÷A";
               var8 = "õK\u0005\u000eò\u008eS\u009fG\u0092öu¶Ð8L»O§:Õ4Hñ*~e1[S\u0006f\u0010¢\u0094#kÑ\u0012\\×Þhõ\u0092\u0012u÷A".length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[4];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 24842;
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
                  "me/octo/client/gui/clickgui/endgameGUI/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/gui/clickgui/endgameGUI/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
