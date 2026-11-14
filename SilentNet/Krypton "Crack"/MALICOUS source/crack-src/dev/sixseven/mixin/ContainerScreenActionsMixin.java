package dev.sixseven.mixin;

import dev.sixseven.d.a.ao;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_465;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_465.class})
public abstract class ContainerScreenActionsMixin {
   private static final int BUTTON_WIDTH = 42;
   private static final int BUTTON_HEIGHT = 14;
   private static final int BUTTON_GAP = 3;

   @Inject(
      method = {"method_25394(Lnet/minecraft/class_332;IIF)V"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$renderStorageActions(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class_465 var6 = (class_465)this;
      if (ao.a(var6)) {
         AbstractContainerScreenAccessor var7 = (AbstractContainerScreenAccessor)var6;
         int var8 = var7.getLeftPos() + var7.getImageWidth() - 84 - 3 - 2;
         int var9 = Math.max(2, var7.getTopPos() - 14 - 3);
         if (var7.getTopPos() - 14 - 3 < 2) {
            var9 = var7.getTopPos() + 2;
         }

         class_327 var10 = class_310.method_1551().field_1772;
         this.drawButton(var1, var10, var8, var9, ao.a(), var2, var3, true);
         this.drawButton(var1, var10, var8 + 42 + 3, var9, "Undo", var2, var3, ao.b());
      }
   }

   @Inject(
      method = {"method_25402(Lnet/minecraft/class_11909;Z)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$handleStorageActions(class_11909 var1, boolean var2, CallbackInfoReturnable<Boolean> var3) {
      class_465 var4 = (class_465)this;
      if (ao.a(var4)) {
         if (ao.c()) {
            var3.setReturnValue(true);
         } else if (var1.method_74245() == 0) {
            AbstractContainerScreenAccessor var5 = (AbstractContainerScreenAccessor)var4;
            int var6 = var5.getLeftPos() + var5.getImageWidth() - 84 - 3 - 2;
            int var7 = Math.max(2, var5.getTopPos() - 14 - 3);
            if (var5.getTopPos() - 14 - 3 < 2) {
               var7 = var5.getTopPos() + 2;
            }

            double var8 = var1.comp_4798();
            double var10 = var1.comp_4799();
            if (this.inside(var8, var10, var6, var7)) {
               ao.b(var4);
               var3.setReturnValue(true);
            } else if (this.inside(var8, var10, var6 + 42 + 3, var7)) {
               ao.c(var4);
               var3.setReturnValue(true);
            }
         }
      }
   }

   @Inject(
      method = {"method_25403(Lnet/minecraft/class_11909;DD)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$lockStorageDrag(class_11909 var1, double var2, double var4, CallbackInfoReturnable<Boolean> var6) {
      if (ao.c() && ao.a((class_465<?>)this)) {
         var6.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_25406(Lnet/minecraft/class_11909;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$lockStorageRelease(class_11909 var1, CallbackInfoReturnable<Boolean> var2) {
      if (ao.c() && ao.a((class_465<?>)this)) {
         var2.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_25404(Lnet/minecraft/class_11908;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$lockStorageKeys(class_11908 var1, CallbackInfoReturnable<Boolean> var2) {
      if (ao.c() && ao.a((class_465<?>)this)) {
         var2.setReturnValue(true);
      }
   }

   private void drawButton(class_332 var1, class_327 var2, int var3, int var4, String var5, int var6, int var7, boolean var8) {
      boolean var9 = this.inside((double)var6, (double)var7, var3, var4);
      int var10 = !var8 ? -1070911432 : (var9 ? -531795055 : -802342587);
      var1.method_25294(var3, var4, var3 + 42, var4 + 14, -436207616);
      var1.method_25294(var3 + 1, var4 + 1, var3 + 42 - 1, var4 + 14 - 1, var10);
      int var11 = var8 ? (var9 ? -1 : -1643021) : -7169631;
      int var12 = var2.method_27525(class_2561.method_43470(var5));
      var1.method_25300(var2, var5, var3 + (42 - var12) / 2, var4 + 3, var11);
   }

   private boolean inside(double var1, double var3, int var5, int var6) {
      return var1 >= (double)var5 && var1 < (double)(var5 + 42) && var3 >= (double)var6 && var3 < (double)(var6 + 14);
   }
}
