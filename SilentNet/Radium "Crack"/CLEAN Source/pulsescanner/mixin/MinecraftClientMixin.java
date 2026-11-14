package pulsescanner.mixin;

import net.minecraft.class_310;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import pulsescanner.license.d;
import pulsescanner.license.g;

@Mixin({class_310.class})
public abstract class MinecraftClientMixin {
   @ModifyVariable(
      method = {"method_1507"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private class_437 pulse$licenseGate(class_437 var1) {
      return (class_437)(((class_310)this).field_1687 == null && !d.g() && !(var1 instanceof g) ? new g() : var1);
   }
}
