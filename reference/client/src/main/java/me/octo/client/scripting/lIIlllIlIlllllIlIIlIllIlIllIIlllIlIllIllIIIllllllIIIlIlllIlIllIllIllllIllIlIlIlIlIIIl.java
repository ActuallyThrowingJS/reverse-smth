package me.octo.client.scripting;

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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.graalvm.polyglot.proxy.ProxyObject;
import org.jetbrains.annotations.NotNull;

public final class lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 59390853569180L;
   private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

   @NotNull
   public final ProxyObject IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Pair[] var6 = new Pair[]{
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(15145, 7812522993049874244L ^ var4), 0),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(273, 3149752242964174194L ^ var4), 1),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(2502, 3919644336793591210L ^ var4), 2),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(25850, 512202778826141842L ^ var4), 3),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(4649, 3938916142377600583L ^ var4), 4),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(29759, 83426477765681245L ^ var4), 5),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(30940, 6192512930161781942L ^ var4), 6),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(13218, 7602943423144437699L ^ var4), 0),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(24866, 388494697396041028L ^ var4), 1),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(16366, 5057579669557783434L ^ var4), 2),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(8468, 5849458025629726068L ^ var4), 0),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(18031, 2027520087976727046L ^ var4), 1),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(6118, 9088536867534799766L ^ var4), 2),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(5732, 4105058578607636995L ^ var4), 3),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(31006, 8926243395608309103L ^ var4), 4),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(20256, 497293593618471749L ^ var4), 5),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(10987, 5421601861036129945L ^ var4), 0),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(8535, 9159814916189500728L ^ var4), 1),
         TuplesKt.to(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(30057, 8561814028700147994L ^ var4), 2)
      };
      ProxyObject var10000 = ProxyObject.fromMap(MapsKt.linkedMapOf(var6));
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(20391, 3248173506929122252L ^ var4)
      );
      return var10000;
   }

   static {
      long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 95335654271564L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "\u008aOJföÇù\f}ÞFÌ\u0097eµ¿\u0002 _\u001fJ\u0006ý±áª\u00064o\u001ef\u000b\u0010ä\b,\u00000\u000f@\u0018?O\u0003\\\u008bX\u008eyØ¶ÄÎ\u0081ì\u0095\u009fÜzè\u0094¦z\u0098e ©\u001d\u0019{»ßX[|²$¦!2ñ)äfÕ\u0098x\u008dâ9oä\u009fyËæ\u0091s w\u009f\u001a\u00886ô\u0084y=\u0017fò¦WÜO\u00ad\u0090'õyeÒ\u0018\u0013ä#\u0011\u0085÷\u008cÖ\u0018Ú\u009bAy\u008fIÙ\u0089´8û\u0095\u0006(Ú\u0098¹\u009e\u0093\u0010\nB'Ô(\u008b\u000b#kß\u0006\u000bÀÌ°BX\u0013ò=#©®²\u0015ôÏ¿s[2\u000b\u0087]µPáêl\u0016\u0004c$¼Ü\u0010´Æ%HÙ\u0003|ÞR\u0004ÀÝÛê±ï ¥\u0004R±âæ$bÝÏÅV§~2Ab\u001a\u009a?}½õ[\u008e >ô\u001d\u0005xC\u0018·v\u0094Ä\u008ciah\u0013r@1£+¼²]T#î\u001c<&\u0003(\u0084{;\u009fy .ê\n\u008f\u008fÜQ\u008c6i\u0002n/!'=0\u0012³'d\u000fjÌÌD IØiGÖk\u008c ç·ðåµ\u001bîg\n\u008b«ay\u008aUÛ\u0013Õ\u0019[\"xi.Ì\u0083\u0087\u000eãfÅ\u0019 ó+\u0000p·Z\u0018G3\u008dÄâ3I°=ª\u0090zëÄì@\u00ad5\u001cÖ\u0002mOÙ¾ §\u0013Aß÷ý0%\u0016÷\u0091¥:væÒ~ÍÑ\u0016 \u0081m\u007fçY2\u0083î\u0006$\u008d\u0018\u0013æ#Á>\n\u0011 -é^\u008878#Þ\"BX,ËmÅi ]Ê¯FÉS\u000bZ¤=7\u0012\"ü)\u0099@À´Ç(Ùäm_¸ý1\u00064\u0096÷ «\u001fT+î\u0096²÷T\u0088N\fÃàô-\u008c\u0018\u000b(\u0000!Ï×\bqO\u0094\u001c\u0085ÜY(P\u0011o)íÐ/\u0004)\u0084\u0089*yF\u001f\u0094s\u0082å\u009abï\u00999\b\u0089¼ÿR«.Ïÿ %Ë¡Kèß\u00183Ïµb\u001a¥\u008d0éS&\u0015(»÷9\u0090õq«\u008e\u0091É\u0098";
      int var8 = "\u008aOJföÇù\f}ÞFÌ\u0097eµ¿\u0002 _\u001fJ\u0006ý±áª\u00064o\u001ef\u000b\u0010ä\b,\u00000\u000f@\u0018?O\u0003\\\u008bX\u008eyØ¶ÄÎ\u0081ì\u0095\u009fÜzè\u0094¦z\u0098e ©\u001d\u0019{»ßX[|²$¦!2ñ)äfÕ\u0098x\u008dâ9oä\u009fyËæ\u0091s w\u009f\u001a\u00886ô\u0084y=\u0017fò¦WÜO\u00ad\u0090'õyeÒ\u0018\u0013ä#\u0011\u0085÷\u008cÖ\u0018Ú\u009bAy\u008fIÙ\u0089´8û\u0095\u0006(Ú\u0098¹\u009e\u0093\u0010\nB'Ô(\u008b\u000b#kß\u0006\u000bÀÌ°BX\u0013ò=#©®²\u0015ôÏ¿s[2\u000b\u0087]µPáêl\u0016\u0004c$¼Ü\u0010´Æ%HÙ\u0003|ÞR\u0004ÀÝÛê±ï ¥\u0004R±âæ$bÝÏÅV§~2Ab\u001a\u009a?}½õ[\u008e >ô\u001d\u0005xC\u0018·v\u0094Ä\u008ciah\u0013r@1£+¼²]T#î\u001c<&\u0003(\u0084{;\u009fy .ê\n\u008f\u008fÜQ\u008c6i\u0002n/!'=0\u0012³'d\u000fjÌÌD IØiGÖk\u008c ç·ðåµ\u001bîg\n\u008b«ay\u008aUÛ\u0013Õ\u0019[\"xi.Ì\u0083\u0087\u000eãfÅ\u0019 ó+\u0000p·Z\u0018G3\u008dÄâ3I°=ª\u0090zëÄì@\u00ad5\u001cÖ\u0002mOÙ¾ §\u0013Aß÷ý0%\u0016÷\u0091¥:væÒ~ÍÑ\u0016 \u0081m\u007fçY2\u0083î\u0006$\u008d\u0018\u0013æ#Á>\n\u0011 -é^\u008878#Þ\"BX,ËmÅi ]Ê¯FÉS\u000bZ¤=7\u0012\"ü)\u0099@À´Ç(Ùäm_¸ý1\u00064\u0096÷ «\u001fT+î\u0096²÷T\u0088N\fÃàô-\u008c\u0018\u000b(\u0000!Ï×\bqO\u0094\u001c\u0085ÜY(P\u0011o)íÐ/\u0004)\u0084\u0089*yF\u001f\u0094s\u0082å\u009abï\u00999\b\u0089¼ÿR«.Ïÿ %Ë¡Kèß\u00183Ïµb\u001a¥\u008d0éS&\u0015(»÷9\u0090õq«\u008e\u0091É\u0098"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u009a?X«û\u0080\u0097c\u0013ð:½ëÎ\u0085Ø¥ u$Å*æÓÀR\u001c\u001aId\u0085\u00810ãþ Pn¿sÁ¯9C\u001d[Ãj¾7|g2CÞm+¦¬\u009bZÂ\u0005¢öK\u001eYZg»±mT\u0093ä£?T@é";
            var8 = "\u009a?X«û\u0080\u0097c\u0013ð:½ëÎ\u0085Ø¥ u$Å*æÓÀR\u001c\u001aId\u0085\u00810ãþ Pn¿sÁ¯9C\u001d[Ãj¾7|g2CÞm+¦¬\u009bZÂ\u0005¢öK\u001eYZg»±mT\u0093ä£?T@é"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[20];
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
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

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6254;
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
            throw new RuntimeException("me/octo/client/scripting/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl", var10);
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
            "me/octo/client/scripting/lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
