package me.octo.client.utils.player;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.minecraft.world.entity.EntityAttachment;
import net.minecraft.world.entity.EntityAttachments;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.phys.Vec3;

public class PlayerPosesUtils {
   public static Vec3 IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new Vec3(0.0, 0.6, 0.0);
   public static EntityDimensions STANDING_DIMENSIONS = EntityDimensions.scalable(0.6F, 1.8F)
      .withEyeHeight(1.62F)
      .withAttachments(
         EntityAttachments.builder().attach(EntityAttachment.VEHICLE, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
      );
   private static EntityDimensions lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EntityDimensions.fixed(0.2F, 0.2F)
      .withEyeHeight(0.2F);
   public static Map<Pose, EntityDimensions> POSES = ImmutableMap.builder()
      .put(Pose.STANDING, STANDING_DIMENSIONS)
      .put(Pose.SLEEPING, lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII)
      .put(Pose.FALL_FLYING, EntityDimensions.scalable(0.6F, 0.6F).withEyeHeight(0.4F))
      .put(Pose.SWIMMING, EntityDimensions.scalable(0.6F, 0.6F).withEyeHeight(0.4F))
      .put(Pose.SPIN_ATTACK, EntityDimensions.scalable(0.6F, 0.6F).withEyeHeight(0.4F))
      .put(
         Pose.CROUCHING,
         EntityDimensions.scalable(0.6F, 1.5F)
            .withEyeHeight(1.62F)
            .withAttachments(
               EntityAttachments.builder()
                  .attach(EntityAttachment.VEHICLE, IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl)
            )
      )
      .put(Pose.DYING, EntityDimensions.fixed(0.2F, 0.2F).withEyeHeight(1.62F))
      .build();
}
