package me.octo.client.events.impl.game;

import me.octo.client.events.Event;

public class MotionUpdateEvent extends Event {
   public double x;
   public double y;
   public double z;
   public float yaw;
   public float pitch;
   public boolean onGround;

   public MotionUpdateEvent(double var1, double var3, double var5, float var7, float var8, boolean var9) {
      this.x = var1;
      this.y = var3;
      this.z = var5;
      this.yaw = var7;
      this.pitch = var8;
      this.onGround = var9;
   }
}
