package me.octo.client.modules.helpers;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.random.Random;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import org.jetbrains.annotations.NotNull;

public final class lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI {
   @NotNull
   public static lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private static BooleanModule lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 34793623292142L;

   private lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI() {
   }

   private final me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String var1, String var2, int var3, int var4
   ) {
      return new me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI(
         var1, var2, 50, 2000, var3, var4, 1, 1
      );
   }

   @NotNull
   public final BooleanModule IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   private final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var1
   ) {
      int var2 = var1.lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII();
      int var3 = var1.llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI();
      return Random.Default.nextInt(var2, var3 + 1);
   }

   private final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1,
      char param3,
      me.octo.client.gui.clickgui.settings.impl.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI param4,
      int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(char param1, char param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(short param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var20 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 101136991274153L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var13 = 1; var13 < 8; var13++) {
         var10003[var13] = (byte)(var20 << var13 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[17];
      int var17 = 0;
      String var16 = "nb½c`s7l\u0084*ÒYÛäz¸¼7\nÝõ\u001b\u0003¸\u0083ÿ¼\u008dÚúÍ\u00154\u008d\u00888%¶\u001d\u001d\u007f\u00953`yf\u0090\u008a3uè\u001dü8´_n\bU,û\u0086j}Ñ¯â²\"á\u0016¹Xnb½c`s7l\u009a]\b$MMÅÿü¢\u0099¨Ct·\u0092\rû©ð\u0007\u00ad]Ô<Jæ¬²¹¨F\u001e¦ËrÌòöÚ\u0088ulM\u001fÌü\u00815\u0083o¾Ñ\u0010õÖÑ\u009b\u0095éÎ-LH\u00913ÊR\f»JÝ\u001a\u009b\u0097;Æáù^\u0010\u008fv§ú»`åÈ=\u008d\u001c£\u0005\u008cÓÈ\u0018\u009dtNo>7@RÛÁ\u0099\u009b\u009a³n¹\u001bÃ\u0096\u0085oJK\u008a\bM¿cØ¦fW|\u0080nb½c`s7l\u009a]\b$MMÅÿûÐP-'¾«ÆgE\u0098:\f6\ro÷xèrY\u0017ÇIOà{? bÖ\u0007ØÄÖ-\u009eÐ\u009cØ¯\u0010/âÈÿÃ\u0089¹-àwBÂµ\f53\u009a\u008b³;X7.R%öd\u0085ñuöò\u009eqkQ\u0099\"ÒÓªNÍ\u0015\u009a4xB\u009a\u008aøoGÙ\u0083YÝüGnïqÔD^»ã±§¦H\u0015O\u0095pÀü·É\u008aJ¬\u0080%¥o\u009f÷w#\b9³Î\u000b#ÐlåÍE:¢\u0011øY`É\u0092×yË\b\u009d¼à\u0099T¿ÀGC´ÃPëë\u000fY¨\u0016Æ¸ÝÚ~\u009c|\re^\u0085\u008a0nb½c`s7l°7»\u0014\u008fÂ\u0099¥êRïÉS\u008a±R8G®OUÆ\u0018bYþ³VMà¼{«o\u0084 z\u0092hÛH\u0015O\u0095pÀü·ÉÐ\u0086'ÈR\u0003\u0085Ö\"ªCûZõK±Mª\u0006\u0095YÁÀ£\u0090¶cU\u0094/Ò¯¸UO\u0015¯\u0018¿©ÈW1¬åb#Ä(\u0005-N)CL\u001a\u0096\u000bÍç\u0005ñvò\u00180ÉÎ\u0015ß\u0000\u0081\u000f\u0012\u000f\u00adK\u008cÍ×ñ\u007fMÐ\u0011á^Õ²\u0010ë`}z\u00927\t|×9Ð\b\u0000\u0086\u0002ú@nb½c`s7lØÙ»\u0080\u0014\u0088nå[gÐÎC\u007fô\u000f\u0004Õ¬¥zÆ\u0080[\u001fN'îæAE\u0012\u00adI£ÊÄémóð}ó \tøÌÿøjÂ\u0081·Äô\"\u0090PÞ\u0016\u008b2Ú¶+y,_®:_\u001fÂ8X8\u001d\u0084ÕïÈìÍ\u008f=ó0h\u009eÌt\u0012¶Uøp\n\n\u0089\u008cÔæäúÜB\f5ÓLËe\u009awJ\u0092dÃ\u0095²·é<±Ø©SñCÙ\u0089ÈÒÞ\u0086Øê³H\u0002HX<½WOÚ\u0098]e²&\\J`KoD\u0088Ë= jv&Us\u001fY\u0095\u0013\u0099æ4\u001a\u0096ÅøQ%\u0001Ì´\u0010ÛyÂft\u0016§.ÖY\u008d\u0016#Äâ#\u0005\u0018\u009dtNo>7@R\u0000\u0004NãE\u0001R±\u000fW\u009eÀ\u0083Xµ4\u0010äã|.g|n\u001c)w¦bxHÏþ";
      int var18 = "nb½c`s7l\u0084*ÒYÛäz¸¼7\nÝõ\u001b\u0003¸\u0083ÿ¼\u008dÚúÍ\u00154\u008d\u00888%¶\u001d\u001d\u007f\u00953`yf\u0090\u008a3uè\u001dü8´_n\bU,û\u0086j}Ñ¯â²\"á\u0016¹Xnb½c`s7l\u009a]\b$MMÅÿü¢\u0099¨Ct·\u0092\rû©ð\u0007\u00ad]Ô<Jæ¬²¹¨F\u001e¦ËrÌòöÚ\u0088ulM\u001fÌü\u00815\u0083o¾Ñ\u0010õÖÑ\u009b\u0095éÎ-LH\u00913ÊR\f»JÝ\u001a\u009b\u0097;Æáù^\u0010\u008fv§ú»`åÈ=\u008d\u001c£\u0005\u008cÓÈ\u0018\u009dtNo>7@RÛÁ\u0099\u009b\u009a³n¹\u001bÃ\u0096\u0085oJK\u008a\bM¿cØ¦fW|\u0080nb½c`s7l\u009a]\b$MMÅÿûÐP-'¾«ÆgE\u0098:\f6\ro÷xèrY\u0017ÇIOà{? bÖ\u0007ØÄÖ-\u009eÐ\u009cØ¯\u0010/âÈÿÃ\u0089¹-àwBÂµ\f53\u009a\u008b³;X7.R%öd\u0085ñuöò\u009eqkQ\u0099\"ÒÓªNÍ\u0015\u009a4xB\u009a\u008aøoGÙ\u0083YÝüGnïqÔD^»ã±§¦H\u0015O\u0095pÀü·É\u008aJ¬\u0080%¥o\u009f÷w#\b9³Î\u000b#ÐlåÍE:¢\u0011øY`É\u0092×yË\b\u009d¼à\u0099T¿ÀGC´ÃPëë\u000fY¨\u0016Æ¸ÝÚ~\u009c|\re^\u0085\u008a0nb½c`s7l°7»\u0014\u008fÂ\u0099¥êRïÉS\u008a±R8G®OUÆ\u0018bYþ³VMà¼{«o\u0084 z\u0092hÛH\u0015O\u0095pÀü·ÉÐ\u0086'ÈR\u0003\u0085Ö\"ªCûZõK±Mª\u0006\u0095YÁÀ£\u0090¶cU\u0094/Ò¯¸UO\u0015¯\u0018¿©ÈW1¬åb#Ä(\u0005-N)CL\u001a\u0096\u000bÍç\u0005ñvò\u00180ÉÎ\u0015ß\u0000\u0081\u000f\u0012\u000f\u00adK\u008cÍ×ñ\u007fMÐ\u0011á^Õ²\u0010ë`}z\u00927\t|×9Ð\b\u0000\u0086\u0002ú@nb½c`s7lØÙ»\u0080\u0014\u0088nå[gÐÎC\u007fô\u000f\u0004Õ¬¥zÆ\u0080[\u001fN'îæAE\u0012\u00adI£ÊÄémóð}ó \tøÌÿøjÂ\u0081·Äô\"\u0090PÞ\u0016\u008b2Ú¶+y,_®:_\u001fÂ8X8\u001d\u0084ÕïÈìÍ\u008f=ó0h\u009eÌt\u0012¶Uøp\n\n\u0089\u008cÔæäúÜB\f5ÓLËe\u009awJ\u0092dÃ\u0095²·é<±Ø©SñCÙ\u0089ÈÒÞ\u0086Øê³H\u0002HX<½WOÚ\u0098]e²&\\J`KoD\u0088Ë= jv&Us\u001fY\u0095\u0013\u0099æ4\u001a\u0096ÅøQ%\u0001Ì´\u0010ÛyÂft\u0016§.ÖY\u008d\u0016#Äâ#\u0005\u0018\u009dtNo>7@R\u0000\u0004NãE\u0001R±\u000fW\u009eÀ\u0083Xµ4\u0010äã|.g|n\u001c)w¦bxHÏþ"
         .length();
      char var15 = 'H';
      int var24 = -1;

      label45:
      while (true) {
         String var25 = var16.substring(++var24, var24 + var15);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var34 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19).intern();
            switch (var10001) {
               case 0:
                  var11[var17++] = var34;
                  if ((var24 += var15) >= var18) {
                     Cipher var1;
                     var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var2 = 1; var2 < 8; var2++) {
                        var10003[var2] = (byte)(var20 << var2 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var0 = new long[2];
                     int var4 = 0;
                     String var5 = "pØÅH3\u0019¾·õÐÃ\u0096oWoº";
                     int var6 = "pØÅH3\u0019¾·õÐÃ\u0096oWoº".length();
                     byte var3 = 0;

                     do {
                        var10001 = var3;
                        var3 += 8;
                        byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
                        var10001 = var4++;
                        long var8 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte[] var10 = var1.doFinal(
                           new byte[]{
                              (byte)(var8 >>> 56),
                              (byte)(var8 >>> 48),
                              (byte)(var8 >>> 40),
                              (byte)(var8 >>> 32),
                              (byte)(var8 >>> 24),
                              (byte)(var8 >>> 16),
                              (byte)(var8 >>> 8),
                              (byte)var8
                           }
                        );
                        long var10004 = (var10[0] & 255L) << 56
                           | (var10[1] & 255L) << 48
                           | (var10[2] & 255L) << 40
                           | (var10[3] & 255L) << 32
                           | (var10[4] & 255L) << 24
                           | (var10[5] & 255L) << 16
                           | (var10[6] & 255L) << 8
                           | var10[7] & 255L;
                        byte var40 = -1;
                        var0[var10001] = var10004;
                     } while (var3 < var6);

                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = (int)var0[0];
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (int)var0[1];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[10], var11[0], 200, 350
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[2], var11[7], 300, 500
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[3], var11[5], 400, 600
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[13], var11[1], 500, 8004
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[15], var11[8], 200, 201
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[9], var11[6], 200, 500
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        var11[16], var11[11], 500, 600
                     );
                     String var38 = var11[14];
                     String var41 = var11[12];
                     ModuleCategory var42 = ModuleCategory.ADDONS;
                     String var10005 = var11[4];
                     Setting[] var22 = new Setting[]{
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                        lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                        IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                        llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI
                     };
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new BooleanModule(
                        var38, var41, var42, var10005, false, var22
                     );
                     return;
                  }

                  var15 = var16.charAt(var24);
                  break;
               default:
                  var11[var17++] = var34;
                  if ((var24 += var15) < var18) {
                     var15 = var16.charAt(var24);
                     continue label45;
                  }

                  var16 = "0ÉÎ\u0015ß\u0000\u0081\u000f\u0012\u000f\u00adK\u008cÍ×ñCï&±\u0093¹)ã\u0010JòÉ5\u0001\u001dõt\u0010\u0092_ÂBÌé_";
                  var18 = "0ÉÎ\u0015ß\u0000\u0081\u000f\u0012\u000f\u00adK\u008cÍ×ñCï&±\u0093¹)ã\u0010JòÉ5\u0001\u001dõt\u0010\u0092_ÂBÌé_".length();
                  var15 = 24;
                  var24 = -1;
            }

            var25 = var16.substring(++var24, var24 + var15);
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
}
