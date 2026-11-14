package dev.sixseven.d.a;

import dev.sixseven.mixin.MinecraftAccessor;
import net.minecraft.class_310;

public class f extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("While In Screens", "Whether to click while a screen is open.", true));
   public final dev.sixseven.i.f b = this.a(
      new dev.sixseven.i.f("Left Click Mode", "The method of clicking for left clicks.", "Press", "Disabled", "Hold", "Press")
   );
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Left Click Delay", "Delay between left clicks in ticks.", 2.0, 0.0, 60.0, 1.0, " ticks"));
   public final dev.sixseven.i.f d = this.a(
      new dev.sixseven.i.f("Right Click Mode", "The method of clicking for right clicks.", "Press", "Disabled", "Hold", "Press")
   );
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Right Click Delay", "Delay between right clicks in ticks.", 2.0, 0.0, 60.0, 1.0, " ticks"));
   private int f;
   private int g;

   public f() {
      super("AutoClicker", "Automatically clicks.", dev.sixseven.d.b.c);
      this.c.a(() -> this.b.a("Press"));
      this.e.a(() -> this.d.a("Press"));
   }

   @Override
   protected void h() {
      this.f = 0;
      this.g = 0;
      this.k();
   }

   @Override
   protected void i() {
      this.k();
   }

   private void k() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1690 != null) {
         var1.field_1690.field_1886.method_23481(false);
         var1.field_1690.field_1904.method_23481(false);
      }
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && (this.a.i() || var1.field_1755 == null)) {
         String var2 = this.b.i();
         switch (var2) {
            case "Hold":
               var1.field_1690.field_1886.method_23481(true);
               break;
            case "Press":
               this.f++;
               if (this.f > this.c.e()) {
                  this.a(var1);
                  this.f = 0;
               }
         }

         var2 = this.d.i();
         switch (var2) {
            case "Hold":
               var1.field_1690.field_1904.method_23481(true);
               break;
            case "Press":
               this.g++;
               if (this.g > this.e.e()) {
                  this.b(var1);
                  this.g = 0;
               }
         }
      }
   }

   private void a(class_310 mc) {
      if (mc.field_1771 == 10000) {
         mc.field_1771 = 0;
      }

      mc.field_1690.field_1886.method_23481(true);
      ((MinecraftAccessor)mc).sixsevenclient$startAttack();
      mc.field_1690.field_1886.method_23481(false);
   }

   private void b(class_310 mc) {
      ((MinecraftAccessor)mc).sixsevenclient$startUseItem();
   }
}
