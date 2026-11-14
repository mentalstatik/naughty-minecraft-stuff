package dev.sixseven.b;

import dev.sixseven.SixSevenClient;
import dev.sixseven.g.s;
import dev.sixseven.g.t;
import dev.sixseven.n.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix3x2fStack;

public class e extends class_437 implements s {
   private static final float a = 42.0F;
   private static final float b = 34.0F;
   private static final float c = 12.0F;
   private static final float d = 34.0F;
   private static final float e = 116.0F;
   private static final float f = 14.0F;
   private final class_437 g;
   private final dev.sixseven.b.c.c h;
   private final dev.sixseven.m.d i;
   private final StringBuilder j = new StringBuilder();
   private boolean k;
   private boolean l;
   private List<dev.sixseven.b.c.c.a> m = List.of();
   private String n = null;
   private boolean o;
   private boolean p = true;
   private float q;
   private float r;
   private dev.sixseven.i.c s;
   private String t;
   private dev.sixseven.b.d.c u;
   private final float[] v = new float[4];
   private final float[] w = new float[4];
   private final float[] x = new float[4];
   private final float[] y = new float[4];

   public e(class_437 parent, dev.sixseven.b.c.c model, dev.sixseven.m.d themes) {
      super(class_2561.method_43470(model.a()));
      this.g = parent;
      this.h = model;
      this.i = themes;
   }

   private void b() {
      String var1 = this.j.toString().trim().toLowerCase(Locale.ROOT);
      if (this.p || !var1.equals(this.n) || this.l != this.o) {
         this.n = var1;
         this.o = this.l;
         this.p = false;
         ArrayList var2 = new ArrayList();

         for (dev.sixseven.b.c.c.a var4 : this.h.c()) {
            if ((!this.l || var4.e()) && (var1.isEmpty() || var4.a(var1))) {
               var2.add(var4);
            }
         }

         this.m = var2;
         this.q = 0.0F;
      }
   }

   private e.a c() {
      float var1 = dev.sixseven.g.t.e();
      float var2 = dev.sixseven.g.t.f();
      float var3 = Math.min(var1 * 0.82F, 940.0F);
      float var4 = Math.min(var2 * 0.84F, 660.0F);
      float var5 = (var1 - var3) / 2.0F;
      float var6 = (var2 - var4) / 2.0F;
      float var7 = var5 + 12.0F;
      float var8 = var6 + 42.0F + 34.0F;
      float var9 = var3 - 24.0F;
      float var10 = var4 - 42.0F - 34.0F - 12.0F;
      int var11 = Math.max(1, (int)(var9 / 34.0F));
      float var12 = var9 / (float)var11;
      return new e.a(var5, var6, var3, var4, var7, var8, var9, var10, var11, var12, var12 - 11.0F);
   }

   private float a(e.a l) {
      int var2 = (this.m.size() + lx.i() - 1) / lx.i();
      return (float)var2 * lx.j();
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float deltaTicks) {
      this.b();
      e.a var5 = this.c();
      this.r = Math.max(0.0F, this.a(var5) - var5.h());
      this.q = Math.clamp(this.q, 0.0F, this.r);
      float var6 = dev.sixseven.g.t.a();
      double var7 = (double)this.field_22787.method_22683().method_4495();
      float var9 = (float)((double)var6 / var7);
      context.method_25294(0, 0, this.field_22789, this.field_22790, -670694391);
      a(context, var5.a() * var9, var5.b() * var9, var5.c() * var9, var5.d() * var9, 14.0F * var9, -132771297, -133560304);
      context.method_44379(a(var5.e() * var9), a(var5.f() * var9), a((var5.e() + var5.g()) * var9), a((var5.f() + var5.h()) * var9));
      int var10 = Math.max(0, (int)(this.q / var5.j()) * var5.i());
      int var11 = var5.i() * ((int)(var5.h() / var5.j()) + 3);
      int var12 = Math.min(this.m.size(), var10 + var11);
      Matrix3x2fStack var13 = context.method_51448();

      for (int var14 = var10; var14 < var12; var14++) {
         dev.sixseven.b.c.c.a var15 = this.m.get(var14);
         int var16 = var14 % var5.i();
         int var17 = var14 / var5.i();
         float var18 = var5.e() + (float)var16 * var5.j() + (var5.j() - var5.k()) / 2.0F;
         float var19 = var5.f() - this.q + (float)var17 * var5.j() + (var5.j() - var5.k()) / 2.0F;
         float var20 = var5.k() * var9 / 16.0F;
         var13.pushMatrix();
         var13.translate(var18 * var9, var19 * var9);
         var13.scale(var20, var20);
         context.method_51427(var15.a(), 0, 0);
         var13.popMatrix();
      }

      context.method_44380();
   }

