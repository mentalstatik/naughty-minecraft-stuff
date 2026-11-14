package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import dev.sixseven.mixin.EntityNoClipAccessor;
import java.util.Locale;
import java.util.function.DoubleFunction;
import net.minecraft.class_1297;
import net.minecraft.class_1656;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class W extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Speed", "NoClip movement speed (10 = normal creative flight)", 10.0, 1.0, 100.0, 1.0)
         .a((DoubleFunction<String>)(var0 -> String.format(Locale.ROOT, "%.1fx", var0 / 10.0)))
   );
   private class_746 b;
   private boolean c;
   private boolean d;
   private boolean e;
   private boolean f;
   private float g;

   public W() {
      super("NoClip", "Move through blocks using normal WASD and jump/sneak controls", dev.sixseven.d.b.b);
   }

   public static boolean a(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
         && var2.field_1724 != null
         && var0.method_5667().equals(var2.field_1724.method_5667())
         && var1 != null
         && var1.k != null
         && var1.k.f();
   }

   public static float b(class_1297 var0) {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      class_310 var2 = class_310.method_1551();
      return var0 != null
            && var2.field_1724 != null
            && var0.method_5667().equals(var2.field_1724.method_5667())
            && var1 != null
            && var1.k != null
            && var1.k.f()
         ? 0.05F * var1.k.a.d() / 10.0F
         : 0.05F;
   }

   @Override
   protected void h() {
      dev.sixseven.d.d var1 = SixSevenClient.modules();
      if (var1 != null && var1.m != null && var1.m.f()) {
         var1.m.a(false);
      }

      this.k();
   }

   @Override
   public void j() {
      this.k();
   }

   @Override
   protected void i() {
      this.l();
   }

   private void k() {
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         this.l();
      } else {
         if (var1 != this.b) {
            this.l();
            this.b = var1;
            this.c = ((EntityNoClipAccessor)var1).sixsevenclient$getNoClip();
            this.d = var1.method_5721();
            class_1656 var2 = var1.method_31549();
            this.e = var2.field_7478;
            this.f = var2.field_7479;
            this.g = var2.method_7252();
         }

         ((EntityNoClipAccessor)var1).sixsevenclient$setNoClip(true);
         var1.method_5875(true);
         class_1656 var3 = var1.method_31549();
         var3.field_7478 = true;
         var3.field_7479 = true;
         var3.method_7248(0.05F * this.a.d() / 10.0F);
      }
   }

   private void l() {
      if (this.b != null) {
         ((EntityNoClipAccessor)this.b).sixsevenclient$setNoClip(this.c);
         this.b.method_5875(this.d);
         class_1656 var1 = this.b.method_31549();
         var1.field_7478 = this.e;
         var1.field_7479 = this.f;
         var1.method_7248(this.g);
         this.b = null;
      }
   }
}
