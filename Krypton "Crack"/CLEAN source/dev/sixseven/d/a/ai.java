package dev.sixseven.d.a;

public class ai extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(new dev.sixseven.i.h("Speed", "Swing speed multiplier (<1 = slower/smoother)", 0.3, 0.1, 3.0, 0.1, "x"));

   public ai() {
      super("SwingSpeed", "Adjusts hand swing animation speed", dev.sixseven.d.b.f);
   }

   public float k() {
      return this.a.d();
   }
}
