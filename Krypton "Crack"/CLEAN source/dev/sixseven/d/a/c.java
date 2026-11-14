package dev.sixseven.d.a;

import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class c extends dev.sixseven.d.c {
   private static final int f = 40;
   private static final int g = 5;
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Switch Delay", "Ticks to wait before selecting glowstone", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Glowstone Delay", "Ticks to wait before charging the anchor", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Explode Delay", "Minimum ticks to wait before detonating", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Auto Switch Back", "Return to the original hotbar slot after the sequence", true));
   public final dev.sixseven.i.h e = this.a(
      new dev.sixseven.i.h("Switch Back Delay", "Ticks to wait before returning to the original slot", 2.0, 0.0, 20.0, 1.0)
   );
   private int h;
   private int i;
   private class_2338 j;
   private int k = -1;
   private int l = -1;
   private boolean m;
   private int n;

   public c() {
      super("Anchor Macro", "Safely charges and detonates a respawn anchor", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.k();
   }

   @Override
   protected void i() {
      this.l();
      this.m = false;
      this.n = 0;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      long var2 = var1.method_22683().method_4490();
      boolean var4 = GLFW.glfwGetMouseButton(var2, 1) == 1;
      boolean var5 = var4 && !this.m;
      this.m = var4;
      if (var5) {
         this.n = 5;
      } else if (this.n > 0) {
         this.n--;
      }

      if (var1.field_1724 == null || var1.field_1761 == null || var1.field_1687 == null || var1.field_1755 != null) {
         this.l();
         this.n = 0;
      } else if (this.h > 0) {
         if (this.j != null && (this.h >= 5 || dev.sixseven.n.b.a(this.j, class_2246.field_23152))) {
            this.a(var1);
         } else {
            this.l();
         }
      } else if ((var4 || this.n > 0) && var1.field_1765 != null && var1.field_1765.method_17783() == class_240.field_1332) {
         class_3965 var6 = (class_3965)var1.field_1765;
         class_2338 var7 = var6.method_17777();
         if (dev.sixseven.n.b.a(var7, class_2246.field_23152)) {
            this.n = 0;
            this.j = var7.method_10062();
            this.k = var1.field_1724.method_31548().method_67532();
            this.l = this.k;
            if (dev.sixseven.n.b.b(this.j)) {
               this.b(1);
            } else if (dev.sixseven.n.b.a(this.j)) {
               this.b(3);
            } else {
               this.k();
            }
         }
      }
   }

   private void a(class_310 var1) {
      this.i++;
      class_3965 var2 = var1.field_1765 instanceof class_3965 ? (class_3965)var1.field_1765 : null;
      switch (this.h) {
         case 1:
            if (this.i < this.a.e()) {
               return;
            } else if (dev.sixseven.n.b.a(this.j)) {
               this.b(3);
               return;
            } else {
               if (dev.sixseven.n.b.b(this.j) && dev.sixseven.n.e.d(class_1802.field_8801)) {
                  this.l = var1.field_1724.method_31548().method_67532();
                  this.b(2);
                  return;
               }

               this.l();
               return;
            }
         case 2:
            if (this.i < this.b.e()) {
               return;
            } else {
               if (this.a(var2) && dev.sixseven.n.b.b(this.j) && var1.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                  dev.sixseven.n.b.a(var2, true);
                  this.b(3);
                  return;
               }

               this.l();
               return;
            }
         case 3:
            if (this.i < this.c.e()) {
               return;
            } else if (!dev.sixseven.n.b.a(this.j)) {
               if (this.i >= 40) {
                  this.l();
               }

               return;
            } else {
               int var3 = this.k;
               if (var3 >= 0
                  && var3 <= 8
                  && var1.field_1724.method_31548().method_67532() == this.l
                  && !var1.field_1724.method_31548().method_5438(var3).method_31574(class_1802.field_8801)) {
                  dev.sixseven.n.e.c(var3);
                  this.l = var3;
                  this.b(4);
                  return;
               }

               this.l();
               return;
            }
         case 4:
            if (this.i < 1) {
               return;
            } else {
               if (this.a(var2)
                  && dev.sixseven.n.b.a(this.j)
                  && var1.field_1724.method_31548().method_67532() == this.l
                  && !var1.field_1724.method_6047().method_31574(class_1802.field_8801)) {
                  dev.sixseven.n.b.a(var2, true);
                  if (this.d.i() && this.k >= 0) {
                     this.b(5);
                  } else {
                     this.k();
                  }

                  return;
               }

               this.l();
               return;
            }
         case 5:
            if (this.i < this.e.e()) {
               return;
            }

            if (var1.field_1724.method_31548().method_67532() == this.l) {
               dev.sixseven.n.e.c(this.k);
            }

            this.k();
            return;
         default:
            this.k();
      }
   }

   private boolean a(class_3965 var1) {
      return var1 != null && var1.method_17783() == class_240.field_1332 && var1.method_17777().equals(this.j);
   }

   private void b(int var1) {
      this.h = var1;
      this.i = 0;
   }

   private void k() {
      this.h = 0;
      this.i = 0;
      this.j = null;
      this.k = -1;
      this.l = -1;
   }

   private void l() {
      class_310 var1 = class_310.method_1551();
      if (this.d.i() && this.k >= 0 && var1.field_1724 != null && var1.field_1724.method_31548().method_67532() == this.l) {
         dev.sixseven.n.e.c(this.k);
      }

      this.k();
   }
}
