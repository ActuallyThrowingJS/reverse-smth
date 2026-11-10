package me.octo.client.commands;

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
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.gui.llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll
public final class lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl
   implements IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 66760991687042L;
   private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   @NotNull
   @Override
   public lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1
   ) {
      long var3 = var1 ^ 96175107766332L;
      long var5 = var1 ^ 14866956877945L;
      return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(14449, 6688386399249808174L ^ var1),
         var5,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(16960, 2488765920380207378L ^ var1),
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII
      );
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var0, int var1, short var2, lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48)
         ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      long var10001 = var4 ^ 65301032762757L;
      int var6 = (int)((var4 ^ 65301032762757L) >>> 48);
      int var7 = (int)((var4 ^ 65301032762757L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(23072, 8912747194274522624L ^ var4)
      );
      me.octo.client.gui.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$45f40bdc8a0fb208((short)var6, (char)var7, 1, var8);
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var2
   ) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      long var10001 = var0 ^ 71432175669647L;
      int var3 = (int)((var0 ^ 71432175669647L) >>> 48);
      int var4 = (int)((var0 ^ 71432175669647L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(1999, 7409342184397854700L ^ var0)
      );
      me.octo.client.gui.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$07ed746a164d0777((short)var3, (char)var4, -1, var5);
      return Unit.INSTANCE;
   }

   private static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      Minecraft.getInstance().setScreen(new llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII());
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      Minecraft.getInstance()
         .execute(
            lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
         );
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0, short var1, char var2, lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      long var10001 = var4 ^ 8334758884045L;
      int var6 = (int)((var4 ^ 8334758884045L) >>> 56);
      int var7 = (int)((var4 ^ 8334758884045L) << 8 >>> 32);
      int var8 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 109357024649346L;
      int var9 = (int)((var4 ^ 109357024649346L) >>> 48);
      int var10 = (int)((var4 ^ 109357024649346L) << 16 >>> 32);
      int var11 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(8378, 4705125039584066961L ^ var4)
      );
      String[] var12 = new String[]{
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(21815, 7716151012141025300L ^ var4)
      };
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var12);
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         (byte)var6,
         var7,
         var8
      );
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      char var0, short var1, int var2, lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      long var10001 = var4 ^ 10900106974265L;
      int var6 = (int)((var4 ^ 10900106974265L) >>> 56);
      int var7 = (int)((var4 ^ 10900106974265L) << 8 >>> 32);
      int var8 = (int)(var10001 << 40 >>> 40);
      long var9 = var4 ^ 24856324582012L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(28899, 821633198111640368L ^ var4)
      );
      var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (byte)var6,
         var7,
         var8
      );
      return Unit.INSTANCE;
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      char param0, short param1, int param2, lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      long var0, lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var2
   ) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      long var10001 = var0 ^ 41686902019331L;
      int var3 = (int)((var0 ^ 41686902019331L) >>> 56);
      int var4 = (int)((var0 ^ 41686902019331L) << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      var10001 = var0 ^ 18382943174840L;
      int var6 = (int)((var0 ^ 18382943174840L) >>> 48);
      int var7 = (int)((var0 ^ 18382943174840L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      var10001 = var0 ^ 33833262704204L;
      int var9 = (int)((var0 ^ 33833262704204L) >>> 32);
      int var10 = (int)((var0 ^ 33833262704204L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var0 ^ 23040656414963L;
      var10001 = var0 ^ 138490910059832L;
      int var14 = (int)((var0 ^ 138490910059832L) >>> 48);
      int var15 = (int)((var0 ^ 138490910059832L) << 16 >>> 48);
      int var16 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(24659, 6662938023956470460L ^ var0)
      );
      String[] var17 = new String[]{
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(16009, 6369020379881735279L ^ var0)
      };
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var17);
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(10046, 7150372972035677654L ^ var0),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(26681, 4034315734432371411L ^ var0),
         var12,
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(32210, 2164682031084816185L ^ var0),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(27539, 8463996651280617847L ^ var0),
         var12,
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
      );
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
         (byte)var3,
         var4,
         var5
      );
      return Unit.INSTANCE;
   }

   static {
      long var5 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 111504402493752L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[13];
      int var12 = 0;
      String var11 = "8zo}u\u0093íQ\u008d \u0084\u009d\u0004a\u0013\u0002`\u0096\u0099\u0012d\u0082UªúP\u0003/\u0003\u001fÕôéÿß\u00874þ//JÊÔ\u0088û\u0011FÞ\"Hy\u0097&ì·»Úë¢]þµU í\u0092MC\u0091G/=[é@µ\u0013ÔE0GKf\u008c½^æ\u009d\u0017SËã\u000bëbi\u0013\u0089\fáÀ\u009bÌ\u00936¾áÐ\u0080\u0086@E³ ^Å\u008d[É\u008aPT¥bÃÑ~Z8\u001fM\u008fõ\u0015\u009b9¶b÷`<î :\u009dÝ E-=mî$h\u0092\u008bW.{ú\u0093a}ÚÙÀèÂÁ øz½ï\u000bEô³e\u0018LÐ\u0099\u0083ñå)Á\u007f\\\bê\u000bp\u0018¹\u00ad)4]\u008b\rÁ\u001d\u0010Al\u0096\u001695Ù\u0013\u0013\u0010\u0090\u0019þ·\u0005È\u0010\u009e$vNÍ,ññ\u000e'(6\f\u009eÆ2`m\u009e£ß>Ô\u0090su\u008d¥@\"¦:\u008b\u0087CF|Tî]Hïz\u000f\u007f\u0092\u0083¥Ûú¾>ÆÞ²P©ù\u007fl#}\u008cåÄ»·½¦\u009fJ\u0015\u0007Ê´Ñ)Í$xz\u001dlé\u0007Çµ±\u009cZ&D\u0085á\u0001PÀ\u009fno\u0082©îßzóMàÉ³ükN º\u000b\u0016\u009aýÓWÛ]s \u001dßìÑØ·%°Ôã\u0099\u009acûþñ\u0018oV\ræPÐ\u0086\u0010\nÁO\u0092×¢ÐÝØâºÔpz¿â\u000fõ\u0011JÆõSK/ #»¯âÖ³oË2_à\\N+}ß GÎ¼\t\u008a\u001aT\u00021`\u0080\u001f¢À[\u001f{µèÏý\u001bJ\rÕiÈ\u001aÈ¥¿½¢Å Ê\u0085\u000e£&Û\u0098Æ¦bt\u0012LõÅF\u0001\u009b\u009e/~XGî¶\u0016Â?Ò\u0000s\b";
      int var13 = "8zo}u\u0093íQ\u008d \u0084\u009d\u0004a\u0013\u0002`\u0096\u0099\u0012d\u0082UªúP\u0003/\u0003\u001fÕôéÿß\u00874þ//JÊÔ\u0088û\u0011FÞ\"Hy\u0097&ì·»Úë¢]þµU í\u0092MC\u0091G/=[é@µ\u0013ÔE0GKf\u008c½^æ\u009d\u0017SËã\u000bëbi\u0013\u0089\fáÀ\u009bÌ\u00936¾áÐ\u0080\u0086@E³ ^Å\u008d[É\u008aPT¥bÃÑ~Z8\u001fM\u008fõ\u0015\u009b9¶b÷`<î :\u009dÝ E-=mî$h\u0092\u008bW.{ú\u0093a}ÚÙÀèÂÁ øz½ï\u000bEô³e\u0018LÐ\u0099\u0083ñå)Á\u007f\\\bê\u000bp\u0018¹\u00ad)4]\u008b\rÁ\u001d\u0010Al\u0096\u001695Ù\u0013\u0013\u0010\u0090\u0019þ·\u0005È\u0010\u009e$vNÍ,ññ\u000e'(6\f\u009eÆ2`m\u009e£ß>Ô\u0090su\u008d¥@\"¦:\u008b\u0087CF|Tî]Hïz\u000f\u007f\u0092\u0083¥Ûú¾>ÆÞ²P©ù\u007fl#}\u008cåÄ»·½¦\u009fJ\u0015\u0007Ê´Ñ)Í$xz\u001dlé\u0007Çµ±\u009cZ&D\u0085á\u0001PÀ\u009fno\u0082©îßzóMàÉ³ükN º\u000b\u0016\u009aýÓWÛ]s \u001dßìÑØ·%°Ôã\u0099\u009acûþñ\u0018oV\ræPÐ\u0086\u0010\nÁO\u0092×¢ÐÝØâºÔpz¿â\u000fõ\u0011JÆõSK/ #»¯âÖ³oË2_à\\N+}ß GÎ¼\t\u008a\u001aT\u00021`\u0080\u001f¢À[\u001f{µèÏý\u001bJ\rÕiÈ\u001aÈ¥¿½¢Å Ê\u0085\u000e£&Û\u0098Æ¦bt\u0012LõÅF\u0001\u009b\u009e/~XGî¶\u0016Â?Ò\u0000s\b"
         .length();
      char var10 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var28 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var28;
         if ((var9 += var10) >= var13) {
            var11 = "p½¤ÑÒ\u001c/åsê\u0084FVAÝ<è©\u0087@µÒp\né~Ë\u0005¤\u00150¼ #\u0080\u0092Èeòlë\u009c²è\fäüÃ|óÀüg)m\u00107¥8Ú_¶U\u0003\u0095";
            var13 = "p½¤ÑÒ\u001c/åsê\u0084FVAÝ<è©\u0087@µÒp\né~Ë\u0005¤\u00150¼ #\u0080\u0092Èeòlë\u009c²è\fäüÃ|óÀüg)m\u00107¥8Ú_¶U\u0003\u0095".length();
            var10 = ' ';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var30 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var25 = 0;
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var14;
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[13];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -1303009856199744513L;
                  byte[] var4 = var0.doFinal(
                     new byte[]{
                        (byte)(var2 >>> 56),
                        (byte)(var2 >>> 48),
                        (byte)(var2 >>> 40),
                        (byte)(var2 >>> 32),
                        (byte)(var2 >>> 24),
                        (byte)(var2 >>> 16),
                        (byte)(var2 >>> 8),
                        (byte)var2
                     }
                  );
                  long var33 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  var25 = -1;
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var33;
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9522;
      if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/commands/lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl", var10);
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
            "me/octo/client/commands/lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
