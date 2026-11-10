package me.octo.client.events.impl.base;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.Event;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class EventBus implements me.octo.client.events.impl.base.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
   @NotNull
   public static EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private final me.octo.client.events.impl.base.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll exceptionHandler;
   @NotNull
   private final ConcurrentHashMap<Class<? extends Event>, List<EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final ConcurrentHashMap<Object, List<EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   @NotNull
   private static Lookup IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static ConcurrentHashMap<Class<?>, List<EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 12610246489196L;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static String[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Map lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new HashMap(13);

   @JvmOverloads
   public EventBus(
      @NotNull me.octo.client.events.impl.base.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll exceptionHandlerArg
   ) {
      long var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 36348898740054L;
      Intrinsics.checkNotNullParameter(exceptionHandlerArg, "exceptionHandler");
      super();
      this.exceptionHandler = exceptionHandlerArg;
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new ConcurrentHashMap<>();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ConcurrentHashMap<>();
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Object var1, long var2) {
      var2 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var2;
      long var4 = var2 ^ 94883599086710L;
      long var10001 = var2 ^ 52914512883427L;
      int var6 = (int)((var2 ^ 52914512883427L) >>> 48);
      int var7 = (int)((var2 ^ 52914512883427L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      long var9 = var2 ^ 103229152648230L;

      try {
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(936, 1038220884868656166L ^ var2)
         );
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.containsKey(var1)) {
            return;
         }
      } catch (Exception var24) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var24, 2807943962524920776L, var2
         );
      }

      Object var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.computeIfAbsent(
         var1.getClass(), EventBus::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      Intrinsics.checkNotNullExpressionValue(
         var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(9574, 7911849259708697316L ^ var2)
      );
      List var11 = (List)var10000;
      List var12 = new ArrayList();

      for (EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 : var11) {
         try {
            Consumer var15 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               (short)var6, var1, var14.getMethod(), (char)var7, var14.getEventType(), var8
            );
            EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var16 = new EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               var1, var15, var14.getPriority(), var14.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
            );
            var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .computeIfAbsent(var14.getEventType(), EventBus::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI);
            Intrinsics.checkNotNullExpressionValue(
               var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(81, 2751537498582642647L ^ var2)
            );
            List var17 = (List)var10000;
            int var18 = Collections.binarySearch(
               var17, var16, new EventBus$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<>()
            );

            label52: {
               try {
                  if (var18 < 0) {
                     var27 = -var18 - 1;
                     break label52;
                  }
               } catch (Exception var22) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var22, 2807943962524920776L, var2
                  );
               }

               var27 = var18;
            }

            int var19 = var27;
            var17.add(var19, var16);
            var12.add(var16);
         } catch (Exception var23) {
            throw new RuntimeException(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(2533, 857058979474466417L ^ var2)
                  + var14.getMethod().getName(),
               var23
            );
         }
      }

      label42: {
         try {
            if (!var12.isEmpty()) {
               var28 = true;
               break label42;
            }
         } catch (Exception var21) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var21, 2807943962524920776L, var2
            );
         }

         var28 = false;
      }

      try {
         if (var28) {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var1, var12);
         }
      } catch (Exception var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, 2807943962524920776L, var2
         );
      }
   }

   private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, Class param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull Object param1, short param2, short param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean post(@NotNull Event eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, @NotNull Class param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.size();
   }

   public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      int var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7887325508543700085L, var1
      );
      Collection var10001 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.values();
      Intrinsics.checkNotNullExpressionValue(
         var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(11456, 834625129789487059L ^ var1)
      );
      Iterable var4 = var10001;
      boolean var3 = (boolean)var10000;
      int var5 = 0;
      Iterator var6 = var4.iterator();

      while (true) {
         if (var6.hasNext()) {
            Object var7 = var6.next();
            List var8 = (List)var7;
            boolean var9 = false;
            var10000 = var8.size();
            if (var3) {
               break;
            }

            int var11 = var10000;
            var5 += var11;
            if (!var3) {
               continue;
            }
         }

         var10000 = var5;
         break;
      }

      return var10000;
   }

   public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
      return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.size();
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.clear();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.clear();
   }

   private final Consumer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1, Object var2, Method var3, char var4, Class var5, int var6
   ) {
      long var7 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var6 << 32 >>> 32)
         ^ lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      MethodHandle var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.unreflect(var3);
      CallSite var10 = LambdaMetafactory.metafactory(
         IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(21236, 5543513821401049065L ^ var7),
         MethodType.methodType(Consumer.class, var2.getClass()),
         MethodType.methodType(void.class, Object.class),
         var9,
         MethodType.methodType(void.class, var5)
      );
      return (Consumer)var10.getTarget().bindTo(var2).invokeExact();
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull EventBus var1, long var2, @NotNull Event var4, @NotNull Throwable var5
   ) {
      long var6 = var2 ^ 0L;
      Intrinsics.checkNotNullParameter(
         var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(12675, 8596211281471557964L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(32494, 9104295413991251495L ^ var2)
      );
      Intrinsics.checkNotNullParameter(
         var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(17726, 265693056494085625L ^ var2)
      );
      this.exceptionHandler.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var6, var4, var5);
   }

   @JvmOverloads
   public EventBus() {
      this(null, 1, null);
   }

   private static final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(EventBus var0, long var1, Class var3) {
      var1 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var1;
      long var4 = var1 ^ 96201833853898L;
      Intrinsics.checkNotNullParameter(
         var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5266, 774143933006592792L ^ var1)
      );
      return var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var3);
   }

   private static final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Function1 var0, Object var1) {
      return (List<EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI>)var0.invoke(
         var1
      );
   }

   private static final List IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0, Class var2) {
      var0 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ var0;
      Intrinsics.checkNotNullParameter(
         var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(10264, 4238654986266914779L ^ var0)
      );
      return new CopyOnWriteArrayList();
   }

   private static final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Function1 var0, Object var1) {
      return (List<EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll>)var0.invoke(var1);
   }

   static {
      long var9 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ 50722203615714L;
      boolean var11 = false;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var11);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[31];
      int var5 = 0;
      String var4 = "\u0005\u0091È\t¢\u0099;\u0098\u008bf²F\u0081¯\u0013eï7Í2ÓpNBÃÁ\u0096¡äUdjhõX\u0000À\u0091X\u0016ûÞ\u001e\u0083_æö¢®t\u0094;\u0007B+ç?âDëÈ\u008a\u0012\u0095{)ÝH~\u0082\u0095*<Öò,ýkÞæ\u0094O\u001e?Î%ÔF\u0088\u000f@(\u008dÁÆ÷\"ä\u0005Ô\u008a\u0017Üùp\u0083:^¨\u000e·È\u0006E£\u009bª§¼I»\u0000'\u0003hÔ\u0015Z\u0010\\wÙÞ@Ü·\u009dgm\u009a\u009e¦Ú¢\u009a(Ó\b\u008ce²Â¤$ôÜ!\u009ds\u008eß:/09ÛA<Ý6Ê¡mî\r°kÕ>[Z\u0080z¸å\u0013@\u008bñF\u0088N\u0005GyKj6°\u0006\u008eü\u009a\u008eËFPú7K\u0019Åû\u008e\u0098îk\u0096ñàüþñUÒÂþ\u009dá<\u0094`i}cãt\u0086²Ò[ÚiD¤}\u001b\u0013\u00ad·{(ºì$w,\u00adgÃ#ÅÊ¼×\u0083\u0095 }\u0098\bbeá\u009dMrÞ\u008c\u000eÚH©9óª\f·í:\"h Ï\u0017\u009b#:¶½zéAÄ+'4Ý&&òÈ´ëÝQ\u0002\"x\u008d\u00adÛ\t\np Kðé\u0080\u00136OW8!f\u0082\"yS\u007fY\u009bÖà·-aÅm\u0098L¸s\u0083'\u0010\u0010WdÔdUÒfa¼¡¹&\u00ad\u008f4\u0087@z+\u001eÅâ[\u001f~\u0089ÛÞÅ\u0098Eà\u0011¬\u001c[óèÝ\u0013å\u007f\u00ad\u0018\u001aé\u0091×\u0013ÇÂ@éJ\fèÎÁ\u0080\u0010ÍÔ\u008e%·\u0088L\u0090\u0095L|¹\u001f²þòýîå8\u0005@\u0099bÐÍ\u009d²Øg<\u008cÕùáYÅ\u00ad\u009aÓ»\u007f \u0087|t\u0011\u009b\u0081\u0089cf¸\u001c?,'\u001d`\u0093û§.4miÀsÔ\u0001úÜ\u001a\u001ea6jc_É\u0087ä\u0094wÜ\u009b\u0010BB?(3Od|\u0095\u0016\u0013øU¥\u009fM ,´D¿XÀ³M´úÌfVrv\u0093âøÖi\u0097@U\u001bÓp0\u0086\u008bÙÐ[\u0010\u008f´Ê\u009dÁ\u001f\u000eª\u001aÛG\u009d\u0017mc\\\u0010=\u0017ù\u008bUW\u001c\nõúÝ&'\u009dK³\u0010H`Eø9kÓ\u0011\u0005Ã76¥\u001c;\u0003(m÷»\u0000¥\u0006ê\u0012\u0017¿gZõ¨z\u0012\u009d\u0016hÆ,ípî\u001dc½\u001f\u000eÂ»`(`Ë¸\u0098\u008bdÉ\u0010\u00953Å\u0014½S?X\u0004_èÕ æàM\u0010)©f¥\u008e\u0010\u001f\u0084\u0087x\u009a\u0091Aõ\u0082y\u0010\u0094;p!ü³\u0098g_\u0016¶m{\u000eåñ È\u001aø_8\u008a\u0092A¡a\u000bZ4@Wa\u0092Ó÷W9Ä<)5ÌvæzóVÙ8iºN\u0003^h\\î \u009b\u0081\u0097ó\u001fùRó\u0007OÑé\u0094³'ê\u008d:ùú:m.2·\u0083æ²ö]9\u00049²³²@\u000fõßW´Ú³\u001eÒC\u0010»¿©÷\u009a\u007fç\r \f+¹\u0099G\u0081×\u0010pVV ¬\u0011\u007ftxu5\u000bvXS~\u0010£\u0099Ï³^;\u0082)/Aý\u0011´$\u0090½\u0090º\u0010}\u0002F1g`\u0002B\u009bÏÁ\u0018ê¹ê\u0091_EÀg¨\u009b°\u0019\u00829G1y\u001bG\u009a\u0092]ôh'u±Öæî.\u0080»\f#ØG\u0015ì«p^Hg¥k^tuPQÚá=~ýæ'Æ;!«ôue\u000fÔÇ\u0081à»ª«Ï©\u0014ù\u0090o\u0013ÕuÓ\u0001\u0004íy%µ7\u0085Ä5ª¶PMÚ<\u0000ë\u0083HO\u0090Õ\u0094\u0099ºj\u001c\nF³Ë \u0080\u0003²â\u0013\u0097d¾í\u001fK¡½\u0086 áÝ¹\u0007\u001d\u008e?h3H£\u0098JÊúü×Ó\u0090\u00adoãV+öªTÿ\u001cÒÛ¤(F:cW\"X\u0003ªX\u000bÈÊªÒ¦\u008c\u0005\u0003mé\u008diÎa\u00815\u001e\u000eÊ\u0097»d^¹\u0005Oí\u0080`Û\u0010/Ö\r`[W×ï©\u0096&Ô\u001c\u009c¢J@Q\u0083þ9Ð\u0004³\u001cÕ+¤P\u0017àw\u0082\u0080Ïþí\u0095\u0016\u009e\u0086X\u007fHi\u0099¸\u0095È\u0087{\u009c¿b\u0092á¨\f¢/³ÿ_a¾,i]Eè¦Ãê«üÌÄÖÛL3";
      int var6 = "\u0005\u0091È\t¢\u0099;\u0098\u008bf²F\u0081¯\u0013eï7Í2ÓpNBÃÁ\u0096¡äUdjhõX\u0000À\u0091X\u0016ûÞ\u001e\u0083_æö¢®t\u0094;\u0007B+ç?âDëÈ\u008a\u0012\u0095{)ÝH~\u0082\u0095*<Öò,ýkÞæ\u0094O\u001e?Î%ÔF\u0088\u000f@(\u008dÁÆ÷\"ä\u0005Ô\u008a\u0017Üùp\u0083:^¨\u000e·È\u0006E£\u009bª§¼I»\u0000'\u0003hÔ\u0015Z\u0010\\wÙÞ@Ü·\u009dgm\u009a\u009e¦Ú¢\u009a(Ó\b\u008ce²Â¤$ôÜ!\u009ds\u008eß:/09ÛA<Ý6Ê¡mî\r°kÕ>[Z\u0080z¸å\u0013@\u008bñF\u0088N\u0005GyKj6°\u0006\u008eü\u009a\u008eËFPú7K\u0019Åû\u008e\u0098îk\u0096ñàüþñUÒÂþ\u009dá<\u0094`i}cãt\u0086²Ò[ÚiD¤}\u001b\u0013\u00ad·{(ºì$w,\u00adgÃ#ÅÊ¼×\u0083\u0095 }\u0098\bbeá\u009dMrÞ\u008c\u000eÚH©9óª\f·í:\"h Ï\u0017\u009b#:¶½zéAÄ+'4Ý&&òÈ´ëÝQ\u0002\"x\u008d\u00adÛ\t\np Kðé\u0080\u00136OW8!f\u0082\"yS\u007fY\u009bÖà·-aÅm\u0098L¸s\u0083'\u0010\u0010WdÔdUÒfa¼¡¹&\u00ad\u008f4\u0087@z+\u001eÅâ[\u001f~\u0089ÛÞÅ\u0098Eà\u0011¬\u001c[óèÝ\u0013å\u007f\u00ad\u0018\u001aé\u0091×\u0013ÇÂ@éJ\fèÎÁ\u0080\u0010ÍÔ\u008e%·\u0088L\u0090\u0095L|¹\u001f²þòýîå8\u0005@\u0099bÐÍ\u009d²Øg<\u008cÕùáYÅ\u00ad\u009aÓ»\u007f \u0087|t\u0011\u009b\u0081\u0089cf¸\u001c?,'\u001d`\u0093û§.4miÀsÔ\u0001úÜ\u001a\u001ea6jc_É\u0087ä\u0094wÜ\u009b\u0010BB?(3Od|\u0095\u0016\u0013øU¥\u009fM ,´D¿XÀ³M´úÌfVrv\u0093âøÖi\u0097@U\u001bÓp0\u0086\u008bÙÐ[\u0010\u008f´Ê\u009dÁ\u001f\u000eª\u001aÛG\u009d\u0017mc\\\u0010=\u0017ù\u008bUW\u001c\nõúÝ&'\u009dK³\u0010H`Eø9kÓ\u0011\u0005Ã76¥\u001c;\u0003(m÷»\u0000¥\u0006ê\u0012\u0017¿gZõ¨z\u0012\u009d\u0016hÆ,ípî\u001dc½\u001f\u000eÂ»`(`Ë¸\u0098\u008bdÉ\u0010\u00953Å\u0014½S?X\u0004_èÕ æàM\u0010)©f¥\u008e\u0010\u001f\u0084\u0087x\u009a\u0091Aõ\u0082y\u0010\u0094;p!ü³\u0098g_\u0016¶m{\u000eåñ È\u001aø_8\u008a\u0092A¡a\u000bZ4@Wa\u0092Ó÷W9Ä<)5ÌvæzóVÙ8iºN\u0003^h\\î \u009b\u0081\u0097ó\u001fùRó\u0007OÑé\u0094³'ê\u008d:ùú:m.2·\u0083æ²ö]9\u00049²³²@\u000fõßW´Ú³\u001eÒC\u0010»¿©÷\u009a\u007fç\r \f+¹\u0099G\u0081×\u0010pVV ¬\u0011\u007ftxu5\u000bvXS~\u0010£\u0099Ï³^;\u0082)/Aý\u0011´$\u0090½\u0090º\u0010}\u0002F1g`\u0002B\u009bÏÁ\u0018ê¹ê\u0091_EÀg¨\u009b°\u0019\u00829G1y\u001bG\u009a\u0092]ôh'u±Öæî.\u0080»\f#ØG\u0015ì«p^Hg¥k^tuPQÚá=~ýæ'Æ;!«ôue\u000fÔÇ\u0081à»ª«Ï©\u0014ù\u0090o\u0013ÕuÓ\u0001\u0004íy%µ7\u0085Ä5ª¶PMÚ<\u0000ë\u0083HO\u0090Õ\u0094\u0099ºj\u001c\nF³Ë \u0080\u0003²â\u0013\u0097d¾í\u001fK¡½\u0086 áÝ¹\u0007\u001d\u008e?h3H£\u0098JÊúü×Ó\u0090\u00adoãV+öªTÿ\u001cÒÛ¤(F:cW\"X\u0003ªX\u000bÈÊªÒ¦\u008c\u0005\u0003mé\u008diÎa\u00815\u001e\u000eÊ\u0097»d^¹\u0005Oí\u0080`Û\u0010/Ö\r`[W×ï©\u0096&Ô\u001c\u009c¢J@Q\u0083þ9Ð\u0004³\u001cÕ+¤P\u0017àw\u0082\u0080Ïþí\u0095\u0016\u009e\u0086X\u007fHi\u0099¸\u0095È\u0087{\u009c¿b\u0092á¨\f¢/³ÿ_a¾,i]Eè¦Ãê«üÌÄÖÛL3"
         .length();
      char var3 = '\u0080';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var23;
         if ((var2 += var3) >= var6) {
            var4 = "X\"Þ©Õ~\u000b?TH«OÏèK?},\u00804ÙÒ\u001câ(\u0090#iô±ã-Ó!vwOo\b©\u0084AÈbï^<p0(\u000b\u007ffA\tÃO\u009eÑù¶?À\u0098l";
            var6 = "X\"Þ©Õ~\u000b?TH«OÏèK?},\u00804ÙÒ\u001câ(\u0090#iô±ã-Ó!vwOo\b©\u0084AÈbï^<p0(\u000b\u007ffA\tÃO\u009eÑù¶?À\u0098l".length();
            var3 = '\u0018';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var7[var5++] = var25;
               if ((var2 += var3) >= var6) {
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var7;
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new String[31];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  Lookup var19 = MethodHandles.lookup();
                  Intrinsics.checkNotNullExpressionValue(var19, "lookup(...)");
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var19;
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new ConcurrentHashMap<>();
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var0) {
      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var0;
   }

   public static boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public static boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
      boolean var0 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();
      return !var0;
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18952;
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
            throw new RuntimeException("me/octo/client/events/impl/base/EventBus", var10);
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
         throw new RuntimeException("me/octo/client/events/impl/base/EventBus" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$864ed80a9d741ba9(
      @NotNull Object targetArg, long argument2Arg
   ) {
      argument2Arg = 75338210087416L;
      argument2Arg = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll ^ argument2Arg;
      long var4 = argument2Arg ^ 94883599086710L;
      long var10001 = argument2Arg ^ 52914512883427L;
      int var6 = (int)((argument2Arg ^ 52914512883427L) >>> 48);
      int var7 = (int)((argument2Arg ^ 52914512883427L) << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      long var9 = argument2Arg ^ 103229152648230L;

      try {
         Intrinsics.checkNotNullParameter(targetArg, "target");
         if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.containsKey(targetArg)) {
            return;
         }
      } catch (Exception var28) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var28);
      }

      Object var10000 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.computeIfAbsent(
         targetArg.getClass(), EventBus::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      List var11 = (List)var10000;
      List var12 = new ArrayList();

      for (EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var14 : var11) {
         try {
            Consumer var15 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               (short)var6, targetArg, var14.getMethod(), (char)var7, var14.getEventType(), var8
            );
            EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var16 = new EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
               targetArg, var15, var14.getPriority(), var14.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
            );
            var10000 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl
               .computeIfAbsent(var14.getEventType(), EventBus::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI);
            Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
            List var17 = (List)var10000;
            int var18 = Collections.binarySearch(
               var17, var16, new EventBus$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll<>()
            );

            label52: {
               try {
                  if (var18 < 0) {
                     var32 = -var18 - 1;
                     break label52;
                  }
               } catch (Exception var26) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26);
               }

               var32 = var18;
            }

            int var19 = var32;
            var17.add(var19, var16);
            var12.add(var16);
         } catch (Exception var27) {
            throw new RuntimeException("Failed to register event handler: " + var14.getMethod().getName(), var27);
         }
      }

      label42: {
         try {
            if (!var12.isEmpty()) {
               var33 = true;
               break label42;
            }
         } catch (Exception var25) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var25);
         }

         var33 = false;
      }

      try {
         if (var33) {
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(targetArg, var12);
         }
      } catch (Exception var24) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var24);
      }
   }

   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$63e3c1228865ea82(
      @NotNull EventBus busArg, long argument2Arg, @NotNull Event eventArg, @NotNull Throwable throwableArg
   ) {
      argument2Arg = 31492472744662L;
      long var6 = argument2Arg ^ 0L;
      Intrinsics.checkNotNullParameter(busArg, "bus");
      Intrinsics.checkNotNullParameter(eventArg, "event");
      Intrinsics.checkNotNullParameter(throwableArg, "throwable");
      this.exceptionHandler.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(busArg, var6, eventArg, throwableArg);
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      private final Object target;
      @NotNull
      private final Consumer<Event> consumer;
      @NotNull
      private final EventPriority priority;
      private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 87660944209010L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         @NotNull Object targetArg, @NotNull Consumer<Event> consumerArg, @NotNull EventPriority priorityArg, boolean argument4Arg
      ) {
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 93782678828337L;
         Intrinsics.checkNotNullParameter(targetArg, "target");
         Intrinsics.checkNotNullParameter(consumerArg, "consumer");
         Intrinsics.checkNotNullParameter(priorityArg, "priority");
         super();
         this.target = targetArg;
         this.consumer = consumerArg;
         this.priority = priorityArg;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
      }

      @NotNull
      public final Object getTarget() {
         return this.target;
      }

      @NotNull
      public final Consumer<Event> getConsumer() {
         return this.consumer;
      }

      @NotNull
      public final EventPriority getPriority() {
         return this.priority;
      }

      public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull Object var1, @NotNull Consumer var2, @NotNull EventPriority var3, long var4, boolean var6
      ) {
         var4 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var4;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(7696, 1648434447014404252L ^ var4)
         );
         Intrinsics.checkNotNullParameter(
            var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(16114, 5577804807264010360L ^ var4)
         );
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"a">(4238, 2474413227476332032L ^ var4)
         );
         return new EventBus.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var1, var2, var3, var6);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 88783363807710L;
         boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         EventPriority var4 = this.priority;
         Consumer var5 = this.consumer;
         Object var6 = this.target;
         return "EventHandlerWrapper(target=" + var6 + ", consumer=" + var5 + ", priority=" + var4 + ", receiveCanceled=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = this.target.hashCode();
         var1 = var1 * 31 + this.consumer.hashCode();
         var1 = var1 * 31 + this.priority.hashCode();
         return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 54760664591475L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[10];
         int var7 = 0;
         String var6 = "\u008aAâUG@wPXî»\u0018U\u008daÖ(îÁÞH{¶¼\u00102¡°¹\u0099Ä9ç3^?\u0000ð£F\u007f\u0010ç\nµ\u0010§Ó\u0001\u0091*$5\u0007÷ÿ.\u0006(\u0004\u0089þ§\u0014\u0018Èù»åA\u009f(\u0087\u0017¶Í8öý'·y§9\u008bÕ\u009dÍË\u009bép7Hà\u0083\u0016o¹\u0018ë\u00923<X\u009d\u009az×\u0004V'\u0002¦\u0093\u0019â¡¯2\u00853#é \u0088Ò\u001fÂ\u009c\u0080ö\u0018\u000f\u0095RÜuÿ\u0084ó\u008d>ct\u0003ñ\u007fÆMº\u009f\u001fúµYí\u0018=w]´Ñ4 ö\u0011ÙÿÊ4-|üp¶åM\u0082\u008e«º8µH¥¢4V\u0000\u0019LEAÛÈ2ô\u000b\u009a\u009cÅ\u009afT¢N%\u0082£\u007fá(·æ\u009bïì¿)È\n\rÿ5B¶·ZAÒÄ\u0092ílýK½¿";
         int var8 = "\u008aAâUG@wPXî»\u0018U\u008daÖ(îÁÞH{¶¼\u00102¡°¹\u0099Ä9ç3^?\u0000ð£F\u007f\u0010ç\nµ\u0010§Ó\u0001\u0091*$5\u0007÷ÿ.\u0006(\u0004\u0089þ§\u0014\u0018Èù»åA\u009f(\u0087\u0017¶Í8öý'·y§9\u008bÕ\u009dÍË\u009bép7Hà\u0083\u0016o¹\u0018ë\u00923<X\u009d\u009az×\u0004V'\u0002¦\u0093\u0019â¡¯2\u00853#é \u0088Ò\u001fÂ\u009c\u0080ö\u0018\u000f\u0095RÜuÿ\u0084ó\u008d>ct\u0003ñ\u007fÆMº\u009f\u001fúµYí\u0018=w]´Ñ4 ö\u0011ÙÿÊ4-|üp¶åM\u0082\u008e«º8µH¥¢4V\u0000\u0019LEAÛÈ2ô\u000b\u009a\u009cÅ\u009afT¢N%\u0082£\u007fá(·æ\u009bïì¿)È\n\rÿ5B¶·ZAÒÄ\u0092ílýK½¿"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u0007'Ö ,\u0090\u0017\u00889Q\u0014ù\u0088fÿÙ£÷ú\u0085ï\u0017\u0095\n Í\u009cæÆïÊÚMÚû\u0006§yË;~¾\u0012¼}1g³xÎ-·wé´ëM";
               var8 = "\u0007'Ö ,\u0090\u0017\u00889Q\u0014ù\u0088fÿÙ£÷ú\u0085ï\u0017\u0095\n Í\u009cæÆïÊÚMÚû\u0006§yË;~¾\u0012¼}1g³xÎ-·wé´ëM".length();
               var5 = '\u0018';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[10];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 19293;
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
               throw new RuntimeException(
                  "me/octo/client/events/impl/base/EventBus$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll", var10
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
               "me/octo/client/events/impl/base/EventBus$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI
      implements me.octo.client.events.impl.base.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static String[] IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static Map IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @Override
      public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull EventBus var1, long var2, @NotNull Event var4, @NotNull Throwable var5
      ) {
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(11762, 6748006416194891271L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(29595, 5859060920295895151L ^ var2)
         );
         Intrinsics.checkNotNullParameter(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(5368, 2990640378529306382L ^ var2)
         );
         PolinexLogger.error(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(23674, 3925717862797975437L ^ var2));
         var5.printStackTrace();
      }

      static {
         long var0 = 116430852606364L ^ 121889278028270L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = "J¼Pä\u0089¨¹bÏ¦\u0015Fd4\u0083½º3\u009e\u0000B[ç¯\u0010\"Ky´Ëõ\u0084\u0007;Z\nG.\u0098\u0085~¹O\u009b\u008cÀÇ»\u0018ø\u00967nQj\u0099è@\u0098\u009a\u0080gÇÚu\u0018\u0014vCê9gô";
         int var8 = "J¼Pä\u0089¨¹bÏ¦\u0015Fd4\u0083½º3\u009e\u0000B[ç¯\u0010\"Ky´Ëõ\u0084\u0007;Z\nG.\u0098\u0085~¹O\u009b\u008cÀÇ»\u0018ø\u00967nQj\u0099è@\u0098\u009a\u0080gÇÚu\u0018\u0014vCê9gô"
            .length();
         char var5 = '0';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "´¸4¢û\u0000Ya\u0081 \"Ð¶óá¾\u0010\u0003Ë_m\u009eI\u0019Å7'²\u0015}uA»";
               var8 = "´¸4¢û\u0000Ya\u0081 \"Ð¶óá¾\u0010\u0003Ë_m\u009eI\u0019Å7'²\u0015}uA»".length();
               var5 = '\u0010';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var9;
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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

      private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 26913;
         if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/events/impl/base/EventBus$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI", var10
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
            byte[] var9 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl[var5].getBytes("ISO-8859-1");
            lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5];
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
               "me/octo/client/events/impl/base/EventBus$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
         @NotNull
         private final Method method;
         @NotNull
         private final Class<? extends Event> eventType;
         @NotNull
         private final EventPriority priority;
         private final boolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 92281069592350L;
         private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

         public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
            @NotNull Method methodArg, @NotNull Class<? extends Event> eventTypeArg, @NotNull EventPriority priorityArg, boolean argument4Arg
         ) {
            long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 134017906350226L;
            Intrinsics.checkNotNullParameter(methodArg, "method");
            Intrinsics.checkNotNullParameter(eventTypeArg, "eventType");
            Intrinsics.checkNotNullParameter(priorityArg, "priority");
            super();
            this.method = methodArg;
            this.eventType = eventTypeArg;
            this.priority = priorityArg;
            this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
         }

         @NotNull
         public final Method getMethod() {
            return this.method;
         }

         @NotNull
         public final Class<? extends Event> getEventType() {
            return this.eventType;
         }

         @NotNull
         public final EventPriority getPriority() {
            return this.priority;
         }

         public final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         public final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
            return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         }

         @NotNull
         public final EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            @NotNull Method var1, @NotNull Class var2, long var3, @NotNull EventPriority var5, char var6, boolean var7
         ) {
            long var8 = (var3 << 16 | (long)var6 << 48 >>> 48) ^ IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
            Intrinsics.checkNotNullParameter(
               var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(4423, 1269786997658306034L ^ var8)
            );
            Intrinsics.checkNotNullParameter(
               var2, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(5023, 4253480043382785831L ^ var8)
            );
            Intrinsics.checkNotNullParameter(
               var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"t">(21242, 4600996409106695748L ^ var8)
            );
            return new EventBus.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
               var1, var2, var5, var7
            );
         }

         @NotNull
         @Override
         public String toString() {
            long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 98866006309536L;
            boolean var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
            EventPriority var4 = this.priority;
            Class var5 = this.eventType;
            Method var6 = this.method;
            return "MethodMetadata(method=" + var6 + ", eventType=" + var5 + ", priority=" + var4 + ", receiveCanceled=" + var3 + ")";
         }

         @Override
         public int hashCode() {
            int var1 = this.method.hashCode();
            var1 = var1 * 31 + this.eventType.hashCode();
            var1 = var1 * 31 + this.priority.hashCode();
            return var1 * 31 + Boolean.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
         }

         @Override
         public boolean equals(@Nullable Object param1) {
            // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
         }

         static {
            long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 76979768295933L;
            Cipher var2;
            Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
            byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var3 = 1; var3 < 8; var3++) {
               var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            String[] var9 = new String[10];
            int var7 = 0;
            String var6 = "Ä\u009cîíH\u0014_2fá\u001f\u0002l\u0007J\u008e=\u0013|Ë\u0006f\u000eÆþÈþO¿N\u0007Ê\u0018w7\u000bú¤>öU\u000fº©3ú2\u0002ø\u0080FlÐ\u000b°hÿ\u0018^0¥\t\u0000pÆÇ\u0010ÎJ¢\u0082\u0019¢Vó\u0000\u000fl-¨\u0002Ü\u0018»\u0091WÕPcF¼£Ô\u0096}rÎq\\\u008f\u008dÔðñ²å\u001b\u0010\u0099s$L\u0013#~åW¡µK\u009e\u0088¼µ \u0089fBâ¥ÁÔ\\fs÷\u0094a$ª+¯¨\u0001\u0017,èÎY\u009dW5Þ\u0080ÏI¸(\u008fÍ\u0098\u0012\u001dg'¤25 \u009crí.Q\u0018\u000e\"\u000bäê¹ I\u0085òÈ]Â\fÆ\u000eì¥à\u0084åË7(\u0010\u001a\u0012À{â\u009c»ô\u0088·Û'b\u0085CúJç{h\t-þÑò>ðÀ\u0017Ùã\u0018\u0006JY\u0010íQ8";
            int var8 = "Ä\u009cîíH\u0014_2fá\u001f\u0002l\u0007J\u008e=\u0013|Ë\u0006f\u000eÆþÈþO¿N\u0007Ê\u0018w7\u000bú¤>öU\u000fº©3ú2\u0002ø\u0080FlÐ\u000b°hÿ\u0018^0¥\t\u0000pÆÇ\u0010ÎJ¢\u0082\u0019¢Vó\u0000\u000fl-¨\u0002Ü\u0018»\u0091WÕPcF¼£Ô\u0096}rÎq\\\u008f\u008dÔðñ²å\u001b\u0010\u0099s$L\u0013#~åW¡µK\u009e\u0088¼µ \u0089fBâ¥ÁÔ\\fs÷\u0094a$ª+¯¨\u0001\u0017,èÎY\u009dW5Þ\u0080ÏI¸(\u008fÍ\u0098\u0012\u001dg'¤25 \u009crí.Q\u0018\u000e\"\u000bäê¹ I\u0085òÈ]Â\fÆ\u000eì¥à\u0084åË7(\u0010\u001a\u0012À{â\u009c»ô\u0088·Û'b\u0085CúJç{h\t-þÑò>ðÀ\u0017Ùã\u0018\u0006JY\u0010íQ8"
               .length();
            char var5 = ' ';
            int var4 = -1;

            while (true) {
               byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               byte var10001 = -1;
               var9[var7++] = var21;
               if ((var4 += var5) >= var8) {
                  var6 = "\u0085ºm¼x¦\u001e¹þ¯\u0086¨ô1óß\u0018Pª\u0003\u0086Ø\u0098Ö\u008båÝ\u0095ÌÄ\u0095\u0018WÙâê\u0080©Î\u0093(";
                  var8 = "\u0085ºm¼x¦\u001e¹þ¯\u0086¨ô1óß\u0018Pª\u0003\u0086Ø\u0098Ö\u008båÝ\u0095ÌÄ\u0095\u0018WÙâê\u0080©Î\u0093(".length();
                  var5 = '\u0010';
                  var4 = -1;

                  while (true) {
                     var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     boolean var19 = false;
                     var9[var7++] = var23;
                     if ((var4 += var5) >= var8) {
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[10];
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
            int var5 = var0 ^ (int)(var1 & 32767L) ^ 6169;
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
                  throw new RuntimeException(
                     "me/octo/client/events/impl/base/EventBus$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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

         private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            Lookup var0, String var1, MethodType var2
         ) {
            MutableCallSite var3 = new MutableCallSite(var2);

            try {
               var3.setTarget(
                  MethodHandles.explicitCastArguments(
                     MethodHandles.insertArguments(
                        "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                           .asCollector(Object[].class, var2.parameterCount()),
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
                  "me/octo/client/events/impl/base/EventBus$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
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
}
