package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_490;

public class j extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Delay", "", 1.0, 1.0, 40.0, 1.0));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Force Totem", "Allow hotbar refill while moving", false));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Hotbar Totem", "", false));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Hotbar Slot", "", 1.0, 1.0, 9.0, 1.0));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Hotbar Delay", "", 4.0, 1.0, 40.0, 1.0));
   private int f;
   private int g = -1;

   public j() {
      super("Auto Totem", "Fast offhand refill using vanilla inventory swaps", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      if (SixSevenClient.modules() != null && SixSevenClient.modules().N != null) {
         SixSevenClient.modules().N.a(false);
      }

      this.f = 0;
      this.g = -1;
   }

   @Override
   protected void i() {
      this.f = 0;
      this.g = -1;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && a(var1)) {
         this.f++;
         boolean var2 = this.d(var1);
         boolean var3 = !var2 && this.c.i() && this.e(var1);
         if (!var2 && !var3) {
            this.f = 0;
         } else {
            if (var2 && this.a.e() == 4) {
               this.a.a(Double.valueOf(1.0));
            }

            int var4 = var2 ? this.a.e() : this.e.e();
            if (this.f >= var4) {
               this.f = 0;
               if (var2) {
                  int var6 = g(var1);
                  if (var6 == -1) {
                     var6 = f(var1);
                  }

                  if (var6 != -1) {
                     dev.sixseven.n.e.d(var6);
                  }
               } else {
                  int var5 = f(var1);
                  if (var5 != -1 && (b(var1) || this.b.i())) {
                     dev.sixseven.n.e.a(var5, this.d.e() - 1);
                  }
               }
            }
         }
      }
   }

   private static boolean a(class_310 var0) {
      return var0.field_1755 == null || var0.field_1755 instanceof class_490;
   }

   private static boolean b(class_310 var0) {
      return var0.field_1755 != null || !c(var0);
   }

   private static boolean c(class_310 var0) {
      if (var0.field_1724 == null) {
         return false;
      } else if (!var0.field_1690.field_1894.method_1434()
         && !var0.field_1690.field_1881.method_1434()
         && !var0.field_1690.field_1913.method_1434()
         && !var0.field_1690.field_1849.method_1434()
         && !var0.field_1690.field_1903.method_1434()
         && !var0.field_1724.method_5624()
         && !var0.field_1724.method_5715()) {
         double var1 = var0.field_1724.method_18798().field_1352;
         double var3 = var0.field_1724.method_18798().field_1350;
         return var1 * var1 + var3 * var3 > 0.0025;
      } else {
         return true;
      }
   }

   private boolean d(class_310 var1) {
      return !var1.field_1724.method_6079().method_31574(class_1802.field_8288);
   }

   private boolean e(class_310 var1) {
      int var2 = this.d.e() - 1;
      return !var1.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8288);
   }

   private static int f(class_310 var0) {
      for (int var1 = 9; var1 < 36; var1++) {
         if (var0.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8288)) {
            return var1;
         }
      }

      return -1;
   }

   private static int g(class_310 var0) {
      for (int var1 = 0; var1 < 9; var1++) {
         if (var0.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8288)) {
            return var1;
         }
      }

      return -1;
   }
}
