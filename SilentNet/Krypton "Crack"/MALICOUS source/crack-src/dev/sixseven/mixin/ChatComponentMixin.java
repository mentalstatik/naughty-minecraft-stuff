package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_338.class})
public class ChatComponentMixin {
   @ModifyVariable(
      method = {"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private class_2561 sixsevenclient$censorChat(class_2561 var1) {
      d var2 = SixSevenClient.modules();
      if (var2 == null) {
         return var1;
      } else {
         if (var2.f != null) {
            var2.f.a(var1.getString());
         }

         class_2561 var3 = var1;
         if (var2.am != null) {
            var3 = var2.am.b(var1);
         }

         if (var2.J != null && var2.J.f()) {
            var3 = var2.J.b(var3);
         }

         return var3;
      }
   }
}
