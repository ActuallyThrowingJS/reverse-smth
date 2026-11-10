package me.octo.client.modules.impl.features.visuals;

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
import kotlin.text.StringsKt;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.utils.render.colors.Color;
import org.jetbrains.annotations.NotNull;

public final class lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII {
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BooleanSetting llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 14966804135413L;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static Map IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap(13);

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0) {
      var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var0;
      long var2 = var0 ^ 107835513699734L;
      return StringsKt.contains$default(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(
            var2
         ),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"l">(4284, 394143361975029369L ^ var0),
         false,
         2,
         null
      );
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param0) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0) {
      var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ var0;
      long var2 = var0 ^ 17230297914254L;
      return StringsKt.contains$default(
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(
            var2
         ),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"l">(22432, 861576395257507706L ^ var0),
         false,
         2,
         null
      );
   }

   static {
      long var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 54490414270482L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[23];
      int var5 = 0;
      String var4 = "¿Å£\u0090ÈP\u001f1é%Ê9à\u000fh×\u00109w\u009f²;äª»t\u0087>}\u001aÇ¬À\u0010h·ürÕÇ9zï\u00180]\u0097@¯%\u00107\u0018\u0002\u001fCÛ e¢iÈ£¦êâç\u0010ªÚZÿ\u00153Y[\"b\u000b1½\u0011e{\u0010\u0097³\u0097TV¡Û\u009f¥µk\u0097ù#s\u0019\u0010Vù¦Òë¥\u0088h Ñy\u0098))§T\u0010|ïCË§ãqEJÓØ\u0011>ì)A\u0010 mËÎh\u0015¢\u0097äËÀhsFc\u008c\u0010\u0007û\u0007\u00878+\u0015L\u001dÁ}ÃE·¥<\u0010tù;<ÍîW®ã\u0003\u008aú^Hê)P\u0086\u0088îâø®À§\u00ad7:ÔÍ&Vh\u001e\u00ad¦\u009eX~¤Ê\u0082\u0010DÚcíÇ®áçÑO£¡3'?Í\u0091{ÿ|û\u0083\u00120K\u0014\t\u0098éR°ß/~$]§Ë\u0004\u0015%\u0084\u0083Ä¼½ä\u009d¯»\u009dù9ä ¥|\u009eÅ:\u0000Hu9Pè\u000f>þÆ®ÚOÈÅºVÀîf0\u000e7\u000fª\u001fû(Ç§#×Ï\u0004ýt[\u008aà½Ö'jå)°GK<ÊW\tñ\u0019`sjBµÐ]\u0080%1Ï£6Á ØQ@\u0017_\u001cç\u0010L\u0019ÎïÙjé·BsRV}íj\u0084Îc/ÃhÃ¡P\u0010mnT\u0002ß:© Óº7K©þ`\u008dxÈ\u00adçW#Á\u008fe\u009bdþÿÕÝåà¶\u00048!)\u0084I\u008b®\u0016Ï\u0083ýïæA9\u0013üð\\Ú÷ä×@6ò\u001anQ¤\u0010\u0089\u0083\b\u0092\u000e)\u0012C§Ag\u000bÇ¾§E^\u0081Nö\u009arúÆ\u000bH\u0003bÿ\u0097Ç\u0092ø2\u0003\u001b$\u0087\u009f\u009dÑg0kÏ\u0014þ¸\u00069¹²O¶êRÀ´IÉÇÊoû÷1\\:aûI\u0018:e>|å\u009f;ÃÓ[sëïÃ\u001f\u0019qZÙ\u0099.ð´-`@\u0096\u0011íñÚyì.³ÕG\"'dÍ\u0012²/g\u001en6±Ó\u001eOo 2ÇY\u009d¯OÛ©Ñó\u008dãtÅ\u0015\u0088¼JÔ}ð¶ïË\u0000\u0017¸ôB7k\u0081}\u0080\u001dM\u0085\u0004§\u0002\u008dîUµ²U\u000b×\u001aY´+~\u0096FI*w5Þa\u008b$l÷¬=(/#\u001f\nQì\u0085 UJ%ô}\tP;öÔ<ß\u0011\u0094\u000e\u001f±¼\u00935M\f\u009eø\u0081¢:A\u0090££\u0012\u0010\róKÅ\u0080´½Í5Ç\u0084%\u0006t@\u0095";
      int var6 = "¿Å£\u0090ÈP\u001f1é%Ê9à\u000fh×\u00109w\u009f²;äª»t\u0087>}\u001aÇ¬À\u0010h·ürÕÇ9zï\u00180]\u0097@¯%\u00107\u0018\u0002\u001fCÛ e¢iÈ£¦êâç\u0010ªÚZÿ\u00153Y[\"b\u000b1½\u0011e{\u0010\u0097³\u0097TV¡Û\u009f¥µk\u0097ù#s\u0019\u0010Vù¦Òë¥\u0088h Ñy\u0098))§T\u0010|ïCË§ãqEJÓØ\u0011>ì)A\u0010 mËÎh\u0015¢\u0097äËÀhsFc\u008c\u0010\u0007û\u0007\u00878+\u0015L\u001dÁ}ÃE·¥<\u0010tù;<ÍîW®ã\u0003\u008aú^Hê)P\u0086\u0088îâø®À§\u00ad7:ÔÍ&Vh\u001e\u00ad¦\u009eX~¤Ê\u0082\u0010DÚcíÇ®áçÑO£¡3'?Í\u0091{ÿ|û\u0083\u00120K\u0014\t\u0098éR°ß/~$]§Ë\u0004\u0015%\u0084\u0083Ä¼½ä\u009d¯»\u009dù9ä ¥|\u009eÅ:\u0000Hu9Pè\u000f>þÆ®ÚOÈÅºVÀîf0\u000e7\u000fª\u001fû(Ç§#×Ï\u0004ýt[\u008aà½Ö'jå)°GK<ÊW\tñ\u0019`sjBµÐ]\u0080%1Ï£6Á ØQ@\u0017_\u001cç\u0010L\u0019ÎïÙjé·BsRV}íj\u0084Îc/ÃhÃ¡P\u0010mnT\u0002ß:© Óº7K©þ`\u008dxÈ\u00adçW#Á\u008fe\u009bdþÿÕÝåà¶\u00048!)\u0084I\u008b®\u0016Ï\u0083ýïæA9\u0013üð\\Ú÷ä×@6ò\u001anQ¤\u0010\u0089\u0083\b\u0092\u000e)\u0012C§Ag\u000bÇ¾§E^\u0081Nö\u009arúÆ\u000bH\u0003bÿ\u0097Ç\u0092ø2\u0003\u001b$\u0087\u009f\u009dÑg0kÏ\u0014þ¸\u00069¹²O¶êRÀ´IÉÇÊoû÷1\\:aûI\u0018:e>|å\u009f;ÃÓ[sëïÃ\u001f\u0019qZÙ\u0099.ð´-`@\u0096\u0011íñÚyì.³ÕG\"'dÍ\u0012²/g\u001en6±Ó\u001eOo 2ÇY\u009d¯OÛ©Ñó\u008dãtÅ\u0015\u0088¼JÔ}ð¶ïË\u0000\u0017¸ôB7k\u0081}\u0080\u001dM\u0085\u0004§\u0002\u008dîUµ²U\u000b×\u001aY´+~\u0096FI*w5Þa\u008b$l÷¬=(/#\u001f\nQì\u0085 UJ%ô}\tP;öÔ<ß\u0011\u0094\u000e\u001f±¼\u00935M\f\u009eø\u0081¢:A\u0090££\u0012\u0010\róKÅ\u0080´½Í5Ç\u0084%\u0006t@\u0095"
         .length();
      char var3 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var13 += var3) >= var6) {
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var7;
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new String[23];
                     String[] var11 = new String[]{"Model", "Box"};
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        "Shape", "Highlight the entity model (accurate) or its bounding box (lighter).", 0, var11
                     );
                     var11 = new String[]{"Glow Outline", "Outline", "Glow", "Filled", "Filled + Outline"};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        "Mode", "ESP visualization mode.", 0, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(
                        "Chams", "See entities through walls.", false
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                        "Default Color",
                        "Color used for entries that don't override it.",
                        Color.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.getColorAsInt()
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        "ESP Range", "Max distance to render ESP.", 10, 200, 50, 5
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 34207237493118L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 93389589121184L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5x = var3x ^ 3054948824528L;
                           return lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(
                              var5x
                           );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 15905965616430L;
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
                           String var6 = "\u007f\u0081\u000e\u009b\u0085Rå\u00ad\u0094\ba\u0098\u0003S\u0019Á\u000e\u009d8Jj\u00149ß(Ù&z±\u0004M»~Æ\\\u008c\u0084y\u008aÕ\u0085´²\u000b¸ä÷B\u000f\u0085\rR\u0093`4Nªè¬0ÑÞ\u008dïâ";
                           int var8 = "\u007f\u0081\u000e\u009b\u0085Rå\u00ad\u0094\ba\u0098\u0003S\u0019Á\u000e\u009d8Jj\u00149ß(Ù&z±\u0004M»~Æ\\\u008c\u0084y\u008aÕ\u0085´²\u000b¸ä÷B\u000f\u0085\rR\u0093`4Nªè¬0ÑÞ\u008dïâ"
                              .length();
                           char var5 = 24;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
                        }

                        private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                           int var1 = 0;
                           int var2;
                           char[] var3x = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3x[var1++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8x = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8x & 63));
                                 var3x[var1++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12 = (char)((char)(var5x & 15) << '\f');
                                 byte var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63) << 6);
                                 var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63));
                                 var3x[var1++] = var12;
                              }
                           }

                           return new String(var3x, 0, var1);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1) {
                           int var5x = var0x ^ (int)(var1 & 32767L) ^ 22254;
                           if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3x = Thread.currentThread().threadId();
                                 var4x = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3x);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3x, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1 >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1 << var7x * 8 >>> 56);
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
                           Lookup var0x, MutableCallSite var1, String var2, Object[] var3x
                        ) {
                           int var4x = (Integer)var3x[0];
                           long var5x = (Long)var3x[1];
                           String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                           var1.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                           return var7x;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1, MethodType var2
                        ) {
                           MutableCallSite var3x = new MutableCallSite(var2);

                           try {
                              var3x.setTarget(
                                 MethodHandles.explicitCastArguments(
                                    MethodHandles.insertArguments(
                                       "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                          .asCollector(Object[].class, var2.parameterCount()),
                                       0,
                                       var0x,
                                       var3x,
                                       var1
                                    ),
                                    var2
                                 )
                              );
                              return var3x;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 109759155845921L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 100915929676263L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = (var3 ^ 23670705728352L) >>> 8;
                           int var7 = (int)((var3 ^ 23670705728352L) << 56 >>> 56);
                           return lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
                              var5, (byte)var7
                           );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 68600992600293L;
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
                           String var6 = "à@¶ÖÄSá\u008fÁj\u008bjø,u\u0086ù\u001b\u0003\u0006zT\u0002ôEUãnwJÀF7+ËÏ\u0084Ä*0 \u001b¨ÈÒ¢\u001cð§úÓQ9·¶\u001c±k\u001dâÐá\u008açIõÚ ñ:\u0018rI";
                           int var8 = "à@¶ÖÄSá\u008fÁj\u008bjø,u\u0086ù\u001b\u0003\u0006zT\u0002ôEUãnwJÀF7+ËÏ\u0084Ä*0 \u001b¨ÈÒ¢\u001cð§úÓQ9·¶\u001c±k\u001dâÐá\u008açIõÚ ñ:\u0018rI"
                              .length();
                           char var5 = '(';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 10965;
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
                                    "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                                 "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 61564613993949L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 126592291756407L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           long var5 = (var3 ^ 23670705728352L) >>> 8;
                           int var7 = (int)((var3 ^ 23670705728352L) << 56 >>> 56);
                           return lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
                              var5, (byte)var7
                           );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 6722275301459L;
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
                           String var6 = " NÁ:\u009eÐ\u0002~\u00005æ:M\u008b/Ò²ÑäxK\u008d\u001b}\u0019\u008aIPÕâl¦¯:Ô \u0096è\u0082\u0014 ì¿J\u0094m\u0096A &Éûø·Þ\u0010'\\'\u008eÜ= d'lÖêsçp\u0099D";
                           int var8 = " NÁ:\u009eÐ\u0002~\u00005æ:M\u008b/Ò²ÑäxK\u008d\u001b}\u0019\u008aIPÕâl¦¯:Ô \u0096è\u0082\u0014 ì¿J\u0094m\u0096A &Éûø·Þ\u0010'\\'\u008eÜ= d'lÖêsçp\u0099D"
                              .length();
                           char var5 = '(';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 8168;
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
                                    "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                                 "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 110744692097759L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 58980707021512L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                           int var5 = (int)((var3 ^ 28646972485668L) >>> 32);
                           long var6 = (var3 ^ 28646972485668L) << 32 >>> 32;
                           return lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(
                              var5, var6
                           );
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 89225434202870L;
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
                           String var6 = "¬'BûÓ Ùh¬ù\u0005='\u0088\u001f<\u0095\u009coÒC ±r(=A\u008d\u0002`>}\u0084âº\u008e?[Ñ\u009ee\u0080\u0090\u009d¡rº\u0083}øó\u007fÖ6Ë\u009cÖ^·ÒßøÿXö";
                           int var8 = "¬'BûÓ Ùh¬ù\u0005='\u0088\u001f<\u0095\u009coÒC ±r(=A\u008d\u0002`>}\u0084âº\u008e?[Ñ\u009ee\u0080\u0090\u009d¡rº\u0083}øó\u007fÖ6Ë\u009cÖ^·ÒßøÿXö"
                              .length();
                           char var5 = 24;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 28367;
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
                                    "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                                 "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BooleanSetting(
                        "Tracers", "Draw a 3D line from camera to each matched entity.", false
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                        private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 139022184546605L;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                        private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                        {
                           long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 131654420635041L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                              .isToggled();
                        }

                        static {
                           long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 128883559664054L;
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
                           String var6 = "\u0016\u0012\u00945%¶ãÝÇ\u009cklW|©KÉ#j?T\u0088\u001bl@\u00adA\u00817¤Ç¼\u001cn3+u»QF\u0018Qáê\\\u001d\u0010)$òÎ\u0080ç4X|?-Èp¯U#bk :\b\u0017d\u009bSOæ~wsz\f\u0087îà«Xì\u00843\u001c\u008e";
                           int var8 = "\u0016\u0012\u00945%¶ãÝÇ\u009cklW|©KÉ#j?T\u0088\u001bl@\u00adA\u00817¤Ç¼\u001cn3+u»QF\u0018Qáê\\\u001d\u0010)$òÎ\u0080ç4X|?-Èp¯U#bk :\b\u0017d\u009bSOæ~wsz\f\u0087îà«Xì\u00843\u001c\u008e"
                              .length();
                           char var5 = 24;
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
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
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 971;
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
                                    "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                                 "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "\u000fã\bÈ\f©-\tÕ\u008dâ1`u\u0082k}£c°ßO·\u009a\u0018OL\u0000(÷Á\u009d4?â}Ö\u0005ãë\u0003ï\u0018\u0095\u0081\u001fz0.Æ½dÁò>\u00978\u000e\u0092\u0091\u008cAí\u008dþ¶£D,·6\u0096\u0081fb\u009eÎ\r°¬-ÁJ®\u0085)&\u0090È&·oÚ\u008c<\u0005\u0017¹tpå\u0086ÿã\u0005^½\u001d\u0006ÇÝÏW";
                  var6 = "\u000fã\bÈ\f©-\tÕ\u008dâ1`u\u0082k}£c°ßO·\u009a\u0018OL\u0000(÷Á\u009d4?â}Ö\u0005ãë\u0003ï\u0018\u0095\u0081\u001fz0.Æ½dÁò>\u00978\u000e\u0092\u0091\u008cAí\u008dþ¶£D,·6\u0096\u0081fb\u009eÎ\r°¬-ÁJ®\u0085)&\u0090È&·oÚ\u008c<\u0005\u0017¹tpå\u0086ÿã\u0005^½\u001d\u0006ÇÝÏW"
                     .length();
                  var3 = '8';
                  var13 = -1;
            }

            var15 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26339;
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII", var10
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
         byte[] var9 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5].getBytes("ISO-8859-1");
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5];
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
         throw new RuntimeException(
            "me/octo/client/modules/impl/features/visuals/lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
