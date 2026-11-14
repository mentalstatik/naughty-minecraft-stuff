package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.ac;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_742.class})
public class AbstractClientPlayerMixin {
   @Inject(
      method = {"method_52814"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void sixsevenclient$replaceSkin(CallbackInfoReturnable<class_8685> cir) {
      d var2 = SixSevenClient.modules();
      if (var2 != null) {
         ac var3 = var2.K;
         if (var3 != null && var3.f()) {
            class_8685 var4 = var3.k();
            if (var4 != null) {
               class_742 var5 = (class_742)this;
               if (var3.a(var5.method_5667())) {
                  cir.setReturnValue(var4);
               }
            }
         }
      }
   }
}
