package dev.sixseven.a;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.sixseven.SixSevenClient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;

public class b {
   public static final int a = 5;
   public static final int b = 1;
   public static final String c = "67client-config";
   private static final Gson e = new GsonBuilder().setPrettyPrinting().create();
   public static volatile boolean d;
   private final dev.sixseven.a.a f;
   private final Path g;
   private final dev.sixseven.a.b.b[] h = new dev.sixseven.a.b.b[5];
   private int i = -1;

   public b(dev.sixseven.a.a config) {
      this.f = config;
      this.g = FabricLoader.getInstance().getConfigDir().resolve("sixsevenclient-configs");

      for (int var2 = 0; var2 < 5; var2++) {
         this.h[var2] = new dev.sixseven.a.b.b(var2);
      }
   }

   public static String a(int index) {
      return "Config " + (index + 1);
   }

   public dev.sixseven.a.b.b b(int index) {
      return this.h[index];
   }

   public dev.sixseven.a.b.b[] a() {
      return this.h;
   }

   public int b() {
      return this.i;
   }

   public Path c() {
      return this.g;
   }

   public void d() {
      for (int var1 = 0; var1 < 5; var1++) {
         this.g(var1);
      }

      JsonObject var3 = this.a(this.g.resolve("index.json"));
      if (var3 != null && var3.has("active")) {
         int var2 = var3.get("active").getAsInt();
         if (var2 >= 0 && var2 < 5 && this.h[var2].c) {
            this.i = var2;
         }
      }
   }

   private void g(int i) {
      dev.sixseven.a.b.b var2 = this.h[ix];
      JsonObject var3 = this.a(this.h(ix));
      JsonObject var4 = this.a(var3);
      if (var4 == null) {
         var2.c = false;
         var2.d = 0L;
         var2.b = a(ix);
      } else {
         var2.c = true;
         var2.b = var3.has("name") && !var3.get("name").getAsString().isBlank() ? var3.get("name").getAsString() : a(ix);
         var2.d = var3.has("savedAt") ? var3.get("savedAt").getAsLong() : 0L;
      }
   }

   public boolean c(int i) {
      dev.sixseven.a.b.b var2 = this.h[ix];
      JsonObject var3 = new JsonObject();
      var3.addProperty("format", "67client-config");
      var3.addProperty("version", 1);
      var3.addProperty("name", var2.b);
      var3.addProperty("savedAt", System.currentTimeMillis());
      var3.addProperty("client", "1.6.2");
      var3.add("state", this.f.a());
      if (!this.a(this.h(ix), var3)) {
         return false;
      } else {
         this.g(ix);
         return true;
      }
   }

   public boolean d(int i) {
      JsonObject var2 = this.a(this.a(this.h(ix)));
      if (var2 == null) {
         return false;
      } else {
         d = true;

         try {
            this.f.a(var2);
         } finally {
            d = false;
         }

         this.i = ix;
         this.e();
         return true;
      }
   }

   public boolean e(int i) {
      try {
         Files.deleteIfExists(this.h(ix));
      } catch (IOException var3) {
         SixSevenClient.LOGGER.error("Failed to delete config file {}", this.h(ix).getFileName(), var3);
         return false;
      }

      if (this.i == ix) {
         this.i = -1;
         this.e();
      }

      this.g(ix);
      return true;
   }

   public boolean a(int i, String name) {
      dev.sixseven.a.b.b var3 = this.h[ix];
      String var4 = this.a(name);
      if (var4.isEmpty()) {
         var4 = a(ix);
      }

      var3.b = var4;
      if (!var3.c) {
         return true;
      } else {
         JsonObject var5 = this.a(this.h(ix));
         if (var5 == null) {
            return false;
         } else {
            var5.addProperty("name", var4);
            return this.a(this.h(ix), var5);
         }
      }
   }

