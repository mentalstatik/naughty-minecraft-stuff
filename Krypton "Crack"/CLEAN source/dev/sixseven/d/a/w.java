package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.Locale;

public class w extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(
      new dev.sixseven.i.f(
         "Style",
         "Glint texture. Default recolors the vanilla foil; the rest are custom patterns",
         "Default",
         "Default",
         "Ender",
         "Void",
         "Galaxy",
         "Toxic",
         "Amethyst",
         "Cyber",
         "Solar",
         "Prismatic",
         "Abyss"
      )
   );
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Mode", "Where the glint color comes from", "Solid", "Solid", "Rainbow", "Theme"));
   public final dev.sixseven.i.c c = this.a(new dev.sixseven.i.c("Color", "Glint color", -49508));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Strength", "Glint intensity", 60.0, 0.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Speed", "Rainbow cycle speed", 100.0, 10.0, 300.0, 10.0, "%"));

   public w() {
      super("CustomGlint", "Recolors or restyles the enchantment glint", dev.sixseven.d.b.c);
      this.b.a(() -> this.a.a("Default"));
      this.c.a(() -> this.a.a("Default") && this.b.a("Solid"));
      this.e.a(() -> this.a.a("Default") && this.b.a("Rainbow"));
   }

   public boolean k() {
      return this.f();
   }

   public boolean l() {
      return !this.a.a("Default");
   }

   public String m() {
      return this.a.i().toLowerCase(Locale.ROOT);
   }

   public float n() {
      return this.d.d() / 100.0F;
   }

   public int o() {
      String var1 = this.b.i();

      int var3 = switch (var1) {
         case "Rainbow" -> this.p();
         case "Theme" -> SixSevenClient.themes().a().a();
         default -> this.c.i();
      };
      float var5 = this.d.d() / 100.0F;
      int var8 = Math.round((float)dev.sixseven.n.c.b(var3) * var5);
      int var6 = Math.round((float)dev.sixseven.n.c.c(var3) * var5);
      int var7 = Math.round((float)dev.sixseven.n.c.d(var3) * var5);
      return dev.sixseven.n.c.a(var8, var6, var7);
   }

   private int p() {
      double var1 = (double)(System.nanoTime() % 1000000000000L) / 1.0E9;
      double var3 = var1 * 36.0 * (double)(this.e.d() / 100.0F) % 360.0;
      return dev.sixseven.n.c.a((float)var3, 0.85F, 1.0F);
   }
}
