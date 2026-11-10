package me.octo.client.scripting;

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
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.jetbrains.annotations.NotNull;

public final class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   private static IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String scriptName;
   @NotNull
   private final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll script;
   @NotNull
   private static String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 58522659875527L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl(
      @NotNull String scriptNameArg, @NotNull lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll scriptArg
   ) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 65107469640954L;
      Intrinsics.checkNotNullParameter(scriptNameArg, "scriptName");
      Intrinsics.checkNotNullParameter(scriptArg, "script");
      super();
      this.scriptName = scriptNameArg;
      this.script = scriptArg;
   }

   @Export
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @NotNull
   public final llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl create(@NotNull Value param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Export
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @NotNull
   public final IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll register(@NotNull Value param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Export
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   public final void useNative(@NotNull String nameArg, @NotNull Value whenFnArg) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 1355076429321L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(whenFnArg, "whenFn");
      this.useNative(nameArg, whenFnArg, false);
   }

   @Export
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   public final void useNative(@NotNull String nameArg, @NotNull Value whenFnArg, boolean argument3Arg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Value IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, Value param2, byte param3, String param4, int param5, String param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Value llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param1, Value param3, String param4, String param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Value IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Value param1, int param2, String param3, short param4, char param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 35671779013452L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[65];
      int var7 = 0;
      String var6 = "Z¦É<@]\u0083x\u008c#ÖýÅa·ðSó/<w\u00962C\u0000\u0017ÏÌa¾âY0\u0086SZÂ\fT%õzO\u0084L\u009fGÖ\u009e=\u001fc:ó\u0083b_\u008dÆË}f\u0096¦da!¯&¸·\u0096Â¸C\u008cÃã,ØÜ \u001eâ¿e¢äªÆ\\aó\u0007\u0012\u009eëu\u009c\u0097\"Õ}0Ò\u001eSmÃþèÊ\u009a5\u0010\u008a\u0087Û<¿c\u000bPiIcMäw\u0093h\u0010»»\u009aâW\u00017!19g¨ó{¬e \u001cöÌj.\u0007\u0006Í\u0016ñ\u0086\u008f9£\u0017Âxõ¦\u009e9\u0019\u0092åW@\u0015´\u0094\u008fò\u0015 N\u0017#vÞpãð¥\u0091olÄ|ÄðÐ0Ð \u0085ÿ\u0005h4\u0089u3K«\u001b\u0000( vho\u0091ëf4?<$?n'Wo4ø\u0016ó\u0087¤î^Ò_È\u0086?Éwuj_¢®0ë/& ][\u0093ú\u009at¿\u0017Ë\u009cgq\u0099\u0005}bjL[½÷Ì\u000bv@<ÄvúÂ\u001cI Ð^¿\u0098\u0099¡~BùA:\u0081\u009a\u0097]©\\·Ä\t·áùY\u007f§¡3½\u0083Ñ, µÇ\u0002nÝVMû\u008fb¥%ë¬«ÂSú)&\u0093`\u009dÐu\u0016\u0092\u0091\u0085\u0004Á<\u0010TÖ?±ã=\u000b\\Y¥Î\u009bÌ\u009c\u0083¡\u0018+x±tn¯#ähsA\u008dY\u008e\u0092²ÔD\u0007\u0006Öú%Ç \u0007¾#ô\u0019¼\u0014ÿ\u0007\u0085\u0088\u0007ÎX(÷\u0004yÁF\u0089hÍ7\u001d\u0087\u001c<Ö\r\u0006\u0087\u0010Oå\u0089G¼\u0005Þ\u0084} ~H\u0001JÜm .~v\u0019ÊñË©|TrJúyþI\u0096\u0097ä¦o/\u0096\u0005sb\u0002\u001bè¬\u008dG(î{Ê®\u0004ÎgÐ^\u000fD\u0099\u00adò\u001e\u0015¶ð}Ò.\u0087\u0007ê\u0094^\u0082ñ\u008bZæüûÓ\u0093ö;R{´\u0010Äë'\u007fDÒ¤#¯¿\"<çù²}\u0018ä\u001dVçqYüà\u009a{S©²\u009c\u00123?ê#Àxl\u0003\u0089(}>èÖ,«\u0013\u0096g:Ì\"\"\u0085¹+$i\u00ada÷\u0000\u001d\bhÃ!_3*¯:mYzu*ÔC\u0094(Two~Múöiµ\u000f\u0094k\u009dÉ\u0090\u0012P\u000bÕNªe\u0091pý\tÆ!»Ï\u0016©\u0017in\u0006=5¶¿(§mé0\u0087ï\u0085@\u001a®w^ÅùEMÕ\u0001\u00178á¹\\\u0086\u0081np§~\u0015\u0010¬\u009f$\r,3µY\u008b \u001bã¬\u008fÀ\u001b¢UÛ\u0090êûas\u0016O6V_Û(\u0097\u007f·\u00022\u001eO\u0086·\u0091L \u0086\u0082î\u009cÇFþ\u0019+\u0003\"\u0091\u008bÍÙ³p{\u007f³6]IvÌ\tßwPkz\u0011 \b\u0002\u009ci\u0097(¤£[GéBÛµN¥$Z^\u00062\u0002\u0083\u009fÆ\u008f«±·\u0090ì\u0098HZ\u008e±\u0011BA\u001d\u0019ô9\u008cê{mzCíx2\u0088J\u0017À\u0087¤\u009cY\u0081ë¿@½'á\u0018\u001cý\u0094\u009aÜ×\u000fÊ%[>\u0096E\u0088Ò\u000f¢\u001a\u000b\u0006\u0081{mcÈ\u0013WÊ`Ö¥8Å¹]ÿ1\u0010®wM\u0000SRo.èV¦\u0004ÁÏçÙ\u0018ëÀMc\u009aj\u0002|RZ)\u001a\u0083gi\u0091Íò\u0081S\u0084gÀ\u009a\u0010o|üsè\u0003È\u0013¸+\u0010+µ\u009a\u001cö\u0010o@ ©\u008c9¬\u001bwÐð\u0015\u001e¿§n\u0010«\u0016tÊ¸áÕõ©^pK\u001f\u009b\u0004Ç\u0010Î\u0083^\u0084Q\u0010\u001dÅ\u001d)\u008c\u0086°þe#\u0010A¤ß»<\u000fÞ\u0019w×W\u0000\u000b¤Ú4\u0010×C»\u00832\u0087\u0097ð\u008a${òÖãÄ¡ øp¡À8\u0004©ìòÀ\u0001SmÖö\u008d\u0006ò,\u0085J)éÝ\u000bé\r-\u008bñ;õ8YtÞÄ\u0095æ3æ\u0085\tÇ ñ¢\u009b\u0084W9l\u008c;ñv/\u0084\u0010\u0083~6 \u0017b\u008b\u000b~Ó+Ä3sÖÿ\"ú²O\fÉ\u001cësðC\u007f.» \u0017\u009f\\\u0000\u0000\b\u007fÒrn\u001bûåb`ÿ\u009aPDsä>\u0002¸)ß¾V¡R\u0006\u001bÀH\u0088Ôsvâß<[\u009b\u0015¿Ù\u00adð\u0002\u0098!î\u0086Ê¬êL¾L\u001díÛ¸Õ\u0084U\u001bgý\u0000[\u0092û\u0003'\u008a¶'¸\u0006®/5\u008f7ÑIfäÞ*\u0086\u009eJé\u009caÄëv\u000b\u0092¿@\u009aG\u0083ýx6®0_\u001b%¸5!÷5\u009e\u008fu÷W|Em\u0092üý\u0001\u0019ñÓÀ\u008fÞ(Dýf\b»\u0081\u00adÔÂÌ¼ÈuYå\u0081\u001deFõ\u0010Í]%\u0083æRÓÆ#Ðê\u0012\u0082\u0015»\u008ex\u00962©\u0002\u0096Ì\u0019\u0015\u008dL\u000eæÓB\u009aTÿMó7¼\u0092î\u0010ßjÆqýt\u001a7\u0092\u000f¬8Qq\u001e¡ì¤ÚD:©\u0094\u0082\u0010_höQaVï\u007f\u000e¢R\u0004óS1y ì]\u000f@\u0088K\u0002\u0000Ãn\\\u0082\u0094>UºÁ\u008fjÏ\f÷`q<Nølñ\u0087Ù{\u0010Û\u0003£K¯\u008ce\u0091Çz>#\"\u0002¾Y\u0010\u0011b]\u009bsa\u0013_¼\u0090e\u0007û$ì\u0004\u0010o0d¡(ÍÌs\u00802ê|-ùP*\u0010k¸|Al2\u0002È>\u0005¹¶)Ï\u009c\u009cXi:@VÙÕÎ\u0095\u000bCY+°Um{ì\r\u00868ö\u0003ë]%\u0084\b#1/,É2fwz¸\u0015÷4õB\u0001ñ\u008f\u0000vå]Ó\u001f\u009e\u0016\u0097O\u008dc{X\u0094,\u0081Û8{\u00ad\u0088ÀÂYU=ø5K¼\u0002\u0083Ñv¤b\u0081C\u0001ç¾E \u001e\u0091È\u001dNóù>±\u000e\u008d\u0083À\u000bWlà¯§¾þ\u0002\u0094'(µ\u008a\u0018ã\"\u00adH@\fõ)óÕ\u0092Ö\u001c|\u008a\u0081x:\u0088idbÈs¨üi\u008ai07è Î\u008e\u001d\u000fÙ´?sjj\u000b´\u0081úé/$Cu\u007fG\b\u0080ûZ\u008ae\u0092²LÕÂh'$\u0097 ¡\nÞ\u00190h3?q\u008d\u009e\u0099óqV½\u0011«Òi~ª\u0018O³Êc=B(g´°[¹$\u001e\u009a¡à.%\f\u008aÌë\u0098ÉÂp'ÃY\u009fÚ;~jÑA\u009aNYx\u0006\u008fópÐV-\u0088½·\u0085(}·\u008f\"\u008c]âw\u0003)å°\u0011¹¼«Í&£Z\u001d\u001cÜ²V\u0086\u0011nÆ\u008bQù\u0017\u0019\u0015¯%\u0083óDÒ\u0002ì¬R.¬\u0091Ï\u0019¥çN·AÿI?ÙL©'I':6\ng\u008c\u001a³l×}²DÜ\u0000\u001a^¿\u0007r9HÔêZ,vwn¢ãvó+r/:Ñ <s\u009e)®Ú¬ÒZÝkpÈ\u008fÙÈ¬G\u0087Jê\u009cþ\u0013ÙCh\u0002¡7Õ\u0010=^\u001apÔ$ËD©I\u0085TLu\u000b\u0099\u00108\u0095<\u009aõ¸8÷ä&&\u000fi\u000b\u0085i\u0018h)w\u001d\u001b\u009aÜÁ8\u0093sÃ\u0081u\u0082d\u001d$\u0013Ã\u009déeI\u0010g±±\u0092Cõêß\u0090G @ô\u008e\u0099Ã\u0010xm´¼Ê\u0095O§\u0092\u009b\u0011\u009d¨2ºþ Ü_I\u001dPF\u001aîo\u008bPnÁÉEc°¹H*^\rw\u007f\u0017\u001ex¨\u009dJTT\u0018\u00adQkÔÞk\u007fè8\u0000\"ìùµ;¥\u0086AA\u0091#7Ór\u0018\u0099ì/¯½\u0003E¹É5\u0010\u000eáY2õ×¬xÉ\béx\u0007\u0010Õ¹K\u001få\u001bM«¥\u001bÖ\u0085ZUéö\u0010ée1§\u0093¿\u0012ö\u000e\u0097\u0003V\u0006J\u000f$\u0010çØ;§éuv=D+°9+s»Ò\u0018µÄµA\u000b\u008dX\u0096=<>'\u008aïÏ\u0006ÜÊs1<ß¡Å\u0010\u0083Pý<ò\u0005g|)ê\u0081\u009f¿P\u00823H\u0000ACMæ}êG\u000e$³Ýë6£\u000bêd5ÜP\u0014æ~â\u008d©\u00906\u0086·\u0000æaB>åY'i\u008cNÞßÓ\u000f\u0001f\\P¤g^ôß¥Í\u0014¿¦þ_¤\u001a\u001a\u000b\u008b\u0083ô¿ãH";
      int var8 = "Z¦É<@]\u0083x\u008c#ÖýÅa·ðSó/<w\u00962C\u0000\u0017ÏÌa¾âY0\u0086SZÂ\fT%õzO\u0084L\u009fGÖ\u009e=\u001fc:ó\u0083b_\u008dÆË}f\u0096¦da!¯&¸·\u0096Â¸C\u008cÃã,ØÜ \u001eâ¿e¢äªÆ\\aó\u0007\u0012\u009eëu\u009c\u0097\"Õ}0Ò\u001eSmÃþèÊ\u009a5\u0010\u008a\u0087Û<¿c\u000bPiIcMäw\u0093h\u0010»»\u009aâW\u00017!19g¨ó{¬e \u001cöÌj.\u0007\u0006Í\u0016ñ\u0086\u008f9£\u0017Âxõ¦\u009e9\u0019\u0092åW@\u0015´\u0094\u008fò\u0015 N\u0017#vÞpãð¥\u0091olÄ|ÄðÐ0Ð \u0085ÿ\u0005h4\u0089u3K«\u001b\u0000( vho\u0091ëf4?<$?n'Wo4ø\u0016ó\u0087¤î^Ò_È\u0086?Éwuj_¢®0ë/& ][\u0093ú\u009at¿\u0017Ë\u009cgq\u0099\u0005}bjL[½÷Ì\u000bv@<ÄvúÂ\u001cI Ð^¿\u0098\u0099¡~BùA:\u0081\u009a\u0097]©\\·Ä\t·áùY\u007f§¡3½\u0083Ñ, µÇ\u0002nÝVMû\u008fb¥%ë¬«ÂSú)&\u0093`\u009dÐu\u0016\u0092\u0091\u0085\u0004Á<\u0010TÖ?±ã=\u000b\\Y¥Î\u009bÌ\u009c\u0083¡\u0018+x±tn¯#ähsA\u008dY\u008e\u0092²ÔD\u0007\u0006Öú%Ç \u0007¾#ô\u0019¼\u0014ÿ\u0007\u0085\u0088\u0007ÎX(÷\u0004yÁF\u0089hÍ7\u001d\u0087\u001c<Ö\r\u0006\u0087\u0010Oå\u0089G¼\u0005Þ\u0084} ~H\u0001JÜm .~v\u0019ÊñË©|TrJúyþI\u0096\u0097ä¦o/\u0096\u0005sb\u0002\u001bè¬\u008dG(î{Ê®\u0004ÎgÐ^\u000fD\u0099\u00adò\u001e\u0015¶ð}Ò.\u0087\u0007ê\u0094^\u0082ñ\u008bZæüûÓ\u0093ö;R{´\u0010Äë'\u007fDÒ¤#¯¿\"<çù²}\u0018ä\u001dVçqYüà\u009a{S©²\u009c\u00123?ê#Àxl\u0003\u0089(}>èÖ,«\u0013\u0096g:Ì\"\"\u0085¹+$i\u00ada÷\u0000\u001d\bhÃ!_3*¯:mYzu*ÔC\u0094(Two~Múöiµ\u000f\u0094k\u009dÉ\u0090\u0012P\u000bÕNªe\u0091pý\tÆ!»Ï\u0016©\u0017in\u0006=5¶¿(§mé0\u0087ï\u0085@\u001a®w^ÅùEMÕ\u0001\u00178á¹\\\u0086\u0081np§~\u0015\u0010¬\u009f$\r,3µY\u008b \u001bã¬\u008fÀ\u001b¢UÛ\u0090êûas\u0016O6V_Û(\u0097\u007f·\u00022\u001eO\u0086·\u0091L \u0086\u0082î\u009cÇFþ\u0019+\u0003\"\u0091\u008bÍÙ³p{\u007f³6]IvÌ\tßwPkz\u0011 \b\u0002\u009ci\u0097(¤£[GéBÛµN¥$Z^\u00062\u0002\u0083\u009fÆ\u008f«±·\u0090ì\u0098HZ\u008e±\u0011BA\u001d\u0019ô9\u008cê{mzCíx2\u0088J\u0017À\u0087¤\u009cY\u0081ë¿@½'á\u0018\u001cý\u0094\u009aÜ×\u000fÊ%[>\u0096E\u0088Ò\u000f¢\u001a\u000b\u0006\u0081{mcÈ\u0013WÊ`Ö¥8Å¹]ÿ1\u0010®wM\u0000SRo.èV¦\u0004ÁÏçÙ\u0018ëÀMc\u009aj\u0002|RZ)\u001a\u0083gi\u0091Íò\u0081S\u0084gÀ\u009a\u0010o|üsè\u0003È\u0013¸+\u0010+µ\u009a\u001cö\u0010o@ ©\u008c9¬\u001bwÐð\u0015\u001e¿§n\u0010«\u0016tÊ¸áÕõ©^pK\u001f\u009b\u0004Ç\u0010Î\u0083^\u0084Q\u0010\u001dÅ\u001d)\u008c\u0086°þe#\u0010A¤ß»<\u000fÞ\u0019w×W\u0000\u000b¤Ú4\u0010×C»\u00832\u0087\u0097ð\u008a${òÖãÄ¡ øp¡À8\u0004©ìòÀ\u0001SmÖö\u008d\u0006ò,\u0085J)éÝ\u000bé\r-\u008bñ;õ8YtÞÄ\u0095æ3æ\u0085\tÇ ñ¢\u009b\u0084W9l\u008c;ñv/\u0084\u0010\u0083~6 \u0017b\u008b\u000b~Ó+Ä3sÖÿ\"ú²O\fÉ\u001cësðC\u007f.» \u0017\u009f\\\u0000\u0000\b\u007fÒrn\u001bûåb`ÿ\u009aPDsä>\u0002¸)ß¾V¡R\u0006\u001bÀH\u0088Ôsvâß<[\u009b\u0015¿Ù\u00adð\u0002\u0098!î\u0086Ê¬êL¾L\u001díÛ¸Õ\u0084U\u001bgý\u0000[\u0092û\u0003'\u008a¶'¸\u0006®/5\u008f7ÑIfäÞ*\u0086\u009eJé\u009caÄëv\u000b\u0092¿@\u009aG\u0083ýx6®0_\u001b%¸5!÷5\u009e\u008fu÷W|Em\u0092üý\u0001\u0019ñÓÀ\u008fÞ(Dýf\b»\u0081\u00adÔÂÌ¼ÈuYå\u0081\u001deFõ\u0010Í]%\u0083æRÓÆ#Ðê\u0012\u0082\u0015»\u008ex\u00962©\u0002\u0096Ì\u0019\u0015\u008dL\u000eæÓB\u009aTÿMó7¼\u0092î\u0010ßjÆqýt\u001a7\u0092\u000f¬8Qq\u001e¡ì¤ÚD:©\u0094\u0082\u0010_höQaVï\u007f\u000e¢R\u0004óS1y ì]\u000f@\u0088K\u0002\u0000Ãn\\\u0082\u0094>UºÁ\u008fjÏ\f÷`q<Nølñ\u0087Ù{\u0010Û\u0003£K¯\u008ce\u0091Çz>#\"\u0002¾Y\u0010\u0011b]\u009bsa\u0013_¼\u0090e\u0007û$ì\u0004\u0010o0d¡(ÍÌs\u00802ê|-ùP*\u0010k¸|Al2\u0002È>\u0005¹¶)Ï\u009c\u009cXi:@VÙÕÎ\u0095\u000bCY+°Um{ì\r\u00868ö\u0003ë]%\u0084\b#1/,É2fwz¸\u0015÷4õB\u0001ñ\u008f\u0000vå]Ó\u001f\u009e\u0016\u0097O\u008dc{X\u0094,\u0081Û8{\u00ad\u0088ÀÂYU=ø5K¼\u0002\u0083Ñv¤b\u0081C\u0001ç¾E \u001e\u0091È\u001dNóù>±\u000e\u008d\u0083À\u000bWlà¯§¾þ\u0002\u0094'(µ\u008a\u0018ã\"\u00adH@\fõ)óÕ\u0092Ö\u001c|\u008a\u0081x:\u0088idbÈs¨üi\u008ai07è Î\u008e\u001d\u000fÙ´?sjj\u000b´\u0081úé/$Cu\u007fG\b\u0080ûZ\u008ae\u0092²LÕÂh'$\u0097 ¡\nÞ\u00190h3?q\u008d\u009e\u0099óqV½\u0011«Òi~ª\u0018O³Êc=B(g´°[¹$\u001e\u009a¡à.%\f\u008aÌë\u0098ÉÂp'ÃY\u009fÚ;~jÑA\u009aNYx\u0006\u008fópÐV-\u0088½·\u0085(}·\u008f\"\u008c]âw\u0003)å°\u0011¹¼«Í&£Z\u001d\u001cÜ²V\u0086\u0011nÆ\u008bQù\u0017\u0019\u0015¯%\u0083óDÒ\u0002ì¬R.¬\u0091Ï\u0019¥çN·AÿI?ÙL©'I':6\ng\u008c\u001a³l×}²DÜ\u0000\u001a^¿\u0007r9HÔêZ,vwn¢ãvó+r/:Ñ <s\u009e)®Ú¬ÒZÝkpÈ\u008fÙÈ¬G\u0087Jê\u009cþ\u0013ÙCh\u0002¡7Õ\u0010=^\u001apÔ$ËD©I\u0085TLu\u000b\u0099\u00108\u0095<\u009aõ¸8÷ä&&\u000fi\u000b\u0085i\u0018h)w\u001d\u001b\u009aÜÁ8\u0093sÃ\u0081u\u0082d\u001d$\u0013Ã\u009déeI\u0010g±±\u0092Cõêß\u0090G @ô\u008e\u0099Ã\u0010xm´¼Ê\u0095O§\u0092\u009b\u0011\u009d¨2ºþ Ü_I\u001dPF\u001aîo\u008bPnÁÉEc°¹H*^\rw\u007f\u0017\u001ex¨\u009dJTT\u0018\u00adQkÔÞk\u007fè8\u0000\"ìùµ;¥\u0086AA\u0091#7Ór\u0018\u0099ì/¯½\u0003E¹É5\u0010\u000eáY2õ×¬xÉ\béx\u0007\u0010Õ¹K\u001få\u001bM«¥\u001bÖ\u0085ZUéö\u0010ée1§\u0093¿\u0012ö\u000e\u0097\u0003V\u0006J\u000f$\u0010çØ;§éuv=D+°9+s»Ò\u0018µÄµA\u000b\u008dX\u0096=<>'\u008aïÏ\u0006ÜÊs1<ß¡Å\u0010\u0083Pý<ò\u0005g|)ê\u0081\u009f¿P\u00823H\u0000ACMæ}êG\u000e$³Ýë6£\u000bêd5ÜP\u0014æ~â\u008d©\u00906\u0086·\u0000æaB>åY'i\u008cNÞßÓ\u000f\u0001f\\P¤g^ôß¥Í\u0014¿¦þ_¤\u001a\u001a\u000b\u008b\u0083ô¿ãH"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "1\u0092K¼/ËEhXêë¯oÏ9\u008a&\r£®r\u0012\u0011©\u0010ÐUbË\"Oåkÿm:í\u008d^À_";
            var8 = "1\u0092K¼/ËEhXêë¯oÏ9\u008a&\r£®r\u0012\u0011©\u0010ÐUbË\"Oåkÿm:í\u008d^À_".length();
            var5 = '\u0018';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[65];
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = "autoSell, scheduler, autoReconnect, interruptionFixer, playerNotifier, autoRefuel, autoForge, slayerStarter";
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26791;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/scripting/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final Value llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$fa94eefde30523d6(
      long param1, Value param3, String param4, String param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final me.octo.client.modules.helpers.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2a88785286c26e8f(
      String param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
