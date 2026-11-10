package me.octo.client.utils.skyblock;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI {
   @NotNull
   public static lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static ConcurrentHashMap<String, Double> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static AtomicBoolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Map<String, Double> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 66761742752542L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;

   private lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var3 = var1 ^ 62606495858436L;
      long var5 = (var1 ^ 42142402066216L) >>> 8;
      int var7 = (int)((var1 ^ 42142402066216L) << 56 >>> 56);

      try {
         if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.compareAndSet(false, true)) {
            IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$59d1e39e9ed0f431(
                  0L,
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  var5,
                  (byte)var7,
                  lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl
               );
         }
      } catch (MatchException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, -3513922497379534106L, var1
         );
      }
   }

   public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1, short param2, int param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, int var1, short var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      long var5 = var3 ^ 78415377450442L;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var5
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0) {
      var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var0;
      long var10001 = var0 ^ 1618648322528L;
      int var2 = (int)((var0 ^ 1618648322528L) >>> 48);
      int var3 = (int)((var0 ^ 1618648322528L) << 16 >>> 32);
      int var4 = (int)(var10001 << 48 >>> 48);
      var10001 = var0 ^ 27426151781502L;
      int var5 = (int)((var0 ^ 27426151781502L) >>> 32);
      int var6 = (int)((var0 ^ 27426151781502L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
            (short)var2,
            var3,
            (char)var4
         );
      return Unit.INSTANCE;
   }

   static {
      long var14 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 12368734856532L;
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[14];
      int var10 = 0;
      String var9 = "2Þú\u00881½\u0091\u0007¥mÞZÌ\u0089ª^XSs\u0092!Ê\\]æ\r\u0016¸\u0002\u0015éU\bX¹«ÕU\u0097]ÙB\u001f\u0019\u0001\t\u001düV_àF#µ$Ô¡I{\u0017\r6\u0088ÒÅ\u0013º^\u001e\u0012nÃI<\u008d5w,\u0090\u0093»u5æ\u0088LÑ©ìæÜATv8\u000bà\u0014ÊË\u0010Îìzt\u0018¹RÞ4\u001b^\u009f\u0019\u00134\u0014L\u0010Ò}P-!\u009aî\u009eMM[\u0018\u0084\u0095ç\u008c>Gâ\u007f/\u0092\u008d½j\u0080Ñ\u0097õ/ÂY\u0085ðñ²X;`\u009d\u0092}QüÞ7¹\u0089\u0099\u000b£R\u000e\u001aG\u008f\\ÿW\u000ev\u0087rPF°\u000e\u0095\u0098ä¹ë_âÄy\u00adÞ\u0096A¸ªjY\u0092Î\"-íöõ\u001dAÀ\u0085×nOÃ\u0006s\u00147KD_\u000b\u009e7\u009cù\u0091fèoILEÑ´=F\u009aVÑ _\u0096ûcí\u0000¹\f;ÿW\f;\u0087zIÞ\u0083íE\u0015\u0080@\u009eÑ¯¹g\u0088©Ù\n 1\\\u0081k¹øà¯Éµø\u0013(Ç,\n®1\u0089\u0084O\u007f1P\u0000>Ç·Fs\u001d` a2ÑÝ5\u0010¨\u0086\tHUúô ?\u0018\u008euku@\u001fï-e¸[\u0096Ú\u0016Já ]¶)\u0090G¤R»\u0012\u0086{\u0081 ¾uøN-Èt\u008c\u0016\u009bÚÉ£«;äU\u0003\u009a@¤KFl·=ù¸+Uã\u000f\u0081`ÏZ\u0012ç\u009aÌÂüp\u00889\u0005Ï´\u0080lã`NTQK\u0099\u0007:i\u0002\u008fÖ Ls\u0088\u000e«ì¸\u0097$tÛ*LIü\u0013ä\u001cIã(X2§v!\u0086»>\u0019oäãªªµ\u0089ÃÀ]âWv2.\u0017\u000bS\u00022Aq/0\u008f´+\u009e\u000e3c\u0018\u008e\u0081s«\u008eÞ;uÞÐõ,¦\u0015¨\u0005\u000fþFm\nz]-";
      int var11 = "2Þú\u00881½\u0091\u0007¥mÞZÌ\u0089ª^XSs\u0092!Ê\\]æ\r\u0016¸\u0002\u0015éU\bX¹«ÕU\u0097]ÙB\u001f\u0019\u0001\t\u001düV_àF#µ$Ô¡I{\u0017\r6\u0088ÒÅ\u0013º^\u001e\u0012nÃI<\u008d5w,\u0090\u0093»u5æ\u0088LÑ©ìæÜATv8\u000bà\u0014ÊË\u0010Îìzt\u0018¹RÞ4\u001b^\u009f\u0019\u00134\u0014L\u0010Ò}P-!\u009aî\u009eMM[\u0018\u0084\u0095ç\u008c>Gâ\u007f/\u0092\u008d½j\u0080Ñ\u0097õ/ÂY\u0085ðñ²X;`\u009d\u0092}QüÞ7¹\u0089\u0099\u000b£R\u000e\u001aG\u008f\\ÿW\u000ev\u0087rPF°\u000e\u0095\u0098ä¹ë_âÄy\u00adÞ\u0096A¸ªjY\u0092Î\"-íöõ\u001dAÀ\u0085×nOÃ\u0006s\u00147KD_\u000b\u009e7\u009cù\u0091fèoILEÑ´=F\u009aVÑ _\u0096ûcí\u0000¹\f;ÿW\f;\u0087zIÞ\u0083íE\u0015\u0080@\u009eÑ¯¹g\u0088©Ù\n 1\\\u0081k¹øà¯Éµø\u0013(Ç,\n®1\u0089\u0084O\u007f1P\u0000>Ç·Fs\u001d` a2ÑÝ5\u0010¨\u0086\tHUúô ?\u0018\u008euku@\u001fï-e¸[\u0096Ú\u0016Já ]¶)\u0090G¤R»\u0012\u0086{\u0081 ¾uøN-Èt\u008c\u0016\u009bÚÉ£«;äU\u0003\u009a@¤KFl·=ù¸+Uã\u000f\u0081`ÏZ\u0012ç\u009aÌÂüp\u00889\u0005Ï´\u0080lã`NTQK\u0099\u0007:i\u0002\u008fÖ Ls\u0088\u000e«ì¸\u0097$tÛ*LIü\u0013ä\u001cIã(X2§v!\u0086»>\u0019oäãªªµ\u0089ÃÀ]âWv2.\u0017\u000bS\u00022Aq/0\u008f´+\u009e\u000e3c\u0018\u008e\u0081s«\u008eÞ;uÞÐõ,¦\u0015¨\u0005\u000fþFm\nz]-"
         .length();
      char var8 = '\u0010';
      int var7 = -1;

      while (true) {
         byte[] var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
         String var29 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13).intern();
         byte var10001 = -1;
         var12[var10++] = var29;
         if ((var7 += var8) >= var11) {
            var9 = "\u0093ßåèìûºÛ\u00118í\u0095IÈ½X\u0010'Ã\u0006\u0092\u001fcm-°\u0089Ë^±m\u008aÊ";
            var11 = "\u0093ßåèìûºÛ\u00118í\u0095IÈ½X\u0010'Ã\u0006\u0092\u001fcm-°\u0089Ë^±m\u008aÊ".length();
            var8 = '\u0010';
            var7 = -1;

            while (true) {
               var13 = var5.doFinal(var9.substring(++var7, var7 + var8).getBytes("ISO-8859-1"));
               String var31 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13).intern();
               byte var26 = 0;
               var12[var10++] = var31;
               if ((var7 += var8) >= var11) {
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var12;
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[14];
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = "https://api.polinexclient.net/polinex/mod/fabric/bazaar";
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -3685528030340714983L;
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
                  long var34 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  var26 = -1;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var34;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new AtomicBoolean(false);
                  Pair[] var16 = new Pair[]{
                     TuplesKt.to("COBBLESTONE", 1.0),
                     TuplesKt.to("ENCHANTED_COBBLESTONE", 160.0),
                     TuplesKt.to("GLACITE", 60.0),
                     TuplesKt.to("HARD_STONE", 1.0),
                     TuplesKt.to("SAND", 2.0),
                     TuplesKt.to("RED_SAND", 4.0),
                     TuplesKt.to("MYCELIUM", 2.0)
                  };
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = MapsKt.mapOf(var16);
                  return;
               }

               var8 = var9.charAt(var7);
            }
         }

         var8 = var9.charAt(var7);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5299;
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
            throw new RuntimeException(
               "me/octo/client/utils/skyblock/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI", var10
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
            "me/octo/client/utils/skyblock/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
