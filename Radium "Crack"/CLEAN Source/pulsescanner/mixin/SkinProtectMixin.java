package pulsescanner.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.class_1068;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_8685;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import pulsescanner.f.m;
import pulsescanner.f.f.s;

@Mixin({class_640.class})
public abstract class SkinProtectMixin {
   @Shadow
   public abstract GameProfile method_2966();

   @ModifyReturnValue(
      method = {"method_52810"},
      at = {@At("RETURN")},
      require = 0
   )
   private class_8685 pulse$protectSkin(class_8685 var1) {
      s var2 = m.a(s.class);
      if (var2 != null && var2.b()) {
         GameProfile var3 = this.method_2966();
         UUID var4 = var3 != null ? var3.id() : null;
         class_310 var5 = class_310.method_1551();
         boolean var6 = var5.field_1724 != null && var4 != null && var4.equals(var5.field_1724.method_7334().id());
         return !var6 && !var2.o() ? var1 : class_1068.method_4648(var4 != null ? var4 : UUID.randomUUID());
      } else {
         return var1;
      }
   }
}
