package pulsescanner.mixin;

import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.d.f;
import pulsescanner.f.m;
import pulsescanner.f.f.g;
import pulsescanner.f.f.x;

@Mixin({class_312.class})
public abstract class MouseMixin {
   @Shadow
   @Final
   private class_310 field_1779;
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;

   @Inject(
      method = {"method_1601"},
      at = {@At("HEAD")}
   )
   private void pulse$click(long var1, class_11910 var3, int var4, CallbackInfo var5) {
      if (var4 == 1 && this.field_1779.field_1755 == null) {
         f.a(var3.comp_4801());
      }
   }

   @Inject(
      method = {"method_1598"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$scroll(long var1, double var3, double var5, CallbackInfo var7) {
      if (this.field_1779.field_1755 == null) {
         g var8 = m.a(g.class);
         if (var8 != null && var8.a(var5)) {
            var7.cancel();
         } else {
            x var9 = m.a(x.class);
            if (var9 != null && var9.a(var5)) {
               var7.cancel();
            }
         }
      }
   }

   @Inject(
      method = {"method_1606"},
      at = {@At("HEAD")}
   )
   private void pulse$zoomSensitivity(double var1, CallbackInfo var3) {
      x var4 = m.a(x.class);
      if (var4 != null) {
         double var5 = var4.q();
         if (var5 < 1.0) {
            this.field_1789 *= var5;
            this.field_1787 *= var5;
         }
      }
   }
}
