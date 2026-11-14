package dev.sixseven.m;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class d {
   public static final int a = -49508;
   private final List<c> b = new ArrayList<>();
   private c c;

   public d() {
      this.b.add(new e());
      this.b.add(new c("Pink", -49508, false));
      this.b.add(new c("Purple", -5743361, false));
      this.b.add(new c("Blue", -11689985, false));
      this.b.add(new c("Red", -45715, false));
      this.b.add(new c("Emerald", -12654960, false));
      this.b.add(new a());
      this.c = (c)this.b.getFirst();
   }

   public c a() {
      return this.c;
   }

   public List<c> b() {
      return this.b;
   }

   public void a(c theme) {
      if (this.b.contains(theme)) {
         this.c = theme;
      }
   }

   public c a(int accent) {
      int var2 = 1;

      for (c var4 : this.b) {
         if (var4.c()) {
            var2++;
         }
      }

      c var5 = new c("Custom " + var2, accent, true);
      this.b.add(var5);
      return var5;
   }

   public void b(c theme) {
      if (theme.c() && this.b.remove(theme) && this.c == theme) {
         this.c = (c)this.b.getFirst();
      }
   }

   public JsonObject c() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("current", this.c.b());
      JsonArray var2 = new JsonArray();

      for (c var4 : this.b) {
         if (var4.c()) {
            JsonObject var5 = new JsonObject();
            var5.addProperty("name", var4.b());
            var5.addProperty("accent", var4.a());
            var2.add(var5);
         }
      }

      var1.add("custom", var2);
      return var1;
   }

   public void a(JsonObject json) {
      if (json != null) {
         this.b.removeIf(c::c);
         if (json.has("custom")) {
            for (JsonElement var3 : json.getAsJsonArray("custom")) {
               JsonObject var4 = var3.getAsJsonObject();
               this.b.add(new c(var4.get("name").getAsString(), var4.get("accent").getAsInt(), true));
            }
         }

         if (json.has("current")) {
            String var10000 = json.get("current").getAsString();
            if (var10000.equals("Pink")) {
               var10000 = "Winter";
            }

            String var5 = var10000;

            for (c var7 : this.b) {
               if (var7.b().equals(var5)) {
                  this.c = var7;
                  break;
               }
            }
         }
      }
   }
}
