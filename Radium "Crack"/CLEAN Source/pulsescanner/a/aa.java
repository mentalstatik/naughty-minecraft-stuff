package pulsescanner.a;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class aa implements al {
   private float b;
   private float c = 34.0F;

   public aa() {
      this.b = 12.0F;
   }

   @Override
   public void a(pulsescanner.f.c.r var1, class_1309 var2, float[] var3, boolean var4) {
      int var5 = as.r();

      Object var10000;
      label52: {
         try {
            var10000 = a.field_1724;
            if (var5 == 0) {
               break label52;
            }

            if (a.field_1724 == null) {
               return;
            }
         } catch (MatchException var14) {
            throw a(var14);
         }

         var10000 = var2;
      }

      label44: {
         try {
            if (var5 == 0) {
               break label44;
            }

            if (var10000 == null) {
               return;
            }
         } catch (MatchException var13) {
            throw a(var13);
         }

         var10000 = var2;
      }

      class_243 var6 = aj.b(var10000.method_5829()).method_1020(a.field_1724.method_33571()).method_1029();
      float var7 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
      float var8 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var6.field_1351, Math.hypot(var6.field_1352, var6.field_1350))), -90.0, 90.0);
      float var9 = ac.c(50.0F, 80.0F);
      float var10 = ac.c(7.0F, 12.0F);

      label35: {
         label34: {
            try {
               var15 = a.field_1724.method_36454();
               if (var5 == 0) {
                  break label35;
               }

               if (!k.a(var15, a.field_1724.method_36455(), (double)var1.o.g(), var2)) {
                  break label34;
               }
            } catch (MatchException var12) {
               throw a(var12);
            }

            var9 = ac.c(3.0F, 4.0F);
            var10 = ac.c(1.0F, 2.0F);
         }

         var15 = 0.3F;
      }

      float var11 = var15;
      this.c = this.c + (var9 - this.c) * var11;
      this.b = this.b + (var10 - this.b) * var11;
      d.a(new ak(var7, var8), this.c, this.b, ac.b(360.0, 390.0), ac.b(360.0, 390.0), (int)ac.b(3.0, 5.0), 1, false);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
