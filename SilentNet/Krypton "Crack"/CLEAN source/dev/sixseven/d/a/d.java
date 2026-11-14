package dev.sixseven.d.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_5455;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.minecraft.class_8053;
import net.minecraft.class_8054;
import net.minecraft.class_8056;
import org.jetbrains.annotations.Nullable;

public class d extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(
      new dev.sixseven.i.f("Mode", "Hide wipes worn trims; Random gives every piece a random one", "Hide", "Hide", "Random")
   );
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Own Armor", "Also affect your own worn armor (F5 / inventory)", true));
   private class_5455 c;
   private final List<class_6880<class_8054>> d = new ArrayList<>();
   private final List<class_6880<class_8056>> e = new ArrayList<>();

   public d() {
      super("ArmorTrimHider", "Hides or randomizes worn armor trims", dev.sixseven.d.b.c);
   }

   public boolean k() {
      return this.b.i();
   }

   @Nullable
   public class_8053 a(class_1799 stack, @Nullable class_8053 original) {
      if (this.a.a("Random")) {
         class_8053 var3 = this.a(stack);
         return var3 != null ? var3 : original;
      } else {
         return null;
      }
   }

   @Nullable
   private class_8053 a(class_1799 stack) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1687 == null) {
         return null;
      } else {
         class_5455 var3 = var2.field_1687.method_30349();
         if (var3 != this.c) {
            this.a(var3);
         }

         if (!this.d.isEmpty() && !this.e.isEmpty()) {
            Random var4 = new Random((long)stack.method_7909().method_7876().hashCode());
            class_6880 var5 = this.d.get(var4.nextInt(this.d.size()));
            class_6880 var6 = this.e.get(var4.nextInt(this.e.size()));
            return new class_8053(var5, var6);
         } else {
            return null;
         }
      }
   }

   private void a(class_5455 access) {
      this.c = access;
      this.d.clear();
      this.e.clear();

      try {
         Stream var2 = access.method_30530(class_7924.field_42083).method_42017();
         List var3 = this.d;
         var2.forEach(var3::add);
         var2 = access.method_30530(class_7924.field_42082).method_42017();
         var3 = this.e;
         var2.forEach(var3::add);
      } catch (Exception var4) {
         this.d.clear();
         this.e.clear();
      }
   }

   @Override
   protected void i() {
      this.c = null;
      this.d.clear();
      this.e.clear();
   }
}
