// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import java.util.function.Supplier;

final class Obf00339$Obf00564<T> {
   private final Supplier<T> Obf00487;
   private volatile boolean Obf00120;
   private T Obf00013;
   private static final long[] a;
   private static final Long[] b;

   Obf00339$Obf00564(
      Supplier<T> var1
   ) {
      this.Obf00487 = var1;
   }

   Object Obf00099(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:178)
      //
      // Bytecode:
      // 00: ldc2_w 835754600633044824
      // 03: lload 1
      // 04: invokedynamic À (JJ)Z bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 09: istore 3
      // 0a: aload 0
      // 0b: iload 3
      // 0c: ifne 7b
      // 0f: ldc2_w 838467293974762476
      // 12: lload 1
      // 13: lconst_0
      // 14: lcmp
      // 15: iflt 75
      // 18: lload 1
      // 19: invokedynamic Ü (Ljava/lang/Object;JJ)Z bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e: ifne 71
      // 21: aload 0
      // 22: dup
      // 23: astore 4
      // 25: lload 1
      // 26: lconst_0
      // 27: lcmp
      // 28: iflt 2d
      // 2b: monitorenter
      // 2c: aload 0
      // 2d: lload 1
      // 2e: lconst_1
      // 2f: lcmp
      // 30: iflt 65
      // 33: ldc2_w 838467293974762476
      // 36: lload 1
      // 37: invokedynamic Ü (Ljava/lang/Object;JJ)Z bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3c: ifne 63
      // 3f: aload 0
      // 40: aload 0
      // 41: ldc2_w 838693056824617119
      // 44: lload 1
      // 45: invokedynamic Ü (Ljava/lang/Object;JJ)Ljava/util/function/Supplier; bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4a: invokeinterface java/util/function/Supplier.get ()Ljava/lang/Object; 1
      // 4f: ldc2_w 835072792209196157
      // 52: lload 1
      // 53: invokedynamic ì (Ljava/lang/Object;Ljava/lang/Object;JJ)V bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 58: aload 0
      // 59: bipush 1
      // 5a: ldc2_w 838467293974762476
      // 5d: lload 1
      // 5e: invokedynamic ì (Ljava/lang/Object;ZJJ)V bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: aload 4
      // 65: monitorexit
      // 66: goto 71
      // 69: astore 5
      // 6b: aload 4
      // 6d: monitorexit
      // 6e: aload 5
      // 70: athrow
      // 71: aload 0
      // 72: ldc2_w 835072792209196157
      // 75: lload 1
      // 76: invokedynamic Ü (Ljava/lang/Object;JJ)Ljava/lang/Object; bsm=lol/polinexclient/loader/lIlllllIIIIlIlIIIIIlIIlIlllllIlIlIlIlllllllIllllIIllllIllIIIlllIlIllIlIIIlIIlIIlIIllI.IIlIlIllIIIlIIlIlllllIIlIIllIIIllIIlIIIIIlIIllllIIlllIlIIIIIlIlllIIlIlIlIIllIlIIIllII (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: areturn
   }

   static {
      long var0 = 6657109393900258425L;
      long[] var6 = new long[6];
      int var3 = 0;
      String var4 = "?{ÍÄ\\{½¯xÍk®\u000b5=Ë\u000b\u00859Y\u008e%«þ\u0005\u0097²\u00adËÆEÆ";
      int var5 = "?{ÍÄ\\{½¯xÍk®\u000b5=Ë\u000b\u00859Y\u008e%«þ\u0005\u0097²\u00adËÆEÆ".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               (var7[0] & 255L) << 56
                  | (var7[1] & 255L) << 48
                  | (var7[2] & 255L) << 40
                  | (var7[3] & 255L) << 32
                  | (var7[4] & 255L) << 24
                  | (var7[5] & 255L) << 16
                  | (var7[6] & 255L) << 8
                  | var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      var4 = "[+P\u009a\u0086ðs|\\>\u001fæ§.qñ";
      var5 = "[+P\u009a\u0086ðs|\\>\u001fæ§.qñ".length();
      var2 = 0;

      do {
         int var13 = var2;
         var2 += 8;
         byte[] var11 = var4.substring(var13, var2).getBytes("ISO-8859-1");
         var13 = var3++;
         long var16 = (
               (var11[0] & 255L) << 56
                  | (var11[1] & 255L) << 48
                  | (var11[2] & 255L) << 40
                  | (var11[3] & 255L) << 32
                  | (var11[4] & 255L) << 24
                  | (var11[5] & 255L) << 16
                  | (var11[6] & 255L) << 8
                  | var11[7] & 255L
            )
            ^ var0;
         boolean var15 = false;
         var6[var13] = var16;
      } while (var2 < var5);

      a = var6;
      b = new Long[6];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 27873) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}
