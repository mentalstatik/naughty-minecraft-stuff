package dev.sixseven.d.a;

import net.minecraft.class_310;

public final class ap extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Speed", "Higher values reset chunks more often", 1.0, 1.0, 10.0, 0.5, "x"));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Delay", "Base pause between chunk resets", 30.0, 1.0, 300.0, 1.0, "s"));
   private long c;

   public ap() {
      super("Reset Chunk", "Rebuilds loaded chunk rendering using the vanilla chunk reload", dev.sixseven.d.b.d);
   }

   @Override
   protected void h() {
      this.c = 0L;
   }

   @Override
   protected void i() {
      this.c = 0L;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1687 != null && var1.field_1755 == null) {
         long var2 = System.nanoTime();
         double var4 = Math.max(2.0, (double)(this.b.d() / this.a.d()));
         long var6 = (long)(var4 * 1.0E9);
         if (this.c == 0L || var2 - this.c >= var6) {
            var1.field_1769.method_3279();
            this.c = var2;
         }
      }
   }
}
