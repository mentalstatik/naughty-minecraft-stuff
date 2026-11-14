package dev.sixseven.mixin;

import dev.sixseven.d.a.H;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public class EntityFreecamMixin {
   @Inject(
      method = {"method_5756"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$freecamSeeOwnBody(class_1657 viewer, CallbackInfoReturnable<Boolean> cir) {
      class_1297 var3 = (class_1297)this;
      class_310 var4 = class_310.method_1551();
      if (var4.field_1724 != null && var3 == var4.field_1724 && viewer == var4.field_1724) {
         H var5 = H.k();
         if (var5 != null && var5.m() && var5.n()) {
            cir.setReturnValue(false);
         }
      }
   }
}
