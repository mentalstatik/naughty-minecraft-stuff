package dev.sixseven.d.a;

import dev.sixseven.mixin.MinecraftAccessor;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_310;

public class E extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Items", "What to speed up", "All", "All", "Pearls", "XP Bottles"));

   public E() {
      super("FastUse", "Removes item use cooldowns", dev.sixseven.d.b.c);
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && this.a(var1)) {
         ((MinecraftAccessor)var1).sixsevenclient$setRightClickDelay(0);
      }
   }

   private boolean a(class_310 mc) {
      if (this.a.a("All")) {
         return true;
      } else {
         class_1792 var2 = this.a.a("Pearls") ? class_1802.field_8634 : class_1802.field_8287;
         return mc.field_1724.method_6047().method_31574(var2) || mc.field_1724.method_6079().method_31574(var2);
      }
   }
}
