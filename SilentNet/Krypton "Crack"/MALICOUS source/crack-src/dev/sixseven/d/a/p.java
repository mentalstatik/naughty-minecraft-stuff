package dev.sixseven.d.a;

import dev.sixseven.mixin.EntityNoClipAccessor;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import net.minecraft.class_10255;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;

public final class p extends dev.sixseven.d.c {
   private static volatile p d;
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Speed", "Boat movement speed", 0.5, 0.05, 3.0, 0.05, " blocks/tick"));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("NoClip", "Disable boat and passenger collision while flying", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Lock Rotation", "Keep the boat heading fixed while allowing free camera movement", true));
   private final Map<class_10255, Boolean> e = new WeakHashMap<>();
   private final Map<class_10255, Boolean> f = new WeakHashMap<>();
   private final Map<class_1297, Boolean> g = new WeakHashMap<>();
   private final Map<class_10255, Float> h = new WeakHashMap<>();
   private volatile UUID i;

   public p() {
      super("Boat Fly", "Fly and strafe a boat with camera-relative WASD", dev.sixseven.d.b.g);
      d = this;
   }

   public static p k() {
      return d;
   }

   public static boolean a(class_10255 var0, class_1297 var1) {
      p var2 = d;
      class_310 var3 = class_310.method_1551();
      if (var2 != null && var3.field_1724 != null && var1 != null && var2.f()) {
         synchronized (var2) {
            return var2.c.i()
               && var3.field_1724.method_5667().equals(var1.method_5667())
               && (var3.field_1724.method_5854() == var0 || var0.method_5667().equals(var2.i));
         }
      } else {
         return false;
      }
   }

   @Override
   public synchronized void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1690 != null && var1.field_1724.method_5854() instanceof class_10255 var2) {
         UUID var4 = var2.method_5667();
         if (!var4.equals(this.i)) {
            this.l();
            this.i = var4;
         }

         this.b(var2, var1.field_1724);
      } else {
         this.l();
      }
   }

   public static void a(class_10255 var0) {
      p var1 = d;
      class_310 var2 = class_310.method_1551();
      if (var1 != null && var2.field_1724 != null) {
         synchronized (var1) {
            if (!var1.f()) {
               var1.l();
            } else if (var0.method_5667().equals(var1.i)) {
               class_1297 var4 = var0.method_31483();
               if (var4 != null && var4.method_5667().equals(var2.field_1724.method_5667())) {
                  var1.b(var0, var4);
               } else {
                  var1.b(var0);
                  if (var4 != null) {
                     var1.a(var4);
                  }
               }
            }
         }
      }
   }

   public static class_243 a(class_10255 var0, class_243 var1) {
      p var2 = d;
      class_310 var3 = class_310.method_1551();
      if (var2 != null && var3.field_1724 != null && var3.field_1690 != null) {
         synchronized (var2) {
            boolean var5 = var3.field_1724.method_5854() == var0;
            if (var5 && !var0.method_5667().equals(var2.i)) {
               var2.l();
               var2.i = var0.method_5667();
            }

            if (var2.f() && var0.method_5667().equals(var2.i)) {
               Object var6 = var5 ? var3.field_1724 : var0.method_31483();
               if (var6 != null && var6.method_5667().equals(var3.field_1724.method_5667())) {
                  var2.b(var0, (class_1297)var6);
                  double var7 = (var3.field_1690.field_1894.method_1434() ? 1.0 : 0.0) - (var3.field_1690.field_1881.method_1434() ? 1.0 : 0.0);
                  double var9 = (var3.field_1690.field_1913.method_1434() ? 1.0 : 0.0) - (var3.field_1690.field_1849.method_1434() ? 1.0 : 0.0);
                  double var11 = (var3.field_1690.field_1903.method_1434() ? 1.0 : 0.0) - (var3.field_1690.field_1867.method_1434() ? 1.0 : 0.0);
                  double var13 = Math.sqrt(var7 * var7 + var9 * var9);
                  if (var13 > 1.0) {
                     var7 /= var13;
                     var9 /= var13;
                  }

                  double var15 = Math.toRadians((double)var3.field_1724.method_36454());
                  double var17 = -Math.sin(var15) * var7 + Math.cos(var15) * var9;
                  double var19 = Math.cos(var15) * var7 + Math.sin(var15) * var9;
                  double var21 = var2.a.i();
                  return new class_243(var17 * var21, var11 * var21, var19 * var21);
               } else {
                  return var1;
               }
            } else {
               return var1;
            }
         }
      } else {
         return var1;
      }
   }

   @Override
   protected synchronized void i() {
      this.l();
   }

   private void b(class_10255 var1, class_1297 var2) {
      this.f.putIfAbsent(var1, var1.method_5721());
      var1.method_5875(true);
      if (this.b.i()) {
         this.e.putIfAbsent(var1, ((EntityNoClipAccessor)var1).sixsevenclient$getNoClip());
         ((EntityNoClipAccessor)var1).sixsevenclient$setNoClip(true);
         if (var2 != null) {
            this.g.putIfAbsent(var2, ((EntityNoClipAccessor)var2).sixsevenclient$getNoClip());
            ((EntityNoClipAccessor)var2).sixsevenclient$setNoClip(true);
         }
      } else {
         this.c(var1);
         if (var2 != null) {
            this.b(var2);
         }
      }

      if (this.c.i()) {
         float var3 = this.h.computeIfAbsent(var1, var0 -> var0.method_36454());
         var1.method_36456(var3);
      } else {
         this.h.remove(var1);
      }
   }

   private void b(class_10255 var1) {
      this.c(var1);
      Boolean var2 = this.f.remove(var1);
      if (var2 != null) {
         var1.method_5875(var2);
      }

      this.h.remove(var1);
   }

   private void c(class_10255 var1) {
      Boolean var2 = this.e.remove(var1);
      if (var2 != null) {
         ((EntityNoClipAccessor)var1).sixsevenclient$setNoClip(var2);
      }
   }

   private void a(class_1297 var1) {
      this.b(var1);
   }

   private void b(class_1297 var1) {
      Boolean var2 = this.g.remove(var1);
      if (var2 != null) {
         ((EntityNoClipAccessor)var1).sixsevenclient$setNoClip(var2);
      }
   }

   private void l() {
      for (Entry var2 : this.e.entrySet()) {
         ((EntityNoClipAccessor)((class_1297)var2.getKey())).sixsevenclient$setNoClip((Boolean)var2.getValue());
      }

      for (Entry var5 : this.f.entrySet()) {
         ((class_10255)var5.getKey()).method_5875((Boolean)var5.getValue());
      }

      for (Entry var6 : this.g.entrySet()) {
         ((EntityNoClipAccessor)var6.getKey()).sixsevenclient$setNoClip((Boolean)var6.getValue());
      }

      this.e.clear();
      this.f.clear();
      this.g.clear();
      this.h.clear();
      this.i = null;
   }
}
