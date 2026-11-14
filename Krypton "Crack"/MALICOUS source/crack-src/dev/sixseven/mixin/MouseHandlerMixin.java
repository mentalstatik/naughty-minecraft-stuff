package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.sixseven.SixSevenClient;
import dev.sixseven.c.b;
import dev.sixseven.d.d;
import net.minecraft.class_11910;
import net.minecraft.class_310;
import net.minecraft.class_312;
import net.minecraft.class_408;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public class MouseHandlerMixin {
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;

   @Inject(
      method = {"method_1606"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$aimAssist(double d, CallbackInfo ci) {
      d var4 = SixSevenClient.modules();
      if (var4 != null && var4.G != null && var4.G.f()) {
         double[] var5 = var4.G.a(d, this.field_1789, this.field_1787);
         if (var5 != null) {
            this.field_1789 = this.field_1789 + var5[0];
            this.field_1787 = this.field_1787 + var5[1];
         }
      }
   }

   @Inject(
      method = {"method_1601(JLnet/minecraft/class_11910;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$onButton(long window, class_11910 buttonInfo, int action, CallbackInfo ci) {
      class_310 var6 = class_310.method_1551();
      if (window == var6.method_22683().method_4490()) {
         if (action == 1 && var6.field_1755 == null) {
            dev.sixseven.n.d.a(buttonInfo.comp_4801());
         }

         if (var6.field_1755 instanceof class_408 && buttonInfo.comp_4801() == 0 && SixSevenClient.hud() != null) {
            if (action == 1) {
               if (b.a(SixSevenClient.hud())) {
                  ci.cancel();
               }
            } else if (action == 0 && b.b()) {
               b.c();
               SixSevenClient.config().b();
               ci.cancel();
            }
         }
      }
   }

   @ModifyExpressionValue(
      method = {"method_1606"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;"
      )},
      slice = {@Slice(
         from = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/class_315;method_42495()Lnet/minecraft/class_7172;"
         )
      )}
   )
   private Object sixsevenclient$zoomSensitivity(Object original) {
      d var2 = SixSevenClient.modules();
      if (var2 != null && var2.X != null && original instanceof Double var3) {
         double var4 = var2.X.k();
         if (var4 <= 1.0001) {
            return original;
         } else {
            double var6 = var3 * 0.6 + 0.2;
            double var8 = var6 / Math.cbrt(var4);
            double var10 = (var8 - 0.2) / 0.6;
            return Math.max(0.0, var10);
         }
      } else {
         return original;
      }
   }

   @Inject(
      method = {"method_1598(JDD)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$onScroll(long window, double xOffset, double yOffset, CallbackInfo ci) {
      class_310 var8 = class_310.method_1551();
      if (window == var8.method_22683().method_4490()
         && var8.field_1755 instanceof class_408
         && SixSevenClient.hud() != null
         && b.a(SixSevenClient.hud(), yOffset)) {
         ci.cancel();
      }
   }
}
