package dev.sixseven.b;

import dev.sixseven.d.a.J;
import dev.sixseven.mixin.AbstractContainerScreenAccessor;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_465;
import net.minecraft.class_5250;

public class c {
   private static final int a = 8;
   private static final int b = 22;
   private static final int c = 4;
   private static final int d = 12;
   private static final int e = 16;
   private static final int f = 12;
   private static final int g = -3750202;
   private static final int h = -2697514;
   private static final int i = -5263441;
   private static final int j = -1;
   private static final int k = -11184811;
   private static final int l = -7631989;
   private static final int m = -13158601;
   private static final int n = -16777216;
   private static final int o = -12566464;
   private static final int p = -1;
   private static final int q = -96;
   private static final int r = -6250336;
   private final class_465<?> s;
   private final AbstractContainerScreenAccessor t;
   private final J u;

   public c(class_465<?> screen, J mod) {
      this.s = screen;
      this.t = (AbstractContainerScreenAccessor)screen;
      this.u = mod;
   }

   private int a() {
      return 74;
   }

   private int b() {
      return this.a() + 16;
   }

   private int c() {
      int var1 = this.t.getLeftPos() + this.t.getImageWidth() + 6;
      if (var1 + this.b() > this.s.field_22789) {
         int var2 = this.t.getLeftPos() - this.b() - 6;
         if (var2 >= 2) {
            return var2;
         }
      }

      return var1;
   }

   private int d() {
      return this.t.getTopPos();
   }

   private int e() {
      return this.d() + 8 + 12 + 4;
   }

   private int f() {
      return 74;
   }

   private int g() {
      return this.e() + this.f() + 6;
   }

   private int h() {
      return this.g() + 16 + 3;
   }

   private int i() {
      return this.h() + 12 + 5;
   }

   private int j() {
      return this.i() + 16 + 7 - this.d();
   }

   private int a(int i) {
      return this.c() + 8 + ix % 3 * 26;
   }

   private int b(int i) {
      return this.e() + ix / 3 * 26;
   }

   private int k() {
      return this.c() + 8;
   }

   private static boolean a(double mx, double my, int x, int y, int w, int h) {
      return mx >= (double)x && mx < (double)(x + w) && my >= (double)y && my < (double)(y + hx);
   }

   public void a(class_332 g, int mx, int my) {
      if (this.u.f()) {
         class_327 var4 = class_310.method_1551().field_1772;
         int var5 = this.c();
         int var6 = this.d();
         int var7 = this.b();
         int var8 = this.j();
         gx.method_25294(var5 - 1, var6 - 1, var5 + var7 + 1, var6 + var8 + 1, -16777216);
         a(gx, var5, var6, var7, var8, -3750202);
         this.a(gx, var4, class_2561.method_43470("Gamble Rigger"), var5 + var7 / 2, var6 + 8, -12566464, false);
         boolean var9 = this.u.o();

         for (int var10 = 0; var10 < 9; var10++) {
            this.a(gx, var4, var10, mx, my, var9);
         }

         this.a(gx, var4, this.k(), this.g(), this.a(), 16, "Restore", this.u.p(), mx, my);
         boolean var13 = this.u.k() != J.a.a || this.u.l() >= 0;
         this.a(gx, var4, this.k(), this.h(), this.a(), 12, "Reset", var13, mx, my);

         this.a(gx, var4, class_2561.method_43470(switch (this.u.k()) {
            case b -> "Taking... " + this.u.m();
            case c -> "Kept #" + (this.u.l() + 1);
            case d -> "Restoring... " + this.u.m();
            default -> "Pick a slot";
         }), var5 + var7 / 2, this.i(), -12566464, false);
      }
   }

   private void a(class_332 g, class_327 font, int i, int mx, int my, boolean pickable) {
      int var7 = this.a(ix);
      int var8 = this.b(ix);
      boolean var9 = this.u.l() == ix && this.u.k() != J.a.a;
      boolean var10 = pickable && a((double)mx, (double)my, var7, var8, 22, 22);
      class_5250 var11 = class_2561.method_43470(Integer.toString(ix + 1));
      int var12 = var7 + 11;
      int var13 = var8 + 7;
      if (var9) {
         b(gx, var7, var8, 22, 22, -7631989);
         this.a(gx, font, var11, var12, var13, -1, true);
      } else {
         a(gx, var7, var8, 22, 22, var10 ? -2697514 : -3750202);
         int var14 = !pickable ? -6250336 : (var10 ? -96 : -1);
         this.a(gx, font, var11, var12, var13, var14, true);
      }
   }

   private void a(class_332 g, class_327 font, int x, int y, int w, int h, String label, boolean enabled, int mx, int my) {
      boolean var11 = enabled && a((double)mx, (double)my, x, y, w, hx);
      int var12 = !enabled ? -5263441 : (var11 ? -2697514 : -3750202);
      a(gx, x, y, w, hx, var12);
      int var13 = !enabled ? -6250336 : (var11 ? -96 : -1);
      this.a(gx, font, class_2561.method_43470(label), x + w / 2, y + (hx - 8) / 2, var13, true);
   }

   private static void a(class_332 g, int x, int y, int w, int h, int fill) {
      gx.method_25294(x, y, x + w, y + hx, fill);
      gx.method_25294(x, y, x + w, y + 1, -1);
      gx.method_25294(x, y, x + 1, y + hx, -1);
      gx.method_25294(x, y + hx - 1, x + w, y + hx, -11184811);
      gx.method_25294(x + w - 1, y, x + w, y + hx, -11184811);
   }

   private static void b(class_332 g, int x, int y, int w, int h, int fill) {
      gx.method_25294(x, y, x + w, y + hx, fill);
      gx.method_25294(x, y, x + w, y + 1, -13158601);
      gx.method_25294(x, y, x + 1, y + hx, -13158601);
      gx.method_25294(x, y + hx - 1, x + w, y + hx, -1);
      gx.method_25294(x + w - 1, y, x + w, y + hx, -1);
   }

   private void a(class_332 g, class_327 font, class_2561 text, int cx, int y, int color, boolean shadow) {
      gx.method_51439(font, text, cx - font.method_27525(text) / 2, y, color, shadow);
   }

   public boolean a(double mx, double my, int button) {
      if (!this.u.f()) {
         return false;
      } else {
         int var6 = this.c();
         int var7 = this.d();
         if (!a(mx, my, var6, var7, this.b(), this.j())) {
            return false;
         } else {
            if (button == 0) {
               if (this.u.o()) {
                  for (int var8 = 0; var8 < 9; var8++) {
                     if (a(mx, my, this.a(var8), this.b(var8), 22, 22)) {
                        this.u.b(var8);
                        return true;
                     }
                  }
               }

               if (this.u.p() && a(mx, my, this.k(), this.g(), this.a(), 16)) {
                  this.u.q();
                  return true;
               }

               if (a(mx, my, this.k(), this.h(), this.a(), 12)) {
                  this.u.r();
                  return true;
               }
            }

            return true;
         }
      }
   }
}
