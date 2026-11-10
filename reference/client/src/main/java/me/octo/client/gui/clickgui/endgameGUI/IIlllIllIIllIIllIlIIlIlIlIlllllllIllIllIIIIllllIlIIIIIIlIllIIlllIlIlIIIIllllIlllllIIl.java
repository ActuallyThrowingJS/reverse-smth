package me.octo.client.gui.clickgui.endgameGUI;

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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl;
import me.octo.client.modules.impl.features.qol.MouseUngrab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl
   extends IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl {
   @NotNull
   private final Minecraft IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll = 121236984754632L;
   private static String[] lIIIIIlllllIlIlIllIllllIIIllIIlIIIlIIIIlIlIlllllIIllIlllIllllIlIIIlllIIIIIIlIIlIllIll;
   private static String[] lIlllIIllllIIIIlIIIllIIllIllIlIlIIlIIIlllIIllIIIIIIlIIIIlIlIlllIIlIIlIlIIIllIIlllIIII;
   private static Map llllIllIIIIIIIllIllIIllllIlIllllllllIIllIlIIllIIlllIllIIIlIIlIllIIIIlIIllllIlIIIlIIII = new HashMap(13);

   public IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl() {
      long var1 = llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll ^ 63625027346750L;
      MutableComponent var10001 = Component.empty();
      Intrinsics.checkNotNullExpressionValue(var10001, "empty(...)");
      super((Component)var10001);
      Minecraft var3 = Minecraft.getInstance();
      Intrinsics.checkNotNullExpressionValue(var3, "getInstance(...)");
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
   }

   @NotNull
   protected final Minecraft IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public boolean isPauseScreen() {
      return false;
   }

   public void onClose() {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void extractRenderState(@NotNull GuiGraphicsExtractor contextArg, int argument2Arg, int argument3Arg, float argument4Arg) {
      long var5 = llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll ^ 55817331698759L;
      Intrinsics.checkNotNullParameter(contextArg, "context");
      super.extractRenderState(contextArg, argument2Arg, argument3Arg, argument4Arg);
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      byte var1, double var2, int var4, double var5, int var7, int var8
   ) {
      long var9 = (long)var1 << 56 | (long)var4 << 32 >>> 8 | (long)var8 << 40 >>> 40;
      long var10001 = var9 ^ 0L;
      int var11 = (int)((var9 ^ 0L) >>> 56);
      int var12 = (int)((var9 ^ 0L) << 8 >>> 32);
      int var13 = (int)(var10001 << 40 >>> 40);
      return super.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((byte)var11, var2, var12, var5, var7, var13);
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(double var1, double var3, int var5, long var6) {
      long var8 = var6 ^ 0L;
      return super.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1, var3, var5, var8);
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, int param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable GuiGraphicsExtractor param1, float param2, float param3, long param4, float param6, @NotNull Function0 param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public abstract void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, int var3, int var4);

   private static final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var0, int var1) {
      long var2 = ((long)var0 << 32 | (long)var1 << 32 >>> 32) ^ llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll;
      long var4 = var2 ^ 51478293413126L;
      MouseUngrab.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4);
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0) {
      lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var0;
   }

   public static int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public static int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      int var0 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII();
      return var0 == 0 ? 100 : 0;
   }

   static {
      long var9 = llllllIIllIlIlIlIIIlIIllllIIIIIIIIlIllIlIIIIIlllIlIllIIlIlIIlIlllIIlIIlIlIIIIIIllllll ^ 129549576621261L;
      byte var11 = 10;
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "Y\u0012\u0097Æ\"pb\u0000\u00868\u001a\u0014\u0003{\u0082D\u0090árc|\u0092Âèê\u001cX÷ÔÜ\b\u0005ò\u0091|h[\\«e¬ÿ\u000e¼öý%Çjc\u0013Ãé¾Ö\u0091>'æü\u0087\u009a\u008cÆ@.!Þ¹s\u001fJ\u009dCª$ëQù\u0095\u001b\u0088\u0084¹jQ\u007fvBÒðU\u0097/Aß\u0093¸H\u0010!Kk\u009d³}`IÃ\u000f äÜ´¤\u0010á\f\u00911a\u000eý\u001eÃ\u0082ü;ÞöLô[u¡æ\u0015Þ==É\u0002'ýÊQ\u0087\u0002z(6Ì\u00ad\u009fªáOEP1)(V\u0092cµya\u0011l\u0092Ñ\u0013Ë÷ÂÍIÛéaîl,\u0007h>è¨Q²\u0005cÖ0Ò\u0000Ci\u001c\u001cß « qj¼\u0085\u001f\u0019íðÒ^rÉð¦ÓïzOlì\u000b/³zâ,\u0016X!\f";
      int var6 = "Y\u0012\u0097Æ\"pb\u0000\u00868\u001a\u0014\u0003{\u0082D\u0090árc|\u0092Âèê\u001cX÷ÔÜ\b\u0005ò\u0091|h[\\«e¬ÿ\u000e¼öý%Çjc\u0013Ãé¾Ö\u0091>'æü\u0087\u009a\u008cÆ@.!Þ¹s\u001fJ\u009dCª$ëQù\u0095\u001b\u0088\u0084¹jQ\u007fvBÒðU\u0097/Aß\u0093¸H\u0010!Kk\u009d³}`IÃ\u000f äÜ´¤\u0010á\f\u00911a\u000eý\u001eÃ\u0082ü;ÞöLô[u¡æ\u0015Þ==É\u0002'ýÊQ\u0087\u0002z(6Ì\u00ad\u009fªáOEP1)(V\u0092cµya\u0011l\u0092Ñ\u0013Ë÷ÂÍIÛéaîl,\u0007h>è¨Q²\u0005cÖ0Ò\u0000Ci\u001c\u001cß « qj¼\u0085\u001f\u0019íðÒ^rÉð¦ÓïzOlì\u000b/³zâ,\u0016X!\f"
         .length();
      char var3 = '\u0010';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "§ñ~'\u009c8\u0099æ@¸«\u0010,Õc¹kK\u001a\u001c\u0090Ôï\u008b ¢.Q\u0083önï&ò\u009c;3½AÜ\u0012ÃÏõÅxó×\u007fu|8(Y%¸[";
            var6 = "§ñ~'\u009c8\u0099æ@¸«\u0010,Õc¹kK\u001a\u001c\u0090Ôï\u008b ¢.Q\u0083önï&ò\u009c;3½AÜ\u0012ÃÏõÅxó×\u007fu|8(Y%¸[".length();
            var3 = '\u0018';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  lIIIIIlllllIlIlIllIllllIIIllIIlIIIlIIIIlIlIlllllIIllIlllIllllIlIIIlllIIIIIIlIIlIllIll = var7;
                  lIlllIIllllIIIIlIIIllIIllIllIlIlIIlIIIlllIIllIIIIIIlIIIIlIlIlllIIlIIlIlIIIllIIlllIIII = new String[6];
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static UnsupportedOperationException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      UnsupportedOperationException var0
   ) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29215;
      if (lIlllIIllllIIIIlIIIllIIllIllIlIlIIlIIIlllIIllIIIIIIlIIIIlIlIlllIIlIIlIlIIIllIIlllIIII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llllIllIIIIIIIllIllIIllllIlIllllllllIIllIlIIllIIlllIllIIIlIIlIllIIIIlIIllllIlIIIlIIII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllIllIIIIIIIllIllIIllllIlIllllllllIIllIlIIllIIlllIllIIIlIIlIllIIIIlIIllllIlIIIlIIII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10
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
         byte[] var9 = lIIIIIlllllIlIlIllIllllIIIllIIlIIIlIIIIlIlIlllllIIllIlllIllllIlIIIlllIIIIIIlIIlIllIll[var5].getBytes("ISO-8859-1");
         lIlllIIllllIIIIlIIIllIIllIllIlIlIIlIIIlllIIllIIIIIIlIIIIlIlIlllIIlIIlIlIIIllIIlllIIII[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlllIIllllIIIIlIIIllIIllIllIlIlIIlIIIlllIIllIIIIIIlIIIIlIlIlllIIlIIlIlIIIllIIlllIIII[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
            "me/octo/client/gui/clickgui/endgameGUI/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
