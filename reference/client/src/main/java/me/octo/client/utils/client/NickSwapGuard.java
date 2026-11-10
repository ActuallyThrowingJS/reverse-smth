package me.octo.client.utils.client;

public final class NickSwapGuard {
   private static ThreadLocal<Boolean> IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ThreadLocal.withInitial(
      () -> false
   );

   private NickSwapGuard() {
   }

   public static boolean isSuppressed() {
      return IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.get();
   }

   public static void setSuppressed(boolean var0) {
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.set(var0);
   }
}
