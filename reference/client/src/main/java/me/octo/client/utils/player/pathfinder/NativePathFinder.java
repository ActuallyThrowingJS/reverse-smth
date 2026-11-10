package me.octo.client.utils.player.pathfinder;

import java.nio.ByteBuffer;

public class NativePathFinder {
   public static boolean IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = false;

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var0) {
      System.load(var0);
      IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = true;
   }

   public static native void processChunk(int var0, int var1, ByteBuffer var2);

   public static native void loadCache(byte[] var0, int var1);

   public static native void updateChunk(int var0, int var1, int var2, int[] var3, byte[] var4, int var5);

   public static native void updateHeights(int var0, int var1, short[] var2, int var3);

   public static native void clearCache();

   public static native long[] findPath(long var0, long var2, float var4, int var5, boolean var6);

   public static native boolean canReach(long var0, long var2, float var4, int var5, boolean var6);

   public static native byte getByteState(int var0, int var1, int var2);

   public static native byte getByteState(long var0);

   public static native boolean isWalkable(long var0);

   public static native boolean canEtherwarpTo(double var0, double var2, double var4, long var6, double var8);
}
