package dev.sixseven.d.a;

public class u extends dev.sixseven.d.c {
   private static final int k = -12532481;
   public final dev.sixseven.i.f a = this.a(
      new dev.sixseven.i.f("Style", "Crosshair shape", "67", "Dot", "Cross", "Circle", "T-Shape", "Brackets", "Chevron", "67")
   );
   public final dev.sixseven.i.h b = this.a(new dev.sixseven.i.h("Size", "Overall crosshair size", 7.0, 2.0, 24.0, 1.0, "px"));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Thickness", "Line / dot thickness", 2.0, 1.0, 6.0, 0.5, "px"));
   public final dev.sixseven.i.h d = this.a(new dev.sixseven.i.h("Gap", "Center gap for line styles", 3.0, 0.0, 12.0, 1.0, "px"));
   public final dev.sixseven.i.c e = this.a(new dev.sixseven.i.c("Color", "Crosshair color", -12532481));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Rainbow", "Cycle through the rainbow", false));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Center Dot", "Add a filled dot at the very center", false));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Outline", "Dark border for contrast on any background", true));
   public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("Glow", "Soft glow behind the crosshair", true));
   public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("Hide Vanilla", "Hide Minecraft's default crosshair", true));

   public u() {
      super("CustomCrosshair", "Draws a custom crosshair", dev.sixseven.d.b.c);
      this.a(true);
   }

   public boolean k() {
      return this.f() && this.j.i();
   }

   private int l() {
      if (this.f.i()) {
         float var1 = (float)(System.nanoTime() % 3000000000L) / 3.0E9F;
         return 0xFF000000 | dev.sixseven.n.c.a(var1, 0.85F, 1.0F) & 16777215;
      } else {
         return this.e.i();
      }
   }

   public void a(dev.sixseven.g.b.d var1, float var2, float var3) {
      int var4 = this.l();
      int var5 = this.h.i() ? -1342177280 : 0;
      float var6 = this.c.d();
      float var7 = this.b.d();
      float var8 = this.d.d();
      if (this.i.i()) {
         var1.a(var2, var3, var7 + 2.0F, 6.0F, dev.sixseven.n.c.a(var4, 0.45F));
      }

      String var9 = this.a.i();
      switch (var9) {
         case "Dot":
            this.a(var1, var2, var3, Math.max(1.5F, var7 * 0.35F), var4, var5);
            break;
         case "Cross":
            this.a(var1, var2, var3, var7, var6, var8, var4, var5, true, true);
            break;
         case "T-Shape":
            this.a(var1, var2, var3, var7, var6, var8, var4, var5, false, true);
            break;
         case "Circle":
            this.a(var1, var2, var3, var7, var6, var4, var5);
            break;
         case "Brackets":
            this.a(var1, var2, var3, var7, var6, var8, var4, var5);
            break;
         case "Chevron":
            if (var5 != 0) {
               var1.a(var2, var3 + var7 * 0.15F, var7 + 2.0F, var6 + 2.0F, var5, true);
            }

            var1.a(var2, var3 + var7 * 0.15F, var7, var6, var4, true);
            break;
         case "67":
            this.a(var1, var2, var3, var7, var4);
            break;
         default:
            this.a(var1, var2, var3, var7, var6, var8, var4, var5, true, true);
      }

      if (this.g.i() && !this.a.a("Dot") && !this.a.a("67")) {
         this.a(var1, var2, var3, Math.max(1.2F, var6 * 0.8F), var4, var5);
      }
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, int var5, int var6) {
      if (var6 != 0) {
         var1.a(var2, var3, var4 + 1.0F, var6);
      }

      var1.a(var2, var3, var4, var5);
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      if (var7 != 0) {
         var1.d(var2, var3, var4, var5 + 2.0F, var7);
      }

      var1.d(var2, var3, var4, var5, var6);
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9, boolean var10) {
      if (var8 != 0) {
         this.a(var1, var2, var3, var4, var5 + 2.0F, var6, var8, var9, var10);
      }

      this.a(var1, var2, var3, var4, var5, var6, var7, var9, var10);
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, float var6, int var7, boolean var8, boolean var9) {
      var1.b(var2 + var6, var3, var2 + var6 + var4, var3, var5, var7);
      var1.b(var2 - var6, var3, var2 - var6 - var4, var3, var5, var7);
      if (var8) {
         var1.b(var2, var3 - var6, var2, var3 - var6 - var4, var5, var7);
      }

      if (var9) {
         var1.b(var2, var3 + var6, var2, var3 + var6 + var4, var5, var7);
      }
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      float var9 = Math.max(2.0F, var4 * 0.5F);
      float var10 = var4 + var6 * 0.4F;
      if (var8 != 0) {
         this.a(var1, var2, var3, var10, var9, var5 + 2.0F, var8);
      }

      this.a(var1, var2, var3, var10, var9, var5, var7);
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      var1.b(var2 - var4, var3 - var4, var2 - var4 + var5, var3 - var4, var6, var7);
      var1.b(var2 - var4, var3 - var4, var2 - var4, var3 - var4 + var5, var6, var7);
      var1.b(var2 + var4, var3 - var4, var2 + var4 - var5, var3 - var4, var6, var7);
      var1.b(var2 + var4, var3 - var4, var2 + var4, var3 - var4 + var5, var6, var7);
      var1.b(var2 - var4, var3 + var4, var2 - var4 + var5, var3 + var4, var6, var7);
      var1.b(var2 - var4, var3 + var4, var2 - var4, var3 + var4 - var5, var6, var7);
      var1.b(var2 + var4, var3 + var4, var2 + var4 - var5, var3 + var4, var6, var7);
      var1.b(var2 + var4, var3 + var4, var2 + var4, var3 + var4 - var5, var6, var7);
   }

   private void a(dev.sixseven.g.b.d var1, float var2, float var3, float var4, int var5) {
      float var6 = var4 * 2.4F;
      float var7 = var1.a("W", var6);
      float var8 = var2 - var7 / 2.0F;
      var1.b("W", var8, var3, var6, dev.sixseven.n.c.a(-11689985, 0.6F));
      var1.a("W", var8, var3, var6, var5);
   }
}
