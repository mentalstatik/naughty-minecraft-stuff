package dev.sixseven.c.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class b extends dev.sixseven.c.a {
   private static final float c = 20.0F;
   private static final float d = 13.5F;
   private static final float e = 8.0F;
   private static final float f = 2.5F;
   private final dev.sixseven.d.d g;
   private final dev.sixseven.d.e.c h;
   private final dev.sixseven.m.d i;
   private final Map<dev.sixseven.d.c, dev.sixseven.g.a.a> j = new HashMap<>();
   private List<b.a> k = List.of();
   private float l = 40.0F;
   private float m = 20.0F;

   public b(dev.sixseven.d.d var1, dev.sixseven.d.e.c var2, dev.sixseven.m.d var3, BooleanSupplier var4) {
      super("arraylist", 1.0F, 0.008F, var4);
      this.g = var1;
      this.h = var2;
      this.i = var3;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1) {
      ArrayList var2 = new ArrayList();
      float var3 = 40.0F;
      float var4 = 0.0F;

      for (dev.sixseven.d.c var6 : this.g.a()) {
         if (var6.c() != dev.sixseven.d.b.f) {
            dev.sixseven.g.a.a var7 = this.j.computeIfAbsent(var6, var0 -> new dev.sixseven.g.a.a(240.0F, var0.f() ? 1.0F : 0.0F, dev.sixseven.g.a.b.b));
            var7.a(var6.f() ? 1.0F : 0.0F);
            float var8 = var7.b();
            if (var6.f() || var8 > 0.01F) {
               float var9 = var1.a(var6.a(), 13.5F);
               var2.add(new b.a(var6, var9));
               var3 = Math.max(var3, var9 + 16.0F + 2.5F + 2.0F);
               var4 += 20.0F * var8;
            }
         }
      }

      var2.sort(Comparator.comparingDouble(b.a::b).reversed());
      this.k = List.copyOf(var2);
      this.l = var3;
      this.m = Math.max(20.0F, var4);
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return this.l;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      return this.m;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
      dev.sixseven.m.c var6 = this.i.a();
      boolean var7 = this.h.m.i();
      boolean var8 = this.f();
      float var9 = var3;

      for (b.a var11 : this.k) {
         dev.sixseven.d.c var12 = var11.a();
         float var13 = this.j.get(var12).b();
         if (!(var13 <= 0.01F)) {
            int var14 = var7 ? var6.a() : this.h.n.i();
            int var15 = var7 ? var6.d() : dev.sixseven.n.c.b(var14, 0.35F);
            float var16 = var11.b();
            float var17 = var16 + 16.0F + 2.5F + 2.0F;
            float var18 = (1.0F - var13) * (var17 + 12.0F) * (float)(var8 ? 1 : -1);
            float var19 = (float)Math.round((var8 ? var2 + var4 - var17 : var2) + var18);
            float var20 = (float)Math.round(var9);
            var1.e();
            var1.b(var13);
            var1.a(var19, var20, var17, 20.0F, 5.0F, dev.sixseven.n.c.a(-15330788, 0.86F), dev.sixseven.n.c.a(-15791084, 0.86F), true);
            float var21 = var8 ? var19 + var17 - 2.5F : var19;
            var1.c(var21 - 1.0F, var20 + 2.0F, 4.5F, 16.0F, 2.0F, 3.0F, dev.sixseven.n.c.a(var14, 0.35F));
            var1.a(var21, var20 + 2.0F, 2.5F, 16.0F, 1.25F, var14);
            float var22 = (float)Math.round(var8 ? var19 + 8.0F : var19 + 2.5F + 2.0F + 8.0F - 2.0F);
            var1.a(var12.a(), var22, var20 + 10.0F, 13.5F, var15, var14);
            var1.f();
            var9 += 20.0F * var13;
         }
      }
   }

   private static record a(dev.sixseven.d.c a, float b) {
   }
}
