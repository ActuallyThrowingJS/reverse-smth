package me.octo.client.gui.clickgui.endgameGUI;

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
import kotlin.collections.ArraysKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
   @NotNull
   public static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   public static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Color[][] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 115758061109703L;
   private static long[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Integer[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1, long var2) {
      var2 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var2;
      long var4 = var2 ^ 36185297270L;
      long var6 = var2 ^ 62077986117381L;
      long var10001 = var2 ^ 116339027586245L;
      int var8 = (int)((var2 ^ 116339027586245L) >>> 48);
      int var9 = (int)((var2 ^ 116339027586245L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      var10001 = var2 ^ 73326934591693L;
      int var11 = (int)((var2 ^ 73326934591693L) >>> 32);
      int var12 = (int)((var2 ^ 73326934591693L) << 32 >>> 48);
      int var13 = (int)(var10001 << 48 >>> 48);
      long var14 = var2 ^ 19048183063887L;
      long var16 = var2 ^ 125009374730558L;
      var10001 = var2 ^ 82115142506691L;
      int var18 = (int)((var2 ^ 82115142506691L) >>> 48);
      int var19 = (int)((var2 ^ 82115142506691L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var2 ^ 22621030358702L;
      long var23 = var2 ^ 100227732226332L;
      long var25 = var2 ^ 119742139929105L;
      long var27 = var2 ^ 80950707690099L;
      long var29 = var2 ^ 25724957974447L;
      long var31 = var2 ^ 43146151346694L;
      long var33 = var2 ^ 97146104073666L;

      label61: {
         label60: {
            label59: {
               label58: {
                  label57: {
                     label56: {
                        label55: {
                           label54: {
                              label53: {
                                 label52: {
                                    label51: {
                                       label50: {
                                          try {
                                             switch (var1) {
                                                case 0:
                                                   this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                                                      (char)var8, (char)var9, var10
                                                   );
                                                   break label61;
                                                case 1:
                                                   break label60;
                                                case 2:
                                                   break label59;
                                                case 3:
                                                   break label58;
                                                case 4:
                                                   break label57;
                                                case 5:
                                                   break label56;
                                                case 6:
                                                   break label55;
                                                case 7:
                                                   break label54;
                                                case 8:
                                                   break label53;
                                                case 9:
                                                   break label52;
                                                case 10:
                                                   break label51;
                                                case 11:
                                                   break label50;
                                             }
                                          } catch (MatchException var35) {
                                             throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                                var35, 965346804723970915L, var2
                                             );
                                          }

                                          this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var27, var1 - 12);
                                          break label61;
                                       }

                                       this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var33);
                                       break label61;
                                    }

                                    this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var25);
                                    break label61;
                                 }

                                 this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var14);
                                 break label61;
                              }

                              this.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(var6);
                              break label61;
                           }

                           this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var31);
                           break label61;
                        }

                        this.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var16);
                        break label61;
                     }

                     this.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var11, (char)var12, (short)var13);
                     break label61;
                  }

                  this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll((short)var18, var19, (char)var20);
                  break label61;
               }

               this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var23);
               break label61;
            }

            this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4);
            break label61;
         }

         this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var29);
      }

      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var21, var1);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, int var3) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var4 = var1 ^ 102824186444618L;
      long var6 = var1 ^ 44754416426434L;
      long var8 = var1 ^ 53036308732029L;
      long var10 = var1 ^ 133824162524297L;

      Color[] var10000;
      try {
         var10000 = (Color[])ArraysKt.getOrNull((Object[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, var3);
         if (var10000 == null) {
            return;
         }
      } catch (MatchException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, 5912351199285685258L, var1
         );
      }

      Color[] var12 = var10000;
      ThemeColors.INSTANCE.lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI(var6, var12[0]);
      ThemeColors.INSTANCE.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(var8, var12[1]);
      ThemeColors.INSTANCE.IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII(var12[2], var10);
      ThemeColors.INSTANCE.llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII(var12[3], var4);
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var6 = var4 ^ 58007378867446L;
      long var8 = var4 ^ 8638270369861L;
      long var10 = var4 ^ 92010382675831L;
      long var12 = var4 ^ 96815599538779L;
      long var14 = var4 ^ 20687009262804L;
      long var16 = var4 ^ 102299963301900L;
      long var10001 = var4 ^ 67249431443076L;
      int var18 = (int)((var4 ^ 67249431443076L) >>> 48);
      int var19 = (int)((var4 ^ 67249431443076L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var4 ^ 120778331363221L;
      var10001 = var4 ^ 137266825894381L;
      int var23 = (int)((var4 ^ 137266825894381L) >>> 48);
      int var24 = (int)((var4 ^ 137266825894381L) << 16 >>> 32);
      int var25 = (int)(var10001 << 48 >>> 48);
      long var26 = var4 ^ 15178397296916L;
      long var28 = var4 ^ 20953826777799L;
      var10001 = var4 ^ 119350242324112L;
      int var30 = (int)((var4 ^ 119350242324112L) >>> 48);
      int var31 = (int)((var4 ^ 119350242324112L) << 16 >>> 32);
      int var32 = (int)(var10001 << 48 >>> 48);
      long var33 = var4 ^ 2895395162421L;
      var10001 = var4 ^ 42309274656610L;
      int var35 = (int)((var4 ^ 42309274656610L) >>> 32);
      int var36 = (int)((var4 ^ 42309274656610L) << 32 >>> 56);
      int var37 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 13266567045528L;
      int var38 = (int)((var4 ^ 13266567045528L) >>> 32);
      int var39 = (int)((var4 ^ 13266567045528L) << 32 >>> 48);
      int var40 = (int)(var10001 << 48 >>> 48);
      long var41 = var4 ^ 39065300265606L;
      long var43 = var4 ^ 83142444528617L;
      var10001 = var4 ^ 11106235773507L;
      int var45 = (int)((var4 ^ 11106235773507L) >>> 32);
      int var46 = (int)((var4 ^ 11106235773507L) << 32 >>> 48);
      int var47 = (int)(var10001 << 48 >>> 48);
      long var48 = var4 ^ 80977630812920L;
      var10001 = var4 ^ 53574915886836L;
      int var50 = (int)((var4 ^ 53574915886836L) >>> 48);
      int var51 = (int)((var4 ^ 53574915886836L) << 16 >>> 32);
      int var52 = (int)(var10001 << 48 >>> 48);
      long var53 = var4 ^ 111412896780852L;
      var10001 = var4 ^ 126839757554317L;
      int var55 = (int)((var4 ^ 126839757554317L) >>> 48);
      int var56 = (int)((var4 ^ 126839757554317L) << 16 >>> 32);
      int var57 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 35024889938052L;
      int var58 = (int)((var4 ^ 35024889938052L) >>> 32);
      int var59 = (int)((var4 ^ 35024889938052L) << 32 >>> 48);
      int var60 = (int)(var10001 << 48 >>> 48);
      long var61 = var4 ^ 30360774710444L;
      long var63 = var4 ^ 3951691889930L;
      long var65 = var4 ^ 10431297565216L;
      long var67 = var4 ^ 34451486815386L;
      long var69 = var4 ^ 30446530876939L;
      long var71 = var4 ^ 119891263240375L;
      var10001 = var4 ^ 72718974633213L;
      int var73 = (int)((var4 ^ 72718974633213L) >>> 48);
      int var74 = (int)((var4 ^ 72718974633213L) << 16 >>> 32);
      int var75 = (int)(var10001 << 48 >>> 48);
      long var76 = var4 ^ 66785251396591L;
      long var78 = var4 ^ 126479920014963L;
      var10001 = var4 ^ 102168033614024L;
      int var80 = (int)((var4 ^ 102168033614024L) >>> 48);
      int var81 = (int)((var4 ^ 102168033614024L) << 16 >>> 32);
      int var82 = (int)(var10001 << 48 >>> 48);
      long var83 = var4 ^ 71943291032672L;
      int var85 = (int)((var4 ^ 116876915952722L) >>> 48);
      long var86 = (var4 ^ 116876915952722L) << 16 >>> 16;
      int var88 = (int)((var4 ^ 40557839696830L) >>> 48);
      long var89 = (var4 ^ 40557839696830L) << 16 >>> 16;
      var10001 = var4 ^ 116985202395237L;
      int var91 = (int)((var4 ^ 116985202395237L) >>> 48);
      int var92 = (int)((var4 ^ 116985202395237L) << 16 >>> 32);
      int var93 = (int)(var10001 << 48 >>> 48);
      long var94 = var4 ^ 61960813356276L;
      long var96 = var4 ^ 28637015409892L;
      var10001 = var4 ^ 87686355786628L;
      int var98 = (int)((var4 ^ 87686355786628L) >>> 32);
      int var99 = (int)((var4 ^ 87686355786628L) << 32 >>> 48);
      int var100 = (int)(var10001 << 48 >>> 48);
      long var101 = var4 ^ 100165374518979L;
      long var103 = var4 ^ 107843404994318L;
      var10001 = var4 ^ 40558044899847L;
      int var105 = (int)((var4 ^ 40558044899847L) >>> 32);
      int var106 = (int)((var4 ^ 40558044899847L) << 32 >>> 40);
      int var107 = (int)(var10001 << 56 >>> 56);
      var10001 = var4 ^ 76673905683655L;
      int var108 = (int)((var4 ^ 76673905683655L) >>> 32);
      int var109 = (int)((var4 ^ 76673905683655L) << 32 >>> 48);
      int var110 = (int)(var10001 << 48 >>> 48);
      long var111 = var4 ^ 44858771374780L;
      long var113 = var4 ^ 132802687442287L;
      long var115 = var4 ^ 71759812253469L;
      long var117 = var4 ^ 131189887667655L;
      var10001 = var4 ^ 92413029822398L;
      int var119 = (int)((var4 ^ 92413029822398L) >>> 48);
      int var120 = (int)((var4 ^ 92413029822398L) << 16 >>> 48);
      int var121 = (int)(var10001 << 32 >>> 32);
      long var122 = var4 ^ 70118048394405L;
      var10001 = var4 ^ 84001864995526L;
      int var124 = (int)((var4 ^ 84001864995526L) >>> 32);
      int var125 = (int)((var4 ^ 84001864995526L) << 32 >>> 48);
      int var126 = (int)(var10001 << 48 >>> 48);
      long var127 = var4 ^ 28045116039698L;
      long var129 = var4 ^ 88551962949032L;
      long var131 = var4 ^ 39183702827108L;
      long var133 = var4 ^ 122519894784043L;
      long var135 = var4 ^ 112008373618273L;
      long var137 = var4 ^ 5982113493572L;
      long var139 = var4 ^ 115300807928862L;
      long var141 = var4 ^ 103349118573151L;
      var10001 = var4 ^ 128275039758933L;
      int var143 = (int)((var4 ^ 128275039758933L) >>> 48);
      int var144 = (int)((var4 ^ 128275039758933L) << 16 >>> 48);
      int var145 = (int)(var10001 << 32 >>> 32);
      long var146 = var4 ^ 30455691532023L;
      long var148 = (var4 ^ 124414091390651L) >>> 32;
      int var150 = (int)((var4 ^ 124414091390651L) << 32 >>> 32);
      long var151 = var4 ^ 122256341919681L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var38, var39, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var40
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var53, new Color(255, 255, 255, 178));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(255, 255, 255, 127), var28);
      ThemeColors.textPlaceholder = new Color(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4885, 4701762278985284299L ^ var4)
      );
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9823, 27135219909234592L ^ var4)), var141
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(487, 7167032482742282293L ^ var4)),
            (char)var30,
            var31,
            var32
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var43, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(487, 7167032482742282293L ^ var4))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22071, 2958733944946098132L ^ var4));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var148, var150, var153);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var14, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14618, 4874272627953045727L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var21, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5665, 9207331229946625900L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19507, 2260846592113042728L ^ var4));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var80, var81, (char)var82, var153);
      ThemeColors.INSTANCE
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var133
         );
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var67, new Color(35, 35, 35, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(60, 60, 60, 255), var98, (char)var99, (char)var100);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(165, 165, 165, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var73, var153, var74, (short)var75);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(180, 180, 180, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var108, var109, (char)var110, var153);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(0, 0, 0, 80), var137);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var135, new Color(50, 50, 50, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var6, new Color(165, 165, 165, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var117, new Color(120, 120, 120, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(255, 255, 255, 255), var26);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(80, 80, 80, 255), var151);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var129, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(458, 2699025658467100802L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var111, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4419, 2727825015061985465L ^ var4))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var101, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24068, 3732334871945541379L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(60, 60, 60, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var55, var56, var153, var57);
      ThemeColors.INSTANCE
         .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9047, 4154298601113619076L ^ var4)), var122
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4419, 2727825015061985465L ^ var4));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var23, var153, var24, (short)var25);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(30, 30, 30, 255), var146);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(40, 40, 40, 255), var94);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(50, 50, 50, 255), (short)var119, (char)var120, var121);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(45, 45, 45, 255), var16);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var10, new Color(180, 180, 180, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(45, 45, 45, 255), var65);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(64, 64, 64, 255), var83);
      ThemeColors.INSTANCE
         .IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(
            var61, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var96, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(129, 8832462347934706093L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18510, 6846616792207155580L ^ var4));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var143, var153, (char)var144, var145);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1649, 6551808319077658407L ^ var4));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var91, var153, var92, (char)var93);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4336, 7767543905852078475L ^ var4)), var12
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4336, 7767543905852078475L ^ var4)),
            var124,
            (char)var125,
            var126
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17889, 6484705417582898210L ^ var4));
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var85, var153, var86);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(35, 35, 35, 255), var8);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var76, new Color(60, 60, 60, 255));
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(25, 25, 25, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var88, var153, var89);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(25, 25, 25, 255), var105, var106, (byte)var107);
      ThemeColors.INSTANCE
         .IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(
            var63, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
         );
      float[] var154 = new float[]{0.36F, 0.36F, 0.4F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var115, var154);
      var154 = new float[]{0.22F, 0.22F, 0.25F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var154, var58, var59, (short)var60);
      var154 = new float[]{0.18F, 0.19F, 0.22F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var154, (char)var50, var51, (char)var52);
      var154 = new float[]{0.1F, 0.1F, 0.12F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var78, var154);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var45,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4336, 7767543905852078475L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.7F),
            (short)var46,
            (short)var47
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11809, 7525671422343481110L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.78F),
            var48
         );
      ThemeColors.INSTANCE
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(
            var33, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3457, 589213224432215172L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(255, 255, 255, 12);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var18, var19, var153, (short)var20);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(255, 255, 255, 22), var131);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var139, new Color(255, 255, 255, 30));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(255, 255, 255, 35), var103);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(255, 255, 255, 71), var71);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(220, 220, 220);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var35, (byte)var36, var153, var37);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var41, new Color(255, 255, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(200, 200, 200), var69);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var113, new Color(50, 50, 50, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(165, 165, 165, 255), var127);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 102283632200005L;
      long var5 = var1 ^ 121068277665270L;
      long var7 = var1 ^ 64226681598660L;
      long var9 = var1 ^ 54745897971688L;
      long var11 = var1 ^ 135341792088423L;
      long var13 = var1 ^ 58058132643263L;
      long var10001 = var1 ^ 93383810779959L;
      int var15 = (int)((var1 ^ 93383810779959L) >>> 48);
      int var16 = (int)((var1 ^ 93383810779959L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 4534465194534L;
      var10001 = var1 ^ 23161865495646L;
      int var20 = (int)((var1 ^ 23161865495646L) >>> 48);
      int var21 = (int)((var1 ^ 23161865495646L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 109997742412967L;
      long var25 = var1 ^ 135006253000564L;
      var10001 = var1 ^ 5820794950435L;
      int var27 = (int)((var1 ^ 5820794950435L) >>> 48);
      int var28 = (int)((var1 ^ 5820794950435L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 118081630663814L;
      var10001 = var1 ^ 87676454642385L;
      int var32 = (int)((var1 ^ 87676454642385L) >>> 32);
      int var33 = (int)((var1 ^ 87676454642385L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 111978314095659L;
      int var35 = (int)((var1 ^ 111978314095659L) >>> 32);
      int var36 = (int)((var1 ^ 111978314095659L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 81641959462709L;
      long var40 = var1 ^ 37766678793818L;
      var10001 = var1 ^ 109809321545712L;
      int var42 = (int)((var1 ^ 109809321545712L) >>> 32);
      int var43 = (int)((var1 ^ 109809321545712L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 35601861388107L;
      var10001 = var1 ^ 98401046950727L;
      int var47 = (int)((var1 ^ 98401046950727L) >>> 48);
      int var48 = (int)((var1 ^ 98401046950727L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 13827387469703L;
      var10001 = var1 ^ 29253157994302L;
      int var52 = (int)((var1 ^ 29253157994302L) >>> 48);
      int var53 = (int)((var1 ^ 29253157994302L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 129871099067703L;
      int var55 = (int)((var1 ^ 129871099067703L) >>> 32);
      int var56 = (int)((var1 ^ 129871099067703L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 125738616842527L;
      long var60 = var1 ^ 116957153493177L;
      long var62 = var1 ^ 106358950023059L;
      long var64 = var1 ^ 130371484404009L;
      long var66 = var1 ^ 125858715937720L;
      long var68 = var1 ^ 5280570950916L;
      var10001 = var1 ^ 48258554575182L;
      int var70 = (int)((var1 ^ 48258554575182L) >>> 48);
      int var71 = (int)((var1 ^ 48258554575182L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 93984647673436L;
      long var75 = var1 ^ 29477435497408L;
      var10001 = var1 ^ 58467389777275L;
      int var77 = (int)((var1 ^ 58467389777275L) >>> 48);
      int var78 = (int)((var1 ^ 58467389777275L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 44709483915731L;
      int var82 = (int)((var1 ^ 3898247524833L) >>> 48);
      long var83 = (var1 ^ 3898247524833L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 84818038013453L) >>> 48);
      long var86 = (var1 ^ 84818038013453L) << 16 >>> 16;
      var10001 = var1 ^ 3996933207510L;
      int var88 = (int)((var1 ^ 3996933207510L) >>> 48);
      int var89 = (int)((var1 ^ 3996933207510L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 89735941019975L;
      long var93 = var1 ^ 127323056109911L;
      var10001 = var1 ^ 41812390635063L;
      int var95 = (int)((var1 ^ 41812390635063L) >>> 32);
      int var96 = (int)((var1 ^ 41812390635063L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 55932137986928L;
      long var100 = var1 ^ 12996998785725L;
      var10001 = var1 ^ 84817039169460L;
      int var102 = (int)((var1 ^ 84817039169460L) >>> 32);
      int var103 = (int)((var1 ^ 84817039169460L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 48907569533300L;
      int var105 = (int)((var1 ^ 48907569533300L) >>> 32);
      int var106 = (int)((var1 ^ 48907569533300L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 71517002301199L;
      long var110 = var1 ^ 18759068999900L;
      long var112 = var1 ^ 44550701197998L;
      long var114 = var1 ^ 33630130892916L;
      var10001 = var1 ^ 67945098564109L;
      int var116 = (int)((var1 ^ 67945098564109L) >>> 48);
      int var117 = (int)((var1 ^ 67945098564109L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 94568871334166L;
      var10001 = var1 ^ 41373754765173L;
      int var121 = (int)((var1 ^ 41373754765173L) >>> 32);
      int var122 = (int)((var1 ^ 41373754765173L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 123449801154465L;
      long var126 = var1 ^ 63010306377755L;
      long var128 = var1 ^ 81793559977431L;
      long var130 = var1 ^ 7324066907544L;
      long var132 = var1 ^ 13305237486546L;
      long var134 = var1 ^ 119537380462583L;
      long var136 = var1 ^ 1214017474989L;
      long var138 = var1 ^ 57423463606252L;
      var10001 = var1 ^ 32356044625894L;
      int var140 = (int)((var1 ^ 32356044625894L) >>> 48);
      int var141 = (int)((var1 ^ 32356044625894L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 125843112897348L;
      long var145 = (var1 ^ 27351679144712L) >>> 32;
      int var147 = (int)((var1 ^ 27351679144712L) << 32 >>> 32);
      long var148 = var1 ^ 7654226434674L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(255, 255, 255, 178));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(255, 255, 255, 127), var25);
      ThemeColors.textPlaceholder = Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29543, 4817111764959176624L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11331, 1190061905144346826L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.55F),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(220.0F, 220.0F, 220.0F, 255.0F).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.61F)
         );
      ThemeColors.INSTANCE
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            var145,
            var147,
            new Color(150.0F, 150.0F, 150.0F, 255.0F).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.65F)
         );
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(140.0F, 140.0F, 140.0F, 255.0F).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.65F)
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(160.0F, 160.0F, 160.0F, 255.0F).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.65F)
         );
      ThemeColors.INSTANCE
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(
            (short)var77,
            var78,
            (char)var79,
            new Color(45, 45, 45, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.08F)
         );
      ThemeColors.INSTANCE
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            var130
         );
      ThemeColors.INSTANCE
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
            var64, new Color(35, 35, 35, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.2F)
         );
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
            new Color(60, 60, 60, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F),
            var95,
            (char)var96,
            (char)var97
         );
      ThemeColors.INSTANCE
         .IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(
            (short)var70,
            new Color(170, 170, 170, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            var71,
            (short)var72
         );
      ThemeColors.INSTANCE
         .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(
            var105,
            var106,
            (char)var107,
            new Color(136, 136, 136, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F)
         );
      ThemeColors.INSTANCE
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
            new Color(0, 0, 0, 80).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.2F), var134
         );
      ThemeColors.INSTANCE
         .llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(
            var132, new Color(50, 50, 50, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F)
         );
      ThemeColors.INSTANCE
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(
            var3, new Color(136, 136, 136, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F)
         );
      ThemeColors.INSTANCE
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(
            var114, new Color(120, 120, 120, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F)
         );
      ThemeColors.INSTANCE
         .IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(
            new Color(255, 255, 255, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F), var23
         );
      ThemeColors.INSTANCE
         .lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(
            new Color(80, 80, 80, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F), var148
         );
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4336, 7767501818891224120L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F)
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10545, 4870996865751743938L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19466, 2147095690680178906L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(
            (short)var52, var53, new Color(60, 60, 60, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.35F), var54
         );
      ThemeColors.INSTANCE
         .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20571, 415502598568215728L ^ var1)), var119
         );
      ThemeColors.INSTANCE
         .lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll(
            (char)var20,
            new Color(90, 90, 90, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F),
            var21,
            (short)var22
         );
      ThemeColors.INSTANCE
         .IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(
            new Color(30, 30, 30, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.35F), var143
         );
      ThemeColors.INSTANCE
         .IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(
            new Color(40, 40, 40, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F), var91
         );
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(50, 50, 50, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            (short)var116,
            (char)var117,
            var118
         );
      ThemeColors.INSTANCE
         .lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(
            new Color(45, 45, 45, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F), var13
         );
      ThemeColors.INSTANCE
         .IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(
            var7, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20571, 415502598568215728L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(
            new Color(45, 45, 45, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F), var62
         );
      ThemeColors.INSTANCE
         .lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(
            new Color(64, 64, 64, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F), var80
         );
      ThemeColors.INSTANCE
         .IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(
            var58,
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F)
         );
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31891, 6725772393161238629L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.35F)
         );
      ThemeColors.INSTANCE
         .llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII(
            (char)var140,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31463, 1066109509175488160L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F),
            (char)var141,
            var142
         );
      ThemeColors.INSTANCE
         .IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl(
            (short)var88,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15495, 648194872444577881L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            var89,
            (char)var90
         );
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26466, 8801735864820380657L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.5F),
            var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30974, 3115680450792402045L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F),
            var121,
            (char)var122,
            var123
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20571, 415502598568215728L ^ var1));
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE
         .lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(
            new Color(35, 35, 35, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F), var5
         );
      ThemeColors.INSTANCE
         .llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(
            var73, new Color(60, 60, 60, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.35F)
         );
      ThemeColors.INSTANCE
         .lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(
            (short)var85, new Color(25, 25, 25, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F), var86
         );
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(
            new Color(25, 25, 25, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.3F),
            var102,
            var103,
            (byte)var104
         );
      ThemeColors.INSTANCE
         .IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(
            var60,
            Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F)
         );
      float[] var151 = new float[]{0.25F, 0.25F, 0.35F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.2F, 0.25F, 0.4F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.2F, 0.35F, 0.4F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.15F, 0.2F, 0.3F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12855, 664635376208832197L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.63F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24992, 520416126351914340L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.7F),
            var45
         );
      ThemeColors.INSTANCE
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(
            var30, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32763, 6735344566950800142L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 255, 255, 20);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(255, 255, 255, 30), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(255, 255, 255, 38));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(255, 255, 255, 51), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(255, 255, 255, 89), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(138, 171, 219);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(100, 200, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 80, 80), var66);
      ThemeColors.INSTANCE
         .IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(
            var110, new Color(50, 50, 50, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F)
         );
      ThemeColors.INSTANCE
         .IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(
            new Color(136, 136, 136, 255).IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.45F), var124
         );
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 81823986403228L;
      long var5 = var1 ^ 133528479826735L;
      long var7 = var1 ^ 49495517576221L;
      long var9 = var1 ^ 42500445806897L;
      long var11 = var1 ^ 119272672354238L;
      long var13 = var1 ^ 39171518092134L;
      long var10001 = var1 ^ 74232049042926L;
      int var15 = (int)((var1 ^ 74232049042926L) >>> 48);
      int var16 = (int)((var1 ^ 74232049042926L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 21380902642943L;
      var10001 = var1 ^ 2736581470855L;
      int var20 = (int)((var1 ^ 2736581470855L) >>> 48);
      int var21 = (int)((var1 ^ 2736581470855L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 126887198743166L;
      long var25 = var1 ^ 120553120999853L;
      var10001 = var1 ^ 19957108628986L;
      int var27 = (int)((var1 ^ 19957108628986L) >>> 48);
      int var28 = (int)((var1 ^ 19957108628986L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 136377686751839L;
      var10001 = var1 ^ 97650944486408L;
      int var32 = (int)((var1 ^ 97650944486408L) >>> 32);
      int var33 = (int)((var1 ^ 97650944486408L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 126143618798322L;
      int var35 = (int)((var1 ^ 126143618798322L) >>> 32);
      int var36 = (int)((var1 ^ 126143618798322L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 102449428470252L;
      long var40 = var1 ^ 58501200986243L;
      var10001 = var1 ^ 128312612356393L;
      int var42 = (int)((var1 ^ 128312612356393L) >>> 32);
      int var43 = (int)((var1 ^ 128312612356393L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 60528277432722L;
      var10001 = var1 ^ 85844136721822L;
      int var47 = (int)((var1 ^ 85844136721822L) >>> 48);
      int var48 = (int)((var1 ^ 85844136721822L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 30780196659550L;
      var10001 = var1 ^ 15354141323751L;
      int var52 = (int)((var1 ^ 15354141323751L) >>> 48);
      int var53 = (int)((var1 ^ 15354141323751L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 107134109709294L;
      int var55 = (int)((var1 ^ 107134109709294L) >>> 32);
      int var56 = (int)((var1 ^ 107134109709294L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 111283401910214L;
      long var60 = var1 ^ 137657319558752L;
      long var62 = var1 ^ 131763109871946L;
      long var64 = var1 ^ 107750397888496L;
      long var66 = var1 ^ 111162984932705L;
      long var68 = var1 ^ 21580478073821L;
      var10001 = var1 ^ 66563138140055L;
      int var70 = (int)((var1 ^ 66563138140055L) >>> 48);
      int var71 = (int)((var1 ^ 66563138140055L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 72668225042565L;
      long var75 = var1 ^ 14992156316953L;
      var10001 = var1 ^ 37663068072866L;
      int var77 = (int)((var1 ^ 37663068072866L) >>> 48);
      int var78 = (int)((var1 ^ 37663068072866L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 70112637658890L;
      int var82 = (int)((var1 ^ 22979209346872L) >>> 48);
      long var83 = (var1 ^ 22979209346872L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 99273323720916L) >>> 48);
      long var86 = (var1 ^ 99273323720916L) << 16 >>> 16;
      var10001 = var1 ^ 22881337359119L;
      int var88 = (int)((var1 ^ 22881337359119L) >>> 48);
      int var89 = (int)((var1 ^ 22881337359119L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 77999371704222L;
      long var93 = var1 ^ 110644123891598L;
      var10001 = var1 ^ 54334935296238L;
      int var95 = (int)((var1 ^ 54334935296238L) >>> 32);
      int var96 = (int)((var1 ^ 54334935296238L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 41452155688361L;
      long var100 = var1 ^ 31610880287844L;
      var10001 = var1 ^ 99273392331117L;
      int var102 = (int)((var1 ^ 99273392331117L) >>> 32);
      int var103 = (int)((var1 ^ 99273392331117L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 64969105973165L;
      int var105 = (int)((var1 ^ 64969105973165L) >>> 32);
      int var106 = (int)((var1 ^ 64969105973165L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 94999235588566L;
      long var110 = var1 ^ 7019277872645L;
      long var112 = var1 ^ 70270606681207L;
      long var114 = var1 ^ 10976899759789L;
      var10001 = var1 ^ 46893816241364L;
      int var116 = (int)((var1 ^ 46893816241364L) >>> 48);
      int var117 = (int)((var1 ^ 46893816241364L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 71946705248207L;
      var10001 = var1 ^ 55855810617772L;
      int var121 = (int)((var1 ^ 55855810617772L) >>> 32);
      int var122 = (int)((var1 ^ 55855810617772L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 113434511217016L;
      long var126 = var1 ^ 50729349367490L;
      long var128 = var1 ^ 102297231348494L;
      long var130 = var1 ^ 19536302345025L;
      long var132 = var1 ^ 30186099750155L;
      long var134 = var1 ^ 136176588357934L;
      long var136 = var1 ^ 24701617315700L;
      long var138 = var1 ^ 38844004231477L;
      var10001 = var1 ^ 10997678954815L;
      int var140 = (int)((var1 ^ 10997678954815L) >>> 48);
      int var141 = (int)((var1 ^ 10997678954815L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 111161273886109L;
      long var145 = (var1 ^ 17101170023889L) >>> 32;
      int var147 = (int)((var1 ^ 17101170023889L) << 32 >>> 32);
      long var148 = var1 ^ 19360660198571L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(200, 220, 255, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(150, 180, 220, 150), var25);
      ThemeColors.textPlaceholder = new Color(100, 120, 160);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31923, 802264395753563681L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6454, 3159195335911523173L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19155, 1276770064457076917L ^ var1))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31726, 4008472991892611504L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15628, 3060457087321368403L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22520, 4033060076989910497L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32506, 4509939120700957840L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(180, 200, 255), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(15, 20, 35, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(30, 40, 65, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(70, 100, 180, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(100, 130, 210, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(0, 0, 20, 100), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(20, 25, 40, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(70, 100, 180, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(60, 70, 100, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(200, 220, 255, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(40, 50, 80, 255), var148);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19753, 4753636356581037865L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3922, 3501891909219014011L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22444, 4067942533859544486L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(30, 40, 65, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(100, 130, 210), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3922, 3501891909219014011L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(15, 20, 35, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(20, 28, 45, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(30, 40, 65, 255), (short)var116, (char)var117, var118);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(25, 35, 55, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(100, 130, 180, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(20, 28, 45, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(30, 42, 65, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(180, 200, 255));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31598, 1584117423787876802L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8427, 5039339030076488400L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(28931, 5017047648299887382L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3922, 3501891909219014011L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3922, 3501891909219014011L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(100, 130, 210);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(15, 20, 35, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(30, 40, 65, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(10, 15, 25, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(10, 15, 25, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(180, 200, 255));
      float[] var151 = new float[]{0.09F, 0.12F, 0.3F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.06F, 0.08F, 0.21F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.04F, 0.05F, 0.13F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.01F, 0.02F, 0.07F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3922, 3501891909219014011L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22444, 4067942533859544486L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(70, 100, 180));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(100, 130, 210, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(100, 130, 210, 38), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(100, 130, 210, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(100, 130, 210, 63), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(100, 130, 210, 102), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(100, 130, 210);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(80, 180, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 100, 120), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(20, 25, 40, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(70, 100, 180, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 6763386493231L;
      long var5 = var1 ^ 58532300889500L;
      long var7 = var1 ^ 106968478196398L;
      long var9 = var1 ^ 117557539553154L;
      long var11 = var1 ^ 35424049250573L;
      long var13 = var1 ^ 123067136265685L;
      long var10001 = var1 ^ 17381303851869L;
      int var15 = (int)((var1 ^ 17381303851869L) >>> 48);
      int var16 = (int)((var1 ^ 17381303851869L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 104727299783244L;
      var10001 = var1 ^ 85971025294388L;
      int var20 = (int)((var1 ^ 85971025294388L) >>> 48);
      int var21 = (int)((var1 ^ 85971025294388L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 69452355028173L;
      long var25 = var1 ^ 37288594585374L;
      var10001 = var1 ^ 103814606996297L;
      int var27 = (int)((var1 ^ 103814606996297L) >>> 48);
      int var28 = (int)((var1 ^ 103814606996297L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 53075042231532L;
      var10001 = var1 ^ 22667650446011L;
      int var32 = (int)((var1 ^ 22667650446011L) >>> 32);
      int var33 = (int)((var1 ^ 22667650446011L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 69232743009345L;
      int var35 = (int)((var1 ^ 69232743009345L) >>> 32);
      int var36 = (int)((var1 ^ 69232743009345L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 19107324987231L;
      long var40 = var1 ^ 133561803267632L;
      var10001 = var1 ^ 62665774145434L;
      int var42 = (int)((var1 ^ 62665774145434L) >>> 32);
      int var43 = (int)((var1 ^ 62665774145434L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 135520426571553L;
      var10001 = var1 ^ 2605935584045L;
      int var47 = (int)((var1 ^ 2605935584045L) >>> 48);
      int var48 = (int)((var1 ^ 2605935584045L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 96426481369069L;
      var10001 = var1 ^ 72273339395924L;
      int var52 = (int)((var1 ^ 72273339395924L) >>> 48);
      int var53 = (int)((var1 ^ 72273339395924L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 49742198762845L;
      int var55 = (int)((var1 ^ 49742198762845L) >>> 32);
      int var56 = (int)((var1 ^ 49742198762845L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 45611331680629L;
      long var60 = var1 ^ 54422859747539L;
      long var62 = var1 ^ 65540760592377L;
      long var64 = var1 ^ 50242538690883L;
      long var66 = var1 ^ 45456837163986L;
      long var68 = var1 ^ 105471514105198L;
      var10001 = var1 ^ 123988872210724L;
      int var70 = (int)((var1 ^ 123988872210724L) >>> 48);
      int var71 = (int)((var1 ^ 123988872210724L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 15783923443254L;
      long var75 = var1 ^ 72495738506154L;
      var10001 = var1 ^ 121000055289105L;
      int var77 = (int)((var1 ^ 121000055289105L) >>> 48);
      int var78 = (int)((var1 ^ 121000055289105L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 127035574303161L;
      int var82 = (int)((var1 ^ 97495137329547L) >>> 48);
      long var83 = (var1 ^ 97495137329547L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 24207637950055L) >>> 48);
      long var86 = (var1 ^ 24207637950055L) << 16 >>> 16;
      var10001 = var1 ^ 97319150626236L;
      int var88 = (int)((var1 ^ 97319150626236L) >>> 48);
      int var89 = (int)((var1 ^ 97319150626236L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 11807876761901L;
      long var93 = var1 ^ 44997552924989L;
      var10001 = var1 ^ 137607767881309L;
      int var95 = (int)((var1 ^ 137607767881309L) >>> 32);
      int var96 = (int)((var1 ^ 137607767881309L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 116543091952410L;
      long var100 = var1 ^ 89001986980567L;
      var10001 = var1 ^ 24208513042398L;
      int var102 = (int)((var1 ^ 24208513042398L) >>> 32);
      int var103 = (int)((var1 ^ 24208513042398L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 131234149728542L;
      int var105 = (int)((var1 ^ 131234149728542L) >>> 32);
      int var106 = (int)((var1 ^ 131234149728542L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 28772575997797L;
      long var110 = var1 ^ 81569298215094L;
      long var112 = var1 ^ 127151401056964L;
      long var114 = var1 ^ 76649507774494L;
      var10001 = var1 ^ 113162889806439L;
      int var116 = (int)((var1 ^ 113162889806439L) >>> 48);
      int var117 = (int)((var1 ^ 113162889806439L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 14443930190204L;
      var10001 = var1 ^ 139094283468575L;
      int var121 = (int)((var1 ^ 139094283468575L) >>> 32);
      int var122 = (int)((var1 ^ 139094283468575L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 47719756599243L;
      long var126 = var1 ^ 108227811498097L;
      long var128 = var1 ^ 18985747336637L;
      long var130 = var1 ^ 102844045170162L;
      long var132 = var1 ^ 95905132555192L;
      long var134 = var1 ^ 61124057112477L;
      long var136 = var1 ^ 99208706851271L;
      long var138 = var1 ^ 122155505940358L;
      var10001 = var1 ^ 77296528803724L;
      int var140 = (int)((var1 ^ 77296528803724L) >>> 48);
      int var141 = (int)((var1 ^ 77296528803724L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 45442241215278L;
      long var145 = (var1 ^ 74492813575010L) >>> 32;
      int var147 = (int)((var1 ^ 74492813575010L) << 32 >>> 32);
      long var148 = var1 ^ 103175212042776L;
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(255, 245, 252);
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var35, var36, var150, var37);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(255, 225, 242, 220));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(255, 200, 230, 170), var25);
      ThemeColors.textPlaceholder = new Color(255, 170, 210);
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(new Color(82, 46, 62), (char)var27, var28, var29);
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(new Color(102, 60, 80), var138);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(122, 76, 98);
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var40, new Color(142, 96, 118));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(172, 114, 144);
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var11, new Color(208, 122, 170));
      ThemeColors.INSTANCE.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(var18, new Color(240, 140, 195));
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(255, 230, 240), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(70, 28, 48, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(172, 114, 144, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(225, 130, 175, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(242, 160, 200, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(30, 10, 22, 130), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(102, 60, 80, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(242, 160, 200, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(200, 145, 170, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(255, 230, 240, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(172, 114, 144, 255), var148);
      ThemeColors.INSTANCE.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(var126, new Color(82, 46, 62, 255));
      ThemeColors.INSTANCE.IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(var108, new Color(172, 114, 144, 255));
      ThemeColors.INSTANCE.llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(var98, new Color(225, 130, 175, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(172, 114, 144, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(242, 160, 200), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(122, 76, 98, 255);
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(102, 60, 80, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(142, 96, 118, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(172, 114, 144, 255), (short)var116, (char)var117, var118
         );
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(142, 96, 118, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(242, 160, 200, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(122, 76, 98, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(172, 114, 144, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(255, 195, 220));
      ThemeColors.INSTANCE.lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(var93, new Color(142, 96, 118, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(102, 60, 80, 255);
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(102, 60, 80, 255);
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE.IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(new Color(172, 114, 144, 255), var9);
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(new Color(142, 96, 118, 255), var121, (char)var122, var123);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(242, 160, 200);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(102, 60, 80, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(172, 114, 144, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(82, 46, 62, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(82, 46, 62, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(255, 230, 240));
      float[] var151 = new float[]{0.38F, 0.22F, 0.32F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.3F, 0.18F, 0.3F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.36F, 0.24F, 0.34F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.32F, 0.26F, 0.32F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(456, 3577083775403017681L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.75F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18082, 614036443210121844L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.88F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(242, 160, 200));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 190, 220, 28);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(255, 170, 210, 45), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(255, 155, 200, 61));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(255, 200, 225, 86), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(255, 170, 205, 140), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(242, 160, 200);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(200, 160, 225));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(225, 130, 175), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(175, 230, 210, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(225, 130, 175, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(short var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var6 = var4 ^ 25977115230448L;
      long var8 = var4 ^ 40385049429059L;
      long var10 = var4 ^ 124036367727473L;
      long var12 = var4 ^ 135703835223645L;
      long var14 = var4 ^ 54637090134226L;
      long var16 = var4 ^ 138998856471562L;
      long var10001 = var4 ^ 33295055651458L;
      int var18 = (int)((var4 ^ 33295055651458L) >>> 48);
      int var19 = (int)((var4 ^ 33295055651458L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var4 ^ 86557617185683L;
      var10001 = var4 ^ 105236595895787L;
      int var23 = (int)((var4 ^ 105236595895787L) >>> 48);
      int var24 = (int)((var4 ^ 105236595895787L) << 16 >>> 32);
      int var25 = (int)(var10001 << 48 >>> 48);
      long var26 = var4 ^ 51317870779666L;
      long var28 = var4 ^ 53253583220417L;
      var10001 = var4 ^ 87882635401878L;
      int var30 = (int)((var4 ^ 87882635401878L) >>> 48);
      int var31 = (int)((var4 ^ 87882635401878L) << 16 >>> 32);
      int var32 = (int)(var10001 << 48 >>> 48);
      long var33 = var4 ^ 37123592813875L;
      var10001 = var4 ^ 5614676126564L;
      int var35 = (int)((var4 ^ 5614676126564L) >>> 32);
      int var36 = (int)((var4 ^ 5614676126564L) << 32 >>> 56);
      int var37 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 52164467348894L;
      int var38 = (int)((var4 ^ 52164467348894L) >>> 32);
      int var39 = (int)((var4 ^ 52164467348894L) << 32 >>> 48);
      int var40 = (int)(var10001 << 48 >>> 48);
      long var41 = var4 ^ 988796132992L;
      long var43 = var4 ^ 115447551805423L;
      var10001 = var4 ^ 45597498476101L;
      int var45 = (int)((var4 ^ 45597498476101L) >>> 32);
      int var46 = (int)((var4 ^ 45597498476101L) << 32 >>> 48);
      int var47 = (int)(var10001 << 48 >>> 48);
      long var48 = var4 ^ 117405940756222L;
      var10001 = var4 ^ 21819513600754L;
      int var50 = (int)((var4 ^ 21819513600754L) >>> 48);
      int var51 = (int)((var4 ^ 21819513600754L) << 16 >>> 32);
      int var52 = (int)(var10001 << 48 >>> 48);
      long var53 = var4 ^ 77197602530866L;
      var10001 = var4 ^ 88225326478987L;
      int var55 = (int)((var4 ^ 88225326478987L) >>> 48);
      int var56 = (int)((var4 ^ 88225326478987L) << 16 >>> 32);
      int var57 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 66775996724354L;
      int var58 = (int)((var4 ^ 66775996724354L) >>> 32);
      int var59 = (int)((var4 ^ 66775996724354L) << 32 >>> 48);
      int var60 = (int)(var10001 << 48 >>> 48);
      long var61 = var4 ^ 62660531904682L;
      long var63 = var4 ^ 36256817809676L;
      long var65 = var4 ^ 46304449709606L;
      long var67 = var4 ^ 66198283600028L;
      long var69 = var4 ^ 62471425991181L;
      long var71 = var4 ^ 86225724099761L;
      var10001 = var4 ^ 106938598240507L;
      int var73 = (int)((var4 ^ 106938598240507L) >>> 48);
      int var74 = (int)((var4 ^ 106938598240507L) << 16 >>> 32);
      int var75 = (int)(var10001 << 48 >>> 48);
      long var76 = var4 ^ 35029864447977L;
      long var78 = var4 ^ 88415244374645L;
      var10001 = var4 ^ 140232709516494L;
      int var80 = (int)((var4 ^ 140232709516494L) >>> 48);
      int var81 = (int)((var4 ^ 140232709516494L) << 16 >>> 32);
      int var82 = (int)(var10001 << 48 >>> 48);
      long var83 = var4 ^ 107817566576742L;
      int var85 = (int)((var4 ^ 80458268358740L) >>> 48);
      long var86 = (var4 ^ 80458268358740L) << 16 >>> 16;
      int var88 = (int)((var4 ^ 8258050799544L) >>> 48);
      long var89 = (var4 ^ 8258050799544L) << 16 >>> 16;
      var10001 = var4 ^ 80282013219939L;
      int var91 = (int)((var4 ^ 80282013219939L) >>> 48);
      int var92 = (int)((var4 ^ 80282013219939L) << 16 >>> 32);
      int var93 = (int)(var10001 << 48 >>> 48);
      long var94 = var4 ^ 29943468314866L;
      long var96 = var4 ^ 63128279609570L;
      var10001 = var4 ^ 119441758711682L;
      int var98 = (int)((var4 ^ 119441758711682L) >>> 32);
      int var99 = (int)((var4 ^ 119441758711682L) << 32 >>> 48);
      int var100 = (int)(var10001 << 48 >>> 48);
      long var101 = var4 ^ 132457598735045L;
      long var103 = var4 ^ 71969128538888L;
      var10001 = var4 ^ 8257180802561L;
      int var105 = (int)((var4 ^ 8257180802561L) >>> 32);
      int var106 = (int)((var4 ^ 8257180802561L) << 32 >>> 40);
      int var107 = (int)(var10001 << 56 >>> 56);
      var10001 = var4 ^ 113102215878849L;
      int var108 = (int)((var4 ^ 113102215878849L) >>> 32);
      int var109 = (int)((var4 ^ 113102215878849L) << 32 >>> 48);
      int var110 = (int)(var10001 << 48 >>> 48);
      long var111 = var4 ^ 12841393190586L;
      long var113 = var4 ^ 100782087956841L;
      long var115 = var4 ^ 107899302028059L;
      long var117 = var4 ^ 92567939643841L;
      var10001 = var4 ^ 131310913805240L;
      int var119 = (int)((var4 ^ 131310913805240L) >>> 48);
      int var120 = (int)((var4 ^ 131310913805240L) << 16 >>> 48);
      int var121 = (int)(var10001 << 32 >>> 32);
      long var122 = var4 ^ 31490713983139L;
      var10001 = var4 ^ 122078352975552L;
      int var124 = (int)((var4 ^ 122078352975552L) >>> 32);
      int var125 = (int)((var4 ^ 122078352975552L) << 32 >>> 48);
      int var126 = (int)(var10001 << 48 >>> 48);
      long var127 = var4 ^ 64735401874964L;
      long var129 = var4 ^ 127441305878958L;
      long var131 = var4 ^ 835559871586L;
      long var133 = var4 ^ 83630584073261L;
      long var135 = var4 ^ 77787677176423L;
      long var137 = var4 ^ 41856338495042L;
      long var139 = var4 ^ 83271601690648L;
      long var141 = var4 ^ 139223345655385L;
      var10001 = var4 ^ 96533645254227L;
      int var143 = (int)((var4 ^ 96533645254227L) >>> 48);
      int var144 = (int)((var4 ^ 96533645254227L) << 16 >>> 48);
      int var145 = (int)(var10001 << 32 >>> 32);
      long var146 = var4 ^ 62477364830961L;
      long var148 = (var4 ^ 90463960242877L) >>> 32;
      int var150 = (int)((var4 ^ 90463960242877L) << 32 >>> 32);
      long var151 = var4 ^ 83909238526919L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var38, var39, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var40
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var53, new Color(210, 240, 220, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(170, 210, 180, 150), var28);
      ThemeColors.textPlaceholder = new Color(130, 170, 140);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6154, 1787238003696059676L ^ var4)), var141
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3383, 1535332122469355530L ^ var4)),
            (char)var30,
            var31,
            var32
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var43, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9810, 1953061932711050150L ^ var4))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12618, 2375124726860049458L ^ var4));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var148, var150, var153);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var14, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2610, 9081119402059290411L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var21, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31215, 8587884379558552594L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24903, 6625878685572578477L ^ var4));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var80, var81, (char)var82, var153);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(140, 230, 170), var133);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var67, new Color(18, 38, 24, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(35, 68, 45, 255), var98, (char)var99, (char)var100);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(80, 170, 100, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var73, var153, var74, (short)var75);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(100, 200, 125, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var108, var109, (char)var110, var153);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(5, 20, 12, 100), var137);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var135, new Color(25, 45, 32, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var6, new Color(80, 170, 100, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var117, new Color(70, 110, 80, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(190, 240, 210, 255), var26);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(45, 82, 58, 255), var151);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var129, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10035, 3066256286362401343L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var111, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20596, 6999748152039443834L ^ var4))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var101, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12859, 3326922928909709166L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(35, 68, 45, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var55, var56, var153, var57);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(100, 200, 125), var122);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20596, 6999748152039443834L ^ var4));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var23, var153, var24, (short)var25);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(18, 38, 24, 255), var146);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(24, 48, 32, 255), var94);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(35, 68, 45, 255), (short)var119, (char)var120, var121);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(28, 58, 38, 255), var16);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var10, new Color(110, 180, 130, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(24, 48, 32, 255), var65);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(35, 68, 48, 255), var83);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var61, new Color(140, 230, 170));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var96, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26955, 651473517186790573L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25255, 3867035806310252532L ^ var4));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var143, var153, (char)var144, var145);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30109, 594074010966075580L ^ var4));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var91, var153, var92, (char)var93);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20596, 6999748152039443834L ^ var4)), var12
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20596, 6999748152039443834L ^ var4)),
            var124,
            (char)var125,
            var126
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(100, 200, 125);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var85, var153, var86);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(18, 38, 24, 255), var8);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var76, new Color(35, 68, 45, 255));
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(12, 28, 18, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var88, var153, var89);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(12, 28, 18, 255), var105, var106, (byte)var107);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var63, new Color(140, 230, 170));
      float[] var154 = new float[]{0.05F, 0.09F, 0.07F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var115, var154);
      var154 = new float[]{0.08F, 0.14F, 0.11F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var154, var58, var59, (short)var60);
      var154 = new float[]{0.1F, 0.16F, 0.13F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var154, (char)var50, var51, (char)var52);
      var154 = new float[]{0.04F, 0.08F, 0.06F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var78, var154);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var45,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20596, 6999748152039443834L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var46,
            (short)var47
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12859, 3326922928909709166L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var48
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var33, new Color(80, 170, 100));
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(120, 200, 140, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var18, var19, var153, (short)var20);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(120, 200, 140, 38), var131);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var139, new Color(120, 200, 140, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(120, 200, 140, 63), var103);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(120, 200, 140, 102), var71);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(100, 200, 125);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var35, (byte)var36, var153, var37);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var41, new Color(80, 220, 160));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 110, 95), var69);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var113, new Color(25, 45, 32, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(80, 170, 100, 255), var127);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      long var6 = var4 ^ 34902762066174L;
      long var8 = var4 ^ 49086283863117L;
      long var10 = var4 ^ 132840614718335L;
      long var12 = var4 ^ 126934149330515L;
      long var14 = var4 ^ 63424224331996L;
      long var16 = var4 ^ 130245343773700L;
      long var10001 = var4 ^ 24559460995724L;
      int var18 = (int)((var4 ^ 24559460995724L) >>> 48);
      int var19 = (int)((var4 ^ 24559460995724L) << 16 >>> 32);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var4 ^ 77684919219101L;
      var10001 = var4 ^ 96380809887205L;
      int var23 = (int)((var4 ^ 96380809887205L) >>> 48);
      int var24 = (int)((var4 ^ 96380809887205L) << 16 >>> 32);
      int var25 = (int)(var10001 << 48 >>> 48);
      long var26 = var4 ^ 42547916344604L;
      long var28 = var4 ^ 62058971070159L;
      var10001 = var4 ^ 79113016969880L;
      int var30 = (int)((var4 ^ 79113016969880L) >>> 48);
      int var31 = (int)((var4 ^ 79113016969880L) << 16 >>> 32);
      int var32 = (int)(var10001 << 48 >>> 48);
      long var33 = var4 ^ 46031992139069L;
      var10001 = var4 ^ 14316984302442L;
      int var35 = (int)((var4 ^ 14316984302442L) >>> 32);
      int var36 = (int)((var4 ^ 14316984302442L) << 32 >>> 56);
      int var37 = (int)(var10001 << 40 >>> 40);
      var10001 = var4 ^ 43359147001232L;
      int var38 = (int)((var4 ^ 43359147001232L) >>> 32);
      int var39 = (int)((var4 ^ 43359147001232L) << 32 >>> 48);
      int var40 = (int)(var10001 << 48 >>> 48);
      long var41 = var4 ^ 9861560684174L;
      long var43 = var4 ^ 106521905403873L;
      var10001 = var4 ^ 36723391649355L;
      int var45 = (int)((var4 ^ 36723391649355L) >>> 32);
      int var46 = (int)((var4 ^ 36723391649355L) << 32 >>> 48);
      int var47 = (int)(var10001 << 48 >>> 48);
      long var48 = var4 ^ 108686720728816L;
      var10001 = var4 ^ 30539002063612L;
      int var50 = (int)((var4 ^ 30539002063612L) >>> 48);
      int var51 = (int)((var4 ^ 30539002063612L) << 16 >>> 32);
      int var52 = (int)(var10001 << 48 >>> 48);
      long var53 = var4 ^ 85950309398076L;
      var10001 = var4 ^ 96910119233157L;
      int var55 = (int)((var4 ^ 96910119233157L) >>> 48);
      int var56 = (int)((var4 ^ 96910119233157L) << 16 >>> 32);
      int var57 = (int)(var10001 << 48 >>> 48);
      var10001 = var4 ^ 57884710118540L;
      int var58 = (int)((var4 ^ 57884710118540L) >>> 32);
      int var59 = (int)((var4 ^ 57884710118540L) << 32 >>> 48);
      int var60 = (int)(var10001 << 48 >>> 48);
      long var61 = var4 ^ 53753138589860L;
      long var63 = var4 ^ 44975164938498L;
      long var65 = var4 ^ 37397123503656L;
      long var67 = var4 ^ 57358602997906L;
      long var69 = var4 ^ 53667380228611L;
      long var71 = var4 ^ 77471942843583L;
      var10001 = var4 ^ 115847065297141L;
      int var73 = (int)((var4 ^ 115847065297141L) >>> 48);
      int var74 = (int)((var4 ^ 115847065297141L) << 16 >>> 32);
      int var75 = (int)(var10001 << 48 >>> 48);
      long var76 = var4 ^ 26122740150247L;
      long var78 = var4 ^ 97272104616571L;
      var10001 = var4 ^ 131478928489664L;
      int var80 = (int)((var4 ^ 131478928489664L) >>> 48);
      int var81 = (int)((var4 ^ 131478928489664L) << 16 >>> 32);
      int var82 = (int)(var10001 << 48 >>> 48);
      long var83 = var4 ^ 116621545074792L;
      int var85 = (int)((var4 ^ 71687509174362L) >>> 48);
      long var86 = (var4 ^ 71687509174362L) << 16 >>> 16;
      int var88 = (int)((var4 ^ 17165108045750L) >>> 48);
      long var89 = (var4 ^ 17165108045750L) << 16 >>> 16;
      var10001 = var4 ^ 71580845927533L;
      int var91 = (int)((var4 ^ 71580845927533L) >>> 48);
      int var92 = (int)((var4 ^ 71580845927533L) << 16 >>> 32);
      int var93 = (int)(var10001 << 48 >>> 48);
      long var94 = var4 ^ 21053590929660L;
      long var96 = var4 ^ 54374699868396L;
      var10001 = var4 ^ 110774078717836L;
      int var98 = (int)((var4 ^ 110774078717836L) >>> 32);
      int var99 = (int)((var4 ^ 110774078717836L) << 32 >>> 48);
      int var100 = (int)(var10001 << 48 >>> 48);
      long var101 = var4 ^ 123583826952907L;
      long var103 = var4 ^ 80722640679686L;
      var10001 = var4 ^ 17165580357135L;
      int var105 = (int)((var4 ^ 17165580357135L) >>> 32);
      int var106 = (int)((var4 ^ 17165580357135L) << 32 >>> 40);
      int var107 = (int)(var10001 << 56 >>> 56);
      var10001 = var4 ^ 121786002000079L;
      int var108 = (int)((var4 ^ 121786002000079L) >>> 32);
      int var109 = (int)((var4 ^ 121786002000079L) << 32 >>> 48);
      int var110 = (int)(var10001 << 48 >>> 48);
      long var111 = var4 ^ 4071438689972L;
      long var113 = var4 ^ 92045486635367L;
      long var115 = var4 ^ 116807701918485L;
      long var117 = var4 ^ 101355006798287L;
      var10001 = var4 ^ 140132407217078L;
      int var119 = (int)((var4 ^ 140132407217078L) >>> 48);
      int var120 = (int)((var4 ^ 140132407217078L) << 16 >>> 48);
      int var121 = (int)(var10001 << 32 >>> 32);
      long var122 = var4 ^ 22789815257261L;
      var10001 = var4 ^ 113360273733326L;
      int var124 = (int)((var4 ^ 113360273733326L) >>> 32);
      int var125 = (int)((var4 ^ 113360273733326L) << 32 >>> 48);
      int var126 = (int)(var10001 << 48 >>> 48);
      long var127 = var4 ^ 56067722036762L;
      long var129 = var4 ^ 136296890732960L;
      long var131 = var4 ^ 9743690761324L;
      long var133 = var4 ^ 74843718704163L;
      long var135 = var4 ^ 86455289930345L;
      long var137 = var4 ^ 50643472864844L;
      long var139 = var4 ^ 74363134593046L;
      long var141 = var4 ^ 130297967033943L;
      var10001 = var4 ^ 105372050755165L;
      int var143 = (int)((var4 ^ 105372050755165L) >>> 48);
      int var144 = (int)((var4 ^ 105372050755165L) << 16 >>> 48);
      int var145 = (int)(var10001 << 32 >>> 32);
      long var146 = var4 ^ 53655133156095L;
      long var148 = (var4 ^ 99337798601395L) >>> 32;
      int var150 = (int)((var4 ^ 99337798601395L) << 32 >>> 32);
      long var151 = var4 ^ 75104186713033L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var38, var39, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var40
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var53, new Color(220, 200, 255, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(180, 150, 220, 150), var28);
      ThemeColors.textPlaceholder = new Color(120, 100, 160);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21853, 8678605092703262832L ^ var4)), var141
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12866, 3274055734873374625L ^ var4)),
            (char)var30,
            var31,
            var32
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var43, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20417, 235796366543995408L ^ var4))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29390, 4284975043040706494L ^ var4));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var148, var150, var153);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var14, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23723, 1273360411694715221L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var21, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12643, 6168897994136501301L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30972, 2672190678587405615L ^ var4));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var80, var81, (char)var82, var153);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(200, 180, 255), var133);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var67, new Color(20, 15, 35, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(40, 30, 65, 255), var98, (char)var99, (char)var100);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(120, 80, 200, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var73, var153, var74, (short)var75);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(160, 100, 230, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var108, var109, (char)var110, var153);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(10, 0, 20, 100), var137);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var135, new Color(25, 20, 40, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var6, new Color(120, 80, 200, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var117, new Color(70, 60, 100, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(220, 200, 255, 255), var26);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(50, 40, 80, 255), var151);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var129, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2068, 8051971290730431745L ^ var4))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var111, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29845, 6407501823256623521L ^ var4))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var101, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27454, 6362226083636274891L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(40, 30, 65, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var55, var56, var153, var57);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(160, 120, 230), var122);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29845, 6407501823256623521L ^ var4));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var23, var153, var24, (short)var25);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(20, 15, 35, 255), var146);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(28, 20, 45, 255), var94);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(40, 30, 65, 255), (short)var119, (char)var120, var121);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(35, 25, 55, 255), var16);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var10, new Color(150, 110, 200, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(28, 20, 45, 255), var65);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(42, 30, 65, 255), var83);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var61, new Color(200, 180, 255));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var96, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2681, 5594692523568891795L ^ var4))
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17728, 1266611983681996896L ^ var4));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var143, var153, (char)var144, var145);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2868, 1093722796834621012L ^ var4));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var91, var153, var92, (char)var93);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29845, 6407501823256623521L ^ var4)), var12
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29845, 6407501823256623521L ^ var4)),
            var124,
            (char)var125,
            var126
         );
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(160, 120, 230);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var85, var153, var86);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(20, 15, 35, 255), var8);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var76, new Color(40, 30, 65, 255));
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(15, 10, 25, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var88, var153, var89);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(15, 10, 25, 255), var105, var106, (byte)var107);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var63, new Color(200, 180, 255));
      float[] var154 = new float[]{0.18F, 0.05F, 0.26F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var115, var154);
      var154 = new float[]{0.1F, 0.03F, 0.15F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var154, var58, var59, (short)var60);
      var154 = new float[]{0.05F, 0.02F, 0.09F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var154, (char)var50, var51, (char)var52);
      var154 = new float[]{0.02F, 0.008F, 0.04F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var78, var154);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var45,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29845, 6407501823256623521L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var46,
            (short)var47
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27454, 6362226083636274891L ^ var4), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var48
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var33, new Color(120, 80, 200));
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(180, 150, 255, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var18, var19, var153, (short)var20);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(180, 150, 255, 38), var131);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var139, new Color(180, 150, 255, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(180, 150, 255, 63), var103);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(180, 150, 255, 102), var71);
      var10000 = ThemeColors.INSTANCE;
      var153 = new Color(160, 120, 230);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var35, (byte)var36, var153, var37);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var41, new Color(130, 180, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 100, 150), var69);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var113, new Color(25, 20, 40, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(120, 80, 200, 255), var127);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 49188851171597L;
      long var5 = var1 ^ 34797963380158L;
      long var7 = var1 ^ 83372279511692L;
      long var9 = var1 ^ 70853712488352L;
      long var11 = var1 ^ 11741784234287L;
      long var13 = var1 ^ 76381057668599L;
      long var10001 = var1 ^ 41046789489535L;
      int var15 = (int)((var1 ^ 41046789489535L) >>> 48);
      int var16 = (int)((var1 ^ 41046789489535L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 129354428310126L;
      var10001 = var1 ^ 110684080958486L;
      int var20 = (int)((var1 ^ 110684080958486L) >>> 48);
      int var21 = (int)((var1 ^ 110684080958486L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 23848742083823L;
      long var25 = var1 ^ 12592715181884L;
      var10001 = var1 ^ 128579207322475L;
      int var27 = (int)((var1 ^ 128579207322475L) >>> 48);
      int var28 = (int)((var1 ^ 128579207322475L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 29546861984974L;
      var10001 = var1 ^ 68202679708313L;
      int var32 = (int)((var1 ^ 68202679708313L) >>> 32);
      int var33 = (int)((var1 ^ 68202679708313L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 22460870317155L;
      int var35 = (int)((var1 ^ 22460870317155L) >>> 32);
      int var36 = (int)((var1 ^ 22460870317155L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 65948424740733L;
      long var40 = var1 ^ 92235813701138L;
      var10001 = var1 ^ 20223223302072L;
      int var42 = (int)((var1 ^ 20223223302072L) >>> 32);
      int var43 = (int)((var1 ^ 20223223302072L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 90002580909827L;
      var10001 = var1 ^ 44825112148751L;
      int var47 = (int)((var1 ^ 44825112148751L) >>> 48);
      int var48 = (int)((var1 ^ 44825112148751L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 137615568578511L;
      var10001 = var1 ^ 117791215007606L;
      int var52 = (int)((var1 ^ 117791215007606L) >>> 48);
      int var53 = (int)((var1 ^ 117791215007606L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 8416377042303L;
      int var55 = (int)((var1 ^ 8416377042303L) >>> 32);
      int var56 = (int)((var1 ^ 8416377042303L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 4267620917591L;
      long var60 = var1 ^ 30671871838449L;
      long var62 = var1 ^ 18700035901403L;
      long var64 = var1 ^ 7868742123873L;
      long var66 = var1 ^ 4181882446832L;
      long var68 = var1 ^ 129154315865420L;
      var10001 = var1 ^ 99361880060166L;
      int var70 = (int)((var1 ^ 99361880060166L) >>> 48);
      int var71 = (int)((var1 ^ 99361880060166L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 40411047001620L;
      long var75 = var1 ^ 118151052415880L;
      var10001 = var1 ^ 75413459021107L;
      int var77 = (int)((var1 ^ 75413459021107L) >>> 48);
      int var78 = (int)((var1 ^ 75413459021107L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 97941687116187L;
      int var82 = (int)((var1 ^ 125558238788009L) >>> 48);
      long var83 = (var1 ^ 125558238788009L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 66650688108101L) >>> 48);
      long var86 = (var1 ^ 66650688108101L) << 16 >>> 16;
      var10001 = var1 ^ 125451504237982L;
      int var88 = (int)((var1 ^ 125451504237982L) >>> 48);
      int var89 = (int)((var1 ^ 125451504237982L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 35352571236623L;
      long var93 = var1 ^ 2709488398623L;
      var10001 = var1 ^ 96470789320319L;
      int var95 = (int)((var1 ^ 96470789320319L) >>> 32);
      int var96 = (int)((var1 ^ 96470789320319L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 74100410635064L;
      long var100 = var1 ^ 134589090554613L;
      var10001 = var1 ^ 66651163566076L;
      int var102 = (int)((var1 ^ 66651163566076L) >>> 32);
      int var103 = (int)((var1 ^ 66651163566076L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 103084615211324L;
      int var105 = (int)((var1 ^ 103084615211324L) >>> 32);
      int var106 = (int)((var1 ^ 103084615211324L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 53537674655559L;
      long var110 = var1 ^ 106333730039956L;
      long var112 = var1 ^ 98125694378726L;
      long var114 = var1 ^ 122236104177724L;
      var10001 = var1 ^ 84051921132101L;
      int var116 = (int)((var1 ^ 84051921132101L) >>> 48);
      int var117 = (int)((var1 ^ 84051921132101L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 43675126831454L;
      var10001 = var1 ^ 92477027821373L;
      int var121 = (int)((var1 ^ 92477027821373L) >>> 32);
      int var122 = (int)((var1 ^ 92477027821373L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 2184160450537L;
      long var126 = var1 ^ 80216391008339L;
      long var128 = var1 ^ 65826338526623L;
      long var130 = var1 ^ 130924225760720L;
      long var132 = var1 ^ 138142026052506L;
      long var134 = var1 ^ 31944230930367L;
      long var136 = var1 ^ 123835827657189L;
      long var138 = var1 ^ 76431605788580L;
      var10001 = var1 ^ 119671027916718L;
      int var140 = (int)((var1 ^ 119671027916718L) >>> 48);
      int var141 = (int)((var1 ^ 119671027916718L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 4184600126220L;
      long var145 = (var1 ^ 115835814189888L) >>> 32;
      int var147 = (int)((var1 ^ 115835814189888L) << 32 >>> 32);
      long var148 = var1 ^ 131169591136826L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(230, 250, 255, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(200, 240, 255, 150), var25);
      ThemeColors.textPlaceholder = new Color(160, 215, 245);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(7579, 4233621622468460809L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27016, 4465394912446854514L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27861, 1778839002953691232L ^ var1))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25980, 3208623174048266645L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5939, 784874794742991745L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27631, 207386910020679437L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15363, 2635601719066747027L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(180, 230, 255), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(30, 50, 65, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(55, 95, 125, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(120, 190, 245, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 215, 255, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(10, 25, 40, 100), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(40, 65, 85, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(120, 190, 245, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(95, 145, 180, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(220, 245, 255, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(65, 105, 135, 255), var148);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26770, 8926782115160241171L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16363, 8876954411822736348L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17561, 5522963563099166837L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(55, 95, 125, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(150, 215, 255), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16363, 8876954411822736348L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(30, 50, 65, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(42, 68, 88, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(55, 95, 125, 255), (short)var116, (char)var117, var118
         );
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(48, 80, 105, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(150, 210, 245, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(42, 68, 88, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(58, 90, 115, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(180, 230, 255));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30678, 987664584977226L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8351, 6754492741712936018L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22785, 5136437096013333921L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16363, 8876954411822736348L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16363, 8876954411822736348L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 215, 255);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(30, 50, 65, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(55, 95, 125, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(22, 38, 50, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(22, 38, 50, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(180, 230, 255));
      float[] var151 = new float[]{0.28F, 0.48F, 0.68F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.2F, 0.36F, 0.52F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.24F, 0.42F, 0.54F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.32F, 0.44F, 0.52F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16363, 8876954411822736348L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17561, 5522963563099166837L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(120, 190, 245));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 215, 255, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(150, 215, 255, 38), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(150, 215, 255, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(150, 215, 255, 63), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(150, 215, 255, 102), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 215, 255);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(120, 225, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 130, 160), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(40, 65, 85, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(120, 190, 245, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 134359736244789L;
      long var5 = var1 ^ 80443469110918L;
      long var7 = var1 ^ 32281565798836L;
      long var9 = var1 ^ 25285915622552L;
      long var11 = var1 ^ 101302788506135L;
      long var13 = var1 ^ 21957577199311L;
      long var10001 = var1 ^ 127385761945671L;
      int var15 = (int)((var1 ^ 127385761945671L) >>> 48);
      int var16 = (int)((var1 ^ 127385761945671L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 38663579138390L;
      var10001 = var1 ^ 55134915295022L;
      int var20 = (int)((var1 ^ 55134915295022L) >>> 48);
      int var21 = (int)((var1 ^ 55134915295022L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 73938056333271L;
      long var25 = var1 ^ 103338054595588L;
      var10001 = var1 ^ 37927004651603L;
      int var27 = (int)((var1 ^ 37927004651603L) >>> 48);
      int var28 = (int)((var1 ^ 37927004651603L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 83910078752758L;
      var10001 = var1 ^ 114933595812257L;
      int var32 = (int)((var1 ^ 114933595812257L) >>> 32);
      int var33 = (int)((var1 ^ 114933595812257L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 73539108196187L;
      int var35 = (int)((var1 ^ 73539108196187L) >>> 32);
      int var36 = (int)((var1 ^ 73539108196187L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 120351094178885L;
      long var40 = var1 ^ 5965419175210L;
      var10001 = var1 ^ 75776818093184L;
      int var42 = (int)((var1 ^ 75776818093184L) >>> 32);
      int var43 = (int)((var1 ^ 75776818093184L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 8061242881083L;
      var10001 = var1 ^ 138860935471159L;
      int var47 = (int)((var1 ^ 138860935471159L) >>> 48);
      int var48 = (int)((var1 ^ 138860935471159L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 47994704313591L;
      var10001 = var1 ^ 67821222407246L;
      int var52 = (int)((var1 ^ 67821222407246L) >>> 48);
      int var53 = (int)((var1 ^ 67821222407246L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 89232969330247L;
      int var55 = (int)((var1 ^ 89232969330247L) >>> 32);
      int var56 = (int)((var1 ^ 89232969330247L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 93931444304495L;
      long var60 = var1 ^ 85121526862793L;
      long var62 = var1 ^ 78676496932067L;
      long var64 = var1 ^ 89780550228569L;
      long var66 = var1 ^ 93742355167432L;
      long var68 = var1 ^ 39550898919028L;
      var10001 = var1 ^ 14095038884414L;
      int var70 = (int)((var1 ^ 14095038884414L) >>> 48);
      int var71 = (int)((var1 ^ 14095038884414L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 125685007934764L;
      long var75 = var1 ^ 68146431772848L;
      var10001 = var1 ^ 19899325232651L;
      int var77 = (int)((var1 ^ 19899325232651L) >>> 48);
      int var78 = (int)((var1 ^ 19899325232651L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 17164553796259L;
      int var82 = (int)((var1 ^ 40400381354641L) >>> 48);
      long var83 = (var1 ^ 40400381354641L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 116625253543293L) >>> 48);
      long var86 = (var1 ^ 116625253543293L) << 16 >>> 16;
      var10001 = var1 ^ 40232166696614L;
      int var88 = (int)((var1 ^ 40232166696614L) >>> 48);
      int var89 = (int)((var1 ^ 40232166696614L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 130466429192759L;
      long var93 = var1 ^ 93430140004903L;
      var10001 = var1 ^ 1318143489351L;
      int var95 = (int)((var1 ^ 1318143489351L) >>> 32);
      int var96 = (int)((var1 ^ 1318143489351L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 24100755916800L;
      long var100 = var1 ^ 49374050089421L;
      var10001 = var1 ^ 116624782001348L;
      int var102 = (int)((var1 ^ 116624782001348L) >>> 32);
      int var103 = (int)((var1 ^ 116624782001348L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 12433888805380L;
      int var105 = (int)((var1 ^ 12433888805380L) >>> 32);
      int var106 = (int)((var1 ^ 12433888805380L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 112418794368127L;
      long var110 = var1 ^ 59624823550892L;
      long var112 = var1 ^ 17253276957150L;
      long var114 = var1 ^ 63376332481284L;
      var10001 = var1 ^ 29679847162237L;
      int var116 = (int)((var1 ^ 29679847162237L) >>> 48);
      int var117 = (int)((var1 ^ 29679847162237L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 124482449703526L;
      var10001 = var1 ^ 2837903653893L;
      int var121 = (int)((var1 ^ 2837903653893L) >>> 32);
      int var122 = (int)((var1 ^ 2837903653893L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 96152343153873L;
      long var126 = var1 ^ 33515393801067L;
      long var128 = var1 ^ 120198415765159L;
      long var130 = var1 ^ 36956442564328L;
      long var132 = var1 ^ 47468217477282L;
      long var134 = var1 ^ 83022335450247L;
      long var136 = var1 ^ 41985366622941L;
      long var138 = var1 ^ 20942846686364L;
      var10001 = var1 ^ 64152471225494L;
      int var140 = (int)((var1 ^ 64152471225494L) >>> 48);
      int var141 = (int)((var1 ^ 64152471225494L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 93741717338164L;
      long var145 = (var1 ^ 70186691919992L) >>> 32;
      int var147 = (int)((var1 ^ 70186691919992L) << 32 >>> 32);
      long var148 = var1 ^ 37125441128706L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(248, 242, 255, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(235, 220, 250, 150), var25);
      ThemeColors.textPlaceholder = new Color(210, 185, 235);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27108, 4388425595211165422L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24856, 8620467723023918806L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2640, 3079664636955086240L ^ var1))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29499, 3423237993679631492L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12952, 1099799291136144702L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27114, 8341411788474101497L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11444, 6570684597857217374L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(225, 200, 255), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(48, 38, 60, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(90, 70, 115, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(175, 140, 230, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(200, 165, 250, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(25, 15, 35, 100), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(60, 48, 75, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(175, 140, 230, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(135, 110, 165, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(240, 220, 255, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(100, 78, 125, 255), var148);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24513, 1391134705069824001L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21642, 41202233114301187L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24865, 2836341030793357041L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(90, 70, 115, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(200, 165, 250), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21642, 41202233114301187L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(48, 38, 60, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(65, 52, 80, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(90, 70, 115, 255), (short)var116, (char)var117, var118
         );
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(75, 60, 95, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(200, 165, 240, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(65, 52, 80, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(85, 68, 105, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(225, 200, 255));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(19025, 1502356367105953179L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5194, 565296248733848415L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20241, 7664535221192722465L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21642, 41202233114301187L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21642, 41202233114301187L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(200, 165, 250);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(48, 38, 60, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(90, 70, 115, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(38, 28, 48, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(38, 28, 48, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(225, 200, 255));
      float[] var151 = new float[]{0.18F, 0.13F, 0.22F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.24F, 0.18F, 0.3F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.28F, 0.21F, 0.34F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.15F, 0.1F, 0.19F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21642, 41202233114301187L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24865, 2836341030793357041L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(175, 140, 230));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(210, 175, 250, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(210, 175, 250, 38), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(210, 175, 250, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(210, 175, 250, 63), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(210, 175, 250, 102), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(200, 165, 250);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(185, 200, 255));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 150, 200), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(60, 48, 75, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(175, 140, 230, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 111579073875766L;
      long var5 = var1 ^ 94977349602181L;
      long var7 = var1 ^ 2285795734711L;
      long var9 = var1 ^ 10682679257499L;
      long var11 = var1 ^ 74124490741524L;
      long var13 = var1 ^ 13951981001676L;
      long var10001 = var1 ^ 119380098600260L;
      int var15 = (int)((var1 ^ 119380098600260L) >>> 48);
      int var16 = (int)((var1 ^ 119380098600260L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 66391733414997L;
      var10001 = var1 ^ 49946413998637L;
      int var20 = (int)((var1 ^ 49946413998637L) >>> 48);
      int var21 = (int)((var1 ^ 49946413998637L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 101666655081172L;
      long var25 = var1 ^ 73342258307335L;
      var10001 = var1 ^ 67304401016144L;
      int var27 = (int)((var1 ^ 67304401016144L) >>> 48);
      int var28 = (int)((var1 ^ 67304401016144L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 91365784826613L;
      var10001 = var1 ^ 131666642166946L;
      int var32 = (int)((var1 ^ 131666642166946L) >>> 32);
      int var33 = (int)((var1 ^ 131666642166946L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 102985785023064L;
      int var35 = (int)((var1 ^ 102985785023064L) >>> 32);
      int var36 = (int)((var1 ^ 102985785023064L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 125608390447430L;
      long var40 = var1 ^ 28746114992169L;
      var10001 = var1 ^ 100756662962563L;
      int var42 = (int)((var1 ^ 100756662962563L) >>> 32);
      int var43 = (int)((var1 ^ 100756662962563L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 26512578142520L;
      var10001 = var1 ^ 106665579033908L;
      int var47 = (int)((var1 ^ 106665579033908L) >>> 48);
      int var48 = (int)((var1 ^ 106665579033908L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 58199827081716L;
      var10001 = var1 ^ 38374670301517L;
      int var52 = (int)((var1 ^ 38374670301517L) >>> 48);
      int var53 = (int)((var1 ^ 38374670301517L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 86175234243396L;
      int var55 = (int)((var1 ^ 86175234243396L) >>> 32);
      int var56 = (int)((var1 ^ 86175234243396L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 81527221727084L;
      long var60 = var1 ^ 90310027167434L;
      long var62 = var1 ^ 97608969161184L;
      long var64 = var1 ^ 86791600475994L;
      long var66 = var1 ^ 81406819462603L;
      long var68 = var1 ^ 66729800500087L;
      var10001 = var1 ^ 21551449702205L;
      int var70 = (int)((var1 ^ 21551449702205L) >>> 48);
      int var71 = (int)((var1 ^ 21551449702205L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 119877990461487L;
      long var75 = var1 ^ 38150123691443L;
      var10001 = var1 ^ 14642541749000L;
      int var77 = (int)((var1 ^ 14642541749000L) >>> 48);
      int var78 = (int)((var1 ^ 14642541749000L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 18504739221408L;
      int var82 = (int)((var1 ^ 65929445177234L) >>> 48);
      long var83 = (var1 ^ 65929445177234L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 129029298911358L) >>> 48);
      long var86 = (var1 ^ 129029298911358L) << 16 >>> 16;
      var10001 = var1 ^ 65830562362277L;
      int var88 = (int)((var1 ^ 65830562362277L) >>> 48);
      int var89 = (int)((var1 ^ 65830562362277L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 116412981124916L;
      long var93 = var1 ^ 83225477627684L;
      var10001 = var1 ^ 33513364561988L;
      int var95 = (int)((var1 ^ 33513364561988L) >>> 32);
      int var96 = (int)((var1 ^ 33513364561988L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 11697137327363L;
      long var100 = var1 ^ 56830436748494L;
      var10001 = var1 ^ 129028434284999L;
      int var102 = (int)((var1 ^ 129028434284999L) >>> 32);
      int var103 = (int)((var1 ^ 129028434284999L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 22019941816071L;
      int var105 = (int)((var1 ^ 22019941816071L) >>> 32);
      int var106 = (int)((var1 ^ 22019941816071L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 133550347401596L;
      long var110 = var1 ^ 45571400574639L;
      long var112 = var1 ^ 18661636599005L;
      long var114 = var1 ^ 42794592843271L;
      var10001 = var1 ^ 6281254835326L;
      int var116 = (int)((var1 ^ 6281254835326L) >>> 48);
      int var117 = (int)((var1 ^ 6281254835326L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 121492872091493L;
      var10001 = var1 ^ 32834344773894L;
      int var121 = (int)((var1 ^ 32834344773894L) >>> 32);
      int var122 = (int)((var1 ^ 32834344773894L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 79418794695122L;
      long var126 = var1 ^ 1320676068968L;
      long var128 = var1 ^ 125455065029540L;
      long var130 = var1 ^ 69082416694251L;
      long var132 = var1 ^ 57604528438689L;
      long var134 = var1 ^ 93227425843588L;
      long var136 = var1 ^ 63116382885854L;
      long var138 = var1 ^ 13487097389471L;
      var10001 = var1 ^ 40753838133653L;
      int var140 = (int)((var1 ^ 40753838133653L) >>> 48);
      int var141 = (int)((var1 ^ 40753838133653L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 81406383025463L;
      long var145 = (var1 ^ 35861024396667L) >>> 32;
      int var147 = (int)((var1 ^ 35861024396667L) << 32 >>> 32);
      long var148 = var1 ^ 68770612829185L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(255, 220, 215, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(240, 195, 185, 150), var25);
      ThemeColors.textPlaceholder = new Color(200, 150, 140);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12889, 3666745776006111308L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12595, 3982098949015970777L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24864, 2551741519459087144L ^ var1))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(363, 4445439887115424711L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8234, 320481265989333559L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11531, 705904080684367671L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20821, 6741657680656909263L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(255, 140, 120), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(35, 15, 12, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(70, 30, 25, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(220, 80, 60, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 110, 85, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(20, 5, 0, 100), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(45, 20, 18, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(220, 80, 60, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(100, 50, 45, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(255, 200, 185, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(80, 35, 30, 255), var148);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4200, 8959097706243785460L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24213, 2658877858782104767L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31305, 8274633287495837858L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(70, 30, 25, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(255, 110, 85), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24213, 2658877858782104767L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(35, 15, 12, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(48, 22, 18, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(70, 30, 25, 255), (short)var116, (char)var117, var118);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(58, 26, 22, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(230, 100, 80, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(48, 22, 18, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(68, 32, 26, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(255, 140, 120));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4008, 7039146930117745950L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5980, 1999503486801282412L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8784, 2717420088873758814L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24213, 2658877858782104767L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24213, 2658877858782104767L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 110, 85);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(35, 15, 12, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(70, 30, 25, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(25, 10, 8, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(25, 10, 8, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(255, 140, 120));
      float[] var151 = new float[]{0.1F, 0.04F, 0.03F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.14F, 0.06F, 0.05F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.18F, 0.08F, 0.07F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.08F, 0.02F, 0.02F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24213, 2658877858782104767L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31305, 8274633287495837858L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(220, 80, 60));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 130, 100, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(255, 130, 100, 38), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(255, 130, 100, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(255, 130, 100, 63), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(255, 130, 100, 102), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(255, 110, 85);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(255, 150, 100));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 80, 50), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(45, 20, 18, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(220, 80, 60, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 83965259087228L;
      long var5 = var1 ^ 139943109179855L;
      long var7 = var1 ^ 47496372553469L;
      long var9 = var1 ^ 35811054427089L;
      long var11 = var1 ^ 116878333732190L;
      long var13 = var1 ^ 41329845332358L;
      long var10001 = var1 ^ 76647722008334L;
      int var15 = (int)((var1 ^ 76647722008334L) >>> 48);
      int var16 = (int)((var1 ^ 76647722008334L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 23384751562271L;
      var10001 = var1 ^ 4722956390503L;
      int var20 = (int)((var1 ^ 4722956390503L) >>> 48);
      int var21 = (int)((var1 ^ 4722956390503L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 128993785045150L;
      long var25 = var1 ^ 118279022580557L;
      var10001 = var1 ^ 22059732887322L;
      int var27 = (int)((var1 ^ 22059732887322L) >>> 48);
      int var28 = (int)((var1 ^ 22059732887322L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 134408472805567L;
      var10001 = var1 ^ 104344872523496L;
      int var32 = (int)((var1 ^ 104344872523496L) >>> 32);
      int var33 = (int)((var1 ^ 104344872523496L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 128147181987858L;
      int var35 = (int)((var1 ^ 128147181987858L) >>> 32);
      int var36 = (int)((var1 ^ 128147181987858L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 100175064245004L;
      long var40 = var1 ^ 56085051996771L;
      var10001 = var1 ^ 125918064032713L;
      int var42 = (int)((var1 ^ 125918064032713L) >>> 32);
      int var43 = (int)((var1 ^ 125918064032713L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 54126665634674L;
      var10001 = var1 ^ 79326629480318L;
      int var47 = (int)((var1 ^ 79326629480318L) >>> 48);
      int var48 = (int)((var1 ^ 79326629480318L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 32745306987454L;
      var10001 = var1 ^ 12920955570951L;
      int var52 = (int)((var1 ^ 12920955570951L) >>> 48);
      int var53 = (int)((var1 ^ 12920955570951L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 113552834251022L;
      int var55 = (int)((var1 ^ 113552834251022L) >>> 32);
      int var56 = (int)((var1 ^ 113552834251022L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 108854360136998L;
      long var60 = var1 ^ 135258611004544L;
      long var62 = var1 ^ 125210972912554L;
      long var64 = var1 ^ 114113370193168L;
      long var66 = var1 ^ 109043463921537L;
      long var68 = var1 ^ 23734365647165L;
      var10001 = var1 ^ 64594141777271L;
      int var70 = (int)((var1 ^ 64594141777271L) >>> 48);
      int var71 = (int)((var1 ^ 64594141777271L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 74912507708005L;
      long var75 = var1 ^ 12731037183993L;
      var10001 = var1 ^ 40095987994946L;
      int var77 = (int)((var1 ^ 40095987994946L) >>> 48);
      int var78 = (int)((var1 ^ 40095987994946L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 63715035094506L;
      int var82 = (int)((var1 ^ 20688006546904L) >>> 48);
      long var83 = (var1 ^ 20688006546904L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 101701904632372L) >>> 48);
      long var86 = (var1 ^ 101701904632372L) << 16 >>> 16;
      var10001 = var1 ^ 20864802750959L;
      int var88 = (int)((var1 ^ 20864802750959L) >>> 48);
      int var89 = (int)((var1 ^ 20864802750959L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 71219852602750L;
      long var93 = var1 ^ 108404327009646L;
      var10001 = var1 ^ 60869758177806L;
      int var95 = (int)((var1 ^ 60869758177806L) >>> 32);
      int var96 = (int)((var1 ^ 60869758177806L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 39057825984329L;
      long var100 = var1 ^ 29177686154884L;
      var10001 = var1 ^ 101702369616781L;
      int var102 = (int)((var1 ^ 101702369616781L) >>> 32);
      int var103 = (int)((var1 ^ 101702369616781L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 67208767055181L;
      int var105 = (int)((var1 ^ 67208767055181L) >>> 32);
      int var106 = (int)((var1 ^ 67208767055181L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 88305423403830L;
      long var110 = var1 ^ 364053288165L;
      long var112 = var1 ^ 63632764870295L;
      long var114 = var1 ^ 17374432576589L;
      var10001 = var1 ^ 49000738088500L;
      int var116 = (int)((var1 ^ 49000738088500L) >>> 48);
      int var117 = (int)((var1 ^ 49000738088500L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 78451522086191L;
      var10001 = var1 ^ 58250478492492L;
      int var121 = (int)((var1 ^ 58250478492492L) >>> 32);
      int var122 = (int)((var1 ^ 58250478492492L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 106779487447960L;
      long var126 = var1 ^ 44074250632226L;
      long var128 = var1 ^ 100327767861742L;
      long var130 = var1 ^ 26328829571489L;
      long var132 = var1 ^ 32172275961835L;
      long var134 = var1 ^ 138455182556110L;
      long var136 = var1 ^ 17874680030612L;
      long var138 = var1 ^ 41105484075989L;
      var10001 = var1 ^ 13426443903967L;
      int var140 = (int)((var1 ^ 13426443903967L) >>> 48);
      int var141 = (int)((var1 ^ 13426443903967L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 109054838579069L;
      long var145 = (var1 ^ 10699367393073L) >>> 32;
      int var147 = (int)((var1 ^ 10699367393073L) << 32 >>> 32);
      long var148 = var1 ^ 26033131761227L;
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6796, 6749927539373636185L ^ var1));
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var35, var36, var150, var37);
      ThemeColors.INSTANCE
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            var50, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6056, 4941074530161227629L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18151, 9133574795137328718L ^ var1)), var25
         );
      ThemeColors.textPlaceholder = new Color(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23426, 4713331757573585769L ^ var1)
      );
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23477, 4018351796306918371L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3644, 4053335206918352463L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5260, 6723314375172486382L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26623, 6287214763975608250L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12067, 3931576903654428492L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(28462, 449134753730760636L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(7757, 6876828389722128102L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(31116, 1526599095959853344L ^ var1)), var130
         );
      ThemeColors.INSTANCE
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
            var64, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25748, 2196597742551368953L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1)),
            var95,
            (char)var96,
            (char)var97
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21300, 6039528483927962574L ^ var1));
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1));
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10061, 4323643576563156867L ^ var1)), var134
         );
      ThemeColors.INSTANCE
         .llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(
            var132, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1))
         );
      ThemeColors.INSTANCE
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(
            var3, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(
            var114, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1548, 113537217292461672L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(139, 7793408903728947419L ^ var1)), var23
         );
      ThemeColors.INSTANCE
         .lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1)), var148
         );
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2259, 2433096272650987524L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1548, 113537217292461672L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1));
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE
         .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1)), var119
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE
         .IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25748, 2196597742551368953L ^ var1)), var143
         );
      ThemeColors.INSTANCE
         .IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1)), var91
         );
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1)),
            (short)var116,
            (char)var117,
            var118
         );
      ThemeColors.INSTANCE
         .lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1)), var13
         );
      ThemeColors.INSTANCE
         .IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(
            var7, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1)), var62
         );
      ThemeColors.INSTANCE
         .lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1)), var80
         );
      ThemeColors.INSTANCE
         .IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(
            var58, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(139, 7793408903728947419L ^ var1))
         );
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25748, 2196597742551368953L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12330, 1397156177956556981L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1));
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE
         .lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25748, 2196597742551368953L ^ var1)), var5
         );
      ThemeColors.INSTANCE
         .llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(
            var73, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3354, 4877122433362685322L ^ var1));
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3354, 4877122433362685322L ^ var1)),
            var102,
            var103,
            (byte)var104
         );
      ThemeColors.INSTANCE
         .IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(
            var60, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(139, 7793408903728947419L ^ var1))
         );
      float[] var151 = new float[]{0.19F, 0.2F, 0.27F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.26F, 0.27F, 0.35F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.28F, 0.29F, 0.37F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.14F, 0.15F, 0.2F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25748, 2196597742551368953L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(
            var30, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll(
            (short)var15,
            var16,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.1F),
            (short)var17
         );
      ThemeColors.INSTANCE
         .lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.15F),
            var128
         );
      ThemeColors.INSTANCE
         .lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(
            var136,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.2F)
         );
      ThemeColors.INSTANCE
         .lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F),
            var100
         );
      ThemeColors.INSTANCE
         .IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F),
            var68
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1));
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE
         .IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(
            var38, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18279, 6286455257859073801L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14352, 5279033561935993077L ^ var1)), var66
         );
      ThemeColors.INSTANCE
         .IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(
            var110, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612739932799805803L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039810195373048532L ^ var1)), var124
         );
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 54877013707298L;
      long var5 = var1 ^ 3245533023889L;
      long var7 = var1 ^ 95134598459811L;
      long var9 = var1 ^ 102414748609679L;
      long var11 = var1 ^ 26355933123072L;
      long var13 = var1 ^ 96905084772056L;
      long var10001 = var1 ^ 61578349529168L;
      int var15 = (int)((var1 ^ 61578349529168L) >>> 48);
      int var16 = (int)((var1 ^ 61578349529168L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 115380208478529L;
      var10001 = var1 ^ 134136219772729L;
      int var20 = (int)((var1 ^ 134136219772729L) >>> 48);
      int var21 = (int)((var1 ^ 134136219772729L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 9780028774336L;
      long var25 = var1 ^ 24353953047571L;
      var10001 = var1 ^ 116155462357060L;
      int var27 = (int)((var1 ^ 116155462357060L) >>> 48);
      int var28 = (int)((var1 ^ 116155462357060L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 8292690474977L;
      var10001 = var1 ^ 38835305570742L;
      int var32 = (int)((var1 ^ 38835305570742L) >>> 32);
      int var33 = (int)((var1 ^ 38835305570742L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 10137009561420L;
      int var35 = (int)((var1 ^ 10137009561420L) >>> 32);
      int var36 = (int)((var1 ^ 10137009561420L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 42534949016658L;
      long var40 = var1 ^ 86547651202365L;
      var10001 = var1 ^ 16704048614551L;
      int var42 = (int)((var1 ^ 16704048614551L) >>> 32);
      int var43 = (int)((var1 ^ 16704048614551L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 84176983680044L;
      var10001 = var1 ^ 58897021415456L;
      int var47 = (int)((var1 ^ 58897021415456L) >>> 48);
      int var48 = (int)((var1 ^ 58897021415456L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 106088913202400L;
      var10001 = var1 ^ 130243934288985L;
      int var52 = (int)((var1 ^ 130243934288985L) >>> 48);
      int var53 = (int)((var1 ^ 130243934288985L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 29627619819088L;
      int var55 = (int)((var1 ^ 29627619819088L) >>> 32);
      int var56 = (int)((var1 ^ 29627619819088L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 33758492207736L;
      long var60 = var1 ^ 7357193929694L;
      long var62 = var1 ^ 13556260506868L;
      long var64 = var1 ^ 29127218072142L;
      long var66 = var1 ^ 33638376204511L;
      long var68 = var1 ^ 114498291009123L;
      var10001 = var1 ^ 78116285872681L;
      int var70 = (int)((var1 ^ 78116285872681L) >>> 48);
      int var71 = (int)((var1 ^ 78116285872681L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 63313437340987L;
      long var75 = var1 ^ 129882217158823L;
      var10001 = var1 ^ 98694867674652L;
      int var77 = (int)((var1 ^ 98694867674652L) >>> 48);
      int var78 = (int)((var1 ^ 98694867674652L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 75069377276596L;
      int var82 = (int)((var1 ^ 122477146567302L) >>> 48);
      long var83 = (var1 ^ 122477146567302L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 37159830453610L) >>> 48);
      long var86 = (var1 ^ 37159830453610L) << 16 >>> 16;
      var10001 = var1 ^ 122377924015793L;
      int var88 = (int)((var1 ^ 122377924015793L) >>> 48);
      int var89 = (int)((var1 ^ 122377924015793L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 67562144242208L;
      long var93 = var1 ^ 34237247863344L;
      var10001 = var1 ^ 82364517066064L;
      int var95 = (int)((var1 ^ 82364517066064L) >>> 32);
      int var96 = (int)((var1 ^ 82364517066064L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 103566564890647L;
      long var100 = var1 ^ 113515281394138L;
      var10001 = var1 ^ 37159218533587L;
      int var102 = (int)((var1 ^ 37159218533587L) >>> 32);
      int var103 = (int)((var1 ^ 37159218533587L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 71008177869331L;
      int var105 = (int)((var1 ^ 71008177869331L) >>> 32);
      int var106 = (int)((var1 ^ 71008177869331L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 50459808939112L;
      long var110 = var1 ^ 138402651186107L;
      long var112 = var1 ^ 75226549381577L;
      long var114 = var1 ^ 125868034339603L;
      var10001 = var1 ^ 89217141969258L;
      int var116 = (int)((var1 ^ 89217141969258L) >>> 48);
      int var117 = (int)((var1 ^ 89217141969258L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 64790798226033L;
      var10001 = var1 ^ 80603056466962L;
      int var121 = (int)((var1 ^ 80603056466962L) >>> 32);
      int var122 = (int)((var1 ^ 80603056466962L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 31512895642822L;
      long var126 = var1 ^ 94151950797692L;
      long var128 = var1 ^ 42381721116336L;
      long var130 = var1 ^ 116851213387519L;
      long var132 = var1 ^ 106609989449909L;
      long var134 = var1 ^ 378903022736L;
      long var136 = var1 ^ 120900752790218L;
      long var138 = var1 ^ 97677192635531L;
      var10001 = var1 ^ 124806212293761L;
      int var140 = (int)((var1 ^ 124806212293761L) >>> 48);
      int var141 = (int)((var1 ^ 124806212293761L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 33655052462115L;
      long var145 = (var1 ^ 127609927520367L) >>> 32;
      int var147 = (int)((var1 ^ 127609927520367L) << 32 >>> 32);
      long var148 = var1 ^ 116659566827797L;
      ThemeColors.INSTANCE
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var35, var36, Color.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, var37
         );
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var50, new Color(230, 255, 250, 200));
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(new Color(210, 245, 240, 150), var25);
      ThemeColors.textPlaceholder = new Color(180, 220, 215);
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26999, 8371540621271924310L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8049, 6016043297950795879L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(25541, 721615326923814102L ^ var1))
         );
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5000, 8839781368444486813L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12008, 2517290813983078698L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23410, 1411196463042874609L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(871, 7781110042551620727L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(new Color(180, 255, 245), var130);
      ThemeColors.INSTANCE.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var64, new Color(30, 52, 50, 255));
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(new Color(55, 95, 92, 255), var95, (char)var96, (char)var97);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(120, 220, 205, 255);
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 240, 225, 255);
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(new Color(10, 25, 24, 100), var134);
      ThemeColors.INSTANCE.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(var132, new Color(40, 68, 65, 255));
      ThemeColors.INSTANCE.lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3, new Color(120, 220, 205, 255));
      ThemeColors.INSTANCE.IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var114, new Color(95, 145, 140, 255));
      ThemeColors.INSTANCE.IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(new Color(220, 255, 248, 255), var23);
      ThemeColors.INSTANCE.lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(new Color(65, 105, 102, 255), var148);
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(23913, 7683856972938332746L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18202, 3144967626671706268L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9233, 9037005521756763111L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(55, 95, 92, 255);
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(new Color(150, 240, 225), var119);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18202, 3144967626671706268L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(new Color(30, 52, 50, 255), var143);
      ThemeColors.INSTANCE.IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(new Color(42, 68, 66, 255), var91);
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(new Color(55, 95, 92, 255), (short)var116, (char)var117, var118);
      ThemeColors.INSTANCE.lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(new Color(48, 80, 78, 255), var13);
      ThemeColors.INSTANCE.IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(var7, new Color(150, 230, 215, 255));
      ThemeColors.INSTANCE.IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(new Color(42, 68, 66, 255), var62);
      ThemeColors.INSTANCE.lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(new Color(58, 90, 88, 255), var80);
      ThemeColors.INSTANCE.IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(var58, new Color(180, 255, 245));
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12201, 4947653792580909164L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29646, 2816584815335597130L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11430, 6758883906316745475L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18202, 3144967626671706268L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18202, 3144967626671706268L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 240, 225);
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(new Color(30, 52, 50, 255), var5);
      ThemeColors.INSTANCE.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(var73, new Color(55, 95, 92, 255));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(22, 38, 37, 255);
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(new Color(22, 38, 37, 255), var102, var103, (byte)var104);
      ThemeColors.INSTANCE.IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(var60, new Color(180, 255, 245));
      float[] var151 = new float[]{0.18F, 0.32F, 0.28F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.22F, 0.36F, 0.32F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.26F, 0.4F, 0.36F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.16F, 0.24F, 0.22F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18202, 3144967626671706268L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9233, 9037005521756763111L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(var30, new Color(120, 220, 205));
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 240, 225, 25);
      var10000.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll((short)var15, var16, var150, (short)var17);
      ThemeColors.INSTANCE.lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(new Color(150, 240, 225, 38), var128);
      ThemeColors.INSTANCE.lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(var136, new Color(150, 240, 225, 51));
      ThemeColors.INSTANCE.lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(new Color(150, 240, 225, 63), var100);
      ThemeColors.INSTANCE.IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(new Color(150, 240, 225, 102), var68);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(150, 240, 225);
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE.IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(var38, new Color(120, 250, 235));
      ThemeColors.INSTANCE.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(new Color(255, 130, 160), var66);
      ThemeColors.INSTANCE.IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(var110, new Color(40, 68, 65, 255));
      ThemeColors.INSTANCE.IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(new Color(120, 220, 205, 255), var124);
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   private final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var1;
      long var3 = var1 ^ 5859280803313L;
      long var5 = var1 ^ 59711259316546L;
      long var7 = var1 ^ 108005731544688L;
      long var9 = var1 ^ 116103670182748L;
      long var11 = var1 ^ 38780546928083L;
      long var13 = var1 ^ 119431457325323L;
      long var10001 = var1 ^ 14003322951555L;
      int var15 = (int)((var1 ^ 14003322951555L) >>> 48);
      int var16 = (int)((var1 ^ 14003322951555L) << 16 >>> 32);
      int var17 = (int)(var10001 << 48 >>> 48);
      long var18 = var1 ^ 101486736864914L;
      var10001 = var1 ^ 84946685950186L;
      int var20 = (int)((var1 ^ 84946685950186L) >>> 48);
      int var21 = (int)((var1 ^ 84946685950186L) << 16 >>> 32);
      int var22 = (int)(var10001 << 48 >>> 48);
      long var23 = var1 ^ 66349251774483L;
      long var25 = var1 ^ 38050927819712L;
      var10001 = var1 ^ 102365070086039L;
      int var27 = (int)((var1 ^ 102365070086039L) >>> 48);
      int var28 = (int)((var1 ^ 102365070086039L) << 16 >>> 32);
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var1 ^ 56315584964658L;
      var10001 = var1 ^ 26316206685797L;
      int var32 = (int)((var1 ^ 26316206685797L) >>> 32);
      int var33 = (int)((var1 ^ 26316206685797L) << 32 >>> 56);
      int var34 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 67641447006367L;
      int var35 = (int)((var1 ^ 67641447006367L) >>> 32);
      int var36 = (int)((var1 ^ 67641447006367L) << 32 >>> 48);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var1 ^ 19869663202177L;
      long var40 = var1 ^ 134190996706030L;
      var10001 = var1 ^ 65472520459076L;
      int var42 = (int)((var1 ^ 65472520459076L) >>> 32);
      int var43 = (int)((var1 ^ 65472520459076L) << 32 >>> 48);
      int var44 = (int)(var10001 << 48 >>> 48);
      long var45 = var1 ^ 132163920247807L;
      var10001 = var1 ^ 1289509105651L;
      int var47 = (int)((var1 ^ 1289509105651L) >>> 48);
      int var48 = (int)((var1 ^ 1289509105651L) << 16 >>> 32);
      int var49 = (int)(var10001 << 48 >>> 48);
      long var50 = var1 ^ 93190242513715L;
      var10001 = var1 ^ 73435147314058L;
      int var52 = (int)((var1 ^ 73435147314058L) >>> 48);
      int var53 = (int)((var1 ^ 73435147314058L) << 16 >>> 32);
      int var54 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 50916894990723L;
      int var55 = (int)((var1 ^ 50916894990723L) >>> 32);
      int var56 = (int)((var1 ^ 50916894990723L) << 32 >>> 48);
      int var57 = (int)(var10001 << 48 >>> 48);
      long var58 = var1 ^ 46219055265195L;
      long var60 = var1 ^ 55034878303245L;
      long var62 = var1 ^ 62575067190055L;
      long var64 = var1 ^ 51404346348957L;
      long var66 = var1 ^ 46339472209676L;
      long var68 = var1 ^ 101840138525104L;
      var10001 = var1 ^ 127229443515898L;
      int var70 = (int)((var1 ^ 127229443515898L) >>> 48);
      int var71 = (int)((var1 ^ 127229443515898L) << 16 >>> 32);
      int var72 = (int)(var10001 << 48 >>> 48);
      long var73 = var1 ^ 14467500894952L;
      long var75 = var1 ^ 73245229041524L;
      var10001 = var1 ^ 120388003969487L;
      int var77 = (int)((var1 ^ 120388003969487L) >>> 48);
      int var78 = (int)((var1 ^ 120388003969487L) << 16 >>> 32);
      int var79 = (int)(var10001 << 48 >>> 48);
      long var80 = var1 ^ 124224532493671L;
      int var82 = (int)((var1 ^ 100989082348885L) >>> 48);
      long var83 = (var1 ^ 100989082348885L) << 16 >>> 16;
      int var85 = (int)((var1 ^ 23599885787833L) >>> 48);
      long var86 = (var1 ^ 23599885787833L) << 16 >>> 16;
      var10001 = var1 ^ 101087960967522L;
      int var88 = (int)((var1 ^ 101087960967522L) >>> 48);
      int var89 = (int)((var1 ^ 101087960967522L) << 16 >>> 32);
      int var90 = (int)(var10001 << 48 >>> 48);
      long var91 = var1 ^ 10787836577267L;
      long var93 = var1 ^ 47958918587875L;
      var10001 = var1 ^ 138907018164867L;
      int var95 = (int)((var1 ^ 138907018164867L) >>> 32);
      int var96 = (int)((var1 ^ 138907018164867L) << 32 >>> 48);
      int var97 = (int)(var10001 << 48 >>> 48);
      long var98 = var1 ^ 117150819731396L;
      long var100 = var1 ^ 91813024593417L;
      var10001 = var1 ^ 23600756427520L;
      int var102 = (int)((var1 ^ 23600756427520L) >>> 32);
      int var103 = (int)((var1 ^ 23600756427520L) << 32 >>> 40);
      int var104 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 127723024846272L;
      int var105 = (int)((var1 ^ 127723024846272L) >>> 32);
      int var106 = (int)((var1 ^ 127723024846272L) << 32 >>> 48);
      int var107 = (int)(var10001 << 48 >>> 48);
      long var108 = var1 ^ 27872765797307L;
      long var110 = var1 ^ 80665197247592L;
      long var112 = var1 ^ 124065489729050L;
      long var114 = var1 ^ 77811314912448L;
      var10001 = var1 ^ 111709024898745L;
      int var116 = (int)((var1 ^ 111709024898745L) >>> 48);
      int var117 = (int)((var1 ^ 111709024898745L) << 16 >>> 48);
      int var118 = (int)(var10001 << 32 >>> 32);
      long var119 = var1 ^ 15738843827618L;
      var10001 = var1 ^ 138486526849985L;
      int var121 = (int)((var1 ^ 138486526849985L) >>> 32);
      int var122 = (int)((var1 ^ 138486526849985L) << 32 >>> 48);
      int var123 = (int)(var10001 << 48 >>> 48);
      long var124 = var1 ^ 44066872099605L;
      long var126 = var1 ^ 106773979878575L;
      long var128 = var1 ^ 20027296170339L;
      long var130 = var1 ^ 104435344841004L;
      long var132 = var1 ^ 92681740855142L;
      long var134 = var1 ^ 58158367118147L;
      long var136 = var1 ^ 98167162735897L;
      long var138 = var1 ^ 119207000800088L;
      var10001 = var1 ^ 76139053861714L;
      int var140 = (int)((var1 ^ 76139053861714L) >>> 48);
      int var141 = (int)((var1 ^ 76139053861714L) << 16 >>> 48);
      int var142 = (int)(var10001 << 32 >>> 32);
      long var143 = var1 ^ 46346350573552L;
      long var145 = (var1 ^ 71136282349500L) >>> 32;
      int var147 = (int)((var1 ^ 71136282349500L) << 32 >>> 32);
      long var148 = var1 ^ 104062103783110L;
      ThemeColors var10000 = ThemeColors.INSTANCE;
      Color var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3278, 5326878386769741030L ^ var1));
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var35, var36, var150, var37);
      ThemeColors.INSTANCE
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            var50, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6204, 4470312960851661027L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27878, 1604263709361742896L ^ var1)), var25
         );
      ThemeColors.textPlaceholder = new Color(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(7829, 2389082456209741510L ^ var1)
      );
      ThemeColors.INSTANCE
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(28237, 1319238536603182721L ^ var1)), var138
         );
      ThemeColors.INSTANCE
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15544, 4139787715905582274L ^ var1)),
            (char)var27,
            var28,
            var29
         );
      ThemeColors.INSTANCE
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            var40, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30958, 7039168687929733276L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1));
      var10000.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var145, var147, var150);
      ThemeColors.INSTANCE
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            var11, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(28339, 4087427037141673686L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
            var18, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15697, 5456333887075120487L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10111, 2499502814196363116L ^ var1));
      var10000.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll((short)var77, var78, (char)var79, var150);
      ThemeColors.INSTANCE
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1)), var130
         );
      ThemeColors.INSTANCE
         .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
            var64, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17188, 4261435262738271005L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1)),
            var95,
            (char)var96,
            (char)var97
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14096, 8420923024623140829L ^ var1));
      var10000.IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII((short)var70, var150, var71, (short)var72);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1));
      var10000.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var105, var106, (char)var107, var150);
      ThemeColors.INSTANCE
         .IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10111, 2499502814196363116L ^ var1)), var134
         );
      ThemeColors.INSTANCE
         .llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(
            var132, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1))
         );
      ThemeColors.INSTANCE
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(
            var3, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(
            var114, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29260, 8118762522285521572L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9710, 5294221182570753479L ^ var1)), var23
         );
      ThemeColors.INSTANCE
         .lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1)), var148
         );
      ThemeColors.INSTANCE
         .lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
            var126, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2013, 8123154153231273891L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(
            var108, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1))
         );
      ThemeColors.INSTANCE
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(
            var98, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29260, 8118762522285521572L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1));
      var10000.IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl((short)var52, var53, var150, var54);
      ThemeColors.INSTANCE
         .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1)), var119
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1));
      var10000.lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll((char)var20, var150, var21, (short)var22);
      ThemeColors.INSTANCE
         .IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17188, 4261435262738271005L ^ var1)), var143
         );
      ThemeColors.INSTANCE
         .IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1)), var91
         );
      ThemeColors.INSTANCE
         .lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1)),
            (short)var116,
            (char)var117,
            var118
         );
      ThemeColors.INSTANCE
         .lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1)), var13
         );
      ThemeColors.INSTANCE
         .IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(
            var7, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1)), var62
         );
      ThemeColors.INSTANCE
         .lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1)), var80
         );
      ThemeColors.INSTANCE
         .IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(
            var58, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9710, 5294221182570753479L ^ var1))
         );
      ThemeColors.INSTANCE
         .lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(
            var93, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1));
      var10000.llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII((char)var140, var150, (char)var141, var142);
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17188, 4261435262738271005L ^ var1));
      var10000.IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl((short)var88, var150, var89, (char)var90);
      ThemeColors.INSTANCE
         .IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1)), var9
         );
      ThemeColors.INSTANCE
         .IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(2568, 2519092148783268424L ^ var1)),
            var121,
            (char)var122,
            var123
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1));
      var10000.IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl((short)var82, var150, var83);
      ThemeColors.INSTANCE
         .lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17188, 4261435262738271005L ^ var1)), var5
         );
      ThemeColors.INSTANCE
         .llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(
            var73, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1))
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10111, 2499502814196363116L ^ var1));
      var10000.lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll((short)var85, var150, var86);
      ThemeColors.INSTANCE
         .lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10111, 2499502814196363116L ^ var1)),
            var102,
            var103,
            (byte)var104
         );
      ThemeColors.INSTANCE
         .IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(
            var60, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(9710, 5294221182570753479L ^ var1))
         );
      float[] var151 = new float[]{0.32F, 0.2F, 0.36F};
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var112, var151);
      var151 = new float[]{0.18F, 0.13F, 0.22F};
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var151, var55, var56, (short)var57);
      var151 = new float[]{0.12F, 0.1F, 0.16F};
      ThemeColors.INSTANCE.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var151, (char)var47, var48, (char)var49);
      var151 = new float[]{0.07F, 0.06F, 0.1F};
      ThemeColors.INSTANCE.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var75, var151);
      ThemeColors.INSTANCE
         .IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(
            var42,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17188, 4261435262738271005L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.8F),
            (short)var43,
            (short)var44
         );
      ThemeColors.INSTANCE
         .IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1), true)
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.9F),
            var45
         );
      ThemeColors.INSTANCE
         .IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(
            var30, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll(
            (short)var15,
            var16,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.1F),
            (short)var17
         );
      ThemeColors.INSTANCE
         .lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.15F),
            var128
         );
      ThemeColors.INSTANCE
         .lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI(
            var136,
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.2F)
         );
      ThemeColors.INSTANCE
         .lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.25F),
            var100
         );
      ThemeColors.INSTANCE
         .IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1))
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.4F),
            var68
         );
      var10000 = ThemeColors.INSTANCE;
      var150 = new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1));
      var10000.llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII(var32, (byte)var33, var150, var34);
      ThemeColors.INSTANCE
         .IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII(
            var38, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29972, 6882459020257901837L ^ var1))
         );
      ThemeColors.INSTANCE
         .IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(27504, 3208226484502831889L ^ var1)), var66
         );
      ThemeColors.INSTANCE
         .IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI(
            var110, new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29862, 607397628813950078L ^ var1))
         );
      ThemeColors.INSTANCE
         .IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(
            new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3772, 8131324857603049141L ^ var1)), var124
         );
      ThemeColors.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(12.0F);
      ThemeColors.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(8.0F);
   }

   static {
      long var11 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 16496992562104L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[191];
      int var3 = 0;
      String var4 = "\u009b5\n½\u008dç\u0092*\u001e\b\n\u0080\u000b\n\u0007\u001fY\u0019B©\u0088+{:òÓYû\u0090\u0019V\u0099\u0004\u0095\rÁ\u0000ÉúJ9c8\u008f\u008f\f\rXµ¤·\u000fè³:î«\u0006\u0019.êþÂ¿ýÁ®÷m\u0007Åõ¯³1\u007f¦MC\u008d4è\u009fÉBkt×¡z\u007fÓ\"\u0019\u008dD¸»Êl\u0088êÅB#°¿Ñ\u001d\u000fRdT\u001eéÚ._1&z¢L\u0017ªHÁÝcÍÀ¥5Ú0|½\u007f\fC²$va\tAÕÇiòx`\tÅ?\u0099_Q\t ¡¹9Õ\u0004Ë\u0006b\th\u008a$½pÚu»Ûå®\u0087bi\u001e\\î\u007f© Vé$\u0018t;\u008aø\u009fCü!o\u000eáª\u0001»\u0092~\u0019%\u0088´\u0092%\u000fwq\u000fY¸A\u0010´\u0017\u008dëhâç\u0004j»Ò\u0091»\u0003ñ\u000bõìÑ¤ïb¾_ÕßSB]\u008b®T`»\u008fs\u0010{©ß\u00adjÁ-n\u008fdæ\b\u0005a\u0083\n\u0004\u0002GÝµu÷j\u001dÌ¢ALd¥î°¯\u008cø\u000f\u009c/\u001d¿¶Z£\u0018\u009cKðn@ª\u0016û.\u0016\u0006]9',\u0089½Gòç\u0083\\ZÅ»²SÈK©õøÝ\tó\u0092\u00821@y3\u009d\u000f:Õ¼(ñïAAZºÌ8\u0007\u0006g*jÝ\u001a/ð[ÇÊã[\u000f\u0092iØúüæ\u009fxÇ'\u0006ÙÐFr£×À×iV\u0007?ùA¹ÿ\u008d' \u0005\u007fèØ¶W/\u0007\u000e4~Z\u001bBR\u0007Þ§b\u0092û(H~H\u007f¾\u0010tÄTµgD±¯ Mº¶\u0014óý\u0003#\u0084\u0004`\t\u000b\u009b%[\u008d\u0098«bRØGÆöÊ\u0093a\u0004Í \u008f7ðE\u0082\u0099hBó'\u0080¯w\u0093³ð\u0001ÉÏú\u0011I\u0011½Ô0éþ±R5!\u0085k\rµÔºà\u0004ò'û¶ÿò\u0084z|F\rvÐ\u0093ú\u0002*\u0018ÿqJý\u008bo\tñ\u0085ß$\u0005sZa\u008bÏO\u000bû¼ë5\u0087¨\u00adVc\u001câ\u001b\u00041 \u0011vnIÔÂT\u0083\u00adØóv\u0091*ÂVùÅ.\u0083Æ÷s]\u0092\u0018\u0081 '\u001eLÞ \u009aòª\u0089[Ç\u0087\u0082\u0018F\u0095®¯kE6#-\u001a´QëJÔ*À9Ü\u0083+ðÌÅÏ\b··Ý\r\u009c\u0097 k\u0016*KmÈ&¬\u0003'üËá\u000eÈ[ \rb£M\u0014\u0010I9`;\u0084\u0085õ_ ½:\\s\f\u00adUFÖ¤\u0013\u0097è\u0085ókkÛ\u0083\u008b~Z\u009e-¼ØáZÏ¹´UL¾«[\u0096\u0082]ê0â&MËIY >uá$nI\u000f1\u0082(`Ûºé%\u0099\bõ·8\u0093Ñ\u008føMû/\u008c\u007fÆ\u0015FÆvÉ\b2\u0083\u0011\u001b\u0011×z·k\fþÝi\tÕ\u0019¯ñ\u0015Õ\u001f\u009bá¯ø¬9a¤îÅ^_R\u0010_öF\u001d1\u0013æø>]ÿ$±%:3©fôD\u0004»èóÈî%+¡D5aÔnÌ°¿\t\u000b÷ F8q2æM%ËÉ·ù\u0090sÑÜ\u0089ÆÎtñS¡D-Æl\u008a\u000fv0\u00adæ\u001cÙ|\u0093\u001a\u001e4\\\u0016³#ç£\\z\u0084×Õ\u0080\"óX)sã\u0083;\u008biáuÏDz¸\u001d`0>\u0016\u0015\u008erh!á%/Ô\u001cüx2\u009a\u000eNTReÑZ\u0013\u0092\"w\u009d\u0015k\u009b\u008eymyÂ\u0099É>>tu_6\u009cj\n\r¯Ð\u0097\u00adZîßW\níU\u000e§\u00071\t\u0087¨\u008fPXEÆÓ\u0090\u001f\u000b\u008dx\\ï+\\Æ\u000bfàÀUýMÞ.5\u0015\u0094æg\u009e¢/\u0087Ú\u0004¡\u0002\rOß\u0082áåú\u008a\u0087û²\"b×I7¤TOoï\u0001\u0006\u008cL©Q¿\u001d·\u0090^å\u0091N[µF°c\u0094\u0005w¸\u0003V£\u0081ìB\u0081µ-Ek¬¥[<e7\u0014âðµ\u0000#`5Lj§\u0094_\u008bm\u0099àÂ6\n\u001a\u0080\u009b§(\u007fq!¥å\u00966NÛ\u0084\u0087nÝ,ñÕk:k\u008b\r\u0004\u008c|\u0080É6\n\u0093\u0001Zb\u0013kIQ\u0090î\t¯¡ù)¨L\u0094b(\u0091o\u0087eÒ@D¸é\u0080¬çì,\u0000-\u0084p2ø\u0083Øjª\\Èß¥\u0010ã\u0085¤ôÄ/t+\u0019|Q8¯\u008e*\u0085Í\u0082ó+\u009ajw?\"\u009c\u0088ÒÜ!Ì&û\u0099\u008c\u000eRzãÅ\u0094åÌoÞdp¢©=\u007f¹F;ñ(qÚ\u008dU\u0082\u008cñ±¯9úÎÔçâ\u000bkÉ\u0018+¹ï\u0010Íj\u009b@¥\u0000áð?\u0090\\Sñ}ì1¿\u0084w\u0019\u000bYÑüöÐA+MMïb·\u0092àVx\u0096.]Þû\u008bÛlFaì\u0095î9±¥Ô\u0096\u0012\u0014\u0091vï7Ã\u0013©¸\u0087ö\u0017á\u0089ÀÛ¸îja\u001eåC?!4\u008a\u0088´\u0091\u0096e\u0002bþ [\u0004|o\u009fÏÜéK\u0016u¸º\t'²`\u0014UÚ\u0015Qû\u0099ýÿAë«åi1¨tôçWÊ\u0087j|Å¦\u0084\u0010É·v)Ò>\u0004¶\u0088ó\u008aHeq]\u0014`\u0003ÍµcZ\u0019\u0014*\u0016ÓÂ\t¹è4´¥{ÝÏ\u009eA×ÞG~ätÄc\",g\u0081þ\u0087«\u0012\u0019M%\u008d³Úd÷7[±Ú¯g\u0001\u0007±¿R§GB\\da\u0010\u0010ü\u0013Wß=ìW²\u001d}:eýN@^¹^\u001b=B\f²±\u0085Å\u0098,í\u001e¹p0¦\u0081\u001a:Ã\u0014õ\u0083\u009dùµ\r";
      int var5 = "\u009b5\n½\u008dç\u0092*\u001e\b\n\u0080\u000b\n\u0007\u001fY\u0019B©\u0088+{:òÓYû\u0090\u0019V\u0099\u0004\u0095\rÁ\u0000ÉúJ9c8\u008f\u008f\f\rXµ¤·\u000fè³:î«\u0006\u0019.êþÂ¿ýÁ®÷m\u0007Åõ¯³1\u007f¦MC\u008d4è\u009fÉBkt×¡z\u007fÓ\"\u0019\u008dD¸»Êl\u0088êÅB#°¿Ñ\u001d\u000fRdT\u001eéÚ._1&z¢L\u0017ªHÁÝcÍÀ¥5Ú0|½\u007f\fC²$va\tAÕÇiòx`\tÅ?\u0099_Q\t ¡¹9Õ\u0004Ë\u0006b\th\u008a$½pÚu»Ûå®\u0087bi\u001e\\î\u007f© Vé$\u0018t;\u008aø\u009fCü!o\u000eáª\u0001»\u0092~\u0019%\u0088´\u0092%\u000fwq\u000fY¸A\u0010´\u0017\u008dëhâç\u0004j»Ò\u0091»\u0003ñ\u000bõìÑ¤ïb¾_ÕßSB]\u008b®T`»\u008fs\u0010{©ß\u00adjÁ-n\u008fdæ\b\u0005a\u0083\n\u0004\u0002GÝµu÷j\u001dÌ¢ALd¥î°¯\u008cø\u000f\u009c/\u001d¿¶Z£\u0018\u009cKðn@ª\u0016û.\u0016\u0006]9',\u0089½Gòç\u0083\\ZÅ»²SÈK©õøÝ\tó\u0092\u00821@y3\u009d\u000f:Õ¼(ñïAAZºÌ8\u0007\u0006g*jÝ\u001a/ð[ÇÊã[\u000f\u0092iØúüæ\u009fxÇ'\u0006ÙÐFr£×À×iV\u0007?ùA¹ÿ\u008d' \u0005\u007fèØ¶W/\u0007\u000e4~Z\u001bBR\u0007Þ§b\u0092û(H~H\u007f¾\u0010tÄTµgD±¯ Mº¶\u0014óý\u0003#\u0084\u0004`\t\u000b\u009b%[\u008d\u0098«bRØGÆöÊ\u0093a\u0004Í \u008f7ðE\u0082\u0099hBó'\u0080¯w\u0093³ð\u0001ÉÏú\u0011I\u0011½Ô0éþ±R5!\u0085k\rµÔºà\u0004ò'û¶ÿò\u0084z|F\rvÐ\u0093ú\u0002*\u0018ÿqJý\u008bo\tñ\u0085ß$\u0005sZa\u008bÏO\u000bû¼ë5\u0087¨\u00adVc\u001câ\u001b\u00041 \u0011vnIÔÂT\u0083\u00adØóv\u0091*ÂVùÅ.\u0083Æ÷s]\u0092\u0018\u0081 '\u001eLÞ \u009aòª\u0089[Ç\u0087\u0082\u0018F\u0095®¯kE6#-\u001a´QëJÔ*À9Ü\u0083+ðÌÅÏ\b··Ý\r\u009c\u0097 k\u0016*KmÈ&¬\u0003'üËá\u000eÈ[ \rb£M\u0014\u0010I9`;\u0084\u0085õ_ ½:\\s\f\u00adUFÖ¤\u0013\u0097è\u0085ókkÛ\u0083\u008b~Z\u009e-¼ØáZÏ¹´UL¾«[\u0096\u0082]ê0â&MËIY >uá$nI\u000f1\u0082(`Ûºé%\u0099\bõ·8\u0093Ñ\u008føMû/\u008c\u007fÆ\u0015FÆvÉ\b2\u0083\u0011\u001b\u0011×z·k\fþÝi\tÕ\u0019¯ñ\u0015Õ\u001f\u009bá¯ø¬9a¤îÅ^_R\u0010_öF\u001d1\u0013æø>]ÿ$±%:3©fôD\u0004»èóÈî%+¡D5aÔnÌ°¿\t\u000b÷ F8q2æM%ËÉ·ù\u0090sÑÜ\u0089ÆÎtñS¡D-Æl\u008a\u000fv0\u00adæ\u001cÙ|\u0093\u001a\u001e4\\\u0016³#ç£\\z\u0084×Õ\u0080\"óX)sã\u0083;\u008biáuÏDz¸\u001d`0>\u0016\u0015\u008erh!á%/Ô\u001cüx2\u009a\u000eNTReÑZ\u0013\u0092\"w\u009d\u0015k\u009b\u008eymyÂ\u0099É>>tu_6\u009cj\n\r¯Ð\u0097\u00adZîßW\níU\u000e§\u00071\t\u0087¨\u008fPXEÆÓ\u0090\u001f\u000b\u008dx\\ï+\\Æ\u000bfàÀUýMÞ.5\u0015\u0094æg\u009e¢/\u0087Ú\u0004¡\u0002\rOß\u0082áåú\u008a\u0087û²\"b×I7¤TOoï\u0001\u0006\u008cL©Q¿\u001d·\u0090^å\u0091N[µF°c\u0094\u0005w¸\u0003V£\u0081ìB\u0081µ-Ek¬¥[<e7\u0014âðµ\u0000#`5Lj§\u0094_\u008bm\u0099àÂ6\n\u001a\u0080\u009b§(\u007fq!¥å\u00966NÛ\u0084\u0087nÝ,ñÕk:k\u008b\r\u0004\u008c|\u0080É6\n\u0093\u0001Zb\u0013kIQ\u0090î\t¯¡ù)¨L\u0094b(\u0091o\u0087eÒ@D¸é\u0080¬çì,\u0000-\u0084p2ø\u0083Øjª\\Èß¥\u0010ã\u0085¤ôÄ/t+\u0019|Q8¯\u008e*\u0085Í\u0082ó+\u009ajw?\"\u009c\u0088ÒÜ!Ì&û\u0099\u008c\u000eRzãÅ\u0094åÌoÞdp¢©=\u007f¹F;ñ(qÚ\u008dU\u0082\u008cñ±¯9úÎÔçâ\u000bkÉ\u0018+¹ï\u0010Íj\u009b@¥\u0000áð?\u0090\\Sñ}ì1¿\u0084w\u0019\u000bYÑüöÐA+MMïb·\u0092àVx\u0096.]Þû\u008bÛlFaì\u0095î9±¥Ô\u0096\u0012\u0014\u0091vï7Ã\u0013©¸\u0087ö\u0017á\u0089ÀÛ¸îja\u001eåC?!4\u008a\u0088´\u0091\u0096e\u0002bþ [\u0004|o\u009fÏÜéK\u0016u¸º\t'²`\u0014UÚ\u0015Qû\u0099ýÿAë«åi1¨tôçWÊ\u0087j|Å¦\u0084\u0010É·v)Ò>\u0004¶\u0088ó\u008aHeq]\u0014`\u0003ÍµcZ\u0019\u0014*\u0016ÓÂ\t¹è4´¥{ÝÏ\u009eA×ÞG~ätÄc\",g\u0081þ\u0087«\u0012\u0019M%\u008d³Úd÷7[±Ú¯g\u0001\u0007±¿R§GB\\da\u0010\u0010ü\u0013Wß=ìW²\u001d}:eýN@^¹^\u001b=B\f²±\u0085Å\u0098,í\u001e¹p0¦\u0081\u001a:Ã\u0014õ\u0083\u009dùµ\r"
         .length();
      byte var2 = 0;

      label23:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var27 = var6;
         var10001 = var3++;
         long var30 = (var7[0] & 255L) << 56
            | (var7[1] & 255L) << 48
            | (var7[2] & 255L) << 40
            | (var7[3] & 255L) << 32
            | (var7[4] & 255L) << 24
            | (var7[5] & 255L) << 16
            | (var7[6] & 255L) << 8
            | var7[7] & 255L;
         byte var32 = -1;

         while (true) {
            long var8 = var30;
            byte[] var10 = var0.doFinal(
               new byte[]{
                  (byte)(var8 >>> 56),
                  (byte)(var8 >>> 48),
                  (byte)(var8 >>> 40),
                  (byte)(var8 >>> 32),
                  (byte)(var8 >>> 24),
                  (byte)(var8 >>> 16),
                  (byte)(var8 >>> 8),
                  (byte)var8
               }
            );
            long var34 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            switch (var32) {
               case 0:
                  var27[var10001] = var34;
                  if (var2 >= var5) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var6;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new Integer[191];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(
                        20289, var11 ^ 7287256480456011531L
                     );
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI();
                     Color[][] var13 = new Color[12][];
                     Color[] var14 = new Color[]{
                        new Color(220, 220, 220),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(32584, 5269588393459212219L ^ var11)
                        ),
                        new Color(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(996, 2449301267123413813L ^ var11)),
                        new Color(50, 50, 50, 255)
                     };
                     var13[0] = var14;
                     var14 = new Color[]{
                        new Color(100, 130, 210),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8259, 5740099860687782023L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(20271, 7373186219502956464L ^ var11)
                        ),
                        new Color(20, 25, 40, 255)
                     };
                     var13[1] = var14;
                     var14 = new Color[]{
                        new Color(138, 171, 219),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15495, 648205515371420791L ^ var11)
                        ),
                        new Color(45, 45, 45, 255),
                        new Color(50, 50, 50, 255)
                     };
                     var13[2] = var14;
                     var14 = new Color[]{
                        new Color(255, 160, 210),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24766, 3516938200985255950L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(14245, 4267638366969960393L ^ var11)
                        ),
                        new Color(68, 40, 58, 255)
                     };
                     var13[3] = var14;
                     var14 = new Color[]{
                        new Color(100, 200, 125),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22136, 5317587472606754525L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8675, 3336172851505004970L ^ var11)
                        ),
                        new Color(25, 45, 32, 255)
                     };
                     var13[4] = var14;
                     var14 = new Color[]{
                        new Color(160, 120, 230),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(17223, 6727518184149541655L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30084, 5582915298719061496L ^ var11)
                        ),
                        new Color(25, 20, 40, 255)
                     };
                     var13[5] = var14;
                     var14 = new Color[]{
                        new Color(150, 215, 255),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(4902, 3215621215439369167L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5274, 7972307284490335481L ^ var11)
                        ),
                        new Color(40, 65, 85, 255)
                     };
                     var13[6] = var14;
                     var14 = new Color[]{
                        new Color(200, 165, 250),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12545, 5272430036126405079L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10108, 5094352036004661226L ^ var11)
                        ),
                        new Color(60, 48, 75, 255)
                     };
                     var13[7] = var14;
                     var14 = new Color[]{
                        new Color(255, 110, 85),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(13852, 4972508516030715527L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16777, 3771735017513804274L ^ var11)
                        ),
                        new Color(45, 20, 18, 255)
                     };
                     var13[8] = var14;
                     var14 = new Color[]{
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(8770, 4039836709892293315L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10061, 4323597486539310996L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(3354, 4877168522178538909L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18908, 612709819383179644L ^ var11)
                        )
                     };
                     var13[9] = var14;
                     var14 = new Color[]{
                        new Color(150, 240, 225),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(12250, 5291839673544642357L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22951, 3702268956686154046L ^ var11)
                        ),
                        new Color(40, 68, 65, 255)
                     };
                     var13[10] = var14;
                     var14 = new Color[]{
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(30478, 1150056133236381566L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(26966, 6277829376346671604L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11946, 2030654253974556277L ^ var11)
                        ),
                        new Color(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(5353, 7216661409474393168L ^ var11)
                        )
                     };
                     var13[11] = var14;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var13;
                     return;
                  }
                  break;
               default:
                  var27[var10001] = var34;
                  if (var2 < var5) {
                     continue label23;
                  }

                  var4 = "oÈ´\u000fb!Ø\u0084×$\u009e\u0002\u0088TÑ7";
                  var5 = "oÈ´\u000fb!Ø\u0084×$\u009e\u0002\u0088TÑ7".length();
                  var2 = 0;
            }

            byte var29 = var2;
            var2 += 8;
            var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
            var27 = var6;
            var10001 = var3++;
            var30 = (var7[0] & 255L) << 56
               | (var7[1] & 255L) << 48
               | (var7[2] & 255L) << 40
               | (var7[3] & 255L) << 32
               | (var7[4] & 255L) << 24
               | (var7[5] & 255L) << 16
               | (var7[6] & 255L) << 8
               | var7[7] & 255L;
            var32 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19124;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/gui/clickgui/endgameGUI/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var3] = var15;
      }

      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var3];
   }

   private static int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
            "me/octo/client/gui/clickgui/endgameGUI/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
