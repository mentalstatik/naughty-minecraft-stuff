package dev.sixseven.d.a;

import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_9334;
import org.lwjgl.glfw.GLFW;

public class z extends dev.sixseven.d.c {
   public final dev.sixseven.i.e a = this.a(new dev.sixseven.i.e("Activate Key", "", 71));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Swap Delay", "", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Switch Back", "", true));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Switch Delay", "", 0.0, 0.0, 20.0, 1.0));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Move To Slot", "", true));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Elytra Slot", "", 9.0, 1.0, 9.0, 1.0));
   private boolean g;
   private boolean h;
   private int i;
   private boolean j;
   private boolean k;

   public z() {
      super("Elytra Swap", "Swap between Elytra and Chestplate with a keybind", dev.sixseven.d.b.a);
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
         if (this.j) {
            this.i++;
            if (this.i >= this.b.e()) {
               this.a(var1);
               this.j = false;
               if (this.c.i()) {
                  this.k = true;
                  this.i = 0;
               }
            }
         } else if (this.k) {
            this.i++;
            if (this.i >= this.d.e()) {
               this.a(var1);
               this.k = false;
            }
         } else {
            int var2 = this.a.i();
            if (var2 != -1) {
               long var3 = var1.method_22683().method_4490();
               boolean var5 = var2 <= 7 ? GLFW.glfwGetMouseButton(var3, var2) == 1 : GLFW.glfwGetKey(var3, var2) == 1;
               if (var5 && !this.g) {
                  this.j = true;
                  this.i = 0;
               }

               this.g = var5;
            }
         }
      }
   }

   private void a(class_310 client) {
      class_1799 var2 = client.field_1724.method_6118(class_1304.field_6174);
      boolean var3 = var2.method_31574(class_1802.field_8833);
      int var4 = -1;
      if (var3) {
         for (int var5 = 0; var5 < 36; var5++) {
            class_1799 var6 = client.field_1724.method_31548().method_5438(var5);
            class_10192 var7 = (class_10192)var6.method_58694(class_9334.field_54196);
            if (var7 != null && var7.comp_3174() == class_1304.field_6174 && !var6.method_31574(class_1802.field_8833)) {
               var4 = var5;
               break;
            }
         }
      } else {
         if (this.e.i()) {
            int var8 = this.f.e() - 1;
            class_1799 var11 = client.field_1724.method_31548().method_5438(var8);
            if (var11.method_31574(class_1802.field_8833)) {
               var4 = var8;
            }
         }

         if (var4 == -1) {
            for (int var9 = 0; var9 < 36; var9++) {
               if (client.field_1724.method_31548().method_5438(var9).method_31574(class_1802.field_8833)) {
                  var4 = var9;
                  break;
               }
            }
         }
      }

      if (var4 != -1) {
         int var10 = var4 < 9 ? var4 + 36 : var4;
         byte var12 = 6;
         client.field_1761.method_2906(client.field_1724.field_7512.field_7763, var10, 0, class_1713.field_7790, client.field_1724);
         client.field_1761.method_2906(client.field_1724.field_7512.field_7763, var12, 0, class_1713.field_7790, client.field_1724);
         client.field_1761.method_2906(client.field_1724.field_7512.field_7763, var10, 0, class_1713.field_7790, client.field_1724);
         this.h = !var3;
      }
   }

   private void k() {
      this.g = false;
      this.h = false;
      this.i = 0;
      this.j = false;
      this.k = false;
   }
}
