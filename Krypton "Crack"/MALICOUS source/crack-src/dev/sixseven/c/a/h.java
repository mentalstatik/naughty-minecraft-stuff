package dev.sixseven.c.a;

import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.system.MemoryStack;

public class h extends dev.sixseven.c.a {
   public static final float c = 252.0F;
   public static final float d = 74.0F;
   private static final float e = 54.0F;
   private static final float f = 76.0F;
   private static final float g = 18.0F;
   private static final float h = 36.0F;
   private static final float i = 46.0F;
   private static final float j = 80.0F;
   private final dev.sixseven.d.e.e k;
   private final dev.sixseven.j.a l;
   private final dev.sixseven.m.d m;
   private static final long n = System.nanoTime();

   public h(dev.sixseven.d.e.e module, dev.sixseven.j.a service, dev.sixseven.m.d themes) {
      super("spotify", 0.5F, 0.965F, module::f);
      this.k = module;
      this.l = service;
      this.m = themes;
   }

   private boolean g() {
      return this.k.a.a("Demo");
   }

   private dev.sixseven.j.b h() {
      if (this.g()) {
         long var1 = (System.nanoTime() - n) / 1000000L % 227000L;
         return new dev.sixseven.j.b(true, "Neon Nights", "67 Sound", var1, 227000L, true, true, 0, 70, System.nanoTime());
      } else {
         return this.l.a();
      }
   }

   private boolean i() {
      return this.k.c.i() && this.h().b();
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      return 252.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      return this.i() ? 92.0F : 74.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.j.b var6 = this.h();
      dev.sixseven.m.c var7 = this.m.a();
      if (var6.b() || !this.k.d.i()) {
         vg.c(x, y, w, hx, 13.0F, 8.0F, dev.sixseven.n.c.a(-16777216, 0.3F));
         vg.a(x, y, w, hx, 13.0F, dev.sixseven.n.c.a(-15264995, 0.92F), dev.sixseven.n.c.a(-15856878, 0.92F), true);
         float var8 = x + 10.0F;
         float var9 = y + 10.0F;
         int var10 = this.g() ? -1 : dev.sixseven.g.b.c.a(this.l.b(), var6.i());
         if (!this.g() && var10 > 0) {
            this.a(vg, var10, var8, var9, 54.0F, 8.0F);
         } else {
            this.a(vg, var7, var8, var9, 54.0F);
         }

         if (!var6.b()) {
            vg.a("Nothing playing", x + 76.0F, y + hx / 2.0F, 13.5F, var7.l());
         } else {
            float var11 = this.k.b.i() ? x + w - 84.0F : x + w - 12.0F;
            vg.a(var6.c(), x + 76.0F, y + 20.0F, 14.0F, var7.k(), var11 - (x + 76.0F) - 6.0F);
            vg.a(var6.d(), x + 76.0F, y + 38.0F, 11.5F, var7.l(), var11 - (x + 76.0F) - 6.0F);
            if (this.k.b.i()) {
               float var12 = y + 22.0F;
               int var13 = var7.l();
               this.a(vg, x + w - 76.0F, var12, var13);
               this.b(vg, x + w - 52.0F, var12, var7.d(), var6.g());
               this.b(vg, x + w - 28.0F, var12, var13);
            }

            float var23 = x + 76.0F;
            float var24 = w - 76.0F - 12.0F;
            float var14 = y + 58.0F;
            float var15 = var6.f() > 0L ? Math.clamp((float)var6.a() / (float)var6.f(), 0.0F, 1.0F) : 0.0F;
            vg.a(a(var6.a()), var23, y + 49.0F, 9.5F, var7.m());
            String var16 = a(var6.f());
            vg.a(var16, var23 + var24 - vg.a(var16, 9.5F), y + 49.0F, 9.5F, var7.m());
            vg.a(var23, var14, var24, 4.0F, 2.0F, dev.sixseven.n.c.a(-16777216, 0.5F));
            vg.a(var23, var14, Math.max(4.0F, var24 * var15), 4.0F, 2.0F, var7.a(), var7.d(), false);
            vg.a(var23 + var24 * var15, var14 + 2.0F, 4.0F, -1);
            if (this.k.c.i()) {
               int var17 = var6.j();
               float var18 = Math.clamp((float)(var17 < 0 ? 0 : var17) / 100.0F, 0.0F, 1.0F);
               float var19 = x + 36.0F;
               float var20 = w - 36.0F - 46.0F;
               float var21 = y + 80.0F - 2.0F;
               this.a(vg, x + 18.0F, y + 80.0F, var7.l(), var17 == 0);
               vg.a(var19, var21, var20, 4.0F, 2.0F, dev.sixseven.n.c.a(-16777216, 0.5F));
               vg.a(var19, var21, Math.max(4.0F, var20 * var18), 4.0F, 2.0F, var7.a(), var7.d(), false);
               vg.a(var19 + var20 * var18, y + 80.0F, 4.0F, -1);
               String var22 = var17 < 0 ? "--" : var17 + "%";
               vg.a(var22, x + w - vg.a(var22, 9.5F) - 12.0F, y + 80.0F, 9.5F, var7.m());
            }
         }
      }
   }

