package dev.sixseven.gametest;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.sixseven.SixSevenClient;
import dev.sixseven.a.b;
import dev.sixseven.b.a;
import dev.sixseven.d.e;
import dev.sixseven.d.a.I;
import dev.sixseven.m.c;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;

public class ConfigSystemGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            clearDir(var1.c());
            var1.d();

            for (int var2x = 0; var2x < 5; var2x++) {
               assertThat(!var1.b(var2x).c(), "slot " + var2x + " must start empty");
            }
         });
         String[] var3 = new String[]{null};
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            selectTheme("Blue");
            I var2x = SixSevenClient.modules().r;
            e.f var3x = SixSevenClient.modules().e;
            var2x.a(true);
            var2x.d().a(Integer.valueOf(71));
            var3x.b.a(Double.valueOf(7.0));
            assertThat(var1.c(0), "save(0) must succeed");
            assertThat(var1.b(0).c(), "slot 0 must be filled after save");
            assertThat(Files.exists(var1.c().resolve("slot1.json")), "slot1.json must exist on disk after save");
            assertThat(var1.a(0, "PvP"), "rename(0) must succeed");
            assertThat(var1.b(0).b().equals("PvP"), "slot 0 name must be PvP");
         });
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            selectTheme("Pink");
            SixSevenClient.modules().r.a(false);
            SixSevenClient.modules().r.d().a(Integer.valueOf(KeybindNone()));
            SixSevenClient.modules().e.b.a(Double.valueOf(1.0));
            assertThat(var1.d(0), "activate(0) must succeed");
            assertThat(SixSevenClient.modules().r.f(), "activate must re-enable Fullbright");
            assertThat(SixSevenClient.modules().r.d().i() == 71, "activate must restore the keybind");
            boolean var2x = Math.abs(SixSevenClient.modules().e.b.d() - 7.0F) < 0.001F;
            float var3x = SixSevenClient.modules().e.b.d();
            assertThat(var2x, "activate must restore the slider value, got " + var3x);
            assertThat(SixSevenClient.themes().a().b().equals("Blue"), "activate must restore the Blue theme");
            assertThat(var1.b() == 0, "slot 0 must be marked active");
         });
         context.runOnClient(mc -> {
            b var2x = SixSevenClient.configStore();
            String var3x = var2x.f(0);
            assertThat(var3x != null, "export(0) must return a string");
            JsonObject var4 = JsonParser.parseString(var3x).getAsJsonObject();
            assertThat("67client-config".equals(var4.get("format").getAsString()), "export must carry the format tag");
            assertThat(var4.get("version").getAsInt() == 1, "export must carry the version");
            assertThat(var4.has("state") && var4.getAsJsonObject("state").has("modules"), "export must embed the full state snapshot");
            var3[0] = var3x;
         });
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            b.a var2x = var1.b(1, "{ this is not json ]");
            assertThat(!var2x.a(), "corrupt import must fail");
            assertThat(!var1.b(1).c(), "failed import must leave slot 1 empty");
            b.a var3x = var1.b(1, "{\"hello\":\"world\"}");
            assertThat(!var3x.a(), "non-config JSON must fail import");
            assertThat(!var1.b(1).c(), "slot 1 must still be empty");
            b.a var4 = var1.b(1, "{\"format\":\"67client-config\",\"version\":2,\"state\":{\"modules\":{}}}");
            assertThat(!var4.a(), "a newer-version config must be refused");
         });
         context.runOnClient(mc -> {
            b var2x = SixSevenClient.configStore();
            b.a var3x = var2x.b(2, var3[0]);
            assertThat(var3x.a(), "valid import must succeed: " + var3x.b());
            assertThat(var2x.b(2).c(), "slot 2 must be filled after import");
            assertThat(var2x.b(2).b().equals("PvP"), "imported slot must carry the exported name, got " + var2x.b(2).b());
            var2x.a(2, "Legit");
         });
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            var1.c(3);
            var1.a(3, "Building");
         });
         context.getInput().pressKey(344);
         context.waitForScreen(a.class);
         context.waitTicks(8);
         context.takeScreenshot("config-01-menu-with-fidget");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof a var2x) {
               var2x.b().b();
            }
         });
         context.waitTicks(8);
         context.takeScreenshot("config-02-panel-slots");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof a var2x) {
               var2x.b().c(1);
            }
         });
         context.waitTicks(6);
         context.takeScreenshot("config-03-rename-field");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof a var2x) {
               var2x.b().d(3);
            }
         });
         context.waitTicks(6);
         context.takeScreenshot("config-04-overwrite-confirm");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof a var2x) {
               var2x.b().e(2);
            }
         });
         context.waitTicks(6);
         context.takeScreenshot("config-05-delete-confirm");
         context.runOnClient(mc -> {
            if (mc.field_1755 instanceof a var2x) {
               var2x.b().c();
            }
         });
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
         context.runOnClient(mc -> {
            b var1 = SixSevenClient.configStore();
            assertThat(var1.b(3).c(), "slot 3 must be filled before delete");
            assertThat(var1.e(3), "delete(3) must succeed");
            assertThat(!var1.b(3).c(), "slot 3 must be empty after delete");
            assertThat(!Files.exists(var1.c().resolve("slot4.json")), "slot4.json must be gone after delete");
            boolean var2x = var1.b(3).b().equals(b.a(3));
            String var3x = var1.b(3).b();
            assertThat(var2x, "deleted slot name must reset to default, got " + var3x);
            assertThat(var1.b() == 0, "slot 0 must still be active before its delete");
            assertThat(var1.e(0), "delete(0) must succeed");
            assertThat(var1.b() == -1, "deleting the active slot must clear active");
            assertThat(!var1.b(0).c(), "slot 0 must be empty after delete");
         });
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   private static int KeybindNone() {
      return -1;
   }

   private static void selectTheme(String name) {
      for (c var2 : SixSevenClient.themes().b()) {
         if (var2.b().equals(name)) {
            SixSevenClient.themes().a(var2);
            return;
         }
      }
   }

   private static void clearDir(Path dir) {
      try {
         if (Files.exists(dir)) {
            try (DirectoryStream var1 = Files.newDirectoryStream(dir)) {
               for (Path var3 : var1) {
                  Files.deleteIfExists(var3);
               }
            }
         }
      } catch (Exception var6) {
         throw new RuntimeException("Failed to clear config test dir", var6);
      }
   }

   private static void assertThat(boolean condition, String message) {
      if (!condition) {
         throw new AssertionError(message);
      }
   }
}
