package pulsescanner.a;

import net.minecraft.class_1297;
import net.minecraft.class_3532;

public class ak implements ad {
   public float b;
   public float c;

   public float a(ak var1) {
      float var2 = class_3532.method_15393(var1.b - this.b);
      float var3 = var1.c - this.c;
      return (float)Math.hypot((double)Math.abs(var2), (double)Math.abs(var3));
   }

   public float a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public static float c() {
      float var0 = a.field_1773.method_19418().method_19330();

      try {
         if (a.field_1690.method_31044().method_31035()) {
            return class_3532.method_15393(var0 + 180.0F);
         }
      } catch (MatchException var1) {
         throw a(var1);
      }

      return class_3532.method_15393(var0 + 0.0F);
   }

   public ak(class_1297 var1) {
      this.b = var1.method_36454();
      this.c = var1.method_36455();
   }

   public static float d() {
      try {
         if (a.field_1690.method_31044().method_31035()) {
            return -1.0F * a.field_1773.method_19418().method_19329();
         }
      } catch (MatchException var0) {
         throw a(var0);
      }

      return 1.0F * a.field_1773.method_19418().method_19329();
   }

   public ak(float var1, float var2) {
      this.b = var1;
      this.c = var2;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
