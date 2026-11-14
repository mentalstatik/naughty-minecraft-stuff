package dev.sixseven.g;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.class_1923;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;

public final class v {
   private static final float a = 0.3F;
   private static final float b = 0.45F;
   private static final float c = 7.0F;
   private static final Map<Long, v.a> d = new HashMap<>();
   private static final Map<Long, v.b> e = new HashMap<>();
   private static long f;

   private v() {
   }

   public static void a() {
      d.clear();
      e.clear();
   }

   public static String b() {
      StringBuilder var0 = new StringBuilder();

      for (Entry var2 : d.entrySet()) {
         v.a var3 = (v.a)var2.getValue();
         var0.append(new class_1923((Long)var2.getKey())).append("{a=").append(var3.a).append(",t=").append(var3.b).append(",f=").append(var3.c).append("} ");
      }

      for (Entry var5 : e.entrySet()) {
         v.b var6 = (v.b)var5.getValue();
         var0.append("zone")
            .append(new class_1923((Long)var5.getKey()))
            .append("{a=")
            .append(var6.g)
            .append(",s=")
            .append(var6.e)
            .append(",f=")
            .append(var6.i)
            .append("} ");
      }

      return var0.toString();
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, dev.sixseven.d.e.f var3) {
      dev.sixseven.l.b var4 = var3.s;
      double var5 = var3.j.i();
      int var7 = var3.a.i() & 16777215;
      float var8 = var3.k.d() / 255.0F;
      float var9 = var3.m.d() / 255.0F;
      boolean var10 = var3.l.i();
      boolean var11 = var3.n.i();
      int var12 = var4.c();
      a(var4, var11, var12);
      float var13 = c();
      float var14 = 1.0F - (float)Math.exp((double)(-var13 * 7.0F));
      Iterator var15 = d.entrySet().iterator();

      while (var15.hasNext()) {
         Entry var16 = (Entry)var15.next();
         v.a var17 = (v.a)var16.getValue();
         var17.a = var17.a + (var17.c ? var13 / 0.3F : -var13 / 0.45F);
         var17.a = Math.clamp(var17.a, 0.0F, 1.0F);
         if (!var17.c && var17.a <= 0.0F) {
            var15.remove();
         } else {
            double var18 = (double)class_1923.method_8325((Long)var16.getKey()) * 16.0;
            double var20 = (double)class_1923.method_8332((Long)var16.getKey()) * 16.0;
            a(var0, var1, var2, var18, var20, var18 + 16.0, var20 + 16.0, var5, var7, var8 * var17.b * var17.a, var10 ? var9 * var17.a : 0.0F);
         }
      }

      Iterator var22 = e.entrySet().iterator();

      while (var22.hasNext()) {
         v.b var23 = (v.b)((Entry)var22.next()).getValue();
         var23.g = var23.g + (var23.i ? var13 / 0.3F : -var13 / 0.45F);
         var23.g = Math.clamp(var23.g, 0.0F, 1.0F);
         if (!var23.i && var23.g <= 0.0F) {
            var22.remove();
         } else {
            var23.a = var23.a + (var23.c - var23.a) * (double)var14;
            var23.b = var23.b + (var23.d - var23.b) * (double)var14;
            var23.e = var23.e + (var23.f - var23.e) * var14;
            double var24 = (double)var23.e / 2.0;
            a(
               var0,
               var1,
               var2,
               var23.a - var24,
               var23.b - var24,
               var23.a + var24,
               var23.b + var24,
               var5,
               var7,
               var8 * var23.h * var23.g,
               var10 ? var9 * var23.g : 0.0F
            );
            if (var3.p.i()) {
               k.a(var0, var1, var2, var23.a, var23.b, var5 + 0.05, 2.0, dev.sixseven.n.c.a(var7, 0.95F * var23.g));
            }
         }
      }

      k.a(var0);
   }

   private static void a(
      class_4598 var0, class_4587 var1, class_243 var2, double var3, double var5, double var7, double var9, double var11, int var13, float var14, float var15
   ) {
      k.a(var0, var1, var2, var3, var5, var7, var9, var11, dev.sixseven.n.c.a(var13, var14));
      if (var15 > 0.004F) {
         int var16 = dev.sixseven.n.c.a(var13, var15);
         k.a(var0, var1, var2, var3, var5, var7, var5, var11, var16, 2.5F);
         k.a(var0, var1, var2, var3, var9, var7, var9, var11, var16, 2.5F);
         k.a(var0, var1, var2, var3, var5, var3, var9, var11, var16, 2.5F);
         k.a(var0, var1, var2, var7, var5, var7, var9, var11, var16, 2.5F);
      }
   }

   private static void a(dev.sixseven.l.b var0, boolean var1, int var2) {
      for (v.a var4 : d.values()) {
         var4.c = false;
      }

      for (v.b var13 : e.values()) {
         var13.i = false;
      }

      if (var1) {
         for (dev.sixseven.l.b.g var14 : var0.b()) {
            if (var14.a().size() == 1) {
               long var16 = var14.a().iterator().next();
               v.a var18 = d.computeIfAbsent(var16, var0x -> new v.a());
               var18.c = true;
               var18.b = a(var14.e(), var2);
            } else {
               long var5 = Long.MAX_VALUE;

               for (long var8 : var14.a()) {
                  var5 = Math.min(var5, var8);
               }

               v.b var19 = e.get(var5);
               if (var19 == null) {
                  var19 = new v.b(var14.b(), var14.c());
                  e.put(var5, var19);
               }

               var19.i = true;
               var19.c = var14.b();
               var19.d = var14.c();
               var19.f = Math.min(48.0F, 16.0F + (float)(var14.a().size() - 1) * 8.0F);
               var19.h = a(var14.e(), var2);
            }
         }
      } else {
         for (dev.sixseven.l.b.b var15 : var0.a()) {
            v.a var17 = d.computeIfAbsent(var15.a(), var0x -> new v.a());
            var17.c = true;
            var17.b = 1.0F;
         }
      }
   }

   private static float a(double var0, int var2) {
      if (var2 <= 0) {
         return 1.0F;
      } else {
         float var3 = (float)((var0 - (double)var2) / ((double)var2 * 2.0));
         return 0.55F + 0.45F * Math.clamp(var3, 0.0F, 1.0F);
      }
   }

   private static float c() {
      long var0 = System.nanoTime();
      float var2 = f == 0L ? 0.016F : (float)(var0 - f) / 1.0E9F;
      f = var0;
      return Math.min(var2, 0.1F);
   }

   private static final class a {
      float a;
      float b = 1.0F;
      boolean c;
   }

   private static final class b {
      double a;
      double b;
      double c;
      double d;
      float e = 16.0F;
      float f = 16.0F;
      float g;
      float h = 1.0F;
      boolean i;

      b(double var1, double var3) {
         this.a = this.c = var1;
         this.b = this.d = var3;
      }
   }
}
