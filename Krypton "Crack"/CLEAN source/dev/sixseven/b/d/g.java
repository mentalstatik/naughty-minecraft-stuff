package dev.sixseven.b.d;

public abstract class g {
   protected final dev.sixseven.m.d b;
   private final dev.sixseven.i.g<?> a;
   protected float c;
   protected float d;
   protected float e;

   protected g(dev.sixseven.m.d themes, dev.sixseven.i.g<?> boundSetting) {
      this.b = themes;
      this.a = boundSetting;
   }

   public boolean d() {
      return this.a == null || this.a.k();
   }

   protected dev.sixseven.m.c e() {
      return this.b.a();
   }

   public void a(float x, float y, float width) {
      this.c = x;
      this.d = y;
      this.e = width;
   }

   public boolean b(float mx, float my) {
      return mx >= this.c && mx <= this.c + this.e && my >= this.d && my <= this.d + this.a((dev.sixseven.g.b.d)null);
   }

   public abstract float a(dev.sixseven.g.b.d var1);

   public abstract void a(dev.sixseven.g.b.d var1, float var2, float var3);

   public boolean a(float mx, float my, int button) {
      return false;
   }

   public void a(float mx, float my) {
   }

   public void b() {
   }

   public boolean a(int keyCode) {
      return false;
   }

   public boolean b(int codepoint) {
      return false;
   }

   public boolean c() {
      return false;
   }
}
