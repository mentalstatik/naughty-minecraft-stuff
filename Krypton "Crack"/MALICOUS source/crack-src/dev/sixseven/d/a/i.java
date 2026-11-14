package dev.sixseven.d.a;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;

public final class i extends dev.sixseven.d.c {
   public i() {
      super("Auto Tool", "Selects the best hotbar tool for the block being mined", dev.sixseven.d.b.b);
   }

   public void a(class_2338 var1) {
      class_310 var2 = class_310.method_1551();
      if (this.f() && var1 != null && var2.field_1724 != null && var2.field_1687 != null && var2.field_1755 == null) {
         class_2680 var3 = var2.field_1687.method_8320(var1);
         int var4 = var2.field_1724.method_31548().method_67532();
         double var5 = a(var2.field_1724.method_31548().method_5438(var4), var3);

         for (int var7 = 0; var7 < 9; var7++) {
            class_1799 var8 = var2.field_1724.method_31548().method_5438(var7);
            double var9 = a(var8, var3);
            if (var9 > var5 + 0.001) {
               var5 = var9;
               var4 = var7;
            }
         }

         dev.sixseven.n.e.b(var4);
      }
   }

   private static double a(class_1799 var0, class_2680 var1) {
      if (var0 != null && !var0.method_7960()) {
         double var2 = Math.max(0.0, (double)var0.method_7924(var1));
         double var4 = var2 * 100.0;
         if (var0.method_7951(var1)) {
            var4 += 10000.0;
         }

         class_9304 var6 = var0.method_58657();

         for (Entry var8 : var6.method_57539()) {
            class_5321 var9 = (class_5321)((class_6880)var8.getKey()).method_40230().orElse(null);
            if (var9 != null && var9.method_29177().toString().endsWith(":efficiency")) {
               var4 += (double)var8.getIntValue() * 15.0;
            }
         }

         return var4;
      } else {
         return -1.0;
      }
   }
}
