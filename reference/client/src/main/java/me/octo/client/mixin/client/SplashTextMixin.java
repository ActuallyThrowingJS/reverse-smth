package me.octo.client.mixin.client;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.octo.client.commands.CommandManager;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.resources.SplashManager;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({SplashManager.class, ChatComponent.class})
public class SplashTextMixin {
   @Inject(method = "getSplash", at = @At("HEAD"), cancellable = true, require = 0)
   private void get(CallbackInfoReturnable<SplashRenderer> var1) {
      String[] var2 = new String[]{
         lIlIllIIlIIllIlIlllIIlIllIIllIll("À:¡µ+-ì«¬kµË·\u009a@±ó»ß<\u0015/Eù", -6939580341848949080L),
         lIlIllIIlIIllIlIlllIIlIllIIllIll("R\u0003~-ãd¢d \u0098rzR*QÛ", -3908349177570052366L),
         lIlIllIIlIIllIlIlllIIlIllIIllIll("Z&õç\u0002\u001c\u0011Ì\u0097\u008aÚ\bZâ\u00adþ4sÛ\u0005Ùüe'", -2556716627841182128L),
         lIlIllIIlIIllIlIlllIIlIllIIllIll("r\u0089Ö\u009eóN/K£6úaEb0{", 6242615853139102489L),
         lIlIllIIlIIllIlIlllIIlIllIIllIll("eøò79×_\u000eN¾sÓ\u0003è\u0092À", 6045987883607295401L)
      };
      var1.setReturnValue(new SplashRenderer(Component.literal(var2[new Random().nextInt(var2.length)])));
   }

   @Inject(
      method = {"addClientSystemMessage(Lnet/minecraft/network/chat/Component;)V", "addServerSystemMessage(Lnet/minecraft/network/chat/Component;)V"},
      at = @At("HEAD"),
      cancellable = true,
      remap = false,
      require = 0
   )
   private void polinex$logAuthFailureOnly(Component var1, CallbackInfo var2) {
      if (CommandManager.logOnlyFromChat(var1)) {
         var2.cancel();
      }
   }

   @Unique
   private static String lIlIllIIlIIllIlIlllIIlIllIIllIll(String var0, long var1) throws Exception {
      byte[] var3 = new byte[8];

      for (int var4 = 0; var4 < 8; var4++) {
         var3[var4] = (byte)(var1 >>> 56 - var4 * 8);
      }

      Cipher var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      var5.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(var3)), new IvParameterSpec(new byte[8]));
      return new String(var5.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8).intern();
   }
}
