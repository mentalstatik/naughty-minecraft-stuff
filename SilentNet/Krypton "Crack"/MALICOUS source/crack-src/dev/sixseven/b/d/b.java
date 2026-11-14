package dev.sixseven.b.d;

public class b extends g {
   public static final float a = 22.0F;
   private static final float f = 14.0F;
   private final dev.sixseven.i.b g;
   private final dev.sixseven.g.a.a h = new dev.sixseven.g.a.a(150.0F, 0.0F);

   public b(dev.sixseven.m.d themes, dev.sixseven.i.b setting) {
      super(themes, setting);
      this.g = setting;
      this.h.b(setting.i() ? 1.0F : 0.0F);
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 22.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      float var5 = this.d + 11.0F;
      vg.a(this.g.g(), this.c, var5, 12.5F, var4.l());
      this.h.a(this.g.i() ? 1.0F : 0.0F);
      float var6 = this.h.b();
      float var7 = this.c + this.e - 14.0F;
      float var8 = var5 - 7.0F;
      int var9 = dev.sixseven.n.c.a(dev.sixseven.n.c.a(-16777216, 0.45F), var4.a(), var6);
      vg.a(var7, var8, 14.0F, 14.0F, 4.0F, var9);
      if (var6 > 0.02F) {
         vg.e();
         vg.b(var6);
         vg.b(var7, var8, 14.0F, 2.0F, -1);
         vg.f();
      }

      if (var6 < 0.98F) {
         vg.e();
         vg.b(1.0F - var6);
         vg.c(var7, var8, 14.0F, 1.8F, var4.m());
         vg.f();
      }
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button == 0 && this.b(mx, my)) {
         this.g.a();
         dev.sixseven.n.h.b(this.g.i());
         return true;
      } else {
         return false;
      }
   }
}
