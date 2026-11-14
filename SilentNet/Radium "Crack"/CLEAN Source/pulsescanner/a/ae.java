package pulsescanner.a;

public class ae implements ad {
   public static float a() {
      float var0;
      return (var0 = (float)((Double)a.field_1690.method_42495().method_41753() * 0.6 + 0.2)) * var0 * var0 * 8.0F;
   }

   public static float b() {
      return (float)((double)a() * 0.15);
   }

   public static float a(float var0) {
      return (float)Math.round(var0 / b());
   }

   public static float b(float var0) {
      return a(var0) * b();
   }
}
