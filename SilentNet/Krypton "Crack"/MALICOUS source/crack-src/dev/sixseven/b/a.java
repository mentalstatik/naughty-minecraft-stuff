package dev.sixseven.b;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.o;
import dev.sixseven.g.g;
import dev.sixseven.g.s;
import dev.sixseven.g.t;
import dev.sixseven.n.h;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class a extends class_437 implements s {
   private static final b a = new b();
   private final List<dev.sixseven.b.b.c> b = new ArrayList<>();
   private final dev.sixseven.g.a.a c = new dev.sixseven.g.a.a(180.0F, 0.0F);
   private boolean d;
   private final dev.sixseven.b.a.a e = new dev.sixseven.b.a.a();
   private static final float f = 118.0F;
   private static final float g = 28.0F;
   private boolean h;
   private static final float i = 280.0F;
   private static final float j = 32.0F;
   private final StringBuilder k = new StringBuilder();
   private boolean l;
   private dev.sixseven.b.b.c m;
   private float n;
   private float o;
   private float p;
   private float q;
   private boolean r;
   private dev.sixseven.b.b.c s;
   private final class_437 t;

   public a() {
      this((class_437)null);
   }

   public a(class_437 parent) {
      super(class_2561.method_43470("WINTER CLIENT ClickGUI"));
      this.t = parent;
      a.a(dev.sixseven.g.t.e(), dev.sixseven.g.t.f());
      dev.sixseven.d.d var2 = SixSevenClient.modules();
      dev.sixseven.m.d var3 = SixSevenClient.themes();

      for (dev.sixseven.d.b var7 : dev.sixseven.d.b.a()) {
         this.b.add(new dev.sixseven.b.b.a(var7, var2, var3, a));
      }

      this.b.add(new dev.sixseven.b.b.d(var3, a));
      this.c.a(1.0F);
   }

   public void method_49589() {
      super.method_49589();
      dev.sixseven.n.h.a();
   }

   public static b a() {
      return a;
   }

   private dev.sixseven.d.e.b c() {
      return SixSevenClient.modules().a;
   }

   public boolean method_25421() {
      return false;
   }

   public void method_25419() {
      if (!this.d) {
         this.d = true;
         this.c.a(0.0F);
         dev.sixseven.n.h.b();
      }
   }

   public void method_25432() {
      dev.sixseven.g.g.a();
      SixSevenClient.config().b();
   }

   public void method_25394(class_332 context, int mouseX, int mouseY, float deltaTicks) {
      int var5 = (int)(48.0F * this.c.b());
      context.method_25294(0, 0, this.field_22789, this.field_22790, var5 << 24 | 394506);
      this.d();
   }

   public void method_25393() {
      this.d();
   }

   private void d() {
      if (this.d && this.c.c()) {
         this.field_22787.method_1507(this.t);
      }
   }

   public void method_25420(class_332 context, int mouseX, int mouseY, float deltaTicks) {
      if (this.field_22787.field_1687 == null) {
         this.method_57728(context, deltaTicks);
      }

      if (this.c().a.i()) {
         dev.sixseven.g.g.a(this.c().b.d() * this.c.b());
         context.method_71278();
      } else {
         dev.sixseven.g.g.a();
      }
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float mouseX, float mouseY, float uiWidth, float uiHeight) {
      vg.a(this.c().c.i());
      if (vg.c()) {
         float var6 = this.c.b();
         if (!(var6 <= 0.002F) || !this.d) {
            vg.e();
            vg.b(var6);
            float var7 = 0.96F + 0.04F * var6;
            vg.a(uiWidth / 2.0F, uiHeight / 2.0F);
            vg.a(var7);
            vg.a(-uiWidth / 2.0F, -uiHeight / 2.0F);
            String var8 = this.k.toString();

            for (dev.sixseven.b.b.c var10 : this.b) {
               if (var10 instanceof dev.sixseven.b.b.a var11) {
                  var11.a(var8);
               }
            }

            for (int var12 = this.b.size() - 1; var12 >= 0; var12--) {
               this.b.get(var12).a(vg, mouseX, mouseY, uiWidth, uiHeight);
            }

            this.a(vg, uiWidth);
            this.b(vg, mouseX, mouseY, uiWidth, uiHeight);
            this.e.a(vg, mouseX, mouseY, uiWidth, uiHeight);
            vg.f();
         }
      }
   }

   private void b(dev.sixseven.g.b.d vg, float mouseX, float mouseY, float uiWidth, float uiHeight) {
      dev.sixseven.m.c var6 = SixSevenClient.themes().a();
      float var7 = a(uiWidth);
      float var8 = b(uiHeight);
      boolean var9 = mouseX >= var7 && mouseX <= var7 + 118.0F && mouseY >= var8 && mouseY <= var8 + 28.0F;
      boolean var10 = var9 || this.e.a();
      if (var10 != this.h) {
         this.h = var10;
         if (var10) {
            dev.sixseven.n.h.c();
         }
      }

      vg.c(var7, var8, 118.0F, 28.0F, 14.0F, var10 ? 7.0F : 4.0F, dev.sixseven.n.c.a(var6.a(), var10 ? 0.28F : 0.14F));
      vg.a(var7, var8, 118.0F, 28.0F, 14.0F, var6.h(), var6.i(), true);
      vg.b(var7, var8, 118.0F, 28.0F, 14.0F, 1.2F, dev.sixseven.n.c.a(var10 ? var6.d() : var6.a(), var10 ? 0.9F : 0.4F));
      float var11 = var7 + 16.0F;
      float var12 = var8 + 14.0F - 6.0F;
      vg.a(var11 + 3.0F, var12 + 3.0F, 11.0F, 9.0F, 2.5F, dev.sixseven.n.c.a(var6.a(), 0.5F));
      vg.a(var11, var12, 11.0F, 9.0F, 2.5F, var10 ? var6.d() : var6.a());
      vg.a("Configs", var7 + 36.0F, var8 + 14.0F, 13.5F, var10 ? var6.k() : var6.l());
   }

   private static float a(float uiWidth) {
      return (uiWidth - 118.0F) / 2.0F;
   }

   private static float b(float uiHeight) {
      return uiHeight - 28.0F - 14.0F;
   }

   private boolean a(float mx, float my) {
      float var3 = a(dev.sixseven.g.t.e());
      float var4 = b(dev.sixseven.g.t.f());
      return mx >= var3 && mx <= var3 + 118.0F && my >= var4 && my <= var4 + 28.0F;
   }

   private void a(dev.sixseven.g.b.d vg, float uiWidth) {
      dev.sixseven.m.c var3 = SixSevenClient.themes().a();
      float var4 = (uiWidth - 280.0F) / 2.0F;
      float var5 = 19.0F;
      vg.c(var4, var5, 280.0F, 32.0F, 16.0F, 6.0F, dev.sixseven.n.c.a(var3.a(), this.l ? 0.25F : 0.12F));
      vg.a(var4, var5, 280.0F, 32.0F, 16.0F, var3.h(), var3.i(), true);
      vg.b(var4, var5, 280.0F, 32.0F, 16.0F, 1.2F, dev.sixseven.n.c.a(this.l ? var3.d() : var3.a(), this.l ? 0.9F : 0.4F));
      float var6 = var4 + 16.0F;
      float var7 = var5 + 16.0F;
      vg.d(var6, var7 - 1.5F, 4.5F, 1.6F, var3.l());
      vg.b(var6 + 3.4F, var7 + 2.2F, var6 + 6.5F, var7 + 5.4F, 1.6F, var3.l());
      float var8 = var4 + 30.0F;
      if (this.k.isEmpty() && !this.l) {
         vg.a("Search modules…", var8, var7, 13.0F, var3.m());
      } else {
         float var9 = vg.a(this.k.toString(), var8, var7, 13.0F, var3.k());
         if (this.l && System.nanoTime() / 400000000L % 2L == 0L) {
            vg.a(var8 + var9 + 2.0F, var7 - 7.0F, 1.5F, 14.0F, 0.75F, var3.d());
         }
      }

      if (!this.k.isEmpty()) {
         vg.c(var4 + 280.0F - 26.0F, var7 - 6.0F, 12.0F, 1.6F, var3.l());
      }
   }

   public void a(String query) {
      this.k.setLength(0);
      this.k.append(query);
      this.l = true;
   }

   public dev.sixseven.b.a.a b() {
      return this.e;
   }

   private boolean b(float mx, float my) {
      float var3 = (dev.sixseven.g.t.e() - 280.0F) / 2.0F;
      return mx >= var3 && mx <= var3 + 280.0F && my >= 19.0F && my <= 51.0F;
   }

   private float a(double guiX) {
      return dev.sixseven.g.t.a(guiX);
   }

   private float b(double guiY) {
      return dev.sixseven.g.t.a(guiY);
   }

   public boolean method_25402(class_11909 click, boolean doubled) {
      float var3 = this.a(click.comp_4798());
      float var4 = this.b(click.comp_4799());
      dev.sixseven.g.b.d var5 = dev.sixseven.g.b.d.a();
      float var6 = dev.sixseven.g.t.f();
      if (this.e.a()) {
         this.e.a(var3, var4, click.method_74245());
         return true;
      } else if (this.a(var3, var4)) {
         this.e.b();
         dev.sixseven.n.h.a();
         return true;
      } else if (!this.b(var3, var4)) {
         this.l = false;

         for (dev.sixseven.b.b.c var8 : this.b) {
            if (var8.c(var3, var4)) {
               this.a(var8);
               if (click.method_74245() == 0) {
                  this.m = var8;
                  this.n = var3 - var8.f();
                  this.o = var4 - var8.g();
                  this.p = var3;
                  this.q = var4;
                  this.r = false;
               } else {
                  var8.h();
                  dev.sixseven.n.h.g();
               }

               return true;
            }

            if (var8.a(var5, var3, var4, var6)) {
               this.a(var8);
               this.s = var8;
               var8.a(var3, var4, click.method_74245());
               return true;
            }
         }

         return true;
      } else {
         float var7 = (dev.sixseven.g.t.e() + 280.0F) / 2.0F - 26.0F;
         if (!this.k.isEmpty() && var3 >= var7 - 4.0F && var3 <= var7 + 16.0F) {
            this.k.setLength(0);
         } else {
            this.l = true;
         }

         dev.sixseven.n.h.d();
         return true;
      }
   }

   public boolean method_25403(class_11909 click, double offsetX, double offsetY) {
      if (this.e.a()) {
         return true;
      } else {
         float var6 = this.a(click.comp_4798());
         float var7 = this.b(click.comp_4799());
         if (this.m != null) {
            if (Math.abs(var6 - this.p) + Math.abs(var7 - this.q) > 3.0F) {
               this.r = true;
            }

            if (this.r) {
               this.m.b(var6 - this.n, var7 - this.o);
            }

            return true;
         } else if (this.s != null) {
            this.s.a(var6, var7);
            return true;
         } else {
            return true;
         }
      }
   }

   public boolean method_25406(class_11909 click) {
      if (this.e.a()) {
         return true;
      } else if (this.m == null) {
         if (this.s != null) {
            this.s.c();
            this.s = null;
         }

         return true;
      } else {
         if (!this.r && click.method_74245() == 0) {
            this.m.h();
            dev.sixseven.n.h.g();
         } else if (this.r) {
            a.a();
         }

         this.m = null;
         return true;
      }
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      if (this.e.a()) {
         return true;
      } else {
         float var9 = this.a(mouseX);
         float var10 = this.b(mouseY);
         dev.sixseven.g.b.d var11 = dev.sixseven.g.b.d.a();
         float var12 = dev.sixseven.g.t.f();

         for (dev.sixseven.b.b.c var14 : this.b) {
            if (var14.a(var11, var9, var10, var12) || var14.c(var9, var10)) {
               var14.a(verticalAmount);
               return true;
            }
         }

         return true;
      }
   }

   public boolean method_25404(class_11908 input) {
      if (this.e.a()) {
         this.e.a(input.comp_4795());
         return true;
      } else {
         for (dev.sixseven.b.b.c var3 : this.b) {
            if (var3.d()) {
               var3.a(input.comp_4795());
               return true;
            }
         }

         if (this.l) {
            switch (input.comp_4795()) {
               case 256:
                  this.k.setLength(0);
                  this.l = false;
                  break;
               case 257:
               case 335:
                  this.l = false;
                  break;
               case 259:
                  if (!this.k.isEmpty()) {
                     this.k.deleteCharAt(this.k.length() - 1);
                  }
            }

            return true;
         } else if (!input.method_74231() && !this.c().d().a(input.comp_4795())) {
            return super.method_25404(input);
         } else {
            this.method_25419();
            return true;
         }
      }
   }

   public boolean method_25400(class_11905 input) {
      if (this.e.a()) {
         this.e.b(input.comp_4793());
         return true;
      } else {
         for (dev.sixseven.b.b.c var3 : this.b) {
            if (var3.d()) {
               var3.b(input.comp_4793());
               return true;
            }
         }

         if (this.l && input.method_74227()) {
            if (this.k.length() < 32) {
               this.k.append(input.method_74226());
            }

            return true;
         } else {
            return super.method_25400(input);
         }
      }
   }

   private void a(dev.sixseven.b.b.c panel) {
      if (this.b.remove(panel)) {
         this.b.addFirst(panel);
      }
   }

   public void a(dev.sixseven.i.a setting) {
      dev.sixseven.b.c.a var2 = new dev.sixseven.b.c.a(setting, () -> {
         o var0 = SixSevenClient.modules().w;
         return var0 != null ? var0.c.i() : -16711736;
      }, "Pick Block");
      this.field_22787.method_1507(new e(this, var2, SixSevenClient.themes()));
   }

   public void a(dev.sixseven.i.d setting) {
      dev.sixseven.b.c.b var2 = new dev.sixseven.b.c.b(setting);
      this.field_22787.method_1507(new e(this, var2, SixSevenClient.themes()));
   }
}
