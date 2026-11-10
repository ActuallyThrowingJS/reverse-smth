package me.octo.client.modules.impl.features;

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
import kotlin.jvm.JvmField;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class AutoMaddox extends BooleanModule {
   @NotNull
   public static AutoMaddox.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @JvmField
   @NotNull
   public static AutoMaddox IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 39393288515760L;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static String[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static Map llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new HashMap(13);
   private static long[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static Long[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static Map llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;

   private AutoMaddox() {
      long var1 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 15586528998400L;
      ModuleCategory var10003 = ModuleCategory.SKILLS;
      Setting[] var3 = new Setting[]{
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
      };
      super("Auto Maddox", "Automatically calls Maddox and starts a quest after you kill your boss.", var10003, "Slayer", var3);
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   private final int IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      return IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
            .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI()
         - 1;
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ChestBackgroundDrawnEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, ChestBackgroundDrawnEvent param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 91233016683311L;
      long var10001 = var1 ^ 9325505454849L;
      int var5 = (int)((var1 ^ 9325505454849L) >>> 48);
      int var6 = (int)((var1 ^ 9325505454849L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = false;
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1174925626371254L, var1
      );
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = false;

      try {
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
         this.IllllIIIIIIIlIlIllIIIlIIIIIIlIIIlIIllllIIIlIIIlIllllIIIlIllIllIlIIlllIlllIlIIIlIIlIII((char)var5, (short)var6, var7);
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               242778328384814081L, var1
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new String[5], 107482434283703992L, var1
            );
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, 7562649146874145L, var1
         );
      }
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var10001 = var4 ^ 64842573134489L;
      int var6 = (int)((var4 ^ 64842573134489L) >>> 32);
      int var7 = (int)((var4 ^ 64842573134489L) << 32 >>> 40);
      int var8 = (int)(var10001 << 56 >>> 56);
      this.lIlIIIlIllIlllllIIIllllllIllIIlIIlllIlIIlIIlllIlllIlIlIIlIIlllIlllIlllllIIlllIIIIIIll(var6, var7, (byte)var8);
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      AutoMaddox var0, ChestBackgroundDrawnEvent var1, char var2, int var3, short var4, int var5
   ) {
      long var6 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      long var8 = var6 ^ 94242084429887L;
      long var10 = var6 ^ 78151292397399L;

      try {
         if (var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var1, var5)) {
            me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, 0, 0, var8);
         }
      } catch (MatchException var12) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var12, 7024189040163534913L, var6
         );
      }
   }

   private static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0, int var2) {
      var0 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ var0;
      long var3 = var0 ^ 19879688126940L;
      me.octo.client.utils.player.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, 0, 0, var3);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      byte param0, AutoMaddox param1, ChestBackgroundDrawnEvent param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, AutoMaddox var2, ChestBackgroundDrawnEvent var3, int var4
   ) {
      var0 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ var0;
      long var10001 = var0 ^ 105300558283297L;
      int var5 = (int)((var0 ^ 105300558283297L) >>> 48);
      int var6 = (int)((var0 ^ 105300558283297L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      var2.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI()
         .execute(AutoMaddox::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, AutoMaddox var2, int var3) {
      var0 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ var0;
      long var4 = var0 ^ 35549871764686L;
      var2.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI()
         .execute(AutoMaddox::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI);
      return Unit.INSTANCE;
   }

   static {
      long var11 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 12951064848263L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[57];
      int var18 = 0;
      String var17 = "/WÚ\\\u009bÝK9\u0085\u000eæ\u009f\u0005\u00ad)\u0014i%\u000bc_ê¯î_]\u0083q·4\u001e( Ì\u00ad_\u0018WñIÜõ\u008e¦åk\\Ïö\u001e\u0000;È-¯¡¦Ï\u0099é\u008bßÅ~°\u0010#ü¨ZÅ\u0006n){â\u0090\u0093\u008fFðê\u0018Õ]\"~î1¿\u00938/wvÙåÐ:\u0005ÔTÞ\u0001\rLC(\u001d(ß¦D¼æ`\u009ai¶í¿Øü\u0003Û#'iVuÙ½ò`\u008cçÜTJHXòv4¶¼[\u008e(ÿÂjãD\u0014\u007f\u000e\u000bû:²â°\u0088\u008fÐïOÏ}\u007f9ûq\u0094Öö@D¬Ï½\u0084½Í52o·(BÉ\fB)Eá\u0015É\u008dqr~3¡ö\u0012TW#äNb\u0088åsË\u0004ª}8g\u0090N>Þ\u0097'¼\u001e(ÏJL5\u0093öB\ríó¬\u0011]ÐÔ<D¨\u00876èß7\u008fÎG1µH\u0099Ê\u001cì½-C½\u0016Ò6 T¼\\®øb©û;i\u009a´\u009eí\u0087ï\u0010È®¡ÌµôÆ©J]J\u007fß¡×8ðu§?\n\u001a!k«Ùn\tÝ!tGïy3Z\u0010|WÑ?\u000e£uàæ\u0001oõ\u0018MÛ\u0081\u0095\t_(¬ÊÅ¸ÐJ\u008ei\u0000wV¤>\u0005<\u0018\u0007\u0084Óz\u009cìz¡Ü\u0014ÌOÕ\u009f¿õ\u008bû\u009e\u007f\u0096Ð}° \u001ec|û[÷É¨öÑ8À-jQHÏuø\u009c¥Hî\u009e\u001c5\u008bÂ¿mã-\u0018Ä\u001a\u0089à\u009c{¡)mÊA5ú\u0092®)?Z¯\u0087¢´\u0003\u009f\u0010©¨¤|D¥C&9©R,\u009aÖ\u008dd(±áOÅ\u0001\u009bÙ5MS\u0080w\u009cO5E]Y_H,`þí\u0004<\u008eû\r\u009d*=ìÙ~_È%\u0010S(Ñ\u0000$iâ¹\u0099[\u009f¹m\u009aF]è\u00077ô\nþ\u009b^|\u0006Ne\u0088wS\u0093ÿ+\u0083\u0091)Ä\u009b1K\u0018(\u007fQ\u0080\u0097= Ü\u0086Ü\u0005\u0005Gp¢\u0015Vl\u0016\\\u0016\u0001\u009d@¶\u0084x·<è\u000e\u001d6k²÷\u009bPQ\u0089ù\u00103tbÃÂê3£\u0014\u0082H}i\u0090¤\u0082(ÎiQ½DX\u0001pa\u0013\u0012åíÃÇµá\u0003»\u009duJ.éW\n\u008f\u0004ÊP\u0004ÿLjlJúÚfF0\u0015lVÉ\u0094¢F(ï\u008cÿz\u009fÂ¾ÎÆ\u0092\u0004\u0004w\u0017$Ï\u0017\u008ba}\u0007wW\u0083Ç£¶L÷èü8EÅ\u008a¡\u0014\u0085Áà(¤4\u00ad3Ö³(k§\u008a\u0006mù\u0090II¶±Ö\u00adðG\t¤\u0080Éªèpµì7\u0010Y'Jû W\u0086(Ô©d9Sáy¾\u0003sâµ\u008b\u001c D\u001a\u0082\u00168o\u0017\u0085 =X2)'×Ý\u0005¾Sqw`Ë\u0016Â K^TúUyx\u008eD³xM\u008fî\b\n\u0089ª,ZÀ*3RTAøwÜè\u0000ú\u0018øQc\u001aG~¥\u0080ÀöuÜfð»¿ûãÀ\u0090\u0011\"4ê\u0018*\u009eLÜ)¦þÚÝ©\u0098_£ [\u0017\u0019rÄWq\tëj0\b;¸ØÌ\u0017Py\u0016á\rÏÒ\u0084P¯\u000fuâ\u0081z3C)ù DÒÂByø#¼Ë\u0003\u0085N'n\u00ad¬åÞ7ô¶Ù@\u0098\u009dÔú/í\u0090ë\u0005\u0093\u0096©T¦íúÙ\u0082õ\u0085\u0005\u0090Ñ\u008b\u0000$\u001a¯hZJ\u00ad=ßÂr£l\u008bP\u001fùÆÀ,ÔiÂ-¼9\u001d\u000fNLÇc\"\u0016ò\u008cÑ·\bXJ%Ã©leÒTÑ$Q¸\f\u001aï\u009dc0{$\u001bÕ-×\u0014ÀbôÃ¨¤8\u0007\u001c\u0086^I\u0090OæYHêk\u0087±\u000fw\u0099½5IÃ\u0087®7\u0005\u0081b\u008b+\"zoùÄ¦\u001e\r\u0014\u0096\u009aÿ:\u009e\u0017\u009cm\u000f$w&\u008eâm\u008eð¼0\u0001eè\u008e\u008bÏÜßå\u0012\u001a¦D\u0093dþØ\u008cx7\u0099\u0082²2\u0099¸nÙ\u000f\u0016\u008a<É\u000bW\u001dÓpJª|\u009e*Q\u00ad©ñX\u0010\u0088\u008c6röÔp\"Ãôhð·àóÕ8\u001f¶X>2áC\r¬2;\u001e©\u0080\u0094=¯§ÍM/;ÖA\u0013N\u0018\u0090¸;MÄ\u008e\u008bW»\u008cË\bt$¸\u008c\u0000ß]S kn_õ8ÆC\u001aHB\u0011\u0094ØwÔí¤bG»fê·¼\u0095ù\u0097\u0015è©¾\u0003Ü\u0017î\u0013¤\u0013³9h;z¸\u008fÇRáüÏ\u008c\u00158Ê\u0000\u0011\u0082¸»ðôWY\u0002\u001fj·¼\u0080'RcàzÛÙ)\u008e\u0088\u008fJ(`\u0086ÌM\u0013\u00884\u0087ñe\u00058\u0097{\u009c¯fÚÓ\u0080\u0087c;\u0089+þ¤5\u0003N\u001f`(\u0085¶\u0002\u0014b\u0016m\u0010r\u000fï\u0098W\u0004Þ\u0093Û\u000bS\"ÊÍt (¥¥\u0019¤DwÆ\u0081\u0094;\u001be·²ãó\fõ§°í\u0081\u009fÐ\u0083«Þß[\u0000#g\u0093\u008bSh)Ñ*°(%\u001bï\u000b´\u00adÅ3\f\u00976ð0\u0016·\u0004ðð%\u0097\u000e\nYT±#\u0088µÙ\u007f\u0081M\u008b\u001e¬^n¤Þü8\u0014í\u0081S¨\u009bâ\rÃF;X'k\u008a÷\u0093-Ô·\u001b\r.\u0000ç\u008eÎN\u0086DA\u00adJf¼\u0087Ãî\u0000ElePlFr_©á{{\u0081\u0012\\K&\u0018\rßtÊºav¢\u001e\u009d«&yK\u009a»çS¸\u001ag±\u0087-\u0010ç>7\u008e\u0083;ÂPx\tlà¾¨\u0088â(\u001emÔ\t\u000f_\b\f*\u0018K©ÊW \u0096\u0080¼qìôÍ!¥;\u0081,¤Ìë²OÞÂ>\u0019¿\u0010}¼\u0018=M\u007fÖå®ú\u000fTÉ,{èUcmü\u0001sÀ\u009e\u0096Í\u0014(\u0085\u009ay©VîÝÅGýægW/M²ªò£Ö/^-\u0000\u001a\u0087\u009e}P(i*¡©^Pð2I\u001b(\u009bëÛ-i-d m{\u009dÜõ\u0004Ù\u001f:Ñ¤od\u0098D\u0013V¨»¤ÕÄû³\u0006(ÁTWE\u008b3 \u0082Nk\u0093B\bÚ\u009cê6\u0086t¬10ËÅ2Z\u009a|èú?Áè½,rü.\u00860P\u009dñ\boG\u0081ß±\u0000Oì'ì¬\u0003ºû^U,\u00adoÁQ¹\u001f\u009eÃ[[ê\u0016È\u001c$³¤ <¦\u0014Or03Íô8<ô¸EÝ\nÝÀ\\pq\u0003X\u008c}T\u0014t¯\u0016\u0098än\u001c\u0007?JÙÀC\u0013¦\t\trSØL÷\b\u0018é\u0015´d»\b't\u0090ø}â\u0098¯ù eõHØ¼Ó£í !¥çìAé\u0016{\u001eá\u009fëfÅ\u0006\u0099\u0016D\u001ft/\u0010Ö(]sæ,õ{õ\u0096\u009d\u0081ê_TÔé\u0088g\u0087¿9M6<\u00ad\u0080æ3\u0004]Ç?\u0000]'\u0000<\u0095\u001bl\u0097(ö3©\u008aÅÓAt\u009e½¿öW:ç#_w\u008c~ï\u0012âÓ\u008bð\u0081Iözª\u0086\u00809©.Òë\u0015N\u0010»\u0011ÿ?=\r0\u000bÎå¼\u000bôË¹|(PCJÿ}¼éE¶½\u0083\u001ciéwS_£\u0007«\u0002\u0081Ëò°\u0000\u0095ÕÆÏ\u007f;ß\u0014®¿\u009ac3^ I¥rÀzPjø/\u000eªÑþ÷g~\u0086®\u000e\u0093¯IJ\u0097\u0018X[\u000e}kZspùD\u0092\u009d£\u0006 iYÑI\u001fföS(\u0011\u0014ô\u0090\u0081(\u001cg@Ò\u0098©\u0018}Zjz¬x\u0005Ø\u008cÌAÉC\"Þ7è\u008fà÷t£aL©ÏÍQx´-\u0010\u0010v\u0089öÄÖý.Æ\u0003 Ã¼©\nÔ#÷\u00039NK\u008eÈ&èd\u0010rºÝxò¡àÈF\u008cî\u0097ï\u0019D½\u0095va=R¡\u00848\u0015v³\u0014cäÕ\u0005\rDÈL\\Ä\u0015\u001cóûE\u000fNFr+\u0084\u0007)¹GÞ\u0014yå\u0089C[\r¶Î'>sÀH¬\u0083\u0084ij¥\u0084ÂT;ÛV 8Oè\u0006NºÉRÓ\u0091õÈ/\u0012~'çäÊ\u0083\u0093£¡Râ2r´\u0080}Êè";
      int var19 = "/WÚ\\\u009bÝK9\u0085\u000eæ\u009f\u0005\u00ad)\u0014i%\u000bc_ê¯î_]\u0083q·4\u001e( Ì\u00ad_\u0018WñIÜõ\u008e¦åk\\Ïö\u001e\u0000;È-¯¡¦Ï\u0099é\u008bßÅ~°\u0010#ü¨ZÅ\u0006n){â\u0090\u0093\u008fFðê\u0018Õ]\"~î1¿\u00938/wvÙåÐ:\u0005ÔTÞ\u0001\rLC(\u001d(ß¦D¼æ`\u009ai¶í¿Øü\u0003Û#'iVuÙ½ò`\u008cçÜTJHXòv4¶¼[\u008e(ÿÂjãD\u0014\u007f\u000e\u000bû:²â°\u0088\u008fÐïOÏ}\u007f9ûq\u0094Öö@D¬Ï½\u0084½Í52o·(BÉ\fB)Eá\u0015É\u008dqr~3¡ö\u0012TW#äNb\u0088åsË\u0004ª}8g\u0090N>Þ\u0097'¼\u001e(ÏJL5\u0093öB\ríó¬\u0011]ÐÔ<D¨\u00876èß7\u008fÎG1µH\u0099Ê\u001cì½-C½\u0016Ò6 T¼\\®øb©û;i\u009a´\u009eí\u0087ï\u0010È®¡ÌµôÆ©J]J\u007fß¡×8ðu§?\n\u001a!k«Ùn\tÝ!tGïy3Z\u0010|WÑ?\u000e£uàæ\u0001oõ\u0018MÛ\u0081\u0095\t_(¬ÊÅ¸ÐJ\u008ei\u0000wV¤>\u0005<\u0018\u0007\u0084Óz\u009cìz¡Ü\u0014ÌOÕ\u009f¿õ\u008bû\u009e\u007f\u0096Ð}° \u001ec|û[÷É¨öÑ8À-jQHÏuø\u009c¥Hî\u009e\u001c5\u008bÂ¿mã-\u0018Ä\u001a\u0089à\u009c{¡)mÊA5ú\u0092®)?Z¯\u0087¢´\u0003\u009f\u0010©¨¤|D¥C&9©R,\u009aÖ\u008dd(±áOÅ\u0001\u009bÙ5MS\u0080w\u009cO5E]Y_H,`þí\u0004<\u008eû\r\u009d*=ìÙ~_È%\u0010S(Ñ\u0000$iâ¹\u0099[\u009f¹m\u009aF]è\u00077ô\nþ\u009b^|\u0006Ne\u0088wS\u0093ÿ+\u0083\u0091)Ä\u009b1K\u0018(\u007fQ\u0080\u0097= Ü\u0086Ü\u0005\u0005Gp¢\u0015Vl\u0016\\\u0016\u0001\u009d@¶\u0084x·<è\u000e\u001d6k²÷\u009bPQ\u0089ù\u00103tbÃÂê3£\u0014\u0082H}i\u0090¤\u0082(ÎiQ½DX\u0001pa\u0013\u0012åíÃÇµá\u0003»\u009duJ.éW\n\u008f\u0004ÊP\u0004ÿLjlJúÚfF0\u0015lVÉ\u0094¢F(ï\u008cÿz\u009fÂ¾ÎÆ\u0092\u0004\u0004w\u0017$Ï\u0017\u008ba}\u0007wW\u0083Ç£¶L÷èü8EÅ\u008a¡\u0014\u0085Áà(¤4\u00ad3Ö³(k§\u008a\u0006mù\u0090II¶±Ö\u00adðG\t¤\u0080Éªèpµì7\u0010Y'Jû W\u0086(Ô©d9Sáy¾\u0003sâµ\u008b\u001c D\u001a\u0082\u00168o\u0017\u0085 =X2)'×Ý\u0005¾Sqw`Ë\u0016Â K^TúUyx\u008eD³xM\u008fî\b\n\u0089ª,ZÀ*3RTAøwÜè\u0000ú\u0018øQc\u001aG~¥\u0080ÀöuÜfð»¿ûãÀ\u0090\u0011\"4ê\u0018*\u009eLÜ)¦þÚÝ©\u0098_£ [\u0017\u0019rÄWq\tëj0\b;¸ØÌ\u0017Py\u0016á\rÏÒ\u0084P¯\u000fuâ\u0081z3C)ù DÒÂByø#¼Ë\u0003\u0085N'n\u00ad¬åÞ7ô¶Ù@\u0098\u009dÔú/í\u0090ë\u0005\u0093\u0096©T¦íúÙ\u0082õ\u0085\u0005\u0090Ñ\u008b\u0000$\u001a¯hZJ\u00ad=ßÂr£l\u008bP\u001fùÆÀ,ÔiÂ-¼9\u001d\u000fNLÇc\"\u0016ò\u008cÑ·\bXJ%Ã©leÒTÑ$Q¸\f\u001aï\u009dc0{$\u001bÕ-×\u0014ÀbôÃ¨¤8\u0007\u001c\u0086^I\u0090OæYHêk\u0087±\u000fw\u0099½5IÃ\u0087®7\u0005\u0081b\u008b+\"zoùÄ¦\u001e\r\u0014\u0096\u009aÿ:\u009e\u0017\u009cm\u000f$w&\u008eâm\u008eð¼0\u0001eè\u008e\u008bÏÜßå\u0012\u001a¦D\u0093dþØ\u008cx7\u0099\u0082²2\u0099¸nÙ\u000f\u0016\u008a<É\u000bW\u001dÓpJª|\u009e*Q\u00ad©ñX\u0010\u0088\u008c6röÔp\"Ãôhð·àóÕ8\u001f¶X>2áC\r¬2;\u001e©\u0080\u0094=¯§ÍM/;ÖA\u0013N\u0018\u0090¸;MÄ\u008e\u008bW»\u008cË\bt$¸\u008c\u0000ß]S kn_õ8ÆC\u001aHB\u0011\u0094ØwÔí¤bG»fê·¼\u0095ù\u0097\u0015è©¾\u0003Ü\u0017î\u0013¤\u0013³9h;z¸\u008fÇRáüÏ\u008c\u00158Ê\u0000\u0011\u0082¸»ðôWY\u0002\u001fj·¼\u0080'RcàzÛÙ)\u008e\u0088\u008fJ(`\u0086ÌM\u0013\u00884\u0087ñe\u00058\u0097{\u009c¯fÚÓ\u0080\u0087c;\u0089+þ¤5\u0003N\u001f`(\u0085¶\u0002\u0014b\u0016m\u0010r\u000fï\u0098W\u0004Þ\u0093Û\u000bS\"ÊÍt (¥¥\u0019¤DwÆ\u0081\u0094;\u001be·²ãó\fõ§°í\u0081\u009fÐ\u0083«Þß[\u0000#g\u0093\u008bSh)Ñ*°(%\u001bï\u000b´\u00adÅ3\f\u00976ð0\u0016·\u0004ðð%\u0097\u000e\nYT±#\u0088µÙ\u007f\u0081M\u008b\u001e¬^n¤Þü8\u0014í\u0081S¨\u009bâ\rÃF;X'k\u008a÷\u0093-Ô·\u001b\r.\u0000ç\u008eÎN\u0086DA\u00adJf¼\u0087Ãî\u0000ElePlFr_©á{{\u0081\u0012\\K&\u0018\rßtÊºav¢\u001e\u009d«&yK\u009a»çS¸\u001ag±\u0087-\u0010ç>7\u008e\u0083;ÂPx\tlà¾¨\u0088â(\u001emÔ\t\u000f_\b\f*\u0018K©ÊW \u0096\u0080¼qìôÍ!¥;\u0081,¤Ìë²OÞÂ>\u0019¿\u0010}¼\u0018=M\u007fÖå®ú\u000fTÉ,{èUcmü\u0001sÀ\u009e\u0096Í\u0014(\u0085\u009ay©VîÝÅGýægW/M²ªò£Ö/^-\u0000\u001a\u0087\u009e}P(i*¡©^Pð2I\u001b(\u009bëÛ-i-d m{\u009dÜõ\u0004Ù\u001f:Ñ¤od\u0098D\u0013V¨»¤ÕÄû³\u0006(ÁTWE\u008b3 \u0082Nk\u0093B\bÚ\u009cê6\u0086t¬10ËÅ2Z\u009a|èú?Áè½,rü.\u00860P\u009dñ\boG\u0081ß±\u0000Oì'ì¬\u0003ºû^U,\u00adoÁQ¹\u001f\u009eÃ[[ê\u0016È\u001c$³¤ <¦\u0014Or03Íô8<ô¸EÝ\nÝÀ\\pq\u0003X\u008c}T\u0014t¯\u0016\u0098än\u001c\u0007?JÙÀC\u0013¦\t\trSØL÷\b\u0018é\u0015´d»\b't\u0090ø}â\u0098¯ù eõHØ¼Ó£í !¥çìAé\u0016{\u001eá\u009fëfÅ\u0006\u0099\u0016D\u001ft/\u0010Ö(]sæ,õ{õ\u0096\u009d\u0081ê_TÔé\u0088g\u0087¿9M6<\u00ad\u0080æ3\u0004]Ç?\u0000]'\u0000<\u0095\u001bl\u0097(ö3©\u008aÅÓAt\u009e½¿öW:ç#_w\u008c~ï\u0012âÓ\u008bð\u0081Iözª\u0086\u00809©.Òë\u0015N\u0010»\u0011ÿ?=\r0\u000bÎå¼\u000bôË¹|(PCJÿ}¼éE¶½\u0083\u001ciéwS_£\u0007«\u0002\u0081Ëò°\u0000\u0095ÕÆÏ\u007f;ß\u0014®¿\u009ac3^ I¥rÀzPjø/\u000eªÑþ÷g~\u0086®\u000e\u0093¯IJ\u0097\u0018X[\u000e}kZspùD\u0092\u009d£\u0006 iYÑI\u001fföS(\u0011\u0014ô\u0090\u0081(\u001cg@Ò\u0098©\u0018}Zjz¬x\u0005Ø\u008cÌAÉC\"Þ7è\u008fà÷t£aL©ÏÍQx´-\u0010\u0010v\u0089öÄÖý.Æ\u0003 Ã¼©\nÔ#÷\u00039NK\u008eÈ&èd\u0010rºÝxò¡àÈF\u008cî\u0097ï\u0019D½\u0095va=R¡\u00848\u0015v³\u0014cäÕ\u0005\rDÈL\\Ä\u0015\u001cóûE\u000fNFr+\u0084\u0007)¹GÞ\u0014yå\u0089C[\r¶Î'>sÀH¬\u0083\u0084ij¥\u0084ÂT;ÛV 8Oè\u0006NºÉRÓ\u0091õÈ/\u0012~'çäÊ\u0083\u0093£¡Râ2r´\u0080}Êè"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var35 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var35;
         if ((var15 += var16) >= var19) {
            var17 = "k\u0088\u008dãV÷g±ð\u008eýH\u0089{\u0013.K}\u009eà)(\u0094g\u0010GBH]+\u0019õ\u0089\u0095®\u0080Ë3¾%u";
            var19 = "k\u0088\u008dãV÷g±ð\u008eýH\u0089{\u0013.K}\u009eà)(\u0094g\u0010GBH]+\u0019õ\u0089\u0095®\u0080Ë3¾%u".length();
            var16 = '\u0018';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var37 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var21).intern();
               int var31 = 0;
               var20[var18++] = var37;
               if ((var15 += var16) >= var19) {
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var20;
                  IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new String[57];
                  llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "4K\u00ad\u001fÍ\u0014k\u0006\feÐ\"\u0087*(:òÔU¢\u009f\u008f\u0097\r";
                  int var5 = "4K\u00ad\u001fÍ\u0014k\u0006\feÐ\"\u0087*(:òÔU¢\u009f\u008f\u0097\r".length();
                  byte var2 = 0;

                  do {
                     var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     var31 = var3++;
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
                     byte var41 = -1;
                     var6[var31] = var10004;
                  } while (var2 < var5);

                  IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var6;
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new Long[3];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new AutoMaddox.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new AutoMaddox();
                  return;
               }

               var16 = var17.charAt(var15);
            }
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25918;
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
               "me/octo/client/modules/impl/features/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10
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
            "me/octo/client/modules/impl/features/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26098;
      if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var3] == null) {
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
         long var5 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var3];
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
         Object[] var9 = (Object[])llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var14
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
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var3] = var15;
      }

      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var3];
   }

   private static long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/features/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
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
