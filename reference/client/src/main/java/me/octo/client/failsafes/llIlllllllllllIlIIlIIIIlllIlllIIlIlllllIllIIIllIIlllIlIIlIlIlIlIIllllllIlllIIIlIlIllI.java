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
import kotlin.jvm.JvmField;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.modules.impl.BooleanModule;
import me.octo.client.gui.clickgui.settings.Setting;
import org.jetbrains.annotations.NotNull;

public final class llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI extends BooleanModule {
   @NotNull
   public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @JvmField
   @NotNull
   public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static long lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = 106577961067260L;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static String[] llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static Map IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new HashMap(13);

   private llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI() {
      long var1 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 116586991981687L;
      ModuleCategory var10003 = ModuleCategory.FAILSAFES;
      Setting[] var3 = new Setting[]{
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
      };
      super(
         "Failsafe Sound",
         "Plays an alert sound when a failsafe triggers. We highly recommend keeping this on. With it off, you won't hear staff checks!",
         var10003,
         "Failsafes",
         true,
         var3
      );
   }

   @Override
   public void lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII(long param1, byte param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll ^ 1924786537219L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "ø\u0005\u0090\u008e+8ò\n¨¢\u008f\u009b\u0084ÝÀ\u0099[ÙÑ®8\u008bü\u001aó/;e\u0015\u0084\u007fh°¶á\u0087\u000f&ÚÃ¹P\u001c\u0094Ê\u0012Û\u00adÝ·\u0080\u0003à\u000fÀaç:ªÇB(\u0090ã\u008b\u001foàÁßâø\u0001¯²ü \u0083 ¨Ú\u0006\u0000w\u0011\u0082\u0003U\u0001=\u0013ÄvZ\u008aN|_\"\u0016\ré¯\u0096äÉ¿Ðÿpv\u0007ßò±KX\u0084¥V\u008d\"½l-xRYî\u0086\u0014HgøÒb\u009dWR&W1\u0018\u008cõ\u0082¢*6\u0092\f¾ÔÔ\u0004Áj\u001fJ\u0099¥G\u009bÒ²5\u0092\u0002ÿ¼\n-\u008f\bXc\u008f!\u0004·p·#Ñ·ð·7pQ¿\u008fX\u0088ÀtA\u0093¯\u008c\u0016}TSØq§\b5¨´¦gÉI\u0088\u001dË\u008c\u0088- 0\u000f®g\u008b\u0007V®\u0002\u0096¤\\4¬V\râî5ây¡£½;õ\n\u008d½0{\u0006ª48¯²0õ\u0001âÇç×Z\u0010c$eÊÚÙ·±wA{\u0087Ç\u0093\u0001k\u001dÜä¼\u007fý\u009d\u0098\u0012\u00199óÊ\u0001J\u0001öFÕKÂ%a)ÒwÂ`4ðïÖÉ\u008d³\u001aûf-\u0092\u0006\u0016`N\u007fý#³\u009d(\u000eßþÉ\u0090§ç6Å{\u0002\u0004ÐÒ`£¿'=uÑâ\u008a\u0085û d\u0099QÐìN³\"\u008d|=µÞÁ å\u0081\u001e";
      int var8 = "ø\u0005\u0090\u008e+8ò\n¨¢\u008f\u009b\u0084ÝÀ\u0099[ÙÑ®8\u008bü\u001aó/;e\u0015\u0084\u007fh°¶á\u0087\u000f&ÚÃ¹P\u001c\u0094Ê\u0012Û\u00adÝ·\u0080\u0003à\u000fÀaç:ªÇB(\u0090ã\u008b\u001foàÁßâø\u0001¯²ü \u0083 ¨Ú\u0006\u0000w\u0011\u0082\u0003U\u0001=\u0013ÄvZ\u008aN|_\"\u0016\ré¯\u0096äÉ¿Ðÿpv\u0007ßò±KX\u0084¥V\u008d\"½l-xRYî\u0086\u0014HgøÒb\u009dWR&W1\u0018\u008cõ\u0082¢*6\u0092\f¾ÔÔ\u0004Áj\u001fJ\u0099¥G\u009bÒ²5\u0092\u0002ÿ¼\n-\u008f\bXc\u008f!\u0004·p·#Ñ·ð·7pQ¿\u008fX\u0088ÀtA\u0093¯\u008c\u0016}TSØq§\b5¨´¦gÉI\u0088\u001dË\u008c\u0088- 0\u000f®g\u008b\u0007V®\u0002\u0096¤\\4¬V\râî5ây¡£½;õ\n\u008d½0{\u0006ª48¯²0õ\u0001âÇç×Z\u0010c$eÊÚÙ·±wA{\u0087Ç\u0093\u0001k\u001dÜä¼\u007fý\u009d\u0098\u0012\u00199óÊ\u0001J\u0001öFÕKÂ%a)ÒwÂ`4ðïÖÉ\u008d³\u001aûf-\u0092\u0006\u0016`N\u007fý#³\u009d(\u000eßþÉ\u0090§ç6Å{\u0002\u0004ÐÒ`£¿'=uÑâ\u008a\u0085û d\u0099QÐìN³\"\u008d|=µÞÁ å\u0081\u001e"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "^X\u009dªÓA\u000b r\u0084\b\u009f¦\u0001O \u001d\u0016ÿRà\u0097\u0085ÊÐ\u007f\")Lû\u009c\u0096ÕÝ\u0004ü©Sô\u008c^\tÜ¸\u0007B\b\\¼ê_1½¢c\u001fk²,yè\tG\rÖ:¨*w§>¾óé®\u0081©c\u0082k=\u009e[&Ì«dJá×÷\u000e\u0010\u0083;)^wzõ\u001b\fE-ë\u0000|pI\u0002¯\u008düa6¯ÉÓÒ\u0001È»\u008eÙèSì+¾\u000fïjª\u0080.AÔz·´À1opOá4§ß\u009d\u009dÈ7×\u008fØ\u0090\nå'\u0080\u0002dÏË\u0016Ok[{\u000b\u0083_\u0082ee\u0014\u0012Jü6\u0097\u0099í°õM\u0089$á¼;\u0097\u0014×\u0088l\u0003(3k\u0007\u009d/Û\u001dIuvYM=\u001ay\u0089ò\u009b>dotõ¤Ý\fiBfV!\u000f¯n";
            var8 = "^X\u009dªÓA\u000b r\u0084\b\u009f¦\u0001O \u001d\u0016ÿRà\u0097\u0085ÊÐ\u007f\")Lû\u009c\u0096ÕÝ\u0004ü©Sô\u008c^\tÜ¸\u0007B\b\\¼ê_1½¢c\u001fk²,yè\tG\rÖ:¨*w§>¾óé®\u0081©c\u0082k=\u009e[&Ì«dJá×÷\u000e\u0010\u0083;)^wzõ\u001b\fE-ë\u0000|pI\u0002¯\u008düa6¯ÉÓÒ\u0001È»\u008eÙèSì+¾\u000fïjª\u0080.AÔz·´À1opOá4§ß\u009d\u009dÈ7×\u008fØ\u0090\nå'\u0080\u0002dÏË\u0016Ok[{\u000b\u0083_\u0082ee\u0014\u0012Jü6\u0097\u0099í°õM\u0089$á¼;\u0097\u0014×\u0088l\u0003(3k\u0007\u009d/Û\u001dIuvYM=\u001ay\u0089ò\u009b>dotõ¤Ý\fiBfV!\u000f¯n"
               .length();
            var5 = '\u0018';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var9;
                  llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new String[5];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI();
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16414;
      if (llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5].getBytes("ISO-8859-1");
         llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI[var5];
   }

   private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/failsafes/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
