package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.framegraph.FrameGraphBuilder;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.resource.GraphicsResourceAllocator;
import com.mojang.blaze3d.vertex.PoseStack;
import me.octo.client.PolinexAccessor;
import me.octo.client.events.impl.render.DrawOutlinesEvent;
import me.octo.client.modules.impl.features.visuals.NoRender;
import me.octo.client.render.JumpFloodOutline;
import me.octo.client.render.OutlineFlag;
import me.octo.client.render.engine.OutlineShaderRenderer;
import me.octo.client.utils.collection.Pools;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LevelTargetBundle;
import net.minecraft.client.renderer.PostChain;
import net.minecraft.client.renderer.chunk.ChunkSectionsToRender;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.state.level.LevelRenderState;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4fc;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public abstract class LevelRendererMixin {
   @Shadow
   @Final
   private Minecraft minecraft;

   @Shadow
   @Nullable
   public abstract RenderTarget entityOutlineTarget();

   @Shadow
   protected abstract boolean shouldShowEntityOutlines();

   @Inject(method = "renderLevel", require = 0, at = @At(value = "NEW", target = "()Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;"))
   private void onRender(
      GraphicsResourceAllocator var1,
      DeltaTracker var2,
      boolean var3,
      CameraRenderState var4,
      Matrix4fc var5,
      GpuBufferSlice var6,
      Vector4f var7,
      boolean var8,
      ChunkSectionsToRender var9,
      CallbackInfo var10
   ) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         OutlineShaderRenderer var11 = OutlineShaderRenderer.INSTANCE;
         if (var11.shouldRender()) {
            PoseStack var12 = Pools.MatStack.borrow();
            var12.mulPose(var5);
            DrawOutlinesEvent var13 = new DrawOutlinesEvent(
               var11.prepareRenderTarget(), var12, var4, var2.getGameTimeDeltaPartialTick(false), DrawOutlinesEvent.OutlineType.INBUILT_OUTLINE
            );
            PolinexAccessor.INSTANCE.eventBus.post(var13);
            Pools.MatStack.recycle(var12);
            if (var13.getDirtyFlag()) {
               var11.setDirty(true);
            }
         }
      }
   }

   @Inject(
      method = "lambda$addMainPass$0",
      require = 0,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/OutlineBufferSource;endOutlineBatch()V")
   )
   private void onDrawOutlines(CallbackInfo var1) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         OutlineShaderRenderer.INSTANCE.drawBlitIfDirty(this.minecraft.getMainRenderTarget());
      }
   }

   @Inject(
      method = "lambda$addMainPass$0",
      require = 0,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/OutlineBufferSource;endOutlineBatch()V", shift = Shift.AFTER)
   )
   private void onRenderGlow(CallbackInfo var1) {
      if (!NoRender.INSTANCE.shouldHideClientRendering()) {
         RenderTarget var2 = this.entityOutlineTarget();
         if (var2 != null) {
            if (JumpFloodOutline.shouldHijackVanillaOutline()) {
               JumpFloodOutline.consumeVanillaSilhouette(var2);
            } else if (this.shouldShowEntityOutlines()) {
               PoseStack var3 = Pools.MatStack.borrow();
               var2.blitToScreen();
               CameraRenderState var4 = this.minecraft.gameRenderer.getGameRenderState().levelRenderState.cameraRenderState;
               DrawOutlinesEvent var5 = new DrawOutlinesEvent(
                  var2, var3, var4, this.minecraft.getDeltaTracker().getGameTimeDeltaPartialTick(false), DrawOutlinesEvent.OutlineType.MINECRAFT_GLOW
               );
               PolinexAccessor.INSTANCE.eventBus.post(var5);
               OutlineFlag.drawOutline = OutlineFlag.drawOutline | var5.getDirtyFlag();
               Pools.MatStack.recycle(var3);
            }
         }
      }
   }

   @Inject(method = "doEntityOutline", at = @At("HEAD"), cancellable = true, require = 0)
   private void polinex$cancelVanillaOutlineBlit(CallbackInfo var1) {
      if (JumpFloodOutline.consumeHijackedFrame()) {
         var1.cancel();
      }
   }

   @WrapOperation(
      method = "renderLevel",
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/PostChain;addToFrame(Lcom/mojang/blaze3d/framegraph/FrameGraphBuilder;IILnet/minecraft/client/renderer/LevelTargetBundle;)V"
      )
   )
   private void polinex$skipOutlinePostChain(PostChain var1, FrameGraphBuilder var2, int var3, int var4, LevelTargetBundle var5, Operation<Void> var6) {
      if (!JumpFloodOutline.shouldHijackVanillaOutline()) {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      }
   }

   @WrapOperation(
      method = "renderLevel",
      require = 0,
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/state/level/LevelRenderState;haveGlowingEntities:Z", opcode = 180)
   )
   private boolean modifyDrawOutline(LevelRenderState var1, Operation<Boolean> var2) {
      boolean var3 = OutlineFlag.drawOutline;
      if (var3) {
         OutlineFlag.drawOutline = false;
         return true;
      } else {
         return (Boolean)var2.call(new Object[]{var1});
      }
   }
}
