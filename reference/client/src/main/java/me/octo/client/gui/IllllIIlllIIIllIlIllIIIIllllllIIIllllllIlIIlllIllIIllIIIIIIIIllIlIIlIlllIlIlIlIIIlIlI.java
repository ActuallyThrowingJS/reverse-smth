package me.octo.client.gui;

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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   ORE,
   MITHRIL,
   GEMSTONE,
   TUNNEL,
   CRIMSON,
   SAND,
   ENDSTONE,
   COBBLESTONE,
   TREE,
   DWARVEN_COMMISSION,
   OBSIDIAN,
   FISHING_ROUTE,
   BEACH_BALL;
   @NotNull
   public static IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll Companion;
   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(String var3, String var4) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
   }

   @NotNull
   public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   public final String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = 55331879657379L ^ 140626485313143L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[39];
      int var6 = 0;
      String var5 = "\f?mÊ3dL§\u0010\u0013Õ#5\u008dbdù\u001bk±Û$â3À\u0010\u0083\u0014\\\u0082Õ\u0019ÆBmÑ[\u001c\u001b1\u0090Á\b¿eê XË\u001aK\u0010RÀ\u0086Iø\u007f¦:â×2eJ3\u0084n\b\u0005[Ó´É$\u001a2\b²ôz¾\r\u001ch2\bÖMÜnÂ·ùT\u0010\u008dn¥éþÌBC®\u001aÙ$ÌgÖV\u0010[Ò\fÓ\u0010ãù\u008f;iËf\u0010\u0091ªj\bHÉI¶åø\u0016\u001f\bØæ\u0089B\u0094õüX\bÇ}½ê.Í_É\u0010;\u001a-\u0012l\u0019=\u0085\u0088\u0001Dâ<om%\u0010¦jÎÀ\u0015F\u0095/ú\u0000Æg¹0°'\bEÝ\t}ó\u0098M[\u0010\u0095\u0097\u008d\u0092Û¥¦î±ý\u0006\u008f0\u0088û±\u0010e\u0018!/3!øAæú\u009fP+ú¬=\u0010¶É|×äNæf×m´ÔÙÛ<D\b §\rë\u0005\u0099ã\t\u0010\u008dú\u000eü\u0096~q\u000bQL\u0017\u008d2´:\b\b©è\f\f\u009eJÂ¢\u0010äá\u0018ÍnëLX\u0099ÊU\u008e\u0086HÎ@\b1è\u008bË\u0088-\u0095o\u0010\u00adRG Ü'Rí\u009dr`»\u000b\u008e ò\u0018\u001b\u0003Ûd*4©y\u0098\u009fëIy¸.Ã\u0088\u0007J'@y\rÅ\u0010FU\\d\u0092\u0001hÓ\u000f×Ú\f6ñKÄ\u0018Õ\u0086ä\u001e\r\u0010½\u0016=X]s\u008fP\u009fìÿÄ\u0001\r\u0085\u001e\u0002|\bb\u0084at\u0085Îñ±\u00105¿\u001fË¹\bèD\u0007{º3XË.»\b¸÷ßZDø\u001b\u0097\u0010\u0091â«~\u009aÏÝ> ¬,\u009fvÑÅÌ\u0010É\u009eå\u0091q×l9&|)¸\r½Ä\u000b\u0010 ò¬\u0004\u0010\u0017b\u0005õÈ(;Ày\\W\b°/²¿WôàÕ\u0010\u0097\r!$í\u0085Z\u0082wjxà\u0097$<!\buºÆ¹8_Ñý";
      int var7 = "\f?mÊ3dL§\u0010\u0013Õ#5\u008dbdù\u001bk±Û$â3À\u0010\u0083\u0014\\\u0082Õ\u0019ÆBmÑ[\u001c\u001b1\u0090Á\b¿eê XË\u001aK\u0010RÀ\u0086Iø\u007f¦:â×2eJ3\u0084n\b\u0005[Ó´É$\u001a2\b²ôz¾\r\u001ch2\bÖMÜnÂ·ùT\u0010\u008dn¥éþÌBC®\u001aÙ$ÌgÖV\u0010[Ò\fÓ\u0010ãù\u008f;iËf\u0010\u0091ªj\bHÉI¶åø\u0016\u001f\bØæ\u0089B\u0094õüX\bÇ}½ê.Í_É\u0010;\u001a-\u0012l\u0019=\u0085\u0088\u0001Dâ<om%\u0010¦jÎÀ\u0015F\u0095/ú\u0000Æg¹0°'\bEÝ\t}ó\u0098M[\u0010\u0095\u0097\u008d\u0092Û¥¦î±ý\u0006\u008f0\u0088û±\u0010e\u0018!/3!øAæú\u009fP+ú¬=\u0010¶É|×äNæf×m´ÔÙÛ<D\b §\rë\u0005\u0099ã\t\u0010\u008dú\u000eü\u0096~q\u000bQL\u0017\u008d2´:\b\b©è\f\f\u009eJÂ¢\u0010äá\u0018ÍnëLX\u0099ÊU\u008e\u0086HÎ@\b1è\u008bË\u0088-\u0095o\u0010\u00adRG Ü'Rí\u009dr`»\u000b\u008e ò\u0018\u001b\u0003Ûd*4©y\u0098\u009fëIy¸.Ã\u0088\u0007J'@y\rÅ\u0010FU\\d\u0092\u0001hÓ\u000f×Ú\f6ñKÄ\u0018Õ\u0086ä\u001e\r\u0010½\u0016=X]s\u008fP\u009fìÿÄ\u0001\r\u0085\u001e\u0002|\bb\u0084at\u0085Îñ±\u00105¿\u001fË¹\bèD\u0007{º3XË.»\b¸÷ßZDø\u001b\u0097\u0010\u0091â«~\u009aÏÝ> ¬,\u009fvÑÅÌ\u0010É\u009eå\u0091q×l9&|)¸\r½Ä\u000b\u0010 ò¬\u0004\u0010\u0017b\u0005õÈ(;Ày\\W\b°/²¿WôàÕ\u0010\u0097\r!$í\u0085Z\u0082wjxà\u0097$<!\buºÆ¹8_Ñý"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var21;
         if ((var3 += var4) >= var7) {
            var5 = "\u0082õ©\u000bL0ôK¼üp'¾¯¦&\bgÜÌ;ôÝÜÌ";
            var7 = "\u0082õ©\u000bL0ôK¼üp'¾¯¦&\bgÜÌ;ôÝÜÌ".length();
            var4 = '\u0010';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var0[var6++] = var23;
               if ((var3 += var4) >= var7) {
                  ORE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[15], var0[34]);
                  MITHRIL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[12], var0[10]);
                  GEMSTONE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[14], var0[26]);
                  TUNNEL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[0], var0[5]);
                  CRIMSON = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[31], var0[36]);
                  SAND = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[3], var0[11]);
                  ENDSTONE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[8], var0[9]);
                  COBBLESTONE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[29], var0[35]);
                  TREE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[17], var0[28]);
                  DWARVEN_COMMISSION = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[13], var0[25]);
                  OBSIDIAN = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[1], var0[16]);
                  FISHING_ROUTE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[30], var0[2]);
                  BEACH_BALL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[18], var0[37]);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = EnumEntriesKt.enumEntries(
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  );
                  Companion = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 80535796903536L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      }

      @NotNull
      public final IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String param1, int param2, int param3, byte param4
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 3307854476183L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[16];
         int var7 = 0;
         String var6 = "@Hì9Æ\u009bÊkÜ±î\u0086Ä\u0003'¸\u008cò§Ï}1¿e\u0092®üFLV«- 5Û\u0015.Yz©UÑÁ\u0082é\u0095Ô\u008d\u0097Çó\u0002\u000f\u0087hÔ±\u0099æNN¨\u0085¡\u009b \u001fr1åÊ2\\=ó\fÉ*\t{\u0081\u000f\u001a¬¸¦è\f¹ëi·GÍßv\u0004#\u0010¤ª\u000b\u001b=IG\u0086P]a×_Å³c\u0018Slño°\nj\u0093ò\u0012\u0084/mY\u0097Qxx:°3$\u0099\u0094 s!U2!~dpB*\u000b^+\u000e\fÓ7.Àî·\u0014é\u008f\u0005¤\u0015\u009ciâÄn(\u001cÂ{ÆÈ#0ï6\u0095µ\f\u0002\u0094Ë\u009d(t;8\tUÙ4å\u001eÝ\u0086\u0085\u008aÿl#¦cÝÞF\u008f£\u0010\u001b¦\u0098AoÎ\u0003CÈ8¤g?0\u001e| \u0010Ì;~¸\u0003AwÑ·A¤ü,8óµ~SOr\u008a\u0013v\u0015ÓB¥\bº=M \u0098·\u00895}y\b\u0092\u001f^d9@¶æ\r£\u008dÒ\u0004\u0096\u0099ãgaà¶\u000e´\u009eBZ\u0010c»Ùµ£§´¶Àë\u0098^5D¤\"\u0018ýº)¹\u0088\u00ad#SÅ\u0093qyzI 1\u001f×\u000b!E\u0000MÙ($$\u000e5\u0007)\u00002¤'\u0083úµâ\u001d\u0093bÑ\u001ay\u0098\u0004A$P\u009dkÔnüÌáÖQ\u0013¸EH¤\u001d\u0010~dÿQP\u0091Pq¯\b\u0095¶~×é\u0006";
         int var8 = "@Hì9Æ\u009bÊkÜ±î\u0086Ä\u0003'¸\u008cò§Ï}1¿e\u0092®üFLV«- 5Û\u0015.Yz©UÑÁ\u0082é\u0095Ô\u008d\u0097Çó\u0002\u000f\u0087hÔ±\u0099æNN¨\u0085¡\u009b \u001fr1åÊ2\\=ó\fÉ*\t{\u0081\u000f\u001a¬¸¦è\f¹ëi·GÍßv\u0004#\u0010¤ª\u000b\u001b=IG\u0086P]a×_Å³c\u0018Slño°\nj\u0093ò\u0012\u0084/mY\u0097Qxx:°3$\u0099\u0094 s!U2!~dpB*\u000b^+\u000e\fÓ7.Àî·\u0014é\u008f\u0005¤\u0015\u009ciâÄn(\u001cÂ{ÆÈ#0ï6\u0095µ\f\u0002\u0094Ë\u009d(t;8\tUÙ4å\u001eÝ\u0086\u0085\u008aÿl#¦cÝÞF\u008f£\u0010\u001b¦\u0098AoÎ\u0003CÈ8¤g?0\u001e| \u0010Ì;~¸\u0003AwÑ·A¤ü,8óµ~SOr\u008a\u0013v\u0015ÓB¥\bº=M \u0098·\u00895}y\b\u0092\u001f^d9@¶æ\r£\u008dÒ\u0004\u0096\u0099ãgaà¶\u000e´\u009eBZ\u0010c»Ùµ£§´¶Àë\u0098^5D¤\"\u0018ýº)¹\u0088\u00ad#SÅ\u0093qyzI 1\u001f×\u000b!E\u0000MÙ($$\u000e5\u0007)\u00002¤'\u0083úµâ\u001d\u0093bÑ\u001ay\u0098\u0004A$P\u009dkÔnüÌáÖQ\u0013¸EH¤\u001d\u0010~dÿQP\u0091Pq¯\b\u0095¶~×é\u0006"
            .length();
         char var5 = ' ';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "]*\u00adrÅ!BkÌµÉ\u009c/^\u0091Ü¡\r\u0094Í:\u000eoNûe§!í©'\u0099=µ2^:\u0014l,cÃ,Ô\u009fîhT x&ªÛ}Yé¾º®\u0091\u0085.Ï[¼\u001b\u0093C5r\u0081Ó\u0010\u001a~Ø;º\ræÍ";
               var8 = "]*\u00adrÅ!BkÌµÉ\u009c/^\u0091Ü¡\r\u0094Í:\u000eoNûe§!í©'\u0099=µ2^:\u0014l,cÃ,Ô\u009fîhT x&ªÛ}Yé¾º®\u0091\u0085.Ï[¼\u001b\u0093C5r\u0081Ó\u0010\u001a~Ø;º\ræÍ"
                  .length();
               var5 = '0';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[16];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 16503;
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/gui/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
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
               "me/octo/client/gui/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
