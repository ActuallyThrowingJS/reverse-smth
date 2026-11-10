package me.octo.client.utils.player;

import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll
   extends IIIIIIIIIIllllIlIIllIlllllIIIlIlIlIllllIIIIllIlIIlllIlllllIlIIIIlIIIIIllllIIIlIlIlllI {
   private float IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private float lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private float lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private boolean lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private float lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private float IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private float llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private float IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private float IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private float IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private float IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private float IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private final float[][] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 91699443196112L;
   private static String IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;

   public IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
      @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII coreArg
   ) {
      long var2 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 68992933333302L;
      Intrinsics.checkNotNullParameter(coreArg, "core");
      super(coreArg);
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = 0.016F;
      int var4 = 0;

      float[][] var5;
      for (var5 = new float[4][]; var4 < 4; var4++) {
         var5[var4] = new float[2];
      }

      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var5;
   }

   private final Random IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return this.getCore().IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, float param2, float param3, float param4, long param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      char param1, int param2, short param3, float param4, float param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(byte param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(float param1, float param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float param1, int param2, char param3, char param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Pair llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(float param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 0.0F;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 0.0F;
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0.0F;
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0.0F;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = false;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 0.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0.0F;
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 0.0F;
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = 0.0F;
   }

   private final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * var3;
   }

   private final float IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(float param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 114403959996235L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("¡Ê¿0Þ\u008d\u0003\u0085".getBytes("ISO-8859-1"));
      String var5 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4).intern();
      byte var10001 = -1;
      IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var5;
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
}
