package me.octo.client.gui;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl {
   @NotNull
   private final Function1<File, Unit> onPick;
   @NotNull
   private final Function0<Unit> onClose;
   @NotNull
   private final Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final <unrepresentable> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 126363821874537L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl(
      @NotNull Function1<? super File, Unit> onPickArg, @NotNull Function0<Unit> onCloseArg
   ) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 136922021739375L;
      long var5 = var3 ^ 106623736279305L;
      Intrinsics.checkNotNullParameter(onPickArg, "onPick");
      Intrinsics.checkNotNullParameter(onCloseArg, "onClose");
      super();
      this.onPick = onPickArg;
      this.onClose = onCloseArg;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
         lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
         @Override
         public void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
         }

         @Override
         public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1, int var2, long var3x) {
         }
      };
   }

   private final List<lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      Lazy var1 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      return (List<lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)var1.getValue();
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, float param3, float param4, long param5, int param7, int param8, float param9
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, char param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(File var1) {
      String var2;
      try {
         Path var6 = me.octo.client.scripting.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
            .toPath()
            .toAbsolutePath()
            .normalize();
         var2 = var6.relativize(var1.toPath().toAbsolutePath().normalize()).toString();
      } catch (Exception var5) {
         String var4 = var1.getName();
         Intrinsics.checkNotNull(var4);
         var2 = var4;
      }

      return var2;
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3, float param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      final Function0<Unit> var1
   ) {
      return new me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
         @Override
         public void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1x) {
            var1.invoke();
         }

         @Override
         public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1x, int var2, long var3) {
         }
      };
   }

   private static final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl var0, long var1
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var10001 = var1 ^ 127329800437515L;
      int var3 = (int)((var1 ^ 127329800437515L) >>> 32);
      int var4 = (int)((var1 ^ 127329800437515L) << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 16431108778956L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5310369886908500861L, var1
      );
      Iterable var9 = me.octo.client.scripting.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3, var4, (byte)var5);
      boolean var10 = false;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var8 = var10000;
      var var12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var9, 10));
      boolean var13 = false;
      Iterator var14 = var9.iterator();

      while (true) {
         if (!var14.hasNext()) {
            var9 = var12;
            boolean var21 = false;
            break;
         }

         Object var15 = var14.next();
         File var16 = (File)var15;
         ArrayList var18 = var12;
         boolean var17 = false;

         try {
            var18.add(
               new lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                  var16,
                  me.octo.client.scripting.IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16, var6),
                  var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16)
               )
            );
            if (var8 != null) {
               break;
            }
         } catch (MatchException var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, 5282568816088822550L, var1
            );
         }
      }

      return CollectionsKt.sortedWith(
         var9,
         new lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll()
      );
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl var0, File var1
   ) {
      var0.onPick.invoke(var1);
      return Unit.INSTANCE;
   }

   static {
      long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 29396860601000L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "¤¹°N+\u0085\u0004¤9Æ\u0001\u0010\u0083¼\u0091©GÂ\u0086@P\u0087\r%Uô\u001d\u0082OÀ¡¸\u0010Oä\u0081E)UJ/ÖF\u0083Ñ\n}¸3(ý\u0018Û]í5ìÄcï6\u0091ë4\u009dö\u0093¸5¦\u0011Á\u0084¢F_\u0095Æ¤\u000f\u0011Ö\u009fs*>U\u0015\u0018\u0000\u0010 \u0083\u0010ïÚ*5y´óK¡ßqãÍň¯l¹©\u0019ê\u0085h\u0099èw\rÒ\u0000è5m2Ì×*]0S©É¯ëé[I\u0013\u008déÏê\u0097(\u009cs\u0086®\u0091\u00955Ü*\u0090\u00adL§\u008e\u009bfJþ\u0003Ðæo<º\u0004_öÕ]x:Å  \u0098Ü\u008b~r9Ùù\u0096jÕòxG\u0006\u008d'ìÀ\u0094ûZã·\u0018Çv\u0098r\u0019\u009e!\u009dms(\u009aÔuã\u009a%\u0082-Ø\u0081£\u008f½°ÅV\u0010\u001c\u0090÷!\u001d\u008dó\u001dætR¾psù×¯Æäÿ¾ù\u0094LÜÄD¤Û©q\u0092®½\u00140J\\BÓânö¢ÒU\n=¯Êjæ\u0001JÁ \u0084\u00995\fÀ\u0012àã9@Ï+Â\b·\u0001\u000bQ|º[ý½\u0013h2½\tn`\u0080ÝPì§#\u0019»EDÒÓþ\\?·\u008b?ÑB`ô|Þ\u001cH¤«Ó%\u009eG\u007fö[¡\f3\u009dÔ\u0014Åx2\u0006\u0087ì2:Ò\u0084aèd9UáfÊnö:&\u0090AñÆîIªÆ\u000f3T\u0092»×ÈV\u0000e\u0012QMã\u0090:ª\u009c&uI\f¿*þ¤\u001bÕó\u0081y6\u000bmÁ\u0002\u001a*%È©ÒI?\f/\u0010 à\u001cÓfAÂWhæ¹J\tPÀØ@D\u0087\u0001\rzíU%ÝÉH\\ñÏ\u0088F!B{/2\u0013{sÄ\u0083k¾\u0013D/ï²»ù\u008bEÂ%\t\u0095w'\u0082Ås'#Ê´>õ]ªÂ\u0007\u0082;ö\u0007Ã7\u009d\u009f\u0018\r#9Jcë\\Ü\u0018\u0098\u001a:µ:Ú\u009d\u0083ÏKàdRÓv";
      int var8 = "¤¹°N+\u0085\u0004¤9Æ\u0001\u0010\u0083¼\u0091©GÂ\u0086@P\u0087\r%Uô\u001d\u0082OÀ¡¸\u0010Oä\u0081E)UJ/ÖF\u0083Ñ\n}¸3(ý\u0018Û]í5ìÄcï6\u0091ë4\u009dö\u0093¸5¦\u0011Á\u0084¢F_\u0095Æ¤\u000f\u0011Ö\u009fs*>U\u0015\u0018\u0000\u0010 \u0083\u0010ïÚ*5y´óK¡ßqãÍň¯l¹©\u0019ê\u0085h\u0099èw\rÒ\u0000è5m2Ì×*]0S©É¯ëé[I\u0013\u008déÏê\u0097(\u009cs\u0086®\u0091\u00955Ü*\u0090\u00adL§\u008e\u009bfJþ\u0003Ðæo<º\u0004_öÕ]x:Å  \u0098Ü\u008b~r9Ùù\u0096jÕòxG\u0006\u008d'ìÀ\u0094ûZã·\u0018Çv\u0098r\u0019\u009e!\u009dms(\u009aÔuã\u009a%\u0082-Ø\u0081£\u008f½°ÅV\u0010\u001c\u0090÷!\u001d\u008dó\u001dætR¾psù×¯Æäÿ¾ù\u0094LÜÄD¤Û©q\u0092®½\u00140J\\BÓânö¢ÒU\n=¯Êjæ\u0001JÁ \u0084\u00995\fÀ\u0012àã9@Ï+Â\b·\u0001\u000bQ|º[ý½\u0013h2½\tn`\u0080ÝPì§#\u0019»EDÒÓþ\\?·\u008b?ÑB`ô|Þ\u001cH¤«Ó%\u009eG\u007fö[¡\f3\u009dÔ\u0014Åx2\u0006\u0087ì2:Ò\u0084aèd9UáfÊnö:&\u0090AñÆîIªÆ\u000f3T\u0092»×ÈV\u0000e\u0012QMã\u0090:ª\u009c&uI\f¿*þ¤\u001bÕó\u0081y6\u000bmÁ\u0002\u001a*%È©ÒI?\f/\u0010 à\u001cÓfAÂWhæ¹J\tPÀØ@D\u0087\u0001\rzíU%ÝÉH\\ñÏ\u0088F!B{/2\u0013{sÄ\u0083k¾\u0013D/ï²»ù\u008bEÂ%\t\u0095w'\u0082Ås'#Ê´>õ]ªÂ\u0007\u0082;ö\u0007Ã7\u009d\u009f\u0018\r#9Jcë\\Ü\u0018\u0098\u001a:µ:Ú\u009d\u0083ÏKàdRÓv"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "&ü®§×tç\u008c\u0095cö\u0016ÉißBPg¬;PðªEã\u0094À¾\u0082ó@tif\u0083\u0080lÈ\u008c\u0005Âl\u001e\u001c\u0011ç\u008bÉ/E\u009f\\hH³ >\u0017ªY&{ßdqkÉ\u0092èÊ¹\b(eÄsR\u000ei\u0094ËZá\u0096£ßJ\u0014î$ñ!Â=5í\u0081)õ^¢ò¿\nÔØ8Ó\u000e\u0016³2\tU\\³Ô¥S\u0001¡&\u009fI¢æF\u001bír%\u0090¥7Ë!!-°ÍRYjA\u0091\u0013·Qâçl\u0099iã\u008doNûÅj\u0010ëï\u0084wFaÜ\u007fÖ\u008a¹kÝØÿ\u0096Î\u0088Ù ¯\u001f\n!Í\u0018ä^\f|µle\u009eË?±ëL´¼¼±¡Ñ±~y¶2\u0013åL\u0089RÁ]ð4[ÉÎrøj\u000eá\u0015dud°þ~c\fÐj\u001a\u00054\u0090;3e Ãêw\f½$`\u008e\u008d\u001b¥¯z\b\u0005\u0099m\u0001£\u007fº\u0098\u0010¾\u0016¥T\u0001u\u009e\u008d\u001e@ÝûD2¥ËéÌÅ8}\u009f6ªa\u0006à©<\"D)\u0005bI5\t·-¢¤ÓÆv=Ä¡\u009a\u0003/H\u008dmHÜ=\u0018ôu±\u009dr¡ë-eÙÚ\u009dl\\\u0007zåÁFH}\n?\u001aÿ\u0084\u008e\u0087Ïó\u0014¶\u0095l\u0098\u0007qw\nI\u0018EÙ\u008cP\u009e\u0019÷\u0082Èøn\u0017{¨Ie§0\u008b*\u009dM\u0084w£á\u000eì5£P¼\t\u008f¢/«J\u009aqÞÖxÖ\u008d\u0086Â\u008aFØ0U¾\u0083\u0018ÿGØüüFï\u0085Â;Rc|?»\u0090Uøzåª\u000b\u00962»`¨\u001f\u0015HG\u0087ÀfSé\u0094º\u009bÚ¸`\t¶0\u0019þ4\u0091\u000f+{¸ß\u009e\u0095ql8\u001eçä\u0083ÉPW\u00960ÛÍ#ì\u0094\u0013(øÁuÿ^SËßÝ\u0018cØÔSe\u001aÊJöøï\b¶rj©µì1\u0083\u008c.åÆ\u0010±Ä\u0085HâgùÒ\u0081\u001aX\"ÁØtøfø½\u0093\u0092xÖ^¿YÿÂBè\u0019[É¼\u0094èeëòÇÑí;\u0014§\u0017²È\b\u0088$Ñølþê_VyBãwF\u0002ì\u0013X\u0001ÆTD\u0007\u0083~åÏV©´TøîH6 µ\u0019¬È8#y \u009a\u0081Á,§)\u0097Àl\u0092ïÕÞ\u0088\u000e\u009eD]\u0084¡{\u0083\u0096e\u0095¯\u009aÔÊp\u0010X\u0093\u0005ð¤R{\u0093\u009c|\u0087ýø\u0013x¢";
            var8 = "&ü®§×tç\u008c\u0095cö\u0016ÉißBPg¬;PðªEã\u0094À¾\u0082ó@tif\u0083\u0080lÈ\u008c\u0005Âl\u001e\u001c\u0011ç\u008bÉ/E\u009f\\hH³ >\u0017ªY&{ßdqkÉ\u0092èÊ¹\b(eÄsR\u000ei\u0094ËZá\u0096£ßJ\u0014î$ñ!Â=5í\u0081)õ^¢ò¿\nÔØ8Ó\u000e\u0016³2\tU\\³Ô¥S\u0001¡&\u009fI¢æF\u001bír%\u0090¥7Ë!!-°ÍRYjA\u0091\u0013·Qâçl\u0099iã\u008doNûÅj\u0010ëï\u0084wFaÜ\u007fÖ\u008a¹kÝØÿ\u0096Î\u0088Ù ¯\u001f\n!Í\u0018ä^\f|µle\u009eË?±ëL´¼¼±¡Ñ±~y¶2\u0013åL\u0089RÁ]ð4[ÉÎrøj\u000eá\u0015dud°þ~c\fÐj\u001a\u00054\u0090;3e Ãêw\f½$`\u008e\u008d\u001b¥¯z\b\u0005\u0099m\u0001£\u007fº\u0098\u0010¾\u0016¥T\u0001u\u009e\u008d\u001e@ÝûD2¥ËéÌÅ8}\u009f6ªa\u0006à©<\"D)\u0005bI5\t·-¢¤ÓÆv=Ä¡\u009a\u0003/H\u008dmHÜ=\u0018ôu±\u009dr¡ë-eÙÚ\u009dl\\\u0007zåÁFH}\n?\u001aÿ\u0084\u008e\u0087Ïó\u0014¶\u0095l\u0098\u0007qw\nI\u0018EÙ\u008cP\u009e\u0019÷\u0082Èøn\u0017{¨Ie§0\u008b*\u009dM\u0084w£á\u000eì5£P¼\t\u008f¢/«J\u009aqÞÖxÖ\u008d\u0086Â\u008aFØ0U¾\u0083\u0018ÿGØüüFï\u0085Â;Rc|?»\u0090Uøzåª\u000b\u00962»`¨\u001f\u0015HG\u0087ÀfSé\u0094º\u009bÚ¸`\t¶0\u0019þ4\u0091\u000f+{¸ß\u009e\u0095ql8\u001eçä\u0083ÉPW\u00960ÛÍ#ì\u0094\u0013(øÁuÿ^SËßÝ\u0018cØÔSe\u001aÊJöøï\b¶rj©µì1\u0083\u008c.åÆ\u0010±Ä\u0085HâgùÒ\u0081\u001aX\"ÁØtøfø½\u0093\u0092xÖ^¿YÿÂBè\u0019[É¼\u0094èeëòÇÑí;\u0014§\u0017²È\b\u0088$Ñølþê_VyBãwF\u0002ì\u0013X\u0001ÆTD\u0007\u0083~åÏV©´TøîH6 µ\u0019¬È8#y \u009a\u0081Á,§)\u0097Àl\u0092ïÕÞ\u0088\u000e\u009eD]\u0084¡{\u0083\u0096e\u0095¯\u009aÔÊp\u0010X\u0093\u0005ð¤R{\u0093\u009c|\u0087ýø\u0013x¢"
               .length();
            var5 = 'ʐ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[10];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4690;
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
            throw new RuntimeException("me/octo/client/gui/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl", var10);
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
            "me/octo/client/gui/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final File file;
      @NotNull
      private final String name;
      @NotNull
      private final String meta;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 93309103851386L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull File fileArg, @NotNull String nameArg, @NotNull String metaArg
      ) {
         long var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 44945729100738L;
         Intrinsics.checkNotNullParameter(fileArg, "file");
         Intrinsics.checkNotNullParameter(nameArg, "name");
         Intrinsics.checkNotNullParameter(metaArg, "meta");
         super();
         this.file = fileArg;
         this.name = nameArg;
         this.meta = metaArg;
      }

      @NotNull
      public final File getFile() {
         return this.file;
      }

      @NotNull
      public final String getName() {
         return this.name;
      }

      @NotNull
      public final String getMeta() {
         return this.meta;
      }

      @NotNull
      public final lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull File var1, char var2, @NotNull String var3, @NotNull String var4, long var5
      ) {
         long var7 = ((long)var2 << 48 | var5 << 16 >>> 16) ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(16827, 5665111806900863784L ^ var7)
         );
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(12979, 674825678365388839L ^ var7)
         );
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(29874, 1109890070561175077L ^ var7)
         );
         return new lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var3, var4
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 84412111531144L;
         String var3 = this.meta;
         String var4 = this.name;
         File var5 = this.file;
         return "Option(file=" + var5 + ", name=" + var4 + ", meta=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.file.hashCode();
         var1 = var1 * 31 + this.name.hashCode();
         return var1 * 31 + this.meta.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 59900122698969L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[9];
         int var7 = 0;
         String var6 = "©Ã\u0090G\u0095T\u0003Ì\u0096µ=5Lé\u0088f\u0010+i?\u009eÁãE®k\u0013¦\u0013ì^$W\u0010ë\u0082/\u0018 \u0093Ö\u0018ù§¿#\nc:\u001d\u0010õÍ\u00029z1.Àº|Aaç\u008b\u0006_\u0010\u0017Ã=îô\u00950V(\u0002Ï0þ¯rJ\u0010¾\u0085\u009c)kÆª\u0086(fÎz!\u0085ÛÂ\u0010ªq\u0087Î¬©x¹\u008d\f\u0094;l8ÆÈ";
         int var8 = "©Ã\u0090G\u0095T\u0003Ì\u0096µ=5Lé\u0088f\u0010+i?\u009eÁãE®k\u0013¦\u0013ì^$W\u0010ë\u0082/\u0018 \u0093Ö\u0018ù§¿#\nc:\u001d\u0010õÍ\u00029z1.Àº|Aaç\u008b\u0006_\u0010\u0017Ã=îô\u00950V(\u0002Ï0þ¯rJ\u0010¾\u0085\u009c)kÆª\u0086(fÎz!\u0085ÛÂ\u0010ªq\u0087Î¬©x¹\u008d\f\u0094;l8ÆÈ"
            .length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "^&_\u000e¼<ÔFA\u007f\u000eÒ\u009eÃï S´¤\u001f\u009bÍZÃ«BîäÐd÷ò\u0010lh\u0091Eý±L~j|iîÙ\u009d9\u0082";
               var8 = "^&_\u000e¼<ÔFA\u007f\u000eÒ\u009eÃï S´¤\u001f\u009bÍZÃ«BîäÐd÷ò\u0010lh\u0091Eý±L~j|iîÙ\u009d9\u0082".length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[9];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 16985;
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
               throw new RuntimeException(
                  "me/octo/client/gui/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/gui/lllIlIllIIlllllllIIlllllIIIlIIIllIllIIIIIIlIllIlllIlllllIIIllIIIIIIlIllIIIIIlllIIIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
