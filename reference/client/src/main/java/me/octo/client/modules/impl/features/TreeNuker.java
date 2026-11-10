package me.octo.client.modules.impl.features;

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
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.CrosshairTargetEvent;
import me.octo.client.events.impl.game.MotionUpdateEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TreeNuker extends BooleanModule {
   @NotNull
   public static TreeNuker.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @Nullable
   private BlockPos lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private final int lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static TreeNuker llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 50035400567455L;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;

   private TreeNuker() {
      long var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 138017981210065L;
      ModuleCategory var10003 = ModuleCategory.SKILLS;
      Setting[] var3 = new Setting[]{
         IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Tree Nuker", "Nukes trees.", var10003, "Misc", var3);
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = (int)llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull MotionUpdateEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull CrosshairTargetEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eArg
   ) {
      Intrinsics.checkNotNullParameter(eArg, "e");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var10001 = var1 ^ 9325505454849L;
      int var3 = (int)((var1 ^ 9325505454849L) >>> 48);
      int var4 = (int)((var1 ^ 9325505454849L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      this.IllllIIIIIIIlIlIllIIIlIIIIIIlIIIlIIllllIIIlIIIlIllllIIIlIllIllIlIIlllIlllIlIIIlIIlIII((char)var3, (short)var4, var5);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var10001 = var4 ^ 64842573134489L;
      int var6 = (int)((var4 ^ 64842573134489L) >>> 32);
      int var7 = (int)((var4 ^ 64842573134489L) << 32 >>> 40);
      int var8 = (int)(var10001 << 56 >>> 56);
      this.lIlIIIlIllIlllllIIIllllllIllIIlIIlllIlIIlIIlllIlllIlIlIIlIIlllIlllIlllllIIlllIIIIIIll(var6, var7, (byte)var8);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = null;
   }

   private final BlockPos llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, int var3) {
      var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var1;
      BlockPos var5 = me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
      BlockPos var6 = null;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         855096733394696979L, var1
      );
      double var7 = Double.MAX_VALUE;
      int var9 = -var3;
      int[] var4 = var10000;
      if (var9 <= var3) {
         while (true) {
            label103: {
               int var10 = -var3;
               if (var10 <= var3) {
                  while (true) {
                     var24 = -var3;
                     if (var4 != null) {
                        break label103;
                     }

                     int var11 = var24;

                     label89: {
                        try {
                           if (var11 > var3) {
                              break label89;
                           }
                        } catch (MatchException var22) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var22, 830927641803443071L, var1
                           );
                        }

                        while (true) {
                           label101: {
                              BlockPos var25 = var5.offset(new Vec3i(var9, var10, var11));
                              Intrinsics.checkNotNullExpressionValue(
                                 var25,
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(15423, 8396153715526994438L ^ var1)
                              );
                              BlockPos var12 = var25;
                              ClientLevel var26 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                              Intrinsics.checkNotNull(var26);
                              if (!var26.getBlockState(var12).is(Blocks.MANGROVE_WOOD)) {
                                 ClientLevel var27 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                                 Intrinsics.checkNotNull(var27);
                                 BlockState var28 = var27.getBlockState(var12);

                                 try {
                                    if (!var28.is(Blocks.STRIPPED_SPRUCE_WOOD)) {
                                       break label101;
                                    }
                                 } catch (MatchException var21) {
                                    throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                       var21, 830927641803443071L, var1
                                    );
                                 }
                              }

                              double var13 = var5.distSqr((Vec3i)var12);

                              try {
                                 if (!(var13 < var7)) {
                                    break label101;
                                 }
                              } catch (MatchException var20) {
                                 throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                    var20, 830927641803443071L, var1
                                 );
                              }

                              var7 = var13;
                              var6 = var12;
                           }

                           int var29 = var11;

                           try {
                              try {
                                 if (var29 == var3) {
                                    break;
                                 }
                              } catch (MatchException var18) {
                                 throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                    var18, 830927641803443071L, var1
                                 );
                              }

                              var11++;
                           } catch (MatchException var19) {
                              throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                 var19, 830927641803443071L, var1
                              );
                           }
                        }
                     }

                     int var30 = var10;

                     try {
                        try {
                           if (var30 == var3) {
                              break;
                           }
                        } catch (MatchException var16) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var16, 830927641803443071L, var1
                           );
                        }

                        var10++;
                     } catch (MatchException var17) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var17, 830927641803443071L, var1
                        );
                     }
                  }
               }

               var24 = var9;
            }

            try {
               if (var24 == var3) {
                  break;
               }

               var9++;
               if (var4 != null) {
                  break;
               }
            } catch (MatchException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, 830927641803443071L, var1
               );
            }
         }
      }

      return var6;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull BlockHitResult param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@NotNull BlockHitResult param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var5 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 7890804381664L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[14];
      int var12 = 0;
      String var11 = "RÔaÐÇq²ÁÑ`\u0094¡ÔFH\u008a¨\u001eS\u00024_\u0099\u0017\u000f~\u0092´®\u0006P \u001d¿\u001cÐ*\u0093²É÷\u0093Õ=\u000f¿e\u009dÄÎ\u008f ¼\u0013òpUlÐ)[Qu\u0003>è\u0093±¡I\u0082o}Ù`db\u0093\u009dÎÕ+\"e\u0003ä\u008fûÚÊ \r\u001fqG/\u0082³Û¤liÆ/ËF\"9¨t)\u009d_\u0012ñ$Ñ\u0086Ò7î\u009d\u0015P\nCò§ÚÆ6\u009bx©\u009b\u0005¤0¶Ñ\u0081ÈS½4q]Õ\u0095åÔ\u009b¼\u0012W\u0098\u000b\u0001\f\r\u008fÚ\u008e\u008f(»\u0007«ek??o+$ß´·~¯ûóVE\r(\\£A¿¢óÒOì-ï´qá^DGÑ°\b\u0016§y`\u0087\u008c¦ª\u0000¡>\u0091{ÊËåº~Ux\u0010Ë\u009bï-\u009ep¹\u0016\u0014u&\u000eì\u008b^~\u0018pÂ×\u00adiÒÄ sýè´Ç{!I\u0084Z:s¢\u0084t\u009b \u0014\u0007\u0016b®ÙáE\u0011\u008f\u008e\u000f\u000bJ\u000b-Ã\u0089\u001cV\u0083ý¢Ú<<d·¹\u009d\u001e\u0002(a\u0012ôp\u0003ØQ.\u00198ñÀ\u009e/Àà\u0089Äí¦0Õ\u0085íñ7[RÜ\u0018\\'\u0019}\u0005Ûì\u0087f 0ý×ô^ÖíÙuèM\u009fr:Xè!Û\u0005\u000br©>{&\u000e²p\u009b-×é\u008co¹\u009a\u0017&N£\u009c\u0091\u0089\u001e%Ã\u0017J\u0085\u0010~N\u00806ûÁYÜ´hBÚµ¦¯\u0017 \u0095éü9¤F\u0085\u0089NlW\u007ff²S½\u0080a©\u0007Ùÿ£\u0003&¾ÆÂ\u000bQ \u0093>=\u0091G\t&õ\u0007Ì6ÅX\u0000E7~y\u0090\u0012×$Q~I½G\u0000Z`\u0000îoÑ§\u008bá\u009dú\u0084\u0013ÌÌ¸¯&Óï¼O.\u00ad\u0014£¬%\u0002ßÖØ¼v[~\u001déß¸\u001fw\u0095- µ\u0007Ûaç~»§N¥\u0085\u0015\u0092f\u009b^¯\u00197\u0003ø¦\u0011}î\u008c\u0016\u0086\u009e\u001d\u0086\u0083\u0095\\\u000eá\u0086o^bF<\u001fYkÅ[ãýÎ?$Zw\u0000\u001f\u0018u»Â\u0007ÒÉFôéÄ\u000bÅxjÄ7ü=AÁ\u008cY\u009bÎ\u0010ß\u001c¿ùX¹\\ +îbA\u0084u\u0094Ä";
      int var13 = "RÔaÐÇq²ÁÑ`\u0094¡ÔFH\u008a¨\u001eS\u00024_\u0099\u0017\u000f~\u0092´®\u0006P \u001d¿\u001cÐ*\u0093²É÷\u0093Õ=\u000f¿e\u009dÄÎ\u008f ¼\u0013òpUlÐ)[Qu\u0003>è\u0093±¡I\u0082o}Ù`db\u0093\u009dÎÕ+\"e\u0003ä\u008fûÚÊ \r\u001fqG/\u0082³Û¤liÆ/ËF\"9¨t)\u009d_\u0012ñ$Ñ\u0086Ò7î\u009d\u0015P\nCò§ÚÆ6\u009bx©\u009b\u0005¤0¶Ñ\u0081ÈS½4q]Õ\u0095åÔ\u009b¼\u0012W\u0098\u000b\u0001\f\r\u008fÚ\u008e\u008f(»\u0007«ek??o+$ß´·~¯ûóVE\r(\\£A¿¢óÒOì-ï´qá^DGÑ°\b\u0016§y`\u0087\u008c¦ª\u0000¡>\u0091{ÊËåº~Ux\u0010Ë\u009bï-\u009ep¹\u0016\u0014u&\u000eì\u008b^~\u0018pÂ×\u00adiÒÄ sýè´Ç{!I\u0084Z:s¢\u0084t\u009b \u0014\u0007\u0016b®ÙáE\u0011\u008f\u008e\u000f\u000bJ\u000b-Ã\u0089\u001cV\u0083ý¢Ú<<d·¹\u009d\u001e\u0002(a\u0012ôp\u0003ØQ.\u00198ñÀ\u009e/Àà\u0089Äí¦0Õ\u0085íñ7[RÜ\u0018\\'\u0019}\u0005Ûì\u0087f 0ý×ô^ÖíÙuèM\u009fr:Xè!Û\u0005\u000br©>{&\u000e²p\u009b-×é\u008co¹\u009a\u0017&N£\u009c\u0091\u0089\u001e%Ã\u0017J\u0085\u0010~N\u00806ûÁYÜ´hBÚµ¦¯\u0017 \u0095éü9¤F\u0085\u0089NlW\u007ff²S½\u0080a©\u0007Ùÿ£\u0003&¾ÆÂ\u000bQ \u0093>=\u0091G\t&õ\u0007Ì6ÅX\u0000E7~y\u0090\u0012×$Q~I½G\u0000Z`\u0000îoÑ§\u008bá\u009dú\u0084\u0013ÌÌ¸¯&Óï¼O.\u00ad\u0014£¬%\u0002ßÖØ¼v[~\u001déß¸\u001fw\u0095- µ\u0007Ûaç~»§N¥\u0085\u0015\u0092f\u009b^¯\u00197\u0003ø¦\u0011}î\u008c\u0016\u0086\u009e\u001d\u0086\u0083\u0095\\\u000eá\u0086o^bF<\u001fYkÅ[ãýÎ?$Zw\u0000\u001f\u0018u»Â\u0007ÒÉFôéÄ\u000bÅxjÄ7ü=AÁ\u008cY\u009bÎ\u0010ß\u001c¿ùX¹\\ +îbA\u0084u\u0094Ä"
         .length();
      char var10 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var28 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var28;
         if ((var9 += var10) >= var13) {
            var11 = "°\u008cÂ!U:\u0003@ªp\u0019«EÐ²ß\u0015l§\u0003ÐT\u001c3\u0015ÌE*Æu¤ÇÈ\u0087\u0005¨Ã¶ô\u008d\u0010-Õ\u008cV\u008dm\u00993o'ò\u0091}\u009c`X";
            var13 = "°\u008cÂ!U:\u0003@ªp\u0019«EÐ²ß\u0015l§\u0003ÐT\u001c3\u0015ÌE*Æu¤ÇÈ\u0087\u0005¨Ã¶ô\u008d\u0010-Õ\u008cV\u008dm\u00993o'ò\u0091}\u009c`X"
               .length();
            var10 = '(';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var30 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var15).intern();
               byte var25 = 0;
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var14;
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new String[14];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 6231159614533369194L;
                  byte[] var4 = var0.doFinal(
                     new byte[]{
                        (byte)(var2 >>> 56),
                        (byte)(var2 >>> 48),
                        (byte)(var2 >>> 40),
                        (byte)(var2 >>> 32),
                        (byte)(var2 >>> 24),
                        (byte)(var2 >>> 16),
                        (byte)(var2 >>> 8),
                        (byte)var2
                     }
                  );
                  long var33 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  var25 = -1;
                  llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var33;
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new TreeNuker.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new TreeNuker();
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16045;
      if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
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
         byte[] var9 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5].getBytes("ISO-8859-1");
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/features/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final BlockPos llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$b7941c8f89040f44(long var1, int var3) {
      var1 = 38506111230465L;
      var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ var1;
      BlockPos var5 = me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
      BlockPos var6 = null;
      int[] var10000 = TreeNuker.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      double var7 = Double.MAX_VALUE;
      int var9 = -var3;
      int[] var4 = var10000;
      if (var9 <= var3) {
         while (true) {
            label103: {
               int var10 = -var3;
               if (var10 <= var3) {
                  while (true) {
                     var33 = -var3;
                     if (var4 != null) {
                        break label103;
                     }

                     int var11 = var33;

                     label89: {
                        try {
                           if (var11 > var3) {
                              break label89;
                           }
                        } catch (MatchException var30) {
                           throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var30);
                        }

                        while (true) {
                           label101: {
                              BlockPos var34 = var5.offset(new Vec3i(var9, var10, var11));
                              Intrinsics.checkNotNullExpressionValue(var34, "offset(...)");
                              BlockPos var12 = var34;
                              ClientLevel var35 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                              Intrinsics.checkNotNull(var35);
                              if (!var35.getBlockState(var12).is(Blocks.MANGROVE_WOOD)) {
                                 ClientLevel var36 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                                 Intrinsics.checkNotNull(var36);
                                 BlockState var37 = var36.getBlockState(var12);

                                 try {
                                    if (!var37.is(Blocks.STRIPPED_SPRUCE_WOOD)) {
                                       break label101;
                                    }
                                 } catch (MatchException var29) {
                                    throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var29);
                                 }
                              }

                              double var13 = var5.distSqr((Vec3i)var12);

                              try {
                                 if (!(var13 < var7)) {
                                    break label101;
                                 }
                              } catch (MatchException var28) {
                                 throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var28);
                              }

                              var7 = var13;
                              var6 = var12;
                           }

                           int var38 = var11;

                           try {
                              try {
                                 if (var38 == var3) {
                                    break;
                                 }
                              } catch (MatchException var26) {
                                 throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26);
                              }

                              var11++;
                           } catch (MatchException var27) {
                              throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var27);
                           }
                        }
                     }

                     int var39 = var10;

                     try {
                        try {
                           if (var39 == var3) {
                              break;
                           }
                        } catch (MatchException var24) {
                           throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var24);
                        }

                        var10++;
                     } catch (MatchException var25) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var25);
                     }
                  }
               }

               var33 = var9;
            }

            try {
               if (var33 == var3) {
                  break;
               }

               var9++;
               if (var4 != null) {
                  break;
               }
            } catch (MatchException var23) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var23);
            }
         }
      }

      return var6;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$e5b4a92215ccc05c(
      @NotNull BlockHitResult bhrArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a734fab73aa6cea(
      @NotNull BlockHitResult bhrArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final TreeNuker IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return TreeNuker.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }

      public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int[] var0) {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
      }

      public static int[] llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      static {
         long var0 = 13101793389181L ^ 32506655411821L;
         if (llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() != null) {
            int[] var2 = new int[5];
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2);
         }
      }
   }
}
