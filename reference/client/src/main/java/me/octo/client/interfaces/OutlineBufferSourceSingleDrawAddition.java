package me.octo.client.interfaces;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.jetbrains.annotations.Nullable;

public interface OutlineBufferSourceSingleDrawAddition {
   @Nullable
   VertexConsumer polinex_getSingleDrawBuffers(RenderType var1);
}
