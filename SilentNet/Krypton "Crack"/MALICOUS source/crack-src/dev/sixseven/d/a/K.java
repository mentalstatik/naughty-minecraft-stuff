package dev.sixseven.d.a;

public class K extends dev.sixseven.d.c {
   public final dev.sixseven.i.h a = this.a(
      new dev.sixseven.i.h("Expand", "Disabled vs prediction anticheats — kept for config compatibility", 0.5, 0.0, 2.0, 0.05)
   );
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Enable Render", "", true));

   public K() {
      super("HitBox", "Hitbox expander (neutered: undetectable = does not widen server hitboxes)", dev.sixseven.d.b.a);
   }

   public float k() {
      return this.f() ? this.a.d() : 0.0F;
   }

   public boolean l() {
      return this.f() && this.b.i();
   }
}
