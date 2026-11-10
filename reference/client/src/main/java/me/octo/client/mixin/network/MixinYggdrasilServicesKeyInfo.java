package me.octo.client.mixin.network;

import com.mojang.authlib.properties.Property;
import com.mojang.authlib.yggdrasil.YggdrasilServicesKeyInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = YggdrasilServicesKeyInfo.class, remap = false)
public abstract class MixinYggdrasilServicesKeyInfo {
   @Inject(method = "validateProperty(Lcom/mojang/authlib/properties/Property;)Z", at = @At("HEAD"), cancellable = true, remap = false)
   private void polinex$skipEmptyTextureSignatures(Property var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 != null) {
         String var3 = var1.signature();
         if (var3 == null || var3.isEmpty()) {
            var2.setReturnValue(true);
         }
      }
   }
}
