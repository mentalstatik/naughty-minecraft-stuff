package dev.sixseven.c.a;

import java.util.function.BooleanSupplier;

public class j extends dev.sixseven.c.a {
   private static final float c = 30.0F;
   private static final float d = 13.0F;
   private static final float e = 18.0F;
   private static final float f = 14.0F;
   private final dev.sixseven.m.d g;

   public j(dev.sixseven.m.d themes, BooleanSupplier visible) {
      super("watermark", 0.006F, 0.01F, visible);
      this.g = themes;
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      return 13.0F + vg.a("WINTER", 18.0F) + 7.0F + vg.a("CLIENT", 14.0F) + 13.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      return 30.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.m.c var6 = this.g.a();
      float var7 = y + h / 2.0F;
      float var8 = (float)(0.5 + 0.5 * Math.sin((double)System.nanoTime() / 8.0E8));
      float var9 = (float)(0.5 + 0.5 * Math.sin((double)System.nanoTime() / 4.8E8));
      int var10 = dev.sixseven.n.c.a(var6.d(), var6.a(), var9);
      int var11 = dev.sixseven.n.c.a(var6.a(), var6.d(), var9);
      vg.c(x, y, w, h, h / 2.0F, 8.0F, dev.sixseven.n.c.a(var6.a(), 0.1F + 0.1F * var8));
      vg.a(x, y, w, h, h / 2.0F, dev.sixseven.n.c.a(-15264995, 0.88F), dev.sixseven.n.c.a(-15856878, 0.88F), true);
      vg.b(x, y, w, h, h / 2.0F, 1.0F, dev.sixseven.n.c.a(dev.sixseven.n.c.a(var6.a(), var6.d(), var8), 0.55F));
      float var12 = x + 13.0F;
      vg.b("WINTER", var12, var7, 18.0F, dev.sixseven.n.c.a(var6.a(), 0.45F + 0.3F * var8));
      vg.a("WINTER", var12, var7, 18.0F, var10, var11);
      var12 += vg.a("WINTER", 18.0F) + 7.0F;
      vg.a(var12 - 4.5F, var7, 1.4F, dev.sixseven.n.c.a(var6.l(), 0.8F));
      vg.a("CLIENT", var12, var7, 14.0F, dev.sixseven.n.c.a(-856073, 0.92F));
   }
}
