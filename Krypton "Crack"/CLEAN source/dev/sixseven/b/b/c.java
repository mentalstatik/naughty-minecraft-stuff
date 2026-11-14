package dev.sixseven.b.b;

import dev.sixseven.n.h;

public abstract class c {
   public static final float a = 210.0F;
   public static final float b = 38.0F;
   public static final float c = 12.0F;
   protected static final float d = 6.0F;
   private static final float g = 16.0F;
   protected final dev.sixseven.m.d e;
   protected final dev.sixseven.b.b.a f;
   private final dev.sixseven.g.a.a h;
   private final dev.sixseven.g.a.a i = new dev.sixseven.g.a.a(200.0F, 0.0F);
   private float j;
   private boolean k;

   protected c(dev.sixseven.m.d themes, dev.sixseven.b.b.a ps) {
      this.e = themes;
      this.f = ps;
      this.h = new dev.sixseven.g.a.a(200.0F, ps.c ? 0.0F : 1.0F);
   }

   protected dev.sixseven.m.c e() {
      return this.e.a();
   }

   public float f() {
      return this.f.a;
   }

   public float g() {
      return this.f.b;
   }

   public void b(float x, float y) {
      this.f.a = x;
      this.f.b = y;
   }

   public void h() {
      this.f.c = !this.f.c;
      this.h.a(this.f.c ? 0.0F : 1.0F);
   }

   protected abstract String a();

   protected int b() {
      return -1;
   }

   protected abstract float a(dev.sixseven.g.b.d var1);

   protected abstract void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, float var6);

   protected float a(float uiHeight) {
      return Math.max(60.0F, uiHeight - this.f.b - 38.0F - 24.0F);
   }

   protected float a(dev.sixseven.g.b.d vg, float uiHeight) {
      return Math.min(this.a(vg), this.a(uiHeight)) * this.h.b();
   }

   public float b(dev.sixseven.g.b.d vg, float uiHeight) {
      return 38.0F + this.a(vg, uiHeight);
   }

   protected float a(float rowTop, float rowBottom, float viewTop, float viewBottom) {
      float var5 = Math.clamp((rowBottom - viewTop) / 16.0F, 0.0F, 1.0F);
      float var6 = Math.clamp((viewBottom - rowTop) / 16.0F, 0.0F, 1.0F);
      return Math.min(var5, var6);
   }

   public void a(dev.sixseven.g.b.d vg, float mx, float my, float uiWidth, float uiHeight) {
      this.f.a = Math.clamp(this.f.a, -170.0F, uiWidth - 40.0F);
      this.f.b = Math.clamp(this.f.b, 0.0F, uiHeight - 38.0F);
      dev.sixseven.m.c var6 = this.e();
      float var7 = this.a(vg, uiHeight);
      boolean var8 = var7 > 0.5F;
      boolean var9 = this.c(mx, my);
      if (var9 && !this.k) {
         dev.sixseven.n.h.c();
      }

      this.k = var9;
      vg.c(this.f.a, this.f.b, 210.0F, 38.0F + var7, 12.0F, 14.0F, dev.sixseven.n.c.a(-16777216, 0.35F));
      if (var8) {
         vg.a(this.f.a, this.f.b + 38.0F, 210.0F, var7, 0.0F, 0.0F, 12.0F, 12.0F, var6.f(), var6.g());
      }

      float var10 = var8 ? 0.0F : 12.0F;
      vg.a(this.f.a, this.f.b, 210.0F, 38.0F, 12.0F, 12.0F, var10, var10, var6.h(), var6.i());
      if (var8) {
         vg.a(this.f.a + 1.0F, this.f.b + 38.0F - 1.5F, 208.0F, 1.5F, 0.75F, dev.sixseven.n.c.a(var6.a(), 0.85F), dev.sixseven.n.c.a(var6.d(), 0.5F), false);
      }

      float var11 = this.f.a + 12.0F;
      int var12 = this.b();
      if (var12 > 0) {
         vg.a(var12, this.f.a + 11.0F, this.f.b + 19.0F - 9.0F, 18.0F, 18.0F, var6.d());
         var11 = this.f.a + 36.0F;
      }

      vg.a(this.a(), var11, this.f.b + 19.0F, 16.5F, var6.k());
      float var13 = this.f.a + 210.0F - 16.0F;
      float var14 = this.f.b + 19.0F;
      vg.e();
      vg.a(var13, var14);
      vg.c((float)((double)this.h.b() * Math.PI / 2.0));
      vg.a(0.0F, 0.0F, 4.5F, 1.8F, var6.l(), false);
      vg.f();
      if (var8) {
         float var15 = this.f.b + 38.0F;
         float var16 = var15 + var7;
         this.j = Math.max(0.0F, this.a(vg) - this.a(uiHeight));
         this.i.a(Math.clamp(this.i.a(), 0.0F, this.j));
         vg.e();
         vg.a(this.f.a, var15, 210.0F, var7);
         this.a(vg, var15 + 6.0F - this.i.b(), mx, my, var15, var16);
         vg.f();
      }
   }

   public boolean c(float mx, float my) {
      return mx >= this.f.a && mx <= this.f.a + 210.0F && my >= this.f.b && my <= this.f.b + 38.0F;
   }

   public boolean a(dev.sixseven.g.b.d vg, float mx, float my, float uiHeight) {
      float var5 = this.a(vg, uiHeight);
      return mx >= this.f.a && mx <= this.f.a + 210.0F && my >= this.f.b + 38.0F && my <= this.f.b + 38.0F + var5;
   }

   public void a(double amount) {
      if (!(this.j <= 0.0F)) {
         this.i.a(Math.clamp(this.i.a() - (float)amount * 38.0F, 0.0F, this.j));
      }
   }

   public boolean a(float mx, float my, int button) {
      return false;
   }

   public void a(float mx, float my) {
   }

   public void c() {
   }

   public boolean a(int keyCode) {
      return false;
   }

   public boolean b(int codepoint) {
      return false;
   }

   public boolean d() {
      return false;
   }
}
