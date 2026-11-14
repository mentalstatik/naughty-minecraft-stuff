package dev.sixseven.d.a;

import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_2390;
import net.minecraft.class_5819;
import net.minecraft.class_746;

public class O extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Size", "Decal scale (1.0 = one block wide)", 1.0, 0.5, 3.0, 0.1, "x"));
   public final dev.sixseven.i.c b = this.a(new dev.sixseven.i.c("Color", "Decal color (alpha is animated)", -38476));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Lifetime", "How long a 67 stays visible", 1.5, 0.5, 4.0, 0.1, "s"));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Rainbow", "Cycle the color through the rainbow", false));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Shockwave", "Expanding ring on spawn", true));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Particles", "Drifting dust motes on jump", true));
   public final dev.sixseven.i.h g = this.a(new dev.sixseven.i.h("Max", "Max simultaneous decals (oldest drops first)", 10.0, 1.0, 30.0, 1.0));
   private final Deque<O.a> h = new ArrayDeque<>();
   private int i;

   public O() {
      super("67JumpCircles", "Stamps a glowing 67 on the ground when you jump", dev.sixseven.d.b.f);
   }

   public Deque<O.a> k() {
      return this.h;
   }

   @Override
   protected void i() {
      this.l();
   }

   public void l() {
      this.h.clear();
   }

   public int m() {
      return this.b.i() & 16777215;
   }

   public void a(class_746 player) {
      if (this.f()) {
         double var2 = player.method_23317();
         double var4 = player.method_23318();
         double var6 = player.method_23321();
         float var8 = 0.01F + (float)(this.i % 8) * 0.001F;
         this.i++;
         this.h.addLast(new O.a(var2, var4, var6, player.method_36454(), var8, System.nanoTime()));
         int var9 = Math.max(1, this.g.e());

         while (this.h.size() > var9) {
            this.h.removeFirst();
         }

         if (this.f.i()) {
            this.b(player);
         }
      }
   }

   private void b(class_746 player) {
      class_5819 var2 = player.method_59922();
      int var3 = this.m();

      for (int var4 = 0; var4 < 10; var4++) {
         double var5 = var2.method_43058() * Math.PI * 2.0;
         double var7 = 0.15 + var2.method_43058() * 0.45;
         player.method_73183()
            .method_8406(
               new class_2390(var3, 0.9F),
               player.method_23317() + Math.cos(var5) * var7,
               player.method_23318() + 0.05,
               player.method_23321() + Math.sin(var5) * var7,
               0.0,
               0.6 + var2.method_43058() * 0.4,
               0.0
            );
      }
   }

   public static final class a {
      public final double a;
      public final double b;
      public final double c;
      public final float d;
      public final float e;
      public final long f;

      a(double x, double y, double z, float yawDegrees, float yLift, long spawnNanos) {
         this.a = x;
         this.b = y;
         this.c = z;
         this.d = yawDegrees;
         this.e = yLift;
         this.f = spawnNanos;
      }

      public float a(long nowNanos) {
         return (float)(nowNanos - this.f) / 1.0E9F;
      }
   }
}
