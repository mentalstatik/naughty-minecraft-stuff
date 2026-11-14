package pulsescanner.mixin;

import net.minecraft.class_310;
import net.minecraft.class_9919;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.b.f;

@Mixin({class_9919.class})
public abstract class InactivityFpsLimiterMixin {
   @Inject(
      method = {"method_61937"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void pulse$unfocused(CallbackInfoReturnable<Integer> var1) {
      f var2 = m.a(f.class);
      if (var2 != null && var2.l.a() && !class_310.method_1551().method_1569()) {
         var1.setReturnValue(Math.min(var1.getReturnValueI(), var2.m.h()));
      }
   }
}
