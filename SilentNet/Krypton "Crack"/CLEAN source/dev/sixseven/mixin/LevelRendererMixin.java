package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.g.a;
import dev.sixseven.g.b;
import dev.sixseven.g.c;
import dev.sixseven.g.e;
import dev.sixseven.g.h;
import dev.sixseven.g.i;
import dev.sixseven.g.m;
import dev.sixseven.g.n;
import dev.sixseven.g.p;
import dev.sixseven.g.q;
import dev.sixseven.g.u;
import dev.sixseven.g.v;
import net.minecraft.class_11658;
import net.minecraft.class_12074;
import net.minecraft.class_4587;
import net.minecraft.class_761;
import net.minecraft.class_4597.class_4598;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public class LevelRendererMixin {
   @Inject(
      method = {"method_62210(Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_4587;ZLnet/minecraft/class_11658;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$customBlockOutline(class_4598 var1, class_4587 var2, boolean var3, class_11658 var4, CallbackInfo var5) {
      d var6 = SixSevenClient.modules();
      if (var6 != null) {
         if (var3 && var6.e.f()) {
            v.a(var1, var2, var4.field_63082.field_63078, var6.e);
         }

         if (var3 && var6.ad != null && var6.ad.f()) {
            h.a(var1, var2, var4.field_63082.field_63078, var6.ad);
         }

         if (var3 && var6.ae != null && var6.ae.f()) {
            b.a(var1, var2, var4.field_63082.field_63078, var6.ae);
         }

         if (var3 && var6.v != null && var6.v.f()) {
            u.a(var1, var2, var4.field_63082.field_63078, var6.v);
         }

         if (var3 && var6.w != null && var6.w.f()) {
            dev.sixseven.g.d.a(var1, var2, var4.field_63082.field_63078, var6.w);
         }

         if (var3 && var6.Q != null && var6.Q.f()) {
            c.a(var1, var2, var4.field_63082.field_63078, var6.Q);
         }

         if (var3 && var6.R != null && var6.R.f()) {
            q.a(var1, var2, var4.field_63082.field_63078, var6.R);
         }

         if (var3 && var6.S != null && var6.S.f()) {
            n.a(var1, var2, var4.field_63082.field_63078, var6.S);
         }

         if (var3 && var6.O != null && var6.O.f()) {
            i.a(var1, var2, var4.field_63082.field_63078, var6.O);
         }

         if (var3 && var6.P != null && var6.P.f()) {
            i.a(var1, var2, var4.field_63082.field_63078, var6.P);
         }

         if (var3 && var6.V != null && var6.V.f()) {
            p.a(var1, var2, var4.field_63082.field_63078, var6.V);
         }

         if (var3 && var6.Z != null && var6.Z.f()) {
            m.a(var1, var2, var4.field_63082.field_63078, var6.Z);
         }

         if (var3 && var6.ac != null && var6.ac.f()) {
            a.a(var1, var2, var4.field_63082.field_63078, var6.ac);
         }

         if (var6.T != null && var6.T.m()) {
            var5.cancel();
         } else if (var6.d.f()) {
            var5.cancel();
            class_12074 var7 = var4.field_63083;
            if (var7 != null && var7.comp_4933() == var3) {
               e.a(var1, var2, var7, var4.field_63082.field_63078, var6.d);
            }
         }
      }
   }
}