   private static int a(float v) {
      return Math.round(vx);
   }

   private static void a(class_332 gg, float x, float y, float w, float h, float radius, int top, int bottom) {
      int var8 = Math.round(xx);
      int var9 = Math.round(yx);
      int var10 = Math.round(xx + wx);
      int var11 = Math.round(yx + hx);
      int var12 = var11 - var9;
      int var13 = var10 - var8;
      if (var12 > 0 && var13 > 0) {
         int var14 = Math.min(Math.round(radius), Math.min(var13, var12) / 2);

         for (int var15 = 0; var15 < var12; var15++) {
            int var16 = 0;
            if (var14 > 0) {
               int var17 = var15 < var14 ? var15 : (var15 >= var12 - var14 ? var12 - 1 - var15 : -1);
               if (var17 >= 0) {
                  double var18 = (double)(var14 - var17) - 0.5;
                  var16 = (int)Math.round((double)var14 - Math.sqrt(Math.max(0.0, (double)var14 * (double)var14 - var18 * var18)));
               }
            }

            int var20 = dev.sixseven.n.c.a(top, bottom, var12 <= 1 ? 0.0F : (float)var15 / (float)(var12 - 1));
            gg.method_25294(var8 + var16, var9 + var15, var10 - var16, var9 + var15 + 1, var20);
         }
      }
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mouseX, float mouseY, float uiWidth, float uiHeight) {
      if (vg.c()) {
         dev.sixseven.m.c var6 = this.i.a();
         e.a var7 = this.c();
         boolean var8 = System.nanoTime() / 400000000L % 2L == 0L;
         vg.c(var7.a(), var7.b(), var7.c(), var7.d(), 14.0F, 17.0F, dev.sixseven.n.c.a(-16777216, 0.45F));
         vg.c(var7.a(), var7.b(), var7.c(), var7.d(), 14.0F, 8.0F, dev.sixseven.n.c.a(var6.a(), 0.28F));
         vg.b(var7.a(), var7.b(), var7.c(), var7.d(), 14.0F, 1.4F, dev.sixseven.n.c.a(var6.d(), 0.75F));
         vg.b(var7.a() + 2.2F, var7.b() + 2.2F, var7.c() - 4.4F, var7.d() - 4.4F, 11.8F, 1.0F, dev.sixseven.n.c.a(var6.d(), 0.13F));
         vg.a(this.h.a(), var7.a() + 12.0F, var7.b() + 16.0F, 16.0F, var6.d(), var6.a());
         String var9 = "Left-click: toggle   ·   Right-click: color   ·   " + this.h.b() + " active";
         vg.a(var9, var7.a() + 12.0F, var7.b() + 31.0F, 11.0F, var6.m());
         float var10 = var7.a() + var7.c() - 12.0F - 3.0F;
         float var11 = var7.b() + 18.0F;
         boolean var12 = Math.abs(mouseX - var10) < 10.0F && Math.abs(mouseY - var11) < 10.0F;
         vg.c(var10 - 6.0F, var11 - 6.0F, 12.0F, 1.8F, var12 ? var6.d() : var6.l());
         this.w[0] = var10 - 10.0F;
         this.w[1] = var11 - 10.0F;
         this.w[2] = var10 + 10.0F;
         this.w[3] = var11 + 10.0F;
         float var13 = var7.a() + 12.0F;
         float var14 = var7.b() + 42.0F + 4.0F;
         float var15 = 22.0F;
         float var16 = var7.c() - 24.0F - 116.0F - 8.0F;
         this.x[0] = var13;
         this.x[1] = var14;
         this.x[2] = var13 + var16;
         this.x[3] = var14 + var15;
         vg.a(var13, var14, var16, var15, var15 / 2.0F, this.k ? dev.sixseven.n.c.a(var6.a(), 0.16F) : dev.sixseven.n.c.a(-16777216, 0.4F));
         vg.b(var13, var14, var16, var15, var15 / 2.0F, 1.1F, dev.sixseven.n.c.a(this.k ? var6.d() : var6.a(), this.k ? 0.9F : 0.35F));
         float var17 = var13 + 12.0F;
         float var18 = var14 + var15 / 2.0F;
         vg.d(var17, var18 - 1.0F, 4.0F, 1.4F, var6.l());
         vg.b(var17 + 3.0F, var18 + 2.0F, var17 + 6.0F, var18 + 5.0F, 1.4F, var6.l());
         if (this.j.length() == 0 && !this.k) {
            vg.a("Search…  (" + this.m.size() + " shown)", var13 + 24.0F, var18, 12.5F, var6.m());
         } else {
            float var19 = vg.a(this.j.toString(), var13 + 24.0F, var18, 12.5F, var6.k());
            if (this.k && var8) {
               vg.a(var13 + 24.0F + var19 + 1.5F, var18 - 6.0F, 1.4F, 12.0F, 0.7F, var6.d());
            }
         }

         float var37 = var13 + var16 + 8.0F;
         this.y[0] = var37;
         this.y[1] = var14;
         this.y[2] = var37 + 116.0F;
         this.y[3] = var14 + var15;
         boolean var20 = a(mouseX, mouseY, this.y);
         vg.a(var37, var14, 116.0F, var15, var15 / 2.0F, this.l ? dev.sixseven.n.c.a(var6.a(), 0.22F) : dev.sixseven.n.c.a(-16777216, 0.4F));
         vg.b(var37, var14, 116.0F, var15, var15 / 2.0F, 1.1F, dev.sixseven.n.c.a(!this.l && !var20 ? var6.a() : var6.d(), this.l ? 0.9F : 0.4F));
         float var21 = var37 + 13.0F;
         float var22 = var14 + var15 / 2.0F;
         if (this.l) {
            vg.a(var21, var22, 4.0F, var6.n());
            vg.a(var21, var22, 4.0F, 4.0F, dev.sixseven.n.c.a(var6.n(), 0.5F));
         } else {
            vg.d(var21, var22, 4.0F, 1.4F, var6.l());
         }

         vg.a("Selected only", var37 + 24.0F, var22, 11.5F, this.l ? var6.k() : var6.l());
         vg.e();
         vg.a(var7.e(), var7.f(), var7.g(), var7.h());
         int var23 = Math.max(0, (int)(this.q / var7.j()) * var7.i());
         int var24 = var7.i() * ((int)(var7.h() / var7.j()) + 3);
         int var25 = Math.min(this.m.size(), var23 + var24);
         int var26 = this.a(mouseX, mouseY, var7);

         for (int var27 = var23; var27 < var25; var27++) {
            dev.sixseven.b.c.c.a var28 = this.m.get(var27);
            int var29 = var27 % var7.i();
            int var30 = var27 / var7.i();
            float var31 = var7.e() + (float)var29 * var7.j();
            float var32 = var7.f() - this.q + (float)var30 * var7.j();
            boolean var33 = var28.c();
            boolean var34 = var28.d();
            if (var27 == var26) {
               vg.a(var31 + 1.0F, var32 + 1.0F, var7.j() - 2.0F, var7.j() - 2.0F, 6.0F, dev.sixseven.n.c.a(var6.a(), 0.12F));
            }

            if (var33) {
               int var35 = var28.f();
               int var36 = var34 ? var35 : dev.sixseven.n.c.a(var35, 0.35F);
               vg.b(var31 + 1.5F, var32 + 1.5F, var7.j() - 3.0F, var7.j() - 3.0F, 6.0F, var34 ? 1.8F : 1.0F, var36 | (var34 ? -16777216 : 0));
               vg.a(var31 + 4.0F, var32 + var7.j() - 5.0F, var7.j() - 8.0F, 2.5F, 1.0F, var35 | 0xFF000000);
               if (var34) {
                  vg.a(var31 + var7.j() - 6.0F, var32 + 6.0F, 2.6F, var6.n());
               }
            }
         }

         vg.f();
         if (this.m.isEmpty() && this.l) {
            vg.a("Nothing selected yet — turn off \"Selected only\" to browse.", var7.e() + 4.0F, var7.f() + 16.0F, 12.5F, var6.m());
         }

         if (this.r > 0.0F) {
            float var38 = var7.a() + var7.c() - 6.0F;
            float var39 = Math.max(24.0F, var7.h() * (var7.h() / this.a(var7)));
            float var40 = var7.f() + (var7.h() - var39) * (this.q / this.r);
            vg.a(var38, var40, 3.0F, var39, 1.5F, dev.sixseven.n.c.a(var6.a(), 0.55F));
         }

         if (this.s != null && this.u != null) {
            this.a(vg, var6);
         } else {
            this.v[0] = this.v[1] = this.v[2] = this.v[3] = 0.0F;
         }
      }
   }

