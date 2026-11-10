package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.ChestBackgroundDrawnEvent;
import org.jetbrains.annotations.NotNull;

public final class lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl
   extends me.octo.client.modules.helpers.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   private final Pattern IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   @NotNull
   private final Pattern llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private boolean lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static long lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 121668846870478L;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static Map IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new HashMap(13);

   public lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl() {
      long var1 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 30299595357476L;
      super("Museum Scanner");
      Pattern var10001 = Pattern.compile("Milestone:\\s*(\\d+)\\s*/\\s*(\\d+)");
      Intrinsics.checkNotNullExpressionValue(var10001, "compile(...)");
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var10001;
      var10001 = Pattern.compile("(\\d+)/100");
      Intrinsics.checkNotNullExpressionValue(var10001, "compile(...)");
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var10001;
   }

   @NotNull
   public final Pattern IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   @NotNull
   public final Pattern IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final boolean llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var1;
   }

   @Override
   public void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var1) {
   }

   @SubscribeEvent
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull ChestBackgroundDrawnEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long var1) {
      long var3 = var1 ^ 23889456652188L;
      long var5 = var1 ^ 0L;
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      super.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var5);
   }

   @Override
   public void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      int var5 = (int)((var1 ^ 131371598094042L) >>> 32);
      int var6 = (int)((var1 ^ 131371598094042L) << 32 >>> 32);
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var5, var6);
      super.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
   }

   static {
      long var0 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI ^ 35835297444060L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[19];
      int var7 = 0;
      String var6 = "ãÿ¾4Ù\f^\u0003\u001b\u0086\u008cÓ\u0087g\u0000C±\u0089éý\u0015\u0084Åäc.ø}ÑÖrA\u0018\u0096HRb#Ç\u0017K\u0004Ñâjh©±ÌÞy#NpªlÞ\u0018W£®Ô\u0082\u001b\u000b\u0011UÂeNóO\rQ\u000e¿ä¥i×\u0096û !2>ñÄxáÎ3úÍL½VÓ\u0095ÀëîfÝÅðè¡ÊA\u009dä\u0013W¨(¡\u0080Ù}\u001d¬\u009f¦:ô\u0092i\u000bÎY©k\u0016\u001ae¬)X\u008d\u001eÕ\u0003\u009a¬¨ãvþf\u0007\u0007ð0;ê\u0010\u0097;3æâ à\u001eõ«\u0099\u0019hF¸Ð@c\u0080¦M||¶÷uªîì\u0005¤î\u0016Ð\u0011·Þõ Ñ\n7!o¢µ\u0093§\u001cì±iõ\n®\u001d\u0013È¸´®\u001a\u007f\u0098<þ\u008cý¼y\u0094<J\u0094ìûxj«\u0017¨\u0010\u0099ÖX\u0081Û\f\u000e¯b\u00071ojmÙº\u0018I\u0086\u0091\u0087\u0093.·íñ?\u000e*ÿ\bRÕöÛÞ®\u001a\u001e¬)(\u0017ÔG\u009dULíÌ1@WèÇ\u0082 î``\"ÿoE=¿*úºìðZ\u008a\u0091\u009fE%\u0097ÙS¦P\u0018.\u0007\u0097\u0084sæ\b\u007flUþ\u007fã6x?JBKH5¿\u0003g\u0018ä07\u0080«Ók\u001e{\u001cpC?Mø\u0093J¬ÿ·\u0088°\t( \u0090¿>±n\u0087\u0019\u0099ÊË¶¥3¸õ\"qÐb¡\u001a\u009fg\u0090Y\u009e)\u001bf\u000e\u0092* &ëØ æ\u0005)éí\u0007$´ûWóÜò~$84\u0085d\u0083/Ñ \u0004!\rÃ+ }\u009c|\u000f·\u0081¾G5Ð\u0004FaO\u00adÞç\u0097ls\u000b\u0090\u0089Kq$ý{u\u0011É\u0006\u0018F³ðâ®ükw`gÃ©O\u0092lï\u00060\u008b¦`E_A(pQÙÈÕ.\u001búë\u0091~Sä´ï\n\u0081Kà\u000fêÎÞ3¢Mé\u0096\u001fø\u008c ¹6[¡Fð¡\u00ad";
      int var8 = "ãÿ¾4Ù\f^\u0003\u001b\u0086\u008cÓ\u0087g\u0000C±\u0089éý\u0015\u0084Åäc.ø}ÑÖrA\u0018\u0096HRb#Ç\u0017K\u0004Ñâjh©±ÌÞy#NpªlÞ\u0018W£®Ô\u0082\u001b\u000b\u0011UÂeNóO\rQ\u000e¿ä¥i×\u0096û !2>ñÄxáÎ3úÍL½VÓ\u0095ÀëîfÝÅðè¡ÊA\u009dä\u0013W¨(¡\u0080Ù}\u001d¬\u009f¦:ô\u0092i\u000bÎY©k\u0016\u001ae¬)X\u008d\u001eÕ\u0003\u009a¬¨ãvþf\u0007\u0007ð0;ê\u0010\u0097;3æâ à\u001eõ«\u0099\u0019hF¸Ð@c\u0080¦M||¶÷uªîì\u0005¤î\u0016Ð\u0011·Þõ Ñ\n7!o¢µ\u0093§\u001cì±iõ\n®\u001d\u0013È¸´®\u001a\u007f\u0098<þ\u008cý¼y\u0094<J\u0094ìûxj«\u0017¨\u0010\u0099ÖX\u0081Û\f\u000e¯b\u00071ojmÙº\u0018I\u0086\u0091\u0087\u0093.·íñ?\u000e*ÿ\bRÕöÛÞ®\u001a\u001e¬)(\u0017ÔG\u009dULíÌ1@WèÇ\u0082 î``\"ÿoE=¿*úºìðZ\u008a\u0091\u009fE%\u0097ÙS¦P\u0018.\u0007\u0097\u0084sæ\b\u007flUþ\u007fã6x?JBKH5¿\u0003g\u0018ä07\u0080«Ók\u001e{\u001cpC?Mø\u0093J¬ÿ·\u0088°\t( \u0090¿>±n\u0087\u0019\u0099ÊË¶¥3¸õ\"qÐb¡\u001a\u009fg\u0090Y\u009e)\u001bf\u000e\u0092* &ëØ æ\u0005)éí\u0007$´ûWóÜò~$84\u0085d\u0083/Ñ \u0004!\rÃ+ }\u009c|\u000f·\u0081¾G5Ð\u0004FaO\u00adÞç\u0097ls\u000b\u0090\u0089Kq$ý{u\u0011É\u0006\u0018F³ðâ®ükw`gÃ©O\u0092lï\u00060\u008b¦`E_A(pQÙÈÕ.\u001búë\u0091~Sä´ï\n\u0081Kà\u000fêÎÞ3¢Mé\u0096\u001fø\u008c ¹6[¡Fð¡\u00ad"
         .length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "Ó¼(Fý\ng\u000f\u009e»Äïl¦)Öå';î4\u008a!0SuGôðRåÉ81\u0006Åý0\u0083Z»Þ°\u0003\u0003\bÞÐxyÜ\u0016°â¼\b±\u0084\u0016}D|ÜÀ\u001f\u0099\u001bOÌ\u0090¦\u0088\u0001à*2l\u001dÀ\u000fb\n¤4 ªN\b®";
            var8 = "Ó¼(Fý\ng\u000f\u009e»Äïl¦)Öå';î4\u008a!0SuGôðRåÉ81\u0006Åý0\u0083Z»Þ°\u0003\u0003\bÞÐxyÜ\u0016°â¼\b±\u0084\u0016}D|ÜÀ\u001f\u0099\u001bOÌ\u0090¦\u0088\u0001à*2l\u001dÀ\u000fb\n¤4 ªN\b®"
               .length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var9;
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new String[19];
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29279;
      if (lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl", var10
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
         byte[] var9 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5].getBytes("ISO-8859-1");
         lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5];
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
            "me/octo/client/modules/impl/macros/lIlIlIllIlllIlIllIIIllIIllIIlIIlIlllIIIlIIlllIIlIlIIllllIIIlIllIIlllIIlIIIIIllIIlIlIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
