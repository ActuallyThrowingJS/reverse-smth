package me.octo.client.gui.components;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.PolinexLogger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
   @NotNull
   private final List<llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new ArrayList<>();
   private int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   private int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 39754768379522L;
   private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static String[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private static Map IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new HashMap(13);
   private static long[] llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private static Integer[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private static Map lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private static long lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char var1, long var2, @NotNull llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var4
   ) {
      long var5 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Intrinsics.checkNotNullParameter(
         var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(7046, 743076654437373954L ^ var5)
      );
      this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.add(var4);
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var3 = var1 ^ 112686110868240L;
      String var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         7074776936790067998L, var1
      );

      boolean var10000;
      label30: {
         label29: {
            try {
               var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
               if (var5 == null) {
                  break label30;
               }

               if (!var10000) {
                  break label29;
               }
            } catch (MatchException var7) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var7, 7091461648416436823L, var1
               );
            }

            var10000 = false;
            break label30;
         }

         var10000 = true;
      }

      try {
         if (var10000) {
            ((llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)CollectionsKt.last(
                  this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               ))
               .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var3);
         }
      } catch (MatchException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, 7091461648416436823L, var1
         );
      }
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(char var1, int var2, char var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      long var6 = var4 ^ 88335840801560L;
      Iterable var9 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1307906500798905110L, var4
      );
      boolean var10 = false;
      Iterator var11 = var9.iterator();
      String var8 = var10000;

      while (var11.hasNext()) {
         Object var12 = var11.next();
         if (var8 != null) {
            llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var13 = (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)var12;
            boolean var14 = false;
            var13.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var6);
            if (var8 != null) {
               continue;
            }
         }
         break;
      }
   }

   public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      String var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3492941054776301898L, var1
      );

      try {
         boolean var10000 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.isEmpty();
         if (var3 == null) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (MatchException var4) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var4, -3476266049966743553L, var1
         );
      }

      return false;
   }

   @Nullable
   public final llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
      return (llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll)CollectionsKt.lastOrNull(
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
      );
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      String var3 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5591283633032111273L, var1
      );

      try {
         if (this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII) {
            return;
         }
      } catch (MatchException var20) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var20, -5611340244092771810L, var1
         );
      }

      String var4 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(13534, 454813804314909914L ^ var1);
      String var5 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(9568, 8024937427403820391L ^ var1);
      int var6 = GL20.glCreateShader(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(22699, 7654552508321593591L ^ var1)
      );
      GL20.glShaderSource(var6, var4);
      GL20.glCompileShader(var6);
      int var7 = GL20.glGetShaderi(
         var6, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(17068, 3529350381100720882L ^ var1)
      );

      int var24;
      label80: {
         label79: {
            int var13;
            label78: {
               try {
                  var13 = var7;
                  if (var3 == null) {
                     break label78;
                  }

                  if (var7 != 0) {
                     break label79;
                  }
               } catch (MatchException var19) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var19, -5611340244092771810L, var1
                  );
               }

               String var10000 = GL20.glGetShaderInfoLog(var6);
               Intrinsics.checkNotNullExpressionValue(
                  var10000, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(31060, 5019474033453928790L ^ var1)
               );
               String var8 = var10000;
               PolinexLogger.error(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(23942, 6191929859890754944L ^ var1) + var8
               );
               break label79;
            }

            var24 = var13;
            break label80;
         }

         var24 = GL20.glCreateShader(
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(10503, 2549894441837857114L ^ var1)
         );
      }

      int var22 = var24;
      String var25 = var3;
      GL20.glShaderSource(var22, var5);
      GL20.glCompileShader(var22);
      int var9 = GL20.glGetShaderi(
         var22, llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(7234, 8998448949758344218L ^ var1)
      );

      label68: {
         label67: {
            try {
               if (var25 == null) {
                  break label68;
               }

               if (var9 != 0) {
                  break label67;
               }
            } catch (MatchException var18) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var18, -5611340244092771810L, var1
               );
            }

            String var26 = GL20.glGetShaderInfoLog(var22);
            Intrinsics.checkNotNullExpressionValue(
               var26, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(28020, 8998523126873884023L ^ var1)
            );
            String var10 = var26;
            PolinexLogger.error(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(20433, 6179269550070507486L ^ var1) + var10
            );
         }

         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = GL20.glCreateProgram();
         GL20.glAttachShader(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var6);
         GL20.glAttachShader(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII, var22);
         GL20.glLinkProgram(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
      }

      int var23 = GL20.glGetProgrami(
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(30460, 9024862596467087019L ^ var1)
      );

      label58: {
         label57: {
            int var14;
            label56: {
               label91: {
                  try {
                     var14 = var23;
                     if (var3 == null) {
                        break label56;
                     }

                     if (var23 != 0) {
                        break label91;
                     }
                  } catch (MatchException var17) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var17, -5611340244092771810L, var1
                     );
                  }

                  String var27 = GL20.glGetProgramInfoLog(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
                  Intrinsics.checkNotNullExpressionValue(
                     var27, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(6068, 2749887803099611066L ^ var1)
                  );
                  String var11 = var27;

                  try {
                     PolinexLogger.error(
                        IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(29206, 7902042370234980891L ^ var1) + var11
                     );
                     if (var3 != null) {
                        break label58;
                     }
                  } catch (MatchException var16) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var16, -5611340244092771810L, var1
                     );
                  }
               }

               try {
                  var24 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  break label57;
               } catch (MatchException var15) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var15, -5611340244092771810L, var1
                  );
               }
            }

            var24 = var14;
         }

         PolinexLogger.info(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"e">(31, 3086340026885793822L ^ var1) + var24);
      }

      GL20.glDeleteShader(var6);
      GL20.glDeleteShader(var22);
      long var10001 = 479293391888845453L ^ var1;
      float[] var12 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
      this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = GL30.glGenVertexArrays();
      this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = GL30.glGenBuffers();
      GL30.glBindVertexArray(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
      GL30.glBindBuffer(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(10962, var10001),
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI
      );
      GL30.glBufferData(
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(22599, 4146795065186514972L ^ var1),
         var12,
         llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(5467, 8983029087127155969L ^ var1)
      );
      GL30.glVertexAttribPointer(0, 2, 5126, false, 16, 0L);
      var10001 = 4146795065186514972L ^ var1;
      GL30.glEnableVertexAttribArray(0);
      GL30.glVertexAttribPointer(1, 2, 5126, false, 16, lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
      GL30.glEnableVertexAttribArray(1);
      GL30.glBindBuffer(llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"k">(22599, var10001), 0);
      GL30.glBindVertexArray(0);
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = true;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float param1, long param2, float param4, float param5, float param6, float param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, long var3, float var5, float var6, int var7
   ) {
      var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var3;
      long var10001 = var3 ^ 112682685359991L;
      int var8 = (int)((var3 ^ 112682685359991L) >>> 48);
      int var9 = (int)((var3 ^ 112682685359991L) << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);

      try {
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000 = this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
         if (var10000 != null) {
            return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var1, var2, (short)var8, (char)var9, var5, var6, var7, var10
            );
         }
      } catch (MatchException var11) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var11, -3753257783329924137L, var3
         );
      }

      return false;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      float var1, float var2, float var3, float var4, double var5, double var7
   ) {
      llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000 = this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
      return var10000 != null
         ? var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var3, var4, var5, var7)
         : false;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1, int var2, long var3, int var5) {
      var3 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var3;
      long var10001 = var3 ^ 28670128763428L;
      int var6 = (int)((var3 ^ 28670128763428L) >>> 32);
      int var7 = (int)((var3 ^ 28670128763428L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);

      try {
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000 = this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
         if (var10000 != null) {
            return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var2, var6, var7, (char)var8, var5);
         }
      } catch (MatchException var9) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var9, -3236215875717676248L, var3
         );
      }

      return false;
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, char var3, int var4) {
      var1 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ var1;
      long var10001 = var1 ^ 101744031696017L;
      int var5 = (int)((var1 ^ 101744031696017L) >>> 32);
      int var6 = (int)((var1 ^ 101744031696017L) << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);

      try {
         llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll var10000 = this.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
         if (var10000 != null) {
            return var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var5, var3, (char)var6, (char)var7, var4);
         }
      } catch (MatchException var8) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var8, -7047887950271410674L, var1
         );
      }

      return false;
   }

   static {
      long var16 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI ^ 104548922707978L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var19 = 1; var19 < 8; var19++) {
         var10003[var19] = (byte)(var16 << var19 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[12];
      int var23 = 0;
      String var22 = "ù¦Ý\u009e*ßXv\u000b3Å$\u008a¼ËhVÜ°\u008dw³ÞHØJÉl\u0000r@\u0002´{c\t+\u000e\u009eÜ\u0085\u0012å\u001f\u001d\u0085\u001c u\u0006\u008b¤`\u0098»ºÚ©:9\n_å*ÚÚ\u0013*è\u0097b<ÆQÙÙv\u0084Ì¯CQ\u0096\u001e^@³B\u009c\u000b³}û\u0096'\u0018\u009e\u008a(Ùs\u001cMk`\u0080\u0087P´ÑqÓh\u0005&¦Ó¨\u009b_²ßê\\^I\u0011<\u00023zS¨ri<\u0010ßmøC Y3\u008clÁ¶Ù\u0094\u009f·Û7\u008f ûUVõ\u0016\u0000ìßSÉ\u0089YzªÖi\u009bq\u00945\u00053\u0092¼ì\u0019\u0016Ô\\ÂÇ\u001a@C\u0097ða%WcnCÝ¹\u009c¸\"k\u0085Ä1zq\u0014\u0084»\u009aÄ\u000b\u000e Üü.#°\u0096\u009e`¶J\u009bÇ0þüj+úµÔA\u0094û¬À(.$¡\u0092ûøV¾£}õ\u0010G4ÂÊ\u0006Ëè\u0007?¶\u0011¯\u008eÜì\u001e\u00adQøYO\u0093\u0088\u0013\u0081@\u009a·3\u009e\u0007)\u0011©\u0093®U\u001cUrÉÅúDE\u001e6eÆ¥{ñ\"\u0011@(oæá\u0094DÿÒëÐg\u0010C¬\u0000ÞÔÿÔ3±0\u0098P£\u0089>\u0089Ĩ¦¥uÍ¬©\u008dê)e\u0082Á\u009d,\u0095Íf\u009fh\u0087³·¾«\u000f3¨é¯Q¹*\u0000+\u0089wß/Ò\u009dÀ\u0090!\u009e\u0016ú±4\u008b\u0005±\u0000òaTª!¹¸·-\u0099»\u0089ëeO8§\u001d\u001aõg!H¦\u0080x-\n¤\u0000D½w]Öoîâpn¯r-,\u009dk\u001f\u0004v7¸\u0080dP¾ìe^\u001dhÆaåX\u0083{Bð+\u000eF\u0012×Üù\u009a@\u0016\u0086+\u0012ç\u0080\u0016\u0086ËÃ\u001f\u008aWj\u0082\u008b11y_¥\u0016yc7ÊÐd\u008aI.7Ó,\u0085t\u0003+Ôèä\u008bEíÅ^ûô\u008e\u008b\u0094ÿ\u0012\u007f6àGo\u0083>Vö\u008e\u0083\u0081ÑÔ¯)på&v\u008cjA¹\u0093¶ûl\"Ç\b¯Æ\u0081\u0094¸lßíÙ\u008fZ\fqI½\t¢\u0095/\u0007o-\u0013ø«\\÷<\u0091\u0001-\u0097Ð\u0092J-ÉìyA?ë|Y\u0019¾\u008e{iÃ(\u001cS\u0012luÞò0FqÖÛg\u001eo¼ËÙtuWS\u0003Í>d\u0006\u0004½\u001f\u0011\u00810õT³\u0011â\u009eÚ6\u001cEñ\u0019\u0015M6\u0014\u0093S¢ëî¡Ð\\|\u000fà9\u007f\u00976<«\nÕ6½±\u0095OáOå\rg·tÂ( \u0013h\u0002êP\u001bè\u00134fôDU±Õ°¾Ú¨lS\u0001tÝ\u000fZ24C¨'Oü\bÊêlàíh*@5\r\u001b§»æ\u00adöàÅiª=lãÈaôñ16±\u0006\u009bú¾È|`\u0016ó\u009bpÃ±x¨k\u001d\u009c³\\Ýc\"ÿ]\u008f³\\ó \u0089ñxñ6\u0082\u0083gÙçf/ÐeMá¼rX\u0099½N\u0019\u008c\u009cr®Ö\u0090oágr\nð@qeÀàÜÀ\f7¶\u0001ÿ\u0089÷ö\u0010rê\u000b(\u0000\u0099ä47D\u0093\u001eÒ\u0084\u0000ª`¬\u009fSR\u0086üjÄ\\\u0016U\u0085Ð¹niÏA°\\\\ bÊ%ªcë\u009a\rê³0\u0019Åh\u0086u_|W8:ô¾îçF¥á\u0018_÷_\u0081²¸ÛOÃVM$\u008b¡K\u000bq\u0097me!\b²\u008b\u007f}\u0017\f´Ï\u0015\u0081\nï\u0000j%óòÙä<³\fî8`Âl\u001d\u0090\u001f _qOÈ\u0015\u0095èßºVuoðaÇ\u0097Ò\u0015GG +<X¹dÎVgC~\u0019ï¨N\tv \u0084êW°*\u0007ÚÆl}\u0087";
      int var24 = "ù¦Ý\u009e*ßXv\u000b3Å$\u008a¼ËhVÜ°\u008dw³ÞHØJÉl\u0000r@\u0002´{c\t+\u000e\u009eÜ\u0085\u0012å\u001f\u001d\u0085\u001c u\u0006\u008b¤`\u0098»ºÚ©:9\n_å*ÚÚ\u0013*è\u0097b<ÆQÙÙv\u0084Ì¯CQ\u0096\u001e^@³B\u009c\u000b³}û\u0096'\u0018\u009e\u008a(Ùs\u001cMk`\u0080\u0087P´ÑqÓh\u0005&¦Ó¨\u009b_²ßê\\^I\u0011<\u00023zS¨ri<\u0010ßmøC Y3\u008clÁ¶Ù\u0094\u009f·Û7\u008f ûUVõ\u0016\u0000ìßSÉ\u0089YzªÖi\u009bq\u00945\u00053\u0092¼ì\u0019\u0016Ô\\ÂÇ\u001a@C\u0097ða%WcnCÝ¹\u009c¸\"k\u0085Ä1zq\u0014\u0084»\u009aÄ\u000b\u000e Üü.#°\u0096\u009e`¶J\u009bÇ0þüj+úµÔA\u0094û¬À(.$¡\u0092ûøV¾£}õ\u0010G4ÂÊ\u0006Ëè\u0007?¶\u0011¯\u008eÜì\u001e\u00adQøYO\u0093\u0088\u0013\u0081@\u009a·3\u009e\u0007)\u0011©\u0093®U\u001cUrÉÅúDE\u001e6eÆ¥{ñ\"\u0011@(oæá\u0094DÿÒëÐg\u0010C¬\u0000ÞÔÿÔ3±0\u0098P£\u0089>\u0089Ĩ¦¥uÍ¬©\u008dê)e\u0082Á\u009d,\u0095Íf\u009fh\u0087³·¾«\u000f3¨é¯Q¹*\u0000+\u0089wß/Ò\u009dÀ\u0090!\u009e\u0016ú±4\u008b\u0005±\u0000òaTª!¹¸·-\u0099»\u0089ëeO8§\u001d\u001aõg!H¦\u0080x-\n¤\u0000D½w]Öoîâpn¯r-,\u009dk\u001f\u0004v7¸\u0080dP¾ìe^\u001dhÆaåX\u0083{Bð+\u000eF\u0012×Üù\u009a@\u0016\u0086+\u0012ç\u0080\u0016\u0086ËÃ\u001f\u008aWj\u0082\u008b11y_¥\u0016yc7ÊÐd\u008aI.7Ó,\u0085t\u0003+Ôèä\u008bEíÅ^ûô\u008e\u008b\u0094ÿ\u0012\u007f6àGo\u0083>Vö\u008e\u0083\u0081ÑÔ¯)på&v\u008cjA¹\u0093¶ûl\"Ç\b¯Æ\u0081\u0094¸lßíÙ\u008fZ\fqI½\t¢\u0095/\u0007o-\u0013ø«\\÷<\u0091\u0001-\u0097Ð\u0092J-ÉìyA?ë|Y\u0019¾\u008e{iÃ(\u001cS\u0012luÞò0FqÖÛg\u001eo¼ËÙtuWS\u0003Í>d\u0006\u0004½\u001f\u0011\u00810õT³\u0011â\u009eÚ6\u001cEñ\u0019\u0015M6\u0014\u0093S¢ëî¡Ð\\|\u000fà9\u007f\u00976<«\nÕ6½±\u0095OáOå\rg·tÂ( \u0013h\u0002êP\u001bè\u00134fôDU±Õ°¾Ú¨lS\u0001tÝ\u000fZ24C¨'Oü\bÊêlàíh*@5\r\u001b§»æ\u00adöàÅiª=lãÈaôñ16±\u0006\u009bú¾È|`\u0016ó\u009bpÃ±x¨k\u001d\u009c³\\Ýc\"ÿ]\u008f³\\ó \u0089ñxñ6\u0082\u0083gÙçf/ÐeMá¼rX\u0099½N\u0019\u008c\u009cr®Ö\u0090oágr\nð@qeÀàÜÀ\f7¶\u0001ÿ\u0089÷ö\u0010rê\u000b(\u0000\u0099ä47D\u0093\u001eÒ\u0084\u0000ª`¬\u009fSR\u0086üjÄ\\\u0016U\u0085Ð¹niÏA°\\\\ bÊ%ªcë\u009a\rê³0\u0019Åh\u0086u_|W8:ô¾îçF¥á\u0018_÷_\u0081²¸ÛOÃVM$\u008b¡K\u000bq\u0097me!\b²\u008b\u007f}\u0017\f´Ï\u0015\u0081\nï\u0000j%óòÙä<³\fî8`Âl\u001d\u0090\u001f _qOÈ\u0015\u0095èßºVuoðaÇ\u0097Ò\u0015GG +<X¹dÎVgC~\u0019ï¨N\tv \u0084êW°*\u0007ÚÆl}\u0087"
         .length();
      char var21 = 'à';
      int var20 = -1;

      while (true) {
         byte[] var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
         String var50 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26).intern();
         byte var10001 = -1;
         var25[var23++] = var50;
         if ((var20 += var21) >= var24) {
            var22 = "]\u008eJ}\u0083\u0086£Á\u0087gÙìÓ¡N Y|ÛÙo/÷\u0088\"A`¿þ\u001fþO_Ï\u0013  \u009a\u009d°·$\u0089iY|ú\f:ÚDæ C\u0090§Ãö¨^½G5Y(*Â¡?Ó\u008c<Mh\u0095oêbà!oÿ´!¹Ém\u001b\u009c\u001fóU±'÷ô¤ýøKÙa\u001e\u0084F";
            var24 = "]\u008eJ}\u0083\u0086£Á\u0087gÙìÓ¡N Y|ÛÙo/÷\u0088\"A`¿þ\u001fþO_Ï\u0013  \u009a\u009d°·$\u0089iY|ú\f:ÚDæ C\u0090§Ãö¨^½G5Y(*Â¡?Ó\u008c<Mh\u0095oêbà!oÿ´!¹Ém\u001b\u009c\u001fóU±'÷ô¤ýøKÙa\u001e\u0084F"
               .length();
            var21 = '@';
            var20 = -1;

            while (true) {
               var26 = var18.doFinal(var22.substring(++var20, var20 + var21).getBytes("ISO-8859-1"));
               String var52 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var26).intern();
               int var43 = 0;
               var25[var23++] = var52;
               if ((var20 += var21) >= var24) {
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var25;
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new String[12];
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var6 = 1; var6 < 8; var6++) {
                     var10003[var6] = (byte)(var16 << var6 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[9];
                  int var8 = 0;
                  String var9 = "QÅ-¿[\".H\u0018\u0019Y@Í\u001eæø\u009eÕ\fÅÎ¿õÞ\u0089\"M9\u0083Íä)+\u0096\u000e\u009d·j<Á\u008bJ\u0086×ÞD\u0016\\Pà¡÷ãf1¸";
                  int var10 = "QÅ-¿[\".H\u0018\u0019Y@Í\u001eæø\u009eÕ\fÅÎ¿õÞ\u0089\"M9\u0083Íä)+\u0096\u000e\u009d·j<Á\u008bJ\u0086×ÞD\u0016\\Pà¡÷ãf1¸"
                     .length();
                  byte var7 = 0;

                  do {
                     var43 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var43, var7).getBytes("ISO-8859-1");
                     var43 = var8++;
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
                     byte var58 = -1;
                     var11[var43] = var10004;
                  } while (var7 < var10);

                  var9 = "b!\n\u0013Cêb\u0081\u0091Ê+\u0011Õö_\u0085";
                  var10 = "b!\n\u0013Cêb\u0081\u0091Ê+\u0011Õö_\u0085".length();
                  var7 = 0;

                  do {
                     int var47 = var7;
                     var7 += 8;
                     byte[] var30 = var9.substring(var47, var7).getBytes("ISO-8859-1");
                     var47 = var8++;
                     long var31 = (var30[0] & 255L) << 56
                        | (var30[1] & 255L) << 48
                        | (var30[2] & 255L) << 40
                        | (var30[3] & 255L) << 32
                        | (var30[4] & 255L) << 24
                        | (var30[5] & 255L) << 16
                        | (var30[6] & 255L) << 8
                        | var30[7] & 255L;
                     byte[] var32 = var5.doFinal(
                        new byte[]{
                           (byte)(var31 >>> 56),
                           (byte)(var31 >>> 48),
                           (byte)(var31 >>> 40),
                           (byte)(var31 >>> 32),
                           (byte)(var31 >>> 24),
                           (byte)(var31 >>> 16),
                           (byte)(var31 >>> 8),
                           (byte)var31
                        }
                     );
                     long var61 = (var32[0] & 255L) << 56
                        | (var32[1] & 255L) << 48
                        | (var32[2] & 255L) << 40
                        | (var32[3] & 255L) << 32
                        | (var32[4] & 255L) << 24
                        | (var32[5] & 255L) << 16
                        | (var32[6] & 255L) << 8
                        | var32[7] & 255L;
                     boolean var59 = false;
                     var11[var47] = var61;
                  } while (var7 < var10);

                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var11;
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new Integer[9];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var16 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var16 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -2717193297350990169L;
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
                  long var56 = (var4[0] & 255L) << 56
                     | (var4[1] & 255L) << 48
                     | (var4[2] & 255L) << 40
                     | (var4[3] & 255L) << 32
                     | (var4[4] & 255L) << 24
                     | (var4[5] & 255L) << 16
                     | (var4[6] & 255L) << 8
                     | var4[7] & 255L;
                  byte var49 = -1;
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var56;
                  return;
               }

               var21 = var22.charAt(var20);
            }
         }

         var21 = var22.charAt(var20);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22621;
      if (lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/gui/components/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var10
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
         byte[] var9 = IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll[var5];
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
            "me/octo/client/gui/components/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4101;
      if (lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3] == null) {
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
         long var5 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI[var3];
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
         Object[] var9 = (Object[])lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/gui/components/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3] = var15;
      }

      return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var3];
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
            "me/octo/client/gui/components/IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
