package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import net.minecraft.class_1713;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_490;

public class h extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Delay", "", 4.0, 1.0, 40.0, 1.0));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Force Totem", "", false));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Hotbar Totem", "", false));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Hotbar Slot", "", 1.0, 1.0, 9.0, 1.0));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Hotbar Delay", "", 4.0, 1.0, 40.0, 1.0));
   private int f;

   public h() {
      super("Inv Totem", "Moves totems only while inventory (E) is open — click-based, not world-auto", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      if (SixSevenClient.modules() != null && SixSevenClient.modules().x != null) {
         SixSevenClient.modules().x.a(false);
      }

      this.f = 0;
   }

   @Override
   protected void i() {
      this.f = 0;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 instanceof class_490) {
         this.f++;
         int var2 = this.c.i() && this.b(var1) && !this.a(var1) ? this.e.e() : this.a.e();
         if (this.f >= var2) {
            this.f = 0;
            if (this.c.i() && this.b(var1)) {
               int var6 = c(var1);
               int var5;
               if (var6 != -1 && (var5 = this.d.e() - 1) >= 0 && var5 <= 8) {
                  this.a(var1, var6, var5);
               }
            } else {
               int var4;
               if (this.a(var1) && (var4 = e(var1)) != -1) {
                  this.a(var1, var4);
               }
            }
         }
      }
   }

   private boolean a(class_310 var1) {
      boolean var2 = var1.field_1724.method_6079().method_31574(class_1802.field_8288);
      return !var2;
   }

   private boolean b(class_310 var1) {
      if (!this.c.i()) {
         return false;
      } else {
         int var2 = this.d.e() - 1;
         return !var1.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8288);
      }
   }

   private static int c(class_310 var0) {
      for (int var1 = 9; var1 < 36; var1++) {
         if (var0.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8288)) {
            return var1;
         }
      }

      return -1;
   }

   private static int d(class_310 var0) {
      for (int var1 = 0; var1 < 9; var1++) {
         if (var0.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8288)) {
            return var1;
         }
      }

      return -1;
   }

   private static int e(class_310 var0) {
      int var1 = c(var0);
      return var1 != -1 ? var1 : d(var0);
   }

   private static int b(int var0) {
      return var0 < 9 ? var0 + 36 : var0;
   }

   private void a(class_310 var1, int var2) {
      int var3 = var1.field_1724.field_7512.field_7763;
      int var4 = b(var2);
      var1.field_1761.method_2906(var3, var4, 0, class_1713.field_7790, var1.field_1724);
      var1.field_1761.method_2906(var3, 45, 0, class_1713.field_7790, var1.field_1724);
      var1.field_1761.method_2906(var3, var4, 0, class_1713.field_7790, var1.field_1724);
   }

   private void a(class_310 var1, int var2, int var3) {
      int var4 = var1.field_1724.field_7512.field_7763;
      var1.field_1761.method_2906(var4, var2, var3, class_1713.field_7791, var1.field_1724);
   }
}
