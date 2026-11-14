package dev.sixseven.mixin;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.ae;
import dev.sixseven.d.a.n;
import dev.sixseven.g.o;
import dev.sixseven.g.u;
import dev.sixseven.n.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2620;
import net.minecraft.class_2622;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2672;
import net.minecraft.class_2761;
import net.minecraft.class_310;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public class ClientPacketListenerMixin {
   @Inject(
      method = {"method_11079"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$trackTps(class_2761 var1, CallbackInfo var2) {
      f.a();
   }

   @Inject(
      method = {"method_45730"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void sixsevenclient$fakeCommands(String var1, CallbackInfo var2) {
      d var3 = SixSevenClient.modules();
      if (var3 != null) {
         try {
            if (var3.ak != null && var3.ak.a(var1)) {
               var2.cancel();
               return;
            }

            if (var3.al != null && var3.al.a(var1)) {
               var2.cancel();
            }
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"method_11128"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$blockEntityChunk(class_2672 var1, CallbackInfo var2) {
      n var3 = module();
      if (var3 != null && var3.f() && var3.k()) {
         try {
            var1.method_38598().method_38587(var1.method_11523(), var1.method_11524()).accept((var1x, var2x, var3x) -> var3.a(var1x, var2x));
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"method_11094"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$blockEntityUpdate(class_2622 var1, CallbackInfo var2) {
      n var3 = module();
      if (var3 != null && var3.f() && var3.l()) {
         try {
            var3.a(var1.method_11293(), var1.method_11291());
         } catch (Exception var5) {
         }
      }
   }

   private static n module() {
      d var0 = SixSevenClient.modules();
      return var0 != null ? var0.Q : null;
   }

   private static ae spawnerProtect() {
      d var0 = SixSevenClient.modules();
      return var0 != null ? var0.ap : null;
   }

   @Inject(
      method = {"method_11116"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$spawnerProtectDestruction(class_2620 var1, CallbackInfo var2) {
      ae var3 = spawnerProtect();
      if (var3 != null && var3.f() && class_310.method_1551().method_18854()) {
         try {
            var3.a(var1.method_11280(), var1.method_11277());
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"method_11136"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$spawnerProtectBlockUpdate(class_2626 var1, CallbackInfo var2) {
      ae var3 = spawnerProtect();
      if (var3 != null && var3.f() && var3.m() && class_310.method_1551().method_18854()) {
         try {
            var3.a(var1.method_11309(), var1.method_11308(), false);
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"method_11136"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$updateEspBlock(class_2626 var1, CallbackInfo var2) {
      if (needsEspBlockUpdates()) {
         class_2338 var3 = var1.method_11309();
         class_2248 var4 = var1.method_11308().method_26204();
         int var5 = var3.method_10263();
         int var6 = var3.method_10264();
         int var7 = var3.method_10260();
         long var8 = o.a(var5, var6, var7);
         long var10 = class_1923.method_8331(var5 >> 4, var7 >> 4);
         applyWorldBlockUpdates(Map.of(var8, var4), Set.of(var10));
      }
   }

   @Inject(
      method = {"method_11100"},
      at = {@At("HEAD")}
   )
   private void sixsevenclient$spawnerProtectSectionUpdate(class_2637 var1, CallbackInfo var2) {
      ae var3 = spawnerProtect();
      if (var3 != null && var3.f() && var3.m() && class_310.method_1551().method_18854()) {
         try {
            var1.method_30621((var1x, var2x) -> var3.a(var1x, var2x, true));
         } catch (Exception var5) {
         }
      }
   }

   @Inject(
      method = {"method_11100"},
      at = {@At("TAIL")}
   )
   private void sixsevenclient$updateEspSection(class_2637 var1, CallbackInfo var2) {
      if (needsEspBlockUpdates()) {
         HashMap var3 = new HashMap();
         HashSet var4 = new HashSet();
         var1.method_30621((var2x, var3x) -> {
            int var6 = var2x.method_10263();
            int var7 = var2x.method_10260();
            long var8 = o.a(var6, var2x.method_10264(), var7);
            var3.put(var8, var3x.method_26204());
            var4.add(class_1923.method_8331(var6 >> 4, var7 >> 4));
         });
         applyWorldBlockUpdates(var3, var4);
      }
   }

   private static boolean needsEspBlockUpdates() {
      d var0 = SixSevenClient.modules();
      return var0 != null
         && (
            var0.w != null && var0.w.f()
               || var0.v != null && var0.v.f()
               || var0.e != null && var0.e.f()
               || var0.ad != null && var0.ad.f()
               || var0.ae != null && var0.ae.f()
         );
   }

   private static void applyWorldBlockUpdates(Map<Long, class_2248> var0, Set<Long> var1) {
      d var2 = SixSevenClient.modules();
      if (var2 != null) {
         if (var2.w != null && var2.w.f()) {
            dev.sixseven.g.d.a(var0);
         }

         if (var2.v != null && var2.v.f()) {
            u.a(var0);
         }

         if (var2.e != null && var2.e.f()) {
            for (long var4 : var1) {
               var2.e.s.a(class_1923.method_8325(var4), class_1923.method_8332(var4));
            }
         }

         if (var2.ad != null && var2.ad.f()) {
            for (long var8 : var1) {
               var2.ad.a(class_1923.method_8325(var8), class_1923.method_8332(var8));
            }
         }

         if (var2.ae != null && var2.ae.f()) {
            for (long var9 : var1) {
               var2.ae.a(class_1923.method_8325(var9), class_1923.method_8332(var9));
            }
         }
      }
   }
}
