package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import net.minecraft.world.inventory.ContainerInput;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll
   extends me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @Nullable
   private CompletableFuture<llIIIIlIIlIllIllIllIlIllllIIllIIllIllIIIlIlIIIlIIIIIIIIIIlllIlllIIlIlIIIlIIIlIIIlIIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final Pattern lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private final Pattern lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private boolean IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private boolean llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @Nullable
   private String IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private boolean IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private final int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 51322325824074L;
   private static String[] IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private static String[] lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private static Map llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = new HashMap(13);
   private static long lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;

   public lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll() {
      long var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 105521252880169L;
      super("Auction Helper");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Pattern.compile("^You purchased (.+) for ([0-9,]+) coins!$");
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = Pattern.compile("^You claimed (.+) from .+'s auction!$");
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = (int)lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   public final boolean IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   public final boolean IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(boolean var1) {
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
   }

   public final boolean llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(boolean var1) {
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
   }

   @Override
   public void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(int param1, short param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, int var3) {
      var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var1;
      long var4 = var1 ^ 42446995784276L;
      long var10001 = var1 ^ 37047490838914L;
      int var6 = (int)((var1 ^ 37047490838914L) >>> 32);
      int var7 = (int)((var1 ^ 37047490838914L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, (char)var7, (short)var8, var3, 0, ContainerInput.PICKUP);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4);
   }

   @SubscribeEvent
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull ChestBackgroundDrawnEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      int var5 = (int)((var1 ^ 131371598094042L) >>> 32);
      int var6 = (int)((var1 ^ 131371598094042L) << 32 >>> 32);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var5, var6);
      llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(true);
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
   }

   static {
      long var5 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 114721664807419L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var5 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[36];
      int var12 = 0;
      String var11 = "òG\u0082ìÝ\u0084\u001cÔ+³\u0090Çö:\u0090|\u0010Á\u009d\u008eqbg#\u000e,\u0080¥i\u0019\u0001«e81¨\u001dÝ\u0011¦l'Å5,Ú\u0019ËqåÙ¸{cû¿¶\u000f\u007fw\u0010_\u0019\u0003D\u0016Àü7.|0ãÆ;Ï\u0089/\u0012[º\u0082\b\u001f¢\u008e\u009c#+z ÞK-cÍsxµî\u0098Á«\u0019) \u008eÒô*äuÊ·,\u0094\u0086ÕWX\u0096\u0087h(ûæ\\Ü\u007fRç\u009cJëf\u0005\u008a\u00148h¶Â\u0099A\u001f¬Ø¨ÞsY±CJ\u008bT\b\u0089ì.×êS\u0094\u0010÷G\u000b~È\rÃe\u0090ôðÛÌóS\u001d\u0010áÜdæ\u0015ã_%x\u009f\u0017Ã»\u0000.\u0006(¯\u007fò\u000b;6FíÀª\u0002¸óîP\u008e\u00adyrqíµáíÿn\u0095\u000b\u009eà\u009bì´¹\u000b^Ê»Xñ \u001e\u0012\u0090S\u001d\u0099 ÑËµ63¿Í\u0096»Â\nØäµ\u0019\u0094»\u0085Ì¤\u0010ÌL¨2 ¹b\u0005ôÇ\u001c\u008d\u001a`&{¥\u0013\\\u0092ï\u008bÇâm\u0093\u0080a8mâP%\u0004'qO ©~@ê¬¯r'0\u009c\u001bc\u0082\u0098Ã~±\u0093ùD·ÇO×\u0088Ó\u0096¼°Z· \u0010Ykúó÷©Q/y*ÅªieîÒ0Ño«\u0017Kë\u0098\u0012üH\u009a\u008dpWä\u0006À\u0089Lû\u009c<é¥ðÏß\u0019\u0011I®\u009fà±¨çü\u0014\u009eFo8¹üÐ\u00140¡\u0010\u009b-\u009fØÕ\u0087Y§\u00037\u001f56\u0082ý\u008e HºK<&`aÕ:\u0087Ø·\u00861à'8h\u0005\u008dI,Ìj\u0090\u0090\u0014ý\u008b SP0î(\u001e0\u0095Î!o\n``ä\u000e'Ô°ÍaV\u001aò4µÆ\u0090\u0097Ì\u0096\u0014ËÆ\\nÖÎ}`#O\u0007z©\u0085áÀvq¬\u0018\u0088*\u008a w\u0018X{È×Ú¤ó\u0016\u008c\u000b \u0093]Ñ\u0000\u0098ñ%\u0010\u00928PCà=ø\u009aM\u0012tæûÝe\u000e fÛ\u00878Õ¹+ÌÞû[öÈ\nÀ¿ªeª<`q%\u0085\u00174tøýX\u0082\u0018\u0010\u0092\u001b\u009cïç{\u0015j\u000fº^ÿ¼\\«ñ\u0010µ\u001a¬±.H\u0087Õì¶\u009dàßðo: ir]\u000b\u007f\u0002N\u001cÚ1¬,.8d\u001aRr¤+·«£3+\u0093.I²n[³@ÆBÚÖ¤ÿø«\u0005åLõÐ\u001f\"Fßu\u0094\u008a\u0081\u0095(Ã(\u008cäØ9\u009fyã¿é\u009a;\u009d8dáhv\u000bÚÍ\u001bÜ\u000b\u0081É\u008a\u0086Ñ>©mÁã\u009e\u0082Jó«3P\u001cjº@ùB\u0017è|\u008b\u0003\u0011£L,Ë\u0092>©Qw\\Gp\rx¨.\u0011Â\u008faÀ\u0012\u0084Û>v~\u0094b8q¶\u009c@FP§\u0019«¡¢F+K\u0096h;¡î\u001d\u001eÎ\u0092\u0086½J°Ø\u0082_\u0093\u008bkè?@,\u0089@\u009e\u0093¬aóB\u0083ì0´Õ¨\u008c3µTÞ ~6}ûEö®2\u0092\u0003ÃMÿ`,ðfe\u0017\u001c\u008b\u009c\u0091\u0016\u001c4\u0004@hVî$}Åìò`.\u0088,\u0002x§ôe|@\r\"\u0088À0è\u0082\u001b\u001dæx\u0014Ñb-\u001eð#y/8ÓACÀ|\u008d\u0018n\u009bXzµá\u001e\u001eÊË\u008d¯(Uû§V\u0019å÷ßü\u001eØ\r\u008a4C^Ó\u008dqÐÀ\u001bû0où[Tvð\u00951\u008c}Jw\u0001\f~\u008c\u0082²<\u008e\r?Ý\u001fØ3Óö»#Õ\u0014O\u0002C3\u009b\u0080¦\u001eÌ\u0085¶\u009c©1~Ç \u008f1á\u008a¯ñ!ÜX#tL\u0086ÒÂ!¨\u0016\u001bÐÃ£\u0080O¬\u008e\u0010\u001f\u008d¤ûd m£g=\nª#!\u0094A¿ã#¦z\u0006UzSMÛÎë\u009dî%mäë5iV(ß\u0092º}\u001eÏDÌY+{g~ÃNó*Ä¢0/ù\u00907t=Al\u00926©°qÁ\u0011]rþ\u00184 \u0018Êpkª\u0017:z¡c\u008eµ5Nµ%B-\u009c¯[àý\u000f\u0018~\r\u0000\u0016\u0010®M\u0010ñ\u0099\u008c\u0086âÁ#8íû\u0091r¹\u00166\u0083 \u0007|\u009c,}/¢m\b\u0006`\u0083\u0096[ÌËÅ-§]@/\u0094îý\u0005Í\te÷¯\n(M\u001co¶AQæTãQR[iq\u0093#\u00980Ö\u0091Gb[®rz\u0087Ë¯{|\u0081\u0011ê\u0088µ\u0097Ê'Õ";
      int var13 = "òG\u0082ìÝ\u0084\u001cÔ+³\u0090Çö:\u0090|\u0010Á\u009d\u008eqbg#\u000e,\u0080¥i\u0019\u0001«e81¨\u001dÝ\u0011¦l'Å5,Ú\u0019ËqåÙ¸{cû¿¶\u000f\u007fw\u0010_\u0019\u0003D\u0016Àü7.|0ãÆ;Ï\u0089/\u0012[º\u0082\b\u001f¢\u008e\u009c#+z ÞK-cÍsxµî\u0098Á«\u0019) \u008eÒô*äuÊ·,\u0094\u0086ÕWX\u0096\u0087h(ûæ\\Ü\u007fRç\u009cJëf\u0005\u008a\u00148h¶Â\u0099A\u001f¬Ø¨ÞsY±CJ\u008bT\b\u0089ì.×êS\u0094\u0010÷G\u000b~È\rÃe\u0090ôðÛÌóS\u001d\u0010áÜdæ\u0015ã_%x\u009f\u0017Ã»\u0000.\u0006(¯\u007fò\u000b;6FíÀª\u0002¸óîP\u008e\u00adyrqíµáíÿn\u0095\u000b\u009eà\u009bì´¹\u000b^Ê»Xñ \u001e\u0012\u0090S\u001d\u0099 ÑËµ63¿Í\u0096»Â\nØäµ\u0019\u0094»\u0085Ì¤\u0010ÌL¨2 ¹b\u0005ôÇ\u001c\u008d\u001a`&{¥\u0013\\\u0092ï\u008bÇâm\u0093\u0080a8mâP%\u0004'qO ©~@ê¬¯r'0\u009c\u001bc\u0082\u0098Ã~±\u0093ùD·ÇO×\u0088Ó\u0096¼°Z· \u0010Ykúó÷©Q/y*ÅªieîÒ0Ño«\u0017Kë\u0098\u0012üH\u009a\u008dpWä\u0006À\u0089Lû\u009c<é¥ðÏß\u0019\u0011I®\u009fà±¨çü\u0014\u009eFo8¹üÐ\u00140¡\u0010\u009b-\u009fØÕ\u0087Y§\u00037\u001f56\u0082ý\u008e HºK<&`aÕ:\u0087Ø·\u00861à'8h\u0005\u008dI,Ìj\u0090\u0090\u0014ý\u008b SP0î(\u001e0\u0095Î!o\n``ä\u000e'Ô°ÍaV\u001aò4µÆ\u0090\u0097Ì\u0096\u0014ËÆ\\nÖÎ}`#O\u0007z©\u0085áÀvq¬\u0018\u0088*\u008a w\u0018X{È×Ú¤ó\u0016\u008c\u000b \u0093]Ñ\u0000\u0098ñ%\u0010\u00928PCà=ø\u009aM\u0012tæûÝe\u000e fÛ\u00878Õ¹+ÌÞû[öÈ\nÀ¿ªeª<`q%\u0085\u00174tøýX\u0082\u0018\u0010\u0092\u001b\u009cïç{\u0015j\u000fº^ÿ¼\\«ñ\u0010µ\u001a¬±.H\u0087Õì¶\u009dàßðo: ir]\u000b\u007f\u0002N\u001cÚ1¬,.8d\u001aRr¤+·«£3+\u0093.I²n[³@ÆBÚÖ¤ÿø«\u0005åLõÐ\u001f\"Fßu\u0094\u008a\u0081\u0095(Ã(\u008cäØ9\u009fyã¿é\u009a;\u009d8dáhv\u000bÚÍ\u001bÜ\u000b\u0081É\u008a\u0086Ñ>©mÁã\u009e\u0082Jó«3P\u001cjº@ùB\u0017è|\u008b\u0003\u0011£L,Ë\u0092>©Qw\\Gp\rx¨.\u0011Â\u008faÀ\u0012\u0084Û>v~\u0094b8q¶\u009c@FP§\u0019«¡¢F+K\u0096h;¡î\u001d\u001eÎ\u0092\u0086½J°Ø\u0082_\u0093\u008bkè?@,\u0089@\u009e\u0093¬aóB\u0083ì0´Õ¨\u008c3µTÞ ~6}ûEö®2\u0092\u0003ÃMÿ`,ðfe\u0017\u001c\u008b\u009c\u0091\u0016\u001c4\u0004@hVî$}Åìò`.\u0088,\u0002x§ôe|@\r\"\u0088À0è\u0082\u001b\u001dæx\u0014Ñb-\u001eð#y/8ÓACÀ|\u008d\u0018n\u009bXzµá\u001e\u001eÊË\u008d¯(Uû§V\u0019å÷ßü\u001eØ\r\u008a4C^Ó\u008dqÐÀ\u001bû0où[Tvð\u00951\u008c}Jw\u0001\f~\u008c\u0082²<\u008e\r?Ý\u001fØ3Óö»#Õ\u0014O\u0002C3\u009b\u0080¦\u001eÌ\u0085¶\u009c©1~Ç \u008f1á\u008a¯ñ!ÜX#tL\u0086ÒÂ!¨\u0016\u001bÐÃ£\u0080O¬\u008e\u0010\u001f\u008d¤ûd m£g=\nª#!\u0094A¿ã#¦z\u0006UzSMÛÎë\u009dî%mäë5iV(ß\u0092º}\u001eÏDÌY+{g~ÃNó*Ä¢0/ù\u00907t=Al\u00926©°qÁ\u0011]rþ\u00184 \u0018Êpkª\u0017:z¡c\u008eµ5Nµ%B-\u009c¯[àý\u000f\u0018~\r\u0000\u0016\u0010®M\u0010ñ\u0099\u008c\u0086âÁ#8íû\u0091r¹\u00166\u0083 \u0007|\u009c,}/¢m\b\u0006`\u0083\u0096[ÌËÅ-§]@/\u0094îý\u0005Í\te÷¯\n(M\u001co¶AQæTãQR[iq\u0093#\u00980Ö\u0091Gb[®rz\u0087Ë¯{|\u0081\u0011ê\u0088µ\u0097Ê'Õ"
         .length();
      char var10 = '\u0010';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var28 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var28;
         if ((var9 += var10) >= var13) {
            var11 = "\u00ad´ë&2ÝA\b*8=#±_0É\u0019\u0090MjæÏä\u009b£¾T\u000fÉ\u008dõ¶(³ê\u001fnwû{\u008fi\neufsq\u0092A\u0095ø4\\Å´TFoü,\u0006©\u0006\u009aoÎß\u0099\u009d½\u0017ª";
            var13 = "\u00ad´ë&2ÝA\b*8=#±_0É\u0019\u0090MjæÏä\u009b£¾T\u000fÉ\u008dõ¶(³ê\u001fnwû{\u008fi\neufsq\u0092A\u0095ø4\\Å´TFoü,\u0006©\u0006\u009aoÎß\u0099\u009d½\u0017ª"
               .length();
            var10 = ' ';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var30 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var15).intern();
               byte var25 = 0;
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var14;
                  lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = new String[36];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var5 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var5 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 5190946143698849814L;
                  byte[] var4 = var0.doFinal(
                     new byte[]{
                        (byte)(var2 >>> 56),
                        (byte)(var2 >>> 48),
                        (byte)(var2 >>> 40),
                        (byte)(var2 >>> 32),
                        (byte)(var2 >>> 24),
                        (byte)(var2 >>> 16),
                        (byte)(var2 >>> 8),
                        (byte)var2
                     }
                  );
                  long var33 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  var25 = -1;
                  lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var33;
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28304;
      if (lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll", var10
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
         byte[] var9 = IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll[var5].getBytes("ISO-8859-1");
         lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll[var5];
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
            "me/octo/client/modules/impl/macros/lllIIIIlIlIlllllIlIIllIIllIllllIlIIIllIIllIIllIIlIIlIlIIIIlllIIllIlllIIlIIlIlIlIIllll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl$recovered$ed64e194124e1afb(long var1) {
      var1 = 46159058804680L;
      long var3 = var1 ^ 0L;
      int var5 = (int)((var1 ^ 131371598094042L) >>> 32);
      int var6 = (int)((var1 ^ 131371598094042L) << 32 >>> 32);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var5, var6);
      llllIllllllIllllIlIlllllllIllIIlIlllIIIlllllllIlIIIlIIIlIIIIllIIllllIlIlIIIllIIlIIIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(true);
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$6a5bce2608a8dd87(long var1, int var3) {
      var1 = 130637850601872L;
      var1 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var1;
      long var4 = var1 ^ 42446995784276L;
      long var10001 = var1 ^ 37047490838914L;
      int var6 = (int)((var1 ^ 37047490838914L) >>> 32);
      int var7 = (int)((var1 ^ 37047490838914L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      me.octo.client.utils.player.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6, (char)var7, (short)var8, var3, 0, ContainerInput.PICKUP);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var4);
   }
}
