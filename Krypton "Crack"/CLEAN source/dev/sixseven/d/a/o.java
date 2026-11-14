package dev.sixseven.d.a;

public class o extends dev.sixseven.d.c {
   public final dev.sixseven.i.a a = this.a(new dev.sixseven.i.a("Target Blocks", "Pick which blocks to highlight"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Shape Mode", "How highlights are drawn", "Both", "Both", "Lines", "Sides"));
   public final dev.sixseven.i.c c = this.a(new dev.sixseven.i.c("Default Outline Color", "Color used for newly added blocks", -16711736));
   public final dev.sixseven.i.c d = this.a(new dev.sixseven.i.c("Fill Overlay", "Default fill tint", 419495880));
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Tracers", "Draw lines from the crosshair to each block", false));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Tracer", "Secondary tracer enable", true));
   public final dev.sixseven.i.c g = this.a(new dev.sixseven.i.c("Default Tracer Tint", "Tracer line color / alpha", 2097217480));
   public final dev.sixseven.i.h h = this.a(new dev.sixseven.i.h("Highlight Alpha", "Box opacity", 255.0, 0.0, 255.0, 5.0));
   public final dev.sixseven.i.h i = this.a(
      new dev.sixseven.i.h(
         "Chunk Radius", "Loaded chunks to scan around you; every vertical section down to the world's bottom is included", 12.0, 1.0, 32.0, 1.0, " chunks"
      )
   );

   public o() {
      super("BlockESP", "Highlights chosen blocks through walls across loaded chunks and their full vertical range", dev.sixseven.d.b.d);
      this.a.e();
      dev.sixseven.i.b var1 = this.f;
      dev.sixseven.i.b var2 = this.e;
      var1.a(var2::i);
      dev.sixseven.i.c var3 = this.g;
      var2 = this.e;
      var3.a(var2::i);
   }

   @Override
   public void j() {
      dev.sixseven.g.d.a(this);
   }

   @Override
   protected void i() {
      dev.sixseven.g.d.a();
   }
}
