package dev.sixseven.b.a;

import dev.sixseven.SixSevenClient;
import dev.sixseven.n.h;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;

public class a {
   private static final float a = 600.0F;
   private static final float b = 64.0F;
   private static final float c = 38.0F;
   private static final float d = 60.0F;
   private static final float e = 8.0F;
   private static final float f = 18.0F;
   private static final float g = 16.0F;
   private static final int h = -45730;
   private static final int i = -37252;
   private final dev.sixseven.g.a.a j = new dev.sixseven.g.a.a(160.0F, 0.0F);
   private boolean k;
   private float l;
   private float m;
   private float n;
   private final List<a.d> o = new ArrayList<>();
   private float p;
   private float q;
   private float r;
   private int s = -1;
   private final StringBuilder t = new StringBuilder();
   private a.c u;
   private float v;
   private float w;
   private float x;
   private float y;
   private float z;
   private float A;
   private float B;
   private float C;
   private float D;
   private float E;
   private float F;
   private float G;

   public boolean a() {
      return this.k;
   }

   public void b() {
      this.k = true;
      this.j.a(1.0F);
   }

   public void c() {
      this.k = false;
      this.j.a(0.0F);
      this.i();
      this.u = null;
   }

   public boolean d() {
      return this.k && this.s >= 0;
   }

   private dev.sixseven.a.b e() {
      return SixSevenClient.configStore();
   }

