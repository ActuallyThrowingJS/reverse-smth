package me.octo.client.modules.helpers;

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
import kotlin.Unit;
import kotlin.random.Random;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.modules.impl.macros.lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl;
import me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
import me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
import me.octo.client.utils.render.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.NotNull;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI
   extends IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 73176117023360L;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static Map IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new HashMap(13);
   private static long[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static Long[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static Map IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;

   public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
      long var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 120109337263098L;
      super("Slayer Starter");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull ChestBackgroundDrawnEvent param1, char param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 68272156731130L;
      long var7 = var1 ^ 23183359969553L;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"w">(5278, 1009893595395083902L ^ var1),
            IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
            var5
         );
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7111623090388431260L, var1
      );
      lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll(var7);

      try {
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               -7046021806917705368L, var1
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               "fKtdXc", -7082939819501230025L, var1
            );
         }
      } catch (MatchException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -7183068349724383726L, var1
         );
      }
   }

   @Override
   public void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1) {
      long var3 = var1 ^ 23889456652188L;
      long var5 = var1 ^ 0L;
      long var7 = var1 ^ 100616265174146L;
      long var9 = var1 ^ 108506355580867L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4281741422623074370L, var1
      );
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 250 + Random.Default.nextInt(100);
      String var11 = var10000;

      label37: {
         label29:
         try {
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = "";
            if (var11 == null) {
               this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                  .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
               var16 = lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                  .llllIlIlIlIlIllIlIlIIIlIlIIIllllIllIIIIIllllIIlIlIIlIlIIIllIIIIlIIIIIlIIlIllIIllIIIII();
               if (var16 != null) {
                  break label29;
               }
            }
            break label37;
         } catch (MatchException var15) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var15, -4212308475696054328L, var1
            );
         }

         int var12 = var16.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
         boolean var13 = false;
         me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var7, var12);
      }

      try {
         IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"w">(17668, 7536027222379382332L ^ var1),
               llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"i">(32246, 703581962797801658L ^ var1),
               llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"i">(8220, 3469636437703015770L ^ var1),
               me.octo.client.utils.render.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.INFO,
               var9
            );
         super.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var5);
         if (var11 != null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[4], -4269294099340623744L, var1
            );
         }
      } catch (MatchException var14) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var14, -4212308475696054328L, var1
         );
      }
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var0
   ) {
      try {
         LocalPlayer var10000 = var0.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI().player;
         if (var10000 != null) {
            var10000.clientSideCloseContainer();
         }
      } catch (MatchException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return Unit.INSTANCE;
   }

   static {
      long var20 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 99429749883313L;
      Object var22 = null;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((String)var22);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[38];
      int var16 = 0;
      String var15 = "\u008díUÈÈ\u0095\u0097Kô\u0003\u0090\u009f§jç\u0086 Cý²Ï²\u0098¡oT¤\u0097í\u0082\u000e\u0082\u0005þz8?7\u009a\u0012Ë\u0092ðWâ·K¦¬\u0018plE\u009d^ôwèX\nUfRç.\u0095áØ\u009aã¡y@,\u0010Xli^\u0092o§\u001c^\u0081pâ*\u008cÒ¥\u0018\u0082\b\u0015\u0081\u008e©\\l\u0081Ús\u001fºbA=¶NÿóKÏ\u0018¹\u0010ÔZ\u009eU!õ\b\u0093Ý#¸\u00984jh\u007f\u0010²\u0094ßW+Údå\u009bT;\u001f²:ß¾ .ï\u0083æ¢?f\u0094\u0086ó\u001e\u009eíusªÐËW;\u0015Ú\u009aa¦\u0010\n¢ÿ\u0017ÙR {<\u0002\bBRü7;\u0016Ä¤ öêòèrZl·ï8\t\u0095ñFcÅ÷-Ñ@\u0006ÛQü\u001cwWÍRÅ\u008cÁ#\u000f+©Æ\u007f\u008f\u001aãñ\u0086\u0080\u00adyfP»É>.¸\u0015ëÙ\u001d`æ32U\u0001¿W+\u0082Ûç\u000b\u0006÷Ñ,½<^|\u0001÷NÕ`60f\u0092A\u0089vO\u001fbücF\u0018÷Ð3\u009ff\u0007ìMÀ\u0084<Ôf\u001bHI\u008f\u0080¾\u0017f\u0099°\u0082\u0014Y£31Ï[Ú\u000b:\rE\u0010\u007fº Qøuõ\r¸LO.²\nã\u0095\u0010\u001aµp·fv»ÙEû\u007fì|;½\u0083\u0018·\u001d\u0093Xþ\u0084íÝk\u008f9\r×Å\u001e;Eïßo\u000b9HÃ\u0010iP¯\u001dÆ4ñ÷\u0087·\u0007Æ\u000eÛ¥\u0095\u0018\u0013%÷<½\\V\u0019\u008fÕ\u008fê\u0010¯\u001c~Ð»GA(È\u001c§ G=À\t%é+\u0002\u0004÷øü\u009f\u00945\u0098># 6nz3\bO?\u009câ2Sp¼@\u008c\u009c\u00adô<=\u00ad\nÚ5x½ý¸ñÎÍê\u0094þèú\u0094öª\u0087Òq©Z\u0095ù§_áøÀÛ]@\u008b<½\u0007Åï¤gº\u00990³N:\u0093Ì¨3\u001fÙÏÅ¢Í S~mx[ÒU_<¦ûÂ+Ôj%f\\;J\u0017d$\u00adÄ\u008e\u0080pÜö¾_\u0010\u0016ÂÑâ\b÷a^Ø\u0098±îov4\u0081@Á°æ«fëû\u008a^z7jÜZ6ÐN\u008c«Ê!\n\u0018\u0012^ÍÄ\"\u0095ò\f\n\u0093Ê^K6ð¡\r*\u008eÄ\fìÝ(Ý\u0085Äì/%I3P;\u001ac=\u0005\u0099R`\u0010\u0081¢ys\u0003êTªUÞæ!\u0088¹\u009d\u0088\u0010âJ\u0082Ô\u0006Môg7\u009f/}ò¾C\r éæ[Òs`\u0098=+c`m\u0002Aÿ\u0012¡yÒ\u008eÉC\u0011ã4¢\u0007¬ÙÆ\u0011«  öþ¥WhD%KÔ\u000eØAöVa2Ó\u0086KùÊ\bð\u0005\u0085\n\u0011ãÐqq\u0010ä¥Ò}Ë8*\u001d7A3\u0000T\u0007\u008cm(\u0004eßwC\u0016?A<Ü\\\u008c\\,v»4R'1\u000bSªu\u008eL\u008e¥áPu\u0001*\u00adün\u0093÷Ï² ¤e\u009e;Û\u001aT÷Àãf\u000elIÖås\u0011nrñ\u0006J©Æb\u000e6\t®\u0086õ íÅ\u008f4\u0091 \tw\u009c\u0094èbv~\u0015=²\u009c\\§©ä A\u0002\u0089\u008e«=i\u0080Q °gtÒ\u0099`ÚàÒ£TïÉQ>Ä¶\u0099»ûÑYäÓfÙ|Y\u0083Ð\u008ef\u0010L*+\r+\u0090\u001d¹C\u008c\fß\u0083)\u0011\u008f\u0010\u009eË\u0087³ìëCø|Ú\u0018Ø´\u000b¹4XÏi\u0016À\u008eH¦2Û\u0084\u009c.´¼\u0099\u0097Íc\u001bmiùñ³IM\u0085qÃ,\u001e?\u0092\u0093Ë\u0096:Ýï,ýá]É±\u0089´Â¿\u0006\u0012Þ\u0098å3 ÊjÌ5î¼vÔz\\ÕÇ97\u009e8\u001f\u000b\u008a\u008dãÍ\f}\u0012þâÆ¶\u0001Éº(Z\u0015FhÑÐ²\u0012\u000bíÉ\u0093Ûk4\u008b\u009c3$éN\u0017ô\u000fd\u0014\brÖ²É4ß¿ç\u001dºä\u0003\u0010\u0010£êÝ;Ë´\u0098ÖâÁN\u0094\u009a3í´(Ü/Ô¤i®\u008dÒ+ym\u0086Fbãð8Vk4x)eÊövw\u00911Q\u008eI´y,¥\n%È\u0015";
      int var17 = "\u008díUÈÈ\u0095\u0097Kô\u0003\u0090\u009f§jç\u0086 Cý²Ï²\u0098¡oT¤\u0097í\u0082\u000e\u0082\u0005þz8?7\u009a\u0012Ë\u0092ðWâ·K¦¬\u0018plE\u009d^ôwèX\nUfRç.\u0095áØ\u009aã¡y@,\u0010Xli^\u0092o§\u001c^\u0081pâ*\u008cÒ¥\u0018\u0082\b\u0015\u0081\u008e©\\l\u0081Ús\u001fºbA=¶NÿóKÏ\u0018¹\u0010ÔZ\u009eU!õ\b\u0093Ý#¸\u00984jh\u007f\u0010²\u0094ßW+Údå\u009bT;\u001f²:ß¾ .ï\u0083æ¢?f\u0094\u0086ó\u001e\u009eíusªÐËW;\u0015Ú\u009aa¦\u0010\n¢ÿ\u0017ÙR {<\u0002\bBRü7;\u0016Ä¤ öêòèrZl·ï8\t\u0095ñFcÅ÷-Ñ@\u0006ÛQü\u001cwWÍRÅ\u008cÁ#\u000f+©Æ\u007f\u008f\u001aãñ\u0086\u0080\u00adyfP»É>.¸\u0015ëÙ\u001d`æ32U\u0001¿W+\u0082Ûç\u000b\u0006÷Ñ,½<^|\u0001÷NÕ`60f\u0092A\u0089vO\u001fbücF\u0018÷Ð3\u009ff\u0007ìMÀ\u0084<Ôf\u001bHI\u008f\u0080¾\u0017f\u0099°\u0082\u0014Y£31Ï[Ú\u000b:\rE\u0010\u007fº Qøuõ\r¸LO.²\nã\u0095\u0010\u001aµp·fv»ÙEû\u007fì|;½\u0083\u0018·\u001d\u0093Xþ\u0084íÝk\u008f9\r×Å\u001e;Eïßo\u000b9HÃ\u0010iP¯\u001dÆ4ñ÷\u0087·\u0007Æ\u000eÛ¥\u0095\u0018\u0013%÷<½\\V\u0019\u008fÕ\u008fê\u0010¯\u001c~Ð»GA(È\u001c§ G=À\t%é+\u0002\u0004÷øü\u009f\u00945\u0098># 6nz3\bO?\u009câ2Sp¼@\u008c\u009c\u00adô<=\u00ad\nÚ5x½ý¸ñÎÍê\u0094þèú\u0094öª\u0087Òq©Z\u0095ù§_áøÀÛ]@\u008b<½\u0007Åï¤gº\u00990³N:\u0093Ì¨3\u001fÙÏÅ¢Í S~mx[ÒU_<¦ûÂ+Ôj%f\\;J\u0017d$\u00adÄ\u008e\u0080pÜö¾_\u0010\u0016ÂÑâ\b÷a^Ø\u0098±îov4\u0081@Á°æ«fëû\u008a^z7jÜZ6ÐN\u008c«Ê!\n\u0018\u0012^ÍÄ\"\u0095ò\f\n\u0093Ê^K6ð¡\r*\u008eÄ\fìÝ(Ý\u0085Äì/%I3P;\u001ac=\u0005\u0099R`\u0010\u0081¢ys\u0003êTªUÞæ!\u0088¹\u009d\u0088\u0010âJ\u0082Ô\u0006Môg7\u009f/}ò¾C\r éæ[Òs`\u0098=+c`m\u0002Aÿ\u0012¡yÒ\u008eÉC\u0011ã4¢\u0007¬ÙÆ\u0011«  öþ¥WhD%KÔ\u000eØAöVa2Ó\u0086KùÊ\bð\u0005\u0085\n\u0011ãÐqq\u0010ä¥Ò}Ë8*\u001d7A3\u0000T\u0007\u008cm(\u0004eßwC\u0016?A<Ü\\\u008c\\,v»4R'1\u000bSªu\u008eL\u008e¥áPu\u0001*\u00adün\u0093÷Ï² ¤e\u009e;Û\u001aT÷Àãf\u000elIÖås\u0011nrñ\u0006J©Æb\u000e6\t®\u0086õ íÅ\u008f4\u0091 \tw\u009c\u0094èbv~\u0015=²\u009c\\§©ä A\u0002\u0089\u008e«=i\u0080Q °gtÒ\u0099`ÚàÒ£TïÉQ>Ä¶\u0099»ûÑYäÓfÙ|Y\u0083Ð\u008ef\u0010L*+\r+\u0090\u001d¹C\u008c\fß\u0083)\u0011\u008f\u0010\u009eË\u0087³ìëCø|Ú\u0018Ø´\u000b¹4XÏi\u0016À\u008eH¦2Û\u0084\u009c.´¼\u0099\u0097Íc\u001bmiùñ³IM\u0085qÃ,\u001e?\u0092\u0093Ë\u0096:Ýï,ýá]É±\u0089´Â¿\u0006\u0012Þ\u0098å3 ÊjÌ5î¼vÔz\\ÕÇ97\u009e8\u001f\u000b\u008a\u008dãÍ\f}\u0012þâÆ¶\u0001Éº(Z\u0015FhÑÐ²\u0012\u000bíÉ\u0093Ûk4\u008b\u009c3$éN\u0017ô\u000fd\u0014\brÖ²É4ß¿ç\u001dºä\u0003\u0010\u0010£êÝ;Ë´\u0098ÖâÁN\u0094\u009a3í´(Ü/Ô¤i®\u008dÒ+ym\u0086Fbãð8Vk4x)eÊövw\u00911Q\u008eI´y,¥\n%È\u0015"
         .length();
      char var14 = 16;
      int var24 = -1;

      label45:
      while (true) {
         String var25 = var15.substring(++var24, var24 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var34 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var34;
                  if ((var24 += var14) >= var17) {
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var18;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new String[38];
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = new HashMap(13);
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "\u000b.¤\u001c¸ª\u0017\u001f&\u009c\u0081I\u008fín=Ï¢\u0012Ë\u0081fó!";
                     int var5 = "\u000b.¤\u001c¸ª\u0017\u001f&\u009c\u0081I\u008fín=Ï¢\u0012Ë\u0081fó!".length();
                     byte var2 = 0;

                     do {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10001 = var3++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var0.doFinal(
                           new byte[]{
                              (byte)(var8 >>> 56),
                              (byte)(var8 >>> 48),
                              (byte)(var8 >>> 40),
                              (byte)(var8 >>> 32),
                              (byte)(var8 >>> 24),
                              (byte)(var8 >>> 16),
                              (byte)(var8 >>> 8),
                              (byte)var8
                           }
                        );
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var39 = -1;
                        var6[var10001] = var10004;
                     } while (var2 < var5);

                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var6;
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new Long[3];
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     return;
                  }

                  var14 = var15.charAt(var24);
                  break;
               default:
                  var18[var16++] = var34;
                  if ((var24 += var14) < var17) {
                     var14 = var15.charAt(var24);
                     continue label45;
                  }

                  var15 = "¬>ý\u008e°Ò÷SÚ>£Û0\u0080\u0007ÖQ}g/\u0087dmL\u0099¥\u009f\u0088L§âÔ\u0010\u00860!lË½ó\u0087ÐÊÐ\u000e¶\u0091º\u008f";
                  var17 = "¬>ý\u008e°Ò÷SÚ>£Û0\u0080\u0007ÖQ}g/\u0087dmL\u0099¥\u009f\u0088L§âÔ\u0010\u00860!lË½ó\u0087ÐÊÐ\u000e¶\u0091º\u008f".length();
                  var14 = ' ';
                  var24 = -1;
            }

            var25 = var15.substring(++var24, var24 + var14);
            var10001 = 0;
         }
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
      IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var0;
   }

   public static String IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23374;
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
            throw new RuntimeException(
               "me/octo/client/modules/helpers/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
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
         byte[] var9 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5].getBytes("ISO-8859-1");
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5];
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
            "me/octo/client/modules/helpers/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17706;
      if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/helpers/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3] = var15;
      }

      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3];
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
            "me/octo/client/modules/helpers/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 137349430848737L;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
      }
   }
}
