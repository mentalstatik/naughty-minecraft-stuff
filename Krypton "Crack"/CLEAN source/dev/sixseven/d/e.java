package dev.sixseven.d;

import dev.sixseven.g.v;
import dev.sixseven.i.g;
import dev.sixseven.i.h;
import java.util.function.DoubleFunction;

public final class e {
   private e() {
   }

   public static class a extends dev.sixseven.d.c {
      public final dev.sixseven.i.c a = this.a(new dev.sixseven.i.c("Color", "Outline color", -11943937));
      public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Rainbow", "Cycle the outline through the rainbow", false));
      public final h c = this.a(new h("Glow", "Outer glow intensity", 60.0, 0.0, 100.0, 5.0, "%"));
      public final h d = this.a(new h("Thickness", "Core line width", 2.5, 1.0, 6.0, 0.5, "px"));
      public final h e = this.a(new h("Fill", "Transparent fill inside the block", 12.0, 0.0, 60.0, 2.0, "%"));
      public final dev.sixseven.i.f f = this.a(new dev.sixseven.i.f("Animation", "Outline animation style", "Pulse", "Pulse", "Gradient Flow", "Static"));

      public a() {
         super("CustomBlockOutline", "Glowing animated outline on the targeted block", dev.sixseven.d.b.e);
         this.a(true);
      }
   }

   public static class b extends dev.sixseven.d.c {
      public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Blur", "Gaussian-blur the world behind the GUI", true));
      public final h b = this.a(new h("Blur Strength", "How strong the background blur is", 6.0, 1.0, 10.0, 1.0));
      public final dev.sixseven.i.f c = this.a(new dev.sixseven.i.f("Font", "GUI font (Xuong TTF or vanilla-style)", "Xuong", "Xuong", "Vanilla"));

      public b() {
         super("ClickGUI", "The WINTER CLIENT menu. In menus, Shift opens it too.", dev.sixseven.d.b.f);
         this.d().a(Integer.valueOf(344));
      }
   }

