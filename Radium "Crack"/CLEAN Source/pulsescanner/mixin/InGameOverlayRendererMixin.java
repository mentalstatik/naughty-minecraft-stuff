package pulsescanner.mixin;

import net.minecraft.class_1058;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.f.f.m;

@Mixin({class_4603.class})
public abstract class InGameOverlayRendererMixin {
   @Unique
   private static boolean pulse$pushed;

   @Inject(
      method = {"method_23070"},
      at = {@At("HEAD")}
   )
   private static void pulse$lowFireHead(class_4587 var0, class_4597 var1, class_1058 var2, CallbackInfo var3) {
      m var4 = pulsescanner.f.m.a(m.class);
      pulse$pushed = var4 != null && var4.b();
      if (pulse$pushed) {
         var0.method_22903();
         var0.method_46416(0.0F, -var4.l.g(), 0.0F);
      }
   }

   @Inject(
      method = {"method_23070"},
      at = {@At("TAIL")}
   )
   private static void pulse$lowFireTail(class_4587 var0, class_4597 var1, class_1058 var2, CallbackInfo var3) {
      if (pulse$pushed) {
         var0.method_22909();
         pulse$pushed = false;
      }
   }
}
