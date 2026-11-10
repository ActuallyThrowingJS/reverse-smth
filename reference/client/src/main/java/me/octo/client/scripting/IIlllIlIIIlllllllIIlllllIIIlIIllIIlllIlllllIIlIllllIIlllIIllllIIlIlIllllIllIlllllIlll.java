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

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends me.octo.client.gui.clickgui.modules.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
   implements IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacks;
   private static long IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = 52780766040422L;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static String[] llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static Map lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new HashMap(13);

   public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
      @NotNull String scriptNameArg,
      @NotNull String nameArg,
      @NotNull String descriptionArg,
      @NotNull String subcategoryArg,
      double argument5Arg,
      double argument6Arg,
      double argument7Arg,
      double argument8Arg,
      @NotNull Setting[] settingsArg,
      @NotNull lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII callbacksArg
   ) {
      long var15 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ 102692724214761L;
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
         (float)argument8Arg,
         0.01F,
         0.01F,
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
   public me.octo.client.gui.clickgui.modules.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII() {
      return this;
   }

   @Override
   public void IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(long var1) {
      long var3 = var1 ^ 31600215617397L;
      long var5 = var1 ^ 0L;
      long var10001 = var1 ^ 103251860650088L;
      int var7 = (int)((var1 ^ 103251860650088L) >>> 32);
      int var8 = (int)((var1 ^ 103251860650088L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      super.IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(var5);

      try {
         Object[] var10 = new Object[]{
            this.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
            this.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI()
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
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"h">(7532, 4804605057405153799L ^ var1)
               + this.getScriptName()
               + IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"h">(14642, 7864913593859298900L ^ var1)
               + var12.getMessage()
         );
         this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            var3,
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"h">(32744, 2524099565764087940L ^ var1) + var12.getMessage()
         );
      }
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll ^ 68909228674198L;
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
      String var6 = "8Ù2WÝ\bÅ¨Í\u0093\u0080ß\u0016õ\u009f0\u000b\u0083\u009blÝ\bcW\u0018}\n0Þ\u0089ßâ\u0014ÙRÎ\u001f=JÒ\u007fàÒø£æ8\u000f\u008f(|\u0099F\u0089\u008b\u0004ÛhwÇêýÂ%Q\u00169ÏYÔu\u0089ý4ÝËð§ú\u0083d\u0006,ÈÜ\u0085ÆÂÖe \u0092sUMÿ.S\u0019W\u0007\u0011¤VÂ\u008a\u0096\"ùó¬û\u0080Ý?\u008f\u0002~úcm«W Cl_ÖqØ\u0013dM\u0011!D\u0082\u0003¡\u009c8µ.\u009b q×öò±\u0011#\u0080\u0001gN >%ÈCÌÛÞ@Õ÷\u0006^\u0016Ë÷:íë¯\u0003ö\u008du\u0000¬\u0086&ñák\u0014= c¹N\u0015Ù\u008e(¶ô\b\u001f¼\\\u0002C\u0018Ï\u009cÛ(¤fî\u009eü\u0019\nE!,Qþ@5N\u0001PöB\u0019q\u0093)xTs\u0097\bP«\u0080\u0091D*\u0087¸ \u009cI¯7\u0006\u0084\u0099\u0010¡\u0083ZùCõð½²Ý¹\u0018{Xó0\u008fqÐü\u0017lYØü\n]rm»ñÉ0Í\u0004\to´\u009c¦\u000bÃwE+1-=\t\u0090Î:}[Df\u001b\u0088Ñ\u009aÓ\u0019\u0084ùñº\r£\u009f\u0013\u0090h\u0085¶È\u000bá®\u0083ëç";
      int var8 = "8Ù2WÝ\bÅ¨Í\u0093\u0080ß\u0016õ\u009f0\u000b\u0083\u009blÝ\bcW\u0018}\n0Þ\u0089ßâ\u0014ÙRÎ\u001f=JÒ\u007fàÒø£æ8\u000f\u008f(|\u0099F\u0089\u008b\u0004ÛhwÇêýÂ%Q\u00169ÏYÔu\u0089ý4ÝËð§ú\u0083d\u0006,ÈÜ\u0085ÆÂÖe \u0092sUMÿ.S\u0019W\u0007\u0011¤VÂ\u008a\u0096\"ùó¬û\u0080Ý?\u008f\u0002~úcm«W Cl_ÖqØ\u0013dM\u0011!D\u0082\u0003¡\u009c8µ.\u009b q×öò±\u0011#\u0080\u0001gN >%ÈCÌÛÞ@Õ÷\u0006^\u0016Ë÷:íë¯\u0003ö\u008du\u0000¬\u0086&ñák\u0014= c¹N\u0015Ù\u008e(¶ô\b\u001f¼\\\u0002C\u0018Ï\u009cÛ(¤fî\u009eü\u0019\nE!,Qþ@5N\u0001PöB\u0019q\u0093)xTs\u0097\bP«\u0080\u0091D*\u0087¸ \u009cI¯7\u0006\u0084\u0099\u0010¡\u0083ZùCõð½²Ý¹\u0018{Xó0\u008fqÐü\u0017lYØü\n]rm»ñÉ0Í\u0004\to´\u009c¦\u000bÃwE+1-=\t\u0090Î:}[Df\u001b\u0088Ñ\u009aÓ\u0019\u0084ùñº\r£\u009f\u0013\u0090h\u0085¶È\u000bá®\u0083ëç"
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

                  var6 = "M\u0091qQNî\u0084Ó\u0090±jJ\u0012\u0081\u000f\u00985\u0095\nôuU=ºSz-©ïí2N\u0010§\u008e¯|\u008büC\u0096Õ\u0012àõ>Jô«";
                  var8 = "M\u0091qQNî\u0084Ó\u0090±jJ\u0012\u0081\u000f\u00985\u0095\nôuU=ºSz-©ïí2N\u0010§\u008e¯|\u008büC\u0096Õ\u0012àõ>Jô«".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7718;
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
            throw new RuntimeException("me/octo/client/scripting/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10);
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
            "me/octo/client/scripting/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
