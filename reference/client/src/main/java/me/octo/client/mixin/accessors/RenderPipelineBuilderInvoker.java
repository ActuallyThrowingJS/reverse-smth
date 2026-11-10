package me.octo.client.mixin.accessors;

import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Builder.class)
public interface RenderPipelineBuilderInvoker {
   @Invoker("<init>")
   static Builder polinex$create() {
      throw new AssertionError();
   }

   @Invoker("withSnippet")
   void polinex$invokeWithSnippet(Snippet var1);
}
