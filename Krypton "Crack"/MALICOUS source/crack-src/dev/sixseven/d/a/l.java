package dev.sixseven.d.a;

import dev.sixseven.mixin.KeyMappingAccessor;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3675.class_306;
import net.minecraft.class_3675.class_307;

public class l extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(new dev.sixseven.i.f("Mode", "Walking mode.", "Simple", "Simple", "Smart"));
   public final dev.sixseven.i.f b = this.a(
      new dev.sixseven.i.f("Direction", "The direction to walk in Simple mode.", "Forwards", "Forwards", "Backwards", "Left", "Right")
   );
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Disable On Input", "Disable the module on manual movement input.", false));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Disable On Y Change", "Disable the module if you move vertically.", false));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("No Unloaded Chunks", "Do not walk into unloaded chunks.", true));

   public l() {
      super("AutoWalk", "Automatically walks forward.", dev.sixseven.d.b.c);
      this.b.a(() -> this.a.a("Simple"));
      this.d.a(() -> this.a.a("Simple"));
      this.e.a(() -> this.a.a("Simple"));
   }

   @Override
   protected void i() {
      this.b(class_310.method_1551());
   }

   @Override
   public void j() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1687 != null) {
         this.b(var1);
         if (this.a.a("Smart")) {
            var1.field_1690.field_1894.method_23481(true);
            var1.field_1690.field_1867.method_23481(true);
            if (var1.field_1724.field_5976 && var1.field_1724.method_24828()) {
               var1.field_1690.field_1903.method_23481(true);
            }
         } else if (this.d.i() && var1.field_1724.field_6036 != var1.field_1724.method_23318()) {
            this.g();
         } else if (!this.e.i() || this.a(var1)) {
            String var2 = this.b.i();
            switch (var2) {
               case "Forwards":
                  var1.field_1690.field_1894.method_23481(true);
                  break;
               case "Backwards":
                  var1.field_1690.field_1881.method_23481(true);
                  break;
               case "Left":
                  var1.field_1690.field_1913.method_23481(true);
                  break;
               case "Right":
                  var1.field_1690.field_1849.method_23481(true);
            }
         }
      } else {
         this.b(var1);
      }
   }

   @Override
   public boolean a(int keyCode) {
      class_310 var2 = class_310.method_1551();
      if (this.c.i() && var2.field_1755 == null && this.a(var2, keyCode)) {
         this.g();
      }

      return false;
   }

   private boolean a(class_310 mc) {
      double var2 = Math.toRadians((double)mc.field_1724.method_36454());
      double var4 = -Math.sin(var2);
      double var6 = Math.cos(var2);
      String var8 = this.b.i();
      double var10;
      double var12;
      switch (var8) {
         case "Backwards":
            var10 = -var4;
            var12 = -var6;
            break;
         case "Left":
            var10 = -var6;
            var12 = var4;
            break;
         case "Right":
            var10 = var6;
            var12 = -var4;
            break;
         default:
            var10 = var4;
            var12 = var6;
      }

      int var14 = (int)Math.floor(mc.field_1724.method_23317() + var10 * 2.0);
      int var15 = (int)Math.floor(mc.field_1724.method_23321() + var12 * 2.0);
      return mc.field_1687.method_2935().method_12123(var14 >> 4, var15 >> 4);
   }

   private void b(class_310 mc) {
      if (mc.field_1690 != null) {
         mc.field_1690.field_1894.method_23481(false);
         mc.field_1690.field_1881.method_23481(false);
         mc.field_1690.field_1913.method_23481(false);
         mc.field_1690.field_1849.method_23481(false);
         mc.field_1690.field_1903.method_23481(false);
         mc.field_1690.field_1867.method_23481(false);
      }
   }

   private boolean a(class_310 mc, int keyCode) {
      class_315 var3 = mc.field_1690;
      return a(var3.field_1894, keyCode)
         || a(var3.field_1881, keyCode)
         || a(var3.field_1913, keyCode)
         || a(var3.field_1849, keyCode)
         || a(var3.field_1903, keyCode)
         || a(var3.field_1832, keyCode);
   }

   private static boolean a(class_304 km, int keyCode) {
      class_306 var2 = ((KeyMappingAccessor)km).sixsevenclient$getKey();
      return var2.method_1442() == class_307.field_1668 && var2.method_1444() == keyCode;
   }
}
