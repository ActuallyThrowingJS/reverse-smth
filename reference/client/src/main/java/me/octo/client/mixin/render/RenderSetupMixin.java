package me.octo.client.mixin.render;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import java.util.HashMap;
import me.octo.client.utils.client.GenericPools;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(RenderSetup.class)
public abstract class RenderSetupMixin {
   @WrapOperation(method = "getTextures", require = 0, at = @At(value = "NEW", target = "()Ljava/util/HashMap;"))
   private HashMap getCachedHashMap(Operation<HashMap> var1) {
      return GenericPools.HASH_MAP.borrow();
   }
}
