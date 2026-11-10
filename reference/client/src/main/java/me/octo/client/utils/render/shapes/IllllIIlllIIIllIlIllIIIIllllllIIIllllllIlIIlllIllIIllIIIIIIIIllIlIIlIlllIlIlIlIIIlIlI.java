package me.octo.client.utils.render.shapes;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 58592033559375L;
   private static String IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1, float var2, float var3, float var4, float var5, float var6, long var7
   ) {
      var7 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var7;
      long var9 = var7 ^ 39802191603653L;
      NVGRenderer.rect(var2, var3, var4, var5, new Color(35, 35, 35, 255), var6);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var9, var3, var4, var5, var6, var1);
      NVGRenderer.hollowRect(var2, var3, var4, var5, 1.0F, new Color(60, 60, 60, 255), var6);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, long var2, float var4, float var5, float var6, float var7, int var8
   ) {
      var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var2;
      long var10001 = var2 ^ 16082522336582L;
      int var9 = (int)((var2 ^ 16082522336582L) >>> 32);
      int var10 = (int)((var2 ^ 16082522336582L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      Color var12 = new Color(var8);
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + 2.0F,
            var9,
            var4 + 2.0F,
            var5 - 4.0F,
            var6 - 4.0F,
            (char)var10,
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            (short)var11,
            Color.BLACK,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
            var7 - 2.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + 2.0F,
            var9,
            var4 + 2.0F,
            var5 - 4.0F,
            var6 - 4.0F,
            (char)var10,
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
            (short)var11,
            var12,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            var7 - 2.0F
         );
      Color var13 = new Color(0, 0, 0, 20);
      NVGRenderer.rect(var1 + 2.0F, var4 + 2.0F, var5 - 4.0F, var6 - 4.0F, var13, var7 - 2.0F);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, long var3, float var5, float var6
   ) {
      var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var3;
      long var7 = var3 ^ 26652896409272L;
      long var10001 = var3 ^ 59419722851516L;
      int var9 = (int)((var3 ^ 59419722851516L) >>> 32);
      int var10 = (int)((var3 ^ 59419722851516L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      Color var13 = new Color(255, 0, 0, 255);
      Color var14 = new Color(255, 255, 0, 255);
      Color var15 = new Color(0, 255, 0, 255);
      Color var16 = new Color(0, 255, 255, 255);
      Color var17 = new Color(0, 0, 255, 255);
      lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6452217873274227707L, var3
      );
      Color var18 = new Color(255, 0, 255, 255);
      float var19 = var5 / 6.0F;
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1,
            var2,
            var19 + 1.0F,
            var7,
            var6,
            var13,
            var14,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            4.0F,
            4.0F,
            0.0F,
            0.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + var19,
            var9,
            var2,
            var19 + 1.0F,
            var6,
            (char)var10,
            var14,
            (short)var11,
            var15,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            0.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + var19 * 2,
            var9,
            var2,
            var19 + 1.0F,
            var6,
            (char)var10,
            var15,
            (short)var11,
            var16,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            0.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + var19 * 3,
            var9,
            var2,
            var19 + 1.0F,
            var6,
            (char)var10,
            var16,
            (short)var11,
            var17,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            0.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + var19 * 4,
            var9,
            var2,
            var19 + 1.0F,
            var6,
            (char)var10,
            var17,
            (short)var11,
            var18,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            0.0F
         );
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1 + var19 * 5,
            var2,
            var19 + 1.0F,
            var7,
            var6,
            var18,
            var13,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            0.0F,
            0.0F,
            4.0F,
            4.0F
         );

      try {
         NVGRenderer.hollowRect(var1, var2, var5, var6, 1.0F, new Color(60, 60, 60, 255), 4.0F);
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               -6466046822673770212L, var3
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[5], -6587187155833320416L, var3
            );
         }
      } catch (MatchException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, -6505229983136321560L, var3
         );
      }
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, float param3, long param4, float param6, float param7, int param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      float var1, float var2, float var3, long var4, float var6
   ) {
      var4 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var4;
      long var7 = var4 ^ 101187673965699L;
      long var10001 = var4 ^ 125553441625735L;
      int var9 = (int)((var4 ^ 125553441625735L) >>> 32);
      int var10 = (int)((var4 ^ 125553441625735L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         6074892167977944638L, var4
      );
      Color var13 = new Color(255, 0, 0, 255);
      Color var14 = new Color(255, 255, 0, 255);
      Color var15 = new Color(0, 255, 0, 255);
      Color var16 = new Color(0, 255, 255, 255);
      Color var17 = new Color(0, 0, 255, 255);
      Color var18 = new Color(255, 0, 255, 255);
      float var19 = var6 / 6.0F;
      int[] var12 = var10000;

      try {
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var2,
               var3,
               var7,
               var19 + 1.0F,
               var13,
               var14,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               var3 / 2.0F,
               0.0F,
               0.0F,
               var3 / 2.0F
            );
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var9,
               var2 + var19,
               var3,
               var19 + 1.0F,
               (char)var10,
               var14,
               (short)var11,
               var15,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               0.0F
            );
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var9,
               var2 + var19 * 2,
               var3,
               var19 + 1.0F,
               (char)var10,
               var15,
               (short)var11,
               var16,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               0.0F
            );
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var9,
               var2 + var19 * 3,
               var3,
               var19 + 1.0F,
               (char)var10,
               var16,
               (short)var11,
               var17,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               0.0F
            );
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var9,
               var2 + var19 * 4,
               var3,
               var19 + 1.0F,
               (char)var10,
               var17,
               (short)var11,
               var18,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               0.0F
            );
         NVGRenderer.INSTANCE
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1,
               var2 + var19 * 5,
               var3,
               var7,
               var19 + 1.0F,
               var18,
               var13,
               llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.TopToBottom,
               0.0F,
               var3 / 2.0F,
               var3 / 2.0F,
               0.0F
            );
         NVGRenderer.hollowRect(var1, var2, var3, var6, 1.0F, new Color(60, 60, 60, 255), var3 / 2.0F);
         if (var12 == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[1], 6292955764444697365L, var4
            );
         }
      } catch (MatchException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, 6306028978180234707L, var4
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, float var3, float var4, int var5, long var6
   ) {
      var6 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var6;
      long var10001 = var6 ^ 70523254665429L;
      int var8 = (int)((var6 ^ 70523254665429L) >>> 32);
      int var9 = (int)((var6 ^ 70523254665429L) << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         8222561569954062444L, var6
      );
      float var12 = var4 / 2.0F;
      NVGRenderer.rect(var1, var2, var3, var4, new Color(18, 18, 18, 255), var12);
      int[] var11 = var10000;
      float var13 = 4.0F;
      int var14 = RangesKt.coerceAtLeast((int)(var4 / var13), 1);
      int var15 = RangesKt.coerceAtLeast((int)(var3 / var13), 1);
      int var16 = 0;

      while (var16 < var14) {
         int var17 = 0;

         while (true) {
            if (var17 < var15) {
               label31: {
                  try {
                     if (var11 == null) {
                        break;
                     }

                     if ((var16 + var17) % 2 == 0) {
                        break label31;
                     }
                  } catch (MatchException var22) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var22, 8201531983491480449L, var6
                     );
                  }

                  float var18 = var1 + var17 * var13;
                  float var19 = var2 + var16 * var13;
                  float var20 = Math.min(var13, var1 + var3 - var18);
                  float var21 = Math.min(var13, var2 + var4 - var19);
                  NVGRenderer.rect(var18, var19, var20, var21, new Color(60, 60, 60, 255), 0.0F);
               }

               var17++;
               if (var11 != null) {
                  continue;
               }
            }

            var16++;
            break;
         }

         if (var11 == null) {
            break;
         }
      }

      Color var24 = new Color(var5).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.0F);
      Color var25 = new Color(var5).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(1.0F);
      NVGRenderer.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var1,
            var8,
            var2,
            var3,
            var4,
            (char)var9,
            var24,
            (short)var10,
            var25,
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.LeftToRight,
            var12
         );
      NVGRenderer.hollowRect(var1, var2, var3, var4, 1.0F, new Color(70, 70, 70, 255), var12);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float argument1Arg, long argument2Arg, float argument3Arg, float argument4Arg, float argument5Arg, @NotNull Color colorArg
   ) {
      argument2Arg = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ argument2Arg;
      long var8 = argument2Arg ^ 63042604298313L;
      Intrinsics.checkNotNullParameter(colorArg, "color");
      NVGRenderer.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var8, argument1Arg, argument3Arg, argument4Arg, argument5Arg, colorArg
      );
   }

   static {
      long var0 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 102665769290886L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("£Üh,ªµ®y".getBytes("ISO-8859-1"));
      String var5 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4).intern();
      byte var10001 = -1;
      IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var5;
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
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
}
