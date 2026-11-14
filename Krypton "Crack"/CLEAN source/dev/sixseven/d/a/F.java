package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.Locale;
import java.util.function.DoubleFunction;
import net.minecraft.class_1297;
import net.minecraft.class_1656;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class F extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Horizontal Speed", "Flight speed along the ground plane (10 = vanilla)", 10.0, 1.0, 100.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.1fx", var0 / 10.0)))
   );
   public final dev.sixseven.i.h b = this.a(
      new dev.sixseven.i.h("Vertical Speed", "Flight speed when ascending or descending (10 = vanilla)", 10.0, 1.0, 100.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.1fx", var0 / 10.0)))
   );
   private class_746 c;
   private boolean d;
   private boolean e;
   private float f;

   public F() {
      super("Fly", "Flight with adjustable horizontal and vertical speed", dev.sixseven.d.b.b);
   }

   @Override
   protected void h() {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      if (var1 != null && var1.k != null && var1.k.f()) {
         var1.k.a(false);
      }

      this.n();
   }

   @Override
   public void j() {
      this.n();
   }

   @Override
   protected void i() {
      this.o();
   }

   private void n() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         this.o();
      } else {
         if (var1 != this.c) {
            this.o();
            class_1656 var2 = var1.method_31549();
            this.c = var1;
            this.d = var2.field_7478;
            this.e = var2.field_7479;
            this.f = var2.method_7252();
         }

         class_1656 var3 = var1.method_31549();
         var3.field_7478 = true;
         var3.field_7479 = true;
         var3.method_7248(0.05F * this.k());
      }
   }

   private void o() {
      if (this.c != null) {
         class_1656 var1 = this.c.method_31549();
         var1.field_7478 = this.d;
         var1.field_7479 = this.e;
         var1.method_7248(this.f);
         this.c = null;
      }
   }

   public float k() {
      return this.a.d() / 10.0F;
   }

   public float l() {
      return this.b.d() / 10.0F;
   }

   public float m() {
      return 0.05F * this.k();
   }

   public static float a(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
            && var2.field_1724 != null
            && var0.method_5667().equals(var2.field_1724.method_5667())
            && var1 != null
            && var1.m != null
            && var1.m.f()
         ? var1.m.m()
         : 0.05F;
   }

   public static float b(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
            && var2.field_1724 != null
            && var0.method_5667().equals(var2.field_1724.method_5667())
            && var1 != null
            && var1.m != null
            && var1.m.f()
         ? var1.m.l()
         : 1.0F;
   }

   public static boolean c(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
         && var2.field_1724 != null
         && var0.method_5667().equals(var2.field_1724.method_5667())
         && var1 != null
         && var1.m != null
         && var1.m.f();
   }
}
