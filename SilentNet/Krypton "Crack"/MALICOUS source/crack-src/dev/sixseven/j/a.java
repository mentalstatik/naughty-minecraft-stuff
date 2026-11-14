package dev.sixseven.j;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.sixseven.SixSevenClient;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import net.fabricmc.loader.api.FabricLoader;

public final class a {
   private final Path a = FabricLoader.getInstance().getConfigDir().resolve("sixsevenclient_art.img");
   private volatile b b = dev.sixseven.j.b.a;
   private Process c;
   private BufferedWriter d;
   private volatile boolean e;
   private int f;

   public b a() {
      return this.b;
   }

   public Path b() {
      return this.a;
   }

   public void c() {
      if (!System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win")) {
         SixSevenClient.LOGGER.info("SpotifyHUD bridge disabled (not Windows)");
      } else {
         Thread var1 = new Thread(this::h, "winter-client-spotify-bridge");
         var1.setDaemon(true);
         var1.start();
      }
   }

   public synchronized void d() {
      this.e = true;
      if (this.c != null) {
         this.c.destroy();
      }
   }

   private void h() {
      while (!this.e && this.f < 4) {
         try {
            Path var1 = this.i();
            ProcessBuilder var2 = new ProcessBuilder(
               "powershell.exe", "-NoProfile", "-NonInteractive", "-ExecutionPolicy", "Bypass", "-File", var1.toString(), this.a.toString()
            );
            var2.redirectErrorStream(false);
            synchronized (this) {
               if (this.e) {
                  return;
               }

               this.c = var2.start();
               this.d = new BufferedWriter(new OutputStreamWriter(this.c.getOutputStream(), StandardCharsets.UTF_8));
            }

            String var4;
            try (BufferedReader var3 = new BufferedReader(new InputStreamReader(this.c.getInputStream(), StandardCharsets.UTF_8))) {
               while ((var4 = var3.readLine()) != null) {
                  this.a(var4.trim());
               }
            }

            this.c.waitFor();
         } catch (Exception var10) {
            SixSevenClient.LOGGER.warn("Spotify bridge died: {}", var10.toString());
         }

         this.b = dev.sixseven.j.b.a;
         this.f++;
      }
   }

   private Path i() throws Exception {
      Path var1 = FabricLoader.getInstance().getConfigDir();
      Files.createDirectories(var1);
      Path var2 = var1.resolve("sixsevenclient_smtc_bridge.ps1");

      try (InputStream var3 = a.class.getClassLoader().getResourceAsStream("assets/sixsevenclient/spotify/smtc_bridge.ps1")) {
         if (var3 == null) {
            throw new IllegalStateException("bridge script missing from mod resources");
         }

         Files.write(var2, var3.readAllBytes());
      }

      return var2;
   }

   private void a(String line) {
      if (!line.isEmpty() && line.startsWith("{")) {
         try {
            JsonObject var2 = JsonParser.parseString(line).getAsJsonObject();
            if (!var2.has("active") || !var2.get("active").getAsBoolean()) {
               this.b = dev.sixseven.j.b.a;
               return;
            }

            this.b = new b(
               true,
               var2.get("title").getAsString(),
               var2.get("artist").getAsString(),
               var2.get("posMs").getAsLong(),
               var2.get("durMs").getAsLong(),
               var2.get("playing").getAsBoolean(),
               var2.has("canSeek") && var2.get("canSeek").getAsBoolean(),
               var2.has("artV") ? var2.get("artV").getAsInt() : 0,
               var2.has("vol") ? var2.get("vol").getAsInt() : -1,
               System.nanoTime()
            );
         } catch (Exception var3) {
         }
      }
   }

   private synchronized void b(String command) {
      if (this.d != null) {
         try {
            this.d.write(command);
            this.d.newLine();
            this.d.flush();
         } catch (Exception var3) {
            SixSevenClient.LOGGER.warn("Spotify bridge command failed: {}", var3.toString());
         }
      }
   }

   public void e() {
      this.b("NEXT");
   }

   public void f() {
      this.b("PREV");
   }

   public void g() {
      this.b("PLAYPAUSE");
   }

   public void a(long ms) {
      this.b("SEEK " + Math.max(0L, ms));
      b var3 = this.b;
      if (var3.b()) {
         this.b = new b(true, var3.c(), var3.d(), ms, var3.f(), var3.g(), var3.h(), var3.i(), var3.j(), System.nanoTime());
      }
   }

   public void a(int pct) {
      int var2 = Math.clamp((long)pct, 0, 100);
      this.b("VOLUME " + var2);
      b var3 = this.b;
      if (var3.b()) {
         this.b = new b(true, var3.c(), var3.d(), var3.e(), var3.f(), var3.g(), var3.h(), var3.i(), var2, var3.k());
      }
   }
}
