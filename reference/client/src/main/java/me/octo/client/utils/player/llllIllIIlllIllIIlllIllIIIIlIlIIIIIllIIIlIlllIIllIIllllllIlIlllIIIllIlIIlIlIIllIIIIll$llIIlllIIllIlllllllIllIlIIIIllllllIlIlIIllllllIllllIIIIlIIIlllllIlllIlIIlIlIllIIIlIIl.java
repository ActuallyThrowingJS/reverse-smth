package me.octo.client.utils.player;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;

public final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl<T>
   implements Comparator {
   private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = 138105107365265L;

   public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
      BlockPos var1
   ) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
   }

   @Override
   public final int compare(T var1, T var2) {
      long var3 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII ^ 131323612146434L;
      int var10000 = llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var6 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var1;
      int var5 = var10000;
      boolean var7 = false;

      label189: {
         label197: {
            label186:
            try {
               if (var5 == 0) {
                  var79 = var6.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
                  if (var79 != null) {
                     break label186;
                  }
               }
               break label197;
            } catch (MatchException var61) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var61);
            }

            Vec3 var8 = var79;
            boolean var9 = false;
            double var10 = var8.x - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getX();
            double var12 = var8.y - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getY();
            double var14 = var8.z - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getZ();
            double var16 = Math.abs(var10 - 0.5);
            double var18 = Math.abs(var12 - 0.5);
            double var20 = Math.abs(var14 - 0.5);
            double var22 = Math.max(var16, Math.max(var18, var20));

            label177: {
               label176: {
                  try {
                     if (var22 == var18) {
                        break label176;
                     }
                  } catch (MatchException var60) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var60);
                  }

                  var81 = false;
                  break label177;
               }

               var81 = true;
            }

            boolean var24 = var81;

            label169: {
               label168: {
                  try {
                     if (var22 == var16) {
                        break label168;
                     }
                  } catch (MatchException var59) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var59);
                  }

                  var82 = false;
                  break label169;
               }

               var82 = true;
            }

            label194: {
               try {
                  if (var82) {
                     var84 = var18 * var18 + var20 * var20;
                     break label194;
                  }
               } catch (MatchException var56) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var56);
               }

               label160: {
                  label159: {
                     try {
                        if (var22 == var18) {
                           break label159;
                        }
                     } catch (MatchException var58) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var58);
                     }

                     var83 = false;
                     break label160;
                  }

                  var83 = true;
               }

               try {
                  if (var83) {
                     var84 = var16 * var16 + var20 * var20;
                     break label194;
                  }
               } catch (MatchException var57) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var57);
               }

               var84 = var16 * var16 + var18 * var18;
            }

            double var25 = var84;
            double var27 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var8,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            double var29 = Math.max(0.0, 0.24 - var27) * 18.0;

            label143: {
               try {
                  if (var24) {
                     var85 = 0.35;
                     break label143;
                  }
               } catch (MatchException var55) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var55);
               }

               var85 = 0.0;
            }

            double var31 = var85;
            double var33 = (
                  llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII().length
                     - var6.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
               )
               * 1.25;
            var80 = var33 + var25 + var29 + var31;
            break label189;
         }

         var80 = Double.MAX_VALUE;
      }

      Comparable var86 = var80;
      var6 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI)var2;
      Comparable var35 = var86;
      if (var5 == 0) {
         var7 = false;
         Vec3 var87 = var6.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
         if (var87 != null) {
            Vec3 var64 = var87;
            boolean var65 = false;
            double var66 = var64.x - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getX();
            double var67 = var64.y - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getY();
            double var68 = var64.z - this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getZ();
            double var69 = Math.abs(var66 - 0.5);
            double var70 = Math.abs(var67 - 0.5);
            double var71 = Math.abs(var68 - 0.5);
            double var72 = Math.max(var69, Math.max(var70, var71));

            label129: {
               label128: {
                  try {
                     if (var72 == var70) {
                        break label128;
                     }
                  } catch (MatchException var54) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var54);
                  }

                  var89 = false;
                  break label129;
               }

               var89 = true;
            }

            boolean var73 = var89;

            label121: {
               label120: {
                  try {
                     if (var72 == var69) {
                        break label120;
                     }
                  } catch (MatchException var53) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var53);
                  }

                  var90 = false;
                  break label121;
               }

               var90 = true;
            }

            label196: {
               try {
                  if (var90) {
                     var92 = var70 * var70 + var71 * var71;
                     break label196;
                  }
               } catch (MatchException var50) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var50);
               }

               label112: {
                  label111: {
                     try {
                        if (var72 == var70) {
                           break label111;
                        }
                     } catch (MatchException var52) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var52);
                     }

                     var91 = false;
                     break label112;
                  }

                  var91 = true;
               }

               try {
                  if (var91) {
                     var92 = var69 * var69 + var71 * var71;
                     break label196;
                  }
               } catch (MatchException var51) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var51);
               }

               var92 = var69 * var69 + var70 * var70;
            }

            double var74 = var92;
            double var75 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
               var64,
               this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            double var76 = Math.max(0.0, 0.24 - var75) * 18.0;

            label95: {
               try {
                  if (var73) {
                     var93 = 0.35;
                     break label95;
                  }
               } catch (MatchException var49) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var49);
               }

               var93 = 0.0;
            }

            double var77 = var93;
            double var78 = (
                  llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII().length
                     - var6.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
               )
               * 1.25;
            return ComparisonsKt.compareValues(var35, var78 + var74 + var76 + var77);
         }
      }

      return ComparisonsKt.compareValues(var35, Double.MAX_VALUE);
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }
}
