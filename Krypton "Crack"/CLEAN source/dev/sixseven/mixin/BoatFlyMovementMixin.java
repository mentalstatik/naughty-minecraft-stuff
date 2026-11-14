package dev.sixseven.mixin;

import dev.sixseven.d.a.p;
import net.minecraft.class_10255;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_10255.class})
public abstract class BoatFlyMovementMixin {
   @ModifyArg(
      method = {"method_5773()V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_10255;method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"
      ),
      index = 1
   )
   private class_243 sixsevenclient$applyBoatFlyMovement(class_243 var1) {
      return p.a((class_10255)this, var1);
   }

   @Inject(
      method = {"method_5773()V"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$lockBoatAfterTick(CallbackInfo var1) {
      p.a((class_10255)this);
   }

   @Inject(
      method = {"method_64492(Lnet/minecraft/class_1297;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$keepCameraWhileRiding(class_1297 var1, CallbackInfo var2) {
      class_10255 var3 = (class_10255)this;
      if (p.a(var3, var1)) {
         var2.cancel();
      }
   }
}
