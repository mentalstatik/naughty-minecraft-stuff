package dev.sixseven.n;

public final class f {
   private static long a = -1L;
   private static float b = 20.0F;

   private f() {
   }

   public static void a() {
      long var0 = System.nanoTime();
      if (a > 0L) {
         float var2 = (float)(var0 - a) / 1.0E9F;
         if (var2 > 0.05F) {
            float var3 = Math.clamp(20.0F / var2, 0.0F, 20.0F);
            b = b * 0.7F + var3 * 0.3F;
         }
      }

      a = var0;
   }

   public static void b() {
      a = -1L;
      b = 20.0F;
   }

   public static float c() {
      return b;
   }
}
