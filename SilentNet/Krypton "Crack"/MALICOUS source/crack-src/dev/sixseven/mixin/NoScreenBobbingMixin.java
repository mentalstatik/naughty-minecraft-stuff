package dev.sixseven.mixin;

import net.minecraft.class_4587;
import net.minecraft.class_757;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_757.class})
public abstract class NoScreenBobbingMixin {
   @Inject(
      method = {"method_3186(Lnet/minecraft/class_4587;F)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$disableViewBobbing(class_4587 var1, float var2, CallbackInfo var3) {
      var3.cancel();
   }
}