   private void a(dev.sixseven.g.b.d vg, dev.sixseven.m.c theme) {
      this.u.a(true);
      float var3 = 220.0F;
      float var4 = 26.0F;
      float var5 = dev.sixseven.g.t.e();
      float var6 = dev.sixseven.g.t.f();
      float var7 = (var5 - var3) / 2.0F + 12.0F;
      float var8 = this.u.a(vg);
      float var9 = var4 + var8 + 12.0F;
      float var10 = (var5 - var3) / 2.0F;
      float var11 = (var6 - var9) / 2.0F;
      this.v[0] = var10;
      this.v[1] = var11;
      this.v[2] = var10 + var3;
      this.v[3] = var11 + var9;
      vg.c(var10, var11, var3, var9, 12.0F, 14.0F, dev.sixseven.n.c.a(theme.a(), 0.3F));
      vg.a(var10, var11, var3, var9, 12.0F, theme.f(), theme.g(), true);
      vg.b(var10, var11, var3, var9, 12.0F, 1.4F, dev.sixseven.n.c.a(theme.d(), 0.7F));
      vg.a(this.t, var10 + 12.0F, var11 + 14.0F, 12.5F, theme.d(), theme.a());
      this.u.a(var7, var11 + var4, var3 - 24.0F);
      this.u.a(vg, dev.sixseven.g.t.c(), dev.sixseven.g.t.d());
   }

