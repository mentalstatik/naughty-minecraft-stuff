package dev.sixseven.b.d;

public class c extends g {
   private static final float a = 22.0F;
   private static final float f = 74.0F;
   private static final float g = 10.0F;
   private static final float h = 22.0F;
   private static final float i = 6.0F;
   private final dev.sixseven.i.c j;
   private final dev.sixseven.g.a.a k = new dev.sixseven.g.a.a(170.0F, 0.0F);
   private boolean l;
   private float m;
   private float n;
   private float o;
   private boolean p;
   private boolean q;
   private boolean r;
   private final StringBuilder s = new StringBuilder();

   public c(dev.sixseven.m.d themes, dev.sixseven.i.c setting) {
      super(themes, setting);
      this.j = setting;
      this.f();
   }

   private void f() {
      float[] var1 = dev.sixseven.n.c.e(this.j.i());
      this.m = var1[0];
      this.n = var1[1];
      this.o = var1[2];
   }

   public void a(boolean value) {
      if (value && !this.l) {
         this.f();
      }

      this.l = value;
   }

   public boolean a() {
      return this.l;
   }

   private void g() {
      this.j.a(Integer.valueOf(dev.sixseven.n.c.a(this.m, this.n, this.o)));
   }

   @Override
   public float a(dev.sixseven.g.b.d vg) {
      return 22.0F + this.k.b() * 124.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mx, float my) {
      dev.sixseven.m.c var4 = this.e();
      float var5 = this.d + 11.0F;
      vg.a(this.j.g(), this.c, var5, 12.5F, var4.l());
      float var6 = 26.0F;
      float var7 = 14.0F;
      vg.a(this.c + this.e - var6, var5 - var7 / 2.0F, var6, var7, 5.0F, this.j.i() | 0xFF000000);
      vg.b(this.c + this.e - var6, var5 - var7 / 2.0F, var6, var7, 5.0F, 1.0F, dev.sixseven.n.c.a(-1, 0.25F));
      this.k.a(this.l ? 1.0F : 0.0F);
      float var8 = this.k.b();
      if (!(var8 < 0.01F)) {
         vg.e();
         vg.a(this.c - 4.0F, this.d + 22.0F, this.e + 8.0F, var8 * 124.0F);
         vg.b(var8);
         float var9 = this.h();
         int var10 = dev.sixseven.n.c.a(this.m, 1.0F, 1.0F);
         vg.a(this.c, var9, this.e, 74.0F, 6.0F, var10);
         vg.a(this.c, var9, this.e, 74.0F, 6.0F, -1, dev.sixseven.n.c.a(-1, 0), false);
         vg.a(this.c, var9, this.e, 74.0F, 6.0F, dev.sixseven.n.c.a(-16777216, 0), -16777216, true);
         float var11 = this.c + this.n * this.e;
         float var12 = var9 + (1.0F - this.o) * 74.0F;
         vg.a(var11, var12, 6.0F, -1);
         vg.a(var11, var12, 4.2F, dev.sixseven.n.c.a(this.m, this.n, this.o));
         float var13 = this.i();
         float var14 = this.e / 6.0F;

         for (int var15 = 0; var15 < 6; var15++) {
            int var16 = dev.sixseven.n.c.a((float)(var15 * 60), 1.0F, 1.0F);
            int var17 = dev.sixseven.n.c.a((var15 + 1) * 60 % 360 == 0 ? 359.9F : (float)((var15 + 1) * 60), 1.0F, 1.0F);
            vg.a(this.c + (float)var15 * var14, var13, var14 + 0.5F, 10.0F, 0.0F, var16, var17, false);
         }

         vg.b(this.c, var13, this.e, 10.0F, 5.0F, 1.5F, dev.sixseven.n.c.a(-15988208, 0.9F));
         float var21 = this.c + this.m / 360.0F * this.e;
         vg.a(var21, var13 + 5.0F, 6.0F, -1);
         vg.a(var21, var13 + 5.0F, 4.2F, var10);
         float var22 = this.j();
         vg.a(this.c, var22, 30.0F, 18.0F, 5.0F, this.j.i() | 0xFF000000);
         vg.b(this.c, var22, 30.0F, 18.0F, 5.0F, 1.0F, dev.sixseven.n.c.a(-1, 0.25F));
         float var23 = this.c + 38.0F;
         float var18 = this.e - 38.0F;
         int var19 = this.r ? dev.sixseven.n.c.a(var4.a(), 0.18F) : dev.sixseven.n.c.a(-16777216, 0.45F);
         vg.a(var23, var22, var18, 18.0F, 5.0F, var19);
         if (this.r) {
            vg.b(var23, var22, var18, 18.0F, 5.0F, 1.2F, var4.d());
         }

         String var20 = this.r ? "#" + this.s + (System.nanoTime() / 400000000L % 2L == 0L ? "_" : "") : this.j.e();
         vg.a(var20, var23 + 8.0F, var22 + 9.0F, 12.0F, this.r ? var4.k() : var4.l());
         vg.f();
      }
   }

