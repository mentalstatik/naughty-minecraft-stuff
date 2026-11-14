package pulsescanner.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_329;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import pulsescanner.f.m;
import pulsescanner.f.f.n;

@Mixin({class_329.class})
public abstract class NameProtectHudMixin {
   @ModifyVariable(
      method = {"method_34004"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 pulse$npTitle(class_2561 var1) {
      return pulse$np(var1);
   }

   @ModifyVariable(
      method = {"method_34002"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 pulse$npSubtitle(class_2561 var1) {
      return pulse$np(var1);
   }

   @ModifyVariable(
      method = {"method_1758"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 pulse$npOverlay(class_2561 var1) {
      return pulse$np(var1);
   }

   @Unique
   private static class_2561 pulse$np(class_2561 var0) {
      n var1 = m.a(n.class);
      return var1 != null ? var1.b(var0) : var0;
   }
}
