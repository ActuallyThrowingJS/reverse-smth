package me.octo.client.mixin.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.function.Predicate;
import me.octo.client.modules.impl.features.mining.GoblinHider;
import me.octo.client.modules.impl.features.mining.IgnoreLanterns;
import me.octo.client.modules.impl.features.mining.IgnoreOrbs;
import me.octo.client.modules.impl.features.mining.ThystHider;
import me.octo.client.modules.impl.features.misc.IgnoreEntities;
import me.octo.client.utils.client.TabListUtils;
import me.octo.client.utils.skyblock.mining.ShaftUtils;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(LocalPlayer.class)
public class EntityRaycastMixin {
   @WrapOperation(
      method = "pick(Lnet/minecraft/world/entity/Entity;DDF)Lnet/minecraft/world/phys/HitResult;",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/projectile/ProjectileUtil;getEntityHitResult(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/EntityHitResult;"
      )
   )
   private static EntityHitResult modifyEntityRaycast(
      Entity var0, Vec3 var1, Vec3 var2, AABB var3, Predicate<Entity> var4, double var5, Operation<EntityHitResult> var7
   ) {
      ShaftUtils.INSTANCE.update();
      boolean var8 = IgnoreEntities.INSTANCE.isToggled() || IgnoreEntities.forceEnabled;
      boolean var9 = IgnoreEntities.ignorePlayersOnly;
      boolean var10 = ThystHider.INSTANCE.isToggled();
      boolean var11 = GoblinHider.INSTANCE.isToggled();
      boolean var12 = IgnoreLanterns.INSTANCE.isToggled();
      boolean var13 = IgnoreOrbs.INSTANCE.isToggled();
      if (!var8 && !var10 && !var11 && !var12 && !var13) {
         return (EntityHitResult)var7.call(new Object[]{var0, var1, var2, var3, var4, var5});
      } else {
         Predicate var14 = var7x -> {
            if (!var4.test(var7x)) {
               return false;
            } else if (var10 && var7x instanceof Endermite) {
               return false;
            } else if (var12 && var7x instanceof ArmorStand && IgnoreLanterns.isIgnored(var7x.getId())) {
               return false;
            } else if (var13 && var7x instanceof ArmorStand && IgnoreOrbs.isIgnored(var7x.getId())) {
               return false;
            } else {
               if (var11 && var7x instanceof RemotePlayer) {
                  String var8x = var7x.getName().getString();
                  if (var8x.contains("Golden Goblin") || var8x.contains("Diamond Goblin")) {
                     return false;
                  }
               }

               if (!var8) {
                  return true;
               } else if (var9 && var7x instanceof RemotePlayer var10x) {
                  boolean var9x = TabListUtils.INSTANCE.getNames().containsKey(var10x.getUUID());
                  return !var9x;
               } else {
                  return false;
               }
            }
         };
         return (EntityHitResult)var7.call(new Object[]{var0, var1, var2, var3, var14, var5});
      }
   }
}
