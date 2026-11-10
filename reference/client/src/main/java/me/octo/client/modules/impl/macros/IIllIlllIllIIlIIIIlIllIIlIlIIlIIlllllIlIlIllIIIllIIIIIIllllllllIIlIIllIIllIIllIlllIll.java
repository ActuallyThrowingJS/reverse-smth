package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll
   extends me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
   @Nullable
   private volatile Path llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private final ConcurrentHashMap<String, String> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   @Nullable
   private volatile String IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private static int IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static long IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = 55456012567154L;
   private static String[] lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static String[] lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private static Map IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new HashMap(13);
   private static long[] IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private static Integer[] lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private static Map IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private static long lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;

   public IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll(
      @NotNull String nameArg, @NotNull String descriptionArg, @NotNull String parentFolderNameArg, @NotNull List<String> requiredFilesArg
   ) {
      long var5 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ 82409752205688L;
      Intrinsics.checkNotNullParameter(nameArg, "name");
      Intrinsics.checkNotNullParameter(descriptionArg, "description");
      Intrinsics.checkNotNullParameter(parentFolderNameArg, "parentFolderName");
      Intrinsics.checkNotNullParameter(requiredFilesArg, "requiredFiles");
      super(nameArg, descriptionArg, parentFolderNameArg, new String[0], 0, requiredFilesArg, 16, null);
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new ConcurrentHashMap<>();
   }

   @Nullable
   @Override
   protected Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Continuation var3) {
      long var4 = var1 ^ 41573479150874L;
      return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(this, var4, var3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, String var2, Map var3, long var4) {
      var4 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ var4;
      long var6 = var4 ^ 2465746862091L;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4845941211238397821L, var4
      );
      List var9 = CollectionsKt.toList(var3.keySet());
      int var8 = var10000;
      int var10 = var9.indexOf(var2);

      label26: {
         try {
            if (var8 == 0) {
               break label26;
            }

            if (var10 < 0) {
               return;
            }
         } catch (Exception var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, -4816347113175971434L, var4
            );
         }

         try {
            ;
         } catch (Exception var13) {
            return;
         }
      }

      try {
         Minecraft var16 = Minecraft.getInstance();
         Intrinsics.checkNotNullExpressionValue(
            var16, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"v">(3375, 3874190379693104366L ^ var4)
         );
         Minecraft var11 = var16;
         var11.execute(
            IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
         );
      } catch (Exception var12) {
      }
   }

   @NotNull
   @Override
   protected Set IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, short param2, short param3, @NotNull Map param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var1,
      int var2,
      short var3,
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var4
   ) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var7 = (var5 ^ 95782915626999L) >>> 8;
      int var9 = (int)((var5 ^ 95782915626999L) << 56 >>> 56);
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3691699543132538631L, var5
      );
      Intrinsics.checkNotNullParameter(
         var4, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"v">(16804, 1083125662815035379L ^ var5)
      );
      int var10 = var10000;
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"v">(8335, 7644507336215527131L ^ var5),
         var7,
         (byte)var9,
         this.IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII()
      );
      me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var11 = new me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
      Map var12 = this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
      boolean var13 = false;
      Iterator var14 = var12.entrySet().iterator();

      String var10001;
      while (true) {
         if (var14.hasNext()) {
            Entry var15 = (Entry)var14.next();
            boolean var17 = false;
            String var18 = (String)var15.getKey();
            String var19 = (String)var15.getValue();

            try {
               var23 = var11;
               var10001 = var18;
               if (var10 == 0) {
                  break;
               }

               var11.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var18, var7, (byte)var9, var19);
               if (var10 != 0) {
                  continue;
               }
            } catch (IllegalStateException var21) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var21, 3651481250977121810L, var5
               );
            }
         }

         var23 = var4;
         var10001 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"v">(3679, 3154585418282913806L ^ var5);
         break;
      }

      try {
         var23.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10001, var7, (byte)var9, var11);
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               3587543411124276886L, var5
            )
            == null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               ++var10, 3725818760209934396L, var5
            );
         }
      } catch (IllegalStateException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, 3651481250977121810L, var5
         );
      }
   }

   @Override
   public void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull me.octo.client.gui.clickgui.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll() {
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
   }

   @Nullable
   public final String IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI(long var1) {
      var1 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ var1;
      long var3 = var1 ^ 120475413023057L;
      return lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            this.IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll(), var3
         );
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var0, String var1, long var2, int var4
   ) {
      var2 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ var2;
      long var5 = (var2 ^ 14878865922747L) >>> 16;
      int var7 = (int)((var2 ^ 14878865922747L) << 48 >>> 48);
      int var8 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3899539375775839646L, var2
      );

      try {
         int var10000;
         label25: {
            try {
               var10000 = Intrinsics.areEqual(var0.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll, var1);
               if (var8 != 0) {
                  break label25;
               }

               if (var10000 == 0) {
                  return;
               }
            } catch (Exception var10) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var10, -3989372186785776612L, var2
               );
            }

            var10000 = var4;
         }

         if (var10000 < var0.IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(var5, (char)var7).length) {
            var0.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var4);
         }
      } catch (Exception var11) {
      }
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Minecraft var0, IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var1, String var2, int var3, long var4
   ) {
      var4 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ var4;
      long var6 = var4 ^ 120976521411749L;
      Thread.sleep(lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll);
      var0.execute(
         IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
   }

   private static final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Minecraft var0, IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll var1, long var2, String var4, int var5
   ) {
      var2 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ var2;
      long var6 = var2 ^ 101870809418582L;
      new Thread(
            IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
         )
         .start();
   }

   public static void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0) {
      IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var0;
   }

   public static int llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII() {
      return IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   }

   public static int IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII() {
      int var0 = llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII();
      return var0 == 0 ? 122 : 0;
   }

   static {
      long var25 = IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII ^ 65010242095475L;
      byte var27 = 108;
      IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var27);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var17 = 1; var17 < 8; var17++) {
         var10003[var17] = (byte)(var25 << var17 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[20];
      int var21 = 0;
      String var20 = "\u0093ÅÁYÌ\u0089Ù¾DîO\u0081\u0097¬Ã\tH}Ä)9î3ïv÷[_u\u0007¡#\u0091âê\u0013d²w\u001d\u0080E&7ld\u0097_adÎfðë/\\\u0007yÍçb\u009bÈÕ\u0083\u0082\u0013¼§û\u00109<Ø\u0083áD°\u0093gªzpPÕ1\u0019Qø <s@\u0095\tl[¯ëT\u0097\u009a¿\u0016©M¸~Å\u0011í=\u008bgy\u0092 ìêÆý³\u0010©\u0092GÎ;í\u0006Õ\u009d»\u0013Õáöÿ\u0087\u0010\u0090èÃÃ0\u0001\u008a\u009e²\u0099iéÃû\u001f\u0005\u0010\u008f[<\u001a%³`áD\u0005ÙÂ\u0094Ç,Ä Z\u000e\u009eË]J\u000eäÓ}ÿÍr¾»{\u0003cóc\u001b$Ìn\u0091Ks\u009ch\u000bG\u0010(\u000bù\"3\u009bgÆy_ýü´lW\u0094\u0005ÃÄ²\u0084\u009c\u0097\u001aDDY+J¼\u009aI¥Áf\u008cÂ\u0014}\u0096ñ øìWñ+k/È\u009d-\u007fv¦\u0085\u0013\u009e8?è\u001b~\\\u008fe¿ê@N\u0010þ\u0004\u0088\u0010-{úF'G\u009eþ$\u009fM¦ø¼aO\u0018\niô\u0088 '4c¬Hp\u0087>ÈÈ\u008f¥ÝÃµ\u009cA\u0083} \u000e9$[\u000fÛþó\u009f\u0085ª«í\bs^4WøJ\u0098\u0007O\u008c\u00ad±\u001fÄ×Å¿\u0001\u0010£\u0005Ó6ÁóôA\u0001ßÑf4k\u0090¢\u0010\u00ad²V\u0080+R°>ZÐZãôÑà£\u0018\u001bÃ\u0013¾Óm\u0018>C\u008d&^äÙã\u0011Þ\u0099VÌÊ%u@\u0010¡»\u001c\u0094\u0097\u0094cÅJ:ÔfQl\u0083é ·Ì»\n\u0094Fï\u0016\u0015BõÃ Yì%\u008c{Tõ\u008aÌ\u009dN\u0016Æ\u00943\u008aÙN²\u00185\b\u0010å#¢Ò\u007f¬\u0013ÿÔJ^®0²^\u0085\u0012V¯i\\";
      int var22 = "\u0093ÅÁYÌ\u0089Ù¾DîO\u0081\u0097¬Ã\tH}Ä)9î3ïv÷[_u\u0007¡#\u0091âê\u0013d²w\u001d\u0080E&7ld\u0097_adÎfðë/\\\u0007yÍçb\u009bÈÕ\u0083\u0082\u0013¼§û\u00109<Ø\u0083áD°\u0093gªzpPÕ1\u0019Qø <s@\u0095\tl[¯ëT\u0097\u009a¿\u0016©M¸~Å\u0011í=\u008bgy\u0092 ìêÆý³\u0010©\u0092GÎ;í\u0006Õ\u009d»\u0013Õáöÿ\u0087\u0010\u0090èÃÃ0\u0001\u008a\u009e²\u0099iéÃû\u001f\u0005\u0010\u008f[<\u001a%³`áD\u0005ÙÂ\u0094Ç,Ä Z\u000e\u009eË]J\u000eäÓ}ÿÍr¾»{\u0003cóc\u001b$Ìn\u0091Ks\u009ch\u000bG\u0010(\u000bù\"3\u009bgÆy_ýü´lW\u0094\u0005ÃÄ²\u0084\u009c\u0097\u001aDDY+J¼\u009aI¥Áf\u008cÂ\u0014}\u0096ñ øìWñ+k/È\u009d-\u007fv¦\u0085\u0013\u009e8?è\u001b~\\\u008fe¿ê@N\u0010þ\u0004\u0088\u0010-{úF'G\u009eþ$\u009fM¦ø¼aO\u0018\niô\u0088 '4c¬Hp\u0087>ÈÈ\u008f¥ÝÃµ\u009cA\u0083} \u000e9$[\u000fÛþó\u009f\u0085ª«í\bs^4WøJ\u0098\u0007O\u008c\u00ad±\u001fÄ×Å¿\u0001\u0010£\u0005Ó6ÁóôA\u0001ßÑf4k\u0090¢\u0010\u00ad²V\u0080+R°>ZÐZãôÑà£\u0018\u001bÃ\u0013¾Óm\u0018>C\u008d&^äÙã\u0011Þ\u0099VÌÊ%u@\u0010¡»\u001c\u0094\u0097\u0094cÅJ:ÔfQl\u0083é ·Ì»\n\u0094Fï\u0016\u0015BõÃ Yì%\u008c{Tõ\u008aÌ\u009dN\u0016Æ\u00943\u008aÙN²\u00185\b\u0010å#¢Ò\u007f¬\u0013ÿÔJ^®0²^\u0085\u0012V¯i\\"
         .length();
      char var19 = 16;
      int var29 = -1;

      label56:
      while (true) {
         String var30 = var20.substring(++var29, var29 + var19);
         int var10001 = -1;

         while (true) {
            byte[] var24 = var16.doFinal(var30.getBytes("ISO-8859-1"));
            String var41 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var24).intern();
            switch (var10001) {
               case 0:
                  var23[var21++] = var41;
                  if ((var29 += var19) >= var22) {
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var23;
                     lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new String[20];
                     IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = new HashMap(13);
                     Cipher var5;
                     var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var6 = 1; var6 < 8; var6++) {
                        var10003[var6] = (byte)(var25 << var6 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var11 = new long[2];
                     int var8 = 0;
                     String var9 = "©À¥L¢\u000ej\u0084.b©\u0005µîb\u0085";
                     int var10 = "©À¥L¢\u000ej\u0084.b©\u0005µîb\u0085".length();
                     byte var7 = 0;

                     do {
                        var10001 = var7;
                        var7 += 8;
                        byte[] var12 = var9.substring(var10001, var7).getBytes("ISO-8859-1");
                        var10001 = var8++;
                        long var13 = (var12[0] & 255L) << 56
                           | (var12[1] & 255L) << 48
                           | (var12[2] & 255L) << 40
                           | (var12[3] & 255L) << 32
                           | (var12[4] & 255L) << 24
                           | (var12[5] & 255L) << 16
                           | (var12[6] & 255L) << 8
                           | var12[7] & 255L;
                        byte[] var15 = var5.doFinal(
                           new byte[]{
                              (byte)(var13 >>> 56),
                              (byte)(var13 >>> 48),
                              (byte)(var13 >>> 40),
                              (byte)(var13 >>> 32),
                              (byte)(var13 >>> 24),
                              (byte)(var13 >>> 16),
                              (byte)(var13 >>> 8),
                              (byte)var13
                           }
                        );
                        long var10004 = (var15[0] & 255L) << 56
                           | (var15[1] & 255L) << 48
                           | (var15[2] & 255L) << 40
                           | (var15[3] & 255L) << 32
                           | (var15[4] & 255L) << 24
                           | (var15[5] & 255L) << 16
                           | (var15[6] & 255L) << 8
                           | var15[7] & 255L;
                        byte var48 = -1;
                        var11[var10001] = var10004;
                     } while (var7 < var10);

                     IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var11;
                     lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new Integer[2];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var25 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var25 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = -1227846586506392451L;
                     byte[] var4 = var0.doFinal(
                        new byte[]{
                           (byte)(var2 >>> 56),
                           (byte)(var2 >>> 48),
                           (byte)(var2 >>> 40),
                           (byte)(var2 >>> 32),
                           (byte)(var2 >>> 24),
                           (byte)(var2 >>> 16),
                           (byte)(var2 >>> 8),
                           (byte)var2
                        }
                     );
                     long var46 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     byte var39 = -1;
                     lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = var46;
                     return;
                  }

                  var19 = var20.charAt(var29);
                  break;
               default:
                  var23[var21++] = var41;
                  if ((var29 += var19) < var22) {
                     var19 = var20.charAt(var29);
                     continue label56;
                  }

                  var20 = "9akXtÔ\u001eäBà\u008e=9/Hÿ\u008eP \u0007îù}<\u0088Ùý\u0010\u0014y×E\u0092\u0000\u0099`\f§îr\u0010É\u0094mp\u0099¥®¹y\u0087\u0092Ü;\u00160\"";
                  var22 = "9akXtÔ\u001eäBà\u008e=9/Hÿ\u008eP \u0007îù}<\u0088Ùý\u0010\u0014y×E\u0092\u0000\u0099`\f§îr\u0010É\u0094mp\u0099¥®¹y\u0087\u0092Ü;\u00160\""
                     .length();
                  var19 = '(';
                  var29 = -1;
            }

            var30 = var20.substring(++var29, var29 + var19);
            var10001 = 0;
         }
      }
   }

   private static Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0) {
      return var0;
   }

   private static String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(byte[] var0) {
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

   private static String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28257;
      if (lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll", var10
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
         byte[] var9 = lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII[var5].getBytes("ISO-8859-1");
         lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII[var5];
   }

   private static Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7782;
      if (lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl[var3] == null) {
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
         long var5 = IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var3];
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
         Object[] var9 = (Object[])IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl[var3] = var15;
      }

      return lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl[var3];
   }

   private static int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
