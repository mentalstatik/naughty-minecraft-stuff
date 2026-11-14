package dev.sixseven.mixin;

import com.mojang.authlib.GameProfile;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.B;
import dev.sixseven.d.a.V;
import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_640;
import net.minecraft.class_746;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_897.class})
public class EntityNameTagMixin {
   @Inject(
      method = {"method_3926"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$nameTag(class_10017 state, class_4587 poseStack, class_11659 collector, class_12075 cameraRenderState, CallbackInfo ci) {
      d var6 = SixSevenClient.modules();
      if (var6 != null && state.field_53337 != null) {
         V var7 = var6.L;
         boolean var8 = var7 != null && var7.f();
         if (var8) {
            String var9 = state.field_53337.getString();
            if (isLocalPlayer(var9)) {
               if (var7.e.i() || var7.a.i() && var7.b.i()) {
                  ci.cancel();
                  return;
               }
            } else if (isOnlinePlayer(var9)) {
               if (var7.a.i() || var7.d.i()) {
                  ci.cancel();
                  return;
               }
            } else if (var7.f.i()) {
               ci.cancel();
               return;
            }
         }

         if (var6.J != null && var6.J.f()) {
            String var10 = var6.J.b(state.field_53337.getString());
            if (var10 != null) {
               state.field_53337 = class_2561.method_43470(var10);
            }
         }

         B var11 = var6.am;
         if (var11 != null && isLocalPlayer(state.field_53337.getString())) {
            state.field_53337 = var11.a(state.field_53337);
         }
      }
   }

   private static boolean isLocalPlayer(String display) {
      if (display != null && !display.isEmpty()) {
         class_746 var1 = class_310.method_1551().field_1724;
         if (var1 == null) {
            return false;
         } else {
            String var2 = var1.method_7334().name();
            return var2 != null && !var2.isEmpty() && display.contains(var2);
         }
      } else {
         return false;
      }
   }

   private static boolean isOnlinePlayer(String display) {
      if (display != null && !display.isEmpty()) {
         class_310 var1 = class_310.method_1551();
         if (var1.method_1562() == null) {
            return false;
         } else {
            for (class_640 var3 : var1.method_1562().method_2880()) {
               GameProfile var4 = var3.method_2966();
               String var5 = var4 == null ? null : var4.name();
               if (var5 != null && !var5.isEmpty() && display.contains(var5)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }
}
