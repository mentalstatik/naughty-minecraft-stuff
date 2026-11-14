package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.Locale;
import java.util.function.DoubleFunction;
import net.minecraft.class_1297;
import net.minecraft.class_310;

public final class D extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Multiplier", "Block breaking speed multiplier", 1.0, 1.0, 25.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.0fx", var0)))
   );

   public D() {
      super("FastBreak", "Increases the local player's block breaking speed", dev.sixseven.d.b.b);
   }

   public float k() {
      return Math.max(1.0F, Math.min(25.0F, this.a.d()));
   }

   public static float a(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
            && var2.field_1724 != null
            && var0.method_5667().equals(var2.field_1724.method_5667())
            && var1 != null
            && var1.o != null
            && var1.o.f()
         ? var1.o.k()
         : 1.0F;
   }
}
