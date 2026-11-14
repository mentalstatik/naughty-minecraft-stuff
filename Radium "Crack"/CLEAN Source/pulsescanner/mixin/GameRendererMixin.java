package pulsescanner.mixin;

import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import pulsescanner.f.m;
import pulsescanner.f.a.b;
import pulsescanner.f.f.o;
import pulsescanner.f.f.q;
import pulsescanner.f.f.t;
import pulsescanner.f.f.u;
import pulsescanner.f.f.x;
import pulsescanner.g.h;
import pulsescanner.j.a;

@Mixin({class_757.class})
public abstract class GameRendererMixin {
   @Unique
   private boolean pulse$inHand;

   @Inject(
      method = {"method_3192"},
      at = {@At("HEAD")}
   )
   private void pulse$frame(class_9779 var1, boolean var2, CallbackInfo var3) {
      a.a();
   }

   @Inject(
      method = {"method_3196"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void pulse$zoom(class_4184 var1, float var2, boolean var3, CallbackInfoReturnable<Float> var4) {
      x var5 = m.a(x.class);
      if (var5 != null) {
         var4.setReturnValue(var5.a(var4.getReturnValueF()));
      }

      if (var3) {
         h.a = var4.getReturnValueF();
      }
   }

   @Inject(
      method = {"method_32796"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void pulse$farPlane(CallbackInfoReturnable<Float> var1) {
      if (class_310.method_1551().field_1724 != null) {
         var1.setReturnValue(b.a(var1.getReturnValueF()));
      }
   }

   @Inject(
      method = {"method_3172"},
      at = {@At("HEAD")}
   )
   private void pulse$handStart(float var1, boolean var2, Matrix4f var3, CallbackInfo var4) {
      this.pulse$inHand = true;
   }

   @Inject(
      method = {"method_3172"},
      at = {@At("RETURN")}
   )
   private void pulse$handEnd(float var1, boolean var2, Matrix4f var3, CallbackInfo var4) {
      this.pulse$inHand = false;
   }

   @Inject(
      method = {"method_3186"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$noWorldBob(class_4587 var1, float var2, CallbackInfo var3) {
      if (!this.pulse$inHand) {
         u var4 = m.a(u.class);
         t var5 = m.a(t.class);
         q var6 = m.a(q.class);
         if (var4 != null && var4.o() || var5 != null && var5.p() || var6 != null && var6.p()) {
            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"method_3198"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$noHurtCam(class_4587 var1, float var2, CallbackInfo var3) {
      if (m.b(o.class)) {
         var3.cancel();
      }
   }
}
