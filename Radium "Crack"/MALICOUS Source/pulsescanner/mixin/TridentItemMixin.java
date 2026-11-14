package pulsescanner.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1835;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import pulsescanner.f.m;
import pulsescanner.f.c.u;

@Mixin(
   value = {class_1835.class},
   priority = 900
)
public abstract class TridentItemMixin {
   @ModifyExpressionValue(
      method = {"method_7836", "method_7840"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1657;method_5721()Z"
      )},
      require = 0
   )
   private boolean pulse$riptideWithoutWater(boolean var1) {
      u var2 = m.a(u.class);
      return var1 || var2 != null && var2.o();
   }

   @ModifyConstant(
      method = {"method_7840"},
      constant = {@Constant(
         intValue = 10
      )},
      require = 0
   )
   private int pulse$minimumCharge(int var1) {
      u var2 = m.a(u.class);
      return var2 == null ? var1 : var2.c(var1);
   }
}
