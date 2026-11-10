package me.octo.client.modules;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI {
   @NotNull
   private final String parentFolderName;
   @NotNull
   private final Lazy lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 91949038717440L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   public lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI(@NotNull String parentFolderNameArg) {
      long var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 132053236038072L;
      long var10001 = var2 ^ 91972664816122L;
      int var4 = (int)((var2 ^ 91972664816122L) >>> 32);
      int var5 = (int)((var2 ^ 91972664816122L) << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(parentFolderNameArg, "parentFolderName");
      super();
      this.parentFolderName = parentFolderNameArg;
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = LazyKt.lazy(
         lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
   }

   @NotNull
   public final String getParentFolderName() {
      return this.parentFolderName;
   }

   @NotNull
   public final Path llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      Lazy var1 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      return (Path)var1.getValue();
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, @NotNull String param2, int param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, @NotNull String param3, @NotNull String param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1, int param2, @NotNull String param3, @NotNull String param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, @NotNull String param3, @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1,
      long param2,
      @NotNull String param4,
      @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1,
      @NotNull String param2,
      long param3,
      @NotNull String param5,
      @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte param1, @NotNull String param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull String var1, long var2) {
      var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
      long var4 = var2 ^ 26215565969535L;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         4838994287313235267L, var2
      );
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(31852, 9089412317813506852L ^ var2)
      );
      int var6 = var10000;
      Path var7 = lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, this.parentFolderName, var1);

      label30: {
         try {
            if (var6 != 0) {
               break label30;
            }

            LinkOption[] var10001 = new LinkOption[0];
            if (!Files.exists(var7, Arrays.copyOf(var10001, var10001.length))) {
               return false;
            }
         } catch (Exception var12) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var12, 4759647984131657490L, var2
            );
         }

         try {
            File var14 = var7.toFile();
            Intrinsics.checkNotNullExpressionValue(
               var14, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(29124, 4711827545855954560L ^ var2)
            );
            FilesKt.deleteRecursively(var14);
         } catch (Exception var11) {
            return false;
         }
      }

      boolean var8;
      try {
         var8 = true;
      } catch (Exception var10) {
         var8 = false;
      }

      return var8;
   }

   public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull String param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(@NotNull String var1, long var2) {
      var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
      long var4 = var2 ^ 116764691311832L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(2669, 6196013511919522441L ^ var2)
      );
      Path var10000 = lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this.parentFolderName, var1, var4);
      LinkOption[] var10001 = new LinkOption[0];
      return Files.exists(var10000, Arrays.copyOf(var10001, var10001.length));
   }

   @NotNull
   public final List IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      int var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3384841688266536157L, var1
      );

      List var4;
      try {
         Iterable var16 = PathsKt.listDirectoryEntries(
            this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"c">(13089, 3506240721792654988L ^ var1)
         );
         boolean var5 = false;
         Collection var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var16, 10));
         boolean var8 = false;

         Collection var10000;
         label24: {
            for (Object var10 : var16) {
               var10000 = var7;
               if (var3 == 0) {
                  break label24;
               }

               Path var11 = (Path)var10;
               boolean var12 = false;
               var7.add(PathsKt.getNameWithoutExtension(var11));
               if (var3 == 0) {
                  break;
               }
            }

            var10000 = var7;
         }

         var4 = (List)var10000;
      } catch (Exception var14) {
         var4 = CollectionsKt.emptyList();
      }

      return var4;
   }

   @NotNull
   public final List IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      int var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7527884793545426461L, var1
      );

      List var4;
      try {
         Iterable var19 = PathsKt.listDirectoryEntries$default(
            this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(), null, 1, null
         );
         boolean var5 = false;
         Iterable var6 = var19;
         var var7 = new ArrayList();
         boolean var8 = false;
         Iterator var9 = var19.iterator();

         while (true) {
            if (!var9.hasNext()) {
               var var20 = (Iterable & List)var7;
               var5 = false;
               var6 = var20;
               var7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var20, 10));
               boolean var10000 = false;
               break;
            }

            Object var10 = var9.next();
            Path var11 = (Path)var10;
            boolean var14 = false;
            if (var3 != 0) {
               break;
            }

            try {
               LinkOption[] var10001 = new LinkOption[0];
               if (!Files.isDirectory(var11, Arrays.copyOf(var10001, var10001.length))) {
                  continue;
               }
            } catch (Exception var16) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var16, -7589214500293076046L, var1
               );
            }

            var7.add(var10);
         }

         Object var25;
         label36: {
            for (Object var23 : var6) {
               if (var3 != 0) {
                  var25 = var7;
                  break label36;
               }

               Path var24 = (Path)var23;
               boolean var12 = false;
               var7.add(PathsKt.getName(var24));
               if (var3 != 0) {
                  break;
               }
            }

            var25 = var7;
         }

         var4 = (List)var25;
      } catch (Exception var17) {
         var4 = CollectionsKt.emptyList();
      }

      return var4;
   }

   private static final Path IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0, char var1, lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var2, char var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      long var10001 = var4 ^ 116560597732553L;
      int var6 = (int)((var4 ^ 116560597732553L) >>> 48);
      int var7 = (int)((var4 ^ 116560597732553L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2.parentFolderName, (char)var6, (short)var7, var8);
   }

   static {
      long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 106499020383835L;
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
      String var6 = "M^C=[C\u001e\u001eC?f^\u009eÛk£\u0091îcý¦0B\u001d_¨·|Ñd°í\u009d\u0099u\u0099\u000b\u00807 \u0010O\u0006)\bÕc\\ò[\tï\u0006\u0092]£ü\u0010_!I~(\u0084+U-ï¯\u001eð?ñ\u0092\u0010ï=\u0089æ§\u0006#M~Q¨\u0004OÝ\u0002P \u0019SÊ\u0015\fçOG\u001cÚ5æâO?Q\u0019l©³¿4¸oÕ\u0011êZ\u008aÛð\u0002 L\u0099Ø\nÛ\u0080+i\u009bÇ¶å\u000fW¦Ìpêó\u001a*¯oÁÚ\u0005×Sònx3\u0018\nþâQl\u008b\u0084á5-PøGI\bö8?êlÌ#9Î([Lï\u0098º>^\u0085t\u0004\u0007j·%ÓPB¸þÌ\u008c\u0014\bçx\u009b>~ë>\u0002Ð·\u0093À\u008c0\n¸§\u0018@àãJÞ\u0089®Ø,\u0085bæ¡\u001d\u00101¦\u0010'Ï\u009cþý~ ÛÅæ°ÐP\u0096Ä Z65ê¨,\nW'Ø§ðwn\rd\u0082Ê0IpN\u0005(Ý|×Á\u0014³Ã\u009e\u009b\u0091¢ö\u0087\u0086Pú\u0092ïð@\u0091íå¼Â\u0019ïç\t©w\u0005ÒÂ\u001d7â\u0013\u0088O \nÿ$X¾¯U°µ®@Z22ÌwPA\u008fHbDµà6\u000e6éÁ1Üú\u0018×ä?MLß(¿\u0002Î\u00111Püþy\u009bÅ\u0086\u009fëÏoÈ\u0010\u0087ç (§å\u000bQ»l®\u008f&w_0";
      int var8 = "M^C=[C\u001e\u001eC?f^\u009eÛk£\u0091îcý¦0B\u001d_¨·|Ñd°í\u009d\u0099u\u0099\u000b\u00807 \u0010O\u0006)\bÕc\\ò[\tï\u0006\u0092]£ü\u0010_!I~(\u0084+U-ï¯\u001eð?ñ\u0092\u0010ï=\u0089æ§\u0006#M~Q¨\u0004OÝ\u0002P \u0019SÊ\u0015\fçOG\u001cÚ5æâO?Q\u0019l©³¿4¸oÕ\u0011êZ\u008aÛð\u0002 L\u0099Ø\nÛ\u0080+i\u009bÇ¶å\u000fW¦Ìpêó\u001a*¯oÁÚ\u0005×Sònx3\u0018\nþâQl\u008b\u0084á5-PøGI\bö8?êlÌ#9Î([Lï\u0098º>^\u0085t\u0004\u0007j·%ÓPB¸þÌ\u008c\u0014\bçx\u009b>~ë>\u0002Ð·\u0093À\u008c0\n¸§\u0018@àãJÞ\u0089®Ø,\u0085bæ¡\u001d\u00101¦\u0010'Ï\u009cþý~ ÛÅæ°ÐP\u0096Ä Z65ê¨,\nW'Ø§ðwn\rd\u0082Ê0IpN\u0005(Ý|×Á\u0014³Ã\u009e\u009b\u0091¢ö\u0087\u0086Pú\u0092ïð@\u0091íå¼Â\u0019ïç\t©w\u0005ÒÂ\u001d7â\u0013\u0088O \nÿ$X¾¯U°µ®@Z22ÌwPA\u008fHbDµà6\u000e6éÁ1Üú\u0018×ä?MLß(¿\u0002Î\u00111Püþy\u009bÅ\u0086\u009fëÏoÈ\u0010\u0087ç (§å\u000bQ»l®\u008f&w_0"
         .length();
      char var5 = '(';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var21;
         if ((var4 += var5) >= var8) {
            var6 = "Å\u001bÑ\u0011\u000f6þ#lO¹¦é1\b}\u008e¬`zk½Þâ`Ñ%\bÅôVDÙ\u000f\u009b@q\u0082#7.ë\u0089\u0007Áp\u0087ß·î*ë°\u009eXËñB)T\u00850)\u0005qêÊj\u008d\u0085\u0097,CX\u0014´¸\u001c°Ë\u0014ÜP\u009fu\u0085\u0089\u0099Öû\u0010xd©\u00859*D>||\u0090©\"Ï\u001d\u0003f\u0086^!H~\u0095àºKu\u0012Ñ\u008d";
            var8 = "Å\u001bÑ\u0011\u000f6þ#lO¹¦é1\b}\u008e¬`zk½Þâ`Ñ%\bÅôVDÙ\u000f\u009b@q\u0082#7.ë\u0089\u0007Áp\u0087ß·î*ë°\u009eXËñB)T\u00850)\u0005qêÊj\u008d\u0085\u0097,CX\u0014´¸\u001c°Ë\u0014ÜP\u009fu\u0085\u0089\u0099Öû\u0010xd©\u00859*D>||\u0090©\"Ï\u001d\u0003f\u0086^!H~\u0095àºKu\u0012Ñ\u008d"
               .length();
            var5 = '\u0018';
            var4 = -1;

            while (true) {
               var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               boolean var19 = false;
               var9[var7++] = var23;
               if ((var4 += var5) >= var8) {
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[16];
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16089;
      if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/modules/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
            "me/octo/client/modules/lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$963cec5b9933d358(
      long argument1Arg, @NotNull String fileNameArg, @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII routeArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0b2ad8424050fd3d(
      long argument1Arg, @NotNull String folderNameArg, @NotNull String fileNameArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$a7c2341ee2ae807b(
      @NotNull String folderNameArg,
      long argument2Arg,
      @NotNull String fileNameArg,
      @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII routeArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$275b03d99e45f502(
      @NotNull String folderNameArg,
      @NotNull String subFolderNameArg,
      long argument3Arg,
      @NotNull String fileNameArg,
      @NotNull IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII routeArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7c2ed6fdb278ea6c(
      int argument1Arg, @NotNull String fileNameArg, int argument3Arg, int argument4Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final IIllIIIIllIlIIIlIIIIlIIlIIllIlIIlIIlIlIlIlIIIIlllIIIIlIllllIlIllIIIIIIlllIlllIIIIllII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$8b57e081b0387389(
      @NotNull String folderNameArg, int argument2Arg, @NotNull String subFolderNameArg, @NotNull String fileNameArg, char argument5Arg, int argument6Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
