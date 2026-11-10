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

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
   extends me.octo.client.gui.clickgui.modules.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 121694149749527L;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static Map llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new HashMap(13);

   public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull String subcategoryArg,
      double argument5Arg,
      double argument6Arg,
      double argument7Arg,
      @NotNull Setting[] settingsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg
   ) {
      long var13 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 67562770494934L;
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
         (float)argument5Arg,
         (float)argument6Arg,
         (float)argument7Arg,
         0.01F,
         2,
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
   public me.octo.client.gui.clickgui.modules.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
      return this;
   }

   @Override
   public void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long var1) {
      long var3 = var1 ^ 16933583160185L;
      long var10001 = var1 ^ 85984807752804L;
      int var5 = (int)((var1 ^ 85984807752804L) >>> 32);
      int var6 = (int)((var1 ^ 85984807752804L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var1 ^ 0L;
      super.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var8);

      try {
         Object[] var10 = new Object[]{this.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII()};
         this.getCallbacks()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               this.getCallbacks().IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
               var5,
               (char)var6,
               (short)var7,
               var10
            );
      } catch (Exception var12) {
         PolinexLogger.error(
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(25169, 8799527993429070901L ^ var1)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(27278, 8001213352068127972L ^ var1)
               + var12.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var3,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"m">(1118, 1539646595379622454L ^ var1) + var12.getMessage()
         );
      }
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 76155905302305L;
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
      String var6 = "èxz\u001eäLñÌ\u0096¸0\u0096\u0003[`ÀÊNYppÔ®Á¾Èå\u0000&®¬\u0096 \u0017ë+|ó\u0099xó|al_Ö\u0004°#\u009f?f§«u0\u008co\u008f×Î\u0085w\u0086Í8åíî¤þÔ\r\"ün\u007f\u0086\u0001\u0080&\u008cd*\r¦KïZB¨¡\u0098¡/Zë¦l\u0096æî\u008d\u009b°\u000b\u001bÛÚû¿\u0088\u0096¨\u0016Ti®9\u0006w§\u0018/+ÑD#Òô\u0080\u008cNºÞ10WÕ\u008f\u0096\u0090!æØ#È8\u0000\u0084õNÄ7_\u0094õlîH\u000b\u000e\u0012 \u009dOã\u0005Ø3&µ3ú\u00ad\u0099ó3!þK§¥)ß5\u0080\u001dVú°¹®ßµäl\u008e÷´gaÔó\u0018\u0012u¼fz&Í1\nz\u009d\u0010z\fEmvÑJÖò\u0013\u008eF(¸ñ>\u009du\u0092\u0089\u0088\u001bò\u0005\u0003+å-ß56ÐíÕHv2âg\u0090û\u0005ð\u0081|@º<\u0092r7\u0013â \u009b\u0000¾\u009acD\\¼j\u00ad1Ü\u000f2å\u0012Í>WóÑ\u009fMf9SäS\u0097|\u0000v\u0010&2ë/\u009fäE\f\r×\u001b \u001ee\u00ad³";
      int var8 = "èxz\u001eäLñÌ\u0096¸0\u0096\u0003[`ÀÊNYppÔ®Á¾Èå\u0000&®¬\u0096 \u0017ë+|ó\u0099xó|al_Ö\u0004°#\u009f?f§«u0\u008co\u008f×Î\u0085w\u0086Í8åíî¤þÔ\r\"ün\u007f\u0086\u0001\u0080&\u008cd*\r¦KïZB¨¡\u0098¡/Zë¦l\u0096æî\u008d\u009b°\u000b\u001bÛÚû¿\u0088\u0096¨\u0016Ti®9\u0006w§\u0018/+ÑD#Òô\u0080\u008cNºÞ10WÕ\u008f\u0096\u0090!æØ#È8\u0000\u0084õNÄ7_\u0094õlîH\u000b\u000e\u0012 \u009dOã\u0005Ø3&µ3ú\u00ad\u0099ó3!þK§¥)ß5\u0080\u001dVú°¹®ßµäl\u008e÷´gaÔó\u0018\u0012u¼fz&Í1\nz\u009d\u0010z\fEmvÑJÖò\u0013\u008eF(¸ñ>\u009du\u0092\u0089\u0088\u001bò\u0005\u0003+å-ß56ÐíÕHv2âg\u0090û\u0005ð\u0081|@º<\u0092r7\u0013â \u009b\u0000¾\u009acD\\¼j\u00ad1Ü\u000f2å\u0012Í>WóÑ\u009fMf9SäS\u0097|\u0000v\u0010&2ë/\u009fäE\f\r×\u001b \u001ee\u00ad³"
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
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var9;
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new String[11];
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

                  var6 = "Y!ÛÍôj¦ 1ï+'Z\u0017Þ§3Èæ\u0082J¨%<\u008eß¡Ëî¯¨Ý\u0018!Õrg×\u0004áe×Ë°b¹\u0018÷«jº÷xDð\u009c%";
                  var8 = "Y!ÛÍôj¦ 1ï+'Z\u0017Þ§3Èæ\u0082J¨%<\u008eß¡Ëî¯¨Ý\u0018!Õrg×\u0004áe×Ë°b¹\u0018÷«jº÷xDð\u009c%".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27434;
      if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5].getBytes("ISO-8859-1");
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5];
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
            "me/octo/client/scripting/llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
