package dev.sixseven.d.a;

import net.minecraft.class_2246;

public class ad extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Nametag", "Floating type + distance label", true));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Box", "Through-wall box on the spawner", true));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Range Ring", "Draw the 16-block activation ring", true));
   public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Distance", "Append the distance in blocks", true));
   public final dev.sixseven.i.h e = this.a(new dev.sixseven.i.h("Opacity", "Nametag transparency", 100.0, 10.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Tracers", "Draw lines from the crosshair to each spawner", false));
   public final dev.sixseven.g.f g = new dev.sixseven.g.f(
      state -> state.method_27852(class_2246.field_10260) || state.method_27852(class_2246.field_47336), 12, 8, 400, 96.0
   );

   public ad() {
      super("SpawnerNametags", "Shows spawner type + activation range", dev.sixseven.d.b.d);
   }

   @Override
   public void j() {
      this.g.c();
   }

   @Override
   protected void i() {
      this.g.b();
   }
}
