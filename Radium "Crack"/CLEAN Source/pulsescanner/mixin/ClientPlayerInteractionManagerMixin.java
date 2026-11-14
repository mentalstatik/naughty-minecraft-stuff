package pulsescanner.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.o;
import pulsescanner.d.f;
import pulsescanner.f.l;

@Mixin({class_636.class})
public abstract class ClientPlayerInteractionManagerMixin {
   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$onAttack(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      o var4 = new o(var2);
      var4.a();
      if (var4.c()) {
         var3.cancel();
      } else {
         f.a(var2);
         l.a(var2);
      }
   }
}
