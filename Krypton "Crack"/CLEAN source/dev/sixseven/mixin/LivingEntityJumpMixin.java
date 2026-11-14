package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1309.class})
public class LivingEntityJumpMixin {
   @Inject(
      method = {"method_6043"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$onJump(CallbackInfo var1) {
      d var2;
      if (this instanceof class_746 var4
         && var4 == class_310.method_1551().field_1724
         && (var2 = SixSevenClient.modules()) != null
         && var2.V != null
         && var2.V.f()) {
         var2.V.a(var4);
      }
   }

   @Inject(
      method = {"method_6106()F"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void sixsevenclient$scaleJumpStrength(CallbackInfoReturnable<Float> var1) {
      d var3;
      if (this instanceof class_746 var4
         && var4 == class_310.method_1551().field_1724
         && (var3 = SixSevenClient.modules()) != null
         && var3.j != null
         && var3.j.f()) {
         var1.setReturnValue((Float)var1.getReturnValue() * var3.j.k());
      }
   }
}
