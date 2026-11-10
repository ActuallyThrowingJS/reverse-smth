package me.octo.client.modules.impl.macros;

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
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import org.jetbrains.annotations.NotNull;

public final class IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl {
   @NotNull
   public static IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static BooleanSetting IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static BooleanSetting IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;

   private IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl() {
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final BooleanSetting llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @NotNull
   public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   @NotNull
   public final BooleanSetting lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   static {
      long var9 = 116679966018105L ^ 44346648397179L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[8];
      int var6 = 0;
      String var5 = "ç\u001bdj\u008eÎÜ\u0018ú\u0007ºßþôïZF\u001b\\Ho{\u009d1\u0012V=ÌÅ\u0086Ä\u0010\nÅím=AJ$²Ñ(¸¼\bÀ\u0016H\u0014*®v\u0012÷ôÔÅÝ\u008fhÀGÖe_ÅkOÏa_=Ä^Ø\u009c0²yî5î®.\f·óDò¿J¿Å½b~¨ó\u009c\u0098ï§<\u0088\u008e\u000e\u0089Q\u008f\u001c¦ó\u008cY!Ý\u009bÞ\u0003Ô(ô¹\u009e$©¥P\u00adßæEÞ\u0004\u009b%\\±~=+[¶ûiÑd%Ã?\u0007AÈ\u0006íîÆ\u00ad§ÕÜ@\u0095c\u0011\u0086å%>\u009bæ\u009f\u0011ð\u009b»[\u0092\u0093\u0085f¿\u0093\u0086\u000fÉëKþúI\u009dý=F\n\u009b\t\u0010Ç\u0092ãóLËÙ!OmZÍ{'\u008e@£8LÝ\u0081Î«5-Ï\u008b\u0018ç\u001bdj\u008eÎÜ\u0018\n²Æ\u0093îEP\u0002ä«<8\u0013èG±\u0010\u0089,+ÎéA¦ñ4TÇÆôu´\u008c";
      int var7 = "ç\u001bdj\u008eÎÜ\u0018ú\u0007ºßþôïZF\u001b\\Ho{\u009d1\u0012V=ÌÅ\u0086Ä\u0010\nÅím=AJ$²Ñ(¸¼\bÀ\u0016H\u0014*®v\u0012÷ôÔÅÝ\u008fhÀGÖe_ÅkOÏa_=Ä^Ø\u009c0²yî5î®.\f·óDò¿J¿Å½b~¨ó\u009c\u0098ï§<\u0088\u008e\u000e\u0089Q\u008f\u001c¦ó\u008cY!Ý\u009bÞ\u0003Ô(ô¹\u009e$©¥P\u00adßæEÞ\u0004\u009b%\\±~=+[¶ûiÑd%Ã?\u0007AÈ\u0006íîÆ\u00ad§ÕÜ@\u0095c\u0011\u0086å%>\u009bæ\u009f\u0011ð\u009b»[\u0092\u0093\u0085f¿\u0093\u0086\u000fÉëKþúI\u009dý=F\n\u009b\t\u0010Ç\u0092ãóLËÙ!OmZÍ{'\u008e@£8LÝ\u0081Î«5-Ï\u008b\u0018ç\u001bdj\u008eÎÜ\u0018\n²Æ\u0093îEP\u0002ä«<8\u0013èG±\u0010\u0089,+ÎéA¦ñ4TÇÆôu´\u008c"
         .length();
      char var4 = '0';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var21;
         if ((var3 += var4) >= var7) {
            var5 = "1b¦\u009bçm\u0088ì¾¹¸\u008b/\u009aj\u000e¼¿\u001f9RQ%9\u00181b¦\u009bçm\u0088ìNc¬Ñpº9*\\Âlp\u0010p\u009aæ";
            var7 = "1b¦\u009bçm\u0088ì¾¹¸\u008b/\u009aj\u000e¼¿\u001f9RQ%9\u00181b¦\u009bçm\u0088ìNc¬Ñpº9*\\Âlp\u0010p\u009aæ".length();
            var4 = '\u0018';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var19 = false;
               var0[var6++] = var23;
               if ((var3 += var4) >= var7) {
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     var0[4], var0[0], 1, 500, 25, 1
                  );
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new BooleanSetting(var0[5], var0[1], true);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[6], var0[2], true);
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                     private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 64680902748359L;
                     private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                     {
                        long var1x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 118977061200652L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                        return IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
                           .isToggled();
                     }

                     static {
                        long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 108621008750637L;
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
                        String var6 = "\u0090\u001e_´\u0093Üvý~~ _\u008b\u0086êôT]KàEç#\u0080\u0012ÝâºÐFükq<\r÷\u0014\u0007Ðt\u0097×=DïòÖ\u009e\u0089\tû\u0012^§'\u001eHjöÀjê\nMk\u0004<\u0094í#(MFúëöð7È§ l-¬MÓ\u008f83Ïß\u0095¾ÅM¨\u0004~}DY\u0001z*Lë\f\u0085×Þ\u009f9\"";
                        int var8 = "\u0090\u001e_´\u0093Üvý~~ _\u008b\u0086êôT]KàEç#\u0080\u0012ÝâºÐFükq<\r÷\u0014\u0007Ðt\u0097×=DïòÖ\u009e\u0089\tû\u0012^§'\u001eHjöÀjê\nMk\u0004<\u0094í#(MFúëöð7È§ l-¬MÓ\u008f83Ïß\u0095¾ÅM¨\u0004~}DY\u0001z*Lë\f\u0085×Þ\u009f9\""
                           .length();
                        char var5 = 'P';
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
                        int var1x = 0;
                        int var2;
                        char[] var3x = new char[var2 = var0x.length];

                        for (int var4x = 0; var4x < var2; var4x++) {
                           int var5x;
                           if ((var5x = 255 & var0x[var4x]) < 192) {
                              var3x[var1x++] = (char)var5x;
                           } else if (var5x < 224) {
                              char var6x = (char)((char)(var5x & 31) << 6);
                              byte var8x = var0x[++var4x];
                              var6x = (char)(var6x | (char)(var8x & 63));
                              var3x[var1x++] = var6x;
                           } else if (var4x < var2 - 2) {
                              char var12 = (char)((char)(var5x & 15) << '\f');
                              byte var9x = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9x & 63) << 6);
                              var9x = var0x[++var4x];
                              var12 = (char)(var12 | (char)(var9x & 63));
                              var3x[var1x++] = var12;
                           }
                        }

                        return new String(var3x, 0, var1x);
                     }

