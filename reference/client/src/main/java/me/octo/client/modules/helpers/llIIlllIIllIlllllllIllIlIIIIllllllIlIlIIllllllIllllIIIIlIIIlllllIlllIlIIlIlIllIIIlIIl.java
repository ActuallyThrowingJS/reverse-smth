package me.octo.client.modules.helpers;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public final class llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl {
   @NotNull
   public static llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanModule IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;

   private llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl() {
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final BooleanModule lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   private static final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      Minecraft.getInstance().setScreen(new llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI());
   }

   private static final Unit IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      Minecraft.getInstance()
         .execute(
            llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII
         );
      return Unit.INSTANCE;
   }

   static {
      long var9 = 118774492319154L ^ 8517737726489L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[14];
      int var6 = 0;
      String var5 = "\u0088\u0094¨\u000eEØÂæa<ÁÅ(ÿ|%8cl\u001c«5\u0092;\u008f3üMr\u0016k\u0010/\u0010ìÕÇ\fw:¶\\r\u0013£ïÞ\u008b~@\u009b=\u007f7M?ßÀö\u0080.\u001cÖÜðTö{ª\fÕXe\u0010}V`8D\u009d!\u00040#enLI@ÀP,Á¤\u0083±x}\b\u008c5'nW\u0014z\u0098ä¦ ËIÐÇ\u0017½.D\u0011©\u0002X[\u0018w\u008a)\u0019\u0097êÍ\n[vÐ!ít~#,\nÅòöú\u0017¦\u0095gv.Áü\r\u0011ÿ$å\u009boô\u0080¶ÌqdúUy$\u0010uÝA{Ï%±Fn\u000f3¹R\u0097\u009cÜx}V`8D\u009d!\u0004P\u0080ºR©28\u008cF7\u0080\u008a«\u0019%ûÒ\u0084,Q\rìÛ\u0000\bDÇ\f´Ý\u001b\u0082q?\u0019ð$\u0088\u0095@5\u000fÇôî\u001c\u009e7'~4>}ò*V3\u008dÓx8¦¤%úîØ\u0081\u001f¡\u0015(L¯å\u0012\u0099\n,Èè\\ÙP\u0007 bEÿ,É\u0091èÒkÙ²\u008cÀ\u008c¼9?3Ø$\f>hÙÀ6(o+ýéu\u009aõD\u008btVÇ\u008fR\u009c \u0014\u000b\u0004\u0092ÙÇ³Û6gsîì\u0013X¢o2Âà\u001c\u0082½ã\u00109K¶ÇH\u0007ý\tEÕû´Y\u008c£\r\bu@¡%!XBm\u0010£~×ý~\u009c¿æÖÆB²ø\tÆc\b¬eN\u009f\u009b\u0093\u0098\u0004\u0010]\u00019Ò8±\u00adô\u0005:\r`8\nìq";
      int var7 = "\u0088\u0094¨\u000eEØÂæa<ÁÅ(ÿ|%8cl\u001c«5\u0092;\u008f3üMr\u0016k\u0010/\u0010ìÕÇ\fw:¶\\r\u0013£ïÞ\u008b~@\u009b=\u007f7M?ßÀö\u0080.\u001cÖÜðTö{ª\fÕXe\u0010}V`8D\u009d!\u00040#enLI@ÀP,Á¤\u0083±x}\b\u008c5'nW\u0014z\u0098ä¦ ËIÐÇ\u0017½.D\u0011©\u0002X[\u0018w\u008a)\u0019\u0097êÍ\n[vÐ!ít~#,\nÅòöú\u0017¦\u0095gv.Áü\r\u0011ÿ$å\u009boô\u0080¶ÌqdúUy$\u0010uÝA{Ï%±Fn\u000f3¹R\u0097\u009cÜx}V`8D\u009d!\u0004P\u0080ºR©28\u008cF7\u0080\u008a«\u0019%ûÒ\u0084,Q\rìÛ\u0000\bDÇ\f´Ý\u001b\u0082q?\u0019ð$\u0088\u0095@5\u000fÇôî\u001c\u009e7'~4>}ò*V3\u008dÓx8¦¤%úîØ\u0081\u001f¡\u0015(L¯å\u0012\u0099\n,Èè\\ÙP\u0007 bEÿ,É\u0091èÒkÙ²\u008cÀ\u008c¼9?3Ø$\f>hÙÀ6(o+ýéu\u009aõD\u008btVÇ\u008fR\u009c \u0014\u000b\u0004\u0092ÙÇ³Û6gsîì\u0013X¢o2Âà\u001c\u0082½ã\u00109K¶ÇH\u0007ý\tEÕû´Y\u008c£\r\bu@¡%!XBm\u0010£~×ý~\u009c¿æÖÆB²ø\tÆc\b¬eN\u009f\u009b\u0093\u0098\u0004\u0010]\u00019Ò8±\u00adô\u0005:\r`8\nìq"
         .length();
      char var4 = '\u0010';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var23;
         if ((var3 += var4) >= var7) {
            var5 = "\u0088\u0094¨\u000eEØÂæa<ÁÅ(ÿ|%°l7\u00900uÈ\u0086Çïô\u001dÞ\u0004\u0082\u0001\u0081¸\u001eY)9\u0014\u0089²hC\u007f_Ãæ\u0097\u0082Ë\u009e\u0081-Ã\u0003ØÂùE\u001eÐ?\u0088å\u0088`\u0090®Ó8äqøâK\u0090»ð\u000bµç`ÚÓð\u0089ð\u0082×g§Ï\u0099ø>\u0013Ú\u0092`\u001c6÷ê\u008c¶'\u007f.;Of\u009cîRcÅ\u001bÙhZ'\u001c\u0010\u0087ï\r¿e\u009772Hâ\u0091\u0018\u008a\r\u001bÀ9\u009eRÝØ·ªìÄ¶Ôwt\u008e6·^\u008eèä«t\u008f\u0019ìSwGâZÑ\u0018\r\nRê@ØÐP\u0098uQç\u0085þ\u0001H\u0000xø\u008f¯g";
            var7 = "\u0088\u0094¨\u000eEØÂæa<ÁÅ(ÿ|%°l7\u00900uÈ\u0086Çïô\u001dÞ\u0004\u0082\u0001\u0081¸\u001eY)9\u0014\u0089²hC\u007f_Ãæ\u0097\u0082Ë\u009e\u0081-Ã\u0003ØÂùE\u001eÐ?\u0088å\u0088`\u0090®Ó8äqøâK\u0090»ð\u000bµç`ÚÓð\u0089ð\u0082×g§Ï\u0099ø>\u0013Ú\u0092`\u001c6÷ê\u008c¶'\u007f.;Of\u009cîRcÅ\u001bÙhZ'\u001c\u0010\u0087ï\r¿e\u009772Hâ\u0091\u0018\u008a\r\u001bÀ9\u009eRÝØ·ªìÄ¶Ôwt\u008e6·^\u008eèä«t\u008f\u0019ìSwGâZÑ\u0018\r\nRê@ØÐP\u0098uQç\u0085þ\u0001H\u0000xø\u008f¯g"
               .length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var0[var6++] = var25;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     var0[0],
                     var0[1],
                     var0[12],
                     llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[11], var0[13], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[9], var0[6], 5, 60, 15, 1
                  );
                  String var27 = var0[8];
                  String var29 = var0[5];
                  String[] var11 = new String[]{var0[2], var0[4]};
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var27, var29, var11
                  );
                  String var28 = var0[7];
                  String var30 = var0[3];
                  ModuleCategory var10004 = ModuleCategory.ADDONS;
                  String var10005 = var0[10];
                  Setting[] var19 = new Setting[]{
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  };
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanModule(
                     var28, var30, var10004, var10005, var19
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
