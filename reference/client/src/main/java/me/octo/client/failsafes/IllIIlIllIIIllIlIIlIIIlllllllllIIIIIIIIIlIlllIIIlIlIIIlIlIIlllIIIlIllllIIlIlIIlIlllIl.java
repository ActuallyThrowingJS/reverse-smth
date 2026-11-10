package me.octo.client.failsafes;

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
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl {
   @NotNull
   public static IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BooleanSetting llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static BooleanSetting lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

   private IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl() {
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final BooleanSetting IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final BooleanSetting IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   static {
      long var9 = 45353112458443L ^ 80555474239209L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[16];
      int var6 = 0;
      String var5 = "î\u0019?\u0094ÒÁËÃÃ!\u0084\u0012×GÌTÂFû\t\u0003\u0000$é\u0015\u001b\u0004«½\u0016i3`g\t°\u0002åBü\u0010²\u0093\u009fÇ6\u0099Yf,9?Öê£¯Ë0Õÿ\u001b±\u0097\u0090 ä2\u0013ÿÜÆ!ê\u0099,=ß%\u0095Zµ\u0094±]\u0086¶ÝLµ7Ipl2§³Ózôs\r\u009e\u000bÃÞ\u0016\b¤\u0005\u0084{°Äüq\bXi\u0011ÿCº\u0016\b\u0018:\u0089¨¥\u001a=^F6Ò@)TmîH\u009f\u0003\u009dÎÝA£ÿ\bñ§À\u0019é\u0007\u0001\u00828¤UA\u0088¨à×,\u00184'©\u000bØ\u0002\u008a%\u0086DeI®-¾\u0015ÛÖ\u0094\u0097BøoF\u00ad\u009bZ\u0083$+Í\u009feÚ\u0098R$F`ö<öÇ$\u0082\u0091E\b¤\u0005\u0084{°Äüq\u00188\u0001þ¿Û\u00adê\u0092vóà\u0005\n\u0000\u0013ÕÂ\u0015M4È</U8\u008dSËä;ù\u001bÉ\u001b~\u0084\u0006\u000eoUÆ\u0083Ì5,ÊNù\b.\r¼Sø\u0098Z£õÆ\u0080^\u0000\u0089$B\u0094ÌÌG>¶aþ³\u000b\u0007jìS\u0018É\bp pD»ü\\.\bp pD»ü\\.\bñ§À\u0019é\u0007\u0001\u0082";
      int var7 = "î\u0019?\u0094ÒÁËÃÃ!\u0084\u0012×GÌTÂFû\t\u0003\u0000$é\u0015\u001b\u0004«½\u0016i3`g\t°\u0002åBü\u0010²\u0093\u009fÇ6\u0099Yf,9?Öê£¯Ë0Õÿ\u001b±\u0097\u0090 ä2\u0013ÿÜÆ!ê\u0099,=ß%\u0095Zµ\u0094±]\u0086¶ÝLµ7Ipl2§³Ózôs\r\u009e\u000bÃÞ\u0016\b¤\u0005\u0084{°Äüq\bXi\u0011ÿCº\u0016\b\u0018:\u0089¨¥\u001a=^F6Ò@)TmîH\u009f\u0003\u009dÎÝA£ÿ\bñ§À\u0019é\u0007\u0001\u00828¤UA\u0088¨à×,\u00184'©\u000bØ\u0002\u008a%\u0086DeI®-¾\u0015ÛÖ\u0094\u0097BøoF\u00ad\u009bZ\u0083$+Í\u009feÚ\u0098R$F`ö<öÇ$\u0082\u0091E\b¤\u0005\u0084{°Äüq\u00188\u0001þ¿Û\u00adê\u0092vóà\u0005\n\u0000\u0013ÕÂ\u0015M4È</U8\u008dSËä;ù\u001bÉ\u001b~\u0084\u0006\u000eoUÆ\u0083Ì5,ÊNù\b.\r¼Sø\u0098Z£õÆ\u0080^\u0000\u0089$B\u0094ÌÌG>¶aþ³\u000b\u0007jìS\u0018É\bp pD»ü\\.\bp pD»ü\\.\bñ§À\u0019é\u0007\u0001\u0082"
         .length();
      char var4 = '(';
      int var14 = -1;

      label28:
      while (true) {
         String var18 = var5.substring(++var14, var14 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var18.getBytes("ISO-8859-1"));
            String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var24;
                  if ((var14 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl();
                     String var27 = var0[9];
                     String var29 = var0[0];
                     String[] var11 = new String[]{var0[14], var0[4]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var27, var29, 1, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 77198388038464L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 64097945886787L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5x = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"x">(3817, 2257453275394157538L ^ var3),
                                 var5x
                              );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 91932751845145L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "?<,~>\u0096L£l|ÿ\u009a8Æ^3z&\tFÃ\u00923\u0091ÍÌb¼2áýE\u0087Ã$|]\u001c\u009d÷íÏÛÃä\u007f\u0087ÒÜ>mckTO\u0000KjUfªz \u008d2\u0013ü\u0014êpýL \u0016Í[²\u0004´´õ\u009b7pÉ\u0001\f K\u0004¥¦\u009eí¶\u0010\u009bÄFn}\u001bÂ¤ë0\u0096\"\u0081~ð\u0097\u0091\u0088îuÈÿg4\u0080StNyðþ\u008bÀ¾\u0011\u009c\u008bo\u0014Es¸\u008aî\u0003¢Á\u008a¯ÑÆ§qF\nH¬?";
                           int var8 = "?<,~>\u0096L£l|ÿ\u009a8Æ^3z&\tFÃ\u00923\u0091ÍÌb¼2áýE\u0087Ã$|]\u001c\u009d÷íÏÛÃä\u007f\u0087ÒÜ>mckTO\u0000KjUfªz \u008d2\u0013ü\u0014êpýL \u0016Í[²\u0004´´õ\u009b7pÉ\u0001\f K\u0004¥¦\u009eí¶\u0010\u009bÄFn}\u001bÂ¤ë0\u0096\"\u0081~ð\u0097\u0091\u0088îuÈÿg4\u0080StNyðþ\u008bÀ¾\u0011\u009c\u008bo\u0014Es¸\u008aî\u0003¢Á\u008a¯ÑÆ§qF\nH¬?"
                              .length();
                           char var5 = 'H';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5x = var0x ^ (int)(var1x & 32767L) ^ 20347;
                           if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4x = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1x >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                              }

                              DESKeySpec var11x = new DESKeySpec(var6x);
                              SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11x);
                              ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                              byte[] var9x = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x]
                                 .getBytes("ISO-8859-1");
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9x)
                              );
                           }

                           return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x];
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                    + " : "
                                    + var1x
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 6535435917151L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 27183008289725L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"k">(15522, 3920308141538425201L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 99403843183029L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "\u0087)åÀï3A\u007fÒá×Ë¡O\u0087½£)\u0096ûT\u001cæÌÞ²{\u0012]\u0010)¨\u0095\u001c&^S~ü\u0099õÁb\rÙu¡çP¨ûÃ?b8î¸>Oo»7\u0005£Ýß¦p¿\u0006¬sP]MªeâÈÂØ\u0006\u008fæ\u0098ar¼|Çú¬~\u0011}UÛl¶è\u001c2ÜÁÆ9c?`ReÛl½ÎñÍ*\u000e\u001c\f±k]\u0080W[+X @\u0082\u009faº\u009fu¬÷]¸Öº'uËþ\u0087vC3ÇC²\u0001µ\u0000\u0012ì\u008eÚ+";
                           int var8 = "\u0087)åÀï3A\u007fÒá×Ë¡O\u0087½£)\u0096ûT\u001cæÌÞ²{\u0012]\u0010)¨\u0095\u001c&^S~ü\u0099õÁb\rÙu¡çP¨ûÃ?b8î¸>Oo»7\u0005£Ýß¦p¿\u0006¬sP]MªeâÈÂØ\u0006\u008fæ\u0098ar¼|Çú¬~\u0011}UÛl¶è\u001c2ÜÁÆ9c?`ReÛl½ÎñÍ*\u000e\u001c\f±k]\u0080W[+X @\u0082\u009faº\u009fu¬÷]¸Öº'uËþ\u0087vC3ÇC²\u0001µ\u0000\u0012ì\u008eÚ+"
                              .length();
                           char var5 = '0';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 28576;
                           if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                              byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 35657264967522L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 6458162462180L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"b">(32497, 8053966717044691388L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 16192305871481L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "\u0097 ´-T\u0007ÅÉEU\\T\u0006¤¸¹\u0003DöÒï¨YåÔÃi\u0007Å{ÿ\u009c\u0018\u0007¶Å\u008a\u0007;\u0087g\u0016<ËÓ¢å\u0011¾\u0018\u0091´\u009eC\u0085&\u001eh÷\t\u0017\u0095¡ï£)'\t\u009c¡ôØ\u007fê)\u0000\u0088¢UÄËè\u0003Ì\u0001qõ!î7Êû\u008cQa\u0086¥{\u00845\u0016×¢Áë\u000b´X43À\u0093 9rµ\u009exÿÃAÃY\u0007\u009d<akR¬Ôªí^ \u0013ÖB80\u009dÄ\u00995w0?Ë\u0095\u009b\r\"ó\u0080}òÙ¹²\u008e\u0092\u001d";
                           int var8 = "\u0097 ´-T\u0007ÅÉEU\\T\u0006¤¸¹\u0003DöÒï¨YåÔÃi\u0007Å{ÿ\u009c\u0018\u0007¶Å\u008a\u0007;\u0087g\u0016<ËÓ¢å\u0011¾\u0018\u0091´\u009eC\u0085&\u001eh÷\t\u0017\u0095¡ï£)'\t\u009c¡ôØ\u007fê)\u0000\u0088¢UÄËè\u0003Ì\u0001qõ!î7Êû\u008cQa\u0086¥{\u00845\u0016×¢Áë\u000b´X43À\u0093 9rµ\u009exÿÃAÃY\u0007\u009d<akR¬Ôªí^ \u0013ÖB80\u009dÄ\u00995w0?Ë\u0095\u009b\r\"ó\u0080}òÙ¹²\u008e\u0092\u001d"
                              .length();
                           char var5 = ' ';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 1341;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                              byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     String[] var12 = new String[]{var0[11], var0[6], var0[3]};
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var12
                     ) {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 65142970889043L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 84528409175419L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(24812, 5671567376294795724L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 95428549241204L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "Ï)Õ\u008ca\u0087\u0017aÒÜ2ò£#kÃö3\u001c!¢\u0018lº\u001c~öÀ\u0081_- î¹Kqu_\u000b9Û\u0000dû\u0095ÄväH'\u0014\\S \u0000`\u000e5]¢b\u0099ðpç²\u009e_\u0088O\u001d\u0089\u0095\u0094§-?j¬\u008am0\u0003\u007f§m]ëZL\\$úÏ¹=èû[n\u0080yá\n1z÷°¸z\u0017/sÈ\u0091\u0000ÛB4i3\u0010\u0004/\u0005S¨S^w9Üy+:\u008f\u0096t";
                           int var8 = "Ï)Õ\u008ca\u0087\u0017aÒÜ2ò£#kÃö3\u001c!¢\u0018lº\u001c~öÀ\u0081_- î¹Kqu_\u000b9Û\u0000dû\u0095ÄväH'\u0014\\S \u0000`\u000e5]¢b\u0099ðpç²\u009e_\u0088O\u001d\u0089\u0095\u0094§-?j¬\u008am0\u0003\u007f§m]ëZL\\$úÏ¹=èû[n\u0080yá\n1z÷°¸z\u0017/sÈ\u0091\u0000ÛB4i3\u0010\u0004/\u0005S¨S^w9Üy+:\u008f\u0096t"
                              .length();
                           char var5 = '0';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 21331;
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
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     var12 = new String[]{var0[12], var0[13], var0[8]};
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var12
                     ) {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 4435973509333L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 91691425868849L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"t">(17714, 3927612731604320794L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 136623019963184L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "þKâs³s\u008c£\u0082è$â\u0012Ì\u00ad\u00988Rä×îÊ\u0090#Åq¢5ö¥,P\u0007\u0002]ÏQªÆÎB\u0092\u0012Û\u001b5 N:É\u0090ª½¼2þ\u009d à,u\u0019Gê: \u0096\u000e·®Ï_ÌPýt\u008d³\b\u0089\u0080ä±\u009a\u0018\u0086\u009c\t¤áNùMÓM\u009bZFÈ\u0094_að±»\u008eª\u009a%V[txFBÈ¨{\u001aìo\u0081ýÏ\u001f\u0088/Î£TÉ§>\u001eä@*)ö»ß¿\u0092z\u000f\u0012\u000eµ\u0000#Ö\u009e\u007fß";
                           int var8 = "þKâs³s\u008c£\u0082è$â\u0012Ì\u00ad\u00988Rä×îÊ\u0090#Åq¢5ö¥,P\u0007\u0002]ÏQªÆÎB\u0092\u0012Û\u001b5 N:É\u0090ª½¼2þ\u009d à,u\u0019Gê: \u0096\u000e·®Ï_ÌPýt\u008d³\b\u0089\u0080ä±\u009a\u0018\u0086\u009c\t¤áNùMÓM\u009bZFÈ\u0094_að±»\u008eª\u009a%V[txFBÈ¨{\u001aìo\u0081ýÏ\u001f\u0088/Î£TÉ§>\u001eä@*)ö»ß¿\u0092z\u000f\u0012\u000eµ\u0000#Ö\u009e\u007fß"
                              .length();
                           char var5 = 16;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 27993;
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
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     var12 = new String[]{var0[12], var0[13], var0[8]};
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var12
                     ) {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 2788444802451L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 136016610969041L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = var3 ^ 10302949456856L;
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                                 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"i">(24884, 5990940012086875468L ^ var3),
                                 var5
                              );
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 101889624019898L;
                           Cipher var2;
                           Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                           SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                           byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                           for (int var3 = 1; var3 < 8; var3++) {
                              var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                           }

                           var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                           String[] var9 = new String[3];
                           int var7 = 0;
                           String var6 = "\u001f»¾\u0085ÎX%\u009d°ANÌ\u0004T¥¶@\u0017è\u0099NÄFµ\u001e)ô©aÚ\u0015]\u0091_\u008féP\u00896\u008dÃàÏÙ\u001aL\u00929¶#\u0012Õ#\u0017ÄtX\u008dô!\u0084X¥\u0090¬jã±X\u008b\u008f\u0086ê\u009dë\u008d¶I8½\u0092(¶ù³Üq\"i\u0004\u0002sð\u0004sx®3üàMÔ\u0001\u001dP¿v¹\f\u0011Â\rôqoö^\u0089\u008cÅ¸A";
                           int var8 = "\u001f»¾\u0085ÎX%\u009d°ANÌ\u0004T¥¶@\u0017è\u0099NÄFµ\u001e)ô©aÚ\u0015]\u0091_\u008féP\u00896\u008dÃàÏÙ\u001aL\u00929¶#\u0012Õ#\u0017ÄtX\u008dô!\u0084X¥\u0090¬jã±X\u008b\u008f\u0086ê\u009dë\u008d¶I8½\u0092(¶ù³Üq\"i\u0004\u0002sð\u0004sx®3üàMÔ\u0001\u001dP¿v¹\f\u0011Â\rôqoö^\u0089\u008cÅ¸A"
                              .length();
                           char var5 = 16;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                                 llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[3];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 24073;
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
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting(var0[15], var0[10], false);
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 7385763295077L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 120066525698849L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 85732270311144L;
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
                           String var6 = ";Où©í8jQN;6#\u0084\u009aÿ±|MÅx\u009b\u009aäü\u009d\u0015s\f\u0081\u0010PFÚ\u0093º\u008aß\u0086\u0087;YÆ3à\u001eûïÜ=Ïºä\u009aÿ<çhÒbõ\u007feÊ¤\u001c¬ZjÔ\u0093\\\u0017\u0015\u0093§ ÝF\u0095³\u0002/áÚ¯9äô\u009fìö\u000e·\u0091â\u0095¯\u0018½ `í\u0093¼\fE2¾\u001c\u009f'¬Y\u008d\u0017¹\u0001\u0006ésZ\u00ad\u00adc\u0006ªü\u0097©®Ö`VÛÿ\u0097ø©$û\u0005ym\u008d&\fqv\u008f\u0011ÖÎÊËJ¿^Zº\u0098Î";
                           int var8 = ";Où©í8jQN;6#\u0084\u009aÿ±|MÅx\u009b\u009aäü\u009d\u0015s\f\u0081\u0010PFÚ\u0093º\u008aß\u0086\u0087;YÆ3à\u001eûïÜ=Ïºä\u009aÿ<çhÒbõ\u007feÊ¤\u001c¬ZjÔ\u0093\\\u0017\u0015\u0093§ ÝF\u0095³\u0002/áÚ¯9äô\u009fìö\u000e·\u0091â\u0095¯\u0018½ `í\u0093¼\fE2¾\u001c\u009f'¬Y\u008d\u0017¹\u0001\u0006ésZ\u00ad\u00adc\u0006ªü\u0097©®Ö`VÛÿ\u0097ø©$û\u0005ym\u008d&\fqv\u008f\u0011ÖÎÊËJ¿^Zº\u0098Î"
                              .length();
                           char var5 = '8';
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 15812;
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
                                    "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                                 "me/octo/client/failsafes/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new BooleanSetting(var0[5], var0[7], true);
                     String var28 = var0[1];
                     String var30 = var0[2];
                     var11 = new String[]{var0[12], var0[13], var0[8]};
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var28, var30, 2, var11
                     );
                     return;
                  }

                  var4 = var5.charAt(var14);
                  break;
               default:
                  var0[var6++] = var24;
                  if ((var14 += var4) < var7) {
                     var4 = var5.charAt(var14);
                     continue label28;
                  }

                  var5 = "(\u0081\u009a\u0083\u0093\u0007$TZWáu\u0091\u009aH>\u0018ÞÜ2fè\u009f}\u008f\u0082\u009d\nôß\u0099\u009fP\u0085\u008d\u0015Ü\u0092º\u0099â";
                  var7 = "(\u0081\u009a\u0083\u0093\u0007$TZWáu\u0091\u009aH>\u0018ÞÜ2fè\u009f}\u008f\u0082\u009d\nôß\u0099\u009fP\u0085\u008d\u0015Ü\u0092º\u0099â"
                     .length();
                  var4 = 16;
                  var14 = -1;
            }

            var18 = var5.substring(++var14, var14 + var4);
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
