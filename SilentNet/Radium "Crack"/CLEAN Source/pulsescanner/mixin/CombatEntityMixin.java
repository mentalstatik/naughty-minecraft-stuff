package pulsescanner.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.a.z;
import pulsescanner.f.m;
import pulsescanner.f.c.l;
import pulsescanner.f.c.o;

@Mixin({class_1297.class})
public abstract class CombatEntityMixin {
   @Inject(
      method = {"method_5697"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$ghostPush(class_1297 var1, CallbackInfo var2) {
      if (o.b((class_1297)this) || o.b(var1)) {
         var2.cancel();
      }
   }

   @ModifyExpressionValue(
      method = {"method_5784"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1297;method_66247()Z",
         ordinal = 1
      )},
      require = 0
   )
   private boolean pulse$trackFall(boolean var1) {
      return this == class_310.method_1551().field_1724 || var1;
   }

   @Inject(
      method = {"method_5871"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void pulse$hitboxMargin(CallbackInfoReturnable<Float> var1) {
      if (this instanceof class_1657 var2) {
         l var3 = m.a(l.class);
         if (var3 != null && var3.b() && !z.a(var2.method_5477().getString())) {
            var1.setReturnValue((Float)var1.getReturnValue() + var3.o.g());
         }
      }
   }
}
