package me.octo.client.events.impl.entity;

import me.octo.client.events.Event;
import me.octo.client.events.impl.base.annotations.Cancelable;
import net.minecraft.client.CameraType;

@Cancelable
public class CameraTypeChangeEvent extends Event {
   public CameraType cameraType;

   public CameraTypeChangeEvent(CameraType var1) {
      this.cameraType = var1;
   }
}
