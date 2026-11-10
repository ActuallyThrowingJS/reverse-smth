package me.octo.client.modules.impl.macros;

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
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII {
   @NotNull
   private final String name;
   @NotNull
   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll location;
   @NotNull
   private final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll warpLocation;
   @NotNull
   private final Vec3 fishingSpot;
   @NotNull
   private final List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> route;
   @NotNull
   private final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll rodType;
   @NotNull
   private final Pair<Float, Float> finalYawPitch;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 11199390938926L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

   public IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII(
      @NotNull String nameArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll locationArg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll warpLocationArg,
      @NotNull Vec3 fishingSpotArg,
      @NotNull List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> routeArg,
      @NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll rodTypeArg,
      @NotNull Pair<Float, Float> finalYawPitchArg
   ) {
      long var8 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 104720952833483L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(locationArg, "location");
      Intrinsics.checkNotNullParameter(warpLocationArg, "warpLocation");
      Intrinsics.checkNotNullParameter(fishingSpotArg, "fishingSpot");
      Intrinsics.checkNotNullParameter(routeArg, "route");
      Intrinsics.checkNotNullParameter(rodTypeArg, "rodType");
      Intrinsics.checkNotNullParameter(finalYawPitchArg, "finalYawPitch");
      super();
      this.name = nameArg;
      this.location = locationArg;
      this.warpLocation = warpLocationArg;
      this.fishingSpot = fishingSpotArg;
      this.route = routeArg;
      this.rodType = rodTypeArg;
      this.finalYawPitch = finalYawPitchArg;
   }

   @NotNull
   public final String getName() {
      return this.name;
   }

   @NotNull
   public final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getLocation() {
      return this.location;
   }

   @NotNull
   public final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getWarpLocation() {
      return this.warpLocation;
   }

   @NotNull
   public final Vec3 getFishingSpot() {
      return this.fishingSpot;
   }

   @NotNull
   public final List<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> getRoute() {
      return this.route;
   }

   @NotNull
   public final llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll getRodType() {
      return this.rodType;
   }

   @NotNull
   public final Pair<Float, Float> getFinalYawPitch() {
      return this.finalYawPitch;
   }

   @NotNull
   public final IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
      int var3,
      long var4,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6,
      @NotNull Vec3 var7,
      @NotNull List var8,
      @NotNull llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var9,
      @NotNull Pair var10
   ) {
      long var11 = ((long)var3 << 32 | var4 << 32 >>> 32) ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(6877, 7042673987977177922L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(25677, 8584957947717785024L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(29337, 5862284889817973519L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var7, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(31660, 358901114877446688L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var8, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(28411, 7832586023342055271L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(4953, 7933485459199877832L ^ var11)
      );
      Intrinsics.checkNotNullParameter(
         var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(21267, 6850337955032474249L ^ var11)
      );
      return new IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII(var1, var2, var6, var7, var8, var9, var10);
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 136242733176756L;
      Pair var3 = this.finalYawPitch;
      llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var4 = this.rodType;
      List var5 = this.route;
      Vec3 var6 = this.fishingSpot;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var7 = this.warpLocation;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = this.location;
      String var9 = this.name;
      return "FishingArea(name="
         + var9
         + ", location="
         + var8
         + ", warpLocation="
         + var7
         + ", fishingSpot="
         + var6
         + ", route="
         + var5
         + ", rodType="
         + var4
         + ", finalYawPitch="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      int var1 = this.name.hashCode();
      var1 = var1 * 31 + this.location.hashCode();
      var1 = var1 * 31 + this.warpLocation.hashCode();
      var1 = var1 * 31 + this.fishingSpot.hashCode();
      var1 = var1 * 31 + this.route.hashCode();
      var1 = var1 * 31 + this.rodType.hashCode();
      return var1 * 31 + this.finalYawPitch.hashCode();
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 126951473484307L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[21];
      int var7 = 0;
      String var6 = "K¨ºÁ¢gùP!ä\u008b&àDªÐ ¨zh5\t?fÉÌ\u0082ó\u0092rß;ÅbGÚaJ_´ãÑ2ôo\u0007Êw[\u0018¼ö\u0003\rRoy.=´§ð\u00adW\u000bk\u0002\\ûVFä\u001e\u0007\u0010];\u009aþ\u0094»Ç\r\u009d¬Î\u001fClMâ\u0018¡)\u0095\u0019»÷\t\núu\f'\\\u0007Ò \u009dú\u007fáWr5ú\u0018@ÈÇàõ~¾úÖ\u0001Ò¥\u0097\u0081u\u0083°c\u00906\u0007QÌ÷ lùs$sK¬º\u0084\u0099\u0098ïz\u0004ã×¶^\u001f6Ìî\u008e>\u001eé\u0015AôÑjÄ \u007f¸ðeCîü\u009aÞ#Z>KNf\u009có¾ÝR$@\u0091\u0095Ã\n~ûÈ£~\u0095 }Æ=O;\u0083\u001e&\níÐùãèÑ\u0082çõA\u0099\u0085ý\u0013d£]þ¯\u0082ëðq\u0018JÚ\u0099\u0001\u0094\u0090«¡\u0018\u0012nmûÑ!V³q\u00836¹\"(R(\rãè¼Wùa\u0094·4v/Ç`\u001c\u0013\u0099ÙP~\u0018]ìþ\bq\u0011¾Ñ\\\u0081fFôË#\u0019t5Ö ÷ÚÔ)¿¨b¿;ðÒúd<æ3·\u0094\u0092{m¶\u0014ï[än\u0088yJ·\u008e \u007fK E&©\u000e\u0090\u00870Ó´Ì¾zC\u0087\u007fÐã$Ü1É\u0019¾\u0000\u001c7ÄÂ:\u0018¢ö¶Aø\u008d\f¯=EôÎ6£¿¸\u0093[kå\u009d=9R\u0010«\u000boU\u001d¡v$¯-mC£ö!70\u009b}\u009aÚ¯~íçõ~²_\u009d\u009eb\u0007a'>µ¸<Ü^4\u0089eJ¹nul\u001e²/bÛÓ9\u007f\u0015\u007fÉ\u0000@ÉYx\u0010\\\u0001ÕBG¸\f)\u001c¬½o\u0097y«T\u0010\u008fîÈ\u0081 @¾4p\u0095ÿ,Ò\u001bé\r ÁB\u0095¿a\u009cí\"FS5b=\u0089/2g\u0080\nwÆý»¥l9¯\u0095%\u0004ð¤";
      int var8 = "K¨ºÁ¢gùP!ä\u008b&àDªÐ ¨zh5\t?fÉÌ\u0082ó\u0092rß;ÅbGÚaJ_´ãÑ2ôo\u0007Êw[\u0018¼ö\u0003\rRoy.=´§ð\u00adW\u000bk\u0002\\ûVFä\u001e\u0007\u0010];\u009aþ\u0094»Ç\r\u009d¬Î\u001fClMâ\u0018¡)\u0095\u0019»÷\t\núu\f'\\\u0007Ò \u009dú\u007fáWr5ú\u0018@ÈÇàõ~¾úÖ\u0001Ò¥\u0097\u0081u\u0083°c\u00906\u0007QÌ÷ lùs$sK¬º\u0084\u0099\u0098ïz\u0004ã×¶^\u001f6Ìî\u008e>\u001eé\u0015AôÑjÄ \u007f¸ðeCîü\u009aÞ#Z>KNf\u009có¾ÝR$@\u0091\u0095Ã\n~ûÈ£~\u0095 }Æ=O;\u0083\u001e&\níÐùãèÑ\u0082çõA\u0099\u0085ý\u0013d£]þ¯\u0082ëðq\u0018JÚ\u0099\u0001\u0094\u0090«¡\u0018\u0012nmûÑ!V³q\u00836¹\"(R(\rãè¼Wùa\u0094·4v/Ç`\u001c\u0013\u0099ÙP~\u0018]ìþ\bq\u0011¾Ñ\\\u0081fFôË#\u0019t5Ö ÷ÚÔ)¿¨b¿;ðÒúd<æ3·\u0094\u0092{m¶\u0014ï[än\u0088yJ·\u008e \u007fK E&©\u000e\u0090\u00870Ó´Ì¾zC\u0087\u007fÐã$Ü1É\u0019¾\u0000\u001c7ÄÂ:\u0018¢ö¶Aø\u008d\f¯=EôÎ6£¿¸\u0093[kå\u009d=9R\u0010«\u000boU\u001d¡v$¯-mC£ö!70\u009b}\u009aÚ¯~íçõ~²_\u009d\u009eb\u0007a'>µ¸<Ü^4\u0089eJ¹nul\u001e²/bÛÓ9\u007f\u0015\u007fÉ\u0000@ÉYx\u0010\\\u0001ÕBG¸\f)\u001c¬½o\u0097y«T\u0010\u008fîÈ\u0081 @¾4p\u0095ÿ,Ò\u001bé\r ÁB\u0095¿a\u009cí\"FS5b=\u0089/2g\u0080\nwÆý»¥l9¯\u0095%\u0004ð¤"
         .length();
      char var5 = '\u0010';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "\u001e|%ÎíF\u00838\u0003Ë.\u0093<P7\u001e7S\u0084Å\u0016W.·ÔÙ3üÕßì\u0007\u0010ÄA·éD^Nû·ÝU²>A\u0012\u0081";
            var8 = "\u001e|%ÎíF\u00838\u0003Ë.\u0093<P7\u001e7S\u0084Å\u0016W.·ÔÙ3üÕßì\u0007\u0010ÄA·éD^Nû·ÝU²>A\u0012\u0081".length();
            var5 = ' ';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var9;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[21];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9666;
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
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII", var10
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
            "me/octo/client/modules/impl/macros/IIIIIlllllIIIllIlIlIlllllIIIllIIIllllIIIIIIlIIIIIlIIlIllIlIIllllllllllllIIIIlIlIlllII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
