package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.game.Render3DEvent;
import me.octo.client.events.impl.render.DrawOverlayEvent;
import me.octo.client.events.impl.render.DrawPreWorldEvent;
import me.octo.client.events.impl.render.DrawScreenEvent;
import me.octo.client.events.impl.render.DrawWorldEvent;
import me.octo.client.events.impl.render.GameRenderEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.modules.impl.features.visuals.NoRender;
import me.octo.client.render.WorldRenderEnvironment;
import me.octo.client.render.WorldText;
import me.octo.client.render.util.FrameMatrices;
import me.octo.client.render.util.WorldToScreen;
import me.octo.client.utils.collection.Pools;
import me.octo.client.utils.render.world.FrustumUtils;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
   @Shadow
   @Final
   private Minecraft minecraft;
   @Shadow
   @Final
   private Camera mainCamera;

   @Inject(method = "render", at = @At("HEAD"))
   public void hookGameRender(CallbackInfo var1) {
      PolinexAccessor.INSTANCE.eventBus.post(GameRenderEvent.INSTANCE);
   }

   @Inject(
      method = "renderLevel",
      require = 0,
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/state/level/CameraEntityRenderState;isSleeping:Z", opcode = 180)
   )
   public void hookWorldRender(
      DeltaTracker var1, CallbackInfo var2, @Local(name = "projectionMatrix") Matrix4f var3, @Local(name = "modelViewMatrix") Matrix4fc var4
   ) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         WorldToScreen.setMatrices(var3, var4);
         WorldText.setMatrices(var3, var4);
         FrustumUtils.update(var3, var4);
         Vec3 var5 = this.mainCamera.position();
         FrameMatrices.update(var3, var4, var5.x, var5.y, var5.z);
         PoseStack var6 = Pools.MatStack.borrow();

         try {
            var6.mulPose(var4);
            WorldRenderEnvironment.beginWorldFrame(this.minecraft.getMainRenderTarget(), var6, this.mainCamera);
            PolinexAccessor.INSTANCE.eventBus.post(new WorldRenderEvent(var6, this.mainCamera, var1.getGameTimeDeltaPartialTick(false)));
         } finally {
            WorldRenderEnvironment.endWorldFrame();
            Pools.MatStack.recycle(var6);
         }
      }
   }

   @Inject(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V"
      )
   )
   private void onRenderWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         if (this.mainCamera != null) {
            float var3 = var1.getGameTimeDeltaPartialTick(true);
            Render3DEvent var4 = new Render3DEvent(
               new PoseStack(),
               var3,
               var1.getGameTimeDeltaPartialTick(true),
               this.mainCamera,
               this.mainCamera.position().x,
               this.mainCamera.position().y,
               this.mainCamera.position().z
            );
            PolinexAccessor.INSTANCE.eventBus.post(var4);
         }
      }
   }

   @Inject(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V"
      )
   )
   private void callPreWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         PolinexAccessor.INSTANCE.eventBus.post(new DrawPreWorldEvent());
      }
   }

   @Inject(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;renderLevel(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;ZLnet/minecraft/client/renderer/chunk/ChunkSectionsToRender;)V",
         shift = Shift.AFTER
      )
   )
   private void callPostWorld(DeltaTracker var1, CallbackInfo var2) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         PolinexAccessor.INSTANCE.eventBus.post(new DrawWorldEvent());
      }
   }

   @Inject(
      method = "render",
      require = 0,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V")
   )
   private void onRenderOverlay(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         PolinexAccessor.INSTANCE.eventBus.post(new DrawOverlayEvent());
      }
   }

   @Inject(
      method = "render",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/render/GuiRenderer;render(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V",
         shift = Shift.AFTER
      )
   )
   private void onRenderScreen(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         Minecraft var4 = Minecraft.getInstance();
         Vector2f var5 = new Vector2f(var4.getWindow().getGuiScaledWidth(), var4.getWindow().getGuiScaledHeight());
         PolinexAccessor.INSTANCE.eventBus.post(new DrawScreenEvent(var5));
      }
   }

   @WrapOperation(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;bobView(Lnet/minecraft/client/renderer/state/level/CameraRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;)V"
      )
   )
   private void cancelHurtCamera(GameRenderer var1, CameraRenderState var2, PoseStack var3, Operation<Void> var4) {
      me.octo.client.modules.impl.features.visuals.Camera var5 = me.octo.client.modules.impl.features.visuals.Camera.INSTANCE;
      if (!var5.isToggled() || !me.octo.client.modules.impl.features.visuals.Camera.getNoHurtCam().isToggled()) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }
}
