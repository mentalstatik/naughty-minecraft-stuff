package echo.offline.mixin;

import java.util.concurrent.locks.LockSupport;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(
   targets = {"net.minecraft.class_310"},
   remap = false
)
public abstract class ShutdownRenderMixin {
   @Shadow
   private volatile boolean field_1698;
   @Unique
   private boolean echo$shutdownYieldReported;

   @Inject(
      method = {"method_1523(Z)V"},
      at = {@At("HEAD"), @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_310;method_1592()V",
         shift = Shift.AFTER
      )},
      cancellable = true,
      require = 2,
      remap = false
   )
   private void echo$yieldDuringShutdown(boolean var1, CallbackInfo var2) {
      if (!this.field_1698) {
         if (!this.echo$shutdownYieldReported) {
            this.echo$shutdownYieldReported = true;
            System.out.println("[echo shutdown] GPU redraws stopped; window events and server saving continue");
         }

         GLFW.glfwPollEvents();
         LockSupport.parkNanos(10000000L);
         var2.cancel();
      }
   }
}
