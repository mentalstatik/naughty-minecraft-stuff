package dev.sixseven.mixin;

import dev.sixseven.d.a.Y;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_746.class})
public abstract class LocalPlayerNoStunMixin {
   @ModifyArg(
      method = {"method_67270(Lnet/minecraft/class_241;)Lnet/minecraft/class_241;"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_241;method_35582(F)Lnet/minecraft/class_241;",
         ordinal = 1
      ),
      index = 0
   )
   private float sixsevenclient$removeItemUseSlowdown(float var1) {
      return Y.a((class_746)this) ? 1.0F : var1;
   }
}
