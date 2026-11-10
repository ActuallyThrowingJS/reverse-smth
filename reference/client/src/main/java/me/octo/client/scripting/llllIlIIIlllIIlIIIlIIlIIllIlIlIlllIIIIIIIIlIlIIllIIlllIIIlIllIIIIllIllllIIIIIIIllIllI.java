package me.octo.client.scripting;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.graalvm.polyglot.Value;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI
   implements IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI {
   @NotNull
   private final Function0<Boolean> isEnabled;
   @NotNull
   private final Function1<List<me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl>, Unit> enable;
   @NotNull
   private final Function0<Unit> tick;
   @NotNull
   private final Function0<Unit> disable;
   @NotNull
   private final lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 16430137559955L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;

   public llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(
      @NotNull Function0<Boolean> isEnabledArg,
      @NotNull Function1<? super List<me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl>, Unit> enableArg,
      @NotNull Function0<Unit> tickArg,
      @NotNull Function0<Unit> disableArg
   ) {
      long var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 14015883824220L;
      Intrinsics.checkNotNullParameter(isEnabledArg, "isEnabled");
      Intrinsics.checkNotNullParameter(enableArg, "enable");
      Intrinsics.checkNotNullParameter(tickArg, "tick");
      Intrinsics.checkNotNullParameter(disableArg, "disable");
      super();
      this.isEnabled = isEnabledArg;
      this.enable = enableArg;
      this.tick = tickArg;
      this.disable = disableArg;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lIlIIllIllIIllIllllIllllIlIIIIllIIlIIIIlIlIlIlIllIllIIlllIlIlIIIIlIlIlIlIIlIllIIIllII(
         this.isEnabled, this.tick
      );
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return (Boolean)this.isEnabled.invoke();
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      String var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4804583671427799233L, var1
      );

      try {
         boolean var10000 = (Boolean)this.isEnabled.invoke();
         if (var3 != null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, -4761340727377745570L, var1
         );
      }

      return false;
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @Nullable Value param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, Value param2, char param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var5 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 68950446001787L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[11];
      int var12 = 0;
      String var11 = "\u008c¹ß\u007fôt«¾º\u0004X\u009aÕ\\Á)ÏÕ²w#\u0082$\u0002 ZÙ\u0091²ËjÇªU+(ß<\u0094\u0092á&à^-k\u0014\u0017\u0082÷R5ý¯}´]Pa6\n^\u008c\u008dòQÅ\u0011Iý\u0081g¹\u0094Ê(.\u0080»[ \u0099ö\u009aX\u001a$r\u009dô8h\u0081/\u0080ÍÌ\u0010Qb:MMV`·\u001d¨\u001fåM\u0099\u001e\u0014Æ÷è\u009bf\u001d[}\u000biVQ´\u0010·¨È\fQ4ç;\u008f\u0007 ;ãß»|Á$\u0013ÏÕ \u001a¨0#¼\u009c\u0087Î\u0094Gèk\u0087\u0014Q\u0096mS\u0017-r\u0010;WT\u0089©Q\u001fç\u0019gTÿ.Å\u0002þ æ!\u008f~ès1ç\u000f8\u009c\u0010¨4·äÂ<ÿw\u001d|ÂJ\u0003\u009d7¦\u0003ää\u009f\u0010KÀÏytr\u0096\u009eÒ <û\u009f¥\fû\u0010]pzxßI\rñ\u0096í\u009e&<7ðV\u0088ô\b¡èå0Xº)ç|¹K¹3Ä¯§û\u0010\u0091Ô\u0080û\u0000êÎò»î\u008d\u0012\u00934FH\u0016\u0091FB\u0094\u0007\u0082H\u008câbä%AA²Máh,«à*)5[Æ\u007fhº0ù\u0005 m7¡ÊÆª\u008f\u001bM$+çì\u0093í«ËO\u009båyºÚciÍ\u00ad\u000f\u0096Zj½\"7÷X\u000fÖ\"°x.éjÂ.¿Ab\u009f§ä\u009e\fÂYD²4ÒLCÛ\u0090\rb";
      int var13 = "\u008c¹ß\u007fôt«¾º\u0004X\u009aÕ\\Á)ÏÕ²w#\u0082$\u0002 ZÙ\u0091²ËjÇªU+(ß<\u0094\u0092á&à^-k\u0014\u0017\u0082÷R5ý¯}´]Pa6\n^\u008c\u008dòQÅ\u0011Iý\u0081g¹\u0094Ê(.\u0080»[ \u0099ö\u009aX\u001a$r\u009dô8h\u0081/\u0080ÍÌ\u0010Qb:MMV`·\u001d¨\u001fåM\u0099\u001e\u0014Æ÷è\u009bf\u001d[}\u000biVQ´\u0010·¨È\fQ4ç;\u008f\u0007 ;ãß»|Á$\u0013ÏÕ \u001a¨0#¼\u009c\u0087Î\u0094Gèk\u0087\u0014Q\u0096mS\u0017-r\u0010;WT\u0089©Q\u001fç\u0019gTÿ.Å\u0002þ æ!\u008f~ès1ç\u000f8\u009c\u0010¨4·äÂ<ÿw\u001d|ÂJ\u0003\u009d7¦\u0003ää\u009f\u0010KÀÏytr\u0096\u009eÒ <û\u009f¥\fû\u0010]pzxßI\rñ\u0096í\u009e&<7ðV\u0088ô\b¡èå0Xº)ç|¹K¹3Ä¯§û\u0010\u0091Ô\u0080û\u0000êÎò»î\u008d\u0012\u00934FH\u0016\u0091FB\u0094\u0007\u0082H\u008câbä%AA²Máh,«à*)5[Æ\u007fhº0ù\u0005 m7¡ÊÆª\u008f\u001bM$+çì\u0093í«ËO\u009båyºÚciÍ\u00ad\u000f\u0096Zj½\"7÷X\u000fÖ\"°x.éjÂ.¿Ab\u009f§ä\u009e\fÂYD²4ÒLCÛ\u0090\rb"
         .length();
      char var10 = 24;
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
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var14;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[11];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 5844169919332515194L;
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
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var30;
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

                  var11 = "Á\u0016d\u001e\u0010¾I4ª\u0085`\u008aecâºÂÍ#\u0002n\u0012\u0015°íF\u0093E\u0010k\u0015^Pø\u0002`\u001e[J\u0010´.½%U£Ó^\u008bba\u0019A¼\u00976\u0006H§`xßdÙvYÅÂ\u0091{~\u0005\u0019ºq\u008f\u001cÈå?Ý\u008c³=ò\"]ùÀµ0#¬\bà+Ë\u0017\u008d¹\u000f¯[¡\u009eªî\u0095®\u0000PÏ¬";
                  var13 = "Á\u0016d\u001e\u0010¾I4ª\u0085`\u008aecâºÂÍ#\u0002n\u0012\u0015°íF\u0093E\u0010k\u0015^Pø\u0002`\u001e[J\u0010´.½%U£Ó^\u008bba\u0019A¼\u00976\u0006H§`xßdÙvYÅÂ\u0091{~\u0005\u0019ºq\u008f\u001cÈå?Ý\u008c³=ò\"]ùÀµ0#¬\bà+Ë\u0017\u008d¹\u000f¯[¡\u009eªî\u0095®\u0000PÏ¬"
                     .length();
                  var10 = ' ';
                  var17 = -1;
            }

            var18 = var11.substring(++var17, var17 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29029;
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
            throw new RuntimeException("me/octo/client/scripting/llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI", var10);
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
            "me/octo/client/scripting/llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
