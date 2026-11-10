package me.octo.client.gui;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.colors.Color;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   public static IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final me.octo.client.utils.render.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.utils.render.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(
      75
   );
   @Nullable
   private me.octo.client.gui.clickgui.endgameGUI.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private final NumberFormat lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = NumberFormat.getNumberInstance(Locale.US);
   private static float IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 77000049504702L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);
   private static long[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Integer[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull GuiGraphicsExtractor param1,
      @NotNull List param2,
      long param3,
      float param5,
      float param6,
      float param7,
      float param8,
      int param9,
      int param10,
      float param11
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1,
      @NotNull lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      float var10
   ) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var11 = var1 ^ 124438610321509L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(19167, 1850459781671749235L ^ var1)
      );
      return this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3, var11, var4, var5, var6, var7, var8, var9, var10);
   }

   private final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII param1,
      long param2,
      float param4,
      float param5,
      float param6,
      float param7,
      int param8,
      int param9,
      float param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final Color IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, me.octo.client.gui.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var3
   ) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;

      try {
         switch (IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var3.ordinal()]) {
            case 1:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(30072, 5051994043937053568L ^ var1));
            case 2:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(32710, 3412654748387823933L ^ var1));
            case 3:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(18397, 8726066213499070754L ^ var1));
            case 4:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(2535, 7265312658513438483L ^ var1));
            case 5:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(8099, 7622387637905764694L ^ var1));
            case 6:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(25891, 1128567922910153695L ^ var1));
            case 7:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(21869, 3725561897916005267L ^ var1));
            case 8:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(17352, 1575755958636113202L ^ var1));
            case 9:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(28689, 2705042358921879270L ^ var1));
            case 10:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(14495, 8107437294987351657L ^ var1));
            case 11:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(23506, 2539654659959780651L ^ var1));
            case 12:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(29798, 1557707719156128404L ^ var1));
            case 13:
               return new Color(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"m">(29732, 2774525001565493977L ^ var1));
            default:
               throw new NoWhenBranchMatchedException();
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, -2073706700156056846L, var1
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, long param4, byte param6, float param7, float param8, float param9, float param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1, long var2, int var4) {
      var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var2;
      long var10001 = var2 ^ 46067497004554L;
      int var5 = (int)((var2 ^ 46067497004554L) >>> 48);
      int var6 = (int)((var2 ^ 46067497004554L) << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);

      try {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var5, var1, (char)var6, var4, var7);
         }
      } catch (NoWhenBranchMatchedException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, 6503746406979171211L, var2
         );
      }
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, int var3, int var4) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var5 = var1 ^ 118165475592595L;

      try {
         if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
            this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3, var4, var5);
         }
      } catch (NoWhenBranchMatchedException var7) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var7, -990317690438886517L, var1
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      if (this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl != null) {
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      }
   }

   @NotNull
   public final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull List param1,
      long param2,
      @NotNull String param4,
      @NotNull Set param5,
      @NotNull String param6,
      @NotNull IntRange param7,
      @NotNull me.octo.client.gui.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var11 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 53751143753314L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var14 = 1; var14 < 8; var14++) {
         var10003[var14] = (byte)(var11 << var14 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[25];
      int var18 = 0;
      String var17 = "\u001c%\u0092\u0014~m\u000b©b\u009eqùã<½óƸ\u008a\u001fÈA_µ\r\u0099Dy¿¦\nB¥Ù&*z\u001eã§\u008d·Ü\u001b\u0080]\u0089\u000b\u0011L\u008c&ówËÈö.8è\u0081\u0089\u0018ßÓ<¢¢CÙ\tºãl\u0098\u009aë\u0088v\u0000\u0098Ê.W¢kF,ßîZ¦\u0016}¬Ôçà§ï0§^<§>EN\u009c\u00151ÒDôY\u0017ä\u0092\u001d%1Á]\u009fÇ6ö>l1øo\u0081KñÝ¶è[\u001b4·\u007f\u0006\u008b£æ\u0091b\u0005%\u0091}ë\u0080'Df±\u0085Î(\u0016%\u0096M;3^ï;,\u0089ùòþs0\u0016-Ç¯VT\u0090¸\u009f\tÔ£\u0007u¶\u001aÚ8N\u008a±¶QW\u0095öñ#½\u0097N7\u000b\u00ad\u0007`\u0088ÙÃ¬N\u0010óíª1k\u0090)\u001c ÓuÈ\u0019©N¡öÙLè_-É\u0014ÖúY®;×ÆF®,K¹5öOkéTJp\u0006Á¯uB}J\u0010²Ó\u008eÒj\u000e^,\u0003\u008f\"\r\u0005'¿`\u0091øJT;xZ¹\u0095\\º\u008a\u0011@(é»È-\u0004¸s\u0019-Ú»\u009aÅ\u0090e-»2}R\u001b¶Î}]¼#¶ñTÒ$À8a\"[©àÈ;½\u0098àì©\u009a\u0007Wü\u0083«h¯Rb\u0006\u0081r\u0016\u007f3·\u0007\u009e\u009f\u0080áÁ\u0094pº~5]âÔ\u008aR\"\bl\u00068\u0017JÓá\u009e¿\u0002Ï´uD÷\u008fa\u007f]\bÍ³;×ÌÈà{sôU\u0007TW°ÁPþS\u0013ÒØûãkm\u0001\u0089b×G\u0083<\u0007<÷Á\u001d¸q\u0007\u008fÉ÷êap\u0089Zò\u0006\u0005\u0094\u009d\u0018àLdNÀ¬Y]%\u009aÛ\u001c\u009aC\bH2\u0088P,\r\u008e H\u0010ö\u0082Bæ\u009a²8\u0080ù\u0019~\u001a¬FJ3\u0018ë8}\u0018\u008b\u0096f\u0095-\u001dÑ\u0083o¼ hÜ¤\u0019®ÐV[½ `h\\ëz\u0090Ï\u00ad\u0088h\u0090\u0012|Í\u009fÌÒF0\u0096DbãrÃ\u0006#\u0005îé/ü\u0018×öçÂn:\u000f:õbJ\u0091\u0095³.8ó:ÃÄ-\u0004Âl % \u009afWÞ\u001cØ£{\u008fÝ0M\u0091\fÙâÇã¤H[\t[\u009e;ßmÆl \u0010Óæþ\u0016Ã\u0003X\u0083¦£§\u0018\u0011\báª Í\u0086¸Û\u0019\u009bJ^\u0081î¼æa\u008c¥é9\u008eÀ64å\u0096zx\u0092¿} ¨!u\u0010%²+\u0087?ã¤°]\u0010ßo\t\u0018\u0090© Æ\u001d\u0082í\u000fUú\u008f\u008d\u0097{ØLúû\u0084\u001c\u0016÷jQ|ûÓ]\u009dÀÏ\n\u009fåy \u008b\u0096¼$\u0000,yàyÿäÊ.Þ\u000fD!v©ó\u008b`\u0080Ö\u0096\u000b\u008a.\u0096xÔ]\u0010\u0019K\u008b\u0010µÝ>V99ù\u001a\u0019Éù\u0082 \u0001÷\u0006#HÓÃ\u0015\u0012®F`^\u0081W³±\u0011\u0010\nð4\u008cB.Æ/¦µ 8\"\u0010ë1µMå\u008cp6]×\u001bÓ/÷[\u008eƠ\u0002G#|4føÆfOz\u0006®ù\u000eÏ÷é!\u0081t\u0003bÍr\u009dû]Lüjb÷ýá§{D\\Xd¥\u000eÌËx°\u0004\u001bLÕ\u001aÿ\u0096Pç\u0019Ú§¥ålMÂðB@%\u0098é£0Ê\u0003\u008a\u008e\b\u0014`ár`T\u0080\u0095\u009c\u0000wgþþ!¦\rIX\u0011uª¸\u009eW\u0005JU\u008d¬}t|¶9 \u0000öÃuüÂÀP\u008ep\u0095VÅ\u000f \u009b.±T^ObÎ\u0013\u009c*l¼b\u008aìEÇÜ\u009b>\" p\u001d#½Vh¬}\u0099\u0002\u0001!\u0088þÛ6\u0090\u009añ\u0090\u009eXÛ\u0099\u0002jÄ,ÄlDS\u008d-òPM=\u007f¡\u0083¶c±\u0080v\\6Õ+\u0000\u0082ª\u00ad²é\u00052<Õ@\u0098\u0005ÐP\u0002\u0091V³½Ë\u007f\u008cV\u009f:ìO\u0010oÛÎ\u0092Ù\u0011Ü£ºíÉ\u0017ùéìr¼J\u0010Eöª\u009cu6¥\u0083Å5»xÓº\rT\u0086:¹\u000eIë¿+÷È¢f\u000b\u0012\u0017\u008f\u007f®öävÓ\"\tµkÕ®gbèÆ\u001e;4%I\t\u0012dY²þ\u009d/\tèÖQÝ\u001b\u0003\fO©bI\u0019\u0004A¿\u0087 ó.\u0011&Oðf\u0001\"±®Hë\u000b\u009aÎdV\u0015Ö¾)G»½º+ÏÊ{\u009bH\u00adÈ\u0013ìª¬õ+q\u0004¸gÄ°?\u0090T\u0013Ú\bÔ\u0083\u007fAïéL&\u008c\u0013\u0011¬x)´\u009d\u009c¸a\u0091\u0096«\u0088\u000fä»Ø\u008c¢\u000f\u0006eE¢\f_\u0010\u0093\fd\u009aSõy÷Stz\rKj{Ã\u0010J\u0085î\u0006Òj¿ûÇ\u0013ZgÔ\u0084\u0082<\u0010\u0088Ä^ô\u0000+tþÆ§Ê(\u008c\u0098 s\u0018\u0080\u0010 þ.¦÷àwhóJ\u0011\u008f[É06C\u0012Ð,è$ \u0003\rw!Æ#\u0001$îÈN½²\u0011Z\b\bêI[t»\u007fÈ!³ùiº²e!\u0010n['ï\u0082\u0004\u008dò%Iy$åP¦#";
      int var19 = "\u001c%\u0092\u0014~m\u000b©b\u009eqùã<½óƸ\u008a\u001fÈA_µ\r\u0099Dy¿¦\nB¥Ù&*z\u001eã§\u008d·Ü\u001b\u0080]\u0089\u000b\u0011L\u008c&ówËÈö.8è\u0081\u0089\u0018ßÓ<¢¢CÙ\tºãl\u0098\u009aë\u0088v\u0000\u0098Ê.W¢kF,ßîZ¦\u0016}¬Ôçà§ï0§^<§>EN\u009c\u00151ÒDôY\u0017ä\u0092\u001d%1Á]\u009fÇ6ö>l1øo\u0081KñÝ¶è[\u001b4·\u007f\u0006\u008b£æ\u0091b\u0005%\u0091}ë\u0080'Df±\u0085Î(\u0016%\u0096M;3^ï;,\u0089ùòþs0\u0016-Ç¯VT\u0090¸\u009f\tÔ£\u0007u¶\u001aÚ8N\u008a±¶QW\u0095öñ#½\u0097N7\u000b\u00ad\u0007`\u0088ÙÃ¬N\u0010óíª1k\u0090)\u001c ÓuÈ\u0019©N¡öÙLè_-É\u0014ÖúY®;×ÆF®,K¹5öOkéTJp\u0006Á¯uB}J\u0010²Ó\u008eÒj\u000e^,\u0003\u008f\"\r\u0005'¿`\u0091øJT;xZ¹\u0095\\º\u008a\u0011@(é»È-\u0004¸s\u0019-Ú»\u009aÅ\u0090e-»2}R\u001b¶Î}]¼#¶ñTÒ$À8a\"[©àÈ;½\u0098àì©\u009a\u0007Wü\u0083«h¯Rb\u0006\u0081r\u0016\u007f3·\u0007\u009e\u009f\u0080áÁ\u0094pº~5]âÔ\u008aR\"\bl\u00068\u0017JÓá\u009e¿\u0002Ï´uD÷\u008fa\u007f]\bÍ³;×ÌÈà{sôU\u0007TW°ÁPþS\u0013ÒØûãkm\u0001\u0089b×G\u0083<\u0007<÷Á\u001d¸q\u0007\u008fÉ÷êap\u0089Zò\u0006\u0005\u0094\u009d\u0018àLdNÀ¬Y]%\u009aÛ\u001c\u009aC\bH2\u0088P,\r\u008e H\u0010ö\u0082Bæ\u009a²8\u0080ù\u0019~\u001a¬FJ3\u0018ë8}\u0018\u008b\u0096f\u0095-\u001dÑ\u0083o¼ hÜ¤\u0019®ÐV[½ `h\\ëz\u0090Ï\u00ad\u0088h\u0090\u0012|Í\u009fÌÒF0\u0096DbãrÃ\u0006#\u0005îé/ü\u0018×öçÂn:\u000f:õbJ\u0091\u0095³.8ó:ÃÄ-\u0004Âl % \u009afWÞ\u001cØ£{\u008fÝ0M\u0091\fÙâÇã¤H[\t[\u009e;ßmÆl \u0010Óæþ\u0016Ã\u0003X\u0083¦£§\u0018\u0011\báª Í\u0086¸Û\u0019\u009bJ^\u0081î¼æa\u008c¥é9\u008eÀ64å\u0096zx\u0092¿} ¨!u\u0010%²+\u0087?ã¤°]\u0010ßo\t\u0018\u0090© Æ\u001d\u0082í\u000fUú\u008f\u008d\u0097{ØLúû\u0084\u001c\u0016÷jQ|ûÓ]\u009dÀÏ\n\u009fåy \u008b\u0096¼$\u0000,yàyÿäÊ.Þ\u000fD!v©ó\u008b`\u0080Ö\u0096\u000b\u008a.\u0096xÔ]\u0010\u0019K\u008b\u0010µÝ>V99ù\u001a\u0019Éù\u0082 \u0001÷\u0006#HÓÃ\u0015\u0012®F`^\u0081W³±\u0011\u0010\nð4\u008cB.Æ/¦µ 8\"\u0010ë1µMå\u008cp6]×\u001bÓ/÷[\u008eƠ\u0002G#|4føÆfOz\u0006®ù\u000eÏ÷é!\u0081t\u0003bÍr\u009dû]Lüjb÷ýá§{D\\Xd¥\u000eÌËx°\u0004\u001bLÕ\u001aÿ\u0096Pç\u0019Ú§¥ålMÂðB@%\u0098é£0Ê\u0003\u008a\u008e\b\u0014`ár`T\u0080\u0095\u009c\u0000wgþþ!¦\rIX\u0011uª¸\u009eW\u0005JU\u008d¬}t|¶9 \u0000öÃuüÂÀP\u008ep\u0095VÅ\u000f \u009b.±T^ObÎ\u0013\u009c*l¼b\u008aìEÇÜ\u009b>\" p\u001d#½Vh¬}\u0099\u0002\u0001!\u0088þÛ6\u0090\u009añ\u0090\u009eXÛ\u0099\u0002jÄ,ÄlDS\u008d-òPM=\u007f¡\u0083¶c±\u0080v\\6Õ+\u0000\u0082ª\u00ad²é\u00052<Õ@\u0098\u0005ÐP\u0002\u0091V³½Ë\u007f\u008cV\u009f:ìO\u0010oÛÎ\u0092Ù\u0011Ü£ºíÉ\u0017ùéìr¼J\u0010Eöª\u009cu6¥\u0083Å5»xÓº\rT\u0086:¹\u000eIë¿+÷È¢f\u000b\u0012\u0017\u008f\u007f®öävÓ\"\tµkÕ®gbèÆ\u001e;4%I\t\u0012dY²þ\u009d/\tèÖQÝ\u001b\u0003\fO©bI\u0019\u0004A¿\u0087 ó.\u0011&Oðf\u0001\"±®Hë\u000b\u009aÎdV\u0015Ö¾)G»½º+ÏÊ{\u009bH\u00adÈ\u0013ìª¬õ+q\u0004¸gÄ°?\u0090T\u0013Ú\bÔ\u0083\u007fAïéL&\u008c\u0013\u0011¬x)´\u009d\u009c¸a\u0091\u0096«\u0088\u000fä»Ø\u008c¢\u000f\u0006eE¢\f_\u0010\u0093\fd\u009aSõy÷Stz\rKj{Ã\u0010J\u0085î\u0006Òj¿ûÇ\u0013ZgÔ\u0084\u0082<\u0010\u0088Ä^ô\u0000+tþÆ§Ê(\u008c\u0098 s\u0018\u0080\u0010 þ.¦÷àwhóJ\u0011\u008f[É06C\u0012Ð,è$ \u0003\rw!Æ#\u0001$îÈN½²\u0011Z\b\bêI[t»\u007fÈ!³ùiº²e!\u0010n['ï\u0082\u0004\u008dò%Iy$åP¦#"
         .length();
      char var16 = '\u0010';
      int var15 = -1;

      while (true) {
         byte[] var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
         String var43 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var21).intern();
         byte var10001 = -1;
         var20[var18++] = var43;
         if ((var15 += var16) >= var19) {
            var17 = "È\u009a(OQTf¶\u0092W\u001eèÆ)Nt\u0010\u0080Ö\u0095³\u000b¯aDÞ:ÂfÄ\u0097Q¬";
            var19 = "È\u009a(OQTf¶\u0092W\u001eèÆ)Nt\u0010\u0080Ö\u0095³\u000b¯aDÞ:ÂfÄ\u0097Q¬".length();
            var16 = '\u0010';
            var15 = -1;

            while (true) {
               var21 = var13.doFinal(var17.substring(++var15, var15 + var16).getBytes("ISO-8859-1"));
               String var45 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var21).intern();
               int var37 = 0;
               var20[var18++] = var45;
               if ((var15 += var16) >= var19) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var20;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[25];
                  lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var11 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var11 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[13];
                  int var3 = 0;
                  String var4 = "\u0082ô\u009c\u0017<<#Ò\u00adèêÇ÷\"=Á2ÖéÓ\u0006\u0094úÉ¸Â\u0091ä\u0000\u001c6c\u0096+F|\u008f¡\u0081k9õ{X;\u0082Àù\nZë×g²AÀ\u0091}ñÄ\u001dQ¿§ÿl;*ÉÎ\u0095ïÆy0¸\u009b\u001d\u0012Å\"@:(\u0081[¬o";
                  int var5 = "\u0082ô\u009c\u0017<<#Ò\u00adèêÇ÷\"=Á2ÖéÓ\u0006\u0094úÉ¸Â\u0091ä\u0000\u001c6c\u0096+F|\u008f¡\u0081k9õ{X;\u0082Àù\nZë×g²AÀ\u0091}ñÄ\u001dQ¿§ÿl;*ÉÎ\u0095ïÆy0¸\u009b\u001d\u0012Å\"@:(\u0081[¬o"
                     .length();
                  byte var2 = 0;

                  do {
                     var37 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                     var37 = var3++;
                     long var8 = (var7[0] & 255L) << 56
                        | (var7[1] & 255L) << 48
                        | (var7[2] & 255L) << 40
                        | (var7[3] & 255L) << 32
                        | (var7[4] & 255L) << 24
                        | (var7[5] & 255L) << 16
                        | (var7[6] & 255L) << 8
                        | var7[7] & 255L;
                     byte[] var10 = var0.doFinal(
                        new byte[]{
                           (byte)(var8 >>> 56),
                           (byte)(var8 >>> 48),
                           (byte)(var8 >>> 40),
                           (byte)(var8 >>> 32),
                           (byte)(var8 >>> 24),
                           (byte)(var8 >>> 16),
                           (byte)(var8 >>> 8),
                           (byte)var8
                        }
                     );
                     long var10004 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var49 = -1;
                     var6[var37] = var10004;
                  } while (var2 < var5);

                  var4 = "@§$iQyPÕJkèÏ\u0096\u008d¬\u0015";
                  var5 = "@§$iQyPÕJkèÏ\u0096\u008d¬\u0015".length();
                  var2 = 0;

                  do {
                     int var41 = var2;
                     var2 += 8;
                     byte[] var25 = var4.substring(var41, var2).getBytes("ISO-8859-1");
                     var41 = var3++;
                     long var26 = (var25[0] & 255L) << 56
                        | (var25[1] & 255L) << 48
                        | (var25[2] & 255L) << 40
                        | (var25[3] & 255L) << 32
                        | (var25[4] & 255L) << 24
                        | (var25[5] & 255L) << 16
                        | (var25[6] & 255L) << 8
                        | var25[7] & 255L;
                     byte[] var27 = var0.doFinal(
                        new byte[]{
                           (byte)(var26 >>> 56),
                           (byte)(var26 >>> 48),
                           (byte)(var26 >>> 40),
                           (byte)(var26 >>> 32),
                           (byte)(var26 >>> 24),
                           (byte)(var26 >>> 16),
                           (byte)(var26 >>> 8),
                           (byte)var26
                        }
                     );
                     long var51 = (var27[0] & 255L) << 56
                        | (var27[1] & 255L) << 48
                        | (var27[2] & 255L) << 40
                        | (var27[3] & 255L) << 32
                        | (var27[4] & 255L) << 24
                        | (var27[5] & 255L) << 16
                        | (var27[6] & 255L) << 8
                        | var27[7] & 255L;
                     boolean var50 = false;
                     var6[var41] = var51;
                  } while (var2 < var5);

                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var6;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new Integer[13];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  return;
               }

               var16 = var17.charAt(var15);
            }
         }

         var16 = var17.charAt(var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1313;
      if (llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/gui/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5].getBytes("ISO-8859-1");
         llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5];
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
            "me/octo/client/gui/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19475;
      if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/gui/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3] = var15;
      }

      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var3];
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
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
            "me/octo/client/gui/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }
   }
}
