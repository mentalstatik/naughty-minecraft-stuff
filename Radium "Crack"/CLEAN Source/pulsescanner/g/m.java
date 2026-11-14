package pulsescanner.g;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_238;
import net.minecraft.class_265;

public record m(double[] aQ, List<class_238> aR, class_238 aS, int aT) {
   public static m a(class_265 var0, int var1) {
      ArrayList var3 = new ArrayList();
      int[] var10000 = b.c();
      var0.method_1104(m::lambda$of$0);
      double[] var4 = new double[var3.size()];
      int var5 = 0;
      int[] var2 = var10000;

      while (var5 < var4.length) {
         var4[var5] = (Double)var3.get(var5);
         var5++;
         if (var2 != null) {
            break;
         }
      }

      return new m(var4, var0.method_1090(), var0.method_1107(), var1);
   }

   private static void lambda$of$0(List var0, double var1, double var3, double var5, double var7, double var9, double var11) {
      var0.add(var1);
      var0.add(var3);
      var0.add(var5);
      var0.add(var7);
      var0.add(var9);
      var0.add(var11);
   }
}