   private float h() {
      return this.d + 22.0F + 2.0F;
   }

   private float i() {
      return this.h() + 74.0F + 6.0F;
   }

   private float j() {
      return this.i() + 10.0F + 6.0F;
   }

   @Override
   public boolean a(float mx, float my, int button) {
      if (button != 0) {
         return false;
      } else if (my >= this.d && my <= this.d + 22.0F && mx >= this.c && mx <= this.c + this.e) {
         this.l = !this.l;
         if (this.l) {
            this.f();
         }

         this.r = false;
         dev.sixseven.n.h.d();
         return true;
      } else if (!this.l) {
         return false;
      } else if (a(mx, my, this.c, this.h(), this.e, 74.0F)) {
         this.p = true;
         this.c(mx, my);
         return true;
      } else if (a(mx, my, this.c, this.i() - 3.0F, this.e, 16.0F)) {
         this.q = true;
         this.a(mx);
         return true;
      } else if (a(mx, my, this.c + 38.0F, this.j(), this.e - 38.0F, 18.0F)) {
         this.r = true;
         this.s.setLength(0);
         dev.sixseven.n.h.d();
         return true;
      } else {
         if (this.r) {
            this.k();
         }

         return false;
      }
   }

   private static boolean a(float mx, float my, float rx, float ry, float rw, float rh) {
      return mx >= rx && mx <= rx + rw && my >= ry && my <= ry + rh;
   }

   private void c(float mx, float my) {
      this.n = Math.clamp((mx - this.c) / this.e, 0.0F, 1.0F);
      this.o = 1.0F - Math.clamp((my - this.h()) / 74.0F, 0.0F, 1.0F);
      this.g();
   }

   private void a(float mx) {
      this.m = Math.clamp((mx - this.c) / this.e, 0.0F, 1.0F) * 359.9F;
      this.g();
   }

   @Override
   public void a(float mx, float my) {
      if (this.p) {
         this.c(mx, my);
      }

      if (this.q) {
         this.a(mx);
      }
   }

   @Override
   public void b() {
      this.p = false;
      this.q = false;
   }

   @Override
   public boolean a(int keyCode) {
      if (!this.r) {
         return false;
      } else if (keyCode == 256) {
         this.r = false;
         return true;
      } else if (keyCode == 257 || keyCode == 335) {
         this.k();
         return true;
      } else if (keyCode == 259) {
         if (!this.s.isEmpty()) {
            this.s.deleteCharAt(this.s.length() - 1);
         }

         return true;
      } else {
         char var2 = c(keyCode);
         if (var2 != 0 && this.s.length() < 6) {
            this.s.append(var2);
            if (this.s.length() == 6) {
               this.k();
            }
         }

         return true;
      }
   }

   private static char c(int keyCode) {
      if (keyCode >= 48 && keyCode <= 57) {
         return (char)(48 + keyCode - 48);
      } else if (keyCode >= 320 && keyCode <= 329) {
         return (char)(48 + keyCode - 320);
      } else {
         return keyCode >= 65 && keyCode <= 70 ? (char)(65 + keyCode - 65) : '\u0000';
      }
   }

   private void k() {
      this.r = false;
      if (this.s.length() == 6) {
         try {
            this.j.a(Integer.valueOf(0xFF000000 | Integer.parseInt(this.s.toString(), 16)));
            this.f();
            dev.sixseven.n.h.f();
         } catch (NumberFormatException var2) {
         }
      }

      this.s.setLength(0);
   }

   @Override
   public boolean c() {
      return this.r;
   }
}
