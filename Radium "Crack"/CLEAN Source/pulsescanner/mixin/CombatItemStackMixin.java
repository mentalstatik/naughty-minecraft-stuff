package pulsescanner.mixin;

import net.minecraft.class_1799;
import net.minecraft.class_1802;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.c.f;

@Mixin({class_1799.class})
public abstract class CombatItemStackMixin {
   @Inject(
      method = {"method_7965"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$crystalBounce(CallbackInfoReturnable<Integer> var1) {
      f var2 = m.a(f.class);
      if (var2 != null && var2.v() && ((class_1799)this).method_31574(class_1802.field_8301)) {
         var1.setReturnValue(0);
      }
   }
}
