package dev.sixseven.g;

import net.minecraft.class_1923;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;

public final class b {
   private b() {
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, dev.sixseven.d.a.m var3) {
      if (!var3.l().isEmpty()) {
         int var4 = var3.a.i() & 16777215;
         int var5 = Math.max(1, var3.n());
         double var6 = var3.p();
         double var8 = (var3.q() + 3.0) * 16.0;
         double var10 = var8 * var8;

         for (dev.sixseven.d.a.m.d var13 : var3.l()) {
            int var14 = class_1923.method_8325(var13.a());
            int var15 = class_1923.method_8332(var13.a());
            double var16 = (double)var14 * 16.0 + 8.0;
            double var18 = (double)var15 * 16.0 + 8.0;
            double var20 = var16 - var2.field_1352;
            double var22 = var18 - var2.field_1350;
            if (!(var20 * var20 + var22 * var22 > var10)) {
               float var24 = Math.clamp((float)var13.b() / (float)(var5 * 2), 0.0F, 1.0F);
               float var25 = var3.o() / 255.0F * (0.35F + var24 * 0.65F);
               int var26 = dev.sixseven.n.c.a(dev.sixseven.n.c.c(var4, 0.55F), var25 * 0.72F);
               int var27 = dev.sixseven.n.c.a(dev.sixseven.n.c.b(var4, 0.22F), Math.min(1.0F, var25 + 0.18F));
               double var28 = (double)var14 * 16.0;
               double var30 = (double)var15 * 16.0;
               double var32 = var28 + 16.0;
               double var34 = var30 + 16.0;
               k.a(var0, var1, var2, var28, var30, var32, var34, var6, var26);
               k.a(var0, var1, var2, var28, var30, var32, var30, var6, var27, 2.0F);
               k.a(var0, var1, var2, var32, var30, var32, var34, var6, var27, 2.0F);
               k.a(var0, var1, var2, var32, var34, var28, var34, var6, var27, 2.0F);
               k.a(var0, var1, var2, var28, var34, var28, var30, var6, var27, 2.0F);
            }
         }

         for (dev.sixseven.d.a.m.e var37 : var3.m()) {
            double var38 = var37.b() - var2.field_1352;
            double var39 = var37.c() - var2.field_1350;
            if (!(var38 * var38 + var39 * var39 > var10) && var37.a().size() >= 2) {
               float var40 = Math.clamp((float)var37.d() / (float)(var5 * 2), 0.0F, 1.0F);
               k.a(
                  var0,
                  var1,
                  var2,
                  var37.b(),
                  var37.c(),
                  var6 + 0.05,
                  Math.min(5.0, 2.5 + Math.sqrt((double)var37.a().size())),
                  dev.sixseven.n.c.a(dev.sixseven.n.c.b(var4, 0.5F), 0.55F + var40 * 0.45F)
               );
            }
         }

         k.a(var0);
      }
   }
}
