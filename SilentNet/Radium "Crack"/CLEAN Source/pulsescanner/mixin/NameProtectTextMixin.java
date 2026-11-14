package pulsescanner.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import pulsescanner.f.m;
import pulsescanner.f.f.n;

@Mixin({class_332.class})
public abstract class NameProtectTextMixin {
   @ModifyVariable(
      method = {"method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      require = 0
   )
   private class_2561 pulse$npText(class_2561 var1) {
      n var2 = m.a(n.class);
      return var2 != null ? var2.b(var1) : var1;
   }

   @ModifyVariable(
      method = {"method_51433(Lnet/minecraft/class_327;Ljava/lang/String;IIIZ)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      require = 0
   )
   private String pulse$npString(String var1) {
      n var2 = m.a(n.class);
      return var2 != null ? var2.e(var1) : var1;
   }
}
