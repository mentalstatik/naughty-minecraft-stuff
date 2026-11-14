package pulsescanner.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.minecraft.class_4184;
import net.minecraft.class_5636;
import net.minecraft.class_761;
import net.minecraft.class_9909;
import net.minecraft.class_9916;
import net.minecraft.class_9960;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.f.m;
import pulsescanner.f.f.c;
import pulsescanner.f.f.f;
import pulsescanner.g.j;

@Mixin({class_761.class})
public abstract class WorldRendererMixin {
   @Shadow
   @Final
   private class_9960 field_53081;

   @ModifyVariable(
      method = {"method_22712"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0
   )
   private int pulse$outlineColor(int var1) {
      c var2 = m.a(c.class);
      return var2 != null && var2.b() ? var2.l.a() : var1;
   }

   @ModifyVariable(
      method = {"method_22712"},
      at = {@At("HEAD")},
      argsOnly = true,
      ordinal = 0
   )
   private float pulse$outlineWidth(float var1) {
      c var2 = m.a(c.class);
      return var2 != null && var2.b() ? var2.m.g() : var1;
   }

   @Inject(
      method = {"method_62200"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void pulse$customSky(class_9909 var1, class_4184 var2, GpuBufferSlice var3, CallbackInfo var4) {
      f var5 = m.a(f.class);
      if (var5 != null && var5.b()) {
         class_5636 var6 = var2.method_19334();
         if (var6 != class_5636.field_27887 && var6 != class_5636.field_27885) {
            class_9916 var7 = var1.method_61911("pulse_custom_sky");
            this.field_53081.field_53091 = var7.method_61933(this.field_53081.field_53091);
            var7.method_61929(WorldRendererMixin::lambda$pulse$customSky$0);
            var4.cancel();
         }
      }
   }

   private static void lambda$pulse$customSky$0(f var0, class_4184 var1) {
      j.a(var0, var1);
   }
}
