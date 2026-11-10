package me.octo.client.mixin.command;

import com.mojang.brigadier.AmbiguityConsumer;
import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Pseudo
@Mixin(targets = "net.fabricmc.fabric.impl.command.client.ClientCommandInternals", remap = false)
public class ClientCommandInternalsMixin {
   @Redirect(
      method = "finalizeInit",
      at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/CommandDispatcher;findAmbiguities(Lcom/mojang/brigadier/AmbiguityConsumer;)V")
   )
   private static void polinex$suppressAmbiguityWarnings(CommandDispatcher<FabricClientCommandSource> var0, AmbiguityConsumer<FabricClientCommandSource> var1) {
   }
}
