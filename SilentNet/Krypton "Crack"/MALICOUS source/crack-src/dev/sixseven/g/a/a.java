package dev.sixseven.g.a;

public class a {
   private final float a;
   private final b b;
   private float c;
   private float d;
   private long e;

   public a(float durationMs, float initial) {
      this(durationMs, initial, dev.sixseven.g.a.b.b);
   }

   public a(float durationMs, float initial, b easing) {
      this.a = durationMs;
      this.b = easing;
      this.c = initial;
      this.d = initial;
      this.e = System.nanoTime();
   }

   public void a(float newTarget) {
      if (newTarget != this.d) {
         this.c = this.b();
         this.d = newTarget;
         this.e = System.nanoTime();
      }
   }

   public void b(float v) {
      this.c = v;
      this.d = v;
   }

   public float a() {
      return this.d;
   }

   public float b() {
      float var1 = (float)(System.nanoTime() - this.e) / 1000000.0F / this.a;
      return var1 >= 1.0F ? this.d : this.c + (this.d - this.c) * this.b.a(Math.max(var1, 0.0F));
   }

   public boolean c() {
      return (float)(System.nanoTime() - this.e) / 1000000.0F >= this.a;
   }
}
