package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import org.jetbrains.annotations.NotNull;

public final class lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII
   extends me.octo.client.modules.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
   @NotNull
   public static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private static lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private static long lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = 27017445692908L;
   private static String[] llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   private static String[] lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static Map lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new HashMap(13);

   public lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII() {
      long var1 = lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ^ 19859318370651L;
      ModuleCategory var10003 = ModuleCategory.MACROS;
      Setting[] var3 = new Setting[]{
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
      };
      super("Slayer Macro", "Does slayer quests.", var10003, "General", null, null, false, var3, 112, null);
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll(long var1) {
      var1 = lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ^ var1;
      long var3 = var1 ^ 86001459545385L;
      long var5 = var1 ^ 45015538188110L;
      long var7 = var1 ^ 59590995250480L;

      lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII var10000;
      ArrayList var10001;
      label17: {
         try {
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.ROUTE,
               var3
            );
            var10000 = this;
            if (Intrinsics.areEqual(
               lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                  .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(var5),
               lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"z">(2291, 6567246575794826101L ^ var1)
            )) {
               var10001 = new ArrayList();
               break label17;
            }
         } catch (MatchException var9) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var9, -4138769372683487665L, var1
            );
         }

         var10001 = new ArrayList();
      }

      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var7);
   }

   private final void IIlIlIIlllIIIIllIlIlIIllllIIlllIIllIllIlIlIlIllIlIIlIIllllIIlIlIllIllllllIlllIIIIlllI(long var1) {
      var1 = lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ^ var1;
      long var3 = var1 ^ 19040708985318L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.CALL,
         var3
      );
   }

   @Override
   public void IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll(
      short param1, int param2, char param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIIIllIllIIIlIlllIIlIIlIIIllllIlIlIIIIIIIllllllIIlIllIIlIIIlIIIIlllIIIlIlIIIllIIll() {
      return false;
   }

   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlllIllllIIIlllllIIIIIlIlIIIIlIlIllIlIllIIllIIllIIlIlIlIIlIIllIIllIIIlIIllllIIIlIlllI(
      long var1
   ) {
      var1 = lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ^ var1;
      long var3 = var1 ^ 31193124198612L;
      lIlIIlIlIlIlllIlllIIlllIlIllIIIIIlllIIIIllIIlllIlllllllIllIllIIIIlllIIlIIllIlllIIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(var3);
      return me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB;
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII ^ 14121023317252L;
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
      String var6 = "@!$|i@R\u009d/L;Å\u0088\u0086Ó=\u0000NØª¥èÊ\u009cr\u0010é\u0087íBì\u0013tÂÞ\u0006r\u0016í§ \u001f áq\u0099\u0081Fxó\u0095ä*\u008b¶Âî¼dàé^ä50Æ;dìýºý4\u0018(èÃÆ¡_\u009f¿\u0016g\u007f¥U«n\u0082A\u0098ý\t{sj\b ÝYYU¢]á%\u008b\u0006:·r¤\u001eï±u\u000e0\u0090C=.ûGÑý\u008b\u008eò\u008b";
      int var8 = "@!$|i@R\u009d/L;Å\u0088\u0086Ó=\u0000NØª¥èÊ\u009cr\u0010é\u0087íBì\u0013tÂÞ\u0006r\u0016í§ \u001f áq\u0099\u0081Fxó\u0095ä*\u008b¶Âî¼dàé^ä50Æ;dìýºý4\u0018(èÃÆ¡_\u009f¿\u0016g\u007f¥U«n\u0082A\u0098ý\t{sj\b ÝYYU¢]á%\u008b\u0006:·r¤\u001eï±u\u000e0\u0090C=.ûGÑý\u008b\u008eò\u008b"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var9;
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new String[6];
                     lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII();
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

                  var6 = "\u0091\u0088\u001e\u0091øÃrôQ\u00920\u0082;|9Hµô&[¹¡`\u0087\u0010\b^4Dãd3z:KPíz@\u0083\u0089";
                  var8 = "\u0091\u0088\u001e\u0091øÃrôQ\u00920\u0082;|9Hµô&[¹¡`\u0087\u0010\b^4Dãd3z:KPíz@\u0083\u0089".length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(MatchException var0) {
      return var0;
   }

   private static String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(byte[] var0) {
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

   private static String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26500;
      if (lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII", var10
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
         byte[] var9 = llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI[var5].getBytes("ISO-8859-1");
         lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII[var5];
   }

   private static Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      }
   }
}
