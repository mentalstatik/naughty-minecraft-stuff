package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.b.a;
import dev.sixseven.d.d;
import dev.sixseven.d.a.G;
import dev.sixseven.d.a.k;
import dev.sixseven.d.a.l;
import dev.sixseven.d.a.s;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_437;
import net.minecraft.class_5498;

public class PortedModulesGameTest implements FabricClientGameTest {
   public void runTest(ClientGameTestContext context) {
      TestSingleplayerContext var2 = context.worldBuilder().create();

      try {
         var2.getClientWorld().waitForChunksRender();
         context.runOnClient(mc -> mc.field_1690.field_1837 = false);
         context.getInput().resizeWindow(1600, 900);
         context.waitTicks(2);
         TestServerContext var3 = var2.getServer();
         context.runOnClient(mc -> {
            d var1 = SixSevenClient.modules();
            require(var1.af != null, "FreeLook registered");
            require(var1.s != null, "AutoWalk registered");
            require(var1.ag != null, "AutoClicker registered");
            require(var1.ah != null, "CoordSnapper registered");
            require(var1.U != null, "AutoTPA registered");
            require(var1.aj != null, "ChatMacro registered");
            require(var1.ai != null, "RegionMap registered");
         });
         var3.runCommand("fill -45 0 -45 45 0 45 minecraft:stone");
         var3.runCommand("fill 6 0 6 22 0 22 minecraft:red_wool");
         var3.runCommand("fill -22 0 6 -6 0 22 minecraft:blue_wool");
         var3.runCommand("fill 6 0 -22 22 0 -6 minecraft:yellow_wool");
         var3.runCommand("fill -22 0 -22 -6 0 -6 minecraft:water");
         var3.runCommand("fill -4 0 -30 4 0 -24 minecraft:lime_wool");
         var3.runCommand("fill -4 0 24 4 0 30 minecraft:white_wool");
         var3.runCommand("fill 24 1 -4 30 3 4 minecraft:gold_block");
         var3.runCommand("fill -30 1 -4 -24 3 4 minecraft:diamond_block");
         var3.runCommand("tp @a 0 1 0");
         context.waitTicks(10);
         context.runOnClient(mc -> SixSevenClient.modules().ai.a(true));
         context.waitTicks(50);
         context.runOnClient(mc -> require(SixSevenClient.modules().ai.k(), "RegionMap produced scan data"));
         context.takeScreenshot("region-map-hud");
         context.runOnClient(mc -> {
            SixSevenClient.modules().af.a(true);
            require(mc.field_1690.method_31044() == class_5498.field_26665, "FreeLook switched to third person");
         });
         context.waitTicks(3);
         context.takeScreenshot("freelook-thirdperson-regionmap");
         context.runOnClient(mc -> SixSevenClient.modules().af.a(false));
         var3.runCommand("fill -2 1 -2 2 4 -2 minecraft:stone");
         var3.runCommand("fill -2 1 2 2 4 2 minecraft:stone");
         var3.runCommand("fill -2 1 -2 -2 4 2 minecraft:stone");
         var3.runCommand("fill 2 1 -2 2 4 2 minecraft:stone");
         var3.runCommand("tp @a 0 1 0");
         context.waitTicks(5);
         double[] var4 = new double[1];
         context.runOnClient(mc -> {
            G var1 = SixSevenClient.modules().af;
            var1.c.a(false);
            mc.field_1724.method_36457(0.0F);
            var1.a(true);
         });
         context.waitTicks(5);
         context.runOnClient(mc -> var4[0] = mc.field_1773.method_19418().method_71156().method_1022(mc.field_1724.method_5836(1.0F)));
         context.takeScreenshot("freelook-walls-off");
         double[] var5 = new double[1];
         context.runOnClient(mc -> SixSevenClient.modules().af.c.a(true));
         context.waitTicks(5);
         context.runOnClient(mc -> var5[0] = mc.field_1773.method_19418().method_71156().method_1022(mc.field_1724.method_5836(1.0F)));
         context.takeScreenshot("freelook-walls-through");
         context.runOnClient(mc -> {
            require(var4[0] < 2.5, "Through Walls off: camera clipped to the wall, got " + var4[0]);
            require(var5[0] > 3.0, "Through Walls on: camera saw through the wall, got " + var5[0]);
            require(var5[0] > var4[0] + 1.0, "Through Walls extended the camera distance");
            G var3x = SixSevenClient.modules().af;
            var3x.c.a(false);
            var3x.a(false);
         });
         var3.runCommand("fill -2 1 -2 2 4 2 minecraft:air");
         var3.runCommand("tp @a 0 1 0");
         context.waitTicks(3);
         context.runOnClient(mc -> {
            l var1 = SixSevenClient.modules().s;
            var1.a.a((String)"Simple");
            var1.b.a((String)"Forwards");
            var1.a(true);
            var1.j();
            require(mc.field_1690.field_1894.method_1434(), "AutoWalk presses forward");
            var1.a(false);
            require(!mc.field_1690.field_1894.method_1434(), "AutoWalk releases forward on disable");
         });
         context.runOnClient(mc -> {
            k var1 = SixSevenClient.modules().U;
            var1.a.a((String)"TPAHere");
            var1.b.a("Steve");
            var1.c.a(Double.valueOf(3000.0));
            var1.d.a(Double.valueOf(0.0));
            var1.a(true);
            var1.j();
            require("tpahere Steve".equals(var1.k()), "AutoTPA sent the first request, got: '" + var1.k() + "'");
            var1.b.a("Alex");
            var1.j();
            require("tpahere Steve".equals(var1.k()), "AutoTPA paced by Delay (no double-send), got: '" + var1.k() + "'");
            var1.a(false);
         });
         context.runOnClient(mc -> {
            s var1 = SixSevenClient.modules().ah;
            var1.b.a((String)"Player");
            var1.a.a((String)"X Y Z");
            var1.c.a(Integer.valueOf(80));
            var1.a(true);
            boolean var2x = var1.a(80);
            require(var2x, "CoordSnapper consumes its copy key");
            require(var1.k().equals("0 1 0"), "CoordSnapper formatted coords, got: '" + var1.k() + "'");
            var1.a(false);
         });
         context.runOnClient(mc -> mc.method_1507(new a()));
         context.waitTicks(3);
         context.takeScreenshot("clickgui-open");
         context.runOnClient(mc -> mc.method_1507((class_437)null));
         context.waitTicks(2);
      } catch (Throwable var7) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
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
