package me.octo.client.mixin.client;

import me.octo.client.utils.client.NickSwapGuard;
import net.minecraft.client.gui.Font;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Font.class)
public class FontMixin {
   @Inject(method = "plainSubstrByWidth(Ljava/lang/String;I)Ljava/lang/String;", at = @At("HEAD"), require = 0)
   private void polinex$suppressNickSwapHead(String var1, int var2, CallbackInfoReturnable<String> var3) {
      NickSwapGuard.setSuppressed(true);
   }

   @Inject(method = "plainSubstrByWidth(Ljava/lang/String;I)Ljava/lang/String;", at = @At("RETURN"), require = 0)
   private void polinex$suppressNickSwapReturn(String var1, int var2, CallbackInfoReturnable<String> var3) {
      NickSwapGuard.setSuppressed(false);
   }

   @Inject(method = "plainSubstrByWidth(Ljava/lang/String;IZ)Ljava/lang/String;", at = @At("HEAD"), require = 0)
   private void polinex$suppressNickSwapBoolHead(String var1, int var2, boolean var3, CallbackInfoReturnable<String> var4) {
      NickSwapGuard.setSuppressed(true);
   }

   @Inject(method = "plainSubstrByWidth(Ljava/lang/String;IZ)Ljava/lang/String;", at = @At("RETURN"), require = 0)
   private void polinex$suppressNickSwapBoolReturn(String var1, int var2, boolean var3, CallbackInfoReturnable<String> var4) {
      NickSwapGuard.setSuppressed(false);
   }
}
