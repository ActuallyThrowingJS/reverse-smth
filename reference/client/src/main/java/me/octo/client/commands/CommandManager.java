package me.octo.client.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.packet.ChatCommandSendEvent;
import me.octo.client.events.impl.packet.PacketSendEvent;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CommandManager {
   @NotNull
   public static CommandManager.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final List<lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII> lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private final List<Class<?>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private final List<Class<? extends IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   public static char IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   public static CommandManager IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   @JvmField
   public static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   @NotNull
   private static Set<String> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 45270816573826L;
   private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

   public CommandManager() {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 54577125252019L;
      long var3 = var1 ^ 129312225879439L;
      long var10001 = var1 ^ 76992905085662L;
      int var5 = (int)((var1 ^ 76992905085662L) >>> 32);
      int var6 = (int)((var1 ^ 76992905085662L) << 32 >>> 56);
      int var7 = (int)(var10001 << 40 >>> 40);
      super();
      this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new ArrayList<>();
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ArrayList<>();
      Class[] var8 = new Class[]{
         lIIlIIlllIllIlIIIlIlIIlIlIIllllIIIIlIlIllIlllllllIIllIlllIIllIllIlIlIIllIllIlIIllIlII.class,
         llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll.class,
         lllIllIlIlIIllIlIIIllllIlIlIllIlIlIlIlIIlIllIllIIlIlIIlIlllIlIlIIIIIIlIlllIIIIIIIIIII.class,
         llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.class,
         IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.class,
         lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI.class,
         lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.class,
         lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.class,
         IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.class,
         lIllIllIIlIIlllIIIIIlIIlIlIIIIlIIlIllIIIIIIIIIlIIIIlIIlIlllIIIIIlIIIlIIIIIllIllIlIIIl.class
      };
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = CollectionsKt.listOf(var8);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var5, (byte)var6, var7, this
      );
      ClientCommandRegistrationCallback.EVENT.register(CommandManager::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
   }

   @NotNull
   public final List<lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Class param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var3 = var1 ^ 42672442581728L;
      long var5 = var1 ^ 63165704193569L;
      long var7 = var1 ^ 79314260561501L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         3052910926486111251L, var1
      );
      Iterator var10 = me.octo.client.modules.manager.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
         .iterator();
      String var9 = var10000;

      while (var10.hasNext()) {
         me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII var11 = (me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII)var10.next();

         try {
            if (var9 != null
               || !me.octo.client.modules.manager.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var5)) {
               continue;
            }
         } catch (Exception var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, 2947963028050448207L, var1
            );
         }

         try {
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var7,
               lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var3, true)
            );
         } catch (Exception var13) {
            PolinexLogger.error(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(11172, 1402123877416284283L ^ var1)
                  + var11.getCommandName()
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(10786, 117096911756997105L ^ var1)
                  + var13
            );
            if (var9 != null) {
               break;
            }
         }
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var3
   ) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7890728066731623372L, var1
      );
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(408, 1746018554366746081L ^ var1)
      );
      String var4 = var10000;
      Iterable var6 = CollectionsKt.plus(CollectionsKt.listOf(var3.getMetadata().getName()), var3.getMetadata().getAliases());
      boolean var7 = false;
      Collection var9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(var6, 10));
      boolean var10 = false;
      Iterator var11 = var6.iterator();

      while (true) {
         if (var11.hasNext()) {
            Object var12 = var11.next();
            if (var4 != null) {
               var45 = var9;
               break;
            }

            String var13 = (String)var12;
            boolean var14 = false;
            String var10001 = var13.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(
               var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(16734, 1103449503550381315L ^ var1)
            );
            var9.add(var10001);
            if (var4 == null) {
               continue;
            }

            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[3], 7977660184937048822L, var1
            );
         }

         var45 = var9;
         break;
      }

      List var5 = (List)var45;
      Iterable var24 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var8 = false;
      var var30 = new ArrayList();
      boolean var34 = false;
      Iterator var37 = var24.iterator();

      while (true) {
         if (var37.hasNext()) {
            Object var40 = var37.next();
            var10000 = var4;
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var43 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var40;
            boolean var15 = false;
            Iterable var44 = CollectionsKt.plus(CollectionsKt.listOf(var43.getMetadata().getName()), var43.getMetadata().getAliases());

            try {
               if (var10000 != null) {
                  break;
               }

               CollectionsKt.addAll(var30, var44);
               if (var4 == null) {
                  continue;
               }
            } catch (IllegalStateException var21) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var21, 8013634161922132112L, var1
               );
            }
         }

         var24 = var30;
         break;
      }

      Collection var26 = new HashSet();
      boolean var28 = false;
      Iterator var31 = var24.iterator();

      while (true) {
         if (var31.hasNext()) {
            Object var35 = var31.next();
            if (var4 != null) {
               var47 = var26;
               break;
            }

            String var38 = (String)var35;
            boolean var41 = false;
            String var50 = var38.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(
               var50, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(13169, 6072148185839562614L ^ var1)
            );
            var26.add(var50);
            if (var4 == null) {
               continue;
            }
         }

         var47 = var26;
         break;
      }

      HashSet var23 = (HashSet)var47;
      Iterable var27 = var5;
      boolean var29 = false;
      Iterator var32 = var27.iterator();

      label64:
      while (true) {
         if (var32.hasNext()) {
            Object var36 = var32.next();
            var10000 = (String)var36;

            while (true) {
               String var39 = var10000;
               boolean var42 = false;
               if (!var23.contains(var39)) {
                  continue label64;
               }

               if (var4 == null) {
                  var10000 = (String)var36;
                  break label64;
               }

               var10000 = (String)var36;
            }
         }

         var10000 = null;
         break;
      }

      String var25 = var10000;

      label101: {
         try {
            if (var4 != null) {
               return;
            }

            if (var25 != null) {
               break label101;
            }
         } catch (IllegalStateException var20) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var20, 8013634161922132112L, var1
            );
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.add(var3);
         return;
      }

      var10 = false;
      throw new IllegalStateException(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(4915, 8260061753256890168L ^ var1)
            + var25
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(18425, 4770396192015326086L ^ var1)
      );
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var3 = var1 ^ 50339404222574L;
      String var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5096801875199158518L, var1
      );

      boolean var10000;
      label42: {
         try {
            var10000 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
            if (var5 != null) {
               break label42;
            }

            if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll) {
               return;
            }
         } catch (IllegalStateException var13) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var13, 4903330225380254634L, var1
            );
         }

         var10000 = true;
      }

      lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var10000;
      Iterable var6 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      boolean var7 = false;
      Iterator var8 = var6.iterator();

      while (true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            String var15 = var5;
            Class var10 = (Class)var9;
            boolean var11 = false;

            try {
               this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, var3);
               if (var15 != null) {
                  break;
               }

               if (var5 == null) {
                  continue;
               }
            } catch (IllegalStateException var12) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var12, 4903330225380254634L, var1
               );
            }
         }

         PolinexLogger.info(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(15150, 5226584718323502110L ^ var1)
               + this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size()
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(18689, 2030849568855899747L ^ var1)
         );
         break;
      }
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull PacketSendEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull ChatCommandSendEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(short param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull String param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var1, char var3, @NotNull String var4
   ) {
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      long var10001 = var5 ^ 133674458382583L;
      int var7 = (int)((var5 ^ 133674458382583L) >>> 32);
      int var8 = (int)((var5 ^ 133674458382583L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(21126, 3811846641974463216L ^ var5)
      );
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6202194733275707488L, var5
      );
      String var11 = me.octo.client.gui.clickgui.endgameGUI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl();
      String var10 = var10000;

      label80: {
         label79: {
            boolean var18;
            label78: {
               try {
                  var18 = StringsKt.isBlank(var11);
                  if (var10 != null) {
                     break label78;
                  }

                  if (!var18) {
                     break label79;
                  }
               } catch (IllegalStateException var22) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var22, -6099498623895204612L, var5
                  );
               }

               var29 = false;
               break label80;
            }

            var29 = var18;
            break label80;
         }

         var29 = true;
      }

      label100: {
         try {
            if (var29 && StringsKt.equals(var4, var11, true)) {
               break label100;
            }
         } catch (IllegalStateException var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, -6099498623895204612L, var5
            );
         }

         Iterable var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var13 = false;

         for (Object var15 : var12) {
            var10000 = (String)var15;

            while (true) {
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var16 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var10000;
               boolean var17 = false;
               if (!me.octo.client.commands.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16, var7, (byte)var8, var4, var9)) {
                  break;
               }

               if (var10 == null) {
                  return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var15;
               }

               var10000 = (String)var15;
            }
         }

         return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)null;
      }

      Iterable var23 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var24 = false;

      for (Object var26 : var23) {
         var10000 = (String)var26;

         while (true) {
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var27 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var10000;
            boolean var28 = false;
            if (!StringsKt.equals(
               var27.getMetadata().getName(),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(6018, 5528818545692381081L ^ var5),
               true
            )) {
               break;
            }

            if (var10 == null) {
               return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var26;
            }

            var10000 = (String)var26;
         }
      }

      return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)null;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(CommandDispatcher var1, long var2) {
      var2 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var2;
      long var4 = var2 ^ 139712636734557L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6279983110500022636L, var2
      );
      Iterator var7 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.iterator();
      String var6 = var10000;

      label25:
      while (var7.hasNext()) {
         var10000 = (String)var7.next();

         while (true) {
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var8 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var10000;
            Iterator var9 = CollectionsKt.plus(CollectionsKt.listOf(var8.getMetadata().getName()), var8.getMetadata().getAliases()).iterator();

            while (true) {
               if (!var9.hasNext()) {
                  continue label25;
               }

               var10000 = (String)var9.next();
               if (var6 != null) {
                  break;
               }

               String var10 = var10000;
               var1.register(this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8, var4, var10));
               if (var6 != null) {
                  break label25;
               }
            }
         }
      }

      PolinexLogger.info(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(23612, 1180670032919381306L ^ var2)
            + this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII.size()
            + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(26528, 4611755402388471523L ^ var2)
      );
   }

   private final LiteralArgumentBuilder IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII param1, long param2, String param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final RequiredArgumentBuilder IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(int var1, int var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      long var10001 = var4 ^ 41117180892741L;
      int var6 = (int)((var4 ^ 41117180892741L) >>> 48);
      int var7 = (int)((var4 ^ 41117180892741L) << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      return (RequiredArgumentBuilder)RequiredArgumentBuilder.argument(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(14667, 6477707866056871074L ^ var4),
            (ArgumentType)StringArgumentType.greedyString()
         )
         .executes(CommandManager::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      ArgumentBuilder param1, lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII param2, long param3, int param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final ArgumentType IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, CommandContext var3) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var4 = var1 ^ 41995056280819L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1747837109338715661L, var1
      );
      String var7 = var3.getInput();
      String var6 = var10000;
      String var8 = var7;

      label36: {
         label35: {
            label41: {
               try {
                  Intrinsics.checkNotNull(var8);
                  if (var6 != null) {
                     break label35;
                  }

                  if (StringsKt.startsWith$default(var8, "/", false, 2, null)) {
                     break label41;
                  }
               } catch (IllegalStateException var11) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var11, -1942962418163563857L, var1
                  );
               }

               var8 = var7;

               try {
                  if (var6 != null) {
                     return;
                  }

                  Intrinsics.checkNotNull(var8);
                  if (!StringsKt.startsWith$default(var8, '.', false, 2, null)) {
                     break label36;
                  }
               } catch (IllegalStateException var10) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var10, -1942962418163563857L, var1
                  );
               }
            }

            Intrinsics.checkNotNull(var7);
            var8 = var7;
         }

         byte var9 = 1;
         var10000 = var8.substring(var9);
         Intrinsics.checkNotNullExpressionValue(
            var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(9974, 172062993518653604L ^ var1)
         );
         var7 = var10000;
      }

      Intrinsics.checkNotNull(var7);
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var7);
   }

   private final CompletableFuture IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String param1, int param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      CommandManager var0, long var1, CommandDispatcher var3, CommandBuildContext var4
   ) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var5 = var1 ^ 72278361988738L;
      long var7 = var1 ^ 58279485161948L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(23832, 1497860325965255425L ^ var1)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(22465, 1002102170965301737L ^ var1)
      );
      var0.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var7);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var5);
   }

   private static final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      CommandManager var0, long var1, CommandContext var3
   ) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var4 = var1 ^ 74824984169142L;
      Intrinsics.checkNotNull(var3);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
      return 1;
   }

   private static final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short var0, CommandManager var1, int var2, int var3, CommandContext var4
   ) {
      long var5 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      long var7 = var5 ^ 6272118044111L;
      Intrinsics.checkNotNull(var4);
      var1.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7, var4);
      return 1;
   }

   private static final CompletableFuture IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII var2, CommandContext var3, SuggestionsBuilder var4
   ) {
      var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var0;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1268791700666007511L, var0
      );
      String var10002 = var4.getRemaining();
      Intrinsics.checkNotNullExpressionValue(
         var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(4722, 3247417239636659678L ^ var0)
      );
      var10002 = var10002.toLowerCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(
         var10002, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(13169, 6072186484173532307L ^ var0)
      );
      Iterable var6 = var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10002);
      boolean var7 = false;
      Iterator var8 = var6.iterator();
      String var5 = var10000;

      while (var8.hasNext()) {
         Object var9 = var8.next();
         var10000 = var5;
         String var10 = (String)var9;
         boolean var11 = false;

         try {
            var4.suggest(var10);
            if (var10000 == null && var5 == null) {
               continue;
            }
            break;
         } catch (IllegalStateException var12) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var12, -1381758208612938891L, var0
            );
         }
      }

      return var4.buildFuture();
   }

   private static final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      CommandManager var0, long var1, CommandContext var3
   ) {
      var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var1;
      long var4 = var1 ^ 89194215940478L;
      Intrinsics.checkNotNull(var3);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
      return 1;
   }

   private static final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      long var0, CommandManager var2, CommandContext var3
   ) {
      var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ var0;
      long var4 = var0 ^ 42368470997742L;
      Intrinsics.checkNotNull(var3);
      var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
      return 1;
   }

   @JvmStatic
   @NotNull
   public static final CompletableFuture<Suggestions> completeSuggestions(@NotNull String var0, int var1) {
      long var2 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 27874664948669L;
      long var10001 = var2 ^ 125051512450216L;
      int var4 = (int)((var2 ^ 125051512450216L) >>> 56);
      int var5 = (int)((var2 ^ 125051512450216L) << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var0, var1, (byte)var4, var5, var6
      );
   }

   @JvmStatic
   public static final boolean isCustomCommand(@NotNull String var0) {
      long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 94701423471510L;
      long var3 = var1 ^ 58751907943709L;
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$75fb3e4f60576feb(
         var3, var0
      );
   }

   static {
      long var16 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 26470978943378L;
      Object var19 = null;
      IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII((String)var19);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var8 = 1; var8 < 8; var8++) {
         var10003[var8] = (byte)(var16 << var8 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[82];
      int var12 = 0;
      String var11 = "A+\nìJJ\u0003ò\u0087e±Ì\u000bÂ\u0091/ñwß)ëÅá£\u008e\b$^Ð[E«`ßóíI\u0015g£dÄ$9u|\u001axÈÜ\u009e0@ÏÂEïò¨ \u008fÀ¬(6\u001d}\u007f\u0098\u0094r\u001aÖÿä\u007f·N?\u009dö¨^\u008fDtT\u008eoëuû°ö¼¶¨Éÿ\u0084o8bF\u0092Óá\u0084ÇË\bù\u0093\u0004]:\u0092îd\u0085ë]¤Jº\u008d>û\u009b(h®ü\\®Þ\u0007»}#L\u008d\u009eo\u0098\f!;\\¢\u009dÂQ5âÌâ®aÜ\u0085Ê\u0010Þ'^\u008cK/¯\u0010\u0085\u0087B@'K\u009a\u0002\u008a\u0099E#]ä\u0087ð(þ6áÐ\u0005\u0004P[R\u0015?\u0000SM¡bV\u0002)\u0007(\t)ë~ë@oO\u0094üü=R¿VG÷\u009e«\u0010ä¦\u00904¯\u0098zR>öá\u00996/¾\u0004\u0018\u007fæ\u0091ßyp\u0086ïñ\u0097\u0094c\u008d\u00ad±7Ï»áR¬MzA 7\u007fü\u0090Ò,ÀxÂ\u009eÂÄÎÜ\u0002Ä\rQ£M/ô\u0093~%I¤¨?\u001f`\u0010@Y\u001fñ\u0087C\u001a·Nø©N¯\u001d^Z¸4öQòÎ_]ôÄÈ³\u008cá'áí¸ãZ\u0012[ Pí\u0091ö³!¡|\u0000Aê\u0083E\u0095£~\f\u0004ÛU]yb\u0082Ý^\u0018<\u001bVíMs%\u0084°5»«!Y³°«½\u001dð~*\u009cW ÁfÆÄÅ\u0019pÔEÇy[ÅÑÉ\u000b\u0087»\t!w!C÷Fô.'^\u008bÆ(\u0010\u0019\u007f[Ø6iÞ®\fkø\u009cÌ9º_ ¿Þú.Éh\u0015ÁwÍ²\u0006\u001b\u0014\u0000\t\u0094o/g*.¹°»Ñb\u008f³\u0088Ú\u008d(µb\u008f8Z\u009a\u008dG\u0006©O2Â}À³° :\u0011\r3ä\u0089÷\u0081p\u0087ªbÈ\røH\u0000R^9WN(¼CV¬M\f}oá?Ðrh\u0007GÕAÃ²(*.\u0084ölÜå×\u0096~\u001ca»\u0019G\u0092£í\u0081\u001e »ÃðA/Å4óål\u0093»&²\u009b1D½\u0082Þ\u0093&.\\ÿ\\ÃÑ¦\u001e7d Þ¸í5ø+\u0095ó³/\u008a\u0019É×@R\u0099ÒàOÏ\u0090\u001bt¬¼%w8ª\u000fï\u0010á7(ï\b4(¿_v\u00018Un½\u00950\u007f\u0016?$|(2u(\u0096\u0087í3@½O:/«?JE·4`PåX\u008a\u0001&~ø\u0086ß²-kÙ2\u0093\u0086cÖ¢Q\u009chP\u008e\u008a¥\u0090°×\u0012¥ÏW±ÙKø4ÕÀs^6\u007f2cÙ£Ê®@^©oFg`¶\u0010\u0001\u0088íO;lÿÜ?Âûû\u009dÅJ×Ïù®¼CAc»\u009bØ\u0096RËÄ:î\u0001\t\u00987¦\u0097©\u0013ßò\r+\u0018\u009b«·6\u008d¤>mÀþÔ´\u0012x®þ\u0098\u0086°*\u0001}äÕ ³\u0010ªNÅ¾-\n»{ªjm],[7\u0000ÀèÄõ¶xqHrw\u009a<¦z(V!\bªèuõôYÄ*\u007fÝ\u0099ß\u008dÀMÐ\u001a:\u0080æ\u00050V²«}¨\u0013HX`Ò\u00adÝoÌ(\u0010\u0084\u00920\u0011.\u0088Ðérç|\u0017\r\u0016Qï(bý¸5\u0088Ã\u0006`vDÈ\u0092\u000eÿ\u0013Û\u009a)F\u008e\u0005\u0096!\u008eâb(ö\u0080ð/ò0\u0018\u008cÙÔ6Þ\u009489\u001eï·[Å»þB\u009f\u008dm'Í:\u0092\u0085\u0089@µ\u0001vjì\u0007Ë\u0010*Jyó¯¸úËÅE-ª±»Ð\u008fâZ\u0010:Ç\u00853ÖA<æ á\u0098}ÏiU\u0015þï#Aò_ðBW 0ë(CÑC§õ3)¹\f\u001cq\b1õ»S\u009c;s\u0097Ã]ª»S´V\u000f\u0004\u0083Ð&\u000e\u008bZ\u00adN¬5AAþ_\u00016\u0010éf9\u0001ÿF].\u0094/\u009bëî\u0018[n\u0082Ðó\u0094\u0001,õ\u0083U±ò\u009a\rí\u0092ö®±)Ï$¢\b¢jø¬\u000béûK× cb\u0017_Óócj\u007f\u0002\u0097\u0099^Éw^\u0005\u0010¹°ã\"W\b\u0087ò\u009c\u008b\u0011ÝÊ\u0083\u001fh\u000b'îkª\u0018\u008a*J\u0014¡ÅØºë\u0016\u0085Î\u008cE\u000bhé\\Tú)¿â@(ëa¯~ÃÙ¿àî Hy\u001c\r¸|ú®A\u001f&214\u000eiKÖÜ¤ÄZ\u0087\u0010êk×[ü\u0084 \u0092\u0092>ßËe¶I¯\u0000ç/ôYCö\u000e>\u0094s3IË$Ñ>\u00adiqx#0\u0010¸Pl\u008däy^&m2·ÅË-´\u0085@VÖ\u008f[EH/6'F|>#··úbÚü0\u0084\u000fñ\u000eY\u009aÖ\u0004úÈ\u0088Ú\u000b\f\u0084\u00859\u0094.\nf\u008eB\u0099Db·ñÇ\u0093Õ\u0082\u001aE\u0018\u0089¤@\u001b¾\u009cMô\u00ad \u008d(\u00adl\fÖn%É+_Dçë·\u0005\u0093\u00ad\u0092|5òÎõ\u0013cg\u009crdl\u009e\u0018\u0001\"\u0082Ú\u0085.\b\u0003\u0092ÙuõIà#B\u0017»3ÿV}¤ó \u0092\u0015I\u0005â\u0090EæêÞJ^\u001aW\u0097=\u009b¹\u0091,?ÍFÂ¶3×|aÝ[¤P¨¬.^`Ëê\u0089¨¼°bh¿å\u0093\u0018ê=\u0015Ï+¾\u000f\u0082\u008e£ú$Î\u0007¯-w\u0017ÿà²\u0012Ñ\u008cx¦iªB\u0094 îfø+\u0007;«\u000fÓ<¢Úx\u0092´¸\u009aÑ\u009a\u009e\u0082L³`U_Ú\u000eI±\u0086\u0011\u0018ß²ÂïP×:T\u007fß;Sv´\u00009¤-3`\u009c\u0082$/0ð\u0004uv\u0099[\u007f£=K|v>íÄïýå\u0094ì0Û©\u001a©\u0083Õ\u00adº(î\u008cïE¶úg\b\u0017s.ÿ°\u0011v\u008bWØ eC\u008dËâAÞ&\u008fp¾\u008eP:Zx\\ÈH\u0012,¤\u008aé==\u0087[±r\u0087\u009f0¥^W¼\u008aM÷\u0082È)\u0017«Éó¦éà×\u009f\u009f!þ³«\u0018r{\u000fÁhÀ:þ9O\u009fhÔìý \u009c\u008e\u0085Hlo\u0082\u0080É\u009bc¼\u0006Î\u000b$yÕ\u009b\u0087\bYB\u0081\u0090'\u001a\u001f\u0096 ÚrÇµñ\b3[\u0002©J\u000b3e\u000e\u0085ºø\u0013ÚB¶\u008f\u009c}©ßù)\u00160\u00105~\u0006`5\u001cú.\u009b\n\"ÐµiçvÔ·z\u0015ã\u008c\u0005¤L5Ë}\u009cëYS\u0010×=\u0092ÎSy\u0016\u001a\f\bô7ê'z\u00803Ò«\u0004nÊi\\ÈC\u0012\u009f\\S'\u009dq7ðDüZæb\u0090H?\u0081\u0080v(\u0007G\bô\"}C\u0096\u008d\u0086\u001aòw\u009c;\u009c¢\u0098MÒ\u0083¦÷®±ûiY4n ?V¬\u0012\u0093öÄ\u0004ÛTjiQ·ó\u0085E\u0097Õ\u0002ÃðNñçÍ`\u0088Á8Q\u0013\u0012Ã¨\u0081(\f\u0019-\u0012t\u008bRëñz·\\Y\u0086\u009c\u0082\u0010ØñÅþÒáÎ-]¦Y²m¡Þ\u0012Úáøv[ <\u0018 \u0083\u00918ý\u008c\u008ei¥\u0080®Á§V\bW%Ób²\tìÜd(\u008aË\u0005ä7»afKå[\u0081wx\"%2ªpÇþ\u0095o\u001a5+Ç8&µ²\u001bÆ\u009a¡`Ü;¬W ìæ\u0004SninnÁ\u008e\u00143\u001bÍ¾\u0084ïU\u009cS\u0010V¶Å\u00884Ä\u0088À*\\](\u0091\u0019eÚ$\u0001Cõ±~í¾b\u008eÛH\u0092ÔÞÁÁu\u0089\u0090´pÜÿÊ\u009e\u0003|piÐ]\u0003Î\u009ex\u0010\u008cT\u0097ÿ\u0018\u0099»\u000e_oâÉ\u0092Õkl\u0010ÊÂmýy_\u0087>e\u0003\u0083.RÊW\u0014\u0010önè(3x\u0010\u009a\u009f\u0098\u000fï©}ñ¿\u0010Á/å\u0088*Ø\u0004\u000eÐU\u0002ô¶y\b0\u0010«ùÖo_ë\u0088Ò7=\u009bðÍÌ\u0092\u009fH°\u0019F\u009e\u0019G\u0016\u001b\u0010\u008cVØß\u001f½&ä\u000e\u008aEåÐÂ\u0093\u009b\u0094\u009a\u0089\u009d\u008c7ìï¦\u0086\u0096¶«\u0088À(Ìp=nW~+r%çÊN\u0083qÃ\u0093¯Å\bå\u0083F\u008d\u007f\u0095\u0016¿Þ\u000eZ}\u0010¡\u001f\u00834m´\u0080.¹R\u001a¤àälè\u0018?à¬4Wo£î|0â\u0098O(Z\u0096[(\u008b\u0083mNÛ\u0013\u00104ä@\u001fåYBþkÞBµØ\u001bs¨HL\u00116$y6mÆ@o\u0010qÀº\u001a2ô\u000e/.E\u009d\u0083()W±y9_Ö\"ÄV`H¹Ùêë:gz>BP\u000f\u0006Ú\u0012*ÒÔ;¢\\EÔ(ÌH\u007få\u0085T«a\u0015Z\u0089B\u0014 \u0085ñÙ\u001f\u0017*Ø¨)\u009aW\u008eD½á¯®ùÐsöì+ß*½\u008a\u009aN\u0002\u009fÏ(º \u008dËPÂ\u0083¤£þÏ\u0000£\u0003¨á\u0016ZßF16\u0002\u008a\"EèErâðãÑKÖªLîJ\u0091\u0018Ò]\u001c»¬\u0016\u008b\u0096¿\u001c§Ä«\u009fDñáTð×ÎfM8\u0010ñ_ú\u0094u\u0089\tBÆï`:hùZC 0¢n¥/w\u001aõÀë\u0007sL\u001c\u0089$ê!~\u009d;ºÎí\u0093\u0082o'\u0000¶Ý\u00918[_\\ûCs\u0084°9ÅïW Î\u0001)w\u0098ö«\b\u0090\u001407²\u0083¤©I\u009aÔ:L/%ß\u0016y$È\u0004EÖUJ>ø\u0010yx\u001f¹\u0088h\u008e\u0018rð\u008f7Â!¶-\u0091þ(\u009c£\u008d»\u0087Ä\u001cÃb\u0084=\u0003\u0000 ªøÚ\u0005\u0011¾tdø%_°®R\u0091\u0096]r\u001d×ë³J\u000e\u0007oæ¼ÊØ@60\u0014\u0011©t©\u009eGG¤aì{\u008a[\u009añ\u0099\u0098¤vN\u0019\u0090\u009f\u007fõùsú7\u001bÂúR\u0001·îqìIÀUÉ\u0004_Õxã\u0010\u0013¹h¡\u0089Î(áK±°·Î®\r1\u0010\u0010ûc\u0094Q¤Í\\üZ?\u0095v\bÔw\u0018Ï\u008e\u0001\u0099XÙ\u0082ÎÃR\u0005\n\u0083\u0086Ç#.mQ\u0083\u0099ðÅòHÍ\u0005±À\u0094\u009a*Túâ5\u0094ïù¾\u0092c\u0093 4\\0Ð(·î\u0088é{\u001e\u0004]I\u007f\u001c¢`\u0097\u007f¨S¸p<V\u0014æ¬Z5[£\u0092d\u0087x©hoRÎ\u001fëþÒ^Ìõw\u0002NU\u0010®ÍÃ³ñ\u0011\u0083+µü\b\u0000©ã(a\u0010©\u00007\u008d\u0098ä\u0099$v^$úêÄ/\u0014 Òcý±ù*\u0089tí\u0019>(y\u009f\u0001\u0013î¼1\u0013ã;\u008b[47®\\×o3ý \u001a\u0095!\u008f7¬g\nùò'C\u0097})\u001côVã\u0019¶ñµ&Hfþï¢àI\u001b8\u009dD\u008f\u00196ì¸\u009e´'æ=SÌ÷<æ\u0092iI\u0005p#T\u0092\u001eÙÄ;ÃHÄ0n\u0013è\u00170Î\u000eUsÍ²P{ì\f\u001d\u0002¹Ø=\u008e¯\u009e@%Õkf^¯°£\u0007\u001d*\"áf¤9Å&\u0018{$ÏÉµ\u001cÚ2gªuM}\tF¹ó\u0000\u0010õ\u0099\u000bã¼\n³\u0003³¹_.!«íÕ\u009f\u00917P\u008b®ùyÎÆ(É¨í\u0084ó\u001a]ôK\u0096¯\u0094XÓ\u0005º\"s)Öa.zìg\u0088\n\u00advQàJÉl$ÅÒênã\u0010N±°\u0000\u008eÞ`Ä.\u0014\u0092ZU>¿`\u0080Út¹2,ë½§ý^Må\u008a½=?ò\u001bzz35\bÓ¼GÐ§v\u0083îß¼Ð\u009de\u0094\u009dó$â\u001f\u0092\u001e¥¢\u0019åÂL8z%¿¨\u008bx\u008f\u0098ÝÃàÂ\u001dUì:\u001716ëf¶[wb|µî±\u009au¹þò¹\u0099\fþ-\u008cQ·°Ã\u0095\u007fÎ\u0003E<a\u0086Q\u000f\u0099\u0084öÆ®¯²#½½À\u0013m× @cÜ².MØ\u0089\u0010\u0011þ0/½\u001ao]\u0088/]Ê\u008b\u0001SÇ";
      int var13 = "A+\nìJJ\u0003ò\u0087e±Ì\u000bÂ\u0091/ñwß)ëÅá£\u008e\b$^Ð[E«`ßóíI\u0015g£dÄ$9u|\u001axÈÜ\u009e0@ÏÂEïò¨ \u008fÀ¬(6\u001d}\u007f\u0098\u0094r\u001aÖÿä\u007f·N?\u009dö¨^\u008fDtT\u008eoëuû°ö¼¶¨Éÿ\u0084o8bF\u0092Óá\u0084ÇË\bù\u0093\u0004]:\u0092îd\u0085ë]¤Jº\u008d>û\u009b(h®ü\\®Þ\u0007»}#L\u008d\u009eo\u0098\f!;\\¢\u009dÂQ5âÌâ®aÜ\u0085Ê\u0010Þ'^\u008cK/¯\u0010\u0085\u0087B@'K\u009a\u0002\u008a\u0099E#]ä\u0087ð(þ6áÐ\u0005\u0004P[R\u0015?\u0000SM¡bV\u0002)\u0007(\t)ë~ë@oO\u0094üü=R¿VG÷\u009e«\u0010ä¦\u00904¯\u0098zR>öá\u00996/¾\u0004\u0018\u007fæ\u0091ßyp\u0086ïñ\u0097\u0094c\u008d\u00ad±7Ï»áR¬MzA 7\u007fü\u0090Ò,ÀxÂ\u009eÂÄÎÜ\u0002Ä\rQ£M/ô\u0093~%I¤¨?\u001f`\u0010@Y\u001fñ\u0087C\u001a·Nø©N¯\u001d^Z¸4öQòÎ_]ôÄÈ³\u008cá'áí¸ãZ\u0012[ Pí\u0091ö³!¡|\u0000Aê\u0083E\u0095£~\f\u0004ÛU]yb\u0082Ý^\u0018<\u001bVíMs%\u0084°5»«!Y³°«½\u001dð~*\u009cW ÁfÆÄÅ\u0019pÔEÇy[ÅÑÉ\u000b\u0087»\t!w!C÷Fô.'^\u008bÆ(\u0010\u0019\u007f[Ø6iÞ®\fkø\u009cÌ9º_ ¿Þú.Éh\u0015ÁwÍ²\u0006\u001b\u0014\u0000\t\u0094o/g*.¹°»Ñb\u008f³\u0088Ú\u008d(µb\u008f8Z\u009a\u008dG\u0006©O2Â}À³° :\u0011\r3ä\u0089÷\u0081p\u0087ªbÈ\røH\u0000R^9WN(¼CV¬M\f}oá?Ðrh\u0007GÕAÃ²(*.\u0084ölÜå×\u0096~\u001ca»\u0019G\u0092£í\u0081\u001e »ÃðA/Å4óål\u0093»&²\u009b1D½\u0082Þ\u0093&.\\ÿ\\ÃÑ¦\u001e7d Þ¸í5ø+\u0095ó³/\u008a\u0019É×@R\u0099ÒàOÏ\u0090\u001bt¬¼%w8ª\u000fï\u0010á7(ï\b4(¿_v\u00018Un½\u00950\u007f\u0016?$|(2u(\u0096\u0087í3@½O:/«?JE·4`PåX\u008a\u0001&~ø\u0086ß²-kÙ2\u0093\u0086cÖ¢Q\u009chP\u008e\u008a¥\u0090°×\u0012¥ÏW±ÙKø4ÕÀs^6\u007f2cÙ£Ê®@^©oFg`¶\u0010\u0001\u0088íO;lÿÜ?Âûû\u009dÅJ×Ïù®¼CAc»\u009bØ\u0096RËÄ:î\u0001\t\u00987¦\u0097©\u0013ßò\r+\u0018\u009b«·6\u008d¤>mÀþÔ´\u0012x®þ\u0098\u0086°*\u0001}äÕ ³\u0010ªNÅ¾-\n»{ªjm],[7\u0000ÀèÄõ¶xqHrw\u009a<¦z(V!\bªèuõôYÄ*\u007fÝ\u0099ß\u008dÀMÐ\u001a:\u0080æ\u00050V²«}¨\u0013HX`Ò\u00adÝoÌ(\u0010\u0084\u00920\u0011.\u0088Ðérç|\u0017\r\u0016Qï(bý¸5\u0088Ã\u0006`vDÈ\u0092\u000eÿ\u0013Û\u009a)F\u008e\u0005\u0096!\u008eâb(ö\u0080ð/ò0\u0018\u008cÙÔ6Þ\u009489\u001eï·[Å»þB\u009f\u008dm'Í:\u0092\u0085\u0089@µ\u0001vjì\u0007Ë\u0010*Jyó¯¸úËÅE-ª±»Ð\u008fâZ\u0010:Ç\u00853ÖA<æ á\u0098}ÏiU\u0015þï#Aò_ðBW 0ë(CÑC§õ3)¹\f\u001cq\b1õ»S\u009c;s\u0097Ã]ª»S´V\u000f\u0004\u0083Ð&\u000e\u008bZ\u00adN¬5AAþ_\u00016\u0010éf9\u0001ÿF].\u0094/\u009bëî\u0018[n\u0082Ðó\u0094\u0001,õ\u0083U±ò\u009a\rí\u0092ö®±)Ï$¢\b¢jø¬\u000béûK× cb\u0017_Óócj\u007f\u0002\u0097\u0099^Éw^\u0005\u0010¹°ã\"W\b\u0087ò\u009c\u008b\u0011ÝÊ\u0083\u001fh\u000b'îkª\u0018\u008a*J\u0014¡ÅØºë\u0016\u0085Î\u008cE\u000bhé\\Tú)¿â@(ëa¯~ÃÙ¿àî Hy\u001c\r¸|ú®A\u001f&214\u000eiKÖÜ¤ÄZ\u0087\u0010êk×[ü\u0084 \u0092\u0092>ßËe¶I¯\u0000ç/ôYCö\u000e>\u0094s3IË$Ñ>\u00adiqx#0\u0010¸Pl\u008däy^&m2·ÅË-´\u0085@VÖ\u008f[EH/6'F|>#··úbÚü0\u0084\u000fñ\u000eY\u009aÖ\u0004úÈ\u0088Ú\u000b\f\u0084\u00859\u0094.\nf\u008eB\u0099Db·ñÇ\u0093Õ\u0082\u001aE\u0018\u0089¤@\u001b¾\u009cMô\u00ad \u008d(\u00adl\fÖn%É+_Dçë·\u0005\u0093\u00ad\u0092|5òÎõ\u0013cg\u009crdl\u009e\u0018\u0001\"\u0082Ú\u0085.\b\u0003\u0092ÙuõIà#B\u0017»3ÿV}¤ó \u0092\u0015I\u0005â\u0090EæêÞJ^\u001aW\u0097=\u009b¹\u0091,?ÍFÂ¶3×|aÝ[¤P¨¬.^`Ëê\u0089¨¼°bh¿å\u0093\u0018ê=\u0015Ï+¾\u000f\u0082\u008e£ú$Î\u0007¯-w\u0017ÿà²\u0012Ñ\u008cx¦iªB\u0094 îfø+\u0007;«\u000fÓ<¢Úx\u0092´¸\u009aÑ\u009a\u009e\u0082L³`U_Ú\u000eI±\u0086\u0011\u0018ß²ÂïP×:T\u007fß;Sv´\u00009¤-3`\u009c\u0082$/0ð\u0004uv\u0099[\u007f£=K|v>íÄïýå\u0094ì0Û©\u001a©\u0083Õ\u00adº(î\u008cïE¶úg\b\u0017s.ÿ°\u0011v\u008bWØ eC\u008dËâAÞ&\u008fp¾\u008eP:Zx\\ÈH\u0012,¤\u008aé==\u0087[±r\u0087\u009f0¥^W¼\u008aM÷\u0082È)\u0017«Éó¦éà×\u009f\u009f!þ³«\u0018r{\u000fÁhÀ:þ9O\u009fhÔìý \u009c\u008e\u0085Hlo\u0082\u0080É\u009bc¼\u0006Î\u000b$yÕ\u009b\u0087\bYB\u0081\u0090'\u001a\u001f\u0096 ÚrÇµñ\b3[\u0002©J\u000b3e\u000e\u0085ºø\u0013ÚB¶\u008f\u009c}©ßù)\u00160\u00105~\u0006`5\u001cú.\u009b\n\"ÐµiçvÔ·z\u0015ã\u008c\u0005¤L5Ë}\u009cëYS\u0010×=\u0092ÎSy\u0016\u001a\f\bô7ê'z\u00803Ò«\u0004nÊi\\ÈC\u0012\u009f\\S'\u009dq7ðDüZæb\u0090H?\u0081\u0080v(\u0007G\bô\"}C\u0096\u008d\u0086\u001aòw\u009c;\u009c¢\u0098MÒ\u0083¦÷®±ûiY4n ?V¬\u0012\u0093öÄ\u0004ÛTjiQ·ó\u0085E\u0097Õ\u0002ÃðNñçÍ`\u0088Á8Q\u0013\u0012Ã¨\u0081(\f\u0019-\u0012t\u008bRëñz·\\Y\u0086\u009c\u0082\u0010ØñÅþÒáÎ-]¦Y²m¡Þ\u0012Úáøv[ <\u0018 \u0083\u00918ý\u008c\u008ei¥\u0080®Á§V\bW%Ób²\tìÜd(\u008aË\u0005ä7»afKå[\u0081wx\"%2ªpÇþ\u0095o\u001a5+Ç8&µ²\u001bÆ\u009a¡`Ü;¬W ìæ\u0004SninnÁ\u008e\u00143\u001bÍ¾\u0084ïU\u009cS\u0010V¶Å\u00884Ä\u0088À*\\](\u0091\u0019eÚ$\u0001Cõ±~í¾b\u008eÛH\u0092ÔÞÁÁu\u0089\u0090´pÜÿÊ\u009e\u0003|piÐ]\u0003Î\u009ex\u0010\u008cT\u0097ÿ\u0018\u0099»\u000e_oâÉ\u0092Õkl\u0010ÊÂmýy_\u0087>e\u0003\u0083.RÊW\u0014\u0010önè(3x\u0010\u009a\u009f\u0098\u000fï©}ñ¿\u0010Á/å\u0088*Ø\u0004\u000eÐU\u0002ô¶y\b0\u0010«ùÖo_ë\u0088Ò7=\u009bðÍÌ\u0092\u009fH°\u0019F\u009e\u0019G\u0016\u001b\u0010\u008cVØß\u001f½&ä\u000e\u008aEåÐÂ\u0093\u009b\u0094\u009a\u0089\u009d\u008c7ìï¦\u0086\u0096¶«\u0088À(Ìp=nW~+r%çÊN\u0083qÃ\u0093¯Å\bå\u0083F\u008d\u007f\u0095\u0016¿Þ\u000eZ}\u0010¡\u001f\u00834m´\u0080.¹R\u001a¤àälè\u0018?à¬4Wo£î|0â\u0098O(Z\u0096[(\u008b\u0083mNÛ\u0013\u00104ä@\u001fåYBþkÞBµØ\u001bs¨HL\u00116$y6mÆ@o\u0010qÀº\u001a2ô\u000e/.E\u009d\u0083()W±y9_Ö\"ÄV`H¹Ùêë:gz>BP\u000f\u0006Ú\u0012*ÒÔ;¢\\EÔ(ÌH\u007få\u0085T«a\u0015Z\u0089B\u0014 \u0085ñÙ\u001f\u0017*Ø¨)\u009aW\u008eD½á¯®ùÐsöì+ß*½\u008a\u009aN\u0002\u009fÏ(º \u008dËPÂ\u0083¤£þÏ\u0000£\u0003¨á\u0016ZßF16\u0002\u008a\"EèErâðãÑKÖªLîJ\u0091\u0018Ò]\u001c»¬\u0016\u008b\u0096¿\u001c§Ä«\u009fDñáTð×ÎfM8\u0010ñ_ú\u0094u\u0089\tBÆï`:hùZC 0¢n¥/w\u001aõÀë\u0007sL\u001c\u0089$ê!~\u009d;ºÎí\u0093\u0082o'\u0000¶Ý\u00918[_\\ûCs\u0084°9ÅïW Î\u0001)w\u0098ö«\b\u0090\u001407²\u0083¤©I\u009aÔ:L/%ß\u0016y$È\u0004EÖUJ>ø\u0010yx\u001f¹\u0088h\u008e\u0018rð\u008f7Â!¶-\u0091þ(\u009c£\u008d»\u0087Ä\u001cÃb\u0084=\u0003\u0000 ªøÚ\u0005\u0011¾tdø%_°®R\u0091\u0096]r\u001d×ë³J\u000e\u0007oæ¼ÊØ@60\u0014\u0011©t©\u009eGG¤aì{\u008a[\u009añ\u0099\u0098¤vN\u0019\u0090\u009f\u007fõùsú7\u001bÂúR\u0001·îqìIÀUÉ\u0004_Õxã\u0010\u0013¹h¡\u0089Î(áK±°·Î®\r1\u0010\u0010ûc\u0094Q¤Í\\üZ?\u0095v\bÔw\u0018Ï\u008e\u0001\u0099XÙ\u0082ÎÃR\u0005\n\u0083\u0086Ç#.mQ\u0083\u0099ðÅòHÍ\u0005±À\u0094\u009a*Túâ5\u0094ïù¾\u0092c\u0093 4\\0Ð(·î\u0088é{\u001e\u0004]I\u007f\u001c¢`\u0097\u007f¨S¸p<V\u0014æ¬Z5[£\u0092d\u0087x©hoRÎ\u001fëþÒ^Ìõw\u0002NU\u0010®ÍÃ³ñ\u0011\u0083+µü\b\u0000©ã(a\u0010©\u00007\u008d\u0098ä\u0099$v^$úêÄ/\u0014 Òcý±ù*\u0089tí\u0019>(y\u009f\u0001\u0013î¼1\u0013ã;\u008b[47®\\×o3ý \u001a\u0095!\u008f7¬g\nùò'C\u0097})\u001côVã\u0019¶ñµ&Hfþï¢àI\u001b8\u009dD\u008f\u00196ì¸\u009e´'æ=SÌ÷<æ\u0092iI\u0005p#T\u0092\u001eÙÄ;ÃHÄ0n\u0013è\u00170Î\u000eUsÍ²P{ì\f\u001d\u0002¹Ø=\u008e¯\u009e@%Õkf^¯°£\u0007\u001d*\"áf¤9Å&\u0018{$ÏÉµ\u001cÚ2gªuM}\tF¹ó\u0000\u0010õ\u0099\u000bã¼\n³\u0003³¹_.!«íÕ\u009f\u00917P\u008b®ùyÎÆ(É¨í\u0084ó\u001a]ôK\u0096¯\u0094XÓ\u0005º\"s)Öa.zìg\u0088\n\u00advQàJÉl$ÅÒênã\u0010N±°\u0000\u008eÞ`Ä.\u0014\u0092ZU>¿`\u0080Út¹2,ë½§ý^Må\u008a½=?ò\u001bzz35\bÓ¼GÐ§v\u0083îß¼Ð\u009de\u0094\u009dó$â\u001f\u0092\u001e¥¢\u0019åÂL8z%¿¨\u008bx\u008f\u0098ÝÃàÂ\u001dUì:\u001716ëf¶[wb|µî±\u009au¹þò¹\u0099\fþ-\u008cQ·°Ã\u0095\u007fÎ\u0003E<a\u0086Q\u000f\u0099\u0084öÆ®¯²#½½À\u0013m× @cÜ².MØ\u0089\u0010\u0011þ0/½\u001ao]\u0088/]Ê\u008b\u0001SÇ"
         .length();
      char var10 = ' ';
      int var9 = -1;

      while (true) {
         byte[] var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
         String var33 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
         byte var10001 = -1;
         var14[var12++] = var33;
         if ((var9 += var10) >= var13) {
            var11 = "-òÂÐY\u001fJ\u0090ÒÂÅ¡p\u001fìq6\u0086\f\u0016\u0083ö\bkëñª;x·h\u0083´ó»Ð\u0083\u0013\nS\u0089Cá >\u009e| K<fÎ#n®P\u0010a\u0089²P«SG\u008bl×Blù©`Õ";
            var13 = "-òÂÐY\u001fJ\u0090ÒÂÅ¡p\u001fìq6\u0086\f\u0016\u0083ö\bkëñª;x·h\u0083´ó»Ð\u0083\u0013\nS\u0089Cá >\u009e| K<fÎ#n®P\u0010a\u0089²P«SG\u008bl×Blù©`Õ"
               .length();
            var10 = '8';
            var9 = -1;

            while (true) {
               var15 = var7.doFinal(var11.substring(++var9, var9 + var10).getBytes("ISO-8859-1"));
               String var35 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15).intern();
               byte var30 = 0;
               var14[var12++] = var35;
               if ((var9 += var10) >= var13) {
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var14;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[82];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var16 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 868220690008055191L;
                  byte[] var6 = var2.doFinal(
                     new byte[]{
                        (byte)(var4 >>> 56),
                        (byte)(var4 >>> 48),
                        (byte)(var4 >>> 40),
                        (byte)(var4 >>> 32),
                        (byte)(var4 >>> 24),
                        (byte)(var4 >>> 16),
                        (byte)(var4 >>> 8),
                        (byte)var4
                     }
                  );
                  long var38 = (var6[0] & 255L) << 56
                     | (var6[1] & 255L) << 48
                     | (var6[2] & 255L) << 40
                     | (var6[3] & 255L) << 32
                     | (var6[4] & 255L) << 24
                     | (var6[5] & 255L) << 16
                     | (var6[6] & 255L) << 8
                     | var6[7] & 255L;
                  var30 = -1;
                  long var0 = var38;
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = (char)((int)var0);
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new CommandManager.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  String var28 = System.getProperty("polinex.devcommands");
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var28 != null ? Boolean.parseBoolean(var28) : false;
                  String[] var18 = new String[]{"all", "party", "guild", "officer", "skyblock-coop", "a", "p", "g", "o", "sbc"};
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = SetsKt.setOf(var18);
                  return;
               }

               var10 = var11.charAt(var9);
            }
         }

         var10 = var11.charAt(var9);
      }
   }

   public static void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(String var0) {
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var0;
   }

   public static String IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12335;
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
            throw new RuntimeException("me/octo/client/commands/CommandManager", var10);
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
         throw new RuntimeException("me/octo/client/commands/CommandManager" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public static boolean isAuthenticationFailure(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.replaceAll("(?i)§[0-9A-FK-OR]", "").toLowerCase(Locale.ROOT);
         return var1.contains("unauthenticated")
            || var1.contains("not authenticated")
            || var1.contains("authentication denied")
            || var1.contains("authentication failed")
            || var1.contains("authentication failure")
            || var1.contains("authentication request failed")
            || var1.contains("failed to authenticate")
            || var1.contains("unable to authenticate");
      }
   }

   public static boolean logOnlyFromChat(Component var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.getString();
         if (!isAuthenticationFailure(var1) || !var1.contains("[Polinex]") && !var1.contains("Not authenticated! Please, wait a moment.")) {
            return false;
         } else {
            System.err.println(var1);
            return true;
         }
      }
   }

   public static void routeChat(LocalPlayer var0, Component var1) {
      if (var1 != null && isAuthenticationFailure(var1.getString())) {
         System.err.println(var1.getString());
      } else {
         var0.sendSystemMessage(var1);
      }
   }

   @Nullable
   public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$9927dab582de9a05(
      long var1, char var3, @NotNull String var4
   ) {
      var1 = 1642491147L;
      long var5 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      long var10001 = var5 ^ 133674458382583L;
      int var7 = (int)((var5 ^ 133674458382583L) >>> 32);
      int var8 = (int)((var5 ^ 133674458382583L) << 32 >>> 56);
      int var9 = (int)(var10001 << 40 >>> 40);
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(21126, 3811846641974463216L ^ var5)
      );
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6202194733275707488L, var5
      );
      String var11 = me.octo.client.gui.clickgui.endgameGUI.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl();
      String var10 = var10000;

      label80: {
         label79: {
            boolean var18;
            label78: {
               try {
                  var18 = StringsKt.isBlank(var11);
                  if (var10 != null) {
                     break label78;
                  }

                  if (!var18) {
                     break label79;
                  }
               } catch (IllegalStateException var22) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var22, -6099498623895204612L, var5
                  );
               }

               var30 = false;
               break label80;
            }

            var30 = var18;
            break label80;
         }

         var30 = true;
      }

      label100: {
         try {
            if (var30 && StringsKt.equals(var4, var11, true)) {
               break label100;
            }
         } catch (IllegalStateException var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, -6099498623895204612L, var5
            );
         }

         Iterable var12 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var13 = false;

         for (Object var15 : var12) {
            var10000 = (String)var15;

            while (true) {
               lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var16 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var10000;
               boolean var17 = false;
               if (!me.octo.client.commands.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var16, var7, (byte)var8, var4, var9)) {
                  break;
               }

               if (var10 == null) {
                  return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var15;
               }

               var10000 = (String)var15;
            }
         }

         return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)null;
      }

      Iterable var24 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      boolean var25 = false;

      for (Object var27 : var24) {
         var10000 = (String)var27;

         while (true) {
            lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var28 = (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var10000;
            boolean var29 = false;
            if (!StringsKt.equals(
               var28.getMetadata().getName(),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(6018, 5528818545692381081L ^ var5),
               true
            )) {
               break;
            }

            if (var10 == null) {
               return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)var27;
            }

            var10000 = (String)var27;
         }
      }

      return (lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII)null;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$261e27d36f7909fa(
      long argument1Arg, @NotNull String bodyArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$e155bb2e2adf2576(
      short param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI$recovered$1b1122537cc0893c(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$fb7d660383812377(
      long param1, IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 94671900952844L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final CommandManager IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;

         try {
            if (CommandManager.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
               return CommandManager.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }
         } catch (MatchException var3) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var3, -2471004853260059204L, var1
            );
         }

         Intrinsics.throwUninitializedPropertyAccessException(
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"p">(8257, 3157184213478760775L ^ var1)
         );
         return null;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, byte var2, int var3, @NotNull CommandManager var4
      ) {
         long var5 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"p">(11589, 5455715072690219550L ^ var5)
         );
         CommandManager.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var4;
      }

      @JvmStatic
      @NotNull
      public final CompletableFuture IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull String var1, int var2, byte var3, int var4, int var5
      ) {
         long var6 = ((long)var3 << 56 | (long)var4 << 32 >>> 8 | (long)var5 << 40 >>> 40)
            ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         long var8 = var6 ^ 105260402792750L;
         long var10 = var6 ^ 138973405373230L;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"p">(8416, 7513843828239954373L ^ var6)
         );
         return CommandManager.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8), var10, var1, var2
         );
      }

      @JvmStatic
      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, @NotNull String param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 34636400219546L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[5];
         int var7 = 0;
         String var6 = "egÃ-Nf\u0083*êm|RÅS=àzU\u001b!\u009a+øï\u0010z\u0019º¬\u0019\u001dÙ\u008b\u001dÎ\u009d¾µï \u0091\u0010\u0013\u009dNáÑ\u0085¥\f\u009f·\u0088XÐ\n\u008b*";
         int var8 = "egÃ-Nf\u0083*êm|RÅS=àzU\u001b!\u009a+øï\u0010z\u0019º¬\u0019\u001dÙ\u008b\u001dÎ\u009d¾µï \u0091\u0010\u0013\u009dNáÑ\u0085¥\f\u009f·\u0088XÐ\n\u008b*"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u008fW\u0018\u00ad!?+«\u0082\u0011Ðb\u0004\u008c\u0019°\u0085õ$Ê\\Z³©zG\u000f§Ï-õ\u0082\u0010Õ÷(÷w\u001d\u008føEÝæb\u0080\u0004<¸";
               var8 = "\u008fW\u0018\u00ad!?+«\u0082\u0011Ðb\u0004\u008c\u0019°\u0085õ$Ê\\Z³©zG\u000f§Ï-õ\u0082\u0010Õ÷(÷w\u001d\u008føEÝæb\u0080\u0004<¸"
                  .length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[5];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 7868;
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
                  "me/octo/client/commands/CommandManager$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll", var10
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
               "me/octo/client/commands/CommandManager$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      @JvmStatic
      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$75fb3e4f60576feb(
         long argument1Arg, @NotNull String textArg
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @NotNull
      public final CommandManager IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ea0cc58e0046d03d(long var1) {
         var1 = 79632760444597L;
         var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var1;

         try {
            if (CommandManager.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null) {
               return CommandManager.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
            }
         } catch (MatchException var4) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4);
         }

         Intrinsics.throwUninitializedPropertyAccessException("INSTANCE");
         return null;
      }
   }
}
