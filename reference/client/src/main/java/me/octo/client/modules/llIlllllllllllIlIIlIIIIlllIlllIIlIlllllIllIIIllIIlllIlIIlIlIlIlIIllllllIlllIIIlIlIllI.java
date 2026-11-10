package me.octo.client.modules;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI {
   @NotNull
   public static llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static Minecraft lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static Lazy IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static Lazy lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Map<String, llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 94621624188206L;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new HashMap(13);

   private llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI() {
   }

   private final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      Lazy var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      Object var10000 = var3.getValue();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(14163, 3748556552953083356L ^ var1)
      );
      return (Path)var10000;
   }

   private final Path llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32)
         ^ IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      Lazy var6 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      Object var10000 = var6.getValue();
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(17055, 4478308664831644533L ^ var4)
      );
      return (Path)var10000;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final synchronized void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var10001 = var1 ^ 76466105475366L;
      int var3 = (int)((var1 ^ 76466105475366L) >>> 48);
      int var4 = (int)((var1 ^ 76466105475366L) << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      int var6 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3507549761890052745L, var1
      );

      boolean var10000;
      label59: {
         try {
            var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
            if (var6 == 0) {
               break label59;
            }

            if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI) {
               return;
            }
         } catch (Exception var17) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var17, -3459047249490060929L, var1
            );
         }

         IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = true;

         try {
            Path var24 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((short)var3, (char)var4, var5);
            LinkOption[] var26 = new LinkOption[0];
            var10000 = Files.exists(var24, Arrays.copyOf(var26, var26.length));
         } catch (Exception var16) {
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
            return;
         }
      }

      try {
         if (var10000) {
            me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl var8 = me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Path var9 = this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((short)var3, (char)var4, var5);
            boolean var10 = false;
            String var12 = PathsKt.readText$default(var9, null, 1, null);
            boolean var13 = false;
            List var7 = (List)me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII
               .fromJson(var12, List.class);
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
            Iterable var19 = var7;
            boolean var20 = false;

            for (Object var11 : var19) {
               var10000 = var6;
               llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var22 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var11;
               var13 = false;

               try {
                  if (var10000 == 0) {
                     break;
                  }

                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var22.getRoute().getId(), var22);
                  if (var6 == 0) {
                     break;
                  }
               } catch (Exception var14) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var14, -3459047249490060929L, var1
                  );
               }
            }
         }
      } catch (Exception var15) {
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.clear();
      }
   }

   private final synchronized void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var10001 = var1 ^ 36272708455861L;
      int var3 = (int)((var1 ^ 36272708455861L) >>> 32);
      int var4 = (int)((var1 ^ 36272708455861L) << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 83456224698310L;
      var10001 = var1 ^ 134951728925871L;
      int var8 = (int)((var1 ^ 134951728925871L) >>> 48);
      int var9 = (int)((var1 ^ 134951728925871L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);

      try {
         Path var10000 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
         FileAttribute[] var15 = new FileAttribute[0];
         Intrinsics.checkNotNullExpressionValue(
            Files.createDirectories(var10000, Arrays.copyOf(var15, var15.length)),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(4241, 7968151302002651369L ^ var1)
         );
         me.octo.client.utils.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               CollectionsKt.toList(IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values()),
               var3,
               var4,
               this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((short)var8, (char)var9, var10),
               true,
               (char)var5
            );
      } catch (Exception var12) {
      }
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull String var3) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var4 = var1 ^ 2762457790060L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(31358, 4216331789727005902L ^ var1)
      );
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4);
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.containsKey(var3);
   }

   @Nullable
   public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull String var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      long var4 = var2 ^ 51334085476307L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(31358, 4216292151633393009L ^ var2)
      );
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4);
      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var1);
   }

   @NotNull
   public final List lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var3 = var1 ^ 56173632405924L;
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var3);
      Iterable var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values();
      boolean var6 = false;
      return CollectionsKt.sortedWith(
         var5,
         new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll()
      );
   }

   @Nullable
   public final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull String var3, @NotNull String var4
   ) {
      var1 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var1;
      long var5 = var1 ^ 66069710936334L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(2479, 1559672070821814359L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(19521, 5261175310261904789L ^ var1)
      );
      this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var5);
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7742466259171881303L, var1
      );
      Iterable var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.values();
      boolean var10 = false;
      Iterator var11 = var9.iterator();
      int var7 = var10000;

      label86:
      while (true) {
         if (!var11.hasNext()) {
            var21 = null;
            break;
         }

         Object var12 = var11.next();
         var21 = var12;

         while (true) {
            label82: {
               label81: {
                  label80: {
                     llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var13 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var21;
                     boolean var14 = false;
                     String var22 = var13.getParentFolder();
                     String var10001 = var3;
                     if (var7 != 0) {
                        try {
                           if (!Intrinsics.areEqual(var22, var10001)) {
                              break label80;
                           }

                           var22 = var13.getFileName();
                           var10001 = var4;
                        } catch (NoWhenBranchMatchedException var18) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var18, 7772813574899039583L, var1
                           );
                        }
                     }

                     try {
                        var23 = Intrinsics.areEqual(var22, var10001);
                        if (var7 == 0) {
                           break label82;
                        }

                        if (var23) {
                           break label81;
                        }
                     } catch (NoWhenBranchMatchedException var17) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var17, 7772813574899039583L, var1
                        );
                     }
                  }

                  var23 = false;
                  break label82;
               }

               var23 = true;
            }

            if (!var23) {
               break;
            }

            var21 = var12;
            if (var7 != 0) {
               break label86;
            }
         }
      }

      llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = (llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)var21;

      label57: {
         try {
            var24 = var8;
            if (var7 == 0) {
               break label57;
            }

            if (var8 == null) {
               return null;
            }
         } catch (NoWhenBranchMatchedException var16) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var16, 7772813574899039583L, var1
            );
         }

         var24 = var8;
      }

      me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var20 = var24.getRoute();

      try {
         if (var7 == 0) {
            return var20.getName();
         }

         if (var20 == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var15) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var15, 7772813574899039583L, var1
         );
      }

      return var20.getName();
   }

   private final String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(String var1, long var2) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5964177462526937313L, var2
      );
      CharSequence var5 = StringsKt.trim(var1).toString();
      Regex var6 = new Regex(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(28300, 4881984602274136350L ^ var2));
      String var7 = "_";
      var5 = var6.replace(var5, var7);
      int var4 = var10000;

      label27: {
         label26: {
            try {
               var10000 = var5.length();
               if (var4 == 0) {
                  break label27;
               }

               if (var10000 == 0) {
                  break label26;
               }
            } catch (NoWhenBranchMatchedException var8) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var8, -5938368861469197545L, var2
               );
            }

            var10000 = 0;
            break label27;
         }

         var10000 = 1;
      }

      Object var13;
      if (var10000 != 0) {
         boolean var11 = false;
         var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(3329, 3381906274774475417L ^ var2);
      } else {
         var13 = var5;
      }

      return (String)var13;
   }

   private final lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      String var1, long var2
   ) {
      var2 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var2;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -629661089884956378L, var2
      );
      Iterable var5 = lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
      boolean var6 = false;
      int var4 = var10000;

      label20:
      for (Object var8 : var5) {
         Object var12 = var8;

         do {
            lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var9 = (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII)var12;
            boolean var10 = false;
            if (!StringsKt.equals(var9.getRouteType(), var1, true)) {
               continue label20;
            }

            var12 = var8;
         } while (var4 != 0);

         return (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII)var8;
      }

      return (lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII)null;
   }

   @Nullable
   public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII param1,
      long param2,
      @NotNull String param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Path IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var0) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      Path var2 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.gameDirectory
         .toPath()
         .resolve(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(19267, 2406100523481882301L ^ var0));
      boolean var4 = false;
      Intrinsics.checkNotNull(var2);
      FileAttribute[] var10001 = new FileAttribute[0];
      Intrinsics.checkNotNullExpressionValue(
         Files.createDirectories(var2, Arrays.copyOf(var10001, var10001.length)),
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(29730, 4894010266352706018L ^ var0)
      );
      return var2;
   }

   private static final Path IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var0) {
      var0 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ var0;
      long var2 = var0 ^ 6139133751963L;
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2
         )
         .resolve(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"b">(28302, 4536729527704363952L ^ var0));
   }

   static {
      long var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll ^ 73171898090895L;
      long var11 = var9 ^ 7221287012472L;
      long var13 = var9 ^ 60329031635122L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[38];
      int var5 = 0;
      String var4 = "×6.\u009f\u0006\u009e</ÈBY}T4Mf\u0099\u009a\u0089%r;4¶\u0002juéYJ+\u001b\u0018\u0015Æ;E´ö¼K\u0096VUY\u0097 Á\u0016zÏT0¬\u0089ï-\u0010\u0098)\u007fÛNg\u00addÁOeófô×î\u0018ü[@aÐÄ9\u001cÏ¹zuï\u0098Ä\u0012OÍ§\u008b\u0016ô\u0019|\u0010X\u0089\u0012U\u00854gaD4\u007fÅ¼cB{hPãpºÓ±Mü\u0015cK$-`~IX\u00ad8ßÅÓ+j¨Ë<÷TÕñíùÎXÔÎÑ\tk>uÌ.³\u0098p¸M½\u000f\u0006â¦ZµX\u0097\fð²ëe\u0092\u008a\u0005²\u008a\u0083\u0013ìw/÷^Ö\u0081Ç!Ç\u009db\u0097§ï\u009a\u0083\t\u001aðsx¨x{H\u0001M\u001cé\u009bâ¸¦X\u0099³n2\u0003\u0087/Û±ÑÚûvã\u0088t/ m÷¹KÒûóó³N\u009eÜWE\u008ff\u000boÿ\u009a\u0085nÏqq\u0093«\u0012ª\u0096\u0082Å¸\u0092ÐÞøÌ\u000b^\u009c\u0099 \u0097\u0011\bwÿ\u008d]¼´\u009c\u0087ª¥\n\u0081\u007fj\u0095ï7\u0083Ü\u0088\u0007Å\u0094É\u0018¸\u0019P\u0006h®=ïr+Ö\u0092¸Ï6R\u0081å%\u0001\u0005Q\u008eá\u0018×U\u008d«\u008f\u00914{rVÙ_í&ð½êT\u0011e\u008a<\u0014æ\u0010k¶B\rÖ(ð¾\u009a\u001d\u0007Ô\u008e\u00010Y({<-[èm\u0095A\u0010Jf\u008b£\u009bã\u008b\u0001üÊÃÖ(@×Bº\u0014úR~§(üBÈWqU\u0002u\u0010\"\u00197\u0090§mã\u0092\u0012W\u009eèðâÀÆ \u0010ßÉØí£Ï\u0090\u001eA\u001dYww§{îÈÊ\u008aò\u0080kN«H3\u008d¬¦j4\u0018æ-\u009cò3\u0094Ù¨\u008aXÓ\u001f]ÕNFû¦¸q\u0015yìÊ(«WÖþYº\u009bÞÑ®eE\u009af\u0089öLÑÙ.\u000e§Ø\u007fÏ\u0015ÉedJTà¾ï\u0095X|÷\u0086ÿ\u0018âñæpá®pßt®\u00adâFêþ<[ÔgjzÏw÷\u0010Ó\u001e\u008e\u0080\\ùÆ\f´ If|z\u009dE0Ã¸íü\u000e·\b\u0081éÀ°\u009cÞf\u0083*ð\u008f9S×\u00910£e*y\u009e$jÙP¯ÜO¹\u009d\u009aC\u0098æñ\u0098\u0013Âqú\u00000UÏ\u00adCÔ¿.A\u0000¨\u0091Îö\b]\nÆx\u00929\u0002Zoÿ\t¨\u0001±I\u0017Ö09Þ¬ðR\u0011Ál\u0000ò\u0005|I\t¯\u0088 gQ§\u0007-sM\u00150Àµ¼à¤\u00170\u00ad\u009fßã\u0092À\u00ad\u0014èÀæBÅØ5t\u0010Ô\u0005\u0086\u0084¨\u0018]Pþ\u008eUw\u0003\u0017ð\u0006 )9\u008avÿòA\u0011\u00ado\u0093(\u0094,/qÂÇbB\u008aí\\ú)ò\u0012+þRÄ\u0004XÒþKQÒ£xnø\u009e}\u0097\u009a\u0010ûcl\u007f\u0018ôÄö®\u0095~\u009eQîe\u0010Õó\u008d¿\u0084MÀ\u008a@}!¡peaÀRªãÍz\næ$Éw\u0092;YÍ#Ð>\u0011\u0002\u0005\u0014.±o\u0016¨×²\u0096D÷\u001a8\u00ad\u0014ËÍ)Ú¦ËÚ8&·ÔRêlòÏz\u0095ìQ\u00ad\u001cù\u0092Ä\u0094l]\n\u0002]£·\u0010G4ã3hÂxË>v\u008eàÛD\u0085\r\tk\u009e)ã\ndk+ô)\u0089$\u001c\u0010\u007fÕ\b||\u007fÒ7\u008dÿ¬Áá\u0085O\\\u0018±Ó¯î'D\u0080\n{Ì0§N»`»=1~\u008bLE\fà\u0010ìä)\u001d&\u009b\u0011÷{,\nÚsD\u0090<\u0010\u008c¢:ô«v\u001e>7òi\u0097Gáa£\u0010+ãM\u0091\u001e\u009c\u008d\u0000`ô3\u0084ªøB7\u00187w!LG}Â\u009dèè¹|zÏ¨\u0084ýø¨@N\u0015©s\u0010Tp\u0082~Hi|Æª,p¢çW\u0007P\u0010{\"]myÔ\u009cô¹G\u0082.Ú\\\u0087j p½\u008dóF¥\u0013Q\"\u0094\u0012ÔU:\u0097Û¾ÝK\u0096f2\u00ad×+Ú2åìS_Z\u0018\u0092\u0005\u0006Eh\u0017r¾¸åíª¹É\u0090v« Ï\u0011ñ\u0017©e\u0018 k\u00899[*o§#\u0095VX\u00886±HÍÅ\u0082\u0081¢{?/ ÷i2t&\u008c#AJ\u000eZÚ×/×é\u0097§sbÛW.²\u009bòvç\fÿ\u0086¹";
      int var6 = "×6.\u009f\u0006\u009e</ÈBY}T4Mf\u0099\u009a\u0089%r;4¶\u0002juéYJ+\u001b\u0018\u0015Æ;E´ö¼K\u0096VUY\u0097 Á\u0016zÏT0¬\u0089ï-\u0010\u0098)\u007fÛNg\u00addÁOeófô×î\u0018ü[@aÐÄ9\u001cÏ¹zuï\u0098Ä\u0012OÍ§\u008b\u0016ô\u0019|\u0010X\u0089\u0012U\u00854gaD4\u007fÅ¼cB{hPãpºÓ±Mü\u0015cK$-`~IX\u00ad8ßÅÓ+j¨Ë<÷TÕñíùÎXÔÎÑ\tk>uÌ.³\u0098p¸M½\u000f\u0006â¦ZµX\u0097\fð²ëe\u0092\u008a\u0005²\u008a\u0083\u0013ìw/÷^Ö\u0081Ç!Ç\u009db\u0097§ï\u009a\u0083\t\u001aðsx¨x{H\u0001M\u001cé\u009bâ¸¦X\u0099³n2\u0003\u0087/Û±ÑÚûvã\u0088t/ m÷¹KÒûóó³N\u009eÜWE\u008ff\u000boÿ\u009a\u0085nÏqq\u0093«\u0012ª\u0096\u0082Å¸\u0092ÐÞøÌ\u000b^\u009c\u0099 \u0097\u0011\bwÿ\u008d]¼´\u009c\u0087ª¥\n\u0081\u007fj\u0095ï7\u0083Ü\u0088\u0007Å\u0094É\u0018¸\u0019P\u0006h®=ïr+Ö\u0092¸Ï6R\u0081å%\u0001\u0005Q\u008eá\u0018×U\u008d«\u008f\u00914{rVÙ_í&ð½êT\u0011e\u008a<\u0014æ\u0010k¶B\rÖ(ð¾\u009a\u001d\u0007Ô\u008e\u00010Y({<-[èm\u0095A\u0010Jf\u008b£\u009bã\u008b\u0001üÊÃÖ(@×Bº\u0014úR~§(üBÈWqU\u0002u\u0010\"\u00197\u0090§mã\u0092\u0012W\u009eèðâÀÆ \u0010ßÉØí£Ï\u0090\u001eA\u001dYww§{îÈÊ\u008aò\u0080kN«H3\u008d¬¦j4\u0018æ-\u009cò3\u0094Ù¨\u008aXÓ\u001f]ÕNFû¦¸q\u0015yìÊ(«WÖþYº\u009bÞÑ®eE\u009af\u0089öLÑÙ.\u000e§Ø\u007fÏ\u0015ÉedJTà¾ï\u0095X|÷\u0086ÿ\u0018âñæpá®pßt®\u00adâFêþ<[ÔgjzÏw÷\u0010Ó\u001e\u008e\u0080\\ùÆ\f´ If|z\u009dE0Ã¸íü\u000e·\b\u0081éÀ°\u009cÞf\u0083*ð\u008f9S×\u00910£e*y\u009e$jÙP¯ÜO¹\u009d\u009aC\u0098æñ\u0098\u0013Âqú\u00000UÏ\u00adCÔ¿.A\u0000¨\u0091Îö\b]\nÆx\u00929\u0002Zoÿ\t¨\u0001±I\u0017Ö09Þ¬ðR\u0011Ál\u0000ò\u0005|I\t¯\u0088 gQ§\u0007-sM\u00150Àµ¼à¤\u00170\u00ad\u009fßã\u0092À\u00ad\u0014èÀæBÅØ5t\u0010Ô\u0005\u0086\u0084¨\u0018]Pþ\u008eUw\u0003\u0017ð\u0006 )9\u008avÿòA\u0011\u00ado\u0093(\u0094,/qÂÇbB\u008aí\\ú)ò\u0012+þRÄ\u0004XÒþKQÒ£xnø\u009e}\u0097\u009a\u0010ûcl\u007f\u0018ôÄö®\u0095~\u009eQîe\u0010Õó\u008d¿\u0084MÀ\u008a@}!¡peaÀRªãÍz\næ$Éw\u0092;YÍ#Ð>\u0011\u0002\u0005\u0014.±o\u0016¨×²\u0096D÷\u001a8\u00ad\u0014ËÍ)Ú¦ËÚ8&·ÔRêlòÏz\u0095ìQ\u00ad\u001cù\u0092Ä\u0094l]\n\u0002]£·\u0010G4ã3hÂxË>v\u008eàÛD\u0085\r\tk\u009e)ã\ndk+ô)\u0089$\u001c\u0010\u007fÕ\b||\u007fÒ7\u008dÿ¬Áá\u0085O\\\u0018±Ó¯î'D\u0080\n{Ì0§N»`»=1~\u008bLE\fà\u0010ìä)\u001d&\u009b\u0011÷{,\nÚsD\u0090<\u0010\u008c¢:ô«v\u001e>7òi\u0097Gáa£\u0010+ãM\u0091\u001e\u009c\u008d\u0000`ô3\u0084ªøB7\u00187w!LG}Â\u009dèè¹|zÏ¨\u0084ýø¨@N\u0015©s\u0010Tp\u0082~Hi|Æª,p¢çW\u0007P\u0010{\"]myÔ\u009cô¹G\u0082.Ú\\\u0087j p½\u008dóF¥\u0013Q\"\u0094\u0012ÔU:\u0097Û¾ÝK\u0096f2\u00ad×+Ú2åìS_Z\u0018\u0092\u0005\u0006Eh\u0017r¾¸åíª¹É\u0090v« Ï\u0011ñ\u0017©e\u0018 k\u00899[*o§#\u0095VX\u00886±HÍÅ\u0082\u0081¢{?/ ÷i2t&\u008c#AJ\u000eZÚ×/×é\u0097§sbÛW.²\u009bòvç\fÿ\u0086¹"
         .length();
      char var3 = ' ';
      int var16 = -1;

      label27:
      while (true) {
         String var17 = var4.substring(++var16, var16 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var17.getBytes("ISO-8859-1"));
            String var24 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var24;
                  if ((var16 += var3) >= var6) {
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var7;
                     IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new String[38];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI();
                     Minecraft var19 = Minecraft.getInstance();
                     Intrinsics.checkNotNullExpressionValue(var19, "getInstance(...)");
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var19;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = LazyKt.lazy(
                        llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = LazyKt.lazy(
                        llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new LinkedHashMap<>();
                     return;
                  }

                  var3 = var4.charAt(var16);
                  break;
               default:
                  var7[var5++] = var24;
                  if ((var16 += var3) < var6) {
                     var3 = var4.charAt(var16);
                     continue label27;
                  }

                  var4 = "ÅU(E\u0091<\u001fR14á;\u0004§Ñ×(<\u0000\u0010¬¿\u0081ÙÂHG2/8Ýªú\u008dLðpEÞ¿\u0002×Ù\u00ad¨V§\u008e\u009b^¹\u0095$mÊP{";
                  var6 = "ÅU(E\u0091<\u001fR14á;\u0004§Ñ×(<\u0000\u0010¬¿\u0081ÙÂHG2/8Ýªú\u008dLðpEÞ¿\u0002×Ù\u00ad¨V§\u008e\u009b^¹\u0095$mÊP{".length();
                  var3 = 16;
                  var16 = -1;
            }

            var17 = var4.substring(++var16, var16 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16600;
      if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5].getBytes("ISO-8859-1");
         IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var5];
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
            "me/octo/client/modules/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      private final me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII route;
      private final long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final String parentFolder;
      @NotNull
      private final String targetType;
      @Nullable
      private final String IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final String IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private final String fileName;
      private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 115667023446703L;
      private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private static Map lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         @NotNull me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII routeArg,
         long argument2Arg,
         long argument3Arg,
         @NotNull String parentFolderArg,
         @NotNull String targetTypeArg,
         @Nullable String argument6Arg,
         @Nullable String argument7Arg,
         @NotNull String fileNameArg
      ) {
         long var11 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 55775753511171L;
         Intrinsics.checkNotNullParameter(routeArg, "route");
         Intrinsics.checkNotNullParameter(parentFolderArg, "parentFolder");
         Intrinsics.checkNotNullParameter(targetTypeArg, "targetType");
         Intrinsics.checkNotNullParameter(fileNameArg, "fileName");
         super();
         this.route = routeArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
         this.parentFolder = parentFolderArg;
         this.targetType = targetTypeArg;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument6Arg;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = argument7Arg;
         this.fileName = fileNameArg;
      }

      @NotNull
      public final me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII getRoute() {
         return this.route;
      }

      public final long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final String getParentFolder() {
         return this.parentFolder;
      }

      @NotNull
      public final String getTargetType() {
         return this.targetType;
      }

      @Nullable
      public final String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final String getFileName() {
         return this.fileName;
      }

      public final long IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final long lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final String IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final String IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var1,
         long var2,
         char var4,
         long var5,
         long var7,
         @NotNull String var9,
         @NotNull String var10,
         @Nullable String var11,
         @Nullable String var12,
         @NotNull String var13
      ) {
         long var14 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(495, 6362230908255600911L ^ var14)
         );
         Intrinsics.checkNotNullParameter(
            var9, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(21589, 28419578608407738L ^ var14)
         );
         Intrinsics.checkNotNullParameter(
            var10, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(26409, 5178648468583475141L ^ var14)
         );
         Intrinsics.checkNotNullParameter(
            var13, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(1677, 7180260645282776682L ^ var14)
         );
         return new llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
            var1, var5, var7, var9, var10, var11, var12, var13
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 83892835155723L;
         String var3 = this.fileName;
         String var4 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         String var5 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         String var6 = this.targetType;
         String var7 = this.parentFolder;
         long var8 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         long var10 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         me.octo.client.gui.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var12 = this.route;
         return "Entry(route="
            + var12
            + ", downloadedAt="
            + var10
            + ", localVersion="
            + var8
            + ", parentFolder="
            + var7
            + ", targetType="
            + var6
            + ", folder="
            + var5
            + ", subFolder="
            + var4
            + ", fileName="
            + var3
            + ")";
      }

      @Override
      public int hashCode() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII ^ 126445841212171L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[16];
         int var7 = 0;
         String var6 = "ujÁ)î\u0093É6\u00adò\fËAA\"ÿ\u0097úh>æÈ\u001bZ\u0018L\b¸guï:(à,\u009a\u0017¸ÃNxÊM1Å2}Fj ý»\u001dÑóm\\\u009d÷æBoñ\u00152båÅ¸Ûá\u0099h¸ðù>\nÐBCI\u00103ëapV±|/9ÓSº\u009d\u009bÄ½\u00186Ç'§TOÍ´±û¦$0À¶\u008c\u000b:ÂzP\u0099>w\u0018\u009dhNÊ¥o|®{/\u001bÊÙÖi5w\u009fÈ\u0017Á`\u0081. XY\u009b\u0019§eU¼\u0092Û\u008d}\u0011\u0000\"Â\u009a¸>*S[\u0083Á\u009e_Ì\u0004\u0016\u0015Ò)\u0010%Ò\u0080N¢\u0014\u009f\u0085\u0007£3R\u009dÓ\u0004\r \u0013ÇYÕ¢\u001e\u001d\u0081ô(\np\u000e\\\u0082$B{ i9\\\u0085\u0000¢n\u009cè¦\u009eyY\u0018MÞ*\u0013\u0095\u0096\u0080ÇY¬\u0091\u001aÕ6U\u0017XÎ7`ëå¸è &õ\u009cH\u007fNF\u0084\r.r\u0007\u000bj\u009e?gíÙj\u0084Ç\u0018\u0093ùê\r@ãJ\"6 TÐ½DÃCJ\u009f\u007fº°pz£\u0096aì©Ðñ\u0018Õ,@j\u009bÏî»©=\u0001 Qà&WÖ/\u0099±Éð\u0091\u00821\u0094Ø¥^_7@¸ç\u0084\u008a¿ÓÖÎEdØÒ rló\u0019\u0004\u0083tOF¹q\u009b\u008an\u0016\bÝ0\t\tÎ\u0011\u0097z\u0014~s\"]\u0096Y ";
         int var8 = "ujÁ)î\u0093É6\u00adò\fËAA\"ÿ\u0097úh>æÈ\u001bZ\u0018L\b¸guï:(à,\u009a\u0017¸ÃNxÊM1Å2}Fj ý»\u001dÑóm\\\u009d÷æBoñ\u00152båÅ¸Ûá\u0099h¸ðù>\nÐBCI\u00103ëapV±|/9ÓSº\u009d\u009bÄ½\u00186Ç'§TOÍ´±û¦$0À¶\u008c\u000b:ÂzP\u0099>w\u0018\u009dhNÊ¥o|®{/\u001bÊÙÖi5w\u009fÈ\u0017Á`\u0081. XY\u009b\u0019§eU¼\u0092Û\u008d}\u0011\u0000\"Â\u009a¸>*S[\u0083Á\u009e_Ì\u0004\u0016\u0015Ò)\u0010%Ò\u0080N¢\u0014\u009f\u0085\u0007£3R\u009dÓ\u0004\r \u0013ÇYÕ¢\u001e\u001d\u0081ô(\np\u000e\\\u0082$B{ i9\\\u0085\u0000¢n\u009cè¦\u009eyY\u0018MÞ*\u0013\u0095\u0096\u0080ÇY¬\u0091\u001aÕ6U\u0017XÎ7`ëå¸è &õ\u009cH\u007fNF\u0084\r.r\u0007\u000bj\u009e?gíÙj\u0084Ç\u0018\u0093ùê\r@ãJ\"6 TÐ½DÃCJ\u009f\u007fº°pz£\u0096aì©Ðñ\u0018Õ,@j\u009bÏî»©=\u0001 Qà&WÖ/\u0099±Éð\u0091\u00821\u0094Ø¥^_7@¸ç\u0084\u008a¿ÓÖÎEdØÒ rló\u0019\u0004\u0083tOF¹q\u009b\u008an\u0016\bÝ0\t\tÎ\u0011\u0097z\u0014~s\"]\u0096Y "
            .length();
         char var5 = 24;
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
                        llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var9;
                        lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new String[16];
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

                     var6 = "OÓ7ÿ\u000b\u00036.X9´O_u$¹,\u0090\t»§\u0007Ûk ¬z\u008eÿúBþ³\u0013GËX\u0017\u0018Í\u009fÓÊb¼:V\u009d\u000byÏâã8Éã\u0092";
                     var8 = "OÓ7ÿ\u000b\u00036.X9´O_u$¹,\u0090\t»§\u0007Ûk ¬z\u008eÿúBþ³\u0013GËX\u0017\u0018Í\u009fÓÊb¼:V\u009d\u000byÏâã8Éã\u0092".length();
                     var5 = 24;
                     var12 = -1;
               }

               var13 = var6.substring(++var12, var12 + var5);
               var10001 = 0;
            }
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 324;
         if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var5].getBytes("ISO-8859-1");
            lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5];
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
               "me/octo/client/modules/llIlllllllllllIlIIlIIIIlllIlllIIlIlllllIllIIIllIIlllIlIIlIlIlIlIIllllllIlllIIIlIlIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
