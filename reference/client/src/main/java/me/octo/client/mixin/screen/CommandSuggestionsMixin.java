package me.octo.client.mixin.screen;

import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.concurrent.CompletableFuture;
import me.octo.client.commands.CommandManager;
import net.minecraft.client.gui.components.CommandSuggestions;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.CommandSuggestions.SuggestionsList;
import net.minecraft.commands.SharedSuggestionProvider;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommandSuggestions.class)
public abstract class CommandSuggestionsMixin {
   @Shadow
   @Final
   EditBox input;
   @Shadow
   @Nullable
   private ParseResults<SharedSuggestionProvider> currentParse;
   @Shadow
   @Nullable
   private CompletableFuture<Suggestions> pendingSuggestions;
   @Shadow
   @Nullable
   private SuggestionsList/* @Nullable */ suggestions;

   @Shadow
   public abstract void showSuggestions(boolean var1);

   @Inject(
      method = "updateCommandInfo",
      at = @At(value = "INVOKE", target = "Lcom/mojang/brigadier/StringReader;canRead()Z", remap = false),
      cancellable = true
   )
   private void hijackDotCommandCompletion(CallbackInfo var1) {
      String var2 = this.input.getValue();
      boolean var3 = var2.startsWith(String.valueOf('.'));
      boolean var4 = var2.startsWith("/") && CommandManager.isCustomCommand(var2);
      if (var3 || var4) {
         this.pendingSuggestions = CommandManager.completeSuggestions(var2, this.input.getCursorPosition());
         this.pendingSuggestions.thenRun(() -> {
            if (this.pendingSuggestions.isDone() && this.suggestions == null) {
               this.showSuggestions(false);
            }
         });
         this.currentParse = null;
         var1.cancel();
      }
   }
}
