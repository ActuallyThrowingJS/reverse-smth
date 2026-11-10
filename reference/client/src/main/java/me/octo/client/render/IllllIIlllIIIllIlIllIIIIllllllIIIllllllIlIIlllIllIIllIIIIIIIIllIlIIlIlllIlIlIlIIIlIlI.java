package me.octo.client.render;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.renderer.MappableRingBuffer;
import org.jetbrains.annotations.NotNull;

public enum IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
   DISTANCE_FADE,
   HAND_ITEM_LIGHTMAP,
   JFA_PARAMS,
   MOTION_BLUR_PARAMS;

   @NotNull
   private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 76218073430920L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(String var3, int var4) {
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var4;
   }

   @NotNull
   public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   @NotNull
   public final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      String var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      int var10001 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(6273, 162700486481323828L ^ var1)
         + var10000
         + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(14217, 5955119624965752885L ^ var1)
         + var10001
         + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(16814, 8523438972475407892L ^ var1);
   }

   @JvmOverloads
   @NotNull
   public final GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Supplier var3) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var4 = var1 ^ 65202958346164L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(26619, 6870300000818389936L ^ var1)
      );
      GpuBufferSlice var10000 = me.octo.client.render.util.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var4
         )
         .createBuffer(var3, 130, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
         .slice();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(20572, 6304339644496466973L ^ var1)
      );
      return var10000;
   }

   @JvmOverloads
   @NotNull
   public final MappableRingBuffer llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short var1, @NotNull Supplier var2, short var3, int var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(25547, 6444517487889123468L ^ var5)
      );
      return new MappableRingBuffer(var2, 130, this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
   }

   @NotNull
   public static EnumEntries<IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   @JvmOverloads
   @NotNull
   public final GpuBufferSlice lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var10001 = var1 ^ 17709113248968L;
      int var3 = (int)((var1 ^ 17709113248968L) >>> 32);
      int var4 = (int)((var1 ^ 17709113248968L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$da76b8bfb4ba42f4(
         this, null, 1, var3, null, var4, (short)var5
      );
   }

   @JvmOverloads
   @NotNull
   public final MappableRingBuffer IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var3 = var1 ^ 140613224080905L;
      return llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(this, null, var3, 1, null);
   }

   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 84921459225834L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "\n\u0084Ð´,Â\u0012$h)ÌÉÓ\u0094±\bVßzDx/§\u0090\u0093h·\u0018\u0016U/Á\u0089[\u0016\u001eÏ\u0084¥\"¤\u009aû\u0090\u001eÂp\u0007D\u0001úÃf^ï¼\u008d\u0018.4³\u0003Z=6;ÖâHº\u001cj\u0085ý<IçÿiÜ\u0017÷À<Î=\u0080\u001bòÜ|HÕ\u0082\u001dÌïmUÉ\u009a\u0082Ë\u000b¦ñ\u008c\u0086Ü\u0003\u0007»ú\u0014«Ñda\u0092A!¨\u007fZÈf4\u009bÆx\fS\u0016ªî\u000e\u0096\n\b6\u0014\u000e§\u0016\u0096Þüm´X÷1\u0010U|Q«¡\u009eL½À³,Yv\u0007»ú\u0018×³\u0099ª\u0092\"zÅ\\É\u0084\u0017d\u0016\u0017µô\u009a\u0083\u0001\u0087\u007fÔ\u0083\u0018\u0015|\u001c\b\u0089æ\u0000JfØOJ2×ÄIy18\u008d\u0098M$\u0006\u0088\f¯j}<³eÉ¼da\u0011\u0095¹<\u009e\u001a\u001b\u001e\u008b¤\u000b6¬\u0091DYÿ:[wìëëmÇA?å\u0000-R\\¸ðÀ²Ùq3v_\u0096\u000bÞ]\u0080\u0003J\u0093\u00967Ç+ùRãºH\u0085ÃM\u00adEbK\u0011ÅôÆ>\u0092Î¾Ûm÷\u00886rTÙNÐÄ\u0099znÆJ§þ\u0086\u0019©\u0006òk\u000e@Ó®\u008cß\u001f(å\u0003ñ»\u001fIvZQQIÈ®$\u0015jÑø\u0016a U\u000bx=]\u0086óar-À\u0003·ßÑ\tG!½ÝgßW`\u000eÿð¥\u0000\u0005\u000f\u0086 SË,Â§«{Ðm\nÙ´|\u0017aHÀ%(æCí'\u009d\u0005s«\u0003Gü±`\u0010ßÌ¹vV/J8WÆ\u009c\u0092 àê¿\u0018\u001d\fÛã\u0080:¼ÏIÑA³úÃúj½ó\u000b\"êþ|§0z\u001fW¾ª¢\u0013ÛP\u0013\u00957\u0003ÍW´¿éá´ÿ)Èk$S\u000f°ÒÆÈ(\n/Î\u00909þûEù[Å\u0089ì§îñ(åRÖ_\u009fä\u0092å1\u008e*OaÍMÛÂÖ1$?/wu¶ÎÍ0í4ý7X\"¨lÐ\u0081Äa\u0018¬¿\u0087\u007fZ|R\u0001\u0083¶\u000fÁ\u008bWO\u0092Ï(ª\u0095ùo¢Í\u0018I\u0003ËX|]\u0094R\u0098Qº\u001b)Êð%ý\\>E\u0091ÿTå\u0018X\u009c\u009fwy\u000b+îÂÍû>\u00021ÇÓãöRb¦$í9";
      int var6 = "\n\u0084Ð´,Â\u0012$h)ÌÉÓ\u0094±\bVßzDx/§\u0090\u0093h·\u0018\u0016U/Á\u0089[\u0016\u001eÏ\u0084¥\"¤\u009aû\u0090\u001eÂp\u0007D\u0001úÃf^ï¼\u008d\u0018.4³\u0003Z=6;ÖâHº\u001cj\u0085ý<IçÿiÜ\u0017÷À<Î=\u0080\u001bòÜ|HÕ\u0082\u001dÌïmUÉ\u009a\u0082Ë\u000b¦ñ\u008c\u0086Ü\u0003\u0007»ú\u0014«Ñda\u0092A!¨\u007fZÈf4\u009bÆx\fS\u0016ªî\u000e\u0096\n\b6\u0014\u000e§\u0016\u0096Þüm´X÷1\u0010U|Q«¡\u009eL½À³,Yv\u0007»ú\u0018×³\u0099ª\u0092\"zÅ\\É\u0084\u0017d\u0016\u0017µô\u009a\u0083\u0001\u0087\u007fÔ\u0083\u0018\u0015|\u001c\b\u0089æ\u0000JfØOJ2×ÄIy18\u008d\u0098M$\u0006\u0088\f¯j}<³eÉ¼da\u0011\u0095¹<\u009e\u001a\u001b\u001e\u008b¤\u000b6¬\u0091DYÿ:[wìëëmÇA?å\u0000-R\\¸ðÀ²Ùq3v_\u0096\u000bÞ]\u0080\u0003J\u0093\u00967Ç+ùRãºH\u0085ÃM\u00adEbK\u0011ÅôÆ>\u0092Î¾Ûm÷\u00886rTÙNÐÄ\u0099znÆJ§þ\u0086\u0019©\u0006òk\u000e@Ó®\u008cß\u001f(å\u0003ñ»\u001fIvZQQIÈ®$\u0015jÑø\u0016a U\u000bx=]\u0086óar-À\u0003·ßÑ\tG!½ÝgßW`\u000eÿð¥\u0000\u0005\u000f\u0086 SË,Â§«{Ðm\nÙ´|\u0017aHÀ%(æCí'\u009d\u0005s«\u0003Gü±`\u0010ßÌ¹vV/J8WÆ\u009c\u0092 àê¿\u0018\u001d\fÛã\u0080:¼ÏIÑA³úÃúj½ó\u000b\"êþ|§0z\u001fW¾ª¢\u0013ÛP\u0013\u00957\u0003ÍW´¿éá´ÿ)Èk$S\u000f°ÒÆÈ(\n/Î\u00909þûEù[Å\u0089ì§îñ(åRÖ_\u009fä\u0092å1\u008e*OaÍMÛÂÖ1$?/wu¶ÎÍ0í4ý7X\"¨lÐ\u0081Äa\u0018¬¿\u0087\u007fZ|R\u0001\u0083¶\u000fÁ\u008bWO\u0092Ï(ª\u0095ùo¢Í\u0018I\u0003ËX|]\u0094R\u0098Qº\u001b)Êð%ý\\>E\u0091ÿTå\u0018X\u009c\u009fwy\u000b+îÂÍû>\u00021ÇÓãöRb¦$í9"
         .length();
      char var3 = '\u0098';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var103 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var103;
         if ((var2 += var3) >= var6) {
            var4 = " \rfwv½Å\u0018Á=\tA(è\u0091=6 \u0092F Ù7\u0007\u0087\u001e5TÜ\u0004à¬«3\u0010å¸_\u0097p\u0018é\"\u0092\u0005\u008då´î\u0019¡.\b\u0010¾6°A\u001el\u0017¤õ6\u0010";
            var6 = " \rfwv½Å\u0018Á=\tA(è\u0091=6 \u0092F Ù7\u0007\u0087\u001e5TÜ\u0004à¬«3\u0010å¸_\u0097p\u0018é\"\u0092\u0005\u008då´î\u0019¡.\b\u0010¾6°A\u001el\u0017¤õ6\u0010"
               .length();
            var3 = '(';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var105 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var101 = false;
               var7[var5++] = var105;
               if ((var2 += var3) >= var6) {
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[16];
                  boolean var11 = false;
                  Std140SizeCalculator var12 = me.octo.client.render.util.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
                     new Std140SizeCalculator()
                  );
                  String var27 = "u_DistanceFade";
                  byte var26 = 0;
                  String var25 = "DISTANCE_FADE";
                  boolean var14 = false;
                  boolean var16 = false;
                  var12.putIVec4();
                  Unit var28 = Unit.INSTANCE;
                  boolean var17 = false;
                  int var29 = var12.get();
                  DISTANCE_FADE = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var27, var29);
                  var11 = false;
                  var12 = me.octo.client.render.util.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
                     new Std140SizeCalculator()
                  );
                  var27 = "ItemChamsData";
                  var26 = 1;
                  var25 = "HAND_ITEM_LIGHTMAP";
                  var14 = false;
                  boolean var22 = false;
                  var12.putInt();
                  Unit var21 = Unit.INSTANCE;
                  boolean var23 = false;
                  var12.putFloat();
                  Unit var84 = Unit.INSTANCE;
                  var23 = false;
                  Unit var20 = Unit.INSTANCE;
                  var22 = false;
                  var12.putIVec4();
                  var21 = Unit.INSTANCE;
                  var22 = false;
                  Unit var19 = Unit.INSTANCE;
                  boolean var82 = false;
                  var12.putFloat();
                  var20 = Unit.INSTANCE;
                  boolean var83 = false;
                  Unit var18 = Unit.INSTANCE;
                  boolean var79 = false;
                  var12.putIVec4();
                  var19 = Unit.INSTANCE;
                  boolean var80 = false;
                  Unit var64 = Unit.INSTANCE;
                  boolean var75 = false;
                  var12.putFloat();
                  var18 = Unit.INSTANCE;
                  boolean var76 = false;
                  Unit var61 = Unit.INSTANCE;
                  boolean var70 = false;
                  var12.putInt();
                  Unit var65 = Unit.INSTANCE;
                  boolean var71 = false;
                  var28 = Unit.INSTANCE;
                  boolean var24 = false;
                  int var33 = var12.get();
                  HAND_ITEM_LIGHTMAP = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var27, var33);
                  var11 = false;
                  var12 = me.octo.client.render.util.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
                     new Std140SizeCalculator()
                  );
                  var27 = "u_JfaParams";
                  var26 = 2;
                  var25 = "JFA_PARAMS";
                  var14 = false;
                  var16 = false;
                  var12.putIVec4();
                  var28 = Unit.INSTANCE;
                  var17 = false;
                  int var37 = var12.get();
                  JFA_PARAMS = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var27, var37);
                  var11 = false;
                  var12 = me.octo.client.render.util.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(
                     new Std140SizeCalculator()
                  );
                  var27 = "MotionBlurUbo";
                  var26 = 3;
                  var25 = "MOTION_BLUR_PARAMS";
                  var14 = false;
                  var17 = false;
                  var12.putMat4f();
                  Unit var63 = Unit.INSTANCE;
                  boolean var72 = false;
                  var12.putIVec4();
                  Unit var68 = Unit.INSTANCE;
                  boolean var73 = false;
                  var28 = Unit.INSTANCE;
                  boolean var77 = false;
                  int var41 = var12.get();
                  MOTION_BLUR_PARAMS = new IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var27, var41);
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = EnumEntriesKt.enumEntries(
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
                  );
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static UnsupportedOperationException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      UnsupportedOperationException var0
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19008;
      if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/render/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
         IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
            "me/octo/client/render/IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static GpuBufferSlice IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$da76b8bfb4ba42f4(
      IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var0,
      Supplier var1,
      int var2,
      int var3,
      Object var4,
      int var5,
      short var6
   ) {
      byte var14 = 1;
      long var7 = ((long)var3 << 32 | (long)var5 << 48 >>> 32 | (long)var6 << 48 >>> 48)
         ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var9 = var7 ^ 111987896402371L;
      long var11 = var7 ^ 12877366098485L;

      try {
         if (var4 != null) {
            throw new UnsupportedOperationException(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(23073, 6241637681753826343L ^ var7)
            );
         }
      } catch (UnsupportedOperationException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, 4032462485827613427L, var7
         );
      }

      if ((var14 & 1) != 0) {
         var1 = var0::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII;
      }

      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var1);
   }
}
