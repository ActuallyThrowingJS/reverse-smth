package me.octo.client.scripting;

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
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll script;
   @Nullable
   private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 6043488965807L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   public IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI(
      @NotNull String scriptNameArg, @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll scriptArg
   ) {
      long var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 58417244114043L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(scriptArg, "script");
      super();
      this.scriptName = scriptNameArg;
      this.script = scriptArg;
   }

   @Nullable
   public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll create(@NotNull Value param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void export(@Nullable IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var1) {
      long var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 98769130271855L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var4 = lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();

      label50: {
         IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var10000;
         label44: {
            label43: {
               IlIlIlllIIIIIllIllIllIlIlIlIIlIIIIlllIIIllllIIllIllIIIlllIIlIlIllllIlIllIIlIIIllIlIll var8;
               try {
                  var8 = var1;
                  if (var4 == null) {
                     if (var1 == null) {
                        return;
                     }
                     break label43;
                  }
               } catch (IllegalArgumentException var11) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
               }

               var10000 = var8;
               break label44;
            }

            var10000 = var1;
         }

         label56: {
            try {
               boolean var9 = Intrinsics.areEqual(var10000.getModule().getScriptName(), this.scriptName);
               if (var4 != null) {
                  break label50;
               }

               if (!var9) {
                  break label56;
               }
            } catch (IllegalArgumentException var10) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10);
            }

            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1.getModule();
            this.script.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();
            return;
         }

         boolean var12 = false;
      }

      String var5 = "Cannot export a module owned by another script";
      throw new IllegalArgumentException(var5.toString());
   }

   static {
      long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 74315020660962L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "\u0018\u008f\u008bÀ1¾\u0087ô\u0002\u0002Ë\u000f\u0001\u0086\u008a¤$0M\u000b\u008f¦gù\"{\u0013h^\u009b,\u001a\u0018è\u0092Ó |\u008cå\u0087\r·*\u001bè\u009b£¨\u008a=\u0086o¡X5÷ 8\u0083_\u0099ÆË¤_F\u0000\u0014\u0094\u0000\u0093\u0001\u009dÀB.\u0083\u007fí\u008eBpµùTÅº*÷ SC\u0013õâ<ó\u008b4q/¬\u0097\u009cOÅcüL)gMIHÜ\u0007;Å½ÿó\r0«\u008fSÍ3\u0012ì´ï7KC\u0087\u008c\u001eµ\u0091,Ïë¾ì\r)\u0000Í\u0093&¦nÇþå\u0088²¢Ô\u009e\u001e\u0096V\u0080úí\u008dZËõ\u0010§ëµØªÑê,Ë´°`º<Ø¬ \u009a£:Üü\u0093È\r\u0093Ý\u0085$ÿ\u009e\"3Y\u0096J`!D0Ì1±SÔ,2°T ®\u001eX\u0003±\u0095ëAÇ\u009dy\u0089Ë\u0091;§\u0016\u0085¾\u0097F3ë§pj«P³Ê0Q\u0010dlôê\u0087+\u008b{ö\u0086k\u001aÈLhÀ\u0018\"k\u001e\u000f\u0015Z´«\u009bì»-ãDgµÝ\u009cA\u007f\u0003sïÕ ö+Ùæ¾\b\u008bc^\u0013E\u007f¯¾¤Êg÷\u0094%âGà*ÀH)ù¨F?¨\u0010¯k÷\u0096\u0002Ã\u008cB\u0016¥\u0091Órº\u0084q\u0010æþÛ-\u009f¡\u0003y£À3äÀ`\u001f+\u0010#y\u0014âo»>5±Nxÿ¤\u0094\r3 \u001dPó£a°sh¢Ì}\u0015æPX×\u0098Ì\u000búü\u0096#y\u00005õ\u0083\bðãk\u0018\u0082j^UlÜ·~â¯3çOR\u0004â}\u0094³Ô\u008c%«³ 5uL¥[\u008fT±\u0003\u008d\u001f\u0083\"¿Á\u0096;0\u00adÓ\u0090Ø §É`\u0082Ë$éç\u0003\u0010=u®\u0001hOnÅ_b0%\u0013õåÑ`Ñºá/\"xÅXl\u009b/Y<~ÆÇKq\u0088\u0095\u00828\u0080\u0080o:\u008f\b&\u00847w\fJ7É%¹85\u009d§\u000f\u001c\u008bý\f£Kç¡klbâ\u0082\fè®\u0095St\u009b¸Øo_æ*\"<O/1^±\n\u008dÖ\u0099\u009aÿq¢\u0090T5Â\u0099êØå}Ð/ß\u0010BLóÓÜTÃPÍ¯F*6<5¬0\u0003ãô\u0089Éø\u008fj9\u008eíÁ\u008d\u0081¶YÏÃ\u0014`[\n\\\u008c¾\nÙÕ`\u0099\u0012©oM\u0019ÆHxyÒ\u001c¤\u009bà¡åG*";
      int var8 = "\u0018\u008f\u008bÀ1¾\u0087ô\u0002\u0002Ë\u000f\u0001\u0086\u008a¤$0M\u000b\u008f¦gù\"{\u0013h^\u009b,\u001a\u0018è\u0092Ó |\u008cå\u0087\r·*\u001bè\u009b£¨\u008a=\u0086o¡X5÷ 8\u0083_\u0099ÆË¤_F\u0000\u0014\u0094\u0000\u0093\u0001\u009dÀB.\u0083\u007fí\u008eBpµùTÅº*÷ SC\u0013õâ<ó\u008b4q/¬\u0097\u009cOÅcüL)gMIHÜ\u0007;Å½ÿó\r0«\u008fSÍ3\u0012ì´ï7KC\u0087\u008c\u001eµ\u0091,Ïë¾ì\r)\u0000Í\u0093&¦nÇþå\u0088²¢Ô\u009e\u001e\u0096V\u0080úí\u008dZËõ\u0010§ëµØªÑê,Ë´°`º<Ø¬ \u009a£:Üü\u0093È\r\u0093Ý\u0085$ÿ\u009e\"3Y\u0096J`!D0Ì1±SÔ,2°T ®\u001eX\u0003±\u0095ëAÇ\u009dy\u0089Ë\u0091;§\u0016\u0085¾\u0097F3ë§pj«P³Ê0Q\u0010dlôê\u0087+\u008b{ö\u0086k\u001aÈLhÀ\u0018\"k\u001e\u000f\u0015Z´«\u009bì»-ãDgµÝ\u009cA\u007f\u0003sïÕ ö+Ùæ¾\b\u008bc^\u0013E\u007f¯¾¤Êg÷\u0094%âGà*ÀH)ù¨F?¨\u0010¯k÷\u0096\u0002Ã\u008cB\u0016¥\u0091Órº\u0084q\u0010æþÛ-\u009f¡\u0003y£À3äÀ`\u001f+\u0010#y\u0014âo»>5±Nxÿ¤\u0094\r3 \u001dPó£a°sh¢Ì}\u0015æPX×\u0098Ì\u000búü\u0096#y\u00005õ\u0083\bðãk\u0018\u0082j^UlÜ·~â¯3çOR\u0004â}\u0094³Ô\u008c%«³ 5uL¥[\u008fT±\u0003\u008d\u001f\u0083\"¿Á\u0096;0\u00adÓ\u0090Ø §É`\u0082Ë$éç\u0003\u0010=u®\u0001hOnÅ_b0%\u0013õåÑ`Ñºá/\"xÅXl\u009b/Y<~ÆÇKq\u0088\u0095\u00828\u0080\u0080o:\u008f\b&\u00847w\fJ7É%¹85\u009d§\u000f\u001c\u008bý\f£Kç¡klbâ\u0082\fè®\u0095St\u009b¸Øo_æ*\"<O/1^±\n\u008dÖ\u0099\u009aÿq¢\u0090T5Â\u0099êØå}Ð/ß\u0010BLóÓÜTÃPÍ¯F*6<5¬0\u0003ãô\u0089Éø\u008fj9\u008eíÁ\u008d\u0081¶YÏÃ\u0014`[\n\\\u008c¾\nÙÕ`\u0099\u0012©oM\u0019ÆHxyÒ\u001c¤\u009bà¡åG*"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "5~\u0019¯Ë§Êú¡\u0003\u0019A¾¬\u001c'þô`óÌüö\u0086æê\u00125\u000ed½i\u0090z¼%Cì.K\u001d37¼$\u0013qr§,Ä³\u009c9\u0096c\tà\u000fu zý\u009c,;ç8:\u009c¹?\u008c\u009a\u0019ä\u00075ÄÔ \u0001\u0000U10\u0001ýª\u000eí7\u0096ö¿qnxh\u0002\u000ei«\u0011+\u0000\u0088ei;n¥\u0017";
            var8 = "5~\u0019¯Ë§Êú¡\u0003\u0019A¾¬\u001c'þô`óÌüö\u0086æê\u00125\u000ed½i\u0090z¼%Cì.K\u001d37¼$\u0013qr§,Ä³\u009c9\u0096c\tà\u000fu zý\u009c,;ç8:\u009c¹?\u008c\u009a\u0019ä\u00075ÄÔ \u0001\u0000U10\u0001ýª\u000eí7\u0096ö¿qnxh\u0002\u000ei«\u0011+\u0000\u0088ei;n¥\u0017"
               .length();
            var5 = 'P';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[23];
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5740;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
            "me/octo/client/scripting/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
