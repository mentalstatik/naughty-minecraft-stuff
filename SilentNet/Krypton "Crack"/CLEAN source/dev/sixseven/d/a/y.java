package dev.sixseven.d.a;

import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class y extends dev.sixseven.d.c {
   public final dev.sixseven.i.e a = this.a(new dev.sixseven.i.e("Activate Key", "Hold to run the combo", 72));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Timing", "Delay between the two blows", 120.0, 40.0, 400.0, 10.0, "ms"));
   public final dev.sixseven.i.h c = this.a(
      new dev.sixseven.i.h("Detonate Slot", "Hotbar slot to hold while detonating (anything but glowstone)", 1.0, 1.0, 9.0, 1.0)
   );
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Re-Place", "Place a fresh anchor for the second blow if the first is consumed", true));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Switch Back", "Return to the previous hotbar slot when done", true));
   private int f;
   private int g;
   private class_2338 h;
   private int i = -1;

   public y() {
      super("Double Anchor", "Two rapid anchor charge→detonate cycles", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.l();
   }

   @Override
   protected void i() {
      this.l();
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1687 != null && var1.field_1755 == null) {
         if (this.f > 0) {
            this.a(var1);
         } else if (this.c(var1) && var1.field_1765 instanceof class_3965 var3 && var3.method_17783() == class_240.field_1332) {
            class_2338 var4 = var3.method_17777();
            if (!dev.sixseven.n.b.a(var4, class_2246.field_23152)) {
               return;
            }

            this.h = var4.method_10062();
            this.i = var1.field_1724.method_31548().method_67532();
            this.f = 1;
            this.g = 0;
            return;
         }
      } else if (this.f != 0) {
         this.l();
      }
   }

   private void a(class_310 client) {
      this.g++;
      class_3965 var3;
      if (client.field_1765 instanceof class_3965 var4) {
         var3 = var4;
      } else {
         var3 = null;
      }

      switch (this.f) {
         case 1:
            if (!this.a(var3)) {
               this.l();
               return;
            }

            if (dev.sixseven.n.b.b(this.h)) {
               dev.sixseven.n.e.d(class_1802.field_8801);
               dev.sixseven.n.b.a(var3, true);
            }

            this.b(2);
            break;
         case 2:
            if (!this.a(var3)) {
               this.l();
               return;
            }

            dev.sixseven.n.e.c(this.c.e() - 1);
            dev.sixseven.n.b.a(var3, true);
            this.b(3);
            break;
         case 3:
            if (this.g >= this.k()) {
               this.b(4);
            }
            break;
         case 4:
            if (dev.sixseven.n.b.a(this.h, class_2246.field_23152)) {
               if (this.a(var3) && dev.sixseven.n.b.b(this.h)) {
                  dev.sixseven.n.e.d(class_1802.field_8801);
                  dev.sixseven.n.b.a(var3, true);
               }

               this.b(5);
            } else if (this.d.i() && var3 != null && dev.sixseven.n.e.b(class_1802.field_23141) >= 0) {
               dev.sixseven.n.e.d(class_1802.field_23141);
               dev.sixseven.n.b.a(var3, true);
               this.h = var3.method_17777().method_10093(var3.method_17780()).method_10062();
               this.b(6);
            } else {
               this.b(client);
            }
            break;
         case 5:
            if (this.a(var3) && dev.sixseven.n.b.a(this.h, class_2246.field_23152)) {
               dev.sixseven.n.e.c(this.c.e() - 1);
               dev.sixseven.n.b.a(var3, true);
            }

            this.b(client);
            break;
         case 6:
            if (dev.sixseven.n.b.a(this.h, class_2246.field_23152)) {
               dev.sixseven.n.e.d(class_1802.field_8801);
               if (var3 != null) {
                  dev.sixseven.n.b.a(var3, true);
               }

               this.b(5);
            } else {
               this.b(client);
            }
            break;
         default:
            this.b(client);
      }
   }

   private boolean a(class_3965 live) {
      return live != null && live.method_17783() == class_240.field_1332 && live.method_17777().equals(this.h);
   }

   private void b(int next) {
      this.f = next;
      this.g = 0;
   }

   private int k() {
      return Math.max(1, this.b.e() / 50);
   }

   private void b(class_310 client) {
      if (this.e.i() && this.i >= 0) {
         dev.sixseven.n.e.c(this.i);
      }

      this.l();
   }

   private boolean c(class_310 client) {
      int var2 = this.a.i();
      if (var2 == -1) {
         return false;
      } else {
         long var3 = client.method_22683().method_4490();
         return var2 <= 7 ? GLFW.glfwGetMouseButton(var3, var2) == 1 : GLFW.glfwGetKey(var3, var2) == 1;
      }
   }

   private void l() {
      this.f = 0;
      this.g = 0;
      this.h = null;
      this.i = -1;
   }
}
