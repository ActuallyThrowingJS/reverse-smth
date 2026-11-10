package me.octo.client.mixin.client;

import me.octo.client.modules.impl.features.visuals.NameChanger;
import me.octo.client.utils.client.NickSwapGuard;
import net.minecraft.util.StringDecomposer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(StringDecomposer.class)
public class StringDecomposerMixin {
   @Unique
   private static ThreadLocal<Boolean> polinex$isModifying = ThreadLocal.withInitial(() -> false);

   @ModifyVariable(
      method = {
            "iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z",
            "iterateFormatted(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z",
            "iterate(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z",
            "iterateBackwards(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z"
      },
      at = @At("HEAD"),
      argsOnly = true,
      require = 0
   )
   private static String polinex$modifyVisitedText(String var0) {
      if (!polinex$isModifying.get() && !NickSwapGuard.isSuppressed()) {
         polinex$isModifying.set(true);

         String var2;
         try {
            return NameChanger.modifyString(var0);
         } catch (Exception var6) {
            var2 = var0;
         } finally {
            polinex$isModifying.set(false);
         }

         return var2;
      } else {
         return var0;
      }
   }
}
