package dev.sixseven.c;

import com.google.gson.JsonObject;
import dev.sixseven.c.a.g;
import dev.sixseven.c.a.h;
import dev.sixseven.c.a.i;
import dev.sixseven.c.a.j;
import dev.sixseven.c.a.k;
import dev.sixseven.d.d;
import dev.sixseven.d.e;
import dev.sixseven.n.f;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_746;

public class c {
   private final List<dev.sixseven.c.a> a = new ArrayList<>();

   public c(d var1, dev.sixseven.m.d var2, dev.sixseven.j.a var3, dev.sixseven.f.a var4) {
      e.c var5 = var1.b;
      this.a.add(new j(var2, () -> var5.f() && var5.a.i()));
      this.a.add(new dev.sixseven.c.a.b(var1, var5, var2, () -> var5.f() && var5.b.i()));
      this.a
         .add(
            new dev.sixseven.c.a.c(
               "fps", var2, "FPS", () -> Integer.toString(class_310.method_1551().method_47599()), 0.006F, 0.985F, () -> var5.f() && var5.c.i()
            )
         );
      this.a.add(new dev.sixseven.c.a.c("ping", var2, "Ping", c::e, 0.055F, 0.985F, () -> var5.f() && var5.d.i()));
      this.a.add(new dev.sixseven.c.a.c("coords", var2, "XYZ", c::d, 0.115F, 0.985F, () -> var5.f() && var5.e.i()));
      this.a.add(new dev.sixseven.c.a.c("direction", var2, "Facing", c::f, 0.24F, 0.985F, () -> var5.f() && var5.f.i()));
      this.a.add(new dev.sixseven.c.a.c("tps", var2, "TPS", () -> String.format("%.1f", f.c()), 0.33F, 0.985F, () -> var5.f() && var5.g.i()));
      this.a.add(new dev.sixseven.c.a.c("cps", var2, "CPS", () -> {
         int var0 = dev.sixseven.n.d.b(0);
         return var0 + " | " + dev.sixseven.n.d.b(1);
      }, 0.4F, 0.985F, () -> var5.f() && var5.h.i()));
      this.a.add(new dev.sixseven.c.a.a(var2, () -> var5.f() && var5.i.i()));
      this.a.add(new dev.sixseven.c.a.e(var2, () -> var5.f() && var5.j.i()));
      this.a.add(new dev.sixseven.c.a.d(var2, () -> var5.f() && var5.k.i()));
      this.a.add(new k(var1, var2, () -> var5.f() && var5.s.i()));
      this.a.add(new dev.sixseven.c.a.f(var5, var1.e, var2, () -> var5.f() && var5.l.i()));
      this.a.add(new g(var1.ai, var2));
      this.a.add(new i(var1.an, var2));
      this.a.add(new h(var1.c, var3, var2));
      this.a.add(var4);
   }

   private static String d() {
      class_746 var0 = class_310.method_1551().field_1724;
      if (var0 == null) {
         return "0, 0, 0";
      } else {
         class_2338 var1 = var0.method_24515();
         int var2 = var1.method_10263();
         return var2 + ", " + var1.method_10264() + ", " + var1.method_10260();
      }
   }

   private static String e() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && var0.method_1562() != null) {
         class_640 var1 = var0.method_1562().method_2871(var0.field_1724.method_5667());
         return var1 == null ? "0ms" : var1.method_2959() + "ms";
      } else {
         return "0ms";
      }
   }

   private static String f() {
      class_746 var0 = class_310.method_1551().field_1724;
      if (var0 == null) {
         return "N";
      } else {
         class_2350 var1 = var0.method_5735();

         return switch (var1) {
            case field_11043 -> "N  -Z";
            case field_11035 -> "S  +Z";
            case field_11039 -> "W  -X";
            case field_11034 -> "E  +X";
            default -> var1.method_10151().toUpperCase();
         };
      }
   }

   public List<dev.sixseven.c.a> a() {
      return this.a;
   }

   public boolean b() {
      for (dev.sixseven.c.a var2 : this.a) {
         if (!(var2 instanceof dev.sixseven.f.a) && var2.e()) {
            return true;
         }
      }

      return false;
   }

   public List<c.a> a(dev.sixseven.g.b.d var1, float var2, float var3, boolean var4) {
      ArrayList var5 = new ArrayList();

      for (dev.sixseven.c.a var7 : this.a) {
         if ((var4 || !(var7 instanceof dev.sixseven.f.a)) && (var4 || var7.e())) {
            var7.a(var1);
            float var8 = var7.d();
            float var9 = var7.b(var1) * var8;
            float var10 = var7.c(var1) * var8;
            float var11 = var7.b() * (var2 - var9);
            float var12 = var7.c() * (var3 - var10);
            var5.add(new c.a(var7, var11, var12, var9, var10));
         }
      }

      return var5;
   }

   public void a(dev.sixseven.g.b.d var1, float var2, float var3) {
      for (c.a var5 : this.a(var1, var2, var3, false)) {
         this.a(var1, var5);
      }
   }

   public void a(dev.sixseven.g.b.d var1, c.a var2) {
      float var3 = var2.a().d();
      var1.e();
      var1.a((float)Math.round(var2.b()), (float)Math.round(var2.c()));
      var1.a(var3);
      var2.a().a(var1, 0.0F, 0.0F, var2.d() / var3, var2.e() / var3);
      var1.f();
   }

   public JsonObject c() {
      JsonObject var1 = new JsonObject();

      for (dev.sixseven.c.a var3 : this.a) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("fx", var3.b());
         var4.addProperty("fy", var3.c());
         var4.addProperty("scale", var3.d());
         var1.add(var3.a(), var4);
      }

      return var1;
   }

   public void a(JsonObject var1) {
      for (dev.sixseven.c.a var3 : this.a) {
         JsonObject var4 = var1.getAsJsonObject(var3.a());
         if (var4 != null && var4.has("fx") && var4.has("fy")) {
            float var5 = var4.get("fx").getAsFloat();
            float var6 = var4.get("fy").getAsFloat();
            if ("keystrokes".equals(var3.a()) && var6 >= 0.98F) {
               var6 = 0.62F;
            }

            var3.a(var5, var6);
            if (var4.has("scale")) {
               var3.a(var4.get("scale").getAsFloat());
            }
         }
      }
   }

   public static record a(dev.sixseven.c.a a, float b, float c, float d, float e) {
      public boolean a(float var1, float var2) {
         return var1 >= this.b && var1 <= this.b + this.d && var2 >= this.c && var2 <= this.c + this.e;
      }
   }
}