   private void a(dev.sixseven.g.b.d vg, float cx, float cy, int color, boolean muted) {
      long var6 = vg.b();
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         NVGColor var9 = NanoVG.nvgRGBA(
            (byte)dev.sixseven.n.c.b(color),
            (byte)dev.sixseven.n.c.c(color),
            (byte)dev.sixseven.n.c.d(color),
            (byte)dev.sixseven.n.c.a(color),
            NVGColor.malloc(var8)
         );
         vg.a(cx - 7.0F, cy - 3.0F, 5.0F, 6.0F, 1.0F, color);
         NanoVG.nvgFillColor(var6, var9);
         NanoVG.nvgBeginPath(var6);
         NanoVG.nvgMoveTo(var6, cx - 6.0F, cy);
         NanoVG.nvgLineTo(var6, cx + 2.0F, cy - 7.0F);
         NanoVG.nvgLineTo(var6, cx + 2.0F, cy + 7.0F);
         NanoVG.nvgClosePath(var6);
         NanoVG.nvgFill(var6);
         NanoVG.nvgStrokeColor(var6, var9);
         NanoVG.nvgStrokeWidth(var6, 1.7F);
         NanoVG.nvgLineCap(var6, 1);
         if (muted) {
            NanoVG.nvgBeginPath(var6);
            NanoVG.nvgMoveTo(var6, cx + 5.0F, cy - 3.5F);
            NanoVG.nvgLineTo(var6, cx + 10.0F, cy + 3.5F);
            NanoVG.nvgMoveTo(var6, cx + 10.0F, cy - 3.5F);
            NanoVG.nvgLineTo(var6, cx + 5.0F, cy + 3.5F);
            NanoVG.nvgStroke(var6);
         } else {
            for (float var13 : new float[]{4.5F, 8.0F}) {
               NanoVG.nvgBeginPath(var6);
               NanoVG.nvgArc(var6, cx + 2.0F, cy, var13, -0.6F, 0.6F, 2);
               NanoVG.nvgStroke(var6);
            }
         }
      } catch (Throwable var15) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }
         }

         throw var15;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   private static String a(long ms) {
      long var2 = ms / 1000L;
      return String.format("%d:%02d", var2 / 60L, var2 % 60L);
   }

   private void a(dev.sixseven.g.b.d vg, int image, float x, float y, float size, float radius) {
      MemoryStack var7 = MemoryStack.stackPush();

      try {
         long var8 = vg.b();
         NVGPaint var10 = NVGPaint.malloc(var7);
         NanoVG.nvgImagePattern(var8, x, y, size, size, 0.0F, image, 1.0F, var10);
         NanoVG.nvgBeginPath(var8);
         NanoVG.nvgRoundedRect(var8, x, y, size, size, radius);
         NanoVG.nvgFillPaint(var8, var10);
         NanoVG.nvgFill(var8);
      } catch (Throwable var12) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var7 != null) {
         var7.close();
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float x, float y, float size) {
      float var6 = x + size / 2.0F;
      float var7 = y + size / 2.0F;
      vg.a(x, y, size, size, 8.0F, dev.sixseven.n.c.a(-16119795, 0.9F));
      vg.a(var6, var7, size * 0.4F, -15330789);
      vg.d(var6, var7, size * 0.3F, 1.0F, dev.sixseven.n.c.a(theme.a(), 0.35F));
      vg.d(var6, var7, size * 0.22F, 1.0F, dev.sixseven.n.c.a(theme.a(), 0.25F));
      vg.a(var6, var7, size * 0.12F, theme.a());
      vg.a("W", var6 - vg.a("W", 9.0F) / 2.0F, var7, 9.0F, -1, -11689985);
   }

   private void a(dev.sixseven.g.b.d vg, float cx, float cy, int color) {
      this.a(vg, cx + 4.0F, cy, -7.0F, color);
      vg.a(cx - 7.0F, cy - 5.5F, 2.0F, 11.0F, 1.0F, color);
   }

   private void b(dev.sixseven.g.b.d vg, float cx, float cy, int color) {
      this.a(vg, cx - 4.0F, cy, 7.0F, color);
      vg.a(cx + 5.0F, cy - 5.5F, 2.0F, 11.0F, 1.0F, color);
   }

   private void b(dev.sixseven.g.b.d vg, float cx, float cy, int color, boolean playing) {
      vg.d(cx, cy, 10.0F, 1.4F, color);
      if (playing) {
         vg.a(cx - 3.5F, cy - 4.5F, 2.4F, 9.0F, 1.2F, color);
         vg.a(cx + 1.1F, cy - 4.5F, 2.4F, 9.0F, 1.2F, color);
      } else {
         this.a(vg, cx - 2.5F, cy, 7.0F, color);
      }
   }

   private void a(dev.sixseven.g.b.d vg, float x, float cy, float dir, int color) {
      MemoryStack var6 = MemoryStack.stackPush();

      try {
         long var7 = vg.b();
         NanoVG.nvgBeginPath(var7);
         NanoVG.nvgMoveTo(var7, x, cy - 5.5F);
         NanoVG.nvgLineTo(var7, x, cy + 5.5F);
         NanoVG.nvgLineTo(var7, x + dir, cy);
         NanoVG.nvgClosePath(var7);
         NanoVG.nvgFillColor(
            var7,
            NanoVG.nvgRGBA(
               (byte)dev.sixseven.n.c.b(color),
               (byte)dev.sixseven.n.c.c(color),
               (byte)dev.sixseven.n.c.d(color),
               (byte)dev.sixseven.n.c.a(color),
               NVGColor.malloc(var6)
            )
         );
         NanoVG.nvgFill(var7);
      } catch (Throwable var10) {
         if (var6 != null) {
            try {
               var6.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var6 != null) {
         var6.close();
      }
   }

   @Override
   public boolean b(float lx, float ly) {
      dev.sixseven.j.b var3 = this.h();
      if (!var3.b()) {
         return false;
      } else {
         if (this.k.b.i() && ly >= 10.0F && ly <= 34.0F) {
            if (c(lx, 176.0F)) {
               if (this.g()) {
                  return true;
               }

               this.l.f();
               return true;
            }

            if (c(lx, 200.0F)) {
               if (this.g()) {
                  return true;
               }

               this.l.g();
               return true;
            }

            if (c(lx, 224.0F)) {
               if (this.g()) {
                  return true;
               }

               this.l.e();
               return true;
            }
         }

         float var4 = 76.0F;
         float var5 = 164.0F;
         if (ly >= 52.0F && ly <= 66.0F && lx >= var4 && lx <= var4 + var5 && var3.h()) {
            long var9 = (long)((lx - var4) / var5 * (float)var3.f());
            if (!this.g()) {
               this.l.a(var9);
            }

            return true;
         } else {
            float var6 = 36.0F;
            float var7 = 170.0F;
            if (this.k.c.i() && ly >= 73.0F && ly <= 87.0F && lx >= var6 && lx <= var6 + var7) {
               int var8 = Math.round((lx - var6) / var7 * 100.0F);
               if (!this.g()) {
                  this.l.a(var8);
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   private static boolean c(float lx, float centerX) {
      return Math.abs(lx - centerX) <= 11.0F;
   }
}
