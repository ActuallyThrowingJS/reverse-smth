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
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.modules.helpers.general.Scheduler;
import me.octo.client.modules.impl.features.visuals.RouteRendering;
import me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SandMiningMacro extends me.octo.client.modules.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static SandMiningMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @Nullable
   private me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   @NotNull
   private ArrayList<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   @NotNull
   private static SandMiningMacro IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   @NotNull
   private static IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private static long lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = 36811970840883L;
   private static String[] llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private static String[] lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static Map IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new HashMap(13);
   private static long[] lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private static Long[] IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static Map lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;

   public SandMiningMacro() {
      long var1 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ 110742190770259L;
      ModuleCategory var10003 = ModuleCategory.MACROS;
      Setting[] var3 = new Setting[]{
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(),
         lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
      };
      super("Sand Mining Macro", "Mines sand in the Mushroom Desert using a smooth path route.", var10003, "Mushroom Desert", null, null, true, var3, 48, null);
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new ArrayList<>();
   }

   @Override
   protected void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 38666634225439L;
      long var5 = (var1 ^ 38864157951580L) >>> 16;
      int var7 = (int)((var1 ^ 38864157951580L) << 48 >>> 48);
      long var10001 = var1 ^ 106044544803237L;
      int var8 = (int)((var1 ^ 106044544803237L) >>> 32);
      int var9 = (int)((var1 ^ 106044544803237L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 43728447564403L;
      long var13 = var1 ^ 83786098096788L;
      long var15 = var1 ^ 30852254653153L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"b">(30054, 5346626384110014033L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.TRAVEL,
         SandMiningMacro::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"o">(23021, 5368911281668704359L ^ var1),
         false,
         false,
         SandMiningMacro::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 77946779331975L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 38808603725064L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 114233951575679L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"f">(13675, 7680359338925676210L ^ var2)
                  );
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (SandMiningMacro)this.receiver, var1, var4
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 73053854187321L;
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
                  String var6 = "©¶S\u0001\u0086×Ú\u008d\tw³ÏÅ\u0014\u009cî\u0007½V\u00922Sù\u008d\u0005\u008f¨Ô§9^JsMGs Ê\u001e°õW\u0089¬UýR\u0086#bÄ+|£\u0098\u0013\u0082\u0099v\fC\u0090xS¥µ>æ\u0019R\u0016üÇ\u0092¢àÏz#G¿06Ê\\b=ø?£pÌ`Ò\u0088gú}\u0002S6¿Ä$\u0081v>\u0013Ê\fÅ\u008es\u0000þÉ\u009c!0\u0010Êèl]÷Î@ô\u0000\u0012ÃB\u000b'bS\u007f4\u0083è[TÁ\u0001¨\u008bÏÈo-\u009a\u00ad£sHÛa\b\u0014«\u0010\u0004\u009dÍ2\u009f\u0015øÃËp\u0087·\u0093r»e\u0094·µõÎ6$À\u0001s>R@*æùì¹\u0004ãF$\u0086g\"&\u0091%=\u008f\u0003@ur Þe\u001fÌ\u0010?l¼\u001cÐý$\u0091vGlî\u008a XG Èwtêt\u000e\u0098$\u009aÃa´lëNå\u008dyÏÛÞ\u0096¹ÕBa\u0088Ö7ì_w";
                  int var8x = "©¶S\u0001\u0086×Ú\u008d\tw³ÏÅ\u0014\u009cî\u0007½V\u00922Sù\u008d\u0005\u008f¨Ô§9^JsMGs Ê\u001e°õW\u0089¬UýR\u0086#bÄ+|£\u0098\u0013\u0082\u0099v\fC\u0090xS¥µ>æ\u0019R\u0016üÇ\u0092¢àÏz#G¿06Ê\\b=ø?£pÌ`Ò\u0088gú}\u0002S6¿Ä$\u0081v>\u0013Ê\fÅ\u008es\u0000þÉ\u009c!0\u0010Êèl]÷Î@ô\u0000\u0012ÃB\u000b'bS\u007f4\u0083è[TÁ\u0001¨\u008bÏÈo-\u009a\u00ad£sHÛa\b\u0014«\u0010\u0004\u009dÍ2\u009f\u0015øÃËp\u0087·\u0093r»e\u0094·µõÎ6$À\u0001s>R@*æùì¹\u0004ãF$\u0086g\"&\u0091%=\u008f\u0003@ur Þe\u001fÌ\u0010?l¼\u001cÐý$\u0091vGlî\u008a XG Èwtêt\u000e\u0098$\u009aÃa´lëNå\u008dyÏÛÞ\u0096¹ÕBa\u0088Ö7ì_w"
                     .length();
                  char var5x = 216;
                  int var4 = -1;

                  while (true) {
                     byte[] var10x = var2.doFinal(var6.substring(++var4, var4 + var5x).getBytes("ISO-8859-1"));
                     String var13x = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10x).intern();
                     byte var10001x = -1;
                     var9x[var7x++] = var13x;
                     if ((var4 += var5x) >= var8x) {
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
                        byte var8x = var0[++var4];
                        var6 = (char)(var6 | (char)(var8x & 63));
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
                  int var5x = var0 ^ (int)(var1x & 32767L) ^ 30959;
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
                     } catch (Exception var10x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
                           var10x
                        );
                     }

                     byte[] var6 = new byte[8];
                     var6[0] = (byte)(var1x >>> 56);

                     for (int var7x = 1; var7x < 8; var7x++) {
                        var6[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                     }

                     DESKeySpec var11x = new DESKeySpec(var6);
                     SecretKey var8x = ((SecretKeyFactory)var4[1]).generateSecret(var11x);
                     ((Cipher)var4[0]).init(2, var8x, (IvParameterSpec)var4[2]);
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
                  MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                  var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
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
                        "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                           + " : "
                           + var1x
                           + " : "
                           + var2.toString(),
                        var5x
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$06ca26b5e5de9c06(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 2451255555760L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 114233951575679L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a8aa65bd2d66867(
                     (SandMiningMacro)this.receiver, p0Arg, var4
                  );
               }
            }
         ),
         48,
         null,
         var3
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3fec560eef4040e(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"b">(30608, 2624875948895620271L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"o">(9044, 6797193189696156381L ^ var1),
         0L,
         SandMiningMacro::llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll,
         false,
         false,
         SandMiningMacro::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 112782017576356L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 136879424069359L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 50069416614502L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(7191, 9110964347197395862L ^ var2)
                  );
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (SandMiningMacro)this.receiver, var1, var4
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 38938301547929L;
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
                  String var6 = "Ùaþ\u0014År©QjZ!×qwK\u00835ª\u0088\u0097\u000f¬zº0¯|ã\u0087\u0002\u0013\u0080\u0019I\u0018T\u00105ñZ«Y\u0099s+\u0007Z%\u001fªµj\u0095¸&\u0015\nm\u001cKú§o;h;\u0018g·ë¶»PÕ´u¦\u00827½ëà¸\u0081\u00876u\u0090\u000f\u009d\u009d[\t¥§l\u009b§7QmÓ\u00ad\u0094åÙhv2\u0094\u0013-ØÌ\u008egÑQnpÈ\u0006ðL\u001cûö~¿\u009bVë\u0097«j\u0083þv\u0093¶7Z\u0094dÃ\u0095\u0085Üw\u0090å³\u0001É\u0005 5\u008660ÌÜªèKõ!ý\u008a\u0080-\u0096i\u008dkp@\u009e\u001fKæ;!#o\u0005ì4!\u0084¤á:\u0014HÂµ?\u0098û@{\u0082IÓ\u009b&m\u0018J}\u0085ã%\u0097¸=<'û Þ\u0092ä\u0011\u0088Ê\u0083Kí\u0088Ãe\u0010*ÀÓÌÇ\\ü-\u0098Lèbá\u007f\u008aÙ";
                  int var8 = "Ùaþ\u0014År©QjZ!×qwK\u00835ª\u0088\u0097\u000f¬zº0¯|ã\u0087\u0002\u0013\u0080\u0019I\u0018T\u00105ñZ«Y\u0099s+\u0007Z%\u001fªµj\u0095¸&\u0015\nm\u001cKú§o;h;\u0018g·ë¶»PÕ´u¦\u00827½ëà¸\u0081\u00876u\u0090\u000f\u009d\u009d[\t¥§l\u009b§7QmÓ\u00ad\u0094åÙhv2\u0094\u0013-ØÌ\u008egÑQnpÈ\u0006ðL\u001cûö~¿\u009bVë\u0097«j\u0083þv\u0093¶7Z\u0094dÃ\u0095\u0085Üw\u0090å³\u0001É\u0005 5\u008660ÌÜªèKõ!ý\u008a\u0080-\u0096i\u008dkp@\u009e\u001fKæ;!#o\u0005ì4!\u0084¤á:\u0014HÂµ?\u0098û@{\u0082IÓ\u009b&m\u0018J}\u0085ã%\u0097¸=<'û Þ\u0092ä\u0011\u0088Ê\u0083Kí\u0088Ãe\u0010*ÀÓÌÇ\\ü-\u0098Lèbá\u007f\u008aÙ"
                     .length();
                  char var5 = 208;
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 20653;
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
                           "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                        "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$035028015e4bcc14(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 114492485198474L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 50069416614502L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a8aa65bd2d66867(
                     (SandMiningMacro)this.receiver, p0Arg, var4
                  );
               }
            }
         ),
         var5,
         104,
         (char)var7,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3fec560eef4040e(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"b">(17325, 962739606724638867L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"o">(6982, 4180563012726328010L ^ var1),
         0L,
         SandMiningMacro::llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl,
         false,
         false,
         SandMiningMacro::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 2067136445105L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 27100890202687L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 68481890787309L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"g">(30103, 8436874137549532892L ^ var2)
                  );
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (SandMiningMacro)this.receiver, var1, var4
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 20477441434965L;
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
                  String var6 = "\u0082_·\u0091\u0019&àD'Ãðu\u0019wIEO\u0088\u0003i\u0092ÀyÅ\u0010×\u0006\u0013¨)\u0012wA\u000b¼p\u0007U$I\u0086È\tµÆ7Jé\u008e\u0087 ¶\u0091\u0086EÌ\u009e»\u0017(Â9ïÈU¸ÒÊl\u008bìXì\u008996«\u001dùwso=É¶¿coà-¾ý×3I*[Ñ\u001fÓ[H\nø¤¹Ë¬\u0014\u009eë\u0084\u008b\u0002¾\u0092#¯â¢z¡7\u009e\u0017\u008c}\u007f¼ë\u0089G\u0095C\u009b\u0085K¤á\rÒ\b\u001d\f83}p\u0087¸Æ§\u0000\u0013ú/(XT¦«\u0092MÓ\u0081Ë\u0010Ú:+Íò/¡GU0ÄÕ.góÒ{5\u000e`®\u008cU\u0098\u0018dÄ\u0080b\u008c·Î ®Qç¯\u0086h9áÞÛÞ?¡\u0011¤\u001cÃ\u008f:\u008fõ,;=êÐ¯×JO<;q\u009aõ&v´\"¶ú`";
                  int var8 = "\u0082_·\u0091\u0019&àD'Ãðu\u0019wIEO\u0088\u0003i\u0092ÀyÅ\u0010×\u0006\u0013¨)\u0012wA\u000b¼p\u0007U$I\u0086È\tµÆ7Jé\u008e\u0087 ¶\u0091\u0086EÌ\u009e»\u0017(Â9ïÈU¸ÒÊl\u008bìXì\u008996«\u001dùwso=É¶¿coà-¾ý×3I*[Ñ\u001fÓ[H\nø¤¹Ë¬\u0014\u009eë\u0084\u008b\u0002¾\u0092#¯â¢z¡7\u009e\u0017\u008c}\u007f¼ë\u0089G\u0095C\u009b\u0085K¤á\rÒ\b\u001d\f83}p\u0087¸Æ§\u0000\u0013ú/(XT¦«\u0092MÓ\u0081Ë\u0010Ú:+Íò/¡GU0ÄÕ.góÒ{5\u000e`®\u008cU\u0098\u0018dÄ\u0080b\u008c·Î ®Qç¯\u0086h9áÞÛÞ?¡\u0011¤\u001cÃ\u008f:\u008fõ,;=êÐ¯×JO<;q\u009aõ&v´\"¶ú`"
                     .length();
                  char var5 = 24;
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 16879;
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
                           "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
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
                        "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2ceb99501a4ae6fa(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 31413694013460L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 68481890787309L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a8aa65bd2d66867(
                     (SandMiningMacro)this.receiver, p0Arg, var4
                  );
               }
            }
         ),
         var5,
         104,
         (char)var7,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3fec560eef4040e(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"b">(6391, 5875500245357503436L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE,
         IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"o">(31464, 5892771227136846693L ^ var1),
         0L,
         SandMiningMacro::lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII,
         false,
         false,
         SandMiningMacro::IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 44233332149691L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 9003121116684L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  long var1, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3x
               ) {
                  var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
                  long var4 = var1 ^ 117283159397863L;
                  Intrinsics.checkNotNullParameter(
                     var3x, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(18232, 5095834112666392548L ^ var1)
                  );
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (SandMiningMacro)this.receiver, var3x, var4
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 15841550779866L;
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
                  String var6 = "ÓHØß}%\u0091t\u008a\bìµ\u0002÷\u0099îÐ#gkÄ3E>t>\u0017ä#u\u008c.ò\u0014\u0014Ú;¢\u0005ðÄ©U!¢V¶ãí\\ \u0086\u0007±Ê\u0093ó\u00916ÞÍ\u001d\u001eâ\\\u0007AP\u001b\u0014\u000e!}¹²¿[f ¸@U¯=y?]¯\u0000O\u001cboã6 \u0081\u0090ö\u0000í§:dn\u0083SO²\u0011î+@%\u0003Z\u009fÂö\u009c¶º¢ÿ.¦÷oØ¤\u009d;J{\u00973F¸Ë.n\u009e-Õ\u0098Õ.¯3\u009d\u0099\u007fmåBdk{ÁvX6û!Ù/\u001e³^\u0018%í)ð+Å£o\u0090¿ZÍx¦iÚcæ\u001eÿÉ\u0089¦ÉæR\u0085Z8´wÇ\u0090iï@C©ËüÕKh½ï¡\u0002Fd\nÐ4Qwå ê\u00ad\u0085~\u007fÒé\u0014\u0081×A\u0095÷\r\u0017¤Xø3\u0004\u0083\u008dÀ§¡?£@1L@Â";
                  int var8 = "ÓHØß}%\u0091t\u008a\bìµ\u0002÷\u0099îÐ#gkÄ3E>t>\u0017ä#u\u008c.ò\u0014\u0014Ú;¢\u0005ðÄ©U!¢V¶ãí\\ \u0086\u0007±Ê\u0093ó\u00916ÞÍ\u001d\u001eâ\\\u0007AP\u001b\u0014\u000e!}¹²¿[f ¸@U¯=y?]¯\u0000O\u001cboã6 \u0081\u0090ö\u0000í§:dn\u0083SO²\u0011î+@%\u0003Z\u009fÂö\u009c¶º¢ÿ.¦÷oØ¤\u009d;J{\u00973F¸Ë.n\u009e-Õ\u0098Õ.¯3\u009d\u0099\u007fmåBdk{ÁvX6û!Ù/\u001e³^\u0018%í)ð+Å£o\u0090¿ZÍx¦iÚcæ\u001eÿÉ\u0089¦ÉæR\u0085Z8´wÇ\u0090iï@C©ËüÕKh½ï¡\u0002Fd\nÐ4Qwå ê\u00ad\u0085~\u007fÒé\u0014\u0081×A\u0095÷\r\u0017¤Xø3\u0004\u0083\u008dÀ§¡?£@1L@Â"
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 115;
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
                           "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                        "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$df4bac2105ee01de(
                  long argument1Arg, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg
               ) {
                  argument1Arg = 107382960774420L;
                  argument1Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument1Arg;
                  long var4 = argument1Arg ^ 117283159397863L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  SandMiningMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a8aa65bd2d66867(
                     (SandMiningMacro)this.receiver, p0Arg, var4
                  );
               }
            }
         ),
         var5,
         104,
         (char)var7,
         null
      );
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1, char var2, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3, int var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32)
         ^ lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      long var7 = var5 ^ 3585694980703L;
      long var10001 = var5 ^ 118978259459403L;
      int var9 = (int)((var5 ^ 118978259459403L) >>> 32);
      int var10 = (int)((var5 ^ 118978259459403L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 96266796361468L;
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.MUSHROOM_DESERT,
         SandMiningMacro::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII,
         var3.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         SandMiningMacro::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, (short)var10, var14, (short)var11);
   }

   private final void lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(long param1) {
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
   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 104116370086504L;
      this.lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(var5);
      super.IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(var3);
   }

   @Override
   public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1, boolean var3) {
      long var4 = var1 ^ 7979397691534L;
      long var6 = var1 ^ 0L;

      try {
         if (!var3) {
            this.lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(var4);
         }
      } catch (NullPointerException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, 3143460873467213799L, var1
         );
      }

      super.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var6, var3);
   }

   @SubscribeEvent(priority = EventPriority.HIGH)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      long var2 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ 110420096173243L;
      long var4 = var2 ^ 9287613702937L;
      long var6 = var2 ^ 35630416336147L;
      long var8 = var2 ^ 80874875574710L;
      long var10 = var2 ^ 130917961993053L;
      long var12 = var2 ^ 80949225409750L;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = PowderMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      Intrinsics.checkNotNullParameter(eventArg, "event");
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var14 = var10000;

      label49: {
         label48: {
            boolean var17;
            try {
               var17 = this.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll();
               if (var14 != null) {
                  if (var17) {
                     break label48;
                  }

                  return;
               }
            } catch (NullPointerException var20) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var20);
            }

            var21 = var17;
            break label49;
         }

         var21 = RouteRendering.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$9bc06b897dfae22e(
               lIllllIIlllIllIlIllIIIlIIlIIllIllIIIlIIlIIIlIllIIlIIIlIIllIIlllIllIIlIllllIlIIllIllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
                  .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll(),
               var4
            );
      }

      label37: {
         label36: {
            boolean var18;
            try {
               var18 = var21;
               if (var14 != null) {
                  if (var18) {
                     break label36;
                  }

                  return;
               }
            } catch (NullPointerException var19) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19);
            }

            var22 = var18;
            break label37;
         }

         var22 = IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      if (var22) {
         RouteRendering.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$928484e81e1e3d93(
               eventArg.getPoseStack(),
               IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI$recovered$e6aef0790b11525a(
                  var6
               ),
               var12,
               IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII()
            );
         RouteRendering.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$b6850d2ad4a8079e(
               this.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(),
               IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII$recovered$fdfb6a7d676e2ffa(
                  var10
               ),
               me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.MINE,
               var8
            );
      }
   }

   @Override
   public boolean lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(long var1) {
      return this.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll()
         == me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MINE;
   }

   private final me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(
      long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final long IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(SandMiningMacro var0, long var1) {
      var1 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var1;
      return var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll()
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
         + IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"o">(8865, 3540857210517348600L ^ var1);
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(SandMiningMacro var0) {
      return TuplesKt.to(
         var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll().getLocation(),
         me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
      );
   }

   private static final boolean llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll(long var0) {
      var0 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var0;
      me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8732337524445837341L, var0
      );

      try {
         boolean var10000 = IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
         if (var2 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (NullPointerException var3) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var3, -8779525097190679984L, var0
         );
      }

      return false;
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      int var0, char var1, short var2, SandMiningMacro var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      long var6 = var4 ^ 11904127119961L;
      return new SandMiningMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3, 0.0, 1, var6, null
         )
      );
   }

   private static final boolean llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl() {
      return IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(SandMiningMacro var0, long var1) {
      var1 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var1;
      long var3 = var1 ^ 54923202565010L;
      long var5 = var1 ^ 85094521747855L;
      return new SandMiningMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(),
         IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(
            var3
         ),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var0, 0.0, 1, var5, null
         )
      );
   }

   private static final boolean lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII() {
      return IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   private static final Object IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll() {
      return me.octo.client.utils.skyblock.mining.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl();
   }

   private static final Unit lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      int param0, SandMiningMacro param1, int param2, char param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var0, SandMiningMacro var2) {
      var0 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var0;
      long var3 = var0 ^ 41745619672684L;
      var2.lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI(var3);
      return Unit.INSTANCE;
   }

   private static final Unit IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var0, SandMiningMacro var2) {
      var0 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var0;
      long var3 = var0 ^ 39731381294236L;
      var2.lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(var3);
      return Unit.INSTANCE;
   }

   private static final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
      char param0, short param1, int param2, SandMiningMacro param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean lIIlIIllIIllIlIllIIlIIlIIIIIlIlIlIIlIlIIIIIIllIllIIIlIIllllIlllllIllIlllIlIlIllIllIII(long var0) {
      var0 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var0;
      long var2 = var0 ^ 41456463783832L;
      return Scheduler.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var2);
   }

   private static final boolean lllllIIlIIlIlllIIlllIlIlIlIIIlIIIlIlIllIIlIlIIlllIIllllIIllIlIllIlIlIIIIIllllIllIIlII(long var0) {
      var0 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var0;
      long var2 = var0 ^ 20508008543832L;
      return me.octo.client.modules.helpers.general.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
   }

   @NotNull
   public static final SandMiningMacro IlIlIIlIlllIIlIllIIlIlIlIllllllIlllIllIlIlIllIlIlIIlIIIllllllIlIllIllIIIIIlIlIIIllIlI() {
      return lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   static {
      long var11 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ 23997859971260L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[28];
      int var18 = 0;
      String var17 = "|\u0016°F\u0018¥p\u008d\u00035\u0013\u0006\u0090\u0014?u\u0093¼\u008420OÛDS\u00955\u009cô\u0017¨\u0080 \u0015\u009fT~FMÐ\u0015\u0087\u001añ\u000fw÷e\u0095PY=L×z\t¸\u009ak\u0087d\u009a\u0019\u0001W@¾\u000f\u0018é\u0094Eô\u0084!\u0088-¿Ô7vº\u0088\u0016+6ÜªMV\n7^\u008a`ªé:w\u0010³éc¶å\r\tó7|kI¡Ö\u0019gtD»îBn\u009f\nSS\u008d÷B\u0099 Vè\u0092;\u0011âLB\u009b¾+q\u001c%\u0017Àíµ v¶tés?ÍR\u00974â=p(\u0010¶ô×èÏT.Ò\u0091ùê\u008a\u0003:\u0091tÚ]ÛÇ\u0080\u001cÚÇI\u009b·\u0016réM5qÔ\u0097\u009e\"s\"(P\b\u0013½\u0087éF\u0014h\u001d\u0015 ð`_PYÅ¥+\u0003ÞÎsþ\u000bbGrç\u0018Ä¨}ä+¼À%É\u0010ÚC#´k\u007f!\u0093]\u0090sä\u000bÚq\u009a ;Kûð&6\u0005hòÜþý\u0089äôvGS½y(Uæ§\u0086QjX\u0016ù`Þ \u0099Ê]B\u009cÍ¢\u0085Æó·\u0093\\t5öõ\u0090\\Ê^d×\u009c¢µ\u000føÒòUû0\u0098\u0091÷PÈ\u000fth\u008b-\u008apª«®ðÓ5D\"ï½\u001c¬®\u001b\u0090\u0014\by\u009a<ê;:>\u0081Û=\u0082î}Lý~\u001c/«0¸¤© k½¿dÈÓ'ô\u007f÷\u0092[P*!ðI\u0083þ\u0018{m{\r\u0000\u009f®ÅiÜS\u0080ÔZ¹õÉ²\u00843-\u0006\u000e~\u0018µ\u008fDMª{Ò(EýÑâ¨0ô®¿Ún\u0090\\?Ò]h\u0098\u0006Kû\u0084u-÷]K\u0088Õá\u0019JJ\u0001Hi\u0080\u00835²\u009buLÉq\u0004/;-©°ä\\-Þh¸\u0088\u0016\u000e~\u0013#çÑqHÙ\u0007H\u0006/Gw¹}\\1ÊË\u000b ©Ü\u0001°\u001d\u0090êÑN0ÕzÓ×,¬l9õ\u0018\u0002Í\u0086u#/5Ôy\u0000ðZ5E$\u0000ò\u000e\u001b8.+õ3\u0017;~\u0099Ä[\u0019\u0001OÕ%ª:Éøï\u009e\u0000g\u009a§#\u00074*1\u0013\u0007¯,.\u0081CÒ\u0082\u008dë¿V- L\\iQ\u0004z>æ\u000eä]HÎËÛ©ËüæI»ÁU\u0011\u0010®E\b;f@ï\\Q\u008fVõÔfQÍßðÓÏ{=eg\u0081Ø\u00963ó6\u0000\u0014ÄÅ\u008f\u009eß\u0006ä»ÁÌÑ£×jt¥ÃüÙ¡\b´~\u000eà\u0000D\u00187'\u008b\u0081þSÕ¢_jùK\u0080ê¼L\u000b\u0098êvi\u008c)Ý\u0018¦#Í£âaj \u0097=(\u0085þdÌ\u008b\t0£ÍðìÈ\u001f(FÖ\u008ePÀ\\ìè »Ë\u008d\t`\tÓ\u00ad\u0091ñ<s\u0013\u0083[\u0084Â\u008eÄàAg¥×\u001a®p/4N3h\u0093y¿øå©Ô¨[.=\u00adnüç\"\raUØ\r\u0097\u0087ZbÉ\u0098\u000b#f\u0090iÿçx\u0007aE}4«åC\u001d3¼µW\u008e\u001b\u001e\u008a\u0007Îd]LªYj:\u001a+tG\u0010\u0000ßa\u0016<\u00988Ùëu\u0086ýËà\u0088>*·[ïéu\u008b\u008d¤8<Û\u0093\u0084\u008aøÉU¸&qâHºÎº\u000fúÓZC\u001c= hRÑd\u001c:u\u007f\u0005Y½Ø9¤\u0001{Õ¤þT\u0016\u00ad\u0007Ìmò¤\r7\u000fØF\u000eµ»KUxÁòKðº±\u009f\u0091û\u0083H\u008c\u000eæ\u0016\r\nc\u000f\u0088\u0092þZx:Úåk®¹\u0088§¼°\u0010D\u008eÿT´3`@\u001c$µµÞKAÞ´|\u0089.Å\u0089Z´4íÍ\u007f\u009d|/ýµ`Pä©¶Þ\u0012aýÛ\u00164\u008d\u0089ÑÉ?\u008eißNÎé32NWßTñz\náG'¶¬\u0006\u0093¨rÖ\u0011qÌK.\u001b\u0084±«4k4\n\bKÐÍXxsW\u0000$åÚë\u009e\u000eø\rv\u0084\u0092ö@'Ëÿs\u000f¥ðµyv\u0012YX\u0015\t©ËÂÍtnÆä\u0097Ç\u000fø\u008b\u0010\f\u0012\\\u0089\u0005ÃüT\u009d\u007f%\u0016\u0004Óy\t\u007f_h²Öâs4\u009e·Ø²°\u0017\u001cX\u0018¨²\u0010\u008b©áíN\u0080\u000bÐD`w·Ë]£\u009bXc×\u0002~WE¾\u001c\u0094\u0081âå|\u0003¡\u0007\u00adqÜ`öP1\u0007ÉDPÞG\u009a÷\b¡\u0097½¸gL\u009eÍª¬\u0018.B&\u0096õ\u001f\r¤\b:Z¢n\u007f¦W£Ï-Õi[zþ¥í\u009f\u009bL\u0086ýÇ\u009c½àf\u001b\u008fùªê)\u007f`:06\u0012\u0006Axn\u0001\u0019wú\u0014ÍN^tD³¼\u0011\u0005«;!¢\u008b\u008aÚÏã¦\u001cÂ\u0097`\u008bWX\u001f\u007fé»GËÞ\u0091V3c8\u008amÅPÈ\u0017N\u0086YwÁ÷\u0014p)Øý\u009fï\u0018µ\u0006ÏÍ\u0007*¸ß\f6\u000b@1¸*\u0004\u0016áÛ7CìØÚ)ç9F7ÐBÇÛÝÅâ";
      int var19 = "|\u0016°F\u0018¥p\u008d\u00035\u0013\u0006\u0090\u0014?u\u0093¼\u008420OÛDS\u00955\u009cô\u0017¨\u0080 \u0015\u009fT~FMÐ\u0015\u0087\u001añ\u000fw÷e\u0095PY=L×z\t¸\u009ak\u0087d\u009a\u0019\u0001W@¾\u000f\u0018é\u0094Eô\u0084!\u0088-¿Ô7vº\u0088\u0016+6ÜªMV\n7^\u008a`ªé:w\u0010³éc¶å\r\tó7|kI¡Ö\u0019gtD»îBn\u009f\nSS\u008d÷B\u0099 Vè\u0092;\u0011âLB\u009b¾+q\u001c%\u0017Àíµ v¶tés?ÍR\u00974â=p(\u0010¶ô×èÏT.Ò\u0091ùê\u008a\u0003:\u0091tÚ]ÛÇ\u0080\u001cÚÇI\u009b·\u0016réM5qÔ\u0097\u009e\"s\"(P\b\u0013½\u0087éF\u0014h\u001d\u0015 ð`_PYÅ¥+\u0003ÞÎsþ\u000bbGrç\u0018Ä¨}ä+¼À%É\u0010ÚC#´k\u007f!\u0093]\u0090sä\u000bÚq\u009a ;Kûð&6\u0005hòÜþý\u0089äôvGS½y(Uæ§\u0086QjX\u0016ù`Þ \u0099Ê]B\u009cÍ¢\u0085Æó·\u0093\\t5öõ\u0090\\Ê^d×\u009c¢µ\u000føÒòUû0\u0098\u0091÷PÈ\u000fth\u008b-\u008apª«®ðÓ5D\"ï½\u001c¬®\u001b\u0090\u0014\by\u009a<ê;:>\u0081Û=\u0082î}Lý~\u001c/«0¸¤© k½¿dÈÓ'ô\u007f÷\u0092[P*!ðI\u0083þ\u0018{m{\r\u0000\u009f®ÅiÜS\u0080ÔZ¹õÉ²\u00843-\u0006\u000e~\u0018µ\u008fDMª{Ò(EýÑâ¨0ô®¿Ún\u0090\\?Ò]h\u0098\u0006Kû\u0084u-÷]K\u0088Õá\u0019JJ\u0001Hi\u0080\u00835²\u009buLÉq\u0004/;-©°ä\\-Þh¸\u0088\u0016\u000e~\u0013#çÑqHÙ\u0007H\u0006/Gw¹}\\1ÊË\u000b ©Ü\u0001°\u001d\u0090êÑN0ÕzÓ×,¬l9õ\u0018\u0002Í\u0086u#/5Ôy\u0000ðZ5E$\u0000ò\u000e\u001b8.+õ3\u0017;~\u0099Ä[\u0019\u0001OÕ%ª:Éøï\u009e\u0000g\u009a§#\u00074*1\u0013\u0007¯,.\u0081CÒ\u0082\u008dë¿V- L\\iQ\u0004z>æ\u000eä]HÎËÛ©ËüæI»ÁU\u0011\u0010®E\b;f@ï\\Q\u008fVõÔfQÍßðÓÏ{=eg\u0081Ø\u00963ó6\u0000\u0014ÄÅ\u008f\u009eß\u0006ä»ÁÌÑ£×jt¥ÃüÙ¡\b´~\u000eà\u0000D\u00187'\u008b\u0081þSÕ¢_jùK\u0080ê¼L\u000b\u0098êvi\u008c)Ý\u0018¦#Í£âaj \u0097=(\u0085þdÌ\u008b\t0£ÍðìÈ\u001f(FÖ\u008ePÀ\\ìè »Ë\u008d\t`\tÓ\u00ad\u0091ñ<s\u0013\u0083[\u0084Â\u008eÄàAg¥×\u001a®p/4N3h\u0093y¿øå©Ô¨[.=\u00adnüç\"\raUØ\r\u0097\u0087ZbÉ\u0098\u000b#f\u0090iÿçx\u0007aE}4«åC\u001d3¼µW\u008e\u001b\u001e\u008a\u0007Îd]LªYj:\u001a+tG\u0010\u0000ßa\u0016<\u00988Ùëu\u0086ýËà\u0088>*·[ïéu\u008b\u008d¤8<Û\u0093\u0084\u008aøÉU¸&qâHºÎº\u000fúÓZC\u001c= hRÑd\u001c:u\u007f\u0005Y½Ø9¤\u0001{Õ¤þT\u0016\u00ad\u0007Ìmò¤\r7\u000fØF\u000eµ»KUxÁòKðº±\u009f\u0091û\u0083H\u008c\u000eæ\u0016\r\nc\u000f\u0088\u0092þZx:Úåk®¹\u0088§¼°\u0010D\u008eÿT´3`@\u001c$µµÞKAÞ´|\u0089.Å\u0089Z´4íÍ\u007f\u009d|/ýµ`Pä©¶Þ\u0012aýÛ\u00164\u008d\u0089ÑÉ?\u008eißNÎé32NWßTñz\náG'¶¬\u0006\u0093¨rÖ\u0011qÌK.\u001b\u0084±«4k4\n\bKÐÍXxsW\u0000$åÚë\u009e\u000eø\rv\u0084\u0092ö@'Ëÿs\u000f¥ðµyv\u0012YX\u0015\t©ËÂÍtnÆä\u0097Ç\u000fø\u008b\u0010\f\u0012\\\u0089\u0005ÃüT\u009d\u007f%\u0016\u0004Óy\t\u007f_h²Öâs4\u009e·Ø²°\u0017\u001cX\u0018¨²\u0010\u008b©áíN\u0080\u000bÐD`w·Ë]£\u009bXc×\u0002~WE¾\u001c\u0094\u0081âå|\u0003¡\u0007\u00adqÜ`öP1\u0007ÉDPÞG\u009a÷\b¡\u0097½¸gL\u009eÍª¬\u0018.B&\u0096õ\u001f\r¤\b:Z¢n\u007f¦W£Ï-Õi[zþ¥í\u009f\u009bL\u0086ýÇ\u009c½àf\u001b\u008fùªê)\u007f`:06\u0012\u0006Axn\u0001\u0019wú\u0014ÍN^tD³¼\u0011\u0005«;!¢\u008b\u008aÚÏã¦\u001cÂ\u0097`\u008bWX\u001f\u007fé»GËÞ\u0091V3c8\u008amÅPÈ\u0017N\u0086YwÁ÷\u0014p)Øý\u009fï\u0018µ\u0006ÏÍ\u0007*¸ß\f6\u000b@1¸*\u0004\u0016áÛ7CìØÚ)ç9F7ÐBÇÛÝÅâ"
         .length();
      char var16 = ' ';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var43 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var43;
         if ((var15 += var16) >= var19) {
            var17 = "\"IÒ2ÿ\u0088*\u008fò]\u001c·G»Y\u0088 \bÁ®<Uý\u008a;:ª\u0089\u009e¥³k¼\u009f\u00adëm.kÌ\u0003+\u0086\u001eOå¶§0";
            var19 = "\"IÒ2ÿ\u0088*\u008fò]\u001c·G»Y\u0088 \bÁ®<Uý\u008a;:ª\u0089\u009e¥³k¼\u009f\u00adëm.kÌ\u0003+\u0086\u001eOå¶§0".length();
            var16 = '\u0010';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var45 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var21).intern();
               int var37 = 0;
               var20[var18++] = var45;
               if ((var15 += var16) >= var19) {
                  llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = var20;
                  lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new String[28];
                  lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "\u009aÉ\u009b¾< \u0085´\u0019ñ<Q7dLo=à\u0006\tm\u0011×#=ñÝÅf¼Î\u0093sb`\u0012¬ï?û";
                  int var5 = "\u009aÉ\u009b¾< \u0085´\u0019ñ<Q7dLo=à\u0006\tm\u0011×#=ñÝÅf¼Î\u0093sb`\u0012¬ï?û".length();
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

                  var4 = "Èü\u0086¼¾Ìã\u0010¢\n\u0093Ù\bðÐò";
                  var5 = "Èü\u0086¼¾Ìã\u0010¢\n\u0093Ù\bðÐò".length();
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

                  lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = var6;
                  IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new Long[7];
                  lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new SandMiningMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
                     null
                  );
                  IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new SandMiningMacro();
                  IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = new IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI();
                  return;
               }

               var16 = var17.charAt(var15);
            }
         }

         var16 = var17.charAt(var15);
      }
   }

   private static NullPointerException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(NullPointerException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3384;
      if (lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI", var10
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
         byte[] var9 = llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl[var5].getBytes("ISO-8859-1");
         lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII[var5];
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
            "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10126;
      if (IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var3] == null) {
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
         long var5 = lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl[var3];
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
         Object[] var9 = (Object[])lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI", var14
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
         IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var3] = var15;
      }

      return IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll[var3];
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
            "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a8aa65bd2d66867(
      SandMiningMacro var0, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
   ) {
      var2 = 38740441056584L;
      var2 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI ^ var2;
      long var10001 = var2 ^ 21846334533250L;
      int var4 = (int)((var2 ^ 21846334533250L) >>> 48);
      int var5 = (int)((var2 ^ 21846334533250L) << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$9b9f9dd10bd67334((short)var4, (char)var5, var1, var6);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$9b9f9dd10bd67334(
      short var1, char var2, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3, int var4
   ) {
      byte var15 = 0;
      short var16 = 4511;
      var4 = 2102010617;
      long var5 = ((long)var15 << 48 | (long)var16 << 48 >>> 16 | (long)var4 << 32 >>> 32)
         ^ lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
      long var7 = var5 ^ 3585694980703L;
      long var10001 = var5 ^ 118978259459403L;
      int var9 = (int)((var5 ^ 118978259459403L) >>> 32);
      int var10 = (int)((var5 ^ 118978259459403L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 96266796361468L;
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.MUSHROOM_DESERT,
         SandMiningMacro::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII,
         var3.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         SandMiningMacro::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2dea6c7ec1619410(
         var9, (short)var10, var14, (short)var11
      );
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final SandMiningMacro IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return SandMiningMacro.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
      }

      @NotNull
      public final IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return SandMiningMacro.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 54454934551990L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
         int argument1Arg, int argument2Arg, @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 4761286836143L;
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.playerPos = playerPosArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final SandMiningMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, long var2, int var4, @NotNull Triple var5
      ) {
         var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(20218, 1602423089489558014L ^ var2)
         );
         return new SandMiningMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var1, var4, var5);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 125935949303408L;
         Triple var3 = this.playerPos;
         int var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "BotProgress(pathIndex=" + var5 + ", waypointIndex=" + var4 + ", playerPos=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.playerPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 43299086708713L;
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
         String var6 = "\u0096Ý´§ø¸\u0088\u0084»<O\u0003mö\u0092\u000f$¸áÀ(ñ\u0019ù\u0018\u009b\u0016¡\u0018'\u009dc»\u0093¢\u008e\u0012Îò'\u008fÉ\u0086zæ«\u001f=ì\u0018\\#[~\u0081W\u000bMX+t2\u0096óñÅÔ\u0006Å\u0006\u0082-\u0081°";
         int var8 = "\u0096Ý´§ø¸\u0088\u0084»<O\u0003mö\u0092\u000f$¸áÀ(ñ\u0019ù\u0018\u009b\u0016¡\u0018'\u009dc»\u0093¢\u008e\u0012Îò'\u008fÉ\u0086zæ«\u001f=ì\u0018\\#[~\u0081W\u000bMX+t2\u0096óñÅÔ\u0006Å\u0006\u0082-\u0081°"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "£fQ`¡8f$\u0010\u0003ÕÝßpÞº¬T)\u008b\u0000¼\u0085\u008dBPàÉ\u001dûlõË\tCÉ\u0091\u0093: (ß×Ö]Ý¸¢ä\u000b\u0016\u0006ñ$C\u0083SÅ\u007f(KV¯\u0018\u0015<ì;µn,\u0098Ôg\u0013SU\u0087¾\u000f\t";
               var8 = "£fQ`¡8f$\u0010\u0003ÕÝßpÞº¬T)\u008b\u0000¼\u0085\u008dBPàÉ\u001dûlõË\tCÉ\u0091\u0093: (ß×Ö]Ý¸¢ä\u000b\u0016\u0006ñ$C\u0083SÅ\u007f(KV¯\u0018\u0015<ì;µn,\u0098Ôg\u0013SU\u0087¾\u000f\t"
                  .length();
               var5 = '(';
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 20148;
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
                  "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
               "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 114871873717120L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int argument1Arg, @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 99352605275564L;
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.playerPos = playerPosArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final SandMiningMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, long var2, @NotNull Triple var4
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(2641, 6164745946210725105L ^ var2)
         );
         return new SandMiningMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var1, var4);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 119547023471574L;
         return "ApproachProgress(heldSlot="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", playerPos="
            + this.playerPos
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.playerPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 125587563785830L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = "\u0080Zi\u0091|×Ã\r~Æ\u009asjd\u000e<\u0010#ô<\f@ãÝ×W\u0091_ÙEw\u009e\u0010\bxY\u001dt\u0012±\u00ad¨ñ\u0086\u009eXc\u0007\u0018¢QqñÓÈ7°\u001f=äÈ\u001d8Iµ\u0016`ÈÄ\u008d6ù¡";
         int var8 = "\u0080Zi\u0091|×Ã\r~Æ\u009asjd\u000e<\u0010#ô<\f@ãÝ×W\u0091_ÙEw\u009e\u0010\bxY\u001dt\u0012±\u00ad¨ñ\u0086\u009eXc\u0007\u0018¢QqñÓÈ7°\u001f=äÈ\u001d8Iµ\u0016`ÈÄ\u008d6ù¡"
            .length();
         char var5 = '0';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u008bmÏ\u0094Ï_6Ë\u001aê\u001eíå\u0004Nî\u0084e\u000f¯Y\u0092g^ §\u0093\u001e¼k\u0085¬Í\u0004ëèQÓÔ\u0097ÒÙr ¦_ø¿\u0086\u000e±°&±'\u0086 ";
               var8 = "\u008bmÏ\u0094Ï_6Ë\u001aê\u001eíå\u0004Nî\u0084e\u000f¯Y\u0092g^ §\u0093\u001e¼k\u0085¬Í\u0004ëèQÓÔ\u0097ÒÙr ¦_ø¿\u0086\u000e±°&±'\u0086 "
                  .length();
               var5 = '\u0018';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[4];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 8174;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
               "me/octo/client/modules/impl/macros/IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
