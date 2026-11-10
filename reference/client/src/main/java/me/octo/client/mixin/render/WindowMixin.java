package me.octo.client.mixin.render;

import com.mojang.blaze3d.platform.MacosUtil;
import com.mojang.blaze3d.platform.NativeImage;
import com.mojang.blaze3d.platform.Window;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import me.octo.client.utils.PolinexLogger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Window.class)
public class WindowMixin {
   @Inject(method = "setIcon", at = @At("HEAD"), cancellable = true)
   public void onSetIcon(CallbackInfo var1) throws IOException {
      int var2 = GLFW.glfwGetPlatform();
      if (var2 == 393217 || var2 == 393220 || var2 == 393219) {
         ByteBuffer var3 = null;
         ByteBuffer var4 = null;

         try (InputStream var5 = WindowMixin.class.getResourceAsStream("/assets/polinex/logo16.png")) {
            NativeImage var6 = NativeImage.read(var5);

            try (InputStream var7 = WindowMixin.class.getResourceAsStream("/assets/polinex/logo32.png")) {
               NativeImage var8 = NativeImage.read(var7);

               try {
                  MemoryStack var9 = MemoryStack.stackPush();

                  try {
                     var3 = MemoryUtil.memAlloc(var6.getWidth() * var6.getHeight() * 4);
                     var3.asIntBuffer().put(var6.getPixelsABGR());
                     var4 = MemoryUtil.memAlloc(var8.getWidth() * var8.getHeight() * 4);
                     var4.asIntBuffer().put(var8.getPixelsABGR());
                     Buffer var10 = GLFWImage.malloc(2, var9);
                     var10.position(0);
                     var10.width(var6.getWidth());
                     var10.height(var6.getHeight());
                     var10.pixels(var3);
                     var10.position(1);
                     var10.width(var8.getWidth());
                     var10.height(var8.getHeight());
                     var10.pixels(var4);
                     var10.position(0);
                     long var11 = ((Window)this).handle();
                     GLFW.glfwSetWindowIcon(var11, var10);
                  } catch (Throwable var30) {
                     if (var9 != null) {
                        try {
                           var9.close();
                        } catch (Throwable var29) {
                           var30.addSuppressed(var29);
                        }
                     }

                     throw var30;
                  }

                  if (var9 != null) {
                     var9.close();
                  }
               } catch (Throwable var31) {
                  if (var8 != null) {
                     try {
                        var8.close();
                     } catch (Throwable var28) {
                        var31.addSuppressed(var28);
                     }
                  }

                  throw var31;
               }

               if (var8 != null) {
                  var8.close();
               }
            } catch (Throwable var33) {
               if (var6 != null) {
                  try {
                     var6.close();
                  } catch (Throwable var26) {
                     var33.addSuppressed(var26);
                  }
               }

               throw var33;
            }

            if (var6 != null) {
               var6.close();
            }
         } finally {
            if (var3 != null) {
               MemoryUtil.memFree(var3);
            }

            if (var4 != null) {
               MemoryUtil.memFree(var4);
            }
         }

         var1.cancel();
      } else if (var2 == 393218) {
         MacosUtil.loadIcon(() -> WindowMixin.class.getResourceAsStream("/assets/polinex/logo.png"));
         var1.cancel();
      } else {
         PolinexLogger.error("Not setting icon for unrecognized platform: " + var2);
      }
   }

   @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lorg/lwjgl/glfw/GLFW;glfwWindowHint(II)V", ordinal = 5, remap = false), require = 0)
   private void changeOpenGlForwardCompat(int var1, int var2) {
   }
}
