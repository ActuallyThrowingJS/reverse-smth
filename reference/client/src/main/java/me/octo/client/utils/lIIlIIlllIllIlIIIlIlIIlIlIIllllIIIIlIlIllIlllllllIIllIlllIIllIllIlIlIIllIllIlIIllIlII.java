package me.octo.client.utils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.imageio.ImageIO;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 120921006803311L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   private lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param0, char param1, @NotNull Path param2, int param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull Path var0, long var1) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      boolean var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4106149690587927841L, var1
      );
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9929, 5066706594087496748L ^ var1)
      );
      boolean var3 = var10000;

      label26: {
         try {
            if (var3) {
               break label26;
            }

            LinkOption[] var10001 = new LinkOption[0];
            if (Files.exists(var0, Arrays.copyOf(var10001, var10001.length))) {
               return;
            }
         } catch (IOException var7) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var7, 4160493644771134222L, var1
            );
         }

         try {
            Files.createDirectories(var0);
         } catch (IOException var6) {
            throw new RuntimeException(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(10273, 2014026145492263632L ^ var1) + var0, var6
            );
         }
      }

      try {
         ;
      } catch (IOException var5) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(10273, 2014026145492263632L ^ var1) + var0, var5
         );
      }
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Path var0, long var1, @NotNull String var3
   ) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9929, 5066823481460007408L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(31740, 1227288925458103510L ^ var1)
      );

      try {
         CharSequence var10001 = var3;
         OpenOption[] var4 = new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
         Files.writeString(var0, var10001, var4);
      } catch (IOException var6) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1792, 4527122028203868196L ^ var1) + var0, var6
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      int var0, int var1, @NotNull Path var2, int var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1502, 7294016269034694694L ^ var4)
      );

      try {
         String var6 = Files.readString(var2);
         Intrinsics.checkNotNull(var6);
         return var6;
      } catch (IOException var8) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(17464, 739831948485487067L ^ var4) + var2, var8
         );
      }
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, @NotNull Path var2, @NotNull byte[] var3
   ) {
      var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9929, 5066705897111809588L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18992, 5434691662267679433L ^ var0)
      );

      try {
         OpenOption[] var4 = new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};
         Files.write(var2, var3, var4);
      } catch (IOException var6) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(20380, 4923184082565793634L ^ var0) + var2, var6
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final byte[] IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, @NotNull Path var2) {
      var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9929, 5066802040400142029L ^ var0)
      );

      try {
         byte[] var3 = Files.readAllBytes(var2);
         Intrinsics.checkNotNull(var3);
         return var3;
      } catch (IOException var5) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(19339, 5751768854460904343L ^ var0) + var2, var5
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final List lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull Path var0, long var1) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(75, 4210598559167092092L ^ var1)
      );

      try {
         var var4 = Files.list(var0);
         Throwable var5 = null;

         List var15;
         try {
            Stream var6 = (Stream)var4;
            boolean var7 = false;
            var15 = var6.toList();
         } catch (Throwable var11) {
            var5 = var11;
            throw var11;
         } finally {
            AutoCloseableKt.closeFinally(var4, var5);
         }

         Intrinsics.checkNotNull(var15);
         return var15;
      } catch (IOException var13) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(15136, 8377279410680507918L ^ var1) + var0, var13
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final byte[] IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, @NotNull BufferedImage var2) {
      var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(1899, 9050675572351574653L ^ var0)
      );
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();

      try {
         ImageIO.write(
            var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(18482, 889499131724000573L ^ var0), var3
         );
      } catch (IOException var5) {
         throw new RuntimeException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(26879, 805140036014394851L ^ var0), var5
         );
      }

      byte[] var10000 = var3.toByteArray();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(12903, 4735171973967615861L ^ var0)
      );
      return var10000;
   }

   @JvmStatic
   @Nullable
   public static final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param0, @NotNull String param1, @NotNull String param2, @NotNull String param3, short param4, int param5, @NotNull String... param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 30494492684536L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[22];
      int var7 = 0;
      String var6 = "Ãë\u0081TD\u009bò[o\u0001\\gË(\u00ad¶NzB÷\u000b\u009eÅå\u009a\u0002ÎêlÏ\u001b{/\u001e\u008e[%+{fî\u001c\u008bHò.1ÒÃ\u0088\u009e¢\u0089å\u000f®(o]EØ\t§ó\"JL¯& TpDwÄT4æ^\u0014\u0010Ê=ÌÆ8pV\u009f\u0095;\u001aO\u0081ló\u0011\u0010è\u0010M]´\u0011?Ý¼\u0093Ø/\u009f\u0094½µ\u0010Ð\u009e,\u0096èC\u0087`×A¯ùN´7\f(Ø[\u0080ÿL\u001a®é'¨\nQ\u00898\u008d\rÓ\u0017\u008eæ\rùk\u009fh\u0012¾¤\u009eiäÉ$gÇ{\u0085ªÿº0\u0010åÚð\u008cD\u0089ë\u0085\u0007\u0016è¨\u0099Ç\u0093q\u001b÷ø\u008cÜ[_\u0012¤»\u0098*g ÒET\u0095!\u0087^Ç\u009cc\rÅ\u0018c\u007fc\u0003\u0010~K*dºÏÚ²oå\u0003\u001fCx\u0093\u0080(\u009cÊµ\u0013\u009a$O\u0082d§èl³Ô°WZCuÖ]+¦ú\u0084mö1Xø\u0089!\u0091/ ì§\u0091B1 \u0011¢s²\u008e¯1¿c\rF<Ýæþ^N\u008a+ÒJ°<sèÛ\u007f*ç\u00ad&\u0004(¦\u0090ø½\u009bÍ±ùÐ\u0019Ä1 Ó)äl.,®êy\u008fvûSI@ñÐP\u0090@\u009b¬\u00982\u007fj\u0006\u0010\u0097'\u0004$\u009eöÍø×*Ãè\u009aþu¦\u0010Q\u0007\u008bk\u0089Ã\u0084Ö#&/¼\u0015ÓÔ£(°H\u0013ù¼\u009aäI\u0001\u0006Å\u000e>µßÈ ~\u0093\u008c \"À\u0003Oû+¾=]ú;p\u0003\u0015\u0001'0°\u0093\u0010\"\u001eÃSÈ \u0007Ìô\u009a\u009c©4R9W(-Cú¤°ø»ìeð\u000f\u0019Uk@Ò³9\u0000 _Tfp]` Ç¢Êìã\u0015Ø¸\u0080\u0004³\u0017)8CäÜ/ÇÂG>\u0085-\u0091Ê\u0092\u0084-µ«oQ?Ï\u0083iZ\u0095¾#\u0094à5¡\u001b¢óþ\u000e9iØbËFC\u0016X\f\u0012\u000eðHM\u0087%7fg(h\u009b?ß\u0095-s..èÌðWD>`¬|È¦Øm\u007f¬ë\u001b´\u0098VÆ\u0098£l\bîW0¢Û#\u0010½&\u0013\u0090o.Û\u009fñ³òª\u0088Oñ\u0092(\u008e ,Ø¶Ä\"0Ó\u008b\u0012§\u0006*f\u000b\u0018\u0096\u0000»%TK\u0097$mø\u000fÍ×\u001fy¾ö¿\u0006\u0004¥\u0092Ç\u0010 ÑEYTÆ\u0085\u0086Ëö\u009f\bÇ)9÷";
      int var8 = "Ãë\u0081TD\u009bò[o\u0001\\gË(\u00ad¶NzB÷\u000b\u009eÅå\u009a\u0002ÎêlÏ\u001b{/\u001e\u008e[%+{fî\u001c\u008bHò.1ÒÃ\u0088\u009e¢\u0089å\u000f®(o]EØ\t§ó\"JL¯& TpDwÄT4æ^\u0014\u0010Ê=ÌÆ8pV\u009f\u0095;\u001aO\u0081ló\u0011\u0010è\u0010M]´\u0011?Ý¼\u0093Ø/\u009f\u0094½µ\u0010Ð\u009e,\u0096èC\u0087`×A¯ùN´7\f(Ø[\u0080ÿL\u001a®é'¨\nQ\u00898\u008d\rÓ\u0017\u008eæ\rùk\u009fh\u0012¾¤\u009eiäÉ$gÇ{\u0085ªÿº0\u0010åÚð\u008cD\u0089ë\u0085\u0007\u0016è¨\u0099Ç\u0093q\u001b÷ø\u008cÜ[_\u0012¤»\u0098*g ÒET\u0095!\u0087^Ç\u009cc\rÅ\u0018c\u007fc\u0003\u0010~K*dºÏÚ²oå\u0003\u001fCx\u0093\u0080(\u009cÊµ\u0013\u009a$O\u0082d§èl³Ô°WZCuÖ]+¦ú\u0084mö1Xø\u0089!\u0091/ ì§\u0091B1 \u0011¢s²\u008e¯1¿c\rF<Ýæþ^N\u008a+ÒJ°<sèÛ\u007f*ç\u00ad&\u0004(¦\u0090ø½\u009bÍ±ùÐ\u0019Ä1 Ó)äl.,®êy\u008fvûSI@ñÐP\u0090@\u009b¬\u00982\u007fj\u0006\u0010\u0097'\u0004$\u009eöÍø×*Ãè\u009aþu¦\u0010Q\u0007\u008bk\u0089Ã\u0084Ö#&/¼\u0015ÓÔ£(°H\u0013ù¼\u009aäI\u0001\u0006Å\u000e>µßÈ ~\u0093\u008c \"À\u0003Oû+¾=]ú;p\u0003\u0015\u0001'0°\u0093\u0010\"\u001eÃSÈ \u0007Ìô\u009a\u009c©4R9W(-Cú¤°ø»ìeð\u000f\u0019Uk@Ò³9\u0000 _Tfp]` Ç¢Êìã\u0015Ø¸\u0080\u0004³\u0017)8CäÜ/ÇÂG>\u0085-\u0091Ê\u0092\u0084-µ«oQ?Ï\u0083iZ\u0095¾#\u0094à5¡\u001b¢óþ\u000e9iØbËFC\u0016X\f\u0012\u000eðHM\u0087%7fg(h\u009b?ß\u0095-s..èÌðWD>`¬|È¦Øm\u007f¬ë\u001b´\u0098VÆ\u0098£l\bîW0¢Û#\u0010½&\u0013\u0090o.Û\u009fñ³òª\u0088Oñ\u0092(\u008e ,Ø¶Ä\"0Ó\u008b\u0012§\u0006*f\u000b\u0018\u0096\u0000»%TK\u0097$mø\u000fÍ×\u001fy¾ö¿\u0006\u0004¥\u0092Ç\u0010 ÑEYTÆ\u0085\u0086Ëö\u009f\bÇ)9÷"
         .length();
      char var5 = '8';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[22];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
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

                  var6 = "\u008dð]\u009dæA+9rëv[ç\u0083ö£¬w@\u0083H½NúR»«\rÎZý¯6Ä·Ö²0ØÍ\u0019\u008e\u0080ãÃÑø©wC¼\u0080zÎågnÔ3é\u008e\u008aâÙ\u0010Íµhy2â\u0095\u0018\u0001lt\u0007ðFM\u008e";
                  var8 = "\u008dð]\u009dæA+9rëv[ç\u0083ö£¬w@\u0083H½NúR»«\rÎZý¯6Ä·Ö²0ØÍ\u0019\u008e\u0080ãÃÑø©wC¼\u0080zÎågnÔ3é\u008e\u008aâÙ\u0010Íµhy2â\u0095\u0018\u0001lt\u0007ðFM\u008e"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28887;
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
            throw new RuntimeException("me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII", var10);
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
            "me/octo/client/utils/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
