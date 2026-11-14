package pulsescanner.mixin;

import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.PulseScanner;

@Mixin({class_309.class})
public abstract class KeyboardMixin {
   @Shadow
   @Final
   private class_310 field_1678;

   @Inject(
      method = {"method_1466"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$onKey(long var1, int var3, class_11908 var4, CallbackInfo var5) {
      if (var3 == 1 && this.field_1678.field_1755 == null && var1 == this.field_1678.method_22683().method_4490() && PulseScanner.onKey(var4.comp_4795())) {
         var5.cancel();
      }
   }
}
