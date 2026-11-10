package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI {
   @NotNull
   private final String scriptName;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll script;
   @Nullable
   private IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final CopyOnWriteArrayList<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 132841760857148L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI(
      @NotNull String scriptNameArg, @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll scriptArg
   ) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 120097649675991L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(scriptArg, "script");
      super();
      this.scriptName = scriptNameArg;
      this.script = scriptArg;
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new CopyOnWriteArrayList<>();
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var1, long var2
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"m">(15421, 6516618925568004306L ^ var2)
      );
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.add(var1);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var6 = var4 ^ 27798421198279L;
      Iterable var9 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4013180549978006594L, var4
      );
      boolean var10 = false;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var8 = var10000;

      for (Object var12 : var9) {
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var13 = (llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII)var12;
         if (var8 == null) {
            boolean var14 = false;
            lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var15 = this;

            try {
               lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI var19 = var15;
               boolean var17 = false;
               var13.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var6);
               var19 = (lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI)Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable var18) {
               Object var16 = Result.constructor-impl(ResultKt.createFailure(var18));
            }

            if (var8 == null) {
               continue;
            }
         }
         break;
      }
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var3 = (var1 ^ 115340982693093L) >>> 16;
      int var5 = (int)((var1 ^ 115340982693093L) << 48 >>> 48);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, (char)var5);
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll create(@NotNull Value configArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void export(@Nullable IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var1) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 69251732058987L;
      long var4 = var2 ^ 94840299129386L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var6 = lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();

      label43: {
         IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll var10000;
         label37: {
            try {
               var10000 = var1;
               if (var6 != null) {
                  break label37;
               }

               if (var1 == null) {
                  return;
               }
            } catch (IllegalArgumentException var11) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
            }

            var10000 = var1;
         }

         label48: {
            try {
               boolean var12 = Intrinsics.areEqual(var10000.getModule().getOwnerScriptName(), this.scriptName);
               if (var6 != null) {
                  break label43;
               }

               if (!var12) {
                  break label48;
               }
            } catch (IllegalArgumentException var10) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10);
            }

            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1.getModule();
            this.script.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var1.getModule());
            return;
         }

         boolean var13 = false;
      }

      String var7 = "Cannot export a macro owned by another script";
      throw new IllegalArgumentException(var7.toString());
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   @NotNull
   public final lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII createCombatBot(@NotNull Value cfgArg) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 19255657642366L;
      long var4 = var2 ^ 116971427532176L;
      long var6 = var2 ^ 6877335028325L;
      Intrinsics.checkNotNullParameter(cfgArg, "cfg");
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var8 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(cfgArg, var6);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var4);
      return new lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII(var8);
   }

   static {
      long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 41242475535974L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[17];
      int var7 = 0;
      String var6 = "g\u0095ì¶\u0017¼#\u009d9\u0019(yäö²I(\n®\u0088×\u009bÏÓÍÆ\u0013\u0006\u0093\u001av'måqsd¼\u001fÎ]^ÀÂ²W\u0004è\"\u001b\u0004rKô[7\bP\u0001£Ã:Ñ\u0004zk+D³Z\u0000o\u0017]\u0010\u0019=\u001f!\u0000\u0016JãÁ.:¸TF#ÿb\u009f\b\u0084þO\u009aÐ#Äü\u0098Ñ\u0006\u0097DhÞÊ2-Ö\u009f\u0095k ](º\u0018íR_yÞ¬Â\u001c×±\u0087¥mu\u0083¸³\u0010Í\u009a.¼C»\tçW9þ\u0087siàd8pg~Õ\u008fBlB÷Iuyèô¬\u001bä?(gÒ¡ÙCr:MÍ.«\u00864ÿUÝ¶DQXg×`0¥¾ÜF\u008dÓô\u0095{Ù!â\u0089\u0010\u001a\u008e¶Àq´\u009c*\u001co6SéÛâ\u0094\u0018$?8ë½\u0011ä\u0001A#eav\u001ed§mÏd§mÈ[¶\u0018&ê\u00982·\u0086\u00889\u009a\t\u0085ë\u0097\u0081y\u001cÖ3Ç\u001f\u0015§³,\u0010·Ê³WÑ!á£vq\u0093uñdQ]\u0010¹þÓ\u008fÕ\u0004TØÌÁú\u008d\u0083\u0094\u001bc ¤\u0019³FZüu}?Q\u0092ºÜÊ3_\u0017\t\u008diM¾ì\u009b\u009d«\u0006\u0089Èt.¿\u0010Aå\u0093SW¬y÷üðÑ'>\u0003Ð\u0090h±¯àP¦\u0003Zé\u0099Êq3\bw&F\u001f\u0014\u0001CÑ\u000fµe¹Y\u00ad§lñ\u0006´+'/j\u0016&©\u001aà\u0089¬zwIT#\u001bh\u008bZÿîM×\u0084u#\u00adP\u0001_¾Ï\b>[yö\u0016ï¿è¢`Ð\u0089ô\u0097%\\kC_\u0091ç¦\u0087\u009bì\u001d$¥\u0002ï\u008e\u001e\u0013¤ªO\u001eM íM÷~¨\u0013?]J\u001c\u009eL\rp\u0087\u001cÏB¶\njU\u001d)g_\u0004»0\tK2\u0010\u009a hám/Ô\n$\u0096I\u0019-| ®";
      int var8 = "g\u0095ì¶\u0017¼#\u009d9\u0019(yäö²I(\n®\u0088×\u009bÏÓÍÆ\u0013\u0006\u0093\u001av'måqsd¼\u001fÎ]^ÀÂ²W\u0004è\"\u001b\u0004rKô[7\bP\u0001£Ã:Ñ\u0004zk+D³Z\u0000o\u0017]\u0010\u0019=\u001f!\u0000\u0016JãÁ.:¸TF#ÿb\u009f\b\u0084þO\u009aÐ#Äü\u0098Ñ\u0006\u0097DhÞÊ2-Ö\u009f\u0095k ](º\u0018íR_yÞ¬Â\u001c×±\u0087¥mu\u0083¸³\u0010Í\u009a.¼C»\tçW9þ\u0087siàd8pg~Õ\u008fBlB÷Iuyèô¬\u001bä?(gÒ¡ÙCr:MÍ.«\u00864ÿUÝ¶DQXg×`0¥¾ÜF\u008dÓô\u0095{Ù!â\u0089\u0010\u001a\u008e¶Àq´\u009c*\u001co6SéÛâ\u0094\u0018$?8ë½\u0011ä\u0001A#eav\u001ed§mÏd§mÈ[¶\u0018&ê\u00982·\u0086\u00889\u009a\t\u0085ë\u0097\u0081y\u001cÖ3Ç\u001f\u0015§³,\u0010·Ê³WÑ!á£vq\u0093uñdQ]\u0010¹þÓ\u008fÕ\u0004TØÌÁú\u008d\u0083\u0094\u001bc ¤\u0019³FZüu}?Q\u0092ºÜÊ3_\u0017\t\u008diM¾ì\u009b\u009d«\u0006\u0089Èt.¿\u0010Aå\u0093SW¬y÷üðÑ'>\u0003Ð\u0090h±¯àP¦\u0003Zé\u0099Êq3\bw&F\u001f\u0014\u0001CÑ\u000fµe¹Y\u00ad§lñ\u0006´+'/j\u0016&©\u001aà\u0089¬zwIT#\u001bh\u008bZÿîM×\u0084u#\u00adP\u0001_¾Ï\b>[yö\u0016ï¿è¢`Ð\u0089ô\u0097%\\kC_\u0091ç¦\u0087\u009bì\u001d$¥\u0002ï\u008e\u001e\u0013¤ªO\u001eM íM÷~¨\u0013?]J\u001c\u009eL\rp\u0087\u001cÏB¶\njU\u001d)g_\u0004»0\tK2\u0010\u009a hám/Ô\n$\u0096I\u0019-| ®"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[17];
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

                  var6 = "Ôt°ì\u000bèAzP\u001c\u0016ýÏ\u008deR\"\u0013\u00059\u000f\u0004Öç\u00188\u009c«ÙRFN\u008b\u001c\u009dê3ëì\u0016Hlû\n\u008b\u007f0\u000f\u009c";
                  var8 = "Ôt°ì\u000bèAzP\u001c\u0016ýÏ\u008deR\"\u0013\u00059\u000f\u0004Öç\u00188\u009c«ÙRFN\u008b\u001c\u009dê3ëì\u0016Hlû\n\u008b\u007f0\u000f\u009c"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6145;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/scripting/lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
