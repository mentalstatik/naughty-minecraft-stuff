package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import dev.sixseven.mixin.ClientInputAccessor;
import net.minecraft.class_10185;
import net.minecraft.class_1923;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_5498;
import net.minecraft.class_631;
import net.minecraft.class_746;

public class H extends dev.sixseven.d.c {
   private static H i;
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Speed", "Camera fly speed", 1.0, 0.1, 50.0, 0.1, "x"));
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Vertical speed", "Up/down speed multiplier", 1.0, 0.2, 5.0, 0.05, "x"));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Smoothing", "Ease camera movement", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Show own body", "Render your body while detached", true));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Show hands", "Keep first-person hands visible", true));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Body uses movement keys", "Physical WASD also move the body", false));
   public final dev.sixseven.i.h g = this.a(new dev.sixseven.i.h("Look Sensitivity", "Camera look sensitivity", 0.5, 0.1, 2.0, 0.05));
   public final dev.sixseven.i.h h = this.a(new dev.sixseven.i.h("Chunk distance", "Chunks to load around the camera", 12.0, 2.0, 32.0, 1.0));
   private double j;
   private double k;
   private double l;
   private double m;
   private double n;
   private double o;
   private float p;
   private float q;
   private float r;
   private float s;
   private double t;
   private double u;
   private double v;
   private float w;
   private float x;
   private boolean y;
   private boolean z;
   private class_5498 A;
   private boolean B;
   private class_1923 C;
   private int D = Integer.MIN_VALUE;
   private boolean E;
   private boolean F = false;
   private boolean G;
   private boolean H;
   private boolean I;
   private boolean J;
   private boolean K;
   private boolean L;
   private boolean M;
   private int N;

   public H() {
      super("Freecam", "Detached camera (WASD = fly). Body can keep walking; mining uses real aim.", dev.sixseven.d.b.c);
      i = this;
   }

   public static H k() {
      return i;
   }

   @Override
   protected void h() {
      this.E = true;
      this.F = false;
   }

   @Override
   protected void i() {
      class_310 var1 = class_310.method_1551();
      this.v();
      this.E = false;
      this.F = false;
      if (this.B) {
         var1.field_1690.method_31043(this.A);
         this.B = false;
      }

      this.i(var1);
      this.g(var1);
      if (var1.field_1724 != null) {
         var1.field_1724.method_31549().field_7479 = this.y;
      }
   }

   public void a(class_310 mc) {
      if (this.f() && this.E && mc.field_1724 != null && mc.field_1687 != null) {
         this.t = mc.field_1724.method_23317();
         this.u = mc.field_1724.method_23318();
         this.v = mc.field_1724.method_23321();
         this.w = mc.field_1724.method_36454();
         this.x = mc.field_1724.method_36455();
         this.j = this.m = this.t;
         this.k = this.n = this.u + (double)mc.field_1724.method_5751();
         this.l = this.o = this.v;
         this.p = this.r = this.w;
         this.q = this.s = this.x;
         this.y = mc.field_1724.method_31549().field_7479;
         this.B = false;
         if (this.d.i()) {
            this.A = mc.field_1690.method_31044();
            if (this.A.method_31034()) {
               mc.field_1690.method_31043(class_5498.field_26665);
               this.B = true;
            }
         }

         this.E = false;
         this.F = true;
         this.d(mc);
         this.e(mc);
         this.N = 40;
         this.C = null;
         this.D = Integer.MIN_VALUE;
         this.h(mc);
         this.f(mc);
         c(mc);
      }
   }

   private void d(class_310 mc) {
      class_315 var2 = mc.field_1690;
      class_746 var3 = mc.field_1724;
      class_10185 var4 = var3 != null ? var3.field_3913.field_54155 : class_10185.field_54098;
      this.G = var2.field_1894.method_1434() || var4.comp_3159();
      this.H = var2.field_1881.method_1434() || var4.comp_3160();
      this.I = var2.field_1913.method_1434() || var4.comp_3161();
      this.J = var2.field_1849.method_1434() || var4.comp_3162();
      this.K = var2.field_1903.method_1434() || var4.comp_3163();
      this.L = var2.field_1832.method_1434() || var4.comp_3164() || var3 != null && var3.method_5715();
      this.M = var2.field_1867.method_1434() || var4.comp_3165();
      this.u();
      this.a(mc.field_1724);
   }

   private void u() {
      l var1 = SixSevenClient.modules() != null ? SixSevenClient.modules().s : null;
      if (var1 != null && var1.f()) {
         this.G = true;
      }
   }

   public void b(class_310 mc) {
      if (mc.field_1724 != null) {
         this.u();
         if (!this.f.i()) {
            this.L = this.L | mc.field_1724.method_5715();
         } else {
            class_315 var2 = mc.field_1690;
            class_10185 var3 = mc.field_1724.field_3913.field_54155;
            this.G = this.G | (var2.field_1894.method_1434() || var3.comp_3159());
            this.H = this.H | (var2.field_1881.method_1434() || var3.comp_3160());
            this.I = this.I | (var2.field_1913.method_1434() || var3.comp_3161());
            this.J = this.J | (var2.field_1849.method_1434() || var3.comp_3162());
            this.K = this.K | (var2.field_1903.method_1434() || var3.comp_3163());
            this.L = this.L | (var2.field_1832.method_1434() || var3.comp_3164());
            this.M = this.M | (var2.field_1867.method_1434() || var3.comp_3165());
         }

         this.a(mc.field_1724);
         this.b(mc.field_1724);
      }
   }

   private void a(class_746 player) {
      if (player != null) {
         float var2 = player.field_6250;
         float var3 = player.field_6212;
         if (var2 > 0.015F) {
            this.G = true;
         }

         if (var2 < -0.015F) {
            this.H = true;
         }

         if (var3 > 0.015F) {
            this.I = true;
         }

         if (var3 < -0.015F) {
            this.J = true;
         }
      }
   }

   private void b(class_746 player) {
      class_243 var2 = player.method_18798();
      double var3 = var2.field_1352;
      double var5 = var2.field_1350;
      if (!(var3 * var3 + var5 * var5 < 1.0E-10)) {
         class_243 var7 = g(player.method_36454());
         double var8 = var3 * var7.field_1352 + var5 * var7.field_1350;
         double var10 = var3 * -var7.field_1350 + var5 * var7.field_1352;
         if (Math.abs(var8) >= Math.abs(var10)) {
            if (var8 > 0.008) {
               this.G = true;
            } else if (var8 < -0.008) {
               this.H = true;
            }
         } else if (var10 > 0.008) {
            this.I = true;
         } else if (var10 < -0.008) {
            this.J = true;
         }
      }
   }

   private void e(class_310 mc) {
      if (mc.field_1724 != null && !this.G && !this.H && !this.I && !this.J) {
         class_243 var2 = mc.field_1724.method_18798();
         double var3 = var2.field_1352;
         double var5 = var2.field_1350;
         if (!(var3 * var3 + var5 * var5 < 1.0E-8)) {
            class_243 var7 = g(mc.field_1724.method_36454());
            double var8 = var3 * var7.field_1352 + var5 * var7.field_1350;
            double var10 = var3 * -var7.field_1350 + var5 * var7.field_1352;
            if (Math.abs(var8) > Math.abs(var10)) {
               if (var8 > 0.008) {
                  this.G = true;
               } else if (var8 < -0.008) {
                  this.H = true;
               }
            } else if (var10 > 0.008) {
               this.I = true;
            } else if (var10 < -0.008) {
               this.J = true;
            }
         }
      }
   }

   private static class_243 g(float yawDeg) {
      double var1 = Math.toRadians((double)yawDeg);
      return new class_243(-Math.sin(var1), 0.0, Math.cos(var1));
   }

   private void v() {
      this.G = this.H = this.I = this.J = false;
      this.K = this.L = this.M = false;
      this.N = 0;
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (this.f()) {
         this.a(var1);
         if (this.F && var1.field_1724 != null) {
            if (this.N > 0) {
               this.N--;
               this.b(var1);
            }

            this.m = this.j;
            this.n = this.k;
            this.o = this.l;
            this.r = this.p;
            this.s = this.q;
            float var2 = this.a.d();
            float var3 = this.b.d();
            float var4 = this.c.i() ? 0.5F : 1.0F;
            class_315 var5 = var1.field_1690;
            double var6 = 0.0;
            double var8 = 0.0;
            double var10 = 0.0;
            if (var5.field_1894.method_1434()) {
               var6++;
            }

            if (var5.field_1881.method_1434()) {
               var6--;
            }

            if (var5.field_1913.method_1434()) {
               var8++;
            }

            if (var5.field_1849.method_1434()) {
               var8--;
            }

            if (var5.field_1903.method_1434()) {
               var10++;
            }

            if (var5.field_1832.method_1434()) {
               var10--;
            }

            class_746 var12 = var1.field_1724;
            if (var12.method_31549().field_7477) {
               var12.method_31549().field_7479 = false;
            }

            double var13 = Math.toRadians((double)this.p);
            double var15 = -Math.sin(var13) * var6 * (double)var2 + Math.cos(var13) * var8 * (double)var2;
            double var17 = Math.cos(var13) * var6 * (double)var2 + Math.sin(var13) * var8 * (double)var2;
            double var19 = var10 * (double)var2 * (double)var3;
            this.j += var15 * (double)var4;
            this.k += var19 * (double)var4;
            this.l += var17 * (double)var4;
            this.f(var1);
         }
      }
   }

   public static void c(class_310 client) {
      H var1 = i;
      if (var1 != null && var1.m() && client.field_1724 != null) {
         class_746 var2 = client.field_1724;
         class_315 var3 = client.field_1690;
         boolean var4 = var1.f.i();
         boolean var5 = var1.G || var4 && var3.field_1894.method_1434();
         boolean var6 = var1.H || var4 && var3.field_1881.method_1434();
         boolean var7 = var1.I || var4 && var3.field_1913.method_1434();
         boolean var8 = var1.J || var4 && var3.field_1849.method_1434();
         boolean var9 = var1.K;
         boolean var10 = var1.L || var4 && var3.field_1832.method_1434();
         boolean var11 = var1.M || var4 && var3.field_1867.method_1434();
         if (var4) {
            if (var3.field_1881.method_1434()) {
               var1.G = false;
            }

            if (var3.field_1894.method_1434()) {
               var1.H = false;
            }

            if (var3.field_1849.method_1434()) {
               var1.I = false;
            }

            if (var3.field_1913.method_1434()) {
               var1.J = false;
            }
         }

         var2.field_3913.field_54155 = new class_10185(var5, var6, var7, var8, var9, var10, var11);
         float var12 = (var7 ? 1.0F : 0.0F) - (var8 ? 1.0F : 0.0F);
         float var13 = (var5 ? 1.0F : 0.0F) - (var6 ? 1.0F : 0.0F);
         class_241 var14 = new class_241(var12, var13).method_35581();
         ((ClientInputAccessor)var2.field_3913).sixsevenclient$setMoveVector(var14);
         var2.method_5660(var10);
      }
   }

   public boolean l() {
      return this.G || this.H || this.I || this.J || this.K || this.L;
   }

   private void f(class_310 client) {
      if (this.F && client.field_1687 != null && client.field_1724 != null) {
         class_631 var2 = client.field_1687.method_2935();
         class_1923 var3 = new class_1923((int)Math.floor(this.j) >> 4, (int)Math.floor(this.l) >> 4);
         class_1923 var4 = client.field_1724.method_31476();
         class_1923 var5 = var3;
         int var6 = Math.max(Math.abs(var3.field_9181 - var4.field_9181), Math.abs(var3.field_9180 - var4.field_9180));
         if (var6 + 4 > 32) {
            int var7 = (var3.field_9181 + var4.field_9181) / 2;
            int var8 = (var3.field_9180 + var4.field_9180) / 2;
            var5 = new class_1923(var7, var8);
         }

         int var10 = Math.max(
            Math.max(Math.abs(var5.field_9181 - var3.field_9181), Math.abs(var5.field_9180 - var3.field_9180)),
            Math.max(Math.abs(var5.field_9181 - var4.field_9181), Math.abs(var5.field_9180 - var4.field_9180))
         );
         int var11 = Math.min(32, Math.max(2, Math.round(this.h.d())));
         int var9 = Math.min(32, Math.max(var11, var10 + 4));
         if (var9 != this.D) {
            var2.method_20180(var9);
            this.D = var9;
         }

         if (this.C == null || var5.field_9181 != this.C.field_9181 || var5.field_9180 != this.C.field_9180) {
            var2.method_20317(var5.field_9181, var5.field_9180);
            this.C = var5;
            if (client.field_1769 != null) {
               client.field_1769.method_3292();
            }
         }
      }
   }

   private void g(class_310 client) {
      this.C = null;
      this.D = Integer.MIN_VALUE;
      if (client.field_1687 != null) {
         class_631 var2 = client.field_1687.method_2935();
         if (client.field_1724 != null) {
            class_1923 var3 = client.field_1724.method_31476();
            var2.method_20317(var3.field_9181, var3.field_9180);
         }

         var2.method_20180(client.field_1690.method_38521());
         if (client.field_1769 != null) {
            client.field_1769.method_3292();
         }
      }
   }

   private void h(class_310 mc) {
      this.z = mc.field_1730;
      mc.field_1730 = false;
   }

   private void i(class_310 mc) {
      mc.field_1730 = this.z;
      if (mc.field_1761 != null) {
         mc.field_1761.method_2925();
      }
   }

   public boolean m() {
      return this.f() && this.F;
   }

   public boolean n() {
      return this.d.i();
   }

   public boolean o() {
      return this.e.i();
   }

   public boolean p() {
      return !this.m() || this.o();
   }

   public boolean q() {
      return this.L;
   }

   public double a(float tickDelta) {
      return class_3532.method_16436((double)tickDelta, this.m, this.j);
   }

   public double b(float tickDelta) {
      return class_3532.method_16436((double)tickDelta, this.n, this.k);
   }

   public double c(float tickDelta) {
      return class_3532.method_16436((double)tickDelta, this.o, this.l);
   }

   public float d(float tickDelta) {
      return class_3532.method_16439(tickDelta, this.r, this.p);
   }

   public float e(float tickDelta) {
      return class_3532.method_16439(tickDelta, this.s, this.q);
   }

   public class_243 f(float tickDelta) {
      return new class_243(this.a(tickDelta), this.b(tickDelta), this.c(tickDelta));
   }

   public void a(float yaw, float pitch) {
      this.p = yaw;
      this.q = class_3532.method_15363(pitch, -90.0F, 90.0F);
   }

   public float r() {
      return this.p;
   }

   public float s() {
      return this.q;
   }

   public float t() {
      return this.g.d();
   }
}
