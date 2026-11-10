package me.octo.client.failsafes;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI extends BooleanModule {
   @NotNull
   public static IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private final BiConsumer<me.octo.client.utils.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll, me.octo.client.utils.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @JvmField
   @NotNull
   public static IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 57809760407299L;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static Map IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new HashMap(13);

   private IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI() {
      long var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 32088727408606L;
      long var3 = var1 ^ 11993070934358L;
      ModuleCategory var10003 = ModuleCategory.FAILSAFES;
      Setting[] var5 = new Setting[]{
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
      };
      super(
         "Action on Macro Safety Change",
         "Does configurable actions when the safety status of your currently running macro worsens.",
         var10003,
         "Miscellaneous",
         true,
         var5
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI;
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 0L;
      super.lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(var3);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, 81614272392419414L, var1
      );
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = (var4 ^ 0L) >>> 8;
      int var8 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var6, (byte)var8);
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll, 8877164082954480684L, var4
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.utils.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param1,
      long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI var0,
      long var1,
      me.octo.client.utils.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
      me.octo.client.utils.client.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4
   ) {
      var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ var1;
      long var5 = var1 ^ 68295400739245L;
      Intrinsics.checkNotNull(var3);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5);
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0, boolean param2, boolean param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final void IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(long var0) {
      var0 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ var0;
      long var2 = var0 ^ 8236432538499L;
      me.octo.client.utils.player.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"s">(29709, 8842747089186506745L ^ var0), var2
      );
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0, int var1, IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI var2, boolean var3, boolean var4, short var5
   ) {
      long var6 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var5 << 48 >>> 48)
         ^ llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      long var8 = var6 ^ 117487580349914L;
      long var10 = var6 ^ 134101079085785L;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3715960710142361173L, var6
      );
      var2.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI()
         .execute(
            IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
         );
      String[] var12 = var10000;

      label26: {
         try {
            var15 = var3;
            if (var12 == null) {
               break label26;
            }

            if (var3) {
               return Unit.INSTANCE;
            }
         } catch (MatchException var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, 3630997022691407442L, var6
            );
         }

         var15 = var4;
      }

      try {
         if (!var15) {
            var2.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI()
               .execute(
                  IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI::IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII
               );
         }
      } catch (MatchException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, 3630997022691407442L, var6
         );
      }

      return Unit.INSTANCE;
   }

   static {
      long var0 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 2916676585824L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "\u009c8Ý¼Åóò\u001a\"n6poÑÌ\u001d\u0085\u0095E\u00adAÍ\u00121ÈC\u0007Ä)ãUD[Ã\f\u0017Ýª\u0003¹8\u009fJDZ¨ò(.¦sm=³\u0087\u0011q\u0019ô\u008c(ÉôP`J\u008a \u0001á'ÎQ\u001f\u0003bÔ9§\u008b\u0085SøOt¯¶õÛYÁÜ, G\u0019$\u0098[¾OßlUÂû\u007f\u009dä)Ä\u0095\u0011]\u008c\u0096áÆ\u0094¡[lÏ\u0019\u001dxh¿%íàJjÑµCY(\u009aé§í¼|+\u0083g;2&5Ã¸\u0098,\u0092~\u009eG\u001fülÍ°}ÏêÑ\u0002 zvKoÑá\u0097\u0004}Ì\u007f\u000fQú:\u0083)EýµR\u009a\u0013vwWò\u0011¸·\u0088Ü]Ûg³]Û0\u0095á¸¤\r5®qØ\u008d[\u001cN\u0016\u0090é\u0019p'À·Æ\u0011\u0080ÆÉ\u008a¦ÀÁ6\"{À)êS¶§;Q8¢½\u0090ÑV\b\u0004^\f{ÖfÙ¿?©\u0094\u0083j\u0007VY§H_ØY«H\u0093çäH\u0003\nÎ\fS\u0001\u0010H\u001e\u009blG\u009eâ;h\u0018¨\by\u0093$Í ½Z\u000f¬A3Íà2\u000eö-âµ¡e\u008f\u0095\fEwÔ?©ª\f;ñ\u0018\u0010mq\u0010\u0090nt[.!\u0001@ÇEWÞ¥üRM8Ò\u0091Þ³×\u0085ý\u0098d\u0015½'HlÑ8\u0017\u0003ÌÃ\u0005º F\n`ûò'Yî\u0016ó:Â*$\u001e²ªYY[å!\tc\u0085\u001bßý\u001eBÝ\u0085\u00118Ü/\u0094g7\b5½\u0013\u0019\f\u007f@¢©´\u0005\u0083\u008aÅu\u0013\u0082\u001efR\u0085\u008dZi¡p¾\u001dð\u008dO½@.V«¾lP\u0007É©\u009d7s\u0006\u0081\u0087Ñ! ¼vÂ\u009f\u001dð&wHx\u008b»Øi\u009aG\u001d^\bïLý®Á Z?-7\u0086ëK\u0010G¸Á«EyØOi\u0001Mfóüíù\u0010ó¹2\u0081\u0087ü\u009biÇÑ\b\u0011Ýô×N\u0010\u0092ÃfbGX\u0018\u008fõíÄ\u0093qªÖ%\u0018¿\u0012å\u0005\u0095§]Ø_¯\u0085\u008d\u009d8\u001e\u0083:G¯£\t\u0010nd \r¿ö\r \u0019ÁÔ_$\u0091\u001fÍÀA .D³îÆÒ\"\u001fý\u000e±(¦!Õ·0¡aV¸\u0093Ù¾]¬UÞ»H`6E\u008eeáA$ßõXO¢^BÈ-\u0090\u0080¿).o\u0099ªë¯Ã&\u0006¾\u0015\u0089cî Õ \u001c\u00875á¸£^o\u000f¿³hïïÈ\u0017\u0084§\"&\u007fH÷FC\u0098\u008bß\u0082Ø(´©Ëy¾\u0098éÇ\u0013'Á\r$\u0095¿(I_ÂÆÁB\u009eA]\u0001½ÿ7è'û\u008d\u0007\u0097¶\u0082\t\u0099\b";
      int var8 = "\u009c8Ý¼Åóò\u001a\"n6poÑÌ\u001d\u0085\u0095E\u00adAÍ\u00121ÈC\u0007Ä)ãUD[Ã\f\u0017Ýª\u0003¹8\u009fJDZ¨ò(.¦sm=³\u0087\u0011q\u0019ô\u008c(ÉôP`J\u008a \u0001á'ÎQ\u001f\u0003bÔ9§\u008b\u0085SøOt¯¶õÛYÁÜ, G\u0019$\u0098[¾OßlUÂû\u007f\u009dä)Ä\u0095\u0011]\u008c\u0096áÆ\u0094¡[lÏ\u0019\u001dxh¿%íàJjÑµCY(\u009aé§í¼|+\u0083g;2&5Ã¸\u0098,\u0092~\u009eG\u001fülÍ°}ÏêÑ\u0002 zvKoÑá\u0097\u0004}Ì\u007f\u000fQú:\u0083)EýµR\u009a\u0013vwWò\u0011¸·\u0088Ü]Ûg³]Û0\u0095á¸¤\r5®qØ\u008d[\u001cN\u0016\u0090é\u0019p'À·Æ\u0011\u0080ÆÉ\u008a¦ÀÁ6\"{À)êS¶§;Q8¢½\u0090ÑV\b\u0004^\f{ÖfÙ¿?©\u0094\u0083j\u0007VY§H_ØY«H\u0093çäH\u0003\nÎ\fS\u0001\u0010H\u001e\u009blG\u009eâ;h\u0018¨\by\u0093$Í ½Z\u000f¬A3Íà2\u000eö-âµ¡e\u008f\u0095\fEwÔ?©ª\f;ñ\u0018\u0010mq\u0010\u0090nt[.!\u0001@ÇEWÞ¥üRM8Ò\u0091Þ³×\u0085ý\u0098d\u0015½'HlÑ8\u0017\u0003ÌÃ\u0005º F\n`ûò'Yî\u0016ó:Â*$\u001e²ªYY[å!\tc\u0085\u001bßý\u001eBÝ\u0085\u00118Ü/\u0094g7\b5½\u0013\u0019\f\u007f@¢©´\u0005\u0083\u008aÅu\u0013\u0082\u001efR\u0085\u008dZi¡p¾\u001dð\u008dO½@.V«¾lP\u0007É©\u009d7s\u0006\u0081\u0087Ñ! ¼vÂ\u009f\u001dð&wHx\u008b»Øi\u009aG\u001d^\bïLý®Á Z?-7\u0086ëK\u0010G¸Á«EyØOi\u0001Mfóüíù\u0010ó¹2\u0081\u0087ü\u009biÇÑ\b\u0011Ýô×N\u0010\u0092ÃfbGX\u0018\u008fõíÄ\u0093qªÖ%\u0018¿\u0012å\u0005\u0095§]Ø_¯\u0085\u008d\u009d8\u001e\u0083:G¯£\t\u0010nd \r¿ö\r \u0019ÁÔ_$\u0091\u001fÍÀA .D³îÆÒ\"\u001fý\u000e±(¦!Õ·0¡aV¸\u0093Ù¾]¬UÞ»H`6E\u008eeáA$ßõXO¢^BÈ-\u0090\u0080¿).o\u0099ªë¯Ã&\u0006¾\u0015\u0089cî Õ \u001c\u00875á¸£^o\u000f¿³hïïÈ\u0017\u0084§\"&\u007fH÷FC\u0098\u008bß\u0082Ø(´©Ëy¾\u0098éÇ\u0013'Á\r$\u0095¿(I_ÂÆÁB\u009eA]\u0001½ÿ7è'û\u008d\u0007\u0097¶\u0082\t\u0099\b"
         .length();
      char var5 = '(';
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
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var9;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new String[19];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        null
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI();
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

                  var6 = "n\u00846ë[ì¥:*'\u0013û,©~X¿I\u0005|\u0018½$\u009d\u0089\u0081\u0092øf¥\u008d\u009cM\u000e`a,²)x<¨\u0013.¬9ª\u009bXµ7l<¿u\u0087³0êÑi\u0005&¨\u001c#¾û&\u0004Vëô¢Áó4\u0099Þ(\u0086¡\u001czsÔãw Ú\u00865\\+Ù\u001fg\u0019¹û\tQ\u0018Ð\u001dPlXÂ-f\u0084Üø¨\u0014\u008a#iÆf";
                  var8 = "n\u00846ë[ì¥:*'\u0013û,©~X¿I\u0005|\u0018½$\u009d\u0089\u0081\u0092øf¥\u008d\u009cM\u000e`a,²)x<¨\u0013.¬9ª\u009bXµ7l<¿u\u0087³0êÑi\u0005&¨\u001c#¾û&\u0004Vëô¢Áó4\u0099Þ(\u0086¡\u001czsÔãw Ú\u00865\\+Ù\u001fg\u0019¹û\tQ\u0018Ð\u001dPlXÂ-f\u0084Üø¨\u0014\u008a#iÆf"
                     .length();
                  var5 = 'X';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7722;
      if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5].getBytes("ISO-8859-1");
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5];
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
            "me/octo/client/failsafes/IllllIIIIIlllIIllIIIIIllIlIllllIIIIllIlIlIIllIIIlllllIIIIIIIIlIIlIlIIIIIlIllIIIlIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }
   }
}
