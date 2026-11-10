package me.octo.client.utils.network;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.jnic.bEZHZC.JNICLoader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import me.octo.client.utils.JNIC;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JNIC
public final class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII {
   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @NotNull
   private static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   @NotNull
   private static AtomicReference<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private static AtomicReference<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static Gson IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   @NotNull
   private static List<Function1<JsonObject, Unit>> IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static long IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static String[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static long[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Long[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;

   private llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII() {
   }

   private final native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1,
      long var2
   );

   @JvmStatic
   public static final native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, @NotNull Function1 var2);

   @JvmStatic
   public static final native void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      int var0, @NotNull Function1 var1, int var2, int var3
   );

   @JvmStatic
   public static final synchronized native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0);

   @JvmStatic
   public static final native void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var0);

   @JvmStatic
   public static final native boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, @NotNull String var2);

   @JvmStatic
   public static final native void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0);

   @JvmStatic
   public static final native boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(short var0, long var1);

   @JvmStatic
   public static final native boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, int var1, char var2);

   @JvmStatic
   @NotNull
   public static final native String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long var0);

   @JvmStatic
   public static final native int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var0);

   private static native Exception IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Exception var0);

   private static native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0);

   private static native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1);

   private static native Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   );

   private static native CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Lookup var0, String var1, MethodType var2
   );

   private static native long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1);

   private static native long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   );

   private static native CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, String var1, MethodType var2
   );

   static {
      JNICLoader.init();
      $jnicLoader();
      $jnicClinit();
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private volatile boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private volatile boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final AtomicBoolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final AtomicBoolean lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private final AtomicBoolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private final AtomicInteger IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private final AtomicInteger IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private final AtomicLong lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private final AtomicLong IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private final LinkedBlockingQueue<String> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @NotNull
      private final ExecutorService lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private final ScheduledExecutorService lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      @Nullable
      private ScheduledFuture<?> lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      @Nullable
      private ScheduledFuture<?> lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      @Nullable
      private ScheduledFuture<?> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      private long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      private static long IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = 48365844645297L;
      private static String[] IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
      private static String[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
      private static Map llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
         long var1 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 126076226125566L;
         long var10001 = var1 ^ 62827058857429L;
         int var3 = (int)((var1 ^ 62827058857429L) >>> 32);
         int var4 = (int)((var1 ^ 62827058857429L) << 32 >>> 48);
         int var5 = (int)(var10001 << 48 >>> 48);
         super();
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new AtomicBoolean(false);
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new AtomicBoolean(false);
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new AtomicBoolean(false);
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new AtomicInteger(0);
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new AtomicInteger(0);
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new AtomicLong(0L);
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new AtomicLong(0L);
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new LinkedBlockingQueue<>(
            var6.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         );
         ExecutorService var7 = Executors.newCachedThreadPool(
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
         );
         Intrinsics.checkNotNullExpressionValue(var7, "newCachedThreadPool(...)");
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var7;
         ScheduledExecutorService var8 = Executors.newSingleThreadScheduledExecutor(
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI
         );
         Intrinsics.checkNotNullExpressionValue(var8, "newSingleThreadScheduledExecutor(...)");
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var8;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 1;
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(boolean var1) {
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var1;
      }

      @NotNull
      public final AtomicBoolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final AtomicBoolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final AtomicBoolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final AtomicInteger IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final AtomicInteger IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final AtomicLong IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final AtomicLong IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final LinkedBlockingQueue<String> IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final ExecutorService lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final ScheduledExecutorService IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @Nullable
      public final ScheduledFuture<?> IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable ScheduledFuture<?> var1) {
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
      }

      @Nullable
      public final ScheduledFuture<?> IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@Nullable ScheduledFuture<?> var1) {
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
      }

      @Nullable
      public final ScheduledFuture<?> IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
         return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
      }

      public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@Nullable ScheduledFuture<?> var1) {
         this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = var1;
      }

      public final long IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
         return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = var1;
      }

      public final int llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
         return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var1;
      }

      private static final Thread IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Runnable var0) {
         Thread var1 = new Thread(var0);
         boolean var3 = false;
         var1.setDaemon(true);
         return var1;
      }

      private static final Thread llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         int var0, char var1, char var2, Runnable var3
      ) {
         long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
            ^ IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
         Thread var6 = new Thread(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"s">(18387, 3264300741038479314L ^ var4)
         );
         boolean var8 = false;
         var6.setDaemon(true);
         return var6;
      }

      static {
         long var0 = IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl ^ 111648979649291L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[3];
         int var7 = 0;
         String var6 = "^Ñès$ê\u0095wDý\u0013ñò{¶Ð\u0084¯«\u008d²Ò\u00adH\u001dÀê\"g35\u0089\u0096#@ï\nZaÛQà¤Õ\"\u0004]ö?\u001fÃx\u0019º¢,(\u00adÕB¸\u0084~¶4i\u0086\u0085Y¾%ó¹Jl\u0000\fJÈ\u0088t³¾L¼w»êâ°\u001bÑ-\u009e4§î@\u001e\u0087\u008fm}d\u0007Ã\u0097ÖlA;þ_;Ût¾u¨b\u001a\u009b1\u0095$\u008aV\u0005 ê³+\u0017È±(\u0099\u001bÝ\u0080-Ü\u0098\b\u0082p\u0093Iì\u008d\u009b½Ö\fT\u009b²3\u0011§\u0001¡";
         int var8 = "^Ñès$ê\u0095wDý\u0013ñò{¶Ð\u0084¯«\u008d²Ò\u00adH\u001dÀê\"g35\u0089\u0096#@ï\nZaÛQà¤Õ\"\u0004]ö?\u001fÃx\u0019º¢,(\u00adÕB¸\u0084~¶4i\u0086\u0085Y¾%ó¹Jl\u0000\fJÈ\u0088t³¾L¼w»êâ°\u001bÑ-\u009e4§î@\u001e\u0087\u008fm}d\u0007Ã\u0097ÖlA;þ_;Ût¾u¨b\u001a\u009b1\u0095$\u008aV\u0005 ê³+\u0017È±(\u0099\u001bÝ\u0080-Ü\u0098\b\u0082p\u0093Iì\u008d\u009b½Ö\fT\u009b²3\u0011§\u0001¡"
            .length();
         char var5 = '8';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var13;
            if ((var4 += var5) >= var8) {
               IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var9;
               IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = new String[3];
               return;
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 27435;
         if (IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
            byte[] var9 = IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll[var5].getBytes("ISO-8859-1");
            IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var5];
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
               "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll extends Thread {
      @NotNull
      private final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll parentState;
      @NotNull
      private final AtomicReference<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> parentClient;
      private volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static long[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private static Long[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private static Map llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @NotNull llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll parentStateArg,
         @NotNull AtomicReference<llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI> parentClientArg
      ) {
         long var3 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 51701860790560L;
         Intrinsics.checkNotNullParameter(parentStateArg, "parentState");
         Intrinsics.checkNotNullParameter(parentClientArg, "parentClient");
         super("WebSocket-Worker");
         this.parentState = parentStateArg;
         this.parentClient = parentClientArg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = true;
      }

      @Override
      public void run() {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      @JNIC
      private final native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();

      @JNIC
      private final native void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      @JNIC
      private final native String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();

      @JNIC
      private final native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1);

      @JNIC
      private final native llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         String var1
      );

      @JNIC
      private final native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      );

      @JNIC
      private final native void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();

      @JNIC
      private final native void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();

      @JNIC
      private final native void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var1
      );

      public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int param1, int param2, short param3) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param0,
         long param1,
         ObjectRef param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long param0,
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param2,
         llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI param3
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 9560;
         if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
            byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
               "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
         int var3 = var0 ^ (int)(var1 & 32767L) ^ 31447;
         if (IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var3] == null) {
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
            long var5 = lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var3];
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
            Object[] var9 = (Object[])llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.get(var8);

            byte[] var10;
            try {
               if (var9 == null) {
                  var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.put(var8, var9);
               }

               DESKeySpec var11 = new DESKeySpec(var4);
               SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
               Cipher var13 = (Cipher)var9[0];
               var13.init(2, var12, (IvParameterSpec)var9[2]);
               var10 = var13.doFinal(var7);
            } catch (Exception var14) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
                  var14
               );
            }

            long var15 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var3] = var15;
         }

         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII[var3];
      }

      private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         Lookup var0, MutableCallSite var1, String var2, Object[] var3
      ) {
         int var4 = (Integer)var3[0];
         long var5 = (Long)var3[1];
         long var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
         MethodHandle var9 = MethodHandles.constant(long.class, var7);
         var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
               "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      static {
         JNICLoader.init();
         $jnicLoader();
         $jnicClinit();
      }
   }

// UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private static long lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static Map IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static long[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Long[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

      @JNIC
      @NotNull
      public final native List<String> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();

      @JNIC
      @NotNull
      public final native String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      @JNIC
      public final native long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();

      @JNIC
      public final native long IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();

      @JNIC
      public final native long lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();

      @JNIC
      public final native int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII();

      @JNIC
      public final native long IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();

      @JNIC
      public final native double IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();

      @JNIC
      public final native int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();

      @JNIC
      public final native long IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();

      @JNIC
      public final native int lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();

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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 4959;
         if (lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5].getBytes("ISO-8859-1");
            lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5];
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
               "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
         int var3 = var0 ^ (int)(var1 & 32767L) ^ 32126;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var3] == null) {
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
            long var5 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var3];
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
            Object[] var9 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var8);

            byte[] var10;
            try {
               if (var9 == null) {
                  var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var8, var9);
               }

               DESKeySpec var11 = new DESKeySpec(var4);
               SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
               Cipher var13 = (Cipher)var9[0];
               var13.init(2, var12, (IvParameterSpec)var9[2]);
               var10 = var13.doFinal(var7);
            } catch (Exception var14) {
               throw new RuntimeException(
                  "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                  var14
               );
            }

            long var15 = (var10[0] & 255L) << 56
               | (var10[1] & 255L) << 48
               | (var10[2] & 255L) << 40
               | (var10[3] & 255L) << 32
               | (var10[4] & 255L) << 24
               | (var10[5] & 255L) << 16
               | (var10[6] & 255L) << 8
               | var10[7] & 255L;
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var3] = var15;
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var3];
      }

      private static long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         Lookup var0, MutableCallSite var1, String var2, Object[] var3
      ) {
         int var4 = (Integer)var3[0];
         long var5 = (Long)var3[1];
         long var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
         MethodHandle var9 = MethodHandles.constant(long.class, var7);
         var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
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
               "me/octo/client/utils/network/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }

      static {
         JNICLoader.init();
         $jnicLoader();
         $jnicClinit();
      }
   }
}
