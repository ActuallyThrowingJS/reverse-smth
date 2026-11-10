package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll
   extends me.octo.client.gui.clickgui.modules.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 38071440889790L;
   private static String[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static Map lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new HashMap(13);

   public IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull String subcategoryArg,
      int argument5Arg,
      int argument6Arg,
      int argument7Arg,
      @NotNull Setting[] settingsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg
   ) {
      long var10 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 43769245528709L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(subcategoryArg, "subcategory");
      Intrinsics.checkNotNullParameter(settingsArg, "settings");
      Intrinsics.checkNotNullParameter(callbacksArg, "callbacks");
      super(
         nameArg,
         descriptionArg,
         ModuleCategory.SCRIPTS,
         subcategoryArg,
         argument5Arg,
         argument6Arg,
         argument7Arg,
         1,
         Arrays.copyOf(settingsArg, settingsArg.length)
      );
      this.scriptName = scriptNameArg;
      this.callbacks = callbacksArg;
   }

   @NotNull
   @Override
   public String getScriptName() {
      return this.scriptName;
   }

   @NotNull
   @Override
   public lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII getCallbacks() {
      return this.callbacks;
   }

   @NotNull
   public me.octo.client.gui.clickgui.modules.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII() {
      return this;
   }

   @Override
   public void IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 77542669153976L;
      long var10001 = var1 ^ 8602868146597L;
      int var7 = (int)((var1 ^ 8602868146597L) >>> 32);
      int var8 = (int)((var1 ^ 8602868146597L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl(var3);

      try {
         Object[] var10 = new Object[]{this.IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI()};
         this.getCallbacks()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.getCallbacks().IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
               var7,
               (char)var8,
               (short)var9,
               var10
            );
      } catch (Exception var12) {
         PolinexLogger.error(
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"y">(29329, 3086138842412398356L ^ var1)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"y">(28924, 7665019260565108087L ^ var1)
               + var12.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var5,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"y">(10830, 960215004160487364L ^ var1) + var12.getMessage()
         );
      }
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 86083724705873L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "¬Þÿ*\u0007í\u0005^å¬:\u009doò\u0098\u0010K¶vt\u001b`¿#%X~c÷V\u009eg ² f\u0083\rH]\u000fvÚ_m»U\u0013ñw\u009fôµ_\u0019¥¿XÂü²\u000fú\u001b! 4â{\u009b¢\u001a[æS\u0002\u009cx\"Îå!ðmí\u009e\u0082°\rorX\u001cOè\u0015.| \u009a,\u0097\u009bMñîí\u007fø¾<\u0088÷C\u001d ù\u0093÷@¶reK\u000e>a\u0019\u009bêð \u008bHs\u008d\u008eg,ó¬Óò1)Eïº²\u008b©ÝÄ¦gm0ê~(V1÷Ê ÝqØ@©¬5\u001b\u0095\u000b\u0095d\b<Ù\u0098~dJu\u0096Yæ\u0017 ^¯\u000b\ne2\u0089 Nt¼y\u0000\rÞ\u0092%Gr°L×£\u009b\rÕ083\r1\u0092\\Þ\u009bæ5gýü\u0010Ö·<ôÌ\u0016F\u008eêy!â\u0003\u0085\u0086Ã8ª¿á?ÏÒ7ªÅAH\u0001\u008dü\u008e\u008fa\u008f·áNëÞV\\\u0004\u0000ÈÓé«\u0096õ:s\u007f÷\u009bä\u0097\u008aMÎ\u0019.ÂÉ\u0000¢\u0014C¾ÎQI\u0018";
      int var8 = "¬Þÿ*\u0007í\u0005^å¬:\u009doò\u0098\u0010K¶vt\u001b`¿#%X~c÷V\u009eg ² f\u0083\rH]\u000fvÚ_m»U\u0013ñw\u009fôµ_\u0019¥¿XÂü²\u000fú\u001b! 4â{\u009b¢\u001a[æS\u0002\u009cx\"Îå!ðmí\u009e\u0082°\rorX\u001cOè\u0015.| \u009a,\u0097\u009bMñîí\u007fø¾<\u0088÷C\u001d ù\u0093÷@¶reK\u000e>a\u0019\u009bêð \u008bHs\u008d\u008eg,ó¬Óò1)Eïº²\u008b©ÝÄ¦gm0ê~(V1÷Ê ÝqØ@©¬5\u001b\u0095\u000b\u0095d\b<Ù\u0098~dJu\u0096Yæ\u0017 ^¯\u000b\ne2\u0089 Nt¼y\u0000\rÞ\u0092%Gr°L×£\u009b\rÕ083\r1\u0092\\Þ\u009bæ5gýü\u0010Ö·<ôÌ\u0016F\u008eêy!â\u0003\u0085\u0086Ã8ª¿á?ÏÒ7ªÅAH\u0001\u008dü\u008e\u008fa\u008f·áNëÞV\\\u0004\u0000ÈÓé«\u0096õ:s\u007f÷\u009bä\u0097\u008aMÎ\u0019.ÂÉ\u0000¢\u0014C¾ÎQI\u0018"
         .length();
      char var5 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var9;
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new String[11];
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

                  var6 = "ÌÀü?\u0019ç\u000fYeo6½<¬\u0007Íf{\u001a\u0001\u0005\u008ag=vÏ'\u0082B\u0081N\u000fV31\u008f-Ø%\u0006@!ÁaÓÇJ`~èEXW_®\u0016¹þe\u0099\tD!\u000eþÄ\u0093ô\u0018\u0098\u0004\u0088«¨£{\u001eN\u0005Ý\u001fñ!´\u0015ÌY\u0012\u007fò\rV\u0005\u0091\u0004Ì\u0092xïª6»\u0002²\u0014";
                  var8 = "ÌÀü?\u0019ç\u000fYeo6½<¬\u0007Íf{\u001a\u0001\u0005\u008ag=vÏ'\u0082B\u0081N\u000fV31\u008f-Ø%\u0006@!ÁaÓÇJ`~èEXW_®\u0016¹þe\u0099\tD!\u000eþÄ\u0093ô\u0018\u0098\u0004\u0088«¨£{\u001eN\u0005Ý\u001fñ!´\u0015ÌY\u0012\u007fò\rV\u0005\u0091\u0004Ì\u0092xïª6»\u0002²\u0014"
                     .length();
                  var5 = '(';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Exception var0) {
      return var0;
   }

   private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11526;
      if (IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var5].getBytes("ISO-8859-1");
         IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/scripting/IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