   public String f(int i) {
      JsonObject var2 = this.a(this.h(ix));
      if (this.a(var2) == null) {
         return null;
      } else {
         String var3 = e.toJson(var2);
         String var4 = this.b(this.h[ix].b);
         this.a(this.g.resolve(var4 + ".json"), var2);
         return var3;
      }
   }

   public dev.sixseven.a.b.a b(int i, String raw) {
      if (raw != null && !raw.isBlank()) {
         JsonObject var3;
         try {
            var3 = JsonParser.parseString(raw).getAsJsonObject();
         } catch (Exception var8) {
            return new dev.sixseven.a.b.a(false, "Not valid config JSON");
         }

         if (var3.has("version") && var3.get("version").isJsonPrimitive() && var3.get("version").getAsInt() > 1) {
            return new dev.sixseven.a.b.a(false, "Config is from a newer client");
         } else {
            JsonObject var4 = this.a(var3);
            if (var4 == null) {
               return new dev.sixseven.a.b.a(false, "No config data found");
            } else {
               dev.sixseven.a.b.b var5 = this.h[ix];
               String var6 = var3.has("name") && !var3.get("name").getAsString().isBlank() ? this.a(var3.get("name").getAsString()) : var5.b;
               JsonObject var7 = new JsonObject();
               var7.addProperty("format", "67client-config");
               var7.addProperty("version", 1);
               var7.addProperty("name", var6);
               var7.addProperty("savedAt", var3.has("savedAt") ? var3.get("savedAt").getAsLong() : System.currentTimeMillis());
               if (var3.has("client")) {
                  var7.addProperty("client", var3.get("client").getAsString());
               }

               var7.add("state", var4);
               if (!this.a(this.h(ix), var7)) {
                  return new dev.sixseven.a.b.a(false, "Couldn't write the slot file");
               } else {
                  this.g(ix);
                  return new dev.sixseven.a.b.a(true, "Imported \"" + var5.b + "\"");
               }
            }
         }
      } else {
         return new dev.sixseven.a.b.a(false, "Clipboard is empty");
      }
   }

   private JsonObject a(JsonObject file) {
      if (file == null) {
         return null;
      } else if (file.has("state") && file.get("state").isJsonObject()) {
         return file.getAsJsonObject("state");
      } else {
         return file.has("modules") && file.get("modules").isJsonObject() ? file : null;
      }
   }

   private Path h(int i) {
      return this.g.resolve("slot" + (ix + 1) + ".json");
   }

   private void e() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("active", this.i);
      this.a(this.g.resolve("index.json"), var1);
   }

   private JsonObject a(Path path) {
      if (!Files.exists(path)) {
         return null;
      } else {
         try {
            return JsonParser.parseString(Files.readString(path)).getAsJsonObject();
         } catch (Exception var3) {
            SixSevenClient.LOGGER.warn("Ignoring unreadable config file {}", path.getFileName(), var3);
            return null;
         }
      }
   }

   private boolean a(Path path, JsonObject json) {
      try {
         Files.createDirectories(this.g);
         Files.writeString(path, e.toJson(json));
         return true;
      } catch (IOException var4) {
         SixSevenClient.LOGGER.error("Failed to write config file {}", path.getFileName(), var4);
         return false;
      }
   }

   private String a(String name) {
      if (name == null) {
         return "";
      } else {
         String var2 = name.replaceAll("[\\r\\n\\t]", " ").trim();
         return var2.length() > 24 ? var2.substring(0, 24) : var2;
      }
   }

   private String b(String name) {
      String var2 = name.replaceAll("[^a-zA-Z0-9-_ ]", "").trim().replace(' ', '_');
      return var2.isEmpty() ? "config" : var2;
   }

   public static record a(boolean a, String b) {
   }

   public static final class b {
      private final int a;
      private String b;
      private boolean c;
      private long d;

      b(int index) {
         this.a = index;
         this.b = dev.sixseven.a.b.a(index);
      }

      public int a() {
         return this.a;
      }

      public String b() {
         return this.b;
      }

      public boolean c() {
         return this.c;
      }

      public long d() {
         return this.d;
      }
   }
}
