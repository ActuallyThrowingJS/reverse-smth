package me.octo.client.mixin.network;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;
import me.octo.client.modules.impl.features.qol.ExploitPreventerModule;
import me.octo.client.utils.security.ExploitPreventerSupport;
import net.minecraft.util.HttpUtil;
import net.minecraft.util.HttpUtil.DownloadProgressListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HttpUtil.class)
public class HttpUtilMixin {
   @Inject(method = "downloadFile", at = @At("HEAD"), cancellable = true)
   private static void polinex$guardResourcePackDownload(
      Path var0,
      URL var1,
      Map<String, String> var2,
      HashFunction var3,
      HashCode var4,
      int var5,
      Proxy var6,
      DownloadProgressListener var7,
      CallbackInfoReturnable<Path> var8
   ) {
      if (ExploitPreventerModule.shouldGuardResourcePackDownloads()) {
         if (ExploitPreventerSupport.isServerResourcePackDownload()) {
            var8.setReturnValue(ExploitPreventerSupport.downloadResourcePackSafely(var0, var1, var2, var3, var4, var5, var6, var7));
         }
      }
   }
}
