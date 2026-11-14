package dev.sixseven.mixin;

import dev.sixseven.d.a.G;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1297.class})
public class EntityFreeLookMixin {
   @Inject(
      method = {"method_5872(DD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$freeLookTurn(double d, double e, CallbackInfo ci) {
      class_310 var6 = class_310.method_1551();
      if (this == var6.field_1724) {
         G var7 = G.k();
         if (var7 != null && var7.n()) {
            var7.a(d, e);
            ci.cancel();
         }
      }
   }
}
