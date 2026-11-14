package dev.sixseven.c.a;

import java.util.function.BooleanSupplier;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_7923;

public class a extends dev.sixseven.c.a {
   private static final class_1304[] c = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   private static final float d = 22.0F;
   private static final float e = 7.0F;
   private static final float f = 6.0F;
   private static final float g = 3.0F;
   private final dev.sixseven.m.d h;

   public a(dev.sixseven.m.d themes, BooleanSupplier visible) {
      super("armor", 0.5F, 0.8F, visible);
      this.h = themes;
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      return 14.0F + (float)c.length * 22.0F + (float)(c.length - 1) * 6.0F;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      return 38.0F;
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.m.c var6 = this.h.a();
      class_746 var7 = class_310.method_1551().field_1724;
      if (var7 != null) {
         vg.a(x, y, w, hx, 9.0F, var6.f(), var6.g(), true);
         float var8 = x + 7.0F;

         for (class_1304 var12 : c) {
            class_1799 var13 = var7.method_6118(var12);
            float var14 = y + 4.0F;
            if (var13.method_7960()) {
               vg.b(var8, var14, 22.0F, 22.0F, 5.0F, 1.0F, dev.sixseven.n.c.a(var6.m(), 0.5F));
            } else {
               class_2960 var15 = class_7923.field_41178.method_10221(var13.method_7909());
               int var16 = dev.sixseven.g.b.c.a(class_2960.method_60655(var15.method_12836(), "textures/item/" + var15.method_12832() + ".png"));
               if (var16 > 0) {
                  vg.a(var16, var8, var14, 22.0F, 22.0F, var8, var14, 22.0F, 22.0F, 1.0F);
               } else {
                  vg.a(var8, var14, 22.0F, 22.0F, 5.0F, dev.sixseven.n.c.a(var6.a(), 0.3F));
               }

               if (var13.method_7963()) {
                  float var17 = 1.0F - (float)var13.method_7919() / (float)var13.method_7936();
                  int var18 = dev.sixseven.n.c.a(-1684147, -11671924, var17);
                  float var19 = var14 + 22.0F + 3.0F;
                  vg.a(var8, var19, 22.0F, 3.0F, 1.5F, dev.sixseven.n.c.a(-16777216, 0.45F));
                  vg.a(var8, var19, Math.max(3.0F, 22.0F * var17), 3.0F, 1.5F, var18);
               }
            }

            var8 += 28.0F;
         }
      }
   }
}
