package dev.sixseven.b.d;

public class e extends g {
   public static final float a = 22.0F;
   private final dev.sixseven.i.e f;
   private boolean g;

   public e(dev.sixseven.m.d themes, dev.sixseven.i.e setting) {
      super(themes, setting);
      this.f = setting;
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 22.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      float var5 = this.d + 11.0F;
      vg.a(this.f.g(), this.c, var5, 12.5F, var4.l());
      String var6 = this.g ? "..." : this.f.b();
      float var7 = Math.max(30.0F, vg.a(var6, 11.5F) + 12.0F);
      float var8 = this.c + this.e - var7;
      float var9 = 16.0F;
      float var10 = var5 - var9 / 2.0F;
      int var11 = this.g ? dev.sixseven.n.c.a(var4.a(), 0.3F) : dev.sixseven.n.c.a(-16777216, 0.45F);
      vg.a(var8, var10, var7, var9, var9 / 2.0F, var11);
      if (this.g) {
         float var12 = (float)(0.5 + 0.5 * Math.sin((double)System.nanoTime() / 2.2E8));
         vg.b(var8, var10, var7, var9, var9 / 2.0F, 1.2F, dev.sixseven.n.c.a(var4.d(), 0.4F + 0.6F * var12));
      }

      vg.a(var6, var8 + (var7 - vg.a(var6, 11.5F)) / 2.0F, var5, 11.5F, this.g ? var4.d() : var4.k());
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (this.g) {
         if (button == 0) {
            this.g = false;
            return this.b(mx, my);
         } else {
            this.f.a(Integer.valueOf(button));
            this.g = false;
            dev.sixseven.n.h.f();
            return true;
         }
      } else if (button == 0 && this.b(mx, my)) {
         this.g = true;
         dev.sixseven.n.h.e();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int keyCode) {
      if (!this.g) {
         return false;
      } else {
         if (keyCode == 256) {
            this.f.a(Integer.valueOf(-1));
         } else {
            this.f.a(Integer.valueOf(keyCode));
         }

         this.g = false;
         dev.sixseven.n.h.f();
         return true;
      }
   }

   @Override
   public boolean c() {
      return this.g;
   }
}
