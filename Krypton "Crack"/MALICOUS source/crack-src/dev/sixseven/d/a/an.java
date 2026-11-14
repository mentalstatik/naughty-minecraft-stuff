package dev.sixseven.d.a;

import net.minecraft.class_310;

public final class an extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Delay", "Ticks to wait before respawning", 5.0, 0.0, 40.0, 1.0));
   private int b;
   private boolean c;

   public an() {
      super("AutoRespawn", "Respawn automatically after dying", dev.sixseven.d.b.b);
   }

   @Override
   protected void h() {
      this.b = 0;
      this.c = false;
   }

   @Override
   protected void i() {
      this.b = 0;
      this.c = false;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 == null || var1.field_1755 == null || var1.field_1724.method_6032() > 0.0F) {
         this.b = 0;
         this.c = false;
      } else if (!this.c) {
         if (this.b++ >= this.a.e()) {
            var1.field_1724.method_7331();
            this.c = true;
         }
      }
   }
}
