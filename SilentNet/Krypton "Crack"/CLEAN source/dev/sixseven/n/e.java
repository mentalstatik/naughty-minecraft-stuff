package dev.sixseven.n;

import java.util.function.Predicate;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_2846.class_2847;

public final class e {
   private e() {
   }

   private static class_310 c() {
      return class_310.method_1551();
   }

   public static int a(int invIndex) {
      return invIndex < 9 ? invIndex + 36 : invIndex;
   }

   public static void b(int slot) {
      class_310 var1 = c();
      if (slot >= 0 && slot <= 8 && var1.field_1724 != null && var1.field_1724.method_31548().method_67532() != slot) {
         var1.field_1724.method_31548().method_61496(slot);
         if (var1.method_1562() != null) {
            var1.method_1562().method_52787(new class_2868(slot));
         }
      }
   }

   public static void a() {
      class_310 var0 = c();
      if (var0.field_1724 != null && var0.method_1562() != null) {
         var0.method_1562().method_52787(new class_2846(class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
      }
   }

   public static void a(int invIndex, int hotbarIndex) {
      class_310 var2 = c();
      if (var2.field_1724 != null && var2.field_1761 != null && invIndex >= 9 && invIndex <= 35 && hotbarIndex >= 0 && hotbarIndex <= 8) {
         var2.field_1761.method_2906(var2.field_1724.field_7512.field_7763, a(invIndex), hotbarIndex, class_1713.field_7791, var2.field_1724);
      }
   }

   public static void c(int slot) {
      b(slot);
   }

   public static class_1268 a(class_1792 item) {
      class_746 var1 = c().field_1724;
      if (var1 == null) {
         return null;
      } else if (var1.method_6047().method_31574(item)) {
         return class_1268.field_5808;
      } else {
         return var1.method_6079().method_31574(item) ? class_1268.field_5810 : null;
      }
   }

   public static int b(class_1792 item) {
      class_746 var1 = c().field_1724;
      if (var1 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (var1.method_31548().method_5438(var2).method_31574(item)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public static int c(class_1792 item) {
      class_746 var1 = c().field_1724;
      if (var1 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            if (var1.method_31548().method_5438(var2).method_31574(item)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public static boolean d(class_1792 item) {
      int var1 = b(item);
      if (var1 < 0) {
         return false;
      } else {
         b(var1);
         return true;
      }
   }

   public static boolean a(Predicate<class_1799> predicate) {
      class_746 var1 = c().field_1724;
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (predicate.test(var1.method_31548().method_5438(var2))) {
               b(var2);
               return true;
            }
         }

         return false;
      }
   }

   public static int b() {
      class_746 var0 = c().field_1724;
      if (var0 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (var0.method_31548().method_5438(var1).method_7960()) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static void d(int var0) {
      if (var0 >= 0 && var0 <= 35) {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 != null
            && var1.field_1761 != null
            && var1.field_1724.method_31548().method_5438(var0).method_31574(class_1802.field_8288)
            && !var1.field_1724.method_6079().method_31574(class_1802.field_8288)
            && var1.field_1724.field_7512.method_34255().method_7960()) {
            int var2 = var1.field_1724.field_7512.field_7763;
            int var3 = a(var0);
            var1.field_1761.method_2906(var2, var3, 0, class_1713.field_7790, (class_1657)var1.field_1724);
            var1.field_1761.method_2906(var2, 45, 0, class_1713.field_7790, (class_1657)var1.field_1724);
            var1.field_1761.method_2906(var2, var3, 0, class_1713.field_7790, (class_1657)var1.field_1724);
            return;
         }
      }
   }
}
