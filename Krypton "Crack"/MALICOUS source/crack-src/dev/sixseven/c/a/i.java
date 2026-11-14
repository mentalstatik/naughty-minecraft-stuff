package dev.sixseven.c.a;

import dev.sixseven.d.a.ag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class i extends dev.sixseven.c.a {
   private static final float c = 8.0F;
   private static final float d = 15.0F;
   private static final float e = 5.0F;
   private static final float f = 18.0F;
   private static final float g = 16.0F;
   private static final float h = 13.0F;
   private static final float i = 15.0F;
   private static final float j = 11.0F;
   private static final float k = 9.0F;
   private static final float l = 12.5F;
   private static final float m = 9.0F;
   private static final float n = 11.0F;
   private static final float o = 92.0F;
   private static final float p = 128.0F;
   private static final int q = -11870592;
   private static final int r = -340971;
   private static final int s = -495247;
   private final ag t;
   private final dev.sixseven.m.d u;
   private final Map<String, i.a> v = new LinkedHashMap<>();
   private List<dev.sixseven.k.b> w = List.of();
   private List<i.a> x = List.of();
   private float y = 108.0F;
   private float z = 52.0F;

   public i(ag var1, dev.sixseven.m.d var2) {
      super("staffList", 0.008F, 0.27F, var1::f);
      this.t = var1;
      this.u = var2;
   }

   private int a(List<dev.sixseven.k.b> var1) {
      return Math.min(var1.size(), Math.max(1, this.t.i.e()));
   }

   private List<i.a> b(List<dev.sixseven.k.b> var1) {
      int var3 = this.a(var1);
      HashSet var4 = new HashSet();

      for (int var5 = 0; var5 < var3 && var5 < var1.size(); var5++) {
         dev.sixseven.k.b var6 = (dev.sixseven.k.b)var1.get(var5);
         var4.add(var6.b());
         i.a var2 = this.v.get(var6.b());
         if (var2 == null) {
            var2 = new i.a(var6);
            this.v.put(var6.b(), var2);
         } else {
            var2.a = var6;
         }

         var2.b.a(1.0F);
      }

      ArrayList var8 = new ArrayList();

      for (int var9 = 0; var9 < var3 && var9 < var1.size(); var9++) {
         var8.add(this.v.get(((dev.sixseven.k.b)var1.get(var9)).b()));
      }

      Iterator var10 = this.v.values().iterator();

      while (var10.hasNext()) {
         i.a var7 = (i.a)var10.next();
         if (!var4.contains(var7.a.b())) {
            var7.b.a(0.0F);
            if (var7.b.b() <= 0.01F) {
               var10.remove();
            } else {
               var8.add(var7);
            }
         }
      }

      return var8;
   }

   private float a(dev.sixseven.g.b.d var1, dev.sixseven.k.b var2) {
      float var3 = 15.0F + Math.min(var1.a(var2.b(), 12.5F), 128.0F);
      if (this.t.f.i() && !var2.c().isEmpty()) {
         var3 += 6.0F + var1.a(var2.c(), 9.0F);
      }

      if (this.t.g.i()) {
         var3 += 19.0F;
      }

      return var3;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1) {
      List var2 = this.t.k();
      List var3 = this.b(var2);
      this.w = var2;
      this.x = var3;
      float var4 = 92.0F;
      String var5 = Integer.toString(var2.size());
      var4 = Math.max(var4, var1.a("STAFF", 9.0F) + 10.0F + var1.a(var5, 8.5F) + 9.0F);
      float var6 = 0.0F;

      for (i.a var8 : var3) {
         var4 = Math.max(var4, this.a(var1, var8.a));
         var6 += 18.0F * var8.b.b();
      }

      if (var2.isEmpty()) {
         var4 = Math.max(var4, 14.0F + var1.a("No staff online", 11.0F));
         if (var6 < 0.5F) {
            var6 = 16.0F;
         }
      }

      this.y = 16.0F + var4;
      this.z = 28.0F + var6 + 8.0F;
      if (var2.size() > this.a(var2)) {
         this.z += 13.0F;
      }
   }

   @Override
   public float b(dev.sixseven.g.b.d var1) {
      return this.y;
   }

   @Override
   public float c(dev.sixseven.g.b.d var1) {
      return this.z;
   }

   @Override
   public void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5) {
      dev.sixseven.m.c var6 = this.u.a();
      List var7 = this.w;
      var1.c(var2, var3, var4, var5, 13.0F, 8.0F, dev.sixseven.n.c.a(-16777216, 0.3F));
      var1.a(var2, var3, var4, var5, 10.0F, var6.f(), var6.g(), true);
      this.a(var1, var6, var2, var3, var4, var7.size());
      float var8 = var3 + 8.0F + 15.0F + 5.0F;
      if (var7.isEmpty()) {
         float var9 = var8 + 8.0F;
         var1.b(var2 + 8.0F, var9 - 4.0F, 8.0F, 1.7F, -11870592);
         var1.a("No staff online", var2 + 8.0F + 14.0F, var9, 11.0F, var6.l());
      } else {
         for (i.a var10 : this.x) {
            float var11 = Math.clamp(var10.b.b(), 0.0F, 1.0F);
            if (!(var11 <= 0.01F)) {
               this.a(var1, var6, var10.a, var2, var8, var4, var11);
               var8 += 18.0F * var11;
            }
         }

         int var13 = var7.size() - this.a(var7);
         if (var13 > 0) {
            var1.a("+" + var13 + " more", var2 + 8.0F + 15.0F, var8 + 6.5F, 9.0F, var6.m());
         }
      }
   }

   private void a(dev.sixseven.g.b.d var1, dev.sixseven.m.c var2, float var3, float var4, float var5, int var6) {
      float var7 = var4 + 8.0F + 7.5F;
      var1.a("STAFF", var3 + 8.0F, var7, 9.0F, var2.k());
      String var8 = Integer.toString(var6);
      float var9 = var1.a(var8, 8.5F);
      float var10 = var9 + 9.0F;
      float var11 = 12.5F;
      float var12 = var3 + var5 - 8.0F - var10;
      float var13 = var7 - var11 / 2.0F;
      boolean var14 = var6 > 0;
      var1.a(var12, var13, var10, var11, 6.0F, dev.sixseven.n.c.a(var2.a(), var14 ? 0.2F : 0.1F));
      var1.b(var12, var13, var10, var11, 6.0F, 1.0F, dev.sixseven.n.c.a(var2.a(), var14 ? 0.5F : 0.22F));
      var1.a(var8, var12 + 4.5F, var7, 8.5F, var14 ? var2.d() : var2.l());
   }

   private void a(dev.sixseven.g.b.d var1, dev.sixseven.m.c var2, dev.sixseven.k.b var3, float var4, float var5, float var6, float var7) {
      float var8 = var5 + 9.0F;
      int var9 = var3.a() ? var3.d() : var2.a();
      var1.e();
      var1.b(var7);
      var1.a((1.0F - var7) * -10.0F, 0.0F);
      this.a(var1, var4 + 8.0F + 7.5F - 2.0F, var8, 4.2F, var9, var3.e());
      float var10 = var4 + 8.0F + 15.0F;
      int var11 = var3.e() ? var2.l() : var2.k();
      float var12 = var1.a(var3.b(), var10, var8, 12.5F, var11, 128.0F);
      if (this.t.f.i() && !var3.c().isEmpty()) {
         int var13 = var3.a() ? dev.sixseven.n.c.b(var9, 0.25F) : var2.a();
         var1.a(var3.c(), var10 + var12 + 6.0F, var8 + 0.5F, 9.0F, dev.sixseven.n.c.a(var13, var3.e() ? 0.6F : 0.95F));
      }

      if (this.t.g.i()) {
         this.a(var1, var4 + var6 - 8.0F - 11.0F, var8, var3.f(), var2);
      }

      var1.f();
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, int var5, boolean var6) {
      if (var6) {
         var1.e();
         var1.a(var2, var3);
         var1.c((float) (Math.PI / 4));
         var1.b(-var4 * 0.55F, -var4 * 0.55F, var4 * 1.1F, var4 * 1.1F, var4 * 0.25F, 1.2F, dev.sixseven.n.c.a(var5, 0.55F));
         var1.f();
      } else {
         int var7 = dev.sixseven.n.c.b(var5, 0.4F);
         var1.a(var2, var3, var4 * 0.5F, var4 * 1.3F, dev.sixseven.n.c.a(var5, 0.5F));
         int var8 = dev.sixseven.n.c.a(var7, 0.9F);
         var1.b(var2, var3 - var4, var2, var3 + var4, 1.2F, var8);
         var1.b(var2 - var4, var3, var2 + var4, var3, 1.2F, var8);
         var1.e();
         var1.a(var2, var3);
         var1.c((float) (Math.PI / 4));
         var1.a(-var4 * 0.5F, -var4 * 0.5F, var4, var4, var4 * 0.22F, var5);
         var1.f();
      }
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, int var4, dev.sixseven.m.c var5) {
      int var6 = var4 < 0 ? 0 : (var4 <= 80 ? 4 : (var4 <= 150 ? 3 : (var4 <= 300 ? 2 : (var4 <= 600 ? 1 : 0))));
      int var7 = var6 >= 3 ? -11870592 : (var6 == 2 ? -340971 : -495247);

      for (int var8 = 0; var8 < 4; var8++) {
         float var9 = 2.0F + (float)var8 * 2.0F;
         float var10 = var2 + (float)var8 * 3.0F;
         float var11 = var3 + 4.0F - var9;
         int var12 = var8 < var6 ? var7 : dev.sixseven.n.c.a(var5.m(), 0.45F);
         var1.a(var10, var11, 2.0F, var9, 0.5F, var12);
      }
   }

   private static final class a {
      dev.sixseven.k.b a;
      final dev.sixseven.g.a.a b = new dev.sixseven.g.a.a(220.0F, 0.0F, dev.sixseven.g.a.b.b);

      a(dev.sixseven.k.b var1) {
         this.a = var1;
      }
   }
}
