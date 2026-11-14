package dev.sixseven.d.a;

import dev.sixseven.mixin.AbstractContainerScreenAccessor;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_465;

public class M extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Tick Delay", "", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Hotbar Totem", "", true));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Hotbar Slot", "", 1.0, 1.0, 9.0, 1.0));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Auto Switch To Totem", "", false));
   private int e;

   public M() {
      super("Hover Totem", "Equip totem when hovering over one in inventory", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.e = 0;
   }

   @Override
   protected void i() {
      this.e = 0;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null) {
         if (this.d.i() && this.b.i()) {
            int var2 = this.c.e() - 1;
            if (var1.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8288)) {
               dev.sixseven.n.e.c(var2);
            }
         }

         if (var1.field_1755 instanceof class_465 var3) {
            this.e++;
            if (this.e >= this.a.e()) {
               this.e = 0;
               class_1735 var4 = this.a(var3);
               if (var4 != null && var4.method_7681() && var4.method_7677().method_31574(class_1802.field_8288)) {
                  int var5 = var4.field_7874;
                  var1.field_1761.method_2906(var3.method_17577().field_7763, var5, 0, class_1713.field_7790, var1.field_1724);
                  var1.field_1761.method_2906(var3.method_17577().field_7763, 45, 0, class_1713.field_7790, var1.field_1724);
                  var1.field_1761.method_2906(var3.method_17577().field_7763, var5, 0, class_1713.field_7790, var1.field_1724);
               }
            }
         }
      }
   }

   private class_1735 a(class_465<?> screen) {
      return ((AbstractContainerScreenAccessor)screen).getHoveredSlot();
   }
}
