package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_1297;
import net.minecraft.class_310;

public final class X extends dev.sixseven.d.c {
   public X() {
      super("NoFall", "Prevents fall damage for this WINTER CLIENT player when the server addon is installed", dev.sixseven.d.b.b);
   }

   public static boolean a(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
         && var2.field_1724 != null
         && var0.method_5667().equals(var2.field_1724.method_5667())
         && var1 != null
         && var1.n != null
         && var1.n.f();
   }
}
