package pulsescanner.a;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class ab implements al {
   @Override
   public void a(pulsescanner.f.c.r var1, class_1309 var2, float[] var3, boolean var4) {
      class_243 var6 = aq.b(var2);
      float var7 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
      int var10000 = as.r();
      float var8 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var6.field_1351, Math.hypot(var6.field_1352, var6.field_1350))), -90.0, 90.0);
      int var5 = var10000;
      ak var9 = new ak(var7, var8);
      var10000 = var5;
      float var10 = ac.e(480.0F, 625.0F);
      float var11 = ac.e(455.0F, 555.0F);

      label20: {
         try {
            if (var10000 == 0) {
               return;
            }

            if (!k.a(a.field_1724.method_36454(), a.field_1724.method_36455(), (double)var1.o.g(), var2)) {
               break label20;
            }
         } catch (MatchException var12) {
            throw a(var12);
         }

         var11 = 0.0F;
         var10 = ac.c(450.0F, 700.0F);
      }

      d.a(var9, var10, var11, 425.0F, 425.0F, 0, 1, false);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
