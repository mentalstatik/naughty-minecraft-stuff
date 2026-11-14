package dev.sixseven.d.a;

import net.minecraft.class_1268;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class R extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Wind Burst", "", true));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Breach", "", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Only Sword", "", false));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Only Axe", "", false));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Switch Back", "", true));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Switch Delay", "", 0.0, 0.0, 20.0, 1.0));
   private int g = -1;
   private int h;
   private boolean i;
   private boolean j;

   public R() {
      super("Mace Swap", "Switches to mace when attacking", dev.sixseven.d.b.a);
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
         if (this.i) {
            this.h++;
            if (this.h >= this.f.e()) {
               dev.sixseven.n.e.c(this.g);
               this.k();
            }
         } else {
            long var2 = var1.method_22683().method_4490();
            boolean var4 = GLFW.glfwGetMouseButton(var2, 0) == 1;
            if (var4
               && var1.field_1755 == null
               && var1.field_1765 != null
               && var1.field_1765.method_17783() == class_240.field_1331
               && !(var1.field_1724.method_7261(0.5F) < 1.0F)
               && (!this.c.i() || this.a(var1.field_1724.method_6047().method_7909()))
               && (!this.d.i() || var1.field_1724.method_6047().method_7909() instanceof class_1743)
               && !var1.field_1724.method_6047().method_31574(class_1802.field_49814)
               && dev.sixseven.n.e.b(class_1802.field_49814) != -1) {
               this.g = var1.field_1724.method_31548().method_67532();
               dev.sixseven.n.e.d(class_1802.field_49814);
               class_3966 var5 = (class_3966)var1.field_1765;
               var1.field_1761.method_2918(var1.field_1724, var5.method_17782());
               var1.field_1724.method_6104(class_1268.field_5808);
               if (this.e.i()) {
                  this.i = true;
                  this.h = 0;
               } else {
                  this.g = -1;
               }
            }
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
      this.g = -1;
      this.h = 0;
      this.i = false;
      this.j = false;
   }
}
