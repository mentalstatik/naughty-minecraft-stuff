package dev.sixseven.i;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.class_1792;

public class d extends g<List<d.a>> {
   private final Map<String, d.a> a = new LinkedHashMap<>();

   public d(String name, String description) {
      super(name, description, new ArrayList<>());
   }

   public d.a a(String key, String label, class_1792 icon, boolean enabled, int color) {
      d.a var6 = new d.a(key, label, icon, enabled, color);
      this.b.add(var6);
      this.a.put(key, var6);
      return var6;
   }

   public List<d.a> a() {
      return this.b;
   }

   public d.a a(String key) {
      return this.a.get(key);
   }

   public boolean b(String key) {
      d.a var2 = this.a.get(key);
      return var2 != null && var2.a.i();
   }

   public int c(String key) {
      d.a var2 = this.a.get(key);
      return var2 != null ? var2.b.i() : -1;
   }

   public int b() {
      return this.b.size();
   }

   public long c() {
      return this.b.stream().filter(e -> e.a.i()).count();
   }

   @Override
   public JsonElement f() {
      JsonArray var1 = new JsonArray();

      for (d.a var3 : this.b) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("key", var3.c);
         var4.addProperty("enabled", var3.a.i());
         var4.addProperty("color", var3.b.i());
         var1.add(var4);
      }

      return var1;
   }

   @Override
   public void a(JsonElement element) {
      if (element != null && element.isJsonArray()) {
         for (JsonElement var3 : element.getAsJsonArray()) {
            if (var3.isJsonObject()) {
               JsonObject var4 = var3.getAsJsonObject();
               if (var4.has("key")) {
                  d.a var5 = this.a.get(var4.get("key").getAsString());
                  if (var5 != null) {
                     if (var4.has("enabled")) {
                        var5.a.a(var4.get("enabled").getAsBoolean());
                     }

                     if (var4.has("color")) {
                        var5.b.a(Integer.valueOf(var4.get("color").getAsInt()));
                     }
                  }
               }
            }
         }
      }
   }

   public static final class a {
      private final String c;
      private final String d;
      private final class_1792 e;
      public final b a;
      public final c b;

      a(String key, String label, class_1792 icon, boolean enabled, int color) {
         this.c = key;
         this.d = label;
         this.e = icon;
         this.a = new b("Enabled", "Highlight this type", enabled);
         this.b = new c(label, "Highlight color", color);
      }

      public String a() {
         return this.c;
      }

      public String b() {
         return this.d;
      }

      public class_1792 c() {
         return this.e;
      }

      public boolean a(String lowerQuery) {
         return this.d.toLowerCase(Locale.ROOT).contains(lowerQuery) || this.c.contains(lowerQuery);
      }
   }
}
