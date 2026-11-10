package me.octo.client.utils.client;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.JvmField;
import me.octo.client.utils.fastutil.Pool;
import org.jetbrains.annotations.NotNull;

public final class GenericPools {
   @NotNull
   public static GenericPools IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new GenericPools();
   @JvmField
   @NotNull
   public static Pool<HashMap<Object, Object>> HASH_MAP = new Pool<>(
      GenericPools::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
      <unrepresentable>.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
   );
   @JvmField
   @NotNull
   public static Pool<HashSet<Object>> HASH_SET = new Pool<>(
      GenericPools::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
      <unrepresentable>.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
   );

   private GenericPools() {
   }

   private static final HashMap IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return new HashMap();
   }

   private static final HashSet llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      return new HashSet();
   }
}
