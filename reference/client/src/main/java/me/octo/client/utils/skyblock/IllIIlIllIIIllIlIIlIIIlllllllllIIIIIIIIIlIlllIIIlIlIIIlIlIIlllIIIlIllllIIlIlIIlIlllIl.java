package me.octo.client.utils.skyblock;

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
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl {
   @NotNull
   public static IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Map<String, String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static List<String> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Regex IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static Regex IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Regex IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static Regex lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Map<String, String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 111638171586731L;
   private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

   private IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl() {
   }

   @NotNull
   public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var1, char var2, int var3, @NotNull String var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      long var7 = var5 ^ 25607177253606L;
      long var10001 = var5 ^ 73080477251935L;
      int var9 = (int)((var5 ^ 73080477251935L) >>> 48);
      int var10 = (int)((var5 ^ 73080477251935L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5849184836951187009L, var5
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(17082, 2520272507150740371L ^ var5)
      );
      String var12 = var10000;
      String var13 = this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII((char)var9, (char)var10, var4, var11);

      label86: {
         label81: {
            Map var19;
            label80: {
               try {
                  var19 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  if (var12 != null) {
                     break label80;
                  }

                  var10000 = (String)var19.get(var13);
                  if (var10000 != null) {
                     break label86;
                  }
               } catch (MatchException var28) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var28, 5765739911609369916L, var5
                  );
               }

               try {
                  var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var13);
                  break label81;
               } catch (MatchException var25) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var25, 5765739911609369916L, var5
                  );
               }
            }

            var10000 = var19;
         }

         var10000 = var10000;
         if (var10000 != null) {
            String var31 = var10000;
            boolean var34 = false;
            return var31;
         }

         label87: {
            byte var10002;
            byte var10003;
            label66: {
               Regex var20;
               CharSequence var21;
               byte var22;
               byte var23;
               label65: {
                  try {
                     CharSequence var47 = var13;
                     var23 = 2;
                     var22 = 0;
                     var21 = var47;
                     var20 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                     if (var12 != null) {
                        break label65;
                     }

                     var40 = Regex.find$default(var20, var21, var22, var23, null);
                     if (var40 != null) {
                        break label87;
                     }
                  } catch (MatchException var27) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var27, 5765739911609369916L, var5
                     );
                  }

                  try {
                     var41 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     var48 = var13;
                     var10002 = 0;
                     var10003 = 2;
                     break label66;
                  } catch (MatchException var24) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var24, 5765739911609369916L, var5
                     );
                  }
               }

               var41 = var20;
               var48 = var21;
               var10002 = var22;
               var10003 = var23;
            }

            MatchResult var44 = Regex.find$default(var41, var48, var10002, var10003, null);
            if (var44 != null) {
               MatchResult var30 = var44;
               var10000 = var12;
               boolean var33 = false;
               String var35 = StringsKt.trim((String & CharSequence)var30.getGroupValues().get(1)).toString();

               label89: {
                  try {
                     if (var10000 == null) {
                        var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(
                           var35
                              + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(28004, 365484755724895349L ^ var5)
                        );
                        if (var10000 != null) {
                           break label89;
                        }
                     }
                  } catch (MatchException var26) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var26, 5765739911609369916L, var5
                     );
                  }

                  return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(11037, 2549618471389086210L ^ var5)
                     + IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                        var35, var7
                     );
               }

               String var36 = var10000;
               boolean var18 = false;
               return var36;
            }

            return this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var13, var7);
         }

         MatchResult var29 = var40;
         boolean var32 = false;
         var10000 = ((String)var29.getGroupValues().get(1)).toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(14003, 9150112517653028786L ^ var5)
         );
         String var16 = var10000;
         var10000 = ((String)var29.getGroupValues().get(2)).toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(26891, 562389874484543504L ^ var5)
         );
         String var17 = var10000;
         return var16
            + "_"
            + var17
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(23946, 8999858078191662246L ^ var5);
      }

      String var14 = var10000;
      boolean var15 = false;
      return var14;
   }

   @NotNull
   public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(short var1, long var2, @NotNull String var4) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      long var10001 = var5 ^ 53496508374081L;
      int var7 = (int)((var5 ^ 53496508374081L) >>> 48);
      int var8 = (int)((var5 ^ 53496508374081L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18584, 8076311815509339470L ^ var5)
      );
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (char)var7,
         (char)var8,
         var9,
         StringsKt.trim(var4).toString()
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9402, 8879125825469874558L ^ var5)
      );
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      char param1, char param2, String param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(String var1, long var2) {
      var2 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ var2;
      String var10000 = var1.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(26891, 562510555161961053L ^ var2)
      );
      CharSequence var4 = var10000;
      Regex var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String var6 = "_";
      var4 = var5.replace(var4, var6);
      var5 = new Regex(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(26195, 7920107099526704440L ^ var2));
      var6 = "";
      return var5.replace(var4, var6);
   }

   static {
      long var9 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 64714612929642L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[66];
      int var5 = 0;
      String var4 = "à\rGo#\u000e·\u0089íBÓ¨\u0007+D©ß±s³0\u0083\u0017\u000f L3\u009f\u008d\u0082U\u0088~Íóà)\u0000êÝ^7]ðO\u00047¿yë\u0004n\u009fõ\u0097æÑ8t\rwGú\u00163J\u0099\u0095\u009d\u001b/%O|s J[7c\u000bò\u009a*.n\u000b\u000bßwëVÜ3hÇ\"Òïi\u009a\u001c\u001f\u0095lÐ\u0082å`SJv\u0081è(tQB4lÐZBIãÒ\u007fCÉ\u0081M¯\u0090\u008c\u00899<N\r\u008a*4Ö\u0092n(é/Ï\u0093±X\u0089\u0005Õ\u0018j3\u009ff)ï(\u008e\u000bjÅz6fÑ®ß\u000føX²\u009b\u001e\u0094(Þ»d8óÝdÌß[\u0090$\u0083.qê@²FÚ\\ïmÇ¾I\u0010®\u000b7²gkø¢\r\u0011M¹)\u0010ÞÔHÎÏÒñ¨Ü÷/\u008cMTÀ¥\u0010Eø\u001a\u001a²ùË\u00070\u0081j=\u0085\u0091Ã\u0013(ÈCÄ?Ö¦¯MB©|°\u0082 {¸S¼â\u0084EÎò¢³\u008c\u000bhT\u0090²ù\r%Ë\u009fÙùã9\u0010þ\r\\Ë¸Éþ&îeO\u001drÌô\"\u0010D!\u0094\u0096Qã£\u0001ÉÉ,©031\u0099\u0018veæ¤ìÊ\bp\u0096\u0091/\r\u0001é^\u0094\u009d\u008f_Z¾¨\fâ\u0010g\u0094\u008a\u0019ÓC\u0092\u008b\u000bõwùÝÐ\u0005À\u0010\u0002+| ü\u0083\u0016-»!)\u0011ìÄ w(uñ\rl³\u0097²þ\u0099b½¿h;÷îYÆÍ¥\t.ÿ´: \u000fÖqV\u0081o]\u0087\u0006U\u001fÑ\u0007Ö\u0010q\u0087Zmæ.\u001bóB\táv~´ò¼ O\u00154[ s«o80ù÷E_^àG;ä\u0002tX\u0096\u0006\u009e3?C £\u008d\u00030íÍ>\u000e|ÌÌë\u00adG\u0012\u009dUàR¤\u001fÐf.,¶L_üA\u0092/\u001de\u0001ç¤Qj\u001a¸`=ÆÓnÿ I \u0081;\u0010 ú rê\u0007á¬L\u0013ëa\u0097¶\u0017â \u0096\"\u0018äè²#@}Ðã-½ã\u0018ó\u000e\u008büQ:]æ\u009c\u001e=¹\u0012ÞØèh\u0010\u000f9\u0006W^a\"í\n7ÕØ@½\u0080\u0004\u0010§\u0011ÚZÑÆÚ\u008e¬\u008e²\u0007\u0095\u001eÜ\"\u0010ÉË[ñ\u0084OO4Â¬cQ\u0090\u00867e -¦×1ÌÛ.Ð\u001aX\u008f n_\u0086GÄ\u0003\u000eùó\u0090X@jeß¿¤Å».\u0010ßSi&\u0087ý\u009c¯¹r¥\u0016,Ókz0Q&ÿ=`È¶eB}aÅÙ¼>\u000eeÅ\u007f5ï\u008eá\u000ex½]i\t\u0006!X-![V\u009e\u0013¼\u0004\u000bfðâ ò\u0007· ó?\n\u009fG¡\u000f\u0011S\u0017m®-b)Þ»Îoë\u0007}h\u009eã*t\u0010¬jÒê ME~gÒ\frÐw®â¹a\t\u000b¸ª/\u0012_ÌIÁ}\u00189\u001e\u0082ñNXï Ý\f¾Ò\u0015êÉÒÖt\u0013-¢¥NRÍ\u0002\u0083%j\\G~È\u0080V\u0010ÂZ\tÈ\u00104Ã0QóôsÙcÔîn¡f¡v\u0018xê\u0091Ý'\u001d\u0001èó,TPò9ìöz\u0000>¾Ú/<£\u0018N¡âwÛÀå\u0015Þ}!\u009få¬\u0004E4ÛàXU&Ðd\u0010\u001fÌsçÎó\u009f=a¥ô¤^Ä>\u0080\u0018»Ø\u008a\u0086\u0081³b7(-\u007f\u0090h-2×\u0017x\u0096gõ©^T mß/\r\u001eãí:í~<Ì\u0092\u0006`\u009f\u0089\u007f1£eå¶\u000bVèÒAOc{y\u0010Öju\u008a\u008d\u0081Ö\u000fÅ\f@\u0092î\u0005\u001fc ËÀyÅ²\u007fcµEæ\"ìSny+ÞY±ÜýzIu\u0004\u001f®\u001eC¥\u000e³\u0018\u0099ËcÖ\bl\u008c[,ÞÓ(÷\u0082×9\u0014*Töx\u0005ôâ\u0018®Á\u0019ñø\u0083ªû\u0097ØA\u0090\u0080ý,\u0084Ú«v\u009c}\u008bÇ\r |àW|\u0018ìPú\u0003\u0011}*Ï\u001aC×\u0099\u0004âQ¯%ýÎÁ\u0001L>T(±U \u0088\u0006\u0092\u009a\u0018\u001e»/¹ÓiïáJ2\u0086\u009eO7U|´WR¢\u009er\u0085ý¯[å\u0010\u0094°`u\u009c\u0013\u0086\u001cyu\u007fÞÊ\u0087S\u0013 ´y1\u0001«\u0088\u0096ûvC\u009cÂ%v\u0098\u0093ësH?jGaòØ'¡ý\u0086edö \u0014go$J@KAM\u0002²\u001bBá\u0004\u0012JuÛY´\u00928\u0083þ$\"þbBè\u0004 ÕÃæë\u00949_°÷m\u009fñcêÇHø\u009f±HC^]<æ \u0087\u008aãâpH  \u0019x\u001f\u0016ÁÊ\u008bÁC-\u0091§NØ0É\u009dÀYC»{æ¾M\\\u0081¿¹-Ó\u0010Ý9ý\u0081\u0096¢§]f ô\u000fÉ2ê:\u0018VÅ8cË½§éF`Ð«®Ã ²zz}3@{\u008bf Û ×0,S\u0091*\u0095AgOFD Û\u0096Ê\u0090 ËâaÄ\u0088\u0090Âo\u001a\u0080\u00920\u0018\u0083Æ\u0081ÅôìJ\u0085\u0000th®ø§\u0013ÀY\u0089\u001e§wÓ£³ ±å«Òò<\u0014mÍnaS\u001a\u001a-Iö§Öø$ØÑDÖ\u0098\u0095YTA2\u0004(×C UMn;ªM\u0017ö+>³ÛÑç7\u0099]ÞØ´âR\u0084½'w{»[]ëÒÀ¤ê±&\u0010RÃE\u0090\u0098\u0084T\u0086ÿÙå³\nüBö\u0010:}û±¯\u0091\u009aj±¹\u0011K%n(!\u0010\u0090NfÕ\u00061¨®\u0014@é}\u009c\u0006Y\u0002\u0018×\njç>\u009cMf:\u001c&\u009bÉîcñl\u0080Ú¢L\rÆ\u0011\u0010½\u009fÜ;?\u0095þ=íXß©*qèù \u0010/\u0087Þþy\u0087øÙ\u0090\u0002 9hý\u0096\nh\u0081«¹M¿Ê÷êÊ\b2\u0097f \u0010ºJ<©}R½éKÎS\u008e\u008fÞ|\t \u0005dJ\u00875V\u0093 ô\u001dÔKÙ}\u0086\u000fdÆx» 0.<\u0090_KFj\u0012µ§\u0010:<QMÑÊ¥_t\u0080m\u001eíSæ\u000fÐ§@}Ë\u0092X\u0006 Ëo\fj;Âý\u0086\u0083Äné#T¤2I¬ \u0096¥Ùã\u009bC ÖÓ\u0080!ZÈ5\u0012«·vá$\u0006á\u0013¡c3íúå|Þ\u000fù\u0085n\u0015\u0083\u0003§³4®ñ|Ýøkz76´\u009e\u008aª^\u0015\u009e\u009bÑK\t\u0083ô\u0019IUS5+cÄû>\u0094tM\u0006xw}4\u008cØøUnð=åÍB§ãÇ\u0087\u0091'«ÎoÜþ0&Gü\u0093RwIØÐ\u0084¸né\u0015b]\u008cù\u0094¦Ý´^Y\u0010\u009f.Ìö\u00971&±«\u0085·MOe\u009e+ÝwØ3q\u0017EëÂ÷\u0083 $Ýëq¾wAU\u0092\u00835}\u000bZKb\u000bYÂ\tå·\u0099^Z ÒâÚòªÕ»Â\u0090=û0å\u001ec\u0011M «\u0088Å®&~tÃç\u009c_\u0019¼L\u0018\u009b\u0088\"¡9¶a¸'#\rÆ¿ûÞ¸3r%\u009aÚæú\u0011";
      int var6 = "à\rGo#\u000e·\u0089íBÓ¨\u0007+D©ß±s³0\u0083\u0017\u000f L3\u009f\u008d\u0082U\u0088~Íóà)\u0000êÝ^7]ðO\u00047¿yë\u0004n\u009fõ\u0097æÑ8t\rwGú\u00163J\u0099\u0095\u009d\u001b/%O|s J[7c\u000bò\u009a*.n\u000b\u000bßwëVÜ3hÇ\"Òïi\u009a\u001c\u001f\u0095lÐ\u0082å`SJv\u0081è(tQB4lÐZBIãÒ\u007fCÉ\u0081M¯\u0090\u008c\u00899<N\r\u008a*4Ö\u0092n(é/Ï\u0093±X\u0089\u0005Õ\u0018j3\u009ff)ï(\u008e\u000bjÅz6fÑ®ß\u000føX²\u009b\u001e\u0094(Þ»d8óÝdÌß[\u0090$\u0083.qê@²FÚ\\ïmÇ¾I\u0010®\u000b7²gkø¢\r\u0011M¹)\u0010ÞÔHÎÏÒñ¨Ü÷/\u008cMTÀ¥\u0010Eø\u001a\u001a²ùË\u00070\u0081j=\u0085\u0091Ã\u0013(ÈCÄ?Ö¦¯MB©|°\u0082 {¸S¼â\u0084EÎò¢³\u008c\u000bhT\u0090²ù\r%Ë\u009fÙùã9\u0010þ\r\\Ë¸Éþ&îeO\u001drÌô\"\u0010D!\u0094\u0096Qã£\u0001ÉÉ,©031\u0099\u0018veæ¤ìÊ\bp\u0096\u0091/\r\u0001é^\u0094\u009d\u008f_Z¾¨\fâ\u0010g\u0094\u008a\u0019ÓC\u0092\u008b\u000bõwùÝÐ\u0005À\u0010\u0002+| ü\u0083\u0016-»!)\u0011ìÄ w(uñ\rl³\u0097²þ\u0099b½¿h;÷îYÆÍ¥\t.ÿ´: \u000fÖqV\u0081o]\u0087\u0006U\u001fÑ\u0007Ö\u0010q\u0087Zmæ.\u001bóB\táv~´ò¼ O\u00154[ s«o80ù÷E_^àG;ä\u0002tX\u0096\u0006\u009e3?C £\u008d\u00030íÍ>\u000e|ÌÌë\u00adG\u0012\u009dUàR¤\u001fÐf.,¶L_üA\u0092/\u001de\u0001ç¤Qj\u001a¸`=ÆÓnÿ I \u0081;\u0010 ú rê\u0007á¬L\u0013ëa\u0097¶\u0017â \u0096\"\u0018äè²#@}Ðã-½ã\u0018ó\u000e\u008büQ:]æ\u009c\u001e=¹\u0012ÞØèh\u0010\u000f9\u0006W^a\"í\n7ÕØ@½\u0080\u0004\u0010§\u0011ÚZÑÆÚ\u008e¬\u008e²\u0007\u0095\u001eÜ\"\u0010ÉË[ñ\u0084OO4Â¬cQ\u0090\u00867e -¦×1ÌÛ.Ð\u001aX\u008f n_\u0086GÄ\u0003\u000eùó\u0090X@jeß¿¤Å».\u0010ßSi&\u0087ý\u009c¯¹r¥\u0016,Ókz0Q&ÿ=`È¶eB}aÅÙ¼>\u000eeÅ\u007f5ï\u008eá\u000ex½]i\t\u0006!X-![V\u009e\u0013¼\u0004\u000bfðâ ò\u0007· ó?\n\u009fG¡\u000f\u0011S\u0017m®-b)Þ»Îoë\u0007}h\u009eã*t\u0010¬jÒê ME~gÒ\frÐw®â¹a\t\u000b¸ª/\u0012_ÌIÁ}\u00189\u001e\u0082ñNXï Ý\f¾Ò\u0015êÉÒÖt\u0013-¢¥NRÍ\u0002\u0083%j\\G~È\u0080V\u0010ÂZ\tÈ\u00104Ã0QóôsÙcÔîn¡f¡v\u0018xê\u0091Ý'\u001d\u0001èó,TPò9ìöz\u0000>¾Ú/<£\u0018N¡âwÛÀå\u0015Þ}!\u009få¬\u0004E4ÛàXU&Ðd\u0010\u001fÌsçÎó\u009f=a¥ô¤^Ä>\u0080\u0018»Ø\u008a\u0086\u0081³b7(-\u007f\u0090h-2×\u0017x\u0096gõ©^T mß/\r\u001eãí:í~<Ì\u0092\u0006`\u009f\u0089\u007f1£eå¶\u000bVèÒAOc{y\u0010Öju\u008a\u008d\u0081Ö\u000fÅ\f@\u0092î\u0005\u001fc ËÀyÅ²\u007fcµEæ\"ìSny+ÞY±ÜýzIu\u0004\u001f®\u001eC¥\u000e³\u0018\u0099ËcÖ\bl\u008c[,ÞÓ(÷\u0082×9\u0014*Töx\u0005ôâ\u0018®Á\u0019ñø\u0083ªû\u0097ØA\u0090\u0080ý,\u0084Ú«v\u009c}\u008bÇ\r |àW|\u0018ìPú\u0003\u0011}*Ï\u001aC×\u0099\u0004âQ¯%ýÎÁ\u0001L>T(±U \u0088\u0006\u0092\u009a\u0018\u001e»/¹ÓiïáJ2\u0086\u009eO7U|´WR¢\u009er\u0085ý¯[å\u0010\u0094°`u\u009c\u0013\u0086\u001cyu\u007fÞÊ\u0087S\u0013 ´y1\u0001«\u0088\u0096ûvC\u009cÂ%v\u0098\u0093ësH?jGaòØ'¡ý\u0086edö \u0014go$J@KAM\u0002²\u001bBá\u0004\u0012JuÛY´\u00928\u0083þ$\"þbBè\u0004 ÕÃæë\u00949_°÷m\u009fñcêÇHø\u009f±HC^]<æ \u0087\u008aãâpH  \u0019x\u001f\u0016ÁÊ\u008bÁC-\u0091§NØ0É\u009dÀYC»{æ¾M\\\u0081¿¹-Ó\u0010Ý9ý\u0081\u0096¢§]f ô\u000fÉ2ê:\u0018VÅ8cË½§éF`Ð«®Ã ²zz}3@{\u008bf Û ×0,S\u0091*\u0095AgOFD Û\u0096Ê\u0090 ËâaÄ\u0088\u0090Âo\u001a\u0080\u00920\u0018\u0083Æ\u0081ÅôìJ\u0085\u0000th®ø§\u0013ÀY\u0089\u001e§wÓ£³ ±å«Òò<\u0014mÍnaS\u001a\u001a-Iö§Öø$ØÑDÖ\u0098\u0095YTA2\u0004(×C UMn;ªM\u0017ö+>³ÛÑç7\u0099]ÞØ´âR\u0084½'w{»[]ëÒÀ¤ê±&\u0010RÃE\u0090\u0098\u0084T\u0086ÿÙå³\nüBö\u0010:}û±¯\u0091\u009aj±¹\u0011K%n(!\u0010\u0090NfÕ\u00061¨®\u0014@é}\u009c\u0006Y\u0002\u0018×\njç>\u009cMf:\u001c&\u009bÉîcñl\u0080Ú¢L\rÆ\u0011\u0010½\u009fÜ;?\u0095þ=íXß©*qèù \u0010/\u0087Þþy\u0087øÙ\u0090\u0002 9hý\u0096\nh\u0081«¹M¿Ê÷êÊ\b2\u0097f \u0010ºJ<©}R½éKÎS\u008e\u008fÞ|\t \u0005dJ\u00875V\u0093 ô\u001dÔKÙ}\u0086\u000fdÆx» 0.<\u0090_KFj\u0012µ§\u0010:<QMÑÊ¥_t\u0080m\u001eíSæ\u000fÐ§@}Ë\u0092X\u0006 Ëo\fj;Âý\u0086\u0083Äné#T¤2I¬ \u0096¥Ùã\u009bC ÖÓ\u0080!ZÈ5\u0012«·vá$\u0006á\u0013¡c3íúå|Þ\u000fù\u0085n\u0015\u0083\u0003§³4®ñ|Ýøkz76´\u009e\u008aª^\u0015\u009e\u009bÑK\t\u0083ô\u0019IUS5+cÄû>\u0094tM\u0006xw}4\u008cØøUnð=åÍB§ãÇ\u0087\u0091'«ÎoÜþ0&Gü\u0093RwIØÐ\u0084¸né\u0015b]\u008cù\u0094¦Ý´^Y\u0010\u009f.Ìö\u00971&±«\u0085·MOe\u009e+ÝwØ3q\u0017EëÂ÷\u0083 $Ýëq¾wAU\u0092\u00835}\u000bZKb\u000bYÂ\tå·\u0099^Z ÒâÚòªÕ»Â\u0090=û0å\u001ec\u0011M «\u0088Å®&~tÃç\u009c_\u0019¼L\u0018\u009b\u0088\"¡9¶a¸'#\rÆ¿ûÞ¸3r%\u009aÚæú\u0011"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var32 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var32;
         if ((var2 += var3) >= var6) {
            var4 = "Z´-²(P\u0012÷\u0098¾\f\u000e Púï\u0010¢hÌôµjaB\u0018h×fÇ?°¾";
            var6 = "Z´-²(P\u0012÷\u0098¾\f\u000e Púï\u0010¢hÌôµjaB\u0018h×fÇ?°¾".length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var34 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var29 = false;
               var7[var5++] = var34;
               if ((var2 += var3) >= var6) {
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var7;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[66];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl();
                  Pair[] var11 = new Pair[]{
                     TuplesKt.to("Mithril", "MITHRIL_ORE"),
                     TuplesKt.to("Titanium", "TITANIUM_ORE"),
                     TuplesKt.to("Tungsten", "TUNGSTEN"),
                     TuplesKt.to("Umber", "UMBER"),
                     TuplesKt.to("Glacite", "GLACITE"),
                     TuplesKt.to("Nether Quartz", "QUARTZ"),
                     TuplesKt.to("Enchanted Nether Quartz", "ENCHANTED_QUARTZ"),
                     TuplesKt.to("Hard Stone", "HARD_STONE"),
                     TuplesKt.to("Enchanted Hard Stone", "ENCHANTED_HARD_STONE"),
                     TuplesKt.to("Refined Diamond", "REFINED_DIAMOND"),
                     TuplesKt.to("Refined Mineral", "REFINED_MINERAL"),
                     TuplesKt.to("Diamond Essence", "ESSENCE_DIAMOND"),
                     TuplesKt.to("Gold Essence", "ESSENCE_GOLD"),
                     TuplesKt.to("Treasurite", "TREASURITE"),
                     TuplesKt.to("Glacite Jewel", "GLACITE_JEWEL"),
                     TuplesKt.to("Veil Shard", "SHARD_GHOST"),
                     TuplesKt.to("Ghost Shard", "SHARD_GHOST")
                  };
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = MapsKt.mapOf(var11);
                  String[] var25 = new String[]{"Rough", "Flawed", "Fine", "Flawless", "Perfect"};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = CollectionsKt.listOf(var25);
                  String[] var26 = new String[]{
                     "Ruby", "Amber", "Amethyst", "Jade", "Sapphire", "Topaz", "Jasper", "Opal", "Aquamarine", "Citrine", "Onyx", "Peridot"
                  };
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var26);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new Regex("\\s+");
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Regex("[A-Za-z0-9][A-Za-z0-9 ':-]*");
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new Regex(
                     "\\b(Rough|Flawed|Fine|Flawless|Perfect) (Ruby|Amber|Amethyst|Jade|Sapphire|Topaz|Jasper|Opal|Aquamarine|Citrine|Onyx|Peridot) Gemstone\\b",
                     RegexOption.IGNORE_CASE
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new Regex(
                     "\\b(.+?) Shards?\\b", RegexOption.IGNORE_CASE
                  );
                  Map var27 = MapsKt.createMapBuilder();
                  Map var12 = var27;
                  boolean var13 = false;

                  for (String var15 : IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl) {
                     for (String var17 : lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI) {
                        String var31 = var15 + " " + var17 + " Gemstone";
                        String var36 = var15.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(var36, "toUpperCase(...)");
                        String var37 = var17.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(var37, "toUpperCase(...)");
                        var12.put(var31, var36 + "_" + var37 + "_GEM");
                     }
                  }

                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = MapsKt.build(var27);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15197;
      if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/skyblock/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var10
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
         byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
            "me/octo/client/utils/skyblock/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @NotNull
   public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$2f03961e8330cdec(
      short var1, long var2, @NotNull String var4
   ) {
      var2 = 57978407652868L;
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      long var10001 = var5 ^ 53496508374081L;
      int var7 = (int)((var5 ^ 53496508374081L) >>> 48);
      int var8 = (int)((var5 ^ 53496508374081L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18584, 8076311815509339470L ^ var5)
      );
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (char)var7,
         (char)var8,
         var9,
         StringsKt.trim(var4).toString()
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9402, 8879125825469874558L ^ var5)
      );
   }

   @NotNull
   public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2e7757aea0fa686d(
      char argument1Arg, char argument2Arg, int argument3Arg, @NotNull String displayNameArg
   ) {
      byte var34 = 0;
      short var35 = 24980;
      argument3Arg = 1334559470;
      long var5 = ((long)var34 << 48 | (long)var35 << 48 >>> 16 | (long)argument3Arg << 32 >>> 32)
         ^ llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      long var7 = var5 ^ 25607177253606L;
      long var10001 = var5 ^ 73080477251935L;
      int var9 = (int)((var5 ^ 73080477251935L) >>> 48);
      int var10 = (int)((var5 ^ 73080477251935L) << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      String var10000 = llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      Intrinsics.checkNotNullParameter(displayNameArg, "displayName");
      String var12 = var10000;
      String var13 = this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$0c93a9c0a28af9c4(
         (char)var9, (char)var10, displayNameArg, var11
      );

      label86: {
         label81: {
            Map var24;
            label80: {
               try {
                  var24 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  if (var12 != null) {
                     break label80;
                  }

                  var10000 = (String)var24.get(var13);
                  if (var10000 != null) {
                     break label86;
                  }
               } catch (MatchException var33) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var33);
               }

               try {
                  var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var13);
                  break label81;
               } catch (MatchException var30) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var30);
               }
            }

            var10000 = var24;
         }

         var10000 = var10000;
         if (var10000 != null) {
            String var39 = var10000;
            boolean var42 = false;
            return var39;
         }

         label87: {
            byte var10002;
            byte var10003;
            label66: {
               Regex var25;
               CharSequence var26;
               byte var27;
               byte var28;
               label65: {
                  try {
                     CharSequence var55 = var13;
                     var28 = 2;
                     var27 = 0;
                     var26 = var55;
                     var25 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                     if (var12 != null) {
                        break label65;
                     }

                     var48 = Regex.find$default(var25, var26, var27, var28, null);
                     if (var48 != null) {
                        break label87;
                     }
                  } catch (MatchException var32) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32);
                  }

                  try {
                     var49 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     var56 = var13;
                     var10002 = 0;
                     var10003 = 2;
                     break label66;
                  } catch (MatchException var29) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var29);
                  }
               }

               var49 = var25;
               var56 = var26;
               var10002 = var27;
               var10003 = var28;
            }

            MatchResult var52 = Regex.find$default(var49, var56, var10002, var10003, null);
            if (var52 != null) {
               MatchResult var38 = var52;
               var10000 = var12;
               boolean var41 = false;
               String var43 = StringsKt.trim((String & CharSequence)var38.getGroupValues().get(1)).toString();

               label89: {
                  try {
                     if (var10000 == null) {
                        var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.get(var43 + " Shard");
                        if (var10000 != null) {
                           break label89;
                        }
                     }
                  } catch (MatchException var31) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var31);
                  }

                  return "SHARD_"
                     + IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$145d1e42c137ab40(
                        var43, var7
                     );
               }

               String var44 = var10000;
               boolean var18 = false;
               return var44;
            }

            return this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$145d1e42c137ab40(var13, var7);
         }

         MatchResult var37 = var48;
         boolean var40 = false;
         var10000 = ((String)var37.getGroupValues().get(1)).toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
         String var16 = var10000;
         var10000 = ((String)var37.getGroupValues().get(2)).toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
         String var17 = var10000;
         return var16 + "_" + var17 + "_GEM";
      }

      String var14 = var10000;
      boolean var15 = false;
      return var14;
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$0c93a9c0a28af9c4(
      char param1, char param2, String param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$145d1e42c137ab40(String var1, long var2) {
      var2 = 21262851137699L;
      var2 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ var2;
      String var10000 = var1.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var10000, "toUpperCase(...)");
      CharSequence var4 = var10000;
      Regex var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      String var6 = "_";
      var4 = var5.replace(var4, var6);
      var5 = new Regex("[^A-Z0-9_;:-]");
      var6 = "";
      return var5.replace(var4, var6);
   }
}
