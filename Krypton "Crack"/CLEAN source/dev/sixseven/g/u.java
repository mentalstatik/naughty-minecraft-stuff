package dev.sixseven.g;

import dev.sixseven.d.a.ah;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_2248;
import net.minecraft.class_2260;
import net.minecraft.class_2281;
import net.minecraft.class_2315;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2363;
import net.minecraft.class_2377;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2496;
import net.minecraft.class_2531;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_3708;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class u {
   private static final int a = 16;
   private static final int b = 6000;
   private static final float c = 0.002F;
   private static final double d = 0.0625;
   private static final int e = 6579300;
   private static final float f = 1.0F;
   private static final float g = 1.15F;
   private static final int h = 180;
   private static final o<u.a> i = new o<>(16, 32000, 20);
   private static Set<ah.a> j = Set.of();
   private static double k = -1.0;

   private u() {
   }

   public static void a() {
      i.d();
      j = Set.of();
      k = -1.0;
   }

   public static int b() {
      return i.b().size();
   }

   public static long c() {
      return i.b().stream().filter(var0 -> var0.d() == ah.a.d).count();
   }

   public static void a(Map<Long, class_2248> var0) {
      if (!var0.isEmpty() && !j.isEmpty()) {
         i.a(var1 -> {
            long var2 = o.a(var1.a(), var1.b(), var1.c());
            return !var0.containsKey(var2) ? false : a((class_2248)var0.get(var2)) != var1.d();
         });
      }
   }

   public static void a(ah var0) {
      EnumSet var1 = EnumSet.noneOf(ah.a.class);

      for (ah.a var5 : ah.a.a()) {
         if (var0.a(var5)) {
            var1.add(var5);
         }
      }

      if (var1.isEmpty()) {
         i.d();
         j = Set.of();
         k = -1.0;
      } else {
         if (!var1.equals(j)) {
            j = Set.copyOf(var1);
            i.c();
         }

         double var16 = var0.b.i();
         if (var16 != k) {
            k = var16;
            i.c();
         }

         double var17 = var16 * var16;
         int var6 = (int)Math.ceil(var16 / 16.0) + 1;
         class_310 var7 = class_310.method_1551();
         class_746 var8 = var7.field_1724;
         int var9 = Math.min(Math.min(16, var6), (Integer)var7.field_1690.method_42503().method_41753());
         double var10 = var8 == null ? 0.0 : var8.method_23317();
         double var12 = var8 == null ? 0.0 : var8.method_23318();
         double var14 = var8 == null ? 0.0 : var8.method_23321();
         i.a(var9, (var3, var4) -> a(var3, var17, var1, var4), var0x -> o.a(Math.floorDiv(var0x.a(), 16), Math.floorDiv(var0x.c(), 16)), var8x -> {
            double var9x = (double)var8x.a() + 0.5 - var10;
            double var11 = (double)var8x.b() + 0.5 - var12;
            double var13 = (double)var8x.c() + 0.5 - var14;
            return var9x * var9x + var11 * var11 + var13 * var13 <= var17;
         });
      }
   }

   private static int a(class_2818 var0, double var1, Set<ah.a> var3, List<u.a> var4) {
      class_746 var5 = class_310.method_1551().field_1724;
      if (var5 == null) {
         return 0;
      } else {
         class_2826[] var6 = var0.method_12006();
         int var7 = var0.method_32891();
         int var8 = var0.method_12004().method_8326();
         int var9 = var0.method_12004().method_8328();
         short var10 = 0;
         if (var4.size() >= 6000) {
            return 0;
         } else {
            for (int var11 = 0; var11 < var6.length; var11++) {
               class_2826 var12 = var6[var11];
               if (!var12.method_38292() && var12.method_19523(var1x -> a(var1x, var3))) {
                  int var13 = var7 + var11 << 4;
                  var10 += 4096;

                  for (int var14 = 0; var14 < 16; var14++) {
                     for (int var15 = 0; var15 < 16; var15++) {
                        for (int var16 = 0; var16 < 16; var16++) {
                           ah.a var20 = a(var12.method_12254(var16, var14, var15).method_26204());
                           int var17;
                           int var18;
                           int var19;
                           if (var20 != null
                              && var3.contains(var20)
                              && !(
                                 var5.method_5649(
                                       (double)(var19 = var8 + var16) + 0.5, (double)(var18 = var13 + var14) + 0.5, (double)(var17 = var9 + var15) + 0.5
                                    )
                                    > var1
                              )) {
                              var4.add(new u.a(var19, var18, var17, var20));
                              if (var4.size() >= 6000) {
                                 return var10;
                              }
                           }
                        }
                     }
                  }
               }
            }

            return var10;
         }
      }
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, ah var3) {
      List var4 = i.b();
      if (!var4.isEmpty()) {
         class_310 var5 = class_310.method_1551();
         class_638 var6 = var5.field_1687;
         class_746 var7 = var5.field_1724;
         if (var6 != null && var7 != null) {
            boolean var8 = var3.a.a("Full");
            int var9 = Math.max(0, Math.min(255, var3.c.e())) << 24;
            boolean var10 = var3.d.i();
            boolean var11 = var3.k();
            double var12 = var3.b.i();
            double var14 = var12 * var12;
            double var16 = var7.method_23317();
            double var18 = var7.method_23318();
            double var20 = var7.method_23321();
            Vector3fc var22 = var5.field_1773.method_19418().method_19335();

            for (u.a var24 : var4) {
               ah.a var26 = var24.d();
               double var27 = (double)var24.a() + 0.5 - var16;
               double var29 = (double)var24.b() + 0.5 - var18;
               double var31 = (double)var24.c() + 0.5 - var20;
               boolean var25;
               if (!(var27 * var27 + var29 * var29 + var31 * var31 > var14) && var3.a(var26) && (!(var25 = var3.a(var24.a(), var24.b(), var24.c())) || !var11)) {
                  int var33 = var25 ? 6579300 : var3.b(var26) & 16777215;
                  int var34 = var9 | var33;
                  double var35 = (double)var24.a();
                  double var37 = (double)var24.b();
                  double var39 = (double)var24.c();
                  double var41 = var35 + 1.0;
                  double var43 = var37 + 1.0;
                  double var45 = var39 + 1.0;
                  if (var26 == ah.a.a || var26 == ah.a.b || var26 == ah.a.c) {
                     var35 += 0.0625;
                     var39 += 0.0625;
                     var41 -= 0.0625;
                     var43 -= 0.125;
                     var45 -= 0.0625;
                     class_2680 var47;
                     if ((var26 == ah.a.a || var26 == ah.a.b)
                        && (var47 = var6.method_8320(new class_2338(var24.a(), var24.b(), var24.c()))).method_26204() instanceof class_2281
                        && var47.method_11654(class_2281.field_10770) != class_2745.field_12569) {
                        class_2350 var49 = (class_2350)var47.method_11654(class_2281.field_10768);
                        class_2745 var50 = (class_2745)var47.method_11654(class_2281.field_10770);
                        class_2350 var48 = var50 == class_2745.field_12574 ? var49.method_10170() : var49.method_10160();
                        if (var48 == class_2350.field_11039) {
                           var35 = (double)var24.a();
                        } else if (var48 == class_2350.field_11034) {
                           var41 = (double)(var24.a() + 1);
                        } else if (var48 == class_2350.field_11043) {
                           var39 = (double)var24.c();
                        } else if (var48 == class_2350.field_11035) {
                           var45 = (double)(var24.c() + 1);
                        }
                     }
                  }

                  if (var8) {
                     dev.sixseven.g.j.a(var0, var1, var2, var35 - 0.002F, var37 - 0.002F, var39 - 0.002F, var41 + 0.002F, var43 + 0.002F, var45 + 0.002F, var34);
                  } else {
                     dev.sixseven.g.j.a(var0, var1, var2, var35, var37, var39, var41, var43, var45, var34, 1.0F);
                  }

                  if (var10) {
                     int var52 = -1275068416 | var33;
                     dev.sixseven.g.j.a(var0, var1, var2, var22, (var35 + var41) / 2.0, (var37 + var43) / 2.0, (var39 + var45) / 2.0, var52, 1.15F);
                  }
               }
            }

            dev.sixseven.g.j.a(var0);
         }
      }
   }

   private static boolean a(class_2680 var0, Set<ah.a> var1) {
      ah.a var2 = a(var0.method_26204());
      return var2 != null && var1.contains(var2);
   }

   private static ah.a a(class_2248 var0) {
      if (var0 instanceof class_2531) {
         return ah.a.b;
      } else if (var0 instanceof class_2281) {
         return ah.a.a;
      } else if (var0 instanceof class_2336) {
         return ah.a.c;
      } else if (var0 instanceof class_2480) {
         return ah.a.d;
      } else if (var0 instanceof class_3708) {
         return ah.a.e;
      } else if (var0 instanceof class_2496) {
         return ah.a.f;
      } else if (var0 instanceof class_2377) {
         return ah.a.g;
      } else if (var0 instanceof class_2363) {
         return ah.a.h;
      } else if (var0 instanceof class_2260) {
         return ah.a.h;
      } else {
         return var0 instanceof class_2315 ? ah.a.g : null;
      }
   }

   private static record a(int a, int b, int c, ah.a d) {
   }
}
