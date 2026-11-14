package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.H;
import dev.sixseven.g.g;
import dev.sixseven.g.t;
import dev.sixseven.g.x;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_757.class})
public class GameRendererMixin {
   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11228;method_70879()V",
         shift = Shift.AFTER
      )}
   )
   private void sixsevenclient$renderOverlay(class_9779 deltaTracker, boolean bl, CallbackInfo ci) {
      t.b();
   }

   @Inject(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = {@At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/RenderSystem;setProjectionMatrix(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V"
      )}
   )
   private void sixsevenclient$captureProjection(class_9779 deltaTracker, CallbackInfo ci, @Local(ordinal = 0) Matrix4f matrix4f) {
      x.a(matrix4f, deltaTracker.method_60637(false));
   }

   @ModifyArg(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11284;method_71116(IIDJLnet/minecraft/class_9779;ILnet/minecraft/class_4184;Z)V"
      ),
      index = 5
   )
   private int sixsevenclient$overrideBlurRadius(int blurriness) {
      return g.a(blurriness);
   }

   @ModifyReturnValue(
      method = {"method_3196(Lnet/minecraft/class_4184;FZ)F"},
      at = {@At("RETURN")}
   )
   private float sixsevenclient$zoomFov(float original) {
      d var2 = SixSevenClient.modules();
      if (var2 != null && var2.X != null) {
         double var3 = var2.X.k();
         return var3 > 1.0001 ? (float)((double)original / var3) : original;
      } else {
         return original;
      }
   }

   @ModifyExpressionValue(
      method = {"method_3196(Lnet/minecraft/class_4184;FZ)F"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_3532;method_16439(FFF)F",
         ordinal = 0
      )}
   )
   private float sixsevenclient$customFov(float sprintMultiplier) {
      d var2 = SixSevenClient.modules();
      return var2 != null && var2.Y != null ? var2.Y.a(sprintMultiplier) : sprintMultiplier;
   }

   @ModifyExpressionValue(
      method = {"method_3172"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_5498;method_31034()Z"
      )}
   )
   private boolean sixsevenclient$freecamRenderFirstPersonHands(boolean isFirstPerson) {
      H var2 = H.k();
      return var2 != null && var2.m() && var2.p() ? true : isFirstPerson;
   }
}