   private int a(float mx, float my, e.a l) {
      if (!(mx < lx.e()) && !(mx > lx.e() + lx.g()) && !(my < lx.f()) && !(my > lx.f() + lx.h())) {
         int var4 = (int)((mx - lx.e()) / lx.j());
         int var5 = (int)((my - (lx.f() - this.q)) / lx.j());
         if (var4 >= 0 && var4 < lx.i() && var5 >= 0) {
            int var6 = var5 * lx.i() + var4;
            return var6 >= 0 && var6 < this.m.size() ? var6 : -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private float a(double guiX) {
      return dev.sixseven.g.t.a(guiX);
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      float var3 = this.a(click.comp_4798());
      float var4 = this.a(click.comp_4799());
      e.a var5 = this.c();
      if (this.s != null) {
         if (a(var3, var4, this.v)) {
            this.u.a(var3, var4, click.method_74245());
         } else {
            this.d();
            dev.sixseven.n.h.d();
         }

         return true;
      } else if (a(var3, var4, this.w)) {
         this.method_25419();
         return true;
      } else if (a(var3, var4, this.y)) {
         this.l = !this.l;
         this.p = true;
         this.k = false;
         dev.sixseven.n.h.a(this.l);
         return true;
      } else if (a(var3, var4, this.x)) {
         this.k = true;
         dev.sixseven.n.h.d();
         return true;
      } else {
         this.k = false;
         if (!(var3 < var5.a()) && !(var3 > var5.a() + var5.c()) && !(var4 < var5.b()) && !(var4 > var5.b() + var5.d())) {
            int var6 = this.a(var3, var4, var5);
            if (var6 >= 0) {
               dev.sixseven.b.c.c.a var7 = this.m.get(var6);
               if (click.method_74245() == 1) {
                  this.a(var7.h(), var7.b());
               } else if (click.method_74245() == 0) {
                  boolean var8 = var7.e();
                  var7.g();
                  dev.sixseven.n.h.a(var7.d());
                  if (this.l && var8 && !var7.e()) {
                     this.p = true;
                  }
               }

               return true;
            } else {
               return true;
            }
         } else {
            this.method_25419();
            return true;
         }
      }
   }

   private void a(dev.sixseven.i.c target, String title) {
      if (target != null) {
         this.s = target;
         this.t = title;
         this.u = new dev.sixseven.b.d.c(this.i, target);
         this.u.a(true);
         this.k = false;
         dev.sixseven.n.h.d();
      }
   }

   private void d() {
      this.s = null;
      this.t = null;
      this.u = null;
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      if (this.s != null && this.u != null) {
         this.u.a(this.a(click.comp_4798()), this.a(click.comp_4799()));
      }

      return true;
   }

   public boolean method_25406(class_11909 click) {
      if (this.u != null) {
         this.u.b();
      }

      return true;
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.s == null) {
         this.q = Math.clamp(this.q - (float)(verticalAmount * (double)this.c().j()), 0.0F, this.r);
      }

      return true;
   }

   public boolean method_25404(class_11908 input) {
      int var2 = input.comp_4795();
      if (this.s != null) {
         if (this.u != null && this.u.c()) {
            this.u.a(var2);
            return true;
         } else if (var2 == 256) {
            this.d();
            return true;
         } else {
            return true;
         }
      } else if (this.k) {
         switch (var2) {
            case 256:
            case 257:
            case 335:
               this.k = false;
               break;
            case 259:
               if (this.j.length() > 0) {
                  this.j.deleteCharAt(this.j.length() - 1);
                  this.p = true;
               }
         }

         return true;
      } else if (var2 == 256) {
         this.method_25419();
         return true;
      } else {
         return super.method_25404(input);
      }
   }

   public boolean method_25400(class_11905 input) {
      if (this.s != null) {
         return true;
      } else if (!this.k) {
         return true;
      } else if (this.j.length() >= 48) {
         return true;
      } else {
         char var2 = (char)input.comp_4793();
         if (var2 == ' ' || var2 == '_' || var2 == ':' || var2 == '/' || var2 >= '0' && var2 <= '9' || var2 >= 'a' && var2 <= 'z' || var2 >= 'A' && var2 <= 'Z'
            )
          {
            this.j.append(Character.toLowerCase(var2));
            this.p = true;
         }

         return true;
      }
   }

   public void method_25419() {
      SixSevenClient.config().b();
      this.field_22787.method_1507(this.g);
   }

   public boolean method_25421() {
      return false;
   }

   public void a(String query) {
      this.j.setLength(0);
      this.j.append(query);
      this.k = true;
      this.p = true;
      this.b();
   }

   public void a(boolean value) {
      this.l = value;
      this.p = true;
      this.b();
   }

   public void a(int filteredIndex) {
      if (filteredIndex >= 0 && filteredIndex < this.m.size()) {
         dev.sixseven.b.c.c.a var2 = this.m.get(filteredIndex);
         this.a(var2.h(), var2.b());
      }
   }

   public int a() {
      return this.m.size();
   }

   private static boolean a(float mx, float my, float[] r) {
      return mx >= rx[0] && mx <= rx[2] && my >= rx[1] && my <= rx[3];
   }

   private static record a(float a, float b, float c, float d, float e, float f, float g, float h, int i, float j, float k) {
   }
}
