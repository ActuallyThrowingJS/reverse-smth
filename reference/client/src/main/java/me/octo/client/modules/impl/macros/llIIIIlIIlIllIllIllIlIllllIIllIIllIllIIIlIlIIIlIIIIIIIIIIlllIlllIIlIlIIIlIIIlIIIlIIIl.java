package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.Json.Default;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl {
   @NotNull
   public static llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static AtomicBoolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static ScheduledExecutorService IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static ConcurrentHashMap<String, llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static Json IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 128430915644350L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);
   private static long[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Long[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;

   private llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl() {
   }

   @JvmStatic
   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0, @NotNull JsonObject param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      int param0, @NotNull JsonObject param1, int param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var3 = var1 ^ 4437361882142L;
      long var10001 = var1 ^ 118357931657873L;
      int var5 = (int)((var1 ^ 118357931657873L) >>> 32);
      int var6 = (int)((var1 ^ 118357931657873L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);

      try {
         if (!lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.compareAndSet(false, true)) {
            return;
         }
      } catch (IllegalStateException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, 2353454386384606501L, var1
         );
      }

      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         var3,
         llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         2409789437073534827L,
         var1
      );
   }

   @NotNull
   public final CompletableFuture IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1, @NotNull String var2, int var3, short var4, long var5
   ) {
      long var7 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      long var9 = var7 ^ 71051405579401L;
      long var11 = var7 ^ 99164969221597L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(28320, 7429301363752828170L ^ var7)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(20228, 413140387529645224L ^ var7), var9, var2, var5
      );
   }

   @NotNull
   public final CompletableFuture llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1, @NotNull String var3, long var4
   ) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var6 = var1 ^ 87387770710943L;
      long var8 = var1 ^ 94372646224587L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(9024, 8339247998868393920L ^ var1)
      );
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8);
      return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(28985, 4179766371763183037L ^ var1), var6, var3, var4
      );
   }

   private final CompletableFuture IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String param1, long param2, String param4, long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, long var2, JsonElement var4) {
      var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var2;

      try {
         if (var4 == null) {
            System.out
               .println(
                  "[" + var1 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(1085, 8837823731578163990L ^ var2)
               );
            return;
         }
      } catch (IllegalStateException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, 3628340176246409174L, var2
         );
      }

      String var5 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(6043, 6055013794116321425L ^ var2)
         + var1
         + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(6441, 6457089633806667291L ^ var2)
         + IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.encodeToString(
            (SerializationStrategy)JsonElement.Companion.serializer(), var4
         )
         + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(19065, 7487050472691178847L ^ var2);
      System.out.println((Object)var5);
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(JsonObject param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Thread IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, Runnable var2) {
      var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var0;
      Thread var3 = new Thread(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(7513, 6746638542884307180L ^ var0)
      );
      boolean var5 = false;
      var3.setDaemon(true);
      return var3;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, JsonBuilder var2) {
      var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(15466, 3858969348778786124L ^ var0)
      );
      var2.setPrettyPrint(true);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0, char var1, short var2, com.google.gson.JsonObject var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      long var6 = var4 ^ 10956428911037L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(5602, 7554043371176997129L ^ var4)
      );
      Default var10000 = Json.Default;
      String var10001 = var3.toString();
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(8168, 4727230041678396223L ^ var4)
      );
      JsonObject var8 = JsonElementKt.getJsonObject(var10000.parseToJsonElement(var10001));
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         var8, var6
      );
      return Unit.INSTANCE;
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String param0, int param1, String param2, long param3, String param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var20 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 75182194494649L;
      long var22 = var20 ^ 56756313519938L;
      long var24 = var20 ^ 37478171126748L;
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[47];
      int var16 = 0;
      String var15 = "\u0014\u0010É³\u0085ï\rvÙ¡Ûm Ù\u0081\f ~\u0094\\\u009aä[ö\u0093Q¿\u001f4$\u0097 íåÈ ;ÆÕLÌ\u008eÒ¥,,ûª¥8\u0003\u0099ÃÊ¦ò\u001dö\u00802öC\u009e\u008bð;\u001ewx\u009d\u001dN\u00adwÖ<éíL\u0018A¸\u008a\u0012\u008cÎQ´á\u001a2GI¤ýÈ4:Ö¹\u0092Øi\u0010H\b\u0010g¿\u001f\b+|\u001c\u0088DütTâ\u009e¨r8\u0010â\u001do_l\u0086\u008e´¶ô$\u0080¦`\u009d`Ö\f\u00ad^\u0019(7\u0007G\u0090\u0092\u009fCCR\u0010Eç¦\u009aÏ\u0000\u0019k\u008cníù-}O\u001b%£Ù!üò£\u0010rzåv@ò\u0083¢ÕLAõ\u0092fÖô\u0010\u001báÌ\u0019C°ü\u001d ã\u0090\u0019\u001agqC8c\u0090óLÎ×ñ\u0018tÕ\u009f°\u0096qc¸\u0094[´(\u008crÇ¡J\u001cÚ8\u008a\u009c$ÿ¹¦ä\tSç<\u0087\u00846\u0005o· ò\u001a\u0006\u000eæ\u0081hwAÒ0+AÒJèÁ\u008dz\u008f.¨\u001bk\u008f\fo ¤@ñ¶n_l\u001ct\u000fé¹b\u009bxv\u0017Úq I\u00978O'\u00140¯zJ½\u0010\u0014.6×\u0097÷ö.=\u0097\\c\u0094\u0019\\M\u0010ÁcÛ\u0002ÀÙX\u001f\u001f\u0012¡É\u0018)ÊÒ ;\u0089{e\u0095e¸\u0084X9,Ã\u001b\u0016<7orQ\u0006rÙ\u0083\u0005:Ù½\u009fbûK\r(ä¼\u0099\u0001\u0005Û®Ã¶\u008eº+Â¤|µ\u000b¹õ\u009e¾\u0012\u0013ò\u0011ñp\n=!M\u009a¥´ \u0080\u001c¯jb`\t\u0014U32=U\u00ad7{\u0099Ô\u0083\u0097OÆ³YÙ\u0094º\ràî\"\u0002!\u0019ë\u009b\u001aÀÜmb¦óeJ<²ó@GS\u0081¯\u000f¾&\u0017\u001b\u008d\u0000V\\=\u009f«0ö«ýz¶JÃV\u001bKû\r\u00844Ì?\u0013\u0081v\nÑ²Z\u008a6\u0082Ô\u0097\u0090ªÃÿ³#¿ü\u0010Ò÷J²$ìo¯¹4n±\\G¤Ï\u0010iÜr-ÏFëk\u009d.j»âõ¬\u00128kr5í]-ï\u0087k&E°]p\"¢5FZÛ^3æ\u0097ºs\u0081\u009aV¶©ÿDÆ\u0083\u0083ÊL\u008dR½ûvê\u0004¬Ù\u0002aá!\u0019\u0092_|è('q×x¤{\u000eß\u0097ÃxKEvmÛ½\u0097ì\u00adâVÎ\u0097©úÃ\u001d²\u0086|+\b qØ\u008f¶äÃ(\u0093·h\u0094Ôò>C!~\u0086aÊ\u0002P\\iÇô\u0007b\u0015\u0011Kx\u0006\u009a¡øO\u008f\u0015\u009fËU\u0011IDkd\u0010\u0017Ñø$¿E\nmö\u0010Yà·¥;B\u0010%4\u00154\f=\u0088Ó\u0007\u0016§qÏ(ªX(©I~¥>\u001c\u0004ªHìU(Jq7½ö\u0097´3C3ü)d\u0089U¸\nr\u0016Ù\u0016L§3DÛKó\u0010/Bëaì·\u009c)Ç\u0015\u0096s\u0098¢¸ \u0010d\u009f\u0003ýY\u0098u÷Ï\u0084\u000b\u001b\u0001\u0091÷5\u0010æÖ\u0004x\u0001ý\u001e\u009f\tß\u0094Ö+æ\u0011æ ]Ní\u000e§Lò\u001dO\u0017\u0085\u0006L_\u009cÜg\u0084\u0080\u0012üÓÇèãdM\u007f\u0096çá@\u0010A\n\u0096\u0012Î9õë¶bÞ©zZvÇ\u0010e·Tìg9öð\nB\u0011;Â\u0007<\u0012 G¾\u007f\" \u0098\u0001Ã& \u0003N*÷ìEhGs¡B°¤HE´ËÌSQ\u009f0\u0010ô\u0014\u001cóÄu\u0094Z{÷È9\u0090ÅlË(ÎxdNÍíÏÒ?cñ)\u000b¦\u001bÔ\u009f+\u0097æ#«Ì½\u007fª\u008f{0\\3\f\u008e\u009d©©\u008cí¸=\u0010¶\u009dÆ\"'t\u0098ÙOÌÑ\u0092UÔ/»\u0010`\u009f\\ëÑ\u001bkÎ\u00070GâÊ¦Á¤(ë\u0017âjQ\fKiS\"\u009dð`,\u0097\u0017R\u0002\u0003áY\u0004\u0018\b¨ú\u008a×µ¨³\u009eâÜCÄ,\u0013ê\u00ad\u0010±'\\9æ\u001aÕ\u008e\",6_À*\u0094P8¹\n\u008eCô4àù+:T\u0098\u0091þ%\u0088g\u001dhZÎõ\u0088é\u0010_ÇY/\u009f\b';\u009dìtn\u0016l!Øq)\u0013¤¡\u009b\u0017»\u009b¾ú\u009b?°» \u008e>mÕhÌ\u009c|\"'ª\u0085*ò\u0017hÃ\u0096\u0080é¥\u0095¸±À!}}\u0088Ý\u001e¸ ¾É\u00119\naD¸sJf×õ¼èî~\u000b\u0087×Ã³86\u0086\u008e¯Mv}õÞ8¦B\u007fÂ\u0017\u0087ìÌÙ\u007f\u007fLÐÎ¥\u00ad\u0010Û \u000e^\\\u0013\u001e·l¿tmÅ\u0003®Í~¤\u007fõ´\nÀ\u0017P\u008c_#7V\u0012}\u00adpr\u0002Éïí8\fæÙx\u008cyg\u0083\u0006Õj\u008eýï¬â.àyñæ(Â\u0005\u0092[Ó\u009d\u0013r\u0090x\u009cu\u0098\u0086=ö\"äÂÏÀ&-\u00861ic\u0000\u008ayÌ\u0089p0\u0010C\u00803k¼Vf·\u001aï\\9º\u001f!(\u0010qÒ\"]B\u0099\u008ebÍµ³\n\u0087þ\u0088î\u0010³\u0092æ\u001c¬\n\nWbÄ\u0096\u000fcg±{ 8Å u¨Æt\u0095ðëd\u0096Â9\u0003áX<«¯ðj·£ëR\u0095l\u0086\u0097c\u0002(Î:\u0086\u009c¼ý?Ã\u0098¼v'z\u001f:[\u0085Orc´£ì[@mø¿ê:þ½\u009a\u008bse+îb¯";
      int var17 = "\u0014\u0010É³\u0085ï\rvÙ¡Ûm Ù\u0081\f ~\u0094\\\u009aä[ö\u0093Q¿\u001f4$\u0097 íåÈ ;ÆÕLÌ\u008eÒ¥,,ûª¥8\u0003\u0099ÃÊ¦ò\u001dö\u00802öC\u009e\u008bð;\u001ewx\u009d\u001dN\u00adwÖ<éíL\u0018A¸\u008a\u0012\u008cÎQ´á\u001a2GI¤ýÈ4:Ö¹\u0092Øi\u0010H\b\u0010g¿\u001f\b+|\u001c\u0088DütTâ\u009e¨r8\u0010â\u001do_l\u0086\u008e´¶ô$\u0080¦`\u009d`Ö\f\u00ad^\u0019(7\u0007G\u0090\u0092\u009fCCR\u0010Eç¦\u009aÏ\u0000\u0019k\u008cníù-}O\u001b%£Ù!üò£\u0010rzåv@ò\u0083¢ÕLAõ\u0092fÖô\u0010\u001báÌ\u0019C°ü\u001d ã\u0090\u0019\u001agqC8c\u0090óLÎ×ñ\u0018tÕ\u009f°\u0096qc¸\u0094[´(\u008crÇ¡J\u001cÚ8\u008a\u009c$ÿ¹¦ä\tSç<\u0087\u00846\u0005o· ò\u001a\u0006\u000eæ\u0081hwAÒ0+AÒJèÁ\u008dz\u008f.¨\u001bk\u008f\fo ¤@ñ¶n_l\u001ct\u000fé¹b\u009bxv\u0017Úq I\u00978O'\u00140¯zJ½\u0010\u0014.6×\u0097÷ö.=\u0097\\c\u0094\u0019\\M\u0010ÁcÛ\u0002ÀÙX\u001f\u001f\u0012¡É\u0018)ÊÒ ;\u0089{e\u0095e¸\u0084X9,Ã\u001b\u0016<7orQ\u0006rÙ\u0083\u0005:Ù½\u009fbûK\r(ä¼\u0099\u0001\u0005Û®Ã¶\u008eº+Â¤|µ\u000b¹õ\u009e¾\u0012\u0013ò\u0011ñp\n=!M\u009a¥´ \u0080\u001c¯jb`\t\u0014U32=U\u00ad7{\u0099Ô\u0083\u0097OÆ³YÙ\u0094º\ràî\"\u0002!\u0019ë\u009b\u001aÀÜmb¦óeJ<²ó@GS\u0081¯\u000f¾&\u0017\u001b\u008d\u0000V\\=\u009f«0ö«ýz¶JÃV\u001bKû\r\u00844Ì?\u0013\u0081v\nÑ²Z\u008a6\u0082Ô\u0097\u0090ªÃÿ³#¿ü\u0010Ò÷J²$ìo¯¹4n±\\G¤Ï\u0010iÜr-ÏFëk\u009d.j»âõ¬\u00128kr5í]-ï\u0087k&E°]p\"¢5FZÛ^3æ\u0097ºs\u0081\u009aV¶©ÿDÆ\u0083\u0083ÊL\u008dR½ûvê\u0004¬Ù\u0002aá!\u0019\u0092_|è('q×x¤{\u000eß\u0097ÃxKEvmÛ½\u0097ì\u00adâVÎ\u0097©úÃ\u001d²\u0086|+\b qØ\u008f¶äÃ(\u0093·h\u0094Ôò>C!~\u0086aÊ\u0002P\\iÇô\u0007b\u0015\u0011Kx\u0006\u009a¡øO\u008f\u0015\u009fËU\u0011IDkd\u0010\u0017Ñø$¿E\nmö\u0010Yà·¥;B\u0010%4\u00154\f=\u0088Ó\u0007\u0016§qÏ(ªX(©I~¥>\u001c\u0004ªHìU(Jq7½ö\u0097´3C3ü)d\u0089U¸\nr\u0016Ù\u0016L§3DÛKó\u0010/Bëaì·\u009c)Ç\u0015\u0096s\u0098¢¸ \u0010d\u009f\u0003ýY\u0098u÷Ï\u0084\u000b\u001b\u0001\u0091÷5\u0010æÖ\u0004x\u0001ý\u001e\u009f\tß\u0094Ö+æ\u0011æ ]Ní\u000e§Lò\u001dO\u0017\u0085\u0006L_\u009cÜg\u0084\u0080\u0012üÓÇèãdM\u007f\u0096çá@\u0010A\n\u0096\u0012Î9õë¶bÞ©zZvÇ\u0010e·Tìg9öð\nB\u0011;Â\u0007<\u0012 G¾\u007f\" \u0098\u0001Ã& \u0003N*÷ìEhGs¡B°¤HE´ËÌSQ\u009f0\u0010ô\u0014\u001cóÄu\u0094Z{÷È9\u0090ÅlË(ÎxdNÍíÏÒ?cñ)\u000b¦\u001bÔ\u009f+\u0097æ#«Ì½\u007fª\u008f{0\\3\f\u008e\u009d©©\u008cí¸=\u0010¶\u009dÆ\"'t\u0098ÙOÌÑ\u0092UÔ/»\u0010`\u009f\\ëÑ\u001bkÎ\u00070GâÊ¦Á¤(ë\u0017âjQ\fKiS\"\u009dð`,\u0097\u0017R\u0002\u0003áY\u0004\u0018\b¨ú\u008a×µ¨³\u009eâÜCÄ,\u0013ê\u00ad\u0010±'\\9æ\u001aÕ\u008e\",6_À*\u0094P8¹\n\u008eCô4àù+:T\u0098\u0091þ%\u0088g\u001dhZÎõ\u0088é\u0010_ÇY/\u009f\b';\u009dìtn\u0016l!Øq)\u0013¤¡\u009b\u0017»\u009b¾ú\u009b?°» \u008e>mÕhÌ\u009c|\"'ª\u0085*ò\u0017hÃ\u0096\u0080é¥\u0095¸±À!}}\u0088Ý\u001e¸ ¾É\u00119\naD¸sJf×õ¼èî~\u000b\u0087×Ã³86\u0086\u008e¯Mv}õÞ8¦B\u007fÂ\u0017\u0087ìÌÙ\u007f\u007fLÐÎ¥\u00ad\u0010Û \u000e^\\\u0013\u001e·l¿tmÅ\u0003®Í~¤\u007fõ´\nÀ\u0017P\u008c_#7V\u0012}\u00adpr\u0002Éïí8\fæÙx\u008cyg\u0083\u0006Õj\u008eýï¬â.àyñæ(Â\u0005\u0092[Ó\u009d\u0013r\u0090x\u009cu\u0098\u0086=ö\"äÂÏÀ&-\u00861ic\u0000\u008ayÌ\u0089p0\u0010C\u00803k¼Vf·\u001aï\\9º\u001f!(\u0010qÒ\"]B\u0099\u008ebÍµ³\n\u0087þ\u0088î\u0010³\u0092æ\u001c¬\n\nWbÄ\u0096\u000fcg±{ 8Å u¨Æt\u0095ðëd\u0096Â9\u0003áX<«¯ðj·£ëR\u0095l\u0086\u0097c\u0002(Î:\u0086\u009c¼ý?Ã\u0098¼v'z\u001f:[\u0085Orc´£ì[@mø¿ê:þ½\u009a\u008bse+îb¯"
         .length();
      char var14 = 16;
      int var27 = -1;

      label45:
      while (true) {
         String var28 = var15.substring(++var27, var27 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var37 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var37;
                  if ((var27 += var14) >= var17) {
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var18;
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[47];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "museum_fetch_recipe";
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = "museum_fetch_auction";
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = ".Æu@BØOío\u000b§\u0093\u0019\u0084l¬";
                     int var5 = ".Æu@BØOío\u000b§\u0093\u0019\u0084l¬".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var0.doFinal(
                           new byte[]{
                              (byte)(var8 >>> 56),
                              (byte)(var8 >>> 48),
                              (byte)(var8 >>> 40),
                              (byte)(var8 >>> 32),
                              (byte)(var8 >>> 24),
                              (byte)(var8 >>> 16),
                              (byte)(var8 >>> 8),
                              (byte)var8
                           }
                        );
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var42 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var6;
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Long[2];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new AtomicBoolean(false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = Executors.newSingleThreadScheduledExecutor(
                        llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ConcurrentHashMap<>();
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = JsonKt.Json$default(
                        null,
                        llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
                        1,
                        null
                     );
                     return;
                  }

                  var14 = var15.charAt(var27);
                  break;
               default:
                  var18[var16++] = var37;
                  if ((var27 += var14) < var17) {
                     var14 = var15.charAt(var27);
                     continue label45;
                  }

                  var15 = "9mñ\u0017µ@¾§Ù*\u0002²\u009b\u0001Çeé\u0017}MØÛ\u0094¾3ÍÞ'! ¥\u000b#\u0094í\u0014ëOÑý(\u009c'\u0093ýg +o¾ÌqQò0&W#}\u007fÝ\u0083\u0004\u0095íä¥\u0016SCÖên\u0003\u001cðw\u001b\u00adN%";
                  var17 = "9mñ\u0017µ@¾§Ù*\u0002²\u009b\u0001Çeé\u0017}MØÛ\u0094¾3ÍÞ'! ¥\u000b#\u0094í\u0014ëOÑý(\u009c'\u0093ýg +o¾ÌqQò0&W#}\u007fÝ\u0083\u0004\u0095íä¥\u0016SCÖên\u0003\u001cðw\u001b\u00adN%"
                     .length();
                  var14 = '(';
                  var27 = -1;
            }

            var28 = var15.substring(++var27, var27 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26216;
      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl", var10
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
         byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
            "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29853;
      if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3] = var15;
      }

      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3];
   }

   private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
            "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      private final CompletableFuture<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> future;
      @NotNull
      private final ScheduledFuture<?> timeoutTask;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 121793206030435L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         @NotNull CompletableFuture<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> futureArg,
         @NotNull ScheduledFuture<?> timeoutTaskArg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 9803282506315L;
         Intrinsics.checkNotNullParameter(futureArg, "future");
         Intrinsics.checkNotNullParameter(timeoutTaskArg, "timeoutTask");
         super();
         this.future = futureArg;
         this.timeoutTask = timeoutTaskArg;
      }

      @NotNull
      public final CompletableFuture<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> getFuture() {
         return this.future;
      }

      @NotNull
      public final ScheduledFuture<?> getTimeoutTask() {
         return this.timeoutTask;
      }

      @NotNull
      public final llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         short var1, @NotNull CompletableFuture var2, int var3, int var4, @NotNull ScheduledFuture var5
      ) {
         long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
            ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         Intrinsics.checkNotNullParameter(
            var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(12480, 6898779661847990992L ^ var6)
         );
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(14977, 4936826555423987862L ^ var6)
         );
         return new llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            var2, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 53048760638716L;
         return "Pending(future=" + this.future + ", timeoutTask=" + this.timeoutTask + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.future.hashCode();
         return var1 * 31 + this.timeoutTask.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 102496768942013L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[6];
         int var7 = 0;
         String var6 = "ãÊèÏÛ\u0094ë¥±\u0085g\u000fbï\"\u009f\u0013{(·9K\u009b$\u0018ò\u0012Õµ\u0019Od\u0017\u008c>ãñ\u00034ÃÑÉ\u0093ðdõ:Ñ\u0098\u0010ÃõäkßbÝ\u001fªCZrÞ2\u008b¬\u0018÷Æ°\u0088gÌ\u0098LèA\u0084-\\6z\u0089\u0002<6a(>-q";
         int var8 = "ãÊèÏÛ\u0094ë¥±\u0085g\u000fbï\"\u009f\u0013{(·9K\u009b$\u0018ò\u0012Õµ\u0019Od\u0017\u008c>ãñ\u00034ÃÑÉ\u0093ðdõ:Ñ\u0098\u0010ÃõäkßbÝ\u001fªCZrÞ2\u008b¬\u0018÷Æ°\u0088gÌ\u0098LèA\u0084-\\6z\u0089\u0002<6a(>-q"
            .length();
         char var5 = 24;
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
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[6];
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

                     var6 = "\u0086q\r\u0090¦/.í¾5\u0015Nìº[ù\u0018\u001a\u00017ß¾Î#NPö\u00932\u0006\u0098²\u0098FÍi\u0087¥þ\f®";
                     var8 = "\u0086q\r\u0090¦/.í¾5\u0015Nìº[ù\u0018\u001a\u00017ß¾Î#NPö\u00932\u0006\u0098²\u0098FÍi\u0087¥þ\f®".length();
                     var5 = 16;
                     var12 = -1;
               }

               var13 = var6.substring(++var12, var12 + var5);
               var10001 = 0;
            }
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 22662;
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
                  "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
               "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   @Serializable
   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final String type;
      @NotNull
      private final String status;
      @NotNull
      private final String itemId;
      @Nullable
      private final JsonElement IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 10042653920750L;
      private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull String typeArg, @NotNull String statusArg, @NotNull String itemIdArg, @Nullable JsonElement argument4Arg, @Nullable String argument5Arg
      ) {
         long var6 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 127111870626120L;
         Intrinsics.checkNotNullParameter(typeArg, "type");
         Intrinsics.checkNotNullParameter(statusArg, "status");
         Intrinsics.checkNotNullParameter(itemIdArg, "itemId");
         super();
         this.type = typeArg;
         this.status = statusArg;
         this.itemId = itemIdArg;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument4Arg;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument5Arg;
      }

      @NotNull
      public final String getType() {
         return this.type;
      }

      @NotNull
      public final String getStatus() {
         return this.status;
      }

      @NotNull
      public final String getItemId() {
         return this.itemId;
      }

      @Nullable
      public final JsonElement IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final JsonElement IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @Nullable
      public final String IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, @NotNull String var2, long var3, @NotNull String var5, @Nullable JsonElement var6, @Nullable String var7
      ) {
         var3 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var3;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32449, 3939625952699594483L ^ var3)
         );
         Intrinsics.checkNotNullParameter(
            var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23509, 2107450226459612138L ^ var3)
         );
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(7387, 6535862872067429612L ^ var3)
         );
         return new llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var5, var6, var7
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 134689801629431L;
         String var3 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         JsonElement var4 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         String var5 = this.itemId;
         String var6 = this.status;
         String var7 = this.type;
         return "MuseumResponse(type=" + var7 + ", status=" + var6 + ", itemId=" + var5 + ", payload=" + var4 + ", errorMessage=" + var3 + ")";
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
         long var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 116900278547662L;
         String var11 = "AGcJcc";
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
         Cipher var0;
         Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var1 = 1; var1 < 8; var1++) {
            var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var7 = new String[11];
         int var5 = 0;
         String var4 = "2+]\u001d@£\u009e|^)Bµ7¤¿9Å\t,³InÇ(/ç\u00adL\u0093aN!\u0010¡Ã\u0000\u001dî\u0003z\u0019=Ú\u000e\f¡\u00927µ ÷ªVä¢v`'À\u0090/´\u001bØ¸JnC\u009dÑ¸-:oÿ¬\u0089Ñ\u008dQF×\u0010\u000e/ætT¯\u008eþ¹,\u0010Jo&Vì\u0010bÝ-\u0096\"\u0018\u009eÝË\\òéµ\u0003m\u000f £W/f\u0081G\rPRZ\u0093ðÀi\u0013¤úóè»\u001d«3HDå\u0012d/\u00935b\u0010¼s\u0085\u008b\t\u0011¦9\u0087²\u007f\u0011\u000e¦åQ\u0010ôa\u0092\u00072Ê\u007f\u0094É\b\u0001\u0012¤Oôv(\u0097à\u001b\u0084ElM \u0018\u0018÷éÉjø¯Dë\u0088©,°äûFM\\8ØñÖ]\u008b\u001c\u0092Ä\u0097dX\u001e";
         int var6 = "2+]\u001d@£\u009e|^)Bµ7¤¿9Å\t,³InÇ(/ç\u00adL\u0093aN!\u0010¡Ã\u0000\u001dî\u0003z\u0019=Ú\u000e\f¡\u00927µ ÷ªVä¢v`'À\u0090/´\u001bØ¸JnC\u009dÑ¸-:oÿ¬\u0089Ñ\u008dQF×\u0010\u000e/ætT¯\u008eþ¹,\u0010Jo&Vì\u0010bÝ-\u0096\"\u0018\u009eÝË\\òéµ\u0003m\u000f £W/f\u0081G\rPRZ\u0093ðÀi\u0013¤úóè»\u001d«3HDå\u0012d/\u00935b\u0010¼s\u0085\u008b\t\u0011¦9\u0087²\u007f\u0011\u000e¦åQ\u0010ôa\u0092\u00072Ê\u007f\u0094É\b\u0001\u0012¤Oôv(\u0097à\u001b\u0084ElM \u0018\u0018÷éÉjø¯Dë\u0088©,°äûFM\\8ØñÖ]\u008b\u001c\u0092Ä\u0097dX\u001e"
            .length();
         char var3 = ' ';
         int var13 = -1;

         label27:
         while (true) {
            String var14 = var4.substring(++var13, var13 + var3);
            byte var10001 = -1;

            while (true) {
               byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
               String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               switch (var10001) {
                  case 0:
                     var7[var5++] = var20;
                     if ((var13 += var3) >= var6) {
                        IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                        llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[11];
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                           null
                        );
                        return;
                     }

                     var3 = var4.charAt(var13);
                     break;
                  default:
                     var7[var5++] = var20;
                     if ((var13 += var3) < var6) {
                        var3 = var4.charAt(var13);
                        continue label27;
                     }

                     var4 = "Éúøyë`\u0010ôÁd\u0013¾l\u008f{% ø:\u0006{ m3£kÏ¹|ËÌÈ\u0016V\u0086pý!'xy\u0097\u0091\u001ev$%\u001f\u0085";
                     var6 = "Éúøyë`\u0010ôÁd\u0013¾l\u008f{% ø:\u0006{ m3£kÏ¹|ËÌÈ\u0016V\u0086pý!'xy\u0097\u0091\u001ev$%\u001f\u0085".length();
                     var3 = 16;
                     var13 = -1;
               }

               var14 = var4.substring(++var13, var13 + var3);
               var10001 = 0;
            }
         }
      }

      public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
      }

      public static String IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 26128;
         if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
            llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
               "me/octo/client/modules/impl/macros/llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
         private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         }

         @NotNull
         public final KSerializer<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
            return (KSerializer<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll>)llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         }
      }
   }
}
