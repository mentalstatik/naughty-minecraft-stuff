package dev.sixseven.d.a;

import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5498;
import org.lwjgl.glfw.GLFW;

public class G extends dev.sixseven.d.c {
   private static G g;
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Mode", "Which entity the mouse rotates.", "Player", "Player", "Camera"));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Toggle Perspective", "Switch to third person on toggle.", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Through Walls", "See through walls — the third-person camera ignores wall collision.", false));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Camera Sensitivity", "How fast the camera moves in Camera mode.", 8.0, 0.0, 10.0, 0.1));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Arrows Control Opposite", "Control the other entity's rotation with the arrow keys.", true));
   public final dev.sixseven.i.h f = this.a(new dev.sixseven.i.h("Arrow Speed", "Rotation speed with the arrow keys.", 4.0, 0.0, 10.0, 0.5));
   private float h;
   private float i;
   private class_5498 j;

   public G() {
      super("FreeLook", "Allows more rotation options in third person.", dev.sixseven.d.b.c);
      g = this;
   }

   public static G k() {
      return g;
   }

   @Override
   protected void h() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null) {
         this.h = var1.field_1724.method_36454();
         this.i = var1.field_1724.method_36455();
         this.j = var1.field_1690.method_31044();
         if (this.j != class_5498.field_26665 && this.b.i()) {
            var1.field_1690.method_31043(class_5498.field_26665);
         }
      }
   }

   @Override
   protected void i() {
      class_310 var1 = class_310.method_1551();
      if (this.j != null && var1.field_1690.method_31044() != this.j && this.b.i()) {
         var1.field_1690.method_31043(this.j);
      }
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null) {
         if (this.e.i()) {
            long var2 = var1.method_22683().method_4490();
            boolean var4 = GLFW.glfwGetKey(var2, 263) == 1;
            boolean var5 = GLFW.glfwGetKey(var2, 262) == 1;
            boolean var6 = GLFW.glfwGetKey(var2, 265) == 1;
            boolean var7 = GLFW.glfwGetKey(var2, 264) == 1;
            int var8 = (int)(this.f.i() * 2.0);

            for (int var9 = 0; var9 < var8; var9++) {
               if (this.a.a("Player")) {
                  if (var4) {
                     this.h -= 0.5F;
                  }

                  if (var5) {
                     this.h += 0.5F;
                  }

                  if (var6) {
                     this.i -= 0.5F;
                  }

                  if (var7) {
                     this.i += 0.5F;
                  }
               } else {
                  float var10 = var1.field_1724.method_36454();
                  float var11 = var1.field_1724.method_36455();
                  if (var4) {
                     var10 -= 0.5F;
                  }

                  if (var5) {
                     var10 += 0.5F;
                  }

                  if (var6) {
                     var11 -= 0.5F;
                  }

                  if (var7) {
                     var11 += 0.5F;
                  }

                  var1.field_1724.method_36456(var10);
                  var1.field_1724.method_36457(var11);
               }
            }
         }

         var1.field_1724.method_36457(class_3532.method_15363(var1.field_1724.method_36455(), -90.0F, 90.0F));
         this.i = class_3532.method_15363(this.i, -90.0F, 90.0F);
      }
   }

   public boolean l() {
      return this.f() && class_310.method_1551().field_1724 != null;
   }

   public boolean m() {
      return this.l() && this.c.i();
   }

   public boolean n() {
      return this.l() && this.a.a("Camera");
   }

   public boolean o() {
      return this.l() && class_310.method_1551().field_1690.method_31044() == class_5498.field_26665 && this.a.a("Player");
   }

   public void a(double deltaX, double deltaY) {
      float var5 = this.d.d();
      if (var5 <= 0.0F) {
         var5 = 1.0F;
      }

      this.h += (float)(deltaX / (double)var5);
      this.i += (float)(deltaY / (double)var5);
      if (Math.abs(this.i) > 90.0F) {
         this.i = this.i > 0.0F ? 90.0F : -90.0F;
      }
   }

   public float p() {
      return this.h;
   }

   public float q() {
      return this.i;
   }
}
