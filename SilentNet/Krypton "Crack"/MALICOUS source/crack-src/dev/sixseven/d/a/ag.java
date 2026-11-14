package dev.sixseven.d.a;

import dev.sixseven.SixSevenClient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.minecraft.class_1109;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;

public class ag extends dev.sixseven.d.c {
   public final dev.sixseven.i.f a = this.a(
      new dev.sixseven.i.f(
         "Detect By",
         "How staff are recognised: the DonutSMP coloured star, a text rank prefix, or both",
         "Star + Rank",
         "Star + Rank",
         "Star Only",
         "Rank Only",
         "Names Only"
      )
   );
   public final dev.sixseven.i.i b = this.a(
      new dev.sixseven.i.i("Staff Names", "Extra known staff usernames (comma-separated) — always shown when online", "", 220, "e.g. Notch, jeb_")
   );
   public final dev.sixseven.i.i c = this.a(
      new dev.sixseven.i.i(
         "Rank Keywords", "Words in a name tag that mark staff (comma-separated), most senior first", dev.sixseven.k.a.g, 256, "owner, admin, mod…"
      )
   );
   public final dev.sixseven.i.i d = this.a(
      new dev.sixseven.i.i(
         "Star Symbols", "Marker glyphs that mean 'staff'. Paste the server's star here if detection misses", "★☆✦✧✪✩✫✬✭✮✯⭐✰❂⚝✴✵✶✷✸✹⍟", 96, "★ ✦ ⭐"
      )
   );
   public final dev.sixseven.i.b e = this.a(
      new dev.sixseven.i.b("Font Icons", "Also treat custom resource-pack icons (private-use glyphs) as staff stars", true)
   );
   public final dev.sixseven.i.b f = this.a(new dev.sixseven.i.b("Show Rank", "Show each staff member's rank label when the server exposes one", true));
   public final dev.sixseven.i.b g = this.a(new dev.sixseven.i.b("Show Ping", "Show each staff member's latency", false));
   public final dev.sixseven.i.b h = this.a(
      new dev.sixseven.i.b("Vanished Staff", "Include soft-vanished staff (spectator / hidden from tab), marked separately", true)
   );
   public final dev.sixseven.i.h i = this.a(
      new dev.sixseven.i.h("Max Rows", "Most staff rows to show before collapsing into a '+N more' line", 6.0, 1.0, 20.0, 1.0)
   );
   public final dev.sixseven.i.f j = this.a(
      new dev.sixseven.i.f("Alerts", "Announce when a new staff member appears in your tab", "Toast", "Toast", "Chat", "Off")
   );
   public final dev.sixseven.i.b k = this.a(new dev.sixseven.i.b("Alert Sound", "Play a bell when a staff alert fires", true));
   public final dev.sixseven.k.c l = new dev.sixseven.k.c(this);

   public ag() {
      super("StaffList", "Lists online staff on the HUD (DonutSMP coloured-star detection)", dev.sixseven.d.b.c);
      this.c.a(this::n);
      this.d.a(this::m);
      this.e.a(this::m);
      this.k.a(() -> !this.j.a("Off"));
   }

   private boolean m() {
      return this.a.a("Star + Rank") || this.a.a("Star Only");
   }

   private boolean n() {
      return this.a.a("Star + Rank") || this.a.a("Rank Only");
   }

   @Override
   protected void h() {
      this.l.b();
   }

   @Override
   protected void i() {
      this.l.c();
   }

   @Override
   public void j() {
      this.l.d();
   }

   public List<dev.sixseven.k.b> k() {
      return this.l.a();
   }

   public dev.sixseven.k.a.a l() {
      List var1 = b(this.c.i());
      return new dev.sixseven.k.a.a(this.a.i(), a(this.b.i()), var1.isEmpty() ? dev.sixseven.k.a.f : var1, this.d.i(), this.e.i(), this.h.i());
   }

   public void a(dev.sixseven.k.b e) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 != null && !this.j.a("Off")) {
         String var3 = ex.c().isEmpty() ? "Staff" : ex.c();
         String var4 = ex.e() ? " (vanished)" : "";
         if (this.j.a("Toast")) {
            if (SixSevenClient.notifications() != null) {
               SixSevenClient.notifications().a(var3 + " " + ex.b() + " online" + var4);
            }
         } else if (this.j.a("Chat")) {
            var2.field_1724.method_7353(class_2561.method_43470("§b[WINTER] §f" + var3 + " §b" + ex.b() + "§7 is online" + var4), false);
         }

         if (this.k.i()) {
            var2.method_1483().method_4873(class_1109.method_4757((class_3414)class_3417.field_14793.comp_349(), 1.5F, 0.6F));
         }
      }
   }

   private static Set<String> a(String raw) {
      HashSet var1 = new HashSet();

      for (String var5 : raw.split("[,\\s]+")) {
         if (!var5.isEmpty()) {
            var1.add(var5.toLowerCase(Locale.ROOT));
         }
      }

      return var1;
   }

   private static List<String> b(String raw) {
      ArrayList var1 = new ArrayList();

      for (String var5 : raw.split("[,\\s]+")) {
         String var6 = var5.trim().toLowerCase(Locale.ROOT);
         if (!var6.isEmpty()) {
            var1.add(var6);
         }
      }

      return var1;
   }
}