   public void a(dev.sixseven.g.b.d vg, float mx, float my, float uiWidth, float uiHeight) {
      float var6 = this.j.b();
      if (!(var6 <= 0.002F) || this.k) {
         dev.sixseven.m.c var7 = SixSevenClient.themes().a();
         vg.a(0.0F, 0.0F, uiWidth, uiHeight, 0.0F, dev.sixseven.n.c.a(-16316918, 0.55F * var6));
         vg.e();
         vg.b(var6);
         float var8 = 0.97F + 0.03F * var6;
         vg.a(uiWidth / 2.0F, uiHeight / 2.0F);
         vg.a(var8);
         vg.a(-uiWidth / 2.0F, -uiHeight / 2.0F);
         dev.sixseven.a.b var9 = this.e();
         this.n = 434.0F;
         this.l = (uiWidth - 600.0F) / 2.0F;
         this.m = (uiHeight - this.n) / 2.0F;
         vg.c(this.l, this.m, 600.0F, this.n, 18.0F, 22.0F, dev.sixseven.n.c.a(-16777216, 0.45F));
         vg.a(this.l, this.m, 600.0F, this.n, 18.0F, 18.0F, 18.0F, 18.0F, var7.f(), var7.g());
         vg.b(this.l, this.m, 600.0F, this.n, 18.0F, 1.2F, dev.sixseven.n.c.a(var7.a(), 0.3F));
         this.a(vg, var7, mx, my);
         this.o.clear();
         float var10 = this.m + 64.0F;

         for (int var11 = 0; var11 < 5; var11++) {
            this.a(vg, var7, var9.b(var11), this.l + 18.0F, var10, 564.0F, mx, my, var9.b() == var11);
            var10 += 68.0F;
         }

         this.a(vg, var7);
         if (this.u != null) {
            this.a(vg, var7, mx, my, uiWidth, uiHeight);
         }

         vg.f();
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float mx, float my) {
      float var5 = this.l + 18.0F;
      float var6 = this.m + 22.0F;
      vg.a(var5 + 4.0F, var6 + 3.0F, 15.0F, 12.0F, 3.0F, dev.sixseven.n.c.a(theme.a(), 0.45F));
      vg.a(var5, var6, 15.0F, 12.0F, 3.0F, theme.d());
      vg.a("Configs", var5 + 28.0F, this.m + 26.0F, 19.0F, theme.k());
      vg.a("Save, activate & share your full client setup", var5 + 28.0F, this.m + 44.0F, 12.0F, theme.l());
      this.r = 16.0F;
      this.p = this.l + 600.0F - 18.0F - this.r;
      this.q = this.m + 20.0F;
      boolean var7 = mx >= this.p - 4.0F && mx <= this.p + this.r + 4.0F && my >= this.q - 4.0F && my <= this.q + this.r + 4.0F;
      if (var7) {
         vg.a(this.p - 5.0F, this.q - 5.0F, this.r + 10.0F, this.r + 10.0F, 6.0F, dev.sixseven.n.c.a(theme.a(), 0.18F));
      }

      vg.c(this.p, this.q, this.r, 1.8F, var7 ? theme.d() : theme.l());
      vg.a(this.l + 18.0F, this.m + 64.0F - 2.0F, 564.0F, 1.0F, 0.5F, dev.sixseven.n.c.a(theme.a(), 0.2F));
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, dev.sixseven.a.b.b slot, float x, float y, float w, float mx, float my, boolean active) {
      boolean var10 = mx >= xx && mx <= xx + wx && my >= yx && my <= yx + 60.0F;
      int var11 = active ? theme.j() : dev.sixseven.n.c.a(-16777216, var10 ? 0.32F : 0.22F);
      vg.a(xx, yx, wx, 60.0F, 12.0F, var11);
      if (active) {
         vg.a(xx, yx + 10.0F, 3.0F, 40.0F, 1.5F, theme.d());
         vg.b(xx, yx, wx, 60.0F, 12.0F, 1.1F, dev.sixseven.n.c.a(theme.a(), 0.5F));
      }

      float var12 = xx + 16.0F;
      float var13 = yx + 30.0F;
      if (active) {
         vg.a(var12, var13, 4.0F, 5.0F, theme.a());
         vg.a(var12, var13, 4.0F, theme.d());
      } else if (slot.c()) {
         vg.a(var12, var13, 3.5F, theme.n());
      } else {
         vg.d(var12, var13, 3.5F, 1.2F, theme.o());
      }

      float var14 = xx + 32.0F;
      if (this.s == slot.a()) {
         this.a(vg, theme, var14, yx + 12.0F, 190.0F);
      } else {
         vg.a(slot.b(), var14, yx + 22.0F, 15.0F, theme.k(), 200.0F);
         if (active) {
            float var15 = vg.a(slot.b(), 15.0F);
            this.a(vg, theme, var14 + Math.min(var15, 200.0F) + 8.0F, yx + 22.0F, "ACTIVE");
         }
      }

      String var16 = this.s == slot.a() ? "Enter to confirm · Esc to cancel" : (slot.c() ? "Saved · " + a(slot.d()) : "Empty slot");
      vg.a(var16, var14, yx + 40.0F, 11.5F, theme.l());
      this.a(vg, theme, slot, xx + wx - 16.0F, yx, mx, my);
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float x, float y, float w) {
      float var6 = 20.0F;
      vg.a(xx, yx, wx, var6, var6 / 2.0F, dev.sixseven.n.c.a(-16777216, 0.5F));
      vg.b(xx, yx, wx, var6, var6 / 2.0F, 1.2F, dev.sixseven.n.c.a(theme.d(), 0.9F));
      float var7 = xx + 8.0F;
      float var8 = yx + var6 / 2.0F;
      float var9 = vg.a(this.t.toString(), var7, var8, 12.5F, theme.k());
      if (System.nanoTime() / 400000000L % 2L == 0L) {
         vg.a(var7 + var9 + 1.5F, var8 - 6.0F, 1.4F, 12.0F, 0.7F, theme.d());
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float x, float y, String label) {
      float var6 = vg.a(label, 9.5F);
      vg.a(xx, yx - 7.0F, var6 + 12.0F, 14.0F, 7.0F, dev.sixseven.n.c.a(theme.a(), 0.22F));
      vg.a(label, xx + 6.0F, yx, 9.5F, theme.d());
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, dev.sixseven.a.b.b slot, float rowRight, float rowY, float mx, float my) {
      ArrayList var8 = new ArrayList();

      record a(a.b a, String b, boolean c, boolean d) {
      }

      if (slot.c()) {
         var8.add(new a(a.b.a, "Activate", true, false));
         var8.add(new a(a.b.b, "Save", false, false));
         var8.add(new a(a.b.c, "Rename", false, false));
         var8.add(new a(a.b.d, "Export", false, false));
         var8.add(new a(a.b.e, "Import", false, false));
         var8.add(new a(a.b.f, "Delete", false, true));
      } else {
         var8.add(new a(a.b.b, "Save", true, false));
         var8.add(new a(a.b.e, "Import", false, false));
      }

      float var9 = 26.0F;
      float var10 = 11.0F;
      float var11 = 6.0F;
      float var12 = 12.0F;
      float var13 = 0.0F;
      float[] var14 = new float[var8.size()];

      for (int var15 = 0; var15 < var8.size(); var15++) {
         var14[var15] = vg.a(((a)var8.get(var15)).b(), var12) + var10 * 2.0F;
         var13 += var14[var15] + (var15 > 0 ? var11 : 0.0F);
      }

      float var21 = rowRight - var13;
      float var16 = rowY + (60.0F - var9) / 2.0F;

      for (int var17 = 0; var17 < var8.size(); var17++) {
         a var18 = (a)var8.get(var17);
         float var19 = var14[var17];
         boolean var20 = mx >= var21 && mx <= var21 + var19 && my >= var16 && my <= var16 + var9;
         this.a(vg, theme, var21, var16, var19, var9, var18.b(), var12, var18.c(), var20, var18.d());
         this.o.add(new a.d(var18.a(), slot.a(), var21, var16, var19, var9, var18.c()));
         var21 += var19 + var11;
      }
   }

   private void a(
      dev.sixseven.g.b.d vg,
      dev.sixseven.m.c theme,
      float x,
      float y,
      float w,
      float h,
      String label,
      float font,
      boolean primary,
      boolean hover,
      boolean danger
   ) {
      int var12 = danger ? -45730 : theme.a();
      int var13 = danger ? -37252 : theme.d();
      if (primary) {
         int var14 = hover ? dev.sixseven.n.c.b(var13, 0.1F) : var13;
         vg.a(xx, yx, wx, hx, hx / 2.0F, var14, var12, true);
         if (hover) {
            vg.c(xx, yx, wx, hx, hx / 2.0F, 5.0F, dev.sixseven.n.c.a(var12, 0.35F));
         }

         vg.a(label, xx + (wx - vg.a(label, font)) / 2.0F, yx + hx / 2.0F, font, -15593706);
      } else {
         vg.a(xx, yx, wx, hx, hx / 2.0F, dev.sixseven.n.c.a(-1, hover ? 0.12F : 0.06F));
         vg.b(xx, yx, wx, hx, hx / 2.0F, 1.0F, dev.sixseven.n.c.a(hover ? var13 : var12, hover ? 0.7F : 0.28F));
         int var15 = danger ? dev.sixseven.n.c.a(var12, 0.85F) : theme.l();
         vg.a(label, xx + (wx - vg.a(label, font)) / 2.0F, yx + hx / 2.0F, font, hover ? (danger ? var13 : theme.k()) : var15);
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme) {
      float var3 = this.m + this.n - 19.0F;
      vg.a("Export copies to your clipboard & a file · Import pastes it", this.l + 18.0F, var3, 11.0F, theme.l());
      String var4 = "v1";
      vg.a(var4, this.l + 600.0F - 18.0F - vg.a(var4, 11.0F), var3, 11.0F, theme.m());
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme, float mx, float my, float uiWidth, float uiHeight) {
      vg.a(this.l, this.m, 600.0F, this.n, 18.0F, dev.sixseven.n.c.a(-16316918, 0.55F));
      this.F = 380.0F;
      this.G = 148.0F;
      this.D = (uiWidth - this.F) / 2.0F;
      this.E = (uiHeight - this.G) / 2.0F;
      boolean var7 = this.u.a() == a.b.f;
      vg.c(this.D, this.E, this.F, this.G, 16.0F, 20.0F, dev.sixseven.n.c.a(-16777216, 0.5F));
      vg.a(this.D, this.E, this.F, this.G, 16.0F, 16.0F, 16.0F, 16.0F, theme.h(), theme.f());
      vg.b(this.D, this.E, this.F, this.G, 16.0F, 1.2F, dev.sixseven.n.c.a(var7 ? -45730 : theme.a(), 0.45F));
      vg.a(this.u.c(), this.D + 22.0F, this.E + 34.0F, 16.0F, theme.k());
      vg.a(this.u.d(), this.D + 22.0F, this.E + 58.0F, 12.0F, theme.l());
      float var8 = 30.0F;
      float var9 = 10.0F;
      float var10 = this.E + this.G - var8 - 20.0F;
      this.x = 118.0F;
      this.B = 92.0F;
      this.y = var8;
      this.C = var8;
      this.v = this.D + this.F - 22.0F - this.x;
      this.w = var10;
      this.z = this.v - var9 - this.B;
      this.A = var10;
      boolean var11 = mx >= this.v && mx <= this.v + this.x && my >= var10 && my <= var10 + var8;
      boolean var12 = mx >= this.z && mx <= this.z + this.B && my >= var10 && my <= var10 + var8;
      this.a(vg, theme, this.z, this.A, this.B, this.C, "Cancel", 12.5F, false, var12, false);
      this.a(vg, theme, this.v, this.w, this.x, this.y, this.f(), 12.5F, true, var11, var7);
   }

   private String f() {
      return switch (this.u.a()) {
         case e -> "Import";
         case f -> "Delete";
         default -> "Overwrite";
      };
   }

   public boolean a(float mx, float my, int button) {
      if (!this.k) {
         return false;
      } else {
         if (this.s >= 0) {
            this.h();
         }

         if (this.u != null) {
            if (this.a(mx, my, this.v, this.w, this.x, this.y)) {
               this.g();
            } else if (this.a(mx, my, this.z, this.A, this.B, this.C) || !this.a(mx, my, this.D, this.E, this.F, this.G)) {
               this.u = null;
               dev.sixseven.n.h.d();
            }

            return true;
         } else if (mx >= this.p - 5.0F && mx <= this.p + this.r + 5.0F && my >= this.q - 5.0F && my <= this.q + this.r + 5.0F) {
            this.c();
            dev.sixseven.n.h.b();
            return true;
         } else {
            for (a.d var5 : this.o) {
               if (var5.a(mx, my)) {
                  this.a(var5.a, var5.b);
                  return true;
               }
            }

            if (mx < this.l || mx > this.l + 600.0F || my < this.m || my > this.m + this.n) {
               this.c();
               dev.sixseven.n.h.b();
            }

            return true;
         }
      }
   }

   public boolean a(int keyCode) {
      if (!this.k) {
         return false;
      } else if (this.s >= 0) {
         switch (keyCode) {
            case 256:
               this.i();
               break;
            case 257:
            case 335:
               this.h();
               break;
            case 259:
               if (this.t.length() > 0) {
                  this.t.deleteCharAt(this.t.length() - 1);
               }
         }

         return true;
      } else if (this.u != null) {
         switch (keyCode) {
            case 256:
               this.u = null;
               dev.sixseven.n.h.d();
               break;
            case 257:
            case 335:
               this.g();
         }

         return true;
      } else if (keyCode == 256) {
         this.c();
         dev.sixseven.n.h.b();
         return true;
      } else {
         return true;
      }
   }

   public boolean b(int codepoint) {
      if (this.k && this.s >= 0) {
         if (this.t.length() >= 24) {
            return true;
         } else {
            char var2 = (char)codepoint;
            if (var2 >= ' ' && var2 < 127) {
               this.t.append(var2);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private void a(a.b action, int slot) {
      dev.sixseven.a.b var3 = this.e();
      switch (action) {
         case a:
            this.h(slot);
            break;
         case b:
            if (var3.b(slot).c()) {
               this.u = new a.c(
                  a.b.b, slot, "Overwrite \"" + var3.b(slot).b() + "\"?", "This replaces the config saved in slot " + (slot + 1) + ".", (String)null
               );
               dev.sixseven.n.h.d();
            } else {
               this.g(slot);
            }
            break;
         case c:
            this.j(slot);
            break;
         case d:
            this.i(slot);
            break;
         case e:
            String var4 = this.j();
            if (var4 == null || var4.isBlank()) {
               this.a("Nothing on the clipboard to import");
               dev.sixseven.n.h.d();
               return;
            }

            if (var3.b(slot).c()) {
               this.u = new a.c(a.b.e, slot, "Import over \"" + var3.b(slot).b() + "\"?", "This replaces slot " + (slot + 1) + " with the pasted config.", var4);
               dev.sixseven.n.h.d();
            } else {
               this.a(slot, var4);
            }
            break;
         case f:
            this.u = new a.c(a.b.f, slot, "Delete \"" + var3.b(slot).b() + "\"?", "This permanently removes slot " + (slot + 1) + ".", (String)null);
            dev.sixseven.n.h.d();
      }
   }

   private void g() {
      a.c var1 = this.u;
      this.u = null;
      if (var1 != null) {
         if (var1.a() == a.b.b) {
            this.g(var1.b());
         } else if (var1.a() == a.b.e) {
            this.a(var1.b(), var1.e());
         } else if (var1.a() == a.b.f) {
            this.f(var1.b());
         }
      }
   }

   private void f(int slot) {
      String var2 = this.e().b(slot).b();
      if (this.e().e(slot)) {
         this.a("Deleted \"" + var2 + "\"");
         dev.sixseven.n.h.d();
      } else {
         this.a("Couldn't delete the config");
      }
   }

   private void g(int slot) {
      if (this.e().c(slot)) {
         String var2 = this.e().b(slot).b();
         this.a("Saved to \"" + var2 + "\"");
         dev.sixseven.n.h.a(true);
      } else {
         this.a("Couldn't save the config");
      }
   }

   private void h(int slot) {
      if (this.e().d(slot)) {
         String var2 = this.e().b(slot).b();
         this.a("Activated \"" + var2 + "\"");
         dev.sixseven.n.h.a(true);
      } else {
         this.a("That slot is empty");
      }
   }

   private void i(int slot) {
      String var2 = this.e().f(slot);
      if (var2 == null) {
         this.a("That slot is empty");
      } else {
         this.b(var2);
         String var3 = this.e().b(slot).b();
         this.a("Copied \"" + var3 + "\" to clipboard");
         dev.sixseven.n.h.d();
      }
   }

   private void a(int slot, String payload) {
      dev.sixseven.a.b.a var3 = this.e().b(slot, payload);
      this.a(var3.b());
      dev.sixseven.n.h.a(true);
   }

   private void j(int slot) {
      this.s = slot;
      this.t.setLength(0);
      this.t.append(this.e().b(slot).b());
      dev.sixseven.n.h.d();
   }

   private void h() {
      if (this.s >= 0) {
         this.e().a(this.s, this.t.toString());
         this.s = -1;
      }
   }

   private void i() {
      this.s = -1;
   }

   private boolean a(float mx, float my, float x, float y, float w, float h) {
      return mx >= xx && mx <= xx + wx && my >= yx && my <= yx + hx;
   }

   private void a(String message) {
      if (SixSevenClient.notifications() != null) {
         SixSevenClient.notifications().a(message);
      }
   }

   private String j() {
      try {
         return class_310.method_1551().field_1774.method_1460();
      } catch (Exception var2) {
         return null;
      }
   }

   private void b(String text) {
      try {
         class_310.method_1551().field_1774.method_1455(text);
      } catch (Exception var3) {
      }
   }

   private static String a(long savedAt) {
      if (savedAt <= 0L) {
         return "just now";
      } else {
         long var2 = System.currentTimeMillis() - savedAt;
         if (var2 < 60000L) {
            return "just now";
         } else {
            long var4 = var2 / 60000L;
            if (var4 < 60L) {
               return var4 + "m ago";
            } else {
               long var6 = var4 / 60L;
               return var6 < 24L ? var6 + "h ago" : var6 / 24L + "d ago";
            }
         }
      }
   }

   public void c(int slot) {
      this.b();
      this.j(slot);
   }

   public void d(int slot) {
      this.b();
      this.u = new a.c(a.b.b, slot, "Overwrite \"" + this.e().b(slot).b() + "\"?", "This replaces the config saved in slot " + (slot + 1) + ".", (String)null);
   }

   public void e(int slot) {
      this.b();
      this.u = new a.c(a.b.f, slot, "Delete \"" + this.e().b(slot).b() + "\"?", "This permanently removes slot " + (slot + 1) + ".", (String)null);
   }

   private static enum b {
      a,
      b,
      c,
      d,
      e,
      f;

      public static a.b[] a() {
         return (a.b[])g.clone();
      }

      public static a.b a(String name) {
         return Enum.valueOf(a.b.class, name);
      }

      private static a.b[] b() {
         return new a.b[]{a, b, c, d, e, f};
      }
   }

   private static record c(a.b a, int b, String c, String d, String e) {
   }

   private static final class d {
      final a.b a;
      final int b;
      final float c;
      final float d;
      final float e;
      final float f;
      final boolean g;

      d(a.b action, int slot, float x, float y, float w, float h, boolean primary) {
         this.a = action;
         this.b = slot;
         this.c = x;
         this.d = y;
         this.e = w;
         this.f = h;
         this.g = primary;
      }

      boolean a(float mx, float my) {
         return mx >= this.c && mx <= this.c + this.e && my >= this.d && my <= this.d + this.f;
      }
   }
}
