package me.octo.client.failsafes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileWriter;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   public static IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static File IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @Nullable
   private static List<String> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 130916406372169L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);

   private IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull List var3) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var4 = var1 ^ 82712551443921L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(27175, 4165691455857804302L ^ var1)
      );
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var3);
   }

   @NotNull
   public final List<String> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var3 = var1 ^ 27332493898868L;
      long var5 = var1 ^ 132149102324552L;
      int var7 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4626603160345925326L, var1
      );

      File var10000;
      label26: {
         try {
            var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
            if (var7 != 0) {
               break label26;
            }

            if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.exists()) {
               return;
            }
         } catch (Exception var11) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var11, -4628293128414671346L, var1
            );
         }

         try {
            var10000 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         } catch (Exception var10) {
            me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(13776, 1193126626928140886L ^ var1)
                  + var10.getMessage(),
               var5
            );
            return;
         }
      }

      try {
         var10000.createNewFile();
         this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            var3, lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
         );
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(1973, 5417928974826508297L ^ var1), var5
         );
      } catch (Exception var9) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(13776, 1193126626928140886L ^ var1) + var9.getMessage(),
            var5
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final List IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, List var3) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var4 = var1 ^ 26366036572277L;

      try {
         var var6 = new FileWriter(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         Throwable var7 = null;

         try {
            FileWriter var8 = var6;
            boolean var9 = false;
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.toJson(var3, var8);
            Unit var17 = Unit.INSTANCE;
         } catch (Throwable var13) {
            var7 = var13;
            throw var13;
         } finally {
            CloseableKt.closeFinally(var6, var7);
         }

         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var3;
      } catch (Exception var15) {
         me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(399, 1779410746347996436L ^ var1) + var15.getMessage(),
            var4
         );
      }
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 125193745222129L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[42];
      int var5 = 0;
      String var4 = "\u0013t}túÕÖQì\u008eRð\u009e6$+\u0087\u0089òE\u001f+a\u0085(\f-osÖ;ü,\u001f\u0007Äæ\u0001w\u0096\u00adj6Whâ\u0091ç/H«q\u0007\u0080I\u0085\u0086!Ë_\u008aÊM%PVà\u001aL \u0097ñ¡\t\u0085ßa?[\u009c@\u009c7 ¿!}\r\u0098\u009f\u0016ôj\u000b\u0092\u0093ëÏÚ1ä²»àKØñ·=K\u001eû\u0006ó\u009düÕ$àòf\u008f64vI©üÊ'\u0006å\u0098\b\u0093åáñ\u000e,B·Ôb×\u0018\u0005¯qÜ\u0011d~Ìe\u0084(\u009e)\u0004\u0095Þ&+\fÉ;\u0099?é(\u0015ú[ú\u000f\u009dØ\u008dÚR\u0006º;õ\u0087äf0y\u0084V\u0003;)&öÿE%Öx\u0010·+¨½\u0088ÓqI\u0010¡Zur\u0005\u0003ñ\u009e\u0012Önå\u0087'è®\u0018±ó²£\u009c?_Óç\f\u001bÛæ\u0098ôÀ3¡ú\u00017F]|\u0010åôÏ\u0015Í\u0092Q\u008bZ%\u0087\u0005©¿q\u0096\u0010Õ\u0096¶#q|\u009d¡§¼ÖT&²ö;\u0010\u000e*Ôn©ã?\b\u0087\u0095×.Wî\u0084H8÷ÿ×\u0087tÁ\u009c\u009f\u008d\u0003ó*\u0010åìµñm\u0099E=OåìÇ¬îMæ\u0083¿\u0099\u00ad{6ãU\u0081\u007f\u0007\u0003\u000e{+ã¸o×72!d\u009b\u0084\u008c*\u0010rNx\u00141\u001abv]©\u0096W\u00821G=\u00100}\u0087Ú\u0012Ì4\u0004òäîL %\u0010¡\u00108ê@¨eÎ¶Xp$@\u008eî\u000e¿T\u0010(~¼Í`Ô³\u0082\u007f\u0086V* 2Ãy\u0010()4¾iøðëßí\u0099+]ÿ³!\u00106ÉÙfãZcÖº`\u0086áØ\n`ð0½Ööûr½ß\u0082Ç-;I|\u009b\u000b\u0011@%\bü\u001eR\\sB\u0088a¹`~\u0015\u0003;7®°¯¨\u0013Ñ\u0082Vi\u009d£¶Ïj\u0010Q\u000fxÈ°Ò_H\u009aÈx·J\u0098\u0087n ºé%gÿI\u0012\u0017rÊæ»ÀÞ\u00adQ÷ß×\u008cÕ^\u008e'w[æ\u008eJ0ÍÛ8|()\u00984û\u0016~{è\u0080(Xòc±\u0017·1ö)ÍÖ)ÉÉ\u0086ÕH\r^\rd\u000e\r\nÕ7]\u0080¢ûéî£\n»\u000e\u0081&{Ä\u0003\u0018\u001bJ Ù±w\u0088ôääV©µp\u0080Ö\u0014%mØ=]á8\u0000\u000b\u008e\u009c\u0007Ç\n\u008eâcS ÿâã\u009fÝeÑ\u0089·ÿ¡@\u008aÍª\u0013'\tß\u008eJ\u0016EÃè:\u0005\u009a\u0088\u001a_~\u00101ðü=O\u0096Y3;Äm·ã^:ð\u0018G%\u008d\u0007ã\u0016Ø#(9j\u001eBçôV{M<\u0013\u000b¬i\u001c\u00107âÞê8Ö\u008b\u0095¥\r\u008d?\u0006æ\u008dÞ\u0010\u000bF´\u0096êêþB\u001eIo÷Ág\u0014ø /u\u009e\u0001÷4\u0093\u0007«\u0081nÚ\u009dñ©Õ«´/â uÌ\u009b(h¬\"n\u0007\u0089\u0085\u0010#\u000eG7\u0010¡\u009f\u007fA^©\u001d;@¿:\u0010\u0014[Ê\u0007¾ÃõzR\u0007dÌ6x\u0081ë\u0010¡Ú÷ö\u0094%»þ\u009e\u0000¯ \u0080\\yn\u0010üe\u008aç\u0082l\u0082.p\u009e×\u009e/l¤8\u0010½DæÊ£\u009f¿Y40 ÃÈU ¶8\u0010[(\u00155<\u000b\u001f\u009c\u0000Â\u001anÅV+õò\u0090JßÔµ®\u0080©~+\u008d¨¤Ã.u`\r\u008bz¼þè\u0017²])5j\u008d±ÎF5÷\u0087\u0080Æ\u0018N\u0019Çü\u0080\u0017\u000f~LÁ4M3üÈ\u007fËy½p(ÊÔ% úæ·ß^>Y\u0097\u0083è¸z\t\u0097\u0093\u0099`¶\u0080ì\u001cû\u0082³\u0015ÚÔ³\u0010\nÌu\u00183\u0093´ç(>\u007f PxïèZfföê\u0012nêF\u0091ìÃ\u0010\u0000ò\u0011\u0001&(uWJHLÑ|tLy\u0010\rqõ\u008bøÉ&Zm\u0081:~F\u0002\u0017®(G\u0005\u000e[»oôíÿ\u0007F\u0086w±ew\u0089bCr^ñ äÎ\u0016\u0085H\u009c\n¬è7·\u009d¥:ù\u008c&\u0018¦«Ì I}ùwh^%Ì?ëÖ@\u000bðG\u001còô\u008co";
      int var6 = "\u0013t}túÕÖQì\u008eRð\u009e6$+\u0087\u0089òE\u001f+a\u0085(\f-osÖ;ü,\u001f\u0007Äæ\u0001w\u0096\u00adj6Whâ\u0091ç/H«q\u0007\u0080I\u0085\u0086!Ë_\u008aÊM%PVà\u001aL \u0097ñ¡\t\u0085ßa?[\u009c@\u009c7 ¿!}\r\u0098\u009f\u0016ôj\u000b\u0092\u0093ëÏÚ1ä²»àKØñ·=K\u001eû\u0006ó\u009düÕ$àòf\u008f64vI©üÊ'\u0006å\u0098\b\u0093åáñ\u000e,B·Ôb×\u0018\u0005¯qÜ\u0011d~Ìe\u0084(\u009e)\u0004\u0095Þ&+\fÉ;\u0099?é(\u0015ú[ú\u000f\u009dØ\u008dÚR\u0006º;õ\u0087äf0y\u0084V\u0003;)&öÿE%Öx\u0010·+¨½\u0088ÓqI\u0010¡Zur\u0005\u0003ñ\u009e\u0012Önå\u0087'è®\u0018±ó²£\u009c?_Óç\f\u001bÛæ\u0098ôÀ3¡ú\u00017F]|\u0010åôÏ\u0015Í\u0092Q\u008bZ%\u0087\u0005©¿q\u0096\u0010Õ\u0096¶#q|\u009d¡§¼ÖT&²ö;\u0010\u000e*Ôn©ã?\b\u0087\u0095×.Wî\u0084H8÷ÿ×\u0087tÁ\u009c\u009f\u008d\u0003ó*\u0010åìµñm\u0099E=OåìÇ¬îMæ\u0083¿\u0099\u00ad{6ãU\u0081\u007f\u0007\u0003\u000e{+ã¸o×72!d\u009b\u0084\u008c*\u0010rNx\u00141\u001abv]©\u0096W\u00821G=\u00100}\u0087Ú\u0012Ì4\u0004òäîL %\u0010¡\u00108ê@¨eÎ¶Xp$@\u008eî\u000e¿T\u0010(~¼Í`Ô³\u0082\u007f\u0086V* 2Ãy\u0010()4¾iøðëßí\u0099+]ÿ³!\u00106ÉÙfãZcÖº`\u0086áØ\n`ð0½Ööûr½ß\u0082Ç-;I|\u009b\u000b\u0011@%\bü\u001eR\\sB\u0088a¹`~\u0015\u0003;7®°¯¨\u0013Ñ\u0082Vi\u009d£¶Ïj\u0010Q\u000fxÈ°Ò_H\u009aÈx·J\u0098\u0087n ºé%gÿI\u0012\u0017rÊæ»ÀÞ\u00adQ÷ß×\u008cÕ^\u008e'w[æ\u008eJ0ÍÛ8|()\u00984û\u0016~{è\u0080(Xòc±\u0017·1ö)ÍÖ)ÉÉ\u0086ÕH\r^\rd\u000e\r\nÕ7]\u0080¢ûéî£\n»\u000e\u0081&{Ä\u0003\u0018\u001bJ Ù±w\u0088ôääV©µp\u0080Ö\u0014%mØ=]á8\u0000\u000b\u008e\u009c\u0007Ç\n\u008eâcS ÿâã\u009fÝeÑ\u0089·ÿ¡@\u008aÍª\u0013'\tß\u008eJ\u0016EÃè:\u0005\u009a\u0088\u001a_~\u00101ðü=O\u0096Y3;Äm·ã^:ð\u0018G%\u008d\u0007ã\u0016Ø#(9j\u001eBçôV{M<\u0013\u000b¬i\u001c\u00107âÞê8Ö\u008b\u0095¥\r\u008d?\u0006æ\u008dÞ\u0010\u000bF´\u0096êêþB\u001eIo÷Ág\u0014ø /u\u009e\u0001÷4\u0093\u0007«\u0081nÚ\u009dñ©Õ«´/â uÌ\u009b(h¬\"n\u0007\u0089\u0085\u0010#\u000eG7\u0010¡\u009f\u007fA^©\u001d;@¿:\u0010\u0014[Ê\u0007¾ÃõzR\u0007dÌ6x\u0081ë\u0010¡Ú÷ö\u0094%»þ\u009e\u0000¯ \u0080\\yn\u0010üe\u008aç\u0082l\u0082.p\u009e×\u009e/l¤8\u0010½DæÊ£\u009f¿Y40 ÃÈU ¶8\u0010[(\u00155<\u000b\u001f\u009c\u0000Â\u001anÅV+õò\u0090JßÔµ®\u0080©~+\u008d¨¤Ã.u`\r\u008bz¼þè\u0017²])5j\u008d±ÎF5÷\u0087\u0080Æ\u0018N\u0019Çü\u0080\u0017\u000f~LÁ4M3üÈ\u007fËy½p(ÊÔ% úæ·ß^>Y\u0097\u0083è¸z\t\u0097\u0093\u0099`¶\u0080ì\u001cû\u0082³\u0015ÚÔ³\u0010\nÌu\u00183\u0093´ç(>\u007f PxïèZfföê\u0012nêF\u0091ìÃ\u0010\u0000ò\u0011\u0001&(uWJHLÑ|tLy\u0010\rqõ\u008bøÉ&Zm\u0081:~F\u0002\u0017®(G\u0005\u000e[»oôíÿ\u0007F\u0086w±ew\u0089bCr^ñ äÎ\u0016\u0085H\u009c\n¬è7·\u009d¥:ù\u008c&\u0018¦«Ì I}ùwh^%Ì?ëÖ@\u000bðG\u001còô\u008co"
         .length();
      char var3 = 'P';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "\u007f\u000b\u0091\\\u0093}\u000e¸ô]V\u008fU\b-+PÛk\u001f¢\u009bÑ¬è\u0090!Jà,¸\u0018\u0005ú0:o£õm¼âöD\n;\u009bJ\u0019Ü\u008ds=M\u0098-\u0003Ì°GÚÊ¢æ\u0083\u0006 «5\u0010\u0004¢²\u000f\n=\u0080WBÏðF\u0097!¯\rE\u0092\u0003Ù\u001dcÆ³xP·";
            var6 = "\u007f\u000b\u0091\\\u0093}\u000e¸ô]V\u008fU\b-+PÛk\u001f¢\u009bÑ¬è\u0090!Jà,¸\u0018\u0005ú0:o£õm¼âöD\n;\u009bJ\u0019Ü\u008ds=M\u0098-\u0003Ì°GÚÊ¢æ\u0083\u0006 «5\u0010\u0004¢²\u000f\n=\u0080WBÏðF\u0097!¯\rE\u0092\u0003Ù\u001dcÆ³xP·"
               .length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var7;
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[42];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new GsonBuilder().setPrettyPrinting().create();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new File(
                     me.octo.client.gui.clickgui.endgameGUI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
                     "failsafe_messages.json"
                  );
                  String[] var11 = new String[]{
                     "wth",
                     "wtf",
                     "huh",
                     "lag?",
                     "???",
                     "server?",
                     "wtf was that",
                     "lagging",
                     "what",
                     "wtf",
                     "wat",
                     "bruh",
                     "bro what",
                     "hi admins",
                     "admin?",
                     "can u not lol",
                     "wtf is this",
                     "wtf is happening",
                     "hi admins",
                     "hello!!",
                     "hiiii",
                     "hi?",
                     "WTF",
                     "?",
                     "why",
                     "why tho",
                     "no way",
                     "seriously?",
                     "come on",
                     "lol what",
                     "omg",
                     "finally",
                     "finally lol"
                  };
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var11);
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10923;
      if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5];
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
            "me/octo/client/failsafes/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
