package dev.sixseven.c.a;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class c extends dev.sixseven.c.a {
   private static final float c = 22.0F;
   private static final float d = 13.0F;
   private static final float e = 9.0F;
   private final dev.sixseven.m.d f;
   private final String g;
   private final Supplier<String> h;

   public c(String id, dev.sixseven.m.d themes, String label, Supplier<String> value, float defaultFx, float defaultFy, BooleanSupplier visible) {
      super(id, defaultFx, defaultFy, visible);
      this.f = themes;
      this.g = label;
      this.h = value;
   }

   private String g() {
      try {
         return this.h.get();
      } catch (Exception var2) {
         return "?";
      }
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      return 9.0F + vg.a(this.g, 13.0F) + 5.0F + vg.a(this.g(), 13.0F) + 9.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      return 22.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.m.c var6 = this.f.a();
      float var7 = y + hx / 2.0F;
      vg.a(x, y, w, hx, hx / 2.0F, var6.f(), var6.g(), true);
      float var8 = x + 9.0F;
      var8 += vg.a(this.g, var8, var7, 13.0F, var6.d(), var6.a());
      vg.a(this.g(), var8 + 5.0F, var7, 13.0F, var6.k());
   }
}
