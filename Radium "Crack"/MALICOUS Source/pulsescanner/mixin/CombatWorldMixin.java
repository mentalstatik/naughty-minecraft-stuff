package pulsescanner.mixin;

import net.minecraft.class_638;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.w;

@Mixin({class_638.class})
public abstract class CombatWorldMixin {
   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   private void pulse$worldLoad(CallbackInfo var1) {
      new w().a();
   }
}
