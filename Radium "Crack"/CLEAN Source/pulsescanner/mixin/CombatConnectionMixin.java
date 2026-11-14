package pulsescanner.mixin;

import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.b;
import pulsescanner.a.q;

@Mixin({class_2535.class})
public abstract class CombatConnectionMixin {
   @Unique
   private static boolean pulse$resending;

   @Inject(
      method = {"method_10759"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static <T extends class_2547> void pulse$receive(class_2596<T> var0, class_2547 var1, CallbackInfo var2) {
      q var3 = new q(var0, b.RECEIVE);
      var3.a();
      if (var3.c()) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$send(class_2596<?> var1, CallbackInfo var2) {
      if (!pulse$resending) {
         q var3 = new q(var1, b.SEND);
         var3.a();
         if (var3.c()) {
            var2.cancel();
         } else {
            if (var3.d() != var1 && class_310.method_1551().method_1562() != null) {
               var2.cancel();
               pulse$resending = true;

               try {
                  class_310.method_1551().method_1562().method_52787(var3.d());
               } finally {
                  pulse$resending = false;
               }
            }
         }
      }
   }
}
