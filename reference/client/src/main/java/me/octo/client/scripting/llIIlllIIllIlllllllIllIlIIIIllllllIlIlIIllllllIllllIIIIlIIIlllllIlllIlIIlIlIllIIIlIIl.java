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

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl
   extends me.octo.client.gui.clickgui.modules.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   private static long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 26042705262566L;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static Map lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new HashMap(13);

   public llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull String subcategoryArg,
      int argument5Arg,
      int argument6Arg,
      int argument7Arg,
      int argument8Arg,
      @NotNull Setting[] settingsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg
   ) {
      long var11 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ 22722044673101L;
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
         argument8Arg,
         1,
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
   public me.octo.client.gui.clickgui.modules.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll() {
      return this;
   }

   @Override
   public void IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(long var1) {
      long var3 = var1 ^ 91477706751256L;
      long var5 = var1 ^ 0L;
      long var10001 = var1 ^ 20236240595461L;
      int var7 = (int)((var1 ^ 20236240595461L) >>> 32);
      int var8 = (int)((var1 ^ 20236240595461L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var5);

      try {
         Object[] var10 = new Object[]{
            this.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(),
            this.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI()
         };
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
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(21615, 9190891250873771234L ^ var1)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(26471, 8502087416581887982L ^ var1)
               + var12.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var3,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(12553, 2826530978581725578L ^ var1) + var12.getMessage()
         );
      }
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ 116339412857991L;
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
      String var6 = "\u000eKÓc@\u0002¶Zª9KYÙÛÆOa(ÏjdòâË\u0018äÙ¶\fjôä»«Õsú\u0001^®§¥(Gj)*\tU0À\u0012\u007f\u0096v£!i_UþÎóÎGäb\u001d±xL\u0087EÃ\u0083\u0001GA¯\u009aÃÕ¥øÔî7\"`\u00ad.\u009es_\u009e%Õ\u0080\u0018\u0017\u008bC\u007ft»*3\u000b\u000ed;ï\u0086ú\u0000\t§\u0084\u0093±N7( ç¥ª#a´ì\u001c81d¾ýf\u009c©Î¹,n(bÈÝm3\u009eZF\u0019&\u0081\u0010Ä(s[\u0096\u0089ëq[ÒÕÎ\u0099Ó\u0005Ø\u0018\u000ey\u0014ô3\u0090lÐ\u0016_¤i\u000bB/,ãÿ\u0081\u0006¾PMÊ WdÔ\tLG¤\f£?o:S&¾bÔd¶lûUq;\u0015O¥Q±\u001fä+(6p\u0084\u0093Ê¬6\tß<\u007f%Uò\u0096IMq\u009b\u0080¬;õP\u008cK]ê¼\u008bUì\u0019z\u008f°÷(?9";
      int var8 = "\u000eKÓc@\u0002¶Zª9KYÙÛÆOa(ÏjdòâË\u0018äÙ¶\fjôä»«Õsú\u0001^®§¥(Gj)*\tU0À\u0012\u007f\u0096v£!i_UþÎóÎGäb\u001d±xL\u0087EÃ\u0083\u0001GA¯\u009aÃÕ¥øÔî7\"`\u00ad.\u009es_\u009e%Õ\u0080\u0018\u0017\u008bC\u007ft»*3\u000b\u000ed;ï\u0086ú\u0000\t§\u0084\u0093±N7( ç¥ª#a´ì\u001c81d¾ýf\u009c©Î¹,n(bÈÝm3\u009eZF\u0019&\u0081\u0010Ä(s[\u0096\u0089ëq[ÒÕÎ\u0099Ó\u0005Ø\u0018\u000ey\u0014ô3\u0090lÐ\u0016_¤i\u000bB/,ãÿ\u0081\u0006¾PMÊ WdÔ\tLG¤\f£?o:S&¾bÔd¶lûUq;\u0015O¥Q±\u001fä+(6p\u0084\u0093Ê¬6\tß<\u007f%Uò\u0096IMq\u009b\u0080¬;õP\u008cK]ê¼\u008bUì\u0019z\u008f°÷(?9"
         .length();
      char var5 = 24;
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
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var9;
                     llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new String[11];
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

                  var6 = "\u00814Vý0;\u0085:5ï\u001f\u008e\u0013 ÃÅ±0\u000b+<°Í6¦îíSk·ªMí\u008b=Ó0\u0006lAÍ\u007f÷¶§qâqóÏ\u001dDá Z\u008eÙPÃ¾Ú£Q`\u0018\"G[=$]éú¸\u0090\t=¶¤÷Dö\u008e\u0003\"=¡+\u001b";
                  var8 = "\u00814Vý0;\u0085:5ï\u001f\u008e\u0013 ÃÅ±0\u000b+<°Í6¦îíSk·ªMí\u008b=Ó0\u0006lAÍ\u007f÷¶§qâqóÏ\u001dDá Z\u008eÙPÃ¾Ú£Q`\u0018\"G[=$]éú¸\u0090\t=¶¤÷Dö\u008e\u0003\"=¡+\u001b"
                     .length();
                  var5 = '@';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21422;
      if (llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5].getBytes("ISO-8859-1");
         llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl[var5];
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
            "me/octo/client/scripting/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
