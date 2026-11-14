package dev.sixseven.g;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class c {
   private static final double a = 0.002;
   private static final float b = 1.2F;

   private c() {
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, dev.sixseven.d.a.n var3) {
      List var4 = var3.n();
      if (!var4.isEmpty()) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1687 != null) {
            boolean var6 = var3.b.a("Full");
            int var7 = Math.clamp((long)var3.d.e(), 0, 255);
            boolean var8 = var3.f.i();
            boolean var9 = var3.e.i();
            int var10 = var3.g.i();
            Vector3fc var11 = var9 ? var5.field_1773.method_19418().method_19335() : null;

            for (dev.sixseven.d.a.n.c var13 : var4) {
               String var14 = var13.b();
               if (var3.a.b(var14)) {
                  class_2338 var15 = var13.a();
                  boolean var16 = var13.c();
                  if (!var16 || var8) {
                     int var17 = a(var3.a.c(var14) & 16777215, var16, var10);
                     int var18 = var17 | var7 << 24;
                     double var19 = (double)var15.method_10263();
                     double var21 = (double)var15.method_10264();
                     double var23 = (double)var15.method_10260();
                     double var25 = var19 + 1.0;
                     double var27 = var21 + 1.0;
                     double var29 = var23 + 1.0;
                     if (var6) {
                        j.a(var0, var1, var2, var19 - 0.002, var21 - 0.002, var23 - 0.002, var25 + 0.002, var27 + 0.002, var29 + 0.002, var18);
                     } else {
                        j.a(var0, var1, var2, var19, var21, var23, var25, var27, var29, var18, 1.6F);
                     }

                     if (var9) {
                        int var31 = var17 | Math.max(var7, 160) << 24;
                        j.a(var0, var1, var2, var11, var19 + 0.5, var21 + 0.5, var23 + 0.5, var31, 1.2F);
                     }
                  }
               }
            }

            j.a(var0);
         }
      }
   }

   private static int a(int var0, boolean var1, int var2) {
      if (!var1) {
         return var0;
      } else {
         int var3 = var0 >> 16 & 0xFF;
         int var4 = var0 >> 8 & 0xFF;
         int var5 = var0 & 0xFF;
         int var6 = var2 >> 16 & 0xFF;
         int var7 = var2 >> 8 & 0xFF;
         int var8 = var2 & 0xFF;
         return (var3 + var6) / 2 << 16 | (var4 + var7) / 2 << 8 | (var5 + var8) / 2;
      }
   }
}
