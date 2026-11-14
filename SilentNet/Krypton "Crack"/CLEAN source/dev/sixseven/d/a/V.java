package dev.sixseven.d.a;

public class V extends dev.sixseven.d.c {
   public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Players", "Tag players with their IGN", true));
   public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Self", "Also tag your own player (best in 3rd person)", false));
   public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Items", "Tag dropped items on the ground", true));
   public final dev.sixseven.i.b d = this.a(
      new dev.sixseven.i.b("Hide Player Tags", "Remove the vanilla nametag of other players — only the module's shows", true)
   );
   public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Hide Own Tag", "Remove your own original nametag — only the module's Self tag shows", true));
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Hide Other Tags", "Also remove vanilla nametags of mobs, armor stands & frames", false));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Armor", "Show a player's equipped armor above their tag", true));
   public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Held Item", "Show what a player is holding above their tag", true));
   public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("Health", "Health bar under player tags", true));
   public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("Distance", "Append the distance in blocks", true));
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Item Amount", "Show the stack size on item tags", true));
   public final dev.sixseven.i.h l = this.a(new dev.sixseven.i.h("Scale", "Tag size", 1.0, 0.5, 2.0, 0.1, "x"));
   public final dev.sixseven.i.h m = this.a(new dev.sixseven.i.h("Opacity", "Tag transparency", 100.0, 10.0, 100.0, 5.0, "%"));
   public final dev.sixseven.i.h n = this.a(new dev.sixseven.i.h("Range", "Only tag within this distance", 64.0, 8.0, 256.0, 4.0, "m"));

   public V() {
      super("NameTags", "HUD-styled nametags for players & items", dev.sixseven.d.b.c);
   }
}
