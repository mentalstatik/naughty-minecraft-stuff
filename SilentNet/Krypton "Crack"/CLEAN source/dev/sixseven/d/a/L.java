package dev.sixseven.d.a;

import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5819;

public class L extends dev.sixseven.d.c {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   public static final int d = 3;
   public final dev.sixseven.i.f e = this.a(new dev.sixseven.i.f("Style", "Burst style", "Sparks", "Sparks", "Hearts", "Lightning", "67"));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Amount", "Particles spawned per hit", 14.0, 4.0, 40.0, 1.0));
   public final dev.sixseven.i.h g = this.a(new dev.sixseven.i.h("Size", "Particle scale", 1.0, 0.3, 3.0, 0.1, "x"));
   public final dev.sixseven.i.h h = this.a(new dev.sixseven.i.h("Lifetime", "How long the burst lingers", 0.7, 0.3, 2.0, 0.1, "s"));
   public final dev.sixseven.i.h i = this.a(new dev.sixseven.i.h("Spread", "How far particles fly out", 1.0, 0.3, 2.5, 0.1, "x"));
   public final dev.sixseven.i.c j = this.a(new dev.sixseven.i.c("Color", "Particle tint", -49508));
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Rainbow", "Cycle each burst through the rainbow", false));
   public final dev.sixseven.i.h l = this.a(new dev.sixseven.i.h("Glow", "Soft outer halo intensity", 65.0, 0.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("Shockwave", "Expanding ring on each hit", true));
   private final Deque<L.a> n = new ArrayDeque<>();
   private final Deque<L.b> o = new ArrayDeque<>();
   private static final int p = 600;
   private static final int q = 24;

   public L() {
      super("HitParticles", "Themed particle bursts when you hit an entity", dev.sixseven.d.b.e);
   }

   public Deque<L.a> k() {
      return this.n;
   }

   public Deque<L.b> l() {
      return this.o;
   }

   @Override
   protected void i() {
      this.m();
   }

   public void m() {
      this.n.clear();
      this.o.clear();
   }

   private int o() {
      if (this.k.i()) {
         float var1 = (float)(System.currentTimeMillis() % 3500L) / 3500.0F * 360.0F;
         return dev.sixseven.n.c.a(var1, 0.85F, 1.0F) & 16777215;
      } else {
         return this.j.i() & 16777215;
      }
   }

   public void a(class_1297 target) {
      if (this.f() && target != null) {
         double var2 = target.method_23317();
         double var4 = target.method_23318() + (double)target.method_17682() * 0.6;
         double var6 = target.method_23321();
         this.a(var2, var4, var6);
      }
   }

   public void a(double cx, double cy, double cz) {
      class_310 var7 = class_310.method_1551();
      if (var7.field_1687 != null) {
         class_5819 var8 = var7.field_1687.field_9229;
         int var9 = this.p();
         int var10 = this.o();
         int var11 = this.f.e();
         float var12 = this.h.d();
         float var13 = this.i.d();
         float var14 = this.g.d();
         long var15 = System.nanoTime();

         for (int var17 = 0; var17 < var11; var17++) {
            this.a(var8, var9, var10, cx, cy, cz, var12, var13, var14, var15);
         }

         if (this.m.i()) {
            this.o.addLast(new L.b(cx, cy, cz, var10, var9, var15));

            while (this.o.size() > 24) {
               this.o.removeFirst();
            }
         }

         while (this.n.size() > 600) {
            this.n.removeFirst();
         }
      }
   }

   private void a(class_5819 random, int styleId, int rgb, double cx, double cy, double cz, float life, float spreadScale, float sizeScale, long now) {
      double var15 = random.method_43058() * Math.PI * 2.0;
      double var17 = 2.0 * random.method_43058() - 1.0;
      double var19 = Math.sqrt(Math.max(0.0, 1.0 - var17 * var17));
      float var21 = (float)(var19 * Math.cos(var15));
      float var22 = (float)var17;
      float var23 = (float)(var19 * Math.sin(var15));
      float var24 = life * (0.75F + random.method_43057() * 0.25F);
      float var25 = sizeScale * (0.7F + random.method_43057() * 0.6F);
      float var26;
      float var27;
      switch (styleId) {
         case 1:
            var21 *= 0.5F;
            var23 *= 0.5F;
            var22 = 0.4F + Math.abs(var22) * 0.5F;
            var26 = (1.6F + random.method_43057() * 1.0F) * spreadScale;
            var27 = 1.2F;
            var24 = life * (1.0F + random.method_43057() * 0.3F);
            break;
         case 2:
            var22 *= 0.25F;
            float var28 = class_3532.method_15355(Math.max(1.0E-4F, var21 * var21 + var23 * var23));
            var21 /= var28;
            var23 /= var28;
            var26 = (5.0F + random.method_43057() * 3.0F) * spreadScale;
            var27 = 0.6F;
            var24 = life * (0.45F + random.method_43057() * 0.25F);
            break;
         case 3:
            var22 = 0.12F + var22 * 0.35F;
            var26 = (1.9F + random.method_43057() * 1.4F) * spreadScale;
            var27 = 1.3F;
            var24 = life * (1.0F + random.method_43057() * 0.25F);
            break;
         default:
            var22 = var22 * 0.7F + 0.3F;
            var26 = (4.0F + random.method_43057() * 3.5F) * spreadScale;
            var27 = 6.5F;
      }

      float var34 = var21 * var26;
      float var29 = var22 * var26;
      float var30 = var23 * var26;
      float var31 = random.method_43057() * (float) (Math.PI * 2);
      float var32 = (random.method_43057() - 0.5F) * 8.0F;
      this.n.addLast(new L.a(cx, cy, cz, var34, var29, var30, rgb, styleId, var25, var31, var32, var27, var24, now));
   }

   private int p() {
      if (this.e.a("Hearts")) {
         return 1;
      } else if (this.e.a("Lightning")) {
         return 2;
      } else {
         return this.e.a("67") ? 3 : 0;
      }
   }

   public float n() {
      return this.l.d() / 100.0F;
   }

   public static final class a {
      public final double a;
      public final double b;
      public final double c;
      public final float d;
      public final float e;
      public final float f;
      public final int g;
      public final int h;
      public final float i;
      public final float j;
      public final float k;
      public final float l;
      public final float m;
      public final long n;

      a(
         double ox,
         double oy,
         double oz,
         float vx,
         float vy,
         float vz,
         int rgb,
         int styleId,
         float size,
         float rot,
         float rotSpeed,
         float gravity,
         float lifetime,
         long spawnNanos
      ) {
         this.a = ox;
         this.b = oy;
         this.c = oz;
         this.d = vx;
         this.e = vy;
         this.f = vz;
         this.g = rgb;
         this.h = styleId;
         this.i = size;
         this.j = rot;
         this.k = rotSpeed;
         this.l = gravity;
         this.m = lifetime;
         this.n = spawnNanos;
      }

      public float a(long nowNanos) {
         return (float)(nowNanos - this.n) / 1.0E9F;
      }

      public double a(float age) {
         return this.a + (double)(this.d * age);
      }

      public double b(float age) {
         return this.b + (double)(this.e * age) - 0.5 * (double)this.l * (double)age * (double)age;
      }

      public double c(float age) {
         return this.c + (double)(this.f * age);
      }
   }

   public static final class b {
      public final double a;
      public final double b;
      public final double c;
      public final int d;
      public final int e;
      public final long f;

      b(double x, double y, double z, int rgb, int styleId, long spawnNanos) {
         this.a = x;
         this.b = y;
         this.c = z;
         this.d = rgb;
         this.e = styleId;
         this.f = spawnNanos;
      }

      public float a(long nowNanos) {
         return (float)(nowNanos - this.f) / 1.0E9F;
      }
   }
}
