package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.C;
import dev.sixseven.d.a.U;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_327;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public class GuiSidebarMixin {
   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$beginSidebar(class_332 var1, class_266 var2, CallbackInfo var3) {
      C var4 = fakeStats();
      if (var4 != null) {
         var4.l();
      }
   }

   @Redirect(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I",
         ordinal = 1
      )
   )
   private int sixsevenclient$lineWidth(class_327 var1, class_5348 var2) {
      C var3 = fakeStats();
      class_2561 var4 = var2 instanceof class_2561 ? (class_2561)var2 : null;
      if (var3 != null && var2 instanceof class_2561) {
         try {
            var4 = var3.a(var4);
         } catch (Exception var8) {
         }
      }

      U var5 = nameProtect();
      if (var5 != null && var4 != null) {
         try {
            var4 = var5.a(var4);
         } catch (Exception var7) {
         }
      }

      return var1.method_27525((class_5348)(var4 == null ? var2 : var4));
   }

   @Redirect(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_327;method_27525(Lnet/minecraft/class_5348;)I",
         ordinal = 0
      )
   )
   private int sixsevenclient$sidebarEntryWidth(class_327 var1, class_5348 var2) {
      U var3 = nameProtect();
      if (var3 != null && var2 instanceof class_2561 var4) {
         try {
            return var1.method_27525(var3.a(var4));
         } catch (Exception var6) {
         }
      }

      return var1.method_27525(var2);
   }

   @ModifyArg(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V"
      ),
      index = 1
   )
   private class_2561 sixsevenclient$sidebarEntryName(class_2561 var1) {
      U var2 = nameProtect();
      if (var2 == null) {
         return var1;
      } else {
         try {
            return var2.a(var1);
         } catch (Exception var4) {
            return var1;
         }
      }
   }

   @ModifyArg(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;method_51439(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;IIIZ)V",
         ordinal = 1
      ),
      index = 1
   )
   private class_2561 sixsevenclient$lineText(class_2561 var1) {
      class_2561 var2 = var1;
      U var3 = nameProtect();
      if (var3 != null) {
         try {
            var2 = var3.a(var2);
         } catch (Exception var7) {
         }
      }

      C var4 = fakeStats();
      if (var4 != null) {
         try {
            var2 = var4.b(var2);
         } catch (Exception var6) {
         }
      }

      return var2;
   }

   private static C fakeStats() {
      d var0 = SixSevenClient.modules();
      return var0 != null && var0.al != null && var0.al.f() ? var0.al : null;
   }

   private static U nameProtect() {
      d var0 = SixSevenClient.modules();
      return var0 != null && var0.J != null && var0.J.f() ? var0.J : null;
   }
}
