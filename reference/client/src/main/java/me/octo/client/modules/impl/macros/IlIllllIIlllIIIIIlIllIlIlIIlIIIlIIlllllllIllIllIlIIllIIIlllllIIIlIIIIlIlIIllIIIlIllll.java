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
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll {
   @NotNull
   public static IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static BooleanSetting IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

   private IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
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
   public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   static {
      long var16 = 94035974741520L ^ 70047021741997L;
      Cipher var8;
      Cipher var10000 = var8 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var9 = 1; var9 < 8; var9++) {
         var10003[var9] = (byte)(var16 << var9 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[23];
      int var13 = 0;
      String var12 = "H½\u008f´¿ÿ!3üî7ÄýS´ý\u001c\u00adÍ|¡\fùäc3d.ÿïLMNì\r³x\u008cß\u0081Á¦\u0093&¬|TÏ\u00ad\u008f¨;&\u009a\u009e8\u0018ïq4\u0082}K\u0092-\u0000ü\u0017×æM¤hlW\u0087Ç\rèÑ%\u00109Ì\u0000É90\u0096 l¿qj°ZXQ\u0010i\tZ¤ý»ñ~£\u0099\u0016ÂøJm(\u0018\u0080\u0012þ±´\u008c¤´©k\u0007\u0010Lè¦W(s\u009c\u0098Ö\u0019$\u0090x\u0099Í¬õÝâøûtñÖS\u008aÃÒ_Ö\u00ad\u001a{\u009fszêh$PÜË5\u0001º=|¬\u0018î$¨ÅÚ}ÿ\u0018¾ãU½\u001d\u0006%\u0097\u0096W·D[>Å\u0083ò\u008c)\u0005Suø¬;\u0018©0Õ#Ë%\r`ÓÉªGöø\u0098\u0085¼Ñ4rëZ\u0092\u0093ø_úÀV=+C# n\u0098éÓØÂÂ Xr[\u0086<ºP\u0006\u0018ÎÆAa_\u0005âþÌ\u0005ð°\u0001´\u0005ã«2d½Âì\u0093ÆH;´¬4\u0082æ\u0094GV#x¡q|!à\u0010Û\"\u0096\u001a\u0082j\u008e)\u0011tNíâ\u001d=\u0082\u001aÆS@´5Qñ¸\u000f6yù\u0018\u001e\u008cÎ§\u009f\u009f\"V\u008eßº®ííÖ®\u0014´¹Z´T\u0092ø\u0098\u0018pp\u000f\u0097\f0\u001fÍ\u00977STô^\u0094Ò3Á×t¢£iË@\u0099g\u00064Ñ!;5ØvS\u008aû)|y\u0013Dy§ãt\u008c»ÍU\u0018áì\u0094«ö2q\u000bö\"ò\u008a¤ð³\"aVõ|ü\u0095\u0019g*$\n\u0011%Ð\u0084\u0092\u0092\u0099þa\u0016\u0018z4\\Û\u001bKÿ\u00adù-ªG\u00818¢Q&ªák\u0015ñ»T(ô~§^_Z\u00ad2÷\u0081E\u001bW9ùeé¤Y<:h4}o\u009b\u001føÕ8nç#$î\u0018³Îw\u0080\u0010p»ÑQ44\u009aÄ\u0089\u0088öPê\u009a'²0\u001c\u009dÄ\u007fôo%,{G\u0094ED»\u0092e\u001f\t\\±Ì7üOª0 ¦ âáA _4\u0000va¹\u009d\u0015ùóÉ\u009cÁû!\u0018I\u0017¤\u0094R[Õ\u009cQÓ¬÷\u001f\u008cWØiJXÌ\u0095\u008e¦Þ@çîÙz\u0000\u0014ºÛ\u0093ï\b\u0019²a;È¹ªÑüB\u0013ÈÐ\t\u001bEmgâzWüLa\u008e¶«\u0019åª\u0011y\u0087y\u0091Â\u0099Ø6\u0019Ð1XëVÊ{ë\u008cØ\r1V0aw\u0014o;\u0087A\u000f#\u0095lGksÌýH\báåÐ\u008f\u0091Í$¯¤J\u009cº\u009c\u0088úî«)\u000f\u009fI\u0007*X\u009eéÎ\u0004vñ@ôÙþ8´\u001bÌ.²\n\u009c7ÿ\u009cê\u0093å¡6(\u0099\u007fkô~²°Ï\r}Yù6cQ¡¶ÖØÇæcâ¦\u0017ä\u0002\u00aduÙ\u0093õj\blÆ ªèI:u÷±\u0010î\u0088\t0\u000eiï\u0089âÜØÞ\u000eøì\u0096\u0018I\u0017¤\u0094R[Õ\u009c5üÝ¿^\u001b\u0093Õ×\u007f6Ü\u0013®G\u0099@i\u001f\u009dO\u0080@\u009c\u0091X\u0096ë±uÌy\u000br´Á.\u0087C{\nÕ>\u0096\u0007®\u000eczñY°ÎSS\u0081\u0089ií¥N\u0016X\u000e)eµ0(nC\u001b\u0089\u00868L;¡ùØP";
      int var14 = "H½\u008f´¿ÿ!3üî7ÄýS´ý\u001c\u00adÍ|¡\fùäc3d.ÿïLMNì\r³x\u008cß\u0081Á¦\u0093&¬|TÏ\u00ad\u008f¨;&\u009a\u009e8\u0018ïq4\u0082}K\u0092-\u0000ü\u0017×æM¤hlW\u0087Ç\rèÑ%\u00109Ì\u0000É90\u0096 l¿qj°ZXQ\u0010i\tZ¤ý»ñ~£\u0099\u0016ÂøJm(\u0018\u0080\u0012þ±´\u008c¤´©k\u0007\u0010Lè¦W(s\u009c\u0098Ö\u0019$\u0090x\u0099Í¬õÝâøûtñÖS\u008aÃÒ_Ö\u00ad\u001a{\u009fszêh$PÜË5\u0001º=|¬\u0018î$¨ÅÚ}ÿ\u0018¾ãU½\u001d\u0006%\u0097\u0096W·D[>Å\u0083ò\u008c)\u0005Suø¬;\u0018©0Õ#Ë%\r`ÓÉªGöø\u0098\u0085¼Ñ4rëZ\u0092\u0093ø_úÀV=+C# n\u0098éÓØÂÂ Xr[\u0086<ºP\u0006\u0018ÎÆAa_\u0005âþÌ\u0005ð°\u0001´\u0005ã«2d½Âì\u0093ÆH;´¬4\u0082æ\u0094GV#x¡q|!à\u0010Û\"\u0096\u001a\u0082j\u008e)\u0011tNíâ\u001d=\u0082\u001aÆS@´5Qñ¸\u000f6yù\u0018\u001e\u008cÎ§\u009f\u009f\"V\u008eßº®ííÖ®\u0014´¹Z´T\u0092ø\u0098\u0018pp\u000f\u0097\f0\u001fÍ\u00977STô^\u0094Ò3Á×t¢£iË@\u0099g\u00064Ñ!;5ØvS\u008aû)|y\u0013Dy§ãt\u008c»ÍU\u0018áì\u0094«ö2q\u000bö\"ò\u008a¤ð³\"aVõ|ü\u0095\u0019g*$\n\u0011%Ð\u0084\u0092\u0092\u0099þa\u0016\u0018z4\\Û\u001bKÿ\u00adù-ªG\u00818¢Q&ªák\u0015ñ»T(ô~§^_Z\u00ad2÷\u0081E\u001bW9ùeé¤Y<:h4}o\u009b\u001føÕ8nç#$î\u0018³Îw\u0080\u0010p»ÑQ44\u009aÄ\u0089\u0088öPê\u009a'²0\u001c\u009dÄ\u007fôo%,{G\u0094ED»\u0092e\u001f\t\\±Ì7üOª0 ¦ âáA _4\u0000va¹\u009d\u0015ùóÉ\u009cÁû!\u0018I\u0017¤\u0094R[Õ\u009cQÓ¬÷\u001f\u008cWØiJXÌ\u0095\u008e¦Þ@çîÙz\u0000\u0014ºÛ\u0093ï\b\u0019²a;È¹ªÑüB\u0013ÈÐ\t\u001bEmgâzWüLa\u008e¶«\u0019åª\u0011y\u0087y\u0091Â\u0099Ø6\u0019Ð1XëVÊ{ë\u008cØ\r1V0aw\u0014o;\u0087A\u000f#\u0095lGksÌýH\báåÐ\u008f\u0091Í$¯¤J\u009cº\u009c\u0088úî«)\u000f\u009fI\u0007*X\u009eéÎ\u0004vñ@ôÙþ8´\u001bÌ.²\n\u009c7ÿ\u009cê\u0093å¡6(\u0099\u007fkô~²°Ï\r}Yù6cQ¡¶ÖØÇæcâ¦\u0017ä\u0002\u00aduÙ\u0093õj\blÆ ªèI:u÷±\u0010î\u0088\t0\u000eiï\u0089âÜØÞ\u000eøì\u0096\u0018I\u0017¤\u0094R[Õ\u009c5üÝ¿^\u001b\u0093Õ×\u007f6Ü\u0013®G\u0099@i\u001f\u009dO\u0080@\u009c\u0091X\u0096ë±uÌy\u000br´Á.\u0087C{\nÕ>\u0096\u0007®\u000eczñY°ÎSS\u0081\u0089ií¥N\u0016X\u000e)eµ0(nC\u001b\u0089\u00868L;¡ùØP"
         .length();
      char var11 = '8';
      int var10 = -1;

      while (true) {
         byte[] var15 = var8.doFinal(var12.substring(++var10, var10 + var11).getBytes("ISO-8859-1"));
         String var31 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var7[var13++] = var31;
         if ((var10 += var11) >= var14) {
            var12 = "\u0005\n¬\u009b¬{LV¼Æß\u0006\u0096\u0002\u0088_\u0010\u0094mSÍ*ü\u009dj\u008d\u0083¦\u009a\u0019p\u0083Q";
            var14 = "\u0005\n¬\u009b¬{LV¼Æß\u0006\u0096\u0002\u0088_\u0010\u0094mSÍ*ü\u009dj\u008d\u0083¦\u009a\u0019p\u0083Q".length();
            var11 = '\u0010';
            var10 = -1;

            while (true) {
               var15 = var8.doFinal(var12.substring(++var10, var10 + var11).getBytes("ISO-8859-1"));
               String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var28 = 0;
               var7[var13++] = var33;
               if ((var10 += var11) >= var14) {
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -2359797786611381208L;
                  byte[] var6 = var2.doFinal(
                     new byte[]{
                        (byte)(var4 >>> 56),
                        (byte)(var4 >>> 48),
                        (byte)(var4 >>> 40),
                        (byte)(var4 >>> 32),
                        (byte)(var4 >>> 24),
                        (byte)(var4 >>> 16),
                        (byte)(var4 >>> 8),
                        (byte)var4
                     }
                  );
                  long var36 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var28 = -1;
                  long var0 = var36;
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var7[4], var7[5], true);
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl(
                     var7[22],
                     var7[9],
                     IlIIIllIllIIIIIIIIllIIIIIlIlIIIlIllIlllIlIlIlIIIllIlIIIlIIlIlIllIllIIlllIlllIllllIlIl.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
                        .getParentFolderName(),
                     new String[0],
                     0,
                     null,
                     48,
                     null
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting() {
                     private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 11465871711899L;
                     private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                     private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                     private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                     {
                        long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 72924979674520L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2x) {
                        long var3 = (long)var1 << 32 | (long)var2x << 32 >>> 32;
                        int var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           -1630223467092339516L, var3
                        );

                        try {
                           boolean var10000x = IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                           if (var5 == 0) {
                              return var10000x;
                           }

                           if (!var10000x) {
                              return true;
                           }
                        } catch (MatchException var6x) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var6x, -1591140998927588925L, var3
                           );
                        }

                        return false;
                     }

                     static {
                        long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 45365523135274L;
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
                        String var6 = "o·ÏO\u0091~×Ôúë!úz)×\u001fÇÂ~\u0006óF2yoX\u0080b¥V !Ð\u0098L`x\u009fÄ¦*1AVÚ/Éä×J\u0080`J¦\u00855àèR~`¤b+\u0018ÚnLJ¾\u000f§\u008cÀnyt\u0019\u0002wh(5]@d\u0001ES";
                        int var8 = "o·ÏO\u0091~×Ôúë!úz)×\u001fÇÂ~\u0006óF2yoX\u0080b¥V !Ð\u0098L`x\u009fÄ¦*1AVÚ/Éä×J\u0080`J¦\u00855àèR~`¤b+\u0018ÚnLJ¾\u000f§\u008cÀnyt\u0019\u0002wh(5]@d\u0001ES"
                           .length();
                        char var5 = '@';
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

                     private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                        return var0x;
                     }

                     private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                        int var1 = 0;
                        int var2x;
                        char[] var3 = new char[var2x = var0x.length];

                        for (int var4x = 0; var4x < var2x; var4x++) {
                           int var5;
                           if ((var5 = 255 & var0x[var4x]) < 192) {
                              var3[var1++] = (char)var5;
                           } else if (var5 < 224) {
                              char var6x = (char)((char)(var5 & 31) << 6);
                              byte var8x = var0x[++var4x];
                              var6x = (char)(var6x | (char)(var8x & 63));
                              var3[var1++] = var6x;
                           } else if (var4x < var2x - 2) {
                              char var12x = (char)((char)(var5 & 15) << '\f');
                              byte var9 = var0x[++var4x];
                              var12x = (char)(var12x | (char)(var9 & 63) << 6);
                              var9 = var0x[++var4x];
                              var12x = (char)(var12x | (char)(var9 & 63));
                              var3[var1++] = var12x;
                           }
                        }

                        return new String(var3, 0, var1);
                     }

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1) {
                        int var5 = var0x ^ (int)(var1 & 32767L) ^ 28730;
                        if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
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
                           } catch (Exception var10x) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                 var10x
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
                           byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                           llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9)
                           );
                        }

                        return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, MutableCallSite var1, String var2x, Object[] var3
                     ) {
                        int var4x = (Integer)var3[0];
                        long var5 = (Long)var3[1];
                        String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5);
                        MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                        var1.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                        return var7x;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, String var1, MethodType var2x
                     ) {
                        MutableCallSite var3 = new MutableCallSite(var2x);

                        try {
                           var3.setTarget(
                              MethodHandles.explicitCastArguments(
                                 MethodHandles.insertArguments(
                                    "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                       .asCollector(Object[].class, var2x.parameterCount()),
                                    0,
                                    var0x,
                                    var3,
                                    var1
                                 ),
                                 var2x
                              )
                           );
                           return var3;
                        } catch (Exception var5) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/macros/IlIllllIIlllIIIIIlIllIlIlIIlIIIlIIlllllllIllIllIlIIllIIIlllllIIIlIIIIlIlIIllIIIlIllll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                 + " : "
                                 + var1
                                 + " : "
                                 + var2x.toString(),
                              var5
                           );
                        }
                     }
                  };
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new BooleanSetting(var7[6], var7[15], true);
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var7[8], var7[0], true);
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var7[1], var7[17], 0.0F, 2.0F, 0.8F, 0.0F, 0, 96, null
                  );
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var7[21], var7[20], 0, 200, 0, 10
                  );
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var7[14], var7[7], 0.1F, 0.8F, 0.32F, 0.01F, 2
                  );
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var7[19], var7[16], 0.25F, 2.0F, 1.0F, 0.05F, 2
                  );
                  String var37 = var7[12];
                  String var39 = var7[11];
                  String[] var18 = new String[]{var7[18], var7[3], var7[2]};
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var37, var39, 0, var18
                  );
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new me.octo.client.gui.clickgui.settings.impl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     var7[10], var7[13], (int)var0, false
                  );
                  return;
               }

               var11 = var12.charAt(var10);
            }
         }

         var11 = var12.charAt(var10);
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
