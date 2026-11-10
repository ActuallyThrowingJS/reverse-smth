package me.octo.client.mixin.accessors;

import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractContainerScreen.class)
public interface AbstractContainerScreenAccessor {
   @Accessor("leftPos")
   int getLeftPos();

   @Accessor("topPos")
   int getTopPos();

   @Accessor("imageWidth")
   int getImageWidth();

   @Accessor("imageHeight")
   int getImageHeight();

   @Mutable
   @Accessor("menu")
   void setMenu(AbstractContainerMenu var1);

   @Accessor("hoveredSlot")
   Slot getHoveredSlot();
}
