package dev.sixseven.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.authlib.GameProfile;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import net.minecraft.class_2561;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_355.class})
public class PlayerTabOverlayMixin {
   @ModifyReturnValue(
      method = {"method_1918"},
      at = {@At("RETURN")}
   )
   private class_2561 sixsevenclient$protectTabName(class_2561 original, class_640 playerInfo) {
      d var3 = SixSevenClient.modules();
      if (var3 == null) {
         return original;
      } else {
         GameProfile var4 = playerInfo.method_2966();
         String var5 = var4 == null ? null : var4.name();
         Object var6 = original;
         if (var3.J != null && var3.J.f() && var5 != null && !var5.isEmpty()) {
            String var7 = var3.J.b(var5);
            if (var7 != null) {
               var6 = class_2561.method_43470(var7);
            }
         }

         if (var3.am != null && var5 != null) {
            var6 = var3.am.a((class_2561)var6, var5);
         }

         return (class_2561)var6;
      }
   }
}
