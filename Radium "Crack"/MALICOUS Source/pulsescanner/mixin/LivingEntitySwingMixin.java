package pulsescanner.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import pulsescanner.f.m;
import pulsescanner.f.f.w;

@Mixin({class_1309.class})
public abstract class LivingEntitySwingMixin {
   @ModifyReturnValue(
      method = {"method_6028"},
      at = {@At("RETURN")},
      require = 0
   )
   private int pulse$swingSpeed(int var1) {
      w var2 = m.a(w.class);
      return var2 != null && var2.b() ? var2.a(var1, (class_1309)this) : var1;
   }
}
