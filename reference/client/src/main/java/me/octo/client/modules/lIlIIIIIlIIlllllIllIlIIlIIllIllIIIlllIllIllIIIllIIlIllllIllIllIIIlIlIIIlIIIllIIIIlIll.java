package me.octo.client.modules;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll {
   @NotNull
   public static lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 3145537227905L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   private lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll() {
   }

   private final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      Lazy var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Object var10000 = var3.getValue();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(26361, 5632431847398770764L ^ var1)
      );
      return (Path)var10000;
   }

   private final Path llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      Lazy var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Object var10000 = var3.getValue();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(16463, 2708829744309865513L ^ var1)
      );
      return (Path)var10000;
   }

   @NotNull
   public final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1, char param2, short param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @NotNull String var2, long var3
   ) {
      var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var3;
      long var10001 = var3 ^ 55580685779687L;
      int var5 = (int)((var3 ^ 55580685779687L) >>> 48);
      int var6 = (int)((var3 ^ 55580685779687L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25186, 2330525945112958668L ^ var3)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(27641, 5163523445530926918L ^ var3)
      );
      Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, (char)var5, (short)var6, var7)
         .resolve(var2 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(7884, 419562585071020658L ^ var3));
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25084, 7743090068231558481L ^ var3)
      );
      return var10000;
   }

   @NotNull
   public final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @NotNull String var2, @NotNull String var3, long var4
   ) {
      var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var4;
      long var10001 = var4 ^ 104776888715714L;
      int var6 = (int)((var4 ^ 104776888715714L) >>> 48);
      int var7 = (int)((var4 ^ 104776888715714L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25186, 2330574566863789545L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(10491, 2960927514304321399L ^ var4)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(27641, 5163633094539236451L ^ var4)
      );
      Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, (char)var6, (short)var7, var8)
         .resolve(var2)
         .resolve(var3 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(7884, 419670622252048727L ^ var4));
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25084, 7742979289720544884L ^ var4)
      );
      return var10000;
   }

   @NotNull
   public final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1, @NotNull String var2, @NotNull String var3, @NotNull String var4, long var5
   ) {
      var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var5;
      long var10001 = var5 ^ 8944630946692L;
      int var7 = (int)((var5 ^ 8944630946692L) >>> 48);
      int var8 = (int)((var5 ^ 8944630946692L) << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(16532, 2269288368690310483L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(10804, 5902395243931650040L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(2781, 2027348998442247942L ^ var5)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(21046, 1774743119400779764L ^ var5)
      );
      Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, (char)var7, (short)var8, var9)
         .resolve(var2)
         .resolve(var3)
         .resolve(var4 + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(6689, 3358930192512546798L ^ var5));
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(3194, 2905023991338852772L ^ var5)
      );
      return var10000;
   }

   @NotNull
   public final Path llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1, @NotNull String var3, @NotNull String var4
   ) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var10001 = var1 ^ 119910915867105L;
      int var5 = (int)((var1 ^ 119910915867105L) >>> 48);
      int var6 = (int)((var1 ^ 119910915867105L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25186, 2330594655941023178L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(26599, 2381553394058481739L ^ var1)
      );
      Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, (char)var5, (short)var6, var7)
         .resolve(var4);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25084, 7742994969124656727L ^ var1)
      );
      return var10000;
   }

   @NotNull
   public final Path llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull String var1, long var2, @NotNull String var4, @NotNull String var5
   ) {
      var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var2;
      long var10001 = var2 ^ 68283330299261L;
      int var6 = (int)((var2 ^ 68283330299261L) >>> 48);
      int var7 = (int)((var2 ^ 68283330299261L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25186, 2330538492601815382L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(27984, 5570504294535192173L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(17023, 9102653622037377358L ^ var2)
      );
      Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, (char)var6, (short)var7, var8)
         .resolve(var4)
         .resolve(var5);
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(25084, 7743086281942487755L ^ var2)
      );
      return var10000;
   }

   private static final Path IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      Path var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameDirectory
         .toPath()
         .resolve(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(15095, 3951212048938671218L ^ var0));
      boolean var4 = false;
      Intrinsics.checkNotNull(var2);
      FileAttribute[] var10001 = new FileAttribute[0];
      Intrinsics.checkNotNullExpressionValue(
         Files.createDirectories(var2, Arrays.copyOf(var10001, var10001.length)),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(12508, 429806353484486213L ^ var0)
      );
      return var2;
   }

   private static final Path IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(char var0, short var1, int var2) {
      long var3 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var2 << 32 >>> 32)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var5 = var3 ^ 99410518415990L;
      Path var7 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var5
         )
         .resolve(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(3051, 5154385135100687286L ^ var3));
      boolean var9 = false;
      Intrinsics.checkNotNull(var7);
      FileAttribute[] var10001 = new FileAttribute[0];
      Intrinsics.checkNotNullExpressionValue(
         Files.createDirectories(var7, Arrays.copyOf(var10001, var10001.length)),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(21472, 566365583796710311L ^ var3)
      );
      return var7;
   }

   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 88621148381758L;
      long var11 = var9 ^ 117072521803374L;
      long var10001 = var9 ^ 40695018973363L;
      int var13 = (int)((var9 ^ 40695018973363L) >>> 48);
      int var14 = (int)((var9 ^ 40695018973363L) << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[22];
      int var5 = 0;
      String var4 = "ôn²7'\t\u0085¦Bï\u0083YØ\u0099ÔñÓä\n -ûõ¿\u0010/ØÛ§pÐß½Ôo/\u009f¨À\u0014G\u0010/32\u0017©\t\u0099O\r\u0014e©r°\u0087L g4\u008d\nßËõ\u0085¼\u008f\n\u008fqT=\"¸F°\u001aJ_`Ï³&¸\u0017ôetq\u0010ð¸ÅP]½Fåû\u0091AïLW±w(U§¢\tN\u0013ÐÄ\u001b\u0011,J$B\u0091ú´¥!\u000b\u008bkOÍðö!=Í\u0005¦bfáj\u0000ù\u00ad\u009d7 âÙßÀ|¼  e©>¾\u008b\u0005F\u0096z\u009c!U>ì<\nR¡_ÞÚÒ\u000eÃ (®Ûò&]õÊô\u0082ó\u0087b`q#,áj\u0091¼¥¡F\u008c9O\u001f\u001c\u0014q\u0094( \b\u009f3\u0017YT²Ë°Í\u000e\\Íq\u0012(\u008cÎDÎ\u0015©w\u008fM\"*\u0003\u0080ÿ\u008c{ÝVd\u001bÑ\u0016] à\u00adW½>oß\u0091\u0094/ÓÈj§ÅÍ\u0019²Ò8U\u000b@²\u0096;É\u0012\u0090\u0098\u0091\u008d\u0018©ºXlí\u0014\u0015Ö\u0082Çô+ÌôÂ+ü*ø¯+uùM(¬\u009e/\f0\u0000\u0094ß(\u008d\\S\u0090ßµ#L\u0092GDTÄe\u0013ÇæyÖóHÇABGÉ0;KêK\u0018ëTT\u000e\u00144§c@¨H&\u0015ð0\u0017è\u0012\u0097\nUkðö\u0018.\u0089!âEÈ-¸\u009dXá¤m\r\u009aã¶ ¿ºéTq| GÑvú}ïÇ\u009cÅ²N+_vX-\u000b\u001c\u0004åFO \u0010I\u0094É_pDàó\u0018³ñ!c\u0018¶\u0098l7\u0007×]\u0016R\u001b\u008dmuË øÆ#\u007f ·\tÏ\u009fbÞ{Ô@L\u007f\u009c +T\u000e\u0001ßñVH\u0085\u0000ü1fo´ráø\b\u0010Is\u0096Á;|ì»dD\u0018Ì3@¥ç ±kóÈä4¾\u0099\fv\u000b\u0019Z\u0016\u0097Xæ\u0000m\u0089M²\u0013S\u008aC«¿i°\u009fV\u0010±\u009c\u0019´«µK¬\u0003º\u0017;XUf\u009e";
      int var6 = "ôn²7'\t\u0085¦Bï\u0083YØ\u0099ÔñÓä\n -ûõ¿\u0010/ØÛ§pÐß½Ôo/\u009f¨À\u0014G\u0010/32\u0017©\t\u0099O\r\u0014e©r°\u0087L g4\u008d\nßËõ\u0085¼\u008f\n\u008fqT=\"¸F°\u001aJ_`Ï³&¸\u0017ôetq\u0010ð¸ÅP]½Fåû\u0091AïLW±w(U§¢\tN\u0013ÐÄ\u001b\u0011,J$B\u0091ú´¥!\u000b\u008bkOÍðö!=Í\u0005¦bfáj\u0000ù\u00ad\u009d7 âÙßÀ|¼  e©>¾\u008b\u0005F\u0096z\u009c!U>ì<\nR¡_ÞÚÒ\u000eÃ (®Ûò&]õÊô\u0082ó\u0087b`q#,áj\u0091¼¥¡F\u008c9O\u001f\u001c\u0014q\u0094( \b\u009f3\u0017YT²Ë°Í\u000e\\Íq\u0012(\u008cÎDÎ\u0015©w\u008fM\"*\u0003\u0080ÿ\u008c{ÝVd\u001bÑ\u0016] à\u00adW½>oß\u0091\u0094/ÓÈj§ÅÍ\u0019²Ò8U\u000b@²\u0096;É\u0012\u0090\u0098\u0091\u008d\u0018©ºXlí\u0014\u0015Ö\u0082Çô+ÌôÂ+ü*ø¯+uùM(¬\u009e/\f0\u0000\u0094ß(\u008d\\S\u0090ßµ#L\u0092GDTÄe\u0013ÇæyÖóHÇABGÉ0;KêK\u0018ëTT\u000e\u00144§c@¨H&\u0015ð0\u0017è\u0012\u0097\nUkðö\u0018.\u0089!âEÈ-¸\u009dXá¤m\r\u009aã¶ ¿ºéTq| GÑvú}ïÇ\u009cÅ²N+_vX-\u000b\u001c\u0004åFO \u0010I\u0094É_pDàó\u0018³ñ!c\u0018¶\u0098l7\u0007×]\u0016R\u001b\u008dmuË øÆ#\u007f ·\tÏ\u009fbÞ{Ô@L\u007f\u009c +T\u000e\u0001ßñVH\u0085\u0000ü1fo´ráø\b\u0010Is\u0096Á;|ì»dD\u0018Ì3@¥ç ±kóÈä4¾\u0099\fv\u000b\u0019Z\u0016\u0097Xæ\u0000m\u0089M²\u0013S\u008aC«¿i°\u009fV\u0010±\u009c\u0019´«µK¬\u0003º\u0017;XUf\u009e"
         .length();
      char var3 = 24;
      int var17 = -1;

      label27:
      while (true) {
         String var18 = var4.substring(++var17, var17 + var3);
         byte var21 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var18.getBytes("ISO-8859-1"));
            String var26 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var21) {
               case 0:
                  var7[var5++] = var26;
                  if ((var17 += var3) >= var6) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[22];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll();
                     Minecraft var20 = Minecraft.getInstance();
                     Intrinsics.checkNotNullExpressionValue(var20, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var20;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
                        lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl
                     );
                     return;
                  }

                  var3 = var4.charAt(var17);
                  break;
               default:
                  var7[var5++] = var26;
                  if ((var17 += var3) < var6) {
                     var3 = var4.charAt(var17);
                     continue label27;
                  }

                  var4 = "°Ål©·¿o¾ßäW\u0090 &4c\u0018N{Î:ä\u0005F²j\u0014?\u0012\u0006\u000e\u007fFÊ[T\u0082\t\u0094ã\u008c";
                  var6 = "°Ål©·¿o¾ßäW\u0090 &4c\u0018N{Î:ä\u0005F²j\u0014?\u0012\u0006\u000e\u007fFÊ[T\u0082\t\u0094ã\u008c".length();
                  var3 = 16;
                  var17 = -1;
            }

            var18 = var4.substring(++var17, var17 + var3);
            var21 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12993;
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
            throw new RuntimeException("me/octo/client/modules/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll", var10);
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
            "me/octo/client/modules/lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
