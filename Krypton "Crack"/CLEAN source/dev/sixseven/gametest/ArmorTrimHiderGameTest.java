package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.a.d;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_5498;
import net.minecraft.class_8053;

public class ArmorTrimHiderGameTest implements FabricClientGameTest {
   private static final String TRIM = "[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]";

   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1280, 720);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> require(SixSevenClient.modules().ao != null, "ArmorTrimHider registered"));
         var3.runCommand("gamemode creative @a");
         var3.runCommand("time set day");
         var3.runCommand("weather clear");
         var3.runCommand("fill -8 0 -8 8 0 8 minecraft:white_concrete");
         var3.runCommand("tp @a 0 1 0 0 0");
         var3.runCommand(
            "item replace entity @a armor.head with minecraft:diamond_helmet[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @a armor.chest with minecraft:diamond_chestplate[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @a armor.legs with minecraft:diamond_leggings[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @a armor.feet with minecraft:diamond_boots[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand("summon minecraft:armor_stand 2.5 1 3.5 {ShowArms:1b,NoGravity:1b,Rotation:[180f,0f]}");
         var3.runCommand(
            "item replace entity @e[type=armor_stand,limit=1] armor.head with minecraft:diamond_helmet[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @e[type=armor_stand,limit=1] armor.chest with minecraft:diamond_chestplate[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @e[type=armor_stand,limit=1] armor.legs with minecraft:diamond_leggings[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         var3.runCommand(
            "item replace entity @e[type=armor_stand,limit=1] armor.feet with minecraft:diamond_boots[minecraft:trim={material:\"minecraft:gold\",pattern:\"minecraft:sentry\"}]"
         );
         context.runOnClient(mc -> {
            mc.field_1690.method_31043(class_5498.field_26665);
            SixSevenClient.modules().d.a(false);
            SixSevenClient.modules().ao.a(false);
         });
         context.waitTicks(10);
         context.takeScreenshot("atrim-01-baseline");
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules().ao;
            var1.a.a((String)"Hide");
            var1.b.a(true);
            var1.a(true);
            class_1799 var2x = new class_1799(class_1802.field_8058);
            class_8053 var3x = var1.a(var2x, (class_8053)null);
            require(var1.a(var2x, var3x) == null, "Hide maps trim to null");
         });
         context.waitTicks(5);
         context.takeScreenshot("atrim-02-hide-all");
         context.runOnClient(mc -> SixSevenClient.modules().ao.b.a(false));
         context.waitTicks(5);
         context.takeScreenshot("atrim-03-hide-others-only");
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules().ao;
            var1.a.a((String)"Random");
            var1.b.a(true);
            class_1799 var2x = new class_1799(class_1802.field_8285);
            class_8053 var3x = var1.a(var2x, (class_8053)null);
            class_8053 var4 = var1.a(var2x, (class_8053)null);
            require(var3x != null, "Random adds a trim to untrimmed armor");
            require(var3x.equals(var4), "Random is stable for the same item");
         });
         context.waitTicks(5);
         context.takeScreenshot("atrim-04-random");
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

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
