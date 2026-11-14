package dev.sixseven.mixin;

import dev.sixseven.d.a.H;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public abstract class LocalPlayerFreecamMixin {
   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$freecamReapplyBeforeAiStep(CallbackInfo ci) {
      this.sixsevenclient$reapply();
   }

   @Inject(
      method = {"method_3136"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$freecamReapplyBeforeSendPosition(CallbackInfo ci) {
      this.sixsevenclient$reapply();
   }

   private void sixsevenclient$reapply() {
      class_746 var1 = (class_746)this;
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 == var1) {
         H var3 = H.k();
         if (var3 != null && var3.m()) {
            H.c(var2);
         }
      }
   }
}
