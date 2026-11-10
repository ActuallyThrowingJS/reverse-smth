package me.octo.client.utils.player;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll
   extends me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 44724068736167L;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Map lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

   private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
   }

   @NotNull
   public final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull List param1, @NotNull List param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   @Nullable
   public final Entity llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, int var3) {
      var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ var1;
      int var4 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         70625028964168209L, var1
      );

      Entity var20;
      label67: {
         label71: {
            try {
               ClientLevel var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().level;
               if (var10000 == null) {
                  break label71;
               }

               var17 = var10000.entitiesForRendering();
               if (var17 == null) {
                  break label71;
               }
            } catch (MatchException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, 60518710214790577L, var1
               );
            }

            Iterable var5 = var17;
            boolean var6 = false;
            Iterator var7 = var5.iterator();

            label58:
            while (true) {
               if (!var7.hasNext()) {
                  var18 = null;
                  break;
               }

               Object var8 = var7.next();
               var18 = var8;

               while (true) {
                  Entity var9 = (Entity)var18;
                  boolean var10 = false;
                  var19 = var9.getId();
                  label47:
                  if (var4 != 0) {
                     try {
                        if (var19 == var3) {
                           var19 = 1;
                           break label47;
                        }
                     } catch (MatchException var14) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var14, 60518710214790577L, var1
                        );
                     }

                     var19 = 0;
                  }

                  if (var19 == 0) {
                     break;
                  }

                  var18 = var8;
                  if (var4 != 0) {
                     break label58;
                  }
               }
            }

            try {
               var20 = (Entity)var18;
               if (var4 != 0) {
                  break label67;
               }
            } catch (MatchException var13) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var13, 60518710214790577L, var1
               );
            }
         }

         try {
            var20 = null;
         } catch (MatchException var12) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var12, 60518710214790577L, var1
            );
         }
      }

      try {
         return var20;
      } catch (MatchException var11) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var11, 60518710214790577L, var1
         );
      }
   }

   @JvmStatic
   @NotNull
   public static final HitResult IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull Entity var0, long var1, double var3, float var5, float var6, float var7
   ) {
      var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(197, 7505105460247670656L ^ var1)
      );
      Vec3 var10000 = var0.getEyePosition(var5);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(22145, 7869802733217151447L ^ var1)
      );
      Vec3 var8 = var10000;
      Vec3 var9 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var6);
      var10000 = var8.add(var9.x * var3, var9.y * var3, var9.z * var3);
      Intrinsics.checkNotNullExpressionValue(
         var10000, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(5440, 523929409134311954L ^ var1)
      );
      Vec3 var10 = var10000;
      ClientLevel var13 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .level;
      Intrinsics.checkNotNull(var13);
      BlockHitResult var14 = var13.clip(new ClipContext(var8, var10, Block.OUTLINE, Fluid.NONE, var0));
      Intrinsics.checkNotNullExpressionValue(
         var14, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(18882, 8948735371488323229L ^ var1)
      );
      return (HitResult)var14;
   }

   @JvmStatic
   @NotNull
   public static final HitResult IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull BlockPos var0, long var1) {
      var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(11835, 8008627360066814682L ^ var1)
      );
      Vec3 var10002 = Vec3.atCenterOf((Vec3i)var0);
      LocalPlayer var10003 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .player;
      Intrinsics.checkNotNull(var10003);
      return (HitResult)(new BlockHitResult(var10002, Direction.fromYRot(var10003.getYRot()), var0, false));
   }

   @JvmStatic
   @NotNull
   public static final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var0, float var1) {
      double var2 = var0 * (float) (Math.PI / 180.0);
      double var4 = -var1 * (float) (Math.PI / 180.0);
      double var6 = Math.cos(var4);
      double var8 = Math.sin(var4);
      double var10 = Math.cos(var2);
      double var12 = Math.sin(var2);
      return new Vec3(var8 * var10, -var12, var6 * var10);
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @JvmStatic
   @NotNull
   public static final Vec3 IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Entity var0, long var1) {
      var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ var1;
      Intrinsics.checkNotNullParameter(
         var0, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"j">(19839, 1657444711970855633L ^ var1)
      );
      return new Vec3(var0.getX(), var0.getY(), var0.getZ());
   }

   @JvmStatic
   @Nullable
   public static final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull RemotePlayer param0, long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 132730235041960L;
      if (IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() == null) {
         String var11 = "W64MR";
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      }

      lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[18];
      int var5 = 0;
      String var4 = "Aûìuir¢½Í\u0091K¼¢¡\u000fQåh\u0001\u0096´\u001dý\tV\u0003\\¾\u00882rW jWxÓÞkÙ|G£F\u008aó\u008eA\u0013\u0013\f¾É¤\u00adx\u0091¼äñsrÁA\t(þ8\u000bÔ¤t÷\u0080Øò$Z\u001c\u009dÁn¸7\u0018\u0091\u008f\u001e\u009b\u0018ð´Q¹ú\u0085\u009cóvV¥®\u0007¨K©\u0018¥\u0006Áºi\";ªÞå\u008feº\u001e7i¼Tßµ\u0007¶¤\u0014\u0010\u0088¾GT4\\¶<ö¥Uy=.8¿(ú\u009fc¸½02âEÄ\r\u0091\u00930Ð+2áz\u0004\nÿ\u0081N\u001aq\u0017_îs\u008di¬Iø\u0097tøtS \u0016Ôc\u008fÌ\nK\u0090É\u0084B|\bÜ\u0005õ®ÕÎ\u008atâ\u0096¿Zî¾ì\u009d~^\"8\u008c\u0006S*\u0015ó\u0080ÒÉU3 éÎ$$\u0099\u0080\u001b\u001cÔo\u0005\u0012\u009f5\u0013q§å9\u0083\u008d\u008cåg\u0099Tþ\b»P[\u0013Öò\u0005ÿ3\u009e«Ý\u0019FoA ãX4N\u001a\u0086gm4c5àr\u0085÷Ã\bÌ¤Î\u009e@[§Qý7b!È¦M\u0010\u007fX³;\u000f>«\fµ¢}¤ùwyÍ ¦[L)\u0086k¾a\"æiþó¶\u0000öô\n^{y\u0081ù§¸)YºÌp\u0010n \f\\)\u0013\u0017RÒ\b]ëÝ\u001f¶íã\u008cÂT\u0004§c\nbµx\u001c¹;óÅz\u001epKZZ¡\u008au×x:åÕaìý7 \u0081\u009fúk*\u0086\u009bî\u007fé»;K)J\u0004Î]p\u008er@úOÉ\u0084>ß\u00989â>¶Õ\u009b\u001e\tjêOïzò\u0096_Íª:\u0002TFnÇFî«P¥@0\u0093XúÆ\rçb:\t\\,±Å2¸\u009aJ¢É¶5&å<E\u0002æ;bYò4£¿Ê\u009e(\u0095\n\u009fÜ·s\u0007\u000e8îjÏÁ¥öF=¡¤kÏØ\u0003\u009f[ùSÐn A®yð¨2zêM³ n\u0084\u0082ÓÌ6f\u0005¶Óaí\u0005&T\u0099\u009dÝ?\u0017XY×ß\u0081J=U\u0014û±ï\u0010ÎÈæ\u0084K³\u009b\u008aÚí·È®.ùÌ";
      int var6 = "Aûìuir¢½Í\u0091K¼¢¡\u000fQåh\u0001\u0096´\u001dý\tV\u0003\\¾\u00882rW jWxÓÞkÙ|G£F\u008aó\u008eA\u0013\u0013\f¾É¤\u00adx\u0091¼äñsrÁA\t(þ8\u000bÔ¤t÷\u0080Øò$Z\u001c\u009dÁn¸7\u0018\u0091\u008f\u001e\u009b\u0018ð´Q¹ú\u0085\u009cóvV¥®\u0007¨K©\u0018¥\u0006Áºi\";ªÞå\u008feº\u001e7i¼Tßµ\u0007¶¤\u0014\u0010\u0088¾GT4\\¶<ö¥Uy=.8¿(ú\u009fc¸½02âEÄ\r\u0091\u00930Ð+2áz\u0004\nÿ\u0081N\u001aq\u0017_îs\u008di¬Iø\u0097tøtS \u0016Ôc\u008fÌ\nK\u0090É\u0084B|\bÜ\u0005õ®ÕÎ\u008atâ\u0096¿Zî¾ì\u009d~^\"8\u008c\u0006S*\u0015ó\u0080ÒÉU3 éÎ$$\u0099\u0080\u001b\u001cÔo\u0005\u0012\u009f5\u0013q§å9\u0083\u008d\u008cåg\u0099Tþ\b»P[\u0013Öò\u0005ÿ3\u009e«Ý\u0019FoA ãX4N\u001a\u0086gm4c5àr\u0085÷Ã\bÌ¤Î\u009e@[§Qý7b!È¦M\u0010\u007fX³;\u000f>«\fµ¢}¤ùwyÍ ¦[L)\u0086k¾a\"æiþó¶\u0000öô\n^{y\u0081ù§¸)YºÌp\u0010n \f\\)\u0013\u0017RÒ\b]ëÝ\u001f¶íã\u008cÂT\u0004§c\nbµx\u001c¹;óÅz\u001epKZZ¡\u008au×x:åÕaìý7 \u0081\u009fúk*\u0086\u009bî\u007fé»;K)J\u0004Î]p\u008er@úOÉ\u0084>ß\u00989â>¶Õ\u009b\u001e\tjêOïzò\u0096_Íª:\u0002TFnÇFî«P¥@0\u0093XúÆ\rçb:\t\\,±Å2¸\u009aJ¢É¶5&å<E\u0002æ;bYò4£¿Ê\u009e(\u0095\n\u009fÜ·s\u0007\u000e8îjÏÁ¥öF=¡¤kÏØ\u0003\u009f[ùSÐn A®yð¨2zêM³ n\u0084\u0082ÓÌ6f\u0005¶Óaí\u0005&T\u0099\u009dÝ?\u0017XY×ß\u0081J=U\u0014û±ï\u0010ÎÈæ\u0084K³\u009b\u008aÚí·È®.ùÌ"
         .length();
      char var3 = ' ';
      int var13 = -1;

      label31:
      while (true) {
         String var14 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var13 += var3) >= var6) {
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var7;
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new String[18];
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label31;
                  }

                  var4 = "¬z\u0004\u008e)É\u008cy¾ELP\u0095èyá\u0080\t\u0083q\u008azí¼\u0080§B\u0087íÍþs\u0010ò¡\u0014\u0084\u009dýà\u0092L\u001an\u0000¹Ë}ü";
                  var6 = "¬z\u0004\u008e)É\u008cy¾ELP\u0095èyá\u0080\t\u0083q\u008azí¼\u0080§B\u0087íÍþs\u0010ò¡\u0014\u0084\u009dýà\u0092L\u001an\u0000¹Ë}ü"
                     .length();
                  var3 = ' ';
                  var13 = -1;
            }

            var14 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var0;
   }

   public static String IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12012;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll", var10
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
         byte[] var9 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5].getBytes("ISO-8859-1");
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5];
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
            "me/octo/client/utils/player/IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
