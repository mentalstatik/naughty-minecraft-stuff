package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_10055;
import net.minecraft.class_10197;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_8053;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_10197.class})
public class EquipmentLayerRendererMixin {
   @ModifyExpressionValue(
      method = {"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1799;method_58694(Lnet/minecraft/class_9331;)Ljava/lang/Object;"
      )}
   )
   private Object sixsevenclient$armorTrim(Object original, @Local(argsOnly = true) class_1799 itemStack, @Local(argsOnly = true) Object renderState) {
      d var4 = SixSevenClient.modules();
      if (var4 == null) {
         return original;
      } else {
         dev.sixseven.d.a.d var5 = var4.ao;
         if (var5 != null && var5.f()) {
            return !var5.k() && sixsevenclient$isLocalPlayer(renderState) ? original : var5.a(itemStack, (class_8053)original);
         } else {
            return original;
         }
      }
   }

   private static boolean sixsevenclient$isLocalPlayer(Object renderState) {
      if (!(renderState instanceof class_10055 var1)) {
         return false;
      } else {
         class_310 var2 = class_310.method_1551();
         return var2.field_1724 != null && var1.field_53528 == var2.field_1724.method_5628();
      }
   }
}
