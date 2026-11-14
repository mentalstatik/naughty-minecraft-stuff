package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin({class_765.class})
public class LightTextureMixin {
   @ModifyExpressionValue(
      method = {"method_3313"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;"
      )},
      slice = {@Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/class_315;method_42473()Lnet/minecraft/class_7172;"
         )
      )}
   )
   private Object sixsevenclient$fullbrightGamma(Object original) {
      d var2 = SixSevenClient.modules();
      return var2 != null && var2.r != null && var2.r.f() ? (double)var2.r.a.d() : original;
   }
}
