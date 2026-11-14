package pulsescanner.a;

import net.minecraft.class_2596;

public class q extends n {
   private class_2596<?> b;
   private final b c;

   public q(class_2596<?> var1, b var2) {
      this.b = var1;
      this.c = var2;
   }

   public class_2596<?> d() {
      return this.b;
   }

   public void a(class_2596<?> var1) {
      this.b = var1;
   }

   public b e() {
      return this.c;
   }

   public boolean f() {
      try {
         if (this.c == pulsescanner.a.b.SEND) {
            return true;
         }
      } catch (MatchException var1) {
         throw a(var1);
      }

      return false;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
