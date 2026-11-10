package me.octo.client.modules.impl.macros;

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
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.helpers.general.Scheduler;
import me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll
   extends me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private final BlockPos lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @Nullable
   private BlockPos IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   @NotNull
   private final me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private boolean llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   @NotNull
   private static lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static long IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = 59600392174825L;
   private static String[] lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private static String[] IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static Map lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new HashMap(13);
   private static long[] lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private static Long[] IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private static Map lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;

   public lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll() {
      long var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ 757527862798L;
      ModuleCategory var10003 = ModuleCategory.MACROS;
      Setting[] var3 = new Setting[]{
         IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super(
         "Sludge Macro",
         "Grinds powder in the Crystal Hollows, specifically in the Jungle to take advantage of the jungle pickaxe ability.",
         var10003,
         "Crystal Hollows",
         null,
         null,
         false,
         var3,
         112,
         null
      );
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new BlockPos(448, 122, 458);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
   }

   @Override
   public boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return true;
   }

   @Override
   protected void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 38666634225439L;
      long var5 = var1 ^ 26927438315355L;
      long var7 = var1 ^ 111107483102632L;
      long var9 = var1 ^ 2053096687982L;
      long var11 = (var1 ^ 38864157951580L) >>> 16;
      int var13 = (int)((var1 ^ 38864157951580L) << 48 >>> 48);
      long var10001 = var1 ^ 86748082985512L;
      int var14 = (int)((var1 ^ 86748082985512L) >>> 32);
      int var15 = (int)((var1 ^ 86748082985512L) << 32 >>> 48);
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var1 ^ 63281748963705L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"u">(26564, 5726241486497585990L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.TRAVEL,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"v">(9269, 8408128397269955122L ^ var1),
         false,
         false,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 5133408026609L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 75325711128234L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 118489385541298L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"u">(28809, 1240986666765149558L ^ var2)
                  );
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var4, var1
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 138685997420745L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3x = 1; var3x < 8; var3x++) {
                     var10003[var3x] = (byte)(var0 << var3x * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9x = new String[3];
                  int var7x = 0;
                  String var6 = "ß´\u001c\u008bT_\u0095|c('¸4\nÎ¬(\u009c#\u0014\f´lø\u0084Ð\u0087v\u0007Ò\u0084>\u0015 Ëª×Ç\u001aú\u009d\t]aþ\u0017H¤ÈÑ\u00adõ\u008d\tY8\u009eÐ®\u0000ä\u0087Åä~#\u008e\u007f;½¿ \u0005Ãæ7¹n %«\u0094Ó\"3ö\u009e\u001f×i*j\u008c\u0093\u0090ÞB8S´\u0012Á&µ©Ðë7zd\b\u008d\bmbÃïÓÚUÛÏ~çHÌéÈáð^U{nþ\u001f¥\"ð»9§\u0087þ¦\u0091\u0001\u0087\u008d\u0016w8\u0087\u008dÛq_\u0010tÆ\u0018øÃ\u008b`B\u000eå3\\ä\u008aNmqß¾\u0090\u0086ÕÓD¿(ðþÕ·>p\"ÊvÁ¥ÃI\u0086Òì\u0013¼úÉªd\u008b\u0002ôBÝd\u001bÙ9DR°¹\u009c*õ¹\u0019ailÞBpq%§ñ\u009cïH/¦2¦m\u008fÕýbØÇÝBÄ\u00958Pú\u0005H\u007f\u0019`\u001búþ\u0089¯\u0093";
                  int var8 = "ß´\u001c\u008bT_\u0095|c('¸4\nÎ¬(\u009c#\u0014\f´lø\u0084Ð\u0087v\u0007Ò\u0084>\u0015 Ëª×Ç\u001aú\u009d\t]aþ\u0017H¤ÈÑ\u00adõ\u008d\tY8\u009eÐ®\u0000ä\u0087Åä~#\u008e\u007f;½¿ \u0005Ãæ7¹n %«\u0094Ó\"3ö\u009e\u001f×i*j\u008c\u0093\u0090ÞB8S´\u0012Á&µ©Ðë7zd\b\u008d\bmbÃïÓÚUÛÏ~çHÌéÈáð^U{nþ\u001f¥\"ð»9§\u0087þ¦\u0091\u0001\u0087\u008d\u0016w8\u0087\u008dÛq_\u0010tÆ\u0018øÃ\u008b`B\u000eå3\\ä\u008aNmqß¾\u0090\u0086ÕÓD¿(ðþÕ·>p\"ÊvÁ¥ÃI\u0086Òì\u0013¼úÉªd\u008b\u0002ôBÝd\u001bÙ9DR°¹\u009c*õ¹\u0019ailÞBpq%§ñ\u009cïH/¦2¦m\u008fÕýbØÇÝBÄ\u00958Pú\u0005H\u007f\u0019`\u001búþ\u0089¯\u0093"
                     .length();
                  char var5x = 16;
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5x).getBytes("ISO-8859-1"));
                     String var13x = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001x = -1;
                     var9x[var7x++] = var13x;
                     if ((var4 += var5x) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9x;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5x = var6.charAt(var4);
                  }
               }

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
                  int var1x = 0;
                  int var2;
                  char[] var3x = new char[var2 = var0.length];

                  for (int var4 = 0; var4 < var2; var4++) {
                     int var5x;
                     if ((var5x = 255 & var0[var4]) < 192) {
                        var3x[var1x++] = (char)var5x;
                     } else if (var5x < 224) {
                        char var6 = (char)((char)(var5x & 31) << 6);
                        byte var8 = var0[++var4];
                        var6 = (char)(var6 | (char)(var8 & 63));
                        var3x[var1x++] = var6;
                     } else if (var4 < var2 - 2) {
                        char var12 = (char)((char)(var5x & 15) << '\f');
                        byte var9x = var0[++var4];
                        var12 = (char)(var12 | (char)(var9x & 63) << 6);
                        var9x = var0[++var4];
                        var12 = (char)(var12 | (char)(var9x & 63));
                        var3x[var1x++] = var12;
                     }
                  }

                  return new String(var3x, 0, var1x);
               }

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1x) {
                  int var5x = var0 ^ (int)(var1x & 32767L) ^ 10044;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x] == null) {
                     Object[] var4;
                     try {
                        Long var3x = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3x);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3x, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
                           var10
                        );
                     }

                     byte[] var6 = new byte[8];
                     var6[0] = (byte)(var1x >>> 56);

                     for (int var7x = 1; var7x < 8; var7x++) {
                        var6[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                     }

                     DESKeySpec var11x = new DESKeySpec(var6);
                     SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11x);
                     ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
                     byte[] var9x = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5x].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9x)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x];
               }

               private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, MutableCallSite var1x, String var2, Object[] var3x
               ) {
                  int var4 = (Integer)var3x[0];
                  long var5x = (Long)var3x[1];
                  String var7x = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5x);
                  MethodHandle var8 = MethodHandles.constant(String.class, var7x);
                  var1x.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                  return var7x;
               }

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1x, MethodType var2
               ) {
                  MutableCallSite var3x = new MutableCallSite(var2);

                  try {
                     var3x.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
                              0,
                              var0,
                              var3x,
                              var1x
                           ),
                           var2
                        )
                     );
                     return var3x;
                  } catch (Exception var5x) {
                     throw new RuntimeException(
                        "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                           + " : "
                           + var1x
                           + " : "
                           + var2.toString(),
                        var5x
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0e35d4efcd35b4bc(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 114023733955890L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 118489385541298L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a2cc71f395088865(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var4, p0Arg
                  );
               }
            }
         ),
         48,
         null,
         var3
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2030c455b41fd429(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"u">(10966, 1356742945416369750L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.COMMAND,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"v">(6750, 8084714650758007896L ^ var1),
         0L,
         true,
         false,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 64858274196731L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 94752030742674L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  long var1, int var3x, me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var4
               ) {
                  long var5x = (var1 << 32 | (long)var3x << 32 >>> 32) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7x = var5x ^ 75797680109721L;
                  Intrinsics.checkNotNullParameter(
                     var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(9530, 8582403080223804126L ^ var5x)
                  );
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var7x, var4
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 85026259479469L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6 = "Û\u0092Úê¨ÝÜ1¹\u0010YmB\u0014¯6Q\r´u\"47Íwáô\u0095+\u0004J\u00026·+X\u0015®Ü\u0082\u0010\u007f´\u000f\u0007\" Ù÷(å\u009cá\u0085\nßèØîí¹Æ%Kb\u0081T2W\u000e\u0081\u0018k\u0090i+\u0006É\u0095æ¼\u0002#\u0099\u008f\u009dDÃª'ÛÌ\u0083tTâ¹ô÷ò±ôÎNøEq§´ç`¥-\u00163/>Òª\u0002Ï\b\u001c\u000fb6³R[¼¹m7Þ\u0014\u008cl\u0086ÀTÓZ©â¥V¦\u008fÒÂîÈ9ÔÝv\u0003\u0087òº\u007f3M\u001a\u0016#yi\u0005¶ÊÊi|ý\u008c¾§\u0002øÔG>ÅodÊ\u009fJòºOW\u0006IîÜ\u0013êÀÓ×ÕLÐ\u0096¬åÞaÓK\u000e9v\u008ei¸\u0002U\u008c\u009b\u001a§%^T¸¥?^àÙ\u00101\u0081â\u001cAÚ\u0012ãÞµba.\u0083ùå\u008e4,\u0091Âx(\u001aÉëüð\u001fµÁs¬d\u000f\u00967\u0091¡t";
                  int var8 = "Û\u0092Úê¨ÝÜ1¹\u0010YmB\u0014¯6Q\r´u\"47Íwáô\u0095+\u0004J\u00026·+X\u0015®Ü\u0082\u0010\u007f´\u000f\u0007\" Ù÷(å\u009cá\u0085\nßèØîí¹Æ%Kb\u0081T2W\u000e\u0081\u0018k\u0090i+\u0006É\u0095æ¼\u0002#\u0099\u008f\u009dDÃª'ÛÌ\u0083tTâ¹ô÷ò±ôÎNøEq§´ç`¥-\u00163/>Òª\u0002Ï\b\u001c\u000fb6³R[¼¹m7Þ\u0014\u008cl\u0086ÀTÓZ©â¥V¦\u008fÒÂîÈ9ÔÝv\u0003\u0087òº\u007f3M\u001a\u0016#yi\u0005¶ÊÊi|ý\u008c¾§\u0002øÔG>ÅodÊ\u009fJòºOW\u0006IîÜ\u0013êÀÓ×ÕLÐ\u0096¬åÞaÓK\u000e9v\u008ei¸\u0002U\u008c\u009b\u001a§%^T¸¥?^àÙ\u00101\u0081â\u001cAÚ\u0012ãÞµba.\u0083ùå\u008e4,\u0091Âx(\u001aÉëüð\u001fµÁs¬d\u000f\u00967\u0091¡t"
                     .length();
                  char var5 = '(';
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5 = var6.charAt(var4);
                  }
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 31501;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
                           var10
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
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                        "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a0123cd48f789489(
                  long var1, int var3x, me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var4
               ) {
                  var1 = 30416L;
                  long var5x = (var1 << 32 | (long)var3x << 32 >>> 32) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7x = var5x ^ 75797680109721L;
                  Intrinsics.checkNotNullParameter(
                     var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(9530, 8582403080223804126L ^ var5x)
                  );
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var7x, var4
                  );
               }
            }
         ),
         var5,
         40,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2030c455b41fd429(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"u">(5534, 6775087625465129237L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MOVE,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"v">(15110, 6840833250500308226L ^ var1),
         0L,
         false,
         false,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 40724463151353L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 41793317745030L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  short var1,
                  int var2,
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3x,
                  short var4
               ) {
                  long var5x = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7x = var5x ^ 42441959126633L;
                  Intrinsics.checkNotNullParameter(
                     var3x, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(30641, 7377272678092159199L ^ var5x)
                  );
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var7x, var3x
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 97378931371059L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6 = " ?\u0003;<ºÒâUOÇ[£Î\u009eR(\u009c>³5\u0000wn`YGD]ç`×ðÄ6\u0016\u009aØ=çH\u001cò\u0090\f\u009aâ#\u009fÉd¡¡4\u008d \nØ5ÃÇÝ\u000e\u0010ËpÅÀzXÑ\u009e~pÖÄMÂM«¬ÕIU\u0001ITU\u0087k\u001c9\u0016\u007f¦¶â¬Ë\u0094\u0092]\u0005N\u0085²%q\u0006*\u0005t\r´\u0092$\u008bÙr\u0087\u001b\u0081¡wºæÜ-\u008f\u001a,C\u0011xb5Ùô\u0093Ï\u0084D`\u000fús£?aK}ä«[qÚ £\u0083\u0089\u000eH>\u007f¢§Î±'±KÎ\u0085c\u009c>\t§\u009b\u0087»\u008bQ¡\u0091æ\u0084\r\u0094°\u0088 ó<\u009eo¤ø\u0085µäÚ÷ÞU¸q\u009f¹!ÄSY©w\u0015IG°ï!'\u0099t.1§\u001b#C+\u008c·(¿U\u00ada\u0083>´?¯\u000e\\ëåX|l*i\f)ä\u0097®Ák)¯M* P\u008dû\u0006T¶s\u008d\u008dA";
                  int var8 = " ?\u0003;<ºÒâUOÇ[£Î\u009eR(\u009c>³5\u0000wn`YGD]ç`×ðÄ6\u0016\u009aØ=çH\u001cò\u0090\f\u009aâ#\u009fÉd¡¡4\u008d \nØ5ÃÇÝ\u000e\u0010ËpÅÀzXÑ\u009e~pÖÄMÂM«¬ÕIU\u0001ITU\u0087k\u001c9\u0016\u007f¦¶â¬Ë\u0094\u0092]\u0005N\u0085²%q\u0006*\u0005t\r´\u0092$\u008bÙr\u0087\u001b\u0081¡wºæÜ-\u008f\u001a,C\u0011xb5Ùô\u0093Ï\u0084D`\u000fús£?aK}ä«[qÚ £\u0083\u0089\u000eH>\u007f¢§Î±'±KÎ\u0085c\u009c>\t§\u009b\u0087»\u008bQ¡\u0091æ\u0084\r\u0094°\u0088 ó<\u009eo¤ø\u0085µäÚ÷ÞU¸q\u009f¹!ÄSY©w\u0015IG°ï!'\u0099t.1§\u001b#C+\u008c·(¿U\u00ada\u0083>´?¯\u000e\\ëåX|l*i\f)ä\u0097®Ák)¯M* P\u008dû\u0006T¶s\u008d\u008dA"
                     .length();
                  char var5 = 16;
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5 = var6.charAt(var4);
                  }
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 21878;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll",
                           var10
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
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                        "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }
            }
         ),
         var5,
         56,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3fec560eef4040e(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"u">(4923, 47742599971532721L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"v">(21666, 7842761807674835616L ^ var1),
         0L,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll,
         false,
         false,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 85877440053216L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 68521581530947L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 39634393074904L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25666, 4635362822876544130L ^ var2)
                  );
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var4, var1
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 127987235893685L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6 = "u\u0011[^³Â\u008cÜc\u0007{\u009fÄ°\u0004\u008dùì\u008bì%[?) Ý\u0011ø\u0001$=ó3©¹iÕpÆµz²\u0085?\u0095\u0084A\bî\u0087\u0018ÂÚP ó¨ö\u007f#\u000b\u0089ª\u0097\u0007O\u001b\u008aÑÜË.Ît'@\u0011½&h¯\u0086¥£âÊÈOA®ü\u009d\u0088`\u001añ\u0018\u009a¢QbÎÀHÚùÍû\u000bk\u0002îí7vré0!ÛÉ\u0086_\u001b\u0098¥<¿<4Æ\rþ\u0012\b[NûÈD\u009bÔæ¼¢K\u000b\u0089ðµD\u00123\u0093JXÊ\u009cÖàb\u009f?Æ½¹Â¥cÖ\u0005;$F\u0086*\u0089\u008dõd\u009f\u008e\u0096\u0004EeS×\u007f\u0087!à\u0010\u008b\u0011ýmõ\u0084Ãh¶\f/©çqs (\u0000tÊ \u0011\u0093I_Ï ;\ræ»V>ó\u009câ\u001aSgòÕçºï,×\f)Rv%\u008aIÂ#J5";
                  int var8 = "u\u0011[^³Â\u008cÜc\u0007{\u009fÄ°\u0004\u008dùì\u008bì%[?) Ý\u0011ø\u0001$=ó3©¹iÕpÆµz²\u0085?\u0095\u0084A\bî\u0087\u0018ÂÚP ó¨ö\u007f#\u000b\u0089ª\u0097\u0007O\u001b\u008aÑÜË.Ît'@\u0011½&h¯\u0086¥£âÊÈOA®ü\u009d\u0088`\u001añ\u0018\u009a¢QbÎÀHÚùÍû\u000bk\u0002îí7vré0!ÛÉ\u0086_\u001b\u0098¥<¿<4Æ\rþ\u0012\b[NûÈD\u009bÔæ¼¢K\u000b\u0089ðµD\u00123\u0093JXÊ\u009cÖàb\u009f?Æ½¹Â¥cÖ\u0005;$F\u0086*\u0089\u008dõd\u009f\u008e\u0096\u0004EeS×\u007f\u0087!à\u0010\u008b\u0011ýmõ\u0084Ãh¶\f/©çqs (\u0000tÊ \u0011\u0093I_Ï ;\ræ»V>ó\u009câ\u001aSgòÕçºï,×\f)Rv%\u008aIÂ#J5"
                     .length();
                  char var5 = 192;
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5 = var6.charAt(var4);
                  }
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 30824;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
                           var10
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
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                        "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$e3343010586298e2(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 108619803123529L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 39634393074904L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a2cc71f395088865(
                     (lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll)this.receiver, var4, p0Arg
                  );
               }
            }
         ),
         var11,
         104,
         (char)var13,
         null
      );
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ChestBackgroundDrawnEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(long var1) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var10001 = var1 ^ 44595506025019L;
      int var3 = (int)((var1 ^ 44595506025019L) >>> 48);
      int var4 = (int)((var1 ^ 44595506025019L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (char)var3,
         var4,
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
         (short)var5
      );
   }

   private final void IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(long var1) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var10001 = var1 ^ 104885757576424L;
      int var3 = (int)((var1 ^ 104885757576424L) >>> 48);
      int var4 = (int)((var1 ^ 104885757576424L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (char)var3, var4, this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl, (short)var5
      );
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param1, int param2, BlockPos param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll(long var1) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var3 = var1 ^ 100696017570811L;
      long var5 = var1 ^ 65758718503693L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         var3
      );
      this.lIIlIlIIllIlIIlllllIllIlIlIIllllIllIIIlIllIlIIlIlIlIllIlllIlIIIllIIlIlIIlIlIllllIIlll(var5);
   }

   private final void llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl(long var1) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var3 = var1 ^ 28109937476190L;
      long var5 = var1 ^ 49218579995391L;
      long var7 = var1 ^ 84216468421129L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.COMMAND,
         var5
      );
      this.lIIlIlIIllIlIIlllllIllIlIlIIllllIllIIIlIllIlIIlIlIlIllIlllIlIIIllIIlIlIIlIlIllllIIlll(var7);
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = false;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, int var2, int var3, char var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48)
         ^ IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      int var7 = (int)((var5 ^ 114084799465964L) >>> 48);
      long var8 = (var5 ^ 114084799465964L) << 16 >>> 16;
      long var10001 = var5 ^ 55167151936633L;
      int var10 = (int)((var5 ^ 55167151936633L) >>> 32);
      int var11 = (int)((var5 ^ 55167151936633L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var5 ^ 44092730068617L;

      me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000;
      me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10003;
      label17: {
         try {
            var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
            var17 = new me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
            var10002 = var17;
            if (IIllIIIIIlIIlIlIlIIlllIIlIlIIIIlIlIIIIllIlIllIllllIlllIllIllIlIlIlIIIlIIIIIIllIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
               .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll()) {
               var10003 = me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.CRYSTAL_NUCLEUS;
               break label17;
            }
         } catch (MatchException var16) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var16, -6909248407492944418L, var5
            );
         }

         var10003 = me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.CRYSTAL_HOLLOWS;
      }

      var10002./* $VF: Unable to resugar constructor */<init>(
         var10003,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII,
         var1.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI,
         120,
         null
      );
      me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var15 = var17;
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, (short)var11, var15, (short)var12);
   }

   private final void lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(long var1) {
      return this.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll()
         == me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE;
   }

   @Override
   public void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(char var1, int var2, int var3) {
   }

   private static final long IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var2
   ) {
      var0 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var0;
      return var2.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll()
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
         + IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"v">(29908, 1821998095842800528L ^ var0);
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var0
   ) {
      return TuplesKt.to(
         var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll().getLocation(),
         me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
      );
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      int var0, lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var1, char var2, char var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var6 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         6032172379649036933L, var4
      );

      String var9;
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10000;
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10001;
      boolean var10002;
      label22: {
         label21: {
            try {
               var10000 = new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll;
               var10001 = var10000;
               var10002 = var1.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
               Screen var10003 = var1.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().screen;
               if (var10003 == null) {
                  break label21;
               }

               var8 = var10003.getTitle();
               if (var8 == null) {
                  break label21;
               }
            } catch (MatchException var7) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var7, 5918706592674803680L, var4
               );
            }

            var9 = var8.getString();
            if (var6 != null) {
               break label22;
            }
         }

         var9 = null;
      }

      var10001./* $VF: Unable to resugar constructor */<init>(
         var10002,
         var9,
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
      );
      return var10000;
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long var0, lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var2
   ) {
      var0 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var0;
      long var3 = var0 ^ 136553929617224L;
      return new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         var2.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll,
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, 0.0, 1, var3, null
         )
      );
   }

   private static final boolean IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll() {
      return me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
   }

   private static final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var0, long var1
   ) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var3 = var1 ^ 75188104599391L;
      return new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(),
         me.octo.client.utils.skyblock.mining.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(),
         me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var0, 0.0, 1, var3, null
         )
      );
   }

   private static final Unit IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var0, short var1, long var2
   ) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
      long var6 = var4 ^ 8935443099959L;
      var0.lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI(var6);
      return Unit.INSTANCE;
   }

   private static final Unit IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var0, long var1
   ) {
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var3 = var1 ^ 17300240406276L;
      var0.lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII(var3);
      return Unit.INSTANCE;
   }

   private static final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
      long param0, lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean lIIlIIllIIllIlIllIIlIIlIIIIIlIlIlIIlIlIIIIIIllIllIIIlIIllllIlllllIllIlllIlIlIllIllIII(long var0) {
      var0 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var0;
      long var2 = var0 ^ 110677310607793L;
      return Scheduler.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var2);
   }

   private static final boolean lllllIIlIIlIlllIIlllIlIlIlIIIlIIIlIlIllIIlIlIIlllIIllllIIllIlIllIlIlIIIIIllllIllIIlII(long var0) {
      var0 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var0;
      long var2 = var0 ^ 48861132023408L;
      return me.octo.client.modules.helpers.general.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
   }

   private static final boolean IlIlIIlIlllIIlIllIIlIlIlIllllllIlllIllIlIlIllIlIlIIlIIIllllllIlIllIllIIIIIlIlIIIllIlI(long var0) {
      var0 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var0;
      long var2 = var0 ^ 891682820484L;
      return me.octo.client.modules.helpers.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
   }

   static {
      long var11 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ 35522706525958L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[13];
      int var18 = 0;
      String var17 = "ÌÍâ+º\u0017ø\u0013©Ë\u009a·\u0007C(/\u0006\u0088Ì:nuyã \u0002g\u008dà\"Áqc*ªÂô\u001eãdß\u001cú×\u00003;z\u001c(T\u0011\"º¿3Ç \u008d\u0096É³ø\níÇâ´\u0015¥Ë6n·\u00ad1w»\u0090s¼{¢W\u009aQè7&\u0096 \u00184=\u0016~Ð\u0091)²$%\u008e_\u009eÖËãC²B`1\n\u0083¦>ã0¼ 3\u001a\u0010æ¡pHi\u0000?5\u0092\u0096V0ÀP8L°S>\u008aAä_³\u0080}3\u0080H5û\u001fW«»>#1>Ò\u0080\tÎ0+ßG]1\u000b½Eøâ¶ï[S×ñÏêµ5;\u008fÜÀ3£êá\u009fµfø«äÝ\u001f\u0082X.\u0082b\u0010nå\u009a\u008e?\u0013\u009f¼¦Sñ)\u000e\u0087ä\u000f¯ãÛ¦¬}\u0019W\u0082d~Hy\u001eÂ\u0014£\u0012£(°b§þ\u0081¾W\u0088)ì\u0089ëp\u001a\u009c·Q\u001f<í\u0089Óøm\u000f\u009a×©\u0019ZæöÖÒ¬\\\u0001½\u0099\u008aj;S\u0001'I\u001f}b¼»t\u0005jÀ\u00808²\u0096Jô+8\u0085ÓïðI)¹o\u0010§æÃ\u0093\u0083·\u0007\u009f\u0002gù^²\u0005\u0089\u0094\u0010(Y[\u0017zì\u001a\u0087Ê\u0013Ý\u009dÈ{\u0099\u0095\u0018£\u0096\u0001\u0012\u0087\nýT¡+t<¢S°ÉQk\u0094-JéNO {+ô;c\u0004ÂmT\u001d\u0083G\u0015\u000fJ\bªá.ÄÐ7¨@¯§,jQ\u0095¬\u0098 À\u0010<\u0085K]\u0089 Ëg_åKè\u0017\u007fQZ?ùÄ[\u009e\u001er\u001cHo\u0005ëh§";
      int var19 = "ÌÍâ+º\u0017ø\u0013©Ë\u009a·\u0007C(/\u0006\u0088Ì:nuyã \u0002g\u008dà\"Áqc*ªÂô\u001eãdß\u001cú×\u00003;z\u001c(T\u0011\"º¿3Ç \u008d\u0096É³ø\níÇâ´\u0015¥Ë6n·\u00ad1w»\u0090s¼{¢W\u009aQè7&\u0096 \u00184=\u0016~Ð\u0091)²$%\u008e_\u009eÖËãC²B`1\n\u0083¦>ã0¼ 3\u001a\u0010æ¡pHi\u0000?5\u0092\u0096V0ÀP8L°S>\u008aAä_³\u0080}3\u0080H5û\u001fW«»>#1>Ò\u0080\tÎ0+ßG]1\u000b½Eøâ¶ï[S×ñÏêµ5;\u008fÜÀ3£êá\u009fµfø«äÝ\u001f\u0082X.\u0082b\u0010nå\u009a\u008e?\u0013\u009f¼¦Sñ)\u000e\u0087ä\u000f¯ãÛ¦¬}\u0019W\u0082d~Hy\u001eÂ\u0014£\u0012£(°b§þ\u0081¾W\u0088)ì\u0089ëp\u001a\u009c·Q\u001f<í\u0089Óøm\u000f\u009a×©\u0019ZæöÖÒ¬\\\u0001½\u0099\u008aj;S\u0001'I\u001f}b¼»t\u0005jÀ\u00808²\u0096Jô+8\u0085ÓïðI)¹o\u0010§æÃ\u0093\u0083·\u0007\u009f\u0002gù^²\u0005\u0089\u0094\u0010(Y[\u0017zì\u001a\u0087Ê\u0013Ý\u009dÈ{\u0099\u0095\u0018£\u0096\u0001\u0012\u0087\nýT¡+t<¢S°ÉQk\u0094-JéNO {+ô;c\u0004ÂmT\u001d\u0083G\u0015\u000fJ\bªá.ÄÐ7¨@¯§,jQ\u0095¬\u0098 À\u0010<\u0085K]\u0089 Ëg_åKè\u0017\u007fQZ?ùÄ[\u009e\u001er\u001cHo\u0005ëh§"
         .length();
      char var16 = '\u0018';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var43 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var43;
         if ((var15 += var16) >= var19) {
            var17 = "'ÎííÁ0Û\u0080\u0097g¥ø¦/Ä\u0096\u0005Ôa°Æ÷¼\u0095Ìm\u009dÂ½À÷\u0088\u0010\\}åtøûy? ¯ª\u0099\u000b@N\u0017";
            var19 = "'ÎííÁ0Û\u0080\u0097g¥ø¦/Ä\u0096\u0005Ôa°Æ÷¼\u0095Ìm\u009dÂ½À÷\u0088\u0010\\}åtøûy? ¯ª\u0099\u000b@N\u0017".length();
            var16 = ' ';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var45 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var21).intern();
               int var37 = 0;
               var20[var18++] = var45;
               if ((var15 += var16) >= var19) {
                  lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = var20;
                  IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new String[13];
                  lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "±\u001c\u0017Cò\u008b|Kc\u001f&ö³\u00880ÉlÛ>\u0006\u0018Wf.";
                  int var5 = "±\u001c\u0017Cò\u008b|Kc\u001f&ö³\u00880ÉlÛ>\u0006\u0018Wf.".length();
                  byte var2 = 0;

                  do {
                     var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     var37 = var3++;
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
                     byte var49 = -1;
                     var6[var37] = var10004;
                  } while (var2 < var5);

                  var4 = "\u0019µe\u0093ÉÞFm\\\u0002n)¤äs8";
                  var5 = "\u0019µe\u0093ÉÞFm\\\u0002n)¤äs8".length();
                  var2 = 0;

                  do {
                     int var41 = var2;
                     var2 += 8;
                     byte[] var25 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                     var41 = var3++;
                     long var26 = (var25[0] & 255L) << 56
                        | (var25[1] & 255L) << 48
                        | (var25[2] & 255L) << 40
                        | (var25[3] & 255L) << 32
                        | (var25[4] & 255L) << 24
                        | (var25[5] & 255L) << 16
                        | (var25[6] & 255L) << 8
                        | var25[7] & 255L;
                     byte[] var27 = var0.doFinal(
                        new byte[]{
                           (byte)(var26 >>> 56),
                           (byte)(var26 >>> 48),
                           (byte)(var26 >>> 40),
                           (byte)(var26 >>> 32),
                           (byte)(var26 >>> 24),
                           (byte)(var26 >>> 16),
                           (byte)(var26 >>> 8),
                           (byte)var26
                        }
                     );
                     long var51 = (var27[0] & 255L) << 56
                        | (var27[1] & 255L) << 48
                        | (var27[2] & 255L) << 40
                        | (var27[3] & 255L) << 32
                        | (var27[4] & 255L) << 24
                        | (var27[5] & 255L) << 16
                        | (var27[6] & 255L) << 8
                        | var27[7] & 255L;
                     boolean var50 = false;
                     var6[var41] = var51;
                  } while (var2 < var5);

                  lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = var6;
                  IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = new Long[5];
                  lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     null
                  );
                  lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19079;
      if (IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll", var10
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
         byte[] var9 = lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl[var5].getBytes("ISO-8859-1");
         IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var5];
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
            "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24577;
      if (IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII[var3] == null) {
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
         long var5 = lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI[var3];
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
         Object[] var9 = (Object[])lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll", var14
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
         IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII[var3] = var15;
      }

      return IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII[var3];
   }

   private static long IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public void lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI$recovered$4d6cad85dd3b9789(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll$recovered$2a77ef27570d7e0c(long var1) {
      var1 = 41873767544381L;
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var3 = var1 ^ 100696017570811L;
      long var5 = var1 ^ 65758718503693L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         var3
      );
      this.lIIlIlIIllIlIIlllllIllIlIlIIllllIllIIIlIllIlIIlIlIlIllIlllIlIIIllIIlIlIIlIlIllllIIlll(var5);
   }

   private final void lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl$recovered$713fde448ed5c5d1(long var1) {
      var1 = 137586814717896L;
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var10001 = var1 ^ 44595506025019L;
      int var3 = (int)((var1 ^ 44595506025019L) >>> 48);
      int var4 = (int)((var1 ^ 44595506025019L) << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         (char)var3,
         var4,
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(),
         (short)var5
      );
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a2cc71f395088865(
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll var0,
      long var1,
      me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3
   ) {
      var1 = 9745203375217L;
      var1 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII ^ var1;
      long var10001 = var1 ^ 112288174444169L;
      int var4 = (int)((var1 ^ 112288174444169L) >>> 32);
      int var5 = (int)((var1 ^ 112288174444169L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var5, (char)var6);
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final me.octo.client.modules.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI handler;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 97895075699701L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull me.octo.client.modules.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI handlerArg,
         int argument2Arg,
         int argument3Arg,
         @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 2298929721744L;
         Intrinsics.checkNotNullParameter(handlerArg, "handler");
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.handler = handlerArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
         this.playerPos = playerPosArg;
      }

      @NotNull
      public final me.octo.client.modules.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI getHandler() {
         return this.handler;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull me.octo.client.modules.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1,
         int var2,
         long var3,
         int var5,
         @NotNull Triple var6
      ) {
         var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var3;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(18964, 4332280520135000514L ^ var3)
         );
         Intrinsics.checkNotNullParameter(
            var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(8905, 4602223332337035550L ^ var3)
         );
         return new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
            var1, var2, var5, var6
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 82964994890074L;
         Triple var3 = this.playerPos;
         int var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         me.octo.client.modules.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = this.handler;
         return "MineProgress(handler=" + var6 + ", hardstoneMined=" + var5 + ", chestsOpened=" + var4 + ", playerPos=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.handler.hashCode();
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.playerPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 35087096670283L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[8];
         int var7 = 0;
         String var6 = "æ\u0084léõ¾\u0097^/\u0093ÊC\u0004~f_ k\u00885¸w\u00936Ú\u009a\u0086§*ÒÅ\u0018f&øSsÎ\u00ad\u0013=½ÈÀùµfOÂ\u0018:$-M×Q\\@ûCÉ\u009d\u008auÇó\u0098\u0016HdJ/â)\u0010\u0099\u001a¢\u0087bN\u0084~êÎµo\"5cº\u0018#`P¢\u009b\u0018\u0097ÔÜ«\u0089ª´\n\u0099íG\u0089\u0006H£ëöÍ(Ä¬»YB\u000e,y\u007f4k\u0003\u0002\u007f÷ªYL \u0017\\ÓÚV·²ájÛR\u0088~ \u0087LÌíõ\u001fõ";
         int var8 = "æ\u0084léõ¾\u0097^/\u0093ÊC\u0004~f_ k\u00885¸w\u00936Ú\u009a\u0086§*ÒÅ\u0018f&øSsÎ\u00ad\u0013=½ÈÀùµfOÂ\u0018:$-M×Q\\@ûCÉ\u009d\u008auÇó\u0098\u0016HdJ/â)\u0010\u0099\u001a¢\u0087bN\u0084~êÎµo\"5cº\u0018#`P¢\u009b\u0018\u0097ÔÜ«\u0089ª´\n\u0099íG\u0089\u0006H£ëöÍ(Ä¬»YB\u000e,y\u007f4k\u0003\u0002\u007f÷ªYL \u0017\\ÓÚV·²ájÛR\u0088~ \u0087LÌíõ\u001fõ"
            .length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "µîÞ\u0019÷l\u009e\u009d[ýøÀ&\u0090ã\u0019ÛæM±I ù¯ß\u0094\u008fvO\u008b;é(gÅº\u0015\u0014 \u009e\u0088\u001b`eÅU\u001aâ¥\u0099\u00159\n\u0098µñM\f\nÿ!\b×þ°¨\u0086$m)_\u0091g";
               var8 = "µîÞ\u0019÷l\u009e\u009d[ýøÀ&\u0090ã\u0019ÛæM±I ù¯ß\u0094\u008fvO\u008b;é(gÅº\u0015\u0014 \u009e\u0088\u001b`eÅU\u001aâ¥\u0099\u00159\n\u0098µñM\f\nÿ!\b×þ°¨\u0086$m)_\u0091g"
                  .length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[8];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 30289;
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
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
                  var10
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
               "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @Nullable
      private final BlockPos IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 52998644155951L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @Nullable BlockPos argument1Arg, boolean argument2Arg, @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 66486390233426L;
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.playerPos = playerPosArg;
      }

      @Nullable
      public final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      @Nullable
      public final BlockPos IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @Nullable BlockPos var1, long var2, boolean var4, @NotNull Triple var5
      ) {
         var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(9601, 1983057180878925179L ^ var2)
         );
         return new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var4, var5
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 8059944285344L;
         Triple var3 = this.playerPos;
         boolean var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         BlockPos var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "MoveProgress(walkPosition=" + var5 + ", walkerFinished=" + var4 + ", playerPos=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 105647698052140L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[5];
         int var7 = 0;
         String var6 = "Îð+I\u009b\u0098\u001fÆ0Â}8Ùá\u008aæIfäAa\u0014¸æã\u009e},Á\u008c\u000b\u0012¥ç\u0090Õ>:\u001c\u009a~ðÐènhÛÏ \u001c B\u0097\u0083»/´\u008cñ\u00028\u009f:\u0004\u0094?W»à2\u0082Íøø«ö¨h\u0093AÑ(Êl^þ^\u0085·Ö¶ÖiVÍoñ4H9xR\u0085w\u009d¢\u0002\u0002TC\u0013²=Ø8;5X\u0092j\u0089Ô";
         int var8 = "Îð+I\u009b\u0098\u001fÆ0Â}8Ùá\u008aæIfäAa\u0014¸æã\u009e},Á\u008c\u000b\u0012¥ç\u0090Õ>:\u001c\u009a~ðÐènhÛÏ \u001c B\u0097\u0083»/´\u008cñ\u00028\u009f:\u0004\u0094?W»à2\u0082Íøø«ö¨h\u0093AÑ(Êl^þ^\u0085·Ö¶ÖiVÍoñ4H9xR\u0085w\u009d¢\u0002\u0002TC\u0013²=Ø8;5X\u0092j\u0089Ô"
            .length();
         char var5 = '0';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "Ê\u0084\u008b\fMeWÛ\u008c\u0001\u001dE\u0016vs\u008a\u00adgøáe,ÙÙ\u0018ÿl2HÄ¤~¯jïLR\u0014§\u000fÔ\u0001\u0018P\u001aé{_a";
               var8 = "Ê\u0084\u008b\fMeWÛ\u008c\u0001\u001dE\u0016vs\u008a\u00adgøáe,ÙÙ\u0018ÿl2HÄ¤~¯jïLR\u0014§\u000fÔ\u0001\u0018P\u001aé{_a".length();
               var5 = '\u0018';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 29615;
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
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
                  var10
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
               "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 1541923047266L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(boolean var1, @Nullable String var2, int var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         boolean var1, @Nullable String var2, int var3
      ) {
         return new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var2, var3
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 32328856262650L;
         int var3 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         String var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "CommandProgress(clickedTop=" + var5 + ", screenTitle=" + var4 + ", greatExplorerLevel=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 23415704113854L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[3];
         int var7 = 0;
         String var6 = "ï\u000b0\u0087´A\u008d§ìíìû¢P±\u000e[\u000b%\\Í\u008fz\n8Ë»ô\u0092\u0002\u0096tÃ\nõÉ\u001f'À¯Ú6ß±T«\u0018ôCæÔÒÏ(¤'\u008dèõ\u0094\u0090\u0092Þäe¯}ÿ·öäì¨\u0012Þ=\u0013\u001e\u0006\u0006[(\u008f\u0091\u0012\u001a\u0084\u001cs\bßlà2=UË_µF½ùp£Ý7!\u0082j\u009cêôê¿H'¼\u0017\u001c\u0095\\#";
         int var8 = "ï\u000b0\u0087´A\u008d§ìíìû¢P±\u000e[\u000b%\\Í\u008fz\n8Ë»ô\u0092\u0002\u0096tÃ\nõÉ\u001f'À¯Ú6ß±T«\u0018ôCæÔÒÏ(¤'\u008dèõ\u0094\u0090\u0092Þäe¯}ÿ·öäì¨\u0012Þ=\u0013\u001e\u0006\u0006[(\u008f\u0091\u0012\u001a\u0084\u001cs\bßlà2=UË_µF½ùp£Ý7!\u0082j\u009cêôê¿H'¼\u0017\u001c\u0095\\#"
            .length();
         char var5 = 24;
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var13;
            if ((var4 += var5) >= var8) {
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[3];
               return;
            }

            var5 = var6.charAt(var4);
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 40;
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
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                  var10
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
               "me/octo/client/modules/impl/macros/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
