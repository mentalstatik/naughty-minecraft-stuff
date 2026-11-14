package dev.sixseven.d.a;

import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class g extends dev.sixseven.d.c {
   public final dev.sixseven.i.e a = this.a(new dev.sixseven.i.e("Activate Key", "Hold to place + break (default RMB)", 1));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Break Delay", "Ticks between crystal breaks", 1.0, 0.0, 20.0, 1.0, "t"));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Place Delay", "Ticks between crystal places", 1.0, 0.0, 20.0, 1.0, "t"));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Auto Obsidian", "Lay an obsidian base when you're not aiming at one", true));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Obsidian Delay", "Ticks between obsidian placements", 2.0, 0.0, 20.0, 1.0, "t"));
   public final dev.sixseven.i.h f = this.a(
      new dev.sixseven.i.h("Break Range", "Max distance to a crystal you'll break (vanilla reach ~3)", 3.0, 1.0, 6.0, 0.5, "m")
   );
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Switch Back", "Return to your original hotbar slot when released", true));
   private int h;
   private int i;
   private int j;
   private int k = -1;
   private int l = -1;
   private boolean m;

   public g() {
      super("Auto Crystal", "Hold the activate key to place/break crystals; auto-lay obsidian if enabled", dev.sixseven.d.b.a);
   }

   @Override
   protected void h() {
      this.n();
   }

   @Override
   protected void i() {
      this.m();
      this.n();
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1687 != null && var1.field_1755 == null && this.a(var1)) {
         this.m = true;
         this.k();
         if (this.a.i() == 1) {
            var1.field_1690.field_1904.method_23481(false);
         }

         class_239 var5 = var1.field_1765;
         class_3966 var3;
         class_1297 var4;
         if (var1.field_1765 instanceof class_3966 && (var4 = (var3 = (class_3966)var5).method_17782()) instanceof class_1511) {
            class_1511 var7 = (class_1511)var4;
            this.a(var1, var7);
            return;
         }

         class_3965 var2;
         if (var5 instanceof class_3965 && (var2 = (class_3965)var5).method_17783() == class_240.field_1332) {
            class_2338 var6 = var2.method_17777();
            if (a(var1.field_1687, var6)) {
               this.a(var1, var2, var6);
            } else if (this.d.i()) {
               this.b(var1, var2, var6);
            }
         }
      } else {
         this.l();
      }
   }

   private void a(class_310 var1, class_3965 var2, class_2338 var3) {
      class_1511 var4 = b(var1.field_1687, var3);
      if (var4 != null) {
         this.a(var1, var4);
      } else {
         class_1268 var5;
         if (this.i == 0 && c(var1.field_1687, var3) && (var5 = this.a(var1, class_1802.field_8301)) != null) {
            dev.sixseven.n.b.a(var2, var5, true);
            this.i = this.c.e();
         }
      }
   }

   private void b(class_310 var1, class_3965 var2, class_2338 var3) {
      if (this.j == 0) {
         class_2338 var5 = var1.field_1687.method_8320(var3).method_45474() ? var3 : var3.method_10093(var2.method_17780());
         class_1268 var4;
         if (var1.field_1687.method_8320(var5).method_45474() && c(var1.field_1687, var5) && (var4 = this.a(var1, class_1802.field_8281)) != null) {
            dev.sixseven.n.b.a(var2, var4, true);
            this.j = Math.max(1, this.e.e());
         }
      }
   }

   private boolean a(class_310 var1, class_1511 var2) {
      if (this.h != 0) {
         return false;
      } else if (var1.field_1724.method_33571().method_1022(var2.method_73189()) > this.f.i()) {
         return false;
      } else {
         var1.field_1761.method_2918(var1.field_1724, var2);
         var1.field_1724.method_6104(class_1268.field_5808);
         this.h = this.b.e();
         return true;
      }
   }

   private class_1268 a(class_310 var1, class_1792 var2) {
      class_746 var3 = var1.field_1724;
      if (var3.method_6047().method_31574(var2)) {
         return class_1268.field_5808;
      } else if (var3.method_6079().method_31574(var2)) {
         return class_1268.field_5810;
      } else {
         int var4 = dev.sixseven.n.e.b(var2);
         if (var4 < 0) {
            return null;
         } else {
            if (this.k < 0) {
               this.k = var3.method_31548().method_67532();
            }

            this.l = var4;
            dev.sixseven.n.e.b(var4);
            return class_1268.field_5808;
         }
      }
   }

   private static boolean a(class_1937 var0, class_2338 var1) {
      class_2680 var2 = var0.method_8320(var1);
      return var2.method_27852(class_2246.field_10540) || var2.method_27852(class_2246.field_9987);
   }

   private static class_1511 b(class_1937 var0, class_2338 var1) {
      class_2338 var2 = var1.method_10084();
      class_238 var3 = new class_238(
         (double)var2.method_10263() + 0.125,
         (double)var2.method_10264() - 0.1,
         (double)var2.method_10260() + 0.125,
         (double)var2.method_10263() + 0.875,
         (double)var2.method_10264() + 2.5,
         (double)var2.method_10260() + 0.875
      );

      for (class_1511 var6 : var0.method_18467(class_1511.class, var3)) {
         if (var6.method_24515().method_10074().equals(var1)) {
            return var6;
         }
      }

      return null;
   }

   private static boolean c(class_1937 var0, class_2338 var1) {
      class_2338 var2 = var1.method_10084();
      if (!var0.method_8320(var2).method_26215()) {
         return false;
      } else {
         class_238 var3 = new class_238(
            (double)var2.method_10263(),
            (double)var2.method_10264(),
            (double)var2.method_10260(),
            (double)var2.method_10263() + 1.0,
            (double)var2.method_10264() + 2.0,
            (double)var2.method_10260() + 1.0
         );
         return var0.method_18467(class_1297.class, var3).isEmpty();
      }
   }

   private void k() {
      if (this.h > 0) {
         this.h--;
      }

      if (this.i > 0) {
         this.i--;
      }

      if (this.j > 0) {
         this.j--;
      }
   }

   private boolean a(class_310 var1) {
      int var2 = this.a.i();
      if (var2 == -1) {
         return false;
      } else {
         return var2 <= 7 ? GLFW.glfwGetMouseButton(var1.method_22683().method_4490(), var2) == 1 : class_3675.method_15987(var1.method_22683(), var2);
      }
   }

   private void l() {
      if (this.m) {
         this.m();
         this.h = 0;
         this.i = 0;
         this.j = 0;
         this.m = false;
      }
   }

   private void m() {
      class_310 var1 = class_310.method_1551();
      if (this.g.i() && this.k >= 0 && var1.field_1724 != null && (this.l < 0 || var1.field_1724.method_31548().method_67532() == this.l)) {
         dev.sixseven.n.e.b(this.k);
      }

      this.k = -1;
      this.l = -1;
   }

   private void n() {
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = -1;
      this.l = -1;
      this.m = false;
   }
}
