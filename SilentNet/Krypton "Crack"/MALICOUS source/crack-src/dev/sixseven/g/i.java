package dev.sixseven.g;

import dev.sixseven.d.a.S;
import dev.sixseven.d.a.Z;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1569;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class i {
   private static final float a = 1.2F;

   private i() {
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, Z var3) {
      class_310 var4 = class_310.method_1551();
      class_638 var5 = var4.field_1687;
      if (var5 != null && var4.field_1724 != null) {
         int var6 = var3.b.i();
         boolean var7 = var3.a.a("Glow");
         boolean var8 = var3.c.i();
         double var9 = var3.d.i();
         double var11 = var9 * var9;
         Vector3fc var13 = var8 ? var4.field_1773.method_19418().method_19335() : null;

         for (class_742 var15 : var5.method_18456()) {
            if (var15 != var4.field_1724 && var15.method_5805() && !var15.method_7325() && !(var4.field_1724.method_5858(var15) > var11)) {
               class_238 var16 = var15.method_5829();
               a(var0, var1, var2, var16, var6, var7);
               if (var8) {
                  a(var0, var1, var2, var13, var16, var6);
               }
            }
         }

         j.a(var0);
      }
   }

   public static void a(class_4598 var0, class_4587 var1, class_243 var2, S var3) {
      class_310 var4 = class_310.method_1551();
      class_638 var5 = var4.field_1687;
      if (var5 != null && var4.field_1724 != null) {
         int var6 = var3.a.i();
         int var7 = var3.b.i();
         boolean var8 = var3.c.i();
         boolean var9 = var3.d.i();
         double var10 = var3.e.i();
         double var12 = var10 * var10;
         Vector3fc var14 = var9 ? var4.field_1773.method_19418().method_19335() : null;

         for (class_1297 var16 : var5.method_18112()) {
            boolean var17;
            if (var16 instanceof class_1308
               && var16.method_5805()
               && ((var17 = var16 instanceof class_1569) || var8)
               && !(var4.field_1724.method_5858(var16) > var12)) {
               int var18 = var17 ? var6 : var7;
               class_238 var19 = var16.method_5829();
               a(var0, var1, var2, var19, var18, false);
               if (var9) {
                  a(var0, var1, var2, var14, var19, var18);
               }
            }
         }

         j.a(var0);
      }
   }

   private static void a(class_4598 var0, class_4587 var1, class_243 var2, class_238 var3, int var4, boolean var5) {
      j.a(var0, var1, var2, var3.field_1323, var3.field_1322, var3.field_1321, var3.field_1320, var3.field_1325, var3.field_1324, var4, 2.0F);
      if (var5) {
         j.a(
            var0,
            var1,
            var2,
            var3.field_1323,
            var3.field_1322,
            var3.field_1321,
            var3.field_1320,
            var3.field_1325,
            var3.field_1324,
            dev.sixseven.n.c.a(var4, 0.18F)
         );
      }
   }

   private static void a(class_4598 var0, class_4587 var1, class_243 var2, Vector3fc var3, class_238 var4, int var5) {
      j.a(
         var0,
         var1,
         var2,
         var3,
         (var4.field_1323 + var4.field_1320) / 2.0,
         (var4.field_1322 + var4.field_1325) / 2.0,
         (var4.field_1321 + var4.field_1324) / 2.0,
         dev.sixseven.n.c.a(var5, 0.72F),
         1.2F
      );
   }
}
