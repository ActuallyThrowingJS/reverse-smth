package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.entity.GetFovEvent;
import me.octo.client.events.impl.entity.UpdateCameraEvent;
import me.octo.client.modules.impl.features.misc.Freecam;
import me.octo.client.modules.impl.features.visuals.Freelook;
import net.minecraft.client.Camera;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.phys.Vec3;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Camera.class)
public abstract class CameraMixin {
   @Shadow
   private boolean detached;
   @Shadow
   private float yRot;
   @Shadow
   private float xRot;
   @Shadow
   private Vec3 position;
   @Shadow
   private Quaternionf rotation;
   @Shadow
   private int matrixPropertiesDirty;
   @Shadow
   private static Vector3f FORWARDS;
   @Shadow
   private static Vector3f UP;
   @Shadow
   private static Vector3f LEFT;
   @Shadow
   private MutableBlockPos blockPosition;
   @Shadow
   private Vector3f forwards;
   @Shadow
   private Vector3f up;
   @Shadow
   private Vector3f left;

   @ModifyArgs(method = "alignWithEntity", require = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;setRotation(FF)V"))
   private void onUpdateSetRotationArgs(Args var1) {
      Freecam var2 = Freecam.INSTANCE;
      if (var2.isSimulationActive()) {
         var1.set(0, var2.getYaw());
         var1.set(1, var2.getPitch());
      } else {
         Freelook var3 = Freelook.INSTANCE;
         if (var3.isPlayerMode()) {
            var1.set(0, var3.getCameraYaw());
            var1.set(1, var3.getCameraPitch());
         }
      }
   }

   @Inject(method = "getMaxZoom", at = @At("HEAD"), cancellable = true, require = 0)
   private void onClipToSpace(float var1, CallbackInfoReturnable<Float> var2) {
      Freelook var3 = Freelook.INSTANCE;
      me.octo.client.modules.impl.features.visuals.Camera var4 = me.octo.client.modules.impl.features.visuals.Camera.INSTANCE;
      boolean var5 = var3.isPlayerMode() && this.detached
         || var4.isToggled() && me.octo.client.modules.impl.features.visuals.Camera.getCameraClip().isToggled();
      if (var5) {
         float var6 = var1;
         if (var3.isPlayerMode()) {
            var6 = var3.getDistance();
         }

         var2.setReturnValue(var6);
      }
   }

   @ModifyArg(method = "setupPerspective", require = 0, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;getMaxZoom(F)F"), index = 0)
   private float modifyDesiredCameraDistance(float var1) {
      Freelook var2 = Freelook.INSTANCE;
      me.octo.client.modules.impl.features.visuals.Camera var3 = me.octo.client.modules.impl.features.visuals.Camera.INSTANCE;
      if (var2.isPlayerMode() && this.detached) {
         return var2.getDistance();
      } else {
         return var3.isToggled() ? var3.getSmoothCameraDistance() : var1;
      }
   }

   @ModifyReturnValue(method = "calculateFov", at = @At("RETURN"))
   private float onCalculateFov(float var1) {
      GetFovEvent var2 = new GetFovEvent(var1);
      PolinexAccessor.INSTANCE.eventBus.post(var2);
      return var2.getFov();
   }

   @Inject(method = "setRotation", at = @At("HEAD"), cancellable = true)
   public void onSetRotation(float var1, float var2, CallbackInfo var3) {
      UpdateCameraEvent.Rotation var4 = new UpdateCameraEvent.Rotation(var1, var2);
      if (PolinexAccessor.INSTANCE.eventBus.post(var4)) {
         var3.cancel();
      } else {
         if (var4.isModified()) {
            var3.cancel();
            this.setRotationNoEvent(var4.getYaw(), var4.getPitch());
         }
      }
   }

   @Inject(method = "setPosition(Lnet/minecraft/world/phys/Vec3;)V", at = @At("HEAD"), cancellable = true)
   public void onSetPosition(Vec3 var1, CallbackInfo var2) {
      UpdateCameraEvent.Position var3 = new UpdateCameraEvent.Position(this.position.x, this.position.y, this.position.z);
      if (PolinexAccessor.INSTANCE.eventBus.post(var3)) {
         var2.cancel();
      } else {
         if (var3.isModified()) {
            var2.cancel();
            this.setPositionNoEvent(var3.x(), var3.y(), var3.z());
         }
      }
   }

   @Unique
   private void setPositionNoEvent(double var1, double var3, double var5) {
      this.position = new Vec3(var1, var3, var5);
      this.blockPosition.set(var1, var3, var5);
   }

   @Unique
   private void setRotationNoEvent(float var1, float var2) {
      this.xRot = var2;
      this.yRot = var1;
      this.rotation.rotationYXZ((float) Math.PI - var1 * (float) (Math.PI / 180.0), -var2 * (float) (Math.PI / 180.0), 0.0F);
      FORWARDS.rotate(this.rotation, this.forwards);
      UP.rotate(this.rotation, this.up);
      LEFT.rotate(this.rotation, this.left);
      this.matrixPropertiesDirty |= 3;
   }
}
