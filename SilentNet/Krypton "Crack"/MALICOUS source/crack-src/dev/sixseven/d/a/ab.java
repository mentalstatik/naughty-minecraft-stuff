package dev.sixseven.d.a;

import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;

public class ab extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Switch Back", "", true));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Axe Priority", "", "Best", "Best", "Nearest"));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Switch Delay", "", 150.0, 0.0, 500.0, 10.0));
   private int d = -1;
   private int e;
   private boolean f;

   public ab() {
      super("Shield Breaker", "Auto-switch to axe when target is blocking", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.k();
   }

   @Override
   protected void i() {
      this.k();
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null) {
         if (this.f) {
            this.e++;
            int var2 = Math.max(1, this.c.e() / 50);
            if (this.e >= var2) {
               dev.sixseven.n.e.c(this.d);
               this.k();
            }
         } else if (var1.field_1765 != null
            && var1.field_1765.method_17783() == class_240.field_1331
            && ((class_3966)var1.field_1765).method_17782() instanceof class_1657 var3
            && var3.method_6039()
            && !(var1.field_1724.method_6047().method_7909() instanceof class_1743)) {
            int var4 = this.a(var1);
            if (var4 != -1) {
               this.d = var1.field_1724.method_31548().method_67532();
               dev.sixseven.n.e.c(var4);
               var1.field_1761.method_2918(var1.field_1724, var3);
               var1.field_1724.method_6104(class_1268.field_5808);
               if (this.a.i()) {
                  this.f = true;
                  this.e = 0;
               } else {
                  this.d = -1;
               }
            }
         }
      }
   }

   private int a(class_310 client) {
      if (this.b.a("Nearest")) {
         for (int var7 = 0; var7 < 9; var7++) {
            if (client.field_1724.method_31548().method_5438(var7).method_7909() instanceof class_1743) {
               return var7;
            }
         }

         return -1;
      } else {
         int var2 = -1;
         float var3 = -1.0F;

         for (int var4 = 0; var4 < 9; var4++) {
            class_1799 var5 = client.field_1724.method_31548().method_5438(var4);
            if (var5.method_7909() instanceof class_1743) {
               float var6 = this.a(var5);
               if (var6 > var3) {
                  var3 = var6;
                  var2 = var4;
               }
            }
         }

         return var2;
      }
   }

   private float a(class_1799 stack) {
      if (stack.method_31574(class_1802.field_22025)) {
         return 5.0F;
      } else if (stack.method_31574(class_1802.field_8556)) {
         return 4.0F;
      } else if (stack.method_31574(class_1802.field_8475)) {
         return 3.0F;
      } else if (stack.method_31574(class_1802.field_8825)) {
         return 2.0F;
      } else if (stack.method_31574(class_1802.field_8062)) {
         return 1.0F;
      } else {
         return stack.method_31574(class_1802.field_8406) ? 0.0F : -1.0F;
      }
   }

   private void k() {
      this.d = -1;
      this.e = 0;
      this.f = false;
   }
}
