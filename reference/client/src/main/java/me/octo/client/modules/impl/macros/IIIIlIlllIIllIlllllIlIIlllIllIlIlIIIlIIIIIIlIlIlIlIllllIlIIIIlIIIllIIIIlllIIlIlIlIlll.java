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
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.modules.impl.features.mining.OreEngine;
import org.jetbrains.annotations.NotNull;

public final class IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll {
   @NotNull
   public static IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

   private IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final BooleanSetting IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final BooleanSetting lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   static {
      long var9 = 117351323395164L ^ 95309312354457L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[13];
      int var6 = 0;
      String var5 = "âæ×\u00070\u008fË`\u0000ÌÕF@ö$å\u0010£<}~÷ÞÑ§Åm©\u0085Ã\u0084\u0006Í\u0018þ³soPÈãÍH\u0082¼\u0002 \u001fí¯XÊ\u0018Ã\u0018aÄdhéÌè\u009dÅ_¡hû\rÃ]qª2 7õ\u0010G\u008aÈÖ¸\u0092Û\u0017ZÛzo½AÖZú{Í¹Ç\u0089{Óñê\u0095r\"|\u0010Ð\u0098wÅlaÑ\u0012'\u0082o|2Þ9\u001cäf\u009c\u008f\u0010\u0012ë\u00067ñD8¤Î\u0085wH«x<\u0081~æ\u0015ÅnZ~ÚZ©\u00ad\u001e7\u008c\b+\u0014HÌZ\u009a<Ï§QÍaËÛg\u007f¸}\u0011\u0097C5ïì\u0095å\u008c5ÖóF$|WÇ\u0092\u0094\u0088\u009aA\u001fÞÇÚb\"\u0006 2)¥ççÛ\\%@<Ù\u008e\u0081>P\u009d=ã\u0015\u001b¢Ñæw\u0095\u0004Ï\u0010]\u00ad\u0017bà«]\u0016\u0089\u001b\u007fÇ\u0083ÎM\u0011\u0018fÁÒßCKå/¥ÀÞ\u0082«uÞsï\u0085¨÷(\u007f<\u009a0d\u001eÏþ\u0092Qqÿê;ëìó²æ\u0000|¶Öå{³×\u009e3\u000e0UApÅ\u000e\u0091\u0015í¸Â\u008b\u0096Ã\u009f/\u0014,³úÓ\u0019(\u0091u\u0088s\u0095£\u001aH´ÿ]\u0003¶\u008eÍd\u007f!z§dÝ¡Â¾ïÏ\u0007<Ï\u008bÄ\u0012w(máà²\u00120}Î³m\u0085Ü\u008f\u008eBÐ\u0012¿5\u000bn\u001c »°Z\u0098|cäâmCcmÔ§7Ï\u0089:èFyÁf\u008bõ\u000fëb\"ñÈ@\u0007®½õ4M^òd\u00adÁE\u0019S\u000e7UÈG\u0093HäË\u0005*B+\u0013\u0012X\u001bf\u0099\u0003\t§A±\u000e\u000b\u0018/îEs®C\u0004Dol=[\u008f-y\u000ea^®7«5s";
      int var7 = "âæ×\u00070\u008fË`\u0000ÌÕF@ö$å\u0010£<}~÷ÞÑ§Åm©\u0085Ã\u0084\u0006Í\u0018þ³soPÈãÍH\u0082¼\u0002 \u001fí¯XÊ\u0018Ã\u0018aÄdhéÌè\u009dÅ_¡hû\rÃ]qª2 7õ\u0010G\u008aÈÖ¸\u0092Û\u0017ZÛzo½AÖZú{Í¹Ç\u0089{Óñê\u0095r\"|\u0010Ð\u0098wÅlaÑ\u0012'\u0082o|2Þ9\u001cäf\u009c\u008f\u0010\u0012ë\u00067ñD8¤Î\u0085wH«x<\u0081~æ\u0015ÅnZ~ÚZ©\u00ad\u001e7\u008c\b+\u0014HÌZ\u009a<Ï§QÍaËÛg\u007f¸}\u0011\u0097C5ïì\u0095å\u008c5ÖóF$|WÇ\u0092\u0094\u0088\u009aA\u001fÞÇÚb\"\u0006 2)¥ççÛ\\%@<Ù\u008e\u0081>P\u009d=ã\u0015\u001b¢Ñæw\u0095\u0004Ï\u0010]\u00ad\u0017bà«]\u0016\u0089\u001b\u007fÇ\u0083ÎM\u0011\u0018fÁÒßCKå/¥ÀÞ\u0082«uÞsï\u0085¨÷(\u007f<\u009a0d\u001eÏþ\u0092Qqÿê;ëìó²æ\u0000|¶Öå{³×\u009e3\u000e0UApÅ\u000e\u0091\u0015í¸Â\u008b\u0096Ã\u009f/\u0014,³úÓ\u0019(\u0091u\u0088s\u0095£\u001aH´ÿ]\u0003¶\u008eÍd\u007f!z§dÝ¡Â¾ïÏ\u0007<Ï\u008bÄ\u0012w(máà²\u00120}Î³m\u0085Ü\u008f\u008eBÐ\u0012¿5\u000bn\u001c »°Z\u0098|cäâmCcmÔ§7Ï\u0089:èFyÁf\u008bõ\u000fëb\"ñÈ@\u0007®½õ4M^òd\u00adÁE\u0019S\u000e7UÈG\u0093HäË\u0005*B+\u0013\u0012X\u001bf\u0099\u0003\t§A±\u000e\u000b\u0018/îEs®C\u0004Dol=[\u008f-y\u000ea^®7«5s"
         .length();
      char var4 = 16;
      int var13 = -1;

      label28:
      while (true) {
         String var14 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var20;
                  if ((var13 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[2], var0[10], true);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[7], var0[4], false);
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[0], var0[3], true);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 135312239305641L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1x = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 86441781093438L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5x = var3 ^ 119207902105391L;
                           me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll[] var7x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              -1656860788401641422L, var3
                           );

