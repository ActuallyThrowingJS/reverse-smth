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
import me.octo.client.utils.player.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII
   extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static double IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static double lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static double IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 84634368069373L;
   private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

   private IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII() {
   }

   private final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(double var1, double var3) {
      double var5 = Math.toRadians(var1);
      double var7 = Math.toRadians(var3);
      double var9 = Math.cos(-var7);
      double var11 = Math.sin(-var7);
      double var13 = Math.cos(-var5 - Math.PI);
      double var15 = Math.sin(-var5 - Math.PI);
      return new Vec3(var15 * var9, var11, var13 * var9);
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 var1, double var2, long var4, double var6, double var8, int var10
   ) {
      var4 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ var4;
      Vec3 var12 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var6);
      double var24 = 0.0;
      var24 = var12.x * 0.6;
      double var26 = 0.0;
      var26 = var12.y * 0.6;
      double var28 = 0.0;
      var28 = var12.z * 0.6;
      double var30 = 0.0;
      var30 = var1.x;
      double var32 = 0.0;
      var32 = var1.y;
      double var34 = 0.0;
      var34 = var1.z;
      double var13 = var30;
      double var15 = var34;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3118298312283602956L, var4
      );
      double var36 = 0.0;
      String[] var11 = var10000;
      int var17 = 0;

      label34: {
         while (true) {
            if (var17 < var10) {
               boolean var19 = false;
               if (var11 != null) {
                  double var44 = var26 - 0.03;
                  var24 *= 0.92;
                  var26 = var44 * 0.92;
                  var28 *= 0.92;
                  var36 = var32;
                  var30 += var24;
                  var32 += var26;
                  var34 += var28;

                  try {
                     var50 = var36;
                     if (var11 == null) {
                        break;
                     }

                     if ((var36 - var8) * (var32 - var8) <= 0.0) {
                        break label34;
                     }
                  } catch (MatchException var38) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var38, -3049479778368082357L, var4
                     );
                  }

                  var17++;
               }

               if (var11 != null) {
                  continue;
               }
            }

            var50 = var30 - var13;
            break;
         }

         double var40 = var50;
         double var41 = var34 - var15;
         return Math.sqrt(var40 * var40 + var41 * var41);
      }

      double var20 = var30 - var13;
      double var22 = var34 - var15;
      return Math.sqrt(var20 * var20 + var22 * var22);
   }

   private final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, Vec3 var3, double var4, double var6, int var8
   ) {
      var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ var1;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         185988188086954457L, var1
      );
      Vec3 var10 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var6);
      String[] var9 = var10000;
      double var14 = 0.0;
      var14 = var10.x * 0.6;
      double var16 = 0.0;
      var16 = var10.y * 0.6;
      double var18 = 0.0;
      var18 = var10.z * 0.6;
      double var20 = 0.0;
      var20 = var3.x;
      double var22 = 0.0;
      var22 = var3.y;
      double var24 = 0.0;
      var24 = var3.z;
      int var11 = 0;

      while (var11 < var8) {
         boolean var13 = false;
         double var29 = var16 - 0.03;
         var14 *= 0.92;
         var16 = var29 * 0.92;
         var18 *= 0.92;
         var20 += var14;
         var22 += var16;
         var24 += var18;
         var11++;
         if (var9 == null) {
            break;
         }
      }

      return new Vec3(var20, var22, var24);
   }

   @Nullable
   public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull AABB param1, boolean param2, @Nullable Vec3 param3, long param4, boolean param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 7484143109446L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "=Vºâ\u0003´îòÜ¥Ð\u0086ª\u0085ç×»BÙ\u0090\u00188¤\b¨.âÂ\u0083¬\u007fòËtlo¸B\u0091íÈ\u0082§í½Í97u²\u0003g6\u0099áàZ|øøÖ\u0091W(Ë\u0083*\u0088D1\u0097gøM\u008aµ\u0084\nÎB¯lG¥W\u0015ß¯\u0092âH¶ÔÊBA\u008eÍx[\u0019ÇÈ?Èu\u0013-0\u0083\u0012`i°3ªøF;þ²M\u008b=\fÞÀîOùé\u0093~\u0082ksí\u001cúæ\u009bá\u0006\u0084ä\u008c~Ïc@\u009f^\u00181\u001cI`hó{\u00172·7\u0011\u008e\u0091I\f\u0086\u009eõMe\u0010KDÇá\u009d\u0011ÚçÌØâiûÀ¹\u009eó!@xFCM±É6\u0011j\u0088¿WøZÑ\u009aô+Í\u0007Ø^\u0015²ÚgÓ\u0016\u0088Pþ\u007f\bf&\u0096ò\u009d»\u0000:3\u0093&@\u008a\u009ejª0-·¾ðoØSÙd%\u0095QÇB\u0010\u0012`T)yH;Ðp0î\u0007\u0018àÌ\u0011";
      int var8 = "=Vºâ\u0003´îòÜ¥Ð\u0086ª\u0085ç×»BÙ\u0090\u00188¤\b¨.âÂ\u0083¬\u007fòËtlo¸B\u0091íÈ\u0082§í½Í97u²\u0003g6\u0099áàZ|øøÖ\u0091W(Ë\u0083*\u0088D1\u0097gøM\u008aµ\u0084\nÎB¯lG¥W\u0015ß¯\u0092âH¶ÔÊBA\u008eÍx[\u0019ÇÈ?Èu\u0013-0\u0083\u0012`i°3ªøF;þ²M\u008b=\fÞÀîOùé\u0093~\u0082ksí\u001cúæ\u009bá\u0006\u0084ä\u008c~Ïc@\u009f^\u00181\u001cI`hó{\u00172·7\u0011\u008e\u0091I\f\u0086\u009eõMe\u0010KDÇá\u009d\u0011ÚçÌØâiûÀ¹\u009eó!@xFCM±É6\u0011j\u0088¿WøZÑ\u009aô+Í\u0007Ø^\u0015²ÚgÓ\u0016\u0088Pþ\u007f\bf&\u0096ò\u009d»\u0000:3\u0093&@\u008a\u009ejª0-·¾ðoØSÙd%\u0095QÇB\u0010\u0012`T)yH;Ðp0î\u0007\u0018àÌ\u0011"
         .length();
      char var5 = '\u0018';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "eù¦ößø%\u0006F·A\u009eÉxv\u0091Ã6Ú>,7Yµ-\u0016\u0094hå\u0017'û4}\u000f\u0006¼\u0095_\u0099Q\u0084óGÚ\u0006ehËà}sË÷AJ\u0018\u008c\u00174:÷±Å×}~ø¶i#o£\u001dzò÷¼NdÇ";
            var8 = "eù¦ößø%\u0006F·A\u009eÉxv\u0091Ã6Ú>,7Yµ-\u0016\u0094hå\u0017'û4}\u000f\u0006¼\u0095_\u0099Q\u0084óGÚ\u0006ehËà}sË÷AJ\u0018\u008c\u00174:÷±Å×}~ø¶i#o£\u001dzò÷¼NdÇ"
               .length();
            var5 = '8';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[6];
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5183;
      if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII", var10
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
         byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
         lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
            "me/octo/client/modules/impl/macros/IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$bc07ed27d4a009de(
      IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII var0,
      int var1,
      AABB var2,
      int var3,
      boolean var4,
      Vec3 var5,
      boolean var6,
      int var7,
      byte var8,
      Object var9
   ) {
      var6 = 0;
      byte var24 = 12;
      long var10 = ((long)var1 << 32 | (long)var3 << 40 >>> 32 | (long)var8 << 56 >>> 56)
         ^ llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      long var12 = var10 ^ 5912714655367L;
      String[] var14 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6585446418363658282L, var10
      );

      byte var10000;
      byte var10001;
      label59: {
         label58: {
            byte var15;
            byte var16;
            label57: {
               try {
                  var16 = 2;
                  var15 = var24;
                  if (var14 == null) {
                     break label57;
                  }

                  if ((var24 & var16) == 0) {
                     break label58;
                  }
               } catch (MatchException var22) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var22, -6517749730442715543L, var10
                  );
               }

               var4 = true;
               break label58;
            }

            var10000 = var15;
            var10001 = var16;
            break label59;
         }

         var10000 = var24;
         var10001 = 4;
      }

      label48: {
         byte var17;
         byte var18;
         label47: {
            label46: {
               try {
                  var18 = var10001;
                  var17 = var10000;
                  if (var14 == null) {
                     break label47;
                  }

                  if ((var17 & var18) == 0) {
                     break label46;
                  }
               } catch (MatchException var21) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var21, -6517749730442715543L, var10
                  );
               }

               var5 = null;
            }

            try {
               var10000 = var24;
               var10001 = 8;
               break label48;
            } catch (MatchException var19) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var19, -6517749730442715543L, var10
               );
            }
         }

         var10000 = var17;
         var10001 = var18;
      }

      try {
         if ((var10000 & var10001) == 0) {
            return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var4, var5, var12, (boolean)var6);
         }

         var26 = false;
      } catch (MatchException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, -6517749730442715543L, var10
         );
      }

      boolean var28 = var26;
      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var4, var5, var12, var28);
   }

   static Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6fb84c49c3b1b37c(
      IlllllIIlIllIIIlIlIllIIIIllIlIlIlllIIIIIlllIlIIIIllIIllIIlllIlIlIllIIlIIllllIIllIIIII param0,
      int param1,
      int param2,
      Vec3 param3,
      double param4,
      double param6,
      int param8,
      short param9,
      int param10,
      Object param11
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
