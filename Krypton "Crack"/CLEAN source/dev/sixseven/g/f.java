package dev.sixseven.g;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class f {
   private final Predicate<class_2680> a;
   private final int b;
   private final int c;
   private final int d;
   private final double e;
   private volatile List<class_2338> f = List.of();
   private int g;

   public f(Predicate<class_2680> predicate, int intervalTicks, int maxChunkRadius, int maxResults, double range) {
      this.a = predicate;
      this.b = intervalTicks;
      this.c = maxChunkRadius;
      this.d = maxResults;
      this.e = range * range;
   }

   public List<class_2338> a() {
      return this.f;
   }

   public void b() {
      this.f = List.of();
      this.g = 0;
   }

   public void c() {
      if (this.g++ % this.b == 0) {
         class_310 var1 = class_310.method_1551();
         class_638 var2 = var1.field_1687;
         class_746 var3 = var1.field_1724;
         if (var2 != null && var3 != null) {
            int var4 = Math.min(this.c, (Integer)var1.field_1690.method_42503().method_41753());
            int var5 = var3.method_31476().field_9181;
            int var6 = var3.method_31476().field_9180;
            ArrayList var7 = new ArrayList();

            for (int var8 = var5 - var4; var8 <= var5 + var4 && var7.size() < this.d; var8++) {
               for (int var9 = var6 - var4; var9 <= var6 + var4 && var7.size() < this.d; var9++) {
                  class_2818 var10 = var2.method_8497(var8, var9);
                  class_2826[] var11 = var10.method_12006();
                  int var12 = var10.method_32891();
                  int var13 = var10.method_12004().method_8326();
                  int var14 = var10.method_12004().method_8328();

                  for (int var15 = 0; var15 < var11.length; var15++) {
                     class_2826 var16 = var11[var15];
                     if (!var16.method_38292() && var16.method_19523(this.a)) {
                        int var17 = var12 + var15 << 4;

                        for (int var18 = 0; var18 < 16; var18++) {
                           for (int var19 = 0; var19 < 16; var19++) {
                              for (int var20 = 0; var20 < 16; var20++) {
                                 if (this.a.test(var16.method_12254(var20, var18, var19))) {
                                    int var21 = var13 + var20;
                                    int var22 = var17 + var18;
                                    int var23 = var14 + var19;
                                    if (!(var3.method_5649((double)var21 + 0.5, (double)var22 + 0.5, (double)var23 + 0.5) > this.e)) {
                                       var7.add(new class_2338(var21, var22, var23));
                                       if (var7.size() >= this.d) {
                                          break;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            this.f = var7;
         }
      }
   }
}
