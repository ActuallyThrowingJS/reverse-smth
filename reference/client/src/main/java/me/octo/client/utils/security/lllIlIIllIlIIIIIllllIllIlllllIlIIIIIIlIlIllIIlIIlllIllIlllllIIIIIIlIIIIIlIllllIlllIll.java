package me.octo.client.utils.security;

import com.sun.jna.FunctionMapper;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import dev.jnic.bEZHZC.JNICLoader;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.ProtectionDomain;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.JNIC;
import sun.misc.Unsafe;

public class lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll {
   private static Unsafe IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Method lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static volatile boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private static volatile String lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static volatile long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static volatile long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static volatile int IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static volatile long lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map<String, Boolean> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private static Map<String, Integer> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static volatile String lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Map<String, String> lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   private static String[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private static String[] IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private static Map llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private static long[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private static Integer[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static Map IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static long[] IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private static Long[] llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private static Map IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;

   @JNIC
   private static native String[] IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();

   @JNIC
   private static native long llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

   @JNIC
   private static native long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();

   @JNIC
   public static native void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();

   @JNIC
   public static native void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll();

   @JNIC
   public static native void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII();

   @JNIC
   private static native void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();

   @JNIC
   private static native void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI();

   @JNIC
   private static native void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl();

   @JNIC
   private static native String[] IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();

   @JNIC
   private static native void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();

   @JNIC
   private static native void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl();

   @JNIC
   private static native String[] IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI();

   @JNIC
   private static native void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII();

   @JNIC
   private static native boolean IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII();

   @JNIC
   private static native boolean IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI();

   @JNIC
   private static native void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl();

   @JNIC
   private static native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var0);

   @JNIC
   private static native int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0);

   @JNIC
   private static native int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0);

   @JNIC
   private static native boolean lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI();

   @JNIC
   private static native boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(List<String> var0);

   @JNIC
   private static native String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(List<String> var0);

   @JNIC
   private static native boolean IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll();

   @JNIC
   private static native void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI();

   @JNIC
   private static native boolean lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl();

   @JNIC
   private static native boolean lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl();

   @JNIC
   private static native boolean IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll();

   @JNIC
   private static native String[] llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII();

   @JNIC
   private static native boolean IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl();

   @JNIC
   private static native boolean IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII();

   @JNIC
   private static native boolean lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll();

   @JNIC
   private static native boolean IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl();

   @JNIC
   private static native void IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll();

   @JNIC
   private static native String[] lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII();

   @JNIC
   private static native String[] lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll();

   @JNIC
   private static native void IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI();

   @JNIC
   private static native Set<String> IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll();

   @JNIC
   private static native Set<String> lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI();

