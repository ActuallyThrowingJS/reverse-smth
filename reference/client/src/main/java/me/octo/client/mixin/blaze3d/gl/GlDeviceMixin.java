package me.octo.client.mixin.blaze3d.gl;

import com.mojang.blaze3d.shaders.ShaderSource;
import me.octo.client.render.ClientShaders;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "com.mojang.blaze3d.opengl.GlDevice")
public abstract class GlDeviceMixin {
   @Shadow
   @Final
   @Mutable
   private ShaderSource defaultShaderSource;

   @Inject(method = "<init>", at = @At("TAIL"), require = 0)
   private void polinex$fallbackToClientShaders(CallbackInfo var1) {
      ShaderSource var2 = this.defaultShaderSource;
      this.defaultShaderSource = (var1x, var2x) -> {
         String var3 = var2.get(var1x, var2x);
         return var3 != null ? var3 : ClientShaders.Companion.get(var1x, var2x);
      };
   }
}
