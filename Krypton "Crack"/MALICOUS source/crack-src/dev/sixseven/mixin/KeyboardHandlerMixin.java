package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;
import net.minecraft.class_342;
import net.minecraft.class_408;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_473;
import net.minecraft.class_7743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_309.class})
public class KeyboardHandlerMixin {
   @Inject(
      method = {"method_1466(JILnet/minecraft/class_11908;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$dispatchModuleKeybinds(long window, int action, class_11908 keyEvent, CallbackInfo ci) {
      class_310 var6 = class_310.method_1551();
      if (SixSevenClient.modules() != null && action == 1) {
         if (var6.field_1755 == null && var6.field_1687 != null) {
            if (SixSevenClient.modules().a(keyEvent.comp_4795())) {
               ci.cancel();
            }
         } else if ((keyEvent.comp_4795() == 340 || keyEvent.comp_4795() == 344) && var6.field_1755 != null && shiftOpensGui(var6.field_1755)) {
            var6.method_1507(new a(var6.field_1755));
            ci.cancel();
         }
      }
   }

   private static boolean shiftOpensGui(class_437 screen) {
      if (!(screen instanceof a)
         && !(screen instanceof class_408)
         && !(screen instanceof class_465)
         && !(screen instanceof class_7743)
         && !(screen instanceof class_473)) {
         if (screen.method_25399() instanceof class_342 var3 && var3.method_25370()) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }
}
