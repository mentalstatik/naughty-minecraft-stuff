package pulsescanner.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_338;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.f.l;
import pulsescanner.f.m;
import pulsescanner.f.c.s;
import pulsescanner.f.f.n;
import pulsescanner.f.g.b;

@Mixin({class_338.class})
public abstract class ChatHudMixin {
   @ModifyVariable(
      method = {"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0
   )
   private class_2561 pulse$timestamp(class_2561 var1) {
      s var2 = m.a(s.class);
      if (var2 != null) {
         var1 = var2.b(var1);
      }

      b var3 = m.a(b.class);
      if (var3 != null) {
         var1 = var3.b(var1);
      }

      n var4 = m.a(n.class);
      return var4 != null ? var4.b(var1) : var1;
   }

   @Inject(
      method = {"method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"},
      at = {@At("HEAD")}
   )
   private void pulse$onMessage(class_2561 var1, class_7469 var2, class_7591 var3, CallbackInfo var4) {
      l.a(var1);
   }

   @ModifyConstant(
      method = {"method_1815", "method_58744(Lnet/minecraft/class_303;)V"},
      constant = {@Constant(
         intValue = 100
      )},
      require = 0
   )
   private int pulse$history(int var1) {
      b var2 = m.a(b.class);
      return var2 != null ? var2.c(var1) : var1;
   }
}
