package dev.sixseven.d.a;

public class al extends dev.sixseven.d.c {
   private static final double c = 14.0;
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Factor", "Zoom factor", 4.0, 2.0, 10.0, 0.5, "x"));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Smooth", "Smooth zoom in/out", true));
   private double d = 1.0;
   private long e = 0L;

   public al() {
      super("Zoom", "Optical zoom on a key", dev.sixseven.d.b.c);
   }

   public double k() {
      long var1 = System.nanoTime();
      double var3 = this.e == 0L ? 0.0 : (double)(var1 - this.e) / 1.0E9;
      this.e = var1;
      double var5 = this.f() ? (double)this.a.d() : 1.0;
      if (!this.b.i()) {
         this.d = var5;
         return this.d;
      } else {
         double var7 = 1.0 - Math.exp(-14.0 * Math.max(0.0, var3));
         this.d = this.d + (var5 - this.d) * var7;
         if (Math.abs(this.d - var5) < 0.001) {
            this.d = var5;
         }

         return this.d;
      }
   }
}
