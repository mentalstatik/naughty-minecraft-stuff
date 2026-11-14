package dev.sixseven.b.d;

public class h extends g {
   public static final float a = 27.0F;
   private static final float f = 5.0F;
   private static final float g = 5.0F;
   private final dev.sixseven.i.h h;
   private final dev.sixseven.g.a.a i = new dev.sixseven.g.a.a(90.0F, 0.0F);
   private boolean j;

   public h(dev.sixseven.m.d themes, dev.sixseven.i.h setting) {
      super(themes, setting);
      this.h = setting;
      this.i.b((float)setting.l());
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 27.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      float var5 = this.d + 8.0F;
      vg.a(this.h.g(), this.c, var5, 12.5F, var4.l());
      String var6 = this.h.m();
      vg.a(var6, this.c + this.e - vg.a(var6, 12.5F), var5, 12.5F, var4.k());
      float var7 = this.d + 27.0F - 5.0F - 5.0F;
      this.i.a((float)this.h.l());
      float var8 = Math.clamp(this.i.b(), 0.0F, 1.0F);
      vg.a(this.c, var7, this.e, 5.0F, 2.5F, dev.sixseven.n.c.a(-16777216, 0.45F));
      float var9 = Math.max(5.0F, var8 * this.e);
      vg.a(this.c, var7, var9, 5.0F, 2.5F, var4.a(), var4.d(), false);
      float var10 = this.c + var8 * (this.e - 5.0F) + 2.5F;
      if (this.j) {
         vg.a(var10, var7 + 2.5F, 5.0F, 5.0F, var4.e());
      }

      vg.a(var10, var7 + 2.5F, 5.0F, -1);
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button == 0 && this.b(mx, my) && !(my < this.d + 10.0F)) {
         this.j = true;
         this.a(mx);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(float mx, float my) {
      if (this.j) {
         this.a(mx);
      }
   }

   @Override
   public void b() {
      this.j = false;
   }

   private void a(float mx) {
      double var2 = this.h.l();
      this.h.a((double)((mx - this.c) / this.e));
      if (this.h.l() != var2) {
         dev.sixseven.n.h.a((float)this.h.l());
      }
   }
}
