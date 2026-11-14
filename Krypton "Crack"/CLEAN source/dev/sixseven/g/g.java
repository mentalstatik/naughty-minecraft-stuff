package dev.sixseven.g;

public final class g {
   private static volatile float a = -1.0F;

   private g() {
   }

   public static void a(float radius) {
      a = radius;
   }

   public static void a() {
      a = -1.0F;
   }

   public static int a(int vanillaValue) {
      float var1 = a;
      return var1 < 0.0F ? vanillaValue : Math.round(Math.clamp(var1, 0.0F, 10.0F));
   }

   public static boolean b() {
      return a >= 0.0F;
   }
}
