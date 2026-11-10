package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.vertex.MeshData;
import java.util.HashMap;
import java.util.Map;
import me.octo.client.utils.client.GenericPools;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderType.class)
public abstract class RenderTypeMixin {
   @Inject(method = "draw", require = 0, at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderPass;close()V"))
   private void recycleHashMap(MeshData var1, CallbackInfo var2, @Local(ordinal = 0) Map var3) {
      if (var3 instanceof HashMap var4) {
         GenericPools.HASH_MAP.recycle(var4);
      }
   }
}
