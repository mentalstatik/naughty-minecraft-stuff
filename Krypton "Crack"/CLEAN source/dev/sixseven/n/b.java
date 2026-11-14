package dev.sixseven.n;

import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4969;

public final class b {
   private b() {
   }

   public static boolean a(class_2338 pos, class_2248 block) {
      class_310 var2 = class_310.method_1551();
      return var2.field_1687 != null && var2.field_1687.method_8320(pos).method_27852(block);
   }

   public static boolean a(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      return a(pos, class_2246.field_23152) && (Integer)var1.field_1687.method_8320(pos).method_11654(class_4969.field_23153) != 0;
   }

   public static boolean b(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      return a(pos, class_2246.field_23152) && (Integer)var1.field_1687.method_8320(pos).method_11654(class_4969.field_23153) == 0;
   }

   public static void a(class_3965 hit, boolean swing) {
      a(hit, class_1268.field_5808, swing);
   }

   public static void a(class_3965 hit, class_1268 hand, boolean swing) {
      class_310 var3 = class_310.method_1551();
      if (var3.field_1724 != null && var3.field_1761 != null) {
         class_1269 var4 = var3.field_1761.method_2896(var3.field_1724, hand, hit);
         if (var4.method_23665() && swing) {
            var3.field_1724.method_6104(hand);
         }
      }
   }
}
