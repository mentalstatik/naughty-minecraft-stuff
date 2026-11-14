package dev.sixseven.f;

import dev.sixseven.d.e;
import dev.sixseven.m.c;
import dev.sixseven.m.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a extends dev.sixseven.c.a {
   private static final float c = 12.0F;
   private static final float d = 30.0F;
   private static final float e = 42.0F;
   private static final float f = 6.0F;
   private static final float g = 13.5F;
   private static final float h = 11.0F;
   private static final float i = 26.0F;
   private static final float j = 168.0F;
   private static final float k = 30.0F;
   private final d l;
   private final e.c m;
   private final List<dev.sixseven.f.a.a> n = new ArrayList<>();

   public a(d var1, e.c var2) {
      super("notifications", 0.99F, 0.71F, () -> var2.f() && var2.q.i());
      this.l = var1;
      this.m = var2;
   }

   private boolean h() {
      return this.m.f() && this.m.q.i();
   }

   private float i() {
      return this.m.r.d();
   }

   public void a(String var1, boolean var2) {
      this.a(new dev.sixseven.f.a.a(var1 + (var2 ? " enabled" : " disabled"), null, null, var2));
   }

   public void a(String var1) {
      this.a(new dev.sixseven.f.a.a(var1, null, null, true));
   }

   public void a(String var1, String var2, dev.sixseven.f.a.b var3, boolean var4) {
      this.a(new dev.sixseven.f.a.a(var1, var2, var3, var4));
   }

   public boolean g() {
      long var1 = System.nanoTime();
      long var3 = (long)((double)this.i() * 1.0E9 + 3.0E8);
      List var5 = this.n;
      synchronized (var5) {
         Iterator var7 = this.n.iterator();

         while (var7.hasNext()) {
            if (var1 - ((dev.sixseven.f.a.a)var7.next()).e > var3) {
               var7.remove();
            }
         }

         return !this.n.isEmpty() || dev.sixseven.c.b.a();
      }
   }

   private void a(dev.sixseven.f.a.a var1) {
      if (this.h()) {
         List var2 = this.n;
         synchronized (var2) {
            this.n.add(var1);
            if (this.n.size() > 6) {
               this.n.removeFirst();
            }
         }
      }
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return 168.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      return 30.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
   }

   public void a(dev.sixseven.g.b.d var1, float var2, float var3) {
      c var4 = this.l.a();
      float var5 = this.i();
      float var6 = var5 * 1.0E9F;
      List var7 = this.n;
      synchronized (var7) {
         Iterator var9 = this.n.iterator();
         ArrayList var10 = new ArrayList();

         while (var9.hasNext()) {
            dev.sixseven.f.a.a var11 = (dev.sixseven.f.a.a)var9.next();
            if ((float)(System.nanoTime() - var11.e) > var6 + 3.0E8F) {
               var9.remove();
            } else {
               var10.add(var11);
            }
         }

         boolean var27 = dev.sixseven.c.b.a();
         if (!var10.isEmpty() || var27) {
            float var12 = this.d();
            float var13 = 168.0F * var12;
            float var14 = 30.0F * var12;
            float var15 = this.b() * (var2 - var13);
            float var16 = this.c() * (var3 - var14);
            var1.e();
            var1.a((float)Math.round(var15), (float)Math.round(var16));
            var1.a(var12);
            float var17 = 168.0F;
            float var18 = 30.0F;

            for (int var19 = var10.size() - 1; var19 >= 0; var19--) {
               dev.sixseven.f.a.a var20 = (dev.sixseven.f.a.a)var10.get(var19);
               float var21 = (float)(System.nanoTime() - var20.e) / 1.0E9F;
               float var22 = Math.clamp((var5 + 0.3F - var21) / 0.3F, 0.0F, 1.0F);
               float var23 = var20.f.b();
               float var24 = this.a(var1, var4, var17, var18, var23, var22, var20.a, var20.b, var20.c, var20.d);
               var18 -= var24 + 6.0F;
            }

            if (var10.isEmpty() && var27) {
               this.a(var1, var4, var17, var18, 1.0F, 0.5F, "Notification", null, null, true);
            }

            var1.f();
         }
      }
   }

   private float a(
      dev.sixseven.g.b.d var1, c var2, float var3, float var4, float var5, float var6, String var7, String var8, dev.sixseven.f.a.b var9, boolean var10
   ) {
      boolean var11 = var8 != null;
      float var12 = var11 ? 42.0F : 30.0F;
      float var13 = var9 != null ? 26.0F : 0.0F;
      float var14 = 16.0F + var13;
      float var15 = Math.max(var1.a(var7, 13.5F), var11 ? var1.a(var8, 11.0F) : 0.0F);
      float var16 = var14 + var15 + 12.0F;
      float var17 = var3 - var16 + (1.0F - var5) * (var16 + 10.0F);
      float var18 = var4 - var12;
      int var19 = var10 ? var2.a() : var2.m();
      var1.e();
      var1.b(var6);
      var1.a(var17, var18, var16, var12, 9.0F, var2.f(), var2.g(), true);
      var1.a(var17 + 3.0F, var18 + 5.0F, 3.0F, var12 - 10.0F, 1.5F, var19);
      var1.c(var17, var18, var16, var12, 9.0F, 5.0F, dev.sixseven.n.c.a(var19, 0.2F * var6));
      if (var9 != null) {
         this.a(var1, var17 + 12.0F + 2.0F + var13 / 2.0F - 4.0F, var18 + var12 / 2.0F, var9, var19, var2.d());
      }

      if (var11) {
         if (var10) {
            var1.a(var7, var17 + var14, var18 + var12 / 2.0F - 8.0F, 13.5F, var2.d(), var2.a());
         } else {
            var1.a(var7, var17 + var14, var18 + var12 / 2.0F - 8.0F, 13.5F, var2.k());
         }

         var1.a(var8, var17 + var14, var18 + var12 / 2.0F + 8.0F, 11.0F, var2.l());
      } else if (var10) {
         var1.a(var7, var17 + var14, var18 + var12 / 2.0F, 13.5F, var2.d(), var2.a());
      } else {
         var1.a(var7, var17 + var14, var18 + var12 / 2.0F, 13.5F, var2.l());
      }

      var1.f();
      return var12;
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, dev.sixseven.f.a.b var4, int var5, int var6) {
      switch (var4) {
         case a:
            this.a(var1, var2, var3 - 3.0F, var5);

            for (int var12 = -1; var12 <= 1; var12++) {
               float var13 = var2 + (float)var12 * 4.0F;
               var1.b(var13 + 1.0F, var3 + 4.0F, var13 - 1.0F, var3 + 9.0F, 1.6F, var5);
            }
            break;
         case b:
            this.a(var1, var2, var3 - 3.0F, var5);
            var1.b(var2 + 1.5F, var3 + 2.0F, var2 - 2.5F, var3 + 6.0F, 1.9F, var6);
            var1.b(var2 - 2.5F, var3 + 6.0F, var2 + 1.5F, var3 + 6.0F, 1.9F, var6);
            var1.b(var2 + 1.5F, var3 + 6.0F, var2 - 2.5F, var3 + 11.0F, 1.9F, var6);
            break;
         case c:
            var1.a(var2, var3, 4.5F, var6);

            for (int var7 = 0; var7 < 8; var7++) {
               double var8 = (double)var7 * Math.PI / 4.0;
               float var10 = (float)Math.cos(var8);
               float var11 = (float)Math.sin(var8);
               var1.b(var2 + var10 * 6.5F, var3 + var11 * 6.5F, var2 + var10 * 9.0F, var3 + var11 * 9.0F, 1.6F, var5);
            }
      }
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, int var4) {
      var1.a(var2 - 7.0F, var3 - 1.0F, 14.0F, 5.0F, 2.5F, var4);
      var1.a(var2 - 4.5F, var3 + 1.0F, 4.0F, var4);
      var1.a(var2 + 4.5F, var3 + 1.0F, 4.0F, var4);
      var1.a(var2, var3 - 2.5F, 5.0F, var4);
   }

   private static class a {
      final String a;
      final String b;
      final dev.sixseven.f.a.b c;
      final boolean d;
      final long e = System.nanoTime();
      final dev.sixseven.g.a.a f = new dev.sixseven.g.a.a(220.0F, 0.0F, dev.sixseven.g.a.b.b);

      a(String var1, String var2, dev.sixseven.f.a.b var3, boolean var4) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
         this.d = var4;
         this.f.a(1.0F);
      }
   }

   public static enum b {
      a,
      b,
      c;

      public static dev.sixseven.f.a.b[] a() {
         return (dev.sixseven.f.a.b[])d.clone();
      }

      public static dev.sixseven.f.a.b a(String param0) {
         return Enum.valueOf(dev.sixseven.f.a.b.class, var0);
      }
   }
}
