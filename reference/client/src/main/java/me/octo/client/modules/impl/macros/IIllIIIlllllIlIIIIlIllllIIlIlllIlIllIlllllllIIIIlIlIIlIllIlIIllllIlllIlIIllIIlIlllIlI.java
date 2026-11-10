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
import me.octo.client.modules.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI
   extends lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII {
   @NotNull
   private final Vec3 IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private static int[] lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private static long llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 7407001415002L;
   private static String[] lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static String[] IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private static Map lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new HashMap(13);

   public IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI() {
      long var1 = llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI ^ 79169357464931L;
      List var10003 = CollectionsKt.listOf(new AABB(-171.0, 133.0, 92.0, -55.0, 166.0, 186.0));
      List var10004 = CollectionsKt.listOf(new AABB(-165.0, 138.0, 158.0, -150.0, 148.0, 200.0));
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10005 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      List var10006 = CollectionsKt.listOf(RemotePlayer.class);
      String[] var3 = new String[]{"Goblin", "Weakling"};
      super(
         new me.octo.client.modules.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll(
            var10003,
            var10004,
            var10005,
            var10006,
            CollectionsKt.listOf(var3),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            CollectionsKt.emptyList(),
            false,
            false,
            null,
            1792,
            null
         )
      );
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new Vec3(-137.5, 145.5, 138.5);
   }

   @Override
   public double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param1,
      @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param3,
      @NotNull LocalPlayer param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int[] var0) {
      lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var0;
   }

   public static int[] IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI() {
      return lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }

   static {
      long var9 = llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI ^ 63237319779410L;
      int[] var10000 = new int[2];
      int[] var11 = var10000;
      IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
      Cipher var0;
      Cipher var14 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "¬¦NÍ¿\u0084Û\u0004îð\u0091úñÿ~Å \u0098\u0010\u009dI!\u0088FßOP\u0016\u0016Üû\u0002ß;\u0016¿@\u0001$¡\u0010\nox\u009f\nt\u008dÍ";
      int var6 = "¬¦NÍ¿\u0084Û\u0004îð\u0091úñÿ~Å \u0098\u0010\u009dI!\u0088FßOP\u0016\u0016Üû\u0002ß;\u0016¿@\u0001$¡\u0010\nox\u009f\nt\u008dÍ".length();
      char var3 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var13 += var3) >= var6) {
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var7;
                     IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new String[4];
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "\u0006\u00023:ð\u0095\u0098\n\u0016Uç+É7Wr\u0010\u0094áÆ)\u0015\u0089Æù\u0083ê\u001eA}\u001d\u009f\u0093";
                  var6 = "\u0006\u00023:ð\u0095\u0098\n\u0016Uç+É7Wr\u0010\u0094áÆ)\u0015\u0089Æù\u0083ê\u001eA}\u001d\u009f\u0093".length();
                  var3 = 16;
                  var13 = -1;
            }

            var15 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30776;
      if (IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI", var10
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
         byte[] var9 = lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII[var5].getBytes("ISO-8859-1");
         IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll[var5];
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
            "me/octo/client/modules/impl/macros/IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
