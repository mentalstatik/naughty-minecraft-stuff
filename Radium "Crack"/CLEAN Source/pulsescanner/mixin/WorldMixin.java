package pulsescanner.mixin;

import net.minecraft.class_1937;
import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.g.g;

@Mixin({class_1937.class})
public abstract class WorldMixin {
   @Inject(
      method = {"method_8430"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$rain(float var1, CallbackInfoReturnable<Float> var2) {
      if (this instanceof class_638) {
         g var3 = m.a(g.class);
         if (var3 != null && var3.b()) {
            var2.setReturnValue(var3.o());
         }
      }
   }

   @Inject(
      method = {"method_8478"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$thunder(float var1, CallbackInfoReturnable<Float> var2) {
      if (this instanceof class_638) {
         g var3 = m.a(g.class);
         if (var3 != null && var3.b()) {
            var2.setReturnValue(var3.p());
         }
      }
   }
}
