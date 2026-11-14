package dev.sixseven.g.b;

import dev.sixseven.SixSevenClient;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public final class d {
   public static final String a = "xuong";
   public static final String b = "vanilla";
   private static d c;
   private final long d = NanoVGGL3.nvgCreate(1);
   private boolean e;
   private boolean f;
   private final List<ByteBuffer> g = new ArrayList<>();
   private String h = "xuong";
   private final ArrayDeque<Float> i = new ArrayDeque<>();
   private float j = 1.0F;

   private d() {
      if (this.d == 0L) {
         throw new IllegalStateException("Failed to create NanoVG context");
      } else {
         this.e = this.a("xuong", "assets/sixsevenclient/fonts/Xuong-Regular.ttf");
         this.f = this.a("vanilla", "assets/sixsevenclient/fonts/Monocraft.ttf");
         if (this.e && this.f) {
            NanoVG.nvgAddFallbackFont(this.d, "xuong", "vanilla");
         }
      }
   }

   public static d a() {
      if (c == null) {
         c = new d();
      }

      return c;
   }

   public long b() {
      return this.d;
   }

   private boolean a(String name, String resourcePath) {
      try {
         boolean var5;
         try (InputStream var3 = d.class.getClassLoader().getResourceAsStream(resourcePath)) {
            if (var3 == null) {
               SixSevenClient.LOGGER.warn("Font resource missing: {}", resourcePath);
               return false;
            }

            byte[] var6 = var3.readAllBytes();
            ByteBuffer var7 = MemoryUtil.memAlloc(var6.length);
            var7.put(var6).flip();
            int var8 = NanoVG.nvgCreateFontMem(this.d, name, var7, false);
            if (var8 == -1) {
               MemoryUtil.memFree(var7);
               SixSevenClient.LOGGER.warn("NanoVG rejected font {}", resourcePath);
               return false;
            }

            this.g.add(var7);
            var5 = true;
         }

         return var5;
      } catch (IOException var11) {
         SixSevenClient.LOGGER.error("Failed to load font {}", resourcePath, var11);
         return false;
      }
   }

   public void a(String mode) {
      this.h = "Xuong".equals(mode) && this.e ? "xuong" : (this.f ? "vanilla" : (this.e ? "xuong" : null));
   }

   public boolean c() {
      return this.h != null;
   }

   public void a(float width, float height, float pixelRatio) {
      this.i.clear();
      this.j = 1.0F;
      NanoVG.nvgBeginFrame(this.d, width, height, pixelRatio);
   }

   public void d() {
      NanoVG.nvgEndFrame(this.d);
   }

   public void e() {
      this.i.push(this.j);
      NanoVG.nvgSave(this.d);
   }

   public void f() {
      if (!this.i.isEmpty()) {
         this.j = this.i.pop();
      }

      NanoVG.nvgRestore(this.d);
   }

   public void a(float s) {
      NanoVG.nvgScale(this.d, s, s);
   }

   public void a(float x, float y) {
      NanoVG.nvgTranslate(this.d, x, y);
   }

   public void b(float a) {
      this.j = this.j * Math.clamp(ax, 0.0F, 1.0F);
      NanoVG.nvgGlobalAlpha(this.d, this.j);
   }

   public void a(float x, float y, float w, float h) {
      NanoVG.nvgIntersectScissor(this.d, x, y, w, hx);
   }

   public void a(float x, float y, float w, float h, float radius, int argb) {
      MemoryStack var7 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgRoundedRect(this.d, x, y, w, hx, radius);
         NanoVG.nvgFillColor(this.d, a(var7, argb));
         NanoVG.nvgFill(this.d);
      } catch (Throwable var11) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var7 != null) {
         var7.close();
      }
   }

   public void a(float x, float y, float w, float h, float radius, int from, int to, boolean vertical) {
      MemoryStack var9 = MemoryStack.stackPush();

      try {
         NVGPaint var10 = NVGPaint.malloc(var9);
         float var11 = vertical ? x : x + w;
         float var12 = vertical ? y + hx : y;
         NanoVG.nvgLinearGradient(this.d, x, y, var11, var12, a(var9, from), a(var9, to), var10);
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgRoundedRect(this.d, x, y, w, hx, radius);
         NanoVG.nvgFillPaint(this.d, var10);
         NanoVG.nvgFill(this.d);
      } catch (Throwable var14) {
         if (var9 != null) {
            try {
               var9.close();
            } catch (Throwable var13) {
               var14.addSuppressed(var13);
            }
         }

         throw var14;
      }

      if (var9 != null) {
         var9.close();
      }
   }

   public void a(float x, float y, float w, float h, float rtl, float rtr, float rbr, float rbl, int from, int to) {
      MemoryStack var11 = MemoryStack.stackPush();

      try {
         NVGPaint var12 = NVGPaint.malloc(var11);
         NanoVG.nvgLinearGradient(this.d, x, y, x, y + hx, a(var11, from), a(var11, to), var12);
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgRoundedRectVarying(this.d, x, y, w, hx, rtl, rtr, rbr, rbl);
         NanoVG.nvgFillPaint(this.d, var12);
         NanoVG.nvgFill(this.d);
      } catch (Throwable var15) {
         if (var11 != null) {
            try {
               var11.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }
         }

         throw var15;
      }

      if (var11 != null) {
         var11.close();
      }
   }

   public void a(float cx, float cy, float size, float stroke, int argb, boolean pointDown) {
      MemoryStack var7 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         if (pointDown) {
            NanoVG.nvgMoveTo(this.d, cx - size, cy - size / 2.0F);
            NanoVG.nvgLineTo(this.d, cx, cy + size / 2.0F);
            NanoVG.nvgLineTo(this.d, cx + size, cy - size / 2.0F);
         } else {
            NanoVG.nvgMoveTo(this.d, cx - size / 2.0F, cy - size);
            NanoVG.nvgLineTo(this.d, cx + size / 2.0F, cy);
            NanoVG.nvgLineTo(this.d, cx - size / 2.0F, cy + size);
         }

         NanoVG.nvgStrokeColor(this.d, a(var7, argb));
         NanoVG.nvgStrokeWidth(this.d, stroke);
         NanoVG.nvgLineCap(this.d, 1);
         NanoVG.nvgLineJoin(this.d, 1);
         NanoVG.nvgStroke(this.d);
      } catch (Throwable var11) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var7 != null) {
         var7.close();
      }
   }

   public void a(float x0, float y0, float x1, float y1, float x2, float y2, int argb) {
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgMoveTo(this.d, x0, y0);
         NanoVG.nvgLineTo(this.d, x1, y1);
         NanoVG.nvgLineTo(this.d, x2, y2);
         NanoVG.nvgClosePath(this.d);
         NanoVG.nvgFillColor(this.d, a(var8, argb));
         NanoVG.nvgFill(this.d);
      } catch (Throwable var12) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   public void b(float x, float y, float w, float h, float radius, float stroke, int argb) {
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgRoundedRect(this.d, x + stroke / 2.0F, y + stroke / 2.0F, w - stroke, hx - stroke, radius);
         NanoVG.nvgStrokeColor(this.d, a(var8, argb));
         NanoVG.nvgStrokeWidth(this.d, stroke);
         NanoVG.nvgStroke(this.d);
      } catch (Throwable var12) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   public void c(float x, float y, float w, float h, float radius, float spread, int argb) {
      MemoryStack var8 = MemoryStack.stackPush();

      try {
         NVGPaint var9 = NVGPaint.malloc(var8);
         NanoVG.nvgBoxGradient(this.d, x, y, w, hx, radius, spread * 2.0F, a(var8, argb), a(var8, dev.sixseven.n.c.a(argb, 0)), var9);
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgRoundedRect(this.d, x - spread, y - spread, w + spread * 2.0F, hx + spread * 2.0F, radius + spread);
         NanoVG.nvgFillPaint(this.d, var9);
         NanoVG.nvgFill(this.d);
      } catch (Throwable var12) {
         if (var8 != null) {
            try {
               var8.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var8 != null) {
         var8.close();
      }
   }

   public void a(float cx, float cy, float r, int argb) {
      MemoryStack var5 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgCircle(this.d, cx, cy, r);
         NanoVG.nvgFillColor(this.d, a(var5, argb));
         NanoVG.nvgFill(this.d);
      } catch (Throwable var9) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var5 != null) {
         var5.close();
      }
   }

   public void a(float cx, float cy, float r, float spread, int argb) {
      MemoryStack var6 = MemoryStack.stackPush();

      try {
         NVGPaint var7 = NVGPaint.malloc(var6);
         NanoVG.nvgRadialGradient(this.d, cx, cy, r * 0.25F, r + spread, a(var6, argb), a(var6, dev.sixseven.n.c.a(argb, 0)), var7);
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgCircle(this.d, cx, cy, r + spread);
         NanoVG.nvgFillPaint(this.d, var7);
         NanoVG.nvgFill(this.d);
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

   public void b(float x1, float y1, float x2, float y2, float width, int argb) {
      MemoryStack var7 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgMoveTo(this.d, x1, y1);
         NanoVG.nvgLineTo(this.d, x2, y2);
         NanoVG.nvgStrokeColor(this.d, a(var7, argb));
         NanoVG.nvgStrokeWidth(this.d, width);
         NanoVG.nvgLineCap(this.d, 1);
         NanoVG.nvgStroke(this.d);
      } catch (Throwable var11) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var7 != null) {
         var7.close();
      }
   }

   public void b(float x, float y, float size, float stroke, int argb) {
      float var6 = x + size * 0.22F;
      float var7 = y + size * 0.55F;
      float var8 = x + size * 0.42F;
      float var9 = y + size * 0.74F;
      float var10 = x + size * 0.78F;
      float var11 = y + size * 0.3F;
      MemoryStack var12 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgMoveTo(this.d, var6, var7);
         NanoVG.nvgLineTo(this.d, var8, var9);
         NanoVG.nvgLineTo(this.d, var10, var11);
         NanoVG.nvgStrokeColor(this.d, a(var12, argb));
         NanoVG.nvgStrokeWidth(this.d, stroke);
         NanoVG.nvgLineCap(this.d, 1);
         NanoVG.nvgLineJoin(this.d, 1);
         NanoVG.nvgStroke(this.d);
      } catch (Throwable var16) {
         if (var12 != null) {
            try {
               var12.close();
            } catch (Throwable var15) {
               var16.addSuppressed(var15);
            }
         }

         throw var16;
      }

      if (var12 != null) {
         var12.close();
      }
   }

   public void c(float x, float y, float size, float stroke, int argb) {
      float var6 = size * 0.3F;
      this.b(x + var6, y + var6, x + size - var6, y + size - var6, stroke, argb);
      this.b(x + size - var6, y + var6, x + var6, y + size - var6, stroke, argb);
   }

   public float a(String str, float x, float y, float size, int argb) {
      return this.a(str, x, y, size, argb, this.h);
   }

   public float a(String str, float x, float y, float size, int argb, String font) {
      if (font == null) {
         return 0.0F;
      } else {
         MemoryStack var7 = MemoryStack.stackPush();

         float var8;
         try {
            NanoVG.nvgFontFace(this.d, font);
            NanoVG.nvgFontSize(this.d, size);
            NanoVG.nvgTextAlign(this.d, 17);
            NanoVG.nvgFillColor(this.d, a(var7, argb));
            var8 = NanoVG.nvgText(this.d, x, y, str) - x;
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

         return var8;
      }
   }

   public float a(String str, float x, float y, float size, int top, int bottom) {
      if (this.h == null) {
         return 0.0F;
      } else {
         MemoryStack var7 = MemoryStack.stackPush();

         float var8;
         try {
            NVGPaint var9 = NVGPaint.malloc(var7);
            NanoVG.nvgLinearGradient(this.d, x, y - size / 2.0F, x, y + size / 2.0F, a(var7, top), a(var7, bottom), var9);
            NanoVG.nvgFontFace(this.d, this.h);
            NanoVG.nvgFontSize(this.d, size);
            NanoVG.nvgTextAlign(this.d, 17);
            NanoVG.nvgFillPaint(this.d, var9);
            var8 = NanoVG.nvgText(this.d, x, y, str) - x;
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

         return var8;
      }
   }

   public void b(String str, float x, float y, float size, int argb) {
      if (this.h != null) {
         MemoryStack var6 = MemoryStack.stackPush();

         try {
            NanoVG.nvgFontFace(this.d, this.h);
            NanoVG.nvgFontSize(this.d, size);
            NanoVG.nvgTextAlign(this.d, 17);
            NanoVG.nvgFontBlur(this.d, 4.0F);
            NanoVG.nvgFillColor(this.d, a(var6, argb));
            NanoVG.nvgText(this.d, x, y, str);
            NanoVG.nvgFontBlur(this.d, 0.0F);
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
   }

   public float a(String str, float x, float y, float size, int argb, float maxWidth) {
      if (this.a(str, size) <= maxWidth) {
         return this.a(str, x, y, size, argb);
      } else {
         String var7 = str;

         while (var7.length() > 1 && this.a(var7 + "…", size) > maxWidth) {
            var7 = var7.substring(0, var7.length() - 1);
         }

         return this.a(var7 + "…", x, y, size, argb);
      }
   }

   public float a(String str, float size) {
      if (this.h == null) {
         return 0.0F;
      } else {
         NanoVG.nvgFontFace(this.d, this.h);
         NanoVG.nvgFontSize(this.d, size);
         NanoVG.nvgTextAlign(this.d, 17);
         return NanoVG.nvgTextBounds(this.d, 0.0F, 0.0F, str, (FloatBuffer)null);
      }
   }

   public void c(float radians) {
      NanoVG.nvgRotate(this.d, radians);
   }

   public void a(int image, float patternX, float patternY, float patternW, float patternH, float x, float y, float w, float h, float alphaMul) {
      if (image > 0) {
         MemoryStack var11 = MemoryStack.stackPush();

         try {
            NVGPaint var12 = NVGPaint.malloc(var11);
            NanoVG.nvgImagePattern(this.d, patternX, patternY, patternW, patternH, 0.0F, image, alphaMul, var12);
            NanoVG.nvgBeginPath(this.d);
            NanoVG.nvgRect(this.d, x, y, w, hx);
            NanoVG.nvgFillPaint(this.d, var12);
            NanoVG.nvgFill(this.d);
         } catch (Throwable var15) {
            if (var11 != null) {
               try {
                  var11.close();
               } catch (Throwable var14) {
                  var15.addSuppressed(var14);
               }
            }

            throw var15;
         }

         if (var11 != null) {
            var11.close();
         }
      }
   }

   public void d(float cx, float cy, float r, float stroke, int argb) {
      MemoryStack var6 = MemoryStack.stackPush();

      try {
         NanoVG.nvgBeginPath(this.d);
         NanoVG.nvgCircle(this.d, cx, cy, r);
         NanoVG.nvgStrokeColor(this.d, a(var6, argb));
         NanoVG.nvgStrokeWidth(this.d, stroke);
         NanoVG.nvgStroke(this.d);
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

   public void a(int image, float x, float y, float w, float h, int tint) {
      if (image > 0) {
         MemoryStack var7 = MemoryStack.stackPush();

         try {
            NVGPaint var8 = NVGPaint.malloc(var7);
            NanoVG.nvgImagePattern(this.d, x, y, w, hx, 0.0F, image, 1.0F, var8);
            var8.innerColor(a(var7, tint));
            NanoVG.nvgBeginPath(this.d);
            NanoVG.nvgRect(this.d, x, y, w, hx);
            NanoVG.nvgFillPaint(this.d, var8);
            NanoVG.nvgFill(this.d);
         } catch (Throwable var11) {
            if (var7 != null) {
               try {
                  var7.close();
               } catch (Throwable var10) {
                  var11.addSuppressed(var10);
               }
            }

            throw var11;
         }

         if (var7 != null) {
            var7.close();
         }
      }
   }

   private static NVGColor a(MemoryStack stack, int argb) {
      return NanoVG.nvgRGBA(
         (byte)dev.sixseven.n.c.b(argb), (byte)dev.sixseven.n.c.c(argb), (byte)dev.sixseven.n.c.d(argb), (byte)dev.sixseven.n.c.a(argb), NVGColor.malloc(stack)
      );
   }
}
