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
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.endgameGUI.IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.modules.impl.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI;
import me.octo.client.gui.clickgui.modules.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import me.octo.client.modules.impl.features.hud.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.shapes.NVGRenderer;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class GeneralModules {
   @NotNull
   public static GeneralModules.Companion Companion;
   @NotNull
   private static me.octo.client.gui.clickgui.modules.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.modules.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.modules.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.modules.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static me.octo.client.gui.clickgui.modules.impl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static BooleanModule IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static BooleanModule lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static BooleanSetting IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static BooleanSetting llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static BooleanSetting lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static BooleanSetting lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static BooleanModule lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;

   static {
      long var9 = 25275382601039L ^ 114490561450958L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[41];
      int var6 = 0;
      String var5 = "£\u0092SQ\u0014\u000fZ\u0098\u0010eKªª±/î\u008e\n¤Ö\u008fb°%Ü(RBÁÔpýS&\u0089\tVæ®ö\"\u007fò\u009b°%1¬[ÎêwÝ\u0080'\u008fßYoK\u009cNîf\u009b¯\u0018ÎR\u0018\u008byäYµWØë×µC\u008dm:èâ\u0099}þ\u007fß\bÂýí\u0093ÃkBÌ8_$]\u0001Vð=\u008c\u0088\u000e\u001fd\r<\u0013KÛý\u0012Wç\u0090x\u009ba|/pW?<,W¿[Ù)w³\u001aö¿\u0096#£á<\tãÜ\u001fj y\u0015@\u0010RBÁÔpýS&\u009bÊó\u001b¥\u0002\u0001¯\bõ§\u0084äS~\u0080\u009f\b.ÂiÔ\u000bÌ\u0093]\bAR\u00971¦D¡\u001dX_$]\u0001Vð=\u008cú@Ù\u0098.×ZF&\u008cæ\u0087Õ¦0¶MT\u0081\u0012\"ºö_\u0099%\u0001é½;×Dé\u0088j\u00969\u007fÅ\u001by\u0011\u009e/\u0089Ü=7\u001bM:\u0087=\u0088º÷÷7\u001b\u000b#Z8|ìÐz»sµl\u001dÜV¥\u001eLKüÁ\u0018J\"Þ¦È;jc9ç\"O\u0004\u00126²\u008b\u000b\u000eXã1ôa\u0088RBÁÔpýS&½J7ð\u0010w Üú2\\Ãâî±Ó}%ÓFÔÏµ\u0090.]ÞP.Ã\u0083æ=\u0088Ë?b\u00ad\u000fª¤úx*´\u008c\u001bÙUK²ûv¹ùSIÂÁ(\u0081\u0083\u009b\u001dr\rþk·\u001d|(?\u009f·\u00147f*\u0017\u001bEF\u0088ÅBÁÐ\u009d&\u0098ý¸È!¡'øéY\rÖ×á%!C\ra9\u0006\u0099oåU\u0088K\u009d*ÝX(Na\"Zû2\u0010l[\u008b³¾\u008eíùÏ±!µÝÛÚf\b¡5(\u001a·\u009cÁ\u001a\bOmQ\u0088ºi\"´\b.ÂiÔ\u000bÌ\u0093]\bóZÕ,\u0017½ìr\b\u0003\u000b¹ùÓ\u0015T\u0087\b)]6æ)½¶^\bAR\u00971¦D¡\u001d\u0010¤y\u008eÏ/Ê»Þ-\bÐÏÂT¬à(\u009bì3;\u00adõàAØÐjhÂÐõìêç^\u000f\u0013úþ\u000f&cÔ\u0003\u0010~uñ0\u000e>%\u000fL\n°@RBÁÔpýS&¿\u009e7\u0005\u0084XÀ%°bú\u008cU0Ç*¹ç·O¥\u0015C¾\u0088ß\rÜ}Á\u009c\u0086Ô\u00841[Ê\u0087!(\u008d\u0015Ç©sê*±ñÎyá\u0090¹\u001dÀX±¤&ñÄýBÝ\u0095®p\u0014f$\u0094d8ëú#k?\u0015\u0091¢sFÍª\u001c\n\u009cËæ¦Wô\"z;\u0005\t\u007f\u008b\ng\u000eåÜtMãÛ+9Þ\u0090\nn\u008f\u00045wn\u0006x¾Z¨]g_yö\u0092\u0017\u0012N\u001b|º~zL\u000fÃ-\u001a RBÁÔpýS&\u0089\tVæ®ö\"\u007f¶&\u009bC\n\u0002r\u0001¢Ð4:©\u000f\u009f\u0091 »@Ô¹U+dO=&×qHÆöÝ!,\u009b)D\u009c\u0089|\u009b¼©\u000f\u0091ç\rm\b\u0011»ºðõþB\u0011\u0018©¨b\u001dI\u001fÊ\u0014¿j&ÖD·Þq\u009cÍ¼\u0098Úð)% \u009bì3;\u00adõàAæc\u0099¼\u0003K\u0000¡U\u0016#\u0004\u009e¼\u001d¾%\u009b\u0002kä@tÛ\b&\u0098Ãj\u007fTjV é7f\u008aõ2XÑ\u008cð¶\u009e62éÍt¤\u0093bÈÌ\u008eí»è\u0002\u0085[\u008fÿf(RBÁÔpýS&\u0089\tVæ®ö\"\u007f>r¯\u0082\f\u0089,!IPÝßiG\u0016NM\u008c-Å-\u0085\u0014n\u0010Ýheg\t9j ñý·°\u0081e\u001f'\u0018>Ú\rüf\u000eUÂI6\u0006áI»\u001aa+\u0081jÈ\u0099cg\u0088\b\u0006´MÍ\u009c´«y\b\u0003\u000b¹ùÓ\u0015T\u0087\b\u000eüæ0Ú\u0080!ä\b\u0095{¶ìï8\u0014Ó";
      int var7 = "£\u0092SQ\u0014\u000fZ\u0098\u0010eKªª±/î\u008e\n¤Ö\u008fb°%Ü(RBÁÔpýS&\u0089\tVæ®ö\"\u007fò\u009b°%1¬[ÎêwÝ\u0080'\u008fßYoK\u009cNîf\u009b¯\u0018ÎR\u0018\u008byäYµWØë×µC\u008dm:èâ\u0099}þ\u007fß\bÂýí\u0093ÃkBÌ8_$]\u0001Vð=\u008c\u0088\u000e\u001fd\r<\u0013KÛý\u0012Wç\u0090x\u009ba|/pW?<,W¿[Ù)w³\u001aö¿\u0096#£á<\tãÜ\u001fj y\u0015@\u0010RBÁÔpýS&\u009bÊó\u001b¥\u0002\u0001¯\bõ§\u0084äS~\u0080\u009f\b.ÂiÔ\u000bÌ\u0093]\bAR\u00971¦D¡\u001dX_$]\u0001Vð=\u008cú@Ù\u0098.×ZF&\u008cæ\u0087Õ¦0¶MT\u0081\u0012\"ºö_\u0099%\u0001é½;×Dé\u0088j\u00969\u007fÅ\u001by\u0011\u009e/\u0089Ü=7\u001bM:\u0087=\u0088º÷÷7\u001b\u000b#Z8|ìÐz»sµl\u001dÜV¥\u001eLKüÁ\u0018J\"Þ¦È;jc9ç\"O\u0004\u00126²\u008b\u000b\u000eXã1ôa\u0088RBÁÔpýS&½J7ð\u0010w Üú2\\Ãâî±Ó}%ÓFÔÏµ\u0090.]ÞP.Ã\u0083æ=\u0088Ë?b\u00ad\u000fª¤úx*´\u008c\u001bÙUK²ûv¹ùSIÂÁ(\u0081\u0083\u009b\u001dr\rþk·\u001d|(?\u009f·\u00147f*\u0017\u001bEF\u0088ÅBÁÐ\u009d&\u0098ý¸È!¡'øéY\rÖ×á%!C\ra9\u0006\u0099oåU\u0088K\u009d*ÝX(Na\"Zû2\u0010l[\u008b³¾\u008eíùÏ±!µÝÛÚf\b¡5(\u001a·\u009cÁ\u001a\bOmQ\u0088ºi\"´\b.ÂiÔ\u000bÌ\u0093]\bóZÕ,\u0017½ìr\b\u0003\u000b¹ùÓ\u0015T\u0087\b)]6æ)½¶^\bAR\u00971¦D¡\u001d\u0010¤y\u008eÏ/Ê»Þ-\bÐÏÂT¬à(\u009bì3;\u00adõàAØÐjhÂÐõìêç^\u000f\u0013úþ\u000f&cÔ\u0003\u0010~uñ0\u000e>%\u000fL\n°@RBÁÔpýS&¿\u009e7\u0005\u0084XÀ%°bú\u008cU0Ç*¹ç·O¥\u0015C¾\u0088ß\rÜ}Á\u009c\u0086Ô\u00841[Ê\u0087!(\u008d\u0015Ç©sê*±ñÎyá\u0090¹\u001dÀX±¤&ñÄýBÝ\u0095®p\u0014f$\u0094d8ëú#k?\u0015\u0091¢sFÍª\u001c\n\u009cËæ¦Wô\"z;\u0005\t\u007f\u008b\ng\u000eåÜtMãÛ+9Þ\u0090\nn\u008f\u00045wn\u0006x¾Z¨]g_yö\u0092\u0017\u0012N\u001b|º~zL\u000fÃ-\u001a RBÁÔpýS&\u0089\tVæ®ö\"\u007f¶&\u009bC\n\u0002r\u0001¢Ð4:©\u000f\u009f\u0091 »@Ô¹U+dO=&×qHÆöÝ!,\u009b)D\u009c\u0089|\u009b¼©\u000f\u0091ç\rm\b\u0011»ºðõþB\u0011\u0018©¨b\u001dI\u001fÊ\u0014¿j&ÖD·Þq\u009cÍ¼\u0098Úð)% \u009bì3;\u00adõàAæc\u0099¼\u0003K\u0000¡U\u0016#\u0004\u009e¼\u001d¾%\u009b\u0002kä@tÛ\b&\u0098Ãj\u007fTjV é7f\u008aõ2XÑ\u008cð¶\u009e62éÍt¤\u0093bÈÌ\u008eí»è\u0002\u0085[\u008fÿf(RBÁÔpýS&\u0089\tVæ®ö\"\u007f>r¯\u0082\f\u0089,!IPÝßiG\u0016NM\u008c-Å-\u0085\u0014n\u0010Ýheg\t9j ñý·°\u0081e\u001f'\u0018>Ú\rüf\u000eUÂI6\u0006áI»\u001aa+\u0081jÈ\u0099cg\u0088\b\u0006´MÍ\u009c´«y\b\u0003\u000b¹ùÓ\u0015T\u0087\b\u000eüæ0Ú\u0080!ä\b\u0095{¶ìï8\u0014Ó"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var28 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var28;
         if ((var3 += var4) >= var7) {
            var5 = "mpó\u0002\\~°ï¸}f¤åò\u0094fp¢þm¶;\u0013pþ\u001f¸\u0014\u0083\u000ek`\"v#ÔìÅ Á\u001cñ\u0097\r¬á\u0080Ì¯¶h©+â¾ËË¢o®\u00ad&?s\u008a»Ñ\u0086 Ë-:\u0086\u009a\u0080zªØ\u0083è\u009c¥´\u0086HGØö\u0080\u0095J¢Aw9KÄ\u0093-JbBøµ\u0015UâêÌ\u0016àD\u0002'Æ[PD\u008e\u001e\u001d\u001bÑ©!Æ;¥í";
            var7 = "mpó\u0002\\~°ï¸}f¤åò\u0094fp¢þm¶;\u0013pþ\u001f¸\u0014\u0083\u000ek`\"v#ÔìÅ Á\u001cñ\u0097\r¬á\u0080Ì¯¶h©+â¾ËË¢o®\u00ad&?s\u008a»Ñ\u0086 Ë-:\u0086\u009a\u0080zªØ\u0083è\u009c¥´\u0086HGØö\u0080\u0095J¢Aw9KÄ\u0093-JbBøµ\u0015UâêÌ\u0016àD\u0002'Æ[PD\u008e\u001e\u001d\u001bÑ©!Æ;¥í"
               .length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var30 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var26 = false;
               var0[var6++] = var30;
               if ((var3 += var4) >= var7) {
                  Companion = new GeneralModules.Companion(null);
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new me.octo.client.gui.clickgui.modules.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl(
                     var0[8], var0[22], ModuleCategory.GENERAL, var0[16], 1, 1
                  );
                  String var32 = var0[11];
                  String var35 = var0[29];
                  ModuleCategory var10004 = ModuleCategory.GENERAL;
                  String var10005 = var0[16];
                  String[] var11 = new String[]{var0[38], var0[15], var0[4], var0[37], var0[30], var0[14]};
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.modules.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var32, var35, var10004, var10005, var11, 0, 2
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.modules.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
                     var0[1], var0[40], ModuleCategory.GENERAL, var0[18], var0[27], 5
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
                     var0[13], var0[26], ModuleCategory.GENERAL, var0[36], 0.0F, 1.0F, 1.0F, 0.05F, 2, 4
                  );
                  ModuleCategory var20 = ModuleCategory.GENERAL;
                  Setting[] var12 = new Setting[0];
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.modules.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll(
                     var20, var12
                  ) {
                     private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 77411071534038L;
                     private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     private static Map IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashMap(13);

                     {
                        long var3x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 73478277817902L;
                     }

                     @Override
                     public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var1) {
                     }

                     @Override
                     public void IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl() {
                     }

                     @Override
                     public void IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(long var1) {
                        Minecraft.getInstance()
                           .execute(<unrepresentable>::lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII);
                     }

                     private static final void lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII() {
                        Minecraft.getInstance().setScreen(new IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl());
                     }

                     static {
                        long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 113024685753650L;
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
                        String var6 = "\u0000ï\u009e\u000eãF\u00ad&Áe¶\u0093à\u009aw4ÙzêXNOüt\u009a®}¹_¾#\u00017¥¾ál\u000b\u008c\u000e\u00adÄB¥|Ó\u0089=$J\u001c tÞ\u008cË\u0018õ\u009a\u0085´ZG7ñ\n¤«{VJ|l®¬Nþø·ÝÒ\u0010c\u001f\u0081@\u0095x«H\u008e\u001dÆ!]BMÝ";
                        int var8 = "\u0000ï\u009e\u000eãF\u00ad&Áe¶\u0093à\u009aw4ÙzêXNOüt\u009a®}¹_¾#\u00017¥¾ál\u000b\u008c\u000e\u00adÄB¥|Ó\u0089=$J\u001c tÞ\u008cË\u0018õ\u009a\u0085´ZG7ñ\n¤«{VJ|l®¬Nþø·ÝÒ\u0010c\u001f\u0081@\u0095x«H\u008e\u001dÆ!]BMÝ"
                           .length();
                        char var5 = '8';
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

                     private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                        int var1x = 0;
                        int var2;
                        char[] var3x = new char[var2 = var0x.length];

                        for (int var4x = 0; var4x < var2; var4x++) {
                           int var5x;
                           if ((var5x = 255 & var0x[var4x]) < 192) {
                              var3x[var1x++] = (char)var5x;
                           } else if (var5x < 224) {
                              char var6x = (char)((char)(var5x & 31) << 6);
                              byte var8x = var0x[++var4x];
                              var6x = (char)(var6x | (char)(var8x & 63));
                              var3x[var1x++] = var6x;
                           } else if (var4x < var2 - 2) {
                              char var12x = (char)((char)(var5x & 15) << '\f');
                              byte var9x = var0x[++var4x];
                              var12x = (char)(var12x | (char)(var9x & 63) << 6);
                              var9x = var0x[++var4x];
                              var12x = (char)(var12x | (char)(var9x & 63));
                              var3x[var1x++] = var12x;
                           }
                        }

                        return new String(var3x, 0, var1x);
                     }

                     private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0x, long var1x) {
                        int var5x = var0x ^ (int)(var1x & 32767L) ^ 8717;
                        if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                           Object[] var4x;
                           try {
                              Long var3x = Thread.currentThread().threadId();
                              var4x = (Object[])IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(var3x);
                              if (var4x == null) {
                                 var4x = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.put(var3x, var4x);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/GeneralModules$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                           byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9x)
                           );
                        }

                        return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                     ) {
                        int var4x = (Integer)var3x[0];
                        long var5x = (Long)var3x[1];
                        String var7x = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4x, var5x);
                        MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                        var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                        return var7x;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, String var1x, MethodType var2
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
                                    var1x
                                 ),
                                 var2
                              )
                           );
                           return var3x;
                        } catch (Exception var5x) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/GeneralModules$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                 + " : "
                                 + var1x
                                 + " : "
                                 + var2.toString(),
                              var5x
                           );
                        }
                     }
                  };
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.modules.impl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(
                     var0[33], var0[31], ModuleCategory.GENERAL, var0[9], 75, 125, 100, 5
                  );
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanModule(
                     var0[34], var0[5], ModuleCategory.GENERAL, var0[20], true
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new BooleanModule(
                     var0[3], var0[10], ModuleCategory.GENERAL, var0[20], true
                  );
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new BooleanSetting(var0[35], var0[25], true);
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new BooleanSetting(var0[21], var0[32], true);
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new BooleanSetting(var0[39], var0[23], true);
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new BooleanSetting(var0[28], var0[2], true);
                  String var33 = var0[0];
                  String var36 = var0[12];
                  var11 = new String[]{var0[17], var0[7], var0[19]};
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var33, var36, 1, var11
                  );
                  String var34 = var0[6];
                  String var37 = var0[24];
                  var10004 = ModuleCategory.GENERAL;
                  var10005 = var0[20];
                  Setting[] var22 = new Setting[]{
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                  };
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new BooleanModule(
                     var34, var37, var10004, var10005, true, var22
                  );
                  ModuleCategory var23 = ModuleCategory.HUD;
                  var12 = new Setting[0];
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var23, var12
                  ) {
                     private static long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 8010768860125L;
                     private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
                     private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
                     private static Map IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap(13);

                     {
                        long var3 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 26111653681855L;
                     }

                     @Override
                     public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        long var1, me.octo.client.gui.clickgui.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var3x
                     ) {
                        Intrinsics.checkNotNullParameter(
                           var3x,
                           IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"c">(20621, 5138026087034453437L ^ var1)
                        );
                        Minecraft.getInstance()
                           .execute(<unrepresentable>::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll);
                     }

                     private static final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
                        Minecraft.getInstance().setScreen(new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI());
                     }

                     static {
                        long var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 120013834249107L;
                        Cipher var2;
                        Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                        byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                        for (int var3 = 1; var3 < 8; var3++) {
                           var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                        }

                        var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                        String[] var9 = new String[5];
                        int var7 = 0;
                        String var6 = "\u0015\u001e\n\u0099Ï\u001a\u0017íJÚb\u008d²\u0012\u0000ã¿\b A,úpzÕ\u0003Í[§\u008c s\u0010o'+\u009b\u0005e\u0089Ï \u0000\u0003¥\u0084\u0012Ù\f`.ë qnÒ\u0098àráã\u0002÷&¢0òï¦%\u009e´:è\u0010qüéU\u0010½W¤\u008a\u0095ñ\u0001e¹\u0092\u0082\u0001í\u009b\u0003>\u0002\u0007d×\rà\u0089Ed\u0005wf±\tðã|g÷úC!\u0005\u0095yÀk\u0089É£Tã\u001eý\u0005TâºBî\u000b\r\u0098ÇS\u0092ü\u008e=Ä";
                        int var8 = "\u0015\u001e\n\u0099Ï\u001a\u0017íJÚb\u008d²\u0012\u0000ã¿\b A,úpzÕ\u0003Í[§\u008c s\u0010o'+\u009b\u0005e\u0089Ï \u0000\u0003¥\u0084\u0012Ù\f`.ë qnÒ\u0098àráã\u0002÷&¢0òï¦%\u009e´:è\u0010qüéU\u0010½W¤\u008a\u0095ñ\u0001e¹\u0092\u0082\u0001í\u009b\u0003>\u0002\u0007d×\rà\u0089Ed\u0005wf±\tðã|g÷úC!\u0005\u0095yÀk\u0089É£Tã\u001eý\u0005TâºBî\u000b\r\u0098ÇS\u0092ü\u008e=Ä"
                           .length();
                        char var5 = ' ';
                        int var4 = -1;

                        while (true) {
                           byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                           String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                           byte var10001 = -1;
                           var9[var7++] = var21;
                           if ((var4 += var5) >= var8) {
                              var6 = "=\\Þ´ëáHÈõ¶¬\u0087\n6-Â?\u0018R÷æÔ£ê 8é\u0099fë·º\u0082Ô 0Zo>¤P_N\u0015jÆ@'jÜ.\u008dye6\u0094K";
                              var8 = "=\\Þ´ëáHÈõ¶¬\u0087\n6-Â?\u0018R÷æÔ£ê 8é\u0099fë·º\u0082Ô 0Zo>¤P_N\u0015jÆ@'jÜ.\u008dye6\u0094K".length();
                              var5 = '\u0018';
                              var4 = -1;

                              while (true) {
                                 var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                                 String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                                 boolean var19 = false;
                                 var9[var7++] = var23;
                                 if ((var4 += var5) >= var8) {
                                    llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var9;
                                    IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new String[5];
                                    return;
                                 }

                                 var5 = var6.charAt(var4);
                              }
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

                     private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
                        int var5 = var0 ^ (int)(var1 & 32767L) ^ 14710;
                        if (IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5] == null) {
                           Object[] var4;
                           try {
                              Long var3 = Thread.currentThread().threadId();
                              var4 = (Object[])IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.get(var3);
                              if (var4 == null) {
                                 var4 = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl.put(var3, var4);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/GeneralModules$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                              "me/octo/client/modules/impl/features/GeneralModules$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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

               var4 = var5.charAt(var3);
            }
         }

         var4 = var5.charAt(var3);
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

   public static final class Companion {
      private static boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 81346548190568L;

      private Companion() {
      }

      @NotNull
      public final me.octo.client.gui.clickgui.modules.impl.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return GeneralModules.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.modules.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return GeneralModules.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.modules.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return GeneralModules.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return GeneralModules.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.modules.impl.IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return GeneralModules.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.modules.impl.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return GeneralModules.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final BooleanModule getCustomMainMenu() {
         return GeneralModules.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final BooleanModule getCustomBreakScreen() {
         return GeneralModules.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final BooleanSetting IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return GeneralModules.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final BooleanSetting IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return GeneralModules.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final BooleanSetting IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return GeneralModules.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final BooleanSetting IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return GeneralModules.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @NotNull
      public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return GeneralModules.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      @NotNull
      public final BooleanModule IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
         return GeneralModules.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1, long var2) {
         var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
         boolean var4 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            -5029798132781331515L, var2
         );

         float var10000;
         label59: {
            label58: {
               try {
                  switch (this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
                     .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII()) {
                     case 0:
                        var10000 = 1.58F;
                        break label59;
                     case 1:
                     default:
                        break;
                     case 2:
                        break label58;
                  }
               } catch (MatchException var9) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var9, -5014042216656725115L, var2
                  );
               }

               var10000 = 1.8F;
               break label59;
            }

            var10000 = 2.35F;
         }

         label45: {
            label44: {
               boolean var5;
               try {
                  NVGRenderer.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var10000;
                  var5 = this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl().isToggled();
                  if (var4) {
                     if (!var5) {
                        return false;
                     }
                     break label44;
                  }
               } catch (MatchException var8) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var8, -5014042216656725115L, var2
                  );
               }

               var11 = var5;
               break label45;
            }

            var11 = var1;
         }

         try {
            boolean var6 = var11;
            if (!var4) {
               return var6;
            }

            if (var6) {
               return true;
            }
         } catch (MatchException var7) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var7, -5014042216656725115L, var2
            );
         }

         return false;
      }

      public final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(int var1, int var2) {
         long var3 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var5 = var3 ^ 48739059610571L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI().isToggled(), var5
         );
      }

      public final boolean IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(long var1) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 31491562708988L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI().isToggled(), var3
         );
      }

      public final boolean IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long var1) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 47617345747420L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl().isToggled(), var3
         );
      }

      public final boolean IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(int var1, short var2, int var3) {
         long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 101803522582030L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll().isToggled(), var6
         );
      }

      @NotNull
      public final IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
         return GeneralModules.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var0) {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
      }

      public static boolean lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public static boolean IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll() {
         boolean var0 = lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();
         return !var0;
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 93330885440024L;
         if (IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll()) {
            boolean var2 = true;
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2);
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
      }

      public final boolean IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII$recovered$245f7b012cb52ac8(long var1) {
         var1 = 81793459103698L;
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 31491562708988L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f127a4177fc4e66b(
            this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI().isToggled(), var3
         );
      }

      private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f127a4177fc4e66b(
         boolean var1, long var2
      ) {
         var2 = 34341709182278L;
         var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
         boolean var4 = lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();

         float var10000;
         label59: {
            label58: {
               try {
                  switch (this.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
                     .IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII()) {
                     case 0:
                        var10000 = 1.58F;
                        break label59;
                     case 1:
                     default:
                        break;
                     case 2:
                        break label58;
                  }
               } catch (MatchException var12) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var12);
               }

               var10000 = 1.8F;
               break label59;
            }

            var10000 = 2.35F;
         }

         label45: {
            label44: {
               boolean var8;
               try {
                  NVGRenderer.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var10000;
                  var8 = this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl().isToggled();
                  if (var4) {
                     if (!var8) {
                        return false;
                     }
                     break label44;
                  }
               } catch (MatchException var11) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
               }

               var15 = var8;
               break label45;
            }

            var15 = var1;
         }

         try {
            boolean var9 = var15;
            if (!var4) {
               return var9;
            }

            if (var9) {
               return true;
            }
         } catch (MatchException var10) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10);
         }

         return false;
      }

      public final boolean IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII$recovered$8c1cc05197a492f6(long var1) {
         var1 = 138052924195314L;
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 47617345747420L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f127a4177fc4e66b(
            this.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl().isToggled(), var3
         );
      }

      public final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI$recovered$f289c745667676e6(int var1, int var2) {
         short var7 = 31379;
         var2 = -953283611;
         long var3 = ((long)var7 << 32 | (long)var2 << 32 >>> 32) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var5 = var3 ^ 48739059610571L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f127a4177fc4e66b(
            this.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI().isToggled(), var5
         );
      }

      public final boolean IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$51e189123693a56d(
         int var1, short var2, int var3
      ) {
         short var8 = 2646;
         var2 = -12361;
         short var10 = 24096;
         long var4 = ((long)var8 << 32 | (long)var2 << 48 >>> 32 | (long)var10 << 48 >>> 48)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 101803522582030L;
         return this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f127a4177fc4e66b(
            this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll().isToggled(), var6
         );
      }
   }
}
