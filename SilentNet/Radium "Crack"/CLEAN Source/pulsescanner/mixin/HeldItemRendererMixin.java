package pulsescanner.mixin;

import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.f.m;
import pulsescanner.f.f.j;

@Mixin({class_759.class})
public abstract class HeldItemRendererMixin {
   @Inject(
      method = {"method_3228"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V",
         shift = Shift.BEFORE
      )}
   )
   private void pulse$handView(
      class_742 var1,
      float var2,
      float var3,
      class_1268 var4,
      float var5,
      class_1799 var6,
      float var7,
      class_4587 var8,
      class_11659 var9,
      int var10,
      CallbackInfo var11
   ) {
      j var12 = m.a(j.class);
      if (var12 != null && var12.b()) {
         float var13 = var4 == class_1268.field_5808 ? 1.0F : -1.0F;
         var8.method_46416(var12.m.g() * var13, var12.n.g(), var12.o.g());
         float var14 = var12.l.g();
         var8.method_22905(var14, var14, var14);
      }
   }
}
