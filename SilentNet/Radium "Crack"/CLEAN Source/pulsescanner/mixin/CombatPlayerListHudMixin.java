package pulsescanner.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.c.s;
import pulsescanner.f.f.n;

@Mixin({class_355.class})
public abstract class CombatPlayerListHudMixin {
   @Inject(
      method = {"method_1918"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void pulse$tierTab(class_640 var1, CallbackInfoReturnable<class_2561> var2) {
      s var3 = m.a(s.class);
      if (var3 != null && var3.b() && var3.p.i() && var1 != null && var2.getReturnValue() != null) {
         var2.setReturnValue(var3.a((class_2561)var2.getReturnValue(), var1));
      }
   }

   @Inject(
      method = {"method_1918"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void pulse$nameProtectTab(class_640 var1, CallbackInfoReturnable<class_2561> var2) {
      n var3 = m.a(n.class);
      if (var3 != null && var3.b() && var1 != null && var2.getReturnValue() != null) {
         var2.setReturnValue(var3.a((class_2561)var2.getReturnValue(), var1.method_2966().name()));
      }
   }
}
