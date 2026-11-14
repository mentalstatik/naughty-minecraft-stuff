package dev.sixseven.d.a;

import java.util.Random;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;

public class aj extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Min Delay", "", 9.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Max Delay", "", 11.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Only Item", "", false));
   public final dev.sixseven.i.f d = this.a(new dev.sixseven.i.f("Item Filter", "", "Sword", "Sword", "Axe", "Hand"));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Only Crit", "", false));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Check Shield", "", false));
   private final Random g = new Random();
   private int h;
   private int i = 10;

   public aj() {
      super("Triggerbot", "Auto-attacks entities on crosshair", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.h = 0;
      this.k();
   }

   @Override
   protected void i() {
      this.h = 0;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 == null) {
         if (var1.field_1765 != null && var1.field_1765.method_17783() == class_240.field_1331) {
            class_1297 var2 = ((class_3966)var1.field_1765).method_17782();
            if (var2 instanceof class_1309 && var2 != var1.field_1724) {
               if (this.c.i()) {
                  if (this.d.a("Sword") && !this.a(var1.field_1724.method_6047().method_7909())) {
                     return;
                  }

                  if (this.d.a("Axe") && !(var1.field_1724.method_6047().method_7909() instanceof class_1743)) {
                     return;
                  }

                  if (this.d.a("Hand") && !var1.field_1724.method_6047().method_7960()) {
                     return;
                  }
               }

               if (!this.e.i() || !var1.field_1724.method_24828() && !(var1.field_1724.field_6017 <= 0.0)) {
                  if (this.f.i() && var2 instanceof class_1657 var3 && var3.method_6039()) {
                     return;
                  }

                  if (!(var1.field_1724.method_7261(0.5F) < 1.0F)) {
                     this.h++;
                     if (this.h >= this.i) {
                        var1.field_1761.method_2918(var1.field_1724, var2);
                        var1.field_1724.method_6104(class_1268.field_5808);
                        this.h = 0;
                        this.k();
                     }
                  }
               }
            }
         } else {
            this.h = 0;
         }
      }
   }

   private boolean a(class_1792 item) {
      return item == class_1802.field_8091
         || item == class_1802.field_8528
         || item == class_1802.field_8371
         || item == class_1802.field_8845
         || item == class_1802.field_8802
         || item == class_1802.field_22022;
   }

   private void k() {
      int var1 = this.a.e();
      int var2 = this.b.e();
      if (var2 < var1) {
         var2 = var1;
      }

      this.i = var1 + (var2 > var1 ? this.g.nextInt(var2 - var1 + 1) : 0);
   }
}
