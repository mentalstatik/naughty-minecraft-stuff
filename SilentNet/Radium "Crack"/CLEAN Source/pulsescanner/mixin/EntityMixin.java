package pulsescanner.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.am;
import pulsescanner.f.l;
import pulsescanner.f.m;
import pulsescanner.f.f.g;
import pulsescanner.f.f.h;

@Mixin({class_1297.class})
public abstract class EntityMixin {
   @Inject(
      method = {"method_5872"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$freelook(double var1, double var3, CallbackInfo var5) {
      if (this == class_310.method_1551().field_1724) {
         g var6 = m.a(g.class);
         if (var6 != null && var6.o()) {
            var6.a(var1, var3);
            var5.cancel();
         } else {
            h var7 = m.a(h.class);
            if (var7 != null && var7.o()) {
               var7.a(var1, var3);
               var5.cancel();
            } else {
               if (am.c) {
                  am.a(var1, var3);
                  var5.cancel();
               }
            }
         }
      }
   }

   @ModifyVariable(
      method = {"method_5784"},
      at = {@At("HEAD")},
      argsOnly = true
   )
   private class_243 pulse$move(class_243 var1) {
      return l.a((class_1297)this, var1);
   }
}
