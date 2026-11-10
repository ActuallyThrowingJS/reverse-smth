package me.octo.client.modules.impl.features.qol;

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
import me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll;
import me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl {
   @NotNull
   private static llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static <unrepresentable> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;

   static {
      long var9 = 16570562382005L ^ 19954125570056L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var6 = 0;
      String var5 = "è\u0090<\u0083\u0091IBú\u0010\u0080·Æ\nÐ\u009e\\\u001f\u0005\u0000\u009e\u0002aøn\u008c\bv x-õp\u00adÙ\bOøk\u001eYw\bµ\bf,^\u0017\u008bg:ì(\u00176:\u0001\u0084ÔÛU({Msôt®\u008c\f\u0093\u009fîÂ¿*¶S0µ -T_X¯ëEÐqK»$`\u0087\u009fÒñ`B?6gÖ\u009a×\u0082¡º!`KZaÜG\t\"\u0011e¡\u001co\u0087\u0099wãñ\u001b\u0085j|NA-\u008cÂFFU\u0086Ð\u001aùwÅ>AÉOÆé\u0016\u001b\u001fÊ½[\raó\u000b\u0082\u0090\u0082\u001e Ï\u0085ÈÛÝ\u0086\u0011Àé\u0095b\u0000°\u009eKô!L1\u0089ôº·\u0010Àhð¦¤¯\u000fÝ#òàü¼\u009bæÔ\b5oü`^Û}s";
      int var7 = "è\u0090<\u0083\u0091IBú\u0010\u0080·Æ\nÐ\u009e\\\u001f\u0005\u0000\u009e\u0002aøn\u008c\bv x-õp\u00adÙ\bOøk\u001eYw\bµ\bf,^\u0017\u008bg:ì(\u00176:\u0001\u0084ÔÛU({Msôt®\u008c\f\u0093\u009fîÂ¿*¶S0µ -T_X¯ëEÐqK»$`\u0087\u009fÒñ`B?6gÖ\u009a×\u0082¡º!`KZaÜG\t\"\u0011e¡\u001co\u0087\u0099wãñ\u001b\u0085j|NA-\u008cÂFFU\u0086Ð\u001aùwÅ>AÉOÆé\u0016\u001b\u001fÊ½[\raó\u000b\u0082\u0090\u0082\u001e Ï\u0085ÈÛÝ\u0086\u0011Àé\u0095b\u0000°\u009eKô!L1\u0089ôº·\u0010Àhð¦¤¯\u000fÝ#òàü¼\u009bæÔ\b5oü`^Û}s"
         .length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var0[var6++] = var22;
         if ((var3 += var4) >= var7) {
            var5 = "ÍC¨;\u008a4¨$@\u0095\u0017\u007f5@tC«\u0080r\u0096\u0089\u001d,w\u0084³$3ïõùû\b\u0088ÜrñfêF£";
            var7 = "ÍC¨;\u008a4¨$@\u0095\u0017\u007f5@tC«\u0080r\u0096\u0089\u001d,w\u0084³$3ïõùû\b\u0088ÜrñfêF£".length();
            var4 = ' ';
            var3 = -1;

            while (true) {
               var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var0[var6++] = var24;
               if ((var3 += var4) >= var7) {
                  String var26 = var0[7];
                  String var27 = var0[9];
                  String[] var11 = new String[]{var0[0], var0[3], var0[8], var0[2], var0[4]};
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                     var26, var27, var11
                  );
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI() {
                     private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 49777200007457L;
                     private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
                     private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
                     private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);

                     {
                        long var1x = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 26486430548082L;
                     }

                     @Override
                     public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                        long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                        long var5x = var3x ^ 10302949456856L;
                        return IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                              IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"e">(2601, 1038145782871088974L ^ var3x),
                              var5x
                           );
                     }

                     static {
                        long var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 134736735908224L;
                        Cipher var2;
                        Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                        byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                        for (int var3 = 1; var3 < 8; var3++) {
                           var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                        }

                        var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                        String[] var9 = new String[3];
                        int var7 = 0;
                        String var6 = "b\nç¡¶HÑ0\u001b´µ\u0097N\"MM\u000eÆC9D\u0000.\u0000_gÎû\u0082\r\u0007\u001aIo:\u001aX%vÎa\u0093ù\\Ñx&;\u0016\u0092ß\u0016¿.z³e\r¬\rÓ\nC\u008dïÝ ¹+½\u0015\u0014\u0086\u0081²`ñù\b\u0018\u0093Ä!,/>^~yU+\u009aW\u0092©Nf\u0093i»ú\u0004ºY¨3|øè\u001e\u0091Ô°,s}è\u0087|&(T@|\u00128\u00ad\u0017l\u0004êé¹\u0010Åäßó»çpw\u0000qi´òyÿ\u001bó-H{Ã\u009c4\u001b\u0000\u0088\u001e\u0010ìP±Æ\u009cb\u000bõIL\u007f\u0087dü\u001a\u001c";
                        int var8 = "b\nç¡¶HÑ0\u001b´µ\u0097N\"MM\u000eÆC9D\u0000.\u0000_gÎû\u0082\r\u0007\u001aIo:\u001aX%vÎa\u0093ù\\Ñx&;\u0016\u0092ß\u0016¿.z³e\r¬\rÓ\nC\u008dïÝ ¹+½\u0015\u0014\u0086\u0081²`ñù\b\u0018\u0093Ä!,/>^~yU+\u009aW\u0092©Nf\u0093i»ú\u0004ºY¨3|øè\u001e\u0091Ô°,s}è\u0087|&(T@|\u00128\u00ad\u0017l\u0004êé¹\u0010Åäßó»çpw\u0000qi´òyÿ\u001bó-H{Ã\u009c4\u001b\u0000\u0088\u001e\u0010ìP±Æ\u009cb\u000bõIL\u007f\u0087dü\u001a\u001c"
                           .length();
                        char var5 = 'x';
                        int var4 = -1;

                        while (true) {
                           byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                           String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                           byte var10001 = -1;
                           var9[var7++] = var13;
                           if ((var4 += var5) >= var8) {
                              IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var9;
                              lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[3];
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
                        int var5x = var0x ^ (int)(var1x & 32767L) ^ 16148;
                        if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5x] == null) {
                           Object[] var4x;
                           try {
                              Long var3x = Thread.currentThread().threadId();
                              var4x = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3x);
                              if (var4x == null) {
                                 var4x = new Object[]{
                                    Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                                 };
                                 IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3x, var4x);
                              }
                           } catch (Exception var10) {
                              throw new RuntimeException(
                                 "me/octo/client/modules/impl/features/qol/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                                 var10
                              );
                           }

                           byte[] var6x = new byte[8];
                           var6x[0] = (byte)(var1x >>> 56);

                           for (int var7x = 1; var7x < 8; var7x++) {
                              var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                           }

                           DESKeySpec var11x = new DESKeySpec(var6x);
                           SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11x);
                           ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                           byte[] var9x = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5x].getBytes("ISO-8859-1");
                           lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                              ((Cipher)var4x[0]).doFinal(var9x)
                           );
                        }

                        return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5x];
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
                              "me/octo/client/modules/impl/features/qol/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                                 + " : "
                                 + var1x
                                 + " : "
                                 + var2.toString(),
                              var5x
                           );
                        }
                     }
                  };
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                     var0[10], var0[5], 4.5F, 6.0F, 5.2F, 0.1F, 2
                  );
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[1], var0[6], false);
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
