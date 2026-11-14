package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_636.class})
public class MultiPlayerGameModeAttackMixin {
   @Inject(
      method = {"method_2910(Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$selectBestMiningTool(class_2338 var1, class_2350 var2, CallbackInfoReturnable<Boolean> var3) {
      d var4 = SixSevenClient.modules();
      if (var4 != null && var4.q != null && var4.q.f()) {
         var4.q.a(var1);
      }
   }

   @Inject(
      method = {"method_2902(Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$keepBestMiningToolSelected(class_2338 var1, class_2350 var2, CallbackInfoReturnable<Boolean> var3) {
      d var4 = SixSevenClient.modules();
      if (var4 != null && var4.q != null && var4.q.f()) {
         var4.q.a(var1);
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$onAttack(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      d var4;
      if (var1 == class_310.method_1551().field_1724 && var2 != var1 && (var4 = SixSevenClient.modules()) != null && var4.Z != null && var4.Z.f()) {
         var4.Z.a(var2);
      }
   }
}
