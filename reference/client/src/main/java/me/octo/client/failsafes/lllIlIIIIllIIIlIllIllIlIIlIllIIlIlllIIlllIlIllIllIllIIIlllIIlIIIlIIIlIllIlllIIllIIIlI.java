package me.octo.client.failsafes;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.game.MotionUpdateEvent;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.events.impl.packet.PacketSendEvent;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.ModUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI
   extends IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
   public static ArrayList<Vec3> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   public static ArrayList<Vec3> IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static long IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private static boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private static boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final List<Vec3> IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private final List<float[]> llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   private int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private double lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   private float lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   public static BlockPos lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   private BlockPos IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   private int llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   private int IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private ClientboundPlayerPositionPacket IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private static String IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private static long llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = 22549647386819L;
   private static String[] lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   private static String[] IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   private static Map IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = new HashMap(13);
   private static long IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;

   public lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI(String var1) {
      long var2 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 57925606423145L;
      String var10000 = lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      super(var1);
      String var4 = var10000;

      try {
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new LinkedList<>();
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new LinkedList<>();
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = 0.0F;
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
         if (var4 != null) {
            int[] var5 = new int[2];
            me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var5
            );
         }
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   private static void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var0) {
      var0 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var0;
      String var2 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -2858957796632954373L, var0
      );

      int var10000;
      label20: {
         try {
            long var5;
            var10000 = (
                     var5 = System.currentTimeMillis()
                        - IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        - IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll
                  )
                  == 0L
               ? 0
               : (var5 < 0L ? -1 : 1);
            if (var2 != null) {
               break label20;
            }

            if (var10000 > 0) {
               return;
            }
         } catch (MatchException var3) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var3, -2770439145901205005L, var0
            );
         }

         var10000 = 1;
      }

      IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = (boolean)var10000;
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(PacketReceivedEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private int IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(ClientboundPlayerPositionPacket param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, ClientboundPlayerPositionPacket param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 var1, long var2) {
      var2 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ var2;
      long var4 = var2 ^ 83789916690191L;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         856736841049909834L, var2
      );
      Iterator var7 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.iterator();
      String var6 = var10000;

      while (var7.hasNext()) {
         Vec3 var8 = (Vec3)var7.next();
         if (var8 != null) {
            double var9 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var4, var8);

            try {
               double var14;
               int var13 = (var14 = var9 - 0.1) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
               if (var6 != null) {
                  return (boolean)var13;
               }

               if (var13 <= 0) {
                  return (boolean)1;
               }
            } catch (MatchException var11) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var11, 737500518177704514L, var2
               );
            }
         }

         if (var6 != null) {
            break;
         }
      }

      return false;
   }

   private boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 param1, long param2, BlockPos param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Vec3 param0, long param1, BlockPos param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0, Vec3 param2, Vec3 param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(PacketSendEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MotionUpdateEvent var1) {
      long var2 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 98838848626813L;
      long var4 = (var2 ^ 63635547222675L) >>> 16;
      int var6 = (int)((var2 ^ 63635547222675L) << 48 >>> 48);

      try {
         if (!var1.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, (short)var6)) {
            ;
         }
      } catch (MatchException var8) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8);
      }
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.events.impl.game.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1
   ) {
      try {
         if (ModUtils.mc.player.tickCount % 60 == 0) {
            this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;
            this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
            this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
         }
      } catch (MatchException var2) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
      }
   }

   @SubscribeEvent
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI var1
   ) {
      long var2 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 71797624324801L;
      lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = 0.0;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 0;

      try {
         this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 0;
         this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = 0;
         if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            String var5 = "gHPxf";
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5);
         }
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }
   }

   private BlockPos IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static BlockPos IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param0, float param2, float param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent(priority = EventPriority.HIGHEST)
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      me.octo.client.events.impl.other.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var1
   ) {
      long var2 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 60303512403334L;
      long var4 = var2 ^ 8548016178749L;

      try {
         if (var1.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() != null) {
            this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = ModUtils.mc.getDeltaTracker().getGameTimeDeltaTicks();
         }
      } catch (MatchException var7) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var7);
      }

      lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = this.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(
         var4
      );
   }

   private double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Entity var1) {
      return var1.xo + (var1.getX() - var1.xo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Entity var1) {
      return var1.yo + (var1.getY() - var1.yo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Entity var1) {
      return var1.zo + (var1.getZ() - var1.zo) * this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   private Vec3 IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(Entity var1) {
      return new Vec3(
         this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1),
         this.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var1),
         this.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var1)
      );
   }

   static {
      long var14 = llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI ^ 124962207449726L;
      Object var16 = null;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((String)var16);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var6 = 1; var6 < 8; var6++) {
         var10003[var6] = (byte)(var14 << var6 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[26];
      int var10 = 0;
      String var9 = "eÎ¹\u00996^Üô½çåO&\u009bn\b\u000fcss\u0015»Ê×zñ¸b<G¾\u0010×\u0005õOÅ)¹¹(\u0093}z{y·j¨°\u000eÎðpÐÀE\u0004\u0080v8(£#æ\u001cð8¬YÅ\u0096\u0098½Ð9¿\u000b\u0011_\u0095(\u009c\fë,c=cRe\u0082¾ØÒþ\u0092¥£ÙI\u001e¼x\u001c\u0098£S\u0010ðÆ×\u0082ìøá~L7âr~\u0010iÃê\u0091\u008cÀF\u001bB/ã¶ÙìTâ(¢\u0087W\u000f\u0094ô\u0082w\u0095`\u009cm@\u001c½å(\u009c\u009a\u009eC\nu%·ôèÚô]*º]TE«\\QP\u0018\u0010ð«\u009dÎ±Ö°è\u009aâXÐ%\u0098.Ñp_\u0001\u0086D\u0096bú'bö«xØ\\OK¾÷\u0091!\u0084Nè6J\u0091\u001e\u0083û\u0088,\u008a\u0010\u009aU{\n7Ôëè'Ø\u001a\\)\u0005Zß©/l,\u009eÿºá\u0007Õ\u0013·Ì\u009a\u008fD\u009b,\u0005r4ÿ\u000eF\ná°Ôv\u009cD\u0094q¡/ÃS7Ì\u0012\u0086~\u0095o\u001f»]\u008f³TÜÎ¬ùéûÍ'B}Ã#à(\u0096\u009e\u0014ì\u0080êÒ\u0089\u009d¼é©\u0015öS<¯j§\u0084¼#\u0099vX3\u0014Â½\u0098«å§`ö¯\u0007 \u0011\u0004\u0010\u001e\u001e¶nHg$\u0004¬ì«ÿå\u0000Ì_\u0010\u001eÉC?\u0096\u0081[Z¯{\u009b© \u0017\u0086W\u0010\u000e£\u0083èÐî\u0011yÿNæ\u008aãwJÀ (\u0088C½ñ6\u001fjû\u0089'01Ì\u0016õÌËm^\t\u0097ò³.±Í\u0000\u009dAvà Ú\"0eÂ}~¼KW\u0001ÃbÌÐx\u0017\u0092fÓyW\u000f\b\u0093\u008fÙ\u000e\u001b\náÞ\u00103\u0090Ä+\u00ad\u0007ó ?\u0015?ó\u0003ºñh(_ÁÚN=~Í!fR\u00004Ë+elPÊ>h/ \u0003¥\u0082\u0005wê\t\u0002\u0098^\b1Gµè¸«§@ xpG½@\u008a0\u0083I\u00184\u0092ªtÐ´è\u0081Æ\u0001Ñ\b¤r\u0018ÓoÌx\u008a/ 7«°2d\u0089\u0085\u0007 ãk\u0086\u0003\\6@fôÕlzB\u0082[H\u0093x\u009b\r\u009eZ(Q\u0017f;hÔ\u0082_\u0010«*Ô\u0011ºËFYg\u009bÏ·À\u001b\u000eê\u009d}äZ!\u0015A@pe±\n±\u0087y0çB\u0082\u007f×\u000e\u0091v\u0095·dë×\u009añbø¿µ>\u009an\u0001Ð\u008dãà¤\u007fêJ¹\u008b¶q~<=ná\u0017\u008dkm\u0011c\u0006\u0083\u0018þ6Ï\u0014\u0010±\u001b×ºÖP²\u009f\u000e\u0091\u008f1Â¨·)ÒB]8\u0090\u0012\u008f.>íè\u000f\\åêrêß\u0003\u0089\u001a\u001b\u0016vï\u0086Á±×\u0082S?\u0097ç\nèv\u0083è\u001d\u009cf\u007f\u0098½Ê'2\u0082\u0096\u00032È[¢æ\u0087\u0083°R\u0010¿\u0010\u000fsI\u008ec|ú2\u0089l¡\u0004\u0087ª0\f\u0084Ù/^ú:In8CªË3wZ&ë9[r55\u008cÂ\u0088gh)\t =Èß¿qA\u0085\u000e´)UÛ©ÊÊP\u0098\u0010F\u0014\u008f\u0007Z97õTÿè\u0017¦0h9 0Â\u001eº9z\u0019u4¯L\u0001Î(=Þ\r\u0002\u0007|Ë?\u008e\u0095-Tª7i©ö\u0014";
      int var11 = "eÎ¹\u00996^Üô½çåO&\u009bn\b\u000fcss\u0015»Ê×zñ¸b<G¾\u0010×\u0005õOÅ)¹¹(\u0093}z{y·j¨°\u000eÎðpÐÀE\u0004\u0080v8(£#æ\u001cð8¬YÅ\u0096\u0098½Ð9¿\u000b\u0011_\u0095(\u009c\fë,c=cRe\u0082¾ØÒþ\u0092¥£ÙI\u001e¼x\u001c\u0098£S\u0010ðÆ×\u0082ìøá~L7âr~\u0010iÃê\u0091\u008cÀF\u001bB/ã¶ÙìTâ(¢\u0087W\u000f\u0094ô\u0082w\u0095`\u009cm@\u001c½å(\u009c\u009a\u009eC\nu%·ôèÚô]*º]TE«\\QP\u0018\u0010ð«\u009dÎ±Ö°è\u009aâXÐ%\u0098.Ñp_\u0001\u0086D\u0096bú'bö«xØ\\OK¾÷\u0091!\u0084Nè6J\u0091\u001e\u0083û\u0088,\u008a\u0010\u009aU{\n7Ôëè'Ø\u001a\\)\u0005Zß©/l,\u009eÿºá\u0007Õ\u0013·Ì\u009a\u008fD\u009b,\u0005r4ÿ\u000eF\ná°Ôv\u009cD\u0094q¡/ÃS7Ì\u0012\u0086~\u0095o\u001f»]\u008f³TÜÎ¬ùéûÍ'B}Ã#à(\u0096\u009e\u0014ì\u0080êÒ\u0089\u009d¼é©\u0015öS<¯j§\u0084¼#\u0099vX3\u0014Â½\u0098«å§`ö¯\u0007 \u0011\u0004\u0010\u001e\u001e¶nHg$\u0004¬ì«ÿå\u0000Ì_\u0010\u001eÉC?\u0096\u0081[Z¯{\u009b© \u0017\u0086W\u0010\u000e£\u0083èÐî\u0011yÿNæ\u008aãwJÀ (\u0088C½ñ6\u001fjû\u0089'01Ì\u0016õÌËm^\t\u0097ò³.±Í\u0000\u009dAvà Ú\"0eÂ}~¼KW\u0001ÃbÌÐx\u0017\u0092fÓyW\u000f\b\u0093\u008fÙ\u000e\u001b\náÞ\u00103\u0090Ä+\u00ad\u0007ó ?\u0015?ó\u0003ºñh(_ÁÚN=~Í!fR\u00004Ë+elPÊ>h/ \u0003¥\u0082\u0005wê\t\u0002\u0098^\b1Gµè¸«§@ xpG½@\u008a0\u0083I\u00184\u0092ªtÐ´è\u0081Æ\u0001Ñ\b¤r\u0018ÓoÌx\u008a/ 7«°2d\u0089\u0085\u0007 ãk\u0086\u0003\\6@fôÕlzB\u0082[H\u0093x\u009b\r\u009eZ(Q\u0017f;hÔ\u0082_\u0010«*Ô\u0011ºËFYg\u009bÏ·À\u001b\u000eê\u009d}äZ!\u0015A@pe±\n±\u0087y0çB\u0082\u007f×\u000e\u0091v\u0095·dë×\u009añbø¿µ>\u009an\u0001Ð\u008dãà¤\u007fêJ¹\u008b¶q~<=ná\u0017\u008dkm\u0011c\u0006\u0083\u0018þ6Ï\u0014\u0010±\u001b×ºÖP²\u009f\u000e\u0091\u008f1Â¨·)ÒB]8\u0090\u0012\u008f.>íè\u000f\\åêrêß\u0003\u0089\u001a\u001b\u0016vï\u0086Á±×\u0082S?\u0097ç\nèv\u0083è\u001d\u009cf\u007f\u0098½Ê'2\u0082\u0096\u00032È[¢æ\u0087\u0083°R\u0010¿\u0010\u000fsI\u008ec|ú2\u0089l¡\u0004\u0087ª0\f\u0084Ù/^ú:In8CªË3wZ&ë9[r55\u008cÂ\u0088gh)\t =Èß¿qA\u0085\u000e´)UÛ©ÊÊP\u0098\u0010F\u0014\u008f\u0007Z97õTÿè\u0017¦0h9 0Â\u001eº9z\u0019u4¯L\u0001Î(=Þ\r\u0002\u0007|Ë?\u008e\u0095-Tª7i©ö\u0014"
         .length();
      char var8 = '(';
      int var18 = -1;

      label37:
      while (true) {
         String var19 = var9.substring(++var18, var18 + var8);
         byte var10001 = -1;

         while (true) {
            byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
            String var27 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var13).intern();
            switch (var10001) {
               case 0:
                  var12[var10++] = var27;
                  if ((var18 += var8) >= var11) {
                     lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = var12;
                     IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = new String[26];
                     Cipher var0;
                     var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var14 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var14 << var1 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long var2 = 6149097779310667578L;
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
                     long var31 = (var4[0] & 255L) << 56
                        | (var4[1] & 255L) << 48
                        | (var4[2] & 255L) << 40
                        | (var4[3] & 255L) << 32
                        | (var4[4] & 255L) << 24
                        | (var4[5] & 255L) << 16
                        | (var4[6] & 255L) << 8
                        | var4[7] & 255L;
                     var10001 = -1;
                     IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var31;
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new ArrayList<>(
                        Arrays.asList(
                           new Vec3(-2.5, 70.0, -69.5),
                           new Vec3(0.5, 149.0, -68.5),
                           new Vec3(0.5, 128.0, 200.5),
                           new Vec3(-503.0, 101.0, -275.0),
                           new Vec3(-360.0, 80.0, -430.5),
                           new Vec3(-48.5, 200.0, -121.5)
                        )
                     );
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new ArrayList<>(
                        Arrays.asList(new Vec3(-48.5, 200.0, -121.5), new Vec3(0.5, 128.0, 200.5))
                     );
                     return;
                  }

                  var8 = var9.charAt(var18);
                  break;
               default:
                  var12[var10++] = var27;
                  if ((var18 += var8) < var11) {
                     var8 = var9.charAt(var18);
                     continue label37;
                  }

                  var9 = "Õß\u0017¸N\u0017Î\\ênaÂ$ÅÎx_\u001a,\u0093\u0000Æý~ÎV-»\u0086â^_tköLE}M\u008cöt\u0088¬èÔ\u0005ÉØ\u008b\ráÙ\\²,\u0010\u0088¤S\u0090èKåJ¹B0öÜÂ¶ä";
                  var11 = "Õß\u0017¸N\u0017Î\\ênaÂ$ÅÎx_\u001a,\u0093\u0000Æý~ÎV-»\u0086â^_tköLE}M\u008cöt\u0088¬èÔ\u0005ÉØ\u008b\ráÙ\\²,\u0010\u0088¤S\u0090èKåJ¹B0öÜÂ¶ä"
                     .length();
                  var8 = '8';
                  var18 = -1;
            }

            var19 = var9.substring(++var18, var18 + var8);
            var10001 = 0;
         }
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var0) {
      IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var0;
   }

   public static String lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
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

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12645;
      if (IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/failsafes/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll[var5].getBytes("ISO-8859-1");
         IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
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
            "me/octo/client/failsafes/lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }
}
