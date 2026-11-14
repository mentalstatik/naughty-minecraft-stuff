package dev.sixseven.d.a;

import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_310;
import net.minecraft.class_746;

public class t extends dev.sixseven.d.c {
   public final dev.sixseven.i.c a = this.a(new dev.sixseven.i.c("Color", "Base tint for every accessory", -49508));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Rainbow", "Cycle every accessory through the rainbow", false));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Glow", "Soft outer-halo intensity", 70.0, 0.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("First Person", "Also show your accessories in first-person view", false));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Cape", "A flowing cloth cape down your back", true));
   public final dev.sixseven.i.f f = this.a(new dev.sixseven.i.f("Cape Style", "Cape look", "67", "67", "Wave", "Grid", "Solid"));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Cape Physics", "Sway & billow with your movement", true));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Trail", "A glowing trail left behind as you move", true));
   public final dev.sixseven.i.f i = this.a(new dev.sixseven.i.f("Trail Style", "Trail look", "Ribbon", "Ribbon", "Sparkle", "Echo"));
   public final dev.sixseven.i.h j = this.a(new dev.sixseven.i.h("Trail Length", "How long the trail lingers", 1.2, 0.2, 4.0, 0.1, "s"));
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Aura", "An orbiting aura around your feet", false));
   public final dev.sixseven.i.f l = this.a(new dev.sixseven.i.f("Aura Style", "Aura look", "Orbit", "Orbit", "Ring"));
   public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("Crown", "A floating, spinning 67 above your head", false));
   private final Deque<t.a> n = new ArrayDeque<>();
   private static final int o = 256;

   public t() {
      super("CustomAccessories", "Client-side cosmetics — cape, trail, aura & crown", dev.sixseven.d.b.e);
      dev.sixseven.i.f var1 = this.f;
      dev.sixseven.i.b var2 = this.e;
      var1.a(var2::i);
      dev.sixseven.i.b var3 = this.g;
      var2 = this.e;
      var3.a(var2::i);
      dev.sixseven.i.f var4 = this.i;
      var2 = this.h;
      var4.a(var2::i);
      dev.sixseven.i.h var5 = this.j;
      var2 = this.h;
      var5.a(var2::i);
      dev.sixseven.i.f var6 = this.l;
      var2 = this.k;
      var6.a(var2::i);
   }

   public Deque<t.a> k() {
      return this.n;
   }

   @Override
   public void j() {
      if (!this.h.i()) {
         if (!this.n.isEmpty()) {
            this.n.clear();
         }
      } else {
         class_746 var1 = class_310.method_1551().field_1724;
         if (var1 != null) {
            double var2 = var1.method_23317();
            double var4 = var1.method_23318() + (double)var1.method_17682() * 0.5;
            double var6 = var1.method_23321();
            this.n.addLast(new t.a(var2, var4, var6, System.nanoTime()));
            long var8 = System.nanoTime() - (long)((double)Math.max(0.2F, this.j.d()) * 1.4E9);

            while (!this.n.isEmpty() && this.n.peekFirst().d < var8) {
               this.n.removeFirst();
            }

            while (this.n.size() > 256) {
               this.n.removeFirst();
            }
         }
      }
   }

   @Override
   protected void i() {
      this.l();
   }

   public void l() {
      this.n.clear();
   }

   public int m() {
      if (this.b.i()) {
         float var1 = (float)(System.currentTimeMillis() % 4000L) / 4000.0F * 360.0F;
         return dev.sixseven.n.c.a(var1, 0.8F, 1.0F) & 16777215;
      } else {
         return this.a.i() & 16777215;
      }
   }

   public float n() {
      return this.c.d() / 100.0F;
   }

   public static final class a {
      public final double a;
      public final double b;
      public final double c;
      public final long d;

      a(double x, double y, double z, long nanos) {
         this.a = x;
         this.b = y;
         this.c = z;
         this.d = nanos;
      }

      public float a(long now) {
         return (float)(now - this.d) / 1.0E9F;
      }
   }
}
