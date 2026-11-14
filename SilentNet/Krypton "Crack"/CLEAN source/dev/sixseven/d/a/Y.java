package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_746;

public final class Y extends dev.sixseven.d.c {
   public Y() {
      super("No Stun", "Keep moving normally while eating, drinking, blocking, drawing a bow, or using items", dev.sixseven.d.b.b);
   }

   public static boolean a(class_746 var0) {
      class_310 var1 = class_310.method_1551();
      dev.sixseven.d.d var2 = SixSevenClient.modules();
      return var0 != null
         && var1.field_1724 != null
         && var0.method_5667().equals(var1.field_1724.method_5667())
         && var2 != null
         && var2.l != null
         && var2.l.f();
   }

   public static boolean a(class_310 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      return var0 != null && var0.field_1724 != null && var0.field_1755 instanceof class_465 && var1 != null && var1.l != null && var1.l.f();
   }
}
