package me.octo.client.mixin.accessors;

import java.util.List;
import net.minecraft.client.gui.components.ChatComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(ChatComponent.class)
public interface ChatComponentAccessor {
   @Accessor("trimmedMessages")
   List<Object> getTrimmedMessages();

   @Accessor("chatScrollbarPos")
   int getChatScrollbarPos();

   @Invoker("getScale")
   double invokeGetScale();

   @Invoker("getLineHeight")
   int invokeGetLineHeight();

   @Invoker("getWidth")
   int invokeGetWidth();

   @Invoker("getHeight")
   int invokeGetHeight();
}
