package me.octo.client.modules.impl.features.visuals;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.impl.llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII {
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @NotNull
   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

   static {
      long var9 = 84669829035070L ^ 93285488045085L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[32];
      int var6 = 0;
      String var5 = "\u0003å`}J®ºK\u0010ë»>¾áx\u008c\u0012à¤>Â\u0090âö\u0098\u0010§¹£\u0085å:\u0010\u0099Ïïç\u0090âQîÜ\b½\u008fiÇ\u008d\u000eÌc\b\u001aõEÁA·\u001fi\u0010P\u0081B¾l\u0093ö\u009d*K\u008a¶þÈ×Ì\u0010ÆtCô\u0004¹ó\u000fd[b+~\tÇØ\bvëQ¼\u0017\u008fg¤(7eÂOì \u000e¶!UË§É(¯Ææ\u001c\u0099U-!(Ó\bÊ\u0096>ónR\u0015»¿:¬¨eâË\u0010çßb\u0000\u0092qeÑk\u0014£F\u0014¢Z´\u0010 ^\u0096ÜØy\u0085x\u0002ô~\tk^Ô\r\u0010ÏàÓ¾X3N\u0006\u0080ÈR\u009c\u0000nÐ0\u0010ö¥Ù\u0016\u009c \u0081øó^\u0013~Å\u0096!¸ w\t\u001fCÃ\u008e$MDr¼ÿß)(\u0089\u009a\u0084òÜX\u0001CólÑ´\u0094µRW£\b\u000fËc,gsc\u0000\u0010ÏàÓ¾X3N\u0006{\u0097'@TêÆ\u0092\u0018ÏàÓ¾X3N\u0006Á&ï&#\u0083\u001ccº#\u000e\u0083\u0006¦Z\u001b\bäØJÉ\u008b3/\u000f\b\u0081ðý±\u0006\f_u\u0010c!ób¾Ù2\u0095g\u0013\u001f§ìÞ´\u0004\u00186Àzø\u00834Çý\tJ\u009fÅ¹s\u001dOt\u0089º´g8£i\bãnJ+/Y¯&\u00185Ê³Ì9\u001bÓ¾¥çð\u001bç\u000f\u008bTJí+<\u008a\u0081_\u0088 u«¯pnPÏ\u008d¦Á\u0092\u0083_Ø{¦\u0091E\u000bO¼{oo{[Û&µâï\u001d\b\u0011»\u0012ü\t,¼¢\u0018ÏàÓ¾X3N\u0006µçæ\u0089Å\u008dñHx{!\b¹õqó\b]ªN9W\u0084Ü\u0080\bûÝ¥\u0005}7\u0011ô\b\u0086\tgqpl\u0014ö(1ñÅ^\u001f\u001b\u0084»/¿å\u0016eÝ3\u00ad\u0013\u008dVfÜj\u0018S7J}4A\u000e\u00051\u00adIx¾¿\u0007ìr";
      int var7 = "\u0003å`}J®ºK\u0010ë»>¾áx\u008c\u0012à¤>Â\u0090âö\u0098\u0010§¹£\u0085å:\u0010\u0099Ïïç\u0090âQîÜ\b½\u008fiÇ\u008d\u000eÌc\b\u001aõEÁA·\u001fi\u0010P\u0081B¾l\u0093ö\u009d*K\u008a¶þÈ×Ì\u0010ÆtCô\u0004¹ó\u000fd[b+~\tÇØ\bvëQ¼\u0017\u008fg¤(7eÂOì \u000e¶!UË§É(¯Ææ\u001c\u0099U-!(Ó\bÊ\u0096>ónR\u0015»¿:¬¨eâË\u0010çßb\u0000\u0092qeÑk\u0014£F\u0014¢Z´\u0010 ^\u0096ÜØy\u0085x\u0002ô~\tk^Ô\r\u0010ÏàÓ¾X3N\u0006\u0080ÈR\u009c\u0000nÐ0\u0010ö¥Ù\u0016\u009c \u0081øó^\u0013~Å\u0096!¸ w\t\u001fCÃ\u008e$MDr¼ÿß)(\u0089\u009a\u0084òÜX\u0001CólÑ´\u0094µRW£\b\u000fËc,gsc\u0000\u0010ÏàÓ¾X3N\u0006{\u0097'@TêÆ\u0092\u0018ÏàÓ¾X3N\u0006Á&ï&#\u0083\u001ccº#\u000e\u0083\u0006¦Z\u001b\bäØJÉ\u008b3/\u000f\b\u0081ðý±\u0006\f_u\u0010c!ób¾Ù2\u0095g\u0013\u001f§ìÞ´\u0004\u00186Àzø\u00834Çý\tJ\u009fÅ¹s\u001dOt\u0089º´g8£i\bãnJ+/Y¯&\u00185Ê³Ì9\u001bÓ¾¥çð\u001bç\u000f\u008bTJí+<\u008a\u0081_\u0088 u«¯pnPÏ\u008d¦Á\u0092\u0083_Ø{¦\u0091E\u000bO¼{oo{[Û&µâï\u001d\b\u0011»\u0012ü\t,¼¢\u0018ÏàÓ¾X3N\u0006µçæ\u0089Å\u008dñHx{!\b¹õqó\b]ªN9W\u0084Ü\u0080\bûÝ¥\u0005}7\u0011ô\b\u0086\tgqpl\u0014ö(1ñÅ^\u001f\u001b\u0084»/¿å\u0016eÝ3\u00ad\u0013\u008dVfÜj\u0018S7J}4A\u000e\u00051\u00adIx¾¿\u0007ìr"
         .length();
      char var4 = '\b';
      int var13 = -1;

      label28:
      while (true) {
         String var16 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var16.getBytes("ISO-8859-1"));
            String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var22;
                  if ((var13 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[2], var0[8], 1, 8, 3, 0, 32, null
                     );
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[1], var0[29], false);
                     String var25 = var0[3];
                     String var27 = var0[23];
                     String[] var11 = new String[]{var0[18], var0[10], var0[26], var0[0]};
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var25, var27, 0, var11
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[6], var0[20], 0.0F, 1.0F, 0.35F, 0.05F, 0, 64, null
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[11], var0[25], 1.0F, 24.0F, 4.0F, 0.5F, 0, 64, null
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[15], var0[16], 0.0F, 1.0F, 1.0F, 0.05F, 0, 64, null
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[9], var0[22], 0.0F, 1.0F, 0.65F, 0.05F, 0, 64, null
                     );
                     String var26 = var0[19];
                     String var28 = var0[13];
                     boolean[] var14 = new boolean[]{false, false, false, false, false, false, true, false, false, false, false, false};
                     var11 = new String[]{var0[30], var0[17], var0[12], var0[21], var0[5], var0[14], var0[27], var0[31], var0[24], var0[7], var0[4], var0[28]};
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
                        var26, var28, var14, var11
                     );
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var0[var6++] = var22;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label28;
                  }

                  var5 = "Àð\u0089M\u0000\u0006GÔ\u0010zuÜ¼)±\u0083Y\u0091.HñÝü\u0080u";
                  var7 = "Àð\u0089M\u0000\u0006GÔ\u0010zuÜ¼)±\u0083Y\u0091.HñÝü\u0080u".length();
                  var4 = '\b';
                  var13 = -1;
            }

            var16 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
