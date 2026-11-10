package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl {
   @NotNull
   public static lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 23509962481248L;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Map IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new HashMap(13);

   private lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl() {
   }

   @NotNull
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1
   ) {
      var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var1;
      List var10002 = CollectionsKt.listOf(Zombie.class);
      List var10003 = CollectionsKt.listOf(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(30467, 8918025130879129078L ^ var1)
      );
      List var10004 = CollectionsKt.listOf(new AABB(-160.0, 38.0, -149.0, -42.0, 61.0, -72.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(
         Vec3.ZERO, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(16833, 6107106113304208176L ^ var1)
      );
      return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.ZOMBIE,
         CollectionsKt.listOf(
            new IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl(
               new BlockPos(-154, 58, -100), me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.WALK
            )
         ),
         null,
         512,
         null
      );
   }

   @NotNull
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1
   ) {
      var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var1;
      long var10001 = var1 ^ 102568320019159L;
      int var3 = (int)((var1 ^ 102568320019159L) >>> 48);
      int var4 = (int)((var1 ^ 102568320019159L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      String var8 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         8684868040730005581L, var1
      );
      List var10002 = CollectionsKt.listOf(Wolf.class);
      List var10003 = CollectionsKt.listOf(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(4300, 6335443463639552680L ^ var1)
      );
      List var10004 = CollectionsKt.listOf(new AABB(-296.0, 86.0, 36.0, -196.0, 120.0, 111.0));
      AABB[] var9 = new AABB[]{new AABB(-268.0, 98.0, 57.0, -262.0, 119.0, 86.0), null};
      me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = me.octo.client.utils.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var10008 = new BlockPos(-259, 93, 79);
      BlockPos var6 = new BlockPos(-261, 95, 82);
      BlockPos var7 = var10008;
      var9[1] = var10007.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var3, var7, (char)var4, var5, var6);
      List var10005 = CollectionsKt.listOf(var9);
      Vec3 var10006 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(
         Vec3.ZERO, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(21967, 7421803168114579368L ^ var1)
      );
      lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll var10000 = new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.WOLF,
         CollectionsKt.listOf(
            new IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl(
               new BlockPos(-217, 90, 57), me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.WALK
            )
         ),
         null,
         512,
         null
      );
      if (var8 != null) {
         lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            new int[2], 8774754376700345734L, var1
         );
      }

      return var10000;
   }

   @NotNull
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      long var1
   ) {
      var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var1;
      List var10002 = CollectionsKt.listOf(EnderMan.class);
      List var10003 = CollectionsKt.listOf(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(11436, 1922612246841949199L ^ var1)
      );
      List var10004 = CollectionsKt.listOf(new AABB(-619.0, 6.0, -372.0, -527.0, 53.0, -287.0));
      AABB[] var3 = new AABB[]{new AABB(-571.0, 4.0, -329.0, -518.0, 20.0, -288.0), new AABB(-600.0, 8.0, -320.0, -570.0, 14.0, -288.0)};
      List var10005 = CollectionsKt.listOf(var3);
      Vec3 var10006 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(
         Vec3.ZERO, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(21967, 7421923441349428590L ^ var1)
      );
      return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.VOID,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.END,
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.ENDERMAN,
         CollectionsKt.emptyList(),
         null,
         512,
         null
      );
   }

   static {
      long var0 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 62977021409601L;
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
      String var6 = "·\u007f\u008d&O\u009b\u00adhE-\u0085\u008f£~\u0016\u0007\u0010ãþ\u0084N´\u001a|ÃF¨0ÚÔ1>)\u0010`máÀÌ^\u0016ÛÞ+\u0019\u000f$ý>Ï";
      int var8 = "·\u007f\u008d&O\u009b\u00adhE-\u0085\u008f£~\u0016\u0007\u0010ãþ\u0084N´\u001a|ÃF¨0ÚÔ1>)\u0010`máÀÌ^\u0016ÛÞ+\u0019\u000f$ý>Ï".length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u0017S\u001bAÎTÍôÓ\u0095¹®\u008e\u008f¢\u0089ªîí`f8\u00155\u0010\u0017½\u000fÅÄ5rÏD\u007fÉ\u0003}Tn£";
            var8 = "\u0017S\u001bAÎTÍôÓ\u0095¹®\u008e\u008f¢\u0089ªîí`f8\u00155\u0010\u0017½\u000fÅÄ5rÏD\u007fÉ\u0003}Tn£".length();
            var5 = '\u0018';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var9;
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new String[5];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl();
                  return;
               }

               var5 = var6.charAt(var4);
            }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14706;
      if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl", var10
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
         byte[] var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5].getBytes("ISO-8859-1");
         lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5];
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
            "me/octo/client/modules/impl/macros/lIIIIIlIIlIlllIIIIllllIIIIlllllIlIIlIlIllIIIlllIIlllllIIlllIlIIIllIllllIIIlllIllIIlIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @NotNull
   public final lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$19c9c85fa2229503(
      long var1
   ) {
      var1 = 111946474980839L;
      var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ var1;
      List var10002 = CollectionsKt.listOf(Zombie.class);
      List var10003 = CollectionsKt.listOf("Zombie");
      List var10004 = CollectionsKt.listOf(new AABB(-160.0, 38.0, -149.0, -42.0, 61.0, -72.0));
      List var10005 = CollectionsKt.emptyList();
      Vec3 var10006 = Vec3.ZERO;
      Intrinsics.checkNotNullExpressionValue(Vec3.ZERO, "ZERO");
      return new lIIIIIllIIIIlIIIIIllIIIlIIIlllIlIIlIlIlIIlIIIlIIIIlllIIlIlIIIIlIlllIllIlIIIlllllIIIll(
         var10002,
         var10003,
         var10004,
         var10005,
         var10006,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.HUB,
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.ZOMBIE,
         CollectionsKt.listOf(
            new IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl(
               new BlockPos(-154, 58, -100), me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.WALK
            )
         ),
         null,
         512,
         null
      );
   }
}