                           try {
                              boolean var10000x = OreEngine.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
                                 .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5x);
                              if (var7x == null) {
                                 return var10000x;
                              }

                              if (!var10000x) {
                                 return true;
                              }
                           } catch (MatchException var8x) {
                              throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                 var8x, -1711168160602633242L, var3
                              );
                           }

                           return false;
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 111692529572001L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[2];
                           int var7 = 0;
                           String var6 = "§`f.¸\u0019â¯\u0089®Ï\rÅ z\n6ý\u0016L)\u001eBEÆß\u008fCr¦ÄÝ\u001f×XÌ~\u009f\u001be\u0019\u0087\u0081Ð\u0017Úà^v³sâßç\u0014fB\u0093w²°Ó|²ïV\u0097¼X¿\u001d¡\u00157ÅG\u0085\u00835étÏá°\u0096\u008b\fÀ\u001cöÝÞøÔe\f$®Ö\u009dü\u001dë\u0081 \u0093j\u0082Éùüp Ö'ÿ\tÅøw¬b~IÐ\u0006ñ\u0092\u008e¤\u0090)?\br6o";
                           int var8 = "§`f.¸\u0019â¯\u0089®Ï\rÅ z\n6ý\u0016L)\u001eBEÆß\u008fCr¦ÄÝ\u001f×XÌ~\u009f\u001be\u0019\u0087\u0081Ð\u0017Úà^v³sâßç\u0014fB\u0093w²°Ó|²ïV\u0097¼X¿\u001d¡\u00157ÅG\u0085\u00835étÏá°\u0096\u008b\fÀ\u001cöÝÞøÔe\f$®Ö\u009dü\u001dë\u0081 \u0093j\u0082Éùüp Ö'ÿ\tÅøw¬b~IÐ\u0006ñ\u0092\u008e¤\u0090)?\br6o"
                              .length();
                           char var5 = 'h';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[2];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
                        }

                        private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           MatchException var0x
                        ) {
                           return var0x;
                        }

                        private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                           int var1x = 0;
                           int var2;
                           char[] var3 = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3[var1x++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8x = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8x & 63));
                                 var3[var1x++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12 = (char)((char)(var5x & 15) << '\f');
                                 byte var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63) << 6);
                                 var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63));
                                 var3[var1x++] = var12;
                              }
                           }

                           return new String(var3, 0, var1x);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                           int var5x = var0x ^ (int)(var1x & 32767L) ^ 5025;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4x = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1x >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                              }

                              DESKeySpec var11 = new DESKeySpec(var6x);
                              SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                              ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                              byte[] var9x = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5x]
                                 .getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9x)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5x];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, MutableCallSite var1x, String var2, Object[] var3
                        ) {
                           int var4x = (Integer)var3[0];
                           long var5x = (Long)var3[1];
                           String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                           var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                           return var7x;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1x, MethodType var2
                        ) {
                           MutableCallSite var3 = new MutableCallSite(var2);

                           try {
                              var3.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
                                       0,
                                       var0x,
                                       var3,
                                       var1x
                                    ),
                                    var2
                                 )
                              );
                              return var3;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1x
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 125801516629081L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 27273479805573L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int param1, int param2) {
                           // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 47747377429179L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[2];
                           int var7 = 0;
                           String var6 = "\n\u0081c©\u001dB.\u0093F\u000b4æ²$µL\u007fÜ´´Ùºz½B\u0082m&$f\u00ad\u009fx¿\fíøxd\u0098\"\u008a¢\u0019çC\u008d)g£4jà\u0017ÁË¤\rú&Ó2>¨æîk\u0011\u0007\u0007ióUñ\u0005\u001a\u0096ø6CÞª{\r\u008f\u009d\u0013\u0019S\\·ú\u0014\u0090%YØ\u00002\u0090D\u0096b\u0085\u008f`[Ë4\u0086\u0014\u0010\u0005R!r~Y\u0090\u0086¬\u0087d¯é·\u008a\u0013\u0097g\u008bKW©{\\\r\u0096pn.t\u009aÜ(i7\u0095\u0094eaïù&Æè\u0097*CMª\u0083\u0090\u0081Ú÷Ú%ÕÀÑ áCÃ/ï¢\"j\u0084A³\u0095$";
                           int var8 = "\n\u0081c©\u001dB.\u0093F\u000b4æ²$µL\u007fÜ´´Ùºz½B\u0082m&$f\u00ad\u009fx¿\fíøxd\u0098\"\u008a¢\u0019çC\u008d)g£4jà\u0017ÁË¤\rú&Ó2>¨æîk\u0011\u0007\u0007ióUñ\u0005\u001a\u0096ø6CÞª{\r\u008f\u009d\u0013\u0019S\\·ú\u0014\u0090%YØ\u00002\u0090D\u0096b\u0085\u008f`[Ë4\u0086\u0014\u0010\u0005R!r~Y\u0090\u0086¬\u0087d¯é·\u008a\u0013\u0097g\u008bKW©{\\\r\u0096pn.t\u009aÜ(i7\u0095\u0094eaïù&Æè\u0097*CMª\u0083\u0090\u0081Ú÷Ú%ÕÀÑ áCÃ/ï¢\"j\u0084A³\u0095$"
                              .length();
                           char var5 = 144;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[2];
                                 return;
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

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 13074;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/macros/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                    var10
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0, MutableCallSite var1, String var2, Object[] var3
                        ) {
                           int var4 = (Integer)var3[0];
                           long var5 = (Long)var3[1];
                           String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                           MethodHandle var8 = MethodHandles.constant(String.class, var7);
                           var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                           return var7;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0, String var1, MethodType var2
                        ) {
                           MutableCallSite var3 = new MutableCallSite(var2);

                           try {
                              var3.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
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
                                 "me/octo/client/modules/impl/macros/IIIIlIlllIIllIlllllIlIIlllIllIlIlIIIlIIIIIIlIlIlIlIllllIlIIIIlIIIllIIIIlllIIlIlIlIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     String var23 = var0[5];
                     String var24 = var0[11];
                     String[] var11 = new String[]{
                        var0[12],
                        lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                           .getTargetNames()
                           .get(0),
                        lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                           .getTargetNames()
                           .get(1)
                     };
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var23, var24, var11
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                        var0[6],
                        var0[8],
                        lIlIlIlIlIlIlIIIIlIllIllIlIlIllIllllIlIIIIlIllIllllIllIIIIIIllIlIlllIIIlIllllIlIllIII.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                           .getParentFolderName(),
                        new String[0],
                        0,
                        null,
                        48,
                        null
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting(var0[1], var0[9], true);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var20;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label28;
                  }

                  var5 = "\u0091u\u0088s\u0095£\u001aH´ÿ]\u0003¶\u008eÍdÁ×\u0097R&u\u0092GÞ\u001e¹?X\u008aepR§øÒáº\u009dî\u0014\\¢ÚV]*q\b\u0017\u0082\u0092{}HNV";
                  var7 = "\u0091u\u0088s\u0095£\u001aH´ÿ]\u0003¶\u008eÍdÁ×\u0097R&u\u0092GÞ\u001e¹?X\u008aepR§øÒáº\u009dî\u0014\\¢ÚV]*q\b\u0017\u0082\u0092{}HNV"
                     .length();
                  var4 = '0';
                  var13 = -1;
            }

            var14 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
}
