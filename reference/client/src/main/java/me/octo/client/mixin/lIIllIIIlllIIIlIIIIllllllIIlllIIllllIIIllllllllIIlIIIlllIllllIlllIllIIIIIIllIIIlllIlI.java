package me.octo.client.mixin;

import java.util.List;
import java.util.Set;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class lIIllIIIlllIIIlIIIIllllllIIlllIIllllIIIllllllllIIlIIIlllIllllIlllIllIIIIIIllIIIlllIlI implements IMixinConfigPlugin {
   private static Set<String> DEFER_TO_PIZZA = Set.of("me.octo.client.mixin.render.GlCommandEncoderMixin", "me.octo.client.mixin.render.GlBackendMixin");
   private static String FIRMAMENT_MIXIN;
   private static String FIRMAMENT_TARGET_CLASS;
   private boolean pizzaLoaded;
   private boolean firmamentPresent;

   public void onLoad(String var1) {
      this.pizzaLoaded = FabricLoader.getInstance().isModLoaded("pizza-client")
         || FabricLoader.getInstance().isModLoaded("pizza-loader")
         || this.isClassPresent("net.pizza.client.mixin.render.GameRendererMixin")
         || this.isClassPresent("net.pizza.client.utils.skyblock.ScoreBoardUtils");
      this.firmamentPresent = FabricLoader.getInstance().isModLoaded("firmament") || this.isClassPresent("moe.nea.firmament.features.misc.ModAnnouncer");
   }

   public String getRefMapperConfig() {
      return null;
   }

   public boolean shouldApplyMixin(String var1, String var2) {
      if ("me.octo.client.mixin.compat.FirmamentModAnnouncerMixin".equals(var2) && !this.firmamentPresent) {
         return false;
      } else {
         return !this.pizzaLoaded ? true : !DEFER_TO_PIZZA.contains(var2);
      }
   }

   public void acceptTargets(Set<String> var1, Set<String> var2) {
   }

   public List<String> getMixins() {
      return null;
   }

   public void preApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   public void postApply(String var1, ClassNode var2, String var3, IMixinInfo var4) {
   }

   private boolean isClassPresent(String var1) {
      try {
         ClassLoader var2 = Thread.currentThread().getContextClassLoader();
         Class.forName(var1, false, var2);
         return true;
      } catch (Throwable var3) {
         return false;
      }
   }
}
