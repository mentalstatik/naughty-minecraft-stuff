package dev.sixseven.d.a;

import java.util.Locale;
import java.util.function.DoubleFunction;

public final class P extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Jump", "Jump strength multiplier (10 = vanilla jump)", 10.0, 1.0, 100.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.1fx", var0 / 10.0)))
   );

   public P() {
      super("Jump", "Adjusts the local player's jump height", dev.sixseven.d.b.b);
   }

   public float k() {
      return this.a.d() / 10.0F;
   }
}
