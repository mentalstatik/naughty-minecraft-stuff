package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.Locale;
import java.util.function.DoubleFunction;
import net.minecraft.class_1297;
import net.minecraft.class_310;

public final class af extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Speed", "Movement multiplier (10 = vanilla); water use is controlled below", 10.0, 1.0, 100.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.1fx", var0 / 10.0)))
   );
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Swim Speed", "Also apply the Speed multiplier while touching water", true));

   public af() {
      super("Speed", "Adjusts the local player's movement speed", dev.sixseven.d.b.b);
   }

   public float k() {
      return this.a.d() / 10.0F;
   }

   public static float a(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      if (var0 != null && var2.field_1724 != null && var0.method_5667().equals(var2.field_1724.method_5667()) && var1 != null && var1.i != null && var1.i.f()) {
         boolean var3 = var0.method_5869() || var0.method_74016();
         return var3 && !var1.i.b.i() ? 1.0F : var1.i.k();
      } else {
         return 1.0F;
      }
   }
}
