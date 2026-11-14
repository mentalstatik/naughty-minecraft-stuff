package dev.sixseven.mixin;

import dev.sixseven.d.a.H;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public abstract class MouseHandlerFreecamMixin {
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;

   @Inject(
      method = {"method_1606"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$freecamMouse(double d, CallbackInfo ci) {
      H var4 = H.k();
      if (var4 != null && var4.m()) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1755 == null) {
            double var6 = (Double)var5.field_1690.method_42495().method_41753() * 0.6 + 0.2;
            double var8 = var6 * var6 * var6 * 8.0;
            double var10 = this.field_1789 * var8 * (double)var4.t();
            double var12 = this.field_1787 * var8 * (double)var4.t();
            float var14 = var4.r() + (float)var10 * 0.15F;
            float var15 = var4.s() + (float)var12 * 0.15F;
            var4.a(var14, var15);
            ci.cancel();
         }
      }
   }
}
