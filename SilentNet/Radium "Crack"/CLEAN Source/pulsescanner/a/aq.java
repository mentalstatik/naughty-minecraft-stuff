package pulsescanner.a;

import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public final class aq implements ad {
   private static final String b;

   public static class_243 a(class_1309 var0) {
      class_3532.method_15350(var0.method_23318() - var0.method_23318(), 0.0, (double)var0.method_17682());
      double var1 = class_3532.method_15350(a.field_1724.method_23317() - var0.method_23317(), 0.0, 0.0);
      double var3 = class_3532.method_15350(a.field_1724.method_23321() - var0.method_23321(), 0.0, 0.0);
      return new class_243(
         var0.method_23317() - a.field_1724.method_23317() + var1,
         var0.method_23318() - a.field_1724.method_23318() - 0.8F,
         var0.method_23321() - a.field_1724.method_23321() + var3
      );
   }

   public static class_243 a(class_243 var0, class_238 var1) {
      return new class_243(
         ac.c(var0.field_1352, var1.field_1323, var1.field_1320),
         ac.c(var0.field_1351, var1.field_1322, var1.field_1325),
         ac.c(var0.field_1350, var1.field_1321, var1.field_1324)
      );
   }

   public static double a(class_1297 var0) {
      return b(var0).method_1033();
   }

   public static class_243 b(class_1297 var0) {
      class_243 var1 = a.field_1724.method_33571();
      return a(var1, var0).method_1020(var1);
   }

   public static class_243 a(class_243 var0, class_1297 var1) {
      return a(var0, var1.method_5829());
   }

   public static class_243 b(class_1309 var0) {
      double var1 = class_3532.method_15350(var0.method_23320() - var0.method_23318(), 0.0, (double)var0.method_17682());
      double var3 = class_3532.method_15350(a.field_1724.method_23317() - var0.method_23317(), 0.0, 0.0);
      double var5 = class_3532.method_15350(a.field_1724.method_23321() - var0.method_23321(), 0.0, 0.0);
      return new class_243(
         var0.method_23317() - a.field_1724.method_23317() + var3,
         var0.method_23318() - a.field_1724.method_23320() + var1,
         var0.method_23321() - a.field_1724.method_23321() + var5
      );
   }

   private aq() {
      throw new UnsupportedOperationException(b);
   }

   public static boolean a(class_1297 var0, float var1, boolean var2) {
      int var3 = as.q();

      try {
         double var5;
         int var10000 = (var5 = a(var0) - (double)var1) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (UnsupportedOperationException var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   private static boolean a(class_238 var0, class_2338 var1) {
      int var2 = as.q();

      label30: {
         try {
            boolean var10000 = a.field_1687.method_8320(var1).method_27852(class_2246.field_10343);
            if (var2 != 0) {
               return var10000;
            }

            if (var10000) {
               break label30;
            }
         } catch (UnsupportedOperationException var4) {
            throw a(var4);
         }

         return false;
      }

      class_238 var3 = new class_238(var1);
      return var0.method_994(var3);
   }

   private static boolean b(class_238 var0, class_2338 var1) {
      return a(var0, var1);
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }

   static {
      char[] var10003 = "\u0017_])\u0019 VcV\u0014/M I*CMzZ%D0D\u0014;W-\u0005 VZ4V=\u0005!R\u00143W:Q\"Y@3X=@'".toCharArray();
      int var10004 = var10003.length;
      byte var5 = 30;
      char[] var10002 = var10003;
      int var1 = var10004;

      for (int var0 = 0; var1 > var0; var0++) {
         var10002[var0] = (char)(var10002[var0] ^ var5 ^ switch (var0 % 7) {
            case 0 -> 93;
            case 1 -> 41;
            case 2 -> 42;
            case 3 -> 68;
            case 4 -> 39;
            case 5 -> 87;
            default -> 59;
         });
      }

      String var7 = new String(var10002).intern();
      byte var3 = -1;
      b = var7;
   }
}
