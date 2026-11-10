package me.octo.client.mixin.accessors;

import net.minecraft.client.renderer.culling.Frustum;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Frustum.class)
public interface FrustumInvoker {
   @Invoker
   int invokeCubeInFrustum(double var1, double var3, double var5, double var7, double var9, double var11);
}
