package dev.sixseven.gametest;

import dev.sixseven.SixSevenClient;
import dev.sixseven.d.d;
import dev.sixseven.d.a.A;
import dev.sixseven.d.a.C;
import net.fabricmc.fabric.api.client.gametest.v1.FabricClientGameTest;
import net.fabricmc.fabric.api.client.gametest.v1.context.ClientGameTestContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestServerContext;
import net.fabricmc.fabric.api.client.gametest.v1.context.TestSingleplayerContext;
import net.minecraft.class_2561;
import net.minecraft.class_634;

public class FakeEconomyGameTest implements FabricClientGameTest {
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
            require(var1.ak != null, "FakePay registered");
            require(var1.al != null, "FakeStats registered");
         });
         var3.runCommand("scoreboard objectives add donut dummy {\"text\":\"DonutSMP\",\"color\":\"gold\"}");
         var3.runCommand("scoreboard objectives modify donut numberformat blank");
         var3.runCommand("scoreboard objectives setdisplay sidebar donut");
         addLine(var3, "t1", "$ ", "green", "100", 6);
         addLine(var3, "t2", "* ", "light_purple", "200", 5);
         addLine(var3, "t3", "# ", "red", "300", 4);
         addLine(var3, "t4", "% ", "gray", "400", 3);
         addLine(var3, "t5", "= ", "yellow", "5m5s", 2);
         var3.runCommand("scoreboard players set play.donutsmp.net donut 1");
         context.waitTicks(5);
         context.runOnClient(mc -> {
            C var1 = SixSevenClient.modules().al;
            var1.a.a("777m");
            var1.b.a(Double.valueOf(1.0));
            var1.c.a("9,999");
            var1.d.a(Double.valueOf(2.0));
            var1.e.a("1,000");
            var1.f.a(Double.valueOf(3.0));
            var1.g.a("0");
            var1.h.a(Double.valueOf(4.0));
            var1.i.a("365d 12h");
            var1.j.a(Double.valueOf(5.0));
            var1.a(true);
            var1.l();
            require(draw(var1, "$ 100").contains("777M"), "line 1 = money abbreviated");
            require(draw(var1, "* 200").equals("* 9,999"), "line 2 = shards");
            require(draw(var1, "# 300").equals("# 1,000"), "line 3 = kills");
            require(draw(var1, "% 400").equals("% 0"), "line 4 = deaths");
            require(draw(var1, "= 5m5s").equals("= 365d 12h"), "line 5 = playtime");
            require(draw(var1, "play.donutsmp.net").equals("play.donutsmp.net"), "line 6 = footer untouched");
         });
         context.waitTicks(2);
         context.takeScreenshot("fakestats-icon-sidebar");
         context.runOnClient(mc -> {
            C var1 = SixSevenClient.modules().al;
            A var2x = SixSevenClient.modules().ak;
            var1.a.a("1m");
            var2x.c.a("$");
            var2x.b.a((String)"Both");
            var2x.a(true);
            double var3x = var1.k();
            require(var3x == 1000000.0, "live balance seeded to 1m, got " + var3x);
            mc.field_1724.field_3944.method_45730("pay Notch 250k");
            require(var1.k() == 750000.0, "pay deducted 250k: 1m -> " + var1.k());
         });
         context.waitTicks(2);
         context.takeScreenshot("fakepay-paid-newcolors");
         context.runOnClient(mc -> {
            C var1 = SixSevenClient.modules().al;
            mc.field_1724.field_3944.method_45730("pay Notch 999m");
            require(var1.k() == 750000.0, "insufficient pay left balance untouched");
            class_634 var2x = mc.field_1724.field_3944;
            String var3x = mc.field_1724.method_7334().name();
            var2x.method_45730("pay " + var3x + " 1");
            require(var1.k() == 750000.0, "self-pay blocked");
         });
         context.runOnClient(mc -> mc.field_1724.field_3944.method_45730("bal"));
         context.waitTicks(2);
         context.takeScreenshot("fakestats-bal-command");
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

   private static void addLine(TestServerContext server, String team, String prefix, String color, String holder, int score) {
      server.runCommand("team add " + team);
      server.runCommand("team modify " + team + " prefix {\"text\":\"" + prefix + "\",\"color\":\"" + color + "\"}");
      server.runCommand("team join " + team + " " + holder);
      server.runCommand("scoreboard players set " + holder + " donut " + score);
   }

   private static String draw(C fs, String line) {
      return fs.b(class_2561.method_43470(line)).getString();
   }

   private static void require(boolean condition, String what) {
      if (!condition) {
         throw new AssertionError("FAILED: " + what);
      }
   }
}
