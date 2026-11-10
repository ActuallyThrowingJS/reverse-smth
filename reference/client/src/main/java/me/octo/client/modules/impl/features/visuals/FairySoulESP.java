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
import kotlin.jvm.JvmField;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import net.minecraft.world.entity.decoration.ArmorStand;
import org.jetbrains.annotations.NotNull;

public final class FairySoulESP extends BooleanModule {
   @NotNull
   public static FairySoulESP.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static FairySoulESP lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static String lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static long IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 97293620551332L;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static Map IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new HashMap(13);

   private FairySoulESP() {
      long var1 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 27437192626363L;
      ModuleCategory var10003 = ModuleCategory.VISUALS;
      Setting[] var3 = new Setting[]{
         lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Fairy Soul ESP", "Shows Fairy Soul locations", var10003, "ESP", var3);
   }

   @SubscribeEvent(priority = EventPriority.HIGH)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(ArmorStand param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl ^ 132345469992434L;
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
      String var6 = "A¦ö\u001b\u0099\bÀ\u001c*¼°F_ `¢\u0001¦MkÈW\u008d\u009a\n»Ðpñÿ\u008fè\u0010§ª×\u001c)\u0095R\u008b&.\u0003ï\u007fß\u0001§\u0010\u0002\u000f©²âS\u007fûxãýb\u009bìH\u001d(\u000e\n\u0012X\u008crt4RÍYãÂ]\u009bl#\u0095§\u0013Ì\tñ\u001dÏæÆk\u009bë1Vè\u009f\u0083\u007f³|¹´(\u0083°ü\u008b\u0011óÖ.?Î¥Ï5Î¤h#\u0011\u0007\u001c(Zª[P\u0087ãâÛao+>\u0093\u001a/Þ\u0014sG0\u0005z\u009c\u0012;(c8\u008e\u0098\u0016\u0082KÄ\u009a\u0087P@\u009cë¯î Q\rpù\u009ewÁÝ\u009b\u0010\u008cöû|\f-\u009e.NNøÒ\"Å\u009fȐÃ¬mQ×ÎKP+\u008b\u001dL\r\u0015ÌÃ«°\u0086B\u0007E³Ûj\u0096ü¡üAQ1z\u008a° \u0016\u0019\u0087>³4\u0017ª\u0085és±\u0084\u0012\u0001®\u001e\u0091\u0085\u0082B\\Y£\u0002n\u0095t|6rýÚÎßrPN\u0001Æ®p ÇsD\u0019=&ÚbÞT\tT÷\u0005è}¿\u008aW]\u009dpÙÉÿ13òyØÉ\u009c¹\\vcVÊ\u001c³þi\u0091û§\u0017\u0005\u0097 Ü%êlÍ\u0089·±<\u0081iþßÇ¥!ßUlãAòÀ=5 U\u0094\u00148]èvËñAdï'\u0091\u001fÛ*í\u0019\r\u0006+¿\u000b\u008fJ\u0003Õ\u009aÕÍø@7Ud]\u000e¹\u00ad\u0011\u0007dWß¨\u0093E\u00ad)ë¬æ=ñXfacEzò\u0093Ëâ'BC\u00ad\u0083ë¼èøaR\u008e\u001f\u001cØí\u0007ñÓ¯³\tù\u000e\u0098¯ô#Îþ¨¢\u0086\u000fûîÏÃ\u009døGSÍBÞ\u008aþ>:\u0099À§å·æhs1ú\u0003+PÍ}Ù»>Ñ:\u008c¤Tõ]\\QxZ|$\u0001\u00adcfÍV\u001e ^´u\u0010O\u0000\\\u009f\u0011\u0089ú|}î\u0002\fb\u0088s\u0086K\u0006fìïPÀÅ\u007f\u0002\u0088z\u000fDÐµ-Ç\u0001\u0013D;9\u0097²_ü»m\u00ad¸7Ù¸\u009e±_¯\u007f@Ä\u001bqP\u0005·\u0093ÀyË\u009c$ü\u0093\u0083\u0089gS7¨\u0096¡\fv\u0080kÚ¤&ü/\u009fS÷é\u0001|CÃ\u0018.{\u0087\u0017ô§®Áìy\u0089z\u0098¼ã\fN&D@¬¹pÌÞ5Ëpë%R6\u0001m\u0006Ü\u00977\u008fp\u0080ù\u009dåWÕÝ\u00065rÅÆ\u0000°^»¹ªWÔÝd7~®Øb«Ð\u0087çü5Ëñj^Xí¢àâP\u009eS\u009dîÃ´={Ú\u009füÏ\u0002¦Ç×X}+¥ÝhÛ¦j\u0017è\"Â^J-0FP\u0003IùȀ\u0011þØ\u008f\u001eÆÍþ\u0080\u0083J[]ÆP\u0097¨HKl·º¸\u009c\u0094¤H\u0088[\u0014n\u0017Ë=Ãä\u0016\u0013gë+ó±öUþg\u000e;åÚÎmn>¡\u009d¼5\u0083\\\u0092êAÞÎý\u001c\u0082ã\u008e\u0093Ç\f\u008a1%D\u0089\b.«.)¨;\u007f#t-TuBb\u0092¿\u0013Õ\u008e\u0099\u0086õ$hÄ\u0001\u0098¸<ê\u0010¹©vÀèÝW;×o\u008eÈ/\u008f°ÐÁûc/\u000eä¸\u0095\u001dÍ\u0086\u0095\u0013\u001b\n\u001bQ#\u001eG\u0006ý\u0010V°\u0001°Ñ\u0089\u000fÁµ¦<»¹\u007fAD\u0096\u0086ï54ºg\u008bo\u0004\u001c\u009f<¹¥t¦ØSª @±÷µ\u009b!xn51çÑ²kyf\u008dUV2\u0015ÝçÍå«\u0080HK5\u001dMì+\"ôô\u0016\\2J´ÒDWOÓ\u009a¬t\u0010\rg\u0083\u0093\u0007Ø@YYN\u008e\u0003÷ûQõ\u0086}ÅC°ÈDú\u0016¶ba\u001eÉ)Xä\u009b\u001aÝï¿a\u0094[`3\u0013÷¯ê\u009a\u0004!w\u0002\u0092öÐhèXT\b²Ê-Êa}¥\u0012\u0016 ÷Û\u0095?\b!\u009dþX\u0005\u0003³{{×È\u0019\u001e·\u0082|áÊû`ùJ8z\u0081\u0082Üõ\b~wÌ\u0084~q½#\u008a<¾±\r+w\u009flw&f~¦Â\u0012ø,\u0007\u0091B©¹üj\u001e?õÝ\u00014!\u0001LÊ\u0093sm\u0093\u000fîª;uÃg\u0010\u0011¢B'\u0007\u000f«©\u0006\u00998×§Þ¢Rño(N³\u0098¨T\u00833\u0080üDÀaXhQ6\u0086ëIÔbz¨¿¯5\u000b\u0004½¤\u001fLe\u001f?\u000e^Å°¡X\u001e±KY\u008f©·Âuý\u0000\u001e\u0097dö\u009c:)%\u001cÌo¶ÿí\u0092\u0016zÏt\u0081óIQ\u001aÒ\u0082j\u0095\u0005{\u008dÿg\u0018ù@\u0011I\u0019Å?õ÷æ #\u008d*Ú\u009e^\u0097ú¤\u0086È×K9[\u0014×öé\u00039\u000e\u0085$LL\u0015õ\u0085¢¤: hàÑ*\bR\rCÚbê ,\u001emZ¯DÎ\u0082Õ\u0083¸'e\u009ex\u001f»ex¼\u0010ë¯àÑ\n+÷í\u007fÒUópÿ¿,\u0018ù)`Õ\u00958ÿ\f¢\u0082ÎÍV;\tûY!Ã\fI$üò(Ø§\u008bäæª!\u0097qGÕ\b\u001bv\u0081ý\u009f·Ý}Eæ\u008d40î2¡}\u0085j'b!=\u000fE\u0088P\u0011\u0018Ä\u0089V\b±\u009e*9\u008cò$%I\u000b<¾ÁÖÍ¼\u000b»Kê(i¼'\u0093»ùl¾'/*K=ÙÏÔ¢\u0007xL\u007fû\u0013\u0004s5R\u0094\u009e;ÙM\u0092(?P\u001d\u0092\u0018iȈàH¶[^\u009f\u0015\u0019\r \u009b\u001cÐ\u0015¹QÑ/*ñ\u00040äú]Ë5ïØ\u0011\u0098\u000e|\u000b\u0011\u0018Ý>OÄ-Aî\tÓè,À¥\u008bÝÕ¢3\u0082\u009af^\u0017Õ\u008c\u008eQ\u0093,ñ´´\u0080\\Ù\u0099<±Y¡Y\u0094¶b\u0084_h8\u0011KÂÿÀ\u0096»:uÕ#÷4_\u0094o\u0005\u009bðÎb|\u0017%ãÇ©ÑÈþBS\u00adØ~\u0088\u0092å}\u0088\"9Î\u008f¸t×´ÙÞé\u001dQ\u008ai\u0005\u001cºÚì^ä\u0010´\u0090J$ßíu»òù\u0091\u0097K\u0084ôê\u0083§cï\u0019Ýg\u0088\u008bD\u0096C\u008eÁ@\u009e\fFKàr\u0095_\u009fù>p®÷ !\b\u009eÿ³\u00986\u008c\u0098 \u0086Íô\u009fçF\\\u000f\u009eÉni\u0093Ä±\u009b§þzêîÊ£@|IZº½\u0094\b È\u008b½\t\nà¥÷\u001flXM\u0014©µ\u0085Ä,\u000e@5D3W\u0082\u001a(\u0082Ô'\u0017\u0085\u0014k\u008bAàþ\u0006}\u0083*åï\u009985£¼0ÔÄ\u008eô{Ö®N_Ë\u0085W\u008f\u0089èÌ\u0007¬=íÉ&\u0096i¥×\u0014²¤,rÚ!8\u0005\u0010n\u0087\u001a\u0090\u001fõY\u009f}p\u008c\u0083G;÷+\u001d|l?x\u001b\u0082¾\u0081wé&\u009b¢²¾\u0005á¼ 58\u008då\u001fû\u0083g`Ó\u0080£i¬õºý/¡\u001f\u0002o°c²ìö¥Ö#\nu\u0095Ô\u0018¤fh.!\u0006f¥\n+p\u0090\u009c/§\u009cMgÓ§Yº\u008b+úçÚ-1\u009a\u001e\u009d\u0085·×»ì\u0017¨ÄQÍj.\u008f±\u008dÏ\u00adÙà\u0016\u000fÁaÏáè¨eKXç\u008b\u008e¼|¹\u0002[K \u0088a{\u00974+¬\u008dû\u0080§8\u009fÄ\b§µv\u0017\u0019)+þHCnr}\u0090ÿ~\u000f\u0085·þ\u0001¡»_Ì7cLD\u008fÍ9°#\u0017\u0099êa>Ò\u0005";
      int var8 = "A¦ö\u001b\u0099\bÀ\u001c*¼°F_ `¢\u0001¦MkÈW\u008d\u009a\n»Ðpñÿ\u008fè\u0010§ª×\u001c)\u0095R\u008b&.\u0003ï\u007fß\u0001§\u0010\u0002\u000f©²âS\u007fûxãýb\u009bìH\u001d(\u000e\n\u0012X\u008crt4RÍYãÂ]\u009bl#\u0095§\u0013Ì\tñ\u001dÏæÆk\u009bë1Vè\u009f\u0083\u007f³|¹´(\u0083°ü\u008b\u0011óÖ.?Î¥Ï5Î¤h#\u0011\u0007\u001c(Zª[P\u0087ãâÛao+>\u0093\u001a/Þ\u0014sG0\u0005z\u009c\u0012;(c8\u008e\u0098\u0016\u0082KÄ\u009a\u0087P@\u009cë¯î Q\rpù\u009ewÁÝ\u009b\u0010\u008cöû|\f-\u009e.NNøÒ\"Å\u009fȐÃ¬mQ×ÎKP+\u008b\u001dL\r\u0015ÌÃ«°\u0086B\u0007E³Ûj\u0096ü¡üAQ1z\u008a° \u0016\u0019\u0087>³4\u0017ª\u0085és±\u0084\u0012\u0001®\u001e\u0091\u0085\u0082B\\Y£\u0002n\u0095t|6rýÚÎßrPN\u0001Æ®p ÇsD\u0019=&ÚbÞT\tT÷\u0005è}¿\u008aW]\u009dpÙÉÿ13òyØÉ\u009c¹\\vcVÊ\u001c³þi\u0091û§\u0017\u0005\u0097 Ü%êlÍ\u0089·±<\u0081iþßÇ¥!ßUlãAòÀ=5 U\u0094\u00148]èvËñAdï'\u0091\u001fÛ*í\u0019\r\u0006+¿\u000b\u008fJ\u0003Õ\u009aÕÍø@7Ud]\u000e¹\u00ad\u0011\u0007dWß¨\u0093E\u00ad)ë¬æ=ñXfacEzò\u0093Ëâ'BC\u00ad\u0083ë¼èøaR\u008e\u001f\u001cØí\u0007ñÓ¯³\tù\u000e\u0098¯ô#Îþ¨¢\u0086\u000fûîÏÃ\u009døGSÍBÞ\u008aþ>:\u0099À§å·æhs1ú\u0003+PÍ}Ù»>Ñ:\u008c¤Tõ]\\QxZ|$\u0001\u00adcfÍV\u001e ^´u\u0010O\u0000\\\u009f\u0011\u0089ú|}î\u0002\fb\u0088s\u0086K\u0006fìïPÀÅ\u007f\u0002\u0088z\u000fDÐµ-Ç\u0001\u0013D;9\u0097²_ü»m\u00ad¸7Ù¸\u009e±_¯\u007f@Ä\u001bqP\u0005·\u0093ÀyË\u009c$ü\u0093\u0083\u0089gS7¨\u0096¡\fv\u0080kÚ¤&ü/\u009fS÷é\u0001|CÃ\u0018.{\u0087\u0017ô§®Áìy\u0089z\u0098¼ã\fN&D@¬¹pÌÞ5Ëpë%R6\u0001m\u0006Ü\u00977\u008fp\u0080ù\u009dåWÕÝ\u00065rÅÆ\u0000°^»¹ªWÔÝd7~®Øb«Ð\u0087çü5Ëñj^Xí¢àâP\u009eS\u009dîÃ´={Ú\u009füÏ\u0002¦Ç×X}+¥ÝhÛ¦j\u0017è\"Â^J-0FP\u0003IùȀ\u0011þØ\u008f\u001eÆÍþ\u0080\u0083J[]ÆP\u0097¨HKl·º¸\u009c\u0094¤H\u0088[\u0014n\u0017Ë=Ãä\u0016\u0013gë+ó±öUþg\u000e;åÚÎmn>¡\u009d¼5\u0083\\\u0092êAÞÎý\u001c\u0082ã\u008e\u0093Ç\f\u008a1%D\u0089\b.«.)¨;\u007f#t-TuBb\u0092¿\u0013Õ\u008e\u0099\u0086õ$hÄ\u0001\u0098¸<ê\u0010¹©vÀèÝW;×o\u008eÈ/\u008f°ÐÁûc/\u000eä¸\u0095\u001dÍ\u0086\u0095\u0013\u001b\n\u001bQ#\u001eG\u0006ý\u0010V°\u0001°Ñ\u0089\u000fÁµ¦<»¹\u007fAD\u0096\u0086ï54ºg\u008bo\u0004\u001c\u009f<¹¥t¦ØSª @±÷µ\u009b!xn51çÑ²kyf\u008dUV2\u0015ÝçÍå«\u0080HK5\u001dMì+\"ôô\u0016\\2J´ÒDWOÓ\u009a¬t\u0010\rg\u0083\u0093\u0007Ø@YYN\u008e\u0003÷ûQõ\u0086}ÅC°ÈDú\u0016¶ba\u001eÉ)Xä\u009b\u001aÝï¿a\u0094[`3\u0013÷¯ê\u009a\u0004!w\u0002\u0092öÐhèXT\b²Ê-Êa}¥\u0012\u0016 ÷Û\u0095?\b!\u009dþX\u0005\u0003³{{×È\u0019\u001e·\u0082|áÊû`ùJ8z\u0081\u0082Üõ\b~wÌ\u0084~q½#\u008a<¾±\r+w\u009flw&f~¦Â\u0012ø,\u0007\u0091B©¹üj\u001e?õÝ\u00014!\u0001LÊ\u0093sm\u0093\u000fîª;uÃg\u0010\u0011¢B'\u0007\u000f«©\u0006\u00998×§Þ¢Rño(N³\u0098¨T\u00833\u0080üDÀaXhQ6\u0086ëIÔbz¨¿¯5\u000b\u0004½¤\u001fLe\u001f?\u000e^Å°¡X\u001e±KY\u008f©·Âuý\u0000\u001e\u0097dö\u009c:)%\u001cÌo¶ÿí\u0092\u0016zÏt\u0081óIQ\u001aÒ\u0082j\u0095\u0005{\u008dÿg\u0018ù@\u0011I\u0019Å?õ÷æ #\u008d*Ú\u009e^\u0097ú¤\u0086È×K9[\u0014×öé\u00039\u000e\u0085$LL\u0015õ\u0085¢¤: hàÑ*\bR\rCÚbê ,\u001emZ¯DÎ\u0082Õ\u0083¸'e\u009ex\u001f»ex¼\u0010ë¯àÑ\n+÷í\u007fÒUópÿ¿,\u0018ù)`Õ\u00958ÿ\f¢\u0082ÎÍV;\tûY!Ã\fI$üò(Ø§\u008bäæª!\u0097qGÕ\b\u001bv\u0081ý\u009f·Ý}Eæ\u008d40î2¡}\u0085j'b!=\u000fE\u0088P\u0011\u0018Ä\u0089V\b±\u009e*9\u008cò$%I\u000b<¾ÁÖÍ¼\u000b»Kê(i¼'\u0093»ùl¾'/*K=ÙÏÔ¢\u0007xL\u007fû\u0013\u0004s5R\u0094\u009e;ÙM\u0092(?P\u001d\u0092\u0018iȈàH¶[^\u009f\u0015\u0019\r \u009b\u001cÐ\u0015¹QÑ/*ñ\u00040äú]Ë5ïØ\u0011\u0098\u000e|\u000b\u0011\u0018Ý>OÄ-Aî\tÓè,À¥\u008bÝÕ¢3\u0082\u009af^\u0017Õ\u008c\u008eQ\u0093,ñ´´\u0080\\Ù\u0099<±Y¡Y\u0094¶b\u0084_h8\u0011KÂÿÀ\u0096»:uÕ#÷4_\u0094o\u0005\u009bðÎb|\u0017%ãÇ©ÑÈþBS\u00adØ~\u0088\u0092å}\u0088\"9Î\u008f¸t×´ÙÞé\u001dQ\u008ai\u0005\u001cºÚì^ä\u0010´\u0090J$ßíu»òù\u0091\u0097K\u0084ôê\u0083§cï\u0019Ýg\u0088\u008bD\u0096C\u008eÁ@\u009e\fFKàr\u0095_\u009fù>p®÷ !\b\u009eÿ³\u00986\u008c\u0098 \u0086Íô\u009fçF\\\u000f\u009eÉni\u0093Ä±\u009b§þzêîÊ£@|IZº½\u0094\b È\u008b½\t\nà¥÷\u001flXM\u0014©µ\u0085Ä,\u000e@5D3W\u0082\u001a(\u0082Ô'\u0017\u0085\u0014k\u008bAàþ\u0006}\u0083*åï\u009985£¼0ÔÄ\u008eô{Ö®N_Ë\u0085W\u008f\u0089èÌ\u0007¬=íÉ&\u0096i¥×\u0014²¤,rÚ!8\u0005\u0010n\u0087\u001a\u0090\u001fõY\u009f}p\u008c\u0083G;÷+\u001d|l?x\u001b\u0082¾\u0081wé&\u009b¢²¾\u0005á¼ 58\u008då\u001fû\u0083g`Ó\u0080£i¬õºý/¡\u001f\u0002o°c²ìö¥Ö#\nu\u0095Ô\u0018¤fh.!\u0006f¥\n+p\u0090\u009c/§\u009cMgÓ§Yº\u008b+úçÚ-1\u009a\u001e\u009d\u0085·×»ì\u0017¨ÄQÍj.\u008f±\u008dÏ\u00adÙà\u0016\u000fÁaÏáè¨eKXç\u008b\u008e¼|¹\u0002[K \u0088a{\u00974+¬\u008dû\u0080§8\u009fÄ\b§µv\u0017\u0019)+þHCnr}\u0090ÿ~\u000f\u0085·þ\u0001¡»_Ì7cLD\u008fÍ9°#\u0017\u0099êa>Ò\u0005"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "ré6Æ,\u0082\u0014J\u0001UfC?Cf5ÇÃ«¼BJ\u0098Öh[ÃZ\\=ç¢ Ô^ï \u0002®\u00ad\u0011\r¿*\u008a\u001a\u001fJsW2\u0013s¶Ô\u0001!bBýWL\u000b¼\u0001";
            var8 = "ré6Æ,\u0082\u0014J\u0001UfC?Cf5ÇÃ«¼BJ\u0098Öh[ÃZ\\=ç¢ Ô^ï \u0002®\u00ad\u0011\r¿*\u008a\u001a\u001fJsW2\u0013s¶Ô\u0001!bBýWL\u000b¼\u0001"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var9;
                  IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new String[18];
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = "eyJ0aW1lc3RhbXAiOjE1ODY2NjcxNjgzNzksInByb2ZpbGVJZCI6ImJlY2RkYjI4YTJjODQ5YjRhOWIwOTIyYTU4MDUxNDIwIiwicHJvZmlsZU5hbWUiOiJTdFR2Iiwic2lnbmF0dXJlUmVxdWlyZWQiOnRydWUsInRleHR1cmVzIjp7IlNLSU4iOnsidXJsIjoiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yOTllYTEyMGJkODNkMGM4MWEzYzQ2MjdmNWJjZTFiMTJmYjAzYmNiNTc3NzljNjNkY2M3N2UzZjRhZThhNzkzIn19fQ==";
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new FairySoulESP.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new FairySoulESP();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18033;
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
               "me/octo/client/modules/impl/features/visuals/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
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
            "me/octo/client/modules/impl/features/visuals/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c515b39e1c3003c7(
      ArmorStand param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
