package me.octo.client.modules.helpers.general;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.random.Random;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.modules.impl.features.misc.IgnoreEntities;
import me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
   extends me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   @NotNull
   private final ArrayList<String> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private List<String> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private List<String> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private int IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final Vec3 llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final BlockPos IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   @NotNull
   private final Vec3 IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   @NotNull
   private final BlockPos IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private boolean IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private int llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   @Nullable
   private me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   @NotNull
   private static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   @NotNull
   private static llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   private static long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = 87775551756737L;
   private static String[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static String[] IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private static Map IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = new HashMap(13);

   public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      long var1 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 76929265273461L;
      super("Auto Sell");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.SBMENU;
      String[] var4 = new String[]{"Builder"};
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = CollectionsKt.arrayListOf(var4);
      var4 = new String[]{
         "Mithril",
         "Titanium",
         "Goblin",
         "Ice",
         "Glacite",
         "Cobblestone",
         "Rune ",
         "Endstone",
         "Hard Stone",
         "Obsidian",
         "End Stone",
         "Flawed",
         "Rough",
         "Stone"
      };
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = CollectionsKt.listOf(var4);
      var4 = new String[]{
         "Drill",
         "Pickaxe",
         "Tasty",
         "Jewel",
         "Omelette",
         "Sludge",
         "Minecart",
         "Sword",
         "Ice Spray",
         "Barrel",
         "Slice",
         "Gauntlet",
         "Sack",
         "Bob-ombs",
         "Necklace"
      };
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = CollectionsKt.listOf(var4);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 400 + Random.Default.nextInt(200);
      String var10000 = Scheduler.IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Vec3(-8.5, 70.0, -61.5);
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new BlockPos(-10, 70, -60);
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new Vec3(-33.5, 72.0, -22.5);
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new BlockPos(-34, 72, -25);
      String var3 = var10000;

      try {
         if (var3 == null) {
            int[] var5 = new int[3];
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }
      } catch (NoWhenBranchMatchedException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   @Override
   public void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull ChestBackgroundDrawnEvent param1, char param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, @NotNull PacketReceivedEvent param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var1,
      long var2
   ) {
      var2 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ var2;
      long var4 = var2 ^ 66422321290969L;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4);
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = 400 + Random.Default.nextInt(200);
   }

   @Override
   public void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
      IgnoreEntities.forceEnabled = false;
      IgnoreEntities.ignorePlayersOnly = false;
   }

   static {
      long var0 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll ^ 13224263103580L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[58];
      int var7 = 0;
      String var6 = "\u009e\u001bmBG\u0082~YA\u0000}o>HÔ= Ùó=´D0\u0006FÙ$Ñ¬ÜÑ\u0017\u0089\r*Â]RR8>!\u008fKì\u008cÔW!\u0010ôäÁrb±i\u0098¤¦\u00129\u0081\u009dJç0'tËñ\u009d\bht\u0016\u0004o\u009c\bõ~T¥%\u0006±ZvÅ\u0015µ\u0002Vv/XÒß\u0089Ò\u00ad:\u008ah/Z>\u0089\"¨|ô\u0081\u0095\u0018\u0017\u0014\u0097Û8\tóÃ\u008a\"33\u001eÂ~ÂAú\u0096ä¦\u00971m 6å\u0086íãQÄN¿ú'Otû+ºïå î7\u001aVô«t\u000f\u007få¼¦ã\u0018§Z\u001dXlx§'4%'\"Ëv ìÎ|±Ó o(\u00ad éP£¡¾ZÒ,\u0010wÄ'V¸\u00ad\u0007È\u00013§\u0015\u0082³¢ä\rJûqv?7\u0018\u0081ýÐâ~\u000bi\u0082í\u009a\u0090é$\u0006\u0099\u001eg\u0000øÙ1ÐMì\u0010ªòïÛ¾§U¶çp\u0080\u001f\u0089Ò\u008cñ\u0010\u001eK.5\u0018¨f\u0084%\u0086Ô%:+ów\u0010v+rþÒ\t¥æY\bÅ\u0088|¤\u0017:\u0010/ÁÛÅ±ÙTÍuî\u009e[p#ï6 ¬)\u0080Ì«Çï=î>p¥ÖÎ\u0018Ï\u0093(£÷²ëYCsÉ\u0085GÖÁ\u0014\u0098\u0010X\u0087çµÃe¹\u0099ÍþBáC²Õ³\u0010\nõ\t¾[¬ð\b2$¬\u0003ä\u008d»®\u0010ÿ¶Âk\u00ad\f !¯¸!\u0093}¡#C U\u0098\u0010\u0093ë?r÷WCqå\u0080\u0088\u0085\u0087Î\u0017\u0000ÀFý'vy\u001dÇ@ìÅa\u0006P;£dom&0\u0096·föâûq\u000eÁV~TÙ0¬Î\u0092r}M\u0097t\u008bÍ<#}\u0001öçp yÏ0?/X\\\u001f\u009bêªOØ:\u0094Rô\u0015÷·CÈpÌ_\u0087Ò\u0099\u0010\u0093AµÔ\u0096Ú\u007f\u0095n§b\r\u0010\u009f·\u0088ÀAk¶\u001bÉ\u008a¾íkÐyl\u0010{¢;\u0007SK}à\u0019µ}¾x÷£ï(ÇÛiûEd*\u0014*\u0090w\u000f$ÄàÜö[\u0090¡)w\u0088Ú\u0000\u008f*Ê\nÅÏà'\u001aß\t5\u009e¦\u00adXu`\u009fL4ß79í!\u001a\u009dm¨Hv²~ûO\u0014 ó\u000bÿÇ\\½\u0087h<ãàR\u0010\u009c²»¡%4Ö[\u0085D\u008eê\u009b¤\u0080¾\n\u0091\u000er¡\u001e$¼¤Nýà;\u0016@\u000e\u009bW'\u0011\u0002u\u0092S\u00933¥\u0003E \u0006Ù\u008ez04Q\u0010.F~DyÓ!I\u0081\u009d¤V=õ¦J ãwzô2Ýi§©ØÌúd\u0080ù\u0004É\u0012é\u0011å\u0088)ÃgTåÈîmÎn8\u0017\u0013ÓMGÕ\u001c§vÎ=¤\u0089§ãøåSä¦É¡3ü\u0014þ\u008eÓý4Â¡Æë#®o²ÓeøÃ}ÂW\u008c\u0017ô×3@e²É\u0007<\u0010A¼Õù\u0015àL&\u0003\u000eý\u0093\"Ü\u001c  \u009c\u001e\u008c@\u001d\u001e\u009a;\u009eä\u008a\u0080\u001bgwï8\u009dJö\u0094\u000f²FB¯èÉ®k¯\fPóz\u009cdSFh·Íå\u008f<\u000fòý=\u0000½\u0087ÞùË\u001b\u0099@Ç1;M®ñ¤i}+/L¥V#Á\u009b\u008fi\u0094¬-KÒ~Î\u000bh\u009f\u0090XÛá;iÅi\u001a¤\u009c=ÓÈ\u0006=0â\u0003Æ\u0017WG«,ï\u0010 9ñ55Þµ=.@B\u00034A\u0088¿\u0010WHlÜ¬Ö\u0088û¸7?\u0088Á\u0084uç\u0018¾>]î{cEK\u0003ú9Tú\u009afß¦á\u0090>ºd¨(P×Oæ\u009fïØÎ¶R+«\u0017ó6\u0085»\u008c@-k·Á{ìÛò{\u009dÇwpi\u0081=\u008dÑ\u0018\u0018\u0087¸qïî\u0007\u009fô³ÿûB\u0088\u0091¦\u000e\u000fò¯úk.6À½¡,\u0080=Àk.ß\"~ÍÓó\u001aÚjé\u00108¦7&\u0006¢¼ËL\t\u0013)Ö~¿¥\u0010ÿ\u0085'R·0=\u008a \u000eÇ \u0017²\u009cä0\u009bã\u0083\u001a\u007fö\t¤}\u0087¹\u008eÕ¼\u0000%4'/üÃ×ªg[Uy\u0095YVì«íÏ\u007fÀaä\u00122\u009aN:K\u000b\u009c\u009d\u0015\u0018pÊ3\u008e\u00ad\u001a\b\u009bÃ»\u000fìý¹\"\u0006v¾PÎ\u009a¼ïã ºHÆ£\u0006A\u009cn!¥àl-G+\u008fu\u001f\u008b¡\u0081Ý8\u007fCaÒy`Éº½\u0010»\u001a\u008bâhN\u0089Y\u000f¾\u0016%Û]×» àJ\u0007>Ì°\u001fï©Þ·'\u0081 ?\u001b\u000fÐÅ|óÇRY.a~ÞûÐX\u0091`(¸\u001b5ä3\u0014N0ûø«l#§9\u009b&ªÑö\u0089hG×q\u001e\u0004¦Øß\u0086\u0093(ÕXÂ,(C\u0090DiKyáç\u001d:\u0098\u008c\u00adVf\r,,\u0085ë~uÔP\u009b_rl\u0012g\u009b\u001a''>ªJF\u00120ÕlÂ}â¯:Ðbº©|)¦tÄÁ\u0010Ç³\u0017ôõ'\u001c9\u0098-1OSz\u0015\u0098 \bZ\u001a±oF7©ñÅÉ\u00962lË\tó,\u0095ºO+¯õ¹ã\u0010\u0083\u009c\u008a\u009a²\u0010.?Þ5e&Ó\u0011[sÅõ5l\u009dT\u0010ÐéAÊ?-¦\\¡#¼t[=\u0006Ö \u0096IÁ\u0089C\u0005;\u0007\u008c%-©KÏ&em\u0019Áè¸CKw÷«ï¼¸¬°ä\u0018á$o!ZmRâñ^C\u0095ÆÛ3\f\u0012\u009b{Øl\u001f)ô(»!nÜ}}\b\u008bÉ1.c\b]\u00921Þ(¦\u001a\u0099ß{½\u0010[ï4ìäÒ>\u001byã©U\u0080-\u0081\u0018B\u0080fs\u0018'ê\u0010\u00adø÷½\t¯.æ\u0010éç-TÖ â \t¹>y \u0094ñ\u0016\u0019/gÌLýj \u0099Ö©Þ\u0015\u0098f\u0004¥öI\u009d²&\u0001î\u0018ntPU©§\u0013n\u007fl';£ø@ïð\u0098a%2YmÉ\u0010Vfh6õJõO@\u008c\u001aÑÔðËÞ\u0010fg¹¾ñ9[\u0086\u001bF{\u001cXôõ\u0017 Q\n\u0086Ä{Pë¬¼K¦\u001b|k«ä\u00126ÙD\u0099¸\u008e©fYó\b Uúe \u0084ºÿË\u0004È\u0016À\u001d1\u0003\u0083¾ë\u008a\u0086£û·Gx?\u00905\u0096\\ahz\u001a>N\u00105\u0000g´\u0004\u0087\u001aú¸\u0087\u009fö,\u009cI¥";
      int var8 = "\u009e\u001bmBG\u0082~YA\u0000}o>HÔ= Ùó=´D0\u0006FÙ$Ñ¬ÜÑ\u0017\u0089\r*Â]RR8>!\u008fKì\u008cÔW!\u0010ôäÁrb±i\u0098¤¦\u00129\u0081\u009dJç0'tËñ\u009d\bht\u0016\u0004o\u009c\bõ~T¥%\u0006±ZvÅ\u0015µ\u0002Vv/XÒß\u0089Ò\u00ad:\u008ah/Z>\u0089\"¨|ô\u0081\u0095\u0018\u0017\u0014\u0097Û8\tóÃ\u008a\"33\u001eÂ~ÂAú\u0096ä¦\u00971m 6å\u0086íãQÄN¿ú'Otû+ºïå î7\u001aVô«t\u000f\u007få¼¦ã\u0018§Z\u001dXlx§'4%'\"Ëv ìÎ|±Ó o(\u00ad éP£¡¾ZÒ,\u0010wÄ'V¸\u00ad\u0007È\u00013§\u0015\u0082³¢ä\rJûqv?7\u0018\u0081ýÐâ~\u000bi\u0082í\u009a\u0090é$\u0006\u0099\u001eg\u0000øÙ1ÐMì\u0010ªòïÛ¾§U¶çp\u0080\u001f\u0089Ò\u008cñ\u0010\u001eK.5\u0018¨f\u0084%\u0086Ô%:+ów\u0010v+rþÒ\t¥æY\bÅ\u0088|¤\u0017:\u0010/ÁÛÅ±ÙTÍuî\u009e[p#ï6 ¬)\u0080Ì«Çï=î>p¥ÖÎ\u0018Ï\u0093(£÷²ëYCsÉ\u0085GÖÁ\u0014\u0098\u0010X\u0087çµÃe¹\u0099ÍþBáC²Õ³\u0010\nõ\t¾[¬ð\b2$¬\u0003ä\u008d»®\u0010ÿ¶Âk\u00ad\f !¯¸!\u0093}¡#C U\u0098\u0010\u0093ë?r÷WCqå\u0080\u0088\u0085\u0087Î\u0017\u0000ÀFý'vy\u001dÇ@ìÅa\u0006P;£dom&0\u0096·föâûq\u000eÁV~TÙ0¬Î\u0092r}M\u0097t\u008bÍ<#}\u0001öçp yÏ0?/X\\\u001f\u009bêªOØ:\u0094Rô\u0015÷·CÈpÌ_\u0087Ò\u0099\u0010\u0093AµÔ\u0096Ú\u007f\u0095n§b\r\u0010\u009f·\u0088ÀAk¶\u001bÉ\u008a¾íkÐyl\u0010{¢;\u0007SK}à\u0019µ}¾x÷£ï(ÇÛiûEd*\u0014*\u0090w\u000f$ÄàÜö[\u0090¡)w\u0088Ú\u0000\u008f*Ê\nÅÏà'\u001aß\t5\u009e¦\u00adXu`\u009fL4ß79í!\u001a\u009dm¨Hv²~ûO\u0014 ó\u000bÿÇ\\½\u0087h<ãàR\u0010\u009c²»¡%4Ö[\u0085D\u008eê\u009b¤\u0080¾\n\u0091\u000er¡\u001e$¼¤Nýà;\u0016@\u000e\u009bW'\u0011\u0002u\u0092S\u00933¥\u0003E \u0006Ù\u008ez04Q\u0010.F~DyÓ!I\u0081\u009d¤V=õ¦J ãwzô2Ýi§©ØÌúd\u0080ù\u0004É\u0012é\u0011å\u0088)ÃgTåÈîmÎn8\u0017\u0013ÓMGÕ\u001c§vÎ=¤\u0089§ãøåSä¦É¡3ü\u0014þ\u008eÓý4Â¡Æë#®o²ÓeøÃ}ÂW\u008c\u0017ô×3@e²É\u0007<\u0010A¼Õù\u0015àL&\u0003\u000eý\u0093\"Ü\u001c  \u009c\u001e\u008c@\u001d\u001e\u009a;\u009eä\u008a\u0080\u001bgwï8\u009dJö\u0094\u000f²FB¯èÉ®k¯\fPóz\u009cdSFh·Íå\u008f<\u000fòý=\u0000½\u0087ÞùË\u001b\u0099@Ç1;M®ñ¤i}+/L¥V#Á\u009b\u008fi\u0094¬-KÒ~Î\u000bh\u009f\u0090XÛá;iÅi\u001a¤\u009c=ÓÈ\u0006=0â\u0003Æ\u0017WG«,ï\u0010 9ñ55Þµ=.@B\u00034A\u0088¿\u0010WHlÜ¬Ö\u0088û¸7?\u0088Á\u0084uç\u0018¾>]î{cEK\u0003ú9Tú\u009afß¦á\u0090>ºd¨(P×Oæ\u009fïØÎ¶R+«\u0017ó6\u0085»\u008c@-k·Á{ìÛò{\u009dÇwpi\u0081=\u008dÑ\u0018\u0018\u0087¸qïî\u0007\u009fô³ÿûB\u0088\u0091¦\u000e\u000fò¯úk.6À½¡,\u0080=Àk.ß\"~ÍÓó\u001aÚjé\u00108¦7&\u0006¢¼ËL\t\u0013)Ö~¿¥\u0010ÿ\u0085'R·0=\u008a \u000eÇ \u0017²\u009cä0\u009bã\u0083\u001a\u007fö\t¤}\u0087¹\u008eÕ¼\u0000%4'/üÃ×ªg[Uy\u0095YVì«íÏ\u007fÀaä\u00122\u009aN:K\u000b\u009c\u009d\u0015\u0018pÊ3\u008e\u00ad\u001a\b\u009bÃ»\u000fìý¹\"\u0006v¾PÎ\u009a¼ïã ºHÆ£\u0006A\u009cn!¥àl-G+\u008fu\u001f\u008b¡\u0081Ý8\u007fCaÒy`Éº½\u0010»\u001a\u008bâhN\u0089Y\u000f¾\u0016%Û]×» àJ\u0007>Ì°\u001fï©Þ·'\u0081 ?\u001b\u000fÐÅ|óÇRY.a~ÞûÐX\u0091`(¸\u001b5ä3\u0014N0ûø«l#§9\u009b&ªÑö\u0089hG×q\u001e\u0004¦Øß\u0086\u0093(ÕXÂ,(C\u0090DiKyáç\u001d:\u0098\u008c\u00adVf\r,,\u0085ë~uÔP\u009b_rl\u0012g\u009b\u001a''>ªJF\u00120ÕlÂ}â¯:Ðbº©|)¦tÄÁ\u0010Ç³\u0017ôõ'\u001c9\u0098-1OSz\u0015\u0098 \bZ\u001a±oF7©ñÅÉ\u00962lË\tó,\u0095ºO+¯õ¹ã\u0010\u0083\u009c\u008a\u009a²\u0010.?Þ5e&Ó\u0011[sÅõ5l\u009dT\u0010ÐéAÊ?-¦\\¡#¼t[=\u0006Ö \u0096IÁ\u0089C\u0005;\u0007\u008c%-©KÏ&em\u0019Áè¸CKw÷«ï¼¸¬°ä\u0018á$o!ZmRâñ^C\u0095ÆÛ3\f\u0012\u009b{Øl\u001f)ô(»!nÜ}}\b\u008bÉ1.c\b]\u00921Þ(¦\u001a\u0099ß{½\u0010[ï4ìäÒ>\u001byã©U\u0080-\u0081\u0018B\u0080fs\u0018'ê\u0010\u00adø÷½\t¯.æ\u0010éç-TÖ â \t¹>y \u0094ñ\u0016\u0019/gÌLýj \u0099Ö©Þ\u0015\u0098f\u0004¥öI\u009d²&\u0001î\u0018ntPU©§\u0013n\u007fl';£ø@ïð\u0098a%2YmÉ\u0010Vfh6õJõO@\u008c\u001aÑÔðËÞ\u0010fg¹¾ñ9[\u0086\u001bF{\u001cXôõ\u0017 Q\n\u0086Ä{Pë¬¼K¦\u001b|k«ä\u00126ÙD\u0099¸\u008e©fYó\b Uúe \u0084ºÿË\u0004È\u0016À\u001d1\u0003\u0083¾ë\u008a\u0086£û·Gx?\u00905\u0096\\ahz\u001a>N\u00105\u0000g´\u0004\u0087\u001aú¸\u0087\u009fö,\u009cI¥"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u009b\u0087(\u0087\u009cùhÈNDHÝÑÿ\u000f\u0010 «Ñ0\u0005êC£\u0013{În\u0096\u001aìU\u001aüÐtMå\u0089\u00963ÿ\u000fÌt!N\u0086\u001d";
            var8 = "\u009b\u0087(\u0087\u009cùhÈNDHÝÑÿ\u000f\u0010 «Ñ0\u0005êC£\u0013{În\u0096\u001aìU\u001aüÐtMå\u0089\u00963ÿ\u000fÌt!N\u0086\u001d".length();
            var5 = '\u0010';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var9;
                  IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new String[58];
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
                  llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30263;
      if (IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/helpers/general/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10
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
         byte[] var9 = IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5].getBytes("ISO-8859-1");
         IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/helpers/general/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static enum IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      SBMENU,
      COOKIE,
      SHOP,
      SELLING,
      BAZAAR,
      INSTANT_SELL;

      @NotNull
      public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 90860514955992L ^ 28463615764990L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[6];
         int var6 = 0;
         String var5 = "\u0095Q«ó,¥°<\b¤1\n\u0096\u0082J_a\b¥\u0011²\u001aÎ[§H\u0010Ã\u0090ì?2\u001b|\u0094+¯\\r(5<\u0095";
         int var7 = "\u0095Q«ó,¥°<\b¤1\n\u0096\u0082J_a\b¥\u0011²\u001aÎ[§H\u0010Ã\u0090ì?2\u001b|\u0094+¯\\r(5<\u0095".length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var21;
            if ((var3 += var4) >= var7) {
               var5 = "2½):$\u0018\u0006Û\bìg\u008dC°î\u00990";
               var7 = "2½):$\u0018\u0006Û\bìg\u008dC°î\u00990".length();
               var4 = '\b';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var19 = false;
                  var0[var6++] = var23;
                  if ((var3 += var4) >= var7) {
                     SBMENU = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     COOKIE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     SHOP = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     SELLING = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     BAZAAR = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     INSTANT_SELL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(

                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     );
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
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 19373803814686L;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, short param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
      }
   }
}
