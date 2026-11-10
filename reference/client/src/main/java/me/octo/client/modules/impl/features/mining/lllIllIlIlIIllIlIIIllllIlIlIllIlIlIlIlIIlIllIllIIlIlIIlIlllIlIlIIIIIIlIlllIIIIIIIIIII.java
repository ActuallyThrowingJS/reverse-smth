package me.octo.client.modules.impl.features.mining;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 105314105237579L;
   private static String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   @NotNull
   public static final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long argument1Arg, @NotNull Vec3 particlePosArg
   ) {
      argument1Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument1Arg;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         8424065365956252093L, argument1Arg
      );
      Intrinsics.checkNotNullParameter(particlePosArg, "particlePos");
      double var4 = particlePosArg.x;
      double var6 = particlePosArg.y;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var3 = var10000;
      double var8 = particlePosArg.z;
      float var10 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Math.abs((float)(var4 - (int)var4)));
      float var11 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Math.abs((float)(var8 - (int)var8)));

      label135: {
         label134: {
            int var12;
            label133: {
               try {
                  float var31;
                  var12 = (var31 = var10 - 0.9F) == 0.0F ? 0 : (var31 < 0.0F ? -1 : 1);
                  if (var3 == null) {
                     break label133;
                  }

                  if (!var12) {
                     break label134;
                  }
               } catch (MatchException var24) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var24, 8429212614048763400L, argument1Arg
                  );
               }

               var26 = 0;
               break label135;
            }

            var26 = var12;
            break label135;
         }

         var26 = 1;
      }

      label139: {
         try {
            if (var26) {
               var30 = new BlockPos((int)var4 + 1, (int)var6, (int)var8);
               break label139;
            }
         } catch (MatchException var23) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var23, 8429212614048763400L, argument1Arg
            );
         }

         label117: {
            label116: {
               int var13;
               label115: {
                  try {
                     float var32;
                     var13 = (var32 = var10 - 0.1F) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label115;
                     }

                     if (!var13) {
                        break label116;
                     }
                  } catch (MatchException var22) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var22, 8429212614048763400L, argument1Arg
                     );
                  }

                  var27 = 0;
                  break label117;
               }

               var27 = var13;
               break label117;
            }

            var27 = 1;
         }

         try {
            if (var27) {
               var30 = new BlockPos((int)var4 - 1, (int)var6, (int)var8);
               break label139;
            }
         } catch (MatchException var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, 8429212614048763400L, argument1Arg
            );
         }

         label100: {
            label99: {
               int var14;
               label98: {
                  try {
                     float var33;
                     var14 = (var33 = var11 - 0.9F) == 0.0F ? 0 : (var33 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label98;
                     }

                     if (!var14) {
                        break label99;
                     }
                  } catch (MatchException var20) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var20, 8429212614048763400L, argument1Arg
                     );
                  }

                  var28 = 0;
                  break label100;
               }

               var28 = var14;
               break label100;
            }

            var28 = 1;
         }

         try {
            if (var28) {
               var30 = new BlockPos((int)var4, (int)var6, (int)var8 + 1);
               break label139;
            }
         } catch (MatchException var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, 8429212614048763400L, argument1Arg
            );
         }

         label83: {
            label82: {
               int var15;
               label81: {
                  try {
                     float var34;
                     var15 = (var34 = var11 - 0.1F) == 0.0F ? 0 : (var34 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label81;
                     }

                     if (!var15) {
                        break label82;
                     }
                  } catch (MatchException var18) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var18, 8429212614048763400L, argument1Arg
                     );
                  }

                  var29 = 0;
                  break label83;
               }

               var29 = var15;
               break label83;
            }

            var29 = 1;
         }

         try {
            if (var29) {
               var30 = new BlockPos((int)var4, (int)var6, (int)var8 - 1);
               break label139;
            }
         } catch (MatchException var17) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var17, 8429212614048763400L, argument1Arg
            );
         }

         var30 = new BlockPos((int)var4, (int)var6, (int)var8);
      }

      try {
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               8570513484781603247L, argument1Arg
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[2], 8552499503737069857L, argument1Arg
            );
         }

         return var30;
      } catch (MatchException var16) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var16, 8429212614048763400L, argument1Arg
         );
      }
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Vec3 param0, long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final float IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var0) {
      float var1;
      try {
         var1 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var0 * 10000)
            / 10000.0F;
      } catch (Exception var3) {
         var1 = 0.0F;
      }

      return var1;
   }

   static {
      long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 120065107146536L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u0004e\u0087·Ò\u000e\u0092H)'\u0016-¦=Ö\u0004".getBytes("ISO-8859-1"));
      String var5 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4).intern();
      byte var10001 = -1;
      lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var5;
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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

   public static final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$853961e2fb67efbd(
      long var0, Vec3 var2
   ) {
      var0 = 131158824629523L;
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      long var3 = var0 ^ 95294349871805L;
      return llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$7b7f3bff86e18e61(var2, var3);
   }

   @NotNull
   public static final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$beb44f0284cf4466(
      long argument1Arg, @NotNull Vec3 particlePosArg
   ) {
      argument1Arg = 108675616298820L;
      argument1Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument1Arg;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      Intrinsics.checkNotNullParameter(particlePosArg, "particlePos");
      double var4 = particlePosArg.x;
      double var6 = particlePosArg.y;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var3 = var10000;
      double var8 = particlePosArg.z;
      float var10 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Math.abs((float)(var4 - (int)var4)));
      float var11 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Math.abs((float)(var8 - (int)var8)));

      label135: {
         label134: {
            int var22;
            label133: {
               try {
                  float var42;
                  var22 = (var42 = var10 - 0.9F) == 0.0F ? 0 : (var42 < 0.0F ? -1 : 1);
                  if (var3 == null) {
                     break label133;
                  }

                  if (!var22) {
                     break label134;
                  }
               } catch (MatchException var34) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var34);
               }

               var37 = 0;
               break label135;
            }

            var37 = var22;
            break label135;
         }

         var37 = 1;
      }

      label139: {
         try {
            if (var37) {
               var41 = new BlockPos((int)var4 + 1, (int)var6, (int)var8);
               break label139;
            }
         } catch (MatchException var33) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var33);
         }

         label117: {
            label116: {
               int var23;
               label115: {
                  try {
                     float var43;
                     var23 = (var43 = var10 - 0.1F) == 0.0F ? 0 : (var43 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label115;
                     }

                     if (!var23) {
                        break label116;
                     }
                  } catch (MatchException var32) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var32);
                  }

                  var38 = 0;
                  break label117;
               }

               var38 = var23;
               break label117;
            }

            var38 = 1;
         }

         try {
            if (var38) {
               var41 = new BlockPos((int)var4 - 1, (int)var6, (int)var8);
               break label139;
            }
         } catch (MatchException var31) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var31);
         }

         label100: {
            label99: {
               int var24;
               label98: {
                  try {
                     float var44;
                     var24 = (var44 = var11 - 0.9F) == 0.0F ? 0 : (var44 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label98;
                     }

                     if (!var24) {
                        break label99;
                     }
                  } catch (MatchException var30) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var30);
                  }

                  var39 = 0;
                  break label100;
               }

               var39 = var24;
               break label100;
            }

            var39 = 1;
         }

         try {
            if (var39) {
               var41 = new BlockPos((int)var4, (int)var6, (int)var8 + 1);
               break label139;
            }
         } catch (MatchException var29) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var29);
         }

         label83: {
            label82: {
               int var25;
               label81: {
                  try {
                     float var45;
                     var25 = (var45 = var11 - 0.1F) == 0.0F ? 0 : (var45 < 0.0F ? -1 : 1);
                     if (var3 == null) {
                        break label81;
                     }

                     if (!var25) {
                        break label82;
                     }
                  } catch (MatchException var28) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var28);
                  }

                  var40 = 0;
                  break label83;
               }

               var40 = var25;
               break label83;
            }

            var40 = 1;
         }

         try {
            if (var40) {
               var41 = new BlockPos((int)var4, (int)var6, (int)var8 - 1);
               break label139;
            }
         } catch (MatchException var27) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var27);
         }

         var41 = new BlockPos((int)var4, (int)var6, (int)var8);
      }

      try {
         if (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var20 = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[2];
            llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var20
            );
         }

         return var41;
      } catch (MatchException var26) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26);
      }
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$7b7f3bff86e18e61(
      Vec3 param0, long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
