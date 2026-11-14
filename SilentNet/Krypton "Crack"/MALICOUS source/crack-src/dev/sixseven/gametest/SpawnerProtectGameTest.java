package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.a.ae;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_2338;
import net.minecraft.class_437;

public class SpawnerProtectGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> {
            ae var1 = SixSevenClient.modules().ap;
            require(var1 != null, "SpawnerProtect registered");
            require(var1.a.e() == 3, "default Stacks To Deposit = 3");
            require(var1.b.i() == 64.0, "default Trigger Range = 64");
            require(var1.f.i() == 5.5, "default Break Range = 5.5");
            require(var1.d.i(), "Detect Block Updates on by default");
            require(!var1.f(), "starts disabled");
         });
         var3.runCommand("fill 100 0 -25 200 0 25 minecraft:stone");
         var3.runCommand("setblock 152 1 0 minecraft:spawner");
         var3.runCommand("setblock 148 1 0 minecraft:spawner");
         var3.runCommand("setblock 150 2 0 minecraft:spawner");
         var3.runCommand("setblock 150 1 3 minecraft:ender_chest");
         var3.runCommand("tp @a 150 1 0");
         context.waitTicks(40);
         var2.getClientWorld().waitForChunksRender();
         context.takeScreenshot("spawnerprotect-scene");
         context.runOnClient(mc -> {
            ae var1 = SixSevenClient.modules().ap;
            var1.a(true);
            require(!var1.k(), "arms un-triggered");
            require(var1.l().equals("WAITING_FOR_STRANGER"), "starts waiting, got " + var1.l());
            var1.a(Integer.MAX_VALUE, new class_2338(170, 1, 0));
            require(var1.k(), "break packet detected a stranger");
            require(var1.l().equals("WORKING"), "advanced to WORKING, got " + var1.l());
            var1.j();
            require(mc.field_1690.field_1832.method_1434(), "holds the sneak key while working");
         });
         context.takeScreenshot("spawnerprotect-working");
         context.runOnClient(mc -> {
            ae var1 = SixSevenClient.modules().ap;
            var1.a(false);
            require(!mc.field_1690.field_1832.method_1434(), "releases sneak key on disable");
            require(!mc.field_1690.field_1894.method_1434(), "releases forward key on disable");
         });
         var3.runCommand("tp @a 0 100 0");
         context.waitTicks(10);
         context.runOnClient(mc -> {
            ae var1 = SixSevenClient.modules().ap;
            require(Math.abs(mc.field_1724.method_23317()) < 100.0 && Math.abs(mc.field_1724.method_23321()) < 100.0, "player is at spawn");
            var1.a(true);
            var1.a(Integer.MAX_VALUE, new class_2338(20, 100, 0));
            require(!var1.k(), "detection suppressed inside the spawn safe-zone");
            var1.a(false);
         });
         context.runOnClient(mc -> mc.method_1507(new a()));
         context.waitTicks(3);
         context.takeScreenshot("spawnerprotect-clickgui");
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitTicks(2);
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
