package dev.sixseven.b.d;

import net.minecraft.class_310;

public class d extends g {
   private static final float a = 26.0F;
   private final dev.sixseven.i.d f;

   public d(dev.sixseven.m.d themes, dev.sixseven.i.d setting) {
      super(themes, setting);
      this.f = setting;
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 26.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      float var5 = this.d + 13.0F;
      vg.a(this.f.g(), this.c, var5, 12.5F, var4.l());
      float var6 = 88.0F;
      float var7 = 18.0F;
      float var8 = this.c + this.e - var6;
      float var9 = var5 - var7 / 2.0F;
      boolean var10 = mx >= var8 && mx <= var8 + var6 && my >= var9 && my <= var9 + var7;
      vg.a(var8, var9, var6, var7, var7 / 2.0F, var4.h(), var4.i(), true);
      vg.b(var8, var9, var6, var7, var7 / 2.0F, 1.1F, dev.sixseven.n.c.a(var10 ? var4.d() : var4.a(), var10 ? 0.9F : 0.4F));
      String var11 = "Pick";
      float var12 = vg.a(var11, 12.0F);
      vg.a(var11, var8 + (var6 - var12) / 2.0F, var9 + var7 / 2.0F, 12.0F, var4.d(), var4.a());
      long var13 = this.f.c();
      String var15 = var13 + "/" + this.f.b();
      vg.a(var15, var8 - 8.0F - vg.a(var15, 11.5F), var5, 11.5F, var4.m());
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button == 0 && this.b(mx, my)) {
         if (class_310.method_1551().field_1755 instanceof dev.sixseven.b.a var5) {
            var5.a(this.f);
            dev.sixseven.n.h.d();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
