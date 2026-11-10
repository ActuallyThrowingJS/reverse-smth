package me.octo.client.modules.impl.features.mining;

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
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.MotionUpdateEvent;
import me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.packet.PacketSendEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import me.octo.client.utils.player.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.utils.skyblock.mining.BlockUtils;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public final class JasperDrillBug extends BooleanModule {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @JvmField
   @NotNull
   public static JasperDrillBug lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 47569312790448L;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static Map IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap(13);

   private JasperDrillBug() {
      long var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 10308428289007L;
      super(
         "Jasper Drill Bug",
         "Abuses the Jasper Drill Bug to gain more mining speed on gemstones. A Jasper Drill is required!",
         ModuleCategory.SKILLS,
         "Crystal Hollows"
      );
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull MotionUpdateEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketSendEvent eArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eArg
   ) {
      long var2 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 17067627464981L;
      long var4 = (var2 ^ 71251083817109L) >>> 16;
      int var6 = (int)((var2 ^ 71251083817109L) << 48 >>> 48);
      Intrinsics.checkNotNullParameter(eArg, "e");
      this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, (char)var6, false);
   }

   private final BlockPos IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(long var1) {
      var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ var1;
      long var3 = var1 ^ 23191593724155L;
      BlockPos var6 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
      BlockPos var7 = null;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1026481275150805868L, var1
      );
      double var8 = Double.MAX_VALUE;
      int var10 = -4;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var5 = var10000;

      while (var10 < 5) {
         int var11 = -4;

         while (true) {
            if (var11 < 5) {
               if (var5 != null) {
                  for (int var12 = -4; var12 < 5; var12++) {
                     label89: {
                        try {
                           try {
                              var22 = var11;
                           } catch (MatchException var16) {
                              throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                 var16, -1143235226467451192L, var1
                              );
                           }

                           if (var22 != 0) {
                              break label89;
                           }
                        } catch (MatchException var20) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var20, -1143235226467451192L, var1
                           );
                        }

                        int var23 = var12;

                        try {
                           if (var23 != 0) {
                              break label89;
                           }
                        } catch (MatchException var19) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var19, -1143235226467451192L, var1
                           );
                        }

                        if (var10 <= 0) {
                           continue;
                        }
                     }

                     BlockPos var24 = var6.offset(new Vec3i(var11, var10, var12));
                     Intrinsics.checkNotNullExpressionValue(
                        var24, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(3568, 836438772841220648L ^ var1)
                     );
                     BlockPos var13 = var24;

                     try {
                        BlockUtils var25 = BlockUtils.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        ClientLevel var10001 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                        Intrinsics.checkNotNull(var10001);
                        BlockState var26 = var10001.getBlockState(var13);
                        Intrinsics.checkNotNullExpressionValue(
                           var26,
                           IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"d">(17868, 9157512911968092675L ^ var1)
                        );
                        if (!var25.lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(var26, var3)) {
                           continue;
                        }
                     } catch (MatchException var18) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var18, -1143235226467451192L, var1
                        );
                     }

                     double var14 = var6.distSqr((Vec3i)var13);

                     try {
                        if (!(var14 < var8)) {
                           continue;
                        }
                     } catch (MatchException var17) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var17, -1143235226467451192L, var1
                        );
                     }

                     var8 = var14;
                     var7 = var13;
                  }

                  var11++;
                  continue;
               }
            } else {
               var10++;
            }

            if (var5 == null) {
               return var7;
            }
            break;
         }
      }

      return var7;
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long var1, byte var3) {
      long var4 = var1 << 8 | (long)var3 << 56 >>> 56;
      long var6 = (var4 ^ 0L) >>> 8;
      int var8 = (int)((var4 ^ 0L) << 56 >>> 56);
      super.lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(var6, (byte)var8);
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = false;
   }

   static {
      long var0 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 3102570541512L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[18];
      int var7 = 0;
      String var6 = "\u009a!¥\u001em~\u0012Nl\u008eéC\u008aTð\u009e\u0016¸gW\u0085hÆ4R#9 bB¹Êx)wÕ\u009d\u008aÙí(ªÁ\n¸<á\u0001§÷\u0015|EòæÜªã\u0089¤{\u0088Gh²Î\u0001\u001eE\u0005cîô0í\u0089Ò³\u009f~\u0011 Ì£ªíT4i9\u0082¿\u0014²-;Q¥2±Ös¤}¥\u0080\u001cmR\u0019÷\u009dø7\u0006ýYÙ¸µá¤\u008b-\u008eÀ\u001díC3I<8\u001b\u0016\t\u0089f&\u0091¤ëOR¹\u0016÷®þOGÂàÿ¡aålKÖ½KÃ!dÏï^/\u0016Q\u0000·\u0093Öê®\u0087Ús\u009er\u0012Åµf\u000e`Q\"\u0080[Ì\u0093\u001fIM½ðÖ\u009a\u008f}\u001fD@ÛcäÉ8\u0086\u009d\u0006ÒNq¤××\u009c+RÌ\u001d]4£\u001fgä\\\u0002\u009dDãÖ¿OÄ\u0007Z\u0090=è «\u0003ß¸\u001eY/ÙU\u009dé0iWÓT÷B¨à\u0084ÛNQ´H\u0017>³\u009cÁq5\t\u0003\"Ó\u0014oM{j&\u000fZ\u0004-õ¤\u0081\u000eÃ\fcº\u0011'hÃH\tb\u0000ÖU\u0019ð\u001a\u0094\u0089\u0006ãZì\u0013u\u0012¤ËCoh&sGûÀSïË\u0087#:&¹\u0088\u0019ç\u0090S2\u0000Ò«Õ@¬Å\u0011æj\u0010\u000e¿_æÉä\u009f\nþaX\u0017¨\u000eà\u0004\u008f\u001b2ç~\u0000\u0013áp0Gg«\u0018ÚÙS=\u00071\u0012¥î\u0081QÖD]0Z\u000e\u0095¡4=Ññ\u0099\u0098\u0007\u008aïçÑ}\u001fº\u0093¦u²£/\u0016Î¸\u0086Æ~Ø\u0018Ä\u0004\u0089} l{\u0092\u0013EkÊ\u009eÕéù\u009aàÈ\u0085Ð)Is\t¸\u0013\u0005\u0087\r±R ò^V×ý\u0015t\u007fõÄ\u001aLÉeÕ±ÐÖ!\u008a>\u001c\u0088ß_)\u0090~¼Ôl¹·\u0007bÄJØLe9'ëô¨ýÕ\u000bÔÀ =\u0088Å¶r\n0yð³èRÛ\u0017,øx»yb¶U.\u0002þ`\u000b\"â£¨%\u001aóOoÄ*\u001c&\u0084ÚG+\u0083] y\u001d`<eCeOïa\u0019W%f\b1·Yü\u0097ú\u0092gK|OÙw\u0090eKÜ \u009bÐ\u0081u'\u0099Ëä»héÇc\u0095®ü´0¿\u0098Ý{\u0097\u0091\u009b>\u0003\u0088ªR¤Ï=ÇÆ\u0016@¦Éù\u0099ÔCÓþx&}Ú`Ôéþ¸ÑüÞó×*\u0082B\u0093\u0097tÝè1Ô\u008f/\u0019\u008eÅ2\u0089#j\f\u0086[_Nÿí\u00ad\u0013W³\u0095d\u0015g ÈÂ}Ì\u0089±\u0010bçÔ.Ú\u0098XQ\u00938ì\u0010VÙxd.¤\u001a¡\u008d;^ÖHJ\u0017îêøD\u0005È\u0007\u008d_J¼@¹\u0089[¨\u001d\u009cb UAEhÚÝ¿×%\u0012ø¡(îèíâä\u009fIb©=«ýÝíµ+0nÃ|\u000eÑ\u000b^è·\u009bFÖ\u0086Ø¯\u0090»7Ãc(M\"¸\u0004\u001c\u001eþÊ\u008dW\u0096\u00ad¯òlZÛ²_Ò@^¤3\u0096V\u009f«ÑT¿ò¯Ñ 4£,\u0003Jº \u0004W\u001e1\u0000ö3\u0089¢\f\u0014\u001dã0ÂOh\u000e¼é\u0086$±i2\u0097\u009d\u009bý¬\u0007\u0094® Ô \u0010¢s¸\u001bqª,ø\bXP\rîÙ\u000e(\u001bÜ\u0006^\t8^IÉ®\u009a2xI«s-\u0099\u009f¿ ö\u0088%þ\\/\u0000\u008bfF|áðrÆÔ\u0005\u001fi\f\u000f¿\u008a!\"ÿ¦-\u001eÈ-\u001f\u000e«\u001b¬1ol\u0083[åè\u0094GÀ¶\u0002f(/s8ä\u0097ý\u008eøk°§)c\tLYð°\u001ff\u0005\u0018¾Ûn_ýP\u0085ìeÚl\u0006\u0010Ê\u0019\u0003Zhd÷H\u0085Õx8õ+íR\u0007t¬Ò\u009fuÝ\u001dH´ó\u00910ú\u0018\u0019\u008a1é\\ü\"l\u0005\u0010ik{ì®iP«¹kKL0À\u0004~Èÿ&S¼+¦íí?\u0088 ¦Æ\u009bá\r\u001fÌ¤iü\u0002éÚÂ\u009eTÓ\u008d9V\u00968\u0017¡v\u007f \u0007T-Õnh=f\u0082\u000b6\u008eÛì(óW<\u0086\u0085±åÛ¡\u0004Yá\u0017$\\.Z\u009abÐd\u0007Yc³nò\u000f¿*Ô\u0011\r½¼f]¯\n\u0018µ/Ñ\u00adUÙ¼4\u0095g\u0081ß5_?\u008f¦\u001dV,Ù\u001b\u0091\u0006\u0011\u009d\u000e!\u0081Ló\u0011¡÷áÃ\u009d:\u0005ZÑ\u0091$\u00adªÏî\u0002\u008ePÙ®¤Äõ\u0098®!^)\u0017w\u0086qglúâÿ&TâbØcoáRb®Þ¹0óÑIÌËî¡|]zÝ\u0019\u008aÐ©í\rv\u0092Rö\byÒd¯È\u0081·ú\u00004×:\u000e\u009fÛ\u0016\u0003~\u001b)\u00801\u0080\u001c8\u0091XÞkn\u0003bOYÉÕ_¦ÖpÕ\u008a\"(\u0083\u008a¹¨¢d\u009b+%64¹\u009f*ócá¨ì¥øáv\u0014°ìV\\\u0088Ø\u00844mÇ\u0014}Æý\u0081¼FcY\u0080¨\u0015Öñ\u0010\u0098\u0098O\u0015P\u009c\u00894ýå(ÈÑô\u00031\u000e\u0088_â!\u00adw\u009d\u001fIÇÖØ1o×|¢\u0010-\u009d+\n\n¼ÔýÂìÔf«[ùd";
      int var8 = "\u009a!¥\u001em~\u0012Nl\u008eéC\u008aTð\u009e\u0016¸gW\u0085hÆ4R#9 bB¹Êx)wÕ\u009d\u008aÙí(ªÁ\n¸<á\u0001§÷\u0015|EòæÜªã\u0089¤{\u0088Gh²Î\u0001\u001eE\u0005cîô0í\u0089Ò³\u009f~\u0011 Ì£ªíT4i9\u0082¿\u0014²-;Q¥2±Ös¤}¥\u0080\u001cmR\u0019÷\u009dø7\u0006ýYÙ¸µá¤\u008b-\u008eÀ\u001díC3I<8\u001b\u0016\t\u0089f&\u0091¤ëOR¹\u0016÷®þOGÂàÿ¡aålKÖ½KÃ!dÏï^/\u0016Q\u0000·\u0093Öê®\u0087Ús\u009er\u0012Åµf\u000e`Q\"\u0080[Ì\u0093\u001fIM½ðÖ\u009a\u008f}\u001fD@ÛcäÉ8\u0086\u009d\u0006ÒNq¤××\u009c+RÌ\u001d]4£\u001fgä\\\u0002\u009dDãÖ¿OÄ\u0007Z\u0090=è «\u0003ß¸\u001eY/ÙU\u009dé0iWÓT÷B¨à\u0084ÛNQ´H\u0017>³\u009cÁq5\t\u0003\"Ó\u0014oM{j&\u000fZ\u0004-õ¤\u0081\u000eÃ\fcº\u0011'hÃH\tb\u0000ÖU\u0019ð\u001a\u0094\u0089\u0006ãZì\u0013u\u0012¤ËCoh&sGûÀSïË\u0087#:&¹\u0088\u0019ç\u0090S2\u0000Ò«Õ@¬Å\u0011æj\u0010\u000e¿_æÉä\u009f\nþaX\u0017¨\u000eà\u0004\u008f\u001b2ç~\u0000\u0013áp0Gg«\u0018ÚÙS=\u00071\u0012¥î\u0081QÖD]0Z\u000e\u0095¡4=Ññ\u0099\u0098\u0007\u008aïçÑ}\u001fº\u0093¦u²£/\u0016Î¸\u0086Æ~Ø\u0018Ä\u0004\u0089} l{\u0092\u0013EkÊ\u009eÕéù\u009aàÈ\u0085Ð)Is\t¸\u0013\u0005\u0087\r±R ò^V×ý\u0015t\u007fõÄ\u001aLÉeÕ±ÐÖ!\u008a>\u001c\u0088ß_)\u0090~¼Ôl¹·\u0007bÄJØLe9'ëô¨ýÕ\u000bÔÀ =\u0088Å¶r\n0yð³èRÛ\u0017,øx»yb¶U.\u0002þ`\u000b\"â£¨%\u001aóOoÄ*\u001c&\u0084ÚG+\u0083] y\u001d`<eCeOïa\u0019W%f\b1·Yü\u0097ú\u0092gK|OÙw\u0090eKÜ \u009bÐ\u0081u'\u0099Ëä»héÇc\u0095®ü´0¿\u0098Ý{\u0097\u0091\u009b>\u0003\u0088ªR¤Ï=ÇÆ\u0016@¦Éù\u0099ÔCÓþx&}Ú`Ôéþ¸ÑüÞó×*\u0082B\u0093\u0097tÝè1Ô\u008f/\u0019\u008eÅ2\u0089#j\f\u0086[_Nÿí\u00ad\u0013W³\u0095d\u0015g ÈÂ}Ì\u0089±\u0010bçÔ.Ú\u0098XQ\u00938ì\u0010VÙxd.¤\u001a¡\u008d;^ÖHJ\u0017îêøD\u0005È\u0007\u008d_J¼@¹\u0089[¨\u001d\u009cb UAEhÚÝ¿×%\u0012ø¡(îèíâä\u009fIb©=«ýÝíµ+0nÃ|\u000eÑ\u000b^è·\u009bFÖ\u0086Ø¯\u0090»7Ãc(M\"¸\u0004\u001c\u001eþÊ\u008dW\u0096\u00ad¯òlZÛ²_Ò@^¤3\u0096V\u009f«ÑT¿ò¯Ñ 4£,\u0003Jº \u0004W\u001e1\u0000ö3\u0089¢\f\u0014\u001dã0ÂOh\u000e¼é\u0086$±i2\u0097\u009d\u009bý¬\u0007\u0094® Ô \u0010¢s¸\u001bqª,ø\bXP\rîÙ\u000e(\u001bÜ\u0006^\t8^IÉ®\u009a2xI«s-\u0099\u009f¿ ö\u0088%þ\\/\u0000\u008bfF|áðrÆÔ\u0005\u001fi\f\u000f¿\u008a!\"ÿ¦-\u001eÈ-\u001f\u000e«\u001b¬1ol\u0083[åè\u0094GÀ¶\u0002f(/s8ä\u0097ý\u008eøk°§)c\tLYð°\u001ff\u0005\u0018¾Ûn_ýP\u0085ìeÚl\u0006\u0010Ê\u0019\u0003Zhd÷H\u0085Õx8õ+íR\u0007t¬Ò\u009fuÝ\u001dH´ó\u00910ú\u0018\u0019\u008a1é\\ü\"l\u0005\u0010ik{ì®iP«¹kKL0À\u0004~Èÿ&S¼+¦íí?\u0088 ¦Æ\u009bá\r\u001fÌ¤iü\u0002éÚÂ\u009eTÓ\u008d9V\u00968\u0017¡v\u007f \u0007T-Õnh=f\u0082\u000b6\u008eÛì(óW<\u0086\u0085±åÛ¡\u0004Yá\u0017$\\.Z\u009abÐd\u0007Yc³nò\u000f¿*Ô\u0011\r½¼f]¯\n\u0018µ/Ñ\u00adUÙ¼4\u0095g\u0081ß5_?\u008f¦\u001dV,Ù\u001b\u0091\u0006\u0011\u009d\u000e!\u0081Ló\u0011¡÷áÃ\u009d:\u0005ZÑ\u0091$\u00adªÏî\u0002\u008ePÙ®¤Äõ\u0098®!^)\u0017w\u0086qglúâÿ&TâbØcoáRb®Þ¹0óÑIÌËî¡|]zÝ\u0019\u008aÐ©í\rv\u0092Rö\byÒd¯È\u0081·ú\u00004×:\u000e\u009fÛ\u0016\u0003~\u001b)\u00801\u0080\u001c8\u0091XÞkn\u0003bOYÉÕ_¦ÖpÕ\u008a\"(\u0083\u008a¹¨¢d\u009b+%64¹\u009f*ócá¨ì¥øáv\u0014°ìV\\\u0088Ø\u00844mÇ\u0014}Æý\u0081¼FcY\u0080¨\u0015Öñ\u0010\u0098\u0098O\u0015P\u009c\u00894ýå(ÈÑô\u00031\u000e\u0088_â!\u00adw\u009d\u001fIÇÖØ1o×|¢\u0010-\u009d+\n\n¼ÔýÂìÔf«[ùd"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "6Yá-o\u001eFà\u0098\u0005àÂü5>üx&ÔW]@\u008f& 0£^\u0013i\u0092û,a©\u000f\u0018ã\u0019\\´\fï\u007f}fKßÒp\u001dÀ\u000eö\u0017È[\\!SYæ\u001d£Ë[M'\u0096'¬½u.¥¢;LèA=y\u0091\r\fs}\u000ec'°\u0005ÚÙ\u0099å×mq\b%ü¶v0k>¤Hùèq cS0¤¾÷I3ß\u0083\u0095\u0016yº`»³Õ>ùº/w ²ÕlØ`Ên\u0007W5ýÃkÞh1)\u008e!\u009b\u0088Ü+¡Ô!A2Ý®{÷";
            var8 = "6Yá-o\u001eFà\u0098\u0005àÂü5>üx&ÔW]@\u008f& 0£^\u0013i\u0092û,a©\u000f\u0018ã\u0019\\´\fï\u007f}fKßÒp\u001dÀ\u000eö\u0017È[\\!SYæ\u001d£Ë[M'\u0096'¬½u.¥¢;LèA=y\u0091\r\fs}\u000ec'°\u0005ÚÙ\u0099å×mq\b%ü¶v0k>¤Hùèq cS0¤¾÷I3ß\u0083\u0095\u0016yº`»³Õ>ùº/w ²ÕlØ`Ên\u0007W5ýÃkÞh1)\u008e!\u009b\u0088Ü+¡Ô!A2Ý®{÷"
               .length();
            var5 = '\u0088';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var9;
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new String[18];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new JasperDrillBug();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30200;
      if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/mining/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl", var10
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
         byte[] var9 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5].getBytes("ISO-8859-1");
         IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5];
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
            "me/octo/client/modules/impl/features/mining/llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final BlockPos IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII$recovered$dc8b169ad71dd86f(long var1) {
      var1 = 114579423905174L;
      var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ var1;
      long var3 = var1 ^ 23191593724155L;
      BlockPos var6 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
      BlockPos var7 = null;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var10000 = llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      double var8 = Double.MAX_VALUE;
      int var10 = -4;
      IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var5 = var10000;

      while (var10 < 5) {
         int var11 = -4;

         while (true) {
            if (var11 < 5) {
               if (var5 != null) {
                  for (int var12 = -4; var12 < 5; var12++) {
                     label89: {
                        try {
                           try {
                              var28 = var11;
                           } catch (MatchException var21) {
                              throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var21);
                           }

                           if (var28 != 0) {
                              break label89;
                           }
                        } catch (MatchException var25) {
                           throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var25);
                        }

                        int var29 = var12;

                        try {
                           if (var29 != 0) {
                              break label89;
                           }
                        } catch (MatchException var24) {
                           throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var24);
                        }

                        if (var10 <= 0) {
                           continue;
                        }
                     }

                     BlockPos var30 = var6.offset(new Vec3i(var11, var10, var12));
                     Intrinsics.checkNotNullExpressionValue(var30, "offset(...)");
                     BlockPos var13 = var30;

                     try {
                        BlockUtils var31 = BlockUtils.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                        ClientLevel var10001 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().level;
                        Intrinsics.checkNotNull(var10001);
                        BlockState var32 = var10001.getBlockState(var13);
                        Intrinsics.checkNotNullExpressionValue(var32, "getBlockState(...)");
                        if (!var31.lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII$recovered$34b5f09a992ffb75(var32, var3)
                           )
                         {
                           continue;
                        }
                     } catch (MatchException var23) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var23);
                     }

                     double var14 = var6.distSqr((Vec3i)var13);

                     try {
                        if (!(var14 < var8)) {
                           continue;
                        }
                     } catch (MatchException var22) {
                        throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var22);
                     }

                     var8 = var14;
                     var7 = var13;
                  }

                  var11++;
                  continue;
               }
            } else {
               var10++;
            }

            if (var5 == null) {
               return var7;
            }
            break;
         }
      }

      return var7;
   }
}
