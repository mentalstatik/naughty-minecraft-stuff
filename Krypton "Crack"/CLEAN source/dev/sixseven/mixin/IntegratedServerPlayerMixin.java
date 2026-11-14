package dev.sixseven.mixin;

import dev.sixseven.d.a.F;
import dev.sixseven.d.a.W;
import net.minecraft.class_1656;
import net.minecraft.class_1657;
import net.minecraft.class_3222;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_3222.class})
public abstract class IntegratedServerPlayerMixin {
   @Unique
   private boolean sixsevenclient$capturedNoClip;
   @Unique
   private boolean sixsevenclient$previousNoClip;
   @Unique
   private boolean sixsevenclient$previousNoGravity;
   @Unique
   private boolean sixsevenclient$capturedFlight;
   @Unique
   private boolean sixsevenclient$previousMayFly;
   @Unique
   private boolean sixsevenclient$previousFlying;
   @Unique
   private float sixsevenclient$previousFlyingSpeed;

   @Inject(
      method = {"method_5773"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$syncMovementModules(CallbackInfo var1) {
      if (this instanceof class_1657 var3) {
         EntityNoClipAccessor var5 = (EntityNoClipAccessor)var3;
         if (W.a(var3)) {
            if (!this.sixsevenclient$capturedNoClip) {
               this.sixsevenclient$previousNoClip = var5.sixsevenclient$getNoClip();
               this.sixsevenclient$previousNoGravity = var3.method_5721();
               this.sixsevenclient$capturedNoClip = true;
            }

            var5.sixsevenclient$setNoClip(true);
            var3.method_5875(true);
         } else if (this.sixsevenclient$capturedNoClip) {
            var5.sixsevenclient$setNoClip(this.sixsevenclient$previousNoClip);
            var3.method_5875(this.sixsevenclient$previousNoGravity);
            this.sixsevenclient$capturedNoClip = false;
         }

         class_1656 var6 = var3.method_31549();
         boolean var7 = W.a(var3);
         boolean var8 = !var7 && F.c(var3);
         if (!var8 && !var7) {
            if (this.sixsevenclient$capturedFlight) {
               var6.field_7478 = this.sixsevenclient$previousMayFly;
               var6.field_7479 = this.sixsevenclient$previousFlying;
               var6.method_7248(this.sixsevenclient$previousFlyingSpeed);
               this.sixsevenclient$capturedFlight = false;
            }
         } else {
            if (!this.sixsevenclient$capturedFlight) {
               this.sixsevenclient$previousMayFly = var6.field_7478;
               this.sixsevenclient$previousFlying = var6.field_7479;
               this.sixsevenclient$previousFlyingSpeed = var6.method_7252();
               this.sixsevenclient$capturedFlight = true;
            }

            var6.field_7478 = true;
            var6.field_7479 = true;
            var6.method_7248(var7 ? W.b(var3) : F.a(var3));
         }
      }
   }
}
