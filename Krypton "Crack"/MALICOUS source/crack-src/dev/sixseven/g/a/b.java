package dev.sixseven.g.a;

public enum b {
   a {
      @Override
      public float a(float t) {
         return t;
      }
   },
   b {
      @Override
      public float a(float t) {
         float var2 = 1.0F - t;
         return 1.0F - var2 * var2 * var2;
      }
   },
   c {
      @Override
      public float a(float t) {
         return t < 0.5F ? 2.0F * t * t : 1.0F - (float)Math.pow((double)(-2.0F * t + 2.0F), 2.0) / 2.0F;
      }
   };

   public static b[] a() {
      return (b[])d.clone();
   }

   public static b a(String name) {
      return Enum.valueOf(b.class, name);
   }

   public abstract float a(float var1);

   private static b[] b() {
      return new b[]{a, b, c};
   }
}
