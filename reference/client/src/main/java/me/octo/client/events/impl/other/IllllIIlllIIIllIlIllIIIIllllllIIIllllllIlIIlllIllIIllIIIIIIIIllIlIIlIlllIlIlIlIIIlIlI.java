package me.octo.client.events.impl.other;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   GAIN_MOB_KILL,
   GAIN_TALISMAN_OF_COINS,
   GAIN_DICE_ROLL,
   GAIN_UNKNOWN,
   LOSE_DICE_ROLL_COST,
   LOSE_UNKNOWN;
   @JvmField
   @NotNull
   public final String id;

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(String var3) {
      this.id = var3;
   }

   @NotNull
   public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = 78796421200817L ^ 85356437716637L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[12];
      int var6 = 0;
      String var5 = "ä\u0010ÝC¸T±íZ\u0011ä\u000bï\u000fûÂ¨\u0099ñ[]\u009bÏv\u0010*?ÈpÒ\u009a\u001f-\u008eî-8^£å\u001e\u0018ä\u0010ÝC¸T±íZ\u0011ä\u000bï\u000fûÂ¨\u0099ñ[]\u009bÏv\u0018;æoÀ\u0097«ú\u008b\u0011\u0091h\u008c\u0007ðÓç\u0082·+[\u0006Sã²\u0010*?ÈpÒ\u009a\u001f-\u008eî-8^£å\u001e\u0018;æoÀ\u0097«ú\u008b\u0011\u0091h\u008c\u0007ðÓç\u0082·+[\u0006Sã²\u0010ùñ\u001a-P\u000f{\u00ad\u008c~y\u0084|ýwÿ\u0010ùñ\u001a-P\u000f{\u00ad\u008c~y\u0084|ýwÿ\u0010Ã5b\u0087|þ\u009e\fdVötÄ_Lü\u0010Ã5b\u0087|þ\u009e\fdVötÄ_Lü";
      int var7 = "ä\u0010ÝC¸T±íZ\u0011ä\u000bï\u000fûÂ¨\u0099ñ[]\u009bÏv\u0010*?ÈpÒ\u009a\u001f-\u008eî-8^£å\u001e\u0018ä\u0010ÝC¸T±íZ\u0011ä\u000bï\u000fûÂ¨\u0099ñ[]\u009bÏv\u0018;æoÀ\u0097«ú\u008b\u0011\u0091h\u008c\u0007ðÓç\u0082·+[\u0006Sã²\u0010*?ÈpÒ\u009a\u001f-\u008eî-8^£å\u001e\u0018;æoÀ\u0097«ú\u008b\u0011\u0091h\u008c\u0007ðÓç\u0082·+[\u0006Sã²\u0010ùñ\u001a-P\u000f{\u00ad\u008c~y\u0084|ýwÿ\u0010ùñ\u001a-P\u000f{\u00ad\u008c~y\u0084|ýwÿ\u0010Ã5b\u0087|þ\u009e\fdVötÄ_Lü\u0010Ã5b\u0087|þ\u009e\fdVötÄ_Lü"
         .length();
      char var4 = 24;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var19;
                  if ((var12 += var4) >= var7) {
                     GAIN_MOB_KILL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[4]);
                     GAIN_TALISMAN_OF_COINS = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[5]);
                     GAIN_DICE_ROLL = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[7]);
                     GAIN_UNKNOWN = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[8]);
                     LOSE_DICE_ROLL_COST = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[2]);
                     LOSE_UNKNOWN = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var0[10]);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                        IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     );
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var19;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "8Óâý\u0085ú´\u0015\u008c¥7\u0005Õf1«\u00108Óâý\u0085ú´\u0015\u008c¥7\u0005Õf1«";
                  var7 = "8Óâý\u0085ú´\u0015\u008c¥7\u0005Õf1«\u00108Óâý\u0085ú´\u0015\u008c¥7\u0005Õf1«".length();
                  var4 = 16;
                  var12 = -1;
            }

            var13 = var5.substring(++var12, var12 + var4);
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
