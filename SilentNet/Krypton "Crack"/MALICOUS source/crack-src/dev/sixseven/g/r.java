package dev.sixseven.g;

import dev.sixseven.d.a.T;
import java.nio.ByteBuffer;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.opengl.GL33C;

public final class r {
   private static final double a = 12.0;
   private static int b = -1;
   private static int c = -1;
   private static int d;
   private static int e;
   private static boolean f;
   private static long g;
   private static double h;
   private static int i;
   private static float j;

   private r() {
   }

   public static void a(dev.sixseven.g.b.d vg, int width, int height, T module) {
      if (width > 0 && height > 0) {
         long var4 = System.nanoTime();
         double var6 = g == 0L ? 0.0 : (double)(var4 - g) / 1.0E9;
         g = var4;
         double var8 = 1.0 - Math.exp(-12.0 * Math.max(0.0, var6));
         h = h + (1.0 - h) * var8;
         if (h > 0.999) {
            h = 1.0;
         }

         if (b == -1 || d != width || e != height) {
            a(vg, width, height);
            f = false;
         }

         double var10 = module.k();
         if (module.d.i() && var6 > 0.0) {
            var10 = Math.pow(var10, var6 * 60.0);
         }

         double var12 = Math.clamp(var10 * h, 0.0, 0.97);
         j = (float)var12;
         if (!f) {
            a(width, height);
            f = true;
            i++;
         } else {
            int var14 = -1;
            float var15 = module.l();
            if (var15 > 0.0F) {
               var14 = dev.sixseven.n.c.a(-1, dev.sixseven.n.c.a(module.m(), 255), var15);
            }

            vg.a((float)width, (float)height, 1.0F);
            vg.e();
            vg.b((float)var12);
            vg.a(c, 0.0F, 0.0F, (float)width, (float)height, var14);
            vg.f();
            vg.d();
            a(width, height);
            i++;
         }
      }
   }

   private static void a(dev.sixseven.g.b.d vg, int width, int height) {
      long var3 = vg.b();
      if (c > 0) {
         NanoVG.nvgDeleteImage(var3, c);
         c = -1;
      }

      if (b != -1) {
         GL33C.glDeleteTextures(b);
      }

      b = GL33C.glGenTextures();
      GL33C.glActiveTexture(33984);
      GL33C.glBindTexture(3553, b);
      GL33C.glTexImage2D(3553, 0, 32856, width, height, 0, 6408, 5121, (ByteBuffer)null);
      GL33C.glTexParameteri(3553, 10241, 9729);
      GL33C.glTexParameteri(3553, 10240, 9729);
      GL33C.glTexParameteri(3553, 10242, 33071);
      GL33C.glTexParameteri(3553, 10243, 33071);
      GL33C.glTexParameteri(3553, 36421, 1);
      d = width;
      e = height;
      c = NanoVGGL3.nvglCreateImageFromHandle(var3, b, width, height, 65544);
   }

   private static void a(int width, int height) {
      GL33C.glActiveTexture(33984);
      GL33C.glBindTexture(3553, b);
      GL33C.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, width, height);
   }

   public static void a() {
      f = false;
      h = 0.0;
      g = 0L;
   }

   public static int b() {
      return i;
   }

   public static float c() {
      return j;
   }
}
