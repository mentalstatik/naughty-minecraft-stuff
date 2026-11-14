package pulsescanner.mixin;

import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.s;

@Mixin({class_309.class})
public abstract class CombatKeyboardMixin {
   @Inject(
      method = {"method_1466"},
      at = {@At("HEAD")}
   )
   private void pulse$combatKey(long var1, int var3, class_11908 var4, CallbackInfo var5) {
      int var6 = var4.comp_4795();
      if (var3 == 1 && var6 > 7 && class_310.method_1551().field_1755 == null) {
         new s(var6).a();
      }
   }
}
