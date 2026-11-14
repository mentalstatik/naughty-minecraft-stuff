package dev.sixseven.d.a;

import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;

public class Q extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Height", "Minimum fall distance before it smashes", 8.0, 3.0, 30.0, 1.0, "m"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Mode", "Dive style", "Direct", "Direct", "Spiral", "Delayed"));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Auto Mace", "Swap to a mace in your hotbar before smashing", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Switch Back", "Return to the previous slot after the smash", false));
   private int e = 1;
   private int f;
   private int g;
   private int h = -1;
   private boolean i;

   public Q() {
      super("Mace Bomber", "Times a fully-charged mace smash on the way down", dev.sixseven.d.b.a);
   }

   @Override
   protected void i() {
      this.k();
      this.g = 0;
      this.h = -1;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 == null) {
         if (this.g > 0) {
            this.g--;
         }

         if (var1.field_1724.method_24828()) {
            this.k();
            this.g = 0;
            this.h = -1;
         } else {
            class_1309 var2 = this.a(var1);
            if (var2 == null) {
               this.k();
            } else {
               if (this.b.a("Spiral")) {
                  this.b(var1);
               } else {
                  this.k();
               }

               if (this.g <= 0
                  && !(var1.field_1724.field_6017 < (double)this.a.d())
                  && (!this.b.a("Delayed") || !(var1.field_1724.method_18798().field_1351 > -0.5))) {
                  if (!var1.field_1724.method_6047().method_31574(class_1802.field_49814)) {
                     if (!this.c.i()) {
                        return;
                     }

                     if (this.h < 0) {
                        this.h = var1.field_1724.method_31548().method_67532();
                     }

                     if (!dev.sixseven.n.e.d(class_1802.field_49814)) {
                        return;
                     }
                  }

                  if (!(var1.field_1724.method_7261(0.5F) < 1.0F)) {
                     var1.field_1761.method_2918(var1.field_1724, var2);
                     var1.field_1724.method_6104(class_1268.field_5808);
                     this.g = 6;
                     if (this.d.i() && this.h >= 0) {
                        dev.sixseven.n.e.c(this.h);
                     }

                     this.h = -1;
                  }
               }
            }
         }
      } else {
         this.k();
      }
   }

   private class_1309 a(class_310 client) {
      if (client.field_1765 != null && client.field_1765.method_17783() == class_240.field_1331) {
         if (!(((class_3966)client.field_1765).method_17782() instanceof class_1309 var3)) {
            return null;
         } else {
            return var3 != client.field_1724 && var3.method_5805() ? var3 : null;
         }
      } else {
         return null;
      }
   }

   private void b(class_310 client) {
      if (--this.f <= 0) {
         this.e = -this.e;
         this.f = 6 + client.field_1724.field_6012 % 7;
      }

      client.field_1690.field_1913.method_23481(this.e < 0);
      client.field_1690.field_1849.method_23481(this.e > 0);
      this.i = true;
   }

   private void k() {
      if (this.i) {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1690 != null) {
            var1.field_1690.field_1913.method_23481(false);
            var1.field_1690.field_1849.method_23481(false);
         }

         this.i = false;
      }
   }
}
