// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

class Obf00339$Obf00107
   extends RuntimeException {
   private static String Obf00487;
   private static final long a;

   @Override
   public synchronized Throwable fillInStackTrace() {
      return this;
   }

   @Override
   public String getMessage() {
      return null;
   }

   @Override
   public String toString() {
      long var1 = a;
      return Obf00487;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var23;
      label54: {
         char[] var10001 = "DU\tl/Qr@SQBtI\\Hy\u001a`nOjkF\rbs\u00073iw_bwXaFQ\u001ei!QzC]\u000b-dEpKQ\u001bhe".toCharArray();
         int var10003 = var10001.length;
         int var3 = 0;
         var23 = var10001;
         int var7 = var10003;
         char[] var36;
         int var10004;
         if (var10003 <= 1) {
            var36 = var10001;
            var10004 = var3;
         } else {
            var23 = var10001;
            var7 = var10003;
            if (var10003 <= var3) {
               break label54;
            }

            var36 = var10001;
            var10004 = var3;
         }

         while (true) {
            var36[var10004] = (char)(var36[var10004] ^ switch (var3 % 7) {
               case 0 -> 3;
               case 1 -> 66;
               case 2 -> 94;
               case 3 -> 80;
               case 4 -> 102;
               case 5 -> 114;
               default -> 29;
            });
            var3++;
            if (var7 == 0) {
               var10004 = var7;
               var36 = var23;
            } else {
               if (var7 <= var3) {
                  break;
               }

               var36 = var23;
               var10004 = var3;
            }
         }
      }

      String var43 = new String(var23).intern();
      int var11 = -1;
      String var2 = var43;
      long var0 = 2217523917950315464L;
      long var27 = 2217487542884210567L ^ var0;
      var11 = (byte)-1;
      a = var27;
      char[] var13 = var2.toCharArray();
      int var44 = var13.length;
      int var4 = 0;
      var23 = var13;
      var11 = var44;
      char[] var47;
      int var56;
      if (var44 <= 1) {
         var47 = var13;
         var56 = var4;
      } else {
         var23 = var13;
         var11 = var44;
         if (var44 <= var4) {
            var43 = new String(var13).intern();
            byte var21 = -1;
            Obf00487 = var43;
            return;
         }

         var47 = var13;
         var56 = var4;
      }

      while (true) {
         var47[var56] = (char)(var47[var56] ^ switch (var4 % 7) {
            case 0 -> 45;
            case 1 -> 118;
            case 2 -> 33;
            case 3 -> 93;
            case 4 -> 103;
            case 5 -> 79;
            default -> 14;
         });
         var4++;
         if (var11 == 0) {
            var56 = var11;
            var47 = var23;
         } else {
            if (var11 <= var4) {
               var43 = new String(var23).intern();
               byte var20 = -1;
               Obf00487 = var43;
               return;
            }

            var47 = var23;
            var56 = var4;
         }
      }
   }
}
