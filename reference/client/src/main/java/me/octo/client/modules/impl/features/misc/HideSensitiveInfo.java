package me.octo.client.modules.impl.features.misc;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.events.impl.render.ScoreboardEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import org.jetbrains.annotations.NotNull;

public final class HideSensitiveInfo extends BooleanModule {
   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static HideSensitiveInfo lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @NotNull
   private static Regex lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private static Regex IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private static Regex llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 91613928047997L;
   private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static Map IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new HashMap(13);

   public HideSensitiveInfo() {
      long var1 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 94833704058515L;
      ModuleCategory var10003 = ModuleCategory.MISC;
      Setting[] var3 = new Setting[]{
         llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
      };
      super("Hide Sensitive Info", "Hides your Profile ID and server ID.", var10003, "Misc", var3);
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketReceivedEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ScoreboardEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      boolean var0, boolean var1, String var2, byte var3, long var4
   ) {
      long var6 = ((long)var3 << 56 | var4 << 8 >>> 8) ^ IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      boolean var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1499446264018157100L, var6
      );
      String var9 = var2;
      boolean var8 = var10000;

      label25: {
         label24: {
            try {
               var10000 = var0;
               if (!var8) {
                  break label25;
               }

               if (!var0) {
                  break label24;
               }
            } catch (MatchException var10) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var10, -1446707925935960636L, var6
               );
            }

