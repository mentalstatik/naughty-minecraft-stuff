package dev.sixseven.c.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BooleanSupplier;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class e extends dev.sixseven.c.a {
   private static final float c = 24.0F;
   private static final float d = 18.0F;
   private static final float e = 7.0F;
   private static final float f = 12.5F;
   private final dev.sixseven.m.d g;

   public e(dev.sixseven.m.d themes, BooleanSupplier visible) {
      super("potions", 0.995F, 0.6F, visible);
      this.g = themes;
   }

   private List<class_1293> g() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         return List.of();
      } else {
         ArrayList var2 = new ArrayList(var1.method_6026());
         var2.sort(Comparator.comparingInt(class_1293::method_5584).reversed());
         return var2;
      }
   }

   private static String a(class_1293 effect) {
      String var1 = ((class_1291)effect.method_5579().comp_349()).method_5560().getString();
      int var2 = effect.method_5578();
      return var2 > 0 ? var1 + " " + (var2 + 1) : var1;
   }

   private static String b(class_1293 effect) {
      if (effect.method_48559()) {
         return "∞";
      } else {
         int var1 = effect.method_5584() / 20;
         return String.format("%d:%02d", var1 / 60, var1 % 60);
      }
   }

   @Override
   public float b(dev.sixseven.g.b.d vg) {
      float var2 = 110.0F;

      for (class_1293 var4 : this.g()) {
         var2 = Math.max(var2, 31.0F + vg.a(a(var4), 12.5F) + 10.0F + vg.a(b(var4), 12.5F) + 7.0F);
      }

      return var2;
   }

   @Override
   public float c(dev.sixseven.g.b.d vg) {
      return Math.max(24.0F, (float)this.g().size() * 24.0F);
   }

   @Override
   public void a(dev.sixseven.g.b.d vg, float x, float y, float w, float h) {
      dev.sixseven.m.c var6 = this.g.a();
      List var7 = this.g();
      if (!var7.isEmpty()) {
         boolean var8 = this.f();
         float var9 = y;

         for (class_1293 var11 : var7) {
            float var12 = vg.a(a(var11), 12.5F);
            float var13 = vg.a(b(var11), 12.5F);
            float var14 = 31.0F + var12 + 10.0F + var13 + 7.0F;
            float var15 = var8 ? x + w - var14 : x;
            float var16 = var9 + 12.0F;
            vg.a(var15, var9 + 1.0F, var14, 22.0F, 7.0F, dev.sixseven.n.c.a(-15462118, 0.78F));
            class_2960 var17 = var11.method_5579().method_40230().map(k -> k.method_29177()).orElse(null);
            if (var17 != null) {
               int var18 = dev.sixseven.g.b.c.a(class_2960.method_60655(var17.method_12836(), "textures/mob_effect/" + var17.method_12832() + ".png"));
               if (var18 > 0) {
                  vg.a(var18, var15 + 7.0F, var16 - 9.0F, 18.0F, 18.0F, var15 + 7.0F, var16 - 9.0F, 18.0F, 18.0F, 1.0F);
               }
            }

            vg.a(a(var11), var15 + 7.0F + 18.0F + 6.0F, var16, 12.5F, var6.k());
            vg.a(b(var11), var15 + var14 - 7.0F - var13, var16, 12.5F, var6.d(), var6.a());
            var9 += 24.0F;
         }
      }
   }
}
