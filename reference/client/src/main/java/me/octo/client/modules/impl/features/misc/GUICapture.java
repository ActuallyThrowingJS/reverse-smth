package me.octo.client.modules.impl.features.misc;

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
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.utils.client.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GUICapture extends BooleanModule {
   @NotNull
   public static GUICapture.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private String lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @JvmField
   @NotNull
   public static GUICapture llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 135158141568173L;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static Map llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new HashMap(13);

   private GUICapture() {
      long var1 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 50535831266703L;
      super(
         "GUI Capture",
         "Logs each new container GUI (items, heads, ids) to polinex/guis so features like AutoForge can recreate them.",
         ModuleCategory.MISC,
         "Misc",
         true,
         0
      );
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ChestBackgroundDrawnEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "";
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0;
   }

   private static final CharSequence IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, short var1, int var2, Slot var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      long var10001 = var4 ^ 131283629771982L;
      int var6 = (int)((var4 ^ 131283629771982L) >>> 48);
      int var7 = (int)((var4 ^ 131283629771982L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 93754175137877L;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(9458, 715112899785426025L ^ var4)
      );
      int var10000 = var3.index;
      llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl var12 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      ItemStack var10002 = var3.getItem();
      Intrinsics.checkNotNullExpressionValue(
         var10002, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(30779, 7498527453532903591L ^ var4)
      );
      ItemStack var11 = var10002;
      String var13 = var12.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((char)var6, var11, var7, (short)var8);
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var14 = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      String var10003 = var3.getItem().getHoverName().getString();
      Intrinsics.checkNotNullExpressionValue(
         var10003, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"v">(3857, 4718198374845329294L ^ var4)
      );
      return var10000 + ":" + var13 + ":" + var14.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10003, var9);
   }

   static {
      long var7 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 131086657479016L;
      Cipher var9;
      Cipher var10000 = var9 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var10 = 1; var10 < 8; var10++) {
         var10003[var10] = (byte)(var7 << var10 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var16 = new String[10];
      int var14 = 0;
      String var13 = "\u0015ùÂ\u0014\u001dD\u0090\r×ß\u0016£6\u0007U\u0086ÎkËj§\u001b¾çlt¼+ nÞ3 \u0088\r\u008e})ã~m_QÀù\u0099\u0017'\u000eQjä\u0094=\u0088 \u0087È\u0014¨§Q\u000fas\u0018\u0082óX×-àl)\u0007\u0088\u0091Â~Çl´\u0098ô¶\u0000\u0080\u0082\u0096G J!Û¤Ô8\u0092\u008dÑýüâ:\u0002g\u0016m\u0080¢Pg-·Ð\u0006ÃÂ\u001by?Þ² x\u001cZ\u001fÆ¸<ç£\u0007\u0083ÖKÆÏ.±U\u0084tr>?\u0088LPZè¹\\Aþ Àá\u0015ãak:ß«Ö\u008e\u0084\u001f *pè\u0093ÅBË×\u001e\u0088\u0082\rÅ\r\u0017\u008f¼\u0096\u0010\u009fo&c\u0013\tg9»8ï\u008e\u000b¢½ô\u0010¢l]ªs\u0083¯'\fZ'\u0085E';â";
      int var15 = "\u0015ùÂ\u0014\u001dD\u0090\r×ß\u0016£6\u0007U\u0086ÎkËj§\u001b¾çlt¼+ nÞ3 \u0088\r\u008e})ã~m_QÀù\u0099\u0017'\u000eQjä\u0094=\u0088 \u0087È\u0014¨§Q\u000fas\u0018\u0082óX×-àl)\u0007\u0088\u0091Â~Çl´\u0098ô¶\u0000\u0080\u0082\u0096G J!Û¤Ô8\u0092\u008dÑýüâ:\u0002g\u0016m\u0080¢Pg-·Ð\u0006ÃÂ\u001by?Þ² x\u001cZ\u001fÆ¸<ç£\u0007\u0083ÖKÆÏ.±U\u0084tr>?\u0088LPZè¹\\Aþ Àá\u0015ãak:ß«Ö\u008e\u0084\u001f *pè\u0093ÅBË×\u001e\u0088\u0082\rÅ\r\u0017\u008f¼\u0096\u0010\u009fo&c\u0013\tg9»8ï\u008e\u000b¢½ô\u0010¢l]ªs\u0083¯'\fZ'\u0085E';â"
         .length();
      char var12 = ' ';
      int var11 = -1;

      while (true) {
         byte[] var17 = var9.doFinal(var13.substring(++var11, var11 + var12).getBytes("ISO-8859-1"));
         String var30 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var17).intern();
         byte var10001 = -1;
         var16[var14++] = var30;
         if ((var11 += var12) >= var15) {
            var13 = "«\u0018Q\u000frñÁ\u0092Z{ð¢\"\u0001¼(°Ì³\u009c*Ð³õÂRw\u0017\u0088¹-\tû)\u009cP^s\u001c-Y\u0011Ã¶Õò.\u0087Gä\u0089Öëb\u001f\u008byr \u0084zs\rOÞhø\u0000\\\u0016ùk#À¦z^·em)ÿÁ\u0097\u000eå\u0014¶¸Ç¶\u009d`\u0097sÕ?<RÌ\u008dO\u001cëÏ|Ð³L\u009cQX\u00151j_Ë°v${Rñ\u00044òY\u0086`J1À\u0018ç\u009c ?\u001fQ\fs»½Í/>&\u0084R\u0090é[²¦\u0098\u001b»úÙ\u001aLdR{0ð\u0091@\u001dßªg\u0088e¤\u0098ûÑrmYÖW\u0086\u000b²;\u0011ÃÄ~A\u0081";
            var15 = "«\u0018Q\u000frñÁ\u0092Z{ð¢\"\u0001¼(°Ì³\u009c*Ð³õÂRw\u0017\u0088¹-\tû)\u009cP^s\u001c-Y\u0011Ã¶Õò.\u0087Gä\u0089Öëb\u001f\u008byr \u0084zs\rOÞhø\u0000\\\u0016ùk#À¦z^·em)ÿÁ\u0097\u000eå\u0014¶¸Ç¶\u009d`\u0097sÕ?<RÌ\u008dO\u001cëÏ|Ð³L\u009cQX\u00151j_Ë°v${Rñ\u00044òY\u0086`J1À\u0018ç\u009c ?\u001fQ\fs»½Í/>&\u0084R\u0090é[²¦\u0098\u001b»úÙ\u001aLdR{0ð\u0091@\u001dßªg\u0088e¤\u0098ûÑrmYÖW\u0086\u000b²;\u0011ÃÄ~A\u0081"
               .length();
            var12 = '\u0010';
            var11 = -1;

            while (true) {
               var17 = var9.doFinal(var13.substring(++var11, var11 + var12).getBytes("ISO-8859-1"));
               String var32 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var17).intern();
               byte var27 = 0;
               var16[var14++] = var32;
               if ((var11 += var12) >= var15) {
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var16;
                  IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new String[10];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var7 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var7 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 8677747573840521138L;
                  byte[] var6 = var2.doFinal(
                     new byte[]{
                        (byte)(var4 >>> 56),
                        (byte)(var4 >>> 48),
                        (byte)(var4 >>> 40),
                        (byte)(var4 >>> 32),
                        (byte)(var4 >>> 24),
                        (byte)(var4 >>> 16),
                        (byte)(var4 >>> 8),
                        (byte)var4
                     }
                  );
                  long var35 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var27 = -1;
                  long var0 = var35;
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = (int)var0;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new GUICapture.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new GUICapture();
                  return;
               }

               var12 = var13.charAt(var11);
            }
         }

         var12 = var13.charAt(var11);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6671;
      if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/misc/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll", var10
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
         byte[] var9 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5].getBytes("ISO-8859-1");
         IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5];
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
            "me/octo/client/modules/impl/features/misc/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
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
   }
}
