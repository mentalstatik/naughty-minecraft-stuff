package dev.sixseven.b.b;

import dev.sixseven.b.d.g;
import dev.sixseven.i.e;
import dev.sixseven.i.f;
import dev.sixseven.i.h;
import dev.sixseven.i.i;
import java.util.ArrayList;
import java.util.List;

public class b {
   public static final float a = 30.0F;
   private static final float b = 8.0F;
   private static final float c = 12.0F;
   private final dev.sixseven.d.c d;
   private final dev.sixseven.m.d e;
   private final dev.sixseven.b.b f;
   private final String g;
   private final List<g> h = new ArrayList<>();
   private final dev.sixseven.g.a.a i = new dev.sixseven.g.a.a(140.0F, 0.0F);
   private final dev.sixseven.g.a.a j = new dev.sixseven.g.a.a(160.0F, 0.0F);
   private final dev.sixseven.g.a.a k;
   private float l;
   private float m;
   private float n;

   public b(dev.sixseven.d.c module, dev.sixseven.m.d themes, dev.sixseven.b.b state) {
      this.d = module;
      this.e = themes;
      this.f = state;
      String var4 = module.a();
      this.g = var4 + "@" + module.c().name();
      this.k = new dev.sixseven.g.a.a(190.0F, state.b(this.g) ? 1.0F : 0.0F);
      this.j.b(module.f() ? 1.0F : 0.0F);

      for (dev.sixseven.i.g var6 : module.e()) {
         if (var6 instanceof dev.sixseven.i.b var7) {
            this.h.add(new dev.sixseven.b.d.b(themes, var7));
         } else if (var6 instanceof h var8) {
            this.h.add(new dev.sixseven.b.d.h(themes, var8));
         } else if (var6 instanceof f var9) {
            this.h.add(new dev.sixseven.b.d.f(themes, var9));
         } else if (var6 instanceof dev.sixseven.i.c var10) {
            this.h.add(new dev.sixseven.b.d.c(themes, var10));
         } else if (var6 instanceof dev.sixseven.i.a var11) {
            this.h.add(new dev.sixseven.b.d.a(themes, var11));
         } else if (var6 instanceof dev.sixseven.i.d var12) {
            this.h.add(new dev.sixseven.b.d.d(themes, var12));
         } else if (var6 instanceof i var13) {
            this.h.add(new dev.sixseven.b.d.i(themes, var13));
         } else if (var6 instanceof e var14) {
            this.h.add(new dev.sixseven.b.d.e(themes, var14));
         }
      }

      this.h.add(new dev.sixseven.b.d.e(themes, module.d()));
   }

   public dev.sixseven.d.c a() {
      return this.d;
   }

   public void a(float x, float y, float width) {
      this.l = x;
      this.m = y;
      this.n = width;
   }

   private float b(dev.sixseven.g.b.d vg) {
      float var2 = 6.0F;

      for (g var4 : this.h) {
         if (var4.d()) {
            var2 += var4.a(vg) + 3.0F;
         }
      }

      return var2 + 3.0F;
   }

   public float a(dev.sixseven.g.b.d vg) {
      float var2 = this.k.b();
      return 30.0F + (var2 <= 0.005F ? 0.0F : var2 * this.b(vg));
   }

