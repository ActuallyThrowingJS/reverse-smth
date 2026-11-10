package me.octo.client.utils.render.shapes;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   @NotNull
   public static IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final String identifier;
   private boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private InputStream stream;
   @Nullable
   private ByteBuffer IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 91608956885387L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);

   public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
      @NotNull String identifierArg, boolean argument2Arg, @NotNull InputStream streamArg, @Nullable ByteBuffer argument4Arg
   ) {
      long var5 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 126062908426798L;
      Intrinsics.checkNotNullParameter(identifierArg, "identifier");
      Intrinsics.checkNotNullParameter(streamArg, "stream");
      super();
      this.identifier = identifierArg;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument2Arg;
      this.stream = streamArg;
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument4Arg;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = StringsKt.endsWith(this.identifier, ".svg", true);
   }

   @NotNull
   public final String getIdentifier() {
      return this.identifier;
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var1;
   }

   @NotNull
   public final InputStream getStream() {
      return this.stream;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull InputStream var3) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(6300, 2348275338230603459L ^ var1)
      );
      this.stream = var3;
   }

   @NotNull
   public final ByteBuffer IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public int hashCode() {
      return this.identifier.hashCode();
   }

   static {
      long var0 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 102738040268090L;
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
      String var6 = "\u0002\u0002¶qÆ=W¬A¼ð>\u0090#¼\u0083@ål\u0095g|\u0088!c\u0000vgî\u0084¦«I½SÕ:Ð£ji\u0099°owXàÉ{\u0006±\u0096¥\b\u009f©(¯\u0015PE6]¤è$\u0010u\u00923´6Ç8Ú2¸\u000e11M\u008b¡\u0001Å,Ïû\u0011Zù»\u008a;ú©j`\u0081xn\u0011Móú¢\u009e\r±¤K×H\u0094º\u001e\u008f8üP\u0087g\t\u0003l©\u008c\n\u0094.\u0091õ\u0094ÃúÎâ\u0097Ô\u0099O\u0095ØÜ´Âê\u001a\bre«X×®Ùá\u0099\u0098<\n\u009cKôi,xs\u0003\u001fð\t\u009dE¯\u001dá#Ý\u0006\u0087S\u009e\u0003;\u0018¾\u0018¨\u0093ÍÉ\u0095\n Ùµ?'&;´\u001c\u0087\u001aÌÅ\u001fô~\u0083ôW$\u008dj)¡Õ\u0081¾î¨p\u0083^6 \u009e'X\u000eòÏÐ)~ævï0[]\u0007ÝCWxË'sh¹bý>²\u0083ø\u0090\u0010Ãk®\u008f@Ú\u0081áW7.\u009c`\u0097ô}\u0010¨É1Ëê>ä#\u0011lå\u0096Ýt~\r";
      int var8 = "\u0002\u0002¶qÆ=W¬A¼ð>\u0090#¼\u0083@ål\u0095g|\u0088!c\u0000vgî\u0084¦«I½SÕ:Ð£ji\u0099°owXàÉ{\u0006±\u0096¥\b\u009f©(¯\u0015PE6]¤è$\u0010u\u00923´6Ç8Ú2¸\u000e11M\u008b¡\u0001Å,Ïû\u0011Zù»\u008a;ú©j`\u0081xn\u0011Móú¢\u009e\r±¤K×H\u0094º\u001e\u008f8üP\u0087g\t\u0003l©\u008c\n\u0094.\u0091õ\u0094ÃúÎâ\u0097Ô\u0099O\u0095ØÜ´Âê\u001a\bre«X×®Ùá\u0099\u0098<\n\u009cKôi,xs\u0003\u001fð\t\u009dE¯\u001dá#Ý\u0006\u0087S\u009e\u0003;\u0018¾\u0018¨\u0093ÍÉ\u0095\n Ùµ?'&;´\u001c\u0087\u001aÌÅ\u001fô~\u0083ôW$\u008dj)¡Õ\u0081¾î¨p\u0083^6 \u009e'X\u000eòÏÐ)~ævï0[]\u0007ÝCWxË'sh¹bý>²\u0083ø\u0090\u0010Ãk®\u008f@Ú\u0081áW7.\u009c`\u0097ô}\u0010¨É1Ëê>ä#\u0011lå\u0096Ýt~\r"
         .length();
      char var5 = '8';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "Ô\u0085ÒóQ}Ë+\"ºu@éY \u0098 9G7\fw\u0002\u0089,h(©gýçï\fÞË¾\u0080`5\u000eÛ\fÂ\u0002\u0014D\u009bCÝ";
            var8 = "Ô\u0085ÒóQ}Ë+\"ºu@éY \u0098 9G7\fw\u0002\u0089,h(©gýçï\fÞË¾\u0080`5\u000eÛ\fÂ\u0002\u0014D\u009bCÝ".length();
            var5 = '\u0010';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var9;
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[9];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  return;
               }

               var5 = var6.charAt(var4);
            }
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalStateException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(IllegalStateException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11791;
      if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/render/shapes/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
         byte[] var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5];
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
            "me/octo/client/utils/render/shapes/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 126065314318798L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      private final InputStream IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, String param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 42164563024234L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[14];
         int var7 = 0;
         String var6 = "á]I*)\u0095\b?\u007fÔwUY\u0081Ö\u0013Ã:\u008còá-\u0095%\u0084î\u009baÀ\u00adq· G\u0087ßüæy\fF\u008a\u001fÜoå&Î°\u0097>Û\të\u0096$\fÑöNñÐ_³êP\né®®\u00879ýÉªüü¸Â\u0091iFú¯C\u008dæ\u009eà\u0081?\u0099CJ\u009a\u0018\u008c¼}ßé\u0096¿BYªT\u0005ù:¹\u0094¼½\u009fÓÚgä ÝwWóÌ\u0093§JÆ>l³àÃ»\u001e\u0091[\u0081 9¸/\u000ff] \u0087\b=Â@1\"¬\u0087@FÌzL¢Ó6ël\u001aC\u0005î¿\u0081¦\u0095Â\u000b\u009fqÏ ñäáô\u0098w5ô8r\u0081ì$Üy[Ü¬ì®Ï\u0001Ä¾÷P^\u0084¹\u0002L? ýÿrKÌ\u008f\u0000»\fR8¶Ì±§\u0092;\u000f]Û=\n:u ð\u009aç±\"3H 2VîIK4¤\u0002\u0097+ñÍæ\u0005\u0012Î¨\u0080£IJ\b>¯êBÇ\u001eÚ\u0084·ê\u0010H¢¡*_9Ö6½éjâ[³Ý\u0018 Z ]\u0085ðÉ²\u0083(\t\u009dgà&©IÏ\u0019WØªT·\u0096í2ÔÎþü,õ\u0090\u009cîì¦sTÑA\u000fAÅ\u0019y\u0082Å\u0086k.Ò\u001f¼~\u008d³\u0019\u0086¾\u0000à\u0086\u001e¼'ùÆ\u009f\u009eþhãBXp7©k/\fi\u0093²\u00ad¯À_WRO+Q8YÝ\u009f\u0099\u0094Úw\u008f!4ý\u0012©\\aÜ½Y¿5\\AWS:ù\u0096\u0014y\u001c\u0006ºÍÚú¼¤ä\u000e\u0097y£t\u000f\u001976\u0012ò\u0014\u008cd\u0098ªrvVÒ\u0083!Ý\u009a½@K\u0080\u007f\u0082dÚ\u009a\u0084\fð\u0011)\u008e_:\u008b¸À±@\u0088\u0088;A\u009cUÿ\u009e\u0007\u001dXLd\\î\u0099Ò\u0094Um+Ç¯ûO5fY¥)\u0016Õa¾éÂI{s\u0085Å/ÏIWc\u0082øRT×ÏÌ\u0093+\u0098¸B\u00035Dµ-ú(\tI&0¡ò>\u0094ÿu\u0091Æ:êÃ.£¥\u0088Á2\u009f\u0005w'ÖGü>:\u0094i9\u009f\u0003Æ¾x¹Ì";
         int var8 = "á]I*)\u0095\b?\u007fÔwUY\u0081Ö\u0013Ã:\u008còá-\u0095%\u0084î\u009baÀ\u00adq· G\u0087ßüæy\fF\u008a\u001fÜoå&Î°\u0097>Û\të\u0096$\fÑöNñÐ_³êP\né®®\u00879ýÉªüü¸Â\u0091iFú¯C\u008dæ\u009eà\u0081?\u0099CJ\u009a\u0018\u008c¼}ßé\u0096¿BYªT\u0005ù:¹\u0094¼½\u009fÓÚgä ÝwWóÌ\u0093§JÆ>l³àÃ»\u001e\u0091[\u0081 9¸/\u000ff] \u0087\b=Â@1\"¬\u0087@FÌzL¢Ó6ël\u001aC\u0005î¿\u0081¦\u0095Â\u000b\u009fqÏ ñäáô\u0098w5ô8r\u0081ì$Üy[Ü¬ì®Ï\u0001Ä¾÷P^\u0084¹\u0002L? ýÿrKÌ\u008f\u0000»\fR8¶Ì±§\u0092;\u000f]Û=\n:u ð\u009aç±\"3H 2VîIK4¤\u0002\u0097+ñÍæ\u0005\u0012Î¨\u0080£IJ\b>¯êBÇ\u001eÚ\u0084·ê\u0010H¢¡*_9Ö6½éjâ[³Ý\u0018 Z ]\u0085ðÉ²\u0083(\t\u009dgà&©IÏ\u0019WØªT·\u0096í2ÔÎþü,õ\u0090\u009cîì¦sTÑA\u000fAÅ\u0019y\u0082Å\u0086k.Ò\u001f¼~\u008d³\u0019\u0086¾\u0000à\u0086\u001e¼'ùÆ\u009f\u009eþhãBXp7©k/\fi\u0093²\u00ad¯À_WRO+Q8YÝ\u009f\u0099\u0094Úw\u008f!4ý\u0012©\\aÜ½Y¿5\\AWS:ù\u0096\u0014y\u001c\u0006ºÍÚú¼¤ä\u000e\u0097y£t\u000f\u001976\u0012ò\u0014\u008cd\u0098ªrvVÒ\u0083!Ý\u009a½@K\u0080\u007f\u0082dÚ\u009a\u0084\fð\u0011)\u008e_:\u008b¸À±@\u0088\u0088;A\u009cUÿ\u009e\u0007\u001dXLd\\î\u0099Ò\u0094Um+Ç¯ûO5fY¥)\u0016Õa¾éÂI{s\u0085Å/ÏIWc\u0082øRT×ÏÌ\u0093+\u0098¸B\u00035Dµ-ú(\tI&0¡ò>\u0094ÿu\u0091Æ:êÃ.£¥\u0088Á2\u009f\u0005w'ÖGü>:\u0094i9\u009f\u0003Æ¾x¹Ì"
            .length();
         char var5 = ' ';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "ºóÁs-Ö%ÝõóÇï»\u0017f¡\u0000à\u000e\u0095Ê-\u009e:©P®üÝá\n\u0090\u0010ch/~my¶\u0089FJ|¾Ð ÜÀ";
               var8 = "ºóÁs-Ö%ÝõóÇï»\u0017f¡\u0000à\u000e\u0095Ê-\u009e:©P®üÝá\n\u0090\u0010ch/~my¶\u0089FJ|¾Ð ÜÀ".length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[14];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
         }
      }

      private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 22208;
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
                  "me/octo/client/utils/render/shapes/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/utils/render/shapes/IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      public static final InputStream IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$98b20cfe4fff5a06(
         short var0,
         long var1,
         IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3,
         String var4
      ) {
         var1 = 95978172069188L;
         long var5 = ((long)var0 << 48 | var1 << 16 >>> 16) ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var7 = var5 ^ 52686520976341L;
         return var3.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var4);
      }
   }
}
