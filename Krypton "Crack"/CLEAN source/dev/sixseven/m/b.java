package dev.sixseven.m;

import com.google.gson.JsonObject;
import dev.sixseven.i.g;
import dev.sixseven.i.h;
import java.util.List;

public class b {
   public final h a = new h("Master Volume", "Volume for all client sounds", 60.0, 0.0, 100.0, 5.0, "%");
   public final dev.sixseven.i.b b = new dev.sixseven.i.b("GUI Open/Close", "Whoosh when the menu opens and closes", true);
   public final dev.sixseven.i.b c = new dev.sixseven.i.b("Hover", "Soft ticks when hovering elements", true);
   public final dev.sixseven.i.b d = new dev.sixseven.i.b("Clicks & Toggles", "Pops for toggles, sliders and keybinds", true);
   public final dev.sixseven.i.b e = new dev.sixseven.i.b("Notifications", "Chimes with toggle toasts", true);
   public final dev.sixseven.i.b f;
   public final dev.sixseven.i.b g;
   public final dev.sixseven.i.b h;
   public final dev.sixseven.i.b i;
   private final List<g<?>> k;
   public final dev.sixseven.i.b j = new dev.sixseven.i.b("Startup Intro", "Play the selected track when Minecraft reaches the title screen", false);

   public b() {
      this.f = new dev.sixseven.i.b("67", "Startup track candidate", true);
      this.g = new dev.sixseven.i.b("67 Sad Song", "Startup track candidate", false);
      this.h = new dev.sixseven.i.b("67 Song", "Startup track candidate", false);
      this.i = new dev.sixseven.i.b("67 Tiki Phonk", "Startup track candidate", false);
      this.k = List.of(this.a, this.b, this.c, this.d, this.e, this.j, this.f, this.g, this.h, this.i);
   }

   public List<g<?>> a() {
      return this.k;
   }

   public float b() {
      return this.a.d() / 100.0F;
   }

   public JsonObject c() {
      JsonObject var1 = new JsonObject();

      for (g var3 : this.k) {
         var1.add(var3.g(), var3.f());
      }

      return var1;
   }

   public void a(JsonObject json) {
      for (g var3 : this.k) {
         if (json.has(var3.g())) {
            var3.a(json.get(var3.g()));
         }
      }
   }
}
