package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_1309.class})
public class LivingEntitySwingMixin {
   @ModifyReturnValue(
      method = {"method_6028"},
      at = {@At("RETURN")}
   )
   private int sixsevenclient$swingSpeed(int original) {
      class_1309 var2 = (class_1309)this;
      if (class_310.method_1551().field_1724 != var2) {
         return original;
      } else {
         d var3 = SixSevenClient.modules();
         if (var3 != null && var3.u != null && var3.u.f()) {
            float var4 = var3.u.k();
            return var4 <= 0.01F ? original : Math.max(1, Math.round((float)original / var4));
         } else {
            return original;
         }
      }
   }
}
