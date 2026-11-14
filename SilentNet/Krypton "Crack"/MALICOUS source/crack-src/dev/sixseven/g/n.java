package dev.sixseven.g;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_2338.class_2339;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class n {
   private static final int a = 10;
   private static final int b = 16;
   private static final int c = 6;
   private static final Set<class_2248> d = Set.of(
      class_2246.field_10540, class_2246.field_22423, class_2246.field_9987, class_2246.field_23152, class_2246.field_38420
   );
   private static volatile List<n.a> e = List.of();
   private static int f;

   private n() {
   }

   public static void a() {
      e = List.of();
      f = 0;
   }

   public static void a(dev.sixseven.d.a.x module) {
      if (f++ % 10 == 0) {
         class_310 var1 = class_310.method_1551();
         class_638 var2 = var1.field_1687;
         class_746 var3 = var1.field_1724;
         if (var2 != null && var3 != null) {
            int var4 = module.a.a("Any") ? 1 : Integer.parseInt(module.a.i());
            class_2338 var5 = var3.method_24515();
            class_2339 var6 = new class_2339();
            ArrayList var7 = new ArrayList();

            for (int var8 = -16; var8 <= 16; var8++) {
               for (int var9 = -16; var9 <= 16; var9++) {
                  for (int var10 = -6; var10 <= 6; var10++) {
                     int var11 = var5.method_10263() + var8;
                     int var12 = var5.method_10264() + var10;
                     int var13 = var5.method_10260() + var9;
                     if (a(var2, var6, var11, var12, var13, var4)) {
                        var7.add(new n.a(var11, var12, var13, a(var2, var6, var11, var12, var13)));
                     }
                  }
               }
            }

            e = var7;
         }
      }
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, dev.sixseven.d.a.x module) {
      List var4 = e;
      if (!var4.isEmpty()) {
         int var5 = module.b.i();
         int var6 = module.c.i();
         boolean var7 = module.d.i();
         Vector3fc var8 = var7 ? class_310.method_1551().field_1773.method_19418().method_19335() : null;

         for (n.a var10 : var4) {
            int var11 = var10.d() ? var5 : var6;
            j.a(
               bufferSource,
               poseStack,
               cam,
               (double)var10.a(),
               (double)var10.b(),
               (double)var10.c(),
               (double)(var10.a() + 1),
               (double)(var10.b() + 1),
               (double)(var10.c() + 1),
               var11,
               2.0F
            );
            if (var7) {
               j.a(
                  bufferSource,
                  poseStack,
                  cam,
                  var8,
                  (double)var10.a() + 0.5,
                  (double)var10.b() + 0.5,
                  (double)var10.c() + 0.5,
                  dev.sixseven.n.c.a(var11, 0.72F),
                  1.2F
               );
            }
         }

         j.a(bufferSource);
      }
   }

   private static boolean a(class_638 level, class_2339 p, int x, int y, int z, int need) {
      if (!level.method_8320(p.method_10103(x, y - 1, z)).method_51366()) {
         return false;
      } else {
         for (int var6 = 0; var6 < need; var6++) {
            if (!level.method_8320(p.method_10103(x, y + var6, z)).method_26215()) {
               return false;
            }
         }

         return level.method_8320(p.method_10103(x + 1, y, z)).method_51366()
            && level.method_8320(p.method_10103(x - 1, y, z)).method_51366()
            && level.method_8320(p.method_10103(x, y, z + 1)).method_51366()
            && level.method_8320(p.method_10103(x, y, z - 1)).method_51366();
      }
   }

   private static boolean a(class_638 level, class_2339 p, int x, int y, int z) {
      return a(level.method_8320(p.method_10103(x, y - 1, z)))
         && a(level.method_8320(p.method_10103(x + 1, y, z)))
         && a(level.method_8320(p.method_10103(x - 1, y, z)))
         && a(level.method_8320(p.method_10103(x, y, z + 1)))
         && a(level.method_8320(p.method_10103(x, y, z - 1)));
   }

   private static boolean a(class_2680 state) {
      return d.contains(state.method_26204());
   }

   private static record a(int a, int b, int c, boolean d) {
   }
}
