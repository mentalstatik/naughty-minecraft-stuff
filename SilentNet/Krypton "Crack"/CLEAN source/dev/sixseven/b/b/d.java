package dev.sixseven.b.b;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.d.g;
import dev.sixseven.i.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class d extends c {
   private static final float g = 26.0F;
   private static final float h = 28.0F;
   private static final float i = 24.0F;
   private final dev.sixseven.b.d.c j;
   private final dev.sixseven.i.c k;
   private final List<g> l = new ArrayList<>();
   private static final int m = 5;
   private int n = -1;
   private float o = Float.MIN_VALUE;

   public d(dev.sixseven.m.d themes, dev.sixseven.b.b state) {
      super(themes, state.a("__themes__"));
      this.k = new dev.sixseven.i.c("Accent", "Custom theme accent color", themes.a().a()) {
         public void a(Integer value) {
            super.a(value);
            dev.sixseven.m.c var2 = themes.a();
            if (var2.c()) {
               var2.a(value | 0xFF000000);
            }
         }
      };
      this.j = new dev.sixseven.b.d.c(themes, this.k);
      dev.sixseven.m.b var3 = SixSevenClient.sounds();
      if (var3 != null) {
         for (dev.sixseven.i.g var5 : var3.a()) {
            if (var5 instanceof h var6) {
               this.l.add(new dev.sixseven.b.d.h(themes, var6));
            } else if (var5 instanceof dev.sixseven.i.b var7) {
               this.l.add(new dev.sixseven.b.d.b(themes, var7));
            }
         }
      }
   }

   @Override
   protected String a() {
      return "Themes";
   }

   @Override
   protected float a(dev.sixseven.g.b.d vg) {
      float var2 = 12.0F + (float)this.e.b().size() * 26.0F + 28.0F;
      if (this.e.a().c()) {
         var2 += this.j.a(vg) + 6.0F;
      }

      var2 += 48.0F;

      for (g var4 : this.l) {
         var2 += var4.a(vg) + 3.0F;
      }

      return var2;
   }

   @Override
   protected void a(dev.sixseven.g.b.d vg, float startY, float mx, float my, float viewTop, float viewBottom) {
      this.o = startY;
      dev.sixseven.m.c var7 = this.e.a();
      float var8 = startY;
      int var9 = 0;
      int var10 = -1;

      for (dev.sixseven.m.c var12 : this.e.b()) {
         float var13 = this.a(var8, var8 + 26.0F, viewTop, viewBottom);
         vg.e();
         vg.b(var13);
         boolean var14 = var12 == var7;
         boolean var15 = my >= var8 && my <= var8 + 26.0F && mx >= this.f.a + 6.0F && mx <= this.f.a + 210.0F - 6.0F;
         if (var15) {
            var10 = var9;
         }

         var9++;
         if (var14 || var15) {
            vg.a(this.f.a + 6.0F, var8, 198.0F, 26.0F, 7.0F, dev.sixseven.n.c.a(this.e().a(), var14 ? 0.16F : 0.08F));
         }

         float var16 = var8 + 13.0F;
         vg.a(this.f.a + 20.0F, var16, 6.0F, var12.a());
         if (var14) {
            vg.b(this.f.a + 20.0F - 9.0F, var16 - 9.0F, 18.0F, 18.0F, 9.0F, 1.5F, this.e().d());
         }

         vg.a(var12.b(), this.f.a + 36.0F, var16, 13.5F, var14 ? this.e().k() : this.e().l());
         if (var12.c()) {
            vg.c(this.f.a + 210.0F - 28.0F, var16 - 6.0F, 12.0F, 1.6F, this.e().m());
         }

         vg.f();
         var8 += 26.0F;
      }

      if (var7.c()) {
         this.j.a(this.f.a + 14.0F, var8 + 3.0F, 182.0F);
         this.j.a(vg, mx, my);
         var8 += this.j.a(vg) + 6.0F;
      }

      float var19 = this.a(var8, var8 + 28.0F, viewTop, viewBottom);
      vg.e();
      vg.b(var19);
      boolean var20 = my >= var8 && my <= var8 + 28.0F - 4.0F && mx >= this.f.a + 6.0F && mx <= this.f.a + 210.0F - 6.0F;
      vg.a(this.f.a + 6.0F, var8, 198.0F, 24.0F, 7.0F, dev.sixseven.n.c.a(this.e().a(), var20 ? 0.22F : 0.12F));
      String var21 = "+  Add Custom";
      vg.a(var21, this.f.a + (210.0F - vg.a(var21, 13.0F)) / 2.0F, var8 + 12.0F, 13.0F, var20 ? this.e().d() : this.e().k());
      vg.f();
      if (var20) {
         var10 = 999;
      }

      var8 += 28.0F;
      var8 = this.a(vg, "Sounds", var8, viewTop, viewBottom);

      for (int var22 = 0; var22 < this.l.size(); var22++) {
         if (var22 == 5) {
            var8 = this.a(vg, "Startup Sound", var8, viewTop, viewBottom);
         }

         g var23 = this.l.get(var22);
         var23.a(this.f.a + 14.0F, var8, 182.0F);
         float var24 = this.a(var8, var8 + var23.a(vg), viewTop, viewBottom);
         vg.e();
         vg.b(var24);
         var23.a(vg, mx, my);
         vg.f();
         var8 += var23.a(vg) + 3.0F;
      }

      if (var10 != this.n && var10 != -1) {
         dev.sixseven.n.h.c();
      }

      this.n = var10;
   }

   private float a(dev.sixseven.g.b.d vg, String title, float rowY, float viewTop, float viewBottom) {
      float var6 = this.a(rowY, rowY + 24.0F, viewTop, viewBottom);
      vg.e();
      vg.b(var6);
      float var7 = rowY + 12.0F + 3.0F;
      vg.a(title.toUpperCase(Locale.ROOT), this.f.a + 14.0F, var7, 12.0F, this.e().d(), this.e().a());
      float var8 = this.f.a + 14.0F + vg.a(title.toUpperCase(Locale.ROOT), 12.0F) + 8.0F;
      vg.a(var8, var7 - 0.5F, Math.max(0.0F, this.f.a + 210.0F - 14.0F - var8), 1.0F, 0.5F, dev.sixseven.n.c.a(this.e().a(), 0.3F));
      vg.f();
      return rowY + 24.0F;
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (this.j.a(mx, my, button)) {
         return true;
      } else {
         for (g var5 : this.l) {
            if (var5.a(mx, my, button)) {
               return true;
            }
         }

         if (button != 0) {
            return false;
         } else {
            float var7 = this.i();
            if (var7 == Float.MIN_VALUE) {
               return false;
            } else {
               for (dev.sixseven.m.c var6 : this.e.b()) {
                  if (my >= var7 && my <= var7 + 26.0F && mx >= this.f.a + 6.0F && mx <= this.f.a + 210.0F - 6.0F) {
                     if (var6.c() && mx >= this.f.a + 210.0F - 34.0F) {
                        this.e.b(var6);
                     } else {
                        this.e.a(var6);
                        if (var6.c()) {
                           this.k.a(Integer.valueOf(var6.a()));
                        }
                     }

                     return true;
                  }

                  var7 += 26.0F;
               }

               if (this.e.a().c()) {
                  var7 += this.j.a((dev.sixseven.g.b.d)null) + 6.0F;
               }

               if (my >= var7 && my <= var7 + 28.0F - 4.0F && mx >= this.f.a + 6.0F && mx <= this.f.a + 210.0F - 6.0F) {
                  dev.sixseven.m.c var9 = this.e.a(this.e.a().a());
                  this.e.a(var9);
                  this.k.a(Integer.valueOf(var9.a()));
                  return true;
               } else {
                  return false;
               }
            }
         }
      }
   }

   private float i() {
      return this.o;
   }

   @Override
   public void a(float mx, float my) {
      this.j.a(mx, my);

      for (g var4 : this.l) {
         var4.a(mx, my);
      }
   }

   @Override
   public void c() {
      this.j.b();

      for (g var2 : this.l) {
         var2.b();
      }
   }

   @Override
   public boolean a(int keyCode) {
      return this.j.a(keyCode);
   }

   @Override
   public boolean d() {
      return this.j.c();
   }
}
