package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.function.DoubleFunction;

public class T extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Strength", "Blur strength", 30.0, 5.0, 100.0, 5.0, "%").a((DoubleFunction<String>)(v -> {
      int var2x = (int)Math.round(v);
      String var3 = var2x <= 20 ? "Subtle" : (var2x <= 45 ? "Balanced" : (var2x <= 70 ? "Smooth" : (var2x <= 90 ? "Heavy" : "Cinematic")));
      return var2x + "% · " + var3;
   })));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Theme Trails", "Tint the trails with your theme accent (Winter look)", true));
   public final dev.sixseven.i.h c = this.a(new dev.sixseven.i.h("Tint", "How strongly trails take the theme color", 30.0, 0.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("FPS Compensated", "Keep the blur consistent across framerates", true));

   public T() {
      super("MotionBlur", "Cinematic motion blur", dev.sixseven.d.b.e);
      dev.sixseven.i.h var1 = this.c;
      dev.sixseven.i.b var2 = this.b;
      var1.a(var2::i);
   }

   @Override
   protected void i() {
      dev.sixseven.g.r.a();
   }

   public double k() {
      return Math.clamp((double)this.a.d() / 100.0, 0.05, 0.95);
   }

   public float l() {
      return this.b.i() ? (float)Math.clamp((double)this.c.d() / 100.0, 0.0, 1.0) : 0.0F;
   }

   public int m() {
      return SixSevenClient.themes().a().a();
   }
}
