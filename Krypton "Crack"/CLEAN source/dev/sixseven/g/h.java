package dev.sixseven.g;

import net.minecraft.class_1923;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;

public final class h {
   private static final float a = 55.0F;
   private static final int b = 190;

   private h() {
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, dev.sixseven.d.a.r var3) {
      if (!var3.k().isEmpty()) {
         int var4 = var3.a.i() & 16777215;
         int var5 = dev.sixseven.n.c.a(dev.sixseven.n.c.c(var4, 0.58F), 190);
         int var6 = dev.sixseven.n.c.a(var4, 255);

         for (long var8 : var3.k()) {
            double var10 = (double)class_1923.method_8325(var8) * 16.0;
            double var12 = (double)class_1923.method_8332(var8) * 16.0;
            double var14 = var10 + 16.0;
            double var16 = var12 + 16.0;
            k.a(var0, var1, var2, var10, var12, var14, var16, 55.0, var5);
            k.a(var0, var1, var2, var10, var12, var14, var12, 55.0, var6, 2.0F);
            k.a(var0, var1, var2, var14, var12, var14, var16, 55.0, var6, 2.0F);
            k.a(var0, var1, var2, var14, var16, var10, var16, 55.0, var6, 2.0F);
            k.a(var0, var1, var2, var10, var16, var10, var12, 55.0, var6, 2.0F);
         }

         k.a(var0);
      }
   }
}
