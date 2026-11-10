package me.octo.client.modules.impl.features.qol;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.input.MouseButtonEvent;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll {
   @NotNull
   public static IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 124228764615305L;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Map IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new HashMap(13);

   private IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll() {
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull MouseButtonEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, Object param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      FormattedCharSequence var1, char var2, int var3, int var4
   ) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      long var7 = (var5 ^ 46117890160485L) >>> 32;
      int var9 = (int)((var5 ^ 46117890160485L) << 32 >>> 32);
      StringBuilder var10 = new StringBuilder();
      var1.accept(
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      String var10000 = var10.toString();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(8117, 7418537085340067176L ^ var5)
      );
      return var10000;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, StringBuilder var2, int var3, int var4, Style var5, int var6
   ) {
      long var7 = (var0 << 32 | (long)var3 << 32 >>> 32) ^ lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(16642, 5117297295147945531L ^ var7)
      );
      var2.appendCodePoint(var6);
      return true;
   }

   static {
      long var0 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 43927275023460L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[16];
      int var7 = 0;
      String var6 = ".æÚ[\u0080o\u008c$aÿ#d\u0017\u0011o\u0087 \u0088h\u0085\u0099\u008fâ!F°J`Û1îÆ0f7ÚöQEíÊF\u0019áâ>`EÆ m\u0091\u001c23Lìg&w¡S*ÿÎÕ\u0015íu¹çÀÄÌ)J«&\"I\u008b\"\u0018hZè\u000b(\u00adÙ.ÓrO¡ý*ia©ÿq=:Ü¹, Í\u009b`¢æmÓ\u007fä\u00875Ò\u001fôãdFå\u0016L\u0080¯d\rÃ,Áb¸\u0001Â`\u0010ò\u009cr0\u00ad\u0013uTÎ\u0094MÑ\u001e} |\u0010±=f\u0010ª\u008b¹e¹á}\u008fIÃûs\u0018ýO1U\u0013Øz\u0016º\u0096\u0087Æ\u0001Q°çx½Õ'Ä\u009fÊ4H®êÑæ\u0014ý´Ìî\u0016^tÍ-\u00831N\u008eª»ÈþéDåÓ\u001d_¤\u0083Ù*8\u0010\u009aÒ?\u008c7\u000f\u0094SÀ|¶VÿRP\u0084d§\u0015DvàW\u00006Ñî\u0016&|tÆÒØ\u0012Fú\u001e\u0010\u009bÓýÍpëð\u00058ïú9\bô¢\u008d\u0018@Ù7àÁz\u0092uûª\u000e±h\nÍ@\u000b\b\u00ad\u0003C¼\u00808\u0010¾1\u0089\u009eY\u0016\u0014\u0010\u0001\u0089°\u009cïÅ!Ý \u0014qm´\f\u0014\u001bDç×\u009bl¸\u000b\u001a\u0090$ñ\u0086ú%3¦\u0013l¯Ï£\u0083iÚ&\u0010Y\u0080~\u008b\u009dÝ\u0081ôôv\u009b\u0019#-JÜ";
      int var8 = ".æÚ[\u0080o\u008c$aÿ#d\u0017\u0011o\u0087 \u0088h\u0085\u0099\u008fâ!F°J`Û1îÆ0f7ÚöQEíÊF\u0019áâ>`EÆ m\u0091\u001c23Lìg&w¡S*ÿÎÕ\u0015íu¹çÀÄÌ)J«&\"I\u008b\"\u0018hZè\u000b(\u00adÙ.ÓrO¡ý*ia©ÿq=:Ü¹, Í\u009b`¢æmÓ\u007fä\u00875Ò\u001fôãdFå\u0016L\u0080¯d\rÃ,Áb¸\u0001Â`\u0010ò\u009cr0\u00ad\u0013uTÎ\u0094MÑ\u001e} |\u0010±=f\u0010ª\u008b¹e¹á}\u008fIÃûs\u0018ýO1U\u0013Øz\u0016º\u0096\u0087Æ\u0001Q°çx½Õ'Ä\u009fÊ4H®êÑæ\u0014ý´Ìî\u0016^tÍ-\u00831N\u008eª»ÈþéDåÓ\u001d_¤\u0083Ù*8\u0010\u009aÒ?\u008c7\u000f\u0094SÀ|¶VÿRP\u0084d§\u0015DvàW\u00006Ñî\u0016&|tÆÒØ\u0012Fú\u001e\u0010\u009bÓýÍpëð\u00058ïú9\bô¢\u008d\u0018@Ù7àÁz\u0092uûª\u000e±h\nÍ@\u000b\b\u00ad\u0003C¼\u00808\u0010¾1\u0089\u009eY\u0016\u0014\u0010\u0001\u0089°\u009cïÅ!Ý \u0014qm´\f\u0014\u001bDç×\u009bl¸\u000b\u001a\u0090$ñ\u0086ú%3¦\u0013l¯Ï£\u0083iÚ&\u0010Y\u0080~\u008b\u009dÝ\u0081ôôv\u009b\u0019#-JÜ"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u0011N\u008a¸\u001c\u0093-2\u001e¿\u0090\u0096\b©\u009bP&\u0094(¨\u0080/áQÿ/\"\u0004+#\u0086/gn\u0083\u001b»\u0004${@\u0082ÀÔU»\u0005\u0010¿t\u0085j¶ß\u0089ÌÑò@\u008bäÊ\u000f\u0003É»\u009ak²Å\u0086',Y\u001aéç!jºÅ°f\u0095\u0091tzánq\u00139Ô²ñ\u0011Q5\u000fÈÆß~Ñg";
            var8 = "\u0011N\u008a¸\u001c\u0093-2\u001e¿\u0090\u0096\b©\u009bP&\u0094(¨\u0080/áQÿ/\"\u0004+#\u0086/gn\u0083\u001b»\u0004${@\u0082ÀÔU»\u0005\u0010¿t\u0085j¶ß\u0089ÌÑò@\u008bäÊ\u000f\u0003É»\u009ak²Å\u0086',Y\u001aéç!jºÅ°f\u0095\u0091tzánq\u00139Ô²ñ\u0011Q5\u000fÈÆß~Ñg"
               .length();
            var5 = '(';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var9;
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new String[16];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13225;
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
               "me/octo/client/modules/impl/features/qol/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll", var10
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
            "me/octo/client/modules/impl/features/qol/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$94dfa5cce1b7daa7(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5f036b91a42878c7(
      long param1, Object param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$88f6888d1aa0e8e1(
      FormattedCharSequence var1, char var2, int var3, int var4
   ) {
      byte var11 = 0;
      var3 = 1308426581;
      char var13 = '쯷';
      long var5 = ((long)var11 << 48 | (long)var3 << 32 >>> 16 | (long)var13 << 48 >>> 48)
         ^ lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      long var7 = (var5 ^ 46117890160485L) >>> 32;
      int var9 = (int)((var5 ^ 46117890160485L) << 32 >>> 32);
      StringBuilder var10 = new StringBuilder();
      var1.accept(
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      String var10000 = var10.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }
}
