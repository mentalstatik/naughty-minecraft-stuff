package dev.sixseven.mixin;

import dev.sixseven.d.a.H;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4184.class})
public abstract class CameraFreecamMixin {
   @Shadow
   protected abstract void method_19322(class_243 var1);

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Inject(
      method = {"method_19321"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$freecam(class_1937 level, class_1297 entity, boolean detached, boolean thirdPersonReverse, float partialTick, CallbackInfo ci) {
      H var7 = H.k();
      if (var7 != null && var7.m()) {
         this.method_19325(var7.d(partialTick), var7.e(partialTick));
         this.method_19322(var7.f(partialTick));
      }
   }
}
