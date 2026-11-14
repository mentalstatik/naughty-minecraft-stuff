package dev.sixseven.mixin;

import dev.sixseven.d.a.D;
import dev.sixseven.d.a.F;
import dev.sixseven.d.a.af;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class PlayerMovementMixin {
   @Inject(
      method = {"method_6029()F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void sixsevenclient$scalePlayerMovementSpeed(CallbackInfoReturnable<Float> var1) {
      float var2 = af.a((class_1297)this);
      if (var2 != 1.0F) {
         var1.setReturnValue((Float)var1.getReturnValue() * var2);
      }
   }

   @ModifyVariable(
      method = {"method_6091(Lnet/minecraft/class_243;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_243 sixsevenclient$scaleVerticalFlightInput(class_243 var1) {
      float var2 = F.b((class_1297)this);
      return var2 == 1.0F ? var1 : new class_243(var1.field_1352, var1.field_1351 * (double)var2, var1.field_1350);
   }

   @Inject(
      method = {"method_7351(Lnet/minecraft/class_2680;)F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void sixsevenclient$scaleBlockBreakingSpeed(class_2680 var1, CallbackInfoReturnable<Float> var2) {
      float var3 = D.a((class_1297)this);
      if (var3 != 1.0F) {
         var2.setReturnValue((Float)var2.getReturnValue() * var3);
      }
   }
}
