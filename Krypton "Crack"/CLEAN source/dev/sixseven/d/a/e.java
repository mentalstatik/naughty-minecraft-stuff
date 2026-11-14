package dev.sixseven.d.a;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.class_10192;
import net.minecraft.class_1304;
import net.minecraft.class_1320;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9285;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

public final class e extends dev.sixseven.d.c {
   private static final class_1304[] a = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};

   public e() {
      super("Auto Armor", "Equips stronger armor using armor attributes and enchantments", dev.sixseven.d.b.b);
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 == null) {
         class_746 var2 = var1.field_1724;
         if (var2.field_7512.method_34255().method_7960()) {
            for (class_1304 var6 : a) {
               class_1799 var7 = var2.method_6118(var6);
               double var8 = a(var7, var6);
               int var10 = -1;
               double var11 = var8;

               for (int var13 = 0; var13 < 36; var13++) {
                  class_1799 var14 = var2.method_31548().method_5438(var13);
                  double var15 = a(var14, var6);
                  if (var15 > var11 + 0.01) {
                     var11 = var15;
                     var10 = var13;
                  }
               }

               if (var10 >= 0) {
                  this.a(var1, var10, var6);
                  return;
               }
            }
         }
      }
   }

   private void a(class_310 var1, int var2, class_1304 var3) {
      int var4 = var1.field_1724.field_7512.field_7763;
      int var5 = var2 < 9 ? var2 + 36 : var2;
      int var6 = 8 - var3.method_5927();
      var1.field_1761.method_2906(var4, var5, 0, class_1713.field_7790, var1.field_1724);
      var1.field_1761.method_2906(var4, var6, 0, class_1713.field_7790, var1.field_1724);
      var1.field_1761.method_2906(var4, var5, 0, class_1713.field_7790, var1.field_1724);
   }

   private static double a(class_1799 var0, class_1304 var1) {
      if (var0 != null && !var0.method_7960()) {
         class_10192 var2 = (class_10192)var0.method_58694(class_9334.field_54196);
         if (var2 != null && var2.comp_3174() == var1) {
            double[] var3 = new double[]{0.0};
            class_9285 var4 = (class_9285)var0.method_58694(class_9334.field_49636);
            if (var4 != null) {
               var4.method_57482(var1, (var1x, var2x) -> {
                  class_1320 var3x = (class_1320)var1x.comp_349();
                  String var4x = var3x.method_26830();
                  double var5x = var2x.comp_2449();
                  if (var4x.contains("armor_toughness")) {
                     var3[0] += var5x * 30.0;
                  } else if (var4x.contains("armor")) {
                     var3[0] += var5x * 100.0;
                  } else if (var4x.contains("knockback_resistance")) {
                     var3[0] += var5x * 20.0;
                  }
               });
            }

            class_9304 var5 = var0.method_58657();

            for (Entry var7 : var5.method_57539()) {
               class_5321 var8 = (class_5321)((class_6880)var7.getKey()).method_40230().orElse(null);
               if (var8 != null) {
                  String var9 = var8.method_29177().toString();
                  int var10 = var7.getIntValue();
                  var3[0] += a(var9, var10);
               }
            }

            return var3[0];
         } else {
            return -1.0;
         }
      } else {
         return -1.0;
      }
   }

   private static double a(String var0, int var1) {
      if (var0.endsWith(":protection")) {
         return 120.0 * (double)var1;
      } else if (var0.endsWith(":blast_protection")) {
         return 95.0 * (double)var1;
      } else if (var0.endsWith(":fire_protection")) {
         return 85.0 * (double)var1;
      } else if (var0.endsWith(":projectile_protection")) {
         return 80.0 * (double)var1;
      } else if (var0.endsWith(":feather_falling")) {
         return 85.0 * (double)var1;
      } else if (var0.endsWith(":mending")) {
         return 55.0;
      } else if (var0.endsWith(":thorns")) {
         return 18.0 * (double)var1;
      } else if (var0.endsWith(":unbreaking")) {
         return 12.0 * (double)var1;
      } else if (var0.endsWith(":respiration")) {
         return 8.0 * (double)var1;
      } else if (var0.endsWith(":aqua_affinity")) {
         return 8.0;
      } else if (var0.endsWith(":swift_sneak")) {
         return 8.0 * (double)var1;
      } else if (var0.endsWith(":depth_strider") || var0.endsWith(":frost_walker")) {
         return 7.0 * (double)var1;
      } else if (var0.endsWith(":soul_speed")) {
         return 5.0 * (double)var1;
      } else {
         return var0.endsWith(":binding_curse") ? -10000.0 : 0.0;
      }
   }
}
