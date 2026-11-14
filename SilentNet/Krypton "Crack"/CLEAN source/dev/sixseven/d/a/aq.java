package dev.sixseven.d.a;

import net.minecraft.class_1268;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;

public final class aq extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Lock Camera", "Aim at the placement face while Scaffold places a block", false));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Place Delay", "Ticks between block placement attempts", 1.0, 0.0, 20.0, 1.0, "t"));
   private int c;
   private int d = -1;
   private int e = -1;
   private float f;
   private float g;
   private boolean h;
   private boolean i;

   public aq() {
      super("Scaffold", "Places blocks beneath you while moving", dev.sixseven.d.b.b);
   }

   @Override
   protected void h() {
      this.c = 0;
      this.d = -1;
      this.e = -1;
      this.i = false;
      class_746 var1 = class_310.method_1551().field_1724;
      this.h = var1 != null;
      if (var1 != null) {
         this.f = var1.method_36454();
         this.g = var1.method_36455();
      }
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      if (var2 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1755 == null && this.a(var1)) {
         if (this.c > 0) {
            this.c--;
         } else {
            int var3 = this.a(var2);
            if (var3 >= 0) {
               if (var2.method_31548().method_67532() != var3) {
                  if (this.d < 0) {
                     this.d = var2.method_31548().method_67532();
                  }

                  this.e = var3;
                  dev.sixseven.n.e.b(var3);
               } else if (this.e < 0) {
                  this.e = var3;
               }

               class_2338 var4 = new class_2338(
                  (int)Math.floor(var2.method_23317()), (int)Math.floor(var2.method_23318()) - 1, (int)Math.floor(var2.method_23321())
               );
               if (var1.field_1687.method_8320(var4).method_45474()) {
                  class_3965 var5 = this.a(var1, var2, var4);
                  if (var5 != null) {
                     if (this.a.i()) {
                        this.a(var2, class_243.method_24953(var5.method_17777()));
                     }

                     dev.sixseven.n.b.a(var5, class_1268.field_5808, true);
                     this.c = Math.max(0, this.b.e() - 1);
                  }
               }
            }
         }
      }
   }

   @Override
   protected void i() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 != null && this.d >= 0 && var1.method_31548().method_67532() == this.e) {
         dev.sixseven.n.e.b(this.d);
      }

      if (var1 != null && this.h && this.i) {
         var1.method_36456(this.f);
         var1.method_36457(this.g);
      }

      this.c = 0;
      this.d = -1;
      this.e = -1;
      this.h = false;
      this.i = false;
   }

   private int a(class_746 var1) {
      int var2 = var1.method_31548().method_67532();
      class_1799 var3 = var1.method_31548().method_5438(var2);
      if (!var3.method_7960() && var3.method_7909() instanceof class_1747) {
         return var2;
      } else {
         for (int var4 = 0; var4 < 9; var4++) {
            if (var4 != var2) {
               class_1799 var5 = var1.method_31548().method_5438(var4);
               if (!var5.method_7960() && var5.method_7909() instanceof class_1747) {
                  return var4;
               }
            }
         }

         return -1;
      }
   }

   private boolean a(class_310 var1) {
      return var1.field_1690.field_1894.method_1434()
         || var1.field_1690.field_1881.method_1434()
         || var1.field_1690.field_1913.method_1434()
         || var1.field_1690.field_1849.method_1434()
         || var1.field_1690.field_1903.method_1434();
   }

   private class_3965 a(class_310 var1, class_746 var2, class_2338 var3) {
      class_243 var4 = var2.method_33571();

      for (class_2350 var8 : class_2350.values()) {
         class_2338 var9 = var3.method_10093(var8);
         if (!var1.field_1687.method_8320(var9).method_26215()) {
            class_243 var10 = class_243.method_24953(var9);
            if (!(var4.method_1022(var10) > 4.5)) {
               return new class_3965(var10, var8.method_10153(), var9, false);
            }
         }
      }

      return null;
   }

   private void a(class_746 var1, class_243 var2) {
      class_243 var3 = var1.method_33571();
      double var4 = var2.field_1352 - var3.field_1352;
      double var6 = var2.field_1351 - var3.field_1351;
      double var8 = var2.field_1350 - var3.field_1350;
      float var10 = (float)(Math.toDegrees(Math.atan2(var8, var4)) - 90.0);
      float var11 = (float)(-Math.toDegrees(Math.atan2(var6, Math.sqrt(var4 * var4 + var8 * var8))));
      var1.method_36456(var10);
      var1.method_36457(var11);
      this.i = true;
   }
}
