package pulsescanner.mixin;

import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.am;
import pulsescanner.a.m;
import pulsescanner.a.u;
import pulsescanner.f.c.t;

@Mixin({class_746.class})
public abstract class CombatPlayerMixin {
   @Inject(
      method = {"method_5773"},
      at = {@At("HEAD")}
   )
   private void pulse$playerTick(CallbackInfo var1) {
      new u().a();
   }

   @ModifyVariable(
      method = {"method_46742"},
      at = {@At(
         value = "STORE",
         ordinal = 0
      )},
      ordinal = 0
   )
   private boolean pulse$sprintState(boolean var1) {
      m var2 = new m(var1);
      var2.a();
      return var2.b();
   }

   @Inject(
      method = {"method_66282"},
      at = {@At("HEAD")}
   )
   private void pulse$totemStop(CallbackInfo var1) {
      t var2 = pulsescanner.f.m.a(t.class);
      if (var2 != null) {
         var2.w();
      }
   }

   @Inject(
      method = {"method_66282"},
      at = {@At("TAIL")}
   )
   private void pulse$handFollowsCamera(CallbackInfo var1) {
      if (am.c) {
         class_746 var2 = (class_746)this;
         class_4184 var3 = class_310.method_1551().field_1773.method_19418();
         var2.field_3916 = var2.field_3914 + (var3.method_19329() - var2.field_3914) * 0.5F;
         var2.field_3932 = var2.field_3931 + (var3.method_19330() - var2.field_3931) * 0.5F;
      }
   }
}
