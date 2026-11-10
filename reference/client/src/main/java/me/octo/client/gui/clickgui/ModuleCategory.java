package me.octo.client.gui.clickgui;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ModuleCategory {
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   GENERAL,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   HUD,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   FAILSAFES,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   ADDONS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   ROTATIONS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   MACROS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   ROUTES,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   SKILLS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   RIFT,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   VISUALS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   MISC,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   QOL,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   SCRIPTS,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   FORAGING,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   MINING,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   COMBAT,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   FISHING,
   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   FARMING;

   private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static int IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;

   private ModuleCategory(String var3, int var4) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var4;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 0;
   }

   public static ModuleCategory IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return GENERAL;
   }

   public int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl++;
   }

   public String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
      return true;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = 64923099200319L ^ 68648652401272L;
      if (IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() == 0) {
         byte var11 = 70;
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      }

      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[36];
      int var6 = 0;
      String var5 = "jå\u0011u\u0005IX}\u0010\u0084\u0094\u0014ùÎâá\u0003>x¤¸T[ÐÒ\bçù ¤\u008c\u0091_»\bY¡:×é:ÞQ\u0010kc¥%ºð\u0083\n=ÌW\u0002ôN'Ä\b¥\u0087\u0084²\u009dS²v\b/ÍÄÞ1\u0093¤(\b\u009dïëVRôòH\bòR@kS8q[\bÚÃ\u0002\u009cÞÜm8\b=G!\u0093\u009fÓ\u0014~\bfø?a*Æ)\u0014\bL\u0082T\"|\u0011 \u0099\b\u008d\u0081\u0019z¡\u0016Kr\b\u008fæ\u0017\u0080¼Y\u0007\u0092\buR#y(yÆ\u0001\u0010B¨-\u0005¯²\u00ad\u0092ã*ÅW~\u0094÷\u0007\b\\\u0017Ííëç5|\u0010U\u008c\u0086µÀ ¤\u008a¨á*\u0004XÂ\u0003\u0013\bÊJ»HÑ¦Î,\b\u0093\u009cÜÓ\u0091dÅ\u00ad\b°p-qòÒ\u00ad\u0084\bÙå\u0010RO\u008bÙ»\bb\tl\u0096Ú\u0083eg\b\tybÃ7Ð\u0011r\b\tybÃ7Ð\u0011r\bÙå\u0010RO\u008bÙ»\b¯&g\nsJRá\b\u0092Ý%â6\u0001\u0004£\b&DÉ\r£ÓË\u001e\bÖ\u0007É\u0087\u000e\u0085|+\u0010)Ð\u0011z0UM ú\u000f9Ö\u0019¦\u0018Ô\bÇ²\u0080\u001cR\u008bwÊ\b«\u008b\u0004Äh¹´u";
      int var7 = "jå\u0011u\u0005IX}\u0010\u0084\u0094\u0014ùÎâá\u0003>x¤¸T[ÐÒ\bçù ¤\u008c\u0091_»\bY¡:×é:ÞQ\u0010kc¥%ºð\u0083\n=ÌW\u0002ôN'Ä\b¥\u0087\u0084²\u009dS²v\b/ÍÄÞ1\u0093¤(\b\u009dïëVRôòH\bòR@kS8q[\bÚÃ\u0002\u009cÞÜm8\b=G!\u0093\u009fÓ\u0014~\bfø?a*Æ)\u0014\bL\u0082T\"|\u0011 \u0099\b\u008d\u0081\u0019z¡\u0016Kr\b\u008fæ\u0017\u0080¼Y\u0007\u0092\buR#y(yÆ\u0001\u0010B¨-\u0005¯²\u00ad\u0092ã*ÅW~\u0094÷\u0007\b\\\u0017Ííëç5|\u0010U\u008c\u0086µÀ ¤\u008a¨á*\u0004XÂ\u0003\u0013\bÊJ»HÑ¦Î,\b\u0093\u009cÜÓ\u0091dÅ\u00ad\b°p-qòÒ\u00ad\u0084\bÙå\u0010RO\u008bÙ»\bb\tl\u0096Ú\u0083eg\b\tybÃ7Ð\u0011r\b\tybÃ7Ð\u0011r\bÙå\u0010RO\u008bÙ»\b¯&g\nsJRá\b\u0092Ý%â6\u0001\u0004£\b&DÉ\r£ÓË\u001e\bÖ\u0007É\u0087\u000e\u0085|+\u0010)Ð\u0011z0UM ú\u000f9Ö\u0019¦\u0018Ô\bÇ²\u0080\u001cR\u008bwÊ\b«\u008b\u0004Äh¹´u"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "¤ÎHÎ/=î\u0081\u0010¸êOF\f\u0012¤²²\u0088öÇ-\u009aÛì";
            var7 = "¤ÎHÎ/=î\u0081\u0010¸êOF\f\u0012¤²²\u0088öÇ-\u009aÛì".length();
            var4 = '\b';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  GENERAL = new ModuleCategory(var0[0], 0);
                  HUD = new ModuleCategory(var0[24], 1);
                  FAILSAFES = new ModuleCategory(var0[35], 2);
                  ADDONS = new ModuleCategory(var0[7], 3);
                  ROTATIONS = new ModuleCategory(var0[1], 4);
                  MACROS = new ModuleCategory(var0[21], 5);
                  ROUTES = new ModuleCategory(var0[2], 6);
                  SKILLS = new ModuleCategory(var0[28], 7);
                  RIFT = new ModuleCategory(var0[34], 8);
                  VISUALS = new ModuleCategory(var0[11], 9);
                  MISC = new ModuleCategory(var0[5], 10);
                  QOL = new ModuleCategory(var0[26], 11);
                  SCRIPTS = new ModuleCategory(var0[19], 12);
                  FORAGING = new ModuleCategory(var0[31], 13);
                  MINING = new ModuleCategory(var0[15], 14);
                  COMBAT = new ModuleCategory(var0[14], 15);
                  FISHING = new ModuleCategory(var0[20], 16);
                  FARMING = new ModuleCategory(var0[32], 17);
                  return;
               }

               var4 = var5.charAt(var3);
            }
         }

         var4 = var5.charAt(var3);
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0) {
      IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var0;
   }

   public static int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public static int IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      int var0 = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();
      return var0 == 0 ? 111 : 0;
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
