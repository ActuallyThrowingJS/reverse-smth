package me.octo.client.utils.player;

public interface ZkmKeyFactory {
   void addChild(ZkmKeyFactory var1);

   int[] permutation();

   long decrypt(long var1);

   void setXorKey(long var1);

   boolean precedes(ZkmKeyFactory var1);
}
