package pulsescanner.mixin;

import net.minecraft.class_2394;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.l;

@Mixin({class_702.class})
public abstract class ParticleManagerMixin {
   @Inject(
      method = {"method_3056(Lnet/minecraft/class_2394;DDDDDD)Lnet/minecraft/class_703;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$addParticle(
      class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<class_703> var14
   ) {
      if (l.a(var1)) {
         var14.setReturnValue(null);
      }
   }
}
