package me.octo.client.mixin.network;

import com.mojang.authlib.minecraft.client.MinecraftClient;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.net.URL;
import java.util.UUID;
import me.octo.client.utils.client.Authentication;
import me.octo.client.utils.network.SessionAuth;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = YggdrasilMinecraftSessionService.class, remap = false)
public class YggdrasilMinecraftSessionServiceMixin {
   @Redirect(
      method = "joinServer",
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/authlib/minecraft/client/MinecraftClient;post(Ljava/net/URL;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;"
      ),
      remap = false
   )
   private Object polinex$verifyJoinServerResponse(MinecraftClient var1, URL var2, Object var3, Class<?> var4, UUID var5, String var6, String var7) throws Exception {
      Object var8 = var1.post(var2, var3, var4);
      Authentication.onJoinServerMojangResponse(var5, var7, var4, var8);
      SessionAuth.onMojangJoin(var5, var7);
      return var8;
   }
}
