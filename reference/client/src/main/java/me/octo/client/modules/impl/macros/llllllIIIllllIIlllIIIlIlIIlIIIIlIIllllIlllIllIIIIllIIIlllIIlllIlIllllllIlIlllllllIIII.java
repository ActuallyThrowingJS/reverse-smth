package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
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

public final class llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII
   extends me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   private boolean IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @Nullable
   private Long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private final Pattern lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final Pattern lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 61775940030252L;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static Map llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new HashMap(13);

   public llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII() {
      long var1 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 102534359006590L;
      super("Auction Helper");
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = Pattern.compile("^You purchased (.+) for ([0-9,]+) coins!$");
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = Pattern.compile("^You claimed (.+) from .+'s auction!$");
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, int var3) {
      var1 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ var1;
      long var4 = var1 ^ 28687931374876L;
      long var10001 = var1 ^ 32144900914890L;
      int var6 = (int)((var1 ^ 32144900914890L) >>> 32);
      int var7 = (int)((var1 ^ 32144900914890L) << 32 >>> 48);
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
   public void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1) {
      long var3 = var1 ^ 23889456652188L;
      long var5 = var1 ^ 73284701346266L;
      long var7 = var1 ^ 0L;

      try {
         if (IllIIIIIIIlIIlIIIIlIllIIIIlIlIlIlIIIlllllIIllIIIIlIIlIIlIIIlllIlIIIIllIIlIlllllllIIlI.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI
               .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            == null) {
            this.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var5);
            return;
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -4271148199731445006L, var1
         );
      }

      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = false;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = null;
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      super.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var7);
   }

   @Override
   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      int var5 = (int)((var1 ^ 131371598094042L) >>> 32);
      int var6 = (int)((var1 ^ 131371598094042L) << 32 >>> 32);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var5, var6);
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
   }

   static {
      long var0 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ 73992588706861L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[26];
      int var7 = 0;
      String var6 = "\u0086n\u00045\u0017\u009ce~Þ#9\u0006Ä\u0001´®\u0018\u00ad\u0014%Fc\u0001\u008c`gÌej\u001a)äî:Õ\u0089ÊLcÑP(#\u008b\"®îÀ\u0093°Qëï\u007f.KÝ:ò@\u009d\u0007t\u0082¡\u0091Å@µo,k/:L\u0084ðY\u0019Ë6\u001b Än¤Éþ\u00974\u0017t¬8Ö\\}è=\u000e$¶G<\u0003}¸h@vUÂÌ~ö(6\\w8Bl¢³]z§\u009dF>Wãxâ®|Â\u0090`yjsé\u0084\u008dõsr\u00ad\u008f\u009c\u0085*ISC\u0010±Õ\u009aç¥å\u0084øYÆ5b°r*Ä !Üwj\u000b7 iz¥¸%Å&Ýá\\`N\u0085?§vAHCÐvM-Hü\u0018p\u0087ßÚ\u000e\u0003Þí\u0082\u001faa\u008dÞ\u009f\u0087o\"Â\u0099d«f\u0019\u0018¥ÙïÏßi\u0082d`Ç÷mô\u0084\u0000\u009f{\u001a\u0081ò\u009bl(½\u0018\u009b\u0019ËMX>\tíÆõÁ,Hë³b\u001d¼\u0094\u0095Ä\u000eÀ1\u0010\u0095ä\u0093J\u0014\u0088H¡%(@ê\u0096£ÇT(3÷¾»Èn\rK.\u000e:Ñ¯z\u0016\\r-Ügw#Cy\u008d\u001f\u001a\u0089\fSÐ´aØS\u0097r\u0017÷\u0096 ç\fbäo\u008d#Ã3|oûi\u009a\u0094ên\t\u008eToÕH\u008e\u001aÆüYtÆÝD\u0018\bó\u0087z4\u00175¨\u000f¼Rß\u0095WÚ]2&|\rÁ?Êè0É#j×ÔÖw\t7\u0086®vàç\u0082ôë\u008b\u001dâTc´½Ål\u007fS\u0094ñ©j¬\u001a¡\u0093é\u0089\u001b\u001bâr÷\u0000î\u0002ù3\u0018Í¥ÃÞ¸;\u001e?©9c\rEÿßÙb¤ÌÑ\u0093\u0013öË(²ÞÅ\u0081ñô<\u0013Q%Oï\u0014ù\u008a\u0084A4L\u0019\"j!Ã~_ËªGûâÝ©+ç9\u008aÎ\u008ey\u0010\u0005\u0098\u0098ô°\u0000°j_\u008c¼b\\Ákº\u0018\u009e×\u0097\u000bòºE¬\u0083Ü\u0091 lD9\u0003\u0003\u0088Ùã\u00adl\u0004/0E\u0085\u007f}\u001e¿¸V\u0017ú\u0010ÞMkÿl0\u009c\u0094¼\u0007\\¿¶\u000e&£ ãá>°ÊLº^³±ó¿¢\u001e¾\u009ei\u009cT\u009c\u0010ùÁö¶Ã©Àdø \u0092\rr\u0092\u009e\u0002H\u008cå×H~\u0016½ú&MnÐnß]#´~¬Êã\u0093\u00adKþB9ÂS\u0085È\u0083\u0091¥MÜ&0tÖÚ|ó¨f±1\u009a\u0007\u008aèâý/Ð|¡\u001fb\u0083nÓ:nÏºå\u0011C¯íp@J\u0014l6n\u001cïlëMQÖÈ\u0004p£\u008a/NÉE*\u0011<I_\u0016j\u000b5¥\u0081\u001d)|±+Õ|CîËÔ\u008f\u000e³¾\u0086Åb\u000b\u008aT$C/\u0012îp^5\u007f\u0098\u001a æ'Û×µ(Æy'¹^«\u0018}ë(l_Ðk\u009e\u007fè\u0086¨c5ß\u009eÃ\u0018»";
      int var8 = "\u0086n\u00045\u0017\u009ce~Þ#9\u0006Ä\u0001´®\u0018\u00ad\u0014%Fc\u0001\u008c`gÌej\u001a)äî:Õ\u0089ÊLcÑP(#\u008b\"®îÀ\u0093°Qëï\u007f.KÝ:ò@\u009d\u0007t\u0082¡\u0091Å@µo,k/:L\u0084ðY\u0019Ë6\u001b Än¤Éþ\u00974\u0017t¬8Ö\\}è=\u000e$¶G<\u0003}¸h@vUÂÌ~ö(6\\w8Bl¢³]z§\u009dF>Wãxâ®|Â\u0090`yjsé\u0084\u008dõsr\u00ad\u008f\u009c\u0085*ISC\u0010±Õ\u009aç¥å\u0084øYÆ5b°r*Ä !Üwj\u000b7 iz¥¸%Å&Ýá\\`N\u0085?§vAHCÐvM-Hü\u0018p\u0087ßÚ\u000e\u0003Þí\u0082\u001faa\u008dÞ\u009f\u0087o\"Â\u0099d«f\u0019\u0018¥ÙïÏßi\u0082d`Ç÷mô\u0084\u0000\u009f{\u001a\u0081ò\u009bl(½\u0018\u009b\u0019ËMX>\tíÆõÁ,Hë³b\u001d¼\u0094\u0095Ä\u000eÀ1\u0010\u0095ä\u0093J\u0014\u0088H¡%(@ê\u0096£ÇT(3÷¾»Èn\rK.\u000e:Ñ¯z\u0016\\r-Ügw#Cy\u008d\u001f\u001a\u0089\fSÐ´aØS\u0097r\u0017÷\u0096 ç\fbäo\u008d#Ã3|oûi\u009a\u0094ên\t\u008eToÕH\u008e\u001aÆüYtÆÝD\u0018\bó\u0087z4\u00175¨\u000f¼Rß\u0095WÚ]2&|\rÁ?Êè0É#j×ÔÖw\t7\u0086®vàç\u0082ôë\u008b\u001dâTc´½Ål\u007fS\u0094ñ©j¬\u001a¡\u0093é\u0089\u001b\u001bâr÷\u0000î\u0002ù3\u0018Í¥ÃÞ¸;\u001e?©9c\rEÿßÙb¤ÌÑ\u0093\u0013öË(²ÞÅ\u0081ñô<\u0013Q%Oï\u0014ù\u008a\u0084A4L\u0019\"j!Ã~_ËªGûâÝ©+ç9\u008aÎ\u008ey\u0010\u0005\u0098\u0098ô°\u0000°j_\u008c¼b\\Ákº\u0018\u009e×\u0097\u000bòºE¬\u0083Ü\u0091 lD9\u0003\u0003\u0088Ùã\u00adl\u0004/0E\u0085\u007f}\u001e¿¸V\u0017ú\u0010ÞMkÿl0\u009c\u0094¼\u0007\\¿¶\u000e&£ ãá>°ÊLº^³±ó¿¢\u001e¾\u009ei\u009cT\u009c\u0010ùÁö¶Ã©Àdø \u0092\rr\u0092\u009e\u0002H\u008cå×H~\u0016½ú&MnÐnß]#´~¬Êã\u0093\u00adKþB9ÂS\u0085È\u0083\u0091¥MÜ&0tÖÚ|ó¨f±1\u009a\u0007\u008aèâý/Ð|¡\u001fb\u0083nÓ:nÏºå\u0011C¯íp@J\u0014l6n\u001cïlëMQÖÈ\u0004p£\u008a/NÉE*\u0011<I_\u0016j\u000b5¥\u0081\u001d)|±+Õ|CîËÔ\u008f\u000e³¾\u0086Åb\u000b\u008aT$C/\u0012îp^5\u007f\u0098\u001a æ'Û×µ(Æy'¹^«\u0018}ë(l_Ðk\u009e\u007fè\u0086¨c5ß\u009eÃ\u0018»"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var9;
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new String[26];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "\u0085Qm¿ã\u0087I\u0007x\u008d\u009cb\"\u0019Y\u0019(+Ñ]Éåû.0\u0000³\u0004G^\u009eÚ\tòâ1%K¼«\u0080\u0010\u0015à\u0082\u008cfÜ\u00847>VÁ¸f[£¤ùð\u0015\f\u008c³¹Ç\u0093/ÖÓØÀÎ";
                  var8 = "\u0085Qm¿ã\u0087I\u0007x\u008d\u009cb\"\u0019Y\u0019(+Ñ]Éåû.0\u0000³\u0004G^\u009eÚ\tòâ1%K¼«\u0080\u0010\u0015à\u0082\u008cfÜ\u00847>VÁ¸f[£¤ùð\u0015\f\u008c³¹Ç\u0093/ÖÓØÀÎ"
                     .length();
                  var5 = 24;
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19191;
      if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII", var10
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
         byte[] var9 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5].getBytes("ISO-8859-1");
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5];
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
            "me/octo/client/modules/impl/macros/llllllIIIllllIIlllIIIlIlIIlIIIIlIIllllIlllIllIIIIllIIIlllIIlllIlIllllllIlIlllllllIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