   @JNIC
   private static native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      String var0, String var1, Set<String> var2, Set<String> var3
   );

   @JNIC
   private static native boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var0, String var1);

   @JNIC
   private static native void IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII();

   @JNIC
   private static native String[] lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII();

   @JNIC
   private static native void llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII();

   @JNIC
   private static native String IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl();

   @JNIC
   private static native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(File var0);

   @JNIC
   private static native void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI();

   @JNIC
   private static native Map<String, String> IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl();

   @JNIC
   private static native boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0, String var1);

   @JNIC
   private static native int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var0, String[] var1);

   @JNIC
   private static native void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(String var0, String var1);

   @JNIC
   private static native void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl();

   @JNIC
   private static native void IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl();

   @JNIC
   private static native String[] lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII();

   @JNIC
   private static native void llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI();

   @JNIC
   private static native void lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll();

   @JNIC
   private static native String[] lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl();

   @JNIC
   private static native boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var0);

   @JNIC
   private static native Process IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(String var0, String var1) throws Exception;

   @JNIC
   private static native void IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll();

   @JNIC
   private static native String IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll();

   @JNIC
   private static native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(StringBuilder var0);

   @JNIC
   private static native String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0);

   @JNIC
   private static native void IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl();

   @JNIC
   private static native void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(String var0);

   @JNIC
   private static native boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(String var0);

   @JNIC
   private static native String[] IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll();

   @JNIC
   private static native void IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll();

   @JNIC
   private static native String[] lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII();

   @JNIC
   private static native void lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI();

   @JNIC
   private static native String[] lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI();

   @JNIC
   private static native void IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI();

   @JNIC
   private static native InetAddress[] lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(String var0) throws UnknownHostException;

   @JNIC
   private static native void llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII();

   @JNIC
   private static native void IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII();

   @JNIC
   private static native File IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(URL var0);

   @JNIC
   private static native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(ProtectionDomain var0);

   @JNIC
   private static native String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(File var0);

   @JNIC
   private static native String[] IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();

   @JNIC
   private static native void lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI();

   @JNIC
   private static native String[] IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII();

   @JNIC
   private static native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Class<?> var0);

   @JNIC
   private static native void IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII();

   @JNIC
   private static native boolean llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII();

   @JNIC
   private static native String[] IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI();

   private static void IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(long var0) {
      var0 = lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl ^ var0;
      boolean var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3047868918443436141L, var0
      );

      try {
         if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            -3014126686158341755L, var0
         )) {
            lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3 = (lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll)Native.load(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16217, 5279705130544146568L ^ var0),
               lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.class,
               lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            );
            Pointer var4 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"P">(
               var3,
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(799, 2222156596176393617L ^ var0),
               -3168939125042447004L,
               var0
            );
            if (var4 != null) {
               String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  -3028217611012597737L, var0
               );
               String[] var6 = var5;
               int var7 = var5.length;
               int var8 = 0;

               String var9;
               while (true) {
                  if (var8 >= var7) {
                     return;
                  }

                  var9 = var6[var8];
                  if (!var2) {
                     return;
                  }

                  Pointer var10 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"P">(
                     var3, var4, var9, -3147420441978031477L, var0
                  );

                  label126: {
                     label138: {
                        try {
                           if (var10 == null) {
                              break label138;
                           }
                        } catch (Exception var27) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var27, -3157833416661663341L, var0
                           );
                        }

                        byte[] var11 = new byte[16];

                        try {
                           if (!var2) {
                              break label126;
                           }

                           var10.read(0L, var11, 0, 16);
                           if (lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var11, -3053881908254727687L, var0
                           )) {
                              break;
                           }
                        } catch (Exception var26) {
                           throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                              var26, -3157833416661663341L, var0
                           );
                        }
                     }

                     var8++;
                  }

                  if (!var2) {
                     return;
                  }
               }

               byte var12 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  -3115674948638786454L, var0
               );
               byte var13 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  -3054706707002087422L, var0
               );
               byte var14 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  -3011240141193564206L, var0
               );
               byte var15 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  -3163303561187808159L, var0
               );
               int var16 = 0;

               int var10000;
               label105: {
                  label104: {
                     try {
                        var10000 = var12;
                        if (!var2) {
                           break label105;
                        }

                        if (var12 == 0) {
                           break label104;
                        }
                     } catch (Exception var25) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var25, -3157833416661663341L, var0
                        );
                     }

                     var16++;
                  }

                  var10000 = var13;
               }

               label96: {
                  label95: {
                     try {
                        if (!var2) {
                           break label96;
                        }

                        if (var10000 == 0) {
                           break label95;
                        }
                     } catch (Exception var24) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var24, -3157833416661663341L, var0
                        );
                     }

                     var16++;
                  }

                  var10000 = var14;
               }

               label87: {
                  label86: {
                     try {
                        if (!var2) {
                           break label87;
                        }

                        if (var10000 == 0) {
                           break label86;
                        }
                     } catch (Exception var23) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var23, -3157833416661663341L, var0
                        );
                     }

                     var16++;
                  }

                  var10000 = var15;
               }

               label78: {
                  label77: {
                     try {
                        if (!var2) {
                           break label78;
                        }

                        if (var10000 == 0) {
                           break label77;
                        }
                     } catch (Exception var22) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var22, -3157833416661663341L, var0
                        );
                     }

                     var16++;
                  }

                  var10000 = var16;
               }

               if (var10000 >= 2) {
                  lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16725, 1056001335018215404L ^ var0),
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(10817, 8529009307759721908L ^ var0)
                        + var9
                        + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(18652, 4534959050134675303L ^ var0)
                        + var12
                        + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(24699, 8414398502245168690L ^ var0)
                        + var13
                        + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(16164, 218953420673689684L ^ var0)
                        + var14
                        + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"h">(1841, 5539299589780672643L ^ var0)
                        + var15,
                     -3062835917518764645L,
                     var0
                  );
               }
            }
         }
      } catch (Exception var28) {
      }
   }

   @JNIC
   private static native boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0);

   @JNIC
   private static native void IllIlllllllllIlllIIllIIlIllIllllIlIIlIIllllIIllIlIIIlIlIlIlIlIllIIlIlIIlIIllIlIIIlIIl();

   @JNIC
   private static native void lIIllllIIlIlIIlIllIIlllIlIIIIIlIlIlIllIllIllIIIlllIlIllIIIIIIllIllIllllIIIllllIlIIlll();

   @JNIC
   private static native void IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll();

   @JNIC
   private static native void lIIIIllllIIlIlIIIlllIIIIlIlllIIIIlIllIIllIlIlIIIIIlIllIllllIIIlIllIIIIllIIIIIlllIlIII();

   @JNIC
   private static native void llIlIIIlIllIIIIIIlllIIIIIIllIIIIIIlIIIIIllIIIIlIllIIlIlllIIIlIIlIllIIIlIIllllllIlIlIl();

   @JNIC
   private static native void IlIlIIIIlllIIllIlIlllIIlIIlIIllllIlIIIllIIIIlIlIIllllllIIIIllIIIlllIIllllllIllIlIllll();

   @JNIC
   private static native Collection<Class<?>> IIlIIIIllllIlIlIllllIIIIIIIlllIIlIIIllllIlIlIIlIIIIlIlIlIlIllIIIIIIlIIIlIllIIlIIIlllI();

   @JNIC
   private static native void lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI();

   @JNIC
   private static native void llIIIllIllIIIllllllIlIlIlIIIIIIIlllIIIIlIIlIIIIIIIllllIlllIIllIllIIIIIIIIlIIIlIIIlIII();

   @JNIC
   public static native void IlIIIllIlIlIlllIIlIIlIllllllIIIlllIllllIllllllIllIlllIllIIlIllllIlIIIIllIIIIIIIlllIll();

   @JNIC
   private static native void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(String var0);

   @JNIC
   private static native void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(String var0, String var1);

   @JNIC
   private static native String IllllIIIIIIIlIlIllIIIlIIIIIIlIIIlIIllllIIIlIIIlIllllIIIlIllIllIlIIlllIlllIlIIIlIIlIII();

   @JNIC
   private static native String lIlIIIlIllIlllllIIIllllllIllIIlIIlllIlIIlIIlllIlllIlIlIIlIIlllIlllIlllllIIlllIIIIIIll();

   @JNIC
   private static native String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var0, int var1);

   @JNIC
   private static native String IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(String var0);

   @JNIC
   private static native String IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(String var0);

   @JNIC
   private static native String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0);

   public static boolean lIllIllIIIlIlIlIlllIllIIlIllllIIlIlllIlIIIlIllIIlIlIIIIIlIIlllIIIIlIIIIllIlllIlIIlIlI(int var0, long var1) {
      long var3 = ((long)var0 << 32 | var1 << 32 >>> 32) ^ lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      boolean var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8120416235459972999L, var3
      );

      try {
         boolean var10000 = IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.isEmpty();
         if (var5) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (NumberFormatException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -8200421304977958004L, var3
         );
      }

      return false;
   }

   public static boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(String var0) {
      return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.getOrDefault(var0, false);
   }

   public static Set<String> IIIIIlIIlIllIIlllIIIIlIIllllllllIIIllIllIIIlllIllIIIIIlIIlIIIllllllIlllllIIllIllIllII() {
      return Collections.unmodifiableSet(IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.keySet());
   }

   public static void IIIlIlIIllllIIlIllllIlIlIlllllllllIlIlllIIlIIlIlIlIIllIIIIllIllllIIlllIIIlIIIIllllIlI() {
      IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.clear();
      llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI.clear();
   }

   @JNIC
   public static native void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0, String var1);

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16425;
      if (IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll", var10
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
         byte[] var9 = lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll[var5].getBytes("ISO-8859-1");
         IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl[var5];
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
            "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23027;
      if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var3] == null) {
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
         long var5 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var3];
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
         Object[] var9 = (Object[])IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var3] = var15;
      }

      return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var3];
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
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
            "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29676;
      if (llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3] == null) {
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
         long var5 = IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl[var3];
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
         Object[] var9 = (Object[])IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll", var14
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
         llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3] = var15;
      }

      return llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI[var3];
   }

   private static long IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
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

   private interface IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI extends Library {
      Map<String, Object> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new HashMap<String, Object>() {
         private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 57434279768135L;
         private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

         {
            long var1 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 10380077933443L;
            long var3 = var1 ^ 31841563354258L;
            this.put("function-mapper", (FunctionMapper)(var2, var3x) -> {
               var3 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var3;
               return IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"k">(19597, 8627296444953800229L ^ var3);
            });
         }

         static {
            long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 12901962477171L;
            Cipher var2;
            Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
            SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
            byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

            for (int var3 = 1; var3 < 8; var3++) {
               var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            String[] var9 = new String[2];
            int var7 = 0;
            String var6 = "]\u0083\u008cw\u0097i¥\u0000ÿÏË\u008e-3^.nÆ6ð\u0097Ù)\u0087ê¢üÖ\u008dÒL\u008a8\u0087iTí¾å#j\u0000Òù59îf;Ï<¨\u008eë>\u0081\u0089À1Z2Áâ\u0089g¿ÎöB\u008d8\u0005^>\u0082ÎÑB'\u001bA\u0080mÍw\u000b\u0094g&";
            int var8 = "]\u0083\u008cw\u0097i¥\u0000ÿÏË\u008e-3^.nÆ6ð\u0097Ù)\u0087ê¢üÖ\u008dÒL\u008a8\u0087iTí¾å#j\u0000Òù59îf;Ï<¨\u008eë>\u0081\u0089À1Z2Áâ\u0089g¿ÎöB\u008d8\u0005^>\u0082ÎÑB'\u001bA\u0080mÍw\u000b\u0094g&"
               .length();
            char var5 = ' ';
            int var4 = -1;

            while (true) {
               byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
               String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               byte var10001 = -1;
               var9[var7++] = var13;
               if ((var4 += var5) >= var8) {
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[2];
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
            int var5 = var0 ^ (int)(var1 & 32767L) ^ 26040;
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
                     "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                  "me/octo/client/utils/security/lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                     + " : "
                     + var1
                     + " : "
                     + var2.toString(),
                  var5
               );
            }
         }
      };

      int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         Pointer var1, int var2, Pointer var3, int var4, IntByReference var5
      );
   }

   private interface llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll extends Library {
      Map<String, Object> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new HashMap<String, Object>()// $VF: Couldn't be decompiled
// Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
;

      Pointer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();

      Pointer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1);

      Pointer IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Pointer var1, String var2);
   }
}
