package me.octo.client.render;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII {
   @NotNull
   public static lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @JvmField
   @NotNull
   public static VertexFormat lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @JvmField
   @NotNull
   public static VertexFormat IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

   private lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII() {
   }

   static {
      long var9 = 61373506603452L ^ 55263860811204L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[10];
      int var6 = 0;
      String var5 = "o\u0082\u0002ñ¦xm\u0081\u001e\u008f\u008f´y?\u000f\u00ad\u0010%\u0019\u009eÎ\u0081wÚRQ\u0004òÆ®\u008c\u0003L\bèÆ\u008d;iÚM\u0015\u0010$Ä£2mj¼^\u008b ½¢ª\u0005÷<\u0010 Sõ¾\tM^ ¸H\në\u009c\u00ad\fÌ\u0010 Sõ¾\tM^ ¸H\në\u009c\u00ad\fÌ\u0010=²\u00add\u0005m\nþj\bI\u0097\u0082VX\u0081\b\u008b:\u001c<ÔQ3\u000f";
      int var7 = "o\u0082\u0002ñ¦xm\u0081\u001e\u008f\u008f´y?\u000f\u00ad\u0010%\u0019\u009eÎ\u0081wÚRQ\u0004òÆ®\u008c\u0003L\bèÆ\u008d;iÚM\u0015\u0010$Ä£2mj¼^\u008b ½¢ª\u0005÷<\u0010 Sõ¾\tM^ ¸H\në\u009c\u00ad\fÌ\u0010 Sõ¾\tM^ ¸H\në\u009c\u00ad\fÌ\u0010=²\u00add\u0005m\nþj\bI\u0097\u0082VX\u0081\b\u008b:\u001c<ÔQ3\u000f"
         .length();
      char var4 = 16;
      int var12 = -1;

      label28:
      while (true) {
         String var13 = var5.substring(++var12, var12 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var0[var6++] = var21;
                  if ((var12 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII();
                     VertexFormat var15 = VertexFormat.builder()
                        .add(var0[4], VertexFormatElement.POSITION)
                        .add(var0[7], VertexFormatElement.UV0)
                        .add(var0[2], VertexFormatElement.UV2)
                        .build();
                     Intrinsics.checkNotNullExpressionValue(var15, var0[8]);
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var15;
                     VertexFormat var16 = VertexFormat.builder()
                        .add(var0[5], VertexFormatElement.POSITION)
                        .add(var0[9], VertexFormatElement.UV0)
                        .add(var0[1], VertexFormatElement.UV1)
                        .add(var0[6], VertexFormatElement.UV2)
                        .add(var0[0], VertexFormatElement.LINE_WIDTH)
                        .build();
                     Intrinsics.checkNotNullExpressionValue(var16, var0[3]);
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var16;
                     return;
                  }

                  var4 = var5.charAt(var12);
                  break;
               default:
                  var0[var6++] = var21;
                  if ((var12 += var4) < var7) {
                     var4 = var5.charAt(var12);
                     continue label28;
                  }

                  var5 = "$Ä£2mj¼^\u008b ½¢ª\u0005÷<\b\u008b:\u001c<ÔQ3\u000f";
                  var7 = "$Ä£2mj¼^\u008b ½¢ª\u0005÷<\b\u008b:\u001c<ÔQ3\u000f".length();
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
