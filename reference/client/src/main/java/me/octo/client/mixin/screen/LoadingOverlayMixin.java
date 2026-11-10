package me.octo.client.mixin.screen;

import java.util.Optional;
import java.util.function.Consumer;
import me.octo.client.gui.clickgui.endgameGUI.ThemeColors;
import me.octo.client.gui.components.BackgroundRenderer;
import me.octo.client.utils.render.colors.Color;
import me.octo.client.utils.render.shapes.NVGRenderer;
import me.octo.client.utils.render.shapes.NVGSpecialRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.LoadingOverlay;
import net.minecraft.server.packs.resources.ReloadInstance;
import net.minecraft.util.Mth;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LoadingOverlay.class)
public class LoadingOverlayMixin {
   @Shadow
   @Final
   private Minecraft minecraft;
   @Shadow
   @Final
   private ReloadInstance reload;
   @Shadow
   @Final
   private boolean fadeIn;
   @Shadow
   @Final
   private Consumer<Optional<Throwable>> onFinish;
   @Shadow
   private long fadeOutStart;
   @Shadow
   private long fadeInStart;

   @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true)
   private void customRender(GuiGraphicsExtractor var1, int var2, int var3, float var4, CallbackInfo var5) {
      boolean var6 = System.getProperty("os.name").toLowerCase().contains("mac");
      float var7 = var6 ? this.minecraft.getWindow().getScreenWidth() : this.minecraft.getWindow().getWidth();
      float var8 = var6 ? this.minecraft.getWindow().getScreenHeight() : this.minecraft.getWindow().getHeight();
      if (this.fadeIn && this.fadeInStart == -1L) {
         this.fadeInStart = Util.getMillis();
      }

      float var9 = this.reload.getActualProgress();
      boolean var10 = NVGSpecialRenderer.Companion
         .draw$recovered$c8dcd613be217912(
            var1,
            0,
            0,
            var1.guiWidth(),
            var1.guiHeight(),
            () -> {
               BackgroundRenderer.INSTANCE.renderBackground(this.minecraft.getWindow().getWidth(), this.minecraft.getWindow().getHeight());
               float var4x = var8 * 0.15F;
               float var5x = var4x * 0.51F;
               float var6x = var4x * 0.34F;
               float var7x = NVGRenderer.textWidth("POLINEX", var5x, NVGRenderer.defaultFont);
               float var8x = var8 * 0.025F;
               float var9x = var4x + var8x + var7x;
               float var10x = (var7 - var9x) / 2.0F;
               float var12x = var8 * 0.3F;
               Color var13 = ThemeColors.textPlaceholder;
               NVGRenderer.INSTANCE
                  .renderSVGWithColor(
                     "\n        <svg width=\"100%\" height=\"100%\" viewBox=\"0 0 1000 1000\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xml:space=\"preserve\" xmlns:serif=\"http://www.serif.com/\" style=\"fill-rule:evenodd;clip-rule:evenodd;stroke-linecap:round;stroke-linejoin:round;stroke-miterlimit:1.5;\">\n    <g id=\"Circles\">\n        <g transform=\"matrix(1,0,0,1,-2.25144,-6.552205)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1,0,0,1,584.806935,456.451612)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.82218,0,0,0.82218,222.150739,559.882122)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,-29.287141,-357.025146)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(1.574519,0,0,1.574519,630.504469,94.034301)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n        <g transform=\"matrix(0.747066,0,0,0.747066,545.885729,-137.813619)\">\n            <circle cx=\"142.393\" cy=\"367.484\" r=\"18.984\" fill=\"currentColor\"/>\n        </g>\n    </g>\n    <g id=\"Top\">\n        <path id=\"Top-Big\" serif:id=\"Top Big\" d=\"M570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.4,246.88 573.46,246.999 574.413,246.88C575.367,246.761 569.493,256.246 570.165,259.847Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <path d=\"M402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        <g>\n            <path d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737ZM402.904,514.909C402.904,514.909 404.99,533.533 410.354,533.235C415.718,532.937 453.917,514.704 457.587,511.035C458.034,510.588 454.435,497.142 452.223,493.602C451.478,492.41 402.904,514.909 402.904,514.909ZM574.499,246.915C574.482,246.887 574.454,246.875 574.413,246.88C574.291,246.895 574.332,246.906 574.499,246.915ZM574.499,246.915C574.881,247.554 569.522,256.398 570.165,259.847C570.165,259.847 632.989,289.24 670.928,341.694C671.152,342.004 677.997,337.709 683.361,331.034C688.725,324.359 615.639,251.994 583.949,247.118C582.599,246.91 575.634,246.974 574.499,246.915Z\" fill=\"currentColor\"/>\n            <path id=\"Main-Top\" serif:id=\"Main Top\" d=\"M269.436,319.737C269.436,319.737 336.262,207.094 500,204.285C661.479,201.514 746.785,319.369 772.1,380.128C772.899,382.046 769.351,390.736 737.424,424.837C699.641,465.194 484.252,636.917 245.047,635.628C243.263,635.619 230.418,631.098 221.664,604.464C212.911,577.831 220.36,582.115 220.919,580.066C221.478,578.017 234.702,581.928 267.854,579.88C301.006,577.831 373.36,554.46 385.376,542.444C385.655,542.164 387.604,531.549 386.307,527.171C384.817,522.143 327.595,554.208 251.091,561.441C246.238,561.9 219.802,562.745 214.959,561.441C210.117,560.137 205.833,550.825 206.392,545.238C206.951,539.65 201.391,510.34 206.578,464.034C206.906,461.107 212.579,454.53 219.627,454.22C228.304,453.838 242.799,463.47 304.115,453.171C332.396,448.421 490.326,396.76 546.095,314.676C547.59,312.475 544.513,311.898 537.726,315.462C530.94,319.026 404.044,425.119 275.254,434.992C266.957,435.628 242.508,435.281 242.508,435.281C242.508,435.281 215.712,435.377 217.715,414.302C219.717,393.228 249.946,347.551 250.423,346.598C250.9,345.644 253.366,343.165 259.1,343.165C260.722,343.165 259.048,349.489 284.561,354.226C313.836,359.662 404.822,334.819 461.628,271.206C463.797,268.777 455.673,268.398 451.889,271.084C448.105,273.769 385.574,327.086 315.159,332.115C312.551,332.301 267.524,335.131 269.436,319.737Z\" style=\"fill:none;stroke:currentColor;stroke-width:1px;\"/>\n        </g>\n    </g>\n    <g id=\"Middle\">\n        <g transform=\"matrix(1,0,0,1,3.005268,5.110119)\">\n            <path d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" fill=\"currentColor\"/>\n            <path id=\"Small-ring\" serif:id=\"Small ring\" d=\"M549.076,603.525C549.076,603.525 669.009,552.288 789.524,438.74C789.955,438.334 823.354,459.839 732.777,515.494C715.297,526.235 514.82,670.053 302.808,701.742C301.054,702.004 289.532,704.908 268.145,681.145C267.072,679.953 351.25,680.668 429.777,651.107C508.305,621.546 482.919,631.876 549.076,603.525Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring-2\" serif:id=\"Big Ring 2\" d=\"M553.455,572.592C553.455,572.592 732.261,493.331 826.988,348.082C837.646,331.741 853.276,287.691 818.463,262.114C783.649,236.537 727.468,243.25 699.849,241.03C693.075,240.486 667.954,219.845 720.103,219.612C767.363,219.401 793.671,219.612 816.951,230.321C840.232,241.03 865.25,270.6 864.212,303.19C863.048,339.741 843.593,376.654 788.782,434.728C730.864,496.093 498.732,668.516 265.096,678.839C244.501,679.749 84.167,674.121 126.866,546.519C130.7,535.062 134.183,524 152.249,500.084C170.315,476.168 179.069,495.351 171.06,506.34C163.051,517.328 146.848,553.646 145.358,564.076C143.868,574.506 120.587,655.896 269.585,655.524C291.025,655.47 438.525,637.816 553.455,572.592Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n        <g>\n            <path d=\"M172.542,421.374C189.382,421.294 181.679,441.787 171.344,450.192C138.241,477.11 76.765,549.863 66.943,571.567C-5.297,731.205 180.628,722.774 222.271,725.803C320.193,732.925 491.002,665.502 553.022,639.614C615.043,613.726 677.435,571.634 680.602,569.771C703.937,556.045 757.708,518.553 783.969,496.576C810.23,474.599 803.152,481.922 862.565,422.162C921.978,362.402 943.252,310.441 945.259,304.826C957.022,271.91 950.846,224.368 909.499,204.237C859.765,180.022 786.768,184.347 776.767,185.597C702.088,194.927 682.126,206.352 654.586,209.414C629.161,212.24 630.888,196.559 638.239,193.518C643.617,191.294 736.069,159.826 826.865,161.455C917.66,163.085 943.885,202.067 948.589,206.981C1013.775,275.078 939.21,368.958 934.659,374.875C714.472,661.176 321.981,741.78 309.317,742.807C282.398,744.989 197.718,767.918 98.179,730.799C-10.224,690.374 32.353,597.46 37.672,582.686C62.075,514.907 172.542,421.374 172.542,421.374Z\" fill=\"currentColor\"/>\n            <path id=\"Big-Ring\" serif:id=\"Big Ring\" d=\"M172.542,421.374C172.542,421.374 62.075,514.907 37.672,582.686C32.353,597.46 -10.224,690.374 98.179,730.799C197.718,767.918 282.398,744.989 309.317,742.807C321.981,741.78 714.472,661.176 934.659,374.875C939.21,368.958 1013.775,275.078 948.589,206.981C943.885,202.067 917.66,163.085 826.865,161.455C736.069,159.826 643.617,191.294 638.239,193.518C630.888,196.559 629.161,212.24 654.586,209.414C682.126,206.352 702.088,194.927 776.767,185.597C786.768,184.347 859.765,180.022 909.499,204.237C950.846,224.368 957.022,271.91 945.259,304.826C943.252,310.441 921.978,362.402 862.565,422.162C803.152,481.922 810.23,474.599 783.969,496.576C757.708,518.553 703.937,556.045 680.602,569.771C677.435,571.634 615.043,613.726 553.022,639.614C491.002,665.502 320.193,732.925 222.271,725.803C180.628,722.774 -5.297,731.205 66.943,571.567C76.765,549.863 138.241,477.11 171.344,450.192C181.679,441.787 189.382,421.294 172.542,421.374Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n    <g id=\"Bottom\">\n        <path id=\"Bottom-Hole\" serif:id=\"Bottom Hole\" d=\"M634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        <g>\n            <path d=\"M358.606,759.376C349.201,750.386 362.573,743.726 366.556,742.903C592.089,696.342 783.21,541.627 785.976,540.651C792.16,538.468 795.705,546.094 795.891,553.019C796.348,570.115 766.909,636.005 764.566,639.698C592.169,911.542 358.606,759.376 358.606,759.376ZM634.286,696.705C634.286,696.705 645.199,708.71 653.202,709.437C661.205,710.165 668.844,693.795 670.662,691.976C672.481,690.158 657.931,672.697 651.019,674.152C644.108,675.607 633.195,688.339 634.286,696.705Z\" fill=\"currentColor\"/>\n            <path id=\"Bototm\" d=\"M358.606,759.376C358.606,759.376 592.169,911.542 764.566,639.698C766.909,636.005 796.348,570.115 795.891,553.019C795.705,546.094 792.16,538.468 785.976,540.651C783.21,541.627 592.089,696.342 366.556,742.903C362.573,743.726 349.201,750.386 358.606,759.376Z\" style=\"fill:none;stroke:currentColor;stroke-width:1.04px;\"/>\n        </g>\n    </g>\n</svg>\n    ",
                     var10x,
                     var12x,
                     var4x,
                     var4x,
                     var13,
                     0.0F,
                     1.0F
                  );
               float var14 = var10x + var4x + var8x;
               float var15 = var12x + var4x * 0.05F + 6.5F;
               NVGRenderer.text("POLINEX", var14, var15, var5x, ThemeColors.textPlaceholder, NVGRenderer.defaultFont);
               NVGRenderer.text("Client", var14, var15 + var5x * 0.9F, var6x, Color.Companion.fromHex(13421772), NVGRenderer.defaultFont);
               float var16 = var7 * 0.4F;
               float var17 = var8 * 0.006F;
               float var18 = (var7 - var16) / 2.0F;
               float var19 = var12x + var4x + var8 * 0.08F;
               NVGRenderer.rect(var18, var19, var16, var17, Color.BLACK, var17 / 2.0F);
               NVGRenderer.hollowRect(var18, var19, var16, var17, 1.0F, ThemeColors.INSTANCE.getAccentPrimary(), var17 / 2.0F);
               float var20 = Mth.clamp(var9, 0.0F, 1.0F);
               if (var20 > 0.0F) {
                  float var21 = var16 * var20;
                  NVGRenderer.rect(var18, var19 - var17 * 0.5F, var21, var17 * 2.0F, ThemeColors.INSTANCE.getAccentPrimary(), var17);
                  NVGRenderer.rect(var18, var19, var21, var17, ThemeColors.INSTANCE.getAccentPrimary(), var17 / 2.0F);
               }

               String var31 = var9 < 0.3F ? "Initializing..." : (var9 < 0.6F ? "Loading resources..." : (var9 < 0.9F ? "Finalizing..." : "Complete!"));
               float var22 = var8 * 0.02F;
               float var23 = NVGRenderer.textWidth(var31, var22, NVGRenderer.defaultFont);
               float var24 = (var7 - var23) / 2.0F;
               float var25 = var19 + var17 + var8 * 0.025F;
               NVGRenderer.text(var31, var24, var25, var22, ThemeColors.textPlaceholder, NVGRenderer.defaultFont);
               String var26 = (int)(var20 * 100.0F) + "%";
               float var27 = var8 * 0.018F;
               float var28 = NVGRenderer.textWidth(var26, var27, NVGRenderer.defaultFont);
               float var29 = (var7 - var28) / 2.0F;
               float var30 = var25 + var22 + var8 * 0.015F;
               NVGRenderer.text(var26, var29, var30, var27, ThemeColors.INSTANCE.getAccentCyan(), NVGRenderer.defaultFont);
               return null;
            }
         );
      if (var10) {
         var5.cancel();
         if (this.reload.isDone()) {
            if (this.fadeOutStart == -1L) {
               try {
                  this.reload.checkExceptions();
                  this.onFinish.accept(Optional.empty());
               } catch (Throwable var12) {
                  this.onFinish.accept(Optional.of(var12));
               }

               this.fadeOutStart = Util.getMillis();
               if (this.minecraft.screen != null) {
                  this.minecraft.screen.init(var1.guiWidth(), var1.guiHeight());
               }
            }

            this.minecraft.setOverlay(null);
         }
      }
   }
}
