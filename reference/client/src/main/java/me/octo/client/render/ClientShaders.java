package me.octo.client.render;

import com.mojang.blaze3d.shaders.ShaderSource;
import com.mojang.blaze3d.shaders.ShaderType;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.Polinex;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract sealed class ClientShaders
   implements ShaderSource
   permits ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll,
   ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   @NotNull
   public static ClientShaders.Companion Companion;
   @NotNull
   private final ShaderType IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final Object2ObjectOpenHashMap<Identifier, String> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = 84416802835351L;
   private static String[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static Map IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new HashMap(13);

   private ClientShaders(ShaderType var1) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Object2ObjectOpenHashMap();
   }

   @NotNull
   public final ShaderType IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   @NotNull
   protected final Identifier IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1, @NotNull String var2, @NotNull String var3, int var4, char var5
   ) {
      long var6 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48)
         ^ llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
      long var8 = var6 ^ 51000376446098L;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(19220, 4026999187320603050L ^ var6)
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(20488, 6545346927945423543L ^ var6)
      );
      return this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.getName() + "/" + var2, var3, var8
      );
   }

   private final Identifier llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var1, String var2, long var3) {
      var3 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl ^ var3;
      long var5 = var3 ^ 117746865181799L;
      int var7 = (int)((var3 ^ 88619708692581L) >>> 56);
      long var8 = (var3 ^ 88619708692581L) << 8 >>> 8;
      Identifier var10 = Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(16099, 1869989963327140702L ^ var3) + var1, var5
         );
      if ((String)this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
            .put(
               var10,
               Polinex.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((byte)var7, var8, var2)
            )
         != null) {
         boolean var12 = false;
         throw new IllegalStateException(
            (IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(8253, 7207058621803785601L ^ var3) + var10).toString()
         );
      } else {
         return var10;
      }
   }

   @Nullable
   public String get(@NotNull Identifier identifierArg, @NotNull ShaderType typeArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl ^ 18216804157899L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "P9J=\u008e÷,n\nµ\u0089?òÀiu g->\u0001\u008eÞ PäÐ'\u009a4?\u0081Î;d}\u0098?$pÂ\u0014\u0014ý\u001b#2MC\u0010\u0017\u001b¹ÆcÇ\u001bÝö*\u0086ciØêÎ(¯å_\tö»\u008e u\"Ôâ(ðRÀc'Â\u001f\u0094æ0\u007f§\u0017õÔÂ# o\u009eâp ¤ãÑî";
      int var8 = "P9J=\u008e÷,n\nµ\u0089?òÀiu g->\u0001\u008eÞ PäÐ'\u009a4?\u0081Î;d}\u0098?$pÂ\u0014\u0014ý\u001b#2MC\u0010\u0017\u001b¹ÆcÇ\u001bÝö*\u0086ciØêÎ(¯å_\tö»\u008e u\"Ôâ(ðRÀc'Â\u001f\u0094æ0\u007f§\u0017õÔÂ# o\u009eâp ¤ãÑî"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "{[Å\"}\u008e\u0015Q#X \u009dÑiÿ½\u0010W®Wyñ'«å]«5FaJ\u008bÄ";
            var8 = "{[Å\"}\u008e\u0015Q#X \u009dÑiÿ½\u0010W®Wyñ'«å]«5FaJ\u008bÄ".length();
            var5 = '\u0010';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var9;
                  IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new String[6];
                  Companion = new ClientShaders.Companion(null);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4883;
      if (IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/ClientShaders", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll[var5].getBytes("ISO-8859-1");
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5];
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
         throw new RuntimeException("me/octo/client/render/ClientShaders" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static final class Companion implements ShaderSource {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 11255627963265L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private Companion() {
      }

      @Nullable
      public String get(@NotNull Identifier identifierArg, @NotNull ShaderType shaderTypeArg) {
         long var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 87360059185358L;

         try {
            Intrinsics.checkNotNullParameter(identifierArg, "identifier");
            Intrinsics.checkNotNullParameter(shaderTypeArg, "shaderType");
            switch (ClientShaders.Companion.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[shaderTypeArg.ordinal()]) {
               case 1:
                  return ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     .get(identifierArg, shaderTypeArg);
               case 2:
                  return ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                     .get(identifierArg, shaderTypeArg);
               default:
                  throw new NoWhenBranchMatchedException();
            }
         } catch (NoWhenBranchMatchedException var6) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
         }
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 102193189079015L;
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
         String var6 = "}é\u0016#á\u001a\u008eTZíû-3r\u0014\u0098®aKÍ\u009f·«òäï¦Î¾qî² \u0005\u0083\u009d'¼\n³Ý/¬,§í¸P3\u001c2`\"\u009cÐâ`M\u0093½ì³tdX";
         int var8 = "}é\u0016#á\u001a\u008eTZíû-3r\u0014\u0098®aKÍ\u009f·«òäï¦Î¾qî² \u0005\u0083\u009d'¼\n³Ý/¬,§í¸P3\u001c2`\"\u009cÐâ`M\u0093½ì³tdX".length();
         char var5 = ' ';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var13;
            if ((var4 += var5) >= var8) {
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[2];
               return;
            }

            var5 = var6.charAt(var4);
         }
      }

      private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         NoWhenBranchMatchedException var0
      ) {
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 6629;
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
               throw new RuntimeException("me/octo/client/render/ClientShaders$Companion", var10);
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
            throw new RuntimeException("me/octo/client/render/ClientShaders$Companion" + " : " + var1 + " : " + var2.toString(), var5);
         }
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends ClientShaders {
      @NotNull
      public static ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @JvmField
      @NotNull
      public static Identifier lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @JvmField
      @NotNull
      public static Identifier IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @JvmField
      @NotNull
      public static Identifier IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @JvmField
      @NotNull
      public static Identifier IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @JvmField
      @NotNull
      public static Identifier lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @JvmField
      @NotNull
      public static Identifier IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @JvmField
      @NotNull
      public static Identifier llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
         super(ShaderType.VERTEX, null);
      }

      static {
         long var9 = 125302570937962L ^ 29985045619894L;
         long var10001 = var9 ^ 71533570316514L;
         int var11 = (int)((var9 ^ 71533570316514L) >>> 48);
         int var12 = (int)((var9 ^ 71533570316514L) << 16 >>> 32);
         int var13 = (int)(var10001 << 48 >>> 48);
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[14];
         int var6 = 0;
         String var5 = "£\u00ad>|Ì\u0003ä¬çY\u0087\u0003(¢_Î ßê4\u0090[Îfxæ\u001fn¾\u0019¥ñOI2¡xà¤\u0097U)V£\u000fÃ\u001eyÁ ßê4\u0090[ÎfxògE»ñAûà\"L;ÈÃ¤\u000fÄ{[²]\t\u0019¨m\u0010ÀYß,ÜN»>öòÈ9\u008fÅ¢»0ßê4\u0090[Îfx<)R\u001f\u0014<\u0000Ý¥Â7f\u001d5^\u008fÔ^5\u008eÞ\u009e\u0094q\u0098m}q\u0014¢Ù\u0094év]\u009e\u000b6åb ßê4\u0090[Îfx+¼+qº]x\t\u0002õj³_\u009diG\u0002ê\u00adÃ\u0016 \rJ\u0018Lk\u008bX\u0092\f®åÞM9ûJÊÿî\u001br¾Í\u001c»\u0097¨\b¶1Ó53¤¶À\u0010\u008d\u0090AG|_\u001cÀþ\u0095\u0087I\u0011\u001c\u0095°\u0018ßê4\u0090[Îfx\u0090/\u008cx2æI\u001cÀåKÈ\u0015\u0018\u0000ü È»Z \u0002Éíì\u009e{°Å\u008b\u0012\u009eÂ\u001d\u0012;*\u0019C\u009a\u007fdÕ\u0084Oàk9\u001d(ßê4\u0090[Îfx<)R\u001f\u0014<\u0000Ý¥Â7f\u001d5^\u008fÔ^5\u008eÞ\u009e\u0094qÈìô~æÍ\u0084\u0001";
         int var7 = "£\u00ad>|Ì\u0003ä¬çY\u0087\u0003(¢_Î ßê4\u0090[Îfxæ\u001fn¾\u0019¥ñOI2¡xà¤\u0097U)V£\u000fÃ\u001eyÁ ßê4\u0090[ÎfxògE»ñAûà\"L;ÈÃ¤\u000fÄ{[²]\t\u0019¨m\u0010ÀYß,ÜN»>öòÈ9\u008fÅ¢»0ßê4\u0090[Îfx<)R\u001f\u0014<\u0000Ý¥Â7f\u001d5^\u008fÔ^5\u008eÞ\u009e\u0094q\u0098m}q\u0014¢Ù\u0094év]\u009e\u000b6åb ßê4\u0090[Îfx+¼+qº]x\t\u0002õj³_\u009diG\u0002ê\u00adÃ\u0016 \rJ\u0018Lk\u008bX\u0092\f®åÞM9ûJÊÿî\u001br¾Í\u001c»\u0097¨\b¶1Ó53¤¶À\u0010\u008d\u0090AG|_\u001cÀþ\u0095\u0087I\u0011\u001c\u0095°\u0018ßê4\u0090[Îfx\u0090/\u008cx2æI\u001cÀåKÈ\u0015\u0018\u0000ü È»Z \u0002Éíì\u009e{°Å\u008b\u0012\u009eÂ\u001d\u0012;*\u0019C\u009a\u007fdÕ\u0084Oàk9\u001d(ßê4\u0090[Îfx<)R\u001f\u0014<\u0000Ý¥Â7f\u001d5^\u008fÔ^5\u008eÞ\u009e\u0094qÈìô~æÍ\u0084\u0001"
            .length();
         char var4 = '\u0010';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var25 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
            byte var21 = -1;
            var0[var6++] = var25;
            if ((var3 += var4) >= var7) {
               var5 = "ßê4\u0090[Îfx¼ë\u0093\u0002\u009b¼:r\u0096¤ \u0010GþÓØ\u008e¾\\5àÚDô\u0018\u0089NùØåNJ°\u0090á¥å\u000b\u0091ÂHê¯\u009d\u001fáE¾\u0085";
               var7 = "ßê4\u0090[Îfx¼ë\u0093\u0002\u009b¼:r\u0096¤ \u0010GþÓØ\u008e¾\\5àÚDô\u0018\u0089NùØåNJ°\u0090á¥å\u000b\u0091ÂHê¯\u009d\u001fáE¾\u0085"
                  .length();
               var4 = ' ';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var27 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
                  boolean var23 = false;
                  var0[var6++] = var27;
                  if ((var3 += var4) >= var7) {
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ClientShaders.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[6], var0[11], var12, (char)var13
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[10], var0[4], var12, (char)var13
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[7], var0[9], var12, (char)var13
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[8], var0[2], var12, (char)var13
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[13], var0[12], var12, (char)var13
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[3], var0[5], var12, (char)var13
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[0], var0[1], var12, (char)var13
                     );
                     return;
                  }

                  var4 = var5.charAt(var3);
               }
            }

            var4 = var5.charAt(var3);
         }
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
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends ClientShaders {
      @NotNull
      public static ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @JvmField
      @NotNull
      public static Identifier lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @JvmField
      @NotNull
      public static Identifier IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @JvmField
      @NotNull
      public static Identifier IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @JvmField
      @NotNull
      public static Identifier IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @JvmField
      @NotNull
      public static Identifier lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @JvmField
      @NotNull
      public static Identifier IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @JvmField
      @NotNull
      public static Identifier llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @JvmField
      @NotNull
      public static Identifier lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @JvmField
      @NotNull
      public static Identifier lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      @JvmField
      @NotNull
      public static Identifier lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      @JvmField
      @NotNull
      public static Identifier lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      @JvmField
      @NotNull
      public static Identifier IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      @JvmField
      @NotNull
      public static Identifier llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      @JvmField
      @NotNull
      public static Identifier IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      @JvmField
      @NotNull
      public static Identifier IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      @JvmField
      @NotNull
      public static Identifier IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      @JvmField
      @NotNull
      public static Identifier IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      @JvmField
      @NotNull
      public static Identifier llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
      @JvmField
      @NotNull
      public static Identifier IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
      @JvmField
      @NotNull
      public static Identifier lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
         super(ShaderType.FRAGMENT, null);
      }

      static {
         long var9 = 116775446466827L ^ 32291906637613L;
         long var10001 = var9 ^ 102076094221336L;
         int var11 = (int)((var9 ^ 102076094221336L) >>> 48);
         int var12 = (int)((var9 ^ 102076094221336L) << 16 >>> 32);
         int var13 = (int)(var10001 << 48 >>> 48);
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[40];
         int var6 = 0;
         String var5 = "¨\\4õu\u000b\u000bÁ\u0018}Þ6å¨Ê}Ã\n +×\u0091$b+ö)×\"4´5]\u0010\\zot:j\u0018\u0092ÌJì\u0080º\u0015õ~\u0018}Þ6å¨Ê}ÃI\u0005¯~éïjë\u0012òµ\u0083´Å\u0005\u000f\u0010sÒÒ\u0089}TÆÝ¾\u008c½T\u008d\u0086¦£\u0018\r\u008cKXë\n\ru¯ÕÊ·(Ôqþ\u0017\u00adË\u009cùÍÂ¥\u0018l\u008c\u0086ç\u0006\u0091²ÀÒ[\u0086\u0096\u0098\u0017sÜº0\u0083ÓGQk° }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á\u0085ñNS,Ô;\u0094:c^¢WXGª }Þ6å¨Ê}Ã|y¹\u001b©~ÔDë`¼ªõ÷\u008fÖ\u0003\u001e\u009cs×á\u0012y\bïÕ\u0095\u008b\u0010\n\\\u0001 }Þ6å¨Ê}Ã\u0096J\u0088\u009b5\u0095ÅuGÀ\u001c8\u001b\u009dXoúÖû\u0086Úx\u0013b }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁÞ\b;]\u0006Ó¹\u009bt\u009e\u0002\u001a\u008f\r®\u009c(}Þ6å¨Ê}ÃÚø}\u0004êçcëÅzæ\u0080ý\u009aö®ÁÊ]\u0004Mws\u001eäGýõB1ôW }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á¤vÂà<öÒ³Õ9\u008f\u0010~¬É\u008b\u0010/\n²\u008b¤\u0087ü°Ûð\u001d\u0094\u0019iâ,\u0010]\u0011±\u0006g\u0016\u0086[Ê\u001fÁfvq~Ë\b\u0088ñz¶ÈÐ$}\bu.\u0097 j¼\u0016â }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á»ÀO¸ó«ê´\u001e\u008bjdù¤T¥ }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁúÜ\u0099\nÓø\u008e\u0011\u009el\u0087Sº®%÷\b5\n\u0004×/hâ\f\u0010sÒÒ\u0089}TÆÝãU©y\u00973E\n }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á\u0086\u008b9ãI«C³\u001e<Cýæðò³\u0010ç¢\u001d\u0088ü÷\\*á2öØÊ·+ð }Þ6å¨Ê}Ãà`LùÉm\u0085[x©\u0012Ê{\u0090\u0004½ú\"\u008f\u0098lª°Ù\b\u001cIàô\"U\u0090¨ }Þ6å¨Ê}Ãå¸u\u0006¢bs\u0098¯j\u0088[t´\u009a\"Áa\u0007¤ k\u009eê\u0010þ\u0082öÎ\u0000\u0082V\u0011\u0006ÂEø1F9\u0011\u0010æ\u009f£Î\u001f\u0087¨[ô]Ðßñ½\u0007Ä\u0010\bÿÕLF¨óÖÞoù&\u0095\u0099\u008e\u001d\u0010\u000b\u0086\u0099_\u0013júû\u009bÝÒüñ\u009az¬ }Þ6å¨Ê}Ãå¸u\u0006¢bs\u0098z¦\u0094Ä\u009e\u0089\u009bK ÚÈ.C J² }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁÅ\u0011\u0017\u0082\u0089\u0087Ã\u008eÇèÔ\tÂ=Í° }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁúÜ\u0099\nÓø\u008e\u0011ÂÇ®y\u0013ô«\u0081(}Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Ájð=A\u0019õ~ï\\b4\u0097Þ¥éC\r¤Ñ8\u0017Ñ\u007f\u0019\u0018}Þ6å¨Ê}Ã\u0096\u000fS³æzVÖÒ-\u0000\u0005JÞá\u0010\u0010\u0083\u001f£QD)\u008ey\u0090ðùu\u0089ï$ã }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á¶\u0001ã\frÇæ\u0005\u000b\u008aD\f\"\u0007c:";
         int var7 = "¨\\4õu\u000b\u000bÁ\u0018}Þ6å¨Ê}Ã\n +×\u0091$b+ö)×\"4´5]\u0010\\zot:j\u0018\u0092ÌJì\u0080º\u0015õ~\u0018}Þ6å¨Ê}ÃI\u0005¯~éïjë\u0012òµ\u0083´Å\u0005\u000f\u0010sÒÒ\u0089}TÆÝ¾\u008c½T\u008d\u0086¦£\u0018\r\u008cKXë\n\ru¯ÕÊ·(Ôqþ\u0017\u00adË\u009cùÍÂ¥\u0018l\u008c\u0086ç\u0006\u0091²ÀÒ[\u0086\u0096\u0098\u0017sÜº0\u0083ÓGQk° }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á\u0085ñNS,Ô;\u0094:c^¢WXGª }Þ6å¨Ê}Ã|y¹\u001b©~ÔDë`¼ªõ÷\u008fÖ\u0003\u001e\u009cs×á\u0012y\bïÕ\u0095\u008b\u0010\n\\\u0001 }Þ6å¨Ê}Ã\u0096J\u0088\u009b5\u0095ÅuGÀ\u001c8\u001b\u009dXoúÖû\u0086Úx\u0013b }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁÞ\b;]\u0006Ó¹\u009bt\u009e\u0002\u001a\u008f\r®\u009c(}Þ6å¨Ê}ÃÚø}\u0004êçcëÅzæ\u0080ý\u009aö®ÁÊ]\u0004Mws\u001eäGýõB1ôW }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á¤vÂà<öÒ³Õ9\u008f\u0010~¬É\u008b\u0010/\n²\u008b¤\u0087ü°Ûð\u001d\u0094\u0019iâ,\u0010]\u0011±\u0006g\u0016\u0086[Ê\u001fÁfvq~Ë\b\u0088ñz¶ÈÐ$}\bu.\u0097 j¼\u0016â }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á»ÀO¸ó«ê´\u001e\u008bjdù¤T¥ }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁúÜ\u0099\nÓø\u008e\u0011\u009el\u0087Sº®%÷\b5\n\u0004×/hâ\f\u0010sÒÒ\u0089}TÆÝãU©y\u00973E\n }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á\u0086\u008b9ãI«C³\u001e<Cýæðò³\u0010ç¢\u001d\u0088ü÷\\*á2öØÊ·+ð }Þ6å¨Ê}Ãà`LùÉm\u0085[x©\u0012Ê{\u0090\u0004½ú\"\u008f\u0098lª°Ù\b\u001cIàô\"U\u0090¨ }Þ6å¨Ê}Ãå¸u\u0006¢bs\u0098¯j\u0088[t´\u009a\"Áa\u0007¤ k\u009eê\u0010þ\u0082öÎ\u0000\u0082V\u0011\u0006ÂEø1F9\u0011\u0010æ\u009f£Î\u001f\u0087¨[ô]Ðßñ½\u0007Ä\u0010\bÿÕLF¨óÖÞoù&\u0095\u0099\u008e\u001d\u0010\u000b\u0086\u0099_\u0013júû\u009bÝÒüñ\u009az¬ }Þ6å¨Ê}Ãå¸u\u0006¢bs\u0098z¦\u0094Ä\u009e\u0089\u009bK ÚÈ.C J² }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁÅ\u0011\u0017\u0082\u0089\u0087Ã\u008eÇèÔ\tÂ=Í° }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁúÜ\u0099\nÓø\u008e\u0011ÂÇ®y\u0013ô«\u0081(}Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Ájð=A\u0019õ~ï\\b4\u0097Þ¥éC\r¤Ñ8\u0017Ñ\u007f\u0019\u0018}Þ6å¨Ê}Ã\u0096\u000fS³æzVÖÒ-\u0000\u0005JÞá\u0010\u0010\u0083\u001f£QD)\u008ey\u0090ðùu\u0089ï$ã }Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012Á¶\u0001ã\frÇæ\u0005\u000b\u008aD\f\"\u0007c:"
            .length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var25 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
            byte var21 = -1;
            var0[var6++] = var25;
            if ((var3 += var4) >= var7) {
               var5 = "}Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁQßEÌ\u000f\u0012ÎC:\u009aZì²\u001e*ª\u00adÂ.²uF7ð\b·GÒ\u0015\u001f+ïT";
               var7 = "}Þ6å¨Ê}ÃÏ\u0003\n\u0092±6\u0012ÁQßEÌ\u000f\u0012ÎC:\u009aZì²\u001e*ª\u00adÂ.²uF7ð\b·GÒ\u0015\u001f+ïT".length();
               var4 = '(';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var27 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
                  boolean var23 = false;
                  var0[var6++] = var27;
                  if ((var3 += var4) >= var7) {
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ClientShaders.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[6], var0[12], var12, (char)var13
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[25], var0[35], var12, (char)var13
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[0], var0[1], var12, (char)var13
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[9], var0[34], var12, (char)var13
                     );
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[28], var0[13], var12, (char)var13
                     );
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[15], var0[18], var12, (char)var13
                     );
                     llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[30], var0[38], var12, (char)var13
                     );
                     lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[36], var0[7], var12, (char)var13
                     );
                     lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[2], var0[11], var12, (char)var13
                     );
                     lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[20], var0[22], var12, (char)var13
                     );
                     lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[39], var0[37], var12, (char)var13
                     );
                     IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[16], var0[32], var12, (char)var13
                     );
                     llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[4], var0[19], var12, (char)var13
                     );
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[21], var0[33], var12, (char)var13
                     );
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[29], var0[31], var12, (char)var13
                     );
                     IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[23], var0[26], var12, (char)var13
                     );
                     IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[17], var0[3], var12, (char)var13
                     );
                     llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[27], var0[10], var12, (char)var13
                     );
                     IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[5], var0[8], var12, (char)var13
                     );
                     lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (short)var11, var0[14], var0[24], var12, (char)var13
                     );
                     return;
                  }

                  var4 = var5.charAt(var3);
               }
            }

            var4 = var5.charAt(var3);
         }
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
   }
}
