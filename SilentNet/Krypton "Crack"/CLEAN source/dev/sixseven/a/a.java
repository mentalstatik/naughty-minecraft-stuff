package dev.sixseven.a;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.sixseven.SixSevenClient;
import dev.sixseven.d.c;
import dev.sixseven.d.d;
import dev.sixseven.i.g;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.loader.api.FabricLoader;

public class a {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().create();
   private static final int f = 1;
   private final Path b = FabricLoader.getInstance().getConfigDir().resolve("sixsevenclient.json");
   private final d c;
   private final dev.sixseven.m.d d;
   private final Map<String, dev.sixseven.a.a.a> e = new LinkedHashMap<>();

   public a(d var1, dev.sixseven.m.d var2) {
      this.c = var1;
      this.d = var2;
   }

   public void a(String var1, Supplier<JsonObject> var2, Consumer<JsonObject> var3) {
      this.e.put(var1, new dev.sixseven.a.a.a(var2, var3));
   }

   public JsonObject a() {
      JsonObject var1 = new JsonObject();
      var1.add("theme", this.d.c());
      var1.addProperty("crosshairDefaultsVersion", 1);
      JsonObject var2 = new JsonObject();

      for (c var4 : this.c.a()) {
         JsonObject var5 = new JsonObject();
         var5.addProperty("enabled", var4.f());
         var5.add("keybind", var4.d().f());
         JsonObject var6 = new JsonObject();

         for (g var8 : var4.e()) {
            var6.add(var8.g(), var8.f());
         }

         var5.add("settings", var6);
         var2.add(var4.a() + "@" + var4.c().name(), var5);
      }

      var1.add("modules", var2);

      for (Entry var10 : this.e.entrySet()) {
         var1.add((String)var10.getKey(), (JsonElement)((dev.sixseven.a.a.a)var10.getValue()).a().get());
      }

      return var1;
   }

   public void a(JsonObject var1) {
      if (var1 != null) {
         this.b(var1);
         if (var1.has("theme") && var1.get("theme").isJsonObject()) {
            this.d.a(var1.getAsJsonObject("theme"));
         }

         if (var1.has("modules") && var1.get("modules").isJsonObject()) {
            JsonObject var2 = var1.getAsJsonObject("modules");

            for (c var4 : this.c.a()) {
               String var6 = var4.a();
               JsonObject var7 = var2.getAsJsonObject(var6 + "@" + var4.c().name());
               if (var7 != null) {
                  if (var7.has("enabled") && var7.get("enabled").getAsBoolean() != var4.f()) {
                     var4.a(var7.get("enabled").getAsBoolean());
                  }

                  if (var7.has("keybind")) {
                     var4.d().a(var7.get("keybind"));
                  }

                  JsonObject var5;
                  if ((var5 = var7.getAsJsonObject("settings")) != null) {
                     for (g var9 : var4.e()) {
                        if (var5.has(var9.g())) {
                           var9.a(var5.get(var9.g()));
                        }
                     }
                  }
               }
            }
         }

         for (Entry var11 : this.e.entrySet()) {
            if (var1.has((String)var11.getKey()) && var1.get((String)var11.getKey()).isJsonObject()) {
               ((dev.sixseven.a.a.a)var11.getValue()).b().accept(var1.getAsJsonObject((String)var11.getKey()));
            }
         }
      }
   }

   private void b(JsonObject var1) {
      if (!var1.has("crosshairDefaultsVersion") || var1.get("crosshairDefaultsVersion").getAsInt() < 1) {
         if (var1.has("modules") && var1.get("modules").isJsonObject()) {
            JsonObject var2 = var1.getAsJsonObject("modules");
            JsonObject var3 = var2.getAsJsonObject("CustomCrosshair@MISC");
            if (var3 != null) {
               var3.addProperty("enabled", true);
               JsonObject var4 = var3.getAsJsonObject("settings");
               if (var4 != null) {
                  var4.addProperty("Style", "67");
                  var4.addProperty("Color", -12532481);
                  var4.addProperty("Rainbow", false);
               }
            }
         }
      }
   }

   public synchronized void b() {
      try {
         Files.createDirectories(this.b.getParent());
         Files.writeString(this.b, a.toJson(this.a()));
      } catch (IOException var2) {
         SixSevenClient.LOGGER.error("Failed to save config", var2);
      }
   }

   public synchronized void c() {
      if (Files.exists(this.b)) {
         JsonObject var1;
         try {
            var1 = JsonParser.parseString(Files.readString(this.b)).getAsJsonObject();
         } catch (Exception var3) {
            SixSevenClient.LOGGER.error("Failed to read config, using defaults", var3);
            return;
         }

         this.a(var1);
      }
   }

   public static record a(Supplier<JsonObject> a, Consumer<JsonObject> b) {
   }
}
