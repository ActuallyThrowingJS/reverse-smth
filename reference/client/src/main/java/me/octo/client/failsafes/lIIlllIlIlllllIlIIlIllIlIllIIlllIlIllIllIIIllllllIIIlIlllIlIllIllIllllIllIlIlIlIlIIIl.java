package me.octo.client.failsafes;

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
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl {
   @NotNull
   public static lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 72412588464383L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl() {
   }

   @NotNull
   public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final BooleanSetting lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 76927958347506L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[8];
      int var5 = 0;
      String var4 = "ºg<\u0006'\u009bpôf\u008bÈ}\u009e[;$i7Ô\u0019Ü<âÕ¾(ªÓ\u001cvO\u0007Õ \u0093H\u00ad1\u008e\u0019«*¯i\u0080¹é\u0096\u0098sèÛ!èw\u0080åcO\u000fxmè£xþÄJ^/â\u00139\u0095\u00ad9G@QÐ\u0094\u0095s\u0083Ç½\u001a¾¯dÄ@\u001a^HHO/¾²Ü^\u0085I5\u0017Mû£´@\u001c@¯7sU×9-¥«¿á\u0092ÄE2\u0006\u0093¨¦õ°Zøº\u0092\tó\u0095\u0090Ø§\u0011Ø&D\u0090`¬/}®:\u0011¤î\u009dÙâ\u0002yh\u0086$`#¶iÆ&õ\u0088k)3\u0010qÆW¬éÎ\u0093\u000fþ¨\u007f¼¡Øí_8\u0091xFØ1[d\u0018YeB¯e\u0095G\u0017Ún²µ=íK³&R^\u0017\u000eBq5Ô\u001a|¦s\u009bìg1'\u0005\u0013=Ý+îvzp\u0016\u0012ñ\u008a[\u0018N\u0085\u0013\u0003uLð>¼0/#£ÓW,\u008e\u0093i µ_,Û¸\u008aH\u009a\u008dÀÊûY$\u0006\u001aÇà¹\u0095Spó\u0003ÿ\u0088\fÄøÛza'uÊ\u009b\u001f\u00adêÚÝØ\nìø\u009dýùæÕ\u0092dB:^ÂÖ\u009e«\u0010¸\u0095<»ùÌ\u0014h¼¯:\u0015j%\f\u0087\u0084\u000b\u0085C\u001a4IÎ0¤p\u0018æ¸ëð¦«\u008c!\n\u008c½\u0080(\u0088iñÙ\tÿ!Îó\u0085,¡\u0095óÁû\u0089d\u001f´\u000b5s-6Â\u009dº?,c\u0010é\u001bÍ×¿õìL\\\u0007ð×Ô\u0017\u000ekÜÆñxÚ\"\u009d2£#¡\u0094ì$A\r&nEÆ\r¾°\u0091íL>´})¿_\u0089\u0087Ø¼\u0005Ï\u0011Ä";
      int var6 = "ºg<\u0006'\u009bpôf\u008bÈ}\u009e[;$i7Ô\u0019Ü<âÕ¾(ªÓ\u001cvO\u0007Õ \u0093H\u00ad1\u008e\u0019«*¯i\u0080¹é\u0096\u0098sèÛ!èw\u0080åcO\u000fxmè£xþÄJ^/â\u00139\u0095\u00ad9G@QÐ\u0094\u0095s\u0083Ç½\u001a¾¯dÄ@\u001a^HHO/¾²Ü^\u0085I5\u0017Mû£´@\u001c@¯7sU×9-¥«¿á\u0092ÄE2\u0006\u0093¨¦õ°Zøº\u0092\tó\u0095\u0090Ø§\u0011Ø&D\u0090`¬/}®:\u0011¤î\u009dÙâ\u0002yh\u0086$`#¶iÆ&õ\u0088k)3\u0010qÆW¬éÎ\u0093\u000fþ¨\u007f¼¡Øí_8\u0091xFØ1[d\u0018YeB¯e\u0095G\u0017Ún²µ=íK³&R^\u0017\u000eBq5Ô\u001a|¦s\u009bìg1'\u0005\u0013=Ý+îvzp\u0016\u0012ñ\u008a[\u0018N\u0085\u0013\u0003uLð>¼0/#£ÓW,\u008e\u0093i µ_,Û¸\u008aH\u009a\u008dÀÊûY$\u0006\u001aÇà¹\u0095Spó\u0003ÿ\u0088\fÄøÛza'uÊ\u009b\u001f\u00adêÚÝØ\nìø\u009dýùæÕ\u0092dB:^ÂÖ\u009e«\u0010¸\u0095<»ùÌ\u0014h¼¯:\u0015j%\f\u0087\u0084\u000b\u0085C\u001a4IÎ0¤p\u0018æ¸ëð¦«\u008c!\n\u008c½\u0080(\u0088iñÙ\tÿ!Îó\u0085,¡\u0095óÁû\u0089d\u001f´\u000b5s-6Â\u009dº?,c\u0010é\u001bÍ×¿õìL\\\u0007ð×Ô\u0017\u000ekÜÆñxÚ\"\u009d2£#¡\u0094ì$A\r&nEÆ\r¾°\u0091íL>´})¿_\u0089\u0087Ø¼\u0005Ï\u0011Ä"
         .length();
      char var3 = 'p';
      int var14 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var14, var14 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var14 += var3) >= var6) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[8];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl();
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(
                        "Extra Wait", "Waits extra time before reacting.", false
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                        private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 53454593436044L;
                        private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                        private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                        private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                        {
                           long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 77094991830113L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              .IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();
                        }

                        static {
                           long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 114028159106605L;
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
                           String var6 = "wï\u001b\u0007L\u0086B\u0091;!W\u00936\u001dO\u0019Ùù#[©\u0086©L·\u0018°ÍÚ5p.ò\u001b_\u0011Ë%\u0013ræ\u0007éJ\u007fUÌ\u000eTÚÜeAk[\u00ad\\?¡\u008c{Ü&\u007fÉ'Íq\u008bS¡èäü\u00ad\n½ÖÂ\u0099\u0088Óî\u009e¾\u0086¼> G\u009fâ\u009cOlz¾8Þ¥\u0015¼õ\nä·\u0085P:Æ¹\u0099õØO¤\\ÐH[\u0096";
                           int var8 = "wï\u001b\u0007L\u0086B\u0091;!W\u00936\u001dO\u0019Ùù#[©\u0086©L·\u0018°ÍÚ5p.ò\u001b_\u0011Ë%\u0013ræ\u0007éJ\u007fUÌ\u000eTÚÜeAk[\u00ad\\?¡\u008c{Ü&\u007fÉ'Íq\u008bS¡èäü\u00ad\n½ÖÂ\u0099\u0088Óî\u009e¾\u0086¼> G\u009fâ\u009cOlz¾8Þ¥\u0015¼õ\nä·\u0085P:Æ¹\u0099õØO¤\\ÐH[\u0096"
                              .length();
                           char var5 = 'X';
                           int var4 = -1;

                           while (true) {
                              byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                              String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                              byte var10001 = -1;
                              var9[var7++] = var13;
                              if ((var4 += var5) >= var8) {
                                 lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                                 lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                                 return;
                              }

                              var5 = var6.charAt(var4);
                           }
                        }

                        private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                           int var1 = 0;
                           int var2;
                           char[] var3x = new char[var2 = var0x.length];

                           for (int var4x = 0; var4x < var2; var4x++) {
                              int var5x;
                              if ((var5x = 255 & var0x[var4x]) < 192) {
                                 var3x[var1++] = (char)var5x;
                              } else if (var5x < 224) {
                                 char var6x = (char)((char)(var5x & 31) << 6);
                                 byte var8x = var0x[++var4x];
                                 var6x = (char)(var6x | (char)(var8x & 63));
                                 var3x[var1++] = var6x;
                              } else if (var4x < var2 - 2) {
                                 char var12 = (char)((char)(var5x & 15) << '\f');
                                 byte var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63) << 6);
                                 var9x = var0x[++var4x];
                                 var12 = (char)(var12 | (char)(var9x & 63));
                                 var3x[var1++] = var12;
                              }
                           }

                           return new String(var3x, 0, var1);
                        }

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1) {
                           int var5x = var0x ^ (int)(var1 & 32767L) ^ 20202;
                           if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                              Object[] var4x;
                              try {
                                 Long var3x = Thread.currentThread().threadId();
                                 var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3x);
                                 if (var4x == null) {
                                    var4x = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3x, var4x);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
                                    var10
                                 );
                              }

                              byte[] var6x = new byte[8];
                              var6x[0] = (byte)(var1 >>> 56);

                              for (int var7x = 1; var7x < 8; var7x++) {
                                 var6x[var7x] = (byte)(var1 << var7x * 8 >>> 56);
                              }

                              DESKeySpec var11 = new DESKeySpec(var6x);
                              SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                              ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                              byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x]
                                 .getBytes("ISO-8859-1");
                              lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4x[0]).doFinal(var9x)
                              );
                           }

                           return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, MutableCallSite var1, String var2, Object[] var3x
                        ) {
                           int var4x = (Integer)var3x[0];
                           long var5x = (Long)var3x[1];
                           String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                           MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                           var1.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                           return var7x;
                        }

                        private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0x, String var1, MethodType var2
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
                                       var1
                                    ),
                                    var2
                                 )
                              );
                              return var3x;
                           } catch (Exception var5x) {
                              throw new RuntimeException(
                                 "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5x
                              );
                           }
                        }
                     };
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(
                        "Chat Messages", "Whether responder should send chat messages during staff checks.", true
                     );
                     String[] var12 = new String[]{"Custom", "Generator"};
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var12
                     ) {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 30371900183705L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 12250472637539L;
                        }

                        @Override
                        public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                           return lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                              .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
                              .isToggled();
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 95091597421029L;
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
                           String var6 = "[ä\u0010\u008de:Ñ#ç6`ô\u009e\u0017\u008b\u008d:\u0081áë£¯\u0084\\\".\u0019ÿ\u0099*ÃF³\u0084\u008d\u001c\u0085¶±ñhÂ·%U¨¬^.\u0095¿Ã<\u001aÏ\u0085.\u001dNÃstU¶RªÙki;õp\u00adwÖ@ËåÒàO\u0015ô)\u008c/\u000bÓ°µW\u0093yñ\u0011]\u008cZZø\u00ad\u000eu«µHi\n\\ÿª«ëäqì¤;??âå\u0017Ó«ªØE\u0015· ¸Öà\u009d`\u0007&\u0085\u008a§K\u001bÏm";
                           int var8 = "[ä\u0010\u008de:Ñ#ç6`ô\u009e\u0017\u008b\u008d:\u0081áë£¯\u0084\\\".\u0019ÿ\u0099*ÃF³\u0084\u008d\u001c\u0085¶±ñhÂ·%U¨¬^.\u0095¿Ã<\u001aÏ\u0085.\u001dNÃstU¶RªÙki;õp\u00adwÖ@ËåÒàO\u0015ô)\u008c/\u000bÓ°µW\u0093yñ\u0011]\u008cZZø\u00ad\u000eu«µHi\n\\ÿª«ëäqì¤;??âå\u0017Ó«ªØE\u0015· ¸Öà\u009d`\u0007&\u0085\u008a§K\u001bÏm"
                              .length();
                           char var5 = '(';
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

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 12368;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0, MutableCallSite var1, String var2, Object[] var3
                        ) {
                           int var4 = (Integer)var3[0];
                           long var5 = (Long)var3[1];
                           String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
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
                                 "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                    + " : "
                                    + var1
                                    + " : "
                                    + var2.toString(),
                                 var5
                              );
                           }
                        }
                     };
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting() {
                        private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 63388859427079L;
                        private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
                        private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
                        private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

                        {
                           long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 17977714514618L;
                        }

                        @Override
                        public void llIlIIIlIllIIIIIIlllIIIIIIllIIIIIIlIIIIIllIIIIlIllIIlIlllIIIlIIlIllIIIlIIllllllIlIlIl(long var1) {
                           long var3x = var1 ^ 51616658310007L;

                           try {
                              if (IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
                                 .isToggled()) {
                                 lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                                    .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3x);
                              }
                           } catch (MatchException var5x) {
                              throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                                 var5x, 189084072568227410L, var1
                              );
                           }
                        }

                        static {
                           long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 69288166968465L;
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
                           String var6 = "Yç\u0016Uõ;+[09\u0080\u0010h\u0014ØÓQ\u0014µ\u009f©¢1\u009bÁqò/Rr\u001d5Ce!¦ß>ë5L\u0011'µF\u001eÆ\u0091xê§u\u0098õÊ\u0099\u0092L\u0002^{\u001fiP\u0000m§\u001eJg?ò\u0082»¹®\u001a¯q\u001cFJ\u0084\u009cdýª\u0088[ò\u001dÙ¦\u0005/ì\n\u0082Ó4W\u008f\\\u001e?ÄtÎ\u008f)\u0002ô(\u008fÅ³jæRGËá,Î\u008bCÙhÉ¸þÓA\u0015\u000blZ³!\u0095÷Gl©\ni¦ ¾@S¡\u0012";
                           int var8 = "Yç\u0016Uõ;+[09\u0080\u0010h\u0014ØÓQ\u0014µ\u009f©¢1\u009bÁqò/Rr\u001d5Ce!¦ß>ë5L\u0011'µF\u001eÆ\u0091xê§u\u0098õÊ\u0099\u0092L\u0002^{\u001fiP\u0000m§\u001eJg?ò\u0082»¹®\u001a¯q\u001cFJ\u0084\u009cdýª\u0088[ò\u001dÙ¦\u0005/ì\n\u0082Ó4W\u008f\\\u001e?ÄtÎ\u008f)\u0002ô(\u008fÅ³jæRGËá,Î\u008bCÙhÉ¸þÓA\u0015\u000blZ³!\u0095÷Gl©\ni¦ ¾@S¡\u0012"
                              .length();
                           char var5 = 'p';
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

                        private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                           MatchException var0x
                        ) {
                           return var0x;
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

                        private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                           int var5 = var0 ^ (int)(var1 & 32767L) ^ 7012;
                           if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
                              Object[] var4;
                              try {
                                 Long var3 = Thread.currentThread().threadId();
                                 var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
                                 if (var4 == null) {
                                    var4 = new Object[]{
                                       Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                    };
                                    lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
                                 }
                              } catch (Exception var10) {
                                 throw new RuntimeException(
                                    "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                              byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
                              llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                                 ((Cipher)var4[0]).doFinal(var9)
                              );
                           }

                           return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
                        }

                        private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                           Lookup var0, MutableCallSite var1, String var2, Object[] var3
                        ) {
                           int var4 = (Integer)var3[0];
                           long var5 = (Long)var3[1];
                           String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
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
                                 "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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

                  var3 = var4.charAt(var14);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var14 += var3) < var6) {
                     var3 = var4.charAt(var14);
                     continue label27;
                  }

                  var4 = "õ6\u009d\"¦\u0090\u0091¼3¨a ÈE\u0013°¾\u0017\u0093\u0010\u0085çPÞþÏÉ]¾J\u0017£\u00189áÉ8%\u008aý\u0090z\u0095oP\u000bÚñ\u009fØj@\u0099éxLÔ";
                  var6 = "õ6\u009d\"¦\u0090\u0091¼3¨a ÈE\u0013°¾\u0017\u0093\u0010\u0085çPÞþÏÉ]¾J\u0017£\u00189áÉ8%\u008aý\u0090z\u0095oP\u000bÚñ\u009fØj@\u0099éxLÔ"
                     .length();
                  var3 = ' ';
                  var14 = -1;
            }

            var15 = var4.substring(++var14, var14 + var3);
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

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10844;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
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
            "me/octo/client/failsafes/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
