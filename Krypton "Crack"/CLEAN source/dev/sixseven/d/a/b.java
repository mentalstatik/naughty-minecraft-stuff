package dev.sixseven.d.a;

public class b extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Range", "Assist any target within this distance", 4.0, 1.0, 8.0, 0.5, "m"));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Speed", "How fast the aim is pulled (higher = snappier)", 4.0, 1.0, 10.0, 1.0));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Smoothness", "How eased / human the pull is (higher = smoother)", 6.0, 1.0, 10.0, 1.0));
   public final dev.sixseven.i.f d = this.a(new dev.sixseven.i.f("Target", "Which part of the target to aim at", "Body", "Head", "Body", "Feet", "Nearest"));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("FOV", "Only assist within this facing cone (180 = all around)", 180.0, 10.0, 180.0, 5.0, "°"));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Vertical", "Also correct pitch (up/down), not just yaw", true));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Players", "Target other players", true));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Hostiles", "Target hostile mobs", false));
   public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("Passive", "Target passive mobs", false));
   public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("Invisibles", "Also target invisible entities", false));
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Wall Check", "Only assist targets you can actually see", false));
   public final dev.sixseven.i.b l = this.a(
      new dev.sixseven.i.b("Always Active", "Assist all the time — off = only while attacking (holding left-click)", true)
   );
   public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("Sticky Target", "Keep one target until it leaves range", true));
   private final dev.sixseven.d.a n = null;

   public b() {
      super("AimAssist", "Legit aim assist — smoothly pulls toward targets in range", dev.sixseven.d.b.a);
   }

   @Override
   public void j() {
   }

   @Override
   protected void i() {
      if (this.n != null) {
         this.n.a();
      }
   }

   public double[] a(double dt, double userDX, double userDY) {
      return this.n == null ? null : this.n.a(this, dt, userDX, userDY);
   }
}
