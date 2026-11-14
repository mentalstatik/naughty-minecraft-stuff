package dev.sixseven.c.a;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;

public class d extends dev.sixseven.c.a {
   private static final float c = 26.0F;
   private static final float d = 3.0F;
   private static final float e = 12.5F;
   private final dev.sixseven.m.d f;
   private final Map<String, dev.sixseven.g.a.a> g = new HashMap<>();

   public d(dev.sixseven.m.d var1, BooleanSupplier var2) {
      super("keystrokes", 0.03F, 0.62F, var2);
      this.f = var1;
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return 84.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      float var2 = 55.0F;
      var2 += 29.0F;
      float var4;
      return var4 = var2 + 18.6F;
   }

   private float a(String var1, boolean var2) {
      dev.sixseven.g.a.a var3 = this.g.computeIfAbsent(var1, var0 -> new dev.sixseven.g.a.a(110.0F, 0.0F));
      var3.a(var2 ? 1.0F : 0.0F);
      return var3.b();
   }

   private void a(dev.sixseven.g.b.d var1, dev.sixseven.m.c var2, String var3, String var4, boolean var5, float var6, float var7, float var8, float var9) {
      float var10 = this.a(var3, var5);
      int var11 = dev.sixseven.n.c.a(dev.sixseven.n.c.a(-15462118, 0.78F), dev.sixseven.n.c.a(var2.a(), 0.85F), var10);
      var1.a(var6, var7, var8, var9, 6.0F, var11);
      int var12 = dev.sixseven.n.c.a(var2.l(), -1, var10);
      var1.a(var4, var6 + (var8 - var1.a(var4, 12.5F)) / 2.0F, var7 + var9 / 2.0F, 12.5F, var12);
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
      dev.sixseven.m.c var6 = this.f.a();
      class_315 var7 = class_310.method_1551().field_1690;
      this.a(var1, var6, "w", "W", a(var7.field_1894), var2 + 26.0F + 3.0F, var3, 26.0F, 26.0F);
      float var8 = var3 + 29.0F;
      this.a(var1, var6, "a", "A", a(var7.field_1913), var2, var8, 26.0F, 26.0F);
      this.a(var1, var6, "s", "S", a(var7.field_1881), var2 + 26.0F + 3.0F, var8, 26.0F, 26.0F);
      this.a(var1, var6, "d", "D", a(var7.field_1849), var2 + 58.0F, var8, 26.0F, 26.0F);
      float var9 = (var4 - 3.0F) / 2.0F;
      float var12;
      this.a(var1, var6, "lmb", "LMB " + dev.sixseven.n.d.b(0), a(var7.field_1886), var2, var12 = var8 + 29.0F, var9, 26.0F);
      this.a(var1, var6, "rmb", "RMB " + dev.sixseven.n.d.b(1), a(var7.field_1904), var2 + var9 + 3.0F, var12, var9, 26.0F);
      var9 = this.a("space", a(var7.field_1903));
      float var10 = 15.6F;
      int var11 = dev.sixseven.n.c.a(dev.sixseven.n.c.a(-15462118, 0.78F), dev.sixseven.n.c.a(var6.a(), 0.85F), var9);
      var1.a(var2, var8 = var12 + 29.0F, var4, var10, 6.0F, var11);
      var1.a(var2 + var4 * 0.25F, var8 + var10 / 2.0F - 1.25F, var4 * 0.5F, 2.5F, 1.25F, dev.sixseven.n.c.a(var6.l(), -1, var9));
   }

   private static boolean a(class_304 var0) {
      return var0.method_1434();
   }
}
