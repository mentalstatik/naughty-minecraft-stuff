package dev.sixseven.g;

import dev.sixseven.d.a.ad;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597.class_4598;
import org.joml.Vector3fc;

public final class q {
   private static final int a = -24576;
   private static final double b = 16.0;
   private static final float c = 1.2F;

   private q() {
   }

   public static void a(class_4598 bufferSource, class_4587 poseStack, class_243 cam, ad module) {
      List var4 = module.g.a();
      if (!var4.isEmpty()) {
         boolean var5 = module.c.i();
         boolean var6 = module.b.i();
         boolean var7 = module.f.i();
         if (var5 || var6 || var7) {
            Vector3fc var8 = var7 ? class_310.method_1551().field_1773.method_19418().method_19335() : null;

            for (class_2338 var10 : var4) {
               if (var6) {
                  j.a(
                     bufferSource,
                     poseStack,
                     cam,
                     (double)var10.method_10263(),
                     (double)var10.method_10264(),
                     (double)var10.method_10260(),
                     (double)(var10.method_10263() + 1),
                     (double)(var10.method_10264() + 1),
                     (double)(var10.method_10260() + 1),
                     -24576,
                     2.0F
                  );
               }

               if (var5) {
                  j.a(
                     bufferSource,
                     poseStack,
                     cam,
                     (double)var10.method_10263() + 0.5,
                     (double)var10.method_10264() + 0.5,
                     (double)var10.method_10260() + 0.5,
                     16.0,
                     48,
                     dev.sixseven.n.c.a(-24576, 0.6F),
                     2.0F
                  );
               }

               if (var7) {
                  j.a(
                     bufferSource,
                     poseStack,
                     cam,
                     var8,
                     (double)var10.method_10263() + 0.5,
                     (double)var10.method_10264() + 0.5,
                     (double)var10.method_10260() + 0.5,
                     dev.sixseven.n.c.a(-24576, 0.7F),
                     1.2F
                  );
               }
            }

            j.a(bufferSource);
         }
      }
   }
}
