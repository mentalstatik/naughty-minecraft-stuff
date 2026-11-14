package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.a.B;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_2561;

public class FakeRolesGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1280, 720);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> require(SixSevenClient.modules().am != null, "FakeRoles registered"));
         context.runOnClient(
            mc -> {
               B var1 = SixSevenClient.modules().am;
               var1.a(true);
               String var2x = mc.field_1724.method_7334().name();
               var1.e.a((String)"SR.MOD");
               String var3x = var1.b(class_2561.method_43470(var2x + ": gg")).getString();
               require(var3x.equals("[SR.MOD] " + var2x + ": gg"), "SR.MOD chat, got: " + var3x);
               var1.e.a((String)"MEDIA");
               require(var1.b(class_2561.method_43470(var2x + ": gg")).getString().startsWith("[MEDIA] "), "MEDIA chat tag");
               var1.e.a((String)"SR.ADMIN");
               require(var1.b(class_2561.method_43470(var2x + ": gg")).getString().startsWith("[SR.ADMIN] "), "SR.ADMIN chat tag");
               var1.e.a((String)"MEDIA");
               require(
                  var1.b(class_2561.method_43470("<" + var2x + "> hi")).getString().equals("<[MEDIA] " + var2x + "> hi"),
                  "tag spliced right before a mid-line name"
               );
               require(var1.a(class_2561.method_43470(var2x), var2x).getString().equals("[MEDIA] " + var2x), "tab decorated for self");
               require(var1.a(class_2561.method_43470("Notch"), "Notch").getString().equals("Notch"), "tab NOT decorated for others");
               var1.e.a((String)"None");
               require(var1.b(class_2561.method_43470(var2x + ": gg")).getString().equals(var2x + ": gg"), "None role adds nothing");
            }
         );
         context.runOnClient(mc -> {
            B var1 = SixSevenClient.modules().am;
            String var2x = mc.field_1724.method_7334().name();
            var1.e.a((String)"SR.MOD");
            mc.field_1705.method_1743().method_1812(class_2561.method_43470(var2x + ": sr.mod flex"));
            var1.e.a((String)"MEDIA");
            mc.field_1705.method_1743().method_1812(class_2561.method_43470(var2x + ": media flex"));
            var1.e.a((String)"SR.ADMIN");
            mc.field_1705.method_1743().method_1812(class_2561.method_43470(var2x + ": sr.admin flex"));
         });
         context.waitTicks(4);
         context.takeScreenshot("fakeroles-chat-all-roles");
         var3.runCommand("scoreboard objectives add tabinfo dummy {\"text\":\"Players\"}");
         var3.runCommand("scoreboard objectives modify tabinfo numberformat blank");
         var3.runCommand("scoreboard objectives setdisplay list tabinfo");
         context.waitTicks(3);
         shootTab(context, "SR.MOD", "fakeroles-tab-srmod-green");
         shootTab(context, "MEDIA", "fakeroles-tab-media-pink");
         shootTab(context, "SR.ADMIN", "fakeroles-tab-sradmin-red");
         context.runOnClient(mc -> mc.field_1690.field_1907.method_23481(false));
         context.runOnClient(mc -> {
            SixSevenClient.modules().am.e.a((String)"MEDIA");
            a.a().a("FakeRoles@MISC", true);
         });
         context.getInput().pressKey(344);
         context.waitForScreen(a.class);
         context.waitTicks(8);
         context.takeScreenshot("fakeroles-settings-panel");
         context.runOnClient(mc -> a.a().a("FakeRoles@MISC", false));
         context.getInput().pressKey(344);
         context.waitForScreen((Class)null);
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

   private static void shootTab(ClientGameTestContext context, String role, String shot) {
      context.runOnClient(mc -> {
         B var2 = SixSevenClient.modules().am;
         var2.e.a((String)role);
         var2.a(true);
         mc.field_1690.field_1907.method_23481(true);
      });
      context.waitTicks(3);
      context.takeScreenshot(shot);
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
