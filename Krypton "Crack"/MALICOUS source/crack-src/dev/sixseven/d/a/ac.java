package dev.sixseven.d.a;

import com.google.common.collect.LinkedHashMultimap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import dev.sixseven.SixSevenClient;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.minecraft.class_310;
import net.minecraft.class_8685;

public class ac extends dev.sixseven.d.c {
   private static final HttpClient c = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(8L)).build();
   public final dev.sixseven.i.i a = this.a(new dev.sixseven.i.i("Skin IGN", "Username whose skin is applied", "67skibidi", 16, "Type a username…"));
   public final dev.sixseven.i.f b = this.a(new dev.sixseven.i.f("Apply To", "Whose skin gets replaced", "Everyone", "Everyone", "Others", "Self"));
   private volatile class_8685 d;
   private volatile String e = "";
   private volatile boolean f;

   public ac() {
      super("SkinProtect", "Replaces skins so clips can't dox skins", dev.sixseven.d.b.c);
   }

   @Override
   protected void h() {
      if (this.d == null) {
         this.e = "";
      }

      this.l();
   }

   @Override
   public void j() {
      this.l();
   }

   public class_8685 k() {
      return this.d;
   }

   public boolean a(UUID uuid) {
      if (uuid == null) {
         return false;
      } else {
         class_310 var2 = class_310.method_1551();
         UUID var3 = var2.field_1724 == null ? null : var2.field_1724.method_5667();
         if (this.b.a("Everyone")) {
            return true;
         } else {
            return this.b.a("Self") ? var3 != null && var3.equals(uuid) : var3 == null || !var3.equals(uuid);
         }
      }
   }

   private void l() {
      String var1 = this.a.i().trim();
      if (!var1.isEmpty() && !this.f && !var1.equalsIgnoreCase(this.e)) {
         this.f = true;
         this.e = var1;
         CompletableFuture.runAsync(() -> this.a(var1)).whenComplete((v, t) -> this.f = false);
      }
   }

   private void a(String username) {
      try {
         JsonObject var2 = b("https://api.mojang.com/users/profiles/minecraft/" + username);
         if (var2 == null || !var2.has("id")) {
            SixSevenClient.LOGGER.warn("[SkinProtect] Unknown username: {}", username);
            return;
         }

         UUID var3 = c(var2.get("id").getAsString());
         String var4 = var2.has("name") ? var2.get("name").getAsString() : username;
         String var5 = var3.toString();
         String var6 = "-";
         JsonObject var7 = b("https://sessionserver.mojang.com/session/minecraft/profile/" + var5.replace(var6, "") + "?unsigned=false");
         if (var7 == null || !var7.has("properties")) {
            SixSevenClient.LOGGER.warn("[SkinProtect] No profile textures for {}", username);
            return;
         }

         LinkedHashMultimap var8 = LinkedHashMultimap.create();

         for (JsonElement var10 : var7.getAsJsonArray("properties")) {
            JsonObject var11 = var10.getAsJsonObject();
            if ("textures".equals(var11.get("name").getAsString())) {
               String var12 = var11.get("value").getAsString();
               String var13 = var11.has("signature") ? var11.get("signature").getAsString() : null;
               var8.put("textures", var13 == null ? new Property("textures", var12) : new Property("textures", var12, var13));
            }
         }

         GameProfile var15 = new GameProfile(var3, var4, new PropertyMap(var8));
         class_310.method_1551().method_1582().method_52863(var15).thenAccept(opt -> {
            if (opt.isPresent()) {
               this.d = (class_8685)opt.get();
               SixSevenClient.LOGGER.info("[SkinProtect] Loaded skin for {}", var4);
            } else {
               SixSevenClient.LOGGER.warn("[SkinProtect] Could not load skin texture for {}", var4);
            }
         });
      } catch (Exception var14) {
         SixSevenClient.LOGGER.warn("[SkinProtect] Failed to fetch skin for {}: {}", username, var14.toString());
      }
   }

   private static JsonObject b(String url) throws Exception {
      HttpRequest var1 = HttpRequest.newBuilder(URI.create(url)).timeout(Duration.ofSeconds(8L)).header("Accept", "application/json").GET().build();
      HttpResponse var2 = c.send(var1, BodyHandlers.ofString());
      return var2.statusCode() == 200 && var2.body() != null && !((String)var2.body()).isBlank()
         ? JsonParser.parseString((String)var2.body()).getAsJsonObject()
         : null;
   }

   private static UUID c(String undashed) {
      return UUID.fromString(undashed.replaceFirst("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", "$1-$2-$3-$4-$5"));
   }
}