                     private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                        int var5x = var0x ^ (int)(var1x & 32767L) ^ 15477;
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
                                 "me/octo/client/modules/impl/macros/IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
                                 var10
                              );
                           }

                           byte[] var6x = new byte[8];
                           var6x[0] = (byte)(var1x >>> 56);

                           for (int var7x = 1; var7x < 8; var7x++) {
                              var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                           }

                           DESKeySpec var11 = new DESKeySpec(var6x);
                           SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                           ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                           byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9x)
                           );
                        }

                        return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                     }

                     private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                     ) {
                        int var4x = (Integer)var3x[0];
                        long var5x = (Long)var3x[1];
                        String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                        MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                        var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                        return var7x;
                     }

                     private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                        Lookup var0x, String var1x, MethodType var2
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
                                    var1x
                                 ),
                                 var2
                              )
                           );
                           return var3x;
                        } catch (Exception var5x) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/macros/IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                                 + " : "
                                 + var1x
                                 + " : "
                                 + var2.toString(),
                              var5x
                           );
                        }
                     }
                  };
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new BooleanSetting(var0[7], var0[3], false);
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                     private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 90960146912775L;
                     private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                     private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                     private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                     {
                        long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 44948488572206L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                        return IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
                           .isToggled();
                     }

                     static {
                        long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 123308070319526L;
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
                        String var6 = "@\u001c3½Ñ\u0083\u008e\u001eñAÏ×\u0003Ö\"h\u001e\u0091\u0003\u009eèæA\u0084dÏ\u009b¸]O~h@K\u0088ñÂH:\u001bP\u000eYG+\u008f\u0089´ÝÝ\u0002\u0088qì\u009a¯LøºH\u008f¬Qt2©\u0015Ã'/J\u0096\u0017\u000e\u0014ÿ\u001d#ìäé¼\u009c\u0092\u0089\u0091\u0095\t´Cò\"÷l\u0018 ©";
                        int var8 = "@\u001c3½Ñ\u0083\u008e\u001eñAÏ×\u0003Ö\"h\u001e\u0091\u0003\u009eèæA\u0084dÏ\u009b¸]O~h@K\u0088ñÂH:\u001bP\u000eYG+\u008f\u0089´ÝÝ\u0002\u0088qì\u009a¯LøºH\u008f¬Qt2©\u0015Ã'/J\u0096\u0017\u000e\u0014ÿ\u001d#ìäé¼\u009c\u0092\u0089\u0091\u0095\t´Cò\"÷l\u0018 ©"
                           .length();
                        char var5 = ' ';
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
                        int var5 = var0 ^ (int)(var1 & 32767L) ^ 4015;
                        if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                           Object[] var4;
                           try {
                              Long var3 = Thread.currentThread().threadId();
                              var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                              if (var4 == null) {
                                 var4 = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/macros/IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                           byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4[0]).doFinal(var9)
                           );
                        }

                        return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
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
                              "me/octo/client/modules/impl/macros/IIlIIlIlllIIllIIIllIIIIIIIIllIIllllIlIlllIIlIlIllIIIIIIIlIlIIIIIlIIIIllIlIIlIIllllIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
