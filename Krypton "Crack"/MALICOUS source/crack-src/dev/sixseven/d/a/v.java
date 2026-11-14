package dev.sixseven.d.a;

import java.util.function.DoubleFunction;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class v extends dev.sixseven.d.c {
   private static final double f = 12.0;
   private static final double g = 0.2825;
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("FOV", "Target field of view", 95.0, 30.0, 140.0, 1.0, "°").a((DoubleFunction<String>)(v -> (int)v + "° · " + b((int)v)))
   );
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Smooth", "Ease FOV changes in and out", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("No Sprint Zoom", "Cancel the vanilla sprint / speed FOV punch", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Speed FOV", "Widen the view with your movement speed", false));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Speed Strength", "Extra degrees at full sprint", 12.0, 0.0, 30.0, 1.0, "°"));
   private double h = -1.0;
   private long i = 0L;

   public v() {
      super("CustomFOV", "Overrides the field of view", dev.sixseven.d.b.c);
      dev.sixseven.i.h var1 = this.e;
      dev.sixseven.i.b var2 = this.d;
      var1.a(var2::i);
   }

   public float a(float vanillaSprintMultiplier) {
      class_310 var2 = class_310.method_1551();
      int var3 = (Integer)var2.field_1690.method_41808().method_41753();
      if (var3 <= 0) {
         return vanillaSprintMultiplier;
      } else {
         double var4 = this.f() ? this.a.i() + this.a(var2) : (double)var3;
         long var6 = System.nanoTime();
         double var8 = this.i == 0L ? 0.0 : (double)(var6 - this.i) / 1.0E9;
         this.i = var6;
         if (this.h < 0.0) {
            this.h = (double)var3;
         }

         if (!this.b.i()) {
            this.h = var4;
         } else {
            double var10 = 1.0 - Math.exp(-12.0 * Math.max(0.0, var8));
            this.h = this.h + (var4 - this.h) * var10;
            if (Math.abs(this.h - var4) < 0.05) {
               this.h = var4;
            }
         }

         if (!this.f() && this.h == (double)var3) {
            return vanillaSprintMultiplier;
         } else {
            float var12 = this.f() && this.c.i() ? 1.0F : vanillaSprintMultiplier;
            return (float)(this.h / (double)var3) * var12;
         }
      }
   }

   public double k() {
      return this.h;
   }

   private double a(class_310 mc) {
      if (!this.d.i()) {
         return 0.0;
      } else {
         class_746 var2 = mc.field_1724;
         if (var2 == null) {
            return 0.0;
         } else {
            class_243 var3 = var2.method_18798();
            double var4 = Math.sqrt(var3.field_1352 * var3.field_1352 + var3.field_1350 * var3.field_1350);
            double var6 = Math.min(1.0, var4 / 0.2825);
            return (double)this.e.d() * var6;
         }
      }
   }

   private static String b(int v) {
      if (v <= 45) {
         return "Tunnel";
      } else if (v <= 65) {
         return "Focused";
      } else if (v <= 80) {
         return "Normal";
      } else if (v <= 100) {
         return "Wide";
      } else {
         return v <= 118 ? "Ultra" : "Fisheye";
      }
   }
}
