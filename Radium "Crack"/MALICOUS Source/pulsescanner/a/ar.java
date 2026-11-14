package pulsescanner.a;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_3532;

public class ar implements al {
   private float b;
   private float c = 24.0F;

   public ar() {
      this.b = 6.0F;
   }

   @Override
   public void a(pulsescanner.f.c.r var1, class_1309 var2, float[] var3, boolean var4) {
      int var5 = as.q();

      Object var10000;
      label52: {
         try {
            var10000 = a.field_1724;
            if (var5 != 0) {
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
            if (var5 != 0) {
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

      class_243 var6 = aq.b((class_1309)var10000);
      int var15 = var5;
      float var7 = ac.c(35.0F, 40.0F);
      float var8 = ac.c(4.0F, 8.0F);
      float var9 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
      float var10 = (float)class_3532.method_15350(-Math.toDegrees(Math.atan2(var6.field_1351, Math.hypot(var6.field_1352, var6.field_1350))), -90.0, 90.0);
      float var11 = 0.3F;

      label35: {
         label34: {
            try {
               if (var15 != 0) {
                  break label35;
               }

               if (!k.a(a.field_1724.method_36454(), a.field_1724.method_36455(), 5.0, var2)) {
                  break label34;
               }
            } catch (MatchException var12) {
               throw a(var12);
            }

            var7 = 0.0F;
            var8 = 0.0F;
         }

         this.c = this.c + (var7 - this.c) * var11;
         this.b = this.b + (var8 - this.b) * var11;
      }

      d.a(new ak(var9, var10), this.c, this.b, ac.b(360.0, 390.0), ac.b(360.0, 390.0), (int)ac.b(3.0, 5.0), 1, false);
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
