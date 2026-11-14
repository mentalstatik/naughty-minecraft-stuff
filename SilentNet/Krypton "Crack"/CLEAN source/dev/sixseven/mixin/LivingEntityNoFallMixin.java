package dev.sixseven.mixin;

import dev.sixseven.d.a.X;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1309.class})
public abstract class LivingEntityNoFallMixin {
   @Inject(
      method = {"method_5747(DFLnet/minecraft/class_1282;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$cancelLocalFallDamage(double var1, float var3, class_1282 var4, CallbackInfoReturnable<Boolean> var5) {
      if (X.a((class_1297)this)) {
         var5.setReturnValue(false);
      }
   }
}
