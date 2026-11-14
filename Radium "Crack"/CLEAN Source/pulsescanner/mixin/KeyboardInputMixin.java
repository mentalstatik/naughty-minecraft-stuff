package pulsescanner.mixin;

import net.minecraft.class_10185;
import net.minecraft.class_241;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import pulsescanner.a.p;
import pulsescanner.f.m;
import pulsescanner.f.c.t;
import pulsescanner.f.f.g;

@Mixin({class_743.class})
public abstract class KeyboardInputMixin extends class_744 {
   @Inject(
      method = {"method_3129"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/class_743;field_54155:Lnet/minecraft/class_10185;",
         opcode = 181,
         ordinal = 0,
         shift = Shift.AFTER
      )},
      cancellable = true
   )
   private void pulse$combatMovement(CallbackInfo var1) {
      if (t.s()) {
         this.field_55868 = class_241.field_1340;
         this.field_54155 = class_10185.field_54098;
         var1.cancel();
      } else {
         class_10185 var2 = this.field_54155;
         float var3 = pulse$axis(var2.comp_3159(), var2.comp_3160());
         float var4 = pulse$axis(var2.comp_3161(), var2.comp_3162());
         p var5 = new p(var2, var3, var4);
         var5.a();
         if (!var5.c() && (var5.e() != var3 || var5.f() != var4)) {
            float var6 = var5.e();
            float var7 = var5.f();
            this.field_55868 = new class_241(var7, var6).method_35581();
            this.field_54155 = new class_10185(var6 > 0.0F, var6 < 0.0F, var7 > 0.0F, var7 < 0.0F, var2.comp_3163(), var2.comp_3164(), var2.comp_3165());
            this.pulse$freecamFreeze(var1);
            var1.cancel();
         }
      }
   }

   @Unique
   private static float pulse$axis(boolean var0, boolean var1) {
      return var0 == var1 ? 0.0F : (var0 ? 1.0F : -1.0F);
   }

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")}
   )
   private void pulse$freecamFreeze(CallbackInfo var1) {
      g var2 = m.a(g.class);
      if (var2 != null && var2.o()) {
         this.field_54155 = class_10185.field_54098;
         this.field_55868 = class_241.field_1340;
      }
   }
}
