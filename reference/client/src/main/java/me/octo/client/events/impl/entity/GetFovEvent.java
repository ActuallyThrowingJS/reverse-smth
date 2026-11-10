package me.octo.client.events.impl.entity;

import me.octo.client.events.Event;

public final class GetFovEvent extends Event {
   private float fov;

   public GetFovEvent(float fovArg) {
      this.fov = fovArg;
   }

   public final float getFov() {
      return this.fov;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(float var1) {
      this.fov = var1;
   }

   public GetFovEvent() {
      this(0.0F, 1, null);
   }
}