   public void a(dev.sixseven.g.b.d vg, float mx, float my, float fadeAlpha) {
      dev.sixseven.m.c var5 = this.d();
      boolean var6 = mx >= this.l && mx <= this.l + this.n && my >= this.m && my <= this.m + 30.0F;
      if (var6 && this.i.a() < 0.5F) {
         dev.sixseven.n.h.c();
      }

      this.i.a(var6 ? 1.0F : 0.0F);
      this.j.a(this.d.f() ? 1.0F : 0.0F);
      float var7 = this.i.b();
      float var8 = this.j.b();
      float var9 = this.k.b();
      vg.e();
      vg.b(fadeAlpha);
      if (var8 > 0.01F) {
         vg.e();
         vg.b(var8);
         vg.a(this.l, this.m, this.n, 30.0F, 8.0F, var5.j());
         vg.c(this.l, this.m, this.n, 30.0F, 8.0F, 4.0F, dev.sixseven.n.c.a(var5.a(), 0.16F * var8));
         vg.f();
      }

      if (var7 > 0.01F) {
         vg.a(this.l, this.m, this.n, 30.0F, 8.0F, dev.sixseven.n.c.a(var5.a(), 0.1F * var7));
      }

      float var10 = this.m + 15.0F;
      if (var8 > 0.01F) {
         vg.e();
         vg.b(var8);
         vg.b(this.d.a(), this.l + 10.0F, var10, 14.5F, dev.sixseven.n.c.a(var5.a(), 0.75F));
         vg.a(this.d.a(), this.l + 10.0F, var10, 14.5F, var5.d(), var5.a());
         vg.f();
      }

      if (var8 < 0.99F) {
         vg.e();
         vg.b(1.0F - var8);
         int var11 = dev.sixseven.n.c.a(var5.l(), var5.k(), var7);
         vg.a(this.d.a(), this.l + 10.0F, var10, 14.5F, var11);
         vg.f();
      }

      float var17 = this.l + this.n - 12.0F;
      int var12 = dev.sixseven.n.c.a(var5.o(), var5.n(), var8);
      if (var8 > 0.3F) {
         vg.a(var17, var10, 3.0F, 4.0F, dev.sixseven.n.c.a(var12, 0.5F * var8));
      }

      vg.a(var17, var10, 3.0F, var12);
      if (var9 > 0.005F) {
         float var13 = this.b(vg) * var9;
         vg.e();
         vg.a(this.l, this.m + 30.0F, this.n, var13);
         vg.b(var9);
         vg.a(this.l + 4.0F, this.m + 30.0F - 4.0F, this.n - 8.0F, var13 + 0.0F, 6.0F, dev.sixseven.n.c.a(-15988208, 0.55F));
         float var14 = this.m + 30.0F + 6.0F;

         for (g var16 : this.h) {
            if (var16.d()) {
               var16.a(this.l + 12.0F, var14, this.n - 24.0F);
               var16.a(vg, mx, my);
               var14 += var16.a(vg) + 3.0F;
            }
         }

         vg.f();
      }

      vg.f();
   }

   private dev.sixseven.m.c d() {
      return this.e.a();
   }

   public boolean a(float mx, float my, int button) {
      if (mx >= this.l && mx <= this.l + this.n && my >= this.m && my <= this.m + 30.0F) {
         if (button == 0) {
            this.d.g();
            dev.sixseven.n.h.a(this.d.f());
         } else if (button == 1) {
            boolean var6 = !(this.k.a() > 0.5F);
            this.k.a(var6 ? 1.0F : 0.0F);
            this.f.a(this.g, var6);
            dev.sixseven.n.h.d();
         }

         return true;
      } else if (this.k.a() > 0.5F && my >= this.m + 30.0F && my <= this.m + this.a((dev.sixseven.g.b.d)null)) {
         for (g var5 : this.h) {
            if (var5.d() && var5.a(mx, my, button)) {
               return true;
            }
         }

         return mx >= this.l && mx <= this.l + this.n;
      } else {
         return false;
      }
   }

   public void a(float mx, float my) {
      for (g var4 : this.h) {
         var4.a(mx, my);
      }
   }

   public void b() {
      for (g var2 : this.h) {
         var2.b();
      }
   }

   public boolean a(int keyCode) {
      for (g var3 : this.h) {
         if (var3.a(keyCode)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(int codepoint) {
      for (g var3 : this.h) {
         if (var3.b(codepoint)) {
            return true;
         }
      }

      return false;
   }

   public boolean c() {
      for (g var2 : this.h) {
         if (var2.c()) {
            return true;
         }
      }

      return false;
   }
}
