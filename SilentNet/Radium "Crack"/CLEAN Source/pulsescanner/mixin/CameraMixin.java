package pulsescanner.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import pulsescanner.a.am;
import pulsescanner.f.m;
import pulsescanner.f.f.g;
import pulsescanner.f.f.h;

@Mixin({class_4184.class})
public abstract class CameraMixin {
   @Unique
   private boolean pulse$inverseView;

   @Shadow
   protected abstract void method_19327(double var1, double var3, double var5);

   @ModifyArgs(
      method = {"method_19321"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_4184;method_19325(FF)V"
      )}
   )
   private void pulse$freelookRotation(Args var1) {
      g var2 = m.a(g.class);
      if (var2 != null && var2.o()) {
         var1.set(0, var2.p);
         var1.set(1, var2.q);
      } else {
         h var3 = m.a(h.class);
         if (var3 != null && var3.o()) {
            var1.set(0, var3.p);
            var1.set(1, var3.q);
         } else {
            if (am.c) {
               var1.set(0, this.pulse$inverseView ? am.a + 180.0F : am.a);
               var1.set(1, this.pulse$inverseView ? -am.b : am.b);
            }
         }
      }
   }

   @Inject(
      method = {"method_19321"},
      at = {@At("HEAD")}
   )
   private void pulse$trackCombatCamera(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      this.pulse$inverseView = var3 && var4;
      am.a(var2, var5);
   }

   @Inject(
      method = {"method_19321"},
      at = {@At("TAIL")}
   )
   private void pulse$freecamPosition(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      g var7 = m.a(g.class);
      if (var7 != null && var7.o()) {
         this.method_19327(var7.a(var5), var7.b(var5), var7.c(var5));
      }
   }
}
