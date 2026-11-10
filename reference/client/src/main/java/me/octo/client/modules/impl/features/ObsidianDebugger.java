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
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public final class ObsidianDebugger extends BooleanModule {
   @NotNull
   public static ObsidianDebugger.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private static ObsidianDebugger lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 58049948857874L;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static Map IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashMap(13);

   private ObsidianDebugger() {
      long var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 102891366113614L;
      super("Obsidian Debugger", "Dumps obsidian detection data in 20x20 area when enabled", ModuleCategory.GENERAL, "Dev Modules");
   }

   @Override
   public void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 var1) {
      return new BlockPos((int)Math.floor(var1.x), (int)Math.floor(var1.y), (int)Math.floor(var1.z));
   }

   private final void IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public static final ObsidianDebugger lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI() {
      return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   static {
      long var0 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 50650989946282L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[60];
      int var7 = 0;
      String var6 = "\u0084¢\u0003\u008e\u008fÖÁ9ç\u008a\u009e\u001c;Â5\u0082\u0010¦S|a!³\t(«Ò¥+h\u0018oT(\u001f\u0015\u0086o¡¬ù\u0085v^Lô\u0018¿\u0090\u0082>Úã\u001fy\u0099ÒÁ¸>.ª]\u0084Á\u008f¹Ô\u0010?\u0019W\u0004\u009b`«·X¯½L\u0015±g4¶Vµ\u0093^\r\r\u0018¯\u0099_°h\u0015\u0005pÔ\u0088ÜuY'\tÚ?¸\u0004Ä\"¢\u0090{\u008fS&0\u0012þ°ñ\u00007³¸<Rûî±ÆF½\u0011±\u0093FÚµQ?cpfù¦(L\u008a¡/Ãwe\u001c®«I\u0089´@¯v´Ý\u0088ª8V´\u008bE5¯ì\u0018çÔ\u0095½hw\u0012û\u0015¬\b \u001b\u001f@\u0080 ¬ß\u0001c\u0014\u0002T\u008c\u008dÚ\u009bh|u¼(dÌÄÀJF\u0082c\u0080\u001cuËü\u001e¨ \u0090C²~\u0088Í]kmúºÕ2ß]yÁ(\u009behQöDÉY1ò\bOlu(Ä\u008eo\u0091çpÜ÷$4\u0017«»øSâ`y\u0080ë\u008fÛ-ý§TÖGl-_-¦\u0094GüÞ\u008d\u000f2(\u0090¯\u0012\u0086~ÚxàÌ´\u000f)\u001e\u0089Á¬\u0088÷gÃ7\f\u0099\u009dÌ¤4¶°nß\u0099I\u0090H\u009dè\u001cÞÛ(\u0098\u009f5 à\f\u0088\u0089K\u001e\u0084Råi¾\u009cpöÚ¤61Ç\u008a¦\u0003\u00ad'~9Í\u001c\u0004\u0097^O\u0084ÅIð0ùwr\u0005ä}~Àª\u0087\u009eOõ¯P\u0013\u0099\u0080èuý®\u00991üúÔµ£«<\u008c~#ZiPéYðaQé \u0091üãÒ8¢_ö¢\u0085m\u009eì²\u0098àãç\u008aÐW\u009cÎ4UÞ%Ã\u0002ðÙOúÈ\u0015õÀÓ\u001b$v\u00ad¢\u0099_º¸_v¾ûâñ;£E$=$\u0091ý\u0010\u0001\u0015TuÓ\u0013º\u0095¬?¶ñeg\u00069\u0018gð·1ê)Ùú¯®\u0086¬kßùã\u0001pê0\u0016M$( °ýl\u0002øqjßÚ°`\u009d¡ixp¿2ÖäS\u0091\u009bòæ\u0094ÌÒ~\nÑ÷\u0010æêdç9s\u0084\u000b\u001b\u0012\u0006\u0095xS×\u0013\u0018©a\u008e»;\u009bx$\u008e=ï\tâ\u0099G\u0082ú\rjÀ²Ó\u0098)\u0010:'\u0081.t&é?\"\u009f\u008bÿMí`\u0013\u0018¬s@ÿ¤§\u008c|Ù(M´ãr÷\u008fÖ¨Ñ\u001c\u0087z\u008c\u0090(Ê\u0006\u0004S\u007fË\u0082Ò\u0094¼ªâØ\u0015N\u0098qá!ê¶¾ÍL_2Û|\u0085¨m*\u0082\u00079\u0004\u0080$Å\u008f\u0010vIï/;Ê1\\©\u0015(ÎêÝzá ¿\u000b!BBr*5ctï\u000e\u0097Føð\u0015\u0098Òô\n\t;\u0019ª\u0016·X\u00885\u0092#H\u0094©\u0097õgô·}\u0005vEÍ:×ðWvÌÜ¦\n\u001d\u009drKL\"aQ\u0004\u0001ÃÆ \u009e¾ÿÈÉ\u001c\u0094Hnö£Ñé¨ \u0091¹\u000f¤vY<üL\u0081\u0002Jiñ\u007fO\u000720ã\u0007ký84ïâN3\u009aÃÄ\u0086¥X¶\"T\u0082D\u0086ø´È¯EÆS·\u0011ÊRâÎ\u009c\u0002±\u0088\u008cw°ñ6\r ÐÖ 0\u0014ì\u0080$\u009d²\u0088¤\u0011#J8ÚåE\u007fØn{C?å;\u0014\u001aQ\u0005Qi£\u0087\u008cÛ\u009c¥BkY(Åê\u001bZ\u008dU{Æ>2Ãîb\u0017ùjk6iÔeS¼°\u009eõ(\u0096\u0098\u0010\u0006\u0094[fTø²4!¬Iò]ûÖm0s³ÁaADSû\u0019ÞezÂ\u0005?Â,\u009cÝIÓ¶\u000beg,4®=Yâm®±V8ýª]D~É\u008eaMí0\"8ïÑ\u0094Ú¸p\u0016¥ãõ<[¹\u0081Ó]f\u0004\u0099)6Û\u001e¿»}ª¦\u008dí)\u0096\u0006ï? \u0083æy5\u0093oQáXE¹8ièÇ°§£\u0004> ?\u0082\u007fW\u0084ä\u0090ó\u0007,Í\u0007ÕÈÁ#Ö\u0081¢\u0002#y£A@\u001cK.w¤-=(Ô\u0099\u001côÑîQ\u0090\u0015¼ÓÐË<±Ö®0¼Öå\nP¢D\b0\u0019\r*²\u009b0+ö\u0015«\u0019N÷ s\t\r Q!\u00adºç\u008f\u0016F\u001a+bò\u0081N\u009c#.\u008cojÓ\u008fl\u00151áö\u0092 7êwÈ\u0081ÛÖUg\b\u0003\u0082s³\u001aø«)\u0094\u0095wS0\u0093\u008fà@\u001f\tÂ4ó(\u0089\u00ad7HÁÁ\u0090âbÅb0\u0013nà0å\u000f¾ÑB\u0084¼\r\f\u0006Áê0ÀAÃ\u0002hÙl\u000e\u0086E«\u0018\u0012þÑå\u008fm¡L]èÙÓ\u0098;²¢î(.õ\\YÍ8\u0018Oñ\u001e\u0003\u0010\u0083\u001aß\\\u0014¢¸\u000bäy|\u001f\u0090\\Å\u00945Ô\u0086 (_\u008d<b\u00138!G\u0019(.óãÔpK\n\u0015ÇW¨¸\u0006\u0094þÑU\u0085\u0014%\fPe¶/1\u0004'n{ Ø\tÌ\u0002ÉÁÇóR\u009e¯fÇ°®\u000f\u0092f\u0003%\u0080¨\u0002\u001e\u0000[u\\\u0087´z~||HãjÁ\u0017\u0087ª\u0000ÍJ}äÏa\u009bÙj\u000e|õBÒ\u0095À\n\u007f\u009bÄx\u0019O\u008f1\u0089\u0011\u0085¨\u0010¹êí4ËÏbÂl²5\u0086 \u0005¸\u00898°°³cð3º¨=\u000e¸GÛ¸;ÈAX¿\u0019\u0082\u0088?êò\u0081ÓóÊ\u00161>Cå\u00078L3\u0015E.\u0015\u0084Ä[4ÉqæÕX\u001eÐk×\u001aPÞr\u009eðHz6/ÑÄ\u001a:\u009e¬\u001b \u0083\u0087=0\u009e[WÀ\u0017WÂQO2\u009f]ÐL\u0010©l\u0084\u0088\u008dC3=5ø\u0017·nÙ\u0004ñ:®é{uÊÖ\u0011\u0016â\u0092b\u0004!ºÀx3\u009d/\u0003ð\u009cI\rRÛ\u009e9(¬5\u0003ú\u008fpk\u0002¥\u0092Ïã®\u009c\u008dGwc´\\<1\u0090ù7ÌÖ¹ÀÕÆ£\u0085\u0004\u008c]w´·ð\u0018á\u0095\u0086¤ë\u007f©»<Ô\bXCä©\u0012¢\u0087\u0091\u0098Ôé\u0016#X:\u0011zN¢\"\u0088\u0016\u0007xÿ¬c\u0082[ë\u0010%+ÉvÛÑ\u001c,åþÔæÙhz¸Òny5\u001b¬\u0087\u0080V5\u007fû¹SÍ\\T©UT\u001c5\u0097Ôæ\u0013º\u0087#/\u008b\r\u0014\u0085\u0099\u008c \u001cD¸\n\u00977ë\u0080Ø¯\u0089Ô04\u0089\u0015Ëy(Í0KXüÏ\u008dåòò\u001cË²ï\t¦¡\u009fqÌä-²ÎãdÍ\u0096k\u0082ñqß0Ï\u008f\u009c¸\u007f\u008bXÆÉÂÎ>\u008d¢Ã;ç¹\u009fq\u0014mä;\u0002×\u009eh\u0004a\u0004\u0014¥ÚR\u007f\u001cA\u0091¿\u0004\u008bÿ÷]èÜ@ëx^\u001f\u0012X\u0003é'ÖÍÄ²ý¬ãÓ>°é\u008a\u007f\u0097@\u0000\u0083\n\u0088\u00948æò\u0019JåIò ·;À\u0083KÁâ3,\u0018Ò\u00964\u0089e½\u0005Ieª\\!C\u009cÍ\u0015x\u000b\u0097÷@÷ôV(>ÄV\u0004\u0002ê¡ýÂp©q\u0088»4Ék\u0099[EÛ\u0004qåt|Ð1Þ\u009bïaMÍ9#¢\u0093¤' è¯óAw¿dsp9Ó1YÝyK&%½áx\u0000-?d\u001b\u001aù¡ÊËBHÈ÷°ï$|X î|d\u0003q\u0091oS\u0083S[w±º\u0082\u0096ê.\u001d\t»<3\b\b`³fò\u0010`×\u008f\u0090_1\"5êFZÅ*mîÂ\u0080\u0005\né\u0005S_Öø\u0093\u00966ó\u0019ôDb¯@\u007fèw\u0015ÑÛ#\u0018õhPºØ\u0086\u007f}5\u001ba\u000b\u0014\r\rÅ¤@od~±¸µhA×ïm\"^\u008c/Jl\u008fÞªßíèÉ~Gzú~üÅº%<M¿×f(áZ¾6NvO¾\u0003,\u008erbëóì\u009f\u0019ügÏ$Â\u0003)\u0094¸û\r£\u0019bRîyáCÙ&\u0006 ¢\u009b¯Éæ\u000fòÃWÞ¡\u0089vÍø\u008f\u009ahW¦Ä$\u0017á\ro¿K2dÞ\u0081 Vk£\u001b¼\u0091nd#ÿÎ\u0092Z{©\u00046ô\bf¥£äëÒIv\u008e½\u008d@\u009c\u0010X\u0015¢îË,\u001a!B\u001bîïk\"²*h¢ýaîÓ\u0086Úx· \u0005Íd'nê{Ø-ü\u0087è\u0096e\u0004¢ï²d\u008do~»Ý\u0014ñ.\blÅl\u0094#©YÞ\u001fÑ+Ì\u0089ÞÎI\u0098ô\u001b¬´\u008agÆ\u0003Å\u009a\u0083\u0096ÿÝàÂ\u009d\u0098½µ°'\u009eþTL÷Ó[\u0088\u0087\u001c¨jV*ãj\u0004®:.\u008fü\u0017É\u001b\u008d\u0082 áx_\u0017KhA\u0000à-SNÐ\u001d2\u0013\u0015\u001a[¸îÝ`²Y$SW\u0011$¸Ô\u0010K\b\u001aí\f<EgêåF\u0083-\u0093\u0089\u0082(Úé\u0080CQð¼AQK¡^É7>`¬¹\u009f;mðLlU·\u000bQíSð\u0001M-§}:²\u008c~\u0018C'2\u0015ñ÷\u008dg+C³°\u0093\u0082E\u0083ÐFp\u0091\u000e~.N";
      int var8 = "\u0084¢\u0003\u008e\u008fÖÁ9ç\u008a\u009e\u001c;Â5\u0082\u0010¦S|a!³\t(«Ò¥+h\u0018oT(\u001f\u0015\u0086o¡¬ù\u0085v^Lô\u0018¿\u0090\u0082>Úã\u001fy\u0099ÒÁ¸>.ª]\u0084Á\u008f¹Ô\u0010?\u0019W\u0004\u009b`«·X¯½L\u0015±g4¶Vµ\u0093^\r\r\u0018¯\u0099_°h\u0015\u0005pÔ\u0088ÜuY'\tÚ?¸\u0004Ä\"¢\u0090{\u008fS&0\u0012þ°ñ\u00007³¸<Rûî±ÆF½\u0011±\u0093FÚµQ?cpfù¦(L\u008a¡/Ãwe\u001c®«I\u0089´@¯v´Ý\u0088ª8V´\u008bE5¯ì\u0018çÔ\u0095½hw\u0012û\u0015¬\b \u001b\u001f@\u0080 ¬ß\u0001c\u0014\u0002T\u008c\u008dÚ\u009bh|u¼(dÌÄÀJF\u0082c\u0080\u001cuËü\u001e¨ \u0090C²~\u0088Í]kmúºÕ2ß]yÁ(\u009behQöDÉY1ò\bOlu(Ä\u008eo\u0091çpÜ÷$4\u0017«»øSâ`y\u0080ë\u008fÛ-ý§TÖGl-_-¦\u0094GüÞ\u008d\u000f2(\u0090¯\u0012\u0086~ÚxàÌ´\u000f)\u001e\u0089Á¬\u0088÷gÃ7\f\u0099\u009dÌ¤4¶°nß\u0099I\u0090H\u009dè\u001cÞÛ(\u0098\u009f5 à\f\u0088\u0089K\u001e\u0084Råi¾\u009cpöÚ¤61Ç\u008a¦\u0003\u00ad'~9Í\u001c\u0004\u0097^O\u0084ÅIð0ùwr\u0005ä}~Àª\u0087\u009eOõ¯P\u0013\u0099\u0080èuý®\u00991üúÔµ£«<\u008c~#ZiPéYðaQé \u0091üãÒ8¢_ö¢\u0085m\u009eì²\u0098àãç\u008aÐW\u009cÎ4UÞ%Ã\u0002ðÙOúÈ\u0015õÀÓ\u001b$v\u00ad¢\u0099_º¸_v¾ûâñ;£E$=$\u0091ý\u0010\u0001\u0015TuÓ\u0013º\u0095¬?¶ñeg\u00069\u0018gð·1ê)Ùú¯®\u0086¬kßùã\u0001pê0\u0016M$( °ýl\u0002øqjßÚ°`\u009d¡ixp¿2ÖäS\u0091\u009bòæ\u0094ÌÒ~\nÑ÷\u0010æêdç9s\u0084\u000b\u001b\u0012\u0006\u0095xS×\u0013\u0018©a\u008e»;\u009bx$\u008e=ï\tâ\u0099G\u0082ú\rjÀ²Ó\u0098)\u0010:'\u0081.t&é?\"\u009f\u008bÿMí`\u0013\u0018¬s@ÿ¤§\u008c|Ù(M´ãr÷\u008fÖ¨Ñ\u001c\u0087z\u008c\u0090(Ê\u0006\u0004S\u007fË\u0082Ò\u0094¼ªâØ\u0015N\u0098qá!ê¶¾ÍL_2Û|\u0085¨m*\u0082\u00079\u0004\u0080$Å\u008f\u0010vIï/;Ê1\\©\u0015(ÎêÝzá ¿\u000b!BBr*5ctï\u000e\u0097Føð\u0015\u0098Òô\n\t;\u0019ª\u0016·X\u00885\u0092#H\u0094©\u0097õgô·}\u0005vEÍ:×ðWvÌÜ¦\n\u001d\u009drKL\"aQ\u0004\u0001ÃÆ \u009e¾ÿÈÉ\u001c\u0094Hnö£Ñé¨ \u0091¹\u000f¤vY<üL\u0081\u0002Jiñ\u007fO\u000720ã\u0007ký84ïâN3\u009aÃÄ\u0086¥X¶\"T\u0082D\u0086ø´È¯EÆS·\u0011ÊRâÎ\u009c\u0002±\u0088\u008cw°ñ6\r ÐÖ 0\u0014ì\u0080$\u009d²\u0088¤\u0011#J8ÚåE\u007fØn{C?å;\u0014\u001aQ\u0005Qi£\u0087\u008cÛ\u009c¥BkY(Åê\u001bZ\u008dU{Æ>2Ãîb\u0017ùjk6iÔeS¼°\u009eõ(\u0096\u0098\u0010\u0006\u0094[fTø²4!¬Iò]ûÖm0s³ÁaADSû\u0019ÞezÂ\u0005?Â,\u009cÝIÓ¶\u000beg,4®=Yâm®±V8ýª]D~É\u008eaMí0\"8ïÑ\u0094Ú¸p\u0016¥ãõ<[¹\u0081Ó]f\u0004\u0099)6Û\u001e¿»}ª¦\u008dí)\u0096\u0006ï? \u0083æy5\u0093oQáXE¹8ièÇ°§£\u0004> ?\u0082\u007fW\u0084ä\u0090ó\u0007,Í\u0007ÕÈÁ#Ö\u0081¢\u0002#y£A@\u001cK.w¤-=(Ô\u0099\u001côÑîQ\u0090\u0015¼ÓÐË<±Ö®0¼Öå\nP¢D\b0\u0019\r*²\u009b0+ö\u0015«\u0019N÷ s\t\r Q!\u00adºç\u008f\u0016F\u001a+bò\u0081N\u009c#.\u008cojÓ\u008fl\u00151áö\u0092 7êwÈ\u0081ÛÖUg\b\u0003\u0082s³\u001aø«)\u0094\u0095wS0\u0093\u008fà@\u001f\tÂ4ó(\u0089\u00ad7HÁÁ\u0090âbÅb0\u0013nà0å\u000f¾ÑB\u0084¼\r\f\u0006Áê0ÀAÃ\u0002hÙl\u000e\u0086E«\u0018\u0012þÑå\u008fm¡L]èÙÓ\u0098;²¢î(.õ\\YÍ8\u0018Oñ\u001e\u0003\u0010\u0083\u001aß\\\u0014¢¸\u000bäy|\u001f\u0090\\Å\u00945Ô\u0086 (_\u008d<b\u00138!G\u0019(.óãÔpK\n\u0015ÇW¨¸\u0006\u0094þÑU\u0085\u0014%\fPe¶/1\u0004'n{ Ø\tÌ\u0002ÉÁÇóR\u009e¯fÇ°®\u000f\u0092f\u0003%\u0080¨\u0002\u001e\u0000[u\\\u0087´z~||HãjÁ\u0017\u0087ª\u0000ÍJ}äÏa\u009bÙj\u000e|õBÒ\u0095À\n\u007f\u009bÄx\u0019O\u008f1\u0089\u0011\u0085¨\u0010¹êí4ËÏbÂl²5\u0086 \u0005¸\u00898°°³cð3º¨=\u000e¸GÛ¸;ÈAX¿\u0019\u0082\u0088?êò\u0081ÓóÊ\u00161>Cå\u00078L3\u0015E.\u0015\u0084Ä[4ÉqæÕX\u001eÐk×\u001aPÞr\u009eðHz6/ÑÄ\u001a:\u009e¬\u001b \u0083\u0087=0\u009e[WÀ\u0017WÂQO2\u009f]ÐL\u0010©l\u0084\u0088\u008dC3=5ø\u0017·nÙ\u0004ñ:®é{uÊÖ\u0011\u0016â\u0092b\u0004!ºÀx3\u009d/\u0003ð\u009cI\rRÛ\u009e9(¬5\u0003ú\u008fpk\u0002¥\u0092Ïã®\u009c\u008dGwc´\\<1\u0090ù7ÌÖ¹ÀÕÆ£\u0085\u0004\u008c]w´·ð\u0018á\u0095\u0086¤ë\u007f©»<Ô\bXCä©\u0012¢\u0087\u0091\u0098Ôé\u0016#X:\u0011zN¢\"\u0088\u0016\u0007xÿ¬c\u0082[ë\u0010%+ÉvÛÑ\u001c,åþÔæÙhz¸Òny5\u001b¬\u0087\u0080V5\u007fû¹SÍ\\T©UT\u001c5\u0097Ôæ\u0013º\u0087#/\u008b\r\u0014\u0085\u0099\u008c \u001cD¸\n\u00977ë\u0080Ø¯\u0089Ô04\u0089\u0015Ëy(Í0KXüÏ\u008dåòò\u001cË²ï\t¦¡\u009fqÌä-²ÎãdÍ\u0096k\u0082ñqß0Ï\u008f\u009c¸\u007f\u008bXÆÉÂÎ>\u008d¢Ã;ç¹\u009fq\u0014mä;\u0002×\u009eh\u0004a\u0004\u0014¥ÚR\u007f\u001cA\u0091¿\u0004\u008bÿ÷]èÜ@ëx^\u001f\u0012X\u0003é'ÖÍÄ²ý¬ãÓ>°é\u008a\u007f\u0097@\u0000\u0083\n\u0088\u00948æò\u0019JåIò ·;À\u0083KÁâ3,\u0018Ò\u00964\u0089e½\u0005Ieª\\!C\u009cÍ\u0015x\u000b\u0097÷@÷ôV(>ÄV\u0004\u0002ê¡ýÂp©q\u0088»4Ék\u0099[EÛ\u0004qåt|Ð1Þ\u009bïaMÍ9#¢\u0093¤' è¯óAw¿dsp9Ó1YÝyK&%½áx\u0000-?d\u001b\u001aù¡ÊËBHÈ÷°ï$|X î|d\u0003q\u0091oS\u0083S[w±º\u0082\u0096ê.\u001d\t»<3\b\b`³fò\u0010`×\u008f\u0090_1\"5êFZÅ*mîÂ\u0080\u0005\né\u0005S_Öø\u0093\u00966ó\u0019ôDb¯@\u007fèw\u0015ÑÛ#\u0018õhPºØ\u0086\u007f}5\u001ba\u000b\u0014\r\rÅ¤@od~±¸µhA×ïm\"^\u008c/Jl\u008fÞªßíèÉ~Gzú~üÅº%<M¿×f(áZ¾6NvO¾\u0003,\u008erbëóì\u009f\u0019ügÏ$Â\u0003)\u0094¸û\r£\u0019bRîyáCÙ&\u0006 ¢\u009b¯Éæ\u000fòÃWÞ¡\u0089vÍø\u008f\u009ahW¦Ä$\u0017á\ro¿K2dÞ\u0081 Vk£\u001b¼\u0091nd#ÿÎ\u0092Z{©\u00046ô\bf¥£äëÒIv\u008e½\u008d@\u009c\u0010X\u0015¢îË,\u001a!B\u001bîïk\"²*h¢ýaîÓ\u0086Úx· \u0005Íd'nê{Ø-ü\u0087è\u0096e\u0004¢ï²d\u008do~»Ý\u0014ñ.\blÅl\u0094#©YÞ\u001fÑ+Ì\u0089ÞÎI\u0098ô\u001b¬´\u008agÆ\u0003Å\u009a\u0083\u0096ÿÝàÂ\u009d\u0098½µ°'\u009eþTL÷Ó[\u0088\u0087\u001c¨jV*ãj\u0004®:.\u008fü\u0017É\u001b\u008d\u0082 áx_\u0017KhA\u0000à-SNÐ\u001d2\u0013\u0015\u001a[¸îÝ`²Y$SW\u0011$¸Ô\u0010K\b\u001aí\f<EgêåF\u0083-\u0093\u0089\u0082(Úé\u0080CQð¼AQK¡^É7>`¬¹\u009f;mðLlU·\u000bQíSð\u0001M-§}:²\u008c~\u0018C'2\u0015ñ÷\u008dg+C³°\u0093\u0082E\u0083ÐFp\u0091\u000e~.N"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "`uD#'F\"Wv³\u0003\u0007SÈÎÊnAÏá\u00808\u008a0\u009c±R.8&\u0095·\u0019]/8Ù}H\u0092ïÉ\b\u009fý©\u001b\u008ds!\u008a!K{\u0014â\u0010æG²ù¯\u0080\u001bG»\u009cÊ\u0005\u009f\u0007\u0011¦";
            var8 = "`uD#'F\"Wv³\u0003\u0007SÈÎÊnAÏá\u00808\u008a0\u009c±R.8&\u0095·\u0019]/8Ù}H\u0092ïÉ\b\u009fý©\u001b\u008ds!\u008a!K{\u0014â\u0010æG²ù¯\u0080\u001bG»\u009cÊ\u0005\u009f\u0007\u0011¦"
               .length();
            var5 = '8';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9;
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new String[60];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new ObsidianDebugger.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new ObsidianDebugger();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29373;
      if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
         byte[] var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5].getBytes("ISO-8859-1");
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5];
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
            "me/octo/client/modules/impl/features/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final ObsidianDebugger IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return ObsidianDebugger.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }
   }
}
