package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.modules.Module;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   public static lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static ConcurrentHashMap<String, List<Module>> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ConcurrentHashMap<String, Integer> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 44092529608669L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   private lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl var1, long var2
   ) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var4 = var2 ^ 121319955486179L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(21689, 7574101500837002904L ^ var2)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var4, var1.getScriptName(), var1.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI()
      );
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1,
      @NotNull String var2,
      @NotNull me.octo.client.gui.clickgui.modules.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var3,
      int var4,
      int var5
   ) {
      long var6 = ((long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var8 = var6 ^ 36937797371186L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(11836, 1966224815282902214L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(8976, 5785787823624968688L ^ var6)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var2, var3);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3, Module param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(12296, 6514376540126159329L ^ var1)
      );
      return CollectionsKt.flatten(var10000);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull String param1, boolean param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 102518779232796L;
      boolean var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8269202628547090901L, var1
      );
      Set var10001 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.keySet();
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(21293, 6398509054873896088L ^ var1)
      );
      Iterable var6 = CollectionsKt.toList(var10001);
      boolean var7 = false;
      boolean var5 = var10000;
      Iterator var8 = var6.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            String var10 = (String)var9;
            if (!var5) {
               break;
            }

            boolean var11 = false;
            lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var13 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Intrinsics.checkNotNull(var10);
            var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var3);
            if (var5) {
               continue;
            }
         }

         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.clear();
         long var14 = 5864089477962903447L ^ var1;
         IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
         PolinexLogger.info(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(30765, var14));
         break;
      }
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      boolean var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6140465836285878737L, var1
      );

      try {
         boolean var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.isEmpty();
         if (var3) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, -6308807075478712933L, var1
         );
      }

      return false;
   }

   public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(2749, 6920045348237838374L ^ var1)
      );
      Iterable var4 = var10000;
      boolean var13 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         6516139647493336714L, var1
      );
      int var5 = 0;
      boolean var3 = var13;
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            var14 = var5;
            if (var3) {
               break;
            }

            List var8 = (List)var7;
            boolean var9 = false;
            int var11 = var8.size();
            var5 += var11;
            if (!var3) {
               continue;
            }
         }

         var14 = var5;
         break;
      }

      return var14;
   }

   public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @NotNull String param1, char param2, int param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      Collection var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.values();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(2749, 6920056296356462724L ^ var1)
      );
      return CollectionsKt.sumOfInt(var10000);
   }

   private static final Integer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Function2 var0, Object var1, Object var2) {
      return (Integer)var0.invoke(var1, var2);
   }

   private static final Integer llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Function2 var0, Object var1, Object var2) {
      return (Integer)var0.invoke(var1, var2);
   }

   static {
      long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 34153354125080L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "i\u008f\rzch3\u0090P\u0088\u0013\u0018I\u0012a\u0017];\u001c¨áÈ×\u0095öj\u0082\r\\Ò\u0089ÀÁJ¥bR\n\u0092\u009d \u0013\u00adÀ½ë]Ðmì\u008d§\u0098AJÔ\b6s9<\u009e\r\u009d\u0015Ê{ÕåY\u0090{X ô=S£1\u0018UQ\u00957\u0007íêÁ¹Lî`\\Ä\u0097ëWÊxÊÆ%ù\u008f\u0080\u009c\u0010R[¤º\u008f©$1o\u0095iiU\u0016\u0088¤\u0010\u0088¿Ý\u0015újöu;xø\u0003\u008fTûO\u0018\u0010«ºí$ryº¿øV\u0003\u00898+W\u009cÃÐO¯y\u0098]\u0018Ç/$4jÊÜ¦\u0089à\u0088t\u0093\u0016ß±\u0005>\u0006³:¹sp8æ\u0081\u009d\u0005Âg\u0003Ý\u009a\u008dà\u009f:\u00ad(K;hWpÙKØt\"PöµF\roäh\u0098Å\u009a\u0083Â\u0089R\u0012-\u0092uS#El\\×¨\u001aöµ\bÈ8à|UýD\u0002ð;rO4Æh.\"ä5Ù\u0013'b=\u0087ÞÁ(-£O\u0084l4îë\u0088\u001eà\u0006ñµÇé\u001bø¥÷Ê\u0014Íêd9\u0099q\u0085r89\u0007Ø¶0÷xK\u0002\u0095å\u00814\u0083ûø)1\u0092#A\u0000Ú\fB0Á£@É+\u001b|Oi}¡>\u0011üíÖ9Ô%\u0092Ã¿\u00906L\u001d±4(º \u00831ÿ¬Ú\u0089\u0090\u0088ÖÉwâJ¡'¤É\u0010í1:ú7.ÖU±Ö¤®)q8µ.iúJ\u0093æÖºØ*4húä\u008f\u0013§Dc/ÛÝçãvJP«ÇÔb*,ë©ª\u0018²b`û\u001eË%\nÚE\u009cõE]\u00866\u0006rX®bvü3Ü\u009c\t¾G\u0091àYç\u0083d \u0003lä\u0082t\t\u00adâT,©°\u008c\u001aFÈØÕ¡¾\u0091vÁ\u0001\u0093»m²\u008dd\u0093aBJ\u008c\u0006L\u0005}\u0001Ö\u009bs\u009c\u001f£\u009cQ¬ñØ\u0099V\u0098¿rGC¯D\u001d¤\u009c&®\u009ed\u0097kÿj (ø\\ÎËg\u009bÊö.W,ÜÔÄ¯XØë\u001a²¥{F\u008b3A½\f÷=[\u0010\u0089y)\u0082³k\u001e\u0003©Ï\u0081èI¤á«\u0018øÀ\u0091®hè²¡ö\u009e$RÐþ½;a¨ú\bÌ¹Z¢ \u0000N%\u0089iíáîQ^Sú\u0088\u0016ÿ\u0097?\u009cA\u0019\u0096Í\"Ð./PA´\u0012\u009e{\u0018®\"\u0083ºDB4b¼\u0089(I\u0013¦°\u009eÆúja\u0015¤ÚÄ\u0018\\ÌL\u0018W\u001b\"´Á\u0019n\u0006ÅÉ\u0098¸ÜW\u0010e\u0001h[\u0012(ÒãvcpK\u000f}H\u0092GÈ\u0016\u0097~\u001dÂÜ®±\u000bóÜ\u0094\u0006kþ\u0095FþÉ<^ÁÔü)º8M@.Õ×\"_¶Ú\u0012l~®&\u0090rb\u0013<Î\u0081ó\u0019è&@èîGeLÅZgm^±Ô\u0003×_¬.ê¢\u0005Ù /ÓÂ\u008c¡,\tGiG\u001f¹)S÷\u0019T6";
      int var8 = "i\u008f\rzch3\u0090P\u0088\u0013\u0018I\u0012a\u0017];\u001c¨áÈ×\u0095öj\u0082\r\\Ò\u0089ÀÁJ¥bR\n\u0092\u009d \u0013\u00adÀ½ë]Ðmì\u008d§\u0098AJÔ\b6s9<\u009e\r\u009d\u0015Ê{ÕåY\u0090{X ô=S£1\u0018UQ\u00957\u0007íêÁ¹Lî`\\Ä\u0097ëWÊxÊÆ%ù\u008f\u0080\u009c\u0010R[¤º\u008f©$1o\u0095iiU\u0016\u0088¤\u0010\u0088¿Ý\u0015újöu;xø\u0003\u008fTûO\u0018\u0010«ºí$ryº¿øV\u0003\u00898+W\u009cÃÐO¯y\u0098]\u0018Ç/$4jÊÜ¦\u0089à\u0088t\u0093\u0016ß±\u0005>\u0006³:¹sp8æ\u0081\u009d\u0005Âg\u0003Ý\u009a\u008dà\u009f:\u00ad(K;hWpÙKØt\"PöµF\roäh\u0098Å\u009a\u0083Â\u0089R\u0012-\u0092uS#El\\×¨\u001aöµ\bÈ8à|UýD\u0002ð;rO4Æh.\"ä5Ù\u0013'b=\u0087ÞÁ(-£O\u0084l4îë\u0088\u001eà\u0006ñµÇé\u001bø¥÷Ê\u0014Íêd9\u0099q\u0085r89\u0007Ø¶0÷xK\u0002\u0095å\u00814\u0083ûø)1\u0092#A\u0000Ú\fB0Á£@É+\u001b|Oi}¡>\u0011üíÖ9Ô%\u0092Ã¿\u00906L\u001d±4(º \u00831ÿ¬Ú\u0089\u0090\u0088ÖÉwâJ¡'¤É\u0010í1:ú7.ÖU±Ö¤®)q8µ.iúJ\u0093æÖºØ*4húä\u008f\u0013§Dc/ÛÝçãvJP«ÇÔb*,ë©ª\u0018²b`û\u001eË%\nÚE\u009cõE]\u00866\u0006rX®bvü3Ü\u009c\t¾G\u0091àYç\u0083d \u0003lä\u0082t\t\u00adâT,©°\u008c\u001aFÈØÕ¡¾\u0091vÁ\u0001\u0093»m²\u008dd\u0093aBJ\u008c\u0006L\u0005}\u0001Ö\u009bs\u009c\u001f£\u009cQ¬ñØ\u0099V\u0098¿rGC¯D\u001d¤\u009c&®\u009ed\u0097kÿj (ø\\ÎËg\u009bÊö.W,ÜÔÄ¯XØë\u001a²¥{F\u008b3A½\f÷=[\u0010\u0089y)\u0082³k\u001e\u0003©Ï\u0081èI¤á«\u0018øÀ\u0091®hè²¡ö\u009e$RÐþ½;a¨ú\bÌ¹Z¢ \u0000N%\u0089iíáîQ^Sú\u0088\u0016ÿ\u0097?\u009cA\u0019\u0096Í\"Ð./PA´\u0012\u009e{\u0018®\"\u0083ºDB4b¼\u0089(I\u0013¦°\u009eÆúja\u0015¤ÚÄ\u0018\\ÌL\u0018W\u001b\"´Á\u0019n\u0006ÅÉ\u0098¸ÜW\u0010e\u0001h[\u0012(ÒãvcpK\u000f}H\u0092GÈ\u0016\u0097~\u001dÂÜ®±\u000bóÜ\u0094\u0006kþ\u0095FþÉ<^ÁÔü)º8M@.Õ×\"_¶Ú\u0012l~®&\u0090rb\u0013<Î\u0081ó\u0019è&@èîGeLÅZgm^±Ô\u0003×_¬.ê¢\u0005Ù /ÓÂ\u008c¡,\tGiG\u001f¹)S÷\u0019T6"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "Öy«æ\"4=c!òôD©Þñ\u009b\u0010\u000bcTÇ\u0002?ñ*\u009dÓôËtÕ\u0007Ó";
            var8 = "Öy«æ\"4=c!òôD©Þñ\u009b\u0010\u000bcTÇ\u0002?ñ*\u009dÓôËtÕ\u0007Ó".length();
            var5 = '\u0010';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[23];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ConcurrentHashMap<>();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22842;
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
            throw new RuntimeException("me/octo/client/scripting/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10);
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
            "me/octo/client/scripting/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @NotNull
   public final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$a243a34600b8e95d(
      @NotNull String scriptNameArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$b87db2591f8138e6(
      @NotNull IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl scriptModuleArg, long argument2Arg
   ) {
      argument2Arg = 124980965536963L;
      argument2Arg = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ argument2Arg;
      long var4 = argument2Arg ^ 121319955486179L;
      Intrinsics.checkNotNullParameter(scriptModuleArg, "scriptModule");
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1cdf06f15a08d481(
         var4, scriptModuleArg.getScriptName(), scriptModuleArg.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI()
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$1cdf06f15a08d481(
      long param1, String param3, Module param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$eb8101d794814b4f(long var1) {
      var1 = 135869521976431L;
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      Collection var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.values();
      Intrinsics.checkNotNullExpressionValue(var10000, "<get-values>(...)");
      Iterable var4 = var10000;
      boolean var14 = IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      int var5 = 0;
      boolean var3 = var14;
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            var15 = var5;
            if (var3) {
               break;
            }

            List var8 = (List)var7;
            boolean var9 = false;
            int var11 = var8.size();
            var5 += var11;
            if (!var3) {
               continue;
            }
         }

         var15 = var5;
         break;
      }

      return var15;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$64452452940e5362(
      @NotNull String scriptNameArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
