package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.H;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class GuiCrosshairMixin {
   @Inject(
      method = {"method_1736"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$hideVanillaCrosshair(class_332 guiGraphics, class_9779 deltaTracker, CallbackInfo ci) {
      d var4 = SixSevenClient.modules();
      if (var4 != null && var4.W != null && var4.W.k()) {
         ci.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"method_1736"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_5498;method_31034()Z"
      )}
   )
   private boolean sixsevenclient$freecamCrosshairInThirdPerson(boolean isFirstPerson) {
      H var2 = H.k();
      return var2 != null && var2.m() && var2.n() && !isFirstPerson ? true : isFirstPerson;
   }
}
