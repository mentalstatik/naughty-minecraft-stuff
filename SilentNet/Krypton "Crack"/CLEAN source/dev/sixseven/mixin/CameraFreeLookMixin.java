package dev.sixseven.mixin;

import dev.sixseven.d.a.G;
import dev.sixseven.d.a.H;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({class_4184.class})
public abstract class CameraFreeLookMixin {
   @ModifyArgs(
      method = {"method_19321"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_4184;method_19325(FF)V"
      )
   )
   private void sixsevenclient$freeLookRotation(Args args) {
      G var2 = G.k();
      if (var2 != null && var2.l()) {
         H var3 = H.k();
         if (var3 == null || !var3.m()) {
            args.set(0, var2.p());
            args.set(1, var2.q());
         }
      }
   }

   @Inject(
      method = {"method_19318"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$freeLookThroughWalls(float distance, CallbackInfoReturnable<Float> cir) {
      G var3 = G.k();
      if (var3 != null && var3.m()) {
         H var4 = H.k();
         if (var4 == null || !var4.m()) {
            cir.setReturnValue(distance);
         }
      }
   }
}
