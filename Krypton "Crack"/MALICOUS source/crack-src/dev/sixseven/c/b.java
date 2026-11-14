package dev.sixseven.c;

import dev.sixseven.g.t;
import dev.sixseven.g.b.d;
import net.minecraft.class_310;
import net.minecraft.class_408;

public final class b {
   private static a a;
   private static float b;
   private static float c;

   private b() {
   }

   public static boolean a() {
      return class_310.method_1551().field_1755 instanceof class_408;
   }

   public static boolean b() {
      return a != null;
   }

   public static boolean a(c hud) {
      d var1 = d.a();
      float var2 = t.c();
      float var3 = t.d();

      for (c.a var5 : hud.a(var1, t.e(), t.f(), true)) {
         if (var5.a(var2, var3)) {
            float var6 = var5.a().d();
            if (var5.a().b((var2 - var5.b()) / var6, (var3 - var5.c()) / var6)) {
               return true;
            }

            a = var5.a();
            b = var2 - var5.b();
            c = var3 - var5.c();
            return true;
         }
      }

      return false;
   }

   public static boolean a(c hud, double scrollY) {
      d var3 = d.a();
      float var4 = t.c();
      float var5 = t.d();

      for (c.a var7 : hud.a(var3, t.e(), t.f(), true)) {
         if (var7.a(var4, var5)) {
            a var8 = var7.a();
            var8.a(var8.d() + (float)scrollY * 0.06F);
            return true;
         }
      }

      return false;
   }

   public static void a(d vg) {
      if (a != null) {
         float var1 = t.e();
         float var2 = t.f();
         float var3 = a.d();
         float var4 = a.b(vg) * var3;
         float var5 = a.c(vg) * var3;
         float var6 = Math.max(1.0F, var1 - var4);
         float var7 = Math.max(1.0F, var2 - var5);
         a.a((t.c() - b) / var6, (t.d() - c) / var7);
      }
   }

   public static void c() {
      a = null;
   }

   public static a d() {
      return a;
   }
}
