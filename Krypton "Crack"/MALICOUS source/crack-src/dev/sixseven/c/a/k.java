package dev.sixseven.c.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BooleanSupplier;

public final class k extends dev.sixseven.c.a {
   private static final float c = 11.5F;
   private static final float d = 10.5F;
   private static final float e = 17.0F;
   private final dev.sixseven.d.d f;
   private final dev.sixseven.m.d g;
   private List<k.a> h = List.of();
   private float i = 116.0F;

   public k(dev.sixseven.d.d var1, dev.sixseven.m.d var2, BooleanSupplier var3) {
      super("keybinds", 0.985F, 0.28F, var3);
      this.f = var1;
      this.g = var2;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1) {
      ArrayList var2 = new ArrayList();

      for (dev.sixseven.d.c var4 : this.f.a()) {
         if (var4.d().a()) {
            var2.add(var4);
         }
      }

      var2.sort(Comparator.comparing(dev.sixseven.d.c::f).reversed().thenComparing(dev.sixseven.d.c::a, String.CASE_INSENSITIVE_ORDER));
      ArrayList var10 = new ArrayList(var2.size());
      float var11 = 72.0F + var1.a("KEYBINDS", 10.5F);

      for (dev.sixseven.d.c var6 : var2) {
         String var7 = var6.d().b();
         float var8 = var1.a(var6.a(), 11.5F);
         float var9 = Math.max(24.0F, var1.a(var7, 10.5F) + 10.0F);
         var11 = Math.max(var11, 16.0F + var8 + 8.0F + var9);
         var10.add(new k.a(var6.a(), var7, var6.f(), var8, var9));
      }

      this.h = List.copyOf(var10);
      this.i = Math.min(var11, 280.0F);
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return this.i;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      return 27.0F + 17.0F * (float)Math.max(1, this.h.size());
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
      dev.sixseven.m.c var6 = this.g.a();
      var1.a(var2, var3, var4, var5, 7.0F, var6.f(), var6.g(), true);
      var1.a("KEYBINDS", var2 + 8.0F, var3 + 13.0F, 10.5F, var6.d(), var6.a());
      var1.a(var2 + 7.0F, var3 + 20.0F, var4 - 14.0F, 1.0F, 0.5F, var6.e());
      if (this.h.isEmpty()) {
         var1.a("Set a module keybind", var2 + 8.0F, var3 + 35.0F, 11.5F, var6.l());
      } else {
         float var7 = var3 + 27.0F;

         for (k.a var9 : this.h) {
            float var10 = var2 + var4 - 8.0F - var9.e();
            int var11 = var9.c() ? var6.k() : var6.l();
            int var12 = var9.c() ? var6.j() : var6.h();
            int var13 = var9.c() ? var6.d() : var6.l();
            var1.a(var9.a(), var2 + 8.0F, var7 + 8.5F, 11.5F, var11);
            var1.a(var10, var7 + 1.0F, var9.e(), 15.0F, 4.0F, var12);
            float var14 = var1.a(var9.b(), 10.5F);
            var1.a(var9.b(), var10 + (var9.e() - var14) / 2.0F, var7 + 8.5F, 10.5F, var13);
            var7 += 17.0F;
         }
      }
   }

   private static record a(String a, String b, boolean c, float d, float e) {
   }
}
