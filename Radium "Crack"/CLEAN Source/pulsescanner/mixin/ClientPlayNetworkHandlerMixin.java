package pulsescanner.mixin;

import net.minecraft.class_2672;
import net.minecraft.class_2676;
import net.minecraft.class_2678;
import net.minecraft.class_2761;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.d.f;
import pulsescanner.f.l;
import pulsescanner.f.m;
import pulsescanner.f.a.b;
import pulsescanner.f.g.e;

@Mixin({class_634.class})
public abstract class ClientPlayNetworkHandlerMixin {
   @Inject(
      method = {"method_11079"},
      at = {@At("TAIL")}
   )
   private void pulse$onTime(class_2761 var1, CallbackInfo var2) {
      f.c();
      e var3 = m.a(e.class);
      if (var3 != null && var3.b()) {
         var3.a(var1.comp_3220());
      }
   }

   @Inject(
      method = {"method_11120"},
      at = {@At("TAIL")}
   )
   private void pulse$onJoin(class_2678 var1, CallbackInfo var2) {
      f.e();
   }

   @Inject(
      method = {"method_11128"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_2600;method_11074(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;Lnet/minecraft/class_11980;)V",
         shift = Shift.AFTER
      )}
   )
   private void pulse$onChunkData(class_2672 var1, CallbackInfo var2) {
      b.c(var1.method_11523(), var1.method_11524(), var1.method_38599());
      l.a(var1.method_11523(), var1.method_11524(), var1.method_38599());
   }

   @Inject(
      method = {"method_11143"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_2600;method_11074(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;Lnet/minecraft/class_11980;)V",
         shift = Shift.AFTER
      )}
   )
   private void pulse$onLightUpdate(class_2676 var1, CallbackInfo var2) {
      b.c(var1.method_11558(), var1.method_11554(), var1.method_38600());
      l.b(var1.method_11558(), var1.method_11554(), var1.method_38600());
   }
}
