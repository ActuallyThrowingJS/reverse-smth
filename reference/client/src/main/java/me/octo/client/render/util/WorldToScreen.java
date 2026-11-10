package me.octo.client.render.util;

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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.FloatRef;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.render.engine.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.utils.ModUtils;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class WorldToScreen {
   @NotNull
   public static WorldToScreen IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Matrix4f lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Vector3f IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Vector3f lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 130770569164916L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   private WorldToScreen() {
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Vector3f IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Vec3 param0, @NotNull Vec3 param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param0, int param1, @NotNull Vec3 param2, @NotNull Vec3 param3, int param4, @NotNull Vec3 param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   public static final void setMatrices(@NotNull Matrix4fc projectionMatrixArg, @NotNull Matrix4fc modelViewMatrixArg) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 25503553812142L;
      Intrinsics.checkNotNullParameter(projectionMatrixArg, "projectionMatrix");
      Intrinsics.checkNotNullParameter(modelViewMatrixArg, "modelViewMatrix");
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.set(projectionMatrixArg).mul(modelViewMatrixArg);
   }

   private final Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, Vector4f var3, Vector4f var4) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var5 = var1 ^ 90164689213858L;
      FloatRef var13 = new FloatRef();
      FloatRef var14 = new FloatRef();
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3262481296797648822L, var1
      );
      var14.element = 1.0F;
      String[] var12 = var10000;
      float var15 = 1.0E-5F;
      float var10003 = var3.x + var3.w;
      float var20 = var4.x;
      float var19 = var10003;
      float var66;
      FloatRef var10001;
      FloatRef var10002;
      float var10004;
      Vector4f var10005;
      if (var12 != null) {
         float var7 = var20 + var4.w;
         float var8 = var19;
         FloatRef var9 = var14;
         FloatRef var10 = var13;
         float var11 = var15;

         try {
            if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var11, var10, var9, var8, var7)) {
               return null;
            }
         } catch (MatchException var39) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var39, 3276807128893012511L, var1
            );
         }

         try {
            var66 = var15;
            var10001 = var13;
            var10002 = var14;
            var10003 = -var3.x + var3.w;
            var10004 = -var4.x;
            var10005 = var4;
         } catch (MatchException var33) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var33, 3276807128893012511L, var1
            );
         }
      } else {
         var66 = var15;
         var10001 = var13;
         var10002 = var14;
         var10003 = var19;
         var10004 = var20;
         var10005 = var4;
      }

      float var41 = var10004 + var10005.w;
      float var46 = var10003;
      FloatRef var51 = var10002;
      FloatRef var56 = var10001;
      float var61 = var66;

      try {
         if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var61, var56, var51, var46, var41)) {
            return null;
         }
      } catch (MatchException var32) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var32, 3276807128893012511L, var1
         );
      }

      label104: {
         float var22;
         label120: {
            try {
               var22 = var15;
               if (var12 == null) {
                  break label120;
               }

               var67 = var15;
               var10001 = var13;
               var10002 = var14;
               var10003 = var3.y + var3.w;
            } catch (MatchException var38) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var38, 3276807128893012511L, var1
               );
            }

            var41 = var4.y + var4.w;
            var46 = var10003;
            var51 = var10002;
            var56 = var10001;
            var61 = var67;

            try {
               if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var61, var56, var51, var46, var41)) {
                  return null;
               }
            } catch (MatchException var37) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var37, 3276807128893012511L, var1
               );
            }

            var68 = var15;
            break label104;
         }

         var68 = var22;
      }

      float var23 = var68;
      float var69;
      if (var12 != null) {
         var10003 = -var3.y + var3.w;
         var41 = -var4.y + var4.w;
         var46 = var10003;
         var51 = var14;
         var56 = var13;
         var61 = var23;

         try {
            if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var61, var56, var51, var46, var41)) {
               return null;
            }
         } catch (MatchException var36) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var36, 3276807128893012511L, var1
            );
         }

         var69 = var15;
         var10001 = var13;
         var10002 = var14;
      } else {
         var69 = var23;
         var10001 = var13;
         var10002 = var14;
      }

      var10003 = var3.z + var3.w;
      float var31 = var4.w;
      float var30 = var4.z;
      float var29 = var10003;
      FloatRef var28 = var10002;
      FloatRef var27 = var10001;
      float var26 = var69;
      float var70;
      float var83;
      if (var12 != null) {
         var41 = var30 + var31;
         var46 = var29;
         var51 = var28;
         var56 = var27;
         var61 = var26;

         try {
            if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var61, var56, var51, var46, var41)) {
               return null;
            }
         } catch (MatchException var35) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var35, 3276807128893012511L, var1
            );
         }

         var70 = var15;
         var10001 = var13;
         var10002 = var14;
         var10003 = -var3.z + var3.w;
         var10004 = -var4.z;
         var83 = var4.w;
      } else {
         var70 = var26;
         var10001 = var27;
         var10002 = var28;
         var10003 = var29;
         var10004 = var30;
         var83 = var31;
      }

      var41 = var10004 + var83;
      var46 = var10003;
      var51 = var10002;
      var56 = var10001;
      var61 = var70;

      try {
         if (!IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var61, var56, var51, var46, var41)) {
            return null;
         }
      } catch (MatchException var34) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var34, 3276807128893012511L, var1
         );
      }

      return TuplesKt.to(
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var13.element),
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var14.element)
      );
   }

   private final Vector4f IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vector4f var1, Vector4f var2, float var3) {
      return new Vector4f(
         var1.x + (var2.x - var1.x) * var3, var1.y + (var2.y - var1.y) * var3, var1.z + (var2.z - var1.z) * var3, var1.w + (var2.w - var1.w) * var3
      );
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param0, @NotNull Vec3 param2, @NotNull Vec3 param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Vector3f IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Vec3 var0, long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var10001 = var1 ^ 52814510166329L;
      int var3 = (int)((var1 ^ 52814510166329L) >>> 32);
      int var4 = (int)((var1 ^ 52814510166329L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var0, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(8917, 4710688172924007881L ^ var1)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var0, var3, null, (short)var4, (char)var5, 2, null);
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final Pair IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      long var0, @NotNull Vec3 var2, @NotNull Vec3 var3
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var4 = var0 ^ 49864780047289L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(20776, 7488670881304064780L ^ var0)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(25358, 3696738764251496743L ^ var0)
      );
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var3, null, 4, var4, null);
   }

   @JvmStatic
   @JvmOverloads
   @Nullable
   public static final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, @NotNull Vec3 var2
   ) {
      var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var0;
      long var3 = var0 ^ 83366196406064L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(4021, 3987481575833885173L ^ var0)
      );
      return llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2, null, var3, 2, null);
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, float param2, FloatRef param3, FloatRef param4, float param5, float param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 115828585707085L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "¾h\u001c\u0088\u0083§ú\u0091Üä\u0093\"XK\u0012\n`FÄX%áPÜþCÐ\u0081\u009dsõL:ª\u0094FK÷\u0097\u0096\u0010üA /,¹\u0002\u0094\u0005\u009açø2éïp\u0010¼:Ta.ò\u0098K\\ì\u0081$fgcG \u008e\u0011V\u001b2\u0007?ó=¢ßL|\u001eÕFÂ\u0010»$\u0084ñ+ø\f\u009c\u00ad*8ÕÁ\u0002 \u0095ø\u0097*ya5ðd\u009a8|>¦u\u0095Ô;oÏD\u0006+\u0007)\u009b69GK{E\u0010;G1QÂD´X\u0097Y\u001f\u008e\u009ej¦\u0092\u0018OçËÀ\u0085\u0001\u000fÁ\tóÎÍOÑé\u008c\u0019Ó¬\u001céÛp \u0010ns,¨ªViØ^ð$ã\u0090Ú!\u0089\u0010\u0018\u0001ürB×\u009aæ\u001b¯í¨¸nÿù\u0010$HçUN\u001dâB.ÉÖ\u0099uâ:q";
      int var8 = "¾h\u001c\u0088\u0083§ú\u0091Üä\u0093\"XK\u0012\n`FÄX%áPÜþCÐ\u0081\u009dsõL:ª\u0094FK÷\u0097\u0096\u0010üA /,¹\u0002\u0094\u0005\u009açø2éïp\u0010¼:Ta.ò\u0098K\\ì\u0081$fgcG \u008e\u0011V\u001b2\u0007?ó=¢ßL|\u001eÕFÂ\u0010»$\u0084ñ+ø\f\u009c\u00ad*8ÕÁ\u0002 \u0095ø\u0097*ya5ðd\u009a8|>¦u\u0095Ô;oÏD\u0006+\u0007)\u009b69GK{E\u0010;G1QÂD´X\u0097Y\u001f\u008e\u009ej¦\u0092\u0018OçËÀ\u0085\u0001\u000fÁ\tóÎÍOÑé\u008c\u0019Ó¬\u001céÛp \u0010ns,¨ªViØ^ð$ã\u0090Ú!\u0089\u0010\u0018\u0001ürB×\u009aæ\u001b¯í¨¸nÿù\u0010$HçUN\u001dâB.ÉÖ\u0099uâ:q"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u0017³\u000b\u0094qý/\rJ\u008cÌÔ^øJ÷\u001f§Ñ`Ç>Ù\u0082 H\u001fK]\t¶71ú\u0002\u0003\u0099I\u008eÐÇDô]ñ)\u000e\u009a^\u0085Qªúù^5<";
            var8 = "\u0017³\u000b\u0094qý/\rJ\u008cÌÔ^øJ÷\u001f§Ñ`Ç>Ù\u0082 H\u001fK]\t¶71ú\u0002\u0003\u0099I\u008eÐÇDô]ñ)\u000e\u009a^\u0085Qªúù^5<".length();
            var5 = '\u0018';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[12];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new WorldToScreen();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Matrix4f();
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new Vector3f();
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new Vector3f();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14067;
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
            throw new RuntimeException("me/octo/client/render/util/WorldToScreen", var10);
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
         throw new RuntimeException("me/octo/client/render/util/WorldToScreen" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static Pair IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$e2d9d49292930125(
      Vec3 var0, Vec3 var1, Vec3 var2, int var3, long var4, Object var6
   ) {
      var4 = 47687579613035L;
      var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var4;
      long var10001 = var4 ^ 116522635333340L;
      int var7 = (int)((var4 ^ 116522635333340L) >>> 48);
      int var8 = (int)((var4 ^ 116522635333340L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      if ((var3 & 4) != 0) {
         Vec3 var10000 = ModUtils.mc.gameRenderer.getMainCamera().position();
         Intrinsics.checkNotNullExpressionValue(var10000, "position(...)");
         var2 = var10000;
      }

      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var7, var8, var0, var1, var9, var2);
   }
}
