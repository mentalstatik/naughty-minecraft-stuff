package pulsescanner.mixin;

import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.s;
import pulsescanner.a.t;

@Mixin({class_312.class})
public abstract class CombatMouseMixin {
   @Inject(
      method = {"method_1601"},
      at = {@At("HEAD")}
   )
   private void pulse$combatButton(long var1, class_11910 var3, int var4, CallbackInfo var5) {
      if (var4 == 1 && class_310.method_1551().field_1755 == null) {
         new s(var3.comp_4801()).a();
         new t(var3.comp_4801(), var4, null).a();
      }
   }
}
