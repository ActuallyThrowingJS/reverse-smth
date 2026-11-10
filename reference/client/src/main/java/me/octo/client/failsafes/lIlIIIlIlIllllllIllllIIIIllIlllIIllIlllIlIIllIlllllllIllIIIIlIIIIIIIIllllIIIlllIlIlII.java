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
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;

public class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII
   extends IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 120257968115172L;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

   public lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII(String var1) {
      super(var1);
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(PacketReceivedEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 7675751944935L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "§Î\u0080a\u009d\u0017¦úúx\u0081-\u001b´:ê°§3\u001eq\u0086î\u0003âáºI!´Ùâé£_ªïX}d\u000eUê38\u0097Ð=Ï®É>e\u0010¦\u0013ð\u001b\tzÖÃbÍITÍ_¬B\u0096\u009d_A\u0095\u008d\tñ¯¶eD;jxì/´3ßîêRT\rÐù\u0083Ô\u001fàð6åÕ\u008f÷å\u0093\u0016|\u0092 *c\\\u0006\u0017\u0092Ãr¾\u0006\u0004lÀ\u0098\u00950Ð\u0099-<Ô\u0014½èª*'\u0096\u0018ÔÓ7I\u0013°\u0096®ó3Ù\u0080\u0085Jép\u008d\u0017\u0018\u0084ªà_Q¨&½1\u0081ÔáÍW\u0002\u001eRýÌÃ=ÍqYe£\nËÚ\u009dö\u0090 \u0015\u0003×\u000b\u0094\u0087ÖQBé\u0089Ì}<÷\u0084b\u008eÀ\u008fH\u008eÍè©HK\u0018ë\u0010Ò\u008b\u0018\u009a®gÒÊÚ\u0087g¼n{!§t#Ë ¤¬ÄñÑ<N(\u0080~j\u001b\u0099,\u007fmÝ\"ãÁK\u001fÀ©þ\u0007QV\u007fDu\u00039\u0097\u0082®v<fo¨Ó \b+0í\u009d\u0010B«\u0010\u0093\u0012Ìýû:G²t\u0019ÑÈü \u001f6FÇÿ5\u0014Y\u0013ë^\\W}ºÌ¦3\u0018áQ\u009dC\u0010)ÅÝ£@lPÄ";
      int var8 = "§Î\u0080a\u009d\u0017¦úúx\u0081-\u001b´:ê°§3\u001eq\u0086î\u0003âáºI!´Ùâé£_ªïX}d\u000eUê38\u0097Ð=Ï®É>e\u0010¦\u0013ð\u001b\tzÖÃbÍITÍ_¬B\u0096\u009d_A\u0095\u008d\tñ¯¶eD;jxì/´3ßîêRT\rÐù\u0083Ô\u001fàð6åÕ\u008f÷å\u0093\u0016|\u0092 *c\\\u0006\u0017\u0092Ãr¾\u0006\u0004lÀ\u0098\u00950Ð\u0099-<Ô\u0014½èª*'\u0096\u0018ÔÓ7I\u0013°\u0096®ó3Ù\u0080\u0085Jép\u008d\u0017\u0018\u0084ªà_Q¨&½1\u0081ÔáÍW\u0002\u001eRýÌÃ=ÍqYe£\nËÚ\u009dö\u0090 \u0015\u0003×\u000b\u0094\u0087ÖQBé\u0089Ì}<÷\u0084b\u008eÀ\u008fH\u008eÍè©HK\u0018ë\u0010Ò\u008b\u0018\u009a®gÒÊÚ\u0087g¼n{!§t#Ë ¤¬ÄñÑ<N(\u0080~j\u001b\u0099,\u007fmÝ\"ãÁK\u001fÀ©þ\u0007QV\u007fDu\u00039\u0097\u0082®v<fo¨Ó \b+0í\u009d\u0010B«\u0010\u0093\u0012Ìýû:G²t\u0019ÑÈü \u001f6FÇÿ5\u0014Y\u0013ë^\\W}ºÌ¦3\u0018áQ\u009dC\u0010)ÅÝ£@lPÄ"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var19;
                  if ((var12 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[9];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var19;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "Ä\u008d÷¼ÍiX¬äÖ0\u001a'\u0088J\u009cá\u0012\u001a;ïØþµ¹I´5ç\u000fÊHxÇ\u0001zÜ\u0080\u0014fGhö\u0096aû\u008fü\"Dp\u008e³ Ü\u009c\u008aiæb½!9\u0002)ê\u009fO\u0092\f\u0013gÎ\tÒ\u0016B\u00ad¦Sl:c·\u009a¤°!¶m\u0018I_\u000eöCôW2£ð\u001fvV\u0084ÉkvÅé»~È16±C¨]Úm [R£Ì×ä¦q6¢Ð×sð\u0000¯ùºK\u000fQ\u000b\b²\u0084ôDZy\u0000%";
                  var8 = "Ä\u008d÷¼ÍiX¬äÖ0\u001a'\u0088J\u009cá\u0012\u001a;ïØþµ¹I´5ç\u000fÊHxÇ\u0001zÜ\u0080\u0014fGhö\u0096aû\u008fü\"Dp\u008e³ Ü\u009c\u008aiæb½!9\u0002)ê\u009fO\u0092\f\u0013gÎ\tÒ\u0016B\u00ad¦Sl:c·\u009a¤°!¶m\u0018I_\u000eöCôW2£ð\u001fvV\u0084ÉkvÅé»~È16±C¨]Úm [R£Ì×ä¦q6¢Ð×sð\u0000¯ùºK\u000fQ\u000b\b²\u0084ôDZy\u0000%"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var13 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16337;
      if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/failsafes/lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
