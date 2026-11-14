package dev.sixseven.n;

public final class c {
   private c() {
   }

   public static int a(int a, int r, int g, int b) {
      return (a & 0xFF) << 24 | (r & 0xFF) << 16 | (g & 0xFF) << 8 | b & 0xFF;
   }

   public static int a(int r, int g, int b) {
      return a(255, r, g, b);
   }

   public static int a(int color, int alpha) {
      return color & 16777215 | (alpha & 0xFF) << 24;
   }

   public static int a(int color, float alpha) {
      return a(color, (int)(Math.clamp(alpha, 0.0F, 1.0F) * 255.0F));
   }

   public static int a(int color) {
      return color >>> 24 & 0xFF;
   }

   public static int b(int color) {
      return color >> 16 & 0xFF;
   }

   public static int c(int color) {
      return color >> 8 & 0xFF;
   }

   public static int d(int color) {
      return color & 0xFF;
   }

   public static int a(int from, int to, float t) {
      t = Math.clamp(t, 0.0F, 1.0F);
      int var3 = (int)((float)a(from) + (float)(a(to) - a(from)) * t);
      int var4 = (int)((float)b(from) + (float)(b(to) - b(from)) * t);
      int var5 = (int)((float)c(from) + (float)(c(to) - c(from)) * t);
      int var6 = (int)((float)d(from) + (float)(d(to) - d(from)) * t);
      return a(var3, var4, var5, var6);
   }

   public static int b(int color, float t) {
      return a(color, a(-1, a(color)), t);
   }

   public static int c(int color, float t) {
      return a(color, a(-16777216, a(color)), t);
   }

   public static float[] e(int argb) {
      float var1 = (float)b(argb) / 255.0F;
      float var2 = (float)c(argb) / 255.0F;
      float var3 = (float)d(argb) / 255.0F;
      float var4 = Math.max(var1, Math.max(var2, var3));
      float var5 = Math.min(var1, Math.min(var2, var3));
      float var6 = var4 - var5;
      float var7;
      if (var6 == 0.0F) {
         var7 = 0.0F;
      } else if (var4 == var1) {
         var7 = 60.0F * ((var2 - var3) / var6 % 6.0F);
      } else if (var4 == var2) {
         var7 = 60.0F * ((var3 - var1) / var6 + 2.0F);
      } else {
         var7 = 60.0F * ((var1 - var2) / var6 + 4.0F);
      }

      if (var7 < 0.0F) {
         var7 += 360.0F;
      }

      float var8 = var4 == 0.0F ? 0.0F : var6 / var4;
      return new float[]{var7, var8, var4};
   }

   public static int a(float h, float s, float v) {
      float var3 = v * s;
      float var4 = var3 * (1.0F - Math.abs(h / 60.0F % 2.0F - 1.0F));
      float var5 = v - var3;
      float var6;
      float var7;
      float var8;
      if (h < 60.0F) {
         var6 = var3;
         var7 = var4;
         var8 = 0.0F;
      } else if (h < 120.0F) {
         var6 = var4;
         var7 = var3;
         var8 = 0.0F;
      } else if (h < 180.0F) {
         var6 = 0.0F;
         var7 = var3;
         var8 = var4;
      } else if (h < 240.0F) {
         var6 = 0.0F;
         var7 = var4;
         var8 = var3;
      } else if (h < 300.0F) {
         var6 = var4;
         var7 = 0.0F;
         var8 = var3;
      } else {
         var6 = var3;
         var7 = 0.0F;
         var8 = var4;
      }

      return a(Math.round((var6 + var5) * 255.0F), Math.round((var7 + var5) * 255.0F), Math.round((var8 + var5) * 255.0F));
   }
}
