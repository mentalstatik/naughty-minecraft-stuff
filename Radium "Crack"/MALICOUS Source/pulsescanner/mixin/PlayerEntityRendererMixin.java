package pulsescanner.mixin;

import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_11890;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.c.s;
import pulsescanner.f.f.n;
import pulsescanner.f.f.q;

@Mixin({class_1007.class})
public abstract class PlayerEntityRendererMixin {
   @Inject(
      method = {"method_74935(Lnet/minecraft/class_11890;D)Z"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void pulse$hideVanillaTag(class_11890 var1, double var2, CallbackInfoReturnable<Boolean> var4) {
      q var5 = m.a(q.class);
      if (var5 != null && var5.q()) {
         var4.setReturnValue(false);
      }
   }

   @Inject(
      method = {"method_62604"},
      at = {@At("TAIL")},
      require = 0
   )
   private void pulse$tierNametag(class_11890 var1, class_10055 var2, float var3, CallbackInfo var4) {
      s var5 = m.a(s.class);
      if (var5 != null && var5.b() && var5.v.i() && var1 != null) {
         String var6 = var1.method_5477().getString();
         if (var2.field_53525 != null) {
            var2.field_53525 = var5.a(var2.field_53525, var6);
         }

         if (var2.field_53337 != null) {
            var2.field_53337 = var5.a(var2.field_53337, var6);
         }
      }
   }

   @Inject(
      method = {"method_62604"},
      at = {@At("TAIL")},
      require = 0
   )
   private void pulse$nameProtectTag(class_11890 var1, class_10055 var2, float var3, CallbackInfo var4) {
      n var5 = m.a(n.class);
      if (var5 != null && var5.b() && var1 != null) {
         String var6 = var1.method_5477().getString();
         if (var2.field_53525 != null) {
            var2.field_53525 = var5.a(var2.field_53525, var6);
         }

         if (var2.field_53337 != null) {
            var2.field_53337 = var5.a(var2.field_53337, var6);
         }
      }
   }
}
