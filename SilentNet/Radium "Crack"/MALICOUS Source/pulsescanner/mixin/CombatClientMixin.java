package pulsescanner.mixin;

import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.a.af;
import pulsescanner.a.r;
import pulsescanner.a.v;

@Mixin({class_310.class})
public abstract class CombatClientMixin {
   private boolean pulse$inWorld() {
      class_310 var1 = (class_310)this;
      return !var1.method_1493() && var1.field_1724 != null && var1.field_1687 != null;
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")}
   )
   private void pulse$preTick(CallbackInfo var1) {
      if (this.pulse$inWorld()) {
         new v().a();
      }
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("TAIL")}
   )
   private void pulse$postTick(CallbackInfo var1) {
      if (this.pulse$inWorld()) {
         new r().a();
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$macroUse(CallbackInfo var1) {
      if (af.a() || af.b(1)) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"method_1590"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$macroBreak(boolean var1, CallbackInfo var2) {
      if (af.b(0)) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$macroAttack(CallbackInfoReturnable<Boolean> var1) {
      if (af.b(0)) {
         var1.setReturnValue(false);
      }
   }
}
