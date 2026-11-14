package echo.offline.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class LocalConfigStore {
   private static final Gson JSON = new GsonBuilder().setPrettyPrinting().create();
   private static final int MAX_BYTES = 33554432;
   private final Path directory;

   public LocalConfigStore(Path var1) {
      this.directory = var1.toAbsolutePath().normalize();
   }

   public synchronized String call(String var1, String[] var2) {
      if ("is_available".equals(var1)) {
         return "true";
      } else if (!Set.of("list_profiles_json", "get_profile_json", "save_profile_json", "select_profile_json", "delete_profile_json")
         .contains(var1 == null ? "" : var1)) {
         return JSON.toJson(failure("This operation is unavailable offline"));
      } else {
         try {
            Files.createDirectories(this.directory);

            String var8;
            try (
               FileChannel var3 = FileChannel.open(this.directory.resolve("profiles.lock"), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
               FileLock var26 = var3.tryLock();
            ) {
               if (var26 == null) {
                  return JSON.toJson(failure("Local configs are in use by another instance"));
               }

               JsonObject var27 = this.read();
               boolean var7 = false;
               JsonObject var6;
               switch (var1) {
                  case "list_profiles_json":
                     var6 = success(var27);
                     JsonArray var32 = new JsonArray();

                     for (JsonElement var37 : var27.getAsJsonArray("profiles")) {
                        var32.add(metadata(var37.getAsJsonObject(), text(var27, "activeConfigId")));
                     }

                     var6.add("configs", var32);
                     break;
                  case "get_profile_json":
                     String var31 = arg(var2, 0);
                     if (var31.isEmpty()) {
                        var31 = text(var27, "activeConfigId");
                     }

                     JsonObject var35 = find(var27, var31);
                     var6 = var35 == null ? failure("Local config not found") : profileResponse(var27, var35);
                     break;
                  case "save_profile_json":
                     if (var2 == null || var2.length != 6) {
                        throw new IllegalArgumentException("Invalid config save arguments");
                     }

                     String var29 = arg(var2, 0);
                     String var34 = arg(var2, 1);
                     String var12 = arg(var2, 5);
                     if (var34.isBlank()) {
                        throw new IllegalArgumentException("Config name is required");
                     }

                     JsonObject var13 = var29.isEmpty() ? null : find(var27, var29);
                     if (!var29.isEmpty() && var13 == null) {
                        throw new IllegalArgumentException("Local config not found");
                     }

                     if (!var12.isEmpty() && !JsonParser.parseString(var12).isJsonObject()) {
                        throw new IllegalArgumentException("Config data must be a JSON object");
                     }

                     long var14 = System.currentTimeMillis();
                     if (var13 == null) {
                        var13 = new JsonObject();
                        JsonObject var16 = new JsonObject();
                        var29 = UUID.randomUUID().toString();
                        var16.addProperty("id", var29);
                        var16.addProperty("author", "Local");
                        var16.addProperty("createdAt", var14);

                        for (String var20 : new String[]{"serverName", "serverIp", "serverIconBase64", "sourceId", "publishedId"}) {
                           var16.addProperty(var20, "");
                        }

                        var16.addProperty("owned", true);
                        var16.addProperty("publishedChanges", false);
                        var16.addProperty("updateAvailable", false);
                        var13.add("config", var16);
                        var13.addProperty("data", "{}");
                        var27.getAsJsonArray("profiles").add(var13);
                        if (text(var27, "activeConfigId").isEmpty()) {
                           var27.addProperty("activeConfigId", var29);
                        }
                     }

                     JsonObject var38 = var13.getAsJsonObject("config");
                     var38.addProperty("name", var34);
                     var38.addProperty("description", arg(var2, 2));
                     var38.addProperty("visibility", "public".equalsIgnoreCase(arg(var2, 3)) ? "public" : "private");
                     var38.addProperty("type", "rage".equalsIgnoreCase(arg(var2, 4)) ? "rage" : "legit");
                     var38.addProperty("updatedAt", var14);
                     if (!var12.isEmpty()) {
                        var13.addProperty("data", var12);
                     }

                     var6 = profileResponse(var27, var13);
                     var7 = true;
                     break;
                  case "select_profile_json":
                     String var28 = arg(var2, 0);
                     JsonObject var33 = find(var27, var28);
                     if (var33 == null && !var28.isEmpty()) {
                        throw new IllegalArgumentException("Local config not found");
                     }

                     var27.addProperty("activeConfigId", var28);
                     var6 = var33 == null ? success(var27) : profileResponse(var27, var33);
                     if (var33 == null) {
                        var6.add("config", JsonNull.INSTANCE);
                        var6.addProperty("data", "");
                     }

                     var7 = true;
                     break;
                  case "delete_profile_json":
                     String var10 = arg(var2, 0);
                     JsonObject var11 = find(var27, var10);
                     if (var11 == null) {
                        throw new IllegalArgumentException("Local config not found");
                     }

                     var27.getAsJsonArray("profiles").remove(var11);
                     if (var10.equals(text(var27, "activeConfigId"))) {
                        var27.addProperty("activeConfigId", "");
                     }

                     var6 = success(var27);
                     var6.addProperty("deletedConfigId", var10);
                     var7 = true;
                     break;
                  default:
                     throw new AssertionError(var1);
               }

               if (var7) {
                  this.write(var27);
               }

               var8 = JSON.toJson(var6);
            }

            return var8;
         } catch (Exception var25) {
            String var4 = var25 instanceof IllegalArgumentException
               ? var25.getMessage()
               : "Could not read or save local configs (" + var25.getClass().getSimpleName() + ")";
            System.err.println("[echo local configs] " + var4);
            return JSON.toJson(failure(var4));
         }
      }
   }

   private JsonObject read() throws IOException {
      Path var1 = this.directory.resolve("profiles.json");
      if (!Files.exists(var1)) {
         JsonObject var13 = new JsonObject();
         var13.addProperty("formatVersion", 1);
         var13.addProperty("activeConfigId", "");
         var13.add("profiles", new JsonArray());
         return var13;
      } else if (Files.size(var1) > 33554432L) {
         throw new IOException("Config store is too large");
      } else {
         JsonObject var2 = JsonParser.parseString(Files.readString(var1, StandardCharsets.UTF_8)).getAsJsonObject();
         if (var2.get("formatVersion").getAsInt() == 1 && var2.get("profiles").isJsonArray()) {
            HashSet var3 = new HashSet();

            for (JsonElement var5 : var2.getAsJsonArray("profiles")) {
               JsonObject var6 = var5.getAsJsonObject();
               JsonObject var7 = var6.getAsJsonObject("config");
               String var8 = text(var7, "id");
               if (var8.isEmpty() || !var3.add(var8) || !JsonParser.parseString(text(var6, "data")).isJsonObject()) {
                  throw new IOException("Invalid config store");
               }

               for (String var12 : new String[]{
                  "name", "description", "author", "visibility", "type", "serverName", "serverIp", "serverIconBase64", "sourceId", "publishedId"
               }) {
                  text(var7, var12);
               }

               var7.get("createdAt").getAsLong();
               var7.get("updatedAt").getAsLong();
            }

            String var14 = text(var2, "activeConfigId");
            if (!var14.isEmpty() && !var3.contains(var14)) {
               throw new IOException("Invalid selected config");
            } else {
               return var2;
            }
         } else {
            throw new IOException("Unsupported config store format");
         }
      }
   }

   private void write(JsonObject var1) throws IOException {
      byte[] var2 = JSON.toJson(var1).getBytes(StandardCharsets.UTF_8);
      if (var2.length > 33554432) {
         throw new IOException("Config store is too large");
      } else {
         Path var3 = this.directory.resolve("profiles.json");
         Path var4 = Files.createTempFile(this.directory, "profiles-", ".tmp");

         try {
            try (FileChannel var5 = FileChannel.open(var4, StandardOpenOption.WRITE)) {
               ByteBuffer var6 = ByteBuffer.wrap(var2);

               while (var6.hasRemaining()) {
                  var5.write(var6);
               }

               var5.force(true);
            }

            if (Files.exists(var3)) {
               Files.copy(var3, this.directory.resolve("profiles.json.bak"), StandardCopyOption.REPLACE_EXISTING);
            }

            try {
               Files.move(var4, var3, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException var14) {
               Files.move(var4, var3, StandardCopyOption.REPLACE_EXISTING);
            }
         } finally {
            Files.deleteIfExists(var4);
         }
      }
   }

   private static String text(JsonObject var0, String var1) {
      return var0.get(var1).getAsString();
   }

   private static String arg(String[] var0, int var1) {
      return var0 != null && var1 < var0.length && var0[var1] != null ? var0[var1] : "";
   }

   private static JsonObject find(JsonObject var0, String var1) {
      for (JsonElement var3 : var0.getAsJsonArray("profiles")) {
         JsonObject var4 = var3.getAsJsonObject();
         if (var1.equals(text(var4.getAsJsonObject("config"), "id"))) {
            return var4;
         }
      }

      return null;
   }

   private static JsonObject metadata(JsonObject var0, String var1) {
      JsonObject var2 = var0.getAsJsonObject("config").deepCopy();
      var2.addProperty("active", var1.equals(text(var2, "id")));
      return var2;
   }

   private static JsonObject success(JsonObject var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("success", true);
      var1.addProperty("error", "");
      var1.addProperty("activeConfigId", text(var0, "activeConfigId"));
      return var1;
   }

   private static JsonObject profileResponse(JsonObject var0, JsonObject var1) {
      JsonObject var2 = success(var0);
      var2.add("config", metadata(var1, text(var0, "activeConfigId")));
      var2.addProperty("data", text(var1, "data"));
      return var2;
   }

   private static JsonObject failure(String var0) {
      JsonObject var1 = new JsonObject();
      var1.addProperty("success", false);
      var1.addProperty("error", var0);
      return var1;
   }
}
