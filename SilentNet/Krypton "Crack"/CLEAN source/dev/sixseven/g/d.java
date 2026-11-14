package dev.sixseven.g;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_2248;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class d {
   private static final int a = 32;
   private static final int b = 16000;
   private static final double c = 0.002;
   private static final o<d.a> d = new o<>(16, 32000, 20);
   private static Set<class_2248> e = Set.of();

   private d() {
   }

   public static void a() {
      d.d();
      e = Set.of();
   }

   public static int b() {
      return d.b().size();
   }

   public static void a(Map<Long, class_2248> var0) {
      if (!var0.isEmpty() && !e.isEmpty()) {
         d.a(var1 -> {
            class_2248 var2 = (class_2248)var0.get(o.a(var1.a(), var1.b(), var1.c()));
            return var2 != null && var2 != var1.d();
         });
      }
   }

   public static void a(dev.sixseven.d.a.o var0) {
      HashSet var1 = new HashSet();

      for (dev.sixseven.i.a.a var3 : var0.a.a()) {
         if (var3.a.i() && var3.b() != null) {
            var1.add(var3.b());
         }
      }

      if (var1.isEmpty()) {
         d.d();
         e = Set.of();
      } else {
         if (!var1.equals(e)) {
            e = var1;
            d.c();
         }

         int var6 = Math.min(32, Math.max(1, var0.i.e()));
         class_310 var7 = class_310.method_1551();
         int var4 = var7.field_1724 == null ? 0 : var7.field_1724.method_31476().field_9181;
         int var5 = var7.field_1724 == null ? 0 : var7.field_1724.method_31476().field_9180;
         d.a(
            var6,
            (var1x, var2) -> a(var1x, var1, var2),
            var0x -> o.a(Math.floorDiv(var0x.a(), 16), Math.floorDiv(var0x.c(), 16)),
            var3x -> Math.abs(Math.floorDiv(var3x.a(), 16) - var4) <= var6 && Math.abs(Math.floorDiv(var3x.c(), 16) - var5) <= var6
         );
      }
   }

   private static int a(class_2818 var0, Set<class_2248> var1, List<d.a> var2) {
      class_2826[] var3 = var0.method_12006();
      int var4 = var0.method_32891();
      int var5 = var0.method_12004().method_8326();
      int var6 = var0.method_12004().method_8328();
      short var7 = 0;
      if (var2.size() >= 8000) {
         return 0;
      } else {
         for (int var8 = 0; var8 < var3.length; var8++) {
            class_2826 var9 = var3[var8];
            if (!var9.method_38292() && var9.method_19523(var1x -> var1.contains(var1x.method_26204()))) {
               int var10 = var4 + var8 << 4;
               var7 += 4096;

               for (int var11 = 0; var11 < 16; var11++) {
                  for (int var12 = 0; var12 < 16; var12++) {
                     for (int var13 = 0; var13 < 16; var13++) {
                        class_2248 var14 = var9.method_12254(var13, var11, var12).method_26204();
                        if (var1.contains(var14)) {
                           var2.add(new d.a(var5 + var13, var10 + var11, var6 + var12, var14));
                           if (var2.size() >= 8000) {
                              return var7;
                           }
                        }
                     }
                  }
               }
            }
         }

         return var7;
      }
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, dev.sixseven.d.a.o var3) {
      List var4 = d.b();
      if (!var4.isEmpty()) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1724 == null) {
            return;
         }

         int var6 = var5.field_1724.method_31476().field_9181;
         int var7 = var5.field_1724.method_31476().field_9180;
         int var8 = Math.min(32, Math.max(1, var3.i.e()));
         HashMap var9 = new HashMap();

         for (dev.sixseven.i.a.a var11 : var3.a.a()) {
            if (var11.b() != null) {
               var9.put(var11.b(), var11.b.i());
            }
         }

         int var23 = var3.c.i();
         int var24 = Math.clamp((long)var3.h.e(), 0, 255);
         boolean var12 = var3.b.a("Both") || var3.b.a("Lines");
         boolean var13 = var3.b.a("Both") || var3.b.a("Sides");
         boolean var14 = var3.e.i() && var3.f.i();

         for (d.a var16 : var4) {
            int var17 = Math.floorDiv(var16.a(), 16);
            int var18 = Math.floorDiv(var16.c(), 16);
            if (Math.abs(var17 - var6) <= var8 && Math.abs(var18 - var7) <= var8) {
               int var19 = var9.getOrDefault(var16.d(), var23) & 16777215;
               int var20 = var19 | var24 << 24;
               if (var13) {
                  j.a(
                     var0,
                     var1,
                     var2,
                     (double)var16.a() + 0.002,
                     (double)var16.b() + 0.002,
                     (double)var16.c() + 0.002,
                     (double)(var16.a() + 1) - 0.002,
                     (double)(var16.b() + 1) - 0.002,
                     (double)(var16.c() + 1) - 0.002,
                     var20
                  );
               }

               if (var12) {
                  j.a(
                     var0,
                     var1,
                     var2,
                     (double)var16.a() + 0.002,
                     (double)var16.b() + 0.002,
                     (double)var16.c() + 0.002,
                     (double)(var16.a() + 1) - 0.002,
                     (double)(var16.b() + 1) - 0.002,
                     (double)(var16.c() + 1) - 0.002,
                     var20,
                     1.6F
                  );
               }
            }
         }

         if (var14) {
            int var25 = var3.g.i() >>> 24 & 0xFF;
            if (var25 == 0) {
               var25 = 200;
            }

            Vector3fc var26 = class_310.method_1551().field_1773.method_19418().method_19335();

            for (d.a var28 : var4) {
               int var29 = Math.floorDiv(var28.a(), 16);
               int var30 = Math.floorDiv(var28.c(), 16);
               if (Math.abs(var29 - var6) <= var8 && Math.abs(var30 - var7) <= var8) {
                  int var21 = var9.getOrDefault(var28.d(), var23) & 16777215;
                  int var22 = var21 | var25 << 24;
                  j.a(var0, var1, var2, var26, (double)var28.a() + 0.5, (double)var28.b() + 0.5, (double)var28.c() + 0.5, var22, 1.2F);
               }
            }
         }

         j.a(var0);
      }
   }

   private static record a(int a, int b, int c, class_2248 d) {
   }
}