   public static class c extends dev.sixseven.d.c {
      public final dev.sixseven.i.b a = this.a(new dev.sixseven.i.b("Watermark", "The WINTER CLIENT badge", true));
      public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("ArrayList", "Enabled modules list", true));
      public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("FPS", "Framerate readout", true));
      public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Ping", "Latency readout", false));
      public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Coordinates", "Block position readout", true));
      public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Direction", "Facing readout", true));
      public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("TPS", "Server tick rate estimate", false));
      public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("CPS", "Clicks per second", false));
      public final dev.sixseven.i.b i = this.a(new dev.sixseven.i.b("Armor", "Equipped armor + durability", false));
      public final dev.sixseven.i.b j = this.a(new dev.sixseven.i.b("Potions", "Active effects with timers", false));
      public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Keystrokes", "WASD + mouse + space display", false));
      public final dev.sixseven.i.b l = this.a(new dev.sixseven.i.b("Radar", "Circular player radar", true));
      public final dev.sixseven.i.b m = this.a(new dev.sixseven.i.b("List Theme Sync", "ArrayList follows the theme color", true));
      public final dev.sixseven.i.c n = this.a(new dev.sixseven.i.c("List Color", "ArrayList color when Theme Sync is off", -49508));
      public final h o = this.a(new h("Radar Range", "Scan radius in blocks", 48.0, 16.0, 128.0, 4.0, "m"));
      public final dev.sixseven.i.b p = this.a(new dev.sixseven.i.b("Radar Heads", "Skin faces instead of dots", true));
      public final dev.sixseven.i.b q = this.a(new dev.sixseven.i.b("Notifications", "Themed toasts when modules toggle & the weather changes", true));
      public final h r = this.a(new h("Notify Duration", "How long a toast lingers before fading out", 2.5, 1.0, 6.0, 0.5, "s"));
      public final dev.sixseven.i.b s = this.a(new dev.sixseven.i.b("Keybinds", "Show assigned module shortcuts; enabled modules are highlighted", true));

      public c() {
         super("HUD", "All HUD elements — move & resize via chat (T)", dev.sixseven.d.b.f);
         this.a(true);
         h var1 = this.r;
         dev.sixseven.i.b var2 = this.q;
         var1.a(var2::i);
      }
   }

   public static class d extends dev.sixseven.d.c {
      public d(String var1, String var2, dev.sixseven.d.b var3, g<?>... var4) {
         super(var1, var2, var3);

         for (g var8 : var4) {
            this.a(var8);
         }
      }
   }

   public static class e extends dev.sixseven.d.c {
      public final dev.sixseven.i.f a = this.a(
         new dev.sixseven.i.f("Source", "Auto uses the real Spotify session (Windows); Demo shows sample data", "Auto", "Auto", "Demo")
      );
      public final dev.sixseven.i.b b = this.a(new dev.sixseven.i.b("Controls", "Show prev / play / next buttons", true));
      public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Volume", "Show a slider for Spotify's app volume (Windows)", true));
      public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Hide When Idle", "Hide the card when nothing plays", true));

      public e() {
         super("SpotifyHUD", "Now playing — skip and seek from the HUD", dev.sixseven.d.b.f);
         this.a(true);
      }
   }

   public static class f extends dev.sixseven.d.c {
      public final dev.sixseven.i.c a = this.a(new dev.sixseven.i.c("Color", "SusChunk fill, outline and zone marker color", -11943937));
      public final h b = this.a(
         new h("Sensitivity", "Higher = stricter: more weighted evidence before a chunk flags", 3.0, 1.0, 10.0, 1.0)
            .a((DoubleFunction<String>)(var0 -> (int)var0 + " (" + (int)var0 * 5 + ")"))
      );
      public final dev.sixseven.i.b c = this.a(new dev.sixseven.i.b("Amethyst", "Hidden grown clusters via server block light 5 — the strongest signal", true));
      public final dev.sixseven.i.b d = this.a(new dev.sixseven.i.b("Kelp", "Fully grown / unusually tall kelp columns", true));
      public final dev.sixseven.i.b e = this.a(new dev.sixseven.i.b("Bamboo", "Fully grown, max-height bamboo", true));
      public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Berries", "Sweet berry bushes at max growth stage", true));
      public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Vines", "Vines grown far down from their support", true));
      public final dev.sixseven.i.b h = this.a(new dev.sixseven.i.b("Dripstone", "Dripstone spikes longer than natural generation", true));
      public final h i = this.a(new h("Scan Speed", "Chunks scanned per tick", 10.0, 2.0, 24.0, 1.0));
      public final h j = this.a(new h("Render Y", "Height the flat chunk highlights render at", 100.0, -64.0, 320.0, 1.0));
      public final h k = this.a(new h("Fill Opacity", "Fill opacity of the chunk quads", 90.0, 0.0, 255.0, 1.0));
      public final dev.sixseven.i.b l = this.a(new dev.sixseven.i.b("Outline", "Crisp border along the chunk edges", true));
      public final h m = this.a(new h("Outline Opacity", "Border opacity", 200.0, 0.0, 255.0, 1.0));
      public final dev.sixseven.i.b n = this.a(new dev.sixseven.i.b("Smart Mode", "Merge nearby flags into zones with a centroid marker", true));
      public final h o = this.a(new h("Merge Radius", "Flags within this many chunks merge into one zone", 3.0, 1.0, 8.0, 1.0, " ch"));
      public final dev.sixseven.i.b p = this.a(new dev.sixseven.i.b("Centroid Marker", "Mark each zone's weighted centre — the likely base spot", true));
      public final dev.sixseven.i.b q = this.a(new dev.sixseven.i.b("Show on Radar", "Pulse sus zones on the Radar; far zones clamp to the edge", true));
      public final dev.sixseven.i.f r = this.a(
         new dev.sixseven.i.f("Notifications", "Announce each new zone once, with coords and distance", "Toast", "Toast", "Chat", "Off")
      );
      public final dev.sixseven.l.b s = new dev.sixseven.l.b(this);

      public f() {
         super("SusChunkFinder", "Finds long-loaded chunks — bases — via amethyst light & growth", dev.sixseven.d.b.d);
         h var1 = this.m;
         dev.sixseven.i.b var2 = this.l;
         var1.a(var2::i);
      }

      @Override
      public void j() {
         this.s.e();
      }

      @Override
      protected void i() {
         this.s.d();
         v.a();
      }
   }
}
