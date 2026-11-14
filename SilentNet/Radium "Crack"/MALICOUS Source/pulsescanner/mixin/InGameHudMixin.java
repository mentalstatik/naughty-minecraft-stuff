package pulsescanner.mixin;

import net.minecraft.class_266;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.d.b;
import pulsescanner.f.m;
import pulsescanner.f.d.s;
import pulsescanner.f.f.e;

@Mixin({class_329.class})
public abstract class InGameHudMixin {
   @Shadow
   @Final
   private class_310 field_2035;
   @Unique
   private boolean pulse$scoreboardPushed;

   @Inject(
      method = {"method_1753"},
      at = {@At("TAIL")}
   )
   private void pulse$renderHud(class_332 var1, class_9779 var2, CallbackInfo var3) {
      b.a(var1, var2.method_60637(true));
   }

   @Inject(
      method = {"method_1736"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$crosshair(class_332 var1, class_9779 var2, CallbackInfo var3) {
      e var4 = m.a(e.class);
      if (var4 != null && var4.b() && !this.field_2035.method_53526().method_53536()) {
         if (this.field_2035.field_1690.method_31044().method_31034()) {
            var4.a(var1);
         }

         var3.cancel();
      }
   }

   @Inject(
      method = {"method_1765"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$effects(class_332 var1, class_9779 var2, CallbackInfo var3) {
      pulsescanner.f.d.m var4 = m.a(pulsescanner.f.d.m.class);
      if (var4 != null && var4.b() && var4.x.a()) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$scoreboardHead(class_332 var1, class_266 var2, CallbackInfo var3) {
      this.pulse$scoreboardPushed = false;
      s var4 = m.a(s.class);
      if (var4 != null && var4.b()) {
         if (var4.l.a()) {
            var3.cancel();
         } else {
            float var5 = (float)var1.method_51421();
            float var6 = (float)var1.method_51443();
            float var7 = var4.m.g();
            var1.method_51448().pushMatrix();
            var1.method_51448().translate(var5, var6 / 2.0F + var4.n.g());
            var1.method_51448().scale(var7, var7);
            var1.method_51448().translate(-var5, -var6 / 2.0F);
            this.pulse$scoreboardPushed = true;
         }
      }
   }

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("TAIL")}
   )
   private void pulse$scoreboardTail(class_332 var1, class_266 var2, CallbackInfo var3) {
      if (this.pulse$scoreboardPushed) {
         var1.method_51448().popMatrix();
         this.pulse$scoreboardPushed = false;
      }
   }
}
