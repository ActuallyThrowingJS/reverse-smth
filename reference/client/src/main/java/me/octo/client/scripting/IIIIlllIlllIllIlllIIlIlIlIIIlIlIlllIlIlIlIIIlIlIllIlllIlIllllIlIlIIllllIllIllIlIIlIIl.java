package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll;
import me.octo.client.modules.impl.macros.IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI;
import me.octo.client.modules.impl.macros.IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.modules.impl.macros.llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll;
import me.octo.client.modules.impl.macros.llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII;
import net.minecraft.core.BlockPos;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.HostAccess.Export;
import org.graalvm.polyglot.proxy.ProxyObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl implements ProxyObject {
   @NotNull
   public static IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI engine;
   @NotNull
   private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static List<String> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 16977122646630L;
   private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

   public IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl(
      @NotNull IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI engineArg
   ) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 118320423811335L;
      Intrinsics.checkNotNullParameter(engineArg, "engine");
      super();
      this.engine = engineArg;
   }

   @Export
   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.engine.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   @Export
   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
      long var3 = var1 ^ 68680896709245L;
      return this.engine.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var3);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void start() {
      long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 90959248058411L;
      long var3 = var1 ^ 15294233733279L;
      this.engine.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, null);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void start(@Nullable Value var1) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 39028178668587L;
      long var4 = var2 ^ 136528861645983L;
      this.engine.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var1);
   }

   @me.octo.client.utils.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll
   @Export
   public final void stop() {
      long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 134004938899391L;
      long var3 = var1 ^ 91770735785043L;
      this.engine.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var3);
   }

   @Nullable
   @Override
   public Object getMember(@NotNull String keyArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public Object getMemberKeys() {
      return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   }

   @Override
   public boolean hasMember(@NotNull String keyArg) {
      long var2 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 30638118236116L;
      Intrinsics.checkNotNullParameter(keyArg, "key");
      return ArraysKt.contains(IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl, keyArg);
   }

   @Override
   public void putMember(@NotNull String keyArg, @NotNull Value valueArg) {
      long var3 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 108099761901113L;
      Intrinsics.checkNotNullParameter(keyArg, "key");
      Intrinsics.checkNotNullParameter(valueArg, "value");
      throw new UnsupportedOperationException("MiningBot." + keyArg + " is read-only");
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var0, short var1, long var2, Value[] var4
   ) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var7 = var5 ^ 5018357657876L;
      String var9 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6256968631722937529L, var5
      );

      Value var17;
      IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI var10000;
      label36: {
         label41: {
            label33:
            try {
               var10000 = var0.engine;
               if (var9 == null) {
                  Intrinsics.checkNotNull(var4);
                  var17 = (Value)ArraysKt.firstOrNull(var4);
                  if (var17 != null) {
                     break label33;
                  }
               }
               break label41;
            } catch (UnsupportedOperationException var16) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var16, -6246074989519794929L, var5
               );
            }

            Value var10 = var17;
            IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI var13 = var10000;
            boolean var12 = false;
            boolean var14 = var10.isNull();

            try {
               var10000 = var13;
               if (!var14) {
                  var17 = var10;
                  break label36;
               }
            } catch (UnsupportedOperationException var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, -6246074989519794929L, var5
               );
            }

            var17 = null;
            break label36;
         }

         var17 = null;
      }

      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var17);
      return Unit.INSTANCE;
   }

   private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl var0, Value[] var1
   ) {
      var0.stop();
      return Unit.INSTANCE;
   }

   static {
      long var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 18791217298553L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[24];
      int var5 = 0;
      String var4 = "&>RÜ>8Æº:÷Í4÷|P\u0085å\u001a\u0093\u0087º¢\u008eé\u0018\u0097+È¯ÁF\u001b\u0099ÂLÐx-ÍOÙ>vZ¾\u001a\u0080°\u0011\u0018*øú++PmhW\u009aß¶»óC\u0004Xåx\u008ek\u0088\u007f¿\u0010Í G\u0088\u0007\u0080éU¼:¾\u0091\r\u00122¾\u0010í-È\u0090\nì³õÀÅ¤Î\u0012+u/\u0010/µZ¬D0'\u001d\u0091\u0017Ö]8gü§\u0010MSÉÌÊá'êö¿ß\u0090\u0001\u0005\u008d?\u0010\u0098u)n¤Ì\u0006O(Åà\u009f½¾go \u009fUSÛ³\u001e\u009aù¿¦NÚ\u0085\u0085\u0007Ìq¦õz:ð\u000bY\u0092m¿\f«(ÅF\u0010\u0012ó6ejðjo\u0089\u0003T30\u007fq'\u0010òÆô\u0005wR?¤D}¥Âa +þ fÉ]\u009b=WRúed\u008a$Y½\u0094Ên\u0080ðÆúÚáúï\u000bêC×s«\u0098\u0010ð3\u0098\u009f®X/\u009edOx\n´ýég\u0010L\u0007ôc6Nõ2ÙÀÈÞ\u0013tÒß (Ó\u009a\u0006óUè\u008eË>0ÊA\u009e\u0089\u009c6\u008e\u0019¬ÎV\ré\fÁp\u0012\u0017\u001b¿{\u0010\u0085\u0002\u0081T¥^Ï\u008dA\u008e×:õiÎC\u0010~=¿å\u009c\u0082Ëû\u0011\u0012nÚæ¾=#\u0010\u0001\"#\u0015×\u001f\u0084]\u0098\u0083\u007fxå\u0086Òü\u0018øµè\u001e\u0091\u0005^\u009d¶Ñ\u0098P8|tÓ\u0083H\u0005\u0089\u008fsïT\u00104\u0094\u009cà\u0092¶c\u0017â\u0090©´\u009ap4±\u0010\"J\u0010 \\¦\"\u0091&\u001f°Â\u0083l;\u0016\u00102L«ûÃªb\u0015\u0006\u0097\u009a \u0000×\u009a\u0095";
      int var6 = "&>RÜ>8Æº:÷Í4÷|P\u0085å\u001a\u0093\u0087º¢\u008eé\u0018\u0097+È¯ÁF\u001b\u0099ÂLÐx-ÍOÙ>vZ¾\u001a\u0080°\u0011\u0018*øú++PmhW\u009aß¶»óC\u0004Xåx\u008ek\u0088\u007f¿\u0010Í G\u0088\u0007\u0080éU¼:¾\u0091\r\u00122¾\u0010í-È\u0090\nì³õÀÅ¤Î\u0012+u/\u0010/µZ¬D0'\u001d\u0091\u0017Ö]8gü§\u0010MSÉÌÊá'êö¿ß\u0090\u0001\u0005\u008d?\u0010\u0098u)n¤Ì\u0006O(Åà\u009f½¾go \u009fUSÛ³\u001e\u009aù¿¦NÚ\u0085\u0085\u0007Ìq¦õz:ð\u000bY\u0092m¿\f«(ÅF\u0010\u0012ó6ejðjo\u0089\u0003T30\u007fq'\u0010òÆô\u0005wR?¤D}¥Âa +þ fÉ]\u009b=WRúed\u008a$Y½\u0094Ên\u0080ðÆúÚáúï\u000bêC×s«\u0098\u0010ð3\u0098\u009f®X/\u009edOx\n´ýég\u0010L\u0007ôc6Nõ2ÙÀÈÞ\u0013tÒß (Ó\u009a\u0006óUè\u008eË>0ÊA\u009e\u0089\u009c6\u008e\u0019¬ÎV\ré\fÁp\u0012\u0017\u001b¿{\u0010\u0085\u0002\u0081T¥^Ï\u008dA\u008e×:õiÎC\u0010~=¿å\u009c\u0082Ëû\u0011\u0012nÚæ¾=#\u0010\u0001\"#\u0015×\u001f\u0084]\u0098\u0083\u007fxå\u0086Òü\u0018øµè\u001e\u0091\u0005^\u009d¶Ñ\u0098P8|tÓ\u0083H\u0005\u0089\u008fsïT\u00104\u0094\u009cà\u0092¶c\u0017â\u0090©´\u009ap4±\u0010\"J\u0010 \\¦\"\u0091&\u001f°Â\u0083l;\u0016\u00102L«ûÃªb\u0015\u0006\u0097\u009a \u0000×\u009a\u0095"
         .length();
      char var3 = 24;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var21;
                  if ((var13 += var3) >= var6) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var7;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[24];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     String[] var11 = new String[]{"enabled", "finished", "start", "stop"};
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var11;
                     var11 = new String[]{"mithril", "gemstone", "ore", "oreV2", "tunnel", "cobblestone", "crimson", "endstone", "sand", "obsidian"};
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = CollectionsKt.listOf(var11);
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var21;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "\u00ad+\u001aÖ9^1\u008b\u0092¢Ãø´Û\u0085+ õ~6;:9Ù\u0010P3\u0010\n{^(\"xeD ËK¼g";
                  var6 = "\u00ad+\u001aÖ9^1\u008b\u0092¢Ãø´Û\u0085+ õ~6;:9Ù\u0010P3\u0010\n{^(\"xeD ËK¼g".length();
                  var3 = 24;
                  var13 = -1;
            }

            var15 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4692;
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
            throw new RuntimeException("me/octo/client/scripting/IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl", var10);
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
            "me/octo/client/scripting/IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 39151051301381L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final List<String> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long param1, @NotNull String param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         long param1, String param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var0, me.octo.client.modules.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 86336162163118L;
         return var2.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
      }

      private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         long var0, me.octo.client.modules.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var10001 = var0 ^ 83527338700569L;
         int var3 = (int)((var0 ^ 83527338700569L) >>> 32);
         int var4 = (int)((var0 ^ 83527338700569L) << 32 >>> 48);
         int var5 = (int)(var10001 << 48 >>> 48);
         return var2.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(var3, (short)var4, (char)var5);
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var0, long var1, BlockPos var3
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var4 = var1 ^ 54672239794044L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410113677198401897L ^ var1)
         );
         var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         long var0, me.octo.client.modules.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 30262727811884L;
         var2.IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
         me.octo.client.modules.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 10518117729606L;
         var0.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var3, true);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 99315555761833L;
         return var0.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(var3);
      }

      private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         me.octo.client.modules.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 69547551736216L;
         return var0.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var3);
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var0, long var1, BlockPos var3
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var4 = var1 ^ 12369274428900L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(25272, 2755379132005949211L ^ var1)
         );
         var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(CollectionsKt.listOf(var3), var4);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         me.octo.client.modules.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 139057255154980L;
         var0.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
         me.octo.client.modules.lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 43439997965286L;
         var0.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(true, var3);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var0, me.octo.client.modules.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 92023244131350L;
         return var2.IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(var3);
      }

      private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         long var0, me.octo.client.modules.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 37374251431968L;
         return var2.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var3);
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var0, me.octo.client.modules.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var2, BlockPos var3
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var4 = var0 ^ 126230656816508L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410031252842844066L ^ var0)
         );
         var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(CollectionsKt.listOf(var3), var4);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         long var0, me.octo.client.modules.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 7699231455204L;
         var2.IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
         me.octo.client.modules.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 134847092908750L;
         var0.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var3, true);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll var0
      ) {
         return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll var0, short var1, int var2, short var3, List var4
      ) {
         long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var7 = var5 ^ 29845945316470L;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410137705985625492L ^ var5)
         );
         var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var4);
         return Unit.INSTANCE;
      }

      private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         char var0, short var1, llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll var2, int var3
      ) {
         long var4 = ((long)var0 << 48 | (long)var1 << 48 >>> 16 | (long)var3 << 32 >>> 32)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 91680689875203L;
         var2.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var6);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llllIlIllIlIIIIllIllIllllIIIlIlIIIllIIlIIIIlIlIlIllllIllIlIIlIIIIIlIllIIlIIIIlIIIIlll var0, short var1, int var2, char var3
      ) {
         long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 73667965390519L;
         var0.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var6);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII var0
      ) {
         return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var0, llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII var2, List var3
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var4 = var0 ^ 127854021188112L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410127680901851950L ^ var0)
         );
         var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, null);
         return Unit.INSTANCE;
      }

      private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var10001 = var1 ^ 2091520865763L;
         int var3 = (int)((var1 ^ 2091520865763L) >>> 48);
         int var4 = (int)((var1 ^ 2091520865763L) << 16 >>> 32);
         int var5 = (int)(var10001 << 48 >>> 48);
         var0.IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI((char)var3, var4, (char)var5);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         llllIlIllllIIlllIIIIllIlIIIIIlIIllIlIlIlIlIIllIlIIIlIllIIIllllIIIllIIllllllIIlllIlIII var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var10001 = var1 ^ 29676348681803L;
         int var3 = (int)((var1 ^ 29676348681803L) >>> 32);
         int var4 = (int)((var1 ^ 29676348681803L) << 32 >>> 40);
         int var5 = (int)(var10001 << 56 >>> 56);
         var0.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var3, var4, (byte)var5);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl var0
      ) {
         return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl var0, short var1, short var2, int var3, List var4
      ) {
         long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var7 = var5 ^ 126381575836540L;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410083872481049319L ^ var5)
         );
         var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, null, var7);
         return Unit.INSTANCE;
      }

      private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         long var0, IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 108709993369417L;
         var2.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         IllIllIlIIIIIIIIIIIlllIIlIlllIllIIllIlllIIlIlIIllllIIllIIIllIIIIllIIIllllllIllIlIllIl var0, short var1, short var2, int var3
      ) {
         long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 20549102432302L;
         var0.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var6);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI var0
      ) {
         return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI var0, long var1, List var3
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var4 = var1 ^ 13908104574739L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410034701688960518L ^ var1)
         );
         var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, null);
         return Unit.INSTANCE;
      }

      private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI var0, long var1
      ) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;
         long var3 = var1 ^ 89670385616862L;
         var0.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         long var0, IlIIlllIllIlIIIlIIllIIlllllllIIlIIlIIlIIlllIIllIllIIllIlllIlIIIIIlIlllIIlllIIIllllllI var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 59622140340589L;
         var2.IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(var3);
         return Unit.INSTANCE;
      }

      private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll var0
      ) {
         return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var0, IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll var2, List var3
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var4 = var0 ^ 130971568887540L;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"z">(16954, 4410063767825584867L ^ var0)
         );
         var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var3,
            CollectionsKt.emptyList(),
            null,
            false,
            false,
            true,
            false,
            false,
            var4,
            me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
               .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         );
         return Unit.INSTANCE;
      }

      private static final Unit llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         long var0, IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll var2
      ) {
         var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
         long var3 = var0 ^ 123779072908148L;
         var2.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var3);
         return Unit.INSTANCE;
      }

      private static final Unit IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
         int var0, IIIIlIlIlllllIlllIllIIIIllllllIllllIlIlIllllIlIIlIlIIIlIlIllIIlllIIIIlIIIIIlIIIllIIll var1, byte var2, int var3
      ) {
         long var4 = ((long)var0 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var6 = var4 ^ 81426091356175L;
         var1.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(var6);
         return Unit.INSTANCE;
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 118952495285675L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[23];
         int var7 = 0;
         String var6 = "ªË;¤xÃQË?b\u0095\u0099#ÞÊ\u0088.ÂÝÍã£\u0003¨Ï±o\u0015@\u0000Öòè4'\u008cÃ\u0083²A Ñd@\u0000\u001f9å«ókôñnLmn\u0090Ñ§\u0091DM@Üç®ÈG\u0098Õï\u008a\u0010þµ\u0086g]ap~\u001f\u0001\u008f3\u007f\u0014\u001b=\u0018Åc\u001eä¸¸g=Þüº\u0010\u0005E}Mò*(«>b$½ \\F\u009b+(\u0018\u001f\u0015T\u001eÑ Dö\t0\u0012\u000e\u0007^]ÐIK&2½=Ã \u007fN\u0010'\u0095Ù+X\u009f\u0001k>¾3\u0012\u009e»G´\u0010\u0087á3$r>E\u0088\"x\u009cçÃ\u0016\u009cb\u0010Ö\u00983\u0088Ê¢Æ»\u0091]øAu<åX L\u008aÑ\u001d\u0004Ù\u00ad:jòê¸\b\u0089>KÒ~£ÔOBà}¨\u008dqÙÊ\u0081»]\u0010\u0013ä\u0001TïÎ\u0080\u0089)\u00ad\u0001§ä\u0014²~\u0010â=hâ]¼îhß®\u001cr\u0007bI3\u0010\u009eðØý\u0093ÕÏ\u000f¦\u001c8\u0096!\u001e!Ù\u0010Ð·\u0010³\u0006nh\t«+e©a\u0086 Ë\u0018A\u009b%\u0095\u0098×û0g\u008a_y¾\u0096Y/ìX3]£ÂÎI\u00104Ï\u009f.Í²\u0005\b\u001agò\u0088\u0097Êâ\u0004\u0010MZà\u0001[§\u001fó»#\f«XI1¼ ×p\nå)Z7C\u0097ÅÜ{@lòþS\u0095ë\u0080§+\u008e¬íÝcom+\u0012µ\u0010¶¶¬¿fë¿\u009dVbePòuâ(\u0010rð\u0094oN/\u00adLËJñÞ\u00853\u0096d\u0010R\u008f\u0082÷#ËÙ\t;¾\u0083\u008f\u0094DG\u0080\u0010Õ6\u008e9ð?\u0010\u0090?\u0098ïc\nÔ8º";
         int var8 = "ªË;¤xÃQË?b\u0095\u0099#ÞÊ\u0088.ÂÝÍã£\u0003¨Ï±o\u0015@\u0000Öòè4'\u008cÃ\u0083²A Ñd@\u0000\u001f9å«ókôñnLmn\u0090Ñ§\u0091DM@Üç®ÈG\u0098Õï\u008a\u0010þµ\u0086g]ap~\u001f\u0001\u008f3\u007f\u0014\u001b=\u0018Åc\u001eä¸¸g=Þüº\u0010\u0005E}Mò*(«>b$½ \\F\u009b+(\u0018\u001f\u0015T\u001eÑ Dö\t0\u0012\u000e\u0007^]ÐIK&2½=Ã \u007fN\u0010'\u0095Ù+X\u009f\u0001k>¾3\u0012\u009e»G´\u0010\u0087á3$r>E\u0088\"x\u009cçÃ\u0016\u009cb\u0010Ö\u00983\u0088Ê¢Æ»\u0091]øAu<åX L\u008aÑ\u001d\u0004Ù\u00ad:jòê¸\b\u0089>KÒ~£ÔOBà}¨\u008dqÙÊ\u0081»]\u0010\u0013ä\u0001TïÎ\u0080\u0089)\u00ad\u0001§ä\u0014²~\u0010â=hâ]¼îhß®\u001cr\u0007bI3\u0010\u009eðØý\u0093ÕÏ\u000f¦\u001c8\u0096!\u001e!Ù\u0010Ð·\u0010³\u0006nh\t«+e©a\u0086 Ë\u0018A\u009b%\u0095\u0098×û0g\u008a_y¾\u0096Y/ìX3]£ÂÎI\u00104Ï\u009f.Í²\u0005\b\u001agò\u0088\u0097Êâ\u0004\u0010MZà\u0001[§\u001fó»#\f«XI1¼ ×p\nå)Z7C\u0097ÅÜ{@lòþS\u0095ë\u0080§+\u008e¬íÝcom+\u0012µ\u0010¶¶¬¿fë¿\u009dVbePòuâ(\u0010rð\u0094oN/\u00adLËJñÞ\u00853\u0096d\u0010R\u008f\u0082÷#ËÙ\t;¾\u0083\u008f\u0094DG\u0080\u0010Õ6\u008e9ð?\u0010\u0090?\u0098ïc\nÔ8º"
            .length();
         char var5 = '(';
         int var12 = -1;

         label27:
         while (true) {
            String var13 = var6.substring(++var12, var12 + var5);
            byte var10001 = -1;

            while (true) {
               byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
               String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               switch (var10001) {
                  case 0:
                     var9[var7++] = var19;
                     if ((var12 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[23];
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

                     var6 = "@R\u0097{`îDÏ\u0014aD@§ÔÐ\u0097÷Z¬À\u0018aA\u0081\u008d\u001f;qØ\u0010Ö¦î\u0084mì¥®vx\u0018ÅSýÈIÌv¾\u0007§üáñØ\u0096\u008bí'ÎÐùJN®";
                     var8 = "@R\u0097{`îDÏ\u0014aD@§ÔÐ\u0097÷Z¬À\u0018aA\u0081\u008d\u001f;qØ\u0010Ö¦î\u0084mì¥®vx\u0018ÅSýÈIÌv¾\u0007§üáñØ\u0096\u008bí'ÎÐùJN®"
                        .length();
                     var5 = '(';
                     var12 = -1;
               }

               var13 = var6.substring(++var12, var12 + var5);
               var10001 = 0;
            }
         }
      }

      private static IllegalArgumentException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         IllegalArgumentException var0
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 21561;
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
                  "me/octo/client/scripting/IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
               "me/octo/client/scripting/IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
