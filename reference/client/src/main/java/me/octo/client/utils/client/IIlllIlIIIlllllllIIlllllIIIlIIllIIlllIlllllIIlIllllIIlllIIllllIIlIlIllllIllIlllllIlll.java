package me.octo.client.utils.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 53085923737625L;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Map IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new HashMap(13);
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String var1, long var2) {
      var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var2;
      long var4 = var2 ^ 37672609632224L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(29459, 884758504208780647L ^ var2)
      );

      boolean var6;
      try {
         URI var10 = new URI(var1);
         var6 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var4);
      } catch (Exception var8) {
         PolinexLogger.error(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(7143, 8776124295384540544L ^ var2)
               + var1
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(24148, 2472337883472715839L ^ var2)
               + var8.getMessage()
         );
         var6 = false;
      }

      return var6;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull URI param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, URI param3, String param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(URI var1, long var2) {
      var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var2;
      String[] var6 = new String[8];
      var6[0] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(30893, 3694158881670904441L ^ var2);
      var6[1] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(16721, 568002037861417858L ^ var2);
      var6[2] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(1077, 4281657401676908278L ^ var2);
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         214826391535312439L, var2
      );
      var6[3] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(4794, 6009842029679136867L ^ var2);
      var6[4] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(28772, 6591852853706437297L ^ var2);
      var6[5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(20677, 8264609295966376462L ^ var2);
      var6[6] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(9205, 1692145495823212840L ^ var2);
      int var4 = var10000;
      var6[7] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(8466, 2255692384695444438L ^ var2);
      List var5 = CollectionsKt.listOf(var6);
      Iterator var13 = var5.iterator();

      while (true) {
         try {
            boolean var14 = var13.hasNext();
            if (var4 != 0) {
               return var14;
            }

            if (!var14) {
               break;
            }
         } catch (Exception var11) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var11, 183274368136270150L, var2
            );
         }

         String var7 = (String)var13.next();

         try {
            Runtime var15 = Runtime.getRuntime();
            String[] var8 = new String[]{var7, null};
            String var10003 = var1.toString();
            Intrinsics.checkNotNullExpressionValue(
               var10003, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(23697, 2286401596249153105L ^ var2)
            );
            var8[1] = var10003;
            var15.exec(var8);
            return true;
         } catch (Exception var10) {
            if (var4 == 0) {
               continue;
            }
            break;
         }
      }

      PolinexLogger.error(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(19742, 4091026824797786050L ^ var2));
      return false;
   }

   static {
      long var5 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 84022503051056L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[33];
      int var12 = 0;
      String var11 = "HèÂtý0ÕúÛ¹^\u0015\u000e\r'Îë;ÁGÎnå\u00adýó{æµ·ó\u0013:B\u0095é\u0013\u009cÒ/ ÷û6`Î°5¨]\u0013\u0098~\u0098Îð\\\u001c\t\u0013\u0006+éóîX©\u009c\u0087·pöÚ \u0081÷øåð¿[\bç£\r0:R\u0088ì\u0088Ü\u0014\f+¦h\u0015ôÂñ®XPê\r\u0010]X\u008cA\u001bk\"äÐð\"èô¤ÿj\u0010F\u008fèúL\u0092Ï\u0082®\u0091ºE\f\n¹K \u009c\r\u0007M\u007fB<¾\u0088\"s\u009a*iD:\u000be\u008d\u001ddX17\u0012>üØY\u009ddk\u0018i\u0007óWtwþ\u0095\f§v\u0092\f\u00868\u0090\u0016_\u0084U\u0089¯~¹\u0010h&Á¿Så-\u0093\u0010\u0019%ÜùQó\u009d8ÎÐt\u0083ÿGÚ\u0083[hj\n\u007f=JÜd×í\u009aâu,ÈE{èÒ¦ê\u0098\u001fs\u0088ðPT1\u0096eø\u000f\u0095Ñ\f6ñ\u0098m´ÿ~o°øø óêûë\u000eÏæ}\u0096\u001b_o\u0097\u0010\u0011)\u000f\u001c\u0093Y.g³ª¯î}\u008eª@Å!\u0018Á/v\u000f¸\u0013§\u0014òÕ×?Âà.}í×\u0093\u0019mkè¶\u0010PqqÀCýgu¯§!Ô\u009e\u001e´¦\u0010[ì,Q`%aÂ@A\u009d\u009aa¼1¸X\u0015\r^_h\u0093ÇÊC4$1\u0015nNet\u0013ÂR\u0016o£_P¥C\b\u0001\u008b´(R³4@Âî»©îÈ}ç\u0090¡hÃ1Â\u0001ÕÑ\u0080¯O\u0088\u0090¹I\u009d\u0082Q,\u001b\u0007c.\u001e\u0001\u0095Q¹µw8`b¿\u0013\u0019ØÍê¦þþ0\u0010&Üû\u001bp=êá=ÈóÖr-\u0089ï(\u0099\u00188a«ò\u001bu°\u0099\u0096pÎª¤A\u001dóI\u0016 \\#\rPaÐHÐë£¹ÕÒ Sq/Õð\u0010«i\u0017ç\u0013SC\u0093¤\f\u0003¤\u0098Cl¨\u0010ÖÏ1:tCÔ-×ï·¾\u008e\u0088æ{\u0010üÈK<YòåËô\u0001Ý\u0083q\u0000V\u0080\u0010ÀB#ñ\u009b\tL-²V½°\u008fÒL\u00190ìé\u0010ò\u0001¸ð\u0017\u0017\u0086v¹Ô/=m¢\u0086ßÊ.r)&ñ±\u0001·\u001a,mý\u0003h\u008b»z\u00052\u009c®©Z>(Ã»O(érlµþ\u0090\u000bL.Ñù¡òÌ\u001cJ\u0015¡kUf%\u0095\u0002\u0085£\u007fY¥çÞ.¥\u001f´/Ö\u0093õG )ýit¸[\u0015Ýæ\u0018\u0081L6u½º\u009fL»%\u0090ÅÔAªº3ßÈ\u0002~I\u0010+Xïè°ÊØ\u0091!\u001c:\u0099»5Å$\u00104ÖQ½\u009dæÎ\u001d¯O<\u0089(jn\u0003h~\t«Vv£ÄÚ\u0010¡jA\u008bRà¡\u0001N<g\u008d\u001a\u0093\u0090¹»2\u0097È\u0002MFg~\u000e×\u0007¶z#\u0098J3®4\u008bé\u0087ù\u001f\u0003Ú{ù\u008fÝîÍs×@V8X\u001dÁ`\u00056þc9¼omÇ\u0088Äq2nmè\u0016®} ú¯,\u0096Æ\u0014\u000f#Ý¼\tÖÛU7\u009e* 7\u0012L\u00067TfÈ\u0002.¼b\u0092wCnvÏÿaü\u001c©hÈ;\r\u008a\u0015\u001a\u0019r\u0010à\u0018\u009fÔ\bwÞ[Ìþ}¦oíKc(Ã\u0016Èj5Á¯ÓLkÕ:öß×\u008aTMN\u0093\u008dj]\u008b:yZöÃj¾Õ\u0084\u009e\u008e®Ú\u0099âÜ\u0010õç´\b%\u0013hêw\u00943ÌX\u0019t®\u0010\u0006$1\u0082@D\u001a\u0094/n\u0018\u001c[\u0091\u000eM";
      int var13 = "HèÂtý0ÕúÛ¹^\u0015\u000e\r'Îë;ÁGÎnå\u00adýó{æµ·ó\u0013:B\u0095é\u0013\u009cÒ/ ÷û6`Î°5¨]\u0013\u0098~\u0098Îð\\\u001c\t\u0013\u0006+éóîX©\u009c\u0087·pöÚ \u0081÷øåð¿[\bç£\r0:R\u0088ì\u0088Ü\u0014\f+¦h\u0015ôÂñ®XPê\r\u0010]X\u008cA\u001bk\"äÐð\"èô¤ÿj\u0010F\u008fèúL\u0092Ï\u0082®\u0091ºE\f\n¹K \u009c\r\u0007M\u007fB<¾\u0088\"s\u009a*iD:\u000be\u008d\u001ddX17\u0012>üØY\u009ddk\u0018i\u0007óWtwþ\u0095\f§v\u0092\f\u00868\u0090\u0016_\u0084U\u0089¯~¹\u0010h&Á¿Så-\u0093\u0010\u0019%ÜùQó\u009d8ÎÐt\u0083ÿGÚ\u0083[hj\n\u007f=JÜd×í\u009aâu,ÈE{èÒ¦ê\u0098\u001fs\u0088ðPT1\u0096eø\u000f\u0095Ñ\f6ñ\u0098m´ÿ~o°øø óêûë\u000eÏæ}\u0096\u001b_o\u0097\u0010\u0011)\u000f\u001c\u0093Y.g³ª¯î}\u008eª@Å!\u0018Á/v\u000f¸\u0013§\u0014òÕ×?Âà.}í×\u0093\u0019mkè¶\u0010PqqÀCýgu¯§!Ô\u009e\u001e´¦\u0010[ì,Q`%aÂ@A\u009d\u009aa¼1¸X\u0015\r^_h\u0093ÇÊC4$1\u0015nNet\u0013ÂR\u0016o£_P¥C\b\u0001\u008b´(R³4@Âî»©îÈ}ç\u0090¡hÃ1Â\u0001ÕÑ\u0080¯O\u0088\u0090¹I\u009d\u0082Q,\u001b\u0007c.\u001e\u0001\u0095Q¹µw8`b¿\u0013\u0019ØÍê¦þþ0\u0010&Üû\u001bp=êá=ÈóÖr-\u0089ï(\u0099\u00188a«ò\u001bu°\u0099\u0096pÎª¤A\u001dóI\u0016 \\#\rPaÐHÐë£¹ÕÒ Sq/Õð\u0010«i\u0017ç\u0013SC\u0093¤\f\u0003¤\u0098Cl¨\u0010ÖÏ1:tCÔ-×ï·¾\u008e\u0088æ{\u0010üÈK<YòåËô\u0001Ý\u0083q\u0000V\u0080\u0010ÀB#ñ\u009b\tL-²V½°\u008fÒL\u00190ìé\u0010ò\u0001¸ð\u0017\u0017\u0086v¹Ô/=m¢\u0086ßÊ.r)&ñ±\u0001·\u001a,mý\u0003h\u008b»z\u00052\u009c®©Z>(Ã»O(érlµþ\u0090\u000bL.Ñù¡òÌ\u001cJ\u0015¡kUf%\u0095\u0002\u0085£\u007fY¥çÞ.¥\u001f´/Ö\u0093õG )ýit¸[\u0015Ýæ\u0018\u0081L6u½º\u009fL»%\u0090ÅÔAªº3ßÈ\u0002~I\u0010+Xïè°ÊØ\u0091!\u001c:\u0099»5Å$\u00104ÖQ½\u009dæÎ\u001d¯O<\u0089(jn\u0003h~\t«Vv£ÄÚ\u0010¡jA\u008bRà¡\u0001N<g\u008d\u001a\u0093\u0090¹»2\u0097È\u0002MFg~\u000e×\u0007¶z#\u0098J3®4\u008bé\u0087ù\u001f\u0003Ú{ù\u008fÝîÍs×@V8X\u001dÁ`\u00056þc9¼omÇ\u0088Äq2nmè\u0016®} ú¯,\u0096Æ\u0014\u000f#Ý¼\tÖÛU7\u009e* 7\u0012L\u00067TfÈ\u0002.¼b\u0092wCnvÏÿaü\u001c©hÈ;\r\u008a\u0015\u001a\u0019r\u0010à\u0018\u009fÔ\bwÞ[Ìþ}¦oíKc(Ã\u0016Èj5Á¯ÓLkÕ:öß×\u008aTMN\u0093\u008dj]\u008b:yZöÃj¾Õ\u0084\u009e\u008e®Ú\u0099âÜ\u0010õç´\b%\u0013hêw\u00943ÌX\u0019t®\u0010\u0006$1\u0082@D\u001a\u0094/n\u0018\u001c[\u0091\u000eM"
         .length();
      char var10 = '(';
      int var17 = -1;

      label37:
      while (true) {
         String var18 = var11.substring(++var17, var17 + var10);
         byte var10001 = -1;

         while (true) {
            byte[] var15 = var7.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
            switch (var10001) {
               case 0:
                  var14[var12++] = var26;
                  if ((var17 += var10) >= var13) {
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var14;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new String[33];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -8519910135845826988L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var30 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var30;
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     return;
                  }

                  var10 = var11.charAt(var17);
                  break;
               default:
                  var14[var12++] = var26;
                  if ((var17 += var10) < var13) {
                     var10 = var11.charAt(var17);
                     continue label37;
                  }

                  var11 = "Ñ\u009bJHVÚZ\u001cqT6°v\u0010,\u008fP·ÝÒÛAÐÒ\u0019ÒÚt\u0002E\u0096ns6Ú¶\u0089Þ«°]F¾ø\u0099¥{\u009d\u0014\u0090|õ\u001aãî@ke\u001e\u0090êN\u001f\u007f¦dWé~J\u0085]t\u0017\u0013Ú\u0082\u0080\u0007Ñ\u0092d\u000fJoì.ç\u001a\b\u0091ä.4Y\u0082È";
                  var13 = "Ñ\u009bJHVÚZ\u001cqT6°v\u0010,\u008fP·ÝÒÛAÐÒ\u0019ÒÚt\u0002E\u0096ns6Ú¶\u0089Þ«°]F¾ø\u0099¥{\u009d\u0014\u0090|õ\u001aãî@ke\u001e\u0090êN\u001f\u007f¦dWé~J\u0085]t\u0017\u0013Ú\u0082\u0080\u0007Ñ\u0092d\u000fJoì.ç\u001a\b\u0091ä.4Y\u0082È"
                     .length();
                  var10 = 16;
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17341;
      if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/client/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10
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
         byte[] var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5].getBytes("ISO-8859-1");
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5];
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
            "me/octo/client/utils/client/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