            var9 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.replace(
               var2, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(29175, 5714210774163538707L ^ var6)
            );
         }

         var10000 = var1;
      }

      if (var10000) {
         var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.replace(
            var9, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(11998, 5378040255823715382L ^ var6)
         );
      }

      return var9;
   }

   private static final Optional IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, MutableComponent var2, boolean var3, short var4, boolean var5, Style var6, String var7
   ) {
      long var8 = (var0 << 16 | (long)var4 << 48 >>> 48) ^ IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      int var10 = (int)((var8 ^ 140002126342439L) >>> 56);
      long var11 = (var8 ^ 140002126342439L) << 8 >>> 8;
      Intrinsics.checkNotNullParameter(
         var6, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(3680, 2291307514126323935L ^ var8)
      );
      Intrinsics.checkNotNullParameter(
         var7, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"f">(12909, 7744420653400616144L ^ var8)
      );
      var2.append(
         (Component)Component.literal(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5, var7, (byte)var10, var11)
            )
            .withStyle(var6)
      );
      return Optional.empty();
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Minecraft param0, MutableComponent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl ^ 116226995375737L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[18];
      int var5 = 0;
      String var4 = "úØIÍ³\u0097÷\u009d\u001c³\u0013Û1¼\u0005¢¼FÌ\u0010°\u0015kõÌãz\u0014¹s5\u0017OL\bYòÕ¼¸8-¾ù\u008d\u0010¯\u007fm`3vÁÀ\u008f\u001bÙ\u0018ùÙ!7c\r#éøÙÙ\u0081xJ\u0098>Iî´ªNsÝgXè\u008aNÌ\"\u0085\u008f!C-©jé\u009d \u0094¡\u0018·ìj\u0096\u009e\u0002\u000bÏ¯\u0007s¼Èújì\u000eé\u000eÇ,½\u000eò\u0095k'ðt\u0010\u009b\u0005Xm+\tC4íÚ`oÛDÏã¸E¥\u0017Ï\u0001ö\u0099Kdpz¨J\"ÝçöLëÙy6[C\u00969(\u0014R\u0099;*%\u008caD±/÷nyo uO¯\u0083x:³ñ\u0097!¾\u0014\u0007þ\u008cêÍ\u009b1Á8»âÅ\u001a\u0015+P9ç¬}&¸\u0004\u008fê*Ù\u0006Úªü\u0086\u0016ÙÁ>\u0088q>\u0083 \u0017f¸øþ\u0007ì._kM¿©\u000fV\u009eè¨\u0080Pk\u009cúÜÉ7\u009a7$\u0019`&KóÓ\u001a\u0090d¬r¾¹Â¸á\u0088ðbNóÐ7Þ\u0084\u0014\u008a-+\u0004úÃ\u0002-\u0015\u0084\u008eúO\u0089à\u0081b3\u0085\u0093í¥A\u0012Kð;i¾Ö\u00938?\u0010öÁÁ^.\u008a§\u0099¯w\u000e\u007f\u0080é\u007f{\u0010¤\u00ad \fhw)C\u0088¦²±çA-Û\u0010\u0081;±\u009aä+B\u0089@ÃÑ\u0096'ÅbwP÷2X³\u0018j\u00040^î\u007f°GóÓ\u00976íËÇ'/=ÿPÞç\u0017\f\u00adË\u0089\u007f»´\u009e\u0081a\u0098£\u000b\u0091ÝËë\u0019Ùák'\u0005òv¯N÷ãH\u001a\u008eÅyë¡\u0080\u0007w^\u0003ÍB¸5\u009f¼Xvô½\u0080@Tb´}@ô\u0083IÁ\u0099w×Vïc³kc\u0000ðñ\u0001m'\u009d-`/§z\u0086µ\fËq\u009b,\u009cBÏ\u0084\r\u0099Ä©\u0016Fðè\u001d°àt\u001bùF\u009b\u001bÖÕv\u0010Ú\"\u0010\u0093\u001ewu\u0093z\u0016\u0018\u008bÅ\u0081\u00999Nde(Fí)!PJ\u0001B\u008f;Ã¸!\u0000\u009eÊÕ®C\u0018\u0012¬A\u007f\nÀô¨Z×\u0019såú»ô0R\r² 9àvþ\u001eæC\u00846¸ÔÇ\u0011\u0010J\u0097$NÐÑz¶\u008fg<^A\u0010êÀ;A S,ÍvnÙ¨æ\u00ad\nÁ\u0095\u0003!=ç\u0092Å\u0092·<·£\u0019\"\u00123\u009aùQo²\u0010ÎÝ\u001dIäYÜ\u0099ù#3ñ³ôÌ\u0096(Ò\u0017À9Ðé\u008b\u009f»dJ?BSõ\u0004ócðÔïµî\u0015_¼?b[×·\u0001ÈÕ\u0099þ{Ã¦A";
      int var6 = "úØIÍ³\u0097÷\u009d\u001c³\u0013Û1¼\u0005¢¼FÌ\u0010°\u0015kõÌãz\u0014¹s5\u0017OL\bYòÕ¼¸8-¾ù\u008d\u0010¯\u007fm`3vÁÀ\u008f\u001bÙ\u0018ùÙ!7c\r#éøÙÙ\u0081xJ\u0098>Iî´ªNsÝgXè\u008aNÌ\"\u0085\u008f!C-©jé\u009d \u0094¡\u0018·ìj\u0096\u009e\u0002\u000bÏ¯\u0007s¼Èújì\u000eé\u000eÇ,½\u000eò\u0095k'ðt\u0010\u009b\u0005Xm+\tC4íÚ`oÛDÏã¸E¥\u0017Ï\u0001ö\u0099Kdpz¨J\"ÝçöLëÙy6[C\u00969(\u0014R\u0099;*%\u008caD±/÷nyo uO¯\u0083x:³ñ\u0097!¾\u0014\u0007þ\u008cêÍ\u009b1Á8»âÅ\u001a\u0015+P9ç¬}&¸\u0004\u008fê*Ù\u0006Úªü\u0086\u0016ÙÁ>\u0088q>\u0083 \u0017f¸øþ\u0007ì._kM¿©\u000fV\u009eè¨\u0080Pk\u009cúÜÉ7\u009a7$\u0019`&KóÓ\u001a\u0090d¬r¾¹Â¸á\u0088ðbNóÐ7Þ\u0084\u0014\u008a-+\u0004úÃ\u0002-\u0015\u0084\u008eúO\u0089à\u0081b3\u0085\u0093í¥A\u0012Kð;i¾Ö\u00938?\u0010öÁÁ^.\u008a§\u0099¯w\u000e\u007f\u0080é\u007f{\u0010¤\u00ad \fhw)C\u0088¦²±çA-Û\u0010\u0081;±\u009aä+B\u0089@ÃÑ\u0096'ÅbwP÷2X³\u0018j\u00040^î\u007f°GóÓ\u00976íËÇ'/=ÿPÞç\u0017\f\u00adË\u0089\u007f»´\u009e\u0081a\u0098£\u000b\u0091ÝËë\u0019Ùák'\u0005òv¯N÷ãH\u001a\u008eÅyë¡\u0080\u0007w^\u0003ÍB¸5\u009f¼Xvô½\u0080@Tb´}@ô\u0083IÁ\u0099w×Vïc³kc\u0000ðñ\u0001m'\u009d-`/§z\u0086µ\fËq\u009b,\u009cBÏ\u0084\r\u0099Ä©\u0016Fðè\u001d°àt\u001bùF\u009b\u001bÖÕv\u0010Ú\"\u0010\u0093\u001ewu\u0093z\u0016\u0018\u008bÅ\u0081\u00999Nde(Fí)!PJ\u0001B\u008f;Ã¸!\u0000\u009eÊÕ®C\u0018\u0012¬A\u007f\nÀô¨Z×\u0019såú»ô0R\r² 9àvþ\u001eæC\u00846¸ÔÇ\u0011\u0010J\u0097$NÐÑz¶\u008fg<^A\u0010êÀ;A S,ÍvnÙ¨æ\u00ad\nÁ\u0095\u0003!=ç\u0092Å\u0092·<·£\u0019\"\u00123\u009aùQo²\u0010ÎÝ\u001dIäYÜ\u0099ù#3ñ³ôÌ\u0096(Ò\u0017À9Ðé\u008b\u009f»dJ?BSõ\u0004ócðÔïµî\u0015_¼?b[×·\u0001ÈÕ\u0099þ{Ã¦A"
         .length();
      char var3 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var7;
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new String[18];
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HideSensitiveInfo();
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new Regex("Profile ID: [0-9a-fA-F-]{36}");
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new Regex("Sending to server \\S+\\.\\.\\.");
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new Regex("\\d{2}/\\d{2}/\\d{2}");
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "´wóØ/¢à\u0016\u0011ü\n\u001a´7á\u001aJé\u0005#z¡°0\"i_åV«º\u0015Ç\u000f±N½NÆh\u0019p3\u0083\u0006Î;:\u008büµN\u001f\u0011\u0006ø\u0018ûëP_\u0097Àþ .ë\u0001·KÓ\\éªz V°E1i";
                  var6 = "´wóØ/¢à\u0016\u0011ü\n\u001a´7á\u001aJé\u0005#z¡°0\"i_åV«º\u0015Ç\u000f±N½NÆh\u0019p3\u0083\u0006Î;:\u008büµN\u001f\u0011\u0006ø\u0018ûëP_\u0097Àþ .ë\u0001·KÓ\\éªz V°E1i"
                     .length();
                  var3 = '8';
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23099;
      if (IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/misc/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII", var10
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
         byte[] var9 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5].getBytes("ISO-8859-1");
         IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5];
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
            "me/octo/client/modules/impl/features/misc/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
