package pulsescanner.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.f.m;
import pulsescanner.f.f.i;

@Mixin({class_765.class})
public abstract class LightmapTextureManagerMixin {
   @Shadow
   @Final
   private GpuTexture field_57927;

   @Inject(
      method = {"method_3313"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$fullbright(float var1, CallbackInfo var2) {
      if (m.b(i.class)) {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.field_57927, -1);
         var2.cancel();
      }
   }
}
