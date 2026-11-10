package me.octo.client.modules.impl.features;

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
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
   @NotNull
   private final String artist;
   @NotNull
   private final String title;
   @NotNull
   private final String album;
   private final long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private final long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   @NotNull
   private final String source;
   @NotNull
   private final String url;
   @NotNull
   private final String artworkUrl;
   private static int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 44944280786270L;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

   public lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII(
      @NotNull String artistArg,
      @NotNull String titleArg,
      @NotNull String albumArg,
      long argument4Arg,
      long argument5Arg,
      boolean argument6Arg,
      @NotNull String sourceArg,
      @NotNull String urlArg,
      @NotNull String artworkUrlArg
   ) {
      long var12 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 17406511504473L;
      Intrinsics.checkNotNullParameter(artistArg, "artist");
      Intrinsics.checkNotNullParameter(titleArg, "title");
      int var10000 = lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl();
      Intrinsics.checkNotNullParameter(albumArg, "album");
      Intrinsics.checkNotNullParameter(sourceArg, "source");
      Intrinsics.checkNotNullParameter(urlArg, "url");
      Intrinsics.checkNotNullParameter(artworkUrlArg, "artworkUrl");
      super();
      this.artist = artistArg;
      this.title = titleArg;
      this.album = albumArg;
      int var14 = var10000;

      try {
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument5Arg;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument6Arg;
         this.source = sourceArg;
         this.url = urlArg;
         this.artworkUrl = artworkUrlArg;
         if (IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(++var14);
         }
      } catch (MatchException var17) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var17);
      }
   }

   @NotNull
   public final String getArtist() {
      return this.artist;
   }

   @NotNull
   public final String getTitle() {
      return this.title;
   }

   @NotNull
   public final String getAlbum() {
      return this.album;
   }

   public final long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final String getSource() {
      return this.source;
   }

   @NotNull
   public final String getUrl() {
      return this.url;
   }

   @NotNull
   public final String getArtworkUrl() {
      return this.artworkUrl;
   }

   @NotNull
   public final String IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return this.artist
         + "|"
         + this.title
         + "|"
         + this.album
         + "|"
         + this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final boolean lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final long IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   }

   public final long IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final boolean llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   @NotNull
   public final lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String var1,
      @NotNull String var2,
      int var3,
      @NotNull String var4,
      long var5,
      int var7,
      long var8,
      boolean var10,
      @NotNull String var11,
      @NotNull String var12,
      @NotNull String var13
   ) {
      long var14 = ((long)var3 << 32 | (long)var7 << 32 >>> 32) ^ lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(15637, 3727939400103367244L ^ var14)
      );
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(11481, 432884385694548893L ^ var14)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(21041, 2607471295434128745L ^ var14)
      );
      Intrinsics.checkNotNullParameter(
         var11, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(29444, 388747951110872131L ^ var14)
      );
      Intrinsics.checkNotNullParameter(
         var12, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(6022, 9087431346660358348L ^ var14)
      );
      Intrinsics.checkNotNullParameter(
         var13, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(22655, 1059087095181178687L ^ var14)
      );
      return new lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII(var1, var2, var4, var5, var8, var10, var11, var12, var13);
   }

   @NotNull
   @Override
   public String toString() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 117541363407601L;
      String var3 = this.artworkUrl;
      String var4 = this.url;
      String var5 = this.source;
      boolean var6 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      long var7 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      long var9 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      String var11 = this.album;
      String var12 = this.title;
      String var13 = this.artist;
      return "MediaTrack(artist="
         + var13
         + ", title="
         + var12
         + ", album="
         + var11
         + ", durationMs="
         + var9
         + ", positionMs="
         + var7
         + ", playing="
         + var6
         + ", source="
         + var5
         + ", url="
         + var4
         + ", artworkUrl="
         + var3
         + ")";
   }

   @Override
   public int hashCode() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 62860898893137L;
      int var4 = this.artist.hashCode();
      int var10000 = lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl();
      var4 = var4 * 31 + this.title.hashCode();
      var4 = var4 * 31 + this.album.hashCode();
      int var3 = var10000;
      var4 = var4 * 31 + Long.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      var4 = var4 * 31 + Long.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
      var4 = var4 * 31 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
      var4 = var4 * 31 + this.source.hashCode();
      var4 = var4 * 31 + this.url.hashCode();
      var4 = var4 * 31 + this.artworkUrl.hashCode();

      try {
         if (var3 == 0) {
            int[] var5 = new int[1];
            IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }

         return var4;
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   @Override
   public boolean equals(@Nullable Object param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
   }

   public static int lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public static int lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl() {
      int var0 = lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl();
      return var0 == 0 ? 86 : 0;
   }

   static {
      long var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 51528260467061L;
      byte var11 = 36;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[25];
      int var5 = 0;
      String var4 = "\u000e2\u008b\u001a¡ÿ\u008aV¾ò/uJè\nÊ¿xC&:\u0094û\u0018\u00104X´\u00844JM]\rÐ\u008dfxüó\u0090\u0010\u0097H|gòØ.ª¬Õd;SÔ\u0090\u0082\u0018µ\u0003\u009ac\u008d\u0015äx·0j\u0091SÊ\u0010=\u008eÏç\u0000=Ã\u0085î\u0018ú|\u0099m{=\u0013\u0085\n\u0010,\u0090f\u00815\u0013æ0}¶\u001b$<2 Ø>®<\"µ\u007fûÑJ\u0095¸îô\u009c¤â\u0080\u0006¬\u001d¨\u0003\u009bf\u008aêSyoÊz\u0018\u0099\u0007\u0001åõ2\u008f\u001aÿ\u00ad:è(\u0001W\u001b'/\u008ffRq$¬\u0010æ´J}÷\u0019\u009cO}%Á\u0015\u0010ïÚ+ \u0082:Â(\u0082ßPT\u009a]³æþ\u001d\u0017>±\u0093*rØ\u009cdf^õÄh¶bY¿\u00107!\u001c\u00adû!\u0091·ý±\u001d\"OÕ\u009a?\u0010m*Xè7ìff{ü¤\u0007HÖU\u0080(+°¹*¸Ó@A\u0016TõÖ¸\u009f_CX\u009b+;¸\u009bw~\u0095I\u0098Âz'ªj\u0094è\u0000Z<¸ G \u007fèmñäA\u0090þ>\u0006];\fJ4\u0013w0\\½\u0016#\u0084ØkyÜ\u001bt7~r \u001ax8\u0096\u0084\u0005;_3\u008f\u0095\u0081ùúT¸0\u008a5V\u0018#Í)ëM\u001d<\u0088®¶i ,z\u0087\u009f -,m¹Èí\u009d$9H\u0001ð\u0015i°\fÑs\u00ad *<ûHzòU\u0010\u009f\u009fÝ\rA¶Ô\u009dÎj\nk\u0091±\u0089m\u00185À·\u0091\u0089l'Ë\u00adã~¸\u009fe¼\u001b\\1'\u0080Qðö$\u0010\nX\nÛC\u0089%e£\u001a¹yç~z\u0002\u0010\u0011\u000fdÈ\u008bH©÷\u000fæçÈâ\u0012Òp\u0018YW$w\n´HE\\õöÕ\u0012z×·ZëÙ\be/^\u0011\u0010$\u008cÁÒtöm\u0001\u0007NË]¸aqì\u0010\\u\u009dæK¿E¿½s\u000edyw\u000b« æ&drÄèº0¹Ëò\n8L½ÃË÷_\u0010Ð\u008b0Ð9Q\n¯¤Ô\u0014¶";
      int var6 = "\u000e2\u008b\u001a¡ÿ\u008aV¾ò/uJè\nÊ¿xC&:\u0094û\u0018\u00104X´\u00844JM]\rÐ\u008dfxüó\u0090\u0010\u0097H|gòØ.ª¬Õd;SÔ\u0090\u0082\u0018µ\u0003\u009ac\u008d\u0015äx·0j\u0091SÊ\u0010=\u008eÏç\u0000=Ã\u0085î\u0018ú|\u0099m{=\u0013\u0085\n\u0010,\u0090f\u00815\u0013æ0}¶\u001b$<2 Ø>®<\"µ\u007fûÑJ\u0095¸îô\u009c¤â\u0080\u0006¬\u001d¨\u0003\u009bf\u008aêSyoÊz\u0018\u0099\u0007\u0001åõ2\u008f\u001aÿ\u00ad:è(\u0001W\u001b'/\u008ffRq$¬\u0010æ´J}÷\u0019\u009cO}%Á\u0015\u0010ïÚ+ \u0082:Â(\u0082ßPT\u009a]³æþ\u001d\u0017>±\u0093*rØ\u009cdf^õÄh¶bY¿\u00107!\u001c\u00adû!\u0091·ý±\u001d\"OÕ\u009a?\u0010m*Xè7ìff{ü¤\u0007HÖU\u0080(+°¹*¸Ó@A\u0016TõÖ¸\u009f_CX\u009b+;¸\u009bw~\u0095I\u0098Âz'ªj\u0094è\u0000Z<¸ G \u007fèmñäA\u0090þ>\u0006];\fJ4\u0013w0\\½\u0016#\u0084ØkyÜ\u001bt7~r \u001ax8\u0096\u0084\u0005;_3\u008f\u0095\u0081ùúT¸0\u008a5V\u0018#Í)ëM\u001d<\u0088®¶i ,z\u0087\u009f -,m¹Èí\u009d$9H\u0001ð\u0015i°\fÑs\u00ad *<ûHzòU\u0010\u009f\u009fÝ\rA¶Ô\u009dÎj\nk\u0091±\u0089m\u00185À·\u0091\u0089l'Ë\u00adã~¸\u009fe¼\u001b\\1'\u0080Qðö$\u0010\nX\nÛC\u0089%e£\u001a¹yç~z\u0002\u0010\u0011\u000fdÈ\u008bH©÷\u000fæçÈâ\u0012Òp\u0018YW$w\n´HE\\õöÕ\u0012z×·ZëÙ\be/^\u0011\u0010$\u008cÁÒtöm\u0001\u0007NË]¸aqì\u0010\\u\u009dæK¿E¿½s\u000edyw\u000b« æ&drÄèº0¹Ëò\n8L½ÃË÷_\u0010Ð\u008b0Ð9Q\n¯¤Ô\u0014¶"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var22 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var22;
         if ((var2 += var3) >= var6) {
            var4 = "\u0002\u008c\fgÕ_+F\u000fa\u0097ïã\u0019´\u0018(C\\Ðj\u0087ð\u008bÈGuÇ`\u009e\u0080e'\u0016\u008b\u00133}÷\u009aN\u001fx\u000eÓà\u0097·¥)ã\u0012(yyßÂ";
            var6 = "\u0002\u008c\fgÕ_+F\u000fa\u0097ïã\u0019´\u0018(C\\Ðj\u0087ð\u008bÈGuÇ`\u009e\u0080e'\u0016\u008b\u00133}÷\u009aN\u001fx\u000eÓà\u0097·¥)ã\u0012(yyßÂ"
               .length();
            var3 = '\u0010';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var20 = false;
               var7[var5++] = var24;
               if ((var2 += var3) >= var6) {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var7;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[25];
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6639;
      if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/features/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10
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
         byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
         lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
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
            "me/octo/client/modules/impl/features/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final boolean lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl$recovered$a41944923356315c(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
